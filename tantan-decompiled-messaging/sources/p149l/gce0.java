package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p046p1.mobile.putong.core.view.LookUpView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class gce0 extends rya0<xaj0<User, CoreLikers.C4719a, Integer>> {

    /* JADX INFO: renamed from: f */
    public int f102004f;

    /* JADX INFO: renamed from: g */
    public boolean f102005g;

    /* JADX INFO: renamed from: l.gce0$a */
    public interface InterfaceC17057a {
        /* JADX INFO: renamed from: a */
        default boolean m125494a() {
            return mo125497d() > 0;
        }

        /* JADX INFO: renamed from: b */
        default boolean m125495b() {
            return mo125496c() > 0;
        }

        /* JADX INFO: renamed from: c */
        int mo125496c();

        /* JADX INFO: renamed from: d */
        int mo125497d();
    }

    public gce0(BusinessConversationView businessConversationView) {
        super(businessConversationView);
        this.f102004f = -1;
        this.f102005g = true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22306c m125471B(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22306c.just(paymentResultWrapper) : CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.wbe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gce0.m125472p(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ PaymentResultWrapper m125472p(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: C */
    public InterfaceC17057a m125483C() {
        return (InterfaceC17057a) this.f152839b;
    }

    /* JADX INFO: renamed from: D */
    public final void m125484D() {
        if (!CoreModule.f17557o.m195055b().mo33647Eh()) {
            w8e0.m202166d(m173108f(), true, BusinessEntranceStyle.SEE);
        } else {
            zvf0.m220399u("e_intl_message_meet_entrance", OMSDialogPositon.p_messages_view, vwb.m200311Y("secondary_page_type", "see"));
            w8e0.m202166d(m173108f(), true, BusinessEntranceStyle.INTL_MEET);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m125485E() {
        BusinessConversationView businessConversationView = this.f152838a;
        if (businessConversationView.f25731e == null) {
            businessConversationView.f25731e = (LookUpView) businessConversationView.f25746t.inflate();
        }
        this.f152838a.f25731e.setNumbersBackground(x2c0.f189587No);
        this.f152838a.f25731e.setText(m173108f().getString(R$string.f17979Nm));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m125486F(TabName tabName) {
        w8e0.m202169g(true, this.f102004f);
        w8e0.m202168f();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m125487G(xaj0 xaj0Var) {
        this.f152839b.m201444s((T) xaj0Var);
        int i = this.f102004f;
        if (i != -1 && ((CoreLikers.C4719a) xaj0Var.f191752b).f19271c > 0 && i < ((Integer) xaj0Var.f191753c).intValue()) {
            yzc0.m216634b().m216644l(true);
        }
        int iIntValue = ((Integer) xaj0Var.f191753c).intValue();
        this.f102004f = iIntValue;
        w8e0.m202169g(this.f102005g, iIntValue);
        this.f102005g = false;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m125488H(xaj0 xaj0Var) {
        m173113m();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m125489I(PaymentResultWrapper paymentResultWrapper) {
        m173109h();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m125490J(View view) {
        m125484D();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m125491K(View view) {
        m125484D();
    }

    /* JADX INFO: renamed from: L */
    public void mo125492L() {
        if (m125483C().m125494a()) {
            m125485E();
            this.f152838a.setLookUpViewVisibility(true);
            this.f152838a.f25731e.m59543u(m125483C().mo125496c());
            this.f152838a.f25731e.setOnClickListener(new View.OnClickListener() { // from class: l.tbe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f169252a.m125490J(view);
                }
            });
        } else {
            this.f152838a.setLookUpViewVisibility(false);
        }
        this.f152838a.f25741o.setText(i0g0.m133840G(m125483C().mo125497d()));
        xdl0.m208344M(this.f152838a.f25741o, m125483C().m125494a());
        xdl0.m208344M(this.f152838a.f25743q, false);
        xdl0.m208344M(this.f152838a.f25745s, false);
    }

    /* JADX INFO: renamed from: M */
    public void mo125493M() {
        this.f152838a.setLookUpViewVisibility(false);
        this.f152838a.f25741o.setText(i0g0.m133840G(m125483C().mo125497d()));
        xdl0.m208344M(this.f152838a.f25743q, m125483C().m125495b());
        xdl0.m208344M(this.f152838a.f25741o, false);
        xdl0.m208344M(this.f152838a.f25745s, false);
    }

    @Override // p149l.rya0, p149l.AbstractC19435q6, p149l.gnl
    /* JADX INFO: renamed from: b */
    public void mo42320b(@NonNull mcr mcrVar, wp1<Conversation> wp1Var) {
        super.mo42320b(mcrVar, wp1Var);
        wp1Var.mo67374c(mcrVar, mkd0.m154986t(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19687u0.m30405O6(), CoreModule.f17545c.f19687u0.m30486w5().distinctUntilChanged(), CoreModule.f17545c.m31483n3().map(new w9j() { // from class: l.xbe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(n3b0.m157742q());
            }
        }).distinctUntilChanged(), new z9j() { // from class: l.ybe0
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return xaj0.m207578a((User) obj, (CoreLikers.C4719a) obj2, (Integer) obj3);
            }
        })).filter(new w9j() { // from class: l.zbe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((xaj0) obj).f191751a != 0);
            }
        }).doOnNext(new e30() { // from class: l.ace0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68791a.m125487G((xaj0) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.bce0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74916a.m125488H((xaj0) obj);
            }
        }));
        wp1Var.mo67374c(mcrVar, ah60.m96370E()).filter(new w9j() { // from class: l.cce0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new w9j() { // from class: l.dce0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gce0.m125471B((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ece0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90494a.m125489I((PaymentResultWrapper) obj);
            }
        }));
        wp1Var.mo67374c(mcrVar, ((NewMainAct) mcrVar).m39819i7()).skip(1).delay(3L, TimeUnit.SECONDS).filter(new w9j() { // from class: l.fce0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ube0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175685a.m125486F((TabName) obj);
            }
        }));
    }

    @Override // p149l.AbstractC19435q6
    /* JADX INFO: renamed from: n */
    public void mo42323n() {
        xdl0.m208344M(this.f152838a.f25745s, false);
        xdl0.m208344M(this.f152838a.f25739m, false);
        xdl0.m208344M(this.f152838a.f25744r, false);
        this.f152838a.f25734h.setBackgroundResource(x2c0.f189723S5);
        if (this.f152839b.m201441o()) {
            mo125493M();
        } else {
            mo125492L();
        }
        this.f152838a.setOnClickListener(new View.OnClickListener() { // from class: l.vbe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180838a.m125491K(view);
            }
        });
    }
}
