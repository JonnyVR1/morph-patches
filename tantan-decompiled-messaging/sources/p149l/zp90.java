package p149l;

import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zp90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f204216A;

    /* JADX INFO: renamed from: B */
    public VText f204217B;

    /* JADX INFO: renamed from: C */
    public VText f204218C;

    /* JADX INFO: renamed from: D */
    public VText f204219D;

    /* JADX INFO: renamed from: E */
    public VText f204220E;

    /* JADX INFO: renamed from: F */
    public VText f204221F;

    /* JADX INFO: renamed from: G */
    public VText f204222G;

    /* JADX INFO: renamed from: H */
    public VText f204223H;

    /* JADX INFO: renamed from: I */
    public VText f204224I;

    /* JADX INFO: renamed from: J */
    public VText f204225J;

    /* JADX INFO: renamed from: K */
    public VText f204226K;

    /* JADX INFO: renamed from: L */
    public VText f204227L;

    /* JADX INFO: renamed from: M */
    public VText f204228M;

    /* JADX INFO: renamed from: N */
    public VText f204229N;

    /* JADX INFO: renamed from: O */
    public VText f204230O;

    /* JADX INFO: renamed from: P */
    public VText f204231P;

    /* JADX INFO: renamed from: Q */
    public VText f204232Q;

    /* JADX INFO: renamed from: R */
    public boolean f204233R;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f204234u;

    /* JADX INFO: renamed from: v */
    public VText f204235v;

    /* JADX INFO: renamed from: w */
    public VText f204236w;

    /* JADX INFO: renamed from: x */
    public VText f204237x;

    /* JADX INFO: renamed from: y */
    public VText f204238y;

    /* JADX INFO: renamed from: z */
    public VText f204239z;

    public zp90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f204233R = true;
    }

    /* JADX INFO: renamed from: V */
    public static String m219656V(Profile profile) {
        if (!NullChecker.m81303a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = vwb.m200296J(profile.extensions.basic.country) ? "" : profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = vwb.m200296J(profile.extensions.basic.province) ? "" : profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = vwb.m200296J(profile.extensions.basic.city) ? "" : profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: W */
    private String m219657W(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: X */
    public static String m219658X(Profile profile) {
        return profile.hometown;
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: T */
    public View m219659T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aq90.m98236b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final void m219660U() {
        VText vText = this.f204217B;
        VText vText2 = this.f204219D;
        VText vText3 = this.f204222G;
        VText vText4 = this.f204224I;
        VText vText5 = this.f204218C;
        VText vText6 = this.f204226K;
        vwb.m200354z(vwb.m200324f0(vText, vText2, vText3, vText4, vText5, vText6, this.f204225J, this.f204223H, vText6, this.f204229N, this.f204230O, this.f204231P, this.f204232Q), new e30() { // from class: l.xp90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193904a.m219666d0((VText) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public String m219661Y(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return m219662Z().getString(R$string.f18970ub);
            case "BACHELOR":
                return m219662Z().getString(R$string.f18910sb);
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return m219662Z().getString(R$string.f18940tb);
            case "DOCTOR":
                return m219662Z().getString(R$string.f19030wb);
            default:
                return m219662Z().getString(R$string.f19000vb);
        }
    }

    /* JADX INFO: renamed from: Z */
    public Resources m219662Z() {
        return mo52800O().act().getResources();
    }

    /* JADX INFO: renamed from: a0 */
    public String m219663a0(int i) {
        return mo52800O().act().getString(i);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m219664b0() {
        return new cq90().m108235a(mo52800O(), m219661Y(mo52800O().mo51069K2().profile.studies.qualification));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m219665c0(VText vText, View view) {
        CoreDlg.m45048b(mo52800O().act(), vText.getText() instanceof Spanned ? rza.m181741U0((Spanned) vText.getText()) : vText.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m219666d0(final VText vText) {
        if (!mo52800O().mo51119m0()) {
            vText.setBackgroundDrawable(null);
        }
        vText.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yp90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f199404a.m219665c0(vText, view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public void m219667e0(User user) {
        Studies studies;
        QualificationType qualificationType;
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f204217B.setText(m219663a0(R$string.f18277Xk));
            this.f204218C.setText(profile.studies.major);
            mo103361g0(R$string.f18067Qk);
            m96420Q(this.f204219D, 8);
        } else {
            m96420Q(this.f204219D, 0);
            this.f204217B.setText(profile.work.industry);
            this.f204218C.setText(profile.work.department);
            this.f204219D.setText(profile.work.company);
            mo103360f0(R$string.f17887Kk);
            mo103361g0(R$string.f17947Mk);
        }
        String str = profile.studies.school;
        if (NullChecker.m81303a(user.settings) && user.settings.hideSchoolName() && mo52800O().mo51075P1()) {
            str = profile.studies.school + "(" + m219663a0(R$string.f17627C0) + ")";
        }
        this.f204222G.setText(str);
        boolean zMo51119m0 = mo52800O().mo51119m0();
        Studies studies2 = profile.studies;
        if (zMo51119m0) {
            boolean z = studies2.active;
            View view = this.f204222G;
            if (z) {
                m96420Q(view, 0);
                mo103362h0(R$string.f18247Wk);
            } else {
                m96420Q(view, 8);
            }
        } else {
            boolean z2 = studies2.active;
            VText vText = this.f204222G;
            if (z2) {
                mo103363i0(vText);
            } else {
                m96420Q(vText, 8);
            }
        }
        if (mo52800O().mo51119m0() || !(((studies = profile.studies) == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_")) && TextUtils.isEmpty(profile.school))) {
            m96420Q(this.f204216A, 8);
            m96420Q(this.f204222G, 8);
            this.f204220E.setText(m219661Y(profile.studies.qualification));
            m96420Q(this.f204220E, (!mo52800O().mo51119m0() && TEnum.equals(profile.studies.qualification, "unknown_")) ? 8 : 0);
            String str2 = profile.studies.school;
            if (NullChecker.m81303a(user.settings) && user.settings.hideSchoolName() && mo52800O().mo51075P1()) {
                str2 = profile.studies.school + "(" + m219663a0(R$string.f17627C0) + ")";
            }
            this.f204221F.setText(str2);
            m96420Q(this.f204221F, (!mo52800O().mo51119m0() && TextUtils.isEmpty(profile.studies.school)) ? 8 : 0);
            m96420Q(this.f204219D, profile.studies.active ? 8 : 0);
        } else {
            m96420Q(this.f204239z, 8);
            m96420Q(this.f204216A, 8);
            m96420Q(this.f204220E, 8);
            m96420Q(this.f204221F, 8);
        }
        if (!b43.m100168b() || vwb.m200296J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            xdl0.m208344M(this.f204238y, false);
        } else {
            xdl0.m208345M0(this.f204238y, true);
            this.f204238y.setText(b43.m100167a(profile.extensions.physical.bloodType.get(0)));
        }
        if (IntlCountryCodeController.m28114j()) {
            if (mo52800O().mo51119m0() || !vwb.m200296J(profile.extensions.basic.ethnicity)) {
                xdl0.m208344M(this.f204236w, true);
                this.f204236w.setText(nha0.INSTANCE.m159389d(profile.extensions.basic.ethnicity));
            } else {
                xdl0.m208344M(this.f204236w, false);
            }
            if (mo52800O().mo51119m0() || !vwb.m200296J(profile.extensions.basic.language)) {
                xdl0.m208344M(this.f204237x, true);
                this.f204237x.setText(nha0.INSTANCE.m159390e(profile.extensions.basic.language));
            } else {
                xdl0.m208344M(this.f204237x, false);
            }
        }
        m96407C(m219662Z().getColor(w0c0.f183790N1), this.f204219D);
        m96407C(m219662Z().getColor(w0c0.f183790N1), this.f204218C);
        this.f204224I.setText(m219657W(profile));
        this.f204226K.setText(profile.hangouts);
        if (mo52800O().mo51119m0()) {
            return;
        }
        mo103363i0(this.f204217B);
        mo103363i0(this.f204218C);
        if (!IntlCountryCodeController.m28116l() || mo52800O().mo51069K2().isFemale() || (TEnum.equals(mo52800O().mo51069K2().profile.studies.qualification, "unknown_") && !mo52800O().mo51119m0())) {
            mo103363i0(this.f204219D);
        }
        mo103363i0(this.f204224I);
        mo103363i0(this.f204226K);
        boolean z3 = this.f204233R;
        if (this.f204217B.getVisibility() == 0 || this.f204219D.getVisibility() == 0 || this.f204222G.getVisibility() == 0 || this.f204218C.getVisibility() == 0 || this.f204224I.getVisibility() == 0 || this.f204226K.getVisibility() == 0 || this.f204239z.getVisibility() == 0 || this.f204238y.getVisibility() == 0) {
            this.f204233R = true;
        } else {
            this.f204233R = false;
        }
        if (z3 != this.f204233R) {
            mo52800O().mo51067J3();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void mo103360f0(int i) {
        this.f204219D.setHint(i);
        m96420Q(this.f204222G, 8);
    }

    /* JADX INFO: renamed from: g0 */
    public void mo103361g0(int i) {
        this.f204218C.setHint(i);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo103362h0(int i) {
        this.f204222G.setHint(i);
        m96420Q(this.f204219D, 8);
    }

    /* JADX INFO: renamed from: i0 */
    public void mo103363i0(VText vText) {
        xdl0.m208347N0(vText);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (mo52800O().mo51119m0()) {
            return;
        }
        m219660U();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        this.f204233R = m219664b0();
        return m219664b0();
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m219659T(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m219667e0(mo52800O().mo51069K2());
    }
}
