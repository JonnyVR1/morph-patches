package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.C1575d;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.C1679d;
import com.facebook.internal.FetchedAppSettingsManager;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import p153l.rzv;
import p153l.sse0;
import p153l.tv0;
import p153l.wv0;
import p153l.yvi;
import p153l.ztb;
import p153l.ztv;

/* JADX INFO: renamed from: com.facebook.appevents.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\tJ!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0016H\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0016H\u0007¢\u0006\u0004\b(\u0010)R\u001c\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00108\u001a\n +*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, m88121d2 = {"Lcom/facebook/appevents/d;", "", "<init>", "()V", "", "n", "Lcom/facebook/appevents/FlushReason;", Reason.TYPE, "j", "(Lcom/facebook/appevents/FlushReason;)V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Lcom/facebook/appevents/AppEvent;", "appEvent", "g", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/AppEvent;)V", "", BLiveStormDanmakuGiftResourceType.f45292l, "()Ljava/util/Set;", "k", "Lcom/facebook/appevents/b;", "appEventCollection", "Ll/yvi;", "o", "(Lcom/facebook/appevents/FlushReason;Lcom/facebook/appevents/b;)Ll/yvi;", "flushResults", "", "Lcom/facebook/GraphRequest;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/appevents/b;Ll/yvi;)Ljava/util/List;", "Ll/sse0;", "appEvents", "", "limitEventUsage", "flushState", "h", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Ll/sse0;ZLl/yvi;)Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "Lcom/facebook/GraphResponse;", "response", "m", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/GraphRequest;Lcom/facebook/GraphResponse;Ll/sse0;Ll/yvi;)V", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "", "b", "I", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "c", "Lcom/facebook/appevents/b;", "Ljava/util/concurrent/ScheduledExecutorService;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledFuture;", "e", "Ljava/util/concurrent/ScheduledFuture;", "scheduledFuture", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "flushRunnable", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C1575d {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static ScheduledFuture<?> scheduledFuture;

    @NotNull
    public static final C1575d INSTANCE = new C1575d();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1575d.class.getName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static volatile C1560b appEventCollection = new C1560b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Runnable flushRunnable = new Runnable() { // from class: l.nv0
        @Override // java.lang.Runnable
        public final void run() {
            C1575d.m7773c();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m7771a(AccessTokenAppIdPair accessTokenAppIdPair, sse0 sse0Var) {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            sse0Var.getClass();
            tv0.m192772a(accessTokenAppIdPair, sse0Var);
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7772b(FlushReason flushReason) {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            flushReason.getClass();
            m7781k(flushReason);
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7773c() {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            scheduledFuture = null;
            if (AppEventsLogger.INSTANCE.m7703d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                m7781k(FlushReason.TIMER);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7774d(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            appEvent.getClass();
            appEventCollection.m7712a(accessTokenAppIdPair, appEvent);
            if (AppEventsLogger.INSTANCE.m7703d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.m7715d() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                m7781k(FlushReason.EVENT_THRESHOLD);
            } else if (scheduledFuture == null) {
                scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7775e(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, sse0 sse0Var, yvi yviVar, GraphResponse graphResponse) {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            graphRequest.getClass();
            sse0Var.getClass();
            yviVar.getClass();
            graphResponse.getClass();
            m7783m(accessTokenAppIdPair, graphRequest, graphResponse, sse0Var, yviVar);
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7776f() {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            tv0.m192773b(appEventCollection);
            appEventCollection = new C1560b();
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7777g(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull final AppEvent appEvent) {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            accessTokenAppId.getClass();
            appEvent.getClass();
            singleThreadExecutor.execute(new Runnable() { // from class: l.ov0
                @Override // java.lang.Runnable
                public final void run() {
                    C1575d.m7774d(accessTokenAppId, appEvent);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final GraphRequest m7778h(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull final sse0 appEvents, boolean limitEventUsage, @NotNull final yvi flushState) {
        if (ztb.m221490d(C1575d.class)) {
            return null;
        }
        try {
            accessTokenAppId.getClass();
            appEvents.getClass();
            flushState.getClass();
            String applicationId = accessTokenAppId.getApplicationId();
            C1679d c1679dM8747r = FetchedAppSettingsManager.m8747r(applicationId, false);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            final GraphRequest graphRequestM7641z = companion.m7641z(null, String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1)), null, null);
            graphRequestM7641z.m7571D(true);
            Bundle parameters = graphRequestM7641z.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("access_token", accessTokenAppId.getAccessTokenString());
            String strM7839e = C1577f.INSTANCE.m7839e();
            if (strM7839e != null) {
                parameters.putString("device_token", strM7839e);
            }
            String strM7816l = C1576e.INSTANCE.m7816l();
            if (strM7816l != null) {
                parameters.putString("install_referrer", strM7816l);
            }
            graphRequestM7641z.m7574G(parameters);
            int iM187705e = appEvents.m187705e(graphRequestM7641z, C1600c.m8101l(), c1679dM8747r != null ? c1679dM8747r.getSupportsImplicitLogging() : false, limitEventUsage);
            if (iM187705e == 0) {
                return null;
            }
            flushState.m217518c(flushState.getNumEvents() + iM187705e);
            graphRequestM7641z.m7570C(new GraphRequest.InterfaceC1539b() { // from class: l.qv0
                @Override // com.facebook.GraphRequest.InterfaceC1539b
                /* JADX INFO: renamed from: a */
                public final void mo7602a(GraphResponse graphResponse) {
                    C1575d.m7775e(accessTokenAppId, graphRequestM7641z, appEvents, flushState, graphResponse);
                }
            });
            return graphRequestM7641z;
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final List<GraphRequest> m7779i(@NotNull C1560b appEventCollection2, @NotNull yvi flushResults) {
        if (ztb.m221490d(C1575d.class)) {
            return null;
        }
        try {
            appEventCollection2.getClass();
            flushResults.getClass();
            boolean zM8076A = C1600c.m8076A(C1600c.m8101l());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection2.m7717f()) {
                sse0 sse0VarM7714c = appEventCollection2.m7714c(accessTokenAppIdPair);
                if (sse0VarM7714c == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest graphRequestM7778h = m7778h(accessTokenAppIdPair, sse0VarM7714c, zM8076A, flushResults);
                if (graphRequestM7778h != null) {
                    arrayList.add(graphRequestM7778h);
                    if (wv0.INSTANCE.m207986e()) {
                        AppEventsConversionsAPITransformerWebRequests.m7743l(graphRequestM7778h);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m7780j(@NotNull final FlushReason reason) {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            reason.getClass();
            singleThreadExecutor.execute(new Runnable() { // from class: l.pv0
                @Override // java.lang.Runnable
                public final void run() {
                    C1575d.m7772b(reason);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m7781k(@NotNull FlushReason reason) {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            reason.getClass();
            appEventCollection.m7713b(C1561c.m7718a());
            try {
                yvi yviVarM7785o = m7785o(reason, appEventCollection);
                if (yviVarM7785o != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", yviVarM7785o.getNumEvents());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", yviVarM7785o.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String());
                    ztv.m221572b(C1600c.m8101l()).m221575d(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Set<AccessTokenAppIdPair> m7782l() {
        if (ztb.m221490d(C1575d.class)) {
            return null;
        }
        try {
            return appEventCollection.m7717f();
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m7783m(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull GraphRequest request, @NotNull GraphResponse response, @NotNull final sse0 appEvents, @NotNull yvi flushState) {
        String string;
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            accessTokenAppId.getClass();
            request.getClass();
            response.getClass();
            appEvents.getClass();
            flushState.getClass();
            FacebookRequestError error = response.getError();
            String str = "Success";
            FlushResult flushResult = FlushResult.SUCCESS;
            if (error != null) {
                if (error.getErrorCode() == -1) {
                    str = "Failed: No Connectivity";
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), error.toString()}, 2));
                    flushResult = FlushResult.SERVER_ERROR;
                }
            }
            if (C1600c.m8083H(LoggingBehavior.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) request.getTag()).toString(2);
                    string.getClass();
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                rzv.Companion companion = rzv.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String str2 = TAG;
                str2.getClass();
                companion.m183849c(loggingBehavior, str2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.getGraphObject()), str, string);
            }
            appEvents.m187702b(error != null);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                C1600c.m8110u().execute(new Runnable() { // from class: l.sv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1575d.m7771a(accessTokenAppId, appEvents);
                    }
                });
            }
            if (flushResult == FlushResult.SUCCESS || flushState.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String() == flushResult2) {
                return;
            }
            flushState.m217519d(flushResult);
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m7784n() {
        if (ztb.m221490d(C1575d.class)) {
            return;
        }
        try {
            singleThreadExecutor.execute(new Runnable() { // from class: l.rv0
                @Override // java.lang.Runnable
                public final void run() {
                    C1575d.m7776f();
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final yvi m7785o(@NotNull FlushReason reason, @NotNull C1560b appEventCollection2) {
        if (ztb.m221490d(C1575d.class)) {
            return null;
        }
        try {
            reason.getClass();
            appEventCollection2.getClass();
            yvi yviVar = new yvi();
            List<GraphRequest> listM7779i = m7779i(appEventCollection2, yviVar);
            if (listM7779i.isEmpty()) {
                return null;
            }
            rzv.Companion companion = rzv.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.m183849c(loggingBehavior, str, "Flushing %d events due to %s.", Integer.valueOf(yviVar.getNumEvents()), reason.toString());
            Iterator<GraphRequest> it = listM7779i.iterator();
            while (it.hasNext()) {
                it.next().m7579j();
            }
            return yviVar;
        } catch (Throwable th) {
            ztb.m221488b(th, C1575d.class);
            return null;
        }
    }
}
