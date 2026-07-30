package p149l;

import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.core.glcore.util.ErrorCode;
import com.google.common.base.Optional;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.AccountRecord;
import com.p046p1.mobile.putong.core.data.Coin;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.MonetizationMsg;
import com.p046p1.mobile.putong.core.data.NewCoinsEnvelope;
import com.p046p1.mobile.putong.core.data.PromotionPrivilegePrices;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.Wallet;
import com.p046p1.mobile.putong.core.data.WalletAccount;
import com.p046p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IdentificationInfo;
import com.p046p1.mobile.putong.data.LuckyTantanSwitchEnableData;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.WithdrawAccount;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class xob extends ax6 {

    /* JADX INFO: renamed from: R */
    public int f193796R;

    /* JADX INFO: renamed from: S */
    public C22392a<Coin> f193797S;

    /* JADX INFO: renamed from: T */
    public C22392a<Map<SummarizedPrivilegesId, Integer>> f193798T;

    /* JADX INFO: renamed from: U */
    public C22392a<Map<SummarizedPrivilegesId, String>> f193799U;

    /* JADX INFO: renamed from: V */
    public C22392a<Map<SummarizedPrivilegesId, SummarizedPrivilegePrice>> f193800V;

    /* JADX INFO: renamed from: W */
    public hpd0 f193801W;

    /* JADX INFO: renamed from: X */
    public SummarizedPrivilegePrice f193802X;

    /* JADX INFO: renamed from: Y */
    public SummarizedPrivilegePrice f193803Y;

    /* JADX INFO: renamed from: Z */
    public SummarizedPrivilegePrice f193804Z;

    /* JADX INFO: renamed from: a0 */
    public final rzh0 f193805a0;

    /* JADX INFO: renamed from: b0 */
    public PromotionPrivilegePrices f193806b0;

    /* JADX INFO: renamed from: c0 */
    public Map<String, SummarizedPrivilegePrice> f193807c0;

    /* JADX INFO: renamed from: d0 */
    public C22393b<Wallet> f193808d0;

    /* JADX INFO: renamed from: e0 */
    public C22392a<IdentificationInfo> f193809e0;

    /* JADX INFO: renamed from: f0 */
    public C22393b<Optional<WalletAccount>> f193810f0;

    /* JADX INFO: renamed from: g0 */
    public C22393b<j760<String, List<AccountRecord>>> f193811g0;

    public xob(C4732c c4732c) {
        super(c4732c);
        this.f193796R = 0;
        this.f193797S = C22392a.m221512b();
        this.f193798T = C22392a.m221512b();
        this.f193799U = C22392a.m221512b();
        this.f193800V = C22392a.m221512b();
        this.f193808d0 = C22393b.m221521b();
        this.f193809e0 = C22392a.m221512b();
        this.f193810f0 = C22393b.m221521b();
        this.f193811g0 = C22393b.m221521b();
        this.f193801W = new hpd0("isAlipayBinded" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f193805a0 = new rzh0();
        this.f193807c0 = new HashMap();
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ Envelope m210290d4(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: i4 */
    public static String m210300i4(boolean z) {
        return z ? "coin" : "privilege";
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ Optional m210310s3(Envelope envelope) {
        return !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).accountRecords) ? Optional.m15413of(((CoreData) envelope.getModuleData(CoreData.class)).accountRecords.get(0)) : Optional.absent();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ j760 m210311t3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        return new j760(Boolean.valueOf(coreData.canChange), Integer.valueOf(coreData.ttcToDiamondRate));
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ SummarizedPrivilegePrice m210315x3(SummarizedPrivilegePrice summarizedPrivilegePrice) {
        return summarizedPrivilegePrice;
    }

    /* JADX INFO: renamed from: A4 */
    public int m210318A4() {
        return m210323C5(SummarizedPrivilegesId.get("instantChat"));
    }

    /* JADX INFO: renamed from: A5 */
    public C22306c<Optional<AccountRecord>> m210319A5(final String str, final String str2) {
        return this.f72126Q.scheduled("wallet_account_refund", 0, new v9j() { // from class: l.cob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81829a.m210345W4(str2, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: B4 */
    public int m210320B4() {
        return m210323C5(SummarizedPrivilegesId.get("intlReadMessage"));
    }

    /* JADX INFO: renamed from: B5 */
    public C22306c<Envelope> m210321B5() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oneId", sh50.m184159d());
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("trans_ttb_to_diamond", -1, new v9j() { // from class: l.dob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.lob
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31296f0()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.mob
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xob.m210290d4((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: C4 */
    public boolean m210322C4() {
        return this.f193801W.get().booleanValue();
    }

    /* JADX INFO: renamed from: C5 */
    public final int m210323C5(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, Integer> mapM221515e = this.f193798T.m221515e();
        if (mapM221515e == null || !mapM221515e.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return mapM221515e.get(summarizedPrivilegesId).intValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ j760 m210324D4(Envelope envelope) {
        if (((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts == null || ((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts.size() <= 0) {
            return vwb.m200311Y(Integer.valueOf(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED), "auth failed");
        }
        this.f193801W.put(Boolean.TRUE);
        return vwb.m200311Y(9000, ((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts.get(0).name);
    }

    /* JADX INFO: renamed from: D5 */
    public C22306c<Wallet> m210325D5() {
        return this.f193808d0;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ C22306c m210326E4(AuthTask authTask, String str) {
        Integer numValueOf = Integer.valueOf(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
        if (TextUtils.isEmpty(str)) {
            return C22306c.just(vwb.m200311Y(numValueOf, "auth failed"));
        }
        Map mapAuthV2 = authTask.authV2(str, false);
        if (!TextUtils.equals((CharSequence) mapAuthV2.get("resultStatus"), "9000")) {
            return C22306c.just(vwb.m200311Y(numValueOf, "auth failed"));
        }
        final Wallet walletNew_ = Wallet.new_();
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.platform = PayMethod.get("alipay");
        withdrawAccount.authInfo = (String) mapAuthV2.get(LovePlanetStage.result);
        walletNew_.withdrawAccounts = vwb.m200324f0(withdrawAccount);
        return new la20(new v9j() { // from class: l.job
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/wallet?intent=auth")).m185893l(utc0.create(Network.JSON, walletNew_.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.kob
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123974a.m210324D4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public C22306c<Optional<WalletAccount>> m210327E5() {
        return this.f193810f0.asObservable();
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ j760 m210328F4(Envelope envelope) {
        if (((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts == null || ((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts.size() <= 0) {
            return vwb.m200311Y(Integer.valueOf(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED), Integer.toString(envelope.meta.subCode));
        }
        this.f193801W.put(Boolean.TRUE);
        return vwb.m200311Y(9000, ((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts.get(0).name);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ C22306c m210329G4(AuthTask authTask, String str) {
        Integer numValueOf = Integer.valueOf(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
        if (TextUtils.isEmpty(str)) {
            return C22306c.just(vwb.m200311Y(numValueOf, "auth failed"));
        }
        Map mapAuthV2 = authTask.authV2(str, false);
        if (!TextUtils.equals((CharSequence) mapAuthV2.get("resultStatus"), "9000")) {
            return C22306c.just(vwb.m200311Y(numValueOf, "auth failed"));
        }
        final Wallet walletNew_ = Wallet.new_();
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.platform = PayMethod.get("alipay");
        withdrawAccount.authInfo = (String) mapAuthV2.get(LovePlanetStage.result);
        walletNew_.withdrawAccounts = vwb.m200324f0(withdrawAccount);
        return new la20(new v9j() { // from class: l.uob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/wallet?intent=auth")).m185893l(utc0.create(Network.JSON, walletNew_.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.vob
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182378a.m210328F4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ Boolean m210330H4(Envelope envelope) {
        if (((CoreData) envelope.getModuleData(CoreData.class)).wallet.identificationInfo != null) {
            m210353e5(((CoreData) envelope.getModuleData(CoreData.class)).wallet.identificationInfo);
        }
        return Boolean.valueOf(envelope.meta.code == 200);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ roj0 m210331I4(Envelope envelope) {
        if (((CoreData) envelope.getModuleData(CoreData.class)).wallet.identificationInfo != null) {
            m210353e5(((CoreData) envelope.getModuleData(CoreData.class)).wallet.identificationInfo);
        } else {
            m210353e5(new IdentificationInfo());
        }
        this.f193808d0.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).wallet);
        this.f193801W.put(Boolean.valueOf(!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts)));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ C22306c m210332J4() {
        return new la20(new v9j() { // from class: l.zmb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31227M2()).m185883b();
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.bnb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76384a.m210331I4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ roj0 m210333K4(Envelope envelope) {
        m210363l5(envelope);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ C22306c m210334L4() {
        return ia20.m135117a(new v9j() { // from class: l.vmb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0(IntlCountryCodeController.m28115k() ? "/summarized-privilege-prices?affiliate=huawei" : "/summarized-privilege-prices?affiliate=googleplay")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.wmb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f187058a.m210333K4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ stc0 m210336N4() {
        return C4728a.f19494P.auth().m185898q(m31379N2()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ roj0 m210337O4(Envelope envelope) {
        boolean zM200296J = vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).walletAccounts);
        C22393b<Optional<WalletAccount>> c22393b = this.f193810f0;
        if (zM200296J) {
            c22393b.m132487l(Optional.absent());
        } else {
            c22393b.m132487l(Optional.m15413of(((CoreData) envelope.getModuleData(CoreData.class)).walletAccounts.get(0)));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ C22306c m210338P4() {
        return ia20.m135117a(new v9j() { // from class: l.qmb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f155293a.m210336N4();
            }
        }).map(new w9j() { // from class: l.rmb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160078a.m210337O4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ stc0 m210339Q4(String str, String str2) {
        return C4728a.f19494P.auth().m185898q(m31380O2(str, str2)).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ roj0 m210340R4(String str, Envelope envelope) {
        this.f193811g0.m132487l(j760.m140076a(str, ((CoreData) envelope.getModuleData(CoreData.class)).accountRecords));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ C22306c m210341S4(final String str, final String str2) {
        return ia20.m135117a(new v9j() { // from class: l.xmb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193542a.m210339Q4(str, str2);
            }
        }).map(new w9j() { // from class: l.ymb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198975a.m210340R4(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ Boolean m210342T4(Envelope envelope) {
        this.f72126Q.f19570H0.m210361k5();
        return Boolean.valueOf(envelope.meta.code == 200);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ C22306c m210343U4(final JSONObject jSONObject) {
        return ia20.m135121e(new v9j() { // from class: l.nob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31334o2()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.oob
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144866a.m210342T4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ stc0 m210344V4(String str, String str2) {
        return C4728a.f19494P.auth().m185898q(m31381P2(str)).m185893l(utc0.create(Network.JSON, "{\"recordType\": \"withdraw\", \"amount\":\"" + str2 + "\"}")).m185883b();
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ C22306c m210345W4(final String str, final String str2) {
        return ia20.m135117a(new v9j() { // from class: l.fob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98525a.m210344V4(str, str2);
            }
        }).map(new w9j() { // from class: l.gob
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xob.m210310s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public int m210346X4() {
        return m210323C5(SummarizedPrivilegesId.get("letter"));
    }

    /* JADX INFO: renamed from: Y4 */
    public long m210347Y4() {
        return this.f193805a0.m181752c(this.f193797S.m221515e() == null ? 0L : this.f193797S.m221515e().available);
    }

    /* JADX INFO: renamed from: Z4 */
    public int m210348Z4() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
    }

    /* JADX INFO: renamed from: a5 */
    public C22306c<Coin> m210349a5() {
        return this.f193797S;
    }

    /* JADX INFO: renamed from: b5 */
    public int m210350b5() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.preConfession));
    }

    /* JADX INFO: renamed from: c5 */
    public final int m210351c5(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, SummarizedPrivilegePrice> mapM221515e = this.f193800V.m221515e();
        if (mapM221515e == null || !mapM221515e.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return mapM221515e.get(summarizedPrivilegesId).price;
    }

    /* JADX INFO: renamed from: d5 */
    public int m210352d5() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.profileLike));
    }

    /* JADX INFO: renamed from: e5 */
    public void m210353e5(IdentificationInfo identificationInfo) {
        this.f193809e0.m132487l(identificationInfo);
    }

    /* JADX INFO: renamed from: f5 */
    public int m210354f5() {
        return m210323C5(SummarizedPrivilegesId.get("quickchatNumber"));
    }

    /* JADX INFO: renamed from: g5 */
    public int m210355g5() {
        return m210351c5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX10));
    }

    /* JADX INFO: renamed from: h5 */
    public int m210356h5() {
        return m210351c5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX1));
    }

    /* JADX INFO: renamed from: i5 */
    public int m210357i5() {
        return m210351c5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX20));
    }

    /* JADX INFO: renamed from: j4 */
    public C22306c<j760<Integer, String>> m210358j4(final AuthTask authTask) {
        return m210373q5().switchMap(new w9j() { // from class: l.eob
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92432a.m210326E4(authTask, (String) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: j5 */
    public C22306c<roj0> m210359j5() {
        return this.f72126Q.scheduled("wallet", 0, new v9j() { // from class: l.umb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177220a.m210332J4();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public C22306c<j760<Integer, String>> m210360k4(final AuthTask authTask) {
        return m210373q5().switchMap(new w9j() { // from class: l.pmb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150202a.m210329G4(authTask, (String) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: k5 */
    public C22306c<roj0> m210361k5() {
        return this.f72126Q.scheduled("myCoins", 0, new v9j() { // from class: l.anb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f70725a.m210334L4();
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public int m210362l4() {
        return m210323C5(SummarizedPrivilegesId.get("voiceQuickchatNum"));
    }

    /* JADX INFO: renamed from: l5 */
    public void m210363l5(final Envelope envelope) {
        if (e51.m114739D()) {
            m210335M4(envelope);
        } else {
            e51.m114748M(new Runnable() { // from class: l.onb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144756a.m210335M4(envelope);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m4 */
    public int m210364m4() {
        return m210323C5(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: m5 */
    public C22306c<roj0> m210365m5() {
        return this.f72126Q.scheduled("wallet_account_monetization", 0, new v9j() { // from class: l.lnb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f128975a.m210338P4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public int m210366n4() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzMatch));
    }

    /* JADX INFO: renamed from: n5 */
    public C22306c<roj0> m210367n5(final String str, final String str2) {
        return this.f72126Q.scheduled("wallet_account_records" + str2, 0, new v9j() { // from class: l.sob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f165666a.m210341S4(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public int m210368o4() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzMemojiMatch));
    }

    /* JADX INFO: renamed from: o5 */
    public C22306c<j760<String, List<AccountRecord>>> m210369o5() {
        return this.f193811g0.asObservable();
    }

    /* JADX INFO: renamed from: p4 */
    public int m210370p4() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzVideoMatch));
    }

    /* JADX INFO: renamed from: p5 */
    public synchronized void m210371p5(Long l2) {
        this.f193805a0.m181754f(l2);
    }

    /* JADX INFO: renamed from: q4 */
    public int m210372q4() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzVoiceMatch));
    }

    /* JADX INFO: renamed from: q5 */
    public final C22306c<String> m210373q5() {
        return this.f72126Q.scheduled("authUrl", 0, new v9j() { // from class: l.tob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(new v9j() { // from class: l.gnb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/alipay/auth")).m185887f().m185883b();
                    }
                }, AlipayAuthEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.hnb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((AlipayAuthEnvelop) obj).data.alipayAuthRequest;
                    }
                }).compose(mkd0.m154965Q());
            }
        }, false);
    }

    /* JADX INFO: renamed from: r4 */
    public int m210374r4() {
        return m210351c5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.suggestTopShow));
    }

    /* JADX INFO: renamed from: r5 */
    public C22306c<AlipayAuthEnvelop> m210375r5(final String str, final String str2) {
        return this.f72126Q.scheduled("certificationUrl", 0, new v9j() { // from class: l.pnb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(new v9j() { // from class: l.bob
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/alipay/certification/initialize?cert_name=" + str + "&cert_no=" + str + "&src=live")).m185887f().m185883b();
                    }
                }, AlipayAuthEnvelop.JSON_ADAPTER).compose(mkd0.m154951C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: s4 */
    public String m210376s4(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, String> mapM221515e = this.f193799U.m221515e();
        return mapM221515e == null ? "" : mapM221515e.get(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: s5 */
    public synchronized Long m210377s5(String str, SummarizedPrivilegesId summarizedPrivilegesId) {
        return this.f193805a0.m181753d(str, m210323C5(summarizedPrivilegesId));
    }

    /* JADX INFO: renamed from: t4 */
    public String m210378t4() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f193806b0;
        return promotionPrivilegePrices == null ? "" : promotionPrivilegePrices.coinSign;
    }

    /* JADX INFO: renamed from: t5 */
    public int m210379t5() {
        int iM210323C5 = m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
        if (iM210323C5 == 0) {
            return 299;
        }
        return iM210323C5;
    }

    /* JADX INFO: renamed from: u4 */
    public int m210380u4() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f193806b0;
        if (promotionPrivilegePrices == null) {
            return 0;
        }
        return promotionPrivilegePrices.price;
    }

    /* JADX INFO: renamed from: u5 */
    public C22306c<Boolean> m210381u5() {
        return this.f72126Q.scheduled("show_lucky_tantan", 0, new v9j() { // from class: l.smb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(new v9j() { // from class: l.knb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31364w0()).m185887f().m185883b();
                    }
                }, LuckyTantanSwitchEnableData.JSON_ADAPTER).compose(mkd0.m154951C()).map(new w9j() { // from class: l.mnb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((LuckyTantanSwitchEnableData) obj).data);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public final void m210335M4(Envelope envelope) {
        List<PromotionPrivilegePrices> list;
        if (((CoreData) envelope.getModuleData(CoreData.class)).coins != null) {
            this.f193797S.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).coins);
        }
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices)) {
            return;
        }
        this.f193802X = (SummarizedPrivilegePrice) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.qnb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f20509id, SummarizedPrivilegesId.picksX10));
            }
        });
        this.f193803Y = (SummarizedPrivilegePrice) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.rnb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f20509id, SummarizedPrivilegesId.picksX20));
            }
        });
        this.f193804Z = (SummarizedPrivilegePrice) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.snb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f20509id, SummarizedPrivilegesId.picksX30));
            }
        });
        SummarizedPrivilegePrice summarizedPrivilegePrice = (SummarizedPrivilegePrice) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.tnb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f20509id, "boost"));
            }
        });
        if (summarizedPrivilegePrice != null && (list = summarizedPrivilegePrice.promotionPrivilegePrices) != null && !list.isEmpty()) {
            this.f193806b0 = summarizedPrivilegePrice.promotionPrivilegePrices.get(0);
        }
        if (CoreModule.m29934N().mo60329Vo()) {
            List<SummarizedPrivilegePrice> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices;
            if (!vwb.m200296J(list2)) {
                for (SummarizedPrivilegePrice summarizedPrivilegePrice2 : list2) {
                    if (NullChecker.m81303a(summarizedPrivilegePrice2.f20509id)) {
                        String string = summarizedPrivilegePrice2.f20509id.toString();
                        if (!TextUtils.isEmpty(string) && string.startsWith("momentBoostCoin")) {
                            this.f193807c0.put(string, summarizedPrivilegePrice2);
                        }
                    }
                }
            }
        }
        this.f193798T.m132487l(vwb.m200319d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.unb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f20509id;
            }
        }, new w9j() { // from class: l.vnb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((SummarizedPrivilegePrice) obj).unitPrice);
            }
        }));
        this.f193799U.m132487l(vwb.m200319d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.xnb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f20509id;
            }
        }, new w9j() { // from class: l.ynb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).coinSign;
            }
        }));
        this.f193800V.m132487l(vwb.m200319d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.znb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f20509id;
            }
        }, new w9j() { // from class: l.aob
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xob.m210315x3((SummarizedPrivilegePrice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v5 */
    public C22306c<j760<Boolean, Integer>> m210383v5() {
        return this.f72126Q.scheduled("show_trans_diamond_bt", 0, new v9j() { // from class: l.wob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.inb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31300g0()).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.jnb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xob.m210311t3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public C22306c<MonetizationMsg> m210384w4() {
        return this.f72126Q.scheduled("show_lucky_tantan", 0, new v9j() { // from class: l.pob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.qob
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31269Y0(CoreModule.m29931H().userId())).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.rob
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).monetizationMsg;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public C22306c<roj0> m210385w5() {
        return this.f72126Q.scheduled("show_liveIncome", 0, new v9j() { // from class: l.tmb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.cnb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31360v0()).m185883b();
                    }
                }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.dnb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public C22306c<Coin> m210386x4() {
        return this.f72126Q.scheduled("getNewCoins", 0, new v9j() { // from class: l.wnb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.nnb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/coins")).m185887f().m185883b();
                    }
                }, NewCoinsEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.hob
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((NewCoinsEnvelope) obj).data.coins;
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public C22306c<Boolean> m210387x5(String str, SummarizedPrivilegesId summarizedPrivilegesId, String str2, int i) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("coinSign", str);
            jSONObject.put("consumeType", str2);
            jSONObject.put("privilegeType", summarizedPrivilegesId);
            jSONObject.put(FirebaseAnalytics.Param.PRICE, i);
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("summarized_privilege_new", -1, new v9j() { // from class: l.iob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114128a.m210343U4(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: y4 */
    public int m210388y4() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.sayHello));
    }

    /* JADX INFO: renamed from: y5 */
    public int m210389y5() {
        return m210323C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight));
    }

    /* JADX INFO: renamed from: z4 */
    public C22306c<Boolean> m210390z4(String str) {
        final Wallet wallet = new Wallet();
        IdentificationInfo identificationInfo = new IdentificationInfo();
        wallet.identificationInfo = identificationInfo;
        identificationInfo.zhiMaCertificationResult = str;
        return new la20(new v9j() { // from class: l.enb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/wallet?intent=certificate")).m185893l(utc0.create(Network.JSON, wallet.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.fnb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98412a.m210330H4((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: z5 */
    public int m210391z5() {
        return m210323C5(SummarizedPrivilegesId.get("superLike"));
    }
}
