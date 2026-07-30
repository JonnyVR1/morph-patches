package p003l;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.dlg.IntlMemberAnimView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.e30;
import l.i0e;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Ll/iko;", "", "Ll/iko$a;", "builder", "<init>", "(Ll/iko$a;)V", "Landroid/content/DialogInterface$OnCancelListener;", "listener", "", "j", "(Landroid/content/DialogInterface$OnCancelListener;)V", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListener", "k", "(Landroid/content/DialogInterface$OnDismissListener;)V", "m", "()V", "f", "Lcom/p1/mobile/android/app/Dialog;", "g", "(Ll/iko$a;)Lcom/p1/mobile/android/app/Dialog;", "a", "Ll/iko$a;", "getBuilder", "()Ll/iko$a;", "b", "Lcom/p1/mobile/android/app/Dialog;", "dlg", "Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", "c", "Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", "i", "()Lcom/p1/mobile/putong/core/ui/dlg/IntlMemberAnimView;", "view", "Ll/cwf0;", "d", "Ll/cwf0;", "h", "()Ll/cwf0;", "l", "(Ll/cwf0;)V", "pageHelper", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class iko {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C3350a builder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Dialog dlg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final IntlMemberAnimView view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public cwf0 pageHelper;

    /* JADX INFO: renamed from: l.iko$a */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\"\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R$\u0010A\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010E\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010K\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010N\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR$\u0010T\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010P\u001a\u0004\b;\u0010Q\"\u0004\bR\u0010SR\"\u0010V\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010F\u001a\u0004\bB\u0010H\"\u0004\bU\u0010JR$\u0010]\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bX\u0010Z\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b^\u0010%\"\u0004\b_\u0010'¨\u0006a"}, d2 = {"Ll/iko$a;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "cancel", "b", "(Z)Ll/iko$a;", "", "color", "s", "(I)Ll/iko$a;", "", "message", "Ll/e30;", "Ll/iko;", "action", "r", "(Ljava/lang/CharSequence;Ll/e30;)Ll/iko$a;", "t", "(Ljava/lang/CharSequence;)Ll/iko$a;", "u", "c", "(Ll/e30;)Ll/iko$a;", "Landroid/content/DialogInterface$OnDismissListener;", "listener", "v", "(Landroid/content/DialogInterface$OnDismissListener;)Ll/iko$a;", "a", "()Ll/iko;", "Lcom/p1/mobile/android/app/Act;", "d", "()Lcom/p1/mobile/android/app/Act;", "Z", "e", "()Z", "setCancelAble", "(Z)V", "cancelAble", "Landroid/content/DialogInterface$OnDismissListener;", "i", "()Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "dismissListener", "Ll/e30;", "j", "()Ll/e30;", "setNegativeAction", "(Ll/e30;)V", "negativeAction", "n", "setPositiveAction", "positiveAction", "f", "setCloseAction", "closeAction", "g", "Ljava/lang/CharSequence;", "l", "()Ljava/lang/CharSequence;", "setNegativeTitle", "(Ljava/lang/CharSequence;)V", "negativeTitle", "h", "o", "setPositiveTitle", "positiveTitle", "I", "k", "()I", "setNegativeColor", "(I)V", "negativeColor", "q", "setTopResid", "topResid", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setContentSvga", "(Ljava/lang/String;)V", "contentSvga", "setContentSvgaLoop", "contentSvgaLoop", "Landroid/content/DialogInterface$OnCancelListener;", "m", "Landroid/content/DialogInterface$OnCancelListener;", "()Landroid/content/DialogInterface$OnCancelListener;", "setOnCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", "onCancelListener", "p", "setShowBoostingTime", "showBoostingTime", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3350a {

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

        public C3350a(@NotNull Act act) {
            act.getClass();
            this.act = act;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final iko m7256a() {
            return new iko(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C3350a m7257b(boolean cancel) {
            this.cancelAble = cancel;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C3350a m7258c(@Nullable e30<iko> action) {
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
        public final e30<iko> m7261f() {
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
        public final e30<iko> m7265j() {
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
        public final e30<iko> m7269n() {
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
        public final C3350a m7273r(@Nullable CharSequence message, @Nullable e30<iko> action) {
            this.negativeTitle = message;
            this.negativeAction = action;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final C3350a m7274s(int color) {
            this.negativeColor = color;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C3350a m7275t(@Nullable CharSequence message) {
            return m7276u(message, null);
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public final C3350a m7276u(@Nullable CharSequence message, @Nullable e30<iko> action) {
            this.positiveTitle = message;
            this.positiveAction = action;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final C3350a m7277v(@Nullable DialogInterface.OnDismissListener listener) {
            this.dismissListener = listener;
            return this;
        }
    }

    public iko(C3350a c3350a) {
        this.builder = c3350a;
        Dialog dialogM7249g = m7249g(c3350a);
        this.dlg = dialogM7249g;
        Object objP = dialogM7249g.P();
        objP.getClass();
        IntlMemberAnimView intlMemberAnimView = (IntlMemberAnimView) objP;
        this.view = intlMemberAnimView;
        m7253k(c3350a.getDismissListener());
        m7252j(c3350a.getOnCancelListener());
        xdl0.M(intlMemberAnimView.f1314h, c3350a.getShowBoostingTime());
        if (!TextUtils.isEmpty(c3350a.getNegativeTitle())) {
            intlMemberAnimView.m2451M(c3350a.getNegativeTitle(), new Runnable() { // from class: l.dko
                @Override // java.lang.Runnable
                public final void run() {
                    iko.m7243a(this.f4180a);
                }
            });
        }
        if (!TextUtils.isEmpty(c3350a.getPositiveTitle())) {
            intlMemberAnimView.m2452N(c3350a.getPositiveTitle(), new Runnable() { // from class: l.eko
                @Override // java.lang.Runnable
                public final void run() {
                    iko.m7245c(this.f4310a);
                }
            });
        }
        if (NullChecker.a(c3350a.m7261f())) {
            intlMemberAnimView.m2449E(new Runnable() { // from class: l.fko
                @Override // java.lang.Runnable
                public final void run() {
                    iko.m7247e(this.f4455a);
                }
            });
        }
        if (c3350a.getTopResid() > 0) {
            intlMemberAnimView.m2465z(c3350a.getTopResid());
        }
        if (NullChecker.a(c3350a.getContentSvga())) {
            intlMemberAnimView.m2464w(c3350a.getContentSvga(), c3350a.getContentSvgaLoop());
        }
        if (c3350a.getNegativeColor() != 0) {
            intlMemberAnimView.f1302B.setTextColor(c3350a.getNegativeColor());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7243a(iko ikoVar) {
        if (NullChecker.a(ikoVar.builder.m7265j())) {
            e30<iko> e30VarM7265j = ikoVar.builder.m7265j();
            e30VarM7265j.getClass();
            e30VarM7265j.call(ikoVar);
        }
        ikoVar.m7248f();
    }

    /* JADX INFO: renamed from: b */
    public static void m7244b(DialogInterface.OnCancelListener onCancelListener, DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7245c(iko ikoVar) {
        if (NullChecker.a(ikoVar.builder.m7269n())) {
            e30<iko> e30VarM7269n = ikoVar.builder.m7269n();
            e30VarM7269n.getClass();
            e30VarM7269n.call(ikoVar);
        }
        ikoVar.m7248f();
    }

    /* JADX INFO: renamed from: d */
    public static void m7246d(DialogInterface.OnDismissListener onDismissListener, iko ikoVar, DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        if (ikoVar.pageHelper != null) {
            i0e.e(ikoVar.m7250h());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7247e(iko ikoVar) {
        e30<iko> e30VarM7261f = ikoVar.builder.m7261f();
        e30VarM7261f.getClass();
        e30VarM7261f.call(ikoVar);
        ikoVar.m7248f();
    }

    /* JADX INFO: renamed from: f */
    public final void m7248f() {
        this.dlg.dismiss();
        if (this.pageHelper != null) {
            i0e.e(m7250h());
        }
    }

    /* JADX INFO: renamed from: g */
    public final Dialog m7249g(C3350a builder) {
        Dialog dialogZ = builder.getAct().dialog().L(w7c0.f8129c).M(k6c0.f5470J0).C(t100.d(24.0f), 0, t100.d(24.0f), 0).B(builder.getCancelAble()).z();
        dialogZ.getClass();
        return dialogZ;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final cwf0 m7250h() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            return cwf0Var;
        }
        Intrinsics.r("pageHelper");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final IntlMemberAnimView getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: j */
    public final void m7252j(@Nullable final DialogInterface.OnCancelListener listener) {
        this.dlg.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.hko
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                iko.m7244b(listener, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m7253k(@Nullable final DialogInterface.OnDismissListener dismissListener) {
        this.dlg.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gko
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                iko.m7246d(dismissListener, this, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m7254l(@NotNull cwf0 cwf0Var) {
        cwf0Var.getClass();
        this.pageHelper = cwf0Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m7255m() {
        this.dlg.show();
        if (this.pageHelper != null) {
            i0e.f(m7250h());
        }
    }

    public /* synthetic */ iko(C3350a c3350a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3350a);
    }
}
