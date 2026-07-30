package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00104\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010F\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u0016\u0010H\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010GR\u001b\u0010L\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\b=\u0010K¨\u0006M"}, m88121d2 = {"Ll/ry5;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "n", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "f", "(Landroid/view/View;)V", "m", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "g", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "k", "()Lv/VDraweeView;", "set_iv_top", "(Lv/VDraweeView;)V", "_iv_top", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "get_constellation_title", "()Landroid/widget/TextView;", "set_constellation_title", "(Landroid/widget/TextView;)V", "_constellation_title", Constants.INAPP_DATA_TAG, "get_constellation_content", "set_constellation_content", "_constellation_content", "Lv/VFrame;", "e", "Lv/VFrame;", "get_switch_contain", "()Lv/VFrame;", "set_switch_contain", "(Lv/VFrame;)V", "_switch_contain", "get_switch_contain_constellation_off_text", "set_switch_contain_constellation_off_text", "_switch_contain_constellation_off_text", "Lv/VSwitch;", "Lv/VSwitch;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VSwitch;", "set_switch_contain_constellation_off_switch", "(Lv/VSwitch;)V", "_switch_contain_constellation_off_switch", "Lv/VButton;", "h", "Lv/VButton;", RXScreenCaptureService.KEY_INDEX, "()Lv/VButton;", "set_bottom_button", "(Lv/VButton;)V", "_bottom_button", "j", "set_bottom_button_close", "_bottom_button_close", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/l4g0;", "Lkotlin/Lazy;", "()Ll/l4g0;", "pageHelp", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ry5 {

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

    /* JADX INFO: renamed from: l.ry5$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/ry5$a", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19936a extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_intl_horoscope_match_popup";
        }
    }

    public ry5(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.my5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ry5.m183584b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m183583a(ry5 ry5Var, View view) {
        i4g0.m138520r("e_intl_horoscope_match_view_card_button", "p_intl_horoscope_match_popup");
        ly5.Companion companion = ly5.INSTANCE;
        Act act = ry5Var.act;
        User userMe_ = CoreModule.m30930K().me_();
        userMe_.getClass();
        companion.m156259c(act, userMe_);
        Dialog dialog = ry5Var.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static l4g0 m183584b() {
        return new l4g0(new C19936a());
    }

    /* JADX INFO: renamed from: c */
    public static void m183585c(ry5 ry5Var, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        i4g0.m138520r("e_intl_horoscope_match_switch", "p_intl_horoscope_match_popup");
        CoreModule.f18264c.f20325L1.getReject().put(Boolean.valueOf(!z));
    }

    /* JADX INFO: renamed from: d */
    public static void m183586d(ry5 ry5Var, View view) {
        Dialog dialog = ry5Var.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static void m183587e(ry5 ry5Var, DialogInterface dialogInterface) {
        w1e.m204401e(ry5Var.m183590h());
    }

    /* JADX INFO: renamed from: f */
    public final void m183588f(View view) {
        sy5.m188533a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final Dialog m183589g(Act act, View rootView) {
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71129o).m21519P(rootView, false).m21495B(true).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    /* JADX INFO: renamed from: h */
    public final l4g0 m183590h() {
        return (l4g0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VButton m183591i() {
        VButton vButton = this._bottom_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_bottom_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VButton m183592j() {
        VButton vButton = this._bottom_button_close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_bottom_button_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m183593k() {
        VDraweeView vDraweeView = this._iv_top;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_iv_top");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VSwitch m183594l() {
        VSwitch vSwitch = this._switch_contain_constellation_off_switch;
        if (vSwitch != null) {
            return vSwitch;
        }
        Intrinsics.m88391r("_switch_contain_constellation_off_switch");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m183595m() {
        uqb0.f180374G.m127119N0(m183593k(), "https://auto.tancdn.com/v1/raw/01329a74-5f6c-4fd9-a6be-e0411bb7724413.webp", true);
        bnl0.m105509E0(m183592j(), new View.OnClickListener() { // from class: l.oy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ry5.m183586d(this.f149739a, view);
            }
        });
        bnl0.m105509E0(m183591i(), new View.OnClickListener() { // from class: l.py5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ry5.m183583a(this.f154617a, view);
            }
        });
        m183594l().setChecked(!CoreModule.f18264c.f20325L1.getReject().get().booleanValue());
        m183594l().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.qy5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ry5.m183585c(this.f160093a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m183596n() {
        Dialog dialog = null;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f126114w4, (ViewGroup) null);
        viewInflate.getClass();
        m183588f(viewInflate);
        this.dialog = m183589g(this.act, viewInflate);
        m183595m();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.show();
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ny5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ry5.m183587e(this.f144290a, dialogInterface);
            }
        });
        w1e.m204402f(m183590h());
    }
}
