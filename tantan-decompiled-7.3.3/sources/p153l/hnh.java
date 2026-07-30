package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0426i;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.FeedFlower;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedActivitiesTabLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p151v.VPager;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class hnh extends elh<zmh> {

    /* JADX INFO: renamed from: o */
    public VNavigationBar f110755o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumInterestedHeaderView f110756p;

    /* JADX INFO: renamed from: q */
    public FeedActivitiesTabLayout f110757q;

    /* JADX INFO: renamed from: r */
    public TextView f110758r;

    /* JADX INFO: renamed from: s */
    public VPager f110759s;

    /* JADX INFO: renamed from: t */
    public zmh f110760t;

    /* JADX INFO: renamed from: u */
    public final Act f110761u;

    /* JADX INFO: renamed from: v */
    public final String f110762v = "e_activity_friend";

    /* JADX INFO: renamed from: w */
    public final String f110763w = "e_activity_all";

    /* JADX INFO: renamed from: x */
    public final String f110764x = "p_activity";

    /* JADX INFO: renamed from: y */
    public List<PutongFrag> f110765y = new ArrayList();

    /* JADX INFO: renamed from: l.hnh$a */
    public class C17514a extends h80<String> {
        public C17514a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(String str, int i) {
            i4g0.m138526x(str, "p_activity");
        }
    }

    /* JADX INFO: renamed from: l.hnh$c */
    public class C17516c extends ViewPager.C0721m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h80 f110768a;

        public C17516c(h80 h80Var) {
            this.f110768a = h80Var;
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f110768a.m133884o();
            }
        }
    }

    /* JADX INFO: renamed from: l.hnh$d */
    public class C17517d extends AbstractC0426i {

        /* JADX INFO: renamed from: h */
        public FragmentManager f110770h;

        public C17517d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f110770h = fragmentManager;
        }

        @Override // p153l.cf60
        public int getCount() {
            if (jyb.m147479J(hnh.this.f110765y)) {
                return 0;
            }
            return hnh.this.f110765y.size();
        }

        @Override // androidx.fragment.app.AbstractC0426i
        @NonNull
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return (Fragment) hnh.this.f110765y.get(i);
        }
    }

    public hnh(PhotoAlbumActivitiesAct photoAlbumActivitiesAct) {
        this.f110761u = photoAlbumActivitiesAct;
    }

    /* JADX INFO: renamed from: T */
    private View m136103T(int i) {
        View viewInflate = this.f110761u.inflater().inflate(tec0.f173677i, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(hdc0.f108866Q1);
        textView.setText(i == 0 ? "全部" : "好友消息");
        textView.setTextColor(Color.parseColor(i == 0 ? "#cc000000" : "#66000000"));
        TextPaint paint = textView.getPaint();
        if (NullChecker.m82486a(paint)) {
            paint.setFakeBoldText(i == 0);
        }
        viewInflate.setLayoutParams(m136108S(i));
        viewInflate.setTag(Integer.valueOf(i));
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m136105W(View view) {
        Act act = this.f110761u;
        k3h.m148047K0(act, act.getResources().getString(R$string.f39818S0), new x20() { // from class: l.fnh
            @Override // p153l.x20
            public final void call() {
                this.f99919a.m136104V();
            }
        });
        i4g0.m138523u("e_all_read", "p_activity", pf60.m172085a("unread_message_num", Integer.valueOf((NullChecker.m82486a(mrb0.m159657k()) && NullChecker.m82486a(mrb0.m159657k().activities)) ? mrb0.m159657k().activities.unread : 0)));
    }

    @Override // p153l.elh, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f110761u;
    }

    /* JADX INFO: renamed from: Q */
    public View m136106Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return inh.m141130b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.elh
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zmh zmhVar) {
        this.f110760t = zmhVar;
        super.mo22064i1(zmhVar);
    }

    /* JADX INFO: renamed from: S */
    public LinearLayout.LayoutParams m136108S(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = qa00.m175859d(i == 0 ? 2.0f : 2.5f);
        return layoutParams;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m136109U(Boolean bool) {
        bnl0.m105540X(this.f110757q, qa00.m175859d(bool.booleanValue() ? 7.0f : 3.0f));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m136110X(Boolean bool) {
        if (bool.booleanValue()) {
            for (int i = 0; i < this.f110765y.size(); i++) {
                ((FeedPhotoAlbumActivitiesFrag) this.f110765y.get(i)).m66191P4();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m136111Y(View view) {
        tfj0.m190939b("e_red_flower_explain", "p_activity", new tfj0.C20302a[0]);
        new v4h(this.f110761u).show();
    }

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void m136104V() {
        this.f110760t.m196735S1(new y20() { // from class: l.gnh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105086a.m136110X((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m136113a0(FeedFlower feedFlower) {
        if (!bnl0.m105529O0(this.f110758r)) {
            tfj0.m190941d("e_red_flower_explain", "p_activity", new tfj0.C20302a[0]);
        }
        bnl0.m105524M(this.f110758r, true);
        this.f110758r.setText(String.format(Locale.getDefault(), "小红花 %d", Integer.valueOf(feedFlower.count)));
        bnl0.m105509E0(this.f110758r, new View.OnClickListener() { // from class: l.enh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94783a.m136111Y(view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f110761u;
    }

    @Override // p153l.elh, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM136106Q = m136106Q(layoutInflater, viewGroup);
        this.f110756p.setAction(new y20() { // from class: l.anh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72346a.m136109U((Boolean) obj);
            }
        });
        this.f110755o.setLeftIconAsBack(getAct());
        viewM136106Q.setBackgroundColor(this.f110761u.getResources().getColor(k9c0.f124526p0));
        m136114r();
        this.f94531l = this.f110756p;
        return viewM136106Q;
    }

    @Override // p153l.elh
    /* JADX INFO: renamed from: n */
    public void mo121166n() {
        bnl0.m105524M(this.f110756p, false);
    }

    /* JADX INFO: renamed from: r */
    public void m136114r() {
        this.f110755o.setLeftIconAsBack(getAct());
        this.f110755o.setTitle(R$string.f39906f5);
        int i = 0;
        if (owi.f149494m.get().booleanValue()) {
            TextView textView = new TextView(this.f110761u);
            this.f94522c = textView;
            textView.setText(this.f110761u.getResources().getString(R$string.f39922i0));
            this.f94522c.setTextColor(this.f110761u.getResources().getColor(k9c0.f124528r));
            this.f94522c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f94522c.setTextSize(14.0f);
            TextView textView2 = this.f94522c;
            int i2 = qa00.f156323j;
            textView2.setPadding(i2, qa00.m175859d(7.0f), i2, qa00.m175859d(7.0f));
            this.f94522c.setBackground(this.f110761u.getResources().getDrawable(lbc0.f131035f4));
            this.f110755o.m224835z(this.f94522c);
            bnl0.m105509E0(this.f94522c, new View.OnClickListener() { // from class: l.bnh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f77479a.m136105W(view);
                }
            });
        }
        final C17514a c17514a = new C17514a();
        FeedActivitiesTabLayout feedActivitiesTabLayout = this.f110757q;
        feedActivitiesTabLayout.addTab(feedActivitiesTabLayout.newTab());
        this.f110757q.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: l.cnh
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                c17514a.m133884o();
            }
        });
        this.f110757q.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C17515b());
        this.f110759s.m4187d(new C17516c(c17514a));
        this.f110757q.setupWithViewPager(this.f110759s, false);
        zmh zmhVar = this.f110760t;
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFragM66188S4 = FeedPhotoAlbumActivitiesFrag.m66188S4(1, zmhVar.f179638a, zmhVar.f179642e);
        zmh zmhVar2 = this.f110760t;
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFragM66188S5 = FeedPhotoAlbumActivitiesFrag.m66188S4(2, zmhVar2.f179638a, zmhVar2.f179642e);
        this.f110765y.add(feedPhotoAlbumActivitiesFragM66188S4);
        this.f110765y.add(feedPhotoAlbumActivitiesFragM66188S5);
        this.f110759s.setAdapter(new C17517d(this.f110761u.getSupportFragmentManager()));
        int tabCount = this.f110757q.getTabCount();
        while (true) {
            FeedActivitiesTabLayout feedActivitiesTabLayout2 = this.f110757q;
            if (i >= tabCount) {
                feedActivitiesTabLayout2.post(new Runnable() { // from class: l.dnh
                    @Override // java.lang.Runnable
                    public final void run() {
                        c17514a.m133884o();
                    }
                });
                return;
            }
            TabLayout.Tab tabAt = feedActivitiesTabLayout2.getTabAt(i);
            if (NullChecker.m82486a(tabAt)) {
                tabAt.setCustomView(m136103T(i));
                c17514a.m133881h(tabAt.getCustomView(), i == 0 ? "e_activity_friend" : "e_activity_all", i);
            }
            i++;
        }
    }

    @Override // p153l.elh
    /* JADX INFO: renamed from: y */
    public void mo121174y(List<User> list, int i) {
        bnl0.m105524M(this.f110756p, true);
        super.mo121174y(list, i);
    }

    @Override // p153l.elh
    /* JADX INFO: renamed from: z */
    public void mo121175z(List<String> list) {
        FeedModule.f39703d.f121336X0.onNext(list);
    }

    @Override // p153l.elh, p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.hnh$b */
    public class C17515b implements TabLayout.OnTabSelectedListener {
        public C17515b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            int iIntValue = customView == null ? 0 : ((Integer) customView.getTag()).intValue();
            if (customView != null) {
                i4g0.m138520r(iIntValue == 0 ? "e_activity_friend" : "e_activity_all", "p_activity");
                TextView textView = (TextView) customView.findViewById(hdc0.f108866Q1);
                textView.setTextColor(Color.parseColor("#cc000000"));
                TextPaint paint = textView.getPaint();
                if (NullChecker.m82486a(paint)) {
                    paint.setFakeBoldText(true);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                TextView textView = (TextView) customView.findViewById(hdc0.f108866Q1);
                textView.setTextColor(Color.parseColor("#66000000"));
                TextPaint paint = textView.getPaint();
                if (NullChecker.m82486a(paint)) {
                    paint.setFakeBoldText(false);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
