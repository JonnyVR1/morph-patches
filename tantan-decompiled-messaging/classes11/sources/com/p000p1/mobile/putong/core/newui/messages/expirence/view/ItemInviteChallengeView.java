package com.p000p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChallengeMsg;
import com.p1.mobile.putong.core.data.ChallengeMsgList;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.c5q;
import l.j760;
import l.osi0;
import l.qib0;
import l.rw6;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ItemInviteChallengeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemInviteChallengeView f4573a;

    /* JADX INFO: renamed from: b */
    public VLinear f4574b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4575c;

    /* JADX INFO: renamed from: d */
    public VText f4576d;

    /* JADX INFO: renamed from: e */
    public VText f4577e;

    /* JADX INFO: renamed from: f */
    public VText f4578f;

    /* JADX INFO: renamed from: g */
    public boolean f4579g;

    public ItemInviteChallengeView(Context context) {
        super(context);
        this.f4579g = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m6537b(View view) {
        c5q.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m6538c(User user, Act act, ChallengeMsg challengeMsg, View view) {
        if (!user.isAccountCancellation()) {
            CoreModule.P().i().d5(act, challengeMsg.link, ((DbObject) user).id, "conversation");
            m6540e(false, challengeMsg.eventlog);
        } else if (user.isDelIn()) {
            osi0.g("我暂时离开几天~");
        } else if (user.isDelOut()) {
            osi0.g("对方已注销");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m6539d(final Act act, final User user, Message message) {
        if (user == null) {
            return;
        }
        final ChallengeMsg challengeMsgY5 = CoreModule.P().i().y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.a(challengeMsgY5)) {
            xdl0.c0(this.f4573a, t100.q);
            this.f4576d.setText(challengeMsgY5.title);
            this.f4577e.setText(challengeMsgY5.subTitle);
            this.f4578f.setText(challengeMsgY5.buttonText);
            this.f4576d.setTypeface((Typeface) null, 1);
            this.f4578f.setTypeface((Typeface) null, 1);
            if (user.isAccountCancellation()) {
                qib0.G.Y0(this.f4575c, CoreModule.P().i().T0());
            } else if (user.onlineMatchLocked()) {
                qib0.G.O(this.f4575c, rw6.a(user).profileSmall().formatted(), 2, 10);
            } else {
                Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
                if (NullChecker.a(conversationXe) && conversationXe.isAnonymous()) {
                    qib0.G.L0(this.f4575c, user.getAnonymousUrl());
                } else {
                    qib0.G.L0(this.f4575c, rw6.a(user).profileSmall().formatted());
                }
            }
            xdl0.E0(this.f4578f, new View.OnClickListener() { // from class: l.b5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9907a.m6538c(user, act, challengeMsgY5, view);
                }
            });
            m6540e(true, challengeMsgY5.eventlog);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6540e(boolean z, String str) {
        if (!z) {
            zvf0.u("e_in_harmony_test_entrance1_messege_card", "p_chat_view", new j760[]{vwb.Y("in_harmony_test_string", str)});
        } else {
            if (this.f4579g) {
                return;
            }
            this.f4579g = true;
            zvf0.A("e_in_harmony_test_entrance1_messege_card", "p_chat_view", new j760[]{vwb.Y("in_harmony_test_string", str)});
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6537b(this);
        if (ura.e().d().I4()) {
            this.f4576d.setTextColor(getResources().getColor(a1c0.g));
            this.f4577e.setTextColor(getResources().getColor(a1c0.i));
            this.f4578f.setBackgroundResource(c3c0.t);
        }
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4579g = false;
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4579g = false;
    }

    public ItemInviteChallengeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4579g = false;
    }
}
