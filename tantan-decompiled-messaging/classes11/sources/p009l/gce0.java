package p009l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.j760;
import l.mcr;
import l.mkd0;
import l.n3b0;
import l.vwb;
import l.w9j;
import l.wp1;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.z9j;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gce0 extends rya0<xaj0<User, CoreLikers.a, Integer>> {

    /* JADX INFO: renamed from: f */
    public int f13435f;

    /* JADX INFO: renamed from: g */
    public boolean f13436g;

    /* JADX INFO: renamed from: l.gce0$a */
    public interface InterfaceC0918a {
        /* JADX INFO: renamed from: a */
        default boolean m14910a() {
            return mo14913d() > 0;
        }

        /* JADX INFO: renamed from: b */
        default boolean m14911b() {
            return mo14912c() > 0;
        }

        /* JADX INFO: renamed from: c */
        int mo14912c();

        /* JADX INFO: renamed from: d */
        int mo14913d();
    }

    public gce0(BusinessConversationView businessConversationView) {
        super(businessConversationView);
        this.f13435f = -1;
        this.f13436g = true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ c m14887B(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? c.just(paymentResultWrapper) : CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.wbe0
            public final Object call(Object obj) {
                return gce0.m14888p(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ PaymentResultWrapper m14888p(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: C */
    public InterfaceC0918a m14899C() {
        return (InterfaceC0918a) this.f19042b;
    }

    /* JADX INFO: renamed from: D */
    public final void m14900D() {
        if (!CoreModule.o.b().Eh()) {
            w8e0.m24007d(m20812f(), true, BusinessEntranceStyle.SEE);
        } else {
            zvf0.u("e_intl_message_meet_entrance", "p_messages_view", new j760[]{vwb.Y("secondary_page_type", "see")});
            w8e0.m24007d(m20812f(), true, BusinessEntranceStyle.INTL_MEET);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m14901E() {
        BusinessConversationView businessConversationView = this.f19041a;
        if (businessConversationView.f4509e == null) {
            businessConversationView.f4509e = businessConversationView.f4524t.inflate();
        }
        this.f19041a.f4509e.setNumbersBackground(x2c0.No);
        this.f19041a.f4509e.setText(m20812f().getString(R.string.Nm));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m14902F(TabName tabName) {
        w8e0.m24010g(true, this.f13435f);
        w8e0.m24009f();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m14903G(xaj0 xaj0Var) {
        this.f19042b.m23869s((T) xaj0Var);
        int i = this.f13435f;
        if (i != -1 && ((CoreLikers.a) xaj0Var.b).c > 0 && i < ((Integer) xaj0Var.c).intValue()) {
            yzc0.m25566b().m25576l(true);
        }
        int iIntValue = ((Integer) xaj0Var.c).intValue();
        this.f13435f = iIntValue;
        w8e0.m24010g(this.f13436g, iIntValue);
        this.f13436g = false;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m14904H(xaj0 xaj0Var) {
        m20817m();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m14905I(PaymentResultWrapper paymentResultWrapper) {
        m20813h();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m14906J(View view) {
        m14900D();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m14907K(View view) {
        m14900D();
    }

    /* JADX INFO: renamed from: L */
    public void mo14908L() {
        if (m14899C().m14910a()) {
            m14901E();
            this.f19041a.setLookUpViewVisibility(true);
            this.f19041a.f4509e.u(m14899C().mo14912c());
            this.f19041a.f4509e.setOnClickListener(new View.OnClickListener() { // from class: l.tbe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20600a.m14906J(view);
                }
            });
        } else {
            this.f19041a.setLookUpViewVisibility(false);
        }
        this.f19041a.f4519o.setText(i0g0.m16108G(m14899C().mo14913d()));
        xdl0.M(this.f19041a.f4519o, m14899C().m14910a());
        xdl0.M(this.f19041a.f4521q, false);
        xdl0.M(this.f19041a.f4523s, false);
    }

    /* JADX INFO: renamed from: M */
    public void mo14909M() {
        this.f19041a.setLookUpViewVisibility(false);
        this.f19041a.f4519o.setText(i0g0.m16108G(m14899C().mo14913d()));
        xdl0.M(this.f19041a.f4521q, m14899C().m14911b());
        xdl0.M(this.f19041a.f4519o, false);
        xdl0.M(this.f19041a.f4523s, false);
    }

    @Override // p009l.rya0, p009l.AbstractC1135q6, p009l.gnl
    /* JADX INFO: renamed from: b */
    public void mo6472b(@NonNull mcr mcrVar, wp1<Conversation> wp1Var) {
        super.mo6472b(mcrVar, wp1Var);
        wp1Var.c(mcrVar, mkd0.t(CoreModule.c.e0.o9(), CoreModule.c.u0.O6(), CoreModule.c.u0.w5().distinctUntilChanged(), CoreModule.c.n3().map(new w9j() { // from class: l.xbe0
            public final Object call(Object obj) {
                return Boolean.valueOf(n3b0.q());
            }
        }).distinctUntilChanged(), new z9j() { // from class: l.ybe0
            /* JADX INFO: renamed from: b */
            public final Object m25266b(Object obj, Object obj2, Object obj3, Object obj4) {
                return xaj0.a((User) obj, (CoreLikers.a) obj2, (Integer) obj3);
            }
        })).filter(new w9j() { // from class: l.zbe0
            public final Object call(Object obj) {
                return Boolean.valueOf(((xaj0) obj).a != null);
            }
        }).doOnNext(new e30() { // from class: l.ace0
            public final void call(Object obj) {
                this.f9384a.m14903G((xaj0) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.bce0
            public final void call(Object obj) {
                this.f10008a.m14904H((xaj0) obj);
            }
        }));
        wp1Var.c(mcrVar, ah60.m11408E()).filter(new w9j() { // from class: l.cce0
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new w9j() { // from class: l.dce0
            public final Object call(Object obj) {
                return gce0.m14887B((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ece0
            public final void call(Object obj) {
                this.f12503a.m14905I((PaymentResultWrapper) obj);
            }
        }));
        wp1Var.c(mcrVar, ((NewMainAct) mcrVar).m3895i7()).skip(1).delay(3L, TimeUnit.SECONDS).filter(new w9j() { // from class: l.fce0
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ube0
            public final void call(Object obj) {
                this.f21056a.m14902F((TabName) obj);
            }
        }));
    }

    @Override // p009l.AbstractC1135q6
    /* JADX INFO: renamed from: n */
    public void mo6475n() {
        xdl0.M(this.f19041a.f4523s, false);
        xdl0.M(this.f19041a.f4517m, false);
        xdl0.M(this.f19041a.f4522r, false);
        this.f19041a.f4512h.setBackgroundResource(x2c0.S5);
        if (this.f19042b.m23866o()) {
            mo14909M();
        } else {
            mo14908L();
        }
        this.f19041a.setOnClickListener(new View.OnClickListener() { // from class: l.vbe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21518a.m14907K(view);
            }
        });
    }
}
