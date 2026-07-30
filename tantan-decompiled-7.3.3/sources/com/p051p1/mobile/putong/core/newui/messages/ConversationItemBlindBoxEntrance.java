package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.i96;
import p153l.nae0;
import p153l.pzi0;
import p153l.s7a;
import p153l.sfj0;
import p153l.sj6;
import p153l.ue6;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemBlindBoxEntrance extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25544a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f25545b;

    /* JADX INFO: renamed from: c */
    public VText f25546c;

    /* JADX INFO: renamed from: d */
    public VText f25547d;

    /* JADX INFO: renamed from: e */
    public TextView f25548e;

    /* JADX INFO: renamed from: f */
    public Long f25549f;

    public ConversationItemBlindBoxEntrance(Context context) {
        super(context);
        this.f25549f = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m41812b(View view) {
        i96.m139081a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m41813c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m41814d(GrowthBlindBoxInfo growthBlindBoxInfo, View view) {
        String strM192261d3 = s7a.m184997z() ? CoreModule.f18264c.f20389g2.m192261d3(growthBlindBoxInfo.h5URL) : growthBlindBoxInfo.h5URL;
        if (TextUtils.isEmpty(strM192261d3)) {
            return;
        }
        nae0.m162083m(m41813c(), Uri.parse("tantan://webview?url=" + strM192261d3));
        sfj0.m185596c("e_blindbox_entrance", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: e */
    public void m41815e(Conversation conversation) {
        final GrowthBlindBoxInfo growthBlindBoxInfoM113537D3 = CoreModule.f18264c.f20347S1.m113537D3();
        this.f25546c.setTypeface(Typeface.defaultFromStyle(1));
        this.f25546c.setText(growthBlindBoxInfoM113537D3.title);
        this.f25547d.setText(growthBlindBoxInfoM113537D3.subTitle);
        if (gra.m131778z()) {
            this.f25544a.setImageResource(dbc0.f86302K5);
        } else if (TextUtils.isEmpty(growthBlindBoxInfoM113537D3.icon)) {
            this.f25544a.setImageResource(dbc0.f86270J5);
        } else {
            uqb0.f180374G.m127115L0(this.f25544a, growthBlindBoxInfoM113537D3.icon);
        }
        this.f25548e.setText(pzi0.m174442G(conversation.latestTime));
        m41816f();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.h96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108319a.m41814d(growthBlindBoxInfoM113537D3, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m41816f() {
        if (pzi0.m174454o() - this.f25549f.longValue() <= 500) {
            return;
        }
        this.f25549f = Long.valueOf(pzi0.m174454o());
        sfj0.m185601h("e_blindbox_entrance", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41812b(this);
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
            ue6.m195676v(sj6.f168905Q, this.f25544a);
            ue6.m195671k0(this.f25546c, this.f25548e);
            ue6.m195667e0(this.f25547d);
        }
    }

    public ConversationItemBlindBoxEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25549f = 0L;
    }

    public ConversationItemBlindBoxEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25549f = 0L;
    }
}
