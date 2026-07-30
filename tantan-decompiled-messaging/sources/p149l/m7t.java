package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.increment.noble.NobleAttentionDialogView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/m7t;", "", "<init>", "()V", "Ll/x6s;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "b", "(Ll/x6s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "", "c", "(Ll/x6s;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class m7t {

    @NotNull
    public static final m7t INSTANCE = new m7t();

    /* JADX INFO: renamed from: a */
    public static void m153418a(DialogC12611a dialogC12611a) {
        dialogC12611a.dismiss();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m153419b(@NotNull x6s<?, ?> presenter, @NotNull BLiveGiftItem giftItem) {
        presenter.getClass();
        giftItem.getClass();
        List<String> list = giftItem.labels;
        list.getClass();
        if (!list.isEmpty()) {
            BLiveWealthButton bLiveWealthButton = (BLiveWealthButton) presenter.m129297F3(new x5s());
            boolean z = bLiveWealthButton != null && Intrinsics.m87488d(bLiveWealthButton.text, w8u.m202217t(R$string.f46976T9));
            if (giftItem.labels.contains("nobleGift") && !z) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m153420c(@NotNull x6s<?, ?> presenter) {
        Act act;
        presenter.getClass();
        Context contextM104249C0 = presenter.m104249C0();
        if (contextM104249C0 == null || (act = presenter.act()) == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(contextM104249C0).inflate(t6c0.f168012E4, (ViewGroup) null);
        viewInflate.getClass();
        NobleAttentionDialogView nobleAttentionDialogView = (NobleAttentionDialogView) viewInflate;
        final DialogC12611a dialogC12611a = new DialogC12611a(act, nobleAttentionDialogView);
        nobleAttentionDialogView.m74984m0(presenter, new d30() { // from class: l.l7t
            @Override // p149l.d30
            public final void call() {
                m7t.m153418a(dialogC12611a);
            }
        });
        dialogC12611a.show();
    }
}
