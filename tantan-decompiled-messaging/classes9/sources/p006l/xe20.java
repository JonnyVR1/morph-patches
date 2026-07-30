package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.b9l;
import l.e30;
import l.jq2;
import l.mkd0;
import l.w9j;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xe20 extends jq2<ff20> {

    /* JADX INFO: renamed from: a */
    public AdvancedSettings f27465a;

    /* JADX INFO: renamed from: b */
    public Settings f27466b;

    /* JADX INFO: renamed from: c */
    public Act f27467c;

    /* JADX INFO: renamed from: d */
    public AdvancedSettings f27468d;

    /* JADX INFO: renamed from: e */
    public AdvancedSettings f27469e;

    /* JADX INFO: renamed from: f */
    public boolean f27470f;

    public xe20(Act act) {
        super(act);
        this.f27470f = false;
        this.f27467c = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m27202e0(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m27203f0(Throwable th) {
        CoreModule.f1534c.f3652m0.m3095z5(false);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: k0 */
    private void m27208k0(AdvancedSettings advancedSettings) {
        m27212x0(advancedSettings);
        m27213y0(advancedSettings);
        m27209m0(advancedSettings);
    }

    /* JADX INFO: renamed from: m0 */
    private boolean m27209m0(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.a(advancedSettings)) {
            if (NullChecker.a(advancedSettings.popular)) {
                advancedSettings.popular = this.f27468d.popular;
                z = true;
            }
            if (NullChecker.a(advancedSettings.online)) {
                advancedSettings.online = this.f27468d.online;
                z = true;
            }
            if (NullChecker.a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f27468d.newUser;
                z = true;
            }
            if (NullChecker.a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f27468d.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: n0 */
    private boolean m27210n0(AdvancedSettings advancedSettings) {
        return NullChecker.a(advancedSettings) && CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified() && NullChecker.a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f27468d.realFace);
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m27211q0(AdvancedSettings advancedSettings) {
        return NullChecker.a(advancedSettings) && TEnum.equals(this.f27466b.verification.studies.status, "verified") && NullChecker.a(advancedSettings.student) && !advancedSettings.student.equals(this.f27468d.student);
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m27212x0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified() || !NullChecker.a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f27468d.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f27468d.realFace;
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    private boolean m27213y0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f27466b.verification.studies.status, "verified") || !NullChecker.a(advancedSettings.student) || advancedSettings.student.equals(this.f27468d.student)) {
            return false;
        }
        advancedSettings.student = this.f27468d.student;
        return true;
    }

    /* JADX INFO: renamed from: A0 */
    public void m27214A0() {
        if (this.f27470f) {
            m27224z0();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m27215C0(Settings settings) {
        this.f27466b = settings;
    }

    /* JADX INFO: renamed from: D0 */
    public void m27216D0(boolean z) {
        this.f27470f = z;
    }

    /* JADX INFO: renamed from: l0 */
    public AdvancedSettings m27217l0() {
        AdvancedSettings advancedSettings = this.f27469e;
        if (advancedSettings == null || this.f27468d == null) {
            return null;
        }
        ((ff20) ((jq2) this).viewModel).m15347z(advancedSettings);
        return this.f27469e.subtract(this.f27468d);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m27218o0() {
        return CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m27219p0() {
        return TEnum.equals(this.f27466b.verification.studies.status, "verified");
    }

    /* JADX INFO: renamed from: r0 */
    public void m27220r0(AdvancedSettings advancedSettings) {
        this.f27465a = advancedSettings;
        ((ff20) ((jq2) this).viewModel).m15340q(advancedSettings);
    }

    /* JADX INFO: renamed from: s0 */
    public void m27221s0() {
        duringCreated(CoreModule.f1534c.f3553F0.m12319s3().switchMap(new w9j() { // from class: l.ve20
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3553F0.m12308h3();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.we20
            public final void call(Object obj) {
                this.f25115a.m27222t0((AdvancedSettings) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m27222t0(AdvancedSettings advancedSettings) {
        if (NullChecker.a(advancedSettings)) {
            this.f27468d = advancedSettings;
            AdvancedSettings advancedSettingsClone = advancedSettings.clone();
            this.f27469e = advancedSettingsClone;
            ((ff20) ((jq2) this).viewModel).m15340q(advancedSettingsClone);
            m27220r0(this.f27469e);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m27223u0() {
        return CoreModule.f1534c.f3628e0.m21490p9().isVIP();
    }

    /* JADX INFO: renamed from: z0 */
    public void m27224z0() {
        AdvancedSettings advancedSettingsM27217l0 = m27217l0();
        if (NullChecker.a(advancedSettingsM27217l0)) {
            if (!xma.m27379e4()) {
                CoreModule.f1534c.f3553F0.m12315o3(advancedSettingsM27217l0, false).subscribe(mkd0.H(new e30() { // from class: l.re20
                    public final void call(Object obj) {
                        b9l.a("settings");
                    }
                }, new e30() { // from class: l.se20
                    public final void call(Object obj) {
                        xe20.m27202e0((Throwable) obj);
                    }
                }));
            } else if (m27211q0(advancedSettingsM27217l0) || m27210n0(advancedSettingsM27217l0)) {
                m27208k0(advancedSettingsM27217l0);
                CoreModule.f1534c.f3553F0.m12315o3(advancedSettingsM27217l0, false).subscribe(mkd0.H(new e30() { // from class: l.te20
                    public final void call(Object obj) {
                        b9l.a("settings");
                    }
                }, new e30() { // from class: l.ue20
                    public final void call(Object obj) {
                        xe20.m27203f0((Throwable) obj);
                    }
                }));
            }
        }
    }

    public void destroy() {
    }
}
