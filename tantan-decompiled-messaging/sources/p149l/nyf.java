package p149l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersItem;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.IntlFakeLikersItem;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.IntlFakeTurboItem;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes9.dex */
public class nyf extends C0605k.e {

    /* JADX INFO: renamed from: f */
    public static float f141104f = 1.5f;

    /* JADX INFO: renamed from: d */
    public InterfaceC18801a f141105d;

    /* JADX INFO: renamed from: e */
    public boolean f141106e = false;

    /* JADX INFO: renamed from: l.nyf$a */
    public interface InterfaceC18801a {
        /* JADX INFO: renamed from: a */
        void mo119038a(View view, User user, int i, boolean z, int i2);
    }

    public nyf(InterfaceC18801a interfaceC18801a) {
        this.f141105d = interfaceC18801a;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: B */
    public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        View view = abstractC0566d0.itemView;
        if (view instanceof FakeLikersItem) {
            this.f141105d.mo119038a(view, ((FakeLikersItem) view).getUser(), i, this.f141106e, abstractC0566d0.getAdapterPosition());
        } else if (view instanceof IntlFakeLikersItem) {
            this.f141105d.mo119038a(view, ((IntlFakeLikersItem) view).getUser(), i, this.f141106e, abstractC0566d0.getAdapterPosition());
        } else if (view instanceof IntlFakeTurboItem) {
            this.f141105d.mo119038a(view, null, i, this.f141106e, abstractC0566d0.getAdapterPosition());
        }
    }

    /* JADX INFO: renamed from: C */
    public float m162000C(int i, float f) {
        float f2 = i / f141104f;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / f2, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            View view = abstractC0566d0.itemView;
            if ((view instanceof FakeLikersItem) || (view instanceof IntlFakeLikersItem) || (view instanceof IntlFakeTurboItem)) {
                return C0605k.e.m3771t(15, 15);
            }
        }
        if ((layoutManager instanceof LinearLayoutManager) && (abstractC0566d0.itemView instanceof FakeLikersItem)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0605k.e.m3771t(12, 3) : C0605k.e.m3771t(3, 12);
        }
        View view2 = abstractC0566d0.itemView;
        if (view2 instanceof PicksHeaderView) {
            view2.setElevation(10.0f);
        }
        return C0605k.e.m3771t(0, 0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: m */
    public float mo3785m(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return 0.25f;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: q */
    public boolean mo3789q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: r */
    public boolean mo3790r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: u */
    public void mo3791u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, float f, float f2, int i, boolean z) {
        if (i == 1) {
            float fM162000C = m162000C(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM162000C = -fM162000C;
            }
            if (fM162000C > 0.0f) {
                if (z) {
                    this.f141106e = true;
                }
            } else if (z) {
                this.f141106e = false;
            }
        }
        super.mo3791u(canvas, recyclerView, abstractC0566d0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3795y(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1) {
        return false;
    }
}
