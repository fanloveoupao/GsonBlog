package bruse.com.gsonblog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import bruse.com.gsonblog.model.Model;
import bruse.com.gsonblog.model.ResultModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 采用GET的请求方式
     */
    public void getMovies(View view) {
        String url = "http://apicloud.mob.com/boxoffice/day/query";
        RequestParams params = new RequestParams();
        params.addQueryStringParameter("key", "11342cf45e16c");
        params.addQueryStringParameter("area", "CN");
        HttpUtils httpUtils = new HttpUtils();
        httpUtils.send(HttpRequest.HttpMethod.GET, url, params, new RequestCallBack<String>() {

            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                Log.i("TAG", responseInfo.result);
                Gson gson = new Gson();
//                Type listType = new TypeToken<LinkedList<Model>>(){}.getType();
                Type type = new TypeToken<Model>() {}.getType();
                Model model = gson.fromJson(responseInfo.result, type);
                List<ResultModel> result = model.getResults();
                Log.i("TAG", model.getRetCode());
                Log.i("TAG", model.getMsg());
                if ("success".equals("success")) {
                    for (int i = 0; i < result.size(); i++) {
                        Log.i("TAG", result.get(i).getCur() + "测试");
                        Log.i("TAG", result.get(i).getDays() + "");
                        Log.i("TAG", result.get(i).getName());
                        Log.i("TAG", result.get(i).getSum() + "");
                    }
                }


            }

            @Override
            public void onFailure(HttpException error, String msg) {

            }
        });

    }

}
