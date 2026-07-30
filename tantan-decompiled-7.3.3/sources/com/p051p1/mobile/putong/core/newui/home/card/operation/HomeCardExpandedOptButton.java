package com.p051p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.content.res.TypedArray;
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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton;
import com.p051p1.mobile.putong.core.newui.home.card.operation.view.HomeCardButtonSvgaView;
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
import p153l.khc0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedOptButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public HomeCardButtonSvgaView f23586c;

    /* JADX INFO: renamed from: d */
    public HomeCardButtonSvgaView f23587d;

    /* JADX INFO: renamed from: e */
    public View f23588e;

    /* JADX INFO: renamed from: f */
    public ImageView f23589f;

    /* JADX INFO: renamed from: g */
    public boolean f23590g;

    /* JADX INFO: renamed from: h */
    public float f23591h;

    /* JADX INFO: renamed from: i */
    public boolean f23592i;

    /* JADX INFO: renamed from: j */
    public C8142b f23593j;

    /* JADX INFO: renamed from: k */
    public C8142b f23594k;

    /* JADX INFO: renamed from: l */
    public boolean f23595l;

    /* JADX INFO: renamed from: m */
    public boolean f23596m;

    /* JADX INFO: renamed from: n */
    public boolean f23597n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton$a */
    public class C8141a implements RequestCallback {
        public C8141a() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            bnl0.m105524M(HomeCardExpandedOptButton.this.f23589f, true);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            bnl0.m105524M(HomeCardExpandedOptButton.this.f23589f, HomeCardExpandedOptButton.this.f23596m);
            HomeCardExpandedOptButton.this.f23597n = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton$b */
    public static class C8142b {

        /* JADX INFO: renamed from: a */
        public float f23599a;

        /* JADX INFO: renamed from: b */
        public float f23600b;

        /* JADX INFO: renamed from: c */
        public boolean f23601c;

        /* JADX INFO: renamed from: d */
        public float f23602d;

        /* JADX INFO: renamed from: e */
        public float f23603e;

        public C8142b() {
            this.f23599a = 1.0f;
            this.f23601c = false;
            this.f23602d = 0.0f;
            this.f23603e = 0.005319149f;
        }
    }

    public HomeCardExpandedOptButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23590g = false;
        this.f23591h = 1.0f;
        this.f23592i = false;
        this.f23593j = new C8142b();
        this.f23594k = new C8142b();
        this.f23595l = false;
        this.f23596m = false;
        this.f23597n = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khc0.f126740K0);
            this.f23591h = typedArrayObtainStyledAttributes.getFloat(khc0.f126743L0, 1.4629f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m39444e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return ((Act) getContext()).getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: k */
    private boolean m39447k() {
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

    /* JADX INFO: renamed from: m */
    private void m39448m() {
        this.f23593j.f23601c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: n */
    private void m39449n() {
        this.f23594k.f23601c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: o */
    private void m39450o() {
        if (this.f23592i) {
            return;
        }
        m39447k();
        C8142b c8142b = this.f23593j;
        float f = c8142b.f23599a;
        if (f == -1.0f) {
            return;
        }
        if (c8142b.f23602d == 0.0f) {
            if (f == 1.0f && c8142b.f23601c) {
                c8142b.f23599a = -1.0f;
                return;
            }
            return;
        }
        c8142b.f23603e = 1.0f / (getRefreshRate() * 0.188f);
        C8142b c8142b2 = this.f23593j;
        c8142b2.f23600b = 0.0f;
        c8142b2.f23599a = -1.0f;
        if (this.f23595l) {
            bnf.m105390a("fakeView", "reset 每次动画diff: " + this.f23593j.f23603e + " , " + this.f23593j.f23602d + " , " + this.f23593j.f23600b);
        }
        m39448m();
        if (this.f23595l) {
            bnf.m105390a("fakeView", "reset 每次动画diff done: " + this.f23593j.f23603e + " , " + this.f23593j.f23600b);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m39451p() {
        if (!this.f23592i && m39447k()) {
            C8142b c8142b = this.f23593j;
            if (c8142b.f23599a == 1.0f || c8142b.f23602d == 1.0f) {
                return;
            }
            c8142b.f23603e = 1.0f / (getRefreshRate() * 0.188f);
            if (this.f23595l) {
                bnf.m105390a("fakeView", "start # 每次动画diff: " + this.f23593j.f23603e + " , " + this.f23593j.f23602d + " , " + this.f23593j.f23600b);
            }
            C8142b c8142b2 = this.f23593j;
            c8142b2.f23600b = 1.0f;
            c8142b2.f23599a = 1.0f;
            m39448m();
            if (this.f23595l) {
                bnf.m105390a("fakeView", "start # 每次动画diff: done: " + this.f23593j.f23603e + " , " + this.f23593j.f23602d + " , " + this.f23593j.f23600b);
            }
        }
    }

    private void setClickAlpha(float f) {
        this.f23587d.setAlpha(f);
        boolean z = this.f23597n;
        ImageView imageView = this.f23589f;
        if (z) {
            imageView.setAlpha(1.0f - f);
        } else {
            imageView.setAlpha(1.0f);
        }
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: a */
    public void mo39424a(float f, CardProgressAction cardProgressAction) {
        if (this.f23590g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m39451p();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m39450o();
            }
        }
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: c */
    public void mo39425c(CardProgressAction cardProgressAction) {
        if (this.f23590g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m39450o();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m39450o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:97:0x01da  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0086, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x00f8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0144, please report this as an issue */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z;
        boolean z2;
        C8142b c8142b;
        float f;
        boolean z3;
        C8142b c8142b2;
        float f2;
        C8142b c8142b3;
        float f3;
        float f4;
        float f5;
        C8142b c8142b4;
        boolean z4 = true;
        if (this.f23590g && this.f23593j.f23601c) {
            this.f23586c.setAlpha(1.0f);
            setClickAlpha(0.0f);
            C8142b c8142b5 = this.f23593j;
            float f6 = c8142b5.f23602d;
            float f7 = c8142b5.f23599a;
            float f8 = f6 + (c8142b5.f23603e * f7);
            c8142b5.f23602d = f8;
            if (f7 == 1.0f) {
                if (f8 > 1.0f) {
                    c8142b5.f23602d = 1.0f;
                    c8142b5.f23599a = 0.0f;
                    c8142b5.f23601c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f7 == -1.0f) {
                if (f8 < 0.0f) {
                    c8142b5.f23602d = 0.0f;
                    c8142b5.f23599a = 0.0f;
                    c8142b5.f23601c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c8142b = this.f23594k;
            if (c8142b.f23601c) {
                if (this.f23590g) {
                    setClickAlpha(1.0f);
                    this.f23586c.setAlpha(0.0f);
                    c8142b4 = this.f23593j;
                    if (c8142b4.f23601c || c8142b4.f23602d != 0.0f) {
                        c8142b4.f23601c = false;
                        c8142b4.f23602d = 0.0f;
                        z2 = true;
                    }
                }
                C8142b c8142b6 = this.f23594k;
                c8142b6.f23602d += c8142b6.f23599a * c8142b6.f23603e;
                if (this.f23595l) {
                    bnf.m105390a("fakeView", "click anim begin " + this.f23594k.f23599a + " , " + this.f23594k.f23602d);
                }
                c8142b3 = this.f23594k;
                f3 = c8142b3.f23600b;
                if (f3 == 0.0f) {
                    if (c8142b3.f23602d <= 0.0f) {
                        c8142b3.f23602d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 0.5f) {
                    f4 = c8142b3.f23599a;
                    if (f4 <= 0.0f && c8142b3.f23602d > 0.5f) {
                        c8142b3.f23602d = 0.5f;
                    } else if (f4 < 0.0f || c8142b3.f23602d >= 0.5f) {
                        z3 = true;
                    } else {
                        c8142b3.f23602d = 0.5f;
                    }
                    z3 = false;
                } else if (f3 == 1.0f || c8142b3.f23602d <= 1.0f) {
                    z3 = true;
                } else {
                    c8142b3.f23602d = 0.0f;
                    z3 = false;
                }
                f5 = c8142b3.f23602d;
                if (f5 >= 0.0f || f5 > 1.0f) {
                    c8142b3.f23602d = 0.0f;
                    z3 = false;
                }
                if (this.f23595l) {
                    bnf.m105390a("fakeView", "click anim end " + this.f23594k.f23599a + " , " + this.f23594k.f23602d + " ， " + z3 + " , " + this.f23587d.getAlpha());
                }
            } else {
                f = c8142b.f23600b;
                if ((f != 0.0f || f == 1.0f) && this.f23590g) {
                    setClickAlpha(0.0f);
                    this.f23586c.setAlpha(1.0f);
                }
                if (this.f23595l) {
                    bnf.m105390a("fakeView", "click anim finish " + this.f23594k.f23599a + " , " + this.f23594k.f23602d + " ， " + this.f23594k.f23600b + " ， swipe: " + this.f23593j.f23599a + " , " + this.f23593j.f23602d + Constants.SEPARATOR_COMMA + this.f23593j.f23600b + ",false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c8142b2 = this.f23594k;
                if (c8142b2.f23601c) {
                    if (c8142b2.f23600b == 1.0f) {
                        c8142b2.f23600b = 0.0f;
                    }
                    c8142b2.f23601c = false;
                    f2 = c8142b2.f23600b;
                    if ((f2 != 0.0f || f2 == 1.0f) && this.f23590g) {
                        setClickAlpha(0.0f);
                        this.f23586c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f23590g) {
                this.f23586c.stepToFrame(this.f23593j.f23602d, false);
            }
            if (z4) {
                this.f23587d.stepToFrame(this.f23594k.f23602d % 1.0f, false);
            }
        }
        z = false;
        z2 = z;
        c8142b = this.f23594k;
        if (c8142b.f23601c) {
            if (this.f23590g) {
                setClickAlpha(1.0f);
                this.f23586c.setAlpha(0.0f);
                c8142b4 = this.f23593j;
                if (c8142b4.f23601c) {
                    c8142b4.f23601c = false;
                    c8142b4.f23602d = 0.0f;
                    z2 = true;
                } else {
                    c8142b4.f23601c = false;
                    c8142b4.f23602d = 0.0f;
                    z2 = true;
                }
            }
            C8142b c8142b7 = this.f23594k;
            c8142b7.f23602d += c8142b7.f23599a * c8142b7.f23603e;
            if (this.f23595l) {
                bnf.m105390a("fakeView", "click anim begin " + this.f23594k.f23599a + " , " + this.f23594k.f23602d);
            }
            c8142b3 = this.f23594k;
            f3 = c8142b3.f23600b;
            if (f3 == 0.0f) {
                if (c8142b3.f23602d <= 0.0f) {
                    c8142b3.f23602d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 == 0.5f) {
                f4 = c8142b3.f23599a;
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
            f5 = c8142b3.f23602d;
            if (f5 >= 0.0f) {
                c8142b3.f23602d = 0.0f;
                z3 = false;
            } else {
                c8142b3.f23602d = 0.0f;
                z3 = false;
            }
            if (this.f23595l) {
                bnf.m105390a("fakeView", "click anim end " + this.f23594k.f23599a + " , " + this.f23594k.f23602d + " ， " + z3 + " , " + this.f23587d.getAlpha());
            }
        } else {
            f = c8142b.f23600b;
            if (f != 0.0f) {
                setClickAlpha(0.0f);
                this.f23586c.setAlpha(1.0f);
            } else {
                setClickAlpha(0.0f);
                this.f23586c.setAlpha(1.0f);
            }
            if (this.f23595l) {
                bnf.m105390a("fakeView", "click anim finish " + this.f23594k.f23599a + " , " + this.f23594k.f23602d + " ， " + this.f23594k.f23600b + " ， swipe: " + this.f23593j.f23599a + " , " + this.f23593j.f23602d + Constants.SEPARATOR_COMMA + this.f23593j.f23600b + ",false");
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
            c8142b2 = this.f23594k;
            if (c8142b2.f23601c) {
                if (c8142b2.f23600b == 1.0f) {
                    c8142b2.f23600b = 0.0f;
                }
                c8142b2.f23601c = false;
                f2 = c8142b2.f23600b;
                if (f2 != 0.0f) {
                    setClickAlpha(0.0f);
                    this.f23586c.setAlpha(1.0f);
                } else {
                    setClickAlpha(0.0f);
                    this.f23586c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f23586c.stepToFrame(this.f23593j.f23602d, false);
        }
        if (z4) {
            this.f23587d.stepToFrame(this.f23594k.f23602d % 1.0f, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m39452h(boolean z) {
        if (this.f23596m) {
            boolean z2 = this.f23597n;
            ImageView imageView = this.f23589f;
            if (z2) {
                imageView.setAlpha(0.0f);
            } else {
                imageView.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m39453l(String str, String str2) {
        this.f23587d.setImageDrawable(null);
        this.f23586c.setImageDrawable(null);
        this.f23589f.setAlpha(1.0f);
        this.f23597n = false;
        this.f23587d.stepToFrame(0.0f, false);
        this.f23586c.stepToFrame(0.0f, false);
        SVGALoader.SVGARequestBuilder sVGARequestBuilderAutoPlay = SVGALoader.with(getContext()).from(str2).loadCallback(new C8141a()).autoPlay(false);
        SVGAnimationView.FrameMode frameMode = SVGAnimationView.FrameMode.AFTER;
        sVGARequestBuilderAutoPlay.frameMode(frameMode).into(this.f23587d);
        if (this.f23590g) {
            SVGALoader.with(getContext()).from(str).frameMode(frameMode).autoPlay(false).into(this.f23586c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(kec0.f125758b4, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f23586c = (HomeCardButtonSvgaView) viewInflate.findViewById(adc0.f70310e);
        this.f23587d = (HomeCardButtonSvgaView) viewInflate.findViewById(adc0.f70668z1);
        this.f23588e = viewInflate.findViewById(adc0.f70364h2);
        this.f23586c.setLayoutScale(this.f23591h);
        this.f23587d.setLayoutScale(this.f23591h);
        this.f23589f = (ImageView) viewInflate.findViewById(adc0.f70514q0);
        bnl0.m105509E0(this.f23588e, new View.OnClickListener() { // from class: l.n6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOptButton.m39444e(view);
            }
        });
        setClipChildren(false);
        if (this.f23590g) {
            return;
        }
        this.f23586c.setVisibility(8);
        setClickAlpha(1.0f);
        this.f23586c.setVisibility(0);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            setPressed(false);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBgAllShow(boolean z) {
        this.f23596m = z;
        if (z) {
            bnl0.m105524M(this.f23589f, true);
            this.f23589f.setAlpha(1.0f);
        }
    }

    public void setCoverDrawable(int i) {
        HomeCardButtonSvgaView homeCardButtonSvgaView = this.f23587d;
        if (i == 0) {
            homeCardButtonSvgaView.setVisibility(0);
        } else {
            homeCardButtonSvgaView.setVisibility(4);
        }
        this.f23588e.setBackgroundResource(i);
        bnl0.m105524M(this.f23588e, i != 0);
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f23589f.setImageResource(i);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (!this.f23590g) {
            m39452h(z);
        }
        this.f23594k.f23603e = 0.5f / (getRefreshRate() * 0.165f);
        C8142b c8142b = this.f23594k;
        if (z) {
            float f = c8142b.f23602d;
            if (f >= 0.5f) {
                c8142b.f23600b = 0.5f;
                c8142b.f23599a = -1.0f;
                c8142b.f23601c = true;
                m39449n();
                return;
            }
            c8142b.f23600b = 0.5f;
            c8142b.f23602d = f + 1.0E-5f;
            c8142b.f23599a = 1.0f;
            c8142b.f23601c = true;
            m39449n();
            return;
        }
        float f2 = c8142b.f23602d;
        if (f2 == 0.0f) {
            return;
        }
        if (f2 >= 0.5f) {
            c8142b.f23600b = 1.0f;
            c8142b.f23599a = 1.0f;
            c8142b.f23601c = true;
            m39449n();
            return;
        }
        c8142b.f23600b = 1.0f;
        c8142b.f23599a = 1.0f;
        c8142b.f23601c = true;
        m39449n();
    }

    public void setShowLog(boolean z) {
        this.f23595l = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f23590g = z;
        if (z) {
            setClickAlpha(0.0f);
            this.f23586c.setVisibility(0);
            this.f23593j.f23599a = 0.0f;
        } else {
            this.f23586c.setVisibility(8);
            setClickAlpha(1.0f);
            this.f23586c.setVisibility(0);
        }
    }

    public HomeCardExpandedOptButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeCardExpandedOptButton(@NonNull Context context) {
        this(context, null);
    }
}
