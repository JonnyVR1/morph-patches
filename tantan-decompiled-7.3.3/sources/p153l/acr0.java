package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public final class acr0 implements s26 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Collection f69754a;

    public acr0(Collection collection) {
        this.f69754a = collection;
    }

    @Override // p153l.s26
    public final /* bridge */ /* synthetic */ Object then(@NonNull Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f69754a);
        return toi0.m192068f(arrayList);
    }
}
