package p153l;

/* JADX INFO: renamed from: l.l */
/* JADX INFO: loaded from: classes7.dex */
public final class C18317l extends AbstractC19260p {
    public C18317l(b13 b13Var) {
        super(b13Var);
    }

    @Override // p153l.AbstractC19944s
    /* JADX INFO: renamed from: h */
    public void mo147749h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // p153l.AbstractC19944s
    /* JADX INFO: renamed from: i */
    public int mo147750i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
