package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import p149l.qib0;
import p149l.sfh0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.xdl0;
import p149l.zub;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedImageSwitchView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public NewPictureContainerIndicator f22610a;

    /* JADX INFO: renamed from: b */
    public View f22611b;

    /* JADX INFO: renamed from: c */
    public View f22612c;

    /* JADX INFO: renamed from: d */
    public View f22613d;

    /* JADX INFO: renamed from: e */
    public int f22614e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f22615f;

    /* JADX INFO: renamed from: g */
    @ColorInt
    public int f22616g;

    /* JADX INFO: renamed from: h */
    @ColorInt
    public int f22617h;

    /* JADX INFO: renamed from: i */
    @ColorInt
    public int f22618i;

    /* JADX INFO: renamed from: j */
    public List<Media> f22619j;

    /* JADX INFO: renamed from: k */
    public boolean f22620k;

    /* JADX INFO: renamed from: l */
    public InterfaceC7967b f22621l;

    /* JADX INFO: renamed from: m */
    public String f22622m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView$a */
    public class ViewOnClickListenerC7966a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7967b f22623a;

        public ViewOnClickListenerC7966a(InterfaceC7967b interfaceC7967b) {
            this.f22623a = interfaceC7967b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22623a.mo38334b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView$b */
    public interface InterfaceC7967b {
        /* JADX INFO: renamed from: a */
        default boolean m38333a(int i) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        default void mo38334b() {
        }

        /* JADX INFO: renamed from: c */
        void mo38335c(boolean z);

        /* JADX INFO: renamed from: d */
        void mo38336d(int i, Media media, boolean z);

        /* JADX INFO: renamed from: e */
        boolean mo38337e(Media media);

        /* JADX INFO: renamed from: f */
        void mo38338f(int i, boolean z);
    }

    public ExpandedImageSwitchView(Context context) {
        super(context);
        this.f22615f = Color.parseColor("#33ffffff");
        this.f22616g = -1;
        this.f22617h = 0;
        this.f22618i = 0;
        this.f22622m = "default";
        m38323d();
    }

    private Act getAct() {
        return (Act) xdl0.m208326D(getContext());
    }

    private String getPageId() {
        if ((getAct() instanceof NewMainAct) && ExpandedCardStyleHelper.m38090o().m38103s()) {
            return OMSDialogPositon.p_suggest_user_profile_info_view;
        }
        if (getAct() instanceof NewMainAct) {
            return "p_suggest_users_home_view";
        }
        return getAct() instanceof ProfileAct ? OMSDialogPositon.p_suggest_user_profile_info_view : getAct().pageId();
    }

    /* JADX INFO: renamed from: c */
    public List<Media> m38322c(sfh0 sfh0Var) {
        if ("default".equals(this.f22622m)) {
            return sfh0Var.m183924a();
        }
        return "dynamics_image_witch_type".equals(this.f22622m) ? sfh0Var.m183925b() : new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m38323d() {
        if (upa.m194675N3()) {
            m38324e();
            return;
        }
        if (getChildCount() == 0) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            addView(linearLayout);
            this.f22611b = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            linearLayout.addView(this.f22611b, layoutParams);
            this.f22612c = new View(getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams2.weight = 1.0f;
            linearLayout.addView(this.f22612c, layoutParams2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m38324e() {
        if (getChildCount() == 0) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            this.f22611b = new View(getContext());
            this.f22612c = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            this.f22611b.setLayoutParams(layoutParams);
            this.f22612c.setLayoutParams(layoutParams);
            linearLayout2.addView(this.f22611b);
            linearLayout2.addView(this.f22612c);
            this.f22613d = new View(getContext());
            this.f22613d.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.m186890d(150.0f)));
            linearLayout.addView(linearLayout2);
            linearLayout.addView(this.f22613d);
            addView(linearLayout);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m38325f(InterfaceC7967b interfaceC7967b, sfh0 sfh0Var, User user, View view) {
        if (interfaceC7967b.m38333a(this.f22614e)) {
            return;
        }
        zvf0.m220399u("e_change_photo", getPageId(), vwb.m200311Y("change_photo_method", "click_card"), vwb.m200311Y("can_switch", Boolean.valueOf(m38332m(false, sfh0Var, user, interfaceC7967b))), vwb.m200311Y("photo_numbers", Integer.valueOf(this.f22614e)));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m38326g(InterfaceC7967b interfaceC7967b, sfh0 sfh0Var, User user, View view) {
        if (interfaceC7967b.m38333a(this.f22614e)) {
            return;
        }
        zvf0.m220399u("e_change_photo", getPageId(), vwb.m200311Y("change_photo_method", "click_card"), vwb.m200311Y("can_switch", Boolean.valueOf(m38332m(true, sfh0Var, user, interfaceC7967b))), vwb.m200311Y("photo_numbers", Integer.valueOf(this.f22614e)));
    }

    public NewPictureContainerIndicator getIndicator() {
        return this.f22610a;
    }

    public int getShowPictureIndex() {
        return this.f22614e;
    }

    /* JADX INFO: renamed from: h */
    public final void m38327h(Media media) {
        m38328i(media, this.f22621l.mo38337e(media));
    }

    /* JADX INFO: renamed from: i */
    public final void m38328i(Media media, boolean z) {
        if (!TEnum.equals(media.status, "raw")) {
            zub.m220216o(media, z);
        } else if (media instanceof Video) {
            qib0.f154691G.m102377x0(media.url);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m38329j(final sfh0 sfh0Var, final User user, final InterfaceC7967b interfaceC7967b) {
        List<Media> listM38322c = m38322c(sfh0Var);
        this.f22619j = listM38322c;
        this.f22621l = interfaceC7967b;
        if (vwb.m200296J(listM38322c)) {
            return;
        }
        this.f22610a.setIndicatorCount(this.f22619j.size());
        xdl0.m208345M0(this.f22610a, this.f22619j.size() > 1);
        this.f22611b.setOnClickListener(new View.OnClickListener() { // from class: l.vmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182113a.m38325f(interfaceC7967b, sfh0Var, user, view);
            }
        });
        this.f22612c.setOnClickListener(new View.OnClickListener() { // from class: l.wmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187064a.m38326g(interfaceC7967b, sfh0Var, user, view);
            }
        });
        if (upa.m194675N3()) {
            xdl0.m208329E0(this.f22613d, new ViewOnClickListenerC7966a(interfaceC7967b));
        }
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: k */
    public final void m38330k() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22610a.getLayoutParams();
        if (marginLayoutParams != null) {
            int i = marginLayoutParams.rightMargin;
            int i2 = t100.f167264m;
            if (i == i2 && marginLayoutParams.leftMargin == i2) {
                return;
            }
            marginLayoutParams.rightMargin = i2;
            marginLayoutParams.leftMargin = i2;
            this.f22610a.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m38331l() {
        this.f22614e = 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m38332m(boolean z, sfh0 sfh0Var, User user, InterfaceC7967b interfaceC7967b) {
        int i;
        int i2;
        List<Media> listM38322c = m38322c(sfh0Var);
        if (listM38322c == null) {
            return false;
        }
        int i3 = this.f22614e;
        int size = z ? i3 + 1 : i3 - 1;
        if (size < 0) {
            size = 0;
        } else if (size >= listM38322c.size()) {
            size = listM38322c.size() - 1;
        }
        if (this.f22614e == size) {
            interfaceC7967b.mo38335c(z);
            return false;
        }
        this.f22614e = size;
        if (upa.m194675N3()) {
            interfaceC7967b.mo38336d(size, listM38322c.get(size), "dynamics_image_witch_type".equals(this.f22622m));
        } else {
            interfaceC7967b.mo38336d(size, listM38322c.get(size), sfh0Var.m183926c() == 1 || sfh0Var.m183926c() == 2);
        }
        boolean z2 = this.f22620k;
        NewPictureContainerIndicator newPictureContainerIndicator = this.f22610a;
        if (z2) {
            newPictureContainerIndicator.m36955b(this.f22614e);
        } else {
            newPictureContainerIndicator.setSelectedIndex(this.f22614e);
        }
        if (z && (i2 = size + 1) < listM38322c.size()) {
            m38327h(listM38322c.get(i2));
        } else if (!z && (i = size - 1) >= 0) {
            m38327h(listM38322c.get(i));
        }
        return true;
    }

    public void setCurrentSwitchType(String str) {
        this.f22622m = str;
    }

    public void setIndicatorColor(int i) {
        this.f22615f = i;
    }

    public void setIndicatorColorBorder(int i) {
        this.f22617h = i;
    }

    public void setIndicatorSelectedColor(int i) {
        this.f22616g = i;
    }

    public void setIndicatorSelectedColorBorder(int i) {
        this.f22618i = i;
    }

    public void setIndicatorStyle(int i) {
        if (i == 0) {
            m38330k();
        } else {
            if (i != 1) {
                return;
            }
            xdl0.m208359W(this.f22610a, t100.f167226A);
        }
    }

    public void setIndicatorVisible(Boolean bool) {
        if (getIndicator() == null) {
            return;
        }
        if (!bool.booleanValue() || vwb.m200296J(this.f22619j) || this.f22619j.size() <= 1) {
            xdl0.m208345M0(getIndicator(), false);
        } else {
            xdl0.m208345M0(getIndicator(), true);
        }
    }

    public void setVisibilit(boolean z) {
        xdl0.m208344M(this, z);
        setIndicatorVisible(Boolean.valueOf(z));
    }

    public void setupIndicator(ViewGroup viewGroup) {
        NewPictureContainerIndicator newPictureContainerIndicator = new NewPictureContainerIndicator(getContext());
        this.f22610a = newPictureContainerIndicator;
        newPictureContainerIndicator.setIndicatorColor(this.f22615f);
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f22610a;
        int i = t100.f167255d;
        newPictureContainerIndicator2.setIndicatorMargin(i);
        this.f22610a.setIndicatorSelectedColor(this.f22616g);
        this.f22610a.setIndicatorBorderColor(this.f22617h);
        this.f22610a.setIndicatorBorderSelectedColor(this.f22618i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
        int i2 = t100.f167264m;
        layoutParams.setMargins(i2, t100.f167261j, i2, 0);
        viewGroup.addView(this.f22610a, layoutParams);
    }

    public ExpandedImageSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22615f = Color.parseColor("#33ffffff");
        this.f22616g = -1;
        this.f22617h = 0;
        this.f22618i = 0;
        this.f22622m = "default";
        m38323d();
    }

    public ExpandedImageSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22615f = Color.parseColor("#33ffffff");
        this.f22616g = -1;
        this.f22617h = 0;
        this.f22618i = 0;
        this.f22622m = "default";
        m38323d();
    }
}
