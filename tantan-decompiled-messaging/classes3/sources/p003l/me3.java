package p003l;

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
import com.p000p1.mobile.putong.core.p001ui.map.MapPoiItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class me3 extends wp1<PoiInfo> implements OnGetGeoCoderResultListener, OnGetPoiSearchResultListener {

    /* JADX INFO: renamed from: c */
    public ftw f5593c;

    /* JADX INFO: renamed from: d */
    public Act f5594d;

    /* JADX INFO: renamed from: e */
    public boolean f5595e;

    /* JADX INFO: renamed from: h */
    public PoiInfo f5598h;

    /* JADX INFO: renamed from: i */
    public PoiInfo f5599i;

    /* JADX INFO: renamed from: m */
    public String f5603m;

    /* JADX INFO: renamed from: n */
    public String f5604n;

    /* JADX INFO: renamed from: o */
    public Overlay f5605o;

    /* JADX INFO: renamed from: s */
    public LatLng f5609s;

    /* JADX INFO: renamed from: g */
    public boolean f5597g = true;

    /* JADX INFO: renamed from: j */
    public LatLng f5600j = null;

    /* JADX INFO: renamed from: k */
    public LatLng f5601k = null;

    /* JADX INFO: renamed from: l */
    public LatLngBounds f5602l = null;

    /* JADX INFO: renamed from: p */
    public int f5606p = 0;

    /* JADX INFO: renamed from: q */
    public boolean f5607q = false;

    /* JADX INFO: renamed from: r */
    public Comparator<PoiInfo> f5608r = new Comparator() { // from class: l.ke3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return this.f4906a.m6359w((PoiInfo) obj, (PoiInfo) obj2);
        }
    };

    /* JADX INFO: renamed from: f */
    public List<PoiInfo> f5596f = new ArrayList();

    public me3(ftw ftwVar, Act act) {
        this.f5593c = ftwVar;
        this.f5594d = act;
    }

    /* JADX INFO: renamed from: A */
    public double m6349A(double d) {
        return Math.min(90.0d, Math.max(d, -90.0d));
    }

    /* JADX INFO: renamed from: B */
    public LatLng m6350B(LatLng latLng) {
        return new LatLng(m6349A(latLng.latitude), m6351C(latLng.longitude));
    }

    /* JADX INFO: renamed from: C */
    public double m6351C(double d) {
        return Math.min(180.0d, Math.max(d, 0.0d));
    }

    /* JADX INFO: renamed from: D */
    public void m6352D(int i) {
        if (this.f5593c.m4452q0()) {
            return;
        }
        if (i != -1) {
            this.f5593c.m4447O0(0);
            m6356H(this.f5596f.get(i).location, false);
            MapStatus mapStatus = this.f5593c.f3720h.getMapStatus();
            float fMax = mapStatus == null ? 0.0f : mapStatus.zoom;
            if (fMax < 16.5d || fMax > 18.0f) {
                fMax = Math.max(fMax, 18.0f);
            }
            this.f5593c.f3720h.animateMapStatus(MapStatusUpdateFactory.newLatLngZoom(this.f5596f.get(i).location, fMax));
            this.f5609s = this.f5596f.get(i).location;
            PoiInfo poiInfo = this.f5596f.get(i);
            List<PoiInfo> list = this.f5596f;
            list.set(i, list.get(0));
            this.f5596f.set(0, poiInfo);
        } else if (NullChecker.a(this.f5598h)) {
            m6356H(this.f5598h.location, true);
            this.f5593c.f3720h.animateMapStatus(MapStatusUpdateFactory.newLatLng(this.f5600j));
            this.f5609s = this.f5598h.location;
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m6353E(LatLng latLng) {
        this.f5593c.m4446N0(true);
        this.f5593c.m4441G0();
        this.f5597g = true;
        this.f5595e = true;
        this.f5600j = latLng;
        this.f5609s = latLng;
        this.f5602l = m6361z(latLng);
        PoiInfo poiInfo = new PoiInfo();
        this.f5598h = poiInfo;
        poiInfo.name = this.f5594d.getString(R.string.kh);
        this.f5598h.location = this.f5600j;
        this.f5606p = 0;
        this.f5603m = "";
        this.f5607q = false;
        this.f5593c.f3723k.reverseGeoCode(new ReverseGeoCodeOption().location(latLng));
        this.f5593c.f3724l.searchInBound(new PoiBoundSearchOption().bound(this.f5602l).keyword("美食").pageCapacity(19));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m6354F() {
        if (this.f5594d.lifecycle_() == c.m || this.f5594d.isFinishing()) {
            return;
        }
        if (NullChecker.a(this.f5600j) && this.f5593c.m4440F0(this.f5600j, this.f5609s)) {
            m6352D(-1);
            return;
        }
        int iG = vwb.G(this.f5596f, new w9j() { // from class: l.le3
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5285a.m6360y((PoiInfo) obj);
            }
        });
        if (iG >= 0) {
            m6352D(iG);
        }
    }

    /* JADX INFO: renamed from: G */
    public LatLng m6355G() {
        return this.f5593c.m4452q0() ? this.f5601k : this.f5609s;
    }

    /* JADX INFO: renamed from: H */
    public final void m6356H(LatLng latLng, boolean z) {
        Overlay overlay = this.f5605o;
        if (z) {
            if (NullChecker.a(overlay)) {
                this.f5605o.remove();
                this.f5605o = null;
                return;
            }
            return;
        }
        if (NullChecker.a(overlay)) {
            this.f5605o.remove();
            this.f5605o = null;
        }
        if (NullChecker.a(latLng)) {
            this.f5605o = this.f5593c.f3720h.addOverlay(new MarkerOptions().icon(this.f5593c.m4453r0()).anchor(0.5f, 0.5f).position(latLng).draggable(false));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m6357I(SuggestionResult.SuggestionInfo suggestionInfo, String str, boolean z) {
        if (this.f5593c.m4452q0()) {
            this.f5593c.m4448P0(false);
        }
        this.f5593c.m4446N0(false);
        this.f5593c.m4441G0();
        this.f5597g = true;
        this.f5595e = false;
        this.f5603m = suggestionInfo.key;
        this.f5604n = str;
        this.f5596f = vwb.f0(new PoiInfo[0]);
        notifyDataSetChanged();
        this.f5609s = null;
        PoiSearch poiSearch = this.f5593c.f3724l;
        PoiCitySearchOption poiCitySearchOption = new PoiCitySearchOption();
        String str2 = this.f5604n;
        if (str2 == null) {
            str2 = "";
        }
        poiSearch.searchInCity(poiCitySearchOption.city(str2).keyword(this.f5603m).cityLimit(!z).pageCapacity(20));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5596f.size() + (this.f5597g ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.f5596f.size()) {
            return this.f5596f.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i == this.f5596f.size() ? 1 : 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: m */
    public View mo1006m(ViewGroup viewGroup, int i) {
        return this.f5593c.m4454s0(viewGroup, i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        ftw ftwVar = this.f5593c;
        ftwVar.m4442H0(this.f5596f, this.f5598h, 0, -1, ftwVar.m4440F0(this.f5600j, this.f5609s));
        super.notifyDataSetChanged();
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo1005j(View view, PoiInfo poiInfo, int i, int i2) {
        if (i == 0) {
            ((MapPoiItem) view).m407R(poiInfo, (int) DistanceUtil.getDistance(poiInfo.location, this.f5600j), i2, this.f5593c.m4440F0(poiInfo.location, this.f5609s));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int m6359w(PoiInfo poiInfo, PoiInfo poiInfo2) {
        LatLng latLng = this.f5600j;
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
    public final /* synthetic */ Boolean m6360y(PoiInfo poiInfo) {
        return Boolean.valueOf(this.f5593c.m4440F0(this.f5609s, poiInfo.location));
    }

    /* JADX INFO: renamed from: z */
    public LatLngBounds m6361z(LatLng latLng) {
        return new LatLngBounds.Builder().include(m6350B(new LatLng(latLng.latitude - 1.0d, latLng.longitude - 1.0d))).include(m6350B(new LatLng(latLng.latitude + 1.0d, latLng.longitude + 1.0d))).build();
    }
}
