package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class hcp0 extends LiveMenuDialogHolder<ybp0> {

    /* JADX INFO: renamed from: w */
    public static String f107080w = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjgyQzY5OEUzQUUyQTQ0OTE5QjZFOTMwNjRBRjc3QUE3IiwidyI6MTEyNSwiaCI6ODIyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTgwNDA3MTQ3MTE2MDQzMDM1OSwicHQiOjIwMjUxMDE1MTl9.webp";

    /* JADX INFO: renamed from: k */
    public VDraweeView f107081k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f107082l;

    /* JADX INFO: renamed from: m */
    public LiveBaseAdapter f107083m;

    /* JADX INFO: renamed from: n */
    public View f107084n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f107085o;

    /* JADX INFO: renamed from: p */
    public VText f107086p;

    /* JADX INFO: renamed from: q */
    public VText f107087q;

    /* JADX INFO: renamed from: r */
    public VText f107088r;

    /* JADX INFO: renamed from: s */
    public VText f107089s;

    /* JADX INFO: renamed from: t */
    public TextView f107090t;

    /* JADX INFO: renamed from: u */
    public TextView f107091u;

    /* JADX INFO: renamed from: v */
    public cwf0 f107092v;

    /* JADX INFO: renamed from: l.hcp0$a */
    public class C17279a implements zfv.C21687a.a {
        public C17279a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            lsi0.m151593w(R$string.f47566ud);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            super.mo67168c();
        }
    }

    public hcp0(ybp0 ybp0Var) {
        super(t6c0.f168465ob, ybp0Var.act(), ybp0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: N */
    private void m130475N(View view) {
        this.f107081k = (VDraweeView) view.findViewById(g5c0.f100710I);
        this.f107082l = (VRecyclerView) view.findViewById(g5c0.f101058t3);
        this.f107084n = view.findViewById(g5c0.f100638A);
        this.f107085o = (VDraweeView) view.findViewById(g5c0.f100962j);
        this.f107088r = (VText) view.findViewById(g5c0.f100991m);
        this.f107086p = (VText) view.findViewById(g5c0.f100972k);
        this.f107087q = (VText) view.findViewById(g5c0.f100982l);
        this.f107089s = (VText) view.findViewById(g5c0.f101104y4);
        this.f107090t = (TextView) view.findViewById(g5c0.f100762N6);
        TextView textView = (TextView) view.findViewById(g5c0.f100924f1);
        this.f107091u = textView;
        Drawable drawable = textView.getContext().getDrawable(i3c0.f110759K1);
        if (drawable != null) {
            drawable.setBounds(0, 0, t100.m186890d(13.0f), t100.m186890d(13.0f));
            this.f107091u.setCompoundDrawables(drawable, null, null, null);
            this.f107091u.setCompoundDrawablePadding(t100.m186890d(2.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m130476P(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m130477R(DialogInterface dialogInterface) {
        i0e.m133796e(this.f107092v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m130478U(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m130480a0(giftWallV3GiftWeekStarGiftMainDetail, 1);
    }

    /* JADX INFO: renamed from: X */
    private void m130479X(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        T t = this.f47757b;
        ((ybp0) t).m213972e4(((ybp0) t).f197348j, ((ybp0) t).f197349k, ((ybp0) t).f197350l, new e30() { // from class: l.fcp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96841a.m130484S((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    private void m130480a0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, int i) {
        cfe0.C16123a c16123aM106530u = new cfe0.C16123a().m106530u(giftWallV3GiftWeekStarGiftMainDetail.gift.f53753id, new C17279a(), i, "giftWall", "giftWall", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("common"), BLiveTraceServerBiz.get(BLiveTraceServerBiz.giftcollection)));
        T t = this.f47757b;
        c16123aM106530u.f80610u = ((ybp0) t).f197348j;
        c16123aM106530u.f80590a = "voice_gift_wall";
        ((ybp0) t).m206028F2().SendGiftEventGroup.sendGift().mo172463j(c16123aM106530u.m106529t());
    }

    /* JADX INFO: renamed from: r */
    private void m130481r() {
        mep0.m154301c1(this.f107081k, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        hxs.m133412y(this.f107081k, f107080w);
        xdl0.m208329E0(this.f107084n, new View.OnClickListener() { // from class: l.zbp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202470a.m130476P(view);
            }
        });
        this.f107082l.setLayoutManager(new LinearLayoutManager(getAct(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f107083m = liveBaseAdapter;
        this.f107082l.setAdapter(liveBaseAdapter);
        this.f47758c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.acp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f68869a.m130483Q(dialogInterface);
            }
        });
        this.f47758c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bcp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f74956a.m130477R(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final String m130482O(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m130483Q(DialogInterface dialogInterface) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("intl_gift_collcetion_weekly_star_gift", ((ybp0) this.f47757b).f197349k);
        } catch (Exception unused) {
        }
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_gift_collcetion_weekly_star_gift", hcp0.class.getName());
        this.f107092v = cwf0VarM133794c;
        cwf0VarM133794c.m109039o(jSONObject);
        i0e.m133797f(this.f107092v);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m130484S(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        m130489Z(giftWallV3GiftWeekStarGiftMainDetail);
        m130490b0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m130485T(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m130479X(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m130486V(String str) {
        ((ybp0) this.f47757b).m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        T t = this.f47757b;
        u4n0.m191752k(t, ((nnn0) ((ybp0) t).m206027E2()).m132140j0(), str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m130487W(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m130480a0(giftWallV3GiftWeekStarGiftMainDetail, giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum);
    }

    /* JADX INFO: renamed from: Y */
    public final void m130488Y(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard;
        hxs.m133412y(this.f107085o, weekStarLeaderboard.user.avatar);
        this.f107086p.setText(weekStarLeaderboard.user.name);
        this.f107091u.setText((giftWallV3GiftWeekStarGiftMainDetail.gift.price * giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum) + "");
        int i = giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard.rank;
        VText vText = this.f107088r;
        if (i <= 0) {
            vText.setText("-");
        } else {
            vText.setText(m130482O(weekStarLeaderboard.rank));
        }
        int i2 = giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum;
        VText vText2 = this.f107089s;
        if (i2 <= 0) {
            vText2.setOnClickListener(null);
            this.f107089s.setTextColor(Color.parseColor("#33FFFFFF"));
            this.f107089s.setBackground(yb2.m213884i(Color.parseColor("#1AFFFFFF"), 10));
            this.f107087q.setText(w8u.m202218u(R$string.f46843N2, giftWallV3GiftWeekStarGiftMainDetail.user.name));
            return;
        }
        vText2.setBackground(yb2.m213884i(Color.parseColor("#FE7E1D"), 10));
        this.f107089s.setTextColor(-1);
        xdl0.m208329E0(this.f107089s, new View.OnClickListener() { // from class: l.ecp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90559a.m130485T(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        });
        this.f107087q.setText(w8u.m202218u(R$string.f46588B9, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum)));
        w8u.m202207E(this.f107087q, Color.parseColor("#FE7E1D"), this.f107087q.getText().toString(), giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum + "");
    }

    /* JADX INFO: renamed from: Z */
    public void m130489Z(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        if (this.f47758c.isShowing()) {
            this.f107090t.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.name);
            List arrayList = giftWallV3GiftWeekStarGiftMainDetail.leaderboards;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            pbv pbvVar = new pbv(giftWallV3GiftWeekStarGiftMainDetail);
            pbvVar.m168254I(new View.OnClickListener() { // from class: l.ccp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80285a.m130478U(giftWallV3GiftWeekStarGiftMainDetail, view);
                }
            });
            arrayList2.add(pbvVar);
            if (vwb.m200296J(arrayList)) {
                arrayList2.add(new icp0());
            } else {
                for (int i = 0; i < arrayList.size(); i++) {
                    pcp0 pcp0Var = new pcp0((WeekStarLeaderboard) arrayList.get(i));
                    pcp0Var.m168363I(new e30() { // from class: l.dcp0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f85484a.m130486V((String) obj);
                        }
                    });
                    arrayList2.add(pcp0Var);
                }
            }
            this.f107083m.m67371Z(arrayList2);
            m130488Y(giftWallV3GiftWeekStarGiftMainDetail);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m130490b0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        new xh0.C21150a(((ybp0) this.f47757b).act()).m208731j(w8u.m202219v(R$string.f47412nd, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankPrice), giftWallV3GiftWeekStarGiftMainDetail.gift.name, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.user.name)).m208738q(R$string.f47135b).m208736o(new View.OnClickListener() { // from class: l.gcp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102045a.m130487W(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        }).m208726e(R$string.f47113a).m208722a().m208721g();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m130475N(view);
        m130481r();
    }
}
