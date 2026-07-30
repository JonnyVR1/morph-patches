package p149l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.android.volley.C0918d;
import com.android.volley.C0919e;
import com.android.volley.Request;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class tpq<T> extends Request<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", "utf-8");

    @Nullable
    @GuardedBy("mLock")
    private C0918d.b<T> mListener;
    private final Object mLock;

    @Nullable
    private final String mRequestBody;

    public tpq(int i, String str, @Nullable String str2, C0918d.b<T> bVar, @Nullable C0918d.a aVar) {
        super(i, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
        this.mRequestBody = str2;
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.Request
    public void deliverResponse(T t) {
        C0918d.b<T> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(t);
        }
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            C0919e.m5103f("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, "utf-8");
            return null;
        }
    }

    @Override // com.android.volley.Request
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // com.android.volley.Request
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.Request
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Override // com.android.volley.Request
    public abstract C0918d<T> parseNetworkResponse(sc20 sc20Var);

    @Deprecated
    public tpq(String str, String str2, C0918d.b<T> bVar, C0918d.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }
}
