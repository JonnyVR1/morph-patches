package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetRankListView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetTabView;
import java.util.Objects;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class lzo0 extends LiveMenuDialogHolder<k1p0> {

    /* JADX INFO: renamed from: k */
    public VImage f134241k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetCpView f134242l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetRankListView f134243m;

    /* JADX INFO: renamed from: n */
    public VImage f134244n;

    /* JADX INFO: renamed from: o */
    public VoiceSweetTabView f134245o;

    /* JADX INFO: renamed from: p */
    public z0p0 f134246p;

    /* JADX INFO: renamed from: q */
    public k1p0 f134247q;

    public lzo0(Act act, k1p0 k1p0Var) {
        super(yec0.f199248sa, act, k1p0Var, qag0.m175924e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m156452M(View view) {
        z0p0 z0p0Var = this.f134246p;
        if (z0p0Var != null) {
            z0p0Var.setFocusable(true);
        }
        if (this.f134246p.isShowing()) {
            return;
        }
        this.f134246p.m218146g(this.f134244n, bnl0.m105529O0(this.f134242l) && ((k1p0) this.f48605b).m147920s4());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f134247q.act();
    }

    /* JADX INFO: renamed from: I */
    public final void m156453I(View view) {
        mzo0.m160916a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(k1p0 k1p0Var) {
        this.f134247q = k1p0Var;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m156455K() {
        if (this.f134247q.m147913g4()) {
            this.f134247q.m147911e4();
        } else {
            mo73021p();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m156456L(Integer num) {
        bnl0.m105524M(this.f134242l, num.intValue() == 0);
        bnl0.m105524M(this.f134243m, num.intValue() == 1);
        this.f134247q.m147917p4(num.intValue());
    }

    /* JADX INFO: renamed from: N */
    public final void m156457N() {
        if (bnl0.m105529O0(this.f134242l)) {
            return;
        }
        this.f134245o.m79738f(0);
    }

    /* JADX INFO: renamed from: O */
    public void m156458O(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        m73017E();
        m156457N();
        if (voiceCpBindMessage == null) {
            this.f134242l.m79690A();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
        z0p0 z0p0Var = this.f134246p;
        if (z0p0Var == null || !z0p0Var.isShowing()) {
            return;
        }
        this.f134246p.dismiss();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m156453I(view);
        this.f134245o.m79739g(R$string.f48090fi, R$string.f48442vj);
        this.f134245o.setMargin(true);
        m73014A(80);
        m73027z(LiveDialogEnum.VOICE_SWEET_CP);
        m73026y(new DialogC12774a.c() { // from class: l.fzo0
            @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a.c
            /* JADX INFO: renamed from: o */
            public final void mo72967o() {
                this.f101492a.m156455K();
            }
        });
        this.f134245o.setOnTabSelectedListener(new y20() { // from class: l.gzo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107217a.m156456L((Integer) obj);
            }
        });
        Context context = getContext();
        final k1p0 k1p0Var = (k1p0) this.f48605b;
        Objects.requireNonNull(k1p0Var);
        x20 x20Var = new x20() { // from class: l.hzo0
            @Override // p153l.x20
            public final void call() {
                k1p0Var.m147919r4();
            }
        };
        final k1p0 k1p0Var2 = (k1p0) this.f48605b;
        Objects.requireNonNull(k1p0Var2);
        x20 x20Var2 = new x20() { // from class: l.izo0
            @Override // p153l.x20
            public final void call() {
                k1p0Var2.m147923v4();
            }
        };
        final k1p0 k1p0Var3 = (k1p0) this.f48605b;
        Objects.requireNonNull(k1p0Var3);
        this.f134246p = new z0p0(context, x20Var, x20Var2, new x20() { // from class: l.jzo0
            @Override // p153l.x20
            public final void call() {
                k1p0Var3.m147918q4();
            }
        });
        bnl0.m105509E0(this.f134244n, new View.OnClickListener() { // from class: l.kzo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f129439a.m156452M(view2);
            }
        });
    }
}
