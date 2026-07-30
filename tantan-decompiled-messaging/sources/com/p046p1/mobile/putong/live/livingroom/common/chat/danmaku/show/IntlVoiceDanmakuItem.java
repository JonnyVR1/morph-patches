package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

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
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.agv;
import p149l.bk40;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.eh3;
import p149l.fld0;
import p149l.ggv;
import p149l.hxs;
import p149l.iqp;
import p149l.kvc0;
import p149l.ngm;
import p149l.ppl;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.ym2;
import p149l.ypv;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class IntlVoiceDanmakuItem extends ConstraintLayout implements ppl {

    /* JADX INFO: renamed from: d */
    public IntlVoiceDanmakuItem f48861d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f48862e;

    /* JADX INFO: renamed from: f */
    public VText f48863f;

    /* JADX INFO: renamed from: g */
    public VText f48864g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f48865h;

    /* JADX INFO: renamed from: i */
    public GradientDrawable f48866i;

    /* JADX INFO: renamed from: j */
    public DownloadTask f48867j;

    /* JADX INFO: renamed from: k */
    public Bitmap f48868k;

    /* JADX INFO: renamed from: l */
    public Paint f48869l;

    /* JADX INFO: renamed from: m */
    public int f48870m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem$a */
    public class C12744a extends ym2 {
        public C12744a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            IntlVoiceDanmakuItem.this.f48863f.setMaxWidth(IntlVoiceDanmakuItem.this.f48870m - t100.m186890d(66.0f));
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            xdl0.m208345M0(IntlVoiceDanmakuItem.this.f48865h, true);
            int iM186890d = (int) (t100.m186890d(14.0f) * (ngmVar.getWidth() / ngmVar.getHeight()));
            xdl0.m208327D0(iM186890d, IntlVoiceDanmakuItem.this.f48865h);
            IntlVoiceDanmakuItem.this.f48863f.setMaxWidth((IntlVoiceDanmakuItem.this.f48870m - t100.m186890d(66.0f)) - iM186890d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem$b */
    public class C12745b extends ShapeDrawable.ShaderFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int[] f48872a;

        public C12745b(int[] iArr) {
            this.f48872a = iArr;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, i, i2, this.f48872a, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public IntlVoiceDanmakuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48869l = new Paint();
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m72610j0(eh3 eh3Var, View view) {
        d30 d30Var = eh3Var.f91287h;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static ShapeDrawable m72614o0(int[] iArr, float f, float f2) {
        float f3 = f - f2;
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, new RectF(f2, f2, f2, f2), new float[]{f3, f3, f3, f3, f3, f3, f3, f3});
        C12745b c12745b = new C12745b(iArr);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.setShaderFactory(c12745b);
        return shapeDrawable;
    }

    private void setViewWidth(String str) {
        this.f48869l.setTextSize(t100.m186890d(13.0f));
        int iCeil = (int) (Math.ceil(this.f48869l.measureText(str)) + ((double) t100.m186890d(66.0f)));
        this.f48870m = iCeil;
        if (iCeil < t100.m186890d(150.0f)) {
            this.f48870m = t100.m186890d(150.0f);
        }
        xdl0.m208327D0(this.f48870m, this);
    }

    @Override // p149l.ppl
    /* JADX INFO: renamed from: B */
    public void mo72594B() {
        this.f48865h.setController(null);
    }

    public ViewGroup.MarginLayoutParams getCalculateParams() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f48870m, xdl0.f192404f);
        marginLayoutParams.leftMargin = xdl0.m208412y0();
        marginLayoutParams.topMargin = t100.m186890d(8.0f);
        return marginLayoutParams;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m72615n0(View view) {
        iqp.m137783a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bk40.m102265e(this.f48868k, this.f48867j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72615n0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m72616p0(File file) {
        this.f48868k = bk40.m102268h(this.f48861d, file);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m72617q0(File file) {
        this.f48861d.setBackgroundResource(0);
        this.f48868k = bk40.m102268h(this.f48861d, file);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m72618r0(final File file) {
        e51.m114742G(new Runnable() { // from class: l.hqp
            @Override // java.lang.Runnable
            public final void run() {
                this.f109088a.m72617q0(file);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m72619s0() {
        this.f48861d.setBackground(this.f48866i);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m72620t0(eh3 eh3Var) {
        final File fileM102264d = bk40.m102264d(getContext(), eh3Var.f91292m);
        if (fileM102264d.exists()) {
            e51.m114742G(new Runnable() { // from class: l.eqp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92819a.m72616p0(fileM102264d);
                }
            });
        } else {
            this.f48867j = bk40.m102266f(eh3Var.f91292m, fileM102264d, new e30() { // from class: l.fqp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98830a.m72618r0((File) obj);
                }
            }, new d30() { // from class: l.gqp
                @Override // p149l.d30
                public final void call() {
                    this.f103968a.m72619s0();
                }
            });
        }
    }

    @Override // p149l.ppl
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void mo72596z(final eh3 eh3Var) {
        int[] iArr;
        setViewWidth(eh3Var.f91281b);
        agv.m96349g(this.f48862e, t100.f167226A, eh3Var.f91284e, eh3Var.f91286g, eh3Var.f91285f);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlVoiceDanmakuItem.m72610j0(eh3Var, view);
            }
        });
        this.f48863f.setText(eh3Var.f91282c);
        this.f48864g.setText(eh3Var.f91281b);
        if (this.f48866i == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f48866i = gradientDrawable;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            this.f48866i.setCornerRadius(t100.f167260i);
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
        this.f48866i.setColors(iArr);
        List<String> list3 = eh3Var.f91293n;
        if (vwb.m200296J(list3)) {
            this.f48861d.setBackground(this.f48866i);
        } else if (list3.size() >= 2) {
            this.f48861d.setBackground(new LayerDrawable(new Drawable[]{this.f48866i, m72614o0(new int[]{kvc0.m147358g(list3.get(0)), kvc0.m147358g(list3.get(1))}, t100.f167260i, t100.f167252a)}));
        }
        if (!TextUtils.isEmpty(eh3Var.f91292m)) {
            m72620t0(eh3Var);
        }
        BLiveUserLevel bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(eh3Var.f91283d);
        if (bLiveUserLevelM126036v == null || TextUtils.isEmpty(bLiveUserLevelM126036v.backendUrl)) {
            this.f48863f.setMaxWidth(this.f48870m - t100.m186890d(66.0f));
        } else {
            hxs.m133409v("context_livingAct", this.f48865h, bLiveUserLevelM126036v.backendUrl, t100.m186890d(14.0f) * 3, t100.m186890d(14.0f), false, false, false, new C12744a());
        }
    }
}
