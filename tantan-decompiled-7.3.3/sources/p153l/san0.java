package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.VoiceConversationsEntryInternal;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class san0 implements qam {

    /* JADX INFO: renamed from: a */
    public VoiceConversationsEntryInternal f167057a;

    /* JADX INFO: renamed from: b */
    public mbn0 f167058b;

    /* JADX INFO: renamed from: c */
    public C22507a<Integer> f167059c = C22507a.m222759c(0);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m185271a(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        return (!NullChecker.m82486a(liveVoiceInternalEntryBean) || (TextUtils.isEmpty(liveVoiceInternalEntryBean.getTitle()) && TextUtils.isEmpty(liveVoiceInternalEntryBean.getSubTitle()) && jyb.m147479J(liveVoiceInternalEntryBean.getHeadSculptureList()))) ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: d */
    public C22507a<Integer> mo175947d() {
        return this.f167059c;
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: e */
    public void mo175948e(Frag frag, ViewGroup viewGroup, @NonNull ViewGroup.LayoutParams layoutParams) {
        VoiceConversationsEntryInternal voiceConversationsEntryInternal = this.f167057a;
        if (voiceConversationsEntryInternal == null || voiceConversationsEntryInternal.getParent() != viewGroup) {
            VoiceConversationsEntryInternal voiceConversationsEntryInternal2 = (VoiceConversationsEntryInternal) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193822T1, viewGroup, false);
            this.f167057a = voiceConversationsEntryInternal2;
            voiceConversationsEntryInternal2.setLayoutParams(layoutParams);
            viewGroup.addView(this.f167057a);
            mbn0 mbn0Var = new mbn0(frag);
            this.f167058b = mbn0Var;
            mbn0Var.mo52715C(this.f167057a);
            this.f167058b.mo40473a0();
        }
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: f */
    public C22421c<Boolean> mo175949f() {
        return LiveVoiceInternalSquareApi.getVoiceSummaryEntryData().map(new qcj() { // from class: l.ran0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return san0.m185271a((LiveVoiceInternalEntryBean) obj);
            }
        });
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: g */
    public void mo175950g() {
        VoiceConversationsEntryInternal voiceConversationsEntryInternal = this.f167057a;
        if (voiceConversationsEntryInternal != null) {
            voiceConversationsEntryInternal.m71028e(true);
        }
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: h */
    public void mo175951h() {
        mbn0 mbn0Var = this.f167058b;
        if (mbn0Var != null) {
            mbn0Var.m157806A0();
        }
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: j */
    public void mo175953j() {
        mbn0 mbn0Var = this.f167058b;
        if (mbn0Var != null) {
            mbn0Var.m157814z0();
        }
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: c */
    public void mo175946c() {
    }

    @Override // p153l.qam
    /* JADX INFO: renamed from: i */
    public void mo175952i(Frag frag, ViewGroup viewGroup, @NonNull ViewGroup.LayoutParams layoutParams) {
    }
}
