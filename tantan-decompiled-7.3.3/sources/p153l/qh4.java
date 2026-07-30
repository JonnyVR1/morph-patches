package p153l;

import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/qh4;", "Ll/h4;", "Ll/rql;", "card", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "<init>", "(Ll/rql;Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "", "c", "()Z", "h", "", "a", "()V", "f", "Z", "shouldShowNextLabel", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qh4 extends AbstractC17382h4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean shouldShowNextLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh4(@NotNull rql rqlVar, @NotNull User user, @NotNull CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
        rqlVar.getClass();
        user.getClass();
        userInfo.getClass();
        this.shouldShowNextLabel = true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        User user = this.f107713a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p153l.AbstractC17382h4
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return ContainerLabelsType.boost_like_you;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getShouldShowNextLabel() {
        return this.shouldShowNextLabel;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        if (!ric0.INSTANCE.m181594b() || !C21545y9.INSTANCE.m214797k() || ((!NullChecker.m82486a(this.f107714b.cardInfos) || !this.f107714b.cardInfos.boostLikeYou) && !this.f107714b.isUserLikeMe())) {
            return false;
        }
        bnl0.m105524M(this.f107715c.mo37918o0(), true);
        TextView textViewMo37942v = this.f107715c.mo37942v();
        if (textViewMo37942v != null) {
            textViewMo37942v.setTypeface(lyh0.m156283c(3), 1);
        }
        TextView textViewMo37942v2 = this.f107715c.mo37942v();
        if (textViewMo37942v2 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textViewMo37942v2.setText(String.format("%s喜欢你·来自加速配对", Arrays.copyOf(new Object[]{this.f107713a.isFemale() ? "她" : "他"}, 1)));
        }
        this.f107715c.mo37897i0();
        this.shouldShowNextLabel = false;
        return true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
