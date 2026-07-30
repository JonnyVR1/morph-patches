package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemVisitorHideFootPrint;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.shq;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.eclipse.jetty.http.HttpHeaderValues;
import p003l.e30;
import p003l.j000;
import p003l.m250;
import p003l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemVisitorHideFootPrint extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1424a;

    /* JADX INFO: renamed from: b */
    public TextView f1425b;

    /* JADX INFO: renamed from: c */
    public TextView f1426c;

    /* JADX INFO: renamed from: d */
    public ImageView f1427d;

    /* JADX INFO: renamed from: e */
    public boolean f1428e;

    public ItemVisitorHideFootPrint(Context context) {
        super(context);
        this.f1428e = true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1837a(Act act, Conversation conversation, View view) {
        ((MessagesAct) act).f1531f.m4129I6();
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(((DbObject) conversation).id, CoreModule.P().e().Se());
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.set(((DbObject) conversation).id, (int) (mqi0.o() / 1000));
    }

    /* JADX INFO: renamed from: f */
    public final void m1842f(View view) {
        shq.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1843g(Message message, User user, j760 j760Var) {
        boolean zBooleanValue = ((Boolean) j760Var.b).booleanValue();
        message.localMyVisitorHidden = zBooleanValue;
        m1847k(zBooleanValue, user, message);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1844h(Message message, User user, Boolean bool) {
        message.localMyVisitorHidden = bool.booleanValue();
        m1847k(bool.booleanValue(), user, message);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1845i(Act act, final Message message, final User user, View view) {
        zvf0.u("e_hide_records_chat", act.pageId(), new j760[]{vwb.Y("button_type", message.localMyVisitorHidden ? "open" : HttpHeaderValues.CLOSE)});
        CoreModule.P().e().vr(act, user, !message.localMyVisitorHidden, new e30() { // from class: l.rhq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6930a.m1844h(message, user, (Boolean) obj);
            }
        }, "p_chat,hide_records");
    }

    /* JADX INFO: renamed from: j */
    public void m1846j(final Act act, j000 j000Var, final User user, final Conversation conversation, final Message message) {
        if (act instanceof MessagesAct) {
            if (this.f1428e) {
                this.f1428e = false;
                zvf0.A("e_hide_records_chat", act.pageId(), new j760[]{vwb.Y("button_type", message.localMyVisitorHidden ? "open" : HttpHeaderValues.CLOSE)});
            }
            j000Var.g(act, CoreModule.c.n2.c4(), false).filter(new w9j() { // from class: l.nhq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((CharSequence) ((j760) obj).a, ((DbObject) user).id));
                }
            }).distinctUntilChanged().subscribe((m250) mkd0.G(new e30() { // from class: l.ohq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6162a.m1843g(message, user, (j760) obj);
                }
            }));
            m1847k(message.localMyVisitorHidden, user, message);
            xdl0.E0(this.f1426c, new View.OnClickListener() { // from class: l.phq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6435a.m1845i(act, message, user, view);
                }
            });
            xdl0.E0(this.f1427d, new View.OnClickListener() { // from class: l.qhq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemVisitorHideFootPrint.m1837a(act, conversation, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1847k(boolean z, User user, Message message) {
        TextView textView = this.f1424a;
        if (z) {
            textView.setText("已隐藏访问足迹");
            this.f1425b.setText("是否恢复访问足迹？");
            this.f1426c.setText("恢复足迹");
        } else {
            textView.setText(String.format("近期你访问过%1$s%2$s次", user.isFemale() ? "她" : "他", Integer.valueOf(message.localMyVisitorCount)));
            this.f1425b.setText("是否隐藏访问足迹？");
            this.f1426c.setText("隐藏足迹");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1842f(this);
    }

    public ItemVisitorHideFootPrint(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1428e = true;
    }

    public ItemVisitorHideFootPrint(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1428e = true;
    }
}
