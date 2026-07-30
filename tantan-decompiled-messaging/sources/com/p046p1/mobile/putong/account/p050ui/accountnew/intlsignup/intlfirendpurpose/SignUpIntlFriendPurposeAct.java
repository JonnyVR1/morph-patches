package com.p046p1.mobile.putong.account.p050ui.accountnew.intlsignup.intlfirendpurpose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fdf0;
import p149l.idf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/intlsignup/intlfirendpurpose/SignUpIntlFriendPurposeAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "initSubscription", "onBackPressed", "", "pageId", "()Ljava/lang/String;", "Ll/idf0;", "c", "Ll/idf0;", "X1", "()Ll/idf0;", "Z1", "(Ll/idf0;)V", "viewModel", "Ll/fdf0;", Constants.INAPP_DATA_TAG, "Ll/fdf0;", "V1", "()Ll/fdf0;", "Y1", "(Ll/fdf0;)V", "presenter", "Companion", "a", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SignUpIntlFriendPurposeAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public idf0 viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public fdf0 presenter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.intlsignup.intlfirendpurpose.SignUpIntlFriendPurposeAct$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/intlsignup/intlfirendpurpose/SignUpIntlFriendPurposeAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m28594a(@Nullable Context context) {
            return new Intent(context, (Class<?>) SignUpIntlFriendPurposeAct.class);
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: V1 */
    public final fdf0 m28590V1() {
        fdf0 fdf0Var = this.presenter;
        if (fdf0Var != null) {
            return fdf0Var;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final idf0 m28591X1() {
        idf0 idf0Var = this.viewModel;
        if (idf0Var != null) {
            return idf0Var;
        }
        Intrinsics.m87502r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m28592Y1(@NotNull fdf0 fdf0Var) {
        fdf0Var.getClass();
        this.presenter = fdf0Var;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m28593Z1(@NotNull idf0 idf0Var) {
        idf0Var.getClass();
        this.viewModel = idf0Var;
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m28591X1().inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        m28593Z1(new idf0(this));
        m28592Y1(new fdf0(this));
        m28590V1().mo51532C(m28591X1());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m28590V1().mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_intl_signup_relation_goals";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
        m28590V1().m120972j0(sis);
        super.preCreateView(sis);
    }
}
