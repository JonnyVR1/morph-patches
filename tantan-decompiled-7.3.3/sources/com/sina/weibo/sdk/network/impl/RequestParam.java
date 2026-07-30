package com.sina.weibo.sdk.network.impl;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.network.IRequestIntercept;
import com.sina.weibo.sdk.network.IRequestParam;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class RequestParam implements IRequestParam {
    public static final String KEY_PARAM_BODY_BYTE_ARRAY = "body_byte_array";
    private Context appContext;
    private boolean defaultHost;
    private boolean gZip;
    private ArrayList<IRequestIntercept> interceptList;
    private HashMap<String, Object> interceptResult;
    private boolean needIntercept;
    private int requestTimeout;
    private IRequestParam.RequestType requestType;
    private int responseTimeout;
    private String shortUrl;
    private Bundle getBundle = new Bundle();
    private Bundle postBundle = new Bundle();
    private Bundle headerBundle = new Bundle();
    private Bundle extraBundle = new Bundle();
    private Map<String, IRequestParam.ValuePart<File>> files = new HashMap();
    private Map<String, byte[]> byteArrays = new HashMap();

    public RequestParam(Builder builder) {
        this.interceptList = new ArrayList<>();
        this.gZip = false;
        this.requestTimeout = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        this.responseTimeout = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        this.needIntercept = true;
        this.shortUrl = builder.shortUrl;
        this.getBundle.putAll(builder.getBundle);
        this.postBundle.putAll(builder.postBundle);
        this.requestType = builder.type;
        this.headerBundle.putAll(builder.headerBundle);
        this.extraBundle.putAll(builder.extraBundle);
        this.defaultHost = builder.defaultHost;
        this.files.putAll(builder.files);
        this.byteArrays.putAll(builder.byteArrays);
        this.needIntercept = builder.needIntercept;
        this.appContext = builder.appContext;
        this.interceptResult = new HashMap<>();
        this.interceptList = builder.interceptList;
        this.gZip = builder.gZip;
        this.requestTimeout = builder.requestTimeout;
        this.responseTimeout = builder.responseTimeout;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public void addInterceptResult(String str, Object obj) {
        this.interceptResult.put(str, obj);
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public Map<String, byte[]> byteArrays() {
        return this.byteArrays;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public Map<String, IRequestParam.ValuePart<File>> files() {
        return this.files;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public Context getContext() {
        return this.appContext;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public Bundle getExtraBundle() {
        return this.extraBundle;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public Bundle getGetBundle() {
        return this.getBundle;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public Bundle getHeader() {
        return this.headerBundle;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public ArrayList<IRequestIntercept> getIntercept() {
        return this.interceptList;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public Object getInterceptResult(String str) {
        return this.interceptResult.get(str);
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public IRequestParam.RequestType getMethod() {
        return this.requestType;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public Bundle getPostBundle() {
        return this.postBundle;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public int getRequestTimeout() {
        return this.requestTimeout;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public int getResponseTimeout() {
        return this.responseTimeout;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public String getUrl() {
        return this.shortUrl;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public boolean needGzip() {
        return false;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public boolean needIntercept() {
        return this.needIntercept;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public void setUrl(String str) {
        this.shortUrl = str;
    }

    @Override // com.sina.weibo.sdk.network.IRequestParam
    public boolean useDefaultHost() {
        return this.defaultHost;
    }

    public static final class Builder {
        Context appContext;
        String shortUrl;
        Bundle getBundle = new Bundle();
        Bundle postBundle = new Bundle();
        Bundle extraBundle = new Bundle();
        IRequestParam.RequestType type = IRequestParam.RequestType.POST;
        Bundle headerBundle = new Bundle();
        boolean defaultHost = true;
        ArrayList<IRequestIntercept> interceptList = new ArrayList<>();
        private Map<String, IRequestParam.ValuePart<File>> files = new HashMap();
        private Map<String, byte[]> byteArrays = new HashMap();
        boolean needIntercept = true;
        boolean gZip = false;
        private int requestTimeout = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        private int responseTimeout = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;

        public Builder(Context context) {
            this.appContext = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder addBodyParam(String str, File file, String str2) {
            IRequestParam.ValuePart<File> valuePart = new IRequestParam.ValuePart<>();
            valuePart.value = file;
            valuePart.mimeType = str2;
            this.files.put(str, valuePart);
            return this;
        }

        public void addExtParam(String str, String str2) {
            this.extraBundle.putString(str, str2);
        }

        public void addGetParam(String str, String str2) {
            this.getBundle.putString(str, str2);
        }

        public void addHeader(String str, String str2) {
            this.headerBundle.putString(str, str2);
        }

        public void addIntercept(IRequestIntercept iRequestIntercept) {
            this.interceptList.add(iRequestIntercept);
        }

        public void addPostParam(String str, String str2) {
            this.postBundle.putString(str, str2);
        }

        public RequestParam build() {
            return new RequestParam(this);
        }

        public void defaultHostEnable(boolean z) {
            this.defaultHost = z;
        }

        public void setNeedIntercept(boolean z) {
            this.needIntercept = z;
        }

        public void setRequestTimeout(int i) {
            this.requestTimeout = i;
        }

        public void setRequestType(IRequestParam.RequestType requestType) {
            this.type = requestType;
        }

        public void setResponseTimeout(int i) {
            this.responseTimeout = i;
        }

        public void setShortUrl(String str) {
            this.shortUrl = str;
        }

        public void setgZip(boolean z) {
            this.gZip = z;
        }

        public void addExtParam(String str, int i) {
            this.extraBundle.putInt(str, i);
        }

        public void addGetParam(String str, int i) {
            this.getBundle.putInt(str, i);
        }

        public void addPostParam(String str, int i) {
            this.postBundle.putInt(str, i);
        }

        public void addExtParam(String str, long j) {
            this.extraBundle.putLong(str, j);
        }

        public void addGetParam(String str, long j) {
            this.getBundle.putLong(str, j);
        }

        public void addPostParam(String str, long j) {
            this.postBundle.putLong(str, j);
        }

        public void addExtParam(Bundle bundle) {
            this.extraBundle.putAll(bundle);
        }

        public void addGetParam(Bundle bundle) {
            this.getBundle.putAll(bundle);
        }

        public void addPostParam(Bundle bundle) {
            this.postBundle.putAll(bundle);
        }

        public void addBodyParam(byte[] bArr) {
            this.postBundle.putByteArray(RequestParam.KEY_PARAM_BODY_BYTE_ARRAY, bArr);
        }

        public Builder addBodyParam(String str, byte[] bArr) {
            this.byteArrays.put(str, bArr);
            return this;
        }
    }
}
