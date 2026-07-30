package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes10.dex */
public class fr20 extends szd implements dsl {

    /* JADX INFO: renamed from: j */
    public final Act f98878j;

    /* JADX INFO: renamed from: k */
    public final CoreGiftPanelName f98879k;

    /* JADX INFO: renamed from: l */
    public bs20 f98880l;

    /* JADX INFO: renamed from: m */
    public rr20 f98881m;

    /* JADX INFO: renamed from: n */
    public ir20 f98882n;

    /* JADX INFO: renamed from: o */
    public View f98883o;

    /* JADX INFO: renamed from: p */
    public e30<CoreGiftInfo> f98884p;

    /* JADX INFO: renamed from: q */
    public final String f98885q;

    /* JADX INFO: renamed from: r */
    public final String f98886r;

    /* JADX INFO: renamed from: s */
    public String f98887s;

    /* JADX INFO: renamed from: t */
    public int f98888t;

    /* JADX INFO: renamed from: u */
    public int f98889u;

    public fr20(Act act, CoreGiftPanelName coreGiftPanelName, e30<CoreGiftInfo> e30Var, String str, String str2) {
        super(act, false, m122791I(coreGiftPanelName));
        this.f98888t = -1;
        this.f98884p = e30Var;
        this.f98878j = act;
        this.f98879k = coreGiftPanelName;
        this.f98885q = str;
        this.f98886r = str2;
        m122797J();
        m122792M();
    }

    /* JADX INFO: renamed from: I */
    private static int m122791I(CoreGiftPanelName coreGiftPanelName) {
        return (coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get("greet")) ? x7c0.f191342k : x7c0.f191336e;
    }

    /* JADX INFO: renamed from: M */
    private void m122792M() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
        setCancelable(true);
    }

    /* JADX INFO: renamed from: E */
    public View m122793E() {
        View viewInflateView = this.f98880l.inflateView(this.f98878j.getLayoutInflater(), null);
        this.f98883o = viewInflateView;
        return viewInflateView;
    }

    /* JADX INFO: renamed from: F */
    public String m122794F() {
        return this.f98886r;
    }

    /* JADX INFO: renamed from: G */
    public CoreGiftPanelName m122795G() {
        return this.f98879k;
    }

    /* JADX INFO: renamed from: H */
    public ir20 m122796H() {
        if (this.f98882n == null) {
            this.f98882n = new ir20(this.f98881m);
        }
        return this.f98882n;
    }

    /* JADX INFO: renamed from: J */
    public void m122797J() {
        this.f98881m = new rr20(this, this);
        bs20 bs20Var = new bs20(this.f98878j);
        this.f98880l = bs20Var;
        this.f98881m.mo51532C(bs20Var);
    }

    /* JADX INFO: renamed from: K */
    public void m122798K() {
        this.f98881m.m180532n();
    }

    /* JADX INFO: renamed from: L */
    public String m122799L() {
        return this.f98885q;
    }

    /* JADX INFO: renamed from: N */
    public String m122800N() {
        return this.f98887s;
    }

    @Override // p149l.dsl
    /* JADX INFO: renamed from: b */
    public void mo98812b(String str) {
        this.f98887s = str;
    }

    @Override // p149l.dsl
    /* JADX INFO: renamed from: d */
    public void mo98813d(int i) {
        this.f98889u = i;
    }

    @Override // p149l.dsl
    /* JADX INFO: renamed from: j */
    public void mo98814j() {
        show();
    }

    @Override // p149l.dsl
    /* JADX INFO: renamed from: k */
    public void mo98815k(int i) {
        this.f98888t = i;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM122793E = m122793E();
        this.f98883o = viewM122793E;
        setContentView(viewM122793E);
        m122792M();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m122798K();
    }

    @Override // p149l.hu0, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.f98881m.destroy();
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        this.f98880l.m103647v();
        if (TextUtils.equals(this.f98886r, "from_meet_picks")) {
            zvf0.m220368A("e_chat_gift_bar", this.f98885q, vwb.m200311Y("showfrom_meet_sayhi", "picks_say_hi"));
            return;
        }
        boolean zEquals = TextUtils.equals(this.f98886r, "from_meet_liked");
        String str = this.f98885q;
        if (zEquals) {
            zvf0.m220368A("e_chat_gift_bar", str, vwb.m200311Y("showfrom_meet_sayhi", "I_like_say_hi"));
        } else {
            zvf0.m220402x("e_chat_gift_bar", str);
        }
    }
}
