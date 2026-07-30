package p149l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.data.LikeMindedData;
import com.p046p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p046p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p046p1.mobile.putong.core.p053ui.likeminded.C8411a;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010HR\u0016\u0010K\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010M¨\u0006O"}, m87232d2 = {"Ll/ndr;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "data", "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "response", "", "o", "(Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;)V", "n", "()V", "m", "", "endTime", BLiveOperationTitleShowType.duration, "f", "(JJ)V", "g", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lv/VDraweeView;", "set_setting_img", "(Lv/VDraweeView;)V", "_setting_img", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "get_setting_content_title", "()Landroid/widget/TextView;", "set_setting_content_title", "(Landroid/widget/TextView;)V", "_setting_content_title", "j", "set_finding_time", "_finding_time", "Lv/VProgress;", "Lv/VProgress;", "k", "()Lv/VProgress;", "set_progress", "(Lv/VProgress;)V", "_progress", "Ll/cwf0;", "Ll/cwf0;", "pageHelper", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/c4g0;", "Ll/c4g0;", "countDown", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ndr {

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
    public final cwf0 pageHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public Dialog dialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public c4g0 countDown;

    public ndr(@NotNull Act act) {
        act.getClass();
        this.act = act;
        cwf0 cwf0VarM133794c = i0e.m133794c("p_same_check_popup", ndr.class.getName());
        cwf0VarM133794c.getClass();
        this.pageHelper = cwf0VarM133794c;
    }

    /* JADX INFO: renamed from: a */
    public static void m159026a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m159027b(ndr ndrVar, View view) {
        Dialog dialog = ndrVar.dialog;
        if (dialog == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m159028c(ndr ndrVar, DialogInterface dialogInterface) {
        c4g0 c4g0Var = ndrVar.countDown;
        if (c4g0Var == null) {
            Intrinsics.m87502r("countDown");
            c4g0Var = null;
        }
        mkd0.m154992z(c4g0Var);
        ndrVar.m159038m();
    }

    /* JADX INFO: renamed from: d */
    public static void m159029d(ndr ndrVar, long j, long j2, Long l2) {
        ndrVar.m159032g(j, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m159030e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM163712b = odr.m163712b(this, inflater, parent);
        viewM163712b.getClass();
        return viewM163712b;
    }

    /* JADX INFO: renamed from: f */
    public final void m159031f(final long endTime, final long duration) {
        c4g0 c4g0VarSubscribe = C22306c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ldr
            @Override // p149l.e30
            public final void call(Object obj) {
                ndr.m159029d(this.f127596a, endTime, duration, (Long) obj);
            }
        }, new e30() { // from class: l.mdr
            @Override // p149l.e30
            public final void call(Object obj) {
                ndr.m159026a((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.countDown = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: g */
    public final void m159032g(long endTime, long duration) {
        VProgress vProgressM159036k;
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
        if (duration >= 0 && (vProgressM159036k = m159036k()) != null) {
            vProgressM159036k.setProgress((int) ((j * 100) / duration));
        }
        String strM46892m = C8411a.INSTANCE.m46892m(date);
        TextView textViewM159035j = m159035j();
        if (textViewM159035j != null) {
            textViewM159035j.setText(strM46892m);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Dialog m159033h(Act act, View rootView) {
        Dialog dialogM20567z = act.dialog().m20516L(v7c0.f180368o).m20520P(rootView, false).m20498C(t100.m186890d(32.0f), 0, t100.m186890d(32.0f), 0).m20496B(false).m20567z();
        dialogM20567z.getClass();
        return dialogM20567z;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ImageView m159034i() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TextView m159035j() {
        TextView textView = this._finding_time;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VProgress m159036k() {
        VProgress vProgress = this._progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.m87502r("_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VDraweeView m159037l() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m159038m() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            cwf0Var.m109034j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m159039n() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.m109033i();
            cwf0Var.m109036l();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m159040o(@NotNull LikeMindedItemStatusData data, @NotNull LikeMindedEnvelope response) {
        data.getClass();
        response.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(this.act);
        layoutInflaterM163037a.getClass();
        Dialog dialog = null;
        this.dialog = m159033h(this.act, m159030e(layoutInflaterM163037a, null));
        qib0.f154691G.m102331L0(m159037l(), data.icon);
        xdl0.m208329E0(m159034i(), new View.OnClickListener() { // from class: l.jdr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ndr.m159027b(this.f117435a, view);
            }
        });
        long jM155944o = mqi0.m155944o();
        LikeMindedData likeMindedData = response.data;
        m159031f(jM155944o + likeMindedData.remain, likeMindedData.duration);
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kdr
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ndr.m159028c(this.f122617a, dialogInterface);
            }
        });
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.show();
        m159039n();
    }
}
