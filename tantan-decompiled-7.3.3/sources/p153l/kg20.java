package p153l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyItemView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class kg20 extends C0607k.e {

    /* JADX INFO: renamed from: d */
    public InterfaceC18162a f126566d;

    /* JADX INFO: renamed from: e */
    public boolean f126567e = false;

    /* JADX INFO: renamed from: f */
    public boolean f126568f = false;

    /* JADX INFO: renamed from: g */
    public boolean f126569g = false;

    /* JADX INFO: renamed from: l.kg20$a */
    public interface InterfaceC18162a {
        /* JADX INFO: renamed from: b */
        void mo149732b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo149733c(boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo149734n();
    }

    public kg20(InterfaceC18162a interfaceC18162a) {
        this.f126566d = interfaceC18162a;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: A */
    public void mo3773A(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.mo3773A(abstractC0569e0, i);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: B */
    public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        if (this.f126567e) {
            View view = abstractC0569e0.itemView;
            if ((view instanceof NearbyItemView) && NullChecker.m82486a(((NearbyItemView) view).mUser)) {
                this.f126566d.mo149732b(((NearbyItemView) abstractC0569e0.itemView).mUser, this.f126568f);
                return;
            }
        }
        this.f126566d.mo149733c(this.f126568f);
    }

    /* JADX INFO: renamed from: C */
    public float m149731C(int i, float f) {
        float fMo34292B9 = i / CoreModule.m30933P().m143405a().mo34292B9();
        if (fMo34292B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo34292B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: c */
    public void mo3777c(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f126567e = false;
        this.f126568f = false;
        this.f126569g = false;
        super.mo3777c(recyclerView, abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: k */
    public int mo3784k(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return ((abstractC0569e0.itemView instanceof NearbyItemView) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) ? C0607k.e.m3772t(15, 15) : C0607k.e.m3772t(0, 0);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: l */
    public float mo3785l(float f) {
        return 2.1474836E9f;
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
        if (i == 1 && (abstractC0569e0.itemView instanceof NearbyItemView)) {
            float width = recyclerView.getWidth() * mo3786m(abstractC0569e0);
            float fM149731C = m149731C(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM149731C = -fM149731C;
            }
            if (z) {
                if (fM149731C > 0.0f) {
                    this.f126568f = true;
                    this.f126569g = false;
                } else if (fM149731C < 0.0f) {
                    this.f126568f = false;
                    this.f126569g = true;
                } else {
                    this.f126568f = false;
                    this.f126569g = false;
                }
            }
            if (this.f126566d.mo149734n()) {
                this.f126567e = z;
            } else if (z) {
                this.f126567e = Math.abs(f) > width;
            }
            if (!this.f126566d.mo149734n()) {
                NearbyItemView nearbyItemView = (NearbyItemView) abstractC0569e0.itemView;
                VImage vImage = nearbyItemView._like;
                VImage vImage2 = nearbyItemView._dislike;
                if (fM149731C > 0.0f) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(8);
                    vImage.setAlpha(fM149731C);
                } else if (fM149731C < 0.0f) {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM149731C);
                } else {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(8);
                }
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m224435F(abstractC0569e0.itemView);
        }
        super.mo3792u(canvas, recyclerView, abstractC0569e0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3796y(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1) {
        return false;
    }
}
