package com.p000p1.mobile.putong.core.p001ui.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.jo0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.rqc0;
import p002l.r07;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SysnotifListener extends BroadcastReceiver {
    public static final String ACTION_DISMISS = "dismiss";
    public static final String ACTION_READ = "read";
    public static final String ACTION_REPLY = "reply";
    public static final String KEY_GROUP_TYPE = "push_group_msg";
    public static final String KEY_NOTIFICATION_ID = "n_id";
    public static final String KEY_USER_ID = "user_id";

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m551b(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        messageNew_.messageType = MessageType.get("text");
        CoreModule.c.f0.Dn(str2, messageNew_, (Sticker) null);
        CoreModule.c.f0.Bo(str2);
    }

    private void dealIntent(Intent intent) {
        if (ACTION_DISMISS.equals(intent.getAction())) {
            int intExtra = intent.getIntExtra(KEY_NOTIFICATION_ID, -1);
            boolean booleanExtra = intent.getBooleanExtra(KEY_GROUP_TYPE, false);
            if (intExtra != -1) {
                CoreModule.m.m14015m(intExtra, booleanExtra);
                return;
            }
            return;
        }
        if (!ACTION_REPLY.equals(intent.getAction())) {
            if (ACTION_READ.equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (NullChecker.a(extras)) {
                    final String string = extras.getString(KEY_USER_ID);
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    if (extras.getBoolean(KEY_GROUP_TYPE, false)) {
                        CoreModule.m.m14015m(intent.getIntExtra(KEY_NOTIFICATION_ID, -1), true);
                    } else {
                        CoreModule.m.m14014l(r07.m21682r(string));
                    }
                    e51.M(new Runnable() { // from class: l.ogh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.c.f0.Bo(string);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundleK = rqc0.k(intent);
        Bundle extras2 = intent.getExtras();
        if (NullChecker.a(bundleK) && NullChecker.a(extras2)) {
            final String string2 = bundleK.getString(ACTION_REPLY);
            final String string3 = extras2.getString(KEY_USER_ID);
            if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return;
            }
            if (extras2.getBoolean(KEY_GROUP_TYPE, false)) {
                CoreModule.m.m14015m(intent.getIntExtra(KEY_NOTIFICATION_ID, -1), true);
            } else {
                CoreModule.m.m14014l(r07.m21682r(string3));
            }
            Conversation conversationXe = CoreModule.c.f0.Xe(string3);
            if (!NullChecker.a(conversationXe) || !conversationXe.isFakeOneSideConv() || conversationXe.mm > 0 || CoreModule.c.e0.na().isSVIP()) {
                e51.M(new Runnable() { // from class: l.ngh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SysnotifListener.m551b(string2, string3);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceive$0(Intent intent, roj0 roj0Var) {
        dealIntent(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        qib0.j0.b.take(1).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.pgh0
            public final void call(Object obj) {
                this.f17313a.lambda$onReceive$0(intent, (roj0) obj);
            }
        }));
    }
}
