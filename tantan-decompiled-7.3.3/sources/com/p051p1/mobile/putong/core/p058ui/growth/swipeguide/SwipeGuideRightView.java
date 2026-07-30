package com.p051p1.mobile.putong.core.p058ui.growth.swipeguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideRightView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.ajh0;
import p153l.c9c0;
import p153l.jyb;
import p153l.k3d0;
import p153l.lyh0;
import p153l.q8g0;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeGuideRightView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f30395d;

    /* JADX INFO: renamed from: e */
    public VText f30396e;

    /* JADX INFO: renamed from: f */
    public VText f30397f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8528b f30398g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView$a */
    public class ViewOnTouchListenerC8527a implements View.OnTouchListener {
        public ViewOnTouchListenerC8527a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !NullChecker.m82486a(SwipeGuideRightView.this.f30398g)) {
                return false;
            }
            SwipeGuideRightView.this.f30398g.mo47177a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView$b */
    public interface InterfaceC8528b {
        /* JADX INFO: renamed from: a */
        void mo47177a();
    }

    public SwipeGuideRightView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m47173h0(View view) {
    }

    private void init() {
        setOnTouchListener(new ViewOnTouchListenerC8527a());
        setOnClickListener(new View.OnClickListener() { // from class: l.zih0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeGuideRightView.m47173h0(view);
            }
        });
        m47176k0(false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m47175j0(View view) {
        ajh0.m98381a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m47176k0(boolean z) {
        if (z) {
            this.f30396e.setText("加速配对已开启");
            this.f30397f.setText(q8g0.m175796b0("30分钟内无限右滑，多滑卡效果更好！", jyb.m147482M("无限右滑"), k3d0.m148005a(c9c0.f80342I), lyh0.m156283c(2)));
            return;
        }
        this.f30397f.setText(getContext().getResources().getString(R$string.f18946Vj));
        String string = getContext().getResources().getString(R$string.f19078a1);
        String string2 = getContext().getResources().getString(R$string.f19047Z0);
        this.f30396e.setText(q8g0.m175796b0(string + string2, jyb.m147482M(string2), getResources().getColor(c9c0.f80342I), lyh0.m156283c(2)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47175j0(this);
        init();
    }

    public void setViewTouchListener(InterfaceC8528b interfaceC8528b) {
        this.f30398g = interfaceC8528b;
    }

    public SwipeGuideRightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideRightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
