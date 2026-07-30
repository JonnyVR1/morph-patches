package p002l;

import android.text.TextUtils;
import android.util.Size;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveChatMessageContentInfo;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.data.DbObject;
import l.d30;
import l.e30;
import l.ffw;
import l.jo0;
import l.lsi0;
import l.roj0;
import l.soj0;
import l.vwb;
import l.w9j;
import l.ypv;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gz4<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public x15<D> f11697i;

    /* JADX INFO: renamed from: j */
    public nv4<D> f11698j;

    /* JADX INFO: renamed from: k */
    public yq2 f11699k;

    /* JADX INFO: renamed from: l */
    public String f11700l;

    /* JADX INFO: renamed from: m */
    public String f11701m;

    /* JADX INFO: renamed from: n */
    public String f11702n;

    public gz4(bsm<D> bsmVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(bsmVar);
        this.f11699k = (yq2) wq4.m25288a(vwb.f0(new wq4[]{new vye(), new k5z(), new qwz()}));
        this.f11698j = (nv4) z2(new nv4(bsmVar));
        this.f11697i = (x15) z2(new x15(bsmVar, chatView, chatInputEntryView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m14095Z3(soj0 soj0Var) {
        m14107h4();
    }

    /* JADX INFO: renamed from: T */
    public void m14096T() {
        super.T();
        duringCreated((c) m25548F2().ChatEvent.chatInputClick().g()).subscribe(ffw.d(new e30() { // from class: l.uy4
            public final void call(Object obj) {
                this.f20877a.m14112n4((wu4) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.sendNormalMessage().g()).subscribe(ffw.d(new e30() { // from class: l.xy4
            public final void call(Object obj) {
                this.f22506a.m14098X3((sn40) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.sendDanmakuMessage().g()).subscribe(ffw.d(new e30() { // from class: l.yy4
            public final void call(Object obj) {
                this.f23143a.m14099Y3((j1c) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.onChatInputDialogDismiss().g()).subscribe(ffw.d(new e30() { // from class: l.zy4
            public final void call(Object obj) {
                this.f23667a.m14095Z3((soj0) obj);
            }
        }));
        m14188d3(hf3.C0605c.class, new w9j() { // from class: l.az4
            public final Object call(Object obj) {
                return this.f7929a.m14100a4((hf3.C0605c) obj);
            }
        });
        duringCreated((c) m25548F2().ChatEvent.changeInputSize().g()).subscribe(ffw.d(new e30() { // from class: l.bz4
            public final void call(Object obj) {
                this.f8426a.m14101b4((Size) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBridgeImplEvent.sendChatMessage().g()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.cz4
            public final void call(Object obj) {
                this.f8997a.m14097V3((sy4) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m14097V3(sy4 sy4Var) {
        if (sy4Var == null) {
            return;
        }
        BLiveChatMessageContentInfo bLiveChatMessageContentInfoM22757a = sy4Var.m22757a();
        m14111m4(bLiveChatMessageContentInfoM22757a.getMessageOnly(), sy4.C0832a.m22759a(bLiveChatMessageContentInfoM22757a));
    }

    /* JADX INFO: renamed from: W3 */
    public AbstractC0583g4.a mo10775W3(String str) {
        if (TextUtils.equals(str, "chatButtonBubble") || TextUtils.equals(str, "bulletCommentButtonBubble") || TextUtils.equals(str, "stormCommentButtonBubble")) {
            return this.f11697i.m25594W3(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m14098X3(sn40 sn40Var) {
        m14111m4(sn40Var.f19133a, sn40Var.f19134b);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m14099Y3(j1c j1cVar) {
        m14110l4(j1cVar.f13526a, j1cVar.f13527b);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ AbstractC0583g4.a m14100a4(hf3.C0605c c0605c) {
        return mo10775W3(c0605c.f12008c);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m14101b4(Size size) {
        if (size.getWidth() > 0) {
            this.f11697i.m25592U3(size.getWidth());
        }
        if (size.getHeight() > 0) {
            this.f11697i.m25598b4(size.getHeight(), this.f11698j.m19045p4());
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m14102c4(String str, BLiveEnvelope bLiveEnvelope) {
        m14108i4(str);
        this.f11698j.m19043n4();
        m25548F2().ChatEvent.onDanmakuSendSuccess().j(new m1c((BLiveUserMask) bLiveEnvelope.data.masks.get(0), bLiveEnvelope.data.videoLiveBulletComment));
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m14103d4(String str) {
        m14113o4(true, str, "0");
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m14104e4(final String str, Throwable th) {
        boolean z = th instanceof TantanException.Client.CoreService;
        if (z && ((TantanException.Client.CoreService) th).code == 41021) {
            m25548F2().FastRechargeEventGroup.showFastRechargeDialog().j(new nig.C0701a().m18781g(2).m18784j("liveGiftDanMuKuClick").m18780f(new d30() { // from class: l.wy4
                public final void call() {
                    this.f22038a.m14103d4(str);
                }
            }).m18779e());
            this.f11698j.m19043n4();
            return;
        }
        if (z) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            String str2 = coreService.metaMessage;
            if (i == 40099) {
                lsi0.j(str2);
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                lsi0.j(str2);
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m14105f4(String str, roj0 roj0Var) {
        m25548F2().ChatEvent.sendMessageResult().j(Boolean.TRUE);
        mo10776j4(str);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m14106g4(Throwable th) {
        m25548F2().ChatEvent.sendMessageResult().j(Boolean.FALSE);
        qlt.m21479a(th);
    }

    /* JADX INFO: renamed from: h4 */
    public void m14107h4() {
        this.f11697i.m25600d4();
    }

    /* JADX INFO: renamed from: i4 */
    public void m14108i4(String str) {
        this.f11698j.m19031A4(str);
    }

    @CallSuper
    /* JADX INFO: renamed from: j4 */
    public void mo10776j4(String str) {
        this.f11698j.m19034D4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14109k4() {
        this.f11700l = "0";
        this.f11702n = "";
        this.f11701m = "";
    }

    /* JADX INFO: renamed from: l4 */
    public void m14110l4(final String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        duringCreated(LivingNormalApiProvider.m4562C7(str, bLiveDanmakuListItem, m25547E2().m17235k(), m25547E2().m17239o(), ((DbObject) m25547E2().m14582l0()).id, m25547E2().m17234j().liveMode)).subscribe(ffw.e(new e30() { // from class: l.dz4
            public final void call(Object obj) {
                this.f9492a.m14102c4(str, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.ez4
            public final void call(Object obj) {
                this.f10053a.m14104e4(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m14111m4(final String str, @Nullable sy4.C0832a c0832a) {
        String strReplace;
        if (c0832a == null) {
            c0832a = new sy4.C0832a("");
        }
        if (this.f11699k.mo18825b(vwb.Y(str, c0832a)).booleanValue()) {
            lsi0.j(ypv.k().Y3());
            return;
        }
        if (!TextUtils.isEmpty(this.f11702n)) {
            this.f11702n = this.f11702n.trim();
        }
        if ("3".equals(this.f11700l) && !TextUtils.isEmpty(this.f11701m) && !TextUtils.isEmpty(this.f11702n) && this.f11702n.contains("@") && str.contains(this.f11702n)) {
            strReplace = str.replace(this.f11702n, "");
            c0832a.f19334b = this.f11701m;
            c0832a.f19335c = this.f11702n.replace("@", "");
        } else {
            m14109k4();
            strReplace = str;
        }
        duringCreated(m25547E2().m14537V1(strReplace, c0832a)).subscribe(ffw.e(new e30() { // from class: l.fz4
            public final void call(Object obj) {
                this.f10693a.m14105f4(str, (roj0) obj);
            }
        }, new e30() { // from class: l.vy4
            public final void call(Object obj) {
                this.f21376a.m14106g4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m14112n4(wu4 wu4Var) {
        if (wu4Var == null) {
            return;
        }
        String str = wu4Var.f21982c;
        this.f11700l = str;
        if ("3".equals(str)) {
            this.f11701m = wu4Var.f21985f;
            this.f11702n = wu4Var.f21981b;
        }
        this.f11697i.m25593V3();
        this.f11697i.m25603h4(false);
        this.f11698j.m19041K4(wu4Var.f21980a, wu4Var.f21981b, wu4Var.f21982c, wu4Var.f21983d, wu4Var.f21984e);
    }

    /* JADX INFO: renamed from: o4 */
    public void m14113o4(boolean z, CharSequence charSequence, String str) {
        this.f11697i.m25593V3();
        this.f11697i.m25603h4(false);
        this.f11698j.m19040J4(z, charSequence, str);
    }
}
