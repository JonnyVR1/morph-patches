package p153l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.LikeMindedData;
import com.p051p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p051p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p051p1.mobile.putong.core.p058ui.likeminded.C8574a;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010HR\u0016\u0010K\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010M¨\u0006O"}, m88121d2 = {"Ll/ofr;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "data", "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "response", "", "o", "(Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;)V", "n", "()V", "m", "", "endTime", BLiveOperationTitleShowType.duration, "f", "(JJ)V", "g", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VDraweeView;", "set_setting_img", "(Lv/VDraweeView;)V", "_setting_img", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "get_setting_content_title", "()Landroid/widget/TextView;", "set_setting_content_title", "(Landroid/widget/TextView;)V", "_setting_content_title", "j", "set_finding_time", "_finding_time", "Lv/VProgress;", "Lv/VProgress;", "k", "()Lv/VProgress;", "set_progress", "(Lv/VProgress;)V", "_progress", "Ll/l4g0;", "Ll/l4g0;", "pageHelper", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/kcg0;", "Ll/kcg0;", "countDown", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ofr {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ImageView _close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _setting_img;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _setting_content_title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _finding_time;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VProgress _progress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final l4g0 pageHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public Dialog dialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public kcg0 countDown;

    public ofr(@NotNull Act act) {
        act.getClass();
        this.act = act;
        l4g0 l4g0VarM204399c = w1e.m204399c("p_same_check_popup", ofr.class.getName());
        l4g0VarM204399c.getClass();
        this.pageHelper = l4g0VarM204399c;
    }

    /* JADX INFO: renamed from: a */
    public static void m167491a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m167492b(ofr ofrVar, View view) {
        Dialog dialog = ofrVar.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m167493c(ofr ofrVar, DialogInterface dialogInterface) {
        kcg0 kcg0Var = ofrVar.countDown;
        if (kcg0Var == null) {
            Intrinsics.m88391r("countDown");
            kcg0Var = null;
        }
        psd0.m173633z(kcg0Var);
        ofrVar.m167503m();
    }

    /* JADX INFO: renamed from: d */
    public static void m167494d(ofr ofrVar, long j, long j2, Long l2) {
        ofrVar.m167497g(j, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m167495e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM172142b = pfr.m172142b(this, inflater, parent);
        viewM172142b.getClass();
        return viewM172142b;
    }

    /* JADX INFO: renamed from: f */
    public final void m167496f(final long endTime, final long duration) {
        kcg0 kcg0VarSubscribe = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.mfr
            @Override // p153l.y20
            public final void call(Object obj) {
                ofr.m167494d(this.f136665a, endTime, duration, (Long) obj);
            }
        }, new y20() { // from class: l.nfr
            @Override // p153l.y20
            public final void call(Object obj) {
                ofr.m167491a((Throwable) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        this.countDown = kcg0VarSubscribe;
    }

    /* JADX INFO: renamed from: g */
    public final void m167497g(long endTime, long duration) {
        VProgress vProgressM167501k;
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
        if (duration >= 0 && (vProgressM167501k = m167501k()) != null) {
            vProgressM167501k.setProgress((int) ((j * 100) / duration));
        }
        String strM48075m = C8574a.INSTANCE.m48075m(date);
        TextView textViewM167500j = m167500j();
        if (textViewM167500j != null) {
            textViewM167500j.setText(strM48075m);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Dialog m167498h(Act act, View rootView) {
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71129o).m21519P(rootView, false).m21497C(qa00.m175859d(32.0f), 0, qa00.m175859d(32.0f), 0).m21495B(false).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ImageView m167499i() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TextView m167500j() {
        TextView textView = this._finding_time;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VProgress m167501k() {
        VProgress vProgress = this._progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.m88391r("_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VDraweeView m167502l() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m167503m() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            l4g0Var.m152775j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m167504n() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            l4g0Var.m152774i();
            l4g0Var.m152777l();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m167505o(@NotNull LikeMindedItemStatusData data, @NotNull LikeMindedEnvelope response) {
        data.getClass();
        response.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(this.act);
        layoutInflaterM171370a.getClass();
        Dialog dialog = null;
        this.dialog = m167498h(this.act, m167495e(layoutInflaterM171370a, null));
        uqb0.f180374G.m127115L0(m167502l(), data.icon);
        bnl0.m105509E0(m167499i(), new View.OnClickListener() { // from class: l.kfr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ofr.m167492b(this.f126499a, view);
            }
        });
        long jM174454o = pzi0.m174454o();
        LikeMindedData likeMindedData = response.data;
        m167496f(jM174454o + likeMindedData.remain, likeMindedData.duration);
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lfr
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ofr.m167493c(this.f131894a, dialogInterface);
            }
        });
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.show();
        m167504n();
    }
}
