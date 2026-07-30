package com.p000p1.mobile.putong.core.newui.discovery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Counter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.f6c0;
import l.g2e;
import l.mkd0;
import l.u4c0;
import l.v930;
import l.w9j;
import l.xdl0;
import p009l.h2e;
import v.VFrame;
import v.VImage;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DiscoveryHomeFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public VFrame f132B;

    /* JADX INFO: renamed from: C */
    public TabLayout f133C;

    /* JADX INFO: renamed from: D */
    public VPager f134D;

    /* JADX INFO: renamed from: E */
    public String[] f135E = {CoreModule.b.getString(R.string.eq), CoreModule.b.getString(R.string.Ri)};

    /* JADX INFO: renamed from: F */
    public Fragment f136F;

    /* JADX INFO: renamed from: G */
    public Fragment f137G;

    /* JADX INFO: renamed from: H */
    public VImage f138H;

    /* JADX INFO: renamed from: I */
    public h2e f139I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.DiscoveryHomeFrag$a */
    public class C0004a implements TabLayout.OnTabSelectedListener {
        public C0004a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 1) {
                xdl0.M(DiscoveryHomeFrag.this.f138H, false);
            }
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m196e5(Bundle bundle) {
        if (NullChecker.a(bundle) && NullChecker.a(this.f134D)) {
            this.f134D.setCurrentItem(bundle.getInt("bundle_show_position", -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m197f5(Integer num) {
        xdl0.M(this.f138H, num.intValue() > 0);
    }

    /* JADX INFO: renamed from: a5 */
    public View m198a5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g2e.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b5 */
    public final View m199b5(String str, final int i) {
        View viewInflate = H2().inflate(f6c0.Ze, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.He);
        if (i == 1) {
            this.f138H = viewInflate.findViewById(u4c0.e3);
        }
        vTextFindViewById.setText(str);
        xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.c2e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10421a.m201d5(i, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: c5 */
    public void m200c5() {
        this.f136F = new ThemeSuggestFrag();
        this.f137G = CoreModule.N().ik();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f136F);
        arrayList.add(this.f137G);
        this.f139I = new h2e(getChildFragmentManager(), arrayList);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m201d5(int i, View view) {
        m204g5(i);
    }

    /* JADX INFO: renamed from: f4 */
    public void m202f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        duringCreated(v930.g(TabName.Moment)).subscribe(mkd0.G(new e30() { // from class: l.d2e
            public final void call(Object obj) {
                this.f10849a.m196e5((Bundle) obj);
            }
        }));
        duringCreated(CoreModule.c.n3()).map(new w9j() { // from class: l.e2e
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.f2e
            public final void call(Object obj) {
                this.f12753a.m197f5((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m203g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        xdl0.g0(new View[]{this.f132B});
        m200c5();
        this.f134D.setAdapter(this.f139I);
        this.f133C.setupWithViewPager(this.f134D);
        this.f133C.addOnTabSelectedListener(new C0004a());
        m205h5();
    }

    /* JADX INFO: renamed from: g5 */
    public final void m204g5(int i) {
        if (this.f134D.getAdapter() == null) {
            return;
        }
        this.f134D.getCurrentItem();
        this.f134D.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: h5 */
    public final void m205h5() {
        for (int i = 0; i < this.f133C.getTabCount(); i++) {
            this.f133C.getTabAt(i).setCustomView(m199b5(this.f135E[i], i));
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m198a5(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f137G.onActivityResult(i, i2, intent);
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
    }

    public String pageId() {
        return "p_explore_view";
    }
}
