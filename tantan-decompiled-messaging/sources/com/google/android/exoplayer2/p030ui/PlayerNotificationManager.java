package com.google.android.exoplayer2.p030ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.InterfaceC2003t;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class PlayerNotificationManager {

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            InterfaceC2003t interfaceC2003tM11881a = PlayerNotificationManager.m11881a(null);
            if (interfaceC2003tM11881a != null && PlayerNotificationManager.m11882b(null) && intent.getIntExtra("INSTANCE_ID", PlayerNotificationManager.m11883c(null)) == PlayerNotificationManager.m11883c(null)) {
                String action = intent.getAction();
                if ("com.google.android.exoplayer.play".equals(action)) {
                    vck0.m197891t0(interfaceC2003tM11881a);
                    return;
                }
                if ("com.google.android.exoplayer.pause".equals(action)) {
                    vck0.m197889s0(interfaceC2003tM11881a);
                    return;
                }
                if ("com.google.android.exoplayer.prev".equals(action)) {
                    if (interfaceC2003tM11881a.isCommandAvailable(7)) {
                        interfaceC2003tM11881a.seekToPrevious();
                        return;
                    }
                    return;
                }
                if ("com.google.android.exoplayer.rewind".equals(action)) {
                    if (interfaceC2003tM11881a.isCommandAvailable(11)) {
                        interfaceC2003tM11881a.seekBack();
                        return;
                    }
                    return;
                }
                if ("com.google.android.exoplayer.ffwd".equals(action)) {
                    if (interfaceC2003tM11881a.isCommandAvailable(12)) {
                        interfaceC2003tM11881a.seekForward();
                        return;
                    }
                    return;
                }
                if ("com.google.android.exoplayer.next".equals(action)) {
                    if (interfaceC2003tM11881a.isCommandAvailable(9)) {
                        interfaceC2003tM11881a.seekToNext();
                    }
                } else {
                    if ("com.google.android.exoplayer.stop".equals(action)) {
                        if (interfaceC2003tM11881a.isCommandAvailable(3)) {
                            interfaceC2003tM11881a.stop();
                        }
                        if (interfaceC2003tM11881a.isCommandAvailable(20)) {
                            interfaceC2003tM11881a.clearMediaItems();
                            return;
                        }
                        return;
                    }
                    if ("com.google.android.exoplayer.dismiss".equals(action)) {
                        PlayerNotificationManager.m11884d(null, true);
                    } else if (action != null) {
                        PlayerNotificationManager.m11885e(null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$a */
    public interface InterfaceC2013a {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2003t m11881a(PlayerNotificationManager playerNotificationManager) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m11882b(PlayerNotificationManager playerNotificationManager) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m11883c(PlayerNotificationManager playerNotificationManager) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11884d(PlayerNotificationManager playerNotificationManager, boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC2013a m11885e(PlayerNotificationManager playerNotificationManager) {
        throw null;
    }
}
