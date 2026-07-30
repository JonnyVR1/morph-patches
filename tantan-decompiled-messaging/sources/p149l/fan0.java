package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBossCall;
import com.p046p1.mobile.putong.live.base.data.BLiveBossCallDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveBossGift;
import com.p046p1.mobile.putong.live.base.data.BLiveBossGiftRecord;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class fan0 extends LiveMenuDialogHolder<u9n0> {

    /* JADX INFO: renamed from: k */
    public VText f96619k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f96620l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f96621m;

    /* JADX INFO: renamed from: n */
    public RecyclerView f96622n;

    /* JADX INFO: renamed from: o */
    public VText f96623o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f96624p;

    /* JADX INFO: renamed from: q */
    public View f96625q;

    /* JADX INFO: renamed from: r */
    public View f96626r;

    /* JADX INFO: renamed from: s */
    public LiveBaseAdapter f96627s;

    /* JADX INFO: renamed from: t */
    public LiveBaseAdapter f96628t;

    /* JADX INFO: renamed from: u */
    public BLiveBossGiftRecord f96629u;

    public fan0(u9n0 u9n0Var) {
        super(t6c0.f168064I8, u9n0Var.act(), u9n0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m120223L(BLiveBossCallDetail bLiveBossCallDetail, d1q d1qVar) {
        if (d1qVar instanceof ouj) {
            ouj oujVar = (ouj) d1qVar;
            oujVar.f145709b = TextUtils.equals(oujVar.f145708a.userId, bLiveBossCallDetail.userId);
        }
    }

    /* JADX INFO: renamed from: M */
    private void m120224M() {
        RecyclerView recyclerView = this.f96624p;
        if (recyclerView != null) {
            xdl0.m208344M(recyclerView, false);
            xdl0.m208344M(this.f96622n, false);
            xdl0.m208344M(this.f96621m, false);
            xdl0.m208344M(this.f96623o, false);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m120225N(View view) {
        hxs.m133402o("context_single_room", this.f96620l, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkZYRVFXMzREMlZSM083MkJJR1FMWklBTEJGT1NCRTEyIiwidyI6OTYsImgiOjk2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzA5MTM1NTM3NDY5MjAwOTAwfQ.png");
        hxs.m133402o("context_single_room", this.f96621m, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJFWEFMM1NCTEZMUktWTkxDS0xCT1lMMldSVjZZWTEzIiwidyI6OTYsImgiOjk2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjMwNjg3MDI1NDYzNTAwOH0.webp");
        this.f96622n.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f96627s = liveBaseAdapter;
        this.f96622n.setAdapter(liveBaseAdapter);
        this.f96628t = new LiveBaseAdapter();
        this.f96624p.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        this.f96624p.setAdapter(this.f96628t);
        this.f96628t.m67375c0(new e30() { // from class: l.v9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180663a.m120228O((Integer) obj);
            }
        });
        xdl0.m208329E0(this.f96621m, new View.OnClickListener() { // from class: l.w9n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f185388a.m120226P(view2);
            }
        });
        xdl0.m208329E0(this.f96620l, new View.OnClickListener() { // from class: l.x9n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f191635a.m120227Q(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m120226P(View view) {
        ((u9n0) this.f47757b).m192574X3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m120227Q(View view) {
        mo71838p();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m120228O(Integer num) {
        if (num.intValue() >= this.f96628t.getItemCount() - 3) {
            m120232U();
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m120229R(BLiveBossCallDetail bLiveBossCallDetail, View view) {
        m120233V(bLiveBossCallDetail);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m120230S(ArrayList arrayList, BLiveBossGift bLiveBossGift) {
        muj mujVar = new muj(bLiveBossGift);
        u9n0 u9n0Var = (u9n0) this.f47757b;
        Objects.requireNonNull(u9n0Var);
        mujVar.m156410I(new can0(u9n0Var));
        arrayList.add(mujVar);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m120231T(ArrayList arrayList, BLiveBossGift bLiveBossGift) {
        muj mujVar = new muj(bLiveBossGift);
        u9n0 u9n0Var = (u9n0) this.f47757b;
        Objects.requireNonNull(u9n0Var);
        mujVar.m156410I(new can0(u9n0Var));
        arrayList.add(mujVar);
    }

    /* JADX INFO: renamed from: U */
    public final void m120232U() {
        int i;
        BLiveBossGiftRecord bLiveBossGiftRecord = this.f96629u;
        if (bLiveBossGiftRecord == null || (i = bLiveBossGiftRecord.page) == bLiveBossGiftRecord.totalPage) {
            return;
        }
        ((u9n0) this.f47757b).m192575Y3(bLiveBossGiftRecord.otherUserId, i + 1, new e30() { // from class: l.y9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196983a.m120237Z((BLiveBossGiftRecord) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m120233V(final BLiveBossCallDetail bLiveBossCallDetail) {
        ((u9n0) this.f47757b).m192575Y3(bLiveBossCallDetail.userId, 1, new aan0(this));
        vwb.m200354z(this.f96627s.m67355J(), new e30() { // from class: l.ean0
            @Override // p149l.e30
            public final void call(Object obj) {
                fan0.m120223L(bLiveBossCallDetail, (d1q) obj);
            }
        });
        this.f96627s.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: W */
    public void m120234W(BLiveBossCall bLiveBossCall) {
        m120224M();
        if (!TextUtils.isEmpty(bLiveBossCall.userCallType)) {
            xdl0.m208344M(this.f96621m, true);
            m120235X(bLiveBossCall);
        } else {
            xdl0.m208344M(this.f96623o, false);
            xdl0.m208344M(this.f96622n, false);
            xdl0.m208344M(this.f96621m, false);
            ((u9n0) this.f47757b).m192575Y3(ypv.f199493a.m199309D0(), 1, new aan0(this));
        }
    }

    /* JADX INFO: renamed from: X */
    public void m120235X(BLiveBossCall bLiveBossCall) {
        List<BLiveBossCallDetail> list = bLiveBossCall.calls;
        if (vwb.m200296J(list)) {
            m120239b0(false);
            return;
        }
        m120239b0(true);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bLiveBossCall.calls.size()) {
            final BLiveBossCallDetail bLiveBossCallDetail = bLiveBossCall.calls.get(i);
            ouj oujVar = new ouj(bLiveBossCallDetail);
            arrayList.add(oujVar);
            oujVar.f145709b = i == 0;
            oujVar.mo109662A(new View.OnClickListener() { // from class: l.ban0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74707a.m120229R(bLiveBossCallDetail, view);
                }
            });
            i++;
        }
        this.f96627s.m67371Z(arrayList);
        ((u9n0) this.f47757b).m192575Y3(list.get(0).userId, 1, new aan0(this));
    }

    /* JADX INFO: renamed from: Y */
    public void m120236Y() {
        m71834E();
    }

    /* JADX INFO: renamed from: Z */
    public void m120237Z(BLiveBossGiftRecord bLiveBossGiftRecord) {
        this.f96629u = bLiveBossGiftRecord;
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(bLiveBossGiftRecord.gifts, new e30() { // from class: l.z9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202307a.m120230S(arrayList, (BLiveBossGift) obj);
            }
        });
        if (bLiveBossGiftRecord.totalPage == bLiveBossGiftRecord.page) {
            arrayList.add(new nuj());
        }
        this.f96628t.m67355J().addAll(arrayList);
        this.f96628t.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a0 */
    public void m120238a0(BLiveBossGiftRecord bLiveBossGiftRecord) {
        this.f96623o.setText(w8u.m202217t(R$string.f47626x7) + x8u.m207438h(bLiveBossGiftRecord.popularityValue));
        boolean zM200296J = vwb.m200296J(bLiveBossGiftRecord.gifts);
        View view = this.f96626r;
        if (zM200296J) {
            xdl0.m208344M(view, true);
            xdl0.m208344M(this.f96624p, false);
            return;
        }
        xdl0.m208344M(view, false);
        xdl0.m208344M(this.f96624p, true);
        this.f96628t.m67355J().clear();
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(bLiveBossGiftRecord.gifts, new e30() { // from class: l.dan0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85245a.m120231T(arrayList, (BLiveBossGift) obj);
            }
        });
        if (bLiveBossGiftRecord.page == bLiveBossGiftRecord.totalPage) {
            arrayList.add(new nuj());
        }
        this.f96628t.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m120239b0(boolean z) {
        xdl0.m208344M(this.f96623o, z);
        xdl0.m208344M(this.f96622n, z);
        xdl0.m208344M(this.f96625q, !z);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        this.f96619k = (VText) view.findViewById(g5c0.f100762N6);
        this.f96620l = (VDraweeView) view.findViewById(g5c0.f100638A);
        this.f96621m = (VDraweeView) view.findViewById(g5c0.f100878a5);
        this.f96622n = (RecyclerView) view.findViewById(g5c0.f100799R7);
        this.f96623o = (VText) view.findViewById(g5c0.f100774P0);
        this.f96624p = (RecyclerView) view.findViewById(g5c0.f100975k2);
        this.f96625q = view.findViewById(g5c0.f100820U1);
        this.f96626r = view.findViewById(g5c0.f100895c2);
        m120225N(view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m120224M();
    }
}
