package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class mmu implements s7m<vmu> {

    /* JADX INFO: renamed from: a */
    public VLinear f134696a;

    /* JADX INFO: renamed from: b */
    public ImageView f134697b;

    /* JADX INFO: renamed from: c */
    public VText f134698c;

    /* JADX INFO: renamed from: d */
    public View f134699d;

    /* JADX INFO: renamed from: e */
    public VImage f134700e;

    /* JADX INFO: renamed from: f */
    public VText f134701f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f134702g;

    /* JADX INFO: renamed from: h */
    public Act f134703h;

    /* JADX INFO: renamed from: i */
    public BottomSheetDialog f134704i;

    /* JADX INFO: renamed from: j */
    public vmu f134705j;

    /* JADX INFO: renamed from: k */
    public qmu f134706k;

    /* JADX INFO: renamed from: j */
    private void m155493j(List<BLiveVideoChatMissedCall> list) {
        xdl0.m208344M(this.f134702g, !vwb.m200296J(list));
        xdl0.m208344M(this.f134700e, vwb.m200296J(list));
        xdl0.m208344M(this.f134701f, vwb.m200296J(list));
        this.f134706k.m175581G(list);
        this.f134704i.show();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f134696a.getContext();
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f134705j.act();
    }

    /* JADX INFO: renamed from: b */
    public final void m155494b(View view) {
        nmu.m160159a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vmu vmuVar) {
        this.f134705j = vmuVar;
    }

    /* JADX INFO: renamed from: d */
    public void m155496d() {
        BottomSheetDialog bottomSheetDialog = this.f134704i;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        BottomSheetDialog bottomSheetDialog = this.f134704i;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m155497e() {
        qmu qmuVar = new qmu(act(), this.f134705j);
        this.f134706k = qmuVar;
        this.f134702g.setAdapter(qmuVar);
        this.f134702g.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f134706k.m175581G(new ArrayList());
    }

    /* JADX INFO: renamed from: f */
    public final void m155498f() {
        this.f134704i = new BottomSheetDialog(this.f134703h, c8c0.f79739d);
        View viewInflate = LayoutInflater.from(this.f134703h).inflate(s6c0.f162663E1, (ViewGroup) null);
        m155494b(viewInflate);
        this.f134704i.setContentView(viewInflate);
        xdl0.m208329E0(this.f134697b, new View.OnClickListener() { // from class: l.lmu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128829a.m155499i(view);
            }
        });
        if (this.f134706k == null) {
            m155497e();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m155499i(View view) {
        this.f134704i.dismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m155500k(Act act, List<BLiveVideoChatMissedCall> list) {
        if (act == null) {
            return;
        }
        this.f134703h = act;
        if (this.f134704i == null) {
            m155498f();
        }
        m155493j(list);
    }
}
