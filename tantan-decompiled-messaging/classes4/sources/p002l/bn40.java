package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.d30;
import l.e30;
import l.ffw;
import l.h4g;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll/bn40;", "Ll/ho2;", "T", "Ll/pat;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "t", "()V", "Ll/d30;", "callBack", "O3", "(Ll/d30;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", "i", "Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", "N3", "()Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", "setMCurrentDanmakuList", "(Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;)V", "mCurrentDanmakuList", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bn40<T extends ho2> extends pat<ho2> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public BLiveDanmakuList mCurrentDanmakuList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn40(@NotNull bsm<T> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m10514J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m10515K3(bn40 bn40Var, h4g h4gVar) {
        bn40Var.m10519O3(null);
    }

    /* JADX INFO: renamed from: L3 */
    public static Boolean m10516L3(BLiveDanmakuList bLiveDanmakuList) {
        return Boolean.valueOf(NullChecker.a(bLiveDanmakuList));
    }

    /* JADX INFO: renamed from: M3 */
    public static void m10517M3(bn40 bn40Var, d30 d30Var, BLiveDanmakuList bLiveDanmakuList) {
        bLiveDanmakuList.getClass();
        bn40Var.mCurrentDanmakuList = bLiveDanmakuList;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: N3, reason: from getter */
    public final BLiveDanmakuList getMCurrentDanmakuList() {
        return this.mCurrentDanmakuList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O3 */
    public final void m10519O3(@Nullable final d30 callBack) {
        User userM14582l0 = m25547E2().m14582l0();
        if (userM14582l0 == null) {
            return;
        }
        c cVarDuringCreated = duringCreated(LivingNormalApiProvider.m4586F4(((DbObject) userM14582l0).id, m25547E2().m17235k(), m25547E2().m17239o()));
        final Function1 function1 = new Function1() { // from class: l.ym40
            public final Object invoke(Object obj) {
                return bn40.m10516L3((BLiveDanmakuList) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.zm40
            public final Object call(Object obj) {
                return bn40.m10514J3(function1, obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.an40
            public final void call(Object obj) {
                bn40.m10517M3(this.f7760a, callBack, (BLiveDanmakuList) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m10520t() {
        super.t();
        m10519O3(null);
        duringCreated(m25547E2().m14595q0()).subscribe(ffw.d(new e30() { // from class: l.xm40
            public final void call(Object obj) {
                bn40.m10515K3(this.f22352a, (h4g) obj);
            }
        }));
    }
}
