package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p051p1.mobile.putong.core.view.LookUpView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class lke0 extends v6b0<bkj0<User, CoreLikers.C4870a, Integer>> {

    /* JADX INFO: renamed from: f */
    public int f132461f;

    /* JADX INFO: renamed from: g */
    public boolean f132462g;

    /* JADX INFO: renamed from: l.lke0$a */
    public interface InterfaceC18406a {
        /* JADX INFO: renamed from: a */
        default boolean m154643a() {
            return mo142015d() > 0;
        }

        /* JADX INFO: renamed from: b */
        default boolean m154644b() {
            return mo138035c() > 0;
        }

        /* JADX INFO: renamed from: c */
        int mo138035c();

        /* JADX INFO: renamed from: d */
        int mo142015d();
    }

    public lke0(BusinessConversationView businessConversationView) {
        super(businessConversationView);
        this.f132461f = -1;
        this.f132462g = true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22421c m154622B(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22421c.just(paymentResultWrapper) : CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.bke0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return lke0.m154623p(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ PaymentResultWrapper m154623p(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: C */
    public InterfaceC18406a m154634C() {
        return (InterfaceC18406a) this.f140410b;
    }

    /* JADX INFO: renamed from: D */
    public final void m154635D() {
        if (!CoreModule.f18276o.m132212b().mo34650Eh()) {
            bhe0.m104331d(m161741f(), true, BusinessEntranceStyle.SEE);
        } else {
            i4g0.m138523u("e_intl_message_meet_entrance", OMSDialogPositon.p_messages_view, jyb.m147494Y("secondary_page_type", "see"));
            bhe0.m104331d(m161741f(), true, BusinessEntranceStyle.INTL_MEET);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m154636E() {
        BusinessConversationView businessConversationView = this.f140409a;
        if (businessConversationView.f26473e == null) {
            businessConversationView.f26473e = (LookUpView) businessConversationView.f26488t.inflate();
        }
        this.f140409a.f26473e.setNumbersBackground(dbc0.f86034Bp);
        this.f140409a.f26473e.setText(m161741f().getString(R$string.f19376jn));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m154637F(TabName tabName) {
        bhe0.m104334g(true, this.f132461f);
        bhe0.m104333f();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m154638G(bkj0 bkj0Var) {
        this.f140410b.m194461s((T) bkj0Var);
        int i = this.f132461f;
        if (i != -1 && ((CoreLikers.C4870a) bkj0Var.f77082b).f20013c > 0 && i < ((Integer) bkj0Var.f77083c).intValue()) {
            b8d0.m102963b().m102973l(true);
        }
        int iIntValue = ((Integer) bkj0Var.f77083c).intValue();
        this.f132461f = iIntValue;
        bhe0.m104334g(this.f132462g, iIntValue);
        this.f132462g = false;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m154639H(bkj0 bkj0Var) {
        m161746m();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m154640I(PaymentResultWrapper paymentResultWrapper) {
        m161742h();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m154641J(View view) {
        m154635D();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m154642K(View view) {
        m154635D();
    }

    /* JADX INFO: renamed from: L */
    public void mo144365L() {
        if (m154634C().m154643a()) {
            m154636E();
            this.f140409a.setLookUpViewVisibility(true);
            this.f140409a.f26473e.m60727u(m154634C().mo138035c());
            this.f140409a.f26473e.setOnClickListener(new View.OnClickListener() { // from class: l.yje0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200294a.m154641J(view);
                }
            });
        } else {
            this.f140409a.setLookUpViewVisibility(false);
        }
        this.f140409a.f26483o.setText(q8g0.m175775G(m154634C().mo142015d()));
        bnl0.m105524M(this.f140409a.f26483o, m154634C().m154643a());
        bnl0.m105524M(this.f140409a.f26485q, false);
        bnl0.m105524M(this.f140409a.f26487s, false);
    }

    /* JADX INFO: renamed from: M */
    public void mo144366M() {
        this.f140409a.setLookUpViewVisibility(false);
        this.f140409a.f26483o.setText(q8g0.m175775G(m154634C().mo142015d()));
        bnl0.m105524M(this.f140409a.f26485q, m154634C().m154644b());
        bnl0.m105524M(this.f140409a.f26483o, false);
        bnl0.m105524M(this.f140409a.f26487s, false);
    }

    @Override // p153l.v6b0, p153l.AbstractC18810n6, p153l.rpl
    /* JADX INFO: renamed from: b */
    public void mo43331b(@NonNull ner nerVar, dq1<Conversation> dq1Var) {
        super.mo43331b(nerVar, dq1Var);
        dq1Var.mo68557c(nerVar, psd0.m173627t(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20429u0.m31415S6(), CoreModule.f18264c.f20429u0.m31494y5().distinctUntilChanged(), CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.cke0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(rbb0.m180744q());
            }
        }).distinctUntilChanged(), new tcj() { // from class: l.dke0
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return bkj0.m104818a((User) obj, (CoreLikers.C4870a) obj2, (Integer) obj3);
            }
        })).filter(new qcj() { // from class: l.eke0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((bkj0) obj).f77081a != 0);
            }
        }).doOnNext(new y20() { // from class: l.fke0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99502a.m154638G((bkj0) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.gke0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104731a.m154639H((bkj0) obj);
            }
        }));
        dq1Var.mo68557c(nerVar, fp60.m126543E()).filter(new qcj() { // from class: l.hke0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new qcj() { // from class: l.ike0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return lke0.m154622B((PaymentResultWrapper) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.jke0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121402a.m154640I((PaymentResultWrapper) obj);
            }
        }));
        dq1Var.mo68557c(nerVar, ((NewMainAct) nerVar).m40829o7()).skip(1).delay(3L, TimeUnit.SECONDS).filter(new qcj() { // from class: l.kke0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zje0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204664a.m154637F((TabName) obj);
            }
        }));
    }

    @Override // p153l.AbstractC18810n6
    /* JADX INFO: renamed from: n */
    public void mo43334n() {
        bnl0.m105524M(this.f140409a.f26487s, false);
        bnl0.m105524M(this.f140409a.f26481m, false);
        bnl0.m105524M(this.f140409a.f26486r, false);
        this.f140409a.f26476h.setBackgroundResource(dbc0.f86590T5);
        if (this.f140410b.m194458o()) {
            mo144366M();
        } else {
            mo144365L();
        }
        this.f140409a.setOnClickListener(new View.OnClickListener() { // from class: l.ake0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72000a.m154642K(view);
            }
        });
    }
}
