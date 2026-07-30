package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import l.cul;
import l.e30;
import l.r8d0;
import l.s7m;
import p002l.bsm;
import p002l.ho2;

/* JADX INFO: renamed from: l.a6 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0485a6<BD extends ho2, D extends BLiveAbsData, T extends bsm, R extends s7m> extends mht<BD, T, R> {

    /* JADX INFO: renamed from: i */
    public String f7413i;

    public AbstractC0485a6(T t) {
        super(t);
    }

    /* JADX INFO: renamed from: N3 */
    public abstract void mo9405N3();

    /* JADX INFO: renamed from: O3 */
    public boolean mo9406O3() {
        return false;
    }

    /* JADX INFO: renamed from: P3 */
    public abstract void mo9407P3();

    /* JADX INFO: renamed from: R3 */
    public abstract View mo9408R3();

    /* JADX INFO: renamed from: S3 */
    public abstract void mo9409S3(D d, boolean z, e30<r8d0> e30Var, e30<r8d0> e30Var2, boolean z2);

    /* JADX INFO: renamed from: T3 */
    public abstract void mo9410T3(e30<r8d0> e30Var);

    /* JADX INFO: renamed from: U3 */
    public abstract boolean mo9411U3(int i);

    /* JADX INFO: renamed from: V3 */
    public abstract boolean mo9412V3();

    /* JADX INFO: renamed from: W3 */
    public abstract boolean mo9413W3();

    /* JADX INFO: renamed from: X3 */
    public abstract boolean mo9414X3(int i);

    /* JADX INFO: renamed from: Y3 */
    public abstract boolean mo9415Y3(boolean z, boolean z2);

    /* JADX INFO: renamed from: Z3 */
    public abstract void mo9416Z3();

    /* JADX INFO: renamed from: a4 */
    public abstract void mo9417a4();

    /* JADX INFO: renamed from: b4 */
    public abstract void mo9418b4(boolean z, D d);

    /* JADX INFO: renamed from: c4 */
    public abstract void mo9419c4(D d);

    /* JADX INFO: renamed from: e4 */
    public abstract void mo9421e4(JumpRoomData jumpRoomData);

    /* JADX INFO: renamed from: f4 */
    public abstract void mo9422f4(cul culVar);

    /* JADX INFO: renamed from: g4 */
    public abstract void mo9423g4(boolean z);

    /* JADX INFO: renamed from: h4 */
    public void m9424h4(String str) {
        this.f7413i = str;
    }

    /* JADX INFO: renamed from: i4 */
    public abstract void mo9425i4();

    public abstract void init();

    /* JADX INFO: renamed from: m */
    public abstract void mo9426m(boolean z);

    /* JADX INFO: renamed from: d4 */
    public void mo9420d4(String str) {
    }
}
