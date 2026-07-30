package p153l;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class b60 extends x50<IntentSenderRequest, ActivityResult> {
    @Override // p153l.x50
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo2618a(@NonNull Context context, @NonNull IntentSenderRequest intentSenderRequest) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
    }

    @Override // p153l.x50
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo2619c(int i, @Nullable Intent intent) {
        return new ActivityResult(i, intent);
    }
}
