package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.external.voice.entry.VoiceConversationsEntry;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class qan0 implements qam {

    /* JADX INFO: renamed from: a */
    public VoiceConversationsEntry f156397a;

    /* JADX INFO: renamed from: b */
    public ybn0 f156398b;

    /* JADX INFO: renamed from: c */
    public C22507a<Integer> f156399c = C22507a.m222759c(0);

    @Override // p153l.qam
    /* JADX INFO: renamed from: c */
    public void mo175946c() {
        ybn0 ybn0Var = this.f156398b;
        if (ybn0Var != null) {
            ybn0Var.m215102x0();
        }
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: d */
    public C22507a<Integer> mo175947d() {
        return this.f156399c;
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: f */
    public C22421c<Boolean> mo175949f() {
        return C22507a.m222758b();
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: i */
    public void mo175952i(Frag frag, ViewGroup viewGroup, @NonNull ViewGroup.LayoutParams layoutParams) {
        VoiceConversationsEntry voiceConversationsEntry = this.f156397a;
        if (voiceConversationsEntry == null || voiceConversationsEntry.getParent() != viewGroup) {
            VoiceConversationsEntry voiceConversationsEntry2 = (VoiceConversationsEntry) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193819S1, viewGroup, false);
            this.f156397a = voiceConversationsEntry2;
            voiceConversationsEntry2.setLayoutParams(layoutParams);
            viewGroup.addView(this.f156397a);
            ybn0 ybn0Var = new ybn0(frag);
            this.f156398b = ybn0Var;
            ybn0Var.mo52715C(this.f156397a);
            this.f156398b.mo40473a0();
        }
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: g */
    public void mo175950g() {
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: h */
    public void mo175951h() {
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: j */
    public void mo175953j() {
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: e */
    public void mo175948e(Frag frag, ViewGroup viewGroup, @NonNull ViewGroup.LayoutParams layoutParams) {
    }
}
