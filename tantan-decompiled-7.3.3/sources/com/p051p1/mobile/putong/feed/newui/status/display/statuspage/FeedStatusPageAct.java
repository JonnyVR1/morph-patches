package com.p051p1.mobile.putong.feed.newui.status.display.statuspage;

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
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Meet;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p051p1.mobile.putong.feed.newui.status.aquare.FeedStatusListTabFrag;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;
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
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p151v.navigationbar.VNavigationTabLayout;
import p153l.bnl0;
import p153l.cmg;
import p153l.fsb0;
import p153l.gt0;
import p153l.h3i;
import p153l.hdc0;
import p153l.i4g0;
import p153l.jka;
import p153l.jxd0;
import p153l.jyb;
import p153l.k9c0;
import p153l.ksg;
import p153l.l51;
import p153l.lbc0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.r4i;
import p153l.tec0;
import p153l.uqb0;
import p153l.w0m;
import p153l.w2c0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStatusPageAct extends PutongAct implements w2c0 {

    /* JADX INFO: renamed from: A */
    public static C22507a<List<BubbleInfo>> f43596A = C22507a.m222759c(new ArrayList());

    /* JADX INFO: renamed from: B */
    public static C22508b<pf60<Boolean, Boolean>> f43597B = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f43598c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f43599d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f43600e;

    /* JADX INFO: renamed from: f */
    public DiscoveryPager f43601f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f43602g;

    /* JADX INFO: renamed from: h */
    public VImage f43603h;

    /* JADX INFO: renamed from: i */
    public VRelative f43604i;

    /* JADX INFO: renamed from: j */
    public VImage f43605j;

    /* JADX INFO: renamed from: k */
    public VImage f43606k;

    /* JADX INFO: renamed from: l */
    public VImage f43607l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f43608m;

    /* JADX INFO: renamed from: o */
    public FeedStatusSquareTabFrag f43610o;

    /* JADX INFO: renamed from: p */
    public List<PutongFrag> f43611p;

    /* JADX INFO: renamed from: s */
    public View f43614s;

    /* JADX INFO: renamed from: t */
    public VNavigationTabLayout f43615t;

    /* JADX INFO: renamed from: u */
    public View f43616u;

    /* JADX INFO: renamed from: v */
    public String f43617v;

    /* JADX INFO: renamed from: x */
    public int f43619x;

    /* JADX INFO: renamed from: y */
    public boolean f43620y;

    /* JADX INFO: renamed from: n */
    public jxd0 f43609n = new jxd0("HASSHOWSTATEPAGEACTPOSTTVGUIDEBUBBLE" + FeedModule.m61405F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: q */
    public C11497d f43612q = null;

    /* JADX INFO: renamed from: r */
    public List<String> f43613r = new ArrayList();

    /* JADX INFO: renamed from: w */
    public TextView[] f43618w = new TextView[2];

    /* JADX INFO: renamed from: z */
    public final Runnable f43621z = new RunnableC11496c();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$a */
    public class C11494a implements Animator.AnimatorListener {
        public C11494a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedStatusPageAct.this.m66758v2();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$b */
    public class C11495b extends AnimListener {
        public C11495b() {
        }

        @Override // com.tantanapp.media.ttmediaeffect.anim.AnimListener, com.tantanapp.media.ttmediaeffect.anim.IAnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$c */
    public class RunnableC11496c implements Runnable {
        public RunnableC11496c() {
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m66764d(List list, ConversationStatus conversationStatus) {
            boolean zM151186U = ksg.m151186U(conversationStatus);
            FeedStatusPageAct feedStatusPageAct = FeedStatusPageAct.this;
            if (!zM151186U) {
                feedStatusPageAct.f43610o.m66873s6(((Meet) list.get(0)).type, ((Meet) list.get(0)).f40077id, ((Meet) list.get(0)).userId);
                return;
            }
            if (feedStatusPageAct.getLifecycle().getState() == Lifecycle.State.RESUMED) {
                r1j0.m179420g("暂时没有遇到有趣的灵魂");
            }
            FeedStatusPageAct.this.m66758v2();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m66765e(Envelope envelope) {
            if (bnl0.m105529O0(FeedStatusPageAct.this.f43602g)) {
                final List<Meet> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).meets;
                if (jyb.m147479J(list) || list.size() == 0) {
                    r1j0.m179420g("暂时没有遇到有趣的灵魂");
                    FeedStatusPageAct.this.m66758v2();
                } else if (!TextUtils.isEmpty(list.get(0).userId)) {
                    FeedStatusPageAct.this.duringCreated(FeedModule.m61406H().mo31747ab(list.get(0).userId)).subscribe(psd0.m173596G(new y20() { // from class: l.q4i
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f155595a.m66764d(list, (ConversationStatus) obj);
                        }
                    }));
                } else {
                    r1j0.m179420g("暂时没有遇到有趣的灵魂");
                    FeedStatusPageAct.this.m66758v2();
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m66766f(Throwable th) {
            if (bnl0.m105529O0(FeedStatusPageAct.this.f43602g)) {
                boolean z = th instanceof TantanException.Client.TantanForbidden;
                if (z && ((TantanException.Client.TantanForbidden) th).code == 40350) {
                    r1j0.m179420g("今天的偶遇机会已用尽，明天再来邂逅");
                    FeedStatusPageAct.this.m66758v2();
                    return;
                }
                if ((z && ((TantanException.Client.TantanForbidden) th).code == 40351) || (z && ((TantanException.Client.TantanForbidden) th).code == 40352)) {
                    FeedStatusPageAct.this.f43610o.m66874t6(((TantanException.Client.TantanForbidden) th).code);
                } else {
                    r1j0.m179420g("暂时没有遇到有趣的灵魂");
                }
                FeedStatusPageAct.this.m66758v2();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedStatusPageAct.this.duringCreated(FeedModule.f39703d.m145806v7()).subscribe(psd0.m173597H(new y20() { // from class: l.o4i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144982a.m66765e((Envelope) obj);
                }
            }, new y20() { // from class: l.p4i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150537a.m66766f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$d */
    public class C11497d extends FragmentPagerAdapter implements ViewPager.InterfaceC0718j, w0m {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f43625a;

        /* JADX INFO: renamed from: b */
        public Method f43626b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f43627c;

        public C11497d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f43625a = new ArrayList();
            this.f43626b = null;
            this.f43627c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f43626b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.m82479c(e);
                this.f43626b = null;
            } catch (SecurityException e2) {
                CrashHelper.m82479c(e2);
                this.f43626b = null;
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
            return this.f43625a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f43625a.get(i);
        }

        @Override // p153l.cf60
        public CharSequence getPageTitle(int i) {
            return (CharSequence) FeedStatusPageAct.this.f43613r.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: j */
        public View m66767j(int i) {
            View viewInflate = FeedStatusPageAct.this.act().inflater().inflate(tec0.f173786x3, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(hdc0.f108909d2);
            FeedStatusPageAct.this.f43618w[i] = textView;
            textView.setText((CharSequence) FeedStatusPageAct.this.f43613r.get(i));
            return viewInflate;
        }

        /* JADX INFO: renamed from: k */
        public void m66768k(List<PutongFrag> list) {
            FeedStatusPageAct.this.f43611p = list;
            this.f43625a.clear();
            if (NullChecker.m82487b(list)) {
                this.f43625a.addAll(list);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            PhotoAlbumPictureView.m65042u(FeedStatusPageAct.this.act().getWindow().getDecorView(), false);
            FeedStatusPageAct.this.act().hideInput();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$e */
    public class C11498e implements VNavigationTabLayout.InterfaceC22736d {
        public C11498e() {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: a */
        public void mo65022a(VNavigationTabLayout.C22738f c22738f) {
            TextPaint paint;
            int iM224933f = c22738f.m224933f();
            if (iM224933f == 0) {
                FeedStatusPageAct.f43597B.onNext(new pf60<>(Boolean.FALSE, Boolean.TRUE));
            }
            TextView textView = FeedStatusPageAct.this.f43618w[iM224933f];
            if (!NullChecker.m82486a(textView) || (paint = textView.getPaint()) == null) {
                return;
            }
            paint.setFakeBoldText(false);
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: b */
        public void mo65023b(VNavigationTabLayout.C22738f c22738f) {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: c */
        public void mo65024c(VNavigationTabLayout.C22738f c22738f) {
            TextPaint paint;
            int iM224933f = c22738f.m224933f();
            FeedStatusPageAct.this.f43619x = iM224933f;
            if (NullChecker.m82486a(FeedStatusPageAct.this.f43616u)) {
                bnl0.m105524M(FeedStatusPageAct.this.f43616u, iM224933f == 0);
            }
            if (iM224933f == 0) {
                C22508b<pf60<Boolean, Boolean>> c22508b = FeedStatusPageAct.f43597B;
                Boolean bool = Boolean.TRUE;
                c22508b.onNext(new pf60<>(bool, bool));
            } else {
                FeedStatusPageAct.this.f43601f.setScrollble(true);
            }
            TextView textView = FeedStatusPageAct.this.f43618w[iM224933f];
            if (!NullChecker.m82486a(textView) || (paint = textView.getPaint()) == null) {
                return;
            }
            paint.setFakeBoldText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m66724A2() {
        if (!getIntent().getBooleanExtra("stateSquare", false)) {
            this.f43601f.setCurrentItem(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m66725B2() {
        m66755M2(this.f43599d.getRightIconContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public /* synthetic */ void m66726D2(View view) {
        if (this.f43620y) {
            l51.m152890J(this.f43621z);
            i4g0.m138520r("e_meet_back", "p_meet_greet");
            m66758v2();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I2 */
    public static List<BubbleInfo> m66727I2(List<BubbleInfo> list) {
        return jyb.m147522n(list, new qcj() { // from class: l.l4i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BubbleInfo) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m66735e2(View view) {
    }

    /* JADX INFO: renamed from: p2 */
    private void m66743p2() {
        bnl0.m105540X(this.f43599d, bnl0.m105511F0());
        bnl0.m105540X(this.f43602g, bnl0.m105511F0());
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m66744q2(Context context, String str, String str2, boolean z, String str3) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("stateId", str);
        intent.putExtra("userId", str2);
        intent.putExtra("needAppendFeed", z);
        intent.putExtra("from", str3);
        f43596A.onNext(new ArrayList());
        return intent;
    }

    /* JADX INFO: renamed from: r */
    private void m66745r() {
        m66743p2();
        bnl0.m105524M(this.f43599d, true);
        bnl0.m105524M(this.f43600e, true);
        this.f43599d.setTitle(FeedModule.f39700a.getString(R$string.f39910g2));
        this.f43599d.setLeftIconAsBack(this);
        this.f43599d.setLeftIconResource(lbc0.f130866I3);
        this.f43613r.add(FeedModule.f39700a.getString(R$string.f39794O0));
        this.f43613r.add(FeedModule.f39700a.getString(R$string.f39904f3));
        ArrayList arrayList = new ArrayList();
        FeedStatusListTabFrag feedStatusListTabFragM66655S4 = FeedStatusListTabFrag.m66655S4(getIntent().getIntExtra("initialShowIndex", 0), getIntent().getStringExtra("stateId"), getIntent().getStringExtra("next"), getIntent().getBooleanExtra("needAppendFeed", false), getIntent().getStringExtra("userId"), getIntent().getStringExtra("from"), getIntent().getBooleanExtra("stateSquare", false));
        BubbleInfo bubbleInfo = (BubbleInfo) getIntent().getSerializableExtra("bubbleInfo");
        if (cmg.m111218k0()) {
            FeedStatusSquareTabFrag feedStatusSquareTabFragM66834y5 = FeedStatusSquareTabFrag.m66834y5(bubbleInfo, getIntent().getStringExtra("from"));
            this.f43610o = feedStatusSquareTabFragM66834y5;
            arrayList.add(feedStatusSquareTabFragM66834y5);
        } else {
            arrayList.add(FeedModule.m61406H().mo31775i7(getIntent().getStringExtra("from"), bubbleInfo, tec0.f173796z));
        }
        arrayList.add(feedStatusListTabFragM66655S4);
        this.f43612q.m66768k(arrayList);
        this.f43601f.setOnPageChangeListener(this.f43612q);
        this.f43601f.setAdapter(this.f43612q);
        this.f43600e.setBackgroundColor(act().getResources().getColor(k9c0.f124526p0));
        this.f43600e.setupViewPager(this.f43601f);
        VNavigationTabLayout tabLayout = this.f43600e.getTabLayout();
        this.f43615t = tabLayout;
        if (tabLayout != null) {
            tabLayout.setBackgroundColor(act().getResources().getColor(k9c0.f124526p0));
        }
        if (cmg.m111236t0()) {
            View viewInflate = LayoutInflater.from(this).inflate(tec0.f173758t3, (ViewGroup) null);
            this.f43616u = viewInflate;
            this.f43600e.setRightIconViews(viewInflate);
            bnl0.m105509E0(this.f43616u, new View.OnClickListener() { // from class: l.f4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97099a.m66748z2(view);
                }
            });
        }
        int i = 0;
        while (true) {
            VNavigationTabLayout vNavigationTabLayout = this.f43615t;
            Objects.requireNonNull(vNavigationTabLayout);
            if (i >= vNavigationTabLayout.getTabCount()) {
                break;
            }
            View viewM66767j = this.f43612q.m66767j(i);
            VNavigationTabLayout.C22738f c22738fM224873w = this.f43615t.m224873w(i);
            Objects.requireNonNull(c22738fM224873w);
            c22738fM224873w.m224941n(viewM66767j);
            VNavigationTabLayout.C22738f c22738fM224873w2 = this.f43615t.m224873w(i);
            Objects.requireNonNull(c22738fM224873w2);
            VNavigationTabLayout.TabView tabView = c22738fM224873w2.f210794i;
            int iM175859d = qa00.m175859d(i == 0 ? 4.0f : 6.0f);
            VNavigationTabLayout.C22738f c22738fM224873w3 = this.f43615t.m224873w(i);
            Objects.requireNonNull(c22738fM224873w3);
            int paddingTop = c22738fM224873w3.f210794i.getPaddingTop();
            VNavigationTabLayout.C22738f c22738fM224873w4 = this.f43615t.m224873w(i);
            Objects.requireNonNull(c22738fM224873w4);
            tabView.setPadding(iM175859d, paddingTop, 0, c22738fM224873w4.f210794i.getPaddingBottom());
            i++;
        }
        this.f43615t.setOnTabSelectedListener((VNavigationTabLayout.InterfaceC22736d) new C11498e());
        this.f43601f.setCurrentItem(0);
        l51.m152888H(this.act, new Runnable() { // from class: l.g4i
            @Override // java.lang.Runnable
            public final void run() {
                this.f102173a.m66724A2();
            }
        }, 200L);
        duringCreated(FeedModule.f39703d.m145548K7()).subscribe(psd0.m173596G(new y20() { // from class: l.h4i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107809a.m66749C2((Map) obj);
            }
        }));
        bnl0.m105509E0(this.f43603h, new View.OnClickListener() { // from class: l.i4i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112910a.m66726D2(view);
            }
        });
        if (cmg.m111218k0()) {
            duringCreated(jka.f121283M1).subscribe(psd0.m173596G(new y20() { // from class: l.j4i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118294a.m66750E2((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m66746r2(Context context, List<BubbleInfo> list, int i, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("initialShowIndex", i);
        intent.putExtra("next", str);
        intent.putExtra("from", str2);
        f43596A.onNext(m66727I2(list));
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m66747s2(Context context, boolean z, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("stateSquare", z);
        intent.putExtra("bubbleInfo", bubbleInfo);
        intent.putExtra("from", str);
        f43596A.onNext(new ArrayList());
        return intent;
    }

    public static void showView(View view) {
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        view.setAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m66748z2(View view) {
        if (NullChecker.m82486a(this.f43610o)) {
            this.f43610o.m66880z5();
        }
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: C */
    public Animator mo42795C() {
        return null;
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m66749C2(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m61406H().me_().f56859id);
        this.f43599d.setRightIconViews(m66752H2(bubbleInfo));
        VLinear rightIconContainer = this.f43599d.getRightIconContainer();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rightIconContainer.getLayoutParams();
        marginLayoutParams.rightMargin = qa00.m175859d(4.0f);
        rightIconContainer.setLayoutParams(marginLayoutParams);
        View childAt = this.f43599d.getRightIconContainer().getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.height = qa00.m175859d(34.0f);
        childAt.setLayoutParams(layoutParams);
        if (bubbleInfo == null) {
            l51.m152888H(this.act, new Runnable() { // from class: l.k4i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123889a.m66725B2();
                }
            }, 800L);
        }
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: E */
    public View mo42796E() {
        return this.f43598c;
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m66750E2(Boolean bool) {
        if (bool.booleanValue()) {
            this.f43620y = false;
            Animator animatorM132170p = gt0.m132170p(this.f43602g, "alpha", 0L, 100L, new LinearInterpolator(), 1.0f, 0.0f);
            animatorM132170p.addListener(new C11494a());
            animatorM132170p.start();
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m66751F2(BubbleInfo bubbleInfo, View view) {
        int i = this.f43619x;
        i4g0.m138523u("e_set_my_state", i == 0 ? "p_state_explore" : "p_other_state", pf60.m172085a("source_page", i == 0 ? "p_state_explore" : "p_other_state"), pf60.m172085a("state_id", bubbleInfo == null ? "" : bubbleInfo.f39578id), pf60.m172085a("owner_id", bubbleInfo == null ? "" : bubbleInfo.owner.f39651id));
        if (bubbleInfo != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfo);
            startActivity(m66746r2(this, arrayList, 0, "", this.f43619x != 1 ? "p_my_state" : "p_other_state"));
        } else if (NullChecker.m82486a(FeedModule.f39704e.f138458H) && NullChecker.m82486a(FeedModule.f39704e.f138458H.m222761e()) && TEnum.equals(FeedModule.f39704e.f138458H.m222761e().status, "start")) {
            r1j0.m179420g("状态发布中...");
        } else {
            h3i.m133488f(this, this.f43619x != 0 ? "p_other_state" : "p_state_explore");
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final View m66752H2(final BubbleInfo bubbleInfo) {
        int i = this.f43619x;
        i4g0.m138492A("e_set_my_state", i == 0 ? "p_state_explore" : "p_other_state", pf60.m172085a("source_page", i == 0 ? "p_state_explore" : "p_other_state"), pf60.m172085a("state_id", bubbleInfo == null ? "" : bubbleInfo.f39578id), pf60.m172085a("owner_id", bubbleInfo != null ? bubbleInfo.owner.f39651id : ""));
        View viewInflate = LayoutInflater.from(this).inflate(tec0.f173510H2, (ViewGroup) null);
        VLinear vLinear = (VLinear) viewInflate.findViewById(hdc0.f108824C1);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(hdc0.f108851L1);
        VText vText = (VText) viewInflate.findViewById(hdc0.f108848K1);
        TextPaint paint = vText.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        bnl0.m105524M(vDraweeView, bubbleInfo != null);
        if (bubbleInfo == null) {
            vLinear.setPadding(qa00.m175859d(13.0f), 0, qa00.m175859d(13.0f), 0);
        } else {
            vLinear.setPadding(qa00.m175859d(10.0f), 0, qa00.m175859d(12.0f), 0);
        }
        vLinear.setBackgroundResource(bubbleInfo == null ? lbc0.f131124q5 : lbc0.f131132r5);
        vText.setTextColor(Color.parseColor(bubbleInfo == null ? "#ffffff" : "#1a1a1b"));
        vText.setTextSize(bubbleInfo == null ? 14.0f : 13.0f);
        vText.setText(bubbleInfo != null ? bubbleInfo.emotion.text : FeedModule.f39700a.getString(R$string.f39903f2));
        if (NullChecker.m82486a(bubbleInfo)) {
            fsb0 fsb0Var = uqb0.f180374G;
            String str = bubbleInfo.emotion.emojiUrl;
            int i2 = qa00.f156330q;
            fsb0Var.m127109I0(vDraweeView, str, i2, i2);
        }
        bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.n4i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140232a.m66751F2(bubbleInfo, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: K2 */
    public void m66753K2() {
        this.f43602g.setOnClickListener(new View.OnClickListener() { // from class: l.m4i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedStatusPageAct.m66735e2(view);
            }
        });
        showView(this.f43602g);
        this.f43620y = true;
        m66754L2();
        bnl0.m105524M(this.f43602g, true);
        this.f43608m.loadAnimWithListener("feed_state_meet.svga", -1, new C11495b(), true);
        l51.m152888H(this, this.f43621z, 1800L);
    }

    /* JADX INFO: renamed from: L2 */
    public void m66754L2() {
        this.pageHelper.m152768c();
        this.pageHelper.m152782q("p_meet_greet");
        this.pageHelper.m152777l();
    }

    /* JADX INFO: renamed from: M2 */
    public final void m66755M2(VLinear vLinear) {
        if (this.f43609n.get().booleanValue()) {
            return;
        }
        VText vText = new VText(act());
        int i = bnl0.f77544e;
        vText.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        vText.setText("分享状态，让更多人看到你");
        int i2 = qa00.f156326m;
        vText.setPadding(i2, qa00.m175859d(10.0f), i2, qa00.m175859d(10.0f));
        vText.setTextColor(-1);
        if (NullChecker.m82486a(vText.getPaint())) {
            vText.getPaint().setFakeBoldText(true);
        }
        this.f43617v = C4499d.m21895l().m21907t(new C4496a(act()).m21876s(vText).m21863e(true).m21869k(act().getResources().getColor(k9c0.f124521n)).m21854J(13.0f).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21882y(true).m21880w(qa00.f156323j).m21874q(C4496a.f16399N), vLinear);
        this.f43609n.put(Boolean.TRUE);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (cmg.m111177E() && !m66760y2()) {
            this.f43612q = new C11497d(getSupportFragmentManager());
            this.f43614s = m66756o2(layoutInflater, viewGroup);
            m66745r();
            return this.f43614s;
        }
        if (this.act.fragmentManager().m2555h0(R.id.content) != null) {
            return null;
        }
        this.act.fragmentManager().m2568m().m2812s(R.id.content, FeedStatusListTabFrag.m66655S4(getIntent().getIntExtra("initialShowIndex", 0), getIntent().getStringExtra("stateId"), getIntent().getStringExtra("next"), getIntent().getBooleanExtra("needAppendFeed", false), getIntent().getStringExtra("userId"), getIntent().getStringExtra("from"), getIntent().getBooleanExtra("stateSquare", false))).mo2708i();
        this.act.fragmentManager().m2546e0();
        return null;
    }

    /* JADX INFO: renamed from: o2 */
    public View m66756o2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r4i.m179768b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && NullChecker.m82486a(intent) && NullChecker.m82486a(intent.getExtras())) {
            if (i2 == 10087 && NullChecker.m82486a(this.f43610o)) {
                this.f43610o.m66873s6(intent.getExtras().getString("type"), intent.getExtras().getString("id"), intent.getExtras().getString(Oauth2AccessToken.KEY_UID));
            }
            if (i2 == 10088 && NullChecker.m82486a(this.f43610o)) {
                this.f43610o.m66874t6(intent.getExtras().getInt("code"));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.f43620y) {
            lambda$debugItems$19();
            return;
        }
        l51.m152890J(this.f43621z);
        i4g0.m138520r("e_meet_back", "p_meet_greet");
        m66758v2();
    }

    @Override // com.p051p1.mobile.android.app.Act, p153l.r1e
    public void onDialogAttachToWindow(Dialog dialog) {
        super.onDialogAttachToWindow(dialog);
        if (this.f43619x == 0) {
            C22508b<pf60<Boolean, Boolean>> c22508b = f43597B;
            Boolean bool = Boolean.FALSE;
            c22508b.onNext(new pf60<>(bool, bool));
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, p153l.r1e
    public void onDialogDetachFromWindow(Dialog dialog) {
        super.onDialogDetachFromWindow(dialog);
        if (this.f43619x == 0) {
            f43597B.onNext(new pf60<>(Boolean.TRUE, Boolean.FALSE));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        m66759w2();
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: q */
    public View mo42797q() {
        return this.f43614s;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // p153l.w2c0
    public void stop() {
    }

    /* JADX INFO: renamed from: u2 */
    public void m66757u2() {
        this.pageHelper.m152782q("p_meet_greet");
        this.pageHelper.m152776k();
    }

    /* JADX INFO: renamed from: v2 */
    public void m66758v2() {
        if (NullChecker.m82486a(this.f43610o)) {
            this.f43610o.m66879x6();
        }
        this.f43620y = false;
        m66757u2();
        this.f43608m.stopAnimation();
        bnl0.m105524M(this.f43602g, false);
        this.f43602g.setAlpha(1.0f);
    }

    @Override // p153l.w2c0
    /* JADX INFO: renamed from: w */
    public void mo42798w() {
    }

    /* JADX INFO: renamed from: w2 */
    public void m66759w2() {
        if (TextUtils.isEmpty(this.f43617v)) {
            return;
        }
        C4499d.m21895l().m21899k(this.f43617v);
        this.f43617v = null;
    }

    /* JADX INFO: renamed from: y2 */
    public boolean m66760y2() {
        return f43596A.m222761e().size() > 0 && f43596A.m222761e().get(0) != null && FeedModule.m61406H().me_().f56859id.equals(f43596A.m222761e().get(0).owner.f39651id);
    }
}
