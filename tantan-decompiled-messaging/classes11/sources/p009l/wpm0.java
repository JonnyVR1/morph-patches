package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wpm0 {

    /* JADX INFO: renamed from: a */
    public String f22259a;

    /* JADX INFO: renamed from: b */
    public String f22260b;

    /* JADX INFO: renamed from: c */
    public String f22261c;

    /* JADX INFO: renamed from: d */
    public String f22262d;

    /* JADX INFO: renamed from: e */
    public String f22263e;

    /* JADX INFO: renamed from: f */
    public String f22264f;

    /* JADX INFO: renamed from: g */
    public String f22265g;

    /* JADX INFO: renamed from: h */
    public String f22266h;

    /* JADX INFO: renamed from: i */
    public String f22267i;

    /* JADX INFO: renamed from: j */
    public String f22268j;

    /* JADX INFO: renamed from: k */
    public String f22269k;

    /* JADX INFO: renamed from: l */
    public String f22270l;

    /* JADX INFO: renamed from: m */
    public String f22271m;

    /* JADX INFO: renamed from: n */
    public String f22272n;

    /* JADX INFO: renamed from: o */
    public boolean f22273o;

    /* JADX INFO: renamed from: p */
    public boolean f22274p;

    /* JADX INFO: renamed from: q */
    public long f22275q = -1;

    /* JADX INFO: renamed from: r */
    public String f22276r = "";

    /* JADX INFO: renamed from: s */
    public boolean f22277s;

    /* JADX INFO: renamed from: t */
    public int f22278t;

    public wpm0(PushMessageCustom pushMessageCustom) {
        if (!TextUtils.isEmpty(pushMessageCustom.id)) {
            this.f22263e = pushMessageCustom.id;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.caller)) {
            this.f22259a = pushMessageCustom.caller;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callee)) {
            this.f22260b = pushMessageCustom.callee;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callerDeviceId)) {
            this.f22262d = pushMessageCustom.callerDeviceId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.calleeDeviceId)) {
            this.f22261c = pushMessageCustom.calleeDeviceId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callerTokenV2)) {
            this.f22265g = pushMessageCustom.callerTokenV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.calleeTokenV2)) {
            this.f22264f = pushMessageCustom.calleeTokenV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.channelNameV2)) {
            this.f22266h = pushMessageCustom.channelNameV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.appId)) {
            this.f22267i = pushMessageCustom.appId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.rtcProvider)) {
            this.f22268j = pushMessageCustom.rtcProvider;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.businessType)) {
            this.f22269k = pushMessageCustom.businessType;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.scene)) {
            this.f22271m = pushMessageCustom.scene;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.roomId)) {
            this.f22270l = pushMessageCustom.roomId;
        }
        if (TextUtils.equals(pushMessageCustom.caller, CoreModule.H().userId())) {
            this.f22273o = true;
            this.f22272n = pushMessageCustom.callee;
        } else {
            this.f22273o = false;
            this.f22272n = pushMessageCustom.caller;
        }
        if (pushMessageCustom.mandatory) {
            this.f22274p = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24452a(wpm0 wpm0Var) {
        if (!TextUtils.isEmpty(wpm0Var.f22263e)) {
            this.f22263e = wpm0Var.f22263e;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22259a)) {
            this.f22259a = wpm0Var.f22259a;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22260b)) {
            this.f22260b = wpm0Var.f22260b;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22262d)) {
            this.f22262d = wpm0Var.f22262d;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22261c)) {
            this.f22261c = wpm0Var.f22261c;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22265g)) {
            this.f22265g = wpm0Var.f22265g;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22264f)) {
            this.f22264f = wpm0Var.f22264f;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22266h)) {
            this.f22266h = wpm0Var.f22266h;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22267i)) {
            this.f22267i = wpm0Var.f22267i;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22268j)) {
            this.f22268j = wpm0Var.f22268j;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22269k)) {
            this.f22269k = wpm0Var.f22269k;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22271m)) {
            this.f22271m = wpm0Var.f22271m;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22270l)) {
            this.f22270l = wpm0Var.f22270l;
        }
        if (!TextUtils.isEmpty(wpm0Var.f22272n)) {
            this.f22272n = wpm0Var.f22272n;
        }
        if (wpm0Var.f22273o) {
            this.f22273o = true;
        }
        if (wpm0Var.f22274p) {
            this.f22274p = true;
        }
        if (wpm0Var.f22277s) {
            this.f22277s = true;
        }
        this.f22278t = wpm0Var.f22278t;
        toString();
    }

    public String toString() {
        return "VoiceCallData{caller='" + this.f22259a + "', callee='" + this.f22260b + "', calleeDeviceId='" + this.f22261c + "', callerDeviceId='" + this.f22262d + "', voiceCallId='" + this.f22263e + "', calleeToken='" + this.f22264f + "', callerToken='" + this.f22265g + "', channelName='" + this.f22266h + "', appId='" + this.f22267i + "', rtcProvider='" + this.f22268j + "', businessType='" + this.f22269k + "', scene='" + this.f22271m + "', otherUserId='" + this.f22272n + "', isMeCaller=" + this.f22273o + ", mandatory=" + this.f22274p + ", duration=" + this.f22275q + ", endAction='" + this.f22276r + "', endBySelf=" + this.f22277s + ", roomId='" + this.f22270l + "'}";
    }

    public wpm0() {
    }
}
