package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

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
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p147v.VText;
import p149l.agv;
import p149l.bk40;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.eh3;
import p149l.i1c;
import p149l.ppl;
import p149l.t100;
import p149l.vdt;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuItem extends LinearLayout implements ppl {

    /* JADX INFO: renamed from: i */
    public static final int f48842i = t100.f167263l;

    /* JADX INFO: renamed from: a */
    public DanmakuItem f48843a;

    /* JADX INFO: renamed from: b */
    public CommonMaskAvatarView f48844b;

    /* JADX INFO: renamed from: c */
    public VText f48845c;

    /* JADX INFO: renamed from: d */
    public VText f48846d;

    /* JADX INFO: renamed from: e */
    public MomoSVGAImageView f48847e;

    /* JADX INFO: renamed from: f */
    public GradientDrawable f48848f;

    /* JADX INFO: renamed from: g */
    public DownloadTask f48849g;

    /* JADX INFO: renamed from: h */
    public Bitmap f48850h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem$a */
    public class C12743a extends SVGAAnimListenerAdapter {
        public C12743a() {
        }
    }

    public DanmakuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m72587d(eh3 eh3Var, View view) {
        d30 d30Var = eh3Var.f91287h;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m72589g(File file) {
        this.f48850h = bk40.m102268h(this.f48843a, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m72590h(File file) {
        this.f48843a.setBackgroundResource(0);
        this.f48850h = bk40.m102268h(this.f48843a, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m72591i(final File file) {
        e51.m114742G(new Runnable() { // from class: l.g1c
            @Override // java.lang.Runnable
            public final void run() {
                this.f100135a.m72590h(file);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m72592j() {
        this.f48843a.setBackground(this.f48848f);
    }

    /* JADX INFO: renamed from: k */
    private void m72593k(eh3 eh3Var) {
        final File fileM102264d = bk40.m102264d(getContext(), eh3Var.f91292m);
        if (fileM102264d.exists()) {
            e51.m114742G(new Runnable() { // from class: l.d1c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83256a.m72589g(fileM102264d);
                }
            });
        } else {
            this.f48849g = bk40.m102266f(eh3Var.f91292m, fileM102264d, new e30() { // from class: l.e1c
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88745a.m72591i((File) obj);
                }
            }, new d30() { // from class: l.f1c
                @Override // p149l.d30
                public final void call() {
                    this.f94063a.m72592j();
                }
            });
        }
    }

    @Override // p149l.ppl
    /* JADX INFO: renamed from: B */
    public void mo72594B() {
        this.f48846d.getLayoutParams().width = xdl0.f192404f;
    }

    /* JADX INFO: renamed from: f */
    public final void m72595f(View view) {
        i1c.m133968a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48847e.stopAnimCompletely();
        bk40.m102265e(this.f48850h, this.f48849g);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72595f(this);
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
            if (xdl0.m208349O0(childAt)) {
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

    @Override // p149l.ppl
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void mo72596z(final eh3 eh3Var) {
        int[] iArr;
        agv.m96349g(this.f48844b, t100.f167226A, eh3Var.f91284e, eh3Var.f91286g, eh3Var.f91285f);
        xdl0.m208329E0(this.f48844b, new View.OnClickListener() { // from class: l.c1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DanmakuItem.m72587d(eh3Var, view);
            }
        });
        if (!vdt.m198092b(2) && eh3Var.f91282c.length() > 6) {
            this.f48845c.setText(eh3Var.f91282c.substring(0, 6).concat("..."));
        } else if (!vdt.m198092b(2) || eh3Var.f91282c.length() <= 4) {
            this.f48845c.setText(eh3Var.f91282c);
        } else {
            this.f48845c.setText(eh3Var.f91282c.substring(0, 4).concat("..."));
        }
        this.f48846d.setText(eh3Var.f91281b);
        if (this.f48848f == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f48848f = gradientDrawable;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            this.f48848f.setCornerRadius(t100.f167260i);
        }
        this.f48848f.setAlpha((int) ((eh3Var.f91290k / 100.0f) * 255.0f));
        boolean zIsEmpty = TextUtils.isEmpty(eh3Var.f91291l);
        GradientDrawable gradientDrawable2 = this.f48848f;
        if (zIsEmpty) {
            gradientDrawable2.setStroke(0, 0);
        } else {
            gradientDrawable2.setStroke(t100.f167252a, Color.parseColor(eh3Var.f91291l));
        }
        List<String> list = eh3Var.f91289j;
        if (list != null) {
            int size = list.size();
            List<String> list2 = eh3Var.f91289j;
            if (size == 1) {
                iArr = new int[]{Color.parseColor(list2.get(0)), Color.parseColor(eh3Var.f91289j.get(0))};
            } else {
                iArr = new int[list2.size()];
                for (int i = 0; i < eh3Var.f91289j.size(); i++) {
                    iArr[i] = Color.parseColor(eh3Var.f91289j.get(i));
                }
            }
        } else {
            iArr = new int[]{RoundedDrawable.DEFAULT_BORDER_COLOR, RoundedDrawable.DEFAULT_BORDER_COLOR};
        }
        this.f48848f.setColors(iArr);
        this.f48843a.setBackground(this.f48848f);
        if (!TextUtils.isEmpty(eh3Var.f91292m)) {
            m72593k(eh3Var);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(eh3Var.f91288i);
        MomoSVGAImageView momoSVGAImageView = this.f48847e;
        if (zIsEmpty2) {
            xdl0.m208344M(momoSVGAImageView, false);
        } else {
            momoSVGAImageView.setVisibility(0);
            this.f48847e.loadSVGAAnimWithListener(eh3Var.f91288i, -1, new C12743a(), true);
        }
    }
}
