package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;

/* JADX INFO: loaded from: classes10.dex */
public class cly implements iam<bly> {

    /* JADX INFO: renamed from: a */
    public final MemberOnLinePageView f82436a;

    /* JADX INFO: renamed from: b */
    public bly f82437b;

    public cly(Act act) {
        this.f82436a = MemberOnLinePageView.m79817o0(act.inflater());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bly blyVar) {
        this.f82437b = blyVar;
    }

    /* JADX INFO: renamed from: b */
    public <VM extends cly> View m110710b() {
        return this.f82436a;
    }

    /* JADX INFO: renamed from: c */
    public void m110711c(p7o0 p7o0Var) {
        this.f82436a.setMemberData(p7o0Var);
    }

    /* JADX INFO: renamed from: d */
    public void m110712d(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        this.f82436a.m79826v0(str, bLiveVoiceCallInvite);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        this.f82436a.m79824r0(this.f82437b);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
