package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/hp10;", "Ll/y7t;", "Ll/op10;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallSummary;", "summary", "", ResourceDirection.f39656v, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallSummary;)V", "j", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hp10 extends y7t<op10<?>> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public hp10(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: w */
    public static void m136465w(hp10 hp10Var, View view) {
        hp10Var.mo72910j();
    }

    @Override // p153l.y7t
    /* JADX INFO: renamed from: v */
    public void mo136466v(@NotNull BLiveMultiCallSummary summary) {
        summary.getClass();
        super.mo136466v(summary);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f197831f.m77092b(tzi0.m193668f("", summary.duration * 1000.0d)).m77093c(obc0.f146015E1).m77094d(xau.m209910t(R$string.f48226m1)).m77095e(typeface);
        String strM209910t = xau.m209910t(vxr.m203876d().m171022s0() ? R$string.f48402u1 : R$string.f48380t1);
        boolean zM109970n = ((civ) zrv.m221194l(htd0.f111524f)).m109970n();
        if (zM109970n) {
            strM209910t = xau.m209910t(R$string.f48424v1);
        }
        int i = vxr.m203876d().m171022s0() ? obc0.f146567z1 : obc0.f146519v1;
        if (zM109970n) {
            i = obc0.f145967A1;
        }
        this.f197832g.m77092b(yau.m214935c(summary.rewardPoint)).m77093c(i).m77094d(strM209910t).m77095e(typeface);
        this.f197833h.m77092b(String.valueOf(summary.newFollowCount)).m77093c(obc0.f146495t1).m77094d(xau.m209910t(R$string.f47815T0)).m77095e(typeface);
        bnl0.m105509E0(this.f197834i, new View.OnClickListener() { // from class: l.gp10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hp10.m136465w(this.f105405a, view);
            }
        });
    }
}
