package com.p046p1.mobile.putong.core.newui.discovery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VFrame;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;
import p149l.e30;
import p149l.f6c0;
import p149l.g2e;
import p149l.h2e;
import p149l.mkd0;
import p149l.u4c0;
import p149l.v930;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class DiscoveryHomeFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public VFrame f21354B;

    /* JADX INFO: renamed from: C */
    public TabLayout f21355C;

    /* JADX INFO: renamed from: D */
    public VPager f21356D;

    /* JADX INFO: renamed from: E */
    public String[] f21357E = {CoreModule.f17544b.getString(R$string.f18496eq), CoreModule.f17544b.getString(R$string.f18095Ri)};

    /* JADX INFO: renamed from: F */
    public Fragment f21358F;

    /* JADX INFO: renamed from: G */
    public Fragment f21359G;

    /* JADX INFO: renamed from: H */
    public VImage f21360H;

    /* JADX INFO: renamed from: I */
    public h2e f21361I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.DiscoveryHomeFrag$a */
    public class C7840a implements TabLayout.OnTabSelectedListener {
        public C7840a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 1) {
                xdl0.m208344M(DiscoveryHomeFrag.this.f21360H, false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m36280e5(Bundle bundle) {
        if (NullChecker.m81303a(bundle) && NullChecker.m81303a(this.f21356D)) {
            this.f21356D.setCurrentItem(bundle.getInt("bundle_show_position", -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m36281f5(Integer num) {
        xdl0.m208344M(this.f21360H, num.intValue() > 0);
    }

    /* JADX INFO: renamed from: a5 */
    public View m36282a5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g2e.m124151b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b5 */
    public final View m36283b5(String str, final int i) {
        View viewInflate = mo20578H2().inflate(f6c0.f95681Ze, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f173850He);
        if (i == 1) {
            this.f21360H = (VImage) viewInflate.findViewById(u4c0.f174223e3);
        }
        vText.setText(str);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.c2e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78351a.m36285d5(i, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: c5 */
    public void m36284c5() {
        this.f21358F = new ThemeSuggestFrag();
        this.f21359G = CoreModule.m29934N().mo60359ik();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f21358F);
        arrayList.add(this.f21359G);
        this.f21361I = new h2e(getChildFragmentManager(), arrayList);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m36285d5(int i, View view) {
        m36286g5(i);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(v930.m197533g(TabName.Moment)).subscribe(mkd0.m154955G(new e30() { // from class: l.d2e
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83356a.m36280e5((Bundle) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.m31483n3()).map(new w9j() { // from class: l.e2e
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.f2e
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94177a.m36281f5((Integer) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        xdl0.m208376g0(this.f21354B);
        m36284c5();
        this.f21356D.setAdapter(this.f21361I);
        this.f21355C.setupWithViewPager(this.f21356D);
        this.f21355C.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C7840a());
        m36287h5();
    }

    /* JADX INFO: renamed from: g5 */
    public final void m36286g5(int i) {
        if (this.f21356D.getAdapter() == null) {
            return;
        }
        this.f21356D.getCurrentItem();
        this.f21356D.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: h5 */
    public final void m36287h5() {
        for (int i = 0; i < this.f21355C.getTabCount(); i++) {
            this.f21355C.getTabAt(i).setCustomView(m36283b5(this.f21357E[i], i));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m36282a5(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f21359G.onActivityResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_explore_view";
    }
}
