package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class v5o0 implements sam<usm0> {

    /* JADX INFO: renamed from: a */
    public View f182559a;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: g */
    public View mo182846g(Context context) {
        if (this.f182559a == null) {
            this.f182559a = inflateView(LayoutInflater.from(context), null);
        }
        return this.f182559a;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(yec0.f198857N9, viewGroup);
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: D */
    public void mo182837D(BLiveVoiceCall bLiveVoiceCall) {
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: N1 */
    public void mo182838N1(BLiveVoiceCall bLiveVoiceCall) {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(usm0 usm0Var) {
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: j2 */
    public void mo182848j2(BLiveVoiceCall bLiveVoiceCall) {
    }

    @Override // p153l.sam
    public void setData(hrk0 hrk0Var) {
    }

    @Override // p153l.sam
    public void setVisible(boolean z) {
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: t */
    public void mo182849t() {
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: Q3 */
    public void mo182839Q3(int i, boolean z) {
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: b1 */
    public void mo182842b1(int i, String str) {
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: t2 */
    public void mo182850t2(hrk0 hrk0Var, BLiveVoiceCall bLiveVoiceCall) {
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: c1 */
    public void mo182844c1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: W1 */
    public void mo182840W1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2) {
    }
}
