package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.view.RectangleLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;

/* JADX INFO: loaded from: classes4.dex */
public class bse implements iam<xre>, d0r {

    /* JADX INFO: renamed from: a */
    public LinearLayout f78143a;

    /* JADX INFO: renamed from: b */
    public View f78144b;

    /* JADX INFO: renamed from: c */
    public RectangleLayout f78145c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f78146d;

    /* JADX INFO: renamed from: e */
    public xre f78147e;

    /* JADX INFO: renamed from: f */
    public DialogC12774a f78148f;

    /* JADX INFO: renamed from: g */
    public dse f78149g;

    /* JADX INFO: renamed from: h */
    public f2t f78150h;

    /* JADX INFO: renamed from: i */
    public int f78151i;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f78147e.act();
    }

    /* JADX INFO: renamed from: d */
    public View m106223d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cse.m112175b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
        m106226i();
        this.f78148f = null;
        this.f78144b = null;
        this.f78145c = null;
        this.f78146d = null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xre xreVar) {
        this.f78147e = xreVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m106225f() {
        c0s c0sVar = new c0s(this.f78147e, jgc0.f120703j, m106223d(act().inflater(), null));
        this.f78148f = c0sVar;
        c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yre
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f201307a.m106228k(dialogInterface);
            }
        });
        this.f78148f.m72961j0(LiveDialogEnum.EFFECTS_DANMAKU);
        this.f78148f.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.zre
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f205751a.m106229l(dialogInterface);
            }
        });
        this.f78144b.setOnClickListener(new View.OnClickListener() { // from class: l.ase
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73106a.m106230m(view);
            }
        });
        this.f78145c.setLayoutParams(new LinearLayout.LayoutParams(-1, EffectsDanmakuEvent$Page.getMaxHeight(getContext())));
    }

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        if (this.f78151i != i) {
            this.f78151i = i;
            dse dseVar = this.f78149g;
            if (dseVar != null) {
                dseVar.mo117727g0(i);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m106226i() {
        DialogC12774a dialogC12774a = this.f78148f;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        dse dseVar = this.f78149g;
        if (dseVar != null) {
            dseVar.mo117728w();
        }
        m106233q(0);
        this.f78148f.dismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m106227j() {
        DialogC12774a dialogC12774a = this.f78148f;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m106228k(DialogInterface dialogInterface) {
        f2t f2tVar = this.f78150h;
        if (f2tVar != null) {
            f2tVar.m123672b();
            this.f78150h = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m106229l(DialogInterface dialogInterface) {
        if (this.f78150h == null) {
            f2t f2tVar = new f2t(getContext(), this.f78148f.getWindow());
            this.f78150h = f2tVar;
            f2tVar.m123677g(this);
            this.f78150h.m123678h();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m106230m(View view) {
        this.f78147e.m212815M3();
    }

    /* JADX INFO: renamed from: n */
    public void m106231n() {
        if (this.f78148f == null) {
            m106225f();
        }
        this.f78148f.show();
    }

    /* JADX INFO: renamed from: p */
    public void m106232p(dse dseVar, sre sreVar) {
        dse dseVar2 = this.f78149g;
        if (dseVar2 != null) {
            dseVar2.mo117728w();
        }
        this.f78149g = dseVar;
        this.f78146d.removeAllViews();
        this.f78146d.addView(dseVar.mo117724K());
        dseVar.mo117726Y0(sreVar);
    }

    /* JADX INFO: renamed from: q */
    public void m106233q(int i) {
        this.f78145c.setTranslationY(i);
    }
}
