package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.TarotData;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\fR\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\bA\u0010'\"\u0004\bB\u0010\fR\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010M\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\bK\u0010.\"\u0004\bL\u00100R\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010W\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010;\u001a\u0004\bO\u0010=\"\u0004\bV\u0010?R\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010YR\u0016\u0010]\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\\R\u0016\u0010_\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010^¨\u0006`"}, m87232d2 = {"Ll/vci0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "g", "(Landroid/view/View;)V", "q", "()V", "h", RXScreenCaptureService.KEY_INDEX, "rootView", "Lcom/p1/mobile/android/app/Dialog;", "j", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "r", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/TarotData;", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_iv_top", "()Landroid/widget/ImageView;", "set_iv_top", "(Landroid/widget/ImageView;)V", "_iv_top", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_empty_top", "()Landroid/view/View;", "set_empty_top", "_empty_top", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "p", "()Landroid/widget/TextView;", "set_tarot_title", "(Landroid/widget/TextView;)V", "_tarot_title", "Lv/VText;", "f", "Lv/VText;", "o", "()Lv/VText;", "set_tarot_time", "(Lv/VText;)V", "_tarot_time", "Lv/VButton;", "Lv/VButton;", "m", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "get_empty_bottom", "set_empty_bottom", "_empty_bottom", "Landroid/widget/Space;", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "n", "set_tarot_content", "_tarot_content", "Lv/VCheckBox;", "k", "Lv/VCheckBox;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lv/VCheckBox;", "set_checkbox", "(Lv/VCheckBox;)V", "_checkbox", "set_bottom_button", "_bottom_button", "Ll/c4g0;", "Ll/c4g0;", "countDown", "", "J", StudentVerRejectedReason.startTime, "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vci0 {

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
    public c4g0 countDown;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public Dialog dialog;

    public vci0(@NotNull Act act, @NotNull TarotData tarotData) {
        act.getClass();
        tarotData.getClass();
        this.act = act;
        this.tarotInfo = tarotData;
    }

    /* JADX INFO: renamed from: a */
    public static void m197769a(vci0 vci0Var, Long l2) {
        vci0Var.m197777i();
    }

    /* JADX INFO: renamed from: b */
    public static void m197770b(vci0 vci0Var, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        CoreModule.f17545c.f19694w1.getReject().put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c */
    public static void m197771c(vci0 vci0Var, View view) {
        Dialog dialog = null;
        if (vci0Var.tarotInfo.cardType != 0) {
            zvf0.m220396r("e_tarot_check_popup_confirm", "p_tarot_check_popup");
            oci0.INSTANCE.m163521b(vci0Var.act, vci0Var.tarotInfo);
            Dialog dialog2 = vci0Var.dialog;
            if (dialog2 == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
            } else {
                dialog = dialog2;
            }
            dialog.dismiss();
            return;
        }
        zvf0.m220396r("e_tarot_making_popup_confirm", "p_tarot_making_popup");
        oci0.INSTANCE.m163520a(vci0Var.act);
        Dialog dialog3 = vci0Var.dialog;
        if (dialog3 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static void m197772d(vci0 vci0Var, DialogInterface dialogInterface) {
        if (vci0Var.tarotInfo.cardType != 0) {
            c4g0 c4g0Var = vci0Var.countDown;
            if (c4g0Var == null) {
                Intrinsics.m87502r("countDown");
                c4g0Var = null;
            }
            mkd0.m154992z(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m197773e(vci0 vci0Var, View view) {
        Dialog dialog = vci0Var.dialog;
        if (dialog == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static void m197774f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public final void m197775g(View view) {
        wci0.m202664a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m197776h() {
        c4g0 c4g0VarSubscribe = C22306c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.tci0
            @Override // p149l.e30
            public final void call(Object obj) {
                vci0.m197769a(this.f169446a, (Long) obj);
            }
        }, new e30() { // from class: l.uci0
            @Override // p149l.e30
            public final void call(Object obj) {
                vci0.m197774f((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.countDown = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: i */
    public final void m197777i() {
        long jCurrentTimeMillis = this.startTime - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0 && jCurrentTimeMillis > -7200000) {
            xdl0.m208335H0(m197783o(), this.act.getString(R$string.f18547gf));
            return;
        }
        if (jCurrentTimeMillis > 86400000 || jCurrentTimeMillis < -7200000) {
            this.startTime = adi0.INSTANCE.m95899d();
            return;
        }
        String strM95901f = adi0.INSTANCE.m95901f(jCurrentTimeMillis);
        xdl0.m208335H0(m197783o(), this.act.getString(R$string.f18516ff) + " \n" + strM95901f);
    }

    /* JADX INFO: renamed from: j */
    public final Dialog m197778j(Act act, View rootView) {
        Dialog dialogM20567z = act.dialog().m20516L(v7c0.f180368o).m20520P(rootView, false).m20498C(t100.m186890d(24.0f), 0, t100.m186890d(24.0f), 0).m20496B(true).m20567z();
        dialogM20567z.getClass();
        return dialogM20567z;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VButton m197779k() {
        VButton vButton = this._bottom_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_bottom_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VCheckBox m197780l() {
        VCheckBox vCheckBox = this._checkbox;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m87502r("_checkbox");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VButton m197781m() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m197782n() {
        TextView textView = this._tarot_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tarot_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VText m197783o() {
        VText vText = this._tarot_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tarot_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m197784p() {
        TextView textView = this._tarot_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tarot_title");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m197785q() {
        if (this.tarotInfo.cardType != 0) {
            m197782n().setText(this.act.getString(R$string.f18578hf));
            m197779k().setText(this.act.getString(R$string.f18485ef));
            this.startTime = adi0.INSTANCE.m95899d();
            m197776h();
        } else {
            m197782n().setText(this.act.getString(R$string.f18669kf));
            m197779k().setText(this.act.getString(R$string.f18638jf));
        }
        xdl0.m208344M(m197780l(), this.tarotInfo.cardType != 0);
        xdl0.m208344M(m197783o(), this.tarotInfo.cardType != 0);
        xdl0.m208329E0(m197781m(), new View.OnClickListener() { // from class: l.qci0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vci0.m197773e(this.f153757a, view);
            }
        });
        xdl0.m208329E0(m197779k(), new View.OnClickListener() { // from class: l.rci0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vci0.m197771c(this.f158775a, view);
            }
        });
        m197784p().setTypeface(adi0.m95896i(this.act));
        VCheckBox vCheckBoxM197780l = m197780l();
        Boolean bool = CoreModule.f17545c.f19694w1.getReject().get();
        bool.getClass();
        vCheckBoxM197780l.setChecked(bool.booleanValue());
        m197780l().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.sci0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                vci0.m197770b(this.f163744a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m197786r() {
        Dialog dialog = null;
        View viewInflate = o7r.m163037a(this.act).inflate(f6c0.f95512P5, (ViewGroup) null);
        viewInflate.getClass();
        m197775g(viewInflate);
        Dialog dialogM197778j = m197778j(this.act, viewInflate);
        this.dialog = dialogM197778j;
        if (dialogM197778j == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialogM197778j = null;
        }
        dialogM197778j.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pci0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vci0.m197772d(this.f148175a, dialogInterface);
            }
        });
        m197785q();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }
}
