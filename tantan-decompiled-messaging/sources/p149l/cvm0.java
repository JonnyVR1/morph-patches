package p149l;

import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.data.Voice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ%\u0010\u000f\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/cvm0;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "loads", "", "Lcom/p1/mobile/putong/core/data/Voice;", "voices", "", "b", "(Ljava/util/List;Ljava/util/List;)V", "c", "voice", "a", "(Ljava/util/List;Lcom/p1/mobile/putong/core/data/Voice;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class cvm0 {

    @NotNull
    public static final cvm0 INSTANCE = new cvm0();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m108885b(@NotNull List<? extends CoreSuggested.UserInfo> loads, @Nullable List<Voice> voices) {
        loads.getClass();
        List<Voice> list = voices;
        if (list == null || list.isEmpty()) {
            return;
        }
        INSTANCE.m108887c(loads, voices);
    }

    /* JADX INFO: renamed from: a */
    public final void m108886a(List<? extends CoreSuggested.UserInfo> loads, Voice voice) {
        for (CoreSuggested.UserInfo userInfo : loads) {
            if (userInfo.f19472id.equals(voice.userId)) {
                String str = voice.userId;
                str.getClass();
                userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
                userInfo.liveLivingCardDataWrapper = new LiveLivingCardDataWrapper(str, null, voice);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m108887c(List<? extends CoreSuggested.UserInfo> loads, List<Voice> voices) {
        if (voices != null) {
            for (Voice voice : voices) {
                String str = voice.voiceRoomId;
                str.getClass();
                if (str.length() > 0) {
                    String str2 = voice.userId;
                    str2.getClass();
                    if (str2.length() > 0) {
                        INSTANCE.m108886a(loads, voice);
                    }
                }
            }
        }
    }
}
