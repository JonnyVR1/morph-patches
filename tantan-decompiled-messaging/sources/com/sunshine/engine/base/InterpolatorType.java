package com.sunshine.engine.base;

import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import com.p046p1.mobile.putong.data.OMSWidgeAnimationType;
import com.sunshine.engine.base.InterpolatorType;
import p149l.jzm;

/* JADX INFO: loaded from: classes13.dex */
public enum InterpolatorType {
    linear("linear", new InterfaceC13482a() { // from class: com.sunshine.engine.base.i
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80936t(i);
        }
    }),
    accelerate("accelerate", new InterfaceC13482a() { // from class: com.sunshine.engine.base.l
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80929m(i);
        }
    }),
    decelerate("decelerate", new InterfaceC13482a() { // from class: com.sunshine.engine.base.m
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80932p(i);
        }
    }),
    accelerateDecelerate("accelerateDecelerate", new InterfaceC13482a() { // from class: com.sunshine.engine.base.b
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80920A(i);
        }
    }),
    overshoot("overshoot", new InterfaceC13482a() { // from class: com.sunshine.engine.base.c
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80940x(i);
        }
    }),
    bounce("bounce", new InterfaceC13482a() { // from class: com.sunshine.engine.base.d
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80926h(i);
        }
    }),
    spring("spring", new InterfaceC13482a() { // from class: com.sunshine.engine.base.e
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80931o(i);
        }
    }),
    shake(OMSWidgeAnimationType.shake, new InterfaceC13482a() { // from class: com.sunshine.engine.base.f
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80925g(i);
        }
    }),
    resonance("resonance", new InterfaceC13482a() { // from class: com.sunshine.engine.base.g
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80938v(i);
        }
    }),
    sin("sin", new InterfaceC13482a() { // from class: com.sunshine.engine.base.h
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80927i(i);
        }
    }),
    cos("cos", new InterfaceC13482a() { // from class: com.sunshine.engine.base.j
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80942z(i);
        }
    }),
    triangle("triangle", new InterfaceC13482a() { // from class: com.sunshine.engine.base.k
        @Override // com.sunshine.engine.base.InterpolatorType.InterfaceC13482a
        /* JADX INFO: renamed from: a */
        public final Interpolator mo80943a(int i) {
            return InterpolatorType.m80922a(i);
        }
    });

    private final InterfaceC13482a callback;
    private final String text;

    /* JADX INFO: renamed from: com.sunshine.engine.base.InterpolatorType$a */
    public interface InterfaceC13482a {
        /* JADX INFO: renamed from: a */
        Interpolator mo80943a(int i);
    }

    InterpolatorType(String str, InterfaceC13482a interfaceC13482a) {
        this.text = str;
        this.callback = interfaceC13482a;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Interpolator m80920A(int i) {
        return new Interpolator() { // from class: l.tzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80935s(f);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ float m80921B(int i, float f) {
        return ((float) Math.pow(1.0f - f, 2.0d)) * ((float) Math.sin(((((double) i) * 6.283185307179586d) / 2.0d) * ((double) f)));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Interpolator m80922a(final int i) {
        return new Interpolator() { // from class: l.uzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80923b(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ float m80923b(int i, float f) {
        float f2 = f * 2.0f * i;
        int i2 = (int) f2;
        return i2 % 2 == 0 ? f2 - i2 : (1.0f - f2) + i2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ float m80924f(float f) {
        return 4.0f * f * (1.0f - f);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Interpolator m80925g(final int i) {
        return new Interpolator() { // from class: l.qzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80921B(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Interpolator m80926h(int i) {
        return new BounceInterpolator();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Interpolator m80927i(final int i) {
        return new Interpolator() { // from class: l.lzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80930n(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ float m80928j(int i, float f) {
        return (float) Math.pow(f, i < 2 ? 2.0d : i);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Interpolator m80929m(final int i) {
        return new Interpolator() { // from class: l.rzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80928j(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ float m80930n(int i, float f) {
        return (float) Math.sin(((((double) i) * 6.283185307179586d) / 2.0d) * ((double) f));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Interpolator m80931o(int i) {
        return new Interpolator() { // from class: l.nzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80924f(f);
            }
        };
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Interpolator m80932p(final int i) {
        return new Interpolator() { // from class: l.pzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80934r(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ float m80933q(int i, float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * (((i + 1) * f2) + i)) + 1.0f;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ float m80934r(int i, float f) {
        return 1.0f - ((float) Math.pow(1.0f - f, i < 2 ? 2.0d : i));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ float m80935s(float f) {
        return ((float) (Math.cos(((double) (f + 1.0f)) * 3.141592653589793d) / 2.0d)) + 0.5f;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Interpolator m80936t(int i) {
        return new Interpolator() { // from class: l.szm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80937u(f);
            }
        };
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ float m80937u(float f) {
        return f;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Interpolator m80938v(final int i) {
        return new Interpolator() { // from class: l.ozm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80941y(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ float m80939w(int i, float f) {
        return (float) Math.cos(((((double) i) * 6.283185307179586d) / 2.0d) * ((double) f));
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Interpolator m80940x(final int i) {
        return new Interpolator() { // from class: l.mzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80933q(i, f);
            }
        };
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ float m80941y(int i, float f) {
        double d = 1.0f - f;
        return (1.0f - ((float) Math.pow(d, 2.0d))) * ((float) Math.sin(((((double) i) * 6.283185307179586d) / 2.0d) * ((double) f) * (1.0d - Math.pow(d, 2.0d))));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Interpolator m80942z(final int i) {
        return new Interpolator() { // from class: l.kzm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InterpolatorType.m80939w(i, f);
            }
        };
    }

    public Interpolator build(int i) {
        return this.callback.mo80943a(i);
    }

    public Interpolator obtain(int i) {
        return jzm.m143936c(toString() + "_" + i);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }

    public Interpolator obtain() {
        return jzm.m143936c(toString());
    }
}
