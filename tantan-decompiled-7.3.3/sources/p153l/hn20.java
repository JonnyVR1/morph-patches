package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class hn20 extends ar2<pn20> {

    /* JADX INFO: renamed from: a */
    public AdvancedSettings f110693a;

    /* JADX INFO: renamed from: b */
    public Settings f110694b;

    /* JADX INFO: renamed from: c */
    public Act f110695c;

    /* JADX INFO: renamed from: d */
    public AdvancedSettings f110696d;

    /* JADX INFO: renamed from: e */
    public AdvancedSettings f110697e;

    /* JADX INFO: renamed from: f */
    public boolean f110698f;

    public hn20(Act act) {
        super(act);
        this.f110698f = false;
        this.f110695c = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m136018e0(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m136019f0(Throwable th) {
        CoreModule.f18264c.f20405m0.m32168z5(false);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: k0 */
    private void m136024k0(AdvancedSettings advancedSettings) {
        m136028x0(advancedSettings);
        m136029y0(advancedSettings);
        m136025m0(advancedSettings);
    }

    /* JADX INFO: renamed from: m0 */
    private boolean m136025m0(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.m82486a(advancedSettings)) {
            if (NullChecker.m82486a(advancedSettings.popular)) {
                advancedSettings.popular = this.f110696d.popular;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.online)) {
                advancedSettings.online = this.f110696d.online;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f110696d.newUser;
                z = true;
            }
            if (NullChecker.m82486a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f110696d.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: n0 */
    private boolean m136026n0(AdvancedSettings advancedSettings) {
        return NullChecker.m82486a(advancedSettings) && CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() && NullChecker.m82486a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f110696d.realFace);
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m136027q0(AdvancedSettings advancedSettings) {
        return NullChecker.m82486a(advancedSettings) && TEnum.equals(this.f110694b.verification.studies.status, "verified") && NullChecker.m82486a(advancedSettings.student) && !advancedSettings.student.equals(this.f110696d.student);
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m136028x0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() || !NullChecker.m82486a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f110696d.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f110696d.realFace;
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    private boolean m136029y0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f110694b.verification.studies.status, "verified") || !NullChecker.m82486a(advancedSettings.student) || advancedSettings.student.equals(this.f110696d.student)) {
            return false;
        }
        advancedSettings.student = this.f110696d.student;
        return true;
    }

    /* JADX INFO: renamed from: A0 */
    public void m136030A0() {
        if (this.f110698f) {
            m136040z0();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m136031C0(Settings settings) {
        this.f110694b = settings;
    }

    /* JADX INFO: renamed from: D0 */
    public void m136032D0(boolean z) {
        this.f110698f = z;
    }

    /* JADX INFO: renamed from: l0 */
    public AdvancedSettings m136033l0() {
        AdvancedSettings advancedSettings = this.f110697e;
        if (advancedSettings == null || this.f110696d == null) {
            return null;
        }
        ((pn20) this.viewModel).m173029z(advancedSettings);
        return this.f110697e.subtract(this.f110696d);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m136034o0() {
        return CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m136035p0() {
        return TEnum.equals(this.f110694b.verification.studies.status, "verified");
    }

    /* JADX INFO: renamed from: r0 */
    public void m136036r0(AdvancedSettings advancedSettings) {
        this.f110693a = advancedSettings;
        ((pn20) this.viewModel).m173022q(advancedSettings);
    }

    /* JADX INFO: renamed from: s0 */
    public void m136037s0() {
        duringCreated((C22421c) CoreModule.f18264c.f20306F0.m118456s3().switchMap(new qcj() { // from class: l.fn20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20306F0.m118445h3();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.gn20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105055a.m136038t0((AdvancedSettings) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m136038t0(AdvancedSettings advancedSettings) {
        if (NullChecker.m82486a(advancedSettings)) {
            this.f110696d = advancedSettings;
            AdvancedSettings advancedSettingsMo225055clone = advancedSettings.mo225055clone();
            this.f110697e = advancedSettingsMo225055clone;
            ((pn20) this.viewModel).m173022q(advancedSettingsMo225055clone);
            m136036r0(this.f110697e);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m136039u0() {
        return CoreModule.f18264c.f20381e0.m116600p9().isVIP();
    }

    /* JADX INFO: renamed from: z0 */
    public void m136040z0() {
        AdvancedSettings advancedSettingsM136033l0 = m136033l0();
        if (NullChecker.m82486a(advancedSettingsM136033l0)) {
            if (!joa.m146386f4()) {
                CoreModule.f18264c.f20306F0.m118452o3(advancedSettingsM136033l0, false).subscribe(psd0.m173597H(new y20() { // from class: l.bn20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rbl.m180757a(Settings.TYPE);
                    }
                }, new y20() { // from class: l.cn20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        hn20.m136018e0((Throwable) obj);
                    }
                }));
            } else if (m136027q0(advancedSettingsM136033l0) || m136026n0(advancedSettingsM136033l0)) {
                m136024k0(advancedSettingsM136033l0);
                CoreModule.f18264c.f20306F0.m118452o3(advancedSettingsM136033l0, false).subscribe(psd0.m173597H(new y20() { // from class: l.dn20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rbl.m180757a(Settings.TYPE);
                    }
                }, new y20() { // from class: l.en20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        hn20.m136019f0((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
