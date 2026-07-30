package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import v.VImage;
import v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0400b extends k.e {

    /* JADX INFO: renamed from: d */
    public a f7114d;

    /* JADX INFO: renamed from: e */
    public boolean f7115e = false;

    /* JADX INFO: renamed from: f */
    public boolean f7116f = false;

    /* JADX INFO: renamed from: g */
    public boolean f7117g = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.b$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo10029b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo10030c(boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo10032n();
    }

    public C0400b(a aVar) {
        this.f7114d = aVar;
    }

    /* JADX INFO: renamed from: A */
    public void m10077A(RecyclerView.d0 d0Var, int i) {
        super.A(d0Var, i);
    }

    /* JADX INFO: renamed from: B */
    public void m10078B(RecyclerView.d0 d0Var, int i) {
        boolean z = this.f7115e;
        if (z) {
            View view = d0Var.itemView;
            if (view instanceof LikersItemView) {
                this.f7114d.mo10029b(((LikersItemView) view).f7096w, this.f7116f);
                return;
            }
        }
        if (z) {
            Object obj = d0Var.itemView;
            if (obj instanceof LikersBigCardItemView) {
                this.f7114d.mo10029b(((LikersBigCardItemView) obj).f7052q, this.f7116f);
                return;
            }
        }
        this.f7114d.mo10030c(this.f7116f);
    }

    /* JADX INFO: renamed from: C */
    public float m10079C(int i, float f) {
        float fM5226B9 = i / CoreModule.m1854P().m11706a().m5226B9();
        if (fM5226B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fM5226B9, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public void m10080c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        this.f7115e = false;
        this.f7116f = false;
        this.f7117g = false;
        super.c(recyclerView, d0Var);
    }

    /* JADX INFO: renamed from: k */
    public int m10081k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        View view = d0Var.itemView;
        if (((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) && (layoutManager instanceof GridLayoutManager)) {
            return k.e.t(15, 15);
        }
        if (((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) && (layoutManager instanceof LinearLayoutManager)) {
            return layoutManager.getOrientation() == 0 ? k.e.t(12, 3) : k.e.t(3, 12);
        }
        if (CoreModule.m1854P().m11706a().m5455hq(d0Var.itemView)) {
            d0Var.itemView.setElevation(10.0f);
        }
        return k.e.t(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public float m10082l(float f) {
        return 2.1474836E9f;
    }

    /* JADX INFO: renamed from: m */
    public float m10083m(RecyclerView.d0 d0Var) {
        return 0.25f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m10084q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m10085r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m10086u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        VImage vImage;
        VImage vImage2;
        if (i == 1) {
            View view = d0Var.itemView;
            if ((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) {
                float width = recyclerView.getWidth() * m10083m(d0Var);
                float fM10079C = m10079C(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
                if (f <= 0.0f) {
                    fM10079C = -fM10079C;
                }
                if (this.f7114d.mo10032n()) {
                    this.f7115e = z;
                } else {
                    Object obj = d0Var.itemView;
                    if (obj instanceof LikersItemView) {
                        LikersItemView likersItemView = (LikersItemView) obj;
                        vImage = likersItemView.f7079f;
                        vImage2 = likersItemView.f7078e;
                    } else {
                        LikersBigCardItemView likersBigCardItemView = (LikersBigCardItemView) obj;
                        vImage = likersBigCardItemView.f7041f;
                        vImage2 = likersBigCardItemView.f7040e;
                    }
                    if (fM10079C > 0.0f) {
                        vImage.setVisibility(0);
                        vImage2.setVisibility(4);
                        vImage.setAlpha(fM10079C);
                        if (z) {
                            this.f7116f = true;
                            this.f7117g = false;
                        }
                    } else if (fM10079C < 0.0f) {
                        vImage.setVisibility(4);
                        vImage2.setVisibility(0);
                        vImage2.setAlpha(-fM10079C);
                        if (z) {
                            this.f7116f = false;
                            this.f7117g = true;
                        }
                    } else {
                        vImage.setVisibility(4);
                        vImage2.setVisibility(4);
                        if (z) {
                            this.f7116f = false;
                            this.f7117g = false;
                        }
                    }
                    if (z) {
                        this.f7115e = Math.abs(f) > width;
                    }
                }
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).F(d0Var.itemView);
        }
        super.u(canvas, recyclerView, d0Var, f, f2, i, z);
    }

    /* JADX INFO: renamed from: y */
    public boolean m10087y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        return false;
    }
}
