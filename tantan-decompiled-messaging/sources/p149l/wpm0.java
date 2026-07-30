package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: classes11.dex */
public class wpm0 {

    /* JADX INFO: renamed from: a */
    public String f187544a;

    /* JADX INFO: renamed from: b */
    public String f187545b;

    /* JADX INFO: renamed from: c */
    public String f187546c;

    /* JADX INFO: renamed from: d */
    public String f187547d;

    /* JADX INFO: renamed from: e */
    public String f187548e;

    /* JADX INFO: renamed from: f */
    public String f187549f;

    /* JADX INFO: renamed from: g */
    public String f187550g;

    /* JADX INFO: renamed from: h */
    public String f187551h;

    /* JADX INFO: renamed from: i */
    public String f187552i;

    /* JADX INFO: renamed from: j */
    public String f187553j;

    /* JADX INFO: renamed from: k */
    public String f187554k;

    /* JADX INFO: renamed from: l */
    public String f187555l;

    /* JADX INFO: renamed from: m */
    public String f187556m;

    /* JADX INFO: renamed from: n */
    public String f187557n;

    /* JADX INFO: renamed from: o */
    public boolean f187558o;

    /* JADX INFO: renamed from: p */
    public boolean f187559p;

    /* JADX INFO: renamed from: q */
    public long f187560q = -1;

    /* JADX INFO: renamed from: r */
    public String f187561r = "";

    /* JADX INFO: renamed from: s */
    public boolean f187562s;

    /* JADX INFO: renamed from: t */
    public int f187563t;

    public wpm0(PushMessageCustom pushMessageCustom) {
        if (!TextUtils.isEmpty(pushMessageCustom.f38805id)) {
            this.f187548e = pushMessageCustom.f38805id;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.caller)) {
            this.f187544a = pushMessageCustom.caller;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callee)) {
            this.f187545b = pushMessageCustom.callee;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callerDeviceId)) {
            this.f187547d = pushMessageCustom.callerDeviceId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.calleeDeviceId)) {
            this.f187546c = pushMessageCustom.calleeDeviceId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.callerTokenV2)) {
            this.f187550g = pushMessageCustom.callerTokenV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.calleeTokenV2)) {
            this.f187549f = pushMessageCustom.calleeTokenV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.channelNameV2)) {
            this.f187551h = pushMessageCustom.channelNameV2;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.appId)) {
            this.f187552i = pushMessageCustom.appId;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.rtcProvider)) {
            this.f187553j = pushMessageCustom.rtcProvider;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.businessType)) {
            this.f187554k = pushMessageCustom.businessType;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.scene)) {
            this.f187556m = pushMessageCustom.scene;
        }
        if (!TextUtils.isEmpty(pushMessageCustom.roomId)) {
            this.f187555l = pushMessageCustom.roomId;
        }
        if (TextUtils.equals(pushMessageCustom.caller, CoreModule.m29931H().userId())) {
            this.f187558o = true;
            this.f187557n = pushMessageCustom.callee;
        } else {
            this.f187558o = false;
            this.f187557n = pushMessageCustom.caller;
        }
        if (pushMessageCustom.mandatory) {
            this.f187559p = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m204928a(wpm0 wpm0Var) {
        if (!TextUtils.isEmpty(wpm0Var.f187548e)) {
            this.f187548e = wpm0Var.f187548e;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187544a)) {
            this.f187544a = wpm0Var.f187544a;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187545b)) {
            this.f187545b = wpm0Var.f187545b;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187547d)) {
            this.f187547d = wpm0Var.f187547d;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187546c)) {
            this.f187546c = wpm0Var.f187546c;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187550g)) {
            this.f187550g = wpm0Var.f187550g;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187549f)) {
            this.f187549f = wpm0Var.f187549f;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187551h)) {
            this.f187551h = wpm0Var.f187551h;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187552i)) {
            this.f187552i = wpm0Var.f187552i;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187553j)) {
            this.f187553j = wpm0Var.f187553j;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187554k)) {
            this.f187554k = wpm0Var.f187554k;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187556m)) {
            this.f187556m = wpm0Var.f187556m;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187555l)) {
            this.f187555l = wpm0Var.f187555l;
        }
        if (!TextUtils.isEmpty(wpm0Var.f187557n)) {
            this.f187557n = wpm0Var.f187557n;
        }
        if (wpm0Var.f187558o) {
            this.f187558o = true;
        }
        if (wpm0Var.f187559p) {
            this.f187559p = true;
        }
        if (wpm0Var.f187562s) {
            this.f187562s = true;
        }
        this.f187563t = wpm0Var.f187563t;
        toString();
    }

    public String toString() {
        return "VoiceCallData{caller='" + this.f187544a + "', callee='" + this.f187545b + "', calleeDeviceId='" + this.f187546c + "', callerDeviceId='" + this.f187547d + "', voiceCallId='" + this.f187548e + "', calleeToken='" + this.f187549f + "', callerToken='" + this.f187550g + "', channelName='" + this.f187551h + "', appId='" + this.f187552i + "', rtcProvider='" + this.f187553j + "', businessType='" + this.f187554k + "', scene='" + this.f187556m + "', otherUserId='" + this.f187557n + "', isMeCaller=" + this.f187558o + ", mandatory=" + this.f187559p + ", duration=" + this.f187560q + ", endAction='" + this.f187561r + "', endBySelf=" + this.f187562s + ", roomId='" + this.f187555l + "'}";
    }

    public wpm0() {
    }
}
