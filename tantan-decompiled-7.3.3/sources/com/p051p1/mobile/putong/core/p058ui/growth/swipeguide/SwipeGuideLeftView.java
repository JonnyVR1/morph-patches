package com.p051p1.mobile.putong.core.p058ui.growth.swipeguide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideLeftView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.bnl0;
import p153l.gra;
import p153l.qa00;
import p153l.yih0;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeGuideLeftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f30391d;

    /* JADX INFO: renamed from: e */
    public VText f30392e;

    /* JADX INFO: renamed from: f */
    public VText f30393f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8526a f30394g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideLeftView$a */
    public interface InterfaceC8526a {
        /* JADX INFO: renamed from: a */
        void mo47172a();
    }

    public SwipeGuideLeftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m47168h0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public final void m47170j0(View view) {
        yih0.m216091a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ boolean m47171k0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !NullChecker.m82486a(this.f30394g)) {
            return false;
        }
        this.f30394g.mo47172a();
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void onFinishInflate() {
        super.onFinishInflate();
        m47170j0(this);
        if (gra.m131606N3()) {
            bnl0.m105537U(this.f30393f, qa00.m175859d(98.0f));
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: l.wih0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f189359a.m47171k0(view, motionEvent);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.xih0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeGuideLeftView.m47168h0(view);
            }
        });
        this.f30391d.setText(getContext().getResources().getString(R$string.f18436Eq));
    }

    public void setViewTouchListener(InterfaceC8526a interfaceC8526a) {
        this.f30394g = interfaceC8526a;
    }

    public SwipeGuideLeftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideLeftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
