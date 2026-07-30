package com.p000p1.mobile.putong.feed.newui.photoalbum.discovery;

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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.k;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.CounterActivities;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.cwf0;
import l.d30;
import l.du2;
import l.dyl;
import l.e30;
import l.e51;
import l.ed80;
import l.eqh0;
import l.ic50;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.t100;
import l.tpd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wc40;
import l.x9j;
import l.xck0;
import l.xdl0;
import l.z9j;
import l.zpd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p007l.a5i;
import p007l.b0i;
import p007l.b5c0;
import p007l.cjh;
import p007l.e1c0;
import p007l.eng;
import p007l.f3c0;
import p007l.flg;
import p007l.fm20;
import p007l.hrg;
import p007l.hx60;
import p007l.i140;
import p007l.ijb0;
import p007l.j2e;
import p007l.j60;
import p007l.je80;
import p007l.jlg;
import p007l.jug;
import p007l.kjb0;
import p007l.l80;
import p007l.lwh;
import p007l.m3i;
import p007l.m84;
import p007l.mwh;
import p007l.n7c;
import p007l.nkg;
import p007l.o6c0;
import p007l.oe40;
import p007l.p6j0;
import p007l.pv60;
import p007l.tfh;
import p007l.u2h;
import p007l.v1h;
import p007l.vch;
import p007l.vqg;
import p007l.w980;
import p007l.wch;
import p007l.xxg;
import p007l.zzl;
import rx.subjects.a;
import rx.subjects.b;
import v.VFrame;
import v.VImage;
import v.VText;
import v.navigationbar.VNavigationBar;
import v.navigationbar.VNavigationTabLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewPhotoAlbumFrag extends PutongFrag implements FeedService.InterfaceC2258a, FeedService.InterfaceC2259b, zzl {

    /* JADX INFO: renamed from: l1 */
    public static long f2997l1;

    /* JADX INFO: renamed from: m1 */
    public static boolean f2998m1;

    /* JADX INFO: renamed from: n1 */
    public static zpd0 f2999n1;

    /* JADX INFO: renamed from: o1 */
    public static tpd0 f3000o1;

    /* JADX INFO: renamed from: p1 */
    public static a<Boolean> f3001p1;

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f3002A;

    /* JADX INFO: renamed from: B */
    public VFrame f3003B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f3004C;

    /* JADX INFO: renamed from: D */
    public VFrame f3005D;

    /* JADX INFO: renamed from: E */
    public ImageView f3006E;

    /* JADX INFO: renamed from: E0 */
    public String f3007E0;

    /* JADX INFO: renamed from: F */
    public VText f3008F;

    /* JADX INFO: renamed from: G */
    public VNavigationTabLayout f3010G;

    /* JADX INFO: renamed from: H */
    public VFrame f3012H;

    /* JADX INFO: renamed from: I */
    public VText f3014I;

    /* JADX INFO: renamed from: J */
    public VFrame f3016J;

    /* JADX INFO: renamed from: J0 */
    public boolean f3017J0;

    /* JADX INFO: renamed from: K */
    public VImage f3018K;

    /* JADX INFO: renamed from: K0 */
    public int f3019K0;

    /* JADX INFO: renamed from: L */
    public FeedRedDotView f3020L;

    /* JADX INFO: renamed from: L0 */
    public String f3021L0;

    /* JADX INFO: renamed from: M */
    public PopupWindow f3022M;

    /* JADX INFO: renamed from: O0 */
    public List<PutongFrag> f3027O0;

    /* JADX INFO: renamed from: P0 */
    public b0i f3029P0;

    /* JADX INFO: renamed from: Q0 */
    public String f3031Q0;

    /* JADX INFO: renamed from: R */
    public cwf0 f3032R;

    /* JADX INFO: renamed from: R0 */
    public String f3033R0;

    /* JADX INFO: renamed from: S */
    public cwf0 f3034S;

    /* JADX INFO: renamed from: S0 */
    public FriendsFeedContainerFrag f3035S0;

    /* JADX INFO: renamed from: T */
    public cwf0 f3036T;

    /* JADX INFO: renamed from: T0 */
    public FriendsFeedViewPagerFrag f3037T0;

    /* JADX INFO: renamed from: X */
    public String f3044X;

    /* JADX INFO: renamed from: Y */
    public int f3046Y;

    /* JADX INFO: renamed from: c1 */
    public Dialog f3052c1;

    /* JADX INFO: renamed from: d1 */
    @Nullable
    public C2135e f3053d1;

    /* JADX INFO: renamed from: g1 */
    public Runnable f3056g1;

    /* JADX INFO: renamed from: h1 */
    public xxg f3057h1;

    /* JADX INFO: renamed from: i1 */
    public String f3058i1;

    /* JADX INFO: renamed from: j1 */
    public String f3059j1;

    /* JADX INFO: renamed from: k0 */
    public long f3060k0;

    /* JADX INFO: renamed from: k1 */
    public long f3061k1;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f3063z;

    /* JADX INFO: renamed from: N */
    public cwf0 f3024N = new cwf0("p_discover_dating", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: O */
    public cwf0 f3026O = new cwf0("p_discover_discussion", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: P */
    public cwf0 f3028P = new cwf0("p_follow", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: Q */
    public cwf0 f3030Q = new cwf0("p_like", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: U */
    public vch f3038U = new wch();

    /* JADX INFO: renamed from: V */
    public e30<Intent> f3040V = xck0.a(400, new e30() { // from class: l.nz30
        public final void call(Object obj) {
            this.f10943a.m5239D7((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: W */
    public a<Boolean> f3042W = a.b();

    /* JADX INFO: renamed from: Z */
    public boolean f3048Z = true;

    /* JADX INFO: renamed from: p0 */
    public b<Long> f3062p0 = b.b();

    /* JADX INFO: renamed from: F0 */
    public ArrayList<j60> f3009F0 = new ArrayList<>();

    /* JADX INFO: renamed from: G0 */
    public boolean f3011G0 = !fm20.m10242v();

    /* JADX INFO: renamed from: H0 */
    public boolean f3013H0 = false;

    /* JADX INFO: renamed from: I0 */
    public int f3015I0 = 1;

    /* JADX INFO: renamed from: M0 */
    public boolean f3023M0 = false;

    /* JADX INFO: renamed from: N0 */
    public boolean f3025N0 = false;

    /* JADX INFO: renamed from: U0 */
    public l80<C2134d> f3039U0 = new C2131a();

    /* JADX INFO: renamed from: V0 */
    public C2132b f3041V0 = null;

    /* JADX INFO: renamed from: W0 */
    public List<String> f3043W0 = new ArrayList();

    /* JADX INFO: renamed from: X0 */
    public TextView[] f3045X0 = new TextView[4];

    /* JADX INFO: renamed from: Y0 */
    public VImage[] f3047Y0 = new VImage[1];

    /* JADX INFO: renamed from: Z0 */
    public TextView[] f3049Z0 = new TextView[4];

    /* JADX INFO: renamed from: a1 */
    public ImageView[] f3050a1 = new ImageView[4];

    /* JADX INFO: renamed from: b1 */
    public int f3051b1 = 0;

    /* JADX INFO: renamed from: e1 */
    public pv60 f3054e1 = new pv60();

    /* JADX INFO: renamed from: f1 */
    public boolean f3055f1 = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$a */
    public class C2131a extends l80<C2134d> {
        public C2131a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(C2134d c2134d, int i) {
            if (i == 1) {
                zvf0.x("e_tantan_topic", NewPhotoAlbumFrag.this.m5253L6());
            } else if (NullChecker.a(c2134d.f3072c)) {
                zvf0.z(c2134d.f3070a, c2134d.f3071b, c2134d.f3072c);
            } else {
                zvf0.x(c2134d.f3070a, c2134d.f3071b);
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(C2134d c2134d, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$b */
    public class C2132b extends FragmentPagerAdapter implements ViewPager.j, dyl {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f3065a;

        /* JADX INFO: renamed from: b */
        public Method f3066b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f3067c;

        public C2132b(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f3065a = new ArrayList();
            this.f3066b = null;
            this.f3067c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f3066b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.c(e);
                this.f3066b = null;
            } catch (SecurityException e2) {
                CrashHelper.c(e2);
                this.f3066b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ void m5413p(int i, TextView textView, VImage vImage, View view) {
            if (NewPhotoAlbumFrag.this.f3051b1 == i && (TextUtils.equals(fm20.m10237q(), textView.getText().toString()) || TextUtils.equals(fm20.m10228h(), textView.getText().toString()))) {
                boolean zEquals = TextUtils.equals(vImage.getTag().toString(), NewPhotoAlbumFrag.this.f3058i1);
                NewPhotoAlbumFrag newPhotoAlbumFrag = NewPhotoAlbumFrag.this;
                if (zEquals) {
                    vImage.setTag(newPhotoAlbumFrag.f3059j1);
                    vImage.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(f3c0.f7628I0));
                } else {
                    vImage.setTag(newPhotoAlbumFrag.f3058i1);
                    vImage.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(f3c0.f7636J0));
                }
                NewPhotoAlbumFrag.this.m5359Q7(view);
            }
            if (NewPhotoAlbumFrag.this.f3051b1 != i) {
                VNavigationTabLayout vNavigationTabLayout = NewPhotoAlbumFrag.this.f3010G;
                vNavigationTabLayout.D(vNavigationTabLayout.w(i));
            }
            NewPhotoAlbumFrag.this.m5399u6();
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: a */
        public Animator m5414a(int i, @NonNull @NotNull View view) {
            return (Animator) dyl.l0.call(view);
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: b */
        public Animator m5415b(int i, @NonNull @NotNull View view) {
            return (Animator) dyl.l0.call(view);
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> m5416g(int i) {
            return null;
        }

        public int getCount() {
            return this.f3065a.size();
        }

        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f3065a.get(i);
        }

        public CharSequence getPageTitle(int i) {
            return (CharSequence) NewPhotoAlbumFrag.this.f3043W0.get(i);
        }

        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.a(this.f3067c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f3067c.t0());
                    sb.append(";");
                    sb.append("lstFrag :" + this.f3065a);
                    du2.a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: m */
        public Fragment m5417m(int i) {
            Fragment fragmentI0;
            Method method = this.f3066b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentI0 = NewPhotoAlbumFrag.this.getChildFragmentManager().i0((String) method.invoke(this, Integer.valueOf(NewPhotoAlbumFrag.this.f3002A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.c(e);
                fragmentI0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.c(e2);
                fragmentI0 = null;
            }
            return fragmentI0 == null ? getItem(i) : fragmentI0;
        }

        /* JADX INFO: renamed from: n */
        public View m5418n(final int i) {
            View viewInflate = NewPhotoAlbumFrag.this.act().inflater().inflate(o6c0.f11338x5, (ViewGroup) null);
            final VImage vImageFindViewById = viewInflate.findViewById(b5c0.f5954D0);
            vImageFindViewById.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(f3c0.f7636J0));
            vImageFindViewById.setTag(NewPhotoAlbumFrag.this.f3058i1);
            if (!nkg.m12265t() && i == 0) {
                NewPhotoAlbumFrag.this.f3047Y0[0] = vImageFindViewById;
            }
            final TextView textView = (TextView) viewInflate.findViewById(b5c0.f6037d2);
            TextView textView2 = (TextView) viewInflate.findViewById(b5c0.f6041e2);
            NewPhotoAlbumFrag.this.f3045X0[i] = textView;
            NewPhotoAlbumFrag.this.f3049Z0[i] = textView2;
            NewPhotoAlbumFrag.this.f3050a1[i] = (ImageView) viewInflate.findViewById(b5c0.f6106y0);
            textView.setText((CharSequence) NewPhotoAlbumFrag.this.f3043W0.get(i));
            if (nkg.m12265t()) {
                return viewInflate;
            }
            xdl0.E0(textView, new View.OnClickListener() { // from class: l.h140
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8548a.m5413p(i, textView, vImageFindViewById, view);
                }
            });
            return viewInflate;
        }

        /* JADX INFO: renamed from: o */
        public final void m5419o() {
            VNavigationTabLayout.TabView tabView = NewPhotoAlbumFrag.this.f3010G.w(0).i;
            if (!nkg.m12265t()) {
                tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), t100.d(15.0f), tabView.getPaddingBottom());
                NewPhotoAlbumFrag.this.f3047Y0[0].setVisibility(0);
            }
            FeedModule.f316d.m16527Pb().mo15076c(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f3045X0[0]);
            FeedModule.f316d.m16527Pb().mo15086m(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f3045X0[1]);
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (nkg.m12268u0()) {
                m3i.m11762m().m11768l();
            }
            FeedModule.f316d.m16480J6();
            Fragment fragmentM5417m = NewPhotoAlbumFrag.this.f3041V0.m5417m(i);
            if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
                if (((PhotoAlbumFeedFrag) fragmentM5417m).m5442Q4()) {
                    FeedModule.m1140H().jg(NewPhotoAlbumFrag.this.act(), false);
                } else {
                    FeedModule.m1140H().Pq(NewPhotoAlbumFrag.this.act(), false);
                }
            } else if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
                if (((FriendsFeedContainerFrag) fragmentM5417m).m5122R4()) {
                    FeedModule.m1140H().jg(NewPhotoAlbumFrag.this.act(), false);
                } else {
                    FeedModule.m1140H().Pq(NewPhotoAlbumFrag.this.act(), false);
                }
            } else if ((fragmentM5417m instanceof FriendsFeedViewPagerFrag) && ((FriendsFeedViewPagerFrag) fragmentM5417m).m5180B5()) {
                FeedModule.m1140H().jg(NewPhotoAlbumFrag.this.act(), false);
            } else {
                FeedModule.m1140H().Pq(NewPhotoAlbumFrag.this.act(), false);
            }
            NewPhotoAlbumFrag.this.m5266P7();
            NewPhotoAlbumFrag.this.m5289X7();
            NewPhotoAlbumFrag.this.m5265P6();
            if (fm20.m10238r().equals(NewPhotoAlbumFrag.this.f3041V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag.m5386m6(newPhotoAlbumFrag.f3026O);
                NewPhotoAlbumFrag.this.m5354L7(fragmentM5417m);
            } else if (nkg.m12265t()) {
                if (fm20.m10236p().equals(NewPhotoAlbumFrag.this.m5347G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag2 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag2.m5386m6(newPhotoAlbumFrag2.f3024N);
                    NewPhotoAlbumFrag.this.m5354L7(fragmentM5417m);
                } else if (fm20.m10228h().equals(NewPhotoAlbumFrag.this.m5347G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag3 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag3.m5386m6(newPhotoAlbumFrag3.f3028P);
                } else if (fm20.m10229i().equals(NewPhotoAlbumFrag.this.m5347G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag4 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag4.m5386m6(newPhotoAlbumFrag4.f3030Q);
                }
            } else if (fm20.m10237q().equals(NewPhotoAlbumFrag.this.f3041V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag5 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag5.m5386m6(newPhotoAlbumFrag5.f3024N);
            } else if (fm20.m10228h().equals(NewPhotoAlbumFrag.this.f3041V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag6 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag6.m5386m6(newPhotoAlbumFrag6.f3028P);
            } else if (fm20.m10229i().equals(NewPhotoAlbumFrag.this.f3041V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag7 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag7.m5386m6(newPhotoAlbumFrag7.f3030Q);
            }
            if (NewPhotoAlbumFrag.this.f3011G0) {
                NewPhotoAlbumFrag.this.f3011G0 = false;
            } else {
                if (fm20.m10237q().equals(NewPhotoAlbumFrag.this.f3041V0.getPageTitle(NewPhotoAlbumFrag.this.f3051b1))) {
                    NewPhotoAlbumFrag.this.f3024N.g();
                } else if (fm20.m10228h().equals(NewPhotoAlbumFrag.this.f3041V0.getPageTitle(NewPhotoAlbumFrag.this.f3051b1))) {
                    NewPhotoAlbumFrag.this.f3028P.g();
                } else if (fm20.m10229i().equals(NewPhotoAlbumFrag.this.f3041V0.getPageTitle(NewPhotoAlbumFrag.this.f3051b1))) {
                    NewPhotoAlbumFrag.this.f3030Q.g();
                } else if (fm20.m10238r().equals(NewPhotoAlbumFrag.this.f3041V0.getPageTitle(NewPhotoAlbumFrag.this.f3051b1))) {
                    NewPhotoAlbumFrag.this.f3026O.g();
                }
                NewPhotoAlbumFrag.this.f3036T.r();
            }
            NewPhotoAlbumFrag.this.f3051b1 = i;
            NewPhotoAlbumFrag newPhotoAlbumFrag8 = NewPhotoAlbumFrag.this;
            newPhotoAlbumFrag8.f3020L.setPageId(newPhotoAlbumFrag8.m5342B6());
            PhotoAlbumPictureView.m4886u(NewPhotoAlbumFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (true) {
                if (i2 >= this.f3065a.size()) {
                    break;
                }
                Fragment fragmentM5417m2 = m5417m(i2);
                if (fragmentM5417m2 instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragmentM5417m2;
                    photoAlbumFeedFrag.m5460h5(i2 == i);
                    photoAlbumFeedFrag.m5459g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag.m5451Z4();
                    }
                } else if (fragmentM5417m2 instanceof FriendsFeedContainerFrag) {
                    FriendsFeedContainerFrag friendsFeedContainerFrag = (FriendsFeedContainerFrag) fragmentM5417m2;
                    friendsFeedContainerFrag.m5131a5(i2 == i);
                    friendsFeedContainerFrag.m5130Z4(i2 == i);
                    if (i2 == i) {
                        friendsFeedContainerFrag.m5127W4();
                    }
                } else if (fragmentM5417m2 instanceof FriendsFeedViewPagerFrag) {
                    FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = (FriendsFeedViewPagerFrag) fragmentM5417m2;
                    friendsFeedViewPagerFrag.m5199d6(i2 == i);
                    friendsFeedViewPagerFrag.m5198c6(i2 == i);
                    if (i2 == i) {
                        friendsFeedViewPagerFrag.m5192W5();
                    }
                }
                i2++;
            }
            NewPhotoAlbumFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f316d.f14963Y0.onNext(Boolean.FALSE);
            }
            NewPhotoAlbumFrag.this.m5399u6();
        }

        /* JADX INFO: renamed from: q */
        public void m5420q() {
            if (this.f3067c == null) {
                return;
            }
            Iterator<PutongFrag> it = this.f3065a.iterator();
            while (it.hasNext()) {
                this.f3067c.m().r(it.next()).j();
            }
        }

        /* JADX INFO: renamed from: r */
        public void m5421r(List<PutongFrag> list) {
            NewPhotoAlbumFrag.this.f3027O0 = list;
            this.f3065a.clear();
            if (NullChecker.b(list)) {
                this.f3065a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$c */
    public class C2133c implements VNavigationTabLayout.d {
        public C2133c() {
        }

        /* JADX INFO: renamed from: a */
        public void m5422a(VNavigationTabLayout.f fVar) {
            FeedModule.f316d.m16527Pb().mo15086m(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f3045X0[fVar.f()]);
        }

        /* JADX INFO: renamed from: b */
        public void m5423b(VNavigationTabLayout.f fVar) {
        }

        /* JADX INFO: renamed from: c */
        public void m5424c(VNavigationTabLayout.f fVar) {
            int iF = fVar.f();
            VNavigationTabLayout.TabView tabView = NewPhotoAlbumFrag.this.f3010G.w(0).i;
            if (!nkg.m12265t()) {
                if (iF == 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), t100.d(15.0f), tabView.getPaddingBottom());
                    NewPhotoAlbumFrag.this.f3047Y0[0].setVisibility(0);
                } else if (NewPhotoAlbumFrag.this.f3047Y0 != null && NewPhotoAlbumFrag.this.f3047Y0.length > 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                    NewPhotoAlbumFrag.this.f3047Y0[0].setVisibility(8);
                }
            }
            FeedModule.f316d.m16527Pb().mo15076c(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f3045X0[iF]);
            if (nkg.m12265t() && iF == 0) {
                if (fm20.m10228h().equals(NewPhotoAlbumFrag.this.m5347G6()) && iF != NewPhotoAlbumFrag.this.f3051b1 && !nkg.m12213K()) {
                    NewPhotoAlbumFrag.this.mo4810g2();
                    mwh.m12038d().m12049l(17);
                }
                if (fm20.m10236p().equals(NewPhotoAlbumFrag.this.m5347G6())) {
                    if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f3023M0) {
                        NewPhotoAlbumFrag.this.m5336x6();
                    } else if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f3025N0) {
                        NewPhotoAlbumFrag.this.m5405y6();
                    }
                    mwh.m12038d().m12049l(16);
                }
            } else if (!nkg.m12265t()) {
                if (fm20.m10228h().equals(NewPhotoAlbumFrag.this.f3045X0[iF].getText().toString()) && iF != NewPhotoAlbumFrag.this.f3051b1) {
                    mwh.m12038d().m12049l(17);
                }
                if (fm20.m10237q().equals(NewPhotoAlbumFrag.this.f3045X0[iF].getText().toString())) {
                    NewPhotoAlbumFrag.this.mo4810g2();
                    if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f3023M0) {
                        NewPhotoAlbumFrag.this.m5336x6();
                    }
                    mwh.m12038d().m12049l(16);
                }
            }
            if (!fm20.m10238r().equals(NewPhotoAlbumFrag.this.f3045X0[iF].getText().toString()) || iF == NewPhotoAlbumFrag.this.f3051b1) {
                return;
            }
            mwh.m12038d().m12049l(18);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$e */
    public class C2135e {

        /* JADX INFO: renamed from: a */
        public int f3074a;

        /* JADX INFO: renamed from: b */
        public int f3075b;

        /* JADX INFO: renamed from: c */
        public int f3076c;

        /* JADX INFO: renamed from: d */
        public int f3077d;

        /* JADX INFO: renamed from: e */
        public boolean f3078e;

        /* JADX INFO: renamed from: f */
        public boolean f3079f;

        /* JADX INFO: renamed from: g */
        public boolean f3080g;

        public C2135e(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
            this.f3075b = i;
            this.f3074a = i2;
            this.f3076c = i3;
            this.f3077d = i4;
            this.f3078e = z;
            this.f3079f = z2;
            this.f3080g = z3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2135e)) {
                return false;
            }
            C2135e c2135e = (C2135e) obj;
            return this.f3078e == c2135e.f3078e && this.f3074a == c2135e.f3074a && this.f3075b == c2135e.f3075b && this.f3076c == c2135e.f3076c && this.f3079f == c2135e.f3079f && this.f3080g == c2135e.f3080g;
        }

        public int hashCode() {
            int iHashCode = Integer.valueOf(this.f3074a).hashCode();
            int iHashCode2 = Integer.valueOf(this.f3076c).hashCode();
            int iHashCode3 = Boolean.valueOf(this.f3078e).hashCode();
            int iHashCode4 = Boolean.valueOf(this.f3079f).hashCode();
            return (Boolean.valueOf(this.f3080g).hashCode() >> 1) ^ ((((iHashCode >> 1) ^ iHashCode2) ^ iHashCode3) ^ (iHashCode4 >> 1));
        }

        public String toString() {
            return "unreadLikeFeeds:" + this.f3075b + "\nunreadFeeds:" + this.f3074a + "\nunreadActivities:" + this.f3076c + "\nisShowFixTimeDot:" + this.f3078e + "\nisShowTopicDot:" + this.f3079f + "\nisHideRedByNewUser:" + this.f3080g + "\n";
        }
    }

    static {
        f2997l1 = nkg.m12201B() ? fm20.m10232l() : 7200000L;
        f2998m1 = true;
        f2999n1 = new zpd0("last_like_show_red_dot_time_" + FeedModule.m1139F().userId(), 0L);
        f3000o1 = new tpd0("like_show_red_dot_count_" + FeedModule.m1139F().userId(), 0);
        f3001p1 = a.b();
    }

    public NewPhotoAlbumFrag() {
        if (NullChecker.b(FeedModule.f316d)) {
            je80.m11129b().m11130a();
            if (nkg.m12250l0()) {
                FeedModule.f316d.m16507Mc();
            }
        }
        this.f3056g1 = new Runnable() { // from class: l.yz30
            @Override // java.lang.Runnable
            public final void run() {
                this.f15533a.m5345E7();
            }
        };
        this.f3058i1 = "feed_dating_menu_icon_default";
        this.f3059j1 = "feed_dating_menu_icon";
        this.f3061k1 = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A7 */
    public /* synthetic */ void m5232A7(View view, String str, String str2, j760[] j760VarArr) {
        this.f3039U0.m11594h(view, new C2134d(str, str2, zvf0.b(j760VarArr)), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B7 */
    public /* synthetic */ void m5234B7(View view) {
        m5301b7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C7 */
    public /* synthetic */ void m5236C7(View view) {
        String strM5350I6 = m5350I6();
        int i = this.f3046Y;
        p6j0.m12912b("e_moment_unread_notes_history", strM5350I6, p6j0.C2456a.m12922g("moment_unread_red_dot_value", i > 99 ? "99+" : String.valueOf(i)));
        act().startActivity(PhotoAlbumActivitiesAct.m6071V1(act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: D6 */
    private int m5238D6() {
        List<String> list = this.f3043W0;
        if (list != null) {
            return list.indexOf(fm20.m10237q());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D7 */
    public /* synthetic */ void m5239D7(Intent intent) {
        act().startActivityForResult(intent, 786);
    }

    /* JADX INFO: renamed from: F6 */
    private int m5242F6() {
        List<String> list = this.f3043W0;
        if (list != null) {
            return list.indexOf(getString(R$string.f533h5));
        }
        return 0;
    }

    /* JADX INFO: renamed from: H6 */
    private int m5245H6() {
        if (this.f3055f1) {
            this.f3055f1 = false;
            return 0;
        }
        String strM10231k = fm20.m10231k();
        if (TextUtils.equals(strM10231k, fm20.m10229i())) {
            return 0;
        }
        return this.f3043W0.indexOf(strM10231k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I7, reason: merged with bridge method [inline-methods] */
    public void m5378h7(int i) {
        this.f3049Z0[i].setVisibility(8);
        this.f3050a1[i].setVisibility(8);
    }

    /* JADX INFO: renamed from: K6 */
    private int m5250K6() {
        if (!NullChecker.b(this.f3010G)) {
            return 16;
        }
        int selectedTabPosition = this.f3010G.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            return fm20.m10237q().equals(this.f3041V0.getPageTitle(selectedTabPosition)) ? 16 : 17;
        }
        return 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K7, reason: merged with bridge method [inline-methods] */
    public void m5377g7(int i) {
        this.f3049Z0[i].setVisibility(8);
        this.f3050a1[i].setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L6 */
    public String m5253L6() {
        if (!NullChecker.b(this.f3010G)) {
            return "p_discover_dating";
        }
        int selectedTabPosition = this.f3010G.getSelectedTabPosition();
        if (selectedTabPosition != 0) {
            return "p_discover_discussion";
        }
        if (nkg.m12265t()) {
            return m5347G6().equals(getString(R$string.f533h5)) ? "p_follow" : "p_discover_dating";
        }
        return fm20.m10237q().equals(this.f3041V0.getPageTitle(selectedTabPosition)) ? "p_discover_dating" : "p_follow";
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m5254M4() {
    }

    @NotNull
    /* JADX INFO: renamed from: M6 */
    private String m5256M6() {
        return fm20.m10228h().equals(this.f3041V0.getPageTitle(this.f3002A.getCurrentItem())) ? "follow" : "other";
    }

    /* JADX INFO: renamed from: M7 */
    private void m5257M7() {
        Fragment fragmentM5417m = this.f3041V0.m5417m(this.f3051b1);
        if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM5417m).m5452a5();
        } else if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM5417m).m5128X4();
        } else if (fragmentM5417m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM5417m).m5194Y5();
        }
    }

    /* JADX INFO: renamed from: O6 */
    private void m5262O6() {
        if (m5292Y6()) {
            d.l().k(this.f3021L0);
            this.f3021L0 = null;
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m5263P4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P6 */
    public void m5265P6() {
        Fragment fragmentM5417m = this.f3041V0.m5417m(this.f3051b1);
        if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM5417m).m5447V4();
        } else if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM5417m).m5123S4();
        } else if (fragmentM5417m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM5417m).m5182G5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P7 */
    public void m5266P7() {
        Fragment fragmentM5417m = this.f3041V0.m5417m(this.f3051b1);
        if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM5417m).m5453b5();
        } else if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM5417m).m5129Y4();
        } else if (fragmentM5417m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM5417m).m5195Z5();
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m5269R4(Throwable th) {
    }

    /* JADX INFO: renamed from: S6 */
    private void m5273S6() {
        if (nkg.m12213K()) {
            duringCreated(f3001p1).subscribe(mkd0.G(new e30() { // from class: l.f140
                public final void call(Object obj) {
                    this.f7513a.m5402w7((Boolean) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.xz30
            public final Object call() {
                return this.f15183a.m5403x7();
            }
        }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.zz30
            public final void call(Object obj) {
                this.f15967a.m5382j7((NewPhotoAlbumFrag.C2135e) obj);
            }
        }, new e30() { // from class: l.a040
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m5269R4((Throwable) obj);
            }
        }));
        duringCreated(FeedModule.f316d.m16453F7()).filter(new w9j() { // from class: l.b040
            public final Object call(Object obj) {
                return Boolean.valueOf(((Double) obj).doubleValue() > 0.0d);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.c040
            public final void call(Object obj) {
                this.f6478a.m5384k7((Double) obj);
            }
        }));
        duringCreated(oe40.m12541F()).subscribe(mkd0.G(new e30() { // from class: l.d040
            public final void call(Object obj) {
                this.f6762a.m5385l7((Moment) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.e040
            public final Object call(Object obj) {
                return this.f7094a.m5387m7((c) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.f040
            public final void call(Object obj) {
                FeedModule.f316d.f14963Y0.onNext(Boolean.TRUE);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.g040
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.g140
            public final void call(Object obj) {
                this.f8295a.m5388n7((c) obj);
            }
        }));
        if (wc40.f()) {
            creates(new e30() { // from class: l.oz30
                public final void call(Object obj) {
                    this.f11650a.m5390o7((Bundle) obj);
                }
            });
        }
        duringCreated(kjb0.m11464p()).subscribe(mkd0.G(new e30() { // from class: l.pz30
            public final void call(Object obj) {
                this.f12029a.m5392p7((Boolean) obj);
            }
        }));
        duringCreated(C2089a.m3721c1()).subscribe(mkd0.G(new e30() { // from class: l.qz30
            public final void call(Object obj) {
                this.f12420a.m5393q7((String) obj);
            }
        }));
        if (this.f3048Z) {
            creates(new e30() { // from class: l.rz30
                public final void call(Object obj) {
                    this.f12760a.m5398t7((Bundle) obj);
                }
            });
            duringCreated(this.f3062p0).subscribe(mkd0.H(new e30() { // from class: l.sz30
                public final void call(Object obj) {
                    this.f13134a.m5400u7((Long) obj);
                }
            }, new e30() { // from class: l.tz30
                public final void call(Object obj) {
                    NewPhotoAlbumFrag.m5299b5((Throwable) obj);
                }
            }));
        }
        act().lifecycle().subscribe(mkd0.G(new e30() { // from class: l.uz30
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m5294Z4((c) obj);
            }
        }));
        duringCreated(fm20.f8151b).subscribe(mkd0.H(new e30() { // from class: l.vz30
            public final void call(Object obj) {
                this.f14335a.m5401v7((roj0) obj);
            }
        }, new e30() { // from class: l.wz30
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m5333w5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    private void m5276T6(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.t040
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13140a.m5406y7(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.v040
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f14005a.m5407z7(view2);
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    private boolean m5277T7() {
        long jLongValue = FeedModule.f316d.m16777z7().longValue();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 4, 0, 0);
        return i >= 4 && jLongValue < calendar2.getTimeInMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView] */
    /* JADX INFO: renamed from: U6 */
    private void m5280U6() {
        this.f3012H = new VFrame(getContext());
        this.f3016J = new VFrame(getContext());
        View vText = new VText(getContext());
        this.f3014I = vText;
        this.f3012H.addView(vText, new FrameLayout.LayoutParams(-2, t100.d(34.0f)));
        this.f3014I.setText(R$string.f360G1);
        this.f3014I.setTextSize(14.0f);
        this.f3014I.setTextColor(-1);
        this.f3014I.setTypeface(eqh0.c(3), 1);
        this.f3014I.setPadding(t100.d(12.0f), 0, t100.d(12.0f), 0);
        this.f3014I.setBackgroundResource(f3c0.f7889q5);
        this.f3014I.setGravity(16);
        View vImage = new VImage(getContext());
        this.f3018K = vImage;
        this.f3016J.addView(vImage, new FrameLayout.LayoutParams(t100.d(32.0f), t100.d(32.0f)));
        this.f3018K.setImageResource(f3c0.f7895r3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(12.0f), t100.d(12.0f));
        layoutParams.gravity = 53;
        layoutParams.rightMargin = -t100.d(2.0f);
        layoutParams.topMargin = -t100.d(2.0f);
        ?? feedRedDotView = new FeedRedDotView(getContext());
        this.f3020L = feedRedDotView;
        this.f3016J.addView(feedRedDotView, layoutParams);
        this.f3020L.setOvalColor(getResources().getColor(e1c0.f7156o));
        this.f3020L.setWidth(t100.d(12.0f));
        this.f3020L.setRingWidth(t100.d(2.0f));
        this.f3020L.setRingColor(getResources().getColor(e1c0.f7159p0));
        this.f3020L.setRedPointType(2);
        this.f3020L.setPageId(m5342B6());
        this.f3020L.m6158o();
        xdl0.M(this.f3020L, false);
        xdl0.M(this.f3005D, true);
    }

    /* JADX INFO: renamed from: W6 */
    private boolean m5285W6() {
        return vqg.m15522j0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W7, reason: merged with bridge method [inline-methods] */
    public void m5345E7() {
        if (isHidden() || cjh.m9192b()) {
            return;
        }
        fm20.f8154e.put(Long.valueOf(System.currentTimeMillis()));
        if (!u2h.m14717b() || ic50.j().f().M("p_alert_positioning_authority_explore_popup", true)) {
            if (u2h.m14717b()) {
                ic50.j().f().b0("p_alert_positioning_authority_explore_popup", 0, true);
            }
            FeedModule.m1140H().showLocationPermissionCallbackDlg(act(), new d30() { // from class: l.o040
                public final void call() {
                    this.f10962a.m5348G7();
                }
            }, (d30) null, false, true, "p_alert_positioning_authority_explore_popup");
        }
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m5287X4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X7 */
    public void m5289X7() {
        Fragment fragmentM5417m = this.f3041V0.m5417m(this.f3051b1);
        if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM5417m).m5132b5();
        } else if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM5417m).m5463m5();
        } else if (fragmentM5417m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM5417m).m5200e6();
        }
    }

    /* JADX INFO: renamed from: Y6 */
    private boolean m5292Y6() {
        return !TextUtils.isEmpty(this.f3021L0);
    }

    /* JADX INFO: renamed from: Y7 */
    private void m5293Y7() {
        String strM5350I6 = m5350I6();
        int i = this.f3046Y;
        p6j0.m12914d("e_moment_unread_notes_history", strM5350I6, p6j0.C2456a.m12922g("moment_unread_red_dot_value", i > 99 ? "99+" : String.valueOf(i)));
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m5294Z4(c cVar) {
        if (cVar == c.m) {
            FeedModule.f319g.m10117c();
            n7c.m12098e().m12104g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z7, reason: merged with bridge method [inline-methods] */
    public rx.c<C2135e> m5403x7() {
        FeedModule.f316d.m16591Yc("");
        return mkd0.t(ijb0.m10923j(), rx.c.just(Boolean.FALSE), FeedModule.f316d.m16453F7(), FeedModule.m1140H().isHideRedByNewUser(), new z9j() { // from class: l.s040
            /* JADX INFO: renamed from: b */
            public final Object m13975b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f12766a.m5349H7((Counter) obj, (Boolean) obj2, (Double) obj3, (Boolean) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m5299b5(Throwable th) {
    }

    /* JADX INFO: renamed from: b7 */
    private void m5301b7() {
        vqg.m15484J0(act());
        this.f3020L.m6157k();
        zvf0.r("e_tantan_topic", m5253L6());
        xdl0.M(this.f3020L, false);
        FeedModule.f316d.m16752vd();
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m5316k5(Act.r rVar) {
        if (NullChecker.a(rVar)) {
            FeedModule.f314b.m1417I2();
        }
    }

    /* JADX INFO: renamed from: l6 */
    private boolean m5318l6(int i) {
        if (i < 10) {
            return false;
        }
        return ((Long) fm20.f8153d.get()).longValue() == 0 || !a5i.m8406f(((Long) fm20.f8153d.get()).longValue(), mqi0.o());
    }

    /* JADX INFO: renamed from: n6 */
    private void m5321n6(boolean z) {
        C2132b c2132b;
        if (z || (c2132b = this.f3041V0) == null) {
            FeedModule.m1140H().Pq(act(), false);
            return;
        }
        Fragment fragmentM5417m = c2132b.m5417m(this.f3051b1);
        if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
            if (((PhotoAlbumFeedFrag) fragmentM5417m).m5442Q4()) {
                FeedModule.m1140H().jg(act(), false);
                return;
            }
        } else if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
            if (((FriendsFeedContainerFrag) fragmentM5417m).m5122R4()) {
                FeedModule.m1140H().jg(act(), false);
                return;
            }
        } else if ((fragmentM5417m instanceof FriendsFeedViewPagerFrag) && ((FriendsFeedViewPagerFrag) fragmentM5417m).m5180B5()) {
            FeedModule.m1140H().jg(act(), false);
            return;
        }
        FeedModule.m1140H().Pq(act(), false);
    }

    /* JADX INFO: renamed from: q6 */
    private boolean m5325q6() {
        this.f3023M0 = true;
        e51.J(this.f3056g1);
        if (this.f3051b1 == m5238D6()) {
            return m5336x6();
        }
        return false;
    }

    /* JADX INFO: renamed from: r6 */
    private void m5327r6(final int i) {
        if (m5238D6() >= 0 || m5242F6() >= 0) {
            if (NullChecker.a(this.f3037T0)) {
                this.f3037T0.duringCreated(lifecycle()).take(1).subscribe(mkd0.G(new e30() { // from class: l.c140
                    public final void call(Object obj) {
                        this.f6484a.m5375f7(i, (c) obj);
                    }
                }));
            }
            final int i2 = 0;
            boolean z = this.f3050a1[0].getVisibility() == 0;
            lwh lwhVar = new lwh(i > 0, new d30() { // from class: l.d140
                public final void call() {
                    this.f6769a.m5377g7(i2);
                }
            });
            lwhVar.m11712b(new lwh(true, new d30() { // from class: l.e140
                public final void call() {
                    this.f7099a.m5378h7(i2);
                }
            }));
            lwhVar.m11711a();
            m5334w6(xdl0.O0(this.f3050a1[0]) ? this.f3050a1[0] : this.f3049Z0[0], z, this.f3050a1[0].getVisibility() == 0, m5250K6(), m5352J6());
        }
    }

    /* JADX INFO: renamed from: v6 */
    private void m5332v6() {
        if (nkg.m12250l0()) {
            Fragment fragmentM5417m = this.f3041V0.m5417m(this.f3051b1);
            if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
                ((PhotoAlbumFeedFrag) fragmentM5417m).m5441P4();
            } else if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
                ((FriendsFeedContainerFrag) fragmentM5417m).m5120P4();
            } else if (fragmentM5417m instanceof FriendsFeedViewPagerFrag) {
                ((FriendsFeedViewPagerFrag) fragmentM5417m).m5210s5();
            }
        }
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m5333w5(Throwable th) {
    }

    /* JADX INFO: renamed from: w6 */
    private void m5334w6(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                mwh.m12038d().m12056s(Integer.valueOf(i));
            } else {
                mwh.m12038d().m12053p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public boolean m5336x6() {
        this.f3023M0 = false;
        if (System.currentTimeMillis() - ((Long) fm20.f8154e.get()).longValue() < 172800000 || cjh.m9194d()) {
            return false;
        }
        e51.I(this, this.f3056g1, 100L);
        return true;
    }

    /* JADX INFO: renamed from: z6 */
    private void m5339z6(View view, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        if ((z2 ^ z) || z4) {
            if (!z || z4) {
                this.f3015I0 = mwh.m12038d().m12048k(view, i, z3, z4, m5253L6(), m5362S7());
            } else {
                mwh.m12038d().m12056s(1);
            }
        }
    }

    /* JADX INFO: renamed from: A6 */
    public final void m5340A6() {
        m5293Y7();
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m5341B4() {
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public String m5342B6() {
        if (!nkg.m12265t()) {
            if (fm20.m10242v()) {
                return (NullChecker.a(this.f3045X0[0]) && this.f3045X0[0].getText().equals(getString(R$string.f533h5))) ? "p_follow" : "p_discover_dating";
            }
            return "p_discover_discussion";
        }
        if (!fm20.m10242v()) {
            return "p_discover_discussion";
        }
        if (m5347G6().equals(getString(R$string.f533h5))) {
            return "p_follow";
        }
        return m5347G6().equals(fm20.m10229i()) ? "p_like" : "p_discover_dating";
    }

    /* JADX INFO: renamed from: C6 */
    public String m5343C6() {
        cwf0 cwf0Var = this.f3036T;
        if (cwf0Var == this.f3028P) {
            return "p_follow";
        }
        if (cwf0Var == this.f3030Q) {
            return "p_like";
        }
        if (cwf0Var == this.f3026O) {
            return "p_discover_discussion";
        }
        if (cwf0Var == this.f3024N) {
            return "p_discover_dating";
        }
        if (cwf0Var == this.f3032R) {
            return fm20.m10223c(0);
        }
        return cwf0Var == this.f3034S ? fm20.m10223c(1) : "";
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC2259b
    /* JADX INFO: renamed from: E0 */
    public void mo4767E0() {
        e51.J(this.f3056g1);
    }

    /* JADX INFO: renamed from: E6 */
    public int m5344E6(int i) {
        if (i == 14 || i == 0 || i == 17 || i == 18) {
            return 0;
        }
        return i == 15 ? 1 : -1;
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m5346F7() {
        boolean zEquals = TextUtils.equals(this.f3047Y0[0].getTag().toString(), this.f3058i1);
        View[] viewArr = this.f3047Y0;
        if (zEquals) {
            viewArr[0].setTag(this.f3059j1);
            this.f3047Y0[0].setBackgroundDrawable(getResources().getDrawable(f3c0.f7628I0));
        } else {
            viewArr[0].setTag(this.f3058i1);
            this.f3047Y0[0].setBackgroundDrawable(getResources().getDrawable(f3c0.f7636J0));
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final String m5347G6() {
        FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = this.f3037T0;
        return friendsFeedViewPagerFrag == null ? fm20.m10236p() : friendsFeedViewPagerFrag.m5214x5().toString();
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ C2135e m5349H7(Counter counter, Boolean bool, Double d, Boolean bool2) {
        int i = vqg.m15523k() ? counter.moments.unreadLikeFeeds : 0;
        int i2 = counter.moments.unreadFeeds;
        CounterActivities counterActivities = counter.activities;
        return new C2135e(i, i2, counterActivities.unread, counterActivities.unreadPicks, bool.booleanValue(), d.doubleValue() > 0.0d, bool2.booleanValue());
    }

    /* JADX INFO: renamed from: I6 */
    public final String m5350I6() {
        return (nkg.m12213K() && TextUtils.equals(fm20.m10231k(), fm20.m10229i())) ? "p_like" : m5342B6();
    }

    /* JADX INFO: renamed from: J4 */
    public cwf0 m5351J4() {
        return NullChecker.a(this.f3036T) ? this.f3036T : super.J4();
    }

    /* JADX INFO: renamed from: J6 */
    public final String m5352J6() {
        if (NullChecker.b(this.f3010G)) {
            this.f3010G.getSelectedTabPosition();
        }
        return null;
    }

    /* JADX INFO: renamed from: J7, reason: merged with bridge method [inline-methods] */
    public void m5348G7() {
        Fragment fragmentM5417m = this.f3041V0.m5417m(this.f3051b1);
        if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM5417m).m5450Y4();
        } else if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM5417m).m5126V4();
        } else if (fragmentM5417m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM5417m).m5190T5();
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final void m5354L7(Fragment fragment) {
        hx60 hx60Var;
        if (nkg.m12201B()) {
            if (fragment instanceof PhotoAlbumFeedFrag) {
                PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragment;
                hx60 hx60Var2 = photoAlbumFeedFrag.m5444S4().f6851j;
                if (hx60Var2 == null) {
                    return;
                }
                long j = hx60Var2.f8834a;
                if (j <= 0 || System.currentTimeMillis() - j <= fm20.m10232l()) {
                    return;
                }
                photoAlbumFeedFrag.m5450Y4();
                return;
            }
            if ((fragment instanceof FriendsFeedViewPagerFrag) && fm20.m10236p().equals(m5347G6())) {
                FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = (FriendsFeedViewPagerFrag) fragment;
                PhotoAlbumFeedFrag photoAlbumFeedFragM5178A5 = friendsFeedViewPagerFrag.m5178A5();
                if (!NullChecker.a(photoAlbumFeedFragM5178A5) || (hx60Var = photoAlbumFeedFragM5178A5.m5444S4().f6851j) == null) {
                    return;
                }
                long j2 = hx60Var.f8834a;
                if (j2 <= 0 || System.currentTimeMillis() - j2 <= fm20.m10232l()) {
                    return;
                }
                friendsFeedViewPagerFrag.m5178A5().m5450Y4();
            }
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final int m5355N6(C2135e c2135e) {
        int i;
        if (nkg.m12213K()) {
            return c2135e.f3075b;
        }
        int i2 = c2135e.f3074a;
        return (i2 != 0 || (i = this.f3019K0) <= 0) ? i2 : i;
    }

    /* JADX INFO: renamed from: N7 */
    public final void m5356N7() {
        if (nkg.m12265t()) {
            if (this.f3037T0.m5180B5()) {
                FeedModule.m1140H().jg(act(), false);
                return;
            } else {
                FeedModule.m1140H().Pq(act(), false);
                return;
            }
        }
        if (this.f3035S0.m5122R4()) {
            FeedModule.m1140H().jg(act(), false);
        } else {
            FeedModule.m1140H().Pq(act(), false);
        }
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: O0 */
    public void mo4779O0(String str, boolean z) {
        if (m5367Y() == null) {
            return;
        }
        if (nkg.m12213K() && z && TabName.Moment.toString().equals(this.f3007E0) && m5367Y() == this.f3037T0 && m5362S7()) {
            this.f3061k1 = System.currentTimeMillis();
        }
        String str2 = FeedModule.f316d.f14929I1;
        TabName tabName = TabName.Moment;
        if (tabName.toString().equals(str) && !tabName.toString().equals(this.f3007E0) && z && (((nkg.m12265t() && m5367Y() == this.f3037T0) || m5367Y() == this.f3035S0) && (TextUtils.equals(str2, "follow") || TextUtils.equals(str2, "like")))) {
            n7c.m12098e().m12102d();
        }
        if (FeedModule.m1140H().Md() && FeedModule.m1140H().nd() && tabName.toString().equals(str) && !tabName.toString().equals(this.f3007E0)) {
            FeedModule.m1140H().Vr();
            p6j0.m12912b("e_leadtocommunity", "p_suggest_users_home_view", p6j0.C2456a.m12922g("leadtocommunity_uid", FeedModule.m1140H().qp()), p6j0.C2456a.m12921f("leadtocommunity_reason", FeedModule.m1140H().Id()));
            mo4819j1(14);
            n7c.m12098e().m12102d();
            e51.I(this, new Runnable() { // from class: l.r040
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12440a.m5348G7();
                }
            }, 100L);
        }
        this.f3007E0 = str;
    }

    /* JADX INFO: renamed from: O7 */
    public final void m5357O7() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        List listT0 = childFragmentManager.t0();
        if (vwb.J(listT0)) {
            return;
        }
        k kVarM = childFragmentManager.m();
        Iterator it = listT0.iterator();
        while (it.hasNext()) {
            kVarM.r((Fragment) it.next());
        }
        kVarM.j();
        childFragmentManager.e0();
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: P0 */
    public boolean mo4781P0() {
        Fragment fragmentM5417m = this.f3041V0.m5417m(this.f3051b1);
        if (fragmentM5417m instanceof FriendsFeedContainerFrag) {
            return ((FriendsFeedContainerFrag) fragmentM5417m).m5119P0();
        }
        if (fragmentM5417m instanceof PhotoAlbumFeedFrag) {
            return ((PhotoAlbumFeedFrag) fragmentM5417m).m5440P0();
        }
        if (fragmentM5417m instanceof FriendsFeedViewPagerFrag) {
            return ((FriendsFeedViewPagerFrag) fragmentM5417m).m5187P0();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q6 */
    public final void m5358Q6(C2135e c2135e) {
        int i = c2135e.f3074a;
        if (i <= 0 || this.f3017J0) {
            return;
        }
        this.f3019K0 = i;
    }

    /* JADX INFO: renamed from: Q7 */
    public final void m5359Q7(View view) {
        xxg xxgVar = this.f3057h1;
        if (xxgVar != null && xxgVar.isShowing()) {
            this.f3057h1.dismiss();
            return;
        }
        xxg xxgVar2 = new xxg(this, act());
        this.f3057h1 = xxgVar2;
        VImage[] vImageArr = this.f3047Y0;
        if (vImageArr != null && vImageArr.length > 0) {
            xxgVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.a140
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f5547a.m5346F7();
                }
            });
        }
        ed80.c(this.f3057h1, view, 0, 0, 80);
    }

    /* JADX INFO: renamed from: R6 */
    public final void m5360R6(int i, PutongFrag putongFrag) {
        if (i < 0) {
            return;
        }
        this.f3002A.setCurrentItem(i);
        Fragment fragment = this.f3027O0.get(i);
        if (fragment instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragment).m5446U4().m8725j0();
            return;
        }
        if (putongFrag != null) {
            if (putongFrag instanceof FriendsFeedContainerFrag) {
                ((FriendsFeedContainerFrag) putongFrag).m5125U4();
            } else if (putongFrag instanceof FriendsFeedViewPagerFrag) {
                ((FriendsFeedViewPagerFrag) putongFrag).m5184J5();
            }
        }
    }

    /* JADX INFO: renamed from: R7 */
    public final void m5361R7(C2135e c2135e) {
        boolean z;
        if (c2135e == null) {
            return;
        }
        this.f3053d1 = c2135e;
        if (!FriendsFeedViewPagerFrag.f2958J0 && nkg.m12213K()) {
            this.f3053d1.f3075b = 0;
        }
        m5327r6(m5355N6(c2135e));
        if (c2135e.f3078e) {
            FeedModule.f316d.m16745ud(Calendar.getInstance().getTimeInMillis());
        }
        boolean z2 = c2135e.f3076c > 0 && !m5285W6();
        if (z2) {
            kjb0.m11438B(act(), c2135e.f3076c);
        } else {
            kjb0.m11438B(act(), -1);
        }
        boolean z3 = !z2 && ((m5355N6(c2135e) > 0) || c2135e.f3078e || (!c2135e.f3080g && m5369a7(c2135e))) && !m5285W6();
        boolean z4 = z2;
        boolean z5 = this.f3013H0;
        if (z4) {
            m5339z6(null, z5, false, m5355N6(c2135e), m5369a7(c2135e), true);
            kjb0.m11437A(act(), false);
            z = z3;
        } else {
            z = z3;
            m5339z6(null, z5, z, m5355N6(c2135e), m5369a7(c2135e), false);
            kjb0.m11437A(act(), z);
        }
        this.f3013H0 = z;
    }

    /* JADX INFO: renamed from: S7 */
    public final boolean m5362S7() {
        FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = this.f3037T0;
        return friendsFeedViewPagerFrag == null ? !nkg.m12213K() : friendsFeedViewPagerFrag.m5208q5();
    }

    /* JADX INFO: renamed from: U7 */
    public final void m5363U7(int i, int i2) {
        if (f2998m1) {
            return;
        }
        String str = "这里有" + ((Object) this.f3008F.getText()) + "条消息在等你回复～";
        if (flg.m10123e(i)) {
            p6j0.m12914d("e_moment_unread_notes_bubble", m5342B6(), new p6j0.C2456a[0]);
            str = "大量互动消息正在等待你的回应";
        } else if (m5383k6(i2)) {
            fm20.f8156g.put(Long.valueOf(mqi0.o()));
            str = i2 + "位女生通过动态喜欢了你";
        } else if (!m5318l6(i)) {
            return;
        } else {
            fm20.f8153d.put(Long.valueOf(mqi0.o()));
        }
        this.f3031Q0 = d.l().t(new com.p1.mobile.android.ui.bubble.a(act()).D(str).k(new int[]{act().getResources().getColor(e1c0.f7154n)}).J(13.0f).z(t100.d(10.0f)).E(true).b(TextUtils.equals("大量互动消息正在等待你的回应", str) ? 5000L : 3000L).q(com.p1.mobile.android.ui.bubble.a.Q | com.p1.mobile.android.ui.bubble.a.P).o(com.p1.mobile.android.ui.bubble.a.P, t100.d(6.0f)).x(t100.d(2.0f)), this.f3005D);
    }

    /* JADX INFO: renamed from: V6 */
    public boolean m5364V6() {
        return m5238D6() == this.f3051b1 || m5242F6() == this.f3051b1;
    }

    /* JADX INFO: renamed from: V7 */
    public final void m5365V7() {
    }

    /* JADX INFO: renamed from: X6 */
    public final Boolean m5366X6() {
        if (!nkg.m12250l0()) {
            return Boolean.FALSE;
        }
        long jLongValue = ((Long) FeedModule.f316d.f14917D1.get()).longValue();
        return (jLongValue <= 0 || a5i.m8409i((double) jLongValue)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Y */
    public Frag m5367Y() {
        DiscoveryPager discoveryPager;
        C2132b c2132b = this.f3041V0;
        if (c2132b == null || (discoveryPager = this.f3002A) == null) {
            return null;
        }
        return c2132b.m5417m(discoveryPager.getCurrentItem());
    }

    /* JADX INFO: renamed from: Z6 */
    public final boolean m5368Z6() {
        if (((Boolean) fm20.f8152c.get()).booleanValue()) {
            return NullChecker.a(this.f3021L0) && d.l().x(this.f3021L0);
        }
        return true;
    }

    /* JADX INFO: renamed from: a7 */
    public final boolean m5369a7(C2135e c2135e) {
        return c2135e.f3079f;
    }

    /* JADX INFO: renamed from: a8 */
    public final void m5370a8(int i, int i2) {
        this.f3046Y = i;
        ImageView imageView = this.f3006E;
        if (i > 0) {
            imageView.setImageResource(f3c0.f7679P0);
            xdl0.M(this.f3008F, true);
            VText vText = this.f3008F;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
        } else {
            imageView.setImageResource(f3c0.f7672O0);
            xdl0.M(this.f3008F, false);
        }
        m5363U7(i, i2);
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m5372d7(d30 d30Var, Throwable th) {
        m5371c7(null, d30Var);
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m5373e7(final lwh lwhVar) {
        Objects.requireNonNull(lwhVar);
        m5389o6(new d30() { // from class: l.w040
            public final void call() {
                lwhVar.m11711a();
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public void m5374f4() {
        super.f4();
        m5273S6();
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m5375f7(int i, c cVar) {
        this.f3037T0.m5209r5(i);
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: g2 */
    public void mo4810g2() {
        if (nkg.m12213K() && this.f3051b1 == 0) {
            m5361R7(this.f3053d1);
            return;
        }
        if (this.f3017J0 || this.f3019K0 <= 0 || !NullChecker.a(this.f3053d1)) {
            return;
        }
        this.f3017J0 = true;
        this.f3019K0 = 0;
        m5361R7(this.f3053d1);
    }

    /* JADX INFO: renamed from: g4 */
    public void m5376g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        mwh.m12038d().m12060w(new mwh.InterfaceC2432a() { // from class: l.j040
            @Override // p007l.mwh.InterfaceC2432a
            /* JADX INFO: renamed from: a */
            public final void mo11060a(View view, String str, String str2, j760[] j760VarArr) {
                this.f9169a.m5232A7(view, str, str2, j760VarArr);
            }
        });
        m5280U6();
        this.f3043W0.add(0, fm20.m10237q());
        this.f3043W0.add(1, fm20.m10238r());
        ArrayList arrayList = new ArrayList();
        m5357O7();
        FriendsFeedContainerFrag friendsFeedContainerFragM5115M4 = FriendsFeedContainerFrag.m5115M4(FeedModule.m1139F().userId());
        n7c.m12098e().m12106i(this);
        this.f3035S0 = friendsFeedContainerFragM5115M4;
        PhotoAlbumFeedFrag photoAlbumFeedFragM5434M4 = PhotoAlbumFeedFrag.m5434M4(FeedModule.m1139F().userId(), "from_discover_discussion", -1, User.ID_TEAM_ACCOUNT, 15);
        if (nkg.m12265t()) {
            FriendsFeedViewPagerFrag friendsFeedViewPagerFragM5174n5 = FriendsFeedViewPagerFrag.m5174n5();
            this.f3037T0 = friendsFeedViewPagerFragM5174n5;
            arrayList.add(friendsFeedViewPagerFragM5174n5);
        } else {
            arrayList.add(friendsFeedContainerFragM5115M4);
        }
        arrayList.add(photoAlbumFeedFragM5434M4);
        this.f3041V0.m5421r(arrayList);
        this.f3063z.setTag("photo_album_root");
        this.f3002A.setOnPageChangeListener(this.f3041V0);
        this.f3002A.setAdapter(this.f3041V0);
        this.f3004C.setBackgroundColor(act().getResources().getColor(e1c0.f7159p0));
        this.f3004C.setupViewPager(this.f3002A);
        this.f3010G = this.f3004C.getTabLayout();
        this.f3004C.setRightIconViews(new View[]{this.f3016J, this.f3012H});
        xdl0.Z(new View[]{this.f3004C});
        this.f3039U0.m11594h(this.f3063z, new C2134d(), 1);
        xdl0.M(this.f3016J, true);
        xdl0.E0(this.f3016J, new View.OnClickListener() { // from class: l.u040
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13482a.m5234B7(view);
            }
        });
        int i = 0;
        while (i < this.f3010G.getTabCount()) {
            View viewM5418n = this.f3041V0.m5418n(i);
            VNavigationTabLayout.f fVarW = this.f3010G.w(i);
            Objects.requireNonNull(fVarW);
            fVarW.n(viewM5418n);
            VNavigationTabLayout.f fVarW2 = this.f3010G.w(i);
            Objects.requireNonNull(fVarW2);
            VNavigationTabLayout.TabView tabView = fVarW2.i;
            int iD = i == 0 ? t100.d(4.0f) : 0;
            VNavigationTabLayout.f fVarW3 = this.f3010G.w(i);
            Objects.requireNonNull(fVarW3);
            int paddingTop = fVarW3.i.getPaddingTop();
            VNavigationTabLayout.f fVarW4 = this.f3010G.w(i);
            Objects.requireNonNull(fVarW4);
            tabView.setPadding(iD, paddingTop, 0, fVarW4.i.getPaddingBottom());
            i++;
        }
        this.f3010G.setOnTabSelectedListener(new C2133c());
        this.f3041V0.m5419o();
        int iM5245H6 = m5245H6();
        PutongFrag putongFrag = friendsFeedContainerFragM5115M4;
        if (nkg.m12265t()) {
            putongFrag = this.f3037T0;
        }
        m5360R6(iM5245H6, putongFrag);
        m5276T6(this.f3014I);
        this.f3029P0 = new jug(act(), m5342B6());
        tfh.m14518h().m14526k(this);
        hrg.m10716g().m10722j(this);
        xdl0.E0(this.f3005D, new View.OnClickListener() { // from class: l.b140
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5884a.m5236C7(view);
            }
        });
        jlg.m11182f().m11183b(this);
    }

    /* JADX INFO: renamed from: i6 */
    public View m5379i6(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i140.m10758b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m5380i7() {
        isHidden();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f3041V0 = new C2132b(getChildFragmentManager());
        return m5379i6(layoutInflater, viewGroup);
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: j0 */
    public void mo4818j0() {
        if (nkg.m12213K()) {
            if (this.f3037T0 == null) {
                return;
            }
            if (TextUtils.equals(FeedModule.f316d.f14929I1, "like")) {
                this.f3037T0.m5207o5(5);
                m5356N7();
                return;
            }
        }
        if (nkg.m12265t()) {
            if (this.f3037T0 == null) {
                return;
            }
            String str = FeedModule.f316d.f14929I1;
            if (TextUtils.equals(str, "follow")) {
                this.f3037T0.m5207o5(1);
                m5356N7();
                return;
            }
            if (TextUtils.equals(str, "dating")) {
                this.f3037T0.m5207o5(2);
                m5356N7();
                return;
            } else if (TextUtils.equals(str, "activity_one")) {
                this.f3037T0.m5207o5(3);
                m5356N7();
                return;
            } else {
                if (TextUtils.equals(str, "activity_two")) {
                    this.f3037T0.m5207o5(4);
                    m5356N7();
                    return;
                }
                return;
            }
        }
        if (this.f3035S0 == null) {
            return;
        }
        String str2 = FeedModule.f316d.f14929I1;
        if (TextUtils.equals(str2, "follow")) {
            this.f3035S0.m5117N4(1);
            if (!vwb.J(this.f3043W0)) {
                this.f3043W0.remove(0);
                this.f3043W0.add(0, getString(R$string.f533h5));
                this.f3045X0[0].setText(getString(R$string.f533h5));
            }
            this.f3036T.g();
            m5386m6(this.f3028P);
            this.f3036T.r();
            this.f3020L.setPageId(m5342B6());
            m5356N7();
            return;
        }
        if (TextUtils.equals(str2, "dating")) {
            this.f3035S0.m5117N4(2);
            if (!vwb.J(this.f3043W0)) {
                this.f3043W0.remove(0);
                this.f3043W0.add(0, fm20.m10237q());
                this.f3045X0[0].setText(fm20.m10237q());
            }
            this.f3036T.g();
            m5386m6(this.f3024N);
            this.f3036T.r();
            this.f3020L.setPageId(m5342B6());
            m5356N7();
        }
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: j1 */
    public void mo4819j1(int i) {
        int iM5344E6 = m5344E6(i);
        if (iM5344E6 >= 0) {
            this.f3002A.setCurrentItem(iM5344E6);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public void m5381j6() {
        i140.m10759c(this);
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m5382j7(C2135e c2135e) {
        if ((nkg.m12265t() && !m5347G6().equals(getString(R$string.f533h5))) || !m5364V6()) {
            m5358Q6(c2135e);
        }
        m5361R7(c2135e);
        m5370a8(c2135e.f3076c, c2135e.f3077d);
    }

    /* JADX INFO: renamed from: k6 */
    public final boolean m5383k6(int i) {
        if (i > 0) {
            return !mqi0.C(mqi0.o(), ((Long) fm20.f8156g.get()).longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m5384k7(Double d) {
        xdl0.M(this.f3020L, true);
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ void m5385l7(Moment moment) {
        this.f3002A.setCurrentItem(0);
        n7c.m12098e().m12102d();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC2258a
    /* JADX INFO: renamed from: m */
    public void mo4825m(String str) {
    }

    /* JADX INFO: renamed from: m6 */
    public final void m5386m6(cwf0 cwf0Var) {
        String str;
        this.f3036T = cwf0Var;
        if (cwf0Var == this.f3028P) {
            str = "p_follow";
        } else if (cwf0Var == this.f3030Q) {
            str = "p_like";
        } else if (cwf0Var == this.f3024N) {
            str = "p_discover_dating";
        } else if (cwf0Var == this.f3026O) {
            str = "p_discover_discussion";
        } else if (cwf0Var == this.f3032R && fm20.m10239s()) {
            str = this.f3009F0.get(0).f9236b;
        } else {
            str = (cwf0Var == this.f3034S && fm20.m10241u()) ? this.f3009F0.get(1).f9236b : null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        j2e.m11062b().m11065e(str);
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ Boolean m5387m7(c cVar) {
        return Boolean.valueOf(cVar == c.i && m5277T7());
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m5388n7(c cVar) {
        if (NullChecker.a(this.f3022M) && this.f3022M.isShowing()) {
            this.f3022M.dismiss();
        }
        if (NullChecker.a(this.f3057h1) && this.f3057h1.isShowing()) {
            this.f3057h1.dismiss();
        }
        m5397t6();
        m5399u6();
        m5332v6();
        if (nkg.m12268u0()) {
            m3i.m11762m().m11768l();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public final void m5389o6(final d30 d30Var) {
        if (nkg.m12250l0()) {
            act().duringCreated(FeedModule.f316d.m16507Mc()).subscribe(mkd0.H(new e30() { // from class: l.y040
                public final void call(Object obj) {
                    this.f15194a.m5371c7(d30Var, (TopicOperations) obj);
                }
            }, new e30() { // from class: l.z040
                public final void call(Object obj) {
                    this.f15546a.m5372d7(d30Var, (Throwable) obj);
                }
            }));
        } else {
            m5371c7(null, d30Var);
        }
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m5390o7(Bundle bundle) {
        act().duringCreated(Act.foreground(), false).distinctUntilChanged(new x9j() { // from class: l.m040
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Act.r) obj) != null || ((Act.r) obj2) == null);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.n040
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m5316k5((Act.r) obj);
            }
        }));
        FeedModule.f314b.m1415G2();
    }

    public void onCreate(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
        this.f3024N.i();
        this.f3028P.i();
        this.f3030Q.i();
        this.f3026O.i();
        this.f3024N.p(new j760[]{j760.a("tab_name", fm20.m10237q())});
        this.f3026O.p(new j760[]{j760.a("tab_name", fm20.m10238r())});
        this.f3028P.p(new j760[]{j760.a("tab_name", getString(R$string.f533h5))});
        this.f3030Q.p(new j760[]{j760.a("tab_name", fm20.m10229i())});
        this.f3036T = this.f3024N;
    }

    public void onDestroy() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroy();
        mwh.m12038d().m12057t();
        this.f3024N.j();
        this.f3028P.j();
        this.f3030Q.j();
        this.f3026O.j();
        if (NullChecker.a(this.f3041V0)) {
            this.f3041V0.m5420q();
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        f2998m1 = z;
        if (NullChecker.a(this.f3041V0)) {
            for (int i = 0; i < this.f3041V0.f3065a.size(); i++) {
                Fragment fragment = (Fragment) this.f3041V0.f3065a.get(i);
                if (fragment instanceof PhotoAlbumFeedFrag) {
                    ((PhotoAlbumFeedFrag) fragment).m5455e5(z);
                } else if (fragment instanceof FriendsFeedViewPagerFrag) {
                    ((FriendsFeedViewPagerFrag) fragment).m5197b6(z);
                }
            }
        }
        if (z) {
            if (NullChecker.b(act())) {
                if (NullChecker.a(this.f3052c1) && this.f3052c1.isShowing()) {
                    this.f3052c1.dismiss();
                }
                if (NullChecker.a(this.f3022M) && this.f3022M.isShowing()) {
                    this.f3022M.dismiss();
                }
                if (NullChecker.a(this.f3057h1) && this.f3057h1.isShowing()) {
                    this.f3057h1.dismiss();
                }
                PhotoAlbumPictureView.m4886u(act().getWindow().getDecorView(), false);
            }
            e51.J(this.f3056g1);
            eng.m9935o();
            m5266P7();
            m5289X7();
            m5265P6();
            m5397t6();
            m5399u6();
            jlg.m11182f().m11189i();
            m5332v6();
        } else {
            if (!vwb.J(this.f3027O0)) {
                m5354L7((Fragment) this.f3027O0.get(this.f3051b1));
            }
            m5363U7(NullChecker.a(this.f3053d1) ? this.f3053d1.f3076c : 0, NullChecker.a(this.f3053d1) ? this.f3053d1.f3077d : 0);
            if (this.f3015I0 == 10) {
                mwh.m12038d().m12050m(this.f3015I0, m5253L6());
            } else {
                mwh.m12038d().m12049l(this.f3015I0);
            }
            if (this.f3051b1 == 1) {
                FeedModule.f316d.f14963Y0.onNext(Boolean.FALSE);
            }
            FeedModule.f316d.m16591Yc("");
            m5391p6();
            if (u2h.m14719d()) {
                m5257M7();
            }
            m5340A6();
        }
        m5321n6(z);
        this.f3042W.onNext(Boolean.valueOf(z));
        j2e.m11062b().m11066f(z, m5343C6());
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        if ("moment".equals(this.f3044X)) {
            this.f3029P0.mo8626q();
        }
        if (m5366X6().booleanValue()) {
            lsi0.y("新人头像框体验已到期～");
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final void m5391p6() {
        lwh lwhVar = new lwh(m5325q6(), new d30() { // from class: l.h040
            public final void call() {
                NewPhotoAlbumFrag.m5263P4();
            }
        });
        lwh lwhVar2 = new lwh(!m5368Z6() && jlg.m11182f().m11195o() && jlg.m11182f().m11184c(act(), null), new d30() { // from class: l.i040
            public final void call() {
                NewPhotoAlbumFrag.m5287X4();
            }
        });
        final lwh lwhVar3 = new lwh(false, new d30() { // from class: l.k040
            public final void call() {
                NewPhotoAlbumFrag.m5254M4();
            }
        });
        lwhVar.m11712b(lwhVar2).m11712b(new lwh(true, new d30() { // from class: l.l040
            public final void call() {
                this.f9830a.m5373e7(lwhVar3);
            }
        })).m11712b(lwhVar3);
        lwhVar.m11711a();
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m5392p7(Boolean bool) {
        m5348G7();
    }

    public String pageId() {
        return m5342B6();
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m5393q7(String str) {
        v1h.m15205I0(act(), str);
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ Boolean m5394r7(Act.r rVar, Act.r rVar2) {
        if (rVar != null && rVar2 == null) {
            this.f3060k0 = System.currentTimeMillis();
        }
        return Boolean.valueOf(rVar != null || rVar2 == null);
    }

    /* JADX INFO: renamed from: s6, reason: merged with bridge method [inline-methods] */
    public final void m5371c7(TopicOperations topicOperations, d30 d30Var) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ void m5396s7(Act.r rVar) {
        if (!isHidden() && this.f3060k0 > 0 && System.currentTimeMillis() - this.f3060k0 > f2997l1) {
            this.f3060k0 = 0L;
            this.f3062p0.onNext(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m5397t6() {
        if (NullChecker.a(this.f3031Q0)) {
            d.l().k(this.f3031Q0);
            this.f3031Q0 = null;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ void m5398t7(Bundle bundle) {
        act().duringCreated(Act.foreground(), false).distinctUntilChanged(new x9j() { // from class: l.p040
            public final Object call(Object obj, Object obj2) {
                return this.f11656a.m5394r7((Act.r) obj, (Act.r) obj2);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.q040
            public final void call(Object obj) {
                this.f12040a.m5396s7((Act.r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u6 */
    public void m5399u6() {
        if (NullChecker.a(this.f3033R0)) {
            d.l().k(this.f3033R0);
            this.f3033R0 = null;
        }
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m5400u7(Long l2) {
        if (isHidden() || vwb.J(this.f3027O0)) {
            return;
        }
        m5354L7((Fragment) this.f3027O0.get(this.f3051b1));
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: v3 */
    public void mo4843v3(String str) {
        this.f3036T.g();
        if (TextUtils.equals(fm20.m10228h(), str)) {
            m5386m6(this.f3028P);
        } else if (TextUtils.equals(fm20.m10229i(), str)) {
            m5386m6(this.f3030Q);
        } else {
            m5386m6(this.f3024N);
        }
        this.f3036T.r();
        this.f3020L.setPageId(m5342B6());
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m5401v7(roj0 roj0Var) {
        m5365V7();
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m5402w7(Boolean bool) {
        this.f3055f1 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: y4 */
    public void m5404y4() {
        m5381j6();
    }

    /* JADX INFO: renamed from: y6 */
    public final boolean m5405y6() {
        this.f3025N0 = false;
        if (w980.m15748h().m15754k()) {
            return w980.m15748h().m15750f(act());
        }
        w980.m15748h().m15749e(new d30() { // from class: l.x040
            public final void call() {
                this.f14723a.m5380i7();
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m5406y7(View view) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return;
        }
        boolean zM11193m = jlg.m11182f().m11193m();
        vch vchVar = this.f3038U;
        if (zM11193m) {
            vchVar.mo15420b(act(), vwb.f0(new Media[0]), true, m5256M6(), jlg.m11182f().m11187g(), jlg.m11182f().m11188h(), this.f3040V, jlg.m11182f().m11185d());
            jlg.m11182f().m11189i();
        } else {
            vchVar.mo15419a(act(), m5256M6(), null, this.f3040V);
        }
        zvf0.r("e_moment_post", m5343C6());
        m84.m11844e().m11853j();
        m5262O6();
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ boolean m5407z7(View view) {
        TopicMoment topicMomentNew_;
        zvf0.r("e_moment_post", m5343C6());
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return true;
        }
        m84.m11844e().m11853j();
        if (jlg.m11182f().m11193m()) {
            String strM11187g = jlg.m11182f().m11187g();
            String strM11188h = jlg.m11182f().m11188h();
            if (TextUtils.isEmpty(strM11187g) || TextUtils.isEmpty(strM11188h)) {
                topicMomentNew_ = null;
            } else {
                topicMomentNew_ = TopicMoment.new_();
                topicMomentNew_.f708id = strM11187g;
                topicMomentNew_.name = strM11188h;
            }
            oe40.m12589n0(act(), vwb.f0(new Media[0]), true, m5256M6(), null, null, topicMomentNew_, jlg.m11182f().m11185d());
            jlg.m11182f().m11189i();
        } else {
            oe40.m12583k0(act(), vwb.f0(new Media[0]), true, m5256M6());
        }
        m5262O6();
        return true;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$d */
    public class C2134d {

        /* JADX INFO: renamed from: a */
        public String f3070a;

        /* JADX INFO: renamed from: b */
        public String f3071b;

        /* JADX INFO: renamed from: c */
        public JSONObject f3072c;

        public C2134d(String str, String str2, JSONObject jSONObject) {
            this.f3070a = str;
            this.f3071b = str2;
            this.f3072c = jSONObject;
        }

        public C2134d() {
        }
    }
}
