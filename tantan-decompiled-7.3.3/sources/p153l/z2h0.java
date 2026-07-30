package p153l;

import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.data.CardOption;
import com.p051p1.mobile.putong.core.newui.suggest.SuggesterItemView;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.tantanapp.common.utils.NullChecker;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class z2h0 extends C0607k.e {

    /* JADX INFO: renamed from: d */
    public i3h0 f202684d;

    /* JADX INFO: renamed from: e */
    public boolean f202685e = false;

    /* JADX INFO: renamed from: f */
    public boolean f202686f = false;

    /* JADX INFO: renamed from: g */
    public boolean f202687g = false;

    public z2h0(i3h0 i3h0Var) {
        this.f202684d = i3h0Var;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: B */
    public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        SuggesterItemView suggesterItemView = (SuggesterItemView) abstractC0569e0.itemView;
        if (!this.f202685e) {
            this.f202684d.m138297o0(suggesterItemView.getCardPattern());
            return;
        }
        CardOption leftOption = suggesterItemView.getLeftOption();
        CardOption rightOption = suggesterItemView.getRightOption();
        if (this.f202686f && NullChecker.m82486a(rightOption) && !TextUtils.isEmpty(rightOption.link)) {
            this.f202684d.m138299q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            nae0.m162083m(suggesterItemView.m44762f(), Uri.parse(rightOption.link));
            this.f202684d.m138298p0();
        } else if (this.f202686f || !NullChecker.m82486a(leftOption) || TextUtils.isEmpty(leftOption.link)) {
            this.f202684d.m138299q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            this.f202684d.m138296n0(this.f202686f);
            this.f202684d.m138298p0();
        } else {
            this.f202684d.m138299q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            nae0.m162083m(suggesterItemView.m44762f(), Uri.parse(leftOption.link));
            this.f202684d.m138298p0();
        }
    }

    /* JADX INFO: renamed from: C */
    public float m218419C(int i, float f) {
        float f2 = i / VSwipeCard.f21018C;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / f2, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: c */
    public void mo3777c(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f202685e = false;
        this.f202686f = false;
        this.f202687g = false;
        super.mo3777c(recyclerView, abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: k */
    public int mo3784k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        View view = abstractC0569e0.itemView;
        if ((view instanceof SuggesterItemView) && (layoutManager instanceof GridLayoutManager)) {
            return C0607k.e.m3772t(15, 15);
        }
        if ((view instanceof SuggesterItemView) && (layoutManager instanceof LinearLayoutManager)) {
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
        if (i == 1 && (abstractC0569e0.itemView instanceof SuggesterItemView)) {
            float width = recyclerView.getWidth() * mo3786m(abstractC0569e0);
            float fM218419C = m218419C(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM218419C = -fM218419C;
            }
            GradientBgButton gradientBgButton = ((SuggesterItemView) abstractC0569e0.itemView).f27650e;
            if (fM218419C > 0.0f) {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setAlpha(fM218419C);
                if (z) {
                    this.f202686f = true;
                    this.f202687g = false;
                }
            } else if (fM218419C < 0.0f) {
                gradientBgButton.setVisibility(4);
                if (z) {
                    this.f202686f = false;
                    this.f202687g = true;
                }
            } else {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setAlpha(1.0f);
                if (z) {
                    this.f202686f = false;
                    this.f202687g = false;
                }
            }
            if (z) {
                this.f202685e = Math.abs(f) > width;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m224435F(abstractC0569e0.itemView);
        }
        super.mo3792u(canvas, recyclerView, abstractC0569e0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3796y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e1) {
        return false;
    }
}
