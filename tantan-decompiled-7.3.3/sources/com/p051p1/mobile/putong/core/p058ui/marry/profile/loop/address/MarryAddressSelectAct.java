package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.address;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.newui.photoalbum.MomentDetailPager;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.sec0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MarryAddressSelectAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentDetailPager f31246c;

    /* JADX INFO: renamed from: d */
    public int f31247d = -1;

    /* JADX INFO: renamed from: e */
    public int f31248e = -1;

    /* JADX INFO: renamed from: f */
    public List<MarryAddressSelectFrag> f31249f;

    /* JADX INFO: renamed from: g */
    public MarryAddressSelectData f31250g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$a */
    public class C8605a implements MarryAddressSelectFrag.InterfaceC8610b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MarryAddressSelectFrag f31251a;

        public C8605a(MarryAddressSelectFrag marryAddressSelectFrag) {
            this.f31251a = marryAddressSelectFrag;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.address.MarryAddressSelectFrag.InterfaceC8610b
        /* JADX INFO: renamed from: a */
        public void mo48656a(int i) {
            MarryAddressSelectData marryAddressSelectDataM48666R4 = this.f31251a.m48666R4(i);
            MarryAddressSelectAct.this.f31247d = i;
            MarryAddressSelectAct.this.f31248e = -1;
            if (marryAddressSelectDataM48666R4.showArrow()) {
                MarryAddressSelectAct.this.f31246c.setCurrentItem(1);
                ((MarryAddressSelectFrag) MarryAddressSelectAct.this.f31249f.get(1)).m48667T4(marryAddressSelectDataM48666R4);
            } else {
                Intent intent = new Intent();
                MarryAddressSelectAct.this.m48655k2(intent);
                MarryAddressSelectAct.this.act().setResult(-1, intent);
                MarryAddressSelectAct.this.act().m68056e2();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$b */
    public class C8606b implements MarryAddressSelectFrag.InterfaceC8610b {
        public C8606b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.address.MarryAddressSelectFrag.InterfaceC8610b
        /* JADX INFO: renamed from: a */
        public void mo48656a(int i) {
            MarryAddressSelectAct.this.f31248e = i;
            Intent intent = new Intent();
            MarryAddressSelectAct.this.m48655k2(intent);
            MarryAddressSelectAct.this.act().setResult(-1, intent);
            MarryAddressSelectAct.this.act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$c */
    public class C8607c extends FragmentPagerAdapter {
        public C8607c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // p153l.cf60
        public int getCount() {
            return MarryAddressSelectAct.this.f31249f.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int i) {
            return (Fragment) MarryAddressSelectAct.this.f31249f.get(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$d */
    public static class C8608d {
        /* JADX INFO: renamed from: b */
        public static void m48658b(MarryAddressSelectAct marryAddressSelectAct, View view) {
            marryAddressSelectAct.f31246c = (MomentDetailPager) ((ViewGroup) view).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m48659c(MarryAddressSelectAct marryAddressSelectAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167511G, viewGroup, false);
            m48658b(marryAddressSelectAct, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m48649i2(Context context, MarryAddressSelectData marryAddressSelectData) {
        Intent intent = new Intent(context, (Class<?>) MarryAddressSelectAct.class);
        intent.putExtra("address_list", marryAddressSelectData);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m48650l2(Bundle bundle) {
        setSwipeBackEnable(false);
        m48653r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m48651m2() {
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m48652n2() {
        this.f31246c.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: r */
    private void m48653r() {
        MarryAddressSelectData marryAddressSelectData = (MarryAddressSelectData) getIntent().getSerializableExtra("address_list");
        this.f31250g = marryAddressSelectData;
        if (marryAddressSelectData == null) {
            m68056e2();
            return;
        }
        this.f31249f = new ArrayList();
        MarryAddressSelectFrag marryAddressSelectFrag = new MarryAddressSelectFrag(new x20() { // from class: l.jyw
            @Override // p153l.x20
            public final void call() {
                this.f123205a.m48651m2();
            }
        });
        this.f31249f.add(marryAddressSelectFrag);
        marryAddressSelectFrag.m48667T4(this.f31250g);
        marryAddressSelectFrag.m48668U4(new C8605a(marryAddressSelectFrag));
        Iterator<MarryAddressSelectData> it = this.f31250g.getNextList().iterator();
        while (it.hasNext()) {
            if (it.next().hasNextData()) {
                MarryAddressSelectFrag marryAddressSelectFrag2 = new MarryAddressSelectFrag(new x20() { // from class: l.kyw
                    @Override // p153l.x20
                    public final void call() {
                        this.f129367a.m48652n2();
                    }
                });
                marryAddressSelectFrag2.m48668U4(new C8606b());
                this.f31249f.add(marryAddressSelectFrag2);
                break;
            }
        }
        this.f31246c.setAdapter(new C8607c(getSupportFragmentManager()));
    }

    /* JADX INFO: renamed from: h2 */
    public View m48654h2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8608d.m48659c(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m48654h2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.iyw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117644a.m48650l2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m48655k2(Intent intent) {
        intent.putExtra("address_back_first", this.f31247d);
        intent.putExtra("address_back_second", this.f31248e);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f31246c.getCurrentItem() == 1) {
            this.f31246c.setCurrentItem(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
    }
}
