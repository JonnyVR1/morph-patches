package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import p149l.dfd0;
import p149l.ftd0;
import p149l.hfd0;
import p149l.ii5;
import p149l.o6j;
import p149l.qbe;
import p149l.rf80;
import p149l.tsf;
import p149l.uzi;
import p149l.vsd0;
import p149l.yed0;
import p149l.zed0;

/* JADX INFO: loaded from: classes.dex */
public class WrappingUtils {

    /* JADX INFO: renamed from: a */
    public static final Drawable f6347a = new ColorDrawable(0);

    /* JADX INFO: renamed from: a */
    public static void m8270a(yed0 yed0Var, RoundingParams roundingParams) {
        yed0Var.mo8237a(roundingParams.m8258l());
        yed0Var.mo8244n(roundingParams.m8252f());
        yed0Var.mo8239c(roundingParams.m8250d(), roundingParams.m8251e());
        yed0Var.mo8240e(roundingParams.m8255i());
        yed0Var.mo8243m(roundingParams.m8260n());
        yed0Var.mo8242g(roundingParams.m8256j());
        yed0Var.mo8241f(roundingParams.m8257k());
    }

    private static Drawable applyLeafRounding(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            zed0 zed0Var = new zed0(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), roundingParams.m8257k());
            m8270a(zed0Var, roundingParams);
            return zed0Var;
        }
        if (drawable instanceof NinePatchDrawable) {
            hfd0 hfd0Var = new hfd0((NinePatchDrawable) drawable);
            m8270a(hfd0Var, roundingParams);
            return hfd0Var;
        }
        if (!(drawable instanceof ColorDrawable)) {
            tsf.m190560z("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        dfd0 dfd0VarM111441d = dfd0.m111441d((ColorDrawable) drawable);
        m8270a(dfd0VarM111441d, roundingParams);
        return dfd0VarM111441d;
    }

    /* JADX INFO: renamed from: b */
    public static qbe m8271b(qbe qbeVar) {
        while (true) {
            Object objMo173824i = qbeVar.mo173824i();
            if (objMo173824i == qbeVar || !(objMo173824i instanceof qbe)) {
                break;
            }
            qbeVar = (qbe) objMo173824i;
        }
        return qbeVar;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m8272c(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && roundingParams != null && roundingParams.m8259m() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (!(drawable instanceof uzi)) {
                    return ii5.m136331a(drawable, roundingParams, resources);
                }
                qbe qbeVarM8271b = m8271b((uzi) drawable);
                qbeVarM8271b.mo173825k(ii5.m136331a(qbeVarM8271b.mo173825k(f6347a), roundingParams, resources));
                return drawable;
            }
            return drawable;
        } finally {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m8273d(Drawable drawable, RoundingParams roundingParams) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && roundingParams != null && roundingParams.m8259m() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                m8270a(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.m8246t(roundingParams.m8254h());
                return roundedCornersDrawable;
            }
            return drawable;
        } finally {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m8274e(Drawable drawable, ftd0 ftd0Var) {
        return m8275f(drawable, ftd0Var, null);
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m8275f(Drawable drawable, ftd0 ftd0Var, PointF pointF) {
        if (o6j.m162852d()) {
            o6j.m162850a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || ftd0Var == null) {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            return drawable;
        }
        vsd0 vsd0Var = new vsd0(drawable, ftd0Var);
        if (pointF != null) {
            vsd0Var.m199859w(pointF);
        }
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
        return vsd0Var;
    }

    /* JADX INFO: renamed from: g */
    public static void m8276g(yed0 yed0Var) {
        yed0Var.mo8237a(false);
        yed0Var.mo8238b(0.0f);
        yed0Var.mo8239c(0, 0.0f);
        yed0Var.mo8240e(0.0f);
        yed0Var.mo8243m(false);
        yed0Var.mo8242g(false);
        yed0Var.mo8241f(zed0.m218281p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static void m8277h(qbe qbeVar, RoundingParams roundingParams, Resources resources) {
        qbe qbeVarM8271b = m8271b(qbeVar);
        Drawable drawableMo173824i = qbeVarM8271b.mo173824i();
        if (roundingParams == null || roundingParams.m8259m() != RoundingParams.RoundingMethod.BITMAP_ONLY) {
            if (drawableMo173824i instanceof yed0) {
                m8276g((yed0) drawableMo173824i);
            }
        } else if (drawableMo173824i instanceof yed0) {
            m8270a((yed0) drawableMo173824i, roundingParams);
        } else if (drawableMo173824i != 0) {
            qbeVarM8271b.mo173825k(f6347a);
            qbeVarM8271b.mo173825k(ii5.m136331a(drawableMo173824i, roundingParams, resources));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m8278i(qbe qbeVar, RoundingParams roundingParams) {
        Drawable drawableMo173824i = qbeVar.mo173824i();
        if (roundingParams == null || roundingParams.m8259m() != RoundingParams.RoundingMethod.OVERLAY_COLOR) {
            if (drawableMo173824i instanceof RoundedCornersDrawable) {
                Drawable drawable = f6347a;
                qbeVar.mo173825k(((RoundedCornersDrawable) drawableMo173824i).mo164036q(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawableMo173824i instanceof RoundedCornersDrawable)) {
            qbeVar.mo173825k(m8273d(qbeVar.mo173825k(f6347a), roundingParams));
            return;
        }
        RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) drawableMo173824i;
        m8270a(roundedCornersDrawable, roundingParams);
        roundedCornersDrawable.m8246t(roundingParams.m8254h());
    }

    /* JADX INFO: renamed from: j */
    public static vsd0 m8279j(qbe qbeVar, ftd0 ftd0Var) {
        Drawable drawableM8274e = m8274e(qbeVar.mo173825k(f6347a), ftd0Var);
        qbeVar.mo173825k(drawableM8274e);
        rf80.m179117h(drawableM8274e, "Parent has no child drawable!");
        return (vsd0) drawableM8274e;
    }
}
