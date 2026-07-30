package p153l;

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
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1680e;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\u0014\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, m88121d2 = {"Ll/lll0;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "h", "()V", "j", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "", "currentDigest", "g", "(Lcom/facebook/GraphRequest;Ljava/lang/String;)V", "tree", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "activityReference", "Ljava/util/Timer;", "c", "Ljava/util/Timer;", "indexingTimer", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "previousDigest", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class lll0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f132569e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static lll0 f132570f;

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

    /* JADX INFO: renamed from: l.lll0$b */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/lll0$b;", "Ljava/util/concurrent/Callable;", "", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "a", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class CallableC18412b implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> rootView;

        public CallableC18412b(@NotNull View view) {
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

    /* JADX INFO: renamed from: l.lll0$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/lll0$c", "Ljava/util/TimerTask;", "", "run", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C18413c extends TimerTask {
        public C18413c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) lll0.m154750c(lll0.this).get();
                View viewM198220d = uv0.m198220d(activity);
                if (activity != null && viewM198220d != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (tc5.m190427g()) {
                        if (c1n.m107628b()) {
                            byj0.m107022a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new CallableC18412b(viewM198220d));
                        lll0.m154752e(lll0.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            Log.e(lll0.m154751d(), "Failed to take screenshot.", e);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(gll0.m130680d(viewM198220d));
                            jSONObject.put(OMSTemplateModeType.view, jSONArray);
                        } catch (JSONException unused) {
                            Log.e(lll0.m154751d(), "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        string.getClass();
                        lll0.m154753f(lll0.this, string);
                    }
                }
            } catch (Exception e2) {
                Log.e(lll0.m154751d(), "UI Component tree indexing failure!", e2);
            }
        }
    }

    static {
        String canonicalName = lll0.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f132569e = canonicalName;
    }

    public lll0(@NotNull Activity activity) {
        activity.getClass();
        this.activityReference = new WeakReference<>(activity);
        this.previousDigest = null;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        f132570f = this;
    }

    /* JADX INFO: renamed from: a */
    public static void m154748a(String str, lll0 lll0Var) {
        if (ztb.m221490d(lll0.class)) {
            return;
        }
        try {
            str.getClass();
            lll0Var.getClass();
            String strM8903m0 = C1680e.m8903m0(str);
            AccessToken accessTokenM7490e = AccessToken.INSTANCE.m7490e();
            if (strM8903m0 == null || !Intrinsics.m88377d(strM8903m0, lll0Var.previousDigest)) {
                lll0Var.m154754g(INSTANCE.m154759b(str, accessTokenM7490e, C1600c.m8102m(), "app_indexing"), strM8903m0);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, lll0.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m154749b(lll0 lll0Var, TimerTask timerTask) {
        if (ztb.m221490d(lll0.class)) {
            return;
        }
        try {
            lll0Var.getClass();
            timerTask.getClass();
            try {
                Timer timer = lll0Var.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                lll0Var.previousDigest = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                lll0Var.indexingTimer = timer2;
            } catch (Exception e) {
                Log.e(f132569e, "Error scheduling indexing job", e);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, lll0.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ WeakReference m154750c(lll0 lll0Var) {
        if (ztb.m221490d(lll0.class)) {
            return null;
        }
        try {
            return lll0Var.activityReference;
        } catch (Throwable th) {
            ztb.m221488b(th, lll0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ String m154751d() {
        if (ztb.m221490d(lll0.class)) {
            return null;
        }
        try {
            return f132569e;
        } catch (Throwable th) {
            ztb.m221488b(th, lll0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ Handler m154752e(lll0 lll0Var) {
        if (ztb.m221490d(lll0.class)) {
            return null;
        }
        try {
            return lll0Var.uiThreadHandler;
        } catch (Throwable th) {
            ztb.m221488b(th, lll0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ void m154753f(lll0 lll0Var, String str) {
        if (ztb.m221490d(lll0.class)) {
            return;
        }
        try {
            lll0Var.m154756i(str);
        } catch (Throwable th) {
            ztb.m221488b(th, lll0.class);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m154754g(@Nullable GraphRequest request, @Nullable String currentDigest) {
        if (ztb.m221490d(this) || request == null) {
            return;
        }
        try {
            GraphResponse graphResponseM7579j = request.m7579j();
            try {
                JSONObject graphObject = graphResponseM7579j.getGraphObject();
                if (graphObject == null) {
                    Log.e(f132569e, "Error sending UI component tree to Facebook: " + graphResponseM7579j.getError());
                    return;
                }
                if (Intrinsics.m88377d("true", graphObject.optString("success"))) {
                    rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, f132569e, "Successfully send UI component tree to server");
                    this.previousDigest = currentDigest;
                }
                if (graphObject.has("is_app_indexing_enabled")) {
                    tc5.m190431l(graphObject.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e) {
                Log.e(f132569e, "Error decoding server response.", e);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m154755h() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            final C18413c c18413c = new C18413c();
            try {
                C1600c.m8110u().execute(new Runnable() { // from class: l.ill0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lll0.m154749b(this.f115588a, c18413c);
                    }
                });
            } catch (RejectedExecutionException e) {
                Log.e(f132569e, "Error scheduling indexing job", e);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m154756i(final String tree) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1600c.m8110u().execute(new Runnable() { // from class: l.jll0
                @Override // java.lang.Runnable
                public final void run() {
                    lll0.m154748a(tree, this);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m154757j() {
        if (ztb.m221490d(this)) {
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
                Log.e(f132569e, "Error unscheduling indexing job", e);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.lll0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/lll0$a;", "", "<init>", "()V", "", "appIndex", "Lcom/facebook/AccessToken;", "accessToken", RemoteConfigConstants.RequestFieldKey.APP_ID, "requestType", "Lcom/facebook/GraphRequest;", "b", "(Ljava/lang/String;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/GraphRequest;", "APP_VERSION_PARAM", "Ljava/lang/String;", "PLATFORM_PARAM", "REQUEST_TYPE", "SUCCESS", "TAG", "TREE_PARAM", "Ll/lll0;", "instance", "Ll/lll0;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m154758a(GraphResponse graphResponse) {
            graphResponse.getClass();
            rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, lll0.m154751d(), "App index sent to FB!");
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Nullable
        /* JADX INFO: renamed from: b */
        public final GraphRequest m154759b(@Nullable String appIndex, @Nullable AccessToken accessToken, @Nullable String appId, @NotNull String requestType) {
            requestType.getClass();
            if (appIndex == null) {
                return null;
            }
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            GraphRequest graphRequestM7641z = companion.m7641z(accessToken, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{appId}, 1)), null, null);
            Bundle parameters = graphRequestM7641z.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("tree", appIndex);
            parameters.putString("app_version", uv0.m198219c());
            parameters.putString("platform", "android");
            parameters.putString("request_type", requestType);
            if (Intrinsics.m88377d(requestType, "app_indexing")) {
                parameters.putString("device_session_id", tc5.m190426f());
            }
            graphRequestM7641z.m7574G(parameters);
            graphRequestM7641z.m7570C(new GraphRequest.InterfaceC1539b() { // from class: l.kll0
                @Override // com.facebook.GraphRequest.InterfaceC1539b
                /* JADX INFO: renamed from: a */
                public final void mo7602a(GraphResponse graphResponse) {
                    lll0.Companion.m154758a(graphResponse);
                }
            });
            return graphRequestM7641z;
        }

        public Companion() {
        }
    }
}
