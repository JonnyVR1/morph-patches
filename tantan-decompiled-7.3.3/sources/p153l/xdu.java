package p153l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class xdu extends LiveMenuDialogHolder<zdu> {

    /* JADX INFO: renamed from: k */
    public VFrame f193638k;

    /* JADX INFO: renamed from: l */
    public CardView f193639l;

    /* JADX INFO: renamed from: m */
    public VText f193640m;

    /* JADX INFO: renamed from: n */
    public VText f193641n;

    /* JADX INFO: renamed from: o */
    public VText f193642o;

    /* JADX INFO: renamed from: p */
    public VText f193643p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f193644q;

    public xdu(zdu zduVar) {
        super(yec0.f199321y5, zduVar.act(), zduVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m210490H(View view) {
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m210491G(View view) {
        aeu.m97262a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m210492I(String str, String str2, String str3, String str4) {
        m73017E();
        izs.m142868s("context_common", this.f193644q, str);
        this.f193640m.setText(str2);
        this.f193641n.setText(str3);
        this.f193642o.setText(str4);
        bnl0.m105524M(this.f193643p, false);
        bnl0.m105509E0(this.f193642o, new View.OnClickListener() { // from class: l.wdu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188636a.m210490H(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m210491G(view);
    }
}
