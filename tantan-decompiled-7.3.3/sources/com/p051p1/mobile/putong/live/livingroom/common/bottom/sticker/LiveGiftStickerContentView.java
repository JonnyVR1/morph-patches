package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.List;
import p151v.VRecyclerView;
import p153l.jyj;
import p153l.yls;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftStickerContentView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public LiveGiftStickerContentView f49504c;

    /* JADX INFO: renamed from: d */
    public jyj f49505d;

    public LiveGiftStickerContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m73459r() {
        this.f49504c.setNestedScrollingEnabled(false);
        this.f49504c.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.f49504c.setLayoutManager(gridLayoutManager);
        if (this.f49504c.getItemAnimator() != null) {
            ((AbstractC0618v) this.f49504c.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        gridLayoutManager.setRecycleChildrenOnDetach(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m73460G(View view) {
        yls.m216619a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m73461H(List<BLiveStickerTemplatesGiftItem> list, C12897a c12897a) {
        jyj jyjVar = this.f49505d;
        if (jyjVar != null) {
            jyjVar.m147594G(list);
            return;
        }
        jyj jyjVar2 = new jyj(c12897a, list);
        this.f49505d = jyjVar2;
        this.f49504c.setAdapter(jyjVar2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73460G(this);
        m73459r();
    }

    public LiveGiftStickerContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftStickerContentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
