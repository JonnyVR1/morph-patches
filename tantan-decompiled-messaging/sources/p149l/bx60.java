package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class bx60 extends pjh<qv60> implements df50 {

    /* JADX INFO: renamed from: A */
    public Act f77753A;

    /* JADX INFO: renamed from: B */
    public hpd0 f77754B = new hpd0("HAS_MATCH_REPLY_TIP_CLOSED" + FeedModule.m60221F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: C */
    public l80 f77755C = new C16007a();

    /* JADX INFO: renamed from: o */
    public VNavigationBar f77756o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f77757p;

    /* JADX INFO: renamed from: q */
    public VText f77758q;

    /* JADX INFO: renamed from: r */
    public VImage f77759r;

    /* JADX INFO: renamed from: s */
    public VPullDownRefreshLayout f77760s;

    /* JADX INFO: renamed from: t */
    public VRecyclerView f77761t;

    /* JADX INFO: renamed from: u */
    public VLinear f77762u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f77763v;

    /* JADX INFO: renamed from: w */
    public VText f77764w;

    /* JADX INFO: renamed from: x */
    public VText f77765x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f77766y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f77767z;

    public bx60(PhotoAlbumActivitiesAct photoAlbumActivitiesAct) {
        this.f77753A = photoAlbumActivitiesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m104298R() {
        this.f149775a.m122046R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m104299S(View view) {
        Act act = this.f77753A;
        v1h.m196570K0(act, act.getResources().getString(R$string.f38970S0), new d30() { // from class: l.ax60
            @Override // p149l.d30
            public final void call() {
                this.f72127a.m104298R();
            }
        });
        zvf0.m220399u("e_all_read", "p_activity", j760.m140076a("unread_message_num", Integer.valueOf((NullChecker.m81303a(ijb0.m136571k()) && NullChecker.m81303a(ijb0.m136571k().activities)) ? ijb0.m136571k().activities.unread : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m104300T(View view) {
        xdl0.m208344M(this.f77757p, false);
        this.f77754B.put(Boolean.TRUE);
    }

    @Override // p149l.pjh, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77753A;
    }

    /* JADX INFO: renamed from: N */
    public View m104301N(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cx60.m109087b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public View m104302O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dx60.m113993b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.pjh
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qv60 qv60Var) {
        this.f149775a = qv60Var;
        super.mo21065i1(qv60Var);
    }

    /* JADX INFO: renamed from: Q */
    public final List<j760<String, String>> m104304Q(Moment moment, MomentMessage momentMessage) {
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

    @Override // p149l.s7m
    public Act act() {
        return this.f77753A;
    }

    @Override // p149l.pjh, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM104301N = m104301N(layoutInflater, viewGroup);
        this.f77756o.setLeftIconAsBack(act());
        viewM104301N.setBackgroundColor(this.f77753A.getResources().getColor(e1c0.f88803p0));
        this.f149778d = this.f77761t;
        this.f149780f = this.f77762u;
        this.f149781g = this.f77763v;
        this.f149782h = this.f77764w;
        this.f149783i = this.f77765x;
        this.f149784j = this.f77760s;
        return viewM104301N;
    }

    /* JADX INFO: renamed from: r */
    public void m104306r() {
        this.f77765x.setTypeface(null, 1);
        this.f77756o.setLeftIconAsBack(act());
        if (this.f149775a.m122057h1()) {
            boolean zM159866W = nkg.m159866W();
            VNavigationBar vNavigationBar = this.f77756o;
            if (zM159866W) {
                vNavigationBar.setTitle(R$string.f38921K);
            } else {
                vNavigationBar.setTitle(R$string.f38921K);
            }
        } else {
            this.f77756o.setTitle(R$string.f39058f5);
        }
        if (!PhotoAlbumActivitiesAct.f42244j.equals(this.f149775a.f98174a) && sti.f166369m.get().booleanValue()) {
            TextView textView = new TextView(this.f77753A);
            this.f149777c = textView;
            textView.setText(this.f77753A.getResources().getString(R$string.f39074i0));
            this.f149777c.setTextColor(this.f77753A.getResources().getColor(e1c0.f88805r));
            this.f149777c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f149777c.setTextSize(14.0f);
            this.f149777c.setPadding(t100.m186890d(12.0f), t100.m186890d(7.0f), t100.m186890d(12.0f), t100.m186890d(7.0f));
            this.f149777c.setBackground(this.f77753A.getResources().getDrawable(f3c0.f94517f4));
            this.f77756o.m223589z(this.f149777c);
            this.f149777c.setOnClickListener(new View.OnClickListener() { // from class: l.yw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200383a.m104299S(view);
                }
            });
        }
        xdl0.m208344M(this.f77757p, false);
        this.f77760s.mo223159O(this);
        this.f77759r.setOnClickListener(new View.OnClickListener() { // from class: l.zw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205156a.m104300T(view);
            }
        });
        m104302O(this.f77753A.inflater(), this.f77761t);
        this.f149787m = this.f77767z;
        this.f149785k = new vu60(this.f77753A, this.f77766y, this.f149775a, this.f77755C);
        this.f77761t.setVisibility(4);
        this.f149786l = new PhotoAlbumInterestedHeaderView(this.f77753A);
        d7h d7hVar = new d7h(this.f149785k);
        this.f149779e = d7hVar;
        d7hVar.m143815H(this.f149786l);
        this.f77761t.setAdapter(this.f149779e);
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull @NotNull hnc0 hnc0Var) {
        m169862v();
    }

    @Override // p149l.pjh, p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.bx60$a */
    public class C16007a extends l80<MomentActivity> {
        public C16007a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(MomentActivity momentActivity, int i) {
            if (nkg.m159866W() && PhotoAlbumActivitiesAct.f42244j.equals(bx60.this.f149775a.f98174a)) {
                zvf0.m220368A("e_likes_list", "p_content_likes", j760.m140076a("user_id", momentActivity.actors), j760.m140076a("moment_id", momentActivity.reference.f39232id));
            } else if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, "comment")) {
                p6j0.m167671e("e_comment", "p_activity", (j760[]) bx60.this.m104304Q(FeedModule.f38855d.f193047i0.get(momentActivity.reference.f39232id), FeedModule.f38855d.f192990H0.get(momentActivity.messageid)).toArray(new j760[0]));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(MomentActivity momentActivity, int i, long j) {
        }
    }
}
