package p149l;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class my00 {

    /* JADX INFO: renamed from: a */
    lex f136241a = lex.f127769j;

    /* JADX INFO: renamed from: b */
    List<t5j0> f136242b = new LinkedList();

    /* JADX INFO: renamed from: a */
    public List<t5j0> m156951a() {
        return this.f136242b;
    }

    public String toString() {
        String str = "Movie{ ";
        for (t5j0 t5j0Var : this.f136242b) {
            str = str + "track_" + t5j0Var.m187303y().m144623a() + " (" + t5j0Var.getHandler() + ") ";
        }
        return str.concat("}");
    }
}
