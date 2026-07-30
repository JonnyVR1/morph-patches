package p002l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import l.hxs;
import l.xdl0;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wbu extends LiveMenuDialogHolder<ybu> {

    /* JADX INFO: renamed from: k */
    public VFrame f21607k;

    /* JADX INFO: renamed from: l */
    public CardView f21608l;

    /* JADX INFO: renamed from: m */
    public VText f21609m;

    /* JADX INFO: renamed from: n */
    public VText f21610n;

    /* JADX INFO: renamed from: o */
    public VText f21611o;

    /* JADX INFO: renamed from: p */
    public VText f21612p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f21613q;

    public wbu(ybu ybuVar) {
        super(t6c0.f20085y5, ybuVar.act(), ybuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m24465H(View view) {
        C0200a c0200a = this.f3800c;
        if (c0200a != null) {
            c0200a.dismiss();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m24466G(View view) {
        zbu.m27157a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m24467I(String str, String str2, String str3, String str4) {
        m5211E();
        hxs.s("context_common", this.f21613q, str);
        this.f21609m.setText(str2);
        this.f21610n.setText(str3);
        this.f21611o.setText(str4);
        xdl0.M(this.f21612p, false);
        xdl0.E0(this.f21611o, new View.OnClickListener() { // from class: l.vbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21065a.m24465H(view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m24466G(view);
    }
}
