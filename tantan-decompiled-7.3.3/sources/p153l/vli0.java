package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.TarotData;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\fR\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\bA\u0010'\"\u0004\bB\u0010\fR\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010M\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\bK\u0010.\"\u0004\bL\u00100R\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010W\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010;\u001a\u0004\bO\u0010=\"\u0004\bV\u0010?R\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010YR\u0016\u0010]\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\\R\u0016\u0010_\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010^¨\u0006`"}, m88121d2 = {"Ll/vli0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "g", "(Landroid/view/View;)V", "q", "()V", "h", RXScreenCaptureService.KEY_INDEX, "rootView", "Lcom/p1/mobile/android/app/Dialog;", "j", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "r", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/TarotData;", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_iv_top", "()Landroid/widget/ImageView;", "set_iv_top", "(Landroid/widget/ImageView;)V", "_iv_top", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_empty_top", "()Landroid/view/View;", "set_empty_top", "_empty_top", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "p", "()Landroid/widget/TextView;", "set_tarot_title", "(Landroid/widget/TextView;)V", "_tarot_title", "Lv/VText;", "f", "Lv/VText;", "o", "()Lv/VText;", "set_tarot_time", "(Lv/VText;)V", "_tarot_time", "Lv/VButton;", "Lv/VButton;", "m", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "get_empty_bottom", "set_empty_bottom", "_empty_bottom", "Landroid/widget/Space;", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "n", "set_tarot_content", "_tarot_content", "Lv/VCheckBox;", "k", "Lv/VCheckBox;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VCheckBox;", "set_checkbox", "(Lv/VCheckBox;)V", "_checkbox", "set_bottom_button", "_bottom_button", "Ll/kcg0;", "Ll/kcg0;", "countDown", "", "J", StudentVerRejectedReason.startTime, "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vli0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TarotData tarotInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _iv_top;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _empty_top;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _tarot_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _tarot_time;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _empty_bottom;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Space _space;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _tarot_content;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VCheckBox _checkbox;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VButton _bottom_button;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public kcg0 countDown;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public Dialog dialog;

    public vli0(@NotNull Act act, @NotNull TarotData tarotData) {
        act.getClass();
        tarotData.getClass();
        this.act = act;
        this.tarotInfo = tarotData;
    }

    /* JADX INFO: renamed from: a */
    public static void m201624a(vli0 vli0Var, Long l2) {
        vli0Var.m201632i();
    }

    /* JADX INFO: renamed from: b */
    public static void m201625b(vli0 vli0Var, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        CoreModule.f18264c.f20436w1.getReject().put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c */
    public static void m201626c(vli0 vli0Var, View view) {
        Dialog dialog = null;
        if (vli0Var.tarotInfo.cardType != 0) {
            i4g0.m138520r("e_tarot_check_popup_confirm", "p_tarot_check_popup");
            oli0.INSTANCE.m168124b(vli0Var.act, vli0Var.tarotInfo);
            Dialog dialog2 = vli0Var.dialog;
            if (dialog2 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                dialog = dialog2;
            }
            dialog.dismiss();
            return;
        }
        i4g0.m138520r("e_tarot_making_popup_confirm", "p_tarot_making_popup");
        oli0.INSTANCE.m168123a(vli0Var.act);
        Dialog dialog3 = vli0Var.dialog;
        if (dialog3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static void m201627d(vli0 vli0Var, DialogInterface dialogInterface) {
        if (vli0Var.tarotInfo.cardType != 0) {
            kcg0 kcg0Var = vli0Var.countDown;
            if (kcg0Var == null) {
                Intrinsics.m88391r("countDown");
                kcg0Var = null;
            }
            psd0.m173633z(kcg0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m201628e(vli0 vli0Var, View view) {
        Dialog dialog = vli0Var.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static void m201629f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public final void m201630g(View view) {
        wli0.m207037a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m201631h() {
        kcg0 kcg0VarSubscribe = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.tli0
            @Override // p153l.y20
            public final void call(Object obj) {
                vli0.m201624a(this.f174832a, (Long) obj);
            }
        }, new y20() { // from class: l.uli0
            @Override // p153l.y20
            public final void call(Object obj) {
                vli0.m201629f((Throwable) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        this.countDown = kcg0VarSubscribe;
    }

    /* JADX INFO: renamed from: i */
    public final void m201632i() {
        long jCurrentTimeMillis = this.startTime - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0 && jCurrentTimeMillis > -7200000) {
            bnl0.m105515H0(m201638o(), this.act.getString(R$string.f19864zf));
            return;
        }
        if (jCurrentTimeMillis > 86400000 || jCurrentTimeMillis < -7200000) {
            this.startTime = ami0.INSTANCE.m98830d();
            return;
        }
        String strM98832f = ami0.INSTANCE.m98832f(jCurrentTimeMillis);
        bnl0.m105515H0(m201638o(), this.act.getString(R$string.f19833yf) + " \n" + strM98832f);
    }

    /* JADX INFO: renamed from: j */
    public final Dialog m201633j(Act act, View rootView) {
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71129o).m21519P(rootView, false).m21497C(qa00.m175859d(24.0f), 0, qa00.m175859d(24.0f), 0).m21495B(true).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VButton m201634k() {
        VButton vButton = this._bottom_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_bottom_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VCheckBox m201635l() {
        VCheckBox vCheckBox = this._checkbox;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_checkbox");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VButton m201636m() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m201637n() {
        TextView textView = this._tarot_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tarot_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VText m201638o() {
        VText vText = this._tarot_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tarot_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m201639p() {
        TextView textView = this._tarot_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tarot_title");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m201640q() {
        if (this.tarotInfo.cardType != 0) {
            m201637n().setText(this.act.getString(R$string.f18301Af));
            m201634k().setText(this.act.getString(R$string.f19802xf));
            this.startTime = ami0.INSTANCE.m98830d();
            m201631h();
        } else {
            m201637n().setText(this.act.getString(R$string.f18363Cf));
            m201634k().setText(this.act.getString(R$string.f18332Bf));
        }
        bnl0.m105524M(m201635l(), this.tarotInfo.cardType != 0);
        bnl0.m105524M(m201638o(), this.tarotInfo.cardType != 0);
        bnl0.m105509E0(m201636m(), new View.OnClickListener() { // from class: l.qli0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vli0.m201628e(this.f158233a, view);
            }
        });
        bnl0.m105509E0(m201634k(), new View.OnClickListener() { // from class: l.rli0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vli0.m201626c(this.f163764a, view);
            }
        });
        m201639p().setTypeface(ami0.m98827i(this.act));
        VCheckBox vCheckBoxM201635l = m201635l();
        Boolean bool = CoreModule.f18264c.f20436w1.getReject().get();
        bool.getClass();
        vCheckBoxM201635l.setChecked(bool.booleanValue());
        m201635l().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.sli0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                vli0.m201625b(this.f169385a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m201641r() {
        Dialog dialog = null;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f125582Q5, (ViewGroup) null);
        viewInflate.getClass();
        m201630g(viewInflate);
        Dialog dialogM201633j = m201633j(this.act, viewInflate);
        this.dialog = dialogM201633j;
        if (dialogM201633j == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialogM201633j = null;
        }
        dialogM201633j.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pli0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vli0.m201627d(this.f153036a, dialogInterface);
            }
        });
        m201640q();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }
}
