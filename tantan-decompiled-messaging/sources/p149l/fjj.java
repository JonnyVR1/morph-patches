package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;

/* JADX INFO: loaded from: classes.dex */
public class fjj {
    /* JADX INFO: renamed from: a */
    public static Drawable m121600a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    /* JADX INFO: renamed from: b */
    public static RoundingParams m121601b(ejj ejjVar) {
        if (ejjVar.m116890s() == null) {
            ejjVar.m116870K(new RoundingParams());
        }
        return ejjVar.m116890s();
    }

    /* JADX INFO: renamed from: c */
    public static ftd0 m121602c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return ftd0.f99177a;
            case 1:
                return ftd0.f99180d;
            case 2:
                return ftd0.f99181e;
            case 3:
                return ftd0.f99182f;
            case 4:
                return ftd0.f99183g;
            case 5:
                return ftd0.f99184h;
            case 6:
                return ftd0.f99185i;
            case 7:
                return ftd0.f99186j;
            case 8:
                return ftd0.f99187k;
            default:
                upk0.m194883a("XML attribute not specified!");
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static ejj m121603d(Context context, AttributeSet attributeSet) {
        if (o6j.m162852d()) {
            o6j.m162850a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        ejj ejjVarM121604e = m121604e(new ejj(context.getResources()), context, attributeSet);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
        return ejjVarM121604e;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[PHI: r1 r2 r3
      0x01c6: PHI (r1v18 boolean) = (r1v14 boolean), (r1v20 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    public static ejj m121604e(ejj ejjVar, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, r8c0.f158178a);
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
                        if (index == r8c0.f158179b) {
                            ejjVar.m116892v(m121602c(typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158185h) {
                            ejjVar.m116863D(m121600a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158187j) {
                            ejjVar.m116865F(m121600a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158189l) {
                            ejjVar.m116866G(m121600a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158181d) {
                            ejjVar.m116895y(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == r8c0.f158174D) {
                            ejjVar.m116894x(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == r8c0.f158186i) {
                            ejjVar.m116864E(m121602c(typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158191n) {
                            ejjVar.m116868I(m121600a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158192o) {
                            ejjVar.m116869J(m121602c(typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158182e) {
                            ejjVar.m116860A(m121600a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158183f) {
                            ejjVar.m116861B(m121602c(typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158190m) {
                            ejjVar.m116867H(m121602c(typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158188k) {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                        } else if (index == r8c0.f158180c) {
                            ejjVar.m116893w(m121600a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158184g) {
                            ejjVar.m116862C(m121600a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == r8c0.f158193p) {
                            m121601b(ejjVar).m8268v(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        } else if (index == r8c0.f158203z) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else {
                            int i4 = dimensionPixelSize;
                            if (index == r8c0.f158199v) {
                                z6 = typedArrayObtainStyledAttributes.getBoolean(index, z6);
                            } else if (index == r8c0.f158200w) {
                                z8 = typedArrayObtainStyledAttributes.getBoolean(index, z8);
                            } else if (index == r8c0.f158195r) {
                                z12 = typedArrayObtainStyledAttributes.getBoolean(index, z12);
                            } else if (index == r8c0.f158196s) {
                                z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                            } else if (index == r8c0.f158201x) {
                                z7 = typedArrayObtainStyledAttributes.getBoolean(index, z7);
                            } else if (index == r8c0.f158198u) {
                                z9 = typedArrayObtainStyledAttributes.getBoolean(index, z9);
                            } else if (index == r8c0.f158197t) {
                                z13 = typedArrayObtainStyledAttributes.getBoolean(index, z13);
                            } else {
                                if (index == r8c0.f158194q) {
                                    z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                                } else if (index == r8c0.f158202y) {
                                    dimensionPixelSize = i4;
                                    m121601b(ejjVar).m8266t(typedArrayObtainStyledAttributes.getColor(index, 0));
                                } else {
                                    dimensionPixelSize = i4;
                                    if (index == r8c0.f158173C) {
                                        m121601b(ejjVar).m8263q(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    } else if (index == r8c0.f158171A) {
                                        m121601b(ejjVar).m8262p(typedArrayObtainStyledAttributes.getColor(index, 0));
                                    } else if (index == r8c0.f158172B) {
                                        m121601b(ejjVar).m8267u(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
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
        if (ejjVar.m116885n() != null && i > 0) {
            ejjVar.m116866G(new gj1(ejjVar.m116885n(), i));
        }
        if (i2 > 0) {
            m121601b(ejjVar).m8264r(z3 ? i2 : 0.0f, z ? i2 : 0.0f, z2 ? i2 : 0.0f, z4 ? i2 : 0.0f);
        }
        return ejjVar;
    }
}
