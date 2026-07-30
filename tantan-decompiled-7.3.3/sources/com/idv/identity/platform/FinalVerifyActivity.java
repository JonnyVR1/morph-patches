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
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import p153l.ac00;
import p153l.afm;
import p153l.azb;
import p153l.dfm;
import p153l.eec0;
import p153l.ffm;
import p153l.lfm;
import p153l.qk20;
import p153l.scc0;
import p153l.t0g0;
import p153l.y8c0;

/* JADX INFO: loaded from: classes7.dex */
public class FinalVerifyActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: c */
    private long f13433c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private final int f13434d = 1001;

    /* JADX INFO: renamed from: e */
    private final int f13435e = 1002;

    /* JADX INFO: renamed from: f */
    private final int f13436f = 1003;

    /* JADX INFO: renamed from: g */
    private final int f13437g = 1004;

    /* JADX INFO: renamed from: h */
    private String f13438h = "faceVideoDegradeZipFileName";

    /* JADX INFO: renamed from: i */
    private String f13439i = "photinusVideoDegradeZipFileName";

    /* JADX INFO: renamed from: j */
    private Handler f13440j = new Handler(new C3855a());

    /* JADX INFO: renamed from: k */
    Runnable f13441k = new RunnableC3858d();

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$a */
    public class C3855a implements Handler.Callback {
        public C3855a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Throwable {
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (1001 == i) {
                FinalVerifyActivity.this.m19171S0((String) message.obj);
            } else if (1003 == i) {
                FinalVerifyActivity.this.m19172T0(true);
            } else if (1002 == i) {
                FinalVerifyActivity.this.m19172T0(false);
            } else if (1004 == i) {
                FinalVerifyActivity.this.m19173U0();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$b */
    public class C3856b implements lfm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f13443a;

        public C3856b(long j) {
            this.f13443a = j;
        }

        @Override // p153l.lfm
        /* JADX INFO: renamed from: b */
        public void mo18770b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "verifyDeviceCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "message", str2, "tag", "onServerError", "timeCost", ((System.currentTimeMillis() - this.f13443a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            if (str != null && str.startsWith(dfm.f88198s)) {
                FinalVerifyActivity.this.m19174V0(str);
                return;
            }
            FinalVerifyActivity.this.m19174V0(dfm.f88193n + "_" + str);
        }

        @Override // p153l.lfm
        public void onSuccess() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "verifyDeviceCost", NotificationCompat.CATEGORY_STATUS, "success", "timeCost", ((System.currentTimeMillis() - this.f13443a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            FinalVerifyActivity.this.m19174V0(dfm.f88197r);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$c */
    public class C3857c implements InterfaceC3860f {
        public C3857c() {
        }

        @Override // com.idv.identity.platform.FinalVerifyActivity.InterfaceC3860f
        /* JADX INFO: renamed from: a */
        public void mo18771a() throws Throwable {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "finalVerifyNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            FinalVerifyActivity.this.m19172T0(true);
        }

        @Override // com.idv.identity.platform.FinalVerifyActivity.InterfaceC3860f
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "verify fail onCancel");
            FinalVerifyActivity.this.m19174V0(dfm.f88193n);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$d */
    public class RunnableC3858d implements Runnable {
        public RunnableC3858d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FinalVerifyActivity.this.m19176W0(true);
            String strM97458i0 = afm.m97360H().m97458i0();
            if (strM97458i0 == null) {
                FinalVerifyActivity.this.m19174V0(dfm.f88174E);
            } else if (ffm.f98804g.equals(strM97458i0) || ffm.f98801d.equals(strM97458i0)) {
                FinalVerifyActivity.this.m19174V0(dfm.f88197r);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$e */
    public class C3859e implements IdentityAlertOverlay.InterfaceC3864d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC3860f f13447a;

        public C3859e(InterfaceC3860f interfaceC3860f) {
            this.f13447a = interfaceC3860f;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        /* JADX INFO: renamed from: a */
        public void mo18769a() {
            InterfaceC3860f interfaceC3860f = this.f13447a;
            if (interfaceC3860f != null) {
                interfaceC3860f.mo18771a();
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        public void onCancel() {
            InterfaceC3860f interfaceC3860f = this.f13447a;
            if (interfaceC3860f != null) {
                interfaceC3860f.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.FinalVerifyActivity$f */
    public interface InterfaceC3860f {
        /* JADX INFO: renamed from: a */
        void mo18771a();

        void onCancel();
    }

    /* JADX INFO: renamed from: Q0 */
    private String m19169Q0() {
        String strCpm;
        String strCpm2;
        String strCpm3;
        String strCpm4;
        t0g0.m188742e(t0g0.C20202a.f171522j, null);
        JSONObject jSONObject = new JSONObject();
        String strM97364A = afm.m97360H().m97364A();
        if (!TextUtils.isEmpty(strM97364A)) {
            jSONObject.put("faceFileName", (Object) strM97364A);
        }
        Bitmap bitmapM97504y = afm.m97360H().m97504y();
        if (bitmapM97504y != null && (strCpm4 = IdentityUtils.cpm(ac00.m96783b(bitmapM97504y), 1)) != null) {
            jSONObject.put("faceFileSignature", (Object) strCpm4);
        }
        if (afm.m97360H().m97379F() == 2) {
            String strM97469m = afm.m97360H().m97469m();
            if (!TextUtils.isEmpty(strM97469m)) {
                jSONObject.put("backupFaceFileName", (Object) strM97469m);
            }
            Bitmap bitmapM97463k = afm.m97360H().m97463k();
            if (bitmapM97463k != null && (strCpm3 = IdentityUtils.cpm(ac00.m96783b(bitmapM97463k), 1)) != null) {
                jSONObject.put("backupFaceFileSignature", (Object) strCpm3);
            }
        }
        if (!TextUtils.isEmpty(afm.m97360H().m97373D())) {
            jSONObject.put("faceFarFileName", (Object) afm.m97360H().m97373D());
        }
        if (!TextUtils.isEmpty(afm.m97360H().m97390J())) {
            jSONObject.put("faceNearFileName", (Object) afm.m97360H().m97390J());
        }
        if (!TextUtils.isEmpty(afm.m97360H().m97476o0())) {
            String strM97476o0 = afm.m97360H().m97476o0();
            if (!TextUtils.isEmpty(strM97476o0)) {
                if (strM97476o0.endsWith(".zip")) {
                    jSONObject.put("faceVideoDegradeZipFileName", (Object) strM97476o0);
                } else {
                    jSONObject.put("faceVideoFileName", (Object) strM97476o0);
                }
            }
            String strM97479p0 = afm.m97360H().m97479p0();
            if (!TextUtils.isEmpty(strM97479p0) && (strCpm2 = IdentityUtils.cpm(ac00.m96784c(strM97479p0), 1)) != null) {
                jSONObject.put("faceVideoFileSignature", (Object) strCpm2);
            }
        }
        if (!TextUtils.isEmpty(afm.m97360H().m97449f0())) {
            String strM97449f0 = afm.m97360H().m97449f0();
            if (!TextUtils.isEmpty(strM97449f0)) {
                if (strM97449f0.endsWith(".zip")) {
                    jSONObject.put("photinusVideoDegradeZipFileName", (Object) strM97449f0);
                } else {
                    jSONObject.put("photinusVideoFileName", (Object) strM97449f0);
                }
            }
            String strM97452g0 = afm.m97360H().m97452g0();
            if (!TextUtils.isEmpty(strM97452g0) && (strCpm = IdentityUtils.cpm(ac00.m96784c(strM97452g0), 1)) != null) {
                jSONObject.put("photinusVideoFileSignature", (Object) strCpm);
            }
        }
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: R0 */
    private String m19170R0() {
        JSONObject jSONObject = new JSONObject();
        String strM97429X = afm.m97360H().m97429X();
        if (!TextUtils.isEmpty(strM97429X)) {
            jSONObject.put("idFaceFileName", (Object) strM97429X);
        }
        String strM97420T = afm.m97360H().m97420T();
        if (!TextUtils.isEmpty(strM97420T)) {
            jSONObject.put("idNationalEmblemFileName", (Object) strM97420T);
        }
        String strM97405O = afm.m97360H().m97405O();
        if (!TextUtils.isEmpty(strM97405O)) {
            jSONObject.put("bankCardFileName", (Object) strM97405O);
        }
        return jSONObject.toJSONString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m19171S0(String str) {
        afm.m97360H().m97445e(str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public void m19172T0(boolean z) throws Throwable {
        String strM97458i0 = afm.m97360H().m97458i0();
        if (strM97458i0 == null) {
            return;
        }
        String strM19170R0 = (ffm.f98804g.equals(strM97458i0) || ffm.f98801d.equals(strM97458i0) || ffm.f98802e.equals(strM97458i0)) ? m19170R0() : null;
        String strM19169Q0 = m19169Q0();
        String strM97472n = afm.m97360H().m97472n();
        ac00.m96783b(afm.m97360H().m97504y());
        qk20.m176914k(strM97472n, strM19170R0, strM19169Q0, null, false, z, new C3856b(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m19173U0() {
        m19175X0(getString(com.idv.identity.base.R$string.f12711F), getString(com.idv.identity.base.R$string.f12731P), getString(com.idv.identity.base.R$string.f12734R), getString(com.idv.identity.base.R$string.f12729O), new C3857c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public void m19174V0(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f13440j.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: X0 */
    private void m19175X0(String str, String str2, String str3, String str4, InterfaceC3860f interfaceC3860f) {
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(scc0.f167226o);
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
            identityAlertOverlay.setCommAlertOverlayListener(new C3859e(interfaceC3860f));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m19176W0(boolean z) {
        FrameLayout frameLayout = (FrameLayout) findViewById(scc0.f167228q);
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
        setContentView(eec0.f93637f);
        TextView textView = (TextView) findViewById(scc0.f167227p);
        if (textView != null) {
            textView.setTextColor(azb.f74127c.getVerifyLoadingColor(y8c0.f197990e));
            textView.setText(getString(com.idv.identity.base.R$string.f12730O0));
        }
        this.f13440j.post(this.f13441k);
        this.f13433c = System.currentTimeMillis();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enterFinalVerifyActivity", NotificationCompat.CATEGORY_STATUS, "success");
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m19176W0(false);
        this.f13440j.removeCallbacks(this.f13441k);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyFinalVerifyActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13433c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
        RecordService.getInstance().flush();
    }
}
