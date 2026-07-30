package p006l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.DropDownAct;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.card.SpeedUpCardAct;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.view.DropDownBgView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.view.DropDownRadarView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.view.TouchPullViewLayout;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.bt0;
import l.cwf0;
import l.e30;
import l.e51;
import l.eqh0;
import l.hee;
import l.hmb;
import l.i0e;
import l.j760;
import l.mkd0;
import l.roj0;
import l.svq;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\bJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020'¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020'¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020'¢\u0006\u0004\b4\u00102J\r\u00105\u001a\u00020'¢\u0006\u0004\b5\u00102J\r\u00106\u001a\u00020'¢\u0006\u0004\b6\u00102J\r\u00107\u001a\u00020'¢\u0006\u0004\b7\u00102J\r\u00108\u001a\u00020'¢\u0006\u0004\b8\u00102J\r\u00109\u001a\u00020'¢\u0006\u0004\b9\u00102J\r\u0010:\u001a\u00020'¢\u0006\u0004\b:\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010=R\"\u0010B\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010>\u001a\u0004\b?\u0010$\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010k\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\"\u0010x\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010[\u001a\u0004\bv\u0010]\"\u0004\bw\u0010_R\"\u0010{\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010S\u001a\u0004\by\u0010U\"\u0004\bz\u0010WR\"\u0010~\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010[\u001a\u0004\b|\u0010]\"\u0004\b}\u0010_R%\u0010\u0082\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010[\u001a\u0005\b\u0080\u0001\u0010]\"\u0005\b\u0081\u0001\u0010_R%\u0010\u0085\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b!\u0010c\u001a\u0005\b\u0083\u0001\u0010e\"\u0005\b\u0084\u0001\u0010gR)\u0010\u008c\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001a\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R%\u0010\u008f\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0015\u0010S\u001a\u0005\b\u008d\u0001\u0010U\"\u0005\b\u008e\u0001\u0010WR&\u0010\u0093\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010[\u001a\u0005\b\u0091\u0001\u0010]\"\u0005\b\u0092\u0001\u0010_R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009f\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010S\u001a\u0005\b\u009d\u0001\u0010U\"\u0005\b\u009e\u0001\u0010WR&\u0010£\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b \u0001\u0010[\u001a\u0005\b¡\u0001\u0010]\"\u0005\b¢\u0001\u0010_R*\u0010§\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u0096\u0001\u001a\u0006\b¥\u0001\u0010\u0098\u0001\"\u0006\b¦\u0001\u0010\u009a\u0001R&\u0010«\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¨\u0001\u0010S\u001a\u0005\b©\u0001\u0010U\"\u0005\bª\u0001\u0010WR&\u0010¯\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¬\u0001\u0010[\u001a\u0005\b\u00ad\u0001\u0010]\"\u0005\b®\u0001\u0010_R*\u0010³\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0096\u0001\u001a\u0006\b±\u0001\u0010\u0098\u0001\"\u0006\b²\u0001\u0010\u009a\u0001R&\u0010·\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010S\u001a\u0005\bµ\u0001\u0010U\"\u0005\b¶\u0001\u0010WR&\u0010»\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0001\u0010[\u001a\u0005\b¹\u0001\u0010]\"\u0005\bº\u0001\u0010_R&\u0010¿\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¼\u0001\u0010S\u001a\u0005\b½\u0001\u0010U\"\u0005\b¾\u0001\u0010WR&\u0010Ã\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÀ\u0001\u0010c\u001a\u0005\bÁ\u0001\u0010e\"\u0005\bÂ\u0001\u0010gR&\u0010Ç\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÄ\u0001\u0010[\u001a\u0005\bÅ\u0001\u0010]\"\u0005\bÆ\u0001\u0010_R&\u0010Ë\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÈ\u0001\u0010[\u001a\u0005\bÉ\u0001\u0010]\"\u0005\bÊ\u0001\u0010_R&\u0010Ï\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÌ\u0001\u0010[\u001a\u0005\bÍ\u0001\u0010]\"\u0005\bÎ\u0001\u0010_R\u0018\u0010Ò\u0001\u001a\u00030Ð\u00018\u0002X\u0082D¢\u0006\b\n\u0006\bÑ\u0001\u0010È\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Ô\u0001R\u0018\u0010×\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010Ô\u0001R\u0018\u0010Ù\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ô\u0001R\u0018\u0010Û\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Ô\u0001R\u0019\u0010Ü\u0001\u001a\u00030Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010Ô\u0001R\u001a\u0010Þ\u0001\u001a\u00030Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Ô\u0001R\u0018\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001c\u0010ä\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001c\u0010è\u0001\u001a\u0005\u0018\u00010å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010ê\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bé\u0001\u0010?R(\u0010ð\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0005\bí\u0001\u0010&\"\u0006\bî\u0001\u0010ï\u0001R\u001c\u0010ò\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ã\u0001R+\u0010ù\u0001\u001a\u0005\u0018\u00010ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R+\u0010ü\u0001\u001a\u0005\u0018\u00010ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b<\u0010ô\u0001\u001a\u0006\bú\u0001\u0010ö\u0001\"\u0006\bû\u0001\u0010ø\u0001R\u001d\u0010\u0081\u0002\u001a\u00030ý\u00018\u0006¢\u0006\u0010\n\u0006\bí\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002¨\u0006\u0082\u0002"}, d2 = {"Ll/gee;", "Ll/ej2;", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;)V", "", "Q0", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "M", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/lde;", "presenter", "U", "(Ll/lde;)V", "inflateView", "r", "y0", "w0", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;", "produceType", "q", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "x0", "c", "S0", "R0", "v0", "p", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "X", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "m", "()Landroid/view/View;", "", "b", "()Ljava/lang/Boolean;", "destroy", "e", "f", "d", "isHide", "n", "(Z)V", "L0", "()Z", "J0", "K0", "O0", "N0", "I0", "M0", "G0", "H0", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "V", "()Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;", "Z", "set_content_layout", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout;)V", "_content_layout", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "get_dropdown_bg", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "set_dropdown_bg", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;)V", "_dropdown_bg", "Lv/VDraweeView;", "Lv/VDraweeView;", "a0", "()Lv/VDraweeView;", "set_header_img", "(Lv/VDraweeView;)V", "_header_img", "Lv/VLinear;", "g", "Lv/VLinear;", "g0", "()Lv/VLinear;", "set_ll_scene_entry", "(Lv/VLinear;)V", "_ll_scene_entry", "Lv/VText;", "h", "Lv/VText;", "t0", "()Lv/VText;", "set_tv_scene_con", "(Lv/VText;)V", "_tv_scene_con", "Lv/VImage;", "i", "Lv/VImage;", "get_img_scene_con", "()Lv/VImage;", "set_img_scene_con", "(Lv/VImage;)V", "_img_scene_con", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "j", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "l0", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "set_loading_view", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;)V", "_loading_view", "k", "j0", "set_loading_img", "_loading_img", "l", "k0", "set_loading_tips", "_loading_tips", "i0", "set_ll_top_hey", "_ll_top_hey", "get_ll_top_hey_tv", "set_ll_top_hey_tv", "_ll_top_hey_tv", "o", "o0", "set_tv_hey_loading", "_tv_hey_loading", "Y", "set_close", "_close", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_ll_btns", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_ll_btns", "e0", "set_ll_btns_online", "_ll_btns_online", "s", "p0", "set_tv_online", "_tv_online", "Landroid/widget/TextView;", "t", "Landroid/widget/TextView;", "q0", "()Landroid/widget/TextView;", "set_tv_online_tips", "(Landroid/widget/TextView;)V", "_tv_online_tips", "u", "c0", "set_ll_btns_audio", "_ll_btns_audio", "v", "r0", "set_tv_quick", "_tv_quick", "w", "s0", "set_tv_quick_tips", "_tv_quick_tips", "x", "d0", "set_ll_btns_heartbeat", "_ll_btns_heartbeat", "y", "get_tv_heartbeat", "set_tv_heartbeat", "_tv_heartbeat", "z", "get_tv_heartbeat_tips", "set_tv_heartbeat_tips", "_tv_heartbeat_tips", "A", "h0", "set_ll_to_top", "_ll_to_top", "B", "u0", "set_tv_to_top", "_tv_to_top", "C", "f0", "set_ll_scene", "_ll_scene", "D", "get_scene_ic", "set_scene_ic", "_scene_ic", "E", "n0", "set_scene_title", "_scene_title", "F", "get_scene_content", "set_scene_content", "_scene_content", "G", "m0", "set_scene_go", "_scene_go", "", "H", "NORMAL_ALPHA", "", "I", "MAX_ALPHA_HEIGHT", "J", "NORMAL_PULL_UP_DISTANCE", "K", "MAX_PULL_UP_DISTANCE", "L", "MEDIUM_SCREEN_DEL", "TARGET_NORMAL_PULL_UP_DISTANCE", "N", "TARGET_MAX_PULL_UP_DISTANCE", "O", "Ll/lde;", "Landroid/animation/ValueAnimator;", "P", "Landroid/animation/ValueAnimator;", "loadingAnim", "Ll/xh0;", "Q", "Ll/xh0;", "exitAlerts", "R", "callonClick", "S", "Landroid/view/View;", "W", "P0", "(Landroid/view/View;)V", "contentViewAct", "T", "scrollAnim", "", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "from", "getActive", "setActive", "active", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getCancelSceneAnim", "()Ljava/lang/Runnable;", "cancelSceneAnim", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"l/gee$a", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/TouchPullViewLayout$b;", "", "a", "()V", "Landroid/view/MotionEvent;", "e1", "e2", "", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V", "e", "b", "(Landroid/view/MotionEvent;)V", "height", "d", "(F)F", "", "Z", "isFling", "()Z", "setFling", "(Z)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0759a implements TouchPullViewLayout.InterfaceC0255b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isFling;

        public C0759a() {
        }

        /* JADX INFO: renamed from: e */
        public static final void m15792e(gee geeVar, ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            int iIntValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = geeVar.m15771h0().getLayoutParams();
            layoutParams.height = iIntValue;
            geeVar.m15771h0().setLayoutParams(layoutParams);
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.quickaudio.view.TouchPullViewLayout.InterfaceC0255b
        /* JADX INFO: renamed from: a */
        public void mo7966a() {
            this.isFling = true;
            gee.this.getAct().finish();
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.quickaudio.view.TouchPullViewLayout.InterfaceC0255b
        /* JADX INFO: renamed from: b */
        public void mo7967b(MotionEvent e) {
            ValueAnimator valueAnimator;
            if (this.isFling) {
                return;
            }
            ValueAnimator valueAnimator2 = gee.this.scrollAnim;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = gee.this.scrollAnim) != null) {
                valueAnimator.end();
            }
            gee geeVar = gee.this;
            geeVar.scrollAnim = ValueAnimator.ofInt(geeVar.m15771h0().getLayoutParams().height, gee.this.TARGET_NORMAL_PULL_UP_DISTANCE);
            ValueAnimator valueAnimator3 = gee.this.scrollAnim;
            if (valueAnimator3 != null) {
                final gee geeVar2 = gee.this;
                valueAnimator3.setDuration(300L);
                valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fee
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        gee.C0759a.m15792e(geeVar2, valueAnimator4);
                    }
                });
                valueAnimator3.start();
            }
        }

        /* JADX INFO: renamed from: d */
        public final float m15793d(float height) {
            return ((((gee.this.NORMAL_PULL_UP_DISTANCE + height) - gee.this.NORMAL_PULL_UP_DISTANCE) - (gee.this.MAX_ALPHA_HEIGHT * gee.this.NORMAL_ALPHA)) / gee.this.MAX_ALPHA_HEIGHT) + gee.this.NORMAL_ALPHA;
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.quickaudio.view.TouchPullViewLayout.InterfaceC0255b
        public void onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            if (distanceY >= 0.0f || gee.this.m15771h0().getLayoutParams().height + distanceY >= gee.this.TARGET_NORMAL_PULL_UP_DISTANCE) {
                float f = gee.this.m15771h0().getLayoutParams().height + (distanceY * (1.0f - (gee.this.m15771h0().getLayoutParams().height / gee.this.TARGET_MAX_PULL_UP_DISTANCE)));
                if (f > gee.this.TARGET_MAX_PULL_UP_DISTANCE) {
                    f = gee.this.TARGET_MAX_PULL_UP_DISTANCE;
                }
                ViewGroup.LayoutParams layoutParams = gee.this.m15771h0().getLayoutParams();
                layoutParams.height = (int) f;
                gee.this.m15771h0().setLayoutParams(layoutParams);
                gee.this.m15771h0().setAlpha(m15793d(f));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gee(@NotNull DropDownAct dropDownAct) {
        super(dropDownAct);
        dropDownAct.getClass();
        this.act = dropDownAct;
        this.NORMAL_ALPHA = 0.7f;
        this.MAX_ALPHA_HEIGHT = svq.c(120);
        int iC = svq.c(84);
        this.NORMAL_PULL_UP_DISTANCE = iC;
        int iC2 = svq.c(240);
        this.MAX_PULL_UP_DISTANCE = iC2;
        this.MEDIUM_SCREEN_DEL = svq.c(24);
        this.TARGET_NORMAL_PULL_UP_DISTANCE = iC;
        this.TARGET_MAX_PULL_UP_DISTANCE = iC2;
        this.active = "";
        this.cancelSceneAnim = new Runnable() { // from class: l.nde
            @Override // java.lang.Runnable
            public final void run() {
                gee.m15716B(this.f17614a);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m15714A(final gee geeVar, View view) {
        sqb0.Companion companion = sqb0.INSTANCE;
        if (companion.m24115f().getClickLock()) {
            return;
        }
        companion.m24115f().m24094a0();
        geeVar.m14564l();
        if (!geeVar.callonClick) {
            HashMap map = new HashMap();
            map.put("remainingtimes", Integer.valueOf(a.b0()));
            zvf0.s("e_quickchat_button", "p_quickchat", map);
        }
        OnlineMatchManager.z().u0(geeVar.act(), new e30() { // from class: l.vde
            public final void call(Object obj) {
                gee.m15744z0(this.f24281a, (Boolean) obj);
            }
        });
        geeVar.callonClick = false;
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m15715A0(gee geeVar, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (z) {
            geeVar.mo14560f();
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m15716B(gee geeVar) {
        bt0.l(geeVar.m15769f0(), View.TRANSLATION_Y, 0L, 400L, (Interpolator) null, new float[]{0.0f, geeVar.m15769f0().getHeight()}).start();
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m15717B0(gee geeVar, boolean z) {
        if (z) {
            sqb0.INSTANCE.m24115f().m24081I();
        }
        if (!z) {
            geeVar.m15756R0();
        }
        if (!geeVar.callonClick) {
            HashMap map = new HashMap();
            sqb0.Companion companion = sqb0.INSTANCE;
            map.put("remainingtimes", Integer.valueOf(companion.m24121l()));
            map.put("voicechat_results", companion.m24115f().getVoicechat_results());
            zvf0.s("e_voicechat_button", "p_quickchat", map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static void m15718C(gee geeVar) {
        ValueAnimator valueAnimator = geeVar.loadingAnim;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = geeVar.loadingAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            geeVar.loadingAnim = null;
        }
        xdl0.M(geeVar.m15776l0(), true);
        xdl0.M(geeVar.m15774j0(), false);
        geeVar.m15776l0().setAlpha(1.0f);
        geeVar.m15757S0();
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m15719D0(gee geeVar, roj0 roj0Var) {
        geeVar.act.progressDismiss();
        e51.J(geeVar.cancelSceneAnim);
        geeVar.cancelSceneAnim.run();
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m15721E0(gee geeVar, Throwable th) {
        geeVar.act.progressDismiss();
    }

    /* JADX INFO: renamed from: G */
    public static void m15723G(final gee geeVar, View view) {
        lde ldeVar = geeVar.presenter;
        lde ldeVar2 = null;
        if (ldeVar == null) {
            Intrinsics.r("presenter");
            ldeVar = null;
        }
        if (ldeVar.m18681F0()) {
            return;
        }
        zvf0.r("e_quickchat_matching_propscard_confirm", "p_quickchat");
        geeVar.act.progress(R$string.f1831J5, true);
        lde ldeVar3 = geeVar.presenter;
        if (ldeVar3 == null) {
            Intrinsics.r("presenter");
        } else {
            ldeVar2 = ldeVar3;
        }
        ldeVar2.m18684s0().subscribe(mkd0.H(new e30() { // from class: l.qde
            public final void call(Object obj) {
                gee.m15719D0(this.f19721a, (roj0) obj);
            }
        }, new e30() { // from class: l.rde
            public final void call(Object obj) {
                gee.m15721E0(this.f20525a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static void m15724H(gee geeVar, View view) {
        if (geeVar.f11176b.booleanValue()) {
            return;
        }
        sqb0.INSTANCE.m24115f().m24094a0();
        zvf0.u("e_quickchat_return", "p_quickchat", new j760[]{j760.a("chat_type", OnlineMatchManager.z().J() ? "funchat" : "quickchat")});
        geeVar.act.finish();
    }

    /* JADX INFO: renamed from: I */
    public static void m15725I(gee geeVar, View view) {
        lde ldeVar = geeVar.presenter;
        if (ldeVar == null) {
            Intrinsics.r("presenter");
            ldeVar = null;
        }
        if (ldeVar.m18680E0()) {
            return;
        }
        geeVar.act.startActivity(SpeedUpCardAct.m7832Z1(geeVar.act()));
    }

    /* JADX INFO: renamed from: K */
    public static void m15727K(final gee geeVar, View view) {
        if (!PermissionHelper.b(new String[]{"android.permission.RECORD_AUDIO"})) {
            PermissionHelper.c().r(new String[]{"android.permission.RECORD_AUDIO"}).w(false).u(true).l(new PermissionHelper.b() { // from class: l.tde
                /* JADX INFO: renamed from: a */
                public final void m24663a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                    gee.m15715A0(this.f22047a, z, permissionDeniedReason);
                }
            }).i(geeVar.act);
            return;
        }
        sqb0.Companion companion = sqb0.INSTANCE;
        if (companion.m24115f().getClickLock()) {
            return;
        }
        companion.m24115f().m24094a0();
        geeVar.m14564l();
        if (!TextUtils.equals(CoreModule.m1855Q().M6().l(100003), "allow")) {
            companion.m24115f().m24081I();
        } else {
            sqb0.m24029B0(companion.m24115f(), geeVar.act, false, false, new Function1() { // from class: l.ude
                public final Object invoke(Object obj) {
                    return gee.m15717B0(this.f23496a, ((Boolean) obj).booleanValue());
                }
            }, 6, null);
            geeVar.callonClick = false;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m15728L(String str, gee geeVar, View view) {
        zvf0.u("e_quickchat_matching_cancel_popup_exit", str, new j760[]{j760.a("chat_type", OnlineMatchManager.z().J() ? "funchat" : "quickchat")});
        if (OnlineMatchManager.z().L()) {
            OnlineMatchManager.z().I.onNext(vwb.Y("notify_normal_state", (Object) null));
            OnlineMatchManager.z().v();
        } else {
            sqb0.Companion companion = sqb0.INSTANCE;
            if (companion.m24115f().m24092Y()) {
                companion.m24115f().m24078D0();
            }
        }
        if (geeVar.m15749K0()) {
            geeVar.act.finish();
        } else if (geeVar.m15750L0()) {
            geeVar.act.finish();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m15733Q0() {
        final String str = "p_quickchat_matching_cancel_popup";
        final cwf0 cwf0VarC = i0e.c("p_quickchat_matching_cancel_popup", "dlg");
        cwf0VarC.p(new j760[]{j760.a("tooltips_trigger_mode", "passive"), j760.a("chat_type", OnlineMatchManager.z().J() ? "funchat" : "quickchat")});
        xh0 xh0VarA = new xh0.a(this.act).j(OnlineMatchManager.z().J() ? "是否停止寻找心动信号" : "是否要停止寻找，退出页面将停止匹配").f("退出").r("继续寻找").c(new View.OnClickListener() { // from class: l.wde
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m15728L(str, this, view);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.xde
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gee.m15737s(cwf0VarC, dialogInterface);
            }
        }).a();
        this.exitAlerts = xh0VarA;
        if (xh0VarA != null) {
            xh0VarA.g();
        }
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: s */
    public static void m15737s(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m15738u(gee geeVar, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        geeVar.m15789x0(quickChatProduce);
    }

    /* JADX INFO: renamed from: v */
    public static void m15739v(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static void m15740w(gee geeVar, User user) {
        qib0.f19782G.m12738I0(geeVar.m15764a0(), user.fp().profileMiddle().formatted(), svq.c(100), svq.c(100));
    }

    /* JADX INFO: renamed from: y */
    public static void m15742y(gee geeVar, View view) {
        zvf0.r("e_quickchat_matching_cancel", "p_quickchat");
        geeVar.m15733Q0();
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m15744z0(gee geeVar, Boolean bool) {
        if (!bool.booleanValue()) {
            sqb0.INSTANCE.m24115f().m24081I();
        }
        if (bool.booleanValue()) {
            geeVar.m15756R0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m15745G0() {
        return !this.callonClick;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m15746H0() {
        return "audio_quick_chat_guide".equals(this.from);
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m15747I0() {
        if ("p_fake_playground".equals(this.from)) {
            return TextUtils.equals(this.active, "quick_chat") || TextUtils.equals(this.active, "voice_quick_chat");
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m15748J0() {
        return "messages_view_quickchat_entry".equals(this.from);
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m15749K0() {
        return m15754O0() || m15753N0();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m15750L0() {
        return "p_state_explore".equals(this.from);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final View m15751M(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = hee.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m15752M0() {
        return "svip_pay_success".equals(this.from) || "p_pay_result,e_quickchat_button,click".equals(this.from);
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m15753N0() {
        return "text_quickchat_party".equals(this.from);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m15754O0() {
        return "voice_quickchat_party".equals(this.from);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m15755P0(@NotNull View view) {
        view.getClass();
        this.contentViewAct = view;
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void m15773i1(@NotNull lde presenter) {
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
    public final View m15760W() {
        View view = this.contentViewAct;
        if (view != null) {
            return view;
        }
        Intrinsics.r("contentViewAct");
        return null;
    }

    @Override // p006l.ej2
    @NotNull
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public TouchPullViewLayout mo14562j() {
        return m15763Z();
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VImage m15762Y() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TouchPullViewLayout m15763Z() {
        TouchPullViewLayout touchPullViewLayout = this._content_layout;
        if (touchPullViewLayout != null) {
            return touchPullViewLayout;
        }
        Intrinsics.r("_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VDraweeView m15764a0() {
        VDraweeView vDraweeView = this._header_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_header_img");
        return null;
    }

    @Override // p006l.ej2
    @NotNull
    /* JADX INFO: renamed from: b */
    public Boolean mo14556b() {
        lde ldeVar = this.presenter;
        if (ldeVar == null) {
            Intrinsics.r("presenter");
            ldeVar = null;
        }
        if (!ldeVar.m18680E0()) {
            return Boolean.TRUE;
        }
        m15733Q0();
        return Boolean.FALSE;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final ConstraintLayout m15765b0() {
        ConstraintLayout constraintLayout = this._ll_btns;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_ll_btns");
        return null;
    }

    @Override // p006l.ej2
    /* JADX INFO: renamed from: c */
    public void mo14557c() {
        sqb0.INSTANCE.m24115f().m24081I();
        lde ldeVar = this.presenter;
        if (ldeVar == null) {
            Intrinsics.r("presenter");
            ldeVar = null;
        }
        if (!ldeVar.getIsHideBotBtn()) {
            xdl0.M(m15765b0(), true);
        }
        xdl0.M(m15771h0(), true);
        m15763Z().setEnable(true);
        xdl0.M(m15772i0(), true);
        xdl0.M(m15762Y(), false);
        xdl0.M(m15775k0(), false);
        m15787v0();
        DropDownRadarView dropDownRadarViewM15774j0 = m15774j0();
        Property property = View.ALPHA;
        Animator animatorL = bt0.l(dropDownRadarViewM15774j0, property, 0L, 300L, (Interpolator) null, new float[]{1.0f, 0.0f});
        Animator animatorL2 = bt0.l(m15765b0(), property, 0L, 500L, (Interpolator) null, new float[]{0.0f, 1.0f});
        VDraweeView vDraweeViewM15764a0 = m15764a0();
        Property property2 = View.TRANSLATION_Y;
        int i = t100.G;
        Animator animatorZ = bt0.z(new Animator[]{animatorL, animatorL2, bt0.l(vDraweeViewM15764a0, property2, 0L, 500L, (Interpolator) null, new float[]{i, 0.0f}), bt0.l(m15770g0(), property2, 0L, 500L, (Interpolator) null, new float[]{i, 0.0f}), bt0.l(m15771h0(), property2, 0L, 500L, (Interpolator) null, new float[]{m15771h0().getHeight(), 0.0f})});
        bt0.f(animatorZ, new Runnable() { // from class: l.pde
            @Override // java.lang.Runnable
            public final void run() {
                gee.m15718C(this.f18691a);
            }
        });
        animatorZ.start();
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VLinear m15766c0() {
        VLinear vLinear = this._ll_btns_audio;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_ll_btns_audio");
        return null;
    }

    @Override // p006l.ej2
    /* JADX INFO: renamed from: d */
    public void mo14558d() {
        m15767d0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VLinear m15767d0() {
        VLinear vLinear = this._ll_btns_heartbeat;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_ll_btns_heartbeat");
        return null;
    }

    public void destroy() {
        ValueAnimator valueAnimator = this.loadingAnim;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.loadingAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.loadingAnim = null;
        }
        m15787v0();
    }

    @Override // p006l.ej2
    /* JADX INFO: renamed from: e */
    public void mo14559e() {
        this.callonClick = true;
        m15768e0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VLinear m15768e0() {
        VLinear vLinear = this._ll_btns_online;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_ll_btns_online");
        return null;
    }

    @Override // p006l.ej2
    /* JADX INFO: renamed from: f */
    public void mo14560f() {
        this.callonClick = true;
        m15766c0().performClick();
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VLinear m15769f0() {
        VLinear vLinear = this._ll_scene;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_ll_scene");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VLinear m15770g0() {
        VLinear vLinear = this._ll_scene_entry;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_ll_scene_entry");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VLinear m15771h0() {
        VLinear vLinear = this._ll_to_top;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_ll_to_top");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VLinear m15772i0() {
        VLinear vLinear = this._ll_top_hey;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_ll_top_hey");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m15755P0(m15751M(inflater, parent));
        m15782r();
        return m15760W();
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final DropDownRadarView m15774j0() {
        DropDownRadarView dropDownRadarView = this._loading_img;
        if (dropDownRadarView != null) {
            return dropDownRadarView;
        }
        Intrinsics.r("_loading_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VText m15775k0() {
        VText vText = this._loading_tips;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_loading_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final DropDownRadarView m15776l0() {
        DropDownRadarView dropDownRadarView = this._loading_view;
        if (dropDownRadarView != null) {
            return dropDownRadarView;
        }
        Intrinsics.r("_loading_view");
        return null;
    }

    @Override // p006l.ej2
    @NotNull
    /* JADX INFO: renamed from: m */
    public View mo14565m() {
        return m15760W();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m15777m0() {
        VText vText = this._scene_go;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_scene_go");
        return null;
    }

    @Override // p006l.ej2
    /* JADX INFO: renamed from: n */
    public void mo14566n(boolean isHide) {
        xdl0.M(m15765b0(), isHide);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VText m15778n0() {
        VText vText = this._scene_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_scene_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VText m15779o0() {
        VText vText = this._tv_hey_loading;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_hey_loading");
        return null;
    }

    @Override // p006l.ej2
    /* JADX INFO: renamed from: p */
    public void mo14567p() {
        if (xdl0.O0(m15772i0())) {
            bt0.z(new Animator[]{bt0.l(m15772i0(), View.TRANSLATION_Y, 0L, 1000L, (Interpolator) null, new float[]{0.0f, svq.c(70)}), bt0.l(m15772i0(), View.ALPHA, 0L, 1000L, (Interpolator) null, new float[]{1.0f, 0.0f})}).start();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final VText m15780p0() {
        VText vText = this._tv_online;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_online");
        return null;
    }

    @Override // p006l.ej2
    /* JADX INFO: renamed from: q */
    public void mo14568q(@NotNull final OnlineMatchManager.QuickChatProduce produceType) {
        produceType.getClass();
        xdl0.M(m15772i0(), false);
        boolean z = produceType == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
        if (z) {
            m15763Z().setEnable(false);
        }
        m15757S0();
        DropDownRadarView dropDownRadarViewM15776l0 = m15776l0();
        Property property = View.ALPHA;
        Animator animatorL = bt0.l(dropDownRadarViewM15776l0, property, 0L, 300L, (Interpolator) null, new float[]{1.0f, 0.0f});
        Animator animatorL2 = bt0.l(m15765b0(), property, 0L, 500L, (Interpolator) null, new float[]{1.0f, 0.0f});
        VDraweeView vDraweeViewM15764a0 = m15764a0();
        Property property2 = View.TRANSLATION_Y;
        int i = t100.G;
        Animator animatorZ = bt0.z(new Animator[]{animatorL, animatorL2, bt0.l(vDraweeViewM15764a0, property2, 0L, 500L, (Interpolator) null, new float[]{0.0f, i}), bt0.l(m15770g0(), property2, 0L, 500L, (Interpolator) null, new float[]{0.0f, i}), bt0.l(m15771h0(), property2, 0L, 500L, (Interpolator) null, new float[]{0.0f, z ? m15771h0().getHeight() : 0.0f})});
        bt0.f(animatorZ, new Runnable() { // from class: l.sde
            @Override // java.lang.Runnable
            public final void run() {
                gee.m15738u(this.f21266a, produceType);
            }
        });
        animatorZ.start();
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final TextView m15781q0() {
        TextView textView = this._tv_online_tips;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tv_online_tips");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m15782r() {
        this.from = this.act.getIntent().getStringExtra("from");
        this.active = this.act.getIntent().getStringExtra("active");
        m15786u0().setText(m15750L0() ? "回到广场" : "回到消息");
        if (ogl0.m20628Q() && m15749K0()) {
            m15786u0().setText("回到首页");
        }
        if (m15747I0() || m15752M0()) {
            m15786u0().setText("返回");
        }
        m15771h0().setAlpha(this.NORMAL_ALPHA);
        if (hmb.p1()) {
            int i = this.NORMAL_PULL_UP_DISTANCE;
            int i2 = this.MEDIUM_SCREEN_DEL;
            this.TARGET_NORMAL_PULL_UP_DISTANCE = i - i2;
            this.TARGET_MAX_PULL_UP_DISTANCE = this.MAX_PULL_UP_DISTANCE - i2;
        }
        c cVarDuringCreated = this.act.duringCreated(CoreModule.f1534c.f3628e0.m21486o9());
        if (cVarDuringCreated != null) {
            cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.yde
                public final void call(Object obj) {
                    gee.m15740w(this.f28163a, (User) obj);
                }
            }, new e30() { // from class: l.zde
                public final void call(Object obj) {
                    gee.m15739v((Throwable) obj);
                }
            }));
        }
        m15780p0().setTypeface(eqh0.c(3));
        m15783r0().setTypeface(eqh0.c(3));
        m15778n0().setTypeface(eqh0.c(3));
        m15785t0().setTypeface(eqh0.c(3));
        m15779o0().setTypeface(eqh0.c(3));
        m15781q0().setText(a.u() + "人在线");
        m15784s0().setText(ke50.m18106f());
        if (upa.m25361L1()) {
            m15781q0().setText("蒙面文字匹配");
            m15784s0().setText("对方递来耳机");
        }
        sqb0.INSTANCE.m24115f().m24081I();
        m15788w0();
        if (hmb.p1()) {
            m15776l0().setScaleX(0.8f);
            m15776l0().setScaleY(0.8f);
            xdl0.C0(m15771h0(), this.TARGET_NORMAL_PULL_UP_DISTANCE);
            xdl0.X(m15786u0(), svq.c(10));
        }
        xdl0.E0(m15768e0(), new View.OnClickListener() { // from class: l.aee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m15714A(this.f8233a, view);
            }
        });
        xdl0.E0(m15766c0(), new View.OnClickListener() { // from class: l.bee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m15727K(this.f8846a, view);
            }
        });
        xdl0.E0(m15762Y(), new View.OnClickListener() { // from class: l.cee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m15742y(this.f9610a, view);
            }
        });
        xdl0.E0(m15771h0(), new View.OnClickListener() { // from class: l.dee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m15724H(this.f10352a, view);
            }
        });
        xdl0.E0(m15770g0(), new View.OnClickListener() { // from class: l.eee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m15725I(this.f11103a, view);
            }
        });
        xdl0.E0(m15777m0(), new View.OnClickListener() { // from class: l.ode
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gee.m15723G(this.f18165a, view);
            }
        });
        m15763Z().setOnFlingListener(new C0759a());
        m15790y0();
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VText m15783r0() {
        VText vText = this._tv_quick;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_quick");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final TextView m15784s0() {
        TextView textView = this._tv_quick_tips;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tv_quick_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final VText m15785t0() {
        VText vText = this._tv_scene_con;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_scene_con");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public final VText m15786u0() {
        VText vText = this._tv_to_top;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_to_top");
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m15788w0() {
        Animator animatorL = bt0.l(m15772i0(), View.TRANSLATION_Y, 0L, 1000L, (Interpolator) null, new float[]{svq.c(70), 0.0f});
        VLinear vLinearM15772i0 = m15772i0();
        Property property = View.ALPHA;
        bt0.z(new Animator[]{animatorL, bt0.l(vLinearM15772i0, property, 0L, 1000L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.l(m15776l0(), property, 0L, 1000L, (Interpolator) null, new float[]{0.0f, 1.0f})}).start();
        xdl0.M(m15776l0(), false);
        xdl0.M(m15774j0(), false);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m15789x0(@NotNull OnlineMatchManager.QuickChatProduce produceType) {
        produceType.getClass();
        if (OnlineMatchManager.z().L() || sqb0.INSTANCE.m24115f().m24092Y()) {
            boolean z = produceType == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
            xdl0.M(m15772i0(), false);
            xdl0.M(m15776l0(), false);
            xdl0.M(m15765b0(), false);
            if (z) {
                xdl0.M(m15771h0(), false);
            }
            xdl0.M(m15774j0(), true);
            m15774j0().setAlpha(1.0f);
            xdl0.M(m15775k0(), true);
            xdl0.M(m15762Y(), true);
            OnlineMatchManager.QuickChatProduce quickChatProduce = OnlineMatchManager.QuickChatProduce.Heartbeat;
            if (produceType == quickChatProduce) {
                m15775k0().setText("正在帮你寻找附近的小姐姐");
            } else if (z) {
                m15775k0().setText("正在搜索语音闪聊…");
            } else {
                m15775k0().setText("正在搜索在线闪聊…");
            }
            if (produceType == quickChatProduce) {
                zvf0.x("e_funchat_loading", "p_quickchat");
            } else {
                HashMap map = new HashMap();
                map.put("is_voicechat", Boolean.valueOf(z));
                zvf0.y("e_quickchat_matching", "p_quickchat", map);
            }
            m15757S0();
            VDraweeView vDraweeViewM15764a0 = m15764a0();
            int i = t100.G;
            vDraweeViewM15764a0.setTranslationY(i);
            m15770g0().setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m15756R0() {
    }

    /* JADX INFO: renamed from: S0 */
    public void m15757S0() {
    }

    /* JADX INFO: renamed from: v0 */
    public void m15787v0() {
    }

    /* JADX INFO: renamed from: y0 */
    public final void m15790y0() {
    }
}
