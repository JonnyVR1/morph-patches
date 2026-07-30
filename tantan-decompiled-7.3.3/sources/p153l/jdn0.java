package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireListItemView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class jdn0 extends d3q<VoiceEndFireListItemView> {

    /* JADX INFO: renamed from: a */
    public ayn0 f120280a;

    /* JADX INFO: renamed from: b */
    public final BLiveVoiceEndSparkRanking f120281b;

    /* JADX INFO: renamed from: c */
    public final nsv<User> f120282c;

    /* JADX INFO: renamed from: d */
    public String f120283d;

    /* JADX INFO: renamed from: e */
    public String f120284e;

    public jdn0(ayn0 ayn0Var, BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking, nsv<User> nsvVar, String str, String str2) {
        this.f120280a = ayn0Var;
        this.f120281b = bLiveVoiceEndSparkRanking;
        this.f120282c = nsvVar;
        this.f120283d = str;
        this.f120284e = str2;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceEndFireListItemView voiceEndFireListItemView) {
        super.mo71749u(voiceEndFireListItemView);
        voiceEndFireListItemView.m79433o(this.f120280a, this.f120281b, this.f120282c, this.f120283d, this.f120284e);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71942v(VoiceEndFireListItemView voiceEndFireListItemView, @NonNull @NotNull List<Object> list) {
        super.mo71942v(voiceEndFireListItemView, list);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceEndFireListItemView voiceEndFireListItemView) {
        super.mo72183w(voiceEndFireListItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199311x8;
    }
}
