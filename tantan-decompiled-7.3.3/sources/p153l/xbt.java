package p153l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class xbt extends LiveMenuDialogHolder<act> {

    /* JADX INFO: renamed from: k */
    public VFrame f193211k;

    /* JADX INFO: renamed from: l */
    public CardView f193212l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f193213m;

    /* JADX INFO: renamed from: n */
    public VText f193214n;

    /* JADX INFO: renamed from: o */
    public VText f193215o;

    public xbt(act actVar) {
        super(yec0.f198864O4, actVar.act(), actVar);
    }

    /* JADX INFO: renamed from: G */
    public final void m210000G(View view) {
        bct.m103551a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m210001H(boolean z, View view) {
        mo73021p();
        ((act) this.f48605b).m96972U3(z);
    }

    /* JADX INFO: renamed from: I */
    public void m210002I(String str, String str2, String str3, final boolean z) {
        m73017E();
        izs.m142868s("context_common", this.f193213m, str);
        this.f193214n.setText(str2);
        this.f193215o.setText(str3);
        bnl0.m105509E0(this.f193215o, new View.OnClickListener() { // from class: l.wbt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188272a.m210001H(z, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m210000G(view);
    }
}
