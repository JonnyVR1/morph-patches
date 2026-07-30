package p009l;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view.SortLayoutView;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallTabLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallUserInfoView;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view.WeekStarChampionView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.cwf0;
import l.e30;
import l.g5c0;
import l.hxs;
import l.j2g0;
import l.mep0;
import l.t100;
import l.t6c0;
import l.vwb;
import l.x6s;
import l.xdl0;
import org.json.JSONObject;
import v.VDraweeView;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class t2o0 extends LiveMenuDialogHolder<e2o0> {

    /* JADX INFO: renamed from: A */
    public TextView f20528A;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f20529k;

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f20530l;

    /* JADX INFO: renamed from: m */
    public WeekStarChampionView f20531m;

    /* JADX INFO: renamed from: n */
    public View f20532n;

    /* JADX INFO: renamed from: o */
    public VText f20533o;

    /* JADX INFO: renamed from: p */
    public VImage f20534p;

    /* JADX INFO: renamed from: q */
    public GiftTab f20535q;

    /* JADX INFO: renamed from: r */
    public VoiceGiftWallUserInfoView f20536r;

    /* JADX INFO: renamed from: s */
    public View f20537s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f20538t;

    /* JADX INFO: renamed from: u */
    public VoiceGiftWallTabLayout f20539u;

    /* JADX INFO: renamed from: v */
    public String f20540v;

    /* JADX INFO: renamed from: w */
    public View f20541w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f20542x;

    /* JADX INFO: renamed from: y */
    public cwf0 f20543y;

    /* JADX INFO: renamed from: z */
    public View f20544z;

    public t2o0(e2o0 e2o0Var) {
        super(t6c0.T9, e2o0Var.act(), e2o0Var, j2g0.e(true));
    }

    /* JADX INFO: renamed from: T */
    private void m22441T(View view) {
        this.f20528A = (TextView) view.findViewById(g5c0.N6);
        this.f20541w = view.findViewById(g5c0.A);
        this.f20529k = view.findViewById(g5c0.G0);
        this.f20531m = (WeekStarChampionView) view.findViewById(g5c0.i8);
        this.f20536r = (VoiceGiftWallUserInfoView) view.findViewById(g5c0.P7);
        this.f20532n = view.findViewById(g5c0.X5);
        this.f20533o = view.findViewById(g5c0.Y5);
        this.f20534p = view.findViewById(g5c0.W5);
        this.f20537s = view.findViewById(g5c0.I1);
        this.f20538t = view.findViewById(g5c0.T3);
        this.f20539u = (VoiceGiftWallTabLayout) view.findViewById(g5c0.v6);
        this.f20542x = view.findViewById(g5c0.W6);
        this.f20544z = view.findViewById(g5c0.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m22442U(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m22443V(View view) {
        m22457i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m22444W(View view) {
        p();
        ((e2o0) ((LiveMenuDialogHolder) this).b).F2().VoiceNewGiftWallEvent.showMainPage().j(x2o0.m24680a(ypv.f23196a.m23619D0(), "myGiftCollection"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m22445X(Integer num) {
        if (num.intValue() != this.f20530l.getItemCount() - 4 || TextUtils.isEmpty(this.f20540v)) {
            return;
        }
        ((e2o0) ((LiveMenuDialogHolder) this).b).m13654a4(this.f20540v);
    }

    /* JADX INFO: renamed from: r */
    private void m22446r() {
        this.f20529k.setLayoutManager(new StaggeredGridLayoutManager(4, 1));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f20530l = liveBaseAdapter;
        this.f20529k.setAdapter(liveBaseAdapter);
        xdl0.E0(this.f20541w, new View.OnClickListener() { // from class: l.f2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12759a.m22442U(view);
            }
        });
        xdl0.E0(this.f20532n, new View.OnClickListener() { // from class: l.k2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15397a.m22443V(view);
            }
        });
        xdl0.E0(this.f20537s, new View.OnClickListener() { // from class: l.l2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15918a.m22444W(view);
            }
        });
        this.f20530l.c0(new e30() { // from class: l.m2o0
            public final void call(Object obj) {
                this.f16491a.m22445X((Integer) obj);
            }
        });
        mep0.c1(this.f20542x, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
        ((LiveMenuDialogHolder) this).c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.n2o0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f17201a.m22447Y(dialogInterface);
            }
        });
        ((LiveMenuDialogHolder) this).c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.o2o0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f17808a.m22448Z(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m22447Y(DialogInterface dialogInterface) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("intl_gift_collection_mainpage_enter_source", ((e2o0) ((LiveMenuDialogHolder) this).b).f12167k);
        } catch (Exception unused) {
        }
        cwf0 cwf0VarM16062c = i0e.m16062c("p_intl_gift_collection_mainpage", t2o0.class.getName());
        this.f20543y = cwf0VarM16062c;
        cwf0VarM16062c.o(jSONObject);
        i0e.m16065f(this.f20543y);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m22448Z(DialogInterface dialogInterface) {
        i0e.m16064e(this.f20543y);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m22449a0(PopupWindow popupWindow, GiftTab.SortRule sortRule) {
        this.f20533o.setText(sortRule.name);
        this.f20534p.setRotation(0.0f);
        popupWindow.dismiss();
        ((e2o0) ((LiveMenuDialogHolder) this).b).m13656c4(this.f20535q.type, sortRule.type);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m22450b0() {
        this.f20534p.setRotation(0.0f);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m22451c0(GiftTab giftTab) {
        if (this.f20535q == giftTab) {
            return;
        }
        this.f20535q = giftTab;
        this.f20530l.Z(new ArrayList());
        ((e2o0) ((LiveMenuDialogHolder) this).b).m13656c4(giftTab.type, giftTab.sortRules.get(0).type);
        this.f20533o.setText(giftTab.sortRules.get(0).name);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m22452d0(GiftWallV3MainDetail giftWallV3MainDetail, View view) {
        ((e2o0) ((LiveMenuDialogHolder) this).b).p3(21001, giftWallV3MainDetail.rulePageSchema);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m22453e0(View view) {
        ((e2o0) ((LiveMenuDialogHolder) this).b).F2().VoiceNewGiftWallEvent.showWeekStarHall().j(((e2o0) ((LiveMenuDialogHolder) this).b).f12166j);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m22454f0(GiftWallV3MainDetail giftWallV3MainDetail, String str) {
        w2o0 w2o0Var = new w2o0();
        w2o0Var.f21860b = str;
        w2o0Var.f21861c = giftWallV3MainDetail.currentTime;
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        w2o0Var.f21859a = ((e2o0) x6sVar).f12166j;
        ((e2o0) x6sVar).F2().VoiceNewGiftWallEvent.showWeekStarGiftDetail().j(w2o0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m22455g0(GiftBean giftBean, View view) {
        w2o0 w2o0Var = new w2o0();
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        w2o0Var.f21859a = ((e2o0) x6sVar).f12166j;
        w2o0Var.f21860b = giftBean.f7359id;
        ((e2o0) x6sVar).F2().VoiceNewGiftWallEvent.showGiftDetail().j(w2o0Var);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m22456h0(GiftBean giftBean, View view) {
        w2o0 w2o0Var = new w2o0();
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        w2o0Var.f21859a = ((e2o0) x6sVar).f12166j;
        w2o0Var.f21860b = giftBean.f7359id;
        ((e2o0) x6sVar).F2().VoiceNewGiftWallEvent.showGiftDetail().j(w2o0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View, com.p1.mobile.putong.live.livingroom.voice.newgiftwall.view.SortLayoutView] */
    /* JADX INFO: renamed from: i0 */
    public final void m22457i0() {
        int i = xdl0.f;
        final PopupWindow popupWindow = new PopupWindow(i, i);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        ?? r1 = (SortLayoutView) LayoutInflater.from(((LiveMenuDialogHolder) this).c.getContext()).inflate(t6c0.U8, (ViewGroup) null);
        popupWindow.setContentView(r1);
        GiftTab giftTab = this.f20535q;
        if (giftTab != null) {
            r1.m8902Q(giftTab.sortRules, new e30() { // from class: l.p2o0
                public final void call(Object obj) {
                    this.f18365a.m22449a0(popupWindow, (GiftTab.SortRule) obj);
                }
            });
        }
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.q2o0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f19000a.m22450b0();
            }
        });
        popupWindow.showAsDropDown(this.f20532n, -t100.d(15.0f), t100.d(8.0f));
        this.f20534p.setRotation(180.0f);
    }

    /* JADX INFO: renamed from: j0 */
    public void m22458j0(final GiftWallV3MainDetail giftWallV3MainDetail) {
        this.f20528A.setText(giftWallV3MainDetail.title);
        hxs.y(this.f20542x, giftWallV3MainDetail.level.bgImage);
        this.f20531m.m8921i0(giftWallV3MainDetail.weekStarGiftTab, new View.OnClickListener() { // from class: l.r2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19616a.m22453e0(view);
            }
        }, new e30() { // from class: l.s2o0
            public final void call(Object obj) {
                this.f20080a.m22454f0(giftWallV3MainDetail, (String) obj);
            }
        }, giftWallV3MainDetail.showWeekStarHale);
        this.f20536r.m8905h0(giftWallV3MainDetail);
        m22459k0();
        this.f20539u.m8904a(giftWallV3MainDetail.tabs, new e30() { // from class: l.g2o0
            public final void call(Object obj) {
                this.f13276a.m22451c0((GiftTab) obj);
            }
        });
        xdl0.E0(this.f20544z, new View.OnClickListener() { // from class: l.h2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13848a.m22452d0(giftWallV3MainDetail, view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m22459k0() {
        User userM23639V = ypv.f23196a.m23639V();
        xdl0.M(this.f20537s, !TextUtils.equals(((e2o0) ((LiveMenuDialogHolder) this).b).f12166j, ((DbObject) userM23639V).id));
        hxs.y(this.f20538t, ((Media) userM23639V.fp()).url);
    }

    /* JADX INFO: renamed from: l0 */
    public void m22460l0(GiftWallV3Tab giftWallV3Tab) {
        this.f20540v = giftWallV3Tab.nextPageLink;
        if (vwb.J(giftWallV3Tab.gifts)) {
            this.f20530l.Z(vwb.f0(new icp0[]{new icp0()}));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final GiftBean giftBean : giftWallV3Tab.gifts) {
            srj srjVar = new srj(giftBean, ((e2o0) ((LiveMenuDialogHolder) this).b).act());
            srjVar.A(new View.OnClickListener() { // from class: l.j2o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14921a.m22455g0(giftBean, view);
                }
            });
            arrayList.add(srjVar);
        }
        if (TextUtils.isEmpty(this.f20540v)) {
            arrayList.add(new pyj());
        }
        this.f20530l.Z(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public void m22461m(View view) {
        super.m(view);
        m22441T(view);
        m22446r();
    }

    /* JADX INFO: renamed from: m0 */
    public void m22462m0(GiftWallV3Tab giftWallV3Tab) {
        this.f20540v = giftWallV3Tab.nextPageLink;
        if (vwb.J(giftWallV3Tab.gifts)) {
            return;
        }
        for (final GiftBean giftBean : giftWallV3Tab.gifts) {
            srj srjVar = new srj(giftBean, ((e2o0) ((LiveMenuDialogHolder) this).b).act());
            srjVar.A(new View.OnClickListener() { // from class: l.i2o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14385a.m22456h0(giftBean, view);
                }
            });
            LiveBaseAdapter liveBaseAdapter = this.f20530l;
            liveBaseAdapter.N(liveBaseAdapter.J().size(), srjVar);
        }
        if (TextUtils.isEmpty(this.f20540v)) {
            LiveBaseAdapter liveBaseAdapter2 = this.f20530l;
            liveBaseAdapter2.N(liveBaseAdapter2.J().size(), new pyj());
        }
    }
}
