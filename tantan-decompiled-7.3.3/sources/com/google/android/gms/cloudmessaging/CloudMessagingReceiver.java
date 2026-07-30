package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.Constants;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.k1v0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    @Nullable
    private static SoftReference zza;

    @Nullable
    private static SoftReference zzb;

    @WorkerThread
    private final int zzb(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            onNotificationDismissed(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @NonNull
    public Executor getBroadcastExecutor() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = zza;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    k1v0.m147926a();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new NamedThreadFactory("firebase-iid-executor")));
                    zza = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    @WorkerThread
    public abstract int onMessageReceive(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    @WorkerThread
    public void onNotificationDismissed(@NonNull Context context, @NonNull Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        getBroadcastExecutor().execute(new Runnable() { // from class: l.uix0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179157a.zza(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }

    public final /* synthetic */ void zza(Intent intent, final Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iZzb;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iZzb = zzb(context, intent2);
            } else if (intent.getExtras() == null) {
                iZzb = 500;
            } else {
                final CloudMessage cloudMessage = new CloudMessage(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (CloudMessagingReceiver.class) {
                    try {
                        SoftReference softReference = zzb;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            k1v0.m147926a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            zzb = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: l.krw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskM123538c;
                        CloudMessage cloudMessage2 = cloudMessage;
                        if (TextUtils.isEmpty(cloudMessage2.getMessageId())) {
                            taskM123538c = toi0.m192068f(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString(Constants.MessagePayloadKeys.MSGID, cloudMessage2.getMessageId());
                            Integer numM12503H = cloudMessage2.m12503H();
                            if (numM12503H != null) {
                                bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, numM12503H.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            taskM123538c = f0z0.m123536b(context2).m123538c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        taskM123538c.mo15417b(new Executor() { // from class: l.g1v0
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new OnCompleteListener() { // from class: l.tyv0
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iOnMessageReceive = onMessageReceive(context, cloudMessage);
                try {
                    countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    "Message ack failed: ".concat(e.toString());
                }
                iZzb = iOnMessageReceive;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(iZzb);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th2) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th2;
        }
    }
}
