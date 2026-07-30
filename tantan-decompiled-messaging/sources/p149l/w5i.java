package p149l;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.WealthLevelView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.newui.view.VIPShimmerTag;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p149l.zll;

/* JADX INFO: loaded from: classes12.dex */
public abstract class w5i<T extends zll> implements g6i {

    /* JADX INFO: renamed from: r */
    public static String f184683r = "photo_album_feed_";

    /* JADX INFO: renamed from: a */
    public xa70 f184684a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f184685b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f184686c;

    /* JADX INFO: renamed from: d */
    public TextView f184687d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f184688e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f184689f;

    /* JADX INFO: renamed from: g */
    public VImage f184690g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f184691h;

    /* JADX INFO: renamed from: i */
    public TextView f184692i;

    /* JADX INFO: renamed from: j */
    public ImageView f184693j;

    /* JADX INFO: renamed from: k */
    public VIPShimmerTag f184694k;

    /* JADX INFO: renamed from: l */
    public WealthLevelView f184695l;

    /* JADX INFO: renamed from: m */
    public VImage f184696m;

    /* JADX INFO: renamed from: n */
    public ODiamondTagLabel f184697n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f184698o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f184699p;

    /* JADX INFO: renamed from: q */
    public T f184700q;

    public w5i(T t, xa70 xa70Var) {
        this.f184700q = t;
        this.f184684a = xa70Var;
        mo115061p();
    }

    /* JADX INFO: renamed from: A */
    public final void m201622A(String str) {
        if (FeedModule.m60221F().userId().equals(m201632x().owner)) {
            m201624o().startActivity(vs0.m199797c(m201624o(), m201632x().owner, str));
        } else {
            vs0.m199803i(m201624o(), m201632x(), m201632x().owner, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[PHI: r1
      0x0097: PHI (r1v15 java.lang.String) = (r1v9 java.lang.String), (r1v10 java.lang.String) binds: [B:29:0x0095, B:32:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B */
    public final void m201623B(View view) {
        String strM122121d = this.f184684a.f191690b;
        if ("from_nearby_falls_feed".equals(strM122121d)) {
            strM122121d = "from_nearby_falls_feed_single";
        } else if ("from_nearby_focus".equals(this.f184684a.f191690b)) {
            strM122121d = "from_nearby_focus_single";
        } else if ("original_moments".equals(this.f184684a.f191690b)) {
            strM122121d = "original_personal_moments";
        } else if ("recommend_only_video".equals(this.f184684a.f191690b) || "recommend_multiple".equals(this.f184684a.f191690b)) {
            strM122121d = "recommend_falls_to_detail";
        } else if ("from_profile_opt".equals(this.f184684a.f191690b)) {
            strM122121d = "from_profile_opt_single";
        } else if ("from_topic_nearby_header".equals(this.f184684a.f191690b) || "from_topic_official".equals(this.f184684a.f191690b) || "from_no_topic_aggregation_list".equals(this.f184684a.f191690b) || "from_h5_topic_aggregation".equals(this.f184684a.f191690b)) {
            strM122121d = "from_topic_aggregation";
        } else {
            String str = "p_nearby_online";
            if ("p_nearby_online".equals(this.f184684a.f191690b)) {
                strM122121d = str;
            } else {
                str = "p_like";
                if ("p_like".equals(this.f184684a.f191690b)) {
                    strM122121d = str;
                } else if ("from_discover_dating".equals(this.f184684a.f191690b)) {
                    strM122121d = "p_discover_dating";
                } else if ("from_discover_discussion".equals(this.f184684a.f191690b)) {
                    strM122121d = "p_discover_discussion";
                } else if ("from_activity_tab_one".equals(this.f184684a.f191690b)) {
                    strM122121d = fm20.m122121d("from_activity_tab_one");
                } else if ("from_activity_tab_two".equals(this.f184684a.f191690b)) {
                    strM122121d = fm20.m122121d("from_activity_tab_two");
                }
            }
        }
        m201622A(strM122121d);
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: b */
    public boolean mo124591b(xa70 xa70Var) {
        if (xa70Var.f191694f != null) {
            return xa70Var.f191689a != null;
        }
        mo115062y();
        return false;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: c */
    public void mo124592c(xa70 xa70Var) {
        this.f184684a = xa70Var;
        m201626r();
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: e */
    public void mo115050e() {
        this.f184686c.setVisibility(8);
        this.f184685b.setVisibility(8);
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: f */
    public void mo115052f() {
        this.f184692i.setText(vs0.m199795a(m201632x(), this.f184684a.f191694f.name));
        this.f184692i.setTextColor(n8i.m158495b(this.f184684a.f191694f));
        this.f184694k.setVisibility(8);
        xdl0.m208344M(this.f184697n, false);
        this.f184693j.setVisibility(0);
        kjb0.m146214y(m201624o(), this.f184684a.f191694f, this.f184693j, true, false);
        if (this.f184693j.getVisibility() == 0) {
            ImageView imageView = this.f184693j;
            vqg.m199502D0(imageView, imageView.getDrawable(), this.f184693j.getLayoutParams().height);
        }
        if (!"from_live_square_tab".equals(this.f184684a.f191690b) || this.f184684a.f191691c) {
            return;
        }
        for (int i = 0; i < this.f184691h.getChildCount(); i++) {
            if (this.f184691h.getChildAt(i).getId() == b5c0.f73555d1 || this.f184691h.getChildAt(i).getId() == b5c0.f73482G0) {
                this.f184691h.getChildAt(i).setVisibility(0);
            } else {
                this.f184691h.getChildAt(i).setVisibility(8);
            }
        }
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: h */
    public void mo115056h() {
        xdl0.m208344M(this.f184690g, false);
        this.f184689f.setVisibility(0);
        vs0.m199799e(m201632x(), this.f184689f, this.f184684a.f191694f);
    }

    /* JADX INFO: renamed from: o */
    public Act m201624o() {
        return this.f184684a.f191695g;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo115061p();

    /* JADX INFO: renamed from: q */
    public void m201625q(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.u5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f174711a.m201629u(view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m201626r() {
        if (this.f184684a.f191691c) {
            m201628t();
        } else {
            m201627s();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m201627s() {
        mo115063z();
    }

    /* JADX INFO: renamed from: t */
    public void m201628t() {
        vwb.m200354z(vwb.m200324f0(this.f184688e, this.f184692i, this.f184689f), new e30() { // from class: l.t5i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167827a.m201631w((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m201629u(View view) {
        this.f184684a.f191700l.m217731d(view);
        m201623B(view);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m201630v(View view) {
        this.f184684a.f191700l.m217731d(view);
        m201622A("from_nearby_focus_single");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m201631w(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.v5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f180052a.m201630v(view2);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public Moment m201632x() {
        return this.f184684a.f191689a;
    }

    /* JADX INFO: renamed from: y */
    public void mo115062y() {
        this.f184689f.setVisibility(4);
        this.f184692i.setText("");
        this.f184686c.setVisibility(8);
    }

    /* JADX INFO: renamed from: z */
    public void mo115063z() {
        vwb.m200354z(vwb.m200324f0(this.f184688e, this.f184692i, this.f184689f), new e30() { // from class: l.s5i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162554a.m201625q((View) obj);
            }
        });
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: j */
    public void mo115059j() {
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: d */
    public void mo124593d(xa70 xa70Var) {
    }
}
