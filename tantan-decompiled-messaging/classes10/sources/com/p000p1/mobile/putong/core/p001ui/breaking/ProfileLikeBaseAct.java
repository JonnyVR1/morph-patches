package com.p000p1.mobile.putong.core.p001ui.breaking;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import l.bt0;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.lsi0;
import l.mep0;
import l.mkd0;
import l.par;
import p003l.szb0;
import p003l.x7c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public abstract class ProfileLikeBaseAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public c4g0 f1019c;

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ boolean m1720a2(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 || keyEvent.getKeyCode() == 66;
    }

    /* JADX INFO: renamed from: b2 */
    private void m1721b2() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        mo1728k2().setLayoutTransition(layoutTransition);
    }

    /* JADX INFO: renamed from: c2 */
    private void m1722c2() {
        mo1729l2().setFilters(new InputFilter[]{new par(100, new d30() { // from class: l.ps90
            public final void call() {
                lsi0.y(String.format("最多输入%s个字", 100));
            }
        }, false)});
        mo1729l2().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.qs90
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ProfileLikeBaseAct.m1720a2(textView, i, keyEvent);
            }
        });
        this.f1019c = ((Act) this).act.duringCreated(mep0.f1(mo1730m2())).subscribe(mkd0.G(new e30() { // from class: l.rs90
            public final void call(Object obj) {
                this.f7239a.m1724e2((Integer) obj);
            }
        }));
        mo1729l2().post(new Runnable() { // from class: l.ss90
            @Override // java.lang.Runnable
            public final void run() {
                this.f7456a.m1725g2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m1723d2(Bundle bundle) {
        m1721b2();
        m1722c2();
        setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m1724e2(Integer num) {
        if (num.intValue() > 0) {
            bt0.n(mo1728k2(), View.TRANSLATION_Y, new float[]{-num.intValue()}).setDuration(200L).start();
        } else {
            bt0.n(mo1728k2(), View.TRANSLATION_Y, new float[]{0.0f}).setDuration(200L).start();
        }
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(0, szb0.f7493d);
        mkd0.z(this.f1019c);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m1725g2() {
        mo1729l2().requestFocus();
        showInput(mo1729l2(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h2 */
    public void m1726h2() {
        hideInput();
        e51.H(this, new Runnable() { // from class: l.ts90
            @Override // java.lang.Runnable
            public final void run() {
                this.f7619a.finish();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: i2 */
    public abstract View mo1727i2();

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.os90
            public final void call(Object obj) {
                this.f6747a.m1723d2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public abstract ViewGroup mo1728k2();

    /* JADX INFO: renamed from: l2 */
    public abstract EditText mo1729l2();

    /* JADX INFO: renamed from: m2 */
    public abstract ViewGroup mo1730m2();

    /* JADX WARN: Multi-variable type inference failed */
    public void onStartLifecycle() {
        super/*com.p1.mobile.android.app.Act*/.onStartLifecycle();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, szb0.f7498i);
        animationLoadAnimation.setFillAfter(true);
        mo1727i2().startAnimation(animationLoadAnimation);
    }

    public void setTheme() {
        setTheme(x7c0.f8381h);
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
