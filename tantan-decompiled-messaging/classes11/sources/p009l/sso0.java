package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import l.aq2;
import l.t6c0;
import l.tso0;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sso0 extends LiveMenuDialogHolder<nqo0> {

    /* JADX INFO: renamed from: k */
    public VImage f20451k;

    /* JADX INFO: renamed from: l */
    public VText f20452l;

    /* JADX INFO: renamed from: m */
    public VText f20453m;

    /* JADX INFO: renamed from: n */
    public VoiceSweet.VoiceCpBindMessage f20454n;

    public sso0(Act act, nqo0 nqo0Var, aq2 aq2Var) {
        super(t6c0.ya, act, nqo0Var, aq2Var);
        B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m22375J(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m22376K(View view) {
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19037Y3(this.f20454n);
        p();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22377C0() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m22378H(View view) {
        tso0.a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m22380L(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage == null) {
            return;
        }
        this.f20454n = voiceCpBindMessage;
        E();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m22382m(View view) {
        super.m(view);
        m22378H(view);
        xdl0.E0(this.f20451k, new View.OnClickListener() { // from class: l.qso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19519a.m22375J(view2);
            }
        });
        xdl0.E0(this.f20453m, new View.OnClickListener() { // from class: l.rso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19968a.m22376K(view2);
            }
        });
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m22383n(nqo0 nqo0Var) {
    }
}
