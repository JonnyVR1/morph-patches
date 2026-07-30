package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import com.p1.mobile.putong.live.base.view.ClipRoundImageView;
import l.s7m;
import l.t100;
import l.yb2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g5g implements s7m<h5g> {

    /* JADX INFO: renamed from: a */
    public h5g f11267a;

    /* JADX INFO: renamed from: b */
    public final ClipRoundImageView f11268b;

    /* JADX INFO: renamed from: c */
    public final TextView f11269c;

    /* JADX INFO: renamed from: d */
    public final TextView f11270d;

    public g5g(ClipRoundImageView clipRoundImageView, TextView textView, TextView textView2) {
        this.f11268b = clipRoundImageView;
        this.f11269c = textView;
        this.f11270d = textView2;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13639C0() {
        return this.f11270d.getContext();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m13643i1(h5g h5gVar) {
        this.f11267a = h5gVar;
    }

    /* JADX INFO: renamed from: b */
    public void m13641b(mcg mcgVar) {
        this.f11268b.setBackground(yb2.a(-2134685830, t100.d(8.0f), false));
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = mcgVar.f15337g;
        if (bLiveAccommpanyTasksProgress == null) {
            return;
        }
        this.f11270d.setText(bLiveAccommpanyTasksProgress.desc);
        int i = bLiveAccommpanyTasksProgress.current;
        int i2 = bLiveAccommpanyTasksProgress.max;
        if (i > i2) {
            i = i2;
        }
        this.f11269c.setText(i + "/" + bLiveAccommpanyTasksProgress.max);
        this.f11268b.setProgress((((float) i) * 1.0f) / ((float) bLiveAccommpanyTasksProgress.max));
    }

    /* JADX INFO: renamed from: c */
    public void m13642c() {
        this.f11269c.setText("");
        this.f11268b.setProgress(0.0f);
        this.f11270d.setText("");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
