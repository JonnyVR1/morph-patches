package p006l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.LastMatchesData;
import com.p1.mobile.putong.data.ProfileZodiac;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import l.bqd0;
import l.e30;
import l.fpd0;
import l.hpd0;
import l.j760;
import l.qqi0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class aw6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public a<AdvancedSettings> f8562R;

    /* JADX INFO: renamed from: S */
    public C0536a f8563S;

    /* JADX INFO: renamed from: T */
    public hpd0 f8564T;

    /* JADX INFO: renamed from: l.aw6$a */
    public class C0536a extends bqd0<LastMatchesData> {
        public C0536a(String str, LastMatchesData lastMatchesData) {
            super(str, lastMatchesData);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull LastMatchesData lastMatchesData, LastMatchesData lastMatchesData2) {
            return lastMatchesData.equals(lastMatchesData2);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LastMatchesData copyed(LastMatchesData lastMatchesData, @NonNull LastMatchesData lastMatchesData2) {
            return lastMatchesData2.clone();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LastMatchesData retrieveValue() {
            String string = pref().getString(((fpd0) this).id, null);
            if (string == null) {
                return (LastMatchesData) ((fpd0) this).defaultValue;
            }
            try {
                return (LastMatchesData) LastMatchesData.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
                return (LastMatchesData) ((fpd0) this).defaultValue;
            }
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(LastMatchesData lastMatchesData) {
            return pref().edit().putString(((fpd0) this).id, lastMatchesData.toJson());
        }
    }

    public aw6(C0158c c0158c) {
        super(c0158c);
        this.f8562R = a.b();
        this.f8563S = new C0536a("advance_filter_last_matchest_" + CoreModule.m1850H().userId(), null);
        this.f8564T = new hpd0("svip_advanced_filter_home_dot_shown_" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: h3 */
    public c<AdvancedSettings> m12308h3() {
        return this.f8562R;
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m12309i3() {
        return !((Boolean) this.f8564T.get()).booleanValue();
    }

    /* JADX INFO: renamed from: j3 */
    public AdvancedSettings m12310j3() {
        return (AdvancedSettings) this.f8562R.e();
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ roj0 m12311k3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).advancedSettings;
        if (!vwb.J(list)) {
            this.f8562R.onNext((AdvancedSettings) list.get(0));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ c m12312l3(final AdvancedSettings advancedSettings) {
        return ia20.m16567a(new v9j() { // from class: l.yv6
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/advanced-search-settings?method=patch")).l(utc0.create(Network.JSON, advancedSettings.toJson())).b();
            }
        }).map(new w9j() { // from class: l.zv6
            public final Object call(Object obj) {
                return this.f28991a.m12311k3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ roj0 m12313m3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).advancedSettings;
        if (!vwb.J(list)) {
            this.f8562R.onNext((AdvancedSettings) list.get(0));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ c m12314n3() {
        return ia20.m16567a(new v9j() { // from class: l.uv6
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/advanced-search-settings")).b();
            }
        }).doOnError(new yaf0()).map(new w9j() { // from class: l.vv6
            public final Object call(Object obj) {
                return this.f24480a.m12313m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public c<roj0> m12315o3(AdvancedSettings advancedSettings, boolean z) {
        AdvancedSettings advancedSettings2 = (AdvancedSettings) this.f8562R.e();
        if (advancedSettings2 != null) {
            advancedSettings = advancedSettings.subtract(advancedSettings2);
        }
        if (advancedSettings == null) {
            return c.just(roj0.a);
        }
        if (!z) {
            CoreModule.f1534c.f3652m0.m2913C5();
        }
        return m12316p3(advancedSettings).doOnNext(new e30() { // from class: l.wv6
            public final void call(Object obj) {
                CoreModule.f1534c.f3652m0.m3095z5(true);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final c<roj0> m12316p3(final AdvancedSettings advancedSettings) {
        return this.f8580Q.scheduled("advanced_settings", -1, new v9j() { // from class: l.xv6
            public final Object call() {
                return this.f27732a.m12312l3(advancedSettings);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public c<roj0> m12317q3() {
        return this.f8580Q.scheduled("advanced_discovery", 0, new v9j() { // from class: l.tv6
            public final Object call() {
                return this.f22288a.m12314n3();
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public void m12318r3() {
        this.f8564T.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s3 */
    public c<roj0> m12319s3() {
        return CoreModule.f1534c.wait("advanced_settings", -1);
    }

    /* JADX INFO: renamed from: t3 */
    public j760<List<ProfileZodiac>, ProfileZodiac> m12320t3(AdvancedSettings advancedSettings) {
        ProfileZodiac profileZodiac;
        ProfileZodiac profileZodiac2;
        LastMatchesData lastMatchesData = (LastMatchesData) this.f8563S.get();
        if (lastMatchesData == null || qqi0.h(qib0.f19784H.guessedCurrentServerTime(), lastMatchesData.time, 1)) {
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
                case CameraSticker.STATE_COMPLETE /* 3 */:
                    profileZodiac = ProfileZodiac.get("cancer");
                    break;
                case CameraSticker.STATE_ERROR /* 4 */:
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
            lastMatchesData2.time = qib0.f19784H.guessedCurrentServerTime();
            lastMatchesData2.zodiac = profileZodiac;
            this.f8563S.put(lastMatchesData2);
            profileZodiac2 = profileZodiac;
        } else {
            profileZodiac2 = lastMatchesData.zodiac;
        }
        return vwb.Y(advancedSettings.zodiacs, profileZodiac2);
    }
}
