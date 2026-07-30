package com.p051p1.mobile.putong.feed.newui.photoalbum.discovery;

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
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONException;
import com.meituan.robust.Constants;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedSelectParams;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateFollowFeedHeaderView;
import com.p051p1.mobile.putong.feed.newui.view.RoamEntranceView;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
import p137rx.subjects.C22508b;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p151v.navigationbar.VNavigationTabLayout;
import p153l.ayh;
import p153l.b5h;
import p153l.b5i;
import p153l.bnl0;
import p153l.byh;
import p153l.cmg;
import p153l.e0h;
import p153l.f60;
import p153l.fgc0;
import p153l.fvf0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.k9c0;
import p153l.kbh;
import p153l.lbc0;
import p153l.msi0;
import p153l.n570;
import p153l.nyh;
import p153l.psd0;
import p153l.pu20;
import p153l.puc0;
import p153l.qa00;
import p153l.t8c;
import p153l.tec0;
import p153l.tu2;
import p153l.uxj0;
import p153l.w0m;
import p153l.wbj;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FriendsFeedViewPagerFrag extends PutongFrag {

    /* JADX INFO: renamed from: F0 */
    public static String f42341F0 = "";

    /* JADX INFO: renamed from: G0 */
    public static List<FeedSelectParams> f42342G0;

    /* JADX INFO: renamed from: H0 */
    public static List<String> f42343H0;

    /* JADX INFO: renamed from: I0 */
    public static C22508b<uxj0> f42344I0 = C22508b.m222767b();

    /* JADX INFO: renamed from: J0 */
    public static boolean f42345J0 = true;

    /* JADX INFO: renamed from: K0 */
    public static C22508b<Boolean> f42346K0 = C22508b.m222767b();

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f42347A;

    /* JADX INFO: renamed from: B */
    public VFrame f42348B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f42349C;

    /* JADX INFO: renamed from: D */
    public boolean f42350D;

    /* JADX INFO: renamed from: E */
    public boolean f42351E;

    /* JADX INFO: renamed from: E0 */
    public boolean f42352E0;

    /* JADX INFO: renamed from: F */
    public boolean f42353F;

    /* JADX INFO: renamed from: G */
    public boolean f42354G;

    /* JADX INFO: renamed from: H */
    public boolean f42355H;

    /* JADX INFO: renamed from: I */
    public PhotoAlbumFeedFrag f42356I;

    /* JADX INFO: renamed from: J */
    public PhotoAlbumFeedFrag f42357J;

    /* JADX INFO: renamed from: K */
    public PhotoAlbumFeedFrag f42358K;

    /* JADX INFO: renamed from: N */
    public List<PutongFrag> f42361N;

    /* JADX INFO: renamed from: Q */
    public VNavigationTabLayout f42364Q;

    /* JADX INFO: renamed from: V */
    public VImage f42369V;

    /* JADX INFO: renamed from: X */
    public RoamEntranceView f42371X;

    /* JADX INFO: renamed from: Z */
    public boolean f42373Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f42374k0;

    /* JADX INFO: renamed from: p0 */
    public PopupWindow f42375p0;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f42376z;

    /* JADX INFO: renamed from: L */
    public List<PhotoAlbumFeedFrag> f42359L = new ArrayList();

    /* JADX INFO: renamed from: M */
    public int f42360M = -1;

    /* JADX INFO: renamed from: O */
    public C11448a f42362O = null;

    /* JADX INFO: renamed from: P */
    public List<String> f42363P = new ArrayList();

    /* JADX INFO: renamed from: R */
    public TextView[] f42365R = new TextView[4];

    /* JADX INFO: renamed from: S */
    public ImageView[] f42366S = new ImageView[4];

    /* JADX INFO: renamed from: T */
    public AnimEffectPlayer[] f42367T = new AnimEffectPlayer[4];

    /* JADX INFO: renamed from: U */
    public int f42368U = 0;

    /* JADX INFO: renamed from: W */
    public ArrayList<f60> f42370W = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    public boolean f42372Y = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag$a */
    public class C11448a extends FragmentPagerAdapter implements ViewPager.InterfaceC0718j, w0m {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f42377a;

        /* JADX INFO: renamed from: b */
        public Method f42378b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f42379c;

        /* JADX INFO: renamed from: d */
        public fvf0<String> f42380d;

        /* JADX INFO: renamed from: e */
        public fvf0<String> f42381e;

        public C11448a(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f42377a = new ArrayList();
            this.f42379c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f42378b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.m82479c(e);
                this.f42378b = null;
            } catch (SecurityException e2) {
                CrashHelper.m82479c(e2);
                this.f42378b = null;
            }
            this.f42380d = new fvf0<>();
            this.f42381e = new fvf0<>();
            m65350p();
            m65351q();
        }

        @Override // p153l.w0m
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: a */
        public Animator mo65012a(int i, @NonNull @NotNull View view) {
            return w0m.f186614l0.call(view);
        }

        @Override // p153l.w0m
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: b */
        public Animator mo65013b(int i, @NonNull @NotNull View view) {
            return w0m.f186614l0.call(view);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.destroyItem(viewGroup, i, obj);
            try {
                ((AbstractC0428k) puc0.m173843l(this).m173853e("mCurTransaction").m173855h()).mo2716r((Fragment) obj);
            } catch (Throwable th) {
                CrashHelper.m82480d(th, 10);
            }
        }

        @Override // p153l.w0m
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> mo65014g(int i) {
            return null;
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f42377a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f42377a.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public long getItemId(int i) {
            return this.f42377a.get(i).hashCode();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            int iHashCode = obj.hashCode();
            String strM127613d = this.f42381e.m127613d(iHashCode);
            if (strM127613d == null) {
                return -2;
            }
            int iM127618l = this.f42380d.m127618l();
            for (int i = 0; i < iM127618l; i++) {
                int iM127615f = this.f42380d.m127615f(i);
                if (iM127615f == iHashCode) {
                    return strM127613d.equals(this.f42380d.m127613d(iM127615f)) ? -1 : -2;
                }
            }
            return -1;
        }

        @Override // p153l.cf60
        public CharSequence getPageTitle(int i) {
            return (CharSequence) FriendsFeedViewPagerFrag.this.f42363P.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.m82486a(this.f42379c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f42379c.m2590t0());
                    sb.append(Constants.PACKNAME_END);
                    sb.append("lstFrag :" + this.f42377a);
                    tu2.m192703a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: k */
        public Fragment m65345k(int i) {
            Fragment fragmentM2558i0;
            Method method = this.f42378b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentM2558i0 = FriendsFeedViewPagerFrag.this.getChildFragmentManager().m2558i0((String) method.invoke(this, Integer.valueOf(FriendsFeedViewPagerFrag.this.f42347A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.m82479c(e);
                fragmentM2558i0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.m82479c(e2);
                fragmentM2558i0 = null;
            }
            return fragmentM2558i0 == null ? getItem(i) : fragmentM2558i0;
        }

        /* JADX INFO: renamed from: l */
        public View m65346l(int i) {
            View viewInflate = FriendsFeedViewPagerFrag.this.act().inflater().inflate(tec0.f173790y0, (ViewGroup) null);
            VText titleView = ((FeedLikeTabTitleView) viewInflate.findViewById(hdc0.f108884W1)).getTitleView();
            FriendsFeedViewPagerFrag.this.f42365R[i] = titleView;
            FriendsFeedViewPagerFrag.this.f42366S[i] = (ImageView) viewInflate.findViewById(hdc0.f108978y0);
            FriendsFeedViewPagerFrag.this.f42367T[i] = (AnimEffectPlayer) viewInflate.findViewById(hdc0.f108981z0);
            titleView.setText((CharSequence) FriendsFeedViewPagerFrag.this.f42363P.get(i));
            bnl0.m105539W(titleView, i == 0 ? 0 : qa00.m175859d(4.0f));
            return viewInflate;
        }

        /* JADX INFO: renamed from: m */
        public final void m65347m() {
            m65351q();
            notifyDataSetChanged();
            m65350p();
        }

        /* JADX INFO: renamed from: n */
        public void m65348n(List<PutongFrag> list) {
            FriendsFeedViewPagerFrag.this.f42361N = list;
            this.f42377a.clear();
            if (NullChecker.m82487b(list)) {
                this.f42377a.addAll(list);
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: o */
        public void m65349o(int i, PutongFrag putongFrag) {
            int iIndexOf = this.f42377a.indexOf(putongFrag);
            if (iIndexOf == -1) {
                if (this.f42377a.get(i) == null) {
                    return;
                }
                this.f42377a.set(i, putongFrag);
                m65347m();
                FriendsFeedViewPagerFrag.this.f42347A.setCurrentItem(i);
                return;
            }
            CrashHelper.m82479c(new Exception("----FriendsFeedViewPagerFrag fragment already add Exception-----i=" + iIndexOf + ";lstFrag.size=" + this.f42377a.size() + ";newFragment=" + putongFrag));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (cmg.m111236t0() && i == 0) {
                FeedStateFollowFeedHeaderView.f43773h.onNext("");
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (cmg.m111238u0()) {
                b5i.m102594m().m102600l();
            }
            FeedModule.f39703d.m145540J6();
            Fragment fragmentM65345k = FriendsFeedViewPagerFrag.this.f42362O.m65345k(i);
            boolean z = fragmentM65345k instanceof PhotoAlbumFeedFrag;
            if (z) {
                if (((PhotoAlbumFeedFrag) fragmentM65345k).m65551Q4()) {
                    FeedModule.m61406H().mo31782jg(FriendsFeedViewPagerFrag.this.act(), false);
                } else {
                    FeedModule.m61406H().mo31720Pq(FriendsFeedViewPagerFrag.this.act(), false);
                }
            }
            FriendsFeedViewPagerFrag.this.m65325Z5();
            FriendsFeedViewPagerFrag.this.m65330e6();
            FriendsFeedViewPagerFrag.this.m65312G5();
            FriendsFeedViewPagerFrag.this.f42368U = i;
            FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = FriendsFeedViewPagerFrag.this;
            friendsFeedViewPagerFrag.m65333h6(friendsFeedViewPagerFrag.m65311D5(i));
            if (i == 0 && cmg.m111171B() && z) {
                PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragmentM65345k;
                n570 n570Var = photoAlbumFeedFrag.m65553S4().f120405j;
                if (n570Var == null) {
                    return;
                }
                long j = n570Var.f140314a;
                if (j > 0 && System.currentTimeMillis() - j > pu20.m173817l()) {
                    photoAlbumFeedFrag.m65559Y4();
                }
            } else if (cmg.m111183K() && i == 1 && ((TextUtils.equals(FriendsFeedViewPagerFrag.this.f42365R[i].getText().toString(), pu20.m173814i()) || TextUtils.equals(FriendsFeedViewPagerFrag.this.f42365R[i].getText().toString(), pu20.m173813h())) && z && (FriendsFeedViewPagerFrag.this.f42366S[i].getVisibility() == 0 || FriendsFeedViewPagerFrag.this.f42352E0))) {
                FriendsFeedViewPagerFrag.this.f42352E0 = true;
                ((PhotoAlbumFeedFrag) fragmentM65345k).m65559Y4();
            }
            PhotoAlbumPictureView.m65042u(FriendsFeedViewPagerFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (i2 < this.f42377a.size()) {
                Fragment fragmentM65345k2 = m65345k(i2);
                if (fragmentM65345k2 instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag2 = (PhotoAlbumFeedFrag) fragmentM65345k2;
                    photoAlbumFeedFrag2.m65567h5(i2 == i);
                    photoAlbumFeedFrag2.m65566g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag2.m65560Z4();
                    }
                }
                i2++;
            }
            FriendsFeedViewPagerFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f39703d.f121338Y0.onNext(Boolean.FALSE);
            }
            t8c.m189652e().m189653a((String) FriendsFeedViewPagerFrag.this.f42363P.get(FriendsFeedViewPagerFrag.this.f42368U));
            boolean zM65336q5 = FriendsFeedViewPagerFrag.this.m65336q5();
            FriendsFeedViewPagerFrag friendsFeedViewPagerFrag2 = FriendsFeedViewPagerFrag.this;
            int iM65308z5 = zM65336q5 ? friendsFeedViewPagerFrag2.m65308z5() : friendsFeedViewPagerFrag2.m65268C5();
            if (bnl0.m105529O0(FriendsFeedViewPagerFrag.this.f42366S[iM65308z5]) || bnl0.m105529O0(FriendsFeedViewPagerFrag.this.f42367T[iM65308z5])) {
                FriendsFeedViewPagerFrag.this.m65332g6(true);
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m65350p() {
            this.f42380d.clear();
            for (int i = 0; i < this.f42377a.size(); i++) {
                this.f42380d.m127616j(Long.valueOf(getItemId(i)).intValue(), String.valueOf(i));
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m65351q() {
            this.f42381e.clear();
            for (int i = 0; i < this.f42377a.size(); i++) {
                this.f42381e.m127616j(Long.valueOf(getItemId(i)).intValue(), String.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag$b */
    public class C11449b implements VNavigationTabLayout.InterfaceC22736d {
        public C11449b() {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: a */
        public void mo65022a(VNavigationTabLayout.C22738f c22738f) {
            msi0.m159817o(FriendsFeedViewPagerFrag.this.f42365R[c22738f.m224933f()], fgc0.f98915r);
            View viewM224931d = c22738f.m224931d();
            if (viewM224931d != null) {
                ((FeedLikeTabTitleView) viewM224931d.findViewById(hdc0.f108884W1)).getTitleView().setBackgroundResource(lbc0.f130963W0);
            }
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: b */
        public void mo65023b(VNavigationTabLayout.C22738f c22738f) {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: c */
        public void mo65024c(VNavigationTabLayout.C22738f c22738f) {
            View viewM224931d;
            int iM224933f = c22738f.m224933f();
            if (cmg.m111183K() && iM224933f == 1 && (viewM224931d = c22738f.m224931d()) != null) {
                FeedLikeTabTitleView feedLikeTabTitleView = (FeedLikeTabTitleView) viewM224931d.findViewById(hdc0.f108884W1);
                if (NullChecker.m82486a(feedLikeTabTitleView) && feedLikeTabTitleView.m65586q0()) {
                    feedLikeTabTitleView.m65589t0();
                }
            }
            if (NullChecker.m82486a(FriendsFeedViewPagerFrag.this.f42369V)) {
                if (!cmg.m111175D() && !cmg.m111183K()) {
                    bnl0.m105524M(FriendsFeedViewPagerFrag.this.f42369V, false);
                }
                if (!cmg.m111175D() && cmg.m111183K()) {
                    bnl0.m105524M(FriendsFeedViewPagerFrag.this.f42369V, iM224933f == 1);
                }
                if (cmg.m111175D() && !cmg.m111183K()) {
                    bnl0.m105524M(FriendsFeedViewPagerFrag.this.f42369V, iM224933f == 0);
                }
                if (cmg.m111175D() && cmg.m111183K()) {
                    bnl0.m105524M(FriendsFeedViewPagerFrag.this.f42369V, true);
                }
            }
            if (NullChecker.m82486a(FriendsFeedViewPagerFrag.this.f42371X)) {
                bnl0.m105524M(FriendsFeedViewPagerFrag.this.f42371X, iM224933f == 0);
            }
            msi0.m159817o(FriendsFeedViewPagerFrag.this.f42365R[iM224933f], fgc0.f98914q);
            View viewM224931d2 = c22738f.m224931d();
            if (viewM224931d2 != null) {
                ((FeedLikeTabTitleView) viewM224931d2.findViewById(hdc0.f108884W1)).getTitleView().setBackgroundResource(lbc0.f130970X0);
            }
            if (!cmg.m111183K() && pu20.m173813h().equals(FriendsFeedViewPagerFrag.this.f42365R[iM224933f].getText().toString())) {
                t8c.m189652e().m189659h();
                byh.m106997d().m107008l(17);
                i4g0.m138523u("e_second_tab", "p_follow", jyb.m147494Y("sort_type", "follow"));
            }
            if (cmg.m111183K() && ((pu20.m173814i().equals(FriendsFeedViewPagerFrag.this.f42365R[iM224933f].getText().toString()) || pu20.m173813h().equals(FriendsFeedViewPagerFrag.this.f42365R[iM224933f].getText().toString())) && bnl0.m105529O0(FriendsFeedViewPagerFrag.this.f42366S[iM224933f]) && cmg.m111183K())) {
                FriendsFeedViewPagerFrag.this.f42352E0 = true;
            }
            if (pu20.m173821p().equals(FriendsFeedViewPagerFrag.this.f42365R[iM224933f].getText().toString())) {
                byh.m106997d().m107008l(16);
                i4g0.m138523u("e_second_tab", "p_discover_dating", jyb.m147494Y("sort_type", "dating"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public int m65268C5() {
        List<String> list = this.f42363P;
        if (list != null) {
            return list.indexOf(pu20.m173814i());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m65269E4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f42374k0 = false;
            this.f42373Z = false;
        } else if (c4470c == C4470c.f16269k) {
            this.f42374k0 = true;
        }
    }

    /* JADX INFO: renamed from: E5 */
    private int m65270E5() {
        if (cmg.m111183K()) {
            return m65336q5() ? 17 : 15;
        }
        return TextUtils.equals(pu20.m173821p(), m65342x5()) ? 16 : 17;
    }

    /* JADX INFO: renamed from: F5 */
    private String m65271F5() {
        if (cmg.m111183K()) {
            return "p_discover_dating";
        }
        return null;
    }

    /* JADX INFO: renamed from: H5 */
    private void m65272H5() {
        m65306p5();
        if (this.f42355H) {
            this.f42358K.m65555U4().m134768j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m65274M5(uxj0 uxj0Var) {
        if (m65336q5()) {
            return;
        }
        VNavigationTabLayout.C22738f c22738fM224873w = this.f42364Q.m224873w(1);
        Objects.requireNonNull(c22738fM224873w);
        View viewM224931d = c22738fM224873w.m224931d();
        if (viewM224931d == null) {
            return;
        }
        FeedLikeTabTitleView feedLikeTabTitleView = (FeedLikeTabTitleView) viewM224931d.findViewById(hdc0.f108884W1);
        if (!NullChecker.m82486a(feedLikeTabTitleView) || feedLikeTabTitleView.m65586q0()) {
            return;
        }
        feedLikeTabTitleView.setScrollTv(pu20.m173814i());
        feedLikeTabTitleView.m65587r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N5 */
    public /* synthetic */ void m65276N5(Boolean bool) {
        if (bool.booleanValue()) {
            NewPhotoAlbumFrag.f42388p1.onNext(Boolean.FALSE);
            DiscoveryPager discoveryPager = this.f42347A;
            if (discoveryPager == null) {
                this.f42372Y = true;
                return;
            }
            if (this.f42368U != 1) {
                discoveryPager.setCurrentItem(1);
            }
            if (m65336q5()) {
                this.f42352E0 = true;
                m65331f6();
            } else {
                kbh.f124949i = true;
                m65320T5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O5 */
    public /* synthetic */ void m65278O5(View view) {
        if (jyb.m147479J(f42342G0) && cmg.m111175D()) {
            return;
        }
        if (cmg.m111175D()) {
            i4g0.m138520r("e_select_icon", "p_discover_dating");
        }
        m65326a6(this.f42369V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P5 */
    public /* synthetic */ void m65280P5(Boolean bool) {
        if (this.f42368U == 1 && m65336q5() && this.f42352E0) {
            f42345J0 = false;
            m65331f6();
        } else if (this.f42368U == 1 && !m65336q5() && this.f42352E0) {
            this.f42352E0 = false;
            kbh.f124949i = true;
            t8c.m189652e().m189659h();
            byh.m106997d().m107009m(15, "p_discover_dating");
            i4g0.m138523u("e_second_tab", "p_follow", jyb.m147494Y("sort_type", "like"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public void m65316L5(int i) {
        this.f42366S[i].setVisibility(8);
        this.f42367T[i].setVisibility(8);
        if (cmg.m111183K()) {
            this.f42352E0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V5, reason: merged with bridge method [inline-methods] */
    public void m65315K5(int i) {
        if (f42345J0) {
            m65332g6(false);
            this.f42366S[i].setVisibility(0);
            if (cmg.m111183K()) {
                this.f42352E0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: n5 */
    public static FriendsFeedViewPagerFrag m65305n5() {
        return new FriendsFeedViewPagerFrag();
    }

    /* JADX INFO: renamed from: p5 */
    private void m65306p5() {
        if (NullChecker.m82486a(this.f42357J) && NullChecker.m82486a(this.f42358K)) {
            return;
        }
        this.f42357J = PhotoAlbumFeedFrag.m65544N4(FeedModule.m61405F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0, false);
        this.f42356I = PhotoAlbumFeedFrag.m65544N4(FeedModule.m61405F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
        this.f42358K = PhotoAlbumFeedFrag.m65543M4(FeedModule.m61405F().userId(), "from_discover_dating", -1, User.ID_TEAM_ACCOUNT, 14);
    }

    /* JADX INFO: renamed from: t5 */
    private void m65307t5(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                byh.m106997d().m107015s(Integer.valueOf(i));
            } else {
                byh.m106997d().m107012p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public int m65308z5() {
        List<String> list = this.f42363P;
        if (list != null) {
            return list.indexOf(pu20.m173813h());
        }
        return 0;
    }

    /* JADX INFO: renamed from: A5 */
    public PhotoAlbumFeedFrag m65309A5() {
        return this.f42358K;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m65310B5() {
        return m65341w5().m65551Q4();
    }

    /* JADX INFO: renamed from: D5 */
    public final int m65311D5(int i) {
        if (i == 0) {
            return 2;
        }
        return (i != 1 || m65336q5()) ? 1 : 5;
    }

    /* JADX INFO: renamed from: G5 */
    public void m65312G5() {
        m65341w5().m65556V4();
    }

    /* JADX INFO: renamed from: I5 */
    public void m65313I5() {
        int i = 0;
        while (i < this.f42364Q.getTabCount()) {
            View viewM65346l = this.f42362O.m65346l(i);
            VNavigationTabLayout.C22738f c22738fM224873w = this.f42364Q.m224873w(i);
            Objects.requireNonNull(c22738fM224873w);
            c22738fM224873w.m224941n(viewM65346l);
            VNavigationTabLayout.C22738f c22738fM224873w2 = this.f42364Q.m224873w(i);
            Objects.requireNonNull(c22738fM224873w2);
            VNavigationTabLayout.TabView tabView = c22738fM224873w2.f210794i;
            int iM175859d = i == 0 ? qa00.m175859d(4.0f) : 0;
            VNavigationTabLayout.C22738f c22738fM224873w3 = this.f42364Q.m224873w(i);
            Objects.requireNonNull(c22738fM224873w3);
            int paddingTop = c22738fM224873w3.f210794i.getPaddingTop();
            VNavigationTabLayout.C22738f c22738fM224873w4 = this.f42364Q.m224873w(i);
            Objects.requireNonNull(c22738fM224873w4);
            tabView.setPadding(iM175859d, paddingTop, 0, c22738fM224873w4.f210794i.getPaddingBottom());
            VText titleView = ((FeedLikeTabTitleView) viewM65346l.findViewById(hdc0.f108884W1)).getTitleView();
            msi0.m159817o(titleView, i == 1 ? fgc0.f98914q : fgc0.f98915r);
            titleView.setBackgroundResource(i == 1 ? lbc0.f130970X0 : lbc0.f130963W0);
            i++;
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m65314J5() {
        this.f42355H = true;
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f42358K;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.m65555U4().m134768j0();
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m65317P0() {
        return m65341w5().m65549P0();
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m65318Q5(String str) {
        if (m65317P0()) {
            return;
        }
        f42341F0 = str;
        m65320T5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m65319R5(String str) {
        PhotoAlbumFeedFrag photoAlbumFeedFragM65544N4;
        if (this.f42363P.size() > 1) {
            this.f42363P.remove(1);
            this.f42363P.add(1, str);
            this.f42365R[1].setText(str);
        }
        if (TextUtils.equals(str, pu20.m173813h())) {
            this.f42357J = null;
            photoAlbumFeedFragM65544N4 = PhotoAlbumFeedFrag.m65544N4(FeedModule.m61405F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0, false);
            this.f42357J = photoAlbumFeedFragM65544N4;
        } else {
            this.f42356I = null;
            photoAlbumFeedFragM65544N4 = PhotoAlbumFeedFrag.m65544N4(FeedModule.m61405F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
            this.f42356I = photoAlbumFeedFragM65544N4;
        }
        m65323X5(photoAlbumFeedFragM65544N4);
        t8c.m189652e().m189653a(this.f42363P.get(this.f42368U));
    }

    /* JADX INFO: renamed from: T5 */
    public void m65320T5() {
        m65321U5(false);
    }

    /* JADX INFO: renamed from: U5 */
    public void m65321U5(boolean z) {
        if (!z) {
            m65341w5().m65559Y4();
            return;
        }
        if (jyb.m147479J(this.f42361N)) {
            return;
        }
        int size = this.f42361N.size();
        for (int i = 0; i < size; i++) {
            PutongFrag putongFrag = this.f42361N.get(i);
            boolean z2 = (putongFrag.getArguments() != null ? putongFrag.getArguments().getInt("page_type", -2) : -2) != 0;
            if ((putongFrag instanceof PhotoAlbumFeedFrag) && z2) {
                ((PhotoAlbumFeedFrag) putongFrag).m65559Y4();
            }
        }
    }

    /* JADX INFO: renamed from: W5 */
    public void m65322W5() {
        m65341w5().m65560Z4();
    }

    /* JADX INFO: renamed from: X5 */
    public final void m65323X5(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f42361N.remove(1);
        this.f42361N.add(1, photoAlbumFeedFrag);
        m65325Z5();
        m65330e6();
        this.f42362O.m65349o(1, photoAlbumFeedFrag);
        photoAlbumFeedFrag.m65567h5(true);
        photoAlbumFeedFrag.m65566g5(true);
        photoAlbumFeedFrag.m65563c5();
        m65313I5();
        m65333h6(m65311D5(1));
    }

    /* JADX INFO: renamed from: Y5 */
    public void m65324Y5() {
        m65341w5().m65561a5();
    }

    /* JADX INFO: renamed from: Z5 */
    public void m65325Z5() {
        m65341w5().m65562b5();
    }

    /* JADX INFO: renamed from: a6 */
    public final void m65326a6(VImage vImage) {
        VImage vImage2;
        PopupWindow popupWindow = this.f42375p0;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f42375p0.dismiss();
            return;
        }
        if (cmg.m111175D()) {
            vImage2 = vImage;
            this.f42375p0 = new e0h(vImage2, act(), f42342G0, f42341F0, new y20() { // from class: l.sbj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167148a.m65318Q5((String) obj);
                }
            });
        } else {
            vImage2 = vImage;
            if (cmg.m111183K()) {
                i4g0.m138520r("e_type_popup", "p_like");
                this.f42375p0 = new b5h(vImage2, act(), f42343H0, this.f42363P.size() > 1 ? this.f42363P.get(1) : "", new y20() { // from class: l.tbj
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f172967a.m65319R5((String) obj);
                    }
                });
            }
        }
        this.f42375p0.showAsDropDown(vImage2, qa00.m175858c().widthPixels - qa00.m175859d(12.0f), -qa00.m175859d(12.0f));
    }

    /* JADX INFO: renamed from: b6 */
    public void m65327b6(boolean z) {
        this.f42350D = z;
        if (NullChecker.m82486a(this.f42362O)) {
            for (int i = 0; i < this.f42362O.f42377a.size(); i++) {
                Fragment fragment = (Fragment) this.f42362O.f42377a.get(i);
                if (fragment instanceof PhotoAlbumFeedFrag) {
                    ((PhotoAlbumFeedFrag) fragment).m65564e5(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m65328c6(boolean z) {
        this.f42354G = z;
        m65341w5().m65566g5(z);
    }

    /* JADX INFO: renamed from: d6 */
    public void m65329d6(boolean z) {
        this.f42353F = z;
        m65341w5().m65567h5(z);
    }

    /* JADX INFO: renamed from: e6 */
    public void m65330e6() {
        m65341w5().m65570m5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        if (cmg.m111183K() && NullChecker.m82486a(act())) {
            duringCreated(act().lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.nbj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141233a.m65269E4((C4470c) obj);
                }
            }));
        }
        if (cmg.m111183K()) {
            duringCreated(f42344I0).subscribe(psd0.m173596G(new y20() { // from class: l.obj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f146592a.m65274M5((uxj0) obj);
                }
            }));
        }
        if (cmg.m111183K()) {
            duringCreated(NewPhotoAlbumFrag.f42388p1).subscribe(psd0.m173596G(new y20() { // from class: l.pbj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151390a.m65276N5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f6 */
    public final void m65331f6() {
        if (this.f42368U == 1 && m65336q5() && this.f42352E0) {
            this.f42352E0 = false;
            kbh.f124949i = true;
            t8c.m189652e().m189659h();
            byh.m106997d().m107009m(15, "p_discover_dating");
            i4g0.m138523u("e_second_tab", "p_follow", jyb.m147494Y("sort_type", "like"));
        }
        if (this.f42363P.size() > 1) {
            this.f42363P.remove(1);
            this.f42363P.add(1, pu20.m173814i());
            this.f42365R[1].setText(pu20.m173814i());
        }
        this.f42356I = null;
        PhotoAlbumFeedFrag photoAlbumFeedFragM65544N4 = PhotoAlbumFeedFrag.m65544N4(FeedModule.m61405F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12, false);
        this.f42356I = photoAlbumFeedFragM65544N4;
        m65323X5(photoAlbumFeedFragM65544N4);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f42363P.add(0, pu20.m173821p());
        boolean zM111183K = cmg.m111183K();
        List<String> list = this.f42363P;
        if (zM111183K) {
            list.add(1, pu20.m173814i());
        } else {
            list.add(1, pu20.m173813h());
        }
        m65272H5();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f42358K);
        if (cmg.m111183K()) {
            arrayList.add(this.f42356I);
        } else {
            arrayList.add(this.f42357J);
        }
        this.f42362O.m65348n(arrayList);
        this.f42347A.setOnPageChangeListener(this.f42362O);
        this.f42347A.setAdapter(this.f42362O);
        this.f42347A.setOffscreenPageLimit(1);
        this.f42349C.setBackgroundColor(act().getResources().getColor(k9c0.f124522n0));
        this.f42349C.setupViewPager(this.f42347A);
        this.f42364Q = this.f42349C.getTabLayout();
        bnl0.m105540X(this.f42376z, qa00.m175859d(44.0f) + bnl0.m105511F0());
        if (cmg.m111175D() || cmg.m111183K()) {
            try {
                String strM80485F = RemoteConfig.m80481x().m80485F("feed_filter_params_configs");
                if (!TextUtils.isEmpty(strM80485F)) {
                    f42342G0 = JsonParseHelper.parseList(strM80485F, FeedSelectParams.JSON_ADAPTER);
                }
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
            if (!jyb.m147479J(f42342G0)) {
                List<FeedSelectParams> list2 = f42342G0;
                f42341F0 = list2.get(list2.size() - 1).param;
            }
            ArrayList arrayList2 = new ArrayList();
            f42343H0 = arrayList2;
            arrayList2.add(pu20.m173814i());
            f42343H0.add(pu20.m173813h());
            VImage vImage = new VImage(act());
            this.f42369V = vImage;
            bnl0.m105524M(vImage, !cmg.m111183K());
            this.f42369V.setPadding(qa00.m175859d(6.0f), qa00.m175859d(6.0f), qa00.m175859d(6.0f), qa00.m175859d(6.0f));
            FeedModule.m61406H().mo31800mm(this.f42369V, false);
            this.f42349C.setRightIconViews(this.f42369V);
            bnl0.m105509E0(this.f42369V, new View.OnClickListener() { // from class: l.qbj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156484a.m65278O5(view);
                }
            });
        }
        if (cmg.m111182J()) {
            this.f42371X = new RoamEntranceView(act());
            nyh.m165324a().m165327d(this.f42371X);
            boolean zM82486a = NullChecker.m82486a(this.f42369V);
            VNavigationBar vNavigationBar = this.f42349C;
            if (zM82486a) {
                vNavigationBar.setRightIconViews(this.f42371X, this.f42369V);
            } else {
                vNavigationBar.setRightIconViews(this.f42371X);
            }
        }
        int i = 0;
        while (i < this.f42364Q.getTabCount()) {
            View viewM65346l = this.f42362O.m65346l(i);
            VNavigationTabLayout.C22738f c22738fM224873w = this.f42364Q.m224873w(i);
            Objects.requireNonNull(c22738fM224873w);
            c22738fM224873w.m224941n(viewM65346l);
            VNavigationTabLayout.C22738f c22738fM224873w2 = this.f42364Q.m224873w(i);
            Objects.requireNonNull(c22738fM224873w2);
            VNavigationTabLayout.TabView tabView = c22738fM224873w2.f210794i;
            int iM175859d = i == 0 ? qa00.m175859d(4.0f) : 0;
            VNavigationTabLayout.C22738f c22738fM224873w3 = this.f42364Q.m224873w(i);
            Objects.requireNonNull(c22738fM224873w3);
            int paddingTop = c22738fM224873w3.f210794i.getPaddingTop();
            VNavigationTabLayout.C22738f c22738fM224873w4 = this.f42364Q.m224873w(i);
            Objects.requireNonNull(c22738fM224873w4);
            tabView.setPadding(iM175859d, paddingTop, 0, c22738fM224873w4.f210794i.getPaddingBottom());
            VText titleView = ((FeedLikeTabTitleView) viewM65346l.findViewById(hdc0.f108884W1)).getTitleView();
            msi0.m159817o(titleView, i == 0 ? fgc0.f98914q : fgc0.f98915r);
            titleView.setBackgroundResource(i == 0 ? lbc0.f130970X0 : lbc0.f130963W0);
            i++;
        }
        this.f42364Q.setOnTabSelectedListener((VNavigationTabLayout.InterfaceC22736d) new C11449b());
        String strM173816k = pu20.m173816k();
        if (cmg.m111183K() && (TextUtils.equals(strM173816k, pu20.m173814i()) || this.f42372Y)) {
            this.f42368U = 1;
            this.f42347A.setCurrentItem(1);
            if (this.f42372Y) {
                this.f42372Y = false;
            }
            if (bnl0.m105529O0(this.f42366S[1])) {
                FeedModule.f39703d.m145762oc();
            }
        }
        duringCreated(f42346K0).subscribe(psd0.m173596G(new y20() { // from class: l.rbj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162026a.m65280P5((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g6 */
    public final void m65332g6(boolean z) {
        int iM65308z5 = m65336q5() ? m65308z5() : m65268C5();
        this.f42367T[iM65308z5].stopAnimation();
        int i = this.f42368U;
        ImageView[] imageViewArr = this.f42366S;
        if (i == iM65308z5) {
            bnl0.m105540X(imageViewArr[iM65308z5], qa00.m175859d(2.0f));
            bnl0.m105539W(this.f42366S[iM65308z5], qa00.m175859d(2.0f));
            bnl0.m105540X(this.f42367T[iM65308z5], 0);
            bnl0.m105539W(this.f42367T[iM65308z5], 0);
        } else {
            bnl0.m105540X(imageViewArr[iM65308z5], qa00.m175859d(7.0f));
            bnl0.m105539W(this.f42366S[iM65308z5], qa00.m175859d(11.0f));
            bnl0.m105540X(this.f42367T[iM65308z5], qa00.m175859d(5.0f));
            bnl0.m105539W(this.f42367T[iM65308z5], qa00.m175859d(9.0f));
        }
        if (z) {
            this.f42366S[iM65308z5].setVisibility(4);
            this.f42367T[iM65308z5].setVisibility(0);
            this.f42367T[iM65308z5].loadAnimWithListener("feed_follow_red_dot.svga", 1, new AnimListener(), true);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public final void m65333h6(int i) {
        if (i == 1) {
            FeedModule.f39703d.f121304I1 = "follow";
        } else if (i == 2) {
            FeedModule.f39703d.f121304I1 = "dating";
        } else if (i == 3) {
            FeedModule.f39703d.f121304I1 = "activity_one";
        } else if (i == 4) {
            FeedModule.f39703d.f121304I1 = "activity_two";
        } else if (i == 5) {
            FeedModule.f39703d.f121304I1 = "like";
        }
        this.f42360M = i;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f42362O = new C11448a(getChildFragmentManager());
        return m65334m5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public View m65334m5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wbj.m205719b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o5 */
    public void m65335o5(int i) {
        if (getActivity() == null || this.f42360M == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f42347A.setCurrentItem(m65343y5());
            } else if (i == 3) {
                this.f42347A.setCurrentItem(m65339u5());
            } else if (i == 4) {
                this.f42347A.setCurrentItem(m65340v5());
            } else if (i == 5) {
                if (m65336q5()) {
                    m65331f6();
                    this.f42360M = i;
                    return;
                }
                this.f42347A.setCurrentItem(m65268C5());
            }
        } else if (!m65336q5()) {
            return;
        } else {
            this.f42347A.setCurrentItem(m65308z5());
        }
        this.f42360M = i;
        m65329d6(this.f42353F);
        m65328c6(this.f42354G);
        setUserVisibleHint(this.f42351E);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f42373Z = true;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m65325Z5();
        m65330e6();
    }

    /* JADX INFO: renamed from: q5 */
    public boolean m65336q5() {
        return this.f42363P.size() > 1 && TextUtils.equals(this.f42363P.get(1), pu20.m173813h());
    }

    /* JADX INFO: renamed from: r5 */
    public void m65337r5(int i) {
        if (m65308z5() > 0 || m65268C5() >= 0) {
            final int iM65308z5 = m65336q5() ? m65308z5() : m65268C5();
            boolean z = this.f42366S[iM65308z5].getVisibility() == 0 || this.f42367T[iM65308z5].getVisibility() == 0;
            ayh ayhVar = new ayh(i > 0, new x20() { // from class: l.ubj
                @Override // p153l.x20
                public final void call() {
                    this.f178311a.m65315K5(iM65308z5);
                }
            });
            ayhVar.m100875b(new ayh(true, new x20() { // from class: l.vbj
                @Override // p153l.x20
                public final void call() {
                    this.f183254a.m65316L5(iM65308z5);
                }
            }));
            ayhVar.m100874a();
            ImageView imageView = this.f42366S[iM65308z5];
            m65307t5(imageView, z, imageView.getVisibility() == 0 || this.f42367T[iM65308z5].getVisibility() == 0, m65270E5(), m65271F5());
        }
    }

    /* JADX INFO: renamed from: s5 */
    public void m65338s5() {
        m65341w5().m65550P4();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            this.f42351E = true;
        } else {
            this.f42351E = false;
        }
        m65341w5().setUserVisibleHint(z);
    }

    /* JADX INFO: renamed from: u5 */
    public final int m65339u5() {
        return 0;
    }

    /* JADX INFO: renamed from: v5 */
    public final int m65340v5() {
        return 0;
    }

    /* JADX INFO: renamed from: w5 */
    public PhotoAlbumFeedFrag m65341w5() {
        C11448a c11448a = this.f42362O;
        if (c11448a != null) {
            return (PhotoAlbumFeedFrag) c11448a.m65345k(this.f42368U);
        }
        m65272H5();
        return this.f42358K;
    }

    /* JADX INFO: renamed from: x5 */
    public CharSequence m65342x5() {
        C11448a c11448a = this.f42362O;
        return (c11448a == null || c11448a.getCount() == 0) ? pu20.m173821p() : this.f42362O.getPageTitle(this.f42368U);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
    }

    /* JADX INFO: renamed from: y5 */
    public final int m65343y5() {
        List<String> list = this.f42363P;
        if (list != null) {
            return list.indexOf(pu20.m173821p());
        }
        return 0;
    }
}
