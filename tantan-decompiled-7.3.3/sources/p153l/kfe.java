package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.card.SpeedUpCardAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.view.DropDownBgView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.view.DropDownRadarView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.view.TouchPullViewLayout;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\bJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020'¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020'¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020'¢\u0006\u0004\b4\u00102J\r\u00105\u001a\u00020'¢\u0006\u0004\b5\u00102J\r\u00106\u001a\u00020'¢\u0006\u0004\b6\u00102J\r\u00107\u001a\u00020'¢\u0006\u0004\b7\u00102J\r\u00108\u001a\u00020'¢\u0006\u0004\b8\u00102J\r\u00109\u001a\u00020'¢\u0006\u0004\b9\u00102J\r\u0010:\u001a\u00020'¢\u0006\u0004\b:\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010=R\"\u0010B\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010>\u001a\u0004\b?\u0010$\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010k\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\"\u0010x\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010[\u001a\u0004\bv\u0010]\"\u0004\bw\u0010_R\"\u0010{\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010S\u001a\u0004\by\u0010U\"\u0004\bz\u0010WR\"\u0010~\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010[\u001a\u0004\b|\u0010]\"\u0004\b}\u0010_R%\u0010\u0082\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010[\u001a\u0005\b\u0080\u0001\u0010]\"\u0005\b\u0081\u0001\u0010_R%\u0010\u0085\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b!\u0010c\u001a\u0005\b\u0083\u0001\u0010e\"\u0005\b\u0084\u0001\u0010gR)\u0010\u008c\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001a\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R%\u0010\u008f\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0015\u0010S\u001a\u0005\b\u008d\u0001\u0010U\"\u0005\b\u008e\u0001\u0010WR&\u0010\u0093\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010[\u001a\u0005\b\u0091\u0001\u0010]\"\u0005\b\u0092\u0001\u0010_R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009f\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010S\u001a\u0005\b\u009d\u0001\u0010U\"\u0005\b\u009e\u0001\u0010WR&\u0010£\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b \u0001\u0010[\u001a\u0005\b¡\u0001\u0010]\"\u0005\b¢\u0001\u0010_R*\u0010§\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u0096\u0001\u001a\u0006\b¥\u0001\u0010\u0098\u0001\"\u0006\b¦\u0001\u0010\u009a\u0001R&\u0010«\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¨\u0001\u0010S\u001a\u0005\b©\u0001\u0010U\"\u0005\bª\u0001\u0010WR&\u0010¯\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¬\u0001\u0010[\u001a\u0005\b\u00ad\u0001\u0010]\"\u0005\b®\u0001\u0010_R*\u0010³\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0096\u0001\u001a\u0006\b±\u0001\u0010\u0098\u0001\"\u0006\b²\u0001\u0010\u009a\u0001R&\u0010·\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010S\u001a\u0005\bµ\u0001\u0010U\"\u0005\b¶\u0001\u0010WR&\u0010»\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0001\u0010[\u001a\u0005\b¹\u0001\u0010]\"\u0005\bº\u0001\u0010_R&\u0010¿\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¼\u0001\u0010S\u001a\u0005\b½\u0001\u0010U\"\u0005\b¾\u0001\u0010WR&\u0010Ã\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÀ\u0001\u0010c\u001a\u0005\bÁ\u0001\u0010e\"\u0005\bÂ\u0001\u0010gR&\u0010Ç\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÄ\u0001\u0010[\u001a\u0005\bÅ\u0001\u0010]\"\u0005\bÆ\u0001\u0010_R&\u0010Ë\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÈ\u0001\u0010[\u001a\u0005\bÉ\u0001\u0010]\"\u0005\bÊ\u0001\u0010_R&\u0010Ï\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÌ\u0001\u0010[\u001a\u0005\bÍ\u0001\u0010]\"\u0005\bÎ\u0001\u0010_R\u0018\u0010Ò\u0001\u001a\u00030Ð\u00018\u0002X\u0082D¢\u0006\b\n\u0006\bÑ\u0001\u0010È\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Ô\u0001R\u0018\u0010×\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010Ô\u0001R\u0018\u0010Ù\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ô\u0001R\u0018\u0010Û\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Ô\u0001R\u0019\u0010Ü\u0001\u001a\u00030Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010Ô\u0001R\u001a\u0010Þ\u0001\u001a\u00030Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Ô\u0001R\u0018\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001c\u0010ä\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001c\u0010è\u0001\u001a\u0005\u0018\u00010å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010ê\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bé\u0001\u0010?R(\u0010ð\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0005\bí\u0001\u0010&\"\u0006\bî\u0001\u0010ï\u0001R\u001c\u0010ò\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ã\u0001R+\u0010ù\u0001\u001a\u0005\u0018\u00010ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R+\u0010ü\u0001\u001a\u0005\u0018\u00010ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b<\u0010ô\u0001\u001a\u0006\bú\u0001\u0010ö\u0001\"\u0006\bû\u0001\u0010ø\u0001R\u001d\u0010\u0081\u0002\u001a\u00030ý\u00018\u0006¢\u0006\u0010\n\u0006\bí\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002¨\u0006\u0082\u0002"}, m88121d2 = {"Ll/kfe;", "Ll/mj2;", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;)V", "", "Q0", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "M", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/pee;", "presenter", "U", "(Ll/pee;)V", "inflateView", "r", "y0", "w0", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;", "produceType", "q", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "x0", "c", "S0", "R0", "v0", "p", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "X", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "m", "()Landroid/view/View;", "", "b", "()Ljava/lang/Boolean;", "destroy", "e", "f", Constants.INAPP_DATA_TAG, "isHide", "n", "(Z)V", "L0", "()Z", "J0", "K0", "O0", "N0", "I0", "M0", "G0", "H0", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "Z", "set_content_layout", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;)V", "_content_layout", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "get_dropdown_bg", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "set_dropdown_bg", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;)V", "_dropdown_bg", "Lv/VDraweeView;", "Lv/VDraweeView;", "a0", "()Lv/VDraweeView;", "set_header_img", "(Lv/VDraweeView;)V", "_header_img", "Lv/VLinear;", "g", "Lv/VLinear;", "g0", "()Lv/VLinear;", "set_ll_scene_entry", "(Lv/VLinear;)V", "_ll_scene_entry", "Lv/VText;", "h", "Lv/VText;", "t0", "()Lv/VText;", "set_tv_scene_con", "(Lv/VText;)V", "_tv_scene_con", "Lv/VImage;", RXScreenCaptureService.KEY_INDEX, "Lv/VImage;", "get_img_scene_con", "()Lv/VImage;", "set_img_scene_con", "(Lv/VImage;)V", "_img_scene_con", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "j", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "l0", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "set_loading_view", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;)V", "_loading_view", "k", "j0", "set_loading_img", "_loading_img", BLiveStormDanmakuGiftResourceType.f45292l, "k0", "set_loading_tips", "_loading_tips", "i0", "set_ll_top_hey", "_ll_top_hey", "get_ll_top_hey_tv", "set_ll_top_hey_tv", "_ll_top_hey_tv", "o", "o0", "set_tv_hey_loading", "_tv_hey_loading", "Y", "set_close", "_close", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_ll_btns", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_ll_btns", "e0", "set_ll_btns_online", "_ll_btns_online", BLiveStormDanmakuGiftResourceType.f45294s, "p0", "set_tv_online", "_tv_online", "Landroid/widget/TextView;", Constants.KEY_T, "Landroid/widget/TextView;", "q0", "()Landroid/widget/TextView;", "set_tv_online_tips", "(Landroid/widget/TextView;)V", "_tv_online_tips", "u", "c0", "set_ll_btns_audio", "_ll_btns_audio", ResourceDirection.f39656v, "r0", "set_tv_quick", "_tv_quick", "w", "s0", "set_tv_quick_tips", "_tv_quick_tips", BaseSei.f14624X, "d0", "set_ll_btns_heartbeat", "_ll_btns_heartbeat", BaseSei.f14625Y, "get_tv_heartbeat", "set_tv_heartbeat", "_tv_heartbeat", BaseSei.f14626Z, "get_tv_heartbeat_tips", "set_tv_heartbeat_tips", "_tv_heartbeat_tips", "A", "h0", "set_ll_to_top", "_ll_to_top", "B", "u0", "set_tv_to_top", "_tv_to_top", c4s.C_ZONE, "f0", "set_ll_scene", "_ll_scene", "D", "get_scene_ic", "set_scene_ic", "_scene_ic", "E", "n0", "set_scene_title", "_scene_title", "F", "get_scene_content", "set_scene_content", "_scene_content", "G", "m0", "set_scene_go", "_scene_go", "", "H", "NORMAL_ALPHA", "", "I", "MAX_ALPHA_HEIGHT", "J", "NORMAL_PULL_UP_DISTANCE", "K", "MAX_PULL_UP_DISTANCE", "L", "MEDIUM_SCREEN_DEL", "TARGET_NORMAL_PULL_UP_DISTANCE", "N", "TARGET_MAX_PULL_UP_DISTANCE", BloodType.f39576O, "Ll/pee;", "Landroid/animation/ValueAnimator;", "P", "Landroid/animation/ValueAnimator;", "loadingAnim", "Ll/th0;", "Q", "Ll/th0;", "exitAlerts", "R", "callonClick", p7f.LATITUDE_SOUTH, "Landroid/view/View;", "W", "P0", "(Landroid/view/View;)V", "contentViewAct", p7f.GPS_DIRECTION_TRUE, "scrollAnim", "", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "from", "getActive", "setActive", Active.TYPE, "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getCancelSceneAnim", "()Ljava/lang/Runnable;", "cancelSceneAnim", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kfe extends mj2 {

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
    public pee presenter;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator loadingAnim;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public th0 exitAlerts;

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

    /* JADX INFO: renamed from: l.kfe$a */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"l/kfe$a", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout$b;", "", "a", "()V", "Landroid/view/MotionEvent;", "e1", "e2", "", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V", "e", "b", "(Landroid/view/MotionEvent;)V", "height", Constants.INAPP_DATA_TAG, "(F)F", "", "Z", "isFling", "()Z", "setFling", "(Z)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18148a implements TouchPullViewLayout.InterfaceC8982b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isFling;

        public C18148a() {
        }

        /* JADX INFO: renamed from: e */
        public static final void m149505e(kfe kfeVar, ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            int iIntValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = kfeVar.m149480h0().getLayoutParams();
            layoutParams.height = iIntValue;
            kfeVar.m149480h0().setLayoutParams(layoutParams);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.quickaudio.view.TouchPullViewLayout.InterfaceC8982b
        /* JADX INFO: renamed from: a */
        public void mo55799a() {
            this.isFling = true;
            kfe.this.getAct().lambda$debugItems$19();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.quickaudio.view.TouchPullViewLayout.InterfaceC8982b
        /* JADX INFO: renamed from: b */
        public void mo55800b(MotionEvent e) {
            ValueAnimator valueAnimator;
            if (this.isFling) {
                return;
            }
            ValueAnimator valueAnimator2 = kfe.this.scrollAnim;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = kfe.this.scrollAnim) != null) {
                valueAnimator.end();
            }
            kfe kfeVar = kfe.this;
            kfeVar.scrollAnim = ValueAnimator.ofInt(kfeVar.m149480h0().getLayoutParams().height, kfe.this.TARGET_NORMAL_PULL_UP_DISTANCE);
            ValueAnimator valueAnimator3 = kfe.this.scrollAnim;
            if (valueAnimator3 != null) {
                final kfe kfeVar2 = kfe.this;
                valueAnimator3.setDuration(300L);
                valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jfe
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        kfe.C18148a.m149505e(kfeVar2, valueAnimator4);
                    }
                });
                valueAnimator3.start();
            }
        }

        /* JADX INFO: renamed from: d */
        public final float m149506d(float height) {
            return ((((kfe.this.NORMAL_PULL_UP_DISTANCE + height) - kfe.this.NORMAL_PULL_UP_DISTANCE) - (kfe.this.MAX_ALPHA_HEIGHT * kfe.this.NORMAL_ALPHA)) / kfe.this.MAX_ALPHA_HEIGHT) + kfe.this.NORMAL_ALPHA;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.quickaudio.view.TouchPullViewLayout.InterfaceC8982b
        public void onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            if (distanceY >= 0.0f || kfe.this.m149480h0().getLayoutParams().height + distanceY >= kfe.this.TARGET_NORMAL_PULL_UP_DISTANCE) {
                float f = kfe.this.m149480h0().getLayoutParams().height + (distanceY * (1.0f - (kfe.this.m149480h0().getLayoutParams().height / kfe.this.TARGET_MAX_PULL_UP_DISTANCE)));
                if (f > kfe.this.TARGET_MAX_PULL_UP_DISTANCE) {
                    f = kfe.this.TARGET_MAX_PULL_UP_DISTANCE;
                }
                ViewGroup.LayoutParams layoutParams = kfe.this.m149480h0().getLayoutParams();
                layoutParams.height = (int) f;
                kfe.this.m149480h0().setLayoutParams(layoutParams);
                kfe.this.m149480h0().setAlpha(m149506d(f));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfe(@NotNull DropDownAct dropDownAct) {
        super(dropDownAct);
        dropDownAct.getClass();
        this.act = dropDownAct;
        this.NORMAL_ALPHA = 0.7f;
        this.MAX_ALPHA_HEIGHT = txq.m193530c(120);
        int iM193530c = txq.m193530c(84);
        this.NORMAL_PULL_UP_DISTANCE = iM193530c;
        int iM193530c2 = txq.m193530c(240);
        this.MAX_PULL_UP_DISTANCE = iM193530c2;
        this.MEDIUM_SCREEN_DEL = txq.m193530c(24);
        this.TARGET_NORMAL_PULL_UP_DISTANCE = iM193530c;
        this.TARGET_MAX_PULL_UP_DISTANCE = iM193530c2;
        this.active = "";
        this.cancelSceneAnim = new Runnable() { // from class: l.ree
            @Override // java.lang.Runnable
            public final void run() {
                kfe.m149420B(this.f162634a);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m149418A(final kfe kfeVar, View view) {
        wyb0.Companion companion = wyb0.INSTANCE;
        if (companion.m208572f().getClickLock()) {
            return;
        }
        companion.m208572f().m208551a0();
        kfeVar.m158564l();
        if (!kfeVar.callonClick) {
            HashMap map = new HashMap();
            map.put("remainingtimes", Integer.valueOf(C8772a.m51429b0()));
            i4g0.m138521s("e_quickchat_button", "p_quickchat", map);
        }
        OnlineMatchManager.m51326z().m51373u0(kfeVar.getAct(), new y20() { // from class: l.zee
            @Override // p153l.y20
            public final void call(Object obj) {
                kfe.m149448z0(this.f203995a, (Boolean) obj);
            }
        });
        kfeVar.callonClick = false;
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m149419A0(kfe kfeVar, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (z) {
            kfeVar.mo149477f();
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m149420B(kfe kfeVar) {
        gt0.m132166l(kfeVar.m149478f0(), View.TRANSLATION_Y, 0L, 400L, null, 0.0f, kfeVar.m149478f0().getHeight()).start();
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m149421B0(kfe kfeVar, boolean z) {
        if (z) {
            wyb0.INSTANCE.m208572f().m208538I();
        }
        if (!z) {
            kfeVar.m149460R0();
        }
        if (!kfeVar.callonClick) {
            HashMap map = new HashMap();
            wyb0.Companion companion = wyb0.INSTANCE;
            map.put("remainingtimes", Integer.valueOf(companion.m208578l()));
            map.put("voicechat_results", companion.m208572f().getVoicechat_results());
            i4g0.m138521s("e_voicechat_button", "p_quickchat", map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static void m149422C(kfe kfeVar) {
        ValueAnimator valueAnimator = kfeVar.loadingAnim;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = kfeVar.loadingAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            kfeVar.loadingAnim = null;
        }
        bnl0.m105524M(kfeVar.m149485l0(), true);
        bnl0.m105524M(kfeVar.m149483j0(), false);
        kfeVar.m149485l0().setAlpha(1.0f);
        kfeVar.m149461S0();
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m149423D0(kfe kfeVar, uxj0 uxj0Var) {
        kfeVar.act.progressDismiss();
        l51.m152890J(kfeVar.cancelSceneAnim);
        kfeVar.cancelSceneAnim.run();
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m149425E0(kfe kfeVar, Throwable th) {
        kfeVar.act.progressDismiss();
    }

    /* JADX INFO: renamed from: G */
    public static void m149427G(final kfe kfeVar, View view) {
        pee peeVar = kfeVar.presenter;
        pee peeVar2 = null;
        if (peeVar == null) {
            Intrinsics.m88391r("presenter");
            peeVar = null;
        }
        if (peeVar.m171959F0()) {
            return;
        }
        i4g0.m138520r("e_quickchat_matching_propscard_confirm", "p_quickchat");
        kfeVar.act.progress(R$string.f18632L5, true);
        pee peeVar3 = kfeVar.presenter;
        if (peeVar3 == null) {
            Intrinsics.m88391r("presenter");
        } else {
            peeVar2 = peeVar3;
        }
        peeVar2.m171960s0().subscribe(psd0.m173597H(new y20() { // from class: l.uee
            @Override // p153l.y20
            public final void call(Object obj) {
                kfe.m149423D0(this.f178647a, (uxj0) obj);
            }
        }, new y20() { // from class: l.vee
            @Override // p153l.y20
            public final void call(Object obj) {
                kfe.m149425E0(this.f183760a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static void m149428H(kfe kfeVar, View view) {
        if (kfeVar.f137051b.booleanValue()) {
            return;
        }
        wyb0.INSTANCE.m208572f().m208551a0();
        i4g0.m138523u("e_quickchat_return", "p_quickchat", pf60.m172085a("chat_type", OnlineMatchManager.m51326z().m51336J() ? "funchat" : "quickchat"));
        kfeVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: I */
    public static void m149429I(kfe kfeVar, View view) {
        pee peeVar = kfeVar.presenter;
        if (peeVar == null) {
            Intrinsics.m88391r("presenter");
            peeVar = null;
        }
        if (peeVar.m171958E0()) {
            return;
        }
        kfeVar.act.startActivity(SpeedUpCardAct.m55676a2(kfeVar.getAct()));
    }

    /* JADX INFO: renamed from: K */
    public static void m149431K(final kfe kfeVar, View view) {
        if (!PermissionHelper.m81064b("android.permission.RECORD_AUDIO")) {
            PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81077l(new PermissionHelper.InterfaceC13292b() { // from class: l.xee
                @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
                /* JADX INFO: renamed from: a */
                public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                    kfe.m149419A0(this.f193930a, z, permissionDeniedReason);
                }
            }).m81074i(kfeVar.act);
            return;
        }
        wyb0.Companion companion = wyb0.INSTANCE;
        if (companion.m208572f().getClickLock()) {
            return;
        }
        companion.m208572f().m208551a0();
        kfeVar.m158564l();
        if (!TextUtils.equals(CoreModule.m30934Q().mo68412M6().mo127341l(100003), MomentAllowForwardState.allow)) {
            companion.m208572f().m208538I();
        } else {
            wyb0.m208486B0(companion.m208572f(), kfeVar.act, false, false, new Function1() { // from class: l.yee
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return kfe.m149421B0(this.f199341a, ((Boolean) obj).booleanValue());
                }
            }, 6, null);
            kfeVar.callonClick = false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m149432L(String str, kfe kfeVar, View view) {
        i4g0.m138523u("e_quickchat_matching_cancel_popup_exit", str, pf60.m172085a("chat_type", OnlineMatchManager.m51326z().m51336J() ? "funchat" : "quickchat"));
        if (OnlineMatchManager.m51326z().m51338L()) {
            OnlineMatchManager.m51326z().f33442I.onNext(jyb.m147494Y("notify_normal_state", null));
            OnlineMatchManager.m51326z().m51374v();
        } else {
            wyb0.Companion companion = wyb0.INSTANCE;
            if (companion.m208572f().m208549Y()) {
                companion.m208572f().m208535D0();
            }
        }
        if (kfeVar.m149453K0()) {
            kfeVar.act.lambda$debugItems$19();
        } else if (kfeVar.m149454L0()) {
            kfeVar.act.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m149437Q0() {
        final String str = "p_quickchat_matching_cancel_popup";
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_quickchat_matching_cancel_popup", "dlg");
        l4g0VarM204399c.m152781p(pf60.m172085a("tooltips_trigger_mode", "passive"), pf60.m172085a("chat_type", OnlineMatchManager.m51326z().m51336J() ? "funchat" : "quickchat"));
        th0 th0VarM191142a = new th0.C20312a(this.act).m191151j(OnlineMatchManager.m51326z().m51336J() ? "是否停止寻找心动信号" : "是否要停止寻找，退出页面将停止匹配").m191147f("退出").m191159r("继续寻找").m191144c(new View.OnClickListener() { // from class: l.afe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kfe.m149432L(str, this, view);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.bfe
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kfe.m149441s(l4g0VarM204399c, dialogInterface);
            }
        }).m191142a();
        this.exitAlerts = th0VarM191142a;
        if (th0VarM191142a != null) {
            th0VarM191142a.m191141g();
        }
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: s */
    public static void m149441s(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m149442u(kfe kfeVar, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        kfeVar.m149502x0(quickChatProduce);
    }

    /* JADX INFO: renamed from: v */
    public static void m149443v(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static void m149444w(kfe kfeVar, User user) {
        uqb0.f180374G.m127109I0(kfeVar.m149468a0(), user.m61308fp().profileMiddle().formatted(), txq.m193530c(100), txq.m193530c(100));
    }

    /* JADX INFO: renamed from: y */
    public static void m149446y(kfe kfeVar, View view) {
        i4g0.m138520r("e_quickchat_matching_cancel", "p_quickchat");
        kfeVar.m149437Q0();
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m149448z0(kfe kfeVar, Boolean bool) {
        if (!bool.booleanValue()) {
            wyb0.INSTANCE.m208572f().m208538I();
        }
        if (bool.booleanValue()) {
            kfeVar.m149460R0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m149449G0() {
        return !this.callonClick;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m149450H0() {
        return "audio_quick_chat_guide".equals(this.from);
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m149451I0() {
        if ("p_fake_playground".equals(this.from)) {
            return TextUtils.equals(this.active, UnlockConversationType.quick_chat) || TextUtils.equals(this.active, "voice_quick_chat");
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m149452J0() {
        return "messages_view_quickchat_entry".equals(this.from);
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m149453K0() {
        return m149458O0() || m149457N0();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m149454L0() {
        return "p_state_explore".equals(this.from);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final View m149455M(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM153998b = lfe.m153998b(this, inflater, parent);
        viewM153998b.getClass();
        return viewM153998b;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m149456M0() {
        return "svip_pay_success".equals(this.from) || "p_pay_result,e_quickchat_button,click".equals(this.from);
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m149457N0() {
        return "text_quickchat_party".equals(this.from);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m149458O0() {
        return "voice_quickchat_party".equals(this.from);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m149459P0(@NotNull View view) {
        view.getClass();
        this.contentViewAct = view;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull pee presenter) {
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
    public final View m149464W() {
        View view = this.contentViewAct;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("contentViewAct");
        return null;
    }

    @Override // p153l.mj2
    @NotNull
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public TouchPullViewLayout mo149482j() {
        return m149467Z();
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VImage m149466Y() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TouchPullViewLayout m149467Z() {
        TouchPullViewLayout touchPullViewLayout = this._content_layout;
        if (touchPullViewLayout != null) {
            return touchPullViewLayout;
        }
        Intrinsics.m88391r("_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VDraweeView m149468a0() {
        VDraweeView vDraweeView = this._header_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_header_img");
        return null;
    }

    @Override // p153l.mj2
    @NotNull
    /* JADX INFO: renamed from: b */
    public Boolean mo149469b() {
        pee peeVar = this.presenter;
        if (peeVar == null) {
            Intrinsics.m88391r("presenter");
            peeVar = null;
        }
        if (!peeVar.m171958E0()) {
            return Boolean.TRUE;
        }
        m149437Q0();
        return Boolean.FALSE;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final ConstraintLayout m149470b0() {
        ConstraintLayout constraintLayout = this._ll_btns;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_ll_btns");
        return null;
    }

    @Override // p153l.mj2
    /* JADX INFO: renamed from: c */
    public void mo149471c() {
        wyb0.INSTANCE.m208572f().m208538I();
        pee peeVar = this.presenter;
        if (peeVar == null) {
            Intrinsics.m88391r("presenter");
            peeVar = null;
        }
        if (!peeVar.getIsHideBotBtn()) {
            bnl0.m105524M(m149470b0(), true);
        }
        bnl0.m105524M(m149480h0(), true);
        m149467Z().setEnable(true);
        bnl0.m105524M(m149481i0(), true);
        bnl0.m105524M(m149466Y(), false);
        bnl0.m105524M(m149484k0(), false);
        m149500v0();
        DropDownRadarView dropDownRadarViewM149483j0 = m149483j0();
        Property property = View.ALPHA;
        Animator animatorM132166l = gt0.m132166l(dropDownRadarViewM149483j0, property, 0L, 300L, null, 1.0f, 0.0f);
        Animator animatorM132166l2 = gt0.m132166l(m149470b0(), property, 0L, 500L, null, 0.0f, 1.0f);
        VDraweeView vDraweeViewM149468a0 = m149468a0();
        Property property2 = View.TRANSLATION_Y;
        int i = qa00.f156294G;
        Animator animatorM132180z = gt0.m132180z(animatorM132166l, animatorM132166l2, gt0.m132166l(vDraweeViewM149468a0, property2, 0L, 500L, null, i, 0.0f), gt0.m132166l(m149479g0(), property2, 0L, 500L, null, i, 0.0f), gt0.m132166l(m149480h0(), property2, 0L, 500L, null, m149480h0().getHeight(), 0.0f));
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.tee
            @Override // java.lang.Runnable
            public final void run() {
                kfe.m149422C(this.f173804a);
            }
        });
        animatorM132180z.start();
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VLinear m149472c0() {
        VLinear vLinear = this._ll_btns_audio;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_ll_btns_audio");
        return null;
    }

    @Override // p153l.mj2
    /* JADX INFO: renamed from: d */
    public void mo149473d() {
        m149474d0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VLinear m149474d0() {
        VLinear vLinear = this._ll_btns_heartbeat;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_ll_btns_heartbeat");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        ValueAnimator valueAnimator = this.loadingAnim;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.loadingAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.loadingAnim = null;
        }
        m149500v0();
    }

    @Override // p153l.mj2
    /* JADX INFO: renamed from: e */
    public void mo149475e() {
        this.callonClick = true;
        m149476e0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VLinear m149476e0() {
        VLinear vLinear = this._ll_btns_online;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_ll_btns_online");
        return null;
    }

    @Override // p153l.mj2
    /* JADX INFO: renamed from: f */
    public void mo149477f() {
        this.callonClick = true;
        m149472c0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VLinear m149478f0() {
        VLinear vLinear = this._ll_scene;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_ll_scene");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VLinear m149479g0() {
        VLinear vLinear = this._ll_scene_entry;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_ll_scene_entry");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VLinear m149480h0() {
        VLinear vLinear = this._ll_to_top;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_ll_to_top");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VLinear m149481i0() {
        VLinear vLinear = this._ll_top_hey;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_ll_top_hey");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m149459P0(m149455M(inflater, parent));
        m149495r();
        return m149464W();
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final DropDownRadarView m149483j0() {
        DropDownRadarView dropDownRadarView = this._loading_img;
        if (dropDownRadarView != null) {
            return dropDownRadarView;
        }
        Intrinsics.m88391r("_loading_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VText m149484k0() {
        VText vText = this._loading_tips;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_loading_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final DropDownRadarView m149485l0() {
        DropDownRadarView dropDownRadarView = this._loading_view;
        if (dropDownRadarView != null) {
            return dropDownRadarView;
        }
        Intrinsics.m88391r("_loading_view");
        return null;
    }

    @Override // p153l.mj2
    @NotNull
    /* JADX INFO: renamed from: m */
    public View mo149486m() {
        return m149464W();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m149487m0() {
        VText vText = this._scene_go;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_scene_go");
        return null;
    }

    @Override // p153l.mj2
    /* JADX INFO: renamed from: n */
    public void mo149488n(boolean isHide) {
        bnl0.m105524M(m149470b0(), isHide);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VText m149489n0() {
        VText vText = this._scene_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_scene_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VText m149490o0() {
        VText vText = this._tv_hey_loading;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_hey_loading");
        return null;
    }

    @Override // p153l.mj2
    /* JADX INFO: renamed from: p */
    public void mo149491p() {
        if (bnl0.m105529O0(m149481i0())) {
            gt0.m132180z(gt0.m132166l(m149481i0(), View.TRANSLATION_Y, 0L, 1000L, null, 0.0f, txq.m193530c(70)), gt0.m132166l(m149481i0(), View.ALPHA, 0L, 1000L, null, 1.0f, 0.0f)).start();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final VText m149492p0() {
        VText vText = this._tv_online;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_online");
        return null;
    }

    @Override // p153l.mj2
    /* JADX INFO: renamed from: q */
    public void mo149493q(@NotNull final OnlineMatchManager.QuickChatProduce produceType) {
        produceType.getClass();
        bnl0.m105524M(m149481i0(), false);
        boolean z = produceType == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
        if (z) {
            m149467Z().setEnable(false);
        }
        m149461S0();
        DropDownRadarView dropDownRadarViewM149485l0 = m149485l0();
        Property property = View.ALPHA;
        Animator animatorM132166l = gt0.m132166l(dropDownRadarViewM149485l0, property, 0L, 300L, null, 1.0f, 0.0f);
        Animator animatorM132166l2 = gt0.m132166l(m149470b0(), property, 0L, 500L, null, 1.0f, 0.0f);
        VDraweeView vDraweeViewM149468a0 = m149468a0();
        Property property2 = View.TRANSLATION_Y;
        int i = qa00.f156294G;
        Animator animatorM132180z = gt0.m132180z(animatorM132166l, animatorM132166l2, gt0.m132166l(vDraweeViewM149468a0, property2, 0L, 500L, null, 0.0f, i), gt0.m132166l(m149479g0(), property2, 0L, 500L, null, 0.0f, i), gt0.m132166l(m149480h0(), property2, 0L, 500L, null, 0.0f, z ? m149480h0().getHeight() : 0.0f));
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.wee
            @Override // java.lang.Runnable
            public final void run() {
                kfe.m149442u(this.f188689a, produceType);
            }
        });
        animatorM132180z.start();
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final TextView m149494q0() {
        TextView textView = this._tv_online_tips;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tv_online_tips");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m149495r() {
        this.from = this.act.getIntent().getStringExtra("from");
        this.active = this.act.getIntent().getStringExtra(Active.TYPE);
        m149499u0().setText(m149454L0() ? "回到广场" : "回到消息");
        if (spl0.m187365Q() && m149453K0()) {
            m149499u0().setText("回到首页");
        }
        if (m149451I0() || m149456M0()) {
            m149499u0().setText("返回");
        }
        m149480h0().setAlpha(this.NORMAL_ALPHA);
        if (vnb.m201956p1()) {
            int i = this.NORMAL_PULL_UP_DISTANCE;
            int i2 = this.MEDIUM_SCREEN_DEL;
            this.TARGET_NORMAL_PULL_UP_DISTANCE = i - i2;
            this.TARGET_MAX_PULL_UP_DISTANCE = this.MAX_PULL_UP_DISTANCE - i2;
        }
        C22421c c22421cDuringCreated = this.act.duringCreated(CoreModule.f18264c.f20381e0.m116596o9());
        if (c22421cDuringCreated != null) {
            c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.cfe
                @Override // p153l.y20
                public final void call(Object obj) {
                    kfe.m149444w(this.f81507a, (User) obj);
                }
            }, new y20() { // from class: l.dfe
                @Override // p153l.y20
                public final void call(Object obj) {
                    kfe.m149443v((Throwable) obj);
                }
            }));
        }
        m149492p0().setTypeface(lyh0.m156283c(3));
        m149496r0().setTypeface(lyh0.m156283c(3));
        m149489n0().setTypeface(lyh0.m156283c(3));
        m149498t0().setTypeface(lyh0.m156283c(3));
        m149490o0().setTypeface(lyh0.m156283c(3));
        m149494q0().setText(C8772a.m51462u() + "人在线");
        m149497s0().setText(rm50.m182045f());
        if (gra.m131594L1()) {
            m149494q0().setText("蒙面文字匹配");
            m149497s0().setText("对方递来耳机");
        }
        wyb0.INSTANCE.m208572f().m208538I();
        m149501w0();
        if (vnb.m201956p1()) {
            m149485l0().setScaleX(0.8f);
            m149485l0().setScaleY(0.8f);
            bnl0.m105505C0(m149480h0(), this.TARGET_NORMAL_PULL_UP_DISTANCE);
            bnl0.m105540X(m149499u0(), txq.m193530c(10));
        }
        bnl0.m105509E0(m149476e0(), new View.OnClickListener() { // from class: l.efe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kfe.m149418A(this.f93769a, view);
            }
        });
        bnl0.m105509E0(m149472c0(), new View.OnClickListener() { // from class: l.ffe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kfe.m149431K(this.f98762a, view);
            }
        });
        bnl0.m105509E0(m149466Y(), new View.OnClickListener() { // from class: l.gfe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kfe.m149446y(this.f103896a, view);
            }
        });
        bnl0.m105509E0(m149480h0(), new View.OnClickListener() { // from class: l.hfe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kfe.m149428H(this.f109282a, view);
            }
        });
        bnl0.m105509E0(m149479g0(), new View.OnClickListener() { // from class: l.ife
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kfe.m149429I(this.f114657a, view);
            }
        });
        bnl0.m105509E0(m149487m0(), new View.OnClickListener() { // from class: l.see
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kfe.m149427G(this.f167607a, view);
            }
        });
        m149467Z().setOnFlingListener(new C18148a());
        m149503y0();
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VText m149496r0() {
        VText vText = this._tv_quick;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_quick");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final TextView m149497s0() {
        TextView textView = this._tv_quick_tips;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tv_quick_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final VText m149498t0() {
        VText vText = this._tv_scene_con;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_scene_con");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public final VText m149499u0() {
        VText vText = this._tv_to_top;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_to_top");
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m149501w0() {
        Animator animatorM132166l = gt0.m132166l(m149481i0(), View.TRANSLATION_Y, 0L, 1000L, null, txq.m193530c(70), 0.0f);
        VLinear vLinearM149481i0 = m149481i0();
        Property property = View.ALPHA;
        gt0.m132180z(animatorM132166l, gt0.m132166l(vLinearM149481i0, property, 0L, 1000L, null, 0.0f, 1.0f), gt0.m132166l(m149485l0(), property, 0L, 1000L, null, 0.0f, 1.0f)).start();
        bnl0.m105524M(m149485l0(), false);
        bnl0.m105524M(m149483j0(), false);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m149502x0(@NotNull OnlineMatchManager.QuickChatProduce produceType) {
        produceType.getClass();
        if (OnlineMatchManager.m51326z().m51338L() || wyb0.INSTANCE.m208572f().m208549Y()) {
            boolean z = produceType == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
            bnl0.m105524M(m149481i0(), false);
            bnl0.m105524M(m149485l0(), false);
            bnl0.m105524M(m149470b0(), false);
            if (z) {
                bnl0.m105524M(m149480h0(), false);
            }
            bnl0.m105524M(m149483j0(), true);
            m149483j0().setAlpha(1.0f);
            bnl0.m105524M(m149484k0(), true);
            bnl0.m105524M(m149466Y(), true);
            OnlineMatchManager.QuickChatProduce quickChatProduce = OnlineMatchManager.QuickChatProduce.Heartbeat;
            if (produceType == quickChatProduce) {
                m149484k0().setText("正在帮你寻找附近的小姐姐");
            } else if (z) {
                m149484k0().setText("正在搜索语音闪聊…");
            } else {
                m149484k0().setText("正在搜索在线闪聊…");
            }
            if (produceType == quickChatProduce) {
                i4g0.m138526x("e_funchat_loading", "p_quickchat");
            } else {
                HashMap map = new HashMap();
                map.put("is_voicechat", Boolean.valueOf(z));
                i4g0.m138527y("e_quickchat_matching", "p_quickchat", map);
            }
            m149461S0();
            VDraweeView vDraweeViewM149468a0 = m149468a0();
            int i = qa00.f156294G;
            vDraweeViewM149468a0.setTranslationY(i);
            m149479g0().setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m149460R0() {
    }

    /* JADX INFO: renamed from: S0 */
    public void m149461S0() {
    }

    /* JADX INFO: renamed from: v0 */
    public void m149500v0() {
    }

    /* JADX INFO: renamed from: y0 */
    public final void m149503y0() {
    }
}
