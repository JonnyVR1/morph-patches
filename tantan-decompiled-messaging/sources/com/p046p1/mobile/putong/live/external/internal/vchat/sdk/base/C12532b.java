package com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base;

import com.immomo.momomediaext.utils.MMLiveRoomParams;
import p149l.beu;
import p149l.d8s;
import p149l.e51;
import p149l.gkh0;
import p149l.r0f;
import p149l.w8u;
import p149l.ypv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.sdk.base.b */
/* JADX INFO: loaded from: classes13.dex */
public class C12532b extends d8s {

    /* JADX INFO: renamed from: a */
    public final MotionParams f45337a;

    /* JADX INFO: renamed from: b */
    public boolean f45338b = false;

    /* JADX INFO: renamed from: c */
    public int f45339c = 0;

    /* JADX INFO: renamed from: d */
    public r0f f45340d;

    /* JADX INFO: renamed from: e */
    public Runnable f45341e;

    public C12532b(MotionParams motionParams) {
        this.f45337a = motionParams;
    }

    /* JADX INFO: renamed from: T0 */
    public beu m69689T0() {
        beu beuVar = new beu();
        beuVar.f75241a = ypv.m215672k().m195696O4();
        MotionParams motionParams = this.f45337a;
        beuVar.f75245e = motionParams.f45335c;
        beuVar.f75244d = motionParams.f45334b;
        beuVar.f75243c = motionParams.f45333a;
        beuVar.f75242b = w8u.m202222y(ypv.f199493a.m199329V());
        return beuVar;
    }

    /* JADX INFO: renamed from: U0 */
    public void mo69690U0() {
        if (this.f45339c == 3) {
            return;
        }
        this.f45339c = 3;
        this.f45340d.f157172g.m138919g(this);
        this.f45340d.f157171f.m123133d(this);
        if (this.f45341e != null) {
            gkh0.m126627j("videoChat", "end 完成 移除延迟10秒的任务");
            e51.m114745J(this.f45341e);
        }
        this.f45338b = false;
        gkh0.m126627j("videoChat", "goToEndFlag = false ");
    }

    /* JADX INFO: renamed from: V0 */
    public MotionParams.PusherMotionEnum m69691V0() {
        return this.f45337a.mo69687a();
    }

    /* JADX INFO: renamed from: W0 */
    public void mo69692W0() {
        if (this.f45339c != 1) {
            return;
        }
        this.f45339c = 2;
        this.f45340d.f157172g.m138920h(this);
        this.f45338b = true;
        Runnable runnable = new Runnable() { // from class: l.mgb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f133666a.m69694Y0();
            }
        };
        this.f45341e = runnable;
        e51.m114743H(this.f45340d.f157166a, runnable, 10000L);
    }

    /* JADX INFO: renamed from: X0 */
    public void m69693X0(r0f r0fVar) {
        this.f45340d = r0fVar;
        r0fVar.f157171f.m123131b(this);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m69694Y0() {
        if (this.f45338b) {
            gkh0.m126627j("videoChat", " 执行延迟十秒的end 任务");
            mo69690U0();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m69695Z0() {
    }

    /* JADX INFO: renamed from: a1 */
    public void m69696a1() {
    }

    /* JADX INFO: renamed from: b1 */
    public int mo69697b1() {
        if (this.f45339c != 0) {
            return -1;
        }
        this.f45339c = 1;
        return 0;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: g0 */
    public void mo69698g0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo69698g0(mMLivePushType);
        if (this.f45338b) {
            mo69690U0();
        }
    }
}
