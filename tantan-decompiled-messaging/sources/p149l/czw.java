package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.views.RingProgressBarView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.SetInfoProgressView;
import java.util.Locale;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class czw implements s7m<zyw> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f83121a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f83122b;

    /* JADX INFO: renamed from: c */
    public VImage f83123c;

    /* JADX INFO: renamed from: d */
    public SetInfoProgressView f83124d;

    /* JADX INFO: renamed from: e */
    public VFrame f83125e;

    /* JADX INFO: renamed from: f */
    public RingProgressBarView f83126f;

    /* JADX INFO: renamed from: g */
    public TextView f83127g;

    /* JADX INFO: renamed from: h */
    public TextView f83128h;

    /* JADX INFO: renamed from: i */
    public VFrame f83129i;

    /* JADX INFO: renamed from: j */
    public VFrame f83130j;

    /* JADX INFO: renamed from: k */
    public VButton f83131k;

    /* JADX INFO: renamed from: l */
    public MarryEditProfileSeriesAct f83132l;

    /* JADX INFO: renamed from: m */
    public zyw f83133m;

    public czw(@NonNull MarryEditProfileSeriesAct marryEditProfileSeriesAct) {
        this.f83132l = marryEditProfileSeriesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m109435i(View view) {
        this.f83133m.m220969I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m109436j(View view) {
        this.f83133m.m220970J0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f83132l;
    }

    /* JADX INFO: renamed from: c */
    public View m109437c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dzw.m114138b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct act() {
        return this.f83132l;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zyw zywVar) {
        this.f83133m = zywVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX INFO: renamed from: f */
    public void m109440f() {
        boolean z;
        this.f83123c.setImageResource(this.f83133m.m220981y0() ? e3c0.f89166z0 : e3c0.f89163y0);
        SetInfoProgressView setInfoProgressView = this.f83124d;
        if (!vwb.m200296J(this.f83133m.m220978s0())) {
            z = this.f83133m.m220978s0().size() > 1 && !m109443m();
        }
        xdl0.m208344M(setInfoProgressView, z);
        xdl0.m208344M(this.f83125e, m109443m());
        xdl0.m208329E0(this.f83123c, new View.OnClickListener() { // from class: l.azw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72389a.m109435i(view);
            }
        });
        xdl0.m208329E0(this.f83131k, new View.OnClickListener() { // from class: l.bzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78087a.m109436j(view);
            }
        });
        if (m109443m()) {
            xdl0.m208360X(this.f83129i, t100.m186890d(35.0f));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m109437c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m109441k(boolean z) {
        this.f83131k.setText(z ? "保存" : "下一步");
        if (this.f83132l.m47456c2() && z && !vwb.m200296J(this.f83133m.m220978s0()) && this.f83133m.m220978s0().get(this.f83133m.m220977r0()) == MarrySeriesType.PROFILE_FEATURED_AVATAR_AUTHENTICATION) {
            xdl0.m208344M(this.f83130j, false);
        } else {
            xdl0.m208344M(this.f83130j, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m109442l(int i, int i2) {
        this.f83124d.m53044d(i, i2);
        if (m109443m()) {
            int size = this.f83133m.m220980x0() ? (i2 + 1) - i : km90.m146483k(this.f83133m.m220979t0()).size();
            int i3 = i2 + 1;
            int i4 = 100 - ((size * 100) / i3);
            this.f83126f.setProgress(i4);
            this.f83127g.getPaint().setFakeBoldText(true);
            this.f83127g.setText("已完成" + i4 + "%");
            if (this.f83133m.m220980x0()) {
                this.f83128h.setText(String.format(Locale.getDefault(), "再添加 %d 项资料，为你推荐更多合适的人", Integer.valueOf(i3 - i)));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m109443m() {
        return this.f83132l.m47456c2() || this.f83133m.m220980x0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
