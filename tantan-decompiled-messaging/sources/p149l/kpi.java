package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.data.IntlFlashStickerDialogSummaryData;
import com.p046p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p046p1.mobile.putong.core.p053ui.intloperation.flash.C8384a;
import com.p046p1.mobile.putong.core.p053ui.likeminded.C8411a;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VProgress;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010J¨\u0006L"}, m87232d2 = {"Ll/kpi;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlFlashStickerOptionData;", "data", "", "p", "(Lcom/p1/mobile/putong/core/data/IntlFlashStickerOptionData;)V", BaseSei.INFO, "o", "", "endTime", BLiveOperationTitleShowType.duration, "f", "(JJ)V", "g", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "j", "()Lv/VDraweeView;", "set_dlg_bg_img", "(Lv/VDraweeView;)V", "_dlg_bg_img", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", Constants.INAPP_DATA_TAG, "n", "set_setting_img", "_setting_img", "Lv/VText;", "Lv/VText;", "m", "()Lv/VText;", "set_setting_content_title", "(Lv/VText;)V", "_setting_content_title", "k", "set_finding_time", "_finding_time", "Lv/VProgress;", "Lv/VProgress;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lv/VProgress;", "set_progress", "(Lv/VProgress;)V", "_progress", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/c4g0;", "Ll/c4g0;", "countDown", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kpi {

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
    public c4g0 countDown;

    public kpi(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m146853a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m146854b(kpi kpiVar, View view) {
        Dialog dialog = kpiVar.dialog;
        if (dialog == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m146855c(kpi kpiVar, long j, long j2, Long l2) {
        kpiVar.m146859g(j, j2);
    }

    /* JADX INFO: renamed from: d */
    public static void m146856d(kpi kpiVar, DialogInterface dialogInterface) {
        c4g0 c4g0Var = kpiVar.countDown;
        if (c4g0Var == null) {
            Intrinsics.m87502r("countDown");
            c4g0Var = null;
        }
        mkd0.m154992z(c4g0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m146857e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM150870b = lpi.m150870b(this, inflater, parent);
        viewM150870b.getClass();
        return viewM150870b;
    }

    /* JADX INFO: renamed from: f */
    public final void m146858f(final long endTime, final long duration) {
        c4g0 c4g0VarSubscribe = C22306c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ipi
            @Override // p149l.e30
            public final void call(Object obj) {
                kpi.m146855c(this.f114296a, endTime, duration, (Long) obj);
            }
        }, new e30() { // from class: l.jpi
            @Override // p149l.e30
            public final void call(Object obj) {
                kpi.m146853a((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.countDown = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: g */
    public final void m146859g(long endTime, long duration) {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        long j = endTime - jM155944o;
        date.setTime(Math.max(0L, j));
        if (j <= 0) {
            Dialog dialog = this.dialog;
            if (dialog == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
                dialog = null;
            }
            dialog.dismiss();
        }
        if (duration >= 0) {
            m146864l().setProgress((int) ((j * 100) / duration));
        }
        m146863k().setText(C8411a.INSTANCE.m46892m(date));
    }

    /* JADX INFO: renamed from: h */
    public final Dialog m146860h(Act act, View rootView) {
        Dialog dialogM20567z = act.dialog().m20516L(v7c0.f180368o).m20520P(rootView, false).m20498C(t100.m186890d(32.0f), 0, t100.m186890d(32.0f), 0).m20567z();
        dialogM20567z.getClass();
        return dialogM20567z;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ImageView m146861i() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m146862j() {
        VDraweeView vDraweeView = this._dlg_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_dlg_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m146863k() {
        VText vText = this._finding_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VProgress m146864l() {
        VProgress vProgress = this._progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.m87502r("_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m146865m() {
        VText vText = this._setting_content_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_setting_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m146866n() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m146867o(IntlFlashStickerOptionData info) {
        if (info == null) {
            return;
        }
        IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = info.dialog_ui;
        if (!TextUtils.isEmpty(intlFlashStickerDialogSummaryData.bg_color)) {
            m146862j().setBackground(C8384a.INSTANCE.m46304b(Color.parseColor(intlFlashStickerDialogSummaryData.bg_color), t100.f167268q, true));
        }
        if (!TextUtils.isEmpty(intlFlashStickerDialogSummaryData.bg_url)) {
            qib0.f154691G.m102331L0(m146862j(), intlFlashStickerDialogSummaryData.bg_url);
        }
        C8384a c8384a = C8384a.INSTANCE;
        c8384a.m46311i(m146865m(), info.option_data.desc, info.dialog_ui.desc_color);
        m146863k().setTextColor(Color.parseColor(intlFlashStickerDialogSummaryData.count_down_font_color.toString()));
        c8384a.m46310h(m146864l(), Color.parseColor(intlFlashStickerDialogSummaryData.passed_progress_bar_color), Color.parseColor(intlFlashStickerDialogSummaryData.remain_progress_bar_color));
    }

    /* JADX INFO: renamed from: p */
    public final void m146868p(@Nullable IntlFlashStickerOptionData data) {
        if (data == null) {
            return;
        }
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(this.act);
        layoutInflaterM163037a.getClass();
        Dialog dialog = null;
        this.dialog = m146860h(this.act, m146857e(layoutInflaterM163037a, null));
        try {
            m146867o(data);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        qib0.f154691G.m102331L0(m146866n(), data.option_data.img_url);
        xdl0.m208329E0(m146861i(), new View.OnClickListener() { // from class: l.gpi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kpi.m146854b(this.f103804a, view);
            }
        });
        m146858f(mqi0.m155944o() + data.remain, data.duration);
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hpi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kpi.m146856d(this.f108928a, dialogInterface);
            }
        });
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.show();
    }
}
