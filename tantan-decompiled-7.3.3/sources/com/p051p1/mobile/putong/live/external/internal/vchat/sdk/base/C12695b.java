package com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base;

import com.immomo.momomediaext.utils.MMLiveRoomParams;
import p153l.cgu;
import p153l.eas;
import p153l.l51;
import p153l.nsh0;
import p153l.v1f;
import p153l.xau;
import p153l.zrv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.sdk.base.b */
/* JADX INFO: loaded from: classes9.dex */
public class C12695b extends eas {

    /* JADX INFO: renamed from: a */
    public final MotionParams f46185a;

    /* JADX INFO: renamed from: b */
    public boolean f46186b = false;

    /* JADX INFO: renamed from: c */
    public int f46187c = 0;

    /* JADX INFO: renamed from: d */
    public v1f f46188d;

    /* JADX INFO: renamed from: e */
    public Runnable f46189e;

    public C12695b(MotionParams motionParams) {
        this.f46185a = motionParams;
    }

    /* JADX INFO: renamed from: T0 */
    public cgu m70872T0() {
        cgu cguVar = new cgu();
        cguVar.f81730a = zrv.m221193k().m203483O4();
        MotionParams motionParams = this.f46185a;
        cguVar.f81734e = motionParams.f46183c;
        cguVar.f81733d = motionParams.f46182b;
        cguVar.f81732c = motionParams.f46181a;
        cguVar.f81731b = xau.m209915y(zrv.f205799a.m207651V());
        return cguVar;
    }

    /* JADX INFO: renamed from: U0 */
    public void mo70873U0() {
        if (this.f46187c == 3) {
            return;
        }
        this.f46187c = 3;
        this.f46188d.f181967g.m184838g(this);
        this.f46188d.f181966f.m165689d(this);
        if (this.f46189e != null) {
            nsh0.m164608j("videoChat", "end 完成 移除延迟10秒的任务");
            l51.m152890J(this.f46189e);
        }
        this.f46186b = false;
        nsh0.m164608j("videoChat", "goToEndFlag = false ");
    }

    /* JADX INFO: renamed from: V0 */
    public MotionParams.PusherMotionEnum m70874V0() {
        return this.f46185a.mo70870a();
    }

    /* JADX INFO: renamed from: W0 */
    public void mo70875W0() {
        if (this.f46187c != 1) {
            return;
        }
        this.f46187c = 2;
        this.f46188d.f181967g.m184839h(this);
        this.f46186b = true;
        Runnable runnable = new Runnable() { // from class: l.qob0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158717a.m70877Y0();
            }
        };
        this.f46189e = runnable;
        l51.m152888H(this.f46188d.f181961a, runnable, 10000L);
    }

    /* JADX INFO: renamed from: X0 */
    public void m70876X0(v1f v1fVar) {
        this.f46188d = v1fVar;
        v1fVar.f181966f.m165687b(this);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m70877Y0() {
        if (this.f46186b) {
            nsh0.m164608j("videoChat", " 执行延迟十秒的end 任务");
            mo70873U0();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m70878Z0() {
    }

    /* JADX INFO: renamed from: a1 */
    public void m70879a1() {
    }

    /* JADX INFO: renamed from: b1 */
    public int mo70880b1() {
        if (this.f46187c != 0) {
            return -1;
        }
        this.f46187c = 1;
        return 0;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: g0 */
    public void mo70881g0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo70881g0(mMLivePushType);
        if (this.f46186b) {
            mo70873U0();
        }
    }
}
