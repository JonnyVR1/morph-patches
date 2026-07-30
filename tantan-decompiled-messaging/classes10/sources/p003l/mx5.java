package p003l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.er2;
import l.f6c0;
import l.i0e;
import l.o7r;
import l.qib0;
import l.szd;
import l.v7c0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VSwitch;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00104\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010F\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u0016\u0010H\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010GR\u001b\u0010L\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\b=\u0010K¨\u0006M"}, d2 = {"Ll/mx5;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "n", "()V", "Landroid/view/View;", "view", "f", "(Landroid/view/View;)V", "m", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "g", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "k", "()Lv/VDraweeView;", "set_iv_top", "(Lv/VDraweeView;)V", "_iv_top", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "get_constellation_title", "()Landroid/widget/TextView;", "set_constellation_title", "(Landroid/widget/TextView;)V", "_constellation_title", "d", "get_constellation_content", "set_constellation_content", "_constellation_content", "Lv/VFrame;", "e", "Lv/VFrame;", "get_switch_contain", "()Lv/VFrame;", "set_switch_contain", "(Lv/VFrame;)V", "_switch_contain", "get_switch_contain_constellation_off_text", "set_switch_contain_constellation_off_text", "_switch_contain_constellation_off_text", "Lv/VSwitch;", "Lv/VSwitch;", "l", "()Lv/VSwitch;", "set_switch_contain_constellation_off_switch", "(Lv/VSwitch;)V", "_switch_contain_constellation_off_switch", "Lv/VButton;", "h", "Lv/VButton;", "i", "()Lv/VButton;", "set_bottom_button", "(Lv/VButton;)V", "_bottom_button", "j", "set_bottom_button_close", "_bottom_button_close", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "Ll/cwf0;", "Lkotlin/Lazy;", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class mx5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _iv_top;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _constellation_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _constellation_content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VFrame _switch_contain;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _switch_contain_constellation_off_text;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VSwitch _switch_contain_constellation_off_switch;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VButton _bottom_button;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VButton _bottom_button_close;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public Dialog dialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.mx5$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/mx5$a", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3384a extends er2 {
        public String pageId() {
            return "p_intl_horoscope_match_popup";
        }
    }

    public mx5(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.hx5
            public final Object invoke() {
                return mx5.m8276b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m8275a(mx5 mx5Var, View view) {
        zvf0.r("e_intl_horoscope_match_view_card_button", "p_intl_horoscope_match_popup");
        gx5.Companion c3337a = gx5.INSTANCE;
        Act act = mx5Var.act;
        User userMe_ = CoreModule.K().me_();
        userMe_.getClass();
        c3337a.m6843c(act, userMe_);
        szd szdVar = mx5Var.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static cwf0 m8276b() {
        return new cwf0(new C3384a());
    }

    /* JADX INFO: renamed from: c */
    public static void m8277c(mx5 mx5Var, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        zvf0.r("e_intl_horoscope_match_switch", "p_intl_horoscope_match_popup");
        CoreModule.c.L1.c3().put(Boolean.valueOf(!z));
    }

    /* JADX INFO: renamed from: d */
    public static void m8278d(mx5 mx5Var, View view) {
        szd szdVar = mx5Var.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static void m8279e(mx5 mx5Var, DialogInterface dialogInterface) {
        i0e.e(mx5Var.m8282h());
    }

    /* JADX INFO: renamed from: f */
    public final void m8280f(View view) {
        nx5.m8375a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final Dialog m8281g(Act act, View rootView) {
        Dialog dialogZ = act.dialog().L(v7c0.o).P(rootView, false).B(true).z();
        dialogZ.getClass();
        return dialogZ;
    }

    /* JADX INFO: renamed from: h */
    public final cwf0 m8282h() {
        return (cwf0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VButton m8283i() {
        VButton vButton = this._bottom_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_bottom_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VButton m8284j() {
        VButton vButton = this._bottom_button_close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_bottom_button_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m8285k() {
        VDraweeView vDraweeView = this._iv_top;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_iv_top");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VSwitch m8286l() {
        VSwitch vSwitch = this._switch_contain_constellation_off_switch;
        if (vSwitch != null) {
            return vSwitch;
        }
        Intrinsics.r("_switch_contain_constellation_off_switch");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m8287m() {
        qib0.G.N0(m8285k(), "https://auto.tancdn.com/v1/raw/01329a74-5f6c-4fd9-a6be-e0411bb7724413.webp", true);
        xdl0.E0(m8284j(), new View.OnClickListener() { // from class: l.jx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mx5.m8278d(this.f5391a, view);
            }
        });
        xdl0.E0(m8283i(), new View.OnClickListener() { // from class: l.kx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mx5.m8275a(this.f5720a, view);
            }
        });
        m8286l().setChecked(!((Boolean) CoreModule.c.L1.c3().get()).booleanValue());
        m8286l().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.lx5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                mx5.m8277c(this.f6229a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m8288n() {
        szd szdVar = null;
        View viewInflate = o7r.a(this.act).inflate(f6c0.w4, (ViewGroup) null);
        viewInflate.getClass();
        m8280f(viewInflate);
        this.dialog = m8281g(this.act, viewInflate);
        m8287m();
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        dialog.show();
        szd szdVar2 = this.dialog;
        if (szdVar2 == null) {
            Intrinsics.r("dialog");
        } else {
            szdVar = szdVar2;
        }
        szdVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ix5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                mx5.m8279e(this.f5223a, dialogInterface);
            }
        });
        i0e.f(m8282h());
    }
}
