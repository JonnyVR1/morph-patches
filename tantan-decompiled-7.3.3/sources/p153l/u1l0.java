package p153l;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class u1l0 extends t1l0 {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f177012k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public C20456h f177013b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f177014c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f177015d;

    /* JADX INFO: renamed from: e */
    public boolean f177016e;

    /* JADX INFO: renamed from: f */
    public boolean f177017f;

    /* JADX INFO: renamed from: g */
    public Drawable.ConstantState f177018g;

    /* JADX INFO: renamed from: h */
    public final float[] f177019h;

    /* JADX INFO: renamed from: i */
    public final Matrix f177020i;

    /* JADX INFO: renamed from: j */
    public final Rect f177021j;

    /* JADX INFO: renamed from: l.u1l0$e */
    public static abstract class AbstractC20453e {
        public AbstractC20453e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo193995a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo193996b(int[] iArr) {
            return false;
        }
    }

    public u1l0(@NonNull C20456h c20456h) {
        this.f177017f = true;
        this.f177019h = new float[9];
        this.f177020i = new Matrix();
        this.f177021j = new Rect();
        this.f177013b = c20456h;
        this.f177014c = m193991g(this.f177014c, c20456h.f177070c, c20456h.f177071d);
    }

    /* JADX INFO: renamed from: a */
    public static int m193985a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static u1l0 m193986b(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        u1l0 u1l0Var = new u1l0();
        u1l0Var.f171683a = c5d0.m108035e(resources, i, theme);
        u1l0Var.f177018g = new C20457i(u1l0Var.f171683a.getConstantState());
        return u1l0Var;
    }

    /* JADX INFO: renamed from: e */
    public static PorterDuff.Mode m193987e(int i, PorterDuff.Mode mode) {
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

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* JADX INFO: renamed from: c */
    public final void m193988c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C20456h c20456h = this.f177013b;
        C20455g c20455g = c20456h.f177069b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c20455g.f177059h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C20452d c20452d = (C20452d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C20451c c20451c = new C20451c();
                    c20451c.m193999g(resources, attributeSet, theme, xmlPullParser);
                    c20452d.f177035b.add(c20451c);
                    if (c20451c.getPathName() != null) {
                        c20455g.f177067p.put(c20451c.getPathName(), c20451c);
                    }
                    c20456h.f177068a = c20451c.f177050d | c20456h.f177068a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C20450b c20450b = new C20450b();
                    c20450b.m193994e(resources, attributeSet, theme, xmlPullParser);
                    c20452d.f177035b.add(c20450b);
                    if (c20450b.getPathName() != null) {
                        c20455g.f177067p.put(c20450b.getPathName(), c20450b);
                    }
                    c20456h.f177068a = c20450b.f177050d | c20456h.f177068a;
                } else if ("group".equals(name)) {
                    C20452d c20452d2 = new C20452d();
                    c20452d2.m194001c(resources, attributeSet, theme, xmlPullParser);
                    c20452d.f177035b.add(c20452d2);
                    arrayDeque.push(c20452d2);
                    if (c20452d2.getGroupName() != null) {
                        c20455g.f177067p.put(c20452d2.getGroupName(), c20452d2);
                    }
                    c20456h.f177068a = c20452d2.f177044k | c20456h.f177068a;
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
        Drawable drawable = this.f171683a;
        if (drawable == null) {
            return false;
        }
        oce.m167162b(drawable);
        return false;
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m193989d() {
        return isAutoMirrored() && oce.m167166f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f177021j);
        if (this.f177021j.width() <= 0 || this.f177021j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f177015d;
        if (colorFilter == null) {
            colorFilter = this.f177014c;
        }
        canvas.getMatrix(this.f177020i);
        this.f177020i.getValues(this.f177019h);
        float fAbs = Math.abs(this.f177019h[0]);
        float fAbs2 = Math.abs(this.f177019h[4]);
        float fAbs3 = Math.abs(this.f177019h[1]);
        float fAbs4 = Math.abs(this.f177019h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f177021j.width() * fAbs);
        int iHeight = (int) (this.f177021j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f177021j;
        canvas.translate(rect.left, rect.top);
        if (m193989d()) {
            canvas.translate(this.f177021j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f177021j.offsetTo(0, 0);
        this.f177013b.m194014c(iMin, iMin2);
        boolean z = this.f177017f;
        C20456h c20456h = this.f177013b;
        if (!z) {
            c20456h.m194021j(iMin, iMin2);
        } else if (!c20456h.m194013b()) {
            this.f177013b.m194021j(iMin, iMin2);
            this.f177013b.m194020i();
        }
        this.f177013b.m194015d(canvas, colorFilter, this.f177021j);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: f */
    public final void m193990f(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C20456h c20456h = this.f177013b;
        C20455g c20455g = c20456h.f177069b;
        c20456h.f177071d = m193987e(doj0.m117300g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM117296c = doj0.m117296c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM117296c != null) {
            c20456h.f177070c = colorStateListM117296c;
        }
        c20456h.f177072e = doj0.m117294a(typedArray, xmlPullParser, "autoMirrored", 5, c20456h.f177072e);
        c20455g.f177062k = doj0.m117299f(typedArray, xmlPullParser, "viewportWidth", 7, c20455g.f177062k);
        float fM117299f = doj0.m117299f(typedArray, xmlPullParser, "viewportHeight", 8, c20455g.f177063l);
        c20455g.f177063l = fM117299f;
        if (c20455g.f177062k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM117299f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c20455g.f177060i = typedArray.getDimension(3, c20455g.f177060i);
        float dimension = typedArray.getDimension(2, c20455g.f177061j);
        c20455g.f177061j = dimension;
        if (c20455g.f177060i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c20455g.setAlpha(doj0.m117299f(typedArray, xmlPullParser, "alpha", 4, c20455g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c20455g.f177065n = string;
            c20455g.f177067p.put(string, c20455g);
        }
    }

    /* JADX INFO: renamed from: g */
    public PorterDuffColorFilter m193991g(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f171683a;
        return drawable != null ? oce.m167164d(drawable) : this.f177013b.f177069b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f177013b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f171683a;
        return drawable != null ? oce.m167165e(drawable) : this.f177015d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f171683a != null) {
            return new C20457i(this.f171683a.getConstantState());
        }
        this.f177013b.f177068a = getChangingConfigurations();
        return this.f177013b;
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f171683a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f177013b.f177069b.f177061j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f171683a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f177013b.f177069b.f177060i;
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            oce.m167167g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C20456h c20456h = this.f177013b;
        c20456h.f177069b = new C20455g();
        TypedArray typedArrayM117304k = doj0.m117304k(resources, theme, attributeSet, eo0.f94849a);
        m193990f(typedArrayM117304k, xmlPullParser, theme);
        typedArrayM117304k.recycle();
        c20456h.f177068a = getChangingConfigurations();
        c20456h.f177078k = true;
        m193988c(resources, xmlPullParser, attributeSet, theme);
        this.f177014c = m193991g(this.f177014c, c20456h.f177070c, c20456h.f177071d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f171683a;
        return drawable != null ? oce.m167168h(drawable) : this.f177013b.f177072e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C20456h c20456h = this.f177013b;
        if (c20456h == null) {
            return false;
        }
        if (c20456h.m194018g()) {
            return true;
        }
        ColorStateList colorStateList = this.f177013b.f177070c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f177016e && super.mutate() == this) {
            this.f177013b = new C20456h(this.f177013b);
            this.f177016e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C20456h c20456h = this.f177013b;
        ColorStateList colorStateList = c20456h.f177070c;
        if (colorStateList == null || (mode = c20456h.f177071d) == null) {
            z = false;
        } else {
            this.f177014c = m193991g(this.f177014c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c20456h.m194018g() || !c20456h.m194019h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f177013b.f177069b.getRootAlpha() != i) {
            this.f177013b.f177069b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            oce.m167170j(drawable, z);
        } else {
            this.f177013b.f177072e = z;
        }
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f177015d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            oce.m167174n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            oce.m167175o(drawable, colorStateList);
            return;
        }
        C20456h c20456h = this.f177013b;
        if (c20456h.f177070c != colorStateList) {
            c20456h.f177070c = colorStateList;
            this.f177014c = m193991g(this.f177014c, colorStateList, c20456h.f177071d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            oce.m167176p(drawable, mode);
            return;
        }
        C20456h c20456h = this.f177013b;
        if (c20456h.f177071d != mode) {
            c20456h.f177071d = mode;
            this.f177014c = m193991g(this.f177014c, c20456h.f177070c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f171683a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: l.u1l0$b */
    public static class C20450b extends AbstractC20454f {
        public C20450b() {
        }

        /* JADX INFO: renamed from: f */
        private void m193992f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f177048b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f177047a = cj60.m110065d(string2);
            }
            this.f177049c = doj0.m117300g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p153l.u1l0.AbstractC20454f
        /* JADX INFO: renamed from: c */
        public boolean mo193993c() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public void m193994e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (doj0.m117303j(xmlPullParser, "pathData")) {
                TypedArray typedArrayM117304k = doj0.m117304k(resources, theme, attributeSet, eo0.f94852d);
                m193992f(typedArrayM117304k, xmlPullParser);
                typedArrayM117304k.recycle();
            }
        }

        public C20450b(C20450b c20450b) {
            super(c20450b);
        }
    }

    /* JADX INFO: renamed from: l.u1l0$h */
    public static class C20456h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f177068a;

        /* JADX INFO: renamed from: b */
        public C20455g f177069b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f177070c;

        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode f177071d;

        /* JADX INFO: renamed from: e */
        public boolean f177072e;

        /* JADX INFO: renamed from: f */
        public Bitmap f177073f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f177074g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f177075h;

        /* JADX INFO: renamed from: i */
        public int f177076i;

        /* JADX INFO: renamed from: j */
        public boolean f177077j;

        /* JADX INFO: renamed from: k */
        public boolean f177078k;

        /* JADX INFO: renamed from: l */
        public Paint f177079l;

        public C20456h(C20456h c20456h) {
            this.f177070c = null;
            this.f177071d = u1l0.f177012k;
            if (c20456h != null) {
                this.f177068a = c20456h.f177068a;
                C20455g c20455g = new C20455g(c20456h.f177069b);
                this.f177069b = c20455g;
                if (c20456h.f177069b.f177056e != null) {
                    c20455g.f177056e = new Paint(c20456h.f177069b.f177056e);
                }
                if (c20456h.f177069b.f177055d != null) {
                    this.f177069b.f177055d = new Paint(c20456h.f177069b.f177055d);
                }
                this.f177070c = c20456h.f177070c;
                this.f177071d = c20456h.f177071d;
                this.f177072e = c20456h.f177072e;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m194012a(int i, int i2) {
            return i == this.f177073f.getWidth() && i2 == this.f177073f.getHeight();
        }

        /* JADX INFO: renamed from: b */
        public boolean m194013b() {
            return !this.f177078k && this.f177074g == this.f177070c && this.f177075h == this.f177071d && this.f177077j == this.f177072e && this.f177076i == this.f177069b.getRootAlpha();
        }

        /* JADX INFO: renamed from: c */
        public void m194014c(int i, int i2) {
            if (this.f177073f == null || !m194012a(i, i2)) {
                this.f177073f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f177078k = true;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m194015d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f177073f, (Rect) null, rect, m194016e(colorFilter));
        }

        /* JADX INFO: renamed from: e */
        public Paint m194016e(ColorFilter colorFilter) {
            if (!m194017f() && colorFilter == null) {
                return null;
            }
            if (this.f177079l == null) {
                Paint paint = new Paint();
                this.f177079l = paint;
                paint.setFilterBitmap(true);
            }
            this.f177079l.setAlpha(this.f177069b.getRootAlpha());
            this.f177079l.setColorFilter(colorFilter);
            return this.f177079l;
        }

        /* JADX INFO: renamed from: f */
        public boolean m194017f() {
            return this.f177069b.getRootAlpha() < 255;
        }

        /* JADX INFO: renamed from: g */
        public boolean m194018g() {
            return this.f177069b.m194010f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f177068a;
        }

        /* JADX INFO: renamed from: h */
        public boolean m194019h(int[] iArr) {
            boolean zM194011g = this.f177069b.m194011g(iArr);
            this.f177078k |= zM194011g;
            return zM194011g;
        }

        /* JADX INFO: renamed from: i */
        public void m194020i() {
            this.f177074g = this.f177070c;
            this.f177075h = this.f177071d;
            this.f177076i = this.f177069b.getRootAlpha();
            this.f177077j = this.f177072e;
            this.f177078k = false;
        }

        /* JADX INFO: renamed from: j */
        public void m194021j(int i, int i2) {
            this.f177073f.eraseColor(0);
            this.f177069b.m194006b(new Canvas(this.f177073f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new u1l0(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new u1l0(this);
        }

        public C20456h() {
            this.f177070c = null;
            this.f177071d = u1l0.f177012k;
            this.f177069b = new C20455g();
        }
    }

    @Override // p153l.t1l0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    /* JADX INFO: renamed from: l.u1l0$i */
    @RequiresApi(24)
    public static class C20457i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f177080a;

        public C20457i(Drawable.ConstantState constantState) {
            this.f177080a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f177080a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f177080a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            u1l0 u1l0Var = new u1l0();
            u1l0Var.f171683a = (VectorDrawable) this.f177080a.newDrawable();
            return u1l0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            u1l0 u1l0Var = new u1l0();
            u1l0Var.f171683a = (VectorDrawable) this.f177080a.newDrawable(resources);
            return u1l0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            u1l0 u1l0Var = new u1l0();
            u1l0Var.f171683a = (VectorDrawable) this.f177080a.newDrawable(resources, theme);
            return u1l0Var;
        }
    }

    /* JADX INFO: renamed from: l.u1l0$f */
    public static abstract class AbstractC20454f extends AbstractC20453e {

        /* JADX INFO: renamed from: a */
        public cj60.C16274b[] f177047a;

        /* JADX INFO: renamed from: b */
        public String f177048b;

        /* JADX INFO: renamed from: c */
        public int f177049c;

        /* JADX INFO: renamed from: d */
        public int f177050d;

        public AbstractC20454f(AbstractC20454f abstractC20454f) {
            super();
            this.f177047a = null;
            this.f177049c = 0;
            this.f177048b = abstractC20454f.f177048b;
            this.f177050d = abstractC20454f.f177050d;
            this.f177047a = cj60.m110066e(abstractC20454f.f177047a);
        }

        /* JADX INFO: renamed from: c */
        public boolean mo193993c() {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void m194004d(Path path) {
            path.reset();
            cj60.C16274b[] c16274bArr = this.f177047a;
            if (c16274bArr != null) {
                cj60.C16274b.m110079h(c16274bArr, path);
            }
        }

        public cj60.C16274b[] getPathData() {
            return this.f177047a;
        }

        public String getPathName() {
            return this.f177048b;
        }

        public void setPathData(cj60.C16274b[] c16274bArr) {
            if (cj60.m110063b(this.f177047a, c16274bArr)) {
                cj60.m110071j(this.f177047a, c16274bArr);
            } else {
                this.f177047a = cj60.m110066e(c16274bArr);
            }
        }

        public AbstractC20454f() {
            super();
            this.f177047a = null;
            this.f177049c = 0;
        }
    }

    public u1l0() {
        this.f177017f = true;
        this.f177019h = new float[9];
        this.f177020i = new Matrix();
        this.f177021j = new Rect();
        this.f177013b = new C20456h();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f171683a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX INFO: renamed from: l.u1l0$c */
    public static class C20451c extends AbstractC20454f {

        /* JADX INFO: renamed from: e */
        public int[] f177022e;

        /* JADX INFO: renamed from: f */
        public xo5 f177023f;

        /* JADX INFO: renamed from: g */
        public float f177024g;

        /* JADX INFO: renamed from: h */
        public xo5 f177025h;

        /* JADX INFO: renamed from: i */
        public float f177026i;

        /* JADX INFO: renamed from: j */
        public float f177027j;

        /* JADX INFO: renamed from: k */
        public float f177028k;

        /* JADX INFO: renamed from: l */
        public float f177029l;

        /* JADX INFO: renamed from: m */
        public float f177030m;

        /* JADX INFO: renamed from: n */
        public Paint.Cap f177031n;

        /* JADX INFO: renamed from: o */
        public Paint.Join f177032o;

        /* JADX INFO: renamed from: p */
        public float f177033p;

        public C20451c(C20451c c20451c) {
            super(c20451c);
            this.f177024g = 0.0f;
            this.f177026i = 1.0f;
            this.f177027j = 1.0f;
            this.f177028k = 0.0f;
            this.f177029l = 1.0f;
            this.f177030m = 0.0f;
            this.f177031n = Paint.Cap.BUTT;
            this.f177032o = Paint.Join.MITER;
            this.f177033p = 4.0f;
            this.f177022e = c20451c.f177022e;
            this.f177023f = c20451c.f177023f;
            this.f177024g = c20451c.f177024g;
            this.f177026i = c20451c.f177026i;
            this.f177025h = c20451c.f177025h;
            this.f177049c = c20451c.f177049c;
            this.f177027j = c20451c.f177027j;
            this.f177028k = c20451c.f177028k;
            this.f177029l = c20451c.f177029l;
            this.f177030m = c20451c.f177030m;
            this.f177031n = c20451c.f177031n;
            this.f177032o = c20451c.f177032o;
            this.f177033p = c20451c.f177033p;
        }

        @Override // p153l.u1l0.AbstractC20453e
        /* JADX INFO: renamed from: a */
        public boolean mo193995a() {
            return this.f177025h.m212457i() || this.f177023f.m212457i();
        }

        @Override // p153l.u1l0.AbstractC20453e
        /* JADX INFO: renamed from: b */
        public boolean mo193996b(int[] iArr) {
            return this.f177023f.m212458j(iArr) | this.f177025h.m212458j(iArr);
        }

        /* JADX INFO: renamed from: e */
        public final Paint.Cap m193997e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* JADX INFO: renamed from: f */
        public final Paint.Join m193998f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* JADX INFO: renamed from: g */
        public void m193999g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM117304k = doj0.m117304k(resources, theme, attributeSet, eo0.f94851c);
            m194000h(typedArrayM117304k, xmlPullParser, theme);
            typedArrayM117304k.recycle();
        }

        public float getFillAlpha() {
            return this.f177027j;
        }

        @ColorInt
        public int getFillColor() {
            return this.f177025h.m212454e();
        }

        public float getStrokeAlpha() {
            return this.f177026i;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f177023f.m212454e();
        }

        public float getStrokeWidth() {
            return this.f177024g;
        }

        public float getTrimPathEnd() {
            return this.f177029l;
        }

        public float getTrimPathOffset() {
            return this.f177030m;
        }

        public float getTrimPathStart() {
            return this.f177028k;
        }

        /* JADX INFO: renamed from: h */
        public final void m194000h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f177022e = null;
            if (doj0.m117303j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f177048b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f177047a = cj60.m110065d(string2);
                }
                this.f177025h = doj0.m117298e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f177027j = doj0.m117299f(typedArray, xmlPullParser, "fillAlpha", 12, this.f177027j);
                this.f177031n = m193997e(doj0.m117300g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f177031n);
                this.f177032o = m193998f(doj0.m117300g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f177032o);
                this.f177033p = doj0.m117299f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f177033p);
                this.f177023f = doj0.m117298e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f177026i = doj0.m117299f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f177026i);
                this.f177024g = doj0.m117299f(typedArray, xmlPullParser, "strokeWidth", 4, this.f177024g);
                this.f177029l = doj0.m117299f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f177029l);
                this.f177030m = doj0.m117299f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f177030m);
                this.f177028k = doj0.m117299f(typedArray, xmlPullParser, "trimPathStart", 5, this.f177028k);
                this.f177049c = doj0.m117300g(typedArray, xmlPullParser, "fillType", 13, this.f177049c);
            }
        }

        public void setFillAlpha(float f) {
            this.f177027j = f;
        }

        public void setFillColor(int i) {
            this.f177025h.m212459k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f177026i = f;
        }

        public void setStrokeColor(int i) {
            this.f177023f.m212459k(i);
        }

        public void setStrokeWidth(float f) {
            this.f177024g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f177029l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f177030m = f;
        }

        public void setTrimPathStart(float f) {
            this.f177028k = f;
        }

        public C20451c() {
            this.f177024g = 0.0f;
            this.f177026i = 1.0f;
            this.f177027j = 1.0f;
            this.f177028k = 0.0f;
            this.f177029l = 1.0f;
            this.f177030m = 0.0f;
            this.f177031n = Paint.Cap.BUTT;
            this.f177032o = Paint.Join.MITER;
            this.f177033p = 4.0f;
        }
    }

    /* JADX INFO: renamed from: l.u1l0$g */
    public static class C20455g {

        /* JADX INFO: renamed from: q */
        public static final Matrix f177051q = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Path f177052a;

        /* JADX INFO: renamed from: b */
        public final Path f177053b;

        /* JADX INFO: renamed from: c */
        public final Matrix f177054c;

        /* JADX INFO: renamed from: d */
        public Paint f177055d;

        /* JADX INFO: renamed from: e */
        public Paint f177056e;

        /* JADX INFO: renamed from: f */
        public PathMeasure f177057f;

        /* JADX INFO: renamed from: g */
        public int f177058g;

        /* JADX INFO: renamed from: h */
        public final C20452d f177059h;

        /* JADX INFO: renamed from: i */
        public float f177060i;

        /* JADX INFO: renamed from: j */
        public float f177061j;

        /* JADX INFO: renamed from: k */
        public float f177062k;

        /* JADX INFO: renamed from: l */
        public float f177063l;

        /* JADX INFO: renamed from: m */
        public int f177064m;

        /* JADX INFO: renamed from: n */
        public String f177065n;

        /* JADX INFO: renamed from: o */
        public Boolean f177066o;

        /* JADX INFO: renamed from: p */
        public final l01<String, Object> f177067p;

        public C20455g(C20455g c20455g) {
            this.f177054c = new Matrix();
            this.f177060i = 0.0f;
            this.f177061j = 0.0f;
            this.f177062k = 0.0f;
            this.f177063l = 0.0f;
            this.f177064m = 255;
            this.f177065n = null;
            this.f177066o = null;
            l01<String, Object> l01Var = new l01<>();
            this.f177067p = l01Var;
            this.f177059h = new C20452d(c20455g.f177059h, l01Var);
            this.f177052a = new Path(c20455g.f177052a);
            this.f177053b = new Path(c20455g.f177053b);
            this.f177060i = c20455g.f177060i;
            this.f177061j = c20455g.f177061j;
            this.f177062k = c20455g.f177062k;
            this.f177063l = c20455g.f177063l;
            this.f177058g = c20455g.f177058g;
            this.f177064m = c20455g.f177064m;
            this.f177065n = c20455g.f177065n;
            String str = c20455g.f177065n;
            if (str != null) {
                l01Var.put(str, this);
            }
            this.f177066o = c20455g.f177066o;
        }

        /* JADX INFO: renamed from: a */
        public static float m194005a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* JADX INFO: renamed from: b */
        public void m194006b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m194007c(this.f177059h, f177051q, canvas, i, i2, colorFilter);
        }

        /* JADX INFO: renamed from: c */
        public final void m194007c(C20452d c20452d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            C20452d c20452d2 = c20452d;
            c20452d2.f177034a.set(matrix);
            c20452d2.f177034a.preConcat(c20452d2.f177043j);
            canvas.save();
            int i3 = 0;
            while (i3 < c20452d2.f177035b.size()) {
                AbstractC20453e abstractC20453e = c20452d2.f177035b.get(i3);
                if (abstractC20453e instanceof C20452d) {
                    m194007c((C20452d) abstractC20453e, c20452d2.f177034a, canvas, i, i2, colorFilter);
                } else if (abstractC20453e instanceof AbstractC20454f) {
                    m194008d(c20452d2, (AbstractC20454f) abstractC20453e, canvas, i, i2, colorFilter);
                }
                i3++;
                c20452d2 = c20452d;
            }
            canvas.restore();
        }

        /* JADX INFO: renamed from: d */
        public final void m194008d(C20452d c20452d, AbstractC20454f abstractC20454f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f177062k;
            float f2 = i2 / this.f177063l;
            float fMin = Math.min(f, f2);
            Matrix matrix = c20452d.f177034a;
            this.f177054c.set(matrix);
            this.f177054c.postScale(f, f2);
            float fM194009e = m194009e(matrix);
            if (fM194009e == 0.0f) {
                return;
            }
            abstractC20454f.m194004d(this.f177052a);
            Path path = this.f177052a;
            this.f177053b.reset();
            if (abstractC20454f.mo193993c()) {
                this.f177053b.setFillType(abstractC20454f.f177049c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f177053b.addPath(path, this.f177054c);
                canvas.clipPath(this.f177053b);
                return;
            }
            C20451c c20451c = (C20451c) abstractC20454f;
            float f3 = c20451c.f177028k;
            if (f3 != 0.0f || c20451c.f177029l != 1.0f) {
                float f4 = c20451c.f177030m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c20451c.f177029l + f4) % 1.0f;
                if (this.f177057f == null) {
                    this.f177057f = new PathMeasure();
                }
                this.f177057f.setPath(this.f177052a, false);
                float length = this.f177057f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                PathMeasure pathMeasure = this.f177057f;
                if (f7 > f8) {
                    pathMeasure.getSegment(f7, length, path, true);
                    this.f177057f.getSegment(0.0f, f8, path, true);
                } else {
                    pathMeasure.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f177053b.addPath(path, this.f177054c);
            if (c20451c.f177025h.m212460l()) {
                xo5 xo5Var = c20451c.f177025h;
                if (this.f177056e == null) {
                    Paint paint = new Paint(1);
                    this.f177056e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f177056e;
                if (xo5Var.m212456h()) {
                    Shader shaderM212455f = xo5Var.m212455f();
                    shaderM212455f.setLocalMatrix(this.f177054c);
                    paint2.setShader(shaderM212455f);
                    paint2.setAlpha(Math.round(c20451c.f177027j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(u1l0.m193985a(xo5Var.m212454e(), c20451c.f177027j));
                }
                paint2.setColorFilter(colorFilter);
                this.f177053b.setFillType(c20451c.f177049c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f177053b, paint2);
            }
            if (c20451c.f177023f.m212460l()) {
                xo5 xo5Var2 = c20451c.f177023f;
                if (this.f177055d == null) {
                    Paint paint3 = new Paint(1);
                    this.f177055d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f177055d;
                Paint.Join join = c20451c.f177032o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c20451c.f177031n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c20451c.f177033p);
                if (xo5Var2.m212456h()) {
                    Shader shaderM212455f2 = xo5Var2.m212455f();
                    shaderM212455f2.setLocalMatrix(this.f177054c);
                    paint4.setShader(shaderM212455f2);
                    paint4.setAlpha(Math.round(c20451c.f177026i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(u1l0.m193985a(xo5Var2.m212454e(), c20451c.f177026i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c20451c.f177024g * fMin * fM194009e);
                canvas.drawPath(this.f177053b, paint4);
            }
        }

        /* JADX INFO: renamed from: e */
        public final float m194009e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM194005a = m194005a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM194005a) / fMax;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m194010f() {
            if (this.f177066o == null) {
                this.f177066o = Boolean.valueOf(this.f177059h.mo193995a());
            }
            return this.f177066o.booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public boolean m194011g(int[] iArr) {
            return this.f177059h.mo193996b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f177064m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f177064m = i;
        }

        public C20455g() {
            this.f177054c = new Matrix();
            this.f177060i = 0.0f;
            this.f177061j = 0.0f;
            this.f177062k = 0.0f;
            this.f177063l = 0.0f;
            this.f177064m = 255;
            this.f177065n = null;
            this.f177066o = null;
            this.f177067p = new l01<>();
            this.f177059h = new C20452d();
            this.f177052a = new Path();
            this.f177053b = new Path();
        }
    }

    /* JADX INFO: renamed from: l.u1l0$d */
    public static class C20452d extends AbstractC20453e {

        /* JADX INFO: renamed from: a */
        public final Matrix f177034a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<AbstractC20453e> f177035b;

        /* JADX INFO: renamed from: c */
        public float f177036c;

        /* JADX INFO: renamed from: d */
        public float f177037d;

        /* JADX INFO: renamed from: e */
        public float f177038e;

        /* JADX INFO: renamed from: f */
        public float f177039f;

        /* JADX INFO: renamed from: g */
        public float f177040g;

        /* JADX INFO: renamed from: h */
        public float f177041h;

        /* JADX INFO: renamed from: i */
        public float f177042i;

        /* JADX INFO: renamed from: j */
        public final Matrix f177043j;

        /* JADX INFO: renamed from: k */
        public int f177044k;

        /* JADX INFO: renamed from: l */
        public int[] f177045l;

        /* JADX INFO: renamed from: m */
        public String f177046m;

        public C20452d(C20452d c20452d, l01<String, Object> l01Var) {
            AbstractC20454f c20450b;
            super();
            this.f177034a = new Matrix();
            this.f177035b = new ArrayList<>();
            this.f177036c = 0.0f;
            this.f177037d = 0.0f;
            this.f177038e = 0.0f;
            this.f177039f = 1.0f;
            this.f177040g = 1.0f;
            this.f177041h = 0.0f;
            this.f177042i = 0.0f;
            Matrix matrix = new Matrix();
            this.f177043j = matrix;
            this.f177046m = null;
            this.f177036c = c20452d.f177036c;
            this.f177037d = c20452d.f177037d;
            this.f177038e = c20452d.f177038e;
            this.f177039f = c20452d.f177039f;
            this.f177040g = c20452d.f177040g;
            this.f177041h = c20452d.f177041h;
            this.f177042i = c20452d.f177042i;
            this.f177045l = c20452d.f177045l;
            String str = c20452d.f177046m;
            this.f177046m = str;
            this.f177044k = c20452d.f177044k;
            if (str != null) {
                l01Var.put(str, this);
            }
            matrix.set(c20452d.f177043j);
            ArrayList<AbstractC20453e> arrayList = c20452d.f177035b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC20453e abstractC20453e = arrayList.get(i);
                if (abstractC20453e instanceof C20452d) {
                    this.f177035b.add(new C20452d((C20452d) abstractC20453e, l01Var));
                } else {
                    if (abstractC20453e instanceof C20451c) {
                        c20450b = new C20451c((C20451c) abstractC20453e);
                    } else {
                        if (!(abstractC20453e instanceof C20450b)) {
                            wtq0.m207906a("Unknown object in the tree!");
                            throw null;
                        }
                        c20450b = new C20450b((C20450b) abstractC20453e);
                    }
                    this.f177035b.add(c20450b);
                    String str2 = c20450b.f177048b;
                    if (str2 != null) {
                        l01Var.put(str2, c20450b);
                    }
                }
            }
        }

        @Override // p153l.u1l0.AbstractC20453e
        /* JADX INFO: renamed from: a */
        public boolean mo193995a() {
            for (int i = 0; i < this.f177035b.size(); i++) {
                if (this.f177035b.get(i).mo193995a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p153l.u1l0.AbstractC20453e
        /* JADX INFO: renamed from: b */
        public boolean mo193996b(int[] iArr) {
            boolean zMo193996b = false;
            for (int i = 0; i < this.f177035b.size(); i++) {
                zMo193996b |= this.f177035b.get(i).mo193996b(iArr);
            }
            return zMo193996b;
        }

        /* JADX INFO: renamed from: c */
        public void m194001c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM117304k = doj0.m117304k(resources, theme, attributeSet, eo0.f94850b);
            m194003e(typedArrayM117304k, xmlPullParser);
            typedArrayM117304k.recycle();
        }

        /* JADX INFO: renamed from: d */
        public final void m194002d() {
            this.f177043j.reset();
            this.f177043j.postTranslate(-this.f177037d, -this.f177038e);
            this.f177043j.postScale(this.f177039f, this.f177040g);
            this.f177043j.postRotate(this.f177036c, 0.0f, 0.0f);
            this.f177043j.postTranslate(this.f177041h + this.f177037d, this.f177042i + this.f177038e);
        }

        /* JADX INFO: renamed from: e */
        public final void m194003e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f177045l = null;
            this.f177036c = doj0.m117299f(typedArray, xmlPullParser, BLiveGiftItem.TYPE_ROTATION, 5, this.f177036c);
            this.f177037d = typedArray.getFloat(1, this.f177037d);
            this.f177038e = typedArray.getFloat(2, this.f177038e);
            this.f177039f = doj0.m117299f(typedArray, xmlPullParser, "scaleX", 3, this.f177039f);
            this.f177040g = doj0.m117299f(typedArray, xmlPullParser, "scaleY", 4, this.f177040g);
            this.f177041h = doj0.m117299f(typedArray, xmlPullParser, "translateX", 6, this.f177041h);
            this.f177042i = doj0.m117299f(typedArray, xmlPullParser, "translateY", 7, this.f177042i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f177046m = string;
            }
            m194002d();
        }

        public String getGroupName() {
            return this.f177046m;
        }

        public Matrix getLocalMatrix() {
            return this.f177043j;
        }

        public float getPivotX() {
            return this.f177037d;
        }

        public float getPivotY() {
            return this.f177038e;
        }

        public float getRotation() {
            return this.f177036c;
        }

        public float getScaleX() {
            return this.f177039f;
        }

        public float getScaleY() {
            return this.f177040g;
        }

        public float getTranslateX() {
            return this.f177041h;
        }

        public float getTranslateY() {
            return this.f177042i;
        }

        public void setPivotX(float f) {
            if (f != this.f177037d) {
                this.f177037d = f;
                m194002d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f177038e) {
                this.f177038e = f;
                m194002d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f177036c) {
                this.f177036c = f;
                m194002d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f177039f) {
                this.f177039f = f;
                m194002d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f177040g) {
                this.f177040g = f;
                m194002d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f177041h) {
                this.f177041h = f;
                m194002d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f177042i) {
                this.f177042i = f;
                m194002d();
            }
        }

        public C20452d() {
            super();
            this.f177034a = new Matrix();
            this.f177035b = new ArrayList<>();
            this.f177036c = 0.0f;
            this.f177037d = 0.0f;
            this.f177038e = 0.0f;
            this.f177039f = 1.0f;
            this.f177040g = 1.0f;
            this.f177041h = 0.0f;
            this.f177042i = 0.0f;
            this.f177043j = new Matrix();
            this.f177046m = null;
        }
    }
}
