package com.clevertap.android.sdk.pushnotification.amp;

import android.content.Context;
import androidx.work.AbstractC0762b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;
import com.heytap.mcssdk.mode.CommandMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Lcom/clevertap/android/sdk/pushnotification/amp/CTPushAmpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", CommandMessage.PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/b$a;", "doWork", "()Landroidx/work/b$a;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class CTPushAmpWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTPushAmpWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    @NotNull
    public AbstractC0762b.a doWork() {
        Logger.m5873v("PushAmpWorker is awake");
        CleverTapAPI.m5785t0(getApplicationContext());
        AbstractC0762b.a aVarM4415c = AbstractC0762b.a.m4415c();
        aVarM4415c.getClass();
        return aVarM4415c;
    }
}
