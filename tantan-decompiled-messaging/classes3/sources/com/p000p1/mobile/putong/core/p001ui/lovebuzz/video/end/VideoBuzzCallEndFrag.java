package com.p000p1.mobile.putong.core.p001ui.lovebuzz.video.end;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.video.VideoBuzzAct;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import com.p1.mobile.putong.core.ui.lovebuzz.common.BaseBuzzCallEndFrag;
import kotlin.Metadata;
import l.i0e;
import l.j760;
import l.j8w;
import l.p9w;
import l.vwb;
import l.y2c0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/video/end/VideoBuzzCallEndFrag;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzCallEndFrag;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "g4", "(Landroid/os/Bundle;)V", "a5", "", "b5", "()Z", "onDestroyView", "Companion", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoBuzzCallEndFrag extends BaseBuzzCallEndFrag {
    /* JADX INFO: renamed from: a5 */
    public void m93a5() {
        VideoBuzzAct videoBuzzActAct = act();
        VideoBuzzAct videoBuzzAct = videoBuzzActAct instanceof VideoBuzzAct ? videoBuzzActAct : null;
        if (videoBuzzAct != null) {
            videoBuzzAct.m79V1("search_video");
        }
    }

    /* JADX INFO: renamed from: b5 */
    public boolean m94b5() {
        LoveBuzzData loveBuzzDataV0 = j8w.Companion.a().v0();
        boolean z = false;
        if (loveBuzzDataV0 != null) {
            z = loveBuzzDataV0.remainingVideoBuzz > 0 || loveBuzzDataV0.remainingVoiceBuzz == -1;
            V4().setEnabled(z);
            V4().setAlpha(z ? 1.0f : 0.4f);
        }
        return z;
    }

    /* JADX INFO: renamed from: g4 */
    public void m95g4(@Nullable Bundle sis) {
        super.g4(sis);
        U4().setBackgroundResource(y2c0.p0);
        S4().setBackgroundResource(y2c0.o0);
        boolean zM94b5 = m94b5();
        p9w p9wVar = p9w.INSTANCE;
        p9wVar.J().p(new j760[]{vwb.Y("buzz_continue", zM94b5 ? "true" : "false")});
        i0e.f(p9wVar.J());
    }

    public void onDestroyView() {
        super.onDestroyView();
        i0e.e(p9w.INSTANCE.J());
    }
}
