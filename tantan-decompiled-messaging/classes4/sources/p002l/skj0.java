package p002l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.cxq;
import l.n8c0;
import l.t100;
import l.w8u;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0019\u00104\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Ll/skj0;", "", "Landroid/content/Context;", "context", "", "contentText", "Ll/skj0$a;", "clickListener", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/skj0$a;)V", "", "g", "()V", "c", "Landroid/view/View;", "parentView", "d", "(Landroid/view/View;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getContentText", "()Ljava/lang/String;", "Ll/skj0$a;", "getClickListener", "()Ll/skj0$a;", "Landroidx/appcompat/app/a;", "Landroidx/appcompat/app/a;", "dialog", "Landroid/content/DialogInterface$OnCancelListener;", "e", "Landroid/content/DialogInterface$OnCancelListener;", "getDialogCancelListener", "()Landroid/content/DialogInterface$OnCancelListener;", "setDialogCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", "dialogCancelListener", "Landroid/content/DialogInterface$OnShowListener;", "f", "Landroid/content/DialogInterface$OnShowListener;", "getDialogShowListener", "()Landroid/content/DialogInterface$OnShowListener;", "setDialogShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "dialogShowListener", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "getDialogDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "dialogDismissListener", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class skj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String contentText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0819a clickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public a dialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public DialogInterface.OnCancelListener dialogCancelListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public DialogInterface.OnShowListener dialogShowListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final DialogInterface.OnDismissListener dialogDismissListener;

    /* JADX INFO: renamed from: l.skj0$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ll/skj0$a;", "", "", "a", "()V", "b", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0819a {
        /* JADX INFO: renamed from: a */
        void mo18857a();

        /* JADX INFO: renamed from: b */
        void mo18858b();
    }

    public skj0(@NotNull Context context, @NotNull String str, @NotNull InterfaceC0819a interfaceC0819a) {
        context.getClass();
        str.getClass();
        interfaceC0819a.getClass();
        this.context = context;
        this.contentText = str;
        this.clickListener = interfaceC0819a;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m22513e(skj0 skj0Var, View view) {
        view.getClass();
        skj0Var.clickListener.mo18858b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m22514f(skj0 skj0Var, View view) {
        view.getClass();
        skj0Var.clickListener.mo18857a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m22515c() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final void m22516d(View parentView) {
        VText vTextFindViewById = parentView.findViewById(g5c0.f11042c);
        vTextFindViewById.getClass();
        cxq.c(vTextFindViewById, new Function1() { // from class: l.qkj0
            public final Object invoke(Object obj) {
                return skj0.m22513e(this.f18077a, (View) obj);
            }
        });
        VButton vButtonFindViewById = parentView.findViewById(g5c0.f11052d);
        vButtonFindViewById.getClass();
        cxq.c(vButtonFindViewById, new Function1() { // from class: l.rkj0
            public final Object invoke(Object obj) {
                return skj0.m22514f(this.f18588a, (View) obj);
            }
        });
        parentView.findViewById(g5c0.f11062e).setText(w8u.u(R$string.f3133Yj, this.contentText));
    }

    /* JADX INFO: renamed from: g */
    public final void m22517g() {
        Dialog dialog = null;
        View viewInflate = LayoutInflater.from(this.context).inflate(t6c0.f19878i6, (ViewGroup) null);
        Dialog dialogCreate = new a.a(this.context, n8c0.a).setView(viewInflate).create();
        dialogCreate.getClass();
        this.dialog = dialogCreate;
        if (dialogCreate == null) {
            Intrinsics.r("dialog");
            dialogCreate = null;
        }
        Window window = dialogCreate.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
            dialog2 = null;
        }
        dialog2.setCancelable(true);
        dialog2.setCanceledOnTouchOutside(true);
        dialog2.setOnCancelListener(this.dialogCancelListener);
        dialog2.setOnDismissListener(this.dialogDismissListener);
        dialog2.setOnShowListener(this.dialogShowListener);
        viewInflate.getClass();
        m22516d(viewInflate);
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog3;
        }
        dialog.show();
        if (window != null) {
            window.setLayout(xdl0.y0() - (t100.d(32.0f) * 2), t100.d(285.0f));
        }
    }
}
