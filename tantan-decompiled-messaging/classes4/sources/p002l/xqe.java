package p002l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p1.mobile.putong.live.base.view.RectangleLayout;
import l.dyq;
import l.e0t;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xqe implements s7m<tqe>, dyq {

    /* JADX INFO: renamed from: a */
    public LinearLayout f22404a;

    /* JADX INFO: renamed from: b */
    public View f22405b;

    /* JADX INFO: renamed from: c */
    public RectangleLayout f22406c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f22407d;

    /* JADX INFO: renamed from: e */
    public tqe f22408e;

    /* JADX INFO: renamed from: f */
    public C0200a f22409f;

    /* JADX INFO: renamed from: g */
    public zqe f22410g;

    /* JADX INFO: renamed from: h */
    public e0t f22411h;

    /* JADX INFO: renamed from: i */
    public int f22412i;

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m26053C0() {
        return this.f22408e.act();
    }

    /* JADX INFO: renamed from: d */
    public View m26054d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yqe.m26886b(this, layoutInflater, viewGroup);
    }

    public void destroy() {
        m26058i();
        this.f22409f = null;
        this.f22405b = null;
        this.f22406c = null;
        this.f22407d = null;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m26059i1(tqe tqeVar) {
        this.f22408e = tqeVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m26056f() {
        byr byrVar = new byr(this.f22408e, d8c0.f9105j, m26054d(act().inflater(), null));
        this.f22409f = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uqe
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f20754a.m26061k(dialogInterface);
            }
        });
        this.f22409f.m5146j0(LiveDialogEnum.EFFECTS_DANMAKU);
        this.f22409f.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.vqe
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f21269a.m26062l(dialogInterface);
            }
        });
        this.f22405b.setOnClickListener(new View.OnClickListener() { // from class: l.wqe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21935a.m26063m(view);
            }
        });
        this.f22406c.setLayoutParams(new LinearLayout.LayoutParams(-1, EffectsDanmakuEvent$Page.getMaxHeight(m26053C0())));
    }

    /* JADX INFO: renamed from: h */
    public void m26057h(int i, int i2) {
        if (this.f22412i != i) {
            this.f22412i = i;
            zqe zqeVar = this.f22410g;
            if (zqeVar != null) {
                zqeVar.mo15527g0(i);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m26058i() {
        a aVar = this.f22409f;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        zqe zqeVar = this.f22410g;
        if (zqeVar != null) {
            zqeVar.mo15528w();
        }
        m26066q(0);
        this.f22409f.dismiss();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m26060j() {
        a aVar = this.f22409f;
        return aVar != null && aVar.isShowing();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m26061k(DialogInterface dialogInterface) {
        e0t e0tVar = this.f22411h;
        if (e0tVar != null) {
            e0tVar.b();
            this.f22411h = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m26062l(DialogInterface dialogInterface) {
        if (this.f22411h == null) {
            e0t e0tVar = new e0t(m26053C0(), this.f22409f.getWindow());
            this.f22411h = e0tVar;
            e0tVar.g(this);
            this.f22411h.h();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m26063m(View view) {
        this.f22408e.m23110M3();
    }

    /* JADX INFO: renamed from: n */
    public void m26064n() {
        if (this.f22409f == null) {
            m26056f();
        }
        this.f22409f.show();
    }

    /* JADX INFO: renamed from: p */
    public void m26065p(zqe zqeVar, oqe oqeVar) {
        zqe zqeVar2 = this.f22410g;
        if (zqeVar2 != null) {
            zqeVar2.mo15528w();
        }
        this.f22410g = zqeVar;
        this.f22407d.removeAllViews();
        this.f22407d.addView(zqeVar.mo15512K());
        zqeVar.mo15522Y0(oqeVar);
    }

    /* JADX INFO: renamed from: q */
    public void m26066q(int i) {
        this.f22406c.setTranslationY(i);
    }
}
