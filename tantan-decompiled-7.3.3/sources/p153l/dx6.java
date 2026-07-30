package p153l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LastMatchesData;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class dx6 extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22507a<AdvancedSettings> f91067R;

    /* JADX INFO: renamed from: S */
    public C16645a f91068S;

    /* JADX INFO: renamed from: T */
    public jxd0 f91069T;

    /* JADX INFO: renamed from: l.dx6$a */
    public class C16645a extends dyd0<LastMatchesData> {
        public C16645a(String str, LastMatchesData lastMatchesData) {
            super(str, lastMatchesData);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull LastMatchesData lastMatchesData, LastMatchesData lastMatchesData2) {
            return lastMatchesData.equals(lastMatchesData2);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LastMatchesData copyed(LastMatchesData lastMatchesData, @NonNull LastMatchesData lastMatchesData2) {
            return lastMatchesData2.mo225055clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LastMatchesData retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            if (string == null) {
                return (LastMatchesData) this.defaultValue;
            }
            try {
                return LastMatchesData.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
                return (LastMatchesData) this.defaultValue;
            }
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(LastMatchesData lastMatchesData) {
            return pref().edit().putString(this.f111993id, lastMatchesData.toJson());
        }
    }

    public dx6(C4883c c4883c) {
        super(c4883c);
        this.f91067R = C22507a.m222758b();
        this.f91068S = new C16645a("advance_filter_last_matchest_" + CoreModule.m30929H().userId(), null);
        this.f91069T = new jxd0("svip_advanced_filter_home_dot_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<AdvancedSettings> m118445h3() {
        return this.f91067R;
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m118446i3() {
        return !this.f91069T.get().booleanValue();
    }

    /* JADX INFO: renamed from: j3 */
    public AdvancedSettings m118447j3() {
        return this.f91067R.m222761e();
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ uxj0 m118448k3(Envelope envelope) {
        List<AdvancedSettings> list = ((CoreData) envelope.getModuleData(CoreData.class)).advancedSettings;
        if (!jyb.m147479J(list)) {
            this.f91067R.m137019l(list.get(0));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ C22421c m118449l3(final AdvancedSettings advancedSettings) {
        return qi20.m176654a(new pcj() { // from class: l.bx6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/advanced-search-settings?method=patch")).m209038l(z1d0.create(Network.JSON, advancedSettings.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.cx6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84177a.m118448k3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ uxj0 m118450m3(Envelope envelope) {
        List<AdvancedSettings> list = ((CoreData) envelope.getModuleData(CoreData.class)).advancedSettings;
        if (!jyb.m147479J(list)) {
            this.f91067R.m137019l(list.get(0));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22421c m118451n3() {
        return qi20.m176654a(new pcj() { // from class: l.xw6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/advanced-search-settings")).m209028b();
            }
        }).doOnError(new fjf0()).map(new qcj() { // from class: l.yw6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201789a.m118450m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<uxj0> m118452o3(AdvancedSettings advancedSettings, boolean z) {
        AdvancedSettings advancedSettingsM222761e = this.f91067R.m222761e();
        if (advancedSettingsM222761e != null) {
            advancedSettings = advancedSettings.subtract(advancedSettingsM222761e);
        }
        if (advancedSettings == null) {
            return C22421c.just(uxj0.f181467a);
        }
        if (!z) {
            CoreModule.f18264c.f20405m0.m31986C5();
        }
        return m118453p3(advancedSettings).doOnNext(new y20() { // from class: l.zw6
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20405m0.m32168z5(true);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final C22421c<uxj0> m118453p3(final AdvancedSettings advancedSettings) {
        return this.f91137Q.scheduled("advanced_settings", -1, new pcj() { // from class: l.ax6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f73819a.m118449l3(advancedSettings);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22421c<uxj0> m118454q3() {
        return this.f91137Q.scheduled("advanced_discovery", 0, new pcj() { // from class: l.ww6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f191157a.m118451n3();
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public void m118455r3() {
        this.f91069T.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<uxj0> m118456s3() {
        return CoreModule.f18264c.wait("advanced_settings", -1);
    }

    /* JADX INFO: renamed from: t3 */
    public pf60<List<ProfileZodiac>, ProfileZodiac> m118457t3(AdvancedSettings advancedSettings) {
        ProfileZodiac profileZodiac;
        ProfileZodiac profileZodiac2;
        LastMatchesData lastMatchesData = this.f91068S.get();
        if (lastMatchesData == null || tzi0.m193670h(uqb0.f180376H.guessedCurrentServerTime(), lastMatchesData.time, 1)) {
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
            lastMatchesData2.time = uqb0.f180376H.guessedCurrentServerTime();
            lastMatchesData2.zodiac = profileZodiac;
            this.f91068S.put(lastMatchesData2);
            profileZodiac2 = profileZodiac;
        } else {
            profileZodiac2 = lastMatchesData.zodiac;
        }
        return jyb.m147494Y(advancedSettings.zodiacs, profileZodiac2);
    }
}
