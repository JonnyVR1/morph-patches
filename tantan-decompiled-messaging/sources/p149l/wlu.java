package p149l;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveCoin;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class wlu {

    /* JADX INFO: renamed from: a */
    public final boolean f186996a;

    /* JADX INFO: renamed from: b */
    public b3l0 f186997b;

    /* JADX INFO: renamed from: e */
    public boolean f187000e;

    /* JADX INFO: renamed from: f */
    public BLiveVideoChat f187001f;

    /* JADX INFO: renamed from: g */
    public String f187002g;

    /* JADX INFO: renamed from: h */
    public String f187003h;

    /* JADX INFO: renamed from: k */
    public c4g0 f187006k;

    /* JADX INFO: renamed from: l */
    public long f187007l;

    /* JADX INFO: renamed from: m */
    public boolean f187008m;

    /* JADX INFO: renamed from: n */
    public boolean f187009n;

    /* JADX INFO: renamed from: o */
    public BLiveVideoChatLive f187010o;

    /* JADX INFO: renamed from: d */
    public C22392a<String> f186999d = C22392a.m221512b();

    /* JADX INFO: renamed from: i */
    public VChatStartData f187004i = new VChatStartData();

    /* JADX INFO: renamed from: j */
    public BLiveCommonConfig f187005j = BLiveCommonConfig.new_();

    /* JADX INFO: renamed from: p */
    public boolean f187011p = true;

    /* JADX INFO: renamed from: q */
    public final C22392a<hvj> f187012q = C22392a.m221512b();

    /* JADX INFO: renamed from: r */
    public final ArrayList<e30<Long>> f187013r = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public z2l0 f186998c = new z2l0();

    public wlu(boolean z) {
        this.f186996a = z;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m203891d(e30 e30Var, List list) {
        if (e30Var != null) {
            e30Var.call(list);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m203892e(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ hvj m203899l(hvj hvjVar) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126012F(hvjVar);
        return hvjVar;
    }

    /* JADX INFO: renamed from: x */
    public static int m203900x(String str) {
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
    public BLiveVideoChat m203901A() {
        return this.f187001f;
    }

    /* JADX INFO: renamed from: B */
    public BLiveVideoChatLive m203902B() {
        return this.f187010o;
    }

    /* JADX INFO: renamed from: C */
    public C22306c<hvj> m203903C() {
        return this.f187012q;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m203904D(BLiveVideoChat bLiveVideoChat) {
        VChatStartAct.m69227s2("fakeCall", "sendStartReq");
        m203934h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m203905E(zeu zeuVar, Throwable th) {
        VChatStartAct.m69226r2("fakeCall", "sendStartReq", th, "");
        m203928b0(zeuVar, th, "");
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m203906F(e30 e30Var) {
        try {
            e30Var.call(Long.valueOf(this.f187007l));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ List m203907G(evj evjVar, hvj hvjVar) {
        this.f187012q.onNext(hvjVar);
        if (evjVar.m118270e() != null) {
            evjVar.m118270e().call();
        }
        return hvjVar.m133172e().m143509f();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m203908H(BLiveVideoChat bLiveVideoChat) {
        m203934h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m203909I(Throwable th) {
        if (slk0.m184829e(this.f187001f)) {
            return;
        }
        m203935i0("stopped", "");
    }

    /* JADX INFO: renamed from: J */
    public final void m203910J(BLiveVideoChat bLiveVideoChat) {
        BLiveVideoChat bLiveVideoChat2 = this.f187001f;
        if (bLiveVideoChat2 == null) {
            this.f187001f = bLiveVideoChat;
            return;
        }
        bLiveVideoChat.giftId = bLiveVideoChat2.giftId;
        bLiveVideoChat.media = bLiveVideoChat2.media;
        bLiveVideoChat.giftId = bLiveVideoChat2.giftId;
        this.f187001f = bLiveVideoChat;
    }

    /* JADX INFO: renamed from: K */
    public final void m203911K(BLiveVideoChat bLiveVideoChat, boolean z) {
        if (bLiveVideoChat == null) {
            return;
        }
        if (m203901A() != null && !TextUtils.equals(m203901A().f44474id, bLiveVideoChat.f44474id)) {
            m203921U();
        }
        if (m203900x(bLiveVideoChat.status) <= m203900x(m203947y())) {
            return;
        }
        m203913M(bLiveVideoChat, z);
    }

    /* JADX INFO: renamed from: L */
    public final void m203912L(Long l2) {
        if (m203901A() != null) {
            this.f187007l = (mqi0.m155944o() - (m203901A().startedTime / 1000000)) / 1000;
            vwb.m200354z(this.f187013r, new e30() { // from class: l.llu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128753a.m203906F((e30) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m203913M(BLiveVideoChat bLiveVideoChat, boolean z) {
        if (z) {
            m203910J(bLiveVideoChat);
        } else {
            this.f187001f = bLiveVideoChat;
        }
        if (slk0.m184825a(m203901A())) {
            m203929c0();
        }
        this.f186999d.onNext(bLiveVideoChat.status);
    }

    /* JADX INFO: renamed from: N */
    public void m203914N(final evj evjVar, @Nullable final e30<List<rwj>> e30Var) {
        iuu.m138453N(evjVar.m118266a(), evjVar.m118268c()).map(new w9j() { // from class: l.plu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nmj.m160098j((BLiveRoomTabGifts) obj, evjVar);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.qlu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wlu.m203899l((hvj) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.rlu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160004a.m203907G(evjVar, (hvj) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.slu
            @Override // p149l.e30
            public final void call(Object obj) {
                wlu.m203891d(e30Var, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m203915O(Long l2) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126009C(l2);
    }

    /* JADX INFO: renamed from: P */
    public void m203916P(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f186998c.m216979l().m189102f0(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: Q */
    public C22306c<BLiveCoin> m203917Q() {
        return zfv.m218577k1();
    }

    /* JADX INFO: renamed from: R */
    public void m203918R(e30<Long> e30Var) {
        this.f187013r.add(e30Var);
    }

    /* JADX INFO: renamed from: S */
    public void m203919S(String str) {
        gkh0.m126627j("videoChat", "requestForUpdateStatus:" + str);
        m203920T(str, "");
    }

    /* JADX INFO: renamed from: T */
    public void m203920T(String str, String str2) {
        gkh0.m126627j("videoChat", "request action:" + str + ",error:" + str2);
        iuu.m138465Z(m203939p(), str, str2).subscribe(ffw.m121194e(new e30() { // from class: l.nlu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139585a.m203908H((BLiveVideoChat) obj);
            }
        }, new e30() { // from class: l.olu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144560a.m203909I((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public void m203921U() {
        this.f187001f = null;
        m203931e0();
    }

    /* JADX INFO: renamed from: V */
    public void m203922V() {
        this.f187001f = null;
        this.f186999d = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: W */
    public void m203923W(BLiveCommonConfig bLiveCommonConfig) {
        this.f187005j = bLiveCommonConfig;
    }

    /* JADX INFO: renamed from: X */
    public void m203924X(String str) {
        this.f187003h = str;
    }

    /* JADX INFO: renamed from: Y */
    public void m203925Y(VChatStartData vChatStartData) {
        this.f187004i = vChatStartData;
    }

    /* JADX INFO: renamed from: Z */
    public void m203926Z(BLiveVideoChatLive bLiveVideoChatLive) {
        this.f187010o = bLiveVideoChatLive;
    }

    /* JADX INFO: renamed from: a0 */
    public void m203927a0(Activity activity, String str, final d30 d30Var) {
        if (!TextUtils.isEmpty(str)) {
            new xh0.C21150a(activity).m208731j(str).m208729h(false).m208736o(new View.OnClickListener() { // from class: l.mlu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wlu.m203892e(d30Var, view);
                }
            }).m208739r("好的").m208722a().m208721g();
        } else if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m203928b0(final zeu zeuVar, Throwable th, String str) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 40007) {
                C12505a.m69246p(zeuVar, true);
                zeuVar.m218412L2(true);
                return;
            } else {
                if (i == 40009) {
                    l9s.m149076g().mo30689Gb(zeuVar.act());
                    zeuVar.m218412L2(true);
                    return;
                }
                str = coreService.metaMessage;
            }
        } else if (th != null && TextUtils.isEmpty(str)) {
            str = zeuVar.act().getString(R$string.f44880R);
        }
        new xh0.C21150a(zeuVar.act()).m208731j(str).m208729h(false).m208739r("好的").m208736o(new View.OnClickListener() { // from class: l.tlu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zeuVar.act().m44477e2();
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: c0 */
    public void m203929c0() {
        m203931e0();
        this.f187006k = C22306c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.klu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123713a.m203912L((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    public void m203930d0(String str, String str2) {
        this.f186998c.m216981n(this.f186996a, str2, m203933g0(), str, "");
    }

    /* JADX INFO: renamed from: e0 */
    public void m203931e0() {
        mkd0.m154992z(this.f187006k);
        this.f187007l = 0L;
    }

    /* JADX INFO: renamed from: f0 */
    public void m203932f0() {
        z2l0 z2l0Var = this.f186998c;
        if (z2l0Var != null) {
            z2l0Var.m216983p();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public String m203933g0() {
        if (this.f187002g == null) {
            this.f187002g = UUID.randomUUID().toString();
        }
        return this.f187002g;
    }

    /* JADX INFO: renamed from: h0 */
    public void m203934h0(BLiveVideoChat bLiveVideoChat, boolean z) {
        if (slk0.m184827c(bLiveVideoChat)) {
            m203911K(bLiveVideoChat, z);
        } else {
            m203935i0("stopped", "");
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m203935i0(String str, String str2) {
        BLiveVideoChat bLiveVideoChat = this.f187001f;
        if (bLiveVideoChat == null) {
            return;
        }
        BLiveVideoChat bLiveVideoChatMo223809clone = bLiveVideoChat.mo223809clone();
        if (!TextUtils.isEmpty(str2)) {
            bLiveVideoChatMo223809clone.endTipMessage = str2;
        }
        bLiveVideoChatMo223809clone.status = str;
        m203934h0(bLiveVideoChatMo223809clone, false);
    }

    /* JADX INFO: renamed from: m */
    public void m203936m(boolean z) {
        m203931e0();
        if (z) {
            m203932f0();
            m203944u().m100109h();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m203937n(final zeu zeuVar) {
        String strM203945v = m203945v();
        VChatStartData vChatStartData = this.f187004i;
        iuu.m138461V(strM203945v, vChatStartData.source, vChatStartData.recallId).subscribe(ffw.m121194e(new e30() { // from class: l.ulu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177095a.m203904D((BLiveVideoChat) obj);
            }
        }, new e30() { // from class: l.vlu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181990a.m203905E(zeuVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public String m203938o() {
        BLiveVideoChat bLiveVideoChat = this.f187001f;
        return bLiveVideoChat == null ? "" : bLiveVideoChat.anchorId;
    }

    /* JADX INFO: renamed from: p */
    public String m203939p() {
        BLiveVideoChat bLiveVideoChat = this.f187001f;
        return bLiveVideoChat == null ? "" : bLiveVideoChat.f44474id;
    }

    /* JADX INFO: renamed from: q */
    public C22306c<Long> m203940q() {
        return ((ggv) ypv.m215673l(fld0.f98148c)).m126022h();
    }

    /* JADX INFO: renamed from: r */
    public BLiveGiftItem m203941r(int i) {
        return ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(i);
    }

    /* JADX INFO: renamed from: s */
    public String m203942s() {
        BLiveVideoChat bLiveVideoChat = this.f187001f;
        return bLiveVideoChat == null ? "" : bLiveVideoChat.liveId;
    }

    /* JADX INFO: renamed from: t */
    public long m203943t() {
        return this.f187007l;
    }

    /* JADX INFO: renamed from: u */
    public b3l0 m203944u() {
        if (this.f186997b == null) {
            this.f186997b = new b3l0(s9s.f163227a);
        }
        return this.f186997b;
    }

    /* JADX INFO: renamed from: v */
    public String m203945v() {
        return this.f187003h;
    }

    /* JADX INFO: renamed from: w */
    public VChatStartData m203946w() {
        return this.f187004i;
    }

    /* JADX INFO: renamed from: y */
    public String m203947y() {
        BLiveVideoChat bLiveVideoChat = this.f187001f;
        return bLiveVideoChat == null ? "" : bLiveVideoChat.status;
    }

    /* JADX INFO: renamed from: z */
    public C22306c<String> m203948z() {
        return this.f186999d;
    }
}
