package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import com.p051p1.mobile.putong.live.base.view.ClipRoundImageView;

/* JADX INFO: loaded from: classes4.dex */
public class u6g implements iam<v6g> {

    /* JADX INFO: renamed from: a */
    public v6g f177770a;

    /* JADX INFO: renamed from: b */
    public final ClipRoundImageView f177771b;

    /* JADX INFO: renamed from: c */
    public final TextView f177772c;

    /* JADX INFO: renamed from: d */
    public final TextView f177773d;

    public u6g(ClipRoundImageView clipRoundImageView, TextView textView, TextView textView2) {
        this.f177771b = clipRoundImageView;
        this.f177772c = textView;
        this.f177773d = textView2;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f177773d.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v6g v6gVar) {
        this.f177770a = v6gVar;
    }

    /* JADX INFO: renamed from: b */
    public void m194694b(aeg aegVar) {
        this.f177771b.setBackground(fc2.m124971a(-2134685830, qa00.m175859d(8.0f), false));
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = aegVar.f70797g;
        if (bLiveAccommpanyTasksProgress == null) {
            return;
        }
        this.f177773d.setText(bLiveAccommpanyTasksProgress.desc);
        int i = bLiveAccommpanyTasksProgress.current;
        int i2 = bLiveAccommpanyTasksProgress.max;
        if (i > i2) {
            i = i2;
        }
        this.f177772c.setText(i + "/" + bLiveAccommpanyTasksProgress.max);
        this.f177771b.setProgress((((float) i) * 1.0f) / ((float) bLiveAccommpanyTasksProgress.max));
    }

    /* JADX INFO: renamed from: c */
    public void m194695c() {
        this.f177772c.setText("");
        this.f177771b.setProgress(0.0f);
        this.f177773d.setText("");
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
