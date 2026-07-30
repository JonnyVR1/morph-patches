package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d86;
import p149l.g6a;
import p149l.j2e0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.pi6;
import p149l.qib0;
import p149l.rd6;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemBlindBoxEntrance extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24802a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f24803b;

    /* JADX INFO: renamed from: c */
    public VText f24804c;

    /* JADX INFO: renamed from: d */
    public VText f24805d;

    /* JADX INFO: renamed from: e */
    public TextView f24806e;

    /* JADX INFO: renamed from: f */
    public Long f24807f;

    public ConversationItemBlindBoxEntrance(Context context) {
        super(context);
        this.f24807f = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m40801b(View view) {
        d86.m110271a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m40802c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m40803d(GrowthBlindBoxInfo growthBlindBoxInfo, View view) {
        String strM122571d3 = g6a.m124577z() ? CoreModule.f17545c.f19647g2.m122571d3(growthBlindBoxInfo.h5URL) : growthBlindBoxInfo.h5URL;
        if (TextUtils.isEmpty(strM122571d3)) {
            return;
        }
        j2e0.m139446m(m40802c(), Uri.parse("tantan://webview?url=" + strM122571d3));
        o6j0.m162859c("e_blindbox_entrance", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: e */
    public void m40804e(Conversation conversation) {
        final GrowthBlindBoxInfo growthBlindBoxInfoM200713D3 = CoreModule.f17545c.f19605S1.m200713D3();
        this.f24804c.setTypeface(Typeface.defaultFromStyle(1));
        this.f24804c.setText(growthBlindBoxInfoM200713D3.title);
        this.f24805d.setText(growthBlindBoxInfoM200713D3.subTitle);
        if (upa.m194847z()) {
            this.f24802a.setImageResource(x2c0.f189444J5);
        } else if (TextUtils.isEmpty(growthBlindBoxInfoM200713D3.icon)) {
            this.f24802a.setImageResource(x2c0.f189413I5);
        } else {
            qib0.f154691G.m102331L0(this.f24802a, growthBlindBoxInfoM200713D3.icon);
        }
        this.f24806e.setText(mqi0.m155932G(conversation.latestTime));
        m40805f();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.c86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79699a.m40803d(growthBlindBoxInfoM200713D3, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m40805f() {
        if (mqi0.m155944o() - this.f24807f.longValue() <= 500) {
            return;
        }
        this.f24807f = Long.valueOf(mqi0.m155944o());
        o6j0.m162864h("e_blindbox_entrance", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40801b(this);
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
            rd6.m178882v(pi6.f149080Q, this.f24802a);
            rd6.m178877k0(this.f24804c, this.f24806e);
            rd6.m178873e0(this.f24805d);
        }
    }

    public ConversationItemBlindBoxEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24807f = 0L;
    }

    public ConversationItemBlindBoxEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24807f = 0L;
    }
}
