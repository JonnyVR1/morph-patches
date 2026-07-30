package com.immomo.svgaplayer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.text.TextPaint;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.svgaplayer.adapter.SVGAThreadAdapter;
import com.immomo.svgaplayer.bean.BoringLayoutBean;
import com.immomo.svgaplayer.bean.StaticLayoutBean;
import com.immomo.svgaplayer.corner.BitmapFillet;
import com.immomo.svgaplayer.listener.IClickAreaListener;
import com.immomo.svgaplayer.setting.SVGAAdapterContainer;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00103\u001a\u000204J\b\u00105\u001a\u00020\u0001H\u0002J\u0016\u00106\u001a\u0002042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u001cJ\u0016\u00109\u001a\u0002042\u0006\u00107\u001a\u00020\u00042\u0006\u0010:\u001a\u00020 JF\u0010;\u001a\u0002042\u0006\u00107\u001a\u00020\u000426\u0010<\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000eJ\u0016\u0010=\u001a\u0002042\u0006\u00107\u001a\u00020\u00042\u0006\u0010:\u001a\u00020 J\u0016\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004J&\u0010?\u001a\u0002042\u0006\u00107\u001a\u00020\u00042\u0006\u0010:\u001a\u00020 2\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020BJ\u0016\u0010C\u001a\u0002042\u0006\u00107\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0007J\u0016\u0010C\u001a\u0002042\u0006\u00107\u001a\u00020\u00042\u0006\u0010E\u001a\u00020$J\u001e\u0010C\u001a\u0002042\u0006\u00107\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020+J\u0016\u0010H\u001a\u0002042\u0006\u00107\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R6\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0096\u0001\u0010\r\u001a~\u0012\u0004\u0012\u00020\u0004\u00124\u00122\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000e0\u0006j>\u0012\u0004\u0012\u00020\u0004\u00124\u00122\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000e`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR6\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR6\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR6\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 `\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\fR6\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020$0\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020$`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\fR6\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\n\"\u0004\b)\u0010\fR6\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+0\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\n\"\u0004\b-\u0010\fR\u001a\u0010.\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006J"}, m87232d2 = {"Lcom/immomo/svgaplayer/SVGADynamicEntity;", "", "()V", "TAG", "", "dynamicBoringLayoutText", "Ljava/util/HashMap;", "Lcom/immomo/svgaplayer/bean/BoringLayoutBean;", "Lkotlin/collections/HashMap;", "getDynamicBoringLayoutText$svgalibrary_release", "()Ljava/util/HashMap;", "setDynamicBoringLayoutText$svgalibrary_release", "(Ljava/util/HashMap;)V", "dynamicDrawer", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "canvas", "", "frameIndex", "", "getDynamicDrawer$svgalibrary_release", "setDynamicDrawer$svgalibrary_release", "dynamicHidden", "getDynamicHidden$svgalibrary_release", "setDynamicHidden$svgalibrary_release", "dynamicIClickArea", "Lcom/immomo/svgaplayer/listener/IClickAreaListener;", "getDynamicIClickArea$svgalibrary_release", "setDynamicIClickArea$svgalibrary_release", "dynamicImage", "Landroid/graphics/Bitmap;", "getDynamicImage$svgalibrary_release", "setDynamicImage$svgalibrary_release", "dynamicStaticLayoutText", "Lcom/immomo/svgaplayer/bean/StaticLayoutBean;", "getDynamicStaticLayoutText$svgalibrary_release", "setDynamicStaticLayoutText$svgalibrary_release", "dynamicText", "getDynamicText$svgalibrary_release", "setDynamicText$svgalibrary_release", "dynamicTextPaint", "Landroid/text/TextPaint;", "getDynamicTextPaint$svgalibrary_release", "setDynamicTextPaint$svgalibrary_release", "isTextDirty", "isTextDirty$svgalibrary_release", "()Z", "setTextDirty$svgalibrary_release", "(Z)V", "clearDynamicObjects", "", "getTaskTag", "setClickArea", "forKey", "clickListener", "setDynamicCircleImage", "bitmap", "setDynamicDrawer", BLiveTraceServerLocation.drawer, "setDynamicImage", "url", "setDynamicRadiusImage", Constants.KEY_RADIUS, "corner", "Lcom/immomo/svgaplayer/corner/BitmapFillet$Corner;", "setDynamicText", "layoutBean", "layoutText", "text", "textPaint", "setHidden", "value", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class SVGADynamicEntity {
    private boolean isTextDirty;
    private final String TAG = "SVGADynamicEntity";

    @NotNull
    private HashMap<String, Boolean> dynamicHidden = new HashMap<>();

    @NotNull
    private HashMap<String, Bitmap> dynamicImage = new HashMap<>();

    @NotNull
    private HashMap<String, String> dynamicText = new HashMap<>();

    @NotNull
    private HashMap<String, TextPaint> dynamicTextPaint = new HashMap<>();

    @NotNull
    private HashMap<String, BoringLayoutBean> dynamicBoringLayoutText = new HashMap<>();

    @NotNull
    private HashMap<String, StaticLayoutBean> dynamicStaticLayoutText = new HashMap<>();

    @NotNull
    private HashMap<String, IClickAreaListener> dynamicIClickArea = new HashMap<>();

    @NotNull
    private HashMap<String, Function2<Canvas, Integer, Boolean>> dynamicDrawer = new HashMap<>();

    private final Object getTaskTag() {
        return this.TAG + hashCode();
    }

    public final void clearDynamicObjects() {
        this.isTextDirty = true;
        this.dynamicHidden.clear();
        this.dynamicImage.clear();
        this.dynamicText.clear();
        this.dynamicTextPaint.clear();
        this.dynamicStaticLayoutText.clear();
        this.dynamicBoringLayoutText.clear();
        this.dynamicDrawer.clear();
        this.dynamicIClickArea.clear();
        SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
        if (mSVGAThreadAdapter != null) {
            mSVGAThreadAdapter.cancelTaskByTag(getTaskTag());
        }
    }

    @NotNull
    public final HashMap<String, BoringLayoutBean> getDynamicBoringLayoutText$svgalibrary_release() {
        return this.dynamicBoringLayoutText;
    }

    @NotNull
    public final HashMap<String, Function2<Canvas, Integer, Boolean>> getDynamicDrawer$svgalibrary_release() {
        return this.dynamicDrawer;
    }

    @NotNull
    public final HashMap<String, Boolean> getDynamicHidden$svgalibrary_release() {
        return this.dynamicHidden;
    }

    @NotNull
    public final HashMap<String, IClickAreaListener> getDynamicIClickArea$svgalibrary_release() {
        return this.dynamicIClickArea;
    }

    @NotNull
    public final HashMap<String, Bitmap> getDynamicImage$svgalibrary_release() {
        return this.dynamicImage;
    }

    @NotNull
    public final HashMap<String, StaticLayoutBean> getDynamicStaticLayoutText$svgalibrary_release() {
        return this.dynamicStaticLayoutText;
    }

    @NotNull
    public final HashMap<String, String> getDynamicText$svgalibrary_release() {
        return this.dynamicText;
    }

    @NotNull
    public final HashMap<String, TextPaint> getDynamicTextPaint$svgalibrary_release() {
        return this.dynamicTextPaint;
    }

    /* JADX INFO: renamed from: isTextDirty$svgalibrary_release, reason: from getter */
    public final boolean getIsTextDirty() {
        return this.isTextDirty;
    }

    public final void setClickArea(@NotNull String forKey, @NotNull IClickAreaListener clickListener) {
        forKey.getClass();
        clickListener.getClass();
        this.dynamicIClickArea.put(forKey, clickListener);
    }

    public final void setDynamicBoringLayoutText$svgalibrary_release(@NotNull HashMap<String, BoringLayoutBean> map) {
        map.getClass();
        this.dynamicBoringLayoutText = map;
    }

    public final void setDynamicCircleImage(@NotNull String forKey, @NotNull Bitmap bitmap) {
        forKey.getClass();
        bitmap.getClass();
        this.dynamicImage.put(forKey, BitmapFillet.INSTANCE.fillet(bitmap, Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2, BitmapFillet.Corner.CORNER_ALL));
    }

    public final void setDynamicDrawer(@NotNull String forKey, @NotNull Function2<? super Canvas, ? super Integer, Boolean> drawer) {
        forKey.getClass();
        drawer.getClass();
        this.dynamicDrawer.put(forKey, drawer);
    }

    public final void setDynamicDrawer$svgalibrary_release(@NotNull HashMap<String, Function2<Canvas, Integer, Boolean>> map) {
        map.getClass();
        this.dynamicDrawer = map;
    }

    public final void setDynamicHidden$svgalibrary_release(@NotNull HashMap<String, Boolean> map) {
        map.getClass();
        this.dynamicHidden = map;
    }

    public final void setDynamicIClickArea$svgalibrary_release(@NotNull HashMap<String, IClickAreaListener> map) {
        map.getClass();
        this.dynamicIClickArea = map;
    }

    public final void setDynamicImage(@NotNull String url, @NotNull String forKey) {
        url.getClass();
        forKey.getClass();
        SVGADynamicEntity$setDynamicImage$runable$1 sVGADynamicEntity$setDynamicImage$runable$1 = new SVGADynamicEntity$setDynamicImage$runable$1(this, url, new Handler(), forKey);
        SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
        if (mSVGAThreadAdapter != null) {
            mSVGAThreadAdapter.executeTaskByTag(getTaskTag(), sVGADynamicEntity$setDynamicImage$runable$1);
        } else {
            new Thread(sVGADynamicEntity$setDynamicImage$runable$1).start();
        }
    }

    public final void setDynamicImage$svgalibrary_release(@NotNull HashMap<String, Bitmap> map) {
        map.getClass();
        this.dynamicImage = map;
    }

    public final void setDynamicRadiusImage(@NotNull String forKey, @NotNull Bitmap bitmap, int radius, @NotNull BitmapFillet.Corner corner) {
        forKey.getClass();
        bitmap.getClass();
        corner.getClass();
        this.dynamicImage.put(forKey, BitmapFillet.INSTANCE.fillet(bitmap, radius, corner));
    }

    public final void setDynamicStaticLayoutText$svgalibrary_release(@NotNull HashMap<String, StaticLayoutBean> map) {
        map.getClass();
        this.dynamicStaticLayoutText = map;
    }

    public final void setDynamicText(@NotNull String forKey, @NotNull String text, @NotNull TextPaint textPaint) {
        forKey.getClass();
        text.getClass();
        textPaint.getClass();
        this.isTextDirty = true;
        this.dynamicText.put(forKey, text);
        this.dynamicTextPaint.put(forKey, textPaint);
    }

    public final void setDynamicText$svgalibrary_release(@NotNull HashMap<String, String> map) {
        map.getClass();
        this.dynamicText = map;
    }

    public final void setDynamicTextPaint$svgalibrary_release(@NotNull HashMap<String, TextPaint> map) {
        map.getClass();
        this.dynamicTextPaint = map;
    }

    public final void setHidden(@NotNull String forKey, boolean value) {
        forKey.getClass();
        this.dynamicHidden.put(forKey, Boolean.valueOf(value));
    }

    public final void setTextDirty$svgalibrary_release(boolean z) {
        this.isTextDirty = z;
    }

    public final void setDynamicText(@NotNull String forKey, @NotNull StaticLayoutBean layoutText) {
        forKey.getClass();
        layoutText.getClass();
        this.isTextDirty = true;
        this.dynamicStaticLayoutText.put(forKey, layoutText);
    }

    public final void setDynamicText(@NotNull String forKey, @NotNull BoringLayoutBean layoutBean) {
        forKey.getClass();
        layoutBean.getClass();
        this.isTextDirty = true;
        this.dynamicBoringLayoutText.put(forKey, layoutBean);
    }

    public final void setDynamicImage(@NotNull String forKey, @NotNull Bitmap bitmap) {
        forKey.getClass();
        bitmap.getClass();
        this.dynamicImage.put(forKey, bitmap);
    }
}
