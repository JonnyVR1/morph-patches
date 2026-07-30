package p002l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import l.hxs;
import l.xdl0;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w9t extends LiveMenuDialogHolder<z9t> {

    /* JADX INFO: renamed from: k */
    public VFrame f21580k;

    /* JADX INFO: renamed from: l */
    public CardView f21581l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f21582m;

    /* JADX INFO: renamed from: n */
    public VText f21583n;

    /* JADX INFO: renamed from: o */
    public VText f21584o;

    public w9t(z9t z9tVar) {
        super(t6c0.f19628O4, z9tVar.act(), z9tVar);
    }

    /* JADX INFO: renamed from: G */
    public final void m24446G(View view) {
        aat.m9467a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m24447H(boolean z, View view) {
        mo5216p();
        ((z9t) this.f3799b).m27137U3(z);
    }

    /* JADX INFO: renamed from: I */
    public void m24448I(String str, String str2, String str3, final boolean z) {
        m5211E();
        hxs.s("context_common", this.f21582m, str);
        this.f21583n.setText(str2);
        this.f21584o.setText(str3);
        xdl0.E0(this.f21584o, new View.OnClickListener() { // from class: l.v9t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21046a.m24447H(z, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m24446G(view);
    }
}
