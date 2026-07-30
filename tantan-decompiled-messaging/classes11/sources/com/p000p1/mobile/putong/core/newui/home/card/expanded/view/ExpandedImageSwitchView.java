package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.p000p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.qib0;
import l.t100;
import l.upa;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p009l.sfh0;
import p009l.zub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedImageSwitchView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public NewPictureContainerIndicator f1388a;

    /* JADX INFO: renamed from: b */
    public View f1389b;

    /* JADX INFO: renamed from: c */
    public View f1390c;

    /* JADX INFO: renamed from: d */
    public View f1391d;

    /* JADX INFO: renamed from: e */
    public int f1392e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f1393f;

    /* JADX INFO: renamed from: g */
    @ColorInt
    public int f1394g;

    /* JADX INFO: renamed from: h */
    @ColorInt
    public int f1395h;

    /* JADX INFO: renamed from: i */
    @ColorInt
    public int f1396i;

    /* JADX INFO: renamed from: j */
    public List<Media> f1397j;

    /* JADX INFO: renamed from: k */
    public boolean f1398k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0131b f1399l;

    /* JADX INFO: renamed from: m */
    public String f1400m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView$a */
    public class ViewOnClickListenerC0130a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0131b f1401a;

        public ViewOnClickListenerC0130a(InterfaceC0131b interfaceC0131b) {
            this.f1401a = interfaceC0131b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1401a.mo2312b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView$b */
    public interface InterfaceC0131b {
        /* JADX INFO: renamed from: a */
        default boolean m2311a(int i) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        default void mo2312b() {
        }

        /* JADX INFO: renamed from: c */
        void mo2313c(boolean z);

        /* JADX INFO: renamed from: d */
        void mo2314d(int i, Media media, boolean z);

        /* JADX INFO: renamed from: e */
        boolean mo2315e(Media media);

        /* JADX INFO: renamed from: f */
        void mo2316f(int i, boolean z);
    }

    public ExpandedImageSwitchView(Context context) {
        super(context);
        this.f1393f = Color.parseColor("#33ffffff");
        this.f1394g = -1;
        this.f1395h = 0;
        this.f1396i = 0;
        this.f1400m = "default";
        m2301d();
    }

    private Act getAct() {
        return xdl0.D(getContext());
    }

    private String getPageId() {
        if ((getAct() instanceof NewMainAct) && ExpandedCardStyleHelper.m2064o().m2077s()) {
            return "p_suggest_user_profile_info_view";
        }
        if (getAct() instanceof NewMainAct) {
            return "p_suggest_users_home_view";
        }
        return getAct() instanceof ProfileAct ? "p_suggest_user_profile_info_view" : getAct().pageId();
    }

    /* JADX INFO: renamed from: c */
    public List<Media> m2300c(sfh0 sfh0Var) {
        if ("default".equals(this.f1400m)) {
            return sfh0Var.m22132a();
        }
        return "dynamics_image_witch_type".equals(this.f1400m) ? sfh0Var.m22133b() : new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m2301d() {
        if (upa.N3()) {
            m2302e();
            return;
        }
        if (getChildCount() == 0) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            addView(linearLayout);
            this.f1389b = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            linearLayout.addView(this.f1389b, layoutParams);
            this.f1390c = new View(getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams2.weight = 1.0f;
            linearLayout.addView(this.f1390c, layoutParams2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2302e() {
        if (getChildCount() == 0) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            this.f1389b = new View(getContext());
            this.f1390c = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            this.f1389b.setLayoutParams(layoutParams);
            this.f1390c.setLayoutParams(layoutParams);
            linearLayout2.addView(this.f1389b);
            linearLayout2.addView(this.f1390c);
            this.f1391d = new View(getContext());
            this.f1391d.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.d(150.0f)));
            linearLayout.addView(linearLayout2);
            linearLayout.addView(this.f1391d);
            addView(linearLayout);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2303f(InterfaceC0131b interfaceC0131b, sfh0 sfh0Var, User user, View view) {
        if (interfaceC0131b.m2311a(this.f1392e)) {
            return;
        }
        zvf0.u("e_change_photo", getPageId(), new j760[]{vwb.Y("change_photo_method", "click_card"), vwb.Y("can_switch", Boolean.valueOf(m2310m(false, sfh0Var, user, interfaceC0131b))), vwb.Y("photo_numbers", Integer.valueOf(this.f1392e))});
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2304g(InterfaceC0131b interfaceC0131b, sfh0 sfh0Var, User user, View view) {
        if (interfaceC0131b.m2311a(this.f1392e)) {
            return;
        }
        zvf0.u("e_change_photo", getPageId(), new j760[]{vwb.Y("change_photo_method", "click_card"), vwb.Y("can_switch", Boolean.valueOf(m2310m(true, sfh0Var, user, interfaceC0131b))), vwb.Y("photo_numbers", Integer.valueOf(this.f1392e))});
    }

    public NewPictureContainerIndicator getIndicator() {
        return this.f1388a;
    }

    public int getShowPictureIndex() {
        return this.f1392e;
    }

    /* JADX INFO: renamed from: h */
    public final void m2305h(Media media) {
        m2306i(media, this.f1399l.mo2315e(media));
    }

    /* JADX INFO: renamed from: i */
    public final void m2306i(Media media, boolean z) {
        if (!TEnum.equals(media.status, "raw")) {
            zub.m25975o(media, z);
        } else if (media instanceof Video) {
            qib0.G.x0(media.url);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2307j(final sfh0 sfh0Var, final User user, final InterfaceC0131b interfaceC0131b) {
        List<Media> listM2300c = m2300c(sfh0Var);
        this.f1397j = listM2300c;
        this.f1399l = interfaceC0131b;
        if (vwb.J(listM2300c)) {
            return;
        }
        this.f1388a.setIndicatorCount(this.f1397j.size());
        xdl0.M0(this.f1388a, this.f1397j.size() > 1);
        this.f1389b.setOnClickListener(new View.OnClickListener() { // from class: l.vmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21650a.m2303f(interfaceC0131b, sfh0Var, user, view);
            }
        });
        this.f1390c.setOnClickListener(new View.OnClickListener() { // from class: l.wmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22191a.m2304g(interfaceC0131b, sfh0Var, user, view);
            }
        });
        if (upa.N3()) {
            xdl0.E0(this.f1391d, new ViewOnClickListenerC0130a(interfaceC0131b));
        }
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: k */
    public final void m2308k() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1388a.getLayoutParams();
        if (marginLayoutParams != null) {
            int i = marginLayoutParams.rightMargin;
            int i2 = t100.m;
            if (i == i2 && marginLayoutParams.leftMargin == i2) {
                return;
            }
            marginLayoutParams.rightMargin = i2;
            marginLayoutParams.leftMargin = i2;
            this.f1388a.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2309l() {
        this.f1392e = 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2310m(boolean z, sfh0 sfh0Var, User user, InterfaceC0131b interfaceC0131b) {
        int i;
        int i2;
        List<Media> listM2300c = m2300c(sfh0Var);
        if (listM2300c == null) {
            return false;
        }
        int i3 = this.f1392e;
        int size = z ? i3 + 1 : i3 - 1;
        if (size < 0) {
            size = 0;
        } else if (size >= listM2300c.size()) {
            size = listM2300c.size() - 1;
        }
        if (this.f1392e == size) {
            interfaceC0131b.mo2313c(z);
            return false;
        }
        this.f1392e = size;
        if (upa.N3()) {
            interfaceC0131b.mo2314d(size, listM2300c.get(size), "dynamics_image_witch_type".equals(this.f1400m));
        } else {
            interfaceC0131b.mo2314d(size, listM2300c.get(size), sfh0Var.m22134c() == 1 || sfh0Var.m22134c() == 2);
        }
        boolean z2 = this.f1398k;
        NewPictureContainerIndicator newPictureContainerIndicator = this.f1388a;
        if (z2) {
            newPictureContainerIndicator.m922b(this.f1392e);
        } else {
            newPictureContainerIndicator.setSelectedIndex(this.f1392e);
        }
        if (z && (i2 = size + 1) < listM2300c.size()) {
            m2305h(listM2300c.get(i2));
        } else if (!z && (i = size - 1) >= 0) {
            m2305h(listM2300c.get(i));
        }
        return true;
    }

    public void setCurrentSwitchType(String str) {
        this.f1400m = str;
    }

    public void setIndicatorColor(int i) {
        this.f1393f = i;
    }

    public void setIndicatorColorBorder(int i) {
        this.f1395h = i;
    }

    public void setIndicatorSelectedColor(int i) {
        this.f1394g = i;
    }

    public void setIndicatorSelectedColorBorder(int i) {
        this.f1396i = i;
    }

    public void setIndicatorStyle(int i) {
        if (i == 0) {
            m2308k();
        } else {
            if (i != 1) {
                return;
            }
            xdl0.W(this.f1388a, t100.A);
        }
    }

    public void setIndicatorVisible(Boolean bool) {
        if (getIndicator() == null) {
            return;
        }
        if (!bool.booleanValue() || vwb.J(this.f1397j) || this.f1397j.size() <= 1) {
            xdl0.M0(getIndicator(), false);
        } else {
            xdl0.M0(getIndicator(), true);
        }
    }

    public void setVisibilit(boolean z) {
        xdl0.M(this, z);
        setIndicatorVisible(Boolean.valueOf(z));
    }

    public void setupIndicator(ViewGroup viewGroup) {
        NewPictureContainerIndicator newPictureContainerIndicator = new NewPictureContainerIndicator(getContext());
        this.f1388a = newPictureContainerIndicator;
        newPictureContainerIndicator.setIndicatorColor(this.f1393f);
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f1388a;
        int i = t100.d;
        newPictureContainerIndicator2.setIndicatorMargin(i);
        this.f1388a.setIndicatorSelectedColor(this.f1394g);
        this.f1388a.setIndicatorBorderColor(this.f1395h);
        this.f1388a.setIndicatorBorderSelectedColor(this.f1396i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
        int i2 = t100.m;
        layoutParams.setMargins(i2, t100.j, i2, 0);
        viewGroup.addView(this.f1388a, layoutParams);
    }

    public ExpandedImageSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1393f = Color.parseColor("#33ffffff");
        this.f1394g = -1;
        this.f1395h = 0;
        this.f1396i = 0;
        this.f1400m = "default";
        m2301d();
    }

    public ExpandedImageSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1393f = Color.parseColor("#33ffffff");
        this.f1394g = -1;
        this.f1395h = 0;
        this.f1396i = 0;
        this.f1400m = "default";
        m2301d();
    }
}
