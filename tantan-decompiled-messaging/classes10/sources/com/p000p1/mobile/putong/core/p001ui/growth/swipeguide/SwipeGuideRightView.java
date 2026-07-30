package com.p000p1.mobile.putong.core.p001ui.growth.swipeguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.growth.swipeguide.SwipeGuideRightView;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.hvc0;
import l.i0g0;
import l.vwb;
import l.w0c0;
import p003l.sah0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SwipeGuideRightView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f1941d;

    /* JADX INFO: renamed from: e */
    public VText f1942e;

    /* JADX INFO: renamed from: f */
    public VText f1943f;

    /* JADX INFO: renamed from: g */
    public InterfaceC3140b f1944g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView$a */
    public class ViewOnTouchListenerC3139a implements View.OnTouchListener {
        public ViewOnTouchListenerC3139a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !NullChecker.a(SwipeGuideRightView.this.f1944g)) {
                return false;
            }
            SwipeGuideRightView.this.f1944g.mo3349a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView$b */
    public interface InterfaceC3140b {
        /* JADX INFO: renamed from: a */
        void mo3349a();
    }

    public SwipeGuideRightView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m3345h0(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOnTouchListener(new ViewOnTouchListenerC3139a());
        setOnClickListener(new View.OnClickListener() { // from class: l.rah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeGuideRightView.m3345h0(view);
            }
        });
        m3348k0(false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3347j0(View view) {
        sah0.m9273a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void m3348k0(boolean z) {
        if (z) {
            this.f1942e.setText("加速配对已开启");
            this.f1943f.setText(i0g0.b0("30分钟内无限右滑，多滑卡效果更好！", vwb.M("无限右滑"), hvc0.a(w0c0.I), eqh0.c(2)));
            return;
        }
        this.f1943f.setText(getContext().getResources().getString(R.string.zj));
        String string = getContext().getResources().getString(R.string.a1);
        String string2 = getContext().getResources().getString(R.string.Z0);
        this.f1942e.setText(i0g0.b0(string + string2, vwb.M(string2), getResources().getColor(w0c0.I), eqh0.c(2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3347j0(this);
        init();
    }

    public void setViewTouchListener(InterfaceC3140b interfaceC3140b) {
        this.f1944g = interfaceC3140b;
    }

    public SwipeGuideRightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideRightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
