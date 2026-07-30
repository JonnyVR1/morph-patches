package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class kpp extends f2s {

    /* JADX INFO: renamed from: A */
    public AnimEffectPlayer f124179A;

    /* JADX INFO: renamed from: B */
    public ImageView f124180B;

    /* JADX INFO: renamed from: x */
    public View f124181x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f124182y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f124183z;

    public kpp(rpp rppVar) {
        super(rppVar, rppVar.act().inflater().inflate(t6c0.f168359g9, (ViewGroup) null));
        m146880o0(m71760R());
        setCanceledOnTouchOutside(false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f124179A.m68505o();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m146880o0(View view) {
        lpp.m150898a(this, view);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m146881p0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m146882q0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: r0 */
    public void m146883r0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        boolean zEquals = "svga".equals(bLiveVoiceBackGroundPics.picType);
        show();
        int iM186890d = t100.m186889c().widthPixels - t100.m186890d(64.0f);
        xdl0.m208325C0(this.f124182y, (int) (iM186890d * 1.4694533f));
        xdl0.m208327D0(iM186890d, this.f124182y);
        mep0.m154302d1(this.f124182y, t100.m186890d(15.0f));
        xdl0.m208344M(this.f124183z, !zEquals);
        xdl0.m208344M(this.f124179A, zEquals);
        xdl0.m208329E0(this.f124180B, new View.OnClickListener() { // from class: l.ipp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114340a.m146881p0(view);
            }
        });
        xdl0.m208329E0(this.f124181x, new View.OnClickListener() { // from class: l.jpp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119216a.m146882q0(view);
            }
        });
        if (zEquals) {
            this.f124179A.mo68502l(bLiveVoiceBackGroundPics.url, -1, null);
        } else {
            hxs.m133406s("context_single_room", this.f124183z, bLiveVoiceBackGroundPics.url);
        }
    }
}
