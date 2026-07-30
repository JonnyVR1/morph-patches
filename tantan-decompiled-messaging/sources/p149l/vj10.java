package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m87232d2 = {"Ll/vj10;", "Ll/uim;", "", "maxBitmapSize", "", "useDownSamplingRatio", "primaryImageTranscoderFactory", "imageTranscoderType", "ensureTranscoderLibraryLoaded", "<init>", "(IZLl/uim;Ljava/lang/Integer;Z)V", "Ll/egm;", "imageFormat", "isResizingEnabled", "Ll/tim;", "createImageTranscoder", "(Ll/egm;Z)Ll/tim;", "a", "c", Constants.INAPP_DATA_TAG, "b", "I", "Z", "Ll/uim;", "Ljava/lang/Integer;", "e", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class vj10 implements uim {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxBitmapSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean useDownSamplingRatio;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final uim primaryImageTranscoderFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Integer imageTranscoderType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean ensureTranscoderLibraryLoaded;

    public vj10(int i, boolean z, @Nullable uim uimVar, @Nullable Integer num, boolean z2) {
        this.maxBitmapSize = i;
        this.useDownSamplingRatio = z;
        this.primaryImageTranscoderFactory = uimVar;
        this.imageTranscoderType = num;
        this.ensureTranscoderLibraryLoaded = z2;
    }

    /* JADX INFO: renamed from: a */
    public final tim m198615a(egm imageFormat, boolean isResizingEnabled) {
        uim uimVar = this.primaryImageTranscoderFactory;
        if (uimVar != null) {
            return uimVar.createImageTranscoder(imageFormat, isResizingEnabled);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final tim m198616b(egm imageFormat, boolean isResizingEnabled) {
        Integer num = this.imageTranscoderType;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return m198617c(imageFormat, isResizingEnabled);
        }
        if (num != null && num.intValue() == 1) {
            return m198618d(imageFormat, isResizingEnabled);
        }
        ig3.m135964a("Invalid ImageTranscoderType");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final tim m198617c(egm imageFormat, boolean isResizingEnabled) {
        return g620.m124551a(this.maxBitmapSize, this.useDownSamplingRatio, this.ensureTranscoderLibraryLoaded).createImageTranscoder(imageFormat, isResizingEnabled);
    }

    @Override // p149l.uim
    @NotNull
    public tim createImageTranscoder(@NotNull egm imageFormat, boolean isResizingEnabled) {
        imageFormat.getClass();
        tim timVarM198615a = m198615a(imageFormat, isResizingEnabled);
        if (timVarM198615a == null) {
            timVarM198615a = m198616b(imageFormat, isResizingEnabled);
        }
        if (timVarM198615a == null && a620.m95107a()) {
            timVarM198615a = m198617c(imageFormat, isResizingEnabled);
        }
        return timVarM198615a == null ? m198618d(imageFormat, isResizingEnabled) : timVarM198615a;
    }

    /* JADX INFO: renamed from: d */
    public final tim m198618d(egm imageFormat, boolean isResizingEnabled) {
        tim timVarCreateImageTranscoder = new sgf0(this.maxBitmapSize).createImageTranscoder(imageFormat, isResizingEnabled);
        timVarCreateImageTranscoder.getClass();
        return timVarCreateImageTranscoder;
    }
}
