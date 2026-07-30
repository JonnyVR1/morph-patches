package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogContentView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import p151v.VRadioButton;

/* JADX INFO: loaded from: classes9.dex */
public class jku implements iam<vlu<?>> {

    /* JADX INFO: renamed from: a */
    public vlu<?> f121447a;

    /* JADX INFO: renamed from: b */
    public LiveVChatGiftDialogContentView f121448b;

    /* JADX INFO: renamed from: c */
    public DialogC12774a f121449c;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m145905b(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m145911A() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m70560q0();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m145912B(Act act, final y20<Boolean> y20Var, final y20<Boolean> y20Var2, long j) {
        m145917m();
        View viewInflate = act.inflater().inflate(xec0.f193881k, (ViewGroup) null);
        DialogC12774a dialogC12774a = new DialogC12774a(act, viewInflate);
        this.f121449c = dialogC12774a;
        dialogC12774a.m72954c0(hgc0.f109384a);
        View viewFindViewById = viewInflate.findViewById(ldc0.f131522Z);
        final VRadioButton vRadioButton = (VRadioButton) viewInflate.findViewById(ldc0.f131438B);
        TextView textView = (TextView) viewInflate.findViewById(ldc0.f131446D);
        vRadioButton.setSelected(false);
        View viewFindViewById2 = viewInflate.findViewById(ldc0.f131442C);
        TextView textView2 = (TextView) viewInflate.findViewById(ldc0.f131500R1);
        TextView textView3 = (TextView) viewInflate.findViewById(ldc0.f131434A);
        TextView textView4 = (TextView) viewInflate.findViewById(ldc0.f131466I);
        m145927z(textView2);
        m145927z(textView3);
        m145927z(textView4);
        m145927z(textView);
        textView2.setText(zrv.f205803e.getString(u8n.m195065a() ? R$string.f45713D : R$string.f45711C, Long.valueOf(j)));
        textView3.setText(zrv.f205803e.getString(R$string.f45751h));
        textView4.setText(zrv.f205803e.getString(R$string.f45715E));
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.dku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VRadioButton vRadioButton2 = vRadioButton;
                vRadioButton2.setSelected(!vRadioButton2.isSelected());
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.eku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94434a.m145923v(view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.fku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jku.m145905b(view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.gku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104771a.m145924w(y20Var2, vRadioButton, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: l.hku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110455a.m145925x(y20Var, vRadioButton, view);
            }
        });
        this.f121449c.show();
    }

    /* JADX INFO: renamed from: C */
    public void m145913C(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m70561r0(jjsVar, bLiveGivenGiftBrief);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        if (liveVChatGiftDialogContentView != null) {
            return liveVChatGiftDialogContentView.getContext();
        }
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m70559p0();
        }
        m145916l();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        if (liveVChatGiftDialogContentView == null) {
            return false;
        }
        return liveVChatGiftDialogContentView.isShowing();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vlu<?> vluVar) {
        this.f121447a = vluVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m145915k() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m70556m0();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m145916l() {
        if (this.f121448b.getDialog() != null && this.f121448b.isShowing()) {
            this.f121448b.getDialog().dismiss();
        }
        juj.m146987a();
    }

    /* JADX INFO: renamed from: m */
    public final void m145917m() {
        DialogC12774a dialogC12774a = this.f121449c;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
            this.f121449c = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m145918n() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        if (liveVChatGiftDialogContentView != null) {
            return liveVChatGiftDialogContentView.getCurrentShowGiftPanel().f46011f.getCurrentItem();
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public e060 m145919p() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        return liveVChatGiftDialogContentView != null ? liveVChatGiftDialogContentView.getFlyDestination() : e060.m118784c();
    }

    /* JADX INFO: renamed from: q */
    public boolean m145920q() {
        return this.f121448b.f46002g.f46014i != -1;
    }

    /* JADX INFO: renamed from: s */
    public void m145921s(Act act) {
        if (this.f121448b == null) {
            LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = new LiveVChatGiftDialogContentView(act);
            this.f121448b = liveVChatGiftDialogContentView;
            liveVChatGiftDialogContentView.m70554k0(this.f121447a, new x20() { // from class: l.bku
                @Override // p153l.x20
                public final void call() {
                    this.f77125a.m145916l();
                }
            }, new DialogInterface.OnDismissListener() { // from class: l.cku
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f82314a.m145922u(dialogInterface);
                }
            });
            this.f121447a.m201696S3(this.f121448b);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m145922u(DialogInterface dialogInterface) {
        vlu<?> vluVar = this.f121447a;
        if (vluVar != null) {
            vluVar.m201694P3();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m145923v(View view) {
        m145917m();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m145924w(y20 y20Var, VRadioButton vRadioButton, View view) {
        y20Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m145917m();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m145925x(y20 y20Var, VRadioButton vRadioButton, View view) {
        y20Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m145917m();
    }

    /* JADX INFO: renamed from: y */
    public void m145926y(xxj xxjVar) {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f121448b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m70558o0(xxjVar);
            l51.m152887G(new Runnable() { // from class: l.iku
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115450a.m145915k();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m145927z(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }
}
