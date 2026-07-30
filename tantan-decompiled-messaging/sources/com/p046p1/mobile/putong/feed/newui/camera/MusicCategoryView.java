package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.MusicCategory;
import p147v.VDraweeView;
import p149l.ko10;
import p149l.qib0;

/* JADX INFO: loaded from: classes12.dex */
public class MusicCategoryView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f39355a;

    /* JADX INFO: renamed from: b */
    public TextView f39356b;

    public MusicCategoryView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m61100b(View view) {
        ko10.m146665a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m61101c(MusicCategory musicCategory, View view) {
        ((Act) getContext()).startActivityForResult(MusicListAct.m61189b2(getContext(), musicCategory), 1001);
    }

    /* JADX INFO: renamed from: d */
    public void m61102d(final MusicCategory musicCategory) {
        this.f39356b.setText(musicCategory.name);
        qib0.f154691G.m102331L0(this.f39355a, musicCategory.icon);
        setOnClickListener(new View.OnClickListener() { // from class: l.jo10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118912a.m61101c(musicCategory, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61100b(this);
    }

    public MusicCategoryView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicCategoryView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
