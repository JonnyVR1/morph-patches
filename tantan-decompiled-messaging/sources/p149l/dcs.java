package p149l;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveTaskSummary;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dcs extends d1q<VText> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final BLiveTaskSummary f85487a;

    public dcs(@Nullable BLiveTaskSummary bLiveTaskSummary) {
        this.f85487a = bLiveTaskSummary;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VText vText) {
        super.mo70566u(vText);
        BLiveTaskSummary bLiveTaskSummary = this.f85487a;
        if (bLiveTaskSummary == null) {
            return;
        }
        if (!TextUtils.isEmpty(bLiveTaskSummary.backgroundColor)) {
            GradientDrawable gradientDrawableM213884i = yb2.m213884i(uep0.m193307B(this.f85487a.backgroundColor), 0);
            float f = t100.f167263l;
            gradientDrawableM213884i.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
            vText.setBackgroundDrawable(gradientDrawableM213884i);
        }
        if (vwb.m200296J(this.f85487a.fields)) {
            return;
        }
        vText.setText(this.f85487a.fields.get(0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.m196470a(this.f85487a, ((dcs) obj).f85487a);
    }

    public int hashCode() {
        return v050.m196471b(this.f85487a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168600z3;
    }
}
