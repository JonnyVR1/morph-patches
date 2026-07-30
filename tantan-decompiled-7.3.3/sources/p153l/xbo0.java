package p153l;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.SortLayoutView;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallTabLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallUserInfoView;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.WeekStarChampionView;
import java.util.ArrayList;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xbo0 extends LiveMenuDialogHolder<ibo0> {

    /* JADX INFO: renamed from: A */
    public TextView f193180A;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f193181k;

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f193182l;

    /* JADX INFO: renamed from: m */
    public WeekStarChampionView f193183m;

    /* JADX INFO: renamed from: n */
    public View f193184n;

    /* JADX INFO: renamed from: o */
    public VText f193185o;

    /* JADX INFO: renamed from: p */
    public VImage f193186p;

    /* JADX INFO: renamed from: q */
    public GiftTab f193187q;

    /* JADX INFO: renamed from: r */
    public VoiceGiftWallUserInfoView f193188r;

    /* JADX INFO: renamed from: s */
    public View f193189s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f193190t;

    /* JADX INFO: renamed from: u */
    public VoiceGiftWallTabLayout f193191u;

    /* JADX INFO: renamed from: v */
    public String f193192v;

    /* JADX INFO: renamed from: w */
    public View f193193w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f193194x;

    /* JADX INFO: renamed from: y */
    public l4g0 f193195y;

    /* JADX INFO: renamed from: z */
    public View f193196z;

    public xbo0(ibo0 ibo0Var) {
        super(yec0.f198929T9, ibo0Var.act(), ibo0Var, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: T */
    private void m209974T(View view) {
        this.f193180A = (TextView) view.findViewById(mdc0.f136007N6);
        this.f193193w = view.findViewById(mdc0.f135883A);
        this.f193181k = (VRecyclerView) view.findViewById(mdc0.f135938G0);
        this.f193183m = (WeekStarChampionView) view.findViewById(mdc0.f136206i8);
        this.f193188r = (VoiceGiftWallUserInfoView) view.findViewById(mdc0.f136026P7);
        this.f193184n = view.findViewById(mdc0.f136096X5);
        this.f193185o = (VText) view.findViewById(mdc0.f136105Y5);
        this.f193186p = (VImage) view.findViewById(mdc0.f136087W5);
        this.f193189s = view.findViewById(mdc0.f135957I1);
        this.f193190t = (VDraweeView) view.findViewById(mdc0.f136058T3);
        this.f193191u = (VoiceGiftWallTabLayout) view.findViewById(mdc0.f136324v6);
        this.f193194x = (VDraweeView) view.findViewById(mdc0.f136088W6);
        this.f193196z = view.findViewById(mdc0.f136254o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m209975U(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m209976V(View view) {
        m209990i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m209977W(View view) {
        mo73021p();
        ((ibo0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showMainPage().mo199273j(bco0.m103544a(zrv.f205799a.m207631D0(), "myGiftCollection"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m209978X(Integer num) {
        if (num.intValue() != this.f193182l.getItemCount() - 4 || TextUtils.isEmpty(this.f193192v)) {
            return;
        }
        ((ibo0) this.f48605b).m139395a4(this.f193192v);
    }

    /* JADX INFO: renamed from: r */
    private void m209979r() {
        this.f193181k.setLayoutManager(new StaggeredGridLayoutManager(4, 1));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f193182l = liveBaseAdapter;
        this.f193181k.setAdapter(liveBaseAdapter);
        bnl0.m105509E0(this.f193193w, new View.OnClickListener() { // from class: l.jbo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119984a.m209975U(view);
            }
        });
        bnl0.m105509E0(this.f193184n, new View.OnClickListener() { // from class: l.obo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146605a.m209976V(view);
            }
        });
        bnl0.m105509E0(this.f193189s, new View.OnClickListener() { // from class: l.pbo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151404a.m209977W(view);
            }
        });
        this.f193182l.m68558c0(new y20() { // from class: l.qbo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156494a.m209978X((Integer) obj);
            }
        });
        qnp0.m177260c1(this.f193194x, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        this.f48606c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.rbo0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f162034a.m209980Y(dialogInterface);
            }
        });
        this.f48606c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sbo0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f167167a.m209981Z(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m209980Y(DialogInterface dialogInterface) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("intl_gift_collection_mainpage_enter_source", ((ibo0) this.f48605b).f114239k);
        } catch (Exception unused) {
        }
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_gift_collection_mainpage", xbo0.class.getName());
        this.f193195y = l4g0VarM204399c;
        l4g0VarM204399c.m152780o(jSONObject);
        w1e.m204402f(this.f193195y);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m209981Z(DialogInterface dialogInterface) {
        w1e.m204401e(this.f193195y);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m209982a0(PopupWindow popupWindow, GiftTab.SortRule sortRule) {
        this.f193185o.setText(sortRule.name);
        this.f193186p.setRotation(0.0f);
        popupWindow.dismiss();
        ((ibo0) this.f48605b).m139397c4(this.f193187q.type, sortRule.type);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m209983b0() {
        this.f193186p.setRotation(0.0f);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m209984c0(GiftTab giftTab) {
        if (this.f193187q == giftTab) {
            return;
        }
        this.f193187q = giftTab;
        this.f193182l.m68554Z(new ArrayList());
        ((ibo0) this.f48605b).m139397c4(giftTab.type, giftTab.sortRules.get(0).type);
        this.f193185o.setText(giftTab.sortRules.get(0).name);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m209985d0(GiftWallV3MainDetail giftWallV3MainDetail, View view) {
        ((ibo0) this.f48605b).mo138869p3(21001, giftWallV3MainDetail.rulePageSchema);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m209986e0(View view) {
        ((ibo0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showWeekStarHall().mo199273j(((ibo0) this.f48605b).f114238j);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m209987f0(GiftWallV3MainDetail giftWallV3MainDetail, String str) {
        aco0 aco0Var = new aco0();
        aco0Var.f69735b = str;
        aco0Var.f69736c = giftWallV3MainDetail.currentTime;
        T t = this.f48605b;
        aco0Var.f69734a = ((ibo0) t).f114238j;
        ((ibo0) t).m213811F2().VoiceNewGiftWallEvent.showWeekStarGiftDetail().mo199273j(aco0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m209988g0(GiftBean giftBean, View view) {
        aco0 aco0Var = new aco0();
        T t = this.f48605b;
        aco0Var.f69734a = ((ibo0) t).f114238j;
        aco0Var.f69735b = giftBean.f54601id;
        ((ibo0) t).m213811F2().VoiceNewGiftWallEvent.showGiftDetail().mo199273j(aco0Var);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m209989h0(GiftBean giftBean, View view) {
        aco0 aco0Var = new aco0();
        T t = this.f48605b;
        aco0Var.f69734a = ((ibo0) t).f114238j;
        aco0Var.f69735b = giftBean.f54601id;
        ((ibo0) t).m213811F2().VoiceNewGiftWallEvent.showGiftDetail().mo199273j(aco0Var);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m209990i0() {
        int i = bnl0.f77545f;
        final PopupWindow popupWindow = new PopupWindow(i, i);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        SortLayoutView sortLayoutView = (SortLayoutView) LayoutInflater.from(this.f48606c.getContext()).inflate(yec0.f198940U8, (ViewGroup) null);
        popupWindow.setContentView(sortLayoutView);
        GiftTab giftTab = this.f193187q;
        if (giftTab != null) {
            sortLayoutView.m79869Q(giftTab.sortRules, new y20() { // from class: l.tbo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172977a.m209982a0(popupWindow, (GiftTab.SortRule) obj);
                }
            });
        }
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ubo0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f178326a.m209983b0();
            }
        });
        popupWindow.showAsDropDown(this.f193184n, -qa00.m175859d(15.0f), qa00.m175859d(8.0f));
        this.f193186p.setRotation(180.0f);
    }

    /* JADX INFO: renamed from: j0 */
    public void m209991j0(final GiftWallV3MainDetail giftWallV3MainDetail) {
        this.f193180A.setText(giftWallV3MainDetail.title);
        izs.m142874y(this.f193194x, giftWallV3MainDetail.level.bgImage);
        this.f193183m.m79888i0(giftWallV3MainDetail.weekStarGiftTab, new View.OnClickListener() { // from class: l.vbo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183267a.m209986e0(view);
            }
        }, new y20() { // from class: l.wbo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188261a.m209987f0(giftWallV3MainDetail, (String) obj);
            }
        }, giftWallV3MainDetail.showWeekStarHale);
        this.f193188r.m79872h0(giftWallV3MainDetail);
        m209992k0();
        this.f193191u.m79871a(giftWallV3MainDetail.tabs, new y20() { // from class: l.kbo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124967a.m209984c0((GiftTab) obj);
            }
        });
        bnl0.m105509E0(this.f193196z, new View.OnClickListener() { // from class: l.lbo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131217a.m209985d0(giftWallV3MainDetail, view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m209992k0() {
        User userM207651V = zrv.f205799a.m207651V();
        bnl0.m105524M(this.f193189s, !TextUtils.equals(((ibo0) this.f48605b).f114238j, userM207651V.f56859id));
        izs.m142874y(this.f193190t, userM207651V.m61308fp().url);
    }

    /* JADX INFO: renamed from: l0 */
    public void m209993l0(GiftWallV3Tab giftWallV3Tab) {
        this.f193192v = giftWallV3Tab.nextPageLink;
        if (jyb.m147479J(giftWallV3Tab.gifts)) {
            this.f193182l.m68554Z(jyb.m147507f0(new mlp0()));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final GiftBean giftBean : giftWallV3Tab.gifts) {
            iuj iujVar = new iuj(giftBean, ((ibo0) this.f48605b).act());
            iujVar.mo113881A(new View.OnClickListener() { // from class: l.nbo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141240a.m209988g0(giftBean, view);
                }
            });
            arrayList.add(iujVar);
        }
        if (TextUtils.isEmpty(this.f193192v)) {
            arrayList.add(new f1k());
        }
        this.f193182l.m68554Z(arrayList);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m209974T(view);
        m209979r();
    }

    /* JADX INFO: renamed from: m0 */
    public void m209994m0(GiftWallV3Tab giftWallV3Tab) {
        this.f193192v = giftWallV3Tab.nextPageLink;
        if (jyb.m147479J(giftWallV3Tab.gifts)) {
            return;
        }
        for (final GiftBean giftBean : giftWallV3Tab.gifts) {
            iuj iujVar = new iuj(giftBean, ((ibo0) this.f48605b).act());
            iujVar.mo113881A(new View.OnClickListener() { // from class: l.mbo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f135738a.m209989h0(giftBean, view);
                }
            });
            LiveBaseAdapter liveBaseAdapter = this.f193182l;
            liveBaseAdapter.m68542N(liveBaseAdapter.m68538J().size(), iujVar);
        }
        if (TextUtils.isEmpty(this.f193192v)) {
            LiveBaseAdapter liveBaseAdapter2 = this.f193182l;
            liveBaseAdapter2.m68542N(liveBaseAdapter2.m68538J().size(), new f1k());
        }
    }
}
