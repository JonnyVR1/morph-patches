package p153l;

import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dy90 extends ep90 {

    /* JADX INFO: renamed from: A */
    public VText f91172A;

    /* JADX INFO: renamed from: B */
    public VText f91173B;

    /* JADX INFO: renamed from: C */
    public VText f91174C;

    /* JADX INFO: renamed from: D */
    public VText f91175D;

    /* JADX INFO: renamed from: E */
    public VText f91176E;

    /* JADX INFO: renamed from: F */
    public VText f91177F;

    /* JADX INFO: renamed from: G */
    public VText f91178G;

    /* JADX INFO: renamed from: H */
    public VText f91179H;

    /* JADX INFO: renamed from: I */
    public VText f91180I;

    /* JADX INFO: renamed from: J */
    public VText f91181J;

    /* JADX INFO: renamed from: K */
    public VText f91182K;

    /* JADX INFO: renamed from: L */
    public VText f91183L;

    /* JADX INFO: renamed from: M */
    public VText f91184M;

    /* JADX INFO: renamed from: N */
    public VText f91185N;

    /* JADX INFO: renamed from: O */
    public VText f91186O;

    /* JADX INFO: renamed from: P */
    public VText f91187P;

    /* JADX INFO: renamed from: Q */
    public VText f91188Q;

    /* JADX INFO: renamed from: R */
    public boolean f91189R;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f91190u;

    /* JADX INFO: renamed from: v */
    public VText f91191v;

    /* JADX INFO: renamed from: w */
    public VText f91192w;

    /* JADX INFO: renamed from: x */
    public VText f91193x;

    /* JADX INFO: renamed from: y */
    public VText f91194y;

    /* JADX INFO: renamed from: z */
    public VText f91195z;

    public dy90(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f91189R = true;
    }

    /* JADX INFO: renamed from: V */
    public static String m118646V(Profile profile) {
        if (!NullChecker.m82486a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = jyb.m147479J(profile.extensions.basic.country) ? "" : profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = jyb.m147479J(profile.extensions.basic.province) ? "" : profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = jyb.m147479J(profile.extensions.basic.city) ? "" : profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: W */
    private String m118647W(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: X */
    public static String m118648X(Profile profile) {
        return profile.hometown;
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: T */
    public View m118649T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ey90.m123191b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final void m118650U() {
        VText vText = this.f91173B;
        VText vText2 = this.f91175D;
        VText vText3 = this.f91178G;
        VText vText4 = this.f91180I;
        VText vText5 = this.f91174C;
        VText vText6 = this.f91182K;
        jyb.m147537z(jyb.m147507f0(vText, vText2, vText3, vText4, vText5, vText6, this.f91181J, this.f91179H, vText6, this.f91185N, this.f91186O, this.f91187P, this.f91188Q), new y20() { // from class: l.by90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78996a.m118656d0((VText) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public String m118651Y(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return m118652Z().getString(R$string.f18576Jb);
            case "BACHELOR":
                return m118652Z().getString(R$string.f18514Hb);
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return m118652Z().getString(R$string.f18545Ib);
            case "DOCTOR":
                return m118652Z().getString(R$string.f18638Lb);
            default:
                return m118652Z().getString(R$string.f18607Kb);
        }
    }

    /* JADX INFO: renamed from: Z */
    public Resources m118652Z() {
        return mo53983O().act().getResources();
    }

    /* JADX INFO: renamed from: a0 */
    public String m118653a0(int i) {
        return mo53983O().act().getString(i);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m118654b0() {
        return new gy90().m132939a(mo53983O(), m118651Y(mo53983O().mo52252K2().profile.studies.qualification));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m118655c0(VText vText, View view) {
        CoreDlg.m46231b(mo53983O().act(), vText.getText() instanceof Spanned ? e1b.m118963U0((Spanned) vText.getText()) : vText.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m118656d0(final VText vText) {
        if (!mo53983O().mo52302m0()) {
            vText.setBackgroundDrawable(null);
        }
        vText.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.cy90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f84305a.m118655c0(vText, view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public void m118657e0(User user) {
        Studies studies;
        QualificationType qualificationType;
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f91173B.setText(m118653a0(R$string.f19684tl));
            this.f91174C.setText(profile.studies.major);
            mo118659g0(R$string.f19467ml);
            m121845Q(this.f91175D, 8);
        } else {
            m121845Q(this.f91175D, 0);
            this.f91173B.setText(profile.work.industry);
            this.f91174C.setText(profile.work.department);
            this.f91175D.setText(profile.work.company);
            mo118658f0(R$string.f19283gl);
            mo118659g0(R$string.f19344il);
        }
        String str = profile.studies.school;
        if (NullChecker.m82486a(user.settings) && user.settings.hideSchoolName() && mo53983O().mo52258P1()) {
            str = profile.studies.school + "(" + m118653a0(R$string.f18348C0) + ")";
        }
        this.f91178G.setText(str);
        boolean zMo52302m0 = mo53983O().mo52302m0();
        Studies studies2 = profile.studies;
        if (zMo52302m0) {
            boolean z = studies2.active;
            View view = this.f91178G;
            if (z) {
                m121845Q(view, 0);
                mo118660h0(R$string.f19653sl);
            } else {
                m121845Q(view, 8);
            }
        } else {
            boolean z2 = studies2.active;
            VText vText = this.f91178G;
            if (z2) {
                mo118661i0(vText);
            } else {
                m121845Q(vText, 8);
            }
        }
        if (mo53983O().mo52302m0() || !(((studies = profile.studies) == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_")) && TextUtils.isEmpty(profile.school))) {
            m121845Q(this.f91172A, 8);
            m121845Q(this.f91178G, 8);
            this.f91176E.setText(m118651Y(profile.studies.qualification));
            m121845Q(this.f91176E, (!mo53983O().mo52302m0() && TEnum.equals(profile.studies.qualification, "unknown_")) ? 8 : 0);
            String str2 = profile.studies.school;
            if (NullChecker.m82486a(user.settings) && user.settings.hideSchoolName() && mo53983O().mo52258P1()) {
                str2 = profile.studies.school + "(" + m118653a0(R$string.f18348C0) + ")";
            }
            this.f91177F.setText(str2);
            m121845Q(this.f91177F, (!mo53983O().mo52302m0() && TextUtils.isEmpty(profile.studies.school)) ? 8 : 0);
            m121845Q(this.f91175D, profile.studies.active ? 8 : 0);
        } else {
            m121845Q(this.f91195z, 8);
            m121845Q(this.f91172A, 8);
            m121845Q(this.f91176E, 8);
            m121845Q(this.f91177F, 8);
        }
        if (!r43.m179739b() || jyb.m147479J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            bnl0.m105524M(this.f91194y, false);
        } else {
            bnl0.m105525M0(this.f91194y, true);
            this.f91194y.setText(r43.m179738a(profile.extensions.physical.bloodType.get(0)));
        }
        if (IntlCountryCodeController.m29113j()) {
            if (mo53983O().mo52302m0() || !jyb.m147479J(profile.extensions.basic.ethnicity)) {
                bnl0.m105524M(this.f91192w, true);
                this.f91192w.setText(rpa0.INSTANCE.m182515d(profile.extensions.basic.ethnicity));
            } else {
                bnl0.m105524M(this.f91192w, false);
            }
            if (mo53983O().mo52302m0() || !jyb.m147479J(profile.extensions.basic.language)) {
                bnl0.m105524M(this.f91193x, true);
                this.f91193x.setText(rpa0.INSTANCE.m182516e(profile.extensions.basic.language));
            } else {
                bnl0.m105524M(this.f91193x, false);
            }
        }
        m121832C(m118652Z().getColor(c9c0.f80362O1), this.f91175D);
        m121832C(m118652Z().getColor(c9c0.f80362O1), this.f91174C);
        this.f91180I.setText(m118647W(profile));
        this.f91182K.setText(profile.hangouts);
        if (mo53983O().mo52302m0()) {
            return;
        }
        mo118661i0(this.f91173B);
        mo118661i0(this.f91174C);
        if (!IntlCountryCodeController.m29115l() || mo53983O().mo52252K2().isFemale() || (TEnum.equals(mo53983O().mo52252K2().profile.studies.qualification, "unknown_") && !mo53983O().mo52302m0())) {
            mo118661i0(this.f91175D);
        }
        mo118661i0(this.f91180I);
        mo118661i0(this.f91182K);
        boolean z3 = this.f91189R;
        if (this.f91173B.getVisibility() == 0 || this.f91175D.getVisibility() == 0 || this.f91178G.getVisibility() == 0 || this.f91174C.getVisibility() == 0 || this.f91180I.getVisibility() == 0 || this.f91182K.getVisibility() == 0 || this.f91195z.getVisibility() == 0 || this.f91194y.getVisibility() == 0) {
            this.f91189R = true;
        } else {
            this.f91189R = false;
        }
        if (z3 != this.f91189R) {
            mo53983O().mo52250J3();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void mo118658f0(int i) {
        this.f91175D.setHint(i);
        m121845Q(this.f91178G, 8);
    }

    /* JADX INFO: renamed from: g0 */
    public void mo118659g0(int i) {
        this.f91174C.setHint(i);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo118660h0(int i) {
        this.f91178G.setHint(i);
        m121845Q(this.f91175D, 8);
    }

    /* JADX INFO: renamed from: i0 */
    public void mo118661i0(VText vText) {
        bnl0.m105527N0(vText);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (mo53983O().mo52302m0()) {
            return;
        }
        m118650U();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        this.f91189R = m118654b0();
        return m118654b0();
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m118649T(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m118657e0(mo53983O().mo52252K2());
    }
}
