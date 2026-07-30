package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import p153l.aoh0;
import p153l.bnl0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.nwb;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedImageSwitchView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public NewPictureContainerIndicator f23352a;

    /* JADX INFO: renamed from: b */
    public View f23353b;

    /* JADX INFO: renamed from: c */
    public View f23354c;

    /* JADX INFO: renamed from: d */
    public View f23355d;

    /* JADX INFO: renamed from: e */
    public int f23356e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f23357f;

    /* JADX INFO: renamed from: g */
    @ColorInt
    public int f23358g;

    /* JADX INFO: renamed from: h */
    @ColorInt
    public int f23359h;

    /* JADX INFO: renamed from: i */
    @ColorInt
    public int f23360i;

    /* JADX INFO: renamed from: j */
    public List<Media> f23361j;

    /* JADX INFO: renamed from: k */
    public boolean f23362k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8118b f23363l;

    /* JADX INFO: renamed from: m */
    public String f23364m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView$a */
    public class ViewOnClickListenerC8117a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8118b f23365a;

        public ViewOnClickListenerC8117a(InterfaceC8118b interfaceC8118b) {
            this.f23365a = interfaceC8118b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23365a.mo39337b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView$b */
    public interface InterfaceC8118b {
        /* JADX INFO: renamed from: a */
        default boolean m39336a(int i) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        default void mo39337b() {
        }

        /* JADX INFO: renamed from: c */
        void mo39338c(boolean z);

        /* JADX INFO: renamed from: d */
        void mo39339d(int i, Media media, boolean z);

        /* JADX INFO: renamed from: e */
        boolean mo39340e(Media media);

        /* JADX INFO: renamed from: f */
        void mo39341f(int i, boolean z);
    }

    public ExpandedImageSwitchView(Context context) {
        super(context);
        this.f23357f = Color.parseColor("#33ffffff");
        this.f23358g = -1;
        this.f23359h = 0;
        this.f23360i = 0;
        this.f23364m = "default";
        m39326d();
    }

    private Act getAct() {
        return (Act) bnl0.m105506D(getContext());
    }

    private String getPageId() {
        if ((getAct() instanceof NewMainAct) && ExpandedCardStyleHelper.m39093o().m39106s()) {
            return OMSDialogPositon.p_suggest_user_profile_info_view;
        }
        if (getAct() instanceof NewMainAct) {
            return "p_suggest_users_home_view";
        }
        return getAct() instanceof ProfileAct ? OMSDialogPositon.p_suggest_user_profile_info_view : getAct().pageId();
    }

    /* JADX INFO: renamed from: c */
    public List<Media> m39325c(aoh0 aoh0Var) {
        if ("default".equals(this.f23364m)) {
            return aoh0Var.m99080a();
        }
        return "dynamics_image_witch_type".equals(this.f23364m) ? aoh0Var.m99081b() : new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m39326d() {
        if (gra.m131606N3()) {
            m39327e();
            return;
        }
        if (getChildCount() == 0) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            addView(linearLayout);
            this.f23353b = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            linearLayout.addView(this.f23353b, layoutParams);
            this.f23354c = new View(getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams2.weight = 1.0f;
            linearLayout.addView(this.f23354c, layoutParams2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m39327e() {
        if (getChildCount() == 0) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            this.f23353b = new View(getContext());
            this.f23354c = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            this.f23353b.setLayoutParams(layoutParams);
            this.f23354c.setLayoutParams(layoutParams);
            linearLayout2.addView(this.f23353b);
            linearLayout2.addView(this.f23354c);
            this.f23355d = new View(getContext());
            this.f23355d.setLayoutParams(new LinearLayout.LayoutParams(-1, qa00.m175859d(150.0f)));
            linearLayout.addView(linearLayout2);
            linearLayout.addView(this.f23355d);
            addView(linearLayout);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m39328f(InterfaceC8118b interfaceC8118b, aoh0 aoh0Var, User user, View view) {
        if (interfaceC8118b.m39336a(this.f23356e)) {
            return;
        }
        i4g0.m138523u("e_change_photo", getPageId(), jyb.m147494Y("change_photo_method", "click_card"), jyb.m147494Y("can_switch", Boolean.valueOf(m39335m(false, aoh0Var, user, interfaceC8118b))), jyb.m147494Y("photo_numbers", Integer.valueOf(this.f23356e)));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m39329g(InterfaceC8118b interfaceC8118b, aoh0 aoh0Var, User user, View view) {
        if (interfaceC8118b.m39336a(this.f23356e)) {
            return;
        }
        i4g0.m138523u("e_change_photo", getPageId(), jyb.m147494Y("change_photo_method", "click_card"), jyb.m147494Y("can_switch", Boolean.valueOf(m39335m(true, aoh0Var, user, interfaceC8118b))), jyb.m147494Y("photo_numbers", Integer.valueOf(this.f23356e)));
    }

    public NewPictureContainerIndicator getIndicator() {
        return this.f23352a;
    }

    public int getShowPictureIndex() {
        return this.f23356e;
    }

    /* JADX INFO: renamed from: h */
    public final void m39330h(Media media) {
        m39331i(media, this.f23363l.mo39340e(media));
    }

    /* JADX INFO: renamed from: i */
    public final void m39331i(Media media, boolean z) {
        if (!TEnum.equals(media.status, "raw")) {
            nwb.m164977o(media, z);
        } else if (media instanceof Video) {
            uqb0.f180374G.m127160x0(media.url);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m39332j(final aoh0 aoh0Var, final User user, final InterfaceC8118b interfaceC8118b) {
        List<Media> listM39325c = m39325c(aoh0Var);
        this.f23361j = listM39325c;
        this.f23363l = interfaceC8118b;
        if (jyb.m147479J(listM39325c)) {
            return;
        }
        this.f23352a.setIndicatorCount(this.f23361j.size());
        bnl0.m105525M0(this.f23352a, this.f23361j.size() > 1);
        this.f23353b.setOnClickListener(new View.OnClickListener() { // from class: l.bof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77670a.m39328f(interfaceC8118b, aoh0Var, user, view);
            }
        });
        this.f23354c.setOnClickListener(new View.OnClickListener() { // from class: l.cof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82864a.m39329g(interfaceC8118b, aoh0Var, user, view);
            }
        });
        if (gra.m131606N3()) {
            bnl0.m105509E0(this.f23355d, new ViewOnClickListenerC8117a(interfaceC8118b));
        }
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: k */
    public final void m39333k() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f23352a.getLayoutParams();
        if (marginLayoutParams != null) {
            int i = marginLayoutParams.rightMargin;
            int i2 = qa00.f156326m;
            if (i == i2 && marginLayoutParams.leftMargin == i2) {
                return;
            }
            marginLayoutParams.rightMargin = i2;
            marginLayoutParams.leftMargin = i2;
            this.f23352a.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m39334l() {
        this.f23356e = 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m39335m(boolean z, aoh0 aoh0Var, User user, InterfaceC8118b interfaceC8118b) {
        int i;
        int i2;
        List<Media> listM39325c = m39325c(aoh0Var);
        if (listM39325c == null) {
            return false;
        }
        int i3 = this.f23356e;
        int size = z ? i3 + 1 : i3 - 1;
        if (size < 0) {
            size = 0;
        } else if (size >= listM39325c.size()) {
            size = listM39325c.size() - 1;
        }
        if (this.f23356e == size) {
            interfaceC8118b.mo39338c(z);
            return false;
        }
        this.f23356e = size;
        if (gra.m131606N3()) {
            interfaceC8118b.mo39339d(size, listM39325c.get(size), "dynamics_image_witch_type".equals(this.f23364m));
        } else {
            interfaceC8118b.mo39339d(size, listM39325c.get(size), aoh0Var.m99082c() == 1 || aoh0Var.m99082c() == 2);
        }
        boolean z2 = this.f23362k;
        NewPictureContainerIndicator newPictureContainerIndicator = this.f23352a;
        if (z2) {
            newPictureContainerIndicator.m37958b(this.f23356e);
        } else {
            newPictureContainerIndicator.setSelectedIndex(this.f23356e);
        }
        if (z && (i2 = size + 1) < listM39325c.size()) {
            m39330h(listM39325c.get(i2));
        } else if (!z && (i = size - 1) >= 0) {
            m39330h(listM39325c.get(i));
        }
        return true;
    }

    public void setCurrentSwitchType(String str) {
        this.f23364m = str;
    }

    public void setIndicatorColor(int i) {
        this.f23357f = i;
    }

    public void setIndicatorColorBorder(int i) {
        this.f23359h = i;
    }

    public void setIndicatorSelectedColor(int i) {
        this.f23358g = i;
    }

    public void setIndicatorSelectedColorBorder(int i) {
        this.f23360i = i;
    }

    public void setIndicatorStyle(int i) {
        if (i == 0) {
            m39333k();
        } else {
            if (i != 1) {
                return;
            }
            bnl0.m105539W(this.f23352a, qa00.f156288A);
        }
    }

    public void setIndicatorVisible(Boolean bool) {
        if (getIndicator() == null) {
            return;
        }
        if (!bool.booleanValue() || jyb.m147479J(this.f23361j) || this.f23361j.size() <= 1) {
            bnl0.m105525M0(getIndicator(), false);
        } else {
            bnl0.m105525M0(getIndicator(), true);
        }
    }

    public void setVisibilit(boolean z) {
        bnl0.m105524M(this, z);
        setIndicatorVisible(Boolean.valueOf(z));
    }

    public void setupIndicator(ViewGroup viewGroup) {
        NewPictureContainerIndicator newPictureContainerIndicator = new NewPictureContainerIndicator(getContext());
        this.f23352a = newPictureContainerIndicator;
        newPictureContainerIndicator.setIndicatorColor(this.f23357f);
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f23352a;
        int i = qa00.f156317d;
        newPictureContainerIndicator2.setIndicatorMargin(i);
        this.f23352a.setIndicatorSelectedColor(this.f23358g);
        this.f23352a.setIndicatorBorderColor(this.f23359h);
        this.f23352a.setIndicatorBorderSelectedColor(this.f23360i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
        int i2 = qa00.f156326m;
        layoutParams.setMargins(i2, qa00.f156323j, i2, 0);
        viewGroup.addView(this.f23352a, layoutParams);
    }

    public ExpandedImageSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23357f = Color.parseColor("#33ffffff");
        this.f23358g = -1;
        this.f23359h = 0;
        this.f23360i = 0;
        this.f23364m = "default";
        m39326d();
    }

    public ExpandedImageSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23357f = Color.parseColor("#33ffffff");
        this.f23358g = -1;
        this.f23359h = 0;
        this.f23360i = 0;
        this.f23364m = "default";
        m39326d();
    }
}
