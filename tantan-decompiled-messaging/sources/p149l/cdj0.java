package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.account_phone.data.PhoneSendCaptchaData;
import com.p046p1.mobile.account_phone.data.PhoneSignupEarlyUIDData;
import com.p046p1.mobile.account_phone.data.PhoneVerifyCaptchaData;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.TokenSigninParam;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u00062\u0006\u0010\u0005\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0005\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Ll/cdj0;", "Ll/vt60;", "<init>", "()V", "Lcom/p1/mobile/account_phone/data/PhoneSendCaptchaData;", "data", "Lrx/c;", "Lcom/p1/mobile/account_core/reponse_data/RiskVerification;", "j0", "(Lcom/p1/mobile/account_phone/data/PhoneSendCaptchaData;)Lrx/c;", "Lcom/p1/mobile/account_phone/data/PhoneVerifyCaptchaData;", "", "isUpLinkSms", "Lkotlin/Pair;", "", "m0", "(Lcom/p1/mobile/account_phone/data/PhoneVerifyCaptchaData;Z)Lrx/c;", "Lcom/p1/mobile/account_phone/data/PhoneSignupEarlyUIDData;", "Lcom/p1/mobile/account_core/reponse_data/Token;", "k0", "(Lcom/p1/mobile/account_phone/data/PhoneSignupEarlyUIDData;Z)Lrx/c;", "Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/TokenSigninParam;", "l0", "(Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/TokenSigninParam;)Lrx/c;", "Companion", "a", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class cdj0 extends vt60 {
    /* JADX INFO: renamed from: T */
    public static Unit m106232T(TokenSigninParam tokenSigninParam, AccountEnvelop accountEnvelop) {
        if ((accountEnvelop != null ? accountEnvelop.data : null) == null || accountEnvelop.data.token == null) {
            C20975ww.m205791b("PhoneService/ttt-token-signin", tokenSigninParam.toJson());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static Pair m106233U(Function1 function1, Object obj) {
        return (Pair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static Token m106234V(AccountEnvelop accountEnvelop) {
        accountEnvelop.getClass();
        return accountEnvelop.data.token;
    }

    /* JADX INFO: renamed from: W */
    public static Token m106235W(Function1 function1, Object obj) {
        return (Token) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public static void m106236X(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    public static Unit m106237Y(PhoneSendCaptchaData phoneSendCaptchaData, AccountEnvelop accountEnvelop) {
        if ((accountEnvelop != null ? accountEnvelop.meta : null) == null) {
            C20975ww.m205790a("PhoneService/phone/code/send", phoneSendCaptchaData);
        }
        if (accountEnvelop != null) {
            Data data = accountEnvelop.data;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static Unit m106238Z(PhoneVerifyCaptchaData phoneVerifyCaptchaData, AccountEnvelop accountEnvelop) {
        if ((accountEnvelop != null ? accountEnvelop.data : null) == null || TextUtils.isEmpty(accountEnvelop.data.action)) {
            C20975ww.m205790a("PhoneService/phone/code/verify", phoneVerifyCaptchaData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m106239a0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static RiskVerification m106240b0(AccountEnvelop accountEnvelop) {
        RiskVerification riskVerification;
        accountEnvelop.getClass();
        Data data = accountEnvelop.data;
        return (data == null || (riskVerification = data.riskVerification) == null) ? new RiskVerification() : riskVerification;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX INFO: renamed from: c0 */
    public static Pair m106241c0(AccountEnvelop accountEnvelop) {
        String str;
        accountEnvelop.getClass();
        Map<String, String> map = accountEnvelop.extra;
        String str2 = map != null ? map.get("tttAction") : null;
        if (str2 != null) {
            switch (str2) {
                case "signin":
                case "signup":
                case "pending":
                case "ttt-signup":
                    Map<String, String> map2 = accountEnvelop.extra;
                    if (map2 != null) {
                        str = map2.get("tttAction");
                    } else {
                        str = null;
                    }
                    str.getClass();
                    break;
                default:
                    str = accountEnvelop.data.action;
                    break;
            }
        } else {
            str = accountEnvelop.data.action;
        }
        Map<String, String> map3 = accountEnvelop.extra;
        return new Pair(str, map3 != null ? map3.get("tttToken") : null);
    }

    /* JADX INFO: renamed from: d0 */
    public static Unit m106242d0(PhoneSignupEarlyUIDData phoneSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        if ((accountEnvelop != null ? accountEnvelop.data : null) == null || accountEnvelop.data.token == null) {
            C20975ww.m205790a("PhoneService/ttt-signup", phoneSignupEarlyUIDData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static Token m106243e0(AccountEnvelop accountEnvelop) {
        accountEnvelop.getClass();
        return accountEnvelop.data.token;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m106244f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static RiskVerification m106245g0(Function1 function1, Object obj) {
        return (RiskVerification) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m106246h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Token m106247i0(Function1 function1, Object obj) {
        return (Token) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final C22306c<RiskVerification> m106248j0(@NotNull final PhoneSendCaptchaData data) {
        data.getClass();
        Objects.toString(data.action);
        C22306c<AccountEnvelop> c22306cM206659d = x14.m206656b().m206659d("/phone/code/send", data.toJson());
        final Function1 function1 = new Function1() { // from class: l.wcj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cdj0.m106237Y(data, (AccountEnvelop) obj);
            }
        };
        C22306c<AccountEnvelop> c22306cDoOnNext = c22306cM206659d.doOnNext(new e30() { // from class: l.xcj0
            @Override // p149l.e30
            public final void call(Object obj) {
                cdj0.m106236X(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ycj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cdj0.m106240b0((AccountEnvelop) obj);
            }
        };
        C22306c map = c22306cDoOnNext.map(new w9j() { // from class: l.zcj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cdj0.m106245g0(function2, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final C22306c<Token> m106249k0(@NotNull final PhoneSignupEarlyUIDData data, boolean isUpLinkSms) {
        data.getClass();
        C22306c<AccountEnvelop> c22306cM206660e = isUpLinkSms ? x14.m206656b().m206660e("/ttt-signup", data.toJson(), 70L) : x14.m206656b().m206659d("/ttt-signup", data.toJson());
        final Function1 function1 = new Function1() { // from class: l.pcj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cdj0.m106242d0(data, (AccountEnvelop) obj);
            }
        };
        C22306c<AccountEnvelop> c22306cDoOnNext = c22306cM206660e.doOnNext(new e30() { // from class: l.qcj0
            @Override // p149l.e30
            public final void call(Object obj) {
                cdj0.m106246h0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.rcj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cdj0.m106243e0((AccountEnvelop) obj);
            }
        };
        C22306c map = c22306cDoOnNext.map(new w9j() { // from class: l.scj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cdj0.m106247i0(function2, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final C22306c<Token> m106250l0(@NotNull final TokenSigninParam data) {
        data.getClass();
        C22306c<AccountEnvelop> c22306cM206659d = x14.m206656b().m206659d("/ttt-token-signin", data.toJson());
        final Function1 function1 = new Function1() { // from class: l.adj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cdj0.m106232T(data, (AccountEnvelop) obj);
            }
        };
        C22306c<AccountEnvelop> c22306cDoOnNext = c22306cM206659d.doOnNext(new e30() { // from class: l.bdj0
            @Override // p149l.e30
            public final void call(Object obj) {
                cdj0.m106239a0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ncj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cdj0.m106234V((AccountEnvelop) obj);
            }
        };
        C22306c map = c22306cDoOnNext.map(new w9j() { // from class: l.ocj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cdj0.m106235W(function2, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final C22306c<Pair<String, String>> m106251m0(@NotNull final PhoneVerifyCaptchaData data, boolean isUpLinkSms) {
        data.getClass();
        C22306c<AccountEnvelop> c22306cM206660e = isUpLinkSms ? x14.m206656b().m206660e("/phone/code/verify", data.toJson(), 70L) : x14.m206656b().m206659d("/phone/code/verify", data.toJson());
        final Function1 function1 = new Function1() { // from class: l.mcj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cdj0.m106238Z(data, (AccountEnvelop) obj);
            }
        };
        C22306c<AccountEnvelop> c22306cDoOnNext = c22306cM206660e.doOnNext(new e30() { // from class: l.tcj0
            @Override // p149l.e30
            public final void call(Object obj) {
                cdj0.m106244f0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ucj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cdj0.m106241c0((AccountEnvelop) obj);
            }
        };
        C22306c map = c22306cDoOnNext.map(new w9j() { // from class: l.vcj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cdj0.m106233U(function2, obj);
            }
        });
        map.getClass();
        return map;
    }
}
