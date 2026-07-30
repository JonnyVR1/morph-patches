package p149l;

import android.text.TextUtils;
import immomo.com.mklibrary.momitor.exception.MKLogIllegalArgumentException;

/* JADX INFO: loaded from: classes2.dex */
public class xbr extends AbstractC20803w5 {

    /* JADX INFO: renamed from: l.xbr$a */
    public static class C21068a extends AbstractC20803w5.a {

        /* JADX INFO: renamed from: h */
        String f191961h;

        public C21068a(String str, String str2) {
            super(str, "log");
            if (TextUtils.isEmpty(str2)) {
                throw new MKLogIllegalArgumentException("lifeCycle is empty");
            }
            this.f191961h = str2;
        }

        @Override // p149l.AbstractC20803w5.a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ StringBuilder mo201596a() {
            return super.mo201596a();
        }
    }

    private xbr(C21068a c21068a) {
        super(c21068a);
        c21068a.f184633f = "destroy".equals(c21068a.f191961h);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC20803w5 m207732j(String str, String str2) {
        return new xbr(new C21068a(str, str2));
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: a */
    public String mo117516a() {
        StringBuilder sbMo201596a = this.f184627a.mo201596a();
        sbMo201596a.append(mo96873e());
        sbMo201596a.append(((C21068a) this.f184627a).f191961h);
        return sbMo201596a.toString();
    }

    @Override // p149l.AbstractC20803w5
    /* JADX INFO: renamed from: e */
    public String mo96873e() {
        return "[LC]";
    }
}
