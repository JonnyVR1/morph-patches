package p003l;

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
import com.p000p1.mobile.putong.core.p001ui.map.MapListView;
import com.p000p1.mobile.putong.core.p001ui.map.MapPoiItem;
import com.p000p1.mobile.putong.core.p001ui.map.TouchProxyForMap;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.e51;
import l.f6c0;
import l.h7c0;
import l.hfw;
import l.mbh0;
import l.qib0;
import l.s7m;
import l.t100;
import l.u4c0;
import l.utw;
import l.v1c0;
import l.vtw;
import l.vwb;
import l.wtw;
import l.xdl0;
import l.xtw;
import p028v.VFrame_Anim;
import p028v.VLinear;
import p028v.VList;
import p028v.VProgressBar;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ttw implements s7m<ftw> {

    /* JADX INFO: renamed from: F */
    public static final List<String> f7722F = vwb.f0(new String[]{"黑龙江省", "吉林省", "辽宁省", "河北省", "河南省", "湖北省", "湖南省", "山东省", "山西省", "陕西省", "甘肃省", "青海省", "江苏省", "安徽省", "浙江省", "福建省", "江西省", "广东省", "台湾省", "海南省", "四川省", "云南省", "贵州省", "内蒙古自治区", "宁夏回族自治区", "新疆维吾尔自治区", "西藏自治区", "广西壮族自治区"});

    /* JADX INFO: renamed from: A */
    public boolean f7723A;

    /* JADX INFO: renamed from: B */
    public ftw f7724B;

    /* JADX INFO: renamed from: C */
    public Context f7725C;

    /* JADX INFO: renamed from: a */
    public TouchProxyForMap f7728a;

    /* JADX INFO: renamed from: b */
    public VText f7729b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f7730c;

    /* JADX INFO: renamed from: d */
    public VFrame_Anim f7731d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f7732e;

    /* JADX INFO: renamed from: f */
    public VText f7733f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f7734g;

    /* JADX INFO: renamed from: h */
    public MapView f7735h;

    /* JADX INFO: renamed from: i */
    public ImageView f7736i;

    /* JADX INFO: renamed from: j */
    public ImageView f7737j;

    /* JADX INFO: renamed from: k */
    public VText f7738k;

    /* JADX INFO: renamed from: l */
    public MapListView f7739l;

    /* JADX INFO: renamed from: m */
    public VLinear f7740m;

    /* JADX INFO: renamed from: n */
    public VText f7741n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f7742o;

    /* JADX INFO: renamed from: p */
    public VList f7743p;

    /* JADX INFO: renamed from: q */
    public MapPoiItem f7744q;

    /* JADX INFO: renamed from: r */
    public SearchView f7745r;

    /* JADX INFO: renamed from: s */
    public MenuItem f7746s;

    /* JADX INFO: renamed from: t */
    public View f7747t;

    /* JADX INFO: renamed from: u */
    public SuggestionSearch f7748u;

    /* JADX INFO: renamed from: v */
    public boolean f7749v;

    /* JADX INFO: renamed from: w */
    public View f7750w;

    /* JADX INFO: renamed from: x */
    public TextView f7751x;

    /* JADX INFO: renamed from: z */
    public boolean f7753z;

    /* JADX INFO: renamed from: y */
    public String f7752y = null;

    /* JADX INFO: renamed from: D */
    public e30<List<SuggestionResult.SuggestionInfo>> f7726D = new e30() { // from class: l.gtw
        @Override // p003l.e30
        public final void call(Object obj) {
            this.f4009a.m8005L((List) obj);
        }
    };

    /* JADX INFO: renamed from: E */
    public f30<me3, SuggestionResult.SuggestionInfo> f7727E = new f30() { // from class: l.ktw
        @Override // p003l.f30
        public final void call(Object obj, Object obj2) {
            this.f5068a.m8006N((me3) obj, (SuggestionResult.SuggestionInfo) obj2);
        }
    };

    /* JADX INFO: renamed from: l.ttw$c */
    public class C0564c extends bt0.j {
        public C0564c() {
        }

        public void onAnimationEnd(Animator animator) {
            VLinear vLinear = ttw.this.f7740m;
            vLinear.setTranslationY(vLinear.getHeight());
        }
    }

    /* JADX INFO: renamed from: l.ttw$d */
    public class C0565d implements SearchView.m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ me3 f7757a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dvg0 f7758b;

        public C0565d(me3 me3Var, dvg0 dvg0Var) {
            this.f7757a = me3Var;
            this.f7758b = dvg0Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m8029a(String str) {
            ttw.this.f7746s.setEnabled(false);
            ttw.this.f7750w.setEnabled(false);
            xdl0.M(ttw.this.f7747t, (str == null || str.isEmpty()) ? false : true);
            ftw unused = ttw.this.f7724B;
            hfw.a("MapActPresenter", " onQueryTextChange newText = " + str);
            if (!TextUtils.isEmpty(str)) {
                ttw.this.f7753z = true;
            }
            if (!TextUtils.isEmpty(str) && NullChecker.a(this.f7757a.f5598h) && NullChecker.a(this.f7757a.f5598h.city)) {
                ttw.this.f7748u.requestSuggestion(new SuggestionSearchOption().city(this.f7757a.f5598h.city).keyword(str));
                ttw.this.f7749v = true;
            } else {
                this.f7758b.m3742t(new ArrayList(), ttw.this.f7726D);
                ttw.this.f7749v = false;
            }
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m8030b(String str) {
            return false;
        }
    }

    public ttw(Context context) {
        this.f7725C = context;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Boolean m7974M(SuggestionResult.SuggestionInfo suggestionInfo, String str) {
        return Boolean.valueOf(str.equals(suggestionInfo.key));
    }

    /* JADX INFO: renamed from: A */
    public View m7994A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wtw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B */
    public View m7995B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xtw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m8021i1(ftw ftwVar) {
        this.f7724B = ftwVar;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7997C0() {
        return this.f7725C;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E */
    public void m7998E(boolean z) {
        this.f7729b.setText(z ? R.string.rh : R.string.sh);
        this.f7741n.setText(z ? R.string.uh : R.string.vh);
    }

    /* JADX INFO: renamed from: F */
    public boolean m7999F() {
        return this.f7723A;
    }

    /* JADX INFO: renamed from: G */
    public boolean m8000G() {
        return this.f7753z;
    }

    /* JADX INFO: renamed from: H */
    public void m8001H(boolean z) {
        if (NullChecker.a(this.f7745r)) {
            act().hideInput(this.f7745r);
            if (!z) {
                m8019a0(false);
            }
            this.f7745r.clearFocus();
            this.f7747t.setVisibility(8);
            if (NullChecker.a(this.f7746s)) {
                this.f7746s.setEnabled(false);
                this.f7750w.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public View m8002I(ViewGroup viewGroup, int i) {
        return i == 0 ? act().inflater().inflate(f6c0.Nd, viewGroup, false) : this.f7730c;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: J */
    public void m8003J(int i, final me3 me3Var, dvg0 dvg0Var, c cVar) {
        if (!(cVar instanceof c.a)) {
            if (cVar == c.i) {
                this.f7735h.onResume();
                return;
            }
            if (cVar == c.j) {
                this.f7735h.onPause();
                return;
            }
            if (cVar == c.m) {
                this.f7724B.f3720h.clear();
                this.f7735h.onDestroy();
                this.f7724B.f3723k.destroy();
                this.f7724B.f3724l.destroy();
                this.f7748u.destroy();
                BitmapDescriptor bitmapDescriptor = this.f7724B.f3725m;
                if (bitmapDescriptor != null) {
                    bitmapDescriptor.recycle();
                }
                BitmapDescriptor bitmapDescriptor2 = this.f7724B.f3721i;
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
            act().setTitle(act().string(R.string.Q1));
        }
        m7995B(act().inflater(), this.f7739l);
        xdl0.M(this.f7739l, false);
        this.f7739l.addHeaderView(this.f7728a);
        MapPoiItem mapPoiItem = (MapPoiItem) act().inflater().inflate(f6c0.Nd, (ViewGroup) this.f7739l, false);
        this.f7744q = mapPoiItem;
        this.f7739l.addHeaderView(mapPoiItem);
        m7994A(act().inflater(), this.f7739l);
        this.f7739l.addHeaderView(this.f7729b);
        m8024z(act().inflater(), this.f7739l);
        this.f7739l.setAdapter((ListAdapter) me3Var);
        this.f7739l.setOnScrollListener(new C0562a());
        this.f7735h.showZoomControls(false);
        this.f7724B.f3720h = this.f7735h.getMap();
        this.f7724B.f3720h.setMapStatus(MapStatusUpdateFactory.zoomTo(17.0f));
        qib0.E.t();
        ftw ftwVar = this.f7724B;
        ftwVar.f3720h.setOnMapStatusChangeListener(ftwVar);
        this.f7724B.f3723k = GeoCoder.newInstance();
        this.f7724B.f3724l = PoiSearch.newInstance();
        this.f7724B.f3723k.setOnGetGeoCodeResultListener(me3Var);
        this.f7724B.f3724l.setOnGetPoiSearchResultListener(me3Var);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7734g.getLayoutParams();
        marginLayoutParams.bottomMargin -= t100.d(32.0f);
        marginLayoutParams.topMargin -= t100.d(32.0f);
        this.f7741n.setOnClickListener(new View.OnClickListener() { // from class: l.stw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7302a.m8004K(me3Var, view);
            }
        });
        this.f7743p.setAdapter((ListAdapter) dvg0Var);
        SuggestionSearch suggestionSearchNewInstance = SuggestionSearch.newInstance();
        this.f7748u = suggestionSearchNewInstance;
        suggestionSearchNewInstance.setOnGetSuggestionResultListener(new OnGetSuggestionResultListener() { // from class: l.htw
        });
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 24 || i2 == 25) {
            act().addSwipeBackListener(new C0563b());
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m8004K(me3 me3Var, View view) {
        m8020b0(this.f7724B.m4452q0(), me3Var, false);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m8005L(List list) {
        xdl0.M0(this.f7743p, list.size() > 0);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m8006N(me3 me3Var, final SuggestionResult.SuggestionInfo suggestionInfo) {
        this.f7745r.setQuery(suggestionInfo.key, false);
        if (!TextUtils.isEmpty(suggestionInfo.city)) {
            me3Var.m6357I(suggestionInfo, suggestionInfo.city, false);
        } else if (vwb.m(f7722F, new w9j() { // from class: l.jtw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ttw.m7974M(suggestionInfo, (String) obj);
            }
        })) {
            me3Var.m6357I(suggestionInfo, suggestionInfo.key, true);
        } else {
            PoiInfo poiInfo = me3Var.f5598h;
            me3Var.m6357I(suggestionInfo, poiInfo != null ? poiInfo.city : null, false);
        }
        m8001H(false);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m8007O(View view) {
        this.f7724B.m4445L0();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Boolean m8008P() {
        this.f7745r.setMaxWidth((xdl0.y0() - t100.d(72.0f)) - Math.max(this.f7750w.getMeasuredWidth(), t100.d(56.0f)));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m8009Q(SearchableInfo searchableInfo) {
        SearchView searchView = this.f7745r;
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m8010R() {
        final SearchableInfo searchableInfo = ((SearchManager) act().getSystemService("search")).getSearchableInfo(act().getComponentName());
        e51.F(act(), new Runnable() { // from class: l.itw
            @Override // java.lang.Runnable
            public final void run() {
                this.f4495a.m8009Q(searchableInfo);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m8011S(int i, View view) {
        this.f7751x.setText(i == 0 ? act().string(R.string.v) : act().string(R.string.b));
        this.f7746s.setTitle(act().actionItemPadding(i == 0 ? act().string(R.string.v) : act().string(R.string.b)));
        this.f7746s.setEnabled(false);
        this.f7750w.setEnabled(false);
        this.f7745r.requestFocus();
        m8019a0(true);
        this.f7747t.setVisibility(8);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ boolean m8012T() {
        m8019a0(false);
        xdl0.M0(this.f7743p, false);
        this.f7746s.setEnabled(true);
        this.f7750w.setEnabled(true);
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m8013U(View view, boolean z) {
        if (z) {
            m8019a0(true);
        } else {
            this.f7747t.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m8014V(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.a(this.f7745r)) {
            this.f7745r.setIconified(true);
        }
        if (NullChecker.a(this.f7745r)) {
            this.f7745r.setIconified(true);
        }
        m8019a0(false);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public void m8015W(int i) {
        this.f7739l.smoothScrollToPosition(i);
    }

    /* JADX INFO: renamed from: X */
    public void m8016X() {
        this.f7731d.m11503G(this.f7732e);
    }

    /* JADX INFO: renamed from: Y */
    public void m8017Y(List<PoiInfo> list, PoiInfo poiInfo, int i, int i2, boolean z) {
        if (NullChecker.a(poiInfo)) {
            this.f7744q.m407R(poiInfo, i, i2, z);
        }
        if (list.isEmpty()) {
            return;
        }
        xdl0.M(this.f7739l, true);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m8018Z(final int i, me3 me3Var, dvg0 dvg0Var, Menu menu) {
        act().getMenuInflater().inflate(h7c0.d, menu);
        MenuItem menuItemFindItem = menu.findItem(u4c0.m8);
        this.f7746s = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        this.f7750w = actionView;
        this.f7751x = (TextView) actionView.findViewById(u4c0.n8);
        act().getAppTheme().j(this.f7751x);
        if (NullChecker.a(CoreModule.c)) {
            this.f7751x.setTextColor(act().getResources().getColorStateList(CoreBusinessModule.m0().c()));
        }
        this.f7751x.setText(i == 0 ? act().string(R.string.v) : act().string(R.string.b));
        this.f7746s.setTitle(act().actionItemPadding(i == 0 ? act().string(R.string.v) : act().string(R.string.b)));
        this.f7746s.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.mtw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5766a.m8007O(view);
            }
        });
        this.f7745r = menu.findItem(u4c0.k8).getActionView();
        xdl0.b0(this.f7750w, new v9j() { // from class: l.ntw
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f5970a.m8008P();
            }
        });
        e51.y(new Runnable() { // from class: l.otw
            @Override // java.lang.Runnable
            public final void run() {
                this.f6222a.m8010R();
            }
        });
        try {
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            this.f7747t = (View) declaredField.get(this.f7745r);
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
        } catch (IllegalArgumentException e2) {
            CrashHelper.c(e2);
        } catch (NoSuchFieldException e3) {
            CrashHelper.c(e3);
        }
        act().getAppTheme().l(this.f7745r);
        this.f7745r.setOnSearchClickListener(new View.OnClickListener() { // from class: l.ptw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6508a.m8011S(i, view);
            }
        });
        this.f7745r.setOnQueryTextListener(new C0565d(me3Var, dvg0Var));
        this.f7745r.setOnCloseListener(new SearchView.l() { // from class: l.qtw
            public final boolean onClose() {
                return this.f6696a.m8012T();
            }
        });
        this.f7745r.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.rtw
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f7068a.m8013U(view, z);
            }
        });
        act().pendChangeActionButtonTypeface();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m8019a0(boolean z) {
        if (z && this.f7742o.getVisibility() != 0) {
            this.f7742o.setVisibility(0);
            this.f7742o.setAlpha(0.0f);
            this.f7742o.animate().alpha(1.0f).setListener(new C0566e()).start();
            this.f7742o.setOnTouchListener(new View.OnTouchListener() { // from class: l.ltw
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f5414a.m8014V(view, motionEvent);
                }
            });
            return;
        }
        if (z || this.f7742o.getVisibility() != 0) {
            return;
        }
        this.f7742o.setAlpha(1.0f);
        this.f7742o.animate().alpha(0.0f).setListener(new C0567f()).start();
        this.f7742o.setOnTouchListener(null);
    }

    /* JADX INFO: renamed from: b0 */
    public void m8020b0(boolean z, me3 me3Var, boolean z2) {
        if (z2 != z) {
            this.f7724B.m4450o0(z2);
            VLinear vLinear = this.f7740m;
            if (!z2) {
                vLinear.animate().translationY(t100.d(49.0f)).setListener(new C0564c()).start();
                this.f7739l.animate().translationY(0.0f).start();
                this.f7734g.animate().translationY(0.0f).start();
                me3Var.m6354F();
                return;
            }
            vLinear.setTranslationY(t100.d(49.0f));
            this.f7740m.animate().translationY(0.0f).setListener(new bt0.j()).start();
            this.f7739l.smoothScrollToPosition(0);
            int dimensionPixelSize = act().getResources().getDimensionPixelSize(v1c0.b) - this.f7740m.getHeight();
            this.f7739l.animate().translationY(dimensionPixelSize).start();
            this.f7734g.animate().translationY(dimensionPixelSize / 2).start();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8023y(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public boolean m8022o() {
        if (!NullChecker.a(this.f7745r) || this.f7745r.isIconified()) {
            return false;
        }
        if (!this.f7745r.isIconified()) {
            this.f7745r.setQuery("", true);
            this.f7745r.setIconified(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public View m8023y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return utw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public View m8024z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vtw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l.ttw$b */
    public class C0563b implements mbh0 {
        public C0563b() {
        }

        /* JADX INFO: renamed from: O */
        public void m8027O() {
            if (ttw.this.f7735h.getChildCount() > 0) {
                ttw.this.f7735h.getChildAt(0).setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: E0 */
        public void m8026E0() {
        }

        /* JADX INFO: renamed from: Z */
        public void m8028Z() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m8025D0(boolean z, float f, int i) {
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ttw$e */
    public class C0566e implements Animator.AnimatorListener {
        public C0566e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ttw.this.f7742o.setAlpha(0.0f);
            ttw.this.f7742o.setVisibility(4);
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
    public class C0567f implements Animator.AnimatorListener {
        public C0567f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ttw.this.f7742o.setTag(Boolean.FALSE);
            ttw.this.f7742o.setAlpha(1.0f);
            ttw.this.f7742o.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (((Boolean) ttw.this.f7742o.getTag()).booleanValue()) {
                ttw.this.f7742o.setVisibility(4);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ttw.this.f7742o.setTag(Boolean.TRUE);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.ttw$a */
    public class C0562a implements AbsListView.OnScrollListener {
        public C0562a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (i != 0 || ttw.this.f7724B.m4452q0()) {
                return;
            }
            ttw.this.f7734g.setTranslationY(ttw.this.f7728a.getTop() / 2);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }
}
