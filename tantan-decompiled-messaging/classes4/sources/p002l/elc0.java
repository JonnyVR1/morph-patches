package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.p000p1.mobile.putong.core.p001ui.messages.redpacket.RedPacketRecordAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.RedPacket;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e30;
import l.e51;
import l.er2;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.s7m;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class elc0 extends jq2<slc0> {

    /* JADX INFO: renamed from: a */
    public Message f9851a;

    /* JADX INFO: renamed from: b */
    public String f9852b;

    /* JADX INFO: renamed from: c */
    public String f9853c;

    /* JADX INFO: renamed from: d */
    public cwf0 f9854d;

    /* JADX INFO: renamed from: l.elc0$a */
    public class C0547a extends er2 {
        public C0547a() {
        }

        public String pageId() {
            return ((slc0) ((jq2) elc0.this).viewModel).m22548P();
        }
    }

    public elc0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m12578i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m12585x0(Bundle bundle) {
        ((slc0) ((jq2) this).viewModel).m22534A3(this.f9853c);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m12586A0(boolean z, Throwable th) {
        act().progressDismiss();
        if (z) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m12587C0(RedPacket redPacket) {
        CoreModule.c.d1.x3(this.f9851a, redPacket);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m12588D0(final RedPacket redPacket) {
        e51.y(new Runnable() { // from class: l.dlc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9319a.m12587C0(redPacket);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m12589E0(RedPacket redPacket, boolean z) {
        if (((slc0) ((jq2) this).viewModel).m22533A() && NullChecker.a(this.f9854d)) {
            this.f9854d.k();
        }
        this.f9854d = new cwf0(new C0547a(), RedPacketRecordAct.class.getName());
        boolean zM22533A = ((slc0) ((jq2) this).viewModel).m22533A();
        cwf0 cwf0Var = this.f9854d;
        if (zM22533A) {
            cwf0Var.p(new j760[]{vwb.Y("groupchat_id", this.f9853c), vwb.Y("red_packet_amount", redPacket.totalAmount), vwb.Y("red_packet_id", redPacket.id), vwb.Y("red_packet_over", redPacket.quantity > redPacket.assignQuantity ? "0" : "1"), vwb.Y("red_packet_quantity", redPacket.quantity + ""), vwb.Y("red_packet_state", redPacket.expireTime * 1000 < qib0.H.guessedCurrentServerTime() ? "overdue" : "effective"), vwb.Y("red_packet_type", TextUtils.equals(redPacket.splitType, "random") ? "luck_red_packet" : "normal_red_packet"), vwb.Y("user_get_red_packet", TextUtils.isEmpty(redPacket.myInfo.amount) ? "0" : "1")});
        } else {
            cwf0Var.p(new j760[]{vwb.Y("groupchat_id", this.f9853c), vwb.Y("actor_user_id", redPacket.owner.ownerId), vwb.Y("red_packet_over", redPacket.quantity > redPacket.assignQuantity ? "0" : "1"), vwb.Y("red_packet_state", redPacket.expireTime * 1000 < qib0.H.guessedCurrentServerTime() ? "overdue" : "effective")});
        }
        this.f9854d.i();
        if (((slc0) ((jq2) this).viewModel).m22533A() && z) {
            this.f9854d.l();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m12590F0(final boolean z) {
        duringCreated(CoreModule.c.d1.t3(this.f9852b)).subscribe(mkd0.H(new e30() { // from class: l.vkc0
            public final void call(Object obj) {
                this.f21195a.m12600z0(z, (RedPacket) obj);
            }
        }, new e30() { // from class: l.wkc0
            public final void call(Object obj) {
                this.f21809a.m12586A0(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public void m12591G0() {
        duringCreated(CoreModule.c.d1.t3(this.f9852b)).subscribe(mkd0.H(new e30() { // from class: l.zkc0
            public final void call(Object obj) {
                this.f23478a.m12588D0((RedPacket) obj);
            }
        }, new e30() { // from class: l.alc0
            public final void call(Object obj) {
                elc0.m12578i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m12592a0() {
        creates(new e30() { // from class: l.ukc0
            public final void call(Object obj) {
                this.f20686a.m12585x0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m12593p0() {
        duringCreated(CoreModule.c.H0.k4(new AuthTask(act()))).subscribe(mkd0.H(new e30() { // from class: l.blc0
            public final void call(Object obj) {
                this.f8254a.m12596s0((j760) obj);
            }
        }, new e30() { // from class: l.clc0
            public final void call(Object obj) {
                this.f8736a.m12597t0((Throwable) obj);
            }
        }));
    }

    public String pageId() {
        return ((slc0) ((jq2) this).viewModel).m22533A() ? "p_red_packet_detail" : "p_red_packet_loading";
    }

    /* JADX INFO: renamed from: q0 */
    public void m12594q0(Message message, String str, String str2) {
        this.f9851a = message;
        this.f9852b = str;
        this.f9853c = str2;
    }

    /* JADX INFO: renamed from: r0 */
    public void m12595r0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ykc0
            public final void call(Object obj) {
                this.f22954a.m12598u0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m12596s0(j760 j760Var) {
        ((slc0) ((jq2) this).viewModel).m22558w(j760Var);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m12597t0(Throwable th) {
        ((slc0) ((jq2) this).viewModel).m22557v(th);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m12598u0(c cVar) {
        if (NullChecker.b(this.f9854d)) {
            if (cVar == c.i) {
                this.f9854d.l();
            } else if (cVar == c.j) {
                this.f9854d.k();
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m12599y0(RedPacket redPacket) {
        CoreModule.c.d1.x3(this.f9851a, redPacket);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m12600z0(boolean z, final RedPacket redPacket) {
        e51.y(new Runnable() { // from class: l.xkc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22334a.m12599y0(redPacket);
            }
        });
        s7m s7mVar = ((jq2) this).viewModel;
        if (z) {
            ((slc0) s7mVar).m22561z(this.f9851a, redPacket, this.f9852b);
        } else {
            ((slc0) s7mVar).m22551S(this.f9852b, false, redPacket, true);
        }
    }

    public void destroy() {
    }
}
