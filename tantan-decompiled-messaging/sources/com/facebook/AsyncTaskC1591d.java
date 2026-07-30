package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.C1657e;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 %2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0017B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0015\"\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR4\u0010$\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m87232d2 = {"Lcom/facebook/d;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/facebook/GraphResponse;", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/e;", "requests", "<init>", "(Ljava/net/HttpURLConnection;Lcom/facebook/e;)V", "(Lcom/facebook/e;)V", "", "toString", "()Ljava/lang/String;", "", "onPreExecute", "()V", LovePlanetStage.result, "b", "(Ljava/util/List;)V", "", CommandMessage.PARAMS, "a", "([Ljava/lang/Void;)Ljava/util/List;", "Ljava/net/HttpURLConnection;", "Lcom/facebook/e;", "getRequests", "()Lcom/facebook/e;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<set-?>", "c", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "exception", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public class AsyncTaskC1591d extends AsyncTask<Void, Void, List<? extends GraphResponse>> {

    /* JADX INFO: renamed from: d */
    public static final String f6274d = AsyncTaskC1591d.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1599e requests;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Exception exception;

    public AsyncTaskC1591d(@Nullable HttpURLConnection httpURLConnection, @NotNull C1599e c1599e) {
        c1599e.getClass();
        this.connection = httpURLConnection;
        this.requests = c1599e;
    }

    @VisibleForTesting(otherwise = 4)
    @Nullable
    /* JADX INFO: renamed from: a */
    public List<GraphResponse> m8175a(@NotNull Void... params) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            params.getClass();
            try {
                HttpURLConnection httpURLConnection = this.connection;
                return httpURLConnection == null ? this.requests.m8304h() : GraphRequest.INSTANCE.m7576o(httpURLConnection, this.requests);
            } catch (Exception e) {
                this.exception = e;
                return null;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8176b(@NotNull List<GraphResponse> result) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            result.getClass();
            super.onPostExecute(result);
            Exception exc = this.exception;
            if (exc != null) {
                String str = f6274d;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                C1657e.m8844j0(str, String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)));
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends GraphResponse> doInBackground(Void[] voidArr) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            return m8175a(voidArr);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends GraphResponse> list) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m8176b(list);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @VisibleForTesting(otherwise = 4)
    public void onPreExecute() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (C1577c.m8025D()) {
                String str = f6274d;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                C1657e.m8844j0(str, String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1)));
            }
            if (this.requests.getCallbackHandler() == null) {
                this.requests.m8299G(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @NotNull
    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.connection + ", requests: " + this.requests + "}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1591d(@NotNull C1599e c1599e) {
        this(null, c1599e);
        c1599e.getClass();
    }
}
