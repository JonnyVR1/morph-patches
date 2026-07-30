package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.common.base.Optional;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo;
import com.p051p1.mobile.putong.core.data.WechatNotifySetting;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemWechatNotifyGuideMessage;
import com.p051p1.mobile.putong.data.User;
import p153l.bnl0;
import p153l.c70;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.pol;
import p153l.zjq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemWechatNotifyGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f32398a;

    /* JADX INFO: renamed from: b */
    public TextView f32399b;

    /* JADX INFO: renamed from: c */
    public TextView f32400c;

    public ItemWechatNotifyGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49964a(Act act, View view) {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo;
        i4g0.m138520r("e_open_wechat_notification", act.pageId());
        Optional<WechatNotifySetting> optionalM222761e = CoreModule.f18264c.f20381e0.f89061K1.m222761e();
        if (optionalM222761e == null || !optionalM222761e.isPresent() || (wechatMicroProgramLaunchInfo = optionalM222761e.get().wechatLaunch) == null) {
            return;
        }
        c70.INSTANCE.m108261a(wechatMicroProgramLaunchInfo.userName, wechatMicroProgramLaunchInfo.path);
    }

    /* JADX INFO: renamed from: b */
    public final void m49965b(View view) {
        zjq.m219982a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m49966c(final Act act, pol polVar, User user, Conversation conversation) {
        if (act instanceof MessagesAct) {
            this.f32399b.setText(String.format("不错过%s回复的消息", user.isFemale() ? "她" : "他"));
            bnl0.m105509E0(this.f32400c, new View.OnClickListener() { // from class: l.yjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemWechatNotifyGuideMessage.m49964a(act, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49965b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32398a.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32399b.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32400c.setBackgroundResource(ibc0.f114138t);
        }
    }

    public ItemWechatNotifyGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemWechatNotifyGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
