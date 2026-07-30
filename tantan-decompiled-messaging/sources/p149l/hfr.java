package p149l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlILikeUserItemView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserItemView;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class hfr extends C0605k.e {

    /* JADX INFO: renamed from: d */
    public InterfaceC17302b f107503d;

    /* JADX INFO: renamed from: e */
    public InterfaceC17301a f107504e;

    /* JADX INFO: renamed from: f */
    public boolean f107505f = false;

    /* JADX INFO: renamed from: g */
    public boolean f107506g = false;

    /* JADX INFO: renamed from: h */
    public boolean f107507h = false;

    /* JADX INFO: renamed from: l.hfr$a */
    public interface InterfaceC17301a {
        /* JADX INFO: renamed from: T */
        void mo130779T(LikeUser likeUser, boolean z);

        /* JADX INFO: renamed from: c */
        void mo130780c(boolean z);
    }

    /* JADX INFO: renamed from: l.hfr$b */
    public interface InterfaceC17302b {
        /* JADX INFO: renamed from: D */
        void mo101698D(LikedUser likedUser, boolean z);
    }

    public hfr(InterfaceC17302b interfaceC17302b) {
        this.f107503d = interfaceC17302b;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: A */
    public void mo3772A(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.mo3772A(abstractC0566d0, i);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: B */
    public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        View view = abstractC0566d0.itemView;
        if (view instanceof LikedUserItemView) {
            this.f107503d.mo101698D(((LikedUserItemView) view).f29987o, this.f107506g);
        } else if (view instanceof IntlILikeUserItemView) {
            if (this.f107505f) {
                this.f107504e.mo130779T(((IntlILikeUserItemView) view).f29838j, this.f107506g);
            } else {
                this.f107504e.mo130780c(this.f107506g);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public float m130778C(int i, float f) {
        float fMo33289B9 = i / CoreModule.m29935P().m94651a().mo33289B9();
        if (fMo33289B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo33289B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: c */
    public void mo3776c(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f107505f = false;
        this.f107506g = false;
        this.f107507h = false;
        super.mo3776c(recyclerView, abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        View view = abstractC0566d0.itemView;
        if ((view instanceof LikedUserItemView) && (layoutManager instanceof GridLayoutManager)) {
            return C0605k.e.m3771t(15, 15);
        }
        if ((view instanceof LikedUserItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0605k.e.m3771t(12, 3) : C0605k.e.m3771t(3, 12);
        }
        if ((view instanceof IntlILikeUserItemView) && (layoutManager instanceof GridLayoutManager)) {
            return C0605k.e.m3771t(15, 15);
        }
        if ((view instanceof IntlILikeUserItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0605k.e.m3771t(12, 3) : C0605k.e.m3771t(3, 12);
        }
        return C0605k.e.m3771t(0, 0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: l */
    public float mo3784l(float f) {
        return 2.1474836E9f;
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
        if (i == 1 && (abstractC0566d0.itemView instanceof LikedUserItemView)) {
            float width = recyclerView.getWidth() * mo3785m(abstractC0566d0);
            float fM130778C = m130778C(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM130778C = -fM130778C;
            }
            LikedUserItemView likedUserItemView = (LikedUserItemView) abstractC0566d0.itemView;
            if (fM130778C > 0.0f) {
                if (z) {
                    this.f107506g = true;
                    this.f107507h = false;
                }
            } else if (fM130778C < 0.0f) {
                likedUserItemView.f29981i.setVisibility(4);
                if (z) {
                    this.f107506g = false;
                    this.f107507h = true;
                }
            } else {
                likedUserItemView.f29981i.setVisibility(4);
                if (z) {
                    this.f107506g = false;
                    this.f107507h = false;
                }
            }
            if (z) {
                this.f107505f = Math.abs(f) > width;
            }
        } else if (i == 1 && (abstractC0566d0.itemView instanceof IntlILikeUserItemView)) {
            float width2 = recyclerView.getWidth() * mo3785m(abstractC0566d0);
            float fM130778C2 = m130778C(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM130778C2 = -fM130778C2;
            }
            if (fM130778C2 > 0.0f) {
                if (z) {
                    this.f107506g = true;
                    this.f107507h = false;
                }
            } else if (fM130778C2 < 0.0f) {
                if (z) {
                    this.f107506g = false;
                    this.f107507h = true;
                }
            } else if (z) {
                this.f107506g = false;
                this.f107507h = false;
            }
            if (z) {
                this.f107505f = Math.abs(f) > width2;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m223189F(abstractC0566d0.itemView);
        }
        super.mo3791u(canvas, recyclerView, abstractC0566d0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3795y(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1) {
        return false;
    }

    public hfr(InterfaceC17301a interfaceC17301a) {
        this.f107504e = interfaceC17301a;
    }
}
