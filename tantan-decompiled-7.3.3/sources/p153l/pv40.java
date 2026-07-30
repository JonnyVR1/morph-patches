package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/pv40;", "Ll/oo2;", p7f.GPS_DIRECTION_TRUE, "Ll/qct;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "Ll/x20;", "callBack", "O3", "(Ll/x20;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", "N3", "()Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;", "setMCurrentDanmakuList", "(Lcom/p1/mobile/putong/live/base/data/BLiveDanmakuList;)V", "mCurrentDanmakuList", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pv40<T extends oo2> extends qct<oo2> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public BLiveDanmakuList mCurrentDanmakuList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv40(@NotNull dum<T> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m173919J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m173920K3(pv40 pv40Var, v5g v5gVar) {
        pv40Var.m173924O3(null);
    }

    /* JADX INFO: renamed from: L3 */
    public static Boolean m173921L3(BLiveDanmakuList bLiveDanmakuList) {
        return Boolean.valueOf(NullChecker.m82486a(bLiveDanmakuList));
    }

    /* JADX INFO: renamed from: M3 */
    public static void m173922M3(pv40 pv40Var, x20 x20Var, BLiveDanmakuList bLiveDanmakuList) {
        bLiveDanmakuList.getClass();
        pv40Var.mCurrentDanmakuList = bLiveDanmakuList;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: N3, reason: from getter */
    public final BLiveDanmakuList getMCurrentDanmakuList() {
        return this.mCurrentDanmakuList;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m173924O3(@Nullable final x20 callBack) {
        User userM168532l0 = m213810E2().m168532l0();
        if (userM168532l0 == null) {
            return;
        }
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c<T>) LivingNormalApiProvider.m72403F4(userM168532l0.f56859id, m213810E2().m202191k(), m213810E2().m202194o()));
        final Function1 function1 = new Function1() { // from class: l.mv40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pv40.m173921L3((BLiveDanmakuList) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.nv40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pv40.m173919J3(function1, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ov40
            @Override // p153l.y20
            public final void call(Object obj) {
                pv40.m173922M3(this.f149231a, callBack, (BLiveDanmakuList) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m173924O3(null);
        duringCreated((C22421c<T>) m213810E2().m168544q0()).subscribe(dhw.m115825d(new y20() { // from class: l.lv40
            @Override // p153l.y20
            public final void call(Object obj) {
                pv40.m173920K3(this.f133682a, (v5g) obj);
            }
        }));
    }
}
