package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p149l.d5c0;
import p149l.e30;
import p149l.hxs;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

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
    public final void m67443b(FrameLayout frameLayout, int i, List<String> list) {
        xdl0.m208344M(frameLayout, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i2 = i - 1;
        layoutParams.leftMargin = t100.f167265n * i2;
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getChildAt(0) instanceof VDraweeView) {
            VDraweeView vDraweeView = (VDraweeView) frameLayout.getChildAt(0);
            String str = list.get(i2);
            int i3 = t100.f167267p;
            hxs.m133408u("context_square", vDraweeView, str, i3, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m67444c() {
        int size;
        int i;
        boolean zIsEmpty = TextUtils.isEmpty(this.numberText);
        TextView textView = this.numberView;
        if (zIsEmpty) {
            xdl0.m208344M(textView, false);
            return;
        }
        xdl0.m208344M(textView, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.numberView.getLayoutParams();
        if (this.images.size() >= 4) {
            size = t100.m186890d(72.0f);
            i = t100.f167252a;
        } else {
            size = this.images.size() * t100.f167265n;
            i = t100.f167252a;
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
        FrameLayout frameLayout = (FrameLayout) findViewById(d5c0.f84488k);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(d5c0.f84491l);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(d5c0.f84494m);
        FrameLayout frameLayout4 = (FrameLayout) findViewById(d5c0.f84497n);
        this.list.add(frameLayout);
        this.list.add(frameLayout2);
        this.list.add(frameLayout3);
        this.list.add(frameLayout4);
        TextView textView = (TextView) findViewById(d5c0.f84511s0);
        this.numberView = textView;
        xdl0.m208344M(textView, false);
    }

    public void setImageData(List<String> list) {
        vwb.m200354z(this.list, new e30() { // from class: l.tur
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208344M((FrameLayout) obj, false);
            }
        });
        this.images = list;
        if (list == null) {
            this.images = new ArrayList();
        }
        for (int i = 4; i > 0; i--) {
            if (i <= this.images.size()) {
                m67443b(this.list.get(i - 1), i, this.images);
            }
        }
        m67444c();
    }

    public void setNumberView(String str) {
        this.numberText = str;
        m67444c();
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
