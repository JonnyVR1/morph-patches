package p149l;

import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/rg4;", "Ll/h4;", "Ll/gol;", "card", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "<init>", "(Ll/gol;Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "", "c", "()Z", "h", "", "a", "()V", "f", "Z", "shouldShowNextLabel", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class rg4 extends AbstractC17222h4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean shouldShowNextLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg4(@NotNull gol golVar, @NotNull User user, @NotNull CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
        golVar.getClass();
        user.getClass();
        userInfo.getClass();
        this.shouldShowNextLabel = true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        User user = this.f105774a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p149l.AbstractC17222h4
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return ContainerLabelsType.boost_like_you;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getShouldShowNextLabel() {
        return this.shouldShowNextLabel;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        if (!lac0.INSTANCE.m149147b() || !C16319da.INSTANCE.m110510k() || ((!NullChecker.m81303a(this.f105775b.cardInfos) || !this.f105775b.cardInfos.boostLikeYou) && !this.f105775b.isUserLikeMe())) {
            return false;
        }
        xdl0.m208344M(this.f105776c.mo36915o0(), true);
        TextView textViewMo36939v = this.f105776c.mo36939v();
        if (textViewMo36939v != null) {
            textViewMo36939v.setTypeface(eqh0.m117752c(3), 1);
        }
        TextView textViewMo36939v2 = this.f105776c.mo36939v();
        if (textViewMo36939v2 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textViewMo36939v2.setText(String.format("%s喜欢你·来自加速配对", Arrays.copyOf(new Object[]{this.f105774a.isFemale() ? "她" : "他"}, 1)));
        }
        this.f105776c.mo36894i0();
        this.shouldShowNextLabel = false;
        return true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
