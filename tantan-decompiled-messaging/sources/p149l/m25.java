package p149l;

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
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class m25 {

    /* JADX INFO: renamed from: a */
    public static final int f130884a = t100.m186890d(1.0f);

    /* JADX INFO: renamed from: b */
    public static final int f130885b;

    /* JADX INFO: renamed from: c */
    public static final int f130886c;

    static {
        int i = t100.f167254c;
        f130885b = i;
        f130886c = i;
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m152651a(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig, View view, int i) {
        LongLinkChatMessage.LiveBackgroundColorConfig backgroundColorConfig = liveChatShadingConfig.getBackgroundColorConfig();
        LongLinkChatMessage.LiveBackgroundColorConfig borderColorConfig = liveChatShadingConfig.getBorderColorConfig();
        ArrayList arrayList = new ArrayList();
        if (m152661k(backgroundColorConfig)) {
            arrayList.add(m152653c(backgroundColorConfig, i));
        }
        if (m152661k(borderColorConfig)) {
            arrayList.add(m152656f(borderColorConfig, view, i));
        }
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[arrayList.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static int m152652b(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
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
    public static GradientDrawable m152653c(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(m152654d(liveBackgroundColorConfig.getGradientDirection()), m152657g(liveBackgroundColorConfig));
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setAlpha(m152652b(liveBackgroundColorConfig));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: d */
    public static GradientDrawable.Orientation m152654d(long j) {
        if (j == 1) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if (j == 3) {
            return GradientDrawable.Orientation.TL_BR;
        }
        return j == 2 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.LEFT_RIGHT;
    }

    /* JADX INFO: renamed from: e */
    public static LinearGradient m152655e(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view) {
        int right;
        int bottom;
        int i;
        int iM152662l;
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
        int i2 = LiveChatItem.f48745i;
        if (vwb.m200296J(liveBackgroundColorConfig.getColorsList()) || liveBackgroundColorConfig.getColorsList().size() != 2) {
            i = i2;
            iM152662l = i;
        } else {
            int iM152662l2 = m152662l(liveBackgroundColorConfig.getColorsList().get(0));
            iM152662l = m152662l(liveBackgroundColorConfig.getColorsList().get(1));
            i = iM152662l2;
        }
        return new LinearGradient(0.0f, 0.0f, right, bottom, i, iM152662l, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: f */
    public static ShapeDrawable m152656f(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view, int i) {
        float f = i;
        int i2 = f130884a;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, new RectF(i2, i2, i2, i2), new float[]{f, f, f, f, f, f, f, f}));
        shapeDrawable.getPaint().setShader(m152655e(liveBackgroundColorConfig, view));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setAlpha(m152652b(liveBackgroundColorConfig));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m152657g(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
        int[] iArr = new int[2];
        if (liveBackgroundColorConfig != null && !vwb.m200296J(liveBackgroundColorConfig.getColorsList())) {
            List<String> colorsList = liveBackgroundColorConfig.getColorsList();
            if (colorsList.size() == 2) {
                iArr[0] = m152662l(colorsList.get(0));
                iArr[1] = m152662l(colorsList.get(1));
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static Drawable m152658h(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig, View view, int i) {
        LongLinkChatMessage.LiveBackgroundColorConfig backgroundColorConfig = liveChatShadingConfig.getBackgroundColorConfig();
        LongLinkChatMessage.LiveBackgroundColorConfig borderColorConfig = liveChatShadingConfig.getBorderColorConfig();
        ArrayList arrayList = new ArrayList();
        if (m152661k(backgroundColorConfig)) {
            arrayList.add(m152659i(backgroundColorConfig, i));
        }
        if (m152661k(borderColorConfig)) {
            arrayList.add(m152660j(borderColorConfig, view, i));
        }
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[arrayList.size()]));
    }

    /* JADX INFO: renamed from: i */
    public static GradientDrawable m152659i(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(m152654d(liveBackgroundColorConfig.getGradientDirection()), m152657g(liveBackgroundColorConfig));
        float f = i;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setAlpha(m152652b(liveBackgroundColorConfig));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j */
    public static ShapeDrawable m152660j(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view, int i) {
        float f = i;
        float[] fArr = {f, f, f, f, f, f, f, f};
        int i2 = f130885b;
        RectF rectF = new RectF(i2, i2, i2, i2);
        int i3 = f130886c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, new float[]{i - i3, i - i3, i - i3, i - i3, i - i3, i - i3, i - i3, i - i3}));
        shapeDrawable.getPaint().setShader(m152655e(liveBackgroundColorConfig, view));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setAlpha(m152652b(liveBackgroundColorConfig));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m152661k(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
        return (liveBackgroundColorConfig == null || vwb.m200296J(liveBackgroundColorConfig.getColorsList()) || liveBackgroundColorConfig.getColorsCount() != 2) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static int m152662l(String str) {
        int i = LiveChatItem.f48745i;
        try {
            return Color.parseColor(uep0.m193323j(str));
        } catch (Exception e) {
            CrashHelper.m81296c(new Throwable("parse color is :" + str, e));
            return i;
        }
    }
}
