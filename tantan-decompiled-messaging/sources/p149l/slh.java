package p149l;

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
import androidx.fragment.app.AbstractC0425i;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.FeedFlower;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedActivitiesTabLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p147v.VPager;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class slh extends pjh<klh> {

    /* JADX INFO: renamed from: o */
    public VNavigationBar f165213o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumInterestedHeaderView f165214p;

    /* JADX INFO: renamed from: q */
    public FeedActivitiesTabLayout f165215q;

    /* JADX INFO: renamed from: r */
    public TextView f165216r;

    /* JADX INFO: renamed from: s */
    public VPager f165217s;

    /* JADX INFO: renamed from: t */
    public klh f165218t;

    /* JADX INFO: renamed from: u */
    public final Act f165219u;

    /* JADX INFO: renamed from: v */
    public final String f165220v = "e_activity_friend";

    /* JADX INFO: renamed from: w */
    public final String f165221w = "e_activity_all";

    /* JADX INFO: renamed from: x */
    public final String f165222x = "p_activity";

    /* JADX INFO: renamed from: y */
    public List<PutongFrag> f165223y = new ArrayList();

    /* JADX INFO: renamed from: l.slh$a */
    public class C19987a extends l80<String> {
        public C19987a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(String str, int i) {
            zvf0.m220402x(str, "p_activity");
        }
    }

    /* JADX INFO: renamed from: l.slh$c */
    public class C19989c extends ViewPager.C0719m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l80 f165226a;

        public C19989c(l80 l80Var) {
            this.f165226a = l80Var;
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f165226a.m148842o();
            }
        }
    }

    /* JADX INFO: renamed from: l.slh$d */
    public class C19990d extends AbstractC0425i {

        /* JADX INFO: renamed from: h */
        public FragmentManager f165228h;

        public C19990d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f165228h = fragmentManager;
        }

        @Override // p149l.w660
        public int getCount() {
            if (vwb.m200296J(slh.this.f165223y)) {
                return 0;
            }
            return slh.this.f165223y.size();
        }

        @Override // androidx.fragment.app.AbstractC0425i
        @NonNull
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return (Fragment) slh.this.f165223y.get(i);
        }
    }

    public slh(PhotoAlbumActivitiesAct photoAlbumActivitiesAct) {
        this.f165219u = photoAlbumActivitiesAct;
    }

    /* JADX INFO: renamed from: T */
    private View m184812T(int i) {
        View viewInflate = this.f165219u.inflater().inflate(o6c0.f142208i, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(b5c0.f73513Q1);
        textView.setText(i == 0 ? "全部" : "好友消息");
        textView.setTextColor(Color.parseColor(i == 0 ? "#cc000000" : "#66000000"));
        TextPaint paint = textView.getPaint();
        if (NullChecker.m81303a(paint)) {
            paint.setFakeBoldText(i == 0);
        }
        viewInflate.setLayoutParams(m184817S(i));
        viewInflate.setTag(Integer.valueOf(i));
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m184814W(View view) {
        Act act = this.f165219u;
        v1h.m196570K0(act, act.getResources().getString(R$string.f38970S0), new d30() { // from class: l.qlh
            @Override // p149l.d30
            public final void call() {
                this.f155228a.m184813V();
            }
        });
        zvf0.m220399u("e_all_read", "p_activity", j760.m140076a("unread_message_num", Integer.valueOf((NullChecker.m81303a(ijb0.m136571k()) && NullChecker.m81303a(ijb0.m136571k().activities)) ? ijb0.m136571k().activities.unread : 0)));
    }

    @Override // p149l.pjh, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f165219u;
    }

    /* JADX INFO: renamed from: Q */
    public View m184815Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tlh.m189620b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.pjh
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(klh klhVar) {
        this.f165218t = klhVar;
        super.mo21065i1(klhVar);
    }

    /* JADX INFO: renamed from: S */
    public LinearLayout.LayoutParams m184817S(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = t100.m186890d(i == 0 ? 2.0f : 2.5f);
        return layoutParams;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m184818U(Boolean bool) {
        xdl0.m208360X(this.f165215q, t100.m186890d(bool.booleanValue() ? 7.0f : 3.0f));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m184819X(Boolean bool) {
        if (bool.booleanValue()) {
            for (int i = 0; i < this.f165223y.size(); i++) {
                ((FeedPhotoAlbumActivitiesFrag) this.f165223y.get(i)).m65008P4();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m184820Y(View view) {
        p6j0.m167668b("e_red_flower_explain", "p_activity", new p6j0.C19147a[0]);
        new g3h(this.f165219u).show();
    }

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void m184813V() {
        this.f165218t.m122047S1(new e30() { // from class: l.rlh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159962a.m184819X((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m184822a0(FeedFlower feedFlower) {
        if (!xdl0.m208349O0(this.f165216r)) {
            p6j0.m167670d("e_red_flower_explain", "p_activity", new p6j0.C19147a[0]);
        }
        xdl0.m208344M(this.f165216r, true);
        this.f165216r.setText(String.format(Locale.getDefault(), "小红花 %d", Integer.valueOf(feedFlower.count)));
        xdl0.m208329E0(this.f165216r, new View.OnClickListener() { // from class: l.plh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150132a.m184820Y(view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f165219u;
    }

    @Override // p149l.pjh, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM184815Q = m184815Q(layoutInflater, viewGroup);
        this.f165214p.setAction(new e30() { // from class: l.llh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128707a.m184818U((Boolean) obj);
            }
        });
        this.f165213o.setLeftIconAsBack(getAct());
        viewM184815Q.setBackgroundColor(this.f165219u.getResources().getColor(e1c0.f88803p0));
        m184823r();
        this.f149786l = this.f165214p;
        return viewM184815Q;
    }

    @Override // p149l.pjh
    /* JADX INFO: renamed from: n */
    public void mo107467n() {
        xdl0.m208344M(this.f165214p, false);
    }

    /* JADX INFO: renamed from: r */
    public void m184823r() {
        this.f165213o.setLeftIconAsBack(getAct());
        this.f165213o.setTitle(R$string.f39058f5);
        int i = 0;
        if (sti.f166369m.get().booleanValue()) {
            TextView textView = new TextView(this.f165219u);
            this.f149777c = textView;
            textView.setText(this.f165219u.getResources().getString(R$string.f39074i0));
            this.f149777c.setTextColor(this.f165219u.getResources().getColor(e1c0.f88805r));
            this.f149777c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f149777c.setTextSize(14.0f);
            TextView textView2 = this.f149777c;
            int i2 = t100.f167261j;
            textView2.setPadding(i2, t100.m186890d(7.0f), i2, t100.m186890d(7.0f));
            this.f149777c.setBackground(this.f165219u.getResources().getDrawable(f3c0.f94517f4));
            this.f165213o.m223589z(this.f149777c);
            xdl0.m208329E0(this.f149777c, new View.OnClickListener() { // from class: l.mlh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134436a.m184814W(view);
                }
            });
        }
        final C19987a c19987a = new C19987a();
        FeedActivitiesTabLayout feedActivitiesTabLayout = this.f165215q;
        feedActivitiesTabLayout.addTab(feedActivitiesTabLayout.newTab());
        this.f165215q.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: l.nlh
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                c19987a.m148842o();
            }
        });
        this.f165215q.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C19988b());
        this.f165217s.m4185d(new C19989c(c19987a));
        this.f165215q.setupWithViewPager(this.f165217s, false);
        klh klhVar = this.f165218t;
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFragM65005S4 = FeedPhotoAlbumActivitiesFrag.m65005S4(1, klhVar.f98174a, klhVar.f98178e);
        klh klhVar2 = this.f165218t;
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFragM65005S5 = FeedPhotoAlbumActivitiesFrag.m65005S4(2, klhVar2.f98174a, klhVar2.f98178e);
        this.f165223y.add(feedPhotoAlbumActivitiesFragM65005S4);
        this.f165223y.add(feedPhotoAlbumActivitiesFragM65005S5);
        this.f165217s.setAdapter(new C19990d(this.f165219u.getSupportFragmentManager()));
        int tabCount = this.f165215q.getTabCount();
        while (true) {
            FeedActivitiesTabLayout feedActivitiesTabLayout2 = this.f165215q;
            if (i >= tabCount) {
                feedActivitiesTabLayout2.post(new Runnable() { // from class: l.olh
                    @Override // java.lang.Runnable
                    public final void run() {
                        c19987a.m148842o();
                    }
                });
                return;
            }
            TabLayout.Tab tabAt = feedActivitiesTabLayout2.getTabAt(i);
            if (NullChecker.m81303a(tabAt)) {
                tabAt.setCustomView(m184812T(i));
                c19987a.m148839h(tabAt.getCustomView(), i == 0 ? "e_activity_friend" : "e_activity_all", i);
            }
            i++;
        }
    }

    @Override // p149l.pjh
    /* JADX INFO: renamed from: y */
    public void mo107468y(List<User> list, int i) {
        xdl0.m208344M(this.f165214p, true);
        super.mo107468y(list, i);
    }

    @Override // p149l.pjh
    /* JADX INFO: renamed from: z */
    public void mo169865z(List<String> list) {
        FeedModule.f38855d.f193026X0.onNext(list);
    }

    @Override // p149l.pjh, p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.slh$b */
    public class C19988b implements TabLayout.OnTabSelectedListener {
        public C19988b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            int iIntValue = customView == null ? 0 : ((Integer) customView.getTag()).intValue();
            if (customView != null) {
                zvf0.m220396r(iIntValue == 0 ? "e_activity_friend" : "e_activity_all", "p_activity");
                TextView textView = (TextView) customView.findViewById(b5c0.f73513Q1);
                textView.setTextColor(Color.parseColor("#cc000000"));
                TextPaint paint = textView.getPaint();
                if (NullChecker.m81303a(paint)) {
                    paint.setFakeBoldText(true);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                TextView textView = (TextView) customView.findViewById(b5c0.f73513Q1);
                textView.setTextColor(Color.parseColor("#66000000"));
                TextPaint paint = textView.getPaint();
                if (NullChecker.m81303a(paint)) {
                    paint.setFakeBoldText(false);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
