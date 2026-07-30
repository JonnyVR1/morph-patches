package com.p051p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
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
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
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
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedOperationButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f23550c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f23551d;

    /* JADX INFO: renamed from: e */
    public View f23552e;

    /* JADX INFO: renamed from: f */
    public ImageView f23553f;

    /* JADX INFO: renamed from: g */
    public boolean f23554g;

    /* JADX INFO: renamed from: h */
    public boolean f23555h;

    /* JADX INFO: renamed from: i */
    public C8138c f23556i;

    /* JADX INFO: renamed from: j */
    public C8138c f23557j;

    /* JADX INFO: renamed from: k */
    public String f23558k;

    /* JADX INFO: renamed from: l */
    public boolean f23559l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$a */
    public class C8136a implements RequestCallback {
        public C8136a() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            HomeCardExpandedOperationButton.this.f23550c.stepToFrame(0.0f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$b */
    public class C8137b implements RequestCallback {
        public C8137b() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            bnl0.m105524M(HomeCardExpandedOperationButton.this.f23553f, true);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            HomeCardExpandedOperationButton.this.f23551d.stepToFrame(0.0f, false);
            bnl0.m105524M(HomeCardExpandedOperationButton.this.f23553f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$c */
    public static class C8138c {

        /* JADX INFO: renamed from: a */
        public float f23562a;

        /* JADX INFO: renamed from: b */
        public float f23563b;

        /* JADX INFO: renamed from: c */
        public boolean f23564c;

        /* JADX INFO: renamed from: d */
        public float f23565d;

        /* JADX INFO: renamed from: e */
        public float f23566e;

        public C8138c() {
            this.f23562a = 1.0f;
            this.f23564c = false;
            this.f23565d = 0.0f;
            this.f23566e = 0.005319149f;
        }
    }

    public HomeCardExpandedOperationButton(Context context) {
        super(context);
        this.f23554g = false;
        this.f23555h = false;
        this.f23556i = new C8138c();
        this.f23557j = new C8138c();
        this.f23558k = null;
        this.f23559l = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m39420e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return ((Act) getContext()).getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: a */
    public void mo39424a(float f, CardProgressAction cardProgressAction) {
        if (this.f23554g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m39431p();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m39430o();
            }
        }
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: c */
    public void mo39425c(CardProgressAction cardProgressAction) {
        if (this.f23554g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m39430o();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m39430o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0077, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x00e9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0139, please report this as an issue */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z;
        boolean z2;
        C8138c c8138c;
        float f;
        boolean z3;
        C8138c c8138c2;
        float f2;
        C8138c c8138c3;
        float f3;
        float f4;
        float f5;
        boolean z4 = true;
        if (this.f23554g && this.f23556i.f23564c) {
            this.f23550c.setAlpha(1.0f);
            this.f23551d.setAlpha(0.0f);
            C8138c c8138c4 = this.f23556i;
            float f6 = c8138c4.f23565d;
            float f7 = c8138c4.f23562a;
            float f8 = f6 + (c8138c4.f23566e * f7);
            c8138c4.f23565d = f8;
            if (f7 == 1.0f) {
                if (f8 > 1.0f) {
                    c8138c4.f23565d = 1.0f;
                    c8138c4.f23562a = 0.0f;
                    c8138c4.f23564c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f7 == -1.0f) {
                if (f8 < 0.0f) {
                    c8138c4.f23565d = 0.0f;
                    c8138c4.f23562a = 0.0f;
                    c8138c4.f23564c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c8138c = this.f23557j;
            if (c8138c.f23564c) {
                if (this.f23554g) {
                    this.f23551d.setAlpha(1.0f);
                    this.f23550c.setAlpha(0.0f);
                }
                C8138c c8138c5 = this.f23557j;
                c8138c5.f23565d += c8138c5.f23562a * c8138c5.f23566e;
                if (this.f23559l) {
                    bnf.m105390a("fakeView", "click anim begin " + this.f23557j.f23562a + " , " + this.f23557j.f23565d);
                }
                c8138c3 = this.f23557j;
                f3 = c8138c3.f23563b;
                if (f3 == 0.0f) {
                    if (c8138c3.f23565d <= 0.0f) {
                        c8138c3.f23565d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 0.5f) {
                    f4 = c8138c3.f23562a;
                    if (f4 <= 0.0f && c8138c3.f23565d > 0.5f) {
                        c8138c3.f23565d = 0.5f;
                    } else if (f4 < 0.0f || c8138c3.f23565d >= 0.5f) {
                        z3 = true;
                    } else {
                        c8138c3.f23565d = 0.5f;
                    }
                    z3 = false;
                } else if (f3 == 1.0f || c8138c3.f23565d <= 1.0f) {
                    z3 = true;
                } else {
                    c8138c3.f23565d = 0.0f;
                    z3 = false;
                }
                f5 = c8138c3.f23565d;
                if (f5 >= 0.0f || f5 > 1.0f) {
                    c8138c3.f23565d = 0.0f;
                    z3 = false;
                }
                if (this.f23559l) {
                    bnf.m105390a("fakeView", "click anim end " + this.f23557j.f23562a + " , " + this.f23557j.f23565d + " ， " + z3 + " , " + this.f23551d.getAlpha());
                }
            } else {
                f = c8138c.f23563b;
                if ((f != 0.0f || f == 1.0f) && this.f23554g) {
                    this.f23551d.setAlpha(0.0f);
                    this.f23550c.setAlpha(1.0f);
                }
                if (this.f23559l) {
                    bnf.m105390a("fakeView", "click anim finish " + this.f23557j.f23562a + " , " + this.f23557j.f23565d + " ， false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c8138c2 = this.f23557j;
                if (c8138c2.f23564c) {
                    if (c8138c2.f23563b == 1.0f) {
                        c8138c2.f23563b = 0.0f;
                    }
                    c8138c2.f23564c = false;
                    f2 = c8138c2.f23563b;
                    if ((f2 != 0.0f || f2 == 1.0f) && this.f23554g) {
                        this.f23551d.setAlpha(0.0f);
                        this.f23550c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f23554g) {
                this.f23550c.stepToFrame(this.f23556i.f23565d, false);
            }
            if (z4) {
                this.f23551d.stepToFrame(this.f23557j.f23565d % 1.0f, false);
            }
        }
        z = false;
        z2 = z;
        c8138c = this.f23557j;
        if (c8138c.f23564c) {
            if (this.f23554g) {
                this.f23551d.setAlpha(1.0f);
                this.f23550c.setAlpha(0.0f);
            }
            C8138c c8138c6 = this.f23557j;
            c8138c6.f23565d += c8138c6.f23562a * c8138c6.f23566e;
            if (this.f23559l) {
                bnf.m105390a("fakeView", "click anim begin " + this.f23557j.f23562a + " , " + this.f23557j.f23565d);
            }
            c8138c3 = this.f23557j;
            f3 = c8138c3.f23563b;
            if (f3 == 0.0f) {
                if (c8138c3.f23565d <= 0.0f) {
                    c8138c3.f23565d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 == 0.5f) {
                f4 = c8138c3.f23562a;
                if (f4 <= 0.0f) {
                    if (f4 < 0.0f) {
                    }
                    z3 = true;
                } else {
                    if (f4 < 0.0f) {
                    }
                    z3 = true;
                }
            } else {
                if (f3 == 1.0f) {
                }
                z3 = true;
            }
            f5 = c8138c3.f23565d;
            if (f5 >= 0.0f) {
                c8138c3.f23565d = 0.0f;
                z3 = false;
            } else {
                c8138c3.f23565d = 0.0f;
                z3 = false;
            }
            if (this.f23559l) {
                bnf.m105390a("fakeView", "click anim end " + this.f23557j.f23562a + " , " + this.f23557j.f23565d + " ， " + z3 + " , " + this.f23551d.getAlpha());
            }
        } else {
            f = c8138c.f23563b;
            if (f != 0.0f) {
                this.f23551d.setAlpha(0.0f);
                this.f23550c.setAlpha(1.0f);
            } else {
                this.f23551d.setAlpha(0.0f);
                this.f23550c.setAlpha(1.0f);
            }
            if (this.f23559l) {
                bnf.m105390a("fakeView", "click anim finish " + this.f23557j.f23562a + " , " + this.f23557j.f23565d + " ， false");
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
            c8138c2 = this.f23557j;
            if (c8138c2.f23564c) {
                if (c8138c2.f23563b == 1.0f) {
                    c8138c2.f23563b = 0.0f;
                }
                c8138c2.f23564c = false;
                f2 = c8138c2.f23563b;
                if (f2 != 0.0f) {
                    this.f23551d.setAlpha(0.0f);
                    this.f23550c.setAlpha(1.0f);
                } else {
                    this.f23551d.setAlpha(0.0f);
                    this.f23550c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f23550c.stepToFrame(this.f23556i.f23565d, false);
        }
        if (z4) {
            this.f23551d.stepToFrame(this.f23557j.f23565d % 1.0f, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m39426k() {
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

    /* JADX INFO: renamed from: l */
    public void m39427l(String str, String str2) {
        boolean zEquals = TextUtils.equals(str, this.f23558k);
        this.f23558k = str;
        if (this.f23554g) {
            SVGALoader.with(getContext()).from(str).isCacheable(zEquals).loadCallback(new C8136a()).autoPlay(false).into(this.f23550c);
        }
        SVGALoader.with(getContext()).from(str2).loadCallback(new C8137b()).autoPlay(false).into(this.f23551d);
    }

    /* JADX INFO: renamed from: m */
    public final void m39428m() {
        this.f23556i.f23564c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m39429n() {
        this.f23557j.f23564c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m39430o() {
        if (!this.f23555h && m39426k()) {
            C8138c c8138c = this.f23556i;
            if (c8138c.f23562a == -1.0f || c8138c.f23565d == 0.0f) {
                return;
            }
            c8138c.f23566e = 1.0f / (getRefreshRate() * 0.188f);
            C8138c c8138c2 = this.f23556i;
            c8138c2.f23563b = 0.0f;
            c8138c2.f23562a = -1.0f;
            if (this.f23559l) {
                bnf.m105390a("fakeView", "reset 每次动画diff: " + this.f23556i.f23566e + " , " + this.f23556i.f23565d + " , " + this.f23556i.f23563b);
            }
            m39428m();
            if (this.f23559l) {
                bnf.m105390a("fakeView", "reset 每次动画diff done: " + this.f23556i.f23566e + " , " + this.f23556i.f23563b);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(kec0.f125724Z3, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(54.0f), qa00.m175859d(54.0f));
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f23550c = (SVGAnimationView) viewInflate.findViewById(adc0.f70310e);
        this.f23551d = (SVGAnimationView) viewInflate.findViewById(adc0.f70668z1);
        this.f23552e = viewInflate.findViewById(adc0.f70364h2);
        this.f23553f = (ImageView) viewInflate.findViewById(adc0.f70514q0);
        bnl0.m105509E0(this.f23552e, new View.OnClickListener() { // from class: l.j6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOperationButton.m39420e(view);
            }
        });
        setClipChildren(false);
        if (this.f23554g) {
            return;
        }
        this.f23550c.setVisibility(8);
        this.f23551d.setAlpha(1.0f);
        this.f23550c.setVisibility(0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: p */
    public final void m39431p() {
        if (!this.f23555h && m39426k()) {
            C8138c c8138c = this.f23556i;
            if (c8138c.f23562a == 1.0f || c8138c.f23565d == 1.0f) {
                return;
            }
            c8138c.f23566e = 1.0f / (getRefreshRate() * 0.188f);
            if (this.f23559l) {
                bnf.m105390a("fakeView", "start # 每次动画diff: " + this.f23556i.f23566e + " , " + this.f23556i.f23565d + " , " + this.f23556i.f23563b);
            }
            C8138c c8138c2 = this.f23556i;
            c8138c2.f23563b = 1.0f;
            c8138c2.f23562a = 1.0f;
            m39428m();
            if (this.f23559l) {
                bnf.m105390a("fakeView", "start # 每次动画diff: done: " + this.f23556i.f23566e + " , " + this.f23556i.f23565d + " , " + this.f23556i.f23563b);
            }
        }
    }

    public void setCoverDrawable(int i) {
        SVGAnimationView sVGAnimationView = this.f23551d;
        if (i == 0) {
            sVGAnimationView.setVisibility(0);
        } else {
            sVGAnimationView.setVisibility(4);
        }
        this.f23552e.setBackgroundResource(i);
        bnl0.m105524M(this.f23552e, i != 0);
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f23553f.setImageResource(i);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f23557j.f23566e = 0.5f / (getRefreshRate() * 0.165f);
        C8138c c8138c = this.f23557j;
        if (z) {
            float f = c8138c.f23565d;
            if (f >= 0.5f) {
                c8138c.f23563b = 0.5f;
                c8138c.f23562a = -1.0f;
                c8138c.f23564c = true;
                m39429n();
                return;
            }
            c8138c.f23563b = 0.5f;
            c8138c.f23565d = f + 1.0E-5f;
            c8138c.f23562a = 1.0f;
            c8138c.f23564c = true;
            m39429n();
            return;
        }
        float f2 = c8138c.f23565d;
        if (f2 == 0.0f) {
            return;
        }
        if (f2 >= 0.5f) {
            c8138c.f23563b = 1.0f;
            c8138c.f23562a = 1.0f;
            c8138c.f23564c = true;
            m39429n();
            return;
        }
        c8138c.f23563b = 1.0f;
        c8138c.f23562a = 1.0f;
        c8138c.f23564c = true;
        m39429n();
    }

    public void setShowLog(boolean z) {
        this.f23559l = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f23554g = z;
        if (z) {
            this.f23551d.setAlpha(0.0f);
            this.f23550c.setVisibility(0);
            this.f23556i.f23562a = 0.0f;
        } else {
            this.f23550c.setVisibility(8);
            this.f23551d.setAlpha(1.0f);
            this.f23550c.setVisibility(0);
        }
    }

    public HomeCardExpandedOperationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23554g = false;
        this.f23555h = false;
        this.f23556i = new C8138c();
        this.f23557j = new C8138c();
        this.f23558k = null;
        this.f23559l = false;
    }

    public HomeCardExpandedOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23554g = false;
        this.f23555h = false;
        this.f23556i = new C8138c();
        this.f23557j = new C8138c();
        this.f23558k = null;
        this.f23559l = false;
    }
}
