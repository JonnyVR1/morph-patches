package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.scrap.bean.ScrapDialogEventData;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J)\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0012H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/qbe0;", "", "<init>", "()V", "Ll/i6t;", "presenter", "", "targetScrapId", "", "j", "(Ll/i6t;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "scrapBriefList", "Ll/sce0;", "b", "(Ljava/util/List;)Ljava/util/List;", "bLiveScrapBrief", "", "g", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;)Z", "h", RXScreenCaptureService.KEY_INDEX, "scrapId", "e", "(Ljava/lang/String;)Ljava/lang/String;", "scrapIdOrTargetId", "f", "Landroid/content/Context;", "context", "expiredTimeFromService", "isRightScrap", "c", "(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qbe0 {

    @NotNull
    public static final qbe0 INSTANCE = new qbe0();

    /* JADX INFO: renamed from: a */
    public static sce0 m176023a(BLiveScrapBrief bLiveScrapBrief) {
        return new sce0(bLiveScrapBrief);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final List<sce0> m176024b(@Nullable List<? extends BLiveScrapBrief> scrapBriefList) {
        List<? extends BLiveScrapBrief> list = scrapBriefList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return jyb.m147486Q(list, new qcj() { // from class: l.pbe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qbe0.m176023a((BLiveScrapBrief) obj);
            }
        });
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m176025c(@NotNull Context context, @NotNull String expiredTimeFromService, boolean isRightScrap) {
        long jM174454o;
        context.getClass();
        expiredTimeFromService.getClass();
        try {
            jM174454o = Long.parseLong(expiredTimeFromService) * 1000;
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            jM174454o = pzi0.m174454o();
        }
        Date date = new Date();
        date.setTime(jM174454o);
        if (isRightScrap) {
            CharSequence text = context.getText(R$string.f48107gd);
            return ((Object) text) + pzi0.f154857d.format(date);
        }
        CharSequence text2 = context.getText(R$string.f47997bd);
        return ((Object) text2) + pzi0.f154857d.format(date);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m176026d(Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m176025c(context, str, z);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m176027e(@NotNull String scrapId) {
        String str;
        scrapId.getClass();
        BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(scrapId);
        return (bLiveGiftItemM135161m == null || (str = bLiveGiftItemM135161m.url) == null) ? "" : str;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m176028f(@Nullable String scrapIdOrTargetId) {
        BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(scrapIdOrTargetId);
        if (bLiveGiftItemM135161m == null) {
            return "";
        }
        String localName = bLiveGiftItemM135161m.localName.getLocalName();
        localName.getClass();
        return localName;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m176029g(@NotNull BLiveScrapBrief bLiveScrapBrief) {
        bLiveScrapBrief.getClass();
        return Intrinsics.m88377d("bagpack", bLiveScrapBrief.category);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m176030h(@NotNull BLiveScrapBrief bLiveScrapBrief) {
        bLiveScrapBrief.getClass();
        return Intrinsics.m88377d("giftRight", bLiveScrapBrief.category);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m176031i(@NotNull BLiveScrapBrief bLiveScrapBrief) {
        bLiveScrapBrief.getClass();
        return Intrinsics.m88377d(SchemeKey.liveRight, bLiveScrapBrief.category);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m176032j(@NotNull i6t<?, ?> presenter, @Nullable String targetScrapId) {
        presenter.getClass();
        ScrapDialogEventData scrapDialogEventData = new ScrapDialogEventData();
        scrapDialogEventData.targetScrapId = targetScrapId;
        presenter.m213811F2().ScrapInfoDialogEvent.show().mo199273j(scrapDialogEventData);
    }
}
