package p153l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class z50 extends x50<String, Boolean> {
    @Override // p153l.x50
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo2618a(@NonNull Context context, @NonNull String str) {
        return y50.m214282e(new String[]{str});
    }

    @Override // p153l.x50
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public x50.C21254a<Boolean> mo209354b(@NonNull Context context, @Nullable String str) {
        if (str == null) {
            return new x50.C21254a<>(Boolean.FALSE);
        }
        if (j26.m143188a(context, str) == 0) {
            return new x50.C21254a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // p153l.x50
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean mo2619c(int i, @Nullable Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || intArrayExtra.length == 0) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(intArrayExtra[0] == 0);
    }
}
