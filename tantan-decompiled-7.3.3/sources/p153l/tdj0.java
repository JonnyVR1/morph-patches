package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon;
import com.google.android.exoplayer2.PlaybackException;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/tdj0;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/wmj;", SocialConstants.TYPE_REQUEST, "Ll/vmj;", "c", "(Ll/wmj;)Ll/vmj;", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 5)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class tdj0 extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public tdj0(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) rdj0.class);
        systemService.getClass();
        super((rdj0) systemService);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    @NotNull
    /* JADX INFO: renamed from: c */
    public vmj mo3219c(@NotNull wmj request) {
        request.getClass();
        new vmj.C20856a().m201745b(request.getAdsSdkName()).m201746c(request.getShouldRecordObservation()).m201744a();
        throw null;
    }
}
