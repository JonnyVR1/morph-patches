package com.p051p1.mobile.putong.core.p058ui.likedusers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.ddc0;

/* JADX INFO: loaded from: classes3.dex */
public class LikedUsersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LikedUserFrag f30836c;

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return CoreModule.m30933P().m143405a().mo34436Vf();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(ddc0.f87908n);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        Fragment fragmentM2558i0 = supportFragmentManager.m2558i0("liked_users_frag_root");
        if (fragmentM2558i0 instanceof LikedUserFrag) {
            this.f30836c = (LikedUserFrag) fragmentM2558i0;
            return frameLayout;
        }
        this.f30836c = new LikedUserFrag();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.m2805c(ddc0.f87908n, this.f30836c, "liked_users_frag_root");
        abstractC0428kM2568m.mo2709j();
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f30836c.m47967S4().m125909c1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_who_i_liked";
    }
}
