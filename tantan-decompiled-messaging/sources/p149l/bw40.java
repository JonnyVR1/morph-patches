package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/bw40;", "Ll/jq2;", "Ll/dw40;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;)V", "", "destroy", "()V", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "h0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class bw40 extends jq2<dw40> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ODiamondFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw40(@NotNull ODiamondFrag oDiamondFrag) {
        super(oDiamondFrag);
        oDiamondFrag.getClass();
        this.frag = oDiamondFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m104126e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m104127f0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m104128g0(Intent intent, int i, bw40 bw40Var, C4319c c4319c) {
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(intent.getStringExtra(CoreModule.f17554l.m94651a().mo33343Iq()));
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169430Pa == null || userM169527p9 == null) {
                return;
            }
            CoreModule.m29935P().m94651a().mo33438Ws(bw40Var.act(), userM169527p9, z, z2, userM169430Pa);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m104129h0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 19) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.yv40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bw40.m104127f0((C4319c) obj);
            }
        };
        c22306cLifecycle.takeFirst(new w9j() { // from class: l.zv40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return bw40.m104126e0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.aw40
            @Override // p149l.e30
            public final void call(Object obj) {
                bw40.m104128g0(data, resultCode, this, (C4319c) obj);
            }
        }));
        return true;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
