package com.p000p1.mobile.putong.feed.newui.videoflow.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.tantanapp.common.utils.NullChecker;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPagerSnapLinearLayoutManger extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public e30<Integer> f4759a;

    /* JADX INFO: renamed from: b */
    public s f4760b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f4761c;

    /* JADX INFO: renamed from: d */
    public boolean f4762d;

    /* JADX INFO: renamed from: e */
    public RecyclerView.q f4763e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.videoflow.util.FeedPagerSnapLinearLayoutManger$a */
    public class C2221a implements RecyclerView.q {
        public C2221a() {
        }

        /* JADX INFO: renamed from: b */
        public void m7372b(View view) {
        }

        /* JADX INFO: renamed from: d */
        public void m7373d(View view) {
            if (FeedPagerSnapLinearLayoutManger.this.f4761c.getChildPosition(view) == 0 && !FeedPagerSnapLinearLayoutManger.this.f4762d && NullChecker.a(FeedPagerSnapLinearLayoutManger.this.f4759a)) {
                FeedPagerSnapLinearLayoutManger.this.f4759a.call(0);
                FeedPagerSnapLinearLayoutManger.this.f4762d = true;
            }
        }
    }

    public FeedPagerSnapLinearLayoutManger(Context context) {
        super(context);
        this.f4763e = new C2221a();
        m7370g();
    }

    /* JADX INFO: renamed from: g */
    public final void m7370g() {
        this.f4760b = new s();
    }

    /* JADX INFO: renamed from: h */
    public void m7371h(e30<Integer> e30Var) {
        this.f4759a = e30Var;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.o*/.onAttachedToWindow(recyclerView);
        this.f4760b.b(recyclerView);
        this.f4761c = recyclerView;
        recyclerView.addOnChildAttachStateChangeListener(this.f4763e);
    }

    public void onScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        View viewH = this.f4760b.h(this);
        if (NullChecker.a(viewH)) {
            int position = getPosition(viewH);
            if (NullChecker.a(this.f4759a)) {
                this.f4759a.call(Integer.valueOf(position));
            }
        }
    }

    public FeedPagerSnapLinearLayoutManger(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4763e = new C2221a();
        m7370g();
    }
}
