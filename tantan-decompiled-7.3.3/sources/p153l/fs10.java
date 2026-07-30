package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m88121d2 = {"Ll/fs10;", "Ll/xkm;", "", "maxBitmapSize", "", "useDownSamplingRatio", "primaryImageTranscoderFactory", "imageTranscoderType", "ensureTranscoderLibraryLoaded", "<init>", "(IZLl/xkm;Ljava/lang/Integer;Z)V", "Ll/him;", "imageFormat", "isResizingEnabled", "Ll/wkm;", "createImageTranscoder", "(Ll/him;Z)Ll/wkm;", "a", "c", Constants.INAPP_DATA_TAG, "b", "I", "Z", "Ll/xkm;", "Ljava/lang/Integer;", "e", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class fs10 implements xkm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxBitmapSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean useDownSamplingRatio;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final xkm primaryImageTranscoderFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Integer imageTranscoderType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean ensureTranscoderLibraryLoaded;

    public fs10(int i, boolean z, @Nullable xkm xkmVar, @Nullable Integer num, boolean z2) {
        this.maxBitmapSize = i;
        this.useDownSamplingRatio = z;
        this.primaryImageTranscoderFactory = xkmVar;
        this.imageTranscoderType = num;
        this.ensureTranscoderLibraryLoaded = z2;
    }

    /* JADX INFO: renamed from: a */
    public final wkm m127014a(him imageFormat, boolean isResizingEnabled) {
        xkm xkmVar = this.primaryImageTranscoderFactory;
        if (xkmVar != null) {
            return xkmVar.createImageTranscoder(imageFormat, isResizingEnabled);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final wkm m127015b(him imageFormat, boolean isResizingEnabled) {
        Integer num = this.imageTranscoderType;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return m127016c(imageFormat, isResizingEnabled);
        }
        if (num != null && num.intValue() == 1) {
            return m127017d(imageFormat, isResizingEnabled);
        }
        wg3.m206174a("Invalid ImageTranscoderType");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final wkm m127016c(him imageFormat, boolean isResizingEnabled) {
        return oe20.m167350a(this.maxBitmapSize, this.useDownSamplingRatio, this.ensureTranscoderLibraryLoaded).createImageTranscoder(imageFormat, isResizingEnabled);
    }

    @Override // p153l.xkm
    @NotNull
    public wkm createImageTranscoder(@NotNull him imageFormat, boolean isResizingEnabled) {
        imageFormat.getClass();
        wkm wkmVarM127014a = m127014a(imageFormat, isResizingEnabled);
        if (wkmVarM127014a == null) {
            wkmVarM127014a = m127015b(imageFormat, isResizingEnabled);
        }
        if (wkmVarM127014a == null && ie20.m139588a()) {
            wkmVarM127014a = m127016c(imageFormat, isResizingEnabled);
        }
        return wkmVarM127014a == null ? m127017d(imageFormat, isResizingEnabled) : wkmVarM127014a;
    }

    /* JADX INFO: renamed from: d */
    public final wkm m127017d(him imageFormat, boolean isResizingEnabled) {
        wkm wkmVarCreateImageTranscoder = new apf0(this.maxBitmapSize).createImageTranscoder(imageFormat, isResizingEnabled);
        wkmVarCreateImageTranscoder.getClass();
        return wkmVarCreateImageTranscoder;
    }
}
