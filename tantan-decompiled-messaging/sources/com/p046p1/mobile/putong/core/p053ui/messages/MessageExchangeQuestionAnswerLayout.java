package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.breaking.SwapAnswerBottomSheetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageExchangeQuestionAnswerLayout;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p149l.a1c0;
import p149l.b86;
import p149l.bpz;
import p149l.c3c0;
import p149l.c4z;
import p149l.j760;
import p149l.ura;
import p149l.vwb;
import p149l.wmz;
import p149l.xdl0;
import p149l.y19;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageExchangeQuestionAnswerLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f31593c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f31594d;

    /* JADX INFO: renamed from: e */
    public VImage f31595e;

    /* JADX INFO: renamed from: f */
    public VText_Medium f31596f;

    /* JADX INFO: renamed from: g */
    public VLinear f31597g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f31598h;

    /* JADX INFO: renamed from: i */
    public View f31599i;

    /* JADX INFO: renamed from: j */
    public String f31600j;

    public MessageExchangeQuestionAnswerLayout(Context context) {
        super(context);
        this.f31600j = "";
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m48863Q(bpz bpzVar, final MessagesAct messagesAct, View view) {
        bpzVar.mo103201Q1(true, new Runnable() { // from class: l.a4z
            @Override // java.lang.Runnable
            public final void run() {
                ((wmz) messagesAct.f31640f).m204334Dg();
            }
        });
        zvf0.m220399u("e_close_click", messagesAct.pageId(), j760.m140076a("shortcut_type", Answer.TYPE));
    }

    /* JADX INFO: renamed from: V */
    public final void m48867V(View view) {
        c4z.m105244a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final String m48868W(int i) {
        List<String> listM212144D = y19.m212144D();
        if (vwb.m200296J(listM212144D)) {
            return "如果不需要担忧经济问题，你会选择做什么工作？";
        }
        if (listM212144D.size() == 1) {
            return listM212144D.get(0);
        }
        List listM100757b = b86.m100757b(listM212144D, 1);
        return (!TextUtils.equals(this.f31600j, (CharSequence) listM100757b.get(0)) || i > 3) ? (String) listM100757b.get(0) : m48868W(i + 1);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m48869X(MessagesAct messagesAct) {
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(messagesAct.f31640f.f96911c);
        if (NullChecker.m81303a(userM169524oa)) {
            SwapAnswerBottomSheetAct.m44449D2(messagesAct, userM169524oa.f56011id, this.f31600j);
        }
        ((wmz) messagesAct.f31640f).m204334Dg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m48870Y(bpz bpzVar, final MessagesAct messagesAct, View view) {
        bpzVar.mo103201Q1(true, new Runnable() { // from class: l.b4z
            @Override // java.lang.Runnable
            public final void run() {
                this.f73425a.m48869X(messagesAct);
            }
        });
        zvf0.m220399u("e_change_now", messagesAct.pageId(), j760.m140076a("answer_write", this.f31600j));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m48871Z(MessagesAct messagesAct, View view) {
        m48873b0();
        zvf0.m220399u("e_change_one", messagesAct.pageId(), j760.m140076a("answer_write", this.f31600j));
    }

    /* JADX INFO: renamed from: a0 */
    public void m48872a0(final MessagesAct messagesAct, final bpz bpzVar) {
        xdl0.m208329E0(this.f31595e, new View.OnClickListener() { // from class: l.x3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageExchangeQuestionAnswerLayout.m48863Q(bpzVar, messagesAct, view);
            }
        });
        xdl0.m208329E0(this.f31598h, new View.OnClickListener() { // from class: l.y3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195882a.m48870Y(bpzVar, messagesAct, view);
            }
        });
        xdl0.m208329E0(this.f31599i, new View.OnClickListener() { // from class: l.z3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201426a.m48871Z(messagesAct, view);
            }
        });
        m48873b0();
        zvf0.m220368A("e_exchange_answer_shortcut", messagesAct.pageId(), j760.m140076a("answer_write", this.f31600j));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m48873b0() {
        String strM48868W = m48868W(0);
        this.f31600j = strM48868W;
        this.f31596f.setText(strM48868W);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48867V(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f31593c, c3c0.f78475A7);
            xdl0.m208346N(this.f31595e, c3c0.f78817n7);
            this.f31594d.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31596f.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31598h.setTextColor(getResources().getColor(a1c0.f67156j));
            this.f31599i.setBackgroundResource(c3c0.f78484B7);
        }
    }

    public MessageExchangeQuestionAnswerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31600j = "";
    }

    public MessageExchangeQuestionAnswerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31600j = "";
    }
}
