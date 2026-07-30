package com.p000p1.mobile.putong.core.p001ui.messages.recycler;

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
import l.tg50;
import l.ud50;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageRecyclerDispatchLinear extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f18a;

    /* JADX INFO: renamed from: b */
    public final List<ud50> f19b;

    /* JADX INFO: renamed from: c */
    public tg50 f20c;

    public MessageRecyclerDispatchLinear(Context context) {
        super(context);
        this.f19b = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = false;
        try {
            if (!vwb.J(this.f19b)) {
                Iterator<ud50> it = this.f19b.iterator();
                while (it.hasNext()) {
                    if (it.next().dispatchTouchEvent(motionEvent)) {
                        zDispatchTouchEvent = true;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.c(new IllegalArgumentException("VRelative exception" + e.getMessage(), e));
        }
        if (!zDispatchTouchEvent) {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        }
        if (NullChecker.a(this.f20c)) {
            this.f20c.a(zDispatchTouchEvent);
        }
        return zDispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f18a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public void setOnDispatchTouchEventListener(ud50 ud50Var) {
        if (NullChecker.a(ud50Var)) {
            this.f19b.add(ud50Var);
        }
    }

    public void setOnTouchEventHandleListener(tg50 tg50Var) {
        this.f20c = tg50Var;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f18a = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public MessageRecyclerDispatchLinear(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19b = new ArrayList();
    }

    public MessageRecyclerDispatchLinear(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19b = new ArrayList();
    }
}
