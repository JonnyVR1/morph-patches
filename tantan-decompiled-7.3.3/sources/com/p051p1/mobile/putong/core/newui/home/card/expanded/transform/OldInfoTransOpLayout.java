package com.p051p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class OldInfoTransOpLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f23201a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8104a f23202b;

    /* JADX INFO: renamed from: c */
    public int f23203c;

    /* JADX INFO: renamed from: d */
    public boolean f23204d;

    /* JADX INFO: renamed from: e */
    public int f23205e;

    /* JADX INFO: renamed from: f */
    public boolean f23206f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout$a */
    public interface InterfaceC8104a {
        /* JADX INFO: renamed from: a */
        void mo39185a();

        /* JADX INFO: renamed from: b */
        void mo39186b(int i);
    }

    public OldInfoTransOpLayout(Context context) {
        super(context);
        this.f23201a = false;
        this.f23204d = false;
        this.f23206f = true;
        m39183a();
    }

    /* JADX INFO: renamed from: a */
    public final void m39183a() {
        this.f23203c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: b */
    public final void m39184b(MotionEvent motionEvent) {
        InterfaceC8104a interfaceC8104a;
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23204d = false;
            this.f23205e = y;
            return;
        }
        if (action != 1) {
            if (action == 2) {
                int i = this.f23205e;
                if (i - y > this.f23203c && !this.f23204d) {
                    this.f23204d = true;
                    this.f23205e = y;
                    return;
                } else {
                    if (this.f23204d) {
                        int iMax = Math.max(0, i - y);
                        InterfaceC8104a interfaceC8104a2 = this.f23202b;
                        if (interfaceC8104a2 != null) {
                            interfaceC8104a2.mo39186b(iMax);
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
        if (!this.f23204d || (interfaceC8104a = this.f23202b) == null) {
            return;
        }
        this.f23201a = true;
        interfaceC8104a.mo39185a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23206f) {
            return true;
        }
        if (this.f23201a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        m39184b(motionEvent);
        return true;
    }

    public void setInterceptMove(boolean z) {
        this.f23206f = false;
    }

    public void setTransListener(InterfaceC8104a interfaceC8104a) {
        this.f23202b = interfaceC8104a;
    }

    public OldInfoTransOpLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23201a = false;
        this.f23204d = false;
        this.f23206f = true;
        m39183a();
    }

    public OldInfoTransOpLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23201a = false;
        this.f23204d = false;
        this.f23206f = true;
        m39183a();
    }
}
