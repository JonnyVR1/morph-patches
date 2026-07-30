package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class c6h implements u5h<jhk>, ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public FeedGroupDetailViewHolder f79959a;

    /* JADX INFO: renamed from: b */
    public Act f79960b;

    /* JADX INFO: renamed from: c */
    public jhk f79961c;

    /* JADX INFO: renamed from: d */
    public g7h f79962d;

    /* JADX INFO: renamed from: e */
    public e6h f79963e;

    /* JADX INFO: renamed from: f */
    public List<o7h> f79964f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public okh f79965g;

    /* JADX INFO: renamed from: h */
    public String f79966h;

    /* JADX INFO: renamed from: i */
    public int f79967i;

    /* JADX INFO: renamed from: l.c6h$a */
    public class C16200a extends h80<TopicMoment> {
        public C16200a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicMoment topicMoment, int i) {
            tfj0.m190942e("e_topic", "p_circle_detail", pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("is_create", Boolean.valueOf(topicMoment.owner.f39607id.equals(FeedModule.m61405F().userId()))), pf60.m172085a("topic_type", er60.m122104w().m122107E(topicMoment)), pf60.m172085a("topic_source", "circle_hot_topic"));
        }
    }

    public c6h(FeedGroupDetailViewHolder feedGroupDetailViewHolder, Act act) {
        this.f79959a = feedGroupDetailViewHolder;
        this.f79960b = act;
        this.f79962d = new n7h(act);
    }

    /* JADX INFO: renamed from: r */
    private void m108147r() {
        this.f79959a.f40929v.setTabMode(0);
        this.f79959a.f40929v.setTabRippleColorResource(k9c0.f124522n0);
        this.f79959a.f40929v.setTabGravity(0);
        m108153F(0);
        this.f79959a.f40929v.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C16201b());
    }

    /* JADX INFO: renamed from: A */
    public void m108148A(boolean z) {
        this.f79961c.m144904b().joined = z;
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f79959a;
        if (z) {
            feedGroupDetailViewHolder.f40912e.setText("已加入");
            this.f79959a.f40912e.setTextColor(Color.parseColor("#80000000"));
            this.f79959a.f40912e.setBackgroundResource(lbc0.f131128r1);
        } else {
            feedGroupDetailViewHolder.f40912e.setText("加入");
            this.f79959a.f40912e.setTextColor(this.f79960b.getResources().getColor(k9c0.f124526p0));
            this.f79959a.f40912e.setBackgroundResource(lbc0.f131016d1);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m108149B() {
        try {
            List<String> listM144905c = this.f79961c.m144905c();
            if (jyb.m147479J(listM144905c)) {
                return;
            }
            int iMin = Math.min(listM144905c.size(), 2);
            int[] iArr = new int[iMin];
            for (int i = 0; i < iMin; i++) {
                if (i == 0) {
                    iArr[i] = Color.parseColor("#33" + listM144905c.get(i).substring(1));
                } else {
                    iArr[i] = Color.parseColor(listM144905c.get(i));
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColors(iArr);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            this.f79959a.f40909b.setBackground(gradientDrawable);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m108150C(jhk jhkVar) {
        this.f79961c = jhkVar;
    }

    /* JADX INFO: renamed from: D */
    public void m108151D(okh okhVar) {
        this.f79965g = okhVar;
    }

    /* JADX INFO: renamed from: E */
    public void m108152E(String str) {
        this.f79966h = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m108153F(int i) {
        ((TextView) ((ViewGroup) ((ViewGroup) this.f79959a.f40929v.getChildAt(0)).getChildAt(i)).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // p153l.u5h
    /* JADX INFO: renamed from: i */
    public void mo108155i() {
        int color;
        this.f79959a.f40916i.setText(this.f79961c.m144911i());
        this.f79959a.f40911d.setText(this.f79961c.m144911i());
        boolean zIsEmpty = TextUtils.isEmpty(this.f79961c.m144903a());
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f79959a;
        if (zIsEmpty) {
            feedGroupDetailViewHolder.f40917j.setVisibility(8);
        } else {
            feedGroupDetailViewHolder.f40917j.setText(this.f79961c.m144903a());
        }
        if (this.f79961c.m144904b().isGroupAnonymousType() || this.f79961c.m144913k() == 0) {
            this.f79959a.f40918k.setVisibility(8);
        } else {
            List<User> listM144914l = this.f79961c.m144914l();
            List<String> listM144905c = this.f79961c.m144905c();
            if (listM144905c == null || listM144905c.size() < 3) {
                color = -1;
            } else {
                try {
                    color = Color.parseColor(listM144905c.get(2));
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                    e.printStackTrace();
                    color = -1;
                }
            }
            for (int i = 0; i < listM144914l.size(); i++) {
                User user = listM144914l.get(i);
                if (i == 0) {
                    m108168z(color, this.f79959a.f40923p);
                    uqb0.f180374G.m127125Q0(this.f79959a.f40924q, user.m61308fp().profileSmall());
                } else if (i == 1) {
                    m108168z(color, this.f79959a.f40921n);
                    uqb0.f180374G.m127125Q0(this.f79959a.f40922o, user.m61308fp().profileSmall());
                } else if (i == 2) {
                    m108168z(color, this.f79959a.f40919l);
                    uqb0.f180374G.m127125Q0(this.f79959a.f40920m, user.m61308fp().profileSmall());
                }
            }
            String strM144912j = this.f79961c.m144912j();
            boolean zIsEmpty2 = TextUtils.isEmpty(strM144912j);
            FeedGroupDetailViewHolder feedGroupDetailViewHolder2 = this.f79959a;
            if (zIsEmpty2) {
                feedGroupDetailViewHolder2.f40925r.setVisibility(8);
            } else {
                feedGroupDetailViewHolder2.f40925r.setText(strM144912j);
            }
        }
        this.f79959a.f40914g.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.v5h
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
                this.f182539a.m108163u(appBarLayout, i2);
            }
        });
    }

    @Override // p153l.u5h
    /* JADX INFO: renamed from: j */
    public void mo108156j() {
        ArrayList arrayList = new ArrayList();
        this.f79964f = arrayList;
        arrayList.add(new c8h(this.f79961c.m144907e(), this.f79961c.m144908f(), this.f79966h));
        this.f79964f.add(new p7h(this.f79961c.m144907e(), this.f79961c.m144908f()));
        if (!cmg.m111187O() || !this.f79961c.m144904b().isGroupAnonymousType()) {
            this.f79964f.add(new f7h(this.f79961c.m144907e()));
        }
        if (!jyb.m147479J(this.f79961c.m144910h())) {
            this.f79964f.add(new l8h(this.f79961c.m144910h()));
        }
        if (cmg.m111187O() && !this.f79961c.m144904b().isGroupAnonymousType()) {
            this.f79964f.add(new kvg(this.f79961c.m144907e(), this.f79961c.m144904b().name, this.f79961c.m144908f()));
        }
        e6h e6hVar = new e6h(this.f79960b.getSupportFragmentManager(), this.f79960b, this.f79964f);
        this.f79963e = e6hVar;
        this.f79959a.f40930w.setAdapter(e6hVar);
        this.f79959a.f40930w.setOnPageChangeListener(this);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f79959a;
        feedGroupDetailViewHolder.f40929v.setupWithViewPager(feedGroupDetailViewHolder.f40930w);
        m108147r();
        okh okhVar = this.f79965g;
        if (okhVar != null) {
            okhVar.mo168009a(new ArrayList(this.f79964f), this.f79959a.f40930w);
        }
        onPageSelected(0);
    }

    @Override // p153l.u5h
    /* JADX INFO: renamed from: k */
    public void mo108157k() {
        bnl0.m105509E0(this.f79959a.f40912e, new View.OnClickListener() { // from class: l.w5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187515a.m108166x(view);
            }
        });
        m108148A(this.f79961c.m144915m());
    }

    @Override // p153l.u5h
    /* JADX INFO: renamed from: m */
    public void mo108158m() {
        bnl0.m105509E0(this.f79959a.f40931x, new View.OnClickListener() { // from class: l.x5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192495a.m108167y(view);
            }
        });
    }

    @Override // p153l.u5h
    /* JADX INFO: renamed from: n */
    public void mo108159n() {
        boolean zM147479J = jyb.m147479J(this.f79961c.m144909g());
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f79959a;
        if (zM147479J) {
            feedGroupDetailViewHolder.f40928u.setVisibility(8);
            this.f79959a.f40927t.setVisibility(8);
            return;
        }
        feedGroupDetailViewHolder.f40927t.setVisibility(0);
        this.f79959a.f40928u.setVisibility(0);
        TopicNearByHeaderView topicNearByHeaderView = new TopicNearByHeaderView(this.f79960b);
        this.f79959a.f40928u.addView(topicNearByHeaderView);
        topicNearByHeaderView.m67310f(this.f79961c.m144909g());
        topicNearByHeaderView.getmAdapter().m149868E(new C16200a());
    }

    @Override // p153l.u5h
    /* JADX INFO: renamed from: o */
    public void mo108160o() {
        bnl0.m105509E0(this.f79959a.f40910c, new View.OnClickListener() { // from class: l.y5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197558a.m108161s(view);
            }
        });
        this.f79959a.f40915h.postDelayed(new Runnable() { // from class: l.z5h
            @Override // java.lang.Runnable
            public final void run() {
                this.f203036a.m108162t();
            }
        }, 300L);
        uqb0.f180374G.m127115L0(this.f79959a.f40908a, this.f79961c.m144906d());
        bnl0.m105505C0(this.f79959a.f40930w, bnl0.m105588w0());
        m108149B();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        this.f79967i = i;
        if (this.f79964f.size() > i) {
            boolean zMo108364d = this.f79964f.get(i).mo108364d();
            FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f79959a;
            if (!zMo108364d) {
                feedGroupDetailViewHolder.f40931x.setVisibility(8);
            } else {
                feedGroupDetailViewHolder.f40931x.setVisibility(0);
                tfj0.m190942e("e_moment_post", "p_circle_detail", pf60.m172085a("circle_detail_tab", this.f79964f.get(i).mo108365e().getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m108161s(View view) {
        this.f79960b.m68056e2();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m108162t() {
        int top = this.f79959a.f40913f.getTop();
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f79959a;
        bnl0.m105505C0(feedGroupDetailViewHolder.f40908a, feedGroupDetailViewHolder.f40915h.getHeight() + top);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder2 = this.f79959a;
        bnl0.m105505C0(feedGroupDetailViewHolder2.f40909b, feedGroupDetailViewHolder2.f40915h.getHeight() + top);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m108163u(AppBarLayout appBarLayout, int i) {
        int i2 = -i;
        int iM175859d = qa00.m175859d(44.0f);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f79959a;
        if (i2 >= iM175859d) {
            feedGroupDetailViewHolder.f40911d.setVisibility(0);
        } else {
            feedGroupDetailViewHolder.f40911d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m108164v() {
        m108148A(false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m108165w() {
        m108148A(true);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m108166x(View view) {
        i4g0.m138520r("e_circle_join", "p_circle_detail");
        boolean zM144915m = this.f79961c.m144915m();
        g7h g7hVar = this.f79962d;
        if (zM144915m) {
            g7hVar.mo129318b(this.f79961c, new x20() { // from class: l.a6h
                @Override // p153l.x20
                public final void call() {
                    this.f68729a.m108164v();
                }
            });
        } else {
            g7hVar.mo129317a(this.f79961c, new x20() { // from class: l.b6h
                @Override // p153l.x20
                public final void call() {
                    this.f75190a.m108165w();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m108167y(View view) {
        tfj0.m190940c("e_moment_post", "p_circle_detail", pf60.m172085a("album_post_source", "circle_detail"), pf60.m172085a("circle_detail_tab", this.f79964f.get(this.f79967i).mo108365e().getValue()));
        Act act = this.f79960b;
        cn40.m111361M(act, new NewPostAct.C11407a(act).m63877e(cmg.m111187O() ? new ArrayList<>(this.f79961c.m144909g()) : jyb.m147507f0(new TopicMoment[0])).m63875c("nearby").m63876d(this.f79961c.m144907e()).m63878f(jyb.m147507f0(new Media[0])));
    }

    /* JADX INFO: renamed from: z */
    public final void m108168z(int i, View view) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        view.setBackground(shapeDrawable);
        view.setVisibility(0);
    }

    @Override // p153l.u5h
    /* JADX INFO: renamed from: h */
    public void mo108154h() {
    }

    /* JADX INFO: renamed from: l.c6h$b */
    public class C16201b implements TabLayout.OnTabSelectedListener {
        public C16201b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            c6h.this.m108153F(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) ((ViewGroup) ((ViewGroup) c6h.this.f79959a.f40929v.getChildAt(0)).getChildAt(tab.getPosition())).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(0));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
