package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemVisitorHideFootPrint;
import com.p051p1.mobile.putong.data.User;
import p153l.bnl0;
import p153l.g900;
import p153l.i4g0;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.sjq;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemVisitorHideFootPrint extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f32381a;

    /* JADX INFO: renamed from: b */
    public TextView f32382b;

    /* JADX INFO: renamed from: c */
    public TextView f32383c;

    /* JADX INFO: renamed from: d */
    public ImageView f32384d;

    /* JADX INFO: renamed from: e */
    public boolean f32385e;

    public ItemVisitorHideFootPrint(Context context) {
        super(context);
        this.f32385e = true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49936a(Act act, Conversation conversation, View view) {
        ((MessagesAct) act).f32488f.mo110870I6();
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(conversation.f56859id, CoreModule.m30933P().m143408e().mo35976Se());
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.set(conversation.f56859id, (int) (pzi0.m174454o() / 1000));
    }

    /* JADX INFO: renamed from: f */
    public final void m49941f(View view) {
        sjq.m186296a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49942g(Message message, User user, pf60 pf60Var) {
        boolean zBooleanValue = ((Boolean) pf60Var.f152157b).booleanValue();
        message.localMyVisitorHidden = zBooleanValue;
        m49946k(zBooleanValue, user, message);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49943h(Message message, User user, Boolean bool) {
        message.localMyVisitorHidden = bool.booleanValue();
        m49946k(bool.booleanValue(), user, message);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m49944i(Act act, final Message message, final User user, View view) {
        i4g0.m138523u("e_hide_records_chat", act.pageId(), jyb.m147494Y("button_type", message.localMyVisitorHidden ? "open" : "close"));
        CoreModule.m30933P().m143408e().mo35992vr(act, user, !message.localMyVisitorHidden, new y20() { // from class: l.rjq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163497a.m49943h(message, user, (Boolean) obj);
            }
        }, "p_chat,hide_records");
    }

    /* JADX INFO: renamed from: j */
    public void m49945j(final Act act, g900 g900Var, final User user, final Conversation conversation, final Message message) {
        if (act instanceof MessagesAct) {
            if (this.f32385e) {
                this.f32385e = false;
                i4g0.m138492A("e_hide_records_chat", act.pageId(), jyb.m147494Y("button_type", message.localMyVisitorHidden ? "open" : "close"));
            }
            g900Var.mo68561g(act, CoreModule.f18264c.f20410n2.m121483c4(), false).filter(new qcj() { // from class: l.njq
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((CharSequence) ((pf60) obj).f152156a, user.f56859id));
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ojq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147695a.m49942g(message, user, (pf60) obj);
                }
            }));
            m49946k(message.localMyVisitorHidden, user, message);
            bnl0.m105509E0(this.f32383c, new View.OnClickListener() { // from class: l.pjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f152730a.m49944i(act, message, user, view);
                }
            });
            bnl0.m105509E0(this.f32384d, new View.OnClickListener() { // from class: l.qjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemVisitorHideFootPrint.m49936a(act, conversation, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m49946k(boolean z, User user, Message message) {
        TextView textView = this.f32381a;
        if (z) {
            textView.setText("已隐藏访问足迹");
            this.f32382b.setText("是否恢复访问足迹？");
            this.f32383c.setText("恢复足迹");
        } else {
            textView.setText(String.format("近期你访问过%1$s%2$s次", user.isFemale() ? "她" : "他", Integer.valueOf(message.localMyVisitorCount)));
            this.f32382b.setText("是否隐藏访问足迹？");
            this.f32383c.setText("隐藏足迹");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49941f(this);
    }

    public ItemVisitorHideFootPrint(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32385e = true;
    }

    public ItemVisitorHideFootPrint(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32385e = true;
    }
}
