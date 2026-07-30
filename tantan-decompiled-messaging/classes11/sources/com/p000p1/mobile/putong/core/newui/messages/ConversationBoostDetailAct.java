package com.p000p1.mobile.putong.core.newui.messages;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.imagepipeline.common.Priority;
import com.p000p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p000p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import l.bkb0;
import l.dbl0;
import l.e30;
import l.e51;
import l.eb2;
import l.f6c0;
import l.ftd0;
import l.j760;
import l.n56;
import l.osi0;
import l.qib0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p009l.lrb;
import p009l.myf;
import p009l.zub;
import v.VDraweeView;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationBoostDetailAct extends PutongAct implements ViewPager.j {

    /* JADX INFO: renamed from: c */
    public VDraweeView f3428c;

    /* JADX INFO: renamed from: d */
    public ImageView f3429d;

    /* JADX INFO: renamed from: e */
    public ImageView f3430e;

    /* JADX INFO: renamed from: f */
    public TextView f3431f;

    /* JADX INFO: renamed from: g */
    public TextView f3432g;

    /* JADX INFO: renamed from: h */
    public VPager f3433h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f3434i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f3435j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f3436k;

    /* JADX INFO: renamed from: l */
    public TextView f3437l;

    /* JADX INFO: renamed from: m */
    public User f3438m;

    /* JADX INFO: renamed from: n */
    public final C0272a f3439n = new C0272a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct$a */
    public class C0272a extends eb2 {

        /* JADX INFO: renamed from: e */
        public boolean f3440e;

        /* JADX INFO: renamed from: f */
        public List<Media> f3441f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public Stack<View> f3442g = new Stack<>();

        /* JADX INFO: renamed from: h */
        public int f3443h = -1;

        /* JADX INFO: renamed from: i */
        public int f3444i = 0;

        public C0272a() {
        }

        public int getCount() {
            return this.f3441f.size();
        }

        public int getItemPosition(Object obj) {
            int i = this.f3444i;
            if (i <= 0) {
                return super/*l.w660*/.getItemPosition(obj);
            }
            this.f3444i = i - 1;
            return -2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m4737o(ViewGroup viewGroup, int i, Object obj) {
            this.f3440e = true;
            if (i == ConversationBoostDetailAct.this.f3433h.getCurrentItem()) {
                dbl0.a(ConversationBoostDetailAct.this.f3433h, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f3442g.add((PictureView) obj);
            }
        }

        /* JADX INFO: renamed from: p */
        public Object m4738p(ViewGroup viewGroup, int i) {
            PictureView pictureViewInflate = !this.f3442g.isEmpty() ? (PictureView) this.f3442g.pop() : ((Act) ConversationBoostDetailAct.this).act.inflater().inflate(f6c0.ze, viewGroup, false);
            pictureViewInflate.A.setVisibility(8);
            pictureViewInflate.B.setVisibility(8);
            pictureViewInflate.j0(true, false);
            if (NullChecker.a(pictureViewInflate.a.getHierarchy())) {
                pictureViewInflate.a.getHierarchy().A(ConversationBoostDetailAct.this.act().getResources().getDrawable(x2c0.T7));
                pictureViewInflate.a.getHierarchy().E(ConversationBoostDetailAct.this.act().getResources().getDrawable(x2c0.T7));
            }
            pictureViewInflate.J(true, false);
            pictureViewInflate.setAspectRateFitWidth(0.8f);
            pictureViewInflate.a.getHierarchy().w(ftd0.i);
            pictureViewInflate.k0();
            m4740r(pictureViewInflate, this.f3441f.get(i), 100);
            pictureViewInflate.setTag(Integer.valueOf(i));
            pictureViewInflate.setPivotX(0.0f);
            pictureViewInflate.setPivotY(0.0f);
            viewGroup.addView(pictureViewInflate);
            return pictureViewInflate;
        }

        /* JADX INFO: renamed from: q */
        public int m4739q() {
            return ConversationBoostDetailAct.this.f3433h.getCurrentItem();
        }

        /* JADX INFO: renamed from: r */
        public void m4740r(PictureView pictureView, Media media, int i) {
            pictureView.Y(media, i);
        }

        /* JADX INFO: renamed from: s */
        public void m4741s(List<Media> list) {
            if (list.equals(this.f3441f) && !this.f3440e) {
                m4742t(ConversationBoostDetailAct.this.f3438m, m4739q());
                return;
            }
            this.f3440e = false;
            this.f3444i = getCount();
            this.f3441f = list;
            ConversationBoostDetailAct.this.f3439n.notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: t */
        public void m4742t(User user, int i) {
            if (!NullChecker.a(user) || i >= user.pictures.size() || this.f3443h == i) {
                return;
            }
            this.f3443h = i;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m4724a2(boolean z, j760 j760Var) {
        Priority priority;
        Object obj = j760Var.a;
        String str = (!(obj instanceof Video) || z) ? "profile" : "";
        Picture.ImageUri imageUriM25966f = zub.m25966f((Media) obj);
        bkb0 bkb0Var = qib0.G;
        if (((Integer) j760Var.b).intValue() == 0) {
            priority = Priority.HIGH;
        } else {
            priority = ((Integer) j760Var.b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
        }
        bkb0Var.w0(imageUriM25966f, priority, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m4728g2(Bundle bundle) {
        m4731o2();
        qib0.G.L0(this.f3428c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkQyVTU2TzQ1RElNMlZQNkhYUUpXUDJJRVFaSlRZVDEyIiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzJ9.png");
        this.f3435j.m2906r();
        if (!NullChecker.a(this.f3438m)) {
            finish();
        } else {
            this.f3435j.m2905q(this.f3438m, -1, false, false);
            this.f3436k.m3138W(this.f3438m, -1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m4729i2(View view) {
        finish();
    }

    /* JADX INFO: renamed from: m2 */
    private void m4730m2(User user, final boolean z) {
        if (ConnectivityReceiver.i()) {
            vwb.z(vwb.p0(user.pictures), new e30() { // from class: l.m56
                public final void call(Object obj) {
                    ConversationBoostDetailAct.m4724a2(z, (j760) obj);
                }
            });
        } else {
            qib0.G.w0(zub.m25966f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
        }
    }

    /* JADX INFO: renamed from: o2 */
    private void m4731o2() {
        if (this.f3438m == null) {
            return;
        }
        e51.y(new Runnable() { // from class: l.i56
            @Override // java.lang.Runnable
            public final void run() {
                this.f14400a.m4733h2();
            }
        });
        this.f3433h.setAdapter(this.f3439n);
        this.f3439n.m4741s(this.f3438m.pictures);
        this.f3433h.d(this);
        this.f3434i.setIndicatorCount(this.f3438m.pictures.size());
        if (this.f3438m.pictures.size() <= 1) {
            xdl0.M(this.f3434i, false);
        }
        this.f3429d.setOnClickListener(new View.OnClickListener() { // from class: l.j56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14941a.m4729i2(view);
            }
        });
        zvf0.x("e_spotlight_msg_button", pageId());
        this.f3437l.setOnClickListener(new View.OnClickListener() { // from class: l.k56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15415a.m4735l2(view);
            }
        });
    }

    /* JADX INFO: renamed from: e2 */
    public View m4732e2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n56.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m4733h2() {
        m4730m2(this.f3438m, false);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m4732e2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.h56
            public final void call(Object obj) {
                this.f13867a.m4728g2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m4734k2(Boolean bool) {
        m4736n2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m4735l2(View view) {
        zvf0.r("e_spotlight_msg_button", pageId());
        if (myf.m18691M(CoreModule.c.e0.p9())) {
            osi0.f(R.string.pc);
        } else {
            lrb.m17999f().m18008m(((Act) this).act, this.f3438m, new e30() { // from class: l.l56
                public final void call(Object obj) {
                    this.f15945a.m4734k2((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final void m4736n2() {
        this.f3437l.setTextColor(Color.parseColor("#4cf2aa7e"));
        this.f3437l.setBackgroundResource(x2c0.up);
        this.f3437l.setText(((Act) this).act.getString(R.string.t3));
        this.f3437l.setEnabled(false);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        dbl0.a(this.f3433h, false);
        this.f3434i.m922b(i);
    }

    public String pageId() {
        return "p_spotlight_profile";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        PutongAct.setLightStatusBar(getWindow(), 1024);
        this.f3438m = lrb.m17999f().m18001e();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", "active");
            if (NullChecker.a(this.f3438m)) {
                jSONObject.put("user_id", ((DbObject) this.f3438m).id);
            }
        } catch (JSONException unused) {
        }
        ((PutongAct) this).pageHelper.o(jSONObject);
    }
}
