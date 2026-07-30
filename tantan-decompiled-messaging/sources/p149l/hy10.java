package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.data.TaskAvatarDesc;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task.CommonTaskItemView;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import java.util.ArrayList;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class hy10 implements rta0<ey10> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f110012a;

    /* JADX INFO: renamed from: b */
    public MeetItemEntryHeadViewMyTabStyle f110013b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f110014c;

    /* JADX INFO: renamed from: d */
    public MeetLikersItemView f110015d;

    /* JADX INFO: renamed from: e */
    public MeetNearbyItemView f110016e;

    /* JADX INFO: renamed from: f */
    public VFrame f110017f;

    /* JADX INFO: renamed from: g */
    public VImage f110018g;

    /* JADX INFO: renamed from: h */
    public VText f110019h;

    /* JADX INFO: renamed from: i */
    public Context f110020i;

    /* JADX INFO: renamed from: j */
    public ey10 f110021j;

    /* JADX INFO: renamed from: k */
    public CommonTaskItemView f110022k;

    /* JADX INFO: renamed from: l */
    public String f110023l = "unknown";

    public hy10(Context context) {
        this.f110020i = context;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f110020i;
    }

    /* JADX INFO: renamed from: c */
    public View m133488c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iy10.m138927b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ey10 ey10Var) {
        this.f110021j = ey10Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m133490e() {
        xdl0.m208344M(this.f110015d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m133491f(View view) {
        this.f110021j.m118739G0().startActivity(TaskCenterAct.m43434Y1(getAct()));
        zvf0.m220396r("e_task_entrance", getAct().pageId());
    }

    /* JADX INFO: renamed from: i */
    public void m133492i(MeetFeedLikersItemData meetFeedLikersItemData, lwl lwlVar) {
        xdl0.m208344M(this.f110015d, meetFeedLikersItemData.likersTotalCount > 0);
        if (meetFeedLikersItemData.likersTotalCount > 0) {
            this.f110015d.m42852s(meetFeedLikersItemData, lwlVar, new d30() { // from class: l.gy10
                @Override // p149l.d30
                public final void call() {
                    this.f104961a.m133490e();
                }
            });
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM133488c = m133488c(layoutInflater, viewGroup);
        CommonTaskItemView commonTaskItemView = (CommonTaskItemView) layoutInflater.inflate(f6c0.f96057w1, (ViewGroup) this.f110014c, false);
        this.f110022k = commonTaskItemView;
        this.f110014c.addView(commonTaskItemView);
        mo133501r();
        return viewM133488c;
    }

    /* JADX INFO: renamed from: j */
    public void m133493j(MeetFeedNearbyItemData meetFeedNearbyItemData) {
        xdl0.m208344M(this.f110016e, !vwb.m200296J(meetFeedNearbyItemData.users));
        if (vwb.m200296J(meetFeedNearbyItemData.users)) {
            return;
        }
        this.f110016e.m42913x(meetFeedNearbyItemData, this.f110021j.m118739G0(), true);
    }

    /* JADX INFO: renamed from: k */
    public void m133494k(MyTabTask myTabTask) {
        xdl0.m208344M(this.f110012a, myTabTask != null);
        if (myTabTask != null) {
            this.f110013b.m42953b("接下来，你还可以");
            if (!TextUtils.equals(this.f110023l, myTabTask.type)) {
                zvf0.m220402x("e_task_entrance", getAct().pageId());
            }
            this.f110023l = myTabTask.type;
            xdl0.m208329E0(this.f110013b._more, new View.OnClickListener() { // from class: l.fy10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99824a.m133491f(view);
                }
            });
            this.f110022k.m43427k(null, myTabTask, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m133495l(boolean z) {
        xdl0.m208344M(this.f110017f, z);
    }

    /* JADX INFO: renamed from: m */
    public void m133496m() {
        this.f110013b.m42953b("接下来，你还可以");
        xdl0.m208344M(this.f110012a, true);
        this.f110022k.m43428l("上传更丰富的生活照", "获得价值68元的优先推荐，让你的配对迅速暴增", vwb.m200324f0(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted(), "res://" + this.f110020i.getPackageName() + "/" + x2c0.f189763Te), this.f110020i.getDrawable(x2c0.f190045cf), "立即上传", Color.parseColor("#FF6298"));
        this.f110022k.m43431o(null, true);
    }

    /* JADX INFO: renamed from: n */
    public void m133497n() {
        this.f110013b.m42953b("接下来，你还可以");
        xdl0.m208344M(this.f110012a, true);
        String str = "res://" + this.f110020i.getPackageName() + "/" + x2c0.f189169Af;
        Drawable drawable = this.f110020i.getDrawable(x2c0.f190045cf);
        String str2 = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted();
        this.f110022k.m43428l("添加你的游戏日常", "认识更多游戏搭子", vwb.m200324f0(str), drawable, "立即完善", Color.parseColor("#FE7E1D"));
        ArrayList arrayList = new ArrayList();
        TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
        taskAvatarDesc.avatars = vwb.m200324f0(str2, str2, str2, str2);
        taskAvatarDesc.text = "她们在寻找“王者荣耀”的搭子";
        arrayList.add(taskAvatarDesc);
        TaskAvatarDesc taskAvatarDesc2 = new TaskAvatarDesc();
        taskAvatarDesc2.avatars = vwb.m200324f0(str2, str2, str2, str2);
        taskAvatarDesc2.text = "她们在寻找“原神”的搭子";
        arrayList.add(taskAvatarDesc2);
        this.f110022k.m43430n(arrayList, true);
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: o */
    public boolean mo133498o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m133499p() {
        this.f110013b.m42953b("接下来，你还可以");
        xdl0.m208344M(this.f110012a, true);
        String str = "res://" + this.f110020i.getPackageName() + "/" + x2c0.f189825Ve;
        Drawable drawable = this.f110020i.getDrawable(x2c0.f190045cf);
        String str2 = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted();
        this.f110022k.m43428l("测试你的 MBTI", "优先为你推荐最匹配的人格", vwb.m200324f0(str), drawable, "立即完善", Color.parseColor("#FE7E1D"));
        this.f110022k.m43432p(vwb.m200324f0(str2, str2, str2, str2), "她们已完成测试", true);
    }

    /* JADX INFO: renamed from: q */
    public void m133500q() {
        this.f110013b.m42953b("接下来，你还可以");
        xdl0.m208344M(this.f110012a, true);
        String str = "res://" + this.f110020i.getPackageName() + "/" + x2c0.f190298kf;
        Drawable drawable = this.f110020i.getDrawable(x2c0.f190045cf);
        String str2 = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted();
        this.f110022k.m43428l("4个人邀请你认证", "完成头像认证后，立即收到他们的喜欢", vwb.m200324f0(str), drawable, "立即认证", Color.parseColor("#3CB9F0"));
        this.f110022k.m43431o(vwb.m200324f0(str2, str2, str2, str2), true);
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: r */
    public void mo133501r() {
        this.f110015d.setMyTabStyle(true);
        this.f110016e.setMyTabStyle(true);
    }

    /* JADX INFO: renamed from: s */
    public void m133502s() {
        this.f110013b.m42953b("接下来，你还可以");
        xdl0.m208344M(this.f110012a, true);
        this.f110022k.m43428l("完成头像认证", "解锁6项权益，更快认识合适的人", vwb.m200324f0("res://" + this.f110020i.getPackageName() + "/" + x2c0.f190298kf), this.f110020i.getDrawable(x2c0.f190045cf), "立即认证", Color.parseColor("#3CB9F0"));
        this.f110022k.setSubAvatarWithIllustrate(vwb.m200324f0(vwb.m200311Y(Integer.valueOf(x2c0.f190490qf), "更多右滑"), vwb.m200311Y(Integer.valueOf(x2c0.f190362mf), "优先曝光"), vwb.m200311Y(Integer.valueOf(x2c0.f190554sf), "只看认证"), vwb.m200311Y(Integer.valueOf(x2c0.f190426of), "点亮勋章")));
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: D1 */
    public void mo133487D1() {
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: x2 */
    public void mo133503x2() {
    }
}
