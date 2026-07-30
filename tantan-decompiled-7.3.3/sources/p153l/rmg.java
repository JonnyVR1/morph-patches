package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class rmg extends elh<qmg> implements jn50 {

    /* JADX INFO: renamed from: o */
    public LinearLayout f163867o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f163868p;

    /* JADX INFO: renamed from: q */
    public VPullDownRefreshLayout f163869q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f163870r;

    /* JADX INFO: renamed from: s */
    public VLinear f163871s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f163872t;

    /* JADX INFO: renamed from: u */
    public VText f163873u;

    /* JADX INFO: renamed from: v */
    public VText f163874v;

    /* JADX INFO: renamed from: w */
    public Act f163875w;

    /* JADX INFO: renamed from: x */
    public FeedPhotoAlbumActivitiesFrag f163876x;

    /* JADX INFO: renamed from: y */
    public h80 f163877y = new C19873a();

    public rmg(FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag) {
        this.f163876x = feedPhotoAlbumActivitiesFrag;
        this.f163875w = feedPhotoAlbumActivitiesFrag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public List<pf60<String, String>> m182076N(Moment moment, MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        if (moment != null && momentMessage != null) {
            arrayList.add(pf60.m172085a("moment_id", moment.f56859id));
            arrayList.add(pf60.m172085a("owner_id", moment.owner));
            er60.m122104w();
            arrayList.add(pf60.m172085a("moment_showfrom", er60.m122103D(this.f94520a.f179638a)));
            arrayList.add(pf60.m172085a("moment_type", er60.m122104w().m122135y(moment)));
            arrayList.add(pf60.m172085a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"));
        }
        return arrayList;
    }

    @Override // p153l.elh, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f163875w;
    }

    /* JADX INFO: renamed from: K */
    public View m182077K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return smg.m186817b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L */
    public View m182078L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tmg.m191734b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.elh
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qmg qmgVar) {
        this.f94520a = qmgVar;
        super.mo22064i1(qmgVar);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f163875w;
    }

    @Override // p153l.elh, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM182078L = m182078L(layoutInflater, viewGroup);
        this.f94523d = this.f163870r;
        this.f94525f = this.f163871s;
        this.f94526g = this.f163872t;
        this.f94527h = this.f163873u;
        this.f94528i = this.f163874v;
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f163869q;
        this.f94529j = vPullDownRefreshLayout;
        vPullDownRefreshLayout.mo224405O(this);
        this.f163870r.setVisibility(4);
        m182077K(layoutInflater, this.f163870r);
        b370 b370Var = new b370(act(), this.f163867o, this.f94520a, this.f163877y);
        this.f94530k = b370Var;
        s8h s8hVar = new s8h(b370Var);
        this.f94524e = s8hVar;
        this.f94532m = this.f163868p;
        this.f163870r.setAdapter(s8hVar);
        return viewM182078L;
    }

    @Override // p153l.elh
    /* JADX INFO: renamed from: n */
    public void mo121166n() {
        if (this.f94520a.f179639b == 1) {
            FeedModule.f39703d.f121334W0.onNext(new bkj0<>(null, 0, Boolean.FALSE));
        }
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        m121171v();
    }

    @Override // p153l.elh
    /* JADX INFO: renamed from: y */
    public void mo121174y(List<User> list, int i) {
        if (this.f94520a.f179639b == 1) {
            FeedModule.f39703d.f121334W0.onNext(new bkj0<>(list, Integer.valueOf(i), Boolean.TRUE));
        }
    }

    @Override // p153l.elh, p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.rmg$a */
    public class C19873a extends h80<MomentActivity> {
        public C19873a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(MomentActivity momentActivity, int i) {
            String str;
            if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, "comment")) {
                tfj0.m190942e("e_comment", "p_activity", (pf60[]) rmg.this.m182076N(FeedModule.f39703d.f121357i0.get(momentActivity.reference.f40080id), FeedModule.f39703d.f121300H0.get(momentActivity.messageid)).toArray(new pf60[0]));
            }
            if (cmg.m111184L() && pfh.m172098c(momentActivity)) {
                if (pfh.m172100e(momentActivity)) {
                    str = pfh.m172097b(momentActivity.actors) ? "好友" : "你喜欢的人";
                } else {
                    str = "";
                }
                String strM172096a = pfh.m172096a(momentActivity);
                if (TextUtils.isEmpty(strM172096a)) {
                    return;
                }
                tfj0.m190942e(strM172096a, "p_activity", pf60.m172085a("usertagname", str), pf60.m172085a("moments_user_id", momentActivity.actors));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(MomentActivity momentActivity, int i, long j) {
        }
    }
}
