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
public class atj extends szd implements dsl {

    /* JADX INFO: renamed from: j */
    public final Act f71616j;

    /* JADX INFO: renamed from: k */
    public final CoreGiftPanelName f71617k;

    /* JADX INFO: renamed from: l */
    public ytj f71618l;

    /* JADX INFO: renamed from: m */
    public ltj f71619m;

    /* JADX INFO: renamed from: n */
    public ysj f71620n;

    /* JADX INFO: renamed from: o */
    public View f71621o;

    /* JADX INFO: renamed from: p */
    public e30<CoreGiftInfo> f71622p;

    /* JADX INFO: renamed from: q */
    public final String f71623q;

    /* JADX INFO: renamed from: r */
    public final String f71624r;

    /* JADX INFO: renamed from: s */
    public String f71625s;

    /* JADX INFO: renamed from: t */
    public int f71626t;

    /* JADX INFO: renamed from: u */
    public int f71627u;

    public atj(Act act, CoreGiftPanelName coreGiftPanelName, e30<CoreGiftInfo> e30Var, String str, String str2) {
        super(act, false, m98802I(coreGiftPanelName));
        this.f71626t = -1;
        this.f71622p = e30Var;
        this.f71616j = act;
        this.f71617k = coreGiftPanelName;
        this.f71623q = str;
        this.f71624r = str2;
        m98808J();
        m98803M();
    }

    /* JADX INFO: renamed from: I */
    public static int m98802I(CoreGiftPanelName coreGiftPanelName) {
        return (coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get("greet")) ? x7c0.f191342k : x7c0.f191336e;
    }

    /* JADX INFO: renamed from: M */
    private void m98803M() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
        setCancelable(true);
    }

    /* JADX INFO: renamed from: E */
    public View m98804E() {
        View viewInflateView = this.f71618l.inflateView(this.f71616j.getLayoutInflater(), null);
        this.f71621o = viewInflateView;
        return viewInflateView;
    }

    /* JADX INFO: renamed from: F */
    public String m98805F() {
        return this.f71624r;
    }

    /* JADX INFO: renamed from: G */
    public CoreGiftPanelName m98806G() {
        return this.f71617k;
    }

    /* JADX INFO: renamed from: H */
    public ysj m98807H() {
        if (this.f71620n == null) {
            this.f71620n = new ysj(this.f71619m);
        }
        return this.f71620n;
    }

    /* JADX INFO: renamed from: J */
    public void m98808J() {
        this.f71619m = new ltj(this, this);
        ytj ytjVar = new ytj(this.f71616j);
        this.f71618l = ytjVar;
        this.f71619m.mo51532C(ytjVar);
    }

    /* JADX INFO: renamed from: K */
    public void m98809K() {
        this.f71619m.m151699l();
    }

    /* JADX INFO: renamed from: L */
    public String m98810L() {
        return this.f71623q;
    }

    /* JADX INFO: renamed from: N */
    public String m98811N() {
        return this.f71625s;
    }

    @Override // p149l.dsl
    /* JADX INFO: renamed from: b */
    public void mo98812b(String str) {
        this.f71625s = str;
    }

    @Override // p149l.dsl
    /* JADX INFO: renamed from: d */
    public void mo98813d(int i) {
        this.f71627u = i;
    }

    @Override // p149l.dsl
    /* JADX INFO: renamed from: j */
    public void mo98814j() {
        show();
    }

    @Override // p149l.dsl
    /* JADX INFO: renamed from: k */
    public void mo98815k(int i) {
        this.f71626t = i;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM98804E = m98804E();
        this.f71621o = viewM98804E;
        setContentView(viewM98804E);
        m98803M();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m98809K();
    }

    @Override // p149l.hu0, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.f71619m.destroy();
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        if (TextUtils.equals(this.f71624r, "from_meet_picks")) {
            zvf0.m220368A("e_chat_gift_bar", this.f71623q, vwb.m200311Y("showfrom_meet_sayhi", "picks_say_hi"));
            return;
        }
        boolean zEquals = TextUtils.equals(this.f71624r, "from_meet_liked");
        String str = this.f71623q;
        if (zEquals) {
            zvf0.m220368A("e_chat_gift_bar", str, vwb.m200311Y("showfrom_meet_sayhi", "I_like_say_hi"));
        } else {
            zvf0.m220402x("e_chat_gift_bar", str);
        }
    }
}
