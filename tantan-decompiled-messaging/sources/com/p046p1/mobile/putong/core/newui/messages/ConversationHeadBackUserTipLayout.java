package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.GrowthMesInfo;
import com.p046p1.mobile.putong.core.data.GrowthMesUser;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadBackUserTipLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p149l.e76;
import p149l.eqh0;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationHeadBackUserTipLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public VImage f24722d;

    /* JADX INFO: renamed from: e */
    public View f24723e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f24724f;

    /* JADX INFO: renamed from: g */
    public View f24725g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f24726h;

    /* JADX INFO: renamed from: i */
    public TextView f24727i;

    /* JADX INFO: renamed from: j */
    public TextView f24728j;

    public ConversationHeadBackUserTipLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m40720p(Act act, GrowthMesInfo growthMesInfo, View view) {
        zvf0.m220396r("e_message_recall_event", OMSDialogPositon.p_messages_view);
        Intent intentM80238c2 = MkWebViewAct.m80238c2(act, "", growthMesInfo.link, true, true, null);
        intentM80238c2.putExtra("hideNotch", true);
        act.startActivity(intentM80238c2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40721q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m40721q(View view) {
        e76.m115181a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m40722z(final Act act, ConversationHeadRecommendLayout.C8115c c8115c) {
        final GrowthMesInfo growthMesInfo = c8115c.f24772B;
        if (growthMesInfo == null) {
            return;
        }
        zvf0.m220402x("e_message_recall_event", OMSDialogPositon.p_messages_view);
        List<GrowthMesUser> list = growthMesInfo.mesUsers;
        if (!vwb.m200296J(list)) {
            if (list.size() >= 2) {
                xdl0.m208344M(this.f24723e, true);
                xdl0.m208344M(this.f24724f, true);
                xdl0.m208344M(this.f24725g, true);
                xdl0.m208344M(this.f24726h, true);
                qib0.f154691G.m102331L0(this.f24726h, list.get(1).avatar);
            } else if (list.size() == 1) {
                xdl0.m208344M(this.f24724f, true);
                xdl0.m208344M(this.f24723e, true);
                xdl0.m208344M(this.f24726h, false);
                xdl0.m208344M(this.f24725g, false);
            }
            qib0.f154691G.m102331L0(this.f24724f, list.get(0).avatar);
        }
        String str = growthMesInfo.title;
        String str2 = growthMesInfo.content;
        this.f24727i.setText(str);
        this.f24727i.setTypeface(eqh0.m117752c(3), 0);
        this.f24728j.setText(str2);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.d76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationHeadBackUserTipLayout.m40720p(act, growthMesInfo, view);
            }
        });
    }

    public ConversationHeadBackUserTipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationHeadBackUserTipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
