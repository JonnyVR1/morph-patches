package p149l;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wbu extends LiveMenuDialogHolder<ybu> {

    /* JADX INFO: renamed from: k */
    public VFrame f185616k;

    /* JADX INFO: renamed from: l */
    public CardView f185617l;

    /* JADX INFO: renamed from: m */
    public VText f185618m;

    /* JADX INFO: renamed from: n */
    public VText f185619n;

    /* JADX INFO: renamed from: o */
    public VText f185620o;

    /* JADX INFO: renamed from: p */
    public VText f185621p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f185622q;

    public wbu(ybu ybuVar) {
        super(t6c0.f168589y5, ybuVar.act(), ybuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m202583H(View view) {
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m202584G(View view) {
        zbu.m218004a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m202585I(String str, String str2, String str3, String str4) {
        m71834E();
        hxs.m133406s("context_common", this.f185622q, str);
        this.f185618m.setText(str2);
        this.f185619n.setText(str3);
        this.f185620o.setText(str4);
        xdl0.m208344M(this.f185621p, false);
        xdl0.m208329E0(this.f185620o, new View.OnClickListener() { // from class: l.vbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180882a.m202583H(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m202584G(view);
    }
}
