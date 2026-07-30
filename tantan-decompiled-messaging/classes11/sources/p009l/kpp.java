package p009l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.ap0;
import l.f2s;
import l.hxs;
import l.lpp;
import l.mep0;
import l.t100;
import l.t6c0;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kpp extends f2s {

    /* JADX INFO: renamed from: A */
    public AnimEffectPlayer f15801A;

    /* JADX INFO: renamed from: B */
    public ImageView f15802B;

    /* JADX INFO: renamed from: x */
    public View f15803x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f15804y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f15805z;

    /* JADX WARN: Multi-variable type inference failed */
    public kpp(rpp rppVar) {
        super(rppVar, rppVar.act().inflater().inflate(t6c0.g9, (ViewGroup) null));
        m17589o0(R());
        setCanceledOnTouchOutside(false);
    }

    public void dismiss() {
        super/*com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a*/.dismiss();
        this.f15801A.o();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m17589o0(View view) {
        lpp.a(this, view);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m17590p0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m17591q0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: r0 */
    public void m17592r0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        boolean zEquals = "svga".equals(bLiveVoiceBackGroundPics.picType);
        show();
        int iD = t100.c().widthPixels - t100.d(64.0f);
        xdl0.C0(this.f15804y, (int) (iD * 1.4694533f));
        xdl0.D0(iD, new View[]{this.f15804y});
        mep0.d1(this.f15804y, t100.d(15.0f));
        xdl0.M(this.f15805z, !zEquals);
        xdl0.M(this.f15801A, zEquals);
        xdl0.E0(this.f15802B, new View.OnClickListener() { // from class: l.ipp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14767a.m17590p0(view);
            }
        });
        xdl0.E0(this.f15803x, new View.OnClickListener() { // from class: l.jpp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15257a.m17591q0(view);
            }
        });
        if (zEquals) {
            this.f15801A.l(bLiveVoiceBackGroundPics.url, -1, (ap0) null);
        } else {
            hxs.s("context_single_room", this.f15805z, bLiveVoiceBackGroundPics.url);
        }
    }
}
