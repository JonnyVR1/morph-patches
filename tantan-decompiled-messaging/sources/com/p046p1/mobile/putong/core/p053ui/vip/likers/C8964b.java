package com.p046p1.mobile.putong.core.p053ui.vip.likers;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.b */
/* JADX INFO: loaded from: classes9.dex */
public class C8964b extends C0605k.e {

    /* JADX INFO: renamed from: d */
    public a f37333d;

    /* JADX INFO: renamed from: e */
    public boolean f37334e = false;

    /* JADX INFO: renamed from: f */
    public boolean f37335f = false;

    /* JADX INFO: renamed from: g */
    public boolean f37336g = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.b$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo56587b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo56588c(boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo56589n();
    }

    public C8964b(a aVar) {
        this.f37333d = aVar;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: A */
    public void mo3772A(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.mo3772A(abstractC0566d0, i);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: B */
    public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        boolean z = this.f37334e;
        if (z) {
            View view = abstractC0566d0.itemView;
            if (view instanceof LikersItemView) {
                this.f37333d.mo56587b(((LikersItemView) view).f37315w, this.f37335f);
                return;
            }
        }
        if (z) {
            View view2 = abstractC0566d0.itemView;
            if (view2 instanceof LikersBigCardItemView) {
                this.f37333d.mo56587b(((LikersBigCardItemView) view2).f37271q, this.f37335f);
                return;
            }
        }
        this.f37333d.mo56588c(this.f37335f);
    }

    /* JADX INFO: renamed from: C */
    public float m56630C(int i, float f) {
        float fMo33289B9 = i / CoreModule.m29935P().m94651a().mo33289B9();
        if (fMo33289B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo33289B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: c */
    public void mo3776c(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f37334e = false;
        this.f37335f = false;
        this.f37336g = false;
        super.mo3776c(recyclerView, abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        View view = abstractC0566d0.itemView;
        if (((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) && (layoutManager instanceof GridLayoutManager)) {
            return C0605k.e.m3771t(15, 15);
        }
        if (((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) && (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0605k.e.m3771t(12, 3) : C0605k.e.m3771t(3, 12);
        }
        if (CoreModule.m29935P().m94651a().mo33518hq(abstractC0566d0.itemView)) {
            abstractC0566d0.itemView.setElevation(10.0f);
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
        VImage vImage;
        VImage vImage2;
        if (i == 1) {
            View view = abstractC0566d0.itemView;
            if ((view instanceof LikersItemView) || (view instanceof LikersBigCardItemView)) {
                float width = recyclerView.getWidth() * mo3785m(abstractC0566d0);
                float fM56630C = m56630C(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
                if (f <= 0.0f) {
                    fM56630C = -fM56630C;
                }
                if (this.f37333d.mo56589n()) {
                    this.f37334e = z;
                } else {
                    View view2 = abstractC0566d0.itemView;
                    if (view2 instanceof LikersItemView) {
                        LikersItemView likersItemView = (LikersItemView) view2;
                        vImage = likersItemView.f37298f;
                        vImage2 = likersItemView.f37297e;
                    } else {
                        LikersBigCardItemView likersBigCardItemView = (LikersBigCardItemView) view2;
                        vImage = likersBigCardItemView.f37260f;
                        vImage2 = likersBigCardItemView.f37259e;
                    }
                    if (fM56630C > 0.0f) {
                        vImage.setVisibility(0);
                        vImage2.setVisibility(4);
                        vImage.setAlpha(fM56630C);
                        if (z) {
                            this.f37335f = true;
                            this.f37336g = false;
                        }
                    } else if (fM56630C < 0.0f) {
                        vImage.setVisibility(4);
                        vImage2.setVisibility(0);
                        vImage2.setAlpha(-fM56630C);
                        if (z) {
                            this.f37335f = false;
                            this.f37336g = true;
                        }
                    } else {
                        vImage.setVisibility(4);
                        vImage2.setVisibility(4);
                        if (z) {
                            this.f37335f = false;
                            this.f37336g = false;
                        }
                    }
                    if (z) {
                        this.f37334e = Math.abs(f) > width;
                    }
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
