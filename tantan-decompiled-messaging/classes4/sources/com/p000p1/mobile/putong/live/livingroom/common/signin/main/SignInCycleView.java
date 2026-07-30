package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import java.util.List;
import l.t100;
import l.vwb;
import p002l.e3f0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInCycleView extends LiveFadeRecyclerView {

    /* JADX INFO: renamed from: f */
    public C0358a f5346f;

    /* JADX INFO: renamed from: g */
    public e3f0 f5347g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutManager f5348h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView$a */
    public class ViewOnLayoutChangeListenerC0361a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveSignInCycleTask f5349a;

        public ViewOnLayoutChangeListenerC0361a(BLiveSignInCycleTask bLiveSignInCycleTask) {
            this.f5349a = bLiveSignInCycleTask;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m6744b(int i) {
            SignInCycleView.this.scrollToPosition(i);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SignInCycleView.this.removeOnLayoutChangeListener(this);
            int iFindLastCompletelyVisibleItemPosition = SignInCycleView.this.f5348h.findLastCompletelyVisibleItemPosition();
            SignInCycleView signInCycleView = SignInCycleView.this;
            BLiveSignInCycleTask bLiveSignInCycleTask = this.f5349a;
            final int iM6741L = signInCycleView.m6741L(bLiveSignInCycleTask.tasks, bLiveSignInCycleTask.todaySignInStatus);
            if (iFindLastCompletelyVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition >= iM6741L) {
                return;
            }
            SignInCycleView.this.post(new Runnable() { // from class: l.j3f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13546a.m6744b(iM6741L);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView$b */
    public static class C0362b extends RecyclerView.n {
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemViewType = recyclerView.getAdapter().getItemViewType(childAdapterPosition);
            if (childAdapterPosition == 0) {
                if (itemViewType == 2) {
                    rect.set(-t100.j, 0, 0, 0);
                    return;
                }
                return;
            }
            int itemViewType2 = recyclerView.getAdapter().getItemViewType(childAdapterPosition - 1);
            int iD = childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1 ? t100.d(25.0f) : 0;
            if (itemViewType != 1 && itemViewType != 3) {
                rect.set(-t100.j, 0, iD, 0);
            } else if (itemViewType2 == 1 || itemViewType2 == 3) {
                rect.set(t100.h, 0, iD, 0);
            } else {
                rect.set(-t100.j, 0, iD, 0);
            }
        }

        public C0362b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignInCycleView(@NonNull Context context) {
        super(context);
        RecyclerView.p pVar = new RecyclerView.p(-1, t100.d(155.0f));
        int i = t100.i;
        pVar.setMargins(i, 0, i, 0);
        setLayoutParams(pVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.f5348h = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        setHasFixedSize(true);
        setOverScrollMode(2);
        setFadingEdgeLength(t100.o);
        setHorizontalFadingEdgeEnabled(true);
        H();
        addItemDecoration(new C0362b());
        e3f0 e3f0Var = new e3f0();
        this.f5347g = e3f0Var;
        setAdapter(e3f0Var);
    }

    /* JADX INFO: renamed from: K */
    public void m6740K(C0358a c0358a) {
        this.f5346f = c0358a;
        this.f5347g.m12162F(c0358a);
    }

    /* JADX INFO: renamed from: L */
    public final int m6741L(List<BLiveSignInTask> list, boolean z) {
        if (!vwb.J(list) && !z) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public void m6742M(BLiveSignInCycleTask bLiveSignInCycleTask) {
        this.f5347g.m12164H(bLiveSignInCycleTask);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0361a(bLiveSignInCycleTask));
    }
}
