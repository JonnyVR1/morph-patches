package com.p000p1.mobile.putong.core.newui.newmeet;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.dbl0;
import l.j760;
import l.vwb;
import l.xma;
import p009l.f5y;
import p009l.kj30;
import p009l.oj30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewMeetAct extends PutongMvpAct<kj30, oj30> {
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public kj30 m6925V1() {
        return new kj30(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public oj30 m6926X1() {
        return new oj30(this);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((oj30) ((PutongMvpAct) this).d).inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(xma.L3()))});
    }

    public void initSubscription() {
        super.initSubscription();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (((kj30) ((PutongMvpAct) this).c).m17541h0(i, i2, intent)) {
            return;
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
    }

    public void onDestroyLifecycle() {
        super/*com.p1.mobile.putong.app.PutongAct*/.onDestroyLifecycle();
        dbl0.a(((Act) this).act.getWindow().getDecorView(), true);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24 && f5y.m14274f().m14282j() && f5y.m14274f().getIsVideoPlaying()) {
            f5y.m14274f().m14285p(false);
        }
        return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, keyEvent);
    }

    public void onPauseLifecycle() {
        super/*com.p1.mobile.putong.app.PutongAct*/.onPauseLifecycle();
        dbl0.a(((Act) this).act.getWindow().getDecorView(), false);
    }

    public String pageId() {
        return "p_meet";
    }
}
