package p149l;

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
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;

/* JADX INFO: loaded from: classes3.dex */
public class ow40 implements yvl<lw40> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f145938a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f145939b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f145940c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f145941d;

    /* JADX INFO: renamed from: e */
    public ImageView f145942e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f145943f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f145944g;

    /* JADX INFO: renamed from: h */
    public TextView f145945h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f145946i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f145947j;

    /* JADX INFO: renamed from: k */
    public TextView f145948k;

    /* JADX INFO: renamed from: l */
    public TextView f145949l;

    /* JADX INFO: renamed from: m */
    public float f145950m = 812.0f;

    /* JADX INFO: renamed from: n */
    public View f145951n;

    /* JADX INFO: renamed from: o */
    public MatchAct f145952o;

    /* JADX INFO: renamed from: p */
    public lw40 f145953p;

    /* JADX INFO: renamed from: l.ow40$a */
    public class C19056a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGADynamicEntity f145954a;

        /* JADX INFO: renamed from: l.ow40$a$a */
        public class a extends AnimListener {
            public a() {
            }

            @Override // com.tantan.library.svga.AnimListener
            public void onStart() {
                xdl0.m208344M(ow40.this.f145940c, false);
                xdl0.m208344M(ow40.this.f145939b, true);
                super.onStart();
            }
        }

        public C19056a(SVGADynamicEntity sVGADynamicEntity) {
            this.f145954a = sVGADynamicEntity;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            SVGALoader.with(ow40.this.f145952o).dynamic(this.f145954a).from("https://auto.tancdn.com/v1/raw/742c2a25-1a5c-441c-9433-72583a165ddf14.pdf").repeatCount(-1).autoPlay(true).animListener(new a()).into(ow40.this.f145939b);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            super.onStep(i);
        }
    }

    /* JADX INFO: renamed from: l.ow40$b */
    public static class C19057b {
        /* JADX INFO: renamed from: b */
        public static void m166284b(ow40 ow40Var, View view) {
            ow40Var.f145938a = (RelativeLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            ow40Var.f145939b = (SVGAnimationView) viewGroup.getChildAt(0);
            ow40Var.f145940c = (SVGAnimationView) viewGroup.getChildAt(1);
            ow40Var.f145941d = (RelativeLayout) viewGroup.getChildAt(2);
            ow40Var.f145942e = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
            ow40Var.f145943f = (RelativeLayout) viewGroup.getChildAt(3);
            ow40Var.f145944g = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            ow40Var.f145945h = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
            ow40Var.f145946i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
            ow40Var.f145947j = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
            ow40Var.f145948k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
            ow40Var.f145949l = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        }

        /* JADX INFO: renamed from: c */
        public static View m166285c(ow40 ow40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95876l7, viewGroup, false);
            m166284b(ow40Var, viewInflate);
            return viewInflate;
        }
    }

    public ow40(MatchAct matchAct) {
        this.f145952o = matchAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m166259A(View view) {
        this.f145953p.m151965N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m166277z(View view) {
        this.f145953p.m151964L0();
    }

    /* JADX INFO: renamed from: B */
    public void m166278B(User user, User user2) {
        xdl0.m208344M(this.f145939b, false);
        SVGALoader.with(this.f145952o).from("https://auto.tancdn.com/v1/raw/0e9b6e95-73f3-469a-9c2d-4a02b8fa42c114.pdf").repeatCount(-1).autoPlay(true).into(this.f145944g);
        SVGALoader.with(this.f145952o).from("https://auto.tancdn.com/v1/raw/84746e2a-9059-47ff-90af-07839ec09c0f14.pdf").repeatCount(-1).autoPlay(true).into(this.f145947j);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (user != null) {
            sVGADynamicEntity.setDynamicImage(user.m60124fp().profileMiddle().formatted(), "man");
        }
        if (user2 != null) {
            sVGADynamicEntity.setDynamicImage(user2.m60124fp().profileMiddle().formatted(), "woman");
        }
        SVGALoader.with(this.f145952o).from("https://auto.tancdn.com/v1/raw/05053d7f-77ec-4650-a3b2-9eeb949bbafb14.pdf").repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C19056a(sVGADynamicEntity)).autoPlay(true).into(this.f145940c);
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f145952o;
    }

    @Override // p149l.yvl
    public Animator enterAnimation() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f145951n, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(150L);
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f);
        int i = t100.f167231F;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f145941d, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat("translationY", -i, 0.0f));
        objectAnimatorOfPropertyValuesHolder2.setStartDelay(150L);
        objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this.f145943f, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", i, 0.0f));
        objectAnimatorOfPropertyValuesHolder3.setStartDelay(150L);
        objectAnimatorOfPropertyValuesHolder3.setDuration(500L);
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3);
        return animatorSet;
    }

    @Override // p149l.yvl
    public Animator exitAnimation() {
        return null;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM166280w = m166280w(layoutInflater, viewGroup);
        this.f145951n = viewM166280w;
        return viewM166280w;
    }

    @Override // p149l.yvl
    public void initAnimationState() {
        xdl0.m208344M(this.f145940c, true);
        xdl0.m208344M(this.f145939b, false);
    }

    /* JADX INFO: renamed from: r */
    public void m166279r() {
        xdl0.m208329E0(this.f145949l, new View.OnClickListener() { // from class: l.mw40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136017a.m166277z(view);
            }
        });
        xdl0.m208329E0(this.f145946i, new View.OnClickListener() { // from class: l.nw40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140886a.m166259A(view);
            }
        });
        float fM136795i = ikf0.m136795i(xdl0.m208408w0()) / this.f145950m;
        xdl0.m208360X(this.f145941d, t100.m186890d(64.0f * fM136795i));
        xdl0.m208360X(this.f145943f, t100.m186890d(287.0f * fM136795i));
        xdl0.m208357U(this.f145949l, t100.m186890d(fM136795i * 70.0f));
        this.f145948k.getPaint().setShader(new LinearGradient(0.0f, 0.0f, this.f145948k.getPaint().getTextSize() * this.f145948k.getText().length(), 0.0f, new int[]{Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761")}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: w */
    public View m166280w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19057b.m166285c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f145952o;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lw40 lw40Var) {
        this.f145953p = lw40Var;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.yvl
    /* JADX INFO: renamed from: h */
    public void mo129557h(int i, int i2) {
    }
}
