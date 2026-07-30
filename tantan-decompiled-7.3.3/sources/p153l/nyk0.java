package p153l;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class nyk0 extends fqe0 {

    /* JADX INFO: renamed from: i */
    public ImageView f144325i;

    /* JADX INFO: renamed from: j */
    public ImageView f144326j;

    /* JADX INFO: renamed from: k */
    public TextView f144327k;

    /* JADX INFO: renamed from: l */
    public Act f144328l;

    /* JADX INFO: renamed from: m */
    public PopupWindow f144329m;

    /* JADX INFO: renamed from: n */
    public TabName f144330n = TabName.Card;

    /* JADX INFO: renamed from: o */
    public kcg0 f144331o;

    public nyk0(Act act) {
        this.f144328l = act;
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        Act act;
        pcj<Boolean> pcjVar = this.f100279d;
        if ((pcjVar != null && !pcjVar.call().booleanValue()) || (act = this.f144328l) == null || act.isFinishing()) {
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
            return 0;
        }
        if (m165335J()) {
            return 0;
        }
        PopupWindow popupWindow = new PopupWindow(m165332F(p9r.m171370a(this.f144328l), null), -1, -2);
        this.f144329m = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f144329m.setAnimationStyle(agc0.f71110D);
        this.f144326j.setOnClickListener(new View.OnClickListener() { // from class: l.lyk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134110a.m165337L(view);
            }
        });
        l51.m152888H(this.f144328l, new Runnable() { // from class: l.myk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139416a.m165333H();
            }
        }, 3000L);
        m165338M();
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: F */
    public View m165332F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oyk0.m169876b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m165333H() {
        psd0.m173633z(this.f144331o);
        if (NullChecker.m82486a(this.f144329m)) {
            this.f144329m.dismiss();
            this.f144329m = null;
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m165334I(Act act) {
        this.f144331o = act.duringCreated(ji30.m144967k().distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.kyk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129327a.m165336K((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public boolean m165335J() {
        if (NullChecker.m82486a(this.f144329m)) {
            return this.f144329m.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m165336K(TabName tabName) {
        this.f144330n = tabName;
        m165339N(tabName == TabName.Card);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m165337L(View view) {
        m165333H();
    }

    /* JADX INFO: renamed from: M */
    public final void m165338M() {
        View viewFindViewById = this.f144328l.findViewById(R.id.content);
        if (this.f144328l.isFinishing() || this.f144328l.isDestroyed() || this.f144329m.isShowing() || !NullChecker.m82486a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f144329m.showAtLocation(viewFindViewById, 49, 0, -qa00.f156330q);
    }

    /* JADX INFO: renamed from: N */
    public void m165339N(boolean z) {
        if (NullChecker.m82486a(this.f144329m)) {
            if (z) {
                m165338M();
            } else {
                this.f144329m.dismiss();
            }
        }
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
        if (NullChecker.m82486a(this.f144329m) && this.f144329m.isShowing()) {
            PopupWindow popupWindow = this.f144329m;
            if (z) {
                popupWindow.getContentView().setTranslationY(0.0f);
                this.f144329m.getContentView().setAlpha(1.0f);
            } else {
                popupWindow.getContentView().setTranslationY(-4000.0f);
                this.f144329m.getContentView().setAlpha(0.0f);
            }
        }
    }

    @Override // p153l.f3m
    public boolean isValid() {
        return this.f144330n == TabName.Card;
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f144328l.hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act mo22138m() {
        return this.f144328l;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        if (NullChecker.m82486a(this.f144329m) && this.f144329m.isShowing()) {
            this.f144329m.dismiss();
            return;
        }
        z2m z2mVar = this.f100281f;
        if (z2mVar != null) {
            z2mVar.mo22108a(this);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getGroup();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String mo22140p() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getId();
    }
}
