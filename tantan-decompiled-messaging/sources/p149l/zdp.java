package p149l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VImage;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class zdp extends m17 {

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f202692g;

    /* JADX INFO: renamed from: h */
    public VImage f202693h;

    /* JADX INFO: renamed from: i */
    public VImage f202694i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f202695j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f202696k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f202697l;

    /* JADX INFO: renamed from: m */
    public VText_NoTopPadding f202698m;

    /* JADX INFO: renamed from: n */
    public final Act f202699n;

    public zdp(Act act) {
        super(act);
        this.f202699n = act;
    }

    /* JADX INFO: renamed from: M */
    private void m218184M() {
        setContentView(m218187L(LayoutInflater.from(this.f202699n), null));
        VerificationCenter verificationCenterM31618q4 = CoreModule.f17545c.f19552B0.m31618q4();
        final boolean zEquals = TEnum.equals(verificationCenterM31618q4 != null ? verificationCenterM31618q4.picVerificationInfo.status : null, "pending");
        this.f202697l.setText(zEquals ? R$string.f20643f0 : R$string.f20698x1);
        this.f202697l.setBackgroundResource(zEquals ? b3c0.f72988Y : b3c0.f73003a0);
        this.f202697l.setTextColor(zEquals ? -16777216 : -1);
        this.f202698m.setText(zEquals ? R$string.f20695w1 : R$string.f20643f0);
        this.f202698m.setBackgroundResource(zEquals ? b3c0.f72995Z : b3c0.f72988Y);
        this.f202698m.setTextColor(zEquals ? -1 : -16777216);
        xdl0.m208329E0(this.f202697l, new View.OnClickListener() { // from class: l.wdp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185822a.m218185N(zEquals, view);
            }
        });
        xdl0.m208329E0(this.f202698m, new View.OnClickListener() { // from class: l.xdp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192435a.m218188O(zEquals, view);
            }
        });
        xdl0.m208329E0(this.f202693h, new View.OnClickListener() { // from class: l.ydp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197576a.m218186P(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m218185N(boolean z, View view) {
        if (z) {
            CoreModule.m29935P().m94651a().mo33565pr(this.f202699n, "certified", Privilege.tribe);
            zvf0.m220396r("e_intl_tribe_verification_premium_click", mo121174F());
        } else {
            zvf0.m220396r("e_intl_tribe_verification_start_click", mo121174F());
            CoreModule.m29935P().m94658i().mo158248J0(this.f202699n);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m218186P(View view) {
        dismiss();
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: C */
    public boolean mo121173C() {
        return true;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: F */
    public String mo121174F() {
        return "p_intl_tribe_verification_pop";
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: G */
    public View mo121175G() {
        return this.f202692g;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: H */
    public boolean mo121176H() {
        return true;
    }

    /* JADX INFO: renamed from: L */
    public View m218187L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aep.m96122b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m218188O(boolean z, View view) {
        if (z) {
            zvf0.m220396r("e_intl_tribe_verification_start_click", mo121174F());
            lsi0.m151593w(R$string.f20596L);
        } else {
            CoreModule.m29935P().m94651a().mo33565pr(this.f202699n, "certified", Privilege.tribe);
            zvf0.m220396r("e_intl_tribe_verification_premium_click", mo121174F());
            dismiss();
        }
    }

    @Override // p149l.m17, com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m218184M();
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: z */
    public boolean mo121181z() {
        return true;
    }
}
