package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.C1680e;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 %2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0017B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0015\"\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR4\u0010$\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m88121d2 = {"Lcom/facebook/d;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/facebook/GraphResponse;", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/e;", "requests", "<init>", "(Ljava/net/HttpURLConnection;Lcom/facebook/e;)V", "(Lcom/facebook/e;)V", "", "toString", "()Ljava/lang/String;", "", "onPreExecute", "()V", LovePlanetStage.result, "b", "(Ljava/util/List;)V", "", CommandMessage.PARAMS, "a", "([Ljava/lang/Void;)Ljava/util/List;", "Ljava/net/HttpURLConnection;", "Lcom/facebook/e;", "getRequests", "()Lcom/facebook/e;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<set-?>", "c", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "exception", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public class AsyncTaskC1614d extends AsyncTask<Void, Void, List<? extends GraphResponse>> {

    /* JADX INFO: renamed from: d */
    public static final String f6311d = AsyncTaskC1614d.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1622e requests;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Exception exception;

    public AsyncTaskC1614d(@Nullable HttpURLConnection httpURLConnection, @NotNull C1622e c1622e) {
        c1622e.getClass();
        this.connection = httpURLConnection;
        this.requests = c1622e;
    }

    @VisibleForTesting(otherwise = 4)
    @Nullable
    /* JADX INFO: renamed from: a */
    public List<GraphResponse> m8229a(@NotNull Void... params) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            params.getClass();
            try {
                HttpURLConnection httpURLConnection = this.connection;
                return httpURLConnection == null ? this.requests.m8358h() : GraphRequest.INSTANCE.m7630o(httpURLConnection, this.requests);
            } catch (Exception e) {
                this.exception = e;
                return null;
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8230b(@NotNull List<GraphResponse> result) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            result.getClass();
            super.onPostExecute(result);
            Exception exc = this.exception;
            if (exc != null) {
                String str = f6311d;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                C1680e.m8898j0(str, String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)));
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends GraphResponse> doInBackground(Void[] voidArr) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return m8229a(voidArr);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends GraphResponse> list) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            m8230b(list);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @VisibleForTesting(otherwise = 4)
    public void onPreExecute() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (C1600c.m8079D()) {
                String str = f6311d;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                C1680e.m8898j0(str, String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1)));
            }
            if (this.requests.getCallbackHandler() == null) {
                this.requests.m8353G(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @NotNull
    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.connection + ", requests: " + this.requests + "}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1614d(@NotNull C1622e c1622e) {
        this(null, c1622e);
        c1622e.getClass();
    }
}
