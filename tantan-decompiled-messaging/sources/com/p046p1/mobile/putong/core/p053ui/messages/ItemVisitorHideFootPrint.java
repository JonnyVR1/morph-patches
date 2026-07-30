package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemVisitorHideFootPrint;
import com.p046p1.mobile.putong.data.User;
import p149l.e30;
import p149l.j000;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.shq;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemVisitorHideFootPrint extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f31533a;

    /* JADX INFO: renamed from: b */
    public TextView f31534b;

    /* JADX INFO: renamed from: c */
    public TextView f31535c;

    /* JADX INFO: renamed from: d */
    public ImageView f31536d;

    /* JADX INFO: renamed from: e */
    public boolean f31537e;

    public ItemVisitorHideFootPrint(Context context) {
        super(context);
        this.f31537e = true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48753a(Act act, Conversation conversation, View view) {
        ((MessagesAct) act).f31640f.mo120664I6();
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(conversation.f56011id, CoreModule.m29935P().m94654e().mo34973Se());
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.set(conversation.f56011id, (int) (mqi0.m155944o() / 1000));
    }

    /* JADX INFO: renamed from: f */
    public final void m48758f(View view) {
        shq.m184264a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48759g(Message message, User user, j760 j760Var) {
        boolean zBooleanValue = ((Boolean) j760Var.f116565b).booleanValue();
        message.localMyVisitorHidden = zBooleanValue;
        m48763k(zBooleanValue, user, message);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48760h(Message message, User user, Boolean bool) {
        message.localMyVisitorHidden = bool.booleanValue();
        m48763k(bool.booleanValue(), user, message);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48761i(Act act, final Message message, final User user, View view) {
        zvf0.m220399u("e_hide_records_chat", act.pageId(), vwb.m200311Y("button_type", message.localMyVisitorHidden ? "open" : "close"));
        CoreModule.m29935P().m94654e().mo34989vr(act, user, !message.localMyVisitorHidden, new e30() { // from class: l.rhq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159471a.m48760h(message, user, (Boolean) obj);
            }
        }, "p_chat,hide_records");
    }

    /* JADX INFO: renamed from: j */
    public void m48762j(final Act act, j000 j000Var, final User user, final Conversation conversation, final Message message) {
        if (act instanceof MessagesAct) {
            if (this.f31537e) {
                this.f31537e = false;
                zvf0.m220368A("e_hide_records_chat", act.pageId(), vwb.m200311Y("button_type", message.localMyVisitorHidden ? "open" : "close"));
            }
            j000Var.mo67378g(act, CoreModule.f17545c.f19668n2.m175452c4(), false).filter(new w9j() { // from class: l.nhq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((CharSequence) ((j760) obj).f116564a, user.f56011id));
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ohq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144036a.m48759g(message, user, (j760) obj);
                }
            }));
            m48763k(message.localMyVisitorHidden, user, message);
            xdl0.m208329E0(this.f31535c, new View.OnClickListener() { // from class: l.phq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149035a.m48761i(act, message, user, view);
                }
            });
            xdl0.m208329E0(this.f31536d, new View.OnClickListener() { // from class: l.qhq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemVisitorHideFootPrint.m48753a(act, conversation, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m48763k(boolean z, User user, Message message) {
        TextView textView = this.f31533a;
        if (z) {
            textView.setText("已隐藏访问足迹");
            this.f31534b.setText("是否恢复访问足迹？");
            this.f31535c.setText("恢复足迹");
        } else {
            textView.setText(String.format("近期你访问过%1$s%2$s次", user.isFemale() ? "她" : "他", Integer.valueOf(message.localMyVisitorCount)));
            this.f31534b.setText("是否隐藏访问足迹？");
            this.f31535c.setText("隐藏足迹");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48758f(this);
    }

    public ItemVisitorHideFootPrint(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31537e = true;
    }

    public ItemVisitorHideFootPrint(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31537e = true;
    }
}
