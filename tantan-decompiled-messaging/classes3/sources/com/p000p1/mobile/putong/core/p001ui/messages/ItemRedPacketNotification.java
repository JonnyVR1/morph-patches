package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageRedPacketNotificationStatus;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.y4c0;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemRedPacketNotification extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f1351a;

    public ItemRedPacketNotification(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m1729a(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = (MessageRedPacketNotificationStatus) MessageRedPacketNotificationStatus.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.a(messageRedPacketNotificationStatus) && NullChecker.a(CoreModule.H().userId())) {
                this.f1351a.setText(messageRedPacketNotificationStatus.msg);
            }
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1351a = (VText) findViewById(y4c0.x4);
    }

    public ItemRedPacketNotification(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRedPacketNotification(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
