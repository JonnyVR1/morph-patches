package p153l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.badge.BadgeDrawable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p051p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import com.p051p1.mobile.putong.core.newui.profile.newme.ProfilePrivilegePayGuide;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabIapType;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabRevampSubscriptionStyle;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinAct;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.AutoVDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VRelative;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 ¯\u00022\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004{\u0083\u0001vB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010\tJ\u001f\u0010/\u001a\u00020\u00072\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020(H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u00020(2\u0006\u00106\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0007¢\u0006\u0004\b;\u0010\tJ\u0017\u0010=\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0002H\u0016¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020(2\u0006\u00106\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010\tJ#\u0010E\u001a\u00020\u00072\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010D\u001a\u00020\u0015¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u0011¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010\tJ\u0015\u0010L\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0015¢\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00072\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\u00020\u00072\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bV\u0010QJ\r\u0010W\u001a\u00020\u0007¢\u0006\u0004\bW\u0010\tJ\r\u0010X\u001a\u00020\u0007¢\u0006\u0004\bX\u0010\tJ\u0015\u0010Y\u001a\u00020\u00072\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bY\u0010QJ\u0015\u0010[\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0015¢\u0006\u0004\b[\u0010MJ\r\u0010\\\u001a\u00020\u0007¢\u0006\u0004\b\\\u0010\tJ5\u0010a\u001a\u00020\u00072\u0006\u0010]\u001a\u0002012\u0006\u0010^\u001a\u0002012\u0006\u0010_\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u0010`\u001a\u00020\u0015¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\u0007¢\u0006\u0004\bc\u0010\tJ\r\u0010d\u001a\u00020\u0007¢\u0006\u0004\bd\u0010\tJ\r\u0010e\u001a\u00020\u0007¢\u0006\u0004\be\u0010\tJ\u0017\u0010h\u001a\u00020\u00072\b\u0010g\u001a\u0004\u0018\u00010f¢\u0006\u0004\bh\u0010iJ\u0015\u0010l\u001a\u00020\u00072\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u0007H\u0016¢\u0006\u0004\bn\u0010\tJ\u000f\u0010o\u001a\u00020\u0007H\u0016¢\u0006\u0004\bo\u0010\tJ\u000f\u0010p\u001a\u00020\u0015H\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u0007H\u0016¢\u0006\u0004\br\u0010\tJ\u0011\u0010t\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bt\u0010uR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010\u009d\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u0094\u0001\u001a\u0006\b\u009b\u0001\u0010\u0096\u0001\"\u0006\b\u009c\u0001\u0010\u0098\u0001R*\u0010¥\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010±\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010\u0094\u0001\u001a\u0006\b¯\u0001\u0010\u0096\u0001\"\u0006\b°\u0001\u0010\u0098\u0001R)\u0010¸\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010¼\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010¨\u0001\u001a\u0006\bº\u0001\u0010ª\u0001\"\u0006\b»\u0001\u0010¬\u0001R*\u0010À\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0001\u0010\u0094\u0001\u001a\u0006\b¾\u0001\u0010\u0096\u0001\"\u0006\b¿\u0001\u0010\u0098\u0001R*\u0010Ä\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÁ\u0001\u0010¨\u0001\u001a\u0006\bÂ\u0001\u0010ª\u0001\"\u0006\bÃ\u0001\u0010¬\u0001R)\u0010È\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010³\u0001\u001a\u0006\bÆ\u0001\u0010µ\u0001\"\u0006\bÇ\u0001\u0010·\u0001R)\u0010Ï\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bp\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R*\u0010Ó\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÐ\u0001\u0010\u0094\u0001\u001a\u0006\bÑ\u0001\u0010\u0096\u0001\"\u0006\bÒ\u0001\u0010\u0098\u0001R*\u0010Û\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R(\u0010Þ\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b@\u0010³\u0001\u001a\u0006\bÜ\u0001\u0010µ\u0001\"\u0006\bÝ\u0001\u0010·\u0001R)\u0010â\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010³\u0001\u001a\u0006\bà\u0001\u0010µ\u0001\"\u0006\bá\u0001\u0010·\u0001R)\u0010æ\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bã\u0001\u0010³\u0001\u001a\u0006\bä\u0001\u0010µ\u0001\"\u0006\bå\u0001\u0010·\u0001R*\u0010ê\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bç\u0001\u0010\u0094\u0001\u001a\u0006\bè\u0001\u0010\u0096\u0001\"\u0006\bé\u0001\u0010\u0098\u0001R)\u0010î\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bë\u0001\u0010³\u0001\u001a\u0006\bì\u0001\u0010µ\u0001\"\u0006\bí\u0001\u0010·\u0001R)\u0010ò\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bï\u0001\u0010³\u0001\u001a\u0006\bð\u0001\u0010µ\u0001\"\u0006\bñ\u0001\u0010·\u0001R)\u0010õ\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b9\u0010Ö\u0001\u001a\u0006\bó\u0001\u0010Ø\u0001\"\u0006\bô\u0001\u0010Ú\u0001R(\u0010ø\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b;\u0010³\u0001\u001a\u0006\bö\u0001\u0010µ\u0001\"\u0006\b÷\u0001\u0010·\u0001R(\u0010û\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001b\u0010³\u0001\u001a\u0006\bù\u0001\u0010µ\u0001\"\u0006\bú\u0001\u0010·\u0001R)\u0010þ\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\b\u0010¨\u0001\u001a\u0006\bü\u0001\u0010ª\u0001\"\u0006\bý\u0001\u0010¬\u0001R(\u0010\u0081\u0002\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b&\u0010³\u0001\u001a\u0006\bÿ\u0001\u0010µ\u0001\"\u0006\b\u0080\u0002\u0010·\u0001R)\u0010\u0084\u0002\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b=\u0010\u0094\u0001\u001a\u0006\b\u0082\u0002\u0010\u0096\u0001\"\u0006\b\u0083\u0002\u0010\u0098\u0001R*\u0010\u0088\u0002\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010¨\u0001\u001a\u0006\b\u0086\u0002\u0010ª\u0001\"\u0006\b\u0087\u0002\u0010¬\u0001R(\u0010\u008b\u0002\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u000b\u0010³\u0001\u001a\u0006\b\u0089\u0002\u0010µ\u0001\"\u0006\b\u008a\u0002\u0010·\u0001R)\u0010\u008e\u0002\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b+\u0010¨\u0001\u001a\u0006\b\u008c\u0002\u0010ª\u0001\"\u0006\b\u008d\u0002\u0010¬\u0001R)\u0010\u0091\u0002\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b)\u0010\u0094\u0001\u001a\u0006\b\u008f\u0002\u0010\u0096\u0001\"\u0006\b\u0090\u0002\u0010\u0098\u0001R)\u0010\u0098\u0002\u001a\u00030\u0092\u00028\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bH\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R*\u0010\u009c\u0002\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0002\u0010\u0094\u0001\u001a\u0006\b\u009a\u0002\u0010\u0096\u0001\"\u0006\b\u009b\u0002\u0010\u0098\u0001R\u0018\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u009d\u0002R\u001b\u0010\u009e\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010³\u0001R\u001c\u0010¡\u0002\u001a\u0005\u0018\u00010\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010 \u0002R\u001b\u0010£\u0002\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¢\u0002R\u001c\u0010¦\u0002\u001a\u0005\u0018\u00010¤\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010¥\u0002R\u001c\u0010§\u0002\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¨\u0001R\u001d\u0010«\u0002\u001a\u00030¨\u00028\u0006¢\u0006\u0010\n\u0006\bË\u0001\u0010©\u0002\u001a\u0006\b\u0099\u0002\u0010ª\u0002R$\u0010®\u0002\u001a\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0¬\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010\u00ad\u0002¨\u0006°\u0002"}, m88121d2 = {"Ll/xnx;", "Ll/v1b0;", "Ll/enx;", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;)V", "", "A", "()V", "A0", "E", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;", "type", "Ll/xnx$c;", "j0", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)Ll/xnx$c;", "", "iconRes", "titleRes", "descRes", "", "isInstantMatch", "iapType", "Lkotlin/Function0;", "onClick", "Ll/xnx$b;", BaseSei.f14626Z, "(IIIZLcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;Lkotlin/jvm/functions/Function0;)Ll/xnx$b;", "views", "o0", "(Ll/xnx$b;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)V", "p0", "(Ll/xnx$b;)V", "i0", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)I", "Lv/VText_NoTopPadding;", "badge", "B", "(Lv/VText_NoTopPadding;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)V", "Landroid/view/View;", "G", "()Landroid/view/View;", "F", "k0", "countView", "badgeView", "y0", "(Landroid/view/View;Landroid/view/View;)V", "", "seeBadgeCount", "s0", "(J)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", BaseSei.f14624X, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", BaseSei.f14625Y, "presenter", c4s.C_ZONE, "(Ll/enx;)V", "inflateView", "r", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "force", "q0", "(Ljava/util/List;Z)V", "position", "H", "(I)V", "n0", Active.TYPE, "B0", "(Z)V", "Lcom/p1/mobile/putong/data/User;", "user", "v0", "(Lcom/p1/mobile/putong/data/User;)V", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "uri", "m0", "(Lcom/p1/mobile/putong/data/Picture$ImageUri;)V", "w0", "H0", "z0", "u0", "show", "E0", "l0", "likesYou", "likesSent", SchemeKey.visitors, "showVisitorDot", "t0", "(JJJJZ)V", "x0", "h0", "D0", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "guide", "r0", "(Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;)V", "Landroid/content/Intent;", "intent", "G0", "(Landroid/content/Intent;)V", "D1", "x2", "o", "()Z", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "Lv/VRelative;", "b", "Lv/VRelative;", "get_new_tab_me_test2", "()Lv/VRelative;", "set_new_tab_me_test2", "(Lv/VRelative;)V", "_new_tab_me_test2", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "e0", "()Lv/navigationbar/VNavigationBar;", "set_test2_top_navigationbar", "(Lv/navigationbar/VNavigationBar;)V", "_test2_top_navigationbar", "Landroid/widget/ScrollView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ScrollView;", "get_test2_content_view", "()Landroid/widget/ScrollView;", "set_test2_content_view", "(Landroid/widget/ScrollView;)V", "_test2_content_view", "Lv/VLinear;", "e", "Lv/VLinear;", "get_test2_content", "()Lv/VLinear;", "set_test2_content", "(Lv/VLinear;)V", "_test2_content", "f", "get_test2_header_container", "set_test2_header_container", "_test2_header_container", "Lv/AutoVDraweeView;", "g", "Lv/AutoVDraweeView;", "L", "()Lv/AutoVDraweeView;", "set_test2_header_container_test2_avatar", "(Lv/AutoVDraweeView;)V", "_test2_header_container_test2_avatar", "Lv/VImage;", "h", "Lv/VImage;", "M", "()Lv/VImage;", "set_test2_header_container_test2_avatar_edit", "(Lv/VImage;)V", "_test2_header_container_test2_avatar_edit", RXScreenCaptureService.KEY_INDEX, "get_test2_header_container_test2_name_row", "set_test2_header_container_test2_name_row", "_test2_header_container_test2_name_row", "j", "Lv/VText_NoTopPadding;", "N", "()Lv/VText_NoTopPadding;", "set_test2_header_container_test2_name_row_test2_name", "(Lv/VText_NoTopPadding;)V", "_test2_header_container_test2_name_row_test2_name", "k", BloodType.f39576O, "set_test2_header_container_test2_name_row_test2_verification_icon", "_test2_header_container_test2_name_row_test2_verification_icon", BLiveStormDanmakuGiftResourceType.f45292l, "Q", "set_test2_header_container_test2_subscription_btn", "_test2_header_container_test2_subscription_btn", "m", "R", "set_test2_header_container_test2_subscription_btn_test2_sub_badge", "_test2_header_container_test2_subscription_btn_test2_sub_badge", "n", p7f.LATITUDE_SOUTH, "set_test2_header_container_test2_subscription_btn_test2_sub_text", "_test2_header_container_test2_subscription_btn_test2_sub_text", "Lv/VOnlineIndicator;", "Lv/VOnlineIndicator;", "P", "()Lv/VOnlineIndicator;", "set_test2_header_container_test2_sub_dot", "(Lv/VOnlineIndicator;)V", "_test2_header_container_test2_sub_dot", "p", p7f.GPS_MEASUREMENT_INTERRUPTED, "set_test2_stats_container", "_test2_stats_container", "Lv/VFrame;", "q", "Lv/VFrame;", "Y", "()Lv/VFrame;", "set_test2_stats_container_test2_likes_you_stat", "(Lv/VFrame;)V", "_test2_stats_container_test2_likes_you_stat", "a0", "set_test2_stats_container_test2_likes_you_stat_test2_likes_you_count", "_test2_stats_container_test2_likes_you_stat_test2_likes_you_count", BLiveStormDanmakuGiftResourceType.f45294s, "get_test2_stats_container_test2_likes_you_stat_test2_likes_you_label", "set_test2_stats_container_test2_likes_you_stat_test2_likes_you_label", "_test2_stats_container_test2_likes_you_stat_test2_likes_you_label", Constants.KEY_T, "Z", "set_test2_stats_container_test2_likes_you_stat_test2_likes_you_badge", "_test2_stats_container_test2_likes_you_stat_test2_likes_you_badge", "u", "W", "set_test2_stats_container_test2_likes_sent_stat", "_test2_stats_container_test2_likes_sent_stat", ResourceDirection.f39656v, "X", "set_test2_stats_container_test2_likes_sent_stat_test2_likes_sent_count", "_test2_stats_container_test2_likes_sent_stat_test2_likes_sent_count", "w", "get_test2_stats_container_test2_likes_sent_stat_test2_likes_sent_label", "set_test2_stats_container_test2_likes_sent_stat_test2_likes_sent_label", "_test2_stats_container_test2_likes_sent_stat_test2_likes_sent_label", "b0", "set_test2_stats_container_test2_visitors_stat", "_test2_stats_container_test2_visitors_stat", "c0", "set_test2_stats_container_test2_visitors_stat_test2_visitors_count", "_test2_stats_container_test2_visitors_stat_test2_visitors_count", "get_test2_stats_container_test2_visitors_stat_test2_visitors_label", "set_test2_stats_container_test2_visitors_stat_test2_visitors_label", "_test2_stats_container_test2_visitors_stat_test2_visitors_label", "d0", "set_test2_stats_container_test2_visitors_stat_test2_visitors_dot", "_test2_stats_container_test2_visitors_stat_test2_visitors_dot", "K", "set_test2_fake_tip", "_test2_fake_tip", "f0", "set_test2_verification_banner", "_test2_verification_banner", "D", "get_test2_verification_banner_test2_verification_banner_icon", "set_test2_verification_banner_test2_verification_banner_icon", "_test2_verification_banner_test2_verification_banner_icon", "g0", "set_test2_verification_banner_test2_verification_banner_text", "_test2_verification_banner_test2_verification_banner_text", "get_test2_verification_banner_test2_verification_banner_arrow", "set_test2_verification_banner_test2_verification_banner_arrow", "_test2_verification_banner_test2_verification_banner_arrow", "J", "set_test2_banner_container", "_test2_banner_container", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "U", "()Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "set_test2_privilege_banner", "(Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;)V", "_test2_privilege_banner", "I", p7f.GPS_DIRECTION_TRUE, "set_test2_iap_list_container", "_test2_iap_list_container", "Ll/enx;", "navWalletText", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "renewGuideBanner", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "lastRenewGuide", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "boostSvga", "boostStaticIcon", "Ll/zdo;", "Ll/zdo;", "()Ll/zdo;", "intlMeTabDiscountEntryHost", "", "Ljava/util/Map;", "iapItemViewsMap", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xnx implements v1b0<enx> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VImage _test2_stats_container_test2_visitors_stat_test2_visitors_dot;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_fake_tip;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VLinear _test2_verification_banner;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VImage _test2_verification_banner_test2_verification_banner_icon;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_verification_banner_test2_verification_banner_text;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VImage _test2_verification_banner_test2_verification_banner_arrow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VLinear _test2_banner_container;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public NewProfilePrivilegedPager _test2_privilege_banner;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VLinear _test2_iap_list_container;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public enx presenter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public VText_NoTopPadding navWalletText;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public ProfilePrivilegePayGuide renewGuideBanner;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    public IntlTabMePayGuide lastRenewGuide;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView boostSvga;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    public VImage boostStaticIcon;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public final zdo intlMeTabDiscountEntryHost;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public final Map<MeTabIapType, C21396b> iapItemViewsMap;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ProfileFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRelative _new_tab_me_test2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VNavigationBar _test2_top_navigationbar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ScrollView _test2_content_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _test2_content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _test2_header_container;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public AutoVDraweeView _test2_header_container_test2_avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _test2_header_container_test2_avatar_edit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VLinear _test2_header_container_test2_name_row;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_header_container_test2_name_row_test2_name;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _test2_header_container_test2_name_row_test2_verification_icon;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VLinear _test2_header_container_test2_subscription_btn;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage _test2_header_container_test2_subscription_btn_test2_sub_badge;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_header_container_test2_subscription_btn_test2_sub_text;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VOnlineIndicator _test2_header_container_test2_sub_dot;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VLinear _test2_stats_container;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VFrame _test2_stats_container_test2_likes_you_stat;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_stats_container_test2_likes_you_stat_test2_likes_you_count;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_stats_container_test2_likes_you_stat_test2_likes_you_label;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_stats_container_test2_likes_you_stat_test2_likes_you_badge;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VLinear _test2_stats_container_test2_likes_sent_stat;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_stats_container_test2_likes_sent_stat_test2_likes_sent_count;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_stats_container_test2_likes_sent_stat_test2_likes_sent_label;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VFrame _test2_stats_container_test2_visitors_stat;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_stats_container_test2_visitors_stat_test2_visitors_count;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VText_NoTopPadding _test2_stats_container_test2_visitors_stat_test2_visitors_label;

    /* JADX INFO: renamed from: l.xnx$b */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006\""}, m88121d2 = {"Ll/xnx$b;", "", "Landroid/view/View;", "root", "Lv/VText_NoTopPadding;", "countBadge", "Lv/VImage;", "lockBadge", "unlockText", "arrow", "<init>", "(Landroid/view/View;Lv/VText_NoTopPadding;Lv/VImage;Lv/VText_NoTopPadding;Lv/VImage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "b", "Lv/VText_NoTopPadding;", "()Lv/VText_NoTopPadding;", "c", "Lv/VImage;", "()Lv/VImage;", Constants.INAPP_DATA_TAG, "e", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* data */ class C21396b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final View root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final VText_NoTopPadding countBadge;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final VImage lockBadge;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final VText_NoTopPadding unlockText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final VImage arrow;

        public C21396b(@NotNull View view, @NotNull VText_NoTopPadding vText_NoTopPadding, @Nullable VImage vImage, @Nullable VText_NoTopPadding vText_NoTopPadding2, @Nullable VImage vImage2) {
            view.getClass();
            vText_NoTopPadding.getClass();
            this.root = view;
            this.countBadge = vText_NoTopPadding;
            this.lockBadge = vImage;
            this.unlockText = vText_NoTopPadding2;
            this.arrow = vImage2;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final VImage getArrow() {
            return this.arrow;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final VText_NoTopPadding getCountBadge() {
            return this.countBadge;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final VImage getLockBadge() {
            return this.lockBadge;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final VText_NoTopPadding getUnlockText() {
            return this.unlockText;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C21396b)) {
                return false;
            }
            C21396b c21396b = (C21396b) other;
            return Intrinsics.m88377d(this.root, c21396b.root) && Intrinsics.m88377d(this.countBadge, c21396b.countBadge) && Intrinsics.m88377d(this.lockBadge, c21396b.lockBadge) && Intrinsics.m88377d(this.unlockText, c21396b.unlockText) && Intrinsics.m88377d(this.arrow, c21396b.arrow);
        }

        public int hashCode() {
            int iHashCode = ((this.root.hashCode() * 31) + this.countBadge.hashCode()) * 31;
            VImage vImage = this.lockBadge;
            int iHashCode2 = (iHashCode + (vImage == null ? 0 : vImage.hashCode())) * 31;
            VText_NoTopPadding vText_NoTopPadding = this.unlockText;
            int iHashCode3 = (iHashCode2 + (vText_NoTopPadding == null ? 0 : vText_NoTopPadding.hashCode())) * 31;
            VImage vImage2 = this.arrow;
            return iHashCode3 + (vImage2 != null ? vImage2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "IapItemViews(root=" + this.root + ", countBadge=" + this.countBadge + ", lockBadge=" + this.lockBadge + ", unlockText=" + this.unlockText + ", arrow=" + this.arrow + ")";
        }
    }

    /* JADX INFO: renamed from: l.xnx$c */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m88121d2 = {"Ll/xnx$c;", "", "", "iconRes", "titleRes", "descRes", "<init>", "(III)V", "a", "()I", "b", "c", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIconRes", "getTitleRes", "getDescRes", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* data */ class C21397c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int iconRes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int titleRes;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int descRes;

        public C21397c(int i, int i2, int i3) {
            this.iconRes = i;
            this.titleRes = i2;
            this.descRes = i3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIconRes() {
            return this.iconRes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getDescRes() {
            return this.descRes;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C21397c)) {
                return false;
            }
            C21397c c21397c = (C21397c) other;
            return this.iconRes == c21397c.iconRes && this.titleRes == c21397c.titleRes && this.descRes == c21397c.descRes;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.iconRes) * 31) + Integer.hashCode(this.titleRes)) * 31) + Integer.hashCode(this.descRes);
        }

        @NotNull
        public String toString() {
            return "IapResources(iconRes=" + this.iconRes + ", titleRes=" + this.titleRes + ", descRes=" + this.descRes + ")";
        }
    }

    /* JADX INFO: renamed from: l.xnx$d */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C21398d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f195541a;

        static {
            int[] iArr = new int[MeTabIapType.values().length];
            try {
                iArr[MeTabIapType.BOOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MeTabIapType.SUPER_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MeTabIapType.COMPLIMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MeTabIapType.INSTANT_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f195541a = iArr;
        }
    }

    public xnx(@NotNull ProfileFrag profileFrag) {
        profileFrag.getClass();
        this.frag = profileFrag;
        this.intlMeTabDiscountEntryHost = new zdo(profileFrag);
        this.iapItemViewsMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: A */
    private final void m212356A() {
        VLinear rightIconContainer = m212413e0().getRightIconContainer();
        ViewGroup.LayoutParams layoutParams = rightIconContainer.getLayoutParams();
        layoutParams.height = -1;
        rightIconContainer.setLayoutParams(layoutParams);
        rightIconContainer.setGravity(BadgeDrawable.TOP_END);
        View viewFindViewById = m212413e0().findViewById(adc0.f70180W1);
        if (viewFindViewById == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.leftMargin = qa00.m175859d(16.0f);
        viewFindViewById.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: A0 */
    private final void m212357A0() {
        ViewParent parent = m212404V().getParent();
        parent.getClass();
        LinearLayout linearLayout = (LinearLayout) parent;
        int iIndexOfChild = linearLayout.indexOfChild(m212392J());
        this.intlMeTabDiscountEntryHost.m219356a(linearLayout, m212392J());
        if (iIndexOfChild < 0 || linearLayout.getChildCount() <= iIndexOfChild) {
            return;
        }
        View childAt = linearLayout.getChildAt(iIndexOfChild);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = qa00.f156323j;
            layoutParams2.bottomMargin = 0;
        }
        childAt.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: F */
    private final View m212358F() {
        VImage vImage = new VImage(getContext());
        vImage.setImageResource(dbc0.f87640ze);
        VFrame vFrame = new VFrame(getContext());
        vFrame.setId(adc0.f70180W1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        layoutParams.gravity = BadgeDrawable.TOP_START;
        Unit unit = Unit.INSTANCE;
        vFrame.addView(vImage, layoutParams);
        vFrame.setPadding(0, qa00.f156323j, qa00.f156321h, 0);
        bnl0.m105509E0(vFrame, new View.OnClickListener() { // from class: l.hnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212372m(this.f110840a, view);
            }
        });
        return vFrame;
    }

    /* JADX INFO: renamed from: G */
    private final View m212359G() {
        VFrame vFrame = new VFrame(getContext());
        vFrame.setId(adc0.f70196X1);
        VLinear vLinear = new VLinear(getContext());
        vLinear.setOrientation(0);
        vLinear.setGravity(16);
        VImage vImage = new VImage(getContext());
        vImage.setImageResource(dbc0.f86535Re);
        vLinear.addView(vImage, new LinearLayout.LayoutParams(qa00.m175859d(24.0f), qa00.m175859d(24.0f)));
        VText_NoTopPadding vText_NoTopPadding = new VText_NoTopPadding(getContext());
        vText_NoTopPadding.setTextSize(12.0f);
        vText_NoTopPadding.setTextColor(App.f16088e.getColor(c9c0.f80366Q));
        vText_NoTopPadding.setTypeface(lyh0.m156283c(3));
        vText_NoTopPadding.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = qa00.f156320g;
        vLinear.addView(vText_NoTopPadding, layoutParams);
        this.navWalletText = vText_NoTopPadding;
        bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.wnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212366i(this.f189987a, view);
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        vFrame.setPadding(qa00.f156318e, qa00.f156323j, 0, 0);
        vFrame.addView(vLinear, layoutParams2);
        return vFrame;
    }

    /* JADX INFO: renamed from: a */
    public static void m212360a(xnx xnxVar, View view) {
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121684t1();
    }

    /* JADX INFO: renamed from: b */
    public static void m212361b(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: c */
    public static void m212362c(xnx xnxVar, View view) {
        yyh0.INSTANCE.m217995k(xnxVar.frag);
        box.INSTANCE.m105723l();
    }

    /* JADX INFO: renamed from: d */
    public static ProfilePrivilegePayGuide m212363d(xnx xnxVar) {
        return xnxVar.renewGuideBanner;
    }

    /* JADX INFO: renamed from: e */
    public static void m212364e(xnx xnxVar, View view) {
        Intent intentM57175Z1 = VerificationCenterAct.m57175Z1(xnxVar.getAct(), false, "button");
        intentM57175Z1.getClass();
        xnxVar.m212388G0(intentM57175Z1);
    }

    /* JADX INFO: renamed from: f */
    public static void m212365f(xnx xnxVar, View view) {
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121688z1();
    }

    /* JADX INFO: renamed from: i */
    public static void m212366i(xnx xnxVar, View view) {
        Intent intentM59260Y1 = TanTanCoinAct.m59260Y1(xnxVar.getAct());
        intentM59260Y1.getClass();
        xnxVar.m212388G0(intentM59260Y1);
    }

    /* JADX INFO: renamed from: i0 */
    private final int m212367i0(MeTabIapType type) {
        int i = C21398d.f195541a[type.ordinal()];
        if (i == 1) {
            return -40013;
        }
        if (i == 2) {
            return -13906689;
        }
        if (i == 3) {
            return -17652;
        }
        if (i == 4) {
            return -2144769;
        }
        nbr.m162172a();
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m212368j(xnx xnxVar, View view) {
        view.getClass();
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121686v1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m212369k(xnx xnxVar, MeTabIapType meTabIapType) {
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121681q1(meTabIapType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    private final void m212370k0() {
        czq.m113347c(m212394L(), new Function1() { // from class: l.fnx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xnx.m212368j(this.f99982a, (View) obj);
            }
        });
        czq.m113347c(m212395M(), new Function1() { // from class: l.onx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xnx.m212374p(this.f148236a, (View) obj);
            }
        });
        bnl0.m105509E0(m212396N(), new View.OnClickListener() { // from class: l.pnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212375q(this.f153340a, view);
            }
        });
        bnl0.m105509E0(m212407Y(), new View.OnClickListener() { // from class: l.qnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212380w(this.f158668a, view);
            }
        });
        bnl0.m105509E0(m212405W(), new View.OnClickListener() { // from class: l.rnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212360a(this.f164133a, view);
            }
        });
        bnl0.m105509E0(m212410b0(), new View.OnClickListener() { // from class: l.snx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212365f(this.f169789a, view);
            }
        });
        bnl0.m105509E0(m212397O(), new View.OnClickListener() { // from class: l.tnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212364e(this.f175336a, view);
            }
        });
        bnl0.m105509E0(m212414f0(), new View.OnClickListener() { // from class: l.unx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212376s(this.f179997a, view);
            }
        });
        m212433z0();
    }

    /* JADX INFO: renamed from: l */
    public static void m212371l(xnx xnxVar, View view) {
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121682r1();
    }

    /* JADX INFO: renamed from: m */
    public static void m212372m(xnx xnxVar, View view) {
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121687x1();
    }

    /* JADX INFO: renamed from: n */
    public static Unit m212373n(xnx xnxVar, ProfilePrivilegePayGuide profilePrivilegePayGuide) {
        profilePrivilegePayGuide.getClass();
        xnxVar.renewGuideBanner = profilePrivilegePayGuide;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m212374p(xnx xnxVar, View view) {
        view.getClass();
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121683s1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static void m212375q(xnx xnxVar, View view) {
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121686v1();
    }

    /* JADX INFO: renamed from: s */
    public static void m212376s(xnx xnxVar, View view) {
        Intent intentM57175Z1 = VerificationCenterAct.m57175Z1(xnxVar.getAct(), false, "button");
        intentM57175Z1.getClass();
        xnxVar.m212388G0(intentM57175Z1);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m212377s0(long seeBadgeCount) {
        VText_NoTopPadding vText_NoTopPaddingM212408Z = m212408Z();
        if (seeBadgeCount <= 0 || !spl0.m187359K()) {
            bnl0.m105524M(vText_NoTopPaddingM212408Z, false);
            return;
        }
        vText_NoTopPaddingM212408Z.setText("");
        vText_NoTopPaddingM212408Z.setBackgroundResource(dbc0.f86939e);
        vText_NoTopPaddingM212408Z.setMinimumWidth(qa00.m175859d(8.0f));
        vText_NoTopPaddingM212408Z.setMinimumHeight(qa00.m175859d(8.0f));
        ViewGroup.LayoutParams layoutParams = vText_NoTopPaddingM212408Z.getLayoutParams();
        layoutParams.width = qa00.m175859d(8.0f);
        layoutParams.height = qa00.m175859d(8.0f);
        vText_NoTopPaddingM212408Z.setLayoutParams(layoutParams);
        vText_NoTopPaddingM212408Z.setPadding(0, 0, 0, 0);
        bnl0.m105524M(vText_NoTopPaddingM212408Z, true);
    }

    /* JADX INFO: renamed from: u */
    public static void m212378u(View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.setMarginStart(view2.getWidth() + qa00.m175859d(2.0f));
        layoutParams2.topMargin = 0;
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: v */
    public static void m212379v(xnx xnxVar) {
        xnxVar.m212399Q().animate().scaleX(1.0f).scaleY(1.0f).setDuration(160L).start();
    }

    /* JADX INFO: renamed from: w */
    public static void m212380w(xnx xnxVar, View view) {
        enx enxVar = xnxVar.presenter;
        if (enxVar == null) {
            Intrinsics.m88391r("presenter");
            enxVar = null;
        }
        enxVar.m121685u1();
    }

    /* JADX INFO: renamed from: y0 */
    private final void m212381y0(final View countView, final View badgeView) {
        countView.post(new Runnable() { // from class: l.jnx
            @Override // java.lang.Runnable
            public final void run() {
                xnx.m212378u(badgeView, countView);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m212382B(VText_NoTopPadding badge, MeTabIapType type) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(qa00.m175859d(7.0f));
        gradientDrawable.setColor(m212367i0(type));
        badge.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m212383B0(boolean active) {
        VImage vImage;
        SVGAnimationView sVGAnimationView = this.boostSvga;
        if (sVGAnimationView == null || (vImage = this.boostStaticIcon) == null) {
            return;
        }
        if (active) {
            vImage.setVisibility(4);
            sVGAnimationView.setVisibility(0);
            if (sVGAnimationView.isAnimating()) {
                return;
            }
            sVGAnimationView.startAnimation();
            return;
        }
        if (sVGAnimationView.isAnimating()) {
            sVGAnimationView.stopAnimation(false);
            sVGAnimationView.stepToFrame(0.0f, false);
        }
        sVGAnimationView.setVisibility(8);
        vImage.setVisibility(0);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull enx presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m212385D0() {
        if (bix.m104579a()) {
            return;
        }
        m212424r0(this.lastRenewGuide);
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: D1 */
    public void mo44371D1() {
        ProfilePrivilegePayGuide profilePrivilegePayGuide = this.renewGuideBanner;
        if (profilePrivilegePayGuide != null) {
            if (!bnl0.m105529O0(profilePrivilegePayGuide)) {
                profilePrivilegePayGuide = null;
            }
            if (profilePrivilegePayGuide != null) {
                profilePrivilegePayGuide.m44308n0("");
            }
        }
        CoreModule.f18264c.f20396j0.m31608Q5();
        this.intlMeTabDiscountEntryHost.m219358c();
    }

    /* JADX INFO: renamed from: E */
    public final void m212386E() {
        m212402T().removeAllViews();
        this.iapItemViewsMap.clear();
        Iterator<MeTabIapType> it = gix.m130388b().iterator();
        while (it.hasNext()) {
            final MeTabIapType next = it.next();
            C21397c c21397cM212417j0 = this.m212417j0(next);
            xnx xnxVar = this;
            xnxVar.iapItemViewsMap.put(next, xnxVar.m212432z(c21397cM212417j0.getIconRes(), c21397cM212417j0.getTitleRes(), c21397cM212417j0.getDescRes(), next == MeTabIapType.INSTANT_MATCH, next, new Function0() { // from class: l.vnx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return xnx.m212369k(this.f184930a, next);
                }
            }));
            this = xnxVar;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m212387E0(boolean show) {
        bnl0.m105524M(m212398P(), show);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m212388G0(@NotNull Intent intent) {
        intent.getClass();
        this.frag.startActivity(intent);
    }

    /* JADX INFO: renamed from: H */
    public final void m212389H(int position) {
        m212403U().m44296b(position);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m212390H0() {
        boolean zM116537Z7 = CoreModule.f18264c.f20381e0.m116537Z7();
        if (zM116537Z7) {
            box.INSTANCE.m105724m();
            bnl0.m105515H0(m212393K(), k3g.m148016a() ? CoreModule.m30934Q().mo68468sj() : this.frag.getString(R$string.f19791x4));
        }
        bnl0.m105524M(m212393K(), zM116537Z7);
        Act act = this.frag.act();
        NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
        if (newMainAct != null) {
            newMainAct.m40836t7();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final zdo getIntlMeTabDiscountEntryHost() {
        return this.intlMeTabDiscountEntryHost;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VLinear m212392J() {
        VLinear vLinear = this._test2_banner_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test2_banner_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText_NoTopPadding m212393K() {
        VText_NoTopPadding vText_NoTopPadding = this._test2_fake_tip;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test2_fake_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final AutoVDraweeView m212394L() {
        AutoVDraweeView autoVDraweeView = this._test2_header_container_test2_avatar;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_test2_header_container_test2_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VImage m212395M() {
        VImage vImage = this._test2_header_container_test2_avatar_edit;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test2_header_container_test2_avatar_edit");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText_NoTopPadding m212396N() {
        VText_NoTopPadding vText_NoTopPadding = this._test2_header_container_test2_name_row_test2_name;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test2_header_container_test2_name_row_test2_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m212397O() {
        VImage vImage = this._test2_header_container_test2_name_row_test2_verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test2_header_container_test2_name_row_test2_verification_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VOnlineIndicator m212398P() {
        VOnlineIndicator vOnlineIndicator = this._test2_header_container_test2_sub_dot;
        if (vOnlineIndicator != null) {
            return vOnlineIndicator;
        }
        Intrinsics.m88391r("_test2_header_container_test2_sub_dot");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VLinear m212399Q() {
        VLinear vLinear = this._test2_header_container_test2_subscription_btn;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test2_header_container_test2_subscription_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m212400R() {
        VImage vImage = this._test2_header_container_test2_subscription_btn_test2_sub_badge;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test2_header_container_test2_subscription_btn_test2_sub_badge");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText_NoTopPadding m212401S() {
        VText_NoTopPadding vText_NoTopPadding = this._test2_header_container_test2_subscription_btn_test2_sub_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test2_header_container_test2_subscription_btn_test2_sub_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VLinear m212402T() {
        VLinear vLinear = this._test2_iap_list_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test2_iap_list_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final NewProfilePrivilegedPager m212403U() {
        NewProfilePrivilegedPager newProfilePrivilegedPager = this._test2_privilege_banner;
        if (newProfilePrivilegedPager != null) {
            return newProfilePrivilegedPager;
        }
        Intrinsics.m88391r("_test2_privilege_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m212404V() {
        VLinear vLinear = this._test2_stats_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test2_stats_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VLinear m212405W() {
        VLinear vLinear = this._test2_stats_container_test2_likes_sent_stat;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test2_stats_container_test2_likes_sent_stat");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText_NoTopPadding m212406X() {
        VText_NoTopPadding vText_NoTopPadding = this._test2_stats_container_test2_likes_sent_stat_test2_likes_sent_count;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test2_stats_container_test2_likes_sent_stat_test2_likes_sent_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VFrame m212407Y() {
        VFrame vFrame = this._test2_stats_container_test2_likes_you_stat;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_test2_stats_container_test2_likes_you_stat");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText_NoTopPadding m212408Z() {
        VText_NoTopPadding vText_NoTopPadding = this._test2_stats_container_test2_likes_you_stat_test2_likes_you_badge;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test2_stats_container_test2_likes_you_stat_test2_likes_you_badge");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText_NoTopPadding m212409a0() {
        VText_NoTopPadding vText_NoTopPadding = this._test2_stats_container_test2_likes_you_stat_test2_likes_you_count;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test2_stats_container_test2_likes_you_stat_test2_likes_you_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VFrame m212410b0() {
        VFrame vFrame = this._test2_stats_container_test2_visitors_stat;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_test2_stats_container_test2_visitors_stat");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText_NoTopPadding m212411c0() {
        VText_NoTopPadding vText_NoTopPadding = this._test2_stats_container_test2_visitors_stat_test2_visitors_count;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test2_stats_container_test2_visitors_stat_test2_visitors_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VImage m212412d0() {
        VImage vImage = this._test2_stats_container_test2_visitors_stat_test2_visitors_dot;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test2_stats_container_test2_visitors_stat_test2_visitors_dot");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        this.intlMeTabDiscountEntryHost.m219357b();
        m212431y();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VNavigationBar m212413e0() {
        VNavigationBar vNavigationBar = this._test2_top_navigationbar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_test2_top_navigationbar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VLinear m212414f0() {
        VLinear vLinear = this._test2_verification_banner;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test2_verification_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText_NoTopPadding m212415g0() {
        VText_NoTopPadding vText_NoTopPadding = this._test2_verification_banner_test2_verification_banner_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test2_verification_banner_test2_verification_banner_text");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m212416h0() {
        if (bix.m104579a()) {
            bnl0.m105524M(m212392J(), false);
        }
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m212429x(inflater, parent);
    }

    /* JADX INFO: renamed from: j0 */
    public final C21397c m212417j0(MeTabIapType type) {
        boolean zM29125v = IntlCountryCodeController.m29125v();
        int i = C21398d.f195541a[type.ordinal()];
        if (i == 1) {
            return new C21397c(dbc0.f86407Ne, zM29125v ? R$string.f19603r2 : R$string.f19787x0, R$string.f19610r9);
        }
        if (i == 2) {
            return new C21397c(zM29125v ? dbc0.f86375Me : dbc0.f86343Le, zM29125v ? R$string.f19572q2 : R$string.f19755w, R$string.f19366jd);
        }
        if (i == 3) {
            return new C21397c(dbc0.f86279Je, R$string.f18666M9, R$string.f18696N9);
        }
        if (i == 4) {
            return new C21397c(dbc0.f86311Ke, R$string.f18763Pg, R$string.f19617rg);
        }
        nbr.m162172a();
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m212418l0() {
        m212399Q().animate().cancel();
        m212399Q().setScaleX(1.0f);
        m212399Q().setScaleY(1.0f);
        m212399Q().animate().scaleX(1.08f).scaleY(1.08f).setDuration(160L).withEndAction(new Runnable() { // from class: l.inx
            @Override // java.lang.Runnable
            public final void run() {
                xnx.m212379v(this.f116011a);
            }
        }).start();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m212419m0(@NotNull Picture.ImageUri uri) {
        uri.getClass();
        m212394L().setImageUrl(uri.formatted());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m212420n0() {
        for (MeTabIapType meTabIapType : gix.m130388b()) {
            C21396b c21396b = this.iapItemViewsMap.get(meTabIapType);
            if (c21396b != null) {
                if (meTabIapType == MeTabIapType.INSTANT_MATCH) {
                    m212422p0(c21396b);
                } else {
                    m212421o0(c21396b, meTabIapType);
                }
            }
        }
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: o */
    public boolean mo44445o() {
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m212421o0(C21396b views, MeTabIapType type) {
        if (gix.m130390e(type)) {
            views.getCountBadge().setVisibility(0);
            views.getCountBadge().setText("∞");
            m212382B(views.getCountBadge(), type);
            VText_NoTopPadding unlockText = views.getUnlockText();
            if (unlockText != null) {
                unlockText.setVisibility(8);
            }
            VImage arrow = views.getArrow();
            if (arrow != null) {
                arrow.setVisibility(0);
                return;
            }
            return;
        }
        int iM130387a = gix.m130387a(type);
        if (iM130387a <= 0) {
            views.getCountBadge().setVisibility(8);
            VImage arrow2 = views.getArrow();
            if (arrow2 != null) {
                arrow2.setVisibility(0);
                return;
            }
            return;
        }
        views.getCountBadge().setVisibility(0);
        views.getCountBadge().setText(znx.m220679b(iM130387a, 0, 2, null));
        m212382B(views.getCountBadge(), type);
        VImage arrow3 = views.getArrow();
        if (arrow3 != null) {
            arrow3.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m212422p0(C21396b views) {
        if (gix.m130389c()) {
            views.getCountBadge().setVisibility(8);
            VImage lockBadge = views.getLockBadge();
            if (lockBadge != null) {
                lockBadge.setVisibility(0);
            }
            VText_NoTopPadding unlockText = views.getUnlockText();
            if (unlockText != null) {
                unlockText.setVisibility(0);
            }
            VImage arrow = views.getArrow();
            if (arrow != null) {
                arrow.setVisibility(8);
                return;
            }
            return;
        }
        VImage lockBadge2 = views.getLockBadge();
        if (lockBadge2 != null) {
            lockBadge2.setVisibility(8);
        }
        VText_NoTopPadding unlockText2 = views.getUnlockText();
        if (unlockText2 != null) {
            unlockText2.setVisibility(8);
        }
        VImage arrow2 = views.getArrow();
        if (arrow2 != null) {
            arrow2.setVisibility(0);
        }
        MeTabIapType meTabIapType = MeTabIapType.INSTANT_MATCH;
        if (gix.m130390e(meTabIapType)) {
            views.getCountBadge().setVisibility(0);
            views.getCountBadge().setText("∞");
            m212382B(views.getCountBadge(), meTabIapType);
            return;
        }
        int iM130391f = gix.m130391f(meTabIapType);
        if (iM130391f <= 0) {
            views.getCountBadge().setVisibility(8);
            return;
        }
        views.getCountBadge().setVisibility(0);
        views.getCountBadge().setText(znx.m220679b(iM130391f, 0, 2, null));
        m212382B(views.getCountBadge(), meTabIapType);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m212423q0(@NotNull List<PurchaseType> purchaseTypes, boolean force) {
        purchaseTypes.getClass();
        bnl0.m105524M(m212403U(), !jyb.m147479J(purchaseTypes));
        m212403U().m44298d(this.frag, purchaseTypes, force);
        this.intlMeTabDiscountEntryHost.m219359d();
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: r */
    public void mo44452r() {
        bnl0.m105542Z(m212413e0());
        m212413e0().setBackgroundColor(App.f16088e.getColor(R.color.white));
        m212413e0().setTitle((CharSequence) null);
        m212413e0().m224835z(m212359G());
        m212413e0().m224835z(m212358F());
        m212356A();
        m212357A0();
        m212415g0().setTypeface(Typeface.defaultFromStyle(1));
        m212386E();
        m212370k0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m212424r0(@Nullable IntlTabMePayGuide guide) {
        this.lastRenewGuide = guide;
        if (bix.m104579a()) {
            bnl0.m105524M(m212392J(), false);
        } else {
            iix.INSTANCE.m140169a(m212392J(), guide, getAct(), new Function0() { // from class: l.mnx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return xnx.m212363d(this.f137741a);
                }
            }, new Function1() { // from class: l.nnx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return xnx.m212373n(this.f142898a, (ProfilePrivilegePayGuide) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m212425t0(long likesYou, long likesSent, long visitors, long seeBadgeCount, boolean showVisitorDot) {
        m212409a0().setText(znx.m220681d(likesYou));
        m212406X().setText(znx.m220680c(likesSent));
        m212411c0().setText(znx.m220682e(visitors));
        m212377s0(seeBadgeCount);
        bnl0.m105524M(m212412d0(), showVisitorDot);
        m212381y0(m212409a0(), m212408Z());
        m212381y0(m212411c0(), m212412d0());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m212426u0(@NotNull User user) {
        user.getClass();
        MeTabRevampSubscriptionStyle meTabRevampSubscriptionStyle = MeTabRevampSubscriptionStyle.INSTANCE;
        meTabRevampSubscriptionStyle.m44322a(m212399Q(), m212400R(), m212401S(), user);
        m212401S().setText(App.f16088e.getString(R$string.f19057Za));
        meTabRevampSubscriptionStyle.m44323b(user);
        bnl0.m105509E0(m212399Q(), new View.OnClickListener() { // from class: l.gnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212371l(this.f105171a, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m212427v0(@NotNull User user) {
        user.getClass();
        bnl0.m105515H0(m212396N(), user.name);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m212428w0(@NotNull User user) {
        user.getClass();
        boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
        m212397O().setImageResource(dbc0.f86103Du);
        if (zIsPicVerificationVerified) {
            m212397O().clearColorFilter();
            m212397O().setAlpha(1.0f);
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            m212397O().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            m212397O().setAlpha(1.0f);
        }
        m212414f0().setVisibility(zIsPicVerificationVerified ? 8 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final View m212429x(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM216958b = ynx.m216958b(this, inflater, parent);
        viewM216958b.getClass();
        return viewM216958b;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m212430x0() {
        String strM99234a = aox.m99234a();
        VText_NoTopPadding vText_NoTopPadding = this.navWalletText;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(strM99234a);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m212431y() {
        ynx.m216959c(this);
    }

    /* JADX INFO: renamed from: z */
    public final C21396b m212432z(int iconRes, int titleRes, int descRes, boolean isInstantMatch, MeTabIapType iapType, final Function0<Unit> onClick) {
        VImage vImage;
        VText_NoTopPadding vText_NoTopPadding;
        Context context = getContext();
        context.getClass();
        VLinear vLinear = new VLinear(context);
        vLinear.setOrientation(0);
        vLinear.setGravity(16);
        vLinear.setClipChildren(false);
        vLinear.setClipToPadding(false);
        m212402T().addView(vLinear, new LinearLayout.LayoutParams(-1, qa00.m175859d(72.0f)));
        bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.lnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212361b(onClick, view);
            }
        });
        VFrame vFrame = new VFrame(context);
        vLinear.addView(vFrame, new LinearLayout.LayoutParams(qa00.m175859d(52.0f), qa00.m175859d(52.0f)));
        vFrame.setClipChildren(false);
        vFrame.setClipToPadding(false);
        View view = new View(context);
        view.setBackgroundResource(dbc0.f87249ne);
        vFrame.addView(view, new FrameLayout.LayoutParams(qa00.m175859d(52.0f), qa00.m175859d(52.0f)));
        VImage vImage2 = new VImage(context);
        vImage2.setImageResource(iconRes);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        vImage2.setScaleType(scaleType);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(28.0f), qa00.m175859d(28.0f));
        layoutParams.gravity = 17;
        vFrame.addView(vImage2, layoutParams);
        if (iapType == MeTabIapType.BOOST) {
            this.boostStaticIcon = vImage2;
            SVGAnimationView sVGAnimationView = new SVGAnimationView(context, null, 0, 0, 14, null);
            sVGAnimationView.setVisibility(8);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(qa00.m175859d(40.0f), qa00.m175859d(40.0f));
            layoutParams2.gravity = 17;
            vFrame.addView(sVGAnimationView, layoutParams2);
            this.boostSvga = sVGAnimationView;
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/e75c2718-a663-4b43-b675-12b67f54c98d.svga").repeatCount(0).into(sVGAnimationView);
        }
        VText_NoTopPadding vText_NoTopPadding2 = new VText_NoTopPadding(context);
        vText_NoTopPadding2.setVisibility(8);
        vText_NoTopPadding2.setGravity(17);
        vText_NoTopPadding2.setIncludeFontPadding(false);
        vText_NoTopPadding2.setTextSize(12.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText_NoTopPadding2.setTypeface(typeface);
        vText_NoTopPadding2.setTextColor(App.f16088e.getColor(c9c0.f80407c2));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, qa00.m175859d(14.0f));
        layoutParams3.gravity = BadgeDrawable.TOP_END;
        layoutParams3.topMargin = qa00.m175859d(0.0f);
        layoutParams3.rightMargin = qa00.m175859d(-2.0f);
        vText_NoTopPadding2.setMinWidth(qa00.m175859d(14.0f));
        vText_NoTopPadding2.setPadding(qa00.m175859d(3.0f), 0, qa00.m175859d(3.0f), 0);
        vFrame.addView(vText_NoTopPadding2, layoutParams3);
        if (isInstantMatch) {
            vImage = new VImage(context);
            vImage.setVisibility(8);
            vImage.setImageResource(dbc0.f87282oe);
            vImage.setScaleType(scaleType);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(qa00.m175859d(20.0f), qa00.m175859d(20.0f));
            layoutParams4.gravity = BadgeDrawable.TOP_END;
            layoutParams4.topMargin = qa00.m175859d(0.0f);
            layoutParams4.rightMargin = qa00.m175859d(-4.0f);
            vFrame.addView(vImage, layoutParams4);
        } else {
            vImage = null;
        }
        VLinear vLinear2 = new VLinear(context);
        vLinear2.setOrientation(1);
        vLinear2.setGravity(16);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams5.leftMargin = qa00.f156323j;
        vLinear.addView(vLinear2, layoutParams5);
        VText_NoTopPadding vText_NoTopPadding3 = new VText_NoTopPadding(context);
        vText_NoTopPadding3.setText(App.f16088e.getString(titleRes));
        vText_NoTopPadding3.setTextSize(15.0f);
        vText_NoTopPadding3.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        vText_NoTopPadding3.setTypeface(lyh0.m156283c(3));
        vText_NoTopPadding3.setMaxLines(1);
        vLinear2.addView(vText_NoTopPadding3, new LinearLayout.LayoutParams(-1, -2));
        VText_NoTopPadding vText_NoTopPadding4 = new VText_NoTopPadding(context);
        vText_NoTopPadding4.setText(App.f16088e.getString(descRes));
        vText_NoTopPadding4.setTextSize(13.0f);
        vText_NoTopPadding4.setTextColor(1291845632);
        vText_NoTopPadding4.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = qa00.m175859d(3.0f);
        vLinear2.addView(vText_NoTopPadding4, layoutParams6);
        if (isInstantMatch) {
            vText_NoTopPadding = new VText_NoTopPadding(context);
            vText_NoTopPadding.setText(App.f16088e.getString(R$string.f18675Mi));
            vText_NoTopPadding.setTextSize(13.0f);
            vText_NoTopPadding.setTextColor(-2144769);
            vText_NoTopPadding.setTypeface(typeface);
            vText_NoTopPadding.setGravity(17);
            vText_NoTopPadding.setVisibility(8);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams7.rightMargin = qa00.f156318e;
            vLinear.addView(vText_NoTopPadding, layoutParams7);
        } else {
            vText_NoTopPadding = null;
        }
        VImage vImage3 = new VImage(context);
        vImage3.setImageResource(dbc0.f86247Ie);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        layoutParams8.rightMargin = qa00.f156318e;
        vLinear.addView(vImage3, layoutParams8);
        return new C21396b(vLinear, vText_NoTopPadding2, vImage, vText_NoTopPadding, vImage3);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m212433z0() {
        bnl0.m105509E0(m212393K(), new View.OnClickListener() { // from class: l.knx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xnx.m212362c(this.f127653a, view);
            }
        });
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: x2 */
    public void mo44466x2() {
    }
}
