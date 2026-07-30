package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftDetail;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class ecn0 extends LiveMenuDialogHolder<ccn0> {

    /* JADX INFO: renamed from: k */
    public VDraweeView f93083k;

    /* JADX INFO: renamed from: l */
    public VText f93084l;

    /* JADX INFO: renamed from: m */
    public VText f93085m;

    /* JADX INFO: renamed from: n */
    public VButton f93086n;

    /* JADX INFO: renamed from: o */
    public VText f93087o;

    /* JADX INFO: renamed from: p */
    public VText f93088p;

    public ecn0(ccn0 ccn0Var) {
        super(yec0.f199272u8, ccn0Var.act(), ccn0Var, qag0.m175922c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m120397H(View view) {
        T t = this.f48605b;
        if (t != 0) {
            ((ccn0) t).m108732W3();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m120398G(View view) {
        fcn0.m125016a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m120399I(List<BLiveGiftDetail> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        BLiveGiftDetail bLiveGiftDetail = list.get(0);
        izs.m142860k("context_single_room", this.f93083k, bLiveGiftDetail.icon);
        this.f93084l.setText(bLiveGiftDetail.title);
        this.f93085m.setText(bLiveGiftDetail.content);
        this.f93087o.setText(bLiveGiftDetail.btnText);
        this.f93088p.setText(bLiveGiftDetail.price);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m120398G(view);
        bnl0.m105509E0(this.f93086n, new View.OnClickListener() { // from class: l.dcn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f87799a.m120397H(view2);
            }
        });
    }
}
