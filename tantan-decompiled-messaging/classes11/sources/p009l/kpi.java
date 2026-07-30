package p009l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.core.p002ui.intloperation.flash.C0428a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.IntlFlashStickerDialogSummaryData;
import com.p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p1.mobile.putong.core.ui.likeminded.a;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.c4g0;
import l.e30;
import l.jo0;
import l.lpi;
import l.mkd0;
import l.qib0;
import l.szd;
import l.t100;
import l.v7c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VDraweeView;
import v.VProgress;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010J¨\u0006L"}, d2 = {"Ll/kpi;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlFlashStickerOptionData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "p", "(Lcom/p1/mobile/putong/core/data/IntlFlashStickerOptionData;)V", "info", "o", "", "endTime", "duration", "f", "(JJ)V", "g", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "j", "()Lv/VDraweeView;", "set_dlg_bg_img", "(Lv/VDraweeView;)V", "_dlg_bg_img", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "i", "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "d", "n", "set_setting_img", "_setting_img", "Lv/VText;", "Lv/VText;", "m", "()Lv/VText;", "set_setting_content_title", "(Lv/VText;)V", "_setting_content_title", "k", "set_finding_time", "_finding_time", "Lv/VProgress;", "Lv/VProgress;", "l", "()Lv/VProgress;", "set_progress", "(Lv/VProgress;)V", "_progress", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "Ll/c4g0;", "Ll/c4g0;", "countDown", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m17571a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m17572b(kpi kpiVar, View view) {
        szd szdVar = kpiVar.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m17573c(kpi kpiVar, long j, long j2, Long l2) {
        kpiVar.m17577g(j, j2);
    }

    /* JADX INFO: renamed from: d */
    public static void m17574d(kpi kpiVar, DialogInterface dialogInterface) {
        c4g0 c4g0Var = kpiVar.countDown;
        if (c4g0Var == null) {
            Intrinsics.r("countDown");
            c4g0Var = null;
        }
        mkd0.z(c4g0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m17575e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = lpi.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: f */
    public final void m17576f(final long endTime, final long duration) {
        c4g0 c4g0VarSubscribe = c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.ipi
            public final void call(Object obj) {
                kpi.m17573c(this.f14763a, endTime, duration, (Long) obj);
            }
        }, new e30() { // from class: l.jpi
            public final void call(Object obj) {
                kpi.m17571a((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.countDown = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: g */
    public final void m17577g(long endTime, long duration) {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        long j = endTime - jM18550o;
        date.setTime(Math.max(0L, j));
        if (j <= 0) {
            szd szdVar = this.dialog;
            if (szdVar == null) {
                Intrinsics.r("dialog");
                szdVar = null;
            }
            szdVar.dismiss();
        }
        if (duration >= 0) {
            m17582l().setProgress((int) ((j * 100) / duration));
        }
        m17581k().setText(a.INSTANCE.m(date));
    }

    /* JADX INFO: renamed from: h */
    public final Dialog m17578h(Act act, View rootView) {
        Dialog dialogZ = act.dialog().L(v7c0.o).P(rootView, false).C(t100.d(32.0f), 0, t100.d(32.0f), 0).z();
        dialogZ.getClass();
        return dialogZ;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ImageView m17579i() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m17580j() {
        VDraweeView vDraweeView = this._dlg_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_dlg_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m17581k() {
        VText vText = this._finding_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VProgress m17582l() {
        VProgress vProgress = this._progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.r("_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m17583m() {
        VText vText = this._setting_content_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_setting_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m17584n() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m17585o(IntlFlashStickerOptionData info) {
        if (info == null) {
            return;
        }
        IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = info.dialog_ui;
        if (!TextUtils.isEmpty(intlFlashStickerDialogSummaryData.bg_color)) {
            m17580j().setBackground(C0428a.INSTANCE.m8392b(Color.parseColor(intlFlashStickerDialogSummaryData.bg_color), t100.q, true));
        }
        if (!TextUtils.isEmpty(intlFlashStickerDialogSummaryData.bg_url)) {
            qib0.G.L0(m17580j(), intlFlashStickerDialogSummaryData.bg_url);
        }
        C0428a c0428a = C0428a.INSTANCE;
        c0428a.m8399i(m17583m(), info.option_data.desc, info.dialog_ui.desc_color);
        m17581k().setTextColor(Color.parseColor(intlFlashStickerDialogSummaryData.count_down_font_color.toString()));
        c0428a.m8398h(m17582l(), Color.parseColor(intlFlashStickerDialogSummaryData.passed_progress_bar_color), Color.parseColor(intlFlashStickerDialogSummaryData.remain_progress_bar_color));
    }

    /* JADX INFO: renamed from: p */
    public final void m17586p(@Nullable IntlFlashStickerOptionData data) {
        if (data == null) {
            return;
        }
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(this.act);
        layoutInflaterM19649a.getClass();
        Dialog dialog = null;
        this.dialog = m17578h(this.act, m17575e(layoutInflaterM19649a, null));
        try {
            m17585o(data);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        qib0.G.L0(m17584n(), data.option_data.img_url);
        xdl0.E0(m17579i(), new View.OnClickListener() { // from class: l.gpi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kpi.m17572b(this.f13664a, view);
            }
        });
        m17576f(mqi0.m18550o() + data.remain, data.duration);
        szd szdVar = this.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hpi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kpi.m17574d(this.f14208a, dialogInterface);
            }
        });
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }
}
