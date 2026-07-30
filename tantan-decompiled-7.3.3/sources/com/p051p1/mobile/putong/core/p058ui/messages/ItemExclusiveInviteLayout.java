package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageChatHeat;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.dox;
import p153l.edc0;
import p153l.g9c0;
import p153l.i4g0;
import p153l.jyb;
import p153l.ovb0;
import p153l.pol;
import p153l.psd0;
import p153l.pzi0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemExclusiveInviteLayout extends LinearLayout implements InterfaceC8682a, RunnableC4884c0.c {

    /* JADX INFO: renamed from: d */
    public static int f31787d;

    /* JADX INFO: renamed from: a */
    public VText f31788a;

    /* JADX INFO: renamed from: b */
    public VText f31789b;

    /* JADX INFO: renamed from: c */
    public VText f31790c;

    public ItemExclusiveInviteLayout(@NonNull Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, final Message message, InterfaceC8682a.a aVar) throws IOException {
        bnl0.m105524M(this.f31790c, false);
        final MessageChatHeat messageChatHeat = null;
        bnl0.m105509E0(this.f31790c, null);
        CoreModule.f18264c.f20427t1.m32519u("exclusive_tag_" + message.f56859id);
        try {
            messageChatHeat = MessageChatHeat.JSON_ADAPTER.parse(message.msgData);
        } catch (Exception unused) {
        }
        if (NullChecker.m82486a(messageChatHeat)) {
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.v4q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i4g0.m138523u("e_private_chat_invite_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("is_myself", Boolean.valueOf(message.isMe())), jyb.m147494Y("private_chat_duration", Integer.valueOf(messageChatHeat.exclusiveChatDuration)));
                }
            });
            i4g0.m138492A("e_private_chat_invite_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("is_myself", Boolean.valueOf(message.isMe())), jyb.m147494Y("is_private_chat_invite_expired", Boolean.valueOf(((double) pzi0.m174454o()) > messageChatHeat.exclusiveChatInviteExpireTime)), jyb.m147494Y("private_chat_duration", Integer.valueOf(messageChatHeat.exclusiveChatDuration)));
        }
        boolean zIsMe = message.isMe();
        VText vText = this.f31788a;
        if (zIsMe) {
            vText.setText("1v1专属聊天邀请");
            this.f31789b.setText("对方在10分钟内接受即可开启");
            return;
        }
        vText.setText("1v1专属聊天邀请");
        if (!NullChecker.m82486a(messageChatHeat)) {
            this.f31789b.setText("专属于彼此的聊天");
            return;
        }
        bnl0.m105524M(this.f31790c, true);
        this.f31789b.setText("" + messageChatHeat.exclusiveChatDuration + "分钟专属于彼此的聊天");
        if (((long) messageChatHeat.exclusiveChatStartTime) > 0) {
            this.f31790c.setText("已接受");
            this.f31790c.setTextColor(getContext().getResources().getColor(g9c0.f102822l));
            return;
        }
        if (pzi0.m174454o() >= messageChatHeat.exclusiveChatInviteExpireTime && ((long) messageChatHeat.exclusiveChatStartTime) <= 0) {
            this.f31790c.setText("已失效");
            this.f31790c.setTextColor(getContext().getResources().getColor(g9c0.f102822l));
            return;
        }
        RunnableC4884c0.a aVar2 = new RunnableC4884c0.a();
        aVar2.m32520a(true).m32521b(true).m32527h(60L).m32528i(600L).m32526g("exclusive_tag_" + message.f56859id).m32525f((long) messageChatHeat.exclusiveChatInviteExpireTime).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar2);
        m49318e((long) messageChatHeat.exclusiveChatInviteExpireTime);
        if (getContext() instanceof Act) {
            polVar.mo68557c((Act) getContext(), CoreModule.f18264c.f20427t1.m32512n("exclusive_tag_" + message.f56859id)).subscribe(psd0.m173596G(new y20() { // from class: l.w4q
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187429a.m49317d((RunnableC4884c0.b) obj);
                }
            }));
            bnl0.m105509E0(this.f31790c, new View.OnClickListener() { // from class: l.x4q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Message message2 = message;
                    CoreModule.f18264c.f20328M1.m111467l3(message2.cid, message2.f56859id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49317d(RunnableC4884c0.b bVar) {
        m49318e(bVar.f20466d);
    }

    /* JADX INFO: renamed from: e */
    public final void m49318e(long j) {
        long jM174454o = pzi0.m174454o();
        if (jM174454o > j) {
            this.f31790c.setText("已失效");
            this.f31790c.setTextColor(getContext().getResources().getColor(g9c0.f102822l));
            bnl0.m105509E0(this.f31790c, null);
            CoreModule.f18264c.f20384f0.m33653Fo();
            return;
        }
        long j2 = j - jM174454o;
        if (j2 >= AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            this.f31790c.setText("接受邀请");
        } else {
            int iMax = Math.max(0, (int) (j2 / 1000));
            this.f31790c.setText("接受邀请 " + iMax + BLiveStormDanmakuGiftResourceType.f45294s);
        }
        this.f31790c.setTextColor(getContext().getResources().getColor(g9c0.f102825o));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31788a = (VText) findViewById(edc0.f93267Q4);
        this.f31789b = (VText) findViewById(edc0.f93418n4);
        VText vText = (VText) findViewById(edc0.f93329b);
        this.f31790c = vText;
        vText.getPaint().setFakeBoldText(true);
        this.f31788a.getPaint().setFakeBoldText(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i);
        f31787d = iM117366d;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iM117366d, 1073741824), i2);
        setMeasuredDimension(f31787d, getMeasuredHeight());
    }

    public ItemExclusiveInviteLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemExclusiveInviteLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
