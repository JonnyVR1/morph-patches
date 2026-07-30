package com.p051p1.mobile.putong.core.p058ui.breaking;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeBaseAct;
import p153l.cgc0;
import p153l.gt0;
import p153l.kcg0;
import p153l.l51;
import p153l.psd0;
import p153l.qnp0;
import p153l.rcr;
import p153l.x20;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ProfileLikeBaseAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public kcg0 f29473c;

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ boolean m45604b2(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 || keyEvent.getKeyCode() == 66;
    }

    /* JADX INFO: renamed from: c2 */
    private void m45605c2() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        mo45612l2().setLayoutTransition(layoutTransition);
    }

    /* JADX INFO: renamed from: d2 */
    private void m45606d2() {
        mo45613m2().setFilters(new InputFilter[]{new rcr(100, new x20() { // from class: l.t0a0
            @Override // p153l.x20
            public final void call() {
                o1j0.m165651y(String.format("最多输入%s个字", 100));
            }
        }, false)});
        mo45613m2().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.u0a0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ProfileLikeBaseAct.m45604b2(textView, i, keyEvent);
            }
        });
        this.f29473c = this.act.duringCreated(qnp0.m177263f1(mo45614n2())).subscribe(psd0.m173596G(new y20() { // from class: l.v0a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181845a.m45608g2((Integer) obj);
            }
        }));
        mo45613m2().post(new Runnable() { // from class: l.w0a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186553a.m45609h2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m45607e2(Bundle bundle) {
        m45605c2();
        m45606d2();
        setSwipeBackEnable(false);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        overridePendingTransition(0, y7c0.f197766d);
        psd0.m173633z(this.f29473c);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m45608g2(Integer num) {
        if (num.intValue() > 0) {
            gt0.m132168n(mo45612l2(), View.TRANSLATION_Y, -num.intValue()).setDuration(200L).start();
        } else {
            gt0.m132168n(mo45612l2(), View.TRANSLATION_Y, 0.0f).setDuration(200L).start();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m45609h2() {
        mo45613m2().requestFocus();
        showInput(mo45613m2(), 0);
    }

    /* JADX INFO: renamed from: i2 */
    public void m45610i2() {
        hideInput();
        l51.m152888H(this, new Runnable() { // from class: l.x0a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191877a.m68056e2();
            }
        }, 150L);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.s0a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165673a.m45607e2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public abstract View mo45611k2();

    /* JADX INFO: renamed from: l2 */
    public abstract ViewGroup mo45612l2();

    /* JADX INFO: renamed from: m2 */
    public abstract EditText mo45613m2();

    /* JADX INFO: renamed from: n2 */
    public abstract ViewGroup mo45614n2();

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, y7c0.f197771i);
        animationLoadAnimation.setFillAfter(true);
        mo45611k2().startAnimation(animationLoadAnimation);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        setTheme(cgc0.f81652h);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
