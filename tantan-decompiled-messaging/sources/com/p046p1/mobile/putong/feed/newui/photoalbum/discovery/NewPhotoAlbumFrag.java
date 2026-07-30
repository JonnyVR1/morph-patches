package com.p046p1.mobile.putong.feed.newui.photoalbum.discovery;

import android.animation.Animator;
import android.content.Intent;
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
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.meituan.robust.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterActivities;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.newui.main.base.TabName;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p147v.navigationbar.VNavigationTabLayout;
import p149l.a5i;
import p149l.b0i;
import p149l.b5c0;
import p149l.cjh;
import p149l.cwf0;
import p149l.d30;
import p149l.du2;
import p149l.dyl;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.ed80;
import p149l.eng;
import p149l.eqh0;
import p149l.f3c0;
import p149l.flg;
import p149l.fm20;
import p149l.hrg;
import p149l.hx60;
import p149l.i140;
import p149l.ic50;
import p149l.ijb0;
import p149l.j2e;
import p149l.j60;
import p149l.j760;
import p149l.je80;
import p149l.jlg;
import p149l.jug;
import p149l.kjb0;
import p149l.l80;
import p149l.lsi0;
import p149l.lwh;
import p149l.m3i;
import p149l.m84;
import p149l.mkd0;
import p149l.mqi0;
import p149l.mwh;
import p149l.n7c;
import p149l.nkg;
import p149l.o6c0;
import p149l.oe40;
import p149l.p6j0;
import p149l.pv60;
import p149l.roj0;
import p149l.t100;
import p149l.tfh;
import p149l.tpd0;
import p149l.u2h;
import p149l.v1h;
import p149l.v9j;
import p149l.vch;
import p149l.vqg;
import p149l.vwb;
import p149l.w980;
import p149l.w9j;
import p149l.wc40;
import p149l.wch;
import p149l.x9j;
import p149l.xck0;
import p149l.xdl0;
import p149l.xxg;
import p149l.z9j;
import p149l.zpd0;
import p149l.zvf0;
import p149l.zzl;

/* JADX INFO: loaded from: classes12.dex */
public class NewPhotoAlbumFrag extends PutongFrag implements FeedService.InterfaceC11414a, FeedService.InterfaceC11415b, zzl {

    /* JADX INFO: renamed from: l1 */
    public static long f41536l1;

    /* JADX INFO: renamed from: m1 */
    public static boolean f41537m1;

    /* JADX INFO: renamed from: n1 */
    public static zpd0 f41538n1;

    /* JADX INFO: renamed from: o1 */
    public static tpd0 f41539o1;

    /* JADX INFO: renamed from: p1 */
    public static C22392a<Boolean> f41540p1;

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f41541A;

    /* JADX INFO: renamed from: B */
    public VFrame f41542B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f41543C;

    /* JADX INFO: renamed from: D */
    public VFrame f41544D;

    /* JADX INFO: renamed from: E */
    public ImageView f41545E;

    /* JADX INFO: renamed from: E0 */
    public String f41546E0;

    /* JADX INFO: renamed from: F */
    public VText f41547F;

    /* JADX INFO: renamed from: G */
    public VNavigationTabLayout f41549G;

    /* JADX INFO: renamed from: H */
    public VFrame f41551H;

    /* JADX INFO: renamed from: I */
    public VText f41553I;

    /* JADX INFO: renamed from: J */
    public VFrame f41555J;

    /* JADX INFO: renamed from: J0 */
    public boolean f41556J0;

    /* JADX INFO: renamed from: K */
    public VImage f41557K;

    /* JADX INFO: renamed from: K0 */
    public int f41558K0;

    /* JADX INFO: renamed from: L */
    public FeedRedDotView f41559L;

    /* JADX INFO: renamed from: L0 */
    public String f41560L0;

    /* JADX INFO: renamed from: M */
    public PopupWindow f41561M;

    /* JADX INFO: renamed from: O0 */
    public List<PutongFrag> f41566O0;

    /* JADX INFO: renamed from: P0 */
    public b0i f41568P0;

    /* JADX INFO: renamed from: Q0 */
    public String f41570Q0;

    /* JADX INFO: renamed from: R */
    public cwf0 f41571R;

    /* JADX INFO: renamed from: R0 */
    public String f41572R0;

    /* JADX INFO: renamed from: S */
    public cwf0 f41573S;

    /* JADX INFO: renamed from: S0 */
    public FriendsFeedContainerFrag f41574S0;

    /* JADX INFO: renamed from: T */
    public cwf0 f41575T;

    /* JADX INFO: renamed from: T0 */
    public FriendsFeedViewPagerFrag f41576T0;

    /* JADX INFO: renamed from: X */
    public String f41583X;

    /* JADX INFO: renamed from: Y */
    public int f41585Y;

    /* JADX INFO: renamed from: c1 */
    public Dialog f41591c1;

    /* JADX INFO: renamed from: d1 */
    @Nullable
    public C11291e f41592d1;

    /* JADX INFO: renamed from: g1 */
    public Runnable f41595g1;

    /* JADX INFO: renamed from: h1 */
    public xxg f41596h1;

    /* JADX INFO: renamed from: i1 */
    public String f41597i1;

    /* JADX INFO: renamed from: j1 */
    public String f41598j1;

    /* JADX INFO: renamed from: k0 */
    public long f41599k0;

    /* JADX INFO: renamed from: k1 */
    public long f41600k1;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f41602z;

