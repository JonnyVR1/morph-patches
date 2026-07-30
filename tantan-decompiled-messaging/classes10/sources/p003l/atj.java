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
public class atj extends szd implements dsl {

    /* JADX INFO: renamed from: j */
    public final Act f2876j;

    /* JADX INFO: renamed from: k */
    public final CoreGiftPanelName f2877k;

    /* JADX INFO: renamed from: l */
    public ytj f2878l;

    /* JADX INFO: renamed from: m */
    public ltj f2879m;

    /* JADX INFO: renamed from: n */
    public ysj f2880n;

    /* JADX INFO: renamed from: o */
    public View f2881o;

    /* JADX INFO: renamed from: p */
    public e30<CoreGiftInfo> f2882p;

    /* JADX INFO: renamed from: q */
    public final String f2883q;

    /* JADX INFO: renamed from: r */
    public final String f2884r;

    /* JADX INFO: renamed from: s */
    public String f2885s;

    /* JADX INFO: renamed from: t */
    public int f2886t;

    /* JADX INFO: renamed from: u */
    public int f2887u;

    public atj(Act act, CoreGiftPanelName coreGiftPanelName, e30<CoreGiftInfo> e30Var, String str, String str2) {
        super(act, false, m5627I(coreGiftPanelName));
        this.f2886t = -1;
        this.f2882p = e30Var;
        this.f2876j = act;
        this.f2877k = coreGiftPanelName;
        this.f2883q = str;
        this.f2884r = str2;
        m5633J();
        m5628M();
    }

    /* JADX INFO: renamed from: I */
    public static int m5627I(CoreGiftPanelName coreGiftPanelName) {
        return (coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get(GiftSubBizType.greet)) ? x7c0.f8384k : x7c0.f8378e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    private void m5628M() {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
        setCancelable(true);
    }

    /* JADX INFO: renamed from: E */
    public View m5629E() {
        View viewInflateView = this.f2878l.inflateView(this.f2876j.getLayoutInflater(), null);
        this.f2881o = viewInflateView;
        return viewInflateView;
    }

    /* JADX INFO: renamed from: F */
    public String m5630F() {
        return this.f2884r;
    }

    /* JADX INFO: renamed from: G */
    public CoreGiftPanelName m5631G() {
        return this.f2877k;
    }

    /* JADX INFO: renamed from: H */
    public ysj m5632H() {
        if (this.f2880n == null) {
            this.f2880n = new ysj(this.f2879m);
        }
        return this.f2880n;
    }

    /* JADX INFO: renamed from: J */
    public void m5633J() {
        this.f2879m = new ltj(this, this);
        ytj ytjVar = new ytj(this.f2876j);
        this.f2878l = ytjVar;
        this.f2879m.C(ytjVar);
    }

    /* JADX INFO: renamed from: K */
    public void m5634K() {
        this.f2879m.m7908l();
    }

    /* JADX INFO: renamed from: L */
    public String m5635L() {
        return this.f2883q;
    }

    /* JADX INFO: renamed from: N */
    public String m5636N() {
        return this.f2885s;
    }

    @Override // p003l.dsl
    /* JADX INFO: renamed from: b */
    public void mo5637b(String str) {
        this.f2885s = str;
    }

    @Override // p003l.dsl
    /* JADX INFO: renamed from: d */
    public void mo5638d(int i) {
        this.f2887u = i;
    }

    @Override // p003l.dsl
    /* JADX INFO: renamed from: j */
    public void mo5639j() {
        show();
    }

    @Override // p003l.dsl
    /* JADX INFO: renamed from: k */
    public void mo5640k(int i) {
        this.f2886t = i;
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        View viewM5629E = m5629E();
        this.f2881o = viewM5629E;
        setContentView(viewM5629E);
        m5628M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        super/*android.app.Dialog*/.onStart();
        m5634K();
    }

    public void onStop() {
        super/*l.hu0*/.onStop();
        this.f2879m.destroy();
    }

    public void show() {
        super.show();
        if (TextUtils.equals(this.f2884r, "from_meet_picks")) {
            zvf0.A("e_chat_gift_bar", this.f2883q, new j760[]{vwb.Y("showfrom_meet_sayhi", "picks_say_hi")});
            return;
        }
        boolean zEquals = TextUtils.equals(this.f2884r, "from_meet_liked");
        String str = this.f2883q;
        if (zEquals) {
            zvf0.A("e_chat_gift_bar", str, new j760[]{vwb.Y("showfrom_meet_sayhi", "I_like_say_hi")});
        } else {
            zvf0.x("e_chat_gift_bar", str);
        }
    }
}
