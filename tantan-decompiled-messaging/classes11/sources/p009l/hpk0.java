package p009l;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.aie0;
import l.c4g0;
import l.e30;
import l.e51;
import l.f0m;
import l.fdb0;
import l.ipk0;
import l.mkd0;
import l.t100;
import l.v7c0;
import l.v930;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hpk0 extends aie0 {

    /* JADX INFO: renamed from: i */
    public ImageView f14209i;

    /* JADX INFO: renamed from: j */
    public ImageView f14210j;

    /* JADX INFO: renamed from: k */
    public TextView f14211k;

    /* JADX INFO: renamed from: l */
    public Act f14212l;

    /* JADX INFO: renamed from: m */
    public PopupWindow f14213m;

    /* JADX INFO: renamed from: n */
    public TabName f14214n = TabName.Card;

    /* JADX INFO: renamed from: o */
    public c4g0 f14215o;

    public hpk0(Act act) {
        this.f14212l = act;
    }

    /* JADX INFO: renamed from: A */
    public int m15907A() {
        Act act;
        v9j v9jVar = ((aie0) this).d;
        if ((v9jVar != null && !((Boolean) v9jVar.call()).booleanValue()) || (act = this.f14212l) == null || act.isFinishing()) {
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
            return 0;
        }
        if (m15911J()) {
            return 0;
        }
        PopupWindow popupWindow = new PopupWindow(m15908F(o7r.m19649a(this.f14212l), null), -1, -2);
        this.f14213m = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f14213m.setAnimationStyle(v7c0.D);
        this.f14210j.setOnClickListener(new View.OnClickListener() { // from class: l.fpk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13132a.m15913L(view);
            }
        });
        e51.H(this.f14212l, new Runnable() { // from class: l.gpk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13665a.m15909H();
            }
        }, 3000L);
        m15914M();
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: F */
    public View m15908F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ipk0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m15909H() {
        mkd0.z(this.f14215o);
        if (NullChecker.a(this.f14213m)) {
            this.f14213m.dismiss();
            this.f14213m = null;
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m15910I(Act act) {
        this.f14215o = act.duringCreated(v930.k().distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.epk0
            public final void call(Object obj) {
                this.f12656a.m15912K((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public boolean m15911J() {
        if (NullChecker.a(this.f14213m)) {
            return this.f14213m.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m15912K(TabName tabName) {
        this.f14214n = tabName;
        m15915N(tabName == TabName.Card);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m15913L(View view) {
        m15909H();
    }

    /* JADX INFO: renamed from: M */
    public final void m15914M() {
        View viewFindViewById = this.f14212l.findViewById(R.id.content);
        if (this.f14212l.isFinishing() || this.f14212l.isDestroyed() || this.f14213m.isShowing() || !NullChecker.a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f14213m.showAtLocation(viewFindViewById, 49, 0, -t100.q);
    }

    /* JADX INFO: renamed from: N */
    public void m15915N(boolean z) {
        if (NullChecker.a(this.f14213m)) {
            if (z) {
                m15914M();
            } else {
                this.f14213m.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m15916f(boolean z) {
        if (NullChecker.a(this.f14213m) && this.f14213m.isShowing()) {
            PopupWindow popupWindow = this.f14213m;
            if (z) {
                popupWindow.getContentView().setTranslationY(0.0f);
                this.f14213m.getContentView().setAlpha(1.0f);
            } else {
                popupWindow.getContentView().setTranslationY(-4000.0f);
                this.f14213m.getContentView().setAlpha(0.0f);
            }
        }
    }

    public boolean isValid() {
        return this.f14214n == TabName.Card;
    }

    /* JADX INFO: renamed from: j */
    public int m15917j() {
        return this.f14212l.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m15918m() {
        return this.f14212l;
    }

    /* JADX INFO: renamed from: n */
    public void m15919n(boolean z) {
        if (NullChecker.a(this.f14213m) && this.f14213m.isShowing()) {
            this.f14213m.dismiss();
            return;
        }
        f0m f0mVar = ((aie0) this).f;
        if (f0mVar != null) {
            f0mVar.a(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public String m15920o() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getGroup();
    }

    /* JADX INFO: renamed from: p */
    public String m15921p() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getId();
    }
}
