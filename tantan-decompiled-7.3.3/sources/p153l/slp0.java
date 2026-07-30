package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceWeekStarHallTop3ItemView;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class slp0 extends LiveMenuDialogHolder<xlp0> {

    /* JADX INFO: renamed from: A */
    public static String f169428A = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjUzMzE5MjMzN0FFQjRCMEZBOTVCRDEyMzhGRDI5NDc5IiwidyI6Mzk5LCJoIjo2MTUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDE1ODU4MjMwNzYzODUsInB0IjoyMDI1MDkxNTE2fQ.webp";

    /* JADX INFO: renamed from: B */
    public static String f169429B = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjIwQThFRUE2RURGNTRBQTFBMDc0Q0UyMDhEQjZFNTE3IiwidyI6MzAzLCJoIjo1MTksImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzA1ODQzMDA5MjEzODI1MDI1LCJwdCI6MjAyNTA5MTUxOX0.webp";

    /* JADX INFO: renamed from: C */
    public static String f169430C = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjU1MEY4Q0M3NzkwMTQ5RjJBMUExODYzMzY5MEZGM0IzIiwidyI6MzAzLCJoIjo1MTksImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDA0OTI1NzIwOTcyOTEyMjE3NSwicHQiOjIwMjUwOTE1MTl9.webp";

    /* JADX INFO: renamed from: z */
    public static String f169431z = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjM3REEwRENBREEwOTQxNTc5N0U4MTg0ODc0NThEQjE2IiwidyI6MTEyNSwiaCI6ODIyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4NTA4NjAzNzQwMTYwMzg1NSwicHQiOjIwMjUwOTE1MTV9.webp";

    /* JADX INFO: renamed from: k */
    public VDraweeView f169432k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f169433l;

    /* JADX INFO: renamed from: m */
    public LiveBaseAdapter f169434m;

    /* JADX INFO: renamed from: n */
    public View f169435n;

    /* JADX INFO: renamed from: o */
    public VoiceWeekStarHallTop3ItemView f169436o;

    /* JADX INFO: renamed from: p */
    public VoiceWeekStarHallTop3ItemView f169437p;

    /* JADX INFO: renamed from: q */
    public VoiceWeekStarHallTop3ItemView f169438q;

    /* JADX INFO: renamed from: r */
    public List<VoiceWeekStarHallTop3ItemView> f169439r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f169440s;

    /* JADX INFO: renamed from: t */
    public VText f169441t;

    /* JADX INFO: renamed from: u */
    public VText f169442u;

    /* JADX INFO: renamed from: v */
    public VText f169443v;

    /* JADX INFO: renamed from: w */
    public VText f169444w;

    /* JADX INFO: renamed from: x */
    public l4g0 f169445x;

    /* JADX INFO: renamed from: y */
    public TextView f169446y;

    public slp0(xlp0 xlp0Var) {
        super(yec0.f199210pb, xlp0Var.act(), xlp0Var, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: K */
    private void m186636K(View view) {
        this.f169446y = (TextView) view.findViewById(mdc0.f136007N6);
        this.f169432k = (VDraweeView) view.findViewById(mdc0.f135955I);
        this.f169433l = (VRecyclerView) view.findViewById(mdc0.f136303t3);
        this.f169435n = view.findViewById(mdc0.f135883A);
        this.f169436o = (VoiceWeekStarHallTop3ItemView) view.findViewById(mdc0.f136061T6);
        this.f169437p = (VoiceWeekStarHallTop3ItemView) view.findViewById(mdc0.f136070U6);
        VoiceWeekStarHallTop3ItemView voiceWeekStarHallTop3ItemView = (VoiceWeekStarHallTop3ItemView) view.findViewById(mdc0.f136079V6);
        this.f169438q = voiceWeekStarHallTop3ItemView;
        this.f169439r = jyb.m147507f0(this.f169436o, this.f169437p, voiceWeekStarHallTop3ItemView);
        this.f169440s = (VDraweeView) view.findViewById(mdc0.f136207j);
        this.f169444w = (VText) view.findViewById(mdc0.f136236m);
        this.f169441t = (VText) view.findViewById(mdc0.f136217k);
        this.f169442u = (VText) view.findViewById(mdc0.f136227l);
        this.f169443v = (VText) view.findViewById(mdc0.f136245n);
    }

    /* JADX INFO: renamed from: L */
    private String m186637L(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m186638M(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m186639N(DialogInterface dialogInterface) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_gift_collcetion_weekly_star_hall", slp0.class.getName());
        this.f169445x = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m186640O(DialogInterface dialogInterface) {
        w1e.m204401e(this.f169445x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m186641Q(String str) {
        ((xlp0) this.f48605b).m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        T t = this.f48605b;
        ydn0.m215258k(t, ((rwn0) ((xlp0) t).m213810E2()).m168526j0(), str);
    }

    /* JADX INFO: renamed from: r */
    private void m186642r() {
        izs.m142874y(this.f169432k, f169431z);
        this.f169436o.m79874i0(1, f169428A);
        this.f169437p.m79874i0(2, f169429B);
        this.f169438q.m79874i0(3, f169430C);
        bnl0.m105509E0(this.f169435n, new View.OnClickListener() { // from class: l.nlp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142578a.m186638M(view);
            }
        });
        this.f169433l.setLayoutManager(new LinearLayoutManager(getAct(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f169434m = liveBaseAdapter;
        this.f169433l.setAdapter(liveBaseAdapter);
        this.f48606c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.olp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f147860a.m186639N(dialogInterface);
            }
        });
        this.f48606c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.plp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f153055a.m186640O(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m186643P(WeekStarLeaderboard weekStarLeaderboard, View view) {
        ((xlp0) this.f48605b).m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        T t = this.f48605b;
        ydn0.m215258k(t, ((rwn0) ((xlp0) t).m213810E2()).m168526j0(), weekStarLeaderboard.user.f54602id);
    }

    /* JADX INFO: renamed from: R */
    public final void m186644R(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarHallMainDetail.myLeaderboard;
        izs.m142874y(this.f169440s, weekStarLeaderboard.user.avatar);
        this.f169441t.setText(weekStarLeaderboard.user.name);
        String strM214942j = yau.m214942j(weekStarLeaderboard.score);
        this.f169442u.setText(xau.m209911u(R$string.f47687Mj, strM214942j));
        xau.m209900E(this.f169442u, Color.parseColor("#FE7E1D"), this.f169442u.getText().toString(), strM214942j);
        int i = weekStarLeaderboard.rank;
        VText vText = this.f169444w;
        if (i <= 0) {
            vText.setText("-");
        } else {
            vText.setText(m186637L(i));
        }
        int i2 = weekStarLeaderboard.rank;
        VText vText2 = this.f169443v;
        if (i2 == 1) {
            vText2.setText(R$string.f47708Nj);
        } else {
            vText2.setText(xau.m209911u(R$string.f47729Oj, yau.m214942j(weekStarLeaderboard.gapScore)));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m186645S(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        this.f169446y.setText(giftWallV3GiftWeekStarHallMainDetail.title);
        List arrayList = giftWallV3GiftWeekStarHallMainDetail.leaderboards;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards == null) {
            giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards = new ArrayList();
        }
        for (int i = 0; i < this.f169439r.size(); i++) {
            VoiceWeekStarHallTop3ItemView voiceWeekStarHallTop3ItemView = this.f169439r.get(i);
            if (i < giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards.size()) {
                final WeekStarLeaderboard weekStarLeaderboard = giftWallV3GiftWeekStarHallMainDetail.lastWeekLeaderboards.get(i);
                voiceWeekStarHallTop3ItemView.m79873h0(weekStarLeaderboard);
                bnl0.m105509E0(voiceWeekStarHallTop3ItemView.f54643f, new View.OnClickListener() { // from class: l.qlp0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f158258a.m186643P(weekStarLeaderboard, view);
                    }
                });
            } else {
                voiceWeekStarHallTop3ItemView.m79875j0();
                bnl0.m105509E0(voiceWeekStarHallTop3ItemView.f54643f, null);
            }
        }
        boolean zM147479J = jyb.m147479J(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new bmp0(giftWallV3GiftWeekStarHallMainDetail.bubbleText));
        if (zM147479J) {
            arrayList2.add(new mlp0());
        } else {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                tlp0 tlp0Var = new tlp0((WeekStarLeaderboard) arrayList.get(i2));
                tlp0Var.m191695I(new y20() { // from class: l.rlp0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f163778a.m186641Q((String) obj);
                    }
                });
                tlp0Var.m191696J(true);
                arrayList2.add(tlp0Var);
            }
        }
        this.f169434m.m68554Z(arrayList2);
        m186644R(giftWallV3GiftWeekStarHallMainDetail);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m186636K(view);
        m186642r();
    }
}
