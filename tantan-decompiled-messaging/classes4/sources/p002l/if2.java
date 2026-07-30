package p002l;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import l.ac20;
import l.bs5;
import l.e30;
import l.ffw;
import l.hxs;
import l.mkd0;
import l.qib0;
import l.qkq0;
import l.roj0;
import l.vdt;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yb2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class if2 {

    /* JADX INFO: renamed from: a */
    public bs5 f13190a = new bs5();

    /* JADX INFO: renamed from: b */
    public wh3 f13191b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ roj0 m15112c(ac20 ac20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ac20Var.e(bitmap.copy(bitmap.getConfig(), false));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: d */
    public void m15113d(DefaultBulletView defaultBulletView) {
        if (!vdt.b(2)) {
            m15126q(defaultBulletView);
            return;
        }
        defaultBulletView.f5502f.setText(mo15118i());
        xdl0.M0(defaultBulletView.f5502f, true);
        xdl0.M0(defaultBulletView.f5503g, false);
    }

    /* JADX INFO: renamed from: e */
    public void m15114e(SpecialSystemBulletView specialSystemBulletView) {
        specialSystemBulletView.f5509e.setText(mo15118i());
        xdl0.M0(specialSystemBulletView.f5509e, true);
        xdl0.M0(specialSystemBulletView.f5510f, false);
    }

    /* JADX INFO: renamed from: f */
    public void m15115f(wh3 wh3Var) {
        this.f13191b = wh3Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: g */
    public ho2 m15116g() {
        wh3 wh3Var = this.f13191b;
        if (wh3Var != null) {
            return wh3Var.m25547E2();
        }
        qkq0.a("presenter 为空，必须先绑定 bulletBasePresenter");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m15117h() {
        return "bullet content = " + ((Object) mo15118i()) + " userId = " + qib0.b0.a.userId() + m15120k();
    }

    /* JADX INFO: renamed from: i */
    public abstract CharSequence mo15118i();

    /* JADX INFO: renamed from: j */
    public GradientDrawable m15119j() {
        return yb2.j(-50688, -31446, 11);
    }

    /* JADX INFO: renamed from: k */
    public final String m15120k() {
        ho2 ho2VarM15116g = m15116g();
        if (ho2VarM15116g == null) {
            return " data is null";
        }
        return " state = " + (ho2VarM15116g.m14588n0() != null ? ho2VarM15116g.m14588n0().state.toString() : "current live is null") + " anchorId = " + (ho2VarM15116g.m14582l0() != null ? ((DbObject) ho2VarM15116g.m14582l0()).id : " null ") + " roomId = " + m15116g().m17239o() + " liveId = " + m15116g().m17235k() + " liveType = " + m15116g().mo14489A0();
    }

    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder mo15121l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public long mo15122m() {
        return 3000L;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m15123n(final DefaultBulletView defaultBulletView, final SpannableStringBuilder spannableStringBuilder, final ac20 ac20Var) {
        if (ac20Var.d()) {
            return;
        }
        this.f13190a.a(this.f13191b.act().duringCreated(hxs.e("context_common", ac20Var.c().trim()).map(new w9j() { // from class: l.gf2
            public final Object call(Object obj) {
                return if2.m15112c(ac20Var, (Bitmap) obj);
            }
        }).compose(mkd0.C())).subscribe(ffw.d(new e30() { // from class: l.hf2
            public final void call(Object obj) {
                defaultBulletView.f5502f.setText(spannableStringBuilder);
            }
        })));
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo15124o();

    /* JADX INFO: renamed from: p */
    public void m15125p() {
        this.f13190a.c();
    }

    /* JADX INFO: renamed from: q */
    public void m15126q(final DefaultBulletView defaultBulletView) {
        final SpannableStringBuilder spannableStringBuilderMo15121l = mo15121l();
        if (NullChecker.a(spannableStringBuilderMo15121l)) {
            vwb.z(Arrays.asList((ac20[]) spannableStringBuilderMo15121l.getSpans(0, spannableStringBuilderMo15121l.length(), ac20.class)), new e30() { // from class: l.ff2
                public final void call(Object obj) {
                    this.f10307a.m15123n(defaultBulletView, spannableStringBuilderMo15121l, (ac20) obj);
                }
            });
            xdl0.M0(defaultBulletView.f5502f, true);
            xdl0.M0(defaultBulletView.f5503g, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo15127r(ViewGroup viewGroup, ei3 ei3Var);

    /* JADX INFO: renamed from: s */
    public void mo15128s() {
    }
}
