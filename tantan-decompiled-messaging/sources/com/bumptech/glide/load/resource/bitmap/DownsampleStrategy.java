package com.bumptech.glide.load.resource.bitmap;

import p149l.kx50;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: a */
    public static final DownsampleStrategy f4589a = new C1087a();

    /* JADX INFO: renamed from: b */
    public static final DownsampleStrategy f4590b = new C1088b();

    /* JADX INFO: renamed from: c */
    public static final DownsampleStrategy f4591c = new C1091e();

    /* JADX INFO: renamed from: d */
    public static final DownsampleStrategy f4592d = new C1089c();

    /* JADX INFO: renamed from: e */
    public static final DownsampleStrategy f4593e;

    /* JADX INFO: renamed from: f */
    public static final DownsampleStrategy f4594f;

    /* JADX INFO: renamed from: g */
    public static final DownsampleStrategy f4595g;

    /* JADX INFO: renamed from: h */
    public static final kx50<DownsampleStrategy> f4596h;

    /* JADX INFO: renamed from: i */
    static final boolean f4597i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C1087a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5515a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5516b(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C1088b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5515a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5516b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C1089c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5515a(int i, int i2, int i3, int i4) {
            return mo5516b(i, i2, i3, i4) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f4591c.mo5515a(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5516b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f4591c.mo5516b(i, i2, i3, i4));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C1090d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5515a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5516b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C1091e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5515a(int i, int i2, int i3, int i4) {
            return DownsampleStrategy.f4597i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5516b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f4597i) {
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
    public static class C1092f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo5515a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo5516b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        C1090d c1090d = new C1090d();
        f4593e = c1090d;
        f4594f = new C1092f();
        f4595g = c1090d;
        f4596h = kx50.m147678f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c1090d);
        f4597i = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract SampleSizeRounding mo5515a(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: b */
    public abstract float mo5516b(int i, int i2, int i3, int i4);
}
