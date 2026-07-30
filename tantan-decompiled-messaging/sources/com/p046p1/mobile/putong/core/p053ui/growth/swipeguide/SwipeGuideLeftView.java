package com.p046p1.mobile.putong.core.p053ui.growth.swipeguide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideLeftView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.qah0;
import p149l.t100;
import p149l.upa;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class SwipeGuideLeftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f29543d;

    /* JADX INFO: renamed from: e */
    public VText f29544e;

    /* JADX INFO: renamed from: f */
    public VText f29545f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8363a f29546g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideLeftView$a */
    public interface InterfaceC8363a {
        /* JADX INFO: renamed from: a */
        void mo45989a();
    }

    public SwipeGuideLeftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m45985h0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public final void m45987j0(View view) {
        qah0.m173734a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ boolean m45988k0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !NullChecker.m81303a(this.f29546g)) {
            return false;
        }
        this.f29546g.mo45989a();
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void onFinishInflate() {
        super.onFinishInflate();
        m45987j0(this);
        if (upa.m194675N3()) {
            xdl0.m208357U(this.f29545f, t100.m186890d(98.0f));
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: l.oah0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f142807a.m45988k0(view, motionEvent);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.pah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeGuideLeftView.m45985h0(view);
            }
        });
        this.f29543d.setText(getContext().getResources().getString(R$string.f18649jq));
    }

    public void setViewTouchListener(InterfaceC8363a interfaceC8363a) {
        this.f29546g = interfaceC8363a;
    }

    public SwipeGuideLeftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideLeftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
