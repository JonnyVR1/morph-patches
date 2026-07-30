package com.p046p1.mobile.putong.core.p053ui.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.e51;
import p149l.jo0;
import p149l.mkd0;
import p149l.qib0;
import p149l.r07;
import p149l.roj0;
import p149l.rqc0;

/* JADX INFO: loaded from: classes4.dex */
public class SysnotifListener extends BroadcastReceiver {
    public static final String ACTION_DISMISS = "dismiss";
    public static final String ACTION_READ = "read";
    public static final String ACTION_REPLY = "reply";
    public static final String KEY_GROUP_TYPE = "push_group_msg";
    public static final String KEY_NOTIFICATION_ID = "n_id";
    public static final String KEY_USER_ID = "user_id";

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m50120b(String str, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        messageNew_.messageType = MessageType.get("text");
        CoreModule.f17545c.f19642f0.m32623Dn(str2, messageNew_, null);
        CoreModule.f17545c.f19642f0.m32598Bo(str2);
    }

    private void dealIntent(Intent intent) {
        if (ACTION_DISMISS.equals(intent.getAction())) {
            int intExtra = intent.getIntExtra(KEY_NOTIFICATION_ID, -1);
            boolean booleanExtra = intent.getBooleanExtra(KEY_GROUP_TYPE, false);
            if (intExtra != -1) {
                CoreModule.f17555m.m127658m(intExtra, booleanExtra);
                return;
            }
            return;
        }
        if (!ACTION_REPLY.equals(intent.getAction())) {
            if ("read".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (NullChecker.m81303a(extras)) {
                    final String string = extras.getString("user_id");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    if (extras.getBoolean(KEY_GROUP_TYPE, false)) {
                        CoreModule.f17555m.m127658m(intent.getIntExtra(KEY_NOTIFICATION_ID, -1), true);
                    } else {
                        CoreModule.f17555m.m127657l(r07.m177353r(string));
                    }
                    e51.m114748M(new Runnable() { // from class: l.ogh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.f17545c.f19642f0.m32598Bo(string);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundleM180414k = rqc0.m180414k(intent);
        Bundle extras2 = intent.getExtras();
        if (NullChecker.m81303a(bundleM180414k) && NullChecker.m81303a(extras2)) {
            final String string2 = bundleM180414k.getString(ACTION_REPLY);
            final String string3 = extras2.getString("user_id");
            if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return;
            }
            if (extras2.getBoolean(KEY_GROUP_TYPE, false)) {
                CoreModule.f17555m.m127658m(intent.getIntExtra(KEY_NOTIFICATION_ID, -1), true);
            } else {
                CoreModule.f17555m.m127657l(r07.m177353r(string3));
            }
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(string3);
            if (!NullChecker.m81303a(conversationM32856Xe) || !conversationM32856Xe.isFakeOneSideConv() || conversationM32856Xe.f20374mm > 0 || CoreModule.f17545c.f19639e0.m169520na().isSVIP()) {
                e51.m114748M(new Runnable() { // from class: l.ngh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SysnotifListener.m50120b(string2, string3);
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
        qib0.f154721j0.f174908b.take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.pgh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148706a.lambda$onReceive$0(intent, (roj0) obj);
            }
        }));
    }
}
