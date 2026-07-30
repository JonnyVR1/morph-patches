package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemPlatinumPinGuideMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.a1c0;
import l.hcq;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.eclipse.jetty.http.HttpHeaderValues;
import p003l.d30;
import p003l.dml;
import p003l.e30;
import p003l.m250;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPlatinumPinGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1285a;

    /* JADX INFO: renamed from: b */
    public TextView f1286b;

    /* JADX INFO: renamed from: c */
    public TextView f1287c;

    /* JADX INFO: renamed from: d */
    public ImageView f1288d;

    public ItemPlatinumPinGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1661a(User user, Act act, Boolean bool) {
        lsi0.y(String.format("已成为%s的置顶聊天", user.isFemale() ? "她" : "他"));
        ((MessagesAct) act).f1531f.m4124H6();
        CoreModule.c.C0.x4();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1662b(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.code == 40399) {
                osi0.g(tantanForbidden.message);
                return;
            }
        }
        osi0.g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1663c(Act act, Conversation conversation, View view) {
        zvf0.u("e_platinum_top_chat", act.pageId(), new j760[]{vwb.Y("button_type", HttpHeaderValues.CLOSE)});
        ((MessagesAct) act).f1531f.m4124H6();
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.platinumChatPinGuideLastCloseTime;
        if (mqi0.D(((long) conversationCounterTypeSp.get(((DbObject) conversation).id)) * 1000)) {
            ConversationCounterTypeSp.platinumChatPinGuideCloseCount.set(((DbObject) conversation).id);
        } else {
            ConversationCounterTypeSp.platinumChatPinGuideCloseCount.set(((DbObject) conversation).id, 1);
        }
        conversationCounterTypeSp.set(((DbObject) conversation).id, (int) (mqi0.o() / 1000));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1664d(final Act act, final User user, View view) {
        zvf0.u("e_platinum_top_chat", act.pageId(), new j760[]{vwb.Y("button_type", "open")});
        if (!xma.H3()) {
            CoreModule.P().g().Ds(act, "p_chat_view,e_platinum_top_chat,click", Privilege.top_chat, (e30) null, (d30) null);
        } else if (xma.v4() <= 0) {
            osi0.g("特权次数已用完");
        } else {
            act.duringCreated(CoreModule.c.e2.w3(((DbObject) user).id, true)).subscribe((m250) mkd0.H(new e30() { // from class: l.fcq
                @Override // p003l.e30
                public final void call(Object obj) {
                    ItemPlatinumPinGuideMessage.m1661a(user, act, (Boolean) obj);
                }
            }, new e30() { // from class: l.gcq
                @Override // p003l.e30
                public final void call(Object obj) {
                    ItemPlatinumPinGuideMessage.m1662b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1665e(View view) {
        hcq.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m1666f(final Act act, dml dmlVar, final User user, final Conversation conversation) {
        if (act instanceof MessagesAct) {
            this.f1285a.setText(String.format("成为%s的置顶聊天", user.isFemale() ? "她" : "他"));
            xdl0.E0(this.f1287c, new View.OnClickListener() { // from class: l.dcq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemPlatinumPinGuideMessage.m1664d(act, user, view);
                }
            });
            xdl0.E0(this.f1288d, new View.OnClickListener() { // from class: l.ecq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemPlatinumPinGuideMessage.m1663c(act, conversation, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1665e(this);
        if (ura.e().d().I4()) {
            this.f1285a.setTextColor(getResources().getColor(a1c0.g));
            this.f1286b.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemPlatinumPinGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPlatinumPinGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
