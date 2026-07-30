package p149l;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class hpk0 extends aie0 {

    /* JADX INFO: renamed from: i */
    public ImageView f108938i;

    /* JADX INFO: renamed from: j */
    public ImageView f108939j;

    /* JADX INFO: renamed from: k */
    public TextView f108940k;

    /* JADX INFO: renamed from: l */
    public Act f108941l;

    /* JADX INFO: renamed from: m */
    public PopupWindow f108942m;

    /* JADX INFO: renamed from: n */
    public TabName f108943n = TabName.Card;

    /* JADX INFO: renamed from: o */
    public c4g0 f108944o;

    public hpk0(Act act) {
        this.f108941l = act;
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        Act act;
        v9j<Boolean> v9jVar = this.f69975d;
        if ((v9jVar != null && !v9jVar.call().booleanValue()) || (act = this.f108941l) == null || act.isFinishing()) {
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
            return 0;
        }
        if (m132363J()) {
            return 0;
        }
        PopupWindow popupWindow = new PopupWindow(m132360F(o7r.m163037a(this.f108941l), null), -1, -2);
        this.f108942m = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f108942m.setAnimationStyle(v7c0.f180349D);
        this.f108939j.setOnClickListener(new View.OnClickListener() { // from class: l.fpk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98716a.m132365L(view);
            }
        });
        e51.m114743H(this.f108941l, new Runnable() { // from class: l.gpk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103806a.m132361H();
            }
        }, 3000L);
        m132366M();
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: F */
    public View m132360F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ipk0.m137560b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m132361H() {
        mkd0.m154992z(this.f108944o);
        if (NullChecker.m81303a(this.f108942m)) {
            this.f108942m.dismiss();
            this.f108942m = null;
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m132362I(Act act) {
        this.f108944o = act.duringCreated(v930.m197537k().distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.epk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92687a.m132364K((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public boolean m132363J() {
        if (NullChecker.m81303a(this.f108942m)) {
            return this.f108942m.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m132364K(TabName tabName) {
        this.f108943n = tabName;
        m132367N(tabName == TabName.Card);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m132365L(View view) {
        m132361H();
    }

    /* JADX INFO: renamed from: M */
    public final void m132366M() {
        View viewFindViewById = this.f108941l.findViewById(R.id.content);
        if (this.f108941l.isFinishing() || this.f108941l.isDestroyed() || this.f108942m.isShowing() || !NullChecker.m81303a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f108942m.showAtLocation(viewFindViewById, 49, 0, -t100.f167268q);
    }

    /* JADX INFO: renamed from: N */
    public void m132367N(boolean z) {
        if (NullChecker.m81303a(this.f108942m)) {
            if (z) {
                m132366M();
            } else {
                this.f108942m.dismiss();
            }
        }
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
        if (NullChecker.m81303a(this.f108942m) && this.f108942m.isShowing()) {
            PopupWindow popupWindow = this.f108942m;
            if (z) {
                popupWindow.getContentView().setTranslationY(0.0f);
                this.f108942m.getContentView().setAlpha(1.0f);
            } else {
                popupWindow.getContentView().setTranslationY(-4000.0f);
                this.f108942m.getContentView().setAlpha(0.0f);
            }
        }
    }

    @Override // p149l.l0m
    public boolean isValid() {
        return this.f108943n == TabName.Card;
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f108941l.hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act mo21139m() {
        return this.f108941l;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        if (NullChecker.m81303a(this.f108942m) && this.f108942m.isShowing()) {
            this.f108942m.dismiss();
            return;
        }
        f0m f0mVar = this.f69977f;
        if (f0mVar != null) {
            f0mVar.mo21109a(this);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getGroup();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String mo21141p() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getId();
    }
}
