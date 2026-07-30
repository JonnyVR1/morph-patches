package com.p051p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
import com.p051p1.mobile.putong.core.data.ChallengeMsgList;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.n100;
import p153l.q5q;
import p153l.qa00;
import p153l.snc0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemFinishedChallengeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemFinishedChallengeView f26531a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f26532b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f26533c;

    /* JADX INFO: renamed from: d */
    public VText f26534d;

    /* JADX INFO: renamed from: e */
    public VText f26535e;

    /* JADX INFO: renamed from: f */
    public VText f26536f;

    public ItemFinishedChallengeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m43386c(View view) {
        q5q.m175510a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m43387d(ChallengeMsg challengeMsg, n100 n100Var, Act act, User user, View view) {
        if (TextUtils.equals(challengeMsg.source, "murderMystery")) {
            m43390g(false, challengeMsg.eventlog, n100Var);
        } else {
            if (TextUtils.isEmpty(challengeMsg.link)) {
                return;
            }
            CoreModule.m30933P().m143405a().mo180456d5(act, challengeMsg.link, user.f56859id, "conversation");
            m43391h(false, challengeMsg.eventlog, n100Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m43388e(Message message, Act act, View view) {
        snc0.m186897i(message, this.f26532b, act);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m43389f(final Act act, final Message message, final User user, final n100 n100Var) {
        final ChallengeMsg challengeMsgMo180569y5 = CoreModule.m30933P().m143412i().mo180569y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.m82486a(challengeMsgMo180569y5)) {
            bnl0.m105548c0(this.f26531a, qa00.f156330q);
            this.f26534d.setTextSize(15.0f);
            this.f26534d.setText(challengeMsgMo180569y5.title);
            this.f26535e.setText(challengeMsgMo180569y5.subTitle);
            if (TextUtils.isEmpty(challengeMsgMo180569y5.buttonText) || !TextUtils.equals(challengeMsgMo180569y5.type, MessageType.stripes)) {
                bnl0.m105524M(this.f26536f, false);
            } else {
                this.f26536f.setText(challengeMsgMo180569y5.buttonText);
                this.f26536f.setIncludeFontPadding(true);
                VText vText = this.f26536f;
                int i = qa00.f156323j;
                vText.setPadding(i, qa00.m175859d(7.0f), i, qa00.m175859d(7.0f));
                this.f26536f.setTypeface(null, 1);
                bnl0.m105524M(this.f26536f, true);
            }
            bnl0.m105540X(this.f26535e, qa00.m175859d(7.0f));
            this.f26534d.setTypeface(null, 1);
            uqb0.f180374G.m127138Y0(this.f26533c, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113917T5 : ibc0.f113909S5);
            if (!TextUtils.isEmpty(challengeMsgMo180569y5.picUrl)) {
                uqb0.f180374G.m127115L0(this.f26533c, challengeMsgMo180569y5.picUrl);
            }
            bnl0.m105509E0(this.f26532b, new View.OnClickListener() { // from class: l.o5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145098a.m43387d(challengeMsgMo180569y5, n100Var, act, user, view);
                }
            });
            boolean zEquals = TextUtils.equals(challengeMsgMo180569y5.source, "murderMystery");
            String str = challengeMsgMo180569y5.eventlog;
            if (zEquals) {
                m43390g(true, str, n100Var);
            } else {
                m43391h(true, str, n100Var);
            }
            if (message.isMe()) {
                this.f26532b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.p5q
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.f150668a.m43388e(message, act, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m43390g(boolean z, String str, n100 n100Var) {
        if (!z) {
            i4g0.m138520r(str, OMSDialogPositon.p_chat_view);
        } else {
            if (n100Var.m161054a(str)) {
                return;
            }
            n100Var.m161055b(str);
            i4g0.m138526x(str, OMSDialogPositon.p_chat_view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m43391h(boolean z, String str, n100 n100Var) {
        if (!z) {
            i4g0.m138523u("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, jyb.m147494Y("in_harmony_test_string", str));
        } else {
            if (n100Var.m161054a("FINISH_CHALLENGE_MV_KEY")) {
                return;
            }
            n100Var.m161055b("FINISH_CHALLENGE_MV_KEY");
            i4g0.m138492A("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, jyb.m147494Y("in_harmony_test_string", str));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43386c(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            int i = qa00.f156339z;
            bnl0.m105507D0(i, this.f26533c);
            bnl0.m105505C0(this.f26533c, i);
            bnl0.m105526N(this.f26533c, ibc0.f113917T5);
            this.f26534d.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f26535e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f26536f.setBackgroundResource(ibc0.f114138t);
        }
    }

    public ItemFinishedChallengeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFinishedChallengeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ItemFinishedChallengeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
