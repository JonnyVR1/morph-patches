package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.CoreGiftPriority;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.y5 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public abstract class AbstractC3491y5 implements f2m {

    /* JADX INFO: renamed from: a */
    public File f8987a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f8988b = new HashMap<>(2);

    public AbstractC3491y5(File file) {
        this.f8987a = file;
        m11147e();
    }

    @Override // p003l.f2m
    /* JADX INFO: renamed from: a */
    public void mo6370a(String str, String str2, String str3, CoreGiftPriority coreGiftPriority, f2m.InterfaceC3325a interfaceC3325a) {
        if (!TextUtils.isEmpty(str3)) {
            this.f8988b.put(str2, str3);
        }
        m11149i(str, str2, coreGiftPriority, interfaceC3325a);
    }

    @Override // p003l.f2m
    /* JADX INFO: renamed from: b */
    public File mo6371b(String str, String str2) {
        return m11151k(str, str2);
    }

    @Override // p003l.f2m
    /* JADX INFO: renamed from: c */
    public abstract boolean mo6372c(String str, String str2);

    @Override // p003l.f2m
    /* JADX INFO: renamed from: d */
    public String mo6373d(String str, String str2) {
        return m11151k(str, str2).getAbsolutePath();
    }

    /* JADX INFO: renamed from: e */
    public final void m11147e() {
        if (!this.f8987a.exists()) {
            this.f8987a.mkdirs();
        }
        File file = new File(this.f8987a, ".nomedia");
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11148f(String str, String str2, CoreGiftPriority coreGiftPriority, f2m.InterfaceC3325a interfaceC3325a) {
        if (pwc0.m8828q().m8835r(str2)) {
            return;
        }
        pwc0.m8828q().m8834p(str, str2, m11150j(str, str2).getAbsolutePath(), coreGiftPriority, mo9342g(str), this, new a(interfaceC3325a, str2, str));
    }

    /* JADX INFO: renamed from: g */
    public abstract w7e mo9342g(String str);

    /* JADX INFO: renamed from: h */
    public abstract String mo9343h();

    /* JADX INFO: renamed from: i */
    public final void m11149i(String str, String str2, CoreGiftPriority coreGiftPriority, f2m.InterfaceC3325a interfaceC3325a) {
        if (TextUtils.isEmpty(str2) || !str2.toLowerCase().endsWith(mo9343h().toLowerCase())) {
            if (NullChecker.a(interfaceC3325a)) {
                interfaceC3325a.mo2789d("后缀校验没通过", str);
            }
        } else if (!mo6372c(str, str2)) {
            m11148f(str, str2, coreGiftPriority, interfaceC3325a);
        } else if (NullChecker.a(interfaceC3325a)) {
            interfaceC3325a.mo6007b(m11151k(str, str2).getAbsolutePath(), str);
        }
    }

    /* JADX INFO: renamed from: j */
    public File m11150j(String str, String str2) {
        File file = this.f8987a;
        StringBuilder sb = new StringBuilder("core_dynamic");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        File file2 = new File(file, sb.toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return new File(file2, jo9.m7442e(str2) + mo9343h());
    }

    /* JADX INFO: renamed from: k */
    public File m11151k(String str, String str2) {
        File file = this.f8987a;
        StringBuilder sb = new StringBuilder("core_dynamic");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        File file2 = new File(file, sb.toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return new File(file2, jo9.m7442e(str2));
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo9344m(String str, String str2);

    /* JADX INFO: renamed from: l.y5$a */
    public class a implements qwc0.InterfaceC3412a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f2m.InterfaceC3325a f8989a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8990b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8991c;

        public a(f2m.InterfaceC3325a interfaceC3325a, String str, String str2) {
            this.f8989a = interfaceC3325a;
            this.f8990b = str;
            this.f8991c = str2;
        }

        @Override // p003l.qwc0.InterfaceC3412a
        /* JADX INFO: renamed from: a */
        public void mo9040a(File file) {
            AbstractC3491y5.this.m11152l(this.f8990b, file);
            f2m.InterfaceC3325a interfaceC3325a = this.f8989a;
            if (interfaceC3325a != null) {
                interfaceC3325a.mo6007b(AbstractC3491y5.this.m11151k(this.f8991c, this.f8990b).getAbsolutePath(), this.f8991c);
            }
        }

        @Override // p003l.qwc0.InterfaceC3412a
        /* JADX INFO: renamed from: c */
        public void mo9041c(float f) {
            f2m.InterfaceC3325a interfaceC3325a = this.f8989a;
            if (interfaceC3325a != null) {
                interfaceC3325a.mo6008c(f);
            }
        }

        @Override // p003l.qwc0.InterfaceC3412a
        public void onFailed(String str) {
            f2m.InterfaceC3325a interfaceC3325a = this.f8989a;
            if (interfaceC3325a != null) {
                interfaceC3325a.mo2789d(str, this.f8991c);
            }
        }

        @Override // p003l.qwc0.InterfaceC3412a
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11152l(String str, File file) {
    }
}
