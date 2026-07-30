package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.animation.Animator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.meituan.robust.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p151v.navigationbar.VNavigationTabLayout;
import p153l.ach;
import p153l.ayh;
import p153l.bnl0;
import p153l.byh;
import p153l.cmg;
import p153l.cn40;
import p153l.dmk0;
import p153l.h80;
import p153l.hdc0;
import p153l.i4g0;
import p153l.ihh;
import p153l.j4h;
import p153l.jyb;
import p153l.jyh;
import p153l.k3h;
import p153l.k9c0;
import p153l.kbh;
import p153l.keh;
import p153l.kl40;
import p153l.kl80;
import p153l.ksg;
import p153l.l4g0;
import p153l.l51;
import p153l.l94;
import p153l.lbc0;
import p153l.leh;
import p153l.lyh0;
import p153l.mrb0;
import p153l.orb0;
import p153l.p6i;
import p153l.pcj;
import p153l.pf60;
import p153l.pk50;
import p153l.pm80;
import p153l.psd0;
import p153l.pu20;
import p153l.pzi0;
import p153l.q1i;
import p153l.qa00;
import p153l.qcj;
import p153l.rcj;
import p153l.rkh;
import p153l.sbh;
import p153l.t2m;
import p153l.tcj;
import p153l.tec0;
import p153l.tfj0;
import p153l.th70;
import p153l.tog;
import p153l.tu2;
import p153l.v370;
import p153l.w0m;
import p153l.wsg;
import p153l.x20;
import p153l.y20;
import p153l.yvg;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFrag extends PutongFrag implements FeedService.InterfaceC11577a, FeedService.InterfaceC11578b, t2m {

    /* JADX INFO: renamed from: f1 */
    public static long f42088f1 = 7200000;

    /* JADX INFO: renamed from: g1 */
    public static boolean f42089g1 = true;

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f42090A;

    /* JADX INFO: renamed from: B */
    public VFrame f42091B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f42092C;

    /* JADX INFO: renamed from: D */
    public VFrame f42093D;

    /* JADX INFO: renamed from: E */
    public ImageView f42094E;

    /* JADX INFO: renamed from: E0 */
    public int f42095E0;

    /* JADX INFO: renamed from: F */
    public VText f42096F;

    /* JADX INFO: renamed from: F0 */
    public String f42097F0;

    /* JADX INFO: renamed from: G */
    public VNavigationTabLayout f42098G;

    /* JADX INFO: renamed from: H */
    public VFrame f42100H;

    /* JADX INFO: renamed from: I */
    public VText f42102I;

    /* JADX INFO: renamed from: I0 */
    public List<PutongFrag> f42103I0;

    /* JADX INFO: renamed from: J */
    public VFrame f42104J;

    /* JADX INFO: renamed from: J0 */
    public q1i f42105J0;

    /* JADX INFO: renamed from: K */
    public VImage f42106K;

    /* JADX INFO: renamed from: K0 */
    public String f42107K0;

    /* JADX INFO: renamed from: L */
    public FeedRedDotView f42108L;

    /* JADX INFO: renamed from: L0 */
    public boolean f42109L0;

    /* JADX INFO: renamed from: M */
    public PopupWindow f42110M;

    /* JADX INFO: renamed from: Q */
    public l4g0 f42118Q;

    /* JADX INFO: renamed from: U */
    public String f42126U;

    /* JADX INFO: renamed from: V0 */
    public Dialog f42129V0;

    /* JADX INFO: renamed from: W */
    public long f42130W;

    /* JADX INFO: renamed from: W0 */
    @Nullable
    public C11441g f42131W0;

    /* JADX INFO: renamed from: X0 */
    public String f42133X0;

    /* JADX INFO: renamed from: a1 */
    public Runnable f42138a1;

    /* JADX INFO: renamed from: b1 */
    public sbh f42139b1;

    /* JADX INFO: renamed from: c1 */
    public String f42140c1;

    /* JADX INFO: renamed from: d1 */
    public String f42141d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f42142e1;

    /* JADX INFO: renamed from: p0 */
    public boolean f42144p0;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f42145z;

    /* JADX INFO: renamed from: N */
    public l4g0 f42112N = new l4g0("p_like", PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: O */
    public l4g0 f42114O = new l4g0("p_follow", PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: P */
    public l4g0 f42116P = new l4g0(OMSDialogPositon.p_nearby, PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: R */
    public keh f42120R = new leh();

    /* JADX INFO: renamed from: S */
    public y20<Intent> f42122S = dmk0.m116962a(400, new y20() { // from class: l.sg70
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f167835a.m64960b7((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: T */
    public C22507a<Boolean> f42124T = C22507a.m222758b();

    /* JADX INFO: renamed from: V */
    public boolean f42128V = true;

    /* JADX INFO: renamed from: X */
    public C22508b<Long> f42132X = C22508b.m222767b();

    /* JADX INFO: renamed from: Y */
    public boolean f42134Y = false;

    /* JADX INFO: renamed from: Z */
    public boolean f42136Z = false;

    /* JADX INFO: renamed from: k0 */
    public int f42143k0 = 1;

    /* JADX INFO: renamed from: G0 */
    public int f42099G0 = -1;

    /* JADX INFO: renamed from: H0 */
    public boolean f42101H0 = false;

    /* JADX INFO: renamed from: M0 */
    public h80<C11440f> f42111M0 = new C11435a();

    /* JADX INFO: renamed from: N0 */
    public C11438d f42113N0 = null;

    /* JADX INFO: renamed from: O0 */
    public List<String> f42115O0 = new ArrayList();

    /* JADX INFO: renamed from: P0 */
    public TextView[] f42117P0 = new TextView[4];

    /* JADX INFO: renamed from: Q0 */
    public VImage[] f42119Q0 = new VImage[1];

    /* JADX INFO: renamed from: R0 */
    public TextView[] f42121R0 = new TextView[4];

    /* JADX INFO: renamed from: S0 */
    public ImageView[] f42123S0 = new ImageView[4];

    /* JADX INFO: renamed from: T0 */
    public int f42125T0 = 0;

    /* JADX INFO: renamed from: U0 */
    public boolean f42127U0 = true;

    /* JADX INFO: renamed from: Y0 */
    public boolean f42135Y0 = false;

    /* JADX INFO: renamed from: Z0 */
    public v370 f42137Z0 = new v370();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$a */
    public class C11435a extends h80<C11440f> {
        public C11435a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(C11440f c11440f, int i) {
            if (i == 1) {
                i4g0.m138526x("e_tantan_topic", PhotoAlbumFrag.this.m64992r6());
            } else if (NullChecker.m82486a(c11440f.f42156c)) {
                i4g0.m138528z(c11440f.f42154a, c11440f.f42155b, c11440f.f42156c);
            } else {
                i4g0.m138526x(c11440f.f42154a, c11440f.f42155b);
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(C11440f c11440f, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$b */
    public class RunnableC11436b implements Runnable {
        public RunnableC11436b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PhotoAlbumFrag.this.m64999u7();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$c */
    public class C11437c implements PopupWindow.OnDismissListener {
        public C11437c() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            boolean zEquals = TextUtils.equals(PhotoAlbumFrag.this.f42119Q0[0].getTag().toString(), PhotoAlbumFrag.this.f42140c1);
            PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
            if (zEquals) {
                photoAlbumFrag.f42119Q0[0].setTag(PhotoAlbumFrag.this.f42141d1);
                PhotoAlbumFrag.this.f42119Q0[0].setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(lbc0.f131152u1));
            } else {
                photoAlbumFrag.f42119Q0[0].setTag(PhotoAlbumFrag.this.f42140c1);
                PhotoAlbumFrag.this.f42119Q0[0].setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(lbc0.f131160v1));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$d */
    public class C11438d extends FragmentPagerAdapter implements ViewPager.InterfaceC0718j, w0m {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f42149a;

        /* JADX INFO: renamed from: b */
        public Method f42150b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f42151c;

        public C11438d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f42149a = new ArrayList();
            this.f42150b = null;
            this.f42151c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f42150b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.m82479c(e);
                this.f42150b = null;
            } catch (SecurityException e2) {
                CrashHelper.m82479c(e2);
                this.f42150b = null;
            }
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

        @Override // p153l.w0m
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> mo65014g(int i) {
            return null;
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f42149a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f42149a.get(i);
        }

        @Override // p153l.cf60
        public CharSequence getPageTitle(int i) {
            return (CharSequence) PhotoAlbumFrag.this.f42115O0.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.m82486a(this.f42151c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f42151c.m2590t0());
                    sb.append(Constants.PACKNAME_END);
                    sb.append("lstFrag :" + this.f42149a);
                    tu2.m192703a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: l */
        public Fragment m65015l(int i) {
            Fragment fragmentM2558i0;
            Method method = this.f42150b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentM2558i0 = PhotoAlbumFrag.this.getChildFragmentManager().m2558i0((String) method.invoke(this, Integer.valueOf(PhotoAlbumFrag.this.f42090A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.m82479c(e);
                fragmentM2558i0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.m82479c(e2);
                fragmentM2558i0 = null;
            }
            return fragmentM2558i0 == null ? getItem(i) : fragmentM2558i0;
        }

        /* JADX INFO: renamed from: m */
        public View m65016m(final int i) {
            View viewInflate = PhotoAlbumFrag.this.act().inflater().inflate(tec0.f173788x5, (ViewGroup) null);
            final VImage vImage = (VImage) viewInflate.findViewById(hdc0.f108826D0);
            vImage.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(lbc0.f131160v1));
            vImage.setTag(PhotoAlbumFrag.this.f42140c1);
            if (cmg.m111197Y() && i == 0) {
                PhotoAlbumFrag.this.f42119Q0[0] = vImage;
            }
            final TextView textView = (TextView) viewInflate.findViewById(hdc0.f108909d2);
            TextView textView2 = (TextView) viewInflate.findViewById(hdc0.f108913e2);
            PhotoAlbumFrag.this.f42117P0[i] = textView;
            PhotoAlbumFrag.this.f42121R0[i] = textView2;
            PhotoAlbumFrag.this.f42123S0[i] = (ImageView) viewInflate.findViewById(hdc0.f108978y0);
            textView.setText((CharSequence) PhotoAlbumFrag.this.f42115O0.get(i));
            bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.qh70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157512a.m65017n(i, textView, vImage, view);
                }
            });
            PhotoAlbumFrag.this.f42117P0[i].setTextColor(PhotoAlbumFrag.this.getResources().getColor(k9c0.f124494Z));
            return viewInflate;
        }

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ void m65017n(int i, TextView textView, VImage vImage, View view) {
            if (PhotoAlbumFrag.this.f42125T0 == i && TextUtils.equals("喜欢", textView.getText().toString())) {
                boolean zEquals = TextUtils.equals(vImage.getTag().toString(), PhotoAlbumFrag.this.f42140c1);
                PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
                if (zEquals) {
                    vImage.setTag(photoAlbumFrag.f42141d1);
                    vImage.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(lbc0.f131152u1));
                } else {
                    vImage.setTag(photoAlbumFrag.f42140c1);
                    vImage.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(lbc0.f131160v1));
                }
                PhotoAlbumFrag.this.m64987o7(view);
            }
            if (PhotoAlbumFrag.this.f42125T0 != i) {
                VNavigationTabLayout vNavigationTabLayout = PhotoAlbumFrag.this.f42098G;
                vNavigationTabLayout.m224844D(vNavigationTabLayout.m224873w(i));
            }
        }

        /* JADX INFO: renamed from: o */
        public void m65018o() {
            if (this.f42151c == null) {
                return;
            }
            Iterator<PutongFrag> it = this.f42149a.iterator();
            while (it.hasNext()) {
                this.f42151c.m2568m().mo2716r(it.next()).mo2709j();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            Fragment fragmentM65015l = PhotoAlbumFrag.this.f42113N0.m65015l(i);
            if ((fragmentM65015l instanceof PhotoAlbumFeedFrag) && ((PhotoAlbumFeedFrag) fragmentM65015l).m65551Q4()) {
                FeedModule.m61406H().mo31782jg(PhotoAlbumFrag.this.act(), false);
            } else {
                FeedModule.m61406H().mo31720Pq(PhotoAlbumFrag.this.act(), false);
            }
            PhotoAlbumFrag.this.m64908m7();
            PhotoAlbumFrag.this.m64918v7();
            PhotoAlbumFrag.this.m64920w6();
            PhotoAlbumFrag.this.f42125T0 = i;
            PhotoAlbumPictureView.m65042u(PhotoAlbumFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (true) {
                if (i2 >= this.f42149a.size()) {
                    break;
                }
                Fragment fragmentM65015l2 = m65015l(i2);
                if (fragmentM65015l2 instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragmentM65015l2;
                    photoAlbumFeedFrag.m65567h5(i2 == i);
                    photoAlbumFeedFrag.m65566g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag.m65560Z4();
                    }
                } else if (fragmentM65015l2 instanceof PhotoAlbumFallsFeedFrag) {
                    ((PhotoAlbumFallsFeedFrag) fragmentM65015l2).m64798p5(i2 == i);
                }
                i2++;
            }
            PhotoAlbumFrag.this.f42127U0 = false;
            PhotoAlbumFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f39703d.f121338Y0.onNext(Boolean.FALSE);
            }
            PhotoAlbumFrag.this.m64993r7();
        }

        /* JADX INFO: renamed from: p */
        public void m65019p(List<PutongFrag> list) {
            PhotoAlbumFrag.this.f42103I0 = list;
            this.f42149a.clear();
            if (NullChecker.m82487b(list)) {
                this.f42149a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$e */
    public class C11439e implements VNavigationTabLayout.InterfaceC22736d {
        public C11439e() {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: a */
        public void mo65022a(VNavigationTabLayout.C22738f c22738f) {
            FeedModule.f39703d.m145587Pb().mo144678m(PhotoAlbumFrag.this.act(), PhotoAlbumFrag.this.f42117P0[c22738f.m224933f()]);
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: b */
        public void mo65023b(VNavigationTabLayout.C22738f c22738f) {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: c */
        public void mo65024c(VNavigationTabLayout.C22738f c22738f) {
            int iM224933f = c22738f.m224933f();
            VNavigationTabLayout.TabView tabView = PhotoAlbumFrag.this.f42098G.m224873w(0).f210794i;
            if (iM224933f == 0 && cmg.m111197Y()) {
                tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), qa00.m175859d(15.0f), tabView.getPaddingBottom());
                PhotoAlbumFrag.this.f42119Q0[0].setVisibility(0);
                boolean zM111208f0 = cmg.m111208f0();
                PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
                if (!zM111208f0) {
                    if (photoAlbumFrag.f42135Y0) {
                        tfj0.m190940c("e_red_dot_explore", byh.m106997d().m107002f(PhotoAlbumFrag.this.m64990q6()), new pf60("red_dot_relation_child", "red_dot_like"));
                    }
                    if (PhotoAlbumFrag.this.f42135Y0 && ach.m96850g().f69708b.mo167403f()) {
                        FeedModule.f39703d.f121298G1 = "recommend";
                        PhotoAlbumFrag.this.m64965e7();
                    }
                    ach.m96850g().m96857m();
                } else if (bnl0.m105529O0(photoAlbumFrag.f42123S0[0])) {
                    if (kbh.f124947g) {
                        FeedModule.f39703d.m145762oc();
                    } else {
                        kbh.f124949i = true;
                        boolean z = PhotoAlbumFrag.this.f42142e1;
                        PhotoAlbumFrag photoAlbumFrag2 = PhotoAlbumFrag.this;
                        if (z) {
                            photoAlbumFrag2.f42142e1 = false;
                        } else {
                            l51.m152888H(photoAlbumFrag2.getContext(), new Runnable() { // from class: l.rh70
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f163079a.m65025f();
                                }
                            }, 200L);
                        }
                    }
                    kbh.f124947g = false;
                    kbh.f124948h = false;
                    l51.m152888H(PhotoAlbumFrag.this.getContext(), new Runnable() { // from class: l.sh70
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f168601a.m65026g();
                        }
                    }, 500L);
                }
            } else {
                if (cmg.m111197Y() && !cmg.m111208f0()) {
                    ach.m96850g().m96856l(true);
                }
                if (cmg.m111197Y() && PhotoAlbumFrag.this.f42119Q0 != null && PhotoAlbumFrag.this.f42119Q0.length > 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                    PhotoAlbumFrag.this.f42119Q0[0].setVisibility(8);
                }
            }
            FeedModule.f39703d.m145587Pb().mo144668c(PhotoAlbumFrag.this.act(), PhotoAlbumFrag.this.f42117P0[iM224933f]);
            if (PhotoAlbumFrag.this.getString(R$string.f39920h5).equals(PhotoAlbumFrag.this.f42117P0[iM224933f].getText().toString()) || "喜欢".equals(PhotoAlbumFrag.this.f42117P0[iM224933f].getText().toString())) {
                byh.m106997d().m107008l("喜欢".equals(PhotoAlbumFrag.this.f42117P0[iM224933f].getText().toString()) ? 15 : 3);
                PhotoAlbumFrag.this.mo64968g2();
            }
            if (PhotoAlbumFrag.this.getString(R$string.f39927i5).equals(PhotoAlbumFrag.this.f42117P0[iM224933f].getText().toString()) && PhotoAlbumFrag.this.isResumed()) {
                byh.m106997d().m107008l(11);
                if (PhotoAlbumFrag.this.f42101H0) {
                    PhotoAlbumFrag.this.m64971h6();
                }
            }
            if (PhotoAlbumFrag.this.getString(R$string.f39734E0).equals(PhotoAlbumFrag.this.f42117P0[iM224933f].getText().toString()) && iM224933f != PhotoAlbumFrag.this.f42125T0) {
                PhotoAlbumFrag photoAlbumFrag3 = PhotoAlbumFrag.this;
                tfj0.m190939b("e_recommend", photoAlbumFrag3.m64994s6(photoAlbumFrag3.f42099G0), new tfj0.C20302a[0]);
            }
            PhotoAlbumFrag.this.f42099G0 = iM224933f;
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m65025f() {
            PhotoAlbumFrag.this.m64965e7();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m65026g() {
            bnl0.m105524M(PhotoAlbumFrag.this.f42123S0[0], false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$f */
    public class C11440f {

        /* JADX INFO: renamed from: a */
        public String f42154a;

        /* JADX INFO: renamed from: b */
        public String f42155b;

        /* JADX INFO: renamed from: c */
        public JSONObject f42156c;

        public C11440f(String str, String str2, JSONObject jSONObject) {
            this.f42154a = str;
            this.f42155b = str2;
            this.f42156c = jSONObject;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$g */
    public class C11441g {

        /* JADX INFO: renamed from: a */
        public int f42158a;

        /* JADX INFO: renamed from: b */
        public int f42159b;

        /* JADX INFO: renamed from: c */
        public int f42160c;

        /* JADX INFO: renamed from: d */
        public boolean f42161d;

        /* JADX INFO: renamed from: e */
        public boolean f42162e;

        /* JADX INFO: renamed from: f */
        public boolean f42163f;

        public C11441g(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
            this.f42159b = i;
            this.f42158a = i2;
            this.f42160c = i3;
            this.f42161d = z;
            this.f42162e = z2;
            this.f42163f = z3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11441g)) {
                return false;
            }
            C11441g c11441g = (C11441g) obj;
            return this.f42161d == c11441g.f42161d && this.f42158a == c11441g.f42158a && this.f42159b == c11441g.f42159b && this.f42160c == c11441g.f42160c && this.f42162e == c11441g.f42162e && this.f42163f == c11441g.f42163f;
        }

        public int hashCode() {
            int iHashCode = Integer.valueOf(this.f42158a).hashCode();
            int iHashCode2 = Integer.valueOf(this.f42160c).hashCode();
            int iHashCode3 = Boolean.valueOf(this.f42161d).hashCode();
            int iHashCode4 = Boolean.valueOf(this.f42162e).hashCode();
            return (Boolean.valueOf(this.f42163f).hashCode() >> 1) ^ ((((iHashCode >> 1) ^ iHashCode2) ^ iHashCode3) ^ (iHashCode4 >> 1));
        }

        public String toString() {
            return "unreadLikeFeeds:" + this.f42159b + "\nunreadFeeds:" + this.f42158a + "\nunreadActivities:" + this.f42160c + "\nisShowFixTimeDot:" + this.f42161d + "\nisShowTopicDot:" + this.f42162e + "\nisHideRedByNewUser:" + this.f42163f + SignParameters.NEW_LINE;
        }
    }

    public PhotoAlbumFrag() {
        if (NullChecker.m82487b(FeedModule.f39703d)) {
            pm80.m172919b().m172920a();
            if (cmg.m111197Y() && !cmg.m111208f0()) {
                ach.m96850g().m96856l(false);
            }
        }
        this.f42138a1 = new RunnableC11436b();
        this.f42140c1 = "feed_like_menu_icon_default";
        this.f42141d1 = "feed_like_menu_icon";
    }

    /* JADX INFO: renamed from: A6 */
    private void m64857A6(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.fh70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f99018a.m64952X6(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.gh70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f104075a.m64955Y6(view2);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m64871N4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a7 */
    public /* synthetic */ void m64893a7(View view) {
        tfj0.m190939b("e_moment_unread_notes_history", m64977j6(), new tfj0.C20302a[0]);
        act().startActivity(PhotoAlbumActivitiesAct.m66154X1(act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: c6 */
    private void m64896c6(final int i) {
        if (m64983m6() >= 0 || (cmg.m111208f0() && m64986o6() >= 0)) {
            final int iM64986o6 = cmg.m111197Y() ? m64986o6() : m64983m6();
            boolean z = this.f42123S0[iM64986o6].getVisibility() == 0;
            ayh ayhVar = new ayh(false, new x20() { // from class: l.ig70
                @Override // p153l.x20
                public final void call() {
                    this.f114758a.m64928E6(i);
                }
            });
            ayhVar.m100875b(new ayh(i > 0, new x20() { // from class: l.tg70
                @Override // p153l.x20
                public final void call() {
                    this.f174045a.m64929F6(iM64986o6);
                }
            })).m100875b(new ayh(true, new x20() { // from class: l.eh70
                @Override // p153l.x20
                public final void call() {
                    this.f94008a.m64930G6(iM64986o6);
                }
            }));
            ayhVar.m100874a();
            m64969g6(bnl0.m105529O0(this.f42123S0[iM64986o6]) ? this.f42123S0[iM64986o6] : this.f42121R0[iM64986o6], z, this.f42123S0[iM64986o6].getVisibility() == 0, m64990q6(), null);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m64898e5(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            FeedModule.f39706g.m145955c();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m64904k5(Throwable th) {
    }

    /* JADX INFO: renamed from: l7 */
    private void m64906l7() {
        Fragment fragmentM65015l = this.f42113N0.m65015l(this.f42125T0);
        if (fragmentM65015l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65015l).m65561a5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m7 */
    public void m64908m7() {
        Fragment fragmentM65015l = this.f42113N0.m65015l(this.f42125T0);
        if (fragmentM65015l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65015l).m65562b5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v7 */
    public void m64918v7() {
        Fragment fragmentM65015l = this.f42113N0.m65015l(this.f42125T0);
        if (fragmentM65015l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65015l).m65570m5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w6 */
    public void m64920w6() {
        Fragment fragmentM65015l = this.f42113N0.m65015l(this.f42125T0);
        if (fragmentM65015l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65015l).m65556V4();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public final void m64924B6() {
        this.f42100H = new VFrame(getContext());
        this.f42104J = new VFrame(getContext());
        VText vText = new VText(getContext());
        this.f42102I = vText;
        this.f42100H.addView(vText, new FrameLayout.LayoutParams(-2, qa00.m175859d(34.0f)));
        this.f42102I.setText(R$string.f39747G1);
        this.f42102I.setTextSize(14.0f);
        this.f42102I.setTextColor(-1);
        this.f42102I.setTypeface(lyh0.m156283c(3), 1);
        this.f42102I.setPadding(qa00.m175859d(12.0f), 0, qa00.m175859d(12.0f), 0);
        this.f42102I.setBackgroundResource(lbc0.f131124q5);
        this.f42102I.setGravity(16);
        VImage vImage = new VImage(getContext());
        this.f42106K = vImage;
        this.f42104J.addView(vImage, new FrameLayout.LayoutParams(qa00.m175859d(32.0f), qa00.m175859d(32.0f)));
        this.f42106K.setImageResource(lbc0.f131130r3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(9.5f), qa00.m175859d(9.5f));
        layoutParams.gravity = 53;
        FeedRedDotView feedRedDotView = new FeedRedDotView(getContext());
        this.f42108L = feedRedDotView;
        this.f42104J.addView(feedRedDotView, layoutParams);
        this.f42108L.setOvalColor(getResources().getColor(k9c0.f124523o));
        this.f42108L.setWidth(qa00.m175859d(9.5f));
        this.f42108L.setRingWidth(qa00.m175859d(1.5f));
        this.f42108L.setRingColor(getResources().getColor(k9c0.f124526p0));
        this.f42108L.setRedPointType(2);
        this.f42108L.m66240o();
        bnl0.m105524M(this.f42108L, false);
        bnl0.m105524M(this.f42093D, true);
    }

    /* JADX INFO: renamed from: C6 */
    public final boolean m64925C6() {
        return ksg.m151211j0(1);
    }

    /* JADX INFO: renamed from: D6 */
    public final boolean m64926D6() {
        return !TextUtils.isEmpty(this.f42097F0);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC11578b
    /* JADX INFO: renamed from: E0 */
    public void mo64927E0() {
        l51.m152890J(this.f42138a1);
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m64928E6(int i) {
        String str;
        m64991q7(m64983m6(), i);
        this.f42121R0[m64983m6()].setVisibility(0);
        this.f42123S0[m64983m6()].setVisibility(8);
        TextView textView = this.f42121R0[m64983m6()];
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        textView.setText(str);
        m64989p7(this.f42121R0[m64983m6()]);
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ void m64931H6(int i) {
        m64951X5(m64988p6(), i);
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m64932I6() {
        m64930G6(m64988p6());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: J4 */
    public l4g0 mo30636J4() {
        return NullChecker.m82486a(this.f42118Q) ? this.f42118Q : super.mo30636J4();
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ void m64933J6(Moment moment) {
        this.f42090A.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ Boolean m64934K6(C4470c c4470c) {
        return Boolean.valueOf(c4470c == C4470c.f16267i && m64995s7());
    }

    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ void m64935L6(C4470c c4470c) {
        if (NullChecker.m82486a(this.f42110M) && this.f42110M.isShowing()) {
            this.f42110M.dismiss();
        }
        if (NullChecker.m82486a(this.f42139b1) && this.f42139b1.isShowing()) {
            this.f42139b1.dismiss();
        }
        m64964e6();
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m64936M6(Act.C4450r c4450r) {
        ImageView imageView;
        if (NullChecker.m82486a(c4450r)) {
            FeedModule.f39701b.m61675I2();
            if (!cmg.m111197Y() || cmg.m111208f0() || (imageView = this.f42123S0[0]) == null || bnl0.m105529O0(imageView) || !ach.f69705g || !ach.m96850g().m96851f()) {
                return;
            }
            ach.f69705g = false;
            if (this.f42125T0 != 0) {
                ach.m96850g().m96856l(true);
            }
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final /* synthetic */ void m64937N6(Bundle bundle) {
        act().duringCreated((C22421c) Act.foreground(), false).distinctUntilChanged(new rcj() { // from class: l.bh70
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Act.C4450r) obj) != null || ((Act.C4450r) obj2) == null);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ch70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81770a.m64936M6((Act.C4450r) obj);
            }
        }));
        FeedModule.f39701b.m61673G2();
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: O0 */
    public void mo64938O0(String str, boolean z) {
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m64939O6(Boolean bool) {
        m64965e7();
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: P0 */
    public boolean mo64940P0() {
        Fragment fragmentM65015l = this.f42113N0.m65015l(this.f42125T0);
        if (this.f42127U0 || !(fragmentM65015l instanceof PhotoAlbumFeedFrag)) {
            return false;
        }
        return ((PhotoAlbumFeedFrag) fragmentM65015l).m65549P0();
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m64941P6(String str) {
        k3h.m148043I0(act(), str);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ Boolean m64942Q6(Act.C4450r c4450r, Act.C4450r c4450r2) {
        if (c4450r != null && c4450r2 == null) {
            this.f42130W = System.currentTimeMillis();
        }
        return Boolean.valueOf(c4450r != null || c4450r2 == null);
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ void m64943R6(Act.C4450r c4450r) {
        if (this.f42130W <= 0 || System.currentTimeMillis() - this.f42130W <= f42088f1) {
            return;
        }
        this.f42130W = 0L;
        this.f42132X.onNext(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m64944S6(Bundle bundle) {
        act().duringCreated((C22421c) Act.foreground(), false).distinctUntilChanged(new rcj() { // from class: l.zg70
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f204277a.m64942Q6((Act.C4450r) obj, (Act.C4450r) obj2);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ah70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71328a.m64943R6((Act.C4450r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m64945T6(Long l2) {
        m64980k7();
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m64946U6(String str) {
        if (this.f42125T0 == 0) {
            FeedModule.f39703d.f121341a0.put(str);
            return;
        }
        if (ach.f69705g || !ach.m96850g().m96851f()) {
            return;
        }
        ach.m96850g().m96857m();
        ach.f69705g = true;
        ach.m96850g().m96855k();
        this.f42135Y0 = true;
        this.f42133X0 = str;
        m64970g7();
    }

    /* JADX INFO: renamed from: V5 */
    public View m64947V5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return th70.m191234b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W5 */
    public void m64949W5() {
        th70.m191235c(this);
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m64950W6(C11441g c11441g) {
        m65003x6(c11441g);
        m64985n7(c11441g);
        m65006y7(c11441g.f42160c);
    }

    /* JADX INFO: renamed from: X5 */
    public final void m64951X5(int i, int i2) {
        String str;
        if (i == -1) {
            return;
        }
        m64991q7(i, i2);
        this.f42121R0[i].setVisibility(0);
        this.f42123S0[i].setVisibility(8);
        TextView textView = this.f42121R0[i];
        if (i2 > 99) {
            str = "99+";
        } else {
            str = i2 + "";
        }
        textView.setText(str);
        if (cmg.m111197Y()) {
            return;
        }
        m64989p7(this.f42121R0[m64983m6()]);
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m64952X6(View view) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return;
        }
        this.f42120R.mo149319a(act(), m64996t6(), null, this.f42122S);
        l94.m153309e().m153318j();
        m65001v6();
    }

    /* JADX INFO: renamed from: Y */
    public Frag m64953Y() {
        return (Frag) this.f42113N0.m65015l(this.f42090A.getCurrentItem());
    }

    /* JADX INFO: renamed from: Y5 */
    public final boolean m64954Y5(int i) {
        if (i < 10) {
            return false;
        }
        return pu20.f154139d.get().longValue() == 0 || !p6i.m170897f(pu20.f154139d.get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ boolean m64955Y6(View view) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return true;
        }
        l94.m153309e().m153318j();
        cn40.m111396k0(act(), jyb.m147507f0(new Media[0]), true, "camera");
        m65001v6();
        return true;
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m64956Z5(boolean z) {
        C11438d c11438d;
        if (z || (c11438d = this.f42113N0) == null) {
            FeedModule.m61406H().mo31720Pq(act(), false);
            return;
        }
        Fragment fragmentM65015l = c11438d.m65015l(this.f42125T0);
        if ((fragmentM65015l instanceof PhotoAlbumFeedFrag) && ((PhotoAlbumFeedFrag) fragmentM65015l).m65551Q4()) {
            FeedModule.m61406H().mo31782jg(act(), false);
        } else {
            FeedModule.m61406H().mo31720Pq(act(), false);
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m64957Z6(View view, String str, String str2, pf60[] pf60VarArr) {
        this.f42111M0.m133881h(view, new C11440f(str, str2, i4g0.m138504b(pf60VarArr)), 2);
    }

    /* JADX INFO: renamed from: a6 */
    public final boolean m64958a6() {
        return m64959b6();
    }

    /* JADX INFO: renamed from: b6 */
    public final boolean m64959b6() {
        this.f42101H0 = true;
        l51.m152890J(this.f42138a1);
        if (this.f42125T0 != m64988p6()) {
            return false;
        }
        m64971h6();
        return false;
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m64960b7(Intent intent) {
        act().startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: d6 */
    public final void m64962d6(final int i) {
        if (m64988p6() < 1) {
            return;
        }
        boolean z = this.f42121R0[m64988p6()].getVisibility() == 0;
        ayh ayhVar = new ayh(false, new x20() { // from class: l.wg70
            @Override // p153l.x20
            public final void call() {
                this.f188919a.m64931H6(i);
            }
        });
        ayhVar.m100875b(new ayh(true, new x20() { // from class: l.xg70
            @Override // p153l.x20
            public final void call() {
                this.f194158a.m64932I6();
            }
        }));
        ayhVar.m100874a();
        m64966f6(bnl0.m105529O0(this.f42121R0[m64988p6()]) ? this.f42121R0[m64988p6()] : this.f42123S0[m64988p6()], z, this.f42121R0[m64988p6()].getVisibility() == 0, 11);
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m64963d7(String str) {
        if (this.f42125T0 == 0 && cmg.m111208f0() && NullChecker.m82486a(this.f42123S0) && NullChecker.m82486a(this.f42123S0[0]) && bnl0.m105529O0(this.f42123S0[0])) {
            kbh.f124949i = true;
            kbh.f124947g = false;
            kbh.f124948h = false;
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m64964e6() {
        if (NullChecker.m82486a(this.f42107K0)) {
            C4499d.m21895l().m21899k(this.f42107K0);
            this.f42107K0 = null;
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m65007z6();
    }

    /* JADX INFO: renamed from: f6 */
    public final void m64966f6(View view, boolean z, boolean z2, int i) {
        if (z ^ z2) {
            if (z) {
                byh.m106997d().m107015s(Integer.valueOf(i));
            } else {
                byh.m106997d().m107013q(false, view, i, new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ C11441g m64967f7(Counter counter, Boolean bool, Double d, Boolean bool2) {
        return new C11441g(cmg.m111208f0() ? counter.moments.unreadLikeFeeds : 0, cmg.m111197Y() ? 0 : counter.moments.unreadFeeds, counter.activities.unread, bool.booleanValue(), d.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, bool2.booleanValue());
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: g2 */
    public void mo64968g2() {
        if (cmg.m111197Y() && bnl0.m105529O0(this.f42123S0[0]) && !cmg.m111208f0()) {
            this.f42135Y0 = false;
            bnl0.m105524M(this.f42123S0[0], false);
            FeedModule.f39703d.f121341a0.put(this.f42133X0);
            if (NullChecker.m82486a(this.f42131W0)) {
                m64985n7(this.f42131W0);
                return;
            }
            return;
        }
        if (this.f42144p0 || this.f42095E0 <= 0 || !NullChecker.m82486a(this.f42131W0)) {
            return;
        }
        this.f42144p0 = true;
        this.f42095E0 = 0;
        m64985n7(this.f42131W0);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        byh.m106997d().m107019w(new byh.InterfaceC16133a() { // from class: l.ug70
            @Override // p153l.byh.InterfaceC16133a
            /* JADX INFO: renamed from: a */
            public final void mo107020a(View view, String str, String str2, pf60[] pf60VarArr) {
                this.f178873a.m64957Z6(view, str, str2, pf60VarArr);
            }
        });
        m64924B6();
        this.f42115O0.add(0, cmg.m111197Y() ? "喜欢" : getString(R$string.f39920h5));
        this.f42115O0.add(1, getString(R$string.f39927i5));
        ArrayList arrayList = new ArrayList();
        PhotoAlbumFeedFrag photoAlbumFeedFragM65565f5 = PhotoAlbumFeedFrag.m65543M4(FeedModule.m61405F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12).m65565f5(this.f42090A);
        PhotoAlbumFeedFrag photoAlbumFeedFragM65565f6 = PhotoAlbumFeedFrag.m65543M4(FeedModule.m61405F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0).m65565f5(this.f42090A);
        PhotoAlbumFeedFrag photoAlbumFeedFragM65543M4 = PhotoAlbumFeedFrag.m65543M4(FeedModule.m61405F().userId(), "from_nearby_falls_feed", -1, User.ID_TEAM_ACCOUNT, 1);
        if (cmg.m111197Y()) {
            arrayList.add(photoAlbumFeedFragM65565f5);
        } else {
            arrayList.add(photoAlbumFeedFragM65565f6);
        }
        arrayList.add(photoAlbumFeedFragM65543M4);
        this.f42113N0.m65019p(arrayList);
        this.f42145z.setTag("photo_album_root");
        this.f42090A.setOnPageChangeListener(this.f42113N0);
        this.f42090A.setAdapter(this.f42113N0);
        this.f42092C.setBackgroundColor(act().getResources().getColor(k9c0.f124522n0));
        this.f42092C.setupViewPager(this.f42090A);
        this.f42098G = this.f42092C.getTabLayout();
        this.f42092C.setRightIconViews(this.f42104J, this.f42100H);
        int i = 0;
        while (i < this.f42098G.getTabCount()) {
            View viewM65016m = this.f42113N0.m65016m(i);
            VNavigationTabLayout.C22738f c22738fM224873w = this.f42098G.m224873w(i);
            Objects.requireNonNull(c22738fM224873w);
            c22738fM224873w.m224941n(viewM65016m);
            VNavigationTabLayout.C22738f c22738fM224873w2 = this.f42098G.m224873w(i);
            Objects.requireNonNull(c22738fM224873w2);
            VNavigationTabLayout.TabView tabView = c22738fM224873w2.f210794i;
            int iM175859d = i == 0 ? qa00.m175859d(4.0f) : 0;
            VNavigationTabLayout.C22738f c22738fM224873w3 = this.f42098G.m224873w(i);
            Objects.requireNonNull(c22738fM224873w3);
            int paddingTop = c22738fM224873w3.f210794i.getPaddingTop();
            VNavigationTabLayout.C22738f c22738fM224873w4 = this.f42098G.m224873w(i);
            Objects.requireNonNull(c22738fM224873w4);
            tabView.setPadding(iM175859d, paddingTop, 0, c22738fM224873w4.f210794i.getPaddingBottom());
            i++;
        }
        this.f42098G.setOnTabSelectedListener((VNavigationTabLayout.InterfaceC22736d) new C11439e());
        this.f42134Y = true;
        m65005y6(m64984n6(), photoAlbumFeedFragM65543M4);
        m64857A6(this.f42102I);
        this.f42105J0 = new yvg(act(), m64977j6());
        ihh.m139977h().m139985k(this);
        wsg.m207772g().m207778j(this);
        bnl0.m105509E0(this.f42093D, new View.OnClickListener() { // from class: l.vg70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184004a.m64893a7(view);
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final void m64969g6(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                byh.m106997d().m107015s(Integer.valueOf(i));
            } else {
                byh.m106997d().m107012p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: renamed from: g7 */
    public final void m64970g7() {
        this.f42123S0[0].setVisibility(0);
        tfj0.m190942e("e_red_dot_explore", byh.m106997d().m107002f(m64990q6()), new pf60("red_dot_relation_child", "red_dot_like"));
        if (NullChecker.m82486a(this.f42131W0)) {
            m64985n7(this.f42131W0);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m64971h6() {
        this.f42101H0 = false;
        if (System.currentTimeMillis() - pu20.f154140e.get().longValue() < 172800000 || rkh.m181860d()) {
            return false;
        }
        l51.m152889I(this, this.f42138a1, 100L);
        return true;
    }

    /* JADX INFO: renamed from: h7, reason: merged with bridge method [inline-methods] */
    public final void m64930G6(int i) {
        this.f42121R0[i].setVisibility(8);
        this.f42123S0[i].setVisibility(8);
    }

    /* JADX INFO: renamed from: i6 */
    public final void m64973i6(View view, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        if ((z2 ^ z) || z4) {
            if (!z || z4) {
                this.f42143k0 = byh.m106997d().m107007k(view, i, z3, z4, m64992r6(), true);
            } else {
                byh.m106997d().m107015s(1);
            }
        }
    }

    /* JADX INFO: renamed from: i7, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m64965e7() {
        Fragment fragmentM65015l = this.f42113N0.m65015l(this.f42125T0);
        if (this.f42127U0) {
            return;
        }
        if (fragmentM65015l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65015l).m65559Y4();
        } else if (fragmentM65015l instanceof PhotoAlbumFallsFeedFrag) {
            ((PhotoAlbumFallsFeedFrag) fragmentM65015l).m64795m5();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f42113N0 = new C11438d(getChildFragmentManager());
        return m64947V5(layoutInflater, viewGroup);
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: j0 */
    public void mo64975j0() {
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: j1 */
    public void mo64976j1(int i) {
        int iM64981l6 = m64981l6(i);
        if (iM64981l6 >= 0) {
            if (12 == i) {
                this.f42142e1 = true;
            }
            this.f42090A.setCurrentItem(iM64981l6);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public String m64977j6() {
        if (this.f42125T0 == 0) {
            return cmg.m111197Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: j7, reason: merged with bridge method [inline-methods] */
    public final void m64929F6(int i) {
        this.f42121R0[i].setVisibility(8);
        this.f42123S0[i].setVisibility(0);
        if (cmg.m111208f0() && i == 0) {
            kbh.f124948h = true;
            FeedModule.f39703d.f121298G1 = "recommend";
        }
    }

    /* JADX INFO: renamed from: k6 */
    public String m64979k6() {
        l4g0 l4g0Var = this.f42118Q;
        if (l4g0Var == this.f42114O) {
            return "p_follow";
        }
        if (l4g0Var == this.f42116P) {
            return OMSDialogPositon.p_nearby;
        }
        return l4g0Var == this.f42112N ? "p_like" : "";
    }

    /* JADX INFO: renamed from: k7 */
    public final void m64980k7() {
        if (jyb.m147479J(this.f42103I0)) {
            return;
        }
        int size = this.f42103I0.size();
        for (int i = 0; i < size; i++) {
            PutongFrag putongFrag = this.f42103I0.get(i);
            boolean z = (putongFrag.getArguments() == null ? -2 : putongFrag.getArguments().getInt("page_type", -2)) != 0;
            boolean z2 = 12 != (putongFrag.getArguments() != null ? putongFrag.getArguments().getInt("page_type", -2) : -2);
            if ((putongFrag instanceof PhotoAlbumFeedFrag) && (z || z2)) {
                ((PhotoAlbumFeedFrag) putongFrag).m65559Y4();
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public int m64981l6(int i) {
        if (jyb.m147479J(this.f42103I0)) {
            return -1;
        }
        int size = this.f42103I0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == (this.f42103I0.get(i2).getArguments() != null ? this.f42103I0.get(i2).getArguments().getInt("page_type", -2) : -2)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC11577a
    /* JADX INFO: renamed from: m */
    public void mo64982m(String str) {
        Frag fragM64953Y = m64953Y();
        if (fragM64953Y instanceof PhotoAlbumFallsFeedFrag) {
            ((PhotoAlbumFallsFeedFrag) fragM64953Y).m64797o5(str);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final int m64983m6() {
        List<String> list = this.f42115O0;
        if (list != null) {
            return list.indexOf(getString(R$string.f39920h5));
        }
        return 0;
    }

    /* JADX INFO: renamed from: n6 */
    public final int m64984n6() {
        return m64988p6();
    }

    /* JADX INFO: renamed from: n7 */
    public final void m64985n7(C11441g c11441g) {
        if (c11441g == null) {
            return;
        }
        this.f42131W0 = c11441g;
        m64896c6(m64998u6(c11441g));
        m64962d6(c11441g.f42160c);
        int iM64988p6 = m64988p6();
        if (iM64988p6 >= 0) {
            ImageView[] imageViewArr = this.f42123S0;
            if (iM64988p6 < imageViewArr.length) {
                bnl0.m105524M(imageViewArr[this.f42115O0.indexOf(getString(R$string.f39927i5))], c11441g.f42161d);
            }
        }
        if (c11441g.f42161d) {
            FeedModule.f39703d.m145805ud(Calendar.getInstance().getTimeInMillis());
        }
        boolean z = true;
        boolean z2 = c11441g.f42160c > 0 && !m64925C6();
        if (z2) {
            orb0.m168873B(act(), c11441g.f42160c);
        } else {
            orb0.m168873B(act(), -1);
        }
        if (!cmg.m111208f0()) {
            boolean z3 = !z2 && ((!cmg.m111197Y() && m64998u6(c11441g) > 0) || c11441g.f42161d || (!c11441g.f42163f && c11441g.f42162e)) && !m64925C6();
            boolean z4 = this.f42136Z;
            if (z2) {
                m64973i6(null, z4, false, m64998u6(c11441g), c11441g.f42162e, true);
                orb0.m168872A(act(), false);
            } else {
                m64973i6(null, z4, z3 || this.f42135Y0, m64998u6(c11441g), c11441g.f42162e, false);
                orb0.m168872A(act(), z3 || this.f42135Y0);
            }
            if (!z3 && !this.f42135Y0) {
                z = false;
            }
            this.f42136Z = z;
            return;
        }
        boolean z5 = !z2 && (m64998u6(c11441g) > 0 || c11441g.f42161d || (!c11441g.f42163f && c11441g.f42162e)) && !m64925C6();
        boolean z6 = this.f42136Z;
        if (!z6 || !c11441g.f42162e) {
            m64973i6(null, z6, z5, m64998u6(c11441g), c11441g.f42162e, z2);
            orb0.m168872A(act(), z5);
            this.f42136Z = z5;
        } else {
            byh.m106997d().m107010n(4);
            if (!z5 && !c11441g.f42162e) {
                z = false;
            }
            this.f42136Z = z;
        }
    }

    /* JADX INFO: renamed from: o6 */
    public final int m64986o6() {
        List<String> list = this.f42115O0;
        if (list != null) {
            return list.indexOf("喜欢");
        }
        return 0;
    }

    /* JADX INFO: renamed from: o7 */
    public final void m64987o7(View view) {
        sbh sbhVar = this.f42139b1;
        if (sbhVar != null && sbhVar.isShowing()) {
            this.f42139b1.dismiss();
            return;
        }
        sbh sbhVar2 = new sbh(this, act(), new x20() { // from class: l.ih70
            @Override // p153l.x20
            public final void call() {
                this.f114876a.m64961c7();
            }
        });
        this.f42139b1 = sbhVar2;
        VImage[] vImageArr = this.f42119Q0;
        if (vImageArr != null && vImageArr.length > 0) {
            sbhVar2.setOnDismissListener(new C11437c());
        }
        kl80.m150358c(this.f42139b1, view, 0, qa00.f156318e, 80);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f42116P.m152774i();
        this.f42114O.m152774i();
        if (cmg.m111197Y()) {
            this.f42112N.m152774i();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        byh.m106997d().m107016t();
        this.f42116P.m152775j();
        this.f42114O.m152775j();
        if (cmg.m111197Y()) {
            this.f42112N.m152775j();
        }
        if (NullChecker.m82486a(this.f42113N0)) {
            this.f42113N0.m65018o();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        f42089g1 = z;
        jyh.m147543a().f123145a.onNext(Boolean.valueOf(!z));
        if (cmg.m111186N() && NullChecker.m82486a(this.f42113N0)) {
            for (int i = 0; i < this.f42113N0.f42149a.size(); i++) {
                Fragment fragment = (Fragment) this.f42113N0.f42149a.get(i);
                if (fragment instanceof PhotoAlbumFeedFrag) {
                    ((PhotoAlbumFeedFrag) fragment).m65564e5(z);
                }
            }
        }
        if (z) {
            if (NullChecker.m82487b(act())) {
                if (NullChecker.m82486a(this.f42129V0) && this.f42129V0.isShowing()) {
                    this.f42129V0.dismiss();
                }
                if (NullChecker.m82486a(this.f42110M) && this.f42110M.isShowing()) {
                    this.f42110M.dismiss();
                }
                if (NullChecker.m82486a(this.f42139b1) && this.f42139b1.isShowing()) {
                    this.f42139b1.dismiss();
                }
                PhotoAlbumPictureView.m65042u(act().getWindow().getDecorView(), false);
            }
            l51.m152890J(this.f42138a1);
            tog.m192029o();
            m64908m7();
            m64918v7();
            m64920w6();
            m64964e6();
        } else {
            m64997t7(NullChecker.m82486a(this.f42131W0) ? this.f42131W0.f42160c : 0);
            if (this.f42143k0 == 10) {
                byh.m106997d().m107009m(this.f42143k0, m64992r6());
            } else {
                byh.m106997d().m107008l(this.f42143k0);
            }
            jyh.m147543a().f123146b = true;
            if (this.f42125T0 == 1) {
                FeedModule.f39703d.f121338Y0.onNext(Boolean.FALSE);
            }
            m64958a6();
            if (j4h.m143420d()) {
                m64906l7();
            }
            m65002w7();
        }
        m64956Z5(z);
        this.f42124T.onNext(Boolean.valueOf(z));
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if ("moment".equals(this.f42126U)) {
            this.f42105J0.mo174886p();
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final int m64988p6() {
        List<String> list = this.f42115O0;
        if (list != null) {
            return list.indexOf(getString(R$string.f39927i5));
        }
        return 1;
    }

    /* JADX INFO: renamed from: p7 */
    public final void m64989p7(TextView textView) {
        if (NullChecker.m82487b(textView)) {
            textView.setTextColor(Color.parseColor("#ff3228"));
            textView.setBackgroundResource(lbc0.f130956V0);
            textView.setTextSize(10.0f);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return m64977j6();
    }

    /* JADX INFO: renamed from: q6 */
    public final int m64990q6() {
        return cmg.m111197Y() ? 15 : 3;
    }

    /* JADX INFO: renamed from: q7 */
    public void m64991q7(int i, int i2) {
        VText vText = (VText) this.f42121R0[i];
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) vText.getLayoutParams();
        if (i2 < 10) {
            ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(10.0f);
        } else if (i2 <= 99) {
            ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(6.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(0.0f);
        }
        vText.setLayoutParams(c0221a);
    }

    /* JADX INFO: renamed from: r6 */
    public final String m64992r6() {
        if (NullChecker.m82487b(this.f42098G) && this.f42098G.getSelectedTabPosition() == 0) {
            return cmg.m111197Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: r7 */
    public void m64993r7() {
        Fragment fragmentM65015l = this.f42113N0.m65015l(this.f42125T0);
        if (this.f42127U0 || !(fragmentM65015l instanceof PhotoAlbumFeedFrag)) {
            return;
        }
        ((PhotoAlbumFeedFrag) fragmentM65015l).m65568i5(new y20() { // from class: l.dh70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88424a.m64963d7((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public final String m64994s6(int i) {
        if (NullChecker.m82487b(this.f42098G) && i == 0) {
            return cmg.m111197Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: s7 */
    public final boolean m64995s7() {
        long jLongValue = FeedModule.f39703d.m145837z7().longValue();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 4, 0, 0);
        return i >= 4 && jLongValue < calendar2.getTimeInMillis();
    }

    @NotNull
    /* JADX INFO: renamed from: t6 */
    public final String m64996t6() {
        CharSequence pageTitle = this.f42113N0.getPageTitle(this.f42090A.getCurrentItem());
        if ("喜欢".equals(pageTitle)) {
            return "like";
        }
        if (getString(R$string.f39920h5).equals(pageTitle)) {
            return "follow";
        }
        return getString(R$string.f39927i5).equals(pageTitle) ? "nearby" : "other";
    }

    /* JADX INFO: renamed from: t7 */
    public final void m64997t7(int i) {
        if (f42089g1 || this.f42109L0) {
            return;
        }
        String str = "这里有" + ((Object) this.f42096F.getText()) + "条消息在等你回复～";
        if (m64954Y5(i)) {
            pu20.f154139d.put(Long.valueOf(pzi0.m174454o()));
            this.f42107K0 = C4499d.m21895l().m21907t(new C4496a(act()).m21848D(str).m21869k(act().getResources().getColor(k9c0.f124521n)).m21854J(13.0f).m21849E(true).m21860b(3000L).m21881x(-qa00.f156317d).m21874q(C4496a.f16402Q | C4496a.f16401P).m21872o(C4496a.f16401P, qa00.m175859d(6.0f)), this.f42093D);
            this.f42109L0 = true;
        }
    }

    /* JADX INFO: renamed from: u6 */
    public final int m64998u6(C11441g c11441g) {
        int i;
        if (cmg.m111208f0()) {
            return c11441g.f42159b;
        }
        int i2 = c11441g.f42158a;
        return (i2 != 0 || (i = this.f42095E0) <= 0) ? i2 : i;
    }

    /* JADX INFO: renamed from: u7 */
    public final void m64999u7() {
        if (isHidden() || rkh.m181858b()) {
            return;
        }
        pu20.f154140e.put(Long.valueOf(System.currentTimeMillis()));
        if (!j4h.m143418b() || pk50.m172568j().m172574f().m181649M("p_alert_positioning_authority_explore_popup", true)) {
            if (j4h.m143418b()) {
                pk50.m172568j().m172574f().m181664b0("p_alert_positioning_authority_explore_popup", 0, true);
            }
            FeedModule.m61406H().showLocationPermissionCallbackDlg(act(), new x20() { // from class: l.hh70
                @Override // p153l.x20
                public final void call() {
                    this.f109485a.m64965e7();
                }
            }, null, false, true, "p_alert_positioning_authority_explore_popup");
        }
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: v3 */
    public void mo65000v3(String str) {
    }

    /* JADX INFO: renamed from: v6 */
    public final void m65001v6() {
        if (m64926D6()) {
            C4499d.m21895l().m21899k(this.f42097F0);
            this.f42097F0 = null;
        }
    }

    /* JADX INFO: renamed from: w7 */
    public final void m65002w7() {
        tfj0.m190941d("e_moment_unread_notes_history", m64977j6(), new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: x6 */
    public final void m65003x6(C11441g c11441g) {
        if (cmg.m111208f0()) {
            int i = c11441g.f42159b;
            if (i <= 0 || this.f42144p0) {
                return;
            }
            this.f42095E0 = i;
            return;
        }
        int i2 = c11441g.f42158a;
        if (i2 <= 0 || this.f42144p0) {
            return;
        }
        this.f42095E0 = i2;
    }

    /* JADX INFO: renamed from: x7, reason: merged with bridge method [inline-methods] */
    public final C22421c<C11441g> m64948V6() {
        FeedModule.f39703d.m145651Yc("");
        return psd0.m173627t(mrb0.m159656j(), FeedModule.f39703d.f121338Y0.asObservable(), C22421c.just(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)), FeedModule.m61406H().isHideRedByNewUser(), new tcj() { // from class: l.yg70
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f199738a.m64967f7((Counter) obj, (Boolean) obj2, (Double) obj3, (Boolean) obj4);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        m64949W5();
    }

    /* JADX INFO: renamed from: y6 */
    public final void m65005y6(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f42090A.setCurrentItem(i);
        PutongFrag putongFrag = this.f42103I0.get(i);
        boolean z = (getString(R$string.f39920h5).equals(this.f42113N0.getPageTitle(i)) && "喜欢".equals(this.f42113N0.getPageTitle(i))) ? false : true;
        if ((putongFrag instanceof PhotoAlbumFeedFrag) && z) {
            ((PhotoAlbumFeedFrag) putongFrag).m65555U4().m134768j0();
        } else if (photoAlbumFeedFrag != null) {
            photoAlbumFeedFrag.m65555U4().m134768j0();
        }
    }

    /* JADX INFO: renamed from: y7 */
    public final void m65006y7(int i) {
        ImageView imageView = this.f42094E;
        if (i > 0) {
            imageView.setImageResource(lbc0.f130914P0);
            bnl0.m105524M(this.f42096F, true);
            VText vText = this.f42096F;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
        } else {
            imageView.setImageResource(lbc0.f130907O0);
            bnl0.m105524M(this.f42096F, false);
        }
        m64997t7(i);
    }

    /* JADX INFO: renamed from: z6 */
    public final void m65007z6() {
        if (cmg.m111197Y() && !cmg.m111208f0()) {
            duringCreated(FeedModule.f39703d.f121287B0).subscribe(psd0.m173596G(new y20() { // from class: l.jh70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120824a.m64946U6((String) obj);
                }
            }));
        }
        duringCreated(new pcj() { // from class: l.jg70
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f120683a.m64948V6();
            }
        }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.kg70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126584a.m64950W6((PhotoAlbumFrag.C11441g) obj);
            }
        }, new y20() { // from class: l.lg70
            @Override // p153l.y20
            public final void call(Object obj) {
                PhotoAlbumFrag.m64871N4((Throwable) obj);
            }
        }));
        duringCreated(cn40.m111354F()).subscribe(psd0.m173596G(new y20() { // from class: l.mg70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136699a.m64933J6((Moment) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.ng70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141797a.m64934K6((C4470c) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.og70
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedModule.f39703d.f121338Y0.onNext(Boolean.TRUE);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.pg70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.qg70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157384a.m64935L6((C4470c) obj);
            }
        }));
        if (kl40.m150348f() || (cmg.m111197Y() && !cmg.m111208f0())) {
            creates(new y20() { // from class: l.rg70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162982a.m64937N6((Bundle) obj);
                }
            });
        }
        duringCreated(orb0.m168899p()).subscribe(psd0.m173596G(new y20() { // from class: l.kh70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126699a.m64939O6((Boolean) obj);
            }
        }));
        duringCreated(C11408a.m63899c1()).subscribe(psd0.m173596G(new y20() { // from class: l.lh70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132077a.m64941P6((String) obj);
            }
        }));
        if (this.f42128V) {
            creates(new y20() { // from class: l.mh70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f136831a.m64944S6((Bundle) obj);
                }
            });
            duringCreated(this.f42132X).subscribe(psd0.m173597H(new y20() { // from class: l.nh70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141945a.m64945T6((Long) obj);
                }
            }, new y20() { // from class: l.oh70
                @Override // p153l.y20
                public final void call(Object obj) {
                    PhotoAlbumFrag.m64904k5((Throwable) obj);
                }
            }));
        }
        act().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ph70
            @Override // p153l.y20
            public final void call(Object obj) {
                PhotoAlbumFrag.m64898e5((C4470c) obj);
            }
        }));
    }
}
