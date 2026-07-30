package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.IntlFlashStickerDialogSummaryData;
import com.p051p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p051p1.mobile.putong.core.p058ui.intloperation.flash.C8547a;
import com.p051p1.mobile.putong.core.p058ui.likeminded.C8574a;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VProgress;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010J¨\u0006L"}, m88121d2 = {"Ll/gsi;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlFlashStickerOptionData;", "data", "", "p", "(Lcom/p1/mobile/putong/core/data/IntlFlashStickerOptionData;)V", BaseSei.INFO, "o", "", "endTime", BLiveOperationTitleShowType.duration, "f", "(JJ)V", "g", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "j", "()Lv/VDraweeView;", "set_dlg_bg_img", "(Lv/VDraweeView;)V", "_dlg_bg_img", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", Constants.INAPP_DATA_TAG, "n", "set_setting_img", "_setting_img", "Lv/VText;", "Lv/VText;", "m", "()Lv/VText;", "set_setting_content_title", "(Lv/VText;)V", "_setting_content_title", "k", "set_finding_time", "_finding_time", "Lv/VProgress;", "Lv/VProgress;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VProgress;", "set_progress", "(Lv/VProgress;)V", "_progress", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/kcg0;", "Ll/kcg0;", "countDown", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gsi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _dlg_bg_img;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _close;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _setting_img;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _setting_content_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _finding_time;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VProgress _progress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public Dialog dialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public kcg0 countDown;

    public gsi(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m132036a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m132037b(gsi gsiVar, View view) {
        Dialog dialog = gsiVar.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m132038c(gsi gsiVar, long j, long j2, Long l2) {
        gsiVar.m132042g(j, j2);
    }

    /* JADX INFO: renamed from: d */
    public static void m132039d(gsi gsiVar, DialogInterface dialogInterface) {
        kcg0 kcg0Var = gsiVar.countDown;
        if (kcg0Var == null) {
            Intrinsics.m88391r("countDown");
            kcg0Var = null;
        }
        psd0.m173633z(kcg0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m132040e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM136978b = hsi.m136978b(this, inflater, parent);
        viewM136978b.getClass();
        return viewM136978b;
    }

    /* JADX INFO: renamed from: f */
    public final void m132041f(final long endTime, final long duration) {
        kcg0 kcg0VarSubscribe = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.esi
            @Override // p153l.y20
            public final void call(Object obj) {
                gsi.m132038c(this.f95613a, endTime, duration, (Long) obj);
            }
        }, new y20() { // from class: l.fsi
            @Override // p153l.y20
            public final void call(Object obj) {
                gsi.m132036a((Throwable) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        this.countDown = kcg0VarSubscribe;
    }

    /* JADX INFO: renamed from: g */
    public final void m132042g(long endTime, long duration) {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        long j = endTime - jM174454o;
        date.setTime(Math.max(0L, j));
        if (j <= 0) {
            Dialog dialog = this.dialog;
            if (dialog == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                dialog = null;
            }
            dialog.dismiss();
        }
        if (duration >= 0) {
            m132047l().setProgress((int) ((j * 100) / duration));
        }
        m132046k().setText(C8574a.INSTANCE.m48075m(date));
    }

    /* JADX INFO: renamed from: h */
    public final Dialog m132043h(Act act, View rootView) {
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71129o).m21519P(rootView, false).m21497C(qa00.m175859d(32.0f), 0, qa00.m175859d(32.0f), 0).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ImageView m132044i() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m132045j() {
        VDraweeView vDraweeView = this._dlg_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_dlg_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m132046k() {
        VText vText = this._finding_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VProgress m132047l() {
        VProgress vProgress = this._progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.m88391r("_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m132048m() {
        VText vText = this._setting_content_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_setting_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m132049n() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m132050o(IntlFlashStickerOptionData info) {
        if (info == null) {
            return;
        }
        IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = info.dialog_ui;
        if (!TextUtils.isEmpty(intlFlashStickerDialogSummaryData.bg_color)) {
            m132045j().setBackground(C8547a.INSTANCE.m47487b(Color.parseColor(intlFlashStickerDialogSummaryData.bg_color), qa00.f156330q, true));
        }
        if (!TextUtils.isEmpty(intlFlashStickerDialogSummaryData.bg_url)) {
            uqb0.f180374G.m127115L0(m132045j(), intlFlashStickerDialogSummaryData.bg_url);
        }
        C8547a c8547a = C8547a.INSTANCE;
        c8547a.m47494i(m132048m(), info.option_data.desc, info.dialog_ui.desc_color);
        m132046k().setTextColor(Color.parseColor(intlFlashStickerDialogSummaryData.count_down_font_color.toString()));
        c8547a.m47493h(m132047l(), Color.parseColor(intlFlashStickerDialogSummaryData.passed_progress_bar_color), Color.parseColor(intlFlashStickerDialogSummaryData.remain_progress_bar_color));
    }

    /* JADX INFO: renamed from: p */
    public final void m132051p(@Nullable IntlFlashStickerOptionData data) {
        if (data == null) {
            return;
        }
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(this.act);
        layoutInflaterM171370a.getClass();
        Dialog dialog = null;
        this.dialog = m132043h(this.act, m132040e(layoutInflaterM171370a, null));
        try {
            m132050o(data);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        uqb0.f180374G.m127115L0(m132049n(), data.option_data.img_url);
        bnl0.m105509E0(m132044i(), new View.OnClickListener() { // from class: l.csi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gsi.m132037b(this.f83463a, view);
            }
        });
        m132041f(pzi0.m174454o() + data.remain, data.duration);
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dsi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gsi.m132039d(this.f90485a, dialogInterface);
            }
        });
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.show();
    }
}
