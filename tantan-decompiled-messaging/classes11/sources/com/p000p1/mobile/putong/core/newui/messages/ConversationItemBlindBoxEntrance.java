package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import l.d86;
import l.g6a;
import l.j2e0;
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
public class ConversationItemBlindBoxEntrance extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3580a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f3581b;

    /* JADX INFO: renamed from: c */
    public VText f3582c;

    /* JADX INFO: renamed from: d */
    public VText f3583d;

    /* JADX INFO: renamed from: e */
    public TextView f3584e;

    /* JADX INFO: renamed from: f */
    public Long f3585f;

    public ConversationItemBlindBoxEntrance(Context context) {
        super(context);
        this.f3585f = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m4899b(View view) {
        d86.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m4900c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m4901d(GrowthBlindBoxInfo growthBlindBoxInfo, View view) {
        String strD3 = g6a.z() ? CoreModule.c.g2.d3(growthBlindBoxInfo.h5URL) : growthBlindBoxInfo.h5URL;
        if (TextUtils.isEmpty(strD3)) {
            return;
        }
        j2e0.m(m4900c(), Uri.parse("tantan://webview?url=" + strD3));
        o6j0.c("e_blindbox_entrance", "p_messages_view", new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: e */
    public void m4902e(Conversation conversation) {
        final GrowthBlindBoxInfo growthBlindBoxInfoD3 = CoreModule.c.S1.D3();
        this.f3582c.setTypeface(Typeface.defaultFromStyle(1));
        this.f3582c.setText(growthBlindBoxInfoD3.title);
        this.f3583d.setText(growthBlindBoxInfoD3.subTitle);
        if (upa.z()) {
            this.f3580a.setImageResource(x2c0.J5);
        } else if (TextUtils.isEmpty(growthBlindBoxInfoD3.icon)) {
            this.f3580a.setImageResource(x2c0.I5);
        } else {
            qib0.G.L0(this.f3580a, growthBlindBoxInfoD3.icon);
        }
        this.f3584e.setText(mqi0.m18538G(conversation.latestTime));
        m4903f();
        xdl0.E0(this, new View.OnClickListener() { // from class: l.c86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10461a.m4901d(growthBlindBoxInfoD3, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m4903f() {
        if (mqi0.m18550o() - this.f3585f.longValue() <= 500) {
            return;
        }
        this.f3585f = Long.valueOf(mqi0.m18550o());
        o6j0.h("e_blindbox_entrance", "p_messages_view", new o6j0.a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4899b(this);
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
            rd6.m21523v(pi6.f18601Q, this.f3580a);
            rd6.m21518k0(this.f3582c, this.f3584e);
            rd6.m21514e0(this.f3583d);
        }
    }

    public ConversationItemBlindBoxEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3585f = 0L;
    }

    public ConversationItemBlindBoxEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3585f = 0L;
    }
}
