package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.HideAndSeekBannerData;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.LuckyTtConfig;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RiskSelfData;
import com.p046p1.mobile.putong.core.map.IntlHideAndSeekAct;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p046p1.mobile.putong.core.newui.main.C8096a;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p046p1.mobile.putong.core.newui.profile.ProfileItem;
import com.p046p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import com.p046p1.mobile.putong.core.newui.profile.newme.ProfilePrivilegePayGuide;
import com.p046p1.mobile.putong.core.p053ui.intl.visitor.IntlVisitorsAct;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlLikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksAct;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinAct;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p133rx.Notification;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VOnlineIndicator;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ä\u00022\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0093\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0019\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J/\u0010.\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001fH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020)H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0002¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00101J\u0017\u00104\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020)H\u0002¢\u0006\u0004\b7\u00101J\u000f\u00108\u001a\u00020)H\u0002¢\u0006\u0004\b8\u00101J\u0017\u0010:\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000fH\u0016¢\u0006\u0004\bB\u0010\u0013J!\u0010C\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bC\u0010AJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0013J\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010\u0013J\u000f\u0010F\u001a\u000209H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u0002H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u0013J\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u000f¢\u0006\u0004\bO\u0010\u0013J\u0015\u0010P\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\u000f2\b\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u0015¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020%¢\u0006\u0004\bZ\u0010[J\u0015\u0010\\\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\\\u0010QJ\u0015\u0010]\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b]\u0010QJ\u0015\u0010^\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b^\u0010QJ\u0015\u0010`\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u0015¢\u0006\u0004\b`\u0010XJ\r\u0010a\u001a\u000209¢\u0006\u0004\ba\u0010GJ\u0015\u0010b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bb\u0010QJ\u0015\u0010c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bc\u0010QJ#\u0010g\u001a\u00020\u000f2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\n2\u0006\u0010f\u001a\u000209¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u001f¢\u0006\u0004\bj\u0010\"J!\u0010n\u001a\u00020\u000f2\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\r0k¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020\u000f¢\u0006\u0004\bp\u0010\u0013J\u0015\u0010q\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bq\u0010QJ\u001d\u0010s\u001a\u00020\u000f2\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\n¢\u0006\u0004\bs\u0010tJ\r\u0010u\u001a\u00020\u000f¢\u0006\u0004\bu\u0010\u0013J\u0015\u0010w\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u001f¢\u0006\u0004\bw\u0010\"J\u0015\u0010x\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bx\u0010;J\r\u0010y\u001a\u00020\u000f¢\u0006\u0004\by\u0010\u0013J\r\u0010z\u001a\u00020\u000f¢\u0006\u0004\bz\u0010\u0013J\r\u0010{\u001a\u00020\u000f¢\u0006\u0004\b{\u0010\u0013J\u0015\u0010|\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0015¢\u0006\u0004\b|\u0010XJ\u0015\u0010~\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020\u0015¢\u0006\u0004\b~\u0010XJ\u0018\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u000209¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0017\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020\u0015¢\u0006\u0005\b\u0082\u0001\u0010XJ\u001a\u0010\u0085\u0001\u001a\u00020\u000f2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J!\u0010\u0088\u0001\u001a\u00020\u000f2\u0007\u0010\u0087\u0001\u001a\u00020\u001f2\u0006\u0010\u007f\u001a\u000209¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u008a\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008a\u0001\u0010\u0013J\u001c\u0010\u008d\u0001\u001a\u00020\u000f2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u000f2\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001b\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010®\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010¶\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R*\u0010¾\u0001\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R*\u0010Æ\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Ê\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÇ\u0001\u0010Á\u0001\u001a\u0006\bÈ\u0001\u0010Ã\u0001\"\u0006\bÉ\u0001\u0010Å\u0001R*\u0010Î\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bË\u0001\u0010Á\u0001\u001a\u0006\bÌ\u0001\u0010Ã\u0001\"\u0006\bÍ\u0001\u0010Å\u0001R*\u0010Ö\u0001\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R*\u0010Þ\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010â\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010Ù\u0001\u001a\u0006\bà\u0001\u0010Û\u0001\"\u0006\bá\u0001\u0010Ý\u0001R*\u0010æ\u0001\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bã\u0001\u0010¹\u0001\u001a\u0006\bä\u0001\u0010»\u0001\"\u0006\bå\u0001\u0010½\u0001R*\u0010ê\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bç\u0001\u0010±\u0001\u001a\u0006\bè\u0001\u0010³\u0001\"\u0006\bé\u0001\u0010µ\u0001R)\u0010í\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bF\u0010Á\u0001\u001a\u0006\bë\u0001\u0010Ã\u0001\"\u0006\bì\u0001\u0010Å\u0001R*\u0010ñ\u0001\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bî\u0001\u0010Ñ\u0001\u001a\u0006\bï\u0001\u0010Ó\u0001\"\u0006\bð\u0001\u0010Õ\u0001R*\u0010õ\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bò\u0001\u0010Ù\u0001\u001a\u0006\bó\u0001\u0010Û\u0001\"\u0006\bô\u0001\u0010Ý\u0001R)\u0010ø\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bB\u0010Ù\u0001\u001a\u0006\bö\u0001\u0010Û\u0001\"\u0006\b÷\u0001\u0010Ý\u0001R*\u0010ü\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bù\u0001\u0010Á\u0001\u001a\u0006\bú\u0001\u0010Ã\u0001\"\u0006\bû\u0001\u0010Å\u0001R*\u0010\u0084\u0002\u001a\u00030ý\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R*\u0010\u008c\u0002\u001a\u00030\u0085\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002\"\u0006\b\u008a\u0002\u0010\u008b\u0002R*\u0010\u0090\u0002\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010¹\u0001\u001a\u0006\b\u008e\u0002\u0010»\u0001\"\u0006\b\u008f\u0002\u0010½\u0001R*\u0010\u0094\u0002\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010Ù\u0001\u001a\u0006\b\u0092\u0002\u0010Û\u0001\"\u0006\b\u0093\u0002\u0010Ý\u0001R*\u0010\u0098\u0002\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010Á\u0001\u001a\u0006\b\u0096\u0002\u0010Ã\u0001\"\u0006\b\u0097\u0002\u0010Å\u0001R*\u0010\u009c\u0002\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0002\u0010Ñ\u0001\u001a\u0006\b\u009a\u0002\u0010Ó\u0001\"\u0006\b\u009b\u0002\u0010Õ\u0001R*\u0010¤\u0002\u001a\u00030\u009d\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010¡\u0002\"\u0006\b¢\u0002\u0010£\u0002R*\u0010¬\u0002\u001a\u00030¥\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0002\u0010§\u0002\u001a\u0006\b¨\u0002\u0010©\u0002\"\u0006\bª\u0002\u0010«\u0002R*\u0010°\u0002\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u00ad\u0002\u0010Ñ\u0001\u001a\u0006\b®\u0002\u0010Ó\u0001\"\u0006\b¯\u0002\u0010Õ\u0001R*\u0010´\u0002\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0002\u0010Á\u0001\u001a\u0006\b²\u0002\u0010Ã\u0001\"\u0006\b³\u0002\u0010Å\u0001R*\u0010¸\u0002\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bµ\u0002\u0010±\u0001\u001a\u0006\b¶\u0002\u0010³\u0001\"\u0006\b·\u0002\u0010µ\u0001R\u0018\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u001f\u0010¾\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b»\u0002\u0010¼\u0002\u001a\u0005\b½\u0002\u00101R\u001f\u0010Á\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¿\u0002\u0010¼\u0002\u001a\u0005\bÀ\u0002\u00101R\u001f\u0010Ä\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÂ\u0002\u0010¼\u0002\u001a\u0005\bÃ\u0002\u00101R\u001f\u0010Ç\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÅ\u0002\u0010¼\u0002\u001a\u0005\bÆ\u0002\u00101R\u001f\u0010Ê\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÈ\u0002\u0010¼\u0002\u001a\u0005\bÉ\u0002\u00101R\u001e\u0010Ì\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b@\u0010¼\u0002\u001a\u0005\bË\u0002\u00101R\u001e\u0010Î\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u001d\u0010¼\u0002\u001a\u0005\bÍ\u0002\u00101R\u0019\u0010Ð\u0002\u001a\u00030Ï\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010È\u0002R\u001b\u0010Ó\u0002\u001a\u0005\u0018\u00010Ñ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010Ò\u0002R\u0018\u0010Ô\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010Ò\u0001R\u0019\u0010Ö\u0002\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0017\u0010Õ\u0002R\u0019\u0010Ù\u0002\u001a\u00030×\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0012\u0010Ø\u0002R\u001d\u0010Þ\u0002\u001a\u00030Ú\u00028\u0006¢\u0006\u0010\n\u0006\bÀ\u0002\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u001c\u0010á\u0002\u001a\u0005\u0018\u00010ß\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0002\u0010à\u0002R\u001c\u0010â\u0002\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010Ñ\u0001R\u001c\u0010ã\u0002\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0002\u0010Ñ\u0001¨\u0006å\u0002"}, m87232d2 = {"Ll/jh30;", "Ll/rta0;", "Ll/eg30;", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;)V", "Landroid/view/View;", "D0", "()Landroid/view/View;", "", "Lcom/p1/mobile/putong/core/data/Item;", FirebaseAnalytics.Param.ITEMS, "Lcom/p1/mobile/putong/data/User;", "user", "", "l1", "(Ljava/util/List;Lcom/p1/mobile/putong/data/User;)V", "Q", "()V", "K0", "", AuthenticationTokenClaims.JSON_KEY_NAME, "P", "(Ljava/lang/String;Lcom/p1/mobile/putong/data/User;)V", "L0", "e1", "Lcom/p1/mobile/putong/data/PhoneNumber;", "phoneNumber", "L", "(Lcom/p1/mobile/putong/data/PhoneNumber;)V", "", "size", "I0", "(I)V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "image", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "url", "N", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;)V", "Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", Item.TYPE, "icon", "title", "subTitle", "x0", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;III)V", "A0", "()Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", "w0", "G0", "z0", "(Lcom/p1/mobile/putong/data/User;)Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", "y0", "E0", "H0", "", "v0", "(Lcom/p1/mobile/putong/data/User;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "K", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "inflateView", "D1", "x2", "o", "()Z", "presenter", "M", "(Ll/eg30;)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "d1", "Y0", "(Lcom/p1/mobile/putong/data/User;)V", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "intlTabMePayGuide", "P0", "(Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;)V", "publicId", "W0", "(Ljava/lang/String;)V", "uri", "N0", "(Lcom/p1/mobile/putong/data/Picture$ImageUri;)V", "o1", "a1", "Z0", "coin", "Q0", "J0", "B0", "r1", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "force", "U0", "(Ljava/util/List;Z)V", "position", BloodType.f38728O, "Ll/j760;", "Lcom/p1/mobile/putong/core/data/AppealInfo;", "pair", "O0", "(Ll/j760;)V", "p1", "q1", "avatars", "V0", "(Ljava/util/List;)V", "v1", "count", "f1", "j1", "u0", "t1", "s1", "u1", "time", "n1", "show", "g1", "(Z)V", "k1", "Landroid/content/Intent;", "intent", "m1", "(Landroid/content/Intent;)V", "which", "h1", "(IZ)V", "R0", "Lcom/p1/mobile/putong/core/data/HideAndSeekBannerData;", "data", "S0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekBannerData;)V", "Lcom/p1/mobile/putong/core/data/RiskSelfData;", "risk", "T0", "(Lcom/p1/mobile/putong/core/data/RiskSelfData;)V", "a", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "Lv/VRelative;", "b", "Lv/VRelative;", "get_new_tab_me", "()Lv/VRelative;", "set_new_tab_me", "(Lv/VRelative;)V", "_new_tab_me", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "q0", "()Lv/navigationbar/VNavigationBar;", "set_top_navigationbar", "(Lv/navigationbar/VNavigationBar;)V", "_top_navigationbar", "Landroid/widget/ScrollView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ScrollView;", "get_content_view", "()Landroid/widget/ScrollView;", "set_content_view", "(Landroid/widget/ScrollView;)V", "_content_view", "Lv/VLinear;", "e", "Lv/VLinear;", "o0", "()Lv/VLinear;", "set_new_me_linear", "(Lv/VLinear;)V", "_new_me_linear", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "g0", "()Landroid/widget/LinearLayout;", "set_intr_risk_banner", "(Landroid/widget/LinearLayout;)V", "_intr_risk_banner", "Lv/VText;", "g", "Lv/VText;", "h0", "()Lv/VText;", "set_intr_risk_banner_content", "(Lv/VText;)V", "_intr_risk_banner_content", "h", "a0", "set_ban_release_entrance", "_ban_release_entrance", RXScreenCaptureService.KEY_INDEX, "c0", "set_fake_tip", "_fake_tip", "Lv/VDraweeView;", "j", "Lv/VDraweeView;", "Z", "()Lv/VDraweeView;", "set_background_avatar", "(Lv/VDraweeView;)V", "_background_avatar", "Lv/VImage;", "k", "Lv/VImage;", "j0", "()Lv/VImage;", "set_iv_edit", "(Lv/VImage;)V", "_iv_edit", BLiveStormDanmakuGiftResourceType.f44444l, "k0", "set_iv_edit_red_dot", "_iv_edit_red_dot", "m", "get_user_desc_container", "set_user_desc_container", "_user_desc_container", "n", "get_name_container", "set_name_container", "_name_container", "m0", "set_name_container_tv_name", "_name_container_tv_name", "p", "get_name_container_emoji", "set_name_container_emoji", "_name_container_emoji", "q", "n0", "set_name_container_verification_icon", "_name_container_verification_icon", "l0", "set_name_container_img_vip", "_name_container_img_vip", BLiveStormDanmakuGiftResourceType.f44446s, "e0", "set_id", "_id", "Lv/VButton;", Constants.KEY_T, "Lv/VButton;", "b0", "()Lv/VButton;", "set_bt_id_copy", "(Lv/VButton;)V", "_bt_id_copy", "Landroid/widget/Space;", "u", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", ResourceDirection.f38808v, "r0", "set_wallet_layout", "_wallet_layout", "w", "get_wallet_layout_wallet_icon", "set_wallet_layout_wallet_icon", "_wallet_layout_wallet_icon", BaseSei.f13930X, "t0", "set_wallet_layout_wallet_coin", "_wallet_layout_wallet_coin", BaseSei.f13931Y, "s0", "set_wallet_layout_luckytantan", "_wallet_layout_luckytantan", "Landroid/view/ViewStub;", BaseSei.f13932Z, "Landroid/view/ViewStub;", "f0", "()Landroid/view/ViewStub;", "set_intl_pay_guide", "(Landroid/view/ViewStub;)V", "_intl_pay_guide", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "A", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "p0", "()Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "set_privilege_banner", "(Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;)V", "_privilege_banner", "B", "d0", "set_hide_and_seek", "_hide_and_seek", b2s.C_ZONE, "get_service_plu", "set_service_plu", "_service_plu", "D", "i0", "set_item_layout", "_item_layout", "E", "Ll/eg30;", "F", "Lkotlin/Lazy;", j6f.GPS_MEASUREMENT_INTERRUPTED, "seeItem", "G", "R", "boostItem", "H", "X", "suerLikeItem", "I", j6f.GPS_DIRECTION_TRUE, "likeItem", "J", "U", "picksItem", "Y", "visitorItem", "W", "subscriptionItem", "", "receivedLikes", "Lv/VOnlineIndicator;", "Lv/VOnlineIndicator;", "settingDot", "visitorItemEnable", "Lcom/p1/mobile/putong/core/data/RiskSelfData;", "mRiskSelfData", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "profilePrivilegePayGuide", "Ll/zbo;", "Ll/zbo;", j6f.LATITUDE_SOUTH, "()Ll/zbo;", "intlMeTabDiscountEntryHost", "Ll/c4g0;", "Ll/c4g0;", "createSub", "seeTwo", "seeOne", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class jh30 implements rta0<eg30> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public NewProfilePrivilegedPager _privilege_banner;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VDraweeView _hide_and_seek;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VText _service_plu;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VLinear _item_layout;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public eg30 presenter;

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
    @NotNull
    public final zbo intlMeTabDiscountEntryHost;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @Nullable
    public c4g0 createSub;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public VDraweeView seeTwo;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
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

    public jh30(@NotNull ProfileFrag profileFrag) {
        profileFrag.getClass();
        this.frag = profileFrag;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.seeItem = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.fh30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jh30.m141392n(this.f97480a);
            }
        });
        this.boostItem = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.gh30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jh30.m141389k(this.f102622a);
            }
        });
        this.suerLikeItem = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.hh30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jh30.m141384e(this.f107678a);
            }
        });
        this.likeItem = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.ih30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jh30.m141377J(this.f113200a);
            }
        });
        this.picksItem = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.gg30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jh30.m141395s(this.f102448a);
            }
        });
        this.visitorItem = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.hg30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jh30.m141376I(this.f107558a);
            }
        });
        this.subscriptionItem = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.ig30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jh30.m141373F(this.f113068a);
            }
        });
        this.intlMeTabDiscountEntryHost = new zbo(profileFrag);
    }

    /* JADX INFO: renamed from: A */
    public static void m141369A(jh30 jh30Var, View view) {
        c690.m105376e(jh30Var.getAct(), "MINE_SUB_ITEM", PurchaseType.TYPE_ULTRA_PREMIUM, u59.m191802K() ? new jyo() : new bll0());
    }

    /* JADX INFO: renamed from: B */
    public static Unit m141370B(jh30 jh30Var, View view) {
        view.getClass();
        Intent intentM50738p2 = ProfileAct.m50738p2(jh30Var.getAct(), qib0.f154713b0.f139230a.userId(), "profile_frag_menu", false, true);
        intentM50738p2.putExtra("preview_type", 0);
        jh30Var.m141461m1(intentM50738p2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static void m141371C(jh30 jh30Var, View view) {
        if (swh0.m186276x0() > 0) {
            lsi0.m151593w(R$string.f18285Xs);
        } else if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || u59.m191818a0()) {
            C8764c.m53397H1(jh30Var.getAct(), "p_navigation_view,e_navigation_super_like,click", 0, null, 12, null);
        } else {
            C8764c.m53418O1(jh30Var.getAct(), "p_navigation_view,e_navigation_super_like,click", Privilege.vip_super_like, null, null, false, null, null, null, HttpStatus.GATEWAY_TIMEOUT_504, null);
        }
        dfx.INSTANCE.m111526q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static void m141372E(AppealInfo appealInfo, j760 j760Var, jh30 jh30Var, View view) {
        dfx.INSTANCE.m111510a();
        if (!appealInfo.allowAppeal) {
            lsi0.m151578h(R$string.f18594i0);
            return;
        }
        String str = appealInfo.status;
        int iHashCode = str.hashCode();
        if (iHashCode != -1392885889) {
            if (iHashCode == -1347010958 && str.equals("inProgress")) {
                Intent intentM36171Y1 = AppealProgressAct.m36171Y1(jh30Var.getAct());
                intentM36171Y1.getClass();
                jh30Var.m141461m1(intentM36171Y1);
                return;
            }
            return;
        }
        if (str.equals(OMSSwipeMoment.before)) {
            S s = j760Var.f116565b;
            s.getClass();
            if (NullChecker.m81303a(((User) s).settings)) {
                S s2 = j760Var.f116565b;
                s2.getClass();
                Settings settings = ((User) s2).settings;
                settings.getClass();
                if (NullChecker.m81304b(settings.phoneNumber)) {
                    S s3 = j760Var.f116565b;
                    s3.getClass();
                    Settings settings2 = ((User) s3).settings;
                    settings2.getClass();
                    PhoneNumber phoneNumber = settings2.phoneNumber;
                    phoneNumber.getClass();
                    jh30Var.m141412L(phoneNumber);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static ProfileItem m141373F(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: G */
    public static void m141374G(jh30 jh30Var, View view) {
        dfx.INSTANCE.m111514e();
        if (wvv.m205769i(jh30Var.getAct(), R$string.f18826ph, new d30() { // from class: l.vg30
            @Override // p149l.d30
            public final void call() {
                jh30.m141378M0();
            }
        })) {
            Intent intentM35914Y1 = IntlHideAndSeekAct.m35914Y1(jh30Var.getAct());
            intentM35914Y1.getClass();
            jh30Var.m141461m1(intentM35914Y1);
        }
    }

    /* JADX INFO: renamed from: H */
    public static Unit m141375H(jh30 jh30Var, View view) {
        view.getClass();
        eg30 eg30Var = jh30Var.presenter;
        if (eg30Var == null) {
            Intrinsics.m87502r("presenter");
            eg30Var = null;
        }
        eg30Var.m116225q2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static ProfileItem m141376I(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: J */
    public static ProfileItem m141377J(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m141378M0() {
        qib0.f154687E.m78868t();
    }

    /* JADX INFO: renamed from: X0 */
    public static final void m141379X0(String str, View view) {
        e51.m114766q(str);
        lsi0.m151593w(R$string.f18269Xc);
        dfx.INSTANCE.m111528s();
    }

    /* JADX INFO: renamed from: a */
    public static void m141380a(jh30 jh30Var, View view) {
        jh30Var.m141461m1(new Intent(jh30Var.getContext(), (Class<?>) TopPicksAct.class));
        dfx.INSTANCE.m111518i();
    }

    /* JADX INFO: renamed from: b */
    public static void m141381b(jh30 jh30Var, View view) {
        uld0.m194220e().m194234r();
        jh30Var.m141427T().m43214h(false);
        jh30Var.m141461m1(new Intent(jh30Var.getAct(), (Class<?>) IntlLikedUsersAct.class));
    }

    /* JADX INFO: renamed from: c */
    public static void m141382c(jh30 jh30Var, View view) {
        IapAffiliatePromotion iapAffiliatePromotionM30179I3 = CoreModule.f17545c.f19696x0.m30179I3();
        Act act = jh30Var.getAct();
        if (iapAffiliatePromotionM30179I3 != null && act != null) {
            m4p.m153084j(act, iapAffiliatePromotionM30179I3, "sub_management");
        }
        c690.m105376e(jh30Var.getAct(), "MINE_SUB_ITEM", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, u59.m191802K() ? new jyo() : new bll0());
    }

    /* JADX INFO: renamed from: d */
    public static void m141383d(jh30 jh30Var, View view) {
        dfx.INSTANCE.m111512c();
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            m73.m153331k(jh30Var.getAct());
        } else {
            x93.Companion.m207474h(x93.INSTANCE, jh30Var.getAct(), false, null, false, null, 24, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ProfileItem m141384e(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: e1 */
    private final void m141385e1() {
        xdl0.m208335H0(m141443c0(), w1g.m200928a() ? CoreModule.m29936Q().mo67285sj() : this.frag.getString(R$string.f18993v4));
    }

    /* JADX INFO: renamed from: i */
    public static void m141387i(jh30 jh30Var, View view) {
        eg30 eg30Var = jh30Var.presenter;
        if (eg30Var == null) {
            Intrinsics.m87502r("presenter");
            eg30Var = null;
        }
        eg30Var.m116226r2();
    }

    /* JADX INFO: renamed from: j */
    public static void m141388j(Throwable th) {
        CrashHelper.m81296c(th);
    }

    /* JADX INFO: renamed from: k */
    public static ProfileItem m141389k(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: l */
    public static void m141390l(jh30 jh30Var, View view) {
        dfx.INSTANCE.m111529t();
        jh30Var.m141461m1(new Intent(jh30Var.getContext(), (Class<?>) IntlVisitorsAct.class));
    }

    /* JADX INFO: renamed from: m */
    public static void m141391m(Ref.IntRef intRef, List list, jh30 jh30Var, User user, Notification notification) {
        if (intRef.element >= list.size()) {
            jh30Var.m141421Q();
            return;
        }
        int i = intRef.element;
        intRef.element = i + 1;
        String str = ((Item) list.get(i)).name;
        str.getClass();
        jh30Var.m141419P(str, user);
        if (intRef.element == list.size()) {
            jh30Var.m141411K0();
            jh30Var.m141421Q();
        }
    }

    /* JADX INFO: renamed from: n */
    public static ProfileItem m141392n(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: p */
    public static void m141393p(jh30 jh30Var, View view) {
        uld0.m194220e().m194230n();
        eg30 eg30Var = jh30Var.presenter;
        if (eg30Var == null) {
            Intrinsics.m87502r("presenter");
            eg30Var = null;
        }
        eg30Var.m116228t2();
    }

    /* JADX INFO: renamed from: q */
    public static void m141394q(jh30 jh30Var, View view) {
        xdl0.m208344M(jh30Var.m141472s0(), false);
        CoreModule.f17545c.f19654j0.f19291d0.put(Boolean.TRUE);
        Intent intentM58077X1 = TanTanCoinAct.m58077X1(jh30Var.getAct());
        intentM58077X1.getClass();
        jh30Var.m141461m1(intentM58077X1);
    }

    /* JADX INFO: renamed from: s */
    public static ProfileItem m141395s(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: u */
    public static void m141396u(jh30 jh30Var, View view) {
        c690.m105376e(jh30Var.getAct(), "MINE_SUB_ITEM", null, u59.m191802K() ? new jyo() : new bll0());
    }

    /* JADX INFO: renamed from: w */
    public static void m141398w(jh30 jh30Var, View view) {
        qqh0.INSTANCE.m175932k(jh30Var.frag);
        dfx.INSTANCE.m111520k();
    }

    /* JADX INFO: renamed from: x */
    public static void m141399x(jh30 jh30Var, View view) {
        C8096a c8096aM39794V5;
        tab0 jyoVar = u59.m191802K() ? new jyo() : new bll0();
        if (CoreModule.f17545c.f19569G2.m105982j3()) {
            CoreModule.f17545c.f19569G2.m105990r3();
            Act act = jh30Var.frag.act();
            NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
            if (newMainAct != null && (c8096aM39794V5 = newMainAct.m39794V5()) != null) {
                c8096aM39794V5.m40449x9();
            }
        }
        c690.m105376e(jh30Var.getAct(), "MINE_SUB_ITEM", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, jyoVar);
    }

    /* JADX INFO: renamed from: y */
    public static void m141400y(jh30 jh30Var, View view) {
        eg30 eg30Var = jh30Var.presenter;
        if (eg30Var == null) {
            Intrinsics.m87502r("presenter");
            eg30Var = null;
        }
        eg30Var.m116227s2();
    }

    /* JADX INFO: renamed from: z */
    public static void m141401z(jh30 jh30Var, RiskSelfData riskSelfData, View view) {
        qwp.m176882i().m176889o(jh30Var.getAct(), riskSelfData.type, riskSelfData.popUpText);
        zvf0.m220399u("e_navigation_risk_user_warning", OMSDialogPositon.p_navigation_view, vwb.m200311Y("user_risk_type", riskSelfData.type));
    }

    /* JADX INFO: renamed from: A0 */
    public final ProfileItem m141402A0() {
        m141481x0(m141431V(), x2c0.f189609Of, R$string.f18862qn, 0);
        m141431V().f26471c.setMaxLines(2);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        userM169527p9.getClass();
        m141469q1(userM169527p9);
        xdl0.m208329E0(m141431V(), new View.OnClickListener() { // from class: l.jg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141387i(this.f117707a, view);
            }
        });
        return m141431V();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m141403B0(@NotNull User user) {
        user.getClass();
        if (m141453i0().getChildCount() != 0) {
            return;
        }
        List<Item> listM175928g = qqh0.INSTANCE.m175928g();
        if (c4p.INSTANCE.m105238e()) {
            m141459l1(listM175928g, user);
            return;
        }
        Iterator<Item> it = listM175928g.iterator();
        while (it.hasNext()) {
            String str = it.next().name;
            str.getClass();
            m141419P(str, user);
        }
        m141411K0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final View m141404D0() {
        VImage vImage = new VImage(getContext());
        vImage.setImageResource(x2c0.f189765Tg);
        VFrame vFrame = new VFrame(getContext());
        vFrame.addView(vImage, new FrameLayout.LayoutParams(t100.m186890d(32.0f), t100.m186890d(32.0f)));
        int i = t100.f167261j;
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
        xdl0.m208329E0(vFrame, new View.OnClickListener() { // from class: l.fg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141393p(this.f97329a, view);
            }
        });
        return vFrame;
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: D1 */
    public void mo133487D1() {
        ProfilePrivilegePayGuide profilePrivilegePayGuide = this.profilePrivilegePayGuide;
        if (profilePrivilegePayGuide != null) {
            ProfilePrivilegePayGuide profilePrivilegePayGuide2 = null;
            if (profilePrivilegePayGuide == null) {
                Intrinsics.m87502r("profilePrivilegePayGuide");
                profilePrivilegePayGuide = null;
            }
            if (xdl0.m208349O0(profilePrivilegePayGuide)) {
                ProfilePrivilegePayGuide profilePrivilegePayGuide3 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide3 == null) {
                    Intrinsics.m87502r("profilePrivilegePayGuide");
                } else {
                    profilePrivilegePayGuide2 = profilePrivilegePayGuide3;
                }
                profilePrivilegePayGuide2.m43293n0("");
            }
        }
        CoreModule.f17545c.f19654j0.m30605Q5();
        this.intlMeTabDiscountEntryHost.m217983c();
    }

    /* JADX INFO: renamed from: E0 */
    public final ProfileItem m141405E0() {
        m141481x0(m141433W(), x2c0.f189640Pf, R$string.f18027Pa, R$string.f18550gi);
        xdl0.m208360X(m141433W().f26471c, 0);
        xdl0.m208344M(m141433W().f26472d, false);
        m141473s1();
        return m141433W();
    }

    /* JADX INFO: renamed from: G0 */
    public final ProfileItem m141406G0() {
        m141481x0(m141435X(), x2c0.f189671Qf, R$string.f19018w, R$string.f18087Ra);
        xdl0.m208329E0(m141435X(), new View.OnClickListener() { // from class: l.og30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141371C(this.f143800a, view);
            }
        });
        dfx.INSTANCE.m111527r();
        return m141435X();
    }

    /* JADX INFO: renamed from: H0 */
    public final ProfileItem m141407H0() {
        m141481x0(m141436Y(), x2c0.f189702Rf, R$string.f17908Lb, R$string.f17878Kb);
        xdl0.m208329E0(m141436Y(), new View.OnClickListener() { // from class: l.ah30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141390l(this.f69548a, view);
            }
        });
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        userM169527p9.getClass();
        if (m141478v0(userM169527p9)) {
            this.visitorItemEnable = true;
        }
        xdl0.m208344M(m141436Y(), m141478v0(userM169527p9));
        return m141436Y();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m141408I0(int size) {
        if (size == 0) {
            return;
        }
        if (this.seeTwo == null) {
            this.seeTwo = (VDraweeView) m141431V().f26481m.inflate();
        }
        if (size <= 1 || this.seeOne != null) {
            return;
        }
        this.seeOne = (VDraweeView) m141431V().f26480l.inflate();
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m141409J0() {
        return this.frag.isHidden();
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m141410K(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM145951b = kh30.m145951b(this, inflater, parent);
        viewM145951b.getClass();
        return viewM145951b;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m141411K0() {
        View viewM1328a = ViewGroupKt.m1328a(m141453i0(), m141453i0().getChildCount() - 1);
        if (viewM1328a instanceof ProfileItem) {
            ((ProfileItem) viewM1328a).m43210d(false);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m141412L(PhoneNumber phoneNumber) {
        Intent intentBuildBanReleaseVerifyIntent = CoreModule.m29931H().buildBanReleaseVerifyIntent(getAct(), phoneNumber);
        intentBuildBanReleaseVerifyIntent.getClass();
        m141461m1(intentBuildBanReleaseVerifyIntent);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m141413L0() {
        cxq.m109105c(m141438Z(), new Function1() { // from class: l.qg30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jh30.m141375H(this.f154307a, (View) obj);
            }
        });
        cxq.m109105c(m141454j0(), new Function1() { // from class: l.bh30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jh30.m141370B(this.f75554a, (View) obj);
            }
        });
        xdl0.m208329E0(m141470r0(), new View.OnClickListener() { // from class: l.ch30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141394q(this.f80830a, view);
            }
        });
        xdl0.m208329E0(m141443c0(), new View.OnClickListener() { // from class: l.dh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141398w(this.f86232a, view);
            }
        });
        xdl0.m208329E0(m141444d0(), new View.OnClickListener() { // from class: l.eh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141374G(this.f91295a, view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull eg30 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: N */
    public final void m141415N(SimpleDraweeView image, Picture.ImageUri url) {
        xdl0.m208345M0(image, true);
        if (n3b0.m157744s(null, 1, null)) {
            qib0.f154691G.m102336O(image, url.formatted(), 3, 5);
        } else {
            qib0.f154691G.m102331L0(image, url.formatted());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m141416N0(@NotNull Picture.ImageUri uri) {
        uri.getClass();
        qib0.f154691G.m102327J0(m141438Z(), uri, false);
    }

    /* JADX INFO: renamed from: O */
    public final void m141417O(int position) {
        m141466p0().m43281b(position);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m141418O0(@NotNull final j760<AppealInfo, User> pair) {
        pair.getClass();
        final AppealInfo appealInfo = pair.f116564a;
        rc2.m178723e().m178730h(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            xdl0.m208344M(m141440a0(), false);
            return;
        }
        if (!m141409J0() && !xdl0.m208349O0(m141440a0())) {
            dfx.INSTANCE.m111511b();
        }
        VText vTextM141440a0 = m141440a0();
        boolean zEquals = TextUtils.equals(rc2.m178723e().m178725b(), "under_review");
        ProfileFrag profileFrag = this.frag;
        vTextM141440a0.setText(zEquals ? profileFrag.getString(R$string.f18716m0) : profileFrag.getString(R$string.f18747n0));
        xdl0.m208344M(m141440a0(), true);
        xdl0.m208329E0(m141440a0(), new View.OnClickListener() { // from class: l.pg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141372E(appealInfo, pair, this, view);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P */
    public final void m141419P(String name, User user) {
        switch (name.hashCode()) {
            case -332142190:
                if (name.equals("superlike")) {
                    m141406G0();
                    break;
                }
                break;
            case 113747:
                if (name.equals("see")) {
                    m141402A0();
                    break;
                }
                break;
            case 102974396:
                if (name.equals("likes")) {
                    m141482y0(user);
                    break;
                }
                break;
            case 106660978:
                if (name.equals("picks")) {
                    m141483z0(user);
                    break;
                }
                break;
            case 110726686:
                if (name.equals("turbo")) {
                    m141480w0();
                    break;
                }
                break;
            case 341203229:
                if (name.equals("subscription")) {
                    m141405E0();
                    break;
                }
                break;
            case 466760814:
                if (name.equals(Visitor.TYPE)) {
                    m141407H0();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m141420P0(@Nullable IntlTabMePayGuide intlTabMePayGuide) {
        if (intlTabMePayGuide != null) {
            boolean z = intlTabMePayGuide.showBanner;
            ProfilePrivilegePayGuide profilePrivilegePayGuide = this.profilePrivilegePayGuide;
            ProfilePrivilegePayGuide profilePrivilegePayGuide2 = null;
            if (z) {
                if (profilePrivilegePayGuide == null) {
                    View viewInflate = m141447f0().inflate();
                    viewInflate.getClass();
                    this.profilePrivilegePayGuide = (ProfilePrivilegePayGuide) viewInflate;
                }
                ProfilePrivilegePayGuide profilePrivilegePayGuide3 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide3 == null) {
                    Intrinsics.m87502r("profilePrivilegePayGuide");
                    profilePrivilegePayGuide3 = null;
                }
                boolean zM43291l0 = profilePrivilegePayGuide3.m43291l0();
                ProfilePrivilegePayGuide profilePrivilegePayGuide4 = this.profilePrivilegePayGuide;
                if (zM43291l0) {
                    if (profilePrivilegePayGuide4 == null) {
                        Intrinsics.m87502r("profilePrivilegePayGuide");
                        profilePrivilegePayGuide4 = null;
                    }
                    xdl0.m208344M(profilePrivilegePayGuide4, true);
                    ProfilePrivilegePayGuide profilePrivilegePayGuide5 = this.profilePrivilegePayGuide;
                    if (profilePrivilegePayGuide5 == null) {
                        Intrinsics.m87502r("profilePrivilegePayGuide");
                    } else {
                        profilePrivilegePayGuide2 = profilePrivilegePayGuide5;
                    }
                    profilePrivilegePayGuide2.m43292m0(intlTabMePayGuide, getAct());
                } else {
                    if (profilePrivilegePayGuide4 == null) {
                        Intrinsics.m87502r("profilePrivilegePayGuide");
                    } else {
                        profilePrivilegePayGuide2 = profilePrivilegePayGuide4;
                    }
                    xdl0.m208344M(profilePrivilegePayGuide2, false);
                }
            } else if (profilePrivilegePayGuide != null) {
                if (profilePrivilegePayGuide == null) {
                    Intrinsics.m87502r("profilePrivilegePayGuide");
                    profilePrivilegePayGuide = null;
                }
                profilePrivilegePayGuide.m43294o0(getAct());
                ProfilePrivilegePayGuide profilePrivilegePayGuide6 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide6 == null) {
                    Intrinsics.m87502r("profilePrivilegePayGuide");
                } else {
                    profilePrivilegePayGuide2 = profilePrivilegePayGuide6;
                }
                xdl0.m208344M(profilePrivilegePayGuide2, false);
            }
        }
        this.intlMeTabDiscountEntryHost.m217984d();
    }

    /* JADX INFO: renamed from: Q */
    public final void m141421Q() {
        c4g0 c4g0Var = this.createSub;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
        this.createSub = null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m141422Q0(@NotNull String coin) {
        coin.getClass();
        xdl0.m208335H0(m141474t0(), coin);
        LuckyTtConfig luckyTtConfig = CoreModule.f17545c.f19654j0.f19296i0;
        if (!NullChecker.m81303a(luckyTtConfig) || TextUtils.isEmpty(luckyTtConfig.iconUrl) || CoreModule.f17545c.f19654j0.f19291d0.get().booleanValue()) {
            xdl0.m208344M(m141472s0(), false);
        } else {
            qib0.f154691G.m102331L0(m141472s0(), luckyTtConfig.iconUrl);
            xdl0.m208344M(m141472s0(), true);
        }
    }

    /* JADX INFO: renamed from: R */
    public final ProfileItem m141423R() {
        return (ProfileItem) this.boostItem.getValue();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m141424R0() {
        if (CoreModule.f17545c.f19620X1.m115675p3() && NullChecker.m81303a(m141468q0())) {
            m141468q0().m223588w(x2c0.f189485Kf, new View.OnClickListener() { // from class: l.zg30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh30.m141400y(this.f203009a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: S, reason: from getter */
    public final zbo getIntlMeTabDiscountEntryHost() {
        return this.intlMeTabDiscountEntryHost;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m141426S0(@Nullable HideAndSeekBannerData data) {
        if (NullChecker.m81303a(m141444d0())) {
            dfx.INSTANCE.m111515f();
            if (data != null) {
                xdl0.m208344M(m141444d0(), data.visible);
                if (data.visible) {
                    qib0.f154691G.m102331L0(m141444d0(), data.gameBanner);
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final ProfileItem m141427T() {
        return (ProfileItem) this.likeItem.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m141428T0(@NotNull final RiskSelfData risk) {
        risk.getClass();
        this.mRiskSelfData = risk;
        if (!NullChecker.m81303a(risk) || TextUtils.isEmpty(risk.ceilText)) {
            xdl0.m208344M(m141449g0(), false);
            return;
        }
        m141451h0().setText(risk.ceilText);
        xdl0.m208344M(m141449g0(), true);
        xdl0.m208329E0(m141449g0(), new View.OnClickListener() { // from class: l.yg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141401z(this.f198124a, risk, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final ProfileItem m141429U() {
        return (ProfileItem) this.picksItem.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m141430U0(@NotNull List<PurchaseType> purchaseTypes, boolean force) {
        int iIndexOf;
        purchaseTypes.getClass();
        List<PurchaseType> list = purchaseTypes;
        xdl0.m208344M(m141466p0(), !vwb.m200296J(list));
        if (m141466p0().m43283d(this.frag, purchaseTypes, force) && !list.isEmpty() && CoreModule.f17545c.f19696x0.m30179I3() != null && (iIndexOf = purchaseTypes.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE)) >= 0) {
            m141466p0().m43281b(iIndexOf);
        }
        this.intlMeTabDiscountEntryHost.m217984d();
    }

    /* JADX INFO: renamed from: V */
    public final ProfileItem m141431V() {
        return (ProfileItem) this.seeItem.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m141432V0(@Nullable List<Picture.ImageUri> avatars) {
        if (avatars == null || vwb.m200296J(avatars)) {
            xdl0.m208359W(m141431V().f26470b, t100.f167266o);
            VDraweeView vDraweeView = this.seeOne;
            if (vDraweeView != null) {
                xdl0.m208344M(vDraweeView, false);
            }
            VDraweeView vDraweeView2 = this.seeTwo;
            if (vDraweeView2 != null) {
                xdl0.m208344M(vDraweeView2, false);
                return;
            }
            return;
        }
        m141408I0(avatars.size());
        if (avatars.size() == 1) {
            VDraweeView vDraweeView3 = this.seeTwo;
            if (vDraweeView3 != null) {
                m141415N(vDraweeView3, avatars.get(0));
            }
            VDraweeView vDraweeView4 = this.seeOne;
            if (vDraweeView4 != null) {
                xdl0.m208344M(vDraweeView4, false);
            }
            xdl0.m208359W(m141431V().f26470b, t100.f167271t);
            return;
        }
        if (avatars.size() > 1) {
            VDraweeView vDraweeView5 = this.seeTwo;
            if (vDraweeView5 != null) {
                m141415N(vDraweeView5, avatars.get(0));
            }
            VDraweeView vDraweeView6 = this.seeOne;
            if (vDraweeView6 != null) {
                m141415N(vDraweeView6, avatars.get(1));
            }
            xdl0.m208359W(m141431V().f26470b, t100.f167231F);
        }
    }

    /* JADX INFO: renamed from: W */
    public final ProfileItem m141433W() {
        return (ProfileItem) this.subscriptionItem.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m141434W0(@NotNull final String publicId) {
        publicId.getClass();
        Act act = getAct();
        if (act != null) {
            xdl0.m208335H0(m141446e0(), act.getString(R$string.f18239Wc) + ": " + publicId);
            xdl0.m208344M(m141442b0(), true);
            xdl0.m208329E0(m141442b0(), new View.OnClickListener() { // from class: l.ng30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh30.m141379X0(publicId, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final ProfileItem m141435X() {
        return (ProfileItem) this.suerLikeItem.getValue();
    }

    /* JADX INFO: renamed from: Y */
    public final ProfileItem m141436Y() {
        return (ProfileItem) this.visitorItem.getValue();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m141437Y0(@NotNull User user) {
        user.getClass();
        m141460m0().setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208335H0(m141460m0(), user.name);
        xdl0.m208344M(m141456k0(), lfn.INSTANCE.m149730e() && vwb.m200296J(user.profile.extensions.basic.intlFriendPurposeV2));
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VDraweeView m141438Z() {
        VDraweeView vDraweeView = this._background_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_background_avatar");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m141439Z0(@NotNull User user) {
        user.getClass();
        m141462n0().setImageResource(x2c0.f189654Pt);
        xdl0.m208344M(m141462n0(), user.isPicVerificationVerified());
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText m141440a0() {
        VText vText = this._ban_release_entrance;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_ban_release_entrance");
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m141441a1(@NotNull User user) {
        user.getClass();
        CoreModule.m29935P().m94654e().mo34986o7(getAct(), user, m141458l0(), true, true);
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VButton m141442b0() {
        VButton vButton = this._bt_id_copy;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_bt_id_copy");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m141443c0() {
        VText vText = this._fake_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_fake_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VDraweeView m141444d0() {
        VDraweeView vDraweeView = this._hide_and_seek;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_hide_and_seek");
        return null;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m141445d1() {
        xdl0.m208362Z(m141468q0());
    }

    @Override // p149l.s7m
    public void destroy() {
        this.intlMeTabDiscountEntryHost.m217982b();
        m141421Q();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VText m141446e0() {
        VText vText = this._id;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_id");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final ViewStub m141447f0() {
        ViewStub viewStub = this._intl_pay_guide;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m87502r("_intl_pay_guide");
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m141448f1(int count) {
        m141436Y().m43212f(count);
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final LinearLayout m141449g0() {
        LinearLayout linearLayout = this._intr_risk_banner;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_intr_risk_banner");
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m141450g1(boolean show) {
        m141423R().f26477i.setTextColor(Color.parseColor("#FE7E1D"));
        xdl0.m208359W(m141423R().f26472d, show ? t100.f167227B : 0);
        xdl0.m208344M(m141423R().f26477i, show);
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m141451h0() {
        VText vText = this._intr_risk_banner_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_intr_risk_banner_content");
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m141452h1(int which, boolean show) {
        VOnlineIndicator vOnlineIndicator;
        if (which != 0 || (vOnlineIndicator = this.settingDot) == null) {
            return;
        }
        xdl0.m208344M(vOnlineIndicator, show);
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VLinear m141453i0() {
        VLinear vLinear = this._item_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_item_layout");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m141410K(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VImage m141454j0() {
        VImage vImage = this._iv_edit;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_iv_edit");
        return null;
    }

    /* JADX INFO: renamed from: j1 */
    public final boolean m141455j1(@NotNull User user) {
        user.getClass();
        boolean zM191810S = u59.m191810S();
        if (NullChecker.m81303a(user)) {
            boolean z = user.isSVIP() && !user.isVIPExpired();
            if (!z && zM191810S) {
                return !user.isVIP() || n3b0.m157744s(null, 1, null);
            }
            if (z && !IntlCountryCodeController.m28115k()) {
                return true;
            }
        }
        return zM191810S;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VImage m141456k0() {
        VImage vImage = this._iv_edit_red_dot;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_iv_edit_red_dot");
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m141457k1(@NotNull String time) {
        time.getClass();
        if (!xdl0.m208349O0(m141429U().f26477i)) {
            xdl0.m208359W(m141429U().f26472d, t100.f167229D);
            xdl0.m208344M(m141429U().f26477i, true);
            m141429U().f26477i.setTextColor(Color.parseColor("#FE7E1D"));
        }
        xdl0.m208335H0(m141429U().f26477i, time);
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VImage m141458l0() {
        VImage vImage = this._name_container_img_vip;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_name_container_img_vip");
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m141459l1(final List<Item> items, final User user) {
        C22306c c22306cDuringCreated;
        C22306c c22306cOnBackpressureBuffer;
        C22306c c22306cMaterialize;
        C22306c c22306cTake;
        C22306c c22306cObserveOn;
        final Ref.IntRef intRef = new Ref.IntRef();
        c4g0 c4g0Var = this.createSub;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
        Act act = getAct();
        this.createSub = (act == null || (c22306cDuringCreated = act.duringCreated(C22306c.interval(500L, TimeUnit.MILLISECONDS))) == null || (c22306cOnBackpressureBuffer = c22306cDuringCreated.onBackpressureBuffer((long) items.size())) == null || (c22306cMaterialize = c22306cOnBackpressureBuffer.materialize()) == null || (c22306cTake = c22306cMaterialize.take(items.size())) == null || (c22306cObserveOn = c22306cTake.observeOn(jo0.m142408a())) == null) ? null : c22306cObserveOn.subscribe(mkd0.m154956H(new e30() { // from class: l.kg30
            @Override // p149l.e30
            public final void call(Object obj) {
                jh30.m141391m(intRef, items, this, user, (Notification) obj);
            }
        }, new e30() { // from class: l.lg30
            @Override // p149l.e30
            public final void call(Object obj) {
                jh30.m141388j((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m141460m0() {
        VText vText = this._name_container_tv_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name_container_tv_name");
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m141461m1(@NotNull Intent intent) {
        intent.getClass();
        this.frag.startActivity(intent);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VImage m141462n0() {
        VImage vImage = this._name_container_verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_name_container_verification_icon");
        return null;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m141463n1(@NotNull String time) {
        time.getClass();
        xdl0.m208335H0(m141423R().f26477i, time);
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: o */
    public boolean mo133498o() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VLinear m141464o0() {
        VLinear vLinear = this._new_me_linear;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_new_me_linear");
        return null;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m141465o1(@NotNull User user) {
        user.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final NewProfilePrivilegedPager m141466p0() {
        NewProfilePrivilegedPager newProfilePrivilegedPager = this._privilege_banner;
        if (newProfilePrivilegedPager != null) {
            return newProfilePrivilegedPager;
        }
        Intrinsics.m87502r("_privilege_banner");
        return null;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m141467p1() {
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            dfx.INSTANCE.m111521l();
            m141385e1();
        }
        xdl0.m208344M(m141443c0(), CoreModule.f17545c.f19639e0.m169464Z7());
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final VNavigationBar m141468q0() {
        VNavigationBar vNavigationBar = this._top_navigationbar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_top_navigationbar");
        return null;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m141469q1(@NotNull User user) {
        user.getClass();
        Long l2 = user.profile.receivedLikes;
        if (NullChecker.m81303a(l2)) {
            l2.getClass();
            if (l2.longValue() > this.receivedLikes) {
                this.receivedLikes = l2.longValue();
            }
        }
        xdl0.m208344M(m141431V().f26472d, true);
        m141431V().f26472d.setText(i0g0.m133847N(this.receivedLikes + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.frag.getString(R$string.f18430cl), this.frag.act().color(w0c0.f183892u1), eqh0.m117752c(3)));
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: r */
    public void mo133501r() {
        View viewInflate = this.frag.act().getLayoutInflater().inflate(f6c0.f96080x7, (ViewGroup) m141468q0(), false);
        m141468q0().setBackgroundColor(CoreModule.f17544b.getResources().getColor(w0c0.f183762E0));
        m141468q0().m223589z(viewInflate);
        m141468q0().setTitle(R$string.f19068xj);
        m141468q0().m223589z(m141404D0());
        m141413L0();
        this.intlMeTabDiscountEntryHost.m217981a(m141464o0(), m141466p0());
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final LinearLayout m141470r0() {
        LinearLayout linearLayout = this._wallet_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_wallet_layout");
        return null;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m141471r1(@NotNull User user) {
        user.getClass();
        int childCount = m141453i0().getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (Intrinsics.m87488d(ViewGroupKt.m1328a(m141453i0(), i), m141429U())) {
                if (m141478v0(user) && !xdl0.m208349O0(m141429U())) {
                    dfx.INSTANCE.m111519j();
                }
                xdl0.m208344M(m141429U(), m141478v0(user));
            }
            if (Intrinsics.m87488d(ViewGroupKt.m1328a(m141453i0(), i), m141427T())) {
                if (m141455j1(user) && !xdl0.m208349O0(m141427T())) {
                    dfx.INSTANCE.m111516g();
                }
                xdl0.m208344M(m141427T(), m141455j1(user));
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final VDraweeView m141472s0() {
        VDraweeView vDraweeView = this._wallet_layout_luckytantan;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_wallet_layout_luckytantan");
        return null;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m141473s1() {
        String string;
        xdl0.m208329E0(m141433W(), new View.OnClickListener() { // from class: l.rg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141396u(this.f159224a, view);
            }
        });
        boolean z = (vdj.m198001c() || nkp.m159983b()) ? false : true;
        if (!IntlCountryCodeController.m28119o()) {
            z = false;
        }
        if (z) {
            xdl0.m208344M(m141433W(), false);
        }
        m141433W().m43213g(false);
        xdl0.m208344M(m141433W().f26472d, false);
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM30177H3 = CoreModule.f17545c.f19696x0.m30177H3("meTabSubscriptionTab");
        if (iapAffiliatePromotionDisplaySlotM30177H3 != null) {
            String str = iapAffiliatePromotionDisplaySlotM30177H3.mainTitle;
            if (!(str == null || str.length() == 0)) {
                xdl0.m208344M(m141433W().f26472d, true);
                m141433W().f26472d.setTextColor(Color.parseColor("#FE7E1D"));
                m141433W().f26472d.setText(iapAffiliatePromotionDisplaySlotM30177H3.mainTitle);
                CoreModule.f17545c.f19696x0.m30179I3();
                xdl0.m208329E0(m141433W(), new View.OnClickListener() { // from class: l.sg30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jh30.m141382c(this.f164367a, view);
                    }
                });
                return;
            }
        }
        if (CoreModule.f17545c.f19654j0.m30604Q4() && !u59.m191817Z()) {
            m141433W().f26472d.setTextColor(Color.parseColor("#FE7E1D"));
            eg30 eg30Var = this.presenter;
            if (eg30Var == null) {
                Intrinsics.m87502r("presenter");
                eg30Var = null;
            }
            eg30Var.m116231x2();
            return;
        }
        if (h6a.m129470c()) {
            C4732c c4732c = CoreModule.f17545c;
            if (c4732c.f19569G2.f80117R == null || !c4732c.f19654j0.m30602P4()) {
                return;
            }
            xdl0.m208344M(m141433W().f26472d, true);
            m141433W().f26472d.setTextColor(Color.parseColor("#FE7E1D"));
            VText vText = m141433W().f26472d;
            if (CoreModule.f17545c.f19569G2.m105982j3()) {
                string = this.frag.getString(R$string.f17643Cg);
            } else {
                string = ((TEnum.equals(CoreModule.f17545c.f19569G2.m105981i3(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(CoreModule.f17545c.f19569G2.m105981i3(), ProductCategory.tttSeeUpgradeToPremium)) && CoreModule.f17545c.f19654j0.m30602P4()) ? this.frag.getString(R$string.f17733Fg) : this.frag.getString(R$string.f17793Hg);
            }
            vText.setText(string);
            if ((TEnum.equals(CoreModule.f17545c.f19569G2.m105981i3(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(CoreModule.f17545c.f19569G2.m105981i3(), ProductCategory.tttSeeUpgradeToPremium)) && CoreModule.f17545c.f19654j0.m30602P4()) {
                xdl0.m208329E0(m141433W(), new View.OnClickListener() { // from class: l.tg30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jh30.m141399x(this.f170056a, view);
                    }
                });
            } else {
                xdl0.m208329E0(m141433W(), new View.OnClickListener() { // from class: l.ug30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jh30.m141369A(this.f176352a, view);
                    }
                });
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final VText m141474t0() {
        VText vText = this._wallet_layout_wallet_coin;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_wallet_layout_wallet_coin");
        return null;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m141475t1() {
        if (CoreModule.f17545c.f19654j0.f19294g0) {
            return;
        }
        m141433W().m43209c();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m141476u0() {
        m141433W().m43213g(false);
        xdl0.m208344M(m141433W().f26472d, false);
        m141473s1();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m141477u1(@NotNull String subTitle) {
        subTitle.getClass();
        xdl0.m208344M(m141433W().f26472d, true);
        xdl0.m208359W(m141433W().f26472d, m141433W().f26475g.getWidth());
        m141433W().m43215i(subTitle);
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m141478v0(User user) {
        if (!NullChecker.m81303a(user) || !user.isSVIP() || user.isVIPExpired() || IntlCountryCodeController.m28115k()) {
            return u59.m191810S();
        }
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m141479v1() {
        if (this.visitorItemEnable) {
            dfx.INSTANCE.m111530u();
        }
        if (xdl0.m208349O0(m141449g0())) {
            RiskSelfData riskSelfData = this.mRiskSelfData;
            RiskSelfData riskSelfData2 = null;
            if (riskSelfData == null) {
                Intrinsics.m87502r("mRiskSelfData");
                riskSelfData = null;
            }
            if (NullChecker.m81303a(riskSelfData)) {
                RiskSelfData riskSelfData3 = this.mRiskSelfData;
                if (riskSelfData3 == null) {
                    Intrinsics.m87502r("mRiskSelfData");
                } else {
                    riskSelfData2 = riskSelfData3;
                }
                zvf0.m220368A("e_navigation_risk_user_warning", OMSDialogPositon.p_navigation_view, vwb.m200311Y("user_risk_type", riskSelfData2.type));
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final ProfileItem m141480w0() {
        m141481x0(m141423R(), x2c0.f189516Lf, R$string.f19049x0, R$string.f18117Sa);
        xdl0.m208329E0(m141423R(), new View.OnClickListener() { // from class: l.wg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141383d(this.f186140a, view);
            }
        });
        dfx.INSTANCE.m111513d();
        return m141423R();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m141481x0(ProfileItem item, int icon, int title, int subTitle) {
        if (m141453i0().indexOfChild(item) == -1) {
            m141453i0().addView(item);
        }
        LinearLayout linearLayout = item.f26470b;
        int i = t100.f167261j;
        xdl0.m208360X(linearLayout, i);
        xdl0.m208357U(item.f26470b, i);
        item.m43216j(CoreModule.f17544b.getString(title));
        item.setIconRes(icon);
        item.setMinimumHeight(t100.f167235J);
        if (subTitle != 0) {
            item.setSubtitle(CoreModule.f17544b.getString(subTitle));
        }
        item.f26471c.setTextSize(15.0f);
        item.f26472d.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: y0 */
    public final ProfileItem m141482y0(User user) {
        m141481x0(m141427T(), x2c0.f189547Mf, R$string.f18209Vc, R$string.f18179Uc);
        if (uld0.m194220e().m194228k()) {
            m141427T().m43214h(true);
        }
        xdl0.m208329E0(m141427T(), new View.OnClickListener() { // from class: l.xg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141381b(this.f192736a, view);
            }
        });
        if (m141455j1(user)) {
            dfx.INSTANCE.m111516g();
        }
        xdl0.m208344M(m141427T(), m141455j1(user));
        return m141427T();
    }

    /* JADX INFO: renamed from: z0 */
    public final ProfileItem m141483z0(User user) {
        m141481x0(m141429U(), x2c0.f189578Nf, R$string.f19060xb, R$string.f18057Qa);
        xdl0.m208329E0(m141429U(), new View.OnClickListener() { // from class: l.mg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m141380a(this.f133640a, view);
            }
        });
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        userM169527p9.getClass();
        if (m141478v0(userM169527p9)) {
            dfx.INSTANCE.m111519j();
        }
        ProfileItem profileItemM141429U = m141429U();
        User userM169527p10 = CoreModule.f17545c.f19639e0.m169527p9();
        userM169527p10.getClass();
        xdl0.m208344M(profileItemM141429U, m141478v0(userM169527p10));
        return m141429U();
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: x2 */
    public void mo133503x2() {
    }
}
