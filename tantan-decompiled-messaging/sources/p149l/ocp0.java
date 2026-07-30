package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarHallTop3ItemView;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ocp0 extends LiveMenuDialogHolder<tcp0> {

    /* JADX INFO: renamed from: A */
    public static String f143071A = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjUzMzE5MjMzN0FFQjRCMEZBOTVCRDEyMzhGRDI5NDc5IiwidyI6Mzk5LCJoIjo2MTUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDE1ODU4MjMwNzYzODUsInB0IjoyMDI1MDkxNTE2fQ.webp";

    /* JADX INFO: renamed from: B */
    public static String f143072B = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjIwQThFRUE2RURGNTRBQTFBMDc0Q0UyMDhEQjZFNTE3IiwidyI6MzAzLCJoIjo1MTksImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzA1ODQzMDA5MjEzODI1MDI1LCJwdCI6MjAyNTA5MTUxOX0.webp";

    /* JADX INFO: renamed from: C */
    public static String f143073C = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjU1MEY4Q0M3NzkwMTQ5RjJBMUExODYzMzY5MEZGM0IzIiwidyI6MzAzLCJoIjo1MTksImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDA0OTI1NzIwOTcyOTEyMjE3NSwicHQiOjIwMjUwOTE1MTl9.webp";

    /* JADX INFO: renamed from: z */
    public static String f143074z = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjM3REEwRENBREEwOTQxNTc5N0U4MTg0ODc0NThEQjE2IiwidyI6MTEyNSwiaCI6ODIyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4NTA4NjAzNzQwMTYwMzg1NSwicHQiOjIwMjUwOTE1MTV9.webp";

    /* JADX INFO: renamed from: k */
    public VDraweeView f143075k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f143076l;

    /* JADX INFO: renamed from: m */
    public LiveBaseAdapter f143077m;

    /* JADX INFO: renamed from: n */
    public View f143078n;

    /* JADX INFO: renamed from: o */
    public VoiceWeekStarHallTop3ItemView f143079o;

    /* JADX INFO: renamed from: p */
    public VoiceWeekStarHallTop3ItemView f143080p;

    /* JADX INFO: renamed from: q */
    public VoiceWeekStarHallTop3ItemView f143081q;

    /* JADX INFO: renamed from: r */
    public List<VoiceWeekStarHallTop3ItemView> f143082r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f143083s;

    /* JADX INFO: renamed from: t */
    public VText f143084t;

    /* JADX INFO: renamed from: u */
    public VText f143085u;

    /* JADX INFO: renamed from: v */
    public VText f143086v;

    /* JADX INFO: renamed from: w */
    public VText f143087w;

    /* JADX INFO: renamed from: x */
    public cwf0 f143088x;

    /* JADX INFO: renamed from: y */
    public TextView f143089y;

    public ocp0(tcp0 tcp0Var) {
        super(t6c0.f168478pb, tcp0Var.act(), tcp0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: K */
    private void m163545K(View view) {
        this.f143089y = (TextView) view.findViewById(g5c0.f100762N6);
        this.f143075k = (VDraweeView) view.findViewById(g5c0.f100710I);
        this.f143076l = (VRecyclerView) view.findViewById(g5c0.f101058t3);
        this.f143078n = view.findViewById(g5c0.f100638A);
        this.f143079o = (VoiceWeekStarHallTop3ItemView) view.findViewById(g5c0.f100816T6);
        this.f143080p = (VoiceWeekStarHallTop3ItemView) view.findViewById(g5c0.f100825U6);
        VoiceWeekStarHallTop3ItemView voiceWeekStarHallTop3ItemView = (VoiceWeekStarHallTop3ItemView) view.findViewById(g5c0.f100834V6);
        this.f143081q = voiceWeekStarHallTop3ItemView;
        this.f143082r = vwb.m200324f0(this.f143079o, this.f143080p, voiceWeekStarHallTop3ItemView);
        this.f143083s = (VDraweeView) view.findViewById(g5c0.f100962j);
        this.f143087w = (VText) view.findViewById(g5c0.f100991m);
        this.f143084t = (VText) view.findViewById(g5c0.f100972k);
        this.f143085u = (VText) view.findViewById(g5c0.f100982l);
        this.f143086v = (VText) view.findViewById(g5c0.f101000n);
    }

    /* JADX INFO: renamed from: L */
    private String m163546L(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m163547M(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m163548N(DialogInterface dialogInterface) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_gift_collcetion_weekly_star_hall", ocp0.class.getName());
        this.f143088x = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m163549O(DialogInterface dialogInterface) {
        i0e.m133796e(this.f143088x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m163550Q(String str) {
        ((tcp0) this.f47757b).m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        T t = this.f47757b;
        u4n0.m191752k(t, ((nnn0) ((tcp0) t).m206027E2()).m132140j0(), str);
    }

    /* JADX INFO: renamed from: r */
    private void m163551r() {
        hxs.m133412y(this.f143075k, f143074z);
        this.f143079o.m78691i0(1, f143071A);
        this.f143080p.m78691i0(2, f143072B);
        this.f143081q.m78691i0(3, f143073C);
        xdl0.m208329E0(this.f143078n, new View.OnClickListener() { // from class: l.jcp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117341a.m163547M(view);
            }
        });
        this.f143076l.setLayoutManager(new LinearLayoutManager(getAct(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f143077m = liveBaseAdapter;
        this.f143076l.setAdapter(liveBaseAdapter);
        this.f47758c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.kcp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f122504a.m163548N(dialogInterface);
            }
        });
        this.f47758c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lcp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f127440a.m163549O(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m163552P(WeekStarLeaderboard weekStarLeaderboard, View view) {
        ((tcp0) this.f47757b).m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        T t = this.f47757b;
        u4n0.m191752k(t, ((nnn0) ((tcp0) t).m206027E2()).m132140j0(), weekStarLeaderboard.user.f53754id);
    }

    /* JADX INFO: renamed from: R */
    public final void m163553R(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarHallMainDetail.myLeaderboard;
        hxs.m133412y(this.f143083s, weekStarLeaderboard.user.avatar);
        this.f143084t.setText(weekStarLeaderboard.user.name);
        String strM207440j = x8u.m207440j(weekStarLeaderboard.score);
        this.f143085u.setText(w8u.m202218u(R$string.f46839Mj, strM207440j));
        w8u.m202207E(this.f143085u, Color.parseColor("#FE7E1D"), this.f143085u.getText().toString(), strM207440j);
        int i = weekStarLeaderboard.rank;
        VText vText = this.f143087w;
        if (i <= 0) {
            vText.setText("-");
        } else {
            vText.setText(m163546L(i));
        }
        int i2 = weekStarLeaderboard.rank;
        VText vText2 = this.f143086v;
        if (i2 == 1) {
            vText2.setText(R$string.f46860Nj);
        } else {
            vText2.setText(w8u.m202218u(R$string.f46881Oj, x8u.m207440j(weekStarLeaderboard.gapScore)));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m163554S(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        this.f143089y.setText(giftWallV3GiftWeekStarHallMainDetail.title);
        List arrayList = giftWallV3GiftWeekStarHallMainDetail.leaderboards;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards == null) {
            giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards = new ArrayList();
        }
        for (int i = 0; i < this.f143082r.size(); i++) {
            VoiceWeekStarHallTop3ItemView voiceWeekStarHallTop3ItemView = this.f143082r.get(i);
            if (i < giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards.size()) {
                final WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards.get(i);
                voiceWeekStarHallTop3ItemView.m78690h0(weekStarLeaderboard);
                xdl0.m208329E0(voiceWeekStarHallTop3ItemView.f53795f, new View.OnClickListener() { // from class: l.mcp0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f133175a.m163552P(weekStarLeaderboard, view);
                    }
                });
            } else {
                voiceWeekStarHallTop3ItemView.m78692j0();
                xdl0.m208329E0(voiceWeekStarHallTop3ItemView.f53795f, null);
            }
        }
        boolean zM200296J = vwb.m200296J(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new xcp0(giftWallV3GiftWeekStarHallMainDetail.bubbleText));
        if (zM200296J) {
            arrayList2.add(new icp0());
        } else {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                pcp0 pcp0Var = new pcp0((WeekStarLeaderboard) arrayList.get(i2));
                pcp0Var.m168363I(new e30() { // from class: l.ncp0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f138220a.m163550Q((String) obj);
                    }
                });
                pcp0Var.m168364J(true);
                arrayList2.add(pcp0Var);
            }
        }
        this.f143077m.m67371Z(arrayList2);
        m163553R(giftWallV3GiftWeekStarHallMainDetail);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m163545K(view);
        m163551r();
    }
}
