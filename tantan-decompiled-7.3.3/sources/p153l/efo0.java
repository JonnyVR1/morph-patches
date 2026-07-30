package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsItemView;

/* JADX INFO: loaded from: classes10.dex */
public class efo0 extends d3q<VoiceOperationsItemView> {

    /* JADX INFO: renamed from: a */
    public final IntlLiveOperationItemBean f93808a;

    /* JADX INFO: renamed from: b */
    public final jfo0 f93809b;

    public efo0(jfo0 jfo0Var, @NonNull IntlLiveOperationItemBean intlLiveOperationItemBean) {
        this.f93808a = intlLiveOperationItemBean;
        this.f93809b = jfo0Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceOperationsItemView voiceOperationsItemView) {
        super.mo72182m(voiceOperationsItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceOperationsItemView voiceOperationsItemView) {
        super.mo71749u(voiceOperationsItemView);
        voiceOperationsItemView.m79504g(this.f93809b, this.f93808a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceOperationsItemView voiceOperationsItemView) {
        super.mo72183w(voiceOperationsItemView);
        AnimEffectPlayer animEffectPlayer = voiceOperationsItemView.f54156b;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69687n();
        }
        voiceOperationsItemView.m79499b();
    }

    /* JADX INFO: renamed from: K */
    public void m120704K(View view) {
        if (view instanceof VoiceOperationsItemView) {
            ((VoiceOperationsItemView) view).m79503f(this.f93808a);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198989Y9;
    }
}
