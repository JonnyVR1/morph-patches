package com.p000p1.mobile.putong.core.p004ui.settings;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p006l.C1295t0;
import p006l.C1426x0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/p1/mobile/putong/core/ui/settings/AITranslateSettingAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/t0;", "Ll/x0;", "<init>", "()V", "Z1", "()Ll/t0;", "a2", "()Ll/x0;", "", "pageId", "()Ljava/lang/String;", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AITranslateSettingAct extends PutongMvpAct<C1295t0, C1426x0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.AITranslateSettingAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/core/ui/settings/AITranslateSettingAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m8368a(@NotNull Context context) {
            context.getClass();
            return new Intent(context, (Class<?>) AITranslateSettingAct.class);
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public static final Intent m8365Y1(@NotNull Context context) {
        return INSTANCE.m8368a(context);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public C1295t0 mo571V1() {
        return new C1295t0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C1426x0 mo572X1() {
        return new C1426x0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    @NotNull
    public String pageId() {
        return "p_intl_ai_translate_language";
    }
}
