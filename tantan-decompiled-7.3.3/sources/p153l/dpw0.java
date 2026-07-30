package p153l;

import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dpw0 {

    /* JADX INFO: renamed from: a */
    public final bow0 f90092a;

    /* JADX INFO: renamed from: b */
    public final cpw0 f90093b;

    public dpw0(cpw0 cpw0Var) {
        bow0 bow0Var = aow0.f72655b;
        this.f90093b = cpw0Var;
        this.f90092a = bow0Var;
    }

    /* JADX INFO: renamed from: b */
    public static dpw0 m117426b(int i) {
        return new dpw0(new zow0(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED));
    }

    /* JADX INFO: renamed from: c */
    public static dpw0 m117427c(bow0 bow0Var) {
        return new dpw0(new xow0(bow0Var));
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m117429d(CharSequence charSequence) {
        charSequence.getClass();
        return new apw0(this, charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final List m117430f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itM117431g = m117431g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM117431g.hasNext()) {
            arrayList.add((String) itM117431g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final Iterator m117431g(CharSequence charSequence) {
        return this.f90093b.mo111832a(this, charSequence);
    }
}
