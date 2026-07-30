package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPlatinumPinGuideMessage;
import com.p051p1.mobile.putong.data.User;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.heq;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.o1j0;
import p153l.pol;
import p153l.psd0;
import p153l.pzi0;
import p153l.r1j0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPlatinumPinGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f32242a;

    /* JADX INFO: renamed from: b */
    public TextView f32243b;

    /* JADX INFO: renamed from: c */
    public TextView f32244c;

    /* JADX INFO: renamed from: d */
    public ImageView f32245d;

    public ItemPlatinumPinGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49760a(User user, Act act, Boolean bool) {
        o1j0.m165651y(String.format("已成为%s的置顶聊天", user.isFemale() ? "她" : "他"));
        ((MessagesAct) act).f32488f.mo110865H6();
        CoreModule.f18264c.f20297C0.m146428y4();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49761b(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.code == 40399) {
                r1j0.m179420g(tantanForbidden.message);
                return;
            }
        }
        r1j0.m179420g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m49762c(Act act, Conversation conversation, View view) {
        i4g0.m138523u("e_platinum_top_chat", act.pageId(), jyb.m147494Y("button_type", "close"));
        ((MessagesAct) act).f32488f.mo110865H6();
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.platinumChatPinGuideLastCloseTime;
        if (pzi0.m174439D(((long) conversationCounterTypeSp.get(conversation.f56859id)) * 1000)) {
            ConversationCounterTypeSp.platinumChatPinGuideCloseCount.set(conversation.f56859id);
        } else {
            ConversationCounterTypeSp.platinumChatPinGuideCloseCount.set(conversation.f56859id, 1);
        }
        conversationCounterTypeSp.set(conversation.f56859id, (int) (pzi0.m174454o() / 1000));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m49763d(final Act act, final User user, View view) {
        i4g0.m138523u("e_platinum_top_chat", act.pageId(), jyb.m147494Y("button_type", "open"));
        if (!joa.m146359I3()) {
            CoreModule.m30933P().m143410g().mo36009Ds(act, "p_chat_view,e_platinum_top_chat,click", Privilege.top_chat, null, null);
        } else if (joa.m146410w4() <= 0) {
            r1j0.m179420g("特权次数已用完");
        } else {
            act.duringCreated(CoreModule.f18264c.f20383e2.m172823w3(user.f56859id, true)).subscribe(psd0.m173597H(new y20() { // from class: l.feq
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemPlatinumPinGuideMessage.m49760a(user, act, (Boolean) obj);
                }
            }, new y20() { // from class: l.geq
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemPlatinumPinGuideMessage.m49761b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m49764e(View view) {
        heq.m134671a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m49765f(final Act act, pol polVar, final User user, final Conversation conversation) {
        if (act instanceof MessagesAct) {
            this.f32242a.setText(String.format("成为%s的置顶聊天", user.isFemale() ? "她" : "他"));
            bnl0.m105509E0(this.f32244c, new View.OnClickListener() { // from class: l.deq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemPlatinumPinGuideMessage.m49763d(act, user, view);
                }
            });
            bnl0.m105509E0(this.f32245d, new View.OnClickListener() { // from class: l.eeq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemPlatinumPinGuideMessage.m49762c(act, conversation, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49764e(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32242a.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32243b.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemPlatinumPinGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPlatinumPinGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
