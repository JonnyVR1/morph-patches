package p002l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.aq90;
import l.b43;
import l.e30;
import l.mcr;
import l.rza;
import l.vwb;
import l.w0c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zp90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f23537A;

    /* JADX INFO: renamed from: B */
    public VText f23538B;

    /* JADX INFO: renamed from: C */
    public VText f23539C;

    /* JADX INFO: renamed from: D */
    public VText f23540D;

    /* JADX INFO: renamed from: E */
    public VText f23541E;

    /* JADX INFO: renamed from: F */
    public VText f23542F;

    /* JADX INFO: renamed from: G */
    public VText f23543G;

    /* JADX INFO: renamed from: H */
    public VText f23544H;

    /* JADX INFO: renamed from: I */
    public VText f23545I;

    /* JADX INFO: renamed from: J */
    public VText f23546J;

    /* JADX INFO: renamed from: K */
    public VText f23547K;

    /* JADX INFO: renamed from: L */
    public VText f23548L;

    /* JADX INFO: renamed from: M */
    public VText f23549M;

    /* JADX INFO: renamed from: N */
    public VText f23550N;

    /* JADX INFO: renamed from: O */
    public VText f23551O;

    /* JADX INFO: renamed from: P */
    public VText f23552P;

    /* JADX INFO: renamed from: Q */
    public VText f23553Q;

    /* JADX INFO: renamed from: R */
    public boolean f23554R;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f23555u;

    /* JADX INFO: renamed from: v */
    public VText f23556v;

    /* JADX INFO: renamed from: w */
    public VText f23557w;

    /* JADX INFO: renamed from: x */
    public VText f23558x;

    /* JADX INFO: renamed from: y */
    public VText f23559y;

    /* JADX INFO: renamed from: z */
    public VText f23560z;

    public zp90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f23554R = true;
    }

    /* JADX INFO: renamed from: V */
    public static String m27487V(Profile profile) {
        if (!NullChecker.a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = vwb.J(profile.extensions.basic.country) ? "" : (String) profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = vwb.J(profile.extensions.basic.province) ? "" : (String) profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = vwb.J(profile.extensions.basic.city) ? "" : (String) profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: W */
    private String m27488W(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: X */
    public static String m27489X(Profile profile) {
        return profile.hometown;
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: T */
    public View m27490T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aq90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final void m27491U() {
        VText vText = this.f23538B;
        VText vText2 = this.f23540D;
        VText vText3 = this.f23543G;
        VText vText4 = this.f23545I;
        VText vText5 = this.f23539C;
        VText vText6 = this.f23547K;
        vwb.z(vwb.f0(new VText[]{vText, vText2, vText3, vText4, vText5, vText6, this.f23546J, this.f23544H, vText6, this.f23550N, this.f23551O, this.f23552P, this.f23553Q}), new e30() { // from class: l.xp90
            public final void call(Object obj) {
                this.f22395a.m27497d0((VText) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public String m27492Y(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return m27493Z().getString(R.string.ub);
            case "BACHELOR":
                return m27493Z().getString(R.string.sb);
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return m27493Z().getString(R.string.tb);
            case "DOCTOR":
                return m27493Z().getString(R.string.wb);
            default:
                return m27493Z().getString(R.string.vb);
        }
    }

    /* JADX INFO: renamed from: Z */
    public Resources m27493Z() {
        return mo3351O().act().getResources();
    }

    /* JADX INFO: renamed from: a0 */
    public String m27494a0(int i) {
        return mo3351O().act().getString(i);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m27495b0() {
        return new cq90().m11326a(mo3351O(), m27492Y(mo3351O().mo1517K2().profile.studies.qualification));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m27496c0(VText vText, View view) {
        CoreDlg.b(mo3351O().act(), vText.getText() instanceof Spanned ? rza.U0((Spanned) vText.getText()) : vText.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m27497d0(final VText vText) {
        if (!mo3351O().mo1570m0()) {
            vText.setBackgroundDrawable((Drawable) null);
        }
        vText.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yp90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f23015a.m27496c0(vText, view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public void m27498e0(User user) {
        Studies studies;
        QualificationType qualificationType;
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f23538B.setText(m27494a0(R.string.Xk));
            this.f23539C.setText(profile.studies.major);
            mo10544g0(R.string.Qk);
            m9651Q(this.f23540D, 8);
        } else {
            m9651Q(this.f23540D, 0);
            this.f23538B.setText(profile.work.industry);
            this.f23539C.setText(profile.work.department);
            this.f23540D.setText(profile.work.company);
            mo10543f0(R.string.Kk);
            mo10544g0(R.string.Mk);
        }
        String str = profile.studies.school;
        if (NullChecker.a(user.settings) && user.settings.hideSchoolName() && mo3351O().mo1523P1()) {
            str = profile.studies.school + "(" + m27494a0(R.string.C0) + ")";
        }
        this.f23543G.setText(str);
        boolean zMo1570m0 = mo3351O().mo1570m0();
        Studies studies2 = profile.studies;
        if (zMo1570m0) {
            boolean z = studies2.active;
            VText vText = this.f23543G;
            if (z) {
                m9651Q(vText, 0);
                mo10545h0(R.string.Wk);
            } else {
                m9651Q(vText, 8);
            }
        } else {
            boolean z2 = studies2.active;
            VText vText2 = this.f23543G;
            if (z2) {
                mo10546i0(vText2);
            } else {
                m9651Q(vText2, 8);
            }
        }
        if (mo3351O().mo1570m0() || !(((studies = profile.studies) == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_")) && TextUtils.isEmpty(profile.school))) {
            m9651Q(this.f23537A, 8);
            m9651Q(this.f23543G, 8);
            this.f23541E.setText(m27492Y(profile.studies.qualification));
            m9651Q(this.f23541E, (!mo3351O().mo1570m0() && TEnum.equals(profile.studies.qualification, "unknown_")) ? 8 : 0);
            String str2 = profile.studies.school;
            if (NullChecker.a(user.settings) && user.settings.hideSchoolName() && mo3351O().mo1523P1()) {
                str2 = profile.studies.school + "(" + m27494a0(R.string.C0) + ")";
            }
            this.f23542F.setText(str2);
            m9651Q(this.f23542F, (!mo3351O().mo1570m0() && TextUtils.isEmpty(profile.studies.school)) ? 8 : 0);
            m9651Q(this.f23540D, profile.studies.active ? 8 : 0);
        } else {
            m9651Q(this.f23560z, 8);
            m9651Q(this.f23537A, 8);
            m9651Q(this.f23541E, 8);
            m9651Q(this.f23542F, 8);
        }
        if (!b43.b() || vwb.J(profile.extensions.physical.bloodType) || TEnum.equals((BloodType) profile.extensions.physical.bloodType.get(0), "unknown_")) {
            xdl0.M(this.f23559y, false);
        } else {
            xdl0.M0(this.f23559y, true);
            this.f23559y.setText(b43.a((BloodType) profile.extensions.physical.bloodType.get(0)));
        }
        if (IntlCountryCodeController.j()) {
            if (mo3351O().mo1570m0() || !vwb.J(profile.extensions.basic.ethnicity)) {
                xdl0.M(this.f23557w, true);
                this.f23557w.setText(nha0.INSTANCE.m18757d(profile.extensions.basic.ethnicity));
            } else {
                xdl0.M(this.f23557w, false);
            }
            if (mo3351O().mo1570m0() || !vwb.J(profile.extensions.basic.language)) {
                xdl0.M(this.f23558x, true);
                this.f23558x.setText(nha0.INSTANCE.m18758e(profile.extensions.basic.language));
            } else {
                xdl0.M(this.f23558x, false);
            }
        }
        m9638C(m27493Z().getColor(w0c0.N1), this.f23540D);
        m9638C(m27493Z().getColor(w0c0.N1), this.f23539C);
        this.f23545I.setText(m27488W(profile));
        this.f23547K.setText(profile.hangouts);
        if (mo3351O().mo1570m0()) {
            return;
        }
        mo10546i0(this.f23538B);
        mo10546i0(this.f23539C);
        if (!IntlCountryCodeController.l() || mo3351O().mo1517K2().isFemale() || (TEnum.equals(mo3351O().mo1517K2().profile.studies.qualification, "unknown_") && !mo3351O().mo1570m0())) {
            mo10546i0(this.f23540D);
        }
        mo10546i0(this.f23545I);
        mo10546i0(this.f23547K);
        boolean z3 = this.f23554R;
        if (this.f23538B.getVisibility() == 0 || this.f23540D.getVisibility() == 0 || this.f23543G.getVisibility() == 0 || this.f23539C.getVisibility() == 0 || this.f23545I.getVisibility() == 0 || this.f23547K.getVisibility() == 0 || this.f23560z.getVisibility() == 0 || this.f23559y.getVisibility() == 0) {
            this.f23554R = true;
        } else {
            this.f23554R = false;
        }
        if (z3 != this.f23554R) {
            mo3351O().mo1515J3();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void mo10543f0(int i) {
        this.f23540D.setHint(i);
        m9651Q(this.f23543G, 8);
    }

    /* JADX INFO: renamed from: g0 */
    public void mo10544g0(int i) {
        this.f23539C.setHint(i);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo10545h0(int i) {
        this.f23543G.setHint(i);
        m9651Q(this.f23540D, 8);
    }

    /* JADX INFO: renamed from: i0 */
    public void mo10546i0(VText vText) {
        xdl0.N0(vText);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (mo3351O().mo1570m0()) {
            return;
        }
        m27491U();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        this.f23554R = m27495b0();
        return m27495b0();
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m27490T(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m27498e0(mo3351O().mo1517K2());
    }
}
