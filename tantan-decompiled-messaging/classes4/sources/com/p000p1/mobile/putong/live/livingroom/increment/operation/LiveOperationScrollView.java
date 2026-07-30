package com.p000p1.mobile.putong.live.livingroom.increment.operation;

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
import l.bt0;
import l.fld0;
import l.ggv;
import l.s7m;
import l.w9j;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import p002l.u8t;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveOperationScrollView extends HorizontalScrollView implements s7m<u8t> {

    /* JADX INFO: renamed from: a */
    public final int f6855a;

    /* JADX INFO: renamed from: b */
    public u8t f6856b;

    public LiveOperationScrollView(Context context) {
        super(context);
        this.f6855a = 4;
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

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8618C0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m8619a(View view) {
        m8620b(view, -1);
    }

    /* JADX INFO: renamed from: b */
    public void m8620b(View view, int i) {
        if (getVisibility() != 0 && !((ggv) ypv.l(fld0.c)).i) {
            xdl0.M(this, true);
            if (getAlpha() != 1.0f) {
                setAlpha(1.0f);
            }
        }
        if (getChildCount() <= 0 || !(getChildAt(0) instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) getChildAt(0)).addView(view, i);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m8626i1(u8t u8tVar) {
        this.f6856b = u8tVar;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Pair<Integer, View> m8622d(@NotNull String str) {
        ViewGroup childRoot = getChildRoot();
        if (!NullChecker.a(childRoot)) {
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

    public void destroy() {
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Pair<Boolean, xdl0.g> m8623e(String str) {
        ViewGroup childRoot = getChildRoot();
        if (!NullChecker.a(childRoot) || childRoot.getChildCount() <= 0) {
            return Pair.create(Boolean.FALSE, xdl0.i0(childRoot));
        }
        if (childRoot.getChildCount() >= 4) {
            Pair<Integer, View> pairM8622d = m8622d(str);
            return (!NullChecker.a(pairM8622d) || ((Integer) pairM8622d.first).intValue() >= 4) ? Pair.create(Boolean.FALSE, xdl0.i0(childRoot.getChildAt(3))) : Pair.create(Boolean.TRUE, xdl0.i0((View) pairM8622d.second));
        }
        if (TextUtils.isEmpty(str)) {
            xdl0.g gVarI0 = xdl0.i0(childRoot.getChildAt(childRoot.getChildCount() - 1));
            gVarI0.a += gVarI0.c;
            return Pair.create(Boolean.FALSE, gVarI0);
        }
        Pair<Integer, View> pairM8622d2 = m8622d(str);
        if (NullChecker.a(pairM8622d2)) {
            return Pair.create(Boolean.TRUE, xdl0.i0((View) pairM8622d2.second));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m8624f() {
        ViewGroup childRoot = getChildRoot();
        if (NullChecker.a(childRoot)) {
            childRoot.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m8625i(w9j<String, Boolean> w9jVar) {
        ViewGroup childRoot = getChildRoot();
        if (NullChecker.a(childRoot)) {
            int childCount = childRoot.getChildCount();
            ArrayList<OperationItemView> arrayList = new ArrayList();
            for (int i = 0; i < childCount; i++) {
                if (childRoot.getChildAt(i) instanceof OperationItemView) {
                    OperationItemView operationItemView = (OperationItemView) childRoot.getChildAt(i);
                    if (((Boolean) w9jVar.call((String) operationItemView.getTag())).booleanValue()) {
                        arrayList.add(operationItemView);
                    }
                }
            }
            for (OperationItemView operationItemView2 : arrayList) {
                operationItemView2.m8667p();
                childRoot.removeView(operationItemView2);
            }
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m8627j(boolean z) {
        xdl0.M0(this, z);
        if (z) {
            bt0.p(this, "alpha", 0L, 100L, new LinearInterpolator(), new float[]{0.0f, 1.0f}).start();
        } else {
            bt0.p(this, "alpha", 0L, 100L, new LinearInterpolator(), new float[]{1.0f, 0.0f}).start();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6856b.m23379u4(new Point((int) motionEvent.getX(), (int) motionEvent.getY()));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public LiveOperationScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6855a = 4;
        init();
    }
}
