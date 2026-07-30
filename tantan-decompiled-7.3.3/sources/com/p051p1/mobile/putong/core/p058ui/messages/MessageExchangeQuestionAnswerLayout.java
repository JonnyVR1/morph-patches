package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.breaking.SwapAnswerBottomSheetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageExchangeQuestionAnswerLayout;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.g96;
import p153l.g9c0;
import p153l.gta;
import p153l.h39;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.pf60;
import p153l.tvz;
import p153l.yxz;
import p153l.zcz;

/* JADX INFO: loaded from: classes3.dex */
public class MessageExchangeQuestionAnswerLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f32441c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f32442d;

    /* JADX INFO: renamed from: e */
    public VImage f32443e;

    /* JADX INFO: renamed from: f */
    public VText_Medium f32444f;

    /* JADX INFO: renamed from: g */
    public VLinear f32445g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f32446h;

    /* JADX INFO: renamed from: i */
    public View f32447i;

    /* JADX INFO: renamed from: j */
    public String f32448j;

    public MessageExchangeQuestionAnswerLayout(Context context) {
        super(context);
        this.f32448j = "";
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m50046Q(yxz yxzVar, final MessagesAct messagesAct, View view) {
        yxzVar.mo178911Q1(true, new Runnable() { // from class: l.xcz
            @Override // java.lang.Runnable
            public final void run() {
                ((tvz) messagesAct.f32488f).m193122Dg();
            }
        });
        i4g0.m138523u("e_close_click", messagesAct.pageId(), pf60.m172085a("shortcut_type", Answer.TYPE));
    }

    /* JADX INFO: renamed from: V */
    public final void m50050V(View view) {
        zcz.m219271a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final String m50051W(int i) {
        List<String> listM133415D = h39.m133415D();
        if (jyb.m147479J(listM133415D)) {
            return "如果不需要担忧经济问题，你会选择做什么工作？";
        }
        if (listM133415D.size() == 1) {
            return listM133415D.get(0);
        }
        List listM129515b = g96.m129515b(listM133415D, 1);
        return (!TextUtils.equals(this.f32448j, (CharSequence) listM129515b.get(0)) || i > 3) ? (String) listM129515b.get(0) : m50051W(i + 1);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m50052X(MessagesAct messagesAct) {
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(messagesAct.f32488f.f82474c);
        if (NullChecker.m82486a(userM116597oa)) {
            SwapAnswerBottomSheetAct.m45633E2(messagesAct, userM116597oa.f56859id, this.f32448j);
        }
        ((tvz) messagesAct.f32488f).m193122Dg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m50053Y(yxz yxzVar, final MessagesAct messagesAct, View view) {
        yxzVar.mo178911Q1(true, new Runnable() { // from class: l.ycz
            @Override // java.lang.Runnable
            public final void run() {
                this.f198558a.m50052X(messagesAct);
            }
        });
        i4g0.m138523u("e_change_now", messagesAct.pageId(), pf60.m172085a("answer_write", this.f32448j));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m50054Z(MessagesAct messagesAct, View view) {
        m50056b0();
        i4g0.m138523u("e_change_one", messagesAct.pageId(), pf60.m172085a("answer_write", this.f32448j));
    }

    /* JADX INFO: renamed from: a0 */
    public void m50055a0(final MessagesAct messagesAct, final yxz yxzVar) {
        bnl0.m105509E0(this.f32443e, new View.OnClickListener() { // from class: l.ucz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageExchangeQuestionAnswerLayout.m50046Q(yxzVar, messagesAct, view);
            }
        });
        bnl0.m105509E0(this.f32446h, new View.OnClickListener() { // from class: l.vcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183500a.m50053Y(yxzVar, messagesAct, view);
            }
        });
        bnl0.m105509E0(this.f32447i, new View.OnClickListener() { // from class: l.wcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188517a.m50054Z(messagesAct, view);
            }
        });
        m50056b0();
        i4g0.m138492A("e_exchange_answer_shortcut", messagesAct.pageId(), pf60.m172085a("answer_write", this.f32448j));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m50056b0() {
        String strM50051W = m50051W(0);
        this.f32448j = strM50051W;
        this.f32444f.setText(strM50051W);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50050V(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f32441c, ibc0.f113750A7);
            bnl0.m105526N(this.f32443e, ibc0.f114092n7);
            this.f32442d.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32444f.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32446h.setTextColor(getResources().getColor(g9c0.f102820j));
            this.f32447i.setBackgroundResource(ibc0.f113759B7);
        }
    }

    public MessageExchangeQuestionAnswerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32448j = "";
    }

    public MessageExchangeQuestionAnswerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32448j = "";
    }
}
