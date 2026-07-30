package com.p000p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChallengeMsg;
import com.p1.mobile.putong.core.data.ChallengeMsgList;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.a;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.efq;
import l.fcz;
import l.j760;
import l.knb0;
import l.qib0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ItemTestChallengeView extends RelativeLayout implements a {

    /* JADX INFO: renamed from: a */
    public ItemTestChallengeView f4580a;

    /* JADX INFO: renamed from: b */
    public VLinear f4581b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4582c;

    /* JADX INFO: renamed from: d */
    public VText f4583d;

    /* JADX INFO: renamed from: e */
    public VText f4584e;

    /* JADX INFO: renamed from: f */
    public VText f4585f;

    /* JADX INFO: renamed from: g */
    public boolean f4586g;

    public ItemTestChallengeView(Context context) {
        super(context);
        this.f4586g = false;
    }

    /* JADX INFO: renamed from: c */
    private Act m6542c() {
        return xdl0.D(getContext());
    }

    /* JADX INFO: renamed from: A */
    public void m6543A(Message message) {
        final ChallengeMsg challengeMsgY5 = CoreModule.P().i().y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.a(challengeMsgY5)) {
            this.f4583d.setTypeface((Typeface) null, 1);
            this.f4584e.setTypeface((Typeface) null, 1);
            this.f4585f.setTypeface((Typeface) null, 1);
            this.f4583d.setText(challengeMsgY5.title);
            this.f4584e.setText(challengeMsgY5.subTitle);
            this.f4585f.setText(challengeMsgY5.buttonText);
            this.f4582c.getHierarchy().H(RoundingParams.b(t100.d(10.0f), t100.d(10.0f), 0.0f, 0.0f));
            if (TextUtils.isEmpty(challengeMsgY5.picUrl)) {
                qib0.G.Y0(this.f4582c, c3c0.v4);
            } else {
                qib0.G.L0(this.f4582c, challengeMsgY5.picUrl);
            }
            xdl0.E0(this.f4580a, new View.OnClickListener() { // from class: l.dfq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11826a.m6546d(challengeMsgY5, view);
                }
            });
            m6547e(true, challengeMsgY5.eventlog);
        }
    }

    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> m6544J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m6545b(View view) {
        efq.a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m6546d(ChallengeMsg challengeMsg, View view) {
        String str;
        if (m6542c() instanceof MessagesAct) {
            fcz fczVarL = m6542c().l();
            if (NullChecker.a(fczVarL.x6())) {
                str = ((DbObject) fczVarL.x6()).id;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        CoreModule.P().i().d5(m6542c(), challengeMsg.link, str, "conversation");
        m6547e(false, challengeMsg.eventlog);
    }

    /* JADX INFO: renamed from: e */
    public final void m6547e(boolean z, String str) {
        if (!z) {
            zvf0.u("e_in_harmony_test_entrance1_messege_card", "p_chat_view", new j760[]{vwb.Y("in_harmony_test_string", str)});
        } else {
            if (this.f4586g) {
                return;
            }
            this.f4586g = true;
            zvf0.A("e_in_harmony_test_entrance1_messege_card", "p_chat_view", new j760[]{vwb.Y("in_harmony_test_string", str)});
        }
    }

    /* JADX INFO: renamed from: m */
    public void m6548m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6545b(this);
        if (ura.e().d().I4()) {
            this.f4584e.setTextColor(getResources().getColor(a1c0.g));
            this.f4585f.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4586g = false;
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4586g = false;
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4586g = false;
    }
}
