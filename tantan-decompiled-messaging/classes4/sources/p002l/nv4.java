package p002l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.tantanapp.common.data.DbObject;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.bwr;
import l.e30;
import l.ffw;
import l.hpd0;
import l.i0g0;
import l.j760;
import l.jo0;
import l.lsi0;
import l.s7m;
import l.soj0;
import l.t100;
import l.vqd0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.ypv;
import l.zvf0;
import p002l.ho2;
import rx.c;
import v.VCheckBox;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nv4<D extends ho2> extends gn2<D, jw4> {

    /* JADX INFO: renamed from: u */
    public static boolean f16208u = false;

    /* JADX INFO: renamed from: j */
    @Nullable
    public om40 f16209j;

    /* JADX INFO: renamed from: k */
    public ho40<D> f16210k;

    /* JADX INFO: renamed from: l */
    public final int f16211l;

    /* JADX INFO: renamed from: m */
    public int f16212m;

    /* JADX INFO: renamed from: n */
    public final hpd0 f16213n;

    /* JADX INFO: renamed from: o */
    public final vqd0 f16214o;

    /* JADX INFO: renamed from: p */
    public String f16215p;

    /* JADX INFO: renamed from: q */
    public BLiveChatTip f16216q;

    /* JADX INFO: renamed from: r */
    public bn40 f16217r;

    /* JADX INFO: renamed from: s */
    public boolean f16218s;

    /* JADX INFO: renamed from: t */
    public boolean f16219t;

    public nv4(bsm<D> bsmVar) {
        super(bsmVar);
        this.f16211l = t100.n;
        this.f16213n = new hpd0("confirm_send_danmaku_dialog_show" + ypv.a.D0(), Boolean.TRUE);
        this.f16214o = new vqd0("danmaku_selected_input_hint_" + ypv.a.D0(), new HashSet());
        this.f16218s = ypv.k().i7();
        this.f16219t = true;
        C(new jw4(this));
        if (this.f16218s) {
            this.f16217r = (bn40) z2(new bn40(bsmVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m19030r4(soj0 soj0Var) {
        m19043n4();
    }

    /* JADX INFO: renamed from: A4 */
    public void m19031A4(String str) {
        ((jw4) ((bwr) this).viewModel).m16374Y(str);
    }

    /* JADX INFO: renamed from: B4 */
    public void m19032B4(int i) {
        m25548F2().KeyboardEvent.show().j(new KeyboardEventData(KeyboardEventData.Action.Hide, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX INFO: renamed from: C4 */
    public void m19033C4(Boolean bool, int i) {
        int i2;
        ho40<D> ho40Var = this.f16210k;
        boolean zM14648k4 = ho40Var != null ? ho40Var.m14648k4() : false;
        if (i > 0 && this.f16212m == 0) {
            this.f16212m = i;
        }
        if (bool.booleanValue()) {
            i2 = this.f16212m + this.f16211l;
            m19035E4(i2);
        } else {
            i2 = this.f16211l;
            m19032B4(i2);
        }
        m25548F2().ChatEvent.keyboardDetectorChange().j(new cyq(bool.booleanValue(), i2, zM14648k4));
    }

    /* JADX INFO: renamed from: D4 */
    public void m19034D4(String str) {
        ((jw4) ((bwr) this).viewModel).m16374Y(str);
    }

    /* JADX INFO: renamed from: E4 */
    public void m19035E4(int i) {
        m25548F2().KeyboardEvent.show().j(new KeyboardEventData(KeyboardEventData.Action.Show, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX INFO: renamed from: F4 */
    public void m19036F4(BLiveChatTip bLiveChatTip) {
        this.f16216q = bLiveChatTip;
    }

    /* JADX INFO: renamed from: G4 */
    public void m19037G4(String str) {
        if (((jw4) ((bwr) this).viewModel).m16375Z() && !TextUtils.isEmpty(str) && i0g0.J(str) > jw4.f14065F * 2) {
            lsi0.y(String.format(ypv.e.getString(R$string.f2799J2), String.valueOf(jw4.f14065F)));
        } else if (!((jw4) ((bwr) this).viewModel).m16375Z()) {
            m19039I4(str);
        } else {
            m19038H4(str, this.f16209j.m19616j4());
            m19043n4();
        }
    }

    /* JADX INFO: renamed from: H4 */
    public void m19038H4(final String str, final BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null) {
            return;
        }
        if (!ypv.k().l7()) {
            m25548F2().ChatEvent.sendDanmakuMessage().j(new j1c(str, bLiveDanmakuListItem));
            return;
        }
        if (!((Boolean) this.f16213n.get()).booleanValue()) {
            m25548F2().ChatEvent.sendDanmakuMessage().j(new j1c(str, bLiveDanmakuListItem));
            return;
        }
        View viewInflate = this.f22037f.inflater().inflate(t6c0.f19950o0, (ViewGroup) null);
        final VCheckBox vCheckBoxFindViewById = viewInflate.findViewById(g5c0.f11178q0);
        vCheckBoxFindViewById.setChecked(true);
        vCheckBoxFindViewById.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.jv4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f14046a.m19050v4(bLiveDanmakuListItem, compoundButton, z);
            }
        });
        this.f22037f.dialog().P(viewInflate, true).G0(bLiveDanmakuListItem.confirmingText).v0(ypv.e.getString(R$string.f3542rd), new Runnable() { // from class: l.kv4
            @Override // java.lang.Runnable
            public final void run() {
                this.f14546a.m19051w4(vCheckBoxFindViewById, str, bLiveDanmakuListItem);
            }
        }).A(new DialogInterface.OnCancelListener() { // from class: l.lv4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f15082a.m19052x4(bLiveDanmakuListItem, dialogInterface);
            }
        }).n0(ypv.e.getString(R$string.f3704z), new Runnable() { // from class: l.mv4
            @Override // java.lang.Runnable
            public final void run() {
                this.f15666a.m19053y4(bLiveDanmakuListItem);
            }
        }).z().show();
        zvf0.A("e_live_bullet_popup", mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.Y("bullet_type", bLiveDanmakuListItem.type), vwb.Y("live_id", m25547E2().m17235k())});
    }

    /* JADX INFO: renamed from: I4 */
    public void m19039I4(String str) {
        m25548F2().ChatEvent.sendNormalMessage().j(new sn40(str));
    }

    /* JADX INFO: renamed from: J4 */
    public void m19040J4(boolean z, CharSequence charSequence, String str) {
        m19041K4(z, charSequence, str, null, null);
    }

    /* JADX INFO: renamed from: K4 */
    public void m19041K4(boolean z, CharSequence charSequence, String str, String str2, String str3) {
        ((jw4) ((bwr) this).viewModel).m5211E();
        ((jw4) ((bwr) this).viewModel).m16384i0(this.f16218s);
        if (this.f16218s) {
            if ("1".equals(str)) {
                this.f16209j.m19615i4(str2, str3);
                ((jw4) ((bwr) this).viewModel).f14078r.setChecked(true);
            } else if (this.f16219t) {
                ((jw4) ((bwr) this).viewModel).f14078r.setChecked(f16208u);
                this.f16219t = false;
            }
        }
        m25548F2().GiftDialogEventGroup.dismissGiftDialog().j(10200);
        m25548F2().PlugPubEvent.dismissContributeDialog().j(10200);
        ((jw4) ((bwr) this).viewModel).m16382g0(z, charSequence);
        ((jw4) ((bwr) this).viewModel).m16387l0();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        m25548F2().ChatEvent.onChatInputDialogDismiss().p();
        m25548F2().BootBubbleEvent.dismissBubble().j("vipServiceBubble");
        m19032B4(0);
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        this.f16210k.m14649l4(this.f16216q, ((jw4) ((bwr) this).viewModel).m16375Z());
        ((jw4) ((bwr) this).viewModel).f14079s.requestFocus();
        m14207z3(180L, new Runnable() { // from class: l.dv4
            @Override // java.lang.Runnable
            public final void run() {
                this.f9436a.m19048t4();
            }
        });
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo9823R3() {
        this.f16210k = (ho40) z2(new ho40(this.f22036e, ((jw4) ((bwr) this).viewModel).f14074n));
        if (this.f16218s) {
            bsm<? extends T> bsmVar = this.f22036e;
            bn40 bn40Var = this.f16217r;
            s7m s7mVar = ((bwr) this).viewModel;
            this.f16209j = (om40) z2(new om40(bsmVar, this, bn40Var, ((jw4) s7mVar).f14076p, ((jw4) s7mVar).f14075o));
            ((jw4) ((bwr) this).viewModel).f14077q.setHeightChangeAction(new Function1() { // from class: l.ev4
                public final Object invoke(Object obj) {
                    return this.f9974a.m19049u4((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T */
    public void m19042T() {
        super.T();
        this.f16215p = w8u.t(R$string.f3103Xa);
        duringCreated((c) m25548F2().ChatEvent.dismissDialog().g()).subscribe(ffw.h(new e30() { // from class: l.fv4
            public final void call(Object obj) {
                this.f10641a.m19030r4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.onDanmakuSelectedItemChange().g()).skip(1).subscribe(ffw.d(new e30() { // from class: l.gv4
            public final void call(Object obj) {
                this.f11634a.m19054z4((BLiveDanmakuListItem) obj);
            }
        }));
        duringCreated((c) m25548F2().ChatEvent.customChatInputStyle().g()).observeOn(jo0.a()).filter(new w9j() { // from class: l.hv4
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveChatBox) obj).content != null);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.iv4
            public final void call(Object obj) {
                this.f13429a.m19047s4((BLiveChatBox) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m19043n4() {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar == null || ((jw4) s7mVar).f14079s == null || !((jw4) s7mVar).isShowing()) {
            return;
        }
        Act act = this.f22037f;
        if (act != null) {
            act.hideInput(((jw4) ((bwr) this).viewModel).f14079s);
        }
        ((jw4) ((bwr) this).viewModel).mo5216p();
    }

    /* JADX INFO: renamed from: o4 */
    public AbstractC0583g4.a m19044o4(String str) {
        ho40<D> ho40Var;
        if (TextUtils.equals(str, "vipServiceBubble") && ((jw4) ((bwr) this).viewModel).isShowing() && (ho40Var = this.f16210k) != null) {
            return new AbstractC0583g4.a(ho40Var.m14647j4(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m19045p4() {
        return ((jw4) ((bwr) this).viewModel).isShowing();
    }

    /* JADX INFO: renamed from: q4 */
    public boolean m19046q4() {
        return ((jw4) ((bwr) this).viewModel).m16375Z();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m19047s4(BLiveChatBox bLiveChatBox) {
        if (TextUtils.isEmpty(bLiveChatBox.content.text)) {
            return;
        }
        this.f16215p = bLiveChatBox.content.text;
        if (((jw4) ((bwr) this).viewModel).isShowing() || ((jw4) ((bwr) this).viewModel).m16375Z()) {
            return;
        }
        ((jw4) ((bwr) this).viewModel).m16381f0(this.f16215p);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m19048t4() {
        if (((jw4) ((bwr) this).viewModel).isShowing()) {
            this.f22037f.showInput(((jw4) ((bwr) this).viewModel).f14079s, 0);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ Unit m19049u4(Integer num) {
        this.f16209j.m19623q4(num.intValue());
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m19050v4(BLiveDanmakuListItem bLiveDanmakuListItem, CompoundButton compoundButton, boolean z) {
        zvf0.u("e_live_bullet_popup", mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.Y("bullet_type", bLiveDanmakuListItem.type), vwb.Y("click_op", z ? "display_on" : "display_off"), vwb.Y("live_id", m25547E2().m17235k())});
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m19051w4(VCheckBox vCheckBox, String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        this.f16213n.put(Boolean.valueOf(!vCheckBox.isChecked()));
        m25548F2().ChatEvent.sendDanmakuMessage().j(new j1c(str, bLiveDanmakuListItem));
        zvf0.u("e_live_bullet_popup", mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.Y("bullet_type", bLiveDanmakuListItem.type), vwb.Y("click_op", "send"), vwb.Y("live_id", m25547E2().m17235k())});
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m19052x4(BLiveDanmakuListItem bLiveDanmakuListItem, DialogInterface dialogInterface) {
        zvf0.u("e_live_bullet_popup", mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.Y("bullet_type", bLiveDanmakuListItem.type), vwb.Y("click_op", "disappear"), vwb.Y("live_id", m25547E2().m17235k())});
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m19053y4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        zvf0.u("e_live_bullet_popup", mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.Y("bullet_type", bLiveDanmakuListItem.type), vwb.Y("click_op", "cancel"), vwb.Y("live_id", m25547E2().m17235k())});
    }

    /* JADX INFO: renamed from: z4 */
    public final void m19054z4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null) {
            return;
        }
        if (TextUtils.isEmpty(bLiveDanmakuListItem.firstInputPlaceholder)) {
            ((jw4) ((bwr) this).viewModel).m16381f0(bLiveDanmakuListItem.inputPlaceholder);
            return;
        }
        HashSet hashSet = (HashSet) this.f16214o.get();
        boolean zContains = hashSet.contains(bLiveDanmakuListItem.type);
        s7m s7mVar = ((bwr) this).viewModel;
        if (zContains) {
            ((jw4) s7mVar).m16381f0(bLiveDanmakuListItem.inputPlaceholder);
            return;
        }
        ((jw4) s7mVar).m16381f0(bLiveDanmakuListItem.firstInputPlaceholder);
        hashSet.add(bLiveDanmakuListItem.type);
        this.f16214o.put(hashSet);
    }
}
