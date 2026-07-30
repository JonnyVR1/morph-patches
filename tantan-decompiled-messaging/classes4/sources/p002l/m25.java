package p002l;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.t100;
import l.uep0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m25 {

    /* JADX INFO: renamed from: a */
    public static final int f15214a = t100.d(1.0f);

    /* JADX INFO: renamed from: b */
    public static final int f15215b;

    /* JADX INFO: renamed from: c */
    public static final int f15216c;

    static {
        int i = t100.c;
        f15215b = i;
        f15216c = i;
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m17669a(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig, View view, int i) {
        LongLinkChatMessage.LiveBackgroundColorConfig backgroundColorConfig = liveChatShadingConfig.getBackgroundColorConfig();
        LongLinkChatMessage.LiveBackgroundColorConfig borderColorConfig = liveChatShadingConfig.getBorderColorConfig();
        ArrayList arrayList = new ArrayList();
        if (m17679k(backgroundColorConfig)) {
            arrayList.add(m17671c(backgroundColorConfig, i));
        }
        if (m17679k(borderColorConfig)) {
            arrayList.add(m17674f(borderColorConfig, view, i));
        }
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[arrayList.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static int m17670b(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
        long transparency = liveBackgroundColorConfig.getTransparency();
        if (transparency < 0) {
            transparency = 0;
        }
        if (transparency > 100) {
            transparency = 100;
        }
        return 255 - ((int) ((transparency / 100.0f) * 255.0f));
    }

    /* JADX INFO: renamed from: c */
    public static GradientDrawable m17671c(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(m17672d(liveBackgroundColorConfig.getGradientDirection()), m17675g(liveBackgroundColorConfig));
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setAlpha(m17670b(liveBackgroundColorConfig));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: d */
    public static GradientDrawable.Orientation m17672d(long j) {
        if (j == 1) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if (j == 3) {
            return GradientDrawable.Orientation.TL_BR;
        }
        return j == 2 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.LEFT_RIGHT;
    }

    /* JADX INFO: renamed from: e */
    public static LinearGradient m17673e(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view) {
        int right;
        int bottom;
        int i;
        int iM17680l;
        long gradientDirection = liveBackgroundColorConfig.getGradientDirection();
        if (gradientDirection == 1) {
            bottom = view.getBottom();
            right = 0;
        } else if (gradientDirection == 2) {
            right = view.getRight();
            bottom = 0;
        } else if (gradientDirection == 3) {
            int right2 = view.getRight();
            bottom = view.getBottom();
            right = right2;
        } else {
            right = 0;
            bottom = 0;
        }
        int i2 = LiveChatItem.f4787i;
        if (vwb.J(liveBackgroundColorConfig.getColorsList()) || liveBackgroundColorConfig.getColorsList().size() != 2) {
            i = i2;
            iM17680l = i;
        } else {
            int iM17680l2 = m17680l((String) liveBackgroundColorConfig.getColorsList().get(0));
            iM17680l = m17680l((String) liveBackgroundColorConfig.getColorsList().get(1));
            i = iM17680l2;
        }
        return new LinearGradient(0.0f, 0.0f, right, bottom, i, iM17680l, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: f */
    public static ShapeDrawable m17674f(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view, int i) {
        float f = i;
        int i2 = f15214a;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, new RectF(i2, i2, i2, i2), new float[]{f, f, f, f, f, f, f, f}));
        shapeDrawable.getPaint().setShader(m17673e(liveBackgroundColorConfig, view));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setAlpha(m17670b(liveBackgroundColorConfig));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m17675g(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
        int[] iArr = new int[2];
        if (liveBackgroundColorConfig != null && !vwb.J(liveBackgroundColorConfig.getColorsList())) {
            List colorsList = liveBackgroundColorConfig.getColorsList();
            if (colorsList.size() == 2) {
                iArr[0] = m17680l((String) colorsList.get(0));
                iArr[1] = m17680l((String) colorsList.get(1));
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static Drawable m17676h(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig, View view, int i) {
        LongLinkChatMessage.LiveBackgroundColorConfig backgroundColorConfig = liveChatShadingConfig.getBackgroundColorConfig();
        LongLinkChatMessage.LiveBackgroundColorConfig borderColorConfig = liveChatShadingConfig.getBorderColorConfig();
        ArrayList arrayList = new ArrayList();
        if (m17679k(backgroundColorConfig)) {
            arrayList.add(m17677i(backgroundColorConfig, i));
        }
        if (m17679k(borderColorConfig)) {
            arrayList.add(m17678j(borderColorConfig, view, i));
        }
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[arrayList.size()]));
    }

    /* JADX INFO: renamed from: i */
    public static GradientDrawable m17677i(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(m17672d(liveBackgroundColorConfig.getGradientDirection()), m17675g(liveBackgroundColorConfig));
        float f = i;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setAlpha(m17670b(liveBackgroundColorConfig));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j */
    public static ShapeDrawable m17678j(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view, int i) {
        float f = i;
        float[] fArr = {f, f, f, f, f, f, f, f};
        int i2 = f15215b;
        RectF rectF = new RectF(i2, i2, i2, i2);
        int i3 = f15216c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, new float[]{i - i3, i - i3, i - i3, i - i3, i - i3, i - i3, i - i3, i - i3}));
        shapeDrawable.getPaint().setShader(m17673e(liveBackgroundColorConfig, view));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setAlpha(m17670b(liveBackgroundColorConfig));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m17679k(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
        return (liveBackgroundColorConfig == null || vwb.J(liveBackgroundColorConfig.getColorsList()) || liveBackgroundColorConfig.getColorsCount() != 2) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static int m17680l(String str) {
        int i = LiveChatItem.f4787i;
        try {
            return Color.parseColor(uep0.j(str));
        } catch (Exception e) {
            CrashHelper.c(new Throwable("parse color is :" + str, e));
            return i;
        }
    }
}
