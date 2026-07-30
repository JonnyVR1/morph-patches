package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: classes11.dex */
public class azm0 {

    /* JADX INFO: renamed from: a */
    public String f74153a;

    /* JADX INFO: renamed from: b */
    public String f74154b;

    /* JADX INFO: renamed from: c */
    public String f74155c;

    /* JADX INFO: renamed from: d */
    public String f74156d;

    /* JADX INFO: renamed from: e */
    public String f74157e;

    /* JADX INFO: renamed from: f */
    public String f74158f;

    /* JADX INFO: renamed from: g */
    public String f74159g;

    /* JADX INFO: renamed from: h */
    public String f74160h;

    /* JADX INFO: renamed from: i */
    public String f74161i;

    /* JADX INFO: renamed from: j */
    public String f74162j;

    /* JADX INFO: renamed from: k */
    public String f74163k;

    /* JADX INFO: renamed from: l */
    public String f74164l;

    /* JADX INFO: renamed from: m */
    public String f74165m;

    /* JADX INFO: renamed from: n */
    public String f74166n;

    /* JADX INFO: renamed from: o */
    public boolean f74167o;

    /* JADX INFO: renamed from: p */
    public boolean f74168p;

    /* JADX INFO: renamed from: q */
    public long f74169q = -1;

    /* JADX INFO: renamed from: r */
    public String f74170r = "";

    /* JADX INFO: renamed from: s */
    public boolean f74171s;

    /* JADX INFO: renamed from: t */
    public int f74172t;

    public azm0(PushMessageCustom pushMessageCustom) {
        if (!TextUtils.isEmpty(pushMessageCustom.f39653id)) {
            this.f74157e = pushMessageCustom.f39653id;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.caller)) {
            this.f74153a = pushMessageCustom.caller;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callee)) {
            this.f74154b = pushMessageCustom.callee;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callerDeviceId)) {
            this.f74156d = pushMessageCustom.callerDeviceId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.calleeDeviceId)) {
            this.f74155c = pushMessageCustom.calleeDeviceId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callerTokenV2)) {
            this.f74159g = pushMessageCustom.callerTokenV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.calleeTokenV2)) {
            this.f74158f = pushMessageCustom.calleeTokenV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.channelNameV2)) {
            this.f74160h = pushMessageCustom.channelNameV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.appId)) {
            this.f74161i = pushMessageCustom.appId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.rtcProvider)) {
            this.f74162j = pushMessageCustom.rtcProvider;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.businessType)) {
            this.f74163k = pushMessageCustom.businessType;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.scene)) {
            this.f74165m = pushMessageCustom.scene;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.roomId)) {
            this.f74164l = pushMessageCustom.roomId;
        }
        if (TextUtils.equals(pushMessageCustom.caller, CoreModule.m30929H().userId())) {
            this.f74167o = true;
            this.f74166n = pushMessageCustom.callee;
        } else {
            this.f74167o = false;
            this.f74166n = pushMessageCustom.caller;
        }
        if (pushMessageCustom.mandatory) {
            this.f74168p = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m101077a(azm0 azm0Var) {
        if (!TextUtils.isEmpty(azm0Var.f74157e)) {
            this.f74157e = azm0Var.f74157e;
        }
        if (!TextUtils.isEmpty(azm0Var.f74153a)) {
            this.f74153a = azm0Var.f74153a;
        }
        if (!TextUtils.isEmpty(azm0Var.f74154b)) {
            this.f74154b = azm0Var.f74154b;
        }
        if (!TextUtils.isEmpty(azm0Var.f74156d)) {
            this.f74156d = azm0Var.f74156d;
        }
        if (!TextUtils.isEmpty(azm0Var.f74155c)) {
            this.f74155c = azm0Var.f74155c;
        }
        if (!TextUtils.isEmpty(azm0Var.f74159g)) {
            this.f74159g = azm0Var.f74159g;
        }
        if (!TextUtils.isEmpty(azm0Var.f74158f)) {
            this.f74158f = azm0Var.f74158f;
        }
        if (!TextUtils.isEmpty(azm0Var.f74160h)) {
            this.f74160h = azm0Var.f74160h;
        }
        if (!TextUtils.isEmpty(azm0Var.f74161i)) {
            this.f74161i = azm0Var.f74161i;
        }
        if (!TextUtils.isEmpty(azm0Var.f74162j)) {
            this.f74162j = azm0Var.f74162j;
        }
        if (!TextUtils.isEmpty(azm0Var.f74163k)) {
            this.f74163k = azm0Var.f74163k;
        }
        if (!TextUtils.isEmpty(azm0Var.f74165m)) {
            this.f74165m = azm0Var.f74165m;
        }
        if (!TextUtils.isEmpty(azm0Var.f74164l)) {
            this.f74164l = azm0Var.f74164l;
        }
        if (!TextUtils.isEmpty(azm0Var.f74166n)) {
            this.f74166n = azm0Var.f74166n;
        }
        if (azm0Var.f74167o) {
            this.f74167o = true;
        }
        if (azm0Var.f74168p) {
            this.f74168p = true;
        }
        if (azm0Var.f74171s) {
            this.f74171s = true;
        }
        this.f74172t = azm0Var.f74172t;
        toString();
    }

    public String toString() {
        return "VoiceCallData{caller='" + this.f74153a + "', callee='" + this.f74154b + "', calleeDeviceId='" + this.f74155c + "', callerDeviceId='" + this.f74156d + "', voiceCallId='" + this.f74157e + "', calleeToken='" + this.f74158f + "', callerToken='" + this.f74159g + "', channelName='" + this.f74160h + "', appId='" + this.f74161i + "', rtcProvider='" + this.f74162j + "', businessType='" + this.f74163k + "', scene='" + this.f74165m + "', otherUserId='" + this.f74166n + "', isMeCaller=" + this.f74167o + ", mandatory=" + this.f74168p + ", duration=" + this.f74169q + ", endAction='" + this.f74170r + "', endBySelf=" + this.f74171s + ", roomId='" + this.f74164l + "'}";
    }

    public azm0() {
    }
}
