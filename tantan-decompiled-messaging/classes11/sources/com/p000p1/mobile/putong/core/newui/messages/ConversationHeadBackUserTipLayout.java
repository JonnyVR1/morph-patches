package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationHeadBackUserTipLayout;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.GrowthMesInfo;
import com.p1.mobile.putong.core.data.GrowthMesUser;
import java.util.List;
import l.e76;
import l.eqh0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationHeadBackUserTipLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public VImage f3500d;

    /* JADX INFO: renamed from: e */
    public View f3501e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3502f;

    /* JADX INFO: renamed from: g */
    public View f3503g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f3504h;

    /* JADX INFO: renamed from: i */
    public TextView f3505i;

    /* JADX INFO: renamed from: j */
    public TextView f3506j;

    public ConversationHeadBackUserTipLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m4815p(Act act, GrowthMesInfo growthMesInfo, View view) {
        zvf0.r("e_message_recall_event", "p_messages_view");
        Intent intentM10585c2 = MkWebViewAct.m10585c2(act, "", growthMesInfo.link, true, true, null);
        intentM10585c2.putExtra("hideNotch", true);
        act.startActivity(intentM10585c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4816q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m4816q(View view) {
        e76.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m4817z(final Act act, ConversationHeadRecommendLayout.C0279c c0279c) {
        final GrowthMesInfo growthMesInfo = c0279c.f3550B;
        if (growthMesInfo == null) {
            return;
        }
        zvf0.x("e_message_recall_event", "p_messages_view");
        List list = growthMesInfo.mesUsers;
        if (!vwb.J(list)) {
            if (list.size() >= 2) {
                xdl0.M(this.f3501e, true);
                xdl0.M(this.f3502f, true);
                xdl0.M(this.f3503g, true);
                xdl0.M(this.f3504h, true);
                qib0.G.L0(this.f3504h, ((GrowthMesUser) list.get(1)).avatar);
            } else if (list.size() == 1) {
                xdl0.M(this.f3502f, true);
                xdl0.M(this.f3501e, true);
                xdl0.M(this.f3504h, false);
                xdl0.M(this.f3503g, false);
            }
            qib0.G.L0(this.f3502f, ((GrowthMesUser) list.get(0)).avatar);
        }
        String str = growthMesInfo.title;
        String str2 = growthMesInfo.content;
        this.f3505i.setText(str);
        this.f3505i.setTypeface(eqh0.c(3), 0);
        this.f3506j.setText(str2);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.d76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationHeadBackUserTipLayout.m4815p(act, growthMesInfo, view);
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
