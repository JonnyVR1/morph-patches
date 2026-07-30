package com.p051p1.mobile.putong.core.p058ui.vip.likers;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.b */
/* JADX INFO: loaded from: classes12.dex */
public class C9127b extends C0607k.e {

    /* JADX INFO: renamed from: d */
    public a f38181d;

    /* JADX INFO: renamed from: e */
    public boolean f38182e = false;

    /* JADX INFO: renamed from: f */
    public boolean f38183f = false;

    /* JADX INFO: renamed from: g */
    public boolean f38184g = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.b$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo57770b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo57771c(boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo57772n();
    }

    public C9127b(a aVar) {
        this.f38181d = aVar;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: A */
    public void mo3773A(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.mo3773A(abstractC0569e0, i);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: B */
    public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        boolean z = this.f38182e;
        if (z) {
            View view = abstractC0569e0.itemView;
            if (view instanceof LikersItemView) {
                this.f38181d.mo57770b(((LikersItemView) view).f38163w, this.f38183f);
                return;
            }
        }
        if (z) {
            View view2 = abstractC0569e0.itemView;
            if (view2 instanceof LikersBigCardItemView) {
                this.f38181d.mo57770b(((LikersBigCardItemView) view2).f38119q, this.f38183f);
                return;
            }
        }
        this.f38181d.mo57771c(this.f38183f);
    }

    /* JADX INFO: renamed from: C */
    public float m57813C(int i, float f) {
        float fMo34292B9 = i / CoreModule.m30933P().m143405a().mo34292B9();
        if (fMo34292B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo34292B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: c */
    public void mo3777c(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f38182e = false;
        this.f38183f = false;
        this.f38184g = false;
        super.mo3777c(recyclerView, abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: k */
    public int mo3784k(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        View view = abstractC0569e0.itemView;
        if (((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) && (layoutManager instanceof GridLayoutManager)) {
            return C0607k.e.m3772t(15, 15);
        }
        if (((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) && (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0607k.e.m3772t(12, 3) : C0607k.e.m3772t(3, 12);
        }
        if (CoreModule.m30933P().m143405a().mo34521hq(abstractC0569e0.itemView)) {
            abstractC0569e0.itemView.setElevation(10.0f);
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
        VImage vImage;
        VImage vImage2;
        if (i == 1) {
            View view = abstractC0569e0.itemView;
            if ((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) {
                float width = recyclerView.getWidth() * mo3786m(abstractC0569e0);
                float fM57813C = m57813C(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
                if (f <= 0.0f) {
                    fM57813C = -fM57813C;
                }
                if (this.f38181d.mo57772n()) {
                    this.f38182e = z;
                } else {
                    View view2 = abstractC0569e0.itemView;
                    if (view2 instanceof LikersItemView) {
                        LikersItemView likersItemView = (LikersItemView) view2;
                        vImage = likersItemView.f38146f;
                        vImage2 = likersItemView.f38145e;
                    } else {
                        LikersBigCardItemView likersBigCardItemView = (LikersBigCardItemView) view2;
                        vImage = likersBigCardItemView.f38108f;
                        vImage2 = likersBigCardItemView.f38107e;
                    }
                    if (fM57813C > 0.0f) {
                        vImage.setVisibility(0);
                        vImage2.setVisibility(4);
                        vImage.setAlpha(fM57813C);
                        if (z) {
                            this.f38183f = true;
                            this.f38184g = false;
                        }
                    } else if (fM57813C < 0.0f) {
                        vImage.setVisibility(4);
                        vImage2.setVisibility(0);
                        vImage2.setAlpha(-fM57813C);
                        if (z) {
                            this.f38183f = false;
                            this.f38184g = true;
                        }
                    } else {
                        vImage.setVisibility(4);
                        vImage2.setVisibility(4);
                        if (z) {
                            this.f38183f = false;
                            this.f38184g = false;
                        }
                    }
                    if (z) {
                        this.f38182e = Math.abs(f) > width;
                    }
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
