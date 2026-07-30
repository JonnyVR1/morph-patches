package p153l;

import android.text.TextUtils;
import android.util.Size;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMessageContentInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class f05<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public w25<D> f96654i;

    /* JADX INFO: renamed from: j */
    public mw4<D> f96655j;

    /* JADX INFO: renamed from: k */
    public or2 f96656k;

    /* JADX INFO: renamed from: l */
    public String f96657l;

    /* JADX INFO: renamed from: m */
    public String f96658m;

    /* JADX INFO: renamed from: n */
    public String f96659n;

    public f05(dum<D> dumVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(dumVar);
        this.f96656k = (or2) vr4.m202472a(jyb.m147507f0(new zze(), new hez(), new n500()));
        this.f96655j = (mw4) m153103z2(new mw4(dumVar));
        this.f96654i = (w25) m153103z2(new w25(dumVar, chatView, chatInputEntryView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m123456Z3(vxj0 vxj0Var) {
        m123468h4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().ChatEvent.chatInputClick().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.tz4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176739a.m123474n4((vv4) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.sendNormalMessage().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.wz4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191726a.m123459X3((gw40) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.sendDanmakuMessage().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xz4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196831a.m123460Y3((w2c) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.onChatInputDialogDismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.yz4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202170a.m123456Z3((vxj0) obj);
            }
        }));
        m138860d3(vf3.C20827c.class, new qcj() { // from class: l.zz4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f206670a.m123461a4((vf3.C20827c) obj);
            }
        });
        duringCreated((C22421c) m213811F2().ChatEvent.changeInputSize().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.a05
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67688a.m123462b4((Size) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().LiveBridgeImplEvent.sendChatMessage().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.b05
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74249a.m123457V3((rz4) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m123457V3(rz4 rz4Var) {
        if (rz4Var == null) {
            return;
        }
        BLiveChatMessageContentInfo bLiveChatMessageContentInfoM183688a = rz4Var.m183688a();
        m123473m4(bLiveChatMessageContentInfoM183688a.getMessageOnly(), rz4.C19938a.m183690a(bLiveChatMessageContentInfoM183688a));
    }

    /* JADX INFO: renamed from: W3 */
    public AbstractC17128g4.a mo123458W3(String str) {
        if (TextUtils.equals(str, "chatButtonBubble") || TextUtils.equals(str, "bulletCommentButtonBubble") || TextUtils.equals(str, "stormCommentButtonBubble")) {
            return this.f96654i.m204521W3(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m123459X3(gw40 gw40Var) {
        m123473m4(gw40Var.f106726a, gw40Var.f106727b);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m123460Y3(w2c w2cVar) {
        m123472l4(w2cVar.f186893a, w2cVar.f186894b);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ AbstractC17128g4.a m123461a4(vf3.C20827c c20827c) {
        return mo123458W3(c20827c.f183877c);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m123462b4(Size size) {
        if (size.getWidth() > 0) {
            this.f96654i.m204519U3(size.getWidth());
        }
        if (size.getHeight() > 0) {
            this.f96654i.m204525b4(size.getHeight(), this.f96655j.m160443p4());
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m123463c4(String str, BLiveEnvelope bLiveEnvelope) {
        m123469i4(str);
        this.f96655j.m160441n4();
        m213811F2().ChatEvent.onDanmakuSendSuccess().mo199273j(new z2c(bLiveEnvelope.data.masks.get(0), bLiveEnvelope.data.videoLiveBulletComment));
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m123464d4(String str) {
        m123475o4(true, str, "0");
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m123465e4(final String str, Throwable th) {
        boolean z = th instanceof TantanException.Client.CoreService;
        if (z && ((TantanException.Client.CoreService) th).code == 41021) {
            m213811F2().FastRechargeEventGroup.showFastRechargeDialog().mo199273j(new bkg.C16028a().m104805g(2).m104808j("liveGiftDanMuKuClick").m104804f(new x20() { // from class: l.vz4
                @Override // p153l.x20
                public final void call() {
                    this.f186440a.m123464d4(str);
                }
            }).m104803e());
            this.f96655j.m160441n4();
            return;
        }
        if (z) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            String str2 = coreService.metaMessage;
            if (i == 40099) {
                o1j0.m165636j(str2);
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                o1j0.m165636j(str2);
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m123466f4(String str, uxj0 uxj0Var) {
        m213811F2().ChatEvent.sendMessageResult().mo199273j(Boolean.TRUE);
        mo123470j4(str);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m123467g4(Throwable th) {
        m213811F2().ChatEvent.sendMessageResult().mo199273j(Boolean.FALSE);
        snt.m187001a(th);
    }

    /* JADX INFO: renamed from: h4 */
    public void m123468h4() {
        this.f96654i.m204527d4();
    }

    /* JADX INFO: renamed from: i4 */
    public void m123469i4(String str) {
        this.f96655j.m160430A4(str);
    }

    @CallSuper
    /* JADX INFO: renamed from: j4 */
    public void mo123470j4(String str) {
        this.f96655j.m160433D4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m123471k4() {
        this.f96657l = "0";
        this.f96659n = "";
        this.f96658m = "";
    }

    /* JADX INFO: renamed from: l4 */
    public void m123472l4(final String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        duringCreated(LivingNormalApiProvider.m72379C7(str, bLiveDanmakuListItem, m213810E2().m202191k(), m213810E2().m202194o(), m213810E2().m168532l0().f56859id, m213810E2().mo183435j().liveMode)).subscribe(dhw.m115826e(new y20() { // from class: l.c05
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79205a.m123463c4(str, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.d05
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84525a.m123465e4(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m123473m4(final String str, @Nullable rz4.C19938a c19938a) {
        String strReplace;
        if (c19938a == null) {
            c19938a = new rz4.C19938a("");
        }
        if (this.f96656k.mo168854b(jyb.m147494Y(str, c19938a)).booleanValue()) {
            o1j0.m165636j(zrv.m221193k().m203562Y3());
            return;
        }
        if (!TextUtils.isEmpty(this.f96659n)) {
            this.f96659n = this.f96659n.trim();
        }
        if ("3".equals(this.f96657l) && !TextUtils.isEmpty(this.f96658m) && !TextUtils.isEmpty(this.f96659n) && this.f96659n.contains("@") && str.contains(this.f96659n)) {
            strReplace = str.replace(this.f96659n, "");
            c19938a.f165486b = this.f96658m;
            c19938a.f165487c = this.f96659n.replace("@", "");
        } else {
            m123471k4();
            strReplace = str;
        }
        duringCreated(m213810E2().m168487V1(strReplace, c19938a)).subscribe(dhw.m115826e(new y20() { // from class: l.e05
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91411a.m123466f4(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.uz4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181700a.m123467g4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m123474n4(vv4 vv4Var) {
        if (vv4Var == null) {
            return;
        }
        String str = vv4Var.f185890c;
        this.f96657l = str;
        if ("3".equals(str)) {
            this.f96658m = vv4Var.f185893f;
            this.f96659n = vv4Var.f185889b;
        }
        this.f96654i.m204520V3();
        this.f96654i.m204530h4(false);
        this.f96655j.m160440K4(vv4Var.f185888a, vv4Var.f185889b, vv4Var.f185890c, vv4Var.f185891d, vv4Var.f185892e);
    }

    /* JADX INFO: renamed from: o4 */
    public void m123475o4(boolean z, CharSequence charSequence, String str) {
        this.f96654i.m204520V3();
        this.f96654i.m204530h4(false);
        this.f96655j.m160439J4(z, charSequence, str);
    }
}
