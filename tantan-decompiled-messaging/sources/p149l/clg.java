package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class clg extends pjh<blg> implements df50 {

    /* JADX INFO: renamed from: o */
    public LinearLayout f81393o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f81394p;

    /* JADX INFO: renamed from: q */
    public VPullDownRefreshLayout f81395q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f81396r;

    /* JADX INFO: renamed from: s */
    public VLinear f81397s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f81398t;

    /* JADX INFO: renamed from: u */
    public VText f81399u;

    /* JADX INFO: renamed from: v */
    public VText f81400v;

    /* JADX INFO: renamed from: w */
    public Act f81401w;

    /* JADX INFO: renamed from: x */
    public FeedPhotoAlbumActivitiesFrag f81402x;

    /* JADX INFO: renamed from: y */
    public l80 f81403y = new C16187a();

    public clg(FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag) {
        this.f81402x = feedPhotoAlbumActivitiesFrag;
        this.f81401w = feedPhotoAlbumActivitiesFrag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public List<j760<String, String>> m107463N(Moment moment, MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        if (moment != null && momentMessage != null) {
            arrayList.add(j760.m140076a("moment_id", moment.f56011id));
            arrayList.add(j760.m140076a("owner_id", moment.owner));
            zi60.m218961w();
            arrayList.add(j760.m140076a("moment_showfrom", zi60.m218960D(this.f149775a.f98174a)));
            arrayList.add(j760.m140076a("moment_type", zi60.m218961w().m218992y(moment)));
            arrayList.add(j760.m140076a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"));
        }
        return arrayList;
    }

    @Override // p149l.pjh, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f81401w;
    }

    /* JADX INFO: renamed from: K */
    public View m107464K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dlg.m112356b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L */
    public View m107465L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return elg.m117120b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.pjh
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(blg blgVar) {
        this.f149775a = blgVar;
        super.mo21065i1(blgVar);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f81401w;
    }

    @Override // p149l.pjh, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM107465L = m107465L(layoutInflater, viewGroup);
        this.f149778d = this.f81396r;
        this.f149780f = this.f81397s;
        this.f149781g = this.f81398t;
        this.f149782h = this.f81399u;
        this.f149783i = this.f81400v;
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f81395q;
        this.f149784j = vPullDownRefreshLayout;
        vPullDownRefreshLayout.mo223159O(this);
        this.f81396r.setVisibility(4);
        m107464K(layoutInflater, this.f81396r);
        vu60 vu60Var = new vu60(act(), this.f81393o, this.f149775a, this.f81403y);
        this.f149785k = vu60Var;
        d7h d7hVar = new d7h(vu60Var);
        this.f149779e = d7hVar;
        this.f149787m = this.f81394p;
        this.f81396r.setAdapter(d7hVar);
        return viewM107465L;
    }

    @Override // p149l.pjh
    /* JADX INFO: renamed from: n */
    public void mo107467n() {
        if (this.f149775a.f98175b == 1) {
            FeedModule.f38855d.f193024W0.onNext(new xaj0<>(null, 0, Boolean.FALSE));
        }
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        m169862v();
    }

    @Override // p149l.pjh
    /* JADX INFO: renamed from: y */
    public void mo107468y(List<User> list, int i) {
        if (this.f149775a.f98175b == 1) {
            FeedModule.f38855d.f193024W0.onNext(new xaj0<>(list, Integer.valueOf(i), Boolean.TRUE));
        }
    }

    @Override // p149l.pjh, p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.clg$a */
    public class C16187a extends l80<MomentActivity> {
        public C16187a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(MomentActivity momentActivity, int i) {
            String str;
            if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, "comment")) {
                p6j0.m167671e("e_comment", "p_activity", (j760[]) clg.this.m107463N(FeedModule.f38855d.f193047i0.get(momentActivity.reference.f39232id), FeedModule.f38855d.f192990H0.get(momentActivity.messageid)).toArray(new j760[0]));
            }
            if (nkg.m159855L() && aeh.m96094c(momentActivity)) {
                if (aeh.m96096e(momentActivity)) {
                    str = aeh.m96093b(momentActivity.actors) ? "好友" : "你喜欢的人";
                } else {
                    str = "";
                }
                String strM96092a = aeh.m96092a(momentActivity);
                if (TextUtils.isEmpty(strM96092a)) {
                    return;
                }
                p6j0.m167671e(strM96092a, "p_activity", j760.m140076a("usertagname", str), j760.m140076a("moments_user_id", momentActivity.actors));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(MomentActivity momentActivity, int i, long j) {
        }
    }
}
