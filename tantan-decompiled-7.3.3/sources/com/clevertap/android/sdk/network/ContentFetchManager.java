package com.clevertap.android.sdk.network;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.bu9;
import p153l.byb;
import p153l.drb;
import p153l.dyb;
import p153l.fpq;
import p153l.hxb0;
import p153l.j5d0;
import p153l.kx3;
import p153l.oa5;
import p153l.po5;
import p153l.q5e;
import p153l.q95;
import p153l.wh3;
import p153l.x16;
import p153l.xh3;
import p153l.z6h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001*BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020$¢\u0006\u0004\b)\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010<\u001a\u0004\b4\u0010=\"\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010BR\u001c\u0010G\u001a\n E*\u0004\u0018\u00010D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010F¨\u0006I"}, m88121d2 = {"Lcom/clevertap/android/sdk/network/ContentFetchManager;", "", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/bu9;", "coreMetaData", "Ll/hxb0;", "queueHeaderBuilder", "Ll/byb;", "ctApiWrapper", "", "parallelRequests", "Ll/oa5;", "clock", "Ll/q5e;", "dispatchers", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/bu9;Ll/hxb0;Ll/byb;ILl/oa5;Ll/q5e;)V", "Lorg/json/JSONArray;", "contentFetchItems", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "e", "(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "f", "(Ljava/lang/String;)Lorg/json/JSONObject;", "content", "", "k", "(Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/j5d0;", "response", "isUserSwitching", RXScreenCaptureService.KEY_INDEX, "(Ll/j5d0;Z)Z", "", "j", "()V", "h", "(Lorg/json/JSONArray;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "a", "Ll/bu9;", "b", "Ll/hxb0;", "c", "Ll/byb;", "I", "Ll/oa5;", "Ll/q5e;", "Ll/q95;", "g", "Ll/q95;", "getClevertapResponseHandler", "()Ll/q95;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/q95;)V", "clevertapResponseHandler", "Ll/po5;", "Ll/po5;", "()Ll/po5;", "setParentJob", "(Ll/po5;)V", "parentJob", "Ll/drb;", "Ll/drb;", "scope", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "logger", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ContentFetchManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final bu9 coreMetaData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final hxb0 queueHeaderBuilder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final byb ctApiWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int parallelRequests;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final q5e dispatchers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private q95 clevertapResponseHandler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private po5 parentJob;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private drb scope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Logger logger;

    public ContentFetchManager(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull bu9 bu9Var, @NotNull hxb0 hxb0Var, @NotNull byb bybVar, int i, @NotNull oa5 oa5Var, @NotNull q5e q5eVar) {
        cleverTapInstanceConfig.getClass();
        bu9Var.getClass();
        hxb0Var.getClass();
        bybVar.getClass();
        oa5Var.getClass();
        q5eVar.getClass();
        this.coreMetaData = bu9Var;
        this.queueHeaderBuilder = hxb0Var;
        this.ctApiWrapper = bybVar;
        this.parallelRequests = i;
        this.clock = oa5Var;
        this.dispatchers = q5eVar;
        po5 po5VarM218802b = z6h0.m218802b(null, 1, null);
        this.parentJob = po5VarM218802b;
        this.scope = C15531f.m94947a(po5VarM218802b.plus(q5eVar.mo118662a().limitedParallelism(i)));
        this.logger = cleverTapInstanceConfig.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final JSONArray m6827e(JSONArray contentFetchItems, String packageName) {
        JSONArray jSONArray = new JSONArray();
        int length = contentFetchItems.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = contentFetchItems.opt(i);
            if (objOpt != null) {
                try {
                    JSONObject jSONObjectM6828f = m6828f(packageName);
                    jSONObjectM6828f.put(Constants.KEY_EVT_DATA, objOpt);
                    jSONArray.put(jSONObjectM6828f);
                    this.logger.verbose("ContentFetch", "Added content fetch item: " + objOpt);
                } catch (Exception e) {
                    this.logger.verbose("ContentFetch", "Error adding content fetch item: " + objOpt, e);
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: f */
    private final JSONObject m6828f(String packageName) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", NotificationCompat.CATEGORY_EVENT);
        jSONObject.put(Constants.KEY_EVT_NAME, Constants.CONTENT_FETCH_JSON_RESPONSE_KEY);
        jSONObject.put(BLiveStormDanmakuGiftResourceType.f45294s, this.coreMetaData.m106480k());
        jSONObject.put("pg", bu9.m106435e());
        jSONObject.put("ep", this.clock.mo166825a());
        jSONObject.put("f", this.coreMetaData.m106443C());
        jSONObject.put("lsl", this.coreMetaData.m106484o());
        jSONObject.put("pai", packageName);
        String strM106488s = this.coreMetaData.m106488s();
        if (strM106488s != null) {
            jSONObject.put("n", strM106488s);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m6829i(j5d0 response, boolean isUserSwitching) {
        q95 q95Var;
        if (!response.m143519n()) {
            int code = response.getCode();
            Logger logger = this.logger;
            if (code == 429) {
                logger.info("ContentFetch", "Content fetch request was rate limited (429). Consider reducing request frequency.");
            } else {
                logger.info("ContentFetch", "Content fetch request failed with response code: " + response.getCode());
            }
            return false;
        }
        String strM143520q = response.m143520q();
        JSONObject jSONObjectM151803x = kx3.m151803x(strM143520q);
        this.logger.info("ContentFetch", "Content fetch response received successfully with isUserSwitching = " + isUserSwitching);
        if (strM143520q != null && jSONObjectM151803x != null && (q95Var = this.clevertapResponseHandler) != null) {
            q95Var.m175834a(false, jSONObjectM151803x, strM143520q, isUserSwitching);
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    private final void m6830j() {
        po5 po5VarM218802b = z6h0.m218802b(null, 1, null);
        this.parentJob = po5VarM218802b;
        this.scope = C15531f.m94947a(po5VarM218802b.plus(this.dispatchers.mo118662a().limitedParallelism(this.parallelRequests)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Object m6831k(JSONArray jSONArray, Continuation<? super Boolean> continuation) {
        JSONObject jSONObjectM137579s = this.queueHeaderBuilder.m137579s(null);
        if (jSONObjectM137579s == null) {
            return Boxing.m88259a(false);
        }
        x16 x16Var = new x16(jSONObjectM137579s, jSONArray);
        this.logger.debug("ContentFetch", "Fetching Content: " + x16Var);
        try {
            j5d0 j5d0VarM217702m = this.ctApiWrapper.m106993b().m217702m(x16Var);
            try {
                Boolean boolM88259a = Boxing.m88259a(m6829i(j5d0VarM217702m, !fpq.m126716o(continuation.getContext())));
                CloseableKt.m88293a(j5d0VarM217702m, null);
                return boolM88259a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(j5d0VarM217702m, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.debug("ContentFetch", "An exception occurred while fetching content.", e);
            return Boxing.m88259a(false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6832d() throws InterruptedException {
        this.logger.info("ContentFetch", "Cancelling pending content fetch jobs");
        InterfaceC15593o.a.m95138a(this.parentJob, null, 1, null);
        wh3.m206334b(null, new ContentFetchManager$cancelAllResponseJobs$1(this, null), 1, null);
        C15531f.m94950d(this.scope, null, 1, null);
        m6830j();
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final po5 getParentJob() {
        return this.parentJob;
    }

    /* JADX INFO: renamed from: h */
    public final void m6834h(@NotNull JSONArray contentFetchItems, @NotNull String packageName) {
        contentFetchItems.getClass();
        packageName.getClass();
        xh3.m210980d(this.scope, null, null, new ContentFetchManager$handleContentFetch$1(this, contentFetchItems, packageName, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m6835l(@Nullable q95 q95Var) {
        this.clevertapResponseHandler = q95Var;
    }

    public /* synthetic */ ContentFetchManager(CleverTapInstanceConfig cleverTapInstanceConfig, bu9 bu9Var, hxb0 hxb0Var, byb bybVar, int i, oa5 oa5Var, q5e q5eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cleverTapInstanceConfig, bu9Var, hxb0Var, bybVar, (i2 & 16) != 0 ? 5 : i, (i2 & 32) != 0 ? oa5.f145660a : oa5Var, (i2 & 64) != 0 ? new dyb() : q5eVar);
    }
}
