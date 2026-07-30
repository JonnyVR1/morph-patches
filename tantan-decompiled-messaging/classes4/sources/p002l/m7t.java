package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.increment.noble.NobleAttentionDialogView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveWealthButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.w8u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll/m7t;", "", "<init>", "()V", "Ll/x6s;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "b", "(Ll/x6s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "", "c", "(Ll/x6s;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m7t {

    @NotNull
    public static final m7t INSTANCE = new m7t();

    /* JADX INFO: renamed from: a */
    public static void m17760a(C0200a c0200a) {
        c0200a.dismiss();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m17761b(@NotNull x6s<?, ?> presenter, @NotNull BLiveGiftItem giftItem) {
        presenter.getClass();
        giftItem.getClass();
        List list = giftItem.labels;
        list.getClass();
        if (!list.isEmpty()) {
            BLiveWealthButton bLiveWealthButton = (BLiveWealthButton) presenter.m14184F3(new x5s());
            boolean z = bLiveWealthButton != null && Intrinsics.d(bLiveWealthButton.text, w8u.t(R$string.f3018T9));
            if (giftItem.labels.contains("nobleGift") && !z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.noble.NobleAttentionDialogView] */
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m17762c(@NotNull x6s<?, ?> presenter) {
        Act act;
        presenter.getClass();
        Context contextC0 = presenter.C0();
        if (contextC0 == null || (act = presenter.act()) == null) {
            return;
        }
        Object objInflate = LayoutInflater.from(contextC0).inflate(t6c0.f19508E4, (ViewGroup) null);
        objInflate.getClass();
        ?? r0 = (NobleAttentionDialogView) objInflate;
        final C0200a c0200a = new C0200a(act, r0);
        r0.m8590m0(presenter, new d30() { // from class: l.l7t
            public final void call() {
                m7t.m17760a(c0200a);
            }
        });
        c0200a.show();
    }
}
