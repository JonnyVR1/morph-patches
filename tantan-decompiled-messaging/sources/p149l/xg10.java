package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/xg10;", "Ll/x5t;", "Ll/eh10;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallSummary;", "summary", "", ResourceDirection.f38808v, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallSummary;)V", "j", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xg10 extends x5t<eh10<?>> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public xg10(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: w */
    public static void m208621w(xg10 xg10Var, View view) {
        xg10Var.mo71727j();
    }

    @Override // p149l.x5t
    /* JADX INFO: renamed from: v */
    public void mo207142v(@NotNull BLiveMultiCallSummary summary) {
        summary.getClass();
        super.mo207142v(summary);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f191183f.m75909b(qqi0.m175938f("", summary.duration * 1000.0d)).m75910c(i3c0.f110687E1).m75911d(w8u.m202217t(R$string.f47378m1)).m75912e(typeface);
        String strM202217t = w8u.m202217t(uvr.m196087d().m162715s0() ? R$string.f47554u1 : R$string.f47532t1);
        boolean zM101734n = ((bgv) ypv.m215673l(fld0.f98151f)).m101734n();
        if (zM101734n) {
            strM202217t = w8u.m202217t(R$string.f47576v1);
        }
        int i = uvr.m196087d().m162715s0() ? i3c0.f111239z1 : i3c0.f111191v1;
        if (zM101734n) {
            i = i3c0.f110639A1;
        }
        this.f191184g.m75909b(x8u.m207433c(summary.rewardPoint)).m75910c(i).m75911d(strM202217t).m75912e(typeface);
        this.f191185h.m75909b(String.valueOf(summary.newFollowCount)).m75910c(i3c0.f111167t1).m75911d(w8u.m202217t(R$string.f46967T0)).m75912e(typeface);
        xdl0.m208329E0(this.f191186i, new View.OnClickListener() { // from class: l.wg10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xg10.m208621w(this.f186131a, view);
            }
        });
    }
}
