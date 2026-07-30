package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class t7v implements s7m<n7v> {

    /* JADX INFO: renamed from: a */
    public n7v f168774a;

    /* JADX INFO: renamed from: b */
    public ViewPager f168775b;

    /* JADX INFO: renamed from: c */
    public TabLayout f168776c;

    /* JADX INFO: renamed from: d */
    public o0u f168777d;

    /* JADX INFO: renamed from: e */
    public String f168778e;

    /* JADX INFO: renamed from: f */
    public BaseLiveListBean<LiveVoiceInternalSquareTabBean> f168779f;

    public t7v(TabLayout tabLayout, NoSaveStateViewPager noSaveStateViewPager) {
        this.f168776c = tabLayout;
        this.f168775b = noSaveStateViewPager;
        m187516r();
        m187510e();
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
        return this.f168774a.act();
    }

    /* JADX INFO: renamed from: e */
    public final void m187510e() {
        this.f168776c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20123a());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n7v n7vVar) {
        this.f168774a = n7vVar;
    }

    /* JADX INFO: renamed from: i */
    public int m187512i() {
        return this.f168775b.getCurrentItem();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public View m187513j(Act act, LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean) {
        View viewInflate = act.inflater().inflate(s6c0.f162795t, (ViewGroup) null);
        String tabId = liveVoiceInternalSquareTabBean.getTabId();
        viewInflate.setTag(tabId);
        VText vText = (VText) viewInflate.findViewById(f5c0.f95111k2);
        vText.setText(liveVoiceInternalSquareTabBean.getName());
        ImageView imageView = (ImageView) viewInflate.findViewById(f5c0.f95118m1);
        if (TextUtils.isEmpty(liveVoiceInternalSquareTabBean.getBubble()) || !((bgv) ypv.m215673l(fld0.f98151f)).m101725e(tabId)) {
            xdl0.m208344M(imageView, false);
        } else {
            this.f168778e = tabId;
            xdl0.m208344M(imageView, true);
        }
        vText.setBackgroundColor(0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m187514k(int i, View view) {
        this.f168775b.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: l */
    public void m187515l(BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean, final String str, String str2) {
        int iM200293G;
        this.f168779f = baseLiveListBean;
        x4u.m207017c(this.f168774a.m158165r2().f135531b.getChildFragmentManager());
        this.f168777d = new o0u(this.f168774a.m158165r2(), str2);
        this.f168775b.setOffscreenPageLimit(baseLiveListBean.getList().size());
        this.f168775b.setAdapter(this.f168777d);
        this.f168776c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20124b(baseLiveListBean));
        List<LiveVoiceInternalSquareTabBean> list = baseLiveListBean.getList();
        this.f168777d.m162176q(list);
        this.f168777d.notifyDataSetChanged();
        int iM200293G2 = vwb.m200293G(baseLiveListBean.getList(), new q7v());
        if (iM200293G2 >= 0) {
            this.f168775b.setCurrentItem(iM200293G2);
        }
        if (str != null && (iM200293G = vwb.m200293G(baseLiveListBean.getList(), new w9j() { // from class: l.r7v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveVoiceInternalSquareTabBean) obj).getTabId(), str));
            }
        })) >= 0) {
            this.f168775b.setCurrentItem(iM200293G);
        }
        final int i = 0;
        while (i < this.f168776c.getTabCount()) {
            LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean = list.get(i);
            TabLayout.Tab tabAt = this.f168776c.getTabAt(i);
            View viewM187513j = m187513j(getAct(), liveVoiceInternalSquareTabBean);
            xdl0.m208329E0(viewM187513j, new View.OnClickListener() { // from class: l.s7v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162944a.m187514k(i, view);
                }
            });
            if (tabAt != null) {
                tabAt.setCustomView(viewM187513j);
            }
            boolean z = i == m187512i();
            viewM187513j.findViewById(f5c0.f95111k2).setSelected(z);
            if (z) {
                ((TextView) viewM187513j.findViewById(f5c0.f95111k2)).setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                ((TextView) viewM187513j.findViewById(f5c0.f95111k2)).setTypeface(Typeface.DEFAULT);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m187516r() {
        this.f168776c.setupWithViewPager(this.f168775b);
        this.f168776c.setTabRippleColorResource(f1c0.f94077n);
        this.f168776c.setSelectedTabIndicator(new ColorDrawable(0));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.t7v$a */
    public class C20123a implements TabLayout.OnTabSelectedListener {
        public C20123a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            t7v.this.f168774a.m158166s2(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.t7v$b */
    public class C20124b implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseLiveListBean f168781a;

        public C20124b(BaseLiveListBean baseLiveListBean) {
            this.f168781a = baseLiveListBean;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                ((TextView) customView.findViewById(f5c0.f95111k2)).setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.m208344M(customView.findViewById(f5c0.f95118m1), false);
            }
            if (((LiveVoiceInternalSquareTabBean) this.f168781a.getList().get(tab.getPosition())).getTabId().equals(t7v.this.f168778e)) {
                ((bgv) ypv.m215673l(fld0.f98151f)).m101720H(t7v.this.f168778e);
            }
            t7v.this.f168777d.m162174o(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                ((TextView) customView.findViewById(f5c0.f95111k2)).setTypeface(Typeface.DEFAULT);
            }
            t7v.this.f168777d.m162175p(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
