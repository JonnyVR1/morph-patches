package com.p046p1.mobile.putong.core.api;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.GooglePlaceEnvelope;
import com.p046p1.mobile.putong.core.data.Prediction;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import java.util.ArrayList;
import java.util.Locale;
import p133rx.C22306c;
import p149l.ax6;
import p149l.fgf0;
import p149l.ggi;
import p149l.muw;
import p149l.qnd;
import p149l.uqd0;
import p149l.v9j;
import p149l.w9j;
import p149l.ytw;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q */
/* JADX INFO: loaded from: classes9.dex */
public class C4751q extends ax6 {

    /* JADX INFO: renamed from: R */
    public b f20088R;

    /* JADX INFO: renamed from: S */
    public a f20089S;

    /* JADX INFO: renamed from: T */
    public uqd0 f20090T;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q$a */
    public class a extends fgf0<RoamedLocationData> {
        public a(String str) {
            super("NearByRoamedLocations", new ggi(new qnd("nearby_roamed_locations", "_1", str), -1, RoamedLocationData.PROTOBUF_ADAPTER), new v9j() { // from class: l.tk9
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C22306c.just(RoamedLocationData.new_());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q$b */
    public class b extends fgf0<RoamedLocationData> {
        public b(String str) {
            super("RoamedLocations", new ggi(new qnd("roamed_locations", "_1", str), -1, RoamedLocationData.PROTOBUF_ADAPTER), new v9j() { // from class: l.uk9
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C22306c.just(RoamedLocationData.new_());
                }
            });
        }
    }

    public C4751q(C4732c c4732c) {
        super(c4732c);
        this.f20090T = new uqd0("current_location_city_" + CoreModule.m29931H().userId(), "");
        this.f20088R = new b(CoreModule.m29931H().userId());
        this.f20089S = new a(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<ytw> m34382h3(String str, String str2) {
        final String str3 = C4728a.m31204H("/location/details") + "?place_id=" + str + "&sessiontoken=" + str2 + "&language=" + m34384j3();
        return this.f72126Q.scheduled("place_location_detail", 0, new v9j() { // from class: l.ok9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.sk9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }, GooglePlaceEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.pk9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ytw.m216089b(((GooglePlaceEnvelope) obj).data.place_details_result);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public C22306c<ArrayList<muw>> m34383i3(String str, String str2) {
        final String str3 = C4728a.m31204H("/location/autocomplete") + "?input=" + str + "&sessiontoken=" + str2 + "&language=" + m34384j3();
        return this.f72126Q.scheduled("place_location_autocomplete", 0, new v9j() { // from class: l.lk9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.rk9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }, GooglePlaceEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.mk9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(((GooglePlaceEnvelope) obj).data.autocomplete_response.predictions, new w9j() { // from class: l.qk9
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return muw.m156451a((Prediction) obj2);
                    }
                });
            }
        }).onErrorReturn(new w9j() { // from class: l.nk9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200324f0(new muw[0]);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final String m34384j3() {
        return Locale.getDefault().toLanguageTag();
    }
}
