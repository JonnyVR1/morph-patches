package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class dj0 implements s7m<cj0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f86458a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f86459b;

    /* JADX INFO: renamed from: c */
    public TabLayout f86460c;

    /* JADX INFO: renamed from: d */
    public DiscoveryPager f86461d;

    /* JADX INFO: renamed from: e */
    public PutongAct f86462e;

    /* JADX INFO: renamed from: f */
    public cj0 f86463f;

    /* JADX INFO: renamed from: g */
    public C16389a f86464g;

    /* JADX INFO: renamed from: h */
    public List<String> f86465h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public VText[] f86466i = new VText[2];

    public dj0(PutongAct putongAct) {
        this.f86462e = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f86462e;
    }

    /* JADX INFO: renamed from: f */
    public View m111965f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ej0.m116749b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cj0 cj0Var) {
        this.f86463f = cj0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m111965f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m111967r() {
        this.f86459b.setTitle("圈子");
        this.f86459b.setLeftIconAsBack(this.f86462e);
        this.f86465h.add(0, "我的圈子");
        this.f86465h.add(1, "热门圈子");
        this.f86464g = new C16389a(this.f86462e.getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        FeedAllGroupFragment feedAllGroupFragmentM61904M4 = FeedAllGroupFragment.m61904M4(0);
        FeedAllGroupFragment feedAllGroupFragmentM61904M5 = FeedAllGroupFragment.m61904M4(1);
        arrayList.add(feedAllGroupFragmentM61904M4);
        arrayList.add(feedAllGroupFragmentM61904M5);
        this.f86464g.m111969k(arrayList);
        this.f86461d.setOnPageChangeListener(this.f86464g);
        this.f86461d.setAdapter(this.f86464g);
        this.f86460c.setupWithViewPager(this.f86461d);
        this.f86461d.setCurrentItem(!this.f86463f.f81127a ? 1 : 0);
        for (int i = 0; i < this.f86460c.getTabCount(); i++) {
            this.f86460c.getTabAt(i).setCustomView(this.f86464g.m111968j(i));
            xdl0.m208358V(this.f86460c.getTabAt(i).view, t100.m186890d(11.0f));
        }
        this.f86460c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C16390b());
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.dj0$a */
    public class C16389a extends FragmentPagerAdapter implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f86467a;

        public C16389a(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f86467a = new ArrayList();
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f86467a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NonNull
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f86467a.get(i);
        }

        @Override // p149l.w660
        @Nullable
        public CharSequence getPageTitle(int i) {
            return (CharSequence) dj0.this.f86465h.get(i);
        }

        /* JADX INFO: renamed from: j */
        public View m111968j(int i) {
            View viewInflate = dj0.this.getAct().inflater().inflate(o6c0.f142014D, (ViewGroup) null);
            VText vText = (VText) viewInflate.findViewById(b5c0.f73556d2);
            dj0.this.f86466i[i] = vText;
            if ((dj0.this.f86463f.f81127a && i == 0) || (!dj0.this.f86463f.f81127a && i == 1)) {
                vText.setTextColor(-1);
                dj0.this.f86466i[i].setBackground(dj0.this.f86462e.getResources().getDrawable(f3c0.f94624t));
            }
            vText.setText((CharSequence) dj0.this.f86465h.get(i));
            return viewInflate;
        }

        /* JADX INFO: renamed from: k */
        public void m111969k(List<PutongFrag> list) {
            this.f86467a.clear();
            if (NullChecker.m81304b(list)) {
                this.f86467a.addAll(list);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            String str;
            if ("我的圈子".equals(dj0.this.f86464g.getPageTitle(i))) {
                str = "joined";
            } else {
                str = "热门圈子".equals(dj0.this.f86464g.getPageTitle(i)) ? SuperlikeReason.popular : "";
            }
            p6j0.m167669c("e_circle_tab", "p_circle_list", new j760("circle_tab", str));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.dj0$b */
    public class C16390b implements TabLayout.OnTabSelectedListener {
        public C16390b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            dj0.this.f86466i[position].setTextColor(-1);
            dj0.this.f86466i[position].setTypeface(eqh0.m117752c(3), 1);
            dj0.this.f86466i[position].setBackground(dj0.this.f86462e.getResources().getDrawable(f3c0.f94624t));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            dj0.this.f86466i[position].setTextColor(dj0.this.f86462e.getResources().getColor(e1c0.f88792k));
            dj0.this.f86466i[position].setTypeface(eqh0.m117752c(3), 0);
            dj0.this.f86466i[position].setBackground(dj0.this.f86462e.getResources().getDrawable(f3c0.f94632u));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
