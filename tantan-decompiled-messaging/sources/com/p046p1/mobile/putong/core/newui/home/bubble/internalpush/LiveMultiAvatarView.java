package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p149l.bkb0;
import p149l.e30;
import p149l.qib0;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveMultiAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List<String> f22230a;

    /* JADX INFO: renamed from: b */
    public List<FrameLayout> f22231b;

    public LiveMultiAvatarView(@NonNull Context context) {
        super(context);
        this.f22230a = new ArrayList();
        this.f22231b = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m37877b(FrameLayout frameLayout, int i, List<String> list) {
        xdl0.m208344M(frameLayout, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i2 = i - 1;
        layoutParams.leftMargin = t100.f167268q * i2;
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getChildAt(0) instanceof VDraweeView) {
            VDraweeView vDraweeView = (VDraweeView) frameLayout.getChildAt(0);
            bkb0 bkb0Var = qib0.f154691G;
            String str = list.get(i2);
            int i3 = t100.f167271t;
            bkb0Var.m102325I0(vDraweeView, str, i3, i3);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout frameLayout = (FrameLayout) findViewById(u4c0.f173971P);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(u4c0.f173988Q);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(u4c0.f174005R);
        FrameLayout frameLayout4 = (FrameLayout) findViewById(u4c0.f174022S);
        FrameLayout frameLayout5 = (FrameLayout) findViewById(u4c0.f174039T);
        FrameLayout frameLayout6 = (FrameLayout) findViewById(u4c0.f174055U);
        this.f22231b.add(frameLayout);
        this.f22231b.add(frameLayout2);
        this.f22231b.add(frameLayout3);
        this.f22231b.add(frameLayout4);
        this.f22231b.add(frameLayout5);
        this.f22231b.add(frameLayout6);
        ((LiveAvatarNumberItemView) frameLayout6).setCanEffect(false);
    }

    public void setImageData(List<String> list) {
        if (list == null) {
            return;
        }
        this.f22230a = list;
        vwb.m200354z(this.f22231b, new e30() { // from class: l.f5t
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208344M((FrameLayout) obj, false);
            }
        });
        for (int i = 6; i > 0; i--) {
            if (i <= list.size()) {
                m37877b(this.f22231b.get(i - 1), i, list);
            }
        }
    }

    public LiveMultiAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22230a = new ArrayList();
        this.f22231b = new ArrayList();
    }

    public LiveMultiAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22230a = new ArrayList();
        this.f22231b = new ArrayList();
    }
}
