package p149l;

import p149l.w8j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class w8j0<CHILD extends w8j0<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a */
    private t8j0<? super TranscodeType> f185228a = dl40.m112327b();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final t8j0<? super TranscodeType> m202186b() {
        return this.f185228a;
    }
}
