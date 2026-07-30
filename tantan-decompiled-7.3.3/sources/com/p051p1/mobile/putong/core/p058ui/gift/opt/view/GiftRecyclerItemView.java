package com.p051p1.mobile.putong.core.p058ui.gift.opt.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import java.util.List;
import p151v.VRecyclerView;
import p153l.bwj;
import p153l.fxj;
import p153l.lxj;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class GiftRecyclerItemView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public GiftRecyclerItemView f30107c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.GiftRecyclerItemView$a */
    public static class C8506a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final int f30108a;

        /* JADX INFO: renamed from: b */
        public final int f30109b;

        /* JADX INFO: renamed from: c */
        public final int f30110c;

        /* JADX INFO: renamed from: d */
        public final int f30111d;

        public C8506a(int i, int i2, int i3, int i4) {
            this.f30108a = i;
            this.f30109b = i2;
            this.f30110c = i3;
            this.f30111d = i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = childAdapterPosition % 4;
            int i2 = this.f30108a;
            rect.left = i2 - ((i * i2) / 4);
            rect.right = ((i + 1) * this.f30109b) / 4;
            if (childAdapterPosition < 4) {
                rect.top = this.f30110c;
            } else {
                rect.top = -qa00.m175859d(3.0f);
            }
            rect.bottom = this.f30111d;
        }
    }

    public GiftRecyclerItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m46704G(View view) {
        fxj.m127982a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m46705H(List<CoreGiftInfo> list, bwj bwjVar, int i) {
        this.f30107c.setLayoutManager(new GridLayoutManager(getContext(), i));
        lxj lxjVar = new lxj(bwjVar);
        GiftRecyclerItemView giftRecyclerItemView = this.f30107c;
        int i2 = qa00.f156319f;
        giftRecyclerItemView.addItemDecoration(new C8506a(i2, i2, i2, 0));
        this.f30107c.setAdapter(lxjVar);
        lxjVar.m156201N(list, bwjVar.m106707k());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46704G(this);
        this.f30107c.setNestedScrollingEnabled(false);
        this.f30107c.setHasFixedSize(true);
    }

    public GiftRecyclerItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftRecyclerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
