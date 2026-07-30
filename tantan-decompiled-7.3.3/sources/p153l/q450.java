package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/q450;", "Ll/ar2;", "Ll/s450;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;)V", "", "destroy", "()V", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "h0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class q450 extends ar2<s450> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ODiamondFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q450(@NotNull ODiamondFrag oDiamondFrag) {
        super(oDiamondFrag);
        oDiamondFrag.getClass();
        this.frag = oDiamondFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m175196e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m175197f0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m175198g0(Intent intent, int i, q450 q450Var, C4470c c4470c) {
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(intent.getStringExtra(CoreModule.f18273l.m143405a().mo34346Iq()));
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116503Pa == null || userM116600p9 == null) {
                return;
            }
            CoreModule.m30933P().m143405a().mo34441Ws(q450Var.act(), userM116600p9, z, z2, userM116503Pa);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m175199h0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 19) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.n450
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q450.m175197f0((C4470c) obj);
            }
        };
        c22421cLifecycle.takeFirst(new qcj() { // from class: l.o450
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return q450.m175196e0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.p450
            @Override // p153l.y20
            public final void call(Object obj) {
                q450.m175198g0(data, resultCode, this, (C4470c) obj);
            }
        }));
        return true;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
