package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallConnectionIconViewBindings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallConnectionIconView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallConnectionIconViewBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "picUrl", "", "renderSelf", "", "i0", "(Ljava/lang/String;Z)V", "", "g", "I", "userViewSize", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MultiCallConnectionIconView extends LiveMultiCallConnectionIconViewBindings {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int userViewSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallConnectionIconView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.userViewSize = qa00.f156294G;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76895i0(@NotNull String picUrl, boolean renderSelf) {
        User userM207651V;
        picUrl.getClass();
        izs.m142869t("context_common", this.f48828e, picUrl, this.userViewSize);
        bnl0.m105539W(this.f48828e, renderSelf ? qa00.f156289B : 0);
        bnl0.m105524M(this.f48829f, renderSelf);
        if (!renderSelf || (userM207651V = zrv.f205799a.m207651V()) == null) {
            return;
        }
        izs.m142869t("context_common", this.f48829f, userM207651V.m61308fp().url, this.userViewSize);
    }

    public /* synthetic */ MultiCallConnectionIconView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
