package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.address;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.newui.photoalbum.MomentDetailPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.n6c0;
import org.jetbrains.annotations.NotNull;
import p003l.d30;
import p003l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryAddressSelectAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentDetailPager f289c;

    /* JADX INFO: renamed from: d */
    public int f290d = -1;

    /* JADX INFO: renamed from: e */
    public int f291e = -1;

    /* JADX INFO: renamed from: f */
    public List<MarryAddressSelectFrag> f292f;

    /* JADX INFO: renamed from: g */
    public MarryAddressSelectData f293g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$a */
    public class C0025a implements MarryAddressSelectFrag.InterfaceC0030b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MarryAddressSelectFrag f294a;

        public C0025a(MarryAddressSelectFrag marryAddressSelectFrag) {
            this.f294a = marryAddressSelectFrag;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.address.MarryAddressSelectFrag.InterfaceC0030b
        /* JADX INFO: renamed from: a */
        public void mo520a(int i) {
            MarryAddressSelectData marryAddressSelectDataM530R4 = this.f294a.m530R4(i);
            MarryAddressSelectAct.this.f290d = i;
            MarryAddressSelectAct.this.f291e = -1;
            if (marryAddressSelectDataM530R4.showArrow()) {
                MarryAddressSelectAct.this.f289c.setCurrentItem(1);
                ((MarryAddressSelectFrag) MarryAddressSelectAct.this.f292f.get(1)).m531T4(marryAddressSelectDataM530R4);
            } else {
                Intent intent = new Intent();
                MarryAddressSelectAct.this.m519i2(intent);
                MarryAddressSelectAct.this.act().setResult(-1, intent);
                MarryAddressSelectAct.this.act().finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$b */
    public class C0026b implements MarryAddressSelectFrag.InterfaceC0030b {
        public C0026b() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.address.MarryAddressSelectFrag.InterfaceC0030b
        /* JADX INFO: renamed from: a */
        public void mo520a(int i) {
            MarryAddressSelectAct.this.f291e = i;
            Intent intent = new Intent();
            MarryAddressSelectAct.this.m519i2(intent);
            MarryAddressSelectAct.this.act().setResult(-1, intent);
            MarryAddressSelectAct.this.act().finish();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$c */
    public class C0027c extends FragmentPagerAdapter {
        public C0027c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public int getCount() {
            return MarryAddressSelectAct.this.f292f.size();
        }

        @NotNull
        public Fragment getItem(int i) {
            return (Fragment) MarryAddressSelectAct.this.f292f.get(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$d */
    public static class C0028d {
        /* JADX INFO: renamed from: b */
        public static void m522b(MarryAddressSelectAct marryAddressSelectAct, View view) {
            marryAddressSelectAct.f289c = ((ViewGroup) view).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m523c(MarryAddressSelectAct marryAddressSelectAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.G, viewGroup, false);
            m522b(marryAddressSelectAct, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m513h2(Context context, MarryAddressSelectData marryAddressSelectData) {
        Intent intent = new Intent(context, (Class<?>) MarryAddressSelectAct.class);
        intent.putExtra("address_list", marryAddressSelectData);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m514k2(Bundle bundle) {
        setSwipeBackEnable(false);
        m517r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m515l2() {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m516m2() {
        this.f289c.setCurrentItem(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m517r() {
        MarryAddressSelectData marryAddressSelectData = (MarryAddressSelectData) getIntent().getSerializableExtra("address_list");
        this.f293g = marryAddressSelectData;
        if (marryAddressSelectData == null) {
            finish();
            return;
        }
        this.f292f = new ArrayList();
        MarryAddressSelectFrag marryAddressSelectFrag = new MarryAddressSelectFrag(new d30() { // from class: l.kvw
            @Override // p003l.d30
            public final void call() {
                this.f5085a.m515l2();
            }
        });
        this.f292f.add(marryAddressSelectFrag);
        marryAddressSelectFrag.m531T4(this.f293g);
        marryAddressSelectFrag.m532U4(new C0025a(marryAddressSelectFrag));
        Iterator<MarryAddressSelectData> it = this.f293g.getNextList().iterator();
        while (it.hasNext()) {
            if (it.next().hasNextData()) {
                MarryAddressSelectFrag marryAddressSelectFrag2 = new MarryAddressSelectFrag(new d30() { // from class: l.lvw
                    @Override // p003l.d30
                    public final void call() {
                        this.f5432a.m516m2();
                    }
                });
                marryAddressSelectFrag2.m532U4(new C0026b());
                this.f292f.add(marryAddressSelectFrag2);
                break;
            }
        }
        this.f289c.setAdapter(new C0027c(getSupportFragmentManager()));
    }

    /* JADX INFO: renamed from: g2 */
    public View m518g2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0028d.m523c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m519i2(Intent intent) {
        intent.putExtra("address_back_first", this.f290d);
        intent.putExtra("address_back_second", this.f291e);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m518g2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.jvw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4742a.m514k2((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        if (this.f289c.getCurrentItem() == 1) {
            this.f289c.setCurrentItem(0);
        } else {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        }
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
    }
}
