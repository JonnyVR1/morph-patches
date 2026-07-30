package p009l;

import android.content.Intent;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.e30;
import l.jq2;
import l.mkd0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/bw40;", "Ll/jq2;", "Ll/dw40;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;)V", "", "destroy", "()V", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "h0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static Boolean m12307e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m12308f0(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.i);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m12309g0(Intent intent, int i, bw40 bw40Var, c cVar) {
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            User userPa = CoreModule.c.e0.Pa(intent.getStringExtra(CoreModule.l.a().Iq()));
            User userP9 = CoreModule.c.e0.p9();
            if (userPa == null || userP9 == null) {
                return;
            }
            CoreModule.P().a().Ws(bw40Var.act(), userP9, z, z2, userPa);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m12310a0() {
        super.a0();
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m12311h0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 19) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        rx.c cVarLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.yv40
            public final Object invoke(Object obj) {
                return bw40.m12308f0((c) obj);
            }
        };
        cVarLifecycle.takeFirst(new w9j() { // from class: l.zv40
            public final Object call(Object obj) {
                return bw40.m12307e0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.aw40
            public final void call(Object obj) {
                bw40.m12309g0(data, resultCode, this, (c) obj);
            }
        }));
        return true;
    }

    public void destroy() {
    }
}
