package p149l;

/* JADX INFO: loaded from: classes.dex */
public class sgf0 implements uim {

    /* JADX INFO: renamed from: a */
    public final int f164419a;

    public sgf0(int i) {
        this.f164419a = i;
    }

    @Override // p149l.uim
    public tim createImageTranscoder(egm egmVar, boolean z) {
        return new rgf0(z, this.f164419a);
    }
}
