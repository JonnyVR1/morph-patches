package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class w7v implements s7m<p7v> {

    /* JADX INFO: renamed from: a */
    public p7v f185100a;

    /* JADX INFO: renamed from: b */
    public ViewPager f185101b;

    /* JADX INFO: renamed from: c */
    public TabLayout f185102c;

    /* JADX INFO: renamed from: d */
    public o0u f185103d;

    public w7v(TabLayout tabLayout, NoSaveStateViewPager noSaveStateViewPager) {
        this.f185102c = tabLayout;
        this.f185101b = noSaveStateViewPager;
        m202081r();
        m202075d();
    }

    /* JADX INFO: renamed from: d */
    private void m202075d() {
        this.f185102c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20828a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m202076j(int i, View view) {
        this.f185101b.setCurrentItem(i);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f185100a.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(p7v p7vVar) {
        this.f185100a = p7vVar;
    }

    /* JADX INFO: renamed from: f */
    public int m202078f() {
        return this.f185101b.getCurrentItem();
    }

    /* JADX INFO: renamed from: i */
    public View m202079i(Act act, LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean) {
        View viewInflate = act.inflater().inflate(s6c0.f162798u, (ViewGroup) null);
        viewInflate.setTag(liveVoiceInternalSquareTabBean.getTabId());
        VText vText = (VText) viewInflate.findViewById(f5c0.f95111k2);
        vText.setText(liveVoiceInternalSquareTabBean.getName());
        vText.setBackgroundColor(0);
        return viewInflate;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m202080k(BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean, final String str, String str2) {
        int iM200293G;
        x4u.m207017c(this.f185100a.m167773r2().f135531b.getChildFragmentManager());
        this.f185103d = new o0u(this.f185100a.m167773r2(), str2);
        this.f185101b.setOffscreenPageLimit(baseLiveListBean.getList().size());
        this.f185101b.setAdapter(this.f185103d);
        List<LiveVoiceInternalSquareTabBean> list = baseLiveListBean.getList();
        this.f185103d.m162176q(list);
        this.f185103d.notifyDataSetChanged();
        int iM200293G2 = vwb.m200293G(baseLiveListBean.getList(), new q7v());
        if (iM200293G2 >= 0) {
            this.f185101b.setCurrentItem(iM200293G2);
        }
        if (str != null && (iM200293G = vwb.m200293G(baseLiveListBean.getList(), new w9j() { // from class: l.u7v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveVoiceInternalSquareTabBean) obj).getTabId(), str));
            }
        })) >= 0) {
            this.f185101b.setCurrentItem(iM200293G);
        }
        this.f185102c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20829b());
        final int i = 0;
        while (i < this.f185102c.getTabCount()) {
            LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean = list.get(i);
            TabLayout.Tab tabAt = this.f185102c.getTabAt(i);
            View viewM202079i = m202079i(getAct(), liveVoiceInternalSquareTabBean);
            xdl0.m208329E0(viewM202079i, new View.OnClickListener() { // from class: l.v7v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180419a.m202076j(i, view);
                }
            });
            if (tabAt != null) {
                tabAt.setCustomView(viewM202079i);
            }
            boolean z = i == m202078f();
            viewM202079i.findViewById(f5c0.f95111k2).setSelected(z);
            if (z) {
                ((TextView) viewM202079i.findViewById(f5c0.f95111k2)).setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                ((TextView) viewM202079i.findViewById(f5c0.f95111k2)).setTypeface(Typeface.DEFAULT);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m202081r() {
        this.f185102c.setupWithViewPager(this.f185101b);
        this.f185102c.setTabRippleColorResource(f1c0.f94077n);
        this.f185102c.setSelectedTabIndicator(new ColorDrawable(0));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.w7v$a */
    public class C20828a implements TabLayout.OnTabSelectedListener {
        public C20828a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            w7v.this.f185100a.m167774s2(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.w7v$b */
    public class C20829b implements TabLayout.OnTabSelectedListener {
        public C20829b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                ((TextView) customView.findViewById(f5c0.f95111k2)).setTypeface(Typeface.DEFAULT_BOLD);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                ((TextView) customView.findViewById(f5c0.f95111k2)).setTypeface(Typeface.DEFAULT);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
