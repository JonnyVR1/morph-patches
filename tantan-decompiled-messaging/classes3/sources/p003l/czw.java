package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.ui.profile.views.RingProgressBarView;
import com.p1.mobile.putong.core.ui.profile.views.SetInfoProgressView;
import java.util.Locale;
import l.dzw;
import l.e3c0;
import l.km90;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import p028v.VButton;
import p028v.VFrame;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class czw implements s7m<zyw> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f2874a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f2875b;

    /* JADX INFO: renamed from: c */
    public VImage f2876c;

    /* JADX INFO: renamed from: d */
    public SetInfoProgressView f2877d;

    /* JADX INFO: renamed from: e */
    public VFrame f2878e;

    /* JADX INFO: renamed from: f */
    public RingProgressBarView f2879f;

    /* JADX INFO: renamed from: g */
    public TextView f2880g;

    /* JADX INFO: renamed from: h */
    public TextView f2881h;

    /* JADX INFO: renamed from: i */
    public VFrame f2882i;

    /* JADX INFO: renamed from: j */
    public VFrame f2883j;

    /* JADX INFO: renamed from: k */
    public VButton f2884k;

    /* JADX INFO: renamed from: l */
    public MarryEditProfileSeriesAct f2885l;

    /* JADX INFO: renamed from: m */
    public zyw f2886m;

    public czw(@NonNull MarryEditProfileSeriesAct marryEditProfileSeriesAct) {
        this.f2885l = marryEditProfileSeriesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m3508i(View view) {
        this.f2886m.m9540I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m3509j(View view) {
        this.f2886m.m9541J0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3510C0() {
        return this.f2885l;
    }

    /* JADX INFO: renamed from: c */
    public View m3511c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dzw.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct act() {
        return this.f2885l;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m3515i1(zyw zywVar) {
        this.f2886m = zywVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX INFO: renamed from: f */
    public void m3514f() {
        boolean z;
        this.f2876c.setImageResource(this.f2886m.m9554y0() ? e3c0.z0 : e3c0.y0);
        SetInfoProgressView setInfoProgressView = this.f2877d;
        if (!vwb.J(this.f2886m.m9551s0())) {
            z = this.f2886m.m9551s0().size() > 1 && !m3518m();
        }
        xdl0.M(setInfoProgressView, z);
        xdl0.M(this.f2878e, m3518m());
        xdl0.E0(this.f2876c, new View.OnClickListener() { // from class: l.azw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2330a.m3508i(view);
            }
        });
        xdl0.E0(this.f2884k, new View.OnClickListener() { // from class: l.bzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2557a.m3509j(view);
            }
        });
        if (m3518m()) {
            xdl0.X(this.f2882i, t100.d(35.0f));
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3511c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m3516k(boolean z) {
        this.f2884k.setText(z ? "保存" : "下一步");
        if (this.f2885l.m503c2() && z && !vwb.J(this.f2886m.m9551s0()) && this.f2886m.m9551s0().get(this.f2886m.m9550r0()) == MarrySeriesType.PROFILE_FEATURED_AVATAR_AUTHENTICATION) {
            xdl0.M(this.f2883j, false);
        } else {
            xdl0.M(this.f2883j, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3517l(int i, int i2) {
        this.f2877d.d(i, i2);
        if (m3518m()) {
            int size = this.f2886m.m9553x0() ? (i2 + 1) - i : km90.k(this.f2886m.m9552t0()).size();
            int i3 = i2 + 1;
            int i4 = 100 - ((size * 100) / i3);
            this.f2879f.setProgress(i4);
            this.f2880g.getPaint().setFakeBoldText(true);
            this.f2880g.setText("已完成" + i4 + "%");
            if (this.f2886m.m9553x0()) {
                this.f2881h.setText(String.format(Locale.getDefault(), "再添加 %d 项资料，为你推荐更多合适的人", Integer.valueOf(i3 - i)));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3518m() {
        return this.f2885l.m503c2() || this.f2886m.m9553x0();
    }

    public void destroy() {
    }
}
