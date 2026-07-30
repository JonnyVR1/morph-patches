package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetRankListView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetTabView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.Objects;
import l.d30;
import l.e30;
import l.iqo0;
import l.j2g0;
import l.t6c0;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hqo0 extends LiveMenuDialogHolder<gso0> {

    /* JADX INFO: renamed from: k */
    public VImage f14220k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetCpView f14221l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetRankListView f14222m;

    /* JADX INFO: renamed from: n */
    public VImage f14223n;

    /* JADX INFO: renamed from: o */
    public VoiceSweetTabView f14224o;

    /* JADX INFO: renamed from: p */
    public vro0 f14225p;

    /* JADX INFO: renamed from: q */
    public gso0 f14226q;

    public hqo0(Act act, gso0 gso0Var) {
        super(t6c0.sa, act, gso0Var, j2g0.e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m15934M(View view) {
        vro0 vro0Var = this.f14225p;
        if (vro0Var != null) {
            vro0Var.setFocusable(true);
        }
        if (this.f14225p.isShowing()) {
            return;
        }
        this.f14225p.m23702g(this.f14223n, xdl0.O0(this.f14221l) && ((gso0) ((LiveMenuDialogHolder) this).b).m15255s4());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15935C0() {
        return this.f14226q.act();
    }

    /* JADX INFO: renamed from: I */
    public final void m15936I(View view) {
        iqo0.a(this, view);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m15944n(gso0 gso0Var) {
        this.f14226q = gso0Var;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m15938K() {
        if (this.f14226q.m15247g4()) {
            this.f14226q.m15245e4();
        } else {
            p();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m15939L(Integer num) {
        xdl0.M(this.f14221l, num.intValue() == 0);
        xdl0.M(this.f14222m, num.intValue() == 1);
        this.f14226q.m15252p4(num.intValue());
    }

    /* JADX INFO: renamed from: N */
    public final void m15940N() {
        if (xdl0.O0(this.f14221l)) {
            return;
        }
        this.f14224o.m8768f(0);
    }

    /* JADX INFO: renamed from: O */
    public void m15941O(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        E();
        m15940N();
        if (voiceCpBindMessage == null) {
            this.f14221l.m8716A();
        }
    }

    public void destroy() {
        super.destroy();
        vro0 vro0Var = this.f14225p;
        if (vro0Var == null || !vro0Var.isShowing()) {
            return;
        }
        this.f14225p.dismiss();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m15943m(View view) {
        m15936I(view);
        this.f14224o.m8769g(R.string.fi, R.string.vj);
        this.f14224o.setMargin(true);
        A(80);
        z(LiveDialogEnum.VOICE_SWEET_CP);
        y(new a.c() { // from class: l.bqo0
            /* JADX INFO: renamed from: o */
            public final void m12190o() {
                this.f10238a.m15938K();
            }
        });
        this.f14224o.setOnTabSelectedListener(new e30() { // from class: l.cqo0
            public final void call(Object obj) {
                this.f10730a.m15939L((Integer) obj);
            }
        });
        Context contextM15935C0 = m15935C0();
        final gso0 gso0Var = (gso0) ((LiveMenuDialogHolder) this).b;
        Objects.requireNonNull(gso0Var);
        d30 d30Var = new d30() { // from class: l.dqo0
            public final void call() {
                gso0Var.m15254r4();
            }
        };
        final gso0 gso0Var2 = (gso0) ((LiveMenuDialogHolder) this).b;
        Objects.requireNonNull(gso0Var2);
        d30 d30Var2 = new d30() { // from class: l.eqo0
            public final void call() {
                gso0Var2.m15259v4();
            }
        };
        final gso0 gso0Var3 = (gso0) ((LiveMenuDialogHolder) this).b;
        Objects.requireNonNull(gso0Var3);
        this.f14225p = new vro0(contextM15935C0, d30Var, d30Var2, new d30() { // from class: l.fqo0
            public final void call() {
                gso0Var3.m15253q4();
            }
        });
        xdl0.E0(this.f14223n, new View.OnClickListener() { // from class: l.gqo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13693a.m15934M(view2);
            }
        });
    }
}
