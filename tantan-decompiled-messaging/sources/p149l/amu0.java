package p149l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.C2104b0;
import com.google.android.gms.internal.ads.zzbze;
import com.tencent.rtmp.TXLiveConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class amu0 implements r0u0, ezt0, mxt0, dyt0, b1r0, x3u0 {

    /* JADX INFO: renamed from: a */
    public final z2s0 f70685a;

    /* JADX INFO: renamed from: b */
    public boolean f70686b = false;

    public amu0(z2s0 z2s0Var, wuv0 wuv0Var) {
        this.f70685a = z2s0Var;
        z2s0Var.m216994c(2);
        if (wuv0Var != null) {
            z2s0Var.m216994c(1101);
        }
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: A */
    public final void mo97687A(final vxv0 vxv0Var) {
        this.f70685a.m216993b(new y2s0() { // from class: l.wlu0
            @Override // p149l.y2s0
            /* JADX INFO: renamed from: a */
            public final void mo12818a(s4s0 s4s0Var) {
                s3s0 s3s0Var = (s3s0) s4s0Var.m182306q().m13187k();
                c4s0 c4s0Var = (c4s0) s4s0Var.m182306q().m13441N().m13187k();
                c4s0Var.m105241q(vxv0Var.f183478b.f178773b.f141055b);
                s3s0Var.m182203r(c4s0Var);
                s4s0Var.m182310u(s3s0Var);
            }
        });
    }

    @Override // p149l.x3u0
    /* JADX INFO: renamed from: B */
    public final void mo97688B(final C2104b0 c2104b0) {
        this.f70685a.m216993b(new y2s0() { // from class: l.ylu0
            @Override // p149l.y2s0
            /* JADX INFO: renamed from: a */
            public final void mo12818a(s4s0 s4s0Var) {
                s4s0Var.m182311v(c2104b0);
            }
        });
        this.f70685a.m216994c(1104);
    }

    @Override // p149l.x3u0
    /* JADX INFO: renamed from: D */
    public final void mo97689D(boolean z) {
        this.f70685a.m216994c(true != z ? 1108 : 1107);
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo95459a() {
        this.f70685a.m216994c(6);
    }

    @Override // p149l.x3u0
    /* JADX INFO: renamed from: h0 */
    public final void mo97690h0(final C2104b0 c2104b0) {
        this.f70685a.m216993b(new y2s0() { // from class: l.xlu0
            @Override // p149l.y2s0
            /* JADX INFO: renamed from: a */
            public final void mo12818a(s4s0 s4s0Var) {
                s4s0Var.m182311v(c2104b0);
            }
        });
        this.f70685a.m216994c(1102);
    }

    @Override // p149l.x3u0
    /* JADX INFO: renamed from: k0 */
    public final void mo97691k0(final C2104b0 c2104b0) {
        this.f70685a.m216993b(new y2s0() { // from class: l.zlu0
            @Override // p149l.y2s0
            /* JADX INFO: renamed from: a */
            public final void mo12818a(s4s0 s4s0Var) {
                s4s0Var.m182311v(c2104b0);
            }
        });
        this.f70685a.m216994c(1103);
    }

    @Override // p149l.b1r0
    public final synchronized void onAdClicked() {
        boolean z = this.f70686b;
        z2s0 z2s0Var = this.f70685a;
        if (z) {
            z2s0Var.m216994c(8);
        } else {
            z2s0Var.m216994c(7);
            this.f70686b = true;
        }
    }

    @Override // p149l.x3u0
    /* JADX INFO: renamed from: q */
    public final void mo97692q(boolean z) {
        this.f70685a.m216994c(true != z ? TXLiveConstants.PUSH_WARNING_VIDEO_ENCODE_BITRATE_OVERFLOW : 1105);
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.f70685a.m216994c(101);
                break;
            case 2:
                this.f70685a.m216994c(102);
                break;
            case 3:
                this.f70685a.m216994c(5);
                break;
            case 4:
                this.f70685a.m216994c(103);
                break;
            case 5:
                this.f70685a.m216994c(104);
                break;
            case 6:
                this.f70685a.m216994c(105);
                break;
            case 7:
                this.f70685a.m216994c(106);
                break;
            default:
                this.f70685a.m216994c(4);
                break;
        }
    }

    @Override // p149l.x3u0
    public final void zzh() {
        this.f70685a.m216994c(1109);
    }

    @Override // p149l.ezt0
    public final void zzr() {
        this.f70685a.m216994c(3);
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: x */
    public final void mo97694x(zzbze zzbzeVar) {
    }
}
