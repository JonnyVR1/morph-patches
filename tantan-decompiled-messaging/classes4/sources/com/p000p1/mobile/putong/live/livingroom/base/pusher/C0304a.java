package com.p000p1.mobile.putong.live.livingroom.base.pusher;

import android.widget.ImageView;
import com.p1.mobile.putong.api.api.Network;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p002l.i3c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.base.pusher.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/base/pusher/a;", "", "<init>", "()V", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0304a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.base.pusher.a$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/base/pusher/a$a;", "", "<init>", "()V", "Landroid/widget/ImageView;", "iconView", "", "a", "(Landroid/widget/ImageView;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m5369a(@NotNull ImageView iconView) {
            iconView.getClass();
            String strLanguage = Network.language();
            if (Intrinsics.d("zh-Hans", strLanguage) || Intrinsics.d("zh-Hant", strLanguage)) {
                return;
            }
            iconView.setImageResource(i3c0.f12621Q8);
        }

        public Companion() {
        }
    }
}
