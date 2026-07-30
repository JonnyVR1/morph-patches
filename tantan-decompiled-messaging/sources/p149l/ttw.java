package p149l;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.map.MapListView;
import com.p046p1.mobile.putong.core.p053ui.map.MapPoiItem;
import com.p046p1.mobile.putong.core.p053ui.map.TouchProxyForMap;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame_Anim;
import p147v.VLinear;
import p147v.VList;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ttw implements s7m<ftw> {

    /* JADX INFO: renamed from: F */
    public static final List<String> f172063F = vwb.m200324f0("黑龙江省", "吉林省", "辽宁省", "河北省", "河南省", "湖北省", "湖南省", "山东省", "山西省", "陕西省", "甘肃省", "青海省", "江苏省", "安徽省", "浙江省", "福建省", "江西省", "广东省", "台湾省", "海南省", "四川省", "云南省", "贵州省", "内蒙古自治区", "宁夏回族自治区", "新疆维吾尔自治区", "西藏自治区", "广西壮族自治区");

    /* JADX INFO: renamed from: A */
    public boolean f172064A;

    /* JADX INFO: renamed from: B */
    public ftw f172065B;

    /* JADX INFO: renamed from: C */
    public Context f172066C;

    /* JADX INFO: renamed from: a */
    public TouchProxyForMap f172069a;

    /* JADX INFO: renamed from: b */
    public VText f172070b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f172071c;

    /* JADX INFO: renamed from: d */
    public VFrame_Anim f172072d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f172073e;

    /* JADX INFO: renamed from: f */
    public VText f172074f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f172075g;

    /* JADX INFO: renamed from: h */
    public MapView f172076h;

    /* JADX INFO: renamed from: i */
    public ImageView f172077i;

    /* JADX INFO: renamed from: j */
    public ImageView f172078j;

    /* JADX INFO: renamed from: k */
    public VText f172079k;

    /* JADX INFO: renamed from: l */
    public MapListView f172080l;

    /* JADX INFO: renamed from: m */
    public VLinear f172081m;

    /* JADX INFO: renamed from: n */
    public VText f172082n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f172083o;

    /* JADX INFO: renamed from: p */
    public VList f172084p;

    /* JADX INFO: renamed from: q */
    public MapPoiItem f172085q;

    /* JADX INFO: renamed from: r */
    public SearchView f172086r;

    /* JADX INFO: renamed from: s */
    public MenuItem f172087s;

    /* JADX INFO: renamed from: t */
    public View f172088t;

    /* JADX INFO: renamed from: u */
    public SuggestionSearch f172089u;

    /* JADX INFO: renamed from: v */
    public boolean f172090v;

    /* JADX INFO: renamed from: w */
    public View f172091w;

    /* JADX INFO: renamed from: x */
    public TextView f172092x;

    /* JADX INFO: renamed from: z */
    public boolean f172094z;

    /* JADX INFO: renamed from: y */
    public String f172093y = null;

    /* JADX INFO: renamed from: D */
    public e30<List<SuggestionResult.SuggestionInfo>> f172067D = new e30() { // from class: l.gtw
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f104354a.m190655L((List) obj);
        }
    };

    /* JADX INFO: renamed from: E */
    public f30<me3, SuggestionResult.SuggestionInfo> f172068E = new f30() { // from class: l.ktw
        @Override // p149l.f30
        public final void call(Object obj, Object obj2) {
            this.f124620a.m190656N((me3) obj, (SuggestionResult.SuggestionInfo) obj2);
        }
    };

    /* JADX INFO: renamed from: l.ttw$c */
    public class C20272c extends bt0.C15966j {
        public C20272c() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VLinear vLinear = ttw.this.f172081m;
            vLinear.setTranslationY(vLinear.getHeight());
        }
    }

    /* JADX INFO: renamed from: l.ttw$d */
    public class C20273d implements SearchView.InterfaceC0150m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ me3 f172098a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dvg0 f172099b;

        public C20273d(me3 me3Var, dvg0 dvg0Var) {
            this.f172098a = me3Var;
            this.f172099b = dvg0Var;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: a */
        public boolean mo600a(String str) {
            ttw.this.f172087s.setEnabled(false);
            ttw.this.f172091w.setEnabled(false);
            xdl0.m208344M(ttw.this.f172088t, (str == null || str.isEmpty()) ? false : true);
            ftw unused = ttw.this.f172065B;
            hfw.m130790a("MapActPresenter", " onQueryTextChange newText = " + str);
            if (!TextUtils.isEmpty(str)) {
                ttw.this.f172094z = true;
            }
            if (!TextUtils.isEmpty(str) && NullChecker.m81303a(this.f172098a.f133344h) && NullChecker.m81303a(this.f172098a.f133344h.city)) {
                ttw.this.f172089u.requestSuggestion(new SuggestionSearchOption().city(this.f172098a.f133344h.city).keyword(str));
                ttw.this.f172090v = true;
            } else {
                this.f172099b.m113779t(new ArrayList(), ttw.this.f172067D);
                ttw.this.f172090v = false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: b */
        public boolean mo601b(String str) {
            return false;
        }
    }

    public ttw(Context context) {
        this.f172066C = context;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Boolean m190625M(SuggestionResult.SuggestionInfo suggestionInfo, String str) {
        return Boolean.valueOf(str.equals(suggestionInfo.key));
    }

    /* JADX INFO: renamed from: A */
    public View m190645A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wtw.m205582b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B */
    public View m190646B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xtw.m211027b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ftw ftwVar) {
        this.f172065B = ftwVar;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f172066C;
    }

    /* JADX INFO: renamed from: E */
    public void m190648E(boolean z) {
        this.f172070b.setText(z ? R$string.f18886rh : R$string.f18916sh);
        this.f172082n.setText(z ? R$string.f18976uh : R$string.f19006vh);
    }

    /* JADX INFO: renamed from: F */
    public boolean m190649F() {
        return this.f172064A;
    }

    /* JADX INFO: renamed from: G */
    public boolean m190650G() {
        return this.f172094z;
    }

    /* JADX INFO: renamed from: H */
    public void m190651H(boolean z) {
        if (NullChecker.m81303a(this.f172086r)) {
            act().hideInput(this.f172086r);
            if (!z) {
                m190669a0(false);
            }
            this.f172086r.clearFocus();
            this.f172088t.setVisibility(8);
            if (NullChecker.m81303a(this.f172087s)) {
                this.f172087s.setEnabled(false);
                this.f172091w.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public View m190652I(ViewGroup viewGroup, int i) {
        return i == 0 ? act().inflater().inflate(f6c0.f95488Nd, viewGroup, false) : this.f172071c;
    }

    /* JADX INFO: renamed from: J */
    public void m190653J(int i, final me3 me3Var, dvg0 dvg0Var, C4319c c4319c) {
        if (!(c4319c instanceof C4319c.a)) {
            if (c4319c == C4319c.f15548i) {
                this.f172076h.onResume();
                return;
            }
            if (c4319c == C4319c.f15549j) {
                this.f172076h.onPause();
                return;
            }
            if (c4319c == C4319c.f15552m) {
                this.f172065B.f99281h.clear();
                this.f172076h.onDestroy();
                this.f172065B.f99284k.destroy();
                this.f172065B.f99285l.destroy();
                this.f172089u.destroy();
                BitmapDescriptor bitmapDescriptor = this.f172065B.f99286m;
                if (bitmapDescriptor != null) {
                    bitmapDescriptor.recycle();
                }
                BitmapDescriptor bitmapDescriptor2 = this.f172065B.f99282i;
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
            act().setTitle(act().string(R$string.f18048Q1));
        }
        m190646B(act().inflater(), this.f172080l);
        xdl0.m208344M(this.f172080l, false);
        this.f172080l.addHeaderView(this.f172069a);
        MapPoiItem mapPoiItem = (MapPoiItem) act().inflater().inflate(f6c0.f95488Nd, (ViewGroup) this.f172080l, false);
        this.f172085q = mapPoiItem;
        this.f172080l.addHeaderView(mapPoiItem);
        m190645A(act().inflater(), this.f172080l);
        this.f172080l.addHeaderView(this.f172070b);
        m190673z(act().inflater(), this.f172080l);
        this.f172080l.setAdapter((ListAdapter) me3Var);
        this.f172080l.setOnScrollListener(new C20270a());
        this.f172076h.showZoomControls(false);
        this.f172065B.f99281h = this.f172076h.getMap();
        this.f172065B.f99281h.setMapStatus(MapStatusUpdateFactory.zoomTo(17.0f));
        qib0.f154687E.m78868t();
        ftw ftwVar = this.f172065B;
        ftwVar.f99281h.setOnMapStatusChangeListener(ftwVar);
        this.f172065B.f99284k = GeoCoder.newInstance();
        this.f172065B.f99285l = PoiSearch.newInstance();
        this.f172065B.f99284k.setOnGetGeoCodeResultListener(me3Var);
        this.f172065B.f99285l.setOnGetPoiSearchResultListener(me3Var);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f172075g.getLayoutParams();
        marginLayoutParams.bottomMargin -= t100.m186890d(32.0f);
        marginLayoutParams.topMargin -= t100.m186890d(32.0f);
        this.f172082n.setOnClickListener(new View.OnClickListener() { // from class: l.stw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166396a.m190654K(me3Var, view);
            }
        });
        this.f172084p.setAdapter((ListAdapter) dvg0Var);
        SuggestionSearch suggestionSearchNewInstance = SuggestionSearch.newInstance();
        this.f172089u = suggestionSearchNewInstance;
        suggestionSearchNewInstance.setOnGetSuggestionResultListener(new OnGetSuggestionResultListener() { // from class: l.htw
        });
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 24 || i2 == 25) {
            act().addSwipeBackListener(new C20271b());
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m190654K(me3 me3Var, View view) {
        m190670b0(this.f172065B.m123117q0(), me3Var, false);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m190655L(List list) {
        xdl0.m208345M0(this.f172084p, list.size() > 0);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m190656N(me3 me3Var, final SuggestionResult.SuggestionInfo suggestionInfo) {
        this.f172086r.setQuery(suggestionInfo.key, false);
        if (!TextUtils.isEmpty(suggestionInfo.city)) {
            me3Var.m154123I(suggestionInfo, suggestionInfo.city, false);
        } else if (vwb.m200337m(f172063F, new w9j() { // from class: l.jtw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ttw.m190625M(suggestionInfo, (String) obj);
            }
        })) {
            me3Var.m154123I(suggestionInfo, suggestionInfo.key, true);
        } else {
            PoiInfo poiInfo = me3Var.f133344h;
            me3Var.m154123I(suggestionInfo, poiInfo != null ? poiInfo.city : null, false);
        }
        m190651H(false);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m190657O(View view) {
        this.f172065B.m123111L0();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Boolean m190658P() {
        this.f172086r.setMaxWidth((xdl0.m208412y0() - t100.m186890d(72.0f)) - Math.max(this.f172091w.getMeasuredWidth(), t100.m186890d(56.0f)));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m190659Q(SearchableInfo searchableInfo) {
        SearchView searchView = this.f172086r;
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m190660R() {
        final SearchableInfo searchableInfo = ((SearchManager) act().getSystemService(FirebaseAnalytics.Event.SEARCH)).getSearchableInfo(act().getComponentName());
        e51.m114741F(act(), new Runnable() { // from class: l.itw
            @Override // java.lang.Runnable
            public final void run() {
                this.f114947a.m190659Q(searchableInfo);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m190661S(int i, View view) {
        this.f172092x.setText(i == 0 ? act().string(R$string.f18988v) : act().string(R$string.f18377b));
        this.f172087s.setTitle(act().actionItemPadding(i == 0 ? act().string(R$string.f18988v) : act().string(R$string.f18377b)));
        this.f172087s.setEnabled(false);
        this.f172091w.setEnabled(false);
        this.f172086r.requestFocus();
        m190669a0(true);
        this.f172088t.setVisibility(8);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ boolean m190662T() {
        m190669a0(false);
        xdl0.m208345M0(this.f172084p, false);
        this.f172087s.setEnabled(true);
        this.f172091w.setEnabled(true);
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m190663U(View view, boolean z) {
        if (z) {
            m190669a0(true);
        } else {
            this.f172088t.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m190664V(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.m81303a(this.f172086r)) {
            this.f172086r.setIconified(true);
        }
        if (NullChecker.m81303a(this.f172086r)) {
            this.f172086r.setIconified(true);
        }
        m190669a0(false);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public void m190665W(int i) {
        this.f172080l.smoothScrollToPosition(i);
    }

    /* JADX INFO: renamed from: X */
    public void m190666X() {
        this.f172072d.m223026G(this.f172073e);
    }

    /* JADX INFO: renamed from: Y */
    public void m190667Y(List<PoiInfo> list, PoiInfo poiInfo, int i, int i2, boolean z) {
        if (NullChecker.m81303a(poiInfo)) {
            this.f172085q.m47374R(poiInfo, i, i2, z);
        }
        if (list.isEmpty()) {
            return;
        }
        xdl0.m208344M(this.f172080l, true);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m190668Z(final int i, me3 me3Var, dvg0 dvg0Var, Menu menu) {
        act().getMenuInflater().inflate(h7c0.f106222d, menu);
        MenuItem menuItemFindItem = menu.findItem(u4c0.f174363m8);
        this.f172087s = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        this.f172091w = actionView;
        this.f172092x = (TextView) actionView.findViewById(u4c0.f174380n8);
        act().getAppTheme().mo103048j(this.f172092x);
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            this.f172092x.setTextColor(act().getResources().getColorStateList(CoreBusinessModule.m29908m0().mo190516c()));
        }
        this.f172092x.setText(i == 0 ? act().string(R$string.f18988v) : act().string(R$string.f18377b));
        this.f172087s.setTitle(act().actionItemPadding(i == 0 ? act().string(R$string.f18988v) : act().string(R$string.f18377b)));
        this.f172087s.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.mtw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135707a.m190657O(view);
            }
        });
        this.f172086r = (SearchView) menu.findItem(u4c0.f174329k8).getActionView();
        xdl0.m208366b0(this.f172091w, new v9j() { // from class: l.ntw
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140543a.m190658P();
            }
        });
        e51.m114774y(new Runnable() { // from class: l.otw
            @Override // java.lang.Runnable
            public final void run() {
                this.f145633a.m190660R();
            }
        });
        try {
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            this.f172088t = (View) declaredField.get(this.f172086r);
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
        } catch (IllegalArgumentException e2) {
            CrashHelper.m81296c(e2);
        } catch (NoSuchFieldException e3) {
            CrashHelper.m81296c(e3);
        }
        act().getAppTheme().mo103049l(this.f172086r);
        this.f172086r.setOnSearchClickListener(new View.OnClickListener() { // from class: l.ptw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151226a.m190661S(i, view);
            }
        });
        this.f172086r.setOnQueryTextListener(new C20273d(me3Var, dvg0Var));
        this.f172086r.setOnCloseListener(new SearchView.InterfaceC0149l() { // from class: l.qtw
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0149l
            public final boolean onClose() {
                return this.f156404a.m190662T();
            }
        });
        this.f172086r.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.rtw
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f161006a.m190663U(view, z);
            }
        });
        act().pendChangeActionButtonTypeface();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m190669a0(boolean z) {
        if (z && this.f172083o.getVisibility() != 0) {
            this.f172083o.setVisibility(0);
            this.f172083o.setAlpha(0.0f);
            this.f172083o.animate().alpha(1.0f).setListener(new C20274e()).start();
            this.f172083o.setOnTouchListener(new View.OnTouchListener() { // from class: l.ltw
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f130019a.m190664V(view, motionEvent);
                }
            });
            return;
        }
        if (z || this.f172083o.getVisibility() != 0) {
            return;
        }
        this.f172083o.setAlpha(1.0f);
        this.f172083o.animate().alpha(0.0f).setListener(new C20275f()).start();
        this.f172083o.setOnTouchListener(null);
    }

    /* JADX INFO: renamed from: b0 */
    public void m190670b0(boolean z, me3 me3Var, boolean z2) {
        if (z2 != z) {
            this.f172065B.m123115o0(z2);
            VLinear vLinear = this.f172081m;
            if (!z2) {
                vLinear.animate().translationY(t100.m186890d(49.0f)).setListener(new C20272c()).start();
                this.f172080l.animate().translationY(0.0f).start();
                this.f172075g.animate().translationY(0.0f).start();
                me3Var.m154120F();
                return;
            }
            vLinear.setTranslationY(t100.m186890d(49.0f));
            this.f172081m.animate().translationY(0.0f).setListener(new bt0.C15966j()).start();
            this.f172080l.smoothScrollToPosition(0);
            int dimensionPixelSize = act().getResources().getDimensionPixelSize(v1c0.f179226b) - this.f172081m.getHeight();
            this.f172080l.animate().translationY(dimensionPixelSize).start();
            this.f172075g.animate().translationY(dimensionPixelSize / 2).start();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m190672y(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public boolean m190671o() {
        if (!NullChecker.m81303a(this.f172086r) || this.f172086r.isIconified()) {
            return false;
        }
        if (!this.f172086r.isIconified()) {
            this.f172086r.setQuery("", true);
            this.f172086r.setIconified(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public View m190672y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return utw.m195310b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public View m190673z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vtw.m200053b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l.ttw$b */
    public class C20271b implements mbh0 {
        public C20271b() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            if (ttw.this.f172076h.getChildCount() > 0) {
                ttw.this.f172076h.getChildAt(0).setVisibility(8);
            }
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ttw$e */
    public class C20274e implements Animator.AnimatorListener {
        public C20274e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ttw.this.f172083o.setAlpha(0.0f);
            ttw.this.f172083o.setVisibility(4);
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

    /* JADX INFO: renamed from: l.ttw$f */
    public class C20275f implements Animator.AnimatorListener {
        public C20275f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ttw.this.f172083o.setTag(Boolean.FALSE);
            ttw.this.f172083o.setAlpha(1.0f);
            ttw.this.f172083o.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (((Boolean) ttw.this.f172083o.getTag()).booleanValue()) {
                ttw.this.f172083o.setVisibility(4);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ttw.this.f172083o.setTag(Boolean.TRUE);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.ttw$a */
    public class C20270a implements AbsListView.OnScrollListener {
        public C20270a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (i != 0 || ttw.this.f172065B.m123117q0()) {
                return;
            }
            ttw.this.f172075g.setTranslationY(ttw.this.f172069a.getTop() / 2);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }
}
