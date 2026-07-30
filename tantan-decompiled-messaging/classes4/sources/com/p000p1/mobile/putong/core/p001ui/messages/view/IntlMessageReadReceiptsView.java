package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.view.IntlMessageReadReceiptsView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c30;
import l.e16;
import l.e30;
import l.e51;
import l.hmb;
import l.j000;
import l.j760;
import l.jtk;
import l.l6c0;
import l.mkd0;
import l.mqi0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlMessageReadReceiptsView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f153c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f154d;

    /* JADX INFO: renamed from: e */
    public VImage f155e;

    /* JADX INFO: renamed from: f */
    public View f156f;

    /* JADX INFO: renamed from: g */
    public Message f157g;

    /* JADX INFO: renamed from: h */
    public Conversation f158h;

    /* JADX INFO: renamed from: i */
    public long f159i;

    /* JADX INFO: renamed from: j */
    public long f160j;

    public IntlMessageReadReceiptsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m220Q(View view) {
        CoreModule.P().a().qm(c30.d(), "p_chat_view,e_intl_im_readreceipt_btn,click", Privilege.message_read_state, (e30) null);
        zvf0.u("e_intl_im_readreceipt_btn", "p_chat_view", new j760[]{vwb.Y("readreceipt_entrance", "last_message")});
    }

    /* JADX INFO: renamed from: X */
    private void m222X(User user) {
        if (CoreModule.c.C0.J3() || CoreModule.P().i().w2()) {
            m227Y();
        } else {
            m229a0(user);
        }
    }

    /* JADX INFO: renamed from: S */
    public final String m223S(long j) {
        if (mqi0.D(j)) {
            return mqi0.h.format(Long.valueOf(j));
        }
        return mqi0.v(j) ? mqi0.u().format(Long.valueOf(j)) : mqi0.l(j);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m224T(User user, List list) {
        m222X(user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m225V(User user, long j) {
        if (d.l().x("bubble_key_intl_read_receipts")) {
            return;
        }
        d.l().u(new a(getContext()).D(String.format(App.e.getString(R.string.R3), user.name)).k(new int[]{e16.c(getContext(), a1c0.o)}).G(a1c0.q).t(true).J(13.0f).E(false).I(hmb.t1(xdl0.y0()) - 92).x(t100.g).H(t100.d(16.0f), t100.d(10.0f), t100.d(16.0f), t100.d(10.0f)).o(a.P, t100.d(34.0f)).b(2500L).q(jtk.A | jtk.C), this.f156f, "bubble_key_intl_read_receipts");
        CoreModule.c.e0.I6.put(Long.valueOf(j));
        zvf0.x("e_intl_readreceipt_bubble", "p_chat_view");
    }

    /* JADX INFO: renamed from: W */
    public void m226W(Act act, Message message, Conversation conversation, j000 j000Var, final User user, long j, long j2) {
        this.f157g = message;
        this.f158h = conversation;
        this.f159i = j;
        this.f160j = j2;
        j000Var.m19173c(act, CoreModule.c.C0.x3()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.nko
            public final void call(Object obj) {
                this.f16089a.m224T(user, (List) obj);
            }
        }));
        m222X(user);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public final void m227Y() {
        long j;
        try {
            j = Long.parseLong(((DbObject) this.f157g).id);
        } catch (NumberFormatException unused) {
            j = Long.MAX_VALUE;
        }
        if (NullChecker.a(this.f158h.additional.messageRelate)) {
            double d = this.f158h.additional.messageRelate.readLastMessageTime;
            double d2 = this.f157g.createdTime;
            if (d < d2 || (j > this.f159i && ((long) d2) >= this.f160j)) {
                m230b0();
            } else {
                m228Z((long) d);
            }
        } else {
            m230b0();
        }
        xdl0.E0(this, (View.OnClickListener) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public final void m228Z(long j) {
        this.f154d.setText(m223S(j));
        this.f154d.setTextSize(12.0f);
        this.f154d.setTextColor(Color.parseColor("#FE7E1D"));
        xdl0.M(this.f153c, false);
        xdl0.M(this.f154d, true);
        xdl0.M(this.f155e, true);
        xdl0.M(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final void m229a0(final User user) {
        this.f154d.setTextSize(12.0f);
        this.f154d.setTextColor(Color.parseColor("#F2AB00"));
        this.f154d.setText(R.string.p2);
        xdl0.M(this.f153c, true);
        xdl0.M(this.f154d, true);
        xdl0.M(this.f155e, false);
        xdl0.M(this, true);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.oko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMessageReadReceiptsView.m220Q(view);
            }
        });
        final long jO = mqi0.o();
        if (jO - ((Long) CoreModule.c.e0.I6.get()).longValue() > 172800000) {
            e51.H(c30.d(), new Runnable() { // from class: l.pko
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17461a.m225V(user, jO);
                }
            }, 300L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final void m230b0() {
        this.f154d.setText(R.string.r2);
        this.f154d.setTextColor(Color.parseColor("#33000000"));
        this.f154d.setTextSize(10.0f);
        xdl0.M(this.f153c, false);
        xdl0.M(this.f155e, false);
        xdl0.M(this.f154d, true);
        xdl0.M(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(l6c0.V0, (ViewGroup) this, true);
        this.f153c = findViewById(y4c0.l1);
        this.f154d = findViewById(y4c0.A4);
        this.f155e = findViewById(y4c0.m1);
        this.f156f = findViewById(y4c0.N4);
    }

    public IntlMessageReadReceiptsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMessageReadReceiptsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
