package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MusicCategory;
import p151v.VDraweeView;
import p153l.sw10;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class MusicCategoryView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40203a;

    /* JADX INFO: renamed from: b */
    public TextView f40204b;

    public MusicCategoryView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m62284b(View view) {
        sw10.m188235a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m62285c(MusicCategory musicCategory, View view) {
        ((Act) getContext()).startActivityForResult(MusicListAct.m62373c2(getContext(), musicCategory), 1001);
    }

    /* JADX INFO: renamed from: d */
    public void m62286d(final MusicCategory musicCategory) {
        this.f40204b.setText(musicCategory.name);
        uqb0.f180374G.m127115L0(this.f40203a, musicCategory.icon);
        setOnClickListener(new View.OnClickListener() { // from class: l.rw10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165092a.m62285c(musicCategory, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62284b(this);
    }

    public MusicCategoryView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicCategoryView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
