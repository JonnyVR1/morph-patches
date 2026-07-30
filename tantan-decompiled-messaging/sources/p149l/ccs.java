package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ccs extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public BLiveCommonViewConfig f80299a;

    public ccs(BLiveCommonViewConfig bLiveCommonViewConfig) {
        this.f80299a = bLiveCommonViewConfig;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168548v3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        if (this.f80299a == null) {
            return;
        }
        hxs.m133402o("context_single_room", (VDraweeView) view.findViewById(g5c0.f100641A2), this.f80299a.icon);
        ((VText) view.findViewById(g5c0.f100699G6)).setText(this.f80299a.text);
    }
}
