package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetSmoothSpeedRecycle;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class cro0 extends LiveMenuDialogHolder<gso0> {

    /* JADX INFO: renamed from: k */
    public VDraweeView f82281k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetSmoothSpeedRecycle f82282l;

    /* JADX INFO: renamed from: m */
    public VImage f82283m;

    /* JADX INFO: renamed from: n */
    public gso0 f82284n;

    /* JADX INFO: renamed from: o */
    public SweetGalleryLayoutManager f82285o;

    /* JADX INFO: renamed from: p */
    public eoo0 f82286p;

    /* JADX INFO: renamed from: l.cro0$a */
    public class C16231a implements SweetGalleryLayoutManager.InterfaceC13037c {
        public C16231a() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC13037c
        /* JADX INFO: renamed from: a */
        public void mo78489a(SweetGalleryLayoutManager sweetGalleryLayoutManager, View view, float f) {
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            float fAbs = 1.0f - (Math.abs(f) * 0.3f);
            view.setScaleX(fAbs);
            view.setScaleY(fAbs);
            view.setAlpha(1.0f - (Math.abs(f) * 0.6f));
        }
    }

    public cro0(Act act, gso0 gso0Var) {
        super(t6c0.f168542ua, act, gso0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m108440F(RecyclerView recyclerView, View view, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m108443L(View view) {
        mo71838p();
    }

    /* JADX INFO: renamed from: r */
    private void m108444r() {
        this.f82282l.addItemDecoration(new jno0.C17826a());
        SweetGalleryLayoutManager sweetGalleryLayoutManager = new SweetGalleryLayoutManager(0);
        this.f82285o = sweetGalleryLayoutManager;
        sweetGalleryLayoutManager.m78482f(this.f82282l, 0);
        this.f82285o.m78486z(new C16231a());
        this.f82282l.setAdapter(this.f82286p);
        this.f82285o.m78485y(false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f82284n.act();
    }

    /* JADX INFO: renamed from: I */
    public final void m108445I(View view) {
        dro0.m113318a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gso0 gso0Var) {
        this.f82284n = gso0Var;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m108447K(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        gso0 gso0Var;
        if (TextUtils.isEmpty(bLiveVoiceSweetLimitHouse.pageSchema) || (gso0Var = this.f82284n) == null) {
            return;
        }
        gso0Var.mo129310p3(1124, bLiveVoiceSweetLimitHouse.pageSchema);
        mo71838p();
        this.f82284n.m127824d4();
    }

    /* JADX INFO: renamed from: M */
    public void m108448M(List<BLiveVoiceSweetLimitHouse> list) {
        m71834E();
        this.f82286p.m117457f0(list);
        if (list.size() > 0) {
            this.f82282l.smoothScrollToPosition(0);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m108445I(view);
        hxs.m133406s("context_livingAct", this.f82281k, ydt.f197606I);
        mep0.m154301c1(this.f82281k, 0, 0, 0, -t100.m186890d(16.0f), t100.m186890d(16.0f));
        this.f82286p = new eoo0();
        m108444r();
        this.f82286p.m117458g0(new e30() { // from class: l.zqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204405a.m108447K((BLiveVoiceSweetLimitHouse) obj);
            }
        });
        this.f82285o.m78481A(new SweetGalleryLayoutManager.InterfaceC13039e() { // from class: l.aro0
            @Override // com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC13039e
            /* JADX INFO: renamed from: a */
            public final void mo78490a(RecyclerView recyclerView, View view2, int i) {
                cro0.m108440F(recyclerView, view2, i);
            }
        });
        xdl0.m208329E0(this.f82283m, new View.OnClickListener() { // from class: l.bro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f76915a.m108443L(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        gso0 gso0Var = this.f82284n;
        if (gso0Var != null) {
            gso0Var.m127836u4();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo71842x() {
        super.mo71842x();
        gso0 gso0Var = this.f82284n;
        if (gso0Var != null) {
            gso0Var.m127835t4();
        }
    }
}
