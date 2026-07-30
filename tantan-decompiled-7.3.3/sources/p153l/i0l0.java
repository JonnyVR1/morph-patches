package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001e\u0018\u0000 62\u00020\u0001:\u0002\u001c BÃ\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b(\u0010,R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b&\u0010,R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b0\u0010,R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b1\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00148\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b\"\u00103R4\u00105\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b$\u0010,¨\u00067"}, m88121d2 = {"Ll/i0l0;", "", "", "maxKeyLength", "maxValueLength", "maxDepth", "maxArrayKeyCount", "maxObjectKeyCount", "maxArrayLength", "maxKVPairCount", "", "", "keyCharsNotAllowed", "valueCharsNotAllowed", "maxEventNameLength", "eventNameCharsNotAllowed", "", "restrictedEventNames", "restrictedMultiValueFields", "maxChargedEventItemsCount", "Lkotlin/Function0;", "deviceCountryCodeProvider", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "names", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/Set;)V", "a", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "b", "o", "c", "j", Constants.INAPP_DATA_TAG, "g", "e", "n", "f", "h", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/Set;", "()Ljava/util/Set;", RXScreenCaptureService.KEY_INDEX, "r", "k", "p", "q", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "value", "discardedEventNames", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class i0l0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final Set<String> f112385q = SetsKt.setOf((Object[]) new String[]{"Stayed", Constants.NOTIFICATION_CLICKED_EVENT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME, "UTM Visited", "Notification Sent", Constants.APP_LAUNCHED_EVENT, "wzrk_d", "App Uninstalled", "Notification Bounced", Constants.GEOFENCE_ENTERED_EVENT_NAME, Constants.GEOFENCE_EXITED_EVENT_NAME, Constants.SC_OUTGOING_EVENT_NAME, Constants.SC_INCOMING_EVENT_NAME, Constants.SC_END_EVENT_NAME, Constants.SC_CAMPAIGN_OPT_OUT_EVENT_NAME});

    /* JADX INFO: renamed from: r */
    @NotNull
    private static final Set<String> f112386r = SetsKt.setOf((Object[]) new String[]{AuthenticationTokenClaims.JSON_KEY_NAME, "email", "education", "married", "dob", "gender", "phone", SeeTextDynamicParam.age, "fbid", "gpid", "birthday", "identity"});

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

    /* JADX INFO: renamed from: l.i0l0$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u000bJ\u001b\u0010\u0017\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\u001b\u0010\u001e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\u0004\b\u001e\u0010\u0018J\u001b\u0010 \u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\u0004\b \u0010\u0018J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b!\u0010\u000bJ\u001d\u0010$\u001a\u00020\u00002\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00100R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00100R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00100R\u0018\u00107\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00100R \u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00109¨\u0006;"}, m88121d2 = {"Ll/i0l0$a;", "", "<init>", "()V", "Ll/i0l0;", Constants.KEY_CONFIG, "o", "(Ll/i0l0;)Ll/i0l0$a;", "", "maxLength", "j", "(I)Ll/i0l0$a;", "m", "maxDepth", "e", "maxCount", "b", "k", "c", "h", "", "", "charsNotAllowed", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/Set;)Ll/i0l0$a;", BLiveStormDanmakuGiftResourceType.f45292l, "g", "f", "", "restrictedNames", "q", "restrictedFields", "r", Constants.INAPP_DATA_TAG, "Lkotlin/Function0;", "provider", "p", "(Lkotlin/jvm/functions/Function0;)Ll/i0l0$a;", "n", "()Ll/i0l0;", "a", "Ljava/lang/Integer;", "maxKeyLength", "maxValueLength", "maxArrayKeyCount", "maxObjectKeyCount", "maxArrayLength", "maxKVPairCount", "Ljava/util/Set;", "keyCharsNotAllowed", "valueCharsNotAllowed", "maxEventNameLength", "eventNameCharsNotAllowed", "restrictedEventNames", "restrictedMultiValueFields", "maxChargedEventItemsCount", "discardedEventNames", "Lkotlin/jvm/functions/Function0;", "deviceCountryCodeProvider", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C17611a {

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
        public static String m137997a() {
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C17611a m137998b(int maxCount) {
            this.maxArrayKeyCount = Integer.valueOf(maxCount);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C17611a m137999c(int maxLength) {
            this.maxArrayLength = Integer.valueOf(maxLength);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C17611a m138000d(int maxCount) {
            this.maxChargedEventItemsCount = Integer.valueOf(maxCount);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C17611a m138001e(int maxDepth) {
            this.maxDepth = Integer.valueOf(maxDepth);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C17611a m138002f(@NotNull Set<Character> charsNotAllowed) {
            charsNotAllowed.getClass();
            this.eventNameCharsNotAllowed = charsNotAllowed;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C17611a m138003g(int maxLength) {
            this.maxEventNameLength = Integer.valueOf(maxLength);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C17611a m138004h(int maxCount) {
            this.maxKVPairCount = Integer.valueOf(maxCount);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C17611a m138005i(@NotNull Set<Character> charsNotAllowed) {
            charsNotAllowed.getClass();
            this.keyCharsNotAllowed = charsNotAllowed;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final C17611a m138006j(int maxLength) {
            this.maxKeyLength = Integer.valueOf(maxLength);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final C17611a m138007k(int maxCount) {
            this.maxObjectKeyCount = Integer.valueOf(maxCount);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final C17611a m138008l(@NotNull Set<Character> charsNotAllowed) {
            charsNotAllowed.getClass();
            this.valueCharsNotAllowed = charsNotAllowed;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final C17611a m138009m(int maxLength) {
            this.maxValueLength = Integer.valueOf(maxLength);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final i0l0 m138010n() {
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
                function0 = new Function0() { // from class: l.h0l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i0l0.C17611a.m137997a();
                    }
                };
            }
            i0l0 i0l0Var = new i0l0(num, num2, num3, num4, num5, num6, num7, set, set2, num8, set3, set4, set5, num9, function0, null);
            i0l0Var.discardedEventNames = this.discardedEventNames;
            return i0l0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final C17611a m138011o(@NotNull i0l0 config) {
            config.getClass();
            this.maxKeyLength = config.getMaxKeyLength();
            this.maxValueLength = config.getMaxValueLength();
            this.maxDepth = config.getMaxDepth();
            this.maxArrayKeyCount = config.getMaxArrayKeyCount();
            this.maxObjectKeyCount = config.getMaxObjectKeyCount();
            this.maxArrayLength = config.getMaxArrayLength();
            this.maxKVPairCount = config.getMaxKVPairCount();
            this.keyCharsNotAllowed = config.m137983f();
            this.valueCharsNotAllowed = config.m137995r();
            this.maxEventNameLength = config.getMaxEventNameLength();
            this.eventNameCharsNotAllowed = config.m137982e();
            this.restrictedEventNames = config.m137993p();
            this.restrictedMultiValueFields = config.m137994q();
            this.maxChargedEventItemsCount = config.getMaxChargedEventItemsCount();
            this.discardedEventNames = config.m137981d();
            this.deviceCountryCodeProvider = config.m137980c();
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final C17611a m138012p(@NotNull Function0<String> provider) {
            provider.getClass();
            this.deviceCountryCodeProvider = provider;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final C17611a m138013q(@NotNull Set<String> restrictedNames) {
            restrictedNames.getClass();
            this.restrictedEventNames = restrictedNames;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final C17611a m138014r(@NotNull Set<String> restrictedFields) {
            restrictedFields.getClass();
            this.restrictedMultiValueFields = restrictedFields;
            return this;
        }
    }

    private i0l0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Set<Character> set, Set<Character> set2, Integer num8, Set<Character> set3, Set<String> set4, Set<String> set5, Integer num9, Function0<String> function0) {
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
    public final Function0<String> m137980c() {
        return this.deviceCountryCodeProvider;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Set<String> m137981d() {
        return this.discardedEventNames;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Set<Character> m137982e() {
        return this.eventNameCharsNotAllowed;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Set<Character> m137983f() {
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
    public final Set<String> m137993p() {
        return this.restrictedEventNames;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Set<String> m137994q() {
        return this.restrictedMultiValueFields;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Set<Character> m137995r() {
        return this.valueCharsNotAllowed;
    }

    /* JADX INFO: renamed from: s */
    public final void m137996s(@Nullable Set<String> names) {
        this.discardedEventNames = names;
    }

    /* JADX INFO: renamed from: l.i0l0$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, m88121d2 = {"Ll/i0l0$b;", "", "<init>", "()V", "Lkotlin/Function0;", "", "countryCodeProvider", "Ll/i0l0$a;", "a", "(Lkotlin/jvm/functions/Function0;)Ll/i0l0$a;", "", "DEFAULT_RESTRICTED_MULTI_VALUE_FIELDS", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "DEFAULT_RESTRICTED_EVENT_NAMES", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C17611a m138015a(@Nullable Function0<String> countryCodeProvider) {
            C17611a c17611aM138014r = new C17611a().m138006j(120).m138009m(512).m138001e(3).m137998b(5).m138007k(5).m137999c(100).m138004h(100).m138000d(50).m138005i(SetsKt.setOf((Object[]) new Character[]{':', '$', '\'', '\"', '\\'})).m138008l(SetsKt.setOf((Object[]) new Character[]{'\'', '\"', '\\'})).m138003g(512).m138002f(SetsKt.setOf((Object[]) new Character[]{'.', ':', '$', '\'', '\"', '\\'})).m138013q(i0l0.f112385q).m138014r(m138016b());
            if (countryCodeProvider != null) {
                c17611aM138014r.m138012p(countryCodeProvider);
            }
            return c17611aM138014r;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Set<String> m138016b() {
            return i0l0.f112386r;
        }

        private Companion() {
        }
    }

    public /* synthetic */ i0l0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Set set, Set set2, Integer num8, Set set3, Set set4, Set set5, Integer num9, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, num3, num4, num5, num6, num7, set, set2, num8, set3, set4, set5, num9, function0);
    }
}
