package com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import v.VImage;
import v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0371a extends k.e {

    /* JADX INFO: renamed from: d */
    public a f5043d;

    /* JADX INFO: renamed from: e */
    public boolean f5044e = false;

    /* JADX INFO: renamed from: f */
    public boolean f5045f = false;

    /* JADX INFO: renamed from: g */
    public boolean f5046g = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.a$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo7098b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo7099c(User user, boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo7100n();
    }

    public C0371a(a aVar) {
        this.f5043d = aVar;
    }

    /* JADX INFO: renamed from: A */
    public void m7109A(RecyclerView.d0 d0Var, int i) {
        super.A(d0Var, i);
    }

    /* JADX INFO: renamed from: B */
    public void m7110B(RecyclerView.d0 d0Var, int i) {
        View view = d0Var.itemView;
        if ((view instanceof MeetNearbyUserItemView) && NullChecker.a(((MeetNearbyUserItemView) view).mUser)) {
            MeetNearbyUserItemView meetNearbyUserItemView = (MeetNearbyUserItemView) d0Var.itemView;
            boolean z = this.f5044e;
            a aVar = this.f5043d;
            if (z) {
                aVar.mo7098b(meetNearbyUserItemView.mUser, this.f5045f);
            } else {
                aVar.mo7099c(meetNearbyUserItemView.mUser, this.f5045f);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public float m7111C(int i, float f) {
        float fB9 = i / CoreModule.P().a().B9();
        if (fB9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fB9, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public void m7112c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        this.f5044e = false;
        this.f5045f = false;
        this.f5046g = false;
        super.c(recyclerView, d0Var);
    }

    /* JADX INFO: renamed from: k */
    public int m7113k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        return ((d0Var.itemView instanceof MeetNearbyUserItemView) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) ? k.e.t(15, 15) : k.e.t(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public float m7114l(float f) {
        return 2.1474836E9f;
    }

    /* JADX INFO: renamed from: m */
    public float m7115m(RecyclerView.d0 d0Var) {
        return 0.25f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m7116q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m7117r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m7118u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1 && (d0Var.itemView instanceof MeetNearbyUserItemView)) {
            float width = recyclerView.getWidth() * m7115m(d0Var);
            float fM7111C = m7111C(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM7111C = -fM7111C;
            }
            if (z) {
                if (fM7111C > 0.0f) {
                    this.f5045f = true;
                    this.f5046g = false;
                } else if (fM7111C < 0.0f) {
                    this.f5045f = false;
                    this.f5046g = true;
                } else {
                    this.f5045f = false;
                    this.f5046g = false;
                }
            }
            if (this.f5043d.mo7100n()) {
                this.f5044e = z;
            } else if (z) {
                this.f5044e = Math.abs(f) > width;
            }
            if (!this.f5043d.mo7100n()) {
                MeetNearbyUserItemView meetNearbyUserItemView = (MeetNearbyUserItemView) d0Var.itemView;
                VImage vImage = meetNearbyUserItemView._like;
                VImage vImage2 = meetNearbyUserItemView._dislike;
                if (fM7111C > 0.0f) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(8);
                    vImage.setAlpha(fM7111C);
                } else if (fM7111C < 0.0f) {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM7111C);
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
    public boolean m7119y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        return false;
    }
}
