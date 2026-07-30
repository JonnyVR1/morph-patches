package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.TokenSigninParam;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/tkj0;", "Ll/ibf0;", "Ll/alj0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "a0", "()V", "c1", "Lcom/p1/mobile/putong/data/SignUpData;", "e", "Lcom/p1/mobile/putong/data/SignUpData;", "signUpData", "Lcom/p1/mobile/putong/data/VerifyData;", "f", "Lcom/p1/mobile/putong/data/VerifyData;", "verifyData", "", "g", "J", "getClickTime", "()J", "f1", "(J)V", "clickTime", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class tkj0 extends ibf0<alj0> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public SignUpData signUpData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public VerifyData verifyData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long clickTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkj0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: Q0 */
    public static Boolean m191551Q0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S0 */
    public static Boolean m191553S0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m191554U0(tkj0 tkj0Var, Bundle bundle) {
        Intent intent;
        Intent intent2;
        tkj0Var.clickTime = System.currentTimeMillis();
        Act act = tkj0Var.act();
        Serializable serializableExtra = (act == null || (intent2 = act.getIntent()) == null) ? null : intent2.getSerializableExtra("key_signup_data");
        tkj0Var.signUpData = serializableExtra instanceof SignUpData ? (SignUpData) serializableExtra : null;
        Act act2 = tkj0Var.act();
        Serializable serializableExtra2 = (act2 == null || (intent = act2.getIntent()) == null) ? null : intent.getSerializableExtra("key_verify_data");
        tkj0Var.verifyData = serializableExtra2 instanceof VerifyData ? (VerifyData) serializableExtra2 : null;
        alj0 alj0Var = (alj0) tkj0Var.viewModel;
        SignUpData signUpData = tkj0Var.signUpData;
        AccountTempApi.SignUpType signUpType = signUpData != null ? signUpData.signUpType : null;
        AccountTempApi.SignUpType signUpType2 = AccountTempApi.SignUpType.phone;
        alj0Var.m98674I(signUpType == signUpType2);
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_clone_if_ttcuser";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        SignUpData signUpData2 = tkj0Var.signUpData;
        i4g0.m138516n(q4fVar, MapsKt.mapOf(TuplesKt.m88129a("sign_type", (signUpData2 != null ? signUpData2.signUpType : null) == signUpType2 ? "phone_number" : "email")));
    }

    /* JADX INFO: renamed from: W0 */
    public static void m191556W0(final tkj0 tkj0Var, C4470c c4470c) {
        String str;
        if (Math.abs(System.currentTimeMillis() - tkj0Var.clickTime) <= 500 || !((alj0) tkj0Var.viewModel).m98675J()) {
            return;
        }
        VerifyData verifyData = tkj0Var.verifyData;
        if (verifyData == null || (str = verifyData.ttt_signin_token) == null) {
            str = "";
        }
        TokenSigninParam tokenSigninParam = new TokenSigninParam(str);
        tokenSigninParam.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        C4726a.m29209S0(tokenSigninParam, true);
        AccountModule.f16756c.m29361v2(tkj0Var.signUpData, tokenSigninParam).compose(psd0.m173607R()).subscribe(psd0.m173597H(new y20() { // from class: l.pkj0
            @Override // p153l.y20
            public final void call(Object obj) {
                tkj0.m191559a1(this.f152841a, (uxj0) obj);
            }
        }, new y20() { // from class: l.qkj0
            @Override // p153l.y20
            public final void call(Object obj) {
                tkj0.m191560b1(this.f158143a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m191559a1(tkj0 tkj0Var, uxj0 uxj0Var) {
        tkj0Var.m139331r0();
        x95 x95Var = x95.INSTANCE;
        SignUpData signUpData = tkj0Var.signUpData;
        x95Var.m209793m("Login", MapsKt.mutableMapOf(TuplesKt.m88129a("Method used", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone" : "email"), TuplesKt.m88129a("Status", "Success"), TuplesKt.m88129a(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e))));
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m191560b1(tkj0 tkj0Var, Throwable th) {
        Act act;
        x95 x95Var = x95.INSTANCE;
        SignUpData signUpData = tkj0Var.signUpData;
        x95Var.m209793m("Login", MapsKt.mutableMapOf(TuplesKt.m88129a("Method used", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone" : "email"), TuplesKt.m88129a("Status", "Failure"), TuplesKt.m88129a(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e))));
        TantanException.Client.AccountService accountService = th instanceof TantanException.Client.AccountService ? (TantanException.Client.AccountService) th : null;
        if (accountService != null) {
            if ((accountService.code == 400152 ? accountService : null) == null || (act = tkj0Var.act()) == null) {
                return;
            }
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static final void m191561d1(tkj0 tkj0Var, uxj0 uxj0Var) {
        ((alj0) tkj0Var.viewModel).m98679N();
        Act act = tkj0Var.act();
        if (act != null) {
            act.startActivity(SignUpDetailsNewAct.m29497c2(((alj0) tkj0Var.viewModel).act(), tkj0Var.verifyData, false, false));
        }
        x95 x95Var = x95.INSTANCE;
        SignUpData signUpData = tkj0Var.signUpData;
        x95Var.m209793m("Sign Up", MapsKt.mutableMapOf(TuplesKt.m88129a("Sign up status", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone number register success" : "Email register success")));
        Act act2 = tkj0Var.act();
        if (act2 != null) {
            act2.m68056e2();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m191562e1(tkj0 tkj0Var, Throwable th) {
        ((alj0) tkj0Var.viewModel).m98679N();
        Act act = tkj0Var.act();
        if (act != null) {
            act.m68056e2();
        }
        bsj0.m106246D(th);
        x95 x95Var = x95.INSTANCE;
        SignUpData signUpData = tkj0Var.signUpData;
        x95Var.m209793m("Sign Up", MapsKt.mutableMapOf(TuplesKt.m88129a("Sign up status", (signUpData != null ? signUpData.signUpType : null) == AccountTempApi.SignUpType.phone ? "Phone number register fail" : "Email register fail")));
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.lkj0
            @Override // p153l.y20
            public final void call(Object obj) {
                tkj0.m191554U0(this.f132477a, (Bundle) obj);
            }
        });
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.mkj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tkj0.m191553S0((C4470c) obj);
            }
        };
        c22421cLifecycle.filter(new qcj() { // from class: l.nkj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tkj0.m191551Q0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.okj0
            @Override // p153l.y20
            public final void call(Object obj) {
                tkj0.m191556W0(this.f147759a, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public final void m191563c1() {
        C22421c c22421cDuringCreated;
        SignUpData signUpData = this.signUpData;
        if (signUpData != null) {
            ((alj0) this.viewModel).m98678M();
            PutongAct putongActAct = ((alj0) this.viewModel).act();
            if (putongActAct == null || (c22421cDuringCreated = putongActAct.duringCreated(ike.m140279r(signUpData, null, true))) == null) {
                return;
            }
            c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.rkj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    tkj0.m191561d1(this.f163626a, (uxj0) obj);
                }
            }, new y20() { // from class: l.skj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    tkj0.m191562e1(this.f169292a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m191564f1(long j) {
        this.clickTime = j;
    }
}
