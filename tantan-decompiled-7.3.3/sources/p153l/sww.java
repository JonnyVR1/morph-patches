package p153l;

import android.animation.Animator;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.poi.PoiSearch;
import com.baidu.mapapi.search.sug.OnGetSuggestionResultListener;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.baidu.mapapi.search.sug.SuggestionSearch;
import com.baidu.mapapi.search.sug.SuggestionSearchOption;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.map.MapListView;
import com.p051p1.mobile.putong.core.p058ui.map.MapPoiItem;
import com.p051p1.mobile.putong.core.p058ui.map.TouchProxyForMap;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame_Anim;
import p151v.VLinear;
import p151v.VList;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class sww implements iam<eww> {

    /* JADX INFO: renamed from: F */
    public static final List<String> f171015F = jyb.m147507f0("黑龙江省", "吉林省", "辽宁省", "河北省", "河南省", "湖北省", "湖南省", "山东省", "山西省", "陕西省", "甘肃省", "青海省", "江苏省", "安徽省", "浙江省", "福建省", "江西省", "广东省", "台湾省", "海南省", "四川省", "云南省", "贵州省", "内蒙古自治区", "宁夏回族自治区", "新疆维吾尔自治区", "西藏自治区", "广西壮族自治区");

    /* JADX INFO: renamed from: A */
    public boolean f171016A;

    /* JADX INFO: renamed from: B */
    public eww f171017B;

    /* JADX INFO: renamed from: C */
    public Context f171018C;

    /* JADX INFO: renamed from: a */
    public TouchProxyForMap f171021a;

    /* JADX INFO: renamed from: b */
    public VText f171022b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f171023c;

    /* JADX INFO: renamed from: d */
    public VFrame_Anim f171024d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f171025e;

    /* JADX INFO: renamed from: f */
    public VText f171026f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f171027g;

    /* JADX INFO: renamed from: h */
    public MapView f171028h;

    /* JADX INFO: renamed from: i */
    public ImageView f171029i;

    /* JADX INFO: renamed from: j */
    public ImageView f171030j;

    /* JADX INFO: renamed from: k */
    public VText f171031k;

    /* JADX INFO: renamed from: l */
    public MapListView f171032l;

    /* JADX INFO: renamed from: m */
    public VLinear f171033m;

    /* JADX INFO: renamed from: n */
    public VText f171034n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f171035o;

    /* JADX INFO: renamed from: p */
    public VList f171036p;

    /* JADX INFO: renamed from: q */
    public MapPoiItem f171037q;

    /* JADX INFO: renamed from: r */
    public SearchView f171038r;

    /* JADX INFO: renamed from: s */
    public MenuItem f171039s;

    /* JADX INFO: renamed from: t */
    public View f171040t;

    /* JADX INFO: renamed from: u */
    public SuggestionSearch f171041u;

    /* JADX INFO: renamed from: v */
    public boolean f171042v;

    /* JADX INFO: renamed from: w */
    public View f171043w;

    /* JADX INFO: renamed from: x */
    public TextView f171044x;

    /* JADX INFO: renamed from: z */
    public boolean f171046z;

    /* JADX INFO: renamed from: y */
    public String f171045y = null;

    /* JADX INFO: renamed from: D */
    public y20<List<SuggestionResult.SuggestionInfo>> f171019D = new y20() { // from class: l.fww
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f101221a.m188397L((List) obj);
        }
    };

    /* JADX INFO: renamed from: E */
    public z20<bf3, SuggestionResult.SuggestionInfo> f171020E = new z20() { // from class: l.jww
        @Override // p153l.z20
        public final void call(Object obj, Object obj2) {
            this.f122972a.m188398N((bf3) obj, (SuggestionResult.SuggestionInfo) obj2);
        }
    };

    /* JADX INFO: renamed from: l.sww$c */
    public class C20169c extends gt0.C17308j {
        public C20169c() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VLinear vLinear = sww.this.f171033m;
            vLinear.setTranslationY(vLinear.getHeight());
        }
    }

    /* JADX INFO: renamed from: l.sww$d */
    public class C20170d implements SearchView.InterfaceC0151m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bf3 f171050a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l3h0 f171051b;

        public C20170d(bf3 bf3Var, l3h0 l3h0Var) {
            this.f171050a = bf3Var;
            this.f171051b = l3h0Var;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: a */
        public boolean mo601a(String str) {
            sww.this.f171039s.setEnabled(false);
            sww.this.f171043w.setEnabled(false);
            bnl0.m105524M(sww.this.f171040t, (str == null || str.isEmpty()) ? false : true);
            eww unused = sww.this.f171017B;
            fhw.m125605a("MapActPresenter", " onQueryTextChange newText = " + str);
            if (!TextUtils.isEmpty(str)) {
                sww.this.f171046z = true;
            }
            if (!TextUtils.isEmpty(str) && NullChecker.m82486a(this.f171050a.f76435h) && NullChecker.m82486a(this.f171050a.f76435h.city)) {
                sww.this.f171041u.requestSuggestion(new SuggestionSearchOption().city(this.f171050a.f76435h.city).keyword(str));
                sww.this.f171042v = true;
            } else {
                this.f171051b.m152707t(new ArrayList(), sww.this.f171019D);
                sww.this.f171042v = false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: b */
        public boolean mo602b(String str) {
            return false;
        }
    }

    public sww(Context context) {
        this.f171018C = context;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Boolean m188367M(SuggestionResult.SuggestionInfo suggestionInfo, String str) {
        return Boolean.valueOf(str.equals(suggestionInfo.key));
    }

    /* JADX INFO: renamed from: A */
    public View m188387A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vww.m203820b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B */
    public View m188388B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return www.m208320b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(eww ewwVar) {
        this.f171017B = ewwVar;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f171018C;
    }

    /* JADX INFO: renamed from: E */
    public void m188390E(boolean z) {
        this.f171022b.setText(z ? R$string.f18674Mh : R$string.f18704Nh);
        this.f171034n.setText(z ? R$string.f18764Ph : R$string.f18794Qh);
    }

    /* JADX INFO: renamed from: F */
    public boolean m188391F() {
        return this.f171016A;
    }

    /* JADX INFO: renamed from: G */
    public boolean m188392G() {
        return this.f171046z;
    }

    /* JADX INFO: renamed from: H */
    public void m188393H(boolean z) {
        if (NullChecker.m82486a(this.f171038r)) {
            act().hideInput(this.f171038r);
            if (!z) {
                m188411a0(false);
            }
            this.f171038r.clearFocus();
            this.f171040t.setVisibility(8);
            if (NullChecker.m82486a(this.f171039s)) {
                this.f171039s.setEnabled(false);
                this.f171043w.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public View m188394I(ViewGroup viewGroup, int i) {
        return i == 0 ? act().inflater().inflate(kec0.f125654Ud, viewGroup, false) : this.f171023c;
    }

    /* JADX INFO: renamed from: J */
    public void m188395J(int i, final bf3 bf3Var, l3h0 l3h0Var, C4470c c4470c) {
        if (!(c4470c instanceof C4470c.a)) {
            if (c4470c == C4470c.f16267i) {
                this.f171028h.onResume();
                return;
            }
            if (c4470c == C4470c.f16268j) {
                this.f171028h.onPause();
                return;
            }
            if (c4470c == C4470c.f16271m) {
                this.f171017B.f96210h.clear();
                this.f171028h.onDestroy();
                this.f171017B.f96213k.destroy();
                this.f171017B.f96214l.destroy();
                this.f171041u.destroy();
                BitmapDescriptor bitmapDescriptor = this.f171017B.f96215m;
                if (bitmapDescriptor != null) {
                    bitmapDescriptor.recycle();
                }
                BitmapDescriptor bitmapDescriptor2 = this.f171017B.f96211i;
                if (bitmapDescriptor2 != null) {
                    bitmapDescriptor2.recycle();
                    return;
                }
                return;
            }
            return;
        }
        act().setConvertActivityFromTranslucentEnable(false);
        if (i == 1) {
            act().setTitle(act().string(R$string.f18778Q1));
        }
        m188388B(act().inflater(), this.f171032l);
        bnl0.m105524M(this.f171032l, false);
        this.f171032l.addHeaderView(this.f171021a);
        MapPoiItem mapPoiItem = (MapPoiItem) act().inflater().inflate(kec0.f125654Ud, (ViewGroup) this.f171032l, false);
        this.f171037q = mapPoiItem;
        this.f171032l.addHeaderView(mapPoiItem);
        m188387A(act().inflater(), this.f171032l);
        this.f171032l.addHeaderView(this.f171022b);
        m188415z(act().inflater(), this.f171032l);
        this.f171032l.setAdapter((ListAdapter) bf3Var);
        this.f171032l.setOnScrollListener(new C20167a());
        this.f171028h.showZoomControls(false);
        this.f171017B.f96210h = this.f171028h.getMap();
        this.f171017B.f96210h.setMapStatus(MapStatusUpdateFactory.zoomTo(17.0f));
        uqb0.f180370E.m80051t();
        eww ewwVar = this.f171017B;
        ewwVar.f96210h.setOnMapStatusChangeListener(ewwVar);
        this.f171017B.f96213k = GeoCoder.newInstance();
        this.f171017B.f96214l = PoiSearch.newInstance();
        this.f171017B.f96213k.setOnGetGeoCodeResultListener(bf3Var);
        this.f171017B.f96214l.setOnGetPoiSearchResultListener(bf3Var);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f171027g.getLayoutParams();
        marginLayoutParams.bottomMargin -= qa00.m175859d(32.0f);
        marginLayoutParams.topMargin -= qa00.m175859d(32.0f);
        this.f171034n.setOnClickListener(new View.OnClickListener() { // from class: l.rww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165252a.m188396K(bf3Var, view);
            }
        });
        this.f171036p.setAdapter((ListAdapter) l3h0Var);
        SuggestionSearch suggestionSearchNewInstance = SuggestionSearch.newInstance();
        this.f171041u = suggestionSearchNewInstance;
        suggestionSearchNewInstance.setOnGetSuggestionResultListener(new OnGetSuggestionResultListener() { // from class: l.gww
        });
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 24 || i2 == 25) {
            act().addSwipeBackListener(new C20168b());
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m188396K(bf3 bf3Var, View view) {
        m188412b0(this.f171017B.m122988q0(), bf3Var, false);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m188397L(List list) {
        bnl0.m105525M0(this.f171036p, list.size() > 0);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m188398N(bf3 bf3Var, final SuggestionResult.SuggestionInfo suggestionInfo) {
        this.f171038r.setQuery(suggestionInfo.key, false);
        if (!TextUtils.isEmpty(suggestionInfo.city)) {
            bf3Var.m103867I(suggestionInfo, suggestionInfo.city, false);
        } else if (jyb.m147520m(f171015F, new qcj() { // from class: l.iww
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sww.m188367M(suggestionInfo, (String) obj);
            }
        })) {
            bf3Var.m103867I(suggestionInfo, suggestionInfo.key, true);
        } else {
            PoiInfo poiInfo = bf3Var.f76435h;
            bf3Var.m103867I(suggestionInfo, poiInfo != null ? poiInfo.city : null, false);
        }
        m188393H(false);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m188399O(View view) {
        this.f171017B.m122982L0();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Boolean m188400P() {
        this.f171038r.setMaxWidth((bnl0.m105592y0() - qa00.m175859d(72.0f)) - Math.max(this.f171043w.getMeasuredWidth(), qa00.m175859d(56.0f)));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m188401Q(SearchableInfo searchableInfo) {
        SearchView searchView = this.f171038r;
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m188402R() {
        final SearchableInfo searchableInfo = ((SearchManager) act().getSystemService(FirebaseAnalytics.Event.SEARCH)).getSearchableInfo(act().getComponentName());
        l51.m152886F(act(), new Runnable() { // from class: l.hww
            @Override // java.lang.Runnable
            public final void run() {
                this.f111938a.m188401Q(searchableInfo);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m188403S(int i, View view) {
        this.f171044x.setText(i == 0 ? act().string(R$string.f19724v) : act().string(R$string.f19107b));
        this.f171039s.setTitle(act().actionItemPadding(i == 0 ? act().string(R$string.f19724v) : act().string(R$string.f19107b)));
        this.f171039s.setEnabled(false);
        this.f171043w.setEnabled(false);
        this.f171038r.requestFocus();
        m188411a0(true);
        this.f171040t.setVisibility(8);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ boolean m188404T() {
        m188411a0(false);
        bnl0.m105525M0(this.f171036p, false);
        this.f171039s.setEnabled(true);
        this.f171043w.setEnabled(true);
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m188405U(View view, boolean z) {
        if (z) {
            m188411a0(true);
        } else {
            this.f171040t.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m188406V(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.m82486a(this.f171038r)) {
            this.f171038r.setIconified(true);
        }
        if (NullChecker.m82486a(this.f171038r)) {
            this.f171038r.setIconified(true);
        }
        m188411a0(false);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public void m188407W(int i) {
        this.f171032l.smoothScrollToPosition(i);
    }

    /* JADX INFO: renamed from: X */
    public void m188408X() {
        this.f171024d.m224272G(this.f171025e);
    }

    /* JADX INFO: renamed from: Y */
    public void m188409Y(List<PoiInfo> list, PoiInfo poiInfo, int i, int i2, boolean z) {
        if (NullChecker.m82486a(poiInfo)) {
            this.f171037q.m48557R(poiInfo, i, i2, z);
        }
        if (list.isEmpty()) {
            return;
        }
        bnl0.m105524M(this.f171032l, true);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m188410Z(final int i, bf3 bf3Var, l3h0 l3h0Var, Menu menu) {
        act().getMenuInflater().inflate(lfc0.f131841d, menu);
        MenuItem menuItemFindItem = menu.findItem(adc0.f70488o8);
        this.f171039s = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        this.f171043w = actionView;
        this.f171044x = (TextView) actionView.findViewById(adc0.f70505p8);
        act().getAppTheme().mo134830j(this.f171044x);
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            this.f171044x.setTextColor(act().getResources().getColorStateList(CoreBusinessModule.m30906m0().mo122543c()));
        }
        this.f171044x.setText(i == 0 ? act().string(R$string.f19724v) : act().string(R$string.f19107b));
        this.f171039s.setTitle(act().actionItemPadding(i == 0 ? act().string(R$string.f19724v) : act().string(R$string.f19107b)));
        this.f171039s.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.lww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133867a.m188399O(view);
            }
        });
        this.f171038r = (SearchView) menu.findItem(adc0.f70454m8).getActionView();
        bnl0.m105546b0(this.f171043w, new pcj() { // from class: l.mww
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f139161a.m188400P();
            }
        });
        l51.m152919y(new Runnable() { // from class: l.nww
            @Override // java.lang.Runnable
            public final void run() {
                this.f144050a.m188402R();
            }
        });
        try {
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            this.f171040t = (View) declaredField.get(this.f171038r);
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
        } catch (IllegalArgumentException e2) {
            CrashHelper.m82479c(e2);
        } catch (NoSuchFieldException e3) {
            CrashHelper.m82479c(e3);
        }
        act().getAppTheme().mo134832l(this.f171038r);
        this.f171038r.setOnSearchClickListener(new View.OnClickListener() { // from class: l.oww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149583a.m188403S(i, view);
            }
        });
        this.f171038r.setOnQueryTextListener(new C20170d(bf3Var, l3h0Var));
        this.f171038r.setOnCloseListener(new SearchView.InterfaceC0150l() { // from class: l.pww
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0150l
            public final boolean onClose() {
                return this.f154446a.m188404T();
            }
        });
        this.f171038r.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.qww
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f159971a.m188405U(view, z);
            }
        });
        act().pendChangeActionButtonTypeface();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m188411a0(boolean z) {
        if (z && this.f171035o.getVisibility() != 0) {
            this.f171035o.setVisibility(0);
            this.f171035o.setAlpha(0.0f);
            this.f171035o.animate().alpha(1.0f).setListener(new C20171e()).start();
            this.f171035o.setOnTouchListener(new View.OnTouchListener() { // from class: l.kww
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f129096a.m188406V(view, motionEvent);
                }
            });
            return;
        }
        if (z || this.f171035o.getVisibility() != 0) {
            return;
        }
        this.f171035o.setAlpha(1.0f);
        this.f171035o.animate().alpha(0.0f).setListener(new C20172f()).start();
        this.f171035o.setOnTouchListener(null);
    }

    /* JADX INFO: renamed from: b0 */
    public void m188412b0(boolean z, bf3 bf3Var, boolean z2) {
        if (z2 != z) {
            this.f171017B.m122986o0(z2);
            VLinear vLinear = this.f171033m;
            if (!z2) {
                vLinear.animate().translationY(qa00.m175859d(49.0f)).setListener(new C20169c()).start();
                this.f171032l.animate().translationY(0.0f).start();
                this.f171027g.animate().translationY(0.0f).start();
                bf3Var.m103864F();
                return;
            }
            vLinear.setTranslationY(qa00.m175859d(49.0f));
            this.f171033m.animate().translationY(0.0f).setListener(new gt0.C17308j()).start();
            this.f171032l.smoothScrollToPosition(0);
            int dimensionPixelSize = act().getResources().getDimensionPixelSize(cac0.f80572b) - this.f171033m.getHeight();
            this.f171032l.animate().translationY(dimensionPixelSize).start();
            this.f171027g.animate().translationY(dimensionPixelSize / 2).start();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m188414y(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public boolean m188413o() {
        if (!NullChecker.m82486a(this.f171038r) || this.f171038r.isIconified()) {
            return false;
        }
        if (!this.f171038r.isIconified()) {
            this.f171038r.setQuery("", true);
            this.f171038r.setIconified(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public View m188414y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tww.m193373b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public View m188415z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uww.m198394b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l.sww$b */
    public class C20168b implements ujh0 {
        public C20168b() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            if (sww.this.f171028h.getChildCount() > 0) {
                sww.this.f171028h.getChildAt(0).setVisibility(8);
            }
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.sww$e */
    public class C20171e implements Animator.AnimatorListener {
        public C20171e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            sww.this.f171035o.setAlpha(0.0f);
            sww.this.f171035o.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.sww$f */
    public class C20172f implements Animator.AnimatorListener {
        public C20172f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            sww.this.f171035o.setTag(Boolean.FALSE);
            sww.this.f171035o.setAlpha(1.0f);
            sww.this.f171035o.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (((Boolean) sww.this.f171035o.getTag()).booleanValue()) {
                sww.this.f171035o.setVisibility(4);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            sww.this.f171035o.setTag(Boolean.TRUE);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.sww$a */
    public class C20167a implements AbsListView.OnScrollListener {
        public C20167a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (i != 0 || sww.this.f171017B.m122988q0()) {
                return;
            }
            sww.this.f171027g.setTranslationY(sww.this.f171021a.getTop() / 2);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }
}
