package com.p000p1.mobile.putong.core.newui.partner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p1.mobile.putong.core.ui.VText_Bold;
import l.f6c0;
import l.j760;
import l.qib0;
import l.u4c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ChatPartnerUserItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5127a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5128b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f5129c;

    /* JADX INFO: renamed from: d */
    public boolean f5130d;

    /* JADX INFO: renamed from: e */
    public ChatPartnerHistoryData f5131e;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatPartnerUserItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5130d = true;
        LayoutInflater.from(getContext()).inflate(f6c0.k1, (ViewGroup) this, true);
        this.f5127a = findViewById(u4c0.O);
        this.f5128b = findViewById(u4c0.f1);
        this.f5129c = findViewById(u4c0.I8);
    }

    /* JADX INFO: renamed from: u */
    private void m7325u() {
        this.f5128b.setImageResource(this.f5130d ? x2c0.l5 : x2c0.m5);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7326s(ChatPartnerHistoryData chatPartnerHistoryData, View view) {
        this.f5130d = !this.f5130d;
        zvf0.u("e_avatar_choose", "p_chatting_partner_signal_result", new j760[]{j760.a("other_uid", chatPartnerHistoryData.id), j760.a("choose_type", Integer.valueOf(this.f5130d ? 1 : 0))});
        m7325u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m7327v(final ChatPartnerHistoryData chatPartnerHistoryData) {
        if (chatPartnerHistoryData == null) {
            return;
        }
        xdl0.M(this, true);
        this.f5131e = chatPartnerHistoryData;
        qib0.G.L0(this.f5127a, chatPartnerHistoryData.avatarUrl);
        this.f5129c.setText(chatPartnerHistoryData.name);
        m7325u();
        xdl0.E0(this, new View.OnClickListener() { // from class: l.e15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12135a.m7326s(chatPartnerHistoryData, view);
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
