package com.p046p1.mobile.putong.core.p053ui.breaking;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeBaseAct;
import p149l.bt0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.mep0;
import p149l.mkd0;
import p149l.par;
import p149l.szb0;
import p149l.x7c0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ProfileLikeBaseAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public c4g0 f28625c;

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ boolean m44421a2(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 || keyEvent.getKeyCode() == 66;
    }

    /* JADX INFO: renamed from: b2 */
    private void m44422b2() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        mo44429k2().setLayoutTransition(layoutTransition);
    }

    /* JADX INFO: renamed from: c2 */
    private void m44423c2() {
        mo44430l2().setFilters(new InputFilter[]{new par(100, new d30() { // from class: l.ps90
            @Override // p149l.d30
            public final void call() {
                lsi0.m151595y(String.format("最多输入%s个字", 100));
            }
        }, false)});
        mo44430l2().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.qs90
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ProfileLikeBaseAct.m44421a2(textView, i, keyEvent);
            }
        });
        this.f28625c = this.act.duringCreated(mep0.m154304f1(mo44431m2())).subscribe(mkd0.m154955G(new e30() { // from class: l.rs90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160826a.m44425e2((Integer) obj);
            }
        }));
        mo44430l2().post(new Runnable() { // from class: l.ss90
            @Override // java.lang.Runnable
            public final void run() {
                this.f166170a.m44426g2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m44424d2(Bundle bundle) {
        m44422b2();
        m44423c2();
        setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m44425e2(Integer num) {
        if (num.intValue() > 0) {
            bt0.m103741n(mo44429k2(), View.TRANSLATION_Y, -num.intValue()).setDuration(200L).start();
        } else {
            bt0.m103741n(mo44429k2(), View.TRANSLATION_Y, 0.0f).setDuration(200L).start();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        overridePendingTransition(0, szb0.f167029d);
        mkd0.m154992z(this.f28625c);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m44426g2() {
        mo44430l2().requestFocus();
        showInput(mo44430l2(), 0);
    }

    /* JADX INFO: renamed from: h2 */
    public void m44427h2() {
        hideInput();
        e51.m114743H(this, new Runnable() { // from class: l.ts90
            @Override // java.lang.Runnable
            public final void run() {
                this.f171918a.m66873d2();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: i2 */
    public abstract View mo44428i2();

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.os90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145378a.m44424d2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public abstract ViewGroup mo44429k2();

    /* JADX INFO: renamed from: l2 */
    public abstract EditText mo44430l2();

    /* JADX INFO: renamed from: m2 */
    public abstract ViewGroup mo44431m2();

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, szb0.f167034i);
        animationLoadAnimation.setFillAfter(true);
        mo44428i2().startAnimation(animationLoadAnimation);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        setTheme(x7c0.f191339h);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
