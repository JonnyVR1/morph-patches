package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.view.IntlMessageReadReceiptsView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.edc0;
import p153l.g900;
import p153l.g9c0;
import p153l.i4g0;
import p153l.j26;
import p153l.jyb;
import p153l.l51;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qec0;
import p153l.vnb;
import p153l.w20;
import p153l.y20;
import p153l.zvk;

/* JADX INFO: loaded from: classes4.dex */
public class IntlMessageReadReceiptsView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f33179c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f33180d;

    /* JADX INFO: renamed from: e */
    public VImage f33181e;

    /* JADX INFO: renamed from: f */
    public View f33182f;

    /* JADX INFO: renamed from: g */
    public Message f33183g;

    /* JADX INFO: renamed from: h */
    public Conversation f33184h;

    /* JADX INFO: renamed from: i */
    public long f33185i;

    /* JADX INFO: renamed from: j */
    public long f33186j;

    public IntlMessageReadReceiptsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m50985Q(View view) {
        CoreModule.m30933P().m143405a().mo34575qm(w20.m204489d(), "p_chat_view,e_intl_im_readreceipt_btn,click", Privilege.message_read_state, null);
        i4g0.m138523u("e_intl_im_readreceipt_btn", OMSDialogPositon.p_chat_view, jyb.m147494Y("readreceipt_entrance", "last_message"));
    }

    /* JADX INFO: renamed from: X */
    private void m50987X(User user) {
        if (CoreModule.f18264c.f20297C0.m146414K3() || CoreModule.m30933P().m143412i().mo180553w2()) {
            m50992Y();
        } else {
            m50994a0(user);
        }
    }

    /* JADX INFO: renamed from: S */
    public final String m50988S(long j) {
        if (pzi0.m174439D(j)) {
            return pzi0.f154861h.format(Long.valueOf(j));
        }
        return pzi0.m174461v(j) ? pzi0.m174460u().format(Long.valueOf(j)) : pzi0.m174451l(j);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m50989T(User user, List list) {
        m50987X(user);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m50990V(User user, long j) {
        if (C4499d.m21895l().m21911x("bubble_key_intl_read_receipts")) {
            return;
        }
        C4499d.m21895l().m21908u(new C4496a(getContext()).m21848D(String.format(App.f16088e.getString(R$string.f21590R3), user.name)).m21869k(j26.m143190c(getContext(), g9c0.f102825o)).m21851G(g9c0.f102827q).m21877t(true).m21854J(13.0f).m21849E(false).m21853I(vnb.m201960t1(bnl0.m105592y0()) - 92).m21881x(qa00.f156320g).m21852H(qa00.m175859d(16.0f), qa00.m175859d(10.0f), qa00.m175859d(16.0f), qa00.m175859d(10.0f)).m21872o(C4496a.f16401P, qa00.m175859d(34.0f)).m21860b(2500L).m21874q(zvk.f206224A | zvk.f206226C), this.f33182f, "bubble_key_intl_read_receipts");
        CoreModule.f18264c.f20381e0.f89052I6.put(Long.valueOf(j));
        i4g0.m138526x("e_intl_readreceipt_bubble", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: W */
    public void m50991W(Act act, Message message, Conversation conversation, g900 g900Var, final User user, long j, long j2) {
        this.f33183g = message;
        this.f33184h = conversation;
        this.f33185i = j;
        this.f33186j = j2;
        g900Var.mo68557c(act, CoreModule.f18264c.f20297C0.m146427y3()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.nmo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142730a.m50989T(user, (List) obj);
            }
        }));
        m50987X(user);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX INFO: renamed from: Y */
    public final void m50992Y() {
        long j;
        try {
            j = Long.parseLong(this.f33183g.f56859id);
        } catch (NumberFormatException unused) {
            j = Long.MAX_VALUE;
        }
        if (NullChecker.m82486a(this.f33184h.additional.messageRelate)) {
            double d = this.f33184h.additional.messageRelate.readLastMessageTime;
            double d2 = this.f33183g.createdTime;
            if (d < d2 || (j > this.f33185i && ((long) d2) >= this.f33186j)) {
                m50995b0();
            } else {
                m50993Z((long) d);
            }
        } else {
            m50995b0();
        }
        bnl0.m105509E0(this, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m50993Z(long j) {
        this.f33180d.setText(m50988S(j));
        this.f33180d.setTextSize(12.0f);
        this.f33180d.setTextColor(Color.parseColor("#FE7E1D"));
        bnl0.m105524M(this.f33179c, false);
        bnl0.m105524M(this.f33180d, true);
        bnl0.m105524M(this.f33181e, true);
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m50994a0(final User user) {
        this.f33180d.setTextSize(12.0f);
        this.f33180d.setTextColor(Color.parseColor("#F2AB00"));
        this.f33180d.setText(R$string.f21796p2);
        bnl0.m105524M(this.f33179c, true);
        bnl0.m105524M(this.f33180d, true);
        bnl0.m105524M(this.f33181e, false);
        bnl0.m105524M(this, true);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.omo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMessageReadReceiptsView.m50985Q(view);
            }
        });
        final long jM174454o = pzi0.m174454o();
        if (jM174454o - CoreModule.f18264c.f20381e0.f89052I6.get().longValue() > 172800000) {
            l51.m152888H(w20.m204489d(), new Runnable() { // from class: l.pmo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153206a.m50990V(user, jM174454o);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m50995b0() {
        this.f33180d.setText(R$string.f21813r2);
        this.f33180d.setTextColor(Color.parseColor("#33000000"));
        this.f33180d.setTextSize(10.0f);
        bnl0.m105524M(this.f33179c, false);
        bnl0.m105524M(this.f33181e, false);
        bnl0.m105524M(this.f33180d, true);
        bnl0.m105524M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(qec0.f156958V0, (ViewGroup) this, true);
        this.f33179c = (VImage) findViewById(edc0.f93401l1);
        this.f33180d = (VText_NoTopPadding) findViewById(edc0.f93168A4);
        this.f33181e = (VImage) findViewById(edc0.f93408m1);
        this.f33182f = findViewById(edc0.f93249N4);
    }

    public IntlMessageReadReceiptsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMessageReadReceiptsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
