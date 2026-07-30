package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0016J\u001d\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0016J\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R(\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0,0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/¨\u00061"}, m87232d2 = {"Ll/unm;", "", "Ll/zxf0;", "storeRegistry", "Ll/n95;", "clock", "Ljava/util/Locale;", "locale", "<init>", "(Ll/zxf0;Ll/n95;Ljava/util/Locale;)V", "", "campaignId", "", "k", "(Ljava/lang/String;)V", "", "h", "(Ljava/lang/String;)I", RXScreenCaptureService.KEY_INDEX, "()I", "seconds", "g", "(Ljava/lang/String;I)I", "minutes", "f", "hours", "e", "days", Constants.INAPP_DATA_TAG, "weeks", "j", "", "timestampStart", "b", "(Ljava/lang/String;J)I", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "a", "()V", "Ll/zxf0;", "Ll/n95;", "Ljava/util/Locale;", "", "", "Ljava/util/Map;", "sessionImpressions", "I", "sessionImpressionsTotal", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class unm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final zxf0 storeRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Locale locale;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Map<String, List<Long>> sessionImpressions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int sessionImpressionsTotal;

    @JvmOverloads
    public unm(@NotNull zxf0 zxf0Var, @NotNull n95 n95Var, @NotNull Locale locale) {
        zxf0Var.getClass();
        n95Var.getClass();
        locale.getClass();
        this.storeRegistry = zxf0Var;
        this.clock = n95Var;
        this.locale = locale;
        this.sessionImpressions = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m194457a() {
        this.sessionImpressions.clear();
        this.sessionImpressionsTotal = 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m194458b(@NotNull String campaignId, long timestampStart) {
        campaignId.getClass();
        List<Long> listM194459c = m194459c(campaignId);
        int size = listM194459c.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            if (listM194459c.get(i2).longValue() < timestampStart) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return listM194459c.size() - i;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<Long> m194459c(@NotNull String campaignId) {
        List<Long> listM199037d;
        campaignId.getClass();
        vnm impressionStore = this.storeRegistry.getImpressionStore();
        return (impressionStore == null || (listM199037d = impressionStore.m199037d(campaignId)) == null) ? CollectionsKt.emptyList() : listM199037d;
    }

    /* JADX INFO: renamed from: d */
    public final int m194460d(@NotNull String campaignId, int days) {
        campaignId.getClass();
        Calendar calendar = Calendar.getInstance(this.locale);
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -days);
        return m194458b(campaignId, calendar.getTime().getTime() / 1000);
    }

    /* JADX INFO: renamed from: e */
    public final int m194461e(@NotNull String campaignId, int hours) {
        campaignId.getClass();
        return m194458b(campaignId, this.clock.mo158533c() - TimeUnit.HOURS.toSeconds(hours));
    }

    /* JADX INFO: renamed from: f */
    public final int m194462f(@NotNull String campaignId, int minutes) {
        campaignId.getClass();
        return m194458b(campaignId, this.clock.mo158533c() - TimeUnit.MINUTES.toSeconds(minutes));
    }

    /* JADX INFO: renamed from: g */
    public final int m194463g(@NotNull String campaignId, int seconds) {
        campaignId.getClass();
        return m194458b(campaignId, this.clock.mo158533c() - ((long) seconds));
    }

    /* JADX INFO: renamed from: h */
    public final int m194464h(@NotNull String campaignId) {
        campaignId.getClass();
        List<Long> list = this.sessionImpressions.get(campaignId);
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSessionImpressionsTotal() {
        return this.sessionImpressionsTotal;
    }

    /* JADX INFO: renamed from: j */
    public final int m194466j(@NotNull String campaignId, int weeks) {
        campaignId.getClass();
        Calendar calendar = Calendar.getInstance(this.locale);
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -(((calendar.get(7) - calendar.getFirstDayOfWeek()) + 7) % 7));
        if (weeks > 1) {
            calendar.add(3, -weeks);
        }
        return m194458b(campaignId, calendar.getTimeInMillis() / 1000);
    }

    /* JADX INFO: renamed from: k */
    public final void m194467k(@NotNull String campaignId) {
        campaignId.getClass();
        this.sessionImpressionsTotal++;
        long jMo158533c = this.clock.mo158533c();
        Map<String, List<Long>> map = this.sessionImpressions;
        List<Long> arrayList = map.get(campaignId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(campaignId, arrayList);
        }
        arrayList.add(Long.valueOf(jMo158533c));
        vnm impressionStore = this.storeRegistry.getImpressionStore();
        if (impressionStore != null) {
            impressionStore.m199038f(campaignId, jMo158533c);
        }
    }

    public /* synthetic */ unm(zxf0 zxf0Var, n95 n95Var, Locale locale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zxf0Var, (i & 2) != 0 ? n95.f137721a : n95Var, (i & 4) != 0 ? Locale.getDefault() : locale);
    }
}
