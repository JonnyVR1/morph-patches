package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.view.ScrollRecycleView;
import com.p046p1.mobile.putong.live.external.square.search.LiveSearchAct;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VSearchBar;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class dlt implements s7m<alt> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f86856a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f86857b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f86858c;

    /* JADX INFO: renamed from: d */
    public VImage f86859d;

    /* JADX INFO: renamed from: e */
    public VText f86860e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f86861f;

    /* JADX INFO: renamed from: g */
    public VImage f86862g;

    /* JADX INFO: renamed from: h */
    public VText f86863h;

    /* JADX INFO: renamed from: i */
    public VText f86864i;

    /* JADX INFO: renamed from: j */
    public VSearchBar f86865j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f86866k;

    /* JADX INFO: renamed from: l */
    public ScrollView f86867l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f86868m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f86869n;

    /* JADX INFO: renamed from: o */
    public VText f86870o;

    /* JADX INFO: renamed from: p */
    public View f86871p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f86872q;

    /* JADX INFO: renamed from: r */
    public VText f86873r;

    /* JADX INFO: renamed from: s */
    public ScrollRecycleView f86874s;

    /* JADX INFO: renamed from: t */
    public alt f86875t;

    /* JADX INFO: renamed from: u */
    public final LiveSearchAct f86876u;

    public dlt(LiveSearchAct liveSearchAct) {
        this.f86876u = liveSearchAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m112416e(View view) {
        this.f86876u.m44477e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m112417f(View view) {
        this.f86876u.hideInput(this.f86865j.getEditText());
    }

    /* JADX INFO: renamed from: i */
    private void m112418i(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = xdl0.m208331F0();
            this.f86857b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m112419m() {
        this.f86865j.setBackground(act().getAppTheme().mo105492b());
        this.f86865j.setLeftImageRes(h3c0.f105602C1);
        mep0.m154303e1(this.f86865j.getEditText(), g3c0.f100435p);
    }

    /* JADX INFO: renamed from: r */
    private void m112420r() {
        m112419m();
        xdl0.m208329E0(this.f86865j.getCancelText(), new View.OnClickListener() { // from class: l.blt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76214a.m112416e(view);
            }
        });
        xdl0.m208329E0(this.f86856a, new View.OnClickListener() { // from class: l.clt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81466a.m112417f(view);
            }
        });
        m112425l();
        this.f86865j.getCancelText().setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f86876u;
    }

    /* JADX INFO: renamed from: c */
    public View m112421c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return elt.m117156b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(alt altVar) {
        this.f86875t = altVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM112421c = m112421c(layoutInflater, viewGroup);
        m112420r();
        return viewM112421c;
    }

    /* JADX INFO: renamed from: j */
    public void m112423j(Boolean bool) {
        xdl0.m208345M0(this.f86858c, bool.booleanValue());
    }

    /* JADX INFO: renamed from: k */
    public void m112424k(Boolean bool) {
        xdl0.m208345M0(this.f86861f, bool.booleanValue());
    }

    /* JADX INFO: renamed from: l */
    public final void m112425l() {
        if (fpn0.m122619i(this.f86876u.f46224e)) {
            this.f86856a.setBackgroundColor(kvc0.m147352a(g1c0.f100147b));
            this.f86865j.setBackground(new ColorDrawable(kvc0.m147352a(g1c0.f100147b)));
            LiveSearchAct liveSearchAct = this.f86876u;
            liveSearchAct.setStatusBarColor(liveSearchAct.color(g1c0.f100148c));
            LiveSearchAct liveSearchAct2 = this.f86876u;
            liveSearchAct2.setNavigationBarColor(liveSearchAct2.color(g1c0.f100148c));
            m112418i(this.f86876u);
            this.f86865j.setCancelTextColor(kvc0.m147352a(g1c0.f100137A));
            this.f86865j.setEditTextBg(h3c0.f105699q);
            this.f86865j.setEditTextColor(kvc0.m147352a(g1c0.f100139C));
            this.f86865j.setEditTextHintColor(kvc0.m147352a(g1c0.f100171z));
            this.f86865j.setLeftImageRes(h3c0.f105716v1);
            this.f86865j.setRightImageRes(h3c0.f105719w1);
            this.f86873r.setTextColor(fpn0.m122615e(this.f86876u.f46224e).mo113377k());
            this.f86871p.setBackgroundColor(fpn0.m122615e(this.f86876u.f46224e).mo113368b());
            this.f86862g.setImageResource(fpn0.m122611a().mo108463c());
            this.f86863h.setTextColor(fpn0.m122611a().mo108466f());
            this.f86859d.setImageResource(fpn0.m122615e(this.f86876u.f46224e).mo113376j());
            this.f86860e.setTextColor(fpn0.m122615e(this.f86876u.f46224e).mo113373g());
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
