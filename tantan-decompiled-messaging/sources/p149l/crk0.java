package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001e\u0018\u0000 62\u00020\u0001:\u0002\u001c BÃ\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b(\u0010,R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b&\u0010,R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b0\u0010,R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b1\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00148\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b\"\u00103R4\u00105\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b$\u0010,¨\u00067"}, m87232d2 = {"Ll/crk0;", "", "", "maxKeyLength", "maxValueLength", "maxDepth", "maxArrayKeyCount", "maxObjectKeyCount", "maxArrayLength", "maxKVPairCount", "", "", "keyCharsNotAllowed", "valueCharsNotAllowed", "maxEventNameLength", "eventNameCharsNotAllowed", "", "restrictedEventNames", "restrictedMultiValueFields", "maxChargedEventItemsCount", "Lkotlin/Function0;", "deviceCountryCodeProvider", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "names", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/util/Set;)V", "a", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "b", "o", "c", "j", Constants.INAPP_DATA_TAG, "g", "e", "n", "f", "h", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/Set;", "()Ljava/util/Set;", RXScreenCaptureService.KEY_INDEX, "r", "k", "p", "q", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "value", "discardedEventNames", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class crk0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final Set<String> f82226q = SetsKt.setOf((Object[]) new String[]{"Stayed", Constants.NOTIFICATION_CLICKED_EVENT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME, "UTM Visited", "Notification Sent", Constants.APP_LAUNCHED_EVENT, "wzrk_d", "App Uninstalled", "Notification Bounced", Constants.GEOFENCE_ENTERED_EVENT_NAME, Constants.GEOFENCE_EXITED_EVENT_NAME, Constants.SC_OUTGOING_EVENT_NAME, Constants.SC_INCOMING_EVENT_NAME, Constants.SC_END_EVENT_NAME, Constants.SC_CAMPAIGN_OPT_OUT_EVENT_NAME});

    /* JADX INFO: renamed from: r */
    @NotNull
    private static final Set<String> f82227r = SetsKt.setOf((Object[]) new String[]{AuthenticationTokenClaims.JSON_KEY_NAME, "email", "education", "married", "dob", "gender", "phone", SeeTextDynamicParam.age, "fbid", "gpid", "birthday", "identity"});

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Integer maxKeyLength;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Integer maxValueLength;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Integer maxDepth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Integer maxArrayKeyCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Integer maxObjectKeyCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final Integer maxArrayLength;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final Integer maxKVPairCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final Set<Character> keyCharsNotAllowed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final Set<Character> valueCharsNotAllowed;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Integer maxEventNameLength;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final Set<Character> eventNameCharsNotAllowed;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private final Set<String> restrictedEventNames;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final Set<String> restrictedMultiValueFields;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private final Integer maxChargedEventItemsCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> deviceCountryCodeProvider;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private Set<String> discardedEventNames;

    /* JADX INFO: renamed from: l.crk0$a */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u000bJ\u001b\u0010\u0017\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\u001b\u0010\u001e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\u0004\b\u001e\u0010\u0018J\u001b\u0010 \u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\u0004\b \u0010\u0018J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b!\u0010\u000bJ\u001d\u0010$\u001a\u00020\u00002\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00100R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00100R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00100R\u0018\u00107\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00100R \u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00109¨\u0006;"}, m87232d2 = {"Ll/crk0$a;", "", "<init>", "()V", "Ll/crk0;", Constants.KEY_CONFIG, "o", "(Ll/crk0;)Ll/crk0$a;", "", "maxLength", "j", "(I)Ll/crk0$a;", "m", "maxDepth", "e", "maxCount", "b", "k", "c", "h", "", "", "charsNotAllowed", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/Set;)Ll/crk0$a;", BLiveStormDanmakuGiftResourceType.f44444l, "g", "f", "", "restrictedNames", "q", "restrictedFields", "r", Constants.INAPP_DATA_TAG, "Lkotlin/Function0;", "provider", "p", "(Lkotlin/jvm/functions/Function0;)Ll/crk0$a;", "n", "()Ll/crk0;", "a", "Ljava/lang/Integer;", "maxKeyLength", "maxValueLength", "maxArrayKeyCount", "maxObjectKeyCount", "maxArrayLength", "maxKVPairCount", "Ljava/util/Set;", "keyCharsNotAllowed", "valueCharsNotAllowed", "maxEventNameLength", "eventNameCharsNotAllowed", "restrictedEventNames", "restrictedMultiValueFields", "maxChargedEventItemsCount", "discardedEventNames", "Lkotlin/jvm/functions/Function0;", "deviceCountryCodeProvider", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C16228a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Integer maxKeyLength;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Integer maxValueLength;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private Integer maxDepth;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private Integer maxArrayKeyCount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private Integer maxObjectKeyCount;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private Integer maxArrayLength;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private Integer maxKVPairCount;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private Set<Character> keyCharsNotAllowed;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        private Set<Character> valueCharsNotAllowed;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        private Integer maxEventNameLength;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        private Set<Character> eventNameCharsNotAllowed;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        private Set<String> restrictedEventNames;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        private Set<String> restrictedMultiValueFields;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        private Integer maxChargedEventItemsCount;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        private Set<String> discardedEventNames;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        private Function0<String> deviceCountryCodeProvider;

        /* JADX INFO: renamed from: a */
        public static String m108399a() {
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C16228a m108400b(int maxCount) {
            this.maxArrayKeyCount = Integer.valueOf(maxCount);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C16228a m108401c(int maxLength) {
            this.maxArrayLength = Integer.valueOf(maxLength);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C16228a m108402d(int maxCount) {
            this.maxChargedEventItemsCount = Integer.valueOf(maxCount);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C16228a m108403e(int maxDepth) {
            this.maxDepth = Integer.valueOf(maxDepth);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C16228a m108404f(@NotNull Set<Character> charsNotAllowed) {
            charsNotAllowed.getClass();
            this.eventNameCharsNotAllowed = charsNotAllowed;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C16228a m108405g(int maxLength) {
            this.maxEventNameLength = Integer.valueOf(maxLength);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C16228a m108406h(int maxCount) {
            this.maxKVPairCount = Integer.valueOf(maxCount);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C16228a m108407i(@NotNull Set<Character> charsNotAllowed) {
            charsNotAllowed.getClass();
            this.keyCharsNotAllowed = charsNotAllowed;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final C16228a m108408j(int maxLength) {
            this.maxKeyLength = Integer.valueOf(maxLength);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final C16228a m108409k(int maxCount) {
            this.maxObjectKeyCount = Integer.valueOf(maxCount);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final C16228a m108410l(@NotNull Set<Character> charsNotAllowed) {
            charsNotAllowed.getClass();
            this.valueCharsNotAllowed = charsNotAllowed;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final C16228a m108411m(int maxLength) {
            this.maxValueLength = Integer.valueOf(maxLength);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final crk0 m108412n() {
            Integer num = this.maxKeyLength;
            Integer num2 = this.maxValueLength;
            Integer num3 = this.maxDepth;
            Integer num4 = this.maxArrayKeyCount;
            Integer num5 = this.maxObjectKeyCount;
            Integer num6 = this.maxArrayLength;
            Integer num7 = this.maxKVPairCount;
            Set<Character> set = this.keyCharsNotAllowed;
            Set<Character> set2 = this.valueCharsNotAllowed;
            Integer num8 = this.maxEventNameLength;
            Set<Character> set3 = this.eventNameCharsNotAllowed;
            Set<String> set4 = this.restrictedEventNames;
            Set<String> set5 = this.restrictedMultiValueFields;
            Integer num9 = this.maxChargedEventItemsCount;
            Function0<String> function0 = this.deviceCountryCodeProvider;
            if (function0 == null) {
                function0 = new Function0() { // from class: l.brk0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return crk0.C16228a.m108399a();
                    }
                };
            }
            crk0 crk0Var = new crk0(num, num2, num3, num4, num5, num6, num7, set, set2, num8, set3, set4, set5, num9, function0, null);
            crk0Var.discardedEventNames = this.discardedEventNames;
            return crk0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final C16228a m108413o(@NotNull crk0 config) {
            config.getClass();
            this.maxKeyLength = config.getMaxKeyLength();
            this.maxValueLength = config.getMaxValueLength();
            this.maxDepth = config.getMaxDepth();
            this.maxArrayKeyCount = config.getMaxArrayKeyCount();
            this.maxObjectKeyCount = config.getMaxObjectKeyCount();
            this.maxArrayLength = config.getMaxArrayLength();
            this.maxKVPairCount = config.getMaxKVPairCount();
            this.keyCharsNotAllowed = config.m108385f();
            this.valueCharsNotAllowed = config.m108397r();
            this.maxEventNameLength = config.getMaxEventNameLength();
            this.eventNameCharsNotAllowed = config.m108384e();
            this.restrictedEventNames = config.m108395p();
            this.restrictedMultiValueFields = config.m108396q();
            this.maxChargedEventItemsCount = config.getMaxChargedEventItemsCount();
            this.discardedEventNames = config.m108383d();
            this.deviceCountryCodeProvider = config.m108382c();
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final C16228a m108414p(@NotNull Function0<String> provider) {
            provider.getClass();
            this.deviceCountryCodeProvider = provider;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final C16228a m108415q(@NotNull Set<String> restrictedNames) {
            restrictedNames.getClass();
            this.restrictedEventNames = restrictedNames;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final C16228a m108416r(@NotNull Set<String> restrictedFields) {
            restrictedFields.getClass();
            this.restrictedMultiValueFields = restrictedFields;
            return this;
        }
    }

    private crk0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Set<Character> set, Set<Character> set2, Integer num8, Set<Character> set3, Set<String> set4, Set<String> set5, Integer num9, Function0<String> function0) {
        this.maxKeyLength = num;
        this.maxValueLength = num2;
        this.maxDepth = num3;
        this.maxArrayKeyCount = num4;
        this.maxObjectKeyCount = num5;
        this.maxArrayLength = num6;
        this.maxKVPairCount = num7;
        this.keyCharsNotAllowed = set;
        this.valueCharsNotAllowed = set2;
        this.maxEventNameLength = num8;
        this.eventNameCharsNotAllowed = set3;
        this.restrictedEventNames = set4;
        this.restrictedMultiValueFields = set5;
        this.maxChargedEventItemsCount = num9;
        this.deviceCountryCodeProvider = function0;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Function0<String> m108382c() {
        return this.deviceCountryCodeProvider;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Set<String> m108383d() {
        return this.discardedEventNames;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Set<Character> m108384e() {
        return this.eventNameCharsNotAllowed;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Set<Character> m108385f() {
        return this.keyCharsNotAllowed;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getMaxArrayKeyCount() {
        return this.maxArrayKeyCount;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getMaxArrayLength() {
        return this.maxArrayLength;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getMaxChargedEventItemsCount() {
        return this.maxChargedEventItemsCount;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getMaxDepth() {
        return this.maxDepth;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getMaxEventNameLength() {
        return this.maxEventNameLength;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getMaxKVPairCount() {
        return this.maxKVPairCount;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getMaxKeyLength() {
        return this.maxKeyLength;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getMaxObjectKeyCount() {
        return this.maxObjectKeyCount;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getMaxValueLength() {
        return this.maxValueLength;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Set<String> m108395p() {
        return this.restrictedEventNames;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Set<String> m108396q() {
        return this.restrictedMultiValueFields;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Set<Character> m108397r() {
        return this.valueCharsNotAllowed;
    }

    /* JADX INFO: renamed from: s */
    public final void m108398s(@Nullable Set<String> names) {
        this.discardedEventNames = names;
    }

    /* JADX INFO: renamed from: l.crk0$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, m87232d2 = {"Ll/crk0$b;", "", "<init>", "()V", "Lkotlin/Function0;", "", "countryCodeProvider", "Ll/crk0$a;", "a", "(Lkotlin/jvm/functions/Function0;)Ll/crk0$a;", "", "DEFAULT_RESTRICTED_MULTI_VALUE_FIELDS", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "DEFAULT_RESTRICTED_EVENT_NAMES", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C16228a m108417a(@Nullable Function0<String> countryCodeProvider) {
            C16228a c16228aM108416r = new C16228a().m108408j(120).m108411m(512).m108403e(3).m108400b(5).m108409k(5).m108401c(100).m108406h(100).m108402d(50).m108407i(SetsKt.setOf((Object[]) new Character[]{':', '$', '\'', '\"', '\\'})).m108410l(SetsKt.setOf((Object[]) new Character[]{'\'', '\"', '\\'})).m108405g(512).m108404f(SetsKt.setOf((Object[]) new Character[]{'.', ':', '$', '\'', '\"', '\\'})).m108415q(crk0.f82226q).m108416r(m108418b());
            if (countryCodeProvider != null) {
                c16228aM108416r.m108414p(countryCodeProvider);
            }
            return c16228aM108416r;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Set<String> m108418b() {
            return crk0.f82227r;
        }

        private Companion() {
        }
    }

    public /* synthetic */ crk0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Set set, Set set2, Integer num8, Set set3, Set set4, Set set5, Integer num9, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, num3, num4, num5, num6, num7, set, set2, num8, set3, set4, set5, num9, function0);
    }
}
