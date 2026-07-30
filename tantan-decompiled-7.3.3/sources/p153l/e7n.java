package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import java.util.HashSet;
import p151v.VCheckBox;

/* JADX INFO: loaded from: classes5.dex */
public class e7n extends nn2<rwn0, q7n> {

    /* JADX INFO: renamed from: j */
    public long f92449j;

    /* JADX INFO: renamed from: k */
    public String f92450k;

    /* JADX INFO: renamed from: l */
    public String f92451l;

    /* JADX INFO: renamed from: m */
    public String f92452m;

    /* JADX INFO: renamed from: n */
    public String f92453n;

    /* JADX INFO: renamed from: o */
    public final int f92454o;

    /* JADX INFO: renamed from: p */
    public int f92455p;

    /* JADX INFO: renamed from: q */
    public final jxd0 f92456q;

    /* JADX INFO: renamed from: r */
    public final xyd0 f92457r;

    /* JADX INFO: renamed from: s */
    public String f92458s;

    /* JADX INFO: renamed from: t */
    public boolean f92459t;

    /* JADX INFO: renamed from: u */
    public c9n f92460u;

    public e7n(dum dumVar) {
        super(dumVar);
        this.f92454o = qa00.f156327n;
        this.f92456q = new jxd0("intl_confirm_send_danmaku_dialog_show" + zrv.f205799a.m207631D0(), Boolean.TRUE);
        this.f92457r = new xyd0("intl_danmaku_selected_input_hint_" + zrv.f205799a.m207631D0(), new HashSet());
        this.f92459t = false;
        mo52715C(new q7n(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m119714A4(vxj0 vxj0Var) {
        m119755u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m119715B4(BLiveChatBox bLiveChatBox) {
        if (TextUtils.isEmpty(bLiveChatBox.content.text)) {
            return;
        }
        this.f92458s = bLiveChatBox.content.text;
        if (((q7n) this.viewModel).isShowing() || ((q7n) this.viewModel).m175685U()) {
            return;
        }
        ((q7n) this.viewModel).m175692d0(this.f92458s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public void m119716M4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null || !this.f92459t) {
            return;
        }
        if (TextUtils.isEmpty(bLiveDanmakuListItem.firstInputPlaceholder)) {
            ((q7n) this.viewModel).m175692d0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveDanmakuListItem.inputPlaceholder);
            return;
        }
        HashSet<String> hashSet = this.f92457r.get();
        boolean zContains = hashSet.contains(bLiveDanmakuListItem.type);
        V v2 = this.viewModel;
        if (zContains) {
            ((q7n) v2).m175692d0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveDanmakuListItem.inputPlaceholder);
        } else {
            ((q7n) v2).m175692d0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveDanmakuListItem.firstInputPlaceholder);
            hashSet.add(bLiveDanmakuListItem.type);
            this.f92457r.put(hashSet);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    private void m119717Q4() {
        this.f92453n = "0";
        this.f92452m = "";
        this.f92451l = "";
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m119733C4(rz4 rz4Var) {
        m119749U4(rz4Var.m183688a().getMessageOnly(), "user");
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m119734D4(String str) {
        m119752X4(true, str, "0");
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m119735E4() {
        if (((q7n) this.viewModel).isShowing()) {
            this.f196919f.showInput(((q7n) this.viewModel).f155983q, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m119738H4(BLiveDanmakuListItem bLiveDanmakuListItem, CompoundButton compoundButton, boolean z) {
        i4g0.m138523u("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", ((rwn0) m213810E2()).m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("click_op", z ? "display_on" : "display_off"), jyb.m147494Y("live_id", ((rwn0) m213810E2()).m202191k()));
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m119739I4(VCheckBox vCheckBox, String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        this.f92456q.put(Boolean.valueOf(!vCheckBox.isChecked()));
        m119747S4(str, bLiveDanmakuListItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m119740J4(BLiveDanmakuListItem bLiveDanmakuListItem, DialogInterface dialogInterface) {
        i4g0.m138523u("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", ((rwn0) m213810E2()).m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("click_op", "disappear"), jyb.m147494Y("live_id", ((rwn0) m213810E2()).m202191k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m119741K4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        i4g0.m138523u("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", ((rwn0) m213810E2()).m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("click_op", "cancel"), jyb.m147494Y("live_id", ((rwn0) m213810E2()).m202191k()));
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m119742L4(String str, uxj0 uxj0Var) {
        m119760z4(str);
    }

    /* JADX INFO: renamed from: N4 */
    public void m119743N4(int i) {
        m213811F2().KeyboardEvent.show().mo199273j(new KeyboardEventData(KeyboardEventData.Action.Hide, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        m213811F2().ChatEvent.onChatInputDialogDismiss().m199277p();
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("vipServiceBubble");
        m119743N4(0);
    }

    /* JADX INFO: renamed from: O4 */
    public void m119744O4(Boolean bool, int i) {
        int i2;
        if (i > 0 && this.f92455p == 0) {
            this.f92455p = i;
        }
        if (bool.booleanValue()) {
            i2 = this.f92455p + this.f92454o;
            m119745P4(i2);
        } else {
            i2 = this.f92454o;
            m119743N4(i2);
        }
        m213811F2().ChatEvent.keyboardDetectorChange().mo199273j(new c0r(bool.booleanValue(), i2, false));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        ((q7n) this.viewModel).f155983q.requestFocus();
        m138879z3(180L, new Runnable() { // from class: l.n6n
            @Override // java.lang.Runnable
            public final void run() {
                this.f140476a.m119735E4();
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public void m119745P4(int i) {
        m213811F2().KeyboardEvent.show().mo199273j(new KeyboardEventData(KeyboardEventData.Action.Show, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        dum<? extends T> dumVar = this.f196918e;
        V v2 = this.viewModel;
        this.f92460u = (c9n) m153103z2(new c9n(dumVar, ((q7n) v2).f155980n, ((q7n) v2).f155982p, this));
        m153103z2(new vbn(this.f196918e, ((q7n) this.viewModel).f155986t));
    }

    /* JADX INFO: renamed from: R4 */
    public void m119746R4(String str) {
        if (((q7n) this.viewModel).m175685U() && !TextUtils.isEmpty(str)) {
            int iM175778J = q8g0.m175778J(str);
            int i = q7n.f155974C;
            if (iM175778J > i * 2) {
                o1j0.m165651y(xau.m209911u(R$string.f47605J2, Integer.valueOf(i)));
                return;
            }
        }
        if (!((q7n) this.viewModel).m175685U()) {
            m119749U4(str, "user");
        } else {
            m119748T4(str, this.f92460u.f80506k);
            m119755u4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public void m119747S4(final String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        duringCreated(x8n.m209743d(str, bLiveDanmakuListItem, ((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).m168532l0().f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.s6n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166591a.m119736F4(str, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.t6n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172352a.m119737G4(str, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.f92458s = xau.m209910t(R$string.f47909Xa);
        duringCreated(m213811F2().ChatEvent.dismissDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.v6n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182672a.m119714A4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().ChatEvent.onDanmakuSelectedItemChange().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.w6n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187636a.m119716M4((BLiveDanmakuListItem) obj);
            }
        }));
        duringCreated(m213811F2().ChatEvent.customChatInputStyle().m199270g()).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.x6n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveChatBox) obj).content != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.y6n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197697a.m119715B4((BLiveChatBox) obj);
            }
        }));
        m138863h3(m213811F2().ChatEvent.chatInputClick(), new y20() { // from class: l.z6n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203168a.m119751W4((vv4) obj);
            }
        });
        duringCreated(m213811F2().LiveBridgeImplEvent.sendChatMessage().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.a7n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68830a.m119733C4((rz4) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183424Z2()).subscribe(dhw.m115829h(new y20() { // from class: l.b7n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75311a.m119757w4((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T4 */
    public void m119748T4(final String str, final BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null) {
            return;
        }
        if (!zrv.m221193k().m203669l7()) {
            m119747S4(str, bLiveDanmakuListItem);
            return;
        }
        if (!this.f92456q.get().booleanValue()) {
            m119747S4(str, bLiveDanmakuListItem);
            return;
        }
        View viewInflate = this.f196919f.inflater().inflate(yec0.f199186o0, (ViewGroup) null);
        final VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(mdc0.f136273q0);
        vCheckBox.setChecked(true);
        vCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.o6n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f145193a.m119738H4(bLiveDanmakuListItem, compoundButton, z);
            }
        });
        this.f196919f.dialog().m21519P(viewInflate, true).m21506G0(bLiveDanmakuListItem.confirmingText).m21559v0(zrv.f205803e.getString(R$string.f48348rd), new Runnable() { // from class: l.p6n
            @Override // java.lang.Runnable
            public final void run() {
                this.f150865a.m119739I4(vCheckBox, str, bLiveDanmakuListItem);
            }
        }).m21493A(new DialogInterface.OnCancelListener() { // from class: l.q6n
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f155824a.m119740J4(bLiveDanmakuListItem, dialogInterface);
            }
        }).m21543n0(zrv.f205803e.getString(R$string.f48510z), new Runnable() { // from class: l.r6n
            @Override // java.lang.Runnable
            public final void run() {
                this.f161484a.m119741K4(bLiveDanmakuListItem);
            }
        }).m21566z().show();
        i4g0.m138492A("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", ((rwn0) m213810E2()).m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("live_id", ((rwn0) m213810E2()).m202191k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public void m119749U4(final String str, String str2) {
        String strReplace;
        if (str.length() == 0) {
            return;
        }
        if (!m119753s4(str, str2)) {
            o1j0.m165636j(zrv.m221193k().m203562Y3());
            return;
        }
        rz4.C19938a c19938a = new rz4.C19938a("");
        if (!TextUtils.isEmpty(this.f92452m)) {
            this.f92452m = this.f92452m.trim();
        }
        if ("3".equals(this.f92453n) && !TextUtils.isEmpty(this.f92451l) && !TextUtils.isEmpty(this.f92452m) && this.f92452m.contains("@") && str.contains(this.f92452m)) {
            strReplace = str.replace(this.f92452m, "");
            c19938a.f165486b = this.f92451l;
            c19938a.f165487c = this.f92452m.replace("@", "");
        } else {
            m119717Q4();
            strReplace = str;
        }
        this.f92449j = pzi0.m174454o();
        this.f92450k = strReplace;
        duringCreated(((rwn0) m213810E2()).m168487V1(strReplace, c19938a)).subscribe(dhw.m115826e(new y20() { // from class: l.c7n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80122a.m119742L4(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.d7n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85536a.m119759y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public void m119750V4(boolean z) {
        ((q7n) this.viewModel).m175696i0(z);
    }

    /* JADX INFO: renamed from: W4 */
    public void m119751W4(vv4 vv4Var) {
        if (vv4Var == null) {
            return;
        }
        String str = vv4Var.f185890c;
        this.f92453n = str;
        if ("3".equals(str)) {
            this.f92451l = vv4Var.f185893f;
            this.f92452m = vv4Var.f185889b;
        }
        m119752X4(vv4Var.f185888a, vv4Var.f185889b, vv4Var.f185890c);
    }

    /* JADX INFO: renamed from: X4 */
    public void m119752X4(boolean z, CharSequence charSequence, String str) {
        ((q7n) this.viewModel).m73017E();
        boolean zEquals = "1".equals(str);
        V v2 = this.viewModel;
        if (zEquals) {
            ((q7n) v2).m175695h0(true);
        } else {
            ((q7n) v2).m175695h0(this.f92459t);
        }
        m213811F2().GiftDialogEventGroup.dismissGiftDialog().mo199273j(10200);
        m213811F2().PlugPubEvent.dismissContributeDialog().mo199273j(10200);
        ((q7n) this.viewModel).m175693e0(z, charSequence);
        ((q7n) this.viewModel).m175698m0();
    }

    /* JADX INFO: renamed from: s4 */
    public final boolean m119753s4(String str, String str2) {
        if (pzi0.m174454o() - this.f92449j < zrv.m221193k().m203475N4()) {
            return false;
        }
        return m119754t4(str, str2);
    }

    /* JADX INFO: renamed from: t4 */
    public final boolean m119754t4(String str, String str2) {
        if (pzi0.m174454o() - this.f92449j < zrv.m221193k().m203690o4() * 1000) {
            return !str.equals(this.f92450k);
        }
        return true;
    }

    /* JADX INFO: renamed from: u4 */
    public void m119755u4() {
        V v2 = this.viewModel;
        if (v2 == 0 || ((q7n) v2).f155983q == null || !((q7n) v2).isShowing()) {
            return;
        }
        Act act = this.f196919f;
        if (act != null) {
            act.hideInput(((q7n) this.viewModel).f155983q);
        }
        ((q7n) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public void m119737G4(Throwable th, final String str) {
        boolean z = th instanceof TantanException.Client.CoreService;
        if (z && ((TantanException.Client.CoreService) th).code == 41021) {
            m213811F2().FastRechargeEventGroup.showFastRechargeDialog().mo199273j(new bkg.C16028a().m104805g(2).m104808j("liveGiftDanMuKuClick").m104804f(new x20() { // from class: l.u6n
                @Override // p153l.x20
                public final void call() {
                    this.f177796a.m119734D4(str);
                }
            }).m104803e());
            ((q7n) this.viewModel).mo73021p();
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

    /* JADX INFO: renamed from: w4 */
    public final void m119757w4(BLiveVoiceCall bLiveVoiceCall) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((q7n) v2).m175683S(guk0.m132329h(bLiveVoiceCall));
        }
    }

    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public final void m119736F4(BLiveEnvelope bLiveEnvelope, String str) {
        ((q7n) this.viewModel).m175682R(str);
        ((q7n) this.viewModel).mo73021p();
        m213811F2().ChatEvent.onDanmakuSendSuccess().mo199273j(new z2c(bLiveEnvelope.data.masks.get(0), bLiveEnvelope.data.voiceLiveBulletComment));
    }

    /* JADX INFO: renamed from: y4 */
    public void m119759y4(Throwable th) {
        m213811F2().ChatEvent.sendMessageResult().mo199273j(Boolean.FALSE);
        snt.m187001a(th);
    }

    /* JADX INFO: renamed from: z4 */
    public void m119760z4(String str) {
        m213811F2().ChatEvent.sendMessageResult().mo199273j(Boolean.TRUE);
        ((q7n) this.viewModel).m175682R(str);
        m119717Q4();
    }
}
