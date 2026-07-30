package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftDetail;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class a3n0 extends LiveMenuDialogHolder<y2n0> {

    /* JADX INFO: renamed from: k */
    public VDraweeView f67399k;

    /* JADX INFO: renamed from: l */
    public VText f67400l;

    /* JADX INFO: renamed from: m */
    public VText f67401m;

    /* JADX INFO: renamed from: n */
    public VButton f67402n;

    /* JADX INFO: renamed from: o */
    public VText f67403o;

    /* JADX INFO: renamed from: p */
    public VText f67404p;

    public a3n0(y2n0 y2n0Var) {
        super(t6c0.f168540u8, y2n0Var.act(), y2n0Var, j2g0.m139456c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m94729H(View view) {
        T t = this.f47757b;
        if (t != 0) {
            ((y2n0) t).m212429W3();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m94730G(View view) {
        b3n0.m100114a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m94731I(List<BLiveGiftDetail> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        BLiveGiftDetail bLiveGiftDetail = list.get(0);
        hxs.m133398k("context_single_room", this.f67399k, bLiveGiftDetail.icon);
        this.f67400l.setText(bLiveGiftDetail.title);
        this.f67401m.setText(bLiveGiftDetail.content);
        this.f67403o.setText(bLiveGiftDetail.btnText);
        this.f67404p.setText(bLiveGiftDetail.price);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m94730G(view);
        xdl0.m208329E0(this.f67402n, new View.OnClickListener() { // from class: l.z2n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f201263a.m94729H(view2);
            }
        });
    }
}
