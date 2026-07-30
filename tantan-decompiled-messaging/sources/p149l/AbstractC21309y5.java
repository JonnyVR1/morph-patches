package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.CoreGiftPriority;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.y5 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC21309y5 implements f2m {

    /* JADX INFO: renamed from: a */
    public File f196368a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f196369b = new HashMap<>(2);

    public AbstractC21309y5(File file) {
        this.f196368a = file;
        m212947e();
    }

    @Override // p149l.f2m
    /* JADX INFO: renamed from: a */
    public void mo119227a(String str, String str2, String str3, CoreGiftPriority coreGiftPriority, f2m.InterfaceC16743a interfaceC16743a) {
        if (!TextUtils.isEmpty(str3)) {
            this.f196369b.put(str2, str3);
        }
        m212949i(str, str2, coreGiftPriority, interfaceC16743a);
    }

    @Override // p149l.f2m
    /* JADX INFO: renamed from: b */
    public File mo119228b(String str, String str2) {
        return m212951k(str, str2);
    }

    @Override // p149l.f2m
    /* JADX INFO: renamed from: c */
    public abstract boolean mo119229c(String str, String str2);

    @Override // p149l.f2m
    /* JADX INFO: renamed from: d */
    public String mo119230d(String str, String str2) {
        return m212951k(str, str2).getAbsolutePath();
    }

    /* JADX INFO: renamed from: e */
    public final void m212947e() {
        if (!this.f196368a.exists()) {
            this.f196368a.mkdirs();
        }
        File file = new File(this.f196368a, ".nomedia");
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m212948f(String str, String str2, CoreGiftPriority coreGiftPriority, f2m.InterfaceC16743a interfaceC16743a) {
        if (pwc0.m171721q().m171728r(str2)) {
            return;
        }
        pwc0.m171721q().m171727p(str, str2, m212950j(str, str2).getAbsolutePath(), coreGiftPriority, mo184127g(str), this, new a(interfaceC16743a, str2, str));
    }

    /* JADX INFO: renamed from: g */
    public abstract w7e mo184127g(String str);

    /* JADX INFO: renamed from: h */
    public abstract String mo184128h();

    /* JADX INFO: renamed from: i */
    public final void m212949i(String str, String str2, CoreGiftPriority coreGiftPriority, f2m.InterfaceC16743a interfaceC16743a) {
        if (TextUtils.isEmpty(str2) || !str2.toLowerCase().endsWith(mo184128h().toLowerCase())) {
            if (NullChecker.m81303a(interfaceC16743a)) {
                interfaceC16743a.mo45459d("后缀校验没通过", str);
            }
        } else if (!mo119229c(str, str2)) {
            m212948f(str, str2, coreGiftPriority, interfaceC16743a);
        } else if (NullChecker.m81303a(interfaceC16743a)) {
            interfaceC16743a.mo108990b(m212951k(str, str2).getAbsolutePath(), str);
        }
    }

    /* JADX INFO: renamed from: j */
    public File m212950j(String str, String str2) {
        File file = this.f196368a;
        StringBuilder sb = new StringBuilder("core_dynamic");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        File file2 = new File(file, sb.toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return new File(file2, jo9.m142421e(str2) + mo184128h());
    }

    /* JADX INFO: renamed from: k */
    public File m212951k(String str, String str2) {
        File file = this.f196368a;
        StringBuilder sb = new StringBuilder("core_dynamic");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        File file2 = new File(file, sb.toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return new File(file2, jo9.m142421e(str2));
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo184129m(String str, String str2);

    /* JADX INFO: renamed from: l.y5$a */
    public class a implements qwc0.InterfaceC19597a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f2m.InterfaceC16743a f196370a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f196371b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f196372c;

        public a(f2m.InterfaceC16743a interfaceC16743a, String str, String str2) {
            this.f196370a = interfaceC16743a;
            this.f196371b = str;
            this.f196372c = str2;
        }

        @Override // p149l.qwc0.InterfaceC19597a
        /* JADX INFO: renamed from: a */
        public void mo176788a(File file) {
            AbstractC21309y5.this.m212952l(this.f196371b, file);
            f2m.InterfaceC16743a interfaceC16743a = this.f196370a;
            if (interfaceC16743a != null) {
                interfaceC16743a.mo108990b(AbstractC21309y5.this.m212951k(this.f196372c, this.f196371b).getAbsolutePath(), this.f196372c);
            }
        }

        @Override // p149l.qwc0.InterfaceC19597a
        /* JADX INFO: renamed from: c */
        public void mo176789c(float f) {
            f2m.InterfaceC16743a interfaceC16743a = this.f196370a;
            if (interfaceC16743a != null) {
                interfaceC16743a.mo108991c(f);
            }
        }

        @Override // p149l.qwc0.InterfaceC19597a
        public void onFailed(String str) {
            f2m.InterfaceC16743a interfaceC16743a = this.f196370a;
            if (interfaceC16743a != null) {
                interfaceC16743a.mo45459d(str, this.f196372c);
            }
        }

        @Override // p149l.qwc0.InterfaceC19597a
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: l */
    public void m212952l(String str, File file) {
    }
}
