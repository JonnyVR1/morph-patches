package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.p1.mobile.android.app.Act;
import com.sunshine.engine.particle.SceneView;
import l.baj;
import l.d30;
import l.e30;
import l.h9c0;
import l.ig3;
import l.lac0;
import l.v9j;
import l.xdl0;
import p009l.C0971ja;
import p009l.da3;
import p009l.f93;
import p009l.x53;
import p009l.y93;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BoostViewContainer extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public da3 f5663a;

    /* JADX INFO: renamed from: b */
    public x53 f5664b;

    public BoostViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h9c0.a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(h9c0.b, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(h9c0.c, true);
        typedArrayObtainStyledAttributes.recycle();
        Act actD = xdl0.D(context);
        if (!(actD instanceof Act)) {
            ig3.a("异常的上下文类型，BoostView仅支持在Act及其子类中使用！");
            throw null;
        }
        Act act = actD;
        this.f5663a = new da3(act, this, i2, z);
        if (lac0.m() && m7956c(i2)) {
            this.f5664b = new C0971ja(act, this.f5663a);
        } else {
            this.f5664b = new f93(act, this.f5663a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7954a(y93 y93Var) {
        this.f5664b.m24722c(y93Var);
    }

    /* JADX INFO: renamed from: b */
    public void m7955b(e30<View> e30Var, baj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> bajVar) {
        this.f5663a.m13025d(e30Var, bajVar);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7956c(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: d */
    public void m7957d(FrameLayout frameLayout) {
        this.f5664b.mo14326m(frameLayout, getBoostButton());
    }

    /* JADX INFO: renamed from: e */
    public void m7958e(Act act, d30 d30Var, v9j<Boolean> v9jVar) {
        this.f5664b.mo14327n(act, d30Var, v9jVar);
    }

    /* JADX INFO: renamed from: f */
    public void m7959f() {
        this.f5664b.mo14328o(this);
    }

    /* JADX INFO: renamed from: g */
    public void m7960g(boolean z) {
        this.f5664b.mo14329p(z);
    }

    public View getBoostButton() {
        return this.f5663a.m13023b();
    }

    public View getBoostHeartScene() {
        return this.f5663a.m13024c();
    }

    public void setFromCallback(v9j<String> v9jVar) {
        this.f5664b.mo14325k(v9jVar);
    }

    public void setIconWidth(int i) {
        this.f5663a.m13027f(this, i);
    }

    public void setImageResource(@DrawableRes int i) {
        this.f5663a.m13028g(i);
    }

    public void setInterceptFunc(v9j<Boolean> v9jVar) {
        this.f5664b.m24727l(v9jVar);
    }

    public void setSceneView(SceneView sceneView) {
        this.f5663a.m13029h(sceneView);
    }

    public BoostViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoostViewContainer(Context context) {
        this(context, null);
    }
}
