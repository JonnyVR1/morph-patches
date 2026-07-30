package p028v.navigationbar;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.b6c0;
import l.b9c0;
import l.p4c0;
import l.t0c0;
import l.t100;
import l.u2c0;
import l.vwb;
import p003l.dyl;
import p003l.upk0;
import p003l.w9j;
import p028v.VFrame;
import p028v.VIcon;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VNavigationBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public final VLinear f13389a;

    /* JADX INFO: renamed from: b */
    public final VFrame f13390b;

    /* JADX INFO: renamed from: c */
    public final VFrame f13391c;

    /* JADX INFO: renamed from: d */
    public final VLinear f13392d;

    /* JADX INFO: renamed from: e */
    public VNavigationTabLayout f13393e;

    /* JADX INFO: renamed from: f */
    public IconAnimLayout f13394f;

    /* JADX INFO: renamed from: v.navigationbar.VNavigationBar$a */
    public class C1405a implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dyl f13395a;

        public C1405a(dyl dylVar) {
            this.f13395a = dylVar;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(final int i) {
            if (VNavigationBar.this.f13394f != null) {
                IconAnimLayout iconAnimLayout = VNavigationBar.this.f13394f;
                List<View> listM3775g = this.f13395a.m3775g(i);
                final dyl dylVar = this.f13395a;
                w9j<View, Animator> w9jVar = new w9j() { // from class: l.qpk0
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return dylVar.m3773a(i, (View) obj);
                    }
                };
                final dyl dylVar2 = this.f13395a;
                iconAnimLayout.m12082e(listM3775g, w9jVar, new w9j() { // from class: l.rpk0
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return dylVar2.m3774b(i, (View) obj);
                    }
                });
            }
        }
    }

    public VNavigationBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, b6c0.q, this);
        setBackgroundColor(getResources().getColor(t0c0.w));
        this.f13389a = (VLinear) findViewById(p4c0.e0);
        this.f13390b = (VFrame) findViewById(p4c0.c0);
        this.f13391c = (VFrame) findViewById(p4c0.S0);
        this.f13392d = (VLinear) findViewById(p4c0.F0);
        if (attributeSet == null) {
            setLeftIconDrawable(null);
            setTitle((CharSequence) null);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.U3, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.V3, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(b9c0.W3);
        float f = typedArrayObtainStyledAttributes.getFloat(b9c0.Y3, 21.0f);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.X3, getResources().getColor(t0c0.e));
        typedArrayObtainStyledAttributes.recycle();
        setLeftIconResource(resourceId);
        m12089E(text, f, color);
    }

    /* JADX INFO: renamed from: B */
    public void m12087B() {
        m12088C(this.f13392d, null, false);
    }

    /* JADX INFO: renamed from: C */
    public final void m12088C(@NonNull ViewGroup viewGroup, @Nullable List<View> list, boolean z) {
        if (!z) {
            viewGroup.removeAllViews();
        }
        ArrayList<View> arrayListN = vwb.n(list, new w9j() { // from class: l.opk0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) != null);
            }
        });
        if (!vwb.J(arrayListN)) {
            for (View view : arrayListN) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (viewGroup.getChildCount() > 0) {
                    marginLayoutParams.leftMargin = t100.h;
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
    public void m12089E(@Nullable CharSequence charSequence, float f, int i) {
        if (charSequence == null) {
            setTitleView(null);
            return;
        }
        AppCompatTextView vText = new VText(getContext());
        vText.setText(charSequence);
        vText.setTextSize(f);
        vText.setTextColor(i);
        vText.setTypeface((Typeface) null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, t100.c, 0, 0);
        setTitleView(vText);
    }

    @Nullable
    public IconAnimLayout getIconAnimLayout() {
        return this.f13394f;
    }

    public VFrame getLeftIconContainer() {
        return this.f13390b;
    }

    public VLinear getRightIconContainer() {
        return this.f13392d;
    }

    @Nullable
    public VNavigationTabLayout getTabLayout() {
        return this.f13393e;
    }

    public VFrame getTitleContainer() {
        return this.f13391c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 2) {
            upk0.m8197a("布局中最多只能有一个子 View");
        } else if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            removeView(childAt);
            setTitleView(childAt);
        }
    }

    public void setLeftIconAsBack(@NonNull final Activity activity) {
        setLeftIconResource(u2c0.n);
        setLeftIconOnClick(new View.OnClickListener() { // from class: l.ppk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                activity.finish();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, v.VIcon, v.VImage] */
    public void setLeftIconDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            setLeftIconView(null);
            return;
        }
        ?? vIcon = new VIcon(getContext());
        vIcon.setIconStyle(4);
        vIcon.setImageDrawable(drawable);
        setLeftIconView(vIcon);
    }

    public void setLeftIconOnClick(@Nullable View.OnClickListener onClickListener) {
        this.f13390b.setOnClickListener(onClickListener);
    }

    public void setLeftIconResource(@DrawableRes int i) {
        if (i == 0) {
            setLeftIconDrawable(null);
        } else {
            setLeftIconDrawable(getContext().getDrawable(i));
        }
    }

    public void setLeftIconView(@Nullable View view) {
        this.f13390b.removeAllViews();
        VFrame vFrame = this.f13390b;
        if (view == null) {
            vFrame.setVisibility(8);
        } else {
            vFrame.setVisibility(0);
            this.f13390b.addView(view);
        }
    }

    public void setRightIconClip(boolean z) {
        this.f13389a.setClipToPadding(z);
        this.f13389a.setClipChildren(z);
        this.f13392d.setClipToPadding(z);
        this.f13392d.setClipChildren(z);
    }

    public void setRightIconViews(@NonNull View... viewArr) {
        m12088C(this.f13392d, Arrays.asList(viewArr), false);
    }

    public void setTitle(@StringRes int i) {
        if (i == 0) {
            setTitle((CharSequence) null);
        } else {
            setTitle(getContext().getText(i));
        }
    }

    public void setTitleView(@Nullable View view) {
        this.f13391c.removeAllViews();
        VFrame vFrame = this.f13391c;
        if (view == null) {
            vFrame.setVisibility(4);
        } else {
            vFrame.setVisibility(0);
            this.f13391c.addView(view);
        }
    }

    public void setupViewPager(@NonNull ViewPager viewPager) {
        if (!(viewPager.getAdapter() instanceof dyl)) {
            upk0.m8197a("ViewPager 需要先设置 adapter 并且 adapter 需要实现 INavigationPagerAdapter 接口");
            return;
        }
        dyl adapter = viewPager.getAdapter();
        VNavigationTabLayout vNavigationTabLayout = (VNavigationTabLayout) LayoutInflater.from(getContext()).inflate(b6c0.r, (ViewGroup) this, false);
        this.f13393e = vNavigationTabLayout;
        setTitleView(vNavigationTabLayout);
        this.f13393e.setupWithViewPager(viewPager);
        IconAnimLayout iconAnimLayout = new IconAnimLayout(getContext());
        this.f13394f = iconAnimLayout;
        iconAnimLayout.m12082e(adapter.m3775g(viewPager.getCurrentItem()), null, null);
        setRightIconClip(false);
        setRightIconViews(this.f13394f);
        viewPager.d(new C1405a(adapter));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, v.VIcon, v.VImage] */
    /* JADX INFO: renamed from: v */
    public void m12090v(@NonNull Drawable drawable, @Nullable View.OnClickListener onClickListener) {
        ?? vIcon = new VIcon(getContext());
        vIcon.setIconStyle(4);
        vIcon.setImageDrawable(drawable);
        vIcon.setOnClickListener(onClickListener);
        m12092z(vIcon);
    }

    /* JADX INFO: renamed from: w */
    public void m12091w(@DrawableRes int i, @Nullable View.OnClickListener onClickListener) {
        m12090v(getContext().getDrawable(i), onClickListener);
    }

    /* JADX INFO: renamed from: z */
    public void m12092z(@NonNull View... viewArr) {
        m12088C(this.f13392d, Arrays.asList(viewArr), true);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        m12089E(charSequence, 21.0f, getResources().getColor(t0c0.e));
    }

    public VNavigationBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VNavigationBar(Context context) {
        this(context, null);
    }
}
