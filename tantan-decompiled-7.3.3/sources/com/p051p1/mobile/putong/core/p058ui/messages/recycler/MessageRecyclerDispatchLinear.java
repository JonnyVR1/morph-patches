package com.p051p1.mobile.putong.core.p058ui.messages.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.bm50;
import p153l.jyb;
import p153l.zo50;

/* JADX INFO: loaded from: classes4.dex */
public class MessageRecyclerDispatchLinear extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f33044a;

    /* JADX INFO: renamed from: b */
    public final List<bm50> f33045b;

    /* JADX INFO: renamed from: c */
    public zo50 f33046c;

    public MessageRecyclerDispatchLinear(Context context) {
        super(context);
        this.f33045b = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = false;
        try {
            if (!jyb.m147479J(this.f33045b)) {
                Iterator<bm50> it = this.f33045b.iterator();
                while (it.hasNext()) {
                    if (it.next().dispatchTouchEvent(motionEvent)) {
                        zDispatchTouchEvent = true;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.m82479c(new IllegalArgumentException("VRelative exception" + e.getMessage(), e));
        }
        if (!zDispatchTouchEvent) {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        }
        if (NullChecker.m82486a(this.f33046c)) {
            this.f33046c.mo97574a(zDispatchTouchEvent);
        }
        return zDispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f33044a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f33044a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public void setOnDispatchTouchEventListener(bm50 bm50Var) {
        if (NullChecker.m82486a(bm50Var)) {
            this.f33045b.add(bm50Var);
        }
    }

    public void setOnTouchEventHandleListener(zo50 zo50Var) {
        this.f33046c = zo50Var;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f33044a = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public MessageRecyclerDispatchLinear(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33045b = new ArrayList();
    }

    public MessageRecyclerDispatchLinear(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33045b = new ArrayList();
    }
}
