package com.p000p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class OldInfoTransOpLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1237a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0117a f1238b;

    /* JADX INFO: renamed from: c */
    public int f1239c;

    /* JADX INFO: renamed from: d */
    public boolean f1240d;

    /* JADX INFO: renamed from: e */
    public int f1241e;

    /* JADX INFO: renamed from: f */
    public boolean f1242f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout$a */
    public interface InterfaceC0117a {
        /* JADX INFO: renamed from: a */
        void mo2158a();

        /* JADX INFO: renamed from: b */
        void mo2159b(int i);
    }

    public OldInfoTransOpLayout(Context context) {
        super(context);
        this.f1237a = false;
        this.f1240d = false;
        this.f1242f = true;
        m2156a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2156a() {
        this.f1239c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: b */
    public final void m2157b(MotionEvent motionEvent) {
        InterfaceC0117a interfaceC0117a;
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1240d = false;
            this.f1241e = y;
            return;
        }
        if (action != 1) {
            if (action == 2) {
                int i = this.f1241e;
                if (i - y > this.f1239c && !this.f1240d) {
                    this.f1240d = true;
                    this.f1241e = y;
                    return;
                } else {
                    if (this.f1240d) {
                        int iMax = Math.max(0, i - y);
                        InterfaceC0117a interfaceC0117a2 = this.f1238b;
                        if (interfaceC0117a2 != null) {
                            interfaceC0117a2.mo2159b(iMax);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (action != 3) {
                return;
            }
        }
        if (!this.f1240d || (interfaceC0117a = this.f1238b) == null) {
            return;
        }
        this.f1237a = true;
        interfaceC0117a.mo2158a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f1242f) {
            return true;
        }
        if (this.f1237a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        m2157b(motionEvent);
        return true;
    }

    public void setInterceptMove(boolean z) {
        this.f1242f = false;
    }

    public void setTransListener(InterfaceC0117a interfaceC0117a) {
        this.f1238b = interfaceC0117a;
    }

    public OldInfoTransOpLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1237a = false;
        this.f1240d = false;
        this.f1242f = true;
        m2156a();
    }

    public OldInfoTransOpLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1237a = false;
        this.f1240d = false;
        this.f1242f = true;
        m2156a();
    }
}
