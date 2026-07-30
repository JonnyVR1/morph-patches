package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.adc0;
import p153l.bnl0;
import p153l.fsb0;
import p153l.jyb;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class LiveMultiAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List<String> f22972a;

    /* JADX INFO: renamed from: b */
    public List<FrameLayout> f22973b;

    public LiveMultiAvatarView(@NonNull Context context) {
        super(context);
        this.f22972a = new ArrayList();
        this.f22973b = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m38880b(FrameLayout frameLayout, int i, List<String> list) {
        bnl0.m105524M(frameLayout, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i2 = i - 1;
        layoutParams.leftMargin = qa00.f156330q * i2;
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getChildAt(0) instanceof VDraweeView) {
            VDraweeView vDraweeView = (VDraweeView) frameLayout.getChildAt(0);
            fsb0 fsb0Var = uqb0.f180374G;
            String str = list.get(i2);
            int i3 = qa00.f156333t;
            fsb0Var.m127109I0(vDraweeView, str, i3, i3);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout frameLayout = (FrameLayout) findViewById(adc0.f70059P);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(adc0.f70076Q);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(adc0.f70093R);
        FrameLayout frameLayout4 = (FrameLayout) findViewById(adc0.f70110S);
        FrameLayout frameLayout5 = (FrameLayout) findViewById(adc0.f70127T);
        FrameLayout frameLayout6 = (FrameLayout) findViewById(adc0.f70144U);
        this.f22973b.add(frameLayout);
        this.f22973b.add(frameLayout2);
        this.f22973b.add(frameLayout3);
        this.f22973b.add(frameLayout4);
        this.f22973b.add(frameLayout5);
        this.f22973b.add(frameLayout6);
        ((LiveAvatarNumberItemView) frameLayout6).setCanEffect(false);
    }

    public void setImageData(List<String> list) {
        if (list == null) {
            return;
        }
        this.f22972a = list;
        jyb.m147537z(this.f22973b, new y20() { // from class: l.g7t
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105524M((FrameLayout) obj, false);
            }
        });
        for (int i = 6; i > 0; i--) {
            if (i <= list.size()) {
                m38880b(this.f22973b.get(i - 1), i, list);
            }
        }
    }

    public LiveMultiAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22972a = new ArrayList();
        this.f22973b = new ArrayList();
    }

    public LiveMultiAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22972a = new ArrayList();
        this.f22973b = new ArrayList();
    }
}
