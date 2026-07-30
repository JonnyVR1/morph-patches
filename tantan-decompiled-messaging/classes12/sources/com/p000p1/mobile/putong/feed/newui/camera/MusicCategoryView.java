package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.MusicCategory;
import l.qib0;
import p007l.ko10;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicCategoryView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f816a;

    /* JADX INFO: renamed from: b */
    public TextView f817b;

    public MusicCategoryView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2033b(View view) {
        ko10.m11506a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m2034c(MusicCategory musicCategory, View view) {
        getContext().startActivityForResult(MusicListAct.m2123b2(getContext(), musicCategory), 1001);
    }

    /* JADX INFO: renamed from: d */
    public void m2035d(final MusicCategory musicCategory) {
        this.f817b.setText(musicCategory.name);
        qib0.G.L0(this.f816a, musicCategory.icon);
        setOnClickListener(new View.OnClickListener() { // from class: l.jo10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9459a.m2034c(musicCategory, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2033b(this);
    }

    public MusicCategoryView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicCategoryView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
