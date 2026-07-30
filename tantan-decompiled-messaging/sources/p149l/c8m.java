package p149l;

import android.content.Context;
import android.view.View;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.List;
import p149l.h4t;

/* JADX INFO: loaded from: classes5.dex */
public interface c8m<P extends h4t> extends s7m<P> {
    /* JADX INFO: renamed from: D */
    void mo103611D(BLiveVoiceCall bLiveVoiceCall);

    /* JADX INFO: renamed from: N1 */
    void mo103612N1(BLiveVoiceCall bLiveVoiceCall);

    /* JADX INFO: renamed from: Q3 */
    void mo103613Q3(int i, boolean z);

    /* JADX INFO: renamed from: W1 */
    void mo103614W1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2);

    /* JADX INFO: renamed from: b1 */
    void mo103616b1(int i, String str);

    /* JADX INFO: renamed from: c1 */
    void mo103618c1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str);

    /* JADX INFO: renamed from: g */
    View mo103621g(Context context);

    /* JADX INFO: renamed from: j2 */
    void mo103623j2(BLiveVoiceCall bLiveVoiceCall);

    void setData(bik0 bik0Var);

    void setVisible(boolean z);

    /* JADX INFO: renamed from: t */
    void mo103625t();

    /* JADX INFO: renamed from: t2 */
    void mo103626t2(bik0 bik0Var, BLiveVoiceCall bLiveVoiceCall);
}
