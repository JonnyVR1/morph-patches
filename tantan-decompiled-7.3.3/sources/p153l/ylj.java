package p153l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;

/* JADX INFO: loaded from: classes.dex */
public class ylj {
    /* JADX INFO: renamed from: a */
    public static Drawable m216572a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    /* JADX INFO: renamed from: b */
    public static RoundingParams m216573b(xlj xljVar) {
        if (xljVar.m211656s() == null) {
            xljVar.m211636K(new RoundingParams());
        }
        return xljVar.m211656s();
    }

    /* JADX INFO: renamed from: c */
    public static h1e0 m216574c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return h1e0.f107444a;
            case 1:
                return h1e0.f107447d;
            case 2:
                return h1e0.f107448e;
            case 3:
                return h1e0.f107449f;
            case 4:
                return h1e0.f107450g;
            case 5:
                return h1e0.f107451h;
            case 6:
                return h1e0.f107452i;
            case 7:
                return h1e0.f107453j;
            case 8:
                return h1e0.f107454k;
            default:
                azk0.m101074a("XML attribute not specified!");
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static xlj m216575d(Context context, AttributeSet attributeSet) {
        if (i9j.m139099d()) {
            i9j.m139097a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        xlj xljVarM216576e = m216576e(new xlj(context.getResources()), context, attributeSet);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
        return xljVarM216576e;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[PHI: r1 r2 r3
      0x01c6: PHI (r1v18 boolean) = (r1v14 boolean), (r1v20 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    public static xlj m216576e(xlj xljVar, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, wgc0.f188941a);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                int integer = 0;
                int i3 = 0;
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                int dimensionPixelSize = 0;
                while (i3 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i3);
                        if (index == wgc0.f188942b) {
                            xljVar.m211658v(m216574c(typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188948h) {
                            xljVar.m211629D(m216572a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188950j) {
                            xljVar.m211631F(m216572a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188952l) {
                            xljVar.m211632G(m216572a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188944d) {
                            xljVar.m211661y(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == wgc0.f188937D) {
                            xljVar.m211660x(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == wgc0.f188949i) {
                            xljVar.m211630E(m216574c(typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188954n) {
                            xljVar.m211634I(m216572a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188955o) {
                            xljVar.m211635J(m216574c(typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188945e) {
                            xljVar.m211626A(m216572a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188946f) {
                            xljVar.m211627B(m216574c(typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188953m) {
                            xljVar.m211633H(m216574c(typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188951k) {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                        } else if (index == wgc0.f188943c) {
                            xljVar.m211659w(m216572a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188947g) {
                            xljVar.m211628C(m216572a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == wgc0.f188956p) {
                            m216573b(xljVar).m8322v(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        } else if (index == wgc0.f188966z) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else {
                            int i4 = dimensionPixelSize;
                            if (index == wgc0.f188962v) {
                                z6 = typedArrayObtainStyledAttributes.getBoolean(index, z6);
                            } else if (index == wgc0.f188963w) {
                                z8 = typedArrayObtainStyledAttributes.getBoolean(index, z8);
                            } else if (index == wgc0.f188958r) {
                                z12 = typedArrayObtainStyledAttributes.getBoolean(index, z12);
                            } else if (index == wgc0.f188959s) {
                                z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                            } else if (index == wgc0.f188964x) {
                                z7 = typedArrayObtainStyledAttributes.getBoolean(index, z7);
                            } else if (index == wgc0.f188961u) {
                                z9 = typedArrayObtainStyledAttributes.getBoolean(index, z9);
                            } else if (index == wgc0.f188960t) {
                                z13 = typedArrayObtainStyledAttributes.getBoolean(index, z13);
                            } else {
                                if (index == wgc0.f188957q) {
                                    z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                                } else if (index == wgc0.f188965y) {
                                    dimensionPixelSize = i4;
                                    m216573b(xljVar).m8320t(typedArrayObtainStyledAttributes.getColor(index, 0));
                                } else {
                                    dimensionPixelSize = i4;
                                    if (index == wgc0.f188936C) {
                                        m216573b(xljVar).m8317q(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    } else if (index == wgc0.f188934A) {
                                        m216573b(xljVar).m8316p(typedArrayObtainStyledAttributes.getColor(index, 0));
                                    } else if (index == wgc0.f188935B) {
                                        m216573b(xljVar).m8321u(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    }
                                }
                                i3++;
                                context2 = context;
                            }
                            dimensionPixelSize = i4;
                        }
                        i3++;
                        context2 = context;
                    } catch (Throwable th) {
                        th = th;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                boolean z14 = false;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z5 = z6 && z9;
                    z = z8 && z7;
                    z2 = z10 && z13;
                    if (z12 && z11) {
                        z14 = true;
                    }
                } else {
                    z5 = z6 && z7;
                    z = z8 && z9;
                    z2 = z10 && z11;
                    if (z12 && z13) {
                        z14 = true;
                    }
                }
                z4 = z14;
                i = integer;
                z3 = z5;
                i2 = dimensionPixelSize;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            z = true;
            i = 0;
            z2 = true;
            z3 = true;
            z4 = true;
            i2 = 0;
        }
        if (xljVar.m211651n() != null && i > 0) {
            xljVar.m211632G(new nj1(xljVar.m211651n(), i));
        }
        if (i2 > 0) {
            m216573b(xljVar).m8318r(z3 ? i2 : 0.0f, z ? i2 : 0.0f, z2 ? i2 : 0.0f, z4 ? i2 : 0.0f);
        }
        return xljVar;
    }
}
