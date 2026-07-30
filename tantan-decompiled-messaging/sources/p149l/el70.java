package p149l;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkBountyData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyView;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes5.dex */
public class el70 {

    /* JADX INFO: renamed from: a */
    public PkBountyView f92078a;

    /* JADX INFO: renamed from: b */
    public VText f92079b;

    /* JADX INFO: renamed from: c */
    public VText f92080c;

    public el70(PkBountyView pkBountyView, VText vText, VText vText2) {
        this.f92078a = pkBountyView;
        this.f92079b = vText;
        this.f92080c = vText2;
    }

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder m117083a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), Color.parseColor("#ffc73e")), 0, 1, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), Color.parseColor("#ffc73e")), 1, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public void m117084b(VText vText, double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            xdl0.m208344M(vText, false);
            return;
        }
        vText.setText(m117083a("¥ " + d));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        vText.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        vText.getPaint().setShader(new LinearGradient(0.0f, 0.0f, vText.getMeasuredWidth(), 0.0f, new int[]{Color.parseColor("#ffc73e"), Color.parseColor("#ffeab7"), Color.parseColor("#ffc73e")}, new float[]{0.25f, 0.5f, 0.75f}, Shader.TileMode.CLAMP));
        vText.invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m117085c(boolean z) {
        PkBountyView pkBountyView = this.f92078a;
        if (pkBountyView == null) {
            return;
        }
        xdl0.m208344M(pkBountyView, z);
    }

    /* JADX INFO: renamed from: d */
    public void m117086d(PkBountyData pkBountyData, d30 d30Var) {
        PkBountyView pkBountyView = this.f92078a;
        if (pkBountyView == null) {
            return;
        }
        pkBountyView.m76280j(pkBountyData, d30Var);
    }

    /* JADX INFO: renamed from: e */
    public void m117087e(PkBountyData pkBountyData) {
        PkBountyView pkBountyView = this.f92078a;
        if (pkBountyView == null) {
            return;
        }
        pkBountyView.m76280j(pkBountyData, null);
    }

    /* JADX INFO: renamed from: f */
    public void m117088f(PkBountyData pkBountyData) {
        if (this.f92078a == null || pkBountyData == null) {
            return;
        }
        xdl0.m208344M(this.f92079b, true);
        xdl0.m208344M(this.f92080c, true);
        this.f92079b.setBackgroundResource(i3c0.f110726H4);
        this.f92080c.setBackgroundResource(i3c0.f110726H4);
        m117084b(this.f92079b, pkBountyData.getAnchorBounty());
        m117084b(this.f92080c, pkBountyData.getOtherBounty());
    }

    public el70() {
    }
}
