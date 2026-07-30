package p153l;

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
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class l35 {

    /* JADX INFO: renamed from: a */
    public static final int f129839a = qa00.m175859d(1.0f);

    /* JADX INFO: renamed from: b */
    public static final int f129840b;

    /* JADX INFO: renamed from: c */
    public static final int f129841c;

    static {
        int i = qa00.f156316c;
        f129840b = i;
        f129841c = i;
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m152669a(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig, View view, int i) {
        LongLinkChatMessage.LiveBackgroundColorConfig backgroundColorConfig = liveChatShadingConfig.getBackgroundColorConfig();
        LongLinkChatMessage.LiveBackgroundColorConfig borderColorConfig = liveChatShadingConfig.getBorderColorConfig();
        ArrayList arrayList = new ArrayList();
        if (m152679k(backgroundColorConfig)) {
            arrayList.add(m152671c(backgroundColorConfig, i));
        }
        if (m152679k(borderColorConfig)) {
            arrayList.add(m152674f(borderColorConfig, view, i));
        }
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[arrayList.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static int m152670b(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
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
    public static GradientDrawable m152671c(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(m152672d(liveBackgroundColorConfig.getGradientDirection()), m152675g(liveBackgroundColorConfig));
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setAlpha(m152670b(liveBackgroundColorConfig));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: d */
    public static GradientDrawable.Orientation m152672d(long j) {
        if (j == 1) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if (j == 3) {
            return GradientDrawable.Orientation.TL_BR;
        }
        return j == 2 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.LEFT_RIGHT;
    }

    /* JADX INFO: renamed from: e */
    public static LinearGradient m152673e(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view) {
        int right;
        int bottom;
        int i;
        int iM152680l;
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
        int i2 = LiveChatItem.f49593i;
        if (jyb.m147479J(liveBackgroundColorConfig.getColorsList()) || liveBackgroundColorConfig.getColorsList().size() != 2) {
            i = i2;
            iM152680l = i;
        } else {
            int iM152680l2 = m152680l(liveBackgroundColorConfig.getColorsList().get(0));
            iM152680l = m152680l(liveBackgroundColorConfig.getColorsList().get(1));
            i = iM152680l2;
        }
        return new LinearGradient(0.0f, 0.0f, right, bottom, i, iM152680l, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: f */
    public static ShapeDrawable m152674f(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view, int i) {
        float f = i;
        int i2 = f129839a;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, new RectF(i2, i2, i2, i2), new float[]{f, f, f, f, f, f, f, f}));
        shapeDrawable.getPaint().setShader(m152673e(liveBackgroundColorConfig, view));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setAlpha(m152670b(liveBackgroundColorConfig));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m152675g(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
        int[] iArr = new int[2];
        if (liveBackgroundColorConfig != null && !jyb.m147479J(liveBackgroundColorConfig.getColorsList())) {
            List<String> colorsList = liveBackgroundColorConfig.getColorsList();
            if (colorsList.size() == 2) {
                iArr[0] = m152680l(colorsList.get(0));
                iArr[1] = m152680l(colorsList.get(1));
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static Drawable m152676h(LongLinkChatMessage.LiveChatShadingConfig liveChatShadingConfig, View view, int i) {
        LongLinkChatMessage.LiveBackgroundColorConfig backgroundColorConfig = liveChatShadingConfig.getBackgroundColorConfig();
        LongLinkChatMessage.LiveBackgroundColorConfig borderColorConfig = liveChatShadingConfig.getBorderColorConfig();
        ArrayList arrayList = new ArrayList();
        if (m152679k(backgroundColorConfig)) {
            arrayList.add(m152677i(backgroundColorConfig, i));
        }
        if (m152679k(borderColorConfig)) {
            arrayList.add(m152678j(borderColorConfig, view, i));
        }
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[arrayList.size()]));
    }

    /* JADX INFO: renamed from: i */
    public static GradientDrawable m152677i(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(m152672d(liveBackgroundColorConfig.getGradientDirection()), m152675g(liveBackgroundColorConfig));
        float f = i;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setAlpha(m152670b(liveBackgroundColorConfig));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j */
    public static ShapeDrawable m152678j(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig, View view, int i) {
        float f = i;
        float[] fArr = {f, f, f, f, f, f, f, f};
        int i2 = f129840b;
        RectF rectF = new RectF(i2, i2, i2, i2);
        int i3 = f129841c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, new float[]{i - i3, i - i3, i - i3, i - i3, i - i3, i - i3, i - i3, i - i3}));
        shapeDrawable.getPaint().setShader(m152673e(liveBackgroundColorConfig, view));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setAlpha(m152670b(liveBackgroundColorConfig));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m152679k(LongLinkChatMessage.LiveBackgroundColorConfig liveBackgroundColorConfig) {
        return (liveBackgroundColorConfig == null || jyb.m147479J(liveBackgroundColorConfig.getColorsList()) || liveBackgroundColorConfig.getColorsCount() != 2) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static int m152680l(String str) {
        int i = LiveChatItem.f49593i;
        try {
            return Color.parseColor(ynp0.m216933j(str));
        } catch (Exception e) {
            CrashHelper.m82479c(new Throwable("parse color is :" + str, e));
            return i;
        }
    }
}
