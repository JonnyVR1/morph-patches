package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class x9v implements iam<q9v> {

    /* JADX INFO: renamed from: a */
    public q9v f192966a;

    /* JADX INFO: renamed from: b */
    public ViewPager f192967b;

    /* JADX INFO: renamed from: c */
    public TabLayout f192968c;

    /* JADX INFO: renamed from: d */
    public p2u f192969d;

    public x9v(TabLayout tabLayout, NoSaveStateViewPager noSaveStateViewPager) {
        this.f192968c = tabLayout;
        this.f192967b = noSaveStateViewPager;
        m209822r();
        m209816d();
    }

    /* JADX INFO: renamed from: d */
    private void m209816d() {
        this.f192968c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C21268a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m209817j(int i, View view) {
        this.f192967b.setCurrentItem(i);
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
        return this.f192966a.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(q9v q9vVar) {
        this.f192966a = q9vVar;
    }

    /* JADX INFO: renamed from: f */
    public int m209819f() {
        return this.f192967b.getCurrentItem();
    }

    /* JADX INFO: renamed from: i */
    public View m209820i(Act act, LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean) {
        View viewInflate = act.inflater().inflate(xec0.f193912u, (ViewGroup) null);
        viewInflate.setTag(liveVoiceInternalSquareTabBean.getTabId());
        VText vText = (VText) viewInflate.findViewById(ldc0.f131568k2);
        vText.setText(liveVoiceInternalSquareTabBean.getName());
        vText.setBackgroundColor(0);
        return viewInflate;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m209821k(BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean, final String str, String str2) {
        int iM147476G;
        y6u.m214499c(this.f192966a.m175846r2().f143738b.getChildFragmentManager());
        this.f192969d = new p2u(this.f192966a.m175846r2(), str2);
        this.f192967b.setOffscreenPageLimit(baseLiveListBean.getList().size());
        this.f192967b.setAdapter(this.f192969d);
        List<LiveVoiceInternalSquareTabBean> list = baseLiveListBean.getList();
        this.f192969d.m170404q(list);
        this.f192969d.notifyDataSetChanged();
        int iM147476G2 = jyb.m147476G(baseLiveListBean.getList(), new r9v());
        if (iM147476G2 >= 0) {
            this.f192967b.setCurrentItem(iM147476G2);
        }
        if (str != null && (iM147476G = jyb.m147476G(baseLiveListBean.getList(), new qcj() { // from class: l.v9v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveVoiceInternalSquareTabBean) obj).getTabId(), str));
            }
        })) >= 0) {
            this.f192967b.setCurrentItem(iM147476G);
        }
        this.f192968c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C21269b());
        final int i = 0;
        while (i < this.f192968c.getTabCount()) {
            LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean = list.get(i);
            TabLayout.Tab tabAt = this.f192968c.getTabAt(i);
            View viewM209820i = m209820i(getAct(), liveVoiceInternalSquareTabBean);
            bnl0.m105509E0(viewM209820i, new View.OnClickListener() { // from class: l.w9v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188066a.m209817j(i, view);
                }
            });
            if (tabAt != null) {
                tabAt.setCustomView(viewM209820i);
            }
            boolean z = i == m209819f();
            viewM209820i.findViewById(ldc0.f131568k2).setSelected(z);
            if (z) {
                ((TextView) viewM209820i.findViewById(ldc0.f131568k2)).setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                ((TextView) viewM209820i.findViewById(ldc0.f131568k2)).setTypeface(Typeface.DEFAULT);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m209822r() {
        this.f192968c.setupWithViewPager(this.f192967b);
        this.f192968c.setTabRippleColorResource(l9c0.f130601n);
        this.f192968c.setSelectedTabIndicator(new ColorDrawable(0));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.x9v$a */
    public class C21268a implements TabLayout.OnTabSelectedListener {
        public C21268a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            x9v.this.f192966a.m175847s2(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.x9v$b */
    public class C21269b implements TabLayout.OnTabSelectedListener {
        public C21269b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                ((TextView) customView.findViewById(ldc0.f131568k2)).setTypeface(Typeface.DEFAULT_BOLD);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            if (customView != null) {
                ((TextView) customView.findViewById(ldc0.f131568k2)).setTypeface(Typeface.DEFAULT);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
