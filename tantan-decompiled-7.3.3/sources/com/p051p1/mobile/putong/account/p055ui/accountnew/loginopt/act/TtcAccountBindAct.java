package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.alj0;
import p153l.plm;
import p153l.tkj0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001fR\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m88121d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/act/TtcAccountBindAct;", "Lcom/p1/mobile/putong/account/ui/account/SignInBaseActMVP;", "Ll/tkj0;", "Ll/alj0;", "<init>", "()V", "", "initDataOnCreate", "initSubscription", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "a2", "()Ll/alj0;", "Z1", "()Ll/tkj0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "onBackPressed", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "shouldShowGradientStatusBar", "()Z", "shouldShowGradientActionBar", "c", "Ll/alj0;", "viewModel", Constants.INAPP_DATA_TAG, "Ll/tkj0;", "presenter", "Companion", "a", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class TtcAccountBindAct extends SignInBaseActMVP<tkj0, alj0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public alj0 viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public tkj0 presenter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.act.TtcAccountBindAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/act/TtcAccountBindAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/data/SignUpData;", "signUpData", "Lcom/p1/mobile/putong/data/VerifyData;", "verifyData", "", "a", "(Landroid/content/Context;Lcom/p1/mobile/putong/data/SignUpData;Lcom/p1/mobile/putong/data/VerifyData;)V", "", "KEY_SIGNUP_DATA", "Ljava/lang/String;", "KEY_VERIFY_DATA", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m29683a(@NotNull Context context, @NotNull SignUpData signUpData, @NotNull VerifyData verifyData) {
            context.getClass();
            signUpData.getClass();
            verifyData.getClass();
            Intent intent = new Intent(context, (Class<?>) TtcAccountBindAct.class);
            intent.putExtra("key_signup_data", signUpData);
            intent.putExtra("key_verify_data", verifyData);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public tkj0 generateSignInPresenter() {
        tkj0 tkj0Var = this.presenter;
        if (tkj0Var != null) {
            return tkj0Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    @NotNull
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public alj0 generateSignInViewModel() {
        alj0 alj0Var = this.viewModel;
        if (alj0Var != null) {
            return alj0Var;
        }
        Intrinsics.m88391r("viewModel");
        return null;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        alj0 alj0Var = this.viewModel;
        if (alj0Var == null) {
            Intrinsics.m88391r("viewModel");
            alj0Var = null;
        }
        if (alj0Var.getIsWebRequesting()) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        alj0 alj0Var = this.viewModel;
        if (alj0Var == null) {
            Intrinsics.m88391r("viewModel");
            alj0Var = null;
        }
        return alj0Var.inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.viewModel = new alj0(this);
        tkj0 tkj0Var = new tkj0(this);
        this.presenter = tkj0Var;
        alj0 alj0Var = this.viewModel;
        if (alj0Var == null) {
            Intrinsics.m88391r("viewModel");
            alj0Var = null;
        }
        tkj0Var.mo52715C(alj0Var);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        tkj0 tkj0Var = this.presenter;
        if (tkj0Var == null) {
            Intrinsics.m88391r("presenter");
            tkj0Var = null;
        }
        tkj0Var.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        alj0 alj0Var = this.viewModel;
        if (alj0Var == null) {
            Intrinsics.m88391r("viewModel");
            alj0Var = null;
        }
        if (alj0Var.getIsWebRequesting()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        plm.m172838a(this);
        super.preCreateView(sis);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
