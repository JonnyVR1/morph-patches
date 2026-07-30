package p149l;

import android.graphics.drawable.Animatable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m87232d2 = {"Ll/vgm;", "Ll/ei2;", "", "Ll/wgm;", "imageLoadingTimeListener", "<init>", "(Ll/wgm;)V", "", "id", "callerContext", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "e", "(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V", "b", "Ll/wgm;", "", "J", "requestSubmitTimeMs", Constants.INAPP_DATA_TAG, "finalImageSetTimeMs", "drawee_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class vgm extends ei2<Object> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final wgm imageLoadingTimeListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long requestSubmitTimeMs = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long finalImageSetTimeMs = -1;

    public vgm(@Nullable wgm wgmVar) {
        this.imageLoadingTimeListener = wgmVar;
    }

    @Override // p149l.ei2, p149l.q26
    /* JADX INFO: renamed from: c */
    public void mo116619c(@NotNull String id, @Nullable Object callerContext) {
        id.getClass();
        this.requestSubmitTimeMs = System.currentTimeMillis();
    }

    @Override // p149l.ei2, p149l.q26
    /* JADX INFO: renamed from: e */
    public void mo8234e(@NotNull String id, @Nullable Object imageInfo, @Nullable Animatable animatable) {
        id.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.finalImageSetTimeMs = jCurrentTimeMillis;
        wgm wgmVar = this.imageLoadingTimeListener;
        if (wgmVar != null) {
            wgmVar.mo134962a(jCurrentTimeMillis - this.requestSubmitTimeMs);
        }
    }
}
