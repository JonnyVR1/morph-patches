package com.p046p1.mobile.putong.core.p053ui.gift.opt.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import java.util.List;
import p147v.VRecyclerView;
import p149l.ltj;
import p149l.puj;
import p149l.t100;
import p149l.vuj;

/* JADX INFO: loaded from: classes10.dex */
public class GiftRecyclerItemView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public GiftRecyclerItemView f29259c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.GiftRecyclerItemView$a */
    public static class C8343a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final int f29260a;

        /* JADX INFO: renamed from: b */
        public final int f29261b;

        /* JADX INFO: renamed from: c */
        public final int f29262c;

        /* JADX INFO: renamed from: d */
        public final int f29263d;

        public C8343a(int i, int i2, int i3, int i4) {
            this.f29260a = i;
            this.f29261b = i2;
            this.f29262c = i3;
            this.f29263d = i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = childAdapterPosition % 4;
            int i2 = this.f29260a;
            rect.left = i2 - ((i * i2) / 4);
            rect.right = ((i + 1) * this.f29261b) / 4;
            if (childAdapterPosition < 4) {
                rect.top = this.f29262c;
            } else {
                rect.top = -t100.m186890d(3.0f);
            }
            rect.bottom = this.f29263d;
        }
    }

    public GiftRecyclerItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m45521G(View view) {
        puj.m171429a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m45522H(List<CoreGiftInfo> list, ltj ltjVar, int i) {
        this.f29259c.setLayoutManager(new GridLayoutManager(getContext(), i));
        vuj vujVar = new vuj(ltjVar);
        GiftRecyclerItemView giftRecyclerItemView = this.f29259c;
        int i2 = t100.f167257f;
        giftRecyclerItemView.addItemDecoration(new C8343a(i2, i2, i2, 0));
        this.f29259c.setAdapter(vujVar);
        vujVar.m200084N(list, ltjVar.m151698k());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45521G(this);
        this.f29259c.setNestedScrollingEnabled(false);
        this.f29259c.setHasFixedSize(true);
    }

    public GiftRecyclerItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftRecyclerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
