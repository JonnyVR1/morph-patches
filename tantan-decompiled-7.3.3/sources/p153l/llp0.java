package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class llp0 extends LiveMenuDialogHolder<clp0> {

    /* JADX INFO: renamed from: w */
    public static String f132584w = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjgyQzY5OEUzQUUyQTQ0OTE5QjZFOTMwNjRBRjc3QUE3IiwidyI6MTEyNSwiaCI6ODIyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTgwNDA3MTQ3MTE2MDQzMDM1OSwicHQiOjIwMjUxMDE1MTl9.webp";

    /* JADX INFO: renamed from: k */
    public VDraweeView f132585k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f132586l;

    /* JADX INFO: renamed from: m */
    public LiveBaseAdapter f132587m;

    /* JADX INFO: renamed from: n */
    public View f132588n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f132589o;

    /* JADX INFO: renamed from: p */
    public VText f132590p;

    /* JADX INFO: renamed from: q */
    public VText f132591q;

    /* JADX INFO: renamed from: r */
    public VText f132592r;

    /* JADX INFO: renamed from: s */
    public VText f132593s;

    /* JADX INFO: renamed from: t */
    public TextView f132594t;

    /* JADX INFO: renamed from: u */
    public TextView f132595u;

    /* JADX INFO: renamed from: v */
    public l4g0 f132596v;

    /* JADX INFO: renamed from: l.llp0$a */
    public class C18414a implements aiv.C15716a.a {
        public C18414a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            o1j0.m165649w(R$string.f48414ud);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            super.mo68351c();
        }
    }

    public llp0(clp0 clp0Var) {
        super(yec0.f199197ob, clp0Var.act(), clp0Var, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: N */
    private void m154769N(View view) {
        this.f132585k = (VDraweeView) view.findViewById(mdc0.f135955I);
        this.f132586l = (VRecyclerView) view.findViewById(mdc0.f136303t3);
        this.f132588n = view.findViewById(mdc0.f135883A);
        this.f132589o = (VDraweeView) view.findViewById(mdc0.f136207j);
        this.f132592r = (VText) view.findViewById(mdc0.f136236m);
        this.f132590p = (VText) view.findViewById(mdc0.f136217k);
        this.f132591q = (VText) view.findViewById(mdc0.f136227l);
        this.f132593s = (VText) view.findViewById(mdc0.f136349y4);
        this.f132594t = (TextView) view.findViewById(mdc0.f136007N6);
        TextView textView = (TextView) view.findViewById(mdc0.f136169f1);
        this.f132595u = textView;
        Drawable drawable = textView.getContext().getDrawable(obc0.f146087K1);
        if (drawable != null) {
            drawable.setBounds(0, 0, qa00.m175859d(13.0f), qa00.m175859d(13.0f));
            this.f132595u.setCompoundDrawables(drawable, null, null, null);
            this.f132595u.setCompoundDrawablePadding(qa00.m175859d(2.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m154770P(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m154771R(DialogInterface dialogInterface) {
        w1e.m204401e(this.f132596v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m154772U(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m154774a0(giftWallV3GiftWeekStarGiftMainDetail, 1);
    }

    /* JADX INFO: renamed from: X */
    private void m154773X(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        T t = this.f48605b;
        ((clp0) t).m110695e4(((clp0) t).f82415j, ((clp0) t).f82416k, ((clp0) t).f82417l, new y20() { // from class: l.jlp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121586a.m154778S((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    private void m154774a0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, int i) {
        hne0.C17513a c17513aM136084u = new hne0.C17513a().m136084u(giftWallV3GiftWeekStarGiftMainDetail.gift.f54601id, new C18414a(), i, "giftWall", "giftWall", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("common"), BLiveTraceServerBiz.get(BLiveTraceServerBiz.giftcollection)));
        T t = this.f48605b;
        c17513aM136084u.f110753u = ((clp0) t).f82415j;
        c17513aM136084u.f110733a = "voice_gift_wall";
        ((clp0) t).m213811F2().SendGiftEventGroup.sendGift().mo199273j(c17513aM136084u.m136083t());
    }

    /* JADX INFO: renamed from: r */
    private void m154775r() {
        qnp0.m177260c1(this.f132585k, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        izs.m142874y(this.f132585k, f132584w);
        bnl0.m105509E0(this.f132588n, new View.OnClickListener() { // from class: l.dlp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89564a.m154770P(view);
            }
        });
        this.f132586l.setLayoutManager(new LinearLayoutManager(getAct(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f132587m = liveBaseAdapter;
        this.f132586l.setAdapter(liveBaseAdapter);
        this.f48606c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.elp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f94573a.m154777Q(dialogInterface);
            }
        });
        this.f48606c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.flp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f99682a.m154771R(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final String m154776O(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m154777Q(DialogInterface dialogInterface) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("intl_gift_collcetion_weekly_star_gift", ((clp0) this.f48605b).f82416k);
        } catch (Exception unused) {
        }
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_gift_collcetion_weekly_star_gift", llp0.class.getName());
        this.f132596v = l4g0VarM204399c;
        l4g0VarM204399c.m152780o(jSONObject);
        w1e.m204402f(this.f132596v);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m154778S(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        m154783Z(giftWallV3GiftWeekStarGiftMainDetail);
        m154784b0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m154779T(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m154773X(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m154780V(String str) {
        ((clp0) this.f48605b).m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        T t = this.f48605b;
        ydn0.m215258k(t, ((rwn0) ((clp0) t).m213810E2()).m168526j0(), str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m154781W(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m154774a0(giftWallV3GiftWeekStarGiftMainDetail, giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum);
    }

    /* JADX INFO: renamed from: Y */
    public final void m154782Y(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard;
        izs.m142874y(this.f132589o, weekStarLeaderboard.user.avatar);
        this.f132590p.setText(weekStarLeaderboard.user.name);
        this.f132595u.setText((giftWallV3GiftWeekStarGiftMainDetail.gift.price * giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum) + "");
        int i = giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard.rank;
        VText vText = this.f132592r;
        if (i <= 0) {
            vText.setText("-");
        } else {
            vText.setText(m154776O(weekStarLeaderboard.rank));
        }
        int i2 = giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum;
        VText vText2 = this.f132593s;
        if (i2 <= 0) {
            vText2.setOnClickListener(null);
            this.f132593s.setTextColor(Color.parseColor("#33FFFFFF"));
            this.f132593s.setBackground(fc2.m124979i(Color.parseColor("#1AFFFFFF"), 10));
            this.f132591q.setText(xau.m209911u(R$string.f47691N2, giftWallV3GiftWeekStarGiftMainDetail.user.name));
            return;
        }
        vText2.setBackground(fc2.m124979i(Color.parseColor("#FE7E1D"), 10));
        this.f132593s.setTextColor(-1);
        bnl0.m105509E0(this.f132593s, new View.OnClickListener() { // from class: l.ilp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115596a.m154779T(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        });
        this.f132591q.setText(xau.m209911u(R$string.f47436B9, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum)));
        xau.m209900E(this.f132591q, Color.parseColor("#FE7E1D"), this.f132591q.getText().toString(), giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum + "");
    }

    /* JADX INFO: renamed from: Z */
    public void m154783Z(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        if (this.f48606c.isShowing()) {
            this.f132594t.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.name);
            List arrayList = giftWallV3GiftWeekStarGiftMainDetail.leaderboards;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            qdv qdvVar = new qdv(giftWallV3GiftWeekStarGiftMainDetail);
            qdvVar.m176208I(new View.OnClickListener() { // from class: l.glp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104876a.m154772U(giftWallV3GiftWeekStarGiftMainDetail, view);
                }
            });
            arrayList2.add(qdvVar);
            if (jyb.m147479J(arrayList)) {
                arrayList2.add(new mlp0());
            } else {
                for (int i = 0; i < arrayList.size(); i++) {
                    tlp0 tlp0Var = new tlp0((WeekStarLeaderboard) arrayList.get(i));
                    tlp0Var.m191695I(new y20() { // from class: l.hlp0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f110525a.m154780V((String) obj);
                        }
                    });
                    arrayList2.add(tlp0Var);
                }
            }
            this.f132587m.m68554Z(arrayList2);
            m154782Y(giftWallV3GiftWeekStarGiftMainDetail);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m154784b0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        new th0.C20312a(((clp0) this.f48605b).act()).m191151j(xau.m209912v(R$string.f48260nd, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankPrice), giftWallV3GiftWeekStarGiftMainDetail.gift.name, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.user.name)).m191158q(R$string.f47983b).m191156o(new View.OnClickListener() { // from class: l.klp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127403a.m154781W(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        }).m191146e(R$string.f47961a).m191142a().m191141g();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m154769N(view);
        m154775r();
    }
}
