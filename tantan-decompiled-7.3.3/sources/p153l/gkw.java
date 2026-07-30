package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class gkw {

    /* JADX INFO: renamed from: b */
    private static gkw f104775b;

    /* JADX INFO: renamed from: a */
    private ivl f104776a;

    private gkw() {
    }

    /* JADX INFO: renamed from: b */
    public static gkw m130601b() {
        if (f104775b == null) {
            f104775b = new gkw();
        }
        return f104775b;
    }

    /* JADX INFO: renamed from: a */
    public ivl m130602a() {
        ivl ivlVar = this.f104776a;
        if (ivlVar != null) {
            return ivlVar;
        }
        wg3.m206174a("请初始化IHttpRequester");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m130603c(ivl ivlVar) {
        this.f104776a = ivlVar;
    }
}
