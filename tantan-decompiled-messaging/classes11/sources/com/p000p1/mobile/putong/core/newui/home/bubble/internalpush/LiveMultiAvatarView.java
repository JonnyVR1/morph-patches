package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import l.bkb0;
import l.e30;
import l.qib0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveMultiAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List<String> f1008a;

    /* JADX INFO: renamed from: b */
    public List<FrameLayout> f1009b;

    public LiveMultiAvatarView(@NonNull Context context) {
        super(context);
        this.f1008a = new ArrayList();
        this.f1009b = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m1848b(FrameLayout frameLayout, int i, List<String> list) {
        xdl0.M(frameLayout, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i2 = i - 1;
        layoutParams.leftMargin = t100.q * i2;
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getChildAt(0) instanceof VDraweeView) {
            VDraweeView vDraweeView = (VDraweeView) frameLayout.getChildAt(0);
            bkb0 bkb0Var = qib0.G;
            String str = list.get(i2);
            int i3 = t100.t;
            bkb0Var.I0(vDraweeView, str, i3, i3);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout frameLayout = (FrameLayout) findViewById(u4c0.P);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(u4c0.Q);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(u4c0.R);
        FrameLayout frameLayout4 = (FrameLayout) findViewById(u4c0.S);
        FrameLayout frameLayout5 = (FrameLayout) findViewById(u4c0.T);
        FrameLayout frameLayout6 = (FrameLayout) findViewById(u4c0.U);
        this.f1009b.add(frameLayout);
        this.f1009b.add(frameLayout2);
        this.f1009b.add(frameLayout3);
        this.f1009b.add(frameLayout4);
        this.f1009b.add(frameLayout5);
        this.f1009b.add(frameLayout6);
        ((LiveAvatarNumberItemView) frameLayout6).setCanEffect(false);
    }

    public void setImageData(List<String> list) {
        if (list == null) {
            return;
        }
        this.f1008a = list;
        vwb.z(this.f1009b, new e30() { // from class: l.f5t
            public final void call(Object obj) {
                xdl0.M((FrameLayout) obj, false);
            }
        });
        for (int i = 6; i > 0; i--) {
            if (i <= list.size()) {
                m1848b(this.f1009b.get(i - 1), i, list);
            }
        }
    }

    public LiveMultiAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1008a = new ArrayList();
        this.f1009b = new ArrayList();
    }

    public LiveMultiAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1008a = new ArrayList();
        this.f1009b = new ArrayList();
    }
}
