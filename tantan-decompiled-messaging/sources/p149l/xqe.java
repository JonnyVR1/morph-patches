package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.view.RectangleLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;

/* JADX INFO: loaded from: classes4.dex */
public class xqe implements s7m<tqe>, dyq {

    /* JADX INFO: renamed from: a */
    public LinearLayout f193997a;

    /* JADX INFO: renamed from: b */
    public View f193998b;

    /* JADX INFO: renamed from: c */
    public RectangleLayout f193999c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f194000d;

    /* JADX INFO: renamed from: e */
    public tqe f194001e;

    /* JADX INFO: renamed from: f */
    public DialogC12611a f194002f;

    /* JADX INFO: renamed from: g */
    public zqe f194003g;

    /* JADX INFO: renamed from: h */
    public e0t f194004h;

    /* JADX INFO: renamed from: i */
    public int f194005i;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f194001e.act();
    }

    /* JADX INFO: renamed from: d */
    public View m210571d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yqe.m215720b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
        m210574i();
        this.f194002f = null;
        this.f193998b = null;
        this.f193999c = null;
        this.f194000d = null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tqe tqeVar) {
        this.f194001e = tqeVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m210573f() {
        byr byrVar = new byr(this.f194001e, d8c0.f84855j, m210571d(act().inflater(), null));
        this.f194002f = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uqe
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f177742a.m210576k(dialogInterface);
            }
        });
        this.f194002f.m71778j0(LiveDialogEnum.EFFECTS_DANMAKU);
        this.f194002f.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.vqe
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f182625a.m210577l(dialogInterface);
            }
        });
        this.f193998b.setOnClickListener(new View.OnClickListener() { // from class: l.wqe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187688a.m210578m(view);
            }
        });
        this.f193999c.setLayoutParams(new LinearLayout.LayoutParams(-1, EffectsDanmakuEvent$Page.getMaxHeight(getContext())));
    }

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        if (this.f194005i != i) {
            this.f194005i = i;
            zqe zqeVar = this.f194003g;
            if (zqeVar != null) {
                zqeVar.mo138984g0(i);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m210574i() {
        DialogC12611a dialogC12611a = this.f194002f;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        zqe zqeVar = this.f194003g;
        if (zqeVar != null) {
            zqeVar.mo138985w();
        }
        m210581q(0);
        this.f194002f.dismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m210575j() {
        DialogC12611a dialogC12611a = this.f194002f;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m210576k(DialogInterface dialogInterface) {
        e0t e0tVar = this.f194004h;
        if (e0tVar != null) {
            e0tVar.m114335b();
            this.f194004h = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m210577l(DialogInterface dialogInterface) {
        if (this.f194004h == null) {
            e0t e0tVar = new e0t(getContext(), this.f194002f.getWindow());
            this.f194004h = e0tVar;
            e0tVar.m114340g(this);
            this.f194004h.m114341h();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m210578m(View view) {
        this.f194001e.m190097M3();
    }

    /* JADX INFO: renamed from: n */
    public void m210579n() {
        if (this.f194002f == null) {
            m210573f();
        }
        this.f194002f.show();
    }

    /* JADX INFO: renamed from: p */
    public void m210580p(zqe zqeVar, oqe oqeVar) {
        zqe zqeVar2 = this.f194003g;
        if (zqeVar2 != null) {
            zqeVar2.mo138985w();
        }
        this.f194003g = zqeVar;
        this.f194000d.removeAllViews();
        this.f194000d.addView(zqeVar.mo138969K());
        zqeVar.mo138979Y0(oqeVar);
    }

    /* JADX INFO: renamed from: q */
    public void m210581q(int i) {
        this.f193999c.setTranslationY(i);
    }
}
