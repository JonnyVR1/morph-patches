package p007l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.j760;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n4h implements f4h<tek>, ViewPager.j {

    /* JADX INFO: renamed from: a */
    public FeedGroupDetailViewHolder f10650a;

    /* JADX INFO: renamed from: b */
    public Act f10651b;

    /* JADX INFO: renamed from: c */
    public tek f10652c;

    /* JADX INFO: renamed from: d */
    public r5h f10653d;

    /* JADX INFO: renamed from: e */
    public p4h f10654e;

    /* JADX INFO: renamed from: f */
    public List<z5h> f10655f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public zih f10656g;

    /* JADX INFO: renamed from: h */
    public String f10657h;

    /* JADX INFO: renamed from: i */
    public int f10658i;

    /* JADX INFO: renamed from: l.n4h$a */
    public class C2434a extends l80<TopicMoment> {
        public C2434a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicMoment topicMoment, int i) {
            p6j0.m12915e("e_topic", "p_circle_detail", j760.a("topic_id", topicMoment.f708id), j760.a("is_create", Boolean.valueOf(topicMoment.owner.f220id.equals(FeedModule.m1139F().userId()))), j760.a("topic_type", zi60.m17436w().m17439E(topicMoment)), j760.a("topic_source", "circle_hot_topic"));
        }
    }

    public n4h(FeedGroupDetailViewHolder feedGroupDetailViewHolder, Act act) {
        this.f10650a = feedGroupDetailViewHolder;
        this.f10651b = act;
        this.f10653d = new y5h(act);
    }

    /* JADX INFO: renamed from: r */
    private void m12079r() {
        this.f10650a.f1542v.setTabMode(0);
        this.f10650a.f1542v.setTabRippleColorResource(e1c0.f7155n0);
        this.f10650a.f1542v.setTabGravity(0);
        m12085F(0);
        this.f10650a.f1542v.addOnTabSelectedListener(new C2435b());
    }

    /* JADX INFO: renamed from: A */
    public void m12080A(boolean z) {
        this.f10652c.m14497b().joined = z;
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f10650a;
        if (z) {
            feedGroupDetailViewHolder.f1525e.setText("已加入");
            this.f10650a.f1525e.setTextColor(Color.parseColor("#80000000"));
            this.f10650a.f1525e.setBackgroundResource(f3c0.f7893r1);
        } else {
            feedGroupDetailViewHolder.f1525e.setText("加入");
            this.f10650a.f1525e.setTextColor(this.f10651b.getResources().getColor(e1c0.f7159p0));
            this.f10650a.f1525e.setBackgroundResource(f3c0.f7781d1);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m12081B() {
        try {
            List<String> listM14498c = this.f10652c.m14498c();
            if (vwb.J(listM14498c)) {
                return;
            }
            int iMin = Math.min(listM14498c.size(), 2);
            int[] iArr = new int[iMin];
            for (int i = 0; i < iMin; i++) {
                if (i == 0) {
                    iArr[i] = Color.parseColor("#33" + listM14498c.get(i).substring(1));
                } else {
                    iArr[i] = Color.parseColor(listM14498c.get(i));
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColors(iArr);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            this.f10650a.f1522b.setBackground(gradientDrawable);
        } catch (Exception e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m12082C(tek tekVar) {
        this.f10652c = tekVar;
    }

    /* JADX INFO: renamed from: D */
    public void m12083D(zih zihVar) {
        this.f10656g = zihVar;
    }

    /* JADX INFO: renamed from: E */
    public void m12084E(String str) {
        this.f10657h = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m12085F(int i) {
        ((TextView) ((ViewGroup) ((ViewGroup) this.f10650a.f1542v.getChildAt(0)).getChildAt(i)).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // p007l.f4h
    /* JADX INFO: renamed from: i */
    public void mo10043i() {
        int color;
        this.f10650a.f1529i.setText(this.f10652c.m14504i());
        this.f10650a.f1524d.setText(this.f10652c.m14504i());
        boolean zIsEmpty = TextUtils.isEmpty(this.f10652c.m14496a());
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f10650a;
        if (zIsEmpty) {
            feedGroupDetailViewHolder.f1530j.setVisibility(8);
        } else {
            feedGroupDetailViewHolder.f1530j.setText(this.f10652c.m14496a());
        }
        if (this.f10652c.m14497b().isGroupAnonymousType() || this.f10652c.m14506k() == 0) {
            this.f10650a.f1531k.setVisibility(8);
        } else {
            List<User> listM14507l = this.f10652c.m14507l();
            List<String> listM14498c = this.f10652c.m14498c();
            if (listM14498c == null || listM14498c.size() < 3) {
                color = -1;
            } else {
                try {
                    color = Color.parseColor(listM14498c.get(2));
                } catch (Exception e) {
                    CrashHelper.c(e);
                    e.printStackTrace();
                    color = -1;
                }
            }
            for (int i = 0; i < listM14507l.size(); i++) {
                User user = listM14507l.get(i);
                if (i == 0) {
                    m12093z(color, this.f10650a.f1536p);
                    qib0.G.Q0(this.f10650a.f1537q, user.m1042fp().profileSmall());
                } else if (i == 1) {
                    m12093z(color, this.f10650a.f1534n);
                    qib0.G.Q0(this.f10650a.f1535o, user.m1042fp().profileSmall());
                } else if (i == 2) {
                    m12093z(color, this.f10650a.f1532l);
                    qib0.G.Q0(this.f10650a.f1533m, user.m1042fp().profileSmall());
                }
            }
            String strM14505j = this.f10652c.m14505j();
            boolean zIsEmpty2 = TextUtils.isEmpty(strM14505j);
            FeedGroupDetailViewHolder feedGroupDetailViewHolder2 = this.f10650a;
            if (zIsEmpty2) {
                feedGroupDetailViewHolder2.f1538r.setVisibility(8);
            } else {
                feedGroupDetailViewHolder2.f1538r.setText(strM14505j);
            }
        }
        this.f10650a.f1527g.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.g4h
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
                this.f8349a.m12088u(appBarLayout, i2);
            }
        });
    }

    @Override // p007l.f4h
    /* JADX INFO: renamed from: j */
    public void mo10044j() {
        ArrayList arrayList = new ArrayList();
        this.f10655f = arrayList;
        arrayList.add(new n6h(this.f10652c.m14500e(), this.f10652c.m14501f(), this.f10657h));
        this.f10655f.add(new a6h(this.f10652c.m14500e(), this.f10652c.m14501f()));
        if (!nkg.m12217O() || !this.f10652c.m14497b().isGroupAnonymousType()) {
            this.f10655f.add(new q5h(this.f10652c.m14500e()));
        }
        if (!vwb.J(this.f10652c.m14503h())) {
            this.f10655f.add(new w6h(this.f10652c.m14503h()));
        }
        if (nkg.m12217O() && !this.f10652c.m14497b().isGroupAnonymousType()) {
            this.f10655f.add(new vtg(this.f10652c.m14500e(), this.f10652c.m14497b().name, this.f10652c.m14501f()));
        }
        p4h p4hVar = new p4h(this.f10651b.getSupportFragmentManager(), this.f10651b, this.f10655f);
        this.f10654e = p4hVar;
        this.f10650a.f1543w.setAdapter(p4hVar);
        this.f10650a.f1543w.setOnPageChangeListener(this);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f10650a;
        feedGroupDetailViewHolder.f1542v.setupWithViewPager(feedGroupDetailViewHolder.f1543w);
        m12079r();
        zih zihVar = this.f10656g;
        if (zihVar != null) {
            zihVar.mo8640a(new ArrayList(this.f10655f), this.f10650a.f1543w);
        }
        onPageSelected(0);
    }

    @Override // p007l.f4h
    /* JADX INFO: renamed from: k */
    public void mo10045k() {
        xdl0.E0(this.f10650a.f1525e, new View.OnClickListener() { // from class: l.h4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8575a.m12091x(view);
            }
        });
        m12080A(this.f10652c.m14508m());
    }

    @Override // p007l.f4h
    /* JADX INFO: renamed from: m */
    public void mo10047m() {
        xdl0.E0(this.f10650a.f1544x, new View.OnClickListener() { // from class: l.i4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8895a.m12092y(view);
            }
        });
    }

    @Override // p007l.f4h
    /* JADX INFO: renamed from: n */
    public void mo10048n() {
        boolean zJ = vwb.J(this.f10652c.m14502g());
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f10650a;
        if (zJ) {
            feedGroupDetailViewHolder.f1541u.setVisibility(8);
            this.f10650a.f1540t.setVisibility(8);
            return;
        }
        feedGroupDetailViewHolder.f1540t.setVisibility(0);
        this.f10650a.f1541u.setVisibility(0);
        TopicNearByHeaderView topicNearByHeaderView = new TopicNearByHeaderView(this.f10651b);
        this.f10650a.f1541u.addView(topicNearByHeaderView);
        topicNearByHeaderView.m7279f(this.f10652c.m14502g());
        topicNearByHeaderView.getmAdapter().m9685E(new C2434a());
    }

    @Override // p007l.f4h
    /* JADX INFO: renamed from: o */
    public void mo10049o() {
        xdl0.E0(this.f10650a.f1523c, new View.OnClickListener() { // from class: l.j4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9222a.m12086s(view);
            }
        });
        this.f10650a.f1528h.postDelayed(new Runnable() { // from class: l.k4h
            @Override // java.lang.Runnable
            public final void run() {
                this.f9601a.m12087t();
            }
        }, 300L);
        qib0.G.L0(this.f10650a.f1521a, this.f10652c.m14499d());
        xdl0.C0(this.f10650a.f1543w, xdl0.w0());
        m12081B();
    }

    public void onPageSelected(int i) {
        this.f10658i = i;
        if (this.f10655f.size() > i) {
            boolean zMo8421d = this.f10655f.get(i).mo8421d();
            FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f10650a;
            if (!zMo8421d) {
                feedGroupDetailViewHolder.f1544x.setVisibility(8);
            } else {
                feedGroupDetailViewHolder.f1544x.setVisibility(0);
                p6j0.m12915e("e_moment_post", "p_circle_detail", j760.a("circle_detail_tab", this.f10655f.get(i).mo8422e().getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m12086s(View view) {
        this.f10651b.finish();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m12087t() {
        int top = this.f10650a.f1526f.getTop();
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f10650a;
        xdl0.C0(feedGroupDetailViewHolder.f1521a, feedGroupDetailViewHolder.f1528h.getHeight() + top);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder2 = this.f10650a;
        xdl0.C0(feedGroupDetailViewHolder2.f1522b, feedGroupDetailViewHolder2.f1528h.getHeight() + top);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m12088u(AppBarLayout appBarLayout, int i) {
        int i2 = -i;
        int iD = t100.d(44.0f);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f10650a;
        if (i2 >= iD) {
            feedGroupDetailViewHolder.f1524d.setVisibility(0);
        } else {
            feedGroupDetailViewHolder.f1524d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m12089v() {
        m12080A(false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m12090w() {
        m12080A(true);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m12091x(View view) {
        zvf0.r("e_circle_join", "p_circle_detail");
        boolean zM14508m = this.f10652c.m14508m();
        r5h r5hVar = this.f10653d;
        if (zM14508m) {
            r5hVar.mo13833b(this.f10652c, new d30() { // from class: l.l4h
                public final void call() {
                    this.f9877a.m12089v();
                }
            });
        } else {
            r5hVar.mo13832a(this.f10652c, new d30() { // from class: l.m4h
                public final void call() {
                    this.f10220a.m12090w();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m12092y(View view) {
        p6j0.m12913c("e_moment_post", "p_circle_detail", j760.a("album_post_source", "circle_detail"), j760.a("circle_detail_tab", this.f10655f.get(this.f10658i).mo8422e().getValue()));
        Act act = this.f10651b;
        oe40.m12548M(act, new NewPostAct.C2088a(act).m3699e(nkg.m12217O() ? new ArrayList<>(this.f10652c.m14502g()) : vwb.f0(new TopicMoment[0])).m3697c("nearby").m3698d(this.f10652c.m14500e()).m3700f(vwb.f0(new Media[0])));
    }

    /* JADX INFO: renamed from: z */
    public final void m12093z(int i, View view) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        view.setBackground(shapeDrawable);
        view.setVisibility(0);
    }

    @Override // p007l.f4h
    /* JADX INFO: renamed from: h */
    public void mo10042h() {
    }

    /* JADX INFO: renamed from: l.n4h$b */
    public class C2435b implements TabLayout.OnTabSelectedListener {
        public C2435b() {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            n4h.this.m12085F(tab.getPosition());
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) ((ViewGroup) ((ViewGroup) n4h.this.f10650a.f1542v.getChildAt(0)).getChildAt(tab.getPosition())).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(0));
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }
}
