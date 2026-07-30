package com.clevertap.android.sdk.pushnotification.work;

import android.content.Context;
import androidx.work.AbstractC0762b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.lw3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Lcom/clevertap/android/sdk/pushnotification/work/CTFlushPushImpressionsWork;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "b", "()Z", "Landroidx/work/b$a;", "doWork", "()Landroidx/work/b$a;", "", "e", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CTFlushPushImpressionsWork extends Worker {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTFlushPushImpressionsWork(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.tag = "CTFlushPushImpressionsWork";
    }

    /* JADX INFO: renamed from: b */
    private final boolean m6937b() {
        if (isStopped()) {
            Logger.m5866d(this.tag, "someone told me to stop flushing and go to sleep again! going to sleep now.ˁ(-.-)ˀzzZZ");
        }
        return isStopped();
    }

    @Override // androidx.work.Worker
    @NotNull
    public AbstractC0762b.a doWork() {
        Logger.m5866d(this.tag, "hello, this is FlushPushImpressionsWork from CleverTap. I am awake now and ready to flush push impressions:-)");
        Logger.m5866d(this.tag, "initiating push impressions flush...");
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ArrayList<CleverTapAPI> arrayListM5748D = CleverTapAPI.m5748D(applicationContext);
        arrayListM5748D.getClass();
        List listFilterNotNull = CollectionsKt.filterNotNull(arrayListM5748D);
        ArrayList<CleverTapAPI> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (!((CleverTapAPI) obj).m5793H().getConfig().isAnalyticsOnly()) {
                arrayList.add(obj);
            }
        }
        for (CleverTapAPI cleverTapAPI : arrayList) {
            if (m6937b()) {
                AbstractC0762b.a aVarM4415c = AbstractC0762b.a.m4415c();
                aVarM4415c.getClass();
                return aVarM4415c;
            }
            Logger.m5866d(this.tag, "flushing queue for push impressions on CT instance = " + cleverTapAPI.m5790B());
            lw3.m151941k(cleverTapAPI, this.tag, Constants.D_SRC_PI_WM, applicationContext);
        }
        Logger.m5866d(this.tag, "flush push impressions work is DONE! going to sleep now...ˁ(-.-)ˀzzZZ");
        AbstractC0762b.a aVarM4415c2 = AbstractC0762b.a.m4415c();
        aVarM4415c2.getClass();
        return aVarM4415c2;
    }
}
