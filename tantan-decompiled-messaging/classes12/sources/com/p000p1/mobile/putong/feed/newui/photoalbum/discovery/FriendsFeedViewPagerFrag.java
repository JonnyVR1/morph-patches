package com.p000p1.mobile.putong.feed.newui.photoalbum.discovery;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.k;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONException;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedSelectParams;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateFollowFeedHeaderView;
import com.p000p1.mobile.putong.feed.newui.view.RoamEntranceView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.du2;
import l.dyl;
import l.e30;
import l.j760;
import l.kmc0;
import l.mji0;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;
import l.wmf0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p007l.a8c0;
import p007l.b5c0;
import p007l.c9j;
import p007l.e1c0;
import p007l.f3c0;
import p007l.fm20;
import p007l.hx60;
import p007l.j60;
import p007l.lwh;
import p007l.m3h;
import p007l.m3i;
import p007l.mwh;
import p007l.n7c;
import p007l.nkg;
import p007l.o6c0;
import p007l.pyg;
import p007l.v9h;
import p007l.ywh;
import rx.subjects.b;
import v.VFrame;
import v.VImage;
import v.VText;
import v.navigationbar.VNavigationBar;
import v.navigationbar.VNavigationTabLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FriendsFeedViewPagerFrag extends PutongFrag {

    /* JADX INFO: renamed from: F0 */
    public static String f2954F0 = "";

    /* JADX INFO: renamed from: G0 */
    public static List<FeedSelectParams> f2955G0;

    /* JADX INFO: renamed from: H0 */
    public static List<String> f2956H0;

    /* JADX INFO: renamed from: I0 */
    public static b<roj0> f2957I0 = b.b();

    /* JADX INFO: renamed from: J0 */
    public static boolean f2958J0 = true;

    /* JADX INFO: renamed from: K0 */
    public static b<Boolean> f2959K0 = b.b();

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f2960A;

    /* JADX INFO: renamed from: B */
    public VFrame f2961B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f2962C;

    /* JADX INFO: renamed from: D */
    public boolean f2963D;

    /* JADX INFO: renamed from: E */
    public boolean f2964E;

    /* JADX INFO: renamed from: E0 */
    public boolean f2965E0;

    /* JADX INFO: renamed from: F */
    public boolean f2966F;

    /* JADX INFO: renamed from: G */
    public boolean f2967G;

    /* JADX INFO: renamed from: H */
    public boolean f2968H;

    /* JADX INFO: renamed from: I */
    public PhotoAlbumFeedFrag f2969I;

    /* JADX INFO: renamed from: J */
    public PhotoAlbumFeedFrag f2970J;

    /* JADX INFO: renamed from: K */
    public PhotoAlbumFeedFrag f2971K;

    /* JADX INFO: renamed from: N */
    public List<PutongFrag> f2974N;

    /* JADX INFO: renamed from: Q */
    public VNavigationTabLayout f2977Q;

    /* JADX INFO: renamed from: V */
    public VImage f2982V;

    /* JADX INFO: renamed from: X */
    public RoamEntranceView f2984X;

    /* JADX INFO: renamed from: Z */
    public boolean f2986Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f2987k0;

    /* JADX INFO: renamed from: p0 */
    public PopupWindow f2988p0;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f2989z;

    /* JADX INFO: renamed from: L */
    public List<PhotoAlbumFeedFrag> f2972L = new ArrayList();

    /* JADX INFO: renamed from: M */
    public int f2973M = -1;

    /* JADX INFO: renamed from: O */
    public C2129a f2975O = null;

    /* JADX INFO: renamed from: P */
    public List<String> f2976P = new ArrayList();

    /* JADX INFO: renamed from: R */
    public TextView[] f2978R = new TextView[4];

    /* JADX INFO: renamed from: S */
    public ImageView[] f2979S = new ImageView[4];

    /* JADX INFO: renamed from: T */
    public AnimEffectPlayer[] f2980T = new AnimEffectPlayer[4];

    /* JADX INFO: renamed from: U */
    public int f2981U = 0;

    /* JADX INFO: renamed from: W */
    public ArrayList<j60> f2983W = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    public boolean f2985Y = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag$a */
    public class C2129a extends FragmentPagerAdapter implements ViewPager.j, dyl {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f2990a;

        /* JADX INFO: renamed from: b */
        public Method f2991b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f2992c;

        /* JADX INFO: renamed from: d */
        public wmf0<String> f2993d;

        /* JADX INFO: renamed from: e */
        public wmf0<String> f2994e;

        public C2129a(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f2990a = new ArrayList();
            this.f2992c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f2991b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.c(e);
                this.f2991b = null;
            } catch (SecurityException e2) {
                CrashHelper.c(e2);
                this.f2991b = null;
            }
            this.f2993d = new wmf0<>();
            this.f2994e = new wmf0<>();
            m5226p();
            m5227q();
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: a */
        public Animator m5218a(int i, @NonNull @NotNull View view) {
            return (Animator) dyl.l0.call(view);
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: b */
        public Animator m5219b(int i, @NonNull @NotNull View view) {
            return (Animator) dyl.l0.call(view);
        }

        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.destroyItem(viewGroup, i, obj);
            try {
                ((k) kmc0.l(this).e("mCurTransaction").h()).r((Fragment) obj);
            } catch (Throwable th) {
                CrashHelper.d(th, 10);
            }
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> m5220g(int i) {
            return null;
        }

        public int getCount() {
            return this.f2990a.size();
        }

        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f2990a.get(i);
        }

        public long getItemId(int i) {
            return this.f2990a.get(i).hashCode();
        }

        public int getItemPosition(Object obj) {
            int iHashCode = obj.hashCode();
            String str = (String) this.f2994e.d(iHashCode);
            if (str == null) {
                return -2;
            }
            int iL = this.f2993d.l();
            for (int i = 0; i < iL; i++) {
                int iF = this.f2993d.f(i);
                if (iF == iHashCode) {
                    return str.equals((String) this.f2993d.d(iF)) ? -1 : -2;
                }
            }
            return -1;
        }

        public CharSequence getPageTitle(int i) {
            return (CharSequence) FriendsFeedViewPagerFrag.this.f2976P.get(i);
        }

        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.a(this.f2992c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f2992c.t0());
                    sb.append(";");
                    sb.append("lstFrag :" + this.f2990a);
                    du2.a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: k */
        public Fragment m5221k(int i) {
            Fragment fragmentI0;
            Method method = this.f2991b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentI0 = FriendsFeedViewPagerFrag.this.getChildFragmentManager().i0((String) method.invoke(this, Integer.valueOf(FriendsFeedViewPagerFrag.this.f2960A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.c(e);
                fragmentI0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.c(e2);
                fragmentI0 = null;
            }
            return fragmentI0 == null ? getItem(i) : fragmentI0;
        }

        /* JADX INFO: renamed from: l */
        public View m5222l(int i) {
            View viewInflate = FriendsFeedViewPagerFrag.this.act().inflater().inflate(o6c0.f11340y0, (ViewGroup) null);
            TextView titleView = ((FeedLikeTabTitleView) viewInflate.findViewById(b5c0.f6012W1)).getTitleView();
            FriendsFeedViewPagerFrag.this.f2978R[i] = titleView;
            FriendsFeedViewPagerFrag.this.f2979S[i] = (ImageView) viewInflate.findViewById(b5c0.f6106y0);
            FriendsFeedViewPagerFrag.this.f2980T[i] = (AnimEffectPlayer) viewInflate.findViewById(b5c0.f6109z0);
            titleView.setText((CharSequence) FriendsFeedViewPagerFrag.this.f2976P.get(i));
            xdl0.W(titleView, i == 0 ? 0 : t100.d(4.0f));
            return viewInflate;
        }

        /* JADX INFO: renamed from: m */
        public final void m5223m() {
            m5227q();
            notifyDataSetChanged();
            m5226p();
        }

        /* JADX INFO: renamed from: n */
        public void m5224n(List<PutongFrag> list) {
            FriendsFeedViewPagerFrag.this.f2974N = list;
            this.f2990a.clear();
            if (NullChecker.b(list)) {
                this.f2990a.addAll(list);
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: o */
        public void m5225o(int i, PutongFrag putongFrag) {
            int iIndexOf = this.f2990a.indexOf(putongFrag);
            if (iIndexOf == -1) {
                if (this.f2990a.get(i) == null) {
                    return;
                }
                this.f2990a.set(i, putongFrag);
                m5223m();
                FriendsFeedViewPagerFrag.this.f2960A.setCurrentItem(i);
                return;
            }
            CrashHelper.c(new Exception("----FriendsFeedViewPagerFrag fragment already add Exception-----i=" + iIndexOf + ";lstFrag.size=" + this.f2990a.size() + ";newFragment=" + putongFrag));
        }

        public void onPageScrollStateChanged(int i) {
            if (nkg.m12266t0() && i == 0) {
                FeedStateFollowFeedHeaderView.f4386h.onNext("");
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (nkg.m12268u0()) {
                m3i.m11762m().m11768l();
            }
            FeedModule.f316d.m16480J6();
            PhotoAlbumFeedFrag photoAlbumFeedFragM5221k = FriendsFeedViewPagerFrag.this.f2975O.m5221k(i);
            boolean z = photoAlbumFeedFragM5221k instanceof PhotoAlbumFeedFrag;
            if (z) {
                if (photoAlbumFeedFragM5221k.m5442Q4()) {
                    FeedModule.m1140H().jg(FriendsFeedViewPagerFrag.this.act(), false);
                } else {
                    FeedModule.m1140H().Pq(FriendsFeedViewPagerFrag.this.act(), false);
                }
            }
            FriendsFeedViewPagerFrag.this.m5195Z5();
            FriendsFeedViewPagerFrag.this.m5200e6();
            FriendsFeedViewPagerFrag.this.m5182G5();
            FriendsFeedViewPagerFrag.this.f2981U = i;
            FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = FriendsFeedViewPagerFrag.this;
            friendsFeedViewPagerFrag.m5205h6(friendsFeedViewPagerFrag.m5181D5(i));
            if (i == 0 && nkg.m12201B() && z) {
                PhotoAlbumFeedFrag photoAlbumFeedFrag = photoAlbumFeedFragM5221k;
                hx60 hx60Var = photoAlbumFeedFrag.m5444S4().f6851j;
                if (hx60Var == null) {
                    return;
                }
                long j = hx60Var.f8834a;
                if (j > 0 && System.currentTimeMillis() - j > fm20.m10232l()) {
                    photoAlbumFeedFrag.m5450Y4();
                }
            } else if (nkg.m12213K() && i == 1 && ((TextUtils.equals(FriendsFeedViewPagerFrag.this.f2978R[i].getText().toString(), fm20.m10229i()) || TextUtils.equals(FriendsFeedViewPagerFrag.this.f2978R[i].getText().toString(), fm20.m10228h())) && z && (FriendsFeedViewPagerFrag.this.f2979S[i].getVisibility() == 0 || FriendsFeedViewPagerFrag.this.f2965E0))) {
                FriendsFeedViewPagerFrag.this.f2965E0 = true;
                photoAlbumFeedFragM5221k.m5450Y4();
            }
            PhotoAlbumPictureView.m4886u(FriendsFeedViewPagerFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (i2 < this.f2990a.size()) {
                PhotoAlbumFeedFrag photoAlbumFeedFragM5221k2 = m5221k(i2);
                if (photoAlbumFeedFragM5221k2 instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag2 = photoAlbumFeedFragM5221k2;
                    photoAlbumFeedFrag2.m5460h5(i2 == i);
                    photoAlbumFeedFrag2.m5459g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag2.m5451Z4();
                    }
                }
                i2++;
            }
            FriendsFeedViewPagerFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f316d.f14963Y0.onNext(Boolean.FALSE);
            }
            n7c.m12098e().m12099a((String) FriendsFeedViewPagerFrag.this.f2976P.get(FriendsFeedViewPagerFrag.this.f2981U));
            boolean zM5208q5 = FriendsFeedViewPagerFrag.this.m5208q5();
            FriendsFeedViewPagerFrag friendsFeedViewPagerFrag2 = FriendsFeedViewPagerFrag.this;
            int iM5177z5 = zM5208q5 ? friendsFeedViewPagerFrag2.m5177z5() : friendsFeedViewPagerFrag2.m5137C5();
            if (xdl0.O0(FriendsFeedViewPagerFrag.this.f2979S[iM5177z5]) || xdl0.O0(FriendsFeedViewPagerFrag.this.f2980T[iM5177z5])) {
                FriendsFeedViewPagerFrag.this.m5204g6(true);
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m5226p() {
            this.f2993d.clear();
            for (int i = 0; i < this.f2990a.size(); i++) {
                this.f2993d.j(Long.valueOf(getItemId(i)).intValue(), String.valueOf(i));
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m5227q() {
            this.f2994e.clear();
            for (int i = 0; i < this.f2990a.size(); i++) {
                this.f2994e.j(Long.valueOf(getItemId(i)).intValue(), String.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag$b */
    public class C2130b implements VNavigationTabLayout.d {
        public C2130b() {
        }

        /* JADX INFO: renamed from: a */
        public void m5228a(VNavigationTabLayout.f fVar) {
            mji0.o(FriendsFeedViewPagerFrag.this.f2978R[fVar.f()], a8c0.f5649r);
            View viewD = fVar.d();
            if (viewD != null) {
                ((FeedLikeTabTitleView) viewD.findViewById(b5c0.f6012W1)).getTitleView().setBackgroundResource(f3c0.f7728W0);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m5229b(VNavigationTabLayout.f fVar) {
        }

        /* JADX INFO: renamed from: c */
        public void m5230c(VNavigationTabLayout.f fVar) {
            View viewD;
            int iF = fVar.f();
            if (nkg.m12213K() && iF == 1 && (viewD = fVar.d()) != null) {
                FeedLikeTabTitleView feedLikeTabTitleView = (FeedLikeTabTitleView) viewD.findViewById(b5c0.f6012W1);
                if (NullChecker.a(feedLikeTabTitleView) && feedLikeTabTitleView.m5481q0()) {
                    feedLikeTabTitleView.m5484t0();
                }
            }
            if (NullChecker.a(FriendsFeedViewPagerFrag.this.f2982V)) {
                if (!nkg.m12205D() && !nkg.m12213K()) {
                    xdl0.M(FriendsFeedViewPagerFrag.this.f2982V, false);
                }
                if (!nkg.m12205D() && nkg.m12213K()) {
                    xdl0.M(FriendsFeedViewPagerFrag.this.f2982V, iF == 1);
                }
                if (nkg.m12205D() && !nkg.m12213K()) {
                    xdl0.M(FriendsFeedViewPagerFrag.this.f2982V, iF == 0);
                }
                if (nkg.m12205D() && nkg.m12213K()) {
                    xdl0.M(FriendsFeedViewPagerFrag.this.f2982V, true);
                }
            }
            if (NullChecker.a(FriendsFeedViewPagerFrag.this.f2984X)) {
                xdl0.M(FriendsFeedViewPagerFrag.this.f2984X, iF == 0);
            }
            mji0.o(FriendsFeedViewPagerFrag.this.f2978R[iF], a8c0.f5648q);
            View viewD2 = fVar.d();
            if (viewD2 != null) {
                ((FeedLikeTabTitleView) viewD2.findViewById(b5c0.f6012W1)).getTitleView().setBackgroundResource(f3c0.f7735X0);
            }
            if (!nkg.m12213K() && fm20.m10228h().equals(FriendsFeedViewPagerFrag.this.f2978R[iF].getText().toString())) {
                n7c.m12098e().m12105h();
                mwh.m12038d().m12049l(17);
                zvf0.u("e_second_tab", "p_follow", new j760[]{vwb.Y("sort_type", "follow")});
            }
            if (nkg.m12213K() && ((fm20.m10229i().equals(FriendsFeedViewPagerFrag.this.f2978R[iF].getText().toString()) || fm20.m10228h().equals(FriendsFeedViewPagerFrag.this.f2978R[iF].getText().toString())) && xdl0.O0(FriendsFeedViewPagerFrag.this.f2979S[iF]) && nkg.m12213K())) {
                FriendsFeedViewPagerFrag.this.f2965E0 = true;
            }
            if (fm20.m10236p().equals(FriendsFeedViewPagerFrag.this.f2978R[iF].getText().toString())) {
                mwh.m12038d().m12049l(16);
                zvf0.u("e_second_tab", "p_discover_dating", new j760[]{vwb.Y("sort_type", "dating")});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public int m5137C5() {
        List<String> list = this.f2976P;
        if (list != null) {
            return list.indexOf(fm20.m10229i());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m5138E4(c cVar) {
        if (cVar == c.i) {
            this.f2987k0 = false;
            this.f2986Z = false;
        } else if (cVar == c.k) {
            this.f2987k0 = true;
        }
    }

    /* JADX INFO: renamed from: E5 */
    private int m5139E5() {
        if (nkg.m12213K()) {
            return m5208q5() ? 17 : 15;
        }
        return TextUtils.equals(fm20.m10236p(), m5214x5()) ? 16 : 17;
    }

    /* JADX INFO: renamed from: F5 */
    private String m5140F5() {
        if (nkg.m12213K()) {
            return "p_discover_dating";
        }
        return null;
    }

    /* JADX INFO: renamed from: H5 */
    private void m5141H5() {
        m5175p5();
        if (this.f2968H) {
            this.f2971K.m5446U4().m8725j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m5143M5(roj0 roj0Var) {
        if (m5208q5()) {
            return;
        }
        VNavigationTabLayout.f fVarW = this.f2977Q.w(1);
        Objects.requireNonNull(fVarW);
        View viewD = fVarW.d();
        if (viewD == null) {
            return;
        }
        FeedLikeTabTitleView feedLikeTabTitleView = (FeedLikeTabTitleView) viewD.findViewById(b5c0.f6012W1);
        if (!NullChecker.a(feedLikeTabTitleView) || feedLikeTabTitleView.m5481q0()) {
            return;
        }
        feedLikeTabTitleView.setScrollTv(fm20.m10229i());
        feedLikeTabTitleView.m5482r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N5 */
    public /* synthetic */ void m5145N5(Boolean bool) {
        if (bool.booleanValue()) {
            NewPhotoAlbumFrag.f3001p1.onNext(Boolean.FALSE);
            DiscoveryPager discoveryPager = this.f2960A;
            if (discoveryPager == null) {
                this.f2985Y = true;
                return;
            }
            if (this.f2981U != 1) {
                discoveryPager.setCurrentItem(1);
            }
            if (m5208q5()) {
                this.f2965E0 = true;
                m5202f6();
            } else {
                v9h.f14114i = true;
                m5190T5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O5 */
    public /* synthetic */ void m5147O5(View view) {
        if (vwb.J(f2955G0) && nkg.m12205D()) {
            return;
        }
        if (nkg.m12205D()) {
            zvf0.r("e_select_icon", "p_discover_dating");
        }
        m5196a6(this.f2982V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P5 */
    public /* synthetic */ void m5149P5(Boolean bool) {
        if (this.f2981U == 1 && m5208q5() && this.f2965E0) {
            f2958J0 = false;
            m5202f6();
        } else if (this.f2981U == 1 && !m5208q5() && this.f2965E0) {
            this.f2965E0 = false;
            v9h.f14114i = true;
            n7c.m12098e().m12105h();
            mwh.m12038d().m12050m(15, "p_discover_dating");
            zvf0.u("e_second_tab", "p_follow", new j760[]{vwb.Y("sort_type", "like")});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public void m5186L5(int i) {
        this.f2979S[i].setVisibility(8);
        this.f2980T[i].setVisibility(8);
        if (nkg.m12213K()) {
            this.f2965E0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V5, reason: merged with bridge method [inline-methods] */
    public void m5185K5(int i) {
        if (f2958J0) {
            m5204g6(false);
            this.f2979S[i].setVisibility(0);
            if (nkg.m12213K()) {
                this.f2965E0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: n5 */
    public static FriendsFeedViewPagerFrag m5174n5() {
        return new FriendsFeedViewPagerFrag();
    }

    /* JADX INFO: renamed from: p5 */
    private void m5175p5() {
        if (NullChecker.a(this.f2970J) && NullChecker.a(this.f2971K)) {
            return;
        }
        this.f2970J = PhotoAlbumFeedFrag.m5435N4(FeedModule.m1139F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0, false);
        this.f2969I = PhotoAlbumFeedFrag.m5435N4(FeedModule.m1139F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
        this.f2971K = PhotoAlbumFeedFrag.m5434M4(FeedModule.m1139F().userId(), "from_discover_dating", -1, User.ID_TEAM_ACCOUNT, 14);
    }

    /* JADX INFO: renamed from: t5 */
    private void m5176t5(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                mwh.m12038d().m12056s(Integer.valueOf(i));
            } else {
                mwh.m12038d().m12053p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public int m5177z5() {
        List<String> list = this.f2976P;
        if (list != null) {
            return list.indexOf(fm20.m10228h());
        }
        return 0;
    }

    /* JADX INFO: renamed from: A5 */
    public PhotoAlbumFeedFrag m5178A5() {
        return this.f2971K;
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m5179B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m5180B5() {
        return m5213w5().m5442Q4();
    }

    /* JADX INFO: renamed from: D5 */
    public final int m5181D5(int i) {
        if (i == 0) {
            return 2;
        }
        return (i != 1 || m5208q5()) ? 1 : 5;
    }

    /* JADX INFO: renamed from: G5 */
    public void m5182G5() {
        m5213w5().m5447V4();
    }

    /* JADX INFO: renamed from: I5 */
    public void m5183I5() {
        int i = 0;
        while (i < this.f2977Q.getTabCount()) {
            View viewM5222l = this.f2975O.m5222l(i);
            VNavigationTabLayout.f fVarW = this.f2977Q.w(i);
            Objects.requireNonNull(fVarW);
            fVarW.n(viewM5222l);
            VNavigationTabLayout.f fVarW2 = this.f2977Q.w(i);
            Objects.requireNonNull(fVarW2);
            VNavigationTabLayout.TabView tabView = fVarW2.i;
            int iD = i == 0 ? t100.d(4.0f) : 0;
            VNavigationTabLayout.f fVarW3 = this.f2977Q.w(i);
            Objects.requireNonNull(fVarW3);
            int paddingTop = fVarW3.i.getPaddingTop();
            VNavigationTabLayout.f fVarW4 = this.f2977Q.w(i);
            Objects.requireNonNull(fVarW4);
            tabView.setPadding(iD, paddingTop, 0, fVarW4.i.getPaddingBottom());
            VText titleView = ((FeedLikeTabTitleView) viewM5222l.findViewById(b5c0.f6012W1)).getTitleView();
            mji0.o(titleView, i == 1 ? a8c0.f5648q : a8c0.f5649r);
            titleView.setBackgroundResource(i == 1 ? f3c0.f7735X0 : f3c0.f7728W0);
            i++;
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m5184J5() {
        this.f2968H = true;
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f2971K;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.m5446U4().m8725j0();
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m5187P0() {
        return m5213w5().m5440P0();
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m5188Q5(String str) {
        if (m5187P0()) {
            return;
        }
        f2954F0 = str;
        m5190T5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m5189R5(String str) {
        PhotoAlbumFeedFrag photoAlbumFeedFragM5435N4;
        if (this.f2976P.size() > 1) {
            this.f2976P.remove(1);
            this.f2976P.add(1, str);
            this.f2978R[1].setText(str);
        }
        if (TextUtils.equals(str, fm20.m10228h())) {
            this.f2970J = null;
            photoAlbumFeedFragM5435N4 = PhotoAlbumFeedFrag.m5435N4(FeedModule.m1139F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0, false);
            this.f2970J = photoAlbumFeedFragM5435N4;
        } else {
            this.f2969I = null;
            photoAlbumFeedFragM5435N4 = PhotoAlbumFeedFrag.m5435N4(FeedModule.m1139F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
            this.f2969I = photoAlbumFeedFragM5435N4;
        }
        m5193X5(photoAlbumFeedFragM5435N4);
        n7c.m12098e().m12099a(this.f2976P.get(this.f2981U));
    }

    /* JADX INFO: renamed from: T5 */
    public void m5190T5() {
        m5191U5(false);
    }

    /* JADX INFO: renamed from: U5 */
    public void m5191U5(boolean z) {
        if (!z) {
            m5213w5().m5450Y4();
            return;
        }
        if (vwb.J(this.f2974N)) {
            return;
        }
        int size = this.f2974N.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f2974N.get(i);
            boolean z2 = (fragment.getArguments() != null ? fragment.getArguments().getInt("page_type", -2) : -2) != 0;
            if ((fragment instanceof PhotoAlbumFeedFrag) && z2) {
                ((PhotoAlbumFeedFrag) fragment).m5450Y4();
            }
        }
    }

    /* JADX INFO: renamed from: W5 */
    public void m5192W5() {
        m5213w5().m5451Z4();
    }

    /* JADX INFO: renamed from: X5 */
    public final void m5193X5(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f2974N.remove(1);
        this.f2974N.add(1, photoAlbumFeedFrag);
        m5195Z5();
        m5200e6();
        this.f2975O.m5225o(1, photoAlbumFeedFrag);
        photoAlbumFeedFrag.m5460h5(true);
        photoAlbumFeedFrag.m5459g5(true);
        photoAlbumFeedFrag.m5454c5();
        m5183I5();
        m5205h6(m5181D5(1));
    }

    /* JADX INFO: renamed from: Y5 */
    public void m5194Y5() {
        m5213w5().m5452a5();
    }

    /* JADX INFO: renamed from: Z5 */
    public void m5195Z5() {
        m5213w5().m5453b5();
    }

    /* JADX INFO: renamed from: a6 */
    public final void m5196a6(VImage vImage) {
        VImage vImage2;
        PopupWindow popupWindow = this.f2988p0;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f2988p0.dismiss();
            return;
        }
        if (nkg.m12205D()) {
            vImage2 = vImage;
            this.f2988p0 = new pyg(vImage2, act(), f2955G0, f2954F0, new e30() { // from class: l.y8j
                public final void call(Object obj) {
                    this.f15301a.m5188Q5((String) obj);
                }
            });
        } else {
            vImage2 = vImage;
            if (nkg.m12213K()) {
                zvf0.r("e_type_popup", "p_like");
                this.f2988p0 = new m3h(vImage2, act(), f2956H0, this.f2976P.size() > 1 ? this.f2976P.get(1) : "", new e30() { // from class: l.z8j
                    public final void call(Object obj) {
                        this.f15661a.m5189R5((String) obj);
                    }
                });
            }
        }
        this.f2988p0.showAsDropDown(vImage2, t100.c().widthPixels - t100.d(12.0f), -t100.d(12.0f));
    }

    /* JADX INFO: renamed from: b6 */
    public void m5197b6(boolean z) {
        this.f2963D = z;
        if (NullChecker.a(this.f2975O)) {
            for (int i = 0; i < this.f2975O.f2990a.size(); i++) {
                PhotoAlbumFeedFrag photoAlbumFeedFrag = (Fragment) this.f2975O.f2990a.get(i);
                if (photoAlbumFeedFrag instanceof PhotoAlbumFeedFrag) {
                    photoAlbumFeedFrag.m5455e5(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m5198c6(boolean z) {
        this.f2967G = z;
        m5213w5().m5459g5(z);
    }

    /* JADX INFO: renamed from: d6 */
    public void m5199d6(boolean z) {
        this.f2966F = z;
        m5213w5().m5460h5(z);
    }

    /* JADX INFO: renamed from: e6 */
    public void m5200e6() {
        m5213w5().m5463m5();
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: f4 */
    public void m5201f4() {
        super.f4();
        if (nkg.m12213K() && NullChecker.a(act())) {
            duringCreated(act().lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.t8j
                public final void call(Object obj) {
                    this.f13231a.m5138E4((c) obj);
                }
            }));
        }
        if (nkg.m12213K()) {
            duringCreated(f2957I0).subscribe(mkd0.G(new e30() { // from class: l.u8j
                public final void call(Object obj) {
                    this.f13593a.m5143M5((roj0) obj);
                }
            }));
        }
        if (nkg.m12213K()) {
            duringCreated(NewPhotoAlbumFrag.f3001p1).subscribe(mkd0.G(new e30() { // from class: l.v8j
                public final void call(Object obj) {
                    this.f14103a.m5145N5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f6 */
    public final void m5202f6() {
        if (this.f2981U == 1 && m5208q5() && this.f2965E0) {
            this.f2965E0 = false;
            v9h.f14114i = true;
            n7c.m12098e().m12105h();
            mwh.m12038d().m12050m(15, "p_discover_dating");
            zvf0.u("e_second_tab", "p_follow", new j760[]{vwb.Y("sort_type", "like")});
        }
        if (this.f2976P.size() > 1) {
            this.f2976P.remove(1);
            this.f2976P.add(1, fm20.m10229i());
            this.f2978R[1].setText(fm20.m10229i());
        }
        this.f2969I = null;
        PhotoAlbumFeedFrag photoAlbumFeedFragM5435N4 = PhotoAlbumFeedFrag.m5435N4(FeedModule.m1139F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
        this.f2969I = photoAlbumFeedFragM5435N4;
        m5193X5(photoAlbumFeedFragM5435N4);
    }

    /* JADX INFO: renamed from: g4 */
    public void m5203g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f2976P.add(0, fm20.m10236p());
        boolean zM12213K = nkg.m12213K();
        List<String> list = this.f2976P;
        if (zM12213K) {
            list.add(1, fm20.m10229i());
        } else {
            list.add(1, fm20.m10228h());
        }
        m5141H5();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f2971K);
        if (nkg.m12213K()) {
            arrayList.add(this.f2969I);
        } else {
            arrayList.add(this.f2970J);
        }
        this.f2975O.m5224n(arrayList);
        this.f2960A.setOnPageChangeListener(this.f2975O);
        this.f2960A.setAdapter(this.f2975O);
        this.f2960A.setOffscreenPageLimit(1);
        this.f2962C.setBackgroundColor(act().getResources().getColor(e1c0.f7155n0));
        this.f2962C.setupViewPager(this.f2960A);
        this.f2977Q = this.f2962C.getTabLayout();
        xdl0.X(this.f2989z, t100.d(44.0f) + xdl0.F0());
        if (nkg.m12205D() || nkg.m12213K()) {
            try {
                String strF = RemoteConfig.x().F("feed_filter_params_configs");
                if (!TextUtils.isEmpty(strF)) {
                    f2955G0 = JsonParseHelper.parseList(strF, FeedSelectParams.JSON_ADAPTER);
                }
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
            if (!vwb.J(f2955G0)) {
                List<FeedSelectParams> list2 = f2955G0;
                f2954F0 = list2.get(list2.size() - 1).param;
            }
            ArrayList arrayList2 = new ArrayList();
            f2956H0 = arrayList2;
            arrayList2.add(fm20.m10229i());
            f2956H0.add(fm20.m10228h());
            VImage vImage = new VImage(act());
            this.f2982V = vImage;
            xdl0.M(vImage, !nkg.m12213K());
            this.f2982V.setPadding(t100.d(6.0f), t100.d(6.0f), t100.d(6.0f), t100.d(6.0f));
            FeedModule.m1140H().mm(this.f2982V, false);
            this.f2962C.setRightIconViews(new View[]{this.f2982V});
            xdl0.E0(this.f2982V, new View.OnClickListener() { // from class: l.w8j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14468a.m5147O5(view);
                }
            });
        }
        if (nkg.m12212J()) {
            this.f2984X = new RoamEntranceView(act());
            ywh.m17195a().m17198d(this.f2984X);
            boolean zA = NullChecker.a(this.f2982V);
            VNavigationBar vNavigationBar = this.f2962C;
            if (zA) {
                vNavigationBar.setRightIconViews(new View[]{this.f2984X, this.f2982V});
            } else {
                vNavigationBar.setRightIconViews(new View[]{this.f2984X});
            }
        }
        int i = 0;
        while (i < this.f2977Q.getTabCount()) {
            View viewM5222l = this.f2975O.m5222l(i);
            VNavigationTabLayout.f fVarW = this.f2977Q.w(i);
            Objects.requireNonNull(fVarW);
            fVarW.n(viewM5222l);
            VNavigationTabLayout.f fVarW2 = this.f2977Q.w(i);
            Objects.requireNonNull(fVarW2);
            VNavigationTabLayout.TabView tabView = fVarW2.i;
            int iD = i == 0 ? t100.d(4.0f) : 0;
            VNavigationTabLayout.f fVarW3 = this.f2977Q.w(i);
            Objects.requireNonNull(fVarW3);
            int paddingTop = fVarW3.i.getPaddingTop();
            VNavigationTabLayout.f fVarW4 = this.f2977Q.w(i);
            Objects.requireNonNull(fVarW4);
            tabView.setPadding(iD, paddingTop, 0, fVarW4.i.getPaddingBottom());
            VText titleView = ((FeedLikeTabTitleView) viewM5222l.findViewById(b5c0.f6012W1)).getTitleView();
            mji0.o(titleView, i == 0 ? a8c0.f5648q : a8c0.f5649r);
            titleView.setBackgroundResource(i == 0 ? f3c0.f7735X0 : f3c0.f7728W0);
            i++;
        }
        this.f2977Q.setOnTabSelectedListener(new C2130b());
        String strM10231k = fm20.m10231k();
        if (nkg.m12213K() && (TextUtils.equals(strM10231k, fm20.m10229i()) || this.f2985Y)) {
            this.f2981U = 1;
            this.f2960A.setCurrentItem(1);
            if (this.f2985Y) {
                this.f2985Y = false;
            }
            if (xdl0.O0(this.f2979S[1])) {
                FeedModule.f316d.m16702oc();
            }
        }
        duringCreated(f2959K0).subscribe(mkd0.G(new e30() { // from class: l.x8j
            public final void call(Object obj) {
                this.f14809a.m5149P5((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g6 */
    public final void m5204g6(boolean z) {
        int iM5177z5 = m5208q5() ? m5177z5() : m5137C5();
        this.f2980T[iM5177z5].stopAnimation();
        int i = this.f2981U;
        ImageView[] imageViewArr = this.f2979S;
        if (i == iM5177z5) {
            xdl0.X(imageViewArr[iM5177z5], t100.d(2.0f));
            xdl0.W(this.f2979S[iM5177z5], t100.d(2.0f));
            xdl0.X(this.f2980T[iM5177z5], 0);
            xdl0.W(this.f2980T[iM5177z5], 0);
        } else {
            xdl0.X(imageViewArr[iM5177z5], t100.d(7.0f));
            xdl0.W(this.f2979S[iM5177z5], t100.d(11.0f));
            xdl0.X(this.f2980T[iM5177z5], t100.d(5.0f));
            xdl0.W(this.f2980T[iM5177z5], t100.d(9.0f));
        }
        if (z) {
            this.f2979S[iM5177z5].setVisibility(4);
            this.f2980T[iM5177z5].setVisibility(0);
            this.f2980T[iM5177z5].loadAnimWithListener("feed_follow_red_dot.svga", 1, new AnimListener(), true);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public final void m5205h6(int i) {
        if (i == 1) {
            FeedModule.f316d.f14929I1 = "follow";
        } else if (i == 2) {
            FeedModule.f316d.f14929I1 = "dating";
        } else if (i == 3) {
            FeedModule.f316d.f14929I1 = "activity_one";
        } else if (i == 4) {
            FeedModule.f316d.f14929I1 = "activity_two";
        } else if (i == 5) {
            FeedModule.f316d.f14929I1 = "like";
        }
        this.f2973M = i;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f2975O = new C2129a(getChildFragmentManager());
        return m5206m5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public View m5206m5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c9j.m9111b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o5 */
    public void m5207o5(int i) {
        if (getActivity() == null || this.f2973M == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f2960A.setCurrentItem(m5216y5());
            } else if (i == 3) {
                this.f2960A.setCurrentItem(m5211u5());
            } else if (i == 4) {
                this.f2960A.setCurrentItem(m5212v5());
            } else if (i == 5) {
                if (m5208q5()) {
                    m5202f6();
                    this.f2973M = i;
                    return;
                }
                this.f2960A.setCurrentItem(m5137C5());
            }
        } else if (!m5208q5()) {
            return;
        } else {
            this.f2960A.setCurrentItem(m5177z5());
        }
        this.f2973M = i;
        m5199d6(this.f2966F);
        m5198c6(this.f2967G);
        setUserVisibleHint(this.f2964E);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
        this.f2986Z = true;
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
        m5195Z5();
        m5200e6();
    }

    /* JADX INFO: renamed from: q5 */
    public boolean m5208q5() {
        return this.f2976P.size() > 1 && TextUtils.equals(this.f2976P.get(1), fm20.m10228h());
    }

    /* JADX INFO: renamed from: r5 */
    public void m5209r5(int i) {
        if (m5177z5() > 0 || m5137C5() >= 0) {
            final int iM5177z5 = m5208q5() ? m5177z5() : m5137C5();
            boolean z = this.f2979S[iM5177z5].getVisibility() == 0 || this.f2980T[iM5177z5].getVisibility() == 0;
            lwh lwhVar = new lwh(i > 0, new d30() { // from class: l.a9j
                public final void call() {
                    this.f5672a.m5185K5(iM5177z5);
                }
            });
            lwhVar.m11712b(new lwh(true, new d30() { // from class: l.b9j
                public final void call() {
                    this.f6197a.m5186L5(iM5177z5);
                }
            }));
            lwhVar.m11711a();
            ImageView imageView = this.f2979S[iM5177z5];
            m5176t5(imageView, z, imageView.getVisibility() == 0 || this.f2980T[iM5177z5].getVisibility() == 0, m5139E5(), m5140F5());
        }
    }

    /* JADX INFO: renamed from: s5 */
    public void m5210s5() {
        m5213w5().m5441P4();
    }

    public void setUserVisibleHint(boolean z) {
        super/*androidx.fragment.app.Fragment*/.setUserVisibleHint(z);
        if (z) {
            this.f2964E = true;
        } else {
            this.f2964E = false;
        }
        m5213w5().setUserVisibleHint(z);
    }

    /* JADX INFO: renamed from: u5 */
    public final int m5211u5() {
        return 0;
    }

    /* JADX INFO: renamed from: v5 */
    public final int m5212v5() {
        return 0;
    }

    /* JADX INFO: renamed from: w5 */
    public PhotoAlbumFeedFrag m5213w5() {
        C2129a c2129a = this.f2975O;
        if (c2129a != null) {
            return c2129a.m5221k(this.f2981U);
        }
        m5141H5();
        return this.f2971K;
    }

    /* JADX INFO: renamed from: x5 */
    public CharSequence m5214x5() {
        C2129a c2129a = this.f2975O;
        return (c2129a == null || c2129a.getCount() == 0) ? fm20.m10236p() : this.f2975O.getPageTitle(this.f2981U);
    }

    /* JADX INFO: renamed from: y4 */
    public void m5215y4() {
    }

    /* JADX INFO: renamed from: y5 */
    public final int m5216y5() {
        List<String> list = this.f2976P;
        if (list != null) {
            return list.indexOf(fm20.m10236p());
        }
        return 0;
    }
}
