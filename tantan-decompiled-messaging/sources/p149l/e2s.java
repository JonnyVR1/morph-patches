package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.data.InAppPromptRecommendInfo;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ%\u0010\u000f\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0012\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m87232d2 = {"Ll/e2s;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "loads", "", "Lcom/p1/mobile/putong/data/Live;", "lives", "", "b", "(Ljava/util/List;Ljava/util/List;)V", "c", "live", "a", "(Ljava/util/List;Lcom/p1/mobile/putong/data/Live;)V", "", "Z", Constants.INAPP_DATA_TAG, "()Z", "e", "(Z)V", "isLivingCardAdapt$annotations", "isLivingCardAdapt", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class e2s {

    @NotNull
    public static final e2s INSTANCE = new e2s();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isLivingCardAdapt;

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m114522b(@NotNull List<? extends CoreSuggested.UserInfo> loads, @Nullable List<Live> lives) {
        loads.getClass();
        List<Live> list = lives;
        if (list == null || list.isEmpty() || upa.m194794o1()) {
            return;
        }
        INSTANCE.m114526c(loads, lives);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m114523d() {
        return isLivingCardAdapt;
    }

    /* JADX INFO: renamed from: e */
    public static final void m114524e(boolean z) {
        isLivingCardAdapt = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m114525a(List<? extends CoreSuggested.UserInfo> loads, Live live) {
        String str;
        String str2;
        for (CoreSuggested.UserInfo userInfo : loads) {
            if (userInfo.f19472id.equals(live.anchor.f38803id)) {
                String str3 = userInfo.f19472id;
                Media media = live.coverPicUrl;
                if (media != null && (str2 = media.url) != null) {
                    qib0.f154691G.m102311A0(str2);
                }
                Media media2 = live.videoCapture;
                if (media2 != null && (str = media2.url) != null) {
                    qib0.m174796U0(str);
                }
                userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
                str3.getClass();
                userInfo.liveLivingCardDataWrapper = new LiveLivingCardDataWrapper(str3, live, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m114526c(List<? extends CoreSuggested.UserInfo> loads, List<Live> lives) {
        InAppPromptRecommendInfo inAppPromptRecommendInfo;
        for (Live live : lives) {
            Media media = live.videoCapture;
            if (media != null) {
                String str = media.url;
                str.getClass();
                if (str.length() > 0 && (inAppPromptRecommendInfo = live.recommendInfo.inAppPrompt) != null && !TextUtils.isEmpty(inAppPromptRecommendInfo.title)) {
                    INSTANCE.m114525a(loads, live);
                }
            }
        }
    }
}
