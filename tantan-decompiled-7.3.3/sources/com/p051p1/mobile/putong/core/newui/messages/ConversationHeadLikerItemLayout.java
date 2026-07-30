package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MonetizationChatSeeUser;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadLikerItemLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.p86;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationHeadLikerItemLayout extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame f25475a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25476b;

    /* JADX INFO: renamed from: c */
    public VFrame f25477c;

    /* JADX INFO: renamed from: d */
    public VImage f25478d;

    /* JADX INFO: renamed from: e */
    public VText f25479e;

    /* JADX INFO: renamed from: f */
    public VText f25480f;

    public ConversationHeadLikerItemLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m41750p(Act act, ConversationHeadRecommendLayout.C8266c c8266c, View view) {
        i4g0.m138523u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", "2"), jyb.m147494Y("nomatch_guide_type", "see"));
        act.startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(act, jyb.m147507f0(c8266c.f25519d), CoreModule.m30933P().m143405a().mo34511h7(), new ArrayList<>(), "p_message,nomatch_guide"), CoreModule.m30933P().m143405a().mo34515hg(act));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41751s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m41751s(View view) {
        p86.m171184a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m41752u(final Act act, final ConversationHeadRecommendLayout.C8266c c8266c) {
        MonetizationChatSeeUser monetizationChatSeeUser = c8266c.f25513A;
        if (monetizationChatSeeUser == null) {
            return;
        }
        uqb0.f180374G.m127120O(this.f25476b, monetizationChatSeeUser.avatar, 4, 35);
        this.f25478d.setImageResource(dbc0.f87441t8);
        this.f25479e.setText(monetizationChatSeeUser.title);
        this.f25480f.setText(monetizationChatSeeUser.subTitle);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.o86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationHeadLikerItemLayout.m41750p(act, c8266c, view);
            }
        });
        i4g0.m138492A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", "2"), jyb.m147494Y("nomatch_guide_type", "see"));
    }

    public ConversationHeadLikerItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationHeadLikerItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
