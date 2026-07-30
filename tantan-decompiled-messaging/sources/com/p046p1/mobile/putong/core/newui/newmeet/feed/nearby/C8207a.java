package com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8207a extends C0605k.e {

    /* JADX INFO: renamed from: d */
    public a f26265d;

    /* JADX INFO: renamed from: e */
    public boolean f26266e = false;

    /* JADX INFO: renamed from: f */
    public boolean f26267f = false;

    /* JADX INFO: renamed from: g */
    public boolean f26268g = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.a$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo42916b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo42917c(User user, boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo42918n();
    }

    public C8207a(a aVar) {
        this.f26265d = aVar;
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
        if ((view instanceof MeetNearbyUserItemView) && NullChecker.m81303a(((MeetNearbyUserItemView) view).mUser)) {
            MeetNearbyUserItemView meetNearbyUserItemView = (MeetNearbyUserItemView) abstractC0566d0.itemView;
            boolean z = this.f26266e;
            a aVar = this.f26265d;
            if (z) {
                aVar.mo42916b(meetNearbyUserItemView.mUser, this.f26267f);
            } else {
                aVar.mo42917c(meetNearbyUserItemView.mUser, this.f26267f);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public float m42927C(int i, float f) {
        float fMo33289B9 = i / CoreModule.m29935P().m94651a().mo33289B9();
        if (fMo33289B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo33289B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: c */
    public void mo3776c(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f26266e = false;
        this.f26267f = false;
        this.f26268g = false;
        super.mo3776c(recyclerView, abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return ((abstractC0566d0.itemView instanceof MeetNearbyUserItemView) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) ? C0605k.e.m3771t(15, 15) : C0605k.e.m3771t(0, 0);
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
        if (i == 1 && (abstractC0566d0.itemView instanceof MeetNearbyUserItemView)) {
            float width = recyclerView.getWidth() * mo3785m(abstractC0566d0);
            float fM42927C = m42927C(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM42927C = -fM42927C;
            }
            if (z) {
                if (fM42927C > 0.0f) {
                    this.f26267f = true;
                    this.f26268g = false;
                } else if (fM42927C < 0.0f) {
                    this.f26267f = false;
                    this.f26268g = true;
                } else {
                    this.f26267f = false;
                    this.f26268g = false;
                }
            }
            if (this.f26265d.mo42918n()) {
                this.f26266e = z;
            } else if (z) {
                this.f26266e = Math.abs(f) > width;
            }
            if (!this.f26265d.mo42918n()) {
                MeetNearbyUserItemView meetNearbyUserItemView = (MeetNearbyUserItemView) abstractC0566d0.itemView;
                VImage vImage = meetNearbyUserItemView._like;
                VImage vImage2 = meetNearbyUserItemView._dislike;
                if (fM42927C > 0.0f) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(8);
                    vImage.setAlpha(fM42927C);
                } else if (fM42927C < 0.0f) {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM42927C);
                } else {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(8);
                }
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
}
