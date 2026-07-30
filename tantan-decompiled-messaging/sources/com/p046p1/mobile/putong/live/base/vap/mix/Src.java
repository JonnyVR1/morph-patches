package com.p046p1.mobile.putong.live.base.vap.mix;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.C21588z0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 O2\u00020\u0001:\u0005\tPQRSB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010\"\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\"\u0010$\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b#\u0010\u0019R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00102\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010.\u001a\u0004\b\u001e\u0010/\"\u0004\b0\u00101R\"\u00105\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010\u0011R\"\u00108\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u0011R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010B\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\bA\u0010\u0019R\"\u0010H\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010D\u001a\u0004\b&\u0010E\"\u0004\bF\u0010GR\"\u0010J\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0015\u001a\u0004\b@\u0010\u0017\"\u0004\bI\u0010\u0019R.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010K\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010L\u001a\u0004\b\u0014\u0010M\"\u0004\bN\u0010\n¨\u0006T"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/Src;", "", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "(Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "setSrcId", "(Ljava/lang/String;)V", "srcId", "", "b", "I", "o", "()I", "setW", "(I)V", "w", "c", "g", "setH", "h", Constants.INAPP_DATA_TAG, "e", "setDrawWidth", "drawWidth", "setDrawHeight", "drawHeight", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;", "f", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;", "setSrcType", "(Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;)V", "srcType", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;", "()Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;", "setLoadType", "(Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;)V", "loadType", "j", "setSrcTag", "srcTag", "n", "r", "txt", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$Style;", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$Style;", "m", "()Lcom/p1/mobile/putong/live/base/vap/mix/Src$Style;", "setStyle", "(Lcom/p1/mobile/putong/live/base/vap/mix/Src$Style;)V", "style", "k", "setColor", "color", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;", "()Lcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;", "setFitType", "(Lcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;)V", "fitType", "q", "srcTextureId", "value", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "p", "Companion", "SrcType", "LoadType", "FitType", "Style", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class Src {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String srcId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int w;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int h;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int drawWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int drawHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public SrcType srcType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public LoadType loadType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public String srcTag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String txt;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public Style style;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int color;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public FitType fitType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int srcTextureId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Bitmap bitmap;

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "FIT_XY", "CENTER_FULL", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum FitType {
        FIT_XY("fitXY"),
        CENTER_FULL("centerFull");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        private final String type;

        FitType(String str) {
            this.type = str;
        }

        @NotNull
        public static EnumEntries<FitType> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "UNKNOWN", "NET", "LOCAL", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum LoadType {
        UNKNOWN("unknown"),
        NET("net"),
        LOCAL("local");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        private final String type;

        LoadType(String str) {
            this.type = str;
        }

        @NotNull
        public static EnumEntries<LoadType> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "UNKNOWN", "IMG", "TXT", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum SrcType {
        UNKNOWN("unknown"),
        IMG("img"),
        TXT("txt");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        private final String type;

        SrcType(String str) {
            this.type = str;
        }

        @NotNull
        public static EnumEntries<SrcType> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/Src$Style;", "", "style", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStyle", "()Ljava/lang/String;", RelationshipStatus.DEFAULT, "BOLD", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum Style {
        DEFAULT("default"),
        BOLD("b");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        private final String style;

        Style(String str) {
            this.style = str;
        }

        @NotNull
        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getStyle() {
            return this.style;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0094 A[PHI: r5
      0x0094: PHI (r5v17 com.p1.mobile.putong.live.base.vap.mix.Src$LoadType) = 
      (r5v14 com.p1.mobile.putong.live.base.vap.mix.Src$LoadType)
      (r5v15 com.p1.mobile.putong.live.base.vap.mix.Src$LoadType)
     binds: [B:13:0x0092, B:16:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0071 A[PHI: r7
      0x0071: PHI (r7v6 com.p1.mobile.putong.live.base.vap.mix.Src$SrcType) = (r7v1 com.p1.mobile.putong.live.base.vap.mix.Src$SrcType), (r7v2 com.p1.mobile.putong.live.base.vap.mix.Src$SrcType) binds: [B:7:0x006f, B:10:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    public Src(@NotNull JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        this.srcId = "";
        SrcType srcType = SrcType.UNKNOWN;
        this.srcType = srcType;
        LoadType loadType = LoadType.UNKNOWN;
        this.loadType = loadType;
        this.srcTag = "";
        this.txt = "";
        Style style = Style.DEFAULT;
        this.style = style;
        FitType fitType = FitType.FIT_XY;
        this.fitType = fitType;
        String string = jSONObject.getString("srcId");
        string.getClass();
        this.srcId = string;
        this.w = jSONObject.getInt("w");
        this.h = jSONObject.getInt("h");
        String str = Constants.BLACK;
        String strOptString = jSONObject.optString("color", Constants.BLACK);
        strOptString.getClass();
        str = strOptString.length() != 0 ? strOptString : str;
        this.color = Color.parseColor(str);
        String string2 = jSONObject.getString("srcTag");
        string2.getClass();
        this.srcTag = string2;
        this.txt = string2;
        String string3 = jSONObject.getString("srcType");
        SrcType srcType2 = SrcType.IMG;
        if (!Intrinsics.m87488d(string3, srcType2.getType())) {
            srcType2 = SrcType.TXT;
            srcType = Intrinsics.m87488d(string3, srcType2.getType()) ? srcType2 : srcType;
        }
        this.srcType = srcType;
        String string4 = jSONObject.getString("loadType");
        LoadType loadType2 = LoadType.NET;
        if (!Intrinsics.m87488d(string4, loadType2.getType())) {
            loadType2 = LoadType.LOCAL;
            loadType = Intrinsics.m87488d(string4, loadType2.getType()) ? loadType2 : loadType;
        }
        this.loadType = loadType;
        String string5 = jSONObject.getString("fitType");
        FitType fitType2 = FitType.CENTER_FULL;
        this.fitType = Intrinsics.m87488d(string5, fitType2.getType()) ? fitType2 : fitType;
        String strOptString2 = jSONObject.optString("style", "");
        Style style2 = Style.BOLD;
        this.style = Intrinsics.m87488d(strOptString2, style2.getStyle()) ? style2 : style;
        C21588z0.INSTANCE.m216709d("AnimPlayer.Src", this + " color=" + str);
    }

    /* JADX INFO: renamed from: a */
    public final void m68649a(Bitmap bitmap) {
        int i;
        int i2;
        int width = bitmap != null ? bitmap.getWidth() : this.w;
        int height = bitmap != null ? bitmap.getHeight() : this.h;
        this.drawWidth = width;
        this.drawHeight = height;
        if (this.fitType != FitType.CENTER_FULL || (i = this.w) == 0 || (i2 = this.h) == 0) {
            return;
        }
        float f = width / height;
        if (f >= i / i2) {
            this.drawHeight = i2;
            this.drawWidth = (int) (i2 * f);
        } else {
            this.drawWidth = i;
            this.drawHeight = (int) (i / f);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDrawHeight() {
        return this.drawHeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDrawWidth() {
        return this.drawWidth;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final FitType getFitType() {
        return this.fitType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getH() {
        return this.h;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final LoadType getLoadType() {
        return this.loadType;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSrcId() {
        return this.srcId;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSrcTag() {
        return this.srcTag;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSrcTextureId() {
        return this.srcTextureId;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final SrcType getSrcType() {
        return this.srcType;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTxt() {
        return this.txt;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: p */
    public final void m68664p(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
        m68649a(bitmap);
    }

    /* JADX INFO: renamed from: q */
    public final void m68665q(int i) {
        this.srcTextureId = i;
    }

    /* JADX INFO: renamed from: r */
    public final void m68666r(@NotNull String str) {
        str.getClass();
        this.txt = str;
    }

    @NotNull
    public String toString() {
        return "Src(srcId='" + this.srcId + "', srcType=" + this.srcType + ", loadType=" + this.loadType + ", srcTag='" + this.srcTag + "', bitmap=" + this.bitmap + ", txt='" + this.txt + "')";
    }
}
