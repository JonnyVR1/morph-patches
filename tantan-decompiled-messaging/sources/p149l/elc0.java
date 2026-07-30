package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.RedPacket;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.RedPacketRecordAct;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class elc0 extends jq2<slc0> {

    /* JADX INFO: renamed from: a */
    public Message f92089a;

    /* JADX INFO: renamed from: b */
    public String f92090b;

    /* JADX INFO: renamed from: c */
    public String f92091c;

    /* JADX INFO: renamed from: d */
    public cwf0 f92092d;

    /* JADX INFO: renamed from: l.elc0$a */
    public class C16642a extends er2 {
        public C16642a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return ((slc0) elc0.this.viewModel).m184786P();
        }
    }

    public elc0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m117093i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m117100x0(Bundle bundle) {
        ((slc0) this.viewModel).m184773A3(this.f92091c);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m117101A0(boolean z, Throwable th) {
        act().progressDismiss();
        if (z) {
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m117102C0(RedPacket redPacket) {
        CoreModule.f17545c.f19637d1.m34891x3(this.f92089a, redPacket);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m117103D0(final RedPacket redPacket) {
        e51.m114774y(new Runnable() { // from class: l.dlc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f86793a.m117102C0(redPacket);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m117104E0(RedPacket redPacket, boolean z) {
        if (((slc0) this.viewModel).m184772A() && NullChecker.m81303a(this.f92092d)) {
            this.f92092d.m109035k();
        }
        this.f92092d = new cwf0(new C16642a(), RedPacketRecordAct.class.getName());
        boolean zM184772A = ((slc0) this.viewModel).m184772A();
        cwf0 cwf0Var = this.f92092d;
        if (zM184772A) {
            cwf0Var.m109040p(vwb.m200311Y("groupchat_id", this.f92091c), vwb.m200311Y("red_packet_amount", redPacket.totalAmount), vwb.m200311Y("red_packet_id", redPacket.f20489id), vwb.m200311Y("red_packet_over", redPacket.quantity > redPacket.assignQuantity ? "0" : "1"), vwb.m200311Y("red_packet_quantity", redPacket.quantity + ""), vwb.m200311Y("red_packet_state", redPacket.expireTime * 1000 < qib0.f154693H.guessedCurrentServerTime() ? "overdue" : "effective"), vwb.m200311Y("red_packet_type", TextUtils.equals(redPacket.splitType, BLivePkCategory.random) ? "luck_red_packet" : "normal_red_packet"), vwb.m200311Y("user_get_red_packet", TextUtils.isEmpty(redPacket.myInfo.amount) ? "0" : "1"));
        } else {
            cwf0Var.m109040p(vwb.m200311Y("groupchat_id", this.f92091c), vwb.m200311Y("actor_user_id", redPacket.owner.ownerId), vwb.m200311Y("red_packet_over", redPacket.quantity > redPacket.assignQuantity ? "0" : "1"), vwb.m200311Y("red_packet_state", redPacket.expireTime * 1000 < qib0.f154693H.guessedCurrentServerTime() ? "overdue" : "effective"));
        }
        this.f92092d.m109033i();
        if (((slc0) this.viewModel).m184772A() && z) {
            this.f92092d.m109036l();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m117105F0(final boolean z) {
        duringCreated(CoreModule.f17545c.f19637d1.m34887t3(this.f92090b)).subscribe(mkd0.m154956H(new e30() { // from class: l.vkc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181778a.m117114z0(z, (RedPacket) obj);
            }
        }, new e30() { // from class: l.wkc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186740a.m117101A0(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public void m117106G0() {
        duringCreated(CoreModule.f17545c.f19637d1.m34887t3(this.f92090b)).subscribe(mkd0.m154956H(new e30() { // from class: l.zkc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203527a.m117103D0((RedPacket) obj);
            }
        }, new e30() { // from class: l.alc0
            @Override // p149l.e30
            public final void call(Object obj) {
                elc0.m117093i0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ukc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176917a.m117100x0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m117107p0() {
        duringCreated(CoreModule.f17545c.f19570H0.m210360k4(new AuthTask(act()))).subscribe(mkd0.m154956H(new e30() { // from class: l.blc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76177a.m117110s0((j760) obj);
            }
        }, new e30() { // from class: l.clc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81383a.m117111t0((Throwable) obj);
            }
        }));
    }

    public String pageId() {
        return ((slc0) this.viewModel).m184772A() ? "p_red_packet_detail" : "p_red_packet_loading";
    }

    /* JADX INFO: renamed from: q0 */
    public void m117108q0(Message message, String str, String str2) {
        this.f92089a = message;
        this.f92090b = str;
        this.f92091c = str2;
    }

    /* JADX INFO: renamed from: r0 */
    public void m117109r0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ykc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198743a.m117112u0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m117110s0(j760 j760Var) {
        ((slc0) this.viewModel).m184795w(j760Var);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m117111t0(Throwable th) {
        ((slc0) this.viewModel).m184794v(th);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m117112u0(C4319c c4319c) {
        if (NullChecker.m81304b(this.f92092d)) {
            if (c4319c == C4319c.f15548i) {
                this.f92092d.m109036l();
            } else if (c4319c == C4319c.f15549j) {
                this.f92092d.m109035k();
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m117113y0(RedPacket redPacket) {
        CoreModule.f17545c.f19637d1.m34891x3(this.f92089a, redPacket);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m117114z0(boolean z, final RedPacket redPacket) {
        e51.m114774y(new Runnable() { // from class: l.xkc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193283a.m117113y0(redPacket);
            }
        });
        V v2 = this.viewModel;
        if (z) {
            ((slc0) v2).m184798z(this.f92089a, redPacket, this.f92090b);
        } else {
            ((slc0) v2).m184789S(this.f92090b, false, redPacket, true);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
