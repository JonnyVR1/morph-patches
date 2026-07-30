package p153l;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveTaskSummary;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ees extends d3q<VText> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final BLiveTaskSummary f93667a;

    public ees(@Nullable BLiveTaskSummary bLiveTaskSummary) {
        this.f93667a = bLiveTaskSummary;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VText vText) {
        super.mo71749u(vText);
        BLiveTaskSummary bLiveTaskSummary = this.f93667a;
        if (bLiveTaskSummary == null) {
            return;
        }
        if (!TextUtils.isEmpty(bLiveTaskSummary.backgroundColor)) {
            GradientDrawable gradientDrawableM124979i = fc2.m124979i(ynp0.m216917B(this.f93667a.backgroundColor), 0);
            float f = qa00.f156325l;
            gradientDrawableM124979i.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
            vText.setBackgroundDrawable(gradientDrawableM124979i);
        }
        if (jyb.m147479J(this.f93667a.fields)) {
            return;
        }
        vText.setText(this.f93667a.fields.get(0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k950.m148863a(this.f93667a, ((ees) obj).f93667a);
    }

    public int hashCode() {
        return k950.m148864b(this.f93667a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199332z3;
    }
}
