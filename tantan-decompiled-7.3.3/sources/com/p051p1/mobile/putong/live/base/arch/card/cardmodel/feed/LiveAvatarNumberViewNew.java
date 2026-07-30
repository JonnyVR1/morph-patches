package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.jdc0;
import p153l.jyb;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class LiveAvatarNumberViewNew extends FrameLayout {
    private static final int COUNT = 4;
    private List<String> images;
    private List<FrameLayout> list;
    private String numberText;
    private TextView numberView;

    public LiveAvatarNumberViewNew(@NonNull Context context) {
        super(context);
        this.images = new ArrayList();
        this.list = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m68626b(FrameLayout frameLayout, int i, List<String> list) {
        bnl0.m105524M(frameLayout, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i2 = i - 1;
        layoutParams.leftMargin = qa00.f156327n * i2;
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getChildAt(0) instanceof VDraweeView) {
            VDraweeView vDraweeView = (VDraweeView) frameLayout.getChildAt(0);
            String str = list.get(i2);
            int i3 = qa00.f156329p;
            izs.m142870u("context_square", vDraweeView, str, i3, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m68627c() {
        int size;
        int i;
        boolean zIsEmpty = TextUtils.isEmpty(this.numberText);
        TextView textView = this.numberView;
        if (zIsEmpty) {
            bnl0.m105524M(textView, false);
            return;
        }
        bnl0.m105524M(textView, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.numberView.getLayoutParams();
        if (this.images.size() >= 4) {
            size = qa00.m175859d(72.0f);
            i = qa00.f156314a;
        } else {
            size = this.images.size() * qa00.f156327n;
            i = qa00.f156314a;
        }
        layoutParams.leftMargin = size - i;
        this.numberView.setLayoutParams(layoutParams);
        this.numberView.setText(this.numberText);
    }

    public TextView getNumberView() {
        return this.numberView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout frameLayout = (FrameLayout) findViewById(jdc0.f120206k);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(jdc0.f120209l);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(jdc0.f120212m);
        FrameLayout frameLayout4 = (FrameLayout) findViewById(jdc0.f120215n);
        this.list.add(frameLayout);
        this.list.add(frameLayout2);
        this.list.add(frameLayout3);
        this.list.add(frameLayout4);
        TextView textView = (TextView) findViewById(jdc0.f120229s0);
        this.numberView = textView;
        bnl0.m105524M(textView, false);
    }

    public void setImageData(List<String> list) {
        jyb.m147537z(this.list, new y20() { // from class: l.uwr
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105524M((FrameLayout) obj, false);
            }
        });
        this.images = list;
        if (list == null) {
            this.images = new ArrayList();
        }
        for (int i = 4; i > 0; i--) {
            if (i <= this.images.size()) {
                m68626b(this.list.get(i - 1), i, this.images);
            }
        }
        m68627c();
    }

    public void setNumberView(String str) {
        this.numberText = str;
        m68627c();
    }

    public LiveAvatarNumberViewNew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.images = new ArrayList();
        this.list = new ArrayList();
    }

    public LiveAvatarNumberViewNew(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.images = new ArrayList();
        this.list = new ArrayList();
    }
}
