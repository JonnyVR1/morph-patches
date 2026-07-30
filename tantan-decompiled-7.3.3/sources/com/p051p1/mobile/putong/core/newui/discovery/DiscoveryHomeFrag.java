package com.p051p1.mobile.putong.core.newui.discovery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VFrame;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.ji30;
import p153l.kec0;
import p153l.psd0;
import p153l.qcj;
import p153l.u3e;
import p153l.v3e;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class DiscoveryHomeFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public VFrame f22096B;

    /* JADX INFO: renamed from: C */
    public TabLayout f22097C;

    /* JADX INFO: renamed from: D */
    public VPager f22098D;

    /* JADX INFO: renamed from: E */
    public String[] f22099E = {CoreModule.f18263b.getString(R$string.f19875zq), CoreModule.f18263b.getString(R$string.f19496nj)};

    /* JADX INFO: renamed from: F */
    public Fragment f22100F;

    /* JADX INFO: renamed from: G */
    public Fragment f22101G;

    /* JADX INFO: renamed from: H */
    public VImage f22102H;

    /* JADX INFO: renamed from: I */
    public v3e f22103I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.DiscoveryHomeFrag$a */
    public class C7991a implements TabLayout.OnTabSelectedListener {
        public C7991a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 1) {
                bnl0.m105524M(DiscoveryHomeFrag.this.f22102H, false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m37283e5(Bundle bundle) {
        if (NullChecker.m82486a(bundle) && NullChecker.m82486a(this.f22098D)) {
            this.f22098D.setCurrentItem(bundle.getInt("bundle_show_position", -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m37284f5(Integer num) {
        bnl0.m105524M(this.f22102H, num.intValue() > 0);
    }

    /* JADX INFO: renamed from: a5 */
    public View m37285a5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u3e.m194361b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b5 */
    public final View m37286b5(String str, final int i) {
        View viewInflate = mo21577H2().inflate(kec0.f125854gf, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f69989Ke);
        if (i == 1) {
            this.f22102H = (VImage) viewInflate.findViewById(adc0.f70348g3);
        }
        vText.setText(str);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.q3e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155442a.m37288d5(i, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: c5 */
    public void m37287c5() {
        this.f22100F = new ThemeSuggestFrag();
        this.f22101G = CoreModule.m30932N().mo61543ik();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f22100F);
        arrayList.add(this.f22101G);
        this.f22103I = new v3e(getChildFragmentManager(), arrayList);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m37288d5(int i, View view) {
        m37289g5(i);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(ji30.m144963g(TabName.Moment)).subscribe(psd0.m173596G(new y20() { // from class: l.r3e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161033a.m37283e5((Bundle) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.m32486n3()).map(new qcj() { // from class: l.s3e
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.t3e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171917a.m37284f5((Integer) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        bnl0.m105556g0(this.f22096B);
        m37287c5();
        this.f22098D.setAdapter(this.f22103I);
        this.f22097C.setupWithViewPager(this.f22098D);
        this.f22097C.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C7991a());
        m37290h5();
    }

    /* JADX INFO: renamed from: g5 */
    public final void m37289g5(int i) {
        if (this.f22098D.getAdapter() == null) {
            return;
        }
        this.f22098D.getCurrentItem();
        this.f22098D.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: h5 */
    public final void m37290h5() {
        for (int i = 0; i < this.f22097C.getTabCount(); i++) {
            this.f22097C.getTabAt(i).setCustomView(m37286b5(this.f22099E[i], i));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m37285a5(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f22101G.onActivityResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_explore_view";
    }
}
