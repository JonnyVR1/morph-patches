package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class n4h implements f4h<tek>, ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public FeedGroupDetailViewHolder f137098a;

    /* JADX INFO: renamed from: b */
    public Act f137099b;

    /* JADX INFO: renamed from: c */
    public tek f137100c;

    /* JADX INFO: renamed from: d */
    public r5h f137101d;

    /* JADX INFO: renamed from: e */
    public p4h f137102e;

    /* JADX INFO: renamed from: f */
    public List<z5h> f137103f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public zih f137104g;

    /* JADX INFO: renamed from: h */
    public String f137105h;

    /* JADX INFO: renamed from: i */
    public int f137106i;

    /* JADX INFO: renamed from: l.n4h$a */
    public class C18621a extends l80<TopicMoment> {
        public C18621a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicMoment topicMoment, int i) {
            p6j0.m167671e("e_topic", "p_circle_detail", j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("is_create", Boolean.valueOf(topicMoment.owner.f38759id.equals(FeedModule.m60221F().userId()))), j760.m140076a("topic_type", zi60.m218961w().m218964E(topicMoment)), j760.m140076a("topic_source", "circle_hot_topic"));
        }
    }

    public n4h(FeedGroupDetailViewHolder feedGroupDetailViewHolder, Act act) {
        this.f137098a = feedGroupDetailViewHolder;
        this.f137099b = act;
        this.f137101d = new y5h(act);
    }

    /* JADX INFO: renamed from: r */
    private void m157849r() {
        this.f137098a.f40081v.setTabMode(0);
        this.f137098a.f40081v.setTabRippleColorResource(e1c0.f88799n0);
        this.f137098a.f40081v.setTabGravity(0);
        m157855F(0);
        this.f137098a.f40081v.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C18622b());
    }

    /* JADX INFO: renamed from: A */
    public void m157850A(boolean z) {
        this.f137100c.m188510b().joined = z;
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f137098a;
        if (z) {
            feedGroupDetailViewHolder.f40064e.setText("已加入");
            this.f137098a.f40064e.setTextColor(Color.parseColor("#80000000"));
            this.f137098a.f40064e.setBackgroundResource(f3c0.f94610r1);
        } else {
            feedGroupDetailViewHolder.f40064e.setText("加入");
            this.f137098a.f40064e.setTextColor(this.f137099b.getResources().getColor(e1c0.f88803p0));
            this.f137098a.f40064e.setBackgroundResource(f3c0.f94498d1);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m157851B() {
        try {
            List<String> listM188511c = this.f137100c.m188511c();
            if (vwb.m200296J(listM188511c)) {
                return;
            }
            int iMin = Math.min(listM188511c.size(), 2);
            int[] iArr = new int[iMin];
            for (int i = 0; i < iMin; i++) {
                if (i == 0) {
                    iArr[i] = Color.parseColor("#33" + listM188511c.get(i).substring(1));
                } else {
                    iArr[i] = Color.parseColor(listM188511c.get(i));
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColors(iArr);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            this.f137098a.f40061b.setBackground(gradientDrawable);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m157852C(tek tekVar) {
        this.f137100c = tekVar;
    }

    /* JADX INFO: renamed from: D */
    public void m157853D(zih zihVar) {
        this.f137104g = zihVar;
    }

    /* JADX INFO: renamed from: E */
    public void m157854E(String str) {
        this.f137105h = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m157855F(int i) {
        ((TextView) ((ViewGroup) ((ViewGroup) this.f137098a.f40081v.getChildAt(0)).getChildAt(i)).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // p149l.f4h
    /* JADX INFO: renamed from: i */
    public void mo119313i() {
        int color;
        this.f137098a.f40068i.setText(this.f137100c.m188517i());
        this.f137098a.f40063d.setText(this.f137100c.m188517i());
        boolean zIsEmpty = TextUtils.isEmpty(this.f137100c.m188509a());
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f137098a;
        if (zIsEmpty) {
            feedGroupDetailViewHolder.f40069j.setVisibility(8);
        } else {
            feedGroupDetailViewHolder.f40069j.setText(this.f137100c.m188509a());
        }
        if (this.f137100c.m188510b().isGroupAnonymousType() || this.f137100c.m188519k() == 0) {
            this.f137098a.f40070k.setVisibility(8);
        } else {
            List<User> listM188520l = this.f137100c.m188520l();
            List<String> listM188511c = this.f137100c.m188511c();
            if (listM188511c == null || listM188511c.size() < 3) {
                color = -1;
            } else {
                try {
                    color = Color.parseColor(listM188511c.get(2));
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                    e.printStackTrace();
                    color = -1;
                }
            }
            for (int i = 0; i < listM188520l.size(); i++) {
                User user = listM188520l.get(i);
                if (i == 0) {
                    m157863z(color, this.f137098a.f40075p);
                    qib0.f154691G.m102341Q0(this.f137098a.f40076q, user.m60124fp().profileSmall());
                } else if (i == 1) {
                    m157863z(color, this.f137098a.f40073n);
                    qib0.f154691G.m102341Q0(this.f137098a.f40074o, user.m60124fp().profileSmall());
                } else if (i == 2) {
                    m157863z(color, this.f137098a.f40071l);
                    qib0.f154691G.m102341Q0(this.f137098a.f40072m, user.m60124fp().profileSmall());
                }
            }
            String strM188518j = this.f137100c.m188518j();
            boolean zIsEmpty2 = TextUtils.isEmpty(strM188518j);
            FeedGroupDetailViewHolder feedGroupDetailViewHolder2 = this.f137098a;
            if (zIsEmpty2) {
                feedGroupDetailViewHolder2.f40077r.setVisibility(8);
            } else {
                feedGroupDetailViewHolder2.f40077r.setText(strM188518j);
            }
        }
        this.f137098a.f40066g.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.g4h
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
                this.f100566a.m157858u(appBarLayout, i2);
            }
        });
    }

    @Override // p149l.f4h
    /* JADX INFO: renamed from: j */
    public void mo119314j() {
        ArrayList arrayList = new ArrayList();
        this.f137103f = arrayList;
        arrayList.add(new n6h(this.f137100c.m188513e(), this.f137100c.m188514f(), this.f137105h));
        this.f137103f.add(new a6h(this.f137100c.m188513e(), this.f137100c.m188514f()));
        if (!nkg.m159858O() || !this.f137100c.m188510b().isGroupAnonymousType()) {
            this.f137103f.add(new q5h(this.f137100c.m188513e()));
        }
        if (!vwb.m200296J(this.f137100c.m188516h())) {
            this.f137103f.add(new w6h(this.f137100c.m188516h()));
        }
        if (nkg.m159858O() && !this.f137100c.m188510b().isGroupAnonymousType()) {
            this.f137103f.add(new vtg(this.f137100c.m188513e(), this.f137100c.m188510b().name, this.f137100c.m188514f()));
        }
        p4h p4hVar = new p4h(this.f137099b.getSupportFragmentManager(), this.f137099b, this.f137103f);
        this.f137102e = p4hVar;
        this.f137098a.f40082w.setAdapter(p4hVar);
        this.f137098a.f40082w.setOnPageChangeListener(this);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f137098a;
        feedGroupDetailViewHolder.f40081v.setupWithViewPager(feedGroupDetailViewHolder.f40082w);
        m157849r();
        zih zihVar = this.f137104g;
        if (zihVar != null) {
            zihVar.mo100336a(new ArrayList(this.f137103f), this.f137098a.f40082w);
        }
        onPageSelected(0);
    }

    @Override // p149l.f4h
    /* JADX INFO: renamed from: k */
    public void mo119315k() {
        xdl0.m208329E0(this.f137098a.f40064e, new View.OnClickListener() { // from class: l.h4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105837a.m157861x(view);
            }
        });
        m157850A(this.f137100c.m188521m());
    }

    @Override // p149l.f4h
    /* JADX INFO: renamed from: m */
    public void mo119317m() {
        xdl0.m208329E0(this.f137098a.f40083x, new View.OnClickListener() { // from class: l.i4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111450a.m157862y(view);
            }
        });
    }

    @Override // p149l.f4h
    /* JADX INFO: renamed from: n */
    public void mo119318n() {
        boolean zM200296J = vwb.m200296J(this.f137100c.m188515g());
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f137098a;
        if (zM200296J) {
            feedGroupDetailViewHolder.f40080u.setVisibility(8);
            this.f137098a.f40079t.setVisibility(8);
            return;
        }
        feedGroupDetailViewHolder.f40079t.setVisibility(0);
        this.f137098a.f40080u.setVisibility(0);
        TopicNearByHeaderView topicNearByHeaderView = new TopicNearByHeaderView(this.f137099b);
        this.f137098a.f40080u.addView(topicNearByHeaderView);
        topicNearByHeaderView.m66127f(this.f137100c.m188515g());
        topicNearByHeaderView.getmAdapter().m115416E(new C18621a());
    }

    @Override // p149l.f4h
    /* JADX INFO: renamed from: o */
    public void mo119319o() {
        xdl0.m208329E0(this.f137098a.f40062c, new View.OnClickListener() { // from class: l.j4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116190a.m157856s(view);
            }
        });
        this.f137098a.f40067h.postDelayed(new Runnable() { // from class: l.k4h
            @Override // java.lang.Runnable
            public final void run() {
                this.f121094a.m157857t();
            }
        }, 300L);
        qib0.f154691G.m102331L0(this.f137098a.f40060a, this.f137100c.m188512d());
        xdl0.m208325C0(this.f137098a.f40082w, xdl0.m208408w0());
        m157851B();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        this.f137106i = i;
        if (this.f137103f.size() > i) {
            boolean zMo95138d = this.f137103f.get(i).mo95138d();
            FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f137098a;
            if (!zMo95138d) {
                feedGroupDetailViewHolder.f40083x.setVisibility(8);
            } else {
                feedGroupDetailViewHolder.f40083x.setVisibility(0);
                p6j0.m167671e("e_moment_post", "p_circle_detail", j760.m140076a("circle_detail_tab", this.f137103f.get(i).mo95139e().getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m157856s(View view) {
        this.f137099b.m66873d2();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m157857t() {
        int top = this.f137098a.f40065f.getTop();
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f137098a;
        xdl0.m208325C0(feedGroupDetailViewHolder.f40060a, feedGroupDetailViewHolder.f40067h.getHeight() + top);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder2 = this.f137098a;
        xdl0.m208325C0(feedGroupDetailViewHolder2.f40061b, feedGroupDetailViewHolder2.f40067h.getHeight() + top);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m157858u(AppBarLayout appBarLayout, int i) {
        int i2 = -i;
        int iM186890d = t100.m186890d(44.0f);
        FeedGroupDetailViewHolder feedGroupDetailViewHolder = this.f137098a;
        if (i2 >= iM186890d) {
            feedGroupDetailViewHolder.f40063d.setVisibility(0);
        } else {
            feedGroupDetailViewHolder.f40063d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m157859v() {
        m157850A(false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m157860w() {
        m157850A(true);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m157861x(View view) {
        zvf0.m220396r("e_circle_join", "p_circle_detail");
        boolean zM188521m = this.f137100c.m188521m();
        r5h r5hVar = this.f137101d;
        if (zM188521m) {
            r5hVar.mo177944b(this.f137100c, new d30() { // from class: l.l4h
                @Override // p149l.d30
                public final void call() {
                    this.f126035a.m157859v();
                }
            });
        } else {
            r5hVar.mo177943a(this.f137100c, new d30() { // from class: l.m4h
                @Override // p149l.d30
                public final void call() {
                    this.f131297a.m157860w();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m157862y(View view) {
        p6j0.m167669c("e_moment_post", "p_circle_detail", j760.m140076a("album_post_source", "circle_detail"), j760.m140076a("circle_detail_tab", this.f137103f.get(this.f137106i).mo95139e().getValue()));
        Act act = this.f137099b;
        oe40.m163811M(act, new NewPostAct.C11244a(act).m62694e(nkg.m159858O() ? new ArrayList<>(this.f137100c.m188515g()) : vwb.m200324f0(new TopicMoment[0])).m62692c("nearby").m62693d(this.f137100c.m188513e()).m62695f(vwb.m200324f0(new Media[0])));
    }

    /* JADX INFO: renamed from: z */
    public final void m157863z(int i, View view) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        view.setBackground(shapeDrawable);
        view.setVisibility(0);
    }

    @Override // p149l.f4h
    /* JADX INFO: renamed from: h */
    public void mo119312h() {
    }

    /* JADX INFO: renamed from: l.n4h$b */
    public class C18622b implements TabLayout.OnTabSelectedListener {
        public C18622b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            n4h.this.m157855F(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) ((ViewGroup) ((ViewGroup) n4h.this.f137098a.f40081v.getChildAt(0)).getChildAt(tab.getPosition())).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(0));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
