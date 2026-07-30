package com.p051p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
import com.p051p1.mobile.putong.core.data.ChallengeMsgList;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.clz;
import p153l.ehq;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.ovb0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemTestChallengeView extends RelativeLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemTestChallengeView f26544a;

    /* JADX INFO: renamed from: b */
    public VLinear f26545b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f26546c;

    /* JADX INFO: renamed from: d */
    public VText f26547d;

    /* JADX INFO: renamed from: e */
    public VText f26548e;

    /* JADX INFO: renamed from: f */
    public VText f26549f;

    /* JADX INFO: renamed from: g */
    public boolean f26550g;

    public ItemTestChallengeView(Context context) {
        super(context);
        this.f26550g = false;
    }

    /* JADX INFO: renamed from: c */
    private Act m43398c() {
        return (Act) bnl0.m105506D(getContext());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        final ChallengeMsg challengeMsgMo180569y5 = CoreModule.m30933P().m143412i().mo180569y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.m82486a(challengeMsgMo180569y5)) {
            this.f26547d.setTypeface(null, 1);
            this.f26548e.setTypeface(null, 1);
            this.f26549f.setTypeface(null, 1);
            this.f26547d.setText(challengeMsgMo180569y5.title);
            this.f26548e.setText(challengeMsgMo180569y5.subTitle);
            this.f26549f.setText(challengeMsgMo180569y5.buttonText);
            this.f26546c.getHierarchy().m207045H(RoundingParams.m8302b(qa00.m175859d(10.0f), qa00.m175859d(10.0f), 0.0f, 0.0f));
            if (TextUtils.isEmpty(challengeMsgMo180569y5.picUrl)) {
                uqb0.f180374G.m127138Y0(this.f26546c, ibc0.f114161v4);
            } else {
                uqb0.f180374G.m127115L0(this.f26546c, challengeMsgMo180569y5.picUrl);
            }
            bnl0.m105509E0(this.f26544a, new View.OnClickListener() { // from class: l.dhq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88550a.m43402d(challengeMsgMo180569y5, view);
                }
            });
            m43403e(true, challengeMsgMo180569y5.eventlog);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m43401b(View view) {
        ehq.m120852a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m43402d(ChallengeMsg challengeMsg, View view) {
        String str;
        if (m43398c() instanceof MessagesAct) {
            clz<? extends DbObject, ?> clzVarMo50158l = ((MessagesAct) m43398c()).mo50158l();
            if (NullChecker.m82486a(clzVarMo50158l.mo111064x6())) {
                str = clzVarMo50158l.mo111064x6().f56859id;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        CoreModule.m30933P().m143412i().mo180456d5(m43398c(), challengeMsg.link, str, "conversation");
        m43403e(false, challengeMsg.eventlog);
    }

    /* JADX INFO: renamed from: e */
    public final void m43403e(boolean z, String str) {
        if (!z) {
            i4g0.m138523u("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, jyb.m147494Y("in_harmony_test_string", str));
        } else {
            if (this.f26550g) {
                return;
            }
            this.f26550g = true;
            i4g0.m138492A("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, jyb.m147494Y("in_harmony_test_string", str));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43401b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f26548e.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f26549f.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26550g = false;
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26550g = false;
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f26550g = false;
    }
}
