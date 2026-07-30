package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.GrowthMesInfo;
import com.p051p1.mobile.putong.core.data.GrowthMesUser;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadBackUserTipLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p153l.bnl0;
import p153l.i4g0;
import p153l.j86;
import p153l.jyb;
import p153l.lyh0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationHeadBackUserTipLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public VImage f25464d;

    /* JADX INFO: renamed from: e */
    public View f25465e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f25466f;

    /* JADX INFO: renamed from: g */
    public View f25467g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f25468h;

    /* JADX INFO: renamed from: i */
    public TextView f25469i;

    /* JADX INFO: renamed from: j */
    public TextView f25470j;

    public ConversationHeadBackUserTipLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m41731p(Act act, GrowthMesInfo growthMesInfo, View view) {
        i4g0.m138520r("e_message_recall_event", OMSDialogPositon.p_messages_view);
        Intent intentM81421d2 = MkWebViewAct.m81421d2(act, "", growthMesInfo.link, true, true, null);
        intentM81421d2.putExtra("hideNotch", true);
        act.startActivity(intentM81421d2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41732q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m41732q(View view) {
        j86.m143828a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m41733z(final Act act, ConversationHeadRecommendLayout.C8266c c8266c) {
        final GrowthMesInfo growthMesInfo = c8266c.f25514B;
        if (growthMesInfo == null) {
            return;
        }
        i4g0.m138526x("e_message_recall_event", OMSDialogPositon.p_messages_view);
        List<GrowthMesUser> list = growthMesInfo.mesUsers;
        if (!jyb.m147479J(list)) {
            if (list.size() >= 2) {
                bnl0.m105524M(this.f25465e, true);
                bnl0.m105524M(this.f25466f, true);
                bnl0.m105524M(this.f25467g, true);
                bnl0.m105524M(this.f25468h, true);
                uqb0.f180374G.m127115L0(this.f25468h, list.get(1).avatar);
            } else if (list.size() == 1) {
                bnl0.m105524M(this.f25466f, true);
                bnl0.m105524M(this.f25465e, true);
                bnl0.m105524M(this.f25468h, false);
                bnl0.m105524M(this.f25467g, false);
            }
            uqb0.f180374G.m127115L0(this.f25466f, list.get(0).avatar);
        }
        String str = growthMesInfo.title;
        String str2 = growthMesInfo.content;
        this.f25469i.setText(str);
        this.f25469i.setTypeface(lyh0.m156283c(3), 0);
        this.f25470j.setText(str2);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.i86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationHeadBackUserTipLayout.m41731p(act, growthMesInfo, view);
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
