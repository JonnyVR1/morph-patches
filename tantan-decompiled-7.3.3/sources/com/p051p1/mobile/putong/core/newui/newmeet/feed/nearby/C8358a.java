package com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8358a extends C0607k.e {

    /* JADX INFO: renamed from: d */
    public a f27007d;

    /* JADX INFO: renamed from: e */
    public boolean f27008e = false;

    /* JADX INFO: renamed from: f */
    public boolean f27009f = false;

    /* JADX INFO: renamed from: g */
    public boolean f27010g = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.nearby.a$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo43927b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo43928c(User user, boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo43929n();
    }

    public C8358a(a aVar) {
        this.f27007d = aVar;
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
        if ((view instanceof MeetNearbyUserItemView) && NullChecker.m82486a(((MeetNearbyUserItemView) view).mUser)) {
            MeetNearbyUserItemView meetNearbyUserItemView = (MeetNearbyUserItemView) abstractC0569e0.itemView;
            boolean z = this.f27008e;
            a aVar = this.f27007d;
            if (z) {
                aVar.mo43927b(meetNearbyUserItemView.mUser, this.f27009f);
            } else {
                aVar.mo43928c(meetNearbyUserItemView.mUser, this.f27009f);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public float m43938C(int i, float f) {
        float fMo34292B9 = i / CoreModule.m30933P().m143405a().mo34292B9();
        if (fMo34292B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo34292B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: c */
    public void mo3777c(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f27008e = false;
        this.f27009f = false;
        this.f27010g = false;
        super.mo3777c(recyclerView, abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: k */
    public int mo3784k(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return ((abstractC0569e0.itemView instanceof MeetNearbyUserItemView) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) ? C0607k.e.m3772t(15, 15) : C0607k.e.m3772t(0, 0);
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
        if (i == 1 && (abstractC0569e0.itemView instanceof MeetNearbyUserItemView)) {
            float width = recyclerView.getWidth() * mo3786m(abstractC0569e0);
            float fM43938C = m43938C(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM43938C = -fM43938C;
            }
            if (z) {
                if (fM43938C > 0.0f) {
                    this.f27009f = true;
                    this.f27010g = false;
                } else if (fM43938C < 0.0f) {
                    this.f27009f = false;
                    this.f27010g = true;
                } else {
                    this.f27009f = false;
                    this.f27010g = false;
                }
            }
            if (this.f27007d.mo43929n()) {
                this.f27008e = z;
            } else if (z) {
                this.f27008e = Math.abs(f) > width;
            }
            if (!this.f27007d.mo43929n()) {
                MeetNearbyUserItemView meetNearbyUserItemView = (MeetNearbyUserItemView) abstractC0569e0.itemView;
                VImage vImage = meetNearbyUserItemView._like;
                VImage vImage2 = meetNearbyUserItemView._dislike;
                if (fM43938C > 0.0f) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(8);
                    vImage.setAlpha(fM43938C);
                } else if (fM43938C < 0.0f) {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM43938C);
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
