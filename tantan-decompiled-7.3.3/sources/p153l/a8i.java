package p153l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentVoiceLiveInfos;

/* JADX INFO: loaded from: classes13.dex */
public class a8i extends AbstractC16917f7 implements t6i {

    /* JADX INFO: renamed from: a */
    public dj70 f68922a;

    /* JADX INFO: renamed from: b */
    public lnh f68923b;

    public a8i(lol lolVar, dj70 dj70Var) {
        this.f68923b = (lnh) lolVar;
        this.f68922a = dj70Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m96453n(View view) {
    }

    /* JADX INFO: renamed from: t */
    private lnh m96456t() {
        return this.f68923b;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: b */
    public boolean mo96457b(dj70 dj70Var) {
        Moment moment = dj70Var.f88791a;
        return moment != null && moment.isVoiceLive;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: c */
    public void mo96458c(dj70 dj70Var) {
        this.f68922a = dj70Var;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: j */
    public void mo96462j() {
        m96456t().f132807j.setOnClickListener(new View.OnClickListener() { // from class: l.w7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a8i.m96453n(view);
            }
        });
    }

    @Override // p153l.AbstractC16917f7
    /* JADX INFO: renamed from: l */
    public void mo96463l(dj70 dj70Var) {
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        this.f68922a = dj70Var;
        Moment moment = dj70Var.f88791a;
        if (!moment.isVoiceLive || (momentVoiceLiveInfos = moment.momentVoiceLiveInfos) == null || momentVoiceLiveInfos.momentVoiceUser == null || "from_live_square_tab".equals(dj70Var.f88792b)) {
            return;
        }
        this.f68923b.f132812o.setVisibility(8);
        this.f68923b.f132819v.setVisibility(0);
        m96456t().f132816s.m65902c(Color.parseColor("#35d3ff"), Color.parseColor("#35d3ff"));
        uqb0.f180374G.m127102F(uqb0.f180374G.m98797n(dj70Var.f88791a.momentVoiceLiveInfos.momentVoiceUser.momentAvatar).m8661O(new q3d0(m96456t().f132816s.getAvatarSize(), m96456t().f132816s.getAvatarSize())).m8668a(), new y20() { // from class: l.x7i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192721a.m96469v((Bitmap) obj);
            }
        });
        this.f68923b.f132816s.setVisibility(0);
        this.f68923b.f132807j.setVisibility(0);
        this.f68923b.f132808k.setText("加入");
        this.f68923b.f132808k.setTextColor(-1);
        this.f68923b.f132808k.setTextSize(2, 12.0f);
        this.f68923b.f132807j.setBackgroundResource(lbc0.f131184y1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f68923b.f132808k.getLayoutParams();
        layoutParams.width = bnl0.m105587w(44.0f);
        layoutParams.height = bnl0.m105587w(28.0f);
        this.f68923b.f132808k.setPadding(0, 0, 0, 0);
        this.f68923b.f132808k.setGravity(17);
        this.f68923b.f132808k.setLayoutParams(layoutParams);
        this.f68923b.f132818u.setText(dj70Var.f88791a.momentVoiceLiveInfos.momentVoiceUser.momentName);
        if (!m96470w().momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor) {
            for (int i = 0; i < this.f68923b.f132817t.getChildCount(); i++) {
                this.f68923b.f132817t.getChildAt(i).setVisibility(8);
            }
        }
        this.f68923b.f132818u.setVisibility(0);
        this.f68923b.f132785K.setVisibility(0);
        this.f68923b.f132787M.setText(dj70Var.f88791a.momentVoiceLiveInfos.momentVoiceUser.momentDesc);
        this.f68923b.f132788N.setVisibility(8);
        this.f68923b.f132789O.setVisibility(8);
        this.f68923b.f132790P.setVisibility(8);
        this.f68923b.f132791Q.setVisibility(8);
        this.f68923b.f132781G.setVisibility(8);
        this.f68923b.f132784J.setVisibility(8);
        this.f68923b.f132786L.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f68923b.f132787M.getLayoutParams();
        layoutParams2.leftMargin = bnl0.m105587w(4.0f);
        this.f68923b.f132787M.setLayoutParams(layoutParams2);
        String str = dj70Var.f88791a.momentVoiceLiveInfos.momentVoiceUser.momentDescStatus;
        str.getClass();
        switch (str) {
            case "follow":
                this.f68923b.f132786L.setImageResource(lbc0.f130800A1);
                break;
            case "superLike":
                this.f68923b.f132786L.setImageResource(lbc0.f130824D1);
                break;
            case "like":
                this.f68923b.f132786L.setImageResource(lbc0.f130816C1);
                break;
            case "match":
                this.f68923b.f132786L.setImageResource(lbc0.f130808B1);
                break;
            default:
                this.f68923b.f132786L.setVisibility(8);
                layoutParams2.leftMargin = 0;
                this.f68923b.f132787M.setLayoutParams(layoutParams2);
                break;
        }
        if (m96467s()) {
            m96466r(this.f68923b.f132818u);
        }
        lnh lnhVar = this.f68923b;
        jyb.m147537z(jyb.m147507f0(lnhVar.f132810m, lnhVar.f132812o), new y20() { // from class: l.y7i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197782a.m96466r((View) obj);
            }
        });
        m96466r(this.f68923b.f132816s);
        m96466r(this.f68923b.f132808k);
    }

    /* JADX INFO: renamed from: q */
    public Act m96465q() {
        return this.f68922a.f88797g;
    }

    /* JADX INFO: renamed from: r */
    public void m96466r(final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.z7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f203246a.m96468u(view, view2);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final boolean m96467s() {
        return (!m96470w().isVoiceLive || m96470w().momentVoiceLiveInfos == null || m96470w().momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m96468u(View view, View view2) {
        String str;
        lnh lnhVar = this.f68923b;
        if (view == lnhVar.f132816s) {
            str = ReminderAction.photo;
        } else {
            str = view == lnhVar.f132808k ? "enter_room" : "content";
        }
        u6i.m194711d(this.f68922a, m96465q(), m96470w());
        Moment momentM96470w = m96470w();
        dj70 dj70Var = this.f68922a;
        dug.m118145k(momentM96470w, dj70Var.f88798h + 1, o7i.m166350u(dj70Var.f88792b), o7i.m166349t(this.f68922a.f88792b), str);
        Moment momentM96470w2 = m96470w();
        dj70 dj70Var2 = this.f68922a;
        dug.m118141g(momentM96470w2, dj70Var2.f88792b, dj70Var2.f88793c, null);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m96469v(Bitmap bitmap) {
        m96456t().f132816s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: w */
    public Moment m96470w() {
        return this.f68922a.f88791a;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: f */
    public void mo96460f() {
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: h */
    public void mo96461h() {
    }

    @Override // p153l.AbstractC16917f7, p153l.v7i
    /* JADX INFO: renamed from: d */
    public void mo96459d(dj70 dj70Var) {
    }

    @Override // p153l.AbstractC16917f7
    /* JADX INFO: renamed from: m */
    public void mo96464m(dj70 dj70Var) {
    }
}
