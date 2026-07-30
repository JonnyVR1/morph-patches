package p149l;

import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.data.CardOption;
import com.p046p1.mobile.putong.core.newui.suggest.SuggesterItemView;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.tantanapp.common.utils.NullChecker;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class rug0 extends C0605k.e {

    /* JADX INFO: renamed from: d */
    public avg0 f161055d;

    /* JADX INFO: renamed from: e */
    public boolean f161056e = false;

    /* JADX INFO: renamed from: f */
    public boolean f161057f = false;

    /* JADX INFO: renamed from: g */
    public boolean f161058g = false;

    public rug0(avg0 avg0Var) {
        this.f161055d = avg0Var;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: B */
    public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        SuggesterItemView suggesterItemView = (SuggesterItemView) abstractC0566d0.itemView;
        if (!this.f161056e) {
            this.f161055d.m99188o0(suggesterItemView.getCardPattern());
            return;
        }
        CardOption leftOption = suggesterItemView.getLeftOption();
        CardOption rightOption = suggesterItemView.getRightOption();
        if (this.f161057f && NullChecker.m81303a(rightOption) && !TextUtils.isEmpty(rightOption.link)) {
            this.f161055d.m99190q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            j2e0.m139446m(suggesterItemView.m43576f(), Uri.parse(rightOption.link));
            this.f161055d.m99189p0();
        } else if (this.f161057f || !NullChecker.m81303a(leftOption) || TextUtils.isEmpty(leftOption.link)) {
            this.f161055d.m99190q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            this.f161055d.m99187n0(this.f161057f);
            this.f161055d.m99189p0();
        } else {
            this.f161055d.m99190q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            j2e0.m139446m(suggesterItemView.m43576f(), Uri.parse(leftOption.link));
            this.f161055d.m99189p0();
        }
    }

    /* JADX INFO: renamed from: C */
    public float m180871C(int i, float f) {
        float f2 = i / VSwipeCard.f20276C;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / f2, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: c */
    public void mo3776c(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f161056e = false;
        this.f161057f = false;
        this.f161058g = false;
        super.mo3776c(recyclerView, abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        View view = abstractC0566d0.itemView;
        if ((view instanceof SuggesterItemView) && (layoutManager instanceof GridLayoutManager)) {
            return C0605k.e.m3771t(15, 15);
        }
        if ((view instanceof SuggesterItemView) && (layoutManager instanceof LinearLayoutManager)) {
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
        if (i == 1 && (abstractC0566d0.itemView instanceof SuggesterItemView)) {
            float width = recyclerView.getWidth() * mo3785m(abstractC0566d0);
            float fM180871C = m180871C(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM180871C = -fM180871C;
            }
            GradientBgButton gradientBgButton = ((SuggesterItemView) abstractC0566d0.itemView).f26802e;
            if (fM180871C > 0.0f) {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setAlpha(fM180871C);
                if (z) {
                    this.f161057f = true;
                    this.f161058g = false;
                }
            } else if (fM180871C < 0.0f) {
                gradientBgButton.setVisibility(4);
                if (z) {
                    this.f161057f = false;
                    this.f161058g = true;
                }
            } else {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setAlpha(1.0f);
                if (z) {
                    this.f161057f = false;
                    this.f161058g = false;
                }
            }
            if (z) {
                this.f161056e = Math.abs(f) > width;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m223189F(abstractC0566d0.itemView);
        }
        super.mo3791u(canvas, recyclerView, abstractC0566d0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3795y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d1) {
        return false;
    }
}
