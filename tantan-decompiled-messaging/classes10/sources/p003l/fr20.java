package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import l.e30;
import l.j760;
import l.szd;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fr20 extends szd implements dsl {

    /* JADX INFO: renamed from: j */
    public final Act f4489j;

    /* JADX INFO: renamed from: k */
    public final CoreGiftPanelName f4490k;

    /* JADX INFO: renamed from: l */
    public bs20 f4491l;

    /* JADX INFO: renamed from: m */
    public rr20 f4492m;

    /* JADX INFO: renamed from: n */
    public ir20 f4493n;

    /* JADX INFO: renamed from: o */
    public View f4494o;

    /* JADX INFO: renamed from: p */
    public e30<CoreGiftInfo> f4495p;

    /* JADX INFO: renamed from: q */
    public final String f4496q;

    /* JADX INFO: renamed from: r */
    public final String f4497r;

    /* JADX INFO: renamed from: s */
    public String f4498s;

    /* JADX INFO: renamed from: t */
    public int f4499t;

    /* JADX INFO: renamed from: u */
    public int f4500u;

    public fr20(Act act, CoreGiftPanelName coreGiftPanelName, e30<CoreGiftInfo> e30Var, String str, String str2) {
        super(act, false, m6492I(coreGiftPanelName));
        this.f4499t = -1;
        this.f4495p = e30Var;
        this.f4489j = act;
        this.f4490k = coreGiftPanelName;
        this.f4496q = str;
        this.f4497r = str2;
        m6498J();
        m6493M();
    }

    /* JADX INFO: renamed from: I */
    private static int m6492I(CoreGiftPanelName coreGiftPanelName) {
        return (coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get(GiftSubBizType.greet)) ? x7c0.f8384k : x7c0.f8378e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    private void m6493M() {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
        setCancelable(true);
    }

    /* JADX INFO: renamed from: E */
    public View m6494E() {
        View viewInflateView = this.f4491l.inflateView(this.f4489j.getLayoutInflater(), null);
        this.f4494o = viewInflateView;
        return viewInflateView;
    }

    /* JADX INFO: renamed from: F */
    public String m6495F() {
        return this.f4497r;
    }

    /* JADX INFO: renamed from: G */
    public CoreGiftPanelName m6496G() {
        return this.f4490k;
    }

    /* JADX INFO: renamed from: H */
    public ir20 m6497H() {
        if (this.f4493n == null) {
            this.f4493n = new ir20(this.f4492m);
        }
        return this.f4493n;
    }

    /* JADX INFO: renamed from: J */
    public void m6498J() {
        this.f4492m = new rr20(this, this);
        bs20 bs20Var = new bs20(this.f4489j);
        this.f4491l = bs20Var;
        this.f4492m.C(bs20Var);
    }

    /* JADX INFO: renamed from: K */
    public void m6499K() {
        this.f4492m.m9169n();
    }

    /* JADX INFO: renamed from: L */
    public String m6500L() {
        return this.f4496q;
    }

    /* JADX INFO: renamed from: N */
    public String m6501N() {
        return this.f4498s;
    }

    @Override // p003l.dsl
    /* JADX INFO: renamed from: b */
    public void mo5637b(String str) {
        this.f4498s = str;
    }

    @Override // p003l.dsl
    /* JADX INFO: renamed from: d */
    public void mo5638d(int i) {
        this.f4500u = i;
    }

    @Override // p003l.dsl
    /* JADX INFO: renamed from: j */
    public void mo5639j() {
        show();
    }

    @Override // p003l.dsl
    /* JADX INFO: renamed from: k */
    public void mo5640k(int i) {
        this.f4499t = i;
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        View viewM6494E = m6494E();
        this.f4494o = viewM6494E;
        setContentView(viewM6494E);
        m6493M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        super/*android.app.Dialog*/.onStart();
        m6499K();
    }

    public void onStop() {
        super/*l.hu0*/.onStop();
        this.f4492m.destroy();
    }

    public void show() {
        super.show();
        this.f4491l.m5808v();
        if (TextUtils.equals(this.f4497r, "from_meet_picks")) {
            zvf0.A("e_chat_gift_bar", this.f4496q, new j760[]{vwb.Y("showfrom_meet_sayhi", "picks_say_hi")});
            return;
        }
        boolean zEquals = TextUtils.equals(this.f4497r, "from_meet_liked");
        String str = this.f4496q;
        if (zEquals) {
            zvf0.A("e_chat_gift_bar", str, new j760[]{vwb.Y("showfrom_meet_sayhi", "I_like_say_hi")});
        } else {
            zvf0.x("e_chat_gift_bar", str);
        }
    }
}
