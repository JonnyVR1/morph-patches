package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderUserView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8774c;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bsj0;
import p153l.dbc0;
import p153l.fo0;
import p153l.jyb;
import p153l.kcg0;
import p153l.p9r;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.s1c0;
import p153l.uqb0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\"JK\u0010,\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020$0*¢\u0006\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010U\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010H\u001a\u0004\bS\u0010J\"\u0004\bT\u0010LR\"\u0010Y\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010H\u001a\u0004\bW\u0010J\"\u0004\bX\u0010LR\"\u0010]\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010H\u001a\u0004\b[\u0010J\"\u0004\b\\\u0010LR\"\u0010a\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010H\u001a\u0004\b_\u0010J\"\u0004\b`\u0010LR\"\u0010h\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0017\u0010r\u001a\u00020m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\"\u0010y\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x¨\u0006z"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "lastTime", "", "r0", "(J)Ljava/lang/CharSequence;", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "", "q0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "s0", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "p0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "u0", "()V", "t0", "", "isMatch", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "matchUser", "Ll/z20;", "click", "Ll/y20;", "close", "v0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;ZLcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;Ll/z20;Ll/y20;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_profile_user", "()Lv/VDraweeView;", "set_profile_user", "(Lv/VDraweeView;)V", "_profile_user", "Lv/VImage;", "e", "Lv/VImage;", "get_green", "()Lv/VImage;", "set_green", "(Lv/VImage;)V", "_green", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "Lv/VText;", "g", "Lv/VText;", "get_sex", "()Lv/VText;", "set_sex", "(Lv/VText;)V", "_sex", "h", "get_close", "set_close", "_close", RXScreenCaptureService.KEY_INDEX, "get_tag1", "set_tag1", "_tag1", "j", "get_tag2", "set_tag2", "_tag2", "k", "get_tag3", "set_tag3", "_tag3", BLiveStormDanmakuGiftResourceType.f45292l, "get_gotochat", "set_gotochat", "_gotochat", "m", "Z", "getReceiverUserIsFemale", "()Z", "setReceiverUserIsFemale", "(Z)V", "receiverUserIsFemale", "Ll/kcg0;", "n", "Ll/kcg0;", "animatorTextTimerSub", "Ljava/text/DecimalFormat;", "o", "Ljava/text/DecimalFormat;", "getDecimalFormat", "()Ljava/text/DecimalFormat;", "decimalFormat", "p", "J", "getBroadcastTextTimerValue", "()J", "setBroadcastTextTimerValue", "(J)V", "broadcastTextTimerValue", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class QuickChatHeaderUserView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _profile_user;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _green;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _sex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _tag1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _tag2;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _tag3;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _gotochat;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean receiverUserIsFemale;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public kcg0 animatorTextTimerSub;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final DecimalFormat decimalFormat;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long broadcastTextTimerValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderUserView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m43094o0(layoutInflaterM171370a, this);
        get_tag1().setText("[得意]");
        get_tag2().setText("[玫瑰]");
        get_tag3().setText("[啤酒]");
        this.broadcastTextTimerValue = -1L;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m43087h0(z20 z20Var, boolean z, QuickChatHeaderUserView quickChatHeaderUserView, View view) {
        z20Var.call(Boolean.valueOf(z), quickChatHeaderUserView.get_tag1().getText().toString());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m43088i0(z20 z20Var, boolean z, View view) {
        z20Var.call(Boolean.valueOf(z), null);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m43089j0(QuickChatHeaderUserView quickChatHeaderUserView, Long l2) {
        long jM174454o = (pzi0.m174454o() - C8774c.INSTANCE.m51485a().getBroadcastTextTimerValue()) / 1000;
        if (jM174454o < 30) {
            quickChatHeaderUserView.get_gotochat().setText(quickChatHeaderUserView.m43097r0(30 - jM174454o));
            return;
        }
        quickChatHeaderUserView.broadcastTextTimerValue = -1L;
        bsj0.m106263U(quickChatHeaderUserView.animatorTextTimerSub);
        quickChatHeaderUserView.get_gotochat().setText("即刻聊天");
    }

    /* JADX INFO: renamed from: k0 */
    public static void m43090k0(z20 z20Var, boolean z, QuickChatHeaderUserView quickChatHeaderUserView, View view) {
        z20Var.call(Boolean.valueOf(z), quickChatHeaderUserView.get_tag2().getText().toString());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m43091l0(z20 z20Var, boolean z, QuickChatHeaderUserView quickChatHeaderUserView, View view) {
        z20Var.call(Boolean.valueOf(z), quickChatHeaderUserView.get_tag3().getText().toString());
    }

    /* JADX INFO: renamed from: m0 */
    public static void m43092m0(y20 y20Var, boolean z, View view) {
        y20Var.call(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: n0 */
    public static void m43093n0(z20 z20Var, boolean z, View view) {
        z20Var.call(Boolean.valueOf(z), null);
    }

    public final long getBroadcastTextTimerValue() {
        return this.broadcastTextTimerValue;
    }

    @NotNull
    public final DecimalFormat getDecimalFormat() {
        return this.decimalFormat;
    }

    public final boolean getReceiverUserIsFemale() {
        return this.receiverUserIsFemale;
    }

    @NotNull
    public final VImage get_close() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    public final VText get_gotochat() {
        VText vText = this._gotochat;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_gotochat");
        return null;
    }

    @NotNull
    public final VImage get_green() {
        VImage vImage = this._green;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_green");
        return null;
    }

    @NotNull
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final VDraweeView get_profile_user() {
        VDraweeView vDraweeView = this._profile_user;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_profile_user");
        return null;
    }

    @NotNull
    public final VText get_sex() {
        VText vText = this._sex;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sex");
        return null;
    }

    @NotNull
    public final VText get_tag1() {
        VText vText = this._tag1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tag1");
        return null;
    }

    @NotNull
    public final VText get_tag2() {
        VText vText = this._tag2;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tag2");
        return null;
    }

    @NotNull
    public final VText get_tag3() {
        VText vText = this._tag3;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tag3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final View m43094o0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM184025b = s1c0.m184025b(this, inflater, parent);
        viewM184025b.getClass();
        return viewM184025b;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m43095p0(OnlineMatchPushUser onlineMatchPushUser) {
        User user = onlineMatchPushUser.user;
        if (!TextUtils.isEmpty(user.description)) {
            VText vText = get_sex();
            String str = user.description;
            str.getClass();
            vText.setText("“" + C15493d.m94370F(str, SignParameters.NEW_LINE, "", false, 4, null) + "”");
            return;
        }
        if (jyb.m147479J(user.profile.tags)) {
            get_sex().setText((onlineMatchPushUser.isFemale() ? "她" : "他").concat("正在等你聊天..."));
            return;
        }
        int iMin = Math.min(3, user.profile.tags.size());
        List<Tag> list = user.profile.tags;
        list.getClass();
        List listTake = CollectionsKt.take(list, iMin);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            arrayList.add(((Tag) it.next()).value);
        }
        get_sex().setText(CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m43096q0(OnlineMatchPushUser onlineMatchPushUser) {
        String str = onlineMatchPushUser.isFemale() ? "她" : "他";
        if (CoreModule.f18264c.f20381e0.m116600p9().isFemale() && (TEnum.equals(onlineMatchPushUser.rsStateReceiverToSender, "superliked") || TEnum.equals(onlineMatchPushUser.rsStateReceiverToSender, "liked"))) {
            boolean zEquals = TEnum.equals(onlineMatchPushUser.rsStateReceiverToSender, "superliked");
            get_name().setText((zEquals ? "超级" : "") + "喜欢过" + str);
            get_name().setCompoundDrawablesWithIntrinsicBounds(zEquals ? dbc0.f87160ko : dbc0.f87127jo, 0, 0, 0);
            return;
        }
        String strM43098s0 = onlineMatchPushUser.distance >= 20000 ? null : m43098s0(onlineMatchPushUser.user);
        if (strM43098s0 != null) {
            get_name().setText(onlineMatchPushUser.age + "岁 " + strM43098s0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C8772a.m51401B(onlineMatchPushUser.birthday));
        } else {
            get_name().setText(onlineMatchPushUser.age + "岁 " + C8772a.m51401B(onlineMatchPushUser.birthday));
        }
        get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: r0 */
    public final CharSequence m43097r0(long lastTime) {
        StringBuilder sb;
        String str;
        if (lastTime < 10) {
            sb = new StringBuilder("即刻聊天 ");
            sb.append(lastTime);
            str = "s ";
        } else {
            sb = new StringBuilder("即刻聊天 ");
            sb.append(lastTime);
            str = BLiveStormDanmakuGiftResourceType.f45294s;
        }
        sb.append(str);
        String string = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), StringsKt.m94327c0(string, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, 0, false, 6, null), string.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: s0 */
    public final String m43098s0(User user) {
        if (user == null) {
            return null;
        }
        Location location = user.location;
        if (location.distance >= 20000 && !TextUtils.isEmpty(location.region.city)) {
            return user.location.region.city;
        }
        int i = user.location.distance;
        if (i < 1000) {
            return i + "m";
        }
        return this.decimalFormat.format(i / 1000.0f) + "km";
    }

    public final void setBroadcastTextTimerValue(long j) {
        this.broadcastTextTimerValue = j;
    }

    public final void setReceiverUserIsFemale(boolean z) {
        this.receiverUserIsFemale = z;
    }

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_gotochat(@NotNull VText vText) {
        vText.getClass();
        this._gotochat = vText;
    }

    public final void set_green(@NotNull VImage vImage) {
        vImage.getClass();
        this._green = vImage;
    }

    public final void set_name(@NotNull TextView textView) {
        textView.getClass();
        this._name = textView;
    }

    public final void set_profile_user(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._profile_user = vDraweeView;
    }

    public final void set_sex(@NotNull VText vText) {
        vText.getClass();
        this._sex = vText;
    }

    public final void set_tag1(@NotNull VText vText) {
        vText.getClass();
        this._tag1 = vText;
    }

    public final void set_tag2(@NotNull VText vText) {
        vText.getClass();
        this._tag2 = vText;
    }

    public final void set_tag3(@NotNull VText vText) {
        vText.getClass();
        this._tag3 = vText;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m43099t0() {
        bsj0.m106263U(this.animatorTextTimerSub);
        this.animatorTextTimerSub = C22421c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.l1c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatHeaderUserView.m43089j0(this.f129665a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m43100u0() {
        bsj0.m106263U(this.animatorTextTimerSub);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m43101v0(@Nullable OnlineMatchPushUser onlineMatchPushUser, final boolean isMatch, @Nullable OnlineMatchMatchUser matchUser, @NotNull final z20<Boolean, String> click, @NotNull final y20<Boolean> close) {
        User user;
        click.getClass();
        close.getClass();
        if (isMatch) {
            if (matchUser == null || (user = matchUser.user) == null) {
                return;
            }
            uqb0.f180374G.m127120O(get_profile_user(), user.m61308fp().profileSmall().formatted(), 4, user.isFemale() ? 4 : 8);
            get_name().setText(user.age + "岁 " + m43098s0(user) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + q8g0.m175804j0(user.profile.zodiac));
            get_sex().setText((user.isFemale() ? "她" : "他").concat("正在等你聊天..."));
            get_gotochat().setText("即刻聊天");
        } else {
            if (onlineMatchPushUser == null) {
                return;
            }
            uqb0.f180374G.m127120O(get_profile_user(), onlineMatchPushUser.avatarUrl, 4, onlineMatchPushUser.isFemale() ? 4 : 8);
            m43096q0(onlineMatchPushUser);
            m43095p0(onlineMatchPushUser);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.m1c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m43088i0(click, isMatch, view);
            }
        });
        get_tag1().setOnClickListener(new View.OnClickListener() { // from class: l.n1c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m43087h0(click, isMatch, this, view);
            }
        });
        get_tag2().setOnClickListener(new View.OnClickListener() { // from class: l.o1c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m43090k0(click, isMatch, this, view);
            }
        });
        get_tag3().setOnClickListener(new View.OnClickListener() { // from class: l.p1c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m43091l0(click, isMatch, this, view);
            }
        });
        get_gotochat().setOnClickListener(new View.OnClickListener() { // from class: l.q1c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m43093n0(click, isMatch, view);
            }
        });
        get_close().setOnClickListener(new View.OnClickListener() { // from class: l.r1c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m43092m0(close, isMatch, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderUserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderUserView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ QuickChatHeaderUserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
