package com.p000p1.mobile.putong.core.p001ui.growth.swipeguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import p003l.vah0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SwipeGuideSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f1946d;

    /* JADX INFO: renamed from: e */
    public VImage f1947e;

    /* JADX INFO: renamed from: f */
    public VText f1948f;

    /* JADX INFO: renamed from: g */
    public View f1949g;

    /* JADX INFO: renamed from: h */
    public View f1950h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideSettingView$a */
    public interface InterfaceC3141a {
    }

    public SwipeGuideSettingView(Context context) {
        super(context);
    }

    private void init() {
        xdl0.E0(this.f1949g, new View.OnClickListener() { // from class: l.tah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7549a.m3352k0(view);
            }
        });
        xdl0.E0(this.f1950h, new View.OnClickListener() { // from class: l.uah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7727a.m3353l0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m3352k0(View view) {
        if (NullChecker.a((Object) null)) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m3353l0(View view) {
        if (NullChecker.a((Object) null)) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3354j0(View view) {
        vah0.m10205a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3354j0(this);
        init();
    }

    public void setStepListener(InterfaceC3141a interfaceC3141a) {
    }

    public SwipeGuideSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
