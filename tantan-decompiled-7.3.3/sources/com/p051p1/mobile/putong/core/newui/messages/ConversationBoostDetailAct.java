package com.p051p1.mobile.putong.core.newui.messages;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.imagepipeline.common.Priority;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VPager;
import p153l.a0g;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fsb0;
import p153l.h1e0;
import p153l.hkl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.kec0;
import p153l.l51;
import p153l.lb2;
import p153l.nwb;
import p153l.pf60;
import p153l.r1j0;
import p153l.s66;
import p153l.uqb0;
import p153l.y20;
import p153l.zsb;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationBoostDetailAct extends PutongAct implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: c */
    public VDraweeView f25392c;

    /* JADX INFO: renamed from: d */
    public ImageView f25393d;

    /* JADX INFO: renamed from: e */
    public ImageView f25394e;

    /* JADX INFO: renamed from: f */
    public TextView f25395f;

    /* JADX INFO: renamed from: g */
    public TextView f25396g;

    /* JADX INFO: renamed from: h */
    public VPager f25397h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f25398i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f25399j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f25400k;

    /* JADX INFO: renamed from: l */
    public TextView f25401l;

    /* JADX INFO: renamed from: m */
    public User f25402m;

    /* JADX INFO: renamed from: n */
    public final C8259a f25403n = new C8259a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct$a */
    public class C8259a extends lb2 {

        /* JADX INFO: renamed from: e */
        public boolean f25404e;

        /* JADX INFO: renamed from: f */
        public List<Media> f25405f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public Stack<View> f25406g = new Stack<>();

        /* JADX INFO: renamed from: h */
        public int f25407h = -1;

        /* JADX INFO: renamed from: i */
        public int f25408i = 0;

        public C8259a() {
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f25405f.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            int i = this.f25408i;
            if (i <= 0) {
                return super.getItemPosition(obj);
            }
            this.f25408i = i - 1;
            return -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            this.f25404e = true;
            if (i == ConversationBoostDetailAct.this.f25397h.getCurrentItem()) {
                hkl0.m135638a(ConversationBoostDetailAct.this.f25397h, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f25406g.add((PictureView) obj);
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            PictureView pictureView = !this.f25406g.isEmpty() ? (PictureView) this.f25406g.pop() : (PictureView) ConversationBoostDetailAct.this.act.inflater().inflate(kec0.f125431Ge, viewGroup, false);
            pictureView.f28880A.setVisibility(8);
            pictureView.f28881B.setVisibility(8);
            pictureView.m45187j0(true, false);
            if (NullChecker.m82486a(pictureView.f28918a.getHierarchy())) {
                pictureView.f28918a.getHierarchy().m207038A(ConversationBoostDetailAct.this.act().getResources().getDrawable(dbc0.f86624U7));
                pictureView.f28918a.getHierarchy().m207042E(ConversationBoostDetailAct.this.act().getResources().getDrawable(dbc0.f86624U7));
            }
            pictureView.m45165J(true, false);
            pictureView.setAspectRateFitWidth(0.8f);
            pictureView.f28918a.getHierarchy().m207062w(h1e0.f107452i);
            pictureView.m45188k0();
            m41656r(pictureView, this.f25405f.get(i), 100);
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            return pictureView;
        }

        /* JADX INFO: renamed from: q */
        public int m41655q() {
            return ConversationBoostDetailAct.this.f25397h.getCurrentItem();
        }

        /* JADX INFO: renamed from: r */
        public void m41656r(PictureView pictureView, Media media, int i) {
            pictureView.m45177Y(media, i);
        }

        /* JADX INFO: renamed from: s */
        public void m41657s(List<Media> list) {
            if (list.equals(this.f25405f) && !this.f25404e) {
                m41658t(ConversationBoostDetailAct.this.f25402m, m41655q());
                return;
            }
            this.f25404e = false;
            this.f25408i = getCount();
            this.f25405f = list;
            ConversationBoostDetailAct.this.f25403n.notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: t */
        public void m41658t(User user, int i) {
            if (!NullChecker.m82486a(user) || i >= user.pictures.size() || this.f25407h == i) {
                return;
            }
            this.f25407h = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m41642b2(boolean z, pf60 pf60Var) {
        Priority priority;
        F f = pf60Var.f152156a;
        String str = (!(f instanceof Video) || z) ? "profile" : "";
        Picture.ImageUri imageUriM164968f = nwb.m164968f((Media) f);
        fsb0 fsb0Var = uqb0.f180374G;
        if (((Integer) pf60Var.f152157b).intValue() == 0) {
            priority = Priority.HIGH;
        } else {
            priority = ((Integer) pf60Var.f152157b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
        }
        fsb0Var.m127159w0(imageUriM164968f, priority, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m41646h2(Bundle bundle) {
        m41649p2();
        uqb0.f180374G.m127115L0(this.f25392c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkQyVTU2TzQ1RElNMlZQNkhYUUpXUDJJRVFaSlRZVDEyIiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzJ9.png");
        this.f25399j.m39902r();
        if (!NullChecker.m82486a(this.f25402m)) {
            lambda$debugItems$19();
        } else {
            this.f25399j.m39901q(this.f25402m, -1, false, false);
            this.f25400k.m40126W(this.f25402m, -1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m41647k2(View view) {
        lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n2 */
    private void m41648n2(User user, final boolean z) {
        if (ConnectivityReceiver.m82469i()) {
            jyb.m147537z(jyb.m147527p0(user.pictures), new y20() { // from class: l.r66
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationBoostDetailAct.m41642b2(z, (pf60) obj);
                }
            });
        } else {
            uqb0.f180374G.m127159w0(nwb.m164968f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
        }
    }

    /* JADX INFO: renamed from: p2 */
    private void m41649p2() {
        if (this.f25402m == null) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.n66
            @Override // java.lang.Runnable
            public final void run() {
                this.f140431a.m41651i2();
            }
        });
        this.f25397h.setAdapter(this.f25403n);
        this.f25403n.m41657s(this.f25402m.pictures);
        this.f25397h.m4187d(this);
        this.f25398i.setIndicatorCount(this.f25402m.pictures.size());
        if (this.f25402m.pictures.size() <= 1) {
            bnl0.m105524M(this.f25398i, false);
        }
        this.f25393d.setOnClickListener(new View.OnClickListener() { // from class: l.o66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145141a.m41647k2(view);
            }
        });
        i4g0.m138526x("e_spotlight_msg_button", pageId());
        this.f25401l.setOnClickListener(new View.OnClickListener() { // from class: l.p66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150738a.m41653m2(view);
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public View m41650g2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s66.m184846b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m41651i2() {
        m41648n2(this.f25402m, false);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m41650g2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.m66
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134971a.m41646h2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m41652l2(Boolean bool) {
        m41654o2();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m41653m2(View view) {
        i4g0.m138520r("e_spotlight_msg_button", pageId());
        if (a0g.m95357M(CoreModule.f18264c.f20381e0.m116600p9())) {
            r1j0.m179419f(R$string.f18422Ec);
        } else {
            zsb.m221313f().m221322m(this.act, this.f25402m, new y20() { // from class: l.q66
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155784a.m41652l2((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m41654o2() {
        this.f25401l.setTextColor(Color.parseColor("#4cf2aa7e"));
        this.f25401l.setBackgroundResource(dbc0.f87097iq);
        this.f25401l.setText(this.act.getString(R$string.f19728v3));
        this.f25401l.setEnabled(false);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        hkl0.m135638a(this.f25397h, false);
        this.f25398i.m37958b(i);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_spotlight_profile";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        PutongAct.setLightStatusBar(getWindow(), 1024);
        this.f25402m = zsb.m221313f().m221315e();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            if (NullChecker.m82486a(this.f25402m)) {
                jSONObject.put("user_id", this.f25402m.f56859id);
            }
        } catch (JSONException unused) {
        }
        this.pageHelper.m152780o(jSONObject);
    }
}
