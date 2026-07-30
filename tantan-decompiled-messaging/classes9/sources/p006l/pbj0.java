package p006l;

import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.TokenSigninParam;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.VerifyData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.jq2;
import l.l3f;
import l.mcr;
import l.mkd0;
import l.px0;
import l.roj0;
import l.w85;
import l.w9j;
import l.yij0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ll/pbj0;", "Ll/b3f0;", "Ll/wbj0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "a0", "()V", "c1", "Lcom/p1/mobile/putong/data/SignUpData;", "e", "Lcom/p1/mobile/putong/data/SignUpData;", "signUpData", "Lcom/p1/mobile/putong/data/VerifyData;", "f", "Lcom/p1/mobile/putong/data/VerifyData;", "verifyData", "", "g", "J", "getClickTime", "()J", "f1", "(J)V", "clickTime", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static Boolean m21052Q0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S0 */
    public static Boolean m21054S0(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.i);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m21055U0(pbj0 pbj0Var, Bundle bundle) {
        Intent intent;
        Intent intent2;
        pbj0Var.clickTime = System.currentTimeMillis();
        Act act = pbj0Var.act();
        Serializable serializableExtra = (act == null || (intent2 = act.getIntent()) == null) ? null : intent2.getSerializableExtra("key_signup_data");
        pbj0Var.signUpData = serializableExtra instanceof SignUpData ? (SignUpData) serializableExtra : null;
        Act act2 = pbj0Var.act();
        Serializable serializableExtra2 = (act2 == null || (intent = act2.getIntent()) == null) ? null : intent.getSerializableExtra("key_verify_data");
        pbj0Var.verifyData = serializableExtra2 instanceof VerifyData ? (VerifyData) serializableExtra2 : null;
        wbj0 wbj0Var = (wbj0) ((jq2) pbj0Var).viewModel;
        SignUpData signUpData = pbj0Var.signUpData;
        AccountTempApi.SignUpType signUpType = signUpData != null ? signUpData.signUpType : null;
        AccountTempApi.SignUpType signUpType2 = AccountTempApi.SignUpType.phone;
        wbj0Var.m26334I(signUpType == signUpType2);
        l3f l3fVar = new l3f();
        l3fVar.n = "p_clone_if_ttcuser";
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        SignUpData signUpData2 = pbj0Var.signUpData;
        zvf0.n(l3fVar, MapsKt.mapOf(TuplesKt.a("sign_type", (signUpData2 != null ? signUpData2.signUpType : null) == signUpType2 ? "phone_number" : "email")));
    }

    /* JADX INFO: renamed from: W0 */
    public static void m21057W0(final pbj0 pbj0Var, c cVar) {
        String str;
        if (Math.abs(System.currentTimeMillis() - pbj0Var.clickTime) <= 500 || !((wbj0) ((jq2) pbj0Var).viewModel).m26335J()) {
            return;
        }
        VerifyData verifyData = pbj0Var.verifyData;
        if (verifyData == null || (str = verifyData.ttt_signin_token) == null) {
            str = "";
        }
        TokenSigninParam tokenSigninParam = new TokenSigninParam(str);
        tokenSigninParam.addExtraData("device", pk8.m21562M().toJson());
        C0001a.m105S0(tokenSigninParam, true);
        AccountModule.f26c.m257v2(pbj0Var.signUpData, tokenSigninParam).compose(mkd0.R()).subscribe(mkd0.H(new e30() { // from class: l.lbj0
            public final void call(Object obj) {
                pbj0.m21060a1(this.f16318a, (roj0) obj);
            }
        }, new e30() { // from class: l.mbj0
            public final void call(Object obj) {
                pbj0.m21061b1(this.f16892a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m21060a1(pbj0 pbj0Var, roj0 roj0Var) {
        pbj0Var.m12511r0();
        w85 w85Var = w85.INSTANCE;
        SignUpData signUpData = pbj0Var.signUpData;
        w85Var.m("Login", MapsKt.mutableMapOf(new Pair[]{TuplesKt.a("Method used", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone" : "email"), TuplesKt.a("Status", "Success"), TuplesKt.a("Version", px0.b(App.e))}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public static final void m21061b1(pbj0 pbj0Var, Throwable th) {
        Act act;
        w85 w85Var = w85.INSTANCE;
        SignUpData signUpData = pbj0Var.signUpData;
        w85Var.m("Login", MapsKt.mutableMapOf(new Pair[]{TuplesKt.a("Method used", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone" : "email"), TuplesKt.a("Status", "Failure"), TuplesKt.a("Version", px0.b(App.e))}));
        TantanException.Client.AccountService accountService = th instanceof TantanException.Client.AccountService ? (TantanException.Client.AccountService) th : null;
        if (accountService != null) {
            if ((accountService.code == 400152 ? accountService : null) == null || (act = pbj0Var.act()) == null) {
                return;
            }
            act.finish();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static final void m21062d1(pbj0 pbj0Var, roj0 roj0Var) {
        ((wbj0) ((jq2) pbj0Var).viewModel).m26339N();
        Act act = pbj0Var.act();
        if (act != null) {
            act.startActivity(SignUpDetailsNewAct.m394b2(((wbj0) ((jq2) pbj0Var).viewModel).act(), pbj0Var.verifyData, false, false));
        }
        w85 w85Var = w85.INSTANCE;
        SignUpData signUpData = pbj0Var.signUpData;
        w85Var.m("Sign Up", MapsKt.mutableMapOf(new Pair[]{TuplesKt.a("Sign up status", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone number register success" : "Email register success")}));
        Act act2 = pbj0Var.act();
        if (act2 != null) {
            act2.finish();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m21063e1(pbj0 pbj0Var, Throwable th) {
        ((wbj0) ((jq2) pbj0Var).viewModel).m26339N();
        Act act = pbj0Var.act();
        if (act != null) {
            act.finish();
        }
        yij0.D(th);
        w85 w85Var = w85.INSTANCE;
        SignUpData signUpData = pbj0Var.signUpData;
        w85Var.m("Sign Up", MapsKt.mutableMapOf(new Pair[]{TuplesKt.a("Sign up status", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone number register fail" : "Email register fail")}));
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.hbj0
            public final void call(Object obj) {
                pbj0.m21055U0(this.f13789a, (Bundle) obj);
            }
        });
        rx.c cVarLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.ibj0
            public final Object invoke(Object obj) {
                return pbj0.m21054S0((c) obj);
            }
        };
        cVarLifecycle.filter(new w9j() { // from class: l.jbj0
            public final Object call(Object obj) {
                return pbj0.m21052Q0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.kbj0
            public final void call(Object obj) {
                pbj0.m21057W0(this.f15688a, (c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public final void m21064c1() {
        rx.c cVarDuringCreated;
        SignUpData signUpData = this.signUpData;
        if (signUpData != null) {
            ((wbj0) ((jq2) this).viewModel).m26338M();
            PutongAct putongActAct = ((wbj0) ((jq2) this).viewModel).act();
            if (putongActAct == null || (cVarDuringCreated = putongActAct.duringCreated(eje.m14577r(signUpData, null, true))) == null) {
                return;
            }
            cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.nbj0
                public final void call(Object obj) {
                    pbj0.m21062d1(this.f17580a, (roj0) obj);
                }
            }, new e30() { // from class: l.obj0
                public final void call(Object obj) {
                    pbj0.m21063e1(this.f18137a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m21065f1(long j) {
        this.clickTime = j;
    }
}
