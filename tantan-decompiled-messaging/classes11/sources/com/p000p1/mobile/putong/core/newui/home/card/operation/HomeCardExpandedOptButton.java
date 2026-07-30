package com.p000p1.mobile.putong.core.newui.home.card.operation;

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
import com.p000p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton;
import com.p000p1.mobile.putong.core.newui.home.card.operation.view.HomeCardButtonSvgaView;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.e9c0;
import l.f6c0;
import l.u4c0;
import l.xdl0;
import p009l.osl;
import p009l.vlf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardExpandedOptButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public HomeCardButtonSvgaView f1622c;

    /* JADX INFO: renamed from: d */
    public HomeCardButtonSvgaView f1623d;

    /* JADX INFO: renamed from: e */
    public View f1624e;

    /* JADX INFO: renamed from: f */
    public ImageView f1625f;

    /* JADX INFO: renamed from: g */
    public boolean f1626g;

    /* JADX INFO: renamed from: h */
    public float f1627h;

    /* JADX INFO: renamed from: i */
    public boolean f1628i;

    /* JADX INFO: renamed from: j */
    public C0155b f1629j;

    /* JADX INFO: renamed from: k */
    public C0155b f1630k;

    /* JADX INFO: renamed from: l */
    public boolean f1631l;

    /* JADX INFO: renamed from: m */
    public boolean f1632m;

    /* JADX INFO: renamed from: n */
    public boolean f1633n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton$a */
    public class C0154a implements RequestCallback {
        public C0154a() {
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.M(HomeCardExpandedOptButton.this.f1625f, true);
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            xdl0.M(HomeCardExpandedOptButton.this.f1625f, HomeCardExpandedOptButton.this.f1632m);
            HomeCardExpandedOptButton.this.f1633n = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton$b */
    public static class C0155b {

        /* JADX INFO: renamed from: a */
        public float f1635a;

        /* JADX INFO: renamed from: b */
        public float f1636b;

        /* JADX INFO: renamed from: c */
        public boolean f1637c;

        /* JADX INFO: renamed from: d */
        public float f1638d;

        /* JADX INFO: renamed from: e */
        public float f1639e;

        public C0155b() {
            this.f1635a = 1.0f;
            this.f1637c = false;
            this.f1638d = 0.0f;
            this.f1639e = 0.005319149f;
        }
    }

    public HomeCardExpandedOptButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1626g = false;
        this.f1627h = 1.0f;
        this.f1628i = false;
        this.f1629j = new C0155b();
        this.f1630k = new C0155b();
        this.f1631l = false;
        this.f1632m = false;
        this.f1633n = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.K0);
            this.f1627h = typedArrayObtainStyledAttributes.getFloat(e9c0.L0, 1.4629f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2419e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return getContext().getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: k */
    private boolean m2422k() {
        ViewParent parent = getParent();
        while (parent != null) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() == 8) {
                    return false;
                }
                if (parent instanceof osl) {
                    return true;
                }
                parent = viewGroup.getParent();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    private void m2423m() {
        this.f1629j.f1637c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: n */
    private void m2424n() {
        this.f1630k.f1637c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: o */
    private void m2425o() {
        if (this.f1628i) {
            return;
        }
        m2422k();
        C0155b c0155b = this.f1629j;
        float f = c0155b.f1635a;
        if (f == -1.0f) {
            return;
        }
        if (c0155b.f1638d == 0.0f) {
            if (f == 1.0f && c0155b.f1637c) {
                c0155b.f1635a = -1.0f;
                return;
            }
            return;
        }
        c0155b.f1639e = 1.0f / (getRefreshRate() * 0.188f);
        C0155b c0155b2 = this.f1629j;
        c0155b2.f1636b = 0.0f;
        c0155b2.f1635a = -1.0f;
        if (this.f1631l) {
            vlf.m23436a("fakeView", "reset 每次动画diff: " + this.f1629j.f1639e + " , " + this.f1629j.f1638d + " , " + this.f1629j.f1636b);
        }
        m2423m();
        if (this.f1631l) {
            vlf.m23436a("fakeView", "reset 每次动画diff done: " + this.f1629j.f1639e + " , " + this.f1629j.f1636b);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m2426p() {
        if (!this.f1628i && m2422k()) {
            C0155b c0155b = this.f1629j;
            if (c0155b.f1635a == 1.0f || c0155b.f1638d == 1.0f) {
                return;
            }
            c0155b.f1639e = 1.0f / (getRefreshRate() * 0.188f);
            if (this.f1631l) {
                vlf.m23436a("fakeView", "start # 每次动画diff: " + this.f1629j.f1639e + " , " + this.f1629j.f1638d + " , " + this.f1629j.f1636b);
            }
            C0155b c0155b2 = this.f1629j;
            c0155b2.f1636b = 1.0f;
            c0155b2.f1635a = 1.0f;
            m2423m();
            if (this.f1631l) {
                vlf.m23436a("fakeView", "start # 每次动画diff: done: " + this.f1629j.f1639e + " , " + this.f1629j.f1638d + " , " + this.f1629j.f1636b);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void setClickAlpha(float f) {
        this.f1623d.setAlpha(f);
        boolean z = this.f1633n;
        ImageView imageView = this.f1625f;
        if (z) {
            imageView.setAlpha(1.0f - f);
        } else {
            imageView.setAlpha(1.0f);
        }
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: a */
    public void mo2399a(float f, CardProgressAction cardProgressAction) {
        if (this.f1626g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m2426p();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m2425o();
            }
        }
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: c */
    public void mo2400c(CardProgressAction cardProgressAction) {
        if (this.f1626g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m2425o();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m2425o();
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
        C0155b c0155b;
        float f;
        boolean z3;
        C0155b c0155b2;
        float f2;
        C0155b c0155b3;
        float f3;
        float f4;
        float f5;
        C0155b c0155b4;
        boolean z4 = true;
        if (this.f1626g && this.f1629j.f1637c) {
            this.f1622c.setAlpha(1.0f);
            setClickAlpha(0.0f);
            C0155b c0155b5 = this.f1629j;
            float f6 = c0155b5.f1638d;
            float f7 = c0155b5.f1635a;
            float f8 = f6 + (c0155b5.f1639e * f7);
            c0155b5.f1638d = f8;
            if (f7 == 1.0f) {
                if (f8 > 1.0f) {
                    c0155b5.f1638d = 1.0f;
                    c0155b5.f1635a = 0.0f;
                    c0155b5.f1637c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f7 == -1.0f) {
                if (f8 < 0.0f) {
                    c0155b5.f1638d = 0.0f;
                    c0155b5.f1635a = 0.0f;
                    c0155b5.f1637c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c0155b = this.f1630k;
            if (c0155b.f1637c) {
                if (this.f1626g) {
                    setClickAlpha(1.0f);
                    this.f1622c.setAlpha(0.0f);
                    c0155b4 = this.f1629j;
                    if (c0155b4.f1637c || c0155b4.f1638d != 0.0f) {
                        c0155b4.f1637c = false;
                        c0155b4.f1638d = 0.0f;
                        z2 = true;
                    }
                }
                C0155b c0155b6 = this.f1630k;
                c0155b6.f1638d += c0155b6.f1635a * c0155b6.f1639e;
                if (this.f1631l) {
                    vlf.m23436a("fakeView", "click anim begin " + this.f1630k.f1635a + " , " + this.f1630k.f1638d);
                }
                c0155b3 = this.f1630k;
                f3 = c0155b3.f1636b;
                if (f3 == 0.0f) {
                    if (c0155b3.f1638d <= 0.0f) {
                        c0155b3.f1638d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 0.5f) {
                    f4 = c0155b3.f1635a;
                    if (f4 <= 0.0f && c0155b3.f1638d > 0.5f) {
                        c0155b3.f1638d = 0.5f;
                    } else if (f4 < 0.0f || c0155b3.f1638d >= 0.5f) {
                        z3 = true;
                    } else {
                        c0155b3.f1638d = 0.5f;
                    }
                    z3 = false;
                } else if (f3 == 1.0f || c0155b3.f1638d <= 1.0f) {
                    z3 = true;
                } else {
                    c0155b3.f1638d = 0.0f;
                    z3 = false;
                }
                f5 = c0155b3.f1638d;
                if (f5 >= 0.0f || f5 > 1.0f) {
                    c0155b3.f1638d = 0.0f;
                    z3 = false;
                }
                if (this.f1631l) {
                    vlf.m23436a("fakeView", "click anim end " + this.f1630k.f1635a + " , " + this.f1630k.f1638d + " ， " + z3 + " , " + this.f1623d.getAlpha());
                }
            } else {
                f = c0155b.f1636b;
                if ((f != 0.0f || f == 1.0f) && this.f1626g) {
                    setClickAlpha(0.0f);
                    this.f1622c.setAlpha(1.0f);
                }
                if (this.f1631l) {
                    vlf.m23436a("fakeView", "click anim finish " + this.f1630k.f1635a + " , " + this.f1630k.f1638d + " ， " + this.f1630k.f1636b + " ， swipe: " + this.f1629j.f1635a + " , " + this.f1629j.f1638d + "," + this.f1629j.f1636b + ",false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c0155b2 = this.f1630k;
                if (c0155b2.f1637c) {
                    if (c0155b2.f1636b == 1.0f) {
                        c0155b2.f1636b = 0.0f;
                    }
                    c0155b2.f1637c = false;
                    f2 = c0155b2.f1636b;
                    if ((f2 != 0.0f || f2 == 1.0f) && this.f1626g) {
                        setClickAlpha(0.0f);
                        this.f1622c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f1626g) {
                this.f1622c.stepToFrame(this.f1629j.f1638d, false);
            }
            if (z4) {
                this.f1623d.stepToFrame(this.f1630k.f1638d % 1.0f, false);
            }
        }
        z = false;
        z2 = z;
        c0155b = this.f1630k;
        if (c0155b.f1637c) {
            if (this.f1626g) {
                setClickAlpha(1.0f);
                this.f1622c.setAlpha(0.0f);
                c0155b4 = this.f1629j;
                if (c0155b4.f1637c) {
                    c0155b4.f1637c = false;
                    c0155b4.f1638d = 0.0f;
                    z2 = true;
                } else {
                    c0155b4.f1637c = false;
                    c0155b4.f1638d = 0.0f;
                    z2 = true;
                }
            }
            C0155b c0155b7 = this.f1630k;
            c0155b7.f1638d += c0155b7.f1635a * c0155b7.f1639e;
            if (this.f1631l) {
                vlf.m23436a("fakeView", "click anim begin " + this.f1630k.f1635a + " , " + this.f1630k.f1638d);
            }
            c0155b3 = this.f1630k;
            f3 = c0155b3.f1636b;
            if (f3 == 0.0f) {
                if (c0155b3.f1638d <= 0.0f) {
                    c0155b3.f1638d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 == 0.5f) {
                f4 = c0155b3.f1635a;
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
            f5 = c0155b3.f1638d;
            if (f5 >= 0.0f) {
                c0155b3.f1638d = 0.0f;
                z3 = false;
            } else {
                c0155b3.f1638d = 0.0f;
                z3 = false;
            }
            if (this.f1631l) {
                vlf.m23436a("fakeView", "click anim end " + this.f1630k.f1635a + " , " + this.f1630k.f1638d + " ， " + z3 + " , " + this.f1623d.getAlpha());
            }
        } else {
            f = c0155b.f1636b;
            if (f != 0.0f) {
                setClickAlpha(0.0f);
                this.f1622c.setAlpha(1.0f);
            } else {
                setClickAlpha(0.0f);
                this.f1622c.setAlpha(1.0f);
            }
            if (this.f1631l) {
                vlf.m23436a("fakeView", "click anim finish " + this.f1630k.f1635a + " , " + this.f1630k.f1638d + " ， " + this.f1630k.f1636b + " ， swipe: " + this.f1629j.f1635a + " , " + this.f1629j.f1638d + "," + this.f1629j.f1636b + ",false");
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
            c0155b2 = this.f1630k;
            if (c0155b2.f1637c) {
                if (c0155b2.f1636b == 1.0f) {
                    c0155b2.f1636b = 0.0f;
                }
                c0155b2.f1637c = false;
                f2 = c0155b2.f1636b;
                if (f2 != 0.0f) {
                    setClickAlpha(0.0f);
                    this.f1622c.setAlpha(1.0f);
                } else {
                    setClickAlpha(0.0f);
                    this.f1622c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f1622c.stepToFrame(this.f1629j.f1638d, false);
        }
        if (z4) {
            this.f1623d.stepToFrame(this.f1630k.f1638d % 1.0f, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2427h(boolean z) {
        if (this.f1632m) {
            boolean z2 = this.f1633n;
            ImageView imageView = this.f1625f;
            if (z2) {
                imageView.setAlpha(0.0f);
            } else {
                imageView.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2428l(String str, String str2) {
        this.f1623d.setImageDrawable(null);
        this.f1622c.setImageDrawable(null);
        this.f1625f.setAlpha(1.0f);
        this.f1633n = false;
        this.f1623d.stepToFrame(0.0f, false);
        this.f1622c.stepToFrame(0.0f, false);
        SVGALoader.SVGARequestBuilder sVGARequestBuilderAutoPlay = SVGALoader.with(getContext()).from(str2).loadCallback(new C0154a()).autoPlay(false);
        SVGAnimationView.FrameMode frameMode = SVGAnimationView.FrameMode.AFTER;
        sVGARequestBuilderAutoPlay.frameMode(frameMode).into(this.f1623d);
        if (this.f1626g) {
            SVGALoader.with(getContext()).from(str).frameMode(frameMode).autoPlay(false).into(this.f1622c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.b4, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f1622c = (HomeCardButtonSvgaView) viewInflate.findViewById(u4c0.e);
        this.f1623d = (HomeCardButtonSvgaView) viewInflate.findViewById(u4c0.z1);
        this.f1624e = viewInflate.findViewById(u4c0.f2);
        this.f1622c.setLayoutScale(this.f1627h);
        this.f1623d.setLayoutScale(this.f1627h);
        this.f1625f = (ImageView) viewInflate.findViewById(u4c0.q0);
        xdl0.E0(this.f1624e, new View.OnClickListener() { // from class: l.x3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOptButton.m2419e(view);
            }
        });
        setClipChildren(false);
        if (this.f1626g) {
            return;
        }
        this.f1622c.setVisibility(8);
        setClickAlpha(1.0f);
        this.f1622c.setVisibility(0);
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
        this.f1632m = z;
        if (z) {
            xdl0.M(this.f1625f, true);
            this.f1625f.setAlpha(1.0f);
        }
    }

    public void setCoverDrawable(int i) {
        SVGAnimationView sVGAnimationView = this.f1623d;
        if (i == 0) {
            sVGAnimationView.setVisibility(0);
        } else {
            sVGAnimationView.setVisibility(4);
        }
        this.f1624e.setBackgroundResource(i);
        xdl0.M(this.f1624e, i != 0);
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f1625f.setImageResource(i);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (!this.f1626g) {
            m2427h(z);
        }
        this.f1630k.f1639e = 0.5f / (getRefreshRate() * 0.165f);
        C0155b c0155b = this.f1630k;
        if (z) {
            float f = c0155b.f1638d;
            if (f >= 0.5f) {
                c0155b.f1636b = 0.5f;
                c0155b.f1635a = -1.0f;
                c0155b.f1637c = true;
                m2424n();
                return;
            }
            c0155b.f1636b = 0.5f;
            c0155b.f1638d = f + 1.0E-5f;
            c0155b.f1635a = 1.0f;
            c0155b.f1637c = true;
            m2424n();
            return;
        }
        float f2 = c0155b.f1638d;
        if (f2 == 0.0f) {
            return;
        }
        if (f2 >= 0.5f) {
            c0155b.f1636b = 1.0f;
            c0155b.f1635a = 1.0f;
            c0155b.f1637c = true;
            m2424n();
            return;
        }
        c0155b.f1636b = 1.0f;
        c0155b.f1635a = 1.0f;
        c0155b.f1637c = true;
        m2424n();
    }

    public void setShowLog(boolean z) {
        this.f1631l = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f1626g = z;
        if (z) {
            setClickAlpha(0.0f);
            this.f1622c.setVisibility(0);
            this.f1629j.f1635a = 0.0f;
        } else {
            this.f1622c.setVisibility(8);
            setClickAlpha(1.0f);
            this.f1622c.setVisibility(0);
        }
    }

    public HomeCardExpandedOptButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeCardExpandedOptButton(@NonNull Context context) {
        this(context, null);
    }
}
