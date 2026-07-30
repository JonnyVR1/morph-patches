package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes13.dex */
public class ywv implements wri0 {
    @Override // p149l.wri0
    /* JADX INFO: renamed from: a */
    public nwv mo127713a(final nwv nwvVar) {
        String str = nwvVar.f140978b;
        int length = str.getBytes().length;
        boolean z = length >= 32768;
        if (z) {
            str = "日志大小为 ： " + length + "字节，超过 32kb 已经丢弃";
        }
        nwvVar.f140978b = str;
        if (z && fkh0.m121864j()) {
            e51.m114742G(new Runnable() { // from class: l.xwv
                @Override // java.lang.Runnable
                public final void run() {
                    nwv nwvVar2 = nwvVar;
                    osi0.m165783g(nwvVar2.f140980d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + nwvVar2.f140982f + "行，写入了不合格的超大日志，请检查");
                }
            });
        }
        return nwvVar;
    }
}
