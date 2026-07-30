package p153l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class fzh extends AbstractC16723e7 {

    /* JADX INFO: renamed from: c */
    public int f101482c;

    public fzh(t4i t4iVar) {
        super(t4iVar);
        this.f101482c = -1;
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: a */
    public void mo128174a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, final FeedVDraweeView feedVDraweeView) {
        BubbleInfo bubbleInfoM189272b = this.f92380a.m189272b();
        final User userM189276f = this.f92380a.m189276f(i);
        feedVDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.dzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91358a.m128182n(feedVDraweeView, userM189276f, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ezh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96594a.m128183o(feedVDraweeView, userM189276f, view);
            }
        });
        if (this.f101482c != i) {
            i4g0.m138492A("e_other_state_avartar", "p_other_state", jyb.m147494Y("state_id", bubbleInfoM189272b.f39578id), jyb.m147494Y("owner_id", bubbleInfoM189272b.owner.f39651id));
            this.f101482c = i;
        }
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: b */
    public void mo128175b(FeedStateCardView feedStateCardView) {
        feedStateCardView.m66700T();
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: c */
    public void mo128176c(VNavigationBar vNavigationBar) {
        vNavigationBar.setTitle(FeedModule.f39700a.getString(R$string.f39896e2));
        vNavigationBar.setRightIconViews(m128179k(vNavigationBar));
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: d */
    public void mo128177d(LinearLayout linearLayout) {
        linearLayout.addView(m128178j());
    }

    /* JADX INFO: renamed from: j */
    public final View m128178j() {
        TextView textView = new TextView(this.f92380a.m189271a());
        textView.setHint("发消息");
        textView.setHintTextColor(this.f92380a.m189271a().getResources().getColor(k9c0.f124534x));
        textView.setGravity(16);
        textView.setPadding(qa00.m175859d(16.0f), 0, 0, 0);
        textView.setBackgroundResource(lbc0.f131146t3);
        textView.getPaint().setFakeBoldText(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(295.0f), qa00.m175859d(56.0f));
        layoutParams.gravity = 1;
        layoutParams.topMargin = qa00.m175859d(30.0f);
        layoutParams.bottomMargin = qa00.m175859d(10.0f);
        textView.setLayoutParams(layoutParams);
        m128186r();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.czh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84473a.m128180l(view);
            }
        });
        return textView;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public TextView m128179k(VNavigationBar vNavigationBar) {
        TextView textView = new TextView(vNavigationBar.getContext());
        textView.setText(FeedModule.f39700a.getString(R$string.f39903f2));
        textView.setTextSize(14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(lyh0.m156283c(3), 1);
        textView.setPadding(qa00.m175859d(14.0f), qa00.m175859d(10.0f), qa00.m175859d(14.0f), qa00.m175859d(10.0f));
        textView.setBackgroundResource(lbc0.f131124q5);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.bzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79134a.m128181m(view);
            }
        });
        if (!cmg.m111177E()) {
            m128188t();
        }
        return textView;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m128180l(View view) {
        m128189u();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m128181m(View view) {
        BubbleInfo bubbleInfoM145534I7 = FeedModule.f39703d.m145534I7();
        if (bubbleInfoM145534I7 == null) {
            h3i.m133488f(this.f92380a.m189271a(), "p_other_state");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfoM145534I7);
            this.f92380a.m189271a().startActivity(FeedStatusPageAct.m66746r2(this.f92380a.m189271a(), arrayList, 0, "", "p_other_state"));
        }
        m128184p();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m128182n(FeedVDraweeView feedVDraweeView, User user, View view) {
        m128187s((Act) feedVDraweeView.getContext(), user, this.f92380a.m189272b());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m128183o(FeedVDraweeView feedVDraweeView, User user, View view) {
        m128187s((Act) feedVDraweeView.getContext(), user, this.f92380a.m189272b());
    }

    /* JADX INFO: renamed from: p */
    public final void m128184p() {
        if (this.f92380a.m189275e().isEmpty()) {
            return;
        }
        BubbleInfo bubbleInfoM189272b = this.f92380a.m189272b();
        i4g0.m138523u("e_set_my_state", "p_other_state", jyb.m147494Y("source_page", "p_other_state"), jyb.m147494Y("state_id", bubbleInfoM189272b.f39578id), jyb.m147494Y("owner_id", bubbleInfoM189272b.owner.f39651id));
    }

    /* JADX INFO: renamed from: q */
    public final void m128185q() {
        BubbleInfo bubbleInfoM189272b = this.f92380a.m189272b();
        i4g0.m138523u("e_send_message", "p_other_state", jyb.m147494Y("state_id", bubbleInfoM189272b.f39578id), jyb.m147494Y("owner_id", bubbleInfoM189272b.owner.f39651id));
    }

    /* JADX INFO: renamed from: r */
    public final void m128186r() {
        BubbleInfo bubbleInfoM189272b = this.f92380a.m189272b();
        i4g0.m138492A("e_send_message", "p_other_state", jyb.m147494Y("state_id", bubbleInfoM189272b.f39578id), jyb.m147494Y("owner_id", bubbleInfoM189272b.owner.f39651id));
    }

    /* JADX INFO: renamed from: s */
    public void m128187s(Act act, User user, BubbleInfo bubbleInfo) {
        if (FeedModule.m61406H().mo31744Zj(bubbleInfo.owner.f39651id) == null) {
            o1j0.m165636j("对方账号异常");
        } else {
            act.startActivity(orb0.m168886c(act, user.f56859id, false, false));
            i4g0.m138523u("e_other_state_avartar", "p_other_state", jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m128188t() {
        i4g0.m138492A("e_set_my_state", "p_other_state", pf60.m172085a("source_page", "p_other_state"), pf60.m172085a("state_id", ""), pf60.m172085a("owner_id", ""));
    }

    /* JADX INFO: renamed from: u */
    public final void m128189u() {
        this.f92380a.m189271a().startActivity(FeedModule.m61406H().mo31787k9(this.f92380a.m189271a(), this.f92380a.m189272b().f39578id, this.f92380a.m189272b().owner.f39651id, "from_state"));
        this.f92380a.m189271a().overridePendingTransition(a8c0.f68909i, 0);
        m128185q();
    }
}
