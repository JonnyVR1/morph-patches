package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.ec6;
import p153l.gra;
import p153l.och0;
import p153l.pzi0;
import p153l.sfj0;
import p153l.sj6;
import p153l.ue6;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemSurpriseBoxEntrance extends LinearLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25628a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25629b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f25630c;

    /* JADX INFO: renamed from: d */
    public VText f25631d;

    /* JADX INFO: renamed from: e */
    public VText f25632e;

    /* JADX INFO: renamed from: f */
    public TextView f25633f;

    /* JADX INFO: renamed from: g */
    public Long f25634g;

    /* JADX INFO: renamed from: h */
    public String f25635h;

    /* JADX INFO: renamed from: i */
    public RunnableC4884c0.a f25636i;

    public ConversationItemSurpriseBoxEntrance(Context context) {
        super(context);
        this.f25634g = 0L;
        this.f25635h = "fake_conversation_surprise_gift_box";
    }

    /* JADX INFO: renamed from: c */
    private Act m41923c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    private void m41924d() {
        och0.m167215a();
    }

    /* JADX INFO: renamed from: b */
    public final void m41925b(View view) {
        ec6.m120296a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m41926e(View view) {
        och0.m167217c(m41923c(), null);
    }

    /* JADX INFO: renamed from: f */
    public void m41927f(Conversation conversation) {
        this.f25631d.setTypeface(Typeface.defaultFromStyle(1));
        this.f25631d.setText("惊喜礼盒");
        Long l2 = CoreModule.f18264c.f20401k2.f118666Y.get();
        this.f25632e.setText(String.format("剩余有效期 %s", CoreModule.f18264c.f20427t1.m32510k(l2.longValue() - pzi0.m174454o())));
        CoreModule.f18264c.f20427t1.m32518t(this);
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        this.f25636i = aVar;
        aVar.m32520a(true).m32526g(this.f25635h).m32523d(this).m32525f(l2.longValue());
        CoreModule.f18264c.f20427t1.m32516r(this.f25636i);
        boolean zM131778z = gra.m131778z();
        VDraweeView vDraweeView = this.f25628a;
        if (zM131778z) {
            vDraweeView.setImageResource(dbc0.f86881c6);
        } else {
            vDraweeView.setImageResource(dbc0.f86848b6);
        }
        this.f25633f.setText(pzi0.m174442G(conversation.latestTime));
        m41928g();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.dc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87742a.m41926e(view);
            }
        });
        String str = CoreModule.f18264c.f20401k2.f118669b0.get();
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView2 = this.f25629b;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            uqb0.f180374G.m127115L0(this.f25629b, str);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m41928g() {
        if (pzi0.m174454o() - this.f25634g.longValue() <= 500) {
            return;
        }
        this.f25634g = Long.valueOf(pzi0.m174454o());
        sfj0.m185601h("e_blindbox_entrance", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32518t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41925b(this);
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
            ue6.m195676v(sj6.f168905Q, this.f25628a);
            ue6.m195671k0(this.f25631d, this.f25633f);
            ue6.m195667e0(this.f25632e);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals(this.f25635h, str) && (vText = this.f25632e) != null) {
            if (j3 >= j) {
                vText.setText(String.format("剩余有效期 %s", CoreModule.f18264c.f20427t1.m32510k(j3 - j)));
            } else {
                CoreModule.f18264c.f20427t1.m32518t(this);
                m41924d();
            }
        }
    }

    public ConversationItemSurpriseBoxEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25634g = 0L;
        this.f25635h = "fake_conversation_surprise_gift_box";
    }

    public ConversationItemSurpriseBoxEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25634g = 0L;
        this.f25635h = "fake_conversation_surprise_gift_box";
    }
}
