package p149l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c60 extends b60<String[], Map<String, Boolean>> {
    @NonNull
    /* JADX INFO: renamed from: e */
    public static Intent m105358e(@NonNull String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // p149l.b60
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo2617a(@NonNull Context context, @NonNull String[] strArr) {
        return m105358e(strArr);
    }

    @Override // p149l.b60
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b60.C15813a<Map<String, Boolean>> mo100346b(@NonNull Context context, @Nullable String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new b60.C15813a<>(Collections.EMPTY_MAP);
        }
        e01 e01Var = new e01();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = e16.m114373a(context, str) == 0;
            e01Var.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new b60.C15813a<>(e01Var);
        }
        return null;
    }

    @Override // p149l.b60
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> mo2618c(int i, @Nullable Intent intent) {
        if (i != -1) {
            return Collections.EMPTY_MAP;
        }
        if (intent == null) {
            return Collections.EMPTY_MAP;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            map.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return map;
    }
}
