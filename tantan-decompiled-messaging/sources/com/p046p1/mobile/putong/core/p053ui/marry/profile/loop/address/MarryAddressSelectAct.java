package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.address;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.newui.photoalbum.MomentDetailPager;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p149l.d30;
import p149l.e30;
import p149l.n6c0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryAddressSelectAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentDetailPager f30398c;

    /* JADX INFO: renamed from: d */
    public int f30399d = -1;

    /* JADX INFO: renamed from: e */
    public int f30400e = -1;

    /* JADX INFO: renamed from: f */
    public List<MarryAddressSelectFrag> f30401f;

    /* JADX INFO: renamed from: g */
    public MarryAddressSelectData f30402g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$a */
    public class C8442a implements MarryAddressSelectFrag.InterfaceC8447b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MarryAddressSelectFrag f30403a;

        public C8442a(MarryAddressSelectFrag marryAddressSelectFrag) {
            this.f30403a = marryAddressSelectFrag;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.address.MarryAddressSelectFrag.InterfaceC8447b
        /* JADX INFO: renamed from: a */
        public void mo47473a(int i) {
            MarryAddressSelectData marryAddressSelectDataM47483R4 = this.f30403a.m47483R4(i);
            MarryAddressSelectAct.this.f30399d = i;
            MarryAddressSelectAct.this.f30400e = -1;
            if (marryAddressSelectDataM47483R4.showArrow()) {
                MarryAddressSelectAct.this.f30398c.setCurrentItem(1);
                ((MarryAddressSelectFrag) MarryAddressSelectAct.this.f30401f.get(1)).m47484T4(marryAddressSelectDataM47483R4);
            } else {
                Intent intent = new Intent();
                MarryAddressSelectAct.this.m47472i2(intent);
                MarryAddressSelectAct.this.act().setResult(-1, intent);
                MarryAddressSelectAct.this.act().m66873d2();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$b */
    public class C8443b implements MarryAddressSelectFrag.InterfaceC8447b {
        public C8443b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.address.MarryAddressSelectFrag.InterfaceC8447b
        /* JADX INFO: renamed from: a */
        public void mo47473a(int i) {
            MarryAddressSelectAct.this.f30400e = i;
            Intent intent = new Intent();
            MarryAddressSelectAct.this.m47472i2(intent);
            MarryAddressSelectAct.this.act().setResult(-1, intent);
            MarryAddressSelectAct.this.act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$c */
    public class C8444c extends FragmentPagerAdapter {
        public C8444c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // p149l.w660
        public int getCount() {
            return MarryAddressSelectAct.this.f30401f.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int i) {
            return (Fragment) MarryAddressSelectAct.this.f30401f.get(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectAct$d */
    public static class C8445d {
        /* JADX INFO: renamed from: b */
        public static void m47475b(MarryAddressSelectAct marryAddressSelectAct, View view) {
            marryAddressSelectAct.f30398c = (MomentDetailPager) ((ViewGroup) view).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m47476c(MarryAddressSelectAct marryAddressSelectAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137297G, viewGroup, false);
            m47475b(marryAddressSelectAct, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m47466h2(Context context, MarryAddressSelectData marryAddressSelectData) {
        Intent intent = new Intent(context, (Class<?>) MarryAddressSelectAct.class);
        intent.putExtra("address_list", marryAddressSelectData);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m47467k2(Bundle bundle) {
        setSwipeBackEnable(false);
        m47470r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m47468l2() {
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m47469m2() {
        this.f30398c.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: r */
    private void m47470r() {
        MarryAddressSelectData marryAddressSelectData = (MarryAddressSelectData) getIntent().getSerializableExtra("address_list");
        this.f30402g = marryAddressSelectData;
        if (marryAddressSelectData == null) {
            m66873d2();
            return;
        }
        this.f30401f = new ArrayList();
        MarryAddressSelectFrag marryAddressSelectFrag = new MarryAddressSelectFrag(new d30() { // from class: l.kvw
            @Override // p149l.d30
            public final void call() {
                this.f124798a.m47468l2();
            }
        });
        this.f30401f.add(marryAddressSelectFrag);
        marryAddressSelectFrag.m47484T4(this.f30402g);
        marryAddressSelectFrag.m47485U4(new C8442a(marryAddressSelectFrag));
        Iterator<MarryAddressSelectData> it = this.f30402g.getNextList().iterator();
        while (it.hasNext()) {
            if (it.next().hasNextData()) {
                MarryAddressSelectFrag marryAddressSelectFrag2 = new MarryAddressSelectFrag(new d30() { // from class: l.lvw
                    @Override // p149l.d30
                    public final void call() {
                        this.f130207a.m47469m2();
                    }
                });
                marryAddressSelectFrag2.m47485U4(new C8443b());
                this.f30401f.add(marryAddressSelectFrag2);
                break;
            }
        }
        this.f30398c.setAdapter(new C8444c(getSupportFragmentManager()));
    }

    /* JADX INFO: renamed from: g2 */
    public View m47471g2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8445d.m47476c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m47472i2(Intent intent) {
        intent.putExtra("address_back_first", this.f30399d);
        intent.putExtra("address_back_second", this.f30400e);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m47471g2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.jvw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119994a.m47467k2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f30398c.getCurrentItem() == 1) {
            this.f30398c.setCurrentItem(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
    }
}
