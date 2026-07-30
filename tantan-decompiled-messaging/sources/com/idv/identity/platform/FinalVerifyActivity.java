package com.idv.identity.platform;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.util.IdentityUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import p149l.d300;
import p149l.hc20;
import p149l.kcm;
import p149l.ksf0;
import p149l.l4c0;
import p149l.mxb;
import p149l.ncm;
import p149l.pcm;
import p149l.s1c0;
import p149l.vcm;
import p149l.y5c0;

/* JADX INFO: loaded from: classes7.dex */
public class FinalVerifyActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: c */
    private long f12692c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private final int f12693d = 1001;

    /* JADX INFO: renamed from: e */
    private final int f12694e = 1002;

    /* JADX INFO: renamed from: f */
    private final int f12695f = 1003;

    /* JADX INFO: renamed from: g */
    private final int f12696g = 1004;

    /* JADX INFO: renamed from: h */
    private String f12697h = "faceVideoDegradeZipFileName";

    /* JADX INFO: renamed from: i */
    private String f12698i = "photinusVideoDegradeZipFileName";

    /* JADX INFO: renamed from: j */
    private Handler f12699j = new Handler(new C3696a());

    /* JADX INFO: renamed from: k */
    Runnable f12700k = new RunnableC3699d();

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$a */
    public class C3696a implements Handler.Callback {
        public C3696a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Throwable {
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (1001 == i) {
                FinalVerifyActivity.this.m18094R0((String) message.obj);
            } else if (1003 == i) {
                FinalVerifyActivity.this.m18095S0(true);
            } else if (1002 == i) {
                FinalVerifyActivity.this.m18095S0(false);
            } else if (1004 == i) {
                FinalVerifyActivity.this.m18096T0();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$b */
    public class C3697b implements vcm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12702a;

        public C3697b(long j) {
            this.f12702a = j;
        }

        @Override // p149l.vcm
        /* JADX INFO: renamed from: b */
        public void mo17693b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "verifyDeviceCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "message", str2, "tag", "onServerError", "timeCost", ((System.currentTimeMillis() - this.f12702a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            if (str != null && str.startsWith(ncm.f138209s)) {
                FinalVerifyActivity.this.m18097U0(str);
                return;
            }
            FinalVerifyActivity.this.m18097U0(ncm.f138204n + "_" + str);
        }

        @Override // p149l.vcm
        public void onSuccess() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "verifyDeviceCost", NotificationCompat.CATEGORY_STATUS, "success", "timeCost", ((System.currentTimeMillis() - this.f12702a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            FinalVerifyActivity.this.m18097U0(ncm.f138208r);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$c */
    public class C3698c implements InterfaceC3701f {
        public C3698c() {
        }

        @Override // com.idv.identity.platform.FinalVerifyActivity.InterfaceC3701f
        /* JADX INFO: renamed from: a */
        public void mo17694a() throws Throwable {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "finalVerifyNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            FinalVerifyActivity.this.m18095S0(true);
        }

        @Override // com.idv.identity.platform.FinalVerifyActivity.InterfaceC3701f
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "verify fail onCancel");
            FinalVerifyActivity.this.m18097U0(ncm.f138204n);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$d */
    public class RunnableC3699d implements Runnable {
        public RunnableC3699d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FinalVerifyActivity.this.m18099V0(true);
            String strM145550i0 = kcm.m145452H().m145550i0();
            if (strM145550i0 == null) {
                FinalVerifyActivity.this.m18097U0(ncm.f138185E);
            } else if (pcm.f148194g.equals(strM145550i0) || pcm.f148191d.equals(strM145550i0)) {
                FinalVerifyActivity.this.m18097U0(ncm.f138208r);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$e */
    public class C3700e implements IdentityAlertOverlay.InterfaceC3705d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC3701f f12706a;

        public C3700e(InterfaceC3701f interfaceC3701f) {
            this.f12706a = interfaceC3701f;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        /* JADX INFO: renamed from: a */
        public void mo17692a() {
            InterfaceC3701f interfaceC3701f = this.f12706a;
            if (interfaceC3701f != null) {
                interfaceC3701f.mo17694a();
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        public void onCancel() {
            InterfaceC3701f interfaceC3701f = this.f12706a;
            if (interfaceC3701f != null) {
                interfaceC3701f.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$f */
    public interface InterfaceC3701f {
        /* JADX INFO: renamed from: a */
        void mo17694a();

        void onCancel();
    }

    /* JADX INFO: renamed from: P0 */
    private String m18092P0() {
        String strCpm;
        String strCpm2;
        String strCpm3;
        String strCpm4;
        ksf0.m147071e(ksf0.C18071a.f124472j, null);
        JSONObject jSONObject = new JSONObject();
        String strM145456A = kcm.m145452H().m145456A();
        if (!TextUtils.isEmpty(strM145456A)) {
            jSONObject.put("faceFileName", (Object) strM145456A);
        }
        Bitmap bitmapM145596y = kcm.m145452H().m145596y();
        if (bitmapM145596y != null && (strCpm4 = IdentityUtils.cpm(d300.m109838b(bitmapM145596y), 1)) != null) {
            jSONObject.put("faceFileSignature", (Object) strCpm4);
        }
        if (kcm.m145452H().m145471F() == 2) {
            String strM145561m = kcm.m145452H().m145561m();
            if (!TextUtils.isEmpty(strM145561m)) {
                jSONObject.put("backupFaceFileName", (Object) strM145561m);
            }
            Bitmap bitmapM145555k = kcm.m145452H().m145555k();
            if (bitmapM145555k != null && (strCpm3 = IdentityUtils.cpm(d300.m109838b(bitmapM145555k), 1)) != null) {
                jSONObject.put("backupFaceFileSignature", (Object) strCpm3);
            }
        }
        if (!TextUtils.isEmpty(kcm.m145452H().m145465D())) {
            jSONObject.put("faceFarFileName", (Object) kcm.m145452H().m145465D());
        }
        if (!TextUtils.isEmpty(kcm.m145452H().m145482J())) {
            jSONObject.put("faceNearFileName", (Object) kcm.m145452H().m145482J());
        }
        if (!TextUtils.isEmpty(kcm.m145452H().m145568o0())) {
            String strM145568o0 = kcm.m145452H().m145568o0();
            if (!TextUtils.isEmpty(strM145568o0)) {
                if (strM145568o0.endsWith(".zip")) {
                    jSONObject.put("faceVideoDegradeZipFileName", (Object) strM145568o0);
                } else {
                    jSONObject.put("faceVideoFileName", (Object) strM145568o0);
                }
            }
            String strM145571p0 = kcm.m145452H().m145571p0();
            if (!TextUtils.isEmpty(strM145571p0) && (strCpm2 = IdentityUtils.cpm(d300.m109839c(strM145571p0), 1)) != null) {
                jSONObject.put("faceVideoFileSignature", (Object) strCpm2);
            }
        }
        if (!TextUtils.isEmpty(kcm.m145452H().m145541f0())) {
            String strM145541f0 = kcm.m145452H().m145541f0();
            if (!TextUtils.isEmpty(strM145541f0)) {
                if (strM145541f0.endsWith(".zip")) {
                    jSONObject.put("photinusVideoDegradeZipFileName", (Object) strM145541f0);
                } else {
                    jSONObject.put("photinusVideoFileName", (Object) strM145541f0);
                }
            }
            String strM145544g0 = kcm.m145452H().m145544g0();
            if (!TextUtils.isEmpty(strM145544g0) && (strCpm = IdentityUtils.cpm(d300.m109839c(strM145544g0), 1)) != null) {
                jSONObject.put("photinusVideoFileSignature", (Object) strCpm);
            }
        }
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: Q0 */
    private String m18093Q0() {
        JSONObject jSONObject = new JSONObject();
        String strM145521X = kcm.m145452H().m145521X();
        if (!TextUtils.isEmpty(strM145521X)) {
            jSONObject.put("idFaceFileName", (Object) strM145521X);
        }
        String strM145512T = kcm.m145452H().m145512T();
        if (!TextUtils.isEmpty(strM145512T)) {
            jSONObject.put("idNationalEmblemFileName", (Object) strM145512T);
        }
        String strM145497O = kcm.m145452H().m145497O();
        if (!TextUtils.isEmpty(strM145497O)) {
            jSONObject.put("bankCardFileName", (Object) strM145497O);
        }
        return jSONObject.toJSONString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public void m18094R0(String str) {
        kcm.m145452H().m145537e(str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m18095S0(boolean z) throws Throwable {
        String strM145550i0 = kcm.m145452H().m145550i0();
        if (strM145550i0 == null) {
            return;
        }
        String strM18093Q0 = (pcm.f148194g.equals(strM145550i0) || pcm.f148191d.equals(strM145550i0) || pcm.f148192e.equals(strM145550i0)) ? m18093Q0() : null;
        String strM18092P0 = m18092P0();
        String strM145564n = kcm.m145452H().m145564n();
        d300.m109838b(kcm.m145452H().m145596y());
        hc20.m130379k(strM145564n, strM18093Q0, strM18092P0, null, false, z, new C3697b(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public void m18096T0() {
        m18098W0(getString(com.idv.identity.base.R$string.f11970F), getString(com.idv.identity.base.R$string.f11990P), getString(com.idv.identity.base.R$string.f11993R), getString(com.idv.identity.base.R$string.f11988O), new C3698c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m18097U0(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f12699j.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: W0 */
    private void m18098W0(String str, String str2, String str3, String str4, InterfaceC3701f interfaceC3701f) {
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(l4c0.f126006o);
        if (identityAlertOverlay != null) {
            identityAlertOverlay.setTitleText(str);
            identityAlertOverlay.setMessageText(str2);
            if (str4 != null) {
                identityAlertOverlay.setCancelText(str4);
                identityAlertOverlay.setButtonType(true);
            } else {
                identityAlertOverlay.setButtonType(false);
            }
            identityAlertOverlay.setConfirmText(str3);
            identityAlertOverlay.setVisibility(0);
            identityAlertOverlay.setCommAlertOverlayListener(new C3700e(interfaceC3701f));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m18099V0(boolean z) {
        FrameLayout frameLayout = (FrameLayout) findViewById(l4c0.f126008q);
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 4);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(y5c0.f196412f);
        TextView textView = (TextView) findViewById(l4c0.f126007p);
        if (textView != null) {
            textView.setTextColor(mxb.f136153c.getVerifyLoadingColor(s1c0.f161879e));
            textView.setText(getString(com.idv.identity.base.R$string.f11989O0));
        }
        this.f12699j.post(this.f12700k);
        this.f12692c = System.currentTimeMillis();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enterFinalVerifyActivity", NotificationCompat.CATEGORY_STATUS, "success");
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m18099V0(false);
        this.f12699j.removeCallbacks(this.f12700k);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyFinalVerifyActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12692c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
        RecordService.getInstance().flush();
    }
}
