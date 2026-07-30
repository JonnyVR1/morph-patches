package com.p051p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
import com.p051p1.mobile.putong.core.data.ChallengeMsgList;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c7q;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.qa00;
import p153l.r1j0;
import p153l.uqb0;
import p153l.ux6;

/* JADX INFO: loaded from: classes11.dex */
public class ItemInviteChallengeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemInviteChallengeView f26537a;

    /* JADX INFO: renamed from: b */
    public VLinear f26538b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f26539c;

    /* JADX INFO: renamed from: d */
    public VText f26540d;

    /* JADX INFO: renamed from: e */
    public VText f26541e;

    /* JADX INFO: renamed from: f */
    public VText f26542f;

    /* JADX INFO: renamed from: g */
    public boolean f26543g;

    public ItemInviteChallengeView(Context context) {
        super(context);
        this.f26543g = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m43393b(View view) {
        c7q.m108323a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m43394c(User user, Act act, ChallengeMsg challengeMsg, View view) {
        if (!user.isAccountCancellation()) {
            CoreModule.m30933P().m143412i().mo180456d5(act, challengeMsg.link, user.f56859id, "conversation");
            m43396e(false, challengeMsg.eventlog);
        } else if (user.isDelIn()) {
            r1j0.m179420g("我暂时离开几天~");
        } else if (user.isDelOut()) {
            r1j0.m179420g("对方已注销");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m43395d(final Act act, final User user, Message message) {
        if (user == null) {
            return;
        }
        final ChallengeMsg challengeMsgMo180569y5 = CoreModule.m30933P().m143412i().mo180569y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.m82486a(challengeMsgMo180569y5)) {
            bnl0.m105548c0(this.f26537a, qa00.f156330q);
            this.f26540d.setText(challengeMsgMo180569y5.title);
            this.f26541e.setText(challengeMsgMo180569y5.subTitle);
            this.f26542f.setText(challengeMsgMo180569y5.buttonText);
            this.f26540d.setTypeface(null, 1);
            this.f26542f.setTypeface(null, 1);
            if (user.isAccountCancellation()) {
                uqb0.f180374G.m127138Y0(this.f26539c, CoreModule.m30933P().m143412i().mo180398T0());
            } else if (user.onlineMatchLocked()) {
                uqb0.f180374G.m127120O(this.f26539c, ux6.m198403a(user).profileSmall().formatted(), 2, 10);
            } else {
                Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
                if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isAnonymous()) {
                    uqb0.f180374G.m127115L0(this.f26539c, user.getAnonymousUrl());
                } else {
                    uqb0.f180374G.m127115L0(this.f26539c, ux6.m198403a(user).profileSmall().formatted());
                }
            }
            bnl0.m105509E0(this.f26542f, new View.OnClickListener() { // from class: l.b7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f75331a.m43394c(user, act, challengeMsgMo180569y5, view);
                }
            });
            m43396e(true, challengeMsgMo180569y5.eventlog);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m43396e(boolean z, String str) {
        if (!z) {
            i4g0.m138523u("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, jyb.m147494Y("in_harmony_test_string", str));
        } else {
            if (this.f26543g) {
                return;
            }
            this.f26543g = true;
            i4g0.m138492A("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, jyb.m147494Y("in_harmony_test_string", str));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43393b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f26540d.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f26541e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f26542f.setBackgroundResource(ibc0.f114138t);
        }
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26543g = false;
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26543g = false;
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f26543g = false;
    }
}
