package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallConnectionIconViewBindings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallConnectionIconView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallConnectionIconViewBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "picUrl", "", "renderSelf", "", "i0", "(Ljava/lang/String;Z)V", "", "g", "I", "userViewSize", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallConnectionIconView extends LiveMultiCallConnectionIconViewBindings {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int userViewSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallConnectionIconView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.userViewSize = t100.f167232G;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75712i0(@NotNull String picUrl, boolean renderSelf) {
        User userM199329V;
        picUrl.getClass();
        hxs.m133407t("context_common", this.f47980e, picUrl, this.userViewSize);
        xdl0.m208359W(this.f47980e, renderSelf ? t100.f167227B : 0);
        xdl0.m208344M(this.f47981f, renderSelf);
        if (!renderSelf || (userM199329V = ypv.f199493a.m199329V()) == null) {
            return;
        }
        hxs.m133407t("context_common", this.f47981f, userM199329V.m60124fp().url, this.userViewSize);
    }

    public /* synthetic */ MultiCallConnectionIconView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
