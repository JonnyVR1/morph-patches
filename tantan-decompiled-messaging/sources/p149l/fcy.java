package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;

/* JADX INFO: loaded from: classes11.dex */
public class fcy implements s7m<ecy> {

    /* JADX INFO: renamed from: a */
    public final MemberOnLinePageView f96878a;

    /* JADX INFO: renamed from: b */
    public ecy f96879b;

    public fcy(Act act) {
        this.f96878a = MemberOnLinePageView.m78634o0(act.inflater());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ecy ecyVar) {
        this.f96879b = ecyVar;
    }

    /* JADX INFO: renamed from: b */
    public <VM extends fcy> View m120504b() {
        return this.f96878a;
    }

    /* JADX INFO: renamed from: c */
    public void m120505c(lyn0 lyn0Var) {
        this.f96878a.setMemberData(lyn0Var);
    }

    /* JADX INFO: renamed from: d */
    public void m120506d(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        this.f96878a.m78643v0(str, bLiveVoiceCallInvite);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        this.f96878a.m78641r0(this.f96879b);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
