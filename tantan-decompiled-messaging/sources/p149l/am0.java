package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatSummary;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class am0 implements s7m<wl0> {

    /* JADX INFO: renamed from: a */
    public VImage f70527a;

    /* JADX INFO: renamed from: b */
    public VText f70528b;

    /* JADX INFO: renamed from: c */
    public VText f70529c;

    /* JADX INFO: renamed from: d */
    public View f70530d;

    /* JADX INFO: renamed from: e */
    public VText f70531e;

    /* JADX INFO: renamed from: f */
    public VText f70532f;

    /* JADX INFO: renamed from: g */
    public View f70533g;

    /* JADX INFO: renamed from: h */
    public VText f70534h;

    /* JADX INFO: renamed from: i */
    public VText f70535i;

    /* JADX INFO: renamed from: j */
    public VText f70536j;

    /* JADX INFO: renamed from: k */
    public wl0 f70537k;

    /* JADX INFO: renamed from: l */
    public BottomSheetDialog f70538l;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m97459d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bm0.m102568b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wl0 wl0Var) {
        this.f70537k = wl0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m97461f() {
        BottomSheetDialog bottomSheetDialog = this.f70538l;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m97462i(View view) {
        this.f70538l.dismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m97463j(BLiveVideoChatSummary bLiveVideoChatSummary, View view) {
        wl0 wl0Var = this.f70537k;
        if (wl0Var != null) {
            wl0Var.m203707X2(bLiveVideoChatSummary.anchor.userId, bLiveVideoChatSummary.audience.userId, bLiveVideoChatSummary.liveId, bLiveVideoChatSummary.roomId, bLiveVideoChatSummary.endTime);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m97464k(DialogInterface dialogInterface) {
        wl0 wl0Var = this.f70537k;
        if (wl0Var != null) {
            wl0Var.m203705U2();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m97465l(Act act, final BLiveVideoChatSummary bLiveVideoChatSummary) {
        if (this.f70538l == null) {
            this.f70538l = new BottomSheetDialog(act, c8c0.f79739d);
            this.f70538l.setContentView(m97459d(act.inflater(), null));
            xdl0.m208329E0(this.f70536j, new View.OnClickListener() { // from class: l.xl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f193369a.m97462i(view);
                }
            });
            xdl0.m208329E0(this.f70527a, new View.OnClickListener() { // from class: l.yl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f198851a.m97463j(bLiveVideoChatSummary, view);
                }
            });
        }
        this.f70538l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f203586a.m97464k(dialogInterface);
            }
        });
        this.f70531e.setText(String.format("%d分钟", Integer.valueOf(bLiveVideoChatSummary.orderMinutes)));
        this.f70534h.setText(x8u.m207432b(bLiveVideoChatSummary.rewardPoint));
        this.f70538l.show();
        aru.m98555d();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
