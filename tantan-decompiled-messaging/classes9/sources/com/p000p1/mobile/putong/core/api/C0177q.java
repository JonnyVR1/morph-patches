package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.GooglePlaceEnvelope;
import com.p1.mobile.putong.core.data.Prediction;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import java.util.ArrayList;
import java.util.Locale;
import l.fgf0;
import l.ggi;
import l.muw;
import l.uqd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.ytw;
import p006l.ax6;
import p006l.qnd;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0177q extends ax6 {

    /* JADX INFO: renamed from: R */
    public b f4077R;

    /* JADX INFO: renamed from: S */
    public a f4078S;

    /* JADX INFO: renamed from: T */
    public uqd0 f4079T;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q$a */
    public class a extends fgf0<RoamedLocationData> {
        public a(String str) {
            super("NearByRoamedLocations", new ggi(new qnd("nearby_roamed_locations", "_1", str), -1, RoamedLocationData.PROTOBUF_ADAPTER), new v9j() { // from class: l.tk9
                public final Object call() {
                    return c.just(RoamedLocationData.new_());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q$b */
    public class b extends fgf0<RoamedLocationData> {
        public b(String str) {
            super("RoamedLocations", new ggi(new qnd("roamed_locations", "_1", str), -1, RoamedLocationData.PROTOBUF_ADAPTER), new v9j() { // from class: l.uk9
                public final Object call() {
                    return c.just(RoamedLocationData.new_());
                }
            });
        }
    }

    public C0177q(C0158c c0158c) {
        super(c0158c);
        this.f4079T = new uqd0("current_location_city_" + CoreModule.m1850H().userId(), "");
        this.f4077R = new b(CoreModule.m1850H().userId());
        this.f4078S = new a(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: h3 */
    public c<ytw> m6319h3(String str, String str2) {
        final String str3 = C0154a.m3134H("/location/details") + "?place_id=" + str + "&sessiontoken=" + str2 + "&language=" + m6321j3();
        return this.f8580Q.scheduled("place_location_detail", 0, new v9j() { // from class: l.ok9
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.sk9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }, GooglePlaceEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.pk9
            public final Object call(Object obj) {
                return ytw.b(((GooglePlaceEnvelope) obj).data.place_details_result);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public c<ArrayList<muw>> m6320i3(String str, String str2) {
        final String str3 = C0154a.m3134H("/location/autocomplete") + "?input=" + str + "&sessiontoken=" + str2 + "&language=" + m6321j3();
        return this.f8580Q.scheduled("place_location_autocomplete", 0, new v9j() { // from class: l.lk9
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.rk9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }, GooglePlaceEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.mk9
            public final Object call(Object obj) {
                return vwb.Q(((GooglePlaceEnvelope) obj).data.autocomplete_response.predictions, new w9j() { // from class: l.qk9
                    public final Object call(Object obj2) {
                        return muw.a((Prediction) obj2);
                    }
                });
            }
        }).onErrorReturn(new w9j() { // from class: l.nk9
            public final Object call(Object obj) {
                return vwb.f0(new muw[0]);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final String m6321j3() {
        return Locale.getDefault().toLanguageTag();
    }
}
