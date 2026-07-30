package p153l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.material.tabs.TabLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInviteStatus;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00162\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u001b\u0010\u001c\u001a\u00020\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001f\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00162\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u0004J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0016¢\u0006\u0004\b*\u0010\u0004J\u001d\u0010/\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u00162\u0006\u00101\u001a\u00020+2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0016¢\u0006\u0004\b6\u0010\u0004R\"\u0010=\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R&\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010\u0018R$\u0010k\u001a\u0012\u0012\u0004\u0012\u00020\u00120gj\b\u0012\u0004\u0012\u00020\u0012`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010m\u001a\u0012\u0012\u0004\u0012\u00020+0gj\b\u0012\u0004\u0012\u00020+`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010jR$\u0010u\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010}\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R+\u0010\u0089\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0080\u0001\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R!\u0010\u008f\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0092\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008c\u0001\u001a\u0006\b\u0091\u0001\u0010\u008e\u0001R!\u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u008c\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R+\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0013\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006\u009f\u0001"}, m88121d2 = {"Ll/u1o0;", "Ll/iam;", "Ll/g1o0;", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "onlineMembers", "", "Ll/d3q;", "w", "(Ljava/util/List;)Ljava/util/List;", "historyManagers", "u", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "q", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "anchorPresenter", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/g1o0;)V", "R", "(Ljava/util/List;Ljava/util/List;)V", "r", "L", "(Ljava/util/List;)V", Careers.f39580it, "I", "K", "", "inviteCount", p7f.LATITUDE_SOUTH, "(I)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", BaseSei.f14625Y, "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "isFemale", BloodType.f39576O, "(Ljava/lang/String;Z)V", "currentManagerName", "Ll/x20;", "accpetAction", "N", "(Ljava/lang/String;Ll/x20;)V", "J", "a", "Landroid/view/View;", "E", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "get_managerDialogTitle", "()Landroid/widget/TextView;", "set_managerDialogTitle", "(Landroid/widget/TextView;)V", "_managerDialogTitle", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "H", "()Landroid/widget/ImageView;", "set_voiceManagerExplain", "(Landroid/widget/ImageView;)V", "_voiceManagerExplain", Constants.INAPP_DATA_TAG, "get_line", "set_line", "_line", "Lcom/google/android/material/tabs/TabLayout;", "e", "Lcom/google/android/material/tabs/TabLayout;", "F", "()Lcom/google/android/material/tabs/TabLayout;", "set_tab_layout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tab_layout", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "f", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "G", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "set_viewpager", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;)V", "_viewpager", "g", "Ll/g1o0;", BaseSei.f14626Z, "()Ll/g1o0;", "M", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "pageList", RXScreenCaptureService.KEY_INDEX, "titleList", "Ll/r2o0;", "j", "Ll/r2o0;", "getInviteSuccessView", "()Ll/r2o0;", "setInviteSuccessView", "(Ll/r2o0;)V", "inviteSuccessView", "Ll/z1o0;", "k", "Ll/z1o0;", "getInviteAffirmView", "()Ll/z1o0;", "setInviteAffirmView", "(Ll/z1o0;)V", "inviteAffirmView", "Ll/g4s;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/g4s;", "getAffirmDialog", "()Ll/g4s;", "setAffirmDialog", "(Ll/g4s;)V", "affirmDialog", "m", "getInviteSuccessDialog", "setInviteSuccessDialog", "inviteSuccessDialog", "Ll/m2o0;", "n", "Lkotlin/Lazy;", "B", "()Ll/m2o0;", "onlineMembersView", "o", "A", "historyManagerView", "Ll/j2o0;", "p", c4s.C_ZONE, "()Ll/j2o0;", "pageAdapter", "Ll/c0s;", "Ll/c0s;", "getDialog", "()Ll/c0s;", "setDialog", "(Ll/c0s;)V", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class u1o0 implements iam<g1o0<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _managerDialogTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _voiceManagerExplain;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _line;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TabLayout _tab_layout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public UnScrollVPager _viewpager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public g1o0<?> anchorPresenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<View> pageList = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<String> titleList = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public r2o0 inviteSuccessView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public z1o0 inviteAffirmView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public g4s affirmDialog;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public g4s inviteSuccessDialog;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy onlineMembersView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy historyManagerView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageAdapter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public c0s dialog;

    /* JADX INFO: renamed from: l.u1o0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"l/u1o0$a", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20458a implements TabLayout.OnTabSelectedListener {
        public C20458a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            int position = tab.getPosition();
            u1o0 u1o0Var = u1o0.this;
            if (position == 0) {
                u1o0Var.m194086z().m128549H4();
            } else {
                u1o0Var.m194086z().m128548G4();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    public u1o0() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.onlineMembersView = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.h1o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u1o0.m194059m(this.f107471a);
            }
        });
        this.historyManagerView = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.l1o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u1o0.m194049a(this.f129706a);
            }
        });
        this.pageAdapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.m1o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u1o0.m194050b(this.f134452a);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m194047P(u1o0 u1o0Var, View view) {
        view.getClass();
        g4s g4sVar = u1o0Var.inviteSuccessDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m194048Q(u1o0 u1o0Var, View view) {
        view.getClass();
        g4s g4sVar = u1o0Var.inviteSuccessDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static m2o0 m194049a(u1o0 u1o0Var) {
        g1o0<?> g1o0VarM194086z = u1o0Var.m194086z();
        String string = zrv.f205803e.getString(R$string.f47727Oh);
        string.getClass();
        return new m2o0(g1o0VarM194086z, string, 1);
    }

    /* JADX INFO: renamed from: b */
    public static j2o0 m194050b(u1o0 u1o0Var) {
        return new j2o0(u1o0Var.pageList, u1o0Var.titleList);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m194052d(u1o0 u1o0Var, View view) {
        view.getClass();
        c0s c0sVar = u1o0Var.dialog;
        if (c0sVar != null) {
            c0sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m194053e(u1o0 u1o0Var) {
        g4s g4sVar = u1o0Var.affirmDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m194054f(List list, final u1o0 u1o0Var, final BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        list.add(new f2o0(bLiveVoiceManagerInvite, new y20() { // from class: l.j1o0
            @Override // p153l.y20
            public final void call(Object obj) {
                u1o0.m194062v(this.f117980a, bLiveVoiceManagerInvite, (BLiveVoiceManagerInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static void m194055i(u1o0 u1o0Var, x20 x20Var) {
        g4s g4sVar = u1o0Var.affirmDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: j */
    public static Unit m194056j(u1o0 u1o0Var, View view) {
        view.getClass();
        u1o0Var.m194086z().m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(900).m174141B(zrv.m221193k().m203714qb()).m174146t(80).m174148v().m174152z(1.0d, 0.53d).m174143q());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static m2o0 m194059m(u1o0 u1o0Var) {
        g1o0<?> g1o0VarM194086z = u1o0Var.m194086z();
        String string = zrv.f205803e.getString(R$string.f47727Oh);
        string.getClass();
        return new m2o0(g1o0VarM194086z, string, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m194061p(List list, final u1o0 u1o0Var, final BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        list.add(new g2o0(bLiveVoiceManagerInvite, new y20() { // from class: l.k1o0
            @Override // p153l.y20
            public final void call(Object obj) {
                u1o0.m194064x(this.f123523a, bLiveVoiceManagerInvite, (BLiveVoiceManagerInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static final void m194062v(u1o0 u1o0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, BLiveVoiceManagerInvite bLiveVoiceManagerInvite2) {
        if (TEnum.equals(bLiveVoiceManagerInvite2.status, BLiveVoiceManagerInviteStatus.inviting)) {
            return;
        }
        g1o0<?> g1o0VarM194086z = u1o0Var.m194086z();
        String str = bLiveVoiceManagerInvite.userId;
        str.getClass();
        g1o0VarM194086z.m128551K4(str);
    }

    /* JADX INFO: renamed from: w */
    private final List<d3q<?>> m194063w(List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(onlineMembers, new y20() { // from class: l.s1o0
            @Override // p153l.y20
            public final void call(Object obj) {
                u1o0.m194061p(arrayList, this, (BLiveVoiceManagerInvite) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static final void m194064x(u1o0 u1o0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, BLiveVoiceManagerInvite bLiveVoiceManagerInvite2) {
        if (!bLiveVoiceManagerInvite2.isManager) {
            if (TEnum.equals(bLiveVoiceManagerInvite2.status, BLiveVoiceManagerInviteStatus.inviting)) {
                return;
            }
            u1o0Var.m194086z().m128550J4(bLiveVoiceManagerInvite);
        } else {
            g1o0<?> g1o0VarM194086z = u1o0Var.m194086z();
            String str = bLiveVoiceManagerInvite.userId;
            str.getClass();
            g1o0VarM194086z.m128544A4(str);
        }
    }

    /* JADX INFO: renamed from: A */
    public final m2o0 m194065A() {
        return (m2o0) this.historyManagerView.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final m2o0 m194066B() {
        return (m2o0) this.onlineMembersView.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final j2o0 m194067C() {
        return (j2o0) this.pageAdapter.getValue();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m194086z().act();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final View m194068E() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final TabLayout m194069F() {
        TabLayout tabLayout = this._tab_layout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tab_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final UnScrollVPager m194070G() {
        UnScrollVPager unScrollVPager = this._viewpager;
        if (unScrollVPager != null) {
            return unScrollVPager;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final ImageView m194071H() {
        ImageView imageView = this._voiceManagerExplain;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_voiceManagerExplain");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m194072I(@NotNull List<? extends BLiveVoiceManagerInvite> it) {
        it.getClass();
        m194066B().m156876j(m194063w(it));
    }

    /* JADX INFO: renamed from: J */
    public final void m194073J() {
        m194066B().m156870d();
    }

    /* JADX INFO: renamed from: K */
    public final void m194074K(@NotNull List<? extends BLiveVoiceManagerInvite> historyManagers) {
        historyManagers.getClass();
        m194065A().m156877k(m194084u(historyManagers));
    }

    /* JADX INFO: renamed from: L */
    public final void m194075L(@NotNull List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        onlineMembers.getClass();
        m194066B().m156877k(m194063w(onlineMembers));
    }

    /* JADX INFO: renamed from: M */
    public final void m194076M(@NotNull g1o0<?> g1o0Var) {
        g1o0Var.getClass();
        this.anchorPresenter = g1o0Var;
    }

    /* JADX INFO: renamed from: N */
    public final void m194077N(@NotNull String currentManagerName, @NotNull final x20 accpetAction) {
        currentManagerName.getClass();
        accpetAction.getClass();
        if (this.inviteAffirmView == null) {
            Act act = m194086z().act();
            act.getClass();
            this.inviteAffirmView = new z1o0(act);
            g1o0<?> g1o0VarM194086z = m194086z();
            z1o0 z1o0Var = this.inviteAffirmView;
            z1o0Var.getClass();
            this.affirmDialog = new g4s(g1o0VarM194086z, z1o0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
        }
        z1o0 z1o0Var2 = this.inviteAffirmView;
        if (z1o0Var2 != null) {
            String strM209911u = xau.m209911u(R$string.f47706Nh, currentManagerName);
            strM209911u.getClass();
            String strM209911u2 = xau.m209911u(R$string.f47685Mh, Integer.valueOf(zrv.m221193k().m203604d6()));
            strM209911u2.getClass();
            z1o0Var2.m218362j(strM209911u, strM209911u2, R$string.f47690N1, R$string.f47631K6, new x20() { // from class: l.n1o0
                @Override // p153l.x20
                public final void call() {
                    u1o0.m194053e(this.f139777a);
                }
            }, new x20() { // from class: l.o1o0
                @Override // p153l.x20
                public final void call() {
                    u1o0.m194055i(this.f144675a, accpetAction);
                }
            });
        }
        g4s g4sVar = this.affirmDialog;
        if (g4sVar != null) {
            g4sVar.show();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m194078O(@NotNull String name, boolean isFemale) {
        TextView textViewM179547c;
        TextView textViewM179547c2;
        name.getClass();
        boolean zM128546C4 = m194086z().m128546C4();
        if (this.inviteSuccessView == null) {
            Act act = m194086z().act();
            act.getClass();
            r2o0 r2o0Var = new r2o0(act);
            czq.m113347c(r2o0Var.m179549e(), new Function1() { // from class: l.t1o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u1o0.m194047P(this.f171689a, (View) obj);
                }
            });
            czq.m113347c(r2o0Var.m179548d(), new Function1() { // from class: l.i1o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u1o0.m194048Q(this.f112540a, (View) obj);
                }
            });
            if (zM128546C4) {
                r2o0Var.m179549e().setText(xau.m209910t(R$string.f48494y5));
                r2o0Var.m179550f().setText("设置管理员");
            }
            this.inviteSuccessView = r2o0Var;
            g1o0<?> g1o0VarM194086z = m194086z();
            r2o0 r2o0Var2 = this.inviteSuccessView;
            r2o0Var2.getClass();
            this.inviteSuccessDialog = new g4s(g1o0VarM194086z, r2o0Var2.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
        }
        int iM128545B4 = m194086z().m128545B4();
        if (zM128546C4) {
            String strM103845w = bf10.m103845w(name, 6);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("已向 %s 发送管理员邀请，对方可协助你对本群进行管理，但你仍需对本群负责", Arrays.copyOf(new Object[]{strM103845w}, 1));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            StyleSpan styleSpan = new StyleSpan(1);
            int iC0 = StringsKt.m94327c0(str, strM103845w, 0, false, 6, null);
            spannableStringBuilder.setSpan(styleSpan, iC0, strM103845w.length() + iC0, 33);
            r2o0 r2o0Var3 = this.inviteSuccessView;
            if (r2o0Var3 != null && (textViewM179547c2 = r2o0Var3.m179547c()) != null) {
                textViewM179547c2.setText(spannableStringBuilder);
            }
        } else {
            r2o0 r2o0Var4 = this.inviteSuccessView;
            if (r2o0Var4 != null && (textViewM179547c = r2o0Var4.m179547c()) != null) {
                textViewM179547c.setText(xau.m209912v(R$string.f47664Lh, name, Integer.valueOf(iM128545B4)));
            }
        }
        g4s g4sVar = this.inviteSuccessDialog;
        if (g4sVar != null) {
            g4sVar.show();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m194079R(@Nullable List<? extends BLiveVoiceManagerInvite> onlineMembers, @Nullable List<? extends BLiveVoiceManagerInvite> historyManagers) {
        List<d3q<?>> listM194084u;
        List<d3q<?>> listM194063w;
        if (this.dialog == null) {
            LayoutInflater layoutInflaterInflater = m194086z().act().inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new c0s(m194086z(), m194081q(layoutInflaterInflater, null));
            czq.m113347c(m194068E(), new Function1() { // from class: l.q1o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u1o0.m194052d(this.f155213a, (View) obj);
                }
            });
            czq.m113347c(m194071H(), new Function1() { // from class: l.r1o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u1o0.m194056j(this.f160842a, (View) obj);
                }
            });
            m194065A().m156878l(false);
            ArrayList<String> arrayList = this.titleList;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            arrayList.add(String.format(zrv.f205803e.getString(R$string.f48483xg) + "0/" + m194086z().m128545B4(), Arrays.copyOf(new Object[0], 0)));
            this.titleList.add(m194086z().act().getString(R$string.f48352rh));
            ArrayList<View> arrayList2 = this.pageList;
            View view = m194066B().getView();
            view.getClass();
            arrayList2.add(view);
            ArrayList<View> arrayList3 = this.pageList;
            View view2 = m194065A().getView();
            view2.getClass();
            arrayList3.add(view2);
            m194082r();
        }
        if (onlineMembers != null && (listM194063w = m194063w(onlineMembers)) != null) {
            m194066B().m156877k(listM194063w);
        }
        if (historyManagers != null && (listM194084u = m194084u(historyManagers)) != null) {
            m194065A().m156877k(listM194084u);
        }
        c0s c0sVar = this.dialog;
        c0sVar.getClass();
        c0sVar.show();
    }

    /* JADX INFO: renamed from: S */
    public final void m194080S(int inviteCount) {
        if (this.dialog == null) {
            return;
        }
        int iM128545B4 = m194086z().m128545B4();
        TabLayout.Tab tabAt = m194069F().getTabAt(0);
        if (tabAt != null) {
            tabAt.setText(xau.m209910t(R$string.f48483xg) + inviteCount + "/" + iM128545B4);
        }
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final View m194081q(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM199047b = v1o0.m199047b(this, inflater, parent);
        viewM199047b.getClass();
        return viewM199047b;
    }

    /* JADX INFO: renamed from: r */
    public final void m194082r() {
        m194070G().setAdapter(m194067C());
        m194069F().setupWithViewPager(m194070G());
        m194069F().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20458a());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull g1o0<?> anchorPresenter) {
        anchorPresenter.getClass();
        m194076M(anchorPresenter);
    }

    /* JADX INFO: renamed from: u */
    public final List<d3q<?>> m194084u(List<? extends BLiveVoiceManagerInvite> historyManagers) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(historyManagers, new y20() { // from class: l.p1o0
            @Override // p153l.y20
            public final void call(Object obj) {
                u1o0.m194054f(arrayList, this, (BLiveVoiceManagerInvite) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final void m194085y() {
        c0s c0sVar = this.dialog;
        if (c0sVar != null) {
            c0sVar.dismiss();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final g1o0<?> m194086z() {
        g1o0<?> g1o0Var = this.anchorPresenter;
        if (g1o0Var != null) {
            return g1o0Var;
        }
        Intrinsics.m88391r("anchorPresenter");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
