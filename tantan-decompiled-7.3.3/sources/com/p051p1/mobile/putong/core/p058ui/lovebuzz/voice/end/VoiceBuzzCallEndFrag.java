package com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.end;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzCallEndFrag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.VoiceBuzzAct;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p153l.ebc0;
import p153l.haw;
import p153l.jyb;
import p153l.nbw;
import p153l.w1e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003¨\u0006\u0010"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/end/VoiceBuzzCallEndFrag;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzCallEndFrag;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "g4", "(Landroid/os/Bundle;)V", "a5", "", "b5", "()Z", "onDestroyView", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceBuzzCallEndFrag extends BaseBuzzCallEndFrag {
    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzCallEndFrag
    /* JADX INFO: renamed from: a5 */
    public void mo48093a5() {
        Act act = act();
        VoiceBuzzAct voiceBuzzAct = act instanceof VoiceBuzzAct ? (VoiceBuzzAct) act : null;
        if (voiceBuzzAct != null) {
            voiceBuzzAct.mo48105X1("search_voice");
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzCallEndFrag
    /* JADX INFO: renamed from: b5 */
    public boolean mo48094b5() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        boolean z = false;
        if (loveBuzzDataM134315v0 != null) {
            int i = loveBuzzDataM134315v0.remainingVoiceBuzz;
            z = i > 0 || i == -1;
            m48089V4().setEnabled(z);
            m48089V4().setAlpha(z ? 1.0f : 0.4f);
        }
        return z;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzCallEndFrag, com.p051p1.mobile.android.app.Frag
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        m48088U4().setBackgroundResource(ebc0.f92909u0);
        m48086S4().setBackgroundResource(ebc0.f92907t0);
        boolean zMo48094b5 = mo48094b5();
        nbw nbwVar = nbw.INSTANCE;
        nbwVar.m162217L().m152781p(jyb.m147494Y("buzz_continue", zMo48094b5 ? "true" : "false"));
        w1e.m204402f(nbwVar.m162217L());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzCallEndFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        w1e.m204401e(nbw.INSTANCE.m162217L());
    }
}
