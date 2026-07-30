package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageExchangeQuestionAnswerLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.breaking.SwapAnswerBottomSheetAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.b86;
import l.c3c0;
import l.c4z;
import l.j760;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y19;
import l.zvf0;
import p003l.bpz;
import p028v.VImage;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageExchangeQuestionAnswerLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f1484c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f1485d;

    /* JADX INFO: renamed from: e */
    public VImage f1486e;

    /* JADX INFO: renamed from: f */
    public VText_Medium f1487f;

    /* JADX INFO: renamed from: g */
    public VLinear f1488g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f1489h;

    /* JADX INFO: renamed from: i */
    public View f1490i;

    /* JADX INFO: renamed from: j */
    public String f1491j;

    public MessageExchangeQuestionAnswerLayout(Context context) {
        super(context);
        this.f1491j = "";
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m1950Q(bpz bpzVar, final MessagesAct messagesAct, View view) {
        bpzVar.mo3081Q1(true, new Runnable() { // from class: l.a4z
            @Override // java.lang.Runnable
            public final void run() {
                messagesAct.f1531f.Dg();
            }
        });
        zvf0.u("e_close_click", messagesAct.pageId(), new j760[]{j760.a("shortcut_type", "answer")});
    }

    /* JADX INFO: renamed from: V */
    public final void m1954V(View view) {
        c4z.a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final String m1955W(int i) {
        List listD = y19.D();
        if (vwb.J(listD)) {
            return "如果不需要担忧经济问题，你会选择做什么工作？";
        }
        if (listD.size() == 1) {
            return (String) listD.get(0);
        }
        List listB = b86.b(listD, 1);
        return (!TextUtils.equals(this.f1491j, (CharSequence) listB.get(0)) || i > 3) ? (String) listB.get(0) : m1955W(i + 1);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m1956X(MessagesAct messagesAct) {
        User userOa = CoreModule.c.e0.oa(messagesAct.f1531f.f3543c);
        if (NullChecker.a(userOa)) {
            SwapAnswerBottomSheetAct.D2(messagesAct, ((DbObject) userOa).id, this.f1491j);
        }
        messagesAct.f1531f.Dg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m1957Y(bpz bpzVar, final MessagesAct messagesAct, View view) {
        bpzVar.mo3081Q1(true, new Runnable() { // from class: l.b4z
            @Override // java.lang.Runnable
            public final void run() {
                this.f2342a.m1956X(messagesAct);
            }
        });
        zvf0.u("e_change_now", messagesAct.pageId(), new j760[]{j760.a("answer_write", this.f1491j)});
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m1958Z(MessagesAct messagesAct, View view) {
        m1960b0();
        zvf0.u("e_change_one", messagesAct.pageId(), new j760[]{j760.a("answer_write", this.f1491j)});
    }

    /* JADX INFO: renamed from: a0 */
    public void m1959a0(final MessagesAct messagesAct, final bpz bpzVar) {
        xdl0.E0(this.f1486e, new View.OnClickListener() { // from class: l.x3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageExchangeQuestionAnswerLayout.m1950Q(bpzVar, messagesAct, view);
            }
        });
        xdl0.E0(this.f1489h, new View.OnClickListener() { // from class: l.y3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8910a.m1957Y(bpzVar, messagesAct, view);
            }
        });
        xdl0.E0(this.f1490i, new View.OnClickListener() { // from class: l.z3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9193a.m1958Z(messagesAct, view);
            }
        });
        m1960b0();
        zvf0.A("e_exchange_answer_shortcut", messagesAct.pageId(), new j760[]{j760.a("answer_write", this.f1491j)});
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1960b0() {
        String strM1955W = m1955W(0);
        this.f1491j = strM1955W;
        this.f1487f.setText(strM1955W);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1954V(this);
        if (ura.e().d().I4()) {
            xdl0.N(this.f1484c, c3c0.A7);
            xdl0.N(this.f1486e, c3c0.n7);
            this.f1485d.setTextColor(getResources().getColor(a1c0.i));
            this.f1487f.setTextColor(getResources().getColor(a1c0.g));
            this.f1489h.setTextColor(getResources().getColor(a1c0.j));
            this.f1490i.setBackgroundResource(c3c0.B7);
        }
    }

    public MessageExchangeQuestionAnswerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1491j = "";
    }

    public MessageExchangeQuestionAnswerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1491j = "";
    }
}
