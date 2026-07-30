package com.p046p1.mobile.putong.core.p053ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.data.AiAlbumProcessingData;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.cf0;
import p149l.hg0;
import p149l.jg0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumRenderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f28405c;

    /* JADX INFO: renamed from: d */
    public VText f28406d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f28407e;

    /* JADX INFO: renamed from: f */
    public VText f28408f;

    /* JADX INFO: renamed from: g */
    public hg0 f28409g;

    /* JADX INFO: renamed from: h */
    public cf0 f28410h;

    public AiAlbumRenderView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: r */
    private void m44275r() {
        this.f28409g = new hg0();
        this.f28407e.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f28407e.setAdapter(this.f28409g);
        this.f28408f.setEnabled(false);
    }

    /* JADX INFO: renamed from: P */
    public final void m44276P(View view) {
        jg0.m141217a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Q */
    public void m44277Q(AiAlbumProcessingData aiAlbumProcessingData) {
        this.f28409g.m130803G();
        try {
            this.f28408f.setText(((int) (Float.valueOf(aiAlbumProcessingData.rate).floatValue() * 100.0f)) + "%");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44276P(this);
    }

    public void setPresenter(cf0 cf0Var) {
        this.f28410h = cf0Var;
        m44275r();
    }

    public AiAlbumRenderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
