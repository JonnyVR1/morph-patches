package p006l;

import android.util.Pair;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.HasSpotLightData;
import com.p1.mobile.putong.core.data.HasSpotLightEnvelope;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.SpotLightForceMatchEnvelope;
import com.p1.mobile.putong.core.data.StartSpotLightData;
import com.p1.mobile.putong.core.data.StartSpotLightEnvelope;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.w9j;
import l.zpd0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qxa extends ax6 {

    /* JADX INFO: renamed from: R */
    public int f20129R;

    /* JADX INFO: renamed from: S */
    public float f20130S;

    /* JADX INFO: renamed from: T */
    public StartSpotLightData f20131T;

    /* JADX INFO: renamed from: U */
    public CoreAssetsSettings f20132U;

    /* JADX INFO: renamed from: V */
    public zpd0 f20133V;

    /* JADX INFO: renamed from: W */
    public zpd0 f20134W;

    /* JADX INFO: renamed from: X */
    public final a<Optional<roj0>> f20135X;

    /* JADX INFO: renamed from: Y */
    public final a<Pair<Integer, Pair<Float, Integer>>> f20136Y;

    /* JADX INFO: renamed from: Z */
    public c4g0 f20137Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f20138a0;

    /* JADX INFO: renamed from: b0 */
    public int f20139b0;

    public qxa(C0158c c0158c) {
        super(c0158c);
        this.f20129R = 0;
        this.f20130S = 0.0f;
        this.f20132U = CoreAssetsSettings.new_();
        this.f20133V = new zpd0("spot_last_time", 0L);
        this.f20134W = new zpd0("last_spotlight_anim_show_time_" + CoreModule.m1850H().userId(), 0L);
        this.f20135X = a.c(Optional.absent());
        this.f20136Y = a.b();
        this.f20139b0 = 0;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m22466a3(Conversation conversation) {
        Conversation conversationClone = conversation.clone();
        conversationClone.read = Boolean.TRUE;
        CoreModule.f1534c.f3631f0.m4980mq(conversationClone);
    }

    /* JADX INFO: renamed from: A3 */
    public c<HasSpotLightData> m22487A3() {
        return this.f8580Q.scheduled("giving_spot_light", 0, new v9j() { // from class: l.nxa
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.oxa
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3179T(CoreModule.m1850H().userId())).f().b();
                    }
                }, HasSpotLightEnvelope.JSON_ADAPTER).observeOn(jo0.a()).map(new w9j() { // from class: l.pxa
                    public final Object call(Object obj) {
                        return ((HasSpotLightEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ roj0 m22488B3(String str, String str2, f30 f30Var, SpotLightForceMatchEnvelope spotLightForceMatchEnvelope) {
        a<Optional<roj0>> aVarM22510x3 = m22510x3();
        roj0 roj0Var = roj0.a;
        aVarM22510x3.onNext(Optional.of(roj0Var));
        m22506T3(str, str2, f30Var);
        return roj0Var;
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ c m22489C3(final String str, final String str2, final String str3, final f30 f30Var) {
        return ia20.m16569c(new v9j() { // from class: l.lxa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3228f2()).l(utc0.create(Network.JSON, str)).b();
            }
        }, SpotLightForceMatchEnvelope.JSON_ADAPTER).observeOn(jo0.a()).map(new w9j() { // from class: l.mxa
            public final Object call(Object obj) {
                return this.f17346a.m22488B3(str2, str3, f30Var, (SpotLightForceMatchEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m22490D3() {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = CoreModule.f1533b.getResources().getAssets().open("spotlight_message_suggestions.json");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    inputStreamOpen.close();
                    this.f20132U = (CoreAssetsSettings) CoreAssetsSettings.JSON_ADAPTER.parse(sb.toString());
                    return;
                }
                sb.append(line);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ roj0 m22491E3(boolean z, d30 d30Var, StartSpotLightEnvelope startSpotLightEnvelope) {
        this.f20131T = startSpotLightEnvelope.data;
        m22502P3();
        if (z) {
            this.f8580Q.f3559H0.m27536k5();
        }
        this.f8580Q.f3544C0.m27423x4();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ c m22492F3(final String str, final boolean z, final d30 d30Var) {
        return ia20.m16569c(new v9j() { // from class: l.jxa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3232g2(CoreModule.m1850H().userId())).l(utc0.create(Network.JSON, str)).b();
            }
        }, StartSpotLightEnvelope.JSON_ADAPTER).observeOn(jo0.a()).map(new w9j() { // from class: l.kxa
            public final Object call(Object obj) {
                return this.f16045a.m22491E3(z, d30Var, (StartSpotLightEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ roj0 m22493G3(StartSpotLightEnvelope startSpotLightEnvelope) {
        StartSpotLightData startSpotLightData = startSpotLightEnvelope.data;
        this.f20138a0 = true;
        this.f20131T = startSpotLightData;
        m22502P3();
        return roj0.a;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ c m22494H3() {
        return ia20.m16569c(new v9j() { // from class: l.exa
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3240i2(CoreModule.m1850H().userId())).f().b();
            }
        }, StartSpotLightEnvelope.JSON_ADAPTER).observeOn(jo0.a()).map(new w9j() { // from class: l.fxa
            public final Object call(Object obj) {
                return this.f12957a.m22493G3((StartSpotLightEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ c m22495I3(String str, Message message, roj0 roj0Var) {
        return this.f8580Q.f3631f0.m4579Fn(str, message, null, false, false);
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m22496J3(final Conversation conversation) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.hxa
            public final void call() {
                qxa.m22466a3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m22497K3(String str, f30 f30Var, c cVar) {
        final Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(str);
        if (NullChecker.a(conversationM4786Xe)) {
            e51.y(new Runnable() { // from class: l.dxa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10639a.m22496J3(conversationM4786Xe);
                }
            });
        }
        f30Var.call((Object) null, "");
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m22498L3(Throwable th) {
        m22505S3();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m22499M3(d30 d30Var, Long l2) {
        this.f20139b0 += 500;
        d30Var.call();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m22500N3(int i, Float f, Integer num) {
        this.f20130S = f.floatValue();
        this.f20136Y.onNext(Pair.create(Integer.valueOf(i), Pair.create(f, num)));
    }

    /* JADX INFO: renamed from: O3 */
    public void m22501O3(final d30 d30Var, final boolean z, boolean z2) {
        final String str = "{\"active\": true, \"privilegeType\": \"spotLight\", \"consumeType\": \"" + xob.m27475i4(z2) + "\",\"mcc\": \"" + qib0.f19808f0 + "\", \"reginTag\":\"" + qib0.f19810h0 + "\", \"CoinSign\":\"" + this.f8580Q.f3559H0.m27551s4(SummarizedPrivilegesId.get("spotLight")) + "\"}";
        this.f8580Q.scheduled("patch_super_boost_start", -1, new v9j() { // from class: l.ixa
            public final Object call() {
                return this.f14859a.m22492F3(str, z, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final void m22502P3() {
        Float fValueOf = Float.valueOf(0.0f);
        if (this.f20138a0) {
            this.f20139b0 = 0;
            m22505S3();
            this.f20138a0 = false;
        }
        StartSpotLightData startSpotLightData = this.f20131T;
        if (!startSpotLightData.active) {
            this.f20129R = 0;
            m22500N3(0, fValueOf, 0);
            return;
        }
        int i = startSpotLightData.remain;
        if (i - this.f20139b0 <= 0) {
            this.f20129R = 0;
            m22500N3(0, fValueOf, 0);
            m22503Q3();
            m22505S3();
            return;
        }
        m22507U3(new d30() { // from class: l.zwa
            public final void call() {
                this.f29007a.m22502P3();
            }
        });
        long j = this.f20131T.duration;
        int i2 = (int) ((j - ((long) i)) + ((long) this.f20139b0));
        int i3 = i2 > 0 ? i2 : 0;
        this.f20129R = 1;
        m22500N3(1, Float.valueOf((i3 * 360.0f) / j), Integer.valueOf(i - this.f20139b0));
    }

    /* JADX INFO: renamed from: Q3 */
    public void m22503Q3() {
        this.f8580Q.scheduled("patch_super_boost_status", -1, new v9j() { // from class: l.cxa
            public final Object call() {
                return this.f9901a.m22494H3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void m22504R3() {
        m22505S3();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m22505S3() {
        if (NullChecker.a(this.f20137Z)) {
            mkd0.z(this.f20137Z);
            this.f20137Z = null;
        }
    }

    /* JADX INFO: renamed from: T3 */
    public void m22506T3(final String str, String str2, final f30<Throwable, String> f30Var) {
        final Message message = new Message();
        message.value = str2;
        message.messageType = MessageType.get("text");
        this.f8580Q.f3631f0.m4580Fo().map(new w9j() { // from class: l.wwa
            public final Object call(Object obj) {
                return this.f25440a.m22495I3(str, message, (roj0) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.xwa
            public final void call(Object obj) {
                this.f27752a.m22497K3(str, f30Var, (c) obj);
            }
        }, new e30() { // from class: l.ywa
            public final void call(Object obj) {
                f30Var.call((Throwable) obj, ((DbObject) message).id);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m22507U3(final d30 d30Var) {
        if (this.f20137Z == null) {
            this.f20137Z = c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.axa
                public final void call(Object obj) {
                    this.f8584a.m22499M3(d30Var, (Long) obj);
                }
            }, new e30() { // from class: l.bxa
                public final void call(Object obj) {
                    this.f9200a.m22498L3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v3 */
    public c<roj0> m22508v3(final String str, final String str2, final f30<Throwable, String> f30Var) {
        final String str3 = "{\"bizType\": \"spotLight\", \"other\": \"" + str + "\", \"me\":\"" + ((DbObject) CoreModule.f1534c.f3628e0.m21490p9()).id + "\"}";
        return this.f8580Q.scheduled("spotForceLike", -1, new v9j() { // from class: l.gxa
            public final Object call() {
                return this.f13557a.m22489C3(str3, str, str2, f30Var);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m22509w3(AnimEffectPlayer animEffectPlayer) {
        long jLongValue = ((Long) this.f20134W.get()).longValue();
        long jO = mqi0.o();
        boolean z = true;
        int iAbs = 8;
        if (jLongValue == 0) {
            this.f20134W.put(Long.valueOf(jO));
        } else {
            boolean zC = mqi0.C(jO, jLongValue);
            boolean z2 = !zC;
            long j = jO - jLongValue;
            boolean z3 = Math.abs(j) < 10000;
            if (!zC) {
                this.f20134W.put(Long.valueOf(jO));
            }
            if (z3 && animEffectPlayer.isAnimating()) {
                return;
            }
            if (!z3 || animEffectPlayer.isAnimating()) {
                z = z2;
            } else {
                iAbs = 10 - ((int) (Math.abs(j) / 1000));
                if (iAbs < 1) {
                    return;
                }
            }
        }
        animEffectPlayer.setVisibility(0);
        animEffectPlayer.loadAnimWithListener("core_intl_conversation_header_spotlight.svga", iAbs, new AnimListener(), z);
    }

    /* JADX INFO: renamed from: x3 */
    public a<Optional<roj0>> m22510x3() {
        return this.f20135X;
    }

    /* JADX INFO: renamed from: y3 */
    public a<Pair<Integer, Pair<Float, Integer>>> m22511y3() {
        return this.f20136Y;
    }

    /* JADX INFO: renamed from: z3 */
    public void m22512z3() {
        e51.y(new Runnable() { // from class: l.vwa
            @Override // java.lang.Runnable
            public final void run() {
                this.f24500a.m22490D3();
            }
        });
    }
}
