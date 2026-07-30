package p149l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class qxh extends AbstractC17708j7 {

    /* JADX INFO: renamed from: c */
    public int f156843c;

    public qxh(e3i e3iVar) {
        super(e3iVar);
        this.f156843c = -1;
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: a */
    public void mo141118a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, final FeedVDraweeView feedVDraweeView) {
        BubbleInfo bubbleInfoM114592b = this.f116550a.m114592b();
        final User userM114596f = this.f116550a.m114596f(i);
        feedVDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.oxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146210a.m177003n(feedVDraweeView, userM114596f, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.pxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151681a.m177004o(feedVDraweeView, userM114596f, view);
            }
        });
        if (this.f156843c != i) {
            zvf0.m220368A("e_other_state_avartar", "p_other_state", vwb.m200311Y("state_id", bubbleInfoM114592b.f38730id), vwb.m200311Y("owner_id", bubbleInfoM114592b.owner.f38803id));
            this.f156843c = i;
        }
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: b */
    public void mo141119b(FeedStateCardView feedStateCardView) {
        feedStateCardView.m65517T();
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: c */
    public void mo141120c(VNavigationBar vNavigationBar) {
        vNavigationBar.setTitle(FeedModule.f38852a.getString(R$string.f39048e2));
        vNavigationBar.setRightIconViews(m177000k(vNavigationBar));
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: d */
    public void mo141121d(LinearLayout linearLayout) {
        linearLayout.addView(m176999j());
    }

    /* JADX INFO: renamed from: j */
    public final View m176999j() {
        TextView textView = new TextView(this.f116550a.m114591a());
        textView.setHint("发消息");
        textView.setHintTextColor(this.f116550a.m114591a().getResources().getColor(e1c0.f88811x));
        textView.setGravity(16);
        textView.setPadding(t100.m186890d(16.0f), 0, 0, 0);
        textView.setBackgroundResource(f3c0.f94628t3);
        textView.getPaint().setFakeBoldText(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(295.0f), t100.m186890d(56.0f));
        layoutParams.gravity = 1;
        layoutParams.topMargin = t100.m186890d(30.0f);
        layoutParams.bottomMargin = t100.m186890d(10.0f);
        textView.setLayoutParams(layoutParams);
        m177007r();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.nxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141024a.m177001l(view);
            }
        });
        return textView;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public TextView m177000k(VNavigationBar vNavigationBar) {
        TextView textView = new TextView(vNavigationBar.getContext());
        textView.setText(FeedModule.f38852a.getString(R$string.f39055f2));
        textView.setTextSize(14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(eqh0.m117752c(3), 1);
        textView.setPadding(t100.m186890d(14.0f), t100.m186890d(10.0f), t100.m186890d(14.0f), t100.m186890d(10.0f));
        textView.setBackgroundResource(f3c0.f94606q5);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.mxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136173a.m177002m(view);
            }
        });
        if (!nkg.m159848E()) {
            m177009t();
        }
        return textView;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m177001l(View view) {
        m177010u();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m177002m(View view) {
        BubbleInfo bubbleInfoM209293I7 = FeedModule.f38855d.m209293I7();
        if (bubbleInfoM209293I7 == null) {
            s1i.m181966f(this.f116550a.m114591a(), "p_other_state");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfoM209293I7);
            this.f116550a.m114591a().startActivity(FeedStatusPageAct.m65561q2(this.f116550a.m114591a(), arrayList, 0, "", "p_other_state"));
        }
        m177005p();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m177003n(FeedVDraweeView feedVDraweeView, User user, View view) {
        m177008s((Act) feedVDraweeView.getContext(), user, this.f116550a.m114592b());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m177004o(FeedVDraweeView feedVDraweeView, User user, View view) {
        m177008s((Act) feedVDraweeView.getContext(), user, this.f116550a.m114592b());
    }

    /* JADX INFO: renamed from: p */
    public final void m177005p() {
        if (this.f116550a.m114595e().isEmpty()) {
            return;
        }
        BubbleInfo bubbleInfoM114592b = this.f116550a.m114592b();
        zvf0.m220399u("e_set_my_state", "p_other_state", vwb.m200311Y("source_page", "p_other_state"), vwb.m200311Y("state_id", bubbleInfoM114592b.f38730id), vwb.m200311Y("owner_id", bubbleInfoM114592b.owner.f38803id));
    }

    /* JADX INFO: renamed from: q */
    public final void m177006q() {
        BubbleInfo bubbleInfoM114592b = this.f116550a.m114592b();
        zvf0.m220399u("e_send_message", "p_other_state", vwb.m200311Y("state_id", bubbleInfoM114592b.f38730id), vwb.m200311Y("owner_id", bubbleInfoM114592b.owner.f38803id));
    }

    /* JADX INFO: renamed from: r */
    public final void m177007r() {
        BubbleInfo bubbleInfoM114592b = this.f116550a.m114592b();
        zvf0.m220368A("e_send_message", "p_other_state", vwb.m200311Y("state_id", bubbleInfoM114592b.f38730id), vwb.m200311Y("owner_id", bubbleInfoM114592b.owner.f38803id));
    }

    /* JADX INFO: renamed from: s */
    public void m177008s(Act act, User user, BubbleInfo bubbleInfo) {
        if (FeedModule.m60222H().mo30741Zj(bubbleInfo.owner.f38803id) == null) {
            lsi0.m151580j("对方账号异常");
        } else {
            act.startActivity(kjb0.m146192c(act, user.f56011id, false, false));
            zvf0.m220399u("e_other_state_avartar", "p_other_state", vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m177009t() {
        zvf0.m220368A("e_set_my_state", "p_other_state", j760.m140076a("source_page", "p_other_state"), j760.m140076a("state_id", ""), j760.m140076a("owner_id", ""));
    }

    /* JADX INFO: renamed from: u */
    public final void m177010u() {
        this.f116550a.m114591a().startActivity(FeedModule.m60222H().mo30784k9(this.f116550a.m114591a(), this.f116550a.m114592b().f38730id, this.f116550a.m114592b().owner.f38803id, "from_state"));
        this.f116550a.m114591a().overridePendingTransition(uzb0.f178984i, 0);
        m177006q();
    }
}
