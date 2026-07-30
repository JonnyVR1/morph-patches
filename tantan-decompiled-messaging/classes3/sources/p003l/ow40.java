package p003l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import l.f6c0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ow40 implements yvl<lw40> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f6253a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f6254b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f6255c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f6256d;

    /* JADX INFO: renamed from: e */
    public ImageView f6257e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f6258f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f6259g;

    /* JADX INFO: renamed from: h */
    public TextView f6260h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f6261i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f6262j;

    /* JADX INFO: renamed from: k */
    public TextView f6263k;

    /* JADX INFO: renamed from: l */
    public TextView f6264l;

    /* JADX INFO: renamed from: m */
    public float f6265m = 812.0f;

    /* JADX INFO: renamed from: n */
    public View f6266n;

    /* JADX INFO: renamed from: o */
    public MatchAct f6267o;

    /* JADX INFO: renamed from: p */
    public lw40 f6268p;

    /* JADX INFO: renamed from: l.ow40$a */
    public class C0460a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGADynamicEntity f6269a;

        /* JADX INFO: renamed from: l.ow40$a$a */
        public class a extends AnimListener {
            public a() {
            }

            public void onStart() {
                xdl0.M(ow40.this.f6255c, false);
                xdl0.M(ow40.this.f6254b, true);
                super.onStart();
            }
        }

        public C0460a(SVGADynamicEntity sVGADynamicEntity) {
            this.f6269a = sVGADynamicEntity;
        }

        public void onFinished() {
            super.onFinished();
            SVGALoader.with(ow40.this.f6267o).dynamic(this.f6269a).from("https://auto.tancdn.com/v1/raw/742c2a25-1a5c-441c-9433-72583a165ddf14.pdf").repeatCount(-1).autoPlay(true).animListener(new a()).into(ow40.this.f6254b);
        }

        public void onStep(int i) {
            super.onStep(i);
        }
    }

    /* JADX INFO: renamed from: l.ow40$b */
    public static class C0461b {
        /* JADX INFO: renamed from: b */
        public static void m6762b(ow40 ow40Var, View view) {
            ow40Var.f6253a = (RelativeLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            ow40Var.f6254b = viewGroup.getChildAt(0);
            ow40Var.f6255c = viewGroup.getChildAt(1);
            ow40Var.f6256d = (RelativeLayout) viewGroup.getChildAt(2);
            ow40Var.f6257e = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
            ow40Var.f6258f = (RelativeLayout) viewGroup.getChildAt(3);
            ow40Var.f6259g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            ow40Var.f6260h = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
            ow40Var.f6261i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
            ow40Var.f6262j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
            ow40Var.f6263k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
            ow40Var.f6264l = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        }

        /* JADX INFO: renamed from: c */
        public static View m6763c(ow40 ow40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.l7, viewGroup, false);
            m6762b(ow40Var, viewInflate);
            return viewInflate;
        }
    }

    public ow40(MatchAct matchAct) {
        this.f6267o = matchAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m6735A(View view) {
        this.f6268p.m6162N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m6753z(View view) {
        this.f6268p.m6161L0();
    }

    /* JADX INFO: renamed from: B */
    public void m6754B(User user, User user2) {
        xdl0.M(this.f6254b, false);
        SVGALoader.with(this.f6267o).from("https://auto.tancdn.com/v1/raw/0e9b6e95-73f3-469a-9c2d-4a02b8fa42c114.pdf").repeatCount(-1).autoPlay(true).into(this.f6259g);
        SVGALoader.with(this.f6267o).from("https://auto.tancdn.com/v1/raw/84746e2a-9059-47ff-90af-07839ec09c0f14.pdf").repeatCount(-1).autoPlay(true).into(this.f6262j);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (user != null) {
            sVGADynamicEntity.setDynamicImage(user.fp().profileMiddle().formatted(), "man");
        }
        if (user2 != null) {
            sVGADynamicEntity.setDynamicImage(user2.fp().profileMiddle().formatted(), "woman");
        }
        SVGALoader.with(this.f6267o).from("https://auto.tancdn.com/v1/raw/05053d7f-77ec-4650-a3b2-9eeb949bbafb14.pdf").repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C0460a(sVGADynamicEntity)).autoPlay(true).into(this.f6255c);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6755C0() {
        return this.f6267o;
    }

    @Override // p003l.yvl
    public Animator enterAnimation() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f6266n, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(150L);
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f);
        int i = t100.F;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f6256d, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat("translationY", -i, 0.0f));
        objectAnimatorOfPropertyValuesHolder2.setStartDelay(150L);
        objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this.f6258f, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", i, 0.0f));
        objectAnimatorOfPropertyValuesHolder3.setStartDelay(150L);
        objectAnimatorOfPropertyValuesHolder3.setDuration(500L);
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3);
        return animatorSet;
    }

    @Override // p003l.yvl
    public Animator exitAnimation() {
        return null;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM6758w = m6758w(layoutInflater, viewGroup);
        this.f6266n = viewM6758w;
        return viewM6758w;
    }

    @Override // p003l.yvl
    public void initAnimationState() {
        xdl0.M(this.f6255c, true);
        xdl0.M(this.f6254b, false);
    }

    /* JADX INFO: renamed from: r */
    public void m6757r() {
        xdl0.E0(this.f6264l, new View.OnClickListener() { // from class: l.mw40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5785a.m6753z(view);
            }
        });
        xdl0.E0(this.f6261i, new View.OnClickListener() { // from class: l.nw40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5987a.m6735A(view);
            }
        });
        float fM5152i = ikf0.m5152i(xdl0.w0()) / this.f6265m;
        xdl0.X(this.f6256d, t100.d(64.0f * fM5152i));
        xdl0.X(this.f6258f, t100.d(287.0f * fM5152i));
        xdl0.U(this.f6264l, t100.d(fM5152i * 70.0f));
        this.f6263k.getPaint().setShader(new LinearGradient(0.0f, 0.0f, this.f6263k.getPaint().getTextSize() * this.f6263k.getText().length(), 0.0f, new int[]{Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761")}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: w */
    public View m6758w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0461b.m6763c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f6267o;
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m6756i1(lw40 lw40Var) {
        this.f6268p = lw40Var;
    }

    public void destroy() {
    }

    @Override // p003l.yvl
    /* JADX INFO: renamed from: h */
    public void mo4943h(int i, int i2) {
    }
}
