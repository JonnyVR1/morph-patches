package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.views.RingProgressBarView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.SetInfoProgressView;
import java.util.Locale;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class b2x implements iam<y1x> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f74675a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f74676b;

    /* JADX INFO: renamed from: c */
    public VImage f74677c;

    /* JADX INFO: renamed from: d */
    public SetInfoProgressView f74678d;

    /* JADX INFO: renamed from: e */
    public VFrame f74679e;

    /* JADX INFO: renamed from: f */
    public RingProgressBarView f74680f;

    /* JADX INFO: renamed from: g */
    public TextView f74681g;

    /* JADX INFO: renamed from: h */
    public TextView f74682h;

    /* JADX INFO: renamed from: i */
    public VFrame f74683i;

    /* JADX INFO: renamed from: j */
    public VFrame f74684j;

    /* JADX INFO: renamed from: k */
    public VButton f74685k;

    /* JADX INFO: renamed from: l */
    public MarryEditProfileSeriesAct f74686l;

    /* JADX INFO: renamed from: m */
    public y1x f74687m;

    public b2x(@NonNull MarryEditProfileSeriesAct marryEditProfileSeriesAct) {
        this.f74686l = marryEditProfileSeriesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m102256i(View view) {
        this.f74687m.m213986I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m102257j(View view) {
        this.f74687m.m213987J0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f74686l;
    }

    /* JADX INFO: renamed from: c */
    public View m102258c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c2x.m107726b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct act() {
        return this.f74686l;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(y1x y1xVar) {
        this.f74687m = y1xVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX INFO: renamed from: f */
    public void m102261f() {
        boolean z;
        this.f74677c.setImageResource(this.f74687m.m213998y0() ? kbc0.f124929z0 : kbc0.f124926y0);
        SetInfoProgressView setInfoProgressView = this.f74678d;
        if (!jyb.m147479J(this.f74687m.m213995s0())) {
            z = this.f74687m.m213995s0().size() > 1 && !m102264m();
        }
        bnl0.m105524M(setInfoProgressView, z);
        bnl0.m105524M(this.f74679e, m102264m());
        bnl0.m105509E0(this.f74677c, new View.OnClickListener() { // from class: l.z1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202609a.m102256i(view);
            }
        });
        bnl0.m105509E0(this.f74685k, new View.OnClickListener() { // from class: l.a2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68224a.m102257j(view);
            }
        });
        if (m102264m()) {
            bnl0.m105540X(this.f74683i, qa00.m175859d(35.0f));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m102258c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m102262k(boolean z) {
        this.f74685k.setText(z ? "保存" : "下一步");
        if (this.f74686l.m48639d2() && z && !jyb.m147479J(this.f74687m.m213995s0()) && this.f74687m.m213995s0().get(this.f74687m.m213994r0()) == MarrySeriesType.PROFILE_FEATURED_AVATAR_AUTHENTICATION) {
            bnl0.m105524M(this.f74684j, false);
        } else {
            bnl0.m105524M(this.f74684j, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m102263l(int i, int i2) {
        this.f74678d.m54227d(i, i2);
        if (m102264m()) {
            int size = this.f74687m.m213997x0() ? (i2 + 1) - i : ou90.m169277k(this.f74687m.m213996t0()).size();
            int i3 = i2 + 1;
            int i4 = 100 - ((size * 100) / i3);
            this.f74680f.setProgress(i4);
            this.f74681g.getPaint().setFakeBoldText(true);
            this.f74681g.setText("已完成" + i4 + "%");
            if (this.f74687m.m213997x0()) {
                this.f74682h.setText(String.format(Locale.getDefault(), "再添加 %d 项资料，为你推荐更多合适的人", Integer.valueOf(i3 - i)));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m102264m() {
        return this.f74686l.m48639d2() || this.f74687m.m213997x0();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
