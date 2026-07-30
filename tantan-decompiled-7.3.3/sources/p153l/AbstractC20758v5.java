package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.CoreGiftPriority;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.v5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20758v5 implements y4m {

    /* JADX INFO: renamed from: a */
    public File f182448a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f182449b = new HashMap<>(2);

    public AbstractC20758v5(File file) {
        this.f182448a = file;
        m199746e();
    }

    @Override // p153l.y4m
    /* JADX INFO: renamed from: a */
    public void mo199742a(String str, String str2, String str3, CoreGiftPriority coreGiftPriority, y4m.InterfaceC21517a interfaceC21517a) {
        if (!TextUtils.isEmpty(str3)) {
            this.f182449b.put(str2, str3);
        }
        m199750i(str, str2, coreGiftPriority, interfaceC21517a);
    }

    @Override // p153l.y4m
    /* JADX INFO: renamed from: b */
    public File mo199743b(String str, String str2) {
        return m199752k(str, str2);
    }

    @Override // p153l.y4m
    /* JADX INFO: renamed from: c */
    public abstract boolean mo199744c(String str, String str2);

    @Override // p153l.y4m
    /* JADX INFO: renamed from: d */
    public String mo199745d(String str, String str2) {
        return m199752k(str, str2).getAbsolutePath();
    }

    /* JADX INFO: renamed from: e */
    public final void m199746e() {
        if (!this.f182448a.exists()) {
            this.f182448a.mkdirs();
        }
        File file = new File(this.f182448a, ".nomedia");
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m199747f(String str, String str2, CoreGiftPriority coreGiftPriority, y4m.InterfaceC21517a interfaceC21517a) {
        if (s4d0.m184537q().m184544r(str2)) {
            return;
        }
        s4d0.m184537q().m184543p(str, str2, m199751j(str, str2).getAbsolutePath(), coreGiftPriority, mo199748g(str), this, new a(interfaceC21517a, str2, str));
    }

    /* JADX INFO: renamed from: g */
    public abstract k9e mo199748g(String str);

    /* JADX INFO: renamed from: h */
    public abstract String mo199749h();

    /* JADX INFO: renamed from: i */
    public final void m199750i(String str, String str2, CoreGiftPriority coreGiftPriority, y4m.InterfaceC21517a interfaceC21517a) {
        if (TextUtils.isEmpty(str2) || !str2.toLowerCase().endsWith(mo199749h().toLowerCase())) {
            if (NullChecker.m82486a(interfaceC21517a)) {
                interfaceC21517a.mo46642d("后缀校验没通过", str);
            }
        } else if (!mo199744c(str, str2)) {
            m199747f(str, str2, coreGiftPriority, interfaceC21517a);
        } else if (NullChecker.m82486a(interfaceC21517a)) {
            interfaceC21517a.mo123978b(m199752k(str, str2).getAbsolutePath(), str);
        }
    }

    /* JADX INFO: renamed from: j */
    public File m199751j(String str, String str2) {
        File file = this.f182448a;
        StringBuilder sb = new StringBuilder("core_dynamic");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        File file2 = new File(file, sb.toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return new File(file2, sp9.m187334e(str2) + mo199749h());
    }

    /* JADX INFO: renamed from: k */
    public File m199752k(String str, String str2) {
        File file = this.f182448a;
        StringBuilder sb = new StringBuilder("core_dynamic");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        File file2 = new File(file, sb.toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return new File(file2, sp9.m187334e(str2));
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo199754m(String str, String str2);

    /* JADX INFO: renamed from: l.v5$a */
    public class a implements t4d0.InterfaceC20233a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y4m.InterfaceC21517a f182450a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f182451b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f182452c;

        public a(y4m.InterfaceC21517a interfaceC21517a, String str, String str2) {
            this.f182450a = interfaceC21517a;
            this.f182451b = str;
            this.f182452c = str2;
        }

        @Override // p153l.t4d0.InterfaceC20233a
        /* JADX INFO: renamed from: a */
        public void mo189255a(File file) {
            AbstractC20758v5.this.m199753l(this.f182451b, file);
            y4m.InterfaceC21517a interfaceC21517a = this.f182450a;
            if (interfaceC21517a != null) {
                interfaceC21517a.mo123978b(AbstractC20758v5.this.m199752k(this.f182452c, this.f182451b).getAbsolutePath(), this.f182452c);
            }
        }

        @Override // p153l.t4d0.InterfaceC20233a
        /* JADX INFO: renamed from: c */
        public void mo189256c(float f) {
            y4m.InterfaceC21517a interfaceC21517a = this.f182450a;
            if (interfaceC21517a != null) {
                interfaceC21517a.mo123979c(f);
            }
        }

        @Override // p153l.t4d0.InterfaceC20233a
        public void onFailed(String str) {
            y4m.InterfaceC21517a interfaceC21517a = this.f182450a;
            if (interfaceC21517a != null) {
                interfaceC21517a.mo46642d(str, this.f182452c);
            }
        }

        @Override // p153l.t4d0.InterfaceC20233a
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: l */
    public void m199753l(String str, File file) {
    }
}
