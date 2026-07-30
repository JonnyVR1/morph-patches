package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.home.BounceButton;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.TXLiteAVCode;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class da3 {

    /* JADX INFO: renamed from: a */
    public final ba3 f85180a;

    /* JADX INFO: renamed from: b */
    public Act f85181b;

    /* JADX INFO: renamed from: c */
    public e30<View> f85182c;

    /* JADX INFO: renamed from: d */
    public baj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> f85183d;

    public da3(Act act, BoostViewContainer boostViewContainer, int i, boolean z) {
        this.f85181b = act;
        ba3 ba3VarM105921a = ca3.m105921a(i, z);
        this.f85180a = ba3VarM105921a;
        ba3VarM105921a.mo100885a(act, boostViewContainer);
    }

    /* JADX INFO: renamed from: a */
    public final View m110546a(@DrawableRes int i, CharSequence charSequence, @ColorInt int i2, int i3, int i4, boolean z) {
        if (NullChecker.m81303a(this.f85183d) && NullChecker.m81303a(this.f85181b)) {
            return this.f85183d.mo100908a(this.f85181b.drawable(i), charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public View m110547b() {
        return this.f85180a.mo100886b();
    }

    /* JADX INFO: renamed from: c */
    public View m110548c() {
        return this.f85180a.mo100889e();
    }

    /* JADX INFO: renamed from: d */
    public void m110549d(e30<View> e30Var, baj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> bajVar) {
        this.f85182c = e30Var;
        this.f85183d = bajVar;
    }

    /* JADX INFO: renamed from: e */
    public void m110550e(View view) {
        if (NullChecker.m81303a(this.f85182c)) {
            this.f85182c.call(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m110551f(@NonNull View view, @IntRange(from = 0) int i) {
        if (m110547b() instanceof BounceButton) {
            ((BounceButton) m110547b()).setCenterIconWidth(i);
            view.invalidate();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m110552g(@DrawableRes int i) {
        if (m110547b() instanceof VImage) {
            ((VImage) m110547b()).setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m110553h(SceneView sceneView) {
        ba3 ba3Var = this.f85180a;
        if (ba3Var instanceof wl3) {
            ((wl3) ba3Var).m203749j(sceneView);
        }
    }

    /* JADX INFO: renamed from: i */
    public View m110554i() {
        return m110546a(b3c0.f73002a, this.f85181b.string(R$string.f20645g), -1, 14, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, true);
    }

    /* JADX INFO: renamed from: j */
    public View m110555j(int i) {
        return m110546a(b3c0.f73041e6, i0g0.m133847N(this.f85181b.getString(R$string.f20657k, String.valueOf(i)), this.f85181b.color(z0c0.f200980h), eqh0.m117752c(3)), Color.parseColor("#d3d2cc"), 20, -1, false);
    }

    /* JADX INFO: renamed from: k */
    public void m110556k() {
        this.f85180a.mo100887c(2);
    }

    /* JADX INFO: renamed from: l */
    public void m110557l(CharSequence charSequence, int i) {
        this.f85180a.mo100887c(1);
        this.f85180a.mo100888d(charSequence, i);
    }
}
