package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.df50;
import l.hnc0;
import l.j760;
import l.xaj0;
import v.VDraweeView;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class clg extends pjh<blg> implements df50 {

    /* JADX INFO: renamed from: o */
    public LinearLayout f6670o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f6671p;

    /* JADX INFO: renamed from: q */
    public VPullDownRefreshLayout f6672q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f6673r;

    /* JADX INFO: renamed from: s */
    public VLinear f6674s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f6675t;

    /* JADX INFO: renamed from: u */
    public VText f6676u;

    /* JADX INFO: renamed from: v */
    public VText f6677v;

    /* JADX INFO: renamed from: w */
    public Act f6678w;

    /* JADX INFO: renamed from: x */
    public FeedPhotoAlbumActivitiesFrag f6679x;

    /* JADX INFO: renamed from: y */
    public l80 f6680y = new C2355a();

    public clg(FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag) {
        this.f6679x = feedPhotoAlbumActivitiesFrag;
        this.f6678w = feedPhotoAlbumActivitiesFrag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public List<j760<String, String>> m9200N(Moment moment, MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        if (moment != null && momentMessage != null) {
            arrayList.add(j760.a("moment_id", ((DbObject) moment).id));
            arrayList.add(j760.a("owner_id", moment.owner));
            zi60.m17436w();
            arrayList.add(j760.a("moment_showfrom", zi60.m17435D(this.f11851a.f8141a)));
            arrayList.add(j760.a("moment_type", zi60.m17436w().m17467y(moment)));
            arrayList.add(j760.a("comment_detail", momentMessage.isChildComment() ? "reply" : "comment"));
        }
        return arrayList;
    }

    @Override // p007l.pjh
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo9044C0() {
        return this.f6678w;
    }

    /* JADX INFO: renamed from: K */
    public View m9201K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dlg.m9469b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L */
    public View m9202L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return elg.m9931b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.pjh
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9049i1(blg blgVar) {
        this.f11851a = blgVar;
        super.mo9049i1(blgVar);
    }

    @Nullable
    public Act act() {
        return this.f6678w;
    }

    @Override // p007l.pjh
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM9202L = m9202L(layoutInflater, viewGroup);
        this.f11854d = this.f6673r;
        this.f11856f = this.f6674s;
        this.f11857g = this.f6675t;
        this.f11858h = this.f6676u;
        this.f11859i = this.f6677v;
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f6672q;
        this.f11860j = vPullDownRefreshLayout;
        vPullDownRefreshLayout.O(this);
        this.f6673r.setVisibility(4);
        m9201K(layoutInflater, this.f6673r);
        vu60 vu60Var = new vu60(act(), this.f6670o, this.f11851a, this.f6680y);
        this.f11861k = vu60Var;
        d7h d7hVar = new d7h(vu60Var);
        this.f11855e = d7hVar;
        this.f11863m = this.f6671p;
        this.f6673r.setAdapter(d7hVar);
        return viewM9202L;
    }

    @Override // p007l.pjh
    /* JADX INFO: renamed from: n */
    public void mo9204n() {
        if (this.f11851a.f8142b == 1) {
            FeedModule.f316d.f14959W0.onNext(new xaj0((Object) null, 0, Boolean.FALSE));
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m9205w2(@NonNull hnc0 hnc0Var) {
        m13059v();
    }

    @Override // p007l.pjh
    /* JADX INFO: renamed from: y */
    public void mo9206y(List<User> list, int i) {
        if (this.f11851a.f8142b == 1) {
            FeedModule.f316d.f14959W0.onNext(new xaj0(list, Integer.valueOf(i), Boolean.TRUE));
        }
    }

    @Override // p007l.pjh
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.clg$a */
    public class C2355a extends l80<MomentActivity> {
        public C2355a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(MomentActivity momentActivity, int i) {
            String str;
            if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, "comment")) {
                p6j0.m12915e("e_comment", "p_activity", (j760[]) clg.this.m9200N(FeedModule.f316d.f14982i0.get(momentActivity.reference.f693id), FeedModule.f316d.f14925H0.get(momentActivity.messageid)).toArray(new j760[0]));
            }
            if (nkg.m12214L() && aeh.m8506c(momentActivity)) {
                if (aeh.m8508e(momentActivity)) {
                    str = aeh.m8505b(momentActivity.actors) ? "好友" : "你喜欢的人";
                } else {
                    str = "";
                }
                String strM8504a = aeh.m8504a(momentActivity);
                if (TextUtils.isEmpty(strM8504a)) {
                    return;
                }
                p6j0.m12915e(strM8504a, "p_activity", j760.a("usertagname", str), j760.a("moments_user_id", momentActivity.actors));
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(MomentActivity momentActivity, int i, long j) {
        }
    }
}
