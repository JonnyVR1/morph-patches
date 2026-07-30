package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.view.ScrollRecycleView;
import com.p051p1.mobile.putong.live.external.square.search.LiveSearchAct;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VSearchBar;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ent implements iam<bnt> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f94806a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f94807b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f94808c;

    /* JADX INFO: renamed from: d */
    public VImage f94809d;

    /* JADX INFO: renamed from: e */
    public VText f94810e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f94811f;

    /* JADX INFO: renamed from: g */
    public VImage f94812g;

    /* JADX INFO: renamed from: h */
    public VText f94813h;

    /* JADX INFO: renamed from: i */
    public VText f94814i;

    /* JADX INFO: renamed from: j */
    public VSearchBar f94815j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f94816k;

    /* JADX INFO: renamed from: l */
    public ScrollView f94817l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f94818m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f94819n;

    /* JADX INFO: renamed from: o */
    public VText f94820o;

    /* JADX INFO: renamed from: p */
    public View f94821p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f94822q;

    /* JADX INFO: renamed from: r */
    public VText f94823r;

    /* JADX INFO: renamed from: s */
    public ScrollRecycleView f94824s;

    /* JADX INFO: renamed from: t */
    public bnt f94825t;

    /* JADX INFO: renamed from: u */
    public final LiveSearchAct f94826u;

    public ent(LiveSearchAct liveSearchAct) {
        this.f94826u = liveSearchAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m121551e(View view) {
        this.f94826u.m45660g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m121552f(View view) {
        this.f94826u.hideInput(this.f94815j.getEditText());
    }

    /* JADX INFO: renamed from: i */
    private void m121553i(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = bnl0.m105511F0();
            this.f94807b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m121554m() {
        this.f94815j.setBackground(act().getAppTheme().mo134822b());
        this.f94815j.setLeftImageRes(nbc0.f141093C1);
        qnp0.m177262e1(this.f94815j.getEditText(), mbc0.f135697p);
    }

    /* JADX INFO: renamed from: r */
    private void m121555r() {
        m121554m();
        bnl0.m105509E0(this.f94815j.getCancelText(), new View.OnClickListener() { // from class: l.cnt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82786a.m121551e(view);
            }
        });
        bnl0.m105509E0(this.f94806a, new View.OnClickListener() { // from class: l.dnt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89829a.m121552f(view);
            }
        });
        m121560l();
        this.f94815j.getCancelText().setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f94826u;
    }

    /* JADX INFO: renamed from: c */
    public View m121556c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fnt.m126380b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bnt bntVar) {
        this.f94825t = bntVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM121556c = m121556c(layoutInflater, viewGroup);
        m121555r();
        return viewM121556c;
    }

    /* JADX INFO: renamed from: j */
    public void m121558j(Boolean bool) {
        bnl0.m105525M0(this.f94808c, bool.booleanValue());
    }

    /* JADX INFO: renamed from: k */
    public void m121559k(Boolean bool) {
        bnl0.m105525M0(this.f94811f, bool.booleanValue());
    }

    /* JADX INFO: renamed from: l */
    public final void m121560l() {
        if (jyn0.m147612i(this.f94826u.f47072e)) {
            this.f94806a.setBackgroundColor(n3d0.m161277a(m9c0.f135377b));
            this.f94815j.setBackground(new ColorDrawable(n3d0.m161277a(m9c0.f135377b)));
            LiveSearchAct liveSearchAct = this.f94826u;
            liveSearchAct.setStatusBarColor(liveSearchAct.color(m9c0.f135378c));
            LiveSearchAct liveSearchAct2 = this.f94826u;
            liveSearchAct2.setNavigationBarColor(liveSearchAct2.color(m9c0.f135378c));
            m121553i(this.f94826u);
            this.f94815j.setCancelTextColor(n3d0.m161277a(m9c0.f135367A));
            this.f94815j.setEditTextBg(nbc0.f141190q);
            this.f94815j.setEditTextColor(n3d0.m161277a(m9c0.f135369C));
            this.f94815j.setEditTextHintColor(n3d0.m161277a(m9c0.f135401z));
            this.f94815j.setLeftImageRes(nbc0.f141207v1);
            this.f94815j.setRightImageRes(nbc0.f141210w1);
            this.f94823r.setTextColor(jyn0.m147608e(this.f94826u.f47072e).mo192555k());
            this.f94821p.setBackgroundColor(jyn0.m147608e(this.f94826u.f47072e).mo192546b());
            this.f94812g.setImageResource(jyn0.m147604a().mo187673c());
            this.f94813h.setTextColor(jyn0.m147604a().mo187676f());
            this.f94809d.setImageResource(jyn0.m147608e(this.f94826u.f47072e).mo192554j());
            this.f94810e.setTextColor(jyn0.m147608e(this.f94826u.f47072e).mo192551g());
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
