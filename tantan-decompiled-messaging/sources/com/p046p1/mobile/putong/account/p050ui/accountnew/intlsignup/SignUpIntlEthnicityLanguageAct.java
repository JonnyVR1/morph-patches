package com.p046p1.mobile.putong.account.p050ui.accountnew.intlsignup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.SignUpData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.vcf0;
import p149l.ycf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, m87232d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/intlsignup/SignUpIntlEthnicityLanguageAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "initSubscription", "onBackPressed", "", "pageId", "()Ljava/lang/String;", "Ll/ycf0;", "c", "Ll/ycf0;", "X1", "()Ll/ycf0;", "Z1", "(Ll/ycf0;)V", "viewModel", "Ll/vcf0;", Constants.INAPP_DATA_TAG, "Ll/vcf0;", "V1", "()Ll/vcf0;", "Y1", "(Ll/vcf0;)V", "presenter", "", "e", "Z", "isLanguage", "Companion", "a", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SignUpIntlEthnicityLanguageAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ycf0 viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public vcf0 presenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isLanguage;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.intlsignup.SignUpIntlEthnicityLanguageAct$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/intlsignup/SignUpIntlEthnicityLanguageAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isLanguage", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Z)Landroid/content/Intent;", "Lcom/p1/mobile/putong/data/SignUpData;", "data", "b", "(Landroid/content/Context;ZLcom/p1/mobile/putong/data/SignUpData;)Landroid/content/Intent;", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m28588a(@Nullable Context context, boolean isLanguage) {
            Intent intent = new Intent(context, (Class<?>) SignUpIntlEthnicityLanguageAct.class);
            intent.putExtra("signup_language", isLanguage);
            return intent;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Intent m28589b(@Nullable Context context, boolean isLanguage, @Nullable SignUpData data) {
            Intent intent = new Intent(context, (Class<?>) SignUpIntlEthnicityLanguageAct.class);
            intent.putExtra("signup_data", data);
            intent.putExtra("signup_language", isLanguage);
            return intent;
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: V1 */
    public final vcf0 m28584V1() {
        vcf0 vcf0Var = this.presenter;
        if (vcf0Var != null) {
            return vcf0Var;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final ycf0 m28585X1() {
        ycf0 ycf0Var = this.viewModel;
        if (ycf0Var != null) {
            return ycf0Var;
        }
        Intrinsics.m87502r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m28586Y1(@NotNull vcf0 vcf0Var) {
        vcf0Var.getClass();
        this.presenter = vcf0Var;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m28587Z1(@NotNull ycf0 ycf0Var) {
        ycf0Var.getClass();
        this.viewModel = ycf0Var;
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m28585X1().inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        Intent intent;
        Act act = act();
        boolean booleanExtra = false;
        if (act != null && (intent = act.getIntent()) != null) {
            booleanExtra = intent.getBooleanExtra("signup_language", false);
        }
        this.isLanguage = booleanExtra;
        super.initDataOnCreate();
        m28587Z1(new ycf0(this));
        m28586Y1(new vcf0(this));
        m28584V1().mo51532C(m28585X1());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m28584V1().mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    @NotNull
    public String pageId() {
        return this.isLanguage ? "p_signup_language" : "p_signup_ethnicity";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
        m28584V1().m197757m0(sis);
        super.preCreateView(sis);
    }
}
