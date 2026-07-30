package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p046p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p133rx.C22306c;
import p147v.VCheckBox;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class nv4<D extends ho2> extends gn2<D, jw4> {

    /* JADX INFO: renamed from: u */
    public static boolean f140667u = false;

    /* JADX INFO: renamed from: j */
    @Nullable
    public om40 f140668j;

    /* JADX INFO: renamed from: k */
    public ho40<D> f140669k;

    /* JADX INFO: renamed from: l */
    public final int f140670l;

    /* JADX INFO: renamed from: m */
    public int f140671m;

    /* JADX INFO: renamed from: n */
    public final hpd0 f140672n;

    /* JADX INFO: renamed from: o */
    public final vqd0 f140673o;

    /* JADX INFO: renamed from: p */
    public String f140674p;

    /* JADX INFO: renamed from: q */
    public BLiveChatTip f140675q;

    /* JADX INFO: renamed from: r */
    public bn40 f140676r;

    /* JADX INFO: renamed from: s */
    public boolean f140677s;

    /* JADX INFO: renamed from: t */
    public boolean f140678t;

    public nv4(bsm<D> bsmVar) {
        super(bsmVar);
        this.f140670l = t100.f167265n;
        this.f140672n = new hpd0("confirm_send_danmaku_dialog_show" + ypv.f199493a.m199309D0(), Boolean.TRUE);
        this.f140673o = new vqd0("danmaku_selected_input_hint_" + ypv.f199493a.m199309D0(), new HashSet());
        this.f140677s = ypv.m215672k().m195858i7();
        this.f140678t = true;
        mo51532C(new jw4(this));
        if (this.f140677s) {
            this.f140676r = (bn40) m144512z2(new bn40(bsmVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m161543r4(soj0 soj0Var) {
        m161555n4();
    }

    /* JADX INFO: renamed from: A4 */
    public void m161544A4(String str) {
        ((jw4) this.viewModel).m143632Y(str);
    }

    /* JADX INFO: renamed from: B4 */
    public void m161545B4(int i) {
        m206028F2().KeyboardEvent.show().mo172463j(new KeyboardEventData(KeyboardEventData.Action.Hide, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX INFO: renamed from: C4 */
    public void m161546C4(Boolean bool, int i) {
        int i2;
        ho40<D> ho40Var = this.f140669k;
        boolean zM132206k4 = ho40Var != null ? ho40Var.m132206k4() : false;
        if (i > 0 && this.f140671m == 0) {
            this.f140671m = i;
        }
        if (bool.booleanValue()) {
            i2 = this.f140671m + this.f140670l;
            m161548E4(i2);
        } else {
            i2 = this.f140670l;
            m161545B4(i2);
        }
        m206028F2().ChatEvent.keyboardDetectorChange().mo172463j(new cyq(bool.booleanValue(), i2, zM132206k4));
    }

    /* JADX INFO: renamed from: D4 */
    public void m161547D4(String str) {
        ((jw4) this.viewModel).m143632Y(str);
    }

    /* JADX INFO: renamed from: E4 */
    public void m161548E4(int i) {
        m206028F2().KeyboardEvent.show().mo172463j(new KeyboardEventData(KeyboardEventData.Action.Show, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX INFO: renamed from: F4 */
    public void m161549F4(BLiveChatTip bLiveChatTip) {
        this.f140675q = bLiveChatTip;
    }

    /* JADX INFO: renamed from: G4 */
    public void m161550G4(String str) {
        if (((jw4) this.viewModel).m143633Z() && !TextUtils.isEmpty(str) && i0g0.m133843J(str) > jw4.f120019F * 2) {
            lsi0.m151595y(String.format(ypv.f199497e.getString(R$string.f46757J2), String.valueOf(jw4.f120019F)));
        } else if (!((jw4) this.viewModel).m143633Z()) {
            m161552I4(str);
        } else {
            m161551H4(str, this.f140668j.m165000j4());
            m161555n4();
        }
    }

    /* JADX INFO: renamed from: H4 */
    public void m161551H4(final String str, final BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null) {
            return;
        }
        if (!ypv.m215672k().m195882l7()) {
            m206028F2().ChatEvent.sendDanmakuMessage().mo172463j(new j1c(str, bLiveDanmakuListItem));
            return;
        }
        if (!this.f140672n.get().booleanValue()) {
            m206028F2().ChatEvent.sendDanmakuMessage().mo172463j(new j1c(str, bLiveDanmakuListItem));
            return;
        }
        View viewInflate = this.f188513f.inflater().inflate(t6c0.f168454o0, (ViewGroup) null);
        final VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(g5c0.f101028q0);
        vCheckBox.setChecked(true);
        vCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.jv4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f119854a.m161562v4(bLiveDanmakuListItem, compoundButton, z);
            }
        });
        this.f188513f.dialog().m20520P(viewInflate, true).m20507G0(bLiveDanmakuListItem.confirmingText).m20560v0(ypv.f199497e.getString(R$string.f47500rd), new Runnable() { // from class: l.kv4
            @Override // java.lang.Runnable
            public final void run() {
                this.f124744a.m161563w4(vCheckBox, str, bLiveDanmakuListItem);
            }
        }).m20494A(new DialogInterface.OnCancelListener() { // from class: l.lv4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f130121a.m161564x4(bLiveDanmakuListItem, dialogInterface);
            }
        }).m20544n0(ypv.f199497e.getString(R$string.f47662z), new Runnable() { // from class: l.mv4
            @Override // java.lang.Runnable
            public final void run() {
                this.f135867a.m161565y4(bLiveDanmakuListItem);
            }
        }).m20567z().show();
        zvf0.m220368A("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("live_id", m206027E2().m149814k()));
    }

    /* JADX INFO: renamed from: I4 */
    public void m161552I4(String str) {
        m206028F2().ChatEvent.sendNormalMessage().mo172463j(new sn40(str));
    }

    /* JADX INFO: renamed from: J4 */
    public void m161553J4(boolean z, CharSequence charSequence, String str) {
        m161554K4(z, charSequence, str, null, null);
    }

    /* JADX INFO: renamed from: K4 */
    public void m161554K4(boolean z, CharSequence charSequence, String str, String str2, String str3) {
        ((jw4) this.viewModel).m71834E();
        ((jw4) this.viewModel).m143642i0(this.f140677s);
        if (this.f140677s) {
            if ("1".equals(str)) {
                this.f140668j.m164999i4(str2, str3);
                ((jw4) this.viewModel).f120032r.setChecked(true);
            } else if (this.f140678t) {
                ((jw4) this.viewModel).f120032r.setChecked(f140667u);
                this.f140678t = false;
            }
        }
        m206028F2().GiftDialogEventGroup.dismissGiftDialog().mo172463j(10200);
        m206028F2().PlugPubEvent.dismissContributeDialog().mo172463j(10200);
        ((jw4) this.viewModel).m143640g0(z, charSequence);
        ((jw4) this.viewModel).m143645l0();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        m206028F2().ChatEvent.onChatInputDialogDismiss().m172467p();
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("vipServiceBubble");
        m161545B4(0);
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        this.f140669k.m132207l4(this.f140675q, ((jw4) this.viewModel).m143633Z());
        ((jw4) this.viewModel).f120033s.requestFocus();
        m129320z3(180L, new Runnable() { // from class: l.dv4
            @Override // java.lang.Runnable
            public final void run() {
                this.f88032a.m161560t4();
            }
        });
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        this.f140669k = (ho40) m144512z2(new ho40(this.f188512e, ((jw4) this.viewModel).f120028n));
        if (this.f140677s) {
            bsm<? extends T> bsmVar = this.f188512e;
            bn40 bn40Var = this.f140676r;
            V v2 = this.viewModel;
            this.f140668j = (om40) m144512z2(new om40(bsmVar, this, bn40Var, ((jw4) v2).f120030p, ((jw4) v2).f120029o));
            ((jw4) this.viewModel).f120031q.setHeightChangeAction(new Function1() { // from class: l.ev4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f93307a.m161561u4((Integer) obj);
                }
            });
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.f140674p = w8u.m202217t(R$string.f47061Xa);
        duringCreated((C22306c) m206028F2().ChatEvent.dismissDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.fv4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99402a.m161543r4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.onDanmakuSelectedItemChange().m172460g()).skip(1).subscribe(ffw.m121193d(new e30() { // from class: l.gv4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104526a.m161566z4((BLiveDanmakuListItem) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.customChatInputStyle().m172460g()).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.hv4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveChatBox) obj).content != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.iv4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115087a.m161559s4((BLiveChatBox) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m161555n4() {
        V v2 = this.viewModel;
        if (v2 == 0 || ((jw4) v2).f120033s == null || !((jw4) v2).isShowing()) {
            return;
        }
        Act act = this.f188513f;
        if (act != null) {
            act.hideInput(((jw4) this.viewModel).f120033s);
        }
        ((jw4) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: o4 */
    public AbstractC16991g4.a m161556o4(String str) {
        ho40<D> ho40Var;
        if (TextUtils.equals(str, "vipServiceBubble") && ((jw4) this.viewModel).isShowing() && (ho40Var = this.f140669k) != null) {
            return new AbstractC16991g4.a(ho40Var.m132205j4(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m161557p4() {
        return ((jw4) this.viewModel).isShowing();
    }

    /* JADX INFO: renamed from: q4 */
    public boolean m161558q4() {
        return ((jw4) this.viewModel).m143633Z();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m161559s4(BLiveChatBox bLiveChatBox) {
        if (TextUtils.isEmpty(bLiveChatBox.content.text)) {
            return;
        }
        this.f140674p = bLiveChatBox.content.text;
        if (((jw4) this.viewModel).isShowing() || ((jw4) this.viewModel).m143633Z()) {
            return;
        }
        ((jw4) this.viewModel).m143639f0(this.f140674p);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m161560t4() {
        if (((jw4) this.viewModel).isShowing()) {
            this.f188513f.showInput(((jw4) this.viewModel).f120033s, 0);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ Unit m161561u4(Integer num) {
        this.f140668j.m165007q4(num.intValue());
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m161562v4(BLiveDanmakuListItem bLiveDanmakuListItem, CompoundButton compoundButton, boolean z) {
        zvf0.m220399u("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("click_op", z ? "display_on" : "display_off"), vwb.m200311Y("live_id", m206027E2().m149814k()));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m161563w4(VCheckBox vCheckBox, String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        this.f140672n.put(Boolean.valueOf(!vCheckBox.isChecked()));
        m206028F2().ChatEvent.sendDanmakuMessage().mo172463j(new j1c(str, bLiveDanmakuListItem));
        zvf0.m220399u("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("click_op", "send"), vwb.m200311Y("live_id", m206027E2().m149814k()));
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m161564x4(BLiveDanmakuListItem bLiveDanmakuListItem, DialogInterface dialogInterface) {
        zvf0.m220399u("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("click_op", "disappear"), vwb.m200311Y("live_id", m206027E2().m149814k()));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m161565y4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        zvf0.m220399u("e_live_bullet_popup", mo77274R2(), vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("bullet_price", Integer.valueOf(bLiveDanmakuListItem.price)), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("click_op", "cancel"), vwb.m200311Y("live_id", m206027E2().m149814k()));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m161566z4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (bLiveDanmakuListItem == null) {
            return;
        }
        if (TextUtils.isEmpty(bLiveDanmakuListItem.firstInputPlaceholder)) {
            ((jw4) this.viewModel).m143639f0(bLiveDanmakuListItem.inputPlaceholder);
            return;
        }
        HashSet<String> hashSet = this.f140673o.get();
        boolean zContains = hashSet.contains(bLiveDanmakuListItem.type);
        V v2 = this.viewModel;
        if (zContains) {
            ((jw4) v2).m143639f0(bLiveDanmakuListItem.inputPlaceholder);
            return;
        }
        ((jw4) v2).m143639f0(bLiveDanmakuListItem.firstInputPlaceholder);
        hashSet.add(bLiveDanmakuListItem.type);
        this.f140673o.put(hashSet);
    }
}
