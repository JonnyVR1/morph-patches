package com.p051p1.mobile.putong.core.newui.home;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.C8545b;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p153l.ix60;
import p153l.sp0;
import p153l.udo;
import p153l.xnf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/home/a;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8016a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.a$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/home/a$a;", "", "<init>", "()V", "", "j", "()Z", "e", Constants.INAPP_DATA_TAG, "f", "g", "c", RXScreenCaptureService.KEY_INDEX, "h", "a", "b", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m37991a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m37992b() {
            return sp0.INSTANCE.m187295i() > 0;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m37993c() {
            return !m37998h() && C8545b.INSTANCE.m47468g() > 0;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m37994d() {
            return !m37996f();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m37995e() {
            return !m37994d();
        }

        /* JADX INFO: renamed from: f */
        public final boolean m37996f() {
            return !m37997g() && ix60.INSTANCE.m142480k() > 0;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m37997g() {
            return !m37993c() && xnf0.INSTANCE.m212192j() > 0;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m37998h() {
            return !m37992b() && udo.INSTANCE.m195511k();
        }

        /* JADX INFO: renamed from: i */
        public final boolean m37999i() {
            return udo.INSTANCE.m195517q() > 0;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m38000j() {
            return !m37995e();
        }

        public Companion() {
        }
    }
}
