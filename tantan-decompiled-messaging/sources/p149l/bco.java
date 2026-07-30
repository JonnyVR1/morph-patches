package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.intl.common.IntlMediaNoticeSettingView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, m87232d2 = {"Ll/bco;", "Ll/cco;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Landroid/view/View;", "a", "(Lcom/p1/mobile/android/app/Act;)Landroid/view/View;", "", "release", "Lcom/p1/mobile/putong/live/external/intl/common/IntlMediaNoticeSettingView;", "Lcom/p1/mobile/putong/live/external/intl/common/IntlMediaNoticeSettingView;", "settingView", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class bco implements cco {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public IntlMediaNoticeSettingView settingView;

    @Override // p149l.cco
    @Nullable
    /* JADX INFO: renamed from: a */
    public View mo101096a(@NotNull Act act) {
        act.getClass();
        if (!qib0.f154713b0.f139232c.mo67278p8() || !uvr.m196087d().m162681M0()) {
            return null;
        }
        IntlMediaNoticeSettingView intlMediaNoticeSettingView = new IntlMediaNoticeSettingView(act);
        this.settingView = intlMediaNoticeSettingView;
        return intlMediaNoticeSettingView;
    }

    @Override // p149l.cco
    public void release() {
        IntlMediaNoticeSettingView intlMediaNoticeSettingView = this.settingView;
        if (intlMediaNoticeSettingView != null) {
            intlMediaNoticeSettingView.m69923m();
        }
        this.settingView = null;
    }
}
