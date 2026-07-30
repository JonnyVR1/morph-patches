package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartData;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes9.dex */
public class fal0 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public final boolean f97990a;

    /* JADX INFO: renamed from: b */
    public final xnu f97991b;

    public fal0() {
        this.f97990a = false;
        this.f97991b = null;
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(Act act) {
        Intent intentM70347a2;
        super.mo96996a(act);
        if (this.f97990a) {
            cvk0.m112810a().m112812c(this.f97991b);
            VChatStartData vChatStartData = new VChatStartData();
            vChatStartData.isFromWindow = true;
            intentM70347a2 = LiveVChatAct.m70348b2(act, vChatStartData);
        } else {
            intentM70347a2 = LiveVChatAct.m70347a2(act);
        }
        intentM70347a2.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        act.startActivity(intentM70347a2);
        act.overridePendingTransition(q7c0.f155956e, 0);
        if (this.f97990a) {
            return;
        }
        it0.m142010D(act);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "VideoAnchorChatActChecker";
    }

    public fal0(boolean z, xnu xnuVar) {
        this.f97990a = z;
        this.f97991b = xnuVar;
    }
}
