package p149l;

import android.view.View;
import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\t2\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/o280;", "", "<init>", "()V", "Landroid/view/View;", "muteView", "Ll/h4t;", "Ll/pn40;", "pkPresenter", "", "b", "(Landroid/view/View;Ll/h4t;)V", "", "isMute", "a", "(Ll/h4t;Z)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class o280 {

    @NotNull
    public static final o280 INSTANCE = new o280();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m162288a(@NotNull h4t<pn40, ?> pkPresenter, boolean isMute) {
        String str;
        pkPresenter.getClass();
        User userM132146l0 = pkPresenter.m206027E2().m132146l0();
        if (userM132146l0 == null || (str = userM132146l0.f56011id) == null) {
            str = "";
        }
        zvf0.m220399u("e_live_pk_mute_button", pkPresenter.mo77274R2(), vwb.m200311Y("anchorId", str), vwb.m200311Y("ismute", Boolean.valueOf(isMute)), vwb.m200311Y("liveId", pkPresenter.m206027E2().m149814k()));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m162289b(@NotNull View muteView, @NotNull h4t<pn40, ?> pkPresenter) {
        String str;
        muteView.getClass();
        pkPresenter.getClass();
        if (xdl0.m208349O0(muteView)) {
            return;
        }
        User userM132146l0 = pkPresenter.m206027E2().m132146l0();
        if (userM132146l0 == null || (str = userM132146l0.f56011id) == null) {
            str = "";
        }
        zvf0.m220368A("e_live_pk_mute_button", pkPresenter.mo77274R2(), vwb.m200311Y("anchorId", str), vwb.m200311Y("liveId", pkPresenter.m206027E2().m149814k()));
    }
}
