package p149l;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class xgt extends d1q<ConstraintLayout> {
    private VDraweeView bgView;
    private final zds data;
    private TextView desc;

    public xgt(zds zdsVar) {
        this.data = zdsVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(ConstraintLayout constraintLayout) {
        super.mo70566u(constraintLayout);
        this.bgView = (VDraweeView) constraintLayout.findViewById(d5c0.f84508r);
        TextView textView = (TextView) constraintLayout.findViewById(d5c0.f84414E);
        this.desc = textView;
        textView.setText(this.data.m218197c());
        hxs.m133406s("context_square", this.bgView, this.data.m218195a());
        LiveCardTracker.trackMv(this.data.m218198d());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152892q;
    }
}
