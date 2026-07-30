package com.p046p1.mobile.putong.core.p053ui.growth.swipeguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.vah0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class SwipeGuideSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f29552d;

    /* JADX INFO: renamed from: e */
    public VImage f29553e;

    /* JADX INFO: renamed from: f */
    public VText f29554f;

    /* JADX INFO: renamed from: g */
    public View f29555g;

    /* JADX INFO: renamed from: h */
    public View f29556h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideSettingView$a */
    public interface InterfaceC8366a {
    }

    public SwipeGuideSettingView(Context context) {
        super(context);
    }

    private void init() {
        xdl0.m208329E0(this.f29555g, new View.OnClickListener() { // from class: l.tah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169119a.m45997k0(view);
            }
        });
        xdl0.m208329E0(this.f29556h, new View.OnClickListener() { // from class: l.uah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175604a.m45998l0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m45997k0(View view) {
        if (NullChecker.m81303a(null)) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m45998l0(View view) {
        if (NullChecker.m81303a(null)) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m45999j0(View view) {
        vah0.m197630a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45999j0(this);
        init();
    }

    public void setStepListener(InterfaceC8366a interfaceC8366a) {
    }

    public SwipeGuideSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