    /* JADX INFO: renamed from: N */
    public cwf0 f41563N = new cwf0("p_discover_dating", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: O */
    public cwf0 f41565O = new cwf0("p_discover_discussion", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: P */
    public cwf0 f41567P = new cwf0("p_follow", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: Q */
    public cwf0 f41569Q = new cwf0("p_like", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: U */
    public vch f41577U = new wch();

    /* JADX INFO: renamed from: V */
    public e30<Intent> f41579V = xck0.m208120a(400, new e30() { // from class: l.nz30
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f141185a.m64177D7((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: W */
    public C22392a<Boolean> f41581W = C22392a.m221512b();

    /* JADX INFO: renamed from: Z */
    public boolean f41587Z = true;

    /* JADX INFO: renamed from: p0 */
    public C22393b<Long> f41601p0 = C22393b.m221521b();

    /* JADX INFO: renamed from: F0 */
    public ArrayList<j60> f41548F0 = new ArrayList<>();

    /* JADX INFO: renamed from: G0 */
    public boolean f41550G0 = !fm20.m122139v();

    /* JADX INFO: renamed from: H0 */
    public boolean f41552H0 = false;

    /* JADX INFO: renamed from: I0 */
    public int f41554I0 = 1;

    /* JADX INFO: renamed from: M0 */
    public boolean f41562M0 = false;

    /* JADX INFO: renamed from: N0 */
    public boolean f41564N0 = false;

    /* JADX INFO: renamed from: U0 */
    public l80<C11290d> f41578U0 = new C11287a();

    /* JADX INFO: renamed from: V0 */
    public C11288b f41580V0 = null;

    /* JADX INFO: renamed from: W0 */
    public List<String> f41582W0 = new ArrayList();

    /* JADX INFO: renamed from: X0 */
    public TextView[] f41584X0 = new TextView[4];

    /* JADX INFO: renamed from: Y0 */
    public VImage[] f41586Y0 = new VImage[1];

    /* JADX INFO: renamed from: Z0 */
    public TextView[] f41588Z0 = new TextView[4];

    /* JADX INFO: renamed from: a1 */
    public ImageView[] f41589a1 = new ImageView[4];

    /* JADX INFO: renamed from: b1 */
    public int f41590b1 = 0;

    /* JADX INFO: renamed from: e1 */
    public pv60 f41593e1 = new pv60();

    /* JADX INFO: renamed from: f1 */
    public boolean f41594f1 = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$a */
    public class C11287a extends l80<C11290d> {
        public C11287a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(C11290d c11290d, int i) {
            if (i == 1) {
                zvf0.m220402x("e_tantan_topic", NewPhotoAlbumFrag.this.m64191L6());
            } else if (NullChecker.m81303a(c11290d.f41611c)) {
                zvf0.m220404z(c11290d.f41609a, c11290d.f41610b, c11290d.f41611c);
            } else {
                zvf0.m220402x(c11290d.f41609a, c11290d.f41610b);
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(C11290d c11290d, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$b */
    public class C11288b extends FragmentPagerAdapter implements ViewPager.InterfaceC0716j, dyl {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f41604a;

        /* JADX INFO: renamed from: b */
        public Method f41605b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f41606c;

        public C11288b(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f41604a = new ArrayList();
            this.f41605b = null;
            this.f41606c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f41605b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.m81296c(e);
                this.f41605b = null;
            } catch (SecurityException e2) {
                CrashHelper.m81296c(e2);
                this.f41605b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ void m64346p(int i, TextView textView, VImage vImage, View view) {
            if (NewPhotoAlbumFrag.this.f41590b1 == i && (TextUtils.equals(fm20.m122134q(), textView.getText().toString()) || TextUtils.equals(fm20.m122125h(), textView.getText().toString()))) {
                boolean zEquals = TextUtils.equals(vImage.getTag().toString(), NewPhotoAlbumFrag.this.f41597i1);
                NewPhotoAlbumFrag newPhotoAlbumFrag = NewPhotoAlbumFrag.this;
                if (zEquals) {
                    vImage.setTag(newPhotoAlbumFrag.f41598j1);
                    vImage.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(f3c0.f94345I0));
                } else {
                    vImage.setTag(newPhotoAlbumFrag.f41597i1);
                    vImage.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(f3c0.f94353J0));
                }
                NewPhotoAlbumFrag.this.m64295Q7(view);
            }
            if (NewPhotoAlbumFrag.this.f41590b1 != i) {
                VNavigationTabLayout vNavigationTabLayout = NewPhotoAlbumFrag.this.f41549G;
                vNavigationTabLayout.m223598D(vNavigationTabLayout.m223627w(i));
            }
            NewPhotoAlbumFrag.this.m64333u6();
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

        @Override // p149l.dyl
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> mo63831g(int i) {
            return null;
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f41604a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f41604a.get(i);
        }

        @Override // p149l.w660
        public CharSequence getPageTitle(int i) {
            return (CharSequence) NewPhotoAlbumFrag.this.f41582W0.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.m81303a(this.f41606c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f41606c.m2589t0());
                    sb.append(Constants.PACKNAME_END);
                    sb.append("lstFrag :" + this.f41604a);
                    du2.m113670a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: m */
        public Fragment m64347m(int i) {
            Fragment fragmentM2557i0;
            Method method = this.f41605b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentM2557i0 = NewPhotoAlbumFrag.this.getChildFragmentManager().m2557i0((String) method.invoke(this, Integer.valueOf(NewPhotoAlbumFrag.this.f41541A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.m81296c(e);
                fragmentM2557i0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.m81296c(e2);
                fragmentM2557i0 = null;
            }
            return fragmentM2557i0 == null ? getItem(i) : fragmentM2557i0;
        }

        /* JADX INFO: renamed from: n */
        public View m64348n(final int i) {
            View viewInflate = NewPhotoAlbumFrag.this.act().inflater().inflate(o6c0.f142319x5, (ViewGroup) null);
            final VImage vImage = (VImage) viewInflate.findViewById(b5c0.f73473D0);
            vImage.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(f3c0.f94353J0));
            vImage.setTag(NewPhotoAlbumFrag.this.f41597i1);
            if (!nkg.m159906t() && i == 0) {
                NewPhotoAlbumFrag.this.f41586Y0[0] = vImage;
            }
            final TextView textView = (TextView) viewInflate.findViewById(b5c0.f73556d2);
            TextView textView2 = (TextView) viewInflate.findViewById(b5c0.f73560e2);
            NewPhotoAlbumFrag.this.f41584X0[i] = textView;
            NewPhotoAlbumFrag.this.f41588Z0[i] = textView2;
            NewPhotoAlbumFrag.this.f41589a1[i] = (ImageView) viewInflate.findViewById(b5c0.f73625y0);
            textView.setText((CharSequence) NewPhotoAlbumFrag.this.f41582W0.get(i));
            if (nkg.m159906t()) {
                return viewInflate;
            }
            xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.h140
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f105276a.m64346p(i, textView, vImage, view);
                }
            });
            return viewInflate;
        }

        /* JADX INFO: renamed from: o */
        public final void m64349o() {
            VNavigationTabLayout.TabView tabView = NewPhotoAlbumFrag.this.f41549G.m223627w(0).f209872i;
            if (!nkg.m159906t()) {
                tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), t100.m186890d(15.0f), tabView.getPaddingBottom());
                NewPhotoAlbumFrag.this.f41586Y0[0].setVisibility(0);
            }
            FeedModule.f38855d.m209346Pb().mo193131c(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f41584X0[0]);
            FeedModule.f38855d.m209346Pb().mo193141m(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f41584X0[1]);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
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
            Fragment fragmentM64347m = NewPhotoAlbumFrag.this.f41580V0.m64347m(i);
            if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
                if (((PhotoAlbumFeedFrag) fragmentM64347m).m64368Q4()) {
                    FeedModule.m60222H().mo30779jg(NewPhotoAlbumFrag.this.act(), false);
                } else {
                    FeedModule.m60222H().mo30717Pq(NewPhotoAlbumFrag.this.act(), false);
                }
            } else if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
                if (((FriendsFeedContainerFrag) fragmentM64347m).m64074R4()) {
                    FeedModule.m60222H().mo30779jg(NewPhotoAlbumFrag.this.act(), false);
                } else {
                    FeedModule.m60222H().mo30717Pq(NewPhotoAlbumFrag.this.act(), false);
                }
            } else if ((fragmentM64347m instanceof FriendsFeedViewPagerFrag) && ((FriendsFeedViewPagerFrag) fragmentM64347m).m64127B5()) {
                FeedModule.m60222H().mo30779jg(NewPhotoAlbumFrag.this.act(), false);
            } else {
                FeedModule.m60222H().mo30717Pq(NewPhotoAlbumFrag.this.act(), false);
            }
            NewPhotoAlbumFrag.this.m64204P7();
            NewPhotoAlbumFrag.this.m64227X7();
            NewPhotoAlbumFrag.this.m64203P6();
            if (fm20.m122135r().equals(NewPhotoAlbumFrag.this.f41580V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag.m64320m6(newPhotoAlbumFrag.f41565O);
                NewPhotoAlbumFrag.this.m64290L7(fragmentM64347m);
            } else if (nkg.m159906t()) {
                if (fm20.m122133p().equals(NewPhotoAlbumFrag.this.m64284G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag2 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag2.m64320m6(newPhotoAlbumFrag2.f41563N);
                    NewPhotoAlbumFrag.this.m64290L7(fragmentM64347m);
                } else if (fm20.m122125h().equals(NewPhotoAlbumFrag.this.m64284G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag3 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag3.m64320m6(newPhotoAlbumFrag3.f41567P);
                } else if (fm20.m122126i().equals(NewPhotoAlbumFrag.this.m64284G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag4 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag4.m64320m6(newPhotoAlbumFrag4.f41569Q);
                }
            } else if (fm20.m122134q().equals(NewPhotoAlbumFrag.this.f41580V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag5 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag5.m64320m6(newPhotoAlbumFrag5.f41563N);
            } else if (fm20.m122125h().equals(NewPhotoAlbumFrag.this.f41580V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag6 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag6.m64320m6(newPhotoAlbumFrag6.f41567P);
            } else if (fm20.m122126i().equals(NewPhotoAlbumFrag.this.f41580V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag7 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag7.m64320m6(newPhotoAlbumFrag7.f41569Q);
            }
            if (NewPhotoAlbumFrag.this.f41550G0) {
                NewPhotoAlbumFrag.this.f41550G0 = false;
            } else {
                if (fm20.m122134q().equals(NewPhotoAlbumFrag.this.f41580V0.getPageTitle(NewPhotoAlbumFrag.this.f41590b1))) {
                    NewPhotoAlbumFrag.this.f41563N.m109031g();
                } else if (fm20.m122125h().equals(NewPhotoAlbumFrag.this.f41580V0.getPageTitle(NewPhotoAlbumFrag.this.f41590b1))) {
                    NewPhotoAlbumFrag.this.f41567P.m109031g();
                } else if (fm20.m122126i().equals(NewPhotoAlbumFrag.this.f41580V0.getPageTitle(NewPhotoAlbumFrag.this.f41590b1))) {
                    NewPhotoAlbumFrag.this.f41569Q.m109031g();
                } else if (fm20.m122135r().equals(NewPhotoAlbumFrag.this.f41580V0.getPageTitle(NewPhotoAlbumFrag.this.f41590b1))) {
                    NewPhotoAlbumFrag.this.f41565O.m109031g();
                }
                NewPhotoAlbumFrag.this.f41575T.m109042r();
            }
            NewPhotoAlbumFrag.this.f41590b1 = i;
            NewPhotoAlbumFrag newPhotoAlbumFrag8 = NewPhotoAlbumFrag.this;
            newPhotoAlbumFrag8.f41559L.setPageId(newPhotoAlbumFrag8.m64279B6());
            PhotoAlbumPictureView.m63859u(NewPhotoAlbumFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (true) {
                if (i2 >= this.f41604a.size()) {
                    break;
                }
                Fragment fragmentM64347m2 = m64347m(i2);
                if (fragmentM64347m2 instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragmentM64347m2;
                    photoAlbumFeedFrag.m64384h5(i2 == i);
                    photoAlbumFeedFrag.m64383g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag.m64377Z4();
                    }
                } else if (fragmentM64347m2 instanceof FriendsFeedContainerFrag) {
                    FriendsFeedContainerFrag friendsFeedContainerFrag = (FriendsFeedContainerFrag) fragmentM64347m2;
                    friendsFeedContainerFrag.m64083a5(i2 == i);
                    friendsFeedContainerFrag.m64082Z4(i2 == i);
                    if (i2 == i) {
                        friendsFeedContainerFrag.m64079W4();
                    }
                } else if (fragmentM64347m2 instanceof FriendsFeedViewPagerFrag) {
                    FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = (FriendsFeedViewPagerFrag) fragmentM64347m2;
                    friendsFeedViewPagerFrag.m64146d6(i2 == i);
                    friendsFeedViewPagerFrag.m64145c6(i2 == i);
                    if (i2 == i) {
                        friendsFeedViewPagerFrag.m64139W5();
                    }
                }
                i2++;
            }
            NewPhotoAlbumFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f38855d.f193028Y0.onNext(Boolean.FALSE);
            }
            NewPhotoAlbumFrag.this.m64333u6();
        }

        /* JADX INFO: renamed from: q */
        public void m64350q() {
            if (this.f41606c == null) {
                return;
            }
            Iterator<PutongFrag> it = this.f41604a.iterator();
            while (it.hasNext()) {
                this.f41606c.m2567m().mo2715r(it.next()).mo2708j();
            }
        }

        /* JADX INFO: renamed from: r */
        public void m64351r(List<PutongFrag> list) {
            NewPhotoAlbumFrag.this.f41566O0 = list;
            this.f41604a.clear();
            if (NullChecker.m81304b(list)) {
                this.f41604a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$c */
    public class C11289c implements VNavigationTabLayout.InterfaceC22621d {
        public C11289c() {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: a */
        public void mo63839a(VNavigationTabLayout.C22623f c22623f) {
            FeedModule.f38855d.m209346Pb().mo193141m(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f41584X0[c22623f.m223687f()]);
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: b */
        public void mo63840b(VNavigationTabLayout.C22623f c22623f) {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: c */
        public void mo63841c(VNavigationTabLayout.C22623f c22623f) {
            int iM223687f = c22623f.m223687f();
            VNavigationTabLayout.TabView tabView = NewPhotoAlbumFrag.this.f41549G.m223627w(0).f209872i;
            if (!nkg.m159906t()) {
                if (iM223687f == 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), t100.m186890d(15.0f), tabView.getPaddingBottom());
                    NewPhotoAlbumFrag.this.f41586Y0[0].setVisibility(0);
                } else if (NewPhotoAlbumFrag.this.f41586Y0 != null && NewPhotoAlbumFrag.this.f41586Y0.length > 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                    NewPhotoAlbumFrag.this.f41586Y0[0].setVisibility(8);
                }
            }
            FeedModule.f38855d.m209346Pb().mo193131c(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f41584X0[iM223687f]);
            if (nkg.m159906t() && iM223687f == 0) {
                if (fm20.m122125h().equals(NewPhotoAlbumFrag.this.m64284G6()) && iM223687f != NewPhotoAlbumFrag.this.f41590b1 && !nkg.m159854K()) {
                    NewPhotoAlbumFrag.this.mo63785g2();
                    mwh.m156632d().m156643l(17);
                }
                if (fm20.m122133p().equals(NewPhotoAlbumFrag.this.m64284G6())) {
                    if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f41562M0) {
                        NewPhotoAlbumFrag.this.m64274x6();
                    } else if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f41564N0) {
                        NewPhotoAlbumFrag.this.m64338y6();
                    }
                    mwh.m156632d().m156643l(16);
                }
            } else if (!nkg.m159906t()) {
                if (fm20.m122125h().equals(NewPhotoAlbumFrag.this.f41584X0[iM223687f].getText().toString()) && iM223687f != NewPhotoAlbumFrag.this.f41590b1) {
                    mwh.m156632d().m156643l(17);
                }
                if (fm20.m122134q().equals(NewPhotoAlbumFrag.this.f41584X0[iM223687f].getText().toString())) {
                    NewPhotoAlbumFrag.this.mo63785g2();
                    if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f41562M0) {
                        NewPhotoAlbumFrag.this.m64274x6();
                    }
                    mwh.m156632d().m156643l(16);
                }
            }
            if (!fm20.m122135r().equals(NewPhotoAlbumFrag.this.f41584X0[iM223687f].getText().toString()) || iM223687f == NewPhotoAlbumFrag.this.f41590b1) {
                return;
            }
            mwh.m156632d().m156643l(18);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$e */
    public class C11291e {

        /* JADX INFO: renamed from: a */
        public int f41613a;

        /* JADX INFO: renamed from: b */
        public int f41614b;

        /* JADX INFO: renamed from: c */
        public int f41615c;

        /* JADX INFO: renamed from: d */
        public int f41616d;

        /* JADX INFO: renamed from: e */
        public boolean f41617e;

        /* JADX INFO: renamed from: f */
        public boolean f41618f;

        /* JADX INFO: renamed from: g */
        public boolean f41619g;

        public C11291e(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
            this.f41614b = i;
            this.f41613a = i2;
            this.f41615c = i3;
            this.f41616d = i4;
            this.f41617e = z;
            this.f41618f = z2;
            this.f41619g = z3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11291e)) {
                return false;
            }
            C11291e c11291e = (C11291e) obj;
            return this.f41617e == c11291e.f41617e && this.f41613a == c11291e.f41613a && this.f41614b == c11291e.f41614b && this.f41615c == c11291e.f41615c && this.f41618f == c11291e.f41618f && this.f41619g == c11291e.f41619g;
        }

        public int hashCode() {
            int iHashCode = Integer.valueOf(this.f41613a).hashCode();
            int iHashCode2 = Integer.valueOf(this.f41615c).hashCode();
            int iHashCode3 = Boolean.valueOf(this.f41617e).hashCode();
            int iHashCode4 = Boolean.valueOf(this.f41618f).hashCode();
            return (Boolean.valueOf(this.f41619g).hashCode() >> 1) ^ ((((iHashCode >> 1) ^ iHashCode2) ^ iHashCode3) ^ (iHashCode4 >> 1));
        }

        public String toString() {
            return "unreadLikeFeeds:" + this.f41614b + "\nunreadFeeds:" + this.f41613a + "\nunreadActivities:" + this.f41615c + "\nisShowFixTimeDot:" + this.f41617e + "\nisShowTopicDot:" + this.f41618f + "\nisHideRedByNewUser:" + this.f41619g + SignParameters.NEW_LINE;
        }
    }

    static {
        f41536l1 = nkg.m159842B() ? fm20.m122129l() : 7200000L;
        f41537m1 = true;
        f41538n1 = new zpd0("last_like_show_red_dot_time_" + FeedModule.m60221F().userId(), 0L);
        f41539o1 = new tpd0("like_show_red_dot_count_" + FeedModule.m60221F().userId(), 0);
        f41540p1 = C22392a.m221512b();
    }

    public NewPhotoAlbumFrag() {
        if (NullChecker.m81304b(FeedModule.f38855d)) {
            je80.m141102b().m141103a();
            if (nkg.m159891l0()) {
                FeedModule.f38855d.m209326Mc();
            }
        }
        this.f41595g1 = new Runnable() { // from class: l.yz30
            @Override // java.lang.Runnable
            public final void run() {
                this.f200846a.m64282E7();
            }
        };
        this.f41597i1 = "feed_dating_menu_icon_default";
        this.f41598j1 = "feed_dating_menu_icon";
        this.f41600k1 = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A7 */
    public /* synthetic */ void m64170A7(View view, String str, String str2, j760[] j760VarArr) {
        this.f41578U0.m148839h(view, new C11290d(str, str2, zvf0.m220380b(j760VarArr)), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B7 */
    public /* synthetic */ void m64172B7(View view) {
        m64239b7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C7 */
    public /* synthetic */ void m64174C7(View view) {
        String strM64287I6 = m64287I6();
        int i = this.f41585Y;
        p6j0.m167668b("e_moment_unread_notes_history", strM64287I6, p6j0.C19147a.m167678g("moment_unread_red_dot_value", i > 99 ? "99+" : String.valueOf(i)));
        act().startActivity(PhotoAlbumActivitiesAct.m64971V1(act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: D6 */
    private int m64176D6() {
        List<String> list = this.f41582W0;
        if (list != null) {
            return list.indexOf(fm20.m122134q());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D7 */
    public /* synthetic */ void m64177D7(Intent intent) {
        act().startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: F6 */
    private int m64180F6() {
        List<String> list = this.f41582W0;
        if (list != null) {
            return list.indexOf(getString(R$string.f39072h5));
        }
        return 0;
    }

    /* JADX INFO: renamed from: H6 */
    private int m64183H6() {
        if (this.f41594f1) {
            this.f41594f1 = false;
            return 0;
        }
        String strM122128k = fm20.m122128k();
        if (TextUtils.equals(strM122128k, fm20.m122126i())) {
            return 0;
        }
        return this.f41582W0.indexOf(strM122128k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I7, reason: merged with bridge method [inline-methods] */
    public void m64312h7(int i) {
        this.f41588Z0[i].setVisibility(8);
        this.f41589a1[i].setVisibility(8);
    }

    /* JADX INFO: renamed from: K6 */
    private int m64188K6() {
        if (!NullChecker.m81304b(this.f41549G)) {
            return 16;
        }
        int selectedTabPosition = this.f41549G.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            return fm20.m122134q().equals(this.f41580V0.getPageTitle(selectedTabPosition)) ? 16 : 17;
        }
        return 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K7, reason: merged with bridge method [inline-methods] */
    public void m64311g7(int i) {
        this.f41588Z0[i].setVisibility(8);
        this.f41589a1[i].setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L6 */
    public String m64191L6() {
        if (!NullChecker.m81304b(this.f41549G)) {
            return "p_discover_dating";
        }
        int selectedTabPosition = this.f41549G.getSelectedTabPosition();
        if (selectedTabPosition != 0) {
            return "p_discover_discussion";
        }
        if (nkg.m159906t()) {
            return m64284G6().equals(getString(R$string.f39072h5)) ? "p_follow" : "p_discover_dating";
        }
        return fm20.m122134q().equals(this.f41580V0.getPageTitle(selectedTabPosition)) ? "p_discover_dating" : "p_follow";
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m64192M4() {
    }

    @NotNull
    /* JADX INFO: renamed from: M6 */
    private String m64194M6() {
        return fm20.m122125h().equals(this.f41580V0.getPageTitle(this.f41541A.getCurrentItem())) ? "follow" : "other";
    }

    /* JADX INFO: renamed from: M7 */
    private void m64195M7() {
        Fragment fragmentM64347m = this.f41580V0.m64347m(this.f41590b1);
        if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM64347m).m64378a5();
        } else if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM64347m).m64080X4();
        } else if (fragmentM64347m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM64347m).m64141Y5();
        }
    }

    /* JADX INFO: renamed from: O6 */
    private void m64200O6() {
        if (m64230Y6()) {
            C4348d.m20896l().m20900k(this.f41560L0);
            this.f41560L0 = null;
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m64201P4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P6 */
    public void m64203P6() {
        Fragment fragmentM64347m = this.f41580V0.m64347m(this.f41590b1);
        if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM64347m).m64373V4();
        } else if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM64347m).m64075S4();
        } else if (fragmentM64347m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM64347m).m64129G5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P7 */
    public void m64204P7() {
        Fragment fragmentM64347m = this.f41580V0.m64347m(this.f41590b1);
        if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM64347m).m64379b5();
        } else if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM64347m).m64081Y4();
        } else if (fragmentM64347m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM64347m).m64142Z5();
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m64207R4(Throwable th) {
    }

    /* JADX INFO: renamed from: S6 */
    private void m64211S6() {
        if (nkg.m159854K()) {
            duringCreated(f41540p1).subscribe(mkd0.m154955G(new e30() { // from class: l.f140
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94040a.m64336w7((Boolean) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.xz30
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f195151a.m64337x7();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.zz30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205777a.m64316j7((NewPhotoAlbumFrag.C11291e) obj);
            }
        }, new e30() { // from class: l.a040
            @Override // p149l.e30
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m64207R4((Throwable) obj);
            }
        }));
        duringCreated(FeedModule.f38855d.m209272F7()).filter(new w9j() { // from class: l.b040
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Double) obj).doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.c040
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78114a.m64318k7((Double) obj);
            }
        }));
        duringCreated(oe40.m163804F()).subscribe(mkd0.m154955G(new e30() { // from class: l.d040
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83147a.m64319l7((Moment) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.e040
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88535a.m64321m7((C4319c) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.f040
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedModule.f38855d.f193028Y0.onNext(Boolean.TRUE);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.g040
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.g140
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100117a.m64322n7((C4319c) obj);
            }
        }));
        if (wc40.m202629f()) {
            creates(new e30() { // from class: l.oz30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146380a.m64324o7((Bundle) obj);
                }
            });
        }
        duringCreated(kjb0.m146205p()).subscribe(mkd0.m154955G(new e30() { // from class: l.pz30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151914a.m64326p7((Boolean) obj);
            }
        }));
        duringCreated(C11245a.m62716c1()).subscribe(mkd0.m154955G(new e30() { // from class: l.qz30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156992a.m64327q7((String) obj);
            }
        }));
        if (this.f41587Z) {
            creates(new e30() { // from class: l.rz30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f161607a.m64332t7((Bundle) obj);
                }
            });
            duringCreated(this.f41601p0).subscribe(mkd0.m154956H(new e30() { // from class: l.sz30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167014a.m64334u7((Long) obj);
                }
            }, new e30() { // from class: l.tz30
                @Override // p149l.e30
                public final void call(Object obj) {
                    NewPhotoAlbumFrag.m64237b5((Throwable) obj);
                }
            }));
        }
        act().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.uz30
            @Override // p149l.e30
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m64232Z4((C4319c) obj);
            }
        }));
        duringCreated(fm20.f98239b).subscribe(mkd0.m154956H(new e30() { // from class: l.vz30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183581a.m64335v7((roj0) obj);
            }
        }, new e30() { // from class: l.wz30
            @Override // p149l.e30
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m64271w5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    private void m64214T6(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.t040
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f167099a.m64339y7(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.v040
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f179069a.m64340z7(view2);
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    private boolean m64215T7() {
        long jLongValue = FeedModule.f38855d.m209596z7().longValue();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 4, 0, 0);
        return i >= 4 && jLongValue < calendar2.getTimeInMillis();
    }

    /* JADX INFO: renamed from: U6 */
    private void m64218U6() {
        this.f41551H = new VFrame(getContext());
        this.f41555J = new VFrame(getContext());
        VText vText = new VText(getContext());
        this.f41553I = vText;
        this.f41551H.addView(vText, new FrameLayout.LayoutParams(-2, t100.m186890d(34.0f)));
        this.f41553I.setText(R$string.f38899G1);
        this.f41553I.setTextSize(14.0f);
        this.f41553I.setTextColor(-1);
        this.f41553I.setTypeface(eqh0.m117752c(3), 1);
        this.f41553I.setPadding(t100.m186890d(12.0f), 0, t100.m186890d(12.0f), 0);
        this.f41553I.setBackgroundResource(f3c0.f94606q5);
        this.f41553I.setGravity(16);
        VImage vImage = new VImage(getContext());
        this.f41557K = vImage;
        this.f41555J.addView(vImage, new FrameLayout.LayoutParams(t100.m186890d(32.0f), t100.m186890d(32.0f)));
        this.f41557K.setImageResource(f3c0.f94612r3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(12.0f), t100.m186890d(12.0f));
        layoutParams.gravity = 53;
        layoutParams.rightMargin = -t100.m186890d(2.0f);
        layoutParams.topMargin = -t100.m186890d(2.0f);
        FeedRedDotView feedRedDotView = new FeedRedDotView(getContext());
        this.f41559L = feedRedDotView;
        this.f41555J.addView(feedRedDotView, layoutParams);
        this.f41559L.setOvalColor(getResources().getColor(e1c0.f88800o));
        this.f41559L.setWidth(t100.m186890d(12.0f));
        this.f41559L.setRingWidth(t100.m186890d(2.0f));
        this.f41559L.setRingColor(getResources().getColor(e1c0.f88803p0));
        this.f41559L.setRedPointType(2);
        this.f41559L.setPageId(m64279B6());
        this.f41559L.m65057o();
        xdl0.m208344M(this.f41559L, false);
        xdl0.m208344M(this.f41544D, true);
    }

    /* JADX INFO: renamed from: W6 */
    private boolean m64223W6() {
        return vqg.m199552j0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W7, reason: merged with bridge method [inline-methods] */
    public void m64282E7() {
        if (isHidden() || cjh.m107156b()) {
            return;
        }
        fm20.f98242e.put(Long.valueOf(System.currentTimeMillis()));
        if (!u2h.m191493b() || ic50.m135327j().m135333f().m145226M("p_alert_positioning_authority_explore_popup", true)) {
            if (u2h.m191493b()) {
                ic50.m135327j().m135333f().m145241b0("p_alert_positioning_authority_explore_popup", 0, true);
            }
            FeedModule.m60222H().showLocationPermissionCallbackDlg(act(), new d30() { // from class: l.o040
                @Override // p149l.d30
                public final void call() {
                    this.f141286a.m64285G7();
                }
            }, null, false, true, "p_alert_positioning_authority_explore_popup");
        }
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m64225X4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X7 */
    public void m64227X7() {
        Fragment fragmentM64347m = this.f41580V0.m64347m(this.f41590b1);
        if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM64347m).m64084b5();
        } else if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM64347m).m64387m5();
        } else if (fragmentM64347m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM64347m).m64147e6();
        }
    }

    /* JADX INFO: renamed from: Y6 */
    private boolean m64230Y6() {
        return !TextUtils.isEmpty(this.f41560L0);
    }

    /* JADX INFO: renamed from: Y7 */
    private void m64231Y7() {
        String strM64287I6 = m64287I6();
        int i = this.f41585Y;
        p6j0.m167670d("e_moment_unread_notes_history", strM64287I6, p6j0.C19147a.m167678g("moment_unread_red_dot_value", i > 99 ? "99+" : String.valueOf(i)));
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m64232Z4(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            FeedModule.f38858g.m121847c();
            n7c.m158118e().m158124g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z7, reason: merged with bridge method [inline-methods] */
    public C22306c<C11291e> m64337x7() {
        FeedModule.f38855d.m209410Yc("");
        return mkd0.m154986t(ijb0.m136570j(), C22306c.just(Boolean.FALSE), FeedModule.f38855d.m209272F7(), FeedModule.m60222H().isHideRedByNewUser(), new z9j() { // from class: l.s040
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f161722a.m64286H7((Counter) obj, (Boolean) obj2, (Double) obj3, (Boolean) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m64237b5(Throwable th) {
    }

    /* JADX INFO: renamed from: b7 */
    private void m64239b7() {
        vqg.m199514J0(act());
        this.f41559L.m65056k();
        zvf0.m220396r("e_tantan_topic", m64191L6());
        xdl0.m208344M(this.f41559L, false);
        FeedModule.f38855d.m209571vd();
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m64254k5(Act.C4299r c4299r) {
        if (NullChecker.m81303a(c4299r)) {
            FeedModule.f38853b.m60491I2();
        }
    }

    /* JADX INFO: renamed from: l6 */
    private boolean m64256l6(int i) {
        if (i < 10) {
            return false;
        }
        return fm20.f98241d.get().longValue() == 0 || !a5i.m95030f(fm20.f98241d.get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: renamed from: n6 */
    private void m64259n6(boolean z) {
        C11288b c11288b;
        if (z || (c11288b = this.f41580V0) == null) {
            FeedModule.m60222H().mo30717Pq(act(), false);
            return;
        }
        Fragment fragmentM64347m = c11288b.m64347m(this.f41590b1);
        if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
            if (((PhotoAlbumFeedFrag) fragmentM64347m).m64368Q4()) {
                FeedModule.m60222H().mo30779jg(act(), false);
                return;
            }
        } else if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
            if (((FriendsFeedContainerFrag) fragmentM64347m).m64074R4()) {
                FeedModule.m60222H().mo30779jg(act(), false);
                return;
            }
        } else if ((fragmentM64347m instanceof FriendsFeedViewPagerFrag) && ((FriendsFeedViewPagerFrag) fragmentM64347m).m64127B5()) {
            FeedModule.m60222H().mo30779jg(act(), false);
            return;
        }
        FeedModule.m60222H().mo30717Pq(act(), false);
    }

    /* JADX INFO: renamed from: q6 */
    private boolean m64263q6() {
        this.f41562M0 = true;
        e51.m114745J(this.f41595g1);
        if (this.f41590b1 == m64176D6()) {
            return m64274x6();
        }
        return false;
    }

    /* JADX INFO: renamed from: r6 */
    private void m64265r6(final int i) {
        if (m64176D6() >= 0 || m64180F6() >= 0) {
            if (NullChecker.m81303a(this.f41576T0)) {
                this.f41576T0.duringCreated(lifecycle()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.c140
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f78206a.m64310f7(i, (C4319c) obj);
                    }
                }));
            }
            final int i2 = 0;
            boolean z = this.f41589a1[0].getVisibility() == 0;
            lwh lwhVar = new lwh(i > 0, new d30() { // from class: l.d140
                @Override // p149l.d30
                public final void call() {
                    this.f83234a.m64311g7(i2);
                }
            });
            lwhVar.m151970b(new lwh(true, new d30() { // from class: l.e140
                @Override // p149l.d30
                public final void call() {
                    this.f88706a.m64312h7(i2);
                }
            }));
            lwhVar.m151969a();
            m64272w6(xdl0.m208349O0(this.f41589a1[0]) ? this.f41589a1[0] : this.f41588Z0[0], z, this.f41589a1[0].getVisibility() == 0, m64188K6(), m64288J6());
        }
    }

    /* JADX INFO: renamed from: v6 */
    private void m64270v6() {
        if (nkg.m159891l0()) {
            Fragment fragmentM64347m = this.f41580V0.m64347m(this.f41590b1);
            if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
                ((PhotoAlbumFeedFrag) fragmentM64347m).m64367P4();
            } else if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
                ((FriendsFeedContainerFrag) fragmentM64347m).m64072P4();
            } else if (fragmentM64347m instanceof FriendsFeedViewPagerFrag) {
                ((FriendsFeedViewPagerFrag) fragmentM64347m).m64155s5();
            }
        }
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m64271w5(Throwable th) {
    }

    /* JADX INFO: renamed from: w6 */
    private void m64272w6(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                mwh.m156632d().m156650s(Integer.valueOf(i));
            } else {
                mwh.m156632d().m156647p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public boolean m64274x6() {
        this.f41562M0 = false;
        if (System.currentTimeMillis() - fm20.f98242e.get().longValue() < 172800000 || cjh.m107158d()) {
            return false;
        }
        e51.m114744I(this, this.f41595g1, 100L);
        return true;
    }

    /* JADX INFO: renamed from: z6 */
    private void m64277z6(View view, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        if ((z2 ^ z) || z4) {
            if (!z || z4) {
                this.f41554I0 = mwh.m156632d().m156642k(view, i, z3, z4, m64191L6(), m64298S7());
            } else {
                mwh.m156632d().m156650s(1);
            }
        }
    }

    /* JADX INFO: renamed from: A6 */
    public final void m64278A6() {
        m64231Y7();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public String m64279B6() {
        if (!nkg.m159906t()) {
            if (fm20.m122139v()) {
                return (NullChecker.m81303a(this.f41584X0[0]) && this.f41584X0[0].getText().equals(getString(R$string.f39072h5))) ? "p_follow" : "p_discover_dating";
            }
            return "p_discover_discussion";
        }
        if (!fm20.m122139v()) {
            return "p_discover_discussion";
        }
        if (m64284G6().equals(getString(R$string.f39072h5))) {
            return "p_follow";
        }
        return m64284G6().equals(fm20.m122126i()) ? "p_like" : "p_discover_dating";
    }

    /* JADX INFO: renamed from: C6 */
    public String m64280C6() {
        cwf0 cwf0Var = this.f41575T;
        if (cwf0Var == this.f41567P) {
            return "p_follow";
        }
        if (cwf0Var == this.f41569Q) {
            return "p_like";
        }
        if (cwf0Var == this.f41565O) {
            return "p_discover_discussion";
        }
        if (cwf0Var == this.f41563N) {
            return "p_discover_dating";
        }
        if (cwf0Var == this.f41571R) {
            return fm20.m122120c(0);
        }
        return cwf0Var == this.f41573S ? fm20.m122120c(1) : "";
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC11415b
    /* JADX INFO: renamed from: E0 */
    public void mo63744E0() {
        e51.m114745J(this.f41595g1);
    }

    /* JADX INFO: renamed from: E6 */
    public int m64281E6(int i) {
        if (i == 14 || i == 0 || i == 17 || i == 18) {
            return 0;
        }
        return i == 15 ? 1 : -1;
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m64283F7() {
        boolean zEquals = TextUtils.equals(this.f41586Y0[0].getTag().toString(), this.f41597i1);
        VImage[] vImageArr = this.f41586Y0;
        if (zEquals) {
            vImageArr[0].setTag(this.f41598j1);
            this.f41586Y0[0].setBackgroundDrawable(getResources().getDrawable(f3c0.f94345I0));
        } else {
            vImageArr[0].setTag(this.f41597i1);
            this.f41586Y0[0].setBackgroundDrawable(getResources().getDrawable(f3c0.f94353J0));
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final String m64284G6() {
        FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = this.f41576T0;
        return friendsFeedViewPagerFrag == null ? fm20.m122133p() : friendsFeedViewPagerFrag.m64159x5().toString();
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ C11291e m64286H7(Counter counter, Boolean bool, Double d, Boolean bool2) {
        int i = vqg.m199553k() ? counter.moments.unreadLikeFeeds : 0;
        int i2 = counter.moments.unreadFeeds;
        CounterActivities counterActivities = counter.activities;
        return new C11291e(i, i2, counterActivities.unread, counterActivities.unreadPicks, bool.booleanValue(), d.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, bool2.booleanValue());
    }

    /* JADX INFO: renamed from: I6 */
    public final String m64287I6() {
        return (nkg.m159854K() && TextUtils.equals(fm20.m122128k(), fm20.m122126i())) ? "p_like" : m64279B6();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: J4 */
    public cwf0 mo29638J4() {
        return NullChecker.m81303a(this.f41575T) ? this.f41575T : super.mo29638J4();
    }

    /* JADX INFO: renamed from: J6 */
    public final String m64288J6() {
        if (NullChecker.m81304b(this.f41549G)) {
            this.f41549G.getSelectedTabPosition();
        }
        return null;
    }

    /* JADX INFO: renamed from: J7, reason: merged with bridge method [inline-methods] */
    public void m64285G7() {
        Fragment fragmentM64347m = this.f41580V0.m64347m(this.f41590b1);
        if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM64347m).m64376Y4();
        } else if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM64347m).m64078V4();
        } else if (fragmentM64347m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM64347m).m64137T5();
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final void m64290L7(Fragment fragment) {
        hx60 hx60Var;
        if (nkg.m159842B()) {
            if (fragment instanceof PhotoAlbumFeedFrag) {
                PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragment;
                hx60 hx60Var2 = photoAlbumFeedFrag.m64370S4().f84602j;
                if (hx60Var2 == null) {
                    return;
                }
                long j = hx60Var2.f109832a;
                if (j <= 0 || System.currentTimeMillis() - j <= fm20.m122129l()) {
                    return;
                }
                photoAlbumFeedFrag.m64376Y4();
                return;
            }
            if ((fragment instanceof FriendsFeedViewPagerFrag) && fm20.m122133p().equals(m64284G6())) {
                FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = (FriendsFeedViewPagerFrag) fragment;
                PhotoAlbumFeedFrag photoAlbumFeedFragM64126A5 = friendsFeedViewPagerFrag.m64126A5();
                if (!NullChecker.m81303a(photoAlbumFeedFragM64126A5) || (hx60Var = photoAlbumFeedFragM64126A5.m64370S4().f84602j) == null) {
                    return;
                }
                long j2 = hx60Var.f109832a;
                if (j2 <= 0 || System.currentTimeMillis() - j2 <= fm20.m122129l()) {
                    return;
                }
                friendsFeedViewPagerFrag.m64126A5().m64376Y4();
            }
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final int m64291N6(C11291e c11291e) {
        int i;
        if (nkg.m159854K()) {
            return c11291e.f41614b;
        }
        int i2 = c11291e.f41613a;
        return (i2 != 0 || (i = this.f41558K0) <= 0) ? i2 : i;
    }

    /* JADX INFO: renamed from: N7 */
    public final void m64292N7() {
        if (nkg.m159906t()) {
            if (this.f41576T0.m64127B5()) {
                FeedModule.m60222H().mo30779jg(act(), false);
                return;
            } else {
                FeedModule.m60222H().mo30717Pq(act(), false);
                return;
            }
        }
        if (this.f41574S0.m64074R4()) {
            FeedModule.m60222H().mo30779jg(act(), false);
        } else {
            FeedModule.m60222H().mo30717Pq(act(), false);
        }
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: O0 */
    public void mo63755O0(String str, boolean z) {
        if (m64303Y() == null) {
            return;
        }
        if (nkg.m159854K() && z && TabName.Moment.toString().equals(this.f41546E0) && m64303Y() == this.f41576T0 && m64298S7()) {
            this.f41600k1 = System.currentTimeMillis();
        }
        String str2 = FeedModule.f38855d.f192994I1;
        TabName tabName = TabName.Moment;
        if (tabName.toString().equals(str) && !tabName.toString().equals(this.f41546E0) && z && (((nkg.m159906t() && m64303Y() == this.f41576T0) || m64303Y() == this.f41574S0) && (TextUtils.equals(str2, "follow") || TextUtils.equals(str2, "like")))) {
            n7c.m158118e().m158122d();
        }
        if (FeedModule.m60222H().mo30708Md() && FeedModule.m60222H().mo30800nd() && tabName.toString().equals(str) && !tabName.toString().equals(this.f41546E0)) {
            FeedModule.m60222H().mo30731Vr();
            p6j0.m167668b("e_leadtocommunity", "p_suggest_users_home_view", p6j0.C19147a.m167678g("leadtocommunity_uid", FeedModule.m60222H().mo30813qp()), p6j0.C19147a.m167677f("leadtocommunity_reason", FeedModule.m60222H().mo30695Id()));
            mo63793j1(14);
            n7c.m158118e().m158122d();
            e51.m114744I(this, new Runnable() { // from class: l.r040
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157138a.m64285G7();
                }
            }, 100L);
        }
        this.f41546E0 = str;
    }

    /* JADX INFO: renamed from: O7 */
    public final void m64293O7() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        List<Fragment> listM2589t0 = childFragmentManager.m2589t0();
        if (vwb.m200296J(listM2589t0)) {
            return;
        }
        AbstractC0427k abstractC0427kM2567m = childFragmentManager.m2567m();
        Iterator<Fragment> it = listM2589t0.iterator();
        while (it.hasNext()) {
            abstractC0427kM2567m.mo2715r(it.next());
        }
        abstractC0427kM2567m.mo2708j();
        childFragmentManager.m2545e0();
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: P0 */
    public boolean mo63757P0() {
        Fragment fragmentM64347m = this.f41580V0.m64347m(this.f41590b1);
        if (fragmentM64347m instanceof FriendsFeedContainerFrag) {
            return ((FriendsFeedContainerFrag) fragmentM64347m).m64071P0();
        }
        if (fragmentM64347m instanceof PhotoAlbumFeedFrag) {
            return ((PhotoAlbumFeedFrag) fragmentM64347m).m64366P0();
        }
        if (fragmentM64347m instanceof FriendsFeedViewPagerFrag) {
            return ((FriendsFeedViewPagerFrag) fragmentM64347m).m64134P0();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q6 */
    public final void m64294Q6(C11291e c11291e) {
        int i = c11291e.f41613a;
        if (i <= 0 || this.f41556J0) {
            return;
        }
        this.f41558K0 = i;
    }

    /* JADX INFO: renamed from: Q7 */
    public final void m64295Q7(View view) {
        xxg xxgVar = this.f41596h1;
        if (xxgVar != null && xxgVar.isShowing()) {
            this.f41596h1.dismiss();
            return;
        }
        xxg xxgVar2 = new xxg(this, act());
        this.f41596h1 = xxgVar2;
        VImage[] vImageArr = this.f41586Y0;
        if (vImageArr != null && vImageArr.length > 0) {
            xxgVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.a140
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f67094a.m64283F7();
                }
            });
        }
        ed80.m115791c(this.f41596h1, view, 0, 0, 80);
    }

    /* JADX INFO: renamed from: R6 */
    public final void m64296R6(int i, PutongFrag putongFrag) {
        if (i < 0) {
            return;
        }
        this.f41541A.setCurrentItem(i);
        PutongFrag putongFrag2 = this.f41566O0.get(i);
        if (putongFrag2 instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) putongFrag2).m64372U4().m100605j0();
            return;
        }
        if (putongFrag != null) {
            if (putongFrag instanceof FriendsFeedContainerFrag) {
                ((FriendsFeedContainerFrag) putongFrag).m64077U4();
            } else if (putongFrag instanceof FriendsFeedViewPagerFrag) {
                ((FriendsFeedViewPagerFrag) putongFrag).m64131J5();
            }
        }
    }

    /* JADX INFO: renamed from: R7 */
    public final void m64297R7(C11291e c11291e) {
        boolean z;
        if (c11291e == null) {
            return;
        }
        this.f41592d1 = c11291e;
        if (!FriendsFeedViewPagerFrag.f41497J0 && nkg.m159854K()) {
            this.f41592d1.f41614b = 0;
        }
        m64265r6(m64291N6(c11291e));
        if (c11291e.f41617e) {
            FeedModule.f38855d.m209564ud(Calendar.getInstance().getTimeInMillis());
        }
        boolean z2 = c11291e.f41615c > 0 && !m64223W6();
        if (z2) {
            kjb0.m146179B(act(), c11291e.f41615c);
        } else {
            kjb0.m146179B(act(), -1);
        }
        boolean z3 = !z2 && ((m64291N6(c11291e) > 0) || c11291e.f41617e || (!c11291e.f41619g && m64305a7(c11291e))) && !m64223W6();
        boolean z4 = z2;
        boolean z5 = this.f41552H0;
        if (z4) {
            m64277z6(null, z5, false, m64291N6(c11291e), m64305a7(c11291e), true);
            kjb0.m146178A(act(), false);
            z = z3;
        } else {
            z = z3;
            m64277z6(null, z5, z, m64291N6(c11291e), m64305a7(c11291e), false);
            kjb0.m146178A(act(), z);
        }
        this.f41552H0 = z;
    }

    /* JADX INFO: renamed from: S7 */
    public final boolean m64298S7() {
        FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = this.f41576T0;
        return friendsFeedViewPagerFrag == null ? !nkg.m159854K() : friendsFeedViewPagerFrag.m64153q5();
    }

    /* JADX INFO: renamed from: U7 */
    public final void m64299U7(int i, int i2) {
        if (f41537m1) {
            return;
        }
        String str = "这里有" + ((Object) this.f41547F.getText()) + "条消息在等你回复～";
        if (flg.m121980e(i)) {
            p6j0.m167670d("e_moment_unread_notes_bubble", m64279B6(), new p6j0.C19147a[0]);
            str = "大量互动消息正在等待你的回应";
        } else if (m64317k6(i2)) {
            fm20.f98244g.put(Long.valueOf(mqi0.m155944o()));
            str = i2 + "位女生通过动态喜欢了你";
        } else if (!m64256l6(i)) {
            return;
        } else {
            fm20.f98241d.put(Long.valueOf(mqi0.m155944o()));
        }
        this.f41570Q0 = C4348d.m20896l().m20908t(new C4345a(act()).m20849D(str).m20870k(act().getResources().getColor(e1c0.f88798n)).m20855J(13.0f).m20884z(t100.m186890d(10.0f)).m20850E(true).m20861b(TextUtils.equals("大量互动消息正在等待你的回应", str) ? com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS : 3000L).m20875q(C4345a.f15683Q | C4345a.f15682P).m20873o(C4345a.f15682P, t100.m186890d(6.0f)).m20882x(t100.m186890d(2.0f)), this.f41544D);
    }

    /* JADX INFO: renamed from: V6 */
    public boolean m64300V6() {
        return m64176D6() == this.f41590b1 || m64180F6() == this.f41590b1;
    }

    /* JADX INFO: renamed from: V7 */
    public final void m64301V7() {
    }

    /* JADX INFO: renamed from: X6 */
    public final Boolean m64302X6() {
        if (!nkg.m159891l0()) {
            return Boolean.FALSE;
        }
        long jLongValue = FeedModule.f38855d.f192982D1.get().longValue();
        return (jLongValue <= 0 || a5i.m95033i((double) jLongValue)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Y */
    public Frag m64303Y() {
        DiscoveryPager discoveryPager;
        C11288b c11288b = this.f41580V0;
        if (c11288b == null || (discoveryPager = this.f41541A) == null) {
            return null;
        }
        return (Frag) c11288b.m64347m(discoveryPager.getCurrentItem());
    }

    /* JADX INFO: renamed from: Z6 */
    public final boolean m64304Z6() {
        if (fm20.f98240c.get().booleanValue()) {
            return NullChecker.m81303a(this.f41560L0) && C4348d.m20896l().m20912x(this.f41560L0);
        }
        return true;
    }

    /* JADX INFO: renamed from: a7 */
    public final boolean m64305a7(C11291e c11291e) {
        return c11291e.f41618f;
    }

    /* JADX INFO: renamed from: a8 */
    public final void m64306a8(int i, int i2) {
        this.f41585Y = i;
        ImageView imageView = this.f41545E;
        if (i > 0) {
            imageView.setImageResource(f3c0.f94396P0);
            xdl0.m208344M(this.f41547F, true);
            VText vText = this.f41547F;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
        } else {
            imageView.setImageResource(f3c0.f94389O0);
            xdl0.m208344M(this.f41547F, false);
        }
        m64299U7(i, i2);
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m64308d7(d30 d30Var, Throwable th) {
        m64307c7(null, d30Var);
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m64309e7(final lwh lwhVar) {
        Objects.requireNonNull(lwhVar);
        m64323o6(new d30() { // from class: l.w040
            @Override // p149l.d30
            public final void call() {
                lwhVar.m151969a();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m64211S6();
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m64310f7(int i, C4319c c4319c) {
        this.f41576T0.m64154r5(i);
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: g2 */
    public void mo63785g2() {
        if (nkg.m159854K() && this.f41590b1 == 0) {
            m64297R7(this.f41592d1);
            return;
        }
        if (this.f41556J0 || this.f41558K0 <= 0 || !NullChecker.m81303a(this.f41592d1)) {
            return;
        }
        this.f41556J0 = true;
        this.f41558K0 = 0;
        m64297R7(this.f41592d1);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        mwh.m156632d().m156654w(new mwh.InterfaceC18577a() { // from class: l.j040
            @Override // p149l.mwh.InterfaceC18577a
            /* JADX INFO: renamed from: a */
            public final void mo139123a(View view, String str, String str2, j760[] j760VarArr) {
                this.f115635a.m64170A7(view, str, str2, j760VarArr);
            }
        });
        m64218U6();
        this.f41582W0.add(0, fm20.m122134q());
        this.f41582W0.add(1, fm20.m122135r());
        ArrayList arrayList = new ArrayList();
        m64293O7();
        FriendsFeedContainerFrag friendsFeedContainerFragM64068M4 = FriendsFeedContainerFrag.m64068M4(FeedModule.m60221F().userId());
        n7c.m158118e().m158126i(this);
        this.f41574S0 = friendsFeedContainerFragM64068M4;
        PhotoAlbumFeedFrag photoAlbumFeedFragM64360M4 = PhotoAlbumFeedFrag.m64360M4(FeedModule.m60221F().userId(), "from_discover_discussion", -1, User.ID_TEAM_ACCOUNT, 15);
        if (nkg.m159906t()) {
            FriendsFeedViewPagerFrag friendsFeedViewPagerFragM64122n5 = FriendsFeedViewPagerFrag.m64122n5();
            this.f41576T0 = friendsFeedViewPagerFragM64122n5;
            arrayList.add(friendsFeedViewPagerFragM64122n5);
        } else {
            arrayList.add(friendsFeedContainerFragM64068M4);
        }
        arrayList.add(photoAlbumFeedFragM64360M4);
        this.f41580V0.m64351r(arrayList);
        this.f41602z.setTag("photo_album_root");
        this.f41541A.setOnPageChangeListener(this.f41580V0);
        this.f41541A.setAdapter(this.f41580V0);
        this.f41543C.setBackgroundColor(act().getResources().getColor(e1c0.f88803p0));
        this.f41543C.setupViewPager(this.f41541A);
        this.f41549G = this.f41543C.getTabLayout();
        this.f41543C.setRightIconViews(this.f41555J, this.f41551H);
        xdl0.m208362Z(this.f41543C);
        this.f41578U0.m148839h(this.f41602z, new C11290d(), 1);
        xdl0.m208344M(this.f41555J, true);
        xdl0.m208329E0(this.f41555J, new View.OnClickListener() { // from class: l.u040
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172844a.m64172B7(view);
            }
        });
        int i = 0;
        while (i < this.f41549G.getTabCount()) {
            View viewM64348n = this.f41580V0.m64348n(i);
            VNavigationTabLayout.C22623f c22623fM223627w = this.f41549G.m223627w(i);
            Objects.requireNonNull(c22623fM223627w);
            c22623fM223627w.m223695n(viewM64348n);
            VNavigationTabLayout.C22623f c22623fM223627w2 = this.f41549G.m223627w(i);
            Objects.requireNonNull(c22623fM223627w2);
            VNavigationTabLayout.TabView tabView = c22623fM223627w2.f209872i;
            int iM186890d = i == 0 ? t100.m186890d(4.0f) : 0;
            VNavigationTabLayout.C22623f c22623fM223627w3 = this.f41549G.m223627w(i);
            Objects.requireNonNull(c22623fM223627w3);
            int paddingTop = c22623fM223627w3.f209872i.getPaddingTop();
            VNavigationTabLayout.C22623f c22623fM223627w4 = this.f41549G.m223627w(i);
            Objects.requireNonNull(c22623fM223627w4);
            tabView.setPadding(iM186890d, paddingTop, 0, c22623fM223627w4.f209872i.getPaddingBottom());
            i++;
        }
        this.f41549G.setOnTabSelectedListener((VNavigationTabLayout.InterfaceC22621d) new C11289c());
        this.f41580V0.m64349o();
        int iM64183H6 = m64183H6();
        PutongFrag putongFrag = friendsFeedContainerFragM64068M4;
        if (nkg.m159906t()) {
            putongFrag = this.f41576T0;
        }
        m64296R6(iM64183H6, putongFrag);
        m64214T6(this.f41553I);
        this.f41568P0 = new jug(act(), m64279B6());
        tfh.m188712h().m188720k(this);
        hrg.m132673g().m132679j(this);
        xdl0.m208329E0(this.f41544D, new View.OnClickListener() { // from class: l.b140
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72489a.m64174C7(view);
            }
        });
        jlg.m142074f().m142075b(this);
    }

    /* JADX INFO: renamed from: i6 */
    public View m64313i6(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i140.m133966b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m64314i7() {
        isHidden();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f41580V0 = new C11288b(getChildFragmentManager());
        return m64313i6(layoutInflater, viewGroup);
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: j0 */
    public void mo63792j0() {
        if (nkg.m159854K()) {
            if (this.f41576T0 == null) {
                return;
            }
            if (TextUtils.equals(FeedModule.f38855d.f192994I1, "like")) {
                this.f41576T0.m64152o5(5);
                m64292N7();
                return;
            }
        }
        if (nkg.m159906t()) {
            if (this.f41576T0 == null) {
                return;
            }
            String str = FeedModule.f38855d.f192994I1;
            if (TextUtils.equals(str, "follow")) {
                this.f41576T0.m64152o5(1);
                m64292N7();
                return;
            }
            if (TextUtils.equals(str, "dating")) {
                this.f41576T0.m64152o5(2);
                m64292N7();
                return;
            } else if (TextUtils.equals(str, "activity_one")) {
                this.f41576T0.m64152o5(3);
                m64292N7();
                return;
            } else {
                if (TextUtils.equals(str, "activity_two")) {
                    this.f41576T0.m64152o5(4);
                    m64292N7();
                    return;
                }
                return;
            }
        }
        if (this.f41574S0 == null) {
            return;
        }
        String str2 = FeedModule.f38855d.f192994I1;
        if (TextUtils.equals(str2, "follow")) {
            this.f41574S0.m64069N4(1);
            if (!vwb.m200296J(this.f41582W0)) {
                this.f41582W0.remove(0);
                this.f41582W0.add(0, getString(R$string.f39072h5));
                this.f41584X0[0].setText(getString(R$string.f39072h5));
            }
            this.f41575T.m109031g();
            m64320m6(this.f41567P);
            this.f41575T.m109042r();
            this.f41559L.setPageId(m64279B6());
            m64292N7();
            return;
        }
        if (TextUtils.equals(str2, "dating")) {
            this.f41574S0.m64069N4(2);
            if (!vwb.m200296J(this.f41582W0)) {
                this.f41582W0.remove(0);
                this.f41582W0.add(0, fm20.m122134q());
                this.f41584X0[0].setText(fm20.m122134q());
            }
            this.f41575T.m109031g();
            m64320m6(this.f41563N);
            this.f41575T.m109042r();
            this.f41559L.setPageId(m64279B6());
            m64292N7();
        }
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: j1 */
    public void mo63793j1(int i) {
        int iM64281E6 = m64281E6(i);
        if (iM64281E6 >= 0) {
            this.f41541A.setCurrentItem(iM64281E6);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public void m64315j6() {
        i140.m133967c(this);
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m64316j7(C11291e c11291e) {
        if ((nkg.m159906t() && !m64284G6().equals(getString(R$string.f39072h5))) || !m64300V6()) {
            m64294Q6(c11291e);
        }
        m64297R7(c11291e);
        m64306a8(c11291e.f41615c, c11291e.f41616d);
    }

    /* JADX INFO: renamed from: k6 */
    public final boolean m64317k6(int i) {
        if (i > 0) {
            return !mqi0.m155928C(mqi0.m155944o(), fm20.f98244g.get().longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m64318k7(Double d) {
        xdl0.m208344M(this.f41559L, true);
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ void m64319l7(Moment moment) {
        this.f41541A.setCurrentItem(0);
        n7c.m158118e().m158122d();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC11414a
    /* JADX INFO: renamed from: m */
    public void mo63799m(String str) {
    }

    /* JADX INFO: renamed from: m6 */
    public final void m64320m6(cwf0 cwf0Var) {
        String str;
        this.f41575T = cwf0Var;
        if (cwf0Var == this.f41567P) {
            str = "p_follow";
        } else if (cwf0Var == this.f41569Q) {
            str = "p_like";
        } else if (cwf0Var == this.f41563N) {
            str = "p_discover_dating";
        } else if (cwf0Var == this.f41565O) {
            str = "p_discover_discussion";
        } else if (cwf0Var == this.f41571R && fm20.m122136s()) {
            str = this.f41548F0.get(0).f116372b;
        } else {
            str = (cwf0Var == this.f41573S && fm20.m122138u()) ? this.f41548F0.get(1).f116372b : null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        j2e.m139429b().m139432e(str);
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ Boolean m64321m7(C4319c c4319c) {
        return Boolean.valueOf(c4319c == C4319c.f15548i && m64215T7());
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m64322n7(C4319c c4319c) {
        if (NullChecker.m81303a(this.f41561M) && this.f41561M.isShowing()) {
            this.f41561M.dismiss();
        }
        if (NullChecker.m81303a(this.f41596h1) && this.f41596h1.isShowing()) {
            this.f41596h1.dismiss();
        }
        m64331t6();
        m64333u6();
        m64270v6();
        if (nkg.m159909u0()) {
            m3i.m152923m().m152929l();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public final void m64323o6(final d30 d30Var) {
        if (nkg.m159891l0()) {
            act().duringCreated(FeedModule.f38855d.m209326Mc()).subscribe(mkd0.m154956H(new e30() { // from class: l.y040
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195274a.m64307c7(d30Var, (TopicOperations) obj);
                }
            }, new e30() { // from class: l.z040
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200931a.m64308d7(d30Var, (Throwable) obj);
                }
            }));
        } else {
            m64307c7(null, d30Var);
        }
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m64324o7(Bundle bundle) {
        act().duringCreated((C22306c) Act.foreground(), false).distinctUntilChanged(new x9j() { // from class: l.m040
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Act.C4299r) obj) != null || ((Act.C4299r) obj2) == null);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.n040
            @Override // p149l.e30
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m64254k5((Act.C4299r) obj);
            }
        }));
        FeedModule.f38853b.m60489G2();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41563N.m109033i();
        this.f41567P.m109033i();
        this.f41569Q.m109033i();
        this.f41565O.m109033i();
        this.f41563N.m109040p(j760.m140076a("tab_name", fm20.m122134q()));
        this.f41565O.m109040p(j760.m140076a("tab_name", fm20.m122135r()));
        this.f41567P.m109040p(j760.m140076a("tab_name", getString(R$string.f39072h5)));
        this.f41569Q.m109040p(j760.m140076a("tab_name", fm20.m122126i()));
        this.f41575T = this.f41563N;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        mwh.m156632d().m156651t();
        this.f41563N.m109034j();
        this.f41567P.m109034j();
        this.f41569Q.m109034j();
        this.f41565O.m109034j();
        if (NullChecker.m81303a(this.f41580V0)) {
            this.f41580V0.m64350q();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        f41537m1 = z;
        if (NullChecker.m81303a(this.f41580V0)) {
            for (int i = 0; i < this.f41580V0.f41604a.size(); i++) {
                Fragment fragment = (Fragment) this.f41580V0.f41604a.get(i);
                if (fragment instanceof PhotoAlbumFeedFrag) {
                    ((PhotoAlbumFeedFrag) fragment).m64381e5(z);
                } else if (fragment instanceof FriendsFeedViewPagerFrag) {
                    ((FriendsFeedViewPagerFrag) fragment).m64144b6(z);
                }
            }
        }
        if (z) {
            if (NullChecker.m81304b(act())) {
                if (NullChecker.m81303a(this.f41591c1) && this.f41591c1.isShowing()) {
                    this.f41591c1.dismiss();
                }
                if (NullChecker.m81303a(this.f41561M) && this.f41561M.isShowing()) {
                    this.f41561M.dismiss();
                }
                if (NullChecker.m81303a(this.f41596h1) && this.f41596h1.isShowing()) {
                    this.f41596h1.dismiss();
                }
                PhotoAlbumPictureView.m63859u(act().getWindow().getDecorView(), false);
            }
            e51.m114745J(this.f41595g1);
            eng.m117268o();
            m64204P7();
            m64227X7();
            m64203P6();
            m64331t6();
            m64333u6();
            jlg.m142074f().m142081i();
            m64270v6();
        } else {
            if (!vwb.m200296J(this.f41566O0)) {
                m64290L7(this.f41566O0.get(this.f41590b1));
            }
            m64299U7(NullChecker.m81303a(this.f41592d1) ? this.f41592d1.f41615c : 0, NullChecker.m81303a(this.f41592d1) ? this.f41592d1.f41616d : 0);
            if (this.f41554I0 == 10) {
                mwh.m156632d().m156644m(this.f41554I0, m64191L6());
            } else {
                mwh.m156632d().m156643l(this.f41554I0);
            }
            if (this.f41590b1 == 1) {
                FeedModule.f38855d.f193028Y0.onNext(Boolean.FALSE);
            }
            FeedModule.f38855d.m209410Yc("");
            m64325p6();
            if (u2h.m191495d()) {
                m64195M7();
            }
            m64278A6();
        }
        m64259n6(z);
        this.f41581W.onNext(Boolean.valueOf(z));
        j2e.m139429b().m139433f(z, m64280C6());
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if ("moment".equals(this.f41583X)) {
            this.f41568P0.mo99779q();
        }
        if (m64302X6().booleanValue()) {
            lsi0.m151595y("新人头像框体验已到期～");
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final void m64325p6() {
        lwh lwhVar = new lwh(m64263q6(), new d30() { // from class: l.h040
            @Override // p149l.d30
            public final void call() {
                NewPhotoAlbumFrag.m64201P4();
            }
        });
        lwh lwhVar2 = new lwh(!m64304Z6() && jlg.m142074f().m142087o() && jlg.m142074f().m142076c(act(), null), new d30() { // from class: l.i040
            @Override // p149l.d30
            public final void call() {
                NewPhotoAlbumFrag.m64225X4();
            }
        });
        final lwh lwhVar3 = new lwh(false, new d30() { // from class: l.k040
            @Override // p149l.d30
            public final void call() {
                NewPhotoAlbumFrag.m64192M4();
            }
        });
        lwhVar.m151970b(lwhVar2).m151970b(new lwh(true, new d30() { // from class: l.l040
            @Override // p149l.d30
            public final void call() {
                this.f125463a.m64309e7(lwhVar3);
            }
        })).m151970b(lwhVar3);
        lwhVar.m151969a();
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m64326p7(Boolean bool) {
        m64285G7();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return m64279B6();
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m64327q7(String str) {
        v1h.m196566I0(act(), str);
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ Boolean m64328r7(Act.C4299r c4299r, Act.C4299r c4299r2) {
        if (c4299r != null && c4299r2 == null) {
            this.f41599k0 = System.currentTimeMillis();
        }
        return Boolean.valueOf(c4299r != null || c4299r2 == null);
    }

    /* JADX INFO: renamed from: s6, reason: merged with bridge method [inline-methods] */
    public final void m64307c7(TopicOperations topicOperations, d30 d30Var) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ void m64330s7(Act.C4299r c4299r) {
        if (!isHidden() && this.f41599k0 > 0 && System.currentTimeMillis() - this.f41599k0 > f41536l1) {
            this.f41599k0 = 0L;
            this.f41601p0.onNext(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m64331t6() {
        if (NullChecker.m81303a(this.f41570Q0)) {
            C4348d.m20896l().m20900k(this.f41570Q0);
            this.f41570Q0 = null;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ void m64332t7(Bundle bundle) {
        act().duringCreated((C22306c) Act.foreground(), false).distinctUntilChanged(new x9j() { // from class: l.p040
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f146541a.m64328r7((Act.C4299r) obj, (Act.C4299r) obj2);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.q040
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152001a.m64330s7((Act.C4299r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u6 */
    public void m64333u6() {
        if (NullChecker.m81303a(this.f41572R0)) {
            C4348d.m20896l().m20900k(this.f41572R0);
            this.f41572R0 = null;
        }
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m64334u7(Long l2) {
        if (isHidden() || vwb.m200296J(this.f41566O0)) {
            return;
        }
        m64290L7(this.f41566O0.get(this.f41590b1));
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: v3 */
    public void mo63817v3(String str) {
        this.f41575T.m109031g();
        if (TextUtils.equals(fm20.m122125h(), str)) {
            m64320m6(this.f41567P);
        } else if (TextUtils.equals(fm20.m122126i(), str)) {
            m64320m6(this.f41569Q);
        } else {
            m64320m6(this.f41563N);
        }
        this.f41575T.m109042r();
        this.f41559L.setPageId(m64279B6());
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m64335v7(roj0 roj0Var) {
        m64301V7();
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m64336w7(Boolean bool) {
        this.f41594f1 = bool.booleanValue();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        m64315j6();
    }

    /* JADX INFO: renamed from: y6 */
    public final boolean m64338y6() {
        this.f41564N0 = false;
        if (w980.m202252h().m202258k()) {
            return w980.m202252h().m202254f(act());
        }
        w980.m202252h().m202253e(new d30() { // from class: l.x040
            @Override // p149l.d30
            public final void call() {
                this.f188925a.m64314i7();
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m64339y7(View view) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return;
        }
        boolean zM142085m = jlg.m142074f().m142085m();
        vch vchVar = this.f41577U;
        if (zM142085m) {
            vchVar.mo197763b(act(), vwb.m200324f0(new Media[0]), true, m64194M6(), jlg.m142074f().m142079g(), jlg.m142074f().m142080h(), this.f41579V, jlg.m142074f().m142077d());
            jlg.m142074f().m142081i();
        } else {
            vchVar.mo197762a(act(), m64194M6(), null, this.f41579V);
        }
        zvf0.m220396r("e_moment_post", m64280C6());
        m84.m153429e().m153438j();
        m64200O6();
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ boolean m64340z7(View view) {
        TopicMoment topicMomentNew_;
        zvf0.m220396r("e_moment_post", m64280C6());
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return true;
        }
        m84.m153429e().m153438j();
        if (jlg.m142074f().m142085m()) {
            String strM142079g = jlg.m142074f().m142079g();
            String strM142080h = jlg.m142074f().m142080h();
            if (TextUtils.isEmpty(strM142079g) || TextUtils.isEmpty(strM142080h)) {
                topicMomentNew_ = null;
            } else {
                topicMomentNew_ = TopicMoment.new_();
                topicMomentNew_.f39247id = strM142079g;
                topicMomentNew_.name = strM142080h;
            }
            oe40.m163852n0(act(), vwb.m200324f0(new Media[0]), true, m64194M6(), null, null, topicMomentNew_, jlg.m142074f().m142077d());
            jlg.m142074f().m142081i();
        } else {
            oe40.m163846k0(act(), vwb.m200324f0(new Media[0]), true, m64194M6());
        }
        m64200O6();
        return true;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$d */
    public class C11290d {

        /* JADX INFO: renamed from: a */
        public String f41609a;

        /* JADX INFO: renamed from: b */
        public String f41610b;

        /* JADX INFO: renamed from: c */
        public JSONObject f41611c;

        public C11290d(String str, String str2, JSONObject jSONObject) {
            this.f41609a = str;
            this.f41610b = str2;
            this.f41611c = jSONObject;
        }

        public C11290d() {
        }
    }
}
