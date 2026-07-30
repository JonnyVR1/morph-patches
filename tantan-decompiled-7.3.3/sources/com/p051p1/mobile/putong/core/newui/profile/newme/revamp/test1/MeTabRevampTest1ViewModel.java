package com.p051p1.mobile.putong.core.newui.profile.newme.revamp.test1;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.badge.BadgeDrawable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.LoveLetterGroupState;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p051p1.mobile.putong.core.newui.profile.newme.ProfilePrivilegePayGuide;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.C8380a;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabIapType;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabRevampMemberCardHelper;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabRevampSubscriptionStyle;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinAct;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VRelative;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;
import p153l.adc0;
import p153l.aox;
import p153l.bix;
import p153l.bnl0;
import p153l.box;
import p153l.c4s;
import p153l.c9c0;
import p153l.czq;
import p153l.dbc0;
import p153l.dix;
import p153l.eix;
import p153l.gix;
import p153l.iix;
import p153l.ikx;
import p153l.ilx;
import p153l.joa;
import p153l.k3g;
import p153l.kec0;
import p153l.lyh0;
import p153l.nbr;
import p153l.p7f;
import p153l.qa00;
import p153l.spl0;
import p153l.v1b0;
import p153l.yyh0;
import p153l.zdo;
import p153l.znx;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u007f\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Ô\u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\b©\u0001Õ\u0003¤\u0001±\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u0019J\u0017\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\tJ7\u00106\u001a\u0002052\u0006\u0010/\u001a\u00020%2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002¢\u0006\u0004\b6\u00107J]\u0010A\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u0002052\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u0002002\u0006\u0010=\u001a\u0002052\u0006\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010@\u001a\u000200H\u0002¢\u0006\u0004\bA\u0010BJ!\u0010F\u001a\u00020E2\u0006\u0010!\u001a\u00020\u00112\b\b\u0002\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00072\u0006\u0010M\u001a\u000200H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020\u00072\u0006\u0010P\u001a\u00020)2\u0006\u0010Q\u001a\u00020)H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00072\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ)\u0010]\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020X2\b\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010\u0010\u001a\u00020\\H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0007H\u0002¢\u0006\u0004\b_\u0010\tJ\u0017\u0010`\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\\H\u0002¢\u0006\u0004\b`\u0010aJ\u001f\u0010c\u001a\u00020\u00072\u0006\u0010b\u001a\u00020X2\u0006\u0010\u0010\u001a\u00020\\H\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010i\u001a\u00020)2\u0006\u0010f\u001a\u00020e2\b\u0010h\u001a\u0004\u0018\u00010g¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u0007¢\u0006\u0004\bk\u0010\tJ\u0017\u0010m\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u0002H\u0016¢\u0006\u0004\bm\u0010nJ!\u0010o\u001a\u00020)2\u0006\u0010f\u001a\u00020e2\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bo\u0010jJ\u000f\u0010p\u001a\u00020\u0007H\u0016¢\u0006\u0004\bp\u0010\tJ\u0015\u0010r\u001a\u00020\u00072\u0006\u0010q\u001a\u000200¢\u0006\u0004\br\u0010OJ\r\u0010s\u001a\u00020\u0007¢\u0006\u0004\bs\u0010\tJ\u001b\u0010u\u001a\u00020\u00072\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u000f0$¢\u0006\u0004\bu\u0010vJ\u0015\u0010w\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\bw\u0010\u0019J\u000f\u0010x\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bx\u0010yJ\u0015\u0010|\u001a\u00020\u00072\u0006\u0010{\u001a\u00020z¢\u0006\u0004\b|\u0010}J\u0018\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020~¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0017\u0010\u0082\u0001\u001a\u00020\u00072\u0006\u0010{\u001a\u00020z¢\u0006\u0005\b\u0082\u0001\u0010}J\u000f\u0010\u0083\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0083\u0001\u0010\tJ\u000f\u0010\u0084\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0084\u0001\u0010\tJ\u0017\u0010\u0085\u0001\u001a\u00020\u00072\u0006\u0010{\u001a\u00020z¢\u0006\u0005\b\u0085\u0001\u0010}J\u0018\u0010\u0087\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u000200¢\u0006\u0005\b\u0087\u0001\u0010OJ\u000f\u0010\u0088\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0088\u0001\u0010\tJ<\u0010\u008d\u0001\u001a\u00020\u00072\u0007\u0010\u0089\u0001\u001a\u00020T2\u0007\u0010\u008a\u0001\u001a\u00020T2\u0007\u0010\u008b\u0001\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\u0007\u0010\u008c\u0001\u001a\u000200¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u000f\u0010\u008f\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u008f\u0001\u0010\tJ\u0017\u0010\u0090\u0001\u001a\u00020\u00072\u0006\u0010{\u001a\u00020z¢\u0006\u0005\b\u0090\u0001\u0010}J\u000f\u0010\u0091\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0091\u0001\u0010\tJ\u001a\u0010\u0094\u0001\u001a\u00020\u00072\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0096\u0001\u0010\tJ\u000f\u0010\u0097\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0097\u0001\u0010\tJ\u000f\u0010\u0098\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0098\u0001\u0010\tJ\u001c\u0010\u009b\u0001\u001a\u00020\u00072\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u009d\u0001\u0010\tJ\u0012\u0010\u009e\u0001\u001a\u000200H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b \u0001\u0010\tJ\u0015\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u0001H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R*\u0010¯\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010·\u0001\u001a\u00030°\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R*\u0010Ç\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R*\u0010Ë\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010Â\u0001\u001a\u0006\bÉ\u0001\u0010Ä\u0001\"\u0006\bÊ\u0001\u0010Æ\u0001R*\u0010Ó\u0001\u001a\u00030Ì\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R)\u0010Ú\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R*\u0010Þ\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Â\u0001\u001a\u0006\bÜ\u0001\u0010Ä\u0001\"\u0006\bÝ\u0001\u0010Æ\u0001R)\u0010å\u0001\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R)\u0010é\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bæ\u0001\u0010Õ\u0001\u001a\u0006\bç\u0001\u0010×\u0001\"\u0006\bè\u0001\u0010Ù\u0001R*\u0010í\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bê\u0001\u0010Â\u0001\u001a\u0006\bë\u0001\u0010Ä\u0001\"\u0006\bì\u0001\u0010Æ\u0001R)\u0010ñ\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bî\u0001\u0010Õ\u0001\u001a\u0006\bï\u0001\u0010×\u0001\"\u0006\bð\u0001\u0010Ù\u0001R)\u0010õ\u0001\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bò\u0001\u0010à\u0001\u001a\u0006\bó\u0001\u0010â\u0001\"\u0006\bô\u0001\u0010ä\u0001R*\u0010ü\u0001\u001a\u00030ö\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R*\u0010\u0080\u0002\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bý\u0001\u0010Â\u0001\u001a\u0006\bþ\u0001\u0010Ä\u0001\"\u0006\bÿ\u0001\u0010Æ\u0001R*\u0010\u0088\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R(\u0010\u008b\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bp\u0010à\u0001\u001a\u0006\b\u0089\u0002\u0010â\u0001\"\u0006\b\u008a\u0002\u0010ä\u0001R)\u0010\u008f\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010à\u0001\u001a\u0006\b\u008d\u0002\u0010â\u0001\"\u0006\b\u008e\u0002\u0010ä\u0001R)\u0010\u0093\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0002\u0010à\u0001\u001a\u0006\b\u0091\u0002\u0010â\u0001\"\u0006\b\u0092\u0002\u0010ä\u0001R*\u0010\u0097\u0002\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010Â\u0001\u001a\u0006\b\u0095\u0002\u0010Ä\u0001\"\u0006\b\u0096\u0002\u0010Æ\u0001R)\u0010\u009b\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0002\u0010à\u0001\u001a\u0006\b\u0099\u0002\u0010â\u0001\"\u0006\b\u009a\u0002\u0010ä\u0001R)\u0010\u009f\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009c\u0002\u0010à\u0001\u001a\u0006\b\u009d\u0002\u0010â\u0001\"\u0006\b\u009e\u0002\u0010ä\u0001R*\u0010£\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0002\u0010\u0083\u0002\u001a\u0006\b¡\u0002\u0010\u0085\u0002\"\u0006\b¢\u0002\u0010\u0087\u0002R)\u0010§\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0002\u0010à\u0001\u001a\u0006\b¥\u0002\u0010â\u0001\"\u0006\b¦\u0002\u0010ä\u0001R)\u0010«\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¨\u0002\u0010à\u0001\u001a\u0006\b©\u0002\u0010â\u0001\"\u0006\bª\u0002\u0010ä\u0001R)\u0010¯\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¬\u0002\u0010Õ\u0001\u001a\u0006\b\u00ad\u0002\u0010×\u0001\"\u0006\b®\u0002\u0010Ù\u0001R*\u0010³\u0002\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0002\u0010Â\u0001\u001a\u0006\b±\u0002\u0010Ä\u0001\"\u0006\b²\u0002\u0010Æ\u0001R*\u0010·\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0002\u0010\u0083\u0002\u001a\u0006\bµ\u0002\u0010\u0085\u0002\"\u0006\b¶\u0002\u0010\u0087\u0002R)\u0010»\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0002\u0010Õ\u0001\u001a\u0006\b¹\u0002\u0010×\u0001\"\u0006\bº\u0002\u0010Ù\u0001R(\u0010¾\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bi\u0010à\u0001\u001a\u0006\b¼\u0002\u0010â\u0001\"\u0006\b½\u0002\u0010ä\u0001R(\u0010Á\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bk\u0010à\u0001\u001a\u0006\b¿\u0002\u0010â\u0001\"\u0006\bÀ\u0002\u0010ä\u0001R)\u0010Å\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÂ\u0002\u0010Õ\u0001\u001a\u0006\bÃ\u0002\u0010×\u0001\"\u0006\bÄ\u0002\u0010Ù\u0001R*\u0010É\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÆ\u0002\u0010\u0083\u0002\u001a\u0006\bÇ\u0002\u0010\u0085\u0002\"\u0006\bÈ\u0002\u0010\u0087\u0002R)\u0010Í\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÊ\u0002\u0010Õ\u0001\u001a\u0006\bË\u0002\u0010×\u0001\"\u0006\bÌ\u0002\u0010Ù\u0001R)\u0010Ñ\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÎ\u0002\u0010à\u0001\u001a\u0006\bÏ\u0002\u0010â\u0001\"\u0006\bÐ\u0002\u0010ä\u0001R)\u0010Õ\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÒ\u0002\u0010à\u0001\u001a\u0006\bÓ\u0002\u0010â\u0001\"\u0006\bÔ\u0002\u0010ä\u0001R)\u0010Ù\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÖ\u0002\u0010Õ\u0001\u001a\u0006\b×\u0002\u0010×\u0001\"\u0006\bØ\u0002\u0010Ù\u0001R*\u0010Ý\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÚ\u0002\u0010\u0083\u0002\u001a\u0006\bÛ\u0002\u0010\u0085\u0002\"\u0006\bÜ\u0002\u0010\u0087\u0002R)\u0010á\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÞ\u0002\u0010Õ\u0001\u001a\u0006\bß\u0002\u0010×\u0001\"\u0006\bà\u0002\u0010Ù\u0001R(\u0010ä\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bA\u0010à\u0001\u001a\u0006\bâ\u0002\u0010â\u0001\"\u0006\bã\u0002\u0010ä\u0001R(\u0010ç\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\b\u0010à\u0001\u001a\u0006\bå\u0002\u0010â\u0001\"\u0006\bæ\u0002\u0010ä\u0001R(\u0010ê\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bc\u0010Õ\u0001\u001a\u0006\bè\u0002\u0010×\u0001\"\u0006\bé\u0002\u0010Ù\u0001R)\u0010í\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bK\u0010\u0083\u0002\u001a\u0006\bë\u0002\u0010\u0085\u0002\"\u0006\bì\u0002\u0010\u0087\u0002R(\u0010ð\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bm\u0010Õ\u0001\u001a\u0006\bî\u0002\u0010×\u0001\"\u0006\bï\u0002\u0010Ù\u0001R(\u0010ó\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b,\u0010à\u0001\u001a\u0006\bñ\u0002\u0010â\u0001\"\u0006\bò\u0002\u0010ä\u0001R(\u0010ö\u0002\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b*\u0010à\u0001\u001a\u0006\bô\u0002\u0010â\u0001\"\u0006\bõ\u0002\u0010ä\u0001R(\u0010ù\u0002\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0012\u0010Õ\u0001\u001a\u0006\b÷\u0002\u0010×\u0001\"\u0006\bø\u0002\u0010Ù\u0001R)\u0010ü\u0002\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bF\u0010Â\u0001\u001a\u0006\bú\u0002\u0010Ä\u0001\"\u0006\bû\u0002\u0010Æ\u0001R*\u0010\u0080\u0003\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bý\u0002\u0010Â\u0001\u001a\u0006\bþ\u0002\u0010Ä\u0001\"\u0006\bÿ\u0002\u0010Æ\u0001R)\u0010\u0087\u0003\u001a\u00030\u0081\u00038\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bH\u0010\u0082\u0003\u001a\u0006\b\u0083\u0003\u0010\u0084\u0003\"\u0006\b\u0085\u0003\u0010\u0086\u0003R)\u0010\u008a\u0003\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010Â\u0001\u001a\u0006\b\u0088\u0003\u0010Ä\u0001\"\u0006\b\u0089\u0003\u0010Æ\u0001R)\u0010\u008d\u0003\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008b\u0003\u0010à\u0001\u001a\u0006\b\u008b\u0003\u0010â\u0001\"\u0006\b\u008c\u0003\u0010ä\u0001R)\u0010\u0090\u0003\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÏ\u0001\u0010à\u0001\u001a\u0006\b\u008e\u0003\u0010â\u0001\"\u0006\b\u008f\u0003\u0010ä\u0001R)\u0010\u0093\u0003\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bå\u0002\u0010à\u0001\u001a\u0006\b\u0091\u0003\u0010â\u0001\"\u0006\b\u0092\u0003\u0010ä\u0001R*\u0010\u0097\u0003\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0003\u0010Â\u0001\u001a\u0006\b\u0095\u0003\u0010Ä\u0001\"\u0006\b\u0096\u0003\u0010Æ\u0001R)\u0010\u009a\u0003\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bè\u0002\u0010à\u0001\u001a\u0006\b\u0098\u0003\u0010â\u0001\"\u0006\b\u0099\u0003\u0010ä\u0001R*\u0010\u009d\u0003\u001a\u00030À\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bë\u0002\u0010Â\u0001\u001a\u0006\b\u009b\u0003\u0010Ä\u0001\"\u0006\b\u009c\u0003\u0010Æ\u0001R)\u0010 \u0003\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0002\u0010Õ\u0001\u001a\u0006\b\u009e\u0003\u0010×\u0001\"\u0006\b\u009f\u0003\u0010Ù\u0001R)\u0010£\u0003\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b÷\u0002\u0010à\u0001\u001a\u0006\b¡\u0003\u0010â\u0001\"\u0006\b¢\u0003\u0010ä\u0001R)\u0010¦\u0003\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÇ\u0002\u0010Õ\u0001\u001a\u0006\b¤\u0003\u0010×\u0001\"\u0006\b¥\u0003\u0010Ù\u0001R)\u0010©\u0003\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÓ\u0002\u0010à\u0001\u001a\u0006\b§\u0003\u0010â\u0001\"\u0006\b¨\u0003\u0010ä\u0001R\u0018\u0010l\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bË\u0002\u0010ª\u0003R\u001b\u0010«\u0003\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0002\u0010à\u0001R\u001c\u0010®\u0003\u001a\u0005\u0018\u00010¬\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010\u00ad\u0003R\u001c\u0010±\u0003\u001a\u0005\u0018\u00010¯\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010°\u0003R\u001c\u0010³\u0003\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010²\u0003R\u001d\u0010¸\u0003\u001a\u00030´\u00038\u0006¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010µ\u0003\u001a\u0006\b¶\u0003\u0010·\u0003R\u001a\u0010¹\u0003\u001a\u00030À\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0002\u0010Â\u0001R*\u0010½\u0003\u001a\u00020\u00112\u0007\u0010º\u0003\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010Ê\u0002\u001a\u0006\b»\u0003\u0010¼\u0003R\u001f\u0010¿\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0002\u0010¾\u0003R,\u0010Ã\u0003\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030Â\u0003\u0012\u0004\u0012\u00020\u000f0Á\u00030À\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¾\u0003R\u001a\u0010Æ\u0003\u001a\u00030Ä\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¥\u0002\u0010Å\u0003R!\u0010Ê\u0003\u001a\n\u0012\u0005\u0012\u00030È\u00030Ç\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0002\u0010É\u0003R\u001a\u0010Í\u0003\u001a\u00030Ë\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¡\u0003\u0010Ì\u0003R+\u0010Ó\u0003\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010Î\u0003\u001a\u0006\bÏ\u0003\u0010Ð\u0003\"\u0006\bÑ\u0003\u0010Ò\u0003¨\u0006Ö\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel;", "Ll/v1b0;", "Ll/ikx;", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;)V", "", "P", "()V", "K1", "J1", "I1", "F1", "G1", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;", "type", "", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;)I", OMSTemplateModeType.page, "retry", "P1", "(II)V", "g1", "(I)V", "T1", "cardType", "", "B1", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;)Ljava/lang/String;", "z1", "Z", "resId", "b0", "(I)Ljava/lang/String;", "", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$a;", "e0", "()Ljava/util/List;", "k1", "Landroid/view/View;", "U", "()Landroid/view/View;", p7f.GPS_DIRECTION_TRUE, "f1", "e1", Item.TYPE, "", "isVip", "isSee", "isPremium", "isUltra", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;", "f0", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$a;ZZZZ)Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;", "titleRes", "checkIconRes", "targetVal", "targetColor", "youOwned", "youVal", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "hideYouColumn", BloodType.f39576O, "(IILcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;IZLcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;Lcom/p1/mobile/putong/core/data/Privilege;Z)V", "", "sizeDp", "Landroid/widget/FrameLayout;", "W", "(IF)Landroid/widget/FrameLayout;", "Y", "()Landroid/widget/FrameLayout;", "Landroid/widget/LinearLayout$LayoutParams;", "R", "()Landroid/widget/LinearLayout$LayoutParams;", LoveLetterGroupState.picVerified, "w1", "(Z)V", "countView", "badgeView", "A1", "(Landroid/view/View;Landroid/view/View;)V", "", "seeBadgeCount", "r1", "(J)V", "Lv/VText_NoTopPadding;", "countBadge", "Lv/VImage;", "plusBadge", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;", "n1", "(Lv/VText_NoTopPadding;Lv/VImage;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)V", "p1", "d1", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)I", "badge", "Q", "(Lv/VText_NoTopPadding;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "E", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "F", "presenter", p7f.LATITUDE_SOUTH, "(Ll/ikx;)V", "inflateView", "r", Active.TYPE, "L1", "h1", "types", "R1", "(Ljava/util/List;)V", "C1", "a0", "()Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;", "Lcom/p1/mobile/putong/data/User;", "user", "u1", "(Lcom/p1/mobile/putong/data/User;)V", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "uri", "l1", "(Lcom/p1/mobile/putong/data/Picture$ImageUri;)V", "v1", "S1", "H1", "t1", "show", "O1", "j1", "likesYou", "likesSent", SchemeKey.visitors, "showVisitorDot", "s1", "(JJJJZ)V", "o1", "m1", "y1", "Landroid/content/Intent;", "intent", "Q1", "(Landroid/content/Intent;)V", "D1", "a1", "M1", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "guide", "q1", "(Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;)V", "x2", "o", "()Z", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "c0", "()Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "Lv/VRelative;", "b", "Lv/VRelative;", "get_new_tab_me_test1", "()Lv/VRelative;", "set_new_tab_me_test1", "(Lv/VRelative;)V", "_new_tab_me_test1", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "Z0", "()Lv/navigationbar/VNavigationBar;", "set_top_navigationbar", "(Lv/navigationbar/VNavigationBar;)V", "_top_navigationbar", "Landroid/widget/ScrollView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ScrollView;", "get_content_view", "()Landroid/widget/ScrollView;", "set_content_view", "(Landroid/widget/ScrollView;)V", "_content_view", "Lv/VLinear;", "e", "Lv/VLinear;", "get_test1_content", "()Lv/VLinear;", "set_test1_content", "(Lv/VLinear;)V", "_test1_content", "f", "get_test1_header_container", "set_test1_header_container", "_test1_header_container", "Lv/AutoVDraweeView;", "g", "Lv/AutoVDraweeView;", "p0", "()Lv/AutoVDraweeView;", "set_test1_header_container_test1_avatar", "(Lv/AutoVDraweeView;)V", "_test1_header_container_test1_avatar", "h", "Lv/VImage;", "q0", "()Lv/VImage;", "set_test1_header_container_test1_avatar_edit", "(Lv/VImage;)V", "_test1_header_container_test1_avatar_edit", RXScreenCaptureService.KEY_INDEX, "get_test1_header_container_test1_name_row", "set_test1_header_container_test1_name_row", "_test1_header_container_test1_name_row", "j", "Lv/VText_NoTopPadding;", "r0", "()Lv/VText_NoTopPadding;", "set_test1_header_container_test1_name_row_test1_name", "(Lv/VText_NoTopPadding;)V", "_test1_header_container_test1_name_row_test1_name", "k", "s0", "set_test1_header_container_test1_name_row_test1_verification_icon", "_test1_header_container_test1_name_row_test1_verification_icon", BLiveStormDanmakuGiftResourceType.f45292l, "u0", "set_test1_header_container_test1_subscription_btn", "_test1_header_container_test1_subscription_btn", "m", "v0", "set_test1_header_container_test1_subscription_btn_test1_sub_badge", "_test1_header_container_test1_subscription_btn_test1_sub_badge", "n", "w0", "set_test1_header_container_test1_subscription_btn_test1_sub_text", "_test1_header_container_test1_subscription_btn_test1_sub_text", "Lv/VOnlineIndicator;", "Lv/VOnlineIndicator;", "t0", "()Lv/VOnlineIndicator;", "set_test1_header_container_test1_sub_dot", "(Lv/VOnlineIndicator;)V", "_test1_header_container_test1_sub_dot", "p", "P0", "set_test1_stats_container", "_test1_stats_container", "Lv/VFrame;", "q", "Lv/VFrame;", "S0", "()Lv/VFrame;", "set_test1_stats_container_test1_likes_you_stat", "(Lv/VFrame;)V", "_test1_stats_container_test1_likes_you_stat", "U0", "set_test1_stats_container_test1_likes_you_stat_test1_likes_you_count", "_test1_stats_container_test1_likes_you_stat_test1_likes_you_count", BLiveStormDanmakuGiftResourceType.f45294s, "get_test1_stats_container_test1_likes_you_stat_test1_likes_you_label", "set_test1_stats_container_test1_likes_you_stat_test1_likes_you_label", "_test1_stats_container_test1_likes_you_stat_test1_likes_you_label", Constants.KEY_T, "T0", "set_test1_stats_container_test1_likes_you_stat_test1_likes_you_badge", "_test1_stats_container_test1_likes_you_stat_test1_likes_you_badge", "u", "Q0", "set_test1_stats_container_test1_likes_sent_stat", "_test1_stats_container_test1_likes_sent_stat", ResourceDirection.f39656v, "R0", "set_test1_stats_container_test1_likes_sent_stat_test1_likes_sent_count", "_test1_stats_container_test1_likes_sent_stat_test1_likes_sent_count", "w", "get_test1_stats_container_test1_likes_sent_stat_test1_likes_sent_label", "set_test1_stats_container_test1_likes_sent_stat_test1_likes_sent_label", "_test1_stats_container_test1_likes_sent_stat_test1_likes_sent_label", BaseSei.f14624X, "V0", "set_test1_stats_container_test1_visitors_stat", "_test1_stats_container_test1_visitors_stat", BaseSei.f14625Y, "W0", "set_test1_stats_container_test1_visitors_stat_test1_visitors_count", "_test1_stats_container_test1_visitors_stat_test1_visitors_count", BaseSei.f14626Z, "get_test1_stats_container_test1_visitors_stat_test1_visitors_label", "set_test1_stats_container_test1_visitors_stat_test1_visitors_label", "_test1_stats_container_test1_visitors_stat_test1_visitors_label", "A", "X0", "set_test1_stats_container_test1_visitors_stat_test1_visitors_dot", "_test1_stats_container_test1_visitors_stat_test1_visitors_dot", "B", "get_test1_iap_container", "set_test1_iap_container", "_test1_iap_container", c4s.C_ZONE, "x0", "set_test1_iap_container_test1_boost_card", "_test1_iap_container_test1_boost_card", "D", "z0", "set_test1_iap_container_test1_boost_card_test1_boost_icon", "_test1_iap_container_test1_boost_card_test1_boost_icon", "B0", "set_test1_iap_container_test1_boost_card_test1_boost_title", "_test1_iap_container_test1_boost_card_test1_boost_title", "y0", "set_test1_iap_container_test1_boost_card_test1_boost_badge", "_test1_iap_container_test1_boost_card_test1_boost_badge", "G", "A0", "set_test1_iap_container_test1_boost_card_test1_boost_plus_badge", "_test1_iap_container_test1_boost_card_test1_boost_plus_badge", "H", "K0", "set_test1_iap_container_test1_super_like_card", "_test1_iap_container_test1_super_like_card", "I", "M0", "set_test1_iap_container_test1_super_like_card_test1_super_like_icon", "_test1_iap_container_test1_super_like_card_test1_super_like_icon", "J", "O0", "set_test1_iap_container_test1_super_like_card_test1_super_like_title", "_test1_iap_container_test1_super_like_card_test1_super_like_title", "K", "L0", "set_test1_iap_container_test1_super_like_card_test1_super_like_badge", "_test1_iap_container_test1_super_like_card_test1_super_like_badge", "L", "N0", "set_test1_iap_container_test1_super_like_card_test1_super_like_plus_badge", "_test1_iap_container_test1_super_like_card_test1_super_like_plus_badge", "M", "D0", "set_test1_iap_container_test1_compliment_card", "_test1_iap_container_test1_compliment_card", "N", "get_test1_iap_container_test1_compliment_card_test1_compliment_icon", "set_test1_iap_container_test1_compliment_card_test1_compliment_icon", "_test1_iap_container_test1_compliment_card_test1_compliment_icon", "get_test1_iap_container_test1_compliment_card_test1_compliment_title", "set_test1_iap_container_test1_compliment_card_test1_compliment_title", "_test1_iap_container_test1_compliment_card_test1_compliment_title", "E0", "set_test1_iap_container_test1_compliment_card_test1_compliment_badge", "_test1_iap_container_test1_compliment_card_test1_compliment_badge", "G0", "set_test1_iap_container_test1_compliment_card_test1_compliment_plus_badge", "_test1_iap_container_test1_compliment_card_test1_compliment_plus_badge", "H0", "set_test1_iap_container_test1_instant_match_card", "_test1_iap_container_test1_instant_match_card", "get_test1_iap_container_test1_instant_match_card_test1_instant_match_icon", "set_test1_iap_container_test1_instant_match_card_test1_instant_match_icon", "_test1_iap_container_test1_instant_match_card_test1_instant_match_icon", "get_test1_iap_container_test1_instant_match_card_test1_instant_match_title", "set_test1_iap_container_test1_instant_match_card_test1_instant_match_title", "_test1_iap_container_test1_instant_match_card_test1_instant_match_title", "I0", "set_test1_iap_container_test1_instant_match_card_test1_instant_match_badge", "_test1_iap_container_test1_instant_match_card_test1_instant_match_badge", "J0", "set_test1_iap_container_test1_instant_match_card_test1_instant_match_lock_badge", "_test1_iap_container_test1_instant_match_card_test1_instant_match_lock_badge", "g0", "set_test1_banner_container", "_test1_banner_container", "X", "get_test1_card_container", "set_test1_card_container", "_test1_card_container", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "m0", "()Landroidx/recyclerview/widget/RecyclerView;", "set_test1_card_container_test1_card_pager", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_test1_card_container_test1_card_pager", "h0", "set_test1_benefits_container", "_test1_benefits_container", "k0", "set_test1_benefits_container_test1_benefits_title", "_test1_benefits_container_test1_benefits_title", "l0", "set_test1_benefits_container_test1_benefits_you_title", "_test1_benefits_container_test1_benefits_you_title", "j0", "set_test1_benefits_container_test1_benefits_target_title", "_test1_benefits_container_test1_benefits_target_title", "F0", "i0", "set_test1_benefits_container_test1_benefits_rows", "_test1_benefits_container_test1_benefits_rows", "n0", "set_test1_fake_tip", "_test1_fake_tip", "get_test1_verification_banner", "set_test1_verification_banner", "_test1_verification_banner", "get_test1_verification_banner_test1_verification_banner_icon", "set_test1_verification_banner_test1_verification_banner_icon", "_test1_verification_banner_test1_verification_banner_icon", "Y0", "set_test1_verification_banner_test1_verification_banner_text", "_test1_verification_banner_test1_verification_banner_text", "get_test1_verification_banner_test1_verification_banner_arrow", "set_test1_verification_banner_test1_verification_banner_arrow", "_test1_verification_banner_test1_verification_banner_arrow", "o0", "set_test1_floating_cta", "_test1_floating_cta", "Ll/ikx;", "navWalletText", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "boostSvga", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "renewGuideBanner", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "lastRenewGuide", "Ll/zdo;", "Ll/zdo;", "d0", "()Ll/zdo;", "intlMeTabDiscountEntryHost", "verificationBanner", "value", "getCurrentCardPage", "()I", "currentCardPage", "Ljava/util/List;", "displayedCardTypes", "", "Lkotlin/Pair;", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$a;", "cardViewsList", "Ll/dix;", "Ll/dix;", "pagerSnapHelper", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "cardAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "cardLayoutManager", "Ljava/lang/String;", "getCachedUpgradePriceText", "()Ljava/lang/String;", "E1", "(Ljava/lang/String;)V", "cachedUpgradePriceText", "Companion", "BenefitValue", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class MeTabRevampTest1ViewModel implements v1b0<ikx> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VImage _test1_stats_container_test1_visitors_stat_test1_visitors_dot;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VLinear _test1_iap_container;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VFrame _test1_iap_container_test1_boost_card;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VImage _test1_iap_container_test1_boost_card_test1_boost_icon;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_iap_container_test1_boost_card_test1_boost_title;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_benefits_container_test1_benefits_target_title;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_iap_container_test1_boost_card_test1_boost_badge;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public VLinear _test1_benefits_container_test1_benefits_rows;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VImage _test1_iap_container_test1_boost_card_test1_boost_plus_badge;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_fake_tip;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public VFrame _test1_iap_container_test1_super_like_card;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public VLinear _test1_verification_banner;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VImage _test1_iap_container_test1_super_like_card_test1_super_like_icon;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public VImage _test1_verification_banner_test1_verification_banner_icon;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_iap_container_test1_super_like_card_test1_super_like_title;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_verification_banner_test1_verification_banner_text;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_iap_container_test1_super_like_card_test1_super_like_badge;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public VImage _test1_verification_banner_test1_verification_banner_arrow;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VImage _test1_iap_container_test1_super_like_card_test1_super_like_plus_badge;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_floating_cta;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public VFrame _test1_iap_container_test1_compliment_card;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public ikx presenter;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VImage _test1_iap_container_test1_compliment_card_test1_compliment_icon;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @Nullable
    public VText_NoTopPadding navWalletText;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_iap_container_test1_compliment_card_test1_compliment_title;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView boostSvga;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_iap_container_test1_compliment_card_test1_compliment_badge;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @Nullable
    public ProfilePrivilegePayGuide renewGuideBanner;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public VImage _test1_iap_container_test1_compliment_card_test1_compliment_plus_badge;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @Nullable
    public IntlTabMePayGuide lastRenewGuide;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public VFrame _test1_iap_container_test1_instant_match_card;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @NotNull
    public final zdo intlMeTabDiscountEntryHost;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public VImage _test1_iap_container_test1_instant_match_card_test1_instant_match_icon;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public VLinear verificationBanner;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_iap_container_test1_instant_match_card_test1_instant_match_title;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public int currentCardPage;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_iap_container_test1_instant_match_card_test1_instant_match_badge;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @NotNull
    public List<? extends MeTabRevampMemberCardHelper.CardType> displayedCardTypes;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public VImage _test1_iap_container_test1_instant_match_card_test1_instant_match_lock_badge;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<MeTabRevampMemberCardHelper.C8376a, MeTabRevampMemberCardHelper.CardType>> cardViewsList;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public VLinear _test1_banner_container;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public dix pagerSnapHelper;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public VLinear _test1_card_container;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public RecyclerView.Adapter<C8382b> cardAdapter;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public RecyclerView _test1_card_container_test1_card_pager;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public LinearLayoutManager cardLayoutManager;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public VLinear _test1_benefits_container;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @Nullable
    public String cachedUpgradePriceText;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ProfileFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRelative _new_tab_me_test1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VNavigationBar _top_navigationbar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ScrollView _content_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _test1_content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _test1_header_container;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public AutoVDraweeView _test1_header_container_test1_avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _test1_header_container_test1_avatar_edit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VLinear _test1_header_container_test1_name_row;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_header_container_test1_name_row_test1_name;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _test1_header_container_test1_name_row_test1_verification_icon;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_benefits_container_test1_benefits_title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VLinear _test1_header_container_test1_subscription_btn;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage _test1_header_container_test1_subscription_btn_test1_sub_badge;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_header_container_test1_subscription_btn_test1_sub_text;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VOnlineIndicator _test1_header_container_test1_sub_dot;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VLinear _test1_stats_container;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_benefits_container_test1_benefits_you_title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VFrame _test1_stats_container_test1_likes_you_stat;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_stats_container_test1_likes_you_stat_test1_likes_you_count;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_stats_container_test1_likes_you_stat_test1_likes_you_label;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_stats_container_test1_likes_you_stat_test1_likes_you_badge;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VLinear _test1_stats_container_test1_likes_sent_stat;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_stats_container_test1_likes_sent_stat_test1_likes_sent_count;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_stats_container_test1_likes_sent_stat_test1_likes_sent_label;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VFrame _test1_stats_container_test1_visitors_stat;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_stats_container_test1_visitors_stat_test1_visitors_count;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VText_NoTopPadding _test1_stats_container_test1_visitors_stat_test1_visitors_label;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;", "", "<init>", "(Ljava/lang/String;I)V", "CHECK", "LOCK", "NUM_1", "NUM_2", "NUM_3", "NUM_INF", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum BenefitValue {
        CHECK,
        LOCK,
        NUM_1,
        NUM_2,
        NUM_3,
        NUM_INF;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<BenefitValue> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel$a */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010\"R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u001f\u0010&¨\u0006'"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$a;", "", "", "titleRes", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;", "vip", "see", "premium", "ultra", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "<init>", "(ILcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;Lcom/p1/mobile/putong/core/data/Privilege;)V", "", "isVip", "isSee", "isPremium", "isUltra", "g", "(ZZZZ)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", Constants.INAPP_DATA_TAG, "b", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;", "f", "()Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$BenefitValue;", "c", "e", "Lcom/p1/mobile/putong/core/data/Privilege;", "()Lcom/p1/mobile/putong/core/data/Privilege;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* data */ class C8381a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int titleRes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final BenefitValue vip;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final BenefitValue see;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final BenefitValue premium;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final BenefitValue ultra;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public final Privilege privilege;

        public C8381a(int i, @NotNull BenefitValue benefitValue, @NotNull BenefitValue benefitValue2, @NotNull BenefitValue benefitValue3, @NotNull BenefitValue benefitValue4, @Nullable Privilege privilege) {
            benefitValue.getClass();
            benefitValue2.getClass();
            benefitValue3.getClass();
            benefitValue4.getClass();
            this.titleRes = i;
            this.vip = benefitValue;
            this.see = benefitValue2;
            this.premium = benefitValue3;
            this.ultra = benefitValue4;
            this.privilege = privilege;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BenefitValue getPremium() {
            return this.premium;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Privilege getPrivilege() {
            return this.privilege;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final BenefitValue getSee() {
            return this.see;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final BenefitValue getUltra() {
            return this.ultra;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8381a)) {
                return false;
            }
            C8381a c8381a = (C8381a) other;
            return this.titleRes == c8381a.titleRes && this.vip == c8381a.vip && this.see == c8381a.see && this.premium == c8381a.premium && this.ultra == c8381a.ultra && this.privilege == c8381a.privilege;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final BenefitValue getVip() {
            return this.vip;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m44477g(boolean isVip, boolean isSee, boolean isPremium, boolean isUltra) {
            if (isUltra && !isPremium) {
                BenefitValue benefitValue = this.ultra;
                BenefitValue benefitValue2 = BenefitValue.LOCK;
                return benefitValue != benefitValue2 && this.premium == benefitValue2;
            }
            if (isUltra) {
                return this.ultra != BenefitValue.LOCK;
            }
            if (isPremium && !isVip && !isSee) {
                BenefitValue benefitValue3 = this.premium;
                BenefitValue benefitValue4 = BenefitValue.LOCK;
                return benefitValue3 != benefitValue4 && this.vip == benefitValue4 && this.see == benefitValue4;
            }
            if (isPremium && !isVip) {
                BenefitValue benefitValue5 = this.premium;
                BenefitValue benefitValue6 = BenefitValue.LOCK;
                return benefitValue5 != benefitValue6 && this.vip == benefitValue6;
            }
            if (isPremium && !isSee) {
                BenefitValue benefitValue7 = this.premium;
                BenefitValue benefitValue8 = BenefitValue.LOCK;
                return benefitValue7 != benefitValue8 && this.see == benefitValue8;
            }
            if (isPremium) {
                return this.premium != BenefitValue.LOCK;
            }
            if (!isVip || this.vip == BenefitValue.LOCK) {
                return isSee && this.see != BenefitValue.LOCK;
            }
            return true;
        }

        public int hashCode() {
            int iHashCode = ((((((((Integer.hashCode(this.titleRes) * 31) + this.vip.hashCode()) * 31) + this.see.hashCode()) * 31) + this.premium.hashCode()) * 31) + this.ultra.hashCode()) * 31;
            Privilege privilege = this.privilege;
            return iHashCode + (privilege == null ? 0 : privilege.hashCode());
        }

        @NotNull
        public String toString() {
            return "BenefitItem(titleRes=" + this.titleRes + ", vip=" + this.vip + ", see=" + this.see + ", premium=" + this.premium + ", ultra=" + this.ultra + ", privilege=" + this.privilege + ")";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel$b */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$b;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", OMSTemplateModeType.view, "<init>", "(Landroid/view/View;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8382b extends RecyclerView.AbstractC0569e0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8382b(@NotNull View view) {
            super(view);
            view.getClass();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel$d */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8384d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27453a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f27454b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f27455c;

        static {
            int[] iArr = new int[MeTabRevampMemberCardHelper.CardType.values().length];
            try {
                iArr[MeTabRevampMemberCardHelper.CardType.VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MeTabRevampMemberCardHelper.CardType.SEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MeTabRevampMemberCardHelper.CardType.PREMIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MeTabRevampMemberCardHelper.CardType.ULTRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27453a = iArr;
            int[] iArr2 = new int[BenefitValue.values().length];
            try {
                iArr2[BenefitValue.NUM_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BenefitValue.NUM_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BenefitValue.NUM_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BenefitValue.NUM_INF.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BenefitValue.CHECK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BenefitValue.LOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f27454b = iArr2;
            int[] iArr3 = new int[MeTabIapType.values().length];
            try {
                iArr3[MeTabIapType.BOOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[MeTabIapType.SUPER_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[MeTabIapType.COMPLIMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[MeTabIapType.INSTANT_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f27455c = iArr3;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel$e */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$e", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8385e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f27457b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ VLinear f27458c;

        public C8385e(int i, VLinear vLinear) {
            this.f27457b = i;
            this.f27458c = vLinear;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            MeTabRevampTest1ViewModel.this.m44438k1(this.f27457b);
            this.f27458c.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel$f */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"com/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$f", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$b;", "", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "A", "(Landroid/view/ViewGroup;I)Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$b;", "holder", "", BaseSei.f14626Z, "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$b;I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8386f extends RecyclerView.Adapter<C8382b> {
        public C8386f() {
        }

        /* JADX INFO: renamed from: y */
        public static void m44478y(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, MeTabRevampMemberCardHelper.CardType cardType, View view) {
            ikx ikxVar = meTabRevampTest1ViewModel.presenter;
            if (ikxVar == null) {
                Intrinsics.m88391r("presenter");
                ikxVar = null;
            }
            ikxVar.m140517u1(cardType);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C8382b onCreateViewHolder(ViewGroup parent, int viewType) {
            parent.getClass();
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(MeTabRevampTest1ViewModel.this.m44412V(MeTabRevampMemberCardHelper.CardType.getEntries().get(viewType)), parent, false);
            viewInflate.getClass();
            return new C8382b(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MeTabRevampTest1ViewModel.this.displayedCardTypes.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return ((MeTabRevampMemberCardHelper.CardType) MeTabRevampTest1ViewModel.this.displayedCardTypes.get(position)).ordinal();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C8382b holder, int position) {
            holder.getClass();
            View view = holder.itemView;
            view.getClass();
            ViewGroup viewGroup = (ViewGroup) view;
            if (MeTabRevampTest1ViewModel.this.displayedCardTypes.size() == 1) {
                viewGroup.getLayoutParams().width = -1;
            }
            View childAt = viewGroup.getChildAt(0);
            childAt.getClass();
            View childAt2 = viewGroup.getChildAt(1);
            childAt2.getClass();
            VDraweeView vDraweeView = (VDraweeView) childAt2;
            View childAt3 = viewGroup.getChildAt(2);
            childAt3.getClass();
            VDraweeView vDraweeView2 = (VDraweeView) childAt3;
            View childAt4 = viewGroup.getChildAt(3);
            childAt4.getClass();
            VText_NoTopPadding vText_NoTopPadding = (VText_NoTopPadding) childAt4;
            View childAt5 = viewGroup.getChildAt(4);
            childAt5.getClass();
            SVGAnimationView sVGAnimationView = (SVGAnimationView) childAt5;
            View childAt6 = viewGroup.getChildAt(5);
            childAt6.getClass();
            MeTabRevampMemberCardHelper.C8376a c8376a = new MeTabRevampMemberCardHelper.C8376a(viewGroup, (VDraweeView) childAt, vDraweeView, vDraweeView2, vText_NoTopPadding, sVGAnimationView, (VDraweeView) childAt6);
            final MeTabRevampMemberCardHelper.CardType cardType = (MeTabRevampMemberCardHelper.CardType) MeTabRevampTest1ViewModel.this.displayedCardTypes.get(position);
            int size = MeTabRevampTest1ViewModel.this.cardViewsList.size();
            MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = MeTabRevampTest1ViewModel.this;
            if (size <= position) {
                meTabRevampTest1ViewModel.cardViewsList.add(TuplesKt.m88129a(c8376a, cardType));
            } else {
                meTabRevampTest1ViewModel.cardViewsList.set(position, TuplesKt.m88129a(c8376a, cardType));
            }
            MeTabRevampMemberCardHelper.INSTANCE.m44314e(MeTabRevampTest1ViewModel.this.getFrag(), c8376a, cardType);
            final MeTabRevampTest1ViewModel meTabRevampTest1ViewModel2 = MeTabRevampTest1ViewModel.this;
            bnl0.m105509E0(viewGroup, new View.OnClickListener() { // from class: l.hlx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MeTabRevampTest1ViewModel.C8386f.m44478y(meTabRevampTest1ViewModel2, cardType, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel$g */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel$g", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8387g extends RecyclerView.AbstractC0584t {
        public C8387g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView rv, int newState) {
            rv.getClass();
            if (newState == 0) {
                dix dixVar = MeTabRevampTest1ViewModel.this.pagerSnapHelper;
                LinearLayoutManager linearLayoutManager = null;
                if (dixVar == null) {
                    Intrinsics.m88391r("pagerSnapHelper");
                    dixVar = null;
                }
                LinearLayoutManager linearLayoutManager2 = MeTabRevampTest1ViewModel.this.cardLayoutManager;
                if (linearLayoutManager2 == null) {
                    Intrinsics.m88391r("cardLayoutManager");
                    linearLayoutManager2 = null;
                }
                View viewMo3812h = dixVar.mo3812h(linearLayoutManager2);
                if (viewMo3812h == null) {
                    return;
                }
                LinearLayoutManager linearLayoutManager3 = MeTabRevampTest1ViewModel.this.cardLayoutManager;
                if (linearLayoutManager3 == null) {
                    Intrinsics.m88391r("cardLayoutManager");
                } else {
                    linearLayoutManager = linearLayoutManager3;
                }
                int position = linearLayoutManager.getPosition(viewMo3812h);
                if (position >= 0) {
                    MeTabRevampTest1ViewModel.this.m44431g1(position);
                }
            }
        }
    }

    public MeTabRevampTest1ViewModel(@NotNull ProfileFrag profileFrag) {
        profileFrag.getClass();
        this.frag = profileFrag;
        this.intlMeTabDiscountEntryHost = new zdo(profileFrag);
        this.displayedCardTypes = CollectionsKt.listOf((Object[]) new MeTabRevampMemberCardHelper.CardType[]{MeTabRevampMemberCardHelper.CardType.VIP, MeTabRevampMemberCardHelper.CardType.SEE, MeTabRevampMemberCardHelper.CardType.PREMIUM, MeTabRevampMemberCardHelper.CardType.ULTRA});
        this.cardViewsList = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public static void m44331A(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140493L1();
    }

    /* JADX INFO: renamed from: B */
    public static void m44332B(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140492J1();
    }

    /* JADX INFO: renamed from: C */
    public static void m44333C(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140487D1();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ FrameLayout m44342X(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 16.0f;
        }
        return meTabRevampTest1ViewModel.m44414W(i, f);
    }

    /* JADX INFO: renamed from: a */
    public static void m44343a(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, int i, int i2) {
        if (meTabRevampTest1ViewModel._test1_card_container_test1_card_pager != null) {
            meTabRevampTest1ViewModel.m44397P1(i, i2 + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m44344b(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140488E1();
    }

    /* JADX INFO: renamed from: c */
    public static void m44345c(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel) {
        meTabRevampTest1ViewModel.m44459u0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(160L).start();
    }

    /* JADX INFO: renamed from: d */
    public static void m44346d(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140485B1();
    }

    /* JADX INFO: renamed from: e */
    public static void m44347e(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140520z1();
    }

    /* JADX INFO: renamed from: f */
    public static void m44348f(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140491I1();
    }

    /* JADX INFO: renamed from: f1 */
    private final void m44349f1() {
        czq.m113347c(m44448p0(), new Function1() { // from class: l.elx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeTabRevampTest1ViewModel.m44359u(this.f94592a, (View) obj);
            }
        });
        czq.m113347c(m44450q0(), new Function1() { // from class: l.lkx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeTabRevampTest1ViewModel.m44361w(this.f132503a, (View) obj);
            }
        });
        bnl0.m105509E0(m44453r0(), new View.OnClickListener() { // from class: l.mkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44363y(this.f137346a, view);
            }
        });
        bnl0.m105509E0(m44405S0(), new View.OnClickListener() { // from class: l.nkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44364z(this.f142486a, view);
            }
        });
        bnl0.m105509E0(m44399Q0(), new View.OnClickListener() { // from class: l.okx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44344b(this.f147795a, view);
            }
        });
        bnl0.m105509E0(m44413V0(), new View.OnClickListener() { // from class: l.pkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44331A(this.f152969a, view);
            }
        });
        bnl0.m105509E0(m44465x0(), new View.OnClickListener() { // from class: l.qkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44347e(this.f158181a, view);
            }
        });
        bnl0.m105509E0(m44385K0(), new View.OnClickListener() { // from class: l.rkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44332B(this.f163655a, view);
            }
        });
        bnl0.m105509E0(m44370D0(), new View.OnClickListener() { // from class: l.skx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44346d(this.f169337a, view);
            }
        });
        bnl0.m105509E0(m44379H0(), new View.OnClickListener() { // from class: l.tkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44333C(this.f174772a, view);
            }
        });
        bnl0.m105509E0(m44446o0(), new View.OnClickListener() { // from class: l.flx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44358s(this.f99697a, view);
            }
        });
        bnl0.m105509E0(m44455s0(), new View.OnClickListener() { // from class: l.glx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44360v(this.f104899a, view);
            }
        });
        VLinear vLinear = this.verificationBanner;
        if (vLinear == null) {
            Intrinsics.m88391r("verificationBanner");
            vLinear = null;
        }
        bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.kkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44352k(this.f127310a, view);
            }
        });
        m44380H1();
    }

    /* JADX INFO: renamed from: i */
    public static void m44350i(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        yyh0.INSTANCE.m217995k(meTabRevampTest1ViewModel.frag);
        box.INSTANCE.m105723l();
    }

    /* JADX INFO: renamed from: j */
    public static ProfilePrivilegePayGuide m44351j(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel) {
        return meTabRevampTest1ViewModel.renewGuideBanner;
    }

    /* JADX INFO: renamed from: k */
    public static void m44352k(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        Intent intentM57175Z1 = VerificationCenterAct.m57175Z1(meTabRevampTest1ViewModel.getAct(), false, "button");
        intentM57175Z1.getClass();
        meTabRevampTest1ViewModel.m44400Q1(intentM57175Z1);
    }

    /* JADX INFO: renamed from: l */
    public static void m44353l(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        Intent intentM59260Y1 = TanTanCoinAct.m59260Y1(meTabRevampTest1ViewModel.getAct());
        intentM59260Y1.getClass();
        meTabRevampTest1ViewModel.m44400Q1(intentM59260Y1);
    }

    /* JADX INFO: renamed from: m */
    public static void m44354m(View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.setMarginStart(view2.getWidth() + qa00.m175859d(2.0f));
        layoutParams2.topMargin = 0;
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: n */
    public static void m44355n(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, MeTabRevampMemberCardHelper.CardType cardType, boolean z, boolean z2, Privilege privilege, String str, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140516t1(cardType, z, z2, privilege, str);
    }

    /* JADX INFO: renamed from: p */
    public static void m44356p(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140519x1();
    }

    /* JADX INFO: renamed from: q */
    public static Unit m44357q(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, ProfilePrivilegePayGuide profilePrivilegePayGuide) {
        profilePrivilegePayGuide.getClass();
        meTabRevampTest1ViewModel.renewGuideBanner = profilePrivilegePayGuide;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static void m44358s(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140518v1(meTabRevampTest1ViewModel.currentCardPage);
    }

    /* JADX INFO: renamed from: u */
    public static Unit m44359u(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        view.getClass();
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140490H1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static void m44360v(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        Intent intentM57175Z1 = VerificationCenterAct.m57175Z1(meTabRevampTest1ViewModel.getAct(), false, "button");
        intentM57175Z1.getClass();
        meTabRevampTest1ViewModel.m44400Q1(intentM57175Z1);
    }

    /* JADX INFO: renamed from: w */
    public static Unit m44361w(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        view.getClass();
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140486C1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static void m44362x(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, int i, int i2, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int i3;
        if (meTabRevampTest1ViewModel._test1_card_container_test1_card_pager == null || (linearLayoutManager = meTabRevampTest1ViewModel.cardLayoutManager) == null || meTabRevampTest1ViewModel.pagerSnapHelper == null || meTabRevampTest1ViewModel.currentCardPage != i) {
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            if (i2 < 3) {
                meTabRevampTest1ViewModel.m44397P1(i, i2 + 1);
                return;
            }
            return;
        }
        dix dixVar = meTabRevampTest1ViewModel.pagerSnapHelper;
        LinearLayoutManager linearLayoutManager2 = null;
        if (dixVar == null) {
            Intrinsics.m88391r("pagerSnapHelper");
            dixVar = null;
        }
        LinearLayoutManager linearLayoutManager3 = meTabRevampTest1ViewModel.cardLayoutManager;
        if (linearLayoutManager3 == null) {
            Intrinsics.m88391r("cardLayoutManager");
        } else {
            linearLayoutManager2 = linearLayoutManager3;
        }
        int[] iArrMo3811c = dixVar.mo3811c(linearLayoutManager2, viewFindViewByPosition);
        if (iArrMo3811c == null || (i3 = iArrMo3811c[0]) == 0) {
            return;
        }
        recyclerView.scrollBy(i3, 0);
    }

    /* JADX INFO: renamed from: y */
    public static void m44363y(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140490H1();
    }

    /* JADX INFO: renamed from: z */
    public static void m44364z(MeTabRevampTest1ViewModel meTabRevampTest1ViewModel, View view) {
        ikx ikxVar = meTabRevampTest1ViewModel.presenter;
        if (ikxVar == null) {
            Intrinsics.m88391r("presenter");
            ikxVar = null;
        }
        ikxVar.m140489F1();
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public final VImage m44365A0() {
        VImage vImage = this._test1_iap_container_test1_boost_card_test1_boost_plus_badge;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_boost_card_test1_boost_plus_badge");
        return null;
    }

    /* JADX INFO: renamed from: A1 */
    public final void m44366A1(final View countView, final View badgeView) {
        countView.post(new Runnable() { // from class: l.jkx
            @Override // java.lang.Runnable
            public final void run() {
                MeTabRevampTest1ViewModel.m44354m(badgeView, countView);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public final VText_NoTopPadding m44367B0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_iap_container_test1_boost_card_test1_boost_title;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_boost_card_test1_boost_title");
        return null;
    }

    /* JADX INFO: renamed from: B1 */
    public final String m44368B1(MeTabRevampMemberCardHelper.CardType cardType) {
        String str;
        String str2;
        if (cardType == MeTabRevampMemberCardHelper.CardType.PREMIUM) {
            C4883c c4883c = CoreModule.f18264c;
            if (!c4883c.f20396j0.f20036g0) {
                IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31175H3 = c4883c.f20438x0.m31175H3("meTabSubscriptionCard");
                if (iapAffiliatePromotionDisplaySlotM31175H3 != null && (str2 = iapAffiliatePromotionDisplaySlotM31175H3.mainTitle) != null && str2.length() != 0) {
                    return iapAffiliatePromotionDisplaySlotM31175H3.mainTitle;
                }
                if (CoreModule.f18264c.f20396j0.m31610S4(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) && !CoreModule.f18264c.f20396j0.m31611T4()) {
                    return App.f16088e.getString(R$string.f18816R9);
                }
                if (CoreModule.f18264c.f20438x0.m31188T3()) {
                    return App.f16088e.getString(R$string.f18816R9);
                }
            }
        }
        PurchaseType purchaseTypeM44330a = C8380a.INSTANCE.m44330a(cardType);
        if (purchaseTypeM44330a == null || !CoreModule.f18264c.f20311G2.m153654l3(purchaseTypeM44330a) || (str = this.cachedUpgradePriceText) == null || str.length() == 0) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = App.f16088e.getString(R$string.f19003Xg);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{str}, 1));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m44369C1(int page) {
        if (page < 0 || page >= this.displayedCardTypes.size()) {
            return;
        }
        this.currentCardPage = page;
        if (this.cardLayoutManager == null || this.pagerSnapHelper == null || this._test1_card_container_test1_card_pager == null) {
            return;
        }
        m44441m0().stopScroll();
        m44397P1(page, 0);
        m44438k1(page);
        m44409T1(page);
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public final VFrame m44370D0() {
        VFrame vFrame = this._test1_iap_container_test1_compliment_card;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_compliment_card");
        return null;
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

    @NotNull
    /* JADX INFO: renamed from: E */
    public final View m44372E(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM140724b = ilx.m140724b(this, inflater, parent);
        viewM140724b.getClass();
        return viewM140724b;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final VText_NoTopPadding m44373E0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_iap_container_test1_compliment_card_test1_compliment_badge;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_compliment_card_test1_compliment_badge");
        return null;
    }

    /* JADX INFO: renamed from: E1 */
    public final void m44374E1(@Nullable String str) {
        this.cachedUpgradePriceText = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m44375F() {
        ilx.m140725c(this);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m44376F1() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        VFrame vFrameM44465x0 = m44465x0();
        SVGAnimationView sVGAnimationView = new SVGAnimationView(context, null, 0, 0, 14, null);
        sVGAnimationView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(56.0f), qa00.m175859d(56.0f));
        layoutParams.gravity = 49;
        vFrameM44465x0.addView(sVGAnimationView, layoutParams);
        this.boostSvga = sVGAnimationView;
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/e75c2718-a663-4b43-b675-12b67f54c98d.svga").repeatCount(0).into(sVGAnimationView);
    }

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public final VImage m44377G0() {
        VImage vImage = this._test1_iap_container_test1_compliment_card_test1_compliment_plus_badge;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_compliment_card_test1_compliment_plus_badge");
        return null;
    }

    /* JADX INFO: renamed from: G1 */
    public final void m44378G1() {
        RecyclerView recyclerViewM44441m0 = m44441m0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.cardLayoutManager = linearLayoutManager;
        recyclerViewM44441m0.setLayoutManager(linearLayoutManager);
        dix dixVar = new dix();
        this.pagerSnapHelper = dixVar;
        dixVar.mo3858b(recyclerViewM44441m0);
        eix.INSTANCE.m120948a(recyclerViewM44441m0);
        C8386f c8386f = new C8386f();
        this.cardAdapter = c8386f;
        recyclerViewM44441m0.setAdapter(c8386f);
        recyclerViewM44441m0.addOnScrollListener(new C8387g());
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public final VFrame m44379H0() {
        VFrame vFrame = this._test1_iap_container_test1_instant_match_card;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_instant_match_card");
        return null;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m44380H1() {
        bnl0.m105509E0(m44443n0(), new View.OnClickListener() { // from class: l.wkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44350i(this.f189605a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public final VText_NoTopPadding m44381I0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_iap_container_test1_instant_match_card_test1_instant_match_badge;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_instant_match_card_test1_instant_match_badge");
        return null;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m44382I1() {
        if (IntlCountryCodeController.m29125v()) {
            m44389M0().setImageResource(dbc0.f87315pe);
            m44393O0().setText(App.f16088e.getString(R$string.f19572q2));
            m44367B0().setText(App.f16088e.getString(R$string.f19603r2));
        }
        m44376F1();
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final VImage m44383J0() {
        VImage vImage = this._test1_iap_container_test1_instant_match_card_test1_instant_match_lock_badge;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_instant_match_card_test1_instant_match_lock_badge");
        return null;
    }

    /* JADX INFO: renamed from: J1 */
    public final void m44384J1() {
        ViewParent parent = m44396P0().getParent();
        parent.getClass();
        LinearLayout linearLayout = (LinearLayout) parent;
        int iIndexOfChild = linearLayout.indexOfChild(m44430g0());
        this.intlMeTabDiscountEntryHost.m219356a(linearLayout, m44430g0());
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

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public final VFrame m44385K0() {
        VFrame vFrame = this._test1_iap_container_test1_super_like_card;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_super_like_card");
        return null;
    }

    /* JADX INFO: renamed from: K1 */
    public final void m44386K1() {
        ViewParent parent = m44396P0().getParent();
        parent.getClass();
        ViewGroup viewGroup = (ViewGroup) parent;
        View viewFindViewById = viewGroup.findViewById(adc0.f70056Od);
        viewFindViewById.getClass();
        VLinear vLinear = (VLinear) viewFindViewById;
        this.verificationBanner = vLinear;
        VLinear vLinear2 = null;
        if (vLinear == null) {
            Intrinsics.m88391r("verificationBanner");
            vLinear = null;
        }
        viewGroup.removeView(vLinear);
        viewGroup.removeView(m44443n0());
        int iIndexOfChild = viewGroup.indexOfChild(m44396P0());
        viewGroup.addView(m44443n0(), iIndexOfChild + 1);
        VLinear vLinear3 = this.verificationBanner;
        if (vLinear3 == null) {
            Intrinsics.m88391r("verificationBanner");
        } else {
            vLinear2 = vLinear3;
        }
        viewGroup.addView(vLinear2, iIndexOfChild + 2);
        m44418Y0().setTypeface(Typeface.defaultFromStyle(1));
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final VText_NoTopPadding m44387L0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_iap_container_test1_super_like_card_test1_super_like_badge;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_super_like_card_test1_super_like_badge");
        return null;
    }

    /* JADX INFO: renamed from: L1 */
    public final void m44388L1(boolean active) {
        SVGAnimationView sVGAnimationView = this.boostSvga;
        if (sVGAnimationView == null) {
            return;
        }
        if (active) {
            m44469z0().setVisibility(4);
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
        m44469z0().setVisibility(0);
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final VImage m44389M0() {
        VImage vImage = this._test1_iap_container_test1_super_like_card_test1_super_like_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_super_like_card_test1_super_like_icon");
        return null;
    }

    /* JADX INFO: renamed from: M1 */
    public final void m44390M1() {
        if (bix.m104579a()) {
            return;
        }
        m44451q1(this.lastRenewGuide);
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public final VImage m44391N0() {
        VImage vImage = this._test1_iap_container_test1_super_like_card_test1_super_like_plus_badge;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_super_like_card_test1_super_like_plus_badge");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final void m44392O(int titleRes, int checkIconRes, BenefitValue targetVal, int targetColor, boolean youOwned, BenefitValue youVal, final MeTabRevampMemberCardHelper.CardType cardType, final Privilege privilege, boolean hideYouColumn) {
        CharSequence charSequence;
        String string = App.f16088e.getString(titleRes);
        string.getClass();
        if (StringsKt.m94303P(string, "%s", false, 2, null)) {
            string = StringsKt.m94324Z0(C15493d.m94370F(string, "%s", "", false, 4, null)).toString();
        }
        String str = string;
        VLinear vLinear = new VLinear(getContext());
        vLinear.setOrientation(0);
        vLinear.setGravity(16);
        m44434i0().addView(vLinear, new LinearLayout.LayoutParams(-1, qa00.m175859d(40.0f)));
        final boolean z = titleRes == R$string.f18575Ja;
        final boolean z2 = targetVal == BenefitValue.LOCK;
        final String strM44423b0 = m44423b0(titleRes);
        bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.alx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44355n(this.f72159a, cardType, z, z2, privilege, strM44423b0, view);
            }
        });
        VText_NoTopPadding vText_NoTopPadding = new VText_NoTopPadding(getContext());
        vText_NoTopPadding.setText(str);
        vText_NoTopPadding.setGravity(16);
        vText_NoTopPadding.setTextSize(14.0f);
        vText_NoTopPadding.setTextColor(-436207616);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText_NoTopPadding.setTypeface(typeface);
        vLinear.addView(vText_NoTopPadding, new LinearLayout.LayoutParams(0, -1, 1.0f));
        String str2 = "1";
        if (!hideYouColumn) {
            if (youOwned) {
                int[] iArr = C8384d.f27454b;
                int i = iArr[youVal.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    int i2 = iArr[youVal.ordinal()];
                    if (i2 == 1) {
                        charSequence = "1";
                    } else if (i2 != 2) {
                        charSequence = i2 != 3 ? "" : "3";
                    } else {
                        charSequence = "2";
                    }
                    Context context = getContext();
                    context.getClass();
                    VText_NoTopPadding vText_NoTopPadding2 = new VText_NoTopPadding(context);
                    vText_NoTopPadding2.setText(charSequence);
                    vText_NoTopPadding2.setGravity(17);
                    vText_NoTopPadding2.setTextSize(16.0f);
                    vText_NoTopPadding2.setTextColor(1291845632);
                    vText_NoTopPadding2.setTypeface(typeface);
                    vLinear.addView(vText_NoTopPadding2, m44401R());
                } else if (i != 4) {
                    vLinear.addView(m44414W(dbc0.f87348qe, 16.0f), m44401R());
                } else {
                    vLinear.addView(m44417Y(), m44401R());
                }
            } else {
                vLinear.addView(m44342X(this, dbc0.f87544we, 0.0f, 2, null), m44401R());
            }
        }
        int[] iArr2 = C8384d.f27454b;
        int i3 = iArr2[targetVal.ordinal()];
        if (i3 == 4) {
            vLinear.addView(m44417Y(), m44401R());
            return;
        }
        if (i3 == 5) {
            vLinear.addView(m44342X(this, checkIconRes, 0.0f, 2, null), m44401R());
            return;
        }
        if (i3 == 6) {
            vLinear.addView(m44342X(this, dbc0.f87544we, 0.0f, 2, null), m44401R());
            return;
        }
        int i4 = iArr2[targetVal.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                str2 = i4 != 3 ? "" : "3";
            } else {
                str2 = "2";
            }
        }
        Context context2 = getContext();
        context2.getClass();
        VText_NoTopPadding vText_NoTopPadding3 = new VText_NoTopPadding(context2);
        vText_NoTopPadding3.setText(str2);
        vText_NoTopPadding3.setGravity(17);
        vText_NoTopPadding3.setTextSize(16.0f);
        vText_NoTopPadding3.setTextColor(targetColor);
        vText_NoTopPadding3.setTypeface(typeface);
        vLinear.addView(vText_NoTopPadding3, m44401R());
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final VText_NoTopPadding m44393O0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_iap_container_test1_super_like_card_test1_super_like_title;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_super_like_card_test1_super_like_title");
        return null;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m44394O1(boolean show) {
        bnl0.m105524M(m44457t0(), show);
    }

    /* JADX INFO: renamed from: P */
    public final void m44395P() {
        VLinear rightIconContainer = m44420Z0().getRightIconContainer();
        ViewGroup.LayoutParams layoutParams = rightIconContainer.getLayoutParams();
        layoutParams.height = -1;
        rightIconContainer.setLayoutParams(layoutParams);
        rightIconContainer.setGravity(BadgeDrawable.TOP_END);
        View viewFindViewById = m44420Z0().findViewById(adc0.f70180W1);
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

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final VLinear m44396P0() {
        VLinear vLinear = this._test1_stats_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test1_stats_container");
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    public final void m44397P1(final int page, final int retry) {
        if (this._test1_card_container_test1_card_pager == null || this.cardLayoutManager == null || this.pagerSnapHelper == null) {
            return;
        }
        final RecyclerView recyclerViewM44441m0 = m44441m0();
        if (recyclerViewM44441m0.getWidth() == 0) {
            if (retry < 3) {
                recyclerViewM44441m0.post(new Runnable() { // from class: l.clx
                    @Override // java.lang.Runnable
                    public final void run() {
                        MeTabRevampTest1ViewModel.m44343a(this.f82433a, page, retry);
                    }
                });
            }
        } else {
            LinearLayoutManager linearLayoutManager = this.cardLayoutManager;
            if (linearLayoutManager == null) {
                Intrinsics.m88391r("cardLayoutManager");
                linearLayoutManager = null;
            }
            linearLayoutManager.scrollToPositionWithOffset(page, 0);
            recyclerViewM44441m0.post(new Runnable() { // from class: l.dlx
                @Override // java.lang.Runnable
                public final void run() {
                    MeTabRevampTest1ViewModel.m44362x(this.f89586a, page, retry, recyclerViewM44441m0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m44398Q(VText_NoTopPadding badge, MeTabIapType type) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(qa00.m175859d(8.0f));
        gradientDrawable.setColor(m44426d1(type));
        badge.setBackground(gradientDrawable);
        badge.setTextColor(App.f16088e.getColor(c9c0.f80407c2));
        badge.setGravity(17);
        badge.setIncludeFontPadding(false);
        CharSequence text = badge.getText();
        int length = text != null ? text.length() : 0;
        if (length >= 3) {
            badge.setTextSize(12.0f);
            badge.setMinimumWidth(qa00.m175859d(30.0f));
            badge.setPadding(qa00.m175859d(3.0f), 0, qa00.m175859d(3.0f), 0);
        } else if (length == 2) {
            badge.setTextSize(12.0f);
            badge.setMinimumWidth(qa00.m175859d(20.0f));
            badge.setPadding(qa00.m175859d(3.0f), 0, qa00.m175859d(3.0f), 0);
        } else {
            badge.setTextSize(12.0f);
            badge.setMinimumWidth(qa00.m175859d(16.0f));
            badge.setPadding(qa00.m175859d(4.0f), 0, qa00.m175859d(4.0f), 0);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public final VLinear m44399Q0() {
        VLinear vLinear = this._test1_stats_container_test1_likes_sent_stat;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test1_stats_container_test1_likes_sent_stat");
        return null;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m44400Q1(@NotNull Intent intent) {
        intent.getClass();
        this.frag.startActivity(intent);
    }

    /* JADX INFO: renamed from: R */
    public final LinearLayout.LayoutParams m44401R() {
        return new LinearLayout.LayoutParams(qa00.m175859d(64.0f), -1);
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public final VText_NoTopPadding m44402R0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_stats_container_test1_likes_sent_stat_test1_likes_sent_count;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_stats_container_test1_likes_sent_stat_test1_likes_sent_count");
        return null;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m44403R1(@NotNull List<? extends MeTabRevampMemberCardHelper.CardType> types) {
        types.getClass();
        if (Intrinsics.m88377d(types, this.displayedCardTypes)) {
            return;
        }
        this.displayedCardTypes = types;
        this.cardViewsList.clear();
        this.currentCardPage = 0;
        RecyclerView.Adapter<C8382b> adapter = this.cardAdapter;
        if (adapter != null) {
            if (adapter == null) {
                Intrinsics.m88391r("cardAdapter");
                adapter = null;
            }
            adapter.notifyDataSetChanged();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull ikx presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final VFrame m44405S0() {
        VFrame vFrame = this._test1_stats_container_test1_likes_you_stat;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_test1_stats_container_test1_likes_you_stat");
        return null;
    }

    /* JADX INFO: renamed from: S1 */
    public final void m44406S1() {
        boolean zM116537Z7 = CoreModule.f18264c.f20381e0.m116537Z7();
        if (zM116537Z7) {
            box.INSTANCE.m105724m();
            bnl0.m105515H0(m44443n0(), k3g.m148016a() ? CoreModule.m30934Q().mo68468sj() : this.frag.getString(R$string.f19791x4));
        }
        bnl0.m105524M(m44443n0(), zM116537Z7);
        Act act = this.frag.act();
        NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
        if (newMainAct != null) {
            newMainAct.m40836t7();
        }
    }

    /* JADX INFO: renamed from: T */
    public final View m44407T() {
        VImage vImage = new VImage(getContext());
        vImage.setImageResource(dbc0.f87640ze);
        VFrame vFrame = new VFrame(getContext());
        vFrame.setId(adc0.f70180W1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        layoutParams.gravity = BadgeDrawable.TOP_START;
        Unit unit = Unit.INSTANCE;
        vFrame.addView(vImage, layoutParams);
        vFrame.setPadding(0, qa00.f156323j, qa00.f156321h, 0);
        bnl0.m105509E0(vFrame, new View.OnClickListener() { // from class: l.blx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44348f(this.f77229a, view);
            }
        });
        return vFrame;
    }

    @NotNull
    /* JADX INFO: renamed from: T0 */
    public final VText_NoTopPadding m44408T0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_stats_container_test1_likes_you_stat_test1_likes_you_badge;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_stats_container_test1_likes_you_stat_test1_likes_you_badge");
        return null;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m44409T1(int page) {
        Triple triple;
        MeTabRevampMemberCardHelper.CardType cardType = (MeTabRevampMemberCardHelper.CardType) CollectionsKt.getOrNull(this.displayedCardTypes, page);
        if (cardType == null) {
            return;
        }
        if (!joa.m146396k4() && !CoreModule.f18264c.f20311G2.m153654l3(PurchaseType.TYPE_ULTRA_PREMIUM)) {
            m44446o0().setVisibility(8);
            return;
        }
        m44446o0().setVisibility(0);
        String strM44368B1 = m44368B1(cardType);
        int i = C8384d.f27453a[cardType.ordinal()];
        if (i == 1) {
            if (strM44368B1 == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = App.f16088e.getString(R$string.f19181db);
                string.getClass();
                strM44368B1 = String.format(string, Arrays.copyOf(new Object[]{"VIP"}, 1));
            }
            triple = new Triple(strM44368B1, Integer.valueOf(dbc0.f87086ie), -14409444);
        } else if (i == 2) {
            if (strM44368B1 == null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = App.f16088e.getString(R$string.f19181db);
                string2.getClass();
                strM44368B1 = String.format(string2, Arrays.copyOf(new Object[]{App.f16088e.getString(R$string.f18680Mn)}, 1));
            }
            triple = new Triple(strM44368B1, Integer.valueOf(dbc0.f87150ke), -1);
        } else if (i == 3) {
            if (strM44368B1 == null) {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String string3 = App.f16088e.getString(R$string.f19181db);
                string3.getClass();
                strM44368B1 = String.format(string3, Arrays.copyOf(new Object[]{"PREMIUM"}, 1));
            }
            triple = new Triple(strM44368B1, Integer.valueOf(dbc0.f87117je), -14409444);
        } else {
            if (i != 4) {
                nbr.m162172a();
                return;
            }
            if (strM44368B1 == null) {
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                String string4 = App.f16088e.getString(R$string.f19181db);
                string4.getClass();
                strM44368B1 = String.format(string4, Arrays.copyOf(new Object[]{"Ultra Premium"}, 1));
            }
            triple = new Triple(strM44368B1, Integer.valueOf(dbc0.f87183le), -399361);
        }
        String str = (String) triple.component1();
        int iIntValue = ((Number) triple.component2()).intValue();
        int iIntValue2 = ((Number) triple.component3()).intValue();
        m44446o0().setText(str);
        m44446o0().setBackgroundResource(iIntValue);
        m44446o0().setTextColor(iIntValue2);
    }

    /* JADX INFO: renamed from: U */
    public final View m44410U() {
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
        bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.ukx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44353l(this.f179463a, view);
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        vFrame.setPadding(qa00.f156318e, qa00.f156323j, 0, 0);
        vFrame.addView(vLinear, layoutParams2);
        return vFrame;
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public final VText_NoTopPadding m44411U0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_stats_container_test1_likes_you_stat_test1_likes_you_count;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_stats_container_test1_likes_you_stat_test1_likes_you_count");
        return null;
    }

    /* JADX INFO: renamed from: V */
    public final int m44412V(MeTabRevampMemberCardHelper.CardType type) {
        int i = C8384d.f27453a[type.ordinal()];
        if (i == 1) {
            return kec0.f126066t7;
        }
        if (i == 2) {
            return kec0.f126032r7;
        }
        if (i == 3) {
            return kec0.f126015q7;
        }
        if (i == 4) {
            return kec0.f126049s7;
        }
        nbr.m162172a();
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public final VFrame m44413V0() {
        VFrame vFrame = this._test1_stats_container_test1_visitors_stat;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_test1_stats_container_test1_visitors_stat");
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final FrameLayout m44414W(int resId, float sizeDp) {
        Context context = getContext();
        context.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        VImage vImage = new VImage(context);
        vImage.setImageResource(resId);
        int iM175859d = qa00.m175859d(sizeDp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM175859d, iM175859d);
        layoutParams.gravity = 17;
        frameLayout.addView(vImage, layoutParams);
        return frameLayout;
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final VText_NoTopPadding m44415W0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_stats_container_test1_visitors_stat_test1_visitors_count;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_stats_container_test1_visitors_stat_test1_visitors_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final VImage m44416X0() {
        VImage vImage = this._test1_stats_container_test1_visitors_stat_test1_visitors_dot;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_stats_container_test1_visitors_stat_test1_visitors_dot");
        return null;
    }

    /* JADX INFO: renamed from: Y */
    public final FrameLayout m44417Y() {
        Context context = getContext();
        context.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        VImage vImage = new VImage(context);
        vImage.setImageResource(dbc0.f87512ve);
        vImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(16.0f), qa00.m175859d(8.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(vImage, layoutParams);
        return frameLayout;
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public final VText_NoTopPadding m44418Y0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_verification_banner_test1_verification_banner_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_verification_banner_test1_verification_banner_text");
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final void m44419Z(int page) {
        VLinear vLinearM44432h0 = m44432h0();
        vLinearM44432h0.animate().cancel();
        vLinearM44432h0.animate().alpha(0.0f).setDuration(150L).setListener(new C8385e(page, vLinearM44432h0)).start();
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final VNavigationBar m44420Z0() {
        VNavigationBar vNavigationBar = this._top_navigationbar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_top_navigationbar");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    public final MeTabRevampMemberCardHelper.CardType m44421a0() {
        return (MeTabRevampMemberCardHelper.CardType) CollectionsKt.getOrNull(this.displayedCardTypes, this.currentCardPage);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m44422a1() {
        if (bix.m104579a()) {
            bnl0.m105524M(m44430g0(), false);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final String m44423b0(int resId) {
        Configuration configuration = new Configuration(this.frag.getResources().getConfiguration());
        configuration.setLocale(Locale.ENGLISH);
        String string = this.frag.requireContext().createConfigurationContext(configuration).getString(resId);
        string.getClass();
        return StringsKt.m94303P(string, "%s", false, 2, null) ? StringsKt.m94324Z0(C15493d.m94370F(string, "%s", "", false, 4, null)).toString() : string;
    }

    @NotNull
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final ProfileFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final zdo getIntlMeTabDiscountEntryHost() {
        return this.intlMeTabDiscountEntryHost;
    }

    /* JADX INFO: renamed from: d1 */
    public final int m44426d1(MeTabIapType type) {
        int i = C8384d.f27455c[type.ordinal()];
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

    @Override // p153l.iam
    public void destroy() {
        this.intlMeTabDiscountEntryHost.m219357b();
        m44375F();
    }

    /* JADX INFO: renamed from: e0 */
    public final List<C8381a> m44427e0() {
        boolean zM29125v = IntlCountryCodeController.m29125v();
        int i = zM29125v ? R$string.f19579q9 : R$string.f19548p9;
        int i2 = zM29125v ? R$string.f19337id : R$string.f19306hd;
        BenefitValue benefitValue = BenefitValue.LOCK;
        BenefitValue benefitValue2 = BenefitValue.CHECK;
        C8381a c8381a = new C8381a(R$string.f18680Mn, benefitValue, benefitValue2, benefitValue2, benefitValue2, Privilege.see_who_likes_me);
        C8381a c8381a2 = new C8381a(R$string.f18685Ms, benefitValue2, benefitValue, benefitValue2, benefitValue2, Privilege.vip_unlimited_likes);
        BenefitValue benefitValue3 = BenefitValue.NUM_1;
        BenefitValue benefitValue4 = BenefitValue.NUM_INF;
        C8381a c8381a3 = new C8381a(i, benefitValue, benefitValue, benefitValue3, benefitValue4, Privilege.boost);
        C8381a c8381a4 = new C8381a(i2, benefitValue, benefitValue, BenefitValue.NUM_2, benefitValue4, Privilege.vip_super_like);
        int i3 = R$string.f18574J9;
        BenefitValue benefitValue5 = BenefitValue.NUM_3;
        return CollectionsKt.listOf((Object[]) new C8381a[]{c8381a, c8381a2, c8381a3, c8381a4, new C8381a(i3, benefitValue, benefitValue, benefitValue5, benefitValue5, Privilege.premium_compliment), new C8381a(R$string.f18575Ja, benefitValue, benefitValue, benefitValue, benefitValue5, Privilege.immediately_match), new C8381a(R$string.f19493ng, benefitValue2, benefitValue, benefitValue2, benefitValue2, Privilege.vip_location), new C8381a(R$string.f19494nh, benefitValue, benefitValue, benefitValue2, benefitValue2, null), new C8381a(R$string.f19089ac, benefitValue, benefitValue, benefitValue2, benefitValue2, Privilege.intl_visitor), new C8381a(R$string.f19573q3, benefitValue, benefitValue, benefitValue2, benefitValue2, Privilege.intl_advanced_filter), new C8381a(R$string.f19033Yg, benefitValue, benefitValue, benefitValue2, benefitValue2, Privilege.liked_user), new C8381a(R$string.f19216eg, benefitValue, benefitValue, benefitValue2, benefitValue2, Privilege.message_read_state), new C8381a(R$string.f18313Ar, benefitValue2, benefitValue, benefitValue2, benefitValue2, Privilege.vip_undo), new C8381a(R$string.f18967Wa, benefitValue, benefitValue, benefitValue2, benefitValue2, Privilege.tribe), new C8381a(R$string.f19431lg, benefitValue2, benefitValue, benefitValue2, benefitValue2, Privilege.intl_no_ad), new C8381a(R$string.f19400kg, benefitValue2, benefitValue, benefitValue2, benefitValue2, Privilege.vip_membership_active_time_gp), new C8381a(R$string.f19462mg, benefitValue2, benefitValue, benefitValue2, benefitValue2, Privilege.vip_badge), new C8381a(R$string.f18329Bc, benefitValue2, benefitValue, benefitValue2, benefitValue2, Privilege.vip_membership_search_gp)});
    }

    /* JADX INFO: renamed from: e1 */
    public final void m44428e1() {
        m44438k1(this.currentCardPage);
    }

    /* JADX INFO: renamed from: f0 */
    public final BenefitValue m44429f0(C8381a item, boolean isVip, boolean isSee, boolean isPremium, boolean isUltra) {
        if (isUltra) {
            return item.getUltra();
        }
        if (isPremium) {
            return item.getPremium();
        }
        if (isVip && isSee) {
            return item.getVip() != BenefitValue.LOCK ? item.getVip() : item.getSee();
        }
        if (isVip) {
            return item.getVip();
        }
        return isSee ? item.getSee() : BenefitValue.LOCK;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VLinear m44430g0() {
        VLinear vLinear = this._test1_banner_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test1_banner_container");
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m44431g1(int page) {
        if (page == this.currentCardPage) {
            return;
        }
        this.currentCardPage = page;
        m44419Z(page);
        m44470z1(page);
        m44409T1(page);
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VLinear m44432h0() {
        VLinear vLinear = this._test1_benefits_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test1_benefits_container");
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m44433h1() {
        if (this.cardViewsList.isEmpty()) {
            return;
        }
        MeTabRevampMemberCardHelper meTabRevampMemberCardHelper = MeTabRevampMemberCardHelper.INSTANCE;
        List<Pair<MeTabRevampMemberCardHelper.C8376a, MeTabRevampMemberCardHelper.CardType>> list = this.cardViewsList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MeTabRevampMemberCardHelper.C8376a) ((Pair) it.next()).getFirst());
        }
        MeTabRevampMemberCardHelper.C8376a[] c8376aArr = (MeTabRevampMemberCardHelper.C8376a[]) arrayList.toArray(new MeTabRevampMemberCardHelper.C8376a[0]);
        meTabRevampMemberCardHelper.m44313d((MeTabRevampMemberCardHelper.C8376a[]) Arrays.copyOf(c8376aArr, c8376aArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VLinear m44434i0() {
        VLinear vLinear = this._test1_benefits_container_test1_benefits_rows;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test1_benefits_container_test1_benefits_rows");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m44372E(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VText_NoTopPadding m44435j0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_benefits_container_test1_benefits_target_title;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_benefits_container_test1_benefits_target_title");
        return null;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m44436j1() {
        m44459u0().animate().cancel();
        m44459u0().setScaleX(1.0f);
        m44459u0().setScaleY(1.0f);
        m44459u0().animate().scaleX(1.08f).scaleY(1.08f).setDuration(160L).withEndAction(new Runnable() { // from class: l.vkx
            @Override // java.lang.Runnable
            public final void run() {
                MeTabRevampTest1ViewModel.m44345c(this.f184528a);
            }
        }).start();
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final VText_NoTopPadding m44437k0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_benefits_container_test1_benefits_title;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_benefits_container_test1_benefits_title");
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m44438k1(int page) {
        int i;
        BenefitValue vip;
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = this;
        MeTabRevampMemberCardHelper.CardType cardType = (MeTabRevampMemberCardHelper.CardType) CollectionsKt.getOrNull(meTabRevampTest1ViewModel.displayedCardTypes, page);
        if (cardType == null) {
            return;
        }
        VText_NoTopPadding vText_NoTopPaddingM44435j0 = meTabRevampTest1ViewModel.m44435j0();
        meTabRevampTest1ViewModel.m44437k0().setText(App.f16088e.getString(R$string.f19517o9));
        meTabRevampTest1ViewModel.m44434i0().removeAllViews();
        int[] iArr = C8384d.f27453a;
        int i2 = iArr[cardType.ordinal()];
        int i3 = -815616;
        if (i2 == 1) {
            vText_NoTopPaddingM44435j0.setText("VIP");
            vText_NoTopPaddingM44435j0.setTextSize(12.0f);
            vText_NoTopPaddingM44435j0.setTextColor(-14076);
        } else if (i2 == 2) {
            vText_NoTopPaddingM44435j0.setText("SEE");
            vText_NoTopPaddingM44435j0.setTextSize(12.0f);
            vText_NoTopPaddingM44435j0.setTextColor(-29390);
        } else if (i2 == 3) {
            vText_NoTopPaddingM44435j0.setText("PREMIUM");
            vText_NoTopPaddingM44435j0.setTextSize(12.0f);
            vText_NoTopPaddingM44435j0.setTextColor(-815616);
        } else {
            if (i2 != 4) {
                nbr.m162172a();
                return;
            }
            vText_NoTopPaddingM44435j0.setText("ULTRA\nPREMIUM");
            vText_NoTopPaddingM44435j0.setTextSize(11.0f);
            vText_NoTopPaddingM44435j0.setLineSpacing(0.0f, 1.0f);
            vText_NoTopPaddingM44435j0.setTextColor(-3716891);
        }
        int i4 = iArr[cardType.ordinal()];
        if (i4 == 1) {
            i = dbc0.f87480ue;
        } else if (i4 == 2) {
            i = dbc0.f87414se;
        } else if (i4 == 3) {
            i = dbc0.f87381re;
        } else {
            if (i4 != 4) {
                nbr.m162172a();
                return;
            }
            i = dbc0.f87447te;
        }
        int i5 = i;
        int i6 = iArr[cardType.ordinal()];
        if (i6 == 1) {
            i3 = -14076;
        } else if (i6 == 2) {
            i3 = -29390;
        } else if (i6 != 3) {
            if (i6 != 4) {
                nbr.m162172a();
                return;
            }
            i3 = -3716891;
        }
        boolean z = !joa.m146401n4();
        boolean z2 = !joa.m146392i4();
        boolean z3 = !joa.m146386f4();
        boolean zM146396k4 = joa.m146396k4();
        boolean z4 = !zM146396k4;
        boolean z5 = !zM146396k4 && cardType == MeTabRevampMemberCardHelper.CardType.ULTRA;
        bnl0.m105524M(meTabRevampTest1ViewModel.m44439l0(), !z5);
        for (C8381a c8381a : meTabRevampTest1ViewModel.m44427e0()) {
            int i7 = C8384d.f27453a[cardType.ordinal()];
            if (i7 == 1) {
                vip = c8381a.getVip();
            } else if (i7 == 2) {
                vip = c8381a.getSee();
            } else if (i7 == 3) {
                vip = c8381a.getPremium();
            } else {
                if (i7 != 4) {
                    nbr.m162172a();
                    return;
                }
                vip = c8381a.getUltra();
            }
            boolean zM44477g = c8381a.m44477g(z, z2, z3, z4);
            int i8 = i3;
            BenefitValue benefitValueM44429f0 = meTabRevampTest1ViewModel.m44429f0(c8381a, z, z2, z3, z4);
            boolean z6 = z;
            int i9 = i5;
            boolean z7 = z5;
            meTabRevampTest1ViewModel = this;
            meTabRevampTest1ViewModel.m44392O(c8381a.getTitleRes(), i9, vip, i8, zM44477g, benefitValueM44429f0, cardType, c8381a.getPrivilege(), z7);
            i3 = i8;
            z5 = z7;
            z2 = z2;
            z3 = z3;
            z4 = z4;
            i5 = i9;
            z = z6;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final VText_NoTopPadding m44439l0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_benefits_container_test1_benefits_you_title;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_benefits_container_test1_benefits_you_title");
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m44440l1(@NotNull Picture.ImageUri uri) {
        uri.getClass();
        m44448p0().setImageUrl(uri.formatted());
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final RecyclerView m44441m0() {
        RecyclerView recyclerView = this._test1_card_container_test1_card_pager;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_test1_card_container_test1_card_pager");
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m44442m1(@NotNull User user) {
        user.getClass();
        m44409T1(this.currentCardPage);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final VText_NoTopPadding m44443n0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_fake_tip;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_fake_tip");
        return null;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m44444n1(VText_NoTopPadding countBadge, VImage plusBadge, MeTabIapType type) {
        if (plusBadge != null) {
            plusBadge.setVisibility(8);
        }
        if (gix.m130390e(type)) {
            countBadge.setVisibility(0);
            countBadge.setText("∞");
            m44398Q(countBadge, type);
            return;
        }
        int iM130387a = gix.m130387a(type);
        if (iM130387a > 0) {
            countBadge.setVisibility(0);
            countBadge.setText(znx.m220679b(iM130387a, 0, 2, null));
            m44398Q(countBadge, type);
        } else {
            countBadge.setVisibility(8);
            if (plusBadge != null) {
                plusBadge.setVisibility(0);
            }
        }
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: o */
    public boolean mo44445o() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final VText_NoTopPadding m44446o0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_floating_cta;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_floating_cta");
        return null;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m44447o1() {
        m44444n1(m44467y0(), m44365A0(), MeTabIapType.BOOST);
        m44444n1(m44387L0(), m44391N0(), MeTabIapType.SUPER_LIKE);
        m44444n1(m44373E0(), m44377G0(), MeTabIapType.COMPLIMENT);
        m44449p1();
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final AutoVDraweeView m44448p0() {
        AutoVDraweeView autoVDraweeView = this._test1_header_container_test1_avatar;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_test1_header_container_test1_avatar");
        return null;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m44449p1() {
        MeTabIapType meTabIapType = MeTabIapType.INSTANT_MATCH;
        if (gix.m130390e(meTabIapType)) {
            m44383J0().setVisibility(8);
            m44381I0().setVisibility(0);
            m44381I0().setText("∞");
            m44398Q(m44381I0(), meTabIapType);
            return;
        }
        int iM130391f = gix.m130391f(meTabIapType);
        if (iM130391f > 0) {
            m44383J0().setVisibility(8);
            m44381I0().setVisibility(0);
            m44381I0().setText(znx.m220679b(iM130391f, 0, 2, null));
            m44398Q(m44381I0(), meTabIapType);
            return;
        }
        m44381I0().setVisibility(8);
        m44383J0().setVisibility(0);
        if (gix.m130389c()) {
            m44383J0().setImageResource(dbc0.f87282oe);
        } else {
            m44383J0().setImageResource(dbc0.f87216me);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final VImage m44450q0() {
        VImage vImage = this._test1_header_container_test1_avatar_edit;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_header_container_test1_avatar_edit");
        return null;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m44451q1(@Nullable IntlTabMePayGuide guide) {
        this.lastRenewGuide = guide;
        if (bix.m104579a()) {
            bnl0.m105524M(m44430g0(), false);
        } else {
            iix.INSTANCE.m140169a(m44430g0(), guide, getAct(), new Function0() { // from class: l.xkx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MeTabRevampTest1ViewModel.m44351j(this.f194828a);
                }
            }, new Function1() { // from class: l.ykx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeTabRevampTest1ViewModel.m44357q(this.f200497a, (ProfilePrivilegePayGuide) obj);
                }
            });
        }
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: r */
    public void mo44452r() {
        bnl0.m105542Z(m44420Z0());
        m44420Z0().setBackgroundColor(App.f16088e.getColor(R.color.white));
        m44420Z0().setTitle((CharSequence) null);
        m44420Z0().m224835z(m44410U());
        m44420Z0().m224835z(m44407T());
        m44395P();
        m44386K1();
        m44384J1();
        m44382I1();
        m44378G1();
        m44428e1();
        m44349f1();
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VText_NoTopPadding m44453r0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_header_container_test1_name_row_test1_name;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_header_container_test1_name_row_test1_name");
        return null;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m44454r1(long seeBadgeCount) {
        VText_NoTopPadding vText_NoTopPaddingM44408T0 = m44408T0();
        if (seeBadgeCount <= 0 || !spl0.m187359K()) {
            bnl0.m105524M(vText_NoTopPaddingM44408T0, false);
            return;
        }
        vText_NoTopPaddingM44408T0.setText("");
        vText_NoTopPaddingM44408T0.setBackgroundResource(dbc0.f86939e);
        vText_NoTopPaddingM44408T0.setMinimumWidth(qa00.m175859d(8.0f));
        vText_NoTopPaddingM44408T0.setMinimumHeight(qa00.m175859d(8.0f));
        ViewGroup.LayoutParams layoutParams = vText_NoTopPaddingM44408T0.getLayoutParams();
        layoutParams.width = qa00.m175859d(8.0f);
        layoutParams.height = qa00.m175859d(8.0f);
        vText_NoTopPaddingM44408T0.setLayoutParams(layoutParams);
        vText_NoTopPaddingM44408T0.setPadding(0, 0, 0, 0);
        bnl0.m105524M(vText_NoTopPaddingM44408T0, true);
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final VImage m44455s0() {
        VImage vImage = this._test1_header_container_test1_name_row_test1_verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_header_container_test1_name_row_test1_verification_icon");
        return null;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m44456s1(long likesYou, long likesSent, long visitors, long seeBadgeCount, boolean showVisitorDot) {
        m44411U0().setText(znx.m220681d(likesYou));
        m44402R0().setText(znx.m220680c(likesSent));
        m44415W0().setText(znx.m220682e(visitors));
        m44454r1(seeBadgeCount);
        bnl0.m105524M(m44416X0(), showVisitorDot);
        m44366A1(m44411U0(), m44408T0());
        m44366A1(m44415W0(), m44416X0());
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final VOnlineIndicator m44457t0() {
        VOnlineIndicator vOnlineIndicator = this._test1_header_container_test1_sub_dot;
        if (vOnlineIndicator != null) {
            return vOnlineIndicator;
        }
        Intrinsics.m88391r("_test1_header_container_test1_sub_dot");
        return null;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m44458t1(@NotNull User user) {
        user.getClass();
        MeTabRevampSubscriptionStyle meTabRevampSubscriptionStyle = MeTabRevampSubscriptionStyle.INSTANCE;
        meTabRevampSubscriptionStyle.m44322a(m44459u0(), m44461v0(), m44463w0(), user);
        meTabRevampSubscriptionStyle.m44323b(user);
        bnl0.m105509E0(m44459u0(), new View.OnClickListener() { // from class: l.zkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeTabRevampTest1ViewModel.m44356p(this.f204861a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public final VLinear m44459u0() {
        VLinear vLinear = this._test1_header_container_test1_subscription_btn;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_test1_header_container_test1_subscription_btn");
        return null;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m44460u1(@NotNull User user) {
        user.getClass();
        bnl0.m105515H0(m44453r0(), user.name);
    }

    @NotNull
    /* JADX INFO: renamed from: v0 */
    public final VImage m44461v0() {
        VImage vImage = this._test1_header_container_test1_subscription_btn_test1_sub_badge;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_header_container_test1_subscription_btn_test1_sub_badge");
        return null;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m44462v1(@NotNull User user) {
        user.getClass();
        boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
        m44455s0().setImageResource(dbc0.f86103Du);
        if (zIsPicVerificationVerified) {
            m44455s0().clearColorFilter();
            m44455s0().setAlpha(1.0f);
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            m44455s0().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            m44455s0().setAlpha(1.0f);
        }
        m44464w1(zIsPicVerificationVerified);
    }

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public final VText_NoTopPadding m44463w0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_header_container_test1_subscription_btn_test1_sub_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_header_container_test1_subscription_btn_test1_sub_text");
        return null;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m44464w1(boolean picVerified) {
        VLinear vLinear = this.verificationBanner;
        if (vLinear == null) {
            Intrinsics.m88391r("verificationBanner");
            vLinear = null;
        }
        vLinear.setVisibility(picVerified ? 8 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final VFrame m44465x0() {
        VFrame vFrame = this._test1_iap_container_test1_boost_card;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_boost_card");
        return null;
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: x2 */
    public void mo44466x2() {
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public final VText_NoTopPadding m44467y0() {
        VText_NoTopPadding vText_NoTopPadding = this._test1_iap_container_test1_boost_card_test1_boost_badge;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_boost_card_test1_boost_badge");
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m44468y1() {
        String strM99234a = aox.m99234a();
        VText_NoTopPadding vText_NoTopPadding = this.navWalletText;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(strM99234a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final VImage m44469z0() {
        VImage vImage = this._test1_iap_container_test1_boost_card_test1_boost_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_test1_iap_container_test1_boost_card_test1_boost_icon");
        return null;
    }

    /* JADX INFO: renamed from: z1 */
    public final void m44470z1(int page) {
        if (page < this.cardViewsList.size()) {
            MeTabRevampMemberCardHelper.C8376a first = this.cardViewsList.get(page).getFirst();
            if (bnl0.m105529O0(first.getPrivilegeSvga())) {
                first.getPrivilegeSvga().startAnimation();
            }
        }
    }
}
