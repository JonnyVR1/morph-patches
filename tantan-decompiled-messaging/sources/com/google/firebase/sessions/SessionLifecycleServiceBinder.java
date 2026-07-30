package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m87232d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "", "bindToService", "", "callback", "Landroid/os/Messenger;", "serviceConnection", "Landroid/content/ServiceConnection;", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface SessionLifecycleServiceBinder {
    void bindToService(@NotNull Messenger callback, @NotNull ServiceConnection serviceConnection);
}
