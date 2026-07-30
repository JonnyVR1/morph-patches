package p149l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.C1577c;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1657e;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\u0014\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, m87232d2 = {"Ll/hcl0;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "h", "()V", "j", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "", "currentDigest", "g", "(Lcom/facebook/GraphRequest;Ljava/lang/String;)V", "tree", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "activityReference", "Ljava/util/Timer;", "c", "Ljava/util/Timer;", "indexingTimer", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "previousDigest", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class hcl0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f107064e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static hcl0 f107065f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityReference;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Timer indexingTimer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String previousDigest;

    /* JADX INFO: renamed from: l.hcl0$b */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/hcl0$b;", "Ljava/util/concurrent/Callable;", "", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "a", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class CallableC17277b implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> rootView;

        public CallableC17277b(@NotNull View view) {
            view.getClass();
            this.rootView = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.rootView.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            bitmapCreateBitmap.getClass();
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            strEncodeToString.getClass();
            return strEncodeToString;
        }
    }

    /* JADX INFO: renamed from: l.hcl0$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/hcl0$c", "Ljava/util/TimerTask;", "", "run", "()V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17278c extends TimerTask {
        public C17278c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) hcl0.m130446c(hcl0.this).get();
                View viewM161521d = nv0.m161521d(activity);
                if (activity != null && viewM161521d != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (tb5.m187802g()) {
                        if (czm.m109428b()) {
                            yoj0.m215525a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new CallableC17277b(viewM161521d));
                        hcl0.m130448e(hcl0.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            Log.e(hcl0.m130447d(), "Failed to take screenshot.", e);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(ccl0.m106068d(viewM161521d));
                            jSONObject.put(OMSTemplateModeType.view, jSONArray);
                        } catch (JSONException unused) {
                            Log.e(hcl0.m130447d(), "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        string.getClass();
                        hcl0.m130449f(hcl0.this, string);
                    }
                }
            } catch (Exception e2) {
                Log.e(hcl0.m130447d(), "UI Component tree indexing failure!", e2);
            }
        }
    }

    static {
        String canonicalName = hcl0.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f107064e = canonicalName;
    }

    public hcl0(@NotNull Activity activity) {
        activity.getClass();
        this.activityReference = new WeakReference<>(activity);
        this.previousDigest = null;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        f107065f = this;
    }

    /* JADX INFO: renamed from: a */
    public static void m130444a(String str, hcl0 hcl0Var) {
        if (lsb.m151554d(hcl0.class)) {
            return;
        }
        try {
            str.getClass();
            hcl0Var.getClass();
            String strM8849m0 = C1657e.m8849m0(str);
            AccessToken accessTokenM7436e = AccessToken.INSTANCE.m7436e();
            if (strM8849m0 == null || !Intrinsics.m87488d(strM8849m0, hcl0Var.previousDigest)) {
                hcl0Var.m130450g(INSTANCE.m130455b(str, accessTokenM7436e, C1577c.m8048m(), "app_indexing"), strM8849m0);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, hcl0.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m130445b(hcl0 hcl0Var, TimerTask timerTask) {
        if (lsb.m151554d(hcl0.class)) {
            return;
        }
        try {
            hcl0Var.getClass();
            timerTask.getClass();
            try {
                Timer timer = hcl0Var.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                hcl0Var.previousDigest = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                hcl0Var.indexingTimer = timer2;
            } catch (Exception e) {
                Log.e(f107064e, "Error scheduling indexing job", e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, hcl0.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ WeakReference m130446c(hcl0 hcl0Var) {
        if (lsb.m151554d(hcl0.class)) {
            return null;
        }
        try {
            return hcl0Var.activityReference;
        } catch (Throwable th) {
            lsb.m151552b(th, hcl0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ String m130447d() {
        if (lsb.m151554d(hcl0.class)) {
            return null;
        }
        try {
            return f107064e;
        } catch (Throwable th) {
            lsb.m151552b(th, hcl0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ Handler m130448e(hcl0 hcl0Var) {
        if (lsb.m151554d(hcl0.class)) {
            return null;
        }
        try {
            return hcl0Var.uiThreadHandler;
        } catch (Throwable th) {
            lsb.m151552b(th, hcl0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ void m130449f(hcl0 hcl0Var, String str) {
        if (lsb.m151554d(hcl0.class)) {
            return;
        }
        try {
            hcl0Var.m130452i(str);
        } catch (Throwable th) {
            lsb.m151552b(th, hcl0.class);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m130450g(@Nullable GraphRequest request, @Nullable String currentDigest) {
        if (lsb.m151554d(this) || request == null) {
            return;
        }
        try {
            GraphResponse graphResponseM7525j = request.m7525j();
            try {
                JSONObject graphObject = graphResponseM7525j.getGraphObject();
                if (graphObject == null) {
                    Log.e(f107064e, "Error sending UI component tree to Facebook: " + graphResponseM7525j.getError());
                    return;
                }
                if (Intrinsics.m87488d("true", graphObject.optString("success"))) {
                    uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, f107064e, "Successfully send UI component tree to server");
                    this.previousDigest = currentDigest;
                }
                if (graphObject.has("is_app_indexing_enabled")) {
                    tb5.m187806l(graphObject.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e) {
                Log.e(f107064e, "Error decoding server response.", e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m130451h() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            final C17278c c17278c = new C17278c();
            try {
                C1577c.m8056u().execute(new Runnable() { // from class: l.ecl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        hcl0.m130445b(this.f90552a, c17278c);
                    }
                });
            } catch (RejectedExecutionException e) {
                Log.e(f107064e, "Error scheduling indexing job", e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m130452i(final String tree) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1577c.m8056u().execute(new Runnable() { // from class: l.fcl0
                @Override // java.lang.Runnable
                public final void run() {
                    hcl0.m130444a(tree, this);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m130453j() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (this.activityReference.get() == null) {
                return;
            }
            try {
                Timer timer = this.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this.indexingTimer = null;
            } catch (Exception e) {
                Log.e(f107064e, "Error unscheduling indexing job", e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.hcl0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/hcl0$a;", "", "<init>", "()V", "", "appIndex", "Lcom/facebook/AccessToken;", "accessToken", RemoteConfigConstants.RequestFieldKey.APP_ID, "requestType", "Lcom/facebook/GraphRequest;", "b", "(Ljava/lang/String;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/GraphRequest;", "APP_VERSION_PARAM", "Ljava/lang/String;", "PLATFORM_PARAM", "REQUEST_TYPE", "SUCCESS", "TAG", "TREE_PARAM", "Ll/hcl0;", "instance", "Ll/hcl0;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m130454a(GraphResponse graphResponse) {
            graphResponse.getClass();
            uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, hcl0.m130447d(), "App index sent to FB!");
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Nullable
        /* JADX INFO: renamed from: b */
        public final GraphRequest m130455b(@Nullable String appIndex, @Nullable AccessToken accessToken, @Nullable String appId, @NotNull String requestType) {
            requestType.getClass();
            if (appIndex == null) {
                return null;
            }
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            GraphRequest graphRequestM7587z = companion.m7587z(accessToken, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{appId}, 1)), null, null);
            Bundle parameters = graphRequestM7587z.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("tree", appIndex);
            parameters.putString("app_version", nv0.m161520c());
            parameters.putString("platform", "android");
            parameters.putString("request_type", requestType);
            if (Intrinsics.m87488d(requestType, "app_indexing")) {
                parameters.putString("device_session_id", tb5.m187801f());
            }
            graphRequestM7587z.m7520G(parameters);
            graphRequestM7587z.m7516C(new GraphRequest.InterfaceC1516b() { // from class: l.gcl0
                @Override // com.facebook.GraphRequest.InterfaceC1516b
                /* JADX INFO: renamed from: a */
                public final void mo7548a(GraphResponse graphResponse) {
                    hcl0.Companion.m130454a(graphResponse);
                }
            });
            return graphRequestM7587z;
        }

        public Companion() {
        }
    }
}
