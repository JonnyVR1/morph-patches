package p149l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LastMatchesData;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class aw6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22392a<AdvancedSettings> f72018R;

    /* JADX INFO: renamed from: S */
    public C15737a f72019S;

    /* JADX INFO: renamed from: T */
    public hpd0 f72020T;

    /* JADX INFO: renamed from: l.aw6$a */
    public class C15737a extends bqd0<LastMatchesData> {
        public C15737a(String str, LastMatchesData lastMatchesData) {
            super(str, lastMatchesData);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull LastMatchesData lastMatchesData, LastMatchesData lastMatchesData2) {
            return lastMatchesData.equals(lastMatchesData2);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LastMatchesData copyed(LastMatchesData lastMatchesData, @NonNull LastMatchesData lastMatchesData2) {
            return lastMatchesData2.mo223809clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LastMatchesData retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            if (string == null) {
                return (LastMatchesData) this.defaultValue;
            }
            try {
                return LastMatchesData.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
                return (LastMatchesData) this.defaultValue;
            }
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(LastMatchesData lastMatchesData) {
            return pref().edit().putString(this.f98687id, lastMatchesData.toJson());
        }
    }

    public aw6(C4732c c4732c) {
        super(c4732c);
        this.f72018R = C22392a.m221512b();
        this.f72019S = new C15737a("advance_filter_last_matchest_" + CoreModule.m29931H().userId(), null);
        this.f72020T = new hpd0("svip_advanced_filter_home_dot_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<AdvancedSettings> m99241h3() {
        return this.f72018R;
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m99242i3() {
        return !this.f72020T.get().booleanValue();
    }

    /* JADX INFO: renamed from: j3 */
    public AdvancedSettings m99243j3() {
        return this.f72018R.m221515e();
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ roj0 m99244k3(Envelope envelope) {
        List<AdvancedSettings> list = ((CoreData) envelope.getModuleData(CoreData.class)).advancedSettings;
        if (!vwb.m200296J(list)) {
            this.f72018R.m132487l(list.get(0));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ C22306c m99245l3(final AdvancedSettings advancedSettings) {
        return ia20.m135117a(new v9j() { // from class: l.yv6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/advanced-search-settings?method=patch")).m185893l(utc0.create(Network.JSON, advancedSettings.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.zv6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204969a.m99244k3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ roj0 m99246m3(Envelope envelope) {
        List<AdvancedSettings> list = ((CoreData) envelope.getModuleData(CoreData.class)).advancedSettings;
        if (!vwb.m200296J(list)) {
            this.f72018R.m132487l(list.get(0));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22306c m99247n3() {
        return ia20.m135117a(new v9j() { // from class: l.uv6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/advanced-search-settings")).m185883b();
            }
        }).doOnError(new yaf0()).map(new w9j() { // from class: l.vv6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183196a.m99246m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<roj0> m99248o3(AdvancedSettings advancedSettings, boolean z) {
        AdvancedSettings advancedSettingsM221515e = this.f72018R.m221515e();
        if (advancedSettingsM221515e != null) {
            advancedSettings = advancedSettings.subtract(advancedSettingsM221515e);
        }
        if (advancedSettings == null) {
            return C22306c.just(roj0.f160388a);
        }
        if (!z) {
            CoreModule.f17545c.f19663m0.m30983C5();
        }
        return m99249p3(advancedSettings).doOnNext(new e30() { // from class: l.wv6
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19663m0.m31165z5(true);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final C22306c<roj0> m99249p3(final AdvancedSettings advancedSettings) {
        return this.f72126Q.scheduled("advanced_settings", -1, new v9j() { // from class: l.xv6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194581a.m99245l3(advancedSettings);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22306c<roj0> m99250q3() {
        return this.f72126Q.scheduled("advanced_discovery", 0, new v9j() { // from class: l.tv6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f172263a.m99247n3();
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public void m99251r3() {
        this.f72020T.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<roj0> m99252s3() {
        return CoreModule.f17545c.wait("advanced_settings", -1);
    }

    /* JADX INFO: renamed from: t3 */
    public j760<List<ProfileZodiac>, ProfileZodiac> m99253t3(AdvancedSettings advancedSettings) {
        ProfileZodiac profileZodiac;
        ProfileZodiac profileZodiac2;
        LastMatchesData lastMatchesData = this.f72019S.get();
        if (lastMatchesData == null || qqi0.m175940h(qib0.f154693H.guessedCurrentServerTime(), lastMatchesData.time, 1)) {
            switch (new Random().nextInt(12)) {
                case 0:
                    profileZodiac = ProfileZodiac.get("aries");
                    break;
                case 1:
                    profileZodiac = ProfileZodiac.get("virgo");
                    break;
                case 2:
                    profileZodiac = ProfileZodiac.get("taurus");
                    break;
                case 3:
                    profileZodiac = ProfileZodiac.get("cancer");
                    break;
                case 4:
                    profileZodiac = ProfileZodiac.get("capricorn");
                    break;
                case 5:
                    profileZodiac = ProfileZodiac.get("sagittarius");
                    break;
                case 6:
                    profileZodiac = ProfileZodiac.get("leo");
                    break;
                case 7:
                    profileZodiac = ProfileZodiac.get("pisces");
                    break;
                case 8:
                    profileZodiac = ProfileZodiac.get("gemini");
                    break;
                case 9:
                    profileZodiac = ProfileZodiac.get("aquarius");
                    break;
                case 10:
                    profileZodiac = ProfileZodiac.get("libra");
                    break;
                default:
                    profileZodiac = ProfileZodiac.get("scorpio");
                    break;
            }
            LastMatchesData lastMatchesData2 = new LastMatchesData();
            lastMatchesData2.time = qib0.f154693H.guessedCurrentServerTime();
            lastMatchesData2.zodiac = profileZodiac;
            this.f72019S.put(lastMatchesData2);
            profileZodiac2 = profileZodiac;
        } else {
            profileZodiac2 = lastMatchesData.zodiac;
        }
        return vwb.m200311Y(advancedSettings.zodiacs, profileZodiac2);
    }
}
