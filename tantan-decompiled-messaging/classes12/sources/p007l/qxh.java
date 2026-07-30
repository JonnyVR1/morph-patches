package p007l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.eqh0;
import l.j760;
import l.lsi0;
import l.t100;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qxh extends AbstractC2399j7 {

    /* JADX INFO: renamed from: c */
    public int f12414c;

    public qxh(e3i e3iVar) {
        super(e3iVar);
        this.f12414c = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.t1i
    /* JADX INFO: renamed from: a */
    public void mo11131a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, final FeedVDraweeView feedVDraweeView) {
        BubbleInfo bubbleInfoM9604b = this.f9242a.m9604b();
        final User userM9608f = this.f9242a.m9608f(i);
        feedVDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.oxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11640a.m13747n(feedVDraweeView, userM9608f, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.pxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12006a.m13748o(feedVDraweeView, userM9608f, view);
            }
        });
        if (this.f12414c != i) {
            zvf0.A("e_other_state_avartar", "p_other_state", new j760[]{vwb.Y("state_id", bubbleInfoM9604b.f191id), vwb.Y("owner_id", bubbleInfoM9604b.owner.f264id)});
            this.f12414c = i;
        }
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: b */
    public void mo11132b(FeedStateCardView feedStateCardView) {
        feedStateCardView.m6644T();
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: c */
    public void mo11133c(VNavigationBar vNavigationBar) {
        vNavigationBar.setTitle(FeedModule.f313a.getString(R$string.f509e2));
        vNavigationBar.setRightIconViews(new View[]{m13744k(vNavigationBar)});
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: d */
    public void mo11134d(LinearLayout linearLayout) {
        linearLayout.addView(m13743j());
    }

    /* JADX INFO: renamed from: j */
    public final View m13743j() {
        TextView textView = new TextView(this.f9242a.m9603a());
        textView.setHint("发消息");
        textView.setHintTextColor(this.f9242a.m9603a().getResources().getColor(e1c0.f7167x));
        textView.setGravity(16);
        textView.setPadding(t100.d(16.0f), 0, 0, 0);
        textView.setBackgroundResource(f3c0.f7911t3);
        textView.getPaint().setFakeBoldText(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(295.0f), t100.d(56.0f));
        layoutParams.gravity = 1;
        layoutParams.topMargin = t100.d(30.0f);
        layoutParams.bottomMargin = t100.d(10.0f);
        textView.setLayoutParams(layoutParams);
        m13751r();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.nxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10931a.m13745l(view);
            }
        });
        return textView;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public TextView m13744k(VNavigationBar vNavigationBar) {
        TextView textView = new TextView(vNavigationBar.getContext());
        textView.setText(FeedModule.f313a.getString(R$string.f516f2));
        textView.setTextSize(14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(eqh0.c(3), 1);
        textView.setPadding(t100.d(14.0f), t100.d(10.0f), t100.d(14.0f), t100.d(10.0f));
        textView.setBackgroundResource(f3c0.f7889q5);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.mxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10598a.m13746m(view);
            }
        });
        if (!nkg.m12207E()) {
            m13753t();
        }
        return textView;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m13745l(View view) {
        m13754u();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m13746m(View view) {
        BubbleInfo bubbleInfoM16474I7 = FeedModule.f316d.m16474I7();
        if (bubbleInfoM16474I7 == null) {
            s1i.m13982f(this.f9242a.m9603a(), "p_other_state");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfoM16474I7);
            this.f9242a.m9603a().startActivity(FeedStatusPageAct.m6688q2(this.f9242a.m9603a(), arrayList, 0, "", "p_other_state"));
        }
        m13749p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m13747n(FeedVDraweeView feedVDraweeView, User user, View view) {
        m13752s((Act) feedVDraweeView.getContext(), user, this.f9242a.m9604b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m13748o(FeedVDraweeView feedVDraweeView, User user, View view) {
        m13752s((Act) feedVDraweeView.getContext(), user, this.f9242a.m9604b());
    }

    /* JADX INFO: renamed from: p */
    public final void m13749p() {
        if (this.f9242a.m9607e().isEmpty()) {
            return;
        }
        BubbleInfo bubbleInfoM9604b = this.f9242a.m9604b();
        zvf0.u("e_set_my_state", "p_other_state", new j760[]{vwb.Y("source_page", "p_other_state"), vwb.Y("state_id", bubbleInfoM9604b.f191id), vwb.Y("owner_id", bubbleInfoM9604b.owner.f264id)});
    }

    /* JADX INFO: renamed from: q */
    public final void m13750q() {
        BubbleInfo bubbleInfoM9604b = this.f9242a.m9604b();
        zvf0.u("e_send_message", "p_other_state", new j760[]{vwb.Y("state_id", bubbleInfoM9604b.f191id), vwb.Y("owner_id", bubbleInfoM9604b.owner.f264id)});
    }

    /* JADX INFO: renamed from: r */
    public final void m13751r() {
        BubbleInfo bubbleInfoM9604b = this.f9242a.m9604b();
        zvf0.A("e_send_message", "p_other_state", new j760[]{vwb.Y("state_id", bubbleInfoM9604b.f191id), vwb.Y("owner_id", bubbleInfoM9604b.owner.f264id)});
    }

    /* JADX INFO: renamed from: s */
    public void m13752s(Act act, User user, BubbleInfo bubbleInfo) {
        if (FeedModule.m1140H().Zj(bubbleInfo.owner.f264id) == null) {
            lsi0.j("对方账号异常");
        } else {
            act.startActivity(kjb0.m11451c(act, ((DbObject) user).id, false, false));
            zvf0.u("e_other_state_avartar", "p_other_state", new j760[]{vwb.Y("state_id", bubbleInfo.f191id), vwb.Y("owner_id", bubbleInfo.owner.f264id)});
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m13753t() {
        zvf0.A("e_set_my_state", "p_other_state", new j760[]{j760.a("source_page", "p_other_state"), j760.a("state_id", ""), j760.a("owner_id", "")});
    }

    /* JADX INFO: renamed from: u */
    public final void m13754u() {
        this.f9242a.m9603a().startActivity(FeedModule.m1140H().k9(this.f9242a.m9603a(), this.f9242a.m9604b().f191id, this.f9242a.m9604b().owner.f264id, "from_state"));
        this.f9242a.m9603a().overridePendingTransition(uzb0.f13995i, 0);
        m13750q();
    }
}
