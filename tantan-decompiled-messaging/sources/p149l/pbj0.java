package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.TokenSigninParam;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.VerifyData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/pbj0;", "Ll/b3f0;", "Ll/wbj0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "a0", "()V", "c1", "Lcom/p1/mobile/putong/data/SignUpData;", "e", "Lcom/p1/mobile/putong/data/SignUpData;", "signUpData", "Lcom/p1/mobile/putong/data/VerifyData;", "f", "Lcom/p1/mobile/putong/data/VerifyData;", "verifyData", "", "g", "J", "getClickTime", "()J", "f1", "(J)V", "clickTime", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class pbj0 extends b3f0<wbj0> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public SignUpData signUpData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public VerifyData verifyData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long clickTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbj0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: Q0 */
    public static Boolean m168212Q0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S0 */
    public static Boolean m168214S0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m168215U0(pbj0 pbj0Var, Bundle bundle) {
        Intent intent;
        Intent intent2;
        pbj0Var.clickTime = System.currentTimeMillis();
        Act act = pbj0Var.act();
        Serializable serializableExtra = (act == null || (intent2 = act.getIntent()) == null) ? null : intent2.getSerializableExtra("key_signup_data");
        pbj0Var.signUpData = serializableExtra instanceof SignUpData ? (SignUpData) serializableExtra : null;
        Act act2 = pbj0Var.act();
        Serializable serializableExtra2 = (act2 == null || (intent = act2.getIntent()) == null) ? null : intent.getSerializableExtra("key_verify_data");
        pbj0Var.verifyData = serializableExtra2 instanceof VerifyData ? (VerifyData) serializableExtra2 : null;
        wbj0 wbj0Var = (wbj0) pbj0Var.viewModel;
        SignUpData signUpData = pbj0Var.signUpData;
        AccountTempApi.SignUpType signUpType = signUpData != null ? signUpData.signUpType : null;
        AccountTempApi.SignUpType signUpType2 = AccountTempApi.SignUpType.phone;
        wbj0Var.m202557I(signUpType == signUpType2);
        l3f l3fVar = new l3f();
        l3fVar.f125895n = "p_clone_if_ttcuser";
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        SignUpData signUpData2 = pbj0Var.signUpData;
        zvf0.m220392n(l3fVar, MapsKt.mapOf(TuplesKt.m87240a("sign_type", (signUpData2 != null ? signUpData2.signUpType : null) == signUpType2 ? "phone_number" : "email")));
    }

    /* JADX INFO: renamed from: W0 */
    public static void m168217W0(final pbj0 pbj0Var, C4319c c4319c) {
        String str;
        if (Math.abs(System.currentTimeMillis() - pbj0Var.clickTime) <= 500 || !((wbj0) pbj0Var.viewModel).m202558J()) {
            return;
        }
        VerifyData verifyData = pbj0Var.verifyData;
        if (verifyData == null || (str = verifyData.ttt_signin_token) == null) {
            str = "";
        }
        TokenSigninParam tokenSigninParam = new TokenSigninParam(str);
        tokenSigninParam.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        C4575a.m28210S0(tokenSigninParam, true);
        AccountModule.f16037c.m28362v2(pbj0Var.signUpData, tokenSigninParam).compose(mkd0.m154966R()).subscribe(mkd0.m154956H(new e30() { // from class: l.lbj0
            @Override // p149l.e30
            public final void call(Object obj) {
                pbj0.m168220a1(this.f127299a, (roj0) obj);
            }
        }, new e30() { // from class: l.mbj0
            @Override // p149l.e30
            public final void call(Object obj) {
                pbj0.m168221b1(this.f133026a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m168220a1(pbj0 pbj0Var, roj0 roj0Var) {
        pbj0Var.m100088r0();
        w85 w85Var = w85.INSTANCE;
        SignUpData signUpData = pbj0Var.signUpData;
        w85Var.m202145m("Login", MapsKt.mutableMapOf(TuplesKt.m87240a("Method used", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone" : "email"), TuplesKt.m87240a("Status", "Success"), TuplesKt.m87240a(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e))));
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m168221b1(pbj0 pbj0Var, Throwable th) {
        Act act;
        w85 w85Var = w85.INSTANCE;
        SignUpData signUpData = pbj0Var.signUpData;
        w85Var.m202145m("Login", MapsKt.mutableMapOf(TuplesKt.m87240a("Method used", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone" : "email"), TuplesKt.m87240a("Status", "Failure"), TuplesKt.m87240a(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e))));
        TantanException.Client.AccountService accountService = th instanceof TantanException.Client.AccountService ? (TantanException.Client.AccountService) th : null;
        if (accountService != null) {
            if ((accountService.code == 400152 ? accountService : null) == null || (act = pbj0Var.act()) == null) {
                return;
            }
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static final void m168222d1(pbj0 pbj0Var, roj0 roj0Var) {
        ((wbj0) pbj0Var.viewModel).m202562N();
        Act act = pbj0Var.act();
        if (act != null) {
            act.startActivity(SignUpDetailsNewAct.m28498b2(((wbj0) pbj0Var.viewModel).act(), pbj0Var.verifyData, false, false));
        }
        w85 w85Var = w85.INSTANCE;
        SignUpData signUpData = pbj0Var.signUpData;
        w85Var.m202145m("Sign Up", MapsKt.mutableMapOf(TuplesKt.m87240a("Sign up status", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone number register success" : "Email register success")));
        Act act2 = pbj0Var.act();
        if (act2 != null) {
            act2.m66873d2();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m168223e1(pbj0 pbj0Var, Throwable th) {
        ((wbj0) pbj0Var.viewModel).m202562N();
        Act act = pbj0Var.act();
        if (act != null) {
            act.m66873d2();
        }
        yij0.m214926D(th);
        w85 w85Var = w85.INSTANCE;
        SignUpData signUpData = pbj0Var.signUpData;
        w85Var.m202145m("Sign Up", MapsKt.mutableMapOf(TuplesKt.m87240a("Sign up status", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone number register fail" : "Email register fail")));
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.hbj0
            @Override // p149l.e30
            public final void call(Object obj) {
                pbj0.m168215U0(this.f106940a, (Bundle) obj);
            }
        });
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.ibj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pbj0.m168214S0((C4319c) obj);
            }
        };
        c22306cLifecycle.filter(new w9j() { // from class: l.jbj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pbj0.m168212Q0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kbj0
            @Override // p149l.e30
            public final void call(Object obj) {
                pbj0.m168217W0(this.f122247a, (C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public final void m168224c1() {
        C22306c c22306cDuringCreated;
        SignUpData signUpData = this.signUpData;
        if (signUpData != null) {
            ((wbj0) this.viewModel).m202561M();
            PutongAct putongActAct = ((wbj0) this.viewModel).act();
            if (putongActAct == null || (c22306cDuringCreated = putongActAct.duringCreated(eje.m116827r(signUpData, null, true))) == null) {
                return;
            }
            c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.nbj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pbj0.m168222d1(this.f138037a, (roj0) obj);
                }
            }, new e30() { // from class: l.obj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pbj0.m168223e1(this.f142957a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m168225f1(long j) {
        this.clickTime = j;
    }
}
