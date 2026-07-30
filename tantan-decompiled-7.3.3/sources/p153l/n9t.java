package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.increment.noble.NobleAttentionDialogView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/n9t;", "", "<init>", "()V", "Ll/y8s;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "b", "(Ll/y8s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "", "c", "(Ll/y8s;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class n9t {

    @NotNull
    public static final n9t INSTANCE = new n9t();

    /* JADX INFO: renamed from: a */
    public static void m162044a(DialogC12774a dialogC12774a) {
        dialogC12774a.dismiss();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m162045b(@NotNull y8s<?, ?> presenter, @NotNull BLiveGiftItem giftItem) {
        presenter.getClass();
        giftItem.getClass();
        List<String> list = giftItem.labels;
        list.getClass();
        if (!list.isEmpty()) {
            BLiveWealthButton bLiveWealthButton = (BLiveWealthButton) presenter.m138856F3(new y7s());
            boolean z = bLiveWealthButton != null && Intrinsics.m88377d(bLiveWealthButton.text, xau.m209910t(R$string.f47824T9));
            if (giftItem.labels.contains("nobleGift") && !z) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m162046c(@NotNull y8s<?, ?> presenter) {
        Act act;
        presenter.getClass();
        Context contextM113230C0 = presenter.m113230C0();
        if (contextM113230C0 == null || (act = presenter.act()) == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(contextM113230C0).inflate(yec0.f198744E4, (ViewGroup) null);
        viewInflate.getClass();
        NobleAttentionDialogView nobleAttentionDialogView = (NobleAttentionDialogView) viewInflate;
        final DialogC12774a dialogC12774a = new DialogC12774a(act, nobleAttentionDialogView);
        nobleAttentionDialogView.m76167m0(presenter, new x20() { // from class: l.m9t
            @Override // p153l.x20
            public final void call() {
                n9t.m162044a(dialogC12774a);
            }
        });
        dialogC12774a.show();
    }
}
