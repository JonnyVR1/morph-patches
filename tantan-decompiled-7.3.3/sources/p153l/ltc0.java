package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.RedPacket;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.RedPacketRecordAct;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ltc0 extends ar2<ztc0> {

    /* JADX INFO: renamed from: a */
    public Message f133535a;

    /* JADX INFO: renamed from: b */
    public String f133536b;

    /* JADX INFO: renamed from: c */
    public String f133537c;

    /* JADX INFO: renamed from: d */
    public l4g0 f133538d;

    /* JADX INFO: renamed from: l.ltc0$a */
    public class C18458a extends ur2 {
        public C18458a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return ((ztc0) ltc0.this.viewModel).m221521P();
        }
    }

    public ltc0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m155750i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m155757x0(Bundle bundle) {
        ((ztc0) this.viewModel).m221508A3(this.f133537c);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m155758A0(boolean z, Throwable th) {
        act().progressDismiss();
        if (z) {
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m155759C0(RedPacket redPacket) {
        CoreModule.f18264c.f20379d1.m35894x3(this.f133535a, redPacket);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m155760D0(final RedPacket redPacket) {
        l51.m152919y(new Runnable() { // from class: l.ktc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128675a.m155759C0(redPacket);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m155761E0(RedPacket redPacket, boolean z) {
        if (((ztc0) this.viewModel).m221507A() && NullChecker.m82486a(this.f133538d)) {
            this.f133538d.m152776k();
        }
        this.f133538d = new l4g0(new C18458a(), RedPacketRecordAct.class.getName());
        boolean zM221507A = ((ztc0) this.viewModel).m221507A();
        l4g0 l4g0Var = this.f133538d;
        if (zM221507A) {
            l4g0Var.m152781p(jyb.m147494Y("groupchat_id", this.f133537c), jyb.m147494Y("red_packet_amount", redPacket.totalAmount), jyb.m147494Y("red_packet_id", redPacket.f21231id), jyb.m147494Y("red_packet_over", redPacket.quantity > redPacket.assignQuantity ? "0" : "1"), jyb.m147494Y("red_packet_quantity", redPacket.quantity + ""), jyb.m147494Y("red_packet_state", redPacket.expireTime * 1000 < uqb0.f180376H.guessedCurrentServerTime() ? "overdue" : "effective"), jyb.m147494Y("red_packet_type", TextUtils.equals(redPacket.splitType, BLivePkCategory.random) ? "luck_red_packet" : "normal_red_packet"), jyb.m147494Y("user_get_red_packet", TextUtils.isEmpty(redPacket.myInfo.amount) ? "0" : "1"));
        } else {
            l4g0Var.m152781p(jyb.m147494Y("groupchat_id", this.f133537c), jyb.m147494Y("actor_user_id", redPacket.owner.ownerId), jyb.m147494Y("red_packet_over", redPacket.quantity > redPacket.assignQuantity ? "0" : "1"), jyb.m147494Y("red_packet_state", redPacket.expireTime * 1000 < uqb0.f180376H.guessedCurrentServerTime() ? "overdue" : "effective"));
        }
        this.f133538d.m152774i();
        if (((ztc0) this.viewModel).m221507A() && z) {
            this.f133538d.m152777l();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m155762F0(final boolean z) {
        duringCreated(CoreModule.f18264c.f20379d1.m35890t3(this.f133536b)).subscribe(psd0.m173597H(new y20() { // from class: l.ctc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83686a.m155771z0(z, (RedPacket) obj);
            }
        }, new y20() { // from class: l.dtc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90559a.m155758A0(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public void m155763G0() {
        duringCreated(CoreModule.f18264c.f20379d1.m35890t3(this.f133536b)).subscribe(psd0.m173597H(new y20() { // from class: l.gtc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106398a.m155760D0((RedPacket) obj);
            }
        }, new y20() { // from class: l.htc0
            @Override // p153l.y20
            public final void call(Object obj) {
                ltc0.m155750i0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.btc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78349a.m155757x0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m155764p0() {
        duringCreated(CoreModule.f18264c.f20312H0.m155448k4(new AuthTask(act()))).subscribe(psd0.m173597H(new y20() { // from class: l.itc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116819a.m155767s0((pf60) obj);
            }
        }, new y20() { // from class: l.jtc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122575a.m155768t0((Throwable) obj);
            }
        }));
    }

    public String pageId() {
        return ((ztc0) this.viewModel).m221507A() ? "p_red_packet_detail" : "p_red_packet_loading";
    }

    /* JADX INFO: renamed from: q0 */
    public void m155765q0(Message message, String str, String str2) {
        this.f133535a = message;
        this.f133536b = str;
        this.f133537c = str2;
    }

    /* JADX INFO: renamed from: r0 */
    public void m155766r0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ftc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100730a.m155769u0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m155767s0(pf60 pf60Var) {
        ((ztc0) this.viewModel).m221530w(pf60Var);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m155768t0(Throwable th) {
        ((ztc0) this.viewModel).m221529v(th);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m155769u0(C4470c c4470c) {
        if (NullChecker.m82487b(this.f133538d)) {
            if (c4470c == C4470c.f16267i) {
                this.f133538d.m152777l();
            } else if (c4470c == C4470c.f16268j) {
                this.f133538d.m152776k();
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m155770y0(RedPacket redPacket) {
        CoreModule.f18264c.f20379d1.m35894x3(this.f133535a, redPacket);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m155771z0(boolean z, final RedPacket redPacket) {
        l51.m152919y(new Runnable() { // from class: l.etc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f95711a.m155770y0(redPacket);
            }
        });
        V v2 = this.viewModel;
        if (z) {
            ((ztc0) v2).m221533z(this.f133535a, redPacket, this.f133536b);
        } else {
            ((ztc0) v2).m221524S(this.f133536b, false, redPacket, true);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
