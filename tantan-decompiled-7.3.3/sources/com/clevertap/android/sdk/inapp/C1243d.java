package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p153l.arm;
import p153l.axl;
import p153l.ec60;
import p153l.m960;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006 "}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/d;", "Ll/m960;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Ll/arm;", "inAppListener", "Ll/ec60;", "showFailureHandler", "Ll/axl;", "logger", "<init>", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/arm;Ll/ec60;Ll/axl;)V", "", Constants.INAPP_DATA_TAG, "()V", "onClose", "h", "e", "a", "g", "b", "", "url", "error", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Ll/arm;", "Ll/ec60;", "Ll/axl;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C1243d implements m960 {

    @NotNull
    private static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CTInAppNotification inAppNotification;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final arm inAppListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ec60 showFailureHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.d$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/d$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1243d(@NotNull CTInAppNotification cTInAppNotification, @NotNull arm armVar, @NotNull ec60 ec60Var, @NotNull axl axlVar) {
        cTInAppNotification.getClass();
        armVar.getClass();
        ec60Var.getClass();
        axlVar.getClass();
        this.inAppNotification = cTInAppNotification;
        this.inAppListener = armVar;
        this.showFailureHandler = ec60Var;
        this.logger = axlVar;
    }

    @Override // p153l.m960
    /* JADX INFO: renamed from: a */
    public void mo6366a() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onCollapse for campaign: " + this.inAppNotification.getCampaignId());
    }

    @Override // p153l.m960
    /* JADX INFO: renamed from: b */
    public void mo6367b() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onPlaybackPaused for campaign: " + this.inAppNotification.getCampaignId());
    }

    @Override // p153l.m960
    /* JADX INFO: renamed from: c */
    public void mo6368c() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onShowFailed for campaign: " + this.inAppNotification.getCampaignId());
        this.showFailureHandler.mo6321a(this.inAppNotification);
    }

    @Override // p153l.m960
    /* JADX INFO: renamed from: d */
    public void mo6369d() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onShow for campaign: " + this.inAppNotification.getCampaignId());
        this.inAppListener.mo5918t0(this.inAppNotification, null);
    }

    @Override // p153l.m960
    /* JADX INFO: renamed from: e */
    public void mo6370e() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onExpand for campaign: " + this.inAppNotification.getCampaignId());
    }

    @Override // p153l.m960
    /* JADX INFO: renamed from: f */
    public void mo6371f(@NotNull String url, @NotNull String error) {
        url.getClass();
        error.getClass();
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onMediaError for campaign: " + this.inAppNotification.getCampaignId() + ", url: " + url + ", error: " + error);
    }

    @Override // p153l.m960
    /* JADX INFO: renamed from: g */
    public void mo6372g() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onPlaybackStarted for campaign: " + this.inAppNotification.getCampaignId());
    }

    @Override // p153l.m960
    /* JADX INFO: renamed from: h */
    public void mo6373h() {
        String strOptString;
        JSONObject pipConfigJson = this.inAppNotification.getPipConfigJson();
        JSONObject jSONObjectOptJSONObject = pipConfigJson != null ? pipConfigJson.optJSONObject("onClick") : null;
        CTInAppAction cTInAppActionM6185b = CTInAppAction.INSTANCE.m6185b(jSONObjectOptJSONObject);
        if (cTInAppActionM6185b == null) {
            return;
        }
        String str = (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("c2a", "")) == null) ? "" : strOptString;
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onAction for campaign: " + this.inAppNotification.getCampaignId() + ", type: " + cTInAppActionM6185b.getType());
        this.inAppListener.mo5906A0(this.inAppNotification, cTInAppActionM6185b, str, null, null);
    }

    @Override // p153l.m960
    public void onClose() {
        this.logger.debug("PIPInAppCallbacksBridge", "PIP onClose for campaign: " + this.inAppNotification.getCampaignId());
        this.inAppListener.mo5909K(this.inAppNotification, null);
    }
}
