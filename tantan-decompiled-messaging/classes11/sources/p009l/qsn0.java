package p009l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
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
import l.byr;
import l.cxq;
import l.d1q;
import l.d30;
import l.e30;
import l.f2s;
import l.jp50;
import l.r610;
import l.rsn0;
import l.s7m;
import l.vwb;
import l.w8u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00162\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u001b\u0010\u001c\u001a\u00020\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001f\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00162\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u0004J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0016¢\u0006\u0004\b*\u0010\u0004J\u001d\u0010/\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u00162\u0006\u00101\u001a\u00020+2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0016¢\u0006\u0004\b6\u0010\u0004R\"\u0010=\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R&\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010\u0018R$\u0010k\u001a\u0012\u0012\u0004\u0012\u00020\u00120gj\b\u0012\u0004\u0012\u00020\u0012`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010m\u001a\u0012\u0012\u0004\u0012\u00020+0gj\b\u0012\u0004\u0012\u00020+`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010jR$\u0010u\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010}\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R+\u0010\u0089\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0080\u0001\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R!\u0010\u008f\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0092\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008c\u0001\u001a\u0006\b\u0091\u0001\u0010\u008e\u0001R!\u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u008c\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R+\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0013\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006\u009f\u0001"}, d2 = {"Ll/qsn0;", "Ll/s7m;", "Ll/csn0;", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "onlineMembers", "", "Ll/d1q;", "w", "(Ljava/util/List;)Ljava/util/List;", "historyManagers", "u", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "q", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "anchorPresenter", "", "s", "(Ll/csn0;)V", "R", "(Ljava/util/List;Ljava/util/List;)V", "r", "L", "(Ljava/util/List;)V", "it", "I", "K", "", "inviteCount", "S", "(I)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "y", "", "name", "", "isFemale", "O", "(Ljava/lang/String;Z)V", "currentManagerName", "Ll/d30;", "accpetAction", "N", "(Ljava/lang/String;Ll/d30;)V", "J", "a", "Landroid/view/View;", "E", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "get_managerDialogTitle", "()Landroid/widget/TextView;", "set_managerDialogTitle", "(Landroid/widget/TextView;)V", "_managerDialogTitle", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "H", "()Landroid/widget/ImageView;", "set_voiceManagerExplain", "(Landroid/widget/ImageView;)V", "_voiceManagerExplain", "d", "get_line", "set_line", "_line", "Lcom/google/android/material/tabs/TabLayout;", "e", "Lcom/google/android/material/tabs/TabLayout;", "F", "()Lcom/google/android/material/tabs/TabLayout;", "set_tab_layout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tab_layout", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "f", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "G", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;", "set_viewpager", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/UnScrollVPager;)V", "_viewpager", "g", "Ll/csn0;", "z", "()Ll/csn0;", "M", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "pageList", "i", "titleList", "Ll/ntn0;", "j", "Ll/ntn0;", "getInviteSuccessView", "()Ll/ntn0;", "setInviteSuccessView", "(Ll/ntn0;)V", "inviteSuccessView", "Ll/vsn0;", "k", "Ll/vsn0;", "getInviteAffirmView", "()Ll/vsn0;", "setInviteAffirmView", "(Ll/vsn0;)V", "inviteAffirmView", "Ll/f2s;", "l", "Ll/f2s;", "getAffirmDialog", "()Ll/f2s;", "setAffirmDialog", "(Ll/f2s;)V", "affirmDialog", "m", "getInviteSuccessDialog", "setInviteSuccessDialog", "inviteSuccessDialog", "Ll/itn0;", "n", "Lkotlin/Lazy;", "B", "()Ll/itn0;", "onlineMembersView", "o", "A", "historyManagerView", "Ll/ftn0;", "p", "C", "()Ll/ftn0;", "pageAdapter", "Ll/byr;", "Ll/byr;", "getDialog", "()Ll/byr;", "setDialog", "(Ll/byr;)V", "dialog", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"l/qsn0$a", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1154a implements TabLayout.OnTabSelectedListener {
        public C1154a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            int position = tab.getPosition();
            qsn0 qsn0Var = qsn0.this;
            if (position == 0) {
                qsn0Var.m21303z().m12834H4();
            } else {
                qsn0Var.m21303z().m12833G4();
            }
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    public qsn0() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.onlineMembersView = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.dsn0
            public final Object invoke() {
                return qsn0.m21274m(this.f11978a);
            }
        });
        this.historyManagerView = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.hsn0
            public final Object invoke() {
                return qsn0.m21264a(this.f14240a);
            }
        });
        this.pageAdapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.isn0
            public final Object invoke() {
                return qsn0.m21265b(this.f14789a);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m21262P(qsn0 qsn0Var, View view) {
        view.getClass();
        f2s f2sVar = qsn0Var.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m21263Q(qsn0 qsn0Var, View view) {
        view.getClass();
        f2s f2sVar = qsn0Var.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static itn0 m21264a(qsn0 qsn0Var) {
        csn0<?> csn0VarM21303z = qsn0Var.m21303z();
        String string = ypv.f23200e.getString(R.string.Oh);
        string.getClass();
        return new itn0(csn0VarM21303z, string, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ftn0 m21265b(qsn0 qsn0Var) {
        return new ftn0(qsn0Var.pageList, qsn0Var.titleList);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m21267d(qsn0 qsn0Var, View view) {
        view.getClass();
        byr byrVar = qsn0Var.dialog;
        if (byrVar != null) {
            byrVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m21268e(qsn0 qsn0Var) {
        f2s f2sVar = qsn0Var.affirmDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m21269f(List list, final qsn0 qsn0Var, final BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        list.add(new btn0(bLiveVoiceManagerInvite, new e30() { // from class: l.fsn0
            public final void call(Object obj) {
                qsn0.m21277v(this.f13154a, bLiveVoiceManagerInvite, (BLiveVoiceManagerInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static void m21270i(qsn0 qsn0Var, d30 d30Var) {
        f2s f2sVar = qsn0Var.affirmDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: j */
    public static Unit m21271j(qsn0 qsn0Var, View view) {
        view.getClass();
        qsn0Var.m21303z().F2().OpenH5Event.open().j(jp50.c(900).B(ypv.m25490k().qb()).t(80).v().z(1.0d, 0.53d).q());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static itn0 m21274m(qsn0 qsn0Var) {
        csn0<?> csn0VarM21303z = qsn0Var.m21303z();
        String string = ypv.f23200e.getString(R.string.Oh);
        string.getClass();
        return new itn0(csn0VarM21303z, string, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m21276p(List list, final qsn0 qsn0Var, final BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        list.add(new ctn0(bLiveVoiceManagerInvite, new e30() { // from class: l.gsn0
            public final void call(Object obj) {
                qsn0.m21279x(this.f13716a, bLiveVoiceManagerInvite, (BLiveVoiceManagerInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static final void m21277v(qsn0 qsn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, BLiveVoiceManagerInvite bLiveVoiceManagerInvite2) {
        if (TEnum.equals(bLiveVoiceManagerInvite2.status, "inviting")) {
            return;
        }
        csn0<?> csn0VarM21303z = qsn0Var.m21303z();
        String str = bLiveVoiceManagerInvite.userId;
        str.getClass();
        csn0VarM21303z.m12836K4(str);
    }

    /* JADX INFO: renamed from: w */
    private final List<d1q<?>> m21278w(List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(onlineMembers, new e30() { // from class: l.osn0
            public final void call(Object obj) {
                qsn0.m21276p(arrayList, this, (BLiveVoiceManagerInvite) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static final void m21279x(qsn0 qsn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, BLiveVoiceManagerInvite bLiveVoiceManagerInvite2) {
        if (!bLiveVoiceManagerInvite2.isManager) {
            if (TEnum.equals(bLiveVoiceManagerInvite2.status, "inviting")) {
                return;
            }
            qsn0Var.m21303z().m12835J4(bLiveVoiceManagerInvite);
        } else {
            csn0<?> csn0VarM21303z = qsn0Var.m21303z();
            String str = bLiveVoiceManagerInvite.userId;
            str.getClass();
            csn0VarM21303z.m12829A4(str);
        }
    }

    /* JADX INFO: renamed from: A */
    public final itn0 m21280A() {
        return (itn0) this.historyManagerView.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final itn0 m21281B() {
        return (itn0) this.onlineMembersView.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final ftn0 m21282C() {
        return (ftn0) this.pageAdapter.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21283C0() {
        return m21303z().act();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final View m21284E() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final TabLayout m21285F() {
        TabLayout tabLayout = this._tab_layout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.r("_tab_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final UnScrollVPager m21286G() {
        UnScrollVPager unScrollVPager = this._viewpager;
        if (unScrollVPager != null) {
            return unScrollVPager;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final ImageView m21287H() {
        ImageView imageView = this._voiceManagerExplain;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_voiceManagerExplain");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m21288I(@NotNull List<? extends BLiveVoiceManagerInvite> it) {
        it.getClass();
        m21281B().m16720j(m21278w(it));
    }

    /* JADX INFO: renamed from: J */
    public final void m21289J() {
        m21281B().m16714d();
    }

    /* JADX INFO: renamed from: K */
    public final void m21290K(@NotNull List<? extends BLiveVoiceManagerInvite> historyManagers) {
        historyManagers.getClass();
        m21280A().m16721k(m21301u(historyManagers));
    }

    /* JADX INFO: renamed from: L */
    public final void m21291L(@NotNull List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        onlineMembers.getClass();
        m21281B().m16721k(m21278w(onlineMembers));
    }

    /* JADX INFO: renamed from: M */
    public final void m21292M(@NotNull csn0<?> csn0Var) {
        csn0Var.getClass();
        this.anchorPresenter = csn0Var;
    }

    /* JADX INFO: renamed from: N */
    public final void m21293N(@NotNull String currentManagerName, @NotNull final d30 accpetAction) {
        currentManagerName.getClass();
        accpetAction.getClass();
        if (this.inviteAffirmView == null) {
            Act act = m21303z().act();
            act.getClass();
            this.inviteAffirmView = new vsn0(act);
            csn0<?> csn0VarM21303z = m21303z();
            vsn0 vsn0Var = this.inviteAffirmView;
            vsn0Var.getClass();
            this.affirmDialog = new f2s(csn0VarM21303z, vsn0Var.getView());
        }
        vsn0 vsn0Var2 = this.inviteAffirmView;
        if (vsn0Var2 != null) {
            String strU = w8u.u(R.string.Nh, currentManagerName);
            strU.getClass();
            String strU2 = w8u.u(R.string.Mh, Integer.valueOf(ypv.m25490k().d6()));
            strU2.getClass();
            vsn0Var2.m23718j(strU, strU2, R.string.N1, R.string.K6, new d30() { // from class: l.jsn0
                public final void call() {
                    qsn0.m21268e(this.f15276a);
                }
            }, new d30() { // from class: l.ksn0
                public final void call() {
                    qsn0.m21270i(this.f15840a, accpetAction);
                }
            });
        }
        f2s f2sVar = this.affirmDialog;
        if (f2sVar != null) {
            f2sVar.show();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m21294O(@NotNull String name, boolean isFemale) {
        TextView textViewM19524c;
        TextView textViewM19524c2;
        name.getClass();
        boolean zM12831C4 = m21303z().m12831C4();
        if (this.inviteSuccessView == null) {
            Act act = m21303z().act();
            act.getClass();
            ntn0 ntn0Var = new ntn0(act);
            cxq.c(ntn0Var.m19526e(), new Function1() { // from class: l.psn0
                public final Object invoke(Object obj) {
                    return qsn0.m21262P(this.f18887a, (View) obj);
                }
            });
            cxq.c(ntn0Var.m19525d(), new Function1() { // from class: l.esn0
                public final Object invoke(Object obj) {
                    return qsn0.m21263Q(this.f12680a, (View) obj);
                }
            });
            if (zM12831C4) {
                ntn0Var.m19526e().setText(w8u.t(R.string.y5));
                ntn0Var.m19527f().setText("设置管理员");
            }
            this.inviteSuccessView = ntn0Var;
            csn0<?> csn0VarM21303z = m21303z();
            ntn0 ntn0Var2 = this.inviteSuccessView;
            ntn0Var2.getClass();
            this.inviteSuccessDialog = new f2s(csn0VarM21303z, ntn0Var2.getView());
        }
        int iM12830B4 = m21303z().m12830B4();
        if (zM12831C4) {
            String strW = r610.w(name, 6);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("已向 %s 发送管理员邀请，对方可协助你对本群进行管理，但你仍需对本群负责", Arrays.copyOf(new Object[]{strW}, 1));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            StyleSpan styleSpan = new StyleSpan(1);
            int iC0 = StringsKt.c0(str, strW, 0, false, 6, (Object) null);
            spannableStringBuilder.setSpan(styleSpan, iC0, strW.length() + iC0, 33);
            ntn0 ntn0Var3 = this.inviteSuccessView;
            if (ntn0Var3 != null && (textViewM19524c2 = ntn0Var3.m19524c()) != null) {
                textViewM19524c2.setText(spannableStringBuilder);
            }
        } else {
            ntn0 ntn0Var4 = this.inviteSuccessView;
            if (ntn0Var4 != null && (textViewM19524c = ntn0Var4.m19524c()) != null) {
                textViewM19524c.setText(w8u.v(R.string.Lh, new Object[]{name, Integer.valueOf(iM12830B4)}));
            }
        }
        f2s f2sVar = this.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.show();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m21295R(@Nullable List<? extends BLiveVoiceManagerInvite> onlineMembers, @Nullable List<? extends BLiveVoiceManagerInvite> historyManagers) {
        List<d1q<?>> listM21301u;
        List<d1q<?>> listM21278w;
        if (this.dialog == null) {
            LayoutInflater layoutInflaterInflater = m21303z().act().inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new byr(m21303z(), m21298q(layoutInflaterInflater, null));
            cxq.c(m21284E(), new Function1() { // from class: l.msn0
                public final Object invoke(Object obj) {
                    return qsn0.m21267d(this.f17073a, (View) obj);
                }
            });
            cxq.c(m21287H(), new Function1() { // from class: l.nsn0
                public final Object invoke(Object obj) {
                    return qsn0.m21271j(this.f17637a, (View) obj);
                }
            });
            m21280A().m16722l(false);
            ArrayList<String> arrayList = this.titleList;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            arrayList.add(String.format(ypv.f23200e.getString(R.string.xg) + "0/" + m21303z().m12830B4(), Arrays.copyOf(new Object[0], 0)));
            this.titleList.add(m21303z().act().getString(R.string.rh));
            ArrayList<View> arrayList2 = this.pageList;
            View viewM16715e = m21281B().getView();
            viewM16715e.getClass();
            arrayList2.add(viewM16715e);
            ArrayList<View> arrayList3 = this.pageList;
            View viewM16715e2 = m21280A().getView();
            viewM16715e2.getClass();
            arrayList3.add(viewM16715e2);
            m21299r();
        }
        if (onlineMembers != null && (listM21278w = m21278w(onlineMembers)) != null) {
            m21281B().m16721k(listM21278w);
        }
        if (historyManagers != null && (listM21301u = m21301u(historyManagers)) != null) {
            m21280A().m16721k(listM21301u);
        }
        byr byrVar = this.dialog;
        byrVar.getClass();
        byrVar.show();
    }

    /* JADX INFO: renamed from: S */
    public final void m21296S(int inviteCount) {
        if (this.dialog == null) {
            return;
        }
        int iM12830B4 = m21303z().m12830B4();
        TabLayout.Tab tabAt = m21285F().getTabAt(0);
        if (tabAt != null) {
            tabAt.setText(w8u.t(R.string.xg) + inviteCount + "/" + iM12830B4);
        }
    }

    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final View m21298q(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = rsn0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: r */
    public final void m21299r() {
        m21286G().setAdapter(m21282C());
        m21285F().setupWithViewPager(m21286G());
        m21285F().addOnTabSelectedListener(new C1154a());
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m21297i1(@NotNull csn0<?> anchorPresenter) {
        anchorPresenter.getClass();
        m21292M(anchorPresenter);
    }

    /* JADX INFO: renamed from: u */
    public final List<d1q<?>> m21301u(List<? extends BLiveVoiceManagerInvite> historyManagers) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(historyManagers, new e30() { // from class: l.lsn0
            public final void call(Object obj) {
                qsn0.m21269f(arrayList, this, (BLiveVoiceManagerInvite) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final void m21302y() {
        byr byrVar = this.dialog;
        if (byrVar != null) {
            byrVar.dismiss();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final csn0<?> m21303z() {
        csn0<?> csn0Var = this.anchorPresenter;
        if (csn0Var != null) {
            return csn0Var;
        }
        Intrinsics.r("anchorPresenter");
        return null;
    }

    public void destroy() {
    }
}
