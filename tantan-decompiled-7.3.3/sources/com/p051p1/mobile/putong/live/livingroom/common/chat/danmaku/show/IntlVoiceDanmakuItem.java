package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.csl;
import p153l.fn2;
import p153l.hiv;
import p153l.htd0;
import p153l.isp;
import p153l.izs;
import p153l.jyb;
import p153l.l51;
import p153l.n3d0;
import p153l.ps40;
import p153l.qa00;
import p153l.qim;
import p153l.sh3;
import p153l.x20;
import p153l.y20;
import p153l.zrv;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class IntlVoiceDanmakuItem extends ConstraintLayout implements csl {

    /* JADX INFO: renamed from: d */
    public IntlVoiceDanmakuItem f49709d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f49710e;

    /* JADX INFO: renamed from: f */
    public VText f49711f;

    /* JADX INFO: renamed from: g */
    public VText f49712g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49713h;

    /* JADX INFO: renamed from: i */
    public GradientDrawable f49714i;

    /* JADX INFO: renamed from: j */
    public DownloadTask f49715j;

    /* JADX INFO: renamed from: k */
    public Bitmap f49716k;

    /* JADX INFO: renamed from: l */
    public Paint f49717l;

    /* JADX INFO: renamed from: m */
    public int f49718m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem$a */
    public class C12907a extends fn2 {
        public C12907a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            IntlVoiceDanmakuItem.this.f49711f.setMaxWidth(IntlVoiceDanmakuItem.this.f49718m - qa00.m175859d(66.0f));
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null) {
                return;
            }
            bnl0.m105525M0(IntlVoiceDanmakuItem.this.f49713h, true);
            int iM175859d = (int) (qa00.m175859d(14.0f) * (qimVar.getWidth() / qimVar.getHeight()));
            bnl0.m105507D0(iM175859d, IntlVoiceDanmakuItem.this.f49713h);
            IntlVoiceDanmakuItem.this.f49711f.setMaxWidth((IntlVoiceDanmakuItem.this.f49718m - qa00.m175859d(66.0f)) - iM175859d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem$b */
    public class C12908b extends ShapeDrawable.ShaderFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int[] f49720a;

        public C12908b(int[] iArr) {
            this.f49720a = iArr;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, i, i2, this.f49720a, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public IntlVoiceDanmakuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49717l = new Paint();
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m73793j0(sh3 sh3Var, View view) {
        x20 x20Var = sh3Var.f168585h;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static ShapeDrawable m73797o0(int[] iArr, float f, float f2) {
        float f3 = f - f2;
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, new RectF(f2, f2, f2, f2), new float[]{f3, f3, f3, f3, f3, f3, f3, f3});
        C12908b c12908b = new C12908b(iArr);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.setShaderFactory(c12908b);
        return shapeDrawable;
    }

    private void setViewWidth(String str) {
        this.f49717l.setTextSize(qa00.m175859d(13.0f));
        int iCeil = (int) (Math.ceil(this.f49717l.measureText(str)) + ((double) qa00.m175859d(66.0f)));
        this.f49718m = iCeil;
        if (iCeil < qa00.m175859d(150.0f)) {
            this.f49718m = qa00.m175859d(150.0f);
        }
        bnl0.m105507D0(this.f49718m, this);
    }

    @Override // p153l.csl
    /* JADX INFO: renamed from: B */
    public void mo73777B() {
        this.f49713h.setController(null);
    }

    public ViewGroup.MarginLayoutParams getCalculateParams() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f49718m, bnl0.f77545f);
        marginLayoutParams.leftMargin = bnl0.m105592y0();
        marginLayoutParams.topMargin = qa00.m175859d(8.0f);
        return marginLayoutParams;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m73798n0(View view) {
        isp.m141886a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ps40.m173584e(this.f49716k, this.f49715j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73798n0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m73799p0(File file) {
        this.f49716k = ps40.m173587h(this.f49709d, file);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m73800q0(File file) {
        this.f49709d.setBackgroundResource(0);
        this.f49716k = ps40.m173587h(this.f49709d, file);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m73801r0(final File file) {
        l51.m152887G(new Runnable() { // from class: l.hsp
            @Override // java.lang.Runnable
            public final void run() {
                this.f111466a.m73800q0(file);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m73802s0() {
        this.f49709d.setBackground(this.f49714i);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m73803t0(sh3 sh3Var) {
        final File fileM173583d = ps40.m173583d(getContext(), sh3Var.f168590m);
        if (fileM173583d.exists()) {
            l51.m152887G(new Runnable() { // from class: l.esp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f95645a.m73799p0(fileM173583d);
                }
            });
        } else {
            this.f49715j = ps40.m173585f(sh3Var.f168590m, fileM173583d, new y20() { // from class: l.fsp
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f100669a.m73801r0((File) obj);
                }
            }, new x20() { // from class: l.gsp
                @Override // p153l.x20
                public final void call() {
                    this.f106321a.m73802s0();
                }
            });
        }
    }

    @Override // p153l.csl
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void mo73779z(final sh3 sh3Var) {
        int[] iArr;
        setViewWidth(sh3Var.f168579b);
        biv.m104522g(this.f49710e, qa00.f156288A, sh3Var.f168582e, sh3Var.f168584g, sh3Var.f168583f);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.dsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlVoiceDanmakuItem.m73793j0(sh3Var, view);
            }
        });
        this.f49711f.setText(sh3Var.f168580c);
        this.f49712g.setText(sh3Var.f168579b);
        if (this.f49714i == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f49714i = gradientDrawable;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            this.f49714i.setCornerRadius(qa00.f156322i);
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
        this.f49714i.setColors(iArr);
        List<String> list3 = sh3Var.f168591n;
        if (jyb.m147479J(list3)) {
            this.f49709d.setBackground(this.f49714i);
        } else if (list3.size() >= 2) {
            this.f49709d.setBackground(new LayerDrawable(new Drawable[]{this.f49714i, m73797o0(new int[]{n3d0.m161283g(list3.get(0)), n3d0.m161283g(list3.get(1))}, qa00.f156322i, qa00.f156314a)}));
        }
        if (!TextUtils.isEmpty(sh3Var.f168590m)) {
            m73803t0(sh3Var);
        }
        BLiveUserLevel bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(sh3Var.f168581d);
        if (bLiveUserLevelM135170v == null || TextUtils.isEmpty(bLiveUserLevelM135170v.backendUrl)) {
            this.f49711f.setMaxWidth(this.f49718m - qa00.m175859d(66.0f));
        } else {
            izs.m142871v("context_livingAct", this.f49713h, bLiveUserLevelM135170v.backendUrl, qa00.m175859d(14.0f) * 3, qa00.m175859d(14.0f), false, false, false, new C12907a());
        }
    }
}
