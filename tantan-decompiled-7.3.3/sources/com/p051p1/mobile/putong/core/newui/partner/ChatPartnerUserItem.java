package com.p051p1.mobile.putong.core.newui.partner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.kec0;
import p153l.pf60;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ChatPartnerUserItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f27091a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f27092b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f27093c;

    /* JADX INFO: renamed from: d */
    public boolean f27094d;

    /* JADX INFO: renamed from: e */
    public ChatPartnerHistoryData f27095e;

    public ChatPartnerUserItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27094d = true;
        LayoutInflater.from(getContext()).inflate(kec0.f125907k1, (ViewGroup) this, true);
        this.f27091a = (VDraweeView) findViewById(adc0.f70042O);
        this.f27092b = (VDraweeView) findViewById(adc0.f70329f1);
        this.f27093c = (VText_Bold) findViewById(adc0.f69983K8);
    }

    /* JADX INFO: renamed from: u */
    private void m44124u() {
        this.f27092b.setImageResource(this.f27094d ? dbc0.f87207m5 : dbc0.f87240n5);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m44125s(ChatPartnerHistoryData chatPartnerHistoryData, View view) {
        this.f27094d = !this.f27094d;
        i4g0.m138523u("e_avatar_choose", "p_chatting_partner_signal_result", pf60.m172085a("other_uid", chatPartnerHistoryData.f21110id), pf60.m172085a("choose_type", Integer.valueOf(this.f27094d ? 1 : 0)));
        m44124u();
    }

    /* JADX INFO: renamed from: v */
    public void m44126v(final ChatPartnerHistoryData chatPartnerHistoryData) {
        if (chatPartnerHistoryData == null) {
            return;
        }
        bnl0.m105524M(this, true);
        this.f27095e = chatPartnerHistoryData;
        uqb0.f180374G.m127115L0(this.f27091a, chatPartnerHistoryData.avatarUrl);
        this.f27093c.setText(chatPartnerHistoryData.name);
        m44124u();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.d25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84751a.m44125s(chatPartnerHistoryData, view);
            }
        });
    }

    public ChatPartnerUserItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatPartnerUserItem(Context context) {
        this(context, null);
    }
}
