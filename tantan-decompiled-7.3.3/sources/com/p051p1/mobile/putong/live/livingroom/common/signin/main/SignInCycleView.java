package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import java.util.List;
import p153l.jyb;
import p153l.lbf0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class SignInCycleView extends LiveFadeRecyclerView {

    /* JADX INFO: renamed from: f */
    public C12932a f50152f;

    /* JADX INFO: renamed from: g */
    public lbf0 f50153g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutManager f50154h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView$a */
    public class ViewOnLayoutChangeListenerC12935a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveSignInCycleTask f50155a;

        public ViewOnLayoutChangeListenerC12935a(BLiveSignInCycleTask bLiveSignInCycleTask) {
            this.f50155a = bLiveSignInCycleTask;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m74398b(int i) {
            SignInCycleView.this.scrollToPosition(i);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SignInCycleView.this.removeOnLayoutChangeListener(this);
            int iFindLastCompletelyVisibleItemPosition = SignInCycleView.this.f50154h.findLastCompletelyVisibleItemPosition();
            SignInCycleView signInCycleView = SignInCycleView.this;
            BLiveSignInCycleTask bLiveSignInCycleTask = this.f50155a;
            final int iM74395L = signInCycleView.m74395L(bLiveSignInCycleTask.tasks, bLiveSignInCycleTask.todaySignInStatus);
            if (iFindLastCompletelyVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition >= iM74395L) {
                return;
            }
            SignInCycleView.this.post(new Runnable() { // from class: l.qbf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156472a.m74398b(iM74395L);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView$b */
    public static class C12936b extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemViewType = recyclerView.getAdapter().getItemViewType(childAdapterPosition);
            if (childAdapterPosition == 0) {
                if (itemViewType == 2) {
                    rect.set(-qa00.f156323j, 0, 0, 0);
                    return;
                }
                return;
            }
            int itemViewType2 = recyclerView.getAdapter().getItemViewType(childAdapterPosition - 1);
            int iM175859d = childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1 ? qa00.m175859d(25.0f) : 0;
            if (itemViewType != 1 && itemViewType != 3) {
                rect.set(-qa00.f156323j, 0, iM175859d, 0);
            } else if (itemViewType2 == 1 || itemViewType2 == 3) {
                rect.set(qa00.f156321h, 0, iM175859d, 0);
            } else {
                rect.set(-qa00.f156323j, 0, iM175859d, 0);
            }
        }

        public C12936b() {
        }
    }

    public SignInCycleView(@NonNull Context context) {
        super(context);
        RecyclerView.C0580p c0580p = new RecyclerView.C0580p(-1, qa00.m175859d(155.0f));
        int i = qa00.f156322i;
        c0580p.setMargins(i, 0, i, 0);
        setLayoutParams(c0580p);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.f50154h = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        setHasFixedSize(true);
        setOverScrollMode(2);
        setFadingEdgeLength(qa00.f156328o);
        setHorizontalFadingEdgeEnabled(true);
        m69909H();
        addItemDecoration(new C12936b());
        lbf0 lbf0Var = new lbf0();
        this.f50153g = lbf0Var;
        setAdapter(lbf0Var);
    }

    /* JADX INFO: renamed from: K */
    public void m74394K(C12932a c12932a) {
        this.f50152f = c12932a;
        this.f50153g.m153577F(c12932a);
    }

    /* JADX INFO: renamed from: L */
    public final int m74395L(List<BLiveSignInTask> list, boolean z) {
        if (!jyb.m147479J(list) && !z) {
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
    public void m74396M(BLiveSignInCycleTask bLiveSignInCycleTask) {
        this.f50153g.m153579H(bLiveSignInCycleTask);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC12935a(bLiveSignInCycleTask));
    }
}
