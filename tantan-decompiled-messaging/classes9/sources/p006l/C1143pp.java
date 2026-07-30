package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountMediaItemView;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountMediaPickerAct;
import com.p000p1.mobile.putong.api.api.FacebookApi;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.Media;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.mkd0;
import l.nqh0;
import l.oyx;
import l.q860;
import l.roj0;
import l.vwb;
import l.zvf0;

/* JADX INFO: renamed from: l.pp */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1143pp extends dac0<Media> {

    /* JADX INFO: renamed from: c */
    public int f19240c;

    /* JADX INFO: renamed from: d */
    public PutongAct f19241d;

    /* JADX INFO: renamed from: e */
    public int f19242e;

    /* JADX INFO: renamed from: f */
    public boolean f19243f;

    /* JADX INFO: renamed from: g */
    public nqh0 f19244g;

    /* JADX INFO: renamed from: h */
    public boolean f19245h;

    /* JADX INFO: renamed from: i */
    public String f19246i;

    /* JADX INFO: renamed from: j */
    public boolean f19247j;

    /* JADX INFO: renamed from: k */
    public q860<Media> f19248k = q860.a();

    public C1143pp(int i, boolean z, PutongAct putongAct, int i2, boolean z2, nqh0 nqh0Var, boolean z3, String str) {
        this.f19240c = i;
        this.f19247j = z;
        this.f19241d = putongAct;
        this.f19242e = i2;
        this.f19243f = z2;
        this.f19244g = nqh0Var;
        this.f19245h = z3;
        this.f19246i = str;
    }

    /* JADX INFO: renamed from: C */
    public int m21631C() {
        boolean z = this.f19243f;
        int size = this.f19248k.a.size();
        return z ? size + 1 : size;
    }

    /* JADX INFO: renamed from: D */
    public View m21632D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewInflate = this.f19241d.inflater().inflate(c6c0.f9396F, viewGroup, false);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.mp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17157a.m21635J(view);
                }
            });
            return viewInflate;
        }
        PutongAct putongAct = this.f19241d;
        if (i != 2) {
            return putongAct.inflater().inflate(c6c0.f9397G, viewGroup, false);
        }
        View viewInflate2 = putongAct.inflater().inflate(c6c0.f9393C, viewGroup, false);
        viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.np
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17768a.m21636K(view);
            }
        });
        return viewInflate2;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m21630A(View view, Media media, int i, int i2) {
        if (i == 1) {
            ((AccountMediaItemView) view).m1083f(media, this.f19242e > 1);
        }
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        boolean z = this.f19243f;
        if (z && i == 0) {
            return null;
        }
        List list = this.f19248k.a;
        if (z) {
            i--;
        }
        return (Media) list.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m21635J(View view) {
        oyx.i(this.f19241d, !this.f19247j);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m21636K(View view) {
        if (TextUtils.equals(this.f19246i, "from_fake_alert")) {
            zvf0.r("e_picture_shoot", "p_picture_selection_view");
        } else {
            zvf0.u("e_signup_shoot", this.f19241d.pageId(), new j760[]{vwb.Y("signup_source", AccountModule.m26F().getSignUpType())});
        }
        AccountModule.m28J().startInnerCameraForResult(this.f19241d, "from_sign_up", 293);
    }

    /* JADX INFO: renamed from: L */
    public void m21637L(q860<Media> q860Var) {
        this.f19248k = q860Var;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m21638e(int i) {
        if (this.f19240c != AccountMediaPickerAct.f1001B || !this.f19248k.c() || i >= this.f19248k.a.size() - 3 || i <= 5) {
            return;
        }
        qib0.f19803a0.m1449y(this.f19244g.c.b, true).subscribe(mkd0.H(roj0.b, new e30() { // from class: l.op
            public final void call(Object obj) {
                FacebookApi.m1436m((Throwable) obj);
            }
        }));
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (this.f19243f && i == 0) {
            return this.f19245h ? 2 : 0;
        }
        return 1;
    }
}
