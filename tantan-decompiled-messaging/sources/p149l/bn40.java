package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/bn40;", "Ll/ho2;", j6f.GPS_DIRECTION_TRUE, "Ll/pat;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "Ll/d30;", "callBack", "O3", "(Ll/d30;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", "N3", "()Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", "setMCurrentDanmakuList", "(Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;)V", "mCurrentDanmakuList", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static Boolean m102744J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m102745K3(bn40 bn40Var, h4g h4gVar) {
        bn40Var.m102749O3(null);
    }

    /* JADX INFO: renamed from: L3 */
    public static Boolean m102746L3(BLiveDanmakuList bLiveDanmakuList) {
        return Boolean.valueOf(NullChecker.m81303a(bLiveDanmakuList));
    }

    /* JADX INFO: renamed from: M3 */
    public static void m102747M3(bn40 bn40Var, d30 d30Var, BLiveDanmakuList bLiveDanmakuList) {
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

    /* JADX INFO: renamed from: O3 */
    public final void m102749O3(@Nullable final d30 callBack) {
        User userM132146l0 = m206027E2().m132146l0();
        if (userM132146l0 == null) {
            return;
        }
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c<T>) LivingNormalApiProvider.m71220F4(userM132146l0.f56011id, m206027E2().m149814k(), m206027E2().m149818o()));
        final Function1 function1 = new Function1() { // from class: l.ym40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bn40.m102746L3((BLiveDanmakuList) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.zm40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return bn40.m102744J3(function1, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.an40
            @Override // p149l.e30
            public final void call(Object obj) {
                bn40.m102747M3(this.f70704a, callBack, (BLiveDanmakuList) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m102749O3(null);
        duringCreated((C22306c<T>) m206027E2().m132159q0()).subscribe(ffw.m121193d(new e30() { // from class: l.xm40
            @Override // p149l.e30
            public final void call(Object obj) {
                bn40.m102745K3(this.f193529a, (h4g) obj);
            }
        }));
    }
}
