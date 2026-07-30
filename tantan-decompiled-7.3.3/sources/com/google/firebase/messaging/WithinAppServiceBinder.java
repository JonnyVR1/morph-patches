package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p153l.pox;

/* JADX INFO: loaded from: classes7.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(final WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable(Constants.TAG, 3);
        this.intentHandler.handle(bindRequest.intent).mo15417b(new pox(), new OnCompleteListener() { // from class: com.google.firebase.messaging.o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                bindRequest.finish();
            }
        });
    }
}
