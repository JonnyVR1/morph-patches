package p149l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vly0 implements cly0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final List f182051a;

    public vly0(Context context, uly0 uly0Var) {
        ArrayList arrayList = new ArrayList();
        this.f182051a = arrayList;
        if (uly0Var.mo194287c()) {
            arrayList.add(new qmy0(context, uly0Var));
        }
    }
}
