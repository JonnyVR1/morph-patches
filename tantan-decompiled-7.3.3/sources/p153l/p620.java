package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.data.TaskAvatarDesc;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task.CommonTaskItemView;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import java.util.ArrayList;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class p620 implements v1b0<m620> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f150720a;

    /* JADX INFO: renamed from: b */
    public MeetItemEntryHeadViewMyTabStyle f150721b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f150722c;

    /* JADX INFO: renamed from: d */
    public MeetLikersItemView f150723d;

    /* JADX INFO: renamed from: e */
    public MeetNearbyItemView f150724e;

    /* JADX INFO: renamed from: f */
    public VFrame f150725f;

    /* JADX INFO: renamed from: g */
    public VImage f150726g;

    /* JADX INFO: renamed from: h */
    public VText f150727h;

    /* JADX INFO: renamed from: i */
    public Context f150728i;

    /* JADX INFO: renamed from: j */
    public m620 f150729j;

    /* JADX INFO: renamed from: k */
    public CommonTaskItemView f150730k;

    /* JADX INFO: renamed from: l */
    public String f150731l = "unknown";

    public p620(Context context) {
        this.f150728i = context;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f150728i;
    }

    /* JADX INFO: renamed from: c */
    public View m170712c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q620.m175540b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(m620 m620Var) {
        this.f150729j = m620Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m170714e() {
        bnl0.m105524M(this.f150723d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m170715f(View view) {
        this.f150729j.m157165G0().startActivity(TaskCenterAct.m44620Z1(getAct()));
        i4g0.m138520r("e_task_entrance", getAct().pageId());
    }

    /* JADX INFO: renamed from: i */
    public void m170716i(MeetFeedLikersItemData meetFeedLikersItemData, dzl dzlVar) {
        bnl0.m105524M(this.f150723d, meetFeedLikersItemData.likersTotalCount > 0);
        if (meetFeedLikersItemData.likersTotalCount > 0) {
            this.f150723d.m43863s(meetFeedLikersItemData, dzlVar, new x20() { // from class: l.o620
                @Override // p153l.x20
                public final void call() {
                    this.f145137a.m170714e();
                }
            });
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM170712c = m170712c(layoutInflater, viewGroup);
        CommonTaskItemView commonTaskItemView = (CommonTaskItemView) layoutInflater.inflate(kec0.f126111w1, (ViewGroup) this.f150722c, false);
        this.f150730k = commonTaskItemView;
        this.f150722c.addView(commonTaskItemView);
        mo44452r();
        return viewM170712c;
    }

    /* JADX INFO: renamed from: j */
    public void m170717j(MeetFeedNearbyItemData meetFeedNearbyItemData) {
        bnl0.m105524M(this.f150724e, !jyb.m147479J(meetFeedNearbyItemData.users));
        if (jyb.m147479J(meetFeedNearbyItemData.users)) {
            return;
        }
        this.f150724e.m43924x(meetFeedNearbyItemData, this.f150729j.m157165G0(), true);
    }

    /* JADX INFO: renamed from: k */
    public void m170718k(MyTabTask myTabTask) {
        bnl0.m105524M(this.f150720a, myTabTask != null);
        if (myTabTask != null) {
            this.f150721b.m43964b("接下来，你还可以");
            if (!TextUtils.equals(this.f150731l, myTabTask.type)) {
                i4g0.m138526x("e_task_entrance", getAct().pageId());
            }
            this.f150731l = myTabTask.type;
            bnl0.m105509E0(this.f150721b._more, new View.OnClickListener() { // from class: l.n620
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140422a.m170715f(view);
                }
            });
            this.f150730k.m44613k(null, myTabTask, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m170719l(boolean z) {
        bnl0.m105524M(this.f150725f, z);
    }

    /* JADX INFO: renamed from: m */
    public void m170720m() {
        this.f150721b.m43964b("接下来，你还可以");
        bnl0.m105524M(this.f150720a, true);
        this.f150730k.m44614l("上传更丰富的生活照", "获得价值68元的优先推荐，让你的配对迅速暴增", jyb.m147507f0(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted(), "res://" + this.f150728i.getPackageName() + "/" + dbc0.f86248If), this.f150728i.getDrawable(dbc0.f86536Rf), "立即上传", Color.parseColor("#FF6298"));
        this.f150730k.m44617o(null, true);
    }

    /* JADX INFO: renamed from: n */
    public void m170721n() {
        this.f150721b.m43964b("接下来，你还可以");
        bnl0.m105524M(this.f150720a, true);
        String str = "res://" + this.f150728i.getPackageName() + "/" + dbc0.f87284og;
        Drawable drawable = this.f150728i.getDrawable(dbc0.f86536Rf);
        String str2 = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted();
        this.f150730k.m44614l("添加你的游戏日常", "认识更多游戏搭子", jyb.m147507f0(str), drawable, "立即完善", Color.parseColor("#FE7E1D"));
        ArrayList arrayList = new ArrayList();
        TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
        taskAvatarDesc.avatars = jyb.m147507f0(str2, str2, str2, str2);
        taskAvatarDesc.text = "她们在寻找“王者荣耀”的搭子";
        arrayList.add(taskAvatarDesc);
        TaskAvatarDesc taskAvatarDesc2 = new TaskAvatarDesc();
        taskAvatarDesc2.avatars = jyb.m147507f0(str2, str2, str2, str2);
        taskAvatarDesc2.text = "她们在寻找“原神”的搭子";
        arrayList.add(taskAvatarDesc2);
        this.f150730k.m44616n(arrayList, true);
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: o */
    public boolean mo44445o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m170722p() {
        this.f150721b.m43964b("接下来，你还可以");
        bnl0.m105524M(this.f150720a, true);
        String str = "res://" + this.f150728i.getPackageName() + "/" + dbc0.f86312Kf;
        Drawable drawable = this.f150728i.getDrawable(dbc0.f86536Rf);
        String str2 = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted();
        this.f150730k.m44614l("测试你的 MBTI", "优先为你推荐最匹配的人格", jyb.m147507f0(str), drawable, "立即完善", Color.parseColor("#FE7E1D"));
        this.f150730k.m44618p(jyb.m147507f0(str2, str2, str2, str2), "她们已完成测试", true);
    }

    /* JADX INFO: renamed from: q */
    public void m170723q() {
        this.f150721b.m43964b("接下来，你还可以");
        bnl0.m105524M(this.f150720a, true);
        String str = "res://" + this.f150728i.getPackageName() + "/" + dbc0.f86760Yf;
        Drawable drawable = this.f150728i.getDrawable(dbc0.f86536Rf);
        String str2 = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted();
        this.f150730k.m44614l("4个人邀请你认证", "完成头像认证后，立即收到他们的喜欢", jyb.m147507f0(str), drawable, "立即认证", Color.parseColor("#3CB9F0"));
        this.f150730k.m44617o(jyb.m147507f0(str2, str2, str2, str2), true);
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: r */
    public void mo44452r() {
        this.f150723d.setMyTabStyle(true);
        this.f150724e.setMyTabStyle(true);
    }

    /* JADX INFO: renamed from: s */
    public void m170724s() {
        this.f150721b.m43964b("接下来，你还可以");
        bnl0.m105524M(this.f150720a, true);
        this.f150730k.m44614l("完成头像认证", "解锁6项权益，更快认识合适的人", jyb.m147507f0("res://" + this.f150728i.getPackageName() + "/" + dbc0.f86760Yf), this.f150728i.getDrawable(dbc0.f86536Rf), "立即认证", Color.parseColor("#3CB9F0"));
        this.f150730k.setSubAvatarWithIllustrate(jyb.m147507f0(jyb.m147494Y(Integer.valueOf(dbc0.f86956eg), "更多右滑"), jyb.m147494Y(Integer.valueOf(dbc0.f86825ag), "优先曝光"), jyb.m147494Y(Integer.valueOf(dbc0.f87022gg), "只看认证"), jyb.m147494Y(Integer.valueOf(dbc0.f86891cg), "点亮勋章")));
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: D1 */
    public void mo44371D1() {
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: x2 */
    public void mo44466x2() {
    }
}
