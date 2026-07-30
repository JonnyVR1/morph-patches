package p009l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.ui.home.BounceButton;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import l.b3c0;
import l.baj;
import l.e30;
import l.eqh0;
import l.z0c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class da3 {

    /* JADX INFO: renamed from: a */
    public final ba3 f11683a;

    /* JADX INFO: renamed from: b */
    public Act f11684b;

    /* JADX INFO: renamed from: c */
    public e30<View> f11685c;

    /* JADX INFO: renamed from: d */
    public baj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> f11686d;

    public da3(Act act, BoostViewContainer boostViewContainer, int i, boolean z) {
        this.f11684b = act;
        ba3 ba3VarM12464a = ca3.m12464a(i, z);
        this.f11683a = ba3VarM12464a;
        ba3VarM12464a.mo11917a(act, boostViewContainer);
    }

    /* JADX INFO: renamed from: a */
    public final View m13022a(@DrawableRes int i, CharSequence charSequence, @ColorInt int i2, int i3, int i4, boolean z) {
        if (NullChecker.a(this.f11686d) && NullChecker.a(this.f11684b)) {
            return (View) this.f11686d.a(this.f11684b.drawable(i), charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public View m13023b() {
        return this.f11683a.mo11918b();
    }

    /* JADX INFO: renamed from: c */
    public View m13024c() {
        return this.f11683a.mo11921e();
    }

    /* JADX INFO: renamed from: d */
    public void m13025d(e30<View> e30Var, baj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> bajVar) {
        this.f11685c = e30Var;
        this.f11686d = bajVar;
    }

    /* JADX INFO: renamed from: e */
    public void m13026e(View view) {
        if (NullChecker.a(this.f11685c)) {
            this.f11685c.call(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m13027f(@NonNull View view, @IntRange(from = 0) int i) {
        if (m13023b() instanceof BounceButton) {
            m13023b().setCenterIconWidth(i);
            view.invalidate();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m13028g(@DrawableRes int i) {
        if (m13023b() instanceof VImage) {
            m13023b().setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m13029h(SceneView sceneView) {
        ba3 ba3Var = this.f11683a;
        if (ba3Var instanceof wl3) {
            ((wl3) ba3Var).m24318j(sceneView);
        }
    }

    /* JADX INFO: renamed from: i */
    public View m13030i() {
        return m13022a(b3c0.a, this.f11684b.string(R.string.g), -1, 14, 4000, true);
    }

    /* JADX INFO: renamed from: j */
    public View m13031j(int i) {
        return m13022a(b3c0.e6, i0g0.m16115N(this.f11684b.getString(R.string.k, String.valueOf(i)), this.f11684b.color(z0c0.h), eqh0.c(3)), Color.parseColor("#d3d2cc"), 20, -1, false);
    }

    /* JADX INFO: renamed from: k */
    public void m13032k() {
        this.f11683a.mo11919c(2);
    }

    /* JADX INFO: renamed from: l */
    public void m13033l(CharSequence charSequence, int i) {
        this.f11683a.mo11919c(1);
        this.f11683a.mo11920d(charSequence, i);
    }
}
