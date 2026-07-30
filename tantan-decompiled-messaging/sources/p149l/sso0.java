package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class sso0 extends LiveMenuDialogHolder<nqo0> {

    /* JADX INFO: renamed from: k */
    public VImage f166231k;

    /* JADX INFO: renamed from: l */
    public VText f166232l;

    /* JADX INFO: renamed from: m */
    public VText f166233m;

    /* JADX INFO: renamed from: n */
    public VoiceSweet.VoiceCpBindMessage f166234n;

    public sso0(Act act, nqo0 nqo0Var, aq2 aq2Var) {
        super(t6c0.f168594ya, act, nqo0Var, aq2Var);
        m71832B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m185767J(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m185768K(View view) {
        ((nqo0) this.f47757b).m160657Y3(this.f166234n);
        mo71838p();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m185769H(View view) {
        tso0.m190567a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m185771L(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage == null) {
            return;
        }
        this.f166234n = voiceCpBindMessage;
        m71834E();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m185769H(view);
        xdl0.m208329E0(this.f166231k, new View.OnClickListener() { // from class: l.qso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f156263a.m185767J(view2);
            }
        });
        xdl0.m208329E0(this.f166233m, new View.OnClickListener() { // from class: l.rso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f160882a.m185768K(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nqo0 nqo0Var) {
    }
}
