package p149l;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.SortLayoutView;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallTabLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallUserInfoView;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.WeekStarChampionView;
import java.util.ArrayList;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class t2o0 extends LiveMenuDialogHolder<e2o0> {

    /* JADX INFO: renamed from: A */
    public TextView f167523A;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f167524k;

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f167525l;

    /* JADX INFO: renamed from: m */
    public WeekStarChampionView f167526m;

    /* JADX INFO: renamed from: n */
    public View f167527n;

    /* JADX INFO: renamed from: o */
    public VText f167528o;

    /* JADX INFO: renamed from: p */
    public VImage f167529p;

    /* JADX INFO: renamed from: q */
    public GiftTab f167530q;

    /* JADX INFO: renamed from: r */
    public VoiceGiftWallUserInfoView f167531r;

    /* JADX INFO: renamed from: s */
    public View f167532s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f167533t;

    /* JADX INFO: renamed from: u */
    public VoiceGiftWallTabLayout f167534u;

    /* JADX INFO: renamed from: v */
    public String f167535v;

    /* JADX INFO: renamed from: w */
    public View f167536w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f167537x;

    /* JADX INFO: renamed from: y */
    public cwf0 f167538y;

    /* JADX INFO: renamed from: z */
    public View f167539z;

    public t2o0(e2o0 e2o0Var) {
        super(t6c0.f168197T9, e2o0Var.act(), e2o0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: T */
    private void m187036T(View view) {
        this.f167523A = (TextView) view.findViewById(g5c0.f100762N6);
        this.f167536w = view.findViewById(g5c0.f100638A);
        this.f167524k = (VRecyclerView) view.findViewById(g5c0.f100693G0);
        this.f167526m = (WeekStarChampionView) view.findViewById(g5c0.f100961i8);
        this.f167531r = (VoiceGiftWallUserInfoView) view.findViewById(g5c0.f100781P7);
        this.f167527n = view.findViewById(g5c0.f100851X5);
        this.f167528o = (VText) view.findViewById(g5c0.f100860Y5);
        this.f167529p = (VImage) view.findViewById(g5c0.f100842W5);
        this.f167532s = view.findViewById(g5c0.f100712I1);
        this.f167533t = (VDraweeView) view.findViewById(g5c0.f100813T3);
        this.f167534u = (VoiceGiftWallTabLayout) view.findViewById(g5c0.f101079v6);
        this.f167537x = (VDraweeView) view.findViewById(g5c0.f100843W6);
        this.f167539z = view.findViewById(g5c0.f101009o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m187037U(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m187038V(View view) {
        m187052i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m187039W(View view) {
        mo71838p();
        ((e2o0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showMainPage().mo172463j(x2o0.m206856a(ypv.f199493a.m199309D0(), "myGiftCollection"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m187040X(Integer num) {
        if (num.intValue() != this.f167525l.getItemCount() - 4 || TextUtils.isEmpty(this.f167535v)) {
            return;
        }
        ((e2o0) this.f47757b).m114517a4(this.f167535v);
    }

    /* JADX INFO: renamed from: r */
    private void m187041r() {
        this.f167524k.setLayoutManager(new StaggeredGridLayoutManager(4, 1));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f167525l = liveBaseAdapter;
        this.f167524k.setAdapter(liveBaseAdapter);
        xdl0.m208329E0(this.f167536w, new View.OnClickListener() { // from class: l.f2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94226a.m187037U(view);
            }
        });
        xdl0.m208329E0(this.f167527n, new View.OnClickListener() { // from class: l.k2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120754a.m187038V(view);
            }
        });
        xdl0.m208329E0(this.f167532s, new View.OnClickListener() { // from class: l.l2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125802a.m187039W(view);
            }
        });
        this.f167525l.m67375c0(new e30() { // from class: l.m2o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130934a.m187040X((Integer) obj);
            }
        });
        mep0.m154301c1(this.f167537x, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        this.f47758c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.n2o0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f136865a.m187042Y(dialogInterface);
            }
        });
        this.f47758c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.o2o0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f141542a.m187043Z(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m187042Y(DialogInterface dialogInterface) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("intl_gift_collection_mainpage_enter_source", ((e2o0) this.f47757b).f88935k);
        } catch (Exception unused) {
        }
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_gift_collection_mainpage", t2o0.class.getName());
        this.f167538y = cwf0VarM133794c;
        cwf0VarM133794c.m109039o(jSONObject);
        i0e.m133797f(this.f167538y);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m187043Z(DialogInterface dialogInterface) {
        i0e.m133796e(this.f167538y);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m187044a0(PopupWindow popupWindow, GiftTab.SortRule sortRule) {
        this.f167528o.setText(sortRule.name);
        this.f167529p.setRotation(0.0f);
        popupWindow.dismiss();
        ((e2o0) this.f47757b).m114519c4(this.f167530q.type, sortRule.type);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m187045b0() {
        this.f167529p.setRotation(0.0f);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m187046c0(GiftTab giftTab) {
        if (this.f167530q == giftTab) {
            return;
        }
        this.f167530q = giftTab;
        this.f167525l.m67371Z(new ArrayList());
        ((e2o0) this.f47757b).m114519c4(giftTab.type, giftTab.sortRules.get(0).type);
        this.f167528o.setText(giftTab.sortRules.get(0).name);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m187047d0(GiftWallV3MainDetail giftWallV3MainDetail, View view) {
        ((e2o0) this.f47757b).mo129310p3(21001, giftWallV3MainDetail.rulePageSchema);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m187048e0(View view) {
        ((e2o0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showWeekStarHall().mo172463j(((e2o0) this.f47757b).f88934j);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m187049f0(GiftWallV3MainDetail giftWallV3MainDetail, String str) {
        w2o0 w2o0Var = new w2o0();
        w2o0Var.f184266b = str;
        w2o0Var.f184267c = giftWallV3MainDetail.currentTime;
        T t = this.f47757b;
        w2o0Var.f184265a = ((e2o0) t).f88934j;
        ((e2o0) t).m206028F2().VoiceNewGiftWallEvent.showWeekStarGiftDetail().mo172463j(w2o0Var);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m187050g0(GiftBean giftBean, View view) {
        w2o0 w2o0Var = new w2o0();
        T t = this.f47757b;
        w2o0Var.f184265a = ((e2o0) t).f88934j;
        w2o0Var.f184266b = giftBean.f53753id;
        ((e2o0) t).m206028F2().VoiceNewGiftWallEvent.showGiftDetail().mo172463j(w2o0Var);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m187051h0(GiftBean giftBean, View view) {
        w2o0 w2o0Var = new w2o0();
        T t = this.f47757b;
        w2o0Var.f184265a = ((e2o0) t).f88934j;
        w2o0Var.f184266b = giftBean.f53753id;
        ((e2o0) t).m206028F2().VoiceNewGiftWallEvent.showGiftDetail().mo172463j(w2o0Var);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m187052i0() {
        int i = xdl0.f192404f;
        final PopupWindow popupWindow = new PopupWindow(i, i);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        SortLayoutView sortLayoutView = (SortLayoutView) LayoutInflater.from(this.f47758c.getContext()).inflate(t6c0.f168208U8, (ViewGroup) null);
        popupWindow.setContentView(sortLayoutView);
        GiftTab giftTab = this.f167530q;
        if (giftTab != null) {
            sortLayoutView.m78686Q(giftTab.sortRules, new e30() { // from class: l.p2o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146903a.m187044a0(popupWindow, (GiftTab.SortRule) obj);
                }
            });
        }
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.q2o0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f152284a.m187045b0();
            }
        });
        popupWindow.showAsDropDown(this.f167527n, -t100.m186890d(15.0f), t100.m186890d(8.0f));
        this.f167529p.setRotation(180.0f);
    }

    /* JADX INFO: renamed from: j0 */
    public void m187053j0(final GiftWallV3MainDetail giftWallV3MainDetail) {
        this.f167523A.setText(giftWallV3MainDetail.title);
        hxs.m133412y(this.f167537x, giftWallV3MainDetail.level.bgImage);
        this.f167526m.m78705i0(giftWallV3MainDetail.weekStarGiftTab, new View.OnClickListener() { // from class: l.r2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157427a.m187048e0(view);
            }
        }, new e30() { // from class: l.s2o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161992a.m187049f0(giftWallV3MainDetail, (String) obj);
            }
        }, giftWallV3MainDetail.showWeekStarHale);
        this.f167531r.m78689h0(giftWallV3MainDetail);
        m187054k0();
        this.f167534u.m78688a(giftWallV3MainDetail.tabs, new e30() { // from class: l.g2o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100275a.m187046c0((GiftTab) obj);
            }
        });
        xdl0.m208329E0(this.f167539z, new View.OnClickListener() { // from class: l.h2o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105544a.m187047d0(giftWallV3MainDetail, view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m187054k0() {
        User userM199329V = ypv.f199493a.m199329V();
        xdl0.m208344M(this.f167532s, !TextUtils.equals(((e2o0) this.f47757b).f88934j, userM199329V.f56011id));
        hxs.m133412y(this.f167533t, userM199329V.m60124fp().url);
    }

    /* JADX INFO: renamed from: l0 */
    public void m187055l0(GiftWallV3Tab giftWallV3Tab) {
        this.f167535v = giftWallV3Tab.nextPageLink;
        if (vwb.m200296J(giftWallV3Tab.gifts)) {
            this.f167525l.m67371Z(vwb.m200324f0(new icp0()));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final GiftBean giftBean : giftWallV3Tab.gifts) {
            srj srjVar = new srj(giftBean, ((e2o0) this.f47757b).act());
            srjVar.mo109662A(new View.OnClickListener() { // from class: l.j2o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115939a.m187050g0(giftBean, view);
                }
            });
            arrayList.add(srjVar);
        }
        if (TextUtils.isEmpty(this.f167535v)) {
            arrayList.add(new pyj());
        }
        this.f167525l.m67371Z(arrayList);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m187036T(view);
        m187041r();
    }

    /* JADX INFO: renamed from: m0 */
    public void m187056m0(GiftWallV3Tab giftWallV3Tab) {
        this.f167535v = giftWallV3Tab.nextPageLink;
        if (vwb.m200296J(giftWallV3Tab.gifts)) {
            return;
        }
        for (final GiftBean giftBean : giftWallV3Tab.gifts) {
            srj srjVar = new srj(giftBean, ((e2o0) this.f47757b).act());
            srjVar.mo109662A(new View.OnClickListener() { // from class: l.i2o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110570a.m187051h0(giftBean, view);
                }
            });
            LiveBaseAdapter liveBaseAdapter = this.f167525l;
            liveBaseAdapter.m67359N(liveBaseAdapter.m67355J().size(), srjVar);
        }
        if (TextUtils.isEmpty(this.f167535v)) {
            LiveBaseAdapter liveBaseAdapter2 = this.f167525l;
            liveBaseAdapter2.m67359N(liveBaseAdapter2.m67355J().size(), new pyj());
        }
    }
}
