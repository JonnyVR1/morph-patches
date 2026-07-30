package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pf2 {

    /* JADX INFO: renamed from: a */
    public ft5 f152149a = new ft5();

    /* JADX INFO: renamed from: b */
    public ki3 f152150b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ uxj0 m172069c(jk20 jk20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            jk20Var.m145151e(bitmap.copy(bitmap.getConfig(), false));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: d */
    public void m172070d(DefaultBulletView defaultBulletView) {
        if (!wft.m206159b(2)) {
            m172081q(defaultBulletView);
            return;
        }
        defaultBulletView.f50308f.setText(mo114496i());
        bnl0.m105525M0(defaultBulletView.f50308f, true);
        bnl0.m105525M0(defaultBulletView.f50309g, false);
    }

    /* JADX INFO: renamed from: e */
    public void m172071e(SpecialSystemBulletView specialSystemBulletView) {
        specialSystemBulletView.f50315e.setText(mo114496i());
        bnl0.m105525M0(specialSystemBulletView.f50315e, true);
        bnl0.m105525M0(specialSystemBulletView.f50316f, false);
    }

    /* JADX INFO: renamed from: f */
    public void m172072f(ki3 ki3Var) {
        this.f152150b = ki3Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX INFO: renamed from: g */
    public oo2 m172073g() {
        ki3 ki3Var = this.f152150b;
        if (ki3Var != null) {
            return ki3Var.m213810E2();
        }
        wtq0.m207906a("presenter 为空，必须先绑定 bulletBasePresenter");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m172074h() {
        return "bullet content = " + ((Object) mo114496i()) + " userId = " + uqb0.f180396b0.f170324a.userId() + m172076k();
    }

    /* JADX INFO: renamed from: i */
    public abstract CharSequence mo114496i();

    /* JADX INFO: renamed from: j */
    public GradientDrawable m172075j() {
        return fc2.m124980j(-50688, -31446, 11);
    }

    /* JADX INFO: renamed from: k */
    public final String m172076k() {
        oo2 oo2VarM172073g = m172073g();
        if (oo2VarM172073g == null) {
            return " data is null";
        }
        return " state = " + (oo2VarM172073g.m168538n0() != null ? oo2VarM172073g.m168538n0().state.toString() : "current live is null") + " anchorId = " + (oo2VarM172073g.m168532l0() != null ? oo2VarM172073g.m168532l0().f56859id : " null ") + " roomId = " + m172073g().m202194o() + " liveId = " + m172073g().m202191k() + " liveType = " + m172073g().mo118362A0();
    }

    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder mo172077l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public long mo172078m() {
        return 3000L;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m172079n(final DefaultBulletView defaultBulletView, final SpannableStringBuilder spannableStringBuilder, final jk20 jk20Var) {
        if (jk20Var.m145150d()) {
            return;
        }
        this.f152149a.m127297a(this.f152150b.act().duringCreated(izs.m142854e("context_common", jk20Var.m145149c().trim()).map(new qcj() { // from class: l.nf2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pf2.m172069c(jk20Var, (Bitmap) obj);
            }
        }).compose(psd0.m173592C())).subscribe(dhw.m115825d(new y20() { // from class: l.of2
            @Override // p153l.y20
            public final void call(Object obj) {
                defaultBulletView.f50308f.setText(spannableStringBuilder);
            }
        })));
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo114497o();

    /* JADX INFO: renamed from: p */
    public void m172080p() {
        this.f152149a.m127299c();
    }

    /* JADX INFO: renamed from: q */
    public void m172081q(final DefaultBulletView defaultBulletView) {
        final SpannableStringBuilder spannableStringBuilderMo172077l = mo172077l();
        if (NullChecker.m82486a(spannableStringBuilderMo172077l)) {
            jyb.m147537z(Arrays.asList((jk20[]) spannableStringBuilderMo172077l.getSpans(0, spannableStringBuilderMo172077l.length(), jk20.class)), new y20() { // from class: l.mf2
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f136586a.m172079n(defaultBulletView, spannableStringBuilderMo172077l, (jk20) obj);
                }
            });
            bnl0.m105525M0(defaultBulletView.f50308f, true);
            bnl0.m105525M0(defaultBulletView.f50309g, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo114498r(ViewGroup viewGroup, si3 si3Var);

    /* JADX INFO: renamed from: s */
    public void mo172082s() {
    }
}
