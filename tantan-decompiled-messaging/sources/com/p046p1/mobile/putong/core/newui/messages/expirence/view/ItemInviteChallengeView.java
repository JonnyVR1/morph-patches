package com.p046p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChallengeMsg;
import com.p046p1.mobile.putong.core.data.ChallengeMsgList;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.c5q;
import p149l.osi0;
import p149l.qib0;
import p149l.rw6;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemInviteChallengeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemInviteChallengeView f25795a;

    /* JADX INFO: renamed from: b */
    public VLinear f25796b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f25797c;

    /* JADX INFO: renamed from: d */
    public VText f25798d;

    /* JADX INFO: renamed from: e */
    public VText f25799e;

    /* JADX INFO: renamed from: f */
    public VText f25800f;

    /* JADX INFO: renamed from: g */
    public boolean f25801g;

    public ItemInviteChallengeView(Context context) {
        super(context);
        this.f25801g = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m42382b(View view) {
        c5q.m105353a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m42383c(User user, Act act, ChallengeMsg challengeMsg, View view) {
        if (!user.isAccountCancellation()) {
            CoreModule.m29935P().m94658i().mo158364d5(act, challengeMsg.link, user.f56011id, "conversation");
            m42385e(false, challengeMsg.eventlog);
        } else if (user.isDelIn()) {
            osi0.m165783g("我暂时离开几天~");
        } else if (user.isDelOut()) {
            osi0.m165783g("对方已注销");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m42384d(final Act act, final User user, Message message) {
        if (user == null) {
            return;
        }
        final ChallengeMsg challengeMsgMo158477y5 = CoreModule.m29935P().m94658i().mo158477y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.m81303a(challengeMsgMo158477y5)) {
            xdl0.m208368c0(this.f25795a, t100.f167268q);
            this.f25798d.setText(challengeMsgMo158477y5.title);
            this.f25799e.setText(challengeMsgMo158477y5.subTitle);
            this.f25800f.setText(challengeMsgMo158477y5.buttonText);
            this.f25798d.setTypeface(null, 1);
            this.f25800f.setTypeface(null, 1);
            if (user.isAccountCancellation()) {
                qib0.f154691G.m102354Y0(this.f25797c, CoreModule.m29935P().m94658i().mo158306T0());
            } else if (user.onlineMatchLocked()) {
                qib0.f154691G.m102336O(this.f25797c, rw6.m181385a(user).profileSmall().formatted(), 2, 10);
            } else {
                Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
                if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isAnonymous()) {
                    qib0.f154691G.m102331L0(this.f25797c, user.getAnonymousUrl());
                } else {
                    qib0.f154691G.m102331L0(this.f25797c, rw6.m181385a(user).profileSmall().formatted());
                }
            }
            xdl0.m208329E0(this.f25800f, new View.OnClickListener() { // from class: l.b5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f73690a.m42383c(user, act, challengeMsgMo158477y5, view);
                }
            });
            m42385e(true, challengeMsgMo158477y5.eventlog);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m42385e(boolean z, String str) {
        if (!z) {
            zvf0.m220399u("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, vwb.m200311Y("in_harmony_test_string", str));
        } else {
            if (this.f25801g) {
                return;
            }
            this.f25801g = true;
            zvf0.m220368A("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, vwb.m200311Y("in_harmony_test_string", str));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42382b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f25798d.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f25799e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f25800f.setBackgroundResource(c3c0.f78863t);
        }
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25801g = false;
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25801g = false;
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f25801g = false;
    }
}
