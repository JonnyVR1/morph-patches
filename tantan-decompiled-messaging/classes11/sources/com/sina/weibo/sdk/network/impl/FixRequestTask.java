package com.sina.weibo.sdk.network.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
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
public class FixRequestTask<T, R> implements Runnable, RequestCancelable {
    private FixRequestTask<T, R>.RequestCallback callback = new RequestCallback();
    private IRequestParam param;
    Class<T> tClass;
    private Target<R> target;

    public class RequestCallback implements Handler.Callback {
        private RequestCallback() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            RequestResult requestResult = (RequestResult) message.obj;
            if (FixRequestTask.this.target == null) {
                return false;
            }
            FixRequestTask.this.target.onRequestDone();
            Exception e = requestResult.getE();
            FixRequestTask fixRequestTask = FixRequestTask.this;
            if (e == null) {
                fixRequestTask.target.onRequestSuccess(requestResult.getResponse());
                return false;
            }
            fixRequestTask.target.onFailure(requestResult.getE());
            FixRequestTask.this.target.onError();
            return false;
        }
    }

    public FixRequestTask(IRequestParam iRequestParam, Target<R> target) {
        this.param = iRequestParam;
        this.target = target;
    }

    @Override // com.sina.weibo.sdk.network.RequestCancelable
    public void cancelRequest() {
        run();
    }

    @Override // com.sina.weibo.sdk.network.RequestCancelable
    public boolean isCancelRequest() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        RequestResult requestResult = new RequestResult();
        if (!NetStateManager.isNetworkConnected(this.param.getContext())) {
            LogUtil.m10830e("Task", "FixRequestTask:android.permission.ACCESS_NETWORK_STATE");
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
                this.param.getGetBundle().putAll(bundle);
                this.param.getPostBundle().putAll(bundle);
            } catch (InterceptException e) {
                LogUtil.m10830e("Task", "FixRequestTask:" + e.getMessage());
                requestResult.setE(e);
                Handler handler = new Handler(Looper.getMainLooper(), this.callback);
                Message message = new Message();
                message.obj = requestResult;
                handler.sendMessage(message);
                return;
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
        Handler handler2 = new Handler(Looper.getMainLooper(), this.callback);
        Message message2 = new Message();
        message2.obj = requestResult;
        handler2.sendMessage(message2);
    }
}
