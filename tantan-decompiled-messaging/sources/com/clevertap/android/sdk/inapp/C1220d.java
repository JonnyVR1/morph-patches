package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p149l.h160;
import p149l.nul;
import p149l.yom;
import p149l.z360;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006 "}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/d;", "Ll/h160;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Ll/yom;", "inAppListener", "Ll/z360;", "showFailureHandler", "Ll/nul;", "logger", "<init>", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/yom;Ll/z360;Ll/nul;)V", "", Constants.INAPP_DATA_TAG, "()V", "onClose", "h", "e", "a", "g", "b", "", "url", "error", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Ll/yom;", "Ll/z360;", "Ll/nul;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C1220d implements h160 {

    @NotNull
    private static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CTInAppNotification inAppNotification;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final yom inAppListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final z360 showFailureHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.d$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/d$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1220d(@NotNull CTInAppNotification cTInAppNotification, @NotNull yom yomVar, @NotNull z360 z360Var, @NotNull nul nulVar) {
        cTInAppNotification.getClass();
        yomVar.getClass();
        z360Var.getClass();
        nulVar.getClass();
        this.inAppNotification = cTInAppNotification;
        this.inAppListener = yomVar;
        this.showFailureHandler = z360Var;
        this.logger = nulVar;
    }

    @Override // p149l.h160
    /* JADX INFO: renamed from: a */
    public void mo6312a() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onCollapse for campaign: " + this.inAppNotification.getCampaignId());
    }

    @Override // p149l.h160
    /* JADX INFO: renamed from: b */
    public void mo6313b() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onPlaybackPaused for campaign: " + this.inAppNotification.getCampaignId());
    }

    @Override // p149l.h160
    /* JADX INFO: renamed from: c */
    public void mo6314c() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onShowFailed for campaign: " + this.inAppNotification.getCampaignId());
        this.showFailureHandler.mo6267a(this.inAppNotification);
    }

    @Override // p149l.h160
    /* JADX INFO: renamed from: d */
    public void mo6315d() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onShow for campaign: " + this.inAppNotification.getCampaignId());
        this.inAppListener.mo5863s0(this.inAppNotification, null);
    }

    @Override // p149l.h160
    /* JADX INFO: renamed from: e */
    public void mo6316e() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onExpand for campaign: " + this.inAppNotification.getCampaignId());
    }

    @Override // p149l.h160
    /* JADX INFO: renamed from: f */
    public void mo6317f(@NotNull String url, @NotNull String error) {
        url.getClass();
        error.getClass();
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onMediaError for campaign: " + this.inAppNotification.getCampaignId() + ", url: " + url + ", error: " + error);
    }

    @Override // p149l.h160
    /* JADX INFO: renamed from: g */
    public void mo6318g() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onPlaybackStarted for campaign: " + this.inAppNotification.getCampaignId());
    }

    @Override // p149l.h160
    /* JADX INFO: renamed from: h */
    public void mo6319h() {
        String strOptString;
        JSONObject pipConfigJson = this.inAppNotification.getPipConfigJson();
        JSONObject jSONObjectOptJSONObject = pipConfigJson != null ? pipConfigJson.optJSONObject("onClick") : null;
        CTInAppAction cTInAppActionM6131b = CTInAppAction.INSTANCE.m6131b(jSONObjectOptJSONObject);
        if (cTInAppActionM6131b == null) {
            return;
        }
        String str = (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("c2a", "")) == null) ? "" : strOptString;
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onAction for campaign: " + this.inAppNotification.getCampaignId() + ", type: " + cTInAppActionM6131b.getType());
        this.inAppListener.mo5864y0(this.inAppNotification, cTInAppActionM6131b, str, null, null);
    }

    @Override // p149l.h160
    public void onClose() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onClose for campaign: " + this.inAppNotification.getCampaignId());
        this.inAppListener.mo5854J(this.inAppNotification, null);
    }
}
