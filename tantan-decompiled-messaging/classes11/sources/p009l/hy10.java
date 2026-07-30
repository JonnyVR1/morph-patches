package p009l;

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
import com.p000p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task.CommonTaskItemView;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.TaskAvatarDesc;
import java.util.ArrayList;
import l.d30;
import l.f6c0;
import l.iy10;
import l.j760;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hy10 implements rta0<ey10> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f14287a;

    /* JADX INFO: renamed from: b */
    public MeetItemEntryHeadViewMyTabStyle f14288b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f14289c;

    /* JADX INFO: renamed from: d */
    public MeetLikersItemView f14290d;

    /* JADX INFO: renamed from: e */
    public MeetNearbyItemView f14291e;

    /* JADX INFO: renamed from: f */
    public VFrame f14292f;

    /* JADX INFO: renamed from: g */
    public VImage f14293g;

    /* JADX INFO: renamed from: h */
    public VText f14294h;

    /* JADX INFO: renamed from: i */
    public Context f14295i;

    /* JADX INFO: renamed from: j */
    public ey10 f14296j;

    /* JADX INFO: renamed from: k */
    public CommonTaskItemView f14297k;

    /* JADX INFO: renamed from: l */
    public String f14298l = "unknown";

    public hy10(Context context) {
        this.f14295i = context;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16013C0() {
        return this.f14295i;
    }

    /* JADX INFO: renamed from: c */
    public View m16015c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iy10.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m16020i1(ey10 ey10Var) {
        this.f14296j = ey10Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m16017e() {
        xdl0.M(this.f14290d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m16018f(View view) {
        this.f14296j.m14148G0().startActivity(TaskCenterAct.m7673Y1(act()));
        zvf0.r("e_task_entrance", act().pageId());
    }

    /* JADX INFO: renamed from: i */
    public void m16019i(MeetFeedLikersItemData meetFeedLikersItemData, lwl lwlVar) {
        xdl0.M(this.f14290d, meetFeedLikersItemData.likersTotalCount > 0);
        if (meetFeedLikersItemData.likersTotalCount > 0) {
            this.f14290d.m7026s(meetFeedLikersItemData, lwlVar, new d30() { // from class: l.gy10
                public final void call() {
                    this.f13809a.m16017e();
                }
            });
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM16015c = m16015c(layoutInflater, viewGroup);
        CommonTaskItemView commonTaskItemView = (CommonTaskItemView) layoutInflater.inflate(f6c0.w1, (ViewGroup) this.f14289c, false);
        this.f14297k = commonTaskItemView;
        this.f14289c.addView(commonTaskItemView);
        mo16029r();
        return viewM16015c;
    }

    /* JADX INFO: renamed from: j */
    public void m16021j(MeetFeedNearbyItemData meetFeedNearbyItemData) {
        xdl0.M(this.f14291e, !vwb.J(meetFeedNearbyItemData.users));
        if (vwb.J(meetFeedNearbyItemData.users)) {
            return;
        }
        this.f14291e.m7095x(meetFeedNearbyItemData, this.f14296j.m14148G0(), true);
    }

    /* JADX INFO: renamed from: k */
    public void m16022k(MyTabTask myTabTask) {
        xdl0.M(this.f14287a, myTabTask != null);
        if (myTabTask != null) {
            this.f14288b.m7148b("接下来，你还可以");
            if (!TextUtils.equals(this.f14298l, myTabTask.type)) {
                zvf0.x("e_task_entrance", act().pageId());
            }
            this.f14298l = myTabTask.type;
            xdl0.E0(this.f14288b._more, new View.OnClickListener() { // from class: l.fy10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13217a.m16018f(view);
                }
            });
            this.f14297k.m7666k(null, myTabTask, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m16023l(boolean z) {
        xdl0.M(this.f14292f, z);
    }

    /* JADX INFO: renamed from: m */
    public void m16024m() {
        this.f14288b.m7148b("接下来，你还可以");
        xdl0.M(this.f14287a, true);
        this.f14297k.m7667l("上传更丰富的生活照", "获得价值68元的优先推荐，让你的配对迅速暴增", vwb.f0(new String[]{CoreModule.c.e0.p9().fp().profileSmall().formatted(), "res://" + this.f14295i.getPackageName() + "/" + x2c0.Te}), this.f14295i.getDrawable(x2c0.cf), "立即上传", Color.parseColor("#FF6298"));
        this.f14297k.m7670o(null, true);
    }

    /* JADX INFO: renamed from: n */
    public void m16025n() {
        this.f14288b.m7148b("接下来，你还可以");
        xdl0.M(this.f14287a, true);
        String str = "res://" + this.f14295i.getPackageName() + "/" + x2c0.Af;
        Drawable drawable = this.f14295i.getDrawable(x2c0.cf);
        String str2 = CoreModule.c.e0.p9().fp().profileSmall().formatted();
        this.f14297k.m7667l("添加你的游戏日常", "认识更多游戏搭子", vwb.f0(new String[]{str}), drawable, "立即完善", Color.parseColor("#FE7E1D"));
        ArrayList arrayList = new ArrayList();
        TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
        taskAvatarDesc.avatars = vwb.f0(new String[]{str2, str2, str2, str2});
        taskAvatarDesc.text = "她们在寻找“王者荣耀”的搭子";
        arrayList.add(taskAvatarDesc);
        TaskAvatarDesc taskAvatarDesc2 = new TaskAvatarDesc();
        taskAvatarDesc2.avatars = vwb.f0(new String[]{str2, str2, str2, str2});
        taskAvatarDesc2.text = "她们在寻找“原神”的搭子";
        arrayList.add(taskAvatarDesc2);
        this.f14297k.m7669n(arrayList, true);
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: o */
    public boolean mo16026o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m16027p() {
        this.f14288b.m7148b("接下来，你还可以");
        xdl0.M(this.f14287a, true);
        String str = "res://" + this.f14295i.getPackageName() + "/" + x2c0.Ve;
        Drawable drawable = this.f14295i.getDrawable(x2c0.cf);
        String str2 = CoreModule.c.e0.p9().fp().profileSmall().formatted();
        this.f14297k.m7667l("测试你的 MBTI", "优先为你推荐最匹配的人格", vwb.f0(new String[]{str}), drawable, "立即完善", Color.parseColor("#FE7E1D"));
        this.f14297k.m7671p(vwb.f0(new String[]{str2, str2, str2, str2}), "她们已完成测试", true);
    }

    /* JADX INFO: renamed from: q */
    public void m16028q() {
        this.f14288b.m7148b("接下来，你还可以");
        xdl0.M(this.f14287a, true);
        String str = "res://" + this.f14295i.getPackageName() + "/" + x2c0.kf;
        Drawable drawable = this.f14295i.getDrawable(x2c0.cf);
        String str2 = CoreModule.c.e0.p9().fp().profileSmall().formatted();
        this.f14297k.m7667l("4个人邀请你认证", "完成头像认证后，立即收到他们的喜欢", vwb.f0(new String[]{str}), drawable, "立即认证", Color.parseColor("#3CB9F0"));
        this.f14297k.m7670o(vwb.f0(new String[]{str2, str2, str2, str2}), true);
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: r */
    public void mo16029r() {
        this.f14290d.setMyTabStyle(true);
        this.f14291e.setMyTabStyle(true);
    }

    /* JADX INFO: renamed from: s */
    public void m16030s() {
        this.f14288b.m7148b("接下来，你还可以");
        xdl0.M(this.f14287a, true);
        this.f14297k.m7667l("完成头像认证", "解锁6项权益，更快认识合适的人", vwb.f0(new String[]{"res://" + this.f14295i.getPackageName() + "/" + x2c0.kf}), this.f14295i.getDrawable(x2c0.cf), "立即认证", Color.parseColor("#3CB9F0"));
        this.f14297k.setSubAvatarWithIllustrate(vwb.f0(new j760[]{vwb.Y(Integer.valueOf(x2c0.qf), "更多右滑"), vwb.Y(Integer.valueOf(x2c0.mf), "优先曝光"), vwb.Y(Integer.valueOf(x2c0.sf), "只看认证"), vwb.Y(Integer.valueOf(x2c0.of), "点亮勋章")}));
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: D1 */
    public void mo16014D1() {
    }

    public void destroy() {
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: x2 */
    public void mo16031x2() {
    }
}
