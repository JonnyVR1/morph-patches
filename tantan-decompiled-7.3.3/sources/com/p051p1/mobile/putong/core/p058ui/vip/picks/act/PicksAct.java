package com.p051p1.mobile.putong.core.p058ui.vip.picks.act;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.PutongFragAct;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksAct;", "Lcom/p1/mobile/putong/core/PutongFragAct;", "<init>", "()V", "", "pageId", "()Ljava/lang/String;", "Lcom/p1/mobile/android/app/Frag;", "Y1", "()Lcom/p1/mobile/android/app/Frag;", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PicksAct extends PutongFragAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.act.PicksAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "from", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "FROM", "Ljava/lang/String;", "FROM_MEET", "FROM_MEET_ODIAMOND", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m57926a(@NotNull Context context, @Nullable String from) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) PicksAct.class);
            intent.putExtra("from", from);
            return intent;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: Z1 */
    public static final Intent m57925Z1(@NotNull Context context, @Nullable String str) {
        return INSTANCE.m57926a(context, str);
    }

    @Override // com.p051p1.mobile.putong.core.PutongFragAct
    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public Frag mo30952Y1() {
        return PicksFrag.Companion.m57937b(PicksFrag.INSTANCE, getIntent().getStringExtra("from"), pageId(), true, null, 8, null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_picks_view";
    }
}
