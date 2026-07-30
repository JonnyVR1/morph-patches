package com.p046p1.mobile.putong.core.p053ui.asneedloadscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.a11;
import p149l.dcl0;
import p149l.r9c0;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class AsNeedLoadScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RecyclerView f28466a;

    /* JADX INFO: renamed from: b */
    public C8290b f28467b;

    /* JADX INFO: renamed from: c */
    public AsNeedLayoutManager f28468c;

    /* JADX INFO: renamed from: d */
    public boolean f28469d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLoadScrollView$a */
    public class C8289a extends RecyclerView.AbstractC0582t {
        public C8289a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                AsNeedLoadScrollView.this.m44329c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLoadScrollView$b */
    public static class C8290b extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

        /* JADX INFO: renamed from: a */
        public List<dcl0> f28471a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public List<a11> f28472b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f28473c;

        /* JADX INFO: renamed from: d */
        public User f28474d;

        public C8290b(boolean z) {
            this.f28473c = z;
        }

        /* JADX INFO: renamed from: A */
        public void m44330A(List<dcl0> list) {
            this.f28471a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f28474d == null) {
                return 0;
            }
            return this.f28471a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
            if (abstractC0566d0 instanceof a11) {
                a11 a11Var = (a11) abstractC0566d0;
                if (!this.f28472b.contains(a11Var)) {
                    this.f28472b.add(a11Var);
                }
                if (NullChecker.m81303a(this.f28474d)) {
                    a11Var.mo94503a(this.f28474d, this.f28473c);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.AbstractC0566d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return this.f28471a.get(i).mo103900a(viewGroup);
        }

        /* JADX INFO: renamed from: y */
        public List<a11> m44331y() {
            return this.f28472b;
        }

        /* JADX INFO: renamed from: z */
        public void m44332z(User user) {
            this.f28474d = user;
            this.f28472b.clear();
        }
    }

    public AsNeedLoadScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28469d = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158319a);
        int iM186890d = t100.m186890d(20.0f);
        if (typedArrayObtainStyledAttributes != null) {
            this.f28469d = typedArrayObtainStyledAttributes.getBoolean(r9c0.f158323c, false);
            iM186890d = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.f158321b, t100.m186890d(20.0f));
        }
        this.f28466a = new RecyclerView(context);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.f28469d) {
            CardView cardView = new CardView(context);
            cardView.setCardElevation(0.0f);
            cardView.setRadius(iM186890d);
            cardView.setUseCompatPadding(false);
            addView(cardView, new FrameLayout.LayoutParams(-1, -1));
            cardView.addView(this.f28466a, layoutParams);
        } else {
            addView(this.f28466a, layoutParams);
        }
        AsNeedLayoutManager asNeedLayoutManager = new AsNeedLayoutManager(this.f28466a);
        this.f28468c = asNeedLayoutManager;
        this.f28466a.setLayoutManager(asNeedLayoutManager);
        C8290b c8290b = new C8290b(this.f28469d);
        this.f28467b = c8290b;
        this.f28466a.setAdapter(c8290b);
        this.f28466a.addOnScrollListener(new C8289a());
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public void m44328b(@NonNull RecyclerView.AbstractC0582t abstractC0582t) {
        if (abstractC0582t != null) {
            this.f28466a.addOnScrollListener(abstractC0582t);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m44329c() {
        C8290b c8290b = this.f28467b;
        if (c8290b == null || vwb.m200296J(c8290b.m44331y())) {
            return;
        }
        Iterator<a11> it = this.f28467b.m44331y().iterator();
        while (it.hasNext()) {
            it.next().mo94504b();
        }
    }

    public void setItemData(User user) {
        this.f28467b.m44332z(user);
        this.f28468c.m44326e();
        this.f28467b.notifyDataSetChanged();
    }

    public void setViewHolderData(ArrayList<dcl0> arrayList) {
        this.f28467b.m44330A(arrayList);
    }

    public AsNeedLoadScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AsNeedLoadScrollView(@NonNull Context context) {
        this(context, null);
    }
}
