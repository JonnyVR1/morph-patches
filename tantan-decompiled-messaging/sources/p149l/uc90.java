package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p046p1.mobile.putong.data.ResourceDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m87232d2 = {"Ll/uc90;", "Ll/vvk;", "Ll/vc90;", "callbacks", "", "q", "(Ll/vc90;)V", "", "origin", "subcategory", "u", "(Ljava/lang/String;Ljava/lang/String;)V", "B", "(Ljava/lang/String;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", Constants.KEY_T, "()Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "getId", "()Ljava/lang/String;", "id", ResourceDirection.f38808v, "uiComponentId", "Ll/yc90;", "n", "()Ll/yc90;", "producerListener", "", "k", "()Ljava/lang/Object;", "callerContext", "Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "I", "()Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "lowestPermittedRequestLevel", "", "H", "()Z", "isPrefetch", "Lcom/facebook/imagepipeline/common/Priority;", "getPriority", "()Lcom/facebook/imagepipeline/common/Priority;", "priority", "F", "isIntermediateResultExpected", "Ll/qhm;", "m", "()Ll/qhm;", "imagePipelineConfig", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface uc90 extends vvk {
    /* JADX INFO: renamed from: B */
    void mo155857B(@Nullable String origin);

    /* JADX INFO: renamed from: F */
    boolean mo155858F();

    /* JADX INFO: renamed from: H */
    boolean mo155859H();

    @NotNull
    /* JADX INFO: renamed from: I */
    ImageRequest.RequestLevel mo155860I();

    @NotNull
    String getId();

    @NotNull
    Priority getPriority();

    @NotNull
    /* JADX INFO: renamed from: k */
    Object mo155867k();

    @NotNull
    /* JADX INFO: renamed from: m */
    qhm mo155869m();

    @NotNull
    /* JADX INFO: renamed from: n */
    yc90 mo155870n();

    /* JADX INFO: renamed from: q */
    void mo155872q(@NotNull vc90 callbacks);

    @NotNull
    /* JADX INFO: renamed from: t */
    ImageRequest mo155873t();

    /* JADX INFO: renamed from: u */
    void mo155874u(@Nullable String origin, @Nullable String subcategory);

    @Nullable
    /* JADX INFO: renamed from: v */
    String mo155875v();
}
