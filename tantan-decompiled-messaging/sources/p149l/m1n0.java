package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.external.voice.entry.VoiceConversationsEntry;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class m1n0 implements a8m {

    /* JADX INFO: renamed from: a */
    public VoiceConversationsEntry f130839a;

    /* JADX INFO: renamed from: b */
    public u2n0 f130840b;

    /* JADX INFO: renamed from: c */
    public C22392a<Integer> f130841c = C22392a.m221513c(0);

    @Override // p149l.a8m
    /* JADX INFO: renamed from: c */
    public void mo95349c() {
        u2n0 u2n0Var = this.f130840b;
        if (u2n0Var != null) {
            u2n0Var.m191543x0();
        }
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: d */
    public C22392a<Integer> mo95350d() {
        return this.f130841c;
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: f */
    public C22306c<Boolean> mo95352f() {
        return C22392a.m221512b();
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: i */
    public void mo95355i(Frag frag, ViewGroup viewGroup, @NonNull ViewGroup.LayoutParams layoutParams) {
        VoiceConversationsEntry voiceConversationsEntry = this.f130839a;
        if (voiceConversationsEntry == null || voiceConversationsEntry.getParent() != viewGroup) {
            VoiceConversationsEntry voiceConversationsEntry2 = (VoiceConversationsEntry) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162705S1, viewGroup, false);
            this.f130839a = voiceConversationsEntry2;
            voiceConversationsEntry2.setLayoutParams(layoutParams);
            viewGroup.addView(this.f130839a);
            u2n0 u2n0Var = new u2n0(frag);
            this.f130840b = u2n0Var;
            u2n0Var.mo51532C(this.f130839a);
            this.f130840b.mo39470a0();
        }
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: g */
    public void mo95353g() {
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: h */
    public void mo95354h() {
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: j */
    public void mo95356j() {
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: e */
    public void mo95351e(Frag frag, ViewGroup viewGroup, @NonNull ViewGroup.LayoutParams layoutParams) {
    }
}
