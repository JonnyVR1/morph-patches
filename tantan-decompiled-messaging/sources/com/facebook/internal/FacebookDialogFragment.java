package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C1577c;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.jfd0;
import p149l.p620;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J#\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\bR$\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, m87232d2 = {"Lcom/facebook/internal/FacebookDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "X3", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroyView", "values", "Lcom/facebook/FacebookException;", "error", "a4", "(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "b4", BaseSei.f13932Z, "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "c4", "(Landroid/app/Dialog;)V", "innerDialog", "Companion", "a", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class FacebookDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public Dialog innerDialog;

    /* JADX INFO: renamed from: Y3 */
    public static final void m8670Y3(FacebookDialogFragment facebookDialogFragment, Bundle bundle, FacebookException facebookException) {
        facebookDialogFragment.getClass();
        facebookDialogFragment.m8673a4(bundle, facebookException);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m8671Z3(FacebookDialogFragment facebookDialogFragment, Bundle bundle, FacebookException facebookException) {
        facebookDialogFragment.getClass();
        facebookDialogFragment.m8674b4(bundle);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @VisibleForTesting
    /* JADX INFO: renamed from: X3 */
    public final void m8672X3() {
        FragmentActivity activity;
        WebDialog webDialogM8763a;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            p620 p620Var = p620.INSTANCE;
            intent.getClass();
            Bundle bundleM167593v = p620.m167593v(intent);
            if (bundleM167593v != null ? bundleM167593v.getBoolean("is_fallback", false) : false) {
                String string = bundleM167593v != null ? bundleM167593v.getString("url") : null;
                if (C1657e.m8832c0(string)) {
                    C1657e.m8844j0("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{C1577c.m8048m()}, 1));
                DialogC1654b.Companion companion = DialogC1654b.INSTANCE;
                if (string == null) {
                    jfd0.m141176a("null cannot be cast to non-null type kotlin.String");
                    return;
                } else {
                    webDialogM8763a = companion.m8763a(activity, string, str);
                    webDialogM8763a.m8724B(new WebDialog.InterfaceC1650d() { // from class: l.huf
                        @Override // com.facebook.internal.WebDialog.InterfaceC1650d
                        /* JADX INFO: renamed from: a */
                        public final void mo8748a(Bundle bundle, FacebookException facebookException) {
                            FacebookDialogFragment.m8671Z3(this.f109561a, bundle, facebookException);
                        }
                    });
                }
            } else {
                String string2 = bundleM167593v == null ? null : bundleM167593v.getString("action");
                Bundle bundle = bundleM167593v != null ? bundleM167593v.getBundle(CommandMessage.PARAMS) : null;
                if (C1657e.m8832c0(string2)) {
                    C1657e.m8844j0("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    if (string2 == null) {
                        jfd0.m141176a("null cannot be cast to non-null type kotlin.String");
                        return;
                    }
                    webDialogM8763a = new WebDialog.C1647a(activity, string2, bundle).m8742h(new WebDialog.InterfaceC1650d() { // from class: l.guf
                        @Override // com.facebook.internal.WebDialog.InterfaceC1650d
                        /* JADX INFO: renamed from: a */
                        public final void mo8748a(Bundle bundle2, FacebookException facebookException) {
                            FacebookDialogFragment.m8670Y3(this.f104391a, bundle2, facebookException);
                        }
                    }).mo8735a();
                }
            }
            this.innerDialog = webDialogM8763a;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m8673a4(Bundle values, FacebookException error) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        p620 p620Var = p620.INSTANCE;
        Intent intent = activity.getIntent();
        intent.getClass();
        activity.setResult(error == null ? -1 : 0, p620.m167586m(intent, values, error));
        activity.finish();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m8674b4(Bundle values) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (values == null) {
            values = new Bundle();
        }
        intent.putExtras(values);
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m8675c4(@Nullable Dialog dialog) {
        this.innerDialog = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        if ((this.innerDialog instanceof WebDialog) && isResumed()) {
            Dialog dialog = this.innerDialog;
            if (dialog != null) {
                ((WebDialog) dialog).m8732x();
            } else {
                jfd0.m141176a("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m8672X3();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            jfd0.m141176a("null cannot be cast to non-null type android.app.Dialog");
            return null;
        }
        m8673a4(null, null);
        setShowsDialog(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        dialogOnCreateDialog.getClass();
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof WebDialog) {
            if (dialog != null) {
                ((WebDialog) dialog).m8732x();
            } else {
                jfd0.m141176a("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
        }
    }
}
