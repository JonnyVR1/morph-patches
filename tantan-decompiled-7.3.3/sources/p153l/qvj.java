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
public class qvj extends g1e implements rul {

    /* JADX INFO: renamed from: j */
    public final Act f159762j;

    /* JADX INFO: renamed from: k */
    public final CoreGiftPanelName f159763k;

    /* JADX INFO: renamed from: l */
    public owj f159764l;

    /* JADX INFO: renamed from: m */
    public bwj f159765m;

    /* JADX INFO: renamed from: n */
    public ovj f159766n;

    /* JADX INFO: renamed from: o */
    public View f159767o;

    /* JADX INFO: renamed from: p */
    public y20<CoreGiftInfo> f159768p;

    /* JADX INFO: renamed from: q */
    public final String f159769q;

    /* JADX INFO: renamed from: r */
    public final String f159770r;

    /* JADX INFO: renamed from: s */
    public String f159771s;

    /* JADX INFO: renamed from: t */
    public int f159772t;

    /* JADX INFO: renamed from: u */
    public int f159773u;

    public qvj(Act act, CoreGiftPanelName coreGiftPanelName, y20<CoreGiftInfo> y20Var, String str, String str2) {
        super(act, false, m178290I(coreGiftPanelName));
        this.f159772t = -1;
        this.f159768p = y20Var;
        this.f159762j = act;
        this.f159763k = coreGiftPanelName;
        this.f159769q = str;
        this.f159770r = str2;
        m178296J();
        m178291M();
    }

    /* JADX INFO: renamed from: I */
    public static int m178290I(CoreGiftPanelName coreGiftPanelName) {
        return (coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get("greet")) ? cgc0.f81655k : cgc0.f81649e;
    }

    /* JADX INFO: renamed from: M */
    private void m178291M() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
        setCancelable(true);
    }

    /* JADX INFO: renamed from: E */
    public View m178292E() {
        View viewInflateView = this.f159764l.inflateView(this.f159762j.getLayoutInflater(), null);
        this.f159767o = viewInflateView;
        return viewInflateView;
    }

    /* JADX INFO: renamed from: F */
    public String m178293F() {
        return this.f159770r;
    }

    /* JADX INFO: renamed from: G */
    public CoreGiftPanelName m178294G() {
        return this.f159763k;
    }

    /* JADX INFO: renamed from: H */
    public ovj m178295H() {
        if (this.f159766n == null) {
            this.f159766n = new ovj(this.f159765m);
        }
        return this.f159766n;
    }

    /* JADX INFO: renamed from: J */
    public void m178296J() {
        this.f159765m = new bwj(this, this);
        owj owjVar = new owj(this.f159762j);
        this.f159764l = owjVar;
        this.f159765m.mo52715C(owjVar);
    }

    /* JADX INFO: renamed from: K */
    public void m178297K() {
        this.f159765m.m106708l();
    }

    /* JADX INFO: renamed from: L */
    public String m178298L() {
        return this.f159769q;
    }

    /* JADX INFO: renamed from: N */
    public String m178299N() {
        return this.f159771s;
    }

    @Override // p153l.rul
    /* JADX INFO: renamed from: b */
    public void mo174337b(String str) {
        this.f159771s = str;
    }

    @Override // p153l.rul
    /* JADX INFO: renamed from: d */
    public void mo174338d(int i) {
        this.f159773u = i;
    }

    @Override // p153l.rul
    /* JADX INFO: renamed from: j */
    public void mo174339j() {
        show();
    }

    @Override // p153l.rul
    /* JADX INFO: renamed from: k */
    public void mo174340k(int i) {
        this.f159772t = i;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM178292E = m178292E();
        this.f159767o = viewM178292E;
        setContentView(viewM178292E);
        m178291M();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m178297K();
    }

    @Override // p153l.nu0, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.f159765m.destroy();
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        if (TextUtils.equals(this.f159770r, "from_meet_picks")) {
            i4g0.m138492A("e_chat_gift_bar", this.f159769q, jyb.m147494Y("showfrom_meet_sayhi", "picks_say_hi"));
            return;
        }
        boolean zEquals = TextUtils.equals(this.f159770r, "from_meet_liked");
        String str = this.f159769q;
        if (zEquals) {
            i4g0.m138492A("e_chat_gift_bar", str, jyb.m147494Y("showfrom_meet_sayhi", "I_like_say_hi"));
        } else {
            i4g0.m138526x("e_chat_gift_bar", str);
        }
    }
}
