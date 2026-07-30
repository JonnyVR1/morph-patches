package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0019\u00104\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103¨\u00065"}, m88121d2 = {"Ll/vtj0;", "", "Landroid/content/Context;", "context", "", RXScreenCaptureService.KEY_CONTENT_TEXT, "Ll/vtj0$a;", "clickListener", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/vtj0$a;)V", "", "g", "()V", "c", "Landroid/view/View;", "parentView", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getContentText", "()Ljava/lang/String;", "Ll/vtj0$a;", "getClickListener", "()Ll/vtj0$a;", "Landroidx/appcompat/app/a;", "Landroidx/appcompat/app/a;", OMSTemplateType.dialog, "Landroid/content/DialogInterface$OnCancelListener;", "e", "Landroid/content/DialogInterface$OnCancelListener;", "getDialogCancelListener", "()Landroid/content/DialogInterface$OnCancelListener;", "setDialogCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", "dialogCancelListener", "Landroid/content/DialogInterface$OnShowListener;", "f", "Landroid/content/DialogInterface$OnShowListener;", "getDialogShowListener", "()Landroid/content/DialogInterface$OnShowListener;", "setDialogShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "dialogShowListener", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "getDialogDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "dialogDismissListener", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class vtj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String contentText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC20932a clickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public DialogInterfaceC0075a dialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public DialogInterface.OnCancelListener dialogCancelListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public DialogInterface.OnShowListener dialogShowListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final DialogInterface.OnDismissListener dialogDismissListener;

    /* JADX INFO: renamed from: l.vtj0$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m88121d2 = {"Ll/vtj0$a;", "", "", "a", "()V", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC20932a {
        /* JADX INFO: renamed from: a */
        void mo177956a();

        /* JADX INFO: renamed from: b */
        void mo177957b();
    }

    public vtj0(@NotNull Context context, @NotNull String str, @NotNull InterfaceC20932a interfaceC20932a) {
        context.getClass();
        str.getClass();
        interfaceC20932a.getClass();
        this.context = context;
        this.contentText = str;
        this.clickListener = interfaceC20932a;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m202683e(vtj0 vtj0Var, View view) {
        view.getClass();
        vtj0Var.clickListener.mo177957b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m202684f(vtj0 vtj0Var, View view) {
        view.getClass();
        vtj0Var.clickListener.mo177956a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m202685c() {
        DialogInterfaceC0075a dialogInterfaceC0075a = this.dialog;
        if (dialogInterfaceC0075a == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialogInterfaceC0075a = null;
        }
        dialogInterfaceC0075a.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final void m202686d(View parentView) {
        VText vText = (VText) parentView.findViewById(mdc0.f136137c);
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.ttj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vtj0.m202683e(this.f176078a, (View) obj);
            }
        });
        VButton vButton = (VButton) parentView.findViewById(mdc0.f136147d);
        vButton.getClass();
        czq.m113347c(vButton, new Function1() { // from class: l.utj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vtj0.m202684f(this.f180976a, (View) obj);
            }
        });
        ((VText) parentView.findViewById(mdc0.f136157e)).setText(xau.m209911u(R$string.f47939Yj, this.contentText));
    }

    /* JADX INFO: renamed from: g */
    public final void m202687g() {
        DialogInterfaceC0075a dialogInterfaceC0075a = null;
        View viewInflate = LayoutInflater.from(this.context).inflate(yec0.f199114i6, (ViewGroup) null);
        DialogInterfaceC0075a dialogInterfaceC0075aCreate = new DialogInterfaceC0075a.a(this.context, tgc0.f174055a).setView(viewInflate).create();
        dialogInterfaceC0075aCreate.getClass();
        this.dialog = dialogInterfaceC0075aCreate;
        if (dialogInterfaceC0075aCreate == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialogInterfaceC0075aCreate = null;
        }
        Window window = dialogInterfaceC0075aCreate.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
        DialogInterfaceC0075a dialogInterfaceC0075a2 = this.dialog;
        if (dialogInterfaceC0075a2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialogInterfaceC0075a2 = null;
        }
        dialogInterfaceC0075a2.setCancelable(true);
        dialogInterfaceC0075a2.setCanceledOnTouchOutside(true);
        dialogInterfaceC0075a2.setOnCancelListener(this.dialogCancelListener);
        dialogInterfaceC0075a2.setOnDismissListener(this.dialogDismissListener);
        dialogInterfaceC0075a2.setOnShowListener(this.dialogShowListener);
        viewInflate.getClass();
        m202686d(viewInflate);
        DialogInterfaceC0075a dialogInterfaceC0075a3 = this.dialog;
        if (dialogInterfaceC0075a3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialogInterfaceC0075a = dialogInterfaceC0075a3;
        }
        dialogInterfaceC0075a.show();
        if (window != null) {
            window.setLayout(bnl0.m105592y0() - (qa00.m175859d(32.0f) * 2), qa00.m175859d(285.0f));
        }
    }
}
