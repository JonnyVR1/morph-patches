package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class rwn0 implements c8m<qjm0> {

    /* JADX INFO: renamed from: a */
    public View f161361a;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: g */
    public View mo103621g(Context context) {
        if (this.f161361a == null) {
            this.f161361a = inflateView(LayoutInflater.from(context), null);
        }
        return this.f161361a;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(t6c0.f168125N9, viewGroup);
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: D */
    public void mo103611D(BLiveVoiceCall bLiveVoiceCall) {
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: N1 */
    public void mo103612N1(BLiveVoiceCall bLiveVoiceCall) {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qjm0 qjm0Var) {
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: j2 */
    public void mo103623j2(BLiveVoiceCall bLiveVoiceCall) {
    }

    @Override // p149l.c8m
    public void setData(bik0 bik0Var) {
    }

    @Override // p149l.c8m
    public void setVisible(boolean z) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: t */
    public void mo103625t() {
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: Q3 */
    public void mo103613Q3(int i, boolean z) {
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: b1 */
    public void mo103616b1(int i, String str) {
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: t2 */
    public void mo103626t2(bik0 bik0Var, BLiveVoiceCall bLiveVoiceCall) {
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: c1 */
    public void mo103618c1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: W1 */
    public void mo103614W1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2) {
    }
}
