package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetSmoothSpeedRecycle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import l.dro0;
import l.e30;
import l.hxs;
import l.j2g0;
import l.mep0;
import l.t100;
import l.t6c0;
import l.xdl0;
import l.ydt;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cro0 extends LiveMenuDialogHolder<gso0> {

    /* JADX INFO: renamed from: k */
    public VDraweeView f10751k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetSmoothSpeedRecycle f10752l;

    /* JADX INFO: renamed from: m */
    public VImage f10753m;

    /* JADX INFO: renamed from: n */
    public gso0 f10754n;

    /* JADX INFO: renamed from: o */
    public SweetGalleryLayoutManager f10755o;

    /* JADX INFO: renamed from: p */
    public eoo0 f10756p;

    /* JADX INFO: renamed from: l.cro0$a */
    public class C0826a implements SweetGalleryLayoutManager.InterfaceC0439c {
        public C0826a() {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC0439c
        /* JADX INFO: renamed from: a */
        public void mo8698a(SweetGalleryLayoutManager sweetGalleryLayoutManager, View view, float f) {
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            float fAbs = 1.0f - (Math.abs(f) * 0.3f);
            view.setScaleX(fAbs);
            view.setScaleY(fAbs);
            view.setAlpha(1.0f - (Math.abs(f) * 0.6f));
        }
    }

    public cro0(Act act, gso0 gso0Var) {
        super(t6c0.ua, act, gso0Var, j2g0.e(true));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m12785F(RecyclerView recyclerView, View view, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m12788L(View view) {
        p();
    }

    /* JADX INFO: renamed from: r */
    private void m12789r() {
        this.f10752l.addItemDecoration(new jno0.C0978a());
        SweetGalleryLayoutManager sweetGalleryLayoutManager = new SweetGalleryLayoutManager(0);
        this.f10755o = sweetGalleryLayoutManager;
        sweetGalleryLayoutManager.m8691f(this.f10752l, 0);
        this.f10755o.m8695z(new C0826a());
        this.f10752l.setAdapter(this.f10756p);
        this.f10755o.m8694y(false);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12790C0() {
        return this.f10754n.act();
    }

    /* JADX INFO: renamed from: I */
    public final void m12791I(View view) {
        dro0.a(this, view);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m12797n(gso0 gso0Var) {
        this.f10754n = gso0Var;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m12793K(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        gso0 gso0Var;
        if (TextUtils.isEmpty(bLiveVoiceSweetLimitHouse.pageSchema) || (gso0Var = this.f10754n) == null) {
            return;
        }
        gso0Var.p3(1124, bLiveVoiceSweetLimitHouse.pageSchema);
        p();
        this.f10754n.m15244d4();
    }

    /* JADX INFO: renamed from: M */
    public void m12794M(List<BLiveVoiceSweetLimitHouse> list) {
        E();
        this.f10756p.m14012f0(list);
        if (list.size() > 0) {
            this.f10752l.smoothScrollToPosition(0);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m12796m(View view) {
        super.m(view);
        m12791I(view);
        hxs.s("context_livingAct", this.f10751k, ydt.I);
        mep0.c1(this.f10751k, 0, 0, 0, -t100.d(16.0f), t100.d(16.0f));
        this.f10756p = new eoo0();
        m12789r();
        this.f10756p.m14013g0(new e30() { // from class: l.zqo0
            public final void call(Object obj) {
                this.f23837a.m12793K((BLiveVoiceSweetLimitHouse) obj);
            }
        });
        this.f10755o.m8690A(new SweetGalleryLayoutManager.InterfaceC0441e() { // from class: l.aro0
            @Override // com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC0441e
            /* JADX INFO: renamed from: a */
            public final void mo8699a(RecyclerView recyclerView, View view2, int i) {
                cro0.m12785F(recyclerView, view2, i);
            }
        });
        xdl0.E0(this.f10753m, new View.OnClickListener() { // from class: l.bro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10244a.m12788L(view2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m12798w() {
        super.w();
        gso0 gso0Var = this.f10754n;
        if (gso0Var != null) {
            gso0Var.m15258u4();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m12799x() {
        super.x();
        gso0 gso0Var = this.f10754n;
        if (gso0Var != null) {
            gso0Var.m15257t4();
        }
    }
}
