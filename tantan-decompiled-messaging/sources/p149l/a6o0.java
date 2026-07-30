package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsItemView;

/* JADX INFO: loaded from: classes11.dex */
public class a6o0 extends d1q<VoiceOperationsItemView> {

    /* JADX INFO: renamed from: a */
    public final IntlLiveOperationItemBean f67785a;

    /* JADX INFO: renamed from: b */
    public final f6o0 f67786b;

    public a6o0(f6o0 f6o0Var, @NonNull IntlLiveOperationItemBean intlLiveOperationItemBean) {
        this.f67785a = intlLiveOperationItemBean;
        this.f67786b = f6o0Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceOperationsItemView voiceOperationsItemView) {
        super.mo70999m(voiceOperationsItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceOperationsItemView voiceOperationsItemView) {
        super.mo70566u(voiceOperationsItemView);
        voiceOperationsItemView.m78321g(this.f67786b, this.f67785a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceOperationsItemView voiceOperationsItemView) {
        super.mo71000w(voiceOperationsItemView);
        AnimEffectPlayer animEffectPlayer = voiceOperationsItemView.f53308b;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68504n();
        }
        voiceOperationsItemView.m78316b();
    }

    /* JADX INFO: renamed from: K */
    public void m95155K(View view) {
        if (view instanceof VoiceOperationsItemView) {
            ((VoiceOperationsItemView) view).m78320f(this.f67785a);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168257Y9;
    }
}
