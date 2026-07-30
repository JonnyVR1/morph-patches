package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes13.dex */
public class xyv implements z0j0 {
    @Override // p153l.z0j0
    /* JADX INFO: renamed from: a */
    public nyv mo142978a(final nyv nyvVar) {
        String str = nyvVar.f144357b;
        int length = str.getBytes().length;
        boolean z = length >= 32768;
        if (z) {
            str = "日志大小为 ： " + length + "字节，超过 32kb 已经丢弃";
        }
        nyvVar.f144357b = str;
        if (z && msh0.m159795j()) {
            l51.m152887G(new Runnable() { // from class: l.wyv
                @Override // java.lang.Runnable
                public final void run() {
                    nyv nyvVar2 = nyvVar;
                    r1j0.m179420g(nyvVar2.f144359d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + nyvVar2.f144361f + "行，写入了不合格的超大日志，请检查");
                }
            });
        }
        return nyvVar;
    }
}
