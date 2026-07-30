package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.School;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.StudentVerification;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Verification;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class vle0 extends ar2<bme0> {

    /* JADX INFO: renamed from: a */
    public List<School> f184563a;

    /* JADX INFO: renamed from: b */
    public ArrayList<School> f184564b;

    /* JADX INFO: renamed from: c */
    public ArrayList<School> f184565c;

    /* JADX INFO: renamed from: d */
    public C20851a f184566d;

    /* JADX INFO: renamed from: e */
    public List<School> f184567e;

    /* JADX INFO: renamed from: l.vle0$a */
    public static class C20851a {

        /* JADX INFO: renamed from: a */
        public String f184568a;

        /* JADX INFO: renamed from: b */
        public String f184569b;

        /* JADX INFO: renamed from: c */
        public boolean f184570c;

        public C20851a() {
            this.f184568a = null;
            this.f184569b = null;
            this.f184570c = false;
        }

        /* JADX INFO: renamed from: a */
        public boolean m201615a() {
            String str = this.f184568a;
            if (str == null && this.f184569b == null) {
                return true;
            }
            return NullChecker.m82486a(str) && this.f184568a.equals(this.f184569b);
        }
    }

    public vle0(ner nerVar) {
        super(nerVar);
        this.f184563a = new ArrayList();
        this.f184564b = new ArrayList<>();
        this.f184565c = new ArrayList<>();
        this.f184566d = new C20851a();
        this.f184567e = new ArrayList();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m201605k0(List<School> list) {
        this.f184564b.clear();
        this.f184564b.addAll(list);
        ((bme0) this.viewModel).m105054z();
    }

    /* JADX INFO: renamed from: l0 */
    public void m201606l0() {
        creates(new y20() { // from class: l.ple0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153023a.m201607m0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20393i0.f20482S.m159274k()).subscribe(psd0.m173596G(new y20() { // from class: l.qle0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158223a.m201608n0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m201607m0(Bundle bundle) {
        ((bme0) this.viewModel).m105049r();
        this.f184563a.clear();
        this.f184567e.clear();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m201608n0(List list) {
        this.f184563a = list;
        if (NullChecker.m82486a(list)) {
            if (this.f184563a.size() > 10) {
                this.f184567e = this.f184563a.subList(0, 10);
            } else {
                this.f184567e.addAll(this.f184563a);
            }
        }
        ((bme0) this.viewModel).m105044k();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String m201609o0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f184565c.clear();
            for (School school : this.f184563a) {
                String str3 = school.name;
                Locale locale = Locale.CHINESE;
                if (str3.toLowerCase(locale).contains(str.toLowerCase(locale)) || school.pinyin.toLowerCase(locale).contains(str.toLowerCase(locale))) {
                    if (!this.f184565c.contains(school)) {
                        this.f184565c.add(school);
                    }
                }
            }
            if (this.f184565c.size() == 0) {
                School school2 = new School();
                school2.f21240id = "1";
                school2.name = act().getString(R$string.f19716um);
                this.f184565c.add(school2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m201610p0(String str) {
        C20851a c20851a = this.f184566d;
        c20851a.f184570c = false;
        if (!c20851a.m201615a()) {
            m201613s0(this.f184566d.f184569b);
        } else if (!TextUtils.isEmpty(str)) {
            m201605k0(this.f184565c);
        } else if (((bme0) this.viewModel).m105046m()) {
            ((bme0) this.viewModel).m105053y();
        } else {
            m201605k0(this.f184563a);
        }
        ((bme0) this.viewModel).m105050u();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m201611q0(School school, uxj0 uxj0Var) {
        act().progressDismiss();
        ((bme0) this.viewModel).m105041A(school, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m201612r0(School school, Throwable th) {
        act().progressDismiss();
        ((bme0) this.viewModel).m105041A(school, true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m201613s0(final String str) {
        C20851a c20851a = this.f184566d;
        c20851a.f184569b = str;
        if (c20851a.f184570c) {
            return;
        }
        c20851a.f184570c = true;
        c20851a.f184568a = str;
        C22421c.just(str).compose(psd0.m173606Q()).map(new qcj() { // from class: l.rle0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163718a.m201609o0(str, (String) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.sle0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169369a.m201610p0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m201614t0(final School school) {
        act().progress(R$string.f18632L5, true);
        User user = new User();
        Settings settings = new Settings();
        user.settings = settings;
        settings.verification = new Verification();
        user.settings.verification.studies = new StudentVerification();
        user.settings.verification.studies.school = school.f21240id;
        CoreModule.f18264c.f20393i0.m32546n3(user).subscribe(psd0.m173597H(new y20() { // from class: l.tle0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174812a.m201611q0(school, (uxj0) obj);
            }
        }, new y20() { // from class: l.ule0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179505a.m201612r0(school, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
