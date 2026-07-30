package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

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
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import l.agv;
import l.bk40;
import l.d30;
import l.e30;
import l.e51;
import l.fld0;
import l.ggv;
import l.hce;
import l.hxs;
import l.kvc0;
import l.ngm;
import l.t100;
import l.vwb;
import l.xdl0;
import l.ym2;
import l.ypv;
import p002l.eh3;
import p002l.iqp;
import p002l.ppl;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlVoiceDanmakuItem extends ConstraintLayout implements ppl {

    /* JADX INFO: renamed from: d */
    public IntlVoiceDanmakuItem f4903d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f4904e;

    /* JADX INFO: renamed from: f */
    public VText f4905f;

    /* JADX INFO: renamed from: g */
    public VText f4906g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4907h;

    /* JADX INFO: renamed from: i */
    public GradientDrawable f4908i;

    /* JADX INFO: renamed from: j */
    public DownloadTask f4909j;

    /* JADX INFO: renamed from: k */
    public Bitmap f4910k;

    /* JADX INFO: renamed from: l */
    public Paint f4911l;

    /* JADX INFO: renamed from: m */
    public int f4912m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem$a */
    public class C0333a extends ym2 {
        public C0333a() {
        }

        /* JADX INFO: renamed from: c */
        public void m6121c(String str, Throwable th) {
            super.c(str, th);
            IntlVoiceDanmakuItem.this.f4905f.setMaxWidth(IntlVoiceDanmakuItem.this.f4912m - t100.d(66.0f));
        }

        /* JADX INFO: renamed from: h */
        public void m6122h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            xdl0.M0(IntlVoiceDanmakuItem.this.f4907h, true);
            int iD = (int) (t100.d(14.0f) * (ngmVar.getWidth() / ngmVar.getHeight()));
            xdl0.D0(iD, new View[]{IntlVoiceDanmakuItem.this.f4907h});
            IntlVoiceDanmakuItem.this.f4905f.setMaxWidth((IntlVoiceDanmakuItem.this.f4912m - t100.d(66.0f)) - iD);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem$b */
    public class C0334b extends ShapeDrawable.ShaderFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int[] f4914a;

        public C0334b(int[] iArr) {
            this.f4914a = iArr;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, i, i2, this.f4914a, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public IntlVoiceDanmakuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4911l = new Paint();
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m6110j0(eh3 eh3Var, View view) {
        d30 d30Var = eh3Var.f9781h;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static ShapeDrawable m6114o0(int[] iArr, float f, float f2) {
        float f3 = f - f2;
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, new RectF(f2, f2, f2, f2), new float[]{f3, f3, f3, f3, f3, f3, f3, f3});
        C0334b c0334b = new C0334b(iArr);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.setShaderFactory(c0334b);
        return shapeDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setViewWidth(String str) {
        this.f4911l.setTextSize(t100.d(13.0f));
        int iCeil = (int) (Math.ceil(this.f4911l.measureText(str)) + ((double) t100.d(66.0f)));
        this.f4912m = iCeil;
        if (iCeil < t100.d(150.0f)) {
            this.f4912m = t100.d(150.0f);
        }
        xdl0.D0(this.f4912m, new View[]{this});
    }

    @Override // p002l.ppl
    /* JADX INFO: renamed from: B */
    public void mo6092B() {
        this.f4907h.setController((hce) null);
    }

    public ViewGroup.MarginLayoutParams getCalculateParams() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f4912m, xdl0.f);
        marginLayoutParams.leftMargin = xdl0.y0();
        marginLayoutParams.topMargin = t100.d(8.0f);
        return marginLayoutParams;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m6115n0(View view) {
        iqp.m15297a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        bk40.e(this.f4910k, this.f4909j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6115n0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m6116p0(File file) {
        this.f4910k = bk40.h(this.f4903d, file);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m6117q0(File file) {
        this.f4903d.setBackgroundResource(0);
        this.f4910k = bk40.h(this.f4903d, file);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m6118r0(final File file) {
        e51.G(new Runnable() { // from class: l.hqp
            @Override // java.lang.Runnable
            public final void run() {
                this.f12227a.m6117q0(file);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m6119s0() {
        this.f4903d.setBackground(this.f4908i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final void m6120t0(eh3 eh3Var) {
        final File fileD = bk40.d(getContext(), eh3Var.f9786m);
        if (fileD.exists()) {
            e51.G(new Runnable() { // from class: l.eqp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9933a.m6116p0(fileD);
                }
            });
        } else {
            this.f4909j = bk40.f(eh3Var.f9786m, fileD, new e30() { // from class: l.fqp
                public final void call(Object obj) {
                    this.f10600a.m6118r0((File) obj);
                }
            }, new d30() { // from class: l.gqp
                public final void call() {
                    this.f11581a.m6119s0();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.ppl
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void mo6094z(final eh3 eh3Var) {
        int[] iArr;
        setViewWidth(eh3Var.f9775b);
        agv.g(this.f4904e, t100.A, eh3Var.f9778e, eh3Var.f9780g, eh3Var.f9779f);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlVoiceDanmakuItem.m6110j0(eh3Var, view);
            }
        });
        this.f4905f.setText(eh3Var.f9776c);
        this.f4906g.setText(eh3Var.f9775b);
        if (this.f4908i == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f4908i = gradientDrawable;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            this.f4908i.setCornerRadius(t100.i);
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
        this.f4908i.setColors(iArr);
        List<String> list3 = eh3Var.f9787n;
        if (vwb.J(list3)) {
            this.f4903d.setBackground(this.f4908i);
        } else if (list3.size() >= 2) {
            this.f4903d.setBackground(new LayerDrawable(new Drawable[]{this.f4908i, m6114o0(new int[]{kvc0.g(list3.get(0)), kvc0.g(list3.get(1))}, t100.i, t100.a)}));
        }
        if (!TextUtils.isEmpty(eh3Var.f9786m)) {
            m6120t0(eh3Var);
        }
        BLiveUserLevel bLiveUserLevelV = ((ggv) ypv.l(fld0.c)).v(eh3Var.f9777d);
        if (bLiveUserLevelV == null || TextUtils.isEmpty(bLiveUserLevelV.backendUrl)) {
            this.f4905f.setMaxWidth(this.f4912m - t100.d(66.0f));
        } else {
            hxs.v("context_livingAct", this.f4907h, bLiveUserLevelV.backendUrl, t100.d(14.0f) * 3, t100.d(14.0f), false, false, false, new C0333a());
        }
    }
}
