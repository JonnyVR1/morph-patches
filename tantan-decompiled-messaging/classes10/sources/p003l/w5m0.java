package p003l;

import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p000p1.mobile.putong.core.data.VisitorFilterType;
import com.p000p1.mobile.putong.core.data.VisitorSortType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/w5m0;", "", "<init>", "()V", "Companion", "a", "b_core_base"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class w5m0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final VisitorFilterSettings m10438a() {
        return INSTANCE.m10443a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m10439b() {
        return INSTANCE.m10445c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m10440c() {
        return INSTANCE.m10446d();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final int m10441d() {
        return INSTANCE.m10447e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final int m10442e() {
        return INSTANCE.m10448f();
    }

    /* JADX INFO: renamed from: l.w5m0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\tJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/w5m0$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "a", "()Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "", "f", "()I", "e", "d", "c", "Lcom/p1/mobile/putong/data/Settings;", "b", "()Lcom/p1/mobile/putong/data/Settings;", "b_core_base"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final VisitorFilterSettings m10443a() {
            VisitorFilterSettings visitorFilterSettingsNew_ = VisitorFilterSettings.new_();
            visitorFilterSettingsNew_.distance = m10445c();
            visitorFilterSettingsNew_.minAge = m10448f();
            visitorFilterSettingsNew_.maxAge = m10447e();
            visitorFilterSettingsNew_.filter = VisitorFilterType.get("all");
            visitorFilterSettingsNew_.sort = VisitorSortType.get("visitTime");
            return visitorFilterSettingsNew_;
        }

        /* JADX INFO: renamed from: b */
        public final Settings m10444b() {
            User userMe_ = CoreModule.K().me_();
            if (NullChecker.a(userMe_) && NullChecker.a(userMe_.settings)) {
                return userMe_.settings;
            }
            return null;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final int m10445c() {
            Settings settingsM10444b = m10444b();
            if (!NullChecker.a(settingsM10444b)) {
                return 100000;
            }
            settingsM10444b.getClass();
            if (settingsM10444b.getRadiusAllowedMaximum().intValue() <= 0) {
                return 100000;
            }
            Integer radiusAllowedMaximum = settingsM10444b.getRadiusAllowedMaximum();
            radiusAllowedMaximum.getClass();
            return radiusAllowedMaximum.intValue();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final int m10446d() {
            Settings settingsM10444b = m10444b();
            if (!NullChecker.a(settingsM10444b)) {
                return 1000;
            }
            settingsM10444b.getClass();
            if (settingsM10444b.getRadiusAllowedMinimum().intValue() <= 0) {
                return 1000;
            }
            Integer radiusAllowedMinimum = settingsM10444b.getRadiusAllowedMinimum();
            radiusAllowedMinimum.getClass();
            return radiusAllowedMinimum.intValue();
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final int m10447e() {
            Settings settingsM10444b = m10444b();
            if (!NullChecker.a(settingsM10444b)) {
                return 50;
            }
            settingsM10444b.getClass();
            if (settingsM10444b.getSearchAgeAllowedMaximum().intValue() <= 0) {
                return 50;
            }
            Integer searchAgeAllowedMaximum = settingsM10444b.getSearchAgeAllowedMaximum();
            searchAgeAllowedMaximum.getClass();
            return searchAgeAllowedMaximum.intValue();
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final int m10448f() {
            Settings settingsM10444b = m10444b();
            if (!NullChecker.a(settingsM10444b)) {
                return 18;
            }
            settingsM10444b.getClass();
            if (settingsM10444b.getSearchAgeAllowedMinimum().intValue() <= 0) {
                return 18;
            }
            Integer searchAgeAllowedMinimum = settingsM10444b.getSearchAgeAllowedMinimum();
            searchAgeAllowedMinimum.getClass();
            return searchAgeAllowedMinimum.intValue();
        }

        public Companion() {
        }
    }
}
