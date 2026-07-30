package com.p046p1.mobile.putong.live.external.internal.live.square.fragments.livevideo;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0613s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoPagerSnapLinearLayoutManger extends LinearLayoutManager implements RecyclerView.InterfaceC0579q {

    /* JADX INFO: renamed from: a */
    public int f45007a;

    /* JADX INFO: renamed from: b */
    public C0613s f45008b;

    /* JADX INFO: renamed from: c */
    public InterfaceC12494a f45009c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveVideoPagerSnapLinearLayoutManger$a */
    public interface InterfaceC12494a {
        /* JADX INFO: renamed from: a */
        void mo69060a(boolean z, int i);

        /* JADX INFO: renamed from: b */
        void mo69061b(int i);

        void onPageSelected(int i);
    }

    public LiveVideoPagerSnapLinearLayoutManger(Context context, int i, boolean z) {
        super(context, i, z);
        this.f45008b = new C0613s();
    }

    /* JADX INFO: renamed from: a */
    public void m69059a(InterfaceC12494a interfaceC12494a) {
        this.f45009c = interfaceC12494a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
    /* JADX INFO: renamed from: b */
    public void mo3413b(@NonNull View view) {
        try {
            int i = this.f45007a;
            InterfaceC12494a interfaceC12494a = this.f45009c;
            if (i >= 0) {
                if (NullChecker.m81303a(interfaceC12494a)) {
                    this.f45009c.mo69060a(true, getPosition(view));
                }
            } else if (NullChecker.m81303a(interfaceC12494a)) {
                this.f45009c.mo69060a(false, getPosition(view));
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
    /* JADX INFO: renamed from: d */
    public void mo3414d(@NonNull View view) {
        if (this.f45007a == 0 && NullChecker.m81303a(this.f45009c)) {
            this.f45009c.onPageSelected(getPosition(view));
        } else {
            this.f45009c.mo69061b(getPosition(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        recyclerView.addOnChildAttachStateChangeListener(this);
        this.f45008b.mo3857b(recyclerView);
        super.onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            View viewMo3811h = this.f45008b.mo3811h(this);
            if (viewMo3811h == null) {
                return;
            }
            int position = getPosition(viewMo3811h);
            if (NullChecker.m81303a(this.f45009c)) {
                this.f45009c.onPageSelected(position);
            }
        }
        super.onScrollStateChanged(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        this.f45007a = i;
        return super.scrollVerticallyBy(i, c0584v, c0588z);
    }
}
