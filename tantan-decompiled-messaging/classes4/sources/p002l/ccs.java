package p002l;

import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import l.d1q;
import l.hxs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ccs extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public BLiveCommonViewConfig f8595a;

    public ccs(BLiveCommonViewConfig bLiveCommonViewConfig) {
        this.f8595a = bLiveCommonViewConfig;
    }

    /* JADX INFO: renamed from: o */
    public int m10932o() {
        return t6c0.f20044v3;
    }

    /* JADX INFO: renamed from: u */
    public void m10933u(View view) {
        super.u(view);
        if (this.f8595a == null) {
            return;
        }
        hxs.o("context_single_room", view.findViewById(g5c0.f10791A2), this.f8595a.icon);
        view.findViewById(g5c0.f10849G6).setText(this.f8595a.text);
    }
}
