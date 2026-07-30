package com.p046p1.mobile.putong.feed.newui.photoalbum.discovery;

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
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONException;
import com.meituan.robust.Constants;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedSelectParams;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateFollowFeedHeaderView;
import com.p046p1.mobile.putong.feed.newui.view.RoamEntranceView;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p133rx.subjects.C22393b;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p147v.navigationbar.VNavigationTabLayout;
import p149l.a8c0;
import p149l.b5c0;
import p149l.c9j;
import p149l.d30;
import p149l.du2;
import p149l.dyl;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.fm20;
import p149l.hx60;
import p149l.j60;
import p149l.kmc0;
import p149l.lwh;
import p149l.m3h;
import p149l.m3i;
import p149l.mji0;
import p149l.mkd0;
import p149l.mwh;
import p149l.n7c;
import p149l.nkg;
import p149l.o6c0;
import p149l.pyg;
import p149l.roj0;
import p149l.t100;
import p149l.v9h;
import p149l.vwb;
import p149l.wmf0;
import p149l.xdl0;
import p149l.ywh;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FriendsFeedViewPagerFrag extends PutongFrag {

    /* JADX INFO: renamed from: F0 */
    public static String f41493F0 = "";

    /* JADX INFO: renamed from: G0 */
    public static List<FeedSelectParams> f41494G0;

    /* JADX INFO: renamed from: H0 */
    public static List<String> f41495H0;

    /* JADX INFO: renamed from: I0 */
    public static C22393b<roj0> f41496I0 = C22393b.m221521b();

    /* JADX INFO: renamed from: J0 */
    public static boolean f41497J0 = true;

    /* JADX INFO: renamed from: K0 */
    public static C22393b<Boolean> f41498K0 = C22393b.m221521b();

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f41499A;

    /* JADX INFO: renamed from: B */
    public VFrame f41500B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f41501C;

    /* JADX INFO: renamed from: D */
    public boolean f41502D;

    /* JADX INFO: renamed from: E */
    public boolean f41503E;

    /* JADX INFO: renamed from: E0 */
    public boolean f41504E0;

    /* JADX INFO: renamed from: F */
    public boolean f41505F;

    /* JADX INFO: renamed from: G */
    public boolean f41506G;

    /* JADX INFO: renamed from: H */
    public boolean f41507H;

    /* JADX INFO: renamed from: I */
    public PhotoAlbumFeedFrag f41508I;

    /* JADX INFO: renamed from: J */
    public PhotoAlbumFeedFrag f41509J;

    /* JADX INFO: renamed from: K */
    public PhotoAlbumFeedFrag f41510K;

    /* JADX INFO: renamed from: N */
    public List<PutongFrag> f41513N;

    /* JADX INFO: renamed from: Q */
    public VNavigationTabLayout f41516Q;

    /* JADX INFO: renamed from: V */
    public VImage f41521V;

    /* JADX INFO: renamed from: X */
    public RoamEntranceView f41523X;

    /* JADX INFO: renamed from: Z */
    public boolean f41525Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f41526k0;

    /* JADX INFO: renamed from: p0 */
    public PopupWindow f41527p0;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f41528z;

    /* JADX INFO: renamed from: L */
    public List<PhotoAlbumFeedFrag> f41511L = new ArrayList();

    /* JADX INFO: renamed from: M */
    public int f41512M = -1;

    /* JADX INFO: renamed from: O */
    public C11285a f41514O = null;

    /* JADX INFO: renamed from: P */
    public List<String> f41515P = new ArrayList();

    /* JADX INFO: renamed from: R */
    public TextView[] f41517R = new TextView[4];

    /* JADX INFO: renamed from: S */
    public ImageView[] f41518S = new ImageView[4];

    /* JADX INFO: renamed from: T */
    public AnimEffectPlayer[] f41519T = new AnimEffectPlayer[4];

    /* JADX INFO: renamed from: U */
    public int f41520U = 0;

    /* JADX INFO: renamed from: W */
    public ArrayList<j60> f41522W = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    public boolean f41524Y = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag$a */
    public class C11285a extends FragmentPagerAdapter implements ViewPager.InterfaceC0716j, dyl {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f41529a;

        /* JADX INFO: renamed from: b */
        public Method f41530b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f41531c;

        /* JADX INFO: renamed from: d */
        public wmf0<String> f41532d;

        /* JADX INFO: renamed from: e */
        public wmf0<String> f41533e;

        public C11285a(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f41529a = new ArrayList();
            this.f41531c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f41530b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.m81296c(e);
                this.f41530b = null;
            } catch (SecurityException e2) {
                CrashHelper.m81296c(e2);
                this.f41530b = null;
            }
            this.f41532d = new wmf0<>();
            this.f41533e = new wmf0<>();
            m64167p();
            m64168q();
        }

        @Override // p149l.dyl
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: a */
        public Animator mo63829a(int i, @NonNull @NotNull View view) {
            return dyl.f88406l0.call(view);
        }

        @Override // p149l.dyl
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: b */
        public Animator mo63830b(int i, @NonNull @NotNull View view) {
            return dyl.f88406l0.call(view);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.destroyItem(viewGroup, i, obj);
            try {
                ((AbstractC0427k) kmc0.m146494l(this).m146504e("mCurTransaction").m146506h()).mo2715r((Fragment) obj);
            } catch (Throwable th) {
                CrashHelper.m81297d(th, 10);
            }
        }

        @Override // p149l.dyl
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> mo63831g(int i) {
            return null;
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f41529a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f41529a.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public long getItemId(int i) {
            return this.f41529a.get(i).hashCode();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            int iHashCode = obj.hashCode();
            String strM203983d = this.f41533e.m203983d(iHashCode);
            if (strM203983d == null) {
                return -2;
            }
            int iM203988l = this.f41532d.m203988l();
            for (int i = 0; i < iM203988l; i++) {
                int iM203985f = this.f41532d.m203985f(i);
                if (iM203985f == iHashCode) {
                    return strM203983d.equals(this.f41532d.m203983d(iM203985f)) ? -1 : -2;
                }
            }
            return -1;
        }

        @Override // p149l.w660
        public CharSequence getPageTitle(int i) {
            return (CharSequence) FriendsFeedViewPagerFrag.this.f41515P.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.m81303a(this.f41531c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f41531c.m2589t0());
                    sb.append(Constants.PACKNAME_END);
                    sb.append("lstFrag :" + this.f41529a);
                    du2.m113670a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: k */
        public Fragment m64162k(int i) {
            Fragment fragmentM2557i0;
            Method method = this.f41530b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentM2557i0 = FriendsFeedViewPagerFrag.this.getChildFragmentManager().m2557i0((String) method.invoke(this, Integer.valueOf(FriendsFeedViewPagerFrag.this.f41499A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.m81296c(e);
                fragmentM2557i0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.m81296c(e2);
                fragmentM2557i0 = null;
            }
            return fragmentM2557i0 == null ? getItem(i) : fragmentM2557i0;
        }

        /* JADX INFO: renamed from: l */
        public View m64163l(int i) {
            View viewInflate = FriendsFeedViewPagerFrag.this.act().inflater().inflate(o6c0.f142321y0, (ViewGroup) null);
            VText titleView = ((FeedLikeTabTitleView) viewInflate.findViewById(b5c0.f73531W1)).getTitleView();
            FriendsFeedViewPagerFrag.this.f41517R[i] = titleView;
            FriendsFeedViewPagerFrag.this.f41518S[i] = (ImageView) viewInflate.findViewById(b5c0.f73625y0);
            FriendsFeedViewPagerFrag.this.f41519T[i] = (AnimEffectPlayer) viewInflate.findViewById(b5c0.f73628z0);
            titleView.setText((CharSequence) FriendsFeedViewPagerFrag.this.f41515P.get(i));
            xdl0.m208359W(titleView, i == 0 ? 0 : t100.m186890d(4.0f));
            return viewInflate;
        }

        /* JADX INFO: renamed from: m */
        public final void m64164m() {
            m64168q();
            notifyDataSetChanged();
            m64167p();
        }

        /* JADX INFO: renamed from: n */
        public void m64165n(List<PutongFrag> list) {
            FriendsFeedViewPagerFrag.this.f41513N = list;
            this.f41529a.clear();
            if (NullChecker.m81304b(list)) {
                this.f41529a.addAll(list);
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: o */
        public void m64166o(int i, PutongFrag putongFrag) {
            int iIndexOf = this.f41529a.indexOf(putongFrag);
            if (iIndexOf == -1) {
                if (this.f41529a.get(i) == null) {
                    return;
                }
                this.f41529a.set(i, putongFrag);
                m64164m();
                FriendsFeedViewPagerFrag.this.f41499A.setCurrentItem(i);
                return;
            }
            CrashHelper.m81296c(new Exception("----FriendsFeedViewPagerFrag fragment already add Exception-----i=" + iIndexOf + ";lstFrag.size=" + this.f41529a.size() + ";newFragment=" + putongFrag));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (nkg.m159907t0() && i == 0) {
                FeedStateFollowFeedHeaderView.f42925h.onNext("");
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (nkg.m159909u0()) {
                m3i.m152923m().m152929l();
            }
            FeedModule.f38855d.m209299J6();
            Fragment fragmentM64162k = FriendsFeedViewPagerFrag.this.f41514O.m64162k(i);
            boolean z = fragmentM64162k instanceof PhotoAlbumFeedFrag;
            if (z) {
                if (((PhotoAlbumFeedFrag) fragmentM64162k).m64368Q4()) {
                    FeedModule.m60222H().mo30779jg(FriendsFeedViewPagerFrag.this.act(), false);
                } else {
                    FeedModule.m60222H().mo30717Pq(FriendsFeedViewPagerFrag.this.act(), false);
                }
            }
            FriendsFeedViewPagerFrag.this.m64142Z5();
            FriendsFeedViewPagerFrag.this.m64147e6();
            FriendsFeedViewPagerFrag.this.m64129G5();
            FriendsFeedViewPagerFrag.this.f41520U = i;
            FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = FriendsFeedViewPagerFrag.this;
            friendsFeedViewPagerFrag.m64150h6(friendsFeedViewPagerFrag.m64128D5(i));
            if (i == 0 && nkg.m159842B() && z) {
                PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragmentM64162k;
                hx60 hx60Var = photoAlbumFeedFrag.m64370S4().f84602j;
                if (hx60Var == null) {
                    return;
                }
                long j = hx60Var.f109832a;
                if (j > 0 && System.currentTimeMillis() - j > fm20.m122129l()) {
                    photoAlbumFeedFrag.m64376Y4();
                }
            } else if (nkg.m159854K() && i == 1 && ((TextUtils.equals(FriendsFeedViewPagerFrag.this.f41517R[i].getText().toString(), fm20.m122126i()) || TextUtils.equals(FriendsFeedViewPagerFrag.this.f41517R[i].getText().toString(), fm20.m122125h())) && z && (FriendsFeedViewPagerFrag.this.f41518S[i].getVisibility() == 0 || FriendsFeedViewPagerFrag.this.f41504E0))) {
                FriendsFeedViewPagerFrag.this.f41504E0 = true;
                ((PhotoAlbumFeedFrag) fragmentM64162k).m64376Y4();
            }
            PhotoAlbumPictureView.m63859u(FriendsFeedViewPagerFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (i2 < this.f41529a.size()) {
                Fragment fragmentM64162k2 = m64162k(i2);
                if (fragmentM64162k2 instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag2 = (PhotoAlbumFeedFrag) fragmentM64162k2;
                    photoAlbumFeedFrag2.m64384h5(i2 == i);
                    photoAlbumFeedFrag2.m64383g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag2.m64377Z4();
                    }
                }
                i2++;
            }
            FriendsFeedViewPagerFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f38855d.f193028Y0.onNext(Boolean.FALSE);
            }
            n7c.m158118e().m158119a((String) FriendsFeedViewPagerFrag.this.f41515P.get(FriendsFeedViewPagerFrag.this.f41520U));
            boolean zM64153q5 = FriendsFeedViewPagerFrag.this.m64153q5();
            FriendsFeedViewPagerFrag friendsFeedViewPagerFrag2 = FriendsFeedViewPagerFrag.this;
            int iM64125z5 = zM64153q5 ? friendsFeedViewPagerFrag2.m64125z5() : friendsFeedViewPagerFrag2.m64085C5();
            if (xdl0.m208349O0(FriendsFeedViewPagerFrag.this.f41518S[iM64125z5]) || xdl0.m208349O0(FriendsFeedViewPagerFrag.this.f41519T[iM64125z5])) {
                FriendsFeedViewPagerFrag.this.m64149g6(true);
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m64167p() {
            this.f41532d.clear();
            for (int i = 0; i < this.f41529a.size(); i++) {
                this.f41532d.m203986j(Long.valueOf(getItemId(i)).intValue(), String.valueOf(i));
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m64168q() {
            this.f41533e.clear();
            for (int i = 0; i < this.f41529a.size(); i++) {
                this.f41533e.m203986j(Long.valueOf(getItemId(i)).intValue(), String.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag$b */
    public class C11286b implements VNavigationTabLayout.InterfaceC22621d {
        public C11286b() {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: a */
        public void mo63839a(VNavigationTabLayout.C22623f c22623f) {
            mji0.m154821o(FriendsFeedViewPagerFrag.this.f41517R[c22623f.m223687f()], a8c0.f68029r);
            View viewM223685d = c22623f.m223685d();
            if (viewM223685d != null) {
                ((FeedLikeTabTitleView) viewM223685d.findViewById(b5c0.f73531W1)).getTitleView().setBackgroundResource(f3c0.f94445W0);
            }
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: b */
        public void mo63840b(VNavigationTabLayout.C22623f c22623f) {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: c */
        public void mo63841c(VNavigationTabLayout.C22623f c22623f) {
            View viewM223685d;
            int iM223687f = c22623f.m223687f();
            if (nkg.m159854K() && iM223687f == 1 && (viewM223685d = c22623f.m223685d()) != null) {
                FeedLikeTabTitleView feedLikeTabTitleView = (FeedLikeTabTitleView) viewM223685d.findViewById(b5c0.f73531W1);
                if (NullChecker.m81303a(feedLikeTabTitleView) && feedLikeTabTitleView.m64403q0()) {
                    feedLikeTabTitleView.m64406t0();
                }
            }
            if (NullChecker.m81303a(FriendsFeedViewPagerFrag.this.f41521V)) {
                if (!nkg.m159846D() && !nkg.m159854K()) {
                    xdl0.m208344M(FriendsFeedViewPagerFrag.this.f41521V, false);
                }
                if (!nkg.m159846D() && nkg.m159854K()) {
                    xdl0.m208344M(FriendsFeedViewPagerFrag.this.f41521V, iM223687f == 1);
                }
                if (nkg.m159846D() && !nkg.m159854K()) {
                    xdl0.m208344M(FriendsFeedViewPagerFrag.this.f41521V, iM223687f == 0);
                }
                if (nkg.m159846D() && nkg.m159854K()) {
                    xdl0.m208344M(FriendsFeedViewPagerFrag.this.f41521V, true);
                }
            }
            if (NullChecker.m81303a(FriendsFeedViewPagerFrag.this.f41523X)) {
                xdl0.m208344M(FriendsFeedViewPagerFrag.this.f41523X, iM223687f == 0);
            }
            mji0.m154821o(FriendsFeedViewPagerFrag.this.f41517R[iM223687f], a8c0.f68028q);
            View viewM223685d2 = c22623f.m223685d();
            if (viewM223685d2 != null) {
                ((FeedLikeTabTitleView) viewM223685d2.findViewById(b5c0.f73531W1)).getTitleView().setBackgroundResource(f3c0.f94452X0);
            }
            if (!nkg.m159854K() && fm20.m122125h().equals(FriendsFeedViewPagerFrag.this.f41517R[iM223687f].getText().toString())) {
                n7c.m158118e().m158125h();
                mwh.m156632d().m156643l(17);
                zvf0.m220399u("e_second_tab", "p_follow", vwb.m200311Y("sort_type", "follow"));
            }
            if (nkg.m159854K() && ((fm20.m122126i().equals(FriendsFeedViewPagerFrag.this.f41517R[iM223687f].getText().toString()) || fm20.m122125h().equals(FriendsFeedViewPagerFrag.this.f41517R[iM223687f].getText().toString())) && xdl0.m208349O0(FriendsFeedViewPagerFrag.this.f41518S[iM223687f]) && nkg.m159854K())) {
                FriendsFeedViewPagerFrag.this.f41504E0 = true;
            }
            if (fm20.m122133p().equals(FriendsFeedViewPagerFrag.this.f41517R[iM223687f].getText().toString())) {
                mwh.m156632d().m156643l(16);
                zvf0.m220399u("e_second_tab", "p_discover_dating", vwb.m200311Y("sort_type", "dating"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public int m64085C5() {
        List<String> list = this.f41515P;
        if (list != null) {
            return list.indexOf(fm20.m122126i());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m64086E4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f41526k0 = false;
            this.f41525Z = false;
        } else if (c4319c == C4319c.f15550k) {
            this.f41526k0 = true;
        }
    }

    /* JADX INFO: renamed from: E5 */
    private int m64087E5() {
        if (nkg.m159854K()) {
            return m64153q5() ? 17 : 15;
        }
        return TextUtils.equals(fm20.m122133p(), m64159x5()) ? 16 : 17;
    }

    /* JADX INFO: renamed from: F5 */
    private String m64088F5() {
        if (nkg.m159854K()) {
            return "p_discover_dating";
        }
        return null;
    }

    /* JADX INFO: renamed from: H5 */
    private void m64089H5() {
        m64123p5();
        if (this.f41507H) {
            this.f41510K.m64372U4().m100605j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m64091M5(roj0 roj0Var) {
        if (m64153q5()) {
            return;
        }
        VNavigationTabLayout.C22623f c22623fM223627w = this.f41516Q.m223627w(1);
        Objects.requireNonNull(c22623fM223627w);
        View viewM223685d = c22623fM223627w.m223685d();
        if (viewM223685d == null) {
            return;
        }
        FeedLikeTabTitleView feedLikeTabTitleView = (FeedLikeTabTitleView) viewM223685d.findViewById(b5c0.f73531W1);
        if (!NullChecker.m81303a(feedLikeTabTitleView) || feedLikeTabTitleView.m64403q0()) {
            return;
        }
        feedLikeTabTitleView.setScrollTv(fm20.m122126i());
        feedLikeTabTitleView.m64404r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N5 */
    public /* synthetic */ void m64093N5(Boolean bool) {
        if (bool.booleanValue()) {
            NewPhotoAlbumFrag.f41540p1.onNext(Boolean.FALSE);
            DiscoveryPager discoveryPager = this.f41499A;
            if (discoveryPager == null) {
                this.f41524Y = true;
                return;
            }
            if (this.f41520U != 1) {
                discoveryPager.setCurrentItem(1);
            }
            if (m64153q5()) {
                this.f41504E0 = true;
                m64148f6();
            } else {
                v9h.f180643i = true;
                m64137T5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O5 */
    public /* synthetic */ void m64095O5(View view) {
        if (vwb.m200296J(f41494G0) && nkg.m159846D()) {
            return;
        }
        if (nkg.m159846D()) {
            zvf0.m220396r("e_select_icon", "p_discover_dating");
        }
        m64143a6(this.f41521V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P5 */
    public /* synthetic */ void m64097P5(Boolean bool) {
        if (this.f41520U == 1 && m64153q5() && this.f41504E0) {
            f41497J0 = false;
            m64148f6();
        } else if (this.f41520U == 1 && !m64153q5() && this.f41504E0) {
            this.f41504E0 = false;
            v9h.f180643i = true;
            n7c.m158118e().m158125h();
            mwh.m156632d().m156644m(15, "p_discover_dating");
            zvf0.m220399u("e_second_tab", "p_follow", vwb.m200311Y("sort_type", "like"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public void m64133L5(int i) {
        this.f41518S[i].setVisibility(8);
        this.f41519T[i].setVisibility(8);
        if (nkg.m159854K()) {
            this.f41504E0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V5, reason: merged with bridge method [inline-methods] */
    public void m64132K5(int i) {
        if (f41497J0) {
            m64149g6(false);
            this.f41518S[i].setVisibility(0);
            if (nkg.m159854K()) {
                this.f41504E0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: n5 */
    public static FriendsFeedViewPagerFrag m64122n5() {
        return new FriendsFeedViewPagerFrag();
    }

    /* JADX INFO: renamed from: p5 */
    private void m64123p5() {
        if (NullChecker.m81303a(this.f41509J) && NullChecker.m81303a(this.f41510K)) {
            return;
        }
        this.f41509J = PhotoAlbumFeedFrag.m64361N4(FeedModule.m60221F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0, false);
        this.f41508I = PhotoAlbumFeedFrag.m64361N4(FeedModule.m60221F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
        this.f41510K = PhotoAlbumFeedFrag.m64360M4(FeedModule.m60221F().userId(), "from_discover_dating", -1, User.ID_TEAM_ACCOUNT, 14);
    }

    /* JADX INFO: renamed from: t5 */
    private void m64124t5(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                mwh.m156632d().m156650s(Integer.valueOf(i));
            } else {
                mwh.m156632d().m156647p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public int m64125z5() {
        List<String> list = this.f41515P;
        if (list != null) {
            return list.indexOf(fm20.m122125h());
        }
        return 0;
    }

    /* JADX INFO: renamed from: A5 */
    public PhotoAlbumFeedFrag m64126A5() {
        return this.f41510K;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m64127B5() {
        return m64158w5().m64368Q4();
    }

    /* JADX INFO: renamed from: D5 */
    public final int m64128D5(int i) {
        if (i == 0) {
            return 2;
        }
        return (i != 1 || m64153q5()) ? 1 : 5;
    }

    /* JADX INFO: renamed from: G5 */
    public void m64129G5() {
        m64158w5().m64373V4();
    }

    /* JADX INFO: renamed from: I5 */
    public void m64130I5() {
        int i = 0;
        while (i < this.f41516Q.getTabCount()) {
            View viewM64163l = this.f41514O.m64163l(i);
            VNavigationTabLayout.C22623f c22623fM223627w = this.f41516Q.m223627w(i);
            Objects.requireNonNull(c22623fM223627w);
            c22623fM223627w.m223695n(viewM64163l);
            VNavigationTabLayout.C22623f c22623fM223627w2 = this.f41516Q.m223627w(i);
            Objects.requireNonNull(c22623fM223627w2);
            VNavigationTabLayout.TabView tabView = c22623fM223627w2.f209872i;
            int iM186890d = i == 0 ? t100.m186890d(4.0f) : 0;
            VNavigationTabLayout.C22623f c22623fM223627w3 = this.f41516Q.m223627w(i);
            Objects.requireNonNull(c22623fM223627w3);
            int paddingTop = c22623fM223627w3.f209872i.getPaddingTop();
            VNavigationTabLayout.C22623f c22623fM223627w4 = this.f41516Q.m223627w(i);
            Objects.requireNonNull(c22623fM223627w4);
            tabView.setPadding(iM186890d, paddingTop, 0, c22623fM223627w4.f209872i.getPaddingBottom());
            VText titleView = ((FeedLikeTabTitleView) viewM64163l.findViewById(b5c0.f73531W1)).getTitleView();
            mji0.m154821o(titleView, i == 1 ? a8c0.f68028q : a8c0.f68029r);
            titleView.setBackgroundResource(i == 1 ? f3c0.f94452X0 : f3c0.f94445W0);
            i++;
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m64131J5() {
        this.f41507H = true;
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f41510K;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.m64372U4().m100605j0();
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m64134P0() {
        return m64158w5().m64366P0();
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m64135Q5(String str) {
        if (m64134P0()) {
            return;
        }
        f41493F0 = str;
        m64137T5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m64136R5(String str) {
        PhotoAlbumFeedFrag photoAlbumFeedFragM64361N4;
        if (this.f41515P.size() > 1) {
            this.f41515P.remove(1);
            this.f41515P.add(1, str);
            this.f41517R[1].setText(str);
        }
        if (TextUtils.equals(str, fm20.m122125h())) {
            this.f41509J = null;
            photoAlbumFeedFragM64361N4 = PhotoAlbumFeedFrag.m64361N4(FeedModule.m60221F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0, false);
            this.f41509J = photoAlbumFeedFragM64361N4;
        } else {
            this.f41508I = null;
            photoAlbumFeedFragM64361N4 = PhotoAlbumFeedFrag.m64361N4(FeedModule.m60221F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
            this.f41508I = photoAlbumFeedFragM64361N4;
        }
        m64140X5(photoAlbumFeedFragM64361N4);
        n7c.m158118e().m158119a(this.f41515P.get(this.f41520U));
    }

    /* JADX INFO: renamed from: T5 */
    public void m64137T5() {
        m64138U5(false);
    }

    /* JADX INFO: renamed from: U5 */
    public void m64138U5(boolean z) {
        if (!z) {
            m64158w5().m64376Y4();
            return;
        }
        if (vwb.m200296J(this.f41513N)) {
            return;
        }
        int size = this.f41513N.size();
        for (int i = 0; i < size; i++) {
            PutongFrag putongFrag = this.f41513N.get(i);
            boolean z2 = (putongFrag.getArguments() != null ? putongFrag.getArguments().getInt("page_type", -2) : -2) != 0;
            if ((putongFrag instanceof PhotoAlbumFeedFrag) && z2) {
                ((PhotoAlbumFeedFrag) putongFrag).m64376Y4();
            }
        }
    }

    /* JADX INFO: renamed from: W5 */
    public void m64139W5() {
        m64158w5().m64377Z4();
    }

    /* JADX INFO: renamed from: X5 */
    public final void m64140X5(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f41513N.remove(1);
        this.f41513N.add(1, photoAlbumFeedFrag);
        m64142Z5();
        m64147e6();
        this.f41514O.m64166o(1, photoAlbumFeedFrag);
        photoAlbumFeedFrag.m64384h5(true);
        photoAlbumFeedFrag.m64383g5(true);
        photoAlbumFeedFrag.m64380c5();
        m64130I5();
        m64150h6(m64128D5(1));
    }

    /* JADX INFO: renamed from: Y5 */
    public void m64141Y5() {
        m64158w5().m64378a5();
    }

    /* JADX INFO: renamed from: Z5 */
    public void m64142Z5() {
        m64158w5().m64379b5();
    }

    /* JADX INFO: renamed from: a6 */
    public final void m64143a6(VImage vImage) {
        VImage vImage2;
        PopupWindow popupWindow = this.f41527p0;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f41527p0.dismiss();
            return;
        }
        if (nkg.m159846D()) {
            vImage2 = vImage;
            this.f41527p0 = new pyg(vImage2, act(), f41494G0, f41493F0, new e30() { // from class: l.y8j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196833a.m64135Q5((String) obj);
                }
            });
        } else {
            vImage2 = vImage;
            if (nkg.m159854K()) {
                zvf0.m220396r("e_type_popup", "p_like");
                this.f41527p0 = new m3h(vImage2, act(), f41495H0, this.f41515P.size() > 1 ? this.f41515P.get(1) : "", new e30() { // from class: l.z8j
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f202174a.m64136R5((String) obj);
                    }
                });
            }
        }
        this.f41527p0.showAsDropDown(vImage2, t100.m186889c().widthPixels - t100.m186890d(12.0f), -t100.m186890d(12.0f));
    }

    /* JADX INFO: renamed from: b6 */
    public void m64144b6(boolean z) {
        this.f41502D = z;
        if (NullChecker.m81303a(this.f41514O)) {
            for (int i = 0; i < this.f41514O.f41529a.size(); i++) {
                Fragment fragment = (Fragment) this.f41514O.f41529a.get(i);
                if (fragment instanceof PhotoAlbumFeedFrag) {
                    ((PhotoAlbumFeedFrag) fragment).m64381e5(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m64145c6(boolean z) {
        this.f41506G = z;
        m64158w5().m64383g5(z);
    }

    /* JADX INFO: renamed from: d6 */
    public void m64146d6(boolean z) {
        this.f41505F = z;
        m64158w5().m64384h5(z);
    }

    /* JADX INFO: renamed from: e6 */
    public void m64147e6() {
        m64158w5().m64387m5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        if (nkg.m159854K() && NullChecker.m81303a(act())) {
            duringCreated(act().lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.t8j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f168923a.m64086E4((C4319c) obj);
                }
            }));
        }
        if (nkg.m159854K()) {
            duringCreated(f41496I0).subscribe(mkd0.m154955G(new e30() { // from class: l.u8j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175140a.m64091M5((roj0) obj);
                }
            }));
        }
        if (nkg.m159854K()) {
            duringCreated(NewPhotoAlbumFrag.f41540p1).subscribe(mkd0.m154955G(new e30() { // from class: l.v8j
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180537a.m64093N5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f6 */
    public final void m64148f6() {
        if (this.f41520U == 1 && m64153q5() && this.f41504E0) {
            this.f41504E0 = false;
            v9h.f180643i = true;
            n7c.m158118e().m158125h();
            mwh.m156632d().m156644m(15, "p_discover_dating");
            zvf0.m220399u("e_second_tab", "p_follow", vwb.m200311Y("sort_type", "like"));
        }
        if (this.f41515P.size() > 1) {
            this.f41515P.remove(1);
            this.f41515P.add(1, fm20.m122126i());
            this.f41517R[1].setText(fm20.m122126i());
        }
        this.f41508I = null;
        PhotoAlbumFeedFrag photoAlbumFeedFragM64361N4 = PhotoAlbumFeedFrag.m64361N4(FeedModule.m60221F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
        this.f41508I = photoAlbumFeedFragM64361N4;
        m64140X5(photoAlbumFeedFragM64361N4);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f41515P.add(0, fm20.m122133p());
        boolean zM159854K = nkg.m159854K();
        List<String> list = this.f41515P;
        if (zM159854K) {
            list.add(1, fm20.m122126i());
        } else {
            list.add(1, fm20.m122125h());
        }
        m64089H5();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f41510K);
        if (nkg.m159854K()) {
            arrayList.add(this.f41508I);
        } else {
            arrayList.add(this.f41509J);
        }
        this.f41514O.m64165n(arrayList);
        this.f41499A.setOnPageChangeListener(this.f41514O);
        this.f41499A.setAdapter(this.f41514O);
        this.f41499A.setOffscreenPageLimit(1);
        this.f41501C.setBackgroundColor(act().getResources().getColor(e1c0.f88799n0));
        this.f41501C.setupViewPager(this.f41499A);
        this.f41516Q = this.f41501C.getTabLayout();
        xdl0.m208360X(this.f41528z, t100.m186890d(44.0f) + xdl0.m208331F0());
        if (nkg.m159846D() || nkg.m159854K()) {
            try {
                String strM79302F = RemoteConfig.m79298x().m79302F("feed_filter_params_configs");
                if (!TextUtils.isEmpty(strM79302F)) {
                    f41494G0 = JsonParseHelper.parseList(strM79302F, FeedSelectParams.JSON_ADAPTER);
                }
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
            if (!vwb.m200296J(f41494G0)) {
                List<FeedSelectParams> list2 = f41494G0;
                f41493F0 = list2.get(list2.size() - 1).param;
            }
            ArrayList arrayList2 = new ArrayList();
            f41495H0 = arrayList2;
            arrayList2.add(fm20.m122126i());
            f41495H0.add(fm20.m122125h());
            VImage vImage = new VImage(act());
            this.f41521V = vImage;
            xdl0.m208344M(vImage, !nkg.m159854K());
            this.f41521V.setPadding(t100.m186890d(6.0f), t100.m186890d(6.0f), t100.m186890d(6.0f), t100.m186890d(6.0f));
            FeedModule.m60222H().mo30797mm(this.f41521V, false);
            this.f41501C.setRightIconViews(this.f41521V);
            xdl0.m208329E0(this.f41521V, new View.OnClickListener() { // from class: l.w8j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f185227a.m64095O5(view);
                }
            });
        }
        if (nkg.m159853J()) {
            this.f41523X = new RoamEntranceView(act());
            ywh.m216393a().m216396d(this.f41523X);
            boolean zM81303a = NullChecker.m81303a(this.f41521V);
            VNavigationBar vNavigationBar = this.f41501C;
            if (zM81303a) {
                vNavigationBar.setRightIconViews(this.f41523X, this.f41521V);
            } else {
                vNavigationBar.setRightIconViews(this.f41523X);
            }
        }
        int i = 0;
        while (i < this.f41516Q.getTabCount()) {
            View viewM64163l = this.f41514O.m64163l(i);
            VNavigationTabLayout.C22623f c22623fM223627w = this.f41516Q.m223627w(i);
            Objects.requireNonNull(c22623fM223627w);
            c22623fM223627w.m223695n(viewM64163l);
            VNavigationTabLayout.C22623f c22623fM223627w2 = this.f41516Q.m223627w(i);
            Objects.requireNonNull(c22623fM223627w2);
            VNavigationTabLayout.TabView tabView = c22623fM223627w2.f209872i;
            int iM186890d = i == 0 ? t100.m186890d(4.0f) : 0;
            VNavigationTabLayout.C22623f c22623fM223627w3 = this.f41516Q.m223627w(i);
            Objects.requireNonNull(c22623fM223627w3);
            int paddingTop = c22623fM223627w3.f209872i.getPaddingTop();
            VNavigationTabLayout.C22623f c22623fM223627w4 = this.f41516Q.m223627w(i);
            Objects.requireNonNull(c22623fM223627w4);
            tabView.setPadding(iM186890d, paddingTop, 0, c22623fM223627w4.f209872i.getPaddingBottom());
            VText titleView = ((FeedLikeTabTitleView) viewM64163l.findViewById(b5c0.f73531W1)).getTitleView();
            mji0.m154821o(titleView, i == 0 ? a8c0.f68028q : a8c0.f68029r);
            titleView.setBackgroundResource(i == 0 ? f3c0.f94452X0 : f3c0.f94445W0);
            i++;
        }
        this.f41516Q.setOnTabSelectedListener((VNavigationTabLayout.InterfaceC22621d) new C11286b());
        String strM122128k = fm20.m122128k();
        if (nkg.m159854K() && (TextUtils.equals(strM122128k, fm20.m122126i()) || this.f41524Y)) {
            this.f41520U = 1;
            this.f41499A.setCurrentItem(1);
            if (this.f41524Y) {
                this.f41524Y = false;
            }
            if (xdl0.m208349O0(this.f41518S[1])) {
                FeedModule.f38855d.m209521oc();
            }
        }
        duringCreated(f41498K0).subscribe(mkd0.m154955G(new e30() { // from class: l.x8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191526a.m64097P5((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g6 */
    public final void m64149g6(boolean z) {
        int iM64125z5 = m64153q5() ? m64125z5() : m64085C5();
        this.f41519T[iM64125z5].stopAnimation();
        int i = this.f41520U;
        ImageView[] imageViewArr = this.f41518S;
        if (i == iM64125z5) {
            xdl0.m208360X(imageViewArr[iM64125z5], t100.m186890d(2.0f));
            xdl0.m208359W(this.f41518S[iM64125z5], t100.m186890d(2.0f));
            xdl0.m208360X(this.f41519T[iM64125z5], 0);
            xdl0.m208359W(this.f41519T[iM64125z5], 0);
        } else {
            xdl0.m208360X(imageViewArr[iM64125z5], t100.m186890d(7.0f));
            xdl0.m208359W(this.f41518S[iM64125z5], t100.m186890d(11.0f));
            xdl0.m208360X(this.f41519T[iM64125z5], t100.m186890d(5.0f));
            xdl0.m208359W(this.f41519T[iM64125z5], t100.m186890d(9.0f));
        }
        if (z) {
            this.f41518S[iM64125z5].setVisibility(4);
            this.f41519T[iM64125z5].setVisibility(0);
            this.f41519T[iM64125z5].loadAnimWithListener("feed_follow_red_dot.svga", 1, new AnimListener(), true);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public final void m64150h6(int i) {
        if (i == 1) {
            FeedModule.f38855d.f192994I1 = "follow";
        } else if (i == 2) {
            FeedModule.f38855d.f192994I1 = "dating";
        } else if (i == 3) {
            FeedModule.f38855d.f192994I1 = "activity_one";
        } else if (i == 4) {
            FeedModule.f38855d.f192994I1 = "activity_two";
        } else if (i == 5) {
            FeedModule.f38855d.f192994I1 = "like";
        }
        this.f41512M = i;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f41514O = new C11285a(getChildFragmentManager());
        return m64151m5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public View m64151m5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c9j.m105851b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o5 */
    public void m64152o5(int i) {
        if (getActivity() == null || this.f41512M == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f41499A.setCurrentItem(m64160y5());
            } else if (i == 3) {
                this.f41499A.setCurrentItem(m64156u5());
            } else if (i == 4) {
                this.f41499A.setCurrentItem(m64157v5());
            } else if (i == 5) {
                if (m64153q5()) {
                    m64148f6();
                    this.f41512M = i;
                    return;
                }
                this.f41499A.setCurrentItem(m64085C5());
            }
        } else if (!m64153q5()) {
            return;
        } else {
            this.f41499A.setCurrentItem(m64125z5());
        }
        this.f41512M = i;
        m64146d6(this.f41505F);
        m64145c6(this.f41506G);
        setUserVisibleHint(this.f41503E);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f41525Z = true;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m64142Z5();
        m64147e6();
    }

    /* JADX INFO: renamed from: q5 */
    public boolean m64153q5() {
        return this.f41515P.size() > 1 && TextUtils.equals(this.f41515P.get(1), fm20.m122125h());
    }

    /* JADX INFO: renamed from: r5 */
    public void m64154r5(int i) {
        if (m64125z5() > 0 || m64085C5() >= 0) {
            final int iM64125z5 = m64153q5() ? m64125z5() : m64085C5();
            boolean z = this.f41518S[iM64125z5].getVisibility() == 0 || this.f41519T[iM64125z5].getVisibility() == 0;
            lwh lwhVar = new lwh(i > 0, new d30() { // from class: l.a9j
                @Override // p149l.d30
                public final void call() {
                    this.f68178a.m64132K5(iM64125z5);
                }
            });
            lwhVar.m151970b(new lwh(true, new d30() { // from class: l.b9j
                @Override // p149l.d30
                public final void call() {
                    this.f74588a.m64133L5(iM64125z5);
                }
            }));
            lwhVar.m151969a();
            ImageView imageView = this.f41518S[iM64125z5];
            m64124t5(imageView, z, imageView.getVisibility() == 0 || this.f41519T[iM64125z5].getVisibility() == 0, m64087E5(), m64088F5());
        }
    }

    /* JADX INFO: renamed from: s5 */
    public void m64155s5() {
        m64158w5().m64367P4();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            this.f41503E = true;
        } else {
            this.f41503E = false;
        }
        m64158w5().setUserVisibleHint(z);
    }

    /* JADX INFO: renamed from: u5 */
    public final int m64156u5() {
        return 0;
    }

    /* JADX INFO: renamed from: v5 */
    public final int m64157v5() {
        return 0;
    }

    /* JADX INFO: renamed from: w5 */
    public PhotoAlbumFeedFrag m64158w5() {
        C11285a c11285a = this.f41514O;
        if (c11285a != null) {
            return (PhotoAlbumFeedFrag) c11285a.m64162k(this.f41520U);
        }
        m64089H5();
        return this.f41510K;
    }

    /* JADX INFO: renamed from: x5 */
    public CharSequence m64159x5() {
        C11285a c11285a = this.f41514O;
        return (c11285a == null || c11285a.getCount() == 0) ? fm20.m122133p() : this.f41514O.getPageTitle(this.f41520U);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
    }

    /* JADX INFO: renamed from: y5 */
    public final int m64160y5() {
        List<String> list = this.f41515P;
        if (list != null) {
            return list.indexOf(fm20.m122133p());
        }
        return 0;
    }
}
