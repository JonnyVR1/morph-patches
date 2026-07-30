package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.view.MomoSVGAImageView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.csl;
import p153l.l51;
import p153l.ps40;
import p153l.qa00;
import p153l.sh3;
import p153l.v2c;
import p153l.wft;
import p153l.x20;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuItem extends LinearLayout implements csl {

    /* JADX INFO: renamed from: i */
    public static final int f49690i = qa00.f156325l;

    /* JADX INFO: renamed from: a */
    public DanmakuItem f49691a;

    /* JADX INFO: renamed from: b */
    public CommonMaskAvatarView f49692b;

    /* JADX INFO: renamed from: c */
    public VText f49693c;

    /* JADX INFO: renamed from: d */
    public VText f49694d;

    /* JADX INFO: renamed from: e */
    public MomoSVGAImageView f49695e;

    /* JADX INFO: renamed from: f */
    public GradientDrawable f49696f;

    /* JADX INFO: renamed from: g */
    public DownloadTask f49697g;

    /* JADX INFO: renamed from: h */
    public Bitmap f49698h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem$a */
    public class C12906a extends SVGAAnimListenerAdapter {
        public C12906a() {
        }
    }

    public DanmakuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m73770d(sh3 sh3Var, View view) {
        x20 x20Var = sh3Var.f168585h;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m73772g(File file) {
        this.f49698h = ps40.m173587h(this.f49691a, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m73773h(File file) {
        this.f49691a.setBackgroundResource(0);
        this.f49698h = ps40.m173587h(this.f49691a, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m73774i(final File file) {
        l51.m152887G(new Runnable() { // from class: l.t2c
            @Override // java.lang.Runnable
            public final void run() {
                this.f171732a.m73773h(file);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m73775j() {
        this.f49691a.setBackground(this.f49696f);
    }

    /* JADX INFO: renamed from: k */
    private void m73776k(sh3 sh3Var) {
        final File fileM173583d = ps40.m173583d(getContext(), sh3Var.f168590m);
        if (fileM173583d.exists()) {
            l51.m152887G(new Runnable() { // from class: l.q2c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155317a.m73772g(fileM173583d);
                }
            });
        } else {
            this.f49697g = ps40.m173585f(sh3Var.f168590m, fileM173583d, new y20() { // from class: l.r2c
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160929a.m73774i((File) obj);
                }
            }, new x20() { // from class: l.s2c
                @Override // p153l.x20
                public final void call() {
                    this.f165875a.m73775j();
                }
            });
        }
    }

    @Override // p153l.csl
    /* JADX INFO: renamed from: B */
    public void mo73777B() {
        this.f49694d.getLayoutParams().width = bnl0.f77545f;
    }

    /* JADX INFO: renamed from: f */
    public final void m73778f(View view) {
        v2c.m199127a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49695e.stopAnimCompletely();
        ps40.m173584e(this.f49698h, this.f49697g);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73778f(this);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DanmakuItem danmakuItem;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i5 = 0;
        while (i5 < this.getChildCount()) {
            View childAt = this.getChildAt(i5);
            if (bnl0.m105529O0(childAt)) {
                danmakuItem = this;
                i3 = i;
                i4 = i2;
                danmakuItem.measureChildWithMargins(childAt, i3, 0, i4, 0);
                paddingLeft += childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin + ((LinearLayout.LayoutParams) childAt.getLayoutParams()).rightMargin;
            } else {
                danmakuItem = this;
                i3 = i;
                i4 = i2;
            }
            i5++;
            this = danmakuItem;
            i = i3;
            i2 = i4;
        }
        this.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), i2);
    }

    @Override // p153l.csl
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void mo73779z(final sh3 sh3Var) {
        int[] iArr;
        biv.m104522g(this.f49692b, qa00.f156288A, sh3Var.f168582e, sh3Var.f168584g, sh3Var.f168583f);
        bnl0.m105509E0(this.f49692b, new View.OnClickListener() { // from class: l.p2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DanmakuItem.m73770d(sh3Var, view);
            }
        });
        if (!wft.m206159b(2) && sh3Var.f168580c.length() > 6) {
            this.f49693c.setText(sh3Var.f168580c.substring(0, 6).concat("..."));
        } else if (!wft.m206159b(2) || sh3Var.f168580c.length() <= 4) {
            this.f49693c.setText(sh3Var.f168580c);
        } else {
            this.f49693c.setText(sh3Var.f168580c.substring(0, 4).concat("..."));
        }
        this.f49694d.setText(sh3Var.f168579b);
        if (this.f49696f == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f49696f = gradientDrawable;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            this.f49696f.setCornerRadius(qa00.f156322i);
        }
        this.f49696f.setAlpha((int) ((sh3Var.f168588k / 100.0f) * 255.0f));
        boolean zIsEmpty = TextUtils.isEmpty(sh3Var.f168589l);
        GradientDrawable gradientDrawable2 = this.f49696f;
        if (zIsEmpty) {
            gradientDrawable2.setStroke(0, 0);
        } else {
            gradientDrawable2.setStroke(qa00.f156314a, Color.parseColor(sh3Var.f168589l));
        }
        List<String> list = sh3Var.f168587j;
        if (list != null) {
            int size = list.size();
            List<String> list2 = sh3Var.f168587j;
            if (size == 1) {
                iArr = new int[]{Color.parseColor(list2.get(0)), Color.parseColor(sh3Var.f168587j.get(0))};
            } else {
                iArr = new int[list2.size()];
                for (int i = 0; i < sh3Var.f168587j.size(); i++) {
                    iArr[i] = Color.parseColor(sh3Var.f168587j.get(i));
                }
            }
        } else {
            iArr = new int[]{RoundedDrawable.DEFAULT_BORDER_COLOR, RoundedDrawable.DEFAULT_BORDER_COLOR};
        }
        this.f49696f.setColors(iArr);
        this.f49691a.setBackground(this.f49696f);
        if (!TextUtils.isEmpty(sh3Var.f168590m)) {
            m73776k(sh3Var);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(sh3Var.f168586i);
        MomoSVGAImageView momoSVGAImageView = this.f49695e;
        if (zIsEmpty2) {
            bnl0.m105524M(momoSVGAImageView, false);
        } else {
            momoSVGAImageView.setVisibility(0);
            this.f49695e.loadSVGAAnimWithListener(sh3Var.f168586i, -1, new C12906a(), true);
        }
    }
}
