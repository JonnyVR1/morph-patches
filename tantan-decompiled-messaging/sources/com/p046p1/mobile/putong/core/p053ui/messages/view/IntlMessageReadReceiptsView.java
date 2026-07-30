package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.view.IntlMessageReadReceiptsView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.a1c0;
import p149l.c30;
import p149l.e16;
import p149l.e30;
import p149l.e51;
import p149l.hmb;
import p149l.j000;
import p149l.jtk;
import p149l.l6c0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class IntlMessageReadReceiptsView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f32331c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f32332d;

    /* JADX INFO: renamed from: e */
    public VImage f32333e;

    /* JADX INFO: renamed from: f */
    public View f32334f;

    /* JADX INFO: renamed from: g */
    public Message f32335g;

    /* JADX INFO: renamed from: h */
    public Conversation f32336h;

    /* JADX INFO: renamed from: i */
    public long f32337i;

    /* JADX INFO: renamed from: j */
    public long f32338j;

    public IntlMessageReadReceiptsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m49802Q(View view) {
        CoreModule.m29935P().m94651a().mo33572qm(c30.m104962d(), "p_chat_view,e_intl_im_readreceipt_btn,click", Privilege.message_read_state, null);
        zvf0.m220399u("e_intl_im_readreceipt_btn", OMSDialogPositon.p_chat_view, vwb.m200311Y("readreceipt_entrance", "last_message"));
    }

    /* JADX INFO: renamed from: X */
    private void m49804X(User user) {
        if (CoreModule.f17545c.f19555C0.m210101J3() || CoreModule.m29935P().m94658i().mo158461w2()) {
            m49809Y();
        } else {
            m49811a0(user);
        }
    }

    /* JADX INFO: renamed from: S */
    public final String m49805S(long j) {
        if (mqi0.m155929D(j)) {
            return mqi0.f135256h.format(Long.valueOf(j));
        }
        return mqi0.m155951v(j) ? mqi0.m155950u().format(Long.valueOf(j)) : mqi0.m155941l(j);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m49806T(User user, List list) {
        m49804X(user);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m49807V(User user, long j) {
        if (C4348d.m20896l().m20912x("bubble_key_intl_read_receipts")) {
            return;
        }
        C4348d.m20896l().m20909u(new C4345a(getContext()).m20849D(String.format(App.f15369e.getString(R$string.f20848R3), user.name)).m20870k(e16.m114375c(getContext(), a1c0.f67161o)).m20852G(a1c0.f67163q).m20878t(true).m20855J(13.0f).m20850E(false).m20854I(hmb.m131715t1(xdl0.m208412y0()) - 92).m20882x(t100.f167258g).m20853H(t100.m186890d(16.0f), t100.m186890d(10.0f), t100.m186890d(16.0f), t100.m186890d(10.0f)).m20873o(C4345a.f15682P, t100.m186890d(34.0f)).m20861b(2500L).m20875q(jtk.f119614A | jtk.f119616C), this.f32334f, "bubble_key_intl_read_receipts");
        CoreModule.f17545c.f19639e0.f149195I6.put(Long.valueOf(j));
        zvf0.m220402x("e_intl_readreceipt_bubble", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: W */
    public void m49808W(Act act, Message message, Conversation conversation, j000 j000Var, final User user, long j, long j2) {
        this.f32335g = message;
        this.f32336h = conversation;
        this.f32337i = j;
        this.f32338j = j2;
        j000Var.mo67374c(act, CoreModule.f17545c.f19555C0.m210114x3()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.nko
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139452a.m49806T(user, (List) obj);
            }
        }));
        m49804X(user);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX INFO: renamed from: Y */
    public final void m49809Y() {
        long j;
        try {
            j = Long.parseLong(this.f32335g.f56011id);
        } catch (NumberFormatException unused) {
            j = Long.MAX_VALUE;
        }
        if (NullChecker.m81303a(this.f32336h.additional.messageRelate)) {
            double d = this.f32336h.additional.messageRelate.readLastMessageTime;
            double d2 = this.f32335g.createdTime;
            if (d < d2 || (j > this.f32337i && ((long) d2) >= this.f32338j)) {
                m49812b0();
            } else {
                m49810Z((long) d);
            }
        } else {
            m49812b0();
        }
        xdl0.m208329E0(this, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m49810Z(long j) {
        this.f32332d.setText(m49805S(j));
        this.f32332d.setTextSize(12.0f);
        this.f32332d.setTextColor(Color.parseColor("#FE7E1D"));
        xdl0.m208344M(this.f32331c, false);
        xdl0.m208344M(this.f32332d, true);
        xdl0.m208344M(this.f32333e, true);
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m49811a0(final User user) {
        this.f32332d.setTextSize(12.0f);
        this.f32332d.setTextColor(Color.parseColor("#F2AB00"));
        this.f32332d.setText(R$string.f21054p2);
        xdl0.m208344M(this.f32331c, true);
        xdl0.m208344M(this.f32332d, true);
        xdl0.m208344M(this.f32333e, false);
        xdl0.m208344M(this, true);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.oko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMessageReadReceiptsView.m49802Q(view);
            }
        });
        final long jM155944o = mqi0.m155944o();
        if (jM155944o - CoreModule.f17545c.f19639e0.f149195I6.get().longValue() > 172800000) {
            e51.m114743H(c30.m104962d(), new Runnable() { // from class: l.pko
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150012a.m49807V(user, jM155944o);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m49812b0() {
        this.f32332d.setText(R$string.f21071r2);
        this.f32332d.setTextColor(Color.parseColor("#33000000"));
        this.f32332d.setTextSize(10.0f);
        xdl0.m208344M(this.f32331c, false);
        xdl0.m208344M(this.f32333e, false);
        xdl0.m208344M(this.f32332d, true);
        xdl0.m208344M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(l6c0.f126402V0, (ViewGroup) this, true);
        this.f32331c = (VImage) findViewById(y4c0.f196166l1);
        this.f32332d = (VText_NoTopPadding) findViewById(y4c0.f195933A4);
        this.f32333e = (VImage) findViewById(y4c0.f196173m1);
        this.f32334f = findViewById(y4c0.f196014N4);
    }

    public IntlMessageReadReceiptsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMessageReadReceiptsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
