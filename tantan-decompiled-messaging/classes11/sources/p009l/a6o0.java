package p009l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsItemView;
import com.p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.d1q;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class a6o0 extends d1q<VoiceOperationsItemView> {

    /* JADX INFO: renamed from: a */
    public final IntlLiveOperationItemBean f9315a;

    /* JADX INFO: renamed from: b */
    public final f6o0 f9316b;

    public a6o0(f6o0 f6o0Var, @NonNull IntlLiveOperationItemBean intlLiveOperationItemBean) {
        this.f9315a = intlLiveOperationItemBean;
        this.f9316b = f6o0Var;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m11252m(VoiceOperationsItemView voiceOperationsItemView) {
        super.m(voiceOperationsItemView);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m11254u(VoiceOperationsItemView voiceOperationsItemView) {
        super.u(voiceOperationsItemView);
        voiceOperationsItemView.m8514g(this.f9316b, this.f9315a);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m11255w(VoiceOperationsItemView voiceOperationsItemView) {
        super.w(voiceOperationsItemView);
        AnimEffectPlayer animEffectPlayer = voiceOperationsItemView.f6914b;
        if (animEffectPlayer != null) {
            animEffectPlayer.n();
        }
        voiceOperationsItemView.m8509b();
    }

    /* JADX INFO: renamed from: K */
    public void m11251K(View view) {
        if (view instanceof VoiceOperationsItemView) {
            ((VoiceOperationsItemView) view).m8513f(this.f9315a);
        }
    }

    /* JADX INFO: renamed from: o */
    public int m11253o() {
        return t6c0.Y9;
    }
}
