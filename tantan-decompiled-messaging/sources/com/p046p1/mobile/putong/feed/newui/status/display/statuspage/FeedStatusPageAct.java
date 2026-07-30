package com.p046p1.mobile.putong.feed.newui.status.display.statuspage;

import android.R;
import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Meet;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p046p1.mobile.putong.feed.newui.status.aquare.FeedStatusListTabFrag;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p147v.navigationbar.VNavigationTabLayout;
import p149l.b5c0;
import p149l.bkb0;
import p149l.bt0;
import p149l.c3i;
import p149l.dyl;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.f3c0;
import p149l.hpd0;
import p149l.j760;
import p149l.mkd0;
import p149l.nkg;
import p149l.o6c0;
import p149l.osi0;
import p149l.qib0;
import p149l.s1i;
import p149l.sub0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xia;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStatusPageAct extends PutongAct implements sub0 {

    /* JADX INFO: renamed from: A */
    public static C22392a<List<BubbleInfo>> f42748A = C22392a.m221513c(new ArrayList());

    /* JADX INFO: renamed from: B */
    public static C22393b<j760<Boolean, Boolean>> f42749B = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f42750c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f42751d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f42752e;

    /* JADX INFO: renamed from: f */
    public DiscoveryPager f42753f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f42754g;

    /* JADX INFO: renamed from: h */
    public VImage f42755h;

    /* JADX INFO: renamed from: i */
    public VRelative f42756i;

    /* JADX INFO: renamed from: j */
    public VImage f42757j;

    /* JADX INFO: renamed from: k */
    public VImage f42758k;

    /* JADX INFO: renamed from: l */
    public VImage f42759l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f42760m;

    /* JADX INFO: renamed from: o */
    public FeedStatusSquareTabFrag f42762o;

    /* JADX INFO: renamed from: p */
    public List<PutongFrag> f42763p;

    /* JADX INFO: renamed from: s */
    public View f42766s;

    /* JADX INFO: renamed from: t */
    public VNavigationTabLayout f42767t;

    /* JADX INFO: renamed from: u */
    public View f42768u;

    /* JADX INFO: renamed from: v */
    public String f42769v;

    /* JADX INFO: renamed from: x */
    public int f42771x;

    /* JADX INFO: renamed from: y */
    public boolean f42772y;

    /* JADX INFO: renamed from: n */
    public hpd0 f42761n = new hpd0("HASSHOWSTATEPAGEACTPOSTTVGUIDEBUBBLE" + FeedModule.m60221F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: q */
    public C11334d f42764q = null;

    /* JADX INFO: renamed from: r */
    public List<String> f42765r = new ArrayList();

    /* JADX INFO: renamed from: w */
    public TextView[] f42770w = new TextView[2];

    /* JADX INFO: renamed from: z */
    public final Runnable f42773z = new RunnableC11333c();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$a */
    public class C11331a implements Animator.AnimatorListener {
        public C11331a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedStatusPageAct.this.m65575u2();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$b */
    public class C11332b extends AnimListener {
        public C11332b() {
        }

        @Override // com.tantanapp.media.ttmediaeffect.anim.AnimListener, com.tantanapp.media.ttmediaeffect.anim.IAnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$c */
    public class RunnableC11333c implements Runnable {
        public RunnableC11333c() {
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m65581d(List list, ConversationStatus conversationStatus) {
            boolean zM199527U = vqg.m199527U(conversationStatus);
            FeedStatusPageAct feedStatusPageAct = FeedStatusPageAct.this;
            if (!zM199527U) {
                feedStatusPageAct.f42762o.m65690s6(((Meet) list.get(0)).type, ((Meet) list.get(0)).f39229id, ((Meet) list.get(0)).userId);
                return;
            }
            if (feedStatusPageAct.getLifecycle().getState() == Lifecycle.State.RESUMED) {
                osi0.m165783g("暂时没有遇到有趣的灵魂");
            }
            FeedStatusPageAct.this.m65575u2();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m65582e(Envelope envelope) {
            if (xdl0.m208349O0(FeedStatusPageAct.this.f42754g)) {
                final List<Meet> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).meets;
                if (vwb.m200296J(list) || list.size() == 0) {
                    osi0.m165783g("暂时没有遇到有趣的灵魂");
                    FeedStatusPageAct.this.m65575u2();
                } else if (!TextUtils.isEmpty(list.get(0).userId)) {
                    FeedStatusPageAct.this.duringCreated(FeedModule.m60222H().mo30744ab(list.get(0).userId)).subscribe(mkd0.m154955G(new e30() { // from class: l.b3i
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f73222a.m65581d(list, (ConversationStatus) obj);
                        }
                    }));
                } else {
                    osi0.m165783g("暂时没有遇到有趣的灵魂");
                    FeedStatusPageAct.this.m65575u2();
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m65583f(Throwable th) {
            if (xdl0.m208349O0(FeedStatusPageAct.this.f42754g)) {
                boolean z = th instanceof TantanException.Client.TantanForbidden;
                if (z && ((TantanException.Client.TantanForbidden) th).code == 40350) {
                    osi0.m165783g("今天的偶遇机会已用尽，明天再来邂逅");
                    FeedStatusPageAct.this.m65575u2();
                    return;
                }
                if ((z && ((TantanException.Client.TantanForbidden) th).code == 40351) || (z && ((TantanException.Client.TantanForbidden) th).code == 40352)) {
                    FeedStatusPageAct.this.f42762o.m65691t6(((TantanException.Client.TantanForbidden) th).code);
                } else {
                    osi0.m165783g("暂时没有遇到有趣的灵魂");
                }
                FeedStatusPageAct.this.m65575u2();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedStatusPageAct.this.duringCreated(FeedModule.f38855d.m209565v7()).subscribe(mkd0.m154956H(new e30() { // from class: l.z2i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201235a.m65582e((Envelope) obj);
                }
            }, new e30() { // from class: l.a3i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67368a.m65583f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$d */
    public class C11334d extends FragmentPagerAdapter implements ViewPager.InterfaceC0716j, dyl {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f42777a;

        /* JADX INFO: renamed from: b */
        public Method f42778b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f42779c;

        public C11334d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f42777a = new ArrayList();
            this.f42778b = null;
            this.f42779c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f42778b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.m81296c(e);
                this.f42778b = null;
            } catch (SecurityException e2) {
                CrashHelper.m81296c(e2);
                this.f42778b = null;
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
            return this.f42777a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f42777a.get(i);
        }

        @Override // p149l.w660
        public CharSequence getPageTitle(int i) {
            return (CharSequence) FeedStatusPageAct.this.f42765r.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: j */
        public View m65584j(int i) {
            View viewInflate = FeedStatusPageAct.this.act().inflater().inflate(o6c0.f142317x3, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(b5c0.f73556d2);
            FeedStatusPageAct.this.f42770w[i] = textView;
            textView.setText((CharSequence) FeedStatusPageAct.this.f42765r.get(i));
            return viewInflate;
        }

        /* JADX INFO: renamed from: k */
        public void m65585k(List<PutongFrag> list) {
            FeedStatusPageAct.this.f42763p = list;
            this.f42777a.clear();
            if (NullChecker.m81304b(list)) {
                this.f42777a.addAll(list);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            PhotoAlbumPictureView.m63859u(FeedStatusPageAct.this.act().getWindow().getDecorView(), false);
            FeedStatusPageAct.this.act().hideInput();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$e */
    public class C11335e implements VNavigationTabLayout.InterfaceC22621d {
        public C11335e() {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: a */
        public void mo63839a(VNavigationTabLayout.C22623f c22623f) {
            TextPaint paint;
            int iM223687f = c22623f.m223687f();
            if (iM223687f == 0) {
                FeedStatusPageAct.f42749B.onNext(new j760<>(Boolean.FALSE, Boolean.TRUE));
            }
            TextView textView = FeedStatusPageAct.this.f42770w[iM223687f];
            if (!NullChecker.m81303a(textView) || (paint = textView.getPaint()) == null) {
                return;
            }
            paint.setFakeBoldText(false);
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: b */
        public void mo63840b(VNavigationTabLayout.C22623f c22623f) {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: c */
        public void mo63841c(VNavigationTabLayout.C22623f c22623f) {
            TextPaint paint;
            int iM223687f = c22623f.m223687f();
            FeedStatusPageAct.this.f42771x = iM223687f;
            if (NullChecker.m81303a(FeedStatusPageAct.this.f42768u)) {
                xdl0.m208344M(FeedStatusPageAct.this.f42768u, iM223687f == 0);
            }
            if (iM223687f == 0) {
                C22393b<j760<Boolean, Boolean>> c22393b = FeedStatusPageAct.f42749B;
                Boolean bool = Boolean.TRUE;
                c22393b.onNext(new j760<>(bool, bool));
            } else {
                FeedStatusPageAct.this.f42753f.setScrollble(true);
            }
            TextView textView = FeedStatusPageAct.this.f42770w[iM223687f];
            if (!NullChecker.m81303a(textView) || (paint = textView.getPaint()) == null) {
                return;
            }
            paint.setFakeBoldText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m65541A2() {
        m65572L2(this.f42751d.getRightIconContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public /* synthetic */ void m65542C2(View view) {
        if (this.f42772y) {
            e51.m114745J(this.f42773z);
            zvf0.m220396r("e_meet_back", "p_meet_greet");
            m65575u2();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: H2 */
    public static List<BubbleInfo> m65543H2(List<BubbleInfo> list) {
        return vwb.m200339n(list, new w9j() { // from class: l.w2i
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BubbleInfo) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m65551d2(View view) {
    }

    /* JADX INFO: renamed from: o2 */
    private void m65559o2() {
        xdl0.m208360X(this.f42751d, xdl0.m208331F0());
        xdl0.m208360X(this.f42754g, xdl0.m208331F0());
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m65560p2(Context context, String str, String str2, boolean z, String str3) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("stateId", str);
        intent.putExtra("userId", str2);
        intent.putExtra("needAppendFeed", z);
        intent.putExtra("from", str3);
        f42748A.onNext(new ArrayList());
        return intent;
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m65561q2(Context context, List<BubbleInfo> list, int i, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("initialShowIndex", i);
        intent.putExtra("next", str);
        intent.putExtra("from", str2);
        f42748A.onNext(m65543H2(list));
        return intent;
    }

    /* JADX INFO: renamed from: r */
    private void m65562r() {
        m65559o2();
        xdl0.m208344M(this.f42751d, true);
        xdl0.m208344M(this.f42752e, true);
        this.f42751d.setTitle(FeedModule.f38852a.getString(R$string.f39062g2));
        this.f42751d.setLeftIconAsBack(this);
        this.f42751d.setLeftIconResource(f3c0.f94348I3);
        this.f42765r.add(FeedModule.f38852a.getString(R$string.f38946O0));
        this.f42765r.add(FeedModule.f38852a.getString(R$string.f39056f3));
        ArrayList arrayList = new ArrayList();
        FeedStatusListTabFrag feedStatusListTabFragM65472S4 = FeedStatusListTabFrag.m65472S4(getIntent().getIntExtra("initialShowIndex", 0), getIntent().getStringExtra("stateId"), getIntent().getStringExtra("next"), getIntent().getBooleanExtra("needAppendFeed", false), getIntent().getStringExtra("userId"), getIntent().getStringExtra("from"), getIntent().getBooleanExtra("stateSquare", false));
        BubbleInfo bubbleInfo = (BubbleInfo) getIntent().getSerializableExtra("bubbleInfo");
        if (nkg.m159889k0()) {
            FeedStatusSquareTabFrag feedStatusSquareTabFragM65651y5 = FeedStatusSquareTabFrag.m65651y5(bubbleInfo, getIntent().getStringExtra("from"));
            this.f42762o = feedStatusSquareTabFragM65651y5;
            arrayList.add(feedStatusSquareTabFragM65651y5);
        } else {
            arrayList.add(FeedModule.m60222H().mo30772i7(getIntent().getStringExtra("from"), bubbleInfo, o6c0.f142327z));
        }
        arrayList.add(feedStatusListTabFragM65472S4);
        this.f42764q.m65585k(arrayList);
        this.f42753f.setOnPageChangeListener(this.f42764q);
        this.f42753f.setAdapter(this.f42764q);
        this.f42752e.setBackgroundColor(act().getResources().getColor(e1c0.f88803p0));
        this.f42752e.setupViewPager(this.f42753f);
        VNavigationTabLayout tabLayout = this.f42752e.getTabLayout();
        this.f42767t = tabLayout;
        if (tabLayout != null) {
            tabLayout.setBackgroundColor(act().getResources().getColor(e1c0.f88803p0));
        }
        if (nkg.m159907t0()) {
            View viewInflate = LayoutInflater.from(this).inflate(o6c0.f142289t3, (ViewGroup) null);
            this.f42768u = viewInflate;
            this.f42752e.setRightIconViews(viewInflate);
            xdl0.m208329E0(this.f42768u, new View.OnClickListener() { // from class: l.q2i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f152274a.m65564y2(view);
                }
            });
        }
        int i = 0;
        while (true) {
            VNavigationTabLayout vNavigationTabLayout = this.f42767t;
            Objects.requireNonNull(vNavigationTabLayout);
            if (i >= vNavigationTabLayout.getTabCount()) {
                break;
            }
            View viewM65584j = this.f42764q.m65584j(i);
            VNavigationTabLayout.C22623f c22623fM223627w = this.f42767t.m223627w(i);
            Objects.requireNonNull(c22623fM223627w);
            c22623fM223627w.m223695n(viewM65584j);
            VNavigationTabLayout.C22623f c22623fM223627w2 = this.f42767t.m223627w(i);
            Objects.requireNonNull(c22623fM223627w2);
            VNavigationTabLayout.TabView tabView = c22623fM223627w2.f209872i;
            int iM186890d = t100.m186890d(i == 0 ? 4.0f : 6.0f);
            VNavigationTabLayout.C22623f c22623fM223627w3 = this.f42767t.m223627w(i);
            Objects.requireNonNull(c22623fM223627w3);
            int paddingTop = c22623fM223627w3.f209872i.getPaddingTop();
            VNavigationTabLayout.C22623f c22623fM223627w4 = this.f42767t.m223627w(i);
            Objects.requireNonNull(c22623fM223627w4);
            tabView.setPadding(iM186890d, paddingTop, 0, c22623fM223627w4.f209872i.getPaddingBottom());
            i++;
        }
        this.f42767t.setOnTabSelectedListener((VNavigationTabLayout.InterfaceC22621d) new C11335e());
        this.f42753f.setCurrentItem(0);
        e51.m114743H(this.act, new Runnable() { // from class: l.r2i
            @Override // java.lang.Runnable
            public final void run() {
                this.f157419a.m65565z2();
            }
        }, 200L);
        duringCreated(FeedModule.f38855d.m209307K7()).subscribe(mkd0.m154955G(new e30() { // from class: l.s2i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161985a.m65566B2((Map) obj);
            }
        }));
        xdl0.m208329E0(this.f42755h, new View.OnClickListener() { // from class: l.t2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167479a.m65542C2(view);
            }
        });
        if (nkg.m159889k0()) {
            duringCreated(xia.f192973M1).subscribe(mkd0.m154955G(new e30() { // from class: l.u2i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f173489a.m65567D2((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m65563r2(Context context, boolean z, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("stateSquare", z);
        intent.putExtra("bubbleInfo", bubbleInfo);
        intent.putExtra("from", str);
        f42748A.onNext(new ArrayList());
        return intent;
    }

    public static void showView(View view) {
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        view.setAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m65564y2(View view) {
        if (NullChecker.m81303a(this.f42762o)) {
            this.f42762o.m65697z5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m65565z2() {
        if (!getIntent().getBooleanExtra("stateSquare", false)) {
            this.f42753f.setCurrentItem(1);
        }
    }

    @Override // p149l.sub0
    @NotNull
    /* JADX INFO: renamed from: B */
    public Animator mo41784B() {
        return null;
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m65566B2(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m60222H().me_().f56011id);
        this.f42751d.setRightIconViews(m65569F2(bubbleInfo));
        VLinear rightIconContainer = this.f42751d.getRightIconContainer();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rightIconContainer.getLayoutParams();
        marginLayoutParams.rightMargin = t100.m186890d(4.0f);
        rightIconContainer.setLayoutParams(marginLayoutParams);
        View childAt = this.f42751d.getRightIconContainer().getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.height = t100.m186890d(34.0f);
        childAt.setLayoutParams(layoutParams);
        if (bubbleInfo == null) {
            e51.m114743H(this.act, new Runnable() { // from class: l.v2i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f179552a.m65541A2();
                }
            }, 800L);
        }
    }

    @Override // p149l.sub0
    @NotNull
    /* JADX INFO: renamed from: C */
    public View mo41785C() {
        return this.f42750c;
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m65567D2(Boolean bool) {
        if (bool.booleanValue()) {
            this.f42772y = false;
            Animator animatorM103743p = bt0.m103743p(this.f42754g, "alpha", 0L, 100L, new LinearInterpolator(), 1.0f, 0.0f);
            animatorM103743p.addListener(new C11331a());
            animatorM103743p.start();
        }
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m65568E2(BubbleInfo bubbleInfo, View view) {
        int i = this.f42771x;
        zvf0.m220399u("e_set_my_state", i == 0 ? "p_state_explore" : "p_other_state", j760.m140076a("source_page", i == 0 ? "p_state_explore" : "p_other_state"), j760.m140076a("state_id", bubbleInfo == null ? "" : bubbleInfo.f38730id), j760.m140076a("owner_id", bubbleInfo == null ? "" : bubbleInfo.owner.f38803id));
        if (bubbleInfo != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfo);
            startActivity(m65561q2(this, arrayList, 0, "", this.f42771x != 1 ? "p_my_state" : "p_other_state"));
        } else if (NullChecker.m81303a(FeedModule.f38856e.f109186H) && NullChecker.m81303a(FeedModule.f38856e.f109186H.m221515e()) && TEnum.equals(FeedModule.f38856e.f109186H.m221515e().status, "start")) {
            osi0.m165783g("状态发布中...");
        } else {
            s1i.m181966f(this, this.f42771x != 0 ? "p_other_state" : "p_state_explore");
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final View m65569F2(final BubbleInfo bubbleInfo) {
        int i = this.f42771x;
        zvf0.m220368A("e_set_my_state", i == 0 ? "p_state_explore" : "p_other_state", j760.m140076a("source_page", i == 0 ? "p_state_explore" : "p_other_state"), j760.m140076a("state_id", bubbleInfo == null ? "" : bubbleInfo.f38730id), j760.m140076a("owner_id", bubbleInfo != null ? bubbleInfo.owner.f38803id : ""));
        View viewInflate = LayoutInflater.from(this).inflate(o6c0.f142041H2, (ViewGroup) null);
        VLinear vLinear = (VLinear) viewInflate.findViewById(b5c0.f73471C1);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(b5c0.f73498L1);
        VText vText = (VText) viewInflate.findViewById(b5c0.f73495K1);
        TextPaint paint = vText.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        xdl0.m208344M(vDraweeView, bubbleInfo != null);
        if (bubbleInfo == null) {
            vLinear.setPadding(t100.m186890d(13.0f), 0, t100.m186890d(13.0f), 0);
        } else {
            vLinear.setPadding(t100.m186890d(10.0f), 0, t100.m186890d(12.0f), 0);
        }
        vLinear.setBackgroundResource(bubbleInfo == null ? f3c0.f94606q5 : f3c0.f94614r5);
        vText.setTextColor(Color.parseColor(bubbleInfo == null ? "#ffffff" : "#1a1a1b"));
        vText.setTextSize(bubbleInfo == null ? 14.0f : 13.0f);
        vText.setText(bubbleInfo != null ? bubbleInfo.emotion.text : FeedModule.f38852a.getString(R$string.f39055f2));
        if (NullChecker.m81303a(bubbleInfo)) {
            bkb0 bkb0Var = qib0.f154691G;
            String str = bubbleInfo.emotion.emojiUrl;
            int i2 = t100.f167268q;
            bkb0Var.m102325I0(vDraweeView, str, i2, i2);
        }
        xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.y2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195617a.m65568E2(bubbleInfo, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: I2 */
    public void m65570I2() {
        this.f42754g.setOnClickListener(new View.OnClickListener() { // from class: l.x2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedStatusPageAct.m65551d2(view);
            }
        });
        showView(this.f42754g);
        this.f42772y = true;
        m65571K2();
        xdl0.m208344M(this.f42754g, true);
        this.f42760m.loadAnimWithListener("feed_state_meet.svga", -1, new C11332b(), true);
        e51.m114743H(this, this.f42773z, 1800L);
    }

    /* JADX INFO: renamed from: K2 */
    public void m65571K2() {
        this.pageHelper.m109027c();
        this.pageHelper.m109041q("p_meet_greet");
        this.pageHelper.m109036l();
    }

    /* JADX INFO: renamed from: L2 */
    public final void m65572L2(VLinear vLinear) {
        if (this.f42761n.get().booleanValue()) {
            return;
        }
        VText vText = new VText(act());
        int i = xdl0.f192403e;
        vText.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        vText.setText("分享状态，让更多人看到你");
        int i2 = t100.f167264m;
        vText.setPadding(i2, t100.m186890d(10.0f), i2, t100.m186890d(10.0f));
        vText.setTextColor(-1);
        if (NullChecker.m81303a(vText.getPaint())) {
            vText.getPaint().setFakeBoldText(true);
        }
        this.f42769v = C4348d.m20896l().m20908t(new C4345a(act()).m20877s(vText).m20864e(true).m20870k(act().getResources().getColor(e1c0.f88798n)).m20855J(13.0f).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20883y(true).m20881w(t100.f167261j).m20875q(C4345a.f15680N), vLinear);
        this.f42761n.put(Boolean.TRUE);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (nkg.m159848E() && !m65577w2()) {
            this.f42764q = new C11334d(getSupportFragmentManager());
            this.f42766s = m65573n2(layoutInflater, viewGroup);
            m65562r();
            return this.f42766s;
        }
        if (this.act.fragmentManager().m2554h0(R.id.content) != null) {
            return null;
        }
        this.act.fragmentManager().m2567m().m2811s(R.id.content, FeedStatusListTabFrag.m65472S4(getIntent().getIntExtra("initialShowIndex", 0), getIntent().getStringExtra("stateId"), getIntent().getStringExtra("next"), getIntent().getBooleanExtra("needAppendFeed", false), getIntent().getStringExtra("userId"), getIntent().getStringExtra("from"), getIntent().getBooleanExtra("stateSquare", false))).mo2707i();
        this.act.fragmentManager().m2545e0();
        return null;
    }

    /* JADX INFO: renamed from: n2 */
    public View m65573n2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c3i.m105028b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && NullChecker.m81303a(intent) && NullChecker.m81303a(intent.getExtras())) {
            if (i2 == 10087 && NullChecker.m81303a(this.f42762o)) {
                this.f42762o.m65690s6(intent.getExtras().getString("type"), intent.getExtras().getString("id"), intent.getExtras().getString(Oauth2AccessToken.KEY_UID));
            }
            if (i2 == 10088 && NullChecker.m81303a(this.f42762o)) {
                this.f42762o.m65691t6(intent.getExtras().getInt("code"));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.f42772y) {
            lambda$debugItems$19();
            return;
        }
        e51.m114745J(this.f42773z);
        zvf0.m220396r("e_meet_back", "p_meet_greet");
        m65575u2();
    }

    @Override // com.p046p1.mobile.android.app.Act, p149l.d0e
    public void onDialogAttachToWindow(Dialog dialog) {
        super.onDialogAttachToWindow(dialog);
        if (this.f42771x == 0) {
            C22393b<j760<Boolean, Boolean>> c22393b = f42749B;
            Boolean bool = Boolean.FALSE;
            c22393b.onNext(new j760<>(bool, bool));
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, p149l.d0e
    public void onDialogDetachFromWindow(Dialog dialog) {
        super.onDialogDetachFromWindow(dialog);
        if (this.f42771x == 0) {
            f42749B.onNext(new j760<>(Boolean.TRUE, Boolean.FALSE));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        m65576v2();
    }

    @Override // p149l.sub0
    @NotNull
    /* JADX INFO: renamed from: p */
    public View mo41786p() {
        return this.f42766s;
    }

    /* JADX INFO: renamed from: s2 */
    public void m65574s2() {
        this.pageHelper.m109041q("p_meet_greet");
        this.pageHelper.m109035k();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // p149l.sub0
    public void stop() {
    }

    /* JADX INFO: renamed from: u2 */
    public void m65575u2() {
        if (NullChecker.m81303a(this.f42762o)) {
            this.f42762o.m65696x6();
        }
        this.f42772y = false;
        m65574s2();
        this.f42760m.stopAnimation();
        xdl0.m208344M(this.f42754g, false);
        this.f42754g.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: v2 */
    public void m65576v2() {
        if (TextUtils.isEmpty(this.f42769v)) {
            return;
        }
        C4348d.m20896l().m20900k(this.f42769v);
        this.f42769v = null;
    }

    @Override // p149l.sub0
    /* JADX INFO: renamed from: w */
    public void mo41787w() {
    }

    /* JADX INFO: renamed from: w2 */
    public boolean m65577w2() {
        return f42748A.m221515e().size() > 0 && f42748A.m221515e().get(0) != null && FeedModule.m60222H().me_().f56011id.equals(f42748A.m221515e().get(0).owner.f38803id);
    }
}
