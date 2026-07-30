package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class des extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public BLiveCommonViewConfig f88082a;

    public des(BLiveCommonViewConfig bLiveCommonViewConfig) {
        this.f88082a = bLiveCommonViewConfig;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199280v3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        if (this.f88082a == null) {
            return;
        }
        izs.m142864o("context_single_room", (VDraweeView) view.findViewById(mdc0.f135886A2), this.f88082a.icon);
        ((VText) view.findViewById(mdc0.f135944G6)).setText(this.f88082a.text);
    }
}
