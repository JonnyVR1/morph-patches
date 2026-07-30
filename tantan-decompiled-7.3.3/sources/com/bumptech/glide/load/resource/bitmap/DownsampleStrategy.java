package com.bumptech.glide.load.resource.bitmap;

import p153l.q560;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: a */
    public static final DownsampleStrategy f4601a = new C1097a();

    /* JADX INFO: renamed from: b */
    public static final DownsampleStrategy f4602b = new C1098b();

    /* JADX INFO: renamed from: c */
    public static final DownsampleStrategy f4603c = new C1101e();

    /* JADX INFO: renamed from: d */
    public static final DownsampleStrategy f4604d = new C1099c();

    /* JADX INFO: renamed from: e */
    public static final DownsampleStrategy f4605e;

    /* JADX INFO: renamed from: f */
    public static final DownsampleStrategy f4606f;

    /* JADX INFO: renamed from: g */
    public static final DownsampleStrategy f4607g;

    /* JADX INFO: renamed from: h */
    public static final q560<DownsampleStrategy> f4608h;

    /* JADX INFO: renamed from: i */
    static final boolean f4609i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C1097a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5542a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5543b(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C1098b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5542a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5543b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C1099c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5542a(int i, int i2, int i3, int i4) {
            return mo5543b(i, i2, i3, i4) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f4603c.mo5542a(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5543b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f4603c.mo5543b(i, i2, i3, i4));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C1100d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5542a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5543b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C1101e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5542a(int i, int i2, int i3, int i4) {
            return DownsampleStrategy.f4609i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5543b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f4609i) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C1102f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5542a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5543b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        C1100d c1100d = new C1100d();
        f4605e = c1100d;
        f4606f = new C1102f();
        f4607g = c1100d;
        f4608h = q560.m175297f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c1100d);
        f4609i = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract SampleSizeRounding mo5542a(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: b */
    public abstract float mo5543b(int i, int i2, int i3, int i4);
}
