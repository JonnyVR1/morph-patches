package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.C1552d;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.C1656d;
import com.facebook.internal.FetchedAppSettingsManager;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.cti;
import p149l.lsb;
import p149l.mv0;
import p149l.nke0;
import p149l.pv0;
import p149l.uxv;
import p149l.yrv;

/* JADX INFO: renamed from: com.facebook.appevents.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\tJ!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0016H\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0016H\u0007¢\u0006\u0004\b(\u0010)R\u001c\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00108\u001a\n +*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, m87232d2 = {"Lcom/facebook/appevents/d;", "", "<init>", "()V", "", "n", "Lcom/facebook/appevents/FlushReason;", Reason.TYPE, "j", "(Lcom/facebook/appevents/FlushReason;)V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Lcom/facebook/appevents/AppEvent;", "appEvent", "g", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/AppEvent;)V", "", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/util/Set;", "k", "Lcom/facebook/appevents/b;", "appEventCollection", "Ll/cti;", "o", "(Lcom/facebook/appevents/FlushReason;Lcom/facebook/appevents/b;)Ll/cti;", "flushResults", "", "Lcom/facebook/GraphRequest;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/appevents/b;Ll/cti;)Ljava/util/List;", "Ll/nke0;", "appEvents", "", "limitEventUsage", "flushState", "h", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Ll/nke0;ZLl/cti;)Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "Lcom/facebook/GraphResponse;", "response", "m", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/GraphRequest;Lcom/facebook/GraphResponse;Ll/nke0;Ll/cti;)V", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "", "b", "I", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "c", "Lcom/facebook/appevents/b;", "Ljava/util/concurrent/ScheduledExecutorService;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledFuture;", "e", "Ljava/util/concurrent/ScheduledFuture;", "scheduledFuture", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "flushRunnable", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1552d {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static ScheduledFuture<?> scheduledFuture;

    @NotNull
    public static final C1552d INSTANCE = new C1552d();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1552d.class.getName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static volatile C1537b appEventCollection = new C1537b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Runnable flushRunnable = new Runnable() { // from class: l.gv0
        @Override // java.lang.Runnable
        public final void run() {
            C1552d.m7719c();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m7717a(AccessTokenAppIdPair accessTokenAppIdPair, nke0 nke0Var) {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            nke0Var.getClass();
            mv0.m156459a(accessTokenAppIdPair, nke0Var);
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7718b(FlushReason flushReason) {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            flushReason.getClass();
            m7727k(flushReason);
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7719c() {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            scheduledFuture = null;
            if (AppEventsLogger.INSTANCE.m7649d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                m7727k(FlushReason.TIMER);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7720d(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            appEvent.getClass();
            appEventCollection.m7658a(accessTokenAppIdPair, appEvent);
            if (AppEventsLogger.INSTANCE.m7649d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.m7661d() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                m7727k(FlushReason.EVENT_THRESHOLD);
            } else if (scheduledFuture == null) {
                scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7721e(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, nke0 nke0Var, cti ctiVar, GraphResponse graphResponse) {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            graphRequest.getClass();
            nke0Var.getClass();
            ctiVar.getClass();
            graphResponse.getClass();
            m7729m(accessTokenAppIdPair, graphRequest, graphResponse, nke0Var, ctiVar);
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7722f() {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            mv0.m156460b(appEventCollection);
            appEventCollection = new C1537b();
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7723g(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull final AppEvent appEvent) {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            accessTokenAppId.getClass();
            appEvent.getClass();
            singleThreadExecutor.execute(new Runnable() { // from class: l.hv0
                @Override // java.lang.Runnable
                public final void run() {
                    C1552d.m7720d(accessTokenAppId, appEvent);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final GraphRequest m7724h(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull final nke0 appEvents, boolean limitEventUsage, @NotNull final cti flushState) {
        if (lsb.m151554d(C1552d.class)) {
            return null;
        }
        try {
            accessTokenAppId.getClass();
            appEvents.getClass();
            flushState.getClass();
            String applicationId = accessTokenAppId.getApplicationId();
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(applicationId, false);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            final GraphRequest graphRequestM7587z = companion.m7587z(null, String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1)), null, null);
            graphRequestM7587z.m7517D(true);
            Bundle parameters = graphRequestM7587z.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("access_token", accessTokenAppId.getAccessTokenString());
            String strM7785e = C1554f.INSTANCE.m7785e();
            if (strM7785e != null) {
                parameters.putString("device_token", strM7785e);
            }
            String strM7762l = C1553e.INSTANCE.m7762l();
            if (strM7762l != null) {
                parameters.putString("install_referrer", strM7762l);
            }
            graphRequestM7587z.m7520G(parameters);
            int iM159830e = appEvents.m159830e(graphRequestM7587z, C1577c.m8047l(), c1656dM8693r != null ? c1656dM8693r.getSupportsImplicitLogging() : false, limitEventUsage);
            if (iM159830e == 0) {
                return null;
            }
            flushState.m108687c(flushState.getNumEvents() + iM159830e);
            graphRequestM7587z.m7516C(new GraphRequest.InterfaceC1516b() { // from class: l.jv0
                @Override // com.facebook.GraphRequest.InterfaceC1516b
                /* JADX INFO: renamed from: a */
                public final void mo7548a(GraphResponse graphResponse) {
                    C1552d.m7721e(accessTokenAppId, graphRequestM7587z, appEvents, flushState, graphResponse);
                }
            });
            return graphRequestM7587z;
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final List<GraphRequest> m7725i(@NotNull C1537b appEventCollection2, @NotNull cti flushResults) {
        if (lsb.m151554d(C1552d.class)) {
            return null;
        }
        try {
            appEventCollection2.getClass();
            flushResults.getClass();
            boolean zM8022A = C1577c.m8022A(C1577c.m8047l());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection2.m7663f()) {
                nke0 nke0VarM7660c = appEventCollection2.m7660c(accessTokenAppIdPair);
                if (nke0VarM7660c == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest graphRequestM7724h = m7724h(accessTokenAppIdPair, nke0VarM7660c, zM8022A, flushResults);
                if (graphRequestM7724h != null) {
                    arrayList.add(graphRequestM7724h);
                    if (pv0.INSTANCE.m171491e()) {
                        AppEventsConversionsAPITransformerWebRequests.m7689l(graphRequestM7724h);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m7726j(@NotNull final FlushReason reason) {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            reason.getClass();
            singleThreadExecutor.execute(new Runnable() { // from class: l.iv0
                @Override // java.lang.Runnable
                public final void run() {
                    C1552d.m7718b(reason);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m7727k(@NotNull FlushReason reason) {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            reason.getClass();
            appEventCollection.m7659b(C1538c.m7664a());
            try {
                cti ctiVarM7731o = m7731o(reason, appEventCollection);
                if (ctiVarM7731o != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ctiVarM7731o.getNumEvents());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ctiVarM7731o.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String());
                    yrv.m215864b(C1577c.m8047l()).m215867d(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Set<AccessTokenAppIdPair> m7728l() {
        if (lsb.m151554d(C1552d.class)) {
            return null;
        }
        try {
            return appEventCollection.m7663f();
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m7729m(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull GraphRequest request, @NotNull GraphResponse response, @NotNull final nke0 appEvents, @NotNull cti flushState) {
        String string;
        if (lsb.m151554d(C1552d.class)) {
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
            if (C1577c.m8029H(LoggingBehavior.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) request.getTag()).toString(2);
                    string.getClass();
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                uxv.Companion companion = uxv.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String str2 = TAG;
                str2.getClass();
                companion.m196208c(loggingBehavior, str2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.getGraphObject()), str, string);
            }
            appEvents.m159827b(error != null);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                C1577c.m8056u().execute(new Runnable() { // from class: l.lv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1552d.m7717a(accessTokenAppId, appEvents);
                    }
                });
            }
            if (flushResult == FlushResult.SUCCESS || flushState.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String() == flushResult2) {
                return;
            }
            flushState.m108688d(flushResult);
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m7730n() {
        if (lsb.m151554d(C1552d.class)) {
            return;
        }
        try {
            singleThreadExecutor.execute(new Runnable() { // from class: l.kv0
                @Override // java.lang.Runnable
                public final void run() {
                    C1552d.m7722f();
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final cti m7731o(@NotNull FlushReason reason, @NotNull C1537b appEventCollection2) {
        if (lsb.m151554d(C1552d.class)) {
            return null;
        }
        try {
            reason.getClass();
            appEventCollection2.getClass();
            cti ctiVar = new cti();
            List<GraphRequest> listM7725i = m7725i(appEventCollection2, ctiVar);
            if (listM7725i.isEmpty()) {
                return null;
            }
            uxv.Companion companion = uxv.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.m196208c(loggingBehavior, str, "Flushing %d events due to %s.", Integer.valueOf(ctiVar.getNumEvents()), reason.toString());
            Iterator<GraphRequest> it = listM7725i.iterator();
            while (it.hasNext()) {
                it.next().m7525j();
            }
            return ctiVar;
        } catch (Throwable th) {
            lsb.m151552b(th, C1552d.class);
            return null;
        }
    }
}
