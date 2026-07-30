package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.HashMap;
import p153l.dpq0;
import p153l.epq;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    final ArrayList<C0238d> mCompatQueue;
    AbstractC0242h mCompatWorkEnqueuer;
    AsyncTaskC0235a mCurProcessor;
    InterfaceC0236b mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, AbstractC0242h> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;

    /* JADX INFO: renamed from: androidx.core.app.JobIntentService$a */
    public final class AsyncTaskC0235a extends AsyncTask<Void, Void, Void> {
        public AsyncTaskC0235a() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC0239e interfaceC0239eDequeueWork = JobIntentService.this.dequeueWork();
                if (interfaceC0239eDequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(interfaceC0239eDequeueWork.getIntent());
                interfaceC0239eDequeueWork.complete();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            JobIntentService.this.processorFinished();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            JobIntentService.this.processorFinished();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.JobIntentService$b */
    public interface InterfaceC0236b {
        /* JADX INFO: renamed from: a */
        IBinder mo1203a();

        /* JADX INFO: renamed from: b */
        InterfaceC0239e mo1204b();
    }

    /* JADX INFO: renamed from: androidx.core.app.JobIntentService$c */
    public static final class C0237c extends AbstractC0242h {

        /* JADX INFO: renamed from: d */
        public final Context f1401d;

        /* JADX INFO: renamed from: e */
        public final PowerManager.WakeLock f1402e;

        /* JADX INFO: renamed from: f */
        public final PowerManager.WakeLock f1403f;

        /* JADX INFO: renamed from: g */
        public boolean f1404g;

        /* JADX INFO: renamed from: h */
        public boolean f1405h;

        public C0237c(Context context, ComponentName componentName) {
            super(componentName);
            this.f1401d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f1402e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f1403f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0242h
        /* JADX INFO: renamed from: a */
        public void mo1205a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f1416a);
            if (this.f1401d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f1404g) {
                            this.f1404g = true;
                            if (!this.f1405h) {
                                this.f1402e.acquire(Constants.ONE_MIN_IN_MILLIS);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0242h
        /* JADX INFO: renamed from: c */
        public void mo1206c() {
            synchronized (this) {
                try {
                    if (this.f1405h) {
                        if (this.f1404g) {
                            this.f1402e.acquire(Constants.ONE_MIN_IN_MILLIS);
                        }
                        this.f1405h = false;
                        this.f1403f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0242h
        /* JADX INFO: renamed from: d */
        public void mo1207d() {
            synchronized (this) {
                try {
                    if (!this.f1405h) {
                        this.f1405h = true;
                        this.f1403f.acquire(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                        this.f1402e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0242h
        /* JADX INFO: renamed from: e */
        public void mo1208e() {
            synchronized (this) {
                this.f1404g = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.JobIntentService$d */
    public final class C0238d implements InterfaceC0239e {

        /* JADX INFO: renamed from: a */
        public final Intent f1406a;

        /* JADX INFO: renamed from: b */
        public final int f1407b;

        public C0238d(Intent intent, int i) {
            this.f1406a = intent;
            this.f1407b = i;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0239e
        public void complete() {
            JobIntentService.this.stopSelf(this.f1407b);
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0239e
        public Intent getIntent() {
            return this.f1406a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.JobIntentService$e */
    public interface InterfaceC0239e {
        void complete();

        Intent getIntent();
    }

    /* JADX INFO: renamed from: androidx.core.app.JobIntentService$f */
    @RequiresApi(26)
    public static final class JobServiceEngineC0240f extends JobServiceEngine implements InterfaceC0236b {

        /* JADX INFO: renamed from: a */
        public final JobIntentService f1409a;

        /* JADX INFO: renamed from: b */
        public final Object f1410b;

        /* JADX INFO: renamed from: c */
        public JobParameters f1411c;

        /* JADX INFO: renamed from: androidx.core.app.JobIntentService$f$a */
        public final class a implements InterfaceC0239e {

            /* JADX INFO: renamed from: a */
            public final JobWorkItem f1412a;

            public a(JobWorkItem jobWorkItem) {
                this.f1412a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC0239e
            public void complete() {
                synchronized (JobServiceEngineC0240f.this.f1410b) {
                    try {
                        JobParameters jobParameters = JobServiceEngineC0240f.this.f1411c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f1412a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC0239e
            public Intent getIntent() {
                return this.f1412a.getIntent();
            }
        }

        public JobServiceEngineC0240f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f1410b = new Object();
            this.f1409a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0236b
        /* JADX INFO: renamed from: a */
        public IBinder mo1203a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0236b
        /* JADX INFO: renamed from: b */
        public InterfaceC0239e mo1204b() {
            synchronized (this.f1410b) {
                try {
                    JobParameters jobParameters = this.f1411c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f1409a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f1411c = jobParameters;
            this.f1409a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zDoStopCurrentWork = this.f1409a.doStopCurrentWork();
            synchronized (this.f1410b) {
                this.f1411c = null;
            }
            return zDoStopCurrentWork;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.JobIntentService$g */
    @RequiresApi(26)
    public static final class C0241g extends AbstractC0242h {

        /* JADX INFO: renamed from: d */
        public final JobInfo f1414d;

        /* JADX INFO: renamed from: e */
        public final JobScheduler f1415e;

        public C0241g(Context context, ComponentName componentName, int i) {
            super(componentName);
            m1209b(i);
            this.f1414d = new JobInfo.Builder(i, this.f1416a).setOverrideDeadline(0L).build();
            this.f1415e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0242h
        /* JADX INFO: renamed from: a */
        public void mo1205a(Intent intent) {
            this.f1415e.enqueue(this.f1414d, epq.m121869a(intent));
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.JobIntentService$h */
    public static abstract class AbstractC0242h {

        /* JADX INFO: renamed from: a */
        public final ComponentName f1416a;

        /* JADX INFO: renamed from: b */
        public boolean f1417b;

        /* JADX INFO: renamed from: c */
        public int f1418c;

        public AbstractC0242h(ComponentName componentName) {
            this.f1416a = componentName;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo1205a(Intent intent);

        /* JADX INFO: renamed from: b */
        public void m1209b(int i) {
            if (!this.f1417b) {
                this.f1417b = true;
                this.f1418c = i;
            } else {
                if (this.f1418c == i) {
                    return;
                }
                dpq0.m117417a("Given job ID ", i, " is different than previous ", this.f1418c);
            }
        }

        /* JADX INFO: renamed from: c */
        public void mo1206c() {
        }

        /* JADX INFO: renamed from: d */
        public void mo1207d() {
        }

        /* JADX INFO: renamed from: e */
        public void mo1208e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public static void enqueueWork(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent) {
        if (intent == null) {
            wg3.m206174a("work must not be null");
            return;
        }
        synchronized (sLock) {
            AbstractC0242h workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.m1209b(i);
            workEnqueuer.mo1205a(intent);
        }
    }

    public static AbstractC0242h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC0242h c0237c;
        HashMap<ComponentName, AbstractC0242h> map = sClassWorkEnqueuer;
        AbstractC0242h abstractC0242h = map.get(componentName);
        if (abstractC0242h != null) {
            return abstractC0242h;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c0237c = new C0237c(context, componentName);
        } else {
            if (!z) {
                wg3.m206174a("Can't be here without a job id");
                return null;
            }
            c0237c = new C0241g(context, componentName, i);
        }
        map.put(componentName, c0237c);
        return c0237c;
    }

    public InterfaceC0239e dequeueWork() {
        InterfaceC0236b interfaceC0236b = this.mJobImpl;
        if (interfaceC0236b != null) {
            return interfaceC0236b.mo1204b();
        }
        synchronized (this.mCompatQueue) {
            try {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean doStopCurrentWork() {
        AsyncTaskC0235a asyncTaskC0235a = this.mCurProcessor;
        if (asyncTaskC0235a != null) {
            asyncTaskC0235a.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new AsyncTaskC0235a();
            AbstractC0242h abstractC0242h = this.mCompatWorkEnqueuer;
            if (abstractC0242h != null && z) {
                abstractC0242h.mo1207d();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        InterfaceC0236b interfaceC0236b = this.mJobImpl;
        if (interfaceC0236b != null) {
            return interfaceC0236b.mo1203a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new JobServiceEngineC0240f(this);
            this.mCompatWorkEnqueuer = null;
        } else {
            this.mJobImpl = null;
            this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0238d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.mo1206c();
            }
        }
    }

    public abstract void onHandleWork(@NonNull Intent intent);

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo1208e();
        synchronized (this.mCompatQueue) {
            ArrayList<C0238d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0238d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<C0238d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<C0238d> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.mo1206c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Class<?> cls, int i, @NonNull Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }
}
