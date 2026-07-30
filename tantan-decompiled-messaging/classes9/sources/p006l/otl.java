package p006l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import l.mcr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Ll/otl;", "Ll/mcr;", "", "notifyDataSetChanged", "()V", "", "O2", "()I", "Lcom/p1/mobile/putong/data/User;", "item", "", "liked", "A1", "(Lcom/p1/mobile/putong/data/User;Z)Z", "Lcom/p1/mobile/android/app/Act;", "act", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface otl extends mcr {
    /* JADX INFO: renamed from: A1 */
    boolean mo10016A1(@NotNull User item, boolean liked);

    /* JADX INFO: renamed from: O2 */
    int mo10019O2();

    @NotNull
    Act act();

    void notifyDataSetChanged();
}
