package p149l;

import com.p046p1.mobile.putong.data.Tag;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b1a implements w9j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HashSet f72500a;

    public /* synthetic */ b1a(HashSet hashSet) {
        this.f72500a = hashSet;
    }

    @Override // p149l.w9j
    public final Object call(Object obj) {
        return Boolean.valueOf(this.f72500a.contains((Tag) obj));
    }
}
