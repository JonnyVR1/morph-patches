package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class if2 {

    /* JADX INFO: renamed from: a */
    public bs5 f112954a = new bs5();

    /* JADX INFO: renamed from: b */
    public wh3 f112955b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ roj0 m135864c(ac20 ac20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ac20Var.m95712e(bitmap.copy(bitmap.getConfig(), false));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: d */
    public void m135865d(DefaultBulletView defaultBulletView) {
        if (!vdt.m198092b(2)) {
            m135878q(defaultBulletView);
            return;
        }
        defaultBulletView.f49460f.setText(mo135870i());
        xdl0.m208345M0(defaultBulletView.f49460f, true);
        xdl0.m208345M0(defaultBulletView.f49461g, false);
    }

    /* JADX INFO: renamed from: e */
    public void m135866e(SpecialSystemBulletView specialSystemBulletView) {
        specialSystemBulletView.f49467e.setText(mo135870i());
        xdl0.m208345M0(specialSystemBulletView.f49467e, true);
        xdl0.m208345M0(specialSystemBulletView.f49468f, false);
    }

    /* JADX INFO: renamed from: f */
    public void m135867f(wh3 wh3Var) {
        this.f112955b = wh3Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: g */
    public ho2 m135868g() {
        wh3 wh3Var = this.f112955b;
        if (wh3Var != null) {
            return wh3Var.m206027E2();
        }
        qkq0.m175383a("presenter 为空，必须先绑定 bulletBasePresenter");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m135869h() {
        return "bullet content = " + ((Object) mo135870i()) + " userId = " + qib0.f154713b0.f139230a.userId() + m135872k();
    }

    /* JADX INFO: renamed from: i */
    public abstract CharSequence mo135870i();

    /* JADX INFO: renamed from: j */
    public GradientDrawable m135871j() {
        return yb2.m213885j(-50688, -31446, 11);
    }

    /* JADX INFO: renamed from: k */
    public final String m135872k() {
        ho2 ho2VarM135868g = m135868g();
        if (ho2VarM135868g == null) {
            return " data is null";
        }
        return " state = " + (ho2VarM135868g.m132152n0() != null ? ho2VarM135868g.m132152n0().state.toString() : "current live is null") + " anchorId = " + (ho2VarM135868g.m132146l0() != null ? ho2VarM135868g.m132146l0().f56011id : " null ") + " roomId = " + m135868g().m149818o() + " liveId = " + m135868g().m149814k() + " liveType = " + m135868g().mo132054A0();
    }

    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder mo135873l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public long mo135874m() {
        return 3000L;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m135875n(final DefaultBulletView defaultBulletView, final SpannableStringBuilder spannableStringBuilder, final ac20 ac20Var) {
        if (ac20Var.m95711d()) {
            return;
        }
        this.f112954a.m103655a(this.f112955b.act().duringCreated(hxs.m133392e("context_common", ac20Var.m95710c().trim()).map(new w9j() { // from class: l.gf2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return if2.m135864c(ac20Var, (Bitmap) obj);
            }
        }).compose(mkd0.m154951C())).subscribe(ffw.m121193d(new e30() { // from class: l.hf2
            @Override // p149l.e30
            public final void call(Object obj) {
                defaultBulletView.f49460f.setText(spannableStringBuilder);
            }
        })));
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo135876o();

    /* JADX INFO: renamed from: p */
    public void m135877p() {
        this.f112954a.m103657c();
    }

    /* JADX INFO: renamed from: q */
    public void m135878q(final DefaultBulletView defaultBulletView) {
        final SpannableStringBuilder spannableStringBuilderMo135873l = mo135873l();
        if (NullChecker.m81303a(spannableStringBuilderMo135873l)) {
            vwb.m200354z(Arrays.asList((ac20[]) spannableStringBuilderMo135873l.getSpans(0, spannableStringBuilderMo135873l.length(), ac20.class)), new e30() { // from class: l.ff2
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f97167a.m135875n(defaultBulletView, spannableStringBuilderMo135873l, (ac20) obj);
                }
            });
            xdl0.m208345M0(defaultBulletView.f49460f, true);
            xdl0.m208345M0(defaultBulletView.f49461g, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo135879r(ViewGroup viewGroup, ei3 ei3Var);

    /* JADX INFO: renamed from: s */
    public void mo135880s() {
    }
}
