package com.p046p1.mobile.putong.core.newui.partner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.f6c0;
import p149l.j760;
import p149l.qib0;
import p149l.u4c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ChatPartnerUserItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f26349a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f26350b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f26351c;

    /* JADX INFO: renamed from: d */
    public boolean f26352d;

    /* JADX INFO: renamed from: e */
    public ChatPartnerHistoryData f26353e;

    public ChatPartnerUserItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26352d = true;
        LayoutInflater.from(getContext()).inflate(f6c0.f95853k1, (ViewGroup) this, true);
        this.f26349a = (VDraweeView) findViewById(u4c0.f173954O);
        this.f26350b = (VDraweeView) findViewById(u4c0.f174238f1);
        this.f26351c = (VText_Bold) findViewById(u4c0.f173861I8);
    }

    /* JADX INFO: renamed from: u */
    private void m43113u() {
        this.f26350b.setImageResource(this.f26352d ? x2c0.f190320l5 : x2c0.f190352m5);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m43114s(ChatPartnerHistoryData chatPartnerHistoryData, View view) {
        this.f26352d = !this.f26352d;
        zvf0.m220399u("e_avatar_choose", "p_chatting_partner_signal_result", j760.m140076a("other_uid", chatPartnerHistoryData.f20368id), j760.m140076a("choose_type", Integer.valueOf(this.f26352d ? 1 : 0)));
        m43113u();
    }

    /* JADX INFO: renamed from: v */
    public void m43115v(final ChatPartnerHistoryData chatPartnerHistoryData) {
        if (chatPartnerHistoryData == null) {
            return;
        }
        xdl0.m208344M(this, true);
        this.f26353e = chatPartnerHistoryData;
        qib0.f154691G.m102331L0(this.f26349a, chatPartnerHistoryData.avatarUrl);
        this.f26351c.setText(chatPartnerHistoryData.name);
        m43113u();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.e15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88708a.m43114s(chatPartnerHistoryData, view);
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
