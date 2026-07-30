package com.p000p1.mobile.putong.core.p001ui.gift.opt.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import java.util.List;
import l.t100;
import p003l.ltj;
import p003l.puj;
import p003l.vuj;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftRecyclerItemView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public GiftRecyclerItemView f1653c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.GiftRecyclerItemView$a */
    public static class C3118a extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public final int f1654a;

        /* JADX INFO: renamed from: b */
        public final int f1655b;

        /* JADX INFO: renamed from: c */
        public final int f1656c;

        /* JADX INFO: renamed from: d */
        public final int f1657d;

        public C3118a(int i, int i2, int i3, int i4) {
            this.f1654a = i;
            this.f1655b = i2;
            this.f1656c = i3;
            this.f1657d = i4;
        }

        public void getItemOffsets(Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = childAdapterPosition % 4;
            int i2 = this.f1654a;
            rect.left = i2 - ((i * i2) / 4);
            rect.right = ((i + 1) * this.f1655b) / 4;
            if (childAdapterPosition < 4) {
                rect.top = this.f1656c;
            } else {
                rect.top = -t100.d(3.0f);
            }
            rect.bottom = this.f1657d;
        }
    }

    public GiftRecyclerItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m2857G(View view) {
        puj.m8796a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public void m2858H(List<CoreGiftInfo> list, ltj ltjVar, int i) {
        this.f1653c.setLayoutManager(new GridLayoutManager(getContext(), i));
        vuj vujVar = new vuj(ltjVar);
        GiftRecyclerItemView giftRecyclerItemView = this.f1653c;
        int i2 = t100.f;
        giftRecyclerItemView.addItemDecoration(new C3118a(i2, i2, i2, 0));
        this.f1653c.setAdapter(vujVar);
        vujVar.m10366N(list, ltjVar.m7907k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2857G(this);
        this.f1653c.setNestedScrollingEnabled(false);
        this.f1653c.setHasFixedSize(true);
    }

    public GiftRecyclerItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftRecyclerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
