package p153l;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.p051p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class zi0 implements iam<yi0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f204475a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f204476b;

    /* JADX INFO: renamed from: c */
    public TabLayout f204477c;

    /* JADX INFO: renamed from: d */
    public DiscoveryPager f204478d;

    /* JADX INFO: renamed from: e */
    public PutongAct f204479e;

    /* JADX INFO: renamed from: f */
    public yi0 f204480f;

    /* JADX INFO: renamed from: g */
    public C21810a f204481g;

    /* JADX INFO: renamed from: h */
    public List<String> f204482h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public VText[] f204483i = new VText[2];

    public zi0(PutongAct putongAct) {
        this.f204479e = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f204479e;
    }

    /* JADX INFO: renamed from: f */
    public View m219713f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aj0.m98215b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yi0 yi0Var) {
        this.f204480f = yi0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m219713f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m219715r() {
        this.f204476b.setTitle("圈子");
        this.f204476b.setLeftIconAsBack(this.f204479e);
        this.f204482h.add(0, "我的圈子");
        this.f204482h.add(1, "热门圈子");
        this.f204481g = new C21810a(this.f204479e.getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        FeedAllGroupFragment feedAllGroupFragmentM63087M4 = FeedAllGroupFragment.m63087M4(0);
        FeedAllGroupFragment feedAllGroupFragmentM63087M5 = FeedAllGroupFragment.m63087M4(1);
        arrayList.add(feedAllGroupFragmentM63087M4);
        arrayList.add(feedAllGroupFragmentM63087M5);
        this.f204481g.m219717k(arrayList);
        this.f204478d.setOnPageChangeListener(this.f204481g);
        this.f204478d.setAdapter(this.f204481g);
        this.f204477c.setupWithViewPager(this.f204478d);
        this.f204478d.setCurrentItem(!this.f204480f.f200003a ? 1 : 0);
        for (int i = 0; i < this.f204477c.getTabCount(); i++) {
            this.f204477c.getTabAt(i).setCustomView(this.f204481g.m219716j(i));
            bnl0.m105538V(this.f204477c.getTabAt(i).view, qa00.m175859d(11.0f));
        }
        this.f204477c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C21811b());
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zi0$a */
    public class C21810a extends FragmentPagerAdapter implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f204484a;

        public C21810a(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f204484a = new ArrayList();
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f204484a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NonNull
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f204484a.get(i);
        }

        @Override // p153l.cf60
        @Nullable
        public CharSequence getPageTitle(int i) {
            return (CharSequence) zi0.this.f204482h.get(i);
        }

        /* JADX INFO: renamed from: j */
        public View m219716j(int i) {
            View viewInflate = zi0.this.getAct().inflater().inflate(tec0.f173483D, (ViewGroup) null);
            VText vText = (VText) viewInflate.findViewById(hdc0.f108909d2);
            zi0.this.f204483i[i] = vText;
            if ((zi0.this.f204480f.f200003a && i == 0) || (!zi0.this.f204480f.f200003a && i == 1)) {
                vText.setTextColor(-1);
                zi0.this.f204483i[i].setBackground(zi0.this.f204479e.getResources().getDrawable(lbc0.f131142t));
            }
            vText.setText((CharSequence) zi0.this.f204482h.get(i));
            return viewInflate;
        }

        /* JADX INFO: renamed from: k */
        public void m219717k(List<PutongFrag> list) {
            this.f204484a.clear();
            if (NullChecker.m82487b(list)) {
                this.f204484a.addAll(list);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            String str;
            if ("我的圈子".equals(zi0.this.f204481g.getPageTitle(i))) {
                str = "joined";
            } else {
                str = "热门圈子".equals(zi0.this.f204481g.getPageTitle(i)) ? SuperlikeReason.popular : "";
            }
            tfj0.m190940c("e_circle_tab", "p_circle_list", new pf60("circle_tab", str));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.zi0$b */
    public class C21811b implements TabLayout.OnTabSelectedListener {
        public C21811b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            zi0.this.f204483i[position].setTextColor(-1);
            zi0.this.f204483i[position].setTypeface(lyh0.m156283c(3), 1);
            zi0.this.f204483i[position].setBackground(zi0.this.f204479e.getResources().getDrawable(lbc0.f131142t));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            zi0.this.f204483i[position].setTextColor(zi0.this.f204479e.getResources().getColor(k9c0.f124515k));
            zi0.this.f204483i[position].setTypeface(lyh0.m156283c(3), 0);
            zi0.this.f204483i[position].setBackground(zi0.this.f204479e.getResources().getDrawable(lbc0.f131150u));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
