package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.map.MapPoiItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bf3 extends dq1<PoiInfo> implements OnGetGeoCoderResultListener, OnGetPoiSearchResultListener {

    /* JADX INFO: renamed from: c */
    public eww f76430c;

    /* JADX INFO: renamed from: d */
    public Act f76431d;

    /* JADX INFO: renamed from: e */
    public boolean f76432e;

    /* JADX INFO: renamed from: h */
    public PoiInfo f76435h;

    /* JADX INFO: renamed from: i */
    public PoiInfo f76436i;

    /* JADX INFO: renamed from: m */
    public String f76440m;

    /* JADX INFO: renamed from: n */
    public String f76441n;

    /* JADX INFO: renamed from: o */
    public Overlay f76442o;

    /* JADX INFO: renamed from: s */
    public LatLng f76446s;

    /* JADX INFO: renamed from: g */
    public boolean f76434g = true;

    /* JADX INFO: renamed from: j */
    public LatLng f76437j = null;

    /* JADX INFO: renamed from: k */
    public LatLng f76438k = null;

    /* JADX INFO: renamed from: l */
    public LatLngBounds f76439l = null;

    /* JADX INFO: renamed from: p */
    public int f76443p = 0;

    /* JADX INFO: renamed from: q */
    public boolean f76444q = false;

    /* JADX INFO: renamed from: r */
    public Comparator<PoiInfo> f76445r = new Comparator() { // from class: l.ze3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return this.f203972a.m103869w((PoiInfo) obj, (PoiInfo) obj2);
        }
    };

    /* JADX INFO: renamed from: f */
    public List<PoiInfo> f76433f = new ArrayList();

    public bf3(eww ewwVar, Act act) {
        this.f76430c = ewwVar;
        this.f76431d = act;
    }

    /* JADX INFO: renamed from: A */
    public double m103859A(double d) {
        return Math.min(90.0d, Math.max(d, -90.0d));
    }

    /* JADX INFO: renamed from: B */
    public LatLng m103860B(LatLng latLng) {
        return new LatLng(m103859A(latLng.latitude), m103861C(latLng.longitude));
    }

    /* JADX INFO: renamed from: C */
    public double m103861C(double d) {
        return Math.min(180.0d, Math.max(d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }

    /* JADX INFO: renamed from: D */
    public void m103862D(int i) {
        if (this.f76430c.m122988q0()) {
            return;
        }
        if (i != -1) {
            this.f76430c.m122984O0(0);
            m103866H(this.f76433f.get(i).location, false);
            MapStatus mapStatus = this.f76430c.f96210h.getMapStatus();
            float fMax = mapStatus == null ? 0.0f : mapStatus.zoom;
            if (fMax < 16.5d || fMax > 18.0f) {
                fMax = Math.max(fMax, 18.0f);
            }
            this.f76430c.f96210h.animateMapStatus(MapStatusUpdateFactory.newLatLngZoom(this.f76433f.get(i).location, fMax));
            this.f76446s = this.f76433f.get(i).location;
            PoiInfo poiInfo = this.f76433f.get(i);
            List<PoiInfo> list = this.f76433f;
            list.set(i, list.get(0));
            this.f76433f.set(0, poiInfo);
        } else if (NullChecker.m82486a(this.f76435h)) {
            m103866H(this.f76435h.location, true);
            this.f76430c.f96210h.animateMapStatus(MapStatusUpdateFactory.newLatLng(this.f76437j));
            this.f76446s = this.f76435h.location;
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m103863E(LatLng latLng) {
        this.f76430c.m122983N0(true);
        this.f76430c.m122978G0();
        this.f76434g = true;
        this.f76432e = true;
        this.f76437j = latLng;
        this.f76446s = latLng;
        this.f76439l = m103871z(latLng);
        PoiInfo poiInfo = new PoiInfo();
        this.f76435h = poiInfo;
        poiInfo.name = this.f76431d.getString(R$string.f18458Fh);
        this.f76435h.location = this.f76437j;
        this.f76443p = 0;
        this.f76440m = "";
        this.f76444q = false;
        this.f76430c.f96213k.reverseGeoCode(new ReverseGeoCodeOption().location(latLng));
        this.f76430c.f96214l.searchInBound(new PoiBoundSearchOption().bound(this.f76439l).keyword("美食").pageCapacity(19));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m103864F() {
        if (this.f76431d.lifecycle_() == C4470c.f16271m || this.f76431d.isFinishing()) {
            return;
        }
        if (NullChecker.m82486a(this.f76437j) && this.f76430c.m122977F0(this.f76437j, this.f76446s)) {
            m103862D(-1);
            return;
        }
        int iM147476G = jyb.m147476G(this.f76433f, new qcj() { // from class: l.af3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f70846a.m103870y((PoiInfo) obj);
            }
        });
        if (iM147476G >= 0) {
            m103862D(iM147476G);
        }
    }

    /* JADX INFO: renamed from: G */
    public LatLng m103865G() {
        return this.f76430c.m122988q0() ? this.f76438k : this.f76446s;
    }

    /* JADX INFO: renamed from: H */
    public final void m103866H(LatLng latLng, boolean z) {
        Overlay overlay = this.f76442o;
        if (z) {
            if (NullChecker.m82486a(overlay)) {
                this.f76442o.remove();
                this.f76442o = null;
                return;
            }
            return;
        }
        if (NullChecker.m82486a(overlay)) {
            this.f76442o.remove();
            this.f76442o = null;
        }
        if (NullChecker.m82486a(latLng)) {
            this.f76442o = this.f76430c.f96210h.addOverlay(new MarkerOptions().icon(this.f76430c.m122989r0()).anchor(0.5f, 0.5f).position(latLng).draggable(false));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m103867I(SuggestionResult.SuggestionInfo suggestionInfo, String str, boolean z) {
        if (this.f76430c.m122988q0()) {
            this.f76430c.m122985P0(false);
        }
        this.f76430c.m122983N0(false);
        this.f76430c.m122978G0();
        this.f76434g = true;
        this.f76432e = false;
        this.f76440m = suggestionInfo.key;
        this.f76441n = str;
        this.f76433f = jyb.m147507f0(new PoiInfo[0]);
        notifyDataSetChanged();
        this.f76446s = null;
        PoiSearch poiSearch = this.f76430c.f96214l;
        PoiCitySearchOption poiCitySearchOption = new PoiCitySearchOption();
        String str2 = this.f76441n;
        if (str2 == null) {
            str2 = "";
        }
        poiSearch.searchInCity(poiCitySearchOption.city(str2).keyword(this.f76440m).cityLimit(!z).pageCapacity(20));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f76433f.size() + (this.f76434g ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.f76433f.size()) {
            return this.f76433f.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i == this.f76433f.size() ? 1 : 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f76430c.m122990s0(viewGroup, i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        eww ewwVar = this.f76430c;
        ewwVar.m122979H0(this.f76433f, this.f76435h, 0, -1, ewwVar.m122977F0(this.f76437j, this.f76446s));
        super.notifyDataSetChanged();
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, PoiInfo poiInfo, int i, int i2) {
        if (i == 0) {
            ((MapPoiItem) view).m48557R(poiInfo, (int) DistanceUtil.getDistance(poiInfo.location, this.f76437j), i2, this.f76430c.m122977F0(poiInfo.location, this.f76446s));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int m103869w(PoiInfo poiInfo, PoiInfo poiInfo2) {
        LatLng latLng = this.f76437j;
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
    public final /* synthetic */ Boolean m103870y(PoiInfo poiInfo) {
        return Boolean.valueOf(this.f76430c.m122977F0(this.f76446s, poiInfo.location));
    }

    /* JADX INFO: renamed from: z */
    public LatLngBounds m103871z(LatLng latLng) {
        return new LatLngBounds.Builder().include(m103860B(new LatLng(latLng.latitude - 1.0d, latLng.longitude - 1.0d))).include(m103860B(new LatLng(latLng.latitude + 1.0d, latLng.longitude + 1.0d))).build();
    }
}
