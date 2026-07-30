package com.p051p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.HorizontalScrollView;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;
import p153l.gt0;
import p153l.hiv;
import p153l.htd0;
import p153l.iam;
import p153l.qcj;
import p153l.vat;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveOperationScrollView extends HorizontalScrollView implements iam<vat> {

    /* JADX INFO: renamed from: a */
    public final int f51661a;

    /* JADX INFO: renamed from: b */
    public vat f51662b;

    public LiveOperationScrollView(Context context) {
        super(context);
        this.f51661a = 4;
        init();
    }

    @Nullable
    private ViewGroup getChildRoot() {
        if (getChildCount() <= 0 || !(getChildAt(0) instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) getChildAt(0);
    }

    private void init() {
        setHorizontalScrollBarEnabled(false);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m76193a(View view) {
        m76194b(view, -1);
    }

    /* JADX INFO: renamed from: b */
    public void m76194b(View view, int i) {
        if (getVisibility() != 0 && !((hiv) zrv.m221194l(htd0.f111521c)).f110078i) {
            bnl0.m105524M(this, true);
            if (getAlpha() != 1.0f) {
                setAlpha(1.0f);
            }
        }
        if (getChildCount() <= 0 || !(getChildAt(0) instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) getChildAt(0)).addView(view, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vat vatVar) {
        this.f51662b = vatVar;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Pair<Integer, View> m76196d(@NotNull String str) {
        ViewGroup childRoot = getChildRoot();
        if (!NullChecker.m82486a(childRoot)) {
            return null;
        }
        for (int i = 0; i < childRoot.getChildCount(); i++) {
            View childAt = childRoot.getChildAt(i);
            if (str.equals(childAt.getTag())) {
                return Pair.create(Integer.valueOf(i), childAt);
            }
        }
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Pair<Boolean, bnl0.C16067g> m76197e(String str) {
        ViewGroup childRoot = getChildRoot();
        if (!NullChecker.m82486a(childRoot) || childRoot.getChildCount() <= 0) {
            return Pair.create(Boolean.FALSE, bnl0.m105560i0(childRoot));
        }
        if (childRoot.getChildCount() >= 4) {
            Pair<Integer, View> pairM76196d = m76196d(str);
            return (!NullChecker.m82486a(pairM76196d) || ((Integer) pairM76196d.first).intValue() >= 4) ? Pair.create(Boolean.FALSE, bnl0.m105560i0(childRoot.getChildAt(3))) : Pair.create(Boolean.TRUE, bnl0.m105560i0((View) pairM76196d.second));
        }
        if (TextUtils.isEmpty(str)) {
            bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(childRoot.getChildAt(childRoot.getChildCount() - 1));
            c16067gM105560i0.f77559a += c16067gM105560i0.f77561c;
            return Pair.create(Boolean.FALSE, c16067gM105560i0);
        }
        Pair<Integer, View> pairM76196d2 = m76196d(str);
        if (NullChecker.m82486a(pairM76196d2)) {
            return Pair.create(Boolean.TRUE, bnl0.m105560i0((View) pairM76196d2.second));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m76198f() {
        ViewGroup childRoot = getChildRoot();
        if (NullChecker.m82486a(childRoot)) {
            childRoot.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m76199i(qcj<String, Boolean> qcjVar) {
        ViewGroup childRoot = getChildRoot();
        if (NullChecker.m82486a(childRoot)) {
            int childCount = childRoot.getChildCount();
            ArrayList<OperationItemView> arrayList = new ArrayList();
            for (int i = 0; i < childCount; i++) {
                if (childRoot.getChildAt(i) instanceof OperationItemView) {
                    OperationItemView operationItemView = (OperationItemView) childRoot.getChildAt(i);
                    if (qcjVar.call((String) operationItemView.getTag()).booleanValue()) {
                        arrayList.add(operationItemView);
                    }
                }
            }
            for (OperationItemView operationItemView2 : arrayList) {
                operationItemView2.m76238p();
                childRoot.removeView(operationItemView2);
            }
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m76200j(boolean z) {
        bnl0.m105525M0(this, z);
        if (z) {
            gt0.m132170p(this, "alpha", 0L, 100L, new LinearInterpolator(), 0.0f, 1.0f).start();
        } else {
            gt0.m132170p(this, "alpha", 0L, 100L, new LinearInterpolator(), 1.0f, 0.0f).start();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f51662b.m200628u4(new Point((int) motionEvent.getX(), (int) motionEvent.getY()));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public LiveOperationScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51661a = 4;
        init();
    }
}
