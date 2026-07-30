package com.p051p1.mobile.putong.account.p055ui.accountnew.intlsignup.intlfirendpurpose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mlf0;
import p153l.plf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/intlsignup/intlfirendpurpose/SignUpIntlFriendPurposeAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "initSubscription", "onBackPressed", "", "pageId", "()Ljava/lang/String;", "Ll/plf0;", "c", "Ll/plf0;", "Y1", "()Ll/plf0;", "a2", "(Ll/plf0;)V", "viewModel", "Ll/mlf0;", Constants.INAPP_DATA_TAG, "Ll/mlf0;", "X1", "()Ll/mlf0;", "Z1", "(Ll/mlf0;)V", "presenter", "Companion", "a", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SignUpIntlFriendPurposeAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public plf0 viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public mlf0 presenter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.intlsignup.intlfirendpurpose.SignUpIntlFriendPurposeAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/intlsignup/intlfirendpurpose/SignUpIntlFriendPurposeAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m29593a(@Nullable Context context) {
            return new Intent(context, (Class<?>) SignUpIntlFriendPurposeAct.class);
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final mlf0 m29589X1() {
        mlf0 mlf0Var = this.presenter;
        if (mlf0Var != null) {
            return mlf0Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public final plf0 m29590Y1() {
        plf0 plf0Var = this.viewModel;
        if (plf0Var != null) {
            return plf0Var;
        }
        Intrinsics.m88391r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m29591Z1(@NotNull mlf0 mlf0Var) {
        mlf0Var.getClass();
        this.presenter = mlf0Var;
    }

    /* JADX INFO: renamed from: a2 */
    public final void m29592a2(@NotNull plf0 plf0Var) {
        plf0Var.getClass();
        this.viewModel = plf0Var;
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m29590Y1().inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        m29592a2(new plf0(this));
        m29591Z1(new mlf0(this));
        m29589X1().mo52715C(m29590Y1());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m29589X1().mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_intl_signup_relation_goals";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
        m29589X1().m158873j0(sis);
        super.preCreateView(sis);
    }
}
