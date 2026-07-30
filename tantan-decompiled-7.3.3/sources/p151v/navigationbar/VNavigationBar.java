package p151v.navigationbar;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;
import p153l.abc0;
import p153l.azk0;
import p153l.gec0;
import p153l.hhc0;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.vcc0;
import p153l.w0m;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VNavigationBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public final VLinear f210686a;

    /* JADX INFO: renamed from: b */
    public final VFrame f210687b;

    /* JADX INFO: renamed from: c */
    public final VFrame f210688c;

    /* JADX INFO: renamed from: d */
    public final VLinear f210689d;

    /* JADX INFO: renamed from: e */
    public VNavigationTabLayout f210690e;

    /* JADX INFO: renamed from: f */
    public IconAnimLayout f210691f;

    /* JADX INFO: renamed from: v.navigationbar.VNavigationBar$a */
    public class C22727a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w0m f210692a;

        public C22727a(w0m w0mVar) {
            this.f210692a = w0mVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(final int i) {
            if (VNavigationBar.this.f210691f != null) {
                IconAnimLayout iconAnimLayout = VNavigationBar.this.f210691f;
                List<View> listMo65014g = this.f210692a.mo65014g(i);
                final w0m w0mVar = this.f210692a;
                qcj<View, Animator> qcjVar = new qcj() { // from class: l.wyk0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return w0mVar.mo65012a(i, (View) obj);
                    }
                };
                final w0m w0mVar2 = this.f210692a;
                iconAnimLayout.m224825e(listMo65014g, qcjVar, new qcj() { // from class: l.xyk0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return w0mVar2.mo65013b(i, (View) obj);
                    }
                });
            }
        }
    }

    public VNavigationBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, gec0.f103804q, this);
        setBackgroundColor(getResources().getColor(z8c0.f203362w));
        this.f210686a = (VLinear) findViewById(vcc0.f183413e0);
        this.f210687b = (VFrame) findViewById(vcc0.f183409c0);
        this.f210688c = (VFrame) findViewById(vcc0.f183392S0);
        this.f210689d = (VLinear) findViewById(vcc0.f183366F0);
        if (attributeSet == null) {
            setLeftIconDrawable(null);
            setTitle((CharSequence) null);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109662U3, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109668V3, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(hhc0.f109674W3);
        float f = typedArrayObtainStyledAttributes.getFloat(hhc0.f109686Y3, 21.0f);
        int color = typedArrayObtainStyledAttributes.getColor(hhc0.f109680X3, getResources().getColor(z8c0.f203344e));
        typedArrayObtainStyledAttributes.recycle();
        setLeftIconResource(resourceId);
        m224832E(text, f, color);
    }

    /* JADX INFO: renamed from: B */
    public void m224830B() {
        m224831C(this.f210689d, null, false);
    }

    /* JADX INFO: renamed from: C */
    public final void m224831C(@NonNull ViewGroup viewGroup, @Nullable List<View> list, boolean z) {
        if (!z) {
            viewGroup.removeAllViews();
        }
        ArrayList<View> arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.uyk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) != null);
            }
        });
        if (!jyb.m147479J(arrayListM147522n)) {
            for (View view : arrayListM147522n) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (viewGroup.getChildCount() > 0) {
                    marginLayoutParams.leftMargin = qa00.f156321h;
                }
                viewGroup.addView(view, marginLayoutParams);
            }
        }
        if (viewGroup.getChildCount() > 0) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m224832E(@Nullable CharSequence charSequence, float f, int i) {
        if (charSequence == null) {
            setTitleView(null);
            return;
        }
        VText vText = new VText(getContext());
        vText.setText(charSequence);
        vText.setTextSize(f);
        vText.setTextColor(i);
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, qa00.f156316c, 0, 0);
        setTitleView(vText);
    }

    @Nullable
    public IconAnimLayout getIconAnimLayout() {
        return this.f210691f;
    }

    public VFrame getLeftIconContainer() {
        return this.f210687b;
    }

    public VLinear getRightIconContainer() {
        return this.f210689d;
    }

    @Nullable
    public VNavigationTabLayout getTabLayout() {
        return this.f210690e;
    }

    public VFrame getTitleContainer() {
        return this.f210688c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 2) {
            azk0.m101074a("布局中最多只能有一个子 View");
        } else if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            removeView(childAt);
            setTitleView(childAt);
        }
    }

    public void setLeftIconAsBack(@NonNull final Activity activity) {
        setLeftIconResource(abc0.f69506n);
        setLeftIconOnClick(new View.OnClickListener() { // from class: l.vyk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                activity.finish();
            }
        });
    }

    public void setLeftIconDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            setLeftIconView(null);
            return;
        }
        VIcon vIcon = new VIcon(getContext());
        vIcon.setIconStyle(4);
        vIcon.setImageDrawable(drawable);
        setLeftIconView(vIcon);
    }

    public void setLeftIconOnClick(@Nullable View.OnClickListener onClickListener) {
        this.f210687b.setOnClickListener(onClickListener);
    }

    public void setLeftIconResource(@DrawableRes int i) {
        if (i == 0) {
            setLeftIconDrawable(null);
        } else {
            setLeftIconDrawable(getContext().getDrawable(i));
        }
    }

    public void setLeftIconView(@Nullable View view) {
        this.f210687b.removeAllViews();
        VFrame vFrame = this.f210687b;
        if (view == null) {
            vFrame.setVisibility(8);
        } else {
            vFrame.setVisibility(0);
            this.f210687b.addView(view);
        }
    }

    public void setRightIconClip(boolean z) {
        this.f210686a.setClipToPadding(z);
        this.f210686a.setClipChildren(z);
        this.f210689d.setClipToPadding(z);
        this.f210689d.setClipChildren(z);
    }

    public void setRightIconViews(@NonNull View... viewArr) {
        m224831C(this.f210689d, Arrays.asList(viewArr), false);
    }

    public void setTitle(@StringRes int i) {
        if (i == 0) {
            setTitle((CharSequence) null);
        } else {
            setTitle(getContext().getText(i));
        }
    }

    public void setTitleView(@Nullable View view) {
        this.f210688c.removeAllViews();
        VFrame vFrame = this.f210688c;
        if (view == null) {
            vFrame.setVisibility(4);
        } else {
            vFrame.setVisibility(0);
            this.f210688c.addView(view);
        }
    }

    public void setupViewPager(@NonNull ViewPager viewPager) {
        if (!(viewPager.getAdapter() instanceof w0m)) {
            azk0.m101074a("ViewPager 需要先设置 adapter 并且 adapter 需要实现 INavigationPagerAdapter 接口");
            return;
        }
        w0m w0mVar = (w0m) viewPager.getAdapter();
        VNavigationTabLayout vNavigationTabLayout = (VNavigationTabLayout) LayoutInflater.from(getContext()).inflate(gec0.f103805r, (ViewGroup) this, false);
        this.f210690e = vNavigationTabLayout;
        setTitleView(vNavigationTabLayout);
        this.f210690e.setupWithViewPager(viewPager);
        IconAnimLayout iconAnimLayout = new IconAnimLayout(getContext());
        this.f210691f = iconAnimLayout;
        iconAnimLayout.m224825e(w0mVar.mo65014g(viewPager.getCurrentItem()), null, null);
        setRightIconClip(false);
        setRightIconViews(this.f210691f);
        viewPager.m4187d(new C22727a(w0mVar));
    }

    /* JADX INFO: renamed from: v */
    public void m224833v(@NonNull Drawable drawable, @Nullable View.OnClickListener onClickListener) {
        VIcon vIcon = new VIcon(getContext());
        vIcon.setIconStyle(4);
        vIcon.setImageDrawable(drawable);
        vIcon.setOnClickListener(onClickListener);
        m224835z(vIcon);
    }

    /* JADX INFO: renamed from: w */
    public void m224834w(@DrawableRes int i, @Nullable View.OnClickListener onClickListener) {
        m224833v(getContext().getDrawable(i), onClickListener);
    }

    /* JADX INFO: renamed from: z */
    public void m224835z(@NonNull View... viewArr) {
        m224831C(this.f210689d, Arrays.asList(viewArr), true);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        m224832E(charSequence, 21.0f, getResources().getColor(z8c0.f203344e));
    }

    public VNavigationBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VNavigationBar(Context context) {
        this(context, null);
    }
}
