package com.p046p1.mobile.putong.core.p053ui.lovebuzz.video.end;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzCallEndFrag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.video.VideoBuzzAct;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p149l.i0e;
import p149l.j8w;
import p149l.p9w;
import p149l.vwb;
import p149l.y2c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/video/end/VideoBuzzCallEndFrag;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzCallEndFrag;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "g4", "(Landroid/os/Bundle;)V", "a5", "", "b5", "()Z", "onDestroyView", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VideoBuzzCallEndFrag extends BaseBuzzCallEndFrag {
    @Override // com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzCallEndFrag
    /* JADX INFO: renamed from: a5 */
    public void mo46910a5() {
        Act act = act();
        VideoBuzzAct videoBuzzAct = act instanceof VideoBuzzAct ? (VideoBuzzAct) act : null;
        if (videoBuzzAct != null) {
            videoBuzzAct.mo46922V1("search_video");
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzCallEndFrag
    /* JADX INFO: renamed from: b5 */
    public boolean mo46911b5() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        boolean z = false;
        if (loveBuzzDataM140468v0 != null) {
            z = loveBuzzDataM140468v0.remainingVideoBuzz > 0 || loveBuzzDataM140468v0.remainingVoiceBuzz == -1;
            m46906V4().setEnabled(z);
            m46906V4().setAlpha(z ? 1.0f : 0.4f);
        }
        return z;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzCallEndFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        m46905U4().setBackgroundResource(y2c0.f195577p0);
        m46903S4().setBackgroundResource(y2c0.f195575o0);
        boolean zMo46911b5 = mo46911b5();
        p9w p9wVar = p9w.INSTANCE;
        p9wVar.m167911J().m109040p(vwb.m200311Y("buzz_continue", zMo46911b5 ? "true" : "false"));
        i0e.m133797f(p9wVar.m167911J());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzCallEndFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        i0e.m133796e(p9w.INSTANCE.m167911J());
    }
}
