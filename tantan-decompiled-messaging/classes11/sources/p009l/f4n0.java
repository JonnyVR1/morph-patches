package p009l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireListItemView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import java.util.List;
import l.d1q;
import l.mqv;
import l.t6c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f4n0 extends d1q<VoiceEndFireListItemView> {

    /* JADX INFO: renamed from: a */
    public won0 f12803a;

    /* JADX INFO: renamed from: b */
    public final BLiveVoiceEndSparkRanking f12804b;

    /* JADX INFO: renamed from: c */
    public final mqv<User> f12805c;

    /* JADX INFO: renamed from: d */
    public String f12806d;

    /* JADX INFO: renamed from: e */
    public String f12807e;

    public f4n0(won0 won0Var, BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking, mqv<User> mqvVar, String str, String str2) {
        this.f12803a = won0Var;
        this.f12804b = bLiveVoiceEndSparkRanking;
        this.f12805c = mqvVar;
        this.f12806d = str;
        this.f12807e = str2;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m14244u(VoiceEndFireListItemView voiceEndFireListItemView) {
        super.u(voiceEndFireListItemView);
        voiceEndFireListItemView.m8439o(this.f12803a, this.f12804b, this.f12805c, this.f12806d, this.f12807e);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m14245v(VoiceEndFireListItemView voiceEndFireListItemView, @NonNull @NotNull List<Object> list) {
        super.v(voiceEndFireListItemView, list);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m14246w(VoiceEndFireListItemView voiceEndFireListItemView) {
        super.w(voiceEndFireListItemView);
    }

    /* JADX INFO: renamed from: o */
    public int m14243o() {
        return t6c0.x8;
    }
}
