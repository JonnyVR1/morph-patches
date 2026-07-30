package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.home.BounceButton;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.TXLiteAVCode;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class sa3 {

    /* JADX INFO: renamed from: a */
    public final qa3 f166998a;

    /* JADX INFO: renamed from: b */
    public Act f166999b;

    /* JADX INFO: renamed from: c */
    public y20<View> f167000c;

    /* JADX INFO: renamed from: d */
    public vcj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> f167001d;

    public sa3(Act act, BoostViewContainer boostViewContainer, int i, boolean z) {
        this.f166999b = act;
        qa3 qa3VarM180706a = ra3.m180706a(i, z);
        this.f166998a = qa3VarM180706a;
        qa3VarM180706a.mo147949a(act, boostViewContainer);
    }

    /* JADX INFO: renamed from: a */
    public final View m185253a(@DrawableRes int i, CharSequence charSequence, @ColorInt int i2, int i3, int i4, boolean z) {
        if (NullChecker.m82486a(this.f167001d) && NullChecker.m82486a(this.f166999b)) {
            return this.f167001d.mo103927a(this.f166999b.drawable(i), charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public View m185254b() {
        return this.f166998a.mo147950b();
    }

    /* JADX INFO: renamed from: c */
    public View m185255c() {
        return this.f166998a.mo147953e();
    }

    /* JADX INFO: renamed from: d */
    public void m185256d(y20<View> y20Var, vcj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> vcjVar) {
        this.f167000c = y20Var;
        this.f167001d = vcjVar;
    }

    /* JADX INFO: renamed from: e */
    public void m185257e(View view) {
        if (NullChecker.m82486a(this.f167000c)) {
            this.f167000c.call(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m185258f(@NonNull View view, @IntRange(from = 0) int i) {
        if (m185254b() instanceof BounceButton) {
            ((BounceButton) m185254b()).setCenterIconWidth(i);
            view.invalidate();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m185259g(@DrawableRes int i) {
        if (m185254b() instanceof VImage) {
            ((VImage) m185254b()).setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m185260h(SceneView sceneView) {
        qa3 qa3Var = this.f166998a;
        if (qa3Var instanceof wm3) {
            ((wm3) qa3Var).m207089j(sceneView);
        }
    }

    /* JADX INFO: renamed from: i */
    public View m185261i() {
        return m185253a(gbc0.f103253a, this.f166999b.string(R$string.f21387g), -1, 14, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, true);
    }

    /* JADX INFO: renamed from: j */
    public View m185262j(int i) {
        return m185253a(gbc0.f103292e6, q8g0.m175782N(this.f166999b.getString(R$string.f21399k, String.valueOf(i)), this.f166999b.color(f9c0.f97863h), lyh0.m156283c(3)), Color.parseColor("#d3d2cc"), 20, -1, false);
    }

    /* JADX INFO: renamed from: k */
    public void m185263k() {
        this.f166998a.mo147951c(2);
    }

    /* JADX INFO: renamed from: l */
    public void m185264l(CharSequence charSequence, int i) {
        this.f166998a.mo147951c(1);
        this.f166998a.mo147952d(charSequence, i);
    }
}
