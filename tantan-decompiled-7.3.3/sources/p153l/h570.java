package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class h570 extends elh<w370> implements jn50 {

    /* JADX INFO: renamed from: A */
    public Act f107913A;

    /* JADX INFO: renamed from: B */
    public jxd0 f107914B = new jxd0("HAS_MATCH_REPLY_TIP_CLOSED" + FeedModule.m61405F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: C */
    public h80 f107915C = new C17402a();

    /* JADX INFO: renamed from: o */
    public VNavigationBar f107916o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f107917p;

    /* JADX INFO: renamed from: q */
    public VText f107918q;

    /* JADX INFO: renamed from: r */
    public VImage f107919r;

    /* JADX INFO: renamed from: s */
    public VPullDownRefreshLayout f107920s;

    /* JADX INFO: renamed from: t */
    public VRecyclerView f107921t;

    /* JADX INFO: renamed from: u */
    public VLinear f107922u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f107923v;

    /* JADX INFO: renamed from: w */
    public VText f107924w;

    /* JADX INFO: renamed from: x */
    public VText f107925x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f107926y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f107927z;

    public h570(PhotoAlbumActivitiesAct photoAlbumActivitiesAct) {
        this.f107913A = photoAlbumActivitiesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m133639R() {
        this.f94520a.m196734R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m133640S(View view) {
        Act act = this.f107913A;
        k3h.m148047K0(act, act.getResources().getString(R$string.f39818S0), new x20() { // from class: l.g570
            @Override // p153l.x20
            public final void call() {
                this.f102293a.m133639R();
            }
        });
        i4g0.m138523u("e_all_read", "p_activity", pf60.m172085a("unread_message_num", Integer.valueOf((NullChecker.m82486a(mrb0.m159657k()) && NullChecker.m82486a(mrb0.m159657k().activities)) ? mrb0.m159657k().activities.unread : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m133641T(View view) {
        bnl0.m105524M(this.f107917p, false);
        this.f107914B.put(Boolean.TRUE);
    }

    @Override // p153l.elh, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f107913A;
    }

    /* JADX INFO: renamed from: N */
    public View m133642N(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i570.m138642b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public View m133643O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j570.m143516b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.elh
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w370 w370Var) {
        this.f94520a = w370Var;
        super.mo22064i1(w370Var);
    }

    /* JADX INFO: renamed from: Q */
    public final List<pf60<String, String>> m133645Q(Moment moment, MomentMessage momentMessage) {
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

    @Override // p153l.iam
    public Act act() {
        return this.f107913A;
    }

    @Override // p153l.elh, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM133642N = m133642N(layoutInflater, viewGroup);
        this.f107916o.setLeftIconAsBack(act());
        viewM133642N.setBackgroundColor(this.f107913A.getResources().getColor(k9c0.f124526p0));
        this.f94523d = this.f107921t;
        this.f94525f = this.f107922u;
        this.f94526g = this.f107923v;
        this.f94527h = this.f107924w;
        this.f94528i = this.f107925x;
        this.f94529j = this.f107920s;
        return viewM133642N;
    }

    /* JADX INFO: renamed from: r */
    public void m133646r() {
        this.f107925x.setTypeface(null, 1);
        this.f107916o.setLeftIconAsBack(act());
        if (this.f94520a.m196745h1()) {
            boolean zM111195W = cmg.m111195W();
            VNavigationBar vNavigationBar = this.f107916o;
            if (zM111195W) {
                vNavigationBar.setTitle(R$string.f39769K);
            } else {
                vNavigationBar.setTitle(R$string.f39769K);
            }
        } else {
            this.f107916o.setTitle(R$string.f39906f5);
        }
        if (!PhotoAlbumActivitiesAct.f43092j.equals(this.f94520a.f179638a) && owi.f149494m.get().booleanValue()) {
            TextView textView = new TextView(this.f107913A);
            this.f94522c = textView;
            textView.setText(this.f107913A.getResources().getString(R$string.f39922i0));
            this.f94522c.setTextColor(this.f107913A.getResources().getColor(k9c0.f124528r));
            this.f94522c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f94522c.setTextSize(14.0f);
            this.f94522c.setPadding(qa00.m175859d(12.0f), qa00.m175859d(7.0f), qa00.m175859d(12.0f), qa00.m175859d(7.0f));
            this.f94522c.setBackground(this.f107913A.getResources().getDrawable(lbc0.f131035f4));
            this.f107916o.m224835z(this.f94522c);
            this.f94522c.setOnClickListener(new View.OnClickListener() { // from class: l.e570
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92196a.m133640S(view);
                }
            });
        }
        bnl0.m105524M(this.f107917p, false);
        this.f107920s.mo224405O(this);
        this.f107919r.setOnClickListener(new View.OnClickListener() { // from class: l.f570
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97201a.m133641T(view);
            }
        });
        m133643O(this.f107913A.inflater(), this.f107921t);
        this.f94532m = this.f107927z;
        this.f94530k = new b370(this.f107913A, this.f107926y, this.f94520a, this.f107915C);
        this.f107921t.setVisibility(4);
        this.f94531l = new PhotoAlbumInterestedHeaderView(this.f107913A);
        s8h s8hVar = new s8h(this.f94530k);
        this.f94524e = s8hVar;
        s8hVar.m222265H(this.f94531l);
        this.f107921t.setAdapter(this.f94524e);
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull @NotNull mvc0 mvc0Var) {
        m121171v();
    }

    @Override // p153l.elh, p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.h570$a */
    public class C17402a extends h80<MomentActivity> {
        public C17402a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(MomentActivity momentActivity, int i) {
            if (cmg.m111195W() && PhotoAlbumActivitiesAct.f43092j.equals(h570.this.f94520a.f179638a)) {
                i4g0.m138492A("e_likes_list", "p_content_likes", pf60.m172085a("user_id", momentActivity.actors), pf60.m172085a("moment_id", momentActivity.reference.f40080id));
            } else if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, "comment")) {
                tfj0.m190942e("e_comment", "p_activity", (pf60[]) h570.this.m133645Q(FeedModule.f39703d.f121357i0.get(momentActivity.reference.f40080id), FeedModule.f39703d.f121300H0.get(momentActivity.messageid)).toArray(new pf60[0]));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(MomentActivity momentActivity, int i, long j) {
        }
    }
}
