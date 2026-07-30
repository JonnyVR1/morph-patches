package p147v.navigationbar;

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
import p147v.VFrame;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;
import p149l.b6c0;
import p149l.b9c0;
import p149l.dyl;
import p149l.p4c0;
import p149l.t0c0;
import p149l.t100;
import p149l.u2c0;
import p149l.upk0;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes3.dex */
public class VNavigationBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public final VLinear f209764a;

    /* JADX INFO: renamed from: b */
    public final VFrame f209765b;

    /* JADX INFO: renamed from: c */
    public final VFrame f209766c;

    /* JADX INFO: renamed from: d */
    public final VLinear f209767d;

    /* JADX INFO: renamed from: e */
    public VNavigationTabLayout f209768e;

    /* JADX INFO: renamed from: f */
    public IconAnimLayout f209769f;

    /* JADX INFO: renamed from: v.navigationbar.VNavigationBar$a */
    public class C22612a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dyl f209770a;

        public C22612a(dyl dylVar) {
            this.f209770a = dylVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(final int i) {
            if (VNavigationBar.this.f209769f != null) {
                IconAnimLayout iconAnimLayout = VNavigationBar.this.f209769f;
                List<View> listMo63831g = this.f209770a.mo63831g(i);
                final dyl dylVar = this.f209770a;
                w9j<View, Animator> w9jVar = new w9j() { // from class: l.qpk0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return dylVar.mo63829a(i, (View) obj);
                    }
                };
                final dyl dylVar2 = this.f209770a;
                iconAnimLayout.m223579e(listMo63831g, w9jVar, new w9j() { // from class: l.rpk0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return dylVar2.mo63830b(i, (View) obj);
                    }
                });
            }
        }
    }

    public VNavigationBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, b6c0.f73791q, this);
        setBackgroundColor(getResources().getColor(t0c0.f167171w));
        this.f209764a = (VLinear) findViewById(p4c0.f147113e0);
        this.f209765b = (VFrame) findViewById(p4c0.f147109c0);
        this.f209766c = (VFrame) findViewById(p4c0.f147092S0);
        this.f209767d = (VLinear) findViewById(p4c0.f147066F0);
        if (attributeSet == null) {
            setLeftIconDrawable(null);
            setTitle((CharSequence) null);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74353U3, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74359V3, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(b9c0.f74365W3);
        float f = typedArrayObtainStyledAttributes.getFloat(b9c0.f74377Y3, 21.0f);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74371X3, getResources().getColor(t0c0.f167153e));
        typedArrayObtainStyledAttributes.recycle();
        setLeftIconResource(resourceId);
        m223586E(text, f, color);
    }

    /* JADX INFO: renamed from: B */
    public void m223584B() {
        m223585C(this.f209767d, null, false);
    }

    /* JADX INFO: renamed from: C */
    public final void m223585C(@NonNull ViewGroup viewGroup, @Nullable List<View> list, boolean z) {
        if (!z) {
            viewGroup.removeAllViews();
        }
        ArrayList<View> arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.opk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) != null);
            }
        });
        if (!vwb.m200296J(arrayListM200339n)) {
            for (View view : arrayListM200339n) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (viewGroup.getChildCount() > 0) {
                    marginLayoutParams.leftMargin = t100.f167259h;
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
    public void m223586E(@Nullable CharSequence charSequence, float f, int i) {
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
        vText.setPadding(0, t100.f167254c, 0, 0);
        setTitleView(vText);
    }

    @Nullable
    public IconAnimLayout getIconAnimLayout() {
        return this.f209769f;
    }

    public VFrame getLeftIconContainer() {
        return this.f209765b;
    }

    public VLinear getRightIconContainer() {
        return this.f209767d;
    }

    @Nullable
    public VNavigationTabLayout getTabLayout() {
        return this.f209768e;
    }

    public VFrame getTitleContainer() {
        return this.f209766c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 2) {
            upk0.m194883a("布局中最多只能有一个子 View");
        } else if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            removeView(childAt);
            setTitleView(childAt);
        }
    }

    public void setLeftIconAsBack(@NonNull final Activity activity) {
        setLeftIconResource(u2c0.f173386n);
        setLeftIconOnClick(new View.OnClickListener() { // from class: l.ppk0
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
        this.f209765b.setOnClickListener(onClickListener);
    }

    public void setLeftIconResource(@DrawableRes int i) {
        if (i == 0) {
            setLeftIconDrawable(null);
        } else {
            setLeftIconDrawable(getContext().getDrawable(i));
        }
    }

    public void setLeftIconView(@Nullable View view) {
        this.f209765b.removeAllViews();
        VFrame vFrame = this.f209765b;
        if (view == null) {
            vFrame.setVisibility(8);
        } else {
            vFrame.setVisibility(0);
            this.f209765b.addView(view);
        }
    }

    public void setRightIconClip(boolean z) {
        this.f209764a.setClipToPadding(z);
        this.f209764a.setClipChildren(z);
        this.f209767d.setClipToPadding(z);
        this.f209767d.setClipChildren(z);
    }

    public void setRightIconViews(@NonNull View... viewArr) {
        m223585C(this.f209767d, Arrays.asList(viewArr), false);
    }

    public void setTitle(@StringRes int i) {
        if (i == 0) {
            setTitle((CharSequence) null);
        } else {
            setTitle(getContext().getText(i));
        }
    }

    public void setTitleView(@Nullable View view) {
        this.f209766c.removeAllViews();
        VFrame vFrame = this.f209766c;
        if (view == null) {
            vFrame.setVisibility(4);
        } else {
            vFrame.setVisibility(0);
            this.f209766c.addView(view);
        }
    }

    public void setupViewPager(@NonNull ViewPager viewPager) {
        if (!(viewPager.getAdapter() instanceof dyl)) {
            upk0.m194883a("ViewPager 需要先设置 adapter 并且 adapter 需要实现 INavigationPagerAdapter 接口");
            return;
        }
        dyl dylVar = (dyl) viewPager.getAdapter();
        VNavigationTabLayout vNavigationTabLayout = (VNavigationTabLayout) LayoutInflater.from(getContext()).inflate(b6c0.f73792r, (ViewGroup) this, false);
        this.f209768e = vNavigationTabLayout;
        setTitleView(vNavigationTabLayout);
        this.f209768e.setupWithViewPager(viewPager);
        IconAnimLayout iconAnimLayout = new IconAnimLayout(getContext());
        this.f209769f = iconAnimLayout;
        iconAnimLayout.m223579e(dylVar.mo63831g(viewPager.getCurrentItem()), null, null);
        setRightIconClip(false);
        setRightIconViews(this.f209769f);
        viewPager.m4185d(new C22612a(dylVar));
    }

    /* JADX INFO: renamed from: v */
    public void m223587v(@NonNull Drawable drawable, @Nullable View.OnClickListener onClickListener) {
        VIcon vIcon = new VIcon(getContext());
        vIcon.setIconStyle(4);
        vIcon.setImageDrawable(drawable);
        vIcon.setOnClickListener(onClickListener);
        m223589z(vIcon);
    }

    /* JADX INFO: renamed from: w */
    public void m223588w(@DrawableRes int i, @Nullable View.OnClickListener onClickListener) {
        m223587v(getContext().getDrawable(i), onClickListener);
    }

    /* JADX INFO: renamed from: z */
    public void m223589z(@NonNull View... viewArr) {
        m223585C(this.f209767d, Arrays.asList(viewArr), true);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        m223586E(charSequence, 21.0f, getResources().getColor(t0c0.f167153e));
    }

    public VNavigationBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VNavigationBar(Context context) {
        this(context, null);
    }
}
