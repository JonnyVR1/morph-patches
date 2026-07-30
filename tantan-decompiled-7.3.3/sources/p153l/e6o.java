package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class e6o implements iam<d6o> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f92291a;

    /* JADX INFO: renamed from: b */
    public VFrame f92292b;

    /* JADX INFO: renamed from: c */
    public View f92293c;

    /* JADX INFO: renamed from: d */
    public TabLayout f92294d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f92295e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f92296f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f92297g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f92298h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f92299i;

    /* JADX INFO: renamed from: j */
    public VText f92300j;

    /* JADX INFO: renamed from: k */
    public View f92301k;

    /* JADX INFO: renamed from: l */
    public VFrame f92302l;

    /* JADX INFO: renamed from: m */
    public NoSaveStateViewPager f92303m;

    /* JADX INFO: renamed from: n */
    public View f92304n;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return bnl0.m105508E(this.f92302l);
    }

    /* JADX INFO: renamed from: a */
    public View m119605a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f6o.m124320b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public void m119607c(Act act) {
        this.f92297g.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(38.0f), qa00.m175859d(38.0f)));
        this.f92299i.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(38.0f), qa00.m175859d(38.0f)));
        this.f92296f.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(38.0f), qa00.m175859d(38.0f)));
        bnl0.m105539W(this.f92297g, 0);
        bnl0.m105539W(this.f92299i, 0);
        bnl0.m105538V(this.f92297g, 0);
        bnl0.m105538V(this.f92299i, 0);
        bnl0.m105538V(this.f92296f, 0);
        this.f92296f.setPadding(qa00.m175859d(6.0f), qa00.m175859d(5.0f), qa00.m175859d(6.0f), qa00.m175859d(5.0f));
        this.f92297g.setPadding(qa00.m175859d(6.0f), qa00.m175859d(5.0f), qa00.m175859d(6.0f), qa00.m175859d(5.0f));
        this.f92299i.setPadding(qa00.m175859d(6.0f), qa00.m175859d(5.0f), qa00.m175859d(6.0f), qa00.m175859d(5.0f));
        this.f92297g.setBackgroundResource(nbc0.f141142a);
        this.f92299i.setBackgroundResource(nbc0.f141142a);
        this.f92298h.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(38.0f), qa00.m175859d(38.0f)));
        bnl0.m105539W(this.f92298h, 0);
        bnl0.m105538V(this.f92298h, 0);
        this.f92298h.setPadding(qa00.m175859d(6.0f), qa00.m175859d(5.0f), qa00.m175859d(6.0f), qa00.m175859d(5.0f));
        this.f92298h.setBackgroundResource(nbc0.f141142a);
        ViewGroup.LayoutParams layoutParams = this.f92302l.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = qa00.m175859d(44.0f);
            this.f92302l.setLayoutParams(layoutParams);
        }
        bnl0.m105542Z(this.f92292b, this.f92302l);
        bnl0.m105524M(this.f92293c, false);
        bnl0.m105540X(this.f92302l, ((ViewGroup.MarginLayoutParams) this.f92302l.getLayoutParams()).topMargin + qa00.m175859d(6.0f));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m119605a(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d6o d6oVar) {
    }
}
