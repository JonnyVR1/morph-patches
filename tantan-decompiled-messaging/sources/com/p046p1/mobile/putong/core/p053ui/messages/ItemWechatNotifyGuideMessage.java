package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.common.base.Optional;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p046p1.mobile.putong.core.data.WechatNotifySetting;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemWechatNotifyGuideMessage;
import com.p046p1.mobile.putong.data.User;
import p149l.a1c0;
import p149l.c3c0;
import p149l.dml;
import p149l.g70;
import p149l.ura;
import p149l.xdl0;
import p149l.zhq;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemWechatNotifyGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f31550a;

    /* JADX INFO: renamed from: b */
    public TextView f31551b;

    /* JADX INFO: renamed from: c */
    public TextView f31552c;

    public ItemWechatNotifyGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48781a(Act act, View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo;
        zvf0.m220396r("e_open_wechat_notification", act.pageId());
        Optional<WechatNotifySetting> optionalM221515e = CoreModule.f17545c.f19639e0.f149204K1.m221515e();
        if (optionalM221515e == null || !optionalM221515e.isPresent() || (wechatMicroProgramLaunchInfo = optionalM221515e.get().wechatLaunch) == null) {
            return;
        }
        g70.INSTANCE.m124682a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
    }

    /* JADX INFO: renamed from: b */
    public final void m48782b(View view) {
        zhq.m218828a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m48783c(final Act act, dml dmlVar, User user, Conversation conversation) {
        if (act instanceof MessagesAct) {
            this.f31551b.setText(String.format("不错过%s回复的消息", user.isFemale() ? "她" : "他"));
            xdl0.m208329E0(this.f31552c, new View.OnClickListener() { // from class: l.yhq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemWechatNotifyGuideMessage.m48781a(act, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48782b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31550a.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31551b.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31552c.setBackgroundResource(c3c0.f78863t);
        }
    }

    public ItemWechatNotifyGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemWechatNotifyGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
