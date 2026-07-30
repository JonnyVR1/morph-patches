package com.p000p1.mobile.putong.core.p001ui.likedusers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import l.x4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikedUsersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LikedUserFrag f97c;

    public boolean disableAutoPV() {
        return CoreModule.P().a().Vf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.n);
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        LikedUserFrag likedUserFragI0 = supportFragmentManager.i0("liked_users_frag_root");
        if (likedUserFragI0 instanceof LikedUserFrag) {
            this.f97c = likedUserFragI0;
            return frameLayout;
        }
        this.f97c = new LikedUserFrag();
        k kVarM = supportFragmentManager.m();
        kVarM.c(x4c0.n, this.f97c, "liked_users_frag_root");
        kVarM.j();
        return frameLayout;
    }

    public boolean isAnonymousMode() {
        return false;
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f97c.m456S4().m9886c1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public String pageId() {
        return "p_who_i_liked";
    }
}
