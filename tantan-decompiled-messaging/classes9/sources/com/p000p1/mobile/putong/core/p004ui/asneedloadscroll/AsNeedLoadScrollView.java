package com.p000p1.mobile.putong.core.p004ui.asneedloadscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.r9c0;
import l.t100;
import l.vwb;
import p006l.a11;
import p006l.dcl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AsNeedLoadScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RecyclerView f4533a;

    /* JADX INFO: renamed from: b */
    public C0206b f4534b;

    /* JADX INFO: renamed from: c */
    public AsNeedLayoutManager f4535c;

    /* JADX INFO: renamed from: d */
    public boolean f4536d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLoadScrollView$a */
    public class C0205a extends RecyclerView.t {
        public C0205a() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                AsNeedLoadScrollView.this.m7285c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLoadScrollView$b */
    public static class C0206b extends RecyclerView.Adapter<RecyclerView.d0> {

        /* JADX INFO: renamed from: a */
        public List<dcl0> f4538a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public List<a11> f4539b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f4540c;

        /* JADX INFO: renamed from: d */
        public User f4541d;

        public C0206b(boolean z) {
            this.f4540c = z;
        }

        /* JADX INFO: renamed from: A */
        public void m7286A(List<dcl0> list) {
            this.f4538a = list;
        }

        public int getItemCount() {
            if (this.f4541d == null) {
                return 0;
            }
            return this.f4538a.size();
        }

        public int getItemViewType(int i) {
            return i;
        }

        public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i) {
            if (d0Var instanceof a11) {
                a11 a11Var = (a11) d0Var;
                if (!this.f4539b.contains(a11Var)) {
                    this.f4539b.add(a11Var);
                }
                if (NullChecker.a(this.f4541d)) {
                    a11Var.m11683a(this.f4541d, this.f4540c);
                }
            }
        }

        @NonNull
        public RecyclerView.d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return this.f4538a.get(i).m13902a(viewGroup);
        }

        /* JADX INFO: renamed from: y */
        public List<a11> m7287y() {
            return this.f4539b;
        }

        /* JADX INFO: renamed from: z */
        public void m7288z(User user) {
            this.f4541d = user;
            this.f4539b.clear();
        }
    }

    public AsNeedLoadScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4536d = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.a);
        int iD = t100.d(20.0f);
        if (typedArrayObtainStyledAttributes != null) {
            this.f4536d = typedArrayObtainStyledAttributes.getBoolean(r9c0.c, false);
            iD = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.b, t100.d(20.0f));
        }
        this.f4533a = new RecyclerView(context);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.f4536d) {
            CardView cardView = new CardView(context);
            cardView.setCardElevation(0.0f);
            cardView.setRadius(iD);
            cardView.setUseCompatPadding(false);
            addView((View) cardView, new FrameLayout.LayoutParams(-1, -1));
            cardView.addView(this.f4533a, layoutParams);
        } else {
            addView(this.f4533a, layoutParams);
        }
        AsNeedLayoutManager asNeedLayoutManager = new AsNeedLayoutManager(this.f4533a);
        this.f4535c = asNeedLayoutManager;
        this.f4533a.setLayoutManager(asNeedLayoutManager);
        C0206b c0206b = new C0206b(this.f4536d);
        this.f4534b = c0206b;
        this.f4533a.setAdapter(c0206b);
        this.f4533a.addOnScrollListener(new C0205a());
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public void m7284b(@NonNull RecyclerView.t tVar) {
        if (tVar != null) {
            this.f4533a.addOnScrollListener(tVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7285c() {
        C0206b c0206b = this.f4534b;
        if (c0206b == null || vwb.J(c0206b.m7287y())) {
            return;
        }
        Iterator<a11> it = this.f4534b.m7287y().iterator();
        while (it.hasNext()) {
            it.next().m11684b();
        }
    }

    public void setItemData(User user) {
        this.f4534b.m7288z(user);
        this.f4535c.m7282e();
        this.f4534b.notifyDataSetChanged();
    }

    public void setViewHolderData(ArrayList<dcl0> arrayList) {
        this.f4534b.m7286A(arrayList);
    }

    public AsNeedLoadScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AsNeedLoadScrollView(@NonNull Context context) {
        this(context, null);
    }
}
