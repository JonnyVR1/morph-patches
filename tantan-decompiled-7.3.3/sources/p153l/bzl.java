package p153l;

import android.graphics.Color;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p051p1.mobile.putong.data.Picture;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u000f¨\u0006\u001fÀ\u0006\u0003"}, m88121d2 = {"Ll/bzl;", "", "Ll/j8y;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/j8y;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "e", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface bzl {
    /* JADX INFO: renamed from: a */
    void mo107167a(@NotNull MeetEntranceModel viewModel, @NotNull BusinessConversationView _view);

    /* JADX INFO: renamed from: b */
    boolean mo107168b(@NotNull j8y meetEntranceData, boolean acceleratePairStrategyEnable);

    /* JADX INFO: renamed from: c */
    boolean mo107169c();

    @NotNull
    /* JADX INFO: renamed from: d */
    default String mo107170d() {
        return "default";
    }

    /* JADX INFO: renamed from: e */
    default int mo107171e() {
        return gra.m131778z() ? Color.parseColor("#FF700A") : Color.parseColor("#FE7E1D");
    }

    /* JADX INFO: renamed from: f */
    int mo107172f();

    @NotNull
    /* JADX INFO: renamed from: g */
    CharSequence mo107173g();

    @Nullable
    Picture.ImageUri getAvatar();

    @NotNull
    CharSequence getTitle();
}
