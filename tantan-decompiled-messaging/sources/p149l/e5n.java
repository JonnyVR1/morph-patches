package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import java.util.HashSet;
import p147v.VCheckBox;

/* JADX INFO: loaded from: classes5.dex */
public class e5n extends gn2<nnn0, q5n> {

    /* JADX INFO: renamed from: j */
    public long f89441j;

    /* JADX INFO: renamed from: k */
    public String f89442k;

    /* JADX INFO: renamed from: l */
    public String f89443l;

    /* JADX INFO: renamed from: m */
    public String f89444m;

    /* JADX INFO: renamed from: n */
    public String f89445n;

    /* JADX INFO: renamed from: o */
    public final int f89446o;

    /* JADX INFO: renamed from: p */
    public int f89447p;

    /* JADX INFO: renamed from: q */
    public final hpd0 f89448q;

    /* JADX INFO: renamed from: r */
    public final vqd0 f89449r;

    /* JADX INFO: renamed from: s */
    public String f89450s;

    /* JADX INFO: renamed from: t */
    public boolean f89451t;

    /* JADX INFO: renamed from: u */
    public c7n f89452u;

    public e5n(bsm bsmVar) {
        super(bsmVar);
        this.f89446o = t100.f167265n;
        this.f89448q = new hpd0("intl_confirm_send_danmaku_dialog_show" + ypv.f199493a.m199309D0(), Boolean.TRUE);
        this.f89449r = new vqd0("intl_danmaku_selected_input_hint_" + ypv.f199493a.m199309D0(), new HashSet());
        this.f89451t = false;
        mo51532C(new q5n(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m114835A4(soj0 soj0Var) {
        m114876u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m114836B4(BLiveChatBox bLiveChatBox) {
        if (TextUtils.isEmpty(bLiveChatBox.content.text)) {
            return;
        }
        this.f89450s = bLiveChatBox.content.text;
        if (((q5n) this.viewModel).isShowing() || ((q5n) this.viewModel).m173077U()) {
            return;
        }
        ((q5n) this.viewModel).m173084d0(this.f89450s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public void m114837M4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null || !this.f89451t) {
            return;
        }
        if (TextUtils.isEmpty(bLiveDanmakuListItem.firstInputPlaceholder)) {
            ((q5n) this.viewModel).m173084d0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveDanmakuListItem.inputPlaceholder);
            return;
        }
        HashSet<String> hashSet = this.f89449r.get();
        boolean zContains = hashSet.contains(bLiveDanmakuListItem.type);
        V v2 = this.viewModel;
        if (zContains) {
            ((q5n) v2).m173084d0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveDanmakuListItem.inputPlaceholder);
        } else {
            ((q5n) v2).m173084d0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveDanmakuListItem.firstInputPlaceholder);
            hashSet.add(bLiveDanmakuListItem.type);
            this.f89449r.put(hashSet);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    private void m114838Q4() {
        this.f89445n = "0";
        this.f89444m = "";
        this.f89443l = "";
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m114854C4(sy4 sy4Var) {
        m114870U4(sy4Var.m186606a().getMessageOnly(), "user");
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m114855D4(String str) {
        m114873X4(true, str, "0");
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m114856E4() {
        if (((q5n) this.viewModel).isShowing()) {
            this.f188513f.showInput(((q5n) this.viewModel).f152803q, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m114859H4(BLiveDanmakuListItem bLiveDanmakuListItem, CompoundButton compoundButton, boolean z) {
        zvf0.m220399u("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", ((nnn0) m206027E2()).m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("click_op", z ? "display_on" : "display_off"), vwb.m200311Y("live_id", ((nnn0) m206027E2()).m149814k()));
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m114860I4(VCheckBox vCheckBox, String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        this.f89448q.put(Boolean.valueOf(!vCheckBox.isChecked()));
        m114868S4(str, bLiveDanmakuListItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m114861J4(BLiveDanmakuListItem bLiveDanmakuListItem, DialogInterface dialogInterface) {
        zvf0.m220399u("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", ((nnn0) m206027E2()).m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("click_op", "disappear"), vwb.m200311Y("live_id", ((nnn0) m206027E2()).m149814k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m114862K4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        zvf0.m220399u("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", ((nnn0) m206027E2()).m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("click_op", "cancel"), vwb.m200311Y("live_id", ((nnn0) m206027E2()).m149814k()));
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m114863L4(String str, roj0 roj0Var) {
        m114881z4(str);
    }

    /* JADX INFO: renamed from: N4 */
    public void m114864N4(int i) {
        m206028F2().KeyboardEvent.show().mo172463j(new KeyboardEventData(KeyboardEventData.Action.Hide, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        m206028F2().ChatEvent.onChatInputDialogDismiss().m172467p();
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("vipServiceBubble");
        m114864N4(0);
    }

    /* JADX INFO: renamed from: O4 */
    public void m114865O4(Boolean bool, int i) {
        int i2;
        if (i > 0 && this.f89447p == 0) {
            this.f89447p = i;
        }
        if (bool.booleanValue()) {
            i2 = this.f89447p + this.f89446o;
            m114866P4(i2);
        } else {
            i2 = this.f89446o;
            m114864N4(i2);
        }
        m206028F2().ChatEvent.keyboardDetectorChange().mo172463j(new cyq(bool.booleanValue(), i2, false));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        ((q5n) this.viewModel).f152803q.requestFocus();
        m129320z3(180L, new Runnable() { // from class: l.n4n
            @Override // java.lang.Runnable
            public final void run() {
                this.f137116a.m114856E4();
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public void m114866P4(int i) {
        m206028F2().KeyboardEvent.show().mo172463j(new KeyboardEventData(KeyboardEventData.Action.Show, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        bsm<? extends T> bsmVar = this.f188512e;
        V v2 = this.viewModel;
        this.f89452u = (c7n) m144512z2(new c7n(bsmVar, ((q5n) v2).f152800n, ((q5n) v2).f152802p, this));
        m144512z2(new v9n(this.f188512e, ((q5n) this.viewModel).f152806t));
    }

    /* JADX INFO: renamed from: R4 */
    public void m114867R4(String str) {
        if (((q5n) this.viewModel).m173077U() && !TextUtils.isEmpty(str)) {
            int iM133843J = i0g0.m133843J(str);
            int i = q5n.f152794C;
            if (iM133843J > i * 2) {
                lsi0.m151595y(w8u.m202218u(R$string.f46757J2, Integer.valueOf(i)));
                return;
            }
        }
        if (!((q5n) this.viewModel).m173077U()) {
            m114870U4(str, "user");
        } else {
            m114869T4(str, this.f89452u.f79634k);
            m114876u4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public void m114868S4(final String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        duringCreated(x6n.m207184d(str, bLiveDanmakuListItem, ((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).m132146l0().f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.s4n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162453a.m114857F4(str, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.t4n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167738a.m114858G4(str, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.f89450s = w8u.m202217t(R$string.f47061Xa);
        duringCreated(m206028F2().ChatEvent.dismissDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.v4n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179948a.m114835A4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().ChatEvent.onDanmakuSelectedItemChange().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.w4n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184576a.m114837M4((BLiveDanmakuListItem) obj);
            }
        }));
        duringCreated(m206028F2().ChatEvent.customChatInputStyle().m172460g()).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.x4n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveChatBox) obj).content != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.y4n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196306a.m114836B4((BLiveChatBox) obj);
            }
        }));
        m129304h3(m206028F2().ChatEvent.chatInputClick(), new e30() { // from class: l.z4n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201622a.m114872W4((wu4) obj);
            }
        });
        duringCreated(m206028F2().LiveBridgeImplEvent.sendChatMessage().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.a5n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67713a.m114854C4((sy4) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160262Z2()).subscribe(ffw.m121197h(new e30() { // from class: l.b5n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73681a.m114878w4((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T4 */
    public void m114869T4(final String str, final BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null) {
            return;
        }
        if (!ypv.m215672k().m195882l7()) {
            m114868S4(str, bLiveDanmakuListItem);
            return;
        }
        if (!this.f89448q.get().booleanValue()) {
            m114868S4(str, bLiveDanmakuListItem);
            return;
        }
        View viewInflate = this.f188513f.inflater().inflate(t6c0.f168454o0, (ViewGroup) null);
        final VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(g5c0.f101028q0);
        vCheckBox.setChecked(true);
        vCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.o4n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f141802a.m114859H4(bLiveDanmakuListItem, compoundButton, z);
            }
        });
        this.f188513f.dialog().m20520P(viewInflate, true).m20507G0(bLiveDanmakuListItem.confirmingText).m20560v0(ypv.f199497e.getString(R$string.f47500rd), new Runnable() { // from class: l.p4n
            @Override // java.lang.Runnable
            public final void run() {
                this.f147195a.m114860I4(vCheckBox, str, bLiveDanmakuListItem);
            }
        }).m20494A(new DialogInterface.OnCancelListener() { // from class: l.q4n
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f152651a.m114861J4(bLiveDanmakuListItem, dialogInterface);
            }
        }).m20544n0(ypv.f199497e.getString(R$string.f47662z), new Runnable() { // from class: l.r4n
            @Override // java.lang.Runnable
            public final void run() {
                this.f157712a.m114862K4(bLiveDanmakuListItem);
            }
        }).m20567z().show();
        zvf0.m220368A("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", ((nnn0) m206027E2()).m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("live_id", ((nnn0) m206027E2()).m149814k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public void m114870U4(final String str, String str2) {
        String strReplace;
        if (str.length() == 0) {
            return;
        }
        if (!m114874s4(str, str2)) {
            lsi0.m151580j(ypv.m215672k().m195775Y3());
            return;
        }
        sy4.C20071a c20071a = new sy4.C20071a("");
        if (!TextUtils.isEmpty(this.f89444m)) {
            this.f89444m = this.f89444m.trim();
        }
        if ("3".equals(this.f89445n) && !TextUtils.isEmpty(this.f89443l) && !TextUtils.isEmpty(this.f89444m) && this.f89444m.contains("@") && str.contains(this.f89444m)) {
            strReplace = str.replace(this.f89444m, "");
            c20071a.f166890b = this.f89443l;
            c20071a.f166891c = this.f89444m.replace("@", "");
        } else {
            m114838Q4();
            strReplace = str;
        }
        this.f89441j = mqi0.m155944o();
        this.f89442k = strReplace;
        duringCreated(((nnn0) m206027E2()).m132101V1(strReplace, c20071a)).subscribe(ffw.m121194e(new e30() { // from class: l.c5n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79402a.m114863L4(str, (roj0) obj);
            }
        }, new e30() { // from class: l.d5n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84545a.m114880y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public void m114871V4(boolean z) {
        ((q5n) this.viewModel).m173088i0(z);
    }

    /* JADX INFO: renamed from: W4 */
    public void m114872W4(wu4 wu4Var) {
        if (wu4Var == null) {
            return;
        }
        String str = wu4Var.f188083c;
        this.f89445n = str;
        if ("3".equals(str)) {
            this.f89443l = wu4Var.f188086f;
            this.f89444m = wu4Var.f188082b;
        }
        m114873X4(wu4Var.f188081a, wu4Var.f188082b, wu4Var.f188083c);
    }

    /* JADX INFO: renamed from: X4 */
    public void m114873X4(boolean z, CharSequence charSequence, String str) {
        ((q5n) this.viewModel).m71834E();
        boolean zEquals = "1".equals(str);
        V v2 = this.viewModel;
        if (zEquals) {
            ((q5n) v2).m173087h0(true);
        } else {
            ((q5n) v2).m173087h0(this.f89451t);
        }
        m206028F2().GiftDialogEventGroup.dismissGiftDialog().mo172463j(10200);
        m206028F2().PlugPubEvent.dismissContributeDialog().mo172463j(10200);
        ((q5n) this.viewModel).m173085e0(z, charSequence);
        ((q5n) this.viewModel).m173090m0();
    }

    /* JADX INFO: renamed from: s4 */
    public final boolean m114874s4(String str, String str2) {
        if (mqi0.m155944o() - this.f89441j < ypv.m215672k().m195688N4()) {
            return false;
        }
        return m114875t4(str, str2);
    }

    /* JADX INFO: renamed from: t4 */
    public final boolean m114875t4(String str, String str2) {
        if (mqi0.m155944o() - this.f89441j < ypv.m215672k().m195903o4() * 1000) {
            return !str.equals(this.f89442k);
        }
        return true;
    }

    /* JADX INFO: renamed from: u4 */
    public void m114876u4() {
        V v2 = this.viewModel;
        if (v2 == 0 || ((q5n) v2).f152803q == null || !((q5n) v2).isShowing()) {
            return;
        }
        Act act = this.f188513f;
        if (act != null) {
            act.hideInput(((q5n) this.viewModel).f152803q);
        }
        ((q5n) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public void m114858G4(Throwable th, final String str) {
        boolean z = th instanceof TantanException.Client.CoreService;
        if (z && ((TantanException.Client.CoreService) th).code == 41021) {
            m206028F2().FastRechargeEventGroup.showFastRechargeDialog().mo172463j(new nig.C18699a().m159507g(2).m159510j("liveGiftDanMuKuClick").m159506f(new d30() { // from class: l.u4n
                @Override // p149l.d30
                public final void call() {
                    this.f174610a.m114855D4(str);
                }
            }).m159505e());
            ((q5n) this.viewModel).mo71838p();
            return;
        }
        if (z) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            String str2 = coreService.metaMessage;
            if (i == 40099) {
                lsi0.m151580j(str2);
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                lsi0.m151580j(str2);
            }
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m114878w4(BLiveVoiceCall bLiveVoiceCall) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((q5n) v2).m173075S(alk0.m97309h(bLiveVoiceCall));
        }
    }

    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public final void m114857F4(BLiveEnvelope bLiveEnvelope, String str) {
        ((q5n) this.viewModel).m173074R(str);
        ((q5n) this.viewModel).mo71838p();
        m206028F2().ChatEvent.onDanmakuSendSuccess().mo172463j(new m1c(bLiveEnvelope.data.masks.get(0), bLiveEnvelope.data.voiceLiveBulletComment));
    }

    /* JADX INFO: renamed from: y4 */
    public void m114880y4(Throwable th) {
        m206028F2().ChatEvent.sendMessageResult().mo172463j(Boolean.FALSE);
        qlt.m175502a(th);
    }

    /* JADX INFO: renamed from: z4 */
    public void m114881z4(String str) {
        m206028F2().ChatEvent.sendMessageResult().mo172463j(Boolean.TRUE);
        ((q5n) this.viewModel).m173074R(str);
        m114838Q4();
    }
}
