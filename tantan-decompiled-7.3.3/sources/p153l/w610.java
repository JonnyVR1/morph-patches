package p153l;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class w610 {

    /* JADX INFO: renamed from: a */
    khx f187586a = khx.f126933j;

    /* JADX INFO: renamed from: b */
    List<xej0> f187587b = new LinkedList();

    /* JADX INFO: renamed from: a */
    public List<xej0> m205076a() {
        return this.f187587b;
    }

    public String toString() {
        String str = "Movie{ ";
        for (xej0 xej0Var : this.f187587b) {
            str = str + "track_" + xej0Var.m210706y().m167455a() + " (" + xej0Var.getHandler() + ") ";
        }
        return str.concat("}");
    }
}
