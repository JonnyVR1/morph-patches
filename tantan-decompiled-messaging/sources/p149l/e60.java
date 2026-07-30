package p149l;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class e60 extends b60<Intent, ActivityResult> {
    @Override // p149l.b60
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo2618c(int i, @Nullable Intent intent) {
        return new ActivityResult(i, intent);
    }

    @Override // p149l.b60
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo2617a(@NonNull Context context, @NonNull Intent intent) {
        return intent;
    }
}
