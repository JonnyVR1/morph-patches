package com.p051p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p153l.adc0;
import p153l.bnf;
import p153l.bnl0;
import p153l.bvl;
import p153l.kec0;
import p153l.pf60;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedOperationNewUiButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f23567c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f23568d;

    /* JADX INFO: renamed from: e */
    public View f23569e;

    /* JADX INFO: renamed from: f */
    public ImageView f23570f;

    /* JADX INFO: renamed from: g */
    public boolean f23571g;

    /* JADX INFO: renamed from: h */
    public String f23572h;

    /* JADX INFO: renamed from: i */
    public boolean f23573i;

    /* JADX INFO: renamed from: j */
    public C8140b f23574j;

    /* JADX INFO: renamed from: k */
    public C8140b f23575k;

    /* JADX INFO: renamed from: l */
    public String f23576l;

    /* JADX INFO: renamed from: m */
    public boolean f23577m;

    /* JADX INFO: renamed from: n */
    public boolean f23578n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton$a */
    public class C8139a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f23579a;

        public C8139a(String str) {
            this.f23579a = str;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            bnl0.m105524M(HomeCardExpandedOperationNewUiButton.this.f23570f, true);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = HomeCardExpandedOperationNewUiButton.this;
            if (homeCardExpandedOperationNewUiButton.f23577m) {
                String unused = homeCardExpandedOperationNewUiButton.f23572h;
            }
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            bnl0.m105524M(HomeCardExpandedOperationNewUiButton.this.f23570f, false);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = HomeCardExpandedOperationNewUiButton.this;
            if (homeCardExpandedOperationNewUiButton.f23577m) {
                boolean unused = homeCardExpandedOperationNewUiButton.f23571g;
                String unused2 = HomeCardExpandedOperationNewUiButton.this.f23572h;
                HomeCardExpandedOperationNewUiButton.this.f23568d.getAlpha();
                HomeCardExpandedOperationNewUiButton.this.f23567c.getAlpha();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton$b */
    public static class C8140b {

        /* JADX INFO: renamed from: a */
        public float f23581a;

        /* JADX INFO: renamed from: b */
        public float f23582b;

        /* JADX INFO: renamed from: c */
        public boolean f23583c;

        /* JADX INFO: renamed from: d */
        public float f23584d;

        /* JADX INFO: renamed from: e */
        public float f23585e;

        public C8140b() {
            this.f23581a = 1.0f;
            this.f23583c = false;
            this.f23584d = 0.0f;
            this.f23585e = 0.004761905f;
        }
    }

    public HomeCardExpandedOperationNewUiButton(Context context) {
        super(context);
        this.f23571g = false;
        this.f23573i = false;
        this.f23574j = new C8140b();
        this.f23575k = new C8140b();
        this.f23576l = null;
        this.f23577m = false;
        this.f23578n = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m39432e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return ((Act) getContext()).getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: m */
    private boolean m39438m() {
        ViewParent parent = getParent();
        while (parent != null) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() == 8) {
                    return false;
                }
                if (parent instanceof bvl) {
                    return true;
                }
                parent = viewGroup.getParent();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private void m39439o() {
        this.f23574j.f23583c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: p */
    private void m39440p() {
        this.f23575k.f23583c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: q */
    private void m39441q() {
        if (!this.f23573i && m39438m()) {
            C8140b c8140b = this.f23574j;
            if (c8140b.f23581a == -1.0f || c8140b.f23584d == 0.0f) {
                return;
            }
            c8140b.f23585e = 1.0f / (getRefreshRate() * 0.21f);
            C8140b c8140b2 = this.f23574j;
            c8140b2.f23582b = 0.0f;
            c8140b2.f23581a = -1.0f;
            if (this.f23577m) {
                bnf.m105390a("fakeView", "reset 每次动画diff: " + this.f23574j.f23585e + " , " + this.f23574j.f23584d + " , " + this.f23574j.f23582b);
            }
            m39439o();
            if (this.f23577m) {
                bnf.m105390a("fakeView", "reset 每次动画diff done: " + this.f23574j.f23585e + " , " + this.f23574j.f23582b);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m39442r() {
        if (!this.f23573i && m39438m()) {
            C8140b c8140b = this.f23574j;
            if (c8140b.f23581a == 1.0f || c8140b.f23584d == 1.0f) {
                return;
            }
            c8140b.f23585e = 1.0f / (getRefreshRate() * 0.21f);
            if (this.f23577m) {
                bnf.m105390a("fakeView", "start # 每次动画diff: " + this.f23574j.f23585e + " , " + this.f23574j.f23584d + " , " + this.f23574j.f23582b);
            }
            C8140b c8140b2 = this.f23574j;
            c8140b2.f23582b = 1.0f;
            c8140b2.f23581a = 1.0f;
            m39439o();
            if (this.f23577m) {
                bnf.m105390a("fakeView", "start # 每次动画diff: done: " + this.f23574j.f23585e + " , " + this.f23574j.f23584d + " , " + this.f23574j.f23582b);
            }
        }
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: a */
    public void mo39424a(float f, CardProgressAction cardProgressAction) {
        if (this.f23571g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m39442r();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m39441q();
            }
        }
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: c */
    public void mo39425c(CardProgressAction cardProgressAction) {
        if (this.f23571g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m39441q();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m39441q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0079, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00c9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0125, please report this as an issue */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z;
        boolean z2;
        C8140b c8140b;
        float f;
        boolean z3;
        float f2;
        C8140b c8140b2;
        C8140b c8140b3;
        float f3;
        boolean z4 = true;
        if (this.f23571g && this.f23574j.f23583c) {
            this.f23567c.setAlpha(1.0f);
            this.f23568d.setAlpha(0.0f);
            C8140b c8140b4 = this.f23574j;
            float f4 = c8140b4.f23584d;
            float f5 = c8140b4.f23581a;
            float f6 = f4 + (c8140b4.f23585e * f5);
            c8140b4.f23584d = f6;
            if (f5 == 1.0f) {
                if (f6 > 1.0f) {
                    c8140b4.f23584d = 1.0f;
                    c8140b4.f23581a = 0.0f;
                    c8140b4.f23583c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f5 == -1.0f) {
                if (f6 < 0.0f) {
                    c8140b4.f23584d = 0.0f;
                    c8140b4.f23581a = 0.0f;
                    c8140b4.f23583c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c8140b = this.f23575k;
            if (c8140b.f23583c) {
                if (this.f23571g) {
                    this.f23568d.setAlpha(1.0f);
                    this.f23567c.setAlpha(0.0f);
                }
                C8140b c8140b5 = this.f23575k;
                c8140b5.f23584d += c8140b5.f23581a * c8140b5.f23585e;
                if (this.f23577m) {
                    bnf.m105390a("fakeView", "click anim begin " + this.f23575k.f23581a + " , " + this.f23575k.f23584d);
                }
                c8140b3 = this.f23575k;
                f3 = c8140b3.f23582b;
                if (f3 == 0.0f) {
                    if (c8140b3.f23584d <= 0.0f) {
                        c8140b3.f23584d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 != 1.0f) {
                    if (c8140b3.f23584d > 1.0f) {
                        c8140b3.f23584d = 1.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 2.0f || c8140b3.f23584d <= 2.0f) {
                    z3 = true;
                } else {
                    c8140b3.f23584d = 0.0f;
                    z3 = false;
                }
                if (this.f23577m) {
                    bnf.m105390a("fakeView", "click anim end " + this.f23575k.f23581a + " , " + this.f23575k.f23584d + " ， " + z3 + " , " + this.f23568d.getAlpha());
                }
            } else {
                f = c8140b.f23582b;
                if ((f != 0.0f || f == 1.0f || f == 2.0f) && this.f23571g && (f == 0.0f || f == 2.0f)) {
                    this.f23568d.setAlpha(0.0f);
                    this.f23567c.setAlpha(1.0f);
                }
                if (this.f23577m) {
                    bnf.m105390a("fakeView", "click anim finish " + this.f23575k.f23581a + " , " + this.f23575k.f23584d + " ， false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c8140b2 = this.f23575k;
                if (c8140b2.f23583c) {
                    c8140b2.f23583c = false;
                    if (c8140b2.f23582b == 2.0f && this.f23571g) {
                        this.f23568d.setAlpha(0.0f);
                        this.f23567c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f23571g) {
                this.f23567c.stepToFrame(this.f23574j.f23584d, false);
            }
            if (z4) {
                SVGAnimationView sVGAnimationView = this.f23568d;
                f2 = this.f23575k.f23584d;
                if (f2 > 1.0f) {
                    f2 = 2.0f - f2;
                }
                sVGAnimationView.stepToFrame(f2, false);
            }
        }
        z = false;
        z2 = z;
        c8140b = this.f23575k;
        if (c8140b.f23583c) {
            if (this.f23571g) {
                this.f23568d.setAlpha(1.0f);
                this.f23567c.setAlpha(0.0f);
            }
            C8140b c8140b6 = this.f23575k;
            c8140b6.f23584d += c8140b6.f23581a * c8140b6.f23585e;
            if (this.f23577m) {
                bnf.m105390a("fakeView", "click anim begin " + this.f23575k.f23581a + " , " + this.f23575k.f23584d);
            }
            c8140b3 = this.f23575k;
            f3 = c8140b3.f23582b;
            if (f3 == 0.0f) {
                if (c8140b3.f23584d <= 0.0f) {
                    c8140b3.f23584d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 != 1.0f) {
                if (f3 == 2.0f) {
                }
                z3 = true;
            } else if (c8140b3.f23584d > 1.0f) {
                c8140b3.f23584d = 1.0f;
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f23577m) {
                bnf.m105390a("fakeView", "click anim end " + this.f23575k.f23581a + " , " + this.f23575k.f23584d + " ， " + z3 + " , " + this.f23568d.getAlpha());
            }
        } else {
            f = c8140b.f23582b;
            if (f != 0.0f) {
                this.f23568d.setAlpha(0.0f);
                this.f23567c.setAlpha(1.0f);
            } else {
                this.f23568d.setAlpha(0.0f);
                this.f23567c.setAlpha(1.0f);
            }
            if (this.f23577m) {
                bnf.m105390a("fakeView", "click anim finish " + this.f23575k.f23581a + " , " + this.f23575k.f23584d + " ， false");
            }
            z4 = false;
            z3 = false;
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
        if (!z3) {
            c8140b2 = this.f23575k;
            if (c8140b2.f23583c) {
                c8140b2.f23583c = false;
                if (c8140b2.f23582b == 2.0f) {
                    this.f23568d.setAlpha(0.0f);
                    this.f23567c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f23567c.stepToFrame(this.f23574j.f23584d, false);
        }
        if (z4) {
            SVGAnimationView sVGAnimationView2 = this.f23568d;
            f2 = this.f23575k.f23584d;
            if (f2 > 1.0f) {
                f2 = 2.0f - f2;
            }
            sVGAnimationView2.stepToFrame(f2, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m39443n(@Nullable pf60<String, String> pf60Var, String str) {
        if (pf60Var == null) {
            return;
        }
        String str2 = pf60Var.f152156a;
        String str3 = pf60Var.f152157b;
        this.f23576l = str2;
        this.f23568d.setImageDrawable(null);
        this.f23567c.setImageDrawable(null);
        SVGALoader.SVGARequestBuilder sVGARequestBuilderAutoPlay = SVGALoader.with(getContext()).from(str3).loadCallback(new C8139a(str)).autoPlay(false);
        SVGAnimationView.FrameMode frameMode = SVGAnimationView.FrameMode.AFTER;
        sVGARequestBuilderAutoPlay.frameMode(frameMode).into(this.f23568d);
        if (this.f23571g) {
            SVGALoader.with(getContext()).from(str2).frameMode(frameMode).autoPlay(false).into(this.f23567c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(kec0.f125741a4, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(54.0f), qa00.m175859d(54.0f));
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f23567c = (SVGAnimationView) viewInflate.findViewById(adc0.f70310e);
        this.f23568d = (SVGAnimationView) viewInflate.findViewById(adc0.f70668z1);
        this.f23569e = viewInflate.findViewById(adc0.f70364h2);
        this.f23570f = (ImageView) viewInflate.findViewById(adc0.f70514q0);
        bnl0.m105509E0(this.f23569e, new View.OnClickListener() { // from class: l.l6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOperationNewUiButton.m39432e(view);
            }
        });
        setClipChildren(false);
        if (this.f23571g) {
            return;
        }
        this.f23567c.setVisibility(8);
        this.f23568d.setAlpha(1.0f);
        this.f23567c.setVisibility(0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setCoverDrawable(int i) {
        SVGAnimationView sVGAnimationView = this.f23568d;
        if (i == 0) {
            sVGAnimationView.setVisibility(0);
        } else {
            sVGAnimationView.setVisibility(4);
        }
        this.f23569e.setBackgroundResource(i);
        bnl0.m105524M(this.f23569e, i != 0);
    }

    public void setFlagName(String str) {
        this.f23572h = str;
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f23570f.setImageResource(i);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f23575k.f23585e = 2.0f / (getRefreshRate() * 0.7f);
        if (z) {
            this.f23578n = true;
            C8140b c8140b = this.f23575k;
            c8140b.f23582b = 1.0f;
            c8140b.f23584d += 1.0E-5f;
            c8140b.f23581a = 1.0f;
            c8140b.f23583c = true;
            m39440p();
            return;
        }
        if (this.f23578n) {
            this.f23578n = false;
            C8140b c8140b2 = this.f23575k;
            c8140b2.f23582b = 2.0f;
            c8140b2.f23581a = 1.0f;
            c8140b2.f23583c = true;
            m39440p();
        }
    }

    public void setShowLog(boolean z) {
        this.f23577m = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f23571g = z;
        if (z) {
            this.f23568d.setAlpha(0.0f);
            this.f23567c.setVisibility(0);
            this.f23574j.f23581a = 0.0f;
        } else {
            this.f23567c.setVisibility(8);
            this.f23568d.setAlpha(1.0f);
            this.f23567c.setVisibility(0);
        }
    }

    public HomeCardExpandedOperationNewUiButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23571g = false;
        this.f23573i = false;
        this.f23574j = new C8140b();
        this.f23575k = new C8140b();
        this.f23576l = null;
        this.f23577m = false;
        this.f23578n = false;
    }

    public HomeCardExpandedOperationNewUiButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23571g = false;
        this.f23573i = false;
        this.f23574j = new C8140b();
        this.f23575k = new C8140b();
        this.f23576l = null;
        this.f23577m = false;
        this.f23578n = false;
    }
}
