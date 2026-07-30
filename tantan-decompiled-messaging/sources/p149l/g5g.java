package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import com.p046p1.mobile.putong.live.base.view.ClipRoundImageView;

/* JADX INFO: loaded from: classes4.dex */
public class g5g implements s7m<h5g> {

    /* JADX INFO: renamed from: a */
    public h5g f101147a;

    /* JADX INFO: renamed from: b */
    public final ClipRoundImageView f101148b;

    /* JADX INFO: renamed from: c */
    public final TextView f101149c;

    /* JADX INFO: renamed from: d */
    public final TextView f101150d;

    public g5g(ClipRoundImageView clipRoundImageView, TextView textView, TextView textView2) {
        this.f101148b = clipRoundImageView;
        this.f101149c = textView;
        this.f101150d = textView2;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f101150d.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(h5g h5gVar) {
        this.f101147a = h5gVar;
    }

    /* JADX INFO: renamed from: b */
    public void m124524b(mcg mcgVar) {
        this.f101148b.setBackground(yb2.m213876a(-2134685830, t100.m186890d(8.0f), false));
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = mcgVar.f133109g;
        if (bLiveAccommpanyTasksProgress == null) {
            return;
        }
        this.f101150d.setText(bLiveAccommpanyTasksProgress.desc);
        int i = bLiveAccommpanyTasksProgress.current;
        int i2 = bLiveAccommpanyTasksProgress.max;
        if (i > i2) {
            i = i2;
        }
        this.f101149c.setText(i + "/" + bLiveAccommpanyTasksProgress.max);
        this.f101148b.setProgress((((float) i) * 1.0f) / ((float) bLiveAccommpanyTasksProgress.max));
    }

    /* JADX INFO: renamed from: c */
    public void m124525c() {
        this.f101149c.setText("");
        this.f101148b.setProgress(0.0f);
        this.f101150d.setText("");
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
