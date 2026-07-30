package p009l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarHallTop3ItemView;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.e30;
import l.g5c0;
import l.hxs;
import l.j2g0;
import l.t6c0;
import l.u4n0;
import l.vwb;
import l.w8u;
import l.x6s;
import l.xdl0;
import v.VDraweeView;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ocp0 extends LiveMenuDialogHolder<tcp0> {

    /* JADX INFO: renamed from: A */
    public static String f17902A = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjUzMzE5MjMzN0FFQjRCMEZBOTVCRDEyMzhGRDI5NDc5IiwidyI6Mzk5LCJoIjo2MTUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDE1ODU4MjMwNzYzODUsInB0IjoyMDI1MDkxNTE2fQ.webp";

    /* JADX INFO: renamed from: B */
    public static String f17903B = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjIwQThFRUE2RURGNTRBQTFBMDc0Q0UyMDhEQjZFNTE3IiwidyI6MzAzLCJoIjo1MTksImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzA1ODQzMDA5MjEzODI1MDI1LCJwdCI6MjAyNTA5MTUxOX0.webp";

    /* JADX INFO: renamed from: C */
    public static String f17904C = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjU1MEY4Q0M3NzkwMTQ5RjJBMUExODYzMzY5MEZGM0IzIiwidyI6MzAzLCJoIjo1MTksImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDA0OTI1NzIwOTcyOTEyMjE3NSwicHQiOjIwMjUwOTE1MTl9.webp";

    /* JADX INFO: renamed from: z */
    public static String f17905z = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjM3REEwRENBREEwOTQxNTc5N0U4MTg0ODc0NThEQjE2IiwidyI6MTEyNSwiaCI6ODIyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4NTA4NjAzNzQwMTYwMzg1NSwicHQiOjIwMjUwOTE1MTV9.webp";

    /* JADX INFO: renamed from: k */
    public VDraweeView f17906k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f17907l;

    /* JADX INFO: renamed from: m */
    public LiveBaseAdapter f17908m;

    /* JADX INFO: renamed from: n */
    public View f17909n;

    /* JADX INFO: renamed from: o */
    public VoiceWeekStarHallTop3ItemView f17910o;

    /* JADX INFO: renamed from: p */
    public VoiceWeekStarHallTop3ItemView f17911p;

    /* JADX INFO: renamed from: q */
    public VoiceWeekStarHallTop3ItemView f17912q;

    /* JADX INFO: renamed from: r */
    public List<VoiceWeekStarHallTop3ItemView> f17913r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f17914s;

    /* JADX INFO: renamed from: t */
    public VText f17915t;

    /* JADX INFO: renamed from: u */
    public VText f17916u;

    /* JADX INFO: renamed from: v */
    public VText f17917v;

    /* JADX INFO: renamed from: w */
    public VText f17918w;

    /* JADX INFO: renamed from: x */
    public cwf0 f17919x;

    /* JADX INFO: renamed from: y */
    public TextView f17920y;

    public ocp0(tcp0 tcp0Var) {
        super(t6c0.pb, tcp0Var.act(), tcp0Var, j2g0.e(true));
    }

    /* JADX INFO: renamed from: K */
    private void m19670K(View view) {
        this.f17920y = (TextView) view.findViewById(g5c0.N6);
        this.f17906k = view.findViewById(g5c0.I);
        this.f17907l = view.findViewById(g5c0.t3);
        this.f17909n = view.findViewById(g5c0.A);
        this.f17910o = (VoiceWeekStarHallTop3ItemView) view.findViewById(g5c0.T6);
        this.f17911p = (VoiceWeekStarHallTop3ItemView) view.findViewById(g5c0.U6);
        VoiceWeekStarHallTop3ItemView voiceWeekStarHallTop3ItemView = (VoiceWeekStarHallTop3ItemView) view.findViewById(g5c0.V6);
        this.f17912q = voiceWeekStarHallTop3ItemView;
        this.f17913r = vwb.f0(new VoiceWeekStarHallTop3ItemView[]{this.f17910o, this.f17911p, voiceWeekStarHallTop3ItemView});
        this.f17914s = view.findViewById(g5c0.j);
        this.f17918w = view.findViewById(g5c0.m);
        this.f17915t = view.findViewById(g5c0.k);
        this.f17916u = view.findViewById(g5c0.l);
        this.f17917v = view.findViewById(g5c0.n);
    }

    /* JADX INFO: renamed from: L */
    private String m19671L(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m19672M(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m19673N(DialogInterface dialogInterface) {
        cwf0 cwf0VarM16062c = i0e.m16062c("p_intl_gift_collcetion_weekly_star_hall", ocp0.class.getName());
        this.f17919x = cwf0VarM16062c;
        i0e.m16065f(cwf0VarM16062c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m19674O(DialogInterface dialogInterface) {
        i0e.m16064e(this.f17919x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m19675Q(String str) {
        ((tcp0) ((LiveMenuDialogHolder) this).b).F2().OpenUserCardDialogEvent.dismiss().p();
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        u4n0.k(x6sVar, ((tcp0) x6sVar).E2().j0(), str);
    }

    /* JADX INFO: renamed from: r */
    private void m19676r() {
        hxs.y(this.f17906k, f17905z);
        this.f17910o.m8907i0(1, f17902A);
        this.f17911p.m8907i0(2, f17903B);
        this.f17912q.m8907i0(3, f17904C);
        xdl0.E0(this.f17909n, new View.OnClickListener() { // from class: l.jcp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15056a.m19672M(view);
            }
        });
        this.f17907l.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f17908m = liveBaseAdapter;
        this.f17907l.setAdapter(liveBaseAdapter);
        ((LiveMenuDialogHolder) this).c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.kcp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f15606a.m19673N(dialogInterface);
            }
        });
        ((LiveMenuDialogHolder) this).c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lcp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f16083a.m19674O(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m19677P(WeekStarLeaderboard weekStarLeaderboard, View view) {
        ((tcp0) ((LiveMenuDialogHolder) this).b).F2().OpenUserCardDialogEvent.dismiss().p();
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        u4n0.k(x6sVar, ((tcp0) x6sVar).E2().j0(), weekStarLeaderboard.user.f7360id);
    }

    /* JADX INFO: renamed from: R */
    public final void m19678R(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarHallMainDetail.myLeaderboard;
        hxs.y(this.f17914s, weekStarLeaderboard.user.avatar);
        this.f17915t.setText(weekStarLeaderboard.user.name);
        String strM24752j = x8u.m24752j(weekStarLeaderboard.score);
        this.f17916u.setText(w8u.u(R.string.Mj, strM24752j));
        w8u.E(this.f17916u, Color.parseColor("#FE7E1D"), this.f17916u.getText().toString(), strM24752j);
        int i = weekStarLeaderboard.rank;
        VText vText = this.f17918w;
        if (i <= 0) {
            vText.setText("-");
        } else {
            vText.setText(m19671L(i));
        }
        int i2 = weekStarLeaderboard.rank;
        VText vText2 = this.f17917v;
        if (i2 == 1) {
            vText2.setText(R.string.Nj);
        } else {
            vText2.setText(w8u.u(R.string.Oj, x8u.m24752j(weekStarLeaderboard.gapScore)));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m19679S(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        this.f17920y.setText(giftWallV3GiftWeekStarHallMainDetail.title);
        List arrayList = giftWallV3GiftWeekStarHallMainDetail.leaderboards;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards == null) {
            giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards = new ArrayList();
        }
        for (int i = 0; i < this.f17913r.size(); i++) {
            VoiceWeekStarHallTop3ItemView voiceWeekStarHallTop3ItemView = this.f17913r.get(i);
            if (i < giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards.size()) {
                final WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards.get(i);
                voiceWeekStarHallTop3ItemView.m8906h0(weekStarLeaderboard);
                xdl0.E0(voiceWeekStarHallTop3ItemView.f7401f, new View.OnClickListener() { // from class: l.mcp0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f16808a.m19677P(weekStarLeaderboard, view);
                    }
                });
            } else {
                voiceWeekStarHallTop3ItemView.m8908j0();
                xdl0.E0(voiceWeekStarHallTop3ItemView.f7401f, (View.OnClickListener) null);
            }
        }
        boolean zJ = vwb.J(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new xcp0(giftWallV3GiftWeekStarHallMainDetail.bubbleText));
        if (zJ) {
            arrayList2.add(new icp0());
        } else {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                pcp0 pcp0Var = new pcp0((WeekStarLeaderboard) arrayList.get(i2));
                pcp0Var.m20147I(new e30() { // from class: l.ncp0
                    public final void call(Object obj) {
                        this.f17410a.m19675Q((String) obj);
                    }
                });
                pcp0Var.m20148J(true);
                arrayList2.add(pcp0Var);
            }
        }
        this.f17908m.Z(arrayList2);
        m19678R(giftWallV3GiftWeekStarHallMainDetail);
    }

    /* JADX INFO: renamed from: m */
    public void m19680m(View view) {
        super.m(view);
        m19670K(view);
        m19676r();
    }
}
