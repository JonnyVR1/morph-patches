package com.sunshine.engine.base;

import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import com.p051p1.mobile.putong.data.OMSWidgeAnimationType;
import com.sunshine.engine.base.InterpolatorType;
import p153l.i1n;

/* JADX INFO: loaded from: classes11.dex */
public enum InterpolatorType {
    linear("linear", new InterfaceC13645a() { // from class: com.sunshine.engine.base.i
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82119t(i);
        }
    }),
    accelerate("accelerate", new InterfaceC13645a() { // from class: com.sunshine.engine.base.l
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82112m(i);
        }
    }),
    decelerate("decelerate", new InterfaceC13645a() { // from class: com.sunshine.engine.base.m
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82115p(i);
        }
    }),
    accelerateDecelerate("accelerateDecelerate", new InterfaceC13645a() { // from class: com.sunshine.engine.base.b
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82103A(i);
        }
    }),
    overshoot("overshoot", new InterfaceC13645a() { // from class: com.sunshine.engine.base.c
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82123x(i);
        }
    }),
    bounce("bounce", new InterfaceC13645a() { // from class: com.sunshine.engine.base.d
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82109h(i);
        }
    }),
    spring("spring", new InterfaceC13645a() { // from class: com.sunshine.engine.base.e
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82114o(i);
        }
    }),
    shake(OMSWidgeAnimationType.shake, new InterfaceC13645a() { // from class: com.sunshine.engine.base.f
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82108g(i);
        }
    }),
    resonance("resonance", new InterfaceC13645a() { // from class: com.sunshine.engine.base.g
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82121v(i);
        }
    }),
    sin("sin", new InterfaceC13645a() { // from class: com.sunshine.engine.base.h
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82110i(i);
        }
    }),
    cos("cos", new InterfaceC13645a() { // from class: com.sunshine.engine.base.j
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82125z(i);
        }
    }),
    triangle("triangle", new InterfaceC13645a() { // from class: com.sunshine.engine.base.k
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13645a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo82126a(int i) {
            return InterpolatorType.m82105a(i);
        }
    });

    private final InterfaceC13645a callback;
    private final String text;

    /* JADX INFO: renamed from: com.sunshine.engine.base.InterpolatorType$a */
    public interface InterfaceC13645a {
        /* JADX INFO: renamed from: a */
        Interpolator mo82126a(int i);
    }

    InterpolatorType(String str, InterfaceC13645a interfaceC13645a) {
        this.text = str;
        this.callback = interfaceC13645a;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Interpolator m82103A(int i) {
        return new Interpolator() { // from class: l.s1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82118s(f);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ float m82104B(int i, float f) {
        return ((float) Math.pow(1.0f - f, 2.0d)) * ((float) Math.sin(((((double) i) * 6.283185307179586d) / 2.0d) * ((double) f)));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Interpolator m82105a(final int i) {
        return new Interpolator() { // from class: l.t1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82106b(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ float m82106b(int i, float f) {
        float f2 = f * 2.0f * i;
        int i2 = (int) f2;
        return i2 % 2 == 0 ? f2 - i2 : (1.0f - f2) + i2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ float m82107f(float f) {
        return 4.0f * f * (1.0f - f);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Interpolator m82108g(final int i) {
        return new Interpolator() { // from class: l.p1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82104B(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Interpolator m82109h(int i) {
        return new BounceInterpolator();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Interpolator m82110i(final int i) {
        return new Interpolator() { // from class: l.k1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82113n(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ float m82111j(int i, float f) {
        return (float) Math.pow(f, i < 2 ? 2.0d : i);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Interpolator m82112m(final int i) {
        return new Interpolator() { // from class: l.q1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82111j(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ float m82113n(int i, float f) {
        return (float) Math.sin(((((double) i) * 6.283185307179586d) / 2.0d) * ((double) f));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Interpolator m82114o(int i) {
        return new Interpolator() { // from class: l.m1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82107f(f);
            }
        };
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Interpolator m82115p(final int i) {
        return new Interpolator() { // from class: l.o1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82117r(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ float m82116q(int i, float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * (((i + 1) * f2) + i)) + 1.0f;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ float m82117r(int i, float f) {
        return 1.0f - ((float) Math.pow(1.0f - f, i < 2 ? 2.0d : i));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ float m82118s(float f) {
        return ((float) (Math.cos(((double) (f + 1.0f)) * 3.141592653589793d) / 2.0d)) + 0.5f;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Interpolator m82119t(int i) {
        return new Interpolator() { // from class: l.r1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82120u(f);
            }
        };
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ float m82120u(float f) {
        return f;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Interpolator m82121v(final int i) {
        return new Interpolator() { // from class: l.n1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82124y(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ float m82122w(int i, float f) {
        return (float) Math.cos(((((double) i) * 6.283185307179586d) / 2.0d) * ((double) f));
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Interpolator m82123x(final int i) {
        return new Interpolator() { // from class: l.l1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82116q(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ float m82124y(int i, float f) {
        double d = 1.0f - f;
        return (1.0f - ((float) Math.pow(d, 2.0d))) * ((float) Math.sin(((((double) i) * 6.283185307179586d) / 2.0d) * ((double) f) * (1.0d - Math.pow(d, 2.0d))));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Interpolator m82125z(final int i) {
        return new Interpolator() { // from class: l.j1n
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m82122w(i, f);
            }
        };
    }

    public Interpolator build(int i) {
        return this.callback.mo82126a(i);
    }

    public Interpolator obtain(int i) {
        return i1n.m138143c(toString() + "_" + i);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }

    public Interpolator obtain() {
        return i1n.m138143c(toString());
    }
}
