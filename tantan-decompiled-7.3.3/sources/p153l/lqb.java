package p153l;

import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.core.glcore.util.ErrorCode;
import com.google.common.base.Optional;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.AccountRecord;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.MonetizationMsg;
import com.p051p1.mobile.putong.core.data.NewCoinsEnvelope;
import com.p051p1.mobile.putong.core.data.PromotionPrivilegePrices;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.Wallet;
import com.p051p1.mobile.putong.core.data.WalletAccount;
import com.p051p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IdentificationInfo;
import com.p051p1.mobile.putong.data.LuckyTantanSwitchEnableData;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.WithdrawAccount;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class lqb extends dy6 {

    /* JADX INFO: renamed from: R */
    public int f133165R;

    /* JADX INFO: renamed from: S */
    public C22507a<Coin> f133166S;

    /* JADX INFO: renamed from: T */
    public C22507a<Map<SummarizedPrivilegesId, Integer>> f133167T;

    /* JADX INFO: renamed from: U */
    public C22507a<Map<SummarizedPrivilegesId, String>> f133168U;

    /* JADX INFO: renamed from: V */
    public C22507a<Map<SummarizedPrivilegesId, SummarizedPrivilegePrice>> f133169V;

    /* JADX INFO: renamed from: W */
    public jxd0 f133170W;

    /* JADX INFO: renamed from: X */
    public SummarizedPrivilegePrice f133171X;

    /* JADX INFO: renamed from: Y */
    public SummarizedPrivilegePrice f133172Y;

    /* JADX INFO: renamed from: Z */
    public SummarizedPrivilegePrice f133173Z;

    /* JADX INFO: renamed from: a0 */
    public final z7i0 f133174a0;

    /* JADX INFO: renamed from: b0 */
    public PromotionPrivilegePrices f133175b0;

    /* JADX INFO: renamed from: c0 */
    public Map<String, SummarizedPrivilegePrice> f133176c0;

    /* JADX INFO: renamed from: d0 */
    public C22508b<Wallet> f133177d0;

    /* JADX INFO: renamed from: e0 */
    public C22507a<IdentificationInfo> f133178e0;

    /* JADX INFO: renamed from: f0 */
    public C22508b<Optional<WalletAccount>> f133179f0;

    /* JADX INFO: renamed from: g0 */
    public C22508b<pf60<String, List<AccountRecord>>> f133180g0;

    public lqb(C4883c c4883c) {
        super(c4883c);
        this.f133165R = 0;
        this.f133166S = C22507a.m222758b();
        this.f133167T = C22507a.m222758b();
        this.f133168U = C22507a.m222758b();
        this.f133169V = C22507a.m222758b();
        this.f133177d0 = C22508b.m222767b();
        this.f133178e0 = C22507a.m222758b();
        this.f133179f0 = C22508b.m222767b();
        this.f133180g0 = C22508b.m222767b();
        this.f133170W = new jxd0("isAlipayBinded" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f133174a0 = new z7i0();
        this.f133176c0 = new HashMap();
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ Envelope m155378d4(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: i4 */
    public static String m155388i4(boolean z) {
        return z ? "coin" : "privilege";
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ Optional m155398s3(Envelope envelope) {
        return !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).accountRecords) ? Optional.m15467of(((CoreData) envelope.getModuleData(CoreData.class)).accountRecords.get(0)) : Optional.absent();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ pf60 m155399t3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        return new pf60(Boolean.valueOf(coreData.canChange), Integer.valueOf(coreData.ttcToDiamondRate));
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ SummarizedPrivilegePrice m155403x3(SummarizedPrivilegePrice summarizedPrivilegePrice) {
        return summarizedPrivilegePrice;
    }

    /* JADX INFO: renamed from: A4 */
    public int m155406A4() {
        return m155411C5(SummarizedPrivilegesId.get("instantChat"));
    }

    /* JADX INFO: renamed from: A5 */
    public C22421c<Optional<AccountRecord>> m155407A5(final String str, final String str2) {
        return this.f91137Q.scheduled("wallet_account_refund", 0, new pcj() { // from class: l.qpb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f158850a.m155433W4(str2, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: B4 */
    public int m155408B4() {
        return m155411C5(SummarizedPrivilegesId.get("intlReadMessage"));
    }

    /* JADX INFO: renamed from: B5 */
    public C22421c<Envelope> m155409B5() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oneId", yp50.m217001d());
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("trans_ttb_to_diamond", -1, new pcj() { // from class: l.rpb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.zpb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32299f0()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.aqb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return lqb.m155378d4((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: C4 */
    public boolean m155410C4() {
        return this.f133170W.get().booleanValue();
    }

    /* JADX INFO: renamed from: C5 */
    public final int m155411C5(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, Integer> mapM222761e = this.f133167T.m222761e();
        if (mapM222761e == null || !mapM222761e.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return mapM222761e.get(summarizedPrivilegesId).intValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ pf60 m155412D4(Envelope envelope) {
        if (((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts == null || ((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts.size() <= 0) {
            return jyb.m147494Y(Integer.valueOf(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED), "auth failed");
        }
        this.f133170W.put(Boolean.TRUE);
        return jyb.m147494Y(9000, ((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts.get(0).name);
    }

    /* JADX INFO: renamed from: D5 */
    public C22421c<Wallet> m155413D5() {
        return this.f133177d0;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ C22421c m155414E4(AuthTask authTask, String str) {
        Integer numValueOf = Integer.valueOf(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
        if (TextUtils.isEmpty(str)) {
            return C22421c.just(jyb.m147494Y(numValueOf, "auth failed"));
        }
        Map mapAuthV2 = authTask.authV2(str, false);
        if (!TextUtils.equals((CharSequence) mapAuthV2.get("resultStatus"), "9000")) {
            return C22421c.just(jyb.m147494Y(numValueOf, "auth failed"));
        }
        final Wallet walletNew_ = Wallet.new_();
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.platform = PayMethod.get("alipay");
        withdrawAccount.authInfo = (String) mapAuthV2.get(LovePlanetStage.result);
        walletNew_.withdrawAccounts = jyb.m147507f0(withdrawAccount);
        return new ti20(new pcj() { // from class: l.xpb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/wallet?intent=auth")).m209038l(z1d0.create(Network.JSON, walletNew_.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.ypb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201053a.m155412D4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public C22421c<Optional<WalletAccount>> m155415E5() {
        return this.f133179f0.asObservable();
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ pf60 m155416F4(Envelope envelope) {
        if (((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts == null || ((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts.size() <= 0) {
            return jyb.m147494Y(Integer.valueOf(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED), Integer.toString(envelope.meta.subCode));
        }
        this.f133170W.put(Boolean.TRUE);
        return jyb.m147494Y(9000, ((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts.get(0).name);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ C22421c m155417G4(AuthTask authTask, String str) {
        Integer numValueOf = Integer.valueOf(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
        if (TextUtils.isEmpty(str)) {
            return C22421c.just(jyb.m147494Y(numValueOf, "auth failed"));
        }
        Map mapAuthV2 = authTask.authV2(str, false);
        if (!TextUtils.equals((CharSequence) mapAuthV2.get("resultStatus"), "9000")) {
            return C22421c.just(jyb.m147494Y(numValueOf, "auth failed"));
        }
        final Wallet walletNew_ = Wallet.new_();
        WithdrawAccount withdrawAccount = new WithdrawAccount();
        withdrawAccount.platform = PayMethod.get("alipay");
        withdrawAccount.authInfo = (String) mapAuthV2.get(LovePlanetStage.result);
        walletNew_.withdrawAccounts = jyb.m147507f0(withdrawAccount);
        return new ti20(new pcj() { // from class: l.iqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/wallet?intent=auth")).m209038l(z1d0.create(Network.JSON, walletNew_.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.jqb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122192a.m155416F4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ Boolean m155418H4(Envelope envelope) {
        if (((CoreData) envelope.getModuleData(CoreData.class)).wallet.identificationInfo != null) {
            m155441e5(((CoreData) envelope.getModuleData(CoreData.class)).wallet.identificationInfo);
        }
        return Boolean.valueOf(envelope.meta.code == 200);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ uxj0 m155419I4(Envelope envelope) {
        if (((CoreData) envelope.getModuleData(CoreData.class)).wallet.identificationInfo != null) {
            m155441e5(((CoreData) envelope.getModuleData(CoreData.class)).wallet.identificationInfo);
        } else {
            m155441e5(new IdentificationInfo());
        }
        this.f133177d0.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).wallet);
        this.f133170W.put(Boolean.valueOf(!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).wallet.withdrawAccounts)));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ C22421c m155420J4() {
        return new ti20(new pcj() { // from class: l.nob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32230M2()).m209028b();
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.pob
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153387a.m155419I4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ uxj0 m155421K4(Envelope envelope) {
        m155451l5(envelope);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ C22421c m155422L4() {
        return qi20.m176654a(new pcj() { // from class: l.job
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0(IntlCountryCodeController.m29114k() ? "/summarized-privilege-prices?affiliate=huawei" : "/summarized-privilege-prices?affiliate=googleplay")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.kob
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f127708a.m155421K4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ x1d0 m155424N4() {
        return C4879a.f20236P.auth().m209043q(m32382N2()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ uxj0 m155425O4(Envelope envelope) {
        boolean zM147479J = jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).walletAccounts);
        C22508b<Optional<WalletAccount>> c22508b = this.f133179f0;
        if (zM147479J) {
            c22508b.m137019l(Optional.absent());
        } else {
            c22508b.m137019l(Optional.m15467of(((CoreData) envelope.getModuleData(CoreData.class)).walletAccounts.get(0)));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ C22421c m155426P4() {
        return qi20.m176654a(new pcj() { // from class: l.eob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f94923a.m155424N4();
            }
        }).map(new qcj() { // from class: l.fob
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100046a.m155425O4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ x1d0 m155427Q4(String str, String str2) {
        return C4879a.f20236P.auth().m209043q(m32383O2(str, str2)).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ uxj0 m155428R4(String str, Envelope envelope) {
        this.f133180g0.m137019l(pf60.m172085a(str, ((CoreData) envelope.getModuleData(CoreData.class)).accountRecords));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ C22421c m155429S4(final String str, final String str2) {
        return qi20.m176654a(new pcj() { // from class: l.lob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f132887a.m155427Q4(str, str2);
            }
        }).map(new qcj() { // from class: l.mob
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f137806a.m155428R4(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ Boolean m155430T4(Envelope envelope) {
        this.f91137Q.f20312H0.m155449k5();
        return Boolean.valueOf(envelope.meta.code == 200);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ C22421c m155431U4(final JSONObject jSONObject) {
        return qi20.m176658e(new pcj() { // from class: l.bqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32337o2()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.cqb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f83078a.m155430T4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ x1d0 m155432V4(String str, String str2) {
        return C4879a.f20236P.auth().m209043q(m32384P2(str)).m209038l(z1d0.create(Network.JSON, "{\"recordType\": \"withdraw\", \"amount\":\"" + str2 + "\"}")).m209028b();
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ C22421c m155433W4(final String str, final String str2) {
        return qi20.m176654a(new pcj() { // from class: l.tpb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f175581a.m155432V4(str, str2);
            }
        }).map(new qcj() { // from class: l.upb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return lqb.m155398s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public int m155434X4() {
        return m155411C5(SummarizedPrivilegesId.get("letter"));
    }

    /* JADX INFO: renamed from: Y4 */
    public long m155435Y4() {
        return this.f133174a0.m218894c(this.f133166S.m222761e() == null ? 0L : this.f133166S.m222761e().available);
    }

    /* JADX INFO: renamed from: Z4 */
    public int m155436Z4() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
    }

    /* JADX INFO: renamed from: a5 */
    public C22421c<Coin> m155437a5() {
        return this.f133166S;
    }

    /* JADX INFO: renamed from: b5 */
    public int m155438b5() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.preConfession));
    }

    /* JADX INFO: renamed from: c5 */
    public final int m155439c5(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, SummarizedPrivilegePrice> mapM222761e = this.f133169V.m222761e();
        if (mapM222761e == null || !mapM222761e.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return mapM222761e.get(summarizedPrivilegesId).price;
    }

    /* JADX INFO: renamed from: d5 */
    public int m155440d5() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.profileLike));
    }

    /* JADX INFO: renamed from: e5 */
    public void m155441e5(IdentificationInfo identificationInfo) {
        this.f133178e0.m137019l(identificationInfo);
    }

    /* JADX INFO: renamed from: f5 */
    public int m155442f5() {
        return m155411C5(SummarizedPrivilegesId.get("quickchatNumber"));
    }

    /* JADX INFO: renamed from: g5 */
    public int m155443g5() {
        return m155439c5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX10));
    }

    /* JADX INFO: renamed from: h5 */
    public int m155444h5() {
        return m155439c5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX1));
    }

    /* JADX INFO: renamed from: i5 */
    public int m155445i5() {
        return m155439c5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX20));
    }

    /* JADX INFO: renamed from: j4 */
    public C22421c<pf60<Integer, String>> m155446j4(final AuthTask authTask) {
        return m155461q5().switchMap(new qcj() { // from class: l.spb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f170023a.m155414E4(authTask, (String) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: j5 */
    public C22421c<uxj0> m155447j5() {
        return this.f91137Q.scheduled("wallet", 0, new pcj() { // from class: l.iob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f116134a.m155420J4();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public C22421c<pf60<Integer, String>> m155448k4(final AuthTask authTask) {
        return m155461q5().switchMap(new qcj() { // from class: l.dob
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f89909a.m155417G4(authTask, (String) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: k5 */
    public C22421c<uxj0> m155449k5() {
        return this.f91137Q.scheduled("myCoins", 0, new pcj() { // from class: l.oob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f148343a.m155422L4();
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public int m155450l4() {
        return m155411C5(SummarizedPrivilegesId.get("voiceQuickchatNum"));
    }

    /* JADX INFO: renamed from: l5 */
    public void m155451l5(final Envelope envelope) {
        if (l51.m152884D()) {
            m155423M4(envelope);
        } else {
            l51.m152893M(new Runnable() { // from class: l.cpb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82984a.m155423M4(envelope);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m4 */
    public int m155452m4() {
        return m155411C5(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: m5 */
    public C22421c<uxj0> m155453m5() {
        return this.f91137Q.scheduled("wallet_account_monetization", 0, new pcj() { // from class: l.zob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f205308a.m155426P4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public int m155454n4() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzMatch));
    }

    /* JADX INFO: renamed from: n5 */
    public C22421c<uxj0> m155455n5(final String str, final String str2) {
        return this.f91137Q.scheduled("wallet_account_records" + str2, 0, new pcj() { // from class: l.gqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f105669a.m155429S4(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public int m155456o4() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzMemojiMatch));
    }

    /* JADX INFO: renamed from: o5 */
    public C22421c<pf60<String, List<AccountRecord>>> m155457o5() {
        return this.f133180g0.asObservable();
    }

    /* JADX INFO: renamed from: p4 */
    public int m155458p4() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzVideoMatch));
    }

    /* JADX INFO: renamed from: p5 */
    public synchronized void m155459p5(Long l2) {
        this.f133174a0.m218896f(l2);
    }

    /* JADX INFO: renamed from: q4 */
    public int m155460q4() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzVoiceMatch));
    }

    /* JADX INFO: renamed from: q5 */
    public final C22421c<String> m155461q5() {
        return this.f91137Q.scheduled("authUrl", 0, new pcj() { // from class: l.hqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(new pcj() { // from class: l.uob
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/alipay/auth")).m209032f().m209028b();
                    }
                }, AlipayAuthEnvelop.JSON_ADAPTER).map(new qcj() { // from class: l.vob
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((AlipayAuthEnvelop) obj).data.alipayAuthRequest;
                    }
                }).compose(psd0.m173606Q());
            }
        }, false);
    }

    /* JADX INFO: renamed from: r4 */
    public int m155462r4() {
        return m155439c5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.suggestTopShow));
    }

    /* JADX INFO: renamed from: r5 */
    public C22421c<AlipayAuthEnvelop> m155463r5(final String str, final String str2) {
        return this.f91137Q.scheduled("certificationUrl", 0, new pcj() { // from class: l.dpb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(new pcj() { // from class: l.ppb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/alipay/certification/initialize?cert_name=" + str + "&cert_no=" + str + "&src=live")).m209032f().m209028b();
                    }
                }, AlipayAuthEnvelop.JSON_ADAPTER).compose(psd0.m173592C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: s4 */
    public String m155464s4(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, String> mapM222761e = this.f133168U.m222761e();
        return mapM222761e == null ? "" : mapM222761e.get(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: s5 */
    public synchronized Long m155465s5(String str, SummarizedPrivilegesId summarizedPrivilegesId) {
        return this.f133174a0.m218895d(str, m155411C5(summarizedPrivilegesId));
    }

    /* JADX INFO: renamed from: t4 */
    public String m155466t4() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f133175b0;
        return promotionPrivilegePrices == null ? "" : promotionPrivilegePrices.coinSign;
    }

    /* JADX INFO: renamed from: t5 */
    public int m155467t5() {
        int iM155411C5 = m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
        if (iM155411C5 == 0) {
            return 299;
        }
        return iM155411C5;
    }

    /* JADX INFO: renamed from: u4 */
    public int m155468u4() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f133175b0;
        if (promotionPrivilegePrices == null) {
            return 0;
        }
        return promotionPrivilegePrices.price;
    }

    /* JADX INFO: renamed from: u5 */
    public C22421c<Boolean> m155469u5() {
        return this.f91137Q.scheduled("show_lucky_tantan", 0, new pcj() { // from class: l.gob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(new pcj() { // from class: l.yob
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32367w0()).m209032f().m209028b();
                    }
                }, LuckyTantanSwitchEnableData.JSON_ADAPTER).compose(psd0.m173592C()).map(new qcj() { // from class: l.apb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((LuckyTantanSwitchEnableData) obj).data);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public final void m155423M4(Envelope envelope) {
        List<PromotionPrivilegePrices> list;
        if (((CoreData) envelope.getModuleData(CoreData.class)).coins != null) {
            this.f133166S.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).coins);
        }
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices)) {
            return;
        }
        this.f133171X = (SummarizedPrivilegePrice) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.epb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f21251id, SummarizedPrivilegesId.picksX10));
            }
        });
        this.f133172Y = (SummarizedPrivilegePrice) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.fpb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f21251id, SummarizedPrivilegesId.picksX20));
            }
        });
        this.f133173Z = (SummarizedPrivilegePrice) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.gpb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f21251id, SummarizedPrivilegesId.picksX30));
            }
        });
        SummarizedPrivilegePrice summarizedPrivilegePrice = (SummarizedPrivilegePrice) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.hpb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f21251id, "boost"));
            }
        });
        if (summarizedPrivilegePrice != null && (list = summarizedPrivilegePrice.promotionPrivilegePrices) != null && !list.isEmpty()) {
            this.f133175b0 = summarizedPrivilegePrice.promotionPrivilegePrices.get(0);
        }
        if (CoreModule.m30932N().mo61513Vo()) {
            List<SummarizedPrivilegePrice> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices;
            if (!jyb.m147479J(list2)) {
                for (SummarizedPrivilegePrice summarizedPrivilegePrice2 : list2) {
                    if (NullChecker.m82486a(summarizedPrivilegePrice2.f21251id)) {
                        String string = summarizedPrivilegePrice2.f21251id.toString();
                        if (!TextUtils.isEmpty(string) && string.startsWith("momentBoostCoin")) {
                            this.f133176c0.put(string, summarizedPrivilegePrice2);
                        }
                    }
                }
            }
        }
        this.f133167T.m137019l(jyb.m147502d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.ipb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f21251id;
            }
        }, new qcj() { // from class: l.jpb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((SummarizedPrivilegePrice) obj).unitPrice);
            }
        }));
        this.f133168U.m137019l(jyb.m147502d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.lpb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f21251id;
            }
        }, new qcj() { // from class: l.mpb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).coinSign;
            }
        }));
        this.f133169V.m137019l(jyb.m147502d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.npb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f21251id;
            }
        }, new qcj() { // from class: l.opb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return lqb.m155403x3((SummarizedPrivilegePrice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v5 */
    public C22421c<pf60<Boolean, Integer>> m155471v5() {
        return this.f91137Q.scheduled("show_trans_diamond_bt", 0, new pcj() { // from class: l.kqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.wob
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32303g0()).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.xob
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return lqb.m155399t3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public C22421c<MonetizationMsg> m155472w4() {
        return this.f91137Q.scheduled("show_lucky_tantan", 0, new pcj() { // from class: l.dqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.eqb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32272Y0(CoreModule.m30929H().userId())).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.fqb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).monetizationMsg;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public C22421c<uxj0> m155473w5() {
        return this.f91137Q.scheduled("show_liveIncome", 0, new pcj() { // from class: l.hob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.qob
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32363v0()).m209028b();
                    }
                }).compose(psd0.m173592C()).map(new qcj() { // from class: l.rob
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public C22421c<Coin> m155474x4() {
        return this.f91137Q.scheduled("getNewCoins", 0, new pcj() { // from class: l.kpb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.bpb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/coins")).m209032f().m209028b();
                    }
                }, NewCoinsEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.vpb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((NewCoinsEnvelope) obj).data.coins;
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public C22421c<Boolean> m155475x5(String str, SummarizedPrivilegesId summarizedPrivilegesId, String str2, int i) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("coinSign", str);
            jSONObject.put("consumeType", str2);
            jSONObject.put("privilegeType", summarizedPrivilegesId);
            jSONObject.put(FirebaseAnalytics.Param.PRICE, i);
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("summarized_privilege_new", -1, new pcj() { // from class: l.wpb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190277a.m155431U4(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: y4 */
    public int m155476y4() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.sayHello));
    }

    /* JADX INFO: renamed from: y5 */
    public int m155477y5() {
        return m155411C5(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight));
    }

    /* JADX INFO: renamed from: z4 */
    public C22421c<Boolean> m155478z4(String str) {
        final Wallet wallet = new Wallet();
        IdentificationInfo identificationInfo = new IdentificationInfo();
        wallet.identificationInfo = identificationInfo;
        identificationInfo.zhiMaCertificationResult = str;
        return new ti20(new pcj() { // from class: l.sob
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/wallet?intent=certificate")).m209038l(z1d0.create(Network.JSON, wallet.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.tob
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175374a.m155418H4((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: z5 */
    public int m155479z5() {
        return m155411C5(SummarizedPrivilegesId.get("superLike"));
    }
}
