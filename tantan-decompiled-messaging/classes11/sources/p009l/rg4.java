package p009l;

import android.widget.TextView;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.da;
import l.eqh0;
import l.lac0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll/rg4;", "Ll/h4;", "Ll/gol;", "card", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "<init>", "(Ll/gol;Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)V", "", "d", "()Ljava/lang/String;", "", "c", "()Z", "h", "", "a", "()V", "f", "Z", "shouldShowNextLabel", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rg4 extends AbstractC0925h4 {

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

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        User user = this.f13854a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p009l.AbstractC0925h4
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "boost_like_you";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getShouldShowNextLabel() {
        return this.shouldShowNextLabel;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        if (!lac0.Companion.b() || !da.Companion.k() || ((!NullChecker.a(this.f13855b.cardInfos) || !this.f13855b.cardInfos.boostLikeYou) && !this.f13855b.isUserLikeMe())) {
            return false;
        }
        xdl0.M(this.f13856c.mo880o0(), true);
        TextView textViewMo906v = this.f13856c.mo906v();
        if (textViewMo906v != null) {
            textViewMo906v.setTypeface(eqh0.c(3), 1);
        }
        TextView textViewMo906v2 = this.f13856c.mo906v();
        if (textViewMo906v2 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textViewMo906v2.setText(String.format("%s喜欢你·来自加速配对", Arrays.copyOf(new Object[]{this.f13854a.isFemale() ? "她" : "他"}, 1)));
        }
        this.f13856c.mo857i0();
        this.shouldShowNextLabel = false;
        return true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
