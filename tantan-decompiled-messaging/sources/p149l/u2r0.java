package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public final class u2r0 implements n16 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Collection f173513a;

    public u2r0(Collection collection) {
        this.f173513a = collection;
    }

    @Override // p149l.n16
    public final /* bridge */ /* synthetic */ Object then(@NonNull Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f173513a);
        return tfi0.m188734f(arrayList);
    }
}
