package p149l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w9t extends LiveMenuDialogHolder<z9t> {

    /* JADX INFO: renamed from: k */
    public VFrame f185397k;

    /* JADX INFO: renamed from: l */
    public CardView f185398l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f185399m;

    /* JADX INFO: renamed from: n */
    public VText f185400n;

    /* JADX INFO: renamed from: o */
    public VText f185401o;

    public w9t(z9t z9tVar) {
        super(t6c0.f168132O4, z9tVar.act(), z9tVar);
    }

    /* JADX INFO: renamed from: G */
    public final void m202348G(View view) {
        aat.m95572a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m202349H(boolean z, View view) {
        mo71838p();
        ((z9t) this.f47757b).m217686U3(z);
    }

    /* JADX INFO: renamed from: I */
    public void m202350I(String str, String str2, String str3, final boolean z) {
        m71834E();
        hxs.m133406s("context_common", this.f185399m, str);
        this.f185400n.setText(str2);
        this.f185401o.setText(str3);
        xdl0.m208329E0(this.f185401o, new View.OnClickListener() { // from class: l.v9t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180674a.m202349H(z, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m202348G(view);
    }
}
