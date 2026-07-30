package p149l;

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
public class khh0 {

    /* JADX INFO: renamed from: d */
    public static final String f123149d = txv.m190978i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    public final ComponentName f123150a;

    /* JADX INFO: renamed from: b */
    public final r95 f123151b;

    /* JADX INFO: renamed from: c */
    public final boolean f123152c;

    /* JADX INFO: renamed from: l.khh0$a */
    public static /* synthetic */ class C18012a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f123153a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f123153a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123153a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123153a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f123153a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f123153a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public khh0(@NonNull Context context, r95 r95Var, boolean z) {
        this.f123151b = r95Var;
        this.f123150a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f123152c = z;
    }

    @RequiresApi(24)
    /* JADX INFO: renamed from: b */
    public static JobInfo.TriggerContentUri m145957b(gz5.C17207c c17207c) {
        return new JobInfo.TriggerContentUri(c17207c.getUri(), c17207c.getIsTriggeredForDescendants() ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m145958c(NetworkType networkType) {
        int i = C18012a.f123153a[networkType.ordinal()];
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
        txv.m190976e().mo190979a(f123149d, "API version too low. Cannot convert network type value " + networkType);
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static void m145959d(@NonNull JobInfo.Builder builder, @NonNull NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m145958c(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* JADX INFO: renamed from: a */
    public JobInfo m145960a(haq0 haq0Var, int i) {
        String traceTag;
        gz5 gz5Var = haq0Var.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", haq0Var.id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", haq0Var.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", haq0Var.m130167m());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f123150a).setRequiresCharging(gz5Var.getRequiresCharging()).setRequiresDeviceIdle(gz5Var.getRequiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest networkRequestM128823d = gz5Var.m128823d();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28 || networkRequestM128823d == null) {
            m145959d(extras, gz5Var.getRequiredNetworkType());
        } else {
            lhh0.m149842a(extras, networkRequestM128823d);
        }
        if (!gz5Var.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(haq0Var.backoffDelayDuration, haq0Var.backoffPolicy == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(haq0Var.m130157b() - this.f123151b.currentTimeMillis(), 0L);
        if (i2 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!haq0Var.expedited && this.f123152c) {
            extras.setImportantWhileForeground(true);
        }
        if (gz5Var.m128826g()) {
            Iterator<gz5.C17207c> it = gz5Var.m128822c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m145957b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(gz5Var.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(gz5Var.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            extras.setRequiresBatteryNotLow(gz5Var.getRequiresBatteryNotLow());
            extras.setRequiresStorageNotLow(gz5Var.getRequiresStorageNotLow());
        }
        boolean z = haq0Var.runAttemptCount > 0;
        boolean z2 = jMax > 0;
        if (i3 >= 31 && haq0Var.expedited && !z && !z2) {
            extras.setExpedited(true);
        }
        if (i3 >= 35 && (traceTag = haq0Var.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }
}
