package com.p046p1.mobile.putong.core.p053ui.messages.recycler;

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
import p149l.tg50;
import p149l.ud50;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class MessageRecyclerDispatchLinear extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f32196a;

    /* JADX INFO: renamed from: b */
    public final List<ud50> f32197b;

    /* JADX INFO: renamed from: c */
    public tg50 f32198c;

    public MessageRecyclerDispatchLinear(Context context) {
        super(context);
        this.f32197b = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = false;
        try {
            if (!vwb.m200296J(this.f32197b)) {
                Iterator<ud50> it = this.f32197b.iterator();
                while (it.hasNext()) {
                    if (it.next().dispatchTouchEvent(motionEvent)) {
                        zDispatchTouchEvent = true;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.m81296c(new IllegalArgumentException("VRelative exception" + e.getMessage(), e));
        }
        if (!zDispatchTouchEvent) {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        }
        if (NullChecker.m81303a(this.f32198c)) {
            this.f32198c.mo110205a(zDispatchTouchEvent);
        }
        return zDispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32196a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f32196a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public void setOnDispatchTouchEventListener(ud50 ud50Var) {
        if (NullChecker.m81303a(ud50Var)) {
            this.f32197b.add(ud50Var);
        }
    }

    public void setOnTouchEventHandleListener(tg50 tg50Var) {
        this.f32198c = tg50Var;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f32196a = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public MessageRecyclerDispatchLinear(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32197b = new ArrayList();
    }

    public MessageRecyclerDispatchLinear(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32197b = new ArrayList();
    }
}
