package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import p153l.and0;
import p153l.bnd0;
import p153l.fnd0;
import p153l.h1e0;
import p153l.huf;
import p153l.i9j;
import p153l.jj5;
import p153l.knd0;
import p153l.p2j;
import p153l.uce;
import p153l.wn80;
import p153l.x0e0;

/* JADX INFO: loaded from: classes.dex */
public class WrappingUtils {

    /* JADX INFO: renamed from: a */
    public static final Drawable f6384a = new ColorDrawable(0);

    /* JADX INFO: renamed from: a */
    public static void m8324a(and0 and0Var, RoundingParams roundingParams) {
        and0Var.mo8291a(roundingParams.m8312l());
        and0Var.mo8298n(roundingParams.m8306f());
        and0Var.mo8293c(roundingParams.m8304d(), roundingParams.m8305e());
        and0Var.mo8294e(roundingParams.m8309i());
        and0Var.mo8297m(roundingParams.m8314n());
        and0Var.mo8296g(roundingParams.m8310j());
        and0Var.mo8295f(roundingParams.m8311k());
    }

    private static Drawable applyLeafRounding(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            bnd0 bnd0Var = new bnd0(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), roundingParams.m8311k());
            m8324a(bnd0Var, roundingParams);
            return bnd0Var;
        }
        if (drawable instanceof NinePatchDrawable) {
            knd0 knd0Var = new knd0((NinePatchDrawable) drawable);
            m8324a(knd0Var, roundingParams);
            return knd0Var;
        }
        if (!(drawable instanceof ColorDrawable)) {
            huf.m137198z("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        fnd0 fnd0VarM126360d = fnd0.m126360d((ColorDrawable) drawable);
        m8324a(fnd0VarM126360d, roundingParams);
        return fnd0VarM126360d;
    }

    /* JADX INFO: renamed from: b */
    public static uce m8325b(uce uceVar) {
        while (true) {
            Object objMo128371i = uceVar.mo128371i();
            if (objMo128371i == uceVar || !(objMo128371i instanceof uce)) {
                break;
            }
            uceVar = (uce) objMo128371i;
        }
        return uceVar;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m8326c(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && roundingParams != null && roundingParams.m8313m() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (!(drawable instanceof p2j)) {
                    return jj5.m145007a(drawable, roundingParams, resources);
                }
                uce uceVarM8325b = m8325b((p2j) drawable);
                uceVarM8325b.mo128372k(jj5.m145007a(uceVarM8325b.mo128372k(f6384a), roundingParams, resources));
                return drawable;
            }
            return drawable;
        } finally {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m8327d(Drawable drawable, RoundingParams roundingParams) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && roundingParams != null && roundingParams.m8313m() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                m8324a(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.m8300t(roundingParams.m8308h());
                return roundedCornersDrawable;
            }
            return drawable;
        } finally {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m8328e(Drawable drawable, h1e0 h1e0Var) {
        return m8329f(drawable, h1e0Var, null);
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m8329f(Drawable drawable, h1e0 h1e0Var, PointF pointF) {
        if (i9j.m139099d()) {
            i9j.m139097a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || h1e0Var == null) {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            return drawable;
        }
        x0e0 x0e0Var = new x0e0(drawable, h1e0Var);
        if (pointF != null) {
            x0e0Var.m208822w(pointF);
        }
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
        return x0e0Var;
    }

    /* JADX INFO: renamed from: g */
    public static void m8330g(and0 and0Var) {
        and0Var.mo8291a(false);
        and0Var.mo8292b(0.0f);
        and0Var.mo8293c(0, 0.0f);
        and0Var.mo8294e(0.0f);
        and0Var.mo8297m(false);
        and0Var.mo8296g(false);
        and0Var.mo8295f(bnd0.m105371p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static void m8331h(uce uceVar, RoundingParams roundingParams, Resources resources) {
        uce uceVarM8325b = m8325b(uceVar);
        Drawable drawableMo128371i = uceVarM8325b.mo128371i();
        if (roundingParams == null || roundingParams.m8313m() != RoundingParams.RoundingMethod.BITMAP_ONLY) {
            if (drawableMo128371i instanceof and0) {
                m8330g((and0) drawableMo128371i);
            }
        } else if (drawableMo128371i instanceof and0) {
            m8324a((and0) drawableMo128371i, roundingParams);
        } else if (drawableMo128371i != 0) {
            uceVarM8325b.mo128372k(f6384a);
            uceVarM8325b.mo128372k(jj5.m145007a(drawableMo128371i, roundingParams, resources));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m8332i(uce uceVar, RoundingParams roundingParams) {
        Drawable drawableMo128371i = uceVar.mo128371i();
        if (roundingParams == null || roundingParams.m8313m() != RoundingParams.RoundingMethod.OVERLAY_COLOR) {
            if (drawableMo128371i instanceof RoundedCornersDrawable) {
                Drawable drawable = f6384a;
                uceVar.mo128372k(((RoundedCornersDrawable) drawableMo128371i).mo163253q(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawableMo128371i instanceof RoundedCornersDrawable)) {
            uceVar.mo128372k(m8327d(uceVar.mo128372k(f6384a), roundingParams));
            return;
        }
        RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) drawableMo128371i;
        m8324a(roundedCornersDrawable, roundingParams);
        roundedCornersDrawable.m8300t(roundingParams.m8308h());
    }

    /* JADX INFO: renamed from: j */
    public static x0e0 m8333j(uce uceVar, h1e0 h1e0Var) {
        Drawable drawableM8328e = m8328e(uceVar.mo128372k(f6384a), h1e0Var);
        uceVar.mo128372k(drawableM8328e);
        wn80.m207183h(drawableM8328e, "Parent has no child drawable!");
        return (x0e0) drawableM8328e;
    }
}
