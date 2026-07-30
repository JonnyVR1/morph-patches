package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaItemView;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.api.api.FacebookApi;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import java.util.List;
import l.f6c0;
import l.j760;
import l.mkd0;
import l.nqh0;
import l.oyx;
import l.q860;
import l.qib0;
import l.roj0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zdm extends dac0<Media> {

    /* JADX INFO: renamed from: c */
    public int f9320c;

    /* JADX INFO: renamed from: d */
    public PutongAct f9321d;

    /* JADX INFO: renamed from: e */
    public int f9322e;

    /* JADX INFO: renamed from: f */
    public boolean f9323f;

    /* JADX INFO: renamed from: g */
    public nqh0 f9324g;

    /* JADX INFO: renamed from: h */
    public boolean f9325h;

    /* JADX INFO: renamed from: i */
    public boolean f9326i;

    /* JADX INFO: renamed from: j */
    public q860<Media> f9327j = q860.a();

    public zdm(int i, boolean z, PutongAct putongAct, int i2, boolean z2, nqh0 nqh0Var, boolean z3) {
        this.f9320c = i;
        this.f9326i = z;
        this.f9321d = putongAct;
        this.f9322e = i2;
        this.f9323f = z2;
        this.f9324g = nqh0Var;
        this.f9325h = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m9411J(View view) {
        oyx.i(this.f9321d, !this.f9326i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m9412K(View view) {
        zvf0.u("e_signup_shoot", this.f9321d.pageId(), new j760[]{vwb.Y("signup_source", CoreModule.H().getSignUpType())});
        CoreModule.N().startInnerCameraForResult(this.f9321d, "from_sign_up", 293);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: C */
    public int mo203C() {
        boolean z = this.f9323f;
        int size = this.f9327j.a.size();
        return z ? size + 1 : size;
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: D */
    public View mo204D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewInflate = this.f9321d.inflater().inflate(f6c0.Sd, viewGroup, false);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.xdm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8771a.m9411J(view);
                }
            });
            return viewInflate;
        }
        PutongAct putongAct = this.f9321d;
        if (i != 2) {
            return putongAct.inflater().inflate(f6c0.Td, viewGroup, false);
        }
        View viewInflate2 = putongAct.inflater().inflate(f6c0.p7, viewGroup, false);
        viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.ydm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9062a.m9412K(view);
            }
        });
        return viewInflate2;
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo202A(View view, Media media, int i, int i2) {
        if (i == 1) {
            ((MediaItemView) view).m842f(media, this.f9322e > 1);
        }
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        boolean z = this.f9323f;
        if (z && i == 0) {
            return null;
        }
        List list = this.f9327j.a;
        if (z) {
            i--;
        }
        return (Media) list.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m9415L(q860<Media> q860Var) {
        this.f9327j = q860Var;
        notifyDataSetChanged();
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: e */
    public void mo358e(int i) {
        if (this.f9320c != MediaPickerAct.f513C || !this.f9327j.c() || i >= this.f9327j.a.size() - 3 || i <= 5) {
            return;
        }
        qib0.a0.y(this.f9324g.c.b, true).subscribe((m250) mkd0.H(roj0.b, new e30() { // from class: l.wdm
            @Override // p003l.e30
            public final void call(Object obj) {
                FacebookApi.m((Throwable) obj);
            }
        }));
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (this.f9323f && i == 0) {
            return this.f9325h ? 2 : 0;
        }
        return 1;
    }
}
