package p007l;

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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.data.FeedFlower;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedActivitiesTabLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.d30;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VPager;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class slh extends pjh<klh> {

    /* JADX INFO: renamed from: o */
    public VNavigationBar f12981o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumInterestedHeaderView f12982p;

    /* JADX INFO: renamed from: q */
    public FeedActivitiesTabLayout f12983q;

    /* JADX INFO: renamed from: r */
    public TextView f12984r;

    /* JADX INFO: renamed from: s */
    public VPager f12985s;

    /* JADX INFO: renamed from: t */
    public klh f12986t;

    /* JADX INFO: renamed from: u */
    public final Act f12987u;

    /* JADX INFO: renamed from: v */
    public final String f12988v = "e_activity_friend";

    /* JADX INFO: renamed from: w */
    public final String f12989w = "e_activity_all";

    /* JADX INFO: renamed from: x */
    public final String f12990x = "p_activity";

    /* JADX INFO: renamed from: y */
    public List<PutongFrag> f12991y = new ArrayList();

    /* JADX INFO: renamed from: l.slh$a */
    public class C2486a extends l80<String> {
        public C2486a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(String str, int i) {
            zvf0.x(str, "p_activity");
        }
    }

    /* JADX INFO: renamed from: l.slh$c */
    public class C2488c extends ViewPager.m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l80 f12994a;

        public C2488c(l80 l80Var) {
            this.f12994a = l80Var;
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f12994a.m11597o();
            }
        }
    }

    /* JADX INFO: renamed from: l.slh$d */
    public class C2489d extends i {

        /* JADX INFO: renamed from: h */
        public FragmentManager f12996h;

        public C2489d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f12996h = fragmentManager;
        }

        public int getCount() {
            if (vwb.J(slh.this.f12991y)) {
                return 0;
            }
            return slh.this.f12991y.size();
        }

        @NonNull
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return (Fragment) slh.this.f12991y.get(i);
        }
    }

    public slh(PhotoAlbumActivitiesAct photoAlbumActivitiesAct) {
        this.f12987u = photoAlbumActivitiesAct;
    }

    /* JADX INFO: renamed from: T */
    private View m14234T(int i) {
        View viewInflate = this.f12987u.inflater().inflate(o6c0.f11227i, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(b5c0.f5994Q1);
        textView.setText(i == 0 ? "全部" : "好友消息");
        textView.setTextColor(Color.parseColor(i == 0 ? "#cc000000" : "#66000000"));
        TextPaint paint = textView.getPaint();
        if (NullChecker.a(paint)) {
            paint.setFakeBoldText(i == 0);
        }
        viewInflate.setLayoutParams(m14239S(i));
        viewInflate.setTag(Integer.valueOf(i));
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m14236W(View view) {
        Act act = this.f12987u;
        v1h.m15209K0(act, act.getResources().getString(R$string.f431S0), new d30() { // from class: l.qlh
            public final void call() {
                this.f12271a.m14235V();
            }
        });
        zvf0.u("e_all_read", "p_activity", new j760[]{j760.a("unread_message_num", Integer.valueOf((NullChecker.a(ijb0.m10924k()) && NullChecker.a(ijb0.m10924k().activities)) ? ijb0.m10924k().activities.unread : 0))});
    }

    @Override // p007l.pjh
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo9044C0() {
        return this.f12987u;
    }

    /* JADX INFO: renamed from: Q */
    public View m14237Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tlh.m14565b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.pjh
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo9049i1(klh klhVar) {
        this.f12986t = klhVar;
        super.mo9049i1(klhVar);
    }

    /* JADX INFO: renamed from: S */
    public LinearLayout.LayoutParams m14239S(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = t100.d(i == 0 ? 2.0f : 2.5f);
        return layoutParams;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m14240U(Boolean bool) {
        xdl0.X(this.f12983q, t100.d(bool.booleanValue() ? 7.0f : 3.0f));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m14241X(Boolean bool) {
        if (bool.booleanValue()) {
            for (int i = 0; i < this.f12991y.size(); i++) {
                ((FeedPhotoAlbumActivitiesFrag) this.f12991y.get(i)).m6108P4();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m14242Y(View view) {
        p6j0.m12912b("e_red_flower_explain", "p_activity", new p6j0.C2456a[0]);
        new g3h(this.f12987u).show();
    }

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void m14235V() {
        this.f12986t.m10190S1(new e30() { // from class: l.rlh
            public final void call(Object obj) {
                this.f12672a.m14241X((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m14244a0(FeedFlower feedFlower) {
        if (!xdl0.O0(this.f12984r)) {
            p6j0.m12914d("e_red_flower_explain", "p_activity", new p6j0.C2456a[0]);
        }
        xdl0.M(this.f12984r, true);
        this.f12984r.setText(String.format(Locale.getDefault(), "小红花 %d", Integer.valueOf(feedFlower.count)));
        xdl0.E0(this.f12984r, new View.OnClickListener() { // from class: l.plh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11884a.m14242Y(view);
            }
        });
    }

    public Act act() {
        return this.f12987u;
    }

    @Override // p007l.pjh
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM14237Q = m14237Q(layoutInflater, viewGroup);
        this.f12982p.setAction(new e30() { // from class: l.llh
            public final void call(Object obj) {
                this.f10061a.m14240U((Boolean) obj);
            }
        });
        this.f12981o.setLeftIconAsBack(act());
        viewM14237Q.setBackgroundColor(this.f12987u.getResources().getColor(e1c0.f7159p0));
        m14245r();
        this.f11862l = this.f12982p;
        return viewM14237Q;
    }

    @Override // p007l.pjh
    /* JADX INFO: renamed from: n */
    public void mo9204n() {
        xdl0.M(this.f12982p, false);
    }

    /* JADX INFO: renamed from: r */
    public void m14245r() {
        this.f12981o.setLeftIconAsBack(act());
        this.f12981o.setTitle(R$string.f519f5);
        int i = 0;
        if (((Boolean) sti.f13087m.get()).booleanValue()) {
            TextView textView = new TextView(this.f12987u);
            this.f11853c = textView;
            textView.setText(this.f12987u.getResources().getString(R$string.f535i0));
            this.f11853c.setTextColor(this.f12987u.getResources().getColor(e1c0.f7161r));
            this.f11853c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f11853c.setTextSize(14.0f);
            TextView textView2 = this.f11853c;
            int i2 = t100.j;
            textView2.setPadding(i2, t100.d(7.0f), i2, t100.d(7.0f));
            this.f11853c.setBackground(this.f12987u.getResources().getDrawable(f3c0.f7800f4));
            this.f12981o.z(new View[]{this.f11853c});
            xdl0.E0(this.f11853c, new View.OnClickListener() { // from class: l.mlh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10512a.m14236W(view);
                }
            });
        }
        final C2486a c2486a = new C2486a();
        FeedActivitiesTabLayout feedActivitiesTabLayout = this.f12983q;
        feedActivitiesTabLayout.addTab(feedActivitiesTabLayout.newTab());
        this.f12983q.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: l.nlh
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                c2486a.m11597o();
            }
        });
        this.f12983q.addOnTabSelectedListener(new C2487b());
        this.f12985s.d(new C2488c(c2486a));
        this.f12983q.setupWithViewPager(this.f12985s, false);
        klh klhVar = this.f12986t;
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFragM6105S4 = FeedPhotoAlbumActivitiesFrag.m6105S4(1, klhVar.f8141a, klhVar.f8145e);
        klh klhVar2 = this.f12986t;
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFragM6105S5 = FeedPhotoAlbumActivitiesFrag.m6105S4(2, klhVar2.f8141a, klhVar2.f8145e);
        this.f12991y.add(feedPhotoAlbumActivitiesFragM6105S4);
        this.f12991y.add(feedPhotoAlbumActivitiesFragM6105S5);
        this.f12985s.setAdapter(new C2489d(this.f12987u.getSupportFragmentManager()));
        int tabCount = this.f12983q.getTabCount();
        while (true) {
            TabLayout tabLayout = this.f12983q;
            if (i >= tabCount) {
                tabLayout.post(new Runnable() { // from class: l.olh
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2486a.m11597o();
                    }
                });
                return;
            }
            TabLayout.Tab tabAt = tabLayout.getTabAt(i);
            if (NullChecker.a(tabAt)) {
                tabAt.setCustomView(m14234T(i));
                c2486a.m11594h(tabAt.getCustomView(), i == 0 ? "e_activity_friend" : "e_activity_all", i);
            }
            i++;
        }
    }

    @Override // p007l.pjh
    /* JADX INFO: renamed from: y */
    public void mo9206y(List<User> list, int i) {
        xdl0.M(this.f12982p, true);
        super.mo9206y(list, i);
    }

    @Override // p007l.pjh
    /* JADX INFO: renamed from: z */
    public void mo13062z(List<String> list) {
        FeedModule.f316d.f14961X0.onNext(list);
    }

    @Override // p007l.pjh
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.slh$b */
    public class C2487b implements TabLayout.OnTabSelectedListener {
        public C2487b() {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            int iIntValue = customView == null ? 0 : ((Integer) customView.getTag()).intValue();
            if (customView != null) {
                zvf0.r(iIntValue == 0 ? "e_activity_friend" : "e_activity_all", "p_activity");
                TextView textView = (TextView) customView.findViewById(b5c0.f5994Q1);
                textView.setTextColor(Color.parseColor("#cc000000"));
                TextPaint paint = textView.getPaint();
                if (NullChecker.a(paint)) {
                    paint.setFakeBoldText(true);
                }
            }
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                TextView textView = (TextView) customView.findViewById(b5c0.f5994Q1);
                textView.setTextColor(Color.parseColor("#66000000"));
                TextPaint paint = textView.getPaint();
                if (NullChecker.a(paint)) {
                    paint.setFakeBoldText(false);
                }
            }
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
