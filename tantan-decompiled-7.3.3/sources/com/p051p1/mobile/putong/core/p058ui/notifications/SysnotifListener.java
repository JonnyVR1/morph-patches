package com.p051p1.mobile.putong.core.p058ui.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.tantanapp.common.utils.NullChecker;
import p153l.fo0;
import p153l.l51;
import p153l.psd0;
import p153l.u17;
import p153l.uqb0;
import p153l.uxj0;
import p153l.wyc0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class SysnotifListener extends BroadcastReceiver {
    public static final String ACTION_DISMISS = "dismiss";
    public static final String ACTION_READ = "read";
    public static final String ACTION_REPLY = "reply";
    public static final String KEY_GROUP_TYPE = "push_group_msg";
    public static final String KEY_NOTIFICATION_ID = "n_id";
    public static final String KEY_USER_ID = "user_id";

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m51303b(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        messageNew_.messageType = MessageType.get("text");
        CoreModule.f18264c.f20384f0.m33626Dn(str2, messageNew_, null);
        CoreModule.f18264c.f20384f0.m33601Bo(str2);
    }

    private void dealIntent(Intent intent) {
        if (ACTION_DISMISS.equals(intent.getAction())) {
            int intExtra = intent.getIntExtra(KEY_NOTIFICATION_ID, -1);
            boolean booleanExtra = intent.getBooleanExtra(KEY_GROUP_TYPE, false);
            if (intExtra != -1) {
                CoreModule.f18274m.m207539m(intExtra, booleanExtra);
                return;
            }
            return;
        }
        if (!ACTION_REPLY.equals(intent.getAction())) {
            if ("read".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (NullChecker.m82486a(extras)) {
                    final String string = extras.getString("user_id");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    if (extras.getBoolean(KEY_GROUP_TYPE, false)) {
                        CoreModule.f18274m.m207539m(intent.getIntExtra(KEY_NOTIFICATION_ID, -1), true);
                    } else {
                        CoreModule.f18274m.m207538l(u17.m193922r(string));
                    }
                    l51.m152893M(new Runnable() { // from class: l.voh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.f18264c.f20384f0.m33601Bo(string);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundleM208586k = wyc0.m208586k(intent);
        Bundle extras2 = intent.getExtras();
        if (NullChecker.m82486a(bundleM208586k) && NullChecker.m82486a(extras2)) {
            final String string2 = bundleM208586k.getString(ACTION_REPLY);
            final String string3 = extras2.getString("user_id");
            if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return;
            }
            if (extras2.getBoolean(KEY_GROUP_TYPE, false)) {
                CoreModule.f18274m.m207539m(intent.getIntExtra(KEY_NOTIFICATION_ID, -1), true);
            } else {
                CoreModule.f18274m.m207538l(u17.m193922r(string3));
            }
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(string3);
            if (!NullChecker.m82486a(conversationM33859Xe) || !conversationM33859Xe.isFakeOneSideConv() || conversationM33859Xe.f21116mm > 0 || CoreModule.f18264c.f20381e0.m116593na().isSVIP()) {
                l51.m152893M(new Runnable() { // from class: l.uoh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SysnotifListener.m51303b(string2, string3);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceive$0(Intent intent, uxj0 uxj0Var) {
        dealIntent(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        uqb0.f180404j0.f88244b.take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.woh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190043a.lambda$onReceive$0(intent, (uxj0) obj);
            }
        }));
    }
}
