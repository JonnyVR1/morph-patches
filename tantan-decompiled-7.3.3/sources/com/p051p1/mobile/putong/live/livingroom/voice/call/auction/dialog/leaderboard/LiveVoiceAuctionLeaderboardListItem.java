package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.Sticker;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionLeaderboardItemBindings;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bf10;
import p153l.bnl0;
import p153l.fc2;
import p153l.fn2;
import p153l.i9n;
import p153l.izs;
import p153l.kom0;
import p153l.okc0;
import p153l.qa00;
import p153l.qim;
import p153l.yau;
import p153l.ynp0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListItem;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionLeaderboardItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/kom0;", "model", "", Constants.INAPP_DATA_TAG, "(Ll/kom0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", Item.TYPE, "", "type", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;Ljava/lang/String;)V", "", Sticker.GESTURE_TYPE_HEART, "b", "(I)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVoiceAuctionLeaderboardListItem extends LiveVoiceAuctionLeaderboardItemBindings {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListItem$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListItem$a", "Ll/fn2;", "", "id", "Ll/qim;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "", "h", "(Ljava/lang/String;Ll/qim;Landroid/graphics/drawable/Animatable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13154a extends fn2 {
        public C13154a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String id, qim imageInfo, Animatable animatable) {
            id.getClass();
            imageInfo.getClass();
            animatable.getClass();
            super.mo40111h(id, imageInfo, animatable);
            bnl0.m105507D0((int) (qa00.m175859d(14.0f) * (imageInfo.getWidth() / imageInfo.getHeight())), LiveVoiceAuctionLeaderboardListItem.this.f49054l);
            bnl0.m105505C0(LiveVoiceAuctionLeaderboardListItem.this.f49054l, qa00.m175859d(14.0f));
        }
    }

    public /* synthetic */ LiveVoiceAuctionLeaderboardListItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final String m79014b(int heart) {
        if (heart == 0) {
            return "0";
        }
        String strM214935c = yau.m214935c(heart);
        strM214935c.getClass();
        return strM214935c;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public final void m79015c(@NotNull BLiveAuctionLeaderboardItem item, @NotNull String type) {
        item.getClass();
        type.getClass();
        VText vText = this.f49048f;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f49045c.setTypeface(typeface);
        this.f49046d.setTypeface(typeface);
        if (TextUtils.equals(type, "today")) {
            bnl0.m105524M(this.f49044b, false);
            okc0.m168006f(this.f49048f, item.rank);
            int i = item.rank;
            if (1 <= i && i < 4) {
                bnl0.m105524M(this.f49048f, true);
                bnl0.m105524M(this.f49047e, true);
                boolean zM139127b = i9n.m139127b();
                AnimEffectPlayer animEffectPlayer = this.f49047e;
                if (zM139127b) {
                    animEffectPlayer.mo69685l(okc0.m168001a(item.rank), 1, null);
                } else {
                    animEffectPlayer.mo69685l(okc0.m168001a(item.rank), -1, null);
                }
                this.f49048f.setText(String.valueOf(item.rank));
            } else if (4 > i || i >= 100) {
                bnl0.m105524M(this.f49048f, true);
                bnl0.m105524M(this.f49047e, false);
                this.f49047e.m69688o();
                this.f49048f.setText("99+");
            } else {
                bnl0.m105524M(this.f49048f, true);
                bnl0.m105524M(this.f49047e, false);
                this.f49047e.m69688o();
                this.f49048f.setText(String.valueOf(item.rank));
            }
        } else {
            bnl0.m105524M(this.f49048f, false);
            bnl0.m105524M(this.f49047e, false);
            bnl0.m105524M(this.f49044b, true);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(item.auctionTime * 1000);
            this.f49045c.setText(String.valueOf(calendar.get(5)));
            VText vText2 = this.f49046d;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vText2.setText(String.format("%02d月", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(2) + 1)}, 1)));
        }
        VText vText3 = this.f49053k;
        String str = item.userInfo.userName;
        str.getClass();
        String strM103845w = bf10.m103845w(str, 4);
        String str2 = item.otherUserInfo.userName;
        str2.getClass();
        vText3.setText(strM103845w + " 拍下 " + bf10.m103845w(str2, 4));
        this.f49055m.setText(item.relationDetail.name);
        bnl0.m105524M(this.f49054l, TextUtils.isEmpty(item.relationDetail.tagImage) ^ true);
        bnl0.m105524M(this.f49055m, TextUtils.isEmpty(item.relationDetail.tagImage));
        if (TextUtils.isEmpty(item.relationDetail.tagImage)) {
            this.f49055m.setBackground(fc2.m124981k(ynp0.m216917B(item.relationDetail.startBgColor), ynp0.m216917B(item.relationDetail.endBgColor), 4, GradientDrawable.Orientation.LEFT_RIGHT));
        } else {
            izs.m142871v("context_livingAct", this.f49054l, item.relationDetail.tagImage, qa00.m175859d(61.0f), qa00.m175859d(14.0f), false, false, false, new C13154a());
        }
        bnl0.m105524M(this.f49056n, item.worth > 0);
        this.f49056n.setText(m79014b(item.worth));
        izs.m142868s("context_single_room", this.f49049g, item.userInfo.avatar);
        izs.m142868s("context_single_room", this.f49050h, item.otherUserInfo.avatar);
        bnl0.m105524M(this.f49051i, !TextUtils.isEmpty(item.userInfo.tagImage));
        izs.m142868s("context_single_room", this.f49051i, item.userInfo.tagImage);
        bnl0.m105524M(this.f49052j, !TextUtils.isEmpty(item.otherUserInfo.tagImage));
        izs.m142868s("context_single_room", this.f49052j, item.otherUserInfo.tagImage);
    }

    /* JADX INFO: renamed from: d */
    public final void m79016d(@NotNull kom0 model) {
        model.getClass();
        m79015c(model.getItem(), model.getType());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionLeaderboardListItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
