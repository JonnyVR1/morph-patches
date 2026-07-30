package p153l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.core.view.ViewGroupKt;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.badge.BadgeDrawable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.HideAndSeekBannerData;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.LuckyTtConfig;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RiskSelfData;
import com.p051p1.mobile.putong.core.map.IntlHideAndSeekAct;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p051p1.mobile.putong.core.newui.main.C8247a;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p051p1.mobile.putong.core.newui.profile.ProfileItem;
import com.p051p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import com.p051p1.mobile.putong.core.newui.profile.newme.ProfilePrivilegePayGuide;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsAct;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlLikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksAct;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinAct;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.Notification;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 è\u00022\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0095\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0019\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J/\u0010.\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001fH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020)H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0002¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00101J\u0017\u00104\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020)H\u0002¢\u0006\u0004\b7\u00101J\u000f\u00108\u001a\u00020)H\u0002¢\u0006\u0004\b8\u00101J\u0017\u0010:\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000fH\u0016¢\u0006\u0004\bB\u0010\u0013J!\u0010C\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bC\u0010AJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0013J\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010\u0013J\u000f\u0010F\u001a\u000209H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u0002H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u0013J\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u000f¢\u0006\u0004\bO\u0010\u0013J\u0015\u0010P\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\u000f2\b\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u000f¢\u0006\u0004\bV\u0010\u0013J\r\u0010W\u001a\u00020\u000f¢\u0006\u0004\bW\u0010\u0013J\u0015\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020\u0015¢\u0006\u0004\bY\u0010ZJ\u0015\u0010\\\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020%¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b^\u0010QJ\u0015\u0010_\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b_\u0010QJ\u0015\u0010`\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b`\u0010QJ\u0015\u0010b\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\u0015¢\u0006\u0004\bb\u0010ZJ\r\u0010c\u001a\u000209¢\u0006\u0004\bc\u0010GJ\u0015\u0010d\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bd\u0010QJ\u0015\u0010e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\be\u0010QJ#\u0010i\u001a\u00020\u000f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\n2\u0006\u0010h\u001a\u000209¢\u0006\u0004\bi\u0010jJ\u0015\u0010l\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\u001f¢\u0006\u0004\bl\u0010\"J!\u0010p\u001a\u00020\u000f2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\r0m¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\u000f¢\u0006\u0004\br\u0010\u0013J\u0015\u0010s\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bs\u0010QJ\u001d\u0010u\u001a\u00020\u000f2\u000e\u0010t\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\n¢\u0006\u0004\bu\u0010vJ\r\u0010w\u001a\u00020\u000f¢\u0006\u0004\bw\u0010\u0013J\u0015\u0010y\u001a\u00020\u000f2\u0006\u0010x\u001a\u00020\u001f¢\u0006\u0004\by\u0010\"J\u0015\u0010z\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bz\u0010;J\r\u0010{\u001a\u00020\u000f¢\u0006\u0004\b{\u0010\u0013J\r\u0010|\u001a\u00020\u000f¢\u0006\u0004\b|\u0010\u0013J\r\u0010}\u001a\u00020\u000f¢\u0006\u0004\b}\u0010\u0013J\u0015\u0010~\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0015¢\u0006\u0004\b~\u0010ZJ\u0017\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020\u0015¢\u0006\u0005\b\u0080\u0001\u0010ZJ\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u000209¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0017\u0010\u0084\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020\u0015¢\u0006\u0005\b\u0084\u0001\u0010ZJ\u001a\u0010\u0087\u0001\u001a\u00020\u000f2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\"\u0010\u008a\u0001\u001a\u00020\u000f2\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u0081\u0001\u001a\u000209¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u000f\u0010\u008c\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008c\u0001\u0010\u0013J\u001c\u0010\u008f\u0001\u001a\u00020\u000f2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u000f2\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R*\u0010¸\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010À\u0001\u001a\u00030¹\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R*\u0010È\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R*\u0010Ì\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ã\u0001\u001a\u0006\bÊ\u0001\u0010Å\u0001\"\u0006\bË\u0001\u0010Ç\u0001R*\u0010Ð\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Ã\u0001\u001a\u0006\bÎ\u0001\u0010Å\u0001\"\u0006\bÏ\u0001\u0010Ç\u0001R*\u0010Ø\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R*\u0010à\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R*\u0010ä\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bá\u0001\u0010Û\u0001\u001a\u0006\bâ\u0001\u0010Ý\u0001\"\u0006\bã\u0001\u0010ß\u0001R*\u0010è\u0001\u001a\u00030¹\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bå\u0001\u0010»\u0001\u001a\u0006\bæ\u0001\u0010½\u0001\"\u0006\bç\u0001\u0010¿\u0001R*\u0010ì\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bé\u0001\u0010³\u0001\u001a\u0006\bê\u0001\u0010µ\u0001\"\u0006\bë\u0001\u0010·\u0001R)\u0010ï\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bF\u0010Ã\u0001\u001a\u0006\bí\u0001\u0010Å\u0001\"\u0006\bî\u0001\u0010Ç\u0001R*\u0010ó\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bð\u0001\u0010Ó\u0001\u001a\u0006\bñ\u0001\u0010Õ\u0001\"\u0006\bò\u0001\u0010×\u0001R*\u0010÷\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0001\u0010Û\u0001\u001a\u0006\bõ\u0001\u0010Ý\u0001\"\u0006\bö\u0001\u0010ß\u0001R)\u0010ú\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bB\u0010Û\u0001\u001a\u0006\bø\u0001\u0010Ý\u0001\"\u0006\bù\u0001\u0010ß\u0001R*\u0010þ\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bû\u0001\u0010Ã\u0001\u001a\u0006\bü\u0001\u0010Å\u0001\"\u0006\bý\u0001\u0010Ç\u0001R*\u0010\u0086\u0002\u001a\u00030ÿ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R*\u0010\u008e\u0002\u001a\u00030\u0087\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R*\u0010\u0092\u0002\u001a\u00030¹\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010»\u0001\u001a\u0006\b\u0090\u0002\u0010½\u0001\"\u0006\b\u0091\u0002\u0010¿\u0001R*\u0010\u0096\u0002\u001a\u00030Ù\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010Û\u0001\u001a\u0006\b\u0094\u0002\u0010Ý\u0001\"\u0006\b\u0095\u0002\u0010ß\u0001R*\u0010\u009a\u0002\u001a\u00030Á\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010Ã\u0001\u001a\u0006\b\u0098\u0002\u0010Å\u0001\"\u0006\b\u0099\u0002\u0010Ç\u0001R*\u0010\u009e\u0002\u001a\u00030Ñ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010Ó\u0001\u001a\u0006\b\u009c\u0002\u0010Õ\u0001\"\u0006\b\u009d\u0002\u0010×\u0001R*\u0010¦\u0002\u001a\u00030\u009f\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0002\u0010¡\u0002\u001a\u0006\b¢\u0002\u0010£\u0002\"\u0006\b¤\u0002\u0010¥\u0002R*\u0010®\u0002\u001a\u00030§\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¨\u0002\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010\u00ad\u0002R*\u0010²\u0002\u001a\u00030Ñ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0002\u0010Ó\u0001\u001a\u0006\b°\u0002\u0010Õ\u0001\"\u0006\b±\u0002\u0010×\u0001R*\u0010¶\u0002\u001a\u00030Á\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b³\u0002\u0010Ã\u0001\u001a\u0006\b´\u0002\u0010Å\u0001\"\u0006\bµ\u0002\u0010Ç\u0001R*\u0010º\u0002\u001a\u00030±\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b·\u0002\u0010³\u0001\u001a\u0006\b¸\u0002\u0010µ\u0001\"\u0006\b¹\u0002\u0010·\u0001R\u0018\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b»\u0002\u0010¼\u0002R\u001f\u0010À\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b½\u0002\u0010¾\u0002\u001a\u0005\b¿\u0002\u00101R\u001f\u0010Ã\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÁ\u0002\u0010¾\u0002\u001a\u0005\bÂ\u0002\u00101R\u001f\u0010Æ\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÄ\u0002\u0010¾\u0002\u001a\u0005\bÅ\u0002\u00101R\u001f\u0010É\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÇ\u0002\u0010¾\u0002\u001a\u0005\bÈ\u0002\u00101R\u001f\u0010Ì\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÊ\u0002\u0010¾\u0002\u001a\u0005\bË\u0002\u00101R\u001e\u0010Î\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b@\u0010¾\u0002\u001a\u0005\bÍ\u0002\u00101R\u001e\u0010Ð\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u001d\u0010¾\u0002\u001a\u0005\bÏ\u0002\u00101R\u0019\u0010Ò\u0002\u001a\u00030Ñ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010Ê\u0002R\u001b\u0010Õ\u0002\u001a\u0005\u0018\u00010Ó\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010Ô\u0002R\u0018\u0010Ö\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010Ô\u0001R\u0019\u0010Ø\u0002\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0017\u0010×\u0002R\u0019\u0010Û\u0002\u001a\u00030Ù\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0012\u0010Ú\u0002R\u001b\u0010Ý\u0002\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010Ü\u0002R\u001d\u0010â\u0002\u001a\u00030Þ\u00028\u0006¢\u0006\u0010\n\u0006\bß\u0002\u0010à\u0002\u001a\u0006\bß\u0002\u0010á\u0002R\u001c\u0010å\u0002\u001a\u0005\u0018\u00010ã\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010ä\u0002R\u001c\u0010æ\u0002\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0002\u0010Ó\u0001R\u001c\u0010ç\u0002\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010Ó\u0001¨\u0006é\u0002"}, m88121d2 = {"Ll/xp30;", "Ll/v1b0;", "Ll/so30;", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;)V", "Landroid/view/View;", "E0", "()Landroid/view/View;", "", "Lcom/p1/mobile/putong/core/data/Item;", FirebaseAnalytics.Param.ITEMS, "Lcom/p1/mobile/putong/data/User;", "user", "", "n1", "(Ljava/util/List;Lcom/p1/mobile/putong/data/User;)V", "Q", "()V", "L0", "", AuthenticationTokenClaims.JSON_KEY_NAME, "P", "(Ljava/lang/String;Lcom/p1/mobile/putong/data/User;)V", "M0", "f1", "Lcom/p1/mobile/putong/data/PhoneNumber;", "phoneNumber", "L", "(Lcom/p1/mobile/putong/data/PhoneNumber;)V", "", "size", "J0", "(I)V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "image", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "url", "N", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;)V", "Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", Item.TYPE, "icon", "title", "subTitle", "y0", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;III)V", "B0", "()Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", "x0", "H0", "A0", "(Lcom/p1/mobile/putong/data/User;)Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", "z0", "G0", "I0", "", "w0", "(Lcom/p1/mobile/putong/data/User;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "K", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "inflateView", "D1", "x2", "o", "()Z", "presenter", "M", "(Ll/so30;)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "e1", "Z0", "(Lcom/p1/mobile/putong/data/User;)V", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "intlTabMePayGuide", "Q0", "(Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;)V", "v0", "m1", "publicId", "X0", "(Ljava/lang/String;)V", "uri", "O0", "(Lcom/p1/mobile/putong/data/Picture$ImageUri;)V", "q1", "d1", "a1", "coin", "R0", "K0", "D0", "t1", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "force", "V0", "(Ljava/util/List;Z)V", "position", BloodType.f39576O, "Ll/pf60;", "Lcom/p1/mobile/putong/core/data/AppealInfo;", "pair", "P0", "(Ll/pf60;)V", "r1", "s1", "avatars", "W0", "(Ljava/util/List;)V", "y1", "count", "g1", "k1", "u0", "v1", "u1", "w1", "time", "p1", "show", "h1", "(Z)V", "l1", "Landroid/content/Intent;", "intent", "o1", "(Landroid/content/Intent;)V", "which", "j1", "(IZ)V", "S0", "Lcom/p1/mobile/putong/core/data/HideAndSeekBannerData;", "data", "T0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekBannerData;)V", "Lcom/p1/mobile/putong/core/data/RiskSelfData;", "risk", "U0", "(Lcom/p1/mobile/putong/core/data/RiskSelfData;)V", "a", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "Lv/VRelative;", "b", "Lv/VRelative;", "get_new_tab_me", "()Lv/VRelative;", "set_new_tab_me", "(Lv/VRelative;)V", "_new_tab_me", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "q0", "()Lv/navigationbar/VNavigationBar;", "set_top_navigationbar", "(Lv/navigationbar/VNavigationBar;)V", "_top_navigationbar", "Landroid/widget/ScrollView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ScrollView;", "get_content_view", "()Landroid/widget/ScrollView;", "set_content_view", "(Landroid/widget/ScrollView;)V", "_content_view", "Lv/VLinear;", "e", "Lv/VLinear;", "o0", "()Lv/VLinear;", "set_new_me_linear", "(Lv/VLinear;)V", "_new_me_linear", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "g0", "()Landroid/widget/LinearLayout;", "set_intr_risk_banner", "(Landroid/widget/LinearLayout;)V", "_intr_risk_banner", "Lv/VText;", "g", "Lv/VText;", "h0", "()Lv/VText;", "set_intr_risk_banner_content", "(Lv/VText;)V", "_intr_risk_banner_content", "h", "a0", "set_ban_release_entrance", "_ban_release_entrance", RXScreenCaptureService.KEY_INDEX, "c0", "set_fake_tip", "_fake_tip", "Lv/VDraweeView;", "j", "Lv/VDraweeView;", "Z", "()Lv/VDraweeView;", "set_background_avatar", "(Lv/VDraweeView;)V", "_background_avatar", "Lv/VImage;", "k", "Lv/VImage;", "j0", "()Lv/VImage;", "set_iv_edit", "(Lv/VImage;)V", "_iv_edit", BLiveStormDanmakuGiftResourceType.f45292l, "k0", "set_iv_edit_red_dot", "_iv_edit_red_dot", "m", "get_user_desc_container", "set_user_desc_container", "_user_desc_container", "n", "get_name_container", "set_name_container", "_name_container", "m0", "set_name_container_tv_name", "_name_container_tv_name", "p", "get_name_container_emoji", "set_name_container_emoji", "_name_container_emoji", "q", "n0", "set_name_container_verification_icon", "_name_container_verification_icon", "l0", "set_name_container_img_vip", "_name_container_img_vip", BLiveStormDanmakuGiftResourceType.f45294s, "e0", "set_id", "_id", "Lv/VButton;", Constants.KEY_T, "Lv/VButton;", "b0", "()Lv/VButton;", "set_bt_id_copy", "(Lv/VButton;)V", "_bt_id_copy", "Landroid/widget/Space;", "u", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", ResourceDirection.f39656v, "r0", "set_wallet_layout", "_wallet_layout", "w", "get_wallet_layout_wallet_icon", "set_wallet_layout_wallet_icon", "_wallet_layout_wallet_icon", BaseSei.f14624X, "t0", "set_wallet_layout_wallet_coin", "_wallet_layout_wallet_coin", BaseSei.f14625Y, "s0", "set_wallet_layout_luckytantan", "_wallet_layout_luckytantan", "Landroid/view/ViewStub;", BaseSei.f14626Z, "Landroid/view/ViewStub;", "f0", "()Landroid/view/ViewStub;", "set_intl_pay_guide", "(Landroid/view/ViewStub;)V", "_intl_pay_guide", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "A", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "p0", "()Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "set_privilege_banner", "(Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;)V", "_privilege_banner", "B", "d0", "set_hide_and_seek", "_hide_and_seek", c4s.C_ZONE, "get_service_plu", "set_service_plu", "_service_plu", "D", "i0", "set_item_layout", "_item_layout", "E", "Ll/so30;", "F", "Lkotlin/Lazy;", p7f.GPS_MEASUREMENT_INTERRUPTED, "seeItem", "G", "R", "boostItem", "H", "X", "suerLikeItem", "I", p7f.GPS_DIRECTION_TRUE, "likeItem", "J", "U", "picksItem", "Y", "visitorItem", "W", "subscriptionItem", "", "receivedLikes", "Lv/VOnlineIndicator;", "Lv/VOnlineIndicator;", "settingDot", "visitorItemEnable", "Lcom/p1/mobile/putong/core/data/RiskSelfData;", "mRiskSelfData", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "profilePrivilegePayGuide", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "lastPayGuide", "Ll/zdo;", p7f.LATITUDE_SOUTH, "Ll/zdo;", "()Ll/zdo;", "intlMeTabDiscountEntryHost", "Ll/kcg0;", "Ll/kcg0;", "createSub", "seeTwo", "seeOne", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xp30 implements v1b0<so30> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public NewProfilePrivilegedPager _privilege_banner;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VDraweeView _hide_and_seek;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VText _service_plu;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VLinear _item_layout;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public so30 presenter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Lazy seeItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Lazy boostItem;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Lazy suerLikeItem;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final Lazy likeItem;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public final Lazy picksItem;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final Lazy visitorItem;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final Lazy subscriptionItem;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public long receivedLikes;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public VOnlineIndicator settingDot;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean visitorItemEnable;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public RiskSelfData mRiskSelfData;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ProfilePrivilegePayGuide profilePrivilegePayGuide;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public IntlTabMePayGuide lastPayGuide;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final zdo intlMeTabDiscountEntryHost;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public kcg0 createSub;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public VDraweeView seeTwo;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    public VDraweeView seeOne;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ProfileFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRelative _new_tab_me;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VNavigationBar _top_navigationbar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ScrollView _content_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _new_me_linear;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayout _intr_risk_banner;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _intr_risk_banner_content;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _ban_release_entrance;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _fake_tip;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VDraweeView _background_avatar;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _iv_edit;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _iv_edit_red_dot;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public LinearLayout _user_desc_container;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VLinear _name_container;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _name_container_tv_name;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VDraweeView _name_container_emoji;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _name_container_verification_icon;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _name_container_img_vip;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _id;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VButton _bt_id_copy;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public Space _space;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public LinearLayout _wallet_layout;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VImage _wallet_layout_wallet_icon;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VText _wallet_layout_wallet_coin;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VDraweeView _wallet_layout_luckytantan;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public ViewStub _intl_pay_guide;

    public xp30(@NotNull ProfileFrag profileFrag) {
        profileFrag.getClass();
        this.frag = profileFrag;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.seeItem = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.tp30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xp30.m212535n(this.f175553a);
            }
        });
        this.boostItem = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.up30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xp30.m212532k(this.f180214a);
            }
        });
        this.suerLikeItem = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.vp30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xp30.m212527e(this.f185210a);
            }
        });
        this.likeItem = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.wp30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xp30.m212520J(this.f190252a);
            }
        });
        this.picksItem = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.uo30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xp30.m212538s(this.f180014a);
            }
        });
        this.visitorItem = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.vo30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xp30.m212519I(this.f184992a);
            }
        });
        this.subscriptionItem = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.wo30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xp30.m212516F(this.f190009a);
            }
        });
        this.intlMeTabDiscountEntryHost = new zdo(profileFrag);
    }

    /* JADX INFO: renamed from: A */
    public static void m212512A(xp30 xp30Var, View view) {
        ge90.m129971e(xp30Var.getAct(), "MINE_SUB_ITEM", PurchaseType.TYPE_ULTRA_PREMIUM, d79.m114653L() ? new j0p() : new ful0());
    }

    /* JADX INFO: renamed from: B */
    public static Unit m212513B(xp30 xp30Var, View view) {
        view.getClass();
        Intent intentM51922q2 = ProfileAct.m51922q2(xp30Var.getAct(), uqb0.f180396b0.f170324a.userId(), "profile_frag_menu", false, true);
        intentM51922q2.putExtra("preview_type", 0);
        xp30Var.m212608o1(intentM51922q2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static void m212514C(xp30 xp30Var, View view) {
        if (a5i0.m96181x0() > 0) {
            o1j0.m165649w(R$string.f19723ut);
        } else if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || d79.m114669b0()) {
            C8927c.m54580H1(xp30Var.getAct(), "p_navigation_view,e_navigation_super_like,click", 0, null, 12, null);
        } else {
            C8927c.m54601O1(xp30Var.getAct(), "p_navigation_view,e_navigation_super_like,click", Privilege.vip_super_like, null, null, false, null, null, null, HttpStatus.GATEWAY_TIMEOUT_504, null);
        }
        box.INSTANCE.m105731t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static void m212515E(AppealInfo appealInfo, pf60 pf60Var, xp30 xp30Var, View view) {
        box.INSTANCE.m105712a();
        if (!appealInfo.allowAppeal) {
            o1j0.m165634h(R$string.f19324i0);
            return;
        }
        String str = appealInfo.status;
        int iHashCode = str.hashCode();
        if (iHashCode != -1392885889) {
            if (iHashCode == -1347010958 && str.equals("inProgress")) {
                Intent intentM37174Z1 = AppealProgressAct.m37174Z1(xp30Var.getAct());
                intentM37174Z1.getClass();
                xp30Var.m212608o1(intentM37174Z1);
                return;
            }
            return;
        }
        if (str.equals(OMSSwipeMoment.before)) {
            S s = pf60Var.f152157b;
            s.getClass();
            if (NullChecker.m82486a(((User) s).settings)) {
                S s2 = pf60Var.f152157b;
                s2.getClass();
                Settings settings = ((User) s2).settings;
                settings.getClass();
                if (NullChecker.m82487b(settings.phoneNumber)) {
                    S s3 = pf60Var.f152157b;
                    s3.getClass();
                    Settings settings2 = ((User) s3).settings;
                    settings2.getClass();
                    PhoneNumber phoneNumber = settings2.phoneNumber;
                    phoneNumber.getClass();
                    xp30Var.m212555L(phoneNumber);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static ProfileItem m212516F(xp30 xp30Var) {
        return new ProfileItem(xp30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: G */
    public static void m212517G(xp30 xp30Var, View view) {
        box.INSTANCE.m105717f();
        if (xxv.m213582i(xp30Var.getAct(), R$string.f18613Kh, new x20() { // from class: l.jp30
            @Override // p153l.x20
            public final void call() {
                xp30.m212521N0();
            }
        })) {
            Intent intentM36917Z1 = IntlHideAndSeekAct.m36917Z1(xp30Var.getAct());
            intentM36917Z1.getClass();
            xp30Var.m212608o1(intentM36917Z1);
        }
    }

    /* JADX INFO: renamed from: H */
    public static Unit m212518H(xp30 xp30Var, View view) {
        view.getClass();
        so30 so30Var = xp30Var.presenter;
        if (so30Var == null) {
            Intrinsics.m88391r("presenter");
            so30Var = null;
        }
        so30Var.m187144q2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static ProfileItem m212519I(xp30 xp30Var) {
        return new ProfileItem(xp30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: J */
    public static ProfileItem m212520J(xp30 xp30Var) {
        return new ProfileItem(xp30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m212521N0() {
        uqb0.f180370E.m80051t();
    }

    /* JADX INFO: renamed from: Y0 */
    public static final void m212522Y0(String str, View view) {
        l51.m152911q(str);
        o1j0.m165649w(R$string.f19552pd);
        box.INSTANCE.m105733v();
    }

    /* JADX INFO: renamed from: a */
    public static void m212523a(xp30 xp30Var, View view) {
        xp30Var.m212608o1(new Intent(xp30Var.getContext(), (Class<?>) TopPicksAct.class));
        box.INSTANCE.m105721j();
    }

    /* JADX INFO: renamed from: b */
    public static void m212524b(xp30 xp30Var, View view) {
        wtd0.m207833e().m207847r();
        xp30Var.m212570T().m44225h(false);
        xp30Var.m212608o1(new Intent(xp30Var.getAct(), (Class<?>) IntlLikedUsersAct.class));
    }

    /* JADX INFO: renamed from: c */
    public static void m212525c(xp30 xp30Var, View view) {
        IapAffiliatePromotion iapAffiliatePromotionM31177I3 = CoreModule.f18264c.f20438x0.m31177I3();
        Act act = xp30Var.getAct();
        if (iapAffiliatePromotionM31177I3 != null && act != null) {
            m6p.m157250j(act, iapAffiliatePromotionM31177I3, "sub_management");
        }
        ge90.m129971e(xp30Var.getAct(), "MINE_SUB_ITEM", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, d79.m114653L() ? new j0p() : new ful0());
    }

    /* JADX INFO: renamed from: d */
    public static void m212526d(xp30 xp30Var, View view) {
        box.INSTANCE.m105714c();
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            b83.m102909k(xp30Var.getAct());
        } else {
            ma3.Companion.m157627h(ma3.INSTANCE, xp30Var.getAct(), false, null, false, null, 24, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ProfileItem m212527e(xp30 xp30Var) {
        return new ProfileItem(xp30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: f1 */
    private final void m212529f1() {
        bnl0.m105515H0(m212586c0(), k3g.m148016a() ? CoreModule.m30934Q().mo68468sj() : this.frag.getString(R$string.f19791x4));
    }

    /* JADX INFO: renamed from: i */
    public static void m212530i(xp30 xp30Var, View view) {
        so30 so30Var = xp30Var.presenter;
        if (so30Var == null) {
            Intrinsics.m88391r("presenter");
            so30Var = null;
        }
        so30Var.m187145r2();
    }

    /* JADX INFO: renamed from: j */
    public static void m212531j(Throwable th) {
        CrashHelper.m82479c(th);
    }

    /* JADX INFO: renamed from: k */
    public static ProfileItem m212532k(xp30 xp30Var) {
        return new ProfileItem(xp30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: l */
    public static void m212533l(xp30 xp30Var, View view) {
        box.INSTANCE.m105734w();
        xp30Var.m212608o1(new Intent(xp30Var.getContext(), (Class<?>) IntlVisitorsAct.class));
    }

    /* JADX INFO: renamed from: m */
    public static void m212534m(Ref.IntRef intRef, List list, xp30 xp30Var, User user, Notification notification) {
        if (intRef.element >= list.size()) {
            xp30Var.m212564Q();
            return;
        }
        int i = intRef.element;
        intRef.element = i + 1;
        String str = ((Item) list.get(i)).name;
        str.getClass();
        xp30Var.m212562P(str, user);
        if (intRef.element == list.size()) {
            xp30Var.m212556L0();
            xp30Var.m212564Q();
        }
    }

    /* JADX INFO: renamed from: n */
    public static ProfileItem m212535n(xp30 xp30Var) {
        return new ProfileItem(xp30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: p */
    public static void m212536p(xp30 xp30Var, View view) {
        wtd0.m207833e().m207843n();
        so30 so30Var = xp30Var.presenter;
        if (so30Var == null) {
            Intrinsics.m88391r("presenter");
            so30Var = null;
        }
        so30Var.m187147t2();
    }

    /* JADX INFO: renamed from: q */
    public static void m212537q(xp30 xp30Var, View view) {
        bnl0.m105524M(xp30Var.m212615s0(), false);
        CoreModule.f18264c.f20396j0.f20033d0.put(Boolean.TRUE);
        Intent intentM59260Y1 = TanTanCoinAct.m59260Y1(xp30Var.getAct());
        intentM59260Y1.getClass();
        xp30Var.m212608o1(intentM59260Y1);
    }

    /* JADX INFO: renamed from: s */
    public static ProfileItem m212538s(xp30 xp30Var) {
        return new ProfileItem(xp30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: u */
    public static void m212539u(xp30 xp30Var, View view) {
        ge90.m129971e(xp30Var.getAct(), "MINE_SUB_ITEM", null, d79.m114653L() ? new j0p() : new ful0());
    }

    /* JADX INFO: renamed from: w */
    public static void m212541w(xp30 xp30Var, View view) {
        yyh0.INSTANCE.m217995k(xp30Var.frag);
        box.INSTANCE.m105723l();
    }

    /* JADX INFO: renamed from: x */
    public static void m212542x(xp30 xp30Var, View view) {
        C8247a c8247aM40805Z5;
        xib0 j0pVar = d79.m114653L() ? new j0p() : new ful0();
        if (CoreModule.f18264c.f20311G2.m153652j3()) {
            CoreModule.f18264c.f20311G2.m153660r3();
            Act act = xp30Var.frag.act();
            NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
            if (newMainAct != null && (c8247aM40805Z5 = newMainAct.m40805Z5()) != null) {
                c8247aM40805Z5.m41261A9();
            }
        }
        ge90.m129971e(xp30Var.getAct(), "MINE_SUB_ITEM", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, j0pVar);
    }

    /* JADX INFO: renamed from: y */
    public static void m212543y(xp30 xp30Var, View view) {
        so30 so30Var = xp30Var.presenter;
        if (so30Var == null) {
            Intrinsics.m88391r("presenter");
            so30Var = null;
        }
        so30Var.m187146s2();
    }

    /* JADX INFO: renamed from: z */
    public static void m212544z(xp30 xp30Var, RiskSelfData riskSelfData, View view) {
        qyp.m178723i().m178730o(xp30Var.getAct(), riskSelfData.type, riskSelfData.popUpText);
        i4g0.m138523u("e_navigation_risk_user_warning", OMSDialogPositon.p_navigation_view, jyb.m147494Y("user_risk_type", riskSelfData.type));
    }

    /* JADX INFO: renamed from: A0 */
    public final ProfileItem m212545A0(User user) {
        m212626y0(m212572U(), dbc0.f86025Bg, R$string.f18668Mb, R$string.f19211eb);
        bnl0.m105509E0(m212572U(), new View.OnClickListener() { // from class: l.ap30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212523a(this.f72686a, view);
            }
        });
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        userM116600p9.getClass();
        if (m212623w0(userM116600p9)) {
            box.INSTANCE.m105722k();
        }
        ProfileItem profileItemM212572U = m212572U();
        User userM116600p10 = CoreModule.f18264c.f20381e0.m116600p9();
        userM116600p10.getClass();
        bnl0.m105524M(profileItemM212572U, m212623w0(userM116600p10));
        return m212572U();
    }

    /* JADX INFO: renamed from: B0 */
    public final ProfileItem m212546B0() {
        m212626y0(m212574V(), dbc0.f86057Cg, R$string.f18680Mn, 0);
        m212574V().f27213c.setMaxLines(2);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        userM116600p9.getClass();
        m212616s1(userM116600p9);
        bnl0.m105509E0(m212574V(), new View.OnClickListener() { // from class: l.xo30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212530i(this.f195554a, view);
            }
        });
        return m212574V();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m212547D0(@NotNull User user) {
        user.getClass();
        if (m212596i0().getChildCount() != 0) {
            return;
        }
        List<Item> listM217991g = yyh0.INSTANCE.m217991g();
        if (c6p.INSTANCE.m108175e()) {
            m212606n1(listM217991g, user);
            return;
        }
        Iterator<Item> it = listM217991g.iterator();
        while (it.hasNext()) {
            String str = it.next().name;
            str.getClass();
            m212562P(str, user);
        }
        m212556L0();
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: D1 */
    public void mo44371D1() {
        ProfilePrivilegePayGuide profilePrivilegePayGuide = this.profilePrivilegePayGuide;
        if (profilePrivilegePayGuide != null) {
            ProfilePrivilegePayGuide profilePrivilegePayGuide2 = null;
            if (profilePrivilegePayGuide == null) {
                Intrinsics.m88391r("profilePrivilegePayGuide");
                profilePrivilegePayGuide = null;
            }
            if (bnl0.m105529O0(profilePrivilegePayGuide)) {
                ProfilePrivilegePayGuide profilePrivilegePayGuide3 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide3 == null) {
                    Intrinsics.m88391r("profilePrivilegePayGuide");
                } else {
                    profilePrivilegePayGuide2 = profilePrivilegePayGuide3;
                }
                profilePrivilegePayGuide2.m44308n0("");
            }
        }
        CoreModule.f18264c.f20396j0.m31608Q5();
        this.intlMeTabDiscountEntryHost.m219358c();
    }

    /* JADX INFO: renamed from: E0 */
    public final View m212548E0() {
        VImage vImage = new VImage(getContext());
        vImage.setImageResource(dbc0.f86218Hh);
        VFrame vFrame = new VFrame(getContext());
        vFrame.addView(vImage, new FrameLayout.LayoutParams(qa00.m175859d(32.0f), qa00.m175859d(32.0f)));
        int i = qa00.f156323j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        VOnlineIndicator vOnlineIndicator = new VOnlineIndicator(getContext());
        this.settingDot = vOnlineIndicator;
        vOnlineIndicator.setIndicatorStyle(1);
        VOnlineIndicator vOnlineIndicator2 = this.settingDot;
        if (vOnlineIndicator2 != null) {
            vOnlineIndicator2.setVisibility(8);
        }
        vFrame.setPadding(20, 4, 8, 4);
        vFrame.addView(this.settingDot, layoutParams);
        bnl0.m105509E0(vFrame, new View.OnClickListener() { // from class: l.to30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212536p(this.f175356a, view);
            }
        });
        return vFrame;
    }

    /* JADX INFO: renamed from: G0 */
    public final ProfileItem m212549G0() {
        m212626y0(m212576W(), dbc0.f86089Dg, R$string.f19119bb, R$string.f18335Bi);
        bnl0.m105540X(m212576W().f27213c, 0);
        bnl0.m105524M(m212576W().f27214d, false);
        m212620u1();
        return m212576W();
    }

    /* JADX INFO: renamed from: H0 */
    public final ProfileItem m212550H0() {
        m212626y0(m212578X(), dbc0.f86121Eg, R$string.f19755w, R$string.f19242fb);
        bnl0.m105509E0(m212578X(), new View.OnClickListener() { // from class: l.cp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212514C(this.f82960a, view);
            }
        });
        box.INSTANCE.m105732u();
        return m212578X();
    }

    /* JADX INFO: renamed from: I0 */
    public final ProfileItem m212551I0() {
        m212626y0(m212580Y(), dbc0.f86153Fg, R$string.f19089ac, R$string.f19058Zb);
        bnl0.m105509E0(m212580Y(), new View.OnClickListener() { // from class: l.op30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212533l(this.f148413a, view);
            }
        });
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        userM116600p9.getClass();
        if (m212623w0(userM116600p9)) {
            this.visitorItemEnable = true;
        }
        bnl0.m105524M(m212580Y(), m212623w0(userM116600p9));
        return m212580Y();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m212552J0(int size) {
        if (size == 0) {
            return;
        }
        if (this.seeTwo == null) {
            this.seeTwo = (VDraweeView) m212574V().f27223m.inflate();
        }
        if (size <= 1 || this.seeOne != null) {
            return;
        }
        this.seeOne = (VDraweeView) m212574V().f27222l.inflate();
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m212553K(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM216997b = yp30.m216997b(this, inflater, parent);
        viewM216997b.getClass();
        return viewM216997b;
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m212554K0() {
        return this.frag.isHidden();
    }

    /* JADX INFO: renamed from: L */
    public final void m212555L(PhoneNumber phoneNumber) {
        Intent intentBuildBanReleaseVerifyIntent = CoreModule.m30929H().buildBanReleaseVerifyIntent(getAct(), phoneNumber);
        intentBuildBanReleaseVerifyIntent.getClass();
        m212608o1(intentBuildBanReleaseVerifyIntent);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m212556L0() {
        View viewM1329a = ViewGroupKt.m1329a(m212596i0(), m212596i0().getChildCount() - 1);
        if (viewM1329a instanceof ProfileItem) {
            ((ProfileItem) viewM1329a).m44221d(false);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull so30 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m212558M0() {
        czq.m113347c(m212581Z(), new Function1() { // from class: l.ep30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xp30.m212518H(this.f95199a, (View) obj);
            }
        });
        czq.m113347c(m212597j0(), new Function1() { // from class: l.pp30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xp30.m212513B(this.f153481a, (View) obj);
            }
        });
        bnl0.m105509E0(m212613r0(), new View.OnClickListener() { // from class: l.qp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212537q(this.f158819a, view);
            }
        });
        bnl0.m105509E0(m212586c0(), new View.OnClickListener() { // from class: l.rp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212541w(this.f164301a, view);
            }
        });
        bnl0.m105509E0(m212587d0(), new View.OnClickListener() { // from class: l.sp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212517G(this.f170011a, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m212559N(SimpleDraweeView image, Picture.ImageUri url) {
        bnl0.m105525M0(image, true);
        if (rbb0.m180746s(null, 1, null)) {
            uqb0.f180374G.m127120O(image, url.formatted(), 3, 5);
        } else {
            uqb0.f180374G.m127115L0(image, url.formatted());
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m212560O(int position) {
        m212609p0().m44296b(position);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m212561O0(@NotNull Picture.ImageUri uri) {
        uri.getClass();
        uqb0.f180374G.m127111J0(m212581Z(), uri, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P */
    public final void m212562P(String name, User user) {
        switch (name.hashCode()) {
            case -332142190:
                if (name.equals("superlike")) {
                    m212550H0();
                    break;
                }
                break;
            case 113747:
                if (name.equals("see")) {
                    m212546B0();
                    break;
                }
                break;
            case 102974396:
                if (name.equals("likes")) {
                    m212628z0(user);
                    break;
                }
                break;
            case 106660978:
                if (name.equals("picks")) {
                    m212545A0(user);
                    break;
                }
                break;
            case 110726686:
                if (name.equals("turbo")) {
                    m212625x0();
                    break;
                }
                break;
            case 341203229:
                if (name.equals("subscription")) {
                    m212549G0();
                    break;
                }
                break;
            case 466760814:
                if (name.equals(Visitor.TYPE)) {
                    m212551I0();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m212563P0(@NotNull final pf60<AppealInfo, User> pair) {
        pair.getClass();
        final AppealInfo appealInfo = pair.f152156a;
        yc2.m215118e().m215125h(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            bnl0.m105524M(m212583a0(), false);
            return;
        }
        if (!m212554K0() && !bnl0.m105529O0(m212583a0())) {
            box.INSTANCE.m105713b();
        }
        VText vTextM212583a0 = m212583a0();
        boolean zEquals = TextUtils.equals(yc2.m215118e().m215120b(), "under_review");
        ProfileFrag profileFrag = this.frag;
        vTextM212583a0.setText(zEquals ? profileFrag.getString(R$string.f19446m0) : profileFrag.getString(R$string.f19477n0));
        bnl0.m105524M(m212583a0(), true);
        bnl0.m105509E0(m212583a0(), new View.OnClickListener() { // from class: l.dp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212515E(appealInfo, pair, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m212564Q() {
        kcg0 kcg0Var = this.createSub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        this.createSub = null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m212565Q0(@Nullable IntlTabMePayGuide intlTabMePayGuide) {
        this.lastPayGuide = intlTabMePayGuide;
        ProfilePrivilegePayGuide profilePrivilegePayGuide = null;
        if (bix.m104579a()) {
            ProfilePrivilegePayGuide profilePrivilegePayGuide2 = this.profilePrivilegePayGuide;
            if (profilePrivilegePayGuide2 != null) {
                if (profilePrivilegePayGuide2 == null) {
                    Intrinsics.m88391r("profilePrivilegePayGuide");
                } else {
                    profilePrivilegePayGuide = profilePrivilegePayGuide2;
                }
                bnl0.m105524M(profilePrivilegePayGuide, false);
            }
            this.intlMeTabDiscountEntryHost.m219359d();
            return;
        }
        if (intlTabMePayGuide != null) {
            boolean z = intlTabMePayGuide.showBanner;
            ProfilePrivilegePayGuide profilePrivilegePayGuide3 = this.profilePrivilegePayGuide;
            if (z) {
                if (profilePrivilegePayGuide3 == null) {
                    View viewInflate = m212591f0().inflate();
                    viewInflate.getClass();
                    this.profilePrivilegePayGuide = (ProfilePrivilegePayGuide) viewInflate;
                }
                ProfilePrivilegePayGuide profilePrivilegePayGuide4 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide4 == null) {
                    Intrinsics.m88391r("profilePrivilegePayGuide");
                    profilePrivilegePayGuide4 = null;
                }
                boolean zM44306l0 = profilePrivilegePayGuide4.m44306l0();
                ProfilePrivilegePayGuide profilePrivilegePayGuide5 = this.profilePrivilegePayGuide;
                if (zM44306l0) {
                    if (profilePrivilegePayGuide5 == null) {
                        Intrinsics.m88391r("profilePrivilegePayGuide");
                        profilePrivilegePayGuide5 = null;
                    }
                    bnl0.m105524M(profilePrivilegePayGuide5, true);
                    ProfilePrivilegePayGuide profilePrivilegePayGuide6 = this.profilePrivilegePayGuide;
                    if (profilePrivilegePayGuide6 == null) {
                        Intrinsics.m88391r("profilePrivilegePayGuide");
                    } else {
                        profilePrivilegePayGuide = profilePrivilegePayGuide6;
                    }
                    profilePrivilegePayGuide.m44307m0(intlTabMePayGuide, getAct());
                } else {
                    if (profilePrivilegePayGuide5 == null) {
                        Intrinsics.m88391r("profilePrivilegePayGuide");
                    } else {
                        profilePrivilegePayGuide = profilePrivilegePayGuide5;
                    }
                    bnl0.m105524M(profilePrivilegePayGuide, false);
                }
            } else if (profilePrivilegePayGuide3 != null) {
                if (profilePrivilegePayGuide3 == null) {
                    Intrinsics.m88391r("profilePrivilegePayGuide");
                    profilePrivilegePayGuide3 = null;
                }
                profilePrivilegePayGuide3.m44309o0(getAct());
                ProfilePrivilegePayGuide profilePrivilegePayGuide7 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide7 == null) {
                    Intrinsics.m88391r("profilePrivilegePayGuide");
                } else {
                    profilePrivilegePayGuide = profilePrivilegePayGuide7;
                }
                bnl0.m105524M(profilePrivilegePayGuide, false);
            }
        }
        this.intlMeTabDiscountEntryHost.m219359d();
    }

    /* JADX INFO: renamed from: R */
    public final ProfileItem m212566R() {
        return (ProfileItem) this.boostItem.getValue();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m212567R0(@NotNull String coin) {
        coin.getClass();
        bnl0.m105515H0(m212617t0(), coin);
        LuckyTtConfig luckyTtConfig = CoreModule.f18264c.f20396j0.f20038i0;
        if (!NullChecker.m82486a(luckyTtConfig) || TextUtils.isEmpty(luckyTtConfig.iconUrl) || CoreModule.f18264c.f20396j0.f20033d0.get().booleanValue()) {
            bnl0.m105524M(m212615s0(), false);
        } else {
            uqb0.f180374G.m127115L0(m212615s0(), luckyTtConfig.iconUrl);
            bnl0.m105524M(m212615s0(), true);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: S, reason: from getter */
    public final zdo getIntlMeTabDiscountEntryHost() {
        return this.intlMeTabDiscountEntryHost;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m212569S0() {
        if (CoreModule.f18264c.f20362X1.m162657p3() && NullChecker.m82486a(m212611q0())) {
            m212611q0().m224834w(dbc0.f87610yg, new View.OnClickListener() { // from class: l.np30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xp30.m212543y(this.f143069a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T */
    public final ProfileItem m212570T() {
        return (ProfileItem) this.likeItem.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m212571T0(@Nullable HideAndSeekBannerData data) {
        if (NullChecker.m82486a(m212587d0())) {
            box.INSTANCE.m105718g();
            if (data != null) {
                bnl0.m105524M(m212587d0(), data.visible);
                if (data.visible) {
                    uqb0.f180374G.m127115L0(m212587d0(), data.gameBanner);
                }
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final ProfileItem m212572U() {
        return (ProfileItem) this.picksItem.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m212573U0(@NotNull final RiskSelfData risk) {
        risk.getClass();
        this.mRiskSelfData = risk;
        if (!NullChecker.m82486a(risk) || TextUtils.isEmpty(risk.ceilText)) {
            bnl0.m105524M(m212592g0(), false);
            return;
        }
        m212594h0().setText(risk.ceilText);
        bnl0.m105524M(m212592g0(), true);
        bnl0.m105509E0(m212592g0(), new View.OnClickListener() { // from class: l.mp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212544z(this.f137868a, risk, view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final ProfileItem m212574V() {
        return (ProfileItem) this.seeItem.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m212575V0(@NotNull List<PurchaseType> purchaseTypes, boolean force) {
        int iIndexOf;
        purchaseTypes.getClass();
        List<PurchaseType> list = purchaseTypes;
        bnl0.m105524M(m212609p0(), !jyb.m147479J(list));
        if (m212609p0().m44298d(this.frag, purchaseTypes, force) && !list.isEmpty() && CoreModule.f18264c.f20438x0.m31177I3() != null && (iIndexOf = purchaseTypes.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE)) >= 0) {
            m212609p0().m44296b(iIndexOf);
        }
        this.intlMeTabDiscountEntryHost.m219359d();
    }

    /* JADX INFO: renamed from: W */
    public final ProfileItem m212576W() {
        return (ProfileItem) this.subscriptionItem.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m212577W0(@Nullable List<Picture.ImageUri> avatars) {
        if (avatars == null || jyb.m147479J(avatars)) {
            bnl0.m105539W(m212574V().f27212b, qa00.f156328o);
            VDraweeView vDraweeView = this.seeOne;
            if (vDraweeView != null) {
                bnl0.m105524M(vDraweeView, false);
            }
            VDraweeView vDraweeView2 = this.seeTwo;
            if (vDraweeView2 != null) {
                bnl0.m105524M(vDraweeView2, false);
                return;
            }
            return;
        }
        m212552J0(avatars.size());
        if (avatars.size() == 1) {
            VDraweeView vDraweeView3 = this.seeTwo;
            if (vDraweeView3 != null) {
                m212559N(vDraweeView3, avatars.get(0));
            }
            VDraweeView vDraweeView4 = this.seeOne;
            if (vDraweeView4 != null) {
                bnl0.m105524M(vDraweeView4, false);
            }
            bnl0.m105539W(m212574V().f27212b, qa00.f156333t);
            return;
        }
        if (avatars.size() > 1) {
            VDraweeView vDraweeView5 = this.seeTwo;
            if (vDraweeView5 != null) {
                m212559N(vDraweeView5, avatars.get(0));
            }
            VDraweeView vDraweeView6 = this.seeOne;
            if (vDraweeView6 != null) {
                m212559N(vDraweeView6, avatars.get(1));
            }
            bnl0.m105539W(m212574V().f27212b, qa00.f156293F);
        }
    }

    /* JADX INFO: renamed from: X */
    public final ProfileItem m212578X() {
        return (ProfileItem) this.suerLikeItem.getValue();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m212579X0(@NotNull final String publicId) {
        publicId.getClass();
        Act act = getAct();
        if (act != null) {
            bnl0.m105515H0(m212589e0(), act.getString(R$string.f19521od) + ": " + publicId);
            bnl0.m105524M(m212585b0(), true);
            bnl0.m105509E0(m212585b0(), new View.OnClickListener() { // from class: l.bp30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xp30.m212522Y0(publicId, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public final ProfileItem m212580Y() {
        return (ProfileItem) this.visitorItem.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VDraweeView m212581Z() {
        VDraweeView vDraweeView = this._background_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_background_avatar");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m212582Z0(@NotNull User user) {
        user.getClass();
        m212603m0().setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105515H0(m212603m0(), user.name);
        bnl0.m105524M(m212599k0(), lhn.INSTANCE.m154234e() && jyb.m147479J(user.profile.extensions.basic.intlFriendPurposeV2));
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText m212583a0() {
        VText vText = this._ban_release_entrance;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_ban_release_entrance");
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m212584a1(@NotNull User user) {
        user.getClass();
        m212605n0().setImageResource(dbc0.f86103Du);
        bnl0.m105524M(m212605n0(), user.isPicVerificationVerified());
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VButton m212585b0() {
        VButton vButton = this._bt_id_copy;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_bt_id_copy");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m212586c0() {
        VText vText = this._fake_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_fake_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VDraweeView m212587d0() {
        VDraweeView vDraweeView = this._hide_and_seek;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_hide_and_seek");
        return null;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m212588d1(@NotNull User user) {
        user.getClass();
        CoreModule.m30933P().m143408e().mo35989o7(getAct(), user, m212601l0(), true, true);
    }

    @Override // p153l.iam
    public void destroy() {
        this.intlMeTabDiscountEntryHost.m219357b();
        m212564Q();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VText m212589e0() {
        VText vText = this._id;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_id");
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m212590e1() {
        bnl0.m105542Z(m212611q0());
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final ViewStub m212591f0() {
        ViewStub viewStub = this._intl_pay_guide;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m88391r("_intl_pay_guide");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final LinearLayout m212592g0() {
        LinearLayout linearLayout = this._intr_risk_banner;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_intr_risk_banner");
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m212593g1(int count) {
        m212580Y().m44223f(count);
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m212594h0() {
        VText vText = this._intr_risk_banner_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_intr_risk_banner_content");
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m212595h1(boolean show) {
        m212566R().f27219i.setTextColor(Color.parseColor("#FE7E1D"));
        bnl0.m105539W(m212566R().f27214d, show ? qa00.f156289B : 0);
        bnl0.m105524M(m212566R().f27219i, show);
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VLinear m212596i0() {
        VLinear vLinear = this._item_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_item_layout");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m212553K(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VImage m212597j0() {
        VImage vImage = this._iv_edit;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_iv_edit");
        return null;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m212598j1(int which, boolean show) {
        VOnlineIndicator vOnlineIndicator;
        if (which != 0 || (vOnlineIndicator = this.settingDot) == null) {
            return;
        }
        bnl0.m105524M(vOnlineIndicator, show);
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VImage m212599k0() {
        VImage vImage = this._iv_edit_red_dot;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_iv_edit_red_dot");
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m212600k1(@NotNull User user) {
        user.getClass();
        boolean zM114661T = d79.m114661T();
        if (NullChecker.m82486a(user)) {
            boolean z = user.isSVIP() && !user.isVIPExpired();
            if (!z && zM114661T) {
                return !user.isVIP() || rbb0.m180746s(null, 1, null);
            }
            if (z && !IntlCountryCodeController.m29114k()) {
                return true;
            }
        }
        return zM114661T;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VImage m212601l0() {
        VImage vImage = this._name_container_img_vip;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_name_container_img_vip");
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m212602l1(@NotNull String time) {
        time.getClass();
        if (!bnl0.m105529O0(m212572U().f27219i)) {
            bnl0.m105539W(m212572U().f27214d, qa00.f156291D);
            bnl0.m105524M(m212572U().f27219i, true);
            m212572U().f27219i.setTextColor(Color.parseColor("#FE7E1D"));
        }
        bnl0.m105515H0(m212572U().f27219i, time);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m212603m0() {
        VText vText = this._name_container_tv_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name_container_tv_name");
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m212604m1() {
        if (bix.m104579a()) {
            return;
        }
        m212565Q0(this.lastPayGuide);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VImage m212605n0() {
        VImage vImage = this._name_container_verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_name_container_verification_icon");
        return null;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m212606n1(final List<Item> items, final User user) {
        C22421c c22421cDuringCreated;
        C22421c c22421cOnBackpressureBuffer;
        C22421c c22421cMaterialize;
        C22421c c22421cTake;
        C22421c c22421cObserveOn;
        final Ref.IntRef intRef = new Ref.IntRef();
        kcg0 kcg0Var = this.createSub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        Act act = getAct();
        this.createSub = (act == null || (c22421cDuringCreated = act.duringCreated(C22421c.interval(500L, TimeUnit.MILLISECONDS))) == null || (c22421cOnBackpressureBuffer = c22421cDuringCreated.onBackpressureBuffer((long) items.size())) == null || (c22421cMaterialize = c22421cOnBackpressureBuffer.materialize()) == null || (c22421cTake = c22421cMaterialize.take(items.size())) == null || (c22421cObserveOn = c22421cTake.observeOn(fo0.m126432a())) == null) ? null : c22421cObserveOn.subscribe(psd0.m173597H(new y20() { // from class: l.yo30
            @Override // p153l.y20
            public final void call(Object obj) {
                xp30.m212534m(intRef, items, this, user, (Notification) obj);
            }
        }, new y20() { // from class: l.zo30
            @Override // p153l.y20
            public final void call(Object obj) {
                xp30.m212531j((Throwable) obj);
            }
        }));
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: o */
    public boolean mo44445o() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VLinear m212607o0() {
        VLinear vLinear = this._new_me_linear;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_new_me_linear");
        return null;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m212608o1(@NotNull Intent intent) {
        intent.getClass();
        this.frag.startActivity(intent);
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final NewProfilePrivilegedPager m212609p0() {
        NewProfilePrivilegedPager newProfilePrivilegedPager = this._privilege_banner;
        if (newProfilePrivilegedPager != null) {
            return newProfilePrivilegedPager;
        }
        Intrinsics.m88391r("_privilege_banner");
        return null;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m212610p1(@NotNull String time) {
        time.getClass();
        bnl0.m105515H0(m212566R().f27219i, time);
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final VNavigationBar m212611q0() {
        VNavigationBar vNavigationBar = this._top_navigationbar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_top_navigationbar");
        return null;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m212612q1(@NotNull User user) {
        user.getClass();
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: r */
    public void mo44452r() {
        View viewInflate = this.frag.act().getLayoutInflater().inflate(kec0.f125391E7, (ViewGroup) m212611q0(), false);
        m212611q0().setBackgroundColor(CoreModule.f18263b.getResources().getColor(c9c0.f80334F0));
        m212611q0().m224835z(viewInflate);
        m212611q0().setTitle(R$string.f18886Tj);
        m212611q0().m224835z(m212548E0());
        m212558M0();
        this.intlMeTabDiscountEntryHost.m219356a(m212607o0(), m212609p0());
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final LinearLayout m212613r0() {
        LinearLayout linearLayout = this._wallet_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_wallet_layout");
        return null;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m212614r1() {
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            box.INSTANCE.m105724m();
            m212529f1();
        }
        bnl0.m105524M(m212586c0(), CoreModule.f18264c.f20381e0.m116537Z7());
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final VDraweeView m212615s0() {
        VDraweeView vDraweeView = this._wallet_layout_luckytantan;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_wallet_layout_luckytantan");
        return null;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m212616s1(@NotNull User user) {
        user.getClass();
        Long l2 = user.profile.receivedLikes;
        if (NullChecker.m82486a(l2)) {
            l2.getClass();
            if (l2.longValue() > this.receivedLikes) {
                this.receivedLikes = l2.longValue();
            }
        }
        bnl0.m105524M(m212574V().f27214d, true);
        m212574V().f27214d.setText(q8g0.m175782N(this.receivedLikes + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.frag.getString(R$string.f19839yl), this.frag.act().color(c9c0.f80465v1), lyh0.m156283c(3)));
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final VText m212617t0() {
        VText vText = this._wallet_layout_wallet_coin;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_wallet_layout_wallet_coin");
        return null;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m212618t1(@NotNull User user) {
        user.getClass();
        int childCount = m212596i0().getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (Intrinsics.m88377d(ViewGroupKt.m1329a(m212596i0(), i), m212572U())) {
                if (m212623w0(user) && !bnl0.m105529O0(m212572U())) {
                    box.INSTANCE.m105722k();
                }
                bnl0.m105524M(m212572U(), m212623w0(user));
            }
            if (Intrinsics.m88377d(ViewGroupKt.m1329a(m212596i0(), i), m212570T())) {
                if (m212600k1(user) && !bnl0.m105529O0(m212570T())) {
                    box.INSTANCE.m105719h();
                }
                bnl0.m105524M(m212570T(), m212600k1(user));
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m212619u0() {
        m212576W().m44224g(false);
        bnl0.m105524M(m212576W().f27214d, false);
        m212620u1();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m212620u1() {
        String string;
        bnl0.m105509E0(m212576W(), new View.OnClickListener() { // from class: l.fp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212539u(this.f100099a, view);
            }
        });
        boolean z = (pgj.m172246c() || nmp.m163833b()) ? false : true;
        if (!IntlCountryCodeController.m29118o()) {
            z = false;
        }
        if (z) {
            bnl0.m105524M(m212576W(), false);
        }
        m212576W().m44224g(false);
        bnl0.m105524M(m212576W().f27214d, false);
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31175H3 = CoreModule.f18264c.f20438x0.m31175H3("meTabSubscriptionTab");
        if (iapAffiliatePromotionDisplaySlotM31175H3 != null) {
            String str = iapAffiliatePromotionDisplaySlotM31175H3.mainTitle;
            if (!(str == null || str.length() == 0)) {
                bnl0.m105524M(m212576W().f27214d, true);
                m212576W().f27214d.setTextColor(Color.parseColor("#FE7E1D"));
                m212576W().f27214d.setText(iapAffiliatePromotionDisplaySlotM31175H3.mainTitle);
                CoreModule.f18264c.f20438x0.m31177I3();
                bnl0.m105509E0(m212576W(), new View.OnClickListener() { // from class: l.gp30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xp30.m212525c(this.f105408a, view);
                    }
                });
                return;
            }
        }
        if (CoreModule.f18264c.f20396j0.m31607Q4() && !d79.m114668a0()) {
            m212576W().f27214d.setTextColor(Color.parseColor("#FE7E1D"));
            so30 so30Var = this.presenter;
            if (so30Var == null) {
                Intrinsics.m88391r("presenter");
                so30Var = null;
            }
            so30Var.m187150x2();
            return;
        }
        if (t7a.m189547c()) {
            C4883c c4883c = CoreModule.f18264c;
            if (c4883c.f20311G2.f131283R == null || !c4883c.f20396j0.m31605P4()) {
                return;
            }
            bnl0.m105524M(m212576W().f27214d, true);
            m212576W().f27214d.setTextColor(Color.parseColor("#FE7E1D"));
            VText vText = m212576W().f27214d;
            if (CoreModule.f18264c.f20311G2.m153652j3()) {
                string = this.frag.getString(R$string.f18943Vg);
            } else {
                string = ((TEnum.equals(CoreModule.f18264c.f20311G2.m153651i3(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(CoreModule.f18264c.f20311G2.m153651i3(), ProductCategory.tttSeeUpgradeToPremium)) && CoreModule.f18264c.f20396j0.m31605P4()) ? this.frag.getString(R$string.f19063Zg) : this.frag.getString(R$string.f19125bh);
            }
            vText.setText(string);
            if ((TEnum.equals(CoreModule.f18264c.f20311G2.m153651i3(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(CoreModule.f18264c.f20311G2.m153651i3(), ProductCategory.tttSeeUpgradeToPremium)) && CoreModule.f18264c.f20396j0.m31605P4()) {
                bnl0.m105509E0(m212576W(), new View.OnClickListener() { // from class: l.hp30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xp30.m212542x(this.f110979a, view);
                    }
                });
            } else {
                bnl0.m105509E0(m212576W(), new View.OnClickListener() { // from class: l.ip30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xp30.m212512A(this.f116252a, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m212621v0() {
        ProfilePrivilegePayGuide profilePrivilegePayGuide;
        if (!bix.m104579a() || (profilePrivilegePayGuide = this.profilePrivilegePayGuide) == null) {
            return;
        }
        if (profilePrivilegePayGuide == null) {
            Intrinsics.m88391r("profilePrivilegePayGuide");
            profilePrivilegePayGuide = null;
        }
        bnl0.m105524M(profilePrivilegePayGuide, false);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m212622v1() {
        if (CoreModule.f18264c.f20396j0.f20036g0) {
            return;
        }
        m212576W().m44220c();
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m212623w0(User user) {
        if (!NullChecker.m82486a(user) || !user.isSVIP() || user.isVIPExpired() || IntlCountryCodeController.m29114k()) {
            return d79.m114661T();
        }
        return true;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m212624w1(@NotNull String subTitle) {
        subTitle.getClass();
        bnl0.m105524M(m212576W().f27214d, true);
        bnl0.m105539W(m212576W().f27214d, m212576W().f27217g.getWidth());
        m212576W().m44226i(subTitle);
    }

    /* JADX INFO: renamed from: x0 */
    public final ProfileItem m212625x0() {
        m212626y0(m212566R(), dbc0.f87642zg, R$string.f19787x0, R$string.f19273gb);
        bnl0.m105509E0(m212566R(), new View.OnClickListener() { // from class: l.kp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212526d(this.f127827a, view);
            }
        });
        box.INSTANCE.m105715d();
        return m212566R();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m212626y0(ProfileItem item, int icon, int title, int subTitle) {
        if (m212596i0().indexOfChild(item) == -1) {
            m212596i0().addView(item);
        }
        LinearLayout linearLayout = item.f27212b;
        int i = qa00.f156323j;
        bnl0.m105540X(linearLayout, i);
        bnl0.m105537U(item.f27212b, i);
        item.m44227j(CoreModule.f18263b.getString(title));
        item.setIconRes(icon);
        item.setMinimumHeight(qa00.f156297J);
        if (subTitle != 0) {
            item.setSubtitle(CoreModule.f18263b.getString(subTitle));
        }
        item.f27213c.setTextSize(15.0f);
        item.f27214d.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m212627y1() {
        if (this.visitorItemEnable) {
            box.INSTANCE.m105735x();
        }
        if (bnl0.m105529O0(m212592g0())) {
            RiskSelfData riskSelfData = this.mRiskSelfData;
            RiskSelfData riskSelfData2 = null;
            if (riskSelfData == null) {
                Intrinsics.m88391r("mRiskSelfData");
                riskSelfData = null;
            }
            if (NullChecker.m82486a(riskSelfData)) {
                RiskSelfData riskSelfData3 = this.mRiskSelfData;
                if (riskSelfData3 == null) {
                    Intrinsics.m88391r("mRiskSelfData");
                } else {
                    riskSelfData2 = riskSelfData3;
                }
                i4g0.m138492A("e_navigation_risk_user_warning", OMSDialogPositon.p_navigation_view, jyb.m147494Y("user_risk_type", riskSelfData2.type));
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final ProfileItem m212628z0(User user) {
        m212626y0(m212570T(), dbc0.f85993Ag, R$string.f19490nd, R$string.f19459md);
        if (wtd0.m207833e().m207841k()) {
            m212570T().m44225h(true);
        }
        bnl0.m105509E0(m212570T(), new View.OnClickListener() { // from class: l.lp30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xp30.m212524b(this.f133005a, view);
            }
        });
        if (m212600k1(user)) {
            box.INSTANCE.m105719h();
        }
        bnl0.m105524M(m212570T(), m212600k1(user));
        return m212570T();
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: x2 */
    public void mo44466x2() {
    }
}
