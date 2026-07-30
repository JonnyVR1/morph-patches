package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import java.util.List;
import p149l.e3f0;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class SignInCycleView extends LiveFadeRecyclerView {

    /* JADX INFO: renamed from: f */
    public C12769a f49304f;

    /* JADX INFO: renamed from: g */
    public e3f0 f49305g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutManager f49306h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView$a */
    public class ViewOnLayoutChangeListenerC12772a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveSignInCycleTask f49307a;

        public ViewOnLayoutChangeListenerC12772a(BLiveSignInCycleTask bLiveSignInCycleTask) {
            this.f49307a = bLiveSignInCycleTask;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m73215b(int i) {
            SignInCycleView.this.scrollToPosition(i);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SignInCycleView.this.removeOnLayoutChangeListener(this);
            int iFindLastCompletelyVisibleItemPosition = SignInCycleView.this.f49306h.findLastCompletelyVisibleItemPosition();
            SignInCycleView signInCycleView = SignInCycleView.this;
            BLiveSignInCycleTask bLiveSignInCycleTask = this.f49307a;
            final int iM73212L = signInCycleView.m73212L(bLiveSignInCycleTask.tasks, bLiveSignInCycleTask.todaySignInStatus);
            if (iFindLastCompletelyVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition >= iM73212L) {
                return;
            }
            SignInCycleView.this.post(new Runnable() { // from class: l.j3f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116068a.m73215b(iM73212L);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView$b */
    public static class C12773b extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemViewType = recyclerView.getAdapter().getItemViewType(childAdapterPosition);
            if (childAdapterPosition == 0) {
                if (itemViewType == 2) {
                    rect.set(-t100.f167261j, 0, 0, 0);
                    return;
                }
                return;
            }
            int itemViewType2 = recyclerView.getAdapter().getItemViewType(childAdapterPosition - 1);
            int iM186890d = childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1 ? t100.m186890d(25.0f) : 0;
            if (itemViewType != 1 && itemViewType != 3) {
                rect.set(-t100.f167261j, 0, iM186890d, 0);
            } else if (itemViewType2 == 1 || itemViewType2 == 3) {
                rect.set(t100.f167259h, 0, iM186890d, 0);
            } else {
                rect.set(-t100.f167261j, 0, iM186890d, 0);
            }
        }

        public C12773b() {
        }
    }

    public SignInCycleView(@NonNull Context context) {
        super(context);
        RecyclerView.C0578p c0578p = new RecyclerView.C0578p(-1, t100.m186890d(155.0f));
        int i = t100.f167260i;
        c0578p.setMargins(i, 0, i, 0);
        setLayoutParams(c0578p);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.f49306h = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        setHasFixedSize(true);
        setOverScrollMode(2);
        setFadingEdgeLength(t100.f167266o);
        setHorizontalFadingEdgeEnabled(true);
        m68726H();
        addItemDecoration(new C12773b());
        e3f0 e3f0Var = new e3f0();
        this.f49305g = e3f0Var;
        setAdapter(e3f0Var);
    }

    /* JADX INFO: renamed from: K */
    public void m73211K(C12769a c12769a) {
        this.f49304f = c12769a;
        this.f49305g.m114588F(c12769a);
    }

    /* JADX INFO: renamed from: L */
    public final int m73212L(List<BLiveSignInTask> list, boolean z) {
        if (!vwb.m200296J(list) && !z) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).finished) {
                    if (i == 0) {
                        return 0;
                    }
                    if (list.get(i - 1).finished) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public void m73213M(BLiveSignInCycleTask bLiveSignInCycleTask) {
        this.f49305g.m114590H(bLiveSignInCycleTask);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC12772a(bLiveSignInCycleTask));
    }
}
