package com.p051p1.mobile.putong.core.p058ui.asneedloadscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.h11;
import p153l.hll0;
import p153l.jyb;
import p153l.qa00;
import p153l.xhc0;

/* JADX INFO: loaded from: classes9.dex */
public class AsNeedLoadScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RecyclerView f29314a;

    /* JADX INFO: renamed from: b */
    public C8453b f29315b;

    /* JADX INFO: renamed from: c */
    public AsNeedLayoutManager f29316c;

    /* JADX INFO: renamed from: d */
    public boolean f29317d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLoadScrollView$a */
    public class C8452a extends RecyclerView.AbstractC0584t {
        public C8452a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                AsNeedLoadScrollView.this.m45512c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLoadScrollView$b */
    public static class C8453b extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

        /* JADX INFO: renamed from: a */
        public List<hll0> f29319a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public List<h11> f29320b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f29321c;

        /* JADX INFO: renamed from: d */
        public User f29322d;

        public C8453b(boolean z) {
            this.f29321c = z;
        }

        /* JADX INFO: renamed from: A */
        public void m45513A(List<hll0> list) {
            this.f29319a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f29322d == null) {
                return 0;
            }
            return this.f29319a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
            if (abstractC0569e0 instanceof h11) {
                h11 h11Var = (h11) abstractC0569e0;
                if (!this.f29320b.contains(h11Var)) {
                    this.f29320b.add(h11Var);
                }
                if (NullChecker.m82486a(this.f29322d)) {
                    h11Var.mo133267a(this.f29322d, this.f29321c);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.AbstractC0569e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return this.f29319a.get(i).mo135759a(viewGroup);
        }

        /* JADX INFO: renamed from: y */
        public List<h11> m45514y() {
            return this.f29320b;
        }

        /* JADX INFO: renamed from: z */
        public void m45515z(User user) {
            this.f29322d = user;
            this.f29320b.clear();
        }
    }

    public AsNeedLoadScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29317d = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xhc0.f194319a);
        int iM175859d = qa00.m175859d(20.0f);
        if (typedArrayObtainStyledAttributes != null) {
            this.f29317d = typedArrayObtainStyledAttributes.getBoolean(xhc0.f194323c, false);
            iM175859d = typedArrayObtainStyledAttributes.getDimensionPixelSize(xhc0.f194321b, qa00.m175859d(20.0f));
        }
        this.f29314a = new RecyclerView(context);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.f29317d) {
            CardView cardView = new CardView(context);
            cardView.setCardElevation(0.0f);
            cardView.setRadius(iM175859d);
            cardView.setUseCompatPadding(false);
            addView(cardView, new FrameLayout.LayoutParams(-1, -1));
            cardView.addView(this.f29314a, layoutParams);
        } else {
            addView(this.f29314a, layoutParams);
        }
        AsNeedLayoutManager asNeedLayoutManager = new AsNeedLayoutManager(this.f29314a);
        this.f29316c = asNeedLayoutManager;
        this.f29314a.setLayoutManager(asNeedLayoutManager);
        C8453b c8453b = new C8453b(this.f29317d);
        this.f29315b = c8453b;
        this.f29314a.setAdapter(c8453b);
        this.f29314a.addOnScrollListener(new C8452a());
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public void m45511b(@NonNull RecyclerView.AbstractC0584t abstractC0584t) {
        if (abstractC0584t != null) {
            this.f29314a.addOnScrollListener(abstractC0584t);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m45512c() {
        C8453b c8453b = this.f29315b;
        if (c8453b == null || jyb.m147479J(c8453b.m45514y())) {
            return;
        }
        Iterator<h11> it = this.f29315b.m45514y().iterator();
        while (it.hasNext()) {
            it.next().mo133268b();
        }
    }

    public void setItemData(User user) {
        this.f29315b.m45515z(user);
        this.f29316c.m45509e();
        this.f29315b.notifyDataSetChanged();
    }

    public void setViewHolderData(ArrayList<hll0> arrayList) {
        this.f29315b.m45513A(arrayList);
    }

    public AsNeedLoadScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AsNeedLoadScrollView(@NonNull Context context) {
        this(context, null);
    }
}
