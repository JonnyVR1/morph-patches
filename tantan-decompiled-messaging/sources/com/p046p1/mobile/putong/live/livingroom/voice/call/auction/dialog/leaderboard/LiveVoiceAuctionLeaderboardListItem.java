package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.Sticker;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionLeaderboardItemBindings;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.gfm0;
import p149l.hcc0;
import p149l.hxs;
import p149l.i7n;
import p149l.ngm;
import p149l.r610;
import p149l.t100;
import p149l.uep0;
import p149l.x8u;
import p149l.xdl0;
import p149l.yb2;
import p149l.ym2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListItem;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionLeaderboardItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/gfm0;", "model", "", Constants.INAPP_DATA_TAG, "(Ll/gfm0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", Item.TYPE, "", "type", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;Ljava/lang/String;)V", "", Sticker.GESTURE_TYPE_HEART, "b", "(I)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVoiceAuctionLeaderboardListItem extends LiveVoiceAuctionLeaderboardItemBindings {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListItem$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListItem$a", "Ll/ym2;", "", "id", "Ll/ngm;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "", "h", "(Ljava/lang/String;Ll/ngm;Landroid/graphics/drawable/Animatable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12991a extends ym2 {
        public C12991a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String id, ngm imageInfo, Animatable animatable) {
            id.getClass();
            imageInfo.getClass();
            animatable.getClass();
            super.mo39108h(id, imageInfo, animatable);
            xdl0.m208327D0((int) (t100.m186890d(14.0f) * (imageInfo.getWidth() / imageInfo.getHeight())), LiveVoiceAuctionLeaderboardListItem.this.f48206l);
            xdl0.m208325C0(LiveVoiceAuctionLeaderboardListItem.this.f48206l, t100.m186890d(14.0f));
        }
    }

    public /* synthetic */ LiveVoiceAuctionLeaderboardListItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final String m77831b(int heart) {
        if (heart == 0) {
            return "0";
        }
        String strM207433c = x8u.m207433c(heart);
        strM207433c.getClass();
        return strM207433c;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public final void m77832c(@NotNull BLiveAuctionLeaderboardItem item, @NotNull String type) {
        item.getClass();
        type.getClass();
        VText vText = this.f48200f;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f48197c.setTypeface(typeface);
        this.f48198d.setTypeface(typeface);
        if (TextUtils.equals(type, "today")) {
            xdl0.m208344M(this.f48196b, false);
            hcc0.m130421f(this.f48200f, item.rank);
            int i = item.rank;
            if (1 <= i && i < 4) {
                xdl0.m208344M(this.f48200f, true);
                xdl0.m208344M(this.f48199e, true);
                boolean zM134916b = i7n.m134916b();
                AnimEffectPlayer animEffectPlayer = this.f48199e;
                if (zM134916b) {
                    animEffectPlayer.mo68502l(hcc0.m130416a(item.rank), 1, null);
                } else {
                    animEffectPlayer.mo68502l(hcc0.m130416a(item.rank), -1, null);
                }
                this.f48200f.setText(String.valueOf(item.rank));
            } else if (4 > i || i >= 100) {
                xdl0.m208344M(this.f48200f, true);
                xdl0.m208344M(this.f48199e, false);
                this.f48199e.m68505o();
                this.f48200f.setText("99+");
            } else {
                xdl0.m208344M(this.f48200f, true);
                xdl0.m208344M(this.f48199e, false);
                this.f48199e.m68505o();
                this.f48200f.setText(String.valueOf(item.rank));
            }
        } else {
            xdl0.m208344M(this.f48200f, false);
            xdl0.m208344M(this.f48199e, false);
            xdl0.m208344M(this.f48196b, true);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(item.auctionTime * 1000);
            this.f48197c.setText(String.valueOf(calendar.get(5)));
            VText vText2 = this.f48198d;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vText2.setText(String.format("%02d月", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(2) + 1)}, 1)));
        }
        VText vText3 = this.f48205k;
        String str = item.userInfo.userName;
        str.getClass();
        String strM178016w = r610.m178016w(str, 4);
        String str2 = item.otherUserInfo.userName;
        str2.getClass();
        vText3.setText(strM178016w + " 拍下 " + r610.m178016w(str2, 4));
        this.f48207m.setText(item.relationDetail.name);
        xdl0.m208344M(this.f48206l, TextUtils.isEmpty(item.relationDetail.tagImage) ^ true);
        xdl0.m208344M(this.f48207m, TextUtils.isEmpty(item.relationDetail.tagImage));
        if (TextUtils.isEmpty(item.relationDetail.tagImage)) {
            this.f48207m.setBackground(yb2.m213886k(uep0.m193307B(item.relationDetail.startBgColor), uep0.m193307B(item.relationDetail.endBgColor), 4, GradientDrawable.Orientation.LEFT_RIGHT));
        } else {
            hxs.m133409v("context_livingAct", this.f48206l, item.relationDetail.tagImage, t100.m186890d(61.0f), t100.m186890d(14.0f), false, false, false, new C12991a());
        }
        xdl0.m208344M(this.f48208n, item.worth > 0);
        this.f48208n.setText(m77831b(item.worth));
        hxs.m133406s("context_single_room", this.f48201g, item.userInfo.avatar);
        hxs.m133406s("context_single_room", this.f48202h, item.otherUserInfo.avatar);
        xdl0.m208344M(this.f48203i, !TextUtils.isEmpty(item.userInfo.tagImage));
        hxs.m133406s("context_single_room", this.f48203i, item.userInfo.tagImage);
        xdl0.m208344M(this.f48204j, !TextUtils.isEmpty(item.otherUserInfo.tagImage));
        hxs.m133406s("context_single_room", this.f48204j, item.otherUserInfo.tagImage);
    }

    /* JADX INFO: renamed from: d */
    public final void m77833d(@NotNull gfm0 model) {
        model.getClass();
        m77832c(model.getItem(), model.getType());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionLeaderboardListItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
