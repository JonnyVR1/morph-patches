package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.newui.photoalbum.MomentDetailPager;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.sec0;
import p153l.xra;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectInputAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentDetailPager f34372c;

    /* JADX INFO: renamed from: d */
    public final List<ProfileSelectInputFrag> f34373d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f34374e = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopSelectInputAct$a */
    public class C8840a extends FragmentPagerAdapter {
        public C8840a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // p153l.cf60
        public int getCount() {
            return ProfileLoopSelectInputAct.this.f34373d.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int i) {
            return (Fragment) ProfileLoopSelectInputAct.this.f34373d.get(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopSelectInputAct$b */
    public static class C8841b {
        /* JADX INFO: renamed from: b */
        public static void m52869b(ProfileLoopSelectInputAct profileLoopSelectInputAct, View view) {
            profileLoopSelectInputAct.f34372c = (MomentDetailPager) ((ViewGroup) view).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m52870c(ProfileLoopSelectInputAct profileLoopSelectInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167526N0, viewGroup, false);
            m52869b(profileLoopSelectInputAct, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m52861d2(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopSelectInputAct.class);
        intent.putExtra("loop_create_tag_info", str);
        intent.putExtra("loop_is_oversea", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m52862h2(Bundle bundle) {
        m52865g2();
    }

    /* JADX INFO: renamed from: c2 */
    public View m52863c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8841b.m52870c(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public int m52864e2() {
        return this.f34374e;
    }

    /* JADX INFO: renamed from: g2 */
    public final void m52865g2() {
        final boolean booleanExtra = getIntent().getBooleanExtra("loop_is_oversea", false);
        final String stringExtra = getIntent().getStringExtra("loop_create_tag_info");
        final ProfileSelectInputFrag profileSelectInputFrag = new ProfileSelectInputFrag();
        profileSelectInputFrag.m52885a5(new AdapterView.OnItemClickListener() { // from class: l.xsa0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.f196074a.m52866i2(profileSelectInputFrag, booleanExtra, stringExtra, adapterView, view, i, j);
            }
        });
        this.f34373d.clear();
        this.f34373d.add(profileSelectInputFrag);
        if (booleanExtra) {
            final ProfileSelectInputFrag profileSelectInputFrag2 = new ProfileSelectInputFrag();
            profileSelectInputFrag2.m52885a5(new AdapterView.OnItemClickListener() { // from class: l.ysa0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    this.f201382a.m52867k2(profileSelectInputFrag2, adapterView, view, i, j);
                }
            });
            this.f34373d.add(profileSelectInputFrag2);
        }
        C8840a c8840a = new C8840a(getSupportFragmentManager());
        this.f34372c.setIsCanScroll(false);
        this.f34372c.setAdapter(c8840a);
        this.f34372c.setCurrentItem(this.f34374e);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m52866i2(ProfileSelectInputFrag profileSelectInputFrag, boolean z, String str, AdapterView adapterView, View view, int i, long j) {
        String strM52758a;
        LoopSelectFillData loopSelectFillDataM52881U4 = profileSelectInputFrag.m52881U4(i);
        if (loopSelectFillDataM52881U4.m52768k()) {
            this.f34374e = 1;
            this.f34372c.setCurrentItem(1);
            this.f34373d.get(this.f34374e).m52884Z4(loopSelectFillDataM52881U4.m52758a());
            return;
        }
        Intent intent = new Intent();
        if (!xra.m212788g() || z) {
            strM52758a = loopSelectFillDataM52881U4.m52758a();
        } else {
            strM52758a = "中国·" + str + "·" + loopSelectFillDataM52881U4.m52758a();
        }
        intent.putExtra("loop_result_key", strM52758a);
        act().setResult(-1, intent);
        act().m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m52863c2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.wsa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190604a.m52862h2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m52867k2(ProfileSelectInputFrag profileSelectInputFrag, AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent();
        intent.putExtra("loop_result_key", profileSelectInputFrag.m52882V4() + "·" + profileSelectInputFrag.m52881U4(i).m52758a());
        act().setResult(-1, intent);
        act().m68056e2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f34374e != 1) {
            super.onBackPressed();
        } else {
            this.f34374e = 0;
            this.f34372c.setCurrentItem(0);
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
