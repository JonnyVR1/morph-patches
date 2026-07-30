package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.qib0;
import p149l.x4c0;
import p149l.xdl0;
import p149l.yee;

/* JADX INFO: loaded from: classes9.dex */
public class DynamicAvatarRoundView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ViewStub f36951a;

    /* JADX INFO: renamed from: b */
    public ViewStub f36952b;

    /* JADX INFO: renamed from: c */
    public ViewStub f36953c;

    public DynamicAvatarRoundView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56225p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m56225p(View view) {
        yee.m214345a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m56226s(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.size() == 1) {
            xdl0.m208344M(this.f36951a, true);
            xdl0.m208344M(this.f36952b, false);
            xdl0.m208344M(this.f36953c, false);
            qib0.f154691G.m102331L0((VDraweeView) findViewById(x4c0.f191010u), list.get(0));
            return;
        }
        int size = list.size();
        ViewStub viewStub = this.f36951a;
        if (size == 2) {
            xdl0.m208344M(viewStub, false);
            xdl0.m208344M(this.f36952b, true);
            xdl0.m208344M(this.f36953c, false);
            VDraweeView vDraweeView = (VDraweeView) findViewById(x4c0.f190985T);
            VDraweeView vDraweeView2 = (VDraweeView) findViewById(x4c0.f190986U);
            qib0.f154691G.m102331L0(vDraweeView, list.get(0));
            qib0.f154691G.m102331L0(vDraweeView2, list.get(1));
            return;
        }
        xdl0.m208344M(viewStub, false);
        xdl0.m208344M(this.f36952b, false);
        xdl0.m208344M(this.f36953c, true);
        VDraweeView vDraweeView3 = (VDraweeView) findViewById(x4c0.f190977L);
        VDraweeView vDraweeView4 = (VDraweeView) findViewById(x4c0.f190978M);
        VDraweeView vDraweeView5 = (VDraweeView) findViewById(x4c0.f190979N);
        qib0.f154691G.m102331L0(vDraweeView3, list.get(0));
        qib0.f154691G.m102331L0(vDraweeView4, list.get(1));
        qib0.f154691G.m102331L0(vDraweeView5, list.get(2));
    }

    public DynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
