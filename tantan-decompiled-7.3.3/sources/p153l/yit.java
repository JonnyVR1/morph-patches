package p153l;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class yit extends d3q<ConstraintLayout> {
    private VDraweeView bgView;
    private final ags data;
    private TextView desc;

    public yit(ags agsVar) {
        this.data = agsVar;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(ConstraintLayout constraintLayout) {
        super.mo71749u(constraintLayout);
        this.bgView = (VDraweeView) constraintLayout.findViewById(jdc0.f120226r);
        TextView textView = (TextView) constraintLayout.findViewById(jdc0.f120132E);
        this.desc = textView;
        textView.setText(this.data.m97722c());
        izs.m142868s("context_square", this.bgView, this.data.m97720a());
        LiveCardTracker.trackMv(this.data.m97723d());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183749q;
    }
}
