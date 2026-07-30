package p006l;

import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.AccountRecord;
import com.p1.mobile.putong.core.data.Coin;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.MonetizationMsg;
import com.p1.mobile.putong.core.data.NewCoinsEnvelope;
import com.p1.mobile.putong.core.data.PromotionPrivilegePrices;
import com.p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.Wallet;
import com.p1.mobile.putong.core.data.WalletAccount;
import com.p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.IdentificationInfo;
import com.p1.mobile.putong.data.LuckyTantanSwitchEnableData;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.WithdrawAccount;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e51;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.roj0;
import l.rzh0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xob extends ax6 {

    /* JADX INFO: renamed from: R */
    public int f27638R;

    /* JADX INFO: renamed from: S */
    public a<Coin> f27639S;

    /* JADX INFO: renamed from: T */
    public a<Map<SummarizedPrivilegesId, Integer>> f27640T;

    /* JADX INFO: renamed from: U */
    public a<Map<SummarizedPrivilegesId, String>> f27641U;

    /* JADX INFO: renamed from: V */
    public a<Map<SummarizedPrivilegesId, SummarizedPrivilegePrice>> f27642V;

    /* JADX INFO: renamed from: W */
    public hpd0 f27643W;

    /* JADX INFO: renamed from: X */
    public SummarizedPrivilegePrice f27644X;

    /* JADX INFO: renamed from: Y */
    public SummarizedPrivilegePrice f27645Y;

    /* JADX INFO: renamed from: Z */
    public SummarizedPrivilegePrice f27646Z;

    /* JADX INFO: renamed from: a0 */
    public final rzh0 f27647a0;

    /* JADX INFO: renamed from: b0 */
    public PromotionPrivilegePrices f27648b0;

    /* JADX INFO: renamed from: c0 */
    public Map<String, SummarizedPrivilegePrice> f27649c0;

    /* JADX INFO: renamed from: d0 */
    public b<Wallet> f27650d0;

    /* JADX INFO: renamed from: e0 */
    public a<IdentificationInfo> f27651e0;

    /* JADX INFO: renamed from: f0 */
    public b<Optional<WalletAccount>> f27652f0;

    /* JADX INFO: renamed from: g0 */
    public b<j760<String, List<AccountRecord>>> f27653g0;

    public xob(C0158c c0158c) {
        super(c0158c);
        this.f27638R = 0;
        this.f27639S = a.b();
        this.f27640T = a.b();
        this.f27641U = a.b();
        this.f27642V = a.b();
        this.f27650d0 = b.b();
        this.f27651e0 = a.b();
        this.f27652f0 = b.b();
        this.f27653g0 = b.b();
        this.f27643W = new hpd0("isAlipayBinded" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f27647a0 = new rzh0();
        this.f27649c0 = new HashMap();
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ Envelope m27465d4(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: i4 */
    public static String m27475i4(boolean z) {
        return z ? "coin" : "privilege";
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ Optional m27485s3(Envelope envelope) {
        return !vwb.J(envelope.getModuleData(CoreData.class).accountRecords) ? Optional.of((AccountRecord) envelope.getModuleData(CoreData.class).accountRecords.get(0)) : Optional.absent();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ j760 m27486t3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        return new j760(Boolean.valueOf(moduleData.canChange), Integer.valueOf(moduleData.ttcToDiamondRate));
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ SummarizedPrivilegePrice m27490x3(SummarizedPrivilegePrice summarizedPrivilegePrice) {
        return summarizedPrivilegePrice;
    }

    /* JADX INFO: renamed from: A4 */
    public int m27493A4() {
        return m27498C5(SummarizedPrivilegesId.get("instantChat"));
    }

    /* JADX INFO: renamed from: A5 */
    public c<Optional<AccountRecord>> m27494A5(final String str, final String str2) {
        return this.f8580Q.scheduled("wallet_account_refund", 0, new v9j() { // from class: l.cob
            public final Object call() {
                return this.f9765a.m27520W4(str2, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: B4 */
    public int m27495B4() {
        return m27498C5(SummarizedPrivilegesId.get("intlReadMessage"));
    }

    /* JADX INFO: renamed from: B5 */
    public c<Envelope> m27496B5() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oneId", sh50.m23745d());
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("trans_ttb_to_diamond", -1, new v9j() { // from class: l.dob
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.lob
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3226f0()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.mob
                    public final Object call(Object obj) {
                        return xob.m27465d4((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: C4 */
    public boolean m27497C4() {
        return ((Boolean) this.f27643W.get()).booleanValue();
    }

    /* JADX INFO: renamed from: C5 */
    public final int m27498C5(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map map = (Map) this.f27640T.e();
        if (map == null || !map.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return ((Integer) map.get(summarizedPrivilegesId)).intValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ j760 m27499D4(Envelope envelope) {
        if (envelope.getModuleData(CoreData.class).wallet.withdrawAccounts == null || envelope.getModuleData(CoreData.class).wallet.withdrawAccounts.size() <= 0) {
            return vwb.Y(9001, "auth failed");
        }
        this.f27643W.put(Boolean.TRUE);
        return vwb.Y(9000, ((WithdrawAccount) envelope.getModuleData(CoreData.class).wallet.withdrawAccounts.get(0)).name);
    }

    /* JADX INFO: renamed from: D5 */
    public c<Wallet> m27500D5() {
        return this.f27650d0;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ c m27501E4(AuthTask authTask, String str) {
        if (TextUtils.isEmpty(str)) {
            return c.just(vwb.Y(9001, "auth failed"));
        }
        Map mapAuthV2 = authTask.authV2(str, false);
        if (!TextUtils.equals((CharSequence) mapAuthV2.get("resultStatus"), "9000")) {
            return c.just(vwb.Y(9001, "auth failed"));
        }
        final Wallet walletNew_ = Wallet.new_();
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.platform = PayMethod.get("alipay");
        withdrawAccount.authInfo = (String) mapAuthV2.get("result");
        walletNew_.withdrawAccounts = vwb.f0(new WithdrawAccount[]{withdrawAccount});
        return new la20(new v9j() { // from class: l.job
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/wallet?intent=auth")).l(utc0.create(Network.JSON, walletNew_.toJson())).b();
            }
        }).map(new w9j() { // from class: l.kob
            public final Object call(Object obj) {
                return this.f15925a.m27499D4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public c<Optional<WalletAccount>> m27502E5() {
        return this.f27652f0.asObservable();
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ j760 m27503F4(Envelope envelope) {
        if (envelope.getModuleData(CoreData.class).wallet.withdrawAccounts == null || envelope.getModuleData(CoreData.class).wallet.withdrawAccounts.size() <= 0) {
            return vwb.Y(9001, Integer.toString(envelope.meta.subCode));
        }
        this.f27643W.put(Boolean.TRUE);
        return vwb.Y(9000, ((WithdrawAccount) envelope.getModuleData(CoreData.class).wallet.withdrawAccounts.get(0)).name);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ c m27504G4(AuthTask authTask, String str) {
        if (TextUtils.isEmpty(str)) {
            return c.just(vwb.Y(9001, "auth failed"));
        }
        Map mapAuthV2 = authTask.authV2(str, false);
        if (!TextUtils.equals((CharSequence) mapAuthV2.get("resultStatus"), "9000")) {
            return c.just(vwb.Y(9001, "auth failed"));
        }
        final Wallet walletNew_ = Wallet.new_();
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.platform = PayMethod.get("alipay");
        withdrawAccount.authInfo = (String) mapAuthV2.get("result");
        walletNew_.withdrawAccounts = vwb.f0(new WithdrawAccount[]{withdrawAccount});
        return new la20(new v9j() { // from class: l.uob
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/wallet?intent=auth")).l(utc0.create(Network.JSON, walletNew_.toJson())).b();
            }
        }).map(new w9j() { // from class: l.vob
            public final Object call(Object obj) {
                return this.f24401a.m27503F4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ Boolean m27505H4(Envelope envelope) {
        if (envelope.getModuleData(CoreData.class).wallet.identificationInfo != null) {
            m27528e5(envelope.getModuleData(CoreData.class).wallet.identificationInfo);
        }
        return Boolean.valueOf(envelope.meta.code == 200);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ roj0 m27506I4(Envelope envelope) {
        if (envelope.getModuleData(CoreData.class).wallet.identificationInfo != null) {
            m27528e5(envelope.getModuleData(CoreData.class).wallet.identificationInfo);
        } else {
            m27528e5(new IdentificationInfo());
        }
        this.f27650d0.onNext(envelope.getModuleData(CoreData.class).wallet);
        this.f27643W.put(Boolean.valueOf(!vwb.J(envelope.getModuleData(CoreData.class).wallet.withdrawAccounts)));
        return roj0.a;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ c m27507J4() {
        return new la20(new v9j() { // from class: l.zmb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3157M2()).b();
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.bnb
            public final Object call(Object obj) {
                return this.f9003a.m27506I4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ roj0 m27508K4(Envelope envelope) {
        m27538l5(envelope);
        return roj0.a;
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ c m27509L4() {
        return ia20.m16567a(new v9j() { // from class: l.vmb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0(IntlCountryCodeController.m10k() ? "/summarized-privilege-prices?affiliate=huawei" : "/summarized-privilege-prices?affiliate=googleplay")).f().b();
            }
        }).map(new w9j() { // from class: l.wmb
            public final Object call(Object obj) {
                return this.f25232a.m27508K4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ stc0 m27511N4() {
        return C0154a.f3483P.auth().q(m3309N2()).f().b();
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ roj0 m27512O4(Envelope envelope) {
        boolean zJ = vwb.J(envelope.getModuleData(CoreData.class).walletAccounts);
        b<Optional<WalletAccount>> bVar = this.f27652f0;
        if (zJ) {
            bVar.onNext(Optional.absent());
        } else {
            bVar.onNext(Optional.of((WalletAccount) envelope.getModuleData(CoreData.class).walletAccounts.get(0)));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ c m27513P4() {
        return ia20.m16567a(new v9j() { // from class: l.qmb
            public final Object call() {
                return this.f19912a.m27511N4();
            }
        }).map(new w9j() { // from class: l.rmb
            public final Object call(Object obj) {
                return this.f20632a.m27512O4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ stc0 m27514Q4(String str, String str2) {
        return C0154a.f3483P.auth().q(m3310O2(str, str2)).f().b();
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ roj0 m27515R4(String str, Envelope envelope) {
        this.f27653g0.onNext(j760.a(str, envelope.getModuleData(CoreData.class).accountRecords));
        return roj0.a;
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ c m27516S4(final String str, final String str2) {
        return ia20.m16567a(new v9j() { // from class: l.xmb
            public final Object call() {
                return this.f27608a.m27514Q4(str, str2);
            }
        }).map(new w9j() { // from class: l.ymb
            public final Object call(Object obj) {
                return this.f28301a.m27515R4(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ Boolean m27517T4(Envelope envelope) {
        this.f8580Q.f3559H0.m27536k5();
        return Boolean.valueOf(envelope.meta.code == 200);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ c m27518U4(final JSONObject jSONObject) {
        return ia20.m16571e(new v9j() { // from class: l.nob
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3264o2()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.oob
            public final Object call(Object obj) {
                return this.f18305a.m27517T4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ stc0 m27519V4(String str, String str2) {
        return C0154a.f3483P.auth().q(m3311P2(str)).l(utc0.create(Network.JSON, "{\"recordType\": \"withdraw\", \"amount\":\"" + str2 + "\"}")).b();
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ c m27520W4(final String str, final String str2) {
        return ia20.m16567a(new v9j() { // from class: l.fob
            public final Object call() {
                return this.f12818a.m27519V4(str, str2);
            }
        }).map(new w9j() { // from class: l.gob
            public final Object call(Object obj) {
                return xob.m27485s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public int m27521X4() {
        return m27498C5(SummarizedPrivilegesId.get("letter"));
    }

    /* JADX INFO: renamed from: Y4 */
    public long m27522Y4() {
        return this.f27647a0.c(this.f27639S.e() == null ? 0L : ((Coin) this.f27639S.e()).available);
    }

    /* JADX INFO: renamed from: Z4 */
    public int m27523Z4() {
        return m27498C5(SummarizedPrivilegesId.get("minBoost"));
    }

    /* JADX INFO: renamed from: a5 */
    public c<Coin> m27524a5() {
        return this.f27639S;
    }

    /* JADX INFO: renamed from: b5 */
    public int m27525b5() {
        return m27498C5(SummarizedPrivilegesId.get("preConfession"));
    }

    /* JADX INFO: renamed from: c5 */
    public final int m27526c5(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map map = (Map) this.f27642V.e();
        if (map == null || !map.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return ((SummarizedPrivilegePrice) map.get(summarizedPrivilegesId)).price;
    }

    /* JADX INFO: renamed from: d5 */
    public int m27527d5() {
        return m27498C5(SummarizedPrivilegesId.get("profileLike"));
    }

    /* JADX INFO: renamed from: e5 */
    public void m27528e5(IdentificationInfo identificationInfo) {
        this.f27651e0.onNext(identificationInfo);
    }

    /* JADX INFO: renamed from: f5 */
    public int m27529f5() {
        return m27498C5(SummarizedPrivilegesId.get("quickchatNumber"));
    }

    /* JADX INFO: renamed from: g5 */
    public int m27530g5() {
        return m27526c5(SummarizedPrivilegesId.get("quickchatSpeedUpNumX10"));
    }

    /* JADX INFO: renamed from: h5 */
    public int m27531h5() {
        return m27526c5(SummarizedPrivilegesId.get("quickchatSpeedUpNumX1"));
    }

    /* JADX INFO: renamed from: i5 */
    public int m27532i5() {
        return m27526c5(SummarizedPrivilegesId.get("quickchatSpeedUpNumX20"));
    }

    /* JADX INFO: renamed from: j4 */
    public c<j760<Integer, String>> m27533j4(final AuthTask authTask) {
        return m27548q5().switchMap(new w9j() { // from class: l.eob
            public final Object call(Object obj) {
                return this.f11302a.m27501E4(authTask, (String) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: j5 */
    public c<roj0> m27534j5() {
        return this.f8580Q.scheduled("wallet", 0, new v9j() { // from class: l.umb
            public final Object call() {
                return this.f23641a.m27507J4();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public c<j760<Integer, String>> m27535k4(final AuthTask authTask) {
        return m27548q5().switchMap(new w9j() { // from class: l.pmb
            public final Object call(Object obj) {
                return this.f19196a.m27504G4(authTask, (String) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: k5 */
    public c<roj0> m27536k5() {
        return this.f8580Q.scheduled("myCoins", 0, new v9j() { // from class: l.anb
            public final Object call() {
                return this.f8405a.m27509L4();
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public int m27537l4() {
        return m27498C5(SummarizedPrivilegesId.get("voiceQuickchatNum"));
    }

    /* JADX INFO: renamed from: l5 */
    public void m27538l5(final Envelope envelope) {
        if (e51.D()) {
            m27510M4(envelope);
        } else {
            e51.M(new Runnable() { // from class: l.onb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18291a.m27510M4(envelope);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m4 */
    public int m27539m4() {
        return m27498C5(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: m5 */
    public c<roj0> m27540m5() {
        return this.f8580Q.scheduled("wallet_account_monetization", 0, new v9j() { // from class: l.lnb
            public final Object call() {
                return this.f16530a.m27513P4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public int m27541n4() {
        return m27498C5(SummarizedPrivilegesId.get("buzzMatch"));
    }

    /* JADX INFO: renamed from: n5 */
    public c<roj0> m27542n5(final String str, final String str2) {
        return this.f8580Q.scheduled("wallet_account_records" + str2, 0, new v9j() { // from class: l.sob
            public final Object call() {
                return this.f21550a.m27516S4(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public int m27543o4() {
        return m27498C5(SummarizedPrivilegesId.get("buzzMemojiMatch"));
    }

    /* JADX INFO: renamed from: o5 */
    public c<j760<String, List<AccountRecord>>> m27544o5() {
        return this.f27653g0.asObservable();
    }

    /* JADX INFO: renamed from: p4 */
    public int m27545p4() {
        return m27498C5(SummarizedPrivilegesId.get("buzzVideoMatch"));
    }

    /* JADX INFO: renamed from: p5 */
    public synchronized void m27546p5(Long l2) {
        this.f27647a0.f(l2);
    }

    /* JADX INFO: renamed from: q4 */
    public int m27547q4() {
        return m27498C5(SummarizedPrivilegesId.get("buzzVoiceMatch"));
    }

    /* JADX INFO: renamed from: q5 */
    public final c<String> m27548q5() {
        return this.f8580Q.scheduled("authUrl", 0, new v9j() { // from class: l.tob
            public final Object call() {
                return new ka20(new v9j() { // from class: l.gnb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/alipay/auth")).f().b();
                    }
                }, AlipayAuthEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.hnb
                    public final Object call(Object obj) {
                        return ((AlipayAuthEnvelop) obj).data.alipayAuthRequest;
                    }
                }).compose(mkd0.Q());
            }
        }, false);
    }

    /* JADX INFO: renamed from: r4 */
    public int m27549r4() {
        return m27526c5(SummarizedPrivilegesId.get("suggestTopShow"));
    }

    /* JADX INFO: renamed from: r5 */
    public c<AlipayAuthEnvelop> m27550r5(final String str, final String str2) {
        return this.f8580Q.scheduled("certificationUrl", 0, new v9j() { // from class: l.pnb
            public final Object call() {
                return new ka20(new v9j() { // from class: l.bob
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/alipay/certification/initialize?cert_name=" + str + "&cert_no=" + str + "&src=live")).f().b();
                    }
                }, AlipayAuthEnvelop.JSON_ADAPTER).compose(mkd0.C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: s4 */
    public String m27551s4(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map map = (Map) this.f27641U.e();
        return map == null ? "" : (String) map.get(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: s5 */
    public synchronized Long m27552s5(String str, SummarizedPrivilegesId summarizedPrivilegesId) {
        return this.f27647a0.d(str, m27498C5(summarizedPrivilegesId));
    }

    /* JADX INFO: renamed from: t4 */
    public String m27553t4() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f27648b0;
        return promotionPrivilegePrices == null ? "" : promotionPrivilegePrices.coinSign;
    }

    /* JADX INFO: renamed from: t5 */
    public int m27554t5() {
        int iM27498C5 = m27498C5(SummarizedPrivilegesId.get("greetNumber"));
        if (iM27498C5 == 0) {
            return 299;
        }
        return iM27498C5;
    }

    /* JADX INFO: renamed from: u4 */
    public int m27555u4() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f27648b0;
        if (promotionPrivilegePrices == null) {
            return 0;
        }
        return promotionPrivilegePrices.price;
    }

    /* JADX INFO: renamed from: u5 */
    public c<Boolean> m27556u5() {
        return this.f8580Q.scheduled("show_lucky_tantan", 0, new v9j() { // from class: l.smb
            public final Object call() {
                return new ka20(new v9j() { // from class: l.knb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3294w0()).f().b();
                    }
                }, LuckyTantanSwitchEnableData.JSON_ADAPTER).compose(mkd0.C()).map(new w9j() { // from class: l.mnb
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((LuckyTantanSwitchEnableData) obj).data);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public final void m27510M4(Envelope envelope) {
        List list;
        if (envelope.getModuleData(CoreData.class).coins != null) {
            this.f27639S.onNext(envelope.getModuleData(CoreData.class).coins);
        }
        if (vwb.J(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices)) {
            return;
        }
        this.f27644X = (SummarizedPrivilegePrice) vwb.r(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.qnb
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).id, "picksX10"));
            }
        });
        this.f27645Y = (SummarizedPrivilegePrice) vwb.r(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.rnb
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).id, "picksX20"));
            }
        });
        this.f27646Z = (SummarizedPrivilegePrice) vwb.r(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.snb
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).id, "picksX30"));
            }
        });
        SummarizedPrivilegePrice summarizedPrivilegePrice = (SummarizedPrivilegePrice) vwb.r(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.tnb
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).id, "boost"));
            }
        });
        if (summarizedPrivilegePrice != null && (list = summarizedPrivilegePrice.promotionPrivilegePrices) != null && !list.isEmpty()) {
            this.f27648b0 = (PromotionPrivilegePrices) summarizedPrivilegePrice.promotionPrivilegePrices.get(0);
        }
        if (CoreModule.m1853N().Vo()) {
            List<SummarizedPrivilegePrice> list2 = envelope.getModuleData(CoreData.class).summarizedPrivilegePrices;
            if (!vwb.J(list2)) {
                for (SummarizedPrivilegePrice summarizedPrivilegePrice2 : list2) {
                    if (NullChecker.a(summarizedPrivilegePrice2.id)) {
                        String string = summarizedPrivilegePrice2.id.toString();
                        if (!TextUtils.isEmpty(string) && string.startsWith("momentBoostCoin")) {
                            this.f27649c0.put(string, summarizedPrivilegePrice2);
                        }
                    }
                }
            }
        }
        this.f27640T.onNext(vwb.d(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.unb
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).id;
            }
        }, new w9j() { // from class: l.vnb
            public final Object call(Object obj) {
                return Integer.valueOf(((SummarizedPrivilegePrice) obj).unitPrice);
            }
        }));
        this.f27641U.onNext(vwb.d(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.xnb
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).id;
            }
        }, new w9j() { // from class: l.ynb
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).coinSign;
            }
        }));
        this.f27642V.onNext(vwb.d(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.znb
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).id;
            }
        }, new w9j() { // from class: l.aob
            public final Object call(Object obj) {
                return xob.m27490x3((SummarizedPrivilegePrice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v5 */
    public c<j760<Boolean, Integer>> m27558v5() {
        return this.f8580Q.scheduled("show_trans_diamond_bt", 0, new v9j() { // from class: l.wob
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.inb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3230g0()).f().b();
                    }
                }).map(new w9j() { // from class: l.jnb
                    public final Object call(Object obj) {
                        return xob.m27486t3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public c<MonetizationMsg> m27559w4() {
        return this.f8580Q.scheduled("show_lucky_tantan", 0, new v9j() { // from class: l.pob
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.qob
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3199Y0(CoreModule.m1850H().userId())).f().b();
                    }
                }).map(new w9j() { // from class: l.rob
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).monetizationMsg;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public c<roj0> m27560w5() {
        return this.f8580Q.scheduled("show_liveIncome", 0, new v9j() { // from class: l.tmb
            public final Object call() {
                return new la20(new v9j() { // from class: l.cnb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3290v0()).b();
                    }
                }).compose(mkd0.C()).map(new w9j() { // from class: l.dnb
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public c<Coin> m27561x4() {
        return this.f8580Q.scheduled("getNewCoins", 0, new v9j() { // from class: l.wnb
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.nnb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/coins")).f().b();
                    }
                }, NewCoinsEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.hob
            public final Object call(Object obj) {
                return ((NewCoinsEnvelope) obj).data.coins;
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public c<Boolean> m27562x5(String str, SummarizedPrivilegesId summarizedPrivilegesId, String str2, int i) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("coinSign", str);
            jSONObject.put("consumeType", str2);
            jSONObject.put("privilegeType", summarizedPrivilegesId);
            jSONObject.put("price", i);
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("summarized_privilege_new", -1, new v9j() { // from class: l.iob
            public final Object call() {
                return this.f14589a.m27518U4(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: y4 */
    public int m27563y4() {
        return m27498C5(SummarizedPrivilegesId.get("sayHello"));
    }

    /* JADX INFO: renamed from: y5 */
    public int m27564y5() {
        return m27498C5(SummarizedPrivilegesId.get("spotLight"));
    }

    /* JADX INFO: renamed from: z4 */
    public c<Boolean> m27565z4(String str) {
        final Wallet wallet = new Wallet();
        IdentificationInfo identificationInfo = new IdentificationInfo();
        wallet.identificationInfo = identificationInfo;
        identificationInfo.zhiMaCertificationResult = str;
        return new la20(new v9j() { // from class: l.enb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/wallet?intent=certificate")).l(utc0.create(Network.JSON, wallet.toJson())).b();
            }
        }).map(new w9j() { // from class: l.fnb
            public final Object call(Object obj) {
                return this.f12797a.m27505H4((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: z5 */
    public int m27566z5() {
        return m27498C5(SummarizedPrivilegesId.get("superLike"));
    }
}
