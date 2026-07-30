package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p046p1.mobile.putong.core.data.VisitorFilterType;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/w5m0;", "", "<init>", "()V", "Companion", "a", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class w5m0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final VisitorFilterSettings m201647a() {
        return INSTANCE.m201652a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m201648b() {
        return INSTANCE.m201654c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m201649c() {
        return INSTANCE.m201655d();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final int m201650d() {
        return INSTANCE.m201656e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final int m201651e() {
        return INSTANCE.m201657f();
    }

    /* JADX INFO: renamed from: l.w5m0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\tJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/w5m0$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "a", "()Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "", "f", "()I", "e", Constants.INAPP_DATA_TAG, "c", "Lcom/p1/mobile/putong/data/Settings;", "b", "()Lcom/p1/mobile/putong/data/Settings;", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final VisitorFilterSettings m201652a() {
            VisitorFilterSettings visitorFilterSettingsNew_ = VisitorFilterSettings.new_();
            visitorFilterSettingsNew_.distance = m201654c();
            visitorFilterSettingsNew_.minAge = m201657f();
            visitorFilterSettingsNew_.maxAge = m201656e();
            visitorFilterSettingsNew_.filter = VisitorFilterType.get("all");
            visitorFilterSettingsNew_.sort = VisitorSortType.get("visitTime");
            return visitorFilterSettingsNew_;
        }

        /* JADX INFO: renamed from: b */
        public final Settings m201653b() {
            User userMe_ = CoreModule.m29932K().me_();
            if (NullChecker.m81303a(userMe_) && NullChecker.m81303a(userMe_.settings)) {
                return userMe_.settings;
            }
            return null;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final int m201654c() {
            Settings settingsM201653b = m201653b();
            if (!NullChecker.m81303a(settingsM201653b)) {
                return LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
            }
            settingsM201653b.getClass();
            if (settingsM201653b.getRadiusAllowedMaximum().intValue() <= 0) {
                return LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
            }
            Integer radiusAllowedMaximum = settingsM201653b.getRadiusAllowedMaximum();
            radiusAllowedMaximum.getClass();
            return radiusAllowedMaximum.intValue();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final int m201655d() {
            Settings settingsM201653b = m201653b();
            if (!NullChecker.m81303a(settingsM201653b)) {
                return 1000;
            }
            settingsM201653b.getClass();
            if (settingsM201653b.getRadiusAllowedMinimum().intValue() <= 0) {
                return 1000;
            }
            Integer radiusAllowedMinimum = settingsM201653b.getRadiusAllowedMinimum();
            radiusAllowedMinimum.getClass();
            return radiusAllowedMinimum.intValue();
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final int m201656e() {
            Settings settingsM201653b = m201653b();
            if (!NullChecker.m81303a(settingsM201653b)) {
                return 50;
            }
            settingsM201653b.getClass();
            if (settingsM201653b.getSearchAgeAllowedMaximum().intValue() <= 0) {
                return 50;
            }
            Integer searchAgeAllowedMaximum = settingsM201653b.getSearchAgeAllowedMaximum();
            searchAgeAllowedMaximum.getClass();
            return searchAgeAllowedMaximum.intValue();
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final int m201657f() {
            Settings settingsM201653b = m201653b();
            if (!NullChecker.m81303a(settingsM201653b)) {
                return 18;
            }
            settingsM201653b.getClass();
            if (settingsM201653b.getSearchAgeAllowedMinimum().intValue() <= 0) {
                return 18;
            }
            Integer searchAgeAllowedMinimum = settingsM201653b.getSearchAgeAllowedMinimum();
            searchAgeAllowedMinimum.getClass();
            return searchAgeAllowedMinimum.intValue();
        }

        public Companion() {
        }
    }
}
