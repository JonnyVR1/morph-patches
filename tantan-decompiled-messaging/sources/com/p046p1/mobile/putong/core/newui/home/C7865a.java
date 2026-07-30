package com.p046p1.mobile.putong.core.newui.home;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.C8382b;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.cp60;
import p149l.qff0;
import p149l.ubo;
import p149l.wp0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/home/a;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C7865a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.a$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/home/a$a;", "", "<init>", "()V", "", "j", "()Z", "e", Constants.INAPP_DATA_TAG, "f", "g", "c", RXScreenCaptureService.KEY_INDEX, "h", "a", "b", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m36988a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m36989b() {
            return wp0.INSTANCE.m204887i() > 0;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m36990c() {
            return !m36995h() && C8382b.INSTANCE.m46285g() > 0;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m36991d() {
            return !m36993f();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m36992e() {
            return !m36991d();
        }

        /* JADX INFO: renamed from: f */
        public final boolean m36993f() {
            return !m36994g() && cp60.INSTANCE.m108097k() > 0;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m36994g() {
            return !m36990c() && qff0.INSTANCE.m174298j() > 0;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m36995h() {
            return !m36989b() && ubo.INSTANCE.m192890k();
        }

        /* JADX INFO: renamed from: i */
        public final boolean m36996i() {
            return ubo.INSTANCE.m192896q() > 0;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m36997j() {
            return !m36992e();
        }

        public Companion() {
        }
    }
}
