package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageChatHeat;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import p147v.VText;
import p149l.a1c0;
import p149l.dml;
import p149l.e30;
import p149l.ffx;
import p149l.knb0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemExclusiveInviteLayout extends LinearLayout implements InterfaceC8519a, RunnableC4733c0.c {

    /* JADX INFO: renamed from: d */
    public static int f30939d;

    /* JADX INFO: renamed from: a */
    public VText f30940a;

    /* JADX INFO: renamed from: b */
    public VText f30941b;

    /* JADX INFO: renamed from: c */
    public VText f30942c;

    public ItemExclusiveInviteLayout(@NonNull Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, final Message message, InterfaceC8519a.a aVar) throws IOException {
        xdl0.m208344M(this.f30942c, false);
        final MessageChatHeat messageChatHeat = null;
        xdl0.m208329E0(this.f30942c, null);
        CoreModule.f17545c.f19685t1.m31516u("exclusive_tag_" + message.f56011id);
        try {
            messageChatHeat = MessageChatHeat.JSON_ADAPTER.parse(message.msgData);
        } catch (Exception unused) {
        }
        if (NullChecker.m81303a(messageChatHeat)) {
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.v2q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zvf0.m220399u("e_private_chat_invite_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("is_myself", Boolean.valueOf(message.isMe())), vwb.m200311Y("private_chat_duration", Integer.valueOf(messageChatHeat.exclusiveChatDuration)));
                }
            });
            zvf0.m220368A("e_private_chat_invite_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("is_myself", Boolean.valueOf(message.isMe())), vwb.m200311Y("is_private_chat_invite_expired", Boolean.valueOf(((double) mqi0.m155944o()) > messageChatHeat.exclusiveChatInviteExpireTime)), vwb.m200311Y("private_chat_duration", Integer.valueOf(messageChatHeat.exclusiveChatDuration)));
        }
        boolean zIsMe = message.isMe();
        VText vText = this.f30940a;
        if (zIsMe) {
            vText.setText("1v1专属聊天邀请");
            this.f30941b.setText("对方在10分钟内接受即可开启");
            return;
        }
        vText.setText("1v1专属聊天邀请");
        if (!NullChecker.m81303a(messageChatHeat)) {
            this.f30941b.setText("专属于彼此的聊天");
            return;
        }
        xdl0.m208344M(this.f30942c, true);
        this.f30941b.setText("" + messageChatHeat.exclusiveChatDuration + "分钟专属于彼此的聊天");
        if (((long) messageChatHeat.exclusiveChatStartTime) > 0) {
            this.f30942c.setText("已接受");
            this.f30942c.setTextColor(getContext().getResources().getColor(a1c0.f67158l));
            return;
        }
        if (mqi0.m155944o() >= messageChatHeat.exclusiveChatInviteExpireTime && ((long) messageChatHeat.exclusiveChatStartTime) <= 0) {
            this.f30942c.setText("已失效");
            this.f30942c.setTextColor(getContext().getResources().getColor(a1c0.f67158l));
            return;
        }
        RunnableC4733c0.a aVar2 = new RunnableC4733c0.a();
        aVar2.m31517a(true).m31518b(true).m31524h(60L).m31525i(600L).m31523g("exclusive_tag_" + message.f56011id).m31522f((long) messageChatHeat.exclusiveChatInviteExpireTime).m31520d(this);
        CoreModule.f17545c.f19685t1.m31513r(aVar2);
        m48135e((long) messageChatHeat.exclusiveChatInviteExpireTime);
        if (getContext() instanceof Act) {
            dmlVar.mo67374c((Act) getContext(), CoreModule.f17545c.f19685t1.m31509n("exclusive_tag_" + message.f56011id)).subscribe(mkd0.m154955G(new e30() { // from class: l.w2q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f184277a.m48134d((RunnableC4733c0.b) obj);
                }
            }));
            xdl0.m208329E0(this.f30942c, new View.OnClickListener() { // from class: l.x2q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Message message2 = message;
                    CoreModule.f17545c.f19586M1.m215242l3(message2.cid, message2.f56011id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m48134d(RunnableC4733c0.b bVar) {
        m48135e(bVar.f19724d);
    }

    /* JADX INFO: renamed from: e */
    public final void m48135e(long j) {
        long jM155944o = mqi0.m155944o();
        if (jM155944o > j) {
            this.f30942c.setText("已失效");
            this.f30942c.setTextColor(getContext().getResources().getColor(a1c0.f67158l));
            xdl0.m208329E0(this.f30942c, null);
            CoreModule.f17545c.f19642f0.m32650Fo();
            return;
        }
        long j2 = j - jM155944o;
        if (j2 >= AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            this.f30942c.setText("接受邀请");
        } else {
            int iMax = Math.max(0, (int) (j2 / 1000));
            this.f30942c.setText("接受邀请 " + iMax + BLiveStormDanmakuGiftResourceType.f44446s);
        }
        this.f30942c.setTextColor(getContext().getResources().getColor(a1c0.f67161o));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30940a = (VText) findViewById(y4c0.f196032Q4);
        this.f30941b = (VText) findViewById(y4c0.f196183n4);
        VText vText = (VText) findViewById(y4c0.f196094b);
        this.f30942c = vText;
        vText.getPaint().setFakeBoldText(true);
        this.f30940a.getPaint().setFakeBoldText(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i);
        f30939d = iM121201d;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iM121201d, 1073741824), i2);
        setMeasuredDimension(f30939d, getMeasuredHeight());
    }

    public ItemExclusiveInviteLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemExclusiveInviteLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
