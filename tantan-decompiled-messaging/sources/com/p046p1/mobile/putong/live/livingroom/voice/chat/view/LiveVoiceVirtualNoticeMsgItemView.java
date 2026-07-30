package com.p046p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceVirtualNoticeMsgItemBindings;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.LiveVoiceVirtualNoticeMsgItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p149l.cxq;
import p149l.hxs;
import p149l.nol;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/chat/view/LiveVoiceVirtualNoticeMsgItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceVirtualNoticeMsgItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/nol;", "chatView", "Lcom/p1/mobile/putong/live/livingroom/archi/longlink/bean/LiveMessage;", "liveMessage", "", "c", "(Ll/nol;Lcom/p1/mobile/putong/live/livingroom/archi/longlink/bean/LiveMessage;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVoiceVirtualNoticeMsgItemView extends LiveVoiceVirtualNoticeMsgItemBindings {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceVirtualNoticeMsgItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static Unit m77977b(nol nolVar, View view) {
        view.getClass();
        nolVar.mo72700j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m77978c(@NotNull final nol chatView, @NotNull LiveMessage liveMessage) {
        chatView.getClass();
        liveMessage.getClass();
        LongLinkLiveMessage.VoiceVirtualAvatarInitNoticeMessage voiceVirtualAvatarInitNoticeMessage = liveMessage.extInfo.virtualAvatarNoticeMsg;
        if (voiceVirtualAvatarInitNoticeMessage != null) {
            this.f48392d.setText(voiceVirtualAvatarInitNoticeMessage.getTitle());
            this.f48393e.setText(liveMessage.extInfo.virtualAvatarNoticeMsg.getContent());
        }
        LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        if (liveUserInfo != null) {
            hxs.m133406s("context_livingAct", this.f48391c, liveUserInfo.userMask.avatar);
        }
        VDraweeView vDraweeView = this.f48391c;
        vDraweeView.getClass();
        cxq.m109105c(vDraweeView, new Function1() { // from class: l.hbv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceVirtualNoticeMsgItemView.m77977b(chatView, (View) obj);
            }
        });
    }
}
