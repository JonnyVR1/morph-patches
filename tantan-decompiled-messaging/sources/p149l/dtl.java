package p149l;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, m87232d2 = {"Ll/dtl;", "", "", "getTop", "()I", "Landroid/view/View;", "outAvatar", "Lv/VImage;", "outIcon", "Lv/VText;", "outName", "scrollY", "", "b", "(Landroid/view/View;Lv/VImage;Lv/VText;I)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "isAnonymous", "c", "(Lcom/p1/mobile/putong/data/User;Z)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnAvatarClickListener", "(Landroid/view/View$OnClickListener;)V", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface dtl {
    /* JADX INFO: renamed from: b */
    void mo46154b(@NotNull View outAvatar, @NotNull VImage outIcon, @NotNull VText outName, int scrollY);

    /* JADX INFO: renamed from: c */
    void mo46155c(@NotNull User user, boolean isAnonymous);

    int getTop();

    void setOnAvatarClickListener(@Nullable View.OnClickListener listener);
}
