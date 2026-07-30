package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bb6;
import p149l.g4h0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.pi6;
import p149l.qib0;
import p149l.rd6;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemSurpriseBoxEntrance extends LinearLayout implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24886a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24887b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f24888c;

    /* JADX INFO: renamed from: d */
    public VText f24889d;

    /* JADX INFO: renamed from: e */
    public VText f24890e;

    /* JADX INFO: renamed from: f */
    public TextView f24891f;

    /* JADX INFO: renamed from: g */
    public Long f24892g;

    /* JADX INFO: renamed from: h */
    public String f24893h;

    /* JADX INFO: renamed from: i */
    public RunnableC4733c0.a f24894i;

    public ConversationItemSurpriseBoxEntrance(Context context) {
        super(context);
        this.f24892g = 0L;
        this.f24893h = "fake_conversation_surprise_gift_box";
    }

    /* JADX INFO: renamed from: c */
    private Act m40912c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    private void m40913d() {
        g4h0.m124369a();
    }

    /* JADX INFO: renamed from: b */
    public final void m40914b(View view) {
        bb6.m100953a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m40915e(View view) {
        g4h0.m124371c(m40912c(), null);
    }

    /* JADX INFO: renamed from: f */
    public void m40916f(Conversation conversation) {
        this.f24889d.setTypeface(Typeface.defaultFromStyle(1));
        this.f24889d.setText("惊喜礼盒");
        Long l2 = CoreModule.f17545c.f19659k2.f184663Y.get();
        this.f24890e.setText(String.format("剩余有效期 %s", CoreModule.f17545c.f19685t1.m31507k(l2.longValue() - mqi0.m155944o())));
        CoreModule.f17545c.f19685t1.m31515t(this);
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        this.f24894i = aVar;
        aVar.m31517a(true).m31523g(this.f24893h).m31520d(this).m31522f(l2.longValue());
        CoreModule.f17545c.f19685t1.m31513r(this.f24894i);
        boolean zM194847z = upa.m194847z();
        VDraweeView vDraweeView = this.f24886a;
        if (zM194847z) {
            vDraweeView.setImageResource(x2c0.f190004b6);
        } else {
            vDraweeView.setImageResource(x2c0.f189972a6);
        }
        this.f24891f.setText(mqi0.m155932G(conversation.latestTime));
        m40917g();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ab6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68627a.m40915e(view);
            }
        });
        String str = CoreModule.f17545c.f19659k2.f184666b0.get();
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView2 = this.f24887b;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            qib0.f154691G.m102331L0(this.f24887b, str);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m40917g() {
        if (mqi0.m155944o() - this.f24892g.longValue() <= 500) {
            return;
        }
        this.f24892g = Long.valueOf(mqi0.m155944o());
        o6j0.m162864h("e_blindbox_entrance", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f17545c.f19685t1.m31515t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40914b(this);
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
            rd6.m178882v(pi6.f149080Q, this.f24886a);
            rd6.m178877k0(this.f24889d, this.f24891f);
            rd6.m178873e0(this.f24890e);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals(this.f24893h, str) && (vText = this.f24890e) != null) {
            if (j3 >= j) {
                vText.setText(String.format("剩余有效期 %s", CoreModule.f17545c.f19685t1.m31507k(j3 - j)));
            } else {
                CoreModule.f17545c.f19685t1.m31515t(this);
                m40913d();
            }
        }
    }

    public ConversationItemSurpriseBoxEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24892g = 0L;
        this.f24893h = "fake_conversation_surprise_gift_box";
    }

    public ConversationItemSurpriseBoxEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24892g = 0L;
        this.f24893h = "fake_conversation_surprise_gift_box";
    }
}
