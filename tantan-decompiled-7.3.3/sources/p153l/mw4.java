package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;
import p151v.VCheckBox;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class mw4<D extends oo2> extends nn2<D, ix4> {

    /* JADX INFO: renamed from: u */
    public static boolean f139010u = false;

    /* JADX INFO: renamed from: j */
    @Nullable
    public cv40 f139011j;

    /* JADX INFO: renamed from: k */
    public vw40<D> f139012k;

    /* JADX INFO: renamed from: l */
    public final int f139013l;

    /* JADX INFO: renamed from: m */
    public int f139014m;

    /* JADX INFO: renamed from: n */
    public final jxd0 f139015n;

    /* JADX INFO: renamed from: o */
    public final xyd0 f139016o;

    /* JADX INFO: renamed from: p */
    public String f139017p;

    /* JADX INFO: renamed from: q */
    public BLiveChatTip f139018q;

    /* JADX INFO: renamed from: r */
    public pv40 f139019r;

    /* JADX INFO: renamed from: s */
    public boolean f139020s;

    /* JADX INFO: renamed from: t */
    public boolean f139021t;

    public mw4(dum<D> dumVar) {
        super(dumVar);
        this.f139013l = qa00.f156327n;
        this.f139015n = new jxd0("confirm_send_danmaku_dialog_show" + zrv.f205799a.m207631D0(), Boolean.TRUE);
        this.f139016o = new xyd0("danmaku_selected_input_hint_" + zrv.f205799a.m207631D0(), new HashSet());
        this.f139020s = zrv.m221193k().m203645i7();
        this.f139021t = true;
        mo52715C(new ix4(this));
        if (this.f139020s) {
            this.f139019r = (pv40) m153103z2(new pv40(dumVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m160429r4(vxj0 vxj0Var) {
        m160441n4();
    }

    /* JADX INFO: renamed from: A4 */
    public void m160430A4(String str) {
        ((ix4) this.viewModel).m142418Y(str);
    }

    /* JADX INFO: renamed from: B4 */
    public void m160431B4(int i) {
        m213811F2().KeyboardEvent.show().mo199273j(new KeyboardEventData(KeyboardEventData.Action.Hide, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX INFO: renamed from: C4 */
    public void m160432C4(Boolean bool, int i) {
        int i2;
        vw40<D> vw40Var = this.f139012k;
        boolean zM203062k4 = vw40Var != null ? vw40Var.m203062k4() : false;
        if (i > 0 && this.f139014m == 0) {
            this.f139014m = i;
        }
        if (bool.booleanValue()) {
            i2 = this.f139014m + this.f139013l;
            m160434E4(i2);
        } else {
            i2 = this.f139013l;
            m160431B4(i2);
        }
        m213811F2().ChatEvent.keyboardDetectorChange().mo199273j(new c0r(bool.booleanValue(), i2, zM203062k4));
    }

    /* JADX INFO: renamed from: D4 */
    public void m160433D4(String str) {
        ((ix4) this.viewModel).m142418Y(str);
    }

    /* JADX INFO: renamed from: E4 */
    public void m160434E4(int i) {
        m213811F2().KeyboardEvent.show().mo199273j(new KeyboardEventData(KeyboardEventData.Action.Show, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX INFO: renamed from: F4 */
    public void m160435F4(BLiveChatTip bLiveChatTip) {
        this.f139018q = bLiveChatTip;
    }

    /* JADX INFO: renamed from: G4 */
    public void m160436G4(String str) {
        if (((ix4) this.viewModel).m142419Z() && !TextUtils.isEmpty(str) && q8g0.m175778J(str) > ix4.f117315F * 2) {
            o1j0.m165651y(String.format(zrv.f205803e.getString(R$string.f47605J2), String.valueOf(ix4.f117315F)));
        } else if (!((ix4) this.viewModel).m142419Z()) {
            m160438I4(str);
        } else {
            m160437H4(str, this.f139011j.m112751j4());
            m160441n4();
        }
    }

    /* JADX INFO: renamed from: H4 */
    public void m160437H4(final String str, final BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null) {
            return;
        }
        if (!zrv.m221193k().m203669l7()) {
            m213811F2().ChatEvent.sendDanmakuMessage().mo199273j(new w2c(str, bLiveDanmakuListItem));
            return;
        }
        if (!this.f139015n.get().booleanValue()) {
            m213811F2().ChatEvent.sendDanmakuMessage().mo199273j(new w2c(str, bLiveDanmakuListItem));
            return;
        }
        View viewInflate = this.f196919f.inflater().inflate(yec0.f199186o0, (ViewGroup) null);
        final VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(mdc0.f136273q0);
        vCheckBox.setChecked(true);
        vCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.iw4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f117244a.m160448v4(bLiveDanmakuListItem, compoundButton, z);
            }
        });
        this.f196919f.dialog().m21519P(viewInflate, true).m21506G0(bLiveDanmakuListItem.confirmingText).m21559v0(zrv.f205803e.getString(R$string.f48348rd), new Runnable() { // from class: l.jw4
            @Override // java.lang.Runnable
            public final void run() {
                this.f122876a.m160449w4(vCheckBox, str, bLiveDanmakuListItem);
            }
        }).m21493A(new DialogInterface.OnCancelListener() { // from class: l.kw4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f129026a.m160450x4(bLiveDanmakuListItem, dialogInterface);
            }
        }).m21543n0(zrv.f205803e.getString(R$string.f48510z), new Runnable() { // from class: l.lw4
            @Override // java.lang.Runnable
            public final void run() {
                this.f133771a.m160451y4(bLiveDanmakuListItem);
            }
        }).m21566z().show();
        i4g0.m138492A("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("live_id", m213810E2().m202191k()));
    }

    /* JADX INFO: renamed from: I4 */
    public void m160438I4(String str) {
        m213811F2().ChatEvent.sendNormalMessage().mo199273j(new gw40(str));
    }

    /* JADX INFO: renamed from: J4 */
    public void m160439J4(boolean z, CharSequence charSequence, String str) {
        m160440K4(z, charSequence, str, null, null);
    }

    /* JADX INFO: renamed from: K4 */
    public void m160440K4(boolean z, CharSequence charSequence, String str, String str2, String str3) {
        ((ix4) this.viewModel).m73017E();
        ((ix4) this.viewModel).m142428i0(this.f139020s);
        if (this.f139020s) {
            if ("1".equals(str)) {
                this.f139011j.m112750i4(str2, str3);
                ((ix4) this.viewModel).f117328r.setChecked(true);
            } else if (this.f139021t) {
                ((ix4) this.viewModel).f117328r.setChecked(f139010u);
                this.f139021t = false;
            }
        }
        m213811F2().GiftDialogEventGroup.dismissGiftDialog().mo199273j(10200);
        m213811F2().PlugPubEvent.dismissContributeDialog().mo199273j(10200);
        ((ix4) this.viewModel).m142426g0(z, charSequence);
        ((ix4) this.viewModel).m142431l0();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        m213811F2().ChatEvent.onChatInputDialogDismiss().m199277p();
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("vipServiceBubble");
        m160431B4(0);
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        this.f139012k.m203063l4(this.f139018q, ((ix4) this.viewModel).m142419Z());
        ((ix4) this.viewModel).f117329s.requestFocus();
        m138879z3(180L, new Runnable() { // from class: l.cw4
            @Override // java.lang.Runnable
            public final void run() {
                this.f84092a.m160446t4();
            }
        });
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        this.f139012k = (vw40) m153103z2(new vw40(this.f196918e, ((ix4) this.viewModel).f117324n));
        if (this.f139020s) {
            dum<? extends T> dumVar = this.f196918e;
            pv40 pv40Var = this.f139019r;
            V v2 = this.viewModel;
            this.f139011j = (cv40) m153103z2(new cv40(dumVar, this, pv40Var, ((ix4) v2).f117326p, ((ix4) v2).f117325o));
            ((ix4) this.viewModel).f117327q.setHeightChangeAction(new Function1() { // from class: l.dw4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f90992a.m160447u4((Integer) obj);
                }
            });
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.f139017p = xau.m209910t(R$string.f47909Xa);
        duringCreated((C22421c) m213811F2().ChatEvent.dismissDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ew4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96090a.m160429r4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.onDanmakuSelectedItemChange().m199270g()).skip(1).subscribe(dhw.m115825d(new y20() { // from class: l.fw4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101121a.m160452z4((BLiveDanmakuListItem) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().ChatEvent.customChatInputStyle().m199270g()).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.gw4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveChatBox) obj).content != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.hw4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111865a.m160445s4((BLiveChatBox) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m160441n4() {
        V v2 = this.viewModel;
        if (v2 == 0 || ((ix4) v2).f117329s == null || !((ix4) v2).isShowing()) {
            return;
        }
        Act act = this.f196919f;
        if (act != null) {
            act.hideInput(((ix4) this.viewModel).f117329s);
        }
        ((ix4) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: o4 */
    public AbstractC17128g4.a m160442o4(String str) {
        vw40<D> vw40Var;
        if (TextUtils.equals(str, "vipServiceBubble") && ((ix4) this.viewModel).isShowing() && (vw40Var = this.f139012k) != null) {
            return new AbstractC17128g4.a(vw40Var.m203061j4(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m160443p4() {
        return ((ix4) this.viewModel).isShowing();
    }

    /* JADX INFO: renamed from: q4 */
    public boolean m160444q4() {
        return ((ix4) this.viewModel).m142419Z();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m160445s4(BLiveChatBox bLiveChatBox) {
        if (TextUtils.isEmpty(bLiveChatBox.content.text)) {
            return;
        }
        this.f139017p = bLiveChatBox.content.text;
        if (((ix4) this.viewModel).isShowing() || ((ix4) this.viewModel).m142419Z()) {
            return;
        }
        ((ix4) this.viewModel).m142425f0(this.f139017p);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m160446t4() {
        if (((ix4) this.viewModel).isShowing()) {
            this.f196919f.showInput(((ix4) this.viewModel).f117329s, 0);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ Unit m160447u4(Integer num) {
        this.f139011j.m112758q4(num.intValue());
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m160448v4(BLiveDanmakuListItem bLiveDanmakuListItem, CompoundButton compoundButton, boolean z) {
        i4g0.m138523u("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("click_op", z ? "display_on" : "display_off"), jyb.m147494Y("live_id", m213810E2().m202191k()));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m160449w4(VCheckBox vCheckBox, String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        this.f139015n.put(Boolean.valueOf(!vCheckBox.isChecked()));
        m213811F2().ChatEvent.sendDanmakuMessage().mo199273j(new w2c(str, bLiveDanmakuListItem));
        i4g0.m138523u("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("click_op", "send"), jyb.m147494Y("live_id", m213810E2().m202191k()));
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m160450x4(BLiveDanmakuListItem bLiveDanmakuListItem, DialogInterface dialogInterface) {
        i4g0.m138523u("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("click_op", "disappear"), jyb.m147494Y("live_id", m213810E2().m202191k()));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m160451y4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        i4g0.m138523u("e_live_bullet_popup", mo78457R2(), jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("click_op", "cancel"), jyb.m147494Y("live_id", m213810E2().m202191k()));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m160452z4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null) {
            return;
        }
        if (TextUtils.isEmpty(bLiveDanmakuListItem.firstInputPlaceholder)) {
            ((ix4) this.viewModel).m142425f0(bLiveDanmakuListItem.inputPlaceholder);
            return;
        }
        HashSet<String> hashSet = this.f139016o.get();
        boolean zContains = hashSet.contains(bLiveDanmakuListItem.type);
        V v2 = this.viewModel;
        if (zContains) {
            ((ix4) v2).m142425f0(bLiveDanmakuListItem.inputPlaceholder);
            return;
        }
        ((ix4) v2).m142425f0(bLiveDanmakuListItem.firstInputPlaceholder);
        hashSet.add(bLiveDanmakuListItem.type);
        this.f139016o.put(hashSet);
    }
}
