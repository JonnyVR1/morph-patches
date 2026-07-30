package p002l;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveTaskSummary;
import l.d1q;
import l.t100;
import l.uep0;
import l.v050;
import l.vwb;
import l.yb2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dcs extends d1q<VText> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final BLiveTaskSummary f9169a;

    public dcs(@Nullable BLiveTaskSummary bLiveTaskSummary) {
        this.f9169a = bLiveTaskSummary;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m11752u(VText vText) {
        super.u(vText);
        BLiveTaskSummary bLiveTaskSummary = this.f9169a;
        if (bLiveTaskSummary == null) {
            return;
        }
        if (!TextUtils.isEmpty(bLiveTaskSummary.backgroundColor)) {
            GradientDrawable gradientDrawableI = yb2.i(uep0.B(this.f9169a.backgroundColor), 0);
            float f = t100.l;
            gradientDrawableI.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
            vText.setBackgroundDrawable(gradientDrawableI);
        }
        if (vwb.J(this.f9169a.fields)) {
            return;
        }
        vText.setText((CharSequence) this.f9169a.fields.get(0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.a(this.f9169a, ((dcs) obj).f9169a);
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f9169a});
    }

    /* JADX INFO: renamed from: o */
    public int m11751o() {
        return t6c0.f20096z3;
    }
}
