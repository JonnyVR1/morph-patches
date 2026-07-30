package com.p051p1.mobile.backtrace.backtrace;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.backtrace.MatrixLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p153l.jj5;

/* JADX INFO: loaded from: classes8.dex */
public class WarmUpScheduler implements Handler.Callback {
    static final long DELAY_CLEAN_UP = 3000;
    static final long DELAY_CONSUME_REQ_QUT = 3000;
    static final long DELAY_SHORTLY = 3000;
    static final long DELAY_WARM_UP = 3000;
    private static final int MSG_CLEAN_UP = 3;
    private static final int MSG_COMPUTE_DISK_USAGE = 4;
    private static final int MSG_CONSUME_REQ_QUT = 2;
    private static final int MSG_WARM_UP = 1;
    private static final String TAG = "Matrix.WarmUpScheduler";
    private Context mContext;
    private WarmUpDelegate mDelegate;
    private Handler mHandler;
    private IdleReceiver mIdleReceiver;
    private WeChatBacktrace.WarmUpTiming mTiming;
    private long mWarmUpDelay;

    /* JADX INFO: renamed from: com.p1.mobile.backtrace.backtrace.WarmUpScheduler$2 */
    public static /* synthetic */ class C45332 {

        /* JADX INFO: renamed from: $SwitchMap$com$p1$mobile$backtrace$backtrace$WarmUpScheduler$TaskType */
        static final /* synthetic */ int[] f16639xbb790616;

        /* JADX INFO: renamed from: $SwitchMap$com$p1$mobile$backtrace$backtrace$WeChatBacktrace$WarmUpTiming */
        static final /* synthetic */ int[] f16640x466a044;

        static {
            int[] iArr = new int[TaskType.values().length];
            f16639xbb790616 = iArr;
            try {
                iArr[TaskType.WarmUp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16639xbb790616[TaskType.CleanUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16639xbb790616[TaskType.RequestConsuming.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16639xbb790616[TaskType.DiskUsage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[WeChatBacktrace.WarmUpTiming.values().length];
            f16640x466a044 = iArr2;
            try {
                iArr2[WeChatBacktrace.WarmUpTiming.PostStartup.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16640x466a044[WeChatBacktrace.WarmUpTiming.WhileCharging.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16640x466a044[WeChatBacktrace.WarmUpTiming.WhileScreenOff.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class IdleReceiver extends BroadcastReceiver {
        private CancellationSignal mCancellationSignal;
        Context mContext;
        Handler mIdleHandler;
        private Set<TaskType> mTasks = new HashSet();
        private WeChatBacktrace.WarmUpTiming mTiming;
        private long mWarmUpDelay;

        public IdleReceiver(Context context, Handler handler, WeChatBacktrace.WarmUpTiming warmUpTiming, long j) {
            this.mContext = context;
            this.mIdleHandler = handler;
            this.mTiming = warmUpTiming;
            this.mWarmUpDelay = j;
        }

        private synchronized void triggerIdle(boolean z, boolean z2) {
            try {
                MatrixLog.m22185i(WarmUpScheduler.TAG, "Idle status changed: interactive = %s, charging = %s", Boolean.valueOf(z), Boolean.valueOf(z2));
                boolean z3 = !z && (this.mTiming == WeChatBacktrace.WarmUpTiming.WhileScreenOff || !z2);
                if (z3 && this.mCancellationSignal == null) {
                    this.mCancellationSignal = new CancellationSignal();
                    Iterator<TaskType> it = this.mTasks.iterator();
                    while (it.hasNext()) {
                        int i = C45332.f16639xbb790616[it.next().ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                if (WarmUpUtility.needCleanUp(this.mContext)) {
                                    Handler handler = this.mIdleHandler;
                                    handler.sendMessageDelayed(Message.obtain(handler, 3, this.mCancellationSignal), 3000L);
                                } else {
                                    it.remove();
                                }
                                MatrixLog.m22185i(WarmUpScheduler.TAG, "System idle, trigger clean up in %s seconds.", 3L);
                            } else if (i == 3) {
                                Handler handler2 = this.mIdleHandler;
                                handler2.sendMessageDelayed(Message.obtain(handler2, 2, this.mCancellationSignal), this.mWarmUpDelay);
                                MatrixLog.m22185i(WarmUpScheduler.TAG, "System idle, trigger consume requested qut in %s seconds.", Long.valueOf(this.mWarmUpDelay / 1000));
                            } else if (i == 4) {
                                if (WarmUpUtility.shouldComputeDiskUsage(this.mContext)) {
                                    Handler handler3 = this.mIdleHandler;
                                    handler3.sendMessageDelayed(Message.obtain(handler3, 4, this.mCancellationSignal), 3000L);
                                } else {
                                    it.remove();
                                }
                                MatrixLog.m22185i(WarmUpScheduler.TAG, "System idle, trigger disk usage in %s seconds.", 3L);
                            }
                        } else if (WarmUpUtility.hasWarmedUp(this.mContext)) {
                            it.remove();
                        } else {
                            Handler handler4 = this.mIdleHandler;
                            handler4.sendMessageDelayed(Message.obtain(handler4, 1, this.mCancellationSignal), this.mWarmUpDelay);
                            MatrixLog.m22185i(WarmUpScheduler.TAG, "System idle, trigger warm up in %s seconds.", Long.valueOf(this.mWarmUpDelay / 1000));
                        }
                    }
                } else if (!z3 && this.mCancellationSignal != null) {
                    this.mIdleHandler.removeMessages(1);
                    this.mIdleHandler.removeMessages(2);
                    this.mIdleHandler.removeMessages(3);
                    this.mIdleHandler.removeMessages(4);
                    this.mCancellationSignal.cancel();
                    this.mCancellationSignal = null;
                    MatrixLog.m22185i(WarmUpScheduler.TAG, "Exit idle state, task cancelled.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void arrange(TaskType taskType) {
            if (this.mTasks.contains(taskType)) {
                return;
            }
            this.mTasks.add(taskType);
        }

        public synchronized int finish(TaskType taskType) {
            this.mTasks.remove(taskType);
            return this.mTasks.size();
        }

        /* JADX WARN: Code duplicated, block: B:19:0x002f  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            synchronized (this) {
                try {
                    boolean z = true;
                    boolean z2 = false;
                    switch (action.hashCode()) {
                        case -2128145023:
                            str = "android.intent.action.SCREEN_OFF";
                            action.equals(str);
                            z = false;
                            break;
                        case -1886648615:
                            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
                            action.equals(str);
                            z = false;
                            break;
                        case -1454123155:
                            if (!action.equals("android.intent.action.SCREEN_ON")) {
                                z = false;
                            }
                            break;
                        case 1019184907:
                            if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                z = false;
                            } else {
                                z2 = true;
                                z = false;
                            }
                            break;
                        default:
                            z = false;
                            break;
                    }
                    triggerIdle(z, z2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public synchronized void refreshIdleStatus(Context context) {
            int intExtra;
            try {
                boolean zIsInteractive = ((PowerManager) context.getSystemService("power")).isInteractive();
                Intent intentM145018l = jj5.m145018l(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                boolean z = false;
                if (intentM145018l != null && ((intExtra = intentM145018l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) == 2 || intExtra == 5)) {
                    z = true;
                }
                triggerIdle(zIsInteractive, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public enum TaskType {
        WarmUp,
        CleanUp,
        RequestConsuming,
        DiskUsage
    }

    public WarmUpScheduler(WarmUpDelegate warmUpDelegate, Context context, WeChatBacktrace.WarmUpTiming warmUpTiming, long j) {
        this.mWarmUpDelay = 0L;
        this.mDelegate = warmUpDelegate;
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
        this.mContext = context;
        this.mTiming = warmUpTiming;
        this.mWarmUpDelay = Math.max(j, 3000L);
    }

    private void arrangeTaskDirectly(TaskType taskType) {
        int i = C45332.f16639xbb790616[taskType.ordinal()];
        if (i == 1) {
            MatrixLog.m22185i(TAG, "Schedule warm-up in %ss", Long.valueOf(this.mWarmUpDelay / 1000));
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(Message.obtain(handler, 1, new CancellationSignal()), this.mWarmUpDelay);
        } else if (i == 2) {
            MatrixLog.m22185i(TAG, "Schedule clean-up in %ss", Long.valueOf(this.mWarmUpDelay / 1000));
            Handler handler2 = this.mHandler;
            handler2.sendMessageDelayed(Message.obtain(handler2, 3, new CancellationSignal()), this.mWarmUpDelay);
        } else {
            if (i != 3) {
                return;
            }
            MatrixLog.m22185i(TAG, "Schedule request consuming in %ss", Long.valueOf(this.mWarmUpDelay / 1000));
            Handler handler3 = this.mHandler;
            handler3.sendMessageDelayed(Message.obtain(handler3, 2, new CancellationSignal()), this.mWarmUpDelay);
        }
    }

    private synchronized void arrangeTaskToIdleReceiver(Context context, TaskType taskType) {
        IdleReceiver idleReceiver = this.mIdleReceiver;
        if (idleReceiver != null) {
            idleReceiver.arrange(taskType);
            return;
        }
        IdleReceiver idleReceiver2 = new IdleReceiver(context, this.mHandler, this.mTiming, this.mWarmUpDelay);
        this.mIdleReceiver = idleReceiver2;
        idleReceiver2.arrange(taskType);
        MatrixLog.m22185i(TAG, "Register idle receiver.", new Object[0]);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        jj5.m145018l(context, this.mIdleReceiver, intentFilter);
        this.mIdleReceiver.refreshIdleStatus(context);
    }

    private synchronized void finishTaskToIdleReceiver(Context context, TaskType taskType) {
        IdleReceiver idleReceiver = this.mIdleReceiver;
        if (idleReceiver != null && idleReceiver.finish(taskType) == 0) {
            MatrixLog.m22185i(TAG, "Unregister idle receiver.", new Object[0]);
            context.unregisterReceiver(this.mIdleReceiver);
            this.mIdleReceiver = null;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.mDelegate.warmingUp((CancellationSignal) message.obj);
            return false;
        }
        if (i == 2) {
            this.mDelegate.consumingRequestedQut((CancellationSignal) message.obj);
            return false;
        }
        if (i == 3) {
            this.mDelegate.cleaningUp((CancellationSignal) message.obj);
            return false;
        }
        if (i != 4) {
            return false;
        }
        this.mDelegate.computeDiskUsage((CancellationSignal) message.obj);
        return false;
    }

    public void scheduleTask(final TaskType taskType) {
        this.mHandler.post(new Runnable() { // from class: com.p1.mobile.backtrace.backtrace.WarmUpScheduler.1
            @Override // java.lang.Runnable
            public void run() {
                WarmUpScheduler.this.scheduleTaskImpl(taskType);
            }
        });
    }

    public void scheduleTaskImpl(TaskType taskType) {
        int i = C45332.f16640x466a044[this.mTiming.ordinal()];
        if (i == 1) {
            arrangeTaskDirectly(taskType);
        } else if (i == 2 || i == 3) {
            arrangeTaskToIdleReceiver(this.mContext, taskType);
        }
    }

    public void taskFinished(TaskType taskType) {
        int i = C45332.f16640x466a044[this.mTiming.ordinal()];
        if (i == 2 || i == 3) {
            finishTaskToIdleReceiver(this.mContext, taskType);
        }
    }
}
