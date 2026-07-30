package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class xe20 extends jq2<ff20> {

    /* JADX INFO: renamed from: a */
    public AdvancedSettings f192518a;

    /* JADX INFO: renamed from: b */
    public Settings f192519b;

    /* JADX INFO: renamed from: c */
    public Act f192520c;

    /* JADX INFO: renamed from: d */
    public AdvancedSettings f192521d;

    /* JADX INFO: renamed from: e */
    public AdvancedSettings f192522e;

    /* JADX INFO: renamed from: f */
    public boolean f192523f;

    public xe20(Act act) {
        super(act);
        this.f192523f = false;
        this.f192520c = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m208481e0(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m208482f0(Throwable th) {
        CoreModule.f17545c.f19663m0.m31165z5(false);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: k0 */
    private void m208487k0(AdvancedSettings advancedSettings) {
        m208491x0(advancedSettings);
        m208492y0(advancedSettings);
        m208488m0(advancedSettings);
    }

    /* JADX INFO: renamed from: m0 */
    private boolean m208488m0(AdvancedSettings advancedSettings) {
        boolean z = false;
        if (NullChecker.m81303a(advancedSettings)) {
            if (NullChecker.m81303a(advancedSettings.popular)) {
                advancedSettings.popular = this.f192521d.popular;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.online)) {
                advancedSettings.online = this.f192521d.online;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.newUser)) {
                advancedSettings.newUser = this.f192521d.newUser;
                z = true;
            }
            if (NullChecker.m81303a(advancedSettings.zodiacs)) {
                advancedSettings.zodiacs = this.f192521d.zodiacs;
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: n0 */
    private boolean m208489n0(AdvancedSettings advancedSettings) {
        return NullChecker.m81303a(advancedSettings) && CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() && NullChecker.m81303a(advancedSettings.realFace) && !advancedSettings.realFace.equals(this.f192521d.realFace);
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m208490q0(AdvancedSettings advancedSettings) {
        return NullChecker.m81303a(advancedSettings) && TEnum.equals(this.f192519b.verification.studies.status, "verified") && NullChecker.m81303a(advancedSettings.student) && !advancedSettings.student.equals(this.f192521d.student);
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m208491x0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() || !NullChecker.m81303a(advancedSettings.realFace) || advancedSettings.realFace.equals(this.f192521d.realFace)) {
            return false;
        }
        advancedSettings.realFace = this.f192521d.realFace;
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    private boolean m208492y0(AdvancedSettings advancedSettings) {
        if (advancedSettings == null || TEnum.equals(this.f192519b.verification.studies.status, "verified") || !NullChecker.m81303a(advancedSettings.student) || advancedSettings.student.equals(this.f192521d.student)) {
            return false;
        }
        advancedSettings.student = this.f192521d.student;
        return true;
    }

    /* JADX INFO: renamed from: A0 */
    public void m208493A0() {
        if (this.f192523f) {
            m208503z0();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m208494C0(Settings settings) {
        this.f192519b = settings;
    }

    /* JADX INFO: renamed from: D0 */
    public void m208495D0(boolean z) {
        this.f192523f = z;
    }

    /* JADX INFO: renamed from: l0 */
    public AdvancedSettings m208496l0() {
        AdvancedSettings advancedSettings = this.f192522e;
        if (advancedSettings == null || this.f192521d == null) {
            return null;
        }
        ((ff20) this.viewModel).m121099z(advancedSettings);
        return this.f192522e.subtract(this.f192521d);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m208497o0() {
        return CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m208498p0() {
        return TEnum.equals(this.f192519b.verification.studies.status, "verified");
    }

    /* JADX INFO: renamed from: r0 */
    public void m208499r0(AdvancedSettings advancedSettings) {
        this.f192518a = advancedSettings;
        ((ff20) this.viewModel).m121092q(advancedSettings);
    }

    /* JADX INFO: renamed from: s0 */
    public void m208500s0() {
        duringCreated((C22306c) CoreModule.f17545c.f19564F0.m99252s3().switchMap(new w9j() { // from class: l.ve20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19564F0.m99241h3();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.we20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185901a.m208501t0((AdvancedSettings) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m208501t0(AdvancedSettings advancedSettings) {
        if (NullChecker.m81303a(advancedSettings)) {
            this.f192521d = advancedSettings;
            AdvancedSettings advancedSettingsMo223809clone = advancedSettings.mo223809clone();
            this.f192522e = advancedSettingsMo223809clone;
            ((ff20) this.viewModel).m121092q(advancedSettingsMo223809clone);
            m208499r0(this.f192522e);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m208502u0() {
        return CoreModule.f17545c.f19639e0.m169527p9().isVIP();
    }

    /* JADX INFO: renamed from: z0 */
    public void m208503z0() {
        AdvancedSettings advancedSettingsM208496l0 = m208496l0();
        if (NullChecker.m81303a(advancedSettingsM208496l0)) {
            if (!xma.m210071e4()) {
                CoreModule.f17545c.f19564F0.m99248o3(advancedSettingsM208496l0, false).subscribe(mkd0.m154956H(new e30() { // from class: l.re20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        b9l.m100816a(Settings.TYPE);
                    }
                }, new e30() { // from class: l.se20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xe20.m208481e0((Throwable) obj);
                    }
                }));
            } else if (m208490q0(advancedSettingsM208496l0) || m208489n0(advancedSettingsM208496l0)) {
                m208487k0(advancedSettingsM208496l0);
                CoreModule.f17545c.f19564F0.m99248o3(advancedSettingsM208496l0, false).subscribe(mkd0.m154956H(new e30() { // from class: l.te20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        b9l.m100816a(Settings.TYPE);
                    }
                }, new e30() { // from class: l.ue20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xe20.m208482f0((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
