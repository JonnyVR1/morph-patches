package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.List;
import p002l.tvj;
import p002l.xjs;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftStickerContentView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public LiveGiftStickerContentView f4698c;

    /* JADX INFO: renamed from: d */
    public tvj f4699d;

    public LiveGiftStickerContentView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m5749r() {
        this.f4698c.setNestedScrollingEnabled(false);
        this.f4698c.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.f4698c.setLayoutManager(gridLayoutManager);
        if (this.f4698c.getItemAnimator() != null) {
            this.f4698c.getItemAnimator().setSupportsChangeAnimations(false);
        }
        gridLayoutManager.setRecycleChildrenOnDetach(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m5750G(View view) {
        xjs.m26024a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m5751H(List<BLiveStickerTemplatesGiftItem> list, C0323a c0323a) {
        tvj tvjVar = this.f4699d;
        if (tvjVar != null) {
            tvjVar.m23185G(list);
            return;
        }
        tvj tvjVar2 = new tvj(c0323a, list);
        this.f4699d = tvjVar2;
        this.f4698c.setAdapter(tvjVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5750G(this);
        m5749r();
    }

    public LiveGiftStickerContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftStickerContentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
