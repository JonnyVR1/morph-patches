package com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0615s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVideoPagerSnapLinearLayoutManger extends LinearLayoutManager implements RecyclerView.InterfaceC0581q {

    /* JADX INFO: renamed from: a */
    public int f45855a;

    /* JADX INFO: renamed from: b */
    public C0615s f45856b;

    /* JADX INFO: renamed from: c */
    public InterfaceC12657a f45857c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveVideoPagerSnapLinearLayoutManger$a */
    public interface InterfaceC12657a {
        /* JADX INFO: renamed from: a */
        void mo70243a(boolean z, int i);

        /* JADX INFO: renamed from: b */
        void mo70244b(int i);

        void onPageSelected(int i);
    }

    public LiveVideoPagerSnapLinearLayoutManger(Context context, int i, boolean z) {
        super(context, i, z);
        this.f45856b = new C0615s();
    }

    /* JADX INFO: renamed from: a */
    public void m70242a(InterfaceC12657a interfaceC12657a) {
        this.f45857c = interfaceC12657a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
    /* JADX INFO: renamed from: b */
    public void mo3422b(@NonNull View view) {
        try {
            int i = this.f45855a;
            InterfaceC12657a interfaceC12657a = this.f45857c;
            if (i >= 0) {
                if (NullChecker.m82486a(interfaceC12657a)) {
                    this.f45857c.mo70243a(true, getPosition(view));
                }
            } else if (NullChecker.m82486a(interfaceC12657a)) {
                this.f45857c.mo70243a(false, getPosition(view));
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
    /* JADX INFO: renamed from: d */
    public void mo3423d(@NonNull View view) {
        if (this.f45855a == 0 && NullChecker.m82486a(this.f45857c)) {
            this.f45857c.onPageSelected(getPosition(view));
        } else {
            this.f45857c.mo70244b(getPosition(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        recyclerView.addOnChildAttachStateChangeListener(this);
        this.f45856b.mo3858b(recyclerView);
        super.onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            View viewMo3812h = this.f45856b.mo3812h(this);
            if (viewMo3812h == null) {
                return;
            }
            int position = getPosition(viewMo3812h);
            if (NullChecker.m82486a(this.f45857c)) {
                this.f45857c.onPageSelected(position);
            }
        }
        super.onScrollStateChanged(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        this.f45855a = i;
        return super.scrollVerticallyBy(i, c0586v, c0561a0);
    }
}
