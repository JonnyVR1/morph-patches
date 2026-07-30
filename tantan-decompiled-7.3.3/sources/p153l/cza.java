package p153l;

import android.util.Pair;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.data.HasSpotLightData;
import com.p051p1.mobile.putong.core.data.HasSpotLightEnvelope;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.SpotLightForceMatchEnvelope;
import com.p051p1.mobile.putong.core.data.StartSpotLightData;
import com.p051p1.mobile.putong.core.data.StartSpotLightEnvelope;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class cza extends dy6 {

    /* JADX INFO: renamed from: R */
    public int f84441R;

    /* JADX INFO: renamed from: S */
    public float f84442S;

    /* JADX INFO: renamed from: T */
    public StartSpotLightData f84443T;

    /* JADX INFO: renamed from: U */
    public CoreAssetsSettings f84444U;

    /* JADX INFO: renamed from: V */
    public byd0 f84445V;

    /* JADX INFO: renamed from: W */
    public byd0 f84446W;

    /* JADX INFO: renamed from: X */
    public final C22507a<Optional<uxj0>> f84447X;

    /* JADX INFO: renamed from: Y */
    public final C22507a<Pair<Integer, Pair<Float, Integer>>> f84448Y;

    /* JADX INFO: renamed from: Z */
    public kcg0 f84449Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f84450a0;

    /* JADX INFO: renamed from: b0 */
    public int f84451b0;

    public cza(C4883c c4883c) {
        super(c4883c);
        this.f84441R = 0;
        this.f84442S = 0.0f;
        this.f84444U = CoreAssetsSettings.new_();
        this.f84445V = new byd0("spot_last_time", 0L);
        this.f84446W = new byd0("last_spotlight_anim_show_time_" + CoreModule.m30929H().userId(), 0L);
        this.f84447X = C22507a.m222759c(Optional.absent());
        this.f84448Y = C22507a.m222758b();
        this.f84451b0 = 0;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m113272a3(Conversation conversation) {
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.read = Boolean.TRUE;
        CoreModule.f18264c.f20384f0.m34053mq(conversationMo225055clone);
    }

    /* JADX INFO: renamed from: A3 */
    public C22421c<HasSpotLightData> m113293A3() {
        return this.f91137Q.scheduled("giving_spot_light", 0, new pcj() { // from class: l.zya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.aza
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32252T(CoreModule.m30929H().userId())).m209032f().m209028b();
                    }
                }, HasSpotLightEnvelope.JSON_ADAPTER).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.bza
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((HasSpotLightEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ uxj0 m113294B3(String str, String str2, z20 z20Var, SpotLightForceMatchEnvelope spotLightForceMatchEnvelope) {
        C22507a<Optional<uxj0>> c22507aM113316x3 = m113316x3();
        uxj0 uxj0Var = uxj0.f181467a;
        c22507aM113316x3.m137019l(Optional.m15467of(uxj0Var));
        m113312T3(str, str2, z20Var);
        return uxj0Var;
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ C22421c m113295C3(final String str, final String str2, final String str3, final z20 z20Var) {
        return qi20.m176656c(new pcj() { // from class: l.xya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32301f2()).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }, SpotLightForceMatchEnvelope.JSON_ADAPTER).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.yya
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f202091a.m113294B3(str2, str3, z20Var, (SpotLightForceMatchEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m113296D3() {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = CoreModule.f18263b.getResources().getAssets().open("spotlight_message_suggestions.json");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    inputStreamOpen.close();
                    this.f84444U = CoreAssetsSettings.JSON_ADAPTER.parse(sb.toString());
                    return;
                }
                sb.append(line);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ uxj0 m113297E3(boolean z, x20 x20Var, StartSpotLightEnvelope startSpotLightEnvelope) {
        this.f84443T = startSpotLightEnvelope.data;
        m113308P3();
        if (z) {
            this.f91137Q.f20312H0.m155449k5();
        }
        this.f91137Q.f20297C0.m146428y4();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ C22421c m113298F3(final String str, final boolean z, final x20 x20Var) {
        return qi20.m176656c(new pcj() { // from class: l.vya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32305g2(CoreModule.m30929H().userId())).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }, StartSpotLightEnvelope.JSON_ADAPTER).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.wya
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f191579a.m113297E3(z, x20Var, (StartSpotLightEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ uxj0 m113299G3(StartSpotLightEnvelope startSpotLightEnvelope) {
        StartSpotLightData startSpotLightData = startSpotLightEnvelope.data;
        this.f84450a0 = true;
        this.f84443T = startSpotLightData;
        m113308P3();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ C22421c m113300H3() {
        return qi20.m176656c(new pcj() { // from class: l.qya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32313i2(CoreModule.m30929H().userId())).m209032f().m209028b();
            }
        }, StartSpotLightEnvelope.JSON_ADAPTER).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.rya
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165419a.m113299G3((StartSpotLightEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ C22421c m113301I3(String str, Message message, uxj0 uxj0Var) {
        return this.f91137Q.f20384f0.m33652Fn(str, message, null, false, false);
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m113302J3(final Conversation conversation) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.tya
            @Override // p153l.x20
            public final void call() {
                cza.m113272a3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m113303K3(String str, z20 z20Var, C22421c c22421c) {
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        if (NullChecker.m82486a(conversationM33859Xe)) {
            l51.m152919y(new Runnable() { // from class: l.pya
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154624a.m113302J3(conversationM33859Xe);
                }
            });
        }
        z20Var.call(null, "");
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m113304L3(Throwable th) {
        m113311S3();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m113305M3(x20 x20Var, Long l2) {
        this.f84451b0 += 500;
        x20Var.call();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m113306N3(int i, Float f, Integer num) {
        this.f84442S = f.floatValue();
        this.f84448Y.m137019l(Pair.create(Integer.valueOf(i), Pair.create(f, num)));
    }

    /* JADX INFO: renamed from: O3 */
    public void m113307O3(final x20 x20Var, final boolean z, boolean z2) {
        final String str = "{\"active\": true, \"privilegeType\": \"spotLight\", \"consumeType\": \"" + lqb.m155388i4(z2) + "\",\"mcc\": \"" + uqb0.f180400f0 + "\", \"reginTag\":\"" + uqb0.f180402h0 + "\", \"CoinSign\":\"" + this.f91137Q.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight)) + "\"}";
        this.f91137Q.scheduled("patch_super_boost_start", -1, new pcj() { // from class: l.uya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f181551a.m113298F3(str, z, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final void m113308P3() {
        Float fValueOf = Float.valueOf(0.0f);
        if (this.f84450a0) {
            this.f84451b0 = 0;
            m113311S3();
            this.f84450a0 = false;
        }
        StartSpotLightData startSpotLightData = this.f84443T;
        if (!startSpotLightData.active) {
            this.f84441R = 0;
            m113306N3(0, fValueOf, 0);
            return;
        }
        int i = startSpotLightData.remain;
        if (i - this.f84451b0 <= 0) {
            this.f84441R = 0;
            m113306N3(0, fValueOf, 0);
            m113309Q3();
            m113311S3();
            return;
        }
        m113313U3(new x20() { // from class: l.lya
            @Override // p153l.x20
            public final void call() {
                this.f134046a.m113308P3();
            }
        });
        long j = this.f84443T.duration;
        int i2 = (int) ((j - ((long) i)) + ((long) this.f84451b0));
        int i3 = i2 > 0 ? i2 : 0;
        this.f84441R = 1;
        m113306N3(1, Float.valueOf((i3 * 360.0f) / j), Integer.valueOf(i - this.f84451b0));
    }

    /* JADX INFO: renamed from: Q3 */
    public void m113309Q3() {
        this.f91137Q.scheduled("patch_super_boost_status", -1, new pcj() { // from class: l.oya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f149780a.m113300H3();
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void m113310R3() {
        m113311S3();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m113311S3() {
        if (NullChecker.m82486a(this.f84449Z)) {
            psd0.m173633z(this.f84449Z);
            this.f84449Z = null;
        }
    }

    /* JADX INFO: renamed from: T3 */
    public void m113312T3(final String str, String str2, final z20<Throwable, String> z20Var) {
        final Message message = new Message();
        message.value = str2;
        message.messageType = MessageType.get("text");
        this.f91137Q.f20384f0.m33653Fo().map(new qcj() { // from class: l.iya
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f117529a.m113301I3(str, message, (uxj0) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.jya
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123121a.m113303K3(str, z20Var, (C22421c) obj);
            }
        }, new y20() { // from class: l.kya
            @Override // p153l.y20
            public final void call(Object obj) {
                z20Var.call((Throwable) obj, message.f56859id);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m113313U3(final x20 x20Var) {
        if (this.f84449Z == null) {
            this.f84449Z = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.mya
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139340a.m113305M3(x20Var, (Long) obj);
                }
            }, new y20() { // from class: l.nya
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144298a.m113304L3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<uxj0> m113314v3(final String str, final String str2, final z20<Throwable, String> z20Var) {
        final String str3 = "{\"bizType\": \"spotLight\", \"other\": \"" + str + "\", \"me\":\"" + CoreModule.f18264c.f20381e0.m116600p9().f56859id + "\"}";
        return this.f91137Q.scheduled("spotForceLike", -1, new pcj() { // from class: l.sya
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f171219a.m113295C3(str3, str, str2, z20Var);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m113315w3(AnimEffectPlayer animEffectPlayer) {
        long jLongValue = this.f84446W.get().longValue();
        long jM174454o = pzi0.m174454o();
        boolean z = true;
        int iAbs = 8;
        if (jLongValue == 0) {
            this.f84446W.put(Long.valueOf(jM174454o));
        } else {
            boolean zM174438C = pzi0.m174438C(jM174454o, jLongValue);
            boolean z2 = !zM174438C;
            long j = jM174454o - jLongValue;
            boolean z3 = Math.abs(j) < 10000;
            if (!zM174438C) {
                this.f84446W.put(Long.valueOf(jM174454o));
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
    public C22507a<Optional<uxj0>> m113316x3() {
        return this.f84447X;
    }

    /* JADX INFO: renamed from: y3 */
    public C22507a<Pair<Integer, Pair<Float, Integer>>> m113317y3() {
        return this.f84448Y;
    }

    /* JADX INFO: renamed from: z3 */
    public void m113318z3() {
        l51.m152919y(new Runnable() { // from class: l.hya
            @Override // java.lang.Runnable
            public final void run() {
                this.f112104a.m113296D3();
            }
        });
    }
}
