package p153l;

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
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;

/* JADX INFO: loaded from: classes3.dex */
public class d550 implements qyl<a550> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f85102a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f85103b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f85104c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f85105d;

    /* JADX INFO: renamed from: e */
    public ImageView f85106e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f85107f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f85108g;

    /* JADX INFO: renamed from: h */
    public TextView f85109h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f85110i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f85111j;

    /* JADX INFO: renamed from: k */
    public TextView f85112k;

    /* JADX INFO: renamed from: l */
    public TextView f85113l;

    /* JADX INFO: renamed from: m */
    public float f85114m = 812.0f;

    /* JADX INFO: renamed from: n */
    public View f85115n;

    /* JADX INFO: renamed from: o */
    public MatchAct f85116o;

    /* JADX INFO: renamed from: p */
    public a550 f85117p;

    /* JADX INFO: renamed from: l.d550$a */
    public class C16450a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGADynamicEntity f85118a;

        /* JADX INFO: renamed from: l.d550$a$a */
        public class a extends AnimListener {
            public a() {
            }

            @Override // com.tantan.library.svga.AnimListener
            public void onStart() {
                bnl0.m105524M(d550.this.f85104c, false);
                bnl0.m105524M(d550.this.f85103b, true);
                super.onStart();
            }
        }

        public C16450a(SVGADynamicEntity sVGADynamicEntity) {
            this.f85118a = sVGADynamicEntity;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            SVGALoader.with(d550.this.f85116o).dynamic(this.f85118a).from("https://auto.tancdn.com/v1/raw/742c2a25-1a5c-441c-9433-72583a165ddf14.pdf").repeatCount(-1).autoPlay(true).animListener(new a()).into(d550.this.f85103b);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            super.onStep(i);
        }
    }

    /* JADX INFO: renamed from: l.d550$b */
    public static class C16451b {
        /* JADX INFO: renamed from: b */
        public static void m114288b(d550 d550Var, View view) {
            d550Var.f85102a = (RelativeLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            d550Var.f85103b = (SVGAnimationView) viewGroup.getChildAt(0);
            d550Var.f85104c = (SVGAnimationView) viewGroup.getChildAt(1);
            d550Var.f85105d = (RelativeLayout) viewGroup.getChildAt(2);
            d550Var.f85106e = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
            d550Var.f85107f = (RelativeLayout) viewGroup.getChildAt(3);
            d550Var.f85108g = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            d550Var.f85109h = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
            d550Var.f85110i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
            d550Var.f85111j = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
            d550Var.f85112k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
            d550Var.f85113l = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        }

        /* JADX INFO: renamed from: c */
        public static View m114289c(d550 d550Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f125947m7, viewGroup, false);
            m114288b(d550Var, viewInflate);
            return viewInflate;
        }
    }

    public d550(MatchAct matchAct) {
        this.f85116o = matchAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m114262A(View view) {
        this.f85117p.m96039N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m114280z(View view) {
        this.f85117p.m96038L0();
    }

    /* JADX INFO: renamed from: B */
    public void m114281B(User user, User user2) {
        bnl0.m105524M(this.f85103b, false);
        SVGALoader.with(this.f85116o).from("https://auto.tancdn.com/v1/raw/0e9b6e95-73f3-469a-9c2d-4a02b8fa42c114.pdf").repeatCount(-1).autoPlay(true).into(this.f85108g);
        SVGALoader.with(this.f85116o).from("https://auto.tancdn.com/v1/raw/84746e2a-9059-47ff-90af-07839ec09c0f14.pdf").repeatCount(-1).autoPlay(true).into(this.f85111j);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (user != null) {
            sVGADynamicEntity.setDynamicImage(user.m61308fp().profileMiddle().formatted(), "man");
        }
        if (user2 != null) {
            sVGADynamicEntity.setDynamicImage(user2.m61308fp().profileMiddle().formatted(), "woman");
        }
        SVGALoader.with(this.f85116o).from("https://auto.tancdn.com/v1/raw/05053d7f-77ec-4650-a3b2-9eeb949bbafb14.pdf").repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C16450a(sVGADynamicEntity)).autoPlay(true).into(this.f85104c);
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f85116o;
    }

    @Override // p153l.qyl
    public Animator enterAnimation() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f85115n, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(150L);
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f);
        int i = qa00.f156293F;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f85105d, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat("translationY", -i, 0.0f));
        objectAnimatorOfPropertyValuesHolder2.setStartDelay(150L);
        objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this.f85107f, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", i, 0.0f));
        objectAnimatorOfPropertyValuesHolder3.setStartDelay(150L);
        objectAnimatorOfPropertyValuesHolder3.setDuration(500L);
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3);
        return animatorSet;
    }

    @Override // p153l.qyl
    public Animator exitAnimation() {
        return null;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM114284w = m114284w(layoutInflater, viewGroup);
        this.f85115n = viewM114284w;
        return viewM114284w;
    }

    @Override // p153l.qyl
    public void initAnimationState() {
        bnl0.m105524M(this.f85104c, true);
        bnl0.m105524M(this.f85103b, false);
    }

    /* JADX INFO: renamed from: r */
    public void m114283r() {
        bnl0.m105509E0(this.f85113l, new View.OnClickListener() { // from class: l.b550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75023a.m114280z(view);
            }
        });
        bnl0.m105509E0(this.f85110i, new View.OnClickListener() { // from class: l.c550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79796a.m114262A(view);
            }
        });
        float fM182965i = rsf0.m182965i(bnl0.m105588w0()) / this.f85114m;
        bnl0.m105540X(this.f85105d, qa00.m175859d(64.0f * fM182965i));
        bnl0.m105540X(this.f85107f, qa00.m175859d(287.0f * fM182965i));
        bnl0.m105537U(this.f85113l, qa00.m175859d(fM182965i * 70.0f));
        this.f85112k.getPaint().setShader(new LinearGradient(0.0f, 0.0f, this.f85112k.getPaint().getTextSize() * this.f85112k.getText().length(), 0.0f, new int[]{Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761")}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: w */
    public View m114284w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16451b.m114289c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f85116o;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(a550 a550Var) {
        this.f85117p = a550Var;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.qyl
    /* JADX INFO: renamed from: h */
    public void mo114282h(int i, int i2) {
    }
}
