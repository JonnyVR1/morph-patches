package p149l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class osk0 extends nsk0 {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f145404k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public C19024h f145405b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f145406c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f145407d;

    /* JADX INFO: renamed from: e */
    public boolean f145408e;

    /* JADX INFO: renamed from: f */
    public boolean f145409f;

    /* JADX INFO: renamed from: g */
    public Drawable.ConstantState f145410g;

    /* JADX INFO: renamed from: h */
    public final float[] f145411h;

    /* JADX INFO: renamed from: i */
    public final Matrix f145412i;

    /* JADX INFO: renamed from: j */
    public final Rect f145413j;

    /* JADX INFO: renamed from: l.osk0$e */
    public static abstract class AbstractC19021e {
        public AbstractC19021e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo165796a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo165797b(int[] iArr) {
            return false;
        }
    }

    public osk0(@NonNull C19024h c19024h) {
        this.f145409f = true;
        this.f145411h = new float[9];
        this.f145412i = new Matrix();
        this.f145413j = new Rect();
        this.f145405b = c19024h;
        this.f145406c = m165792g(this.f145406c, c19024h.f145462c, c19024h.f145463d);
    }

    /* JADX INFO: renamed from: a */
    public static int m165786a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static osk0 m165787b(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        osk0 osk0Var = new osk0();
        osk0Var.f140279a = ywc0.m216334e(resources, i, theme);
        osk0Var.f145410g = new C19025i(osk0Var.f140279a.getConstantState());
        return osk0Var;
    }

    /* JADX INFO: renamed from: e */
    public static PorterDuff.Mode m165788e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* JADX INFO: renamed from: c */
    public final void m165789c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C19024h c19024h = this.f145405b;
        C19023g c19023g = c19024h.f145461b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c19023g.f145451h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C19020d c19020d = (C19020d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C19019c c19019c = new C19019c();
                    c19019c.m165800g(resources, attributeSet, theme, xmlPullParser);
                    c19020d.f145427b.add(c19019c);
                    if (c19019c.getPathName() != null) {
                        c19023g.f145459p.put(c19019c.getPathName(), c19019c);
                    }
                    c19024h.f145460a = c19019c.f145442d | c19024h.f145460a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C19018b c19018b = new C19018b();
                    c19018b.m165795e(resources, attributeSet, theme, xmlPullParser);
                    c19020d.f145427b.add(c19018b);
                    if (c19018b.getPathName() != null) {
                        c19023g.f145459p.put(c19018b.getPathName(), c19018b);
                    }
                    c19024h.f145460a = c19018b.f145442d | c19024h.f145460a;
                } else if ("group".equals(name)) {
                    C19020d c19020d2 = new C19020d();
                    c19020d2.m165802c(resources, attributeSet, theme, xmlPullParser);
                    c19020d.f145427b.add(c19020d2);
                    arrayDeque.push(c19020d2);
                    if (c19020d2.getGroupName() != null) {
                        c19023g.f145459p.put(c19020d2.getGroupName(), c19020d2);
                    }
                    c19024h.f145460a = c19020d2.f145436k | c19024h.f145460a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f140279a;
        if (drawable == null) {
            return false;
        }
        kbe.m145268b(drawable);
        return false;
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m165790d() {
        return isAutoMirrored() && kbe.m145272f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f145413j);
        if (this.f145413j.width() <= 0 || this.f145413j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f145407d;
        if (colorFilter == null) {
            colorFilter = this.f145406c;
        }
        canvas.getMatrix(this.f145412i);
        this.f145412i.getValues(this.f145411h);
        float fAbs = Math.abs(this.f145411h[0]);
        float fAbs2 = Math.abs(this.f145411h[4]);
        float fAbs3 = Math.abs(this.f145411h[1]);
        float fAbs4 = Math.abs(this.f145411h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f145413j.width() * fAbs);
        int iHeight = (int) (this.f145413j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f145413j;
        canvas.translate(rect.left, rect.top);
        if (m165790d()) {
            canvas.translate(this.f145413j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f145413j.offsetTo(0, 0);
        this.f145405b.m165815c(iMin, iMin2);
        boolean z = this.f145409f;
        C19024h c19024h = this.f145405b;
        if (!z) {
            c19024h.m165822j(iMin, iMin2);
        } else if (!c19024h.m165814b()) {
            this.f145405b.m165822j(iMin, iMin2);
            this.f145405b.m165821i();
        }
        this.f145405b.m165816d(canvas, colorFilter, this.f145413j);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: f */
    public final void m165791f(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C19024h c19024h = this.f145405b;
        C19023g c19023g = c19024h.f145461b;
        c19024h.f145463d = m165788e(zej0.m218349g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM218345c = zej0.m218345c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM218345c != null) {
            c19024h.f145462c = colorStateListM218345c;
        }
        c19024h.f145464e = zej0.m218343a(typedArray, xmlPullParser, "autoMirrored", 5, c19024h.f145464e);
        c19023g.f145454k = zej0.m218348f(typedArray, xmlPullParser, "viewportWidth", 7, c19023g.f145454k);
        float fM218348f = zej0.m218348f(typedArray, xmlPullParser, "viewportHeight", 8, c19023g.f145455l);
        c19023g.f145455l = fM218348f;
        if (c19023g.f145454k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM218348f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c19023g.f145452i = typedArray.getDimension(3, c19023g.f145452i);
        float dimension = typedArray.getDimension(2, c19023g.f145453j);
        c19023g.f145453j = dimension;
        if (c19023g.f145452i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c19023g.setAlpha(zej0.m218348f(typedArray, xmlPullParser, "alpha", 4, c19023g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c19023g.f145457n = string;
            c19023g.f145459p.put(string, c19023g);
        }
    }

    /* JADX INFO: renamed from: g */
    public PorterDuffColorFilter m165792g(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f140279a;
        return drawable != null ? kbe.m145270d(drawable) : this.f145405b.f145461b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f145405b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f140279a;
        return drawable != null ? kbe.m145271e(drawable) : this.f145407d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f140279a != null) {
            return new C19025i(this.f140279a.getConstantState());
        }
        this.f145405b.f145460a = getChangingConfigurations();
        return this.f145405b;
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f140279a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f145405b.f145461b.f145453j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f140279a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f145405b.f145461b.f145452i;
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            kbe.m145273g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C19024h c19024h = this.f145405b;
        c19024h.f145461b = new C19023g();
        TypedArray typedArrayM218353k = zej0.m218353k(resources, theme, attributeSet, io0.f114076a);
        m165791f(typedArrayM218353k, xmlPullParser, theme);
        typedArrayM218353k.recycle();
        c19024h.f145460a = getChangingConfigurations();
        c19024h.f145470k = true;
        m165789c(resources, xmlPullParser, attributeSet, theme);
        this.f145406c = m165792g(this.f145406c, c19024h.f145462c, c19024h.f145463d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f140279a;
        return drawable != null ? kbe.m145274h(drawable) : this.f145405b.f145464e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C19024h c19024h = this.f145405b;
        if (c19024h == null) {
            return false;
        }
        if (c19024h.m165819g()) {
            return true;
        }
        ColorStateList colorStateList = this.f145405b.f145462c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f145408e && super.mutate() == this) {
            this.f145405b = new C19024h(this.f145405b);
            this.f145408e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C19024h c19024h = this.f145405b;
        ColorStateList colorStateList = c19024h.f145462c;
        if (colorStateList == null || (mode = c19024h.f145463d) == null) {
            z = false;
        } else {
            this.f145406c = m165792g(this.f145406c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c19024h.m165819g() || !c19024h.m165820h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f145405b.f145461b.getRootAlpha() != i) {
            this.f145405b.f145461b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            kbe.m145276j(drawable, z);
        } else {
            this.f145405b.f145464e = z;
        }
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f145407d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            kbe.m145280n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            kbe.m145281o(drawable, colorStateList);
            return;
        }
        C19024h c19024h = this.f145405b;
        if (c19024h.f145462c != colorStateList) {
            c19024h.f145462c = colorStateList;
            this.f145406c = m165792g(this.f145406c, colorStateList, c19024h.f145463d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            kbe.m145282p(drawable, mode);
            return;
        }
        C19024h c19024h = this.f145405b;
        if (c19024h.f145463d != mode) {
            c19024h.f145463d = mode;
            this.f145406c = m165792g(this.f145406c, c19024h.f145462c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f140279a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: l.osk0$b */
    public static class C19018b extends AbstractC19022f {
        public C19018b() {
        }

        /* JADX INFO: renamed from: f */
        private void m165793f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f145440b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f145439a = xa60.m207533d(string2);
            }
            this.f145441c = zej0.m218349g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p149l.osk0.AbstractC19022f
        /* JADX INFO: renamed from: c */
        public boolean mo165794c() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public void m165795e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (zej0.m218352j(xmlPullParser, "pathData")) {
                TypedArray typedArrayM218353k = zej0.m218353k(resources, theme, attributeSet, io0.f114079d);
                m165793f(typedArrayM218353k, xmlPullParser);
                typedArrayM218353k.recycle();
            }
        }

        public C19018b(C19018b c19018b) {
            super(c19018b);
        }
    }

    /* JADX INFO: renamed from: l.osk0$h */
    public static class C19024h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f145460a;

        /* JADX INFO: renamed from: b */
        public C19023g f145461b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f145462c;

        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode f145463d;

        /* JADX INFO: renamed from: e */
        public boolean f145464e;

        /* JADX INFO: renamed from: f */
        public Bitmap f145465f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f145466g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f145467h;

        /* JADX INFO: renamed from: i */
        public int f145468i;

        /* JADX INFO: renamed from: j */
        public boolean f145469j;

        /* JADX INFO: renamed from: k */
        public boolean f145470k;

        /* JADX INFO: renamed from: l */
        public Paint f145471l;

        public C19024h(C19024h c19024h) {
            this.f145462c = null;
            this.f145463d = osk0.f145404k;
            if (c19024h != null) {
                this.f145460a = c19024h.f145460a;
                C19023g c19023g = new C19023g(c19024h.f145461b);
                this.f145461b = c19023g;
                if (c19024h.f145461b.f145448e != null) {
                    c19023g.f145448e = new Paint(c19024h.f145461b.f145448e);
                }
                if (c19024h.f145461b.f145447d != null) {
                    this.f145461b.f145447d = new Paint(c19024h.f145461b.f145447d);
                }
                this.f145462c = c19024h.f145462c;
                this.f145463d = c19024h.f145463d;
                this.f145464e = c19024h.f145464e;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m165813a(int i, int i2) {
            return i == this.f145465f.getWidth() && i2 == this.f145465f.getHeight();
        }

        /* JADX INFO: renamed from: b */
        public boolean m165814b() {
            return !this.f145470k && this.f145466g == this.f145462c && this.f145467h == this.f145463d && this.f145469j == this.f145464e && this.f145468i == this.f145461b.getRootAlpha();
        }

        /* JADX INFO: renamed from: c */
        public void m165815c(int i, int i2) {
            if (this.f145465f == null || !m165813a(i, i2)) {
                this.f145465f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f145470k = true;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m165816d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f145465f, (Rect) null, rect, m165817e(colorFilter));
        }

        /* JADX INFO: renamed from: e */
        public Paint m165817e(ColorFilter colorFilter) {
            if (!m165818f() && colorFilter == null) {
                return null;
            }
            if (this.f145471l == null) {
                Paint paint = new Paint();
                this.f145471l = paint;
                paint.setFilterBitmap(true);
            }
            this.f145471l.setAlpha(this.f145461b.getRootAlpha());
            this.f145471l.setColorFilter(colorFilter);
            return this.f145471l;
        }

        /* JADX INFO: renamed from: f */
        public boolean m165818f() {
            return this.f145461b.getRootAlpha() < 255;
        }

        /* JADX INFO: renamed from: g */
        public boolean m165819g() {
            return this.f145461b.m165811f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f145460a;
        }

        /* JADX INFO: renamed from: h */
        public boolean m165820h(int[] iArr) {
            boolean zM165812g = this.f145461b.m165812g(iArr);
            this.f145470k |= zM165812g;
            return zM165812g;
        }

        /* JADX INFO: renamed from: i */
        public void m165821i() {
            this.f145466g = this.f145462c;
            this.f145467h = this.f145463d;
            this.f145468i = this.f145461b.getRootAlpha();
            this.f145469j = this.f145464e;
            this.f145470k = false;
        }

        /* JADX INFO: renamed from: j */
        public void m165822j(int i, int i2) {
            this.f145465f.eraseColor(0);
            this.f145461b.m165807b(new Canvas(this.f145465f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new osk0(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new osk0(this);
        }

        public C19024h() {
            this.f145462c = null;
            this.f145463d = osk0.f145404k;
            this.f145461b = new C19023g();
        }
    }

    @Override // p149l.nsk0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    /* JADX INFO: renamed from: l.osk0$i */
    @RequiresApi(24)
    public static class C19025i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f145472a;

        public C19025i(Drawable.ConstantState constantState) {
            this.f145472a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f145472a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f145472a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            osk0 osk0Var = new osk0();
            osk0Var.f140279a = (VectorDrawable) this.f145472a.newDrawable();
            return osk0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            osk0 osk0Var = new osk0();
            osk0Var.f140279a = (VectorDrawable) this.f145472a.newDrawable(resources);
            return osk0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            osk0 osk0Var = new osk0();
            osk0Var.f140279a = (VectorDrawable) this.f145472a.newDrawable(resources, theme);
            return osk0Var;
        }
    }

    /* JADX INFO: renamed from: l.osk0$f */
    public static abstract class AbstractC19022f extends AbstractC19021e {

        /* JADX INFO: renamed from: a */
        public xa60.C21051b[] f145439a;

        /* JADX INFO: renamed from: b */
        public String f145440b;

        /* JADX INFO: renamed from: c */
        public int f145441c;

        /* JADX INFO: renamed from: d */
        public int f145442d;

        public AbstractC19022f(AbstractC19022f abstractC19022f) {
            super();
            this.f145439a = null;
            this.f145441c = 0;
            this.f145440b = abstractC19022f.f145440b;
            this.f145442d = abstractC19022f.f145442d;
            this.f145439a = xa60.m207534e(abstractC19022f.f145439a);
        }

        /* JADX INFO: renamed from: c */
        public boolean mo165794c() {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void m165805d(Path path) {
            path.reset();
            xa60.C21051b[] c21051bArr = this.f145439a;
            if (c21051bArr != null) {
                xa60.C21051b.m207547h(c21051bArr, path);
            }
        }

        public xa60.C21051b[] getPathData() {
            return this.f145439a;
        }

        public String getPathName() {
            return this.f145440b;
        }

        public void setPathData(xa60.C21051b[] c21051bArr) {
            if (xa60.m207531b(this.f145439a, c21051bArr)) {
                xa60.m207539j(this.f145439a, c21051bArr);
            } else {
                this.f145439a = xa60.m207534e(c21051bArr);
            }
        }

        public AbstractC19022f() {
            super();
            this.f145439a = null;
            this.f145441c = 0;
        }
    }

    public osk0() {
        this.f145409f = true;
        this.f145411h = new float[9];
        this.f145412i = new Matrix();
        this.f145413j = new Rect();
        this.f145405b = new C19024h();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f140279a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX INFO: renamed from: l.osk0$c */
    public static class C19019c extends AbstractC19022f {

        /* JADX INFO: renamed from: e */
        public int[] f145414e;

        /* JADX INFO: renamed from: f */
        public tn5 f145415f;

        /* JADX INFO: renamed from: g */
        public float f145416g;

        /* JADX INFO: renamed from: h */
        public tn5 f145417h;

        /* JADX INFO: renamed from: i */
        public float f145418i;

        /* JADX INFO: renamed from: j */
        public float f145419j;

        /* JADX INFO: renamed from: k */
        public float f145420k;

        /* JADX INFO: renamed from: l */
        public float f145421l;

        /* JADX INFO: renamed from: m */
        public float f145422m;

        /* JADX INFO: renamed from: n */
        public Paint.Cap f145423n;

        /* JADX INFO: renamed from: o */
        public Paint.Join f145424o;

        /* JADX INFO: renamed from: p */
        public float f145425p;

        public C19019c(C19019c c19019c) {
            super(c19019c);
            this.f145416g = 0.0f;
            this.f145418i = 1.0f;
            this.f145419j = 1.0f;
            this.f145420k = 0.0f;
            this.f145421l = 1.0f;
            this.f145422m = 0.0f;
            this.f145423n = Paint.Cap.BUTT;
            this.f145424o = Paint.Join.MITER;
            this.f145425p = 4.0f;
            this.f145414e = c19019c.f145414e;
            this.f145415f = c19019c.f145415f;
            this.f145416g = c19019c.f145416g;
            this.f145418i = c19019c.f145418i;
            this.f145417h = c19019c.f145417h;
            this.f145441c = c19019c.f145441c;
            this.f145419j = c19019c.f145419j;
            this.f145420k = c19019c.f145420k;
            this.f145421l = c19019c.f145421l;
            this.f145422m = c19019c.f145422m;
            this.f145423n = c19019c.f145423n;
            this.f145424o = c19019c.f145424o;
            this.f145425p = c19019c.f145425p;
        }

        @Override // p149l.osk0.AbstractC19021e
        /* JADX INFO: renamed from: a */
        public boolean mo165796a() {
            return this.f145417h.m189765i() || this.f145415f.m189765i();
        }

        @Override // p149l.osk0.AbstractC19021e
        /* JADX INFO: renamed from: b */
        public boolean mo165797b(int[] iArr) {
            return this.f145415f.m189766j(iArr) | this.f145417h.m189766j(iArr);
        }

        /* JADX INFO: renamed from: e */
        public final Paint.Cap m165798e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* JADX INFO: renamed from: f */
        public final Paint.Join m165799f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* JADX INFO: renamed from: g */
        public void m165800g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM218353k = zej0.m218353k(resources, theme, attributeSet, io0.f114078c);
            m165801h(typedArrayM218353k, xmlPullParser, theme);
            typedArrayM218353k.recycle();
        }

        public float getFillAlpha() {
            return this.f145419j;
        }

        @ColorInt
        public int getFillColor() {
            return this.f145417h.m189762e();
        }

        public float getStrokeAlpha() {
            return this.f145418i;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f145415f.m189762e();
        }

        public float getStrokeWidth() {
            return this.f145416g;
        }

        public float getTrimPathEnd() {
            return this.f145421l;
        }

        public float getTrimPathOffset() {
            return this.f145422m;
        }

        public float getTrimPathStart() {
            return this.f145420k;
        }

        /* JADX INFO: renamed from: h */
        public final void m165801h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f145414e = null;
            if (zej0.m218352j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f145440b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f145439a = xa60.m207533d(string2);
                }
                this.f145417h = zej0.m218347e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f145419j = zej0.m218348f(typedArray, xmlPullParser, "fillAlpha", 12, this.f145419j);
                this.f145423n = m165798e(zej0.m218349g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f145423n);
                this.f145424o = m165799f(zej0.m218349g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f145424o);
                this.f145425p = zej0.m218348f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f145425p);
                this.f145415f = zej0.m218347e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f145418i = zej0.m218348f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f145418i);
                this.f145416g = zej0.m218348f(typedArray, xmlPullParser, "strokeWidth", 4, this.f145416g);
                this.f145421l = zej0.m218348f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f145421l);
                this.f145422m = zej0.m218348f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f145422m);
                this.f145420k = zej0.m218348f(typedArray, xmlPullParser, "trimPathStart", 5, this.f145420k);
                this.f145441c = zej0.m218349g(typedArray, xmlPullParser, "fillType", 13, this.f145441c);
            }
        }

        public void setFillAlpha(float f) {
            this.f145419j = f;
        }

        public void setFillColor(int i) {
            this.f145417h.m189767k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f145418i = f;
        }

        public void setStrokeColor(int i) {
            this.f145415f.m189767k(i);
        }

        public void setStrokeWidth(float f) {
            this.f145416g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f145421l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f145422m = f;
        }

        public void setTrimPathStart(float f) {
            this.f145420k = f;
        }

        public C19019c() {
            this.f145416g = 0.0f;
            this.f145418i = 1.0f;
            this.f145419j = 1.0f;
            this.f145420k = 0.0f;
            this.f145421l = 1.0f;
            this.f145422m = 0.0f;
            this.f145423n = Paint.Cap.BUTT;
            this.f145424o = Paint.Join.MITER;
            this.f145425p = 4.0f;
        }
    }

    /* JADX INFO: renamed from: l.osk0$g */
    public static class C19023g {

        /* JADX INFO: renamed from: q */
        public static final Matrix f145443q = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Path f145444a;

        /* JADX INFO: renamed from: b */
        public final Path f145445b;

        /* JADX INFO: renamed from: c */
        public final Matrix f145446c;

        /* JADX INFO: renamed from: d */
        public Paint f145447d;

        /* JADX INFO: renamed from: e */
        public Paint f145448e;

        /* JADX INFO: renamed from: f */
        public PathMeasure f145449f;

        /* JADX INFO: renamed from: g */
        public int f145450g;

        /* JADX INFO: renamed from: h */
        public final C19020d f145451h;

        /* JADX INFO: renamed from: i */
        public float f145452i;

        /* JADX INFO: renamed from: j */
        public float f145453j;

        /* JADX INFO: renamed from: k */
        public float f145454k;

        /* JADX INFO: renamed from: l */
        public float f145455l;

        /* JADX INFO: renamed from: m */
        public int f145456m;

        /* JADX INFO: renamed from: n */
        public String f145457n;

        /* JADX INFO: renamed from: o */
        public Boolean f145458o;

        /* JADX INFO: renamed from: p */
        public final e01<String, Object> f145459p;

        public C19023g(C19023g c19023g) {
            this.f145446c = new Matrix();
            this.f145452i = 0.0f;
            this.f145453j = 0.0f;
            this.f145454k = 0.0f;
            this.f145455l = 0.0f;
            this.f145456m = 255;
            this.f145457n = null;
            this.f145458o = null;
            e01<String, Object> e01Var = new e01<>();
            this.f145459p = e01Var;
            this.f145451h = new C19020d(c19023g.f145451h, e01Var);
            this.f145444a = new Path(c19023g.f145444a);
            this.f145445b = new Path(c19023g.f145445b);
            this.f145452i = c19023g.f145452i;
            this.f145453j = c19023g.f145453j;
            this.f145454k = c19023g.f145454k;
            this.f145455l = c19023g.f145455l;
            this.f145450g = c19023g.f145450g;
            this.f145456m = c19023g.f145456m;
            this.f145457n = c19023g.f145457n;
            String str = c19023g.f145457n;
            if (str != null) {
                e01Var.put(str, this);
            }
            this.f145458o = c19023g.f145458o;
        }

        /* JADX INFO: renamed from: a */
        public static float m165806a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* JADX INFO: renamed from: b */
        public void m165807b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m165808c(this.f145451h, f145443q, canvas, i, i2, colorFilter);
        }

        /* JADX INFO: renamed from: c */
        public final void m165808c(C19020d c19020d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            C19020d c19020d2 = c19020d;
            c19020d2.f145426a.set(matrix);
            c19020d2.f145426a.preConcat(c19020d2.f145435j);
            canvas.save();
            int i3 = 0;
            while (i3 < c19020d2.f145427b.size()) {
                AbstractC19021e abstractC19021e = c19020d2.f145427b.get(i3);
                if (abstractC19021e instanceof C19020d) {
                    m165808c((C19020d) abstractC19021e, c19020d2.f145426a, canvas, i, i2, colorFilter);
                } else if (abstractC19021e instanceof AbstractC19022f) {
                    m165809d(c19020d2, (AbstractC19022f) abstractC19021e, canvas, i, i2, colorFilter);
                }
                i3++;
                c19020d2 = c19020d;
            }
            canvas.restore();
        }

        /* JADX INFO: renamed from: d */
        public final void m165809d(C19020d c19020d, AbstractC19022f abstractC19022f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f145454k;
            float f2 = i2 / this.f145455l;
            float fMin = Math.min(f, f2);
            Matrix matrix = c19020d.f145426a;
            this.f145446c.set(matrix);
            this.f145446c.postScale(f, f2);
            float fM165810e = m165810e(matrix);
            if (fM165810e == 0.0f) {
                return;
            }
            abstractC19022f.m165805d(this.f145444a);
            Path path = this.f145444a;
            this.f145445b.reset();
            if (abstractC19022f.mo165794c()) {
                this.f145445b.setFillType(abstractC19022f.f145441c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f145445b.addPath(path, this.f145446c);
                canvas.clipPath(this.f145445b);
                return;
            }
            C19019c c19019c = (C19019c) abstractC19022f;
            float f3 = c19019c.f145420k;
            if (f3 != 0.0f || c19019c.f145421l != 1.0f) {
                float f4 = c19019c.f145422m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c19019c.f145421l + f4) % 1.0f;
                if (this.f145449f == null) {
                    this.f145449f = new PathMeasure();
                }
                this.f145449f.setPath(this.f145444a, false);
                float length = this.f145449f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                PathMeasure pathMeasure = this.f145449f;
                if (f7 > f8) {
                    pathMeasure.getSegment(f7, length, path, true);
                    this.f145449f.getSegment(0.0f, f8, path, true);
                } else {
                    pathMeasure.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f145445b.addPath(path, this.f145446c);
            if (c19019c.f145417h.m189768l()) {
                tn5 tn5Var = c19019c.f145417h;
                if (this.f145448e == null) {
                    Paint paint = new Paint(1);
                    this.f145448e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f145448e;
                if (tn5Var.m189764h()) {
                    Shader shaderM189763f = tn5Var.m189763f();
                    shaderM189763f.setLocalMatrix(this.f145446c);
                    paint2.setShader(shaderM189763f);
                    paint2.setAlpha(Math.round(c19019c.f145419j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(osk0.m165786a(tn5Var.m189762e(), c19019c.f145419j));
                }
                paint2.setColorFilter(colorFilter);
                this.f145445b.setFillType(c19019c.f145441c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f145445b, paint2);
            }
            if (c19019c.f145415f.m189768l()) {
                tn5 tn5Var2 = c19019c.f145415f;
                if (this.f145447d == null) {
                    Paint paint3 = new Paint(1);
                    this.f145447d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f145447d;
                Paint.Join join = c19019c.f145424o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c19019c.f145423n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c19019c.f145425p);
                if (tn5Var2.m189764h()) {
                    Shader shaderM189763f2 = tn5Var2.m189763f();
                    shaderM189763f2.setLocalMatrix(this.f145446c);
                    paint4.setShader(shaderM189763f2);
                    paint4.setAlpha(Math.round(c19019c.f145418i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(osk0.m165786a(tn5Var2.m189762e(), c19019c.f145418i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c19019c.f145416g * fMin * fM165810e);
                canvas.drawPath(this.f145445b, paint4);
            }
        }

        /* JADX INFO: renamed from: e */
        public final float m165810e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM165806a = m165806a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM165806a) / fMax;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m165811f() {
            if (this.f145458o == null) {
                this.f145458o = Boolean.valueOf(this.f145451h.mo165796a());
            }
            return this.f145458o.booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public boolean m165812g(int[] iArr) {
            return this.f145451h.mo165797b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f145456m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f145456m = i;
        }

        public C19023g() {
            this.f145446c = new Matrix();
            this.f145452i = 0.0f;
            this.f145453j = 0.0f;
            this.f145454k = 0.0f;
            this.f145455l = 0.0f;
            this.f145456m = 255;
            this.f145457n = null;
            this.f145458o = null;
            this.f145459p = new e01<>();
            this.f145451h = new C19020d();
            this.f145444a = new Path();
            this.f145445b = new Path();
        }
    }

    /* JADX INFO: renamed from: l.osk0$d */
    public static class C19020d extends AbstractC19021e {

        /* JADX INFO: renamed from: a */
        public final Matrix f145426a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<AbstractC19021e> f145427b;

        /* JADX INFO: renamed from: c */
        public float f145428c;

        /* JADX INFO: renamed from: d */
        public float f145429d;

        /* JADX INFO: renamed from: e */
        public float f145430e;

        /* JADX INFO: renamed from: f */
        public float f145431f;

        /* JADX INFO: renamed from: g */
        public float f145432g;

        /* JADX INFO: renamed from: h */
        public float f145433h;

        /* JADX INFO: renamed from: i */
        public float f145434i;

        /* JADX INFO: renamed from: j */
        public final Matrix f145435j;

        /* JADX INFO: renamed from: k */
        public int f145436k;

        /* JADX INFO: renamed from: l */
        public int[] f145437l;

        /* JADX INFO: renamed from: m */
        public String f145438m;

        public C19020d(C19020d c19020d, e01<String, Object> e01Var) {
            AbstractC19022f c19018b;
            super();
            this.f145426a = new Matrix();
            this.f145427b = new ArrayList<>();
            this.f145428c = 0.0f;
            this.f145429d = 0.0f;
            this.f145430e = 0.0f;
            this.f145431f = 1.0f;
            this.f145432g = 1.0f;
            this.f145433h = 0.0f;
            this.f145434i = 0.0f;
            Matrix matrix = new Matrix();
            this.f145435j = matrix;
            this.f145438m = null;
            this.f145428c = c19020d.f145428c;
            this.f145429d = c19020d.f145429d;
            this.f145430e = c19020d.f145430e;
            this.f145431f = c19020d.f145431f;
            this.f145432g = c19020d.f145432g;
            this.f145433h = c19020d.f145433h;
            this.f145434i = c19020d.f145434i;
            this.f145437l = c19020d.f145437l;
            String str = c19020d.f145438m;
            this.f145438m = str;
            this.f145436k = c19020d.f145436k;
            if (str != null) {
                e01Var.put(str, this);
            }
            matrix.set(c19020d.f145435j);
            ArrayList<AbstractC19021e> arrayList = c19020d.f145427b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC19021e abstractC19021e = arrayList.get(i);
                if (abstractC19021e instanceof C19020d) {
                    this.f145427b.add(new C19020d((C19020d) abstractC19021e, e01Var));
                } else {
                    if (abstractC19021e instanceof C19019c) {
                        c19018b = new C19019c((C19019c) abstractC19021e);
                    } else {
                        if (!(abstractC19021e instanceof C19018b)) {
                            qkq0.m175383a("Unknown object in the tree!");
                            throw null;
                        }
                        c19018b = new C19018b((C19018b) abstractC19021e);
                    }
                    this.f145427b.add(c19018b);
                    String str2 = c19018b.f145440b;
                    if (str2 != null) {
                        e01Var.put(str2, c19018b);
                    }
                }
            }
        }

        @Override // p149l.osk0.AbstractC19021e
        /* JADX INFO: renamed from: a */
        public boolean mo165796a() {
            for (int i = 0; i < this.f145427b.size(); i++) {
                if (this.f145427b.get(i).mo165796a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p149l.osk0.AbstractC19021e
        /* JADX INFO: renamed from: b */
        public boolean mo165797b(int[] iArr) {
            boolean zMo165797b = false;
            for (int i = 0; i < this.f145427b.size(); i++) {
                zMo165797b |= this.f145427b.get(i).mo165797b(iArr);
            }
            return zMo165797b;
        }

        /* JADX INFO: renamed from: c */
        public void m165802c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM218353k = zej0.m218353k(resources, theme, attributeSet, io0.f114077b);
            m165804e(typedArrayM218353k, xmlPullParser);
            typedArrayM218353k.recycle();
        }

        /* JADX INFO: renamed from: d */
        public final void m165803d() {
            this.f145435j.reset();
            this.f145435j.postTranslate(-this.f145429d, -this.f145430e);
            this.f145435j.postScale(this.f145431f, this.f145432g);
            this.f145435j.postRotate(this.f145428c, 0.0f, 0.0f);
            this.f145435j.postTranslate(this.f145433h + this.f145429d, this.f145434i + this.f145430e);
        }

        /* JADX INFO: renamed from: e */
        public final void m165804e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f145437l = null;
            this.f145428c = zej0.m218348f(typedArray, xmlPullParser, BLiveGiftItem.TYPE_ROTATION, 5, this.f145428c);
            this.f145429d = typedArray.getFloat(1, this.f145429d);
            this.f145430e = typedArray.getFloat(2, this.f145430e);
            this.f145431f = zej0.m218348f(typedArray, xmlPullParser, "scaleX", 3, this.f145431f);
            this.f145432g = zej0.m218348f(typedArray, xmlPullParser, "scaleY", 4, this.f145432g);
            this.f145433h = zej0.m218348f(typedArray, xmlPullParser, "translateX", 6, this.f145433h);
            this.f145434i = zej0.m218348f(typedArray, xmlPullParser, "translateY", 7, this.f145434i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f145438m = string;
            }
            m165803d();
        }

        public String getGroupName() {
            return this.f145438m;
        }

        public Matrix getLocalMatrix() {
            return this.f145435j;
        }

        public float getPivotX() {
            return this.f145429d;
        }

        public float getPivotY() {
            return this.f145430e;
        }

        public float getRotation() {
            return this.f145428c;
        }

        public float getScaleX() {
            return this.f145431f;
        }

        public float getScaleY() {
            return this.f145432g;
        }

        public float getTranslateX() {
            return this.f145433h;
        }

        public float getTranslateY() {
            return this.f145434i;
        }

        public void setPivotX(float f) {
            if (f != this.f145429d) {
                this.f145429d = f;
                m165803d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f145430e) {
                this.f145430e = f;
                m165803d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f145428c) {
                this.f145428c = f;
                m165803d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f145431f) {
                this.f145431f = f;
                m165803d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f145432g) {
                this.f145432g = f;
                m165803d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f145433h) {
                this.f145433h = f;
                m165803d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f145434i) {
                this.f145434i = f;
                m165803d();
            }
        }

        public C19020d() {
            super();
            this.f145426a = new Matrix();
            this.f145427b = new ArrayList<>();
            this.f145428c = 0.0f;
            this.f145429d = 0.0f;
            this.f145430e = 0.0f;
            this.f145431f = 1.0f;
            this.f145432g = 1.0f;
            this.f145433h = 0.0f;
            this.f145434i = 0.0f;
            this.f145435j = new Matrix();
            this.f145438m = null;
        }
    }
}
