package p149l;

import android.util.Pair;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.data.HasSpotLightData;
import com.p046p1.mobile.putong.core.data.HasSpotLightEnvelope;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.SpotLightForceMatchEnvelope;
import com.p046p1.mobile.putong.core.data.StartSpotLightData;
import com.p046p1.mobile.putong.core.data.StartSpotLightEnvelope;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class qxa extends ax6 {

    /* JADX INFO: renamed from: R */
    public int f156825R;

    /* JADX INFO: renamed from: S */
    public float f156826S;

    /* JADX INFO: renamed from: T */
    public StartSpotLightData f156827T;

    /* JADX INFO: renamed from: U */
    public CoreAssetsSettings f156828U;

    /* JADX INFO: renamed from: V */
    public zpd0 f156829V;

    /* JADX INFO: renamed from: W */
    public zpd0 f156830W;

    /* JADX INFO: renamed from: X */
    public final C22392a<Optional<roj0>> f156831X;

    /* JADX INFO: renamed from: Y */
    public final C22392a<Pair<Integer, Pair<Float, Integer>>> f156832Y;

    /* JADX INFO: renamed from: Z */
    public c4g0 f156833Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f156834a0;

    /* JADX INFO: renamed from: b0 */
    public int f156835b0;

    public qxa(C4732c c4732c) {
        super(c4732c);
        this.f156825R = 0;
        this.f156826S = 0.0f;
        this.f156828U = CoreAssetsSettings.new_();
        this.f156829V = new zpd0("spot_last_time", 0L);
        this.f156830W = new zpd0("last_spotlight_anim_show_time_" + CoreModule.m29931H().userId(), 0L);
        this.f156831X = C22392a.m221513c(Optional.absent());
        this.f156832Y = C22392a.m221512b();
        this.f156835b0 = 0;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m176945a3(Conversation conversation) {
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.read = Boolean.TRUE;
        CoreModule.f17545c.f19642f0.m33050mq(conversationMo223809clone);
    }

    /* JADX INFO: renamed from: A3 */
    public C22306c<HasSpotLightData> m176966A3() {
        return this.f72126Q.scheduled("giving_spot_light", 0, new v9j() { // from class: l.nxa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.oxa
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31249T(CoreModule.m29931H().userId())).m185887f().m185883b();
                    }
                }, HasSpotLightEnvelope.JSON_ADAPTER).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.pxa
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((HasSpotLightEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ roj0 m176967B3(String str, String str2, f30 f30Var, SpotLightForceMatchEnvelope spotLightForceMatchEnvelope) {
        C22392a<Optional<roj0>> c22392aM176989x3 = m176989x3();
        roj0 roj0Var = roj0.f160388a;
        c22392aM176989x3.m132487l(Optional.m15413of(roj0Var));
        m176985T3(str, str2, f30Var);
        return roj0Var;
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ C22306c m176968C3(final String str, final String str2, final String str3, final f30 f30Var) {
        return ia20.m135119c(new v9j() { // from class: l.lxa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31298f2()).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }, SpotLightForceMatchEnvelope.JSON_ADAPTER).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.mxa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136147a.m176967B3(str2, str3, f30Var, (SpotLightForceMatchEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m176969D3() {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = CoreModule.f17544b.getResources().getAssets().open("spotlight_message_suggestions.json");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    inputStreamOpen.close();
                    this.f156828U = CoreAssetsSettings.JSON_ADAPTER.parse(sb.toString());
                    return;
                }
                sb.append(line);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ roj0 m176970E3(boolean z, d30 d30Var, StartSpotLightEnvelope startSpotLightEnvelope) {
        this.f156827T = startSpotLightEnvelope.data;
        m176981P3();
        if (z) {
            this.f72126Q.f19570H0.m210361k5();
        }
        this.f72126Q.f19555C0.m210115x4();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ C22306c m176971F3(final String str, final boolean z, final d30 d30Var) {
        return ia20.m135119c(new v9j() { // from class: l.jxa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31302g2(CoreModule.m29931H().userId())).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }, StartSpotLightEnvelope.JSON_ADAPTER).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.kxa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f125093a.m176970E3(z, d30Var, (StartSpotLightEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ roj0 m176972G3(StartSpotLightEnvelope startSpotLightEnvelope) {
        StartSpotLightData startSpotLightData = startSpotLightEnvelope.data;
        this.f156834a0 = true;
        this.f156827T = startSpotLightData;
        m176981P3();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ C22306c m176973H3() {
        return ia20.m135119c(new v9j() { // from class: l.exa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31310i2(CoreModule.m29931H().userId())).m185887f().m185883b();
            }
        }, StartSpotLightEnvelope.JSON_ADAPTER).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.fxa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f99745a.m176972G3((StartSpotLightEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ C22306c m176974I3(String str, Message message, roj0 roj0Var) {
        return this.f72126Q.f19642f0.m32649Fn(str, message, null, false, false);
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m176975J3(final Conversation conversation) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.hxa
            @Override // p149l.d30
            public final void call() {
                qxa.m176945a3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m176976K3(String str, f30 f30Var, C22306c c22306c) {
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        if (NullChecker.m81303a(conversationM32856Xe)) {
            e51.m114774y(new Runnable() { // from class: l.dxa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88274a.m176975J3(conversationM32856Xe);
                }
            });
        }
        f30Var.call(null, "");
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m176977L3(Throwable th) {
        m176984S3();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m176978M3(d30 d30Var, Long l2) {
        this.f156835b0 += 500;
        d30Var.call();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m176979N3(int i, Float f, Integer num) {
        this.f156826S = f.floatValue();
        this.f156832Y.m132487l(Pair.create(Integer.valueOf(i), Pair.create(f, num)));
    }

    /* JADX INFO: renamed from: O3 */
    public void m176980O3(final d30 d30Var, final boolean z, boolean z2) {
        final String str = "{\"active\": true, \"privilegeType\": \"spotLight\", \"consumeType\": \"" + xob.m210300i4(z2) + "\",\"mcc\": \"" + qib0.f154717f0 + "\", \"reginTag\":\"" + qib0.f154719h0 + "\", \"CoinSign\":\"" + this.f72126Q.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight)) + "\"}";
        this.f72126Q.scheduled("patch_super_boost_start", -1, new v9j() { // from class: l.ixa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f115339a.m176971F3(str, z, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final void m176981P3() {
        Float fValueOf = Float.valueOf(0.0f);
        if (this.f156834a0) {
            this.f156835b0 = 0;
            m176984S3();
            this.f156834a0 = false;
        }
        StartSpotLightData startSpotLightData = this.f156827T;
        if (!startSpotLightData.active) {
            this.f156825R = 0;
            m176979N3(0, fValueOf, 0);
            return;
        }
        int i = startSpotLightData.remain;
        if (i - this.f156835b0 <= 0) {
            this.f156825R = 0;
            m176979N3(0, fValueOf, 0);
            m176982Q3();
            m176984S3();
            return;
        }
        m176986U3(new d30() { // from class: l.zwa
            @Override // p149l.d30
            public final void call() {
                this.f205164a.m176981P3();
            }
        });
        long j = this.f156827T.duration;
        int i2 = (int) ((j - ((long) i)) + ((long) this.f156835b0));
        int i3 = i2 > 0 ? i2 : 0;
        this.f156825R = 1;
        m176979N3(1, Float.valueOf((i3 * 360.0f) / j), Integer.valueOf(i - this.f156835b0));
    }

    /* JADX INFO: renamed from: Q3 */
    public void m176982Q3() {
        this.f72126Q.scheduled("patch_super_boost_status", -1, new v9j() { // from class: l.cxa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82860a.m176973H3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void m176983R3() {
        m176984S3();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m176984S3() {
        if (NullChecker.m81303a(this.f156833Z)) {
            mkd0.m154992z(this.f156833Z);
            this.f156833Z = null;
        }
    }

    /* JADX INFO: renamed from: T3 */
    public void m176985T3(final String str, String str2, final f30<Throwable, String> f30Var) {
        final Message message = new Message();
        message.value = str2;
        message.messageType = MessageType.get("text");
        this.f72126Q.f19642f0.m32650Fo().map(new w9j() { // from class: l.wwa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188354a.m176974I3(str, message, (roj0) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.xwa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194717a.m176976K3(str, f30Var, (C22306c) obj);
            }
        }, new e30() { // from class: l.ywa
            @Override // p149l.e30
            public final void call(Object obj) {
                f30Var.call((Throwable) obj, message.f56011id);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m176986U3(final d30 d30Var) {
        if (this.f156833Z == null) {
            this.f156833Z = C22306c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.axa
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72136a.m176978M3(d30Var, (Long) obj);
                }
            }, new e30() { // from class: l.bxa
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77773a.m176977L3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v3 */
    public C22306c<roj0> m176987v3(final String str, final String str2, final f30<Throwable, String> f30Var) {
        final String str3 = "{\"bizType\": \"spotLight\", \"other\": \"" + str + "\", \"me\":\"" + CoreModule.f17545c.f19639e0.m169527p9().f56011id + "\"}";
        return this.f72126Q.scheduled("spotForceLike", -1, new v9j() { // from class: l.gxa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f104845a.m176968C3(str3, str, str2, f30Var);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m176988w3(AnimEffectPlayer animEffectPlayer) {
        long jLongValue = this.f156830W.get().longValue();
        long jM155944o = mqi0.m155944o();
        boolean z = true;
        int iAbs = 8;
        if (jLongValue == 0) {
            this.f156830W.put(Long.valueOf(jM155944o));
        } else {
            boolean zM155928C = mqi0.m155928C(jM155944o, jLongValue);
            boolean z2 = !zM155928C;
            long j = jM155944o - jLongValue;
            boolean z3 = Math.abs(j) < 10000;
            if (!zM155928C) {
                this.f156830W.put(Long.valueOf(jM155944o));
            }
            if (z3 && animEffectPlayer.getIsAnimating()) {
                return;
            }
            if (!z3 || animEffectPlayer.getIsAnimating()) {
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
    public C22392a<Optional<roj0>> m176989x3() {
        return this.f156831X;
    }

    /* JADX INFO: renamed from: y3 */
    public C22392a<Pair<Integer, Pair<Float, Integer>>> m176990y3() {
        return this.f156832Y;
    }

    /* JADX INFO: renamed from: z3 */
    public void m176991z3() {
        e51.m114774y(new Runnable() { // from class: l.vwa
            @Override // java.lang.Runnable
            public final void run() {
                this.f183319a.m176969D3();
            }
        });
    }
}
