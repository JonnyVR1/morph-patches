package p153l;

import android.graphics.drawable.GradientDrawable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.card.LiveFeedSuggesstIntlStyleCardView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareSuggestItemView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\u00122\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/dwn;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveCoverLabel;", "coverLabel", "Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveSquareSuggestItemView;", "itemView", "", "b", "(Ljava/util/List;Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveSquareSuggestItemView;)V", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/common/card/LiveFeedSuggesstIntlStyleCardView;", "a", "(Ljava/util/List;Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/common/card/LiveFeedSuggesstIntlStyleCardView;)V", "", "e", "(Ljava/util/List;)Ljava/lang/String;", "", "linearGradient", "Landroid/graphics/drawable/GradientDrawable$Orientation;", Constants.INAPP_DATA_TAG, "(I)Landroid/graphics/drawable/GradientDrawable$Orientation;", "colorList", "position", "c", "(Ljava/util/List;I)I", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dwn {

    @NotNull
    public static final dwn INSTANCE = new dwn();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m118416a(@Nullable List<? extends BLiveCoverLabel> coverLabel, @NotNull LiveFeedSuggesstIntlStyleCardView itemView) {
        itemView.getClass();
        itemView.f46464h.removeAllViews();
        itemView.f46463g.removeAllViews();
        itemView.f46465i.removeAllViews();
        itemView.f46465i.setVisibility(4);
        if (coverLabel != null) {
            Iterator<? extends BLiveCoverLabel> it = coverLabel.iterator();
            while (it.hasNext()) {
                BLiveCoverLabel next = it.next();
                String str = next != null ? next.type : null;
                if (str != null) {
                    switch (str.hashCode()) {
                        case 65:
                            if (str.equals("A")) {
                                itemView.f46464h.setAPlateData(next);
                            }
                            break;
                        case 66:
                            if (str.equals("B")) {
                                itemView.f46464h.setBPlateData(next);
                            }
                            break;
                        case 67:
                            if (str.equals(c4s.C_ZONE)) {
                                itemView.f46464h.setCPlateData(next);
                            }
                            break;
                        case 68:
                            if (str.equals("D")) {
                                itemView.f46463g.m71517s(next);
                            }
                            break;
                        case 69:
                            if (str.equals("E")) {
                                itemView.f46465i.m71519Q(next);
                            }
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m118417b(@Nullable List<? extends BLiveCoverLabel> coverLabel, @NotNull IntlLiveSquareSuggestItemView itemView) {
        itemView.getClass();
        itemView.f46692h.removeAllViews();
        itemView.f46691g.removeAllViews();
        itemView.f46693i.removeAllViews();
        itemView.f46693i.setVisibility(4);
        if (coverLabel != null) {
            Iterator<? extends BLiveCoverLabel> it = coverLabel.iterator();
            while (it.hasNext()) {
                BLiveCoverLabel next = it.next();
                String str = next != null ? next.type : null;
                if (str != null) {
                    switch (str.hashCode()) {
                        case 65:
                            if (str.equals("A")) {
                                itemView.f46692h.setAPlateData(next);
                            }
                            break;
                        case 66:
                            if (str.equals("B")) {
                                itemView.f46692h.setBPlateData(next);
                            }
                            break;
                        case 67:
                            if (str.equals(c4s.C_ZONE)) {
                                itemView.f46692h.setCPlateData(next);
                            }
                            break;
                        case 68:
                            if (str.equals("D")) {
                                itemView.f46691g.m71517s(next);
                            }
                            break;
                        case 69:
                            if (str.equals("E")) {
                                itemView.f46693i.m71519Q(next);
                            }
                            break;
                    }
                }
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m118418e(@Nullable List<? extends BLiveCoverLabel> coverLabel) {
        if (coverLabel != null && !coverLabel.isEmpty()) {
            Iterator<? extends BLiveCoverLabel> it = coverLabel.iterator();
            while (it.hasNext()) {
                BLiveCoverLabel next = it.next();
                String str = next != null ? next.type : null;
                if (str != null && str.hashCode() == 69 && str.equals("E") && Intrinsics.m88377d(next.name, "红包")) {
                    return "1";
                }
            }
        }
        return "0";
    }

    /* JADX INFO: renamed from: c */
    public final int m118419c(@Nullable List<String> colorList, int position) {
        if (colorList == null || colorList.isEmpty() || position >= colorList.size()) {
            return 0;
        }
        return n3d0.m161284h(colorList.get(position), 0);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final GradientDrawable.Orientation m118420d(int linearGradient) {
        switch (linearGradient) {
            case 1:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 2:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 3:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 4:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 5:
                return GradientDrawable.Orientation.TL_BR;
            case 6:
                return GradientDrawable.Orientation.BL_TR;
            case 7:
                return GradientDrawable.Orientation.TR_BL;
            case 8:
                return GradientDrawable.Orientation.BR_TL;
            default:
                return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }
}
