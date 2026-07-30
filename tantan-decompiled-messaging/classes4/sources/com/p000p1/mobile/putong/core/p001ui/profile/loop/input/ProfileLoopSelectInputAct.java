package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.newui.photoalbum.MomentDetailPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.lqa;
import l.n6c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopSelectInputAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentDetailPager f1346c;

    /* JADX INFO: renamed from: d */
    public final List<ProfileSelectInputFrag> f1347d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f1348e = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopSelectInputAct$a */
    public class C0102a extends FragmentPagerAdapter {
        public C0102a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public int getCount() {
            return ProfileLoopSelectInputAct.this.f1347d.size();
        }

        @NotNull
        public Fragment getItem(int i) {
            return (Fragment) ProfileLoopSelectInputAct.this.f1347d.get(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopSelectInputAct$b */
    public static class C0103b {
        /* JADX INFO: renamed from: b */
        public static void m2197b(ProfileLoopSelectInputAct profileLoopSelectInputAct, View view) {
            profileLoopSelectInputAct.f1346c = ((ViewGroup) view).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m2198c(ProfileLoopSelectInputAct profileLoopSelectInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.N0, viewGroup, false);
            m2197b(profileLoopSelectInputAct, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m2189c2(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopSelectInputAct.class);
        intent.putExtra("loop_create_tag_info", str);
        intent.putExtra("loop_is_oversea", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m2190g2(Bundle bundle) {
        m2193e2();
    }

    /* JADX INFO: renamed from: b2 */
    public View m2191b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0103b.m2198c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public int m2192d2() {
        return this.f1348e;
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e2 */
    public final void m2193e2() {
        final boolean booleanExtra = getIntent().getBooleanExtra("loop_is_oversea", false);
        final String stringExtra = getIntent().getStringExtra("loop_create_tag_info");
        final ProfileSelectInputFrag profileSelectInputFrag = new ProfileSelectInputFrag();
        profileSelectInputFrag.m2223a5(new AdapterView.OnItemClickListener() { // from class: l.tka0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.f20285a.m2194h2(profileSelectInputFrag, booleanExtra, stringExtra, adapterView, view, i, j);
            }
        });
        this.f1347d.clear();
        this.f1347d.add(profileSelectInputFrag);
        if (booleanExtra) {
            final ProfileSelectInputFrag profileSelectInputFrag2 = new ProfileSelectInputFrag();
            profileSelectInputFrag2.m2223a5(new AdapterView.OnItemClickListener() { // from class: l.uka0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    this.f20684a.m2195i2(profileSelectInputFrag2, adapterView, view, i, j);
                }
            });
            this.f1347d.add(profileSelectInputFrag2);
        }
        C0102a c0102a = new C0102a(getSupportFragmentManager());
        this.f1346c.setIsCanScroll(false);
        this.f1346c.setAdapter(c0102a);
        this.f1346c.setCurrentItem(this.f1348e);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m2194h2(ProfileSelectInputFrag profileSelectInputFrag, boolean z, String str, AdapterView adapterView, View view, int i, long j) {
        String strM2061a;
        LoopSelectFillData loopSelectFillDataM2219U4 = profileSelectInputFrag.m2219U4(i);
        if (loopSelectFillDataM2219U4.m2071k()) {
            this.f1348e = 1;
            this.f1346c.setCurrentItem(1);
            this.f1347d.get(this.f1348e).m2222Z4(loopSelectFillDataM2219U4.m2061a());
            return;
        }
        Intent intent = new Intent();
        if (!lqa.g() || z) {
            strM2061a = loopSelectFillDataM2219U4.m2061a();
        } else {
            strM2061a = "中国·" + str + "·" + loopSelectFillDataM2219U4.m2061a();
        }
        intent.putExtra("loop_result_key", strM2061a);
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m2195i2(ProfileSelectInputFrag profileSelectInputFrag, AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent();
        intent.putExtra("loop_result_key", profileSelectInputFrag.m2220V4() + "·" + profileSelectInputFrag.m2219U4(i).m2061a());
        act().setResult(-1, intent);
        act().finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2191b2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.ska0
            public final void call(Object obj) {
                this.f19061a.m2190g2((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        if (this.f1348e != 1) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        } else {
            this.f1348e = 0;
            this.f1346c.setCurrentItem(0);
        }
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
    }
}
