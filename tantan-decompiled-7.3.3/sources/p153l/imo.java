package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.p058ui.dlg.IntlMemberAnimView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m88121d2 = {"Ll/imo;", "", "Ll/imo$a;", "builder", "<init>", "(Ll/imo$a;)V", "Landroid/content/DialogInterface$OnCancelListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "j", "(Landroid/content/DialogInterface$OnCancelListener;)V", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListener", "k", "(Landroid/content/DialogInterface$OnDismissListener;)V", "m", "()V", "f", "Lcom/p1/mobile/android/app/Dialog;", "g", "(Ll/imo$a;)Lcom/p1/mobile/android/app/Dialog;", "a", "Ll/imo$a;", "getBuilder", "()Ll/imo$a;", "b", "Lcom/p1/mobile/android/app/Dialog;", "dlg", "Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", "c", "Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", OMSTemplateModeType.view, "Ll/l4g0;", Constants.INAPP_DATA_TAG, "Ll/l4g0;", "h", "()Ll/l4g0;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/l4g0;)V", "pageHelper", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class imo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C17744a builder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Dialog dlg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final IntlMemberAnimView view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public l4g0 pageHelper;

    /* JADX INFO: renamed from: l.imo$a */
    @Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\"\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R$\u0010A\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010E\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010K\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010N\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR$\u0010T\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010P\u001a\u0004\b;\u0010Q\"\u0004\bR\u0010SR\"\u0010V\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010F\u001a\u0004\bB\u0010H\"\u0004\bU\u0010JR$\u0010]\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bX\u0010Z\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b^\u0010%\"\u0004\b_\u0010'¨\u0006a"}, m88121d2 = {"Ll/imo$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "cancel", "b", "(Z)Ll/imo$a;", "", "color", BLiveStormDanmakuGiftResourceType.f45294s, "(I)Ll/imo$a;", "", "message", "Ll/y20;", "Ll/imo;", "action", "r", "(Ljava/lang/CharSequence;Ll/y20;)Ll/imo$a;", Constants.KEY_T, "(Ljava/lang/CharSequence;)Ll/imo$a;", "u", "c", "(Ll/y20;)Ll/imo$a;", "Landroid/content/DialogInterface$OnDismissListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, ResourceDirection.f39656v, "(Landroid/content/DialogInterface$OnDismissListener;)Ll/imo$a;", "a", "()Ll/imo;", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/android/app/Act;", "Z", "e", "()Z", "setCancelAble", "(Z)V", "cancelAble", "Landroid/content/DialogInterface$OnDismissListener;", RXScreenCaptureService.KEY_INDEX, "()Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "dismissListener", "Ll/y20;", "j", "()Ll/y20;", "setNegativeAction", "(Ll/y20;)V", "negativeAction", "n", "setPositiveAction", "positiveAction", "f", "setCloseAction", "closeAction", "g", "Ljava/lang/CharSequence;", BLiveStormDanmakuGiftResourceType.f45292l, "()Ljava/lang/CharSequence;", "setNegativeTitle", "(Ljava/lang/CharSequence;)V", "negativeTitle", "h", "o", "setPositiveTitle", "positiveTitle", "I", "k", "()I", "setNegativeColor", "(I)V", "negativeColor", "q", "setTopResid", "topResid", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setContentSvga", "(Ljava/lang/String;)V", "contentSvga", "setContentSvgaLoop", "contentSvgaLoop", "Landroid/content/DialogInterface$OnCancelListener;", "m", "Landroid/content/DialogInterface$OnCancelListener;", "()Landroid/content/DialogInterface$OnCancelListener;", "setOnCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", "onCancelListener", "p", "setShowBoostingTime", "showBoostingTime", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17744a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean cancelAble;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public DialogInterface.OnDismissListener dismissListener;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public y20<imo> negativeAction;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public y20<imo> positiveAction;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public y20<imo> closeAction;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public CharSequence negativeTitle;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public CharSequence positiveTitle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @ColorInt
        public int negativeColor;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @DrawableRes
        public int topResid;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public String contentSvga;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public int contentSvgaLoop;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public DialogInterface.OnCancelListener onCancelListener;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public boolean showBoostingTime;

        public C17744a(@NotNull Act act) {
            act.getClass();
            this.act = act;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final imo m140959a() {
            return new imo(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C17744a m140960b(boolean cancel) {
            this.cancelAble = cancel;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C17744a m140961c(@Nullable y20<imo> action) {
            this.closeAction = action;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Act getAct() {
            return this.act;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getCancelAble() {
            return this.cancelAble;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final y20<imo> m140964f() {
            return this.closeAction;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getContentSvga() {
            return this.contentSvga;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getContentSvgaLoop() {
            return this.contentSvgaLoop;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final DialogInterface.OnDismissListener getDismissListener() {
            return this.dismissListener;
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public final y20<imo> m140968j() {
            return this.negativeAction;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getNegativeColor() {
            return this.negativeColor;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
        public final CharSequence getNegativeTitle() {
            return this.negativeTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final DialogInterface.OnCancelListener getOnCancelListener() {
            return this.onCancelListener;
        }

        @Nullable
        /* JADX INFO: renamed from: n */
        public final y20<imo> m140972n() {
            return this.positiveAction;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final CharSequence getPositiveTitle() {
            return this.positiveTitle;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getShowBoostingTime() {
            return this.showBoostingTime;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final int getTopResid() {
            return this.topResid;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final C17744a m140976r(@Nullable CharSequence message, @Nullable y20<imo> action) {
            this.negativeTitle = message;
            this.negativeAction = action;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final C17744a m140977s(int color) {
            this.negativeColor = color;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C17744a m140978t(@Nullable CharSequence message) {
            return m140979u(message, null);
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public final C17744a m140979u(@Nullable CharSequence message, @Nullable y20<imo> action) {
            this.positiveTitle = message;
            this.positiveAction = action;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final C17744a m140980v(@Nullable DialogInterface.OnDismissListener listener) {
            this.dismissListener = listener;
            return this;
        }
    }

    public imo(C17744a c17744a) {
        this.builder = c17744a;
        Dialog dialogM140952g = m140952g(c17744a);
        this.dlg = dialogM140952g;
        View viewM21457P = dialogM140952g.m21457P();
        viewM21457P.getClass();
        IntlMemberAnimView intlMemberAnimView = (IntlMemberAnimView) viewM21457P;
        this.view = intlMemberAnimView;
        m140956k(c17744a.getDismissListener());
        m140955j(c17744a.getOnCancelListener());
        bnl0.m105524M(intlMemberAnimView.f29768h, c17744a.getShowBoostingTime());
        if (!TextUtils.isEmpty(c17744a.getNegativeTitle())) {
            intlMemberAnimView.m46317M(c17744a.getNegativeTitle(), new Runnable() { // from class: l.dmo
                @Override // java.lang.Runnable
                public final void run() {
                    imo.m140946a(this.f89716a);
                }
            });
        }
        if (!TextUtils.isEmpty(c17744a.getPositiveTitle())) {
            intlMemberAnimView.m46318N(c17744a.getPositiveTitle(), new Runnable() { // from class: l.emo
                @Override // java.lang.Runnable
                public final void run() {
                    imo.m140948c(this.f94675a);
                }
            });
        }
        if (NullChecker.m82486a(c17744a.m140964f())) {
            intlMemberAnimView.m46315E(new Runnable() { // from class: l.fmo
                @Override // java.lang.Runnable
                public final void run() {
                    imo.m140950e(this.f99814a);
                }
            });
        }
        if (c17744a.getTopResid() > 0) {
            intlMemberAnimView.m46331z(c17744a.getTopResid());
        }
        if (NullChecker.m82486a(c17744a.getContentSvga())) {
            intlMemberAnimView.m46330w(c17744a.getContentSvga(), c17744a.getContentSvgaLoop());
        }
        if (c17744a.getNegativeColor() != 0) {
            intlMemberAnimView.f29756B.setTextColor(c17744a.getNegativeColor());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m140946a(imo imoVar) {
        if (NullChecker.m82486a(imoVar.builder.m140968j())) {
            y20<imo> y20VarM140968j = imoVar.builder.m140968j();
            y20VarM140968j.getClass();
            y20VarM140968j.call(imoVar);
        }
        imoVar.m140951f();
    }

    /* JADX INFO: renamed from: b */
    public static void m140947b(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m140948c(imo imoVar) {
        if (NullChecker.m82486a(imoVar.builder.m140972n())) {
            y20<imo> y20VarM140972n = imoVar.builder.m140972n();
            y20VarM140972n.getClass();
            y20VarM140972n.call(imoVar);
        }
        imoVar.m140951f();
    }

    /* JADX INFO: renamed from: d */
    public static void m140949d(DialogInterface.OnDismissListener onDismissListener, imo imoVar, DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        if (imoVar.pageHelper != null) {
            w1e.m204401e(imoVar.m140953h());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m140950e(imo imoVar) {
        y20<imo> y20VarM140964f = imoVar.builder.m140964f();
        y20VarM140964f.getClass();
        y20VarM140964f.call(imoVar);
        imoVar.m140951f();
    }

    /* JADX INFO: renamed from: f */
    public final void m140951f() {
        this.dlg.dismiss();
        if (this.pageHelper != null) {
            w1e.m204401e(m140953h());
        }
    }

    /* JADX INFO: renamed from: g */
    public final Dialog m140952g(C17744a builder) {
        Dialog dialogM21566z = builder.getAct().dialog().m21515L(bgc0.f76582c).m21516M(pec0.f151915J0).m21497C(qa00.m175859d(24.0f), 0, qa00.m175859d(24.0f), 0).m21495B(builder.getCancelAble()).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final l4g0 m140953h() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            return l4g0Var;
        }
        Intrinsics.m88391r("pageHelper");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final IntlMemberAnimView getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: j */
    public final void m140955j(@Nullable final DialogInterface.OnCancelListener listener) {
        this.dlg.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.hmo
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                imo.m140947b(listener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m140956k(@Nullable final DialogInterface.OnDismissListener dismissListener) {
        this.dlg.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gmo
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                imo.m140949d(dismissListener, this, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m140957l(@NotNull l4g0 l4g0Var) {
        l4g0Var.getClass();
        this.pageHelper = l4g0Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m140958m() {
        this.dlg.show();
        if (this.pageHelper != null) {
            w1e.m204402f(m140953h());
        }
    }

    public /* synthetic */ imo(C17744a c17744a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17744a);
    }
}
