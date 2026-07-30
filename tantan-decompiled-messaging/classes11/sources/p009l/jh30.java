package p009l;

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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p000p1.mobile.putong.core.newui.main.C0260a;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p000p1.mobile.putong.core.newui.profile.ProfileItem;
import com.p000p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import com.p000p1.mobile.putong.core.newui.profile.newme.ProfilePrivilegePayGuide;
import com.p000p1.mobile.putong.core.p002ui.intl.visitor.IntlVisitorsAct;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlLikedUsersAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.HideAndSeekBannerData;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p1.mobile.putong.core.data.Item;
import com.p1.mobile.putong.core.data.LuckyTtConfig;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RiskSelfData;
import com.p1.mobile.putong.core.map.IntlHideAndSeekAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.toppicks.TopPicksAct;
import com.p1.mobile.putong.core.ui.wallet.TanTanCoinAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.web.WebPicUploadResult;
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
import l.bll0;
import l.c4g0;
import l.c4p;
import l.c690;
import l.cxq;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.g30;
import l.h6a;
import l.j760;
import l.jo0;
import l.jyo;
import l.kh30;
import l.lsi0;
import l.m4p;
import l.m73;
import l.mkd0;
import l.n3b0;
import l.nkp;
import l.qib0;
import l.qwp;
import l.swh0;
import l.t100;
import l.u59;
import l.uld0;
import l.vdj;
import l.vwb;
import l.w0c0;
import l.wvv;
import l.x2c0;
import l.x93;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Notification;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VOnlineIndicator;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ä\u00022\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0093\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0019\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J/\u0010.\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001fH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020)H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0002¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00101J\u0017\u00104\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020)H\u0002¢\u0006\u0004\b7\u00101J\u000f\u00108\u001a\u00020)H\u0002¢\u0006\u0004\b8\u00101J\u0017\u0010:\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000fH\u0016¢\u0006\u0004\bB\u0010\u0013J!\u0010C\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bC\u0010AJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0013J\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010\u0013J\u000f\u0010F\u001a\u000209H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u0002H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u0013J\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u000f¢\u0006\u0004\bO\u0010\u0013J\u0015\u0010P\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\u000f2\b\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u0015¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020%¢\u0006\u0004\bZ\u0010[J\u0015\u0010\\\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\\\u0010QJ\u0015\u0010]\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b]\u0010QJ\u0015\u0010^\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b^\u0010QJ\u0015\u0010`\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u0015¢\u0006\u0004\b`\u0010XJ\r\u0010a\u001a\u000209¢\u0006\u0004\ba\u0010GJ\u0015\u0010b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bb\u0010QJ\u0015\u0010c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bc\u0010QJ#\u0010g\u001a\u00020\u000f2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\n2\u0006\u0010f\u001a\u000209¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u001f¢\u0006\u0004\bj\u0010\"J!\u0010n\u001a\u00020\u000f2\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\r0k¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020\u000f¢\u0006\u0004\bp\u0010\u0013J\u0015\u0010q\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bq\u0010QJ\u001d\u0010s\u001a\u00020\u000f2\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\n¢\u0006\u0004\bs\u0010tJ\r\u0010u\u001a\u00020\u000f¢\u0006\u0004\bu\u0010\u0013J\u0015\u0010w\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u001f¢\u0006\u0004\bw\u0010\"J\u0015\u0010x\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bx\u0010;J\r\u0010y\u001a\u00020\u000f¢\u0006\u0004\by\u0010\u0013J\r\u0010z\u001a\u00020\u000f¢\u0006\u0004\bz\u0010\u0013J\r\u0010{\u001a\u00020\u000f¢\u0006\u0004\b{\u0010\u0013J\u0015\u0010|\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0015¢\u0006\u0004\b|\u0010XJ\u0015\u0010~\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020\u0015¢\u0006\u0004\b~\u0010XJ\u0018\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u000209¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0017\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020\u0015¢\u0006\u0005\b\u0082\u0001\u0010XJ\u001a\u0010\u0085\u0001\u001a\u00020\u000f2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J!\u0010\u0088\u0001\u001a\u00020\u000f2\u0007\u0010\u0087\u0001\u001a\u00020\u001f2\u0006\u0010\u007f\u001a\u000209¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u008a\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008a\u0001\u0010\u0013J\u001c\u0010\u008d\u0001\u001a\u00020\u000f2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u000f2\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001b\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010®\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010¶\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R*\u0010¾\u0001\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R*\u0010Æ\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Ê\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÇ\u0001\u0010Á\u0001\u001a\u0006\bÈ\u0001\u0010Ã\u0001\"\u0006\bÉ\u0001\u0010Å\u0001R*\u0010Î\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bË\u0001\u0010Á\u0001\u001a\u0006\bÌ\u0001\u0010Ã\u0001\"\u0006\bÍ\u0001\u0010Å\u0001R*\u0010Ö\u0001\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R*\u0010Þ\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010â\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010Ù\u0001\u001a\u0006\bà\u0001\u0010Û\u0001\"\u0006\bá\u0001\u0010Ý\u0001R*\u0010æ\u0001\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bã\u0001\u0010¹\u0001\u001a\u0006\bä\u0001\u0010»\u0001\"\u0006\bå\u0001\u0010½\u0001R*\u0010ê\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bç\u0001\u0010±\u0001\u001a\u0006\bè\u0001\u0010³\u0001\"\u0006\bé\u0001\u0010µ\u0001R)\u0010í\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bF\u0010Á\u0001\u001a\u0006\bë\u0001\u0010Ã\u0001\"\u0006\bì\u0001\u0010Å\u0001R*\u0010ñ\u0001\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bî\u0001\u0010Ñ\u0001\u001a\u0006\bï\u0001\u0010Ó\u0001\"\u0006\bð\u0001\u0010Õ\u0001R*\u0010õ\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bò\u0001\u0010Ù\u0001\u001a\u0006\bó\u0001\u0010Û\u0001\"\u0006\bô\u0001\u0010Ý\u0001R)\u0010ø\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bB\u0010Ù\u0001\u001a\u0006\bö\u0001\u0010Û\u0001\"\u0006\b÷\u0001\u0010Ý\u0001R*\u0010ü\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bù\u0001\u0010Á\u0001\u001a\u0006\bú\u0001\u0010Ã\u0001\"\u0006\bû\u0001\u0010Å\u0001R*\u0010\u0084\u0002\u001a\u00030ý\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R*\u0010\u008c\u0002\u001a\u00030\u0085\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002\"\u0006\b\u008a\u0002\u0010\u008b\u0002R*\u0010\u0090\u0002\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010¹\u0001\u001a\u0006\b\u008e\u0002\u0010»\u0001\"\u0006\b\u008f\u0002\u0010½\u0001R*\u0010\u0094\u0002\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010Ù\u0001\u001a\u0006\b\u0092\u0002\u0010Û\u0001\"\u0006\b\u0093\u0002\u0010Ý\u0001R*\u0010\u0098\u0002\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010Á\u0001\u001a\u0006\b\u0096\u0002\u0010Ã\u0001\"\u0006\b\u0097\u0002\u0010Å\u0001R*\u0010\u009c\u0002\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0002\u0010Ñ\u0001\u001a\u0006\b\u009a\u0002\u0010Ó\u0001\"\u0006\b\u009b\u0002\u0010Õ\u0001R*\u0010¤\u0002\u001a\u00030\u009d\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010¡\u0002\"\u0006\b¢\u0002\u0010£\u0002R*\u0010¬\u0002\u001a\u00030¥\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0002\u0010§\u0002\u001a\u0006\b¨\u0002\u0010©\u0002\"\u0006\bª\u0002\u0010«\u0002R*\u0010°\u0002\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u00ad\u0002\u0010Ñ\u0001\u001a\u0006\b®\u0002\u0010Ó\u0001\"\u0006\b¯\u0002\u0010Õ\u0001R*\u0010´\u0002\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0002\u0010Á\u0001\u001a\u0006\b²\u0002\u0010Ã\u0001\"\u0006\b³\u0002\u0010Å\u0001R*\u0010¸\u0002\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bµ\u0002\u0010±\u0001\u001a\u0006\b¶\u0002\u0010³\u0001\"\u0006\b·\u0002\u0010µ\u0001R\u0018\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u001f\u0010¾\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b»\u0002\u0010¼\u0002\u001a\u0005\b½\u0002\u00101R\u001f\u0010Á\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¿\u0002\u0010¼\u0002\u001a\u0005\bÀ\u0002\u00101R\u001f\u0010Ä\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÂ\u0002\u0010¼\u0002\u001a\u0005\bÃ\u0002\u00101R\u001f\u0010Ç\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÅ\u0002\u0010¼\u0002\u001a\u0005\bÆ\u0002\u00101R\u001f\u0010Ê\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÈ\u0002\u0010¼\u0002\u001a\u0005\bÉ\u0002\u00101R\u001e\u0010Ì\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b@\u0010¼\u0002\u001a\u0005\bË\u0002\u00101R\u001e\u0010Î\u0002\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u001d\u0010¼\u0002\u001a\u0005\bÍ\u0002\u00101R\u0019\u0010Ð\u0002\u001a\u00030Ï\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010È\u0002R\u001b\u0010Ó\u0002\u001a\u0005\u0018\u00010Ñ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010Ò\u0002R\u0018\u0010Ô\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010Ò\u0001R\u0019\u0010Ö\u0002\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0017\u0010Õ\u0002R\u0019\u0010Ù\u0002\u001a\u00030×\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0012\u0010Ø\u0002R\u001d\u0010Þ\u0002\u001a\u00030Ú\u00028\u0006¢\u0006\u0010\n\u0006\bÀ\u0002\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u001c\u0010á\u0002\u001a\u0005\u0018\u00010ß\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0002\u0010à\u0002R\u001c\u0010â\u0002\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010Ñ\u0001R\u001c\u0010ã\u0002\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0002\u0010Ñ\u0001¨\u0006å\u0002"}, d2 = {"Ll/jh30;", "Ll/rta0;", "Ll/eg30;", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;)V", "Landroid/view/View;", "D0", "()Landroid/view/View;", "", "Lcom/p1/mobile/putong/core/data/Item;", "items", "Lcom/p1/mobile/putong/data/User;", "user", "", "l1", "(Ljava/util/List;Lcom/p1/mobile/putong/data/User;)V", "Q", "()V", "K0", "", "name", "P", "(Ljava/lang/String;Lcom/p1/mobile/putong/data/User;)V", "L0", "e1", "Lcom/p1/mobile/putong/data/PhoneNumber;", "phoneNumber", "L", "(Lcom/p1/mobile/putong/data/PhoneNumber;)V", "", "size", "I0", "(I)V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "image", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "url", "N", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;)V", "Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", "item", "icon", "title", "subTitle", "x0", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;III)V", "A0", "()Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", "w0", "G0", "z0", "(Lcom/p1/mobile/putong/data/User;)Lcom/p1/mobile/putong/core/newui/profile/ProfileItem;", "y0", "E0", "H0", "", "v0", "(Lcom/p1/mobile/putong/data/User;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "K", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "inflateView", "D1", "x2", "o", "()Z", "presenter", "M", "(Ll/eg30;)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "d1", "Y0", "(Lcom/p1/mobile/putong/data/User;)V", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "intlTabMePayGuide", "P0", "(Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;)V", "publicId", "W0", "(Ljava/lang/String;)V", "uri", "N0", "(Lcom/p1/mobile/putong/data/Picture$ImageUri;)V", "o1", "a1", "Z0", "coin", "Q0", "J0", "B0", "r1", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "force", "U0", "(Ljava/util/List;Z)V", "position", "O", "Ll/j760;", "Lcom/p1/mobile/putong/core/data/AppealInfo;", "pair", "O0", "(Ll/j760;)V", "p1", "q1", "avatars", "V0", "(Ljava/util/List;)V", "v1", "count", "f1", "j1", "u0", "t1", "s1", "u1", "time", "n1", "show", "g1", "(Z)V", "k1", "Landroid/content/Intent;", "intent", "m1", "(Landroid/content/Intent;)V", "which", "h1", "(IZ)V", "R0", "Lcom/p1/mobile/putong/core/data/HideAndSeekBannerData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "S0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekBannerData;)V", "Lcom/p1/mobile/putong/core/data/RiskSelfData;", "risk", "T0", "(Lcom/p1/mobile/putong/core/data/RiskSelfData;)V", "a", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "Lv/VRelative;", "b", "Lv/VRelative;", "get_new_tab_me", "()Lv/VRelative;", "set_new_tab_me", "(Lv/VRelative;)V", "_new_tab_me", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "q0", "()Lv/navigationbar/VNavigationBar;", "set_top_navigationbar", "(Lv/navigationbar/VNavigationBar;)V", "_top_navigationbar", "Landroid/widget/ScrollView;", "d", "Landroid/widget/ScrollView;", "get_content_view", "()Landroid/widget/ScrollView;", "set_content_view", "(Landroid/widget/ScrollView;)V", "_content_view", "Lv/VLinear;", "e", "Lv/VLinear;", "o0", "()Lv/VLinear;", "set_new_me_linear", "(Lv/VLinear;)V", "_new_me_linear", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "g0", "()Landroid/widget/LinearLayout;", "set_intr_risk_banner", "(Landroid/widget/LinearLayout;)V", "_intr_risk_banner", "Lv/VText;", "g", "Lv/VText;", "h0", "()Lv/VText;", "set_intr_risk_banner_content", "(Lv/VText;)V", "_intr_risk_banner_content", "h", "a0", "set_ban_release_entrance", "_ban_release_entrance", "i", "c0", "set_fake_tip", "_fake_tip", "Lv/VDraweeView;", "j", "Lv/VDraweeView;", "Z", "()Lv/VDraweeView;", "set_background_avatar", "(Lv/VDraweeView;)V", "_background_avatar", "Lv/VImage;", "k", "Lv/VImage;", "j0", "()Lv/VImage;", "set_iv_edit", "(Lv/VImage;)V", "_iv_edit", "l", "k0", "set_iv_edit_red_dot", "_iv_edit_red_dot", "m", "get_user_desc_container", "set_user_desc_container", "_user_desc_container", "n", "get_name_container", "set_name_container", "_name_container", "m0", "set_name_container_tv_name", "_name_container_tv_name", "p", "get_name_container_emoji", "set_name_container_emoji", "_name_container_emoji", "q", "n0", "set_name_container_verification_icon", "_name_container_verification_icon", "l0", "set_name_container_img_vip", "_name_container_img_vip", "s", "e0", "set_id", "_id", "Lv/VButton;", "t", "Lv/VButton;", "b0", "()Lv/VButton;", "set_bt_id_copy", "(Lv/VButton;)V", "_bt_id_copy", "Landroid/widget/Space;", "u", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "v", "r0", "set_wallet_layout", "_wallet_layout", "w", "get_wallet_layout_wallet_icon", "set_wallet_layout_wallet_icon", "_wallet_layout_wallet_icon", "x", "t0", "set_wallet_layout_wallet_coin", "_wallet_layout_wallet_coin", "y", "s0", "set_wallet_layout_luckytantan", "_wallet_layout_luckytantan", "Landroid/view/ViewStub;", "z", "Landroid/view/ViewStub;", "f0", "()Landroid/view/ViewStub;", "set_intl_pay_guide", "(Landroid/view/ViewStub;)V", "_intl_pay_guide", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "A", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "p0", "()Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "set_privilege_banner", "(Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;)V", "_privilege_banner", "B", "d0", "set_hide_and_seek", "_hide_and_seek", "C", "get_service_plu", "set_service_plu", "_service_plu", "D", "i0", "set_item_layout", "_item_layout", "E", "Ll/eg30;", "F", "Lkotlin/Lazy;", "V", "seeItem", "G", "R", "boostItem", "H", "X", "suerLikeItem", "I", "T", "likeItem", "J", "U", "picksItem", "Y", "visitorItem", "W", "subscriptionItem", "", "receivedLikes", "Lv/VOnlineIndicator;", "Lv/VOnlineIndicator;", "settingDot", "visitorItemEnable", "Lcom/p1/mobile/putong/core/data/RiskSelfData;", "mRiskSelfData", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "profilePrivilegePayGuide", "Ll/zbo;", "Ll/zbo;", "S", "()Ll/zbo;", "intlMeTabDiscountEntryHost", "Ll/c4g0;", "Ll/c4g0;", "createSub", "seeTwo", "seeOne", "Companion", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.seeItem = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.fh30
            public final Object invoke() {
                return jh30.m17026n(this.f12997a);
            }
        });
        this.boostItem = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.gh30
            public final Object invoke() {
                return jh30.m17023k(this.f13563a);
            }
        });
        this.suerLikeItem = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.hh30
            public final Object invoke() {
                return jh30.m17018e(this.f14080a);
            }
        });
        this.likeItem = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.ih30
            public final Object invoke() {
                return jh30.m17011J(this.f14627a);
            }
        });
        this.picksItem = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.gg30
            public final Object invoke() {
                return jh30.m17029s(this.f13529a);
            }
        });
        this.visitorItem = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.hg30
            public final Object invoke() {
                return jh30.m17010I(this.f14067a);
            }
        });
        this.subscriptionItem = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.ig30
            public final Object invoke() {
                return jh30.m17007F(this.f14608a);
            }
        });
        this.intlMeTabDiscountEntryHost = new zbo(profileFrag);
    }

    /* JADX INFO: renamed from: A */
    public static void m17003A(jh30 jh30Var, View view) {
        c690.e(jh30Var.act(), "MINE_SUB_ITEM", PurchaseType.TYPE_ULTRA_PREMIUM, u59.K() ? new jyo() : new bll0());
    }

    /* JADX INFO: renamed from: B */
    public static Unit m17004B(jh30 jh30Var, View view) {
        view.getClass();
        Intent intentP2 = ProfileAct.p2(jh30Var.act(), qib0.b0.a.userId(), "profile_frag_menu", false, true);
        intentP2.putExtra("preview_type", 0);
        jh30Var.m17097m1(intentP2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static void m17005C(jh30 jh30Var, View view) {
        if (swh0.x0() > 0) {
            lsi0.w(R.string.Xs);
        } else if (CoreModule.c.e0.p9().isVIP() || u59.a0()) {
            c.H1(jh30Var.act(), "p_navigation_view,e_navigation_super_like,click", 0, (g30) null, 12, (Object) null);
        } else {
            c.O1(jh30Var.act(), "p_navigation_view,e_navigation_super_like,click", Privilege.vip_super_like, (d30) null, (d30) null, false, (User) null, (Object) null, (e30) null, 504, (Object) null);
        }
        dfx.INSTANCE.m13332q();
    }

    /* JADX INFO: renamed from: E */
    public static void m17006E(AppealInfo appealInfo, j760 j760Var, jh30 jh30Var, View view) {
        dfx.INSTANCE.m13316a();
        if (!appealInfo.allowAppeal) {
            lsi0.h(R.string.i0);
            return;
        }
        String str = appealInfo.status;
        int iHashCode = str.hashCode();
        if (iHashCode != -1392885889) {
            if (iHashCode == -1347010958 && str.equals("inProgress")) {
                Intent intentM70Y1 = AppealProgressAct.m70Y1(jh30Var.act());
                intentM70Y1.getClass();
                jh30Var.m17097m1(intentM70Y1);
                return;
            }
            return;
        }
        if (str.equals("before")) {
            Object obj = j760Var.b;
            obj.getClass();
            if (NullChecker.a(((User) obj).settings)) {
                Object obj2 = j760Var.b;
                obj2.getClass();
                Settings settings = ((User) obj2).settings;
                settings.getClass();
                if (NullChecker.b(settings.phoneNumber)) {
                    Object obj3 = j760Var.b;
                    obj3.getClass();
                    Settings settings2 = ((User) obj3).settings;
                    settings2.getClass();
                    PhoneNumber phoneNumber = settings2.phoneNumber;
                    phoneNumber.getClass();
                    jh30Var.m17047L(phoneNumber);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static ProfileItem m17007F(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: G */
    public static void m17008G(jh30 jh30Var, View view) {
        dfx.INSTANCE.m13320e();
        if (wvv.i(jh30Var.act(), R.string.ph, new d30() { // from class: l.vg30
            public final void call() {
                jh30.m17012M0();
            }
        })) {
            Intent intentY1 = IntlHideAndSeekAct.Y1(jh30Var.act());
            intentY1.getClass();
            jh30Var.m17097m1(intentY1);
        }
    }

    /* JADX INFO: renamed from: H */
    public static Unit m17009H(jh30 jh30Var, View view) {
        view.getClass();
        eg30 eg30Var = jh30Var.presenter;
        if (eg30Var == null) {
            Intrinsics.r("presenter");
            eg30Var = null;
        }
        eg30Var.m13936q2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static ProfileItem m17010I(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: J */
    public static ProfileItem m17011J(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m17012M0() {
        qib0.E.m9163t();
    }

    /* JADX INFO: renamed from: X0 */
    public static final void m17013X0(String str, View view) {
        e51.q(str);
        lsi0.w(R.string.Xc);
        dfx.INSTANCE.m13334s();
    }

    /* JADX INFO: renamed from: a */
    public static void m17014a(jh30 jh30Var, View view) {
        jh30Var.m17097m1(new Intent(jh30Var.m17038C0(), (Class<?>) TopPicksAct.class));
        dfx.INSTANCE.m13324i();
    }

    /* JADX INFO: renamed from: b */
    public static void m17015b(jh30 jh30Var, View view) {
        uld0.e().r();
        jh30Var.m17062T().m7435h(false);
        jh30Var.m17097m1(new Intent((Context) jh30Var.act(), (Class<?>) IntlLikedUsersAct.class));
    }

    /* JADX INFO: renamed from: c */
    public static void m17016c(jh30 jh30Var, View view) {
        IapAffiliatePromotion iapAffiliatePromotionI3 = CoreModule.c.x0.I3();
        Act act = jh30Var.act();
        if (iapAffiliatePromotionI3 != null && act != null) {
            m4p.j(act, iapAffiliatePromotionI3, "sub_management");
        }
        c690.e(jh30Var.act(), "MINE_SUB_ITEM", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, u59.K() ? new jyo() : new bll0());
    }

    /* JADX INFO: renamed from: d */
    public static void m17017d(jh30 jh30Var, View view) {
        dfx.INSTANCE.m13318c();
        if (CoreModule.c.J0.F3()) {
            m73.k(jh30Var.act());
        } else {
            x93.a.h(x93.Companion, jh30Var.act(), false, (d30) null, false, (String) null, 24, (Object) null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ProfileItem m17018e(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: e1 */
    private final void m17019e1() {
        xdl0.H0(m17078c0(), w1g.m23770a() ? CoreModule.Q().m9070sj() : this.frag.getString(R.string.v4));
    }

    /* JADX INFO: renamed from: i */
    public static void m17021i(jh30 jh30Var, View view) {
        eg30 eg30Var = jh30Var.presenter;
        if (eg30Var == null) {
            Intrinsics.r("presenter");
            eg30Var = null;
        }
        eg30Var.m13937r2();
    }

    /* JADX INFO: renamed from: j */
    public static void m17022j(Throwable th) {
        CrashHelper.c(th);
    }

    /* JADX INFO: renamed from: k */
    public static ProfileItem m17023k(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: l */
    public static void m17024l(jh30 jh30Var, View view) {
        dfx.INSTANCE.m13335t();
        jh30Var.m17097m1(new Intent(jh30Var.m17038C0(), (Class<?>) IntlVisitorsAct.class));
    }

    /* JADX INFO: renamed from: m */
    public static void m17025m(Ref.IntRef intRef, List list, jh30 jh30Var, User user, Notification notification) {
        if (intRef.element >= list.size()) {
            jh30Var.m17056Q();
            return;
        }
        int i = intRef.element;
        intRef.element = i + 1;
        String str = ((Item) list.get(i)).name;
        str.getClass();
        jh30Var.m17054P(str, user);
        if (intRef.element == list.size()) {
            jh30Var.m17046K0();
            jh30Var.m17056Q();
        }
    }

    /* JADX INFO: renamed from: n */
    public static ProfileItem m17026n(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: p */
    public static void m17027p(jh30 jh30Var, View view) {
        uld0.e().n();
        eg30 eg30Var = jh30Var.presenter;
        if (eg30Var == null) {
            Intrinsics.r("presenter");
            eg30Var = null;
        }
        eg30Var.m13939t2();
    }

    /* JADX INFO: renamed from: q */
    public static void m17028q(jh30 jh30Var, View view) {
        xdl0.M(jh30Var.m17108s0(), false);
        CoreModule.c.j0.d0.put(Boolean.TRUE);
        Intent intentX1 = TanTanCoinAct.X1(jh30Var.act());
        intentX1.getClass();
        jh30Var.m17097m1(intentX1);
    }

    /* JADX INFO: renamed from: s */
    public static ProfileItem m17029s(jh30 jh30Var) {
        return new ProfileItem(jh30Var.frag.getContext());
    }

    /* JADX INFO: renamed from: u */
    public static void m17030u(jh30 jh30Var, View view) {
        c690.e(jh30Var.act(), "MINE_SUB_ITEM", (PurchaseType) null, u59.K() ? new jyo() : new bll0());
    }

    /* JADX INFO: renamed from: w */
    public static void m17032w(jh30 jh30Var, View view) {
        qqh0.INSTANCE.m21184k(jh30Var.frag);
        dfx.INSTANCE.m13326k();
    }

    /* JADX INFO: renamed from: x */
    public static void m17033x(jh30 jh30Var, View view) {
        C0260a c0260aM3870V5;
        jyo jyoVar = u59.K() ? new jyo() : new bll0();
        if (CoreModule.c.G2.j3()) {
            CoreModule.c.G2.r3();
            NewMainAct newMainActAct = jh30Var.frag.act();
            NewMainAct newMainAct = newMainActAct instanceof NewMainAct ? newMainActAct : null;
            if (newMainAct != null && (c0260aM3870V5 = newMainAct.m3870V5()) != null) {
                c0260aM3870V5.m4533x9();
            }
        }
        c690.e(jh30Var.act(), "MINE_SUB_ITEM", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, jyoVar);
    }

    /* JADX INFO: renamed from: y */
    public static void m17034y(jh30 jh30Var, View view) {
        eg30 eg30Var = jh30Var.presenter;
        if (eg30Var == null) {
            Intrinsics.r("presenter");
            eg30Var = null;
        }
        eg30Var.m13938s2();
    }

    /* JADX INFO: renamed from: z */
    public static void m17035z(jh30 jh30Var, RiskSelfData riskSelfData, View view) {
        qwp.i().o(jh30Var.act(), riskSelfData.type, riskSelfData.popUpText);
        zvf0.u("e_navigation_risk_user_warning", "p_navigation_view", new j760[]{vwb.Y("user_risk_type", riskSelfData.type)});
    }

    /* JADX INFO: renamed from: A0 */
    public final ProfileItem m17036A0() {
        m17117x0(m17066V(), x2c0.Of, R.string.qn, 0);
        m17066V().f5249c.setMaxLines(2);
        User userP9 = CoreModule.c.e0.p9();
        userP9.getClass();
        m17105q1(userP9);
        xdl0.E0(m17066V(), new View.OnClickListener() { // from class: l.jg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17021i(this.f15108a, view);
            }
        });
        return m17066V();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m17037B0(@NotNull User user) {
        user.getClass();
        if (m17088i0().getChildCount() != 0) {
            return;
        }
        List<Item> listM21180g = qqh0.INSTANCE.m21180g();
        if (c4p.INSTANCE.e()) {
            m17095l1(listM21180g, user);
            return;
        }
        Iterator<Item> it = listM21180g.iterator();
        while (it.hasNext()) {
            String str = it.next().name;
            str.getClass();
            m17054P(str, user);
        }
        m17046K0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17038C0() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final View m17039D0() {
        View vImage = new VImage(m17038C0());
        vImage.setImageResource(x2c0.Tg);
        VFrame vFrame = new VFrame(m17038C0());
        vFrame.addView(vImage, new FrameLayout.LayoutParams(t100.d(32.0f), t100.d(32.0f)));
        int i = t100.j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 8388661;
        VOnlineIndicator vOnlineIndicator = new VOnlineIndicator(m17038C0());
        this.settingDot = vOnlineIndicator;
        vOnlineIndicator.setIndicatorStyle(1);
        VOnlineIndicator vOnlineIndicator2 = this.settingDot;
        if (vOnlineIndicator2 != null) {
            vOnlineIndicator2.setVisibility(8);
        }
        vFrame.setPadding(20, 4, 8, 4);
        vFrame.addView(this.settingDot, layoutParams);
        xdl0.E0(vFrame, new View.OnClickListener() { // from class: l.fg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17027p(this.f12992a, view);
            }
        });
        return vFrame;
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: D1 */
    public void mo16014D1() {
        ConstraintLayout constraintLayout = this.profilePrivilegePayGuide;
        if (constraintLayout != null) {
            ProfilePrivilegePayGuide profilePrivilegePayGuide = null;
            if (constraintLayout == null) {
                Intrinsics.r("profilePrivilegePayGuide");
                constraintLayout = null;
            }
            if (xdl0.O0(constraintLayout)) {
                ProfilePrivilegePayGuide profilePrivilegePayGuide2 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide2 == null) {
                    Intrinsics.r("profilePrivilegePayGuide");
                } else {
                    profilePrivilegePayGuide = profilePrivilegePayGuide2;
                }
                profilePrivilegePayGuide.m7516n0("");
            }
        }
        CoreModule.c.j0.Q5();
        this.intlMeTabDiscountEntryHost.m25650c();
    }

    /* JADX INFO: renamed from: E0 */
    public final ProfileItem m17040E0() {
        m17117x0(m17068W(), x2c0.Pf, R.string.Pa, R.string.gi);
        xdl0.X(m17068W().f5249c, 0);
        xdl0.M(m17068W().f5250d, false);
        m17109s1();
        return m17068W();
    }

    /* JADX INFO: renamed from: G0 */
    public final ProfileItem m17041G0() {
        m17117x0(m17070X(), x2c0.Qf, R.string.w, R.string.Ra);
        xdl0.E0(m17070X(), new View.OnClickListener() { // from class: l.og30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17005C(this.f18005a, view);
            }
        });
        dfx.INSTANCE.m13333r();
        return m17070X();
    }

    /* JADX INFO: renamed from: H0 */
    public final ProfileItem m17042H0() {
        m17117x0(m17071Y(), x2c0.Rf, R.string.Lb, R.string.Kb);
        xdl0.E0(m17071Y(), new View.OnClickListener() { // from class: l.ah30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17024l(this.f9498a, view);
            }
        });
        User userP9 = CoreModule.c.e0.p9();
        userP9.getClass();
        if (m17114v0(userP9)) {
            this.visitorItemEnable = true;
        }
        xdl0.M(m17071Y(), m17114v0(userP9));
        return m17071Y();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m17043I0(int size) {
        if (size == 0) {
            return;
        }
        if (this.seeTwo == null) {
            this.seeTwo = m17066V().f5259m.inflate();
        }
        if (size <= 1 || this.seeOne != null) {
            return;
        }
        this.seeOne = m17066V().f5258l.inflate();
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m17044J0() {
        return this.frag.isHidden();
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m17045K(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = kh30.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m17046K0() {
        View viewA = ViewGroupKt.a(m17088i0(), m17088i0().getChildCount() - 1);
        if (viewA instanceof ProfileItem) {
            ((ProfileItem) viewA).m7431d(false);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m17047L(PhoneNumber phoneNumber) {
        Intent intentBuildBanReleaseVerifyIntent = CoreModule.H().buildBanReleaseVerifyIntent(act(), phoneNumber);
        intentBuildBanReleaseVerifyIntent.getClass();
        m17097m1(intentBuildBanReleaseVerifyIntent);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m17048L0() {
        cxq.c(m17073Z(), new Function1() { // from class: l.qg30
            public final Object invoke(Object obj) {
                return jh30.m17009H(this.f19228a, (View) obj);
            }
        });
        cxq.c(m17090j0(), new Function1() { // from class: l.bh30
            public final Object invoke(Object obj) {
                return jh30.m17004B(this.f10102a, (View) obj);
            }
        });
        xdl0.E0(m17106r0(), new View.OnClickListener() { // from class: l.ch30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17028q(this.f10590a, view);
            }
        });
        xdl0.E0(m17078c0(), new View.OnClickListener() { // from class: l.dh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17032w(this.f11841a, view);
            }
        });
        xdl0.E0(m17079d0(), new View.OnClickListener() { // from class: l.eh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17008G(this.f12560a, view);
            }
        });
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void m17089i1(@NotNull eg30 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: N */
    public final void m17050N(SimpleDraweeView image, Picture.ImageUri url) {
        xdl0.M0(image, true);
        if (n3b0.s((Counter) null, 1, (Object) null)) {
            qib0.G.O(image, url.formatted(), 3, 5);
        } else {
            qib0.G.L0(image, url.formatted());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m17051N0(@NotNull Picture.ImageUri uri) {
        uri.getClass();
        qib0.G.J0(m17073Z(), uri, false);
    }

    /* JADX INFO: renamed from: O */
    public final void m17052O(int position) {
        m17102p0().m7502b(position);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m17053O0(@NotNull final j760<AppealInfo, User> pair) {
        pair.getClass();
        final AppealInfo appealInfo = (AppealInfo) pair.a;
        rc2.m21492e().m21499h(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            xdl0.M(m17075a0(), false);
            return;
        }
        if (!m17044J0() && !xdl0.O0(m17075a0())) {
            dfx.INSTANCE.m13317b();
        }
        VText vTextM17075a0 = m17075a0();
        boolean zEquals = TextUtils.equals(rc2.m21492e().m21494b(), "under_review");
        ProfileFrag profileFrag = this.frag;
        vTextM17075a0.setText(zEquals ? profileFrag.getString(R.string.m0) : profileFrag.getString(R.string.n0));
        xdl0.M(m17075a0(), true);
        xdl0.E0(m17075a0(), new View.OnClickListener() { // from class: l.pg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17006E(appealInfo, pair, this, view);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P */
    public final void m17054P(String name, User user) {
        switch (name.hashCode()) {
            case -332142190:
                if (name.equals("superlike")) {
                    m17041G0();
                    break;
                }
                break;
            case 113747:
                if (name.equals("see")) {
                    m17036A0();
                    break;
                }
                break;
            case 102974396:
                if (name.equals("likes")) {
                    m17118y0(user);
                    break;
                }
                break;
            case 106660978:
                if (name.equals("picks")) {
                    m17119z0(user);
                    break;
                }
                break;
            case 110726686:
                if (name.equals("turbo")) {
                    m17116w0();
                    break;
                }
                break;
            case 341203229:
                if (name.equals("subscription")) {
                    m17040E0();
                    break;
                }
                break;
            case 466760814:
                if (name.equals("visitor")) {
                    m17042H0();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX INFO: renamed from: P0 */
    public final void m17055P0(@Nullable IntlTabMePayGuide intlTabMePayGuide) {
        if (intlTabMePayGuide != null) {
            boolean z = intlTabMePayGuide.showBanner;
            ProfilePrivilegePayGuide profilePrivilegePayGuide = this.profilePrivilegePayGuide;
            ?? r3 = 0;
            ProfilePrivilegePayGuide profilePrivilegePayGuide2 = null;
            ?? r4 = 0;
            if (z) {
                if (profilePrivilegePayGuide == null) {
                    Object objInflate = m17082f0().inflate();
                    objInflate.getClass();
                    this.profilePrivilegePayGuide = (ProfilePrivilegePayGuide) objInflate;
                }
                ProfilePrivilegePayGuide profilePrivilegePayGuide3 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide3 == null) {
                    Intrinsics.r("profilePrivilegePayGuide");
                    profilePrivilegePayGuide3 = null;
                }
                boolean zM7514l0 = profilePrivilegePayGuide3.m7514l0();
                ProfilePrivilegePayGuide profilePrivilegePayGuide4 = this.profilePrivilegePayGuide;
                ?? r1 = profilePrivilegePayGuide4;
                if (zM7514l0) {
                    if (profilePrivilegePayGuide4 == null) {
                        Intrinsics.r("profilePrivilegePayGuide");
                        r1 = null;
                    }
                    xdl0.M((View) r1, true);
                    ProfilePrivilegePayGuide profilePrivilegePayGuide5 = this.profilePrivilegePayGuide;
                    if (profilePrivilegePayGuide5 == null) {
                        Intrinsics.r("profilePrivilegePayGuide");
                    } else {
                        profilePrivilegePayGuide2 = profilePrivilegePayGuide5;
                    }
                    profilePrivilegePayGuide2.m7515m0(intlTabMePayGuide, act());
                } else {
                    if (profilePrivilegePayGuide4 == null) {
                        Intrinsics.r("profilePrivilegePayGuide");
                    } else {
                        r4 = profilePrivilegePayGuide4;
                    }
                    xdl0.M((View) r4, false);
                }
            } else if (profilePrivilegePayGuide != null) {
                if (profilePrivilegePayGuide == null) {
                    Intrinsics.r("profilePrivilegePayGuide");
                    profilePrivilegePayGuide = null;
                }
                profilePrivilegePayGuide.m7517o0(act());
                ProfilePrivilegePayGuide profilePrivilegePayGuide6 = this.profilePrivilegePayGuide;
                if (profilePrivilegePayGuide6 == null) {
                    Intrinsics.r("profilePrivilegePayGuide");
                } else {
                    r3 = profilePrivilegePayGuide6;
                }
                xdl0.M((View) r3, false);
            }
        }
        this.intlMeTabDiscountEntryHost.m25651d();
    }

    /* JADX INFO: renamed from: Q */
    public final void m17056Q() {
        c4g0 c4g0Var = this.createSub;
        if (c4g0Var != null) {
            mkd0.z(c4g0Var);
        }
        this.createSub = null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m17057Q0(@NotNull String coin) {
        coin.getClass();
        xdl0.H0(m17110t0(), coin);
        LuckyTtConfig luckyTtConfig = CoreModule.c.j0.i0;
        if (!NullChecker.a(luckyTtConfig) || TextUtils.isEmpty(luckyTtConfig.iconUrl) || ((Boolean) CoreModule.c.j0.d0.get()).booleanValue()) {
            xdl0.M(m17108s0(), false);
        } else {
            qib0.G.L0(m17108s0(), luckyTtConfig.iconUrl);
            xdl0.M(m17108s0(), true);
        }
    }

    /* JADX INFO: renamed from: R */
    public final ProfileItem m17058R() {
        return (ProfileItem) this.boostItem.getValue();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m17059R0() {
        if (CoreModule.c.X1.p3() && NullChecker.a(m17104q0())) {
            m17104q0().w(x2c0.Kf, new View.OnClickListener() { // from class: l.zg30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh30.m17034y(this.f23646a, view);
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
    public final void m17061S0(@Nullable HideAndSeekBannerData data) {
        if (NullChecker.a(m17079d0())) {
            dfx.INSTANCE.m13321f();
            if (data != null) {
                xdl0.M(m17079d0(), data.visible);
                if (data.visible) {
                    qib0.G.L0(m17079d0(), data.gameBanner);
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final ProfileItem m17062T() {
        return (ProfileItem) this.likeItem.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m17063T0(@NotNull final RiskSelfData risk) {
        risk.getClass();
        this.mRiskSelfData = risk;
        if (!NullChecker.a(risk) || TextUtils.isEmpty(risk.ceilText)) {
            xdl0.M(m17084g0(), false);
            return;
        }
        m17086h0().setText(risk.ceilText);
        xdl0.M(m17084g0(), true);
        xdl0.E0(m17084g0(), new View.OnClickListener() { // from class: l.yg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17035z(this.f23050a, risk, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final ProfileItem m17064U() {
        return (ProfileItem) this.picksItem.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m17065U0(@NotNull List<PurchaseType> purchaseTypes, boolean force) {
        int iIndexOf;
        purchaseTypes.getClass();
        List<PurchaseType> list = purchaseTypes;
        xdl0.M(m17102p0(), !vwb.J(list));
        if (m17102p0().m7504d(this.frag, purchaseTypes, force) && !list.isEmpty() && CoreModule.c.x0.I3() != null && (iIndexOf = purchaseTypes.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE)) >= 0) {
            m17102p0().m7502b(iIndexOf);
        }
        this.intlMeTabDiscountEntryHost.m25651d();
    }

    /* JADX INFO: renamed from: V */
    public final ProfileItem m17066V() {
        return (ProfileItem) this.seeItem.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m17067V0(@Nullable List<Picture.ImageUri> avatars) {
        if (avatars == null || vwb.J(avatars)) {
            xdl0.W(m17066V().f5248b, t100.o);
            VDraweeView vDraweeView = this.seeOne;
            if (vDraweeView != null) {
                xdl0.M(vDraweeView, false);
            }
            VDraweeView vDraweeView2 = this.seeTwo;
            if (vDraweeView2 != null) {
                xdl0.M(vDraweeView2, false);
                return;
            }
            return;
        }
        m17043I0(avatars.size());
        if (avatars.size() == 1) {
            VDraweeView vDraweeView3 = this.seeTwo;
            if (vDraweeView3 != null) {
                m17050N(vDraweeView3, avatars.get(0));
            }
            VDraweeView vDraweeView4 = this.seeOne;
            if (vDraweeView4 != null) {
                xdl0.M(vDraweeView4, false);
            }
            xdl0.W(m17066V().f5248b, t100.t);
            return;
        }
        if (avatars.size() > 1) {
            VDraweeView vDraweeView5 = this.seeTwo;
            if (vDraweeView5 != null) {
                m17050N(vDraweeView5, avatars.get(0));
            }
            VDraweeView vDraweeView6 = this.seeOne;
            if (vDraweeView6 != null) {
                m17050N(vDraweeView6, avatars.get(1));
            }
            xdl0.W(m17066V().f5248b, t100.F);
        }
    }

    /* JADX INFO: renamed from: W */
    public final ProfileItem m17068W() {
        return (ProfileItem) this.subscriptionItem.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m17069W0(@NotNull final String publicId) {
        publicId.getClass();
        Act act = act();
        if (act != null) {
            xdl0.H0(m17081e0(), act.getString(R.string.Wc) + ": " + publicId);
            xdl0.M(m17077b0(), true);
            xdl0.E0(m17077b0(), new View.OnClickListener() { // from class: l.ng30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh30.m17013X0(publicId, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final ProfileItem m17070X() {
        return (ProfileItem) this.suerLikeItem.getValue();
    }

    /* JADX INFO: renamed from: Y */
    public final ProfileItem m17071Y() {
        return (ProfileItem) this.visitorItem.getValue();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m17072Y0(@NotNull User user) {
        user.getClass();
        m17096m0().setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.H0(m17096m0(), user.name);
        xdl0.M(m17092k0(), lfn.INSTANCE.m17881e() && vwb.J(user.profile.extensions.basic.intlFriendPurposeV2));
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VDraweeView m17073Z() {
        VDraweeView vDraweeView = this._background_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_background_avatar");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m17074Z0(@NotNull User user) {
        user.getClass();
        m17098n0().setImageResource(x2c0.Pt);
        xdl0.M(m17098n0(), user.isPicVerificationVerified());
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText m17075a0() {
        VText vText = this._ban_release_entrance;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_ban_release_entrance");
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m17076a1(@NotNull User user) {
        user.getClass();
        CoreModule.P().e().o7(act(), user, m17094l0(), true, true);
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VButton m17077b0() {
        VButton vButton = this._bt_id_copy;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_bt_id_copy");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m17078c0() {
        VText vText = this._fake_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_fake_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VDraweeView m17079d0() {
        VDraweeView vDraweeView = this._hide_and_seek;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_hide_and_seek");
        return null;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m17080d1() {
        xdl0.Z(new View[]{m17104q0()});
    }

    public void destroy() {
        this.intlMeTabDiscountEntryHost.m25649b();
        m17056Q();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VText m17081e0() {
        VText vText = this._id;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_id");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final ViewStub m17082f0() {
        ViewStub viewStub = this._intl_pay_guide;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.r("_intl_pay_guide");
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m17083f1(int count) {
        m17071Y().m7433f(count);
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final LinearLayout m17084g0() {
        LinearLayout linearLayout = this._intr_risk_banner;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_intr_risk_banner");
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m17085g1(boolean show) {
        m17058R().f5255i.setTextColor(Color.parseColor("#FE7E1D"));
        xdl0.W(m17058R().f5250d, show ? t100.B : 0);
        xdl0.M(m17058R().f5255i, show);
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m17086h0() {
        VText vText = this._intr_risk_banner_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_intr_risk_banner_content");
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m17087h1(int which, boolean show) {
        VOnlineIndicator vOnlineIndicator;
        if (which != 0 || (vOnlineIndicator = this.settingDot) == null) {
            return;
        }
        xdl0.M(vOnlineIndicator, show);
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VLinear m17088i0() {
        VLinear vLinear = this._item_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_item_layout");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m17045K(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VImage m17090j0() {
        VImage vImage = this._iv_edit;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_iv_edit");
        return null;
    }

    /* JADX INFO: renamed from: j1 */
    public final boolean m17091j1(@NotNull User user) {
        user.getClass();
        boolean zS = u59.S();
        if (NullChecker.a(user)) {
            boolean z = user.isSVIP() && !user.isVIPExpired();
            if (!z && zS) {
                return !user.isVIP() || n3b0.s((Counter) null, 1, (Object) null);
            }
            if (z && !IntlCountryCodeController.k()) {
                return true;
            }
        }
        return zS;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VImage m17092k0() {
        VImage vImage = this._iv_edit_red_dot;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_iv_edit_red_dot");
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m17093k1(@NotNull String time) {
        time.getClass();
        if (!xdl0.O0(m17064U().f5255i)) {
            xdl0.W(m17064U().f5250d, t100.D);
            xdl0.M(m17064U().f5255i, true);
            m17064U().f5255i.setTextColor(Color.parseColor("#FE7E1D"));
        }
        xdl0.H0(m17064U().f5255i, time);
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VImage m17094l0() {
        VImage vImage = this._name_container_img_vip;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_name_container_img_vip");
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m17095l1(final List<Item> items, final User user) {
        rx.c cVarDuringCreated;
        rx.c cVarOnBackpressureBuffer;
        rx.c cVarMaterialize;
        rx.c cVarTake;
        rx.c cVarObserveOn;
        final Ref.IntRef intRef = new Ref.IntRef();
        c4g0 c4g0Var = this.createSub;
        if (c4g0Var != null) {
            mkd0.z(c4g0Var);
        }
        Act act = act();
        this.createSub = (act == null || (cVarDuringCreated = act.duringCreated(rx.c.interval(500L, TimeUnit.MILLISECONDS))) == null || (cVarOnBackpressureBuffer = cVarDuringCreated.onBackpressureBuffer((long) items.size())) == null || (cVarMaterialize = cVarOnBackpressureBuffer.materialize()) == null || (cVarTake = cVarMaterialize.take(items.size())) == null || (cVarObserveOn = cVarTake.observeOn(jo0.a())) == null) ? null : cVarObserveOn.subscribe(mkd0.H(new e30() { // from class: l.kg30
            public final void call(Object obj) {
                jh30.m17025m(intRef, items, this, user, (Notification) obj);
            }
        }, new e30() { // from class: l.lg30
            public final void call(Object obj) {
                jh30.m17022j((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final VText m17096m0() {
        VText vText = this._name_container_tv_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_name_container_tv_name");
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m17097m1(@NotNull Intent intent) {
        intent.getClass();
        this.frag.startActivity(intent);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VImage m17098n0() {
        VImage vImage = this._name_container_verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_name_container_verification_icon");
        return null;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m17099n1(@NotNull String time) {
        time.getClass();
        xdl0.H0(m17058R().f5255i, time);
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: o */
    public boolean mo16026o() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VLinear m17100o0() {
        VLinear vLinear = this._new_me_linear;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_new_me_linear");
        return null;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m17101o1(@NotNull User user) {
        user.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final NewProfilePrivilegedPager m17102p0() {
        NewProfilePrivilegedPager newProfilePrivilegedPager = this._privilege_banner;
        if (newProfilePrivilegedPager != null) {
            return newProfilePrivilegedPager;
        }
        Intrinsics.r("_privilege_banner");
        return null;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m17103p1() {
        if (CoreModule.c.e0.Z7()) {
            dfx.INSTANCE.m13327l();
            m17019e1();
        }
        xdl0.M(m17078c0(), CoreModule.c.e0.Z7());
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final VNavigationBar m17104q0() {
        VNavigationBar vNavigationBar = this._top_navigationbar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_top_navigationbar");
        return null;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m17105q1(@NotNull User user) {
        user.getClass();
        Long l2 = user.profile.receivedLikes;
        if (NullChecker.a(l2)) {
            l2.getClass();
            if (l2.longValue() > this.receivedLikes) {
                this.receivedLikes = l2.longValue();
            }
        }
        xdl0.M(m17066V().f5250d, true);
        m17066V().f5250d.setText(i0g0.m16115N(this.receivedLikes + " " + this.frag.getString(R.string.cl), this.frag.act().color(w0c0.u1), eqh0.c(3)));
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: r */
    public void mo16029r() {
        View viewInflate = this.frag.act().getLayoutInflater().inflate(f6c0.x7, (ViewGroup) m17104q0(), false);
        m17104q0().setBackgroundColor(CoreModule.b.getResources().getColor(w0c0.E0));
        m17104q0().z(new View[]{viewInflate});
        m17104q0().setTitle(R.string.xj);
        m17104q0().z(new View[]{m17039D0()});
        m17048L0();
        this.intlMeTabDiscountEntryHost.m25648a(m17100o0(), m17102p0());
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final LinearLayout m17106r0() {
        LinearLayout linearLayout = this._wallet_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_wallet_layout");
        return null;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m17107r1(@NotNull User user) {
        user.getClass();
        int childCount = m17088i0().getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (Intrinsics.d(ViewGroupKt.a(m17088i0(), i), m17064U())) {
                if (m17114v0(user) && !xdl0.O0(m17064U())) {
                    dfx.INSTANCE.m13325j();
                }
                xdl0.M(m17064U(), m17114v0(user));
            }
            if (Intrinsics.d(ViewGroupKt.a(m17088i0(), i), m17062T())) {
                if (m17091j1(user) && !xdl0.O0(m17062T())) {
                    dfx.INSTANCE.m13322g();
                }
                xdl0.M(m17062T(), m17091j1(user));
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
    public final VDraweeView m17108s0() {
        VDraweeView vDraweeView = this._wallet_layout_luckytantan;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_wallet_layout_luckytantan");
        return null;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m17109s1() {
        String string;
        xdl0.E0(m17068W(), new View.OnClickListener() { // from class: l.rg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17030u(this.f19821a, view);
            }
        });
        boolean z = (vdj.c() || nkp.b()) ? false : true;
        if (!IntlCountryCodeController.o()) {
            z = false;
        }
        if (z) {
            xdl0.M(m17068W(), false);
        }
        m17068W().m7434g(false);
        xdl0.M(m17068W().f5250d, false);
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotH3 = CoreModule.c.x0.H3("meTabSubscriptionTab");
        if (iapAffiliatePromotionDisplaySlotH3 != null) {
            String str = iapAffiliatePromotionDisplaySlotH3.mainTitle;
            if (!(str == null || str.length() == 0)) {
                xdl0.M(m17068W().f5250d, true);
                m17068W().f5250d.setTextColor(Color.parseColor("#FE7E1D"));
                m17068W().f5250d.setText(iapAffiliatePromotionDisplaySlotH3.mainTitle);
                CoreModule.c.x0.I3();
                xdl0.E0(m17068W(), new View.OnClickListener() { // from class: l.sg30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jh30.m17016c(this.f20234a, view);
                    }
                });
                return;
            }
        }
        if (CoreModule.c.j0.Q4() && !u59.Z()) {
            m17068W().f5250d.setTextColor(Color.parseColor("#FE7E1D"));
            eg30 eg30Var = this.presenter;
            if (eg30Var == null) {
                Intrinsics.r("presenter");
                eg30Var = null;
            }
            eg30Var.m13942x2();
            return;
        }
        if (h6a.c()) {
            com.p1.mobile.putong.core.api.c cVar = CoreModule.c;
            if (cVar.G2.R == null || !cVar.j0.P4()) {
                return;
            }
            xdl0.M(m17068W().f5250d, true);
            m17068W().f5250d.setTextColor(Color.parseColor("#FE7E1D"));
            VText vText = m17068W().f5250d;
            if (CoreModule.c.G2.j3()) {
                string = this.frag.getString(R.string.Cg);
            } else {
                string = ((TEnum.equals(CoreModule.c.G2.i3(), "tttVipUpgradeToPremium") || TEnum.equals(CoreModule.c.G2.i3(), "tttSeeUpgradeToPremium")) && CoreModule.c.j0.P4()) ? this.frag.getString(R.string.Fg) : this.frag.getString(R.string.Hg);
            }
            vText.setText(string);
            if ((TEnum.equals(CoreModule.c.G2.i3(), "tttVipUpgradeToPremium") || TEnum.equals(CoreModule.c.G2.i3(), "tttSeeUpgradeToPremium")) && CoreModule.c.j0.P4()) {
                xdl0.E0(m17068W(), new View.OnClickListener() { // from class: l.tg30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jh30.m17033x(this.f20664a, view);
                    }
                });
            } else {
                xdl0.E0(m17068W(), new View.OnClickListener() { // from class: l.ug30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jh30.m17003A(this.f21131a, view);
                    }
                });
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final VText m17110t0() {
        VText vText = this._wallet_layout_wallet_coin;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_wallet_layout_wallet_coin");
        return null;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m17111t1() {
        if (CoreModule.c.j0.g0) {
            return;
        }
        m17068W().m7430c();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m17112u0() {
        m17068W().m7434g(false);
        xdl0.M(m17068W().f5250d, false);
        m17109s1();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m17113u1(@NotNull String subTitle) {
        subTitle.getClass();
        xdl0.M(m17068W().f5250d, true);
        xdl0.W(m17068W().f5250d, m17068W().f5253g.getWidth());
        m17068W().m7436i(subTitle);
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m17114v0(User user) {
        if (!NullChecker.a(user) || !user.isSVIP() || user.isVIPExpired() || IntlCountryCodeController.k()) {
            return u59.S();
        }
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m17115v1() {
        if (this.visitorItemEnable) {
            dfx.INSTANCE.m13336u();
        }
        if (xdl0.O0(m17084g0())) {
            RiskSelfData riskSelfData = this.mRiskSelfData;
            RiskSelfData riskSelfData2 = null;
            if (riskSelfData == null) {
                Intrinsics.r("mRiskSelfData");
                riskSelfData = null;
            }
            if (NullChecker.a(riskSelfData)) {
                RiskSelfData riskSelfData3 = this.mRiskSelfData;
                if (riskSelfData3 == null) {
                    Intrinsics.r("mRiskSelfData");
                } else {
                    riskSelfData2 = riskSelfData3;
                }
                zvf0.A("e_navigation_risk_user_warning", "p_navigation_view", new j760[]{vwb.Y("user_risk_type", riskSelfData2.type)});
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final ProfileItem m17116w0() {
        m17117x0(m17058R(), x2c0.Lf, R.string.x0, R.string.Sa);
        xdl0.E0(m17058R(), new View.OnClickListener() { // from class: l.wg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17017d(this.f22095a, view);
            }
        });
        dfx.INSTANCE.m13319d();
        return m17058R();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m17117x0(ProfileItem item, int icon, int title, int subTitle) {
        if (m17088i0().indexOfChild(item) == -1) {
            m17088i0().addView(item);
        }
        LinearLayout linearLayout = item.f5248b;
        int i = t100.j;
        xdl0.X(linearLayout, i);
        xdl0.U(item.f5248b, i);
        item.m7437j(CoreModule.b.getString(title));
        item.setIconRes(icon);
        item.setMinimumHeight(t100.J);
        if (subTitle != 0) {
            item.setSubtitle(CoreModule.b.getString(subTitle));
        }
        item.f5249c.setTextSize(15.0f);
        item.f5250d.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: y0 */
    public final ProfileItem m17118y0(User user) {
        m17117x0(m17062T(), x2c0.Mf, R.string.Vc, R.string.Uc);
        if (uld0.e().k()) {
            m17062T().m7435h(true);
        }
        xdl0.E0(m17062T(), new View.OnClickListener() { // from class: l.xg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17015b(this.f22594a, view);
            }
        });
        if (m17091j1(user)) {
            dfx.INSTANCE.m13322g();
        }
        xdl0.M(m17062T(), m17091j1(user));
        return m17062T();
    }

    /* JADX INFO: renamed from: z0 */
    public final ProfileItem m17119z0(User user) {
        m17117x0(m17064U(), x2c0.Nf, R.string.xb, R.string.Qa);
        xdl0.E0(m17064U(), new View.OnClickListener() { // from class: l.mg30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jh30.m17014a(this.f16881a, view);
            }
        });
        User userP9 = CoreModule.c.e0.p9();
        userP9.getClass();
        if (m17114v0(userP9)) {
            dfx.INSTANCE.m13325j();
        }
        ProfileItem profileItemM17064U = m17064U();
        User userP10 = CoreModule.c.e0.p9();
        userP10.getClass();
        xdl0.M(profileItemM17064U, m17114v0(userP10));
        return m17064U();
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: x2 */
    public void mo16031x2() {
    }
}
