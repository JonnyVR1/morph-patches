package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageRedPacketNotificationStatus;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p147v.VText;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRedPacketNotification extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f31460a;

    public ItemRedPacketNotification(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m48645a(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = MessageRedPacketNotificationStatus.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.m81303a(messageRedPacketNotificationStatus) && NullChecker.m81303a(CoreModule.m29931H().userId())) {
                this.f31460a.setText(messageRedPacketNotificationStatus.msg);
            }
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31460a = (VText) findViewById(y4c0.f196253x4);
    }

    public ItemRedPacketNotification(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRedPacketNotification(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
