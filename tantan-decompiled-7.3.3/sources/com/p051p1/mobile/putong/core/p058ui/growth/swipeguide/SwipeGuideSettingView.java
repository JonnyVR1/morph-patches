package com.p051p1.mobile.putong.core.p058ui.growth.swipeguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.djh0;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeGuideSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f30400d;

    /* JADX INFO: renamed from: e */
    public VImage f30401e;

    /* JADX INFO: renamed from: f */
    public VText f30402f;

    /* JADX INFO: renamed from: g */
    public View f30403g;

    /* JADX INFO: renamed from: h */
    public View f30404h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideSettingView$a */
    public interface InterfaceC8529a {
    }

    public SwipeGuideSettingView(Context context) {
        super(context);
    }

    private void init() {
        bnl0.m105509E0(this.f30403g, new View.OnClickListener() { // from class: l.bjh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76989a.m47180k0(view);
            }
        });
        bnl0.m105509E0(this.f30404h, new View.OnClickListener() { // from class: l.cjh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82162a.m47181l0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m47180k0(View view) {
        if (NullChecker.m82486a(null)) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m47181l0(View view) {
        if (NullChecker.m82486a(null)) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m47182j0(View view) {
        djh0.m116094a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47182j0(this);
        init();
    }

    public void setStepListener(InterfaceC8529a interfaceC8529a) {
    }

    public SwipeGuideSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeGuideSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
