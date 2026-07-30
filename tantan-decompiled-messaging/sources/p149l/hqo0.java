package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetRankListView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetTabView;
import java.util.Objects;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class hqo0 extends LiveMenuDialogHolder<gso0> {

    /* JADX INFO: renamed from: k */
    public VImage f109081k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetCpView f109082l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetRankListView f109083m;

    /* JADX INFO: renamed from: n */
    public VImage f109084n;

    /* JADX INFO: renamed from: o */
    public VoiceSweetTabView f109085o;

    /* JADX INFO: renamed from: p */
    public vro0 f109086p;

    /* JADX INFO: renamed from: q */
    public gso0 f109087q;

    public hqo0(Act act, gso0 gso0Var) {
        super(t6c0.f168516sa, act, gso0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m132493M(View view) {
        vro0 vro0Var = this.f109086p;
        if (vro0Var != null) {
            vro0Var.setFocusable(true);
        }
        if (this.f109086p.isShowing()) {
            return;
        }
        this.f109086p.m199748g(this.f109084n, xdl0.m208349O0(this.f109082l) && ((gso0) this.f47757b).m127834s4());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f109087q.act();
    }

    /* JADX INFO: renamed from: I */
    public final void m132494I(View view) {
        iqo0.m137782a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gso0 gso0Var) {
        this.f109087q = gso0Var;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m132496K() {
        if (this.f109087q.m127827g4()) {
            this.f109087q.m127825e4();
        } else {
            mo71838p();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m132497L(Integer num) {
        xdl0.m208344M(this.f109082l, num.intValue() == 0);
        xdl0.m208344M(this.f109083m, num.intValue() == 1);
        this.f109087q.m127831p4(num.intValue());
    }

    /* JADX INFO: renamed from: N */
    public final void m132498N() {
        if (xdl0.m208349O0(this.f109082l)) {
            return;
        }
        this.f109085o.m78555f(0);
    }

    /* JADX INFO: renamed from: O */
    public void m132499O(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        m71834E();
        m132498N();
        if (voiceCpBindMessage == null) {
            this.f109082l.m78507A();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
        vro0 vro0Var = this.f109086p;
        if (vro0Var == null || !vro0Var.isShowing()) {
            return;
        }
        this.f109086p.dismiss();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m132494I(view);
        this.f109085o.m78556g(R$string.f47242fi, R$string.f47594vj);
        this.f109085o.setMargin(true);
        m71831A(80);
        m71844z(LiveDialogEnum.VOICE_SWEET_CP);
        m71843y(new DialogC12611a.c() { // from class: l.bqo0
            @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a.c
            /* JADX INFO: renamed from: o */
            public final void mo71784o() {
                this.f76796a.m132496K();
            }
        });
        this.f109085o.setOnTabSelectedListener(new e30() { // from class: l.cqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82100a.m132497L((Integer) obj);
            }
        });
        Context context = getContext();
        final gso0 gso0Var = (gso0) this.f47757b;
        Objects.requireNonNull(gso0Var);
        d30 d30Var = new d30() { // from class: l.dqo0
            @Override // p149l.d30
            public final void call() {
                gso0Var.m127833r4();
            }
        };
        final gso0 gso0Var2 = (gso0) this.f47757b;
        Objects.requireNonNull(gso0Var2);
        d30 d30Var2 = new d30() { // from class: l.eqo0
            @Override // p149l.d30
            public final void call() {
                gso0Var2.m127837v4();
            }
        };
        final gso0 gso0Var3 = (gso0) this.f47757b;
        Objects.requireNonNull(gso0Var3);
        this.f109086p = new vro0(context, d30Var, d30Var2, new d30() { // from class: l.fqo0
            @Override // p149l.d30
            public final void call() {
                gso0Var3.m127832q4();
            }
        });
        xdl0.m208329E0(this.f109084n, new View.OnClickListener() { // from class: l.gqo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f103967a.m132493M(view2);
            }
        });
    }
}
