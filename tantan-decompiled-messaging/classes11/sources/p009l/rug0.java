package p009l;

import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.newui.suggest.SuggesterItemView;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.data.CardOption;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.tantanapp.common.utils.NullChecker;
import l.j2e0;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rug0 extends k.e {

    /* JADX INFO: renamed from: d */
    public avg0 f19982d;

    /* JADX INFO: renamed from: e */
    public boolean f19983e = false;

    /* JADX INFO: renamed from: f */
    public boolean f19984f = false;

    /* JADX INFO: renamed from: g */
    public boolean f19985g = false;

    public rug0(avg0 avg0Var) {
        this.f19982d = avg0Var;
    }

    /* JADX INFO: renamed from: B */
    public void m21810B(RecyclerView.d0 d0Var, int i) {
        SuggesterItemView suggesterItemView = (SuggesterItemView) d0Var.itemView;
        if (!this.f19983e) {
            this.f19982d.m11669o0(suggesterItemView.getCardPattern());
            return;
        }
        CardOption leftOption = suggesterItemView.getLeftOption();
        CardOption rightOption = suggesterItemView.getRightOption();
        if (this.f19984f && NullChecker.a(rightOption) && !TextUtils.isEmpty(rightOption.link)) {
            this.f19982d.m11671q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            j2e0.m(suggesterItemView.m7822f(), Uri.parse(rightOption.link));
            this.f19982d.m11670p0();
        } else if (this.f19984f || !NullChecker.a(leftOption) || TextUtils.isEmpty(leftOption.link)) {
            this.f19982d.m11671q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            this.f19982d.m11668n0(this.f19984f);
            this.f19982d.m11670p0();
        } else {
            this.f19982d.m11671q0(suggesterItemView.getCardPattern(), suggesterItemView.getUser());
            j2e0.m(suggesterItemView.m7822f(), Uri.parse(leftOption.link));
            this.f19982d.m11670p0();
        }
    }

    /* JADX INFO: renamed from: C */
    public float m21811C(int i, float f) {
        float f2 = i / VSwipeCard.C;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / f2, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public void m21812c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        this.f19983e = false;
        this.f19984f = false;
        this.f19985g = false;
        super.c(recyclerView, d0Var);
    }

    /* JADX INFO: renamed from: k */
    public int m21813k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.d0 d0Var) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        View view = d0Var.itemView;
        if ((view instanceof SuggesterItemView) && (layoutManager instanceof GridLayoutManager)) {
            return k.e.t(15, 15);
        }
        if ((view instanceof SuggesterItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return layoutManager.getOrientation() == 0 ? k.e.t(12, 3) : k.e.t(3, 12);
        }
        return k.e.t(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public float m21814l(float f) {
        return 2.1474836E9f;
    }

    /* JADX INFO: renamed from: m */
    public float m21815m(RecyclerView.d0 d0Var) {
        return 0.25f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m21816q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m21817r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m21818u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1 && (d0Var.itemView instanceof SuggesterItemView)) {
            float width = recyclerView.getWidth() * m21815m(d0Var);
            float fM21811C = m21811C(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM21811C = -fM21811C;
            }
            GradientBgButton gradientBgButton = ((SuggesterItemView) d0Var.itemView).f5580e;
            if (fM21811C > 0.0f) {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setAlpha(fM21811C);
                if (z) {
                    this.f19984f = true;
                    this.f19985g = false;
                }
            } else if (fM21811C < 0.0f) {
                gradientBgButton.setVisibility(4);
                if (z) {
                    this.f19984f = false;
                    this.f19985g = true;
                }
            } else {
                gradientBgButton.setVisibility(0);
                gradientBgButton.setAlpha(1.0f);
                if (z) {
                    this.f19984f = false;
                    this.f19985g = false;
                }
            }
            if (z) {
                this.f19983e = Math.abs(f) > width;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).F(d0Var.itemView);
        }
        super.u(canvas, recyclerView, d0Var, f, f2, i, z);
    }

    /* JADX INFO: renamed from: y */
    public boolean m21819y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.d0 d0Var, @NonNull RecyclerView.d0 d0Var2) {
        return false;
    }
}
