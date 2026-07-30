package com.meituan.robust;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PatchManipulate {
    public abstract boolean ensurePatchExist(Patch patch);

    public abstract List<Patch> fetchPatchList(Context context);

    public abstract boolean verifyPatch(Context context, Patch patch);
}
