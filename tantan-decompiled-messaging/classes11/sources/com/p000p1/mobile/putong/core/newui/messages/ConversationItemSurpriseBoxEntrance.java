package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.Conversation;
import l.b4h0;
import l.bb6;
import l.g4h0;
import l.o6j0;
import l.qib0;
import l.upa;
import l.x2c0;
import l.xdl0;
import p009l.mqi0;
import p009l.pi6;
import p009l.rd6;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemSurpriseBoxEntrance extends LinearLayout implements c0.c {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3664a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3665b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f3666c;

    /* JADX INFO: renamed from: d */
    public VText f3667d;

    /* JADX INFO: renamed from: e */
    public VText f3668e;

    /* JADX INFO: renamed from: f */
    public TextView f3669f;

    /* JADX INFO: renamed from: g */
    public Long f3670g;

    /* JADX INFO: renamed from: h */
    public String f3671h;

    /* JADX INFO: renamed from: i */
    public c0.a f3672i;

    public ConversationItemSurpriseBoxEntrance(Context context) {
        super(context);
        this.f3670g = 0L;
        this.f3671h = "fake_conversation_surprise_gift_box";
    }

    /* JADX INFO: renamed from: c */
    private Act m5011c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    private void m5012d() {
        g4h0.a();
    }

    /* JADX INFO: renamed from: b */
    public final void m5013b(View view) {
        bb6.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m5014e(View view) {
        g4h0.c(m5011c(), (b4h0) null);
    }

    /* JADX INFO: renamed from: f */
    public void m5015f(Conversation conversation) {
        this.f3667d.setTypeface(Typeface.defaultFromStyle(1));
        this.f3667d.setText("惊喜礼盒");
        Long l2 = (Long) CoreModule.c.k2.Y.get();
        this.f3668e.setText(String.format("剩余有效期 %s", CoreModule.c.t1.k(l2.longValue() - mqi0.m18550o())));
        CoreModule.c.t1.t(this);
        c0.a aVar = new c0.a();
        this.f3672i = aVar;
        aVar.a(true).g(this.f3671h).d(this).f(l2.longValue());
        CoreModule.c.t1.r(this.f3672i);
        boolean z = upa.z();
        VDraweeView vDraweeView = this.f3664a;
        if (z) {
            vDraweeView.setImageResource(x2c0.b6);
        } else {
            vDraweeView.setImageResource(x2c0.a6);
        }
        this.f3669f.setText(mqi0.m18538G(conversation.latestTime));
        m5016g();
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ab6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9364a.m5014e(view);
            }
        });
        String str = (String) CoreModule.c.k2.b0.get();
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView2 = this.f3665b;
        if (zIsEmpty) {
            xdl0.M(vDraweeView2, false);
        } else {
            xdl0.M(vDraweeView2, true);
            qib0.G.L0(this.f3665b, str);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5016g() {
        if (mqi0.m18550o() - this.f3670g.longValue() <= 500) {
            return;
        }
        this.f3670g = Long.valueOf(mqi0.m18550o());
        o6j0.h("e_blindbox_entrance", "p_messages_view", new o6j0.a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.c.t1.t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5013b(this);
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
            rd6.m21523v(pi6.f18601Q, this.f3664a);
            rd6.m21518k0(this.f3667d, this.f3669f);
            rd6.m21514e0(this.f3668e);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m5017u(String str, long j, long j2, long j3, long j4) {
        VText vText;
        if (TextUtils.equals(this.f3671h, str) && (vText = this.f3668e) != null) {
            if (j3 >= j) {
                vText.setText(String.format("剩余有效期 %s", CoreModule.c.t1.k(j3 - j)));
            } else {
                CoreModule.c.t1.t(this);
                m5012d();
            }
        }
    }

    public ConversationItemSurpriseBoxEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3670g = 0L;
        this.f3671h = "fake_conversation_surprise_gift_box";
    }

    public ConversationItemSurpriseBoxEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3670g = 0L;
        this.f3671h = "fake_conversation_surprise_gift_box";
    }
}
