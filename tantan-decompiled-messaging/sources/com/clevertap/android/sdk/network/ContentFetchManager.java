package com.clevertap.android.sdk.network;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.c4e;
import p149l.dpb0;
import p149l.fxc0;
import p149l.gnq;
import p149l.ih3;
import p149l.jh3;
import p149l.ln5;
import p149l.lw3;
import p149l.n95;
import p149l.nwb;
import p149l.p85;
import p149l.ppb;
import p149l.pwb;
import p149l.qs9;
import p149l.ryg0;
import p149l.s06;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001*BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020$¢\u0006\u0004\b)\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010<\u001a\u0004\b4\u0010=\"\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010BR\u001c\u0010G\u001a\n E*\u0004\u0018\u00010D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010F¨\u0006I"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/ContentFetchManager;", "", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/qs9;", "coreMetaData", "Ll/dpb0;", "queueHeaderBuilder", "Ll/nwb;", "ctApiWrapper", "", "parallelRequests", "Ll/n95;", "clock", "Ll/c4e;", "dispatchers", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/qs9;Ll/dpb0;Ll/nwb;ILl/n95;Ll/c4e;)V", "Lorg/json/JSONArray;", "contentFetchItems", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "e", "(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "f", "(Ljava/lang/String;)Lorg/json/JSONObject;", "content", "", "k", "(Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/fxc0;", "response", "isUserSwitching", RXScreenCaptureService.KEY_INDEX, "(Ll/fxc0;Z)Z", "", "j", "()V", "h", "(Lorg/json/JSONArray;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "a", "Ll/qs9;", "b", "Ll/dpb0;", "c", "Ll/nwb;", "I", "Ll/n95;", "Ll/c4e;", "Ll/p85;", "g", "Ll/p85;", "getClevertapResponseHandler", "()Ll/p85;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/p85;)V", "clevertapResponseHandler", "Ll/ln5;", "Ll/ln5;", "()Ll/ln5;", "setParentJob", "(Ll/ln5;)V", "parentJob", "Ll/ppb;", "Ll/ppb;", "scope", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "logger", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ContentFetchManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final qs9 coreMetaData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final dpb0 queueHeaderBuilder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final nwb ctApiWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int parallelRequests;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final c4e dispatchers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private p85 clevertapResponseHandler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private ln5 parentJob;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private ppb scope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Logger logger;

    public ContentFetchManager(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull qs9 qs9Var, @NotNull dpb0 dpb0Var, @NotNull nwb nwbVar, int i, @NotNull n95 n95Var, @NotNull c4e c4eVar) {
        cleverTapInstanceConfig.getClass();
        qs9Var.getClass();
        dpb0Var.getClass();
        nwbVar.getClass();
        n95Var.getClass();
        c4eVar.getClass();
        this.coreMetaData = qs9Var;
        this.queueHeaderBuilder = dpb0Var;
        this.ctApiWrapper = nwbVar;
        this.parallelRequests = i;
        this.clock = n95Var;
        this.dispatchers = c4eVar;
        ln5 ln5VarM181663b = ryg0.m181663b(null, 1, null);
        this.parentJob = ln5VarM181663b;
        this.scope = C15424f.m94055a(ln5VarM181663b.plus(c4eVar.mo105214a().limitedParallelism(i)));
        this.logger = cleverTapInstanceConfig.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final JSONArray m6773e(JSONArray contentFetchItems, String packageName) {
        JSONArray jSONArray = new JSONArray();
        int length = contentFetchItems.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = contentFetchItems.opt(i);
            if (objOpt != null) {
                try {
                    JSONObject jSONObjectM6774f = m6774f(packageName);
                    jSONObjectM6774f.put(Constants.KEY_EVT_DATA, objOpt);
                    jSONArray.put(jSONObjectM6774f);
                    this.logger.verbose("ContentFetch", "Added content fetch item: " + objOpt);
                } catch (Exception e) {
                    this.logger.verbose("ContentFetch", "Error adding content fetch item: " + objOpt, e);
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: f */
    private final JSONObject m6774f(String packageName) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", NotificationCompat.CATEGORY_EVENT);
        jSONObject.put(Constants.KEY_EVT_NAME, Constants.CONTENT_FETCH_JSON_RESPONSE_KEY);
        jSONObject.put(BLiveStormDanmakuGiftResourceType.f44446s, this.coreMetaData.m176213k());
        jSONObject.put("pg", qs9.m176168e());
        jSONObject.put("ep", this.clock.mo158531a());
        jSONObject.put("f", this.coreMetaData.m176176C());
        jSONObject.put("lsl", this.coreMetaData.m176217o());
        jSONObject.put("pai", packageName);
        String strM176221s = this.coreMetaData.m176221s();
        if (strM176221s != null) {
            jSONObject.put("n", strM176221s);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m6775i(fxc0 response, boolean isUserSwitching) {
        p85 p85Var;
        if (!response.m123626n()) {
            int code = response.getCode();
            Logger logger = this.logger;
            if (code == 429) {
                logger.info("ContentFetch", "Content fetch request was rate limited (429). Consider reducing request frequency.");
            } else {
                logger.info("ContentFetch", "Content fetch request failed with response code: " + response.getCode());
            }
            return false;
        }
        String strM123627q = response.m123627q();
        JSONObject jSONObjectM151954x = lw3.m151954x(strM123627q);
        this.logger.info("ContentFetch", "Content fetch response received successfully with isUserSwitching = " + isUserSwitching);
        if (strM123627q != null && jSONObjectM151954x != null && (p85Var = this.clevertapResponseHandler) != null) {
            p85Var.m167790a(false, jSONObjectM151954x, strM123627q, isUserSwitching);
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    private final void m6776j() {
        ln5 ln5VarM181663b = ryg0.m181663b(null, 1, null);
        this.parentJob = ln5VarM181663b;
        this.scope = C15424f.m94055a(ln5VarM181663b.plus(this.dispatchers.mo105214a().limitedParallelism(this.parallelRequests)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Object m6777k(JSONArray jSONArray, Continuation<? super Boolean> continuation) {
        JSONObject jSONObjectM112886s = this.queueHeaderBuilder.m112886s(null);
        if (jSONObjectM112886s == null) {
            return Boxing.m87370a(false);
        }
        s06 s06Var = new s06(jSONObjectM112886s, jSONArray);
        this.logger.debug("ContentFetch", "Fetching Content: " + s06Var);
        try {
            fxc0 fxc0VarM147536m = this.ctApiWrapper.m161866b().m147536m(s06Var);
            try {
                Boolean boolM87370a = Boxing.m87370a(m6775i(fxc0VarM147536m, !gnq.m127174o(continuation.getContext())));
                CloseableKt.m87404a(fxc0VarM147536m, null);
                return boolM87370a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(fxc0VarM147536m, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.debug("ContentFetch", "An exception occurred while fetching content.", e);
            return Boxing.m87370a(false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6778d() throws InterruptedException {
        this.logger.info("ContentFetch", "Cancelling pending content fetch jobs");
        InterfaceC15486o.a.m94245a(this.parentJob, null, 1, null);
        ih3.m136184b(null, new ContentFetchManager$cancelAllResponseJobs$1(this, null), 1, null);
        C15424f.m94058d(this.scope, null, 1, null);
        m6776j();
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final ln5 getParentJob() {
        return this.parentJob;
    }

    /* JADX INFO: renamed from: h */
    public final void m6780h(@NotNull JSONArray contentFetchItems, @NotNull String packageName) {
        contentFetchItems.getClass();
        packageName.getClass();
        jh3.m141367d(this.scope, null, null, new ContentFetchManager$handleContentFetch$1(this, contentFetchItems, packageName, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m6781l(@Nullable p85 p85Var) {
        this.clevertapResponseHandler = p85Var;
    }

    public /* synthetic */ ContentFetchManager(CleverTapInstanceConfig cleverTapInstanceConfig, qs9 qs9Var, dpb0 dpb0Var, nwb nwbVar, int i, n95 n95Var, c4e c4eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cleverTapInstanceConfig, qs9Var, dpb0Var, nwbVar, (i2 & 16) != 0 ? 5 : i, (i2 & 32) != 0 ? n95.f137721a : n95Var, (i2 & 64) != 0 ? new pwb() : c4eVar);
    }
}
