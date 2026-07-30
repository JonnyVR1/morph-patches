package com.p046p1.mobile.putong.core.p053ui.likedusers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.x4c0;

/* JADX INFO: loaded from: classes12.dex */
public class LikedUsersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LikedUserFrag f29988c;

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return CoreModule.m29935P().m94651a().mo33433Vf();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.f191003n);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        Fragment fragmentM2557i0 = supportFragmentManager.m2557i0("liked_users_frag_root");
        if (fragmentM2557i0 instanceof LikedUserFrag) {
            this.f29988c = (LikedUserFrag) fragmentM2557i0;
            return frameLayout;
        }
        this.f29988c = new LikedUserFrag();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.m2804c(x4c0.f191003n, this.f29988c, "liked_users_frag_root");
        abstractC0427kM2567m.mo2708j();
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f29988c.m46784S4().m116554c1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_who_i_liked";
    }
}
