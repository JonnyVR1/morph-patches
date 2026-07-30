package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a60;
import p149l.b2s;
import p149l.b7c0;
import p149l.d4c0;
import p149l.e60;
import p149l.g60;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010\u0003J#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010<\u001a\u00020\t2\u0006\u00108\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u000bR0\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190=2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0006@BX\u0086.¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, m87232d2 = {"Lcom/facebook/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/facebook/login/LoginClient;", "Z3", "()Lcom/facebook/login/LoginClient;", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "outState", "onSaveInstanceState", "k4", "j4", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", "d4", "(Landroidx/fragment/app/FragmentActivity;)Lkotlin/jvm/functions/Function1;", "Lcom/facebook/login/LoginClient$Result;", "outcome", "i4", "(Lcom/facebook/login/LoginClient$Result;)V", "l4", "e4", "Landroid/app/Activity;", "f4", "(Landroid/app/Activity;)V", "", BaseSei.f13932Z, "Ljava/lang/String;", "callingPackage", "Lcom/facebook/login/LoginClient$Request;", "A", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "<set-?>", "B", "Lcom/facebook/login/LoginClient;", "c4", "loginClient", "Ll/g60;", b2s.C_ZONE, "Ll/g60;", "a4", "()Ll/g60;", "launcher", "D", "Landroid/view/View;", "progressBar", "b4", "()I", "layoutResId", "Companion", "a", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public class LoginFragment extends Fragment {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public LoginClient.Request request;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public LoginClient loginClient;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public g60<Intent> launcher;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public View progressBar;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public String callingPackage;

    /* JADX INFO: renamed from: com.facebook.login.LoginFragment$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"com/facebook/login/LoginFragment$b", "Lcom/facebook/login/LoginClient$a;", "", "a", "()V", "b", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C1689b implements LoginClient.InterfaceC1684a {
        public C1689b() {
        }

        @Override // com.facebook.login.LoginClient.InterfaceC1684a
        /* JADX INFO: renamed from: a */
        public void mo9083a() {
            LoginFragment.this.m9106l4();
        }

        @Override // com.facebook.login.LoginClient.InterfaceC1684a
        /* JADX INFO: renamed from: b */
        public void mo9084b() {
            LoginFragment.this.m9101e4();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m9094g4(LoginFragment loginFragment, LoginClient.Result result) {
        loginFragment.getClass();
        result.getClass();
        loginFragment.m9103i4(result);
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m9095h4(Function1 function1, ActivityResult activityResult) {
        function1.getClass();
        function1.invoke(activityResult);
    }

    @NotNull
    /* JADX INFO: renamed from: Z3 */
    public LoginClient m9096Z3() {
        return new LoginClient(this);
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final g60<Intent> m9097a4() {
        g60<Intent> g60Var = this.launcher;
        if (g60Var != null) {
            return g60Var;
        }
        Intrinsics.m87502r("launcher");
        throw null;
    }

    @LayoutRes
    /* JADX INFO: renamed from: b4 */
    public int m9098b4() {
        return b7c0.f73959c;
    }

    @NotNull
    /* JADX INFO: renamed from: c4 */
    public final LoginClient m9099c4() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.m87502r("loginClient");
        throw null;
    }

    /* JADX INFO: renamed from: d4 */
    public final Function1<ActivityResult, Unit> m9100d4(final FragmentActivity activity) {
        return new Function1<ActivityResult, Unit>() { // from class: com.facebook.login.LoginFragment$getLoginMethodHandlerCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ActivityResult activityResult) {
                activityResult.getClass();
                if (activityResult.m201b() == -1) {
                    this.this$0.m9099c4().m9043w(LoginClient.INSTANCE.m9088b(), activityResult.m201b(), activityResult.m200a());
                } else {
                    activity.finish();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
                invoke2(activityResult);
                return Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: e4 */
    public final void m9101e4() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.m87502r("progressBar");
            throw null;
        }
        view.setVisibility(8);
        m9104j4();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m9102f4(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m9103i4(LoginClient.Result outcome) {
        this.request = null;
        int i = outcome.code == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i, intent);
        activity.finish();
    }

    /* JADX INFO: renamed from: j4 */
    public void m9104j4() {
    }

    /* JADX INFO: renamed from: k4 */
    public void m9105k4() {
    }

    /* JADX INFO: renamed from: l4 */
    public final void m9106l4() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.m87502r("progressBar");
            throw null;
        }
        view.setVisibility(0);
        m9105k4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        m9099c4().m9043w(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle bundleExtra;
        super.onCreate(savedInstanceState);
        LoginClient loginClientM9096Z3 = savedInstanceState == null ? null : (LoginClient) savedInstanceState.getParcelable("loginClient");
        if (loginClientM9096Z3 != null) {
            loginClientM9096Z3.m9045y(this);
        } else {
            loginClientM9096Z3 = m9096Z3();
        }
        this.loginClient = loginClientM9096Z3;
        m9099c4().m9046z(new LoginClient.InterfaceC1687d() { // from class: l.uyv
            @Override // com.facebook.login.LoginClient.InterfaceC1687d
            /* JADX INFO: renamed from: a */
            public final void mo9089a(LoginClient.Result result) {
                LoginFragment.m9094g4(this.f178916a, result);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        m9102f4(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable(SocialConstants.TYPE_REQUEST);
        }
        e60 e60Var = new e60();
        final Function1<ActivityResult, Unit> function1M9100d4 = m9100d4(activity);
        g60<Intent> g60VarRegisterForActivityResult = registerForActivityResult(e60Var, new a60() { // from class: l.vyv
            @Override // p149l.a60
            /* JADX INFO: renamed from: a */
            public final void mo2610a(Object obj) {
                LoginFragment.m9095h4(function1M9100d4, (ActivityResult) obj);
            }
        });
        g60VarRegisterForActivityResult.getClass();
        this.launcher = g60VarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        View viewInflate = inflater.inflate(m9098b4(), container, false);
        View viewFindViewById = viewInflate.findViewById(d4c0.f84294d);
        viewFindViewById.getClass();
        this.progressBar = viewFindViewById;
        m9099c4().m9044x(new C1689b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m9099c4().m9025c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(d4c0.f84294d);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage != null) {
            m9099c4().m9019A(this.request);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", m9099c4());
    }
}
