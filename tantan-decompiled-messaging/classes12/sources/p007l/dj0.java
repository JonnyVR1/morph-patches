package p007l;

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
import com.p000p1.mobile.putong.data.SuperlikeReason;
import com.p000p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.eqh0;
import l.j760;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dj0 implements s7m<cj0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f6950a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f6951b;

    /* JADX INFO: renamed from: c */
    public TabLayout f6952c;

    /* JADX INFO: renamed from: d */
    public DiscoveryPager f6953d;

    /* JADX INFO: renamed from: e */
    public PutongAct f6954e;

    /* JADX INFO: renamed from: f */
    public cj0 f6955f;

    /* JADX INFO: renamed from: g */
    public C2360a f6956g;

    /* JADX INFO: renamed from: h */
    public List<String> f6957h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public VText[] f6958i = new VText[2];

    public dj0(PutongAct putongAct) {
        this.f6954e = putongAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9412C0() {
        return this.f6954e;
    }

    /* JADX INFO: renamed from: f */
    public View m9413f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ej0.m9893b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m9415i1(cj0 cj0Var) {
        this.f6955f = cj0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9413f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m9416r() {
        this.f6951b.setTitle("圈子");
        this.f6951b.setLeftIconAsBack(this.f6954e);
        this.f6957h.add(0, "我的圈子");
        this.f6957h.add(1, "热门圈子");
        this.f6956g = new C2360a(this.f6954e.getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        FeedAllGroupFragment feedAllGroupFragmentM2874M4 = FeedAllGroupFragment.m2874M4(0);
        FeedAllGroupFragment feedAllGroupFragmentM2874M5 = FeedAllGroupFragment.m2874M4(1);
        arrayList.add(feedAllGroupFragmentM2874M4);
        arrayList.add(feedAllGroupFragmentM2874M5);
        this.f6956g.m9418k(arrayList);
        this.f6953d.setOnPageChangeListener(this.f6956g);
        this.f6953d.setAdapter(this.f6956g);
        this.f6952c.setupWithViewPager(this.f6953d);
        this.f6953d.setCurrentItem(!this.f6955f.f6657a ? 1 : 0);
        for (int i = 0; i < this.f6952c.getTabCount(); i++) {
            this.f6952c.getTabAt(i).setCustomView(this.f6956g.m9417j(i));
            xdl0.V(this.f6952c.getTabAt(i).view, t100.d(11.0f));
        }
        this.f6952c.addOnTabSelectedListener(new C2361b());
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.dj0$a */
    public class C2360a extends FragmentPagerAdapter implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f6959a;

        public C2360a(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f6959a = new ArrayList();
        }

        public int getCount() {
            return this.f6959a.size();
        }

        @NonNull
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f6959a.get(i);
        }

        @Nullable
        public CharSequence getPageTitle(int i) {
            return (CharSequence) dj0.this.f6957h.get(i);
        }

        /* JADX INFO: renamed from: j */
        public View m9417j(int i) {
            View viewInflate = dj0.this.act().inflater().inflate(o6c0.f11033D, (ViewGroup) null);
            VText vTextFindViewById = viewInflate.findViewById(b5c0.f6037d2);
            dj0.this.f6958i[i] = vTextFindViewById;
            if ((dj0.this.f6955f.f6657a && i == 0) || (!dj0.this.f6955f.f6657a && i == 1)) {
                vTextFindViewById.setTextColor(-1);
                dj0.this.f6958i[i].setBackground(dj0.this.f6954e.getResources().getDrawable(f3c0.f7907t));
            }
            vTextFindViewById.setText((CharSequence) dj0.this.f6957h.get(i));
            return viewInflate;
        }

        /* JADX INFO: renamed from: k */
        public void m9418k(List<PutongFrag> list) {
            this.f6959a.clear();
            if (NullChecker.b(list)) {
                this.f6959a.addAll(list);
            }
            notifyDataSetChanged();
        }

        public void onPageSelected(int i) {
            String str;
            if ("我的圈子".equals(dj0.this.f6956g.getPageTitle(i))) {
                str = "joined";
            } else {
                str = "热门圈子".equals(dj0.this.f6956g.getPageTitle(i)) ? SuperlikeReason.popular : "";
            }
            p6j0.m12913c("e_circle_tab", "p_circle_list", new j760("circle_tab", str));
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.dj0$b */
    public class C2361b implements TabLayout.OnTabSelectedListener {
        public C2361b() {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            dj0.this.f6958i[position].setTextColor(-1);
            dj0.this.f6958i[position].setTypeface(eqh0.c(3), 1);
            dj0.this.f6958i[position].setBackground(dj0.this.f6954e.getResources().getDrawable(f3c0.f7907t));
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            int position = tab.getPosition();
            dj0.this.f6958i[position].setTextColor(dj0.this.f6954e.getResources().getColor(e1c0.f7148k));
            dj0.this.f6958i[position].setTypeface(eqh0.c(3), 0);
            dj0.this.f6958i[position].setBackground(dj0.this.f6954e.getResources().getDrawable(f3c0.f7915u));
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
