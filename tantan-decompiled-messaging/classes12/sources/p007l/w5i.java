package p007l;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.WealthLevelView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.putong.newui.view.VIPShimmerTag;
import l.e30;
import l.vwb;
import l.xdl0;
import p007l.zll;
import v.VDraweeView;
import v.VImage;
import v.VLinear_FillerMeasure;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class w5i<T extends zll> implements g6i {

    /* JADX INFO: renamed from: r */
    public static String f14412r = "photo_album_feed_";

    /* JADX INFO: renamed from: a */
    public xa70 f14413a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f14414b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f14415c;

    /* JADX INFO: renamed from: d */
    public TextView f14416d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f14417e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f14418f;

    /* JADX INFO: renamed from: g */
    public VImage f14419g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f14420h;

    /* JADX INFO: renamed from: i */
    public TextView f14421i;

    /* JADX INFO: renamed from: j */
    public ImageView f14422j;

    /* JADX INFO: renamed from: k */
    public VIPShimmerTag f14423k;

    /* JADX INFO: renamed from: l */
    public WealthLevelView f14424l;

    /* JADX INFO: renamed from: m */
    public VImage f14425m;

    /* JADX INFO: renamed from: n */
    public ODiamondTagLabel f14426n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f14427o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f14428p;

    /* JADX INFO: renamed from: q */
    public T f14429q;

    public w5i(T t, xa70 xa70Var) {
        this.f14429q = t;
        this.f14413a = xa70Var;
        mo9678p();
    }

    /* JADX INFO: renamed from: A */
    public final void m15697A(String str) {
        if (FeedModule.m1139F().userId().equals(m15707x().owner)) {
            m15699o().startActivity(vs0.m15565c(m15699o(), m15707x().owner, str));
        } else {
            vs0.m15571i(m15699o(), m15707x(), m15707x().owner, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[PHI: r1
      0x0097: PHI (r1v15 java.lang.String) = (r1v9 java.lang.String), (r1v10 java.lang.String) binds: [B:29:0x0095, B:32:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B */
    public final void m15698B(View view) {
        String strM10224d = this.f14413a.f14821b;
        if ("from_nearby_falls_feed".equals(strM10224d)) {
            strM10224d = "from_nearby_falls_feed_single";
        } else if ("from_nearby_focus".equals(this.f14413a.f14821b)) {
            strM10224d = "from_nearby_focus_single";
        } else if ("original_moments".equals(this.f14413a.f14821b)) {
            strM10224d = "original_personal_moments";
        } else if ("recommend_only_video".equals(this.f14413a.f14821b) || "recommend_multiple".equals(this.f14413a.f14821b)) {
            strM10224d = "recommend_falls_to_detail";
        } else if ("from_profile_opt".equals(this.f14413a.f14821b)) {
            strM10224d = "from_profile_opt_single";
        } else if ("from_topic_nearby_header".equals(this.f14413a.f14821b) || "from_topic_official".equals(this.f14413a.f14821b) || "from_no_topic_aggregation_list".equals(this.f14413a.f14821b) || "from_h5_topic_aggregation".equals(this.f14413a.f14821b)) {
            strM10224d = "from_topic_aggregation";
        } else {
            String str = "p_nearby_online";
            if ("p_nearby_online".equals(this.f14413a.f14821b)) {
                strM10224d = str;
            } else {
                str = "p_like";
                if ("p_like".equals(this.f14413a.f14821b)) {
                    strM10224d = str;
                } else if ("from_discover_dating".equals(this.f14413a.f14821b)) {
                    strM10224d = "p_discover_dating";
                } else if ("from_discover_discussion".equals(this.f14413a.f14821b)) {
                    strM10224d = "p_discover_discussion";
                } else if ("from_activity_tab_one".equals(this.f14413a.f14821b)) {
                    strM10224d = fm20.m10224d("from_activity_tab_one");
                } else if ("from_activity_tab_two".equals(this.f14413a.f14821b)) {
                    strM10224d = fm20.m10224d("from_activity_tab_two");
                }
            }
        }
        m15697A(strM10224d);
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: b */
    public boolean mo10419b(xa70 xa70Var) {
        if (xa70Var.f14825f != null) {
            return xa70Var.f14820a != null;
        }
        mo9679y();
        return false;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: c */
    public void mo10420c(xa70 xa70Var) {
        this.f14413a = xa70Var;
        m15701r();
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: e */
    public void mo9667e() {
        this.f14415c.setVisibility(8);
        this.f14414b.setVisibility(8);
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: f */
    public void mo9669f() {
        this.f14421i.setText(vs0.m15563a(m15707x(), this.f14413a.f14825f.name));
        this.f14421i.setTextColor(n8i.m12108b(this.f14413a.f14825f));
        this.f14423k.setVisibility(8);
        xdl0.M(this.f14426n, false);
        this.f14422j.setVisibility(0);
        kjb0.m11473y(m15699o(), this.f14413a.f14825f, this.f14422j, true, false);
        if (this.f14422j.getVisibility() == 0) {
            ImageView imageView = this.f14422j;
            vqg.m15472D0(imageView, imageView.getDrawable(), this.f14422j.getLayoutParams().height);
        }
        if (!"from_live_square_tab".equals(this.f14413a.f14821b) || this.f14413a.f14822c) {
            return;
        }
        for (int i = 0; i < this.f14420h.getChildCount(); i++) {
            if (this.f14420h.getChildAt(i).getId() == b5c0.f6036d1 || this.f14420h.getChildAt(i).getId() == b5c0.f5963G0) {
                this.f14420h.getChildAt(i).setVisibility(0);
            } else {
                this.f14420h.getChildAt(i).setVisibility(8);
            }
        }
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: h */
    public void mo9673h() {
        xdl0.M(this.f14419g, false);
        this.f14418f.setVisibility(0);
        vs0.m15567e(m15707x(), this.f14418f, this.f14413a.f14825f);
    }

    /* JADX INFO: renamed from: o */
    public Act m15699o() {
        return this.f14413a.f14826g;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo9678p();

    /* JADX INFO: renamed from: q */
    public void m15700q(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.u5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13551a.m15704u(view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m15701r() {
        if (this.f14413a.f14822c) {
            m15703t();
        } else {
            m15702s();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m15702s() {
        mo9680z();
    }

    /* JADX INFO: renamed from: t */
    public void m15703t() {
        vwb.z(vwb.f0(new View[]{this.f14417e, this.f14421i, this.f14418f}), new e30() { // from class: l.t5i
            public final void call(Object obj) {
                this.f13194a.m15706w((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m15704u(View view) {
        this.f14413a.f14831l.m17285d(view);
        m15698B(view);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m15705v(View view) {
        this.f14413a.f14831l.m17285d(view);
        m15697A("from_nearby_focus_single");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m15706w(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.v5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14072a.m15705v(view2);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public Moment m15707x() {
        return this.f14413a.f14820a;
    }

    /* JADX INFO: renamed from: y */
    public void mo9679y() {
        this.f14418f.setVisibility(4);
        this.f14421i.setText("");
        this.f14415c.setVisibility(8);
    }

    /* JADX INFO: renamed from: z */
    public void mo9680z() {
        vwb.z(vwb.f0(new View[]{this.f14417e, this.f14421i, this.f14418f}), new e30() { // from class: l.s5i
            public final void call(Object obj) {
                this.f12799a.m15700q((View) obj);
            }
        });
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: j */
    public void mo9676j() {
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: d */
    public void mo10421d(xa70 xa70Var) {
    }
}
