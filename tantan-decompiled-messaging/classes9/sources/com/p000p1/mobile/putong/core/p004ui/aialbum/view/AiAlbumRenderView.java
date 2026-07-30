package com.p000p1.mobile.putong.core.p004ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p1.mobile.putong.core.data.AiAlbumProcessingData;
import com.tantanapp.common.utils.CrashHelper;
import l.jg0;
import p006l.cf0;
import p006l.hg0;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AiAlbumRenderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f4472c;

    /* JADX INFO: renamed from: d */
    public VText f4473d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f4474e;

    /* JADX INFO: renamed from: f */
    public VText f4475f;

    /* JADX INFO: renamed from: g */
    public hg0 f4476g;

    /* JADX INFO: renamed from: h */
    public cf0 f4477h;

    public AiAlbumRenderView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m7231r() {
        this.f4476g = new hg0();
        this.f4474e.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f4474e.setAdapter(this.f4476g);
        this.f4475f.setEnabled(false);
    }

    /* JADX INFO: renamed from: P */
    public final void m7232P(View view) {
        jg0.a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Q */
    public void m7233Q(AiAlbumProcessingData aiAlbumProcessingData) {
        this.f4476g.m16216G();
        try {
            this.f4475f.setText(((int) (Float.valueOf(aiAlbumProcessingData.rate).floatValue() * 100.0f)) + "%");
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7232P(this);
    }

    public void setPresenter(cf0 cf0Var) {
        this.f4477h = cf0Var;
        m7231r();
    }

    public AiAlbumRenderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
