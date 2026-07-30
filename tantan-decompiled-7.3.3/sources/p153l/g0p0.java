package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetSmoothSpeedRecycle;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class g0p0 extends LiveMenuDialogHolder<k1p0> {

    /* JADX INFO: renamed from: k */
    public VDraweeView f101666k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetSmoothSpeedRecycle f101667l;

    /* JADX INFO: renamed from: m */
    public VImage f101668m;

    /* JADX INFO: renamed from: n */
    public k1p0 f101669n;

    /* JADX INFO: renamed from: o */
    public SweetGalleryLayoutManager f101670o;

    /* JADX INFO: renamed from: p */
    public ixo0 f101671p;

    /* JADX INFO: renamed from: l.g0p0$a */
    public class C17112a implements SweetGalleryLayoutManager.InterfaceC13200c {
        public C17112a() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC13200c
        /* JADX INFO: renamed from: a */
        public void mo79672a(SweetGalleryLayoutManager sweetGalleryLayoutManager, View view, float f) {
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            float fAbs = 1.0f - (Math.abs(f) * 0.3f);
            view.setScaleX(fAbs);
            view.setScaleY(fAbs);
            view.setAlpha(1.0f - (Math.abs(f) * 0.6f));
        }
    }

    public g0p0(Act act, k1p0 k1p0Var) {
        super(yec0.f199274ua, act, k1p0Var, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m128446F(RecyclerView recyclerView, View view, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m128449L(View view) {
        mo73021p();
    }

    /* JADX INFO: renamed from: r */
    private void m128450r() {
        this.f101667l.addItemDecoration(new nwo0.C18967a());
        SweetGalleryLayoutManager sweetGalleryLayoutManager = new SweetGalleryLayoutManager(0);
        this.f101670o = sweetGalleryLayoutManager;
        sweetGalleryLayoutManager.m79665f(this.f101667l, 0);
        this.f101670o.m79669z(new C17112a());
        this.f101667l.setAdapter(this.f101671p);
        this.f101670o.m79668y(false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f101669n.act();
    }

    /* JADX INFO: renamed from: I */
    public final void m128451I(View view) {
        h0p0.m133187a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(k1p0 k1p0Var) {
        this.f101669n = k1p0Var;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m128453K(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        k1p0 k1p0Var;
        if (TextUtils.isEmpty(bLiveVoiceSweetLimitHouse.pageSchema) || (k1p0Var = this.f101669n) == null) {
            return;
        }
        k1p0Var.mo138869p3(1124, bLiveVoiceSweetLimitHouse.pageSchema);
        mo73021p();
        this.f101669n.m147910d4();
    }

    /* JADX INFO: renamed from: M */
    public void m128454M(List<BLiveVoiceSweetLimitHouse> list) {
        m73017E();
        this.f101671p.m142587f0(list);
        if (list.size() > 0) {
            this.f101667l.smoothScrollToPosition(0);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m128451I(view);
        izs.m142868s("context_livingAct", this.f101666k, zft.f204201I);
        qnp0.m177260c1(this.f101666k, 0, 0, 0, -qa00.m175859d(16.0f), qa00.m175859d(16.0f));
        this.f101671p = new ixo0();
        m128450r();
        this.f101671p.m142588g0(new y20() { // from class: l.d0p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84590a.m128453K((BLiveVoiceSweetLimitHouse) obj);
            }
        });
        this.f101670o.m79664A(new SweetGalleryLayoutManager.InterfaceC13202e() { // from class: l.e0p0
            @Override // com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC13202e
            /* JADX INFO: renamed from: a */
            public final void mo79673a(RecyclerView recyclerView, View view2, int i) {
                g0p0.m128446F(recyclerView, view2, i);
            }
        });
        bnl0.m105509E0(this.f101668m, new View.OnClickListener() { // from class: l.f0p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f96709a.m128449L(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        k1p0 k1p0Var = this.f101669n;
        if (k1p0Var != null) {
            k1p0Var.m147922u4();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo73025x() {
        super.mo73025x();
        k1p0 k1p0Var = this.f101669n;
        if (k1p0Var != null) {
            k1p0Var.m147921t4();
        }
    }
}
