package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatSummary;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class wl0 implements iam<sl0> {

    /* JADX INFO: renamed from: a */
    public VImage f189614a;

    /* JADX INFO: renamed from: b */
    public VText f189615b;

    /* JADX INFO: renamed from: c */
    public VText f189616c;

    /* JADX INFO: renamed from: d */
    public View f189617d;

    /* JADX INFO: renamed from: e */
    public VText f189618e;

    /* JADX INFO: renamed from: f */
    public VText f189619f;

    /* JADX INFO: renamed from: g */
    public View f189620g;

    /* JADX INFO: renamed from: h */
    public VText f189621h;

    /* JADX INFO: renamed from: i */
    public VText f189622i;

    /* JADX INFO: renamed from: j */
    public VText f189623j;

    /* JADX INFO: renamed from: k */
    public sl0 f189624k;

    /* JADX INFO: renamed from: l */
    public BottomSheetDialog f189625l;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m206883d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xl0.m211458b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(sl0 sl0Var) {
        this.f189624k = sl0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m206885f() {
        BottomSheetDialog bottomSheetDialog = this.f189625l;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m206886i(View view) {
        this.f189625l.dismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m206887j(BLiveVideoChatSummary bLiveVideoChatSummary, View view) {
        sl0 sl0Var = this.f189624k;
        if (sl0Var != null) {
            sl0Var.m186548X2(bLiveVideoChatSummary.anchor.userId, bLiveVideoChatSummary.audience.userId, bLiveVideoChatSummary.liveId, bLiveVideoChatSummary.roomId, bLiveVideoChatSummary.endTime);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m206888k(DialogInterface dialogInterface) {
        sl0 sl0Var = this.f189624k;
        if (sl0Var != null) {
            sl0Var.m186546U2();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m206889l(Act act, final BLiveVideoChatSummary bLiveVideoChatSummary) {
        if (this.f189625l == null) {
            this.f189625l = new BottomSheetDialog(act, hgc0.f109387d);
            this.f189625l.setContentView(m206883d(act.inflater(), null));
            bnl0.m105509E0(this.f189623j, new View.OnClickListener() { // from class: l.tl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f174776a.m206886i(view);
                }
            });
            bnl0.m105509E0(this.f189614a, new View.OnClickListener() { // from class: l.ul0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f179471a.m206887j(bLiveVideoChatSummary, view);
                }
            });
        }
        this.f189625l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.vl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f184535a.m206888k(dialogInterface);
            }
        });
        this.f189618e.setText(String.format("%d分钟", Integer.valueOf(bLiveVideoChatSummary.orderMinutes)));
        this.f189621h.setText(yau.m214934b(bLiveVideoChatSummary.rewardPoint));
        this.f189625l.show();
        btu.m106388d();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
