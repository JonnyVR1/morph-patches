package com.sina.weibo.sdk.network.impl;

import android.os.AsyncTask;
import android.os.Bundle;
import com.sina.weibo.sdk.net.NetStateManager;
import com.sina.weibo.sdk.network.IRequestIntercept;
import com.sina.weibo.sdk.network.IRequestParam;
import com.sina.weibo.sdk.network.RequestCancelable;
import com.sina.weibo.sdk.network.base.RequestResult;
import com.sina.weibo.sdk.network.base.WbResponse;
import com.sina.weibo.sdk.network.exception.InterceptException;
import com.sina.weibo.sdk.network.exception.SdkException;
import com.sina.weibo.sdk.network.intercept.GlobalInterceptHelper;
import com.sina.weibo.sdk.network.target.Target;
import com.sina.weibo.sdk.utils.LogUtil;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RequestTask<T, R> extends AsyncTask<Object, Object, RequestResult> implements RequestCancelable {
    private IRequestParam param;
    Class<T> tClass;
    private Target<R> target;

    public RequestTask(IRequestParam iRequestParam, Target<R> target) {
        this.param = iRequestParam;
        this.target = target;
    }

    @Override // com.sina.weibo.sdk.network.RequestCancelable
    public void cancelRequest() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.AsyncTask
    public RequestResult doInBackground(Object... objArr) {
        RequestResult requestResult = new RequestResult();
        if (!NetStateManager.isNetworkConnected(this.param.getContext())) {
            LogUtil.m10830e("Task", "RequestTask:android.permission.ACCESS_NETWORK_STATE");
            requestResult.setE(new SdkException("android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.param.needIntercept()) {
            try {
                Bundle bundle = new Bundle();
                HashMap<String, IRequestIntercept> globalIntercept = GlobalInterceptHelper.init().getGlobalIntercept();
                Iterator<String> it = globalIntercept.keySet().iterator();
                while (it.hasNext()) {
                    IRequestIntercept iRequestIntercept = globalIntercept.get(it.next());
                    if (iRequestIntercept != null && iRequestIntercept.needIntercept(this.param, bundle)) {
                        iRequestIntercept.doIntercept(this.param, bundle);
                    }
                }
                for (IRequestIntercept iRequestIntercept2 : this.param.getIntercept()) {
                    if (iRequestIntercept2.needIntercept(this.param, bundle)) {
                        iRequestIntercept2.doIntercept(this.param, bundle);
                    }
                }
                this.param.getPostBundle().putAll(bundle);
            } catch (InterceptException e) {
                requestResult.setE(e);
                return requestResult;
            }
        }
        try {
            WbResponse wbResponseRequest = RequestEngine.request(this.param);
            R rTransResponse = this.target.transResponse(wbResponseRequest);
            this.target.onRequestSuccessBg(rTransResponse);
            requestResult.setResponse(rTransResponse);
            try {
                InputStream inputStreamByteStream = wbResponseRequest.body().byteStream();
                if (inputStreamByteStream != null) {
                    inputStreamByteStream.close();
                }
            } catch (Exception unused) {
            }
        } catch (Exception e2) {
            requestResult.setE(e2);
        }
        return requestResult;
    }

    @Override // com.sina.weibo.sdk.network.RequestCancelable
    public boolean isCancelRequest() {
        return false;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(RequestResult requestResult) {
        super.onPostExecute(requestResult);
        Target<R> target = this.target;
        if (target != null) {
            target.onRequestDone();
            Exception e = requestResult.getE();
            Target<R> target2 = this.target;
            if (e == null) {
                target2.onRequestSuccess((R) requestResult.getResponse());
            } else {
                target2.onFailure(requestResult.getE());
                this.target.onError();
            }
        }
    }
}
