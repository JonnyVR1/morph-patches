package com.p000p1.mobile.putong.core.newui.messages.anim.view;

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
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderUserView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.onlinematch.c;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.c4g0;
import l.e30;
import l.f30;
import l.jo0;
import l.mkd0;
import l.otb0;
import l.qib0;
import l.vwb;
import l.x2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.i0g0;
import p009l.mqi0;
import p009l.o7r;
import p009l.yij0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\"JK\u0010,\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020$0*¢\u0006\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010U\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010H\u001a\u0004\bS\u0010J\"\u0004\bT\u0010LR\"\u0010Y\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010H\u001a\u0004\bW\u0010J\"\u0004\bX\u0010LR\"\u0010]\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010H\u001a\u0004\b[\u0010J\"\u0004\b\\\u0010LR\"\u0010a\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010H\u001a\u0004\b_\u0010J\"\u0004\b`\u0010LR\"\u0010h\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0017\u0010r\u001a\u00020m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\"\u0010y\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x¨\u0006z"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "lastTime", "", "r0", "(J)Ljava/lang/CharSequence;", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "", "q0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "s0", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "p0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "u0", "()V", "t0", "", "isMatch", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "matchUser", "Ll/f30;", "click", "Ll/e30;", "close", "v0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;ZLcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;Ll/f30;Ll/e30;)V", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_profile_user", "()Lv/VDraweeView;", "set_profile_user", "(Lv/VDraweeView;)V", "_profile_user", "Lv/VImage;", "e", "Lv/VImage;", "get_green", "()Lv/VImage;", "set_green", "(Lv/VImage;)V", "_green", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "Lv/VText;", "g", "Lv/VText;", "get_sex", "()Lv/VText;", "set_sex", "(Lv/VText;)V", "_sex", "h", "get_close", "set_close", "_close", "i", "get_tag1", "set_tag1", "_tag1", "j", "get_tag2", "set_tag2", "_tag2", "k", "get_tag3", "set_tag3", "_tag3", "l", "get_gotochat", "set_gotochat", "_gotochat", "m", "Z", "getReceiverUserIsFemale", "()Z", "setReceiverUserIsFemale", "(Z)V", "receiverUserIsFemale", "Ll/c4g0;", "n", "Ll/c4g0;", "animatorTextTimerSub", "Ljava/text/DecimalFormat;", "o", "Ljava/text/DecimalFormat;", "getDecimalFormat", "()Ljava/text/DecimalFormat;", "decimalFormat", "p", "J", "getBroadcastTextTimerValue", "()J", "setBroadcastTextTimerValue", "(J)V", "broadcastTextTimerValue", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public c4g0 animatorTextTimerSub;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final DecimalFormat decimalFormat;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long broadcastTextTimerValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public QuickChatHeaderUserView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.decimalFormat = new DecimalFormat("0.0");
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(getContext());
        layoutInflaterM19649a.getClass();
        m6225o0(layoutInflaterM19649a, this);
        get_tag1().setText("[得意]");
        get_tag2().setText("[玫瑰]");
        get_tag3().setText("[啤酒]");
        this.broadcastTextTimerValue = -1L;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m6218h0(f30 f30Var, boolean z, QuickChatHeaderUserView quickChatHeaderUserView, View view) {
        f30Var.call(Boolean.valueOf(z), quickChatHeaderUserView.get_tag1().getText().toString());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m6219i0(f30 f30Var, boolean z, View view) {
        f30Var.call(Boolean.valueOf(z), (Object) null);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m6220j0(QuickChatHeaderUserView quickChatHeaderUserView, Long l2) {
        long jM18550o = (mqi0.m18550o() - c.Companion.a().c()) / 1000;
        if (jM18550o < 30) {
            quickChatHeaderUserView.get_gotochat().setText(quickChatHeaderUserView.m6228r0(30 - jM18550o));
            return;
        }
        quickChatHeaderUserView.broadcastTextTimerValue = -1L;
        yij0.m25399U(quickChatHeaderUserView.animatorTextTimerSub);
        quickChatHeaderUserView.get_gotochat().setText("即刻聊天");
    }

    /* JADX INFO: renamed from: k0 */
    public static void m6221k0(f30 f30Var, boolean z, QuickChatHeaderUserView quickChatHeaderUserView, View view) {
        f30Var.call(Boolean.valueOf(z), quickChatHeaderUserView.get_tag2().getText().toString());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m6222l0(f30 f30Var, boolean z, QuickChatHeaderUserView quickChatHeaderUserView, View view) {
        f30Var.call(Boolean.valueOf(z), quickChatHeaderUserView.get_tag3().getText().toString());
    }

    /* JADX INFO: renamed from: m0 */
    public static void m6223m0(e30 e30Var, boolean z, View view) {
        e30Var.call(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: n0 */
    public static void m6224n0(f30 f30Var, boolean z, View view) {
        f30Var.call(Boolean.valueOf(z), (Object) null);
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
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    public final VText get_gotochat() {
        VText vText = this._gotochat;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_gotochat");
        return null;
    }

    @NotNull
    public final VImage get_green() {
        VImage vImage = this._green;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_green");
        return null;
    }

    @NotNull
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_name");
        return null;
    }

    @NotNull
    public final VDraweeView get_profile_user() {
        VDraweeView vDraweeView = this._profile_user;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_profile_user");
        return null;
    }

    @NotNull
    public final VText get_sex() {
        VText vText = this._sex;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sex");
        return null;
    }

    @NotNull
    public final VText get_tag1() {
        VText vText = this._tag1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tag1");
        return null;
    }

    @NotNull
    public final VText get_tag2() {
        VText vText = this._tag2;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tag2");
        return null;
    }

    @NotNull
    public final VText get_tag3() {
        VText vText = this._tag3;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tag3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final View m6225o0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = otb0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m6226p0(OnlineMatchPushUser onlineMatchPushUser) {
        User user = onlineMatchPushUser.user;
        if (!TextUtils.isEmpty(user.description)) {
            VText vText = get_sex();
            String str = user.description;
            str.getClass();
            vText.setText("“" + d.F(str, "\n", "", false, 4, (Object) null) + "”");
            return;
        }
        if (vwb.J(user.profile.tags)) {
            get_sex().setText((onlineMatchPushUser.isFemale() ? "她" : "他").concat("正在等你聊天..."));
            return;
        }
        int iMin = Math.min(3, user.profile.tags.size());
        List list = user.profile.tags;
        list.getClass();
        List listTake = CollectionsKt.take(list, iMin);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            arrayList.add(((Tag) it.next()).value);
        }
        get_sex().setText(CollectionsKt.joinToString$default(arrayList, " · ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m6227q0(OnlineMatchPushUser onlineMatchPushUser) {
        String str = onlineMatchPushUser.isFemale() ? "她" : "他";
        if (CoreModule.c.e0.p9().isFemale() && (TEnum.equals(onlineMatchPushUser.rsStateReceiverToSender, "superliked") || TEnum.equals(onlineMatchPushUser.rsStateReceiverToSender, "liked"))) {
            boolean zEquals = TEnum.equals(onlineMatchPushUser.rsStateReceiverToSender, "superliked");
            get_name().setText((zEquals ? "超级" : "") + "喜欢过" + str);
            get_name().setCompoundDrawablesWithIntrinsicBounds(zEquals ? x2c0.vn : x2c0.un, 0, 0, 0);
            return;
        }
        String strM6229s0 = onlineMatchPushUser.distance >= 20000 ? null : m6229s0(onlineMatchPushUser.user);
        if (strM6229s0 != null) {
            get_name().setText(onlineMatchPushUser.age + "岁 " + strM6229s0 + " " + a.B(onlineMatchPushUser.birthday));
        } else {
            get_name().setText(onlineMatchPushUser.age + "岁 " + a.B(onlineMatchPushUser.birthday));
        }
        get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: r0 */
    public final CharSequence m6228r0(long lastTime) {
        StringBuilder sb;
        String str;
        if (lastTime < 10) {
            sb = new StringBuilder("即刻聊天 ");
            sb.append(lastTime);
            str = "s ";
        } else {
            sb = new StringBuilder("即刻聊天 ");
            sb.append(lastTime);
            str = "s";
        }
        sb.append(str);
        String string = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), StringsKt.c0(string, " ", 0, false, 6, (Object) null), string.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: s0 */
    public final String m6229s0(User user) {
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
    public final void m6230t0() {
        yij0.m25399U(this.animatorTextTimerSub);
        this.animatorTextTimerSub = rx.c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.htb0
            public final void call(Object obj) {
                QuickChatHeaderUserView.m6220j0(this.f14246a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m6231u0() {
        yij0.m25399U(this.animatorTextTimerSub);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final void m6232v0(@Nullable OnlineMatchPushUser onlineMatchPushUser, final boolean isMatch, @Nullable OnlineMatchMatchUser matchUser, @NotNull final f30<Boolean, String> click, @NotNull final e30<Boolean> close) {
        User user;
        click.getClass();
        close.getClass();
        if (isMatch) {
            if (matchUser == null || (user = matchUser.user) == null) {
                return;
            }
            qib0.G.O(get_profile_user(), user.fp().profileSmall().formatted(), 4, user.isFemale() ? 4 : 8);
            get_name().setText(user.age + "岁 " + m6229s0(user) + " " + i0g0.m16137j0(user.profile.zodiac));
            get_sex().setText((user.isFemale() ? "她" : "他").concat("正在等你聊天..."));
            get_gotochat().setText("即刻聊天");
        } else {
            if (onlineMatchPushUser == null) {
                return;
            }
            qib0.G.O(get_profile_user(), onlineMatchPushUser.avatarUrl, 4, onlineMatchPushUser.isFemale() ? 4 : 8);
            m6227q0(onlineMatchPushUser);
            m6226p0(onlineMatchPushUser);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.itb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m6219i0(click, isMatch, view);
            }
        });
        get_tag1().setOnClickListener(new View.OnClickListener() { // from class: l.jtb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m6218h0(click, isMatch, this, view);
            }
        });
        get_tag2().setOnClickListener(new View.OnClickListener() { // from class: l.ktb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m6221k0(click, isMatch, this, view);
            }
        });
        get_tag3().setOnClickListener(new View.OnClickListener() { // from class: l.ltb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m6222l0(click, isMatch, this, view);
            }
        });
        get_gotochat().setOnClickListener(new View.OnClickListener() { // from class: l.mtb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m6224n0(click, isMatch, view);
            }
        });
        get_close().setOnClickListener(new View.OnClickListener() { // from class: l.ntb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatHeaderUserView.m6223m0(close, isMatch, view);
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
