package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.filter.beauty.MakeupID;
import com.momo.mcamera.mask.LiveLightningEngineFilter;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 42\u00020\u0001:\u0001\u001aB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR0\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001cj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001cj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010#R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010#R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010#R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010#¨\u00065"}, m87232d2 = {"Ll/o0f;", "", "Lcom/momo/mcamera/mask/LiveLightningEngineFilter;", "lightFilter", "<init>", "(Lcom/momo/mcamera/mask/LiveLightningEngineFilter;)V", "", "id", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "value", "", "g", "(Ljava/lang/String;F)V", Constants.KEY_KEY, "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;F)Z", "f", "()V", "h", "(Ljava/lang/String;Ljava/lang/String;F)V", "path", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "a", "Lcom/momo/mcamera/mask/LiveLightningEngineFilter;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "makeupAddedMap", "c", "makeupIdPathPool", "F", "thinFaceJawShape", "jawShapeJawShape", "thinFaceShortFace", "jawShapeShortFace", "thinFaceFaceWidth", "faceWidthFaceWidth", "j", "thinFaceChinLength", "k", "chinLengthChinLength", BLiveStormDanmakuGiftResourceType.f44444l, "thinFaceNoseWidth", "m", "noseWidthNoseWidth", "n", "jawShapeNoseWidth", "Companion", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class o0f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    private static String f141317o = "";

    /* JADX INFO: renamed from: p */
    @NotNull
    private static final HashMap<String, String> f141318p;

    /* JADX INFO: renamed from: q */
    @NotNull
    private static final HashMap<String, String> f141319q;

    /* JADX INFO: renamed from: r */
    @NotNull
    private static String f141320r;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final LiveLightningEngineFilter lightFilter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, String> makeupAddedMap = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, String> makeupIdPathPool = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float thinFaceJawShape;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float jawShapeJawShape;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float thinFaceShortFace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float jawShapeShortFace;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float thinFaceFaceWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float faceWidthFaceWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float thinFaceChinLength;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float chinLengthChinLength;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float thinFaceNoseWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float noseWidthNoseWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float jawShapeNoseWidth;

    static {
        HashMap<String, String> map = new HashMap<>();
        f141318p = map;
        HashMap<String, String> map2 = new HashMap<>();
        f141319q = map2;
        f141320r = "";
        map.put(MakeupID.MAKEUP_LIP, ILightningRender.IMakeupLevel.MAKEUP_LIPS);
        map.put(MakeupID.MAKEUP_BLUSHER, ILightningRender.IMakeupLevel.MAKEUP_BLUSH);
        map.put(MakeupID.MAKEUP_PUPIL, ILightningRender.IMakeupLevel.MAKEUP_PUPIL);
        map.put(MakeupID.MAKEUP_EYESHADOW, ILightningRender.IMakeupLevel.MAKEUP_EYES);
        map.put(MakeupID.MAKEUP_EYEBROW, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW);
        map.put(MakeupID.MAKEUP_FACIAL, ILightningRender.IMakeupLevel.MAKEUP_FACIAL);
        map.put("Makeup_ALL", ILightningRender.IMakeupLevel.MAKEUP_ALL);
        map.put("Filter_ALL", ILightningRender.IMakeupLevel.MAKEUP_LUT);
        map.put("MakeupStyle_None", "MakeupStyle_None");
        map2.put("smooth", "skin_smooth");
        map2.put("Internal_Deform_Overall", FaceBeautyID.THIN_FACE);
        map2.put("Internal_Deform_Eye", FaceBeautyID.BIG_EYE);
        map2.put("Internal_Deform_Face", FaceBeautyID.JAW_SHAPE);
        map2.put(FaceBeautyID.SHARP, "skin_sharpen");
        map2.put("whiten", "skin_whitening");
        map2.put("Internal_Deform_CutFace", FaceBeautyID.FACE_WIDTH);
        map2.put("Internal_Deform_Zoom_Cheekbone", FaceBeautyID.CHEEKBONE_WIDTH);
        map2.put("Internal_Deform_Zoom_Jawbone", FaceBeautyID.JAW_WIDTH);
        map2.put("Internal_Deform_Nose", FaceBeautyID.NOSE_WIDTH);
        map2.put("Internal_Deform_MovNose", FaceBeautyID.NOSE_LIFT);
        map2.put("Internal_Deform_ZoomMouth", FaceBeautyID.MOUTH_SIZE);
        map2.put("Internal_Deform_Chin", FaceBeautyID.CHIN_LENGTH);
        map2.put("Internal_Deform_Forehead", FaceBeautyID.FOREHEAD);
        map2.put("BEF_BEAUTY_REMOVE_POUCH", "remove_pouch");
        map2.put("BEF_BEAUTY_SMILES_FOLDS", "remove_nasolabial_floads");
    }

    public o0f(@Nullable LiveLightningEngineFilter liveLightningEngineFilter) {
        this.lightFilter = liveLightningEngineFilter;
    }

    /* JADX INFO: renamed from: e */
    private final String m162140e(String id) {
        String str;
        if (StringsKt.m93438e0(f141317o)) {
            return "";
        }
        if (this.makeupIdPathPool.get(id) == null) {
            String str2 = File.separator;
            str2.getClass();
            str = id;
            String strM93479F = C15386d.m93479F(str, "_", str2, false, 4, null);
            if (strM93479F.length() <= 0) {
                return "";
            }
            this.makeupIdPathPool.put(str, f141317o + str2 + strM93479F);
        } else {
            str = id;
        }
        return this.makeupIdPathPool.get(str);
    }

    /* JADX INFO: renamed from: g */
    private final void m162141g(String id, float value) {
        if (Intrinsics.m87488d(FaceBeautyID.JAW_SHAPE, id)) {
            float f = 0.5f * value;
            this.jawShapeJawShape = f;
            LiveLightningEngineFilter liveLightningEngineFilter = this.lightFilter;
            if (liveLightningEngineFilter != null) {
                liveLightningEngineFilter.setFaceBeautyValue(FaceBeautyID.JAW_SHAPE, f + this.thinFaceJawShape);
            }
            float f2 = 0.4f * value;
            this.jawShapeShortFace = f2;
            LiveLightningEngineFilter liveLightningEngineFilter2 = this.lightFilter;
            if (liveLightningEngineFilter2 != null) {
                liveLightningEngineFilter2.setFaceBeautyValue(FaceBeautyID.SHORTEN_FACE, f2 + this.thinFaceShortFace);
            }
            float f3 = value * 0.2f;
            this.jawShapeNoseWidth = f3;
            LiveLightningEngineFilter liveLightningEngineFilter3 = this.lightFilter;
            if (liveLightningEngineFilter3 != null) {
                liveLightningEngineFilter3.setFaceBeautyValue(FaceBeautyID.NOSE_WIDTH, f3 + this.thinFaceNoseWidth + this.noseWidthNoseWidth);
                return;
            }
            return;
        }
        if (!Intrinsics.m87488d(FaceBeautyID.THIN_FACE, id)) {
            if (Intrinsics.m87488d(FaceBeautyID.BIG_EYE, id)) {
                LiveLightningEngineFilter liveLightningEngineFilter4 = this.lightFilter;
                if (liveLightningEngineFilter4 != null) {
                    liveLightningEngineFilter4.setFaceBeautyValue(FaceBeautyID.BIG_EYE, value);
                }
                LiveLightningEngineFilter liveLightningEngineFilter5 = this.lightFilter;
                if (liveLightningEngineFilter5 != null) {
                    liveLightningEngineFilter5.setFaceBeautyValue(FaceBeautyID.EYE_HEIGHT, value * 0.7f);
                    return;
                }
                return;
            }
            if (Intrinsics.m87488d(FaceBeautyID.FACE_WIDTH, id)) {
                float f4 = value * 0.5f;
                this.faceWidthFaceWidth = f4;
                LiveLightningEngineFilter liveLightningEngineFilter6 = this.lightFilter;
                if (liveLightningEngineFilter6 != null) {
                    liveLightningEngineFilter6.setFaceBeautyValue(FaceBeautyID.FACE_WIDTH, this.thinFaceFaceWidth + f4);
                    return;
                }
                return;
            }
            if (Intrinsics.m87488d(FaceBeautyID.NOSE_WIDTH, id)) {
                float f5 = value * 0.5f;
                this.noseWidthNoseWidth = f5;
                LiveLightningEngineFilter liveLightningEngineFilter7 = this.lightFilter;
                if (liveLightningEngineFilter7 != null) {
                    liveLightningEngineFilter7.setFaceBeautyValue(FaceBeautyID.NOSE_WIDTH, f5 + this.thinFaceNoseWidth + this.jawShapeNoseWidth);
                    return;
                }
                return;
            }
            if (Intrinsics.m87488d(FaceBeautyID.CHIN_LENGTH, id)) {
                float f6 = value * 0.5f;
                this.chinLengthChinLength = f6;
                LiveLightningEngineFilter liveLightningEngineFilter8 = this.lightFilter;
                if (liveLightningEngineFilter8 != null) {
                    liveLightningEngineFilter8.setFaceBeautyValue(FaceBeautyID.CHIN_LENGTH, f6 + this.thinFaceChinLength);
                    return;
                }
                return;
            }
            return;
        }
        LiveLightningEngineFilter liveLightningEngineFilter9 = this.lightFilter;
        if (liveLightningEngineFilter9 != null) {
            liveLightningEngineFilter9.setFaceBeautyValue(FaceBeautyID.THIN_FACE, value);
        }
        float f7 = 0.5f * value;
        this.thinFaceFaceWidth = f7;
        LiveLightningEngineFilter liveLightningEngineFilter10 = this.lightFilter;
        if (liveLightningEngineFilter10 != null) {
            liveLightningEngineFilter10.setFaceBeautyValue(FaceBeautyID.FACE_WIDTH, this.faceWidthFaceWidth + f7);
        }
        this.thinFaceJawShape = f7;
        LiveLightningEngineFilter liveLightningEngineFilter11 = this.lightFilter;
        if (liveLightningEngineFilter11 != null) {
            liveLightningEngineFilter11.setFaceBeautyValue(FaceBeautyID.JAW_SHAPE, this.jawShapeJawShape + f7);
        }
        float f8 = 0.6f * value;
        this.thinFaceShortFace = f8;
        LiveLightningEngineFilter liveLightningEngineFilter12 = this.lightFilter;
        if (liveLightningEngineFilter12 != null) {
            liveLightningEngineFilter12.setFaceBeautyValue(FaceBeautyID.SHORTEN_FACE, f8 + this.jawShapeShortFace);
        }
        this.thinFaceChinLength = f7;
        LiveLightningEngineFilter liveLightningEngineFilter13 = this.lightFilter;
        if (liveLightningEngineFilter13 != null) {
            liveLightningEngineFilter13.setFaceBeautyValue(FaceBeautyID.CHIN_LENGTH, this.chinLengthChinLength + f7);
        }
        float f9 = 0.3f * value;
        this.thinFaceNoseWidth = f9;
        LiveLightningEngineFilter liveLightningEngineFilter14 = this.lightFilter;
        if (liveLightningEngineFilter14 != null) {
            liveLightningEngineFilter14.setFaceBeautyValue(FaceBeautyID.NOSE_WIDTH, this.jawShapeNoseWidth + f9 + this.noseWidthNoseWidth);
        }
        LiveLightningEngineFilter liveLightningEngineFilter15 = this.lightFilter;
        if (liveLightningEngineFilter15 != null) {
            liveLightningEngineFilter15.setFaceBeautyValue(FaceBeautyID.NOSE_RIDGE_WIDTH, value * 0.55f);
        }
        LiveLightningEngineFilter liveLightningEngineFilter16 = this.lightFilter;
        if (liveLightningEngineFilter16 != null) {
            liveLightningEngineFilter16.setFaceBeautyValue(FaceBeautyID.EYE_DISTANCE, f9);
        }
        LiveLightningEngineFilter liveLightningEngineFilter17 = this.lightFilter;
        if (liveLightningEngineFilter17 != null) {
            liveLightningEngineFilter17.setFaceBeautyValue(FaceBeautyID.LIP_THICKNESS, f7);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m162142d(@NotNull String path) {
        path.getClass();
        return new File(path).exists();
    }

    /* JADX INFO: renamed from: f */
    public final void m162143f() {
        n8c.m158483a("zhc", "移除美妆 All !");
        LiveLightningEngineFilter liveLightningEngineFilter = this.lightFilter;
        if (liveLightningEngineFilter != null) {
            liveLightningEngineFilter.removeMakeupAll();
        }
        this.makeupAddedMap.clear();
    }

    /* JADX INFO: renamed from: h */
    public final void m162144h(@NotNull String id, @NotNull String key, float value) {
        id.getClass();
        key.getClass();
        String strM162146a = INSTANCE.m162146a(key);
        if (Intrinsics.m87488d(FaceBeautyID.CHIN_LENGTH, strM162146a) || Intrinsics.m87488d(FaceBeautyID.FOREHEAD, strM162146a) || Intrinsics.m87488d(FaceBeautyID.NOSE_LIFT, strM162146a)) {
            value = 0.0f - value;
        }
        if (Intrinsics.m87488d("skin_smooth", strM162146a)) {
            value *= 0.8f;
        }
        if (Intrinsics.m87488d(FaceBeautyID.JAW_SHAPE, strM162146a) || Intrinsics.m87488d(FaceBeautyID.THIN_FACE, strM162146a) || Intrinsics.m87488d(FaceBeautyID.BIG_EYE, strM162146a) || Intrinsics.m87488d(FaceBeautyID.FACE_WIDTH, strM162146a) || Intrinsics.m87488d(FaceBeautyID.NOSE_WIDTH, strM162146a) || Intrinsics.m87488d(FaceBeautyID.CHIN_LENGTH, strM162146a)) {
            m162141g(strM162146a, value);
            return;
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.lightFilter;
        if (liveLightningEngineFilter != null) {
            liveLightningEngineFilter.setFaceBeautyValue(strM162146a, value);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m162145i(@NotNull String id, @NotNull String key, float value) {
        id.getClass();
        key.getClass();
        String strM162140e = m162140e(id);
        if (strM162140e == null) {
            return false;
        }
        if (this.makeupAddedMap.containsKey(key)) {
            if (!Intrinsics.m87488d(strM162140e, this.makeupAddedMap.get(key))) {
                LiveLightningEngineFilter liveLightningEngineFilter = this.lightFilter;
                if (liveLightningEngineFilter != null) {
                    liveLightningEngineFilter.removeMakeupWithType(INSTANCE.m162147b(key));
                }
                n8c.m158483a("zhc", "update风格妆 key=" + INSTANCE.m162147b(key) + " id=" + id + " value=" + value + " addMakeup=" + strM162140e);
                LiveLightningEngineFilter liveLightningEngineFilter2 = this.lightFilter;
                if (liveLightningEngineFilter2 != null) {
                    liveLightningEngineFilter2.addMakeup(strM162140e);
                }
                this.makeupAddedMap.put(key, strM162140e);
            }
        } else {
            if (!m162142d(strM162140e)) {
                return false;
            }
            this.makeupAddedMap.put(key, strM162140e);
            n8c.m158483a("zhc", "update风格妆 key=" + INSTANCE.m162147b(key) + " id=" + id + " value=" + value + " addMakeup=" + strM162140e);
            LiveLightningEngineFilter liveLightningEngineFilter3 = this.lightFilter;
            if (liveLightningEngineFilter3 != null) {
                liveLightningEngineFilter3.addMakeup(strM162140e);
            }
        }
        StringBuilder sb = new StringBuilder("update风格妆 key=");
        Companion companion = INSTANCE;
        sb.append(companion.m162147b(key));
        sb.append(" id=");
        sb.append(id);
        sb.append(" value=");
        sb.append(value);
        sb.append("  lightFilter=");
        sb.append(this.lightFilter);
        n8c.m158483a("zhc", sb.toString());
        LiveLightningEngineFilter liveLightningEngineFilter4 = this.lightFilter;
        if (liveLightningEngineFilter4 == null) {
            return true;
        }
        liveLightningEngineFilter4.setMakeupIntensity(companion.m162147b(key), value);
        return true;
    }

    /* JADX INFO: renamed from: l.o0f$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/o0f$a;", "", "<init>", "()V", "", Constants.KEY_KEY, "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "path", "", "c", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "beautyTransfer", "Ljava/util/HashMap;", "makeupTransfer", "rootPath", "Ljava/lang/String;", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final String m162146a(@NotNull String key) {
            key.getClass();
            return (String) o0f.f141319q.get(key);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final String m162147b(@NotNull String key) {
            key.getClass();
            return (String) o0f.f141318p.get(key);
        }

        /* JADX INFO: renamed from: c */
        public final void m162148c(@NotNull String path) {
            path.getClass();
            o0f.f141317o = path;
        }

        private Companion() {
        }
    }
}
