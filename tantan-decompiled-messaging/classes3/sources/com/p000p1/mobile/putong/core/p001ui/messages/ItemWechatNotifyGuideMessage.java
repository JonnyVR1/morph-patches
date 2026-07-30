package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemWechatNotifyGuideMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p1.mobile.putong.core.data.WechatNotifySetting;
import com.p1.mobile.putong.data.User;
import l.a1c0;
import l.c3c0;
import l.g70;
import l.ura;
import l.xdl0;
import l.zhq;
import l.zvf0;
import p003l.dml;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemWechatNotifyGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1441a;

    /* JADX INFO: renamed from: b */
    public TextView f1442b;

    /* JADX INFO: renamed from: c */
    public TextView f1443c;

    public ItemWechatNotifyGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1865a(Act act, View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo;
        zvf0.r("e_open_wechat_notification", act.pageId());
        Optional optional = (Optional) CoreModule.c.e0.K1.m9972e();
        if (optional == null || !optional.isPresent() || (wechatMicroProgramLaunchInfo = ((WechatNotifySetting) optional.get()).wechatLaunch) == null) {
            return;
        }
        g70.INSTANCE.a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
    }

    /* JADX INFO: renamed from: b */
    public final void m1866b(View view) {
        zhq.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m1867c(final Act act, dml dmlVar, User user, Conversation conversation) {
        if (act instanceof MessagesAct) {
            this.f1442b.setText(String.format("不错过%s回复的消息", user.isFemale() ? "她" : "他"));
            xdl0.E0(this.f1443c, new View.OnClickListener() { // from class: l.yhq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemWechatNotifyGuideMessage.m1865a(act, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1866b(this);
        if (ura.e().d().I4()) {
            this.f1441a.setTextColor(getResources().getColor(a1c0.g));
            this.f1442b.setTextColor(getResources().getColor(a1c0.i));
            this.f1443c.setBackgroundResource(c3c0.t);
        }
    }

    public ItemWechatNotifyGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemWechatNotifyGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
