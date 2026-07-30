package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiBoundSearchOption;
import com.baidu.mapapi.search.poi.PoiCitySearchOption;
import com.baidu.mapapi.search.poi.PoiSearch;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.baidu.mapapi.utils.DistanceUtil;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.map.MapPoiItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class me3 extends wp1<PoiInfo> implements OnGetGeoCoderResultListener, OnGetPoiSearchResultListener {

    /* JADX INFO: renamed from: c */
    public ftw f133339c;

    /* JADX INFO: renamed from: d */
    public Act f133340d;

    /* JADX INFO: renamed from: e */
    public boolean f133341e;

    /* JADX INFO: renamed from: h */
    public PoiInfo f133344h;

    /* JADX INFO: renamed from: i */
    public PoiInfo f133345i;

    /* JADX INFO: renamed from: m */
    public String f133349m;

    /* JADX INFO: renamed from: n */
    public String f133350n;

    /* JADX INFO: renamed from: o */
    public Overlay f133351o;

    /* JADX INFO: renamed from: s */
    public LatLng f133355s;

    /* JADX INFO: renamed from: g */
    public boolean f133343g = true;

    /* JADX INFO: renamed from: j */
    public LatLng f133346j = null;

    /* JADX INFO: renamed from: k */
    public LatLng f133347k = null;

    /* JADX INFO: renamed from: l */
    public LatLngBounds f133348l = null;

    /* JADX INFO: renamed from: p */
    public int f133352p = 0;

    /* JADX INFO: renamed from: q */
    public boolean f133353q = false;

    /* JADX INFO: renamed from: r */
    public Comparator<PoiInfo> f133354r = new Comparator() { // from class: l.ke3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return this.f122666a.m154125w((PoiInfo) obj, (PoiInfo) obj2);
        }
    };

    /* JADX INFO: renamed from: f */
    public List<PoiInfo> f133342f = new ArrayList();

    public me3(ftw ftwVar, Act act) {
        this.f133339c = ftwVar;
        this.f133340d = act;
    }

    /* JADX INFO: renamed from: A */
    public double m154115A(double d) {
        return Math.min(90.0d, Math.max(d, -90.0d));
    }

    /* JADX INFO: renamed from: B */
    public LatLng m154116B(LatLng latLng) {
        return new LatLng(m154115A(latLng.latitude), m154117C(latLng.longitude));
    }

    /* JADX INFO: renamed from: C */
    public double m154117C(double d) {
        return Math.min(180.0d, Math.max(d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }

    /* JADX INFO: renamed from: D */
    public void m154118D(int i) {
        if (this.f133339c.m123117q0()) {
            return;
        }
        if (i != -1) {
            this.f133339c.m123113O0(0);
            m154122H(this.f133342f.get(i).location, false);
            MapStatus mapStatus = this.f133339c.f99281h.getMapStatus();
            float fMax = mapStatus == null ? 0.0f : mapStatus.zoom;
            if (fMax < 16.5d || fMax > 18.0f) {
                fMax = Math.max(fMax, 18.0f);
            }
            this.f133339c.f99281h.animateMapStatus(MapStatusUpdateFactory.newLatLngZoom(this.f133342f.get(i).location, fMax));
            this.f133355s = this.f133342f.get(i).location;
            PoiInfo poiInfo = this.f133342f.get(i);
            List<PoiInfo> list = this.f133342f;
            list.set(i, list.get(0));
            this.f133342f.set(0, poiInfo);
        } else if (NullChecker.m81303a(this.f133344h)) {
            m154122H(this.f133344h.location, true);
            this.f133339c.f99281h.animateMapStatus(MapStatusUpdateFactory.newLatLng(this.f133346j));
            this.f133355s = this.f133344h.location;
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m154119E(LatLng latLng) {
        this.f133339c.m123112N0(true);
        this.f133339c.m123107G0();
        this.f133343g = true;
        this.f133341e = true;
        this.f133346j = latLng;
        this.f133355s = latLng;
        this.f133348l = m154127z(latLng);
        PoiInfo poiInfo = new PoiInfo();
        this.f133344h = poiInfo;
        poiInfo.name = this.f133340d.getString(R$string.f18671kh);
        this.f133344h.location = this.f133346j;
        this.f133352p = 0;
        this.f133349m = "";
        this.f133353q = false;
        this.f133339c.f99284k.reverseGeoCode(new ReverseGeoCodeOption().location(latLng));
        this.f133339c.f99285l.searchInBound(new PoiBoundSearchOption().bound(this.f133348l).keyword("美食").pageCapacity(19));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m154120F() {
        if (this.f133340d.lifecycle_() == C4319c.f15552m || this.f133340d.isFinishing()) {
            return;
        }
        if (NullChecker.m81303a(this.f133346j) && this.f133339c.m123106F0(this.f133346j, this.f133355s)) {
            m154118D(-1);
            return;
        }
        int iM200293G = vwb.m200293G(this.f133342f, new w9j() { // from class: l.le3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127644a.m154126y((PoiInfo) obj);
            }
        });
        if (iM200293G >= 0) {
            m154118D(iM200293G);
        }
    }

    /* JADX INFO: renamed from: G */
    public LatLng m154121G() {
        return this.f133339c.m123117q0() ? this.f133347k : this.f133355s;
    }

    /* JADX INFO: renamed from: H */
    public final void m154122H(LatLng latLng, boolean z) {
        Overlay overlay = this.f133351o;
        if (z) {
            if (NullChecker.m81303a(overlay)) {
                this.f133351o.remove();
                this.f133351o = null;
                return;
            }
            return;
        }
        if (NullChecker.m81303a(overlay)) {
            this.f133351o.remove();
            this.f133351o = null;
        }
        if (NullChecker.m81303a(latLng)) {
            this.f133351o = this.f133339c.f99281h.addOverlay(new MarkerOptions().icon(this.f133339c.m123118r0()).anchor(0.5f, 0.5f).position(latLng).draggable(false));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m154123I(SuggestionResult.SuggestionInfo suggestionInfo, String str, boolean z) {
        if (this.f133339c.m123117q0()) {
            this.f133339c.m123114P0(false);
        }
        this.f133339c.m123112N0(false);
        this.f133339c.m123107G0();
        this.f133343g = true;
        this.f133341e = false;
        this.f133349m = suggestionInfo.key;
        this.f133350n = str;
        this.f133342f = vwb.m200324f0(new PoiInfo[0]);
        notifyDataSetChanged();
        this.f133355s = null;
        PoiSearch poiSearch = this.f133339c.f99285l;
        PoiCitySearchOption poiCitySearchOption = new PoiCitySearchOption();
        String str2 = this.f133350n;
        if (str2 == null) {
            str2 = "";
        }
        poiSearch.searchInCity(poiCitySearchOption.city(str2).keyword(this.f133349m).cityLimit(!z).pageCapacity(20));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f133342f.size() + (this.f133343g ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.f133342f.size()) {
            return this.f133342f.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i == this.f133342f.size() ? 1 : 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f133339c.m123119s0(viewGroup, i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        ftw ftwVar = this.f133339c;
        ftwVar.m123108H0(this.f133342f, this.f133344h, 0, -1, ftwVar.m123106F0(this.f133346j, this.f133355s));
        super.notifyDataSetChanged();
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, PoiInfo poiInfo, int i, int i2) {
        if (i == 0) {
            ((MapPoiItem) view).m47374R(poiInfo, (int) DistanceUtil.getDistance(poiInfo.location, this.f133346j), i2, this.f133339c.m123106F0(poiInfo.location, this.f133355s));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int m154125w(PoiInfo poiInfo, PoiInfo poiInfo2) {
        LatLng latLng = this.f133346j;
        LatLng latLng2 = poiInfo.location;
        LatLng latLng3 = poiInfo2.location;
        double distance = DistanceUtil.getDistance(latLng2, latLng);
        double distance2 = DistanceUtil.getDistance(latLng3, latLng);
        if (distance != distance2) {
            return (int) (distance - distance2);
        }
        if (latLng2.latitude == latLng3.latitude) {
            return latLng2.longitude > latLng3.longitude ? 1 : -1;
        }
        return latLng2.latitude > latLng3.latitude ? 1 : -1;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Boolean m154126y(PoiInfo poiInfo) {
        return Boolean.valueOf(this.f133339c.m123106F0(this.f133355s, poiInfo.location));
    }

    /* JADX INFO: renamed from: z */
    public LatLngBounds m154127z(LatLng latLng) {
        return new LatLngBounds.Builder().include(m154116B(new LatLng(latLng.latitude - 1.0d, latLng.longitude - 1.0d))).include(m154116B(new LatLng(latLng.latitude + 1.0d, latLng.longitude + 1.0d))).build();
    }
}
