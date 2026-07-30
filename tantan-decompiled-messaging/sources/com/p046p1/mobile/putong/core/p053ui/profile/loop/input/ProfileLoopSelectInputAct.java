package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.newui.photoalbum.MomentDetailPager;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p149l.e30;
import p149l.lqa;
import p149l.n6c0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectInputAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentDetailPager f33524c;

    /* JADX INFO: renamed from: d */
    public final List<ProfileSelectInputFrag> f33525d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f33526e = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopSelectInputAct$a */
    public class C8677a extends FragmentPagerAdapter {
        public C8677a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // p149l.w660
        public int getCount() {
            return ProfileLoopSelectInputAct.this.f33525d.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int i) {
            return (Fragment) ProfileLoopSelectInputAct.this.f33525d.get(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopSelectInputAct$b */
    public static class C8678b {
        /* JADX INFO: renamed from: b */
        public static void m51686b(ProfileLoopSelectInputAct profileLoopSelectInputAct, View view) {
            profileLoopSelectInputAct.f33524c = (MomentDetailPager) ((ViewGroup) view).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m51687c(ProfileLoopSelectInputAct profileLoopSelectInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137312N0, viewGroup, false);
            m51686b(profileLoopSelectInputAct, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m51678c2(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopSelectInputAct.class);
        intent.putExtra("loop_create_tag_info", str);
        intent.putExtra("loop_is_oversea", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m51679g2(Bundle bundle) {
        m51682e2();
    }

    /* JADX INFO: renamed from: b2 */
    public View m51680b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8678b.m51687c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public int m51681d2() {
        return this.f33526e;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m51682e2() {
        final boolean booleanExtra = getIntent().getBooleanExtra("loop_is_oversea", false);
        final String stringExtra = getIntent().getStringExtra("loop_create_tag_info");
        final ProfileSelectInputFrag profileSelectInputFrag = new ProfileSelectInputFrag();
        profileSelectInputFrag.m51702a5(new AdapterView.OnItemClickListener() { // from class: l.tka0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.f170846a.m51683h2(profileSelectInputFrag, booleanExtra, stringExtra, adapterView, view, i, j);
            }
        });
        this.f33525d.clear();
        this.f33525d.add(profileSelectInputFrag);
        if (booleanExtra) {
            final ProfileSelectInputFrag profileSelectInputFrag2 = new ProfileSelectInputFrag();
            profileSelectInputFrag2.m51702a5(new AdapterView.OnItemClickListener() { // from class: l.uka0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    this.f176914a.m51684i2(profileSelectInputFrag2, adapterView, view, i, j);
                }
            });
            this.f33525d.add(profileSelectInputFrag2);
        }
        C8677a c8677a = new C8677a(getSupportFragmentManager());
        this.f33524c.setIsCanScroll(false);
        this.f33524c.setAdapter(c8677a);
        this.f33524c.setCurrentItem(this.f33526e);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m51683h2(ProfileSelectInputFrag profileSelectInputFrag, boolean z, String str, AdapterView adapterView, View view, int i, long j) {
        String strM51575a;
        LoopSelectFillData loopSelectFillDataM51698U4 = profileSelectInputFrag.m51698U4(i);
        if (loopSelectFillDataM51698U4.m51585k()) {
            this.f33526e = 1;
            this.f33524c.setCurrentItem(1);
            this.f33525d.get(this.f33526e).m51701Z4(loopSelectFillDataM51698U4.m51575a());
            return;
        }
        Intent intent = new Intent();
        if (!lqa.m150969g() || z) {
            strM51575a = loopSelectFillDataM51698U4.m51575a();
        } else {
            strM51575a = "中国·" + str + "·" + loopSelectFillDataM51698U4.m51575a();
        }
        intent.putExtra("loop_result_key", strM51575a);
        act().setResult(-1, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m51684i2(ProfileSelectInputFrag profileSelectInputFrag, AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent();
        intent.putExtra("loop_result_key", profileSelectInputFrag.m51699V4() + "·" + profileSelectInputFrag.m51698U4(i).m51575a());
        act().setResult(-1, intent);
        act().m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m51680b2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.ska0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164944a.m51679g2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f33526e != 1) {
            super.onBackPressed();
        } else {
            this.f33526e = 0;
            this.f33524c.setCurrentItem(0);
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
