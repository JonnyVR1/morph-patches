package com.p046p1.mobile.putong.core.p053ui.vip.picks.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksGuideView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PicVerification;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d30;
import p149l.he70;
import p149l.q860;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00104\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u00107\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R(\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0017088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0017088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=¨\u0006C"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "direction", "Ll/d30;", "onClick", "e", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/d30;)V", "", "showFemaleStyle", "", Oauth2AccessToken.KEY_UID, "", Constants.INAPP_DATA_TAG, "(ZLjava/lang/String;)Ljava/util/List;", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", FirebaseAnalytics.Param.INDEX, "c", "(ZI)Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselView;", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselView;", "get_carousel_view", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselView;", "set_carousel_view", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselView;)V", "_carousel_view", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "get_subtitle", "set_subtitle", "_subtitle", "get_check", "set_check", "_check", "", "Ljava/util/List;", "getFemaleModelPictures", "()Ljava/util/List;", "setFemaleModelPictures", "(Ljava/util/List;)V", "femaleModelPictures", "f", "getMaleModelPictures", "setMaleModelPictures", "maleModelPictures", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class PicksGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public PicksGuideCarouselView _carousel_view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _check;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<String> femaleModelPictures;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public List<String> maleModelPictures;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.view.PicksGuideView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8972a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37417a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37417a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.femaleModelPictures = CollectionsKt.mutableListOf("https://auto.tancdn.com/v1/images/eyJpZCI6IjdPQzNXVElNRFhDNjZKS0pRWllCVkoySkk3RjJUWTExIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjM1OTUzNzU2MDIyNDEyNTgzfQ", "https://auto.tancdn.com/v1/images/eyJpZCI6IkNXQ0xMV0g2M0REUFJGTE9NU0FKSUk2VTdGSEoyWTExIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDgyMDY5NDg2NzU1NzQxMjgwN30", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpNRVVQTlZERlpGN1RQTTNOWk1NRE1BQ001QUlUNDEwIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzk2NjgzNzM2MTQyOTM3ODAwOH0", "https://auto.tancdn.com/v1/images/eyJpZCI6IktJUVRLMkNCWE9ZWE1NM1ZZUFE0UVdYWkVOSkdCUjExIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjQ4NzY4MjAzODMzMTUyNjQzN30", "https://auto.tancdn.com/v1/images/eyJpZCI6IkVWTTNFN1ZSRjU0UDNZRllSSzJBTkFVWlI3Q0FOTDEwIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTIxMTkzNTYyMzA1ODgxNDUwfQ");
        this.maleModelPictures = CollectionsKt.mutableListOf("https://auto.tancdn.com/v1/images/eyJpZCI6IllERjYzSzRWQk80NDRWMkhZUEpTV0tIUlpFRVVYWTExIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MzgzNDc5NzI1NjE4OTY2NTAwfQ", "https://auto.tancdn.com/v1/images/eyJpZCI6IktTNjVQR1JaT1RBSE1YSVo3Sk5TMlg1Qk1XQVo1QTExIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MzMwMDgwOTg2MzUxNTc0NzM1fQ", "https://auto.tancdn.com/v1/images/eyJpZCI6IlRYTjRVREdWM0hPRkhBU1NDQURPTkI0M1JYMkxMUDExIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MTc0OTk0OTQzOTkyNzQ1MTgxfQ", "https://auto.tancdn.com/v1/images/eyJpZCI6IlZTRklFWEtNVEZYSDIyVUg0SVFPQ1IzVlpNV1Q2MzExIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDgxNTQxMTU0NzM1MjQ4ODQ4NH0", "https://auto.tancdn.com/v1/images/eyJpZCI6IjQzR0lUWFJNVllZSVJENlBVMlVHQUIzUlBHNkhQWjExIiwidyI6NTAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjU1MjI3NzQ4MzYwMzkxMzE3M30");
    }

    /* JADX INFO: renamed from: a */
    public static void m56811a(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: b */
    public final void m56812b(View view) {
        he70.m130621a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final User m56813c(boolean showFemaleStyle, int index) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        userMo223809clone.getClass();
        userMo223809clone.f56011id = "picks_guide";
        List<String> list = showFemaleStyle ? this.femaleModelPictures : this.maleModelPictures;
        String str = list.get(index % list.size());
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = str;
        userMo223809clone.pictures = CollectionsKt.listOf(pictureNew_);
        userMo223809clone.location.passby = null;
        PicVerification picVerification = userMo223809clone.verifications;
        picVerification.idCard.verified = true;
        picVerification.picVerificationResult.verified = true;
        return userMo223809clone;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<User> m56814d(boolean showFemaleStyle, @NotNull String uid) {
        User userM169430Pa;
        uid.getClass();
        q860<PicksUser> q860VarM184466F3 = CoreModule.f17545c.f19658k1.m184466F3();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(q860VarM184466F3) && !vwb.m200296J(q860VarM184466F3.f153135a)) {
            for (PicksUser picksUser : q860VarM184466F3.f153135a) {
                if (!TextUtils.equals(picksUser.f20468id, uid) && (userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(picksUser.f20468id)) != null) {
                    arrayList.add(userM169430Pa);
                }
                if (arrayList.size() >= 5) {
                    break;
                }
            }
        }
        while (arrayList.size() < 5) {
            arrayList.add(m56813c(showFemaleStyle, arrayList.size()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final void m56815e(@NotNull User user, @NotNull SwipeDirection direction, @NotNull final d30 onClick) {
        String str;
        user.getClass();
        direction.getClass();
        onClick.getClass();
        boolean zEquals = TEnum.equals(user.gender, "female");
        String str2 = zEquals ? "发现更多心动女孩" : "发现更多心动男孩";
        int i = C8972a.f37417a[direction.ordinal()];
        if (i == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("你超级喜欢了%s", Arrays.copyOf(new Object[]{user.name}, 1));
        } else if (i != 2) {
            str = null;
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("你喜欢了%s", Arrays.copyOf(new Object[]{user.name}, 1));
        }
        get_title().setText(str2);
        get_subtitle().setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        get_subtitle().setText(str);
        get_check().setText("查看");
        String str3 = user.f56011id;
        str3.getClass();
        get_carousel_view().m56808l(zEquals, m56814d(zEquals, str3));
        get_carousel_view().m56809m();
        setOnClickListener(new View.OnClickListener() { // from class: l.ge70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicksGuideView.m56811a(onClick, view);
            }
        });
    }

    @NotNull
    public final List<String> getFemaleModelPictures() {
        return this.femaleModelPictures;
    }

    @NotNull
    public final List<String> getMaleModelPictures() {
        return this.maleModelPictures;
    }

    @NotNull
    public final PicksGuideCarouselView get_carousel_view() {
        PicksGuideCarouselView picksGuideCarouselView = this._carousel_view;
        if (picksGuideCarouselView != null) {
            return picksGuideCarouselView;
        }
        Intrinsics.m87502r("_carousel_view");
        return null;
    }

    @NotNull
    public final TextView get_check() {
        TextView textView = this._check;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_check");
        return null;
    }

    @NotNull
    public final TextView get_subtitle() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56812b(this);
    }

    public final void setFemaleModelPictures(@NotNull List<String> list) {
        list.getClass();
        this.femaleModelPictures = list;
    }

    public final void setMaleModelPictures(@NotNull List<String> list) {
        list.getClass();
        this.maleModelPictures = list;
    }

    public final void set_carousel_view(@NotNull PicksGuideCarouselView picksGuideCarouselView) {
        picksGuideCarouselView.getClass();
        this._carousel_view = picksGuideCarouselView;
    }

    public final void set_check(@NotNull TextView textView) {
        textView.getClass();
        this._check = textView;
    }

    public final void set_subtitle(@NotNull TextView textView) {
        textView.getClass();
        this._subtitle = textView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PicksGuideView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
