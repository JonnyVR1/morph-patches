package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveOperationLoadingType;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class tn5 {

    /* JADX INFO: renamed from: a */
    public final Shader f171208a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f171209b;

    /* JADX INFO: renamed from: c */
    public int f171210c;

    public tn5(Shader shader, ColorStateList colorStateList, @ColorInt int i) {
        this.f171208a = shader;
        this.f171209b = colorStateList;
        this.f171210c = i;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static tn5 m189757a(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
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
            return m189760d(m6k.m153241b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m189759c(fe5.m121019b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: b */
    public static tn5 m189758b(@ColorInt int i) {
        return new tn5(null, null, i);
    }

    /* JADX INFO: renamed from: c */
    public static tn5 m189759c(@NonNull ColorStateList colorStateList) {
        return new tn5(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: d */
    public static tn5 m189760d(@NonNull Shader shader) {
        return new tn5(shader, null, 0);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static tn5 m189761g(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        try {
            return m189757a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    @ColorInt
    /* JADX INFO: renamed from: e */
    public int m189762e() {
        return this.f171210c;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Shader m189763f() {
        return this.f171208a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m189764h() {
        return this.f171208a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m189765i() {
        ColorStateList colorStateList;
        return this.f171208a == null && (colorStateList = this.f171209b) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public boolean m189766j(int[] iArr) {
        if (!m189765i()) {
            return false;
        }
        ColorStateList colorStateList = this.f171209b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f171210c) {
            return false;
        }
        this.f171210c = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m189767k(@ColorInt int i) {
        this.f171210c = i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m189768l() {
        return m189764h() || this.f171210c != 0;
    }
}
