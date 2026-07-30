package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.StringRes;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Q2\u00020\u0001:\u0003\u0013\u000f\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010:\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010<\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010D\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00105R\u0014\u0010F\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u001bR(\u0010L\u001a\u0016\u0012\u0004\u0012\u00020H\u0018\u00010Gj\n\u0012\u0004\u0012\u00020H\u0018\u0001`I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006R"}, m87232d2 = {"Ll/tje;", "", "Ll/tje$a;", "builder", "<init>", "(Ll/tje$a;)V", "", "f", "()V", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "contentView", "e", "(Landroid/view/View;)V", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "", "b", "Ljava/lang/CharSequence;", "titleText", "c", "confirmText", "cancelText", "hintText", "", "Z", "cancelable", "g", "canceledOnTouchOutside", "Ll/tje$c;", "h", "Ll/tje$c;", "confirmClickListener", "Landroid/view/View$OnClickListener;", RXScreenCaptureService.KEY_INDEX, "Landroid/view/View$OnClickListener;", "cancelClickListener", "Landroid/content/DialogInterface$OnCancelListener;", "j", "Landroid/content/DialogInterface$OnCancelListener;", "dialogCancelListener", "Landroid/content/DialogInterface$OnShowListener;", "k", "Landroid/content/DialogInterface$OnShowListener;", "dialogShowListener", "Landroid/content/DialogInterface$OnDismissListener;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/content/DialogInterface$OnDismissListener;", "dialogDismissListener", "", "m", "I", "confirmColorResId", "n", "cancelColorResId", "o", "confirmBgDrawableId", "p", "editTextMaxSize", "", "q", "Ljava/lang/String;", "editLimitText", "r", "emptyInputToastText", BLiveStormDanmakuGiftResourceType.f44446s, "dialogStyle", Constants.KEY_T, "autoDismiss", "Ljava/util/ArrayList;", "Landroid/text/InputFilter;", "Lkotlin/collections/ArrayList;", "u", "Ljava/util/ArrayList;", "inputFilters", "Landroidx/appcompat/app/a;", ResourceDirection.f38808v, "Landroidx/appcompat/app/a;", OMSTemplateType.dialog, "Companion", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class tje {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CharSequence titleText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CharSequence confirmText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final CharSequence cancelText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final CharSequence hintText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean cancelable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean canceledOnTouchOutside;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC20189c confirmClickListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final View.OnClickListener cancelClickListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final DialogInterface.OnCancelListener dialogCancelListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final DialogInterface.OnShowListener dialogShowListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final DialogInterface.OnDismissListener dialogDismissListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int confirmColorResId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final int cancelColorResId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int confirmBgDrawableId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int editTextMaxSize;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final String editLimitText;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final String emptyInputToastText;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int dialogStyle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final boolean autoDismiss;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public final ArrayList<InputFilter> inputFilters;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public DialogInterfaceC0074a dialog;

    /* JADX INFO: renamed from: l.tje$a */
    @Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\tJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\tJ\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\rJ\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010%J%\u0010,\u001a\u00020\u00002\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u00103R$\u0010:\u001a\u0002042\u0006\u00105\u001a\u0002048\u0006@BX\u0086.¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010=\u001a\u0002042\u0006\u00105\u001a\u0002048\u0006@BX\u0086.¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R$\u0010@\u001a\u0002042\u0006\u00105\u001a\u0002048\u0006@BX\u0086.¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R$\u0010B\u001a\u0002042\u0006\u00105\u001a\u0002048\u0006@BX\u0086.¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\bA\u00109R$\u0010\u0014\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010ER$\u0010\u0016\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\bF\u0010ER(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u00105\u001a\u0004\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u00105\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010K\u001a\u0004\b;\u0010LR(\u0010R\u001a\u0004\u0018\u00010M2\b\u00105\u001a\u0004\u0018\u00010M8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR(\u0010W\u001a\u0004\u0018\u00010S2\b\u00105\u001a\u0004\u0018\u00010S8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010T\u001a\u0004\bU\u0010VR(\u0010\\\u001a\u0004\u0018\u00010X2\b\u00105\u001a\u0004\u0018\u00010X8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010Y\u001a\u0004\bZ\u0010[R$\u0010^\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bN\u0010]R$\u0010_\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bZ\u0010\f\u001a\u0004\b>\u0010]R$\u0010`\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010\f\u001a\u0004\bG\u0010]R$\u0010b\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\ba\u0010\f\u001a\u0004\ba\u0010]R$\u0010\u0007\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bc\u0010D\u001a\u0004\b6\u0010ER$\u0010e\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bd\u0010\f\u001a\u0004\bd\u0010]R$\u0010i\u001a\u00020\"2\u0006\u00105\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bc\u0010hR$\u0010&\u001a\u00020\"2\u0006\u00105\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u0010g\u001a\u0004\bf\u0010hRL\u0010m\u001a\u0016\u0012\u0004\u0012\u00020)\u0018\u00010(j\n\u0012\u0004\u0012\u00020)\u0018\u0001`*2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u00020)\u0018\u00010(j\n\u0012\u0004\u0012\u00020)\u0018\u0001`*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bj\u0010l¨\u0006n"}, m87232d2 = {"Ll/tje$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "autoDismiss", "w", "(Z)Ll/tje$a;", "", "titleResId", "I", "(I)Ll/tje$a;", "confirmResId", b2s.C_ZONE, "cancelResId", BaseSei.f13931Y, "hintResId", "G", "cancelable", BaseSei.f13932Z, "canceledOnTouchOutside", "A", "Ll/tje$c;", "confirmClickListener", "B", "(Ll/tje$c;)Ll/tje$a;", "Landroid/view/View$OnClickListener;", "cancelClickListener", BaseSei.f13930X, "(Landroid/view/View$OnClickListener;)Ll/tje$a;", "maxSize", "E", "", "limitText", "D", "(Ljava/lang/String;)Ll/tje$a;", "emptyInputToastText", "F", "Ljava/util/ArrayList;", "Landroid/text/InputFilter;", "Lkotlin/collections/ArrayList;", "filters", "H", "(Ljava/util/ArrayList;)Ll/tje$a;", "Ll/tje;", "a", "()Ll/tje;", "Landroid/content/Context;", BLiveStormDanmakuGiftResourceType.f44444l, "()Landroid/content/Context;", "", "value", "b", "Ljava/lang/CharSequence;", ResourceDirection.f38808v, "()Ljava/lang/CharSequence;", "title", "c", "k", "confirmText", Constants.INAPP_DATA_TAG, "e", "cancelText", Constants.KEY_T, "hintText", "f", "Z", "()Z", "g", "h", "Ll/tje$c;", RXScreenCaptureService.KEY_INDEX, "()Ll/tje$c;", "Landroid/view/View$OnClickListener;", "()Landroid/view/View$OnClickListener;", "Landroid/content/DialogInterface$OnCancelListener;", "j", "Landroid/content/DialogInterface$OnCancelListener;", "m", "()Landroid/content/DialogInterface$OnCancelListener;", "dialogCancelListener", "Landroid/content/DialogInterface$OnShowListener;", "Landroid/content/DialogInterface$OnShowListener;", "o", "()Landroid/content/DialogInterface$OnShowListener;", "dialogShowListener", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnDismissListener;", "n", "()Landroid/content/DialogInterface$OnDismissListener;", "dialogDismissListener", "()I", "confirmColorResId", "cancelColorResId", "confirmBgDrawableId", "p", "dialogStyle", "q", "r", "editTextMaxSize", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/lang/String;", "()Ljava/lang/String;", "editLimitText", "u", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "inputFilters", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20187a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public CharSequence title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public CharSequence confirmText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public CharSequence cancelText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public CharSequence hintText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean cancelable;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean canceledOnTouchOutside;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public InterfaceC20189c confirmClickListener;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public View.OnClickListener cancelClickListener;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public DialogInterface.OnCancelListener dialogCancelListener;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public DialogInterface.OnShowListener dialogShowListener;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public DialogInterface.OnDismissListener dialogDismissListener;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public int confirmColorResId;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public int cancelColorResId;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public int confirmBgDrawableId;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public int dialogStyle;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public boolean autoDismiss;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        public int editTextMaxSize;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        public String editLimitText;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @NotNull
        public String emptyInputToastText;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @Nullable
        public ArrayList<InputFilter> inputFilters;

        public C20187a(@NotNull Context context) {
            context.getClass();
            this.context = context;
            this.cancelable = true;
            this.canceledOnTouchOutside = true;
            this.confirmColorResId = h1c0.f105416w1;
            this.cancelColorResId = h1c0.f105350a1;
            this.confirmBgDrawableId = i3c0.f111142r0;
            this.dialogStyle = n8c0.f137617a;
            this.autoDismiss = true;
            this.editTextMaxSize = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            String strM202217t = w8u.m202217t(R$string.f47222ek);
            strM202217t.getClass();
            this.editLimitText = strM202217t;
            String strM202217t2 = w8u.m202217t(R$string.f47200dk);
            strM202217t2.getClass();
            this.emptyInputToastText = strM202217t2;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public final C20187a m189257A(boolean canceledOnTouchOutside) {
            this.canceledOnTouchOutside = canceledOnTouchOutside;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: B */
        public final C20187a m189258B(@NotNull InterfaceC20189c confirmClickListener) {
            confirmClickListener.getClass();
            this.confirmClickListener = confirmClickListener;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: C */
        public final C20187a m189259C(@StringRes int confirmResId) {
            String string = this.context.getString(confirmResId);
            string.getClass();
            this.confirmText = string;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: D */
        public final C20187a m189260D(@NotNull String limitText) {
            limitText.getClass();
            this.editLimitText = limitText;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: E */
        public final C20187a m189261E(int maxSize) {
            this.editTextMaxSize = maxSize;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: F */
        public final C20187a m189262F(@NotNull String emptyInputToastText) {
            emptyInputToastText.getClass();
            this.emptyInputToastText = emptyInputToastText;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: G */
        public final C20187a m189263G(@StringRes int hintResId) {
            String string = this.context.getString(hintResId);
            string.getClass();
            this.hintText = string;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: H */
        public final C20187a m189264H(@NotNull ArrayList<InputFilter> filters) {
            filters.getClass();
            this.inputFilters = filters;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: I */
        public final C20187a m189265I(@StringRes int titleResId) {
            String string = this.context.getString(titleResId);
            string.getClass();
            this.title = string;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final tje m189266a() {
            return new tje(this);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getAutoDismiss() {
            return this.autoDismiss;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final View.OnClickListener getCancelClickListener() {
            return this.cancelClickListener;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getCancelColorResId() {
            return this.cancelColorResId;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final CharSequence m189270e() {
            CharSequence charSequence = this.cancelText;
            if (charSequence != null) {
                return charSequence;
            }
            Intrinsics.m87502r("cancelText");
            return null;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getCancelable() {
            return this.cancelable;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getCanceledOnTouchOutside() {
            return this.canceledOnTouchOutside;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getConfirmBgDrawableId() {
            return this.confirmBgDrawableId;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final InterfaceC20189c getConfirmClickListener() {
            return this.confirmClickListener;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getConfirmColorResId() {
            return this.confirmColorResId;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final CharSequence m189276k() {
            CharSequence charSequence = this.confirmText;
            if (charSequence != null) {
                return charSequence;
            }
            Intrinsics.m87502r("confirmText");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final DialogInterface.OnCancelListener getDialogCancelListener() {
            return this.dialogCancelListener;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final DialogInterface.OnDismissListener getDialogDismissListener() {
            return this.dialogDismissListener;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final DialogInterface.OnShowListener getDialogShowListener() {
            return this.dialogShowListener;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final int getDialogStyle() {
            return this.dialogStyle;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getEditLimitText() {
            return this.editLimitText;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final int getEditTextMaxSize() {
            return this.editTextMaxSize;
        }

        @NotNull
        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getEmptyInputToastText() {
            return this.emptyInputToastText;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final CharSequence m189285t() {
            CharSequence charSequence = this.hintText;
            if (charSequence != null) {
                return charSequence;
            }
            Intrinsics.m87502r("hintText");
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: u */
        public final ArrayList<InputFilter> m189286u() {
            return this.inputFilters;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final CharSequence m189287v() {
            CharSequence charSequence = this.title;
            if (charSequence != null) {
                return charSequence;
            }
            Intrinsics.m87502r("title");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public final C20187a m189288w(boolean autoDismiss) {
            this.autoDismiss = autoDismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public final C20187a m189289x(@NotNull View.OnClickListener cancelClickListener) {
            cancelClickListener.getClass();
            this.cancelClickListener = cancelClickListener;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: y */
        public final C20187a m189290y(@StringRes int cancelResId) {
            String string = this.context.getString(cancelResId);
            string.getClass();
            this.cancelText = string;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: z */
        public final C20187a m189291z(boolean cancelable) {
            this.cancelable = cancelable;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.tje$c */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m87232d2 = {"Ll/tje$c;", "", "", "inputText", "", "a", "(Ljava/lang/CharSequence;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC20189c {
        /* JADX INFO: renamed from: a */
        void mo159949a(@NotNull CharSequence inputText);
    }

    public tje(@NotNull C20187a c20187a) {
        c20187a.getClass();
        this.context = c20187a.getContext();
        this.titleText = c20187a.m189287v();
        this.confirmText = c20187a.m189276k();
        this.cancelText = c20187a.m189270e();
        this.hintText = c20187a.m189285t();
        this.cancelable = c20187a.getCancelable();
        this.canceledOnTouchOutside = c20187a.getCanceledOnTouchOutside();
        this.confirmClickListener = c20187a.getConfirmClickListener();
        this.cancelClickListener = c20187a.getCancelClickListener();
        this.dialogCancelListener = c20187a.getDialogCancelListener();
        this.dialogShowListener = c20187a.getDialogShowListener();
        this.dialogDismissListener = c20187a.getDialogDismissListener();
        this.confirmColorResId = c20187a.getConfirmColorResId();
        this.cancelColorResId = c20187a.getCancelColorResId();
        this.confirmBgDrawableId = c20187a.getConfirmBgDrawableId();
        this.editTextMaxSize = c20187a.getEditTextMaxSize();
        this.editLimitText = c20187a.getEditLimitText();
        this.emptyInputToastText = c20187a.getEmptyInputToastText();
        this.dialogStyle = c20187a.getDialogStyle();
        this.autoDismiss = c20187a.getAutoDismiss();
        this.inputFilters = c20187a.m189286u();
    }

    /* JADX INFO: renamed from: a */
    public static void m189251a(VEditText vEditText, tje tjeVar, View view) {
        Editable text = vEditText.getText();
        if (text == null || text.length() == 0) {
            lsi0.m151595y(tjeVar.emptyInputToastText);
            return;
        }
        if (vEditText.length() > tjeVar.editTextMaxSize) {
            lsi0.m151595y(tjeVar.editLimitText);
            return;
        }
        if (tjeVar.autoDismiss) {
            tjeVar.m189254d();
        }
        InterfaceC20189c interfaceC20189c = tjeVar.confirmClickListener;
        if (interfaceC20189c != null) {
            Editable text2 = vEditText.getText();
            text2.getClass();
            interfaceC20189c.mo159949a(text2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m189252b(VEditText vEditText) {
        vEditText.requestFocus();
        vEditText.setSelection(0);
    }

    /* JADX INFO: renamed from: c */
    public static void m189253c(tje tjeVar, View view) {
        tjeVar.m189254d();
        View.OnClickListener onClickListener = tjeVar.cancelClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m189254d() {
        DialogInterfaceC0074a dialogInterfaceC0074a = this.dialog;
        if (dialogInterfaceC0074a == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialogInterfaceC0074a = null;
        }
        dialogInterfaceC0074a.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m189255e(View contentView) {
        ((VText) contentView.findViewById(g5c0.f100932g)).setText(this.titleText);
        VText vText = (VText) contentView.findViewById(g5c0.f100892c);
        vText.setTextColor(kvc0.m147352a(this.cancelColorResId));
        vText.setText(this.cancelText);
        VButton vButton = (VButton) contentView.findViewById(g5c0.f100902d);
        vButton.setBackgroundResource(this.confirmBgDrawableId);
        vButton.setTextColor(kvc0.m147352a(this.confirmColorResId));
        vButton.setText(this.confirmText);
        final VEditText vEditText = (VEditText) contentView.findViewById(g5c0.f100922f);
        vEditText.setHint(this.hintText);
        vEditText.setCursorVisible(true);
        vEditText.requestFocus();
        ArrayList<InputFilter> arrayList = this.inputFilters;
        if (arrayList != null && !arrayList.isEmpty()) {
            vEditText.setFilters((InputFilter[]) this.inputFilters.toArray(new InputFilter[0]));
        }
        e51.m114742G(new Runnable() { // from class: l.qje
            @Override // java.lang.Runnable
            public final void run() {
                tje.m189252b(vEditText);
            }
        });
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.rje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tje.m189251a(vEditText, this, view);
            }
        });
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.sje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tje.m189253c(this.f164832a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m189256f() {
        DialogInterfaceC0074a dialogInterfaceC0074a = null;
        View viewInflate = LayoutInflater.from(this.context).inflate(t6c0.f168363h0, (ViewGroup) null);
        DialogInterfaceC0074a dialogInterfaceC0074aCreate = new DialogInterfaceC0074a.a(this.context, this.dialogStyle).setView(viewInflate).create();
        dialogInterfaceC0074aCreate.getClass();
        this.dialog = dialogInterfaceC0074aCreate;
        if (dialogInterfaceC0074aCreate == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialogInterfaceC0074aCreate = null;
        }
        Window window = dialogInterfaceC0074aCreate.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
        DialogInterfaceC0074a dialogInterfaceC0074a2 = this.dialog;
        if (dialogInterfaceC0074a2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialogInterfaceC0074a2 = null;
        }
        dialogInterfaceC0074a2.setCancelable(this.cancelable);
        dialogInterfaceC0074a2.setCanceledOnTouchOutside(this.canceledOnTouchOutside);
        dialogInterfaceC0074a2.setOnCancelListener(this.dialogCancelListener);
        dialogInterfaceC0074a2.setOnDismissListener(this.dialogDismissListener);
        dialogInterfaceC0074a2.setOnShowListener(this.dialogShowListener);
        viewInflate.getClass();
        m189255e(viewInflate);
        DialogInterfaceC0074a dialogInterfaceC0074a3 = this.dialog;
        if (dialogInterfaceC0074a3 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialogInterfaceC0074a = dialogInterfaceC0074a3;
        }
        dialogInterfaceC0074a.show();
        if (window != null) {
            window.setLayout(xdl0.m208412y0() - (t100.m186890d(32.0f) * 2), t100.m186890d(285.0f));
        }
    }

    /* JADX INFO: renamed from: l.tje$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/tje$b;", "", "<init>", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}
