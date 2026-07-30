package com.p046p1.mobile.putong.feed.newui.videoflow.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.C0613s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPagerSnapLinearLayoutManger extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public e30<Integer> f43298a;

    /* JADX INFO: renamed from: b */
    public C0613s f43299b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f43300c;

    /* JADX INFO: renamed from: d */
    public boolean f43301d;

    /* JADX INFO: renamed from: e */
    public RecyclerView.InterfaceC0579q f43302e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.videoflow.util.FeedPagerSnapLinearLayoutManger$a */
    public class C11377a implements RecyclerView.InterfaceC0579q {
        public C11377a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
        /* JADX INFO: renamed from: b */
        public void mo3413b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
        /* JADX INFO: renamed from: d */
        public void mo3414d(View view) {
            if (FeedPagerSnapLinearLayoutManger.this.f43300c.getChildPosition(view) == 0 && !FeedPagerSnapLinearLayoutManger.this.f43301d && NullChecker.m81303a(FeedPagerSnapLinearLayoutManger.this.f43298a)) {
                FeedPagerSnapLinearLayoutManger.this.f43298a.call(0);
                FeedPagerSnapLinearLayoutManger.this.f43301d = true;
            }
        }
    }

    public FeedPagerSnapLinearLayoutManger(Context context) {
        super(context);
        this.f43302e = new C11377a();
        m66212g();
    }

    /* JADX INFO: renamed from: g */
    public final void m66212g() {
        this.f43299b = new C0613s();
    }

    /* JADX INFO: renamed from: h */
    public void m66213h(e30<Integer> e30Var) {
        this.f43298a = e30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f43299b.mo3857b(recyclerView);
        this.f43300c = recyclerView;
        recyclerView.addOnChildAttachStateChangeListener(this.f43302e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        View viewMo3811h = this.f43299b.mo3811h(this);
        if (NullChecker.m81303a(viewMo3811h)) {
            int position = getPosition(viewMo3811h);
            if (NullChecker.m81303a(this.f43298a)) {
                this.f43298a.call(Integer.valueOf(position));
            }
        }
    }

    public FeedPagerSnapLinearLayoutManger(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43302e = new C11377a();
        m66212g();
    }
}
