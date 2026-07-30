package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageRedPacketNotificationStatus;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p151v.VText;
import p153l.edc0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRedPacketNotification extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f32308a;

    public ItemRedPacketNotification(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m49828a(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            MessageRedPacketNotificationStatus messageRedPacketNotificationStatus = MessageRedPacketNotificationStatus.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.m82486a(messageRedPacketNotificationStatus) && NullChecker.m82486a(CoreModule.m30929H().userId())) {
                this.f32308a.setText(messageRedPacketNotificationStatus.msg);
            }
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32308a = (VText) findViewById(edc0.f93488x4);
    }

    public ItemRedPacketNotification(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRedPacketNotification(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
