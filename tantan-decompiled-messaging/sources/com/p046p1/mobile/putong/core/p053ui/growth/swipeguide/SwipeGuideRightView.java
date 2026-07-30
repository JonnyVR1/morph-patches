package com.p046p1.mobile.putong.core.p053ui.growth.swipeguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideRightView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.eqh0;
import p149l.hvc0;
import p149l.i0g0;
import p149l.sah0;
import p149l.vwb;
import p149l.w0c0;

/* JADX INFO: loaded from: classes10.dex */
public class SwipeGuideRightView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f29547d;

    /* JADX INFO: renamed from: e */
    public VText f29548e;

    /* JADX INFO: renamed from: f */
    public VText f29549f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8365b f29550g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView$a */
    public class ViewOnTouchListenerC8364a implements View.OnTouchListener {
        public ViewOnTouchListenerC8364a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !NullChecker.m81303a(SwipeGuideRightView.this.f29550g)) {
                return false;
            }
            SwipeGuideRightView.this.f29550g.mo45994a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView$b */
    public interface InterfaceC8365b {
        /* JADX INFO: renamed from: a */
        void mo45994a();
    }

    public SwipeGuideRightView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m45990h0(View view) {
    }

    private void init() {
        setOnTouchListener(new ViewOnTouchListenerC8364a());
        setOnClickListener(new View.OnClickListener() { // from class: l.rah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeGuideRightView.m45990h0(view);
            }
        });
        m45993k0(false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m45992j0(View view) {
        sah0.m183059a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m45993k0(boolean z) {
        if (z) {
            this.f29548e.setText("加速配对已开启");
            this.f29549f.setText(i0g0.m133861b0("30分钟内无限右滑，多滑卡效果更好！", vwb.m200299M("无限右滑"), hvc0.m133154a(w0c0.f183773I), eqh0.m117752c(2)));
            return;
        }
        this.f29549f.setText(getContext().getResources().getString(R$string.f19128zj));
        String string = getContext().getResources().getString(R$string.f18348a1);
        String string2 = getContext().getResources().getString(R$string.f18317Z0);
        this.f29548e.setText(i0g0.m133861b0(string + string2, vwb.m200299M(string2), getResources().getColor(w0c0.f183773I), eqh0.m117752c(2)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45992j0(this);
        init();
    }

    public void setViewTouchListener(InterfaceC8365b interfaceC8365b) {
        this.f29550g = interfaceC8365b;
    }

    public SwipeGuideRightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideRightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
