package p153l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bvy0 implements iuy0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final List f78671a;

    public bvy0(Context context, avy0 avy0Var) {
        ArrayList arrayList = new ArrayList();
        this.f78671a = arrayList;
        if (avy0Var.mo100559c()) {
            arrayList.add(new wvy0(context, avy0Var));
        }
    }
}
