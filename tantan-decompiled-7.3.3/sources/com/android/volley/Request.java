package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import p153l.b3d0;
import p153l.cl20;
import p153l.j6d0;
import p153l.u1d0;
import p153l.wrd;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Request<T> implements Comparable<Request<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";

    @Nullable
    private InterfaceC0919a.a mCacheEntry;

    @GuardedBy("mLock")
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;

    @Nullable
    @GuardedBy("mLock")
    private C0922d.a mErrorListener;
    private final C0923e.a mEventLog;
    private final Object mLock;
    private final int mMethod;

    @GuardedBy("mLock")
    private InterfaceC0918b mRequestCompleteListener;
    private b3d0 mRequestQueue;

    @GuardedBy("mLock")
    private boolean mResponseDelivered;
    private j6d0 mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* JADX INFO: renamed from: com.android.volley.Request$a */
    public class RunnableC0917a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f4141a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f4142b;

        public RunnableC0917a(String str, long j) {
            this.f4141a = str;
            this.f4142b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Request.this.mEventLog.m5115a(this.f4141a, this.f4142b);
            Request.this.mEventLog.m5116b(Request.this.toString());
        }
    }

    /* JADX INFO: renamed from: com.android.volley.Request$b */
    public interface InterfaceC0918b {
        /* JADX INFO: renamed from: a */
        void mo5089a(Request<?> request);

        /* JADX INFO: renamed from: b */
        void mo5090b(Request<?> request, C0922d<?> c0922d);
    }

    public Request(int i, String str, @Nullable C0922d.a aVar) {
        this.mEventLog = C0923e.a.f4173c ? new C0923e.a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new wrd());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            u1d0.m193953a("Encoding not supported: ", str, e);
            return null;
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (C0923e.a.f4173c) {
            this.mEventLog.m5115a(str, Thread.currentThread().getId());
        }
    }

    @CallSuper
    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Request<T> request) {
        int iOrdinal;
        int iOrdinal2;
        Priority priority = getPriority();
        Priority priority2 = request.getPriority();
        if (priority == priority2) {
            iOrdinal = this.mSequence.intValue();
            iOrdinal2 = request.mSequence.intValue();
        } else {
            iOrdinal = priority2.ordinal();
            iOrdinal2 = priority.ordinal();
        }
        return iOrdinal - iOrdinal2;
    }

    public void deliverError(VolleyError volleyError) {
        C0922d.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.onErrorResponse(volleyError);
        }
    }

    public abstract void deliverResponse(T t);

    public void finish(String str) {
        b3d0 b3d0Var = this.mRequestQueue;
        if (b3d0Var != null) {
            b3d0Var.m102280c(this);
        }
        if (C0923e.a.f4173c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0917a(str, id));
            } else {
                this.mEventLog.m5115a(str, id);
                this.mEventLog.m5116b(toString());
            }
        }
    }

    public byte[] getBody() throws AuthFailureError {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    @Nullable
    public InterfaceC0919a.a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    @Nullable
    public C0922d.a getErrorListener() {
        C0922d.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    @Nullable
    public Map<String, String> getParams() throws AuthFailureError {
        return null;
    }

    public String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() throws AuthFailureError {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Nullable
    @Deprecated
    public Map<String, String> getPostParams() throws AuthFailureError {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    public j6d0 getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        wtq0.m207906a("getSequence called before setSequence");
        return 0;
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().mo143658c();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        InterfaceC0918b interfaceC0918b;
        synchronized (this.mLock) {
            interfaceC0918b = this.mRequestCompleteListener;
        }
        if (interfaceC0918b != null) {
            interfaceC0918b.mo5089a(this);
        }
    }

    public void notifyListenerResponseReceived(C0922d<?> c0922d) {
        InterfaceC0918b interfaceC0918b;
        synchronized (this.mLock) {
            interfaceC0918b = this.mRequestCompleteListener;
        }
        if (interfaceC0918b != null) {
            interfaceC0918b.mo5090b(this, c0922d);
        }
    }

    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    public abstract C0922d<T> parseNetworkResponse(cl20 cl20Var);

    public void sendEvent(int i) {
        b3d0 b3d0Var = this.mRequestQueue;
        if (b3d0Var != null) {
            b3d0Var.m102282e(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setCacheEntry(InterfaceC0919a.a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    public void setNetworkRequestCompleteListener(InterfaceC0918b interfaceC0918b) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = interfaceC0918b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setRequestQueue(b3d0 b3d0Var) {
        this.mRequestQueue = b3d0Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setRetryPolicy(j6d0 j6d0Var) {
        this.mRetryPolicy = j6d0Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "[X] " : "[ ] ");
        sb.append(getUrl());
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(str);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(getPriority());
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(this.mSequence);
        return sb.toString();
    }

    @Deprecated
    public Request(String str, C0922d.a aVar) {
        this(-1, str, aVar);
    }
}
