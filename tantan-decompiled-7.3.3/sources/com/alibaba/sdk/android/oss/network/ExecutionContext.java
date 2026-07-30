package com.alibaba.sdk.android.oss.network;

import android.content.Context;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.callback.OSSRetryCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import p153l.rg50;

/* JADX INFO: loaded from: classes.dex */
public class ExecutionContext<Request extends OSSRequest, Result extends OSSResult> {
    private Context applicationContext;
    private CancellationHandler cancellationHandler;
    private rg50 client;
    private OSSCompletedCallback completedCallback;
    private OSSProgressCallback progressCallback;
    private Request request;
    private OSSRetryCallback retryCallback;

    public ExecutionContext(rg50 rg50Var, Request request, Context context) {
        this.cancellationHandler = new CancellationHandler();
        setClient(rg50Var);
        setRequest(request);
        this.applicationContext = context;
    }

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public CancellationHandler getCancellationHandler() {
        return this.cancellationHandler;
    }

    public rg50 getClient() {
        return this.client;
    }

    public OSSCompletedCallback<Request, Result> getCompletedCallback() {
        return this.completedCallback;
    }

    public OSSProgressCallback getProgressCallback() {
        return this.progressCallback;
    }

    public Request getRequest() {
        return this.request;
    }

    public OSSRetryCallback getRetryCallback() {
        return this.retryCallback;
    }

    public void setClient(rg50 rg50Var) {
        this.client = rg50Var;
    }

    public void setCompletedCallback(OSSCompletedCallback<Request, Result> oSSCompletedCallback) {
        this.completedCallback = oSSCompletedCallback;
    }

    public void setProgressCallback(OSSProgressCallback oSSProgressCallback) {
        this.progressCallback = oSSProgressCallback;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public void setRetryCallback(OSSRetryCallback oSSRetryCallback) {
        this.retryCallback = oSSRetryCallback;
    }

    public ExecutionContext(rg50 rg50Var, Request request) {
        this(rg50Var, request, null);
    }
}
