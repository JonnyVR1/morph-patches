package p153l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersItem;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.IntlFakeLikersItem;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.IntlFakeTurboItem;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes12.dex */
public class b0g extends C0607k.e {

    /* JADX INFO: renamed from: f */
    public static float f74269f = 1.5f;

    /* JADX INFO: renamed from: d */
    public InterfaceC15881a f74270d;

    /* JADX INFO: renamed from: e */
    public boolean f74271e = false;

    /* JADX INFO: renamed from: l.b0g$a */
    public interface InterfaceC15881a {
        /* JADX INFO: renamed from: a */
        void mo101304a(View view, User user, int i, boolean z, int i2);
    }

    public b0g(InterfaceC15881a interfaceC15881a) {
        this.f74270d = interfaceC15881a;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: B */
    public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        View view = abstractC0569e0.itemView;
        if (view instanceof FakeLikersItem) {
            this.f74270d.mo101304a(view, ((FakeLikersItem) view).getUser(), i, this.f74271e, abstractC0569e0.getAdapterPosition());
        } else if (view instanceof IntlFakeLikersItem) {
            this.f74270d.mo101304a(view, ((IntlFakeLikersItem) view).getUser(), i, this.f74271e, abstractC0569e0.getAdapterPosition());
        } else if (view instanceof IntlFakeTurboItem) {
            this.f74270d.mo101304a(view, null, i, this.f74271e, abstractC0569e0.getAdapterPosition());
        }
    }

    /* JADX INFO: renamed from: C */
    public float m101303C(int i, float f) {
        float f2 = i / f74269f;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / f2, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: k */
    public int mo3784k(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            View view = abstractC0569e0.itemView;
            if ((view instanceof FakeLikersItem) || (view instanceof IntlFakeLikersItem) || (view instanceof IntlFakeTurboItem)) {
                return C0607k.e.m3772t(15, 15);
            }
        }
        if ((layoutManager instanceof LinearLayoutManager) && (abstractC0569e0.itemView instanceof FakeLikersItem)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0607k.e.m3772t(12, 3) : C0607k.e.m3772t(3, 12);
        }
        View view2 = abstractC0569e0.itemView;
        if (view2 instanceof PicksHeaderView) {
            view2.setElevation(10.0f);
        }
        return C0607k.e.m3772t(0, 0);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: m */
    public float mo3786m(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return 0.25f;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: q */
    public boolean mo3790q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: r */
    public boolean mo3791r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: u */
    public void mo3792u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0, float f, float f2, int i, boolean z) {
        if (i == 1) {
            float fM101303C = m101303C(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM101303C = -fM101303C;
            }
            if (fM101303C > 0.0f) {
                if (z) {
                    this.f74271e = true;
                }
            } else if (z) {
                this.f74271e = false;
            }
        }
        super.mo3792u(canvas, recyclerView, abstractC0569e0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3796y(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1) {
        return false;
    }
}
