package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallFriendRollViewBindings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hxs;
import p149l.j5d0;
import p149l.mqv;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallFriendRollViewBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "resId", "", "setRollBackground", "(I)V", "dp", "setViewPadding", "Ll/mqv;", "Ll/j5d0;", "user", "a", "(Ll/mqv;)V", Constants.INAPP_DATA_TAG, "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallFriendsRollUserView extends LiveMultiCallFriendRollViewBindings {
    public /* synthetic */ MultiCallFriendsRollUserView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // com.p046p1.mobile.putong.live.base.view.RollItemView
    /* JADX INFO: renamed from: a */
    public void mo68836a(@NotNull mqv<j5d0> user) {
        user.getClass();
        if (user.f135304a.getResId() > 0) {
            this.f47983b.setImageResource(user.f135304a.getResId());
        } else {
            if (TextUtils.isEmpty(user.f135304a.getPicUrl())) {
                return;
            }
            hxs.m133402o("context_single_room", this.f47983b, user.f135304a.getPicUrl());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m75713d() {
        this.f47983b.setBackground(null);
    }

    public final void setRollBackground(@DrawableRes int resId) {
        this.f47983b.setBackgroundResource(resId);
    }

    public final void setViewPadding(int dp) {
        xdl0.m208378h0(this.f47983b, dp);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallFriendsRollUserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
