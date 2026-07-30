package p149l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d60 extends b60<String, Boolean> {
    @Override // p149l.b60
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo2617a(@NonNull Context context, @NonNull String str) {
        return c60.m105358e(new String[]{str});
    }

    @Override // p149l.b60
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b60.C15813a<Boolean> mo100346b(@NonNull Context context, @Nullable String str) {
        if (str == null) {
            return new b60.C15813a<>(Boolean.FALSE);
        }
        if (e16.m114373a(context, str) == 0) {
            return new b60.C15813a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // p149l.b60
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean mo2618c(int i, @Nullable Intent intent) {
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
