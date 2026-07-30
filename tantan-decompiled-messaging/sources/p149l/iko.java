package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.p053ui.dlg.IntlMemberAnimView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m87232d2 = {"Ll/iko;", "", "Ll/iko$a;", "builder", "<init>", "(Ll/iko$a;)V", "Landroid/content/DialogInterface$OnCancelListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "j", "(Landroid/content/DialogInterface$OnCancelListener;)V", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListener", "k", "(Landroid/content/DialogInterface$OnDismissListener;)V", "m", "()V", "f", "Lcom/p1/mobile/android/app/Dialog;", "g", "(Ll/iko$a;)Lcom/p1/mobile/android/app/Dialog;", "a", "Ll/iko$a;", "getBuilder", "()Ll/iko$a;", "b", "Lcom/p1/mobile/android/app/Dialog;", "dlg", "Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", "c", "Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", OMSTemplateModeType.view, "Ll/cwf0;", Constants.INAPP_DATA_TAG, "Ll/cwf0;", "h", "()Ll/cwf0;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/cwf0;)V", "pageHelper", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class iko {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C17571a builder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Dialog dlg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final IntlMemberAnimView view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public cwf0 pageHelper;

    /* JADX INFO: renamed from: l.iko$a */
    @Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\"\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R$\u0010A\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010E\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010K\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010N\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR$\u0010T\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010P\u001a\u0004\b;\u0010Q\"\u0004\bR\u0010SR\"\u0010V\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010F\u001a\u0004\bB\u0010H\"\u0004\bU\u0010JR$\u0010]\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bX\u0010Z\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b^\u0010%\"\u0004\b_\u0010'¨\u0006a"}, m87232d2 = {"Ll/iko$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "cancel", "b", "(Z)Ll/iko$a;", "", "color", BLiveStormDanmakuGiftResourceType.f44446s, "(I)Ll/iko$a;", "", "message", "Ll/e30;", "Ll/iko;", "action", "r", "(Ljava/lang/CharSequence;Ll/e30;)Ll/iko$a;", Constants.KEY_T, "(Ljava/lang/CharSequence;)Ll/iko$a;", "u", "c", "(Ll/e30;)Ll/iko$a;", "Landroid/content/DialogInterface$OnDismissListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, ResourceDirection.f38808v, "(Landroid/content/DialogInterface$OnDismissListener;)Ll/iko$a;", "a", "()Ll/iko;", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/android/app/Act;", "Z", "e", "()Z", "setCancelAble", "(Z)V", "cancelAble", "Landroid/content/DialogInterface$OnDismissListener;", RXScreenCaptureService.KEY_INDEX, "()Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "dismissListener", "Ll/e30;", "j", "()Ll/e30;", "setNegativeAction", "(Ll/e30;)V", "negativeAction", "n", "setPositiveAction", "positiveAction", "f", "setCloseAction", "closeAction", "g", "Ljava/lang/CharSequence;", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/lang/CharSequence;", "setNegativeTitle", "(Ljava/lang/CharSequence;)V", "negativeTitle", "h", "o", "setPositiveTitle", "positiveTitle", "I", "k", "()I", "setNegativeColor", "(I)V", "negativeColor", "q", "setTopResid", "topResid", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setContentSvga", "(Ljava/lang/String;)V", "contentSvga", "setContentSvgaLoop", "contentSvgaLoop", "Landroid/content/DialogInterface$OnCancelListener;", "m", "Landroid/content/DialogInterface$OnCancelListener;", "()Landroid/content/DialogInterface$OnCancelListener;", "setOnCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", "onCancelListener", "p", "setShowBoostingTime", "showBoostingTime", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17571a {

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
        public e30<iko> negativeAction;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public e30<iko> positiveAction;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public e30<iko> closeAction;

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

        public C17571a(@NotNull Act act) {
            act.getClass();
            this.act = act;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final iko m136848a() {
            return new iko(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C17571a m136849b(boolean cancel) {
            this.cancelAble = cancel;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C17571a m136850c(@Nullable e30<iko> action) {
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
        public final e30<iko> m136853f() {
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
        public final e30<iko> m136857j() {
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
        public final e30<iko> m136861n() {
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
        public final C17571a m136865r(@Nullable CharSequence message, @Nullable e30<iko> action) {
            this.negativeTitle = message;
            this.negativeAction = action;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final C17571a m136866s(int color) {
            this.negativeColor = color;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C17571a m136867t(@Nullable CharSequence message) {
            return m136868u(message, null);
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public final C17571a m136868u(@Nullable CharSequence message, @Nullable e30<iko> action) {
            this.positiveTitle = message;
            this.positiveAction = action;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final C17571a m136869v(@Nullable DialogInterface.OnDismissListener listener) {
            this.dismissListener = listener;
            return this;
        }
    }

    public iko(C17571a c17571a) {
        this.builder = c17571a;
        Dialog dialogM136841g = m136841g(c17571a);
        this.dlg = dialogM136841g;
        View viewM20458P = dialogM136841g.m20458P();
        viewM20458P.getClass();
        IntlMemberAnimView intlMemberAnimView = (IntlMemberAnimView) viewM20458P;
        this.view = intlMemberAnimView;
        m136845k(c17571a.getDismissListener());
        m136844j(c17571a.getOnCancelListener());
        xdl0.m208344M(intlMemberAnimView.f28920h, c17571a.getShowBoostingTime());
        if (!TextUtils.isEmpty(c17571a.getNegativeTitle())) {
            intlMemberAnimView.m45134M(c17571a.getNegativeTitle(), new Runnable() { // from class: l.dko
                @Override // java.lang.Runnable
                public final void run() {
                    iko.m136835a(this.f86686a);
                }
            });
        }
        if (!TextUtils.isEmpty(c17571a.getPositiveTitle())) {
            intlMemberAnimView.m45135N(c17571a.getPositiveTitle(), new Runnable() { // from class: l.eko
                @Override // java.lang.Runnable
                public final void run() {
                    iko.m136837c(this.f92001a);
                }
            });
        }
        if (NullChecker.m81303a(c17571a.m136853f())) {
            intlMemberAnimView.m45132E(new Runnable() { // from class: l.fko
                @Override // java.lang.Runnable
                public final void run() {
                    iko.m136839e(this.f98084a);
                }
            });
        }
        if (c17571a.getTopResid() > 0) {
            intlMemberAnimView.m45148z(c17571a.getTopResid());
        }
        if (NullChecker.m81303a(c17571a.getContentSvga())) {
            intlMemberAnimView.m45147w(c17571a.getContentSvga(), c17571a.getContentSvgaLoop());
        }
        if (c17571a.getNegativeColor() != 0) {
            intlMemberAnimView.f28908B.setTextColor(c17571a.getNegativeColor());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m136835a(iko ikoVar) {
        if (NullChecker.m81303a(ikoVar.builder.m136857j())) {
            e30<iko> e30VarM136857j = ikoVar.builder.m136857j();
            e30VarM136857j.getClass();
            e30VarM136857j.call(ikoVar);
        }
        ikoVar.m136840f();
    }

    /* JADX INFO: renamed from: b */
    public static void m136836b(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m136837c(iko ikoVar) {
        if (NullChecker.m81303a(ikoVar.builder.m136861n())) {
            e30<iko> e30VarM136861n = ikoVar.builder.m136861n();
            e30VarM136861n.getClass();
            e30VarM136861n.call(ikoVar);
        }
        ikoVar.m136840f();
    }

    /* JADX INFO: renamed from: d */
    public static void m136838d(DialogInterface.OnDismissListener onDismissListener, iko ikoVar, DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        if (ikoVar.pageHelper != null) {
            i0e.m133796e(ikoVar.m136842h());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m136839e(iko ikoVar) {
        e30<iko> e30VarM136853f = ikoVar.builder.m136853f();
        e30VarM136853f.getClass();
        e30VarM136853f.call(ikoVar);
        ikoVar.m136840f();
    }

    /* JADX INFO: renamed from: f */
    public final void m136840f() {
        this.dlg.dismiss();
        if (this.pageHelper != null) {
            i0e.m133796e(m136842h());
        }
    }

    /* JADX INFO: renamed from: g */
    public final Dialog m136841g(C17571a builder) {
        Dialog dialogM20567z = builder.getAct().dialog().m20516L(w7c0.f185040c).m20517M(k6c0.f121307J0).m20498C(t100.m186890d(24.0f), 0, t100.m186890d(24.0f), 0).m20496B(builder.getCancelAble()).m20567z();
        dialogM20567z.getClass();
        return dialogM20567z;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final cwf0 m136842h() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            return cwf0Var;
        }
        Intrinsics.m87502r("pageHelper");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final IntlMemberAnimView getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: j */
    public final void m136844j(@Nullable final DialogInterface.OnCancelListener listener) {
        this.dlg.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.hko
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                iko.m136836b(listener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m136845k(@Nullable final DialogInterface.OnDismissListener dismissListener) {
        this.dlg.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gko
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                iko.m136838d(dismissListener, this, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m136846l(@NotNull cwf0 cwf0Var) {
        cwf0Var.getClass();
        this.pageHelper = cwf0Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m136847m() {
        this.dlg.show();
        if (this.pageHelper != null) {
            i0e.m133797f(m136842h());
        }
    }

    public /* synthetic */ iko(C17571a c17571a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17571a);
    }
}
