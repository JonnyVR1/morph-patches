package p009l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import l.cfe0;
import l.cwf0;
import l.e30;
import l.g5c0;
import l.hxs;
import l.i3c0;
import l.j2g0;
import l.lsi0;
import l.mep0;
import l.t100;
import l.t6c0;
import l.u4n0;
import l.vwb;
import l.w8u;
import l.x6s;
import l.xdl0;
import l.xh0;
import l.yb2;
import l.zfv;
import org.json.JSONObject;
import v.VDraweeView;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hcp0 extends LiveMenuDialogHolder<ybp0> {

    /* JADX INFO: renamed from: w */
    public static String f13963w = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjgyQzY5OEUzQUUyQTQ0OTE5QjZFOTMwNjRBRjc3QUE3IiwidyI6MTEyNSwiaCI6ODIyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTgwNDA3MTQ3MTE2MDQzMDM1OSwicHQiOjIwMjUxMDE1MTl9.webp";

    /* JADX INFO: renamed from: k */
    public VDraweeView f13964k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f13965l;

    /* JADX INFO: renamed from: m */
    public LiveBaseAdapter f13966m;

    /* JADX INFO: renamed from: n */
    public View f13967n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f13968o;

    /* JADX INFO: renamed from: p */
    public VText f13969p;

    /* JADX INFO: renamed from: q */
    public VText f13970q;

    /* JADX INFO: renamed from: r */
    public VText f13971r;

    /* JADX INFO: renamed from: s */
    public VText f13972s;

    /* JADX INFO: renamed from: t */
    public TextView f13973t;

    /* JADX INFO: renamed from: u */
    public TextView f13974u;

    /* JADX INFO: renamed from: v */
    public cwf0 f13975v;

    /* JADX INFO: renamed from: l.hcp0$a */
    public class C0933a implements zfv.a.a {
        public C0933a() {
        }

        /* JADX INFO: renamed from: a */
        public void m15578a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            lsi0.w(R.string.ud);
        }

        /* JADX INFO: renamed from: c */
        public void m15579c() {
            super.c();
        }
    }

    public hcp0(ybp0 ybp0Var) {
        super(t6c0.ob, ybp0Var.act(), ybp0Var, j2g0.e(true));
    }

    /* JADX INFO: renamed from: N */
    private void m15561N(View view) {
        this.f13964k = view.findViewById(g5c0.I);
        this.f13965l = view.findViewById(g5c0.t3);
        this.f13967n = view.findViewById(g5c0.A);
        this.f13968o = view.findViewById(g5c0.j);
        this.f13971r = view.findViewById(g5c0.m);
        this.f13969p = view.findViewById(g5c0.k);
        this.f13970q = view.findViewById(g5c0.l);
        this.f13972s = view.findViewById(g5c0.y4);
        this.f13973t = (TextView) view.findViewById(g5c0.N6);
        TextView textView = (TextView) view.findViewById(g5c0.f1);
        this.f13974u = textView;
        Drawable drawable = textView.getContext().getDrawable(i3c0.K1);
        if (drawable != null) {
            drawable.setBounds(0, 0, t100.d(13.0f), t100.d(13.0f));
            this.f13974u.setCompoundDrawables(drawable, null, null, null);
            this.f13974u.setCompoundDrawablePadding(t100.d(2.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m15562P(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m15563R(DialogInterface dialogInterface) {
        i0e.m16064e(this.f13975v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m15564U(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m15566a0(giftWallV3GiftWeekStarGiftMainDetail, 1);
    }

    /* JADX INFO: renamed from: X */
    private void m15565X(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        ((ybp0) x6sVar).m25280e4(((ybp0) x6sVar).f22987j, ((ybp0) x6sVar).f22988k, ((ybp0) x6sVar).f22989l, new e30() { // from class: l.fcp0
            public final void call(Object obj) {
                this.f12923a.m15570S((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    private void m15566a0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, int i) {
        cfe0.a aVarU = new cfe0.a().u(giftWallV3GiftWeekStarGiftMainDetail.gift.f7359id, new C0933a(), i, "giftWall", "giftWall", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("common"), BLiveTraceServerBiz.get("giftcollection")));
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        aVarU.u = ((ybp0) x6sVar).f22987j;
        aVarU.a = "voice_gift_wall";
        ((ybp0) x6sVar).F2().SendGiftEventGroup.sendGift().j(aVarU.t());
    }

    /* JADX INFO: renamed from: r */
    private void m15567r() {
        mep0.c1(this.f13964k, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
        hxs.y(this.f13964k, f13963w);
        xdl0.E0(this.f13967n, new View.OnClickListener() { // from class: l.zbp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23554a.m15562P(view);
            }
        });
        this.f13965l.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f13966m = liveBaseAdapter;
        this.f13965l.setAdapter(liveBaseAdapter);
        ((LiveMenuDialogHolder) this).c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.acp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f9403a.m15569Q(dialogInterface);
            }
        });
        ((LiveMenuDialogHolder) this).c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bcp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f10014a.m15563R(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final String m15568O(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m15569Q(DialogInterface dialogInterface) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("intl_gift_collcetion_weekly_star_gift", ((ybp0) ((LiveMenuDialogHolder) this).b).f22988k);
        } catch (Exception unused) {
        }
        cwf0 cwf0VarM16062c = i0e.m16062c("p_intl_gift_collcetion_weekly_star_gift", hcp0.class.getName());
        this.f13975v = cwf0VarM16062c;
        cwf0VarM16062c.o(jSONObject);
        i0e.m16065f(this.f13975v);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m15570S(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        m15575Z(giftWallV3GiftWeekStarGiftMainDetail);
        m15576b0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m15571T(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m15565X(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m15572V(String str) {
        ((ybp0) ((LiveMenuDialogHolder) this).b).F2().OpenUserCardDialogEvent.dismiss().p();
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        u4n0.k(x6sVar, ((ybp0) x6sVar).E2().j0(), str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m15573W(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m15566a0(giftWallV3GiftWeekStarGiftMainDetail, giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum);
    }

    /* JADX INFO: renamed from: Y */
    public final void m15574Y(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard;
        hxs.y(this.f13968o, weekStarLeaderboard.user.avatar);
        this.f13969p.setText(weekStarLeaderboard.user.name);
        this.f13974u.setText((giftWallV3GiftWeekStarGiftMainDetail.gift.price * giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum) + "");
        int i = giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard.rank;
        VText vText = this.f13971r;
        if (i <= 0) {
            vText.setText("-");
        } else {
            vText.setText(m15568O(weekStarLeaderboard.rank));
        }
        int i2 = giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum;
        VText vText2 = this.f13972s;
        if (i2 <= 0) {
            vText2.setOnClickListener(null);
            this.f13972s.setTextColor(Color.parseColor("#33FFFFFF"));
            this.f13972s.setBackground(yb2.i(Color.parseColor("#1AFFFFFF"), 10));
            this.f13970q.setText(w8u.u(R.string.N2, giftWallV3GiftWeekStarGiftMainDetail.user.name));
            return;
        }
        vText2.setBackground(yb2.i(Color.parseColor("#FE7E1D"), 10));
        this.f13972s.setTextColor(-1);
        xdl0.E0(this.f13972s, new View.OnClickListener() { // from class: l.ecp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12507a.m15571T(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        });
        this.f13970q.setText(w8u.u(R.string.B9, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum)));
        w8u.E(this.f13970q, Color.parseColor("#FE7E1D"), this.f13970q.getText().toString(), giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum + "");
    }

    /* JADX INFO: renamed from: Z */
    public void m15575Z(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        if (((LiveMenuDialogHolder) this).c.isShowing()) {
            this.f13973t.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.name);
            List arrayList = giftWallV3GiftWeekStarGiftMainDetail.leaderboards;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            pbv pbvVar = new pbv(giftWallV3GiftWeekStarGiftMainDetail);
            pbvVar.m20122I(new View.OnClickListener() { // from class: l.ccp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10528a.m15564U(giftWallV3GiftWeekStarGiftMainDetail, view);
                }
            });
            arrayList2.add(pbvVar);
            if (vwb.J(arrayList)) {
                arrayList2.add(new icp0());
            } else {
                for (int i = 0; i < arrayList.size(); i++) {
                    pcp0 pcp0Var = new pcp0((WeekStarLeaderboard) arrayList.get(i));
                    pcp0Var.m20147I(new e30() { // from class: l.dcp0
                        public final void call(Object obj) {
                            this.f11767a.m15572V((String) obj);
                        }
                    });
                    arrayList2.add(pcp0Var);
                }
            }
            this.f13966m.Z(arrayList2);
            m15574Y(giftWallV3GiftWeekStarGiftMainDetail);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m15576b0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        new xh0.a(((ybp0) ((LiveMenuDialogHolder) this).b).act()).j(w8u.v(R.string.nd, new Object[]{Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankPrice), giftWallV3GiftWeekStarGiftMainDetail.gift.name, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.user.name})).q(R.string.b).o(new View.OnClickListener() { // from class: l.gcp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13440a.m15573W(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        }).e(R.string.a).a().g();
    }

    /* JADX INFO: renamed from: m */
    public void m15577m(View view) {
        super.m(view);
        m15561N(view);
        m15567r();
    }
}
