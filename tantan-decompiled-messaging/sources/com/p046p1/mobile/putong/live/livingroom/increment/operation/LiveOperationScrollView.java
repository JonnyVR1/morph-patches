package com.p046p1.mobile.putong.live.livingroom.increment.operation;

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
import p149l.bt0;
import p149l.fld0;
import p149l.ggv;
import p149l.s7m;
import p149l.u8t;
import p149l.w9j;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveOperationScrollView extends HorizontalScrollView implements s7m<u8t> {

    /* JADX INFO: renamed from: a */
    public final int f50813a;

    /* JADX INFO: renamed from: b */
    public u8t f50814b;

    public LiveOperationScrollView(Context context) {
        super(context);
        this.f50813a = 4;
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

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m75010a(View view) {
        m75011b(view, -1);
    }

    /* JADX INFO: renamed from: b */
    public void m75011b(View view, int i) {
        if (getVisibility() != 0 && !((ggv) ypv.m215673l(fld0.f98148c)).f102548i) {
            xdl0.m208344M(this, true);
            if (getAlpha() != 1.0f) {
                setAlpha(1.0f);
            }
        }
        if (getChildCount() <= 0 || !(getChildAt(0) instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) getChildAt(0)).addView(view, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u8t u8tVar) {
        this.f50814b = u8tVar;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Pair<Integer, View> m75013d(@NotNull String str) {
        ViewGroup childRoot = getChildRoot();
        if (!NullChecker.m81303a(childRoot)) {
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

    @Override // p149l.s7m
    public void destroy() {
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Pair<Boolean, xdl0.C21104g> m75014e(String str) {
        ViewGroup childRoot = getChildRoot();
        if (!NullChecker.m81303a(childRoot) || childRoot.getChildCount() <= 0) {
            return Pair.create(Boolean.FALSE, xdl0.m208380i0(childRoot));
        }
        if (childRoot.getChildCount() >= 4) {
            Pair<Integer, View> pairM75013d = m75013d(str);
            return (!NullChecker.m81303a(pairM75013d) || ((Integer) pairM75013d.first).intValue() >= 4) ? Pair.create(Boolean.FALSE, xdl0.m208380i0(childRoot.getChildAt(3))) : Pair.create(Boolean.TRUE, xdl0.m208380i0((View) pairM75013d.second));
        }
        if (TextUtils.isEmpty(str)) {
            xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(childRoot.getChildAt(childRoot.getChildCount() - 1));
            c21104gM208380i0.f192418a += c21104gM208380i0.f192420c;
            return Pair.create(Boolean.FALSE, c21104gM208380i0);
        }
        Pair<Integer, View> pairM75013d2 = m75013d(str);
        if (NullChecker.m81303a(pairM75013d2)) {
            return Pair.create(Boolean.TRUE, xdl0.m208380i0((View) pairM75013d2.second));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m75015f() {
        ViewGroup childRoot = getChildRoot();
        if (NullChecker.m81303a(childRoot)) {
            childRoot.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m75016i(w9j<String, Boolean> w9jVar) {
        ViewGroup childRoot = getChildRoot();
        if (NullChecker.m81303a(childRoot)) {
            int childCount = childRoot.getChildCount();
            ArrayList<OperationItemView> arrayList = new ArrayList();
            for (int i = 0; i < childCount; i++) {
                if (childRoot.getChildAt(i) instanceof OperationItemView) {
                    OperationItemView operationItemView = (OperationItemView) childRoot.getChildAt(i);
                    if (w9jVar.call((String) operationItemView.getTag()).booleanValue()) {
                        arrayList.add(operationItemView);
                    }
                }
            }
            for (OperationItemView operationItemView2 : arrayList) {
                operationItemView2.m75055p();
                childRoot.removeView(operationItemView2);
            }
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m75017j(boolean z) {
        xdl0.m208345M0(this, z);
        if (z) {
            bt0.m103743p(this, "alpha", 0L, 100L, new LinearInterpolator(), 0.0f, 1.0f).start();
        } else {
            bt0.m103743p(this, "alpha", 0L, 100L, new LinearInterpolator(), 1.0f, 0.0f).start();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f50814b.m192253u4(new Point((int) motionEvent.getX(), (int) motionEvent.getY()));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public LiveOperationScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50813a = 4;
        init();
    }
}
