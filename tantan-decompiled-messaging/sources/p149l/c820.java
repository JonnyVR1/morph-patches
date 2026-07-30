package p149l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyItemView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class c820 extends C0605k.e {

    /* JADX INFO: renamed from: d */
    public InterfaceC16092a f79679d;

    /* JADX INFO: renamed from: e */
    public boolean f79680e = false;

    /* JADX INFO: renamed from: f */
    public boolean f79681f = false;

    /* JADX INFO: renamed from: g */
    public boolean f79682g = false;

    /* JADX INFO: renamed from: l.c820$a */
    public interface InterfaceC16092a {
        /* JADX INFO: renamed from: b */
        void mo105647b(User user, boolean z);

        /* JADX INFO: renamed from: c */
        void mo105648c(boolean z);

        /* JADX INFO: renamed from: n */
        boolean mo105649n();
    }

    public c820(InterfaceC16092a interfaceC16092a) {
        this.f79679d = interfaceC16092a;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: A */
    public void mo3772A(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.mo3772A(abstractC0566d0, i);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: B */
    public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        if (this.f79680e) {
            View view = abstractC0566d0.itemView;
            if ((view instanceof NearbyItemView) && NullChecker.m81303a(((NearbyItemView) view).mUser)) {
                this.f79679d.mo105647b(((NearbyItemView) abstractC0566d0.itemView).mUser, this.f79681f);
                return;
            }
        }
        this.f79679d.mo105648c(this.f79681f);
    }

    /* JADX INFO: renamed from: C */
    public float m105646C(int i, float f) {
        float fMo33289B9 = i / CoreModule.m29935P().m94651a().mo33289B9();
        if (fMo33289B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo33289B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: c */
    public void mo3776c(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f79680e = false;
        this.f79681f = false;
        this.f79682g = false;
        super.mo3776c(recyclerView, abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return ((abstractC0566d0.itemView instanceof NearbyItemView) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) ? C0605k.e.m3771t(15, 15) : C0605k.e.m3771t(0, 0);
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
        if (i == 1 && (abstractC0566d0.itemView instanceof NearbyItemView)) {
            float width = recyclerView.getWidth() * mo3785m(abstractC0566d0);
            float fM105646C = m105646C(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM105646C = -fM105646C;
            }
            if (z) {
                if (fM105646C > 0.0f) {
                    this.f79681f = true;
                    this.f79682g = false;
                } else if (fM105646C < 0.0f) {
                    this.f79681f = false;
                    this.f79682g = true;
                } else {
                    this.f79681f = false;
                    this.f79682g = false;
                }
            }
            if (this.f79679d.mo105649n()) {
                this.f79680e = z;
            } else if (z) {
                this.f79680e = Math.abs(f) > width;
            }
            if (!this.f79679d.mo105649n()) {
                NearbyItemView nearbyItemView = (NearbyItemView) abstractC0566d0.itemView;
                VImage vImage = nearbyItemView._like;
                VImage vImage2 = nearbyItemView._dislike;
                if (fM105646C > 0.0f) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(8);
                    vImage.setAlpha(fM105646C);
                } else if (fM105646C < 0.0f) {
                    vImage.setVisibility(8);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM105646C);
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
