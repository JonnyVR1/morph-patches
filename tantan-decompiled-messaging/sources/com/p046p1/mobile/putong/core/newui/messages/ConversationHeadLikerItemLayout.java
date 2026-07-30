package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MonetizationChatSeeUser;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadLikerItemLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.k76;
import p149l.qib0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationHeadLikerItemLayout extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame f24733a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24734b;

    /* JADX INFO: renamed from: c */
    public VFrame f24735c;

    /* JADX INFO: renamed from: d */
    public VImage f24736d;

    /* JADX INFO: renamed from: e */
    public VText f24737e;

    /* JADX INFO: renamed from: f */
    public VText f24738f;

    public ConversationHeadLikerItemLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m40739p(Act act, ConversationHeadRecommendLayout.C8115c c8115c, View view) {
        zvf0.m220399u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", "2"), vwb.m200311Y("nomatch_guide_type", "see"));
        act.startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(act, vwb.m200324f0(c8115c.f24777d), CoreModule.m29935P().m94651a().mo33508h7(), new ArrayList<>(), "p_message,nomatch_guide"), CoreModule.m29935P().m94651a().mo33512hg(act));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40740s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m40740s(View view) {
        k76.m144648a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m40741u(final Act act, final ConversationHeadRecommendLayout.C8115c c8115c) {
        MonetizationChatSeeUser monetizationChatSeeUser = c8115c.f24771A;
        if (monetizationChatSeeUser == null) {
            return;
        }
        qib0.f154691G.m102336O(this.f24734b, monetizationChatSeeUser.avatar, 4, 35);
        this.f24736d.setImageResource(x2c0.f190547s8);
        this.f24737e.setText(monetizationChatSeeUser.title);
        this.f24738f.setText(monetizationChatSeeUser.subTitle);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.j76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationHeadLikerItemLayout.m40739p(act, c8115c, view);
            }
        });
        zvf0.m220368A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", "2"), vwb.m200311Y("nomatch_guide_type", "see"));
    }

    public ConversationHeadLikerItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationHeadLikerItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
