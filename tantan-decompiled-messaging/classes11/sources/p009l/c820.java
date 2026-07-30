package p009l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import v.VImage;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class c820 extends k.e {

    /* JADX INFO: renamed from: d */
    public InterfaceC0802a f10455d;

    /* JADX INFO: renamed from: e */
    public boolean f10456e = false;

    /* JADX INFO: renamed from: f */
    public boolean f10457f = false;

    /* JADX INFO: renamed from: g */
    public boolean f10458g = false;

    /* JADX INFO: renamed from: l.c820$a */
    public interface InterfaceC0802a {
        /* JADX INFO: renamed from: b */
        void mo12415b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo12416c(boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo12417n();
    }

    public c820(InterfaceC0802a interfaceC0802a) {
        this.f10455d = interfaceC0802a;
    }

    /* JADX INFO: renamed from: A */
    public void m12404A(RecyclerView.d0 d0Var, int i) {
        super.A(d0Var, i);
    }

    /* JADX INFO: renamed from: B */
    public void m12405B(RecyclerView.d0 d0Var, int i) {
        if (this.f10456e) {
            View view = d0Var.itemView;
            if ((view instanceof NearbyItemView) && NullChecker.a(((NearbyItemView) view).mUser)) {
                this.f10455d.mo12415b(((NearbyItemView) d0Var.itemView).mUser, this.f10457f);
                return;
            }
        }
        this.f10455d.mo12416c(this.f10457f);
    }

    /* JADX INFO: renamed from: C */
    public float m12406C(int i, float f) {
        float fB9 = i / CoreModule.P().a().B9();
        if (fB9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fB9, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public void m12407c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        this.f10456e = false;
        this.f10457f = false;
        this.f10458g = false;
        super.c(recyclerView, d0Var);
    }

    /* JADX INFO: renamed from: k */
    public int m12408k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        return ((d0Var.itemView instanceof NearbyItemView) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) ? k.e.t(15, 15) : k.e.t(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public float m12409l(float f) {
        return 2.1474836E9f;
    }

    /* JADX INFO: renamed from: m */
    public float m12410m(RecyclerView.d0 d0Var) {
        return 0.25f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m12411q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m12412r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m12413u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1 && (d0Var.itemView instanceof NearbyItemView)) {
            float width = recyclerView.getWidth() * m12410m(d0Var);
            float fM12406C = m12406C(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM12406C = -fM12406C;
            }
            if (z) {
                if (fM12406C > 0.0f) {
                    this.f10457f = true;
                    this.f10458g = false;
                } else if (fM12406C < 0.0f) {
                    this.f10457f = false;
                    this.f10458g = true;
                } else {
                    this.f10457f = false;
                    this.f10458g = false;
                }
            }
            if (this.f10455d.mo12417n()) {
                this.f10456e = z;
            } else if (z) {
                this.f10456e = Math.abs(f) > width;
            }
            if (!this.f10455d.mo12417n()) {
                NearbyItemView nearbyItemView = (NearbyItemView) d0Var.itemView;
                VImage vImage = nearbyItemView._like;
                VImage vImage2 = nearbyItemView._dislike;
                if (fM12406C > 0.0f) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(8);
                    vImage.setAlpha(fM12406C);
                } else if (fM12406C < 0.0f) {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM12406C);
                } else {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(8);
                }
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).F(d0Var.itemView);
        }
        super.u(canvas, recyclerView, d0Var, f, f2, i, z);
    }

    /* JADX INFO: renamed from: y */
    public boolean m12414y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        return false;
    }
}
