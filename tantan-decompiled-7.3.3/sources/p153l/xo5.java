package p153l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationLoadingType;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class xo5 {

    /* JADX INFO: renamed from: a */
    public final Shader f195556a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f195557b;

    /* JADX INFO: renamed from: c */
    public int f195558c;

    public xo5(Shader shader, ColorStateList colorStateList, @ColorInt int i) {
        this.f195556a = shader;
        this.f195557b = colorStateList;
        this.f195558c = i;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static xo5 m212449a(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals(BLiveOperationLoadingType.gradient)) {
            return m212452d(e9k.m119930b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m212451c(ff5.m125352b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: b */
    public static xo5 m212450b(@ColorInt int i) {
        return new xo5(null, null, i);
    }

    /* JADX INFO: renamed from: c */
    public static xo5 m212451c(@NonNull ColorStateList colorStateList) {
        return new xo5(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: d */
    public static xo5 m212452d(@NonNull Shader shader) {
        return new xo5(shader, null, 0);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static xo5 m212453g(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        try {
            return m212449a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    @ColorInt
    /* JADX INFO: renamed from: e */
    public int m212454e() {
        return this.f195558c;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Shader m212455f() {
        return this.f195556a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m212456h() {
        return this.f195556a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m212457i() {
        ColorStateList colorStateList;
        return this.f195556a == null && (colorStateList = this.f195557b) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public boolean m212458j(int[] iArr) {
        if (!m212457i()) {
            return false;
        }
        ColorStateList colorStateList = this.f195557b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f195558c) {
            return false;
        }
        this.f195558c = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m212459k(@ColorInt int i) {
        this.f195558c = i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m212460l() {
        return m212456h() || this.f195558c != 0;
    }
}
