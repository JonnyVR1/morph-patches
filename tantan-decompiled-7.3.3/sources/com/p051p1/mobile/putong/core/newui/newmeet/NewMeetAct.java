package com.p051p1.mobile.putong.core.newui.newmeet;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.cey;
import p153l.cs30;
import p153l.hkl0;
import p153l.joa;
import p153l.jyb;
import p153l.yr30;

/* JADX INFO: loaded from: classes11.dex */
public class NewMeetAct extends PutongMvpAct<yr30, cs30> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public yr30 mo29671X1() {
        return new yr30(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public cs30 mo29672Y1() {
        return new cs30(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((cs30) this.f17892d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(joa.m146361M3())));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (((yr30) this.f17891c).m217154h0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        hkl0.m135638a(this.act.getWindow().getDecorView(), true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24 && cey.m109473f().m109481j() && cey.m109473f().getIsVideoPlaying()) {
            cey.m109473f().m109484p(false);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        hkl0.m135638a(this.act.getWindow().getDecorView(), false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_meet";
    }
}
