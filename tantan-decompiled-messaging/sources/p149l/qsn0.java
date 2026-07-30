package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManagerInviteStatus;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00162\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u001b\u0010\u001c\u001a\u00020\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001f\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00162\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u0004J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0016¢\u0006\u0004\b*\u0010\u0004J\u001d\u0010/\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u00162\u0006\u00101\u001a\u00020+2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0016¢\u0006\u0004\b6\u0010\u0004R\"\u0010=\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R&\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010\u0018R$\u0010k\u001a\u0012\u0012\u0004\u0012\u00020\u00120gj\b\u0012\u0004\u0012\u00020\u0012`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010m\u001a\u0012\u0012\u0004\u0012\u00020+0gj\b\u0012\u0004\u0012\u00020+`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010jR$\u0010u\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010}\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R+\u0010\u0089\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0080\u0001\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R!\u0010\u008f\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0092\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008c\u0001\u001a\u0006\b\u0091\u0001\u0010\u008e\u0001R!\u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u008c\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R+\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0013\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006\u009f\u0001"}, m87232d2 = {"Ll/qsn0;", "Ll/s7m;", "Ll/csn0;", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "onlineMembers", "", "Ll/d1q;", "w", "(Ljava/util/List;)Ljava/util/List;", "historyManagers", "u", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "q", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "anchorPresenter", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/csn0;)V", "R", "(Ljava/util/List;Ljava/util/List;)V", "r", "L", "(Ljava/util/List;)V", Careers.f38732it, "I", "K", "", "inviteCount", j6f.LATITUDE_SOUTH, "(I)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", BaseSei.f13931Y, "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "isFemale", BloodType.f38728O, "(Ljava/lang/String;Z)V", "currentManagerName", "Ll/d30;", "accpetAction", "N", "(Ljava/lang/String;Ll/d30;)V", "J", "a", "Landroid/view/View;", "E", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "get_managerDialogTitle", "()Landroid/widget/TextView;", "set_managerDialogTitle", "(Landroid/widget/TextView;)V", "_managerDialogTitle", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "H", "()Landroid/widget/ImageView;", "set_voiceManagerExplain", "(Landroid/widget/ImageView;)V", "_voiceManagerExplain", Constants.INAPP_DATA_TAG, "get_line", "set_line", "_line", "Lcom/google/android/material/tabs/TabLayout;", "e", "Lcom/google/android/material/tabs/TabLayout;", "F", "()Lcom/google/android/material/tabs/TabLayout;", "set_tab_layout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tab_layout", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "f", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "G", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "set_viewpager", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;)V", "_viewpager", "g", "Ll/csn0;", BaseSei.f13932Z, "()Ll/csn0;", "M", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "pageList", RXScreenCaptureService.KEY_INDEX, "titleList", "Ll/ntn0;", "j", "Ll/ntn0;", "getInviteSuccessView", "()Ll/ntn0;", "setInviteSuccessView", "(Ll/ntn0;)V", "inviteSuccessView", "Ll/vsn0;", "k", "Ll/vsn0;", "getInviteAffirmView", "()Ll/vsn0;", "setInviteAffirmView", "(Ll/vsn0;)V", "inviteAffirmView", "Ll/f2s;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/f2s;", "getAffirmDialog", "()Ll/f2s;", "setAffirmDialog", "(Ll/f2s;)V", "affirmDialog", "m", "getInviteSuccessDialog", "setInviteSuccessDialog", "inviteSuccessDialog", "Ll/itn0;", "n", "Lkotlin/Lazy;", "B", "()Ll/itn0;", "onlineMembersView", "o", "A", "historyManagerView", "Ll/ftn0;", "p", b2s.C_ZONE, "()Ll/ftn0;", "pageAdapter", "Ll/byr;", "Ll/byr;", "getDialog", "()Ll/byr;", "setDialog", "(Ll/byr;)V", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qsn0 implements s7m<csn0<?>> {

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
    public csn0<?> anchorPresenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<View> pageList = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<String> titleList = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public ntn0 inviteSuccessView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public vsn0 inviteAffirmView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public f2s affirmDialog;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public f2s inviteSuccessDialog;

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
    public byr dialog;

    /* JADX INFO: renamed from: l.qsn0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"l/qsn0$a", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19571a implements TabLayout.OnTabSelectedListener {
        public C19571a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            int position = tab.getPosition();
            qsn0 qsn0Var = qsn0.this;
            if (position == 0) {
                qsn0Var.m176368z().m108552H4();
            } else {
                qsn0Var.m176368z().m108551G4();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    public qsn0() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.onlineMembersView = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.dsn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qsn0.m176341m(this.f87777a);
            }
        });
        this.historyManagerView = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.hsn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qsn0.m176331a(this.f109335a);
            }
        });
        this.pageAdapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.isn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qsn0.m176332b(this.f114783a);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m176329P(qsn0 qsn0Var, View view) {
        view.getClass();
        f2s f2sVar = qsn0Var.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m176330Q(qsn0 qsn0Var, View view) {
        view.getClass();
        f2s f2sVar = qsn0Var.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static itn0 m176331a(qsn0 qsn0Var) {
        csn0<?> csn0VarM176368z = qsn0Var.m176368z();
        String string = ypv.f199497e.getString(R$string.f46879Oh);
        string.getClass();
        return new itn0(csn0VarM176368z, string, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ftn0 m176332b(qsn0 qsn0Var) {
        return new ftn0(qsn0Var.pageList, qsn0Var.titleList);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m176334d(qsn0 qsn0Var, View view) {
        view.getClass();
        byr byrVar = qsn0Var.dialog;
        if (byrVar != null) {
            byrVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m176335e(qsn0 qsn0Var) {
        f2s f2sVar = qsn0Var.affirmDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m176336f(List list, final qsn0 qsn0Var, final BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        list.add(new btn0(bLiveVoiceManagerInvite, new e30() { // from class: l.fsn0
            @Override // p149l.e30
            public final void call(Object obj) {
                qsn0.m176344v(this.f99089a, bLiveVoiceManagerInvite, (BLiveVoiceManagerInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static void m176337i(qsn0 qsn0Var, d30 d30Var) {
        f2s f2sVar = qsn0Var.affirmDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: j */
    public static Unit m176338j(qsn0 qsn0Var, View view) {
        view.getClass();
        qsn0Var.m176368z().m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(900).m142598B(ypv.m215672k().m195927qb()).m142603t(80).m142605v().m142609z(1.0d, 0.53d).m142600q());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static itn0 m176341m(qsn0 qsn0Var) {
        csn0<?> csn0VarM176368z = qsn0Var.m176368z();
        String string = ypv.f199497e.getString(R$string.f46879Oh);
        string.getClass();
        return new itn0(csn0VarM176368z, string, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m176343p(List list, final qsn0 qsn0Var, final BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        list.add(new ctn0(bLiveVoiceManagerInvite, new e30() { // from class: l.gsn0
            @Override // p149l.e30
            public final void call(Object obj) {
                qsn0.m176346x(this.f104193a, bLiveVoiceManagerInvite, (BLiveVoiceManagerInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static final void m176344v(qsn0 qsn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, BLiveVoiceManagerInvite bLiveVoiceManagerInvite2) {
        if (TEnum.equals(bLiveVoiceManagerInvite2.status, BLiveVoiceManagerInviteStatus.inviting)) {
            return;
        }
        csn0<?> csn0VarM176368z = qsn0Var.m176368z();
        String str = bLiveVoiceManagerInvite.userId;
        str.getClass();
        csn0VarM176368z.m108554K4(str);
    }

    /* JADX INFO: renamed from: w */
    private final List<d1q<?>> m176345w(List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(onlineMembers, new e30() { // from class: l.osn0
            @Override // p149l.e30
            public final void call(Object obj) {
                qsn0.m176343p(arrayList, this, (BLiveVoiceManagerInvite) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static final void m176346x(qsn0 qsn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, BLiveVoiceManagerInvite bLiveVoiceManagerInvite2) {
        if (!bLiveVoiceManagerInvite2.isManager) {
            if (TEnum.equals(bLiveVoiceManagerInvite2.status, BLiveVoiceManagerInviteStatus.inviting)) {
                return;
            }
            qsn0Var.m176368z().m108553J4(bLiveVoiceManagerInvite);
        } else {
            csn0<?> csn0VarM176368z = qsn0Var.m176368z();
            String str = bLiveVoiceManagerInvite.userId;
            str.getClass();
            csn0VarM176368z.m108547A4(str);
        }
    }

    /* JADX INFO: renamed from: A */
    public final itn0 m176347A() {
        return (itn0) this.historyManagerView.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final itn0 m176348B() {
        return (itn0) this.onlineMembersView.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final ftn0 m176349C() {
        return (ftn0) this.pageAdapter.getValue();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m176368z().act();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final View m176350E() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final TabLayout m176351F() {
        TabLayout tabLayout = this._tab_layout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m87502r("_tab_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final UnScrollVPager m176352G() {
        UnScrollVPager unScrollVPager = this._viewpager;
        if (unScrollVPager != null) {
            return unScrollVPager;
        }
        Intrinsics.m87502r("_viewpager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final ImageView m176353H() {
        ImageView imageView = this._voiceManagerExplain;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_voiceManagerExplain");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m176354I(@NotNull List<? extends BLiveVoiceManagerInvite> it) {
        it.getClass();
        m176348B().m138225j(m176345w(it));
    }

    /* JADX INFO: renamed from: J */
    public final void m176355J() {
        m176348B().m138219d();
    }

    /* JADX INFO: renamed from: K */
    public final void m176356K(@NotNull List<? extends BLiveVoiceManagerInvite> historyManagers) {
        historyManagers.getClass();
        m176347A().m138226k(m176366u(historyManagers));
    }

    /* JADX INFO: renamed from: L */
    public final void m176357L(@NotNull List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        onlineMembers.getClass();
        m176348B().m138226k(m176345w(onlineMembers));
    }

    /* JADX INFO: renamed from: M */
    public final void m176358M(@NotNull csn0<?> csn0Var) {
        csn0Var.getClass();
        this.anchorPresenter = csn0Var;
    }

    /* JADX INFO: renamed from: N */
    public final void m176359N(@NotNull String currentManagerName, @NotNull final d30 accpetAction) {
        currentManagerName.getClass();
        accpetAction.getClass();
        if (this.inviteAffirmView == null) {
            Act act = m176368z().act();
            act.getClass();
            this.inviteAffirmView = new vsn0(act);
            csn0<?> csn0VarM176368z = m176368z();
            vsn0 vsn0Var = this.inviteAffirmView;
            vsn0Var.getClass();
            this.affirmDialog = new f2s(csn0VarM176368z, vsn0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
        }
        vsn0 vsn0Var2 = this.inviteAffirmView;
        if (vsn0Var2 != null) {
            String strM202218u = w8u.m202218u(R$string.f46858Nh, currentManagerName);
            strM202218u.getClass();
            String strM202218u2 = w8u.m202218u(R$string.f46837Mh, Integer.valueOf(ypv.m215672k().m195817d6()));
            strM202218u2.getClass();
            vsn0Var2.m199889j(strM202218u, strM202218u2, R$string.f46842N1, R$string.f46783K6, new d30() { // from class: l.jsn0
                @Override // p149l.d30
                public final void call() {
                    qsn0.m176335e(this.f119527a);
                }
            }, new d30() { // from class: l.ksn0
                @Override // p149l.d30
                public final void call() {
                    qsn0.m176337i(this.f124493a, accpetAction);
                }
            });
        }
        f2s f2sVar = this.affirmDialog;
        if (f2sVar != null) {
            f2sVar.show();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m176360O(@NotNull String name, boolean isFemale) {
        TextView textViewM161398c;
        TextView textViewM161398c2;
        name.getClass();
        boolean zM108549C4 = m176368z().m108549C4();
        if (this.inviteSuccessView == null) {
            Act act = m176368z().act();
            act.getClass();
            ntn0 ntn0Var = new ntn0(act);
            cxq.m109105c(ntn0Var.m161400e(), new Function1() { // from class: l.psn0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qsn0.m176329P(this.f151023a, (View) obj);
                }
            });
            cxq.m109105c(ntn0Var.m161399d(), new Function1() { // from class: l.esn0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qsn0.m176330Q(this.f93041a, (View) obj);
                }
            });
            if (zM108549C4) {
                ntn0Var.m161400e().setText(w8u.m202217t(R$string.f47646y5));
                ntn0Var.m161401f().setText("设置管理员");
            }
            this.inviteSuccessView = ntn0Var;
            csn0<?> csn0VarM176368z = m176368z();
            ntn0 ntn0Var2 = this.inviteSuccessView;
            ntn0Var2.getClass();
            this.inviteSuccessDialog = new f2s(csn0VarM176368z, ntn0Var2.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
        }
        int iM108548B4 = m176368z().m108548B4();
        if (zM108549C4) {
            String strM178016w = r610.m178016w(name, 6);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("已向 %s 发送管理员邀请，对方可协助你对本群进行管理，但你仍需对本群负责", Arrays.copyOf(new Object[]{strM178016w}, 1));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            StyleSpan styleSpan = new StyleSpan(1);
            int iC0 = StringsKt.m93436c0(str, strM178016w, 0, false, 6, null);
            spannableStringBuilder.setSpan(styleSpan, iC0, strM178016w.length() + iC0, 33);
            ntn0 ntn0Var3 = this.inviteSuccessView;
            if (ntn0Var3 != null && (textViewM161398c2 = ntn0Var3.m161398c()) != null) {
                textViewM161398c2.setText(spannableStringBuilder);
            }
        } else {
            ntn0 ntn0Var4 = this.inviteSuccessView;
            if (ntn0Var4 != null && (textViewM161398c = ntn0Var4.m161398c()) != null) {
                textViewM161398c.setText(w8u.m202219v(R$string.f46816Lh, name, Integer.valueOf(iM108548B4)));
            }
        }
        f2s f2sVar = this.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.show();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m176361R(@Nullable List<? extends BLiveVoiceManagerInvite> onlineMembers, @Nullable List<? extends BLiveVoiceManagerInvite> historyManagers) {
        List<d1q<?>> listM176366u;
        List<d1q<?>> listM176345w;
        if (this.dialog == null) {
            LayoutInflater layoutInflaterInflater = m176368z().act().inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new byr(m176368z(), m176363q(layoutInflaterInflater, null));
            cxq.m109105c(m176350E(), new Function1() { // from class: l.msn0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qsn0.m176334d(this.f135517a, (View) obj);
                }
            });
            cxq.m109105c(m176353H(), new Function1() { // from class: l.nsn0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qsn0.m176338j(this.f140282a, (View) obj);
                }
            });
            m176347A().m138227l(false);
            ArrayList<String> arrayList = this.titleList;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            arrayList.add(String.format(ypv.f199497e.getString(R$string.f47635xg) + "0/" + m176368z().m108548B4(), Arrays.copyOf(new Object[0], 0)));
            this.titleList.add(m176368z().act().getString(R$string.f47504rh));
            ArrayList<View> arrayList2 = this.pageList;
            View view = m176348B().getView();
            view.getClass();
            arrayList2.add(view);
            ArrayList<View> arrayList3 = this.pageList;
            View view2 = m176347A().getView();
            view2.getClass();
            arrayList3.add(view2);
            m176364r();
        }
        if (onlineMembers != null && (listM176345w = m176345w(onlineMembers)) != null) {
            m176348B().m138226k(listM176345w);
        }
        if (historyManagers != null && (listM176366u = m176366u(historyManagers)) != null) {
            m176347A().m138226k(listM176366u);
        }
        byr byrVar = this.dialog;
        byrVar.getClass();
        byrVar.show();
    }

    /* JADX INFO: renamed from: S */
    public final void m176362S(int inviteCount) {
        if (this.dialog == null) {
            return;
        }
        int iM108548B4 = m176368z().m108548B4();
        TabLayout.Tab tabAt = m176351F().getTabAt(0);
        if (tabAt != null) {
            tabAt.setText(w8u.m202217t(R$string.f47635xg) + inviteCount + "/" + iM108548B4);
        }
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final View m176363q(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM180717b = rsn0.m180717b(this, inflater, parent);
        viewM180717b.getClass();
        return viewM180717b;
    }

    /* JADX INFO: renamed from: r */
    public final void m176364r() {
        m176352G().setAdapter(m176349C());
        m176351F().setupWithViewPager(m176352G());
        m176351F().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C19571a());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull csn0<?> anchorPresenter) {
        anchorPresenter.getClass();
        m176358M(anchorPresenter);
    }

    /* JADX INFO: renamed from: u */
    public final List<d1q<?>> m176366u(List<? extends BLiveVoiceManagerInvite> historyManagers) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(historyManagers, new e30() { // from class: l.lsn0
            @Override // p149l.e30
            public final void call(Object obj) {
                qsn0.m176336f(arrayList, this, (BLiveVoiceManagerInvite) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final void m176367y() {
        byr byrVar = this.dialog;
        if (byrVar != null) {
            byrVar.dismiss();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final csn0<?> m176368z() {
        csn0<?> csn0Var = this.anchorPresenter;
        if (csn0Var != null) {
            return csn0Var;
        }
        Intrinsics.m87502r("anchorPresenter");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
