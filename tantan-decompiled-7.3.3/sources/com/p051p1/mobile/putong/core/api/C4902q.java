package com.p051p1.mobile.putong.core.api;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.GooglePlaceEnvelope;
import com.p051p1.mobile.putong.core.data.Prediction;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import java.util.ArrayList;
import java.util.Locale;
import p137rx.C22421c;
import p153l.dji;
import p153l.dy6;
import p153l.lxw;
import p153l.mof0;
import p153l.pcj;
import p153l.qcj;
import p153l.vod;
import p153l.wyd0;
import p153l.xww;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q */
/* JADX INFO: loaded from: classes9.dex */
public class C4902q extends dy6 {

    /* JADX INFO: renamed from: R */
    public b f20830R;

    /* JADX INFO: renamed from: S */
    public a f20831S;

    /* JADX INFO: renamed from: T */
    public wyd0 f20832T;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q$a */
    public class a extends mof0<RoamedLocationData> {
        public a(String str) {
            super("NearByRoamedLocations", new dji(new vod("nearby_roamed_locations", "_1", str), -1, RoamedLocationData.PROTOBUF_ADAPTER), new pcj() { // from class: l.cm9
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C22421c.just(RoamedLocationData.new_());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.q$b */
    public class b extends mof0<RoamedLocationData> {
        public b(String str) {
            super("RoamedLocations", new dji(new vod("roamed_locations", "_1", str), -1, RoamedLocationData.PROTOBUF_ADAPTER), new pcj() { // from class: l.dm9
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C22421c.just(RoamedLocationData.new_());
                }
            });
        }
    }

    public C4902q(C4883c c4883c) {
        super(c4883c);
        this.f20832T = new wyd0("current_location_city_" + CoreModule.m30929H().userId(), "");
        this.f20830R = new b(CoreModule.m30929H().userId());
        this.f20831S = new a(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<xww> m35385h3(String str, String str2) {
        final String str3 = C4879a.m32207H("/location/details") + "?place_id=" + str + "&sessiontoken=" + str2 + "&language=" + m35387j3();
        return this.f91137Q.scheduled("place_location_detail", 0, new pcj() { // from class: l.xl9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.bm9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }, GooglePlaceEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.yl9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xww.m213447b(((GooglePlaceEnvelope) obj).data.place_details_result);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public C22421c<ArrayList<lxw>> m35386i3(String str, String str2) {
        final String str3 = C4879a.m32207H("/location/autocomplete") + "?input=" + str + "&sessiontoken=" + str2 + "&language=" + m35387j3();
        return this.f91137Q.scheduled("place_location_autocomplete", 0, new pcj() { // from class: l.ul9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.am9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }, GooglePlaceEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.vl9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(((GooglePlaceEnvelope) obj).data.autocomplete_response.predictions, new qcj() { // from class: l.zl9
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return lxw.m156250a((Prediction) obj2);
                    }
                });
            }
        }).onErrorReturn(new qcj() { // from class: l.wl9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147507f0(new lxw[0]);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final String m35387j3() {
        return Locale.getDefault().toLanguageTag();
    }
}
