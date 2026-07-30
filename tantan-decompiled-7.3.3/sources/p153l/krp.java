package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class krp extends g4s {

    /* JADX INFO: renamed from: A */
    public AnimEffectPlayer f128490A;

    /* JADX INFO: renamed from: B */
    public ImageView f128491B;

    /* JADX INFO: renamed from: x */
    public View f128492x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f128493y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f128494z;

    public krp(rrp rrpVar) {
        super(rrpVar, rrpVar.act().inflater().inflate(yec0.f199091g9, (ViewGroup) null));
        m151107o0(m72943R());
        setCanceledOnTouchOutside(false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f128490A.m69688o();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m151107o0(View view) {
        lrp.m155633a(this, view);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m151108p0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m151109q0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: r0 */
    public void m151110r0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        boolean zEquals = "svga".equals(bLiveVoiceBackGroundPics.picType);
        show();
        int iM175859d = qa00.m175858c().widthPixels - qa00.m175859d(64.0f);
        bnl0.m105505C0(this.f128493y, (int) (iM175859d * 1.4694533f));
        bnl0.m105507D0(iM175859d, this.f128493y);
        qnp0.m177261d1(this.f128493y, qa00.m175859d(15.0f));
        bnl0.m105524M(this.f128494z, !zEquals);
        bnl0.m105524M(this.f128490A, zEquals);
        bnl0.m105509E0(this.f128491B, new View.OnClickListener() { // from class: l.irp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116596a.m151108p0(view);
            }
        });
        bnl0.m105509E0(this.f128492x, new View.OnClickListener() { // from class: l.jrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122396a.m151109q0(view);
            }
        });
        if (zEquals) {
            this.f128490A.mo69685l(bLiveVoiceBackGroundPics.url, -1, null);
        } else {
            izs.m142868s("context_single_room", this.f128494z, bLiveVoiceBackGroundPics.url);
        }
    }
}
