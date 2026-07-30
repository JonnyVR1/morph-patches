package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class nou implements iam<wou> {

    /* JADX INFO: renamed from: a */
    public VLinear f143036a;

    /* JADX INFO: renamed from: b */
    public ImageView f143037b;

    /* JADX INFO: renamed from: c */
    public VText f143038c;

    /* JADX INFO: renamed from: d */
    public View f143039d;

    /* JADX INFO: renamed from: e */
    public VImage f143040e;

    /* JADX INFO: renamed from: f */
    public VText f143041f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f143042g;

    /* JADX INFO: renamed from: h */
    public Act f143043h;

    /* JADX INFO: renamed from: i */
    public BottomSheetDialog f143044i;

    /* JADX INFO: renamed from: j */
    public wou f143045j;

    /* JADX INFO: renamed from: k */
    public rou f143046k;

    /* JADX INFO: renamed from: j */
    private void m164197j(List<BLiveVideoChatMissedCall> list) {
        bnl0.m105524M(this.f143042g, !jyb.m147479J(list));
        bnl0.m105524M(this.f143040e, jyb.m147479J(list));
        bnl0.m105524M(this.f143041f, jyb.m147479J(list));
        this.f143046k.m182446G(list);
        this.f143044i.show();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143036a.getContext();
    }

    @Override // p153l.iam
    public Act act() {
        return this.f143045j.act();
    }

    /* JADX INFO: renamed from: b */
    public final void m164198b(View view) {
        oou.m168600a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wou wouVar) {
        this.f143045j = wouVar;
    }

    /* JADX INFO: renamed from: d */
    public void m164200d() {
        BottomSheetDialog bottomSheetDialog = this.f143044i;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    @Override // p153l.iam
    public void destroy() {
        BottomSheetDialog bottomSheetDialog = this.f143044i;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m164201e() {
        rou rouVar = new rou(act(), this.f143045j);
        this.f143046k = rouVar;
        this.f143042g.setAdapter(rouVar);
        this.f143042g.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f143046k.m182446G(new ArrayList());
    }

    /* JADX INFO: renamed from: f */
    public final void m164202f() {
        this.f143044i = new BottomSheetDialog(this.f143043h, hgc0.f109387d);
        View viewInflate = LayoutInflater.from(this.f143043h).inflate(xec0.f193777E1, (ViewGroup) null);
        m164198b(viewInflate);
        this.f143044i.setContentView(viewInflate);
        bnl0.m105509E0(this.f143037b, new View.OnClickListener() { // from class: l.mou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137854a.m164203i(view);
            }
        });
        if (this.f143046k == null) {
            m164201e();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m164203i(View view) {
        this.f143044i.dismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m164204k(Act act, List<BLiveVideoChatMissedCall> list) {
        if (act == null) {
            return;
        }
        this.f143043h = act;
        if (this.f143044i == null) {
            m164202f();
        }
        m164197j(list);
    }
}
