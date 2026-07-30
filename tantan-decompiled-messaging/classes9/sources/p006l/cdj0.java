package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.TokenSigninParam;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.reponse_data.Data;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.account_phone.data.PhoneSendCaptchaData;
import com.p1.mobile.account_phone.data.PhoneSignupEarlyUIDData;
import com.p1.mobile.account_phone.data.PhoneVerifyCaptchaData;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import l.e30;
import l.vt60;
import l.w9j;
import l.ww;
import l.x14;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u00062\u0006\u0010\u0005\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0005\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ll/cdj0;", "Ll/vt60;", "<init>", "()V", "Lcom/p1/mobile/account_phone/data/PhoneSendCaptchaData;", "data", "Lrx/c;", "Lcom/p1/mobile/account_core/reponse_data/RiskVerification;", "j0", "(Lcom/p1/mobile/account_phone/data/PhoneSendCaptchaData;)Lrx/c;", "Lcom/p1/mobile/account_phone/data/PhoneVerifyCaptchaData;", "", "isUpLinkSms", "Lkotlin/Pair;", "", "m0", "(Lcom/p1/mobile/account_phone/data/PhoneVerifyCaptchaData;Z)Lrx/c;", "Lcom/p1/mobile/account_phone/data/PhoneSignupEarlyUIDData;", "Lcom/p1/mobile/account_core/reponse_data/Token;", "k0", "(Lcom/p1/mobile/account_phone/data/PhoneSignupEarlyUIDData;Z)Lrx/c;", "Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/TokenSigninParam;", "l0", "(Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/TokenSigninParam;)Lrx/c;", "Companion", "a", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cdj0 extends vt60 {
    /* JADX INFO: renamed from: T */
    public static Unit m13340T(TokenSigninParam tokenSigninParam, AccountEnvelop accountEnvelop) {
        if ((accountEnvelop != null ? accountEnvelop.data : null) == null || accountEnvelop.data.token == null) {
            ww.b("PhoneService/ttt-token-signin", tokenSigninParam.toJson());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static Pair m13341U(Function1 function1, Object obj) {
        return (Pair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static Token m13342V(AccountEnvelop accountEnvelop) {
        accountEnvelop.getClass();
        return accountEnvelop.data.token;
    }

    /* JADX INFO: renamed from: W */
    public static Token m13343W(Function1 function1, Object obj) {
        return (Token) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public static void m13344X(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    public static Unit m13345Y(PhoneSendCaptchaData phoneSendCaptchaData, AccountEnvelop accountEnvelop) {
        if ((accountEnvelop != null ? accountEnvelop.meta : null) == null) {
            ww.a("PhoneService/phone/code/send", phoneSendCaptchaData);
        }
        if (accountEnvelop != null) {
            Data data = accountEnvelop.data;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static Unit m13346Z(PhoneVerifyCaptchaData phoneVerifyCaptchaData, AccountEnvelop accountEnvelop) {
        if ((accountEnvelop != null ? accountEnvelop.data : null) == null || TextUtils.isEmpty(accountEnvelop.data.action)) {
            ww.a("PhoneService/phone/code/verify", phoneVerifyCaptchaData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m13347a0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static RiskVerification m13348b0(AccountEnvelop accountEnvelop) {
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
    public static Pair m13349c0(AccountEnvelop accountEnvelop) {
        String str;
        accountEnvelop.getClass();
        Map map = accountEnvelop.extra;
        String str2 = map != null ? (String) map.get("tttAction") : null;
        if (str2 != null) {
            switch (str2) {
                case "signin":
                case "signup":
                case "pending":
                case "ttt-signup":
                    Map map2 = accountEnvelop.extra;
                    if (map2 != null) {
                        str = (String) map2.get("tttAction");
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
        Map map3 = accountEnvelop.extra;
        return new Pair(str, map3 != null ? (String) map3.get("tttToken") : null);
    }

    /* JADX INFO: renamed from: d0 */
    public static Unit m13350d0(PhoneSignupEarlyUIDData phoneSignupEarlyUIDData, AccountEnvelop accountEnvelop) {
        if ((accountEnvelop != null ? accountEnvelop.data : null) == null || accountEnvelop.data.token == null) {
            ww.a("PhoneService/ttt-signup", phoneSignupEarlyUIDData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static Token m13351e0(AccountEnvelop accountEnvelop) {
        accountEnvelop.getClass();
        return accountEnvelop.data.token;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m13352f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static RiskVerification m13353g0(Function1 function1, Object obj) {
        return (RiskVerification) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m13354h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Token m13355i0(Function1 function1, Object obj) {
        return (Token) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final c<RiskVerification> m13356j0(@NotNull final PhoneSendCaptchaData data) {
        data.getClass();
        Objects.toString(data.action);
        c cVarD = x14.b().d("/phone/code/send", data.toJson());
        final Function1 function1 = new Function1() { // from class: l.wcj0
            public final Object invoke(Object obj) {
                return cdj0.m13345Y(data, (AccountEnvelop) obj);
            }
        };
        c cVarDoOnNext = cVarD.doOnNext(new e30() { // from class: l.xcj0
            public final void call(Object obj) {
                cdj0.m13344X(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ycj0
            public final Object invoke(Object obj) {
                return cdj0.m13348b0((AccountEnvelop) obj);
            }
        };
        c<RiskVerification> map = cVarDoOnNext.map(new w9j() { // from class: l.zcj0
            public final Object call(Object obj) {
                return cdj0.m13353g0(function2, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final c<Token> m13357k0(@NotNull final PhoneSignupEarlyUIDData data, boolean isUpLinkSms) {
        data.getClass();
        c cVarE = isUpLinkSms ? x14.b().e("/ttt-signup", data.toJson(), 70L) : x14.b().d("/ttt-signup", data.toJson());
        final Function1 function1 = new Function1() { // from class: l.pcj0
            public final Object invoke(Object obj) {
                return cdj0.m13350d0(data, (AccountEnvelop) obj);
            }
        };
        c cVarDoOnNext = cVarE.doOnNext(new e30() { // from class: l.qcj0
            public final void call(Object obj) {
                cdj0.m13354h0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.rcj0
            public final Object invoke(Object obj) {
                return cdj0.m13351e0((AccountEnvelop) obj);
            }
        };
        c<Token> map = cVarDoOnNext.map(new w9j() { // from class: l.scj0
            public final Object call(Object obj) {
                return cdj0.m13355i0(function2, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final c<Token> m13358l0(@NotNull final TokenSigninParam data) {
        data.getClass();
        c cVarD = x14.b().d("/ttt-token-signin", data.toJson());
        final Function1 function1 = new Function1() { // from class: l.adj0
            public final Object invoke(Object obj) {
                return cdj0.m13340T(data, (AccountEnvelop) obj);
            }
        };
        c cVarDoOnNext = cVarD.doOnNext(new e30() { // from class: l.bdj0
            public final void call(Object obj) {
                cdj0.m13347a0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ncj0
            public final Object invoke(Object obj) {
                return cdj0.m13342V((AccountEnvelop) obj);
            }
        };
        c<Token> map = cVarDoOnNext.map(new w9j() { // from class: l.ocj0
            public final Object call(Object obj) {
                return cdj0.m13343W(function2, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final c<Pair<String, String>> m13359m0(@NotNull final PhoneVerifyCaptchaData data, boolean isUpLinkSms) {
        data.getClass();
        c cVarE = isUpLinkSms ? x14.b().e("/phone/code/verify", data.toJson(), 70L) : x14.b().d("/phone/code/verify", data.toJson());
        final Function1 function1 = new Function1() { // from class: l.mcj0
            public final Object invoke(Object obj) {
                return cdj0.m13346Z(data, (AccountEnvelop) obj);
            }
        };
        c cVarDoOnNext = cVarE.doOnNext(new e30() { // from class: l.tcj0
            public final void call(Object obj) {
                cdj0.m13352f0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ucj0
            public final Object invoke(Object obj) {
                return cdj0.m13349c0((AccountEnvelop) obj);
            }
        };
        c<Pair<String, String>> map = cVarDoOnNext.map(new w9j() { // from class: l.vcj0
            public final Object call(Object obj) {
                return cdj0.m13341U(function2, obj);
            }
        });
        map.getClass();
        return map;
    }
}
