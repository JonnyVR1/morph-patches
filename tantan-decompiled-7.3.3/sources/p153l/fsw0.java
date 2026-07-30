package p153l;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class fsw0 extends lsw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator f100695a;

    public fsw0(Comparator comparator) {
        this.f100695a = comparator;
    }

    @Override // p153l.lsw0
    /* JADX INFO: renamed from: a */
    public final Map mo12562a() {
        return new TreeMap(this.f100695a);
    }
}
