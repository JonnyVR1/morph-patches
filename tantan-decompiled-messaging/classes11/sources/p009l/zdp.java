package p009l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.aep;
import l.b3c0;
import l.lsi0;
import l.m17;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zdp extends m17 {

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f23593g;

    /* JADX INFO: renamed from: h */
    public VImage f23594h;

    /* JADX INFO: renamed from: i */
    public VImage f23595i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f23596j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f23597k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f23598l;

    /* JADX INFO: renamed from: m */
    public VText_NoTopPadding f23599m;

    /* JADX INFO: renamed from: n */
    public final Act f23600n;

    public zdp(Act act) {
        super(act);
        this.f23600n = act;
    }

    /* JADX INFO: renamed from: M */
    private void m25706M() {
        setContentView(m25713L(LayoutInflater.from(this.f23600n), null));
        VerificationCenter verificationCenterQ4 = CoreModule.c.B0.q4();
        final boolean zEquals = TEnum.equals(verificationCenterQ4 != null ? verificationCenterQ4.picVerificationInfo.status : null, "pending");
        this.f23598l.setText(zEquals ? R.string.f0 : R.string.x1);
        this.f23598l.setBackgroundResource(zEquals ? b3c0.Y : b3c0.a0);
        this.f23598l.setTextColor(zEquals ? -16777216 : -1);
        this.f23599m.setText(zEquals ? R.string.w1 : R.string.f0);
        this.f23599m.setBackgroundResource(zEquals ? b3c0.Z : b3c0.Y);
        this.f23599m.setTextColor(zEquals ? -1 : -16777216);
        xdl0.E0(this.f23598l, new View.OnClickListener() { // from class: l.wdp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22032a.m25707N(zEquals, view);
            }
        });
        xdl0.E0(this.f23599m, new View.OnClickListener() { // from class: l.xdp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22523a.m25714O(zEquals, view);
            }
        });
        xdl0.E0(this.f23594h, new View.OnClickListener() { // from class: l.ydp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23005a.m25708P(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m25707N(boolean z, View view) {
        if (z) {
            CoreModule.P().a().pr(this.f23600n, "certified", Privilege.tribe);
            zvf0.r("e_intl_tribe_verification_premium_click", m25710F());
        } else {
            zvf0.r("e_intl_tribe_verification_start_click", m25710F());
            CoreModule.P().i().J0(this.f23600n);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m25708P(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: C */
    public boolean m25709C() {
        return true;
    }

    /* JADX INFO: renamed from: F */
    public String m25710F() {
        return "p_intl_tribe_verification_pop";
    }

    /* JADX INFO: renamed from: G */
    public View m25711G() {
        return this.f23593g;
    }

    /* JADX INFO: renamed from: H */
    public boolean m25712H() {
        return true;
    }

    /* JADX INFO: renamed from: L */
    public View m25713L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aep.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m25714O(boolean z, View view) {
        if (z) {
            zvf0.r("e_intl_tribe_verification_start_click", m25710F());
            lsi0.w(R.string.L);
        } else {
            CoreModule.P().a().pr(this.f23600n, "certified", Privilege.tribe);
            zvf0.r("e_intl_tribe_verification_premium_click", m25710F());
            dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m25706M();
    }

    /* JADX INFO: renamed from: z */
    public boolean m25715z() {
        return true;
    }
}
