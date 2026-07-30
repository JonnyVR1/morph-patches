package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveUnJailAnchorInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, m87232d2 = {"Ll/nkj0;", "Ll/pat;", "Ll/ho2;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "throwable", "", "b4", "(Ljava/lang/Throwable;)V", Constants.KEY_T, "()V", "g4", "", "anchorId", "Lkotlin/Function0;", "alertAction", "Z3", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;", "unJailAnchorInfo", "f4", "(Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;)V", "a4", "(Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;Lkotlin/jvm/functions/Function0;)V", "c4", "e4", "Ll/cfe0;", "Y3", "()Ll/cfe0;", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "bLiveGivenGiftBrief", "d4", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "giftId", "j", "receiverId", "Ll/tje;", "k", "Ll/tje;", "inputEditAlert", "Ll/skj0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/skj0;", "confirmDialog", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class nkj0 extends pat<ho2> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String giftId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String receiverId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public tje inputEditAlert;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public skj0 confirmDialog;

    /* JADX INFO: renamed from: l.nkj0$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"l/nkj0$b", "Ll/skj0$a;", "", "a", "()V", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18725b implements skj0.InterfaceC19973a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveUnJailAnchorInfo f139438b;

        public C18725b(BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo) {
            this.f139438b = bLiveUnJailAnchorInfo;
        }

        /* JADX INFO: renamed from: c */
        public static Unit m159945c(nkj0 nkj0Var) {
            skj0 skj0Var = nkj0Var.confirmDialog;
            if (skj0Var == null) {
                Intrinsics.m87502r("confirmDialog");
                skj0Var = null;
            }
            skj0Var.m184606c();
            return Unit.INSTANCE;
        }

        @Override // p149l.skj0.InterfaceC19973a
        /* JADX INFO: renamed from: a */
        public void mo159946a() {
            final nkj0 nkj0Var = nkj0.this;
            nkj0Var.m159939a4(this.f139438b, new Function0() { // from class: l.okj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return nkj0.C18725b.m159945c(nkj0Var);
                }
            });
        }

        @Override // p149l.skj0.InterfaceC19973a
        /* JADX INFO: renamed from: b */
        public void mo159947b() {
            skj0 skj0Var = nkj0.this.confirmDialog;
            if (skj0Var == null) {
                Intrinsics.m87502r("confirmDialog");
                skj0Var = null;
            }
            skj0Var.m184606c();
            nkj0.this.m159944g4();
        }
    }

    /* JADX INFO: renamed from: l.nkj0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/nkj0$c", "Ll/tje$c;", "", "inputText", "", "a", "(Ljava/lang/CharSequence;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18726c implements tje.InterfaceC20189c {
        public C18726c() {
        }

        /* JADX INFO: renamed from: b */
        public static Unit m159948b(nkj0 nkj0Var) {
            tje tjeVar = nkj0Var.inputEditAlert;
            if (tjeVar == null) {
                Intrinsics.m87502r("inputEditAlert");
                tjeVar = null;
            }
            tjeVar.m189254d();
            return Unit.INSTANCE;
        }

        @Override // p149l.tje.InterfaceC20189c
        /* JADX INFO: renamed from: a */
        public void mo159949a(CharSequence inputText) {
            inputText.getClass();
            nkj0 nkj0Var = nkj0.this;
            String string = inputText.toString();
            final nkj0 nkj0Var2 = nkj0.this;
            nkj0Var.m159938Z3(string, new Function0() { // from class: l.pkj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return nkj0.C18726c.m159948b(nkj0Var2);
                }
            });
        }
    }

    public nkj0(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
        this.receiverId = "";
    }

    /* JADX INFO: renamed from: J3 */
    public static void m159921J3(Integer num) {
    }

    /* JADX INFO: renamed from: K3 */
    public static void m159922K3(Function0 function0, nkj0 nkj0Var, BLiveExtraResponse bLiveExtraResponse) {
        BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo;
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code != 200) {
            lsi0.m151595y(meta.message);
            return;
        }
        function0.invoke();
        BLiveExtraData bLiveExtraData = bLiveExtraResponse.data;
        if (bLiveExtraData == null || (bLiveUnJailAnchorInfo = bLiveExtraData.anchorInfo) == null) {
            return;
        }
        nkj0Var.m159943f4(bLiveUnJailAnchorInfo);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m159923L3(nkj0 nkj0Var, Throwable th) {
        q560.INSTANCE.m172993c(th.getMessage());
        nkj0Var.m159940c4(th);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m159924M3(Throwable th) {
        lsi0.m151595y(th.getMessage());
    }

    /* JADX INFO: renamed from: N3 */
    public static void m159925N3(nkj0 nkj0Var, BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo, Function0 function0, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code != 200) {
            q560.INSTANCE.m172993c(meta.message);
            lsi0.m151595y(bLiveExtraResponse.meta.message);
        } else {
            nkj0Var.receiverId = String.valueOf(bLiveUnJailAnchorInfo.f44463id);
            function0.invoke();
            nkj0Var.m159942e4(bLiveUnJailAnchorInfo);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static void m159927P3(nkj0 nkj0Var, String str) {
        str.getClass();
        nkj0Var.giftId = str;
        nkj0Var.m159944g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public final void m159935b4(Throwable throwable) {
        q560.INSTANCE.m172991a(this.receiverId, throwable.getMessage());
    }

    /* JADX INFO: renamed from: Y3 */
    public final cfe0 m159937Y3() {
        ggv ggvVar = (ggv) ypv.m215673l(fld0.f98148c);
        String str = this.giftId;
        if (str == null) {
            Intrinsics.m87502r("giftId");
            str = null;
        }
        cfe0 cfe0VarM106532w = new cfe0.C16123a().m106532w(ggvVar.m126027m(str), new e30() { // from class: l.gkj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103202a.m159941d4((BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.hkj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108240a.m159935b4((Throwable) obj);
            }
        }, new e30() { // from class: l.ikj0
            @Override // p149l.e30
            public final void call(Object obj) {
                nkj0.m159921J3((Integer) obj);
            }
        }, false, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.PacketUnJail)));
        cfe0VarM106532w.getClass();
        return cfe0VarM106532w;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m159938Z3(String anchorId, final Function0<Unit> alertAction) {
        duringCreated(zfv.m218576k0(anchorId)).subscribe(ffw.m121194e(new e30() { // from class: l.lkj0
            @Override // p149l.e30
            public final void call(Object obj) {
                nkj0.m159922K3(alertAction, this, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.mkj0
            @Override // p149l.e30
            public final void call(Object obj) {
                nkj0.m159924M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m159939a4(final BLiveUnJailAnchorInfo unJailAnchorInfo, final Function0<Unit> alertAction) {
        duringCreated(zfv.m218582m0(String.valueOf(unJailAnchorInfo.f44463id), unJailAnchorInfo.roomId)).subscribe(ffw.m121194e(new e30() { // from class: l.ekj0
            @Override // p149l.e30
            public final void call(Object obj) {
                nkj0.m159925N3(this.f91988a, unJailAnchorInfo, alertAction, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.fkj0
            @Override // p149l.e30
            public final void call(Object obj) {
                nkj0.m159923L3(this.f98078a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m159940c4(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m159941d4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        q560.INSTANCE.m172992b(this.receiverId);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m159942e4(BLiveUnJailAnchorInfo unJailAnchorInfo) {
        cfe0 cfe0VarM159937Y3 = m159937Y3();
        pge0 pge0Var = cfe0VarM159937Y3.f80589a;
        pge0Var.f148653b = unJailAnchorInfo.roomId;
        pge0Var.f148652a = unJailAnchorInfo.liveId;
        pge0Var.f148666o = String.valueOf(unJailAnchorInfo.f44463id);
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(cfe0VarM159937Y3);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m159943f4(BLiveUnJailAnchorInfo unJailAnchorInfo) {
        Act act = this.f188513f;
        act.getClass();
        String str = unJailAnchorInfo.name;
        str.getClass();
        skj0 skj0Var = new skj0(act, str, new C18725b(unJailAnchorInfo));
        this.confirmDialog = skj0Var;
        skj0Var.m184608g();
    }

    /* JADX INFO: renamed from: g4 */
    public final void m159944g4() {
        tje.Companion companion = tje.INSTANCE;
        Act act = this.f188513f;
        act.getClass();
        tje.C20187a c20187a = new tje.C20187a(act);
        c20187a.m189265I(R$string.f47375lk);
        c20187a.m189259C(R$string.f47134ak);
        c20187a.m189290y(R$string.f47112Zj);
        c20187a.m189263G(R$string.f47156bk);
        String strM202217t = w8u.m202217t(R$string.f47156bk);
        strM202217t.getClass();
        c20187a.m189262F(strM202217t);
        c20187a.m189289x(new View.OnClickListener() { // from class: l.kkj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nkj0.m159936h4(view);
            }
        });
        c20187a.m189258B(new C18726c());
        c20187a.m189288w(false);
        c20187a.m189291z(false);
        c20187a.m189257A(true);
        tje tjeVarM189266a = c20187a.m189266a();
        this.inputEditAlert = tjeVarM189266a;
        if (tjeVarM189266a == null) {
            Intrinsics.m87502r("inputEditAlert");
            tjeVarM189266a = null;
        }
        tjeVarM189266a.m189256f();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().UnJailCardEvent.showUnJailCardInputDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.jkj0
            @Override // p149l.e30
            public final void call(Object obj) {
                nkj0.m159927P3(this.f118389a, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m159936h4(View view) {
    }
}
