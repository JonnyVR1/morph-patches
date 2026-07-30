package com.sina.weibo.sdk.net;

import android.content.Context;
import android.os.AsyncTask;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.utils.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class AsyncWeiboRunner {
    private Context mContext;

    public static class RequestRunner extends AsyncTask<Void, Void, AsyncTaskResult<String>> {
        private final Context mContext;
        private final String mHttpMethod;
        private final RequestListener mListener;
        private final WeiboParameters mParams;
        private final String mUrl;

        public RequestRunner(Context context, String str, WeiboParameters weiboParameters, String str2, RequestListener requestListener) {
            this.mContext = context;
            this.mUrl = str;
            this.mParams = weiboParameters;
            this.mHttpMethod = str2;
            this.mListener = requestListener;
        }

        @Override // android.os.AsyncTask
        public AsyncTaskResult<String> doInBackground(Void... voidArr) {
            try {
                return new AsyncTaskResult<>(HttpManager.openUrl(this.mContext, this.mUrl, this.mHttpMethod, this.mParams));
            } catch (WeiboException e) {
                LogUtil.m80479e("ContentValues", e.getMessage());
                return new AsyncTaskResult<>(e);
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(AsyncTaskResult<String> asyncTaskResult) {
            WeiboException error = asyncTaskResult.getError();
            RequestListener requestListener = this.mListener;
            if (error != null) {
                requestListener.onWeiboException(error);
            } else {
                requestListener.onComplete(asyncTaskResult.getResult());
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public AsyncWeiboRunner(Context context) {
        this.mContext = context;
    }

    private void addAction(Context context, String str) {
        try {
            Class.forName("com.sina.weibo.sdk.cmd.WbAppActivator").getMethod("getInstance", Context.class, String.class).invoke(null, context, str).getClass().getMethod("activateApp", null).invoke(null, null);
        } catch (Exception unused) {
        }
    }

    public String request(String str, boolean z, String str2, String str3, WeiboParameters weiboParameters, String str4) throws WeiboException {
        if (!z) {
            return request(str3, weiboParameters, str4);
        }
        weiboParameters.put("source", str);
        weiboParameters.setAnonymousCookie(str2);
        return request(str3, weiboParameters, str4);
    }

    public void request4RdirectURL(final String str, final WeiboParameters weiboParameters, final String str2, final RequestListener requestListener) {
        new Thread() { // from class: com.sina.weibo.sdk.net.AsyncWeiboRunner.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    String strOpenRedirectUrl4LocationUri = HttpManager.openRedirectUrl4LocationUri(AsyncWeiboRunner.this.mContext, str, str2, weiboParameters);
                    RequestListener requestListener2 = requestListener;
                    if (requestListener2 != null) {
                        requestListener2.onComplete(strOpenRedirectUrl4LocationUri);
                    }
                } catch (WeiboException e) {
                    RequestListener requestListener3 = requestListener;
                    if (requestListener3 != null) {
                        requestListener3.onWeiboException(e);
                    }
                }
            }
        }.start();
    }

    public void requestAsync(String str, WeiboParameters weiboParameters, String str2, RequestListener requestListener) {
        addAction(this.mContext, weiboParameters.getAppKey());
        new RequestRunner(this.mContext, str, weiboParameters, str2, requestListener).execute(null);
    }

    @Deprecated
    public void requestByThread(final String str, final WeiboParameters weiboParameters, final String str2, final RequestListener requestListener) {
        new Thread() { // from class: com.sina.weibo.sdk.net.AsyncWeiboRunner.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    String strOpenUrl = HttpManager.openUrl(AsyncWeiboRunner.this.mContext, str, str2, weiboParameters);
                    RequestListener requestListener2 = requestListener;
                    if (requestListener2 != null) {
                        requestListener2.onComplete(strOpenUrl);
                    }
                } catch (WeiboException e) {
                    RequestListener requestListener3 = requestListener;
                    if (requestListener3 != null) {
                        requestListener3.onWeiboException(e);
                    }
                }
            }
        }.start();
    }

    public static class AsyncTaskResult<T> {
        private WeiboException error;
        private T result;

        public AsyncTaskResult(T t) {
            this.result = t;
        }

        public WeiboException getError() {
            return this.error;
        }

        public T getResult() {
            return this.result;
        }

        public AsyncTaskResult(WeiboException weiboException) {
            this.error = weiboException;
        }
    }

    public String request(String str, WeiboParameters weiboParameters, String str2) throws WeiboException {
        addAction(this.mContext, weiboParameters.getAppKey());
        return HttpManager.openUrl(this.mContext, str, str2, weiboParameters);
    }

    public void requestAsync(String str, boolean z, String str2, String str3, WeiboParameters weiboParameters, String str4, RequestListener requestListener) {
        if (z) {
            weiboParameters.put("source", str);
            weiboParameters.setAnonymousCookie(str2);
            requestAsync(str3, weiboParameters, str4, requestListener);
            return;
        }
        requestAsync(str3, weiboParameters, str4, requestListener);
    }
}
