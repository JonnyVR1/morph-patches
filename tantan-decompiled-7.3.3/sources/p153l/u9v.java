package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class u9v implements iam<o9v> {

    /* JADX INFO: renamed from: a */
    public o9v f178138a;

    /* JADX INFO: renamed from: b */
    public ViewPager f178139b;

    /* JADX INFO: renamed from: c */
    public TabLayout f178140c;

    /* JADX INFO: renamed from: d */
    public p2u f178141d;

    /* JADX INFO: renamed from: e */
    public String f178142e;

    /* JADX INFO: renamed from: f */
    public BaseLiveListBean<LiveVoiceInternalSquareTabBean> f178143f;

    public u9v(TabLayout tabLayout, NoSaveStateViewPager noSaveStateViewPager) {
        this.f178140c = tabLayout;
        this.f178139b = noSaveStateViewPager;
        m195131r();
        m195125e();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f178138a.act();
    }

    /* JADX INFO: renamed from: e */
    public final void m195125e() {
        this.f178140c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20529a());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(o9v o9vVar) {
        this.f178138a = o9vVar;
    }

    /* JADX INFO: renamed from: i */
    public int m195127i() {
        return this.f178139b.getCurrentItem();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public View m195128j(Act act, LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean) {
        View viewInflate = act.inflater().inflate(xec0.f193909t, (ViewGroup) null);
        String tabId = liveVoiceInternalSquareTabBean.getTabId();
        viewInflate.setTag(tabId);
        VText vText = (VText) viewInflate.findViewById(ldc0.f131568k2);
        vText.setText(liveVoiceInternalSquareTabBean.getName());
        ImageView imageView = (ImageView) viewInflate.findViewById(ldc0.f131575m1);
        if (TextUtils.isEmpty(liveVoiceInternalSquareTabBean.getBubble()) || !((civ) zrv.m221194l(htd0.f111524f)).m109961e(tabId)) {
            bnl0.m105524M(imageView, false);
        } else {
            this.f178142e = tabId;
            bnl0.m105524M(imageView, true);
        }
        vText.setBackgroundColor(0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m195129k(int i, View view) {
        this.f178139b.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: l */
    public void m195130l(BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean, final String str, String str2) {
        int iM147476G;
        this.f178143f = baseLiveListBean;
        y6u.m214499c(this.f178138a.m166813r2().f143738b.getChildFragmentManager());
        this.f178141d = new p2u(this.f178138a.m166813r2(), str2);
        this.f178139b.setOffscreenPageLimit(baseLiveListBean.getList().size());
        this.f178139b.setAdapter(this.f178141d);
        this.f178140c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20530b(baseLiveListBean));
        List<LiveVoiceInternalSquareTabBean> list = baseLiveListBean.getList();
        this.f178141d.m170404q(list);
        this.f178141d.notifyDataSetChanged();
        int iM147476G2 = jyb.m147476G(baseLiveListBean.getList(), new r9v());
        if (iM147476G2 >= 0) {
            this.f178139b.setCurrentItem(iM147476G2);
        }
        if (str != null && (iM147476G = jyb.m147476G(baseLiveListBean.getList(), new qcj() { // from class: l.s9v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveVoiceInternalSquareTabBean) obj).getTabId(), str));
            }
        })) >= 0) {
            this.f178139b.setCurrentItem(iM147476G);
        }
        final int i = 0;
        while (i < this.f178140c.getTabCount()) {
            LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean = list.get(i);
            TabLayout.Tab tabAt = this.f178140c.getTabAt(i);
            View viewM195128j = m195128j(getAct(), liveVoiceInternalSquareTabBean);
            bnl0.m105509E0(viewM195128j, new View.OnClickListener() { // from class: l.t9v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f172671a.m195129k(i, view);
                }
            });
            if (tabAt != null) {
                tabAt.setCustomView(viewM195128j);
            }
            boolean z = i == m195127i();
            viewM195128j.findViewById(ldc0.f131568k2).setSelected(z);
            if (z) {
                ((TextView) viewM195128j.findViewById(ldc0.f131568k2)).setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                ((TextView) viewM195128j.findViewById(ldc0.f131568k2)).setTypeface(Typeface.DEFAULT);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m195131r() {
        this.f178140c.setupWithViewPager(this.f178139b);
        this.f178140c.setTabRippleColorResource(l9c0.f130601n);
        this.f178140c.setSelectedTabIndicator(new ColorDrawable(0));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.u9v$a */
    public class C20529a implements TabLayout.OnTabSelectedListener {
        public C20529a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            u9v.this.f178138a.m166814s2(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.u9v$b */
    public class C20530b implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseLiveListBean f178145a;

        public C20530b(BaseLiveListBean baseLiveListBean) {
            this.f178145a = baseLiveListBean;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                ((TextView) customView.findViewById(ldc0.f131568k2)).setTypeface(Typeface.DEFAULT_BOLD);
                bnl0.m105524M(customView.findViewById(ldc0.f131575m1), false);
            }
            if (((LiveVoiceInternalSquareTabBean) this.f178145a.getList().get(tab.getPosition())).getTabId().equals(u9v.this.f178142e)) {
                ((civ) zrv.m221194l(htd0.f111524f)).m109956H(u9v.this.f178142e);
            }
            u9v.this.f178141d.m170402o(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                ((TextView) customView.findViewById(ldc0.f131568k2)).setTypeface(Typeface.DEFAULT);
            }
            u9v.this.f178141d.m170403p(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
