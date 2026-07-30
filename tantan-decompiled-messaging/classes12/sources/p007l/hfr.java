package p007l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.ui.intllikedusers.IntlILikeUserItemView;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hfr extends k.e {

    /* JADX INFO: renamed from: d */
    public InterfaceC2393b f8694d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2392a f8695e;

    /* JADX INFO: renamed from: f */
    public boolean f8696f = false;

    /* JADX INFO: renamed from: g */
    public boolean f8697g = false;

    /* JADX INFO: renamed from: h */
    public boolean f8698h = false;

    /* JADX INFO: renamed from: l.hfr$a */
    public interface InterfaceC2392a {
        /* JADX INFO: renamed from: T */
        void m10620T(LikeUser likeUser, boolean z);

        /* JADX INFO: renamed from: c */
        void m10621c(boolean z);
    }

    /* JADX INFO: renamed from: l.hfr$b */
    public interface InterfaceC2393b {
        /* JADX INFO: renamed from: D */
        void mo8876D(LikedUser likedUser, boolean z);
    }

    public hfr(InterfaceC2393b interfaceC2393b) {
        this.f8694d = interfaceC2393b;
    }

    /* JADX INFO: renamed from: A */
    public void m10609A(RecyclerView.d0 d0Var, int i) {
        super.A(d0Var, i);
    }

    /* JADX INFO: renamed from: B */
    public void m10610B(RecyclerView.d0 d0Var, int i) {
        IntlILikeUserItemView intlILikeUserItemView = d0Var.itemView;
        if (intlILikeUserItemView instanceof LikedUserItemView) {
            this.f8694d.mo8876D(((LikedUserItemView) intlILikeUserItemView).f96o, this.f8697g);
        } else if (intlILikeUserItemView instanceof IntlILikeUserItemView) {
            if (this.f8696f) {
                this.f8695e.m10620T(intlILikeUserItemView.j, this.f8697g);
            } else {
                this.f8695e.m10621c(this.f8697g);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public float m10611C(int i, float f) {
        float fB9 = i / CoreModule.P().a().B9();
        if (fB9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fB9, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public void m10612c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        this.f8696f = false;
        this.f8697g = false;
        this.f8698h = false;
        super.c(recyclerView, d0Var);
    }

    /* JADX INFO: renamed from: k */
    public int m10613k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        View view = d0Var.itemView;
        if ((view instanceof LikedUserItemView) && (layoutManager instanceof GridLayoutManager)) {
            return k.e.t(15, 15);
        }
        if ((view instanceof LikedUserItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return layoutManager.getOrientation() == 0 ? k.e.t(12, 3) : k.e.t(3, 12);
        }
        if ((view instanceof IntlILikeUserItemView) && (layoutManager instanceof GridLayoutManager)) {
            return k.e.t(15, 15);
        }
        if ((view instanceof IntlILikeUserItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return layoutManager.getOrientation() == 0 ? k.e.t(12, 3) : k.e.t(3, 12);
        }
        return k.e.t(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public float m10614l(float f) {
        return 2.1474836E9f;
    }

    /* JADX INFO: renamed from: m */
    public float m10615m(RecyclerView.d0 d0Var) {
        return 0.25f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m10616q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m10617r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m10618u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1 && (d0Var.itemView instanceof LikedUserItemView)) {
            float width = recyclerView.getWidth() * m10615m(d0Var);
            float fM10611C = m10611C(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM10611C = -fM10611C;
            }
            LikedUserItemView likedUserItemView = (LikedUserItemView) d0Var.itemView;
            if (fM10611C > 0.0f) {
                if (z) {
                    this.f8697g = true;
                    this.f8698h = false;
                }
            } else if (fM10611C < 0.0f) {
                likedUserItemView.f90i.setVisibility(4);
                if (z) {
                    this.f8697g = false;
                    this.f8698h = true;
                }
            } else {
                likedUserItemView.f90i.setVisibility(4);
                if (z) {
                    this.f8697g = false;
                    this.f8698h = false;
                }
            }
            if (z) {
                this.f8696f = Math.abs(f) > width;
            }
        } else if (i == 1 && (d0Var.itemView instanceof IntlILikeUserItemView)) {
            float width2 = recyclerView.getWidth() * m10615m(d0Var);
            float fM10611C2 = m10611C(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM10611C2 = -fM10611C2;
            }
            if (fM10611C2 > 0.0f) {
                if (z) {
                    this.f8697g = true;
                    this.f8698h = false;
                }
            } else if (fM10611C2 < 0.0f) {
                if (z) {
                    this.f8697g = false;
                    this.f8698h = true;
                }
            } else if (z) {
                this.f8697g = false;
                this.f8698h = false;
            }
            if (z) {
                this.f8696f = Math.abs(f) > width2;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).F(d0Var.itemView);
        }
        super.u(canvas, recyclerView, d0Var, f, f2, i, z);
    }

    /* JADX INFO: renamed from: y */
    public boolean m10619y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        return false;
    }

    public hfr(InterfaceC2392a interfaceC2392a) {
        this.f8695e = interfaceC2392a;
    }
}
