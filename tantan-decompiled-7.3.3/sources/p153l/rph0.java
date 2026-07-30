package p153l;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 23)
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class rph0 {

    /* JADX INFO: renamed from: d */
    public static final String f164367d = qzv.m178831i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    public final ComponentName f164368a;

    /* JADX INFO: renamed from: b */
    public final sa5 f164369b;

    /* JADX INFO: renamed from: c */
    public final boolean f164370c;

    /* JADX INFO: renamed from: l.rph0$a */
    public static /* synthetic */ class C19893a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f164371a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f164371a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f164371a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f164371a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f164371a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f164371a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public rph0(@NonNull Context context, sa5 sa5Var, boolean z) {
        this.f164369b = sa5Var;
        this.f164368a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f164370c = z;
    }

    @RequiresApi(24)
    /* JADX INFO: renamed from: b */
    public static JobInfo.TriggerContentUri m182529b(l06.C18326c c18326c) {
        return new JobInfo.TriggerContentUri(c18326c.getUri(), c18326c.getIsTriggeredForDescendants() ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m182530c(NetworkType networkType) {
        int i = C19893a.f164371a[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        qzv.m178829e().mo178832a(f164367d, "API version too low. Cannot convert network type value " + networkType);
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static void m182531d(@NonNull JobInfo.Builder builder, @NonNull NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m182530c(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* JADX INFO: renamed from: a */
    public JobInfo m182532a(mjq0 mjq0Var, int i) {
        String traceTag;
        l06 l06Var = mjq0Var.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", mjq0Var.id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", mjq0Var.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", mjq0Var.m158609m());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f164368a).setRequiresCharging(l06Var.getRequiresCharging()).setRequiresDeviceIdle(l06Var.getRequiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest networkRequestM152310d = l06Var.m152310d();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28 || networkRequestM152310d == null) {
            m182531d(extras, l06Var.getRequiredNetworkType());
        } else {
            sph0.m187343a(extras, networkRequestM152310d);
        }
        if (!l06Var.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(mjq0Var.backoffDelayDuration, mjq0Var.backoffPolicy == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(mjq0Var.m158599b() - this.f164369b.currentTimeMillis(), 0L);
        if (i2 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!mjq0Var.expedited && this.f164370c) {
            extras.setImportantWhileForeground(true);
        }
        if (l06Var.m152313g()) {
            Iterator<l06.C18326c> it = l06Var.m152309c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m182529b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(l06Var.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(l06Var.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            extras.setRequiresBatteryNotLow(l06Var.getRequiresBatteryNotLow());
            extras.setRequiresStorageNotLow(l06Var.getRequiresStorageNotLow());
        }
        boolean z = mjq0Var.runAttemptCount > 0;
        boolean z2 = jMax > 0;
        if (i3 >= 31 && mjq0Var.expedited && !z && !z2) {
            extras.setExpedited(true);
        }
        if (i3 >= 35 && (traceTag = mjq0Var.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }
}
