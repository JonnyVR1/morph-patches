package p149l;

/* JADX INFO: renamed from: l.l */
/* JADX INFO: loaded from: classes7.dex */
public final class C18119l extends AbstractC19087p {
    public C18119l(m03 m03Var) {
        super(m03Var);
    }

    @Override // p149l.AbstractC19819s
    /* JADX INFO: renamed from: h */
    public void mo143970h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // p149l.AbstractC19819s
    /* JADX INFO: renamed from: i */
    public int mo143971i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
