package com.p046p1.mobile.putong.core.newui.messages;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.imagepipeline.common.Priority;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VPager;
import p149l.bkb0;
import p149l.dbl0;
import p149l.e30;
import p149l.e51;
import p149l.eb2;
import p149l.f6c0;
import p149l.ftd0;
import p149l.j760;
import p149l.lrb;
import p149l.myf;
import p149l.n56;
import p149l.osi0;
import p149l.qib0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zub;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationBoostDetailAct extends PutongAct implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: c */
    public VDraweeView f24650c;

    /* JADX INFO: renamed from: d */
    public ImageView f24651d;

    /* JADX INFO: renamed from: e */
    public ImageView f24652e;

    /* JADX INFO: renamed from: f */
    public TextView f24653f;

    /* JADX INFO: renamed from: g */
    public TextView f24654g;

    /* JADX INFO: renamed from: h */
    public VPager f24655h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f24656i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f24657j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f24658k;

    /* JADX INFO: renamed from: l */
    public TextView f24659l;

    /* JADX INFO: renamed from: m */
    public User f24660m;

    /* JADX INFO: renamed from: n */
    public final C8108a f24661n = new C8108a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct$a */
    public class C8108a extends eb2 {

        /* JADX INFO: renamed from: e */
        public boolean f24662e;

        /* JADX INFO: renamed from: f */
        public List<Media> f24663f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public Stack<View> f24664g = new Stack<>();

        /* JADX INFO: renamed from: h */
        public int f24665h = -1;

        /* JADX INFO: renamed from: i */
        public int f24666i = 0;

        public C8108a() {
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f24663f.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            int i = this.f24666i;
            if (i <= 0) {
                return super.getItemPosition(obj);
            }
            this.f24666i = i - 1;
            return -2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            this.f24662e = true;
            if (i == ConversationBoostDetailAct.this.f24655h.getCurrentItem()) {
                dbl0.m110646a(ConversationBoostDetailAct.this.f24655h, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f24664g.add((PictureView) obj);
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            PictureView pictureView = !this.f24664g.isEmpty() ? (PictureView) this.f24664g.pop() : (PictureView) ConversationBoostDetailAct.this.act.inflater().inflate(f6c0.f96120ze, viewGroup, false);
            pictureView.f28032A.setVisibility(8);
            pictureView.f28033B.setVisibility(8);
            pictureView.m44004j0(true, false);
            if (NullChecker.m81303a(pictureView.f28070a.getHierarchy())) {
                pictureView.f28070a.getHierarchy().m112046A(ConversationBoostDetailAct.this.act().getResources().getDrawable(x2c0.f189756T7));
                pictureView.f28070a.getHierarchy().m112050E(ConversationBoostDetailAct.this.act().getResources().getDrawable(x2c0.f189756T7));
            }
            pictureView.m43982J(true, false);
            pictureView.setAspectRateFitWidth(0.8f);
            pictureView.f28070a.getHierarchy().m112076w(ftd0.f99185i);
            pictureView.m44005k0();
            m40645r(pictureView, this.f24663f.get(i), 100);
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            return pictureView;
        }

        /* JADX INFO: renamed from: q */
        public int m40644q() {
            return ConversationBoostDetailAct.this.f24655h.getCurrentItem();
        }

        /* JADX INFO: renamed from: r */
        public void m40645r(PictureView pictureView, Media media, int i) {
            pictureView.m43994Y(media, i);
        }

        /* JADX INFO: renamed from: s */
        public void m40646s(List<Media> list) {
            if (list.equals(this.f24663f) && !this.f24662e) {
                m40647t(ConversationBoostDetailAct.this.f24660m, m40644q());
                return;
            }
            this.f24662e = false;
            this.f24666i = getCount();
            this.f24663f = list;
            ConversationBoostDetailAct.this.f24661n.notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: t */
        public void m40647t(User user, int i) {
            if (!NullChecker.m81303a(user) || i >= user.pictures.size() || this.f24665h == i) {
                return;
            }
            this.f24665h = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m40631a2(boolean z, j760 j760Var) {
        Priority priority;
        F f = j760Var.f116564a;
        String str = (!(f instanceof Video) || z) ? "profile" : "";
        Picture.ImageUri imageUriM220207f = zub.m220207f((Media) f);
        bkb0 bkb0Var = qib0.f154691G;
        if (((Integer) j760Var.f116565b).intValue() == 0) {
            priority = Priority.HIGH;
        } else {
            priority = ((Integer) j760Var.f116565b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
        }
        bkb0Var.m102376w0(imageUriM220207f, priority, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m40635g2(Bundle bundle) {
        m40638o2();
        qib0.f154691G.m102331L0(this.f24650c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkQyVTU2TzQ1RElNMlZQNkhYUUpXUDJJRVFaSlRZVDEyIiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzJ9.png");
        this.f24657j.m38899r();
        if (!NullChecker.m81303a(this.f24660m)) {
            lambda$debugItems$19();
        } else {
            this.f24657j.m38898q(this.f24660m, -1, false, false);
            this.f24658k.m39123W(this.f24660m, -1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m40636i2(View view) {
        lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: m2 */
    private void m40637m2(User user, final boolean z) {
        if (ConnectivityReceiver.m81286i()) {
            vwb.m200354z(vwb.m200344p0(user.pictures), new e30() { // from class: l.m56
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationBoostDetailAct.m40631a2(z, (j760) obj);
                }
            });
        } else {
            qib0.f154691G.m102376w0(zub.m220207f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
        }
    }

    /* JADX INFO: renamed from: o2 */
    private void m40638o2() {
        if (this.f24660m == null) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.i56
            @Override // java.lang.Runnable
            public final void run() {
                this.f111528a.m40640h2();
            }
        });
        this.f24655h.setAdapter(this.f24661n);
        this.f24661n.m40646s(this.f24660m.pictures);
        this.f24655h.m4185d(this);
        this.f24656i.setIndicatorCount(this.f24660m.pictures.size());
        if (this.f24660m.pictures.size() <= 1) {
            xdl0.m208344M(this.f24656i, false);
        }
        this.f24651d.setOnClickListener(new View.OnClickListener() { // from class: l.j56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116270a.m40636i2(view);
            }
        });
        zvf0.m220402x("e_spotlight_msg_button", pageId());
        this.f24659l.setOnClickListener(new View.OnClickListener() { // from class: l.k56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121146a.m40642l2(view);
            }
        });
    }

    /* JADX INFO: renamed from: e2 */
    public View m40639e2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n56.m157987b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m40640h2() {
        m40637m2(this.f24660m, false);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m40639e2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.h56
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105928a.m40635g2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m40641k2(Boolean bool) {
        m40643n2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m40642l2(View view) {
        zvf0.m220396r("e_spotlight_msg_button", pageId());
        if (myf.m157033M(CoreModule.f17545c.f19639e0.m169527p9())) {
            osi0.m165782f(R$string.f18821pc);
        } else {
            lrb.m151154f().m151163m(this.act, this.f24660m, new e30() { // from class: l.l56
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f126088a.m40641k2((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final void m40643n2() {
        this.f24659l.setTextColor(Color.parseColor("#4cf2aa7e"));
        this.f24659l.setBackgroundResource(x2c0.f190628up);
        this.f24659l.setText(this.act.getString(R$string.f18932t3));
        this.f24659l.setEnabled(false);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        dbl0.m110646a(this.f24655h, false);
        this.f24656i.m36955b(i);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_spotlight_profile";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        PutongAct.setLightStatusBar(getWindow(), 1024);
        this.f24660m = lrb.m151154f().m151156e();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            if (NullChecker.m81303a(this.f24660m)) {
                jSONObject.put("user_id", this.f24660m.f56011id);
            }
        } catch (JSONException unused) {
        }
        this.pageHelper.m109039o(jSONObject);
    }
}
