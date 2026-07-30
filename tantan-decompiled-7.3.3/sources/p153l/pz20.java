package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes3.dex */
public class pz20 extends g1e implements rul {

    /* JADX INFO: renamed from: j */
    public final Act f154706j;

    /* JADX INFO: renamed from: k */
    public final CoreGiftPanelName f154707k;

    /* JADX INFO: renamed from: l */
    public l030 f154708l;

    /* JADX INFO: renamed from: m */
    public b030 f154709m;

    /* JADX INFO: renamed from: n */
    public sz20 f154710n;

    /* JADX INFO: renamed from: o */
    public View f154711o;

    /* JADX INFO: renamed from: p */
    public y20<CoreGiftInfo> f154712p;

    /* JADX INFO: renamed from: q */
    public final String f154713q;

    /* JADX INFO: renamed from: r */
    public final String f154714r;

    /* JADX INFO: renamed from: s */
    public String f154715s;

    /* JADX INFO: renamed from: t */
    public int f154716t;

    /* JADX INFO: renamed from: u */
    public int f154717u;

    public pz20(Act act, CoreGiftPanelName coreGiftPanelName, y20<CoreGiftInfo> y20Var, String str, String str2) {
        super(act, false, m174327I(coreGiftPanelName));
        this.f154716t = -1;
        this.f154712p = y20Var;
        this.f154706j = act;
        this.f154707k = coreGiftPanelName;
        this.f154713q = str;
        this.f154714r = str2;
        m174333J();
        m174328M();
    }

    /* JADX INFO: renamed from: I */
    private static int m174327I(CoreGiftPanelName coreGiftPanelName) {
        return (coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get("greet")) ? cgc0.f81655k : cgc0.f81649e;
    }

    /* JADX INFO: renamed from: M */
    private void m174328M() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
        setCancelable(true);
    }

    /* JADX INFO: renamed from: E */
    public View m174329E() {
        View viewInflateView = this.f154708l.inflateView(this.f154706j.getLayoutInflater(), null);
        this.f154711o = viewInflateView;
        return viewInflateView;
    }

    /* JADX INFO: renamed from: F */
    public String m174330F() {
        return this.f154714r;
    }

    /* JADX INFO: renamed from: G */
    public CoreGiftPanelName m174331G() {
        return this.f154707k;
    }

    /* JADX INFO: renamed from: H */
    public sz20 m174332H() {
        if (this.f154710n == null) {
            this.f154710n = new sz20(this.f154709m);
        }
        return this.f154710n;
    }

    /* JADX INFO: renamed from: J */
    public void m174333J() {
        this.f154709m = new b030(this, this);
        l030 l030Var = new l030(this.f154706j);
        this.f154708l = l030Var;
        this.f154709m.mo52715C(l030Var);
    }

    /* JADX INFO: renamed from: K */
    public void m174334K() {
        this.f154709m.m101251n();
    }

    /* JADX INFO: renamed from: L */
    public String m174335L() {
        return this.f154713q;
    }

    /* JADX INFO: renamed from: N */
    public String m174336N() {
        return this.f154715s;
    }

    @Override // p153l.rul
    /* JADX INFO: renamed from: b */
    public void mo174337b(String str) {
        this.f154715s = str;
    }

    @Override // p153l.rul
    /* JADX INFO: renamed from: d */
    public void mo174338d(int i) {
        this.f154717u = i;
    }

    @Override // p153l.rul
    /* JADX INFO: renamed from: j */
    public void mo174339j() {
        show();
    }

    @Override // p153l.rul
    /* JADX INFO: renamed from: k */
    public void mo174340k(int i) {
        this.f154716t = i;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM174329E = m174329E();
        this.f154711o = viewM174329E;
        setContentView(viewM174329E);
        m174328M();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m174334K();
    }

    @Override // p153l.nu0, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.f154709m.destroy();
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        this.f154708l.m152274v();
        if (TextUtils.equals(this.f154714r, "from_meet_picks")) {
            i4g0.m138492A("e_chat_gift_bar", this.f154713q, jyb.m147494Y("showfrom_meet_sayhi", "picks_say_hi"));
            return;
        }
        boolean zEquals = TextUtils.equals(this.f154714r, "from_meet_liked");
        String str = this.f154713q;
        if (zEquals) {
            i4g0.m138492A("e_chat_gift_bar", str, jyb.m147494Y("showfrom_meet_sayhi", "I_like_say_hi"));
        } else {
            i4g0.m138526x("e_chat_gift_bar", str);
        }
    }
}
