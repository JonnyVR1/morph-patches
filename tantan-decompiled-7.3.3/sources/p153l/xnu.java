package p153l;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveCoin;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class xnu {

    /* JADX INFO: renamed from: a */
    public final boolean f195470a;

    /* JADX INFO: renamed from: b */
    public gcl0 f195471b;

    /* JADX INFO: renamed from: e */
    public boolean f195474e;

    /* JADX INFO: renamed from: f */
    public BLiveVideoChat f195475f;

    /* JADX INFO: renamed from: g */
    public String f195476g;

    /* JADX INFO: renamed from: h */
    public String f195477h;

    /* JADX INFO: renamed from: k */
    public kcg0 f195480k;

    /* JADX INFO: renamed from: l */
    public long f195481l;

    /* JADX INFO: renamed from: m */
    public boolean f195482m;

    /* JADX INFO: renamed from: n */
    public boolean f195483n;

    /* JADX INFO: renamed from: o */
    public BLiveVideoChatLive f195484o;

    /* JADX INFO: renamed from: d */
    public C22507a<String> f195473d = C22507a.m222758b();

    /* JADX INFO: renamed from: i */
    public VChatStartData f195478i = new VChatStartData();

    /* JADX INFO: renamed from: j */
    public BLiveCommonConfig f195479j = BLiveCommonConfig.new_();

    /* JADX INFO: renamed from: p */
    public boolean f195485p = true;

    /* JADX INFO: renamed from: q */
    public final C22507a<xxj> f195486q = C22507a.m222758b();

    /* JADX INFO: renamed from: r */
    public final ArrayList<y20<Long>> f195487r = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ecl0 f195472c = new ecl0();

    public xnu(boolean z) {
        this.f195470a = z;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m212298d(y20 y20Var, List list) {
        if (y20Var != null) {
            y20Var.call(list);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m212299e(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ xxj m212306l(xxj xxjVar) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135146F(xxjVar);
        return xxjVar;
    }

    /* JADX INFO: renamed from: x */
    public static int m212307x(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "stopped":
                return 4;
            case "connecting":
                return 2;
            case "pending":
                return 1;
            case "calling":
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: A */
    public BLiveVideoChat m212308A() {
        return this.f195475f;
    }

    /* JADX INFO: renamed from: B */
    public BLiveVideoChatLive m212309B() {
        return this.f195484o;
    }

    /* JADX INFO: renamed from: C */
    public C22421c<xxj> m212310C() {
        return this.f195486q;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m212311D(BLiveVideoChat bLiveVideoChat) {
        VChatStartAct.m70410u2("fakeCall", "sendStartReq");
        m212341h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m212312E(ahu ahuVar, Throwable th) {
        VChatStartAct.m70409s2("fakeCall", "sendStartReq", th, "");
        m212335b0(ahuVar, th, "");
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m212313F(y20 y20Var) {
        try {
            y20Var.call(Long.valueOf(this.f195481l));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ List m212314G(uxj uxjVar, xxj xxjVar) {
        this.f195486q.onNext(xxjVar);
        if (uxjVar.m198487e() != null) {
            uxjVar.m198487e().call();
        }
        return xxjVar.m213531e().m221999f();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m212315H(BLiveVideoChat bLiveVideoChat) {
        m212341h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m212316I(Throwable th) {
        if (yuk0.m217439e(this.f195475f)) {
            return;
        }
        m212342i0("stopped", "");
    }

    /* JADX INFO: renamed from: J */
    public final void m212317J(BLiveVideoChat bLiveVideoChat) {
        BLiveVideoChat bLiveVideoChat2 = this.f195475f;
        if (bLiveVideoChat2 == null) {
            this.f195475f = bLiveVideoChat;
            return;
        }
        bLiveVideoChat.giftId = bLiveVideoChat2.giftId;
        bLiveVideoChat.media = bLiveVideoChat2.media;
        bLiveVideoChat.giftId = bLiveVideoChat2.giftId;
        this.f195475f = bLiveVideoChat;
    }

    /* JADX INFO: renamed from: K */
    public final void m212318K(BLiveVideoChat bLiveVideoChat, boolean z) {
        if (bLiveVideoChat == null) {
            return;
        }
        if (m212308A() != null && !TextUtils.equals(m212308A().f45322id, bLiveVideoChat.f45322id)) {
            m212328U();
        }
        if (m212307x(bLiveVideoChat.status) <= m212307x(m212354y())) {
            return;
        }
        m212320M(bLiveVideoChat, z);
    }

    /* JADX INFO: renamed from: L */
    public final void m212319L(Long l2) {
        if (m212308A() != null) {
            this.f195481l = (pzi0.m174454o() - (m212308A().startedTime / 1000000)) / 1000;
            jyb.m147537z(this.f195487r, new y20() { // from class: l.mnu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137733a.m212313F((y20) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m212320M(BLiveVideoChat bLiveVideoChat, boolean z) {
        if (z) {
            m212317J(bLiveVideoChat);
        } else {
            this.f195475f = bLiveVideoChat;
        }
        if (yuk0.m217435a(m212308A())) {
            m212336c0();
        }
        this.f195473d.onNext(bLiveVideoChat.status);
    }

    /* JADX INFO: renamed from: N */
    public void m212321N(final uxj uxjVar, @Nullable final y20<List<hzj>> y20Var) {
        jwu.m147239N(uxjVar.m198483a(), uxjVar.m198485c()).map(new qcj() { // from class: l.qnu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dpj.m117390j((BLiveRoomTabGifts) obj, uxjVar);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.rnu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xnu.m212306l((xxj) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.snu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169763a.m212314G(uxjVar, (xxj) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.tnu
            @Override // p153l.y20
            public final void call(Object obj) {
                xnu.m212298d(y20Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m212322O(Long l2) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135143C(l2);
    }

    /* JADX INFO: renamed from: P */
    public void m212323P(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f195472c.m120391l().m98284f0(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: Q */
    public C22421c<BLiveCoin> m212324Q() {
        return aiv.m98111k1();
    }

    /* JADX INFO: renamed from: R */
    public void m212325R(y20<Long> y20Var) {
        this.f195487r.add(y20Var);
    }

    /* JADX INFO: renamed from: S */
    public void m212326S(String str) {
        nsh0.m164608j("videoChat", "requestForUpdateStatus:" + str);
        m212327T(str, "");
    }

    /* JADX INFO: renamed from: T */
    public void m212327T(String str, String str2) {
        nsh0.m164608j("videoChat", "request action:" + str + ",error:" + str2);
        jwu.m147251Z(m212346p(), str, str2).subscribe(dhw.m115826e(new y20() { // from class: l.onu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148224a.m212315H((BLiveVideoChat) obj);
            }
        }, new y20() { // from class: l.pnu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153331a.m212316I((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public void m212328U() {
        this.f195475f = null;
        m212338e0();
    }

    /* JADX INFO: renamed from: V */
    public void m212329V() {
        this.f195475f = null;
        this.f195473d = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: W */
    public void m212330W(BLiveCommonConfig bLiveCommonConfig) {
        this.f195479j = bLiveCommonConfig;
    }

    /* JADX INFO: renamed from: X */
    public void m212331X(String str) {
        this.f195477h = str;
    }

    /* JADX INFO: renamed from: Y */
    public void m212332Y(VChatStartData vChatStartData) {
        this.f195478i = vChatStartData;
    }

    /* JADX INFO: renamed from: Z */
    public void m212333Z(BLiveVideoChatLive bLiveVideoChatLive) {
        this.f195484o = bLiveVideoChatLive;
    }

    /* JADX INFO: renamed from: a0 */
    public void m212334a0(Activity activity, String str, final x20 x20Var) {
        if (!TextUtils.isEmpty(str)) {
            new th0.C20312a(activity).m191151j(str).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.nnu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xnu.m212299e(x20Var, view);
                }
            }).m191159r("好的").m191142a().m191141g();
        } else if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m212335b0(final ahu ahuVar, Throwable th, String str) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 40007) {
                C12668a.m70429p(ahuVar, true);
                ahuVar.m97929L2(true);
                return;
            } else {
                if (i == 40009) {
                    mbs.m157853g().mo31692Gb(ahuVar.act());
                    ahuVar.m97929L2(true);
                    return;
                }
                str = coreService.metaMessage;
            }
        } else if (th != null && TextUtils.isEmpty(str)) {
            str = ahuVar.act().getString(R$string.f45728R);
        }
        new th0.C20312a(ahuVar.act()).m191151j(str).m191149h(false).m191159r("好的").m191156o(new View.OnClickListener() { // from class: l.unu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ahuVar.act().m45660g2();
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: c0 */
    public void m212336c0() {
        m212338e0();
        this.f195480k = C22421c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.lnu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132841a.m212319L((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    public void m212337d0(String str, String str2) {
        this.f195472c.m120393n(this.f195470a, str2, m212340g0(), str, "");
    }

    /* JADX INFO: renamed from: e0 */
    public void m212338e0() {
        psd0.m173633z(this.f195480k);
        this.f195481l = 0L;
    }

    /* JADX INFO: renamed from: f0 */
    public void m212339f0() {
        ecl0 ecl0Var = this.f195472c;
        if (ecl0Var != null) {
            ecl0Var.m120395p();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public String m212340g0() {
        if (this.f195476g == null) {
            this.f195476g = UUID.randomUUID().toString();
        }
        return this.f195476g;
    }

    /* JADX INFO: renamed from: h0 */
    public void m212341h0(BLiveVideoChat bLiveVideoChat, boolean z) {
        if (yuk0.m217437c(bLiveVideoChat)) {
            m212318K(bLiveVideoChat, z);
        } else {
            m212342i0("stopped", "");
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m212342i0(String str, String str2) {
        BLiveVideoChat bLiveVideoChat = this.f195475f;
        if (bLiveVideoChat == null) {
            return;
        }
        BLiveVideoChat bLiveVideoChatMo225055clone = bLiveVideoChat.mo225055clone();
        if (!TextUtils.isEmpty(str2)) {
            bLiveVideoChatMo225055clone.endTipMessage = str2;
        }
        bLiveVideoChatMo225055clone.status = str;
        m212341h0(bLiveVideoChatMo225055clone, false);
    }

    /* JADX INFO: renamed from: m */
    public void m212343m(boolean z) {
        m212338e0();
        if (z) {
            m212339f0();
            m212351u().m129900h();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m212344n(final ahu ahuVar) {
        String strM212352v = m212352v();
        VChatStartData vChatStartData = this.f195478i;
        jwu.m147247V(strM212352v, vChatStartData.source, vChatStartData.recallId).subscribe(dhw.m115826e(new y20() { // from class: l.vnu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184915a.m212311D((BLiveVideoChat) obj);
            }
        }, new y20() { // from class: l.wnu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189980a.m212312E(ahuVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public String m212345o() {
        BLiveVideoChat bLiveVideoChat = this.f195475f;
        return bLiveVideoChat == null ? "" : bLiveVideoChat.anchorId;
    }

    /* JADX INFO: renamed from: p */
    public String m212346p() {
        BLiveVideoChat bLiveVideoChat = this.f195475f;
        return bLiveVideoChat == null ? "" : bLiveVideoChat.f45322id;
    }

    /* JADX INFO: renamed from: q */
    public C22421c<Long> m212347q() {
        return ((hiv) zrv.m221194l(htd0.f111521c)).m135156h();
    }

    /* JADX INFO: renamed from: r */
    public BLiveGiftItem m212348r(int i) {
        return ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(i);
    }

    /* JADX INFO: renamed from: s */
    public String m212349s() {
        BLiveVideoChat bLiveVideoChat = this.f195475f;
        return bLiveVideoChat == null ? "" : bLiveVideoChat.liveId;
    }

    /* JADX INFO: renamed from: t */
    public long m212350t() {
        return this.f195481l;
    }

    /* JADX INFO: renamed from: u */
    public gcl0 m212351u() {
        if (this.f195471b == null) {
            this.f195471b = new gcl0(tbs.f172988a);
        }
        return this.f195471b;
    }

    /* JADX INFO: renamed from: v */
    public String m212352v() {
        return this.f195477h;
    }

    /* JADX INFO: renamed from: w */
    public VChatStartData m212353w() {
        return this.f195478i;
    }

    /* JADX INFO: renamed from: y */
    public String m212354y() {
        BLiveVideoChat bLiveVideoChat = this.f195475f;
        return bLiveVideoChat == null ? "" : bLiveVideoChat.status;
    }

    /* JADX INFO: renamed from: z */
    public C22421c<String> m212355z() {
        return this.f195473d;
    }
}
