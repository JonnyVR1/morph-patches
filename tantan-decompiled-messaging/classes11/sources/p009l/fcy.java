package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fcy implements s7m<ecy> {

    /* JADX INFO: renamed from: a */
    public final MemberOnLinePageView f12939a;

    /* JADX INFO: renamed from: b */
    public ecy f12940b;

    public fcy(Act act) {
        this.f12939a = MemberOnLinePageView.m8850o0(act.inflater());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14376C0() {
        return null;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m14381i1(ecy ecyVar) {
        this.f12940b = ecyVar;
    }

    /* JADX INFO: renamed from: b */
    public <VM extends fcy> View m14378b() {
        return this.f12939a;
    }

    /* JADX INFO: renamed from: c */
    public void m14379c(lyn0 lyn0Var) {
        this.f12939a.setMemberData(lyn0Var);
    }

    /* JADX INFO: renamed from: d */
    public void m14380d(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        this.f12939a.m8859v0(str, bLiveVoiceCallInvite);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        this.f12939a.m8857r0(this.f12940b);
    }

    public void destroy() {
    }
}
