package com.google.android.exoplayer2.p031ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.InterfaceC2026t;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class PlayerNotificationManager {

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            InterfaceC2026t interfaceC2026tM11935a = PlayerNotificationManager.m11935a(null);
            if (interfaceC2026tM11935a != null && PlayerNotificationManager.m11936b(null) && intent.getIntExtra("INSTANCE_ID", PlayerNotificationManager.m11937c(null)) == PlayerNotificationManager.m11937c(null)) {
                String action = intent.getAction();
                if ("com.google.android.exoplayer.play".equals(action)) {
                    bmk0.m105169t0(interfaceC2026tM11935a);
                    return;
                }
                if ("com.google.android.exoplayer.pause".equals(action)) {
                    bmk0.m105167s0(interfaceC2026tM11935a);
                    return;
                }
                if ("com.google.android.exoplayer.prev".equals(action)) {
                    if (interfaceC2026tM11935a.isCommandAvailable(7)) {
                        interfaceC2026tM11935a.seekToPrevious();
                        return;
                    }
                    return;
                }
                if ("com.google.android.exoplayer.rewind".equals(action)) {
                    if (interfaceC2026tM11935a.isCommandAvailable(11)) {
                        interfaceC2026tM11935a.seekBack();
                        return;
                    }
                    return;
                }
                if ("com.google.android.exoplayer.ffwd".equals(action)) {
                    if (interfaceC2026tM11935a.isCommandAvailable(12)) {
                        interfaceC2026tM11935a.seekForward();
                        return;
                    }
                    return;
                }
                if ("com.google.android.exoplayer.next".equals(action)) {
                    if (interfaceC2026tM11935a.isCommandAvailable(9)) {
                        interfaceC2026tM11935a.seekToNext();
                    }
                } else {
                    if ("com.google.android.exoplayer.stop".equals(action)) {
                        if (interfaceC2026tM11935a.isCommandAvailable(3)) {
                            interfaceC2026tM11935a.stop();
                        }
                        if (interfaceC2026tM11935a.isCommandAvailable(20)) {
                            interfaceC2026tM11935a.clearMediaItems();
                            return;
                        }
                        return;
                    }
                    if ("com.google.android.exoplayer.dismiss".equals(action)) {
                        PlayerNotificationManager.m11938d(null, true);
                    } else if (action != null) {
                        PlayerNotificationManager.m11939e(null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$a */
    public interface InterfaceC2036a {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2026t m11935a(PlayerNotificationManager playerNotificationManager) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m11936b(PlayerNotificationManager playerNotificationManager) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m11937c(PlayerNotificationManager playerNotificationManager) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11938d(PlayerNotificationManager playerNotificationManager, boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC2036a m11939e(PlayerNotificationManager playerNotificationManager) {
        throw null;
    }
}
