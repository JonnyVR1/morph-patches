package com.p046p1.mobile.putong.core.p053ui.onlinematch;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.mqi0;
import p149l.ogl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 ,2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b*\u0010\u001b¨\u0006-"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/onlinematch/c;", "", "<init>", "()V", "", "k", "j", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "pushUser", "", "isQuickChat", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;Z)V", "h", "()Z", "a", "Z", Constants.INAPP_DATA_TAG, "setCurrentIsMatch", "(Z)V", "currentIsMatch", "", "b", "J", "e", "()J", RXScreenCaptureService.KEY_INDEX, "(J)V", "currentTime", "c", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "g", "()Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "setPushUser", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;)V", "", "Ljava/lang/String;", "getDropDownMatchTag", "()Ljava/lang/String;", "setDropDownMatchTag", "(Ljava/lang/String;)V", "dropDownMatchTag", "setBroadcastTextTimerValue", "broadcastTextTimerValue", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8611c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile C8611c f32677f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean currentIsMatch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long currentTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public OnlineMatchPushUser pushUser;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String dropDownMatchTag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long broadcastTextTimerValue;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.c$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/onlinematch/c$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/onlinematch/c;", "a", "()Lcom/p1/mobile/putong/core/ui/onlinematch/c;", "", "b", "", "NOSHOW_TIME", "I", "SHOW_MATCH_TIME", "SHOW_MATCH_TIMEV2", "SHOW_RECEIVER_TIME", "SHOW_BUBBLE_TIME", "instance", "Lcom/p1/mobile/putong/core/ui/onlinematch/c;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C8611c m50302a() {
            if (C8611c.f32677f == null) {
                synchronized (this) {
                    try {
                        if (C8611c.f32677f == null) {
                            C8611c.f32677f = new C8611c(null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C8611c c8611c = C8611c.f32677f;
            c8611c.getClass();
            return c8611c;
        }

        /* JADX INFO: renamed from: b */
        public final void m50303b() {
            C8611c.f32677f = null;
        }

        public Companion() {
        }
    }

    public C8611c() {
        this.dropDownMatchTag = "";
        this.broadcastTextTimerValue = -1L;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final C8611c m50292f() {
        return INSTANCE.m50302a();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBroadcastTextTimerValue() {
        return this.broadcastTextTimerValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getCurrentIsMatch() {
        return this.currentIsMatch;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final OnlineMatchPushUser getPushUser() {
        return this.pushUser;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m50297h() {
        return this.currentTime != 0 && mqi0.m155944o() >= this.currentTime;
    }

    /* JADX INFO: renamed from: i */
    public final void m50298i(long j) {
        this.currentTime = j;
    }

    /* JADX INFO: renamed from: j */
    public final void m50299j() {
        this.currentIsMatch = true;
        this.currentTime = mqi0.m155944o() + 10000;
    }

    /* JADX INFO: renamed from: k */
    public final void m50300k() {
        if (this.currentTime != 0) {
            return;
        }
        if (ogl0.m164237P()) {
            this.currentTime = mqi0.m155944o() + HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
        } else {
            this.currentTime = mqi0.m155944o() + 1800000;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m50301l(@NotNull OnlineMatchPushUser pushUser, boolean isQuickChat) {
        pushUser.getClass();
        OnlineMatchPushUser onlineMatchPushUser = this.pushUser;
        if (onlineMatchPushUser != null) {
            onlineMatchPushUser.getClass();
            if (Intrinsics.m87488d(onlineMatchPushUser, pushUser)) {
                return;
            }
        }
        this.pushUser = pushUser;
        this.currentIsMatch = false;
        this.broadcastTextTimerValue = mqi0.m155944o();
        this.currentTime = mqi0.m155944o() + ((long) (pushUser.isSquareDataWrapper ? 30000 : 300000));
    }

    public /* synthetic */ C8611c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
