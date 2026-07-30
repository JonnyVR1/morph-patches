package p153l;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkBountyData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyView;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes5.dex */
public class kt70 {

    /* JADX INFO: renamed from: a */
    public PkBountyView f128659a;

    /* JADX INFO: renamed from: b */
    public VText f128660b;

    /* JADX INFO: renamed from: c */
    public VText f128661c;

    public kt70(PkBountyView pkBountyView, VText vText, VText vText2) {
        this.f128659a = pkBountyView;
        this.f128660b = vText;
        this.f128661c = vText2;
    }

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder m151334a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), Color.parseColor("#ffc73e")), 0, 1, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), Color.parseColor("#ffc73e")), 1, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public void m151335b(VText vText, double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            bnl0.m105524M(vText, false);
            return;
        }
        vText.setText(m151334a("¥ " + d));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        vText.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        vText.getPaint().setShader(new LinearGradient(0.0f, 0.0f, vText.getMeasuredWidth(), 0.0f, new int[]{Color.parseColor("#ffc73e"), Color.parseColor("#ffeab7"), Color.parseColor("#ffc73e")}, new float[]{0.25f, 0.5f, 0.75f}, Shader.TileMode.CLAMP));
        vText.invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m151336c(boolean z) {
        PkBountyView pkBountyView = this.f128659a;
        if (pkBountyView == null) {
            return;
        }
        bnl0.m105524M(pkBountyView, z);
    }

    /* JADX INFO: renamed from: d */
    public void m151337d(PkBountyData pkBountyData, x20 x20Var) {
        PkBountyView pkBountyView = this.f128659a;
        if (pkBountyView == null) {
            return;
        }
        pkBountyView.m77463j(pkBountyData, x20Var);
    }

    /* JADX INFO: renamed from: e */
    public void m151338e(PkBountyData pkBountyData) {
        PkBountyView pkBountyView = this.f128659a;
        if (pkBountyView == null) {
            return;
        }
        pkBountyView.m77463j(pkBountyData, null);
    }

    /* JADX INFO: renamed from: f */
    public void m151339f(PkBountyData pkBountyData) {
        if (this.f128659a == null || pkBountyData == null) {
            return;
        }
        bnl0.m105524M(this.f128660b, true);
        bnl0.m105524M(this.f128661c, true);
        this.f128660b.setBackgroundResource(obc0.f146054H4);
        this.f128661c.setBackgroundResource(obc0.f146054H4);
        m151335b(this.f128660b, pkBountyData.getAnchorBounty());
        m151335b(this.f128661c, pkBountyData.getOtherBounty());
    }

    public kt70() {
    }
}
