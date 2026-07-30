package com.immomo.svgaplayer.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.immomo.svgaplayer.ErrorConstant;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.SVGAVideoEntity;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.ox50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010J,\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m87232d2 = {"Lcom/immomo/svgaplayer/view/MomoLayUpSVGAImageView;", "Lcom/immomo/svgaplayer/view/MomoSVGAImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mLayoutType", "Lcom/immomo/svgaplayer/view/MomoLayUpSVGAImageView$LayoutType;", "mScaleType", "Landroid/widget/ImageView$ScaleType;", "mVideoHeight", "", "mVideoWidth", "getParentWidth", "onComplete", "", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "setLayout", "setLayoutType", "layoutType", "setMScaleType", "scaleType", "startSVGAAnimWithLayJson", "jsonStr", "", "loop", "itemClickAreaListener", "Lcom/immomo/svgaplayer/listener/SVGAClickAreaListener;", "animListener", "Lcom/immomo/svgaplayer/SVGAAnimListenerAdapter;", "LayoutType", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class MomoLayUpSVGAImageView extends MomoSVGAImageView {
    private LayoutType mLayoutType;
    private ImageView.ScaleType mScaleType;
    private float mVideoHeight;
    private float mVideoWidth;

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/immomo/svgaplayer/view/MomoLayUpSVGAImageView$LayoutType;", "", "(Ljava/lang/String;I)V", "SIZE_DEFAULT", "ALIGN_PARENT_TOP", "ALIGN_PARENT_BOTTOM", "MATCH_PARENT", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
    public enum LayoutType {
        SIZE_DEFAULT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_BOTTOM,
        MATCH_PARENT
    }

    @Metadata(m87230bv = {1, 0, 2}, m87233k = 3, m87234mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LayoutType.ALIGN_PARENT_TOP.ordinal()] = 1;
            iArr[LayoutType.ALIGN_PARENT_BOTTOM.ordinal()] = 2;
            iArr[LayoutType.MATCH_PARENT.ordinal()] = 3;
        }
    }

    public MomoLayUpSVGAImageView(@Nullable Context context) {
        super(context);
        this.mLayoutType = LayoutType.SIZE_DEFAULT;
        this.mScaleType = ImageView.ScaleType.CENTER;
    }

    private final int getParentWidth() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            return viewGroup.getWidth();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    private final void setLayout() {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (!(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            throw new InflateException("MomoLayUpSVGAImageView 父布局必须是 FrameLayout");
        }
        int parentWidth = getParentWidth();
        int i = WhenMappings.$EnumSwitchMapping$0[this.mLayoutType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setScaleType(ImageView.ScaleType.FIT_CENTER);
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                if (layoutParams3 == null) {
                    ox50.m166495a("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                }
                layoutParams = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams.gravity = 80;
                layoutParams.width = parentWidth;
                layoutParams.height = (int) ((parentWidth / this.mVideoWidth) * this.mVideoHeight);
            } else if (i != 3) {
                layoutParams2 = null;
            } else {
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                setScaleType(this.mScaleType);
            }
            if (layoutParams2 != null) {
                setLayoutParams(layoutParams2);
            }
        }
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        if (layoutParams4 == null) {
            ox50.m166495a("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        layoutParams = (FrameLayout.LayoutParams) layoutParams4;
        layoutParams.gravity = 48;
        layoutParams.width = parentWidth;
        layoutParams.height = (int) ((parentWidth / this.mVideoWidth) * this.mVideoHeight);
        layoutParams2 = layoutParams;
        if (layoutParams2 != null) {
            setLayoutParams(layoutParams2);
        }
    }

    @Override // com.immomo.svgaplayer.view.MomoSVGAImageView, com.immomo.svgaplayer.SVGAImageView, com.immomo.svgaplayer.SVGAParser.ParseCompletion
    public void onComplete(@NotNull SVGAVideoEntity videoItem) {
        videoItem.getClass();
        if (getMSVGAEntity() != null) {
            this.mVideoWidth = (float) videoItem.getVideoSize().getWidth();
            this.mVideoHeight = (float) videoItem.getVideoSize().getHeight();
            if (getMStopPlay()) {
                return;
            } else {
                setLayout();
            }
        }
        super.onComplete(videoItem);
    }

    @NotNull
    public final MomoLayUpSVGAImageView setLayoutType(@NotNull LayoutType layoutType) {
        layoutType.getClass();
        this.mLayoutType = layoutType;
        return this;
    }

    @NotNull
    public final MomoLayUpSVGAImageView setMScaleType(@NotNull ImageView.ScaleType scaleType) {
        scaleType.getClass();
        this.mScaleType = scaleType;
        return this;
    }

    public final void startSVGAAnimWithLayJson(@Nullable String jsonStr, int loop, @Nullable SVGAClickAreaListener itemClickAreaListener, @Nullable SVGAAnimListenerAdapter animListener) {
        if (TextUtils.isEmpty(jsonStr)) {
            onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_JSON());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            int iOptInt = jSONObject.optInt("positionType");
            int iOptInt2 = jSONObject.optInt("scaleType");
            if (iOptInt == 0) {
                this.mLayoutType = LayoutType.ALIGN_PARENT_TOP;
            } else if (iOptInt == 1) {
                this.mLayoutType = LayoutType.ALIGN_PARENT_BOTTOM;
            } else if (iOptInt == 2) {
                this.mLayoutType = LayoutType.MATCH_PARENT;
            }
            if (iOptInt2 == 0) {
                this.mScaleType = ImageView.ScaleType.CENTER;
            } else if (iOptInt2 == 1) {
                this.mScaleType = ImageView.ScaleType.FIT_XY;
            } else if (iOptInt2 == 2) {
                this.mScaleType = ImageView.ScaleType.FIT_CENTER;
            } else if (iOptInt2 == 3) {
                this.mScaleType = ImageView.ScaleType.CENTER_CROP;
            }
            startSVGAAnimWithJson(jSONObject, loop, itemClickAreaListener, animListener);
        } catch (Exception unused) {
            onError(ErrorConstant.INSTANCE.getERROR_MMSVGA_JSON());
        }
    }

    public MomoLayUpSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLayoutType = LayoutType.SIZE_DEFAULT;
        this.mScaleType = ImageView.ScaleType.CENTER;
    }

    public MomoLayUpSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLayoutType = LayoutType.SIZE_DEFAULT;
        this.mScaleType = ImageView.ScaleType.CENTER;
    }

    public MomoLayUpSVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mLayoutType = LayoutType.SIZE_DEFAULT;
        this.mScaleType = ImageView.ScaleType.CENTER;
    }
}
