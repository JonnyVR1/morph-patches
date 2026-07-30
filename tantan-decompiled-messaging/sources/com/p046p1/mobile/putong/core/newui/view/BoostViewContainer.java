package com.p046p1.mobile.putong.core.newui.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.sunshine.engine.particle.SceneView;
import p149l.C17722ja;
import p149l.baj;
import p149l.d30;
import p149l.da3;
import p149l.e30;
import p149l.f93;
import p149l.h9c0;
import p149l.ig3;
import p149l.lac0;
import p149l.v9j;
import p149l.x53;
import p149l.xdl0;
import p149l.y93;

/* JADX INFO: loaded from: classes11.dex */
public class BoostViewContainer extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public da3 f26885a;

    /* JADX INFO: renamed from: b */
    public x53 f26886b;

    public BoostViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h9c0.f106544a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(h9c0.f106545b, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106546c, true);
        typedArrayObtainStyledAttributes.recycle();
        Activity activityM208326D = xdl0.m208326D(context);
        if (!(activityM208326D instanceof Act)) {
            ig3.m135964a("异常的上下文类型，BoostView仅支持在Act及其子类中使用！");
            throw null;
        }
        Act act = (Act) activityM208326D;
        this.f26885a = new da3(act, this, i2, z);
        if (lac0.m149136m() && m43692c(i2)) {
            this.f26886b = new C17722ja(act, this.f26885a);
        } else {
            this.f26886b = new f93(act, this.f26885a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m43690a(y93 y93Var) {
        this.f26886b.m207071c(y93Var);
    }

    /* JADX INFO: renamed from: b */
    public void m43691b(e30<View> e30Var, baj<Drawable, CharSequence, Integer, Integer, Integer, Boolean, View> bajVar) {
        this.f26885a.m110549d(e30Var, bajVar);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m43692c(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: d */
    public void m43693d(FrameLayout frameLayout) {
        this.f26886b.mo120068m(frameLayout, getBoostButton());
    }

    /* JADX INFO: renamed from: e */
    public void m43694e(Act act, d30 d30Var, v9j<Boolean> v9jVar) {
        this.f26886b.mo120069n(act, d30Var, v9jVar);
    }

    /* JADX INFO: renamed from: f */
    public void m43695f() {
        this.f26886b.mo120070o(this);
    }

    /* JADX INFO: renamed from: g */
    public void m43696g(boolean z) {
        this.f26886b.mo120071p(z);
    }

    public View getBoostButton() {
        return this.f26885a.m110547b();
    }

    public View getBoostHeartScene() {
        return this.f26885a.m110548c();
    }

    public void setFromCallback(v9j<String> v9jVar) {
        this.f26886b.mo120067k(v9jVar);
    }

    public void setIconWidth(int i) {
        this.f26885a.m110551f(this, i);
    }

    public void setImageResource(@DrawableRes int i) {
        this.f26885a.m110552g(i);
    }

    public void setInterceptFunc(v9j<Boolean> v9jVar) {
        this.f26886b.m207076l(v9jVar);
    }

    public void setSceneView(SceneView sceneView) {
        this.f26885a.m110553h(sceneView);
    }

    public BoostViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoostViewContainer(Context context) {
        this(context, null);
    }
}
