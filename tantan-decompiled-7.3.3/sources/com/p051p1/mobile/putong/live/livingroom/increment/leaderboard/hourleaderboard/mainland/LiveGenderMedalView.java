package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.igs;
import p153l.obc0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "Lv/VLinear;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "gender", SeeTextDynamicParam.age, "", "isFromRoomBoard", "Q", "(Ljava/lang/String;IZ)V", "Landroid/view/View;", OMSTemplateModeType.view, "P", "(Landroid/view/View;)V", "c", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/LiveGenderMedalView;)V", "_root", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_gender", "()Lv/VImage;", "set_gender", "(Lv/VImage;)V", "_gender", "Lv/VText;", "e", "Lv/VText;", "get_age", "()Lv/VText;", "set_age", "(Lv/VText;)V", "_age", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveGenderMedalView extends VLinear {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public LiveGenderMedalView _root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _gender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _age;

    public /* synthetic */ LiveGenderMedalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: P */
    public final void m76071P(View view) {
        igs.m139951a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m76072Q(@NotNull String gender, int age, boolean isFromRoomBoard) {
        gender.getClass();
        boolean zEquals = TextUtils.equals(gender, "male");
        get_gender().setBackgroundResource(zEquals ? obc0.f146324ea : obc0.f146312da);
        get_age().setText(String.valueOf(age));
        setBackgroundResource(zEquals ? obc0.f146565z : obc0.f146014E0);
        if (isFromRoomBoard) {
            return;
        }
        bnl0.m105524M(get_root(), !zrv.m221193k().m203589b7());
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_age");
        return null;
    }

    @NotNull
    public final VImage get_gender() {
        VImage vImage = this._gender;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_gender");
        return null;
    }

    @NotNull
    public final LiveGenderMedalView get_root() {
        LiveGenderMedalView liveGenderMedalView = this._root;
        if (liveGenderMedalView != null) {
            return liveGenderMedalView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76071P(this);
    }

    public final void set_age(@NotNull VText vText) {
        vText.getClass();
        this._age = vText;
    }

    public final void set_gender(@NotNull VImage vImage) {
        vImage.getClass();
        this._gender = vImage;
    }

    public final void set_root(@NotNull LiveGenderMedalView liveGenderMedalView) {
        liveGenderMedalView.getClass();
        this._root = liveGenderMedalView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGenderMedalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGenderMedalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGenderMedalView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
