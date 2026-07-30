package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
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
import p149l.dah;
import p149l.du2;
import p149l.dyl;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.ed80;
import p149l.eng;
import p149l.eqh0;
import p149l.f3c0;
import p149l.fm20;
import p149l.hrg;
import p149l.ic50;
import p149l.ijb0;
import p149l.j760;
import p149l.je80;
import p149l.jug;
import p149l.kjb0;
import p149l.l80;
import p149l.lah;
import p149l.lwh;
import p149l.m84;
import p149l.mkd0;
import p149l.mqi0;
import p149l.mwh;
import p149l.n970;
import p149l.nkg;
import p149l.o6c0;
import p149l.oe40;
import p149l.p6j0;
import p149l.pv60;
import p149l.t100;
import p149l.tfh;
import p149l.u2h;
import p149l.uwh;
import p149l.v1h;
import p149l.v9h;
import p149l.v9j;
import p149l.vch;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.wc40;
import p149l.wch;
import p149l.x9j;
import p149l.xck0;
import p149l.xdl0;
import p149l.z9j;
import p149l.zvf0;
import p149l.zzl;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFrag extends PutongFrag implements FeedService.InterfaceC11414a, FeedService.InterfaceC11415b, zzl {

    /* JADX INFO: renamed from: f1 */
    public static long f41240f1 = 7200000;

    /* JADX INFO: renamed from: g1 */
    public static boolean f41241g1 = true;

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f41242A;

    /* JADX INFO: renamed from: B */
    public VFrame f41243B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f41244C;

    /* JADX INFO: renamed from: D */
    public VFrame f41245D;

    /* JADX INFO: renamed from: E */
    public ImageView f41246E;

    /* JADX INFO: renamed from: E0 */
    public int f41247E0;

    /* JADX INFO: renamed from: F */
    public VText f41248F;

    /* JADX INFO: renamed from: F0 */
    public String f41249F0;

    /* JADX INFO: renamed from: G */
    public VNavigationTabLayout f41250G;

    /* JADX INFO: renamed from: H */
    public VFrame f41252H;

    /* JADX INFO: renamed from: I */
    public VText f41254I;

    /* JADX INFO: renamed from: I0 */
    public List<PutongFrag> f41255I0;

    /* JADX INFO: renamed from: J */
    public VFrame f41256J;

    /* JADX INFO: renamed from: J0 */
    public b0i f41257J0;

    /* JADX INFO: renamed from: K */
    public VImage f41258K;

    /* JADX INFO: renamed from: K0 */
    public String f41259K0;

    /* JADX INFO: renamed from: L */
    public FeedRedDotView f41260L;

    /* JADX INFO: renamed from: L0 */
    public boolean f41261L0;

    /* JADX INFO: renamed from: M */
    public PopupWindow f41262M;

    /* JADX INFO: renamed from: Q */
    public cwf0 f41270Q;

    /* JADX INFO: renamed from: U */
    public String f41278U;

    /* JADX INFO: renamed from: V0 */
    public Dialog f41281V0;

    /* JADX INFO: renamed from: W */
    public long f41282W;

    /* JADX INFO: renamed from: W0 */
    @Nullable
    public C11278g f41283W0;

    /* JADX INFO: renamed from: X0 */
    public String f41285X0;

    /* JADX INFO: renamed from: a1 */
    public Runnable f41290a1;

    /* JADX INFO: renamed from: b1 */
    public dah f41291b1;

    /* JADX INFO: renamed from: c1 */
    public String f41292c1;

    /* JADX INFO: renamed from: d1 */
    public String f41293d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f41294e1;

    /* JADX INFO: renamed from: p0 */
    public boolean f41296p0;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f41297z;

    /* JADX INFO: renamed from: N */
    public cwf0 f41264N = new cwf0("p_like", PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: O */
    public cwf0 f41266O = new cwf0("p_follow", PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: P */
    public cwf0 f41268P = new cwf0(OMSDialogPositon.p_nearby, PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: R */
    public vch f41272R = new wch();

    /* JADX INFO: renamed from: S */
    public e30<Intent> f41274S = xck0.m208120a(400, new e30() { // from class: l.m870
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f132546a.m63777b7((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: T */
    public C22392a<Boolean> f41276T = C22392a.m221512b();

    /* JADX INFO: renamed from: V */
    public boolean f41280V = true;

    /* JADX INFO: renamed from: X */
    public C22393b<Long> f41284X = C22393b.m221521b();

    /* JADX INFO: renamed from: Y */
    public boolean f41286Y = false;

    /* JADX INFO: renamed from: Z */
    public boolean f41288Z = false;

    /* JADX INFO: renamed from: k0 */
    public int f41295k0 = 1;

    /* JADX INFO: renamed from: G0 */
    public int f41251G0 = -1;

    /* JADX INFO: renamed from: H0 */
    public boolean f41253H0 = false;

    /* JADX INFO: renamed from: M0 */
    public l80<C11277f> f41263M0 = new C11272a();

    /* JADX INFO: renamed from: N0 */
    public C11275d f41265N0 = null;

    /* JADX INFO: renamed from: O0 */
    public List<String> f41267O0 = new ArrayList();

    /* JADX INFO: renamed from: P0 */
    public TextView[] f41269P0 = new TextView[4];

    /* JADX INFO: renamed from: Q0 */
    public VImage[] f41271Q0 = new VImage[1];

    /* JADX INFO: renamed from: R0 */
    public TextView[] f41273R0 = new TextView[4];

    /* JADX INFO: renamed from: S0 */
    public ImageView[] f41275S0 = new ImageView[4];

    /* JADX INFO: renamed from: T0 */
    public int f41277T0 = 0;

    /* JADX INFO: renamed from: U0 */
    public boolean f41279U0 = true;

    /* JADX INFO: renamed from: Y0 */
    public boolean f41287Y0 = false;

    /* JADX INFO: renamed from: Z0 */
    public pv60 f41289Z0 = new pv60();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$a */
    public class C11272a extends l80<C11277f> {
        public C11272a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(C11277f c11277f, int i) {
            if (i == 1) {
                zvf0.m220402x("e_tantan_topic", PhotoAlbumFrag.this.m63809r6());
            } else if (NullChecker.m81303a(c11277f.f41308c)) {
                zvf0.m220404z(c11277f.f41306a, c11277f.f41307b, c11277f.f41308c);
            } else {
                zvf0.m220402x(c11277f.f41306a, c11277f.f41307b);
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(C11277f c11277f, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$b */
    public class RunnableC11273b implements Runnable {
        public RunnableC11273b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PhotoAlbumFrag.this.m63816u7();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$c */
    public class C11274c implements PopupWindow.OnDismissListener {
        public C11274c() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            boolean zEquals = TextUtils.equals(PhotoAlbumFrag.this.f41271Q0[0].getTag().toString(), PhotoAlbumFrag.this.f41292c1);
            PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
            if (zEquals) {
                photoAlbumFrag.f41271Q0[0].setTag(PhotoAlbumFrag.this.f41293d1);
                PhotoAlbumFrag.this.f41271Q0[0].setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f94634u1));
            } else {
                photoAlbumFrag.f41271Q0[0].setTag(PhotoAlbumFrag.this.f41292c1);
                PhotoAlbumFrag.this.f41271Q0[0].setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f94642v1));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$d */
    public class C11275d extends FragmentPagerAdapter implements ViewPager.InterfaceC0716j, dyl {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f41301a;

        /* JADX INFO: renamed from: b */
        public Method f41302b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f41303c;

        public C11275d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f41301a = new ArrayList();
            this.f41302b = null;
            this.f41303c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f41302b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.m81296c(e);
                this.f41302b = null;
            } catch (SecurityException e2) {
                CrashHelper.m81296c(e2);
                this.f41302b = null;
            }
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
            return this.f41301a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f41301a.get(i);
        }

        @Override // p149l.w660
        public CharSequence getPageTitle(int i) {
            return (CharSequence) PhotoAlbumFrag.this.f41267O0.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.m81303a(this.f41303c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f41303c.m2589t0());
                    sb.append(Constants.PACKNAME_END);
                    sb.append("lstFrag :" + this.f41301a);
                    du2.m113670a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: l */
        public Fragment m63832l(int i) {
            Fragment fragmentM2557i0;
            Method method = this.f41302b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentM2557i0 = PhotoAlbumFrag.this.getChildFragmentManager().m2557i0((String) method.invoke(this, Integer.valueOf(PhotoAlbumFrag.this.f41242A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.m81296c(e);
                fragmentM2557i0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.m81296c(e2);
                fragmentM2557i0 = null;
            }
            return fragmentM2557i0 == null ? getItem(i) : fragmentM2557i0;
        }

        /* JADX INFO: renamed from: m */
        public View m63833m(final int i) {
            View viewInflate = PhotoAlbumFrag.this.act().inflater().inflate(o6c0.f142319x5, (ViewGroup) null);
            final VImage vImage = (VImage) viewInflate.findViewById(b5c0.f73473D0);
            vImage.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f94642v1));
            vImage.setTag(PhotoAlbumFrag.this.f41292c1);
            if (nkg.m159868Y() && i == 0) {
                PhotoAlbumFrag.this.f41271Q0[0] = vImage;
            }
            final TextView textView = (TextView) viewInflate.findViewById(b5c0.f73556d2);
            TextView textView2 = (TextView) viewInflate.findViewById(b5c0.f73560e2);
            PhotoAlbumFrag.this.f41269P0[i] = textView;
            PhotoAlbumFrag.this.f41273R0[i] = textView2;
            PhotoAlbumFrag.this.f41275S0[i] = (ImageView) viewInflate.findViewById(b5c0.f73625y0);
            textView.setText((CharSequence) PhotoAlbumFrag.this.f41267O0.get(i));
            xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.k970
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121913a.m63834n(i, textView, vImage, view);
                }
            });
            PhotoAlbumFrag.this.f41269P0[i].setTextColor(PhotoAlbumFrag.this.getResources().getColor(e1c0.f88771Z));
            return viewInflate;
        }

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ void m63834n(int i, TextView textView, VImage vImage, View view) {
            if (PhotoAlbumFrag.this.f41277T0 == i && TextUtils.equals("喜欢", textView.getText().toString())) {
                boolean zEquals = TextUtils.equals(vImage.getTag().toString(), PhotoAlbumFrag.this.f41292c1);
                PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
                if (zEquals) {
                    vImage.setTag(photoAlbumFrag.f41293d1);
                    vImage.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f94634u1));
                } else {
                    vImage.setTag(photoAlbumFrag.f41292c1);
                    vImage.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f94642v1));
                }
                PhotoAlbumFrag.this.m63804o7(view);
            }
            if (PhotoAlbumFrag.this.f41277T0 != i) {
                VNavigationTabLayout vNavigationTabLayout = PhotoAlbumFrag.this.f41250G;
                vNavigationTabLayout.m223598D(vNavigationTabLayout.m223627w(i));
            }
        }

        /* JADX INFO: renamed from: o */
        public void m63835o() {
            if (this.f41303c == null) {
                return;
            }
            Iterator<PutongFrag> it = this.f41301a.iterator();
            while (it.hasNext()) {
                this.f41303c.m2567m().mo2715r(it.next()).mo2708j();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            Fragment fragmentM63832l = PhotoAlbumFrag.this.f41265N0.m63832l(i);
            if ((fragmentM63832l instanceof PhotoAlbumFeedFrag) && ((PhotoAlbumFeedFrag) fragmentM63832l).m64368Q4()) {
                FeedModule.m60222H().mo30779jg(PhotoAlbumFrag.this.act(), false);
            } else {
                FeedModule.m60222H().mo30717Pq(PhotoAlbumFrag.this.act(), false);
            }
            PhotoAlbumFrag.this.m63725m7();
            PhotoAlbumFrag.this.m63735v7();
            PhotoAlbumFrag.this.m63737w6();
            PhotoAlbumFrag.this.f41277T0 = i;
            PhotoAlbumPictureView.m63859u(PhotoAlbumFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (true) {
                if (i2 >= this.f41301a.size()) {
                    break;
                }
                Fragment fragmentM63832l2 = m63832l(i2);
                if (fragmentM63832l2 instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragmentM63832l2;
                    photoAlbumFeedFrag.m64384h5(i2 == i);
                    photoAlbumFeedFrag.m64383g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag.m64377Z4();
                    }
                } else if (fragmentM63832l2 instanceof PhotoAlbumFallsFeedFrag) {
                    ((PhotoAlbumFallsFeedFrag) fragmentM63832l2).m63615p5(i2 == i);
                }
                i2++;
            }
            PhotoAlbumFrag.this.f41279U0 = false;
            PhotoAlbumFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f38855d.f193028Y0.onNext(Boolean.FALSE);
            }
            PhotoAlbumFrag.this.m63810r7();
        }

        /* JADX INFO: renamed from: p */
        public void m63836p(List<PutongFrag> list) {
            PhotoAlbumFrag.this.f41255I0 = list;
            this.f41301a.clear();
            if (NullChecker.m81304b(list)) {
                this.f41301a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$e */
    public class C11276e implements VNavigationTabLayout.InterfaceC22621d {
        public C11276e() {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: a */
        public void mo63839a(VNavigationTabLayout.C22623f c22623f) {
            FeedModule.f38855d.m209346Pb().mo193141m(PhotoAlbumFrag.this.act(), PhotoAlbumFrag.this.f41269P0[c22623f.m223687f()]);
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: b */
        public void mo63840b(VNavigationTabLayout.C22623f c22623f) {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: c */
        public void mo63841c(VNavigationTabLayout.C22623f c22623f) {
            int iM223687f = c22623f.m223687f();
            VNavigationTabLayout.TabView tabView = PhotoAlbumFrag.this.f41250G.m223627w(0).f209872i;
            if (iM223687f == 0 && nkg.m159868Y()) {
                tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), t100.m186890d(15.0f), tabView.getPaddingBottom());
                PhotoAlbumFrag.this.f41271Q0[0].setVisibility(0);
                boolean zM159879f0 = nkg.m159879f0();
                PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
                if (!zM159879f0) {
                    if (photoAlbumFrag.f41287Y0) {
                        p6j0.m167669c("e_red_dot_explore", mwh.m156632d().m156637f(PhotoAlbumFrag.this.m63807q6()), new j760("red_dot_relation_child", "red_dot_like"));
                    }
                    if (PhotoAlbumFrag.this.f41287Y0 && lah.m149154g().f127198b.mo95545f()) {
                        FeedModule.f38855d.f192988G1 = "recommend";
                        PhotoAlbumFrag.this.m63782e7();
                    }
                    lah.m149154g().m149161m();
                } else if (xdl0.m208349O0(photoAlbumFrag.f41275S0[0])) {
                    if (v9h.f180641g) {
                        FeedModule.f38855d.m209521oc();
                    } else {
                        v9h.f180643i = true;
                        boolean z = PhotoAlbumFrag.this.f41294e1;
                        PhotoAlbumFrag photoAlbumFrag2 = PhotoAlbumFrag.this;
                        if (z) {
                            photoAlbumFrag2.f41294e1 = false;
                        } else {
                            e51.m114743H(photoAlbumFrag2.getContext(), new Runnable() { // from class: l.l970
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f126923a.m63842f();
                                }
                            }, 200L);
                        }
                    }
                    v9h.f180641g = false;
                    v9h.f180642h = false;
                    e51.m114743H(PhotoAlbumFrag.this.getContext(), new Runnable() { // from class: l.m970
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f132681a.m63843g();
                        }
                    }, 500L);
                }
            } else {
                if (nkg.m159868Y() && !nkg.m159879f0()) {
                    lah.m149154g().m149160l(true);
                }
                if (nkg.m159868Y() && PhotoAlbumFrag.this.f41271Q0 != null && PhotoAlbumFrag.this.f41271Q0.length > 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                    PhotoAlbumFrag.this.f41271Q0[0].setVisibility(8);
                }
            }
            FeedModule.f38855d.m209346Pb().mo193131c(PhotoAlbumFrag.this.act(), PhotoAlbumFrag.this.f41269P0[iM223687f]);
            if (PhotoAlbumFrag.this.getString(R$string.f39072h5).equals(PhotoAlbumFrag.this.f41269P0[iM223687f].getText().toString()) || "喜欢".equals(PhotoAlbumFrag.this.f41269P0[iM223687f].getText().toString())) {
                mwh.m156632d().m156643l("喜欢".equals(PhotoAlbumFrag.this.f41269P0[iM223687f].getText().toString()) ? 15 : 3);
                PhotoAlbumFrag.this.mo63785g2();
            }
            if (PhotoAlbumFrag.this.getString(R$string.f39079i5).equals(PhotoAlbumFrag.this.f41269P0[iM223687f].getText().toString()) && PhotoAlbumFrag.this.isResumed()) {
                mwh.m156632d().m156643l(11);
                if (PhotoAlbumFrag.this.f41253H0) {
                    PhotoAlbumFrag.this.m63788h6();
                }
            }
            if (PhotoAlbumFrag.this.getString(R$string.f38886E0).equals(PhotoAlbumFrag.this.f41269P0[iM223687f].getText().toString()) && iM223687f != PhotoAlbumFrag.this.f41277T0) {
                PhotoAlbumFrag photoAlbumFrag3 = PhotoAlbumFrag.this;
                p6j0.m167668b("e_recommend", photoAlbumFrag3.m63811s6(photoAlbumFrag3.f41251G0), new p6j0.C19147a[0]);
            }
            PhotoAlbumFrag.this.f41251G0 = iM223687f;
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m63842f() {
            PhotoAlbumFrag.this.m63782e7();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m63843g() {
            xdl0.m208344M(PhotoAlbumFrag.this.f41275S0[0], false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$f */
    public class C11277f {

        /* JADX INFO: renamed from: a */
        public String f41306a;

        /* JADX INFO: renamed from: b */
        public String f41307b;

        /* JADX INFO: renamed from: c */
        public JSONObject f41308c;

        public C11277f(String str, String str2, JSONObject jSONObject) {
            this.f41306a = str;
            this.f41307b = str2;
            this.f41308c = jSONObject;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$g */
    public class C11278g {

        /* JADX INFO: renamed from: a */
        public int f41310a;

        /* JADX INFO: renamed from: b */
        public int f41311b;

        /* JADX INFO: renamed from: c */
        public int f41312c;

        /* JADX INFO: renamed from: d */
        public boolean f41313d;

        /* JADX INFO: renamed from: e */
        public boolean f41314e;

        /* JADX INFO: renamed from: f */
        public boolean f41315f;

        public C11278g(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
            this.f41311b = i;
            this.f41310a = i2;
            this.f41312c = i3;
            this.f41313d = z;
            this.f41314e = z2;
            this.f41315f = z3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11278g)) {
                return false;
            }
            C11278g c11278g = (C11278g) obj;
            return this.f41313d == c11278g.f41313d && this.f41310a == c11278g.f41310a && this.f41311b == c11278g.f41311b && this.f41312c == c11278g.f41312c && this.f41314e == c11278g.f41314e && this.f41315f == c11278g.f41315f;
        }

        public int hashCode() {
            int iHashCode = Integer.valueOf(this.f41310a).hashCode();
            int iHashCode2 = Integer.valueOf(this.f41312c).hashCode();
            int iHashCode3 = Boolean.valueOf(this.f41313d).hashCode();
            int iHashCode4 = Boolean.valueOf(this.f41314e).hashCode();
            return (Boolean.valueOf(this.f41315f).hashCode() >> 1) ^ ((((iHashCode >> 1) ^ iHashCode2) ^ iHashCode3) ^ (iHashCode4 >> 1));
        }

        public String toString() {
            return "unreadLikeFeeds:" + this.f41311b + "\nunreadFeeds:" + this.f41310a + "\nunreadActivities:" + this.f41312c + "\nisShowFixTimeDot:" + this.f41313d + "\nisShowTopicDot:" + this.f41314e + "\nisHideRedByNewUser:" + this.f41315f + SignParameters.NEW_LINE;
        }
    }

    public PhotoAlbumFrag() {
        if (NullChecker.m81304b(FeedModule.f38855d)) {
            je80.m141102b().m141103a();
            if (nkg.m159868Y() && !nkg.m159879f0()) {
                lah.m149154g().m149160l(false);
            }
        }
        this.f41290a1 = new RunnableC11273b();
        this.f41292c1 = "feed_like_menu_icon_default";
        this.f41293d1 = "feed_like_menu_icon";
    }

    /* JADX INFO: renamed from: A6 */
    private void m63674A6(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.z870
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f202109a.m63769X6(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.a970
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f68118a.m63772Y6(view2);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m63688N4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a7 */
    public /* synthetic */ void m63710a7(View view) {
        p6j0.m167668b("e_moment_unread_notes_history", m63794j6(), new p6j0.C19147a[0]);
        act().startActivity(PhotoAlbumActivitiesAct.m64971V1(act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: c6 */
    private void m63713c6(final int i) {
        if (m63800m6() >= 0 || (nkg.m159879f0() && m63803o6() >= 0)) {
            final int iM63803o6 = nkg.m159868Y() ? m63803o6() : m63800m6();
            boolean z = this.f41275S0[iM63803o6].getVisibility() == 0;
            lwh lwhVar = new lwh(false, new d30() { // from class: l.c870
                @Override // p149l.d30
                public final void call() {
                    this.f79706a.m63745E6(i);
                }
            });
            lwhVar.m151970b(new lwh(i > 0, new d30() { // from class: l.n870
                @Override // p149l.d30
                public final void call() {
                    this.f137601a.m63746F6(iM63803o6);
                }
            })).m151970b(new lwh(true, new d30() { // from class: l.y870
                @Override // p149l.d30
                public final void call() {
                    this.f196781a.m63747G6(iM63803o6);
                }
            }));
            lwhVar.m151969a();
            m63786g6(xdl0.m208349O0(this.f41275S0[iM63803o6]) ? this.f41275S0[iM63803o6] : this.f41273R0[iM63803o6], z, this.f41275S0[iM63803o6].getVisibility() == 0, m63807q6(), null);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m63715e5(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            FeedModule.f38858g.m121847c();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m63721k5(Throwable th) {
    }

    /* JADX INFO: renamed from: l7 */
    private void m63723l7() {
        Fragment fragmentM63832l = this.f41265N0.m63832l(this.f41277T0);
        if (fragmentM63832l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM63832l).m64378a5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m7 */
    public void m63725m7() {
        Fragment fragmentM63832l = this.f41265N0.m63832l(this.f41277T0);
        if (fragmentM63832l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM63832l).m64379b5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v7 */
    public void m63735v7() {
        Fragment fragmentM63832l = this.f41265N0.m63832l(this.f41277T0);
        if (fragmentM63832l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM63832l).m64387m5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w6 */
    public void m63737w6() {
        Fragment fragmentM63832l = this.f41265N0.m63832l(this.f41277T0);
        if (fragmentM63832l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM63832l).m64373V4();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public final void m63741B6() {
        this.f41252H = new VFrame(getContext());
        this.f41256J = new VFrame(getContext());
        VText vText = new VText(getContext());
        this.f41254I = vText;
        this.f41252H.addView(vText, new FrameLayout.LayoutParams(-2, t100.m186890d(34.0f)));
        this.f41254I.setText(R$string.f38899G1);
        this.f41254I.setTextSize(14.0f);
        this.f41254I.setTextColor(-1);
        this.f41254I.setTypeface(eqh0.m117752c(3), 1);
        this.f41254I.setPadding(t100.m186890d(12.0f), 0, t100.m186890d(12.0f), 0);
        this.f41254I.setBackgroundResource(f3c0.f94606q5);
        this.f41254I.setGravity(16);
        VImage vImage = new VImage(getContext());
        this.f41258K = vImage;
        this.f41256J.addView(vImage, new FrameLayout.LayoutParams(t100.m186890d(32.0f), t100.m186890d(32.0f)));
        this.f41258K.setImageResource(f3c0.f94612r3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(9.5f), t100.m186890d(9.5f));
        layoutParams.gravity = 53;
        FeedRedDotView feedRedDotView = new FeedRedDotView(getContext());
        this.f41260L = feedRedDotView;
        this.f41256J.addView(feedRedDotView, layoutParams);
        this.f41260L.setOvalColor(getResources().getColor(e1c0.f88800o));
        this.f41260L.setWidth(t100.m186890d(9.5f));
        this.f41260L.setRingWidth(t100.m186890d(1.5f));
        this.f41260L.setRingColor(getResources().getColor(e1c0.f88803p0));
        this.f41260L.setRedPointType(2);
        this.f41260L.m65057o();
        xdl0.m208344M(this.f41260L, false);
        xdl0.m208344M(this.f41245D, true);
    }

    /* JADX INFO: renamed from: C6 */
    public final boolean m63742C6() {
        return vqg.m199552j0(1);
    }

    /* JADX INFO: renamed from: D6 */
    public final boolean m63743D6() {
        return !TextUtils.isEmpty(this.f41249F0);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC11415b
    /* JADX INFO: renamed from: E0 */
    public void mo63744E0() {
        e51.m114745J(this.f41290a1);
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m63745E6(int i) {
        String str;
        m63808q7(m63800m6(), i);
        this.f41273R0[m63800m6()].setVisibility(0);
        this.f41275S0[m63800m6()].setVisibility(8);
        TextView textView = this.f41273R0[m63800m6()];
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        textView.setText(str);
        m63806p7(this.f41273R0[m63800m6()]);
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ void m63748H6(int i) {
        m63768X5(m63805p6(), i);
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m63749I6() {
        m63747G6(m63805p6());
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: J4 */
    public cwf0 mo29638J4() {
        return NullChecker.m81303a(this.f41270Q) ? this.f41270Q : super.mo29638J4();
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ void m63750J6(Moment moment) {
        this.f41242A.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ Boolean m63751K6(C4319c c4319c) {
        return Boolean.valueOf(c4319c == C4319c.f15548i && m63812s7());
    }

    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ void m63752L6(C4319c c4319c) {
        if (NullChecker.m81303a(this.f41262M) && this.f41262M.isShowing()) {
            this.f41262M.dismiss();
        }
        if (NullChecker.m81303a(this.f41291b1) && this.f41291b1.isShowing()) {
            this.f41291b1.dismiss();
        }
        m63781e6();
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m63753M6(Act.C4299r c4299r) {
        ImageView imageView;
        if (NullChecker.m81303a(c4299r)) {
            FeedModule.f38853b.m60491I2();
            if (!nkg.m159868Y() || nkg.m159879f0() || (imageView = this.f41275S0[0]) == null || xdl0.m208349O0(imageView) || !lah.f127195g || !lah.m149154g().m149155f()) {
                return;
            }
            lah.f127195g = false;
            if (this.f41277T0 != 0) {
                lah.m149154g().m149160l(true);
            }
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final /* synthetic */ void m63754N6(Bundle bundle) {
        act().duringCreated((C22306c) Act.foreground(), false).distinctUntilChanged(new x9j() { // from class: l.v870
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Act.C4299r) obj) != null || ((Act.C4299r) obj2) == null);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.w870
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185165a.m63753M6((Act.C4299r) obj);
            }
        }));
        FeedModule.f38853b.m60489G2();
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: O0 */
    public void mo63755O0(String str, boolean z) {
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m63756O6(Boolean bool) {
        m63782e7();
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: P0 */
    public boolean mo63757P0() {
        Fragment fragmentM63832l = this.f41265N0.m63832l(this.f41277T0);
        if (this.f41279U0 || !(fragmentM63832l instanceof PhotoAlbumFeedFrag)) {
            return false;
        }
        return ((PhotoAlbumFeedFrag) fragmentM63832l).m64366P0();
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m63758P6(String str) {
        v1h.m196566I0(act(), str);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ Boolean m63759Q6(Act.C4299r c4299r, Act.C4299r c4299r2) {
        if (c4299r != null && c4299r2 == null) {
            this.f41282W = System.currentTimeMillis();
        }
        return Boolean.valueOf(c4299r != null || c4299r2 == null);
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ void m63760R6(Act.C4299r c4299r) {
        if (this.f41282W <= 0 || System.currentTimeMillis() - this.f41282W <= f41240f1) {
            return;
        }
        this.f41282W = 0L;
        this.f41284X.onNext(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m63761S6(Bundle bundle) {
        act().duringCreated((C22306c) Act.foreground(), false).distinctUntilChanged(new x9j() { // from class: l.t870
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f168806a.m63759Q6((Act.C4299r) obj, (Act.C4299r) obj2);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.u870
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175101a.m63760R6((Act.C4299r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m63762T6(Long l2) {
        m63797k7();
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m63763U6(String str) {
        if (this.f41277T0 == 0) {
            FeedModule.f38855d.f193031a0.put(str);
            return;
        }
        if (lah.f127195g || !lah.m149154g().m149155f()) {
            return;
        }
        lah.m149154g().m149161m();
        lah.f127195g = true;
        lah.m149154g().m149159k();
        this.f41287Y0 = true;
        this.f41285X0 = str;
        m63787g7();
    }

    /* JADX INFO: renamed from: V5 */
    public View m63764V5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n970.m158536b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W5 */
    public void m63766W5() {
        n970.m158537c(this);
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m63767W6(C11278g c11278g) {
        m63820x6(c11278g);
        m63802n7(c11278g);
        m63823y7(c11278g.f41312c);
    }

    /* JADX INFO: renamed from: X5 */
    public final void m63768X5(int i, int i2) {
        String str;
        if (i == -1) {
            return;
        }
        m63808q7(i, i2);
        this.f41273R0[i].setVisibility(0);
        this.f41275S0[i].setVisibility(8);
        TextView textView = this.f41273R0[i];
        if (i2 > 99) {
            str = "99+";
        } else {
            str = i2 + "";
        }
        textView.setText(str);
        if (nkg.m159868Y()) {
            return;
        }
        m63806p7(this.f41273R0[m63800m6()]);
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m63769X6(View view) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return;
        }
        this.f41272R.mo197762a(act(), m63813t6(), null, this.f41274S);
        m84.m153429e().m153438j();
        m63818v6();
    }

    /* JADX INFO: renamed from: Y */
    public Frag m63770Y() {
        return (Frag) this.f41265N0.m63832l(this.f41242A.getCurrentItem());
    }

    /* JADX INFO: renamed from: Y5 */
    public final boolean m63771Y5(int i) {
        if (i < 10) {
            return false;
        }
        return fm20.f98241d.get().longValue() == 0 || !a5i.m95030f(fm20.f98241d.get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ boolean m63772Y6(View view) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return true;
        }
        m84.m153429e().m153438j();
        oe40.m163846k0(act(), vwb.m200324f0(new Media[0]), true, "camera");
        m63818v6();
        return true;
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m63773Z5(boolean z) {
        C11275d c11275d;
        if (z || (c11275d = this.f41265N0) == null) {
            FeedModule.m60222H().mo30717Pq(act(), false);
            return;
        }
        Fragment fragmentM63832l = c11275d.m63832l(this.f41277T0);
        if ((fragmentM63832l instanceof PhotoAlbumFeedFrag) && ((PhotoAlbumFeedFrag) fragmentM63832l).m64368Q4()) {
            FeedModule.m60222H().mo30779jg(act(), false);
        } else {
            FeedModule.m60222H().mo30717Pq(act(), false);
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m63774Z6(View view, String str, String str2, j760[] j760VarArr) {
        this.f41263M0.m148839h(view, new C11277f(str, str2, zvf0.m220380b(j760VarArr)), 2);
    }

    /* JADX INFO: renamed from: a6 */
    public final boolean m63775a6() {
        return m63776b6();
    }

    /* JADX INFO: renamed from: b6 */
    public final boolean m63776b6() {
        this.f41253H0 = true;
        e51.m114745J(this.f41290a1);
        if (this.f41277T0 != m63805p6()) {
            return false;
        }
        m63788h6();
        return false;
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m63777b7(Intent intent) {
        act().startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: d6 */
    public final void m63779d6(final int i) {
        if (m63805p6() < 1) {
            return;
        }
        boolean z = this.f41273R0[m63805p6()].getVisibility() == 0;
        lwh lwhVar = new lwh(false, new d30() { // from class: l.q870
            @Override // p149l.d30
            public final void call() {
                this.f153138a.m63748H6(i);
            }
        });
        lwhVar.m151970b(new lwh(true, new d30() { // from class: l.r870
            @Override // p149l.d30
            public final void call() {
                this.f158156a.m63749I6();
            }
        }));
        lwhVar.m151969a();
        m63783f6(xdl0.m208349O0(this.f41273R0[m63805p6()]) ? this.f41273R0[m63805p6()] : this.f41275S0[m63805p6()], z, this.f41273R0[m63805p6()].getVisibility() == 0, 11);
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m63780d7(String str) {
        if (this.f41277T0 == 0 && nkg.m159879f0() && NullChecker.m81303a(this.f41275S0) && NullChecker.m81303a(this.f41275S0[0]) && xdl0.m208349O0(this.f41275S0[0])) {
            v9h.f180643i = true;
            v9h.f180641g = false;
            v9h.f180642h = false;
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m63781e6() {
        if (NullChecker.m81303a(this.f41259K0)) {
            C4348d.m20896l().m20900k(this.f41259K0);
            this.f41259K0 = null;
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m63824z6();
    }

    /* JADX INFO: renamed from: f6 */
    public final void m63783f6(View view, boolean z, boolean z2, int i) {
        if (z ^ z2) {
            if (z) {
                mwh.m156632d().m156650s(Integer.valueOf(i));
            } else {
                mwh.m156632d().m156648q(false, view, i, new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ C11278g m63784f7(Counter counter, Boolean bool, Double d, Boolean bool2) {
        return new C11278g(nkg.m159879f0() ? counter.moments.unreadLikeFeeds : 0, nkg.m159868Y() ? 0 : counter.moments.unreadFeeds, counter.activities.unread, bool.booleanValue(), d.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, bool2.booleanValue());
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: g2 */
    public void mo63785g2() {
        if (nkg.m159868Y() && xdl0.m208349O0(this.f41275S0[0]) && !nkg.m159879f0()) {
            this.f41287Y0 = false;
            xdl0.m208344M(this.f41275S0[0], false);
            FeedModule.f38855d.f193031a0.put(this.f41285X0);
            if (NullChecker.m81303a(this.f41283W0)) {
                m63802n7(this.f41283W0);
                return;
            }
            return;
        }
        if (this.f41296p0 || this.f41247E0 <= 0 || !NullChecker.m81303a(this.f41283W0)) {
            return;
        }
        this.f41296p0 = true;
        this.f41247E0 = 0;
        m63802n7(this.f41283W0);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        mwh.m156632d().m156654w(new mwh.InterfaceC18577a() { // from class: l.o870
            @Override // p149l.mwh.InterfaceC18577a
            /* JADX INFO: renamed from: a */
            public final void mo139123a(View view, String str, String str2, j760[] j760VarArr) {
                this.f142602a.m63774Z6(view, str, str2, j760VarArr);
            }
        });
        m63741B6();
        this.f41267O0.add(0, nkg.m159868Y() ? "喜欢" : getString(R$string.f39072h5));
        this.f41267O0.add(1, getString(R$string.f39079i5));
        ArrayList arrayList = new ArrayList();
        PhotoAlbumFeedFrag photoAlbumFeedFragM64382f5 = PhotoAlbumFeedFrag.m64360M4(FeedModule.m60221F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12).m64382f5(this.f41242A);
        PhotoAlbumFeedFrag photoAlbumFeedFragM64382f6 = PhotoAlbumFeedFrag.m64360M4(FeedModule.m60221F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0).m64382f5(this.f41242A);
        PhotoAlbumFeedFrag photoAlbumFeedFragM64360M4 = PhotoAlbumFeedFrag.m64360M4(FeedModule.m60221F().userId(), "from_nearby_falls_feed", -1, User.ID_TEAM_ACCOUNT, 1);
        if (nkg.m159868Y()) {
            arrayList.add(photoAlbumFeedFragM64382f5);
        } else {
            arrayList.add(photoAlbumFeedFragM64382f6);
        }
        arrayList.add(photoAlbumFeedFragM64360M4);
        this.f41265N0.m63836p(arrayList);
        this.f41297z.setTag("photo_album_root");
        this.f41242A.setOnPageChangeListener(this.f41265N0);
        this.f41242A.setAdapter(this.f41265N0);
        this.f41244C.setBackgroundColor(act().getResources().getColor(e1c0.f88799n0));
        this.f41244C.setupViewPager(this.f41242A);
        this.f41250G = this.f41244C.getTabLayout();
        this.f41244C.setRightIconViews(this.f41256J, this.f41252H);
        int i = 0;
        while (i < this.f41250G.getTabCount()) {
            View viewM63833m = this.f41265N0.m63833m(i);
            VNavigationTabLayout.C22623f c22623fM223627w = this.f41250G.m223627w(i);
            Objects.requireNonNull(c22623fM223627w);
            c22623fM223627w.m223695n(viewM63833m);
            VNavigationTabLayout.C22623f c22623fM223627w2 = this.f41250G.m223627w(i);
            Objects.requireNonNull(c22623fM223627w2);
            VNavigationTabLayout.TabView tabView = c22623fM223627w2.f209872i;
            int iM186890d = i == 0 ? t100.m186890d(4.0f) : 0;
            VNavigationTabLayout.C22623f c22623fM223627w3 = this.f41250G.m223627w(i);
            Objects.requireNonNull(c22623fM223627w3);
            int paddingTop = c22623fM223627w3.f209872i.getPaddingTop();
            VNavigationTabLayout.C22623f c22623fM223627w4 = this.f41250G.m223627w(i);
            Objects.requireNonNull(c22623fM223627w4);
            tabView.setPadding(iM186890d, paddingTop, 0, c22623fM223627w4.f209872i.getPaddingBottom());
            i++;
        }
        this.f41250G.setOnTabSelectedListener((VNavigationTabLayout.InterfaceC22621d) new C11276e());
        this.f41286Y = true;
        m63822y6(m63801n6(), photoAlbumFeedFragM64360M4);
        m63674A6(this.f41254I);
        this.f41257J0 = new jug(act(), m63794j6());
        tfh.m188712h().m188720k(this);
        hrg.m132673g().m132679j(this);
        xdl0.m208329E0(this.f41245D, new View.OnClickListener() { // from class: l.p870
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147569a.m63710a7(view);
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final void m63786g6(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                mwh.m156632d().m156650s(Integer.valueOf(i));
            } else {
                mwh.m156632d().m156647p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: renamed from: g7 */
    public final void m63787g7() {
        this.f41275S0[0].setVisibility(0);
        p6j0.m167671e("e_red_dot_explore", mwh.m156632d().m156637f(m63807q6()), new j760("red_dot_relation_child", "red_dot_like"));
        if (NullChecker.m81303a(this.f41283W0)) {
            m63802n7(this.f41283W0);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m63788h6() {
        this.f41253H0 = false;
        if (System.currentTimeMillis() - fm20.f98242e.get().longValue() < 172800000 || cjh.m107158d()) {
            return false;
        }
        e51.m114744I(this, this.f41290a1, 100L);
        return true;
    }

    /* JADX INFO: renamed from: h7, reason: merged with bridge method [inline-methods] */
    public final void m63747G6(int i) {
        this.f41273R0[i].setVisibility(8);
        this.f41275S0[i].setVisibility(8);
    }

    /* JADX INFO: renamed from: i6 */
    public final void m63790i6(View view, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        if ((z2 ^ z) || z4) {
            if (!z || z4) {
                this.f41295k0 = mwh.m156632d().m156642k(view, i, z3, z4, m63809r6(), true);
            } else {
                mwh.m156632d().m156650s(1);
            }
        }
    }

    /* JADX INFO: renamed from: i7, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m63782e7() {
        Fragment fragmentM63832l = this.f41265N0.m63832l(this.f41277T0);
        if (this.f41279U0) {
            return;
        }
        if (fragmentM63832l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM63832l).m64376Y4();
        } else if (fragmentM63832l instanceof PhotoAlbumFallsFeedFrag) {
            ((PhotoAlbumFallsFeedFrag) fragmentM63832l).m63612m5();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f41265N0 = new C11275d(getChildFragmentManager());
        return m63764V5(layoutInflater, viewGroup);
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: j0 */
    public void mo63792j0() {
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: j1 */
    public void mo63793j1(int i) {
        int iM63798l6 = m63798l6(i);
        if (iM63798l6 >= 0) {
            if (12 == i) {
                this.f41294e1 = true;
            }
            this.f41242A.setCurrentItem(iM63798l6);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public String m63794j6() {
        if (this.f41277T0 == 0) {
            return nkg.m159868Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: j7, reason: merged with bridge method [inline-methods] */
    public final void m63746F6(int i) {
        this.f41273R0[i].setVisibility(8);
        this.f41275S0[i].setVisibility(0);
        if (nkg.m159879f0() && i == 0) {
            v9h.f180642h = true;
            FeedModule.f38855d.f192988G1 = "recommend";
        }
    }

    /* JADX INFO: renamed from: k6 */
    public String m63796k6() {
        cwf0 cwf0Var = this.f41270Q;
        if (cwf0Var == this.f41266O) {
            return "p_follow";
        }
        if (cwf0Var == this.f41268P) {
            return OMSDialogPositon.p_nearby;
        }
        return cwf0Var == this.f41264N ? "p_like" : "";
    }

    /* JADX INFO: renamed from: k7 */
    public final void m63797k7() {
        if (vwb.m200296J(this.f41255I0)) {
            return;
        }
        int size = this.f41255I0.size();
        for (int i = 0; i < size; i++) {
            PutongFrag putongFrag = this.f41255I0.get(i);
            boolean z = (putongFrag.getArguments() == null ? -2 : putongFrag.getArguments().getInt("page_type", -2)) != 0;
            boolean z2 = 12 != (putongFrag.getArguments() != null ? putongFrag.getArguments().getInt("page_type", -2) : -2);
            if ((putongFrag instanceof PhotoAlbumFeedFrag) && (z || z2)) {
                ((PhotoAlbumFeedFrag) putongFrag).m64376Y4();
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public int m63798l6(int i) {
        if (vwb.m200296J(this.f41255I0)) {
            return -1;
        }
        int size = this.f41255I0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == (this.f41255I0.get(i2).getArguments() != null ? this.f41255I0.get(i2).getArguments().getInt("page_type", -2) : -2)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC11414a
    /* JADX INFO: renamed from: m */
    public void mo63799m(String str) {
        Frag fragM63770Y = m63770Y();
        if (fragM63770Y instanceof PhotoAlbumFallsFeedFrag) {
            ((PhotoAlbumFallsFeedFrag) fragM63770Y).m63614o5(str);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final int m63800m6() {
        List<String> list = this.f41267O0;
        if (list != null) {
            return list.indexOf(getString(R$string.f39072h5));
        }
        return 0;
    }

    /* JADX INFO: renamed from: n6 */
    public final int m63801n6() {
        return m63805p6();
    }

    /* JADX INFO: renamed from: n7 */
    public final void m63802n7(C11278g c11278g) {
        if (c11278g == null) {
            return;
        }
        this.f41283W0 = c11278g;
        m63713c6(m63815u6(c11278g));
        m63779d6(c11278g.f41312c);
        int iM63805p6 = m63805p6();
        if (iM63805p6 >= 0) {
            ImageView[] imageViewArr = this.f41275S0;
            if (iM63805p6 < imageViewArr.length) {
                xdl0.m208344M(imageViewArr[this.f41267O0.indexOf(getString(R$string.f39079i5))], c11278g.f41313d);
            }
        }
        if (c11278g.f41313d) {
            FeedModule.f38855d.m209564ud(Calendar.getInstance().getTimeInMillis());
        }
        boolean z = true;
        boolean z2 = c11278g.f41312c > 0 && !m63742C6();
        if (z2) {
            kjb0.m146179B(act(), c11278g.f41312c);
        } else {
            kjb0.m146179B(act(), -1);
        }
        if (!nkg.m159879f0()) {
            boolean z3 = !z2 && ((!nkg.m159868Y() && m63815u6(c11278g) > 0) || c11278g.f41313d || (!c11278g.f41315f && c11278g.f41314e)) && !m63742C6();
            boolean z4 = this.f41288Z;
            if (z2) {
                m63790i6(null, z4, false, m63815u6(c11278g), c11278g.f41314e, true);
                kjb0.m146178A(act(), false);
            } else {
                m63790i6(null, z4, z3 || this.f41287Y0, m63815u6(c11278g), c11278g.f41314e, false);
                kjb0.m146178A(act(), z3 || this.f41287Y0);
            }
            if (!z3 && !this.f41287Y0) {
                z = false;
            }
            this.f41288Z = z;
            return;
        }
        boolean z5 = !z2 && (m63815u6(c11278g) > 0 || c11278g.f41313d || (!c11278g.f41315f && c11278g.f41314e)) && !m63742C6();
        boolean z6 = this.f41288Z;
        if (!z6 || !c11278g.f41314e) {
            m63790i6(null, z6, z5, m63815u6(c11278g), c11278g.f41314e, z2);
            kjb0.m146178A(act(), z5);
            this.f41288Z = z5;
        } else {
            mwh.m156632d().m156645n(4);
            if (!z5 && !c11278g.f41314e) {
                z = false;
            }
            this.f41288Z = z;
        }
    }

    /* JADX INFO: renamed from: o6 */
    public final int m63803o6() {
        List<String> list = this.f41267O0;
        if (list != null) {
            return list.indexOf("喜欢");
        }
        return 0;
    }

    /* JADX INFO: renamed from: o7 */
    public final void m63804o7(View view) {
        dah dahVar = this.f41291b1;
        if (dahVar != null && dahVar.isShowing()) {
            this.f41291b1.dismiss();
            return;
        }
        dah dahVar2 = new dah(this, act(), new d30() { // from class: l.c970
            @Override // p149l.d30
            public final void call() {
                this.f79868a.m63778c7();
            }
        });
        this.f41291b1 = dahVar2;
        VImage[] vImageArr = this.f41271Q0;
        if (vImageArr != null && vImageArr.length > 0) {
            dahVar2.setOnDismissListener(new C11274c());
        }
        ed80.m115791c(this.f41291b1, view, 0, t100.f167256e, 80);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41268P.m109033i();
        this.f41266O.m109033i();
        if (nkg.m159868Y()) {
            this.f41264N.m109033i();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        mwh.m156632d().m156651t();
        this.f41268P.m109034j();
        this.f41266O.m109034j();
        if (nkg.m159868Y()) {
            this.f41264N.m109034j();
        }
        if (NullChecker.m81303a(this.f41265N0)) {
            this.f41265N0.m63835o();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        f41241g1 = z;
        uwh.m196129a().f178644a.onNext(Boolean.valueOf(!z));
        if (nkg.m159857N() && NullChecker.m81303a(this.f41265N0)) {
            for (int i = 0; i < this.f41265N0.f41301a.size(); i++) {
                Fragment fragment = (Fragment) this.f41265N0.f41301a.get(i);
                if (fragment instanceof PhotoAlbumFeedFrag) {
                    ((PhotoAlbumFeedFrag) fragment).m64381e5(z);
                }
            }
        }
        if (z) {
            if (NullChecker.m81304b(act())) {
                if (NullChecker.m81303a(this.f41281V0) && this.f41281V0.isShowing()) {
                    this.f41281V0.dismiss();
                }
                if (NullChecker.m81303a(this.f41262M) && this.f41262M.isShowing()) {
                    this.f41262M.dismiss();
                }
                if (NullChecker.m81303a(this.f41291b1) && this.f41291b1.isShowing()) {
                    this.f41291b1.dismiss();
                }
                PhotoAlbumPictureView.m63859u(act().getWindow().getDecorView(), false);
            }
            e51.m114745J(this.f41290a1);
            eng.m117268o();
            m63725m7();
            m63735v7();
            m63737w6();
            m63781e6();
        } else {
            m63814t7(NullChecker.m81303a(this.f41283W0) ? this.f41283W0.f41312c : 0);
            if (this.f41295k0 == 10) {
                mwh.m156632d().m156644m(this.f41295k0, m63809r6());
            } else {
                mwh.m156632d().m156643l(this.f41295k0);
            }
            uwh.m196129a().f178645b = true;
            if (this.f41277T0 == 1) {
                FeedModule.f38855d.f193028Y0.onNext(Boolean.FALSE);
            }
            m63775a6();
            if (u2h.m191495d()) {
                m63723l7();
            }
            m63819w7();
        }
        m63773Z5(z);
        this.f41276T.onNext(Boolean.valueOf(z));
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if ("moment".equals(this.f41278U)) {
            this.f41257J0.mo99779q();
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final int m63805p6() {
        List<String> list = this.f41267O0;
        if (list != null) {
            return list.indexOf(getString(R$string.f39079i5));
        }
        return 1;
    }

    /* JADX INFO: renamed from: p7 */
    public final void m63806p7(TextView textView) {
        if (NullChecker.m81304b(textView)) {
            textView.setTextColor(Color.parseColor("#ff3228"));
            textView.setBackgroundResource(f3c0.f94438V0);
            textView.setTextSize(10.0f);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return m63794j6();
    }

    /* JADX INFO: renamed from: q6 */
    public final int m63807q6() {
        return nkg.m159868Y() ? 15 : 3;
    }

    /* JADX INFO: renamed from: q7 */
    public void m63808q7(int i, int i2) {
        VText vText = (VText) this.f41273R0[i];
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) vText.getLayoutParams();
        if (i2 < 10) {
            ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = t100.m186890d(10.0f);
        } else if (i2 <= 99) {
            ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = t100.m186890d(6.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = t100.m186890d(0.0f);
        }
        vText.setLayoutParams(c0220a);
    }

    /* JADX INFO: renamed from: r6 */
    public final String m63809r6() {
        if (NullChecker.m81304b(this.f41250G) && this.f41250G.getSelectedTabPosition() == 0) {
            return nkg.m159868Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: r7 */
    public void m63810r7() {
        Fragment fragmentM63832l = this.f41265N0.m63832l(this.f41277T0);
        if (this.f41279U0 || !(fragmentM63832l instanceof PhotoAlbumFeedFrag)) {
            return;
        }
        ((PhotoAlbumFeedFrag) fragmentM63832l).m64385i5(new e30() { // from class: l.x870
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191443a.m63780d7((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public final String m63811s6(int i) {
        if (NullChecker.m81304b(this.f41250G) && i == 0) {
            return nkg.m159868Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: s7 */
    public final boolean m63812s7() {
        long jLongValue = FeedModule.f38855d.m209596z7().longValue();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 4, 0, 0);
        return i >= 4 && jLongValue < calendar2.getTimeInMillis();
    }

    @NotNull
    /* JADX INFO: renamed from: t6 */
    public final String m63813t6() {
        CharSequence pageTitle = this.f41265N0.getPageTitle(this.f41242A.getCurrentItem());
        if ("喜欢".equals(pageTitle)) {
            return "like";
        }
        if (getString(R$string.f39072h5).equals(pageTitle)) {
            return "follow";
        }
        return getString(R$string.f39079i5).equals(pageTitle) ? "nearby" : "other";
    }

    /* JADX INFO: renamed from: t7 */
    public final void m63814t7(int i) {
        if (f41241g1 || this.f41261L0) {
            return;
        }
        String str = "这里有" + ((Object) this.f41248F.getText()) + "条消息在等你回复～";
        if (m63771Y5(i)) {
            fm20.f98241d.put(Long.valueOf(mqi0.m155944o()));
            this.f41259K0 = C4348d.m20896l().m20908t(new C4345a(act()).m20849D(str).m20870k(act().getResources().getColor(e1c0.f88798n)).m20855J(13.0f).m20850E(true).m20861b(3000L).m20882x(-t100.f167255d).m20875q(C4345a.f15683Q | C4345a.f15682P).m20873o(C4345a.f15682P, t100.m186890d(6.0f)), this.f41245D);
            this.f41261L0 = true;
        }
    }

    /* JADX INFO: renamed from: u6 */
    public final int m63815u6(C11278g c11278g) {
        int i;
        if (nkg.m159879f0()) {
            return c11278g.f41311b;
        }
        int i2 = c11278g.f41310a;
        return (i2 != 0 || (i = this.f41247E0) <= 0) ? i2 : i;
    }

    /* JADX INFO: renamed from: u7 */
    public final void m63816u7() {
        if (isHidden() || cjh.m107156b()) {
            return;
        }
        fm20.f98242e.put(Long.valueOf(System.currentTimeMillis()));
        if (!u2h.m191493b() || ic50.m135327j().m135333f().m145226M("p_alert_positioning_authority_explore_popup", true)) {
            if (u2h.m191493b()) {
                ic50.m135327j().m135333f().m145241b0("p_alert_positioning_authority_explore_popup", 0, true);
            }
            FeedModule.m60222H().showLocationPermissionCallbackDlg(act(), new d30() { // from class: l.b970
                @Override // p149l.d30
                public final void call() {
                    this.f74204a.m63782e7();
                }
            }, null, false, true, "p_alert_positioning_authority_explore_popup");
        }
    }

    @Override // p149l.zzl
    /* JADX INFO: renamed from: v3 */
    public void mo63817v3(String str) {
    }

    /* JADX INFO: renamed from: v6 */
    public final void m63818v6() {
        if (m63743D6()) {
            C4348d.m20896l().m20900k(this.f41249F0);
            this.f41249F0 = null;
        }
    }

    /* JADX INFO: renamed from: w7 */
    public final void m63819w7() {
        p6j0.m167670d("e_moment_unread_notes_history", m63794j6(), new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: x6 */
    public final void m63820x6(C11278g c11278g) {
        if (nkg.m159879f0()) {
            int i = c11278g.f41311b;
            if (i <= 0 || this.f41296p0) {
                return;
            }
            this.f41247E0 = i;
            return;
        }
        int i2 = c11278g.f41310a;
        if (i2 <= 0 || this.f41296p0) {
            return;
        }
        this.f41247E0 = i2;
    }

    /* JADX INFO: renamed from: x7, reason: merged with bridge method [inline-methods] */
    public final C22306c<C11278g> m63765V6() {
        FeedModule.f38855d.m209410Yc("");
        return mkd0.m154986t(ijb0.m136570j(), FeedModule.f38855d.f193028Y0.asObservable(), C22306c.just(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)), FeedModule.m60222H().isHideRedByNewUser(), new z9j() { // from class: l.s870
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f163017a.m63784f7((Counter) obj, (Boolean) obj2, (Double) obj3, (Boolean) obj4);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        m63766W5();
    }

    /* JADX INFO: renamed from: y6 */
    public final void m63822y6(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f41242A.setCurrentItem(i);
        PutongFrag putongFrag = this.f41255I0.get(i);
        boolean z = (getString(R$string.f39072h5).equals(this.f41265N0.getPageTitle(i)) && "喜欢".equals(this.f41265N0.getPageTitle(i))) ? false : true;
        if ((putongFrag instanceof PhotoAlbumFeedFrag) && z) {
            ((PhotoAlbumFeedFrag) putongFrag).m64372U4().m100605j0();
        } else if (photoAlbumFeedFrag != null) {
            photoAlbumFeedFrag.m64372U4().m100605j0();
        }
    }

    /* JADX INFO: renamed from: y7 */
    public final void m63823y7(int i) {
        ImageView imageView = this.f41246E;
        if (i > 0) {
            imageView.setImageResource(f3c0.f94396P0);
            xdl0.m208344M(this.f41248F, true);
            VText vText = this.f41248F;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
        } else {
            imageView.setImageResource(f3c0.f94389O0);
            xdl0.m208344M(this.f41248F, false);
        }
        m63814t7(i);
    }

    /* JADX INFO: renamed from: z6 */
    public final void m63824z6() {
        if (nkg.m159868Y() && !nkg.m159879f0()) {
            duringCreated(FeedModule.f38855d.f192977B0).subscribe(mkd0.m154955G(new e30() { // from class: l.d970
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84939a.m63763U6((String) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.d870
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f84835a.m63765V6();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.e870
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89810a.m63767W6((PhotoAlbumFrag.C11278g) obj);
            }
        }, new e30() { // from class: l.f870
            @Override // p149l.e30
            public final void call(Object obj) {
                PhotoAlbumFrag.m63688N4((Throwable) obj);
            }
        }));
        duringCreated(oe40.m163804F()).subscribe(mkd0.m154955G(new e30() { // from class: l.g870
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101480a.m63750J6((Moment) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.h870
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f106394a.m63751K6((C4319c) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.i870
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedModule.f38855d.f193028Y0.onNext(Boolean.TRUE);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.j870
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.k870
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121782a.m63752L6((C4319c) obj);
            }
        }));
        if (wc40.m202629f() || (nkg.m159868Y() && !nkg.m159879f0())) {
            creates(new e30() { // from class: l.l870
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f126790a.m63754N6((Bundle) obj);
                }
            });
        }
        duringCreated(kjb0.m146205p()).subscribe(mkd0.m154955G(new e30() { // from class: l.e970
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89926a.m63756O6((Boolean) obj);
            }
        }));
        duringCreated(C11245a.m62716c1()).subscribe(mkd0.m154955G(new e30() { // from class: l.f970
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96457a.m63758P6((String) obj);
            }
        }));
        if (this.f41280V) {
            creates(new e30() { // from class: l.g970
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f101547a.m63761S6((Bundle) obj);
                }
            });
            duringCreated(this.f41284X).subscribe(mkd0.m154956H(new e30() { // from class: l.h970
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f106519a.m63762T6((Long) obj);
                }
            }, new e30() { // from class: l.i970
                @Override // p149l.e30
                public final void call(Object obj) {
                    PhotoAlbumFrag.m63721k5((Throwable) obj);
                }
            }));
        }
        act().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.j970
            @Override // p149l.e30
            public final void call(Object obj) {
                PhotoAlbumFrag.m63715e5((C4319c) obj);
            }
        }));
    }
}
