package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

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
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;
import com.p1.mobile.putong.ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import l.agv;
import l.bk40;
import l.d30;
import l.e30;
import l.e51;
import l.t100;
import l.vdt;
import l.xdl0;
import p002l.eh3;
import p002l.i1c;
import p002l.ppl;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DanmakuItem extends LinearLayout implements ppl {

    /* JADX INFO: renamed from: i */
    public static final int f4884i = t100.l;

    /* JADX INFO: renamed from: a */
    public DanmakuItem f4885a;

    /* JADX INFO: renamed from: b */
    public CommonMaskAvatarView f4886b;

    /* JADX INFO: renamed from: c */
    public VText f4887c;

    /* JADX INFO: renamed from: d */
    public VText f4888d;

    /* JADX INFO: renamed from: e */
    public MomoSVGAImageView f4889e;

    /* JADX INFO: renamed from: f */
    public GradientDrawable f4890f;

    /* JADX INFO: renamed from: g */
    public DownloadTask f4891g;

    /* JADX INFO: renamed from: h */
    public Bitmap f4892h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem$a */
    public class C0332a extends SVGAAnimListenerAdapter {
        public C0332a() {
        }
    }

    public DanmakuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6085d(eh3 eh3Var, View view) {
        d30 d30Var = eh3Var.f9781h;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m6087g(File file) {
        this.f4892h = bk40.h(this.f4885a, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m6088h(File file) {
        this.f4885a.setBackgroundResource(0);
        this.f4892h = bk40.h(this.f4885a, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m6089i(final File file) {
        e51.G(new Runnable() { // from class: l.g1c
            @Override // java.lang.Runnable
            public final void run() {
                this.f10721a.m6088h(file);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m6090j() {
        this.f4885a.setBackground(this.f4890f);
    }

    /* JADX INFO: renamed from: k */
    private void m6091k(eh3 eh3Var) {
        final File fileD = bk40.d(getContext(), eh3Var.f9786m);
        if (fileD.exists()) {
            e51.G(new Runnable() { // from class: l.d1c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9020a.m6087g(fileD);
                }
            });
        } else {
            this.f4891g = bk40.f(eh3Var.f9786m, fileD, new e30() { // from class: l.e1c
                public final void call(Object obj) {
                    this.f9537a.m6089i((File) obj);
                }
            }, new d30() { // from class: l.f1c
                public final void call() {
                    this.f10099a.m6090j();
                }
            });
        }
    }

    @Override // p002l.ppl
    /* JADX INFO: renamed from: B */
    public void mo6092B() {
        this.f4888d.getLayoutParams().width = xdl0.f;
    }

    /* JADX INFO: renamed from: f */
    public final void m6093f(View view) {
        i1c.m14976a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4889e.stopAnimCompletely();
        bk40.e(this.f4892h, this.f4891g);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6093f(this);
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
            if (xdl0.O0(childAt)) {
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

    @Override // p002l.ppl
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void mo6094z(final eh3 eh3Var) {
        int[] iArr;
        agv.g(this.f4886b, t100.A, eh3Var.f9778e, eh3Var.f9780g, eh3Var.f9779f);
        xdl0.E0(this.f4886b, new View.OnClickListener() { // from class: l.c1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DanmakuItem.m6085d(eh3Var, view);
            }
        });
        if (!vdt.b(2) && eh3Var.f9776c.length() > 6) {
            this.f4887c.setText(eh3Var.f9776c.substring(0, 6).concat("..."));
        } else if (!vdt.b(2) || eh3Var.f9776c.length() <= 4) {
            this.f4887c.setText(eh3Var.f9776c);
        } else {
            this.f4887c.setText(eh3Var.f9776c.substring(0, 4).concat("..."));
        }
        this.f4888d.setText(eh3Var.f9775b);
        if (this.f4890f == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f4890f = gradientDrawable;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            this.f4890f.setCornerRadius(t100.i);
        }
        this.f4890f.setAlpha((int) ((eh3Var.f9784k / 100.0f) * 255.0f));
        boolean zIsEmpty = TextUtils.isEmpty(eh3Var.f9785l);
        GradientDrawable gradientDrawable2 = this.f4890f;
        if (zIsEmpty) {
            gradientDrawable2.setStroke(0, 0);
        } else {
            gradientDrawable2.setStroke(t100.a, Color.parseColor(eh3Var.f9785l));
        }
        List<String> list = eh3Var.f9783j;
        if (list != null) {
            int size = list.size();
            List<String> list2 = eh3Var.f9783j;
            if (size == 1) {
                iArr = new int[]{Color.parseColor(list2.get(0)), Color.parseColor(eh3Var.f9783j.get(0))};
            } else {
                iArr = new int[list2.size()];
                for (int i = 0; i < eh3Var.f9783j.size(); i++) {
                    iArr[i] = Color.parseColor(eh3Var.f9783j.get(i));
                }
            }
        } else {
            iArr = new int[]{-16777216, -16777216};
        }
        this.f4890f.setColors(iArr);
        this.f4885a.setBackground(this.f4890f);
        if (!TextUtils.isEmpty(eh3Var.f9786m)) {
            m6091k(eh3Var);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(eh3Var.f9782i);
        MomoSVGAImageView momoSVGAImageView = this.f4889e;
        if (zIsEmpty2) {
            xdl0.M(momoSVGAImageView, false);
        } else {
            momoSVGAImageView.setVisibility(0);
            this.f4889e.loadSVGAAnimWithListener(eh3Var.f9782i, -1, new C0332a(), true);
        }
    }
}
