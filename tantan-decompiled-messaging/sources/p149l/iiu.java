package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogContentView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import p147v.VRadioButton;

/* JADX INFO: loaded from: classes13.dex */
public class iiu implements s7m<uju<?>> {

    /* JADX INFO: renamed from: a */
    public uju<?> f113443a;

    /* JADX INFO: renamed from: b */
    public LiveVChatGiftDialogContentView f113444b;

    /* JADX INFO: renamed from: c */
    public DialogC12611a f113445c;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m136457b(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m136463A() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m69377q0();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m136464B(Act act, final e30<Boolean> e30Var, final e30<Boolean> e30Var2, long j) {
        m136469m();
        View viewInflate = act.inflater().inflate(s6c0.f162767k, (ViewGroup) null);
        DialogC12611a dialogC12611a = new DialogC12611a(act, viewInflate);
        this.f113445c = dialogC12611a;
        dialogC12611a.m71771c0(c8c0.f79736a);
        View viewFindViewById = viewInflate.findViewById(f5c0.f95065Z);
        final VRadioButton vRadioButton = (VRadioButton) viewInflate.findViewById(f5c0.f94981B);
        TextView textView = (TextView) viewInflate.findViewById(f5c0.f94989D);
        vRadioButton.setSelected(false);
        View viewFindViewById2 = viewInflate.findViewById(f5c0.f94985C);
        TextView textView2 = (TextView) viewInflate.findViewById(f5c0.f95043R1);
        TextView textView3 = (TextView) viewInflate.findViewById(f5c0.f94977A);
        TextView textView4 = (TextView) viewInflate.findViewById(f5c0.f95009I);
        m136479z(textView2);
        m136479z(textView3);
        m136479z(textView4);
        m136479z(textView);
        textView2.setText(ypv.f199497e.getString(u6n.m192015a() ? R$string.f44865D : R$string.f44863C, Long.valueOf(j)));
        textView3.setText(ypv.f199497e.getString(R$string.f44903h));
        textView4.setText(ypv.f199497e.getString(R$string.f44867E));
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.ciu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VRadioButton vRadioButton2 = vRadioButton;
                vRadioButton2.setSelected(!vRadioButton2.isSelected());
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.diu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86426a.m136475v(view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.eiu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iiu.m136457b(view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.fiu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97721a.m136476w(e30Var2, vRadioButton, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: l.giu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102966a.m136477x(e30Var, vRadioButton, view);
            }
        });
        this.f113445c.show();
    }

    /* JADX INFO: renamed from: C */
    public void m136465C(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m69378r0(ihsVar, bLiveGivenGiftBrief);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        if (liveVChatGiftDialogContentView != null) {
            return liveVChatGiftDialogContentView.getContext();
        }
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m69376p0();
        }
        m136468l();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        if (liveVChatGiftDialogContentView == null) {
            return false;
        }
        return liveVChatGiftDialogContentView.isShowing();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(uju<?> ujuVar) {
        this.f113443a = ujuVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m136467k() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m69373m0();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m136468l() {
        if (this.f113444b.getDialog() != null && this.f113444b.isShowing()) {
            this.f113444b.getDialog().dismiss();
        }
        trj.m190420a();
    }

    /* JADX INFO: renamed from: m */
    public final void m136469m() {
        DialogC12611a dialogC12611a = this.f113445c;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
            this.f113445c = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m136470n() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        if (liveVChatGiftDialogContentView != null) {
            return liveVChatGiftDialogContentView.getCurrentShowGiftPanel().f45163f.getCurrentItem();
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public yr50 m136471p() {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        return liveVChatGiftDialogContentView != null ? liveVChatGiftDialogContentView.getFlyDestination() : yr50.m215781c();
    }

    /* JADX INFO: renamed from: q */
    public boolean m136472q() {
        return this.f113444b.f45154g.f45166i != -1;
    }

    /* JADX INFO: renamed from: s */
    public void m136473s(Act act) {
        if (this.f113444b == null) {
            LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = new LiveVChatGiftDialogContentView(act);
            this.f113444b = liveVChatGiftDialogContentView;
            liveVChatGiftDialogContentView.m69371k0(this.f113443a, new d30() { // from class: l.aiu
                @Override // p149l.d30
                public final void call() {
                    this.f70067a.m136468l();
                }
            }, new DialogInterface.OnDismissListener() { // from class: l.biu
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f75838a.m136474u(dialogInterface);
                }
            });
            this.f113443a.m194066S3(this.f113444b);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m136474u(DialogInterface dialogInterface) {
        uju<?> ujuVar = this.f113443a;
        if (ujuVar != null) {
            ujuVar.m194064P3();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m136475v(View view) {
        m136469m();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m136476w(e30 e30Var, VRadioButton vRadioButton, View view) {
        e30Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m136469m();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m136477x(e30 e30Var, VRadioButton vRadioButton, View view) {
        e30Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m136469m();
    }

    /* JADX INFO: renamed from: y */
    public void m136478y(hvj hvjVar) {
        LiveVChatGiftDialogContentView liveVChatGiftDialogContentView = this.f113444b;
        if (liveVChatGiftDialogContentView != null) {
            liveVChatGiftDialogContentView.m69375o0(hvjVar);
            e51.m114742G(new Runnable() { // from class: l.hiu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107970a.m136467k();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m136479z(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }
}
