package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPlatinumPinGuideMessage;
import com.p046p1.mobile.putong.data.User;
import p149l.a1c0;
import p149l.dml;
import p149l.e30;
import p149l.hcq;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPlatinumPinGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f31394a;

    /* JADX INFO: renamed from: b */
    public TextView f31395b;

    /* JADX INFO: renamed from: c */
    public TextView f31396c;

    /* JADX INFO: renamed from: d */
    public ImageView f31397d;

    public ItemPlatinumPinGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48577a(User user, Act act, Boolean bool) {
        lsi0.m151595y(String.format("已成为%s的置顶聊天", user.isFemale() ? "她" : "他"));
        ((MessagesAct) act).f31640f.mo120659H6();
        CoreModule.f17545c.f19555C0.m210115x4();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48578b(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.code == 40399) {
                osi0.m165783g(tantanForbidden.message);
                return;
            }
        }
        osi0.m165783g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48579c(Act act, Conversation conversation, View view) {
        zvf0.m220399u("e_platinum_top_chat", act.pageId(), vwb.m200311Y("button_type", "close"));
        ((MessagesAct) act).f31640f.mo120659H6();
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.platinumChatPinGuideLastCloseTime;
        if (mqi0.m155929D(((long) conversationCounterTypeSp.get(conversation.f56011id)) * 1000)) {
            ConversationCounterTypeSp.platinumChatPinGuideCloseCount.set(conversation.f56011id);
        } else {
            ConversationCounterTypeSp.platinumChatPinGuideCloseCount.set(conversation.f56011id, 1);
        }
        conversationCounterTypeSp.set(conversation.f56011id, (int) (mqi0.m155944o() / 1000));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m48580d(final Act act, final User user, View view) {
        zvf0.m220399u("e_platinum_top_chat", act.pageId(), vwb.m200311Y("button_type", "open"));
        if (!xma.m210045H3()) {
            CoreModule.m29935P().m94656g().mo35006Ds(act, "p_chat_view,e_platinum_top_chat,click", Privilege.top_chat, null, null);
        } else if (xma.m210095v4() <= 0) {
            osi0.m165783g("特权次数已用完");
        } else {
            act.duringCreated(CoreModule.f17545c.f19641e2.m112214w3(user.f56011id, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.fcq
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemPlatinumPinGuideMessage.m48577a(user, act, (Boolean) obj);
                }
            }, new e30() { // from class: l.gcq
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemPlatinumPinGuideMessage.m48578b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m48581e(View view) {
        hcq.m130491a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m48582f(final Act act, dml dmlVar, final User user, final Conversation conversation) {
        if (act instanceof MessagesAct) {
            this.f31394a.setText(String.format("成为%s的置顶聊天", user.isFemale() ? "她" : "他"));
            xdl0.m208329E0(this.f31396c, new View.OnClickListener() { // from class: l.dcq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemPlatinumPinGuideMessage.m48580d(act, user, view);
                }
            });
            xdl0.m208329E0(this.f31397d, new View.OnClickListener() { // from class: l.ecq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemPlatinumPinGuideMessage.m48579c(act, conversation, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48581e(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31394a.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31395b.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemPlatinumPinGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPlatinumPinGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
