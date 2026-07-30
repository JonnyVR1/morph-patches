package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.School;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.StudentVerification;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Verification;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qde0 extends jq2<wde0> {

    /* JADX INFO: renamed from: a */
    public List<School> f7007a;

    /* JADX INFO: renamed from: b */
    public ArrayList<School> f7008b;

    /* JADX INFO: renamed from: c */
    public ArrayList<School> f7009c;

    /* JADX INFO: renamed from: d */
    public C3408a f7010d;

    /* JADX INFO: renamed from: e */
    public List<School> f7011e;

    /* JADX INFO: renamed from: l.qde0$a */
    public static class C3408a {

        /* JADX INFO: renamed from: a */
        public String f7012a;

        /* JADX INFO: renamed from: b */
        public String f7013b;

        /* JADX INFO: renamed from: c */
        public boolean f7014c;

        public C3408a() {
            this.f7012a = null;
            this.f7013b = null;
            this.f7014c = false;
        }

        /* JADX INFO: renamed from: a */
        public boolean m8973a() {
            String str = this.f7012a;
            if (str == null && this.f7013b == null) {
                return true;
            }
            return NullChecker.a(str) && this.f7012a.equals(this.f7013b);
        }
    }

    public qde0(mcr mcrVar) {
        super(mcrVar);
        this.f7007a = new ArrayList();
        this.f7008b = new ArrayList<>();
        this.f7009c = new ArrayList<>();
        this.f7010d = new C3408a();
        this.f7011e = new ArrayList();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8963k0(List<School> list) {
        this.f7008b.clear();
        this.f7008b.addAll(list);
        ((wde0) ((jq2) this).viewModel).m10492z();
    }

    /* JADX INFO: renamed from: l0 */
    public void m8964l0() {
        creates(new e30() { // from class: l.kde0
            public final void call(Object obj) {
                this.f5640a.m8965m0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.i0.S.k()).subscribe(mkd0.G(new e30() { // from class: l.lde0
            public final void call(Object obj) {
                this.f6148a.m8966n0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m8965m0(Bundle bundle) {
        ((wde0) ((jq2) this).viewModel).m10487r();
        this.f7007a.clear();
        this.f7011e.clear();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m8966n0(List list) {
        this.f7007a = list;
        if (NullChecker.a(list)) {
            if (this.f7007a.size() > 10) {
                this.f7011e = this.f7007a.subList(0, 10);
            } else {
                this.f7011e.addAll(this.f7007a);
            }
        }
        ((wde0) ((jq2) this).viewModel).m10482k();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String m8967o0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f7009c.clear();
            for (School school : this.f7007a) {
                String str3 = school.name;
                Locale locale = Locale.CHINESE;
                if (str3.toLowerCase(locale).contains(str.toLowerCase(locale)) || school.pinyin.toLowerCase(locale).contains(str.toLowerCase(locale))) {
                    if (!this.f7009c.contains(school)) {
                        this.f7009c.add(school);
                    }
                }
            }
            if (this.f7009c.size() == 0) {
                School school2 = new School();
                school2.f160id = "1";
                school2.name = act().getString(R.string.Yl);
                this.f7009c.add(school2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8968p0(String str) {
        C3408a c3408a = this.f7010d;
        c3408a.f7014c = false;
        if (!c3408a.m8973a()) {
            m8971s0(this.f7010d.f7013b);
        } else if (!TextUtils.isEmpty(str)) {
            m8963k0(this.f7009c);
        } else if (((wde0) ((jq2) this).viewModel).m10484m()) {
            ((wde0) ((jq2) this).viewModel).m10491y();
        } else {
            m8963k0(this.f7007a);
        }
        ((wde0) ((jq2) this).viewModel).m10488u();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m8969q0(School school, roj0 roj0Var) {
        act().progressDismiss();
        ((wde0) ((jq2) this).viewModel).m10477A(school, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m8970r0(School school, Throwable th) {
        act().progressDismiss();
        ((wde0) ((jq2) this).viewModel).m10477A(school, true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m8971s0(final String str) {
        C3408a c3408a = this.f7010d;
        c3408a.f7013b = str;
        if (c3408a.f7014c) {
            return;
        }
        c3408a.f7014c = true;
        c3408a.f7012a = str;
        c.just(str).compose(mkd0.Q()).map(new w9j() { // from class: l.mde0
            public final Object call(Object obj) {
                return this.f6333a.m8967o0(str, (String) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.nde0
            public final void call(Object obj) {
                this.f6503a.m8968p0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m8972t0(final School school) {
        act().progress(R.string.J5, true);
        User user = new User();
        Settings settings = new Settings();
        user.settings = settings;
        settings.verification = new Verification();
        user.settings.verification.studies = new StudentVerification();
        user.settings.verification.studies.school = school.f160id;
        CoreModule.c.i0.n3(user).subscribe(mkd0.H(new e30() { // from class: l.ode0
            public final void call(Object obj) {
                this.f6650a.m8969q0(school, (roj0) obj);
            }
        }, new e30() { // from class: l.pde0
            public final void call(Object obj) {
                this.f6851a.m8970r0(school, (Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
