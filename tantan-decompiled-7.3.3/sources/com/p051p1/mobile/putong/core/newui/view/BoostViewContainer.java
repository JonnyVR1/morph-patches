package com.p051p1.mobile.putong.core.newui.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.sunshine.engine.particle.SceneView;
import p153l.C16738ea;
import p153l.bnl0;
import p153l.n63;
import p153l.na3;
import p153l.nhc0;
import p153l.pcj;
import p153l.ric0;
import p153l.sa3;
import p153l.u93;
import p153l.vcj;
import p153l.wg3;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class BoostViewContainer extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public sa3 f27733a;

    /* JADX INFO: renamed from: b */
    public n63 f27734b;

    public BoostViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nhc0.f141961a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(nhc0.f141962b, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(nhc0.f141963c, true);
        typedArrayObtainStyledAttributes.recycle();
        Activity activityM105506D = bnl0.m105506D(context);
        if (!(activityM105506D instanceof Act)) {
            wg3.m206174a("异常的上下文类型，BoostView仅支持在Act及其子类中使用！");
            throw null;
        }
        Act act = (Act) activityM105506D;
        this.f27733a = new sa3(act, this, i2, z);
        if (ric0.m181583m() && m44878c(i2)) {
            this.f27734b = new C16738ea(act, this.f27733a);
        } else {
            this.f27734b = new u93(act, this.f27733a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m44876a(na3 na3Var) {
        this.f27734b.m161752c(na3Var);
    }

    /* JADX INFO: renamed from: b */
    public void m44877b(y20<View> y20Var, vcj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> vcjVar) {
        this.f27733a.m185256d(y20Var, vcjVar);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44878c(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: d */
    public void m44879d(FrameLayout frameLayout) {
        this.f27734b.mo119981m(frameLayout, getBoostButton());
    }

    /* JADX INFO: renamed from: e */
    public void m44880e(Act act, x20 x20Var, pcj<Boolean> pcjVar) {
        this.f27734b.mo119982n(act, x20Var, pcjVar);
    }

    /* JADX INFO: renamed from: f */
    public void m44881f() {
        this.f27734b.mo119983o(this);
    }

    /* JADX INFO: renamed from: g */
    public void m44882g(boolean z) {
        this.f27734b.mo119984p(z);
    }

    public View getBoostButton() {
        return this.f27733a.m185254b();
    }

    public View getBoostHeartScene() {
        return this.f27733a.m185255c();
    }

    public void setFromCallback(pcj<String> pcjVar) {
        this.f27734b.mo119980k(pcjVar);
    }

    public void setIconWidth(int i) {
        this.f27733a.m185258f(this, i);
    }

    public void setImageResource(@DrawableRes int i) {
        this.f27733a.m185259g(i);
    }

    public void setInterceptFunc(pcj<Boolean> pcjVar) {
        this.f27734b.m161757l(pcjVar);
    }

    public void setSceneView(SceneView sceneView) {
        this.f27733a.m185260h(sceneView);
    }

    public BoostViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoostViewContainer(Context context) {
        this(context, null);
    }
}
