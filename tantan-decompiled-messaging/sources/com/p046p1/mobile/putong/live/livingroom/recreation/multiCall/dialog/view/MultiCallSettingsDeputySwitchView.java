package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallSettingsViewDeputySwitchBindings;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.w8u;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR0\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallSettingsDeputySwitchView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallSettingsViewDeputySwitchBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "value", RXScreenCaptureService.KEY_INDEX, "I", "getSelectedCount", "()I", "setSelectedCount", "(I)V", "getSelectedCount$annotations", "selectedCount", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallSettingsDeputySwitchView extends LiveMultiCallSettingsViewDeputySwitchBindings {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int selectedCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallSettingsDeputySwitchView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    public static /* synthetic */ void getSelectedCount$annotations() {
    }

    public final int getSelectedCount() {
        return this.selectedCount;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallSettingsViewDeputySwitchBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        VText vText = this.f48044f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM202217t = w8u.m202217t(R$string.f44159d0);
        strM202217t.getClass();
        vText.setText(String.format(strM202217t, Arrays.copyOf(new Object[]{4}, 1)));
        VText vText2 = this.f48045g;
        String strM202217t2 = w8u.m202217t(R$string.f44159d0);
        strM202217t2.getClass();
        vText2.setText(String.format(strM202217t2, Arrays.copyOf(new Object[]{6}, 1)));
        VText vText3 = this.f48046h;
        String strM202217t3 = w8u.m202217t(R$string.f44159d0);
        strM202217t3.getClass();
        vText3.setText(String.format(strM202217t3, Arrays.copyOf(new Object[]{9}, 1)));
    }

    public final void setSelectedCount(int i) {
        if (i == 4) {
            VText vText = this.f48044f;
            vText.setSelected(true);
            vText.setTextColor(-98787);
            VText vText2 = this.f48045g;
            vText2.setSelected(false);
            vText2.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            VText vText3 = this.f48046h;
            vText3.setSelected(false);
            vText3.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        } else if (i == 6) {
            VText vText4 = this.f48044f;
            vText4.setSelected(false);
            vText4.setTextColor(637534208);
            VText vText5 = this.f48045g;
            vText5.setSelected(true);
            vText5.setTextColor(-98787);
            VText vText6 = this.f48046h;
            vText6.setSelected(false);
            vText6.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        } else if (i == 9) {
            VText vText7 = this.f48044f;
            vText7.setSelected(false);
            vText7.setTextColor(637534208);
            VText vText8 = this.f48045g;
            vText8.setSelected(false);
            vText8.setTextColor(637534208);
            VText vText9 = this.f48046h;
            vText9.setSelected(true);
            vText9.setTextColor(-98787);
        }
        this.selectedCount = i;
    }
}
