package p153l;

import p153l.aij0;

/* JADX INFO: loaded from: classes.dex */
public abstract class aij0<CHILD extends aij0<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a */
    private xhj0<? super TranscodeType> f71541a = rt40.m183055b();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final xhj0<? super TranscodeType> m97997b() {
        return this.f71541a;
    }
}
