package p153l;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.WealthLevelView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.newui.view.VIPShimmerTag;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p153l.lol;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l7i<T extends lol> implements v7i {

    /* JADX INFO: renamed from: r */
    public static String f130346r = "photo_album_feed_";

    /* JADX INFO: renamed from: a */
    public dj70 f130347a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f130348b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f130349c;

    /* JADX INFO: renamed from: d */
    public TextView f130350d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f130351e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f130352f;

    /* JADX INFO: renamed from: g */
    public VImage f130353g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f130354h;

    /* JADX INFO: renamed from: i */
    public TextView f130355i;

    /* JADX INFO: renamed from: j */
    public ImageView f130356j;

    /* JADX INFO: renamed from: k */
    public VIPShimmerTag f130357k;

    /* JADX INFO: renamed from: l */
    public WealthLevelView f130358l;

    /* JADX INFO: renamed from: m */
    public VImage f130359m;

    /* JADX INFO: renamed from: n */
    public ODiamondTagLabel f130360n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f130361o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f130362p;

    /* JADX INFO: renamed from: q */
    public T f130363q;

    public l7i(T t, dj70 dj70Var) {
        this.f130363q = t;
        this.f130347a = dj70Var;
        mo153131p();
    }

    /* JADX INFO: renamed from: A */
    public final void m153127A(String str) {
        if (FeedModule.m61405F().userId().equals(m153139x().owner)) {
            m153130o().startActivity(at0.m100009c(m153130o(), m153139x().owner, str));
        } else {
            at0.m100015i(m153130o(), m153139x(), m153139x().owner, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[PHI: r1
      0x0097: PHI (r1v15 java.lang.String) = (r1v9 java.lang.String), (r1v10 java.lang.String) binds: [B:29:0x0095, B:32:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B */
    public final void m153128B(View view) {
        String strM173809d = this.f130347a.f88792b;
        if ("from_nearby_falls_feed".equals(strM173809d)) {
            strM173809d = "from_nearby_falls_feed_single";
        } else if ("from_nearby_focus".equals(this.f130347a.f88792b)) {
            strM173809d = "from_nearby_focus_single";
        } else if ("original_moments".equals(this.f130347a.f88792b)) {
            strM173809d = "original_personal_moments";
        } else if ("recommend_only_video".equals(this.f130347a.f88792b) || "recommend_multiple".equals(this.f130347a.f88792b)) {
            strM173809d = "recommend_falls_to_detail";
        } else if ("from_profile_opt".equals(this.f130347a.f88792b)) {
            strM173809d = "from_profile_opt_single";
        } else if ("from_topic_nearby_header".equals(this.f130347a.f88792b) || "from_topic_official".equals(this.f130347a.f88792b) || "from_no_topic_aggregation_list".equals(this.f130347a.f88792b) || "from_h5_topic_aggregation".equals(this.f130347a.f88792b)) {
            strM173809d = "from_topic_aggregation";
        } else {
            String str = "p_nearby_online";
            if ("p_nearby_online".equals(this.f130347a.f88792b)) {
                strM173809d = str;
            } else {
                str = "p_like";
                if ("p_like".equals(this.f130347a.f88792b)) {
                    strM173809d = str;
                } else if ("from_discover_dating".equals(this.f130347a.f88792b)) {
                    strM173809d = "p_discover_dating";
                } else if ("from_discover_discussion".equals(this.f130347a.f88792b)) {
                    strM173809d = "p_discover_discussion";
                } else if ("from_activity_tab_one".equals(this.f130347a.f88792b)) {
                    strM173809d = pu20.m173809d("from_activity_tab_one");
                } else if ("from_activity_tab_two".equals(this.f130347a.f88792b)) {
                    strM173809d = pu20.m173809d("from_activity_tab_two");
                }
            }
        }
        m153127A(strM173809d);
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: b */
    public boolean mo96457b(dj70 dj70Var) {
        if (dj70Var.f88796f != null) {
            return dj70Var.f88791a != null;
        }
        mo153140y();
        return false;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: c */
    public void mo96458c(dj70 dj70Var) {
        this.f130347a = dj70Var;
        m153133r();
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: e */
    public void mo153129e() {
        this.f130349c.setVisibility(8);
        this.f130348b.setVisibility(8);
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: f */
    public void mo96460f() {
        this.f130355i.setText(at0.m100007a(m153139x(), this.f130347a.f88796f.name));
        this.f130355i.setTextColor(cai.m108494b(this.f130347a.f88796f));
        this.f130357k.setVisibility(8);
        bnl0.m105524M(this.f130360n, false);
        this.f130356j.setVisibility(0);
        orb0.m168908y(m153130o(), this.f130347a.f88796f, this.f130356j, true, false);
        if (this.f130356j.getVisibility() == 0) {
            ImageView imageView = this.f130356j;
            ksg.m151161D0(imageView, imageView.getDrawable(), this.f130356j.getLayoutParams().height);
        }
        if (!"from_live_square_tab".equals(this.f130347a.f88792b) || this.f130347a.f88793c) {
            return;
        }
        for (int i = 0; i < this.f130354h.getChildCount(); i++) {
            if (this.f130354h.getChildAt(i).getId() == hdc0.f108908d1 || this.f130354h.getChildAt(i).getId() == hdc0.f108835G0) {
                this.f130354h.getChildAt(i).setVisibility(0);
            } else {
                this.f130354h.getChildAt(i).setVisibility(8);
            }
        }
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: h */
    public void mo96461h() {
        bnl0.m105524M(this.f130353g, false);
        this.f130352f.setVisibility(0);
        at0.m100011e(m153139x(), this.f130352f, this.f130347a.f88796f);
    }

    /* JADX INFO: renamed from: o */
    public Act m153130o() {
        return this.f130347a.f88797g;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo153131p();

    /* JADX INFO: renamed from: q */
    public void m153132q(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.j7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f118688a.m153136u(view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m153133r() {
        if (this.f130347a.f88793c) {
            m153135t();
        } else {
            m153134s();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m153134s() {
        mo153141z();
    }

    /* JADX INFO: renamed from: t */
    public void m153135t() {
        jyb.m147537z(jyb.m147507f0(this.f130351e, this.f130355i, this.f130352f), new y20() { // from class: l.i7i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113262a.m153138w((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m153136u(View view) {
        this.f130347a.f88802l.m125790d(view);
        m153128B(view);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m153137v(View view) {
        this.f130347a.f88802l.m125790d(view);
        m153127A("from_nearby_focus_single");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m153138w(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.k7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124269a.m153137v(view2);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public Moment m153139x() {
        return this.f130347a.f88791a;
    }

    /* JADX INFO: renamed from: y */
    public void mo153140y() {
        this.f130352f.setVisibility(4);
        this.f130355i.setText("");
        this.f130349c.setVisibility(8);
    }

    /* JADX INFO: renamed from: z */
    public void mo153141z() {
        jyb.m147537z(jyb.m147507f0(this.f130351e, this.f130355i, this.f130352f), new y20() { // from class: l.h7i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108129a.m153132q((View) obj);
            }
        });
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: j */
    public void mo96462j() {
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: d */
    public void mo96459d(dj70 dj70Var) {
    }
}
