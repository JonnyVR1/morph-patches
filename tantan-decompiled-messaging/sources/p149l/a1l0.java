package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartData;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes13.dex */
public class a1l0 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f67186a;

    /* JADX INFO: renamed from: b */
    public final wlu f67187b;

    public a1l0() {
        this.f67186a = false;
        this.f67187b = null;
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(Act act) {
        Intent intentM69164Z1;
        super.mo94566a(act);
        if (this.f67186a) {
            wlk0.m203819a().m203821c(this.f67187b);
            VChatStartData vChatStartData = new VChatStartData();
            vChatStartData.isFromWindow = true;
            intentM69164Z1 = LiveVChatAct.m69165a2(act, vChatStartData);
        } else {
            intentM69164Z1 = LiveVChatAct.m69164Z1(act);
        }
        intentM69164Z1.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        act.startActivity(intentM69164Z1);
        act.overridePendingTransition(wzb0.f188722e, 0);
        if (this.f67186a) {
            return;
        }
        dt0.m113504D(act);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "VideoAnchorChatActChecker";
    }

    public a1l0(boolean z, wlu wluVar) {
        this.f67186a = z;
        this.f67187b = wluVar;
    }
}
