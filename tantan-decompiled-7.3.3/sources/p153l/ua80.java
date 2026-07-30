package p153l;

import android.view.View;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\t2\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/ua80;", "", "<init>", "()V", "Landroid/view/View;", "muteView", "Ll/i6t;", "Ll/dw40;", "pkPresenter", "", "b", "(Landroid/view/View;Ll/i6t;)V", "", "isMute", "a", "(Ll/i6t;Z)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ua80 {

    @NotNull
    public static final ua80 INSTANCE = new ua80();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m195159a(@NotNull i6t<dw40, ?> pkPresenter, boolean isMute) {
        String str;
        pkPresenter.getClass();
        User userM168532l0 = pkPresenter.m213810E2().m168532l0();
        if (userM168532l0 == null || (str = userM168532l0.f56859id) == null) {
            str = "";
        }
        i4g0.m138523u("e_live_pk_mute_button", pkPresenter.mo78457R2(), jyb.m147494Y("anchorId", str), jyb.m147494Y("ismute", Boolean.valueOf(isMute)), jyb.m147494Y("liveId", pkPresenter.m213810E2().m202191k()));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m195160b(@NotNull View muteView, @NotNull i6t<dw40, ?> pkPresenter) {
        String str;
        muteView.getClass();
        pkPresenter.getClass();
        if (bnl0.m105529O0(muteView)) {
            return;
        }
        User userM168532l0 = pkPresenter.m213810E2().m168532l0();
        if (userM168532l0 == null || (str = userM168532l0.f56859id) == null) {
            str = "";
        }
        i4g0.m138492A("e_live_pk_mute_button", pkPresenter.mo78457R2(), jyb.m147494Y("anchorId", str), jyb.m147494Y("liveId", pkPresenter.m213810E2().m202191k()));
    }
}
