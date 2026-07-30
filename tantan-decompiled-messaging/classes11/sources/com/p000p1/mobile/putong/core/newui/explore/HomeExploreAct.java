package com.p000p1.mobile.putong.core.newui.explore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.f6c0;
import l.j760;
import l.lqa;
import l.u4c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeExploreAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public View f164c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f165d;

    /* JADX INFO: renamed from: e */
    public String f166e = "HomeExploreAct";

    /* JADX INFO: renamed from: f */
    public HomeExploreFrag f167f;

    /* JADX INFO: renamed from: g */
    public String f168g;

    /* JADX INFO: renamed from: V1 */
    public static Intent m274V1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) HomeExploreAct.class);
        intent.putExtra("key_from", str);
        intent.putExtra("key_explore_type", str2);
        intent.setFlags(67108864);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X1 */
    private void m275X1() {
        if (NullChecker.a(getIntent())) {
            this.f168g = getIntent().getStringExtra("key_explore_type");
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m276Y1() {
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        HomeExploreFrag homeExploreFragI0 = supportFragmentManager.i0(this.f166e);
        this.f167f = homeExploreFragI0;
        if (homeExploreFragI0 == null) {
            this.f167f = new HomeExploreFrag();
            Bundle bundle = new Bundle();
            bundle.putString("key_explore_type", this.f168g);
            this.f167f.setArguments(bundle);
        }
        k kVarM = supportFragmentManager.m();
        kVarM.t(u4c0.y4, this.f167f, this.f166e);
        kVarM.j();
        supportFragmentManager.e0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Y2, viewGroup, false);
        this.f164c = viewInflate;
        this.f165d = (FrameLayout) viewInflate.findViewById(u4c0.y4);
        m276Y1();
        return this.f164c;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        m275X1();
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("tantanx_scene_name", this.f168g), vwb.Y("is_test_field", lqa.w() ? "is_test_field_y" : "is_test_field_n")});
    }

    public void initSubscription() {
        super.initSubscription();
    }

    public String pageId() {
        return "p_tantanx_card";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
    }
}
