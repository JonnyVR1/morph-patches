package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireListItemView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class f4n0 extends d1q<VoiceEndFireListItemView> {

    /* JADX INFO: renamed from: a */
    public won0 f94855a;

    /* JADX INFO: renamed from: b */
    public final BLiveVoiceEndSparkRanking f94856b;

    /* JADX INFO: renamed from: c */
    public final mqv<User> f94857c;

    /* JADX INFO: renamed from: d */
    public String f94858d;

    /* JADX INFO: renamed from: e */
    public String f94859e;

    public f4n0(won0 won0Var, BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking, mqv<User> mqvVar, String str, String str2) {
        this.f94855a = won0Var;
        this.f94856b = bLiveVoiceEndSparkRanking;
        this.f94857c = mqvVar;
        this.f94858d = str;
        this.f94859e = str2;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceEndFireListItemView voiceEndFireListItemView) {
        super.mo70566u(voiceEndFireListItemView);
        voiceEndFireListItemView.m78250o(this.f94855a, this.f94856b, this.f94857c, this.f94858d, this.f94859e);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70759v(VoiceEndFireListItemView voiceEndFireListItemView, @NonNull @NotNull List<Object> list) {
        super.mo70759v(voiceEndFireListItemView, list);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceEndFireListItemView voiceEndFireListItemView) {
        super.mo71000w(voiceEndFireListItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168579x8;
    }
}
