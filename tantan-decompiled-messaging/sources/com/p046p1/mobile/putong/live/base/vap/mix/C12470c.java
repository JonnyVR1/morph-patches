package com.p046p1.mobile.putong.live.base.vap.mix;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ga80;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.vap.mix.c */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u001f\u0010\fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b\u000f\u0010.¨\u00060"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/c;", "", "Lcom/p1/mobile/putong/live/base/vap/mix/Src;", "src", "<init>", "(Lcom/p1/mobile/putong/live/base/vap/mix/Src;)V", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "id", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;", "b", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;", "getType", "()Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;", "setType", "(Lcom/p1/mobile/putong/live/base/vap/mix/Src$SrcType;)V", "type", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;", "c", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;", "getLoadType", "()Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;", "setLoadType", "(Lcom/p1/mobile/putong/live/base/vap/mix/Src$LoadType;)V", "loadType", Constants.INAPP_DATA_TAG, "setTag", "tag", "Landroid/graphics/Bitmap;", "e", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "bitmap", "Ll/ga80;", "f", "Ll/ga80;", "getCurPoint", "()Ll/ga80;", "(Ll/ga80;)V", "curPoint", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C12470c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Src.SrcType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public Src.LoadType loadType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Bitmap bitmap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ga80 curPoint;

    public C12470c(@NotNull Src src) {
        src.getClass();
        this.id = "";
        this.type = Src.SrcType.UNKNOWN;
        this.loadType = Src.LoadType.UNKNOWN;
        this.tag = "";
        this.id = src.getSrcId();
        this.type = src.getSrcType();
        this.loadType = src.getLoadType();
        this.tag = src.getSrcTag();
        this.bitmap = src.getBitmap();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: b */
    public final void m68702b(@Nullable ga80 ga80Var) {
        this.curPoint = ga80Var;
    }
}
