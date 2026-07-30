package p153l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlILikeUserItemView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserItemView;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class ihr extends C0607k.e {

    /* JADX INFO: renamed from: d */
    public InterfaceC17721b f114995d;

    /* JADX INFO: renamed from: e */
    public InterfaceC17720a f114996e;

    /* JADX INFO: renamed from: f */
    public boolean f114997f = false;

    /* JADX INFO: renamed from: g */
    public boolean f114998g = false;

    /* JADX INFO: renamed from: h */
    public boolean f114999h = false;

    /* JADX INFO: renamed from: l.ihr$a */
    public interface InterfaceC17720a {
        /* JADX INFO: renamed from: T */
        void mo140019T(LikeUser likeUser, boolean z);

        /* JADX INFO: renamed from: c */
        void mo140020c(boolean z);
    }

    /* JADX INFO: renamed from: l.ihr$b */
    public interface InterfaceC17721b {
        /* JADX INFO: renamed from: D */
        void mo109928D(LikedUser likedUser, boolean z);
    }

    public ihr(InterfaceC17721b interfaceC17721b) {
        this.f114995d = interfaceC17721b;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: A */
    public void mo3773A(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.mo3773A(abstractC0569e0, i);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: B */
    public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        View view = abstractC0569e0.itemView;
        if (view instanceof LikedUserItemView) {
            this.f114995d.mo109928D(((LikedUserItemView) view).f30835o, this.f114998g);
        } else if (view instanceof IntlILikeUserItemView) {
            if (this.f114997f) {
                this.f114996e.mo140019T(((IntlILikeUserItemView) view).f30686j, this.f114998g);
            } else {
                this.f114996e.mo140020c(this.f114998g);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public float m140018C(int i, float f) {
        float fMo34292B9 = i / CoreModule.m30933P().m143405a().mo34292B9();
        if (fMo34292B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo34292B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: c */
    public void mo3777c(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f114997f = false;
        this.f114998g = false;
        this.f114999h = false;
        super.mo3777c(recyclerView, abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: k */
    public int mo3784k(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        View view = abstractC0569e0.itemView;
        if ((view instanceof LikedUserItemView) && (layoutManager instanceof GridLayoutManager)) {
            return C0607k.e.m3772t(15, 15);
        }
        if ((view instanceof LikedUserItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0607k.e.m3772t(12, 3) : C0607k.e.m3772t(3, 12);
        }
        if ((view instanceof IntlILikeUserItemView) && (layoutManager instanceof GridLayoutManager)) {
            return C0607k.e.m3772t(15, 15);
        }
        if ((view instanceof IntlILikeUserItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0607k.e.m3772t(12, 3) : C0607k.e.m3772t(3, 12);
        }
        return C0607k.e.m3772t(0, 0);
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
        if (i == 1 && (abstractC0569e0.itemView instanceof LikedUserItemView)) {
            float width = recyclerView.getWidth() * mo3786m(abstractC0569e0);
            float fM140018C = m140018C(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM140018C = -fM140018C;
            }
            LikedUserItemView likedUserItemView = (LikedUserItemView) abstractC0569e0.itemView;
            if (fM140018C > 0.0f) {
                if (z) {
                    this.f114998g = true;
                    this.f114999h = false;
                }
            } else if (fM140018C < 0.0f) {
                likedUserItemView.f30829i.setVisibility(4);
                if (z) {
                    this.f114998g = false;
                    this.f114999h = true;
                }
            } else {
                likedUserItemView.f30829i.setVisibility(4);
                if (z) {
                    this.f114998g = false;
                    this.f114999h = false;
                }
            }
            if (z) {
                this.f114997f = Math.abs(f) > width;
            }
        } else if (i == 1 && (abstractC0569e0.itemView instanceof IntlILikeUserItemView)) {
            float width2 = recyclerView.getWidth() * mo3786m(abstractC0569e0);
            float fM140018C2 = m140018C(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM140018C2 = -fM140018C2;
            }
            if (fM140018C2 > 0.0f) {
                if (z) {
                    this.f114998g = true;
                    this.f114999h = false;
                }
            } else if (fM140018C2 < 0.0f) {
                if (z) {
                    this.f114998g = false;
                    this.f114999h = true;
                }
            } else if (z) {
                this.f114998g = false;
                this.f114999h = false;
            }
            if (z) {
                this.f114997f = Math.abs(f) > width2;
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

    public ihr(InterfaceC17720a interfaceC17720a) {
        this.f114996e = interfaceC17720a;
    }
}
