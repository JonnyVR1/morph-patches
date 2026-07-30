package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class eow extends AbstractC20803w5 {

    /* JADX INFO: renamed from: b */
    private final boolean f92500b;

    private eow(AbstractC20803w5.a aVar, boolean z) {
        super(aVar);
        this.f92500b = z;
    }

    /* JADX INFO: renamed from: j */
    public static eow m117512j(String str, boolean z, String str2, @NonNull String str3, String str4) {
        AbstractC20803w5.a aVar = new AbstractC20803w5.a(str, str2);
        aVar.f184632e = str4;
        aVar.f184634g = "mwc";
        aVar.f184630c = str3;
        return new eow(aVar, z);
    }

    /* JADX INFO: renamed from: k */
    public static eow m117513k(String str, String str2, String str3) {
        return m117512j(str, true, str2, "native", str3);
    }

    /* JADX INFO: renamed from: l */
    public static eow m117514l(String str, String str2, String str3) {
        return m117512j(str, true, str2, "js", str3);
    }

    /* JADX INFO: renamed from: m */
    public static eow m117515m(String str, String str2, String str3) {
        return m117512j(str, false, str2, "native", str3);
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: a */
    public String mo117516a() {
        StringBuilder sbMo201596a = this.f184627a.mo201596a();
        sbMo201596a.append(mo96873e());
        sbMo201596a.append(this.f184627a.f184632e);
        return sbMo201596a.toString();
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: b */
    public boolean mo117517b() {
        return this.f92500b || mei.m154203i();
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: e */
    public String mo96873e() {
        return this.f92500b ? "[MWC]Error&&&" : "[MWC]Log&&&";
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: i */
    public boolean mo96874i() {
        return this.f92500b;
    }
}
