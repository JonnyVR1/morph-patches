package p007l;

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
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.df50;
import l.hnc0;
import l.hpd0;
import l.j760;
import l.t100;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bx60 extends pjh<qv60> implements df50 {

    /* JADX INFO: renamed from: A */
    public Act f6445A;

    /* JADX INFO: renamed from: B */
    public hpd0 f6446B = new hpd0("HAS_MATCH_REPLY_TIP_CLOSED" + FeedModule.m1139F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: C */
    public l80 f6447C = new C2346a();

    /* JADX INFO: renamed from: o */
    public VNavigationBar f6448o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f6449p;

    /* JADX INFO: renamed from: q */
    public VText f6450q;

    /* JADX INFO: renamed from: r */
    public VImage f6451r;

    /* JADX INFO: renamed from: s */
    public VPullDownRefreshLayout f6452s;

    /* JADX INFO: renamed from: t */
    public VRecyclerView f6453t;

    /* JADX INFO: renamed from: u */
    public VLinear f6454u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f6455v;

    /* JADX INFO: renamed from: w */
    public VText f6456w;

    /* JADX INFO: renamed from: x */
    public VText f6457x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f6458y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f6459z;

    public bx60(PhotoAlbumActivitiesAct photoAlbumActivitiesAct) {
        this.f6445A = photoAlbumActivitiesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m9041R() {
        this.f11851a.m10189R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m9042S(View view) {
        Act act = this.f6445A;
        v1h.m15209K0(act, act.getResources().getString(R$string.f431S0), new d30() { // from class: l.ax60
            public final void call() {
                this.f5868a.m9041R();
            }
        });
        zvf0.u("e_all_read", "p_activity", new j760[]{j760.a("unread_message_num", Integer.valueOf((NullChecker.a(ijb0.m10924k()) && NullChecker.a(ijb0.m10924k().activities)) ? ijb0.m10924k().activities.unread : 0))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m9043T(View view) {
        xdl0.M(this.f6449p, false);
        this.f6446B.put(Boolean.TRUE);
    }

    @Override // p007l.pjh
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo9044C0() {
        return this.f6445A;
    }

    /* JADX INFO: renamed from: N */
    public View m9045N(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cx60.m9250b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public View m9046O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dx60.m9583b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.pjh
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo9049i1(qv60 qv60Var) {
        this.f11851a = qv60Var;
        super.mo9049i1(qv60Var);
    }

    /* JADX INFO: renamed from: Q */
    public final List<j760<String, String>> m9048Q(Moment moment, MomentMessage momentMessage) {
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

    public Act act() {
        return this.f6445A;
    }

    @Override // p007l.pjh
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM9045N = m9045N(layoutInflater, viewGroup);
        this.f6448o.setLeftIconAsBack(act());
        viewM9045N.setBackgroundColor(this.f6445A.getResources().getColor(e1c0.f7159p0));
        this.f11854d = this.f6453t;
        this.f11856f = this.f6454u;
        this.f11857g = this.f6455v;
        this.f11858h = this.f6456w;
        this.f11859i = this.f6457x;
        this.f11860j = this.f6452s;
        return viewM9045N;
    }

    /* JADX INFO: renamed from: r */
    public void m9051r() {
        this.f6457x.setTypeface((Typeface) null, 1);
        this.f6448o.setLeftIconAsBack(act());
        if (this.f11851a.m10200h1()) {
            boolean zM12225W = nkg.m12225W();
            VNavigationBar vNavigationBar = this.f6448o;
            if (zM12225W) {
                vNavigationBar.setTitle(R$string.f382K);
            } else {
                vNavigationBar.setTitle(R$string.f382K);
            }
        } else {
            this.f6448o.setTitle(R$string.f519f5);
        }
        if (!PhotoAlbumActivitiesAct.f3705j.equals(this.f11851a.f8141a) && ((Boolean) sti.f13087m.get()).booleanValue()) {
            TextView textView = new TextView(this.f6445A);
            this.f11853c = textView;
            textView.setText(this.f6445A.getResources().getString(R$string.f535i0));
            this.f11853c.setTextColor(this.f6445A.getResources().getColor(e1c0.f7161r));
            this.f11853c.setTypeface(Typeface.DEFAULT_BOLD);
            this.f11853c.setTextSize(14.0f);
            this.f11853c.setPadding(t100.d(12.0f), t100.d(7.0f), t100.d(12.0f), t100.d(7.0f));
            this.f11853c.setBackground(this.f6445A.getResources().getDrawable(f3c0.f7800f4));
            this.f6448o.z(new View[]{this.f11853c});
            this.f11853c.setOnClickListener(new View.OnClickListener() { // from class: l.yw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15515a.m9042S(view);
                }
            });
        }
        xdl0.M(this.f6449p, false);
        this.f6452s.O(this);
        this.f6451r.setOnClickListener(new View.OnClickListener() { // from class: l.zw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15867a.m9043T(view);
            }
        });
        m9046O(this.f6445A.inflater(), this.f6453t);
        this.f11863m = this.f6459z;
        this.f11861k = new vu60(this.f6445A, this.f6458y, this.f11851a, this.f6447C);
        this.f6453t.setVisibility(4);
        this.f11862l = new PhotoAlbumInterestedHeaderView(this.f6445A);
        d7h d7hVar = new d7h(this.f11861k);
        this.f11855e = d7hVar;
        d7hVar.H(this.f11862l);
        this.f6453t.setAdapter(this.f11855e);
    }

    /* JADX INFO: renamed from: w2 */
    public void m9052w2(@NonNull @NotNull hnc0 hnc0Var) {
        m13059v();
    }

    @Override // p007l.pjh
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.bx60$a */
    public class C2346a extends l80<MomentActivity> {
        public C2346a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(MomentActivity momentActivity, int i) {
            if (nkg.m12225W() && PhotoAlbumActivitiesAct.f3705j.equals(bx60.this.f11851a.f8141a)) {
                zvf0.A("e_likes_list", "p_content_likes", new j760[]{j760.a("user_id", momentActivity.actors), j760.a("moment_id", momentActivity.reference.f693id)});
            } else if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, "comment")) {
                p6j0.m12915e("e_comment", "p_activity", (j760[]) bx60.this.m9048Q(FeedModule.f316d.f14982i0.get(momentActivity.reference.f693id), FeedModule.f316d.f14925H0.get(momentActivity.messageid)).toArray(new j760[0]));
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(MomentActivity momentActivity, int i, long j) {
        }
    }
}
