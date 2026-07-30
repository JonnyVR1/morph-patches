package com.p000p1.mobile.putong.core.p001ui.growth.swipeguide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.growth.swipeguide.SwipeGuideLeftView;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.upa;
import l.xdl0;
import p003l.qah0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SwipeGuideLeftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f1937d;

    /* JADX INFO: renamed from: e */
    public VText f1938e;

    /* JADX INFO: renamed from: f */
    public VText f1939f;

    /* JADX INFO: renamed from: g */
    public InterfaceC3138a f1940g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideLeftView$a */
    public interface InterfaceC3138a {
        /* JADX INFO: renamed from: a */
        void mo3344a();
    }

    public SwipeGuideLeftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m3340h0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3342j0(View view) {
        qah0.m8950a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ boolean m3343k0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !NullChecker.a(this.f1940g)) {
            return false;
        }
        this.f1940g.mo3344a();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3342j0(this);
        if (upa.N3()) {
            xdl0.U(this.f1939f, t100.d(98.0f));
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: l.oah0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f6637a.m3343k0(view, motionEvent);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.pah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeGuideLeftView.m3340h0(view);
            }
        });
        this.f1937d.setText(getContext().getResources().getString(R.string.jq));
    }

    public void setViewTouchListener(InterfaceC3138a interfaceC3138a) {
        this.f1940g = interfaceC3138a;
    }

    public SwipeGuideLeftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideLeftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
