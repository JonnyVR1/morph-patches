package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.card.SpeedUpCardAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.DropDownBgView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.DropDownRadarView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.TouchPullViewLayout;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\bJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020'¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020'¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020'¢\u0006\u0004\b4\u00102J\r\u00105\u001a\u00020'¢\u0006\u0004\b5\u00102J\r\u00106\u001a\u00020'¢\u0006\u0004\b6\u00102J\r\u00107\u001a\u00020'¢\u0006\u0004\b7\u00102J\r\u00108\u001a\u00020'¢\u0006\u0004\b8\u00102J\r\u00109\u001a\u00020'¢\u0006\u0004\b9\u00102J\r\u0010:\u001a\u00020'¢\u0006\u0004\b:\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010=R\"\u0010B\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010>\u001a\u0004\b?\u0010$\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010k\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\"\u0010x\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010[\u001a\u0004\bv\u0010]\"\u0004\bw\u0010_R\"\u0010{\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010S\u001a\u0004\by\u0010U\"\u0004\bz\u0010WR\"\u0010~\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010[\u001a\u0004\b|\u0010]\"\u0004\b}\u0010_R%\u0010\u0082\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010[\u001a\u0005\b\u0080\u0001\u0010]\"\u0005\b\u0081\u0001\u0010_R%\u0010\u0085\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b!\u0010c\u001a\u0005\b\u0083\u0001\u0010e\"\u0005\b\u0084\u0001\u0010gR)\u0010\u008c\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001a\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R%\u0010\u008f\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0015\u0010S\u001a\u0005\b\u008d\u0001\u0010U\"\u0005\b\u008e\u0001\u0010WR&\u0010\u0093\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010[\u001a\u0005\b\u0091\u0001\u0010]\"\u0005\b\u0092\u0001\u0010_R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009f\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010S\u001a\u0005\b\u009d\u0001\u0010U\"\u0005\b\u009e\u0001\u0010WR&\u0010£\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b \u0001\u0010[\u001a\u0005\b¡\u0001\u0010]\"\u0005\b¢\u0001\u0010_R*\u0010§\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u0096\u0001\u001a\u0006\b¥\u0001\u0010\u0098\u0001\"\u0006\b¦\u0001\u0010\u009a\u0001R&\u0010«\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¨\u0001\u0010S\u001a\u0005\b©\u0001\u0010U\"\u0005\bª\u0001\u0010WR&\u0010¯\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¬\u0001\u0010[\u001a\u0005\b\u00ad\u0001\u0010]\"\u0005\b®\u0001\u0010_R*\u0010³\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0096\u0001\u001a\u0006\b±\u0001\u0010\u0098\u0001\"\u0006\b²\u0001\u0010\u009a\u0001R&\u0010·\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010S\u001a\u0005\bµ\u0001\u0010U\"\u0005\b¶\u0001\u0010WR&\u0010»\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0001\u0010[\u001a\u0005\b¹\u0001\u0010]\"\u0005\bº\u0001\u0010_R&\u0010¿\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¼\u0001\u0010S\u001a\u0005\b½\u0001\u0010U\"\u0005\b¾\u0001\u0010WR&\u0010Ã\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÀ\u0001\u0010c\u001a\u0005\bÁ\u0001\u0010e\"\u0005\bÂ\u0001\u0010gR&\u0010Ç\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÄ\u0001\u0010[\u001a\u0005\bÅ\u0001\u0010]\"\u0005\bÆ\u0001\u0010_R&\u0010Ë\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÈ\u0001\u0010[\u001a\u0005\bÉ\u0001\u0010]\"\u0005\bÊ\u0001\u0010_R&\u0010Ï\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÌ\u0001\u0010[\u001a\u0005\bÍ\u0001\u0010]\"\u0005\bÎ\u0001\u0010_R\u0018\u0010Ò\u0001\u001a\u00030Ð\u00018\u0002X\u0082D¢\u0006\b\n\u0006\bÑ\u0001\u0010È\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Ô\u0001R\u0018\u0010×\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010Ô\u0001R\u0018\u0010Ù\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ô\u0001R\u0018\u0010Û\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Ô\u0001R\u0019\u0010Ü\u0001\u001a\u00030Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010Ô\u0001R\u001a\u0010Þ\u0001\u001a\u00030Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Ô\u0001R\u0018\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001c\u0010ä\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001c\u0010è\u0001\u001a\u0005\u0018\u00010å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010ê\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bé\u0001\u0010?R(\u0010ð\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0005\bí\u0001\u0010&\"\u0006\bî\u0001\u0010ï\u0001R\u001c\u0010ò\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ã\u0001R+\u0010ù\u0001\u001a\u0005\u0018\u00010ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R+\u0010ü\u0001\u001a\u0005\u0018\u00010ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b<\u0010ô\u0001\u001a\u0006\bú\u0001\u0010ö\u0001\"\u0006\bû\u0001\u0010ø\u0001R\u001d\u0010\u0081\u0002\u001a\u00030ý\u00018\u0006¢\u0006\u0010\n\u0006\bí\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002¨\u0006\u0082\u0002"}, m87232d2 = {"Ll/gee;", "Ll/ej2;", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;)V", "", "Q0", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "M", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/lde;", "presenter", "U", "(Ll/lde;)V", "inflateView", "r", "y0", "w0", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;", "produceType", "q", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "x0", "c", "S0", "R0", "v0", "p", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "X", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "m", "()Landroid/view/View;", "", "b", "()Ljava/lang/Boolean;", "destroy", "e", "f", Constants.INAPP_DATA_TAG, "isHide", "n", "(Z)V", "L0", "()Z", "J0", "K0", "O0", "N0", "I0", "M0", "G0", "H0", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "Z", "set_content_layout", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;)V", "_content_layout", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "get_dropdown_bg", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "set_dropdown_bg", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;)V", "_dropdown_bg", "Lv/VDraweeView;", "Lv/VDraweeView;", "a0", "()Lv/VDraweeView;", "set_header_img", "(Lv/VDraweeView;)V", "_header_img", "Lv/VLinear;", "g", "Lv/VLinear;", "g0", "()Lv/VLinear;", "set_ll_scene_entry", "(Lv/VLinear;)V", "_ll_scene_entry", "Lv/VText;", "h", "Lv/VText;", "t0", "()Lv/VText;", "set_tv_scene_con", "(Lv/VText;)V", "_tv_scene_con", "Lv/VImage;", RXScreenCaptureService.KEY_INDEX, "Lv/VImage;", "get_img_scene_con", "()Lv/VImage;", "set_img_scene_con", "(Lv/VImage;)V", "_img_scene_con", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "j", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "l0", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "set_loading_view", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;)V", "_loading_view", "k", "j0", "set_loading_img", "_loading_img", BLiveStormDanmakuGiftResourceType.f44444l, "k0", "set_loading_tips", "_loading_tips", "i0", "set_ll_top_hey", "_ll_top_hey", "get_ll_top_hey_tv", "set_ll_top_hey_tv", "_ll_top_hey_tv", "o", "o0", "set_tv_hey_loading", "_tv_hey_loading", "Y", "set_close", "_close", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_ll_btns", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_ll_btns", "e0", "set_ll_btns_online", "_ll_btns_online", BLiveStormDanmakuGiftResourceType.f44446s, "p0", "set_tv_online", "_tv_online", "Landroid/widget/TextView;", Constants.KEY_T, "Landroid/widget/TextView;", "q0", "()Landroid/widget/TextView;", "set_tv_online_tips", "(Landroid/widget/TextView;)V", "_tv_online_tips", "u", "c0", "set_ll_btns_audio", "_ll_btns_audio", ResourceDirection.f38808v, "r0", "set_tv_quick", "_tv_quick", "w", "s0", "set_tv_quick_tips", "_tv_quick_tips", BaseSei.f13930X, "d0", "set_ll_btns_heartbeat", "_ll_btns_heartbeat", BaseSei.f13931Y, "get_tv_heartbeat", "set_tv_heartbeat", "_tv_heartbeat", BaseSei.f13932Z, "get_tv_heartbeat_tips", "set_tv_heartbeat_tips", "_tv_heartbeat_tips", "A", "h0", "set_ll_to_top", "_ll_to_top", "B", "u0", "set_tv_to_top", "_tv_to_top", b2s.C_ZONE, "f0", "set_ll_scene", "_ll_scene", "D", "get_scene_ic", "set_scene_ic", "_scene_ic", "E", "n0", "set_scene_title", "_scene_title", "F", "get_scene_content", "set_scene_content", "_scene_content", "G", "m0", "set_scene_go", "_scene_go", "", "H", "NORMAL_ALPHA", "", "I", "MAX_ALPHA_HEIGHT", "J", "NORMAL_PULL_UP_DISTANCE", "K", "MAX_PULL_UP_DISTANCE", "L", "MEDIUM_SCREEN_DEL", "TARGET_NORMAL_PULL_UP_DISTANCE", "N", "TARGET_MAX_PULL_UP_DISTANCE", BloodType.f38728O, "Ll/lde;", "Landroid/animation/ValueAnimator;", "P", "Landroid/animation/ValueAnimator;", "loadingAnim", "Ll/xh0;", "Q", "Ll/xh0;", "exitAlerts", "R", "callonClick", j6f.LATITUDE_SOUTH, "Landroid/view/View;", "W", "P0", "(Landroid/view/View;)V", "contentViewAct", j6f.GPS_DIRECTION_TRUE, "scrollAnim", "", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "from", "getActive", "setActive", Active.TYPE, "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getCancelSceneAnim", "()Ljava/lang/Runnable;", "cancelSceneAnim", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class gee extends ej2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VLinear _ll_to_top;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VText _tv_to_top;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VLinear _ll_scene;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VImage _scene_ic;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VText _scene_title;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VText _scene_content;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VText _scene_go;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final float NORMAL_ALPHA;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final int MAX_ALPHA_HEIGHT;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final int NORMAL_PULL_UP_DISTANCE;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final int MAX_PULL_UP_DISTANCE;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final int MEDIUM_SCREEN_DEL;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int TARGET_NORMAL_PULL_UP_DISTANCE;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int TARGET_MAX_PULL_UP_DISTANCE;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public lde presenter;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator loadingAnim;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public xh0 exitAlerts;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean callonClick;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public View contentViewAct;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator scrollAnim;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    public String active;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public final Runnable cancelSceneAnim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final DropDownAct act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TouchPullViewLayout _content_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public DropDownBgView _dropdown_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _header_img;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VLinear _ll_scene_entry;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _tv_scene_con;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _img_scene_con;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public DropDownRadarView _loading_view;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public DropDownRadarView _loading_img;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _loading_tips;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VLinear _ll_top_hey;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _ll_top_hey_tv;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _tv_hey_loading;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ConstraintLayout _ll_btns;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VLinear _ll_btns_online;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _tv_online;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView _tv_online_tips;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VLinear _ll_btns_audio;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _tv_quick;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TextView _tv_quick_tips;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VLinear _ll_btns_heartbeat;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _tv_heartbeat;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public TextView _tv_heartbeat_tips;

    /* JADX INFO: renamed from: l.gee$a */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"l/gee$a", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout$b;", "", "a", "()V", "Landroid/view/MotionEvent;", "e1", "e2", "", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V", "e", "b", "(Landroid/view/MotionEvent;)V", "height", Constants.INAPP_DATA_TAG, "(F)F", "", "Z", "isFling", "()Z", "setFling", "(Z)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17064a implements TouchPullViewLayout.InterfaceC8819b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isFling;

        public C17064a() {
        }

        /* JADX INFO: renamed from: e */
        public static final void m125769e(gee geeVar, ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            int iIntValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = geeVar.m125749h0().getLayoutParams();
            layoutParams.height = iIntValue;
            geeVar.m125749h0().setLayoutParams(layoutParams);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.quickaudio.view.TouchPullViewLayout.InterfaceC8819b
        /* JADX INFO: renamed from: a */
        public void mo54616a() {
            this.isFling = true;
            gee.this.getAct().lambda$debugItems$19();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.quickaudio.view.TouchPullViewLayout.InterfaceC8819b
        /* JADX INFO: renamed from: b */
        public void mo54617b(MotionEvent e) {
            ValueAnimator valueAnimator;
            if (this.isFling) {
                return;
            }
            ValueAnimator valueAnimator2 = gee.this.scrollAnim;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = gee.this.scrollAnim) != null) {
                valueAnimator.end();
            }
            gee geeVar = gee.this;
            geeVar.scrollAnim = ValueAnimator.ofInt(geeVar.m125749h0().getLayoutParams().height, gee.this.TARGET_NORMAL_PULL_UP_DISTANCE);
            ValueAnimator valueAnimator3 = gee.this.scrollAnim;
            if (valueAnimator3 != null) {
                final gee geeVar2 = gee.this;
                valueAnimator3.setDuration(300L);
                valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fee
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        gee.C17064a.m125769e(geeVar2, valueAnimator4);
                    }
                });
                valueAnimator3.start();
            }
        }

        /* JADX INFO: renamed from: d */
        public final float m125770d(float height) {
            return ((((gee.this.NORMAL_PULL_UP_DISTANCE + height) - gee.this.NORMAL_PULL_UP_DISTANCE) - (gee.this.MAX_ALPHA_HEIGHT * gee.this.NORMAL_ALPHA)) / gee.this.MAX_ALPHA_HEIGHT) + gee.this.NORMAL_ALPHA;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.quickaudio.view.TouchPullViewLayout.InterfaceC8819b
        public void onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            if (distanceY >= 0.0f || gee.this.m125749h0().getLayoutParams().height + distanceY >= gee.this.TARGET_NORMAL_PULL_UP_DISTANCE) {
                float f = gee.this.m125749h0().getLayoutParams().height + (distanceY * (1.0f - (gee.this.m125749h0().getLayoutParams().height / gee.this.TARGET_MAX_PULL_UP_DISTANCE)));
                if (f > gee.this.TARGET_MAX_PULL_UP_DISTANCE) {
                    f = gee.this.TARGET_MAX_PULL_UP_DISTANCE;
                }
                ViewGroup.LayoutParams layoutParams = gee.this.m125749h0().getLayoutParams();
                layoutParams.height = (int) f;
                gee.this.m125749h0().setLayoutParams(layoutParams);
                gee.this.m125749h0().setAlpha(m125770d(f));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gee(@NotNull DropDownAct dropDownAct) {
        super(dropDownAct);
        dropDownAct.getClass();
        this.act = dropDownAct;
        this.NORMAL_ALPHA = 0.7f;
        this.MAX_ALPHA_HEIGHT = svq.m186103c(120);
        int iM186103c = svq.m186103c(84);
        this.NORMAL_PULL_UP_DISTANCE = iM186103c;
        int iM186103c2 = svq.m186103c(240);
        this.MAX_PULL_UP_DISTANCE = iM186103c2;
        this.MEDIUM_SCREEN_DEL = svq.m186103c(24);
        this.TARGET_NORMAL_PULL_UP_DISTANCE = iM186103c;
        this.TARGET_MAX_PULL_UP_DISTANCE = iM186103c2;
        this.active = "";
        this.cancelSceneAnim = new Runnable() { // from class: l.nde
            @Override // java.lang.Runnable
            public final void run() {
                gee.m125694B(this.f138279a);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m125692A(final gee geeVar, View view) {
        sqb0.Companion companion = sqb0.INSTANCE;
        if (companion.m185577f().getClickLock()) {
            return;
        }
        companion.m185577f().m185556a0();
        geeVar.m116762l();
        if (!geeVar.callonClick) {
            HashMap map = new HashMap();
            map.put("remainingtimes", Integer.valueOf(C8609a.m50246b0()));
            zvf0.m220397s("e_quickchat_button", "p_quickchat", map);
        }
        OnlineMatchManager.m50143z().m50190u0(geeVar.getAct(), new e30() { // from class: l.vde
            @Override // p149l.e30
            public final void call(Object obj) {
                gee.m125722z0(this.f181078a, (Boolean) obj);
            }
        });
        geeVar.callonClick = false;
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m125693A0(gee geeVar, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (z) {
            geeVar.mo116758f();
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m125694B(gee geeVar) {
        bt0.m103739l(geeVar.m125747f0(), View.TRANSLATION_Y, 0L, 400L, null, 0.0f, geeVar.m125747f0().getHeight()).start();
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m125695B0(gee geeVar, boolean z) {
        if (z) {
            sqb0.INSTANCE.m185577f().m185543I();
        }
        if (!z) {
            geeVar.m125734R0();
        }
        if (!geeVar.callonClick) {
            HashMap map = new HashMap();
            sqb0.Companion companion = sqb0.INSTANCE;
            map.put("remainingtimes", Integer.valueOf(companion.m185583l()));
            map.put("voicechat_results", companion.m185577f().getVoicechat_results());
            zvf0.m220397s("e_voicechat_button", "p_quickchat", map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static void m125696C(gee geeVar) {
        ValueAnimator valueAnimator = geeVar.loadingAnim;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = geeVar.loadingAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            geeVar.loadingAnim = null;
        }
        xdl0.m208344M(geeVar.m125753l0(), true);
        xdl0.m208344M(geeVar.m125751j0(), false);
        geeVar.m125753l0().setAlpha(1.0f);
        geeVar.m125735S0();
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m125697D0(gee geeVar, roj0 roj0Var) {
        geeVar.act.progressDismiss();
        e51.m114745J(geeVar.cancelSceneAnim);
        geeVar.cancelSceneAnim.run();
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m125699E0(gee geeVar, Throwable th) {
        geeVar.act.progressDismiss();
    }

    /* JADX INFO: renamed from: G */
    public static void m125701G(final gee geeVar, View view) {
        lde ldeVar = geeVar.presenter;
        lde ldeVar2 = null;
        if (ldeVar == null) {
            Intrinsics.m87502r("presenter");
            ldeVar = null;
        }
        if (ldeVar.m149430F0()) {
            return;
        }
        zvf0.m220396r("e_quickchat_matching_propscard_confirm", "p_quickchat");
        geeVar.act.progress(R$string.f17842J5, true);
        lde ldeVar3 = geeVar.presenter;
        if (ldeVar3 == null) {
            Intrinsics.m87502r("presenter");
        } else {
            ldeVar2 = ldeVar3;
        }
        ldeVar2.m149431s0().subscribe(mkd0.m154956H(new e30() { // from class: l.qde
            @Override // p149l.e30
            public final void call(Object obj) {
                gee.m125697D0(this.f153906a, (roj0) obj);
            }
        }, new e30() { // from class: l.rde
            @Override // p149l.e30
            public final void call(Object obj) {
                gee.m125699E0(this.f158910a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static void m125702H(gee geeVar, View view) {
        if (geeVar.f91659b.booleanValue()) {
            return;
        }
        sqb0.INSTANCE.m185577f().m185556a0();
        zvf0.m220399u("e_quickchat_return", "p_quickchat", j760.m140076a("chat_type", OnlineMatchManager.m50143z().m50153J() ? "funchat" : "quickchat"));
        geeVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: I */
    public static void m125703I(gee geeVar, View view) {
        lde ldeVar = geeVar.presenter;
        if (ldeVar == null) {
            Intrinsics.m87502r("presenter");
            ldeVar = null;
        }
        if (ldeVar.m149429E0()) {
            return;
        }
        geeVar.act.startActivity(SpeedUpCardAct.m54493Z1(geeVar.getAct()));
    }

    /* JADX INFO: renamed from: K */
    public static void m125705K(final gee geeVar, View view) {
        if (!PermissionHelper.m79881b("android.permission.RECORD_AUDIO")) {
            PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79894l(new PermissionHelper.InterfaceC13129b() { // from class: l.tde
                @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
                /* JADX INFO: renamed from: a */
                public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                    gee.m125693A0(this.f169545a, z, permissionDeniedReason);
                }
            }).m79891i(geeVar.act);
            return;
        }
        sqb0.Companion companion = sqb0.INSTANCE;
        if (companion.m185577f().getClickLock()) {
            return;
        }
        companion.m185577f().m185556a0();
        geeVar.m116762l();
        if (!TextUtils.equals(CoreModule.m29936Q().mo67229M6().mo102427l(100003), MomentAllowForwardState.allow)) {
            companion.m185577f().m185543I();
        } else {
            sqb0.m185491B0(companion.m185577f(), geeVar.act, false, false, new Function1() { // from class: l.ude
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gee.m125695B0(this.f175913a, ((Boolean) obj).booleanValue());
                }
            }, 6, null);
            geeVar.callonClick = false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m125706L(String str, gee geeVar, View view) {
        zvf0.m220399u("e_quickchat_matching_cancel_popup_exit", str, j760.m140076a("chat_type", OnlineMatchManager.m50143z().m50153J() ? "funchat" : "quickchat"));
        if (OnlineMatchManager.m50143z().m50155L()) {
            OnlineMatchManager.m50143z().f32594I.onNext(vwb.m200311Y("notify_normal_state", null));
            OnlineMatchManager.m50143z().m50191v();
        } else {
            sqb0.Companion companion = sqb0.INSTANCE;
            if (companion.m185577f().m185554Y()) {
                companion.m185577f().m185540D0();
            }
        }
        if (geeVar.m125727K0()) {
            geeVar.act.lambda$debugItems$19();
        } else if (geeVar.m125728L0()) {
            geeVar.act.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m125711Q0() {
        final String str = "p_quickchat_matching_cancel_popup";
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_quickchat_matching_cancel_popup", "dlg");
        cwf0VarM133794c.m109040p(j760.m140076a("tooltips_trigger_mode", "passive"), j760.m140076a("chat_type", OnlineMatchManager.m50143z().m50153J() ? "funchat" : "quickchat"));
        xh0 xh0VarM208722a = new xh0.C21150a(this.act).m208731j(OnlineMatchManager.m50143z().m50153J() ? "是否停止寻找心动信号" : "是否要停止寻找，退出页面将停止匹配").m208727f("退出").m208739r("继续寻找").m208724c(new View.OnClickListener() { // from class: l.wde
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m125706L(str, this, view);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.xde
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gee.m125715s(cwf0VarM133794c, dialogInterface);
            }
        }).m208722a();
        this.exitAlerts = xh0VarM208722a;
        if (xh0VarM208722a != null) {
            xh0VarM208722a.m208721g();
        }
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: s */
    public static void m125715s(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m125716u(gee geeVar, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        geeVar.m125766x0(quickChatProduce);
    }

    /* JADX INFO: renamed from: v */
    public static void m125717v(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static void m125718w(gee geeVar, User user) {
        qib0.f154691G.m102325I0(geeVar.m125742a0(), user.m60124fp().profileMiddle().formatted(), svq.m186103c(100), svq.m186103c(100));
    }

    /* JADX INFO: renamed from: y */
    public static void m125720y(gee geeVar, View view) {
        zvf0.m220396r("e_quickchat_matching_cancel", "p_quickchat");
        geeVar.m125711Q0();
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m125722z0(gee geeVar, Boolean bool) {
        if (!bool.booleanValue()) {
            sqb0.INSTANCE.m185577f().m185543I();
        }
        if (bool.booleanValue()) {
            geeVar.m125734R0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m125723G0() {
        return !this.callonClick;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m125724H0() {
        return "audio_quick_chat_guide".equals(this.from);
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m125725I0() {
        if ("p_fake_playground".equals(this.from)) {
            return TextUtils.equals(this.active, UnlockConversationType.quick_chat) || TextUtils.equals(this.active, "voice_quick_chat");
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m125726J0() {
        return "messages_view_quickchat_entry".equals(this.from);
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m125727K0() {
        return m125732O0() || m125731N0();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m125728L0() {
        return "p_state_explore".equals(this.from);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final View m125729M(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM130629b = hee.m130629b(this, inflater, parent);
        viewM130629b.getClass();
        return viewM130629b;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m125730M0() {
        return "svip_pay_success".equals(this.from) || "p_pay_result,e_quickchat_button,click".equals(this.from);
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m125731N0() {
        return "text_quickchat_party".equals(this.from);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m125732O0() {
        return "voice_quickchat_party".equals(this.from);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m125733P0(@NotNull View view) {
        view.getClass();
        this.contentViewAct = view;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull lde presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: V, reason: from getter */
    public final DropDownAct getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final View m125738W() {
        View view = this.contentViewAct;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("contentViewAct");
        return null;
    }

    @Override // p149l.ej2
    @NotNull
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public TouchPullViewLayout mo116760j() {
        return m125741Z();
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VImage m125740Y() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TouchPullViewLayout m125741Z() {
        TouchPullViewLayout touchPullViewLayout = this._content_layout;
        if (touchPullViewLayout != null) {
            return touchPullViewLayout;
        }
        Intrinsics.m87502r("_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VDraweeView m125742a0() {
        VDraweeView vDraweeView = this._header_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_header_img");
        return null;
    }

    @Override // p149l.ej2
    @NotNull
    /* JADX INFO: renamed from: b */
    public Boolean mo116754b() {
        lde ldeVar = this.presenter;
        if (ldeVar == null) {
            Intrinsics.m87502r("presenter");
            ldeVar = null;
        }
        if (!ldeVar.m149429E0()) {
            return Boolean.TRUE;
        }
        m125711Q0();
        return Boolean.FALSE;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final ConstraintLayout m125743b0() {
        ConstraintLayout constraintLayout = this._ll_btns;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_ll_btns");
        return null;
    }

    @Override // p149l.ej2
    /* JADX INFO: renamed from: c */
    public void mo116755c() {
        sqb0.INSTANCE.m185577f().m185543I();
        lde ldeVar = this.presenter;
        if (ldeVar == null) {
            Intrinsics.m87502r("presenter");
            ldeVar = null;
        }
        if (!ldeVar.getIsHideBotBtn()) {
            xdl0.m208344M(m125743b0(), true);
        }
        xdl0.m208344M(m125749h0(), true);
        m125741Z().setEnable(true);
        xdl0.m208344M(m125750i0(), true);
        xdl0.m208344M(m125740Y(), false);
        xdl0.m208344M(m125752k0(), false);
        m125764v0();
        DropDownRadarView dropDownRadarViewM125751j0 = m125751j0();
        Property property = View.ALPHA;
        Animator animatorM103739l = bt0.m103739l(dropDownRadarViewM125751j0, property, 0L, 300L, null, 1.0f, 0.0f);
        Animator animatorM103739l2 = bt0.m103739l(m125743b0(), property, 0L, 500L, null, 0.0f, 1.0f);
        VDraweeView vDraweeViewM125742a0 = m125742a0();
        Property property2 = View.TRANSLATION_Y;
        int i = t100.f167232G;
        Animator animatorM103753z = bt0.m103753z(animatorM103739l, animatorM103739l2, bt0.m103739l(vDraweeViewM125742a0, property2, 0L, 500L, null, i, 0.0f), bt0.m103739l(m125748g0(), property2, 0L, 500L, null, i, 0.0f), bt0.m103739l(m125749h0(), property2, 0L, 500L, null, m125749h0().getHeight(), 0.0f));
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.pde
            @Override // java.lang.Runnable
            public final void run() {
                gee.m125696C(this.f148295a);
            }
        });
        animatorM103753z.start();
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VLinear m125744c0() {
        VLinear vLinear = this._ll_btns_audio;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_ll_btns_audio");
        return null;
    }

    @Override // p149l.ej2
    /* JADX INFO: renamed from: d */
    public void mo116756d() {
        m125745d0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VLinear m125745d0() {
        VLinear vLinear = this._ll_btns_heartbeat;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_ll_btns_heartbeat");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        ValueAnimator valueAnimator = this.loadingAnim;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.loadingAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.loadingAnim = null;
        }
        m125764v0();
    }

    @Override // p149l.ej2
    /* JADX INFO: renamed from: e */
    public void mo116757e() {
        this.callonClick = true;
        m125746e0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VLinear m125746e0() {
        VLinear vLinear = this._ll_btns_online;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_ll_btns_online");
        return null;
    }

    @Override // p149l.ej2
    /* JADX INFO: renamed from: f */
    public void mo116758f() {
        this.callonClick = true;
        m125744c0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VLinear m125747f0() {
        VLinear vLinear = this._ll_scene;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_ll_scene");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VLinear m125748g0() {
        VLinear vLinear = this._ll_scene_entry;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_ll_scene_entry");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VLinear m125749h0() {
        VLinear vLinear = this._ll_to_top;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_ll_to_top");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VLinear m125750i0() {
        VLinear vLinear = this._ll_top_hey;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_ll_top_hey");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m125733P0(m125729M(inflater, parent));
        m125759r();
        return m125738W();
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final DropDownRadarView m125751j0() {
        DropDownRadarView dropDownRadarView = this._loading_img;
        if (dropDownRadarView != null) {
            return dropDownRadarView;
        }
        Intrinsics.m87502r("_loading_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VText m125752k0() {
        VText vText = this._loading_tips;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_loading_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final DropDownRadarView m125753l0() {
        DropDownRadarView dropDownRadarView = this._loading_view;
        if (dropDownRadarView != null) {
            return dropDownRadarView;
        }
        Intrinsics.m87502r("_loading_view");
        return null;
    }

    @Override // p149l.ej2
    @NotNull
    /* JADX INFO: renamed from: m */
    public View mo116763m() {
        return m125738W();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m125754m0() {
        VText vText = this._scene_go;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_scene_go");
        return null;
    }

    @Override // p149l.ej2
    /* JADX INFO: renamed from: n */
    public void mo116764n(boolean isHide) {
        xdl0.m208344M(m125743b0(), isHide);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VText m125755n0() {
        VText vText = this._scene_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_scene_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VText m125756o0() {
        VText vText = this._tv_hey_loading;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_hey_loading");
        return null;
    }

    @Override // p149l.ej2
    /* JADX INFO: renamed from: p */
    public void mo116765p() {
        if (xdl0.m208349O0(m125750i0())) {
            bt0.m103753z(bt0.m103739l(m125750i0(), View.TRANSLATION_Y, 0L, 1000L, null, 0.0f, svq.m186103c(70)), bt0.m103739l(m125750i0(), View.ALPHA, 0L, 1000L, null, 1.0f, 0.0f)).start();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final VText m125757p0() {
        VText vText = this._tv_online;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_online");
        return null;
    }

    @Override // p149l.ej2
    /* JADX INFO: renamed from: q */
    public void mo116766q(@NotNull final OnlineMatchManager.QuickChatProduce produceType) {
        produceType.getClass();
        xdl0.m208344M(m125750i0(), false);
        boolean z = produceType == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
        if (z) {
            m125741Z().setEnable(false);
        }
        m125735S0();
        DropDownRadarView dropDownRadarViewM125753l0 = m125753l0();
        Property property = View.ALPHA;
        Animator animatorM103739l = bt0.m103739l(dropDownRadarViewM125753l0, property, 0L, 300L, null, 1.0f, 0.0f);
        Animator animatorM103739l2 = bt0.m103739l(m125743b0(), property, 0L, 500L, null, 1.0f, 0.0f);
        VDraweeView vDraweeViewM125742a0 = m125742a0();
        Property property2 = View.TRANSLATION_Y;
        int i = t100.f167232G;
        Animator animatorM103753z = bt0.m103753z(animatorM103739l, animatorM103739l2, bt0.m103739l(vDraweeViewM125742a0, property2, 0L, 500L, null, 0.0f, i), bt0.m103739l(m125748g0(), property2, 0L, 500L, null, 0.0f, i), bt0.m103739l(m125749h0(), property2, 0L, 500L, null, 0.0f, z ? m125749h0().getHeight() : 0.0f));
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.sde
            @Override // java.lang.Runnable
            public final void run() {
                gee.m125716u(this.f163834a, produceType);
            }
        });
        animatorM103753z.start();
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final TextView m125758q0() {
        TextView textView = this._tv_online_tips;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tv_online_tips");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m125759r() {
        this.from = this.act.getIntent().getStringExtra("from");
        this.active = this.act.getIntent().getStringExtra(Active.TYPE);
        m125763u0().setText(m125728L0() ? "回到广场" : "回到消息");
        if (ogl0.m164238Q() && m125727K0()) {
            m125763u0().setText("回到首页");
        }
        if (m125725I0() || m125730M0()) {
            m125763u0().setText("返回");
        }
        m125749h0().setAlpha(this.NORMAL_ALPHA);
        if (hmb.m131711p1()) {
            int i = this.NORMAL_PULL_UP_DISTANCE;
            int i2 = this.MEDIUM_SCREEN_DEL;
            this.TARGET_NORMAL_PULL_UP_DISTANCE = i - i2;
            this.TARGET_MAX_PULL_UP_DISTANCE = this.MAX_PULL_UP_DISTANCE - i2;
        }
        C22306c c22306cDuringCreated = this.act.duringCreated(CoreModule.f17545c.f19639e0.m169523o9());
        if (c22306cDuringCreated != null) {
            c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.yde
                @Override // p149l.e30
                public final void call(Object obj) {
                    gee.m125718w(this.f197557a, (User) obj);
                }
            }, new e30() { // from class: l.zde
                @Override // p149l.e30
                public final void call(Object obj) {
                    gee.m125717v((Throwable) obj);
                }
            }));
        }
        m125757p0().setTypeface(eqh0.m117752c(3));
        m125760r0().setTypeface(eqh0.m117752c(3));
        m125755n0().setTypeface(eqh0.m117752c(3));
        m125762t0().setTypeface(eqh0.m117752c(3));
        m125756o0().setTypeface(eqh0.m117752c(3));
        m125758q0().setText(C8609a.m50279u() + "人在线");
        m125761s0().setText(ke50.m145719f());
        if (upa.m194663L1()) {
            m125758q0().setText("蒙面文字匹配");
            m125761s0().setText("对方递来耳机");
        }
        sqb0.INSTANCE.m185577f().m185543I();
        m125765w0();
        if (hmb.m131711p1()) {
            m125753l0().setScaleX(0.8f);
            m125753l0().setScaleY(0.8f);
            xdl0.m208325C0(m125749h0(), this.TARGET_NORMAL_PULL_UP_DISTANCE);
            xdl0.m208360X(m125763u0(), svq.m186103c(10));
        }
        xdl0.m208329E0(m125746e0(), new View.OnClickListener() { // from class: l.aee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m125692A(this.f69035a, view);
            }
        });
        xdl0.m208329E0(m125744c0(), new View.OnClickListener() { // from class: l.bee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m125705K(this.f75153a, view);
            }
        });
        xdl0.m208329E0(m125740Y(), new View.OnClickListener() { // from class: l.cee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m125720y(this.f80455a, view);
            }
        });
        xdl0.m208329E0(m125749h0(), new View.OnClickListener() { // from class: l.dee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m125702H(this.f85783a, view);
            }
        });
        xdl0.m208329E0(m125748g0(), new View.OnClickListener() { // from class: l.eee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m125703I(this.f90736a, view);
            }
        });
        xdl0.m208329E0(m125754m0(), new View.OnClickListener() { // from class: l.ode
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m125701G(this.f143198a, view);
            }
        });
        m125741Z().setOnFlingListener(new C17064a());
        m125767y0();
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VText m125760r0() {
        VText vText = this._tv_quick;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_quick");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final TextView m125761s0() {
        TextView textView = this._tv_quick_tips;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tv_quick_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final VText m125762t0() {
        VText vText = this._tv_scene_con;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_scene_con");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public final VText m125763u0() {
        VText vText = this._tv_to_top;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_to_top");
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m125765w0() {
        Animator animatorM103739l = bt0.m103739l(m125750i0(), View.TRANSLATION_Y, 0L, 1000L, null, svq.m186103c(70), 0.0f);
        VLinear vLinearM125750i0 = m125750i0();
        Property property = View.ALPHA;
        bt0.m103753z(animatorM103739l, bt0.m103739l(vLinearM125750i0, property, 0L, 1000L, null, 0.0f, 1.0f), bt0.m103739l(m125753l0(), property, 0L, 1000L, null, 0.0f, 1.0f)).start();
        xdl0.m208344M(m125753l0(), false);
        xdl0.m208344M(m125751j0(), false);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m125766x0(@NotNull OnlineMatchManager.QuickChatProduce produceType) {
        produceType.getClass();
        if (OnlineMatchManager.m50143z().m50155L() || sqb0.INSTANCE.m185577f().m185554Y()) {
            boolean z = produceType == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
            xdl0.m208344M(m125750i0(), false);
            xdl0.m208344M(m125753l0(), false);
            xdl0.m208344M(m125743b0(), false);
            if (z) {
                xdl0.m208344M(m125749h0(), false);
            }
            xdl0.m208344M(m125751j0(), true);
            m125751j0().setAlpha(1.0f);
            xdl0.m208344M(m125752k0(), true);
            xdl0.m208344M(m125740Y(), true);
            OnlineMatchManager.QuickChatProduce quickChatProduce = OnlineMatchManager.QuickChatProduce.Heartbeat;
            if (produceType == quickChatProduce) {
                m125752k0().setText("正在帮你寻找附近的小姐姐");
            } else if (z) {
                m125752k0().setText("正在搜索语音闪聊…");
            } else {
                m125752k0().setText("正在搜索在线闪聊…");
            }
            if (produceType == quickChatProduce) {
                zvf0.m220402x("e_funchat_loading", "p_quickchat");
            } else {
                HashMap map = new HashMap();
                map.put("is_voicechat", Boolean.valueOf(z));
                zvf0.m220403y("e_quickchat_matching", "p_quickchat", map);
            }
            m125735S0();
            VDraweeView vDraweeViewM125742a0 = m125742a0();
            int i = t100.f167232G;
            vDraweeViewM125742a0.setTranslationY(i);
            m125748g0().setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m125734R0() {
    }

    /* JADX INFO: renamed from: S0 */
    public void m125735S0() {
    }

    /* JADX INFO: renamed from: v0 */
    public void m125764v0() {
    }

    /* JADX INFO: renamed from: y0 */
    public final void m125767y0() {
    }
}
