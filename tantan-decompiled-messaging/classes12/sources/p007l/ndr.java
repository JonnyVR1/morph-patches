package p007l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.OMSTemplateType;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.LikeMindedData;
import com.p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p1.mobile.putong.core.ui.likeminded.a;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.c4g0;
import l.cwf0;
import l.i0e;
import l.jdr;
import l.jo0;
import l.kdr;
import l.ldr;
import l.mdr;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.odr;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010HR\u0016\u0010K\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010M¨\u0006O"}, d2 = {"Ll/ndr;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", Data.TYPE, "Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;", "response", "", "o", "(Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;Lcom/p1/mobile/putong/core/data/LikeMindedEnvelope;)V", "n", "()V", "m", "", "endTime", "duration", "f", "(JJ)V", "g", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "l", "()Lv/VDraweeView;", "set_setting_img", "(Lv/VDraweeView;)V", "_setting_img", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "get_setting_content_title", "()Landroid/widget/TextView;", "set_setting_content_title", "(Landroid/widget/TextView;)V", "_setting_content_title", "j", "set_finding_time", "_finding_time", "Lv/VProgress;", "Lv/VProgress;", "k", "()Lv/VProgress;", "set_progress", "(Lv/VProgress;)V", "_progress", "Ll/cwf0;", "Ll/cwf0;", "pageHelper", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/c4g0;", "Ll/c4g0;", "countDown", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        cwf0 cwf0VarC = i0e.c("p_same_check_popup", ndr.class.getName());
        cwf0VarC.getClass();
        this.pageHelper = cwf0VarC;
    }

    /* JADX INFO: renamed from: a */
    public static void m12138a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m12139b(ndr ndrVar, View view) {
        szd szdVar = ndrVar.dialog;
        if (szdVar == null) {
            Intrinsics.r(OMSTemplateType.dialog);
            szdVar = null;
        }
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m12140c(ndr ndrVar, DialogInterface dialogInterface) {
        c4g0 c4g0Var = ndrVar.countDown;
        if (c4g0Var == null) {
            Intrinsics.r("countDown");
            c4g0Var = null;
        }
        mkd0.z(c4g0Var);
        ndrVar.m12150m();
    }

    /* JADX INFO: renamed from: d */
    public static void m12141d(ndr ndrVar, long j, long j2, Long l2) {
        ndrVar.m12144g(j, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m12142e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = odr.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: f */
    public final void m12143f(long endTime, long duration) {
        c4g0 c4g0VarSubscribe = c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new ldr(this, endTime, duration), new mdr()));
        c4g0VarSubscribe.getClass();
        this.countDown = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: g */
    public final void m12144g(long endTime, long duration) {
        VProgress vProgressM12148k;
        long jO = mqi0.o();
        Date date = new Date();
        long j = endTime - jO;
        date.setTime(Math.max(0L, j));
        if (j <= 0) {
            szd szdVar = this.dialog;
            if (szdVar == null) {
                Intrinsics.r(OMSTemplateType.dialog);
                szdVar = null;
            }
            szdVar.dismiss();
        }
        if (duration >= 0 && (vProgressM12148k = m12148k()) != null) {
            vProgressM12148k.setProgress((int) ((j * 100) / duration));
        }
        String strM = a.INSTANCE.m(date);
        TextView textViewM12147j = m12147j();
        if (textViewM12147j != null) {
            textViewM12147j.setText(strM);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Dialog m12145h(Act act, View rootView) {
        Dialog dialogZ = act.dialog().L(v7c0.o).P(rootView, false).C(t100.d(32.0f), 0, t100.d(32.0f), 0).B(false).z();
        dialogZ.getClass();
        return dialogZ;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ImageView m12146i() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TextView m12147j() {
        TextView textView = this._finding_time;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VProgress m12148k() {
        VProgress vProgress = this._progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.r("_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VDraweeView m12149l() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_setting_img");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m12150m() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.k();
            cwf0Var.j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m12151n() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.i();
            cwf0Var.l();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12152o(@NotNull LikeMindedItemStatusData data, @NotNull LikeMindedEnvelope response) {
        data.getClass();
        response.getClass();
        LayoutInflater layoutInflaterA = o7r.a(this.act);
        layoutInflaterA.getClass();
        Dialog dialog = null;
        this.dialog = m12145h(this.act, m12142e(layoutInflaterA, null));
        qib0.G.L0(m12149l(), data.icon);
        xdl0.E0(m12146i(), new jdr(this));
        long jO = mqi0.o();
        LikeMindedData likeMindedData = response.data;
        m12143f(jO + likeMindedData.remain, likeMindedData.duration);
        szd szdVar = this.dialog;
        if (szdVar == null) {
            Intrinsics.r(OMSTemplateType.dialog);
            szdVar = null;
        }
        szdVar.setOnDismissListener(new kdr(this));
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r(OMSTemplateType.dialog);
        } else {
            dialog = dialog2;
        }
        dialog.show();
        m12151n();
    }
}
