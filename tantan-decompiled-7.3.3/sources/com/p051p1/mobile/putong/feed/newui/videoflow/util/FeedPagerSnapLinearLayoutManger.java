package com.p051p1.mobile.putong.feed.newui.videoflow.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.C0615s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.NullChecker;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPagerSnapLinearLayoutManger extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public y20<Integer> f44146a;

    /* JADX INFO: renamed from: b */
    public C0615s f44147b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f44148c;

    /* JADX INFO: renamed from: d */
    public boolean f44149d;

    /* JADX INFO: renamed from: e */
    public RecyclerView.InterfaceC0581q f44150e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.videoflow.util.FeedPagerSnapLinearLayoutManger$a */
    public class C11540a implements RecyclerView.InterfaceC0581q {
        public C11540a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
        /* JADX INFO: renamed from: b */
        public void mo3422b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
        /* JADX INFO: renamed from: d */
        public void mo3423d(View view) {
            if (FeedPagerSnapLinearLayoutManger.this.f44148c.getChildPosition(view) == 0 && !FeedPagerSnapLinearLayoutManger.this.f44149d && NullChecker.m82486a(FeedPagerSnapLinearLayoutManger.this.f44146a)) {
                FeedPagerSnapLinearLayoutManger.this.f44146a.call(0);
                FeedPagerSnapLinearLayoutManger.this.f44149d = true;
            }
        }
    }

    public FeedPagerSnapLinearLayoutManger(Context context) {
        super(context);
        this.f44150e = new C11540a();
        m67395g();
    }

    /* JADX INFO: renamed from: g */
    public final void m67395g() {
        this.f44147b = new C0615s();
    }

    /* JADX INFO: renamed from: h */
    public void m67396h(y20<Integer> y20Var) {
        this.f44146a = y20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f44147b.mo3858b(recyclerView);
        this.f44148c = recyclerView;
        recyclerView.addOnChildAttachStateChangeListener(this.f44150e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        View viewMo3812h = this.f44147b.mo3812h(this);
        if (NullChecker.m82486a(viewMo3812h)) {
            int position = getPosition(viewMo3812h);
            if (NullChecker.m82486a(this.f44146a)) {
                this.f44146a.call(Integer.valueOf(position));
            }
        }
    }

    public FeedPagerSnapLinearLayoutManger(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f44150e = new C11540a();
        m67395g();
    }
}
