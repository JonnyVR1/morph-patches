package com.p046p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class OldInfoTransOpLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f22459a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7953a f22460b;

    /* JADX INFO: renamed from: c */
    public int f22461c;

    /* JADX INFO: renamed from: d */
    public boolean f22462d;

    /* JADX INFO: renamed from: e */
    public int f22463e;

    /* JADX INFO: renamed from: f */
    public boolean f22464f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout$a */
    public interface InterfaceC7953a {
        /* JADX INFO: renamed from: a */
        void mo38182a();

        /* JADX INFO: renamed from: b */
        void mo38183b(int i);
    }

    public OldInfoTransOpLayout(Context context) {
        super(context);
        this.f22459a = false;
        this.f22462d = false;
        this.f22464f = true;
        m38180a();
    }

    /* JADX INFO: renamed from: a */
    public final void m38180a() {
        this.f22461c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: b */
    public final void m38181b(MotionEvent motionEvent) {
        InterfaceC7953a interfaceC7953a;
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22462d = false;
            this.f22463e = y;
            return;
        }
        if (action != 1) {
            if (action == 2) {
                int i = this.f22463e;
                if (i - y > this.f22461c && !this.f22462d) {
                    this.f22462d = true;
                    this.f22463e = y;
                    return;
                } else {
                    if (this.f22462d) {
                        int iMax = Math.max(0, i - y);
                        InterfaceC7953a interfaceC7953a2 = this.f22460b;
                        if (interfaceC7953a2 != null) {
                            interfaceC7953a2.mo38183b(iMax);
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
        if (!this.f22462d || (interfaceC7953a = this.f22460b) == null) {
            return;
        }
        this.f22459a = true;
        interfaceC7953a.mo38182a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f22464f) {
            return true;
        }
        if (this.f22459a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        m38181b(motionEvent);
        return true;
    }

    public void setInterceptMove(boolean z) {
        this.f22464f = false;
    }

    public void setTransListener(InterfaceC7953a interfaceC7953a) {
        this.f22460b = interfaceC7953a;
    }

    public OldInfoTransOpLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22459a = false;
        this.f22462d = false;
        this.f22464f = true;
        m38180a();
    }

    public OldInfoTransOpLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22459a = false;
        this.f22462d = false;
        this.f22464f = true;
        m38180a();
    }
}
