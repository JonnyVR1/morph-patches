package p153l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VImage;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class zfp extends q27 {

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f204181g;

    /* JADX INFO: renamed from: h */
    public VImage f204182h;

    /* JADX INFO: renamed from: i */
    public VImage f204183i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f204184j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f204185k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f204186l;

    /* JADX INFO: renamed from: m */
    public VText_NoTopPadding f204187m;

    /* JADX INFO: renamed from: n */
    public final Act f204188n;

    public zfp(Act act) {
        super(act);
        this.f204188n = act;
    }

    /* JADX INFO: renamed from: M */
    private void m219570M() {
        setContentView(m219573L(LayoutInflater.from(this.f204188n), null));
        VerificationCenter verificationCenterM32621q4 = CoreModule.f18264c.f20294B0.m32621q4();
        final boolean zEquals = TEnum.equals(verificationCenterM32621q4 != null ? verificationCenterM32621q4.picVerificationInfo.status : null, "pending");
        this.f204186l.setText(zEquals ? R$string.f21385f0 : R$string.f21440x1);
        this.f204186l.setBackgroundResource(zEquals ? gbc0.f103239Y : gbc0.f103254a0);
        this.f204186l.setTextColor(zEquals ? -16777216 : -1);
        this.f204187m.setText(zEquals ? R$string.f21437w1 : R$string.f21385f0);
        this.f204187m.setBackgroundResource(zEquals ? gbc0.f103246Z : gbc0.f103239Y);
        this.f204187m.setTextColor(zEquals ? -1 : -16777216);
        bnl0.m105509E0(this.f204186l, new View.OnClickListener() { // from class: l.wfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188874a.m219571N(zEquals, view);
            }
        });
        bnl0.m105509E0(this.f204187m, new View.OnClickListener() { // from class: l.xfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194083a.m219574O(zEquals, view);
            }
        });
        bnl0.m105509E0(this.f204182h, new View.OnClickListener() { // from class: l.yfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199647a.m219572P(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m219571N(boolean z, View view) {
        if (z) {
            CoreModule.m30933P().m143405a().mo34568pr(this.f204188n, "certified", Privilege.tribe);
            i4g0.m138520r("e_intl_tribe_verification_premium_click", mo125592F());
        } else {
            i4g0.m138520r("e_intl_tribe_verification_start_click", mo125592F());
            CoreModule.m30933P().m143412i().mo180340J0(this.f204188n);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m219572P(View view) {
        dismiss();
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: C */
    public boolean mo125591C() {
        return true;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: F */
    public String mo125592F() {
        return "p_intl_tribe_verification_pop";
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: G */
    public View mo125593G() {
        return this.f204181g;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: H */
    public boolean mo125594H() {
        return true;
    }

    /* JADX INFO: renamed from: L */
    public View m219573L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return agp.m97715b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m219574O(boolean z, View view) {
        if (z) {
            i4g0.m138520r("e_intl_tribe_verification_start_click", mo125592F());
            o1j0.m165649w(R$string.f21338L);
        } else {
            CoreModule.m30933P().m143405a().mo34568pr(this.f204188n, "certified", Privilege.tribe);
            i4g0.m138520r("e_intl_tribe_verification_premium_click", mo125592F());
            dismiss();
        }
    }

    @Override // p153l.q27, com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m219570M();
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: z */
    public boolean mo125599z() {
        return true;
    }
}
