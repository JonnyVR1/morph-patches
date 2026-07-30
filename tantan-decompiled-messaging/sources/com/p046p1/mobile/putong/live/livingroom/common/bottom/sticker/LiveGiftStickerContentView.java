package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.List;
import p147v.VRecyclerView;
import p149l.tvj;
import p149l.xjs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftStickerContentView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public LiveGiftStickerContentView f48656c;

    /* JADX INFO: renamed from: d */
    public tvj f48657d;

    public LiveGiftStickerContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m72276r() {
        this.f48656c.setNestedScrollingEnabled(false);
        this.f48656c.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.f48656c.setLayoutManager(gridLayoutManager);
        if (this.f48656c.getItemAnimator() != null) {
            ((AbstractC0616v) this.f48656c.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        gridLayoutManager.setRecycleChildrenOnDetach(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m72277G(View view) {
        xjs.m209740a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m72278H(List<BLiveStickerTemplatesGiftItem> list, C12734a c12734a) {
        tvj tvjVar = this.f48657d;
        if (tvjVar != null) {
            tvjVar.m190749G(list);
            return;
        }
        tvj tvjVar2 = new tvj(c12734a, list);
        this.f48657d = tvjVar2;
        this.f48656c.setAdapter(tvjVar2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72277G(this);
        m72276r();
    }

    public LiveGiftStickerContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftStickerContentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
