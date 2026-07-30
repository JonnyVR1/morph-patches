package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.School;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StudentVerification;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Verification;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public class qde0 extends jq2<wde0> {

    /* JADX INFO: renamed from: a */
    public List<School> f153907a;

    /* JADX INFO: renamed from: b */
    public ArrayList<School> f153908b;

    /* JADX INFO: renamed from: c */
    public ArrayList<School> f153909c;

    /* JADX INFO: renamed from: d */
    public C19463a f153910d;

    /* JADX INFO: renamed from: e */
    public List<School> f153911e;

    /* JADX INFO: renamed from: l.qde0$a */
    public static class C19463a {

        /* JADX INFO: renamed from: a */
        public String f153912a;

        /* JADX INFO: renamed from: b */
        public String f153913b;

        /* JADX INFO: renamed from: c */
        public boolean f153914c;

        public C19463a() {
            this.f153912a = null;
            this.f153913b = null;
            this.f153914c = false;
        }

        /* JADX INFO: renamed from: a */
        public boolean m174030a() {
            String str = this.f153912a;
            if (str == null && this.f153913b == null) {
                return true;
            }
            return NullChecker.m81303a(str) && this.f153912a.equals(this.f153913b);
        }
    }

    public qde0(mcr mcrVar) {
        super(mcrVar);
        this.f153907a = new ArrayList();
        this.f153908b = new ArrayList<>();
        this.f153909c = new ArrayList<>();
        this.f153910d = new C19463a();
        this.f153911e = new ArrayList();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m174020k0(List<School> list) {
        this.f153908b.clear();
        this.f153908b.addAll(list);
        ((wde0) this.viewModel).m202736z();
    }

    /* JADX INFO: renamed from: l0 */
    public void m174021l0() {
        creates(new e30() { // from class: l.kde0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122553a.m174022m0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19651i0.f19740S.m121230k()).subscribe(mkd0.m154955G(new e30() { // from class: l.lde0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127543a.m174023n0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m174022m0(Bundle bundle) {
        ((wde0) this.viewModel).m202731r();
        this.f153907a.clear();
        this.f153911e.clear();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m174023n0(List list) {
        this.f153907a = list;
        if (NullChecker.m81303a(list)) {
            if (this.f153907a.size() > 10) {
                this.f153911e = this.f153907a.subList(0, 10);
            } else {
                this.f153911e.addAll(this.f153907a);
            }
        }
        ((wde0) this.viewModel).m202726k();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String m174024o0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f153909c.clear();
            for (School school : this.f153907a) {
                String str3 = school.name;
                Locale locale = Locale.CHINESE;
                if (str3.toLowerCase(locale).contains(str.toLowerCase(locale)) || school.pinyin.toLowerCase(locale).contains(str.toLowerCase(locale))) {
                    if (!this.f153909c.contains(school)) {
                        this.f153909c.add(school);
                    }
                }
            }
            if (this.f153909c.size() == 0) {
                School school2 = new School();
                school2.f20498id = "1";
                school2.name = act().getString(R$string.f18308Yl);
                this.f153909c.add(school2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m174025p0(String str) {
        C19463a c19463a = this.f153910d;
        c19463a.f153914c = false;
        if (!c19463a.m174030a()) {
            m174028s0(this.f153910d.f153913b);
        } else if (!TextUtils.isEmpty(str)) {
            m174020k0(this.f153909c);
        } else if (((wde0) this.viewModel).m202728m()) {
            ((wde0) this.viewModel).m202735y();
        } else {
            m174020k0(this.f153907a);
        }
        ((wde0) this.viewModel).m202732u();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m174026q0(School school, roj0 roj0Var) {
        act().progressDismiss();
        ((wde0) this.viewModel).m202723A(school, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m174027r0(School school, Throwable th) {
        act().progressDismiss();
        ((wde0) this.viewModel).m202723A(school, true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m174028s0(final String str) {
        C19463a c19463a = this.f153910d;
        c19463a.f153913b = str;
        if (c19463a.f153914c) {
            return;
        }
        c19463a.f153914c = true;
        c19463a.f153912a = str;
        C22306c.just(str).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.mde0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133233a.m174024o0(str, (String) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.nde0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138280a.m174025p0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m174029t0(final School school) {
        act().progress(R$string.f17842J5, true);
        User user = new User();
        Settings settings = new Settings();
        user.settings = settings;
        settings.verification = new Verification();
        user.settings.verification.studies = new StudentVerification();
        user.settings.verification.studies.school = school.f20498id;
        CoreModule.f17545c.f19651i0.m31543n3(user).subscribe(mkd0.m154956H(new e30() { // from class: l.ode0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143199a.m174026q0(school, (roj0) obj);
            }
        }, new e30() { // from class: l.pde0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148296a.m174027r0(school, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
