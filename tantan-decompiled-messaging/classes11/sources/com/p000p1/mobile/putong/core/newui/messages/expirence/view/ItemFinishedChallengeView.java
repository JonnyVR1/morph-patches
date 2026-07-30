package com.p000p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChallengeMsg;
import com.p1.mobile.putong.core.data.ChallengeMsgList;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.j760;
import l.q3q;
import l.qib0;
import l.qsz;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p009l.lfc0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ItemFinishedChallengeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemFinishedChallengeView f4567a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f4568b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4569c;

    /* JADX INFO: renamed from: d */
    public VText f4570d;

    /* JADX INFO: renamed from: e */
    public VText f4571e;

    /* JADX INFO: renamed from: f */
    public VText f4572f;

    public ItemFinishedChallengeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m6530c(View view) {
        q3q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m6531d(ChallengeMsg challengeMsg, qsz qszVar, Act act, User user, View view) {
        if (TextUtils.equals(challengeMsg.source, "murderMystery")) {
            m6534g(false, challengeMsg.eventlog, qszVar);
        } else {
            if (TextUtils.isEmpty(challengeMsg.link)) {
                return;
            }
            CoreModule.P().a().d5(act, challengeMsg.link, ((DbObject) user).id, "conversation");
            m6535h(false, challengeMsg.eventlog, qszVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m6532e(Message message, Act act, View view) {
        lfc0.m17874i(message, this.f4568b, act);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m6533f(final Act act, final Message message, final User user, final qsz qszVar) {
        final ChallengeMsg challengeMsgY5 = CoreModule.P().i().y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.a(challengeMsgY5)) {
            xdl0.c0(this.f4567a, t100.q);
            this.f4570d.setTextSize(15.0f);
            this.f4570d.setText(challengeMsgY5.title);
            this.f4571e.setText(challengeMsgY5.subTitle);
            if (TextUtils.isEmpty(challengeMsgY5.buttonText) || !TextUtils.equals(challengeMsgY5.type, "stripes")) {
                xdl0.M(this.f4572f, false);
            } else {
                this.f4572f.setText(challengeMsgY5.buttonText);
                this.f4572f.setIncludeFontPadding(true);
                VText vText = this.f4572f;
                int i = t100.j;
                vText.setPadding(i, t100.d(7.0f), i, t100.d(7.0f));
                this.f4572f.setTypeface((Typeface) null, 1);
                xdl0.M(this.f4572f, true);
            }
            xdl0.X(this.f4571e, t100.d(7.0f));
            this.f4570d.setTypeface((Typeface) null, 1);
            qib0.G.Y0(this.f4569c, ura.e().d().I4() ? c3c0.T5 : c3c0.S5);
            if (!TextUtils.isEmpty(challengeMsgY5.picUrl)) {
                qib0.G.L0(this.f4569c, challengeMsgY5.picUrl);
            }
            xdl0.E0(this.f4568b, new View.OnClickListener() { // from class: l.o3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17820a.m6531d(challengeMsgY5, qszVar, act, user, view);
                }
            });
            boolean zEquals = TextUtils.equals(challengeMsgY5.source, "murderMystery");
            String str = challengeMsgY5.eventlog;
            if (zEquals) {
                m6534g(true, str, qszVar);
            } else {
                m6535h(true, str, qszVar);
            }
            if (message.isMe()) {
                this.f4568b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.p3q
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.f18378a.m6532e(message, act, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6534g(boolean z, String str, qsz qszVar) {
        if (!z) {
            zvf0.r(str, "p_chat_view");
        } else {
            if (qszVar.a(str)) {
                return;
            }
            qszVar.b(str);
            zvf0.x(str, "p_chat_view");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6535h(boolean z, String str, qsz qszVar) {
        if (!z) {
            zvf0.u("e_in_harmony_test_entrance1_messege_card", "p_chat_view", new j760[]{vwb.Y("in_harmony_test_string", str)});
        } else {
            if (qszVar.a("FINISH_CHALLENGE_MV_KEY")) {
                return;
            }
            qszVar.b("FINISH_CHALLENGE_MV_KEY");
            zvf0.A("e_in_harmony_test_entrance1_messege_card", "p_chat_view", new j760[]{vwb.Y("in_harmony_test_string", str)});
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6530c(this);
        if (ura.e().d().I4()) {
            int i = t100.z;
            xdl0.D0(i, new View[]{this.f4569c});
            xdl0.C0(this.f4569c, i);
            xdl0.N(this.f4569c, c3c0.T5);
            this.f4570d.setTextColor(getResources().getColor(a1c0.g));
            this.f4571e.setTextColor(getResources().getColor(a1c0.i));
            this.f4572f.setBackgroundResource(c3c0.t);
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
