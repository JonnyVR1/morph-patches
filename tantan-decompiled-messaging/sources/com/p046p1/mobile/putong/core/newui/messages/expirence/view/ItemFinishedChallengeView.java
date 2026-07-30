package com.p046p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChallengeMsg;
import com.p046p1.mobile.putong.core.data.ChallengeMsgList;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.lfc0;
import p149l.q3q;
import p149l.qib0;
import p149l.qsz;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemFinishedChallengeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemFinishedChallengeView f25789a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f25790b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f25791c;

    /* JADX INFO: renamed from: d */
    public VText f25792d;

    /* JADX INFO: renamed from: e */
    public VText f25793e;

    /* JADX INFO: renamed from: f */
    public VText f25794f;

    public ItemFinishedChallengeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m42375c(View view) {
        q3q.m172890a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m42376d(ChallengeMsg challengeMsg, qsz qszVar, Act act, User user, View view) {
        if (TextUtils.equals(challengeMsg.source, "murderMystery")) {
            m42379g(false, challengeMsg.eventlog, qszVar);
        } else {
            if (TextUtils.isEmpty(challengeMsg.link)) {
                return;
            }
            CoreModule.m29935P().m94651a().mo158364d5(act, challengeMsg.link, user.f56011id, "conversation");
            m42380h(false, challengeMsg.eventlog, qszVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m42377e(Message message, Act act, View view) {
        lfc0.m149671i(message, this.f25790b, act);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m42378f(final Act act, final Message message, final User user, final qsz qszVar) {
        final ChallengeMsg challengeMsgMo158477y5 = CoreModule.m29935P().m94658i().mo158477y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.m81303a(challengeMsgMo158477y5)) {
            xdl0.m208368c0(this.f25789a, t100.f167268q);
            this.f25792d.setTextSize(15.0f);
            this.f25792d.setText(challengeMsgMo158477y5.title);
            this.f25793e.setText(challengeMsgMo158477y5.subTitle);
            if (TextUtils.isEmpty(challengeMsgMo158477y5.buttonText) || !TextUtils.equals(challengeMsgMo158477y5.type, MessageType.stripes)) {
                xdl0.m208344M(this.f25794f, false);
            } else {
                this.f25794f.setText(challengeMsgMo158477y5.buttonText);
                this.f25794f.setIncludeFontPadding(true);
                VText vText = this.f25794f;
                int i = t100.f167261j;
                vText.setPadding(i, t100.m186890d(7.0f), i, t100.m186890d(7.0f));
                this.f25794f.setTypeface(null, 1);
                xdl0.m208344M(this.f25794f, true);
            }
            xdl0.m208360X(this.f25793e, t100.m186890d(7.0f));
            this.f25792d.setTypeface(null, 1);
            qib0.f154691G.m102354Y0(this.f25791c, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78642T5 : c3c0.f78634S5);
            if (!TextUtils.isEmpty(challengeMsgMo158477y5.picUrl)) {
                qib0.f154691G.m102331L0(this.f25791c, challengeMsgMo158477y5.picUrl);
            }
            xdl0.m208329E0(this.f25790b, new View.OnClickListener() { // from class: l.o3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141698a.m42376d(challengeMsgMo158477y5, qszVar, act, user, view);
                }
            });
            boolean zEquals = TextUtils.equals(challengeMsgMo158477y5.source, "murderMystery");
            String str = challengeMsgMo158477y5.eventlog;
            if (zEquals) {
                m42379g(true, str, qszVar);
            } else {
                m42380h(true, str, qszVar);
            }
            if (message.isMe()) {
                this.f25790b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.p3q
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.f147008a.m42377e(message, act, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m42379g(boolean z, String str, qsz qszVar) {
        if (!z) {
            zvf0.m220396r(str, OMSDialogPositon.p_chat_view);
        } else {
            if (qszVar.m176377a(str)) {
                return;
            }
            qszVar.m176378b(str);
            zvf0.m220402x(str, OMSDialogPositon.p_chat_view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m42380h(boolean z, String str, qsz qszVar) {
        if (!z) {
            zvf0.m220399u("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, vwb.m200311Y("in_harmony_test_string", str));
        } else {
            if (qszVar.m176377a("FINISH_CHALLENGE_MV_KEY")) {
                return;
            }
            qszVar.m176378b("FINISH_CHALLENGE_MV_KEY");
            zvf0.m220368A("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, vwb.m200311Y("in_harmony_test_string", str));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42375c(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            int i = t100.f167277z;
            xdl0.m208327D0(i, this.f25791c);
            xdl0.m208325C0(this.f25791c, i);
            xdl0.m208346N(this.f25791c, c3c0.f78642T5);
            this.f25792d.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f25793e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f25794f.setBackgroundResource(c3c0.f78863t);
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
