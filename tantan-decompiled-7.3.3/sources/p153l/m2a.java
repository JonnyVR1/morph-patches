package p153l;

import com.p051p1.mobile.putong.data.Tag;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m2a implements qcj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HashSet f134532a;

    public /* synthetic */ m2a(HashSet hashSet) {
        this.f134532a = hashSet;
    }

    @Override // p153l.qcj
    public final Object call(Object obj) {
        return Boolean.valueOf(this.f134532a.contains((Tag) obj));
    }
}
