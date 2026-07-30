package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.messages.ConversationHeadLikerItemLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MonetizationChatSeeUser;
import java.util.ArrayList;
import l.j760;
import l.k76;
import l.qib0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationHeadLikerItemLayout extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame f3511a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3512b;

    /* JADX INFO: renamed from: c */
    public VFrame f3513c;

    /* JADX INFO: renamed from: d */
    public VImage f3514d;

    /* JADX INFO: renamed from: e */
    public VText f3515e;

    /* JADX INFO: renamed from: f */
    public VText f3516f;

    public ConversationHeadLikerItemLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m4834p(Act act, ConversationHeadRecommendLayout.C0279c c0279c, View view) {
        zvf0.u("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", "2"), vwb.Y("nomatch_guide_type", "see")});
        act.startActivityWithCustomTransition(CoreModule.P().a().n8(act, vwb.f0(new String[]{c0279c.f3555d}), CoreModule.P().a().h7(), new ArrayList(), "p_message,nomatch_guide"), CoreModule.P().a().hg(act));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4835s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m4835s(View view) {
        k76.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public void m4836u(final Act act, final ConversationHeadRecommendLayout.C0279c c0279c) {
        MonetizationChatSeeUser monetizationChatSeeUser = c0279c.f3549A;
        if (monetizationChatSeeUser == null) {
            return;
        }
        qib0.G.O(this.f3512b, monetizationChatSeeUser.avatar, 4, 35);
        this.f3514d.setImageResource(x2c0.s8);
        this.f3515e.setText(monetizationChatSeeUser.title);
        this.f3516f.setText(monetizationChatSeeUser.subTitle);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.j76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationHeadLikerItemLayout.m4834p(act, c0279c, view);
            }
        });
        zvf0.A("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", "2"), vwb.Y("nomatch_guide_type", "see")});
    }

    public ConversationHeadLikerItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationHeadLikerItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
