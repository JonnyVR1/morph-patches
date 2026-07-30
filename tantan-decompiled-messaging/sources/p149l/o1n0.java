package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.VoiceConversationsEntryInternal;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class o1n0 implements a8m {

    /* JADX INFO: renamed from: a */
    public VoiceConversationsEntryInternal f141463a;

    /* JADX INFO: renamed from: b */
    public i2n0 f141464b;

    /* JADX INFO: renamed from: c */
    public C22392a<Integer> f141465c = C22392a.m221513c(0);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m162268a(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        return (!NullChecker.m81303a(liveVoiceInternalEntryBean) || (TextUtils.isEmpty(liveVoiceInternalEntryBean.getTitle()) && TextUtils.isEmpty(liveVoiceInternalEntryBean.getSubTitle()) && vwb.m200296J(liveVoiceInternalEntryBean.getHeadSculptureList()))) ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: d */
    public C22392a<Integer> mo95350d() {
        return this.f141465c;
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: e */
    public void mo95351e(Frag frag, ViewGroup viewGroup, @NonNull ViewGroup.LayoutParams layoutParams) {
        VoiceConversationsEntryInternal voiceConversationsEntryInternal = this.f141463a;
        if (voiceConversationsEntryInternal == null || voiceConversationsEntryInternal.getParent() != viewGroup) {
            VoiceConversationsEntryInternal voiceConversationsEntryInternal2 = (VoiceConversationsEntryInternal) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162708T1, viewGroup, false);
            this.f141463a = voiceConversationsEntryInternal2;
            voiceConversationsEntryInternal2.setLayoutParams(layoutParams);
            viewGroup.addView(this.f141463a);
            i2n0 i2n0Var = new i2n0(frag);
            this.f141464b = i2n0Var;
            i2n0Var.mo51532C(this.f141463a);
            this.f141464b.mo39470a0();
        }
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: f */
    public C22306c<Boolean> mo95352f() {
        return LiveVoiceInternalSquareApi.getVoiceSummaryEntryData().map(new w9j() { // from class: l.n1n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return o1n0.m162268a((LiveVoiceInternalEntryBean) obj);
            }
        });
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: g */
    public void mo95353g() {
        VoiceConversationsEntryInternal voiceConversationsEntryInternal = this.f141463a;
        if (voiceConversationsEntryInternal != null) {
            voiceConversationsEntryInternal.m69845e(true);
        }
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: h */
    public void mo95354h() {
        i2n0 i2n0Var = this.f141464b;
        if (i2n0Var != null) {
            i2n0Var.m134072A0();
        }
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: j */
    public void mo95356j() {
        i2n0 i2n0Var = this.f141464b;
        if (i2n0Var != null) {
            i2n0Var.m134080z0();
        }
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: c */
    public void mo95349c() {
    }

    @Override // p149l.a8m
    /* JADX INFO: renamed from: i */
    public void mo95355i(Frag frag, ViewGroup viewGroup, @NonNull ViewGroup.LayoutParams layoutParams) {
    }
}
