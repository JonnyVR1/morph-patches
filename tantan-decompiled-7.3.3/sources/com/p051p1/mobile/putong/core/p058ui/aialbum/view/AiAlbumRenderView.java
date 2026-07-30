package com.p051p1.mobile.putong.core.p058ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.data.AiAlbumProcessingData;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.dg0;
import p153l.fg0;
import p153l.ye0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumRenderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f29253c;

    /* JADX INFO: renamed from: d */
    public VText f29254d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f29255e;

    /* JADX INFO: renamed from: f */
    public VText f29256f;

    /* JADX INFO: renamed from: g */
    public dg0 f29257g;

    /* JADX INFO: renamed from: h */
    public ye0 f29258h;

    public AiAlbumRenderView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: r */
    private void m45458r() {
        this.f29257g = new dg0();
        this.f29255e.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f29255e.setAdapter(this.f29257g);
        this.f29256f.setEnabled(false);
    }

    /* JADX INFO: renamed from: P */
    public final void m45459P(View view) {
        fg0.m125471a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Q */
    public void m45460Q(AiAlbumProcessingData aiAlbumProcessingData) {
        this.f29257g.m115568G();
        try {
            this.f29256f.setText(((int) (Float.valueOf(aiAlbumProcessingData.rate).floatValue() * 100.0f)) + "%");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45459P(this);
    }

    public void setPresenter(ye0 ye0Var) {
        this.f29258h = ye0Var;
        m45458r();
    }

    public AiAlbumRenderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
