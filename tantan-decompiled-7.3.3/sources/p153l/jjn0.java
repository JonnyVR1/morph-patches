package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveBossCall;
import com.p051p1.mobile.putong.live.base.data.BLiveBossCallDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveBossGift;
import com.p051p1.mobile.putong.live.base.data.BLiveBossGiftRecord;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class jjn0 extends LiveMenuDialogHolder<yin0> {

    /* JADX INFO: renamed from: k */
    public VText f121201k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f121202l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f121203m;

    /* JADX INFO: renamed from: n */
    public RecyclerView f121204n;

    /* JADX INFO: renamed from: o */
    public VText f121205o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f121206p;

    /* JADX INFO: renamed from: q */
    public View f121207q;

    /* JADX INFO: renamed from: r */
    public View f121208r;

    /* JADX INFO: renamed from: s */
    public LiveBaseAdapter f121209s;

    /* JADX INFO: renamed from: t */
    public LiveBaseAdapter f121210t;

    /* JADX INFO: renamed from: u */
    public BLiveBossGiftRecord f121211u;

    public jjn0(yin0 yin0Var) {
        super(yec0.f198796I8, yin0Var.act(), yin0Var, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m145068L(BLiveBossCallDetail bLiveBossCallDetail, d3q d3qVar) {
        if (d3qVar instanceof exj) {
            exj exjVar = (exj) d3qVar;
            exjVar.f96296b = TextUtils.equals(exjVar.f96295a.userId, bLiveBossCallDetail.userId);
        }
    }

    /* JADX INFO: renamed from: M */
    private void m145069M() {
        RecyclerView recyclerView = this.f121206p;
        if (recyclerView != null) {
            bnl0.m105524M(recyclerView, false);
            bnl0.m105524M(this.f121204n, false);
            bnl0.m105524M(this.f121203m, false);
            bnl0.m105524M(this.f121205o, false);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m145070N(View view) {
        izs.m142864o("context_single_room", this.f121202l, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkZYRVFXMzREMlZSM083MkJJR1FMWklBTEJGT1NCRTEyIiwidyI6OTYsImgiOjk2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzA5MTM1NTM3NDY5MjAwOTAwfQ.png");
        izs.m142864o("context_single_room", this.f121203m, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJFWEFMM1NCTEZMUktWTkxDS0xCT1lMMldSVjZZWTEzIiwidyI6OTYsImgiOjk2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjMwNjg3MDI1NDYzNTAwOH0.webp");
        this.f121204n.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f121209s = liveBaseAdapter;
        this.f121204n.setAdapter(liveBaseAdapter);
        this.f121210t = new LiveBaseAdapter();
        this.f121206p.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        this.f121206p.setAdapter(this.f121210t);
        this.f121210t.m68558c0(new y20() { // from class: l.zin0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204597a.m145073O((Integer) obj);
            }
        });
        bnl0.m105509E0(this.f121203m, new View.OnClickListener() { // from class: l.ajn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f71841a.m145071P(view2);
            }
        });
        bnl0.m105509E0(this.f121202l, new View.OnClickListener() { // from class: l.bjn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f77003a.m145072Q(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m145071P(View view) {
        ((yin0) this.f48605b).m216338X3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m145072Q(View view) {
        mo73021p();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m145073O(Integer num) {
        if (num.intValue() >= this.f121210t.getItemCount() - 3) {
            m145077U();
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m145074R(BLiveBossCallDetail bLiveBossCallDetail, View view) {
        m145078V(bLiveBossCallDetail);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m145075S(ArrayList arrayList, BLiveBossGift bLiveBossGift) {
        cxj cxjVar = new cxj(bLiveBossGift);
        yin0 yin0Var = (yin0) this.f48605b;
        Objects.requireNonNull(yin0Var);
        cxjVar.m113035I(new gjn0(yin0Var));
        arrayList.add(cxjVar);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m145076T(ArrayList arrayList, BLiveBossGift bLiveBossGift) {
        cxj cxjVar = new cxj(bLiveBossGift);
        yin0 yin0Var = (yin0) this.f48605b;
        Objects.requireNonNull(yin0Var);
        cxjVar.m113035I(new gjn0(yin0Var));
        arrayList.add(cxjVar);
    }

    /* JADX INFO: renamed from: U */
    public final void m145077U() {
        int i;
        BLiveBossGiftRecord bLiveBossGiftRecord = this.f121211u;
        if (bLiveBossGiftRecord == null || (i = bLiveBossGiftRecord.page) == bLiveBossGiftRecord.totalPage) {
            return;
        }
        ((yin0) this.f48605b).m216339Y3(bLiveBossGiftRecord.otherUserId, i + 1, new y20() { // from class: l.cjn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82205a.m145082Z((BLiveBossGiftRecord) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m145078V(final BLiveBossCallDetail bLiveBossCallDetail) {
        ((yin0) this.f48605b).m216339Y3(bLiveBossCallDetail.userId, 1, new ejn0(this));
        jyb.m147537z(this.f121209s.m68538J(), new y20() { // from class: l.ijn0
            @Override // p153l.y20
            public final void call(Object obj) {
                jjn0.m145068L(bLiveBossCallDetail, (d3q) obj);
            }
        });
        this.f121209s.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: W */
    public void m145079W(BLiveBossCall bLiveBossCall) {
        m145069M();
        if (!TextUtils.isEmpty(bLiveBossCall.userCallType)) {
            bnl0.m105524M(this.f121203m, true);
            m145080X(bLiveBossCall);
        } else {
            bnl0.m105524M(this.f121205o, false);
            bnl0.m105524M(this.f121204n, false);
            bnl0.m105524M(this.f121203m, false);
            ((yin0) this.f48605b).m216339Y3(zrv.f205799a.m207631D0(), 1, new ejn0(this));
        }
    }

    /* JADX INFO: renamed from: X */
    public void m145080X(BLiveBossCall bLiveBossCall) {
        List<BLiveBossCallDetail> list = bLiveBossCall.calls;
        if (jyb.m147479J(list)) {
            m145084b0(false);
            return;
        }
        m145084b0(true);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bLiveBossCall.calls.size()) {
            final BLiveBossCallDetail bLiveBossCallDetail = bLiveBossCall.calls.get(i);
            exj exjVar = new exj(bLiveBossCallDetail);
            arrayList.add(exjVar);
            exjVar.f96296b = i == 0;
            exjVar.mo113881A(new View.OnClickListener() { // from class: l.fjn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99398a.m145074R(bLiveBossCallDetail, view);
                }
            });
            i++;
        }
        this.f121209s.m68554Z(arrayList);
        ((yin0) this.f48605b).m216339Y3(list.get(0).userId, 1, new ejn0(this));
    }

    /* JADX INFO: renamed from: Y */
    public void m145081Y() {
        m73017E();
    }

    /* JADX INFO: renamed from: Z */
    public void m145082Z(BLiveBossGiftRecord bLiveBossGiftRecord) {
        this.f121211u = bLiveBossGiftRecord;
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(bLiveBossGiftRecord.gifts, new y20() { // from class: l.djn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88927a.m145075S(arrayList, (BLiveBossGift) obj);
            }
        });
        if (bLiveBossGiftRecord.totalPage == bLiveBossGiftRecord.page) {
            arrayList.add(new dxj());
        }
        this.f121210t.m68538J().addAll(arrayList);
        this.f121210t.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a0 */
    public void m145083a0(BLiveBossGiftRecord bLiveBossGiftRecord) {
        this.f121205o.setText(xau.m209910t(R$string.f48474x7) + yau.m214940h(bLiveBossGiftRecord.popularityValue));
        boolean zM147479J = jyb.m147479J(bLiveBossGiftRecord.gifts);
        View view = this.f121208r;
        if (zM147479J) {
            bnl0.m105524M(view, true);
            bnl0.m105524M(this.f121206p, false);
            return;
        }
        bnl0.m105524M(view, false);
        bnl0.m105524M(this.f121206p, true);
        this.f121210t.m68538J().clear();
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(bLiveBossGiftRecord.gifts, new y20() { // from class: l.hjn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110250a.m145076T(arrayList, (BLiveBossGift) obj);
            }
        });
        if (bLiveBossGiftRecord.page == bLiveBossGiftRecord.totalPage) {
            arrayList.add(new dxj());
        }
        this.f121210t.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m145084b0(boolean z) {
        bnl0.m105524M(this.f121205o, z);
        bnl0.m105524M(this.f121204n, z);
        bnl0.m105524M(this.f121207q, !z);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        this.f121201k = (VText) view.findViewById(mdc0.f136007N6);
        this.f121202l = (VDraweeView) view.findViewById(mdc0.f135883A);
        this.f121203m = (VDraweeView) view.findViewById(mdc0.f136123a5);
        this.f121204n = (RecyclerView) view.findViewById(mdc0.f136044R7);
        this.f121205o = (VText) view.findViewById(mdc0.f136019P0);
        this.f121206p = (RecyclerView) view.findViewById(mdc0.f136220k2);
        this.f121207q = view.findViewById(mdc0.f136065U1);
        this.f121208r = view.findViewById(mdc0.f136140c2);
        m145070N(view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        m145069M();
    }
}
