package com.p000p1.mobile.putong.core.p001ui.profile.profilelist;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.core.p001ui.profile.EditProfileAct;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.ParallaxView;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct_CustomTransition;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.ProfileCreateData;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.ProfileListFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileCustomBar;
import com.p000p1.mobile.putong.core.p001ui.profile.views.VPager_SquaredRefactor;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.app.AutoReleaseVideoFrag;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.GreetingPermission;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RiskOtherData;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p1.mobile.putong.core.ui.FloatShadowButton;
import com.p1.mobile.putong.core.ui.GradientBgWithShadowButton;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.core.ui.report.f;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p1.mobile.putong.core.ui.vip.greet.ProfileSendContainerView;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.core.util.DebugUtil;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.data.Contact;
import com.p1.mobile.putong.data.Detect;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.DetectText;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PicVerification;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.SwipeExtraScData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import l.ark;
import l.bt0;
import l.c40;
import l.cll0;
import l.cwf0;
import l.d30;
import l.d5m;
import l.e30;
import l.e51;
import l.ezc0;
import l.f30;
import l.f6c0;
import l.f9j;
import l.f9k0;
import l.fap;
import l.ft4;
import l.g30;
import l.grk;
import l.gwp;
import l.h7c0;
import l.h7n;
import l.hfw;
import l.hpd0;
import l.i0e;
import l.i0g0;
import l.ick0;
import l.j760;
import l.jjb0;
import l.jo0;
import l.l9a0;
import l.l9b;
import l.lra0;
import l.lsi0;
import l.mb90;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.myc0;
import l.nkp;
import l.nmn;
import l.o660;
import l.o6j0;
import l.o7r;
import l.och0;
import l.ogl0;
import l.ok3;
import l.osi0;
import l.p420;
import l.p660;
import l.qer;
import l.qib0;
import l.qp8;
import l.r4w;
import l.r65;
import l.rlt;
import l.roj0;
import l.rxg0;
import l.rzb0;
import l.sb90;
import l.swh0;
import l.t100;
import l.t7c0;
import l.tkp;
import l.tpd0;
import l.ttn;
import l.tvf;
import l.u4c0;
import l.u59;
import l.uc80;
import l.upa;
import l.uqd0;
import l.v9j;
import l.vdj;
import l.vwb;
import l.w0c0;
import l.w85;
import l.w9a0;
import l.w9j;
import l.wc80;
import l.wge0;
import l.wn90;
import l.wsh;
import l.x2c0;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xdx;
import l.xh0;
import l.xma;
import l.ya5;
import l.yij0;
import l.zpd0;
import l.zvf0;
import l.zzc0;
import org.jetbrains.annotations.NotNull;
import org.joor.Reflect;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.a1m;
import p002l.aoa0;
import p002l.bk90;
import p002l.boa0;
import p002l.bq90;
import p002l.cme;
import p002l.cne;
import p002l.cp60;
import p002l.cqa0;
import p002l.cua0;
import p002l.dj90;
import p002l.dle;
import p002l.dna0;
import p002l.epa0;
import p002l.f5a0;
import p002l.fj90;
import p002l.fna0;
import p002l.fr90;
import p002l.g5a0;
import p002l.gd70;
import p002l.gne;
import p002l.goe;
import p002l.gta0;
import p002l.hn2;
import p002l.hra0;
import p002l.ie90;
import p002l.ih90;
import p002l.iqa0;
import p002l.ir90;
import p002l.iua0;
import p002l.j4p;
import p002l.jg90;
import p002l.jle;
import p002l.jpa0;
import p002l.jta0;
import p002l.kea0;
import p002l.koa0;
import p002l.kr90;
import p002l.l33;
import p002l.loe;
import p002l.ls90;
import p002l.mi90;
import p002l.mm90;
import p002l.mqa0;
import p002l.mt90;
import p002l.n3b0;
import p002l.ne90;
import p002l.ota0;
import p002l.pqa0;
import p002l.rqa0;
import p002l.tke;
import p002l.tme;
import p002l.toa0;
import p002l.tqa0;
import p002l.u2a0;
import p002l.uf90;
import p002l.uta0;
import p002l.wg90;
import p002l.woa0;
import p002l.wq90;
import p002l.wqa0;
import p002l.x0m;
import p002l.xne;
import p002l.yj90;
import p002l.yqa0;
import p002l.yz9;
import p002l.zl90;
import p002l.zp90;
import p002l.zva0;
import rx.subjects.a;
import v.CoverGuideView;
import v.SimpleCoverGuideView;
import v.VButton;
import v.VEditText;
import v.VFrame;
import v.VFrame_FlipContainer;
import v.VFrame_Shadow;
import v.VImage;
import v.VLinear;
import v.VListCell;
import v.VProgressBar;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileListFrag extends AutoReleaseVideoFrag implements View.OnClickListener, x0m {

    /* JADX INFO: renamed from: G4 */
    public static cwf0 f1430G4 = new cwf0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: H4 */
    public static Field f1431H4 = Reflect.on(Toolbar.class).field0("mMenuView");

    /* JADX INFO: renamed from: I4 */
    public static CategorySuggestions f1432I4;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f1433A;

    /* JADX INFO: renamed from: A1 */
    public VLinear f1434A1;

    /* JADX INFO: renamed from: A3 */
    public View f1436A3;

    /* JADX INFO: renamed from: A4 */
    public boolean f1437A4;

    /* JADX INFO: renamed from: B */
    public View f1438B;

    /* JADX INFO: renamed from: B4 */
    public boolean f1442B4;

    /* JADX INFO: renamed from: C */
    public TabLayout f1443C;

    /* JADX INFO: renamed from: C3 */
    public int f1446C3;

    /* JADX INFO: renamed from: C4 */
    public final hra0 f1447C4;

    /* JADX INFO: renamed from: D */
    public VFrame f1448D;

    /* JADX INFO: renamed from: D3 */
    public boolean f1451D3;

    /* JADX INFO: renamed from: D4 */
    public d30 f1452D4;

    /* JADX INFO: renamed from: E */
    public VProgressBar f1453E;

    /* JADX INFO: renamed from: E0 */
    public VFrame_Shadow f1454E0;

    /* JADX INFO: renamed from: E3 */
    public ProfileCreateData f1457E3;

    /* JADX INFO: renamed from: E4 */
    public HashMap<View, View> f1458E4;

    /* JADX INFO: renamed from: F */
    public VFrame f1459F;

    /* JADX INFO: renamed from: F0 */
    public VFrame_FlipContainer f1460F0;

    /* JADX INFO: renamed from: F4 */
    public Set<String> f1464F4;

    /* JADX INFO: renamed from: G */
    public VProgressBar f1465G;

    /* JADX INFO: renamed from: G0 */
    public VImage f1466G0;

    /* JADX INFO: renamed from: G3 */
    public LikedUser f1469G3;

    /* JADX INFO: renamed from: H */
    public ParallaxView f1470H;

    /* JADX INFO: renamed from: H0 */
    public VText f1471H0;

    /* JADX INFO: renamed from: H3 */
    public LikeUser f1474H3;

    /* JADX INFO: renamed from: I */
    public VLinear f1475I;

    /* JADX INFO: renamed from: I0 */
    public VLinear f1476I0;

    /* JADX INFO: renamed from: I3 */
    public User f1479I3;

    /* JADX INFO: renamed from: J */
    public FrameLayout f1480J;

    /* JADX INFO: renamed from: J0 */
    public VFrame_FlipContainer f1481J0;

    /* JADX INFO: renamed from: K */
    public CardView f1485K;

    /* JADX INFO: renamed from: K0 */
    public VImage f1486K0;

    /* JADX INFO: renamed from: L */
    public CardView f1490L;

    /* JADX INFO: renamed from: L0 */
    public FrameLayout f1491L0;

    /* JADX INFO: renamed from: M */
    public CardView f1495M;

    /* JADX INFO: renamed from: M0 */
    public GradientBgWithShadowButton f1496M0;

    /* JADX INFO: renamed from: N */
    public RoundedRectangleProgressView f1500N;

    /* JADX INFO: renamed from: N0 */
    public VFrame_Shadow f1501N0;

    /* JADX INFO: renamed from: N1 */
    public d5m f1502N1;

    /* JADX INFO: renamed from: O */
    public RoundedRectangleProgressView f1505O;

    /* JADX INFO: renamed from: O0 */
    public VFrame_Shadow f1506O0;

    /* JADX INFO: renamed from: P */
    public VImage f1510P;

    /* JADX INFO: renamed from: P0 */
    public RelativeLayout f1511P0;

    /* JADX INFO: renamed from: P3 */
    public String f1514P3;

    /* JADX INFO: renamed from: Q */
    public VImage f1515Q;

    /* JADX INFO: renamed from: Q0 */
    public RelativeLayout f1516Q0;

    /* JADX INFO: renamed from: R */
    public VText f1520R;

    /* JADX INFO: renamed from: R0 */
    public VLinear f1521R0;

    /* JADX INFO: renamed from: S */
    public VText f1525S;

    /* JADX INFO: renamed from: S0 */
    public VButton f1526S0;

    /* JADX INFO: renamed from: S3 */
    public CityCData f1529S3;

    /* JADX INFO: renamed from: T */
    public ViewStub f1530T;

    /* JADX INFO: renamed from: T0 */
    public VButton f1531T0;

    /* JADX INFO: renamed from: U */
    public ViewStub f1535U;

    /* JADX INFO: renamed from: U0 */
    public ConstraintLayout f1536U0;

    /* JADX INFO: renamed from: V */
    public RecyclerView f1540V;

    /* JADX INFO: renamed from: V0 */
    public FrameLayout f1541V0;

    /* JADX INFO: renamed from: W */
    public FloatShadowButton f1545W;

    /* JADX INFO: renamed from: W0 */
    public View f1546W0;

    /* JADX INFO: renamed from: W3 */
    public View f1549W3;

    /* JADX INFO: renamed from: X */
    public View f1550X;

    /* JADX INFO: renamed from: X0 */
    public VEditText f1551X0;

    /* JADX INFO: renamed from: X1 */
    public j760<Integer, Integer> f1552X1;

    /* JADX INFO: renamed from: X3 */
    public View f1554X3;

    /* JADX INFO: renamed from: Y */
    public RelativeLayout f1555Y;

    /* JADX INFO: renamed from: Y0 */
    public VText f1556Y0;

    /* JADX INFO: renamed from: Y1 */
    public c40 f1557Y1;

    /* JADX INFO: renamed from: Y3 */
    public ViewTreeObserver.OnGlobalLayoutListener f1559Y3;

    /* JADX INFO: renamed from: Z */
    public VFrame_Shadow f1560Z;

    /* JADX INFO: renamed from: Z0 */
    public FrameLayout f1561Z0;

    /* JADX INFO: renamed from: Z1 */
    public SimpleCoverGuideView f1562Z1;

    /* JADX INFO: renamed from: Z3 */
    public boolean f1564Z3;

    /* JADX INFO: renamed from: a1 */
    public View f1565a1;

    /* JADX INFO: renamed from: a2 */
    public CoverGuideView f1566a2;

    /* JADX INFO: renamed from: a4 */
    public boolean f1568a4;

    /* JADX INFO: renamed from: b1 */
    public TextView f1569b1;

    /* JADX INFO: renamed from: b2 */
    public LinearLayoutManager f1570b2;

    /* JADX INFO: renamed from: b4 */
    public xh0 f1572b4;

    /* JADX INFO: renamed from: c1 */
    public ProfileSendContainerView f1573c1;

    /* JADX INFO: renamed from: c4 */
    public User f1576c4;

    /* JADX INFO: renamed from: d1 */
    public VFrame_Shadow f1577d1;

    /* JADX INFO: renamed from: d4 */
    public final a<roj0> f1580d4;

    /* JADX INFO: renamed from: e1 */
    public RelativeLayout f1581e1;

    /* JADX INFO: renamed from: e4 */
    public boolean f1584e4;

    /* JADX INFO: renamed from: f1 */
    public SuperLikeComboAnimView f1585f1;

    /* JADX INFO: renamed from: f4 */
    public boolean f1588f4;

    /* JADX INFO: renamed from: g1 */
    public TextView f1589g1;

    /* JADX INFO: renamed from: g4 */
    public int f1592g4;

    /* JADX INFO: renamed from: h1 */
    public VFrame_Shadow f1593h1;

    /* JADX INFO: renamed from: h4 */
    public final RecyclerView.t f1596h4;

    /* JADX INFO: renamed from: i1 */
    public RelativeLayout f1597i1;

    /* JADX INFO: renamed from: i4 */
    public String f1600i4;

    /* JADX INFO: renamed from: j1 */
    public VImage f1601j1;

    /* JADX INFO: renamed from: j2 */
    public User f1602j2;

    /* JADX INFO: renamed from: j4 */
    public final List<hn2<?>> f1604j4;

    /* JADX INFO: renamed from: k0 */
    public RelativeLayout f1605k0;

    /* JADX INFO: renamed from: k1 */
    public VLinear f1606k1;

    /* JADX INFO: renamed from: k2 */
    public User f1607k2;

    /* JADX INFO: renamed from: k3 */
    public ValueAnimator f1608k3;

    /* JADX INFO: renamed from: k4 */
    public cme f1609k4;

    /* JADX INFO: renamed from: l1 */
    public VFrame_Shadow f1610l1;

    /* JADX INFO: renamed from: l4 */
    public dna0 f1613l4;

    /* JADX INFO: renamed from: m1 */
    public VFrame_Shadow f1614m1;

    /* JADX INFO: renamed from: m3 */
    public String f1616m3;

    /* JADX INFO: renamed from: m4 */
    public dle f1617m4;

    /* JADX INFO: renamed from: n1 */
    public VRelative f1618n1;

    /* JADX INFO: renamed from: n2 */
    public j760<List<Literatures>, List<LiteraturesComments>> f1619n2;

    /* JADX INFO: renamed from: n3 */
    public boolean f1620n3;

    /* JADX INFO: renamed from: n4 */
    public gne f1621n4;

    /* JADX INFO: renamed from: o1 */
    public View f1622o1;

    /* JADX INFO: renamed from: o2 */
    public Animator f1623o2;

    /* JADX INFO: renamed from: o4 */
    public tke f1625o4;

    /* JADX INFO: renamed from: p0 */
    public VText f1626p0;

    /* JADX INFO: renamed from: p1 */
    public View f1627p1;

    /* JADX INFO: renamed from: p4 */
    public tme f1630p4;

    /* JADX INFO: renamed from: q1 */
    public ProfileCustomBar f1631q1;

    /* JADX INFO: renamed from: q4 */
    public loe f1634q4;

    /* JADX INFO: renamed from: r1 */
    public View f1635r1;

    /* JADX INFO: renamed from: r4 */
    public cne f1638r4;

    /* JADX INFO: renamed from: s1 */
    public VFrame f1639s1;

    /* JADX INFO: renamed from: s4 */
    public goe f1642s4;

    /* JADX INFO: renamed from: t1 */
    public LinearLayout f1643t1;

    /* JADX INFO: renamed from: t2 */
    public Media f1644t2;

    /* JADX INFO: renamed from: t3 */
    public String f1645t3;

    /* JADX INFO: renamed from: t4 */
    public pqa0 f1646t4;

    /* JADX INFO: renamed from: u1 */
    public VText f1647u1;

    /* JADX INFO: renamed from: u4 */
    public jle f1650u4;

    /* JADX INFO: renamed from: v1 */
    public VLinear f1651v1;

    /* JADX INFO: renamed from: v2 */
    public boolean f1652v2;

    /* JADX INFO: renamed from: v4 */
    public cqa0 f1654v4;

    /* JADX INFO: renamed from: w1 */
    public VLinear f1655w1;

    /* JADX INFO: renamed from: w2 */
    public boolean f1656w2;

    /* JADX INFO: renamed from: w4 */
    public fna0 f1658w4;

    /* JADX INFO: renamed from: x1 */
    public VLinear f1659x1;

    /* JADX INFO: renamed from: x2 */
    public PicCertGuideView f1660x2;

    /* JADX INFO: renamed from: x4 */
    public l33 f1662x4;

    /* JADX INFO: renamed from: y1 */
    public VLinear f1663y1;

    /* JADX INFO: renamed from: y4 */
    public boolean f1666y4;

    /* JADX INFO: renamed from: z */
    public VFrame f1667z;

    /* JADX INFO: renamed from: z1 */
    public VImage f1668z1;

    /* JADX INFO: renamed from: z2 */
    public dj90 f1669z2;

    /* JADX INFO: renamed from: z4 */
    public int f1671z4;

    /* JADX INFO: renamed from: B1 */
    public boolean f1439B1 = true;

    /* JADX INFO: renamed from: C1 */
    public final boolean f1444C1 = false;

    /* JADX INFO: renamed from: D1 */
    public tpd0 f1449D1 = new tpd0("show_share_tip_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: E1 */
    public tpd0 f1455E1 = new tpd0("show_share_today_tip_count" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: F1 */
    public uqd0 f1461F1 = new uqd0("show_share_tip_data_" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: G1 */
    public tpd0 f1467G1 = new tpd0("show_share_tip_user_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: H1 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f1472H1 = new tpd0("show_pic_post_dialog_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: I1 */
    public zpd0 f1477I1 = new zpd0("last_auto_call_video_chat_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: J1 */
    public hpd0 f1482J1 = new hpd0("is_show_shimmer" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: K1 */
    public final boolean f1487K1 = m9270s();

    /* JADX INFO: renamed from: L1 */
    public final boolean f1492L1 = false;

    /* JADX INFO: renamed from: M1 */
    public boolean f1497M1 = false;

    /* JADX INFO: renamed from: O1 */
    public final a<User> f1507O1 = a.b();

    /* JADX INFO: renamed from: P1 */
    public User f1512P1 = null;

    /* JADX INFO: renamed from: Q1 */
    public int f1517Q1 = 0;

    /* JADX INFO: renamed from: R1 */
    public int f1522R1 = -1;

    /* JADX INFO: renamed from: S1 */
    public int f1527S1 = -1;

    /* JADX INFO: renamed from: T1 */
    public boolean f1532T1 = false;

    /* JADX INFO: renamed from: U1 */
    public boolean f1537U1 = false;

    /* JADX INFO: renamed from: V1 */
    public boolean f1542V1 = false;

    /* JADX INFO: renamed from: W1 */
    public boolean f1547W1 = false;

    /* JADX INFO: renamed from: c2 */
    public boolean f1574c2 = false;

    /* JADX INFO: renamed from: d2 */
    public boolean f1578d2 = false;

    /* JADX INFO: renamed from: e2 */
    public boolean f1582e2 = false;

    /* JADX INFO: renamed from: f2 */
    public boolean f1586f2 = false;

    /* JADX INFO: renamed from: g2 */
    public boolean f1590g2 = false;

    /* JADX INFO: renamed from: h2 */
    public int f1594h2 = 0;

    /* JADX INFO: renamed from: i2 */
    public boolean f1598i2 = false;

    /* JADX INFO: renamed from: l2 */
    public boolean f1611l2 = false;

    /* JADX INFO: renamed from: m2 */
    public final a<roj0> f1615m2 = a.b();

    /* JADX INFO: renamed from: p2 */
    public boolean f1628p2 = false;

    /* JADX INFO: renamed from: q2 */
    public long f1632q2 = 0;

    /* JADX INFO: renamed from: r2 */
    public HashMap<String, String> f1636r2 = new HashMap<>();

    /* JADX INFO: renamed from: s2 */
    public boolean f1640s2 = false;

    /* JADX INFO: renamed from: u2 */
    public boolean f1648u2 = false;

    /* JADX INFO: renamed from: y2 */
    public dj90 f1664y2 = new dj90(this, this);

    /* JADX INFO: renamed from: A2 */
    public fj90 f1435A2 = new fj90(this, this);

    /* JADX INFO: renamed from: B2 */
    public ProfileImagesItemHolder f1440B2 = new ProfileImagesItemHolder(this, this);

    /* JADX INFO: renamed from: C2 */
    public ne90 f1445C2 = new ne90(this, this);

    /* JADX INFO: renamed from: D2 */
    public jg90 f1450D2 = new wg90(this, this);

    /* JADX INFO: renamed from: E2 */
    public woa0 f1456E2 = new woa0(this, this);

    /* JADX INFO: renamed from: F2 */
    public aoa0 f1462F2 = new mqa0(this, this);

    /* JADX INFO: renamed from: G2 */
    public jpa0 f1468G2 = new jpa0(this, this);

    /* JADX INFO: renamed from: H2 */
    public mi90 f1473H2 = new mi90(this, this);

    /* JADX INFO: renamed from: I2 */
    public kr90 f1478I2 = new kr90(this, this);

    /* JADX INFO: renamed from: J2 */
    public ie90 f1483J2 = new ie90(this, this);

    /* JADX INFO: renamed from: K2 */
    public toa0 f1488K2 = new toa0(this, this);

    /* JADX INFO: renamed from: L2 */
    public yj90 f1493L2 = new yj90(this, this);

    /* JADX INFO: renamed from: M2 */
    public xne f1498M2 = new xne(this, this);

    /* JADX INFO: renamed from: N2 */
    public koa0 f1503N2 = new koa0(this, this);

    /* JADX INFO: renamed from: O2 */
    public zp90 f1508O2 = new bq90(this, this);

    /* JADX INFO: renamed from: P2 */
    public ir90 f1513P2 = new ir90(this, this);

    /* JADX INFO: renamed from: Q2 */
    public uf90 f1518Q2 = new uf90(this, this);

    /* JADX INFO: renamed from: R2 */
    public cua0 f1523R2 = new uta0(this, this);

    /* JADX INFO: renamed from: S2 */
    public wq90 f1528S2 = new fr90(this, this);

    /* JADX INFO: renamed from: T2 */
    public wqa0 f1533T2 = new yqa0(this, this);

    /* JADX INFO: renamed from: U2 */
    public pqa0 f1538U2 = new rqa0(this, this);

    /* JADX INFO: renamed from: V2 */
    public kea0 f1543V2 = new kea0(this, this);

    /* JADX INFO: renamed from: W2 */
    public ls90 f1548W2 = new ls90(this, this);

    /* JADX INFO: renamed from: X2 */
    public ProfileReportItemHolder f1553X2 = new ProfileReportItemHolder(this, this);

    /* JADX INFO: renamed from: Y2 */
    public gta0 f1558Y2 = new gta0(this, this);

    /* JADX INFO: renamed from: Z2 */
    public tqa0 f1563Z2 = new tqa0(this, this);

    /* JADX INFO: renamed from: a3 */
    public zl90 f1567a3 = new zl90(this, this);

    /* JADX INFO: renamed from: b3 */
    public jta0 f1571b3 = new jta0(this, this);

    /* JADX INFO: renamed from: c3 */
    public ota0 f1575c3 = new ota0(this, this);

    /* JADX INFO: renamed from: d3 */
    public iqa0 f1579d3 = new iqa0(this, this);

    /* JADX INFO: renamed from: e3 */
    public bk90 f1583e3 = new bk90(this, this);

    /* JADX INFO: renamed from: f3 */
    public iua0 f1587f3 = new iua0(this, this);

    /* JADX INFO: renamed from: g3 */
    public zva0 f1591g3 = new zva0(this, this);

    /* JADX INFO: renamed from: h3 */
    public boa0 f1595h3 = new boa0(this, this);

    /* JADX INFO: renamed from: i3 */
    public mt90 f1599i3 = new mt90();

    /* JADX INFO: renamed from: j3 */
    public boolean f1603j3 = false;

    /* JADX INFO: renamed from: l3 */
    public boolean f1612l3 = false;

    /* JADX INFO: renamed from: o3 */
    public boolean f1624o3 = false;

    /* JADX INFO: renamed from: p3 */
    public String f1629p3 = "";

    /* JADX INFO: renamed from: q3 */
    public boolean f1633q3 = false;

    /* JADX INFO: renamed from: r3 */
    public boolean f1637r3 = false;

    /* JADX INFO: renamed from: s3 */
    public boolean f1641s3 = true;

    /* JADX INFO: renamed from: u3 */
    public boolean f1649u3 = false;

    /* JADX INFO: renamed from: v3 */
    public boolean f1653v3 = false;

    /* JADX INFO: renamed from: w3 */
    public boolean f1657w3 = false;

    /* JADX INFO: renamed from: x3 */
    public int f1661x3 = 0;

    /* JADX INFO: renamed from: y3 */
    public String f1665y3 = "";

    /* JADX INFO: renamed from: z3 */
    public String f1670z3 = "";

    /* JADX INFO: renamed from: B3 */
    public RelationshipStatus f1441B3 = RelationshipStatus.get("unknown_");

    /* JADX INFO: renamed from: F3 */
    public boolean f1463F3 = false;

    /* JADX INFO: renamed from: J3 */
    public int f1484J3 = -1;

    /* JADX INFO: renamed from: K3 */
    public final ArrayList<View> f1489K3 = new ArrayList<>();

    /* JADX INFO: renamed from: L3 */
    public final ArrayList<TextView> f1494L3 = new ArrayList<>();

    /* JADX INFO: renamed from: M3 */
    public final ArrayList<View> f1499M3 = new ArrayList<>();

    /* JADX INFO: renamed from: N3 */
    public final ArrayList<View> f1504N3 = new ArrayList<>();

    /* JADX INFO: renamed from: O3 */
    public int f1509O3 = 4;

    /* JADX INFO: renamed from: Q3 */
    public int f1519Q3 = (xdl0.y0() - t100.d(60.0f)) / 2;

    /* JADX INFO: renamed from: R3 */
    public boolean f1524R3 = false;

    /* JADX INFO: renamed from: T3 */
    public NewNewProfileCard.d f1534T3 = new C0126i();

    /* JADX INFO: renamed from: U3 */
    public d30 f1539U3 = new C0127j();

    /* JADX INFO: renamed from: V3 */
    public List<e30<d5m>> f1544V3 = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$6 */
    public class ResultReceiverC01176 extends ResultReceiver {
        final /* synthetic */ boolean val$matched;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultReceiverC01176(Handler handler, boolean z) {
            super(handler);
            this.val$matched = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m2914b() {
            ProfileListFrag.this.act().setResult(SwipeDirection.LEFT.getValue());
            ProfileListFrag.this.act().finish();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (i != -1 || this.val$matched) {
                return;
            }
            ProfileListFrag.this.l4(new Runnable() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1685a.m2914b();
                }
            });
        }
    }

    public class ProfileEditInfoException extends RuntimeException {
        public ProfileEditInfoException() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$a */
    public class C0118a implements VFrame_Shadow.a {
        public C0118a() {
        }

        /* JADX INFO: renamed from: a */
        public void m2915a() {
            boolean zIsFemale = false;
            ((ViewGroup) ProfileListFrag.this.mo1514J1().act().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
            boolean zEquals = TextUtils.equals(((DbObject) ProfileListFrag.this.f1602j2).id, rxg0.j().m);
            xdl0.M0(ProfileListFrag.this.f1585f1, true);
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            SuperLikeComboAnimView superLikeComboAnimView = profileListFrag.f1585f1;
            boolean zA = NullChecker.a(profileListFrag.f1602j2);
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (zA) {
                zIsFemale = profileListFrag2.f1602j2.isFemale();
            } else if (NullChecker.a(profileListFrag2.f1607k2) && !ProfileListFrag.this.f1607k2.isFemale()) {
                zIsFemale = true;
            }
            superLikeComboAnimView.r(zEquals, true, zIsFemale);
        }

        /* JADX INFO: renamed from: b */
        public void m2916b() {
            ((ViewGroup) ProfileListFrag.this.mo1514J1().act().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.M0(ProfileListFrag.this.f1585f1, false);
            wge0.f().c(((DbObject) ProfileListFrag.this.f1602j2).id, ProfileListFrag.this.f1585f1.u(), false, "p_suggest_user_profile_info_view");
            ProfileListFrag.this.m2803id();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$b */
    public class C0119b extends RecyclerView.t {
        public C0119b() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFrag.this.m2543rd();
            ProfileListFrag.this.m2866sd(recyclerView.canScrollVertically(-1));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$c */
    public class C0120c extends RecyclerView.t {
        public C0120c() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFrag.this.f1592g4 += i2;
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            if (!profileListFrag.f1624o3) {
                profileListFrag.f1440B2.m3361S1(profileListFrag.f1592g4);
            }
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (profileListFrag2.f1624o3 || !NullChecker.a(profileListFrag2.f1440B2.f1881u)) {
                return;
            }
            if (i2 == 0 && ProfileListFrag.this.f1592g4 == 0) {
                ProfileListFrag.this.m2816l9();
            }
            if (i2 != 0) {
                ProfileListFrag profileListFrag3 = ProfileListFrag.this;
                profileListFrag3.f1545W.setTranslationY((-profileListFrag3.f1592g4) + ProfileListFrag.this.f1594h2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$d */
    public class C0121d implements e30<Throwable> {
        public C0121d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.a(CoreModule.K().getUserById(ProfileListFrag.this.f1616m3)) && !CoreModule.K().getUserById(ProfileListFrag.this.f1616m3).unilateralBlock()) {
                CoreModule.c.e0.Ba(ProfileListFrag.this.f1616m3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$e */
    public class C0122e implements e30<c> {
        public C0122e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(c cVar) {
            if (cVar != c.i) {
                if (cVar == c.k) {
                    ProfileListFrag.this.m2770d9();
                }
            } else {
                ProfileListFrag profileListFrag = ProfileListFrag.this;
                if (profileListFrag.f1602j2 == null) {
                    profileListFrag.f1540V.setVisibility(4);
                    ProfileListFrag.this.f1470H.setVisibility(4);
                    ProfileListFrag.this.f1465G.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$f */
    public class C0123f extends pqa0 {
        public C0123f(a1m a1mVar, mcr mcrVar) {
            super(a1mVar, mcrVar);
        }

        @Override // p002l.hn2
        /* JADX INFO: renamed from: k */
        public boolean mo2919k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$g */
    public class C0124g extends n {
        public C0124g(Context context) {
            super(context);
        }

        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$h */
    public class C0125h implements d30 {
        public C0125h() {
        }

        public void call() {
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            xdl0.M(profileListFrag.f1606k1, xdl0.O0(profileListFrag.f1610l1) || xdl0.O0(ProfileListFrag.this.f1614m1));
            if (xdl0.O0(ProfileListFrag.this.f1610l1) && xdl0.O0(ProfileListFrag.this.f1614m1)) {
                xdl0.D0(ProfileListFrag.this.f1519Q3, new View[]{ProfileListFrag.this.f1610l1});
                xdl0.D0(ProfileListFrag.this.f1519Q3, new View[]{ProfileListFrag.this.f1614m1});
                ProfileListFrag profileListFrag2 = ProfileListFrag.this;
                profileListFrag2.m2576A8(profileListFrag2.f1610l1);
                ProfileListFrag profileListFrag3 = ProfileListFrag.this;
                profileListFrag3.m2576A8(profileListFrag3.f1614m1);
            } else if (xdl0.O0(ProfileListFrag.this.f1610l1)) {
                xdl0.D0(ProfileListFrag.this.f1519Q3, new View[]{ProfileListFrag.this.f1610l1});
                ProfileListFrag profileListFrag4 = ProfileListFrag.this;
                profileListFrag4.m2576A8(profileListFrag4.f1610l1);
            }
            ProfileListFrag.this.m2640K8();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$i */
    public class C0126i implements NewNewProfileCard.d {
        public C0126i() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$j */
    public class C0127j implements d30 {
        public C0127j() {
        }

        public void call() {
            Intent intentM1177q2 = ProfileAct.m1177q2(ProfileListFrag.this.getContext(), ((DbObject) ProfileListFrag.this.m9268i2()).id, "preview_card", false, false, ProfileListFrag.this.f1502N1 != null ? ProfileListFrag.this.f1502N1.getShowPictureIndex() : -1);
            intentM1177q2.putExtra("preview_user_info", (Serializable) ProfileListFrag.this.m9268i2());
            ProfileListFrag.this.startActivity(intentM1177q2);
            ProfileListFrag.this.act().overridePendingTransition(rzb0.y, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$k */
    public class ViewTreeObserverOnGlobalLayoutListenerC0128k implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0128k() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m2921b(View view) {
            if (qib0.b0.c != null) {
                zvf0.u("e_live_video_quickchat_room_enter", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("anchorId", ProfileListFrag.this.f1616m3), vwb.Y("index", "NA")});
                ProfileListFrag.this.f1603j3 = true;
                qib0.b0.c.uq(ProfileListFrag.this.act(), ProfileListFrag.this.f1616m3, "profile");
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if ((!xdl0.O0(ProfileListFrag.this.f1606k1) && !xdl0.O0(ProfileListFrag.this.f1577d1) && !xdl0.O0(ProfileListFrag.this.f1536U0) && !xdl0.O0(ProfileListFrag.this.f1516Q0)) || xdl0.O0(ProfileListFrag.this.f1589g1)) {
                xdl0.M(ProfileListFrag.this.f1536U0, true);
                return;
            }
            boolean zO0 = xdl0.O0(ProfileListFrag.this.f1536U0);
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            if (!zO0) {
                xdl0.M(profileListFrag.f1606k1, false);
                xdl0.M(ProfileListFrag.this.f1577d1, false);
                xdl0.M(ProfileListFrag.this.f1516Q0, false);
                xdl0.M(ProfileListFrag.this.f1606k1, false);
                xdl0.M(ProfileListFrag.this.f1536U0, true);
                return;
            }
            View view = profileListFrag.f1549W3;
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (view == null) {
                profileListFrag2.f1549W3 = o7r.a(profileListFrag2.getContext()).inflate(f6c0.Za, (ViewGroup) null);
                ProfileListFrag.this.f1549W3.setOnClickListener(new View.OnClickListener() { // from class: l.l5a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f14676a.m2921b(view2);
                    }
                });
            } else if (profileListFrag2.f1549W3.getParent() != null && ProfileListFrag.this.f1549W3.getParent() == ProfileListFrag.this.f1554X3) {
                return;
            } else {
                xdl0.p0(ProfileListFrag.this.f1549W3);
            }
            ProfileListFrag profileListFrag3 = ProfileListFrag.this;
            if (profileListFrag3.f1434A1 == null) {
                profileListFrag3.m2868t9();
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ProfileListFrag.this.f1434A1.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.bottomMargin = t100.d;
            int i = t100.i;
            layoutParams.leftMargin = -i;
            layoutParams.rightMargin = -i;
            xdl0.M(ProfileListFrag.this.f1434A1, false);
            xdl0.M(ProfileListFrag.this.f1555Y, false);
            xdl0.M(ProfileListFrag.this.f1593h1, false);
            ((ViewGroup) ProfileListFrag.this.f1434A1.getParent()).addView(ProfileListFrag.this.f1549W3, layoutParams);
            zvf0.A("e_live_video_quickchat_room_enter", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("anchorId", ProfileListFrag.this.f1616m3), vwb.Y("index", "NA")});
            ProfileListFrag profileListFrag4 = ProfileListFrag.this;
            profileListFrag4.f1554X3 = (View) profileListFrag4.f1549W3.getParent();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$l */
    public class C0129l extends RecyclerView.n {
        public C0129l() {
        }

        /* JADX INFO: renamed from: f */
        public final int m2922f(View view) {
            view.measure(View.MeasureSpec.makeMeasureSpec(ProfileListFrag.this.f1540V.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            return view.getMeasuredHeight();
        }

        public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.z zVar) {
            super.onDrawOver(canvas, recyclerView, zVar);
            int iMax = 0;
            View childAt = recyclerView.getChildAt(0);
            if (childAt == null) {
                return;
            }
            int layoutPosition = recyclerView.getChildViewHolder(childAt).getLayoutPosition();
            for (int i = layoutPosition; i >= 0; i--) {
                if (ProfileListFrag.this.f1599i3.m18159L(i)) {
                    int i2 = layoutPosition + 1;
                    if (i2 < ProfileListFrag.this.f1599i3.getItemCount() && ProfileListFrag.this.f1599i3.m18159L(i2)) {
                        iMax = Math.max(ProfileListFrag.this.f1570b2.getDecoratedTop(recyclerView.getChildAt(1)), 0);
                    }
                    mt90 mt90Var = ProfileListFrag.this.f1599i3;
                    RecyclerView.d0 d0VarCreateViewHolder = mt90Var.createViewHolder(recyclerView, mt90Var.getItemViewType(i));
                    ProfileListFrag.this.f1599i3.bindViewHolder(d0VarCreateViewHolder, i);
                    int iM2922f = m2922f(d0VarCreateViewHolder.itemView);
                    canvas.save();
                    if (iMax < d0VarCreateViewHolder.itemView.getMeasuredHeight() && iMax > 0) {
                        canvas.translate(0.0f, iMax - iM2922f);
                    }
                    d0VarCreateViewHolder.itemView.draw(canvas);
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public ProfileListFrag() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.uz90
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((c) obj).c);
            }
        }));
        this.f1559Y3 = new ViewTreeObserverOnGlobalLayoutListenerC0128k();
        this.f1568a4 = false;
        this.f1580d4 = a.b();
        this.f1584e4 = false;
        this.f1588f4 = true;
        this.f1592g4 = 0;
        this.f1596h4 = new C0120c();
        this.f1600i4 = "";
        this.f1604j4 = new ArrayList();
        this.f1609k4 = new cme(this, this);
        this.f1613l4 = new dna0(this, this);
        this.f1617m4 = new dle(this, this);
        this.f1621n4 = new gne(this, this);
        this.f1625o4 = new tke(this, this);
        this.f1630p4 = new tme(this, this);
        this.f1634q4 = new loe(this, this);
        this.f1638r4 = new cne(this, this);
        this.f1642s4 = new goe(this, this);
        this.f1646t4 = new C0123f(this, this);
        this.f1650u4 = new jle(this, this);
        this.f1654v4 = new cqa0(this, this);
        this.f1658w4 = new fna0(this, this);
        this.f1662x4 = new l33(this, this);
        this.f1666y4 = false;
        this.f1671z4 = -1;
        this.f1437A4 = false;
        this.f1442B4 = false;
        this.f1447C4 = new hra0(this);
        this.f1452D4 = new C0125h();
        this.f1458E4 = new HashMap<>();
        creates(new e30() { // from class: l.f0a0
            public final void call(Object obj) {
                this.f10077a.m2831nc((Bundle) obj);
            }
        });
        this.f1464F4 = new HashSet();
    }

    /* JADX INFO: renamed from: A9 */
    private void m2359A9() {
        if (this.f1620n3) {
            duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.a2a0
                public final void call(Object obj) {
                    this.f7350a.m2676Pb((User) obj);
                }
            }));
        } else {
            if (f9j.a(this.f1645t3)) {
                duringCreated(rx.c.just(roj0.a)).subscribe(mkd0.G(new e30() { // from class: l.l2a0
                    public final void call(Object obj) {
                        this.f14657a.m2684Qb((roj0) obj);
                    }
                }));
            }
            duringCreated(new v9j() { // from class: l.w2a0
                public final Object call() {
                    return this.f21427a.m2691Rb();
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.h3a0
                public final void call(Object obj) {
                    this.f11863a.m2698Sb((j760) obj);
                }
            }));
            if (CoreModule.N().Co()) {
                duringCreated(CoreModule.c.r0.v5()).filter(new w9j() { // from class: l.s3a0
                    public final Object call(Object obj) {
                        return this.f18772a.m2704Tb((j760) obj);
                    }
                }).map(new w9j() { // from class: l.d4a0
                    public final Object call(Object obj) {
                        return ProfileListFrag.m2569y5((j760) obj);
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.o4a0
                    public final void call(Object obj) {
                        this.f16360a.m2721Vb((RelationshipStatus) obj);
                    }
                }));
            }
            if (!m2829na()) {
                m2738Y8();
            }
        }
        duringCreated(CoreModule.Q().ao(userId())).subscribe(mkd0.H(new e30() { // from class: l.z4a0
            public final void call(Object obj) {
                this.f23240a.m2728Wb((Boolean) obj);
            }
        }, new e30() { // from class: l.k5a0
            public final void call(Object obj) {
                hfw.a("intl_profile_guild", ((Throwable) obj).toString());
            }
        }));
    }

    /* JADX INFO: renamed from: B5 */
    public static /* synthetic */ void m2360B5() {
        try {
            f1432I4 = (CategorySuggestions) CategorySuggestions.JSON_ADAPTER.parse(CoreModule.b.getResources().openRawResource(t7c0.a));
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: Bd */
    private void m2363Bd(List<Media> list) {
        m2594Cd(list, false);
    }

    /* JADX INFO: renamed from: C6 */
    public static /* synthetic */ boolean m2365C6(View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(0.875f).scaleY(0.875f).setDuration(100L).start();
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        return false;
    }

    @MainThread
    /* JADX INFO: renamed from: C8 */
    private void m2367C8() {
        if (this.f1584e4) {
            this.f1611l2 = true;
            return;
        }
        this.f1666y4 = true;
        xdl0.M(this.f1470H, this.f1440B2.mo3280l());
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (!this.f1620n3) {
            m2872td();
        }
        m2572yd();
        if (mo1570m0()) {
            if (NullChecker.a(wn90.F().a) && this.f1463F3) {
                User user = wn90.F().a;
                if (!TEnum.equals(this.f1602j2.profile.zodiac, user.profile.zodiac)) {
                    user.profile.zodiac = this.f1602j2.profile.zodiac;
                }
                wn90.F().a = this.f1602j2.clone();
                wn90.F().a.description = user.description;
                wn90.F().a.pictures = user.pictures;
                wn90.F().a.profile = user.profile;
                wn90.F().a.voice = user.voice;
                wn90.F().a.profile.extensions.physical.bloodType = this.f1602j2.profile.extensions.physical.bloodType;
                wn90.F().a.profile.extensions.interest.emoji = this.f1602j2.profile.extensions.interest.emoji;
            } else {
                this.f1463F3 = true;
                wn90.F().a = this.f1602j2.clone();
            }
            m2599Dd(wn90.F().a);
            if (upa.u2()) {
                m2607F8();
            }
            m2613G8();
        } else {
            if (("home_card".equals(this.f1645t3) || "home_moment_theme_card".equals(this.f1645t3) || "liked_users".equals(this.f1645t3) || m2696S9() || m2777ea() || m2746Z9() || m2739Y9() || m2771da() || m2764ca() || m2726W9()) && mo2679Q()) {
                m2678Pd(mo1517K2(), false);
            }
            if ("home_card".equals(this.f1645t3) && fap.y()) {
                m2650Ld(this.f1602j2);
            }
        }
        this.f1465G.setVisibility(4);
        this.f1540V.setVisibility(0);
        if (!mo1570m0()) {
            this.f1470H.setVisibility(0);
        }
        m2912zd();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f1671z4 == -1) {
            this.f1671z4 = CoreModule.c.e0.p9().isVIP() ? 1 : 0;
        }
        if (!this.f1624o3 && this.f1671z4 == 0 && CoreModule.c.e0.p9().isVIP()) {
            C0124g c0124g = new C0124g(act());
            c0124g.setTargetPosition(0);
            this.f1440B2.m3338G1();
            this.f1592g4 = 0;
            this.f1545W.setTranslationY(0.0f);
            this.f1540V.getLayoutManager().startSmoothScroll(c0124g);
            m2816l9();
            this.f1671z4 = 1;
        }
    }

    /* JADX INFO: renamed from: D8 */
    public static ProfileListFrag m2371D8(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        mm90 mm90Var = new mm90();
        mm90Var.f15456a = str;
        mm90Var.f15457b = z;
        mm90Var.f15458c = z2;
        mm90Var.f15460e = str2;
        mm90Var.f15461f = z3;
        mm90Var.f15462g = RelationshipStatus.get("unknown_");
        mm90Var.f15463h = 273;
        mm90Var.f15464i = false;
        mm90Var.f15465j = true;
        mm90Var.f15466k = false;
        mm90Var.f15467l = z4;
        mm90Var.f15468m = -1;
        return m2375E8(mm90Var);
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m2372E5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: E8 */
    public static ProfileListFrag m2375E8(mm90 mm90Var) {
        ProfileListFrag profileListFrag = new ProfileListFrag();
        Bundle bundle = new Bundle();
        bundle.putString(SysnotifListener.KEY_USER_ID, mm90Var.f15456a);
        bundle.putBoolean("is_edit", mm90Var.f15458c);
        bundle.putString("input_type", mm90Var.f15459d);
        bundle.putBoolean("show_buttons", mm90Var.f15457b);
        bundle.putBoolean("canShowFollowButton", mm90Var.f15467l);
        bundle.putBoolean("no_showbuttons_infofromlocal", mm90Var.f15465j);
        bundle.putString("from", mm90Var.f15460e);
        bundle.putBoolean("open_media_picker", mm90Var.f15461f);
        bundle.putString("relationship_status", mm90Var.f15462g.toString());
        bundle.putInt("button_flag", mm90Var.f15463h);
        bundle.putBoolean("with_superlike", mm90Var.f15464i);
        bundle.putBoolean("from_gp_live", mm90Var.f15466k);
        bundle.putInt("pic_index", mm90Var.f15468m);
        bundle.putInt("pushReason", mm90Var.f15470o);
        bundle.putString("pushTag", mm90Var.f15471p);
        bundle.putSerializable("city_centre_data", mm90Var.f15472q);
        profileListFrag.setArguments(bundle);
        return profileListFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ea */
    public /* synthetic */ void m2376Ea() {
        b4().F(this.f1616m3).z0();
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m2377F5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Fa */
    public /* synthetic */ void m2380Fa() {
        if (NullChecker.a(mo1517K2())) {
            DebugUtil.zk(mo1517K2(), act());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ga */
    public /* synthetic */ void m2384Ga() {
        User user = this.f1602j2;
        if (user == null || user == this.f1607k2) {
            return;
        }
        for (int i = 0; i < 10; i++) {
            Contact contactNew_ = Contact.new_();
            contactNew_.name = "张三 " + i;
            this.f1602j2.profile.contactLookups.lookups.add(contactNew_);
        }
        m2385Gd(this.f1602j2);
    }

    /* JADX INFO: renamed from: Gd */
    private void m2385Gd(User user) {
        wn90.F().a = user;
        m2367C8();
    }

    /* JADX INFO: renamed from: J5 */
    public static /* synthetic */ void m2392J5(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: L9 */
    private boolean m2401L9() {
        if ("from_portrait_like_list".equals(this.f1645t3)) {
            return true;
        }
        if (upa.V1()) {
            return "chat_group".equals(this.f1645t3) || "chat_group_anonymity".equals(this.f1645t3) || "group_notification".equals(this.f1645t3) || "group_notification_anonymity".equals(this.f1645t3);
        }
        return false;
    }

    /* JADX INFO: renamed from: N9 */
    public static boolean m2409N9(User user) {
        return NullChecker.a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched");
    }

    /* JADX INFO: renamed from: Nd */
    private void m2410Nd(User user) {
        this.f1607k2 = user;
    }

    /* JADX INFO: renamed from: P5 */
    public static /* synthetic */ Boolean m2416P5(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: R8 */
    private String m2427R8(User user) {
        CharSequence charSequenceP = (CoreModule.c.E0.B3(user) || User.isTeamAccount(((DbObject) user).id) || ((DbObject) user).id.equals(CoreModule.H().userId())) ? "" : i0g0.P(user.location, false, (CharacterStyle) null, i0g0.r(user.location, true, false));
        if (!TextUtils.isEmpty(charSequenceP)) {
            return charSequenceP.toString();
        }
        if (user.location.isHideInfo() && user.location.isHideDistance()) {
            return "";
        }
        int i = user.location.distance;
        if (i < 1000) {
            return "1000";
        }
        return i < 10000 ? String.valueOf((i / 1000) * 1000) : String.valueOf((i / 10000) * 10000);
    }

    /* JADX INFO: renamed from: Rd */
    private void m2428Rd(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.K().getUserById("fake_risk_audit_default_" + this.f1616m3));
        }
        this.f1602j2 = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: V6 */
    public static /* synthetic */ void m2443V6(Throwable th) {
    }

    /* JADX INFO: renamed from: W8 */
    private List<hn2<?>> m2449W8(List<hn2<?>> list) {
        ArrayList arrayList = new ArrayList();
        if (this.f1624o3) {
            for (hn2<?> hn2Var : list) {
                if (hn2Var.mo3280l()) {
                    arrayList.add(hn2Var);
                    if (hn2Var.mo2919k()) {
                        arrayList.add(this.f1435A2);
                    }
                }
            }
        } else {
            hn2<?> hn2Var2 = null;
            int i = 0;
            for (hn2<?> hn2Var3 : list) {
                if (hn2Var3.mo3280l()) {
                    if (hn2Var3.mo2919k() && (i = i + 1) > 1) {
                        if (!NullChecker.a(hn2Var2)) {
                            arrayList.add(this.f1664y2);
                        } else if (hn2Var2 instanceof yqa0) {
                            dj90 dj90Var = new dj90(this, this);
                            this.f1669z2 = dj90Var;
                            dj90Var.m14464v(t100.d(4.0f));
                            arrayList.add(this.f1669z2);
                        } else if (hn2Var2 instanceof fr90) {
                            dj90 dj90Var2 = new dj90(this, this);
                            this.f1669z2 = dj90Var2;
                            dj90Var2.m14464v(t100.d(9.0f));
                            arrayList.add(this.f1669z2);
                        } else if (hn2Var2 instanceof bq90) {
                            dj90 dj90Var3 = new dj90(this, this);
                            this.f1669z2 = dj90Var3;
                            dj90Var3.m14464v(t100.d(16.0f));
                            arrayList.add(this.f1669z2);
                        } else if (hn2Var2 instanceof uta0) {
                            dj90 dj90Var4 = new dj90(this, this);
                            this.f1669z2 = dj90Var4;
                            dj90Var4.m14464v(t100.d(9.0f));
                            arrayList.add(this.f1669z2);
                        } else if (hn2Var2 instanceof kr90) {
                            dj90 dj90Var5 = new dj90(this, this);
                            this.f1669z2 = dj90Var5;
                            dj90Var5.m14464v(t100.d(24.0f));
                            arrayList.add(this.f1669z2);
                        } else if (hn2Var2 instanceof ir90) {
                            dj90 dj90Var6 = new dj90(this, this);
                            this.f1669z2 = dj90Var6;
                            dj90Var6.m14464v(t100.d(16.0f));
                            arrayList.add(this.f1669z2);
                        } else {
                            arrayList.add(this.f1664y2);
                        }
                    }
                    arrayList.add(hn2Var3);
                    hn2Var2 = hn2Var3;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z6 */
    public static /* synthetic */ void m2460Z6(Throwable th) {
    }

    /* JADX INFO: renamed from: Z8 */
    private String m2462Z8(String str) {
        String str2 = this.f1600i4;
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : str2;
    }

    /* JADX INFO: renamed from: a6 */
    public static /* synthetic */ void m2464a6() {
    }

    /* JADX INFO: renamed from: a8 */
    public static /* synthetic */ ProfileEditInfo m2466a8(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: ad */
    private void m2467ad() {
        xdl0.b0(this.f1459F, new v9j() { // from class: l.qy90
            public final Object call() {
                return ProfileListFrag.m2372E5();
            }
        });
    }

    /* JADX INFO: renamed from: bd */
    public static String m2472bd(String str) {
        return m2478cd(str, true);
    }

    /* JADX INFO: renamed from: be */
    private void m2473be() {
        if (CoreModule.c.e0.p9().isJailedOrRestrict()) {
            CoreModule.K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.N().isPostingMoment()) {
                return;
            }
            CoreModule.N().Nr(act(), vwb.f0(new Media[0]), true, LiveMessage.LiveMessageType.OTHER, wsh.d(), wsh.e(), (String) null);
        }
    }

    /* JADX INFO: renamed from: cd */
    public static String m2478cd(String str, boolean z) {
        if (str.matches("[ ]+")) {
            if (z) {
                lra0.f("space");
            }
            return "space";
        }
        if (str.matches("\\d+")) {
            if (z) {
                lra0.f("number");
            }
            return "number";
        }
        if (str.matches("[\\p{P}+`]+")) {
            if (z) {
                lra0.f("symbol");
            }
            return "symbol";
        }
        if (!str.matches("[\\p{P}\\d+`]+")) {
            return "";
        }
        if (z) {
            lra0.f("number_symbol");
        }
        return "number_symbol";
    }

    /* JADX INFO: renamed from: d8 */
    public static /* synthetic */ void m2482d8() {
        hpd0 hpd0Var = CoreModule.c.e0.r2;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.e0.q2.put(bool);
    }

    /* JADX INFO: renamed from: de */
    private void m2483de(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == 6) {
            mediaReorderCards.m1257h(5).m1108S1(null);
            return;
        }
        mediaReorderCards.m1257h(i).m1108S1(str);
        if (i < 5) {
            mediaReorderCards.m1257h(i + 1).m1108S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m1257h(i - 1).m1108S1(null);
        }
    }

    /* JADX INFO: renamed from: f8 */
    public static /* synthetic */ void m2491f8(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ void m2504j5(Throwable th) {
    }

    /* JADX INFO: renamed from: la */
    public static boolean m2516la(User user) {
        if (NullChecker.a(user.localRelationship)) {
            return TEnum.equals(user.localRelationship.state, "liked") || TEnum.equals(user.localRelationship.state, "lettered") || TEnum.equals(user.localRelationship.state, "matched");
        }
        return false;
    }

    /* JADX INFO: renamed from: m7 */
    public static /* synthetic */ void m2519m7() {
    }

    /* JADX INFO: renamed from: n7 */
    public static /* synthetic */ void m2523n7(Throwable th) {
        CoreModule.c.f0.P1 = null;
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            osi0.f(R.string.J7);
        }
    }

    /* JADX INFO: renamed from: n9 */
    private void m2525n9() {
        if (mo1570m0()) {
            m2810k9();
        } else if (!this.f1620n3 && NullChecker.a(mo1517K2()) && mo1517K2().unilateralBlock()) {
            m2608F9();
        } else {
            m2862s9();
        }
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ void m2526o5(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: p9 */
    private void m2534p9() {
        if (!this.f1620n3 || this.f1624o3) {
            return;
        }
        duringCreated(new v9j() { // from class: l.c2a0
            public final Object call() {
                return this.f8466a.m2858rb();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.d2a0
            public final void call(Object obj) {
                this.f9045a.m2864sb((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: rd */
    public void m2543rd() {
        jg90 jg90Var = this.f1450D2;
        if (jg90Var.f13755v == null || !jg90Var.m14463u().isAttachedToWindow()) {
            if (this.f1570b2.findFirstCompletelyVisibleItemPosition() > 2) {
                this.f1631q1.m3507g(1.0f);
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        this.f1631q1.getLocationInWindow(iArr);
        float height = iArr[1] + this.f1631q1.getHeight();
        int[] iArr2 = new int[2];
        this.f1450D2.f13755v.getLocationInWindow(iArr2);
        float height2 = (height - iArr2[1]) / this.f1450D2.f13755v.getHeight();
        this.f1631q1.m3507g(height2);
        double d = height2;
        View view = this.f1635r1;
        if (d < 0.1d) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m2544s5(Throwable th) {
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ Boolean m2556v5(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m2560w5(Throwable th) {
    }

    /* JADX INFO: renamed from: w9 */
    private void m2564w9() {
        this.f1570b2 = new SmoothScrollLinearLayoutManager(getContext());
        this.f1540V.setItemAnimator((RecyclerView.l) null);
        this.f1540V.setLayoutManager(this.f1570b2);
        this.f1540V.setAdapter(this.f1599i3);
        this.f1540V.addOnScrollListener(this.f1596h4);
        if (m2838oa() && !this.f1624o3) {
            this.f1540V.post(new Runnable() { // from class: l.w4a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21437a.m2889wb();
                }
            });
        }
        if (this.f1624o3) {
            this.f1540V.addItemDecoration(new C0129l());
        }
    }

    /* JADX INFO: renamed from: x9 */
    private void m2568x9() {
        gd70.m13725b().m13728e(Boolean.FALSE);
        boolean z = this.f1624o3;
        VNavigationBar vNavigationBar = this.f1433A;
        if (z) {
            xdl0.M(vNavigationBar, true);
            View viewInflate = act().inflater().inflate(f6c0.B9, (ViewGroup) null);
            VButton vButtonFindViewById = viewInflate.findViewById(u4c0.m4);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.c5a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8488a.m2592Cb(view);
                }
            };
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.d5a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9062a.m2597Db(view);
                }
            };
            xdl0.E0(vButtonFindViewById, onClickListener);
            this.f1433A.setLeftIconOnClick(onClickListener2);
            this.f1433A.z(new View[]{viewInflate});
            this.f1433A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.e5a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9579a.m2603Eb(view);
                }
            });
            return;
        }
        xdl0.M(vNavigationBar, false);
        if (m2829na() && m2774dd()) {
            m2868t9();
            this.f1656w2 = true;
            xdl0.M(this.f1516Q0, false);
        } else {
            m2903y9();
        }
        if (TextUtils.equals(this.f1645t3, "impress_signal") || m2726W9() || TextUtils.equals(this.f1645t3, "from_pin_like") || m2733X9()) {
            xdl0.M(this.f1573c1, false);
            xdl0.M(this.f1577d1, false);
            xdl0.M(this.f1593h1, false);
            xdl0.M(this.f1516Q0, false);
            xdl0.M(this.f1536U0, false);
            xdl0.M(this.f1550X, false);
        }
        m2908z9();
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ RelationshipStatus m2569y5(j760 j760Var) {
        return (RelationshipStatus) j760Var.b;
    }

    /* JADX INFO: renamed from: yd */
    private void m2572yd() {
        new ArrayList();
        this.f1599i3.m18160M(m2449W8(this.f1604j4));
        m2875u9();
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m2574z6(Throwable th) {
    }

    /* JADX INFO: renamed from: A8 */
    public void m2576A8(View view) {
        m2583B8(view, view);
    }

    /* JADX INFO: renamed from: Aa */
    public final /* synthetic */ void m2577Aa() {
        ViewGroup.LayoutParams layoutParams = this.f1662x4.m14463u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = t100.d(164.0f);
            this.f1662x4.m14463u().setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Ab */
    public final /* synthetic */ void m2578Ab(Detect detect) {
        if (!NullChecker.a(detect) || vwb.J(detect.text)) {
            mo1575o();
            return;
        }
        j4p j4pVar = new j4p(act());
        j4pVar.m15660K(new e30() { // from class: l.p1a0
            public final void call(Object obj) {
                this.f16954a.m2910zb((roj0) obj);
            }
        });
        j4pVar.show();
    }

    /* JADX INFO: renamed from: Ac */
    public final /* synthetic */ void m2579Ac() {
        this.f1452D4.call();
    }

    /* JADX INFO: renamed from: Ad */
    public void m2580Ad(boolean z) {
        if (m2627I9() || m2726W9()) {
            return;
        }
        if (r65.m() || sb90.e(mo1517K2())) {
            if (TextUtils.equals("from_city_center_boost_cover", this.f1645t3)) {
                xdl0.M(this.f1536U0, false);
                xdl0.M(this.f1573c1, false);
                return;
            }
            if (TextUtils.equals("from_city_center_conv_banner", this.f1645t3) && !TextUtils.equals(this.f1616m3, CoreModule.H().userId())) {
                xdl0.M(this.f1536U0, false);
                xdl0.M(this.f1573c1, false);
                xdl0.M(this.f1561Z0, true);
                boolean zEquals = TextUtils.equals((CharSequence) CoreModule.c.r0.s0.e(), this.f1616m3);
                TextView textView = this.f1569b1;
                if (zEquals) {
                    textView.setText("招呼已发送");
                    this.f1569b1.setEnabled(false);
                    return;
                } else {
                    textView.setText("发送招呼");
                    this.f1569b1.setEnabled(true);
                    xdl0.E0(this.f1569b1, new View.OnClickListener() { // from class: l.ry90
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f18721a.m2911zc(view);
                        }
                    });
                    return;
                }
            }
        }
        xdl0.M(this.f1593h1, false);
        xdl0.M(this.f1577d1, false);
        if (TextUtils.equals(this.f1645t3, "from_portrait_like_list")) {
            xdl0.M(this.f1610l1, false);
            xdl0.M(this.f1614m1, false);
        }
        Conversation conversationXe = CoreModule.c.f0.Xe(this.f1616m3);
        if (NullChecker.a(conversationXe) && !TEnum.equals(conversationXe.status, "dismissed")) {
            if (TextUtils.equals(this.f1645t3, "from_portrait_like_list")) {
                xdl0.M(this.f1577d1, true);
                m2576A8(this.f1577d1);
            }
            xdl0.C0(this.f1550X, xdl0.O0(this.f1573c1) ? t100.d(164.0f) : t100.d(126.0f));
            xdl0.M(this.f1550X, true);
        } else if (NullChecker.a(this.f1576c4) && m2805ja()) {
            if (TextUtils.equals(this.f1645t3, "from_portrait_like_list")) {
                xdl0.U(this.f1606k1, t100.d(10.0f));
                xdl0.M(this.f1610l1, true);
                xdl0.M(this.f1614m1, true);
            } else {
                boolean zM2823ma = m2823ma();
                VLinear vLinear = this.f1651v1;
                if (zM2823ma) {
                    xdl0.M(vLinear, true);
                    m2658Md(true);
                } else {
                    if (NullChecker.a(vLinear)) {
                        xdl0.M(this.f1651v1, false);
                    }
                    xdl0.M(this.f1593h1, true);
                    m2576A8(this.f1593h1);
                    m2658Md(false);
                }
            }
            xdl0.C0(this.f1550X, xdl0.O0(this.f1573c1) ? t100.d(164.0f) : t100.d(126.0f));
            xdl0.M(this.f1550X, true);
        }
        if (TextUtils.equals(this.f1645t3, "from_portrait_like_list")) {
            if (z) {
                e51.H(act(), new Runnable() { // from class: l.sy90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19336a.m2579Ac();
                    }
                }, 850L);
            } else {
                this.f1452D4.call();
            }
        }
        if (!xdl0.O0(this.f1573c1) && !xdl0.O0(this.f1593h1) && !xdl0.O0(this.f1577d1) && !xdl0.O0(this.f1606k1)) {
            xdl0.M(this.f1550X, false);
        }
        this.f1662x4.mo14451a(new d30() { // from class: l.ty90
            public final void call() {
                this.f20423a.m2587Bc();
            }
        });
        m2837o9();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: B1 */
    public List<View> mo2581B1() {
        return vwb.f0(new View[]{this.f1540V});
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: B2 */
    public View mo2582B2() {
        return this.f1541V0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: B8 */
    public void m2583B8(View view, final View view2) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.j0a0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return ProfileListFrag.m2365C6(view2, view3, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: B9 */
    public final void m2584B9() {
        m2907z8();
        m2678Pd(null, false);
        Conversation conversationXe = CoreModule.c.f0.Xe(this.f1616m3);
        if (NullChecker.a(this.f1602j2)) {
            if (f9k0.b(this.f1602j2)) {
                e51.H(act(), new Runnable() { // from class: l.s4a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18784a.m2735Xb();
                    }
                }, 1000L);
            }
            if (User.isMatched(this.f1602j2) || (NullChecker.a(conversationXe) && TEnum.equals(conversationXe.status, "default"))) {
                if (NullChecker.a(this.f1555Y)) {
                    xdl0.M(this.f1555Y, false);
                    xdl0.M(this.f1536U0, false);
                }
                if (NullChecker.a(this.f1573c1)) {
                    xdl0.M(this.f1573c1, false);
                }
                if (NullChecker.a(this.f1550X)) {
                    xdl0.M(this.f1550X, false);
                }
            }
        }
        m2896xd();
    }

    /* JADX INFO: renamed from: Ba */
    public final /* synthetic */ void m2585Ba(View view) {
        this.f1454E0.callOnClick();
    }

    /* JADX INFO: renamed from: Bb */
    public final /* synthetic */ void m2586Bb(Throwable th) {
        mo1575o();
    }

    /* JADX INFO: renamed from: Bc */
    public final /* synthetic */ void m2587Bc() {
        ViewGroup.LayoutParams layoutParams = this.f1662x4.m14463u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = t100.d(xdl0.O0(this.f1550X) ? 164.0f : 0.0f);
            this.f1662x4.m14463u().setLayoutParams(layoutParams);
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo1498C2() {
        return f1432I4;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: C3 */
    public View mo2588C3() {
        return this.f1440B2.m3348M0();
    }

    /* JADX INFO: renamed from: C9 */
    public final void m2590C9() {
        if (!u59.w() || mo1523P1()) {
            return;
        }
        if (NullChecker.a(CoreModule.c.t2.R) && ((Boolean) CoreModule.c.t2.R.get()).booleanValue()) {
            duringCreated(rx.c.just(roj0.a)).subscribe(mkd0.G(new e30() { // from class: l.vz90
                public final void call(Object obj) {
                    this.f21392a.m2741Yb((roj0) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.c.t2.k3(userId(), "profile", "user,description")).subscribe(mkd0.H(new e30() { // from class: l.wz90
                public final void call(Object obj) {
                    this.f22049a.m2748Zb((CoreData) obj);
                }
            }, new e30() { // from class: l.xz90
                public final void call(Object obj) {
                    ProfileListFrag.m2574z6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Cb */
    public final /* synthetic */ void m2592Cb(View view) {
        lra0.h("button");
        final String strC = ft4.b().c(this.f1602j2, wn90.F().a);
        if (ft4.b().i(strC)) {
            act().duringCreated(CoreModule.c.U1.i3("profile", strC)).subscribe(mkd0.H(new e30() { // from class: l.u0a0
                public final void call(Object obj) {
                    this.f20443a.m2894xb(strC, (List) obj);
                }
            }, new e30() { // from class: l.v0a0
                public final void call(Object obj) {
                    this.f20919a.m2905yb((Throwable) obj);
                }
            }));
            return;
        }
        if (u59.t() && NullChecker.a(m9268i2())) {
            String strK = vwb.k(m9268i2().description);
            if (!TextUtils.equals(strK, this.f1607k2.description) && !TextUtils.isEmpty(strK.trim())) {
                DetectRequest detectRequestNew_ = DetectRequest.new_();
                detectRequestNew_.category = DetectCategoryType.get("contact_information");
                ArrayList arrayList = new ArrayList();
                DetectText detectTextNew_ = DetectText.new_();
                detectTextNew_.key = "aboutMe";
                detectTextNew_.value = strK;
                arrayList.add(detectTextNew_);
                detectRequestNew_.text = arrayList;
                act().duringCreated(ya5.Q(detectRequestNew_)).subscribe(mkd0.H(new e30() { // from class: l.w0a0
                    public final void call(Object obj) {
                        this.f21402a.m2578Ab((Detect) obj);
                    }
                }, new e30() { // from class: l.x0a0
                    public final void call(Object obj) {
                        this.f22065a.m2586Bb((Throwable) obj);
                    }
                }));
                return;
            }
        }
        mo1575o();
    }

    /* JADX INFO: renamed from: Cc */
    public final /* synthetic */ void m2593Cc(Media media, Boolean bool, Boolean bool2) {
        mo1540Z2();
    }

    /* JADX INFO: renamed from: Cd */
    public final void m2594Cd(final List<Media> list, final boolean z) {
        this.f1609k4.mo14451a(new d30() { // from class: l.g2a0
            public final void call() {
                this.f10732a.m2598Dc(z, list);
            }
        });
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo1501D2() {
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: D9 */
    public final void m2595D9() {
        int i;
        int i2;
        int i3;
        if ("liked_users".equals(this.f1645t3) || "intl_top_picks".equals(this.f1645t3) || m2696S9()) {
            LikeUser likeUserM = CoreModule.c.a1.m(this.f1616m3);
            if (likeUserM == null && NullChecker.a(this.f1469G3)) {
                likeUserM = this.f1474H3;
            }
            if (NullChecker.a(likeUserM) || "intl_top_picks".equals(this.f1645t3) || m2696S9()) {
                if (!this.f1640s2) {
                    this.f1460F0.setBackgroundResource(x2c0.yb);
                    this.f1454E0.setBackgroundResource(x2c0.yb);
                    VImage vImage = this.f1466G0;
                    if (u59.T()) {
                        i = x2c0.xb;
                    } else {
                        i = IntlCountryCodeController.v() ? x2c0.Ab : x2c0.zb;
                    }
                    vImage.setImageResource(i);
                    this.f1471H0.setTextColor(Color.parseColor("#FFDEA2"));
                    if ("liked_users".equals(this.f1645t3) || m2696S9()) {
                        xdl0.M(this.f1506O0, false);
                        xdl0.M(this.f1560Z, false);
                        return;
                    }
                    return;
                }
                VLinear vLinear = this.f1663y1;
                if (vLinear != null && this.f1668z1 != null) {
                    vLinear.setBackground(act().getResources().getDrawable(x2c0.yb));
                    VImage vImage2 = this.f1668z1;
                    if (u59.T()) {
                        i3 = x2c0.xb;
                    } else {
                        i3 = IntlCountryCodeController.v() ? x2c0.Ab : x2c0.zb;
                    }
                    vImage2.setImageResource(i3);
                }
                this.f1460F0.setBackgroundResource(x2c0.yb);
                this.f1454E0.setBackgroundResource(x2c0.yb);
                VImage vImage3 = this.f1466G0;
                if (u59.T()) {
                    i2 = x2c0.xb;
                } else {
                    i2 = IntlCountryCodeController.v() ? x2c0.Ab : x2c0.zb;
                }
                vImage3.setImageResource(i2);
                this.f1471H0.setTextColor(Color.parseColor("#FFDEA2"));
                if ("liked_users".equals(this.f1645t3) || m2696S9()) {
                    m2626I8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Da */
    public final /* synthetic */ Boolean m2596Da(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || ((Boolean) CoreModule.c.m0.u0.get()).booleanValue() || !NullChecker.a(CoreModule.c.o3()) || n3b0.m18489t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        hpd0 hpd0Var = CoreModule.c.m0.u0;
        Boolean bool3 = Boolean.TRUE;
        hpd0Var.put(bool3);
        ok3.G(act(), true, this.f1576c4.name, CoreModule.c.o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f1576c4.gender, "male"), new Runnable() { // from class: l.l1a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14642a.m2591Ca(str, str2);
            }
        }, new Runnable() { // from class: l.n1a0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFrag.m2519m7();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: Db */
    public final /* synthetic */ void m2597Db(View view) {
        lra0.h("button");
        m1521N6();
    }

    /* JADX INFO: renamed from: Dc */
    public final /* synthetic */ void m2598Dc(boolean z, List list) {
        MediaReorderCards mediaReorderCards = this.f1609k4.f8746v;
        mediaReorderCards.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (true) {
            if (i >= 6) {
                break;
            }
            mediaReorderCards.m1257h(i).setIllegalPicture(z && i < list.size());
            mediaReorderCards.m1257h(i).m1076C1(i < list.size() ? (Media) list.get(i) : null);
            mediaReorderCards.m1257h(i).setChangeAction(new g30() { // from class: l.t4a0
                /* JADX INFO: renamed from: a */
                public final void m22790a(Object obj, Object obj2, Object obj3) {
                    this.f19415a.m2593Cc((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (upa.u2()) {
                mediaReorderCards.m1257h(i).m1080E1(i, "p_edit_profile_view");
                if (!((Boolean) this.f1482J1.get()).booleanValue() && i == list.size()) {
                    mediaReorderCards.m1257h(i).m1102P1();
                    this.f1482J1.put(Boolean.TRUE);
                }
            }
            mediaReorderCards.m1257h(i).m1087I0(i);
            i++;
        }
        int size = list.size();
        if (size < 6) {
            m2483de(size, null, mediaReorderCards);
        }
    }

    /* JADX INFO: renamed from: Dd */
    public final void m2599Dd(User user) {
        m2605Ed(user, false);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E */
    public void mo1504E() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E1 */
    public boolean mo2600E1() {
        return this.f1637r3;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E2 */
    public j760<Integer, Integer> mo2601E2() {
        return this.f1552X1;
    }

    /* JADX INFO: renamed from: E9 */
    public final void m2602E9() {
        if (m2829na()) {
            if (!m2774dd()) {
                this.f1573c1.setViewLayoutType(3);
            } else {
                this.f1640s2 = true;
                xdl0.M(this.f1573c1, false);
            }
        }
    }

    /* JADX INFO: renamed from: Eb */
    public final /* synthetic */ void m2603Eb(View view) {
        m2832nd();
    }

    /* JADX INFO: renamed from: Ec */
    public final /* synthetic */ void m2604Ec() {
        jg90 jg90Var = this.f1450D2;
        if (jg90Var instanceof wg90) {
            this.f1631q1.m3515o();
            this.f1447C4.m14742f(this.f1633q3, ((wg90) jg90Var).f21739X, this.f1631q1.f1979k, this, this.f1616m3, this.f1645t3, m2844pa(this.f1602j2) && NullChecker.a(this.f1440B2.f1835J), this.f1440B2.f1835J);
        }
    }

    /* JADX INFO: renamed from: Ed */
    public final void m2605Ed(User user, boolean z) {
        m2572yd();
        m2594Cd(user.pictures, z);
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: F */
    public View mo2606F() {
        return m2774dd() ? this.f1536U0 : this.f1573c1;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: F1 */
    public User mo1506F1(boolean z) {
        if (!NullChecker.a(wn90.F().a)) {
            CrashHelper.c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            wn90.F().a = CoreModule.c.e0.p9().clone();
        }
        return wn90.F().a;
    }

    /* JADX INFO: renamed from: F8 */
    public final void m2607F8() {
        if ((TextUtils.equals(this.f1645t3, "from_card_upload_photo") || TextUtils.equals(this.f1645t3, "from_profile_upload_photo") || TextUtils.equals(this.f1645t3, "thin_popup")) && !this.f1586f2) {
            byte b = 1;
            this.f1586f2 = true;
            if (!upa.u2()) {
                LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
                if (vwb.J(LoopFragmentFactory.m1987z(loopCreateEntryType, null, m9268i2()))) {
                    return;
                }
                LoopFragmentFactory.m1959U(m9268i2(), this, null, loopCreateEntryType, this.f1645t3);
                return;
            }
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
            if (vwb.J(LoopFragmentFactory.m1940B(loopCreateEntryType2, null, m9268i2(), true, true, this.f1645t3))) {
                return;
            }
            String str = this.f1645t3;
            str.getClass();
            switch (str.hashCode()) {
                case -338162810:
                    b = !str.equals("thin_popup") ? (byte) -1 : (byte) 0;
                    break;
                case 182867647:
                    if (!str.equals("from_profile_upload_photo")) {
                        b = -1;
                    }
                    break;
                case 1120730606:
                    b = !str.equals("from_card_upload_photo") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    break;
                case 1:
                    loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_PROFILE_UPLOAD_PHOTO;
                    break;
                case 2:
                    loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD_UPLOAD_PHOTO;
                    break;
                default:
                    loopCreateEntryType2 = null;
                    break;
            }
            LoopFragmentFactory.m1959U(m9268i2(), this, null, loopCreateEntryType2, this.f1645t3);
        }
    }

    /* JADX INFO: renamed from: F9 */
    public final void m2608F9() {
        this.f1604j4.add(this.f1440B2);
        if (m2838oa()) {
            this.f1604j4.add(this.f1563Z2);
        }
        this.f1604j4.add(this.f1450D2);
        this.f1604j4.add(this.f1591g3);
        this.f1604j4.add(this.f1575c3);
        this.f1604j4.add(this.f1579d3);
        this.f1604j4.add(this.f1587f3);
        this.f1604j4.add(this.f1538U2);
        if (!"-11005".equals(this.f1616m3) && !"from_guess_liker_result".equals(this.f1645t3)) {
            this.f1604j4.add(this.f1553X2);
        }
        if (!TextUtils.isEmpty(this.f1645t3) && (TextUtils.equals("home_card", this.f1645t3) || TextUtils.equals("share_profile", this.f1645t3) || TextUtils.equals("home_moment_theme_card", this.f1645t3))) {
            mo1523P1();
        }
        if (!mo1523P1()) {
            this.f1604j4.add(new l33(this, this));
        }
        this.f1604j4.add(this.f1662x4);
    }

    /* JADX INFO: renamed from: Fb */
    public final /* synthetic */ void m2609Fb() {
        gd70.m13725b().m13727d(act());
        startActivity(ProfileAct.m1176p2(act(), this.f1616m3, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: Fc */
    public final /* synthetic */ void m2610Fc(int i) {
        this.f1543V2.m16607Y(i);
    }

    /* JADX INFO: renamed from: Fd */
    public final void m2611Fd() {
        creates(new e30() { // from class: l.i2a0
            public final void call(Object obj) {
                this.f12404a.m2616Gc((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.Ka(((DbObject) this.f1512P1).id)).map(new w9j() { // from class: l.j2a0
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.k2a0
            public final Object call(Object obj) {
                return this.f14174a.m2623Hc((PicVerification) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.m2a0
            public final void call(Object obj) {
                this.f15218a.m2630Ic((PicVerification) obj);
            }
        }));
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: G */
    public void mo1508G(View... viewArr) {
        for (View view : viewArr) {
            xdl0.E0(view, m2841od(this.f1602j2));
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: G0 */
    public boolean mo2612G0(User user) {
        if (user == null) {
            m2428Rd(CoreModule.K().getUserById(this.f1616m3));
        }
        if (!this.f1620n3 && mo2821m3(user)) {
            return false;
        }
        if (!this.f1620n3 && this.f1653v3) {
            Relationship relationship = user.localRelationship;
            return relationship != null && TEnum.equals(relationship.state, "matched");
        }
        if (this.f1641s3) {
            return !this.f1633q3;
        }
        return false;
    }

    /* JADX INFO: renamed from: G8 */
    public final void m2613G8() {
        if (!TextUtils.equals(this.f1636r2.get("action"), "signature") || this.f1586f2) {
            return;
        }
        this.f1586f2 = true;
        LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: G9 */
    public final void m2614G9() {
        this.f1470H.setVisibility(8);
        m2673P8();
        this.f1540V.setBackgroundColor(Color.parseColor("#ffffff"));
        xdl0.p0(this.f1555Y);
        xdl0.p0(this.f1521R0);
        xdl0.p0(this.f1550X);
        this.f1555Y = null;
        this.f1521R0 = null;
        this.f1506O0 = null;
        this.f1454E0 = null;
        this.f1560Z = null;
    }

    /* JADX INFO: renamed from: Gb */
    public final /* synthetic */ void m2615Gb(d30 d30Var) {
        this.f1440B2.m3345K1(d30Var);
    }

    /* JADX INFO: renamed from: Gc */
    public final /* synthetic */ void m2616Gc(Bundle bundle) {
        m2410Nd(this.f1512P1);
        m2428Rd(this.f1512P1);
        this.f1615m2.onNext(roj0.a);
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: H0 */
    public void mo2617H0(int i) {
        this.f1527S1 = i;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: H1 */
    public View mo2618H1() {
        return (View) m2786fd(this.f1440B2.f1829G);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo1510H3() {
        return this.f1619n2;
    }

    /* JADX INFO: renamed from: H8 */
    public final void m2619H8() {
        xdl0.M(this.f1555Y, false);
        if (NullChecker.a(this.f1651v1)) {
            xdl0.M(this.f1651v1, false);
        }
        xdl0.M(this.f1593h1, false);
    }

    /* JADX INFO: renamed from: H9 */
    public final void m2620H9() {
        if ("from_intl_visitor".equals(this.f1645t3) || "from_intl_salvage".equals(this.f1645t3)) {
            xdl0.M(this.f1506O0, false);
            xdl0.M(this.f1560Z, false);
            xdl0.M(this.f1454E0, false);
            if (NullChecker.a(this.f1606k1)) {
                xdl0.M(this.f1606k1, false);
            }
            if (NullChecker.a(this.f1536U0)) {
                xdl0.M(this.f1536U0, false);
            }
            duringCreated(CoreModule.c.e0.L7(this.f1616m3)).subscribe(mkd0.H(new e30() { // from class: l.p4a0
                public final void call(Object obj) {
                    this.f16998a.m2818lc((List) obj);
                }
            }, new e30() { // from class: l.q4a0
                public final void call(Object obj) {
                    ProfileListFrag.m2460Z6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ha */
    public final /* synthetic */ void m2621Ha(boolean z, Relationship relationship) {
        if (z) {
            this.f1574c2 = false;
            this.f1578d2 = true;
            if (NullChecker.a(this.f1651v1) && xdl0.O0(this.f1651v1)) {
                xdl0.M(this.f1651v1, false);
                m2658Md(false);
            }
        } else {
            if (CoreModule.N().so() && (m2674P9(this.f1645t3) || m2667O9())) {
                osi0.g("喜欢已发送");
            }
            if (NullChecker.a(this.f1651v1) && xdl0.O0(this.f1651v1)) {
                m2658Md(false);
                xdl0.M(this.f1651v1, false);
                xdl0.M(this.f1614m1, true);
            }
            this.f1582e2 = false;
        }
        m2814kd(true);
        if (NullChecker.a(this.f1454E0)) {
            xdl0.M(this.f1454E0, false);
        }
    }

    /* JADX INFO: renamed from: Hb */
    public final /* synthetic */ void m2622Hb(View view) {
        zvf0.r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        this.f1557Y1.b();
    }

    /* JADX INFO: renamed from: Hc */
    public final /* synthetic */ Boolean m2623Hc(PicVerification picVerification) {
        return Boolean.valueOf(!this.f1512P1.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: Hd */
    public final void m2624Hd(@NonNull final RiskOtherData riskOtherData) {
        if (TextUtils.isEmpty(riskOtherData.text)) {
            return;
        }
        xdl0.M(this.f1643t1, true);
        this.f1647u1.setText(riskOtherData.text);
        zvf0.A("e_profile_safety_notice", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("user_risk_type", riskOtherData.type), vwb.Y("risk_userid", userId())});
        xdl0.E0(this.f1643t1, new View.OnClickListener() { // from class: l.i0a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12384a.m2637Jc(riskOtherData, view);
            }
        });
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: I1 */
    public boolean mo2625I1() {
        return !this.f1652v2;
    }

    /* JADX INFO: renamed from: I8 */
    public final void m2626I8() {
        xdl0.M(this.f1555Y, false);
        boolean zM2823ma = m2823ma();
        VLinear vLinear = this.f1651v1;
        if (zM2823ma) {
            xdl0.M(vLinear, true);
            m2658Md(true);
        } else {
            if (NullChecker.a(vLinear)) {
                xdl0.M(this.f1651v1, false);
            }
            xdl0.M(this.f1593h1, true);
            m2658Md(false);
        }
        xdl0.E0(this.f1593h1, new View.OnClickListener() { // from class: l.n4a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15821a.m2585Ba(view);
            }
        });
    }

    /* JADX INFO: renamed from: I9 */
    public boolean m2627I9() {
        User user;
        if (mo1570m0() || (user = this.f1602j2) == null || TextUtils.equals(((DbObject) user).id, CoreModule.H().userId())) {
            return false;
        }
        return this.f1602j2.isBannedNew() || this.f1602j2.isAccountCancellation();
    }

    /* JADX INFO: renamed from: Ia */
    public final /* synthetic */ void m2628Ia(boolean z, Throwable th) {
        if (z) {
            this.f1574c2 = false;
        } else {
            this.f1582e2 = false;
        }
        m2814kd(false);
    }

    /* JADX INFO: renamed from: Ib */
    public final /* synthetic */ void m2629Ib() {
        if (NullChecker.a(CoreModule.c.e0.oa(userId())) && NullChecker.a(CoreModule.c.e0.oa(userId()).fp().profileSmall())) {
            CoreModule.c.f0.Gp(act(), false, userId(), CoreModule.c.e0.oa(userId()).fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: Ic */
    public final /* synthetic */ void m2630Ic(PicVerification picVerification) {
        User user = this.f1512P1;
        user.verifications = picVerification;
        m2410Nd(user);
        m2428Rd(this.f1512P1);
        this.f1615m2.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Id */
    public final void m2631Id(boolean z) {
        act().startActivity(ReportAct.d2(act(), this.f1616m3, "", z, new ResultReceiverC01176(null, z), "profile", TextUtils.equals("home_card", this.f1645t3)));
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: J */
    public View mo2632J() {
        return this.f1560Z;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo1514J1() {
        return this;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo1515J3() {
        if (this.f1607k2 == null || this.f1602j2 == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f1615m2.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: J8 */
    public final void m2633J8() {
        if (m2674P9(this.f1645t3) || m2667O9()) {
            if (!CoreModule.N().Wm() || m2851qa()) {
                xdl0.M(this.f1593h1, false);
                return;
            }
            this.f1568a4 = false;
            this.f1597i1.setBackground(act().getResources().getDrawable(x2c0.Eh));
            this.f1601j1.setImageDrawable(act().getResources().getDrawable(x2c0.Lh));
            VLinear vLinear = this.f1663y1;
            if (vLinear != null && this.f1668z1 != null) {
                vLinear.setBackground(act().getResources().getDrawable(x2c0.Eh));
                this.f1668z1.setImageDrawable(act().getResources().getDrawable(x2c0.Lh));
            }
            boolean zM2823ma = m2823ma();
            VLinear vLinear2 = this.f1651v1;
            if (zM2823ma) {
                xdl0.M(vLinear2, true);
                m2658Md(true);
            } else {
                if (NullChecker.a(vLinear2)) {
                    xdl0.M(this.f1651v1, false);
                }
                xdl0.M(this.f1593h1, true);
                m2658Md(false);
            }
        }
    }

    /* JADX INFO: renamed from: J9 */
    public boolean m2634J9() {
        if (!NullChecker.a(vwb.r(CoreModule.N().Gm(), new w9j() { // from class: l.h2a0
            public final Object call(Object obj) {
                return this.f11850a.m2825mc((String) obj);
            }
        }))) {
            return this.f1564Z3;
        }
        this.f1564Z3 = false;
        return false;
    }

    /* JADX INFO: renamed from: Ja */
    public final /* synthetic */ void m2635Ja(boolean z) {
        if (z) {
            this.f1574c2 = true;
        } else {
            this.f1582e2 = true;
        }
    }

    /* JADX INFO: renamed from: Jb */
    public final /* synthetic */ void m2636Jb() {
        if (NullChecker.a(CoreModule.c.e0.oa(userId())) && NullChecker.a(CoreModule.c.e0.oa(userId()).fp().profileSmall())) {
            CoreModule.c.f0.Gp(act(), true, userId(), CoreModule.c.e0.oa(userId()).fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: Jc */
    public final /* synthetic */ void m2637Jc(RiskOtherData riskOtherData, View view) {
        wc80.e().q(uc80.a(new gwp(act())));
        zvf0.u("e_profile_safety_notice", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("user_risk_type", riskOtherData.type)});
    }

    /* JADX INFO: renamed from: Jd */
    public final void m2638Jd() {
        this.f1579d3.m25904V(false);
        this.f1587f3.m25904V(false);
        this.f1575c3.m25904V(false);
        this.f1591g3.m25904V(false);
        this.f1583e3.m25904V(false);
    }

    @Override // p002l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo1517K2() {
        if (this.f1602j2 == null && !mo2659N2()) {
            m2428Rd(CoreModule.K().getUserById(this.f1616m3));
        }
        if (this.f1602j2 == null && !m2783fa()) {
            CrashHelper.d(new IllegalStateException("profilelist user is null id " + userId() + " from : " + from() + " afterGetUserInfo : " + this.f1666y4), 1000);
        }
        return this.f1602j2;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: K3 */
    public int mo2639K3() {
        return this.f1522R1;
    }

    /* JADX INFO: renamed from: K8 */
    public void m2640K8() {
        xdl0.M(this.f1550X, (NullChecker.a(this.f1577d1) && xdl0.O0(this.f1577d1)) || (NullChecker.a(this.f1593h1) && xdl0.O0(this.f1593h1)) || ((NullChecker.a(this.f1573c1) && xdl0.O0(this.f1573c1)) || (NullChecker.a(this.f1606k1) && xdl0.O0(this.f1606k1))));
    }

    /* JADX INFO: renamed from: K9 */
    public final boolean m2641K9() {
        return (!upa.F1() || this.f1624o3 || TextUtils.isEmpty(this.f1616m3) || !CoreModule.c.f0.vh(this.f1616m3) || m2753aa()) ? false : true;
    }

    /* JADX INFO: renamed from: Ka */
    public final /* synthetic */ void m2642Ka(GreetingPermission greetingPermission) {
        if (TextUtils.equals(this.f1645t3, "impress_signal") || TextUtils.equals(this.f1645t3, "from_pin_like")) {
            return;
        }
        if (!NullChecker.a(greetingPermission) || !greetingPermission.enable || !NullChecker.a(CoreModule.K().getUserById(this.f1616m3))) {
            if (CoreModule.N().Co()) {
                m2723Vd();
                return;
            } else {
                this.f1573c1.setViewLayoutType(2);
                m2678Pd(mo1517K2(), false);
                return;
            }
        }
        if (CoreModule.N().Co()) {
            m2723Vd();
            return;
        }
        if (TextUtils.equals(this.f1645t3, "impress_signal")) {
            return;
        }
        xdl0.M(this.f1454E0, false);
        xdl0.M(this.f1573c1, false);
        this.f1573c1.setViewLayoutType(1);
        this.f1573c1.q(act(), this.f1645t3, CoreModule.K().getUserById(this.f1616m3), new u2a0(this), m2891wd());
        xdl0.M(this.f1573c1, true);
        m2678Pd(mo1517K2(), false);
    }

    /* JADX INFO: renamed from: Kb */
    public final /* synthetic */ void m2643Kb() {
        zvf0.u("e_blacklist", "p_user_profile_more_popup", new j760[]{j760.a("blacklist_management", "add")});
        CoreModule.N().Pf(act(), this.f1602j2, CoreModule.N().Kk(this.f1602j2));
    }

    /* JADX INFO: renamed from: Kc */
    public final /* synthetic */ void m2644Kc(roj0 roj0Var) {
        if (TextUtils.equals(this.f1645t3, "home_card")) {
            act().setResult(SwipeDirection.RIGHT.getValue());
            act().finish();
        } else {
            xdl0.M(this.f1546W0, false);
            xdl0.M(this.f1541V0, false);
        }
    }

    /* JADX INFO: renamed from: Kd */
    public final void m2645Kd() {
        if (TextUtils.isEmpty(this.f1551X0.getText().toString().trim())) {
            return;
        }
        zvf0.u("e_new_profile_message_send", pageId(), new j760[]{j760.a("matched_left_time", m2732X8())});
        Message messageNew_ = Message.new_();
        messageNew_.value = this.f1551X0.getText().toString().trim();
        messageNew_.messageType = MessageType.get("text");
        this.f1551X0.setText("");
        if (TextUtils.equals(this.f1645t3, "home_card")) {
            CoreModule.c.f0.P1 = userId();
        }
        act().hideInput();
        duringCreated(CoreModule.c.f0.Dn(userId(), messageNew_, (Sticker) null).flatMap(new w9j() { // from class: l.k0a0
            public final Object call(Object obj) {
                return CoreModule.c.f0.Fo();
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.l0a0
            public final void call(Object obj) {
                this.f14634a.m2644Kc((roj0) obj);
            }
        }, new e30() { // from class: l.m0a0
            public final void call(Object obj) {
                ProfileListFrag.m2523n7((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L8 */
    public x9j<Boolean, Boolean, Boolean> m2646L8(final String str, final String str2) {
        return new x9j() { // from class: l.g0a0
            public final Object call(Object obj, Object obj2) {
                return this.f10700a.m2596Da(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: La */
    public final /* synthetic */ void m2647La() {
        this.f1440B2.f1884x.b0();
    }

    /* JADX INFO: renamed from: Lb */
    public final /* synthetic */ void m2648Lb() {
        zvf0.u("e_blacklist", "p_user_profile_more_popup", new j760[]{j760.a("blacklist_management", "remove")});
        CoreModule.N().Pf(act(), this.f1602j2, CoreModule.N().Kk(this.f1602j2));
    }

    /* JADX INFO: renamed from: Lc */
    public final /* synthetic */ void m2649Lc(int i, boolean z) {
        this.f1440B2.m3344J1(i, z);
    }

    /* JADX INFO: renamed from: Ld */
    public final void m2650Ld(final User user) {
        xdl0.E0(this.f1491L0, new View.OnClickListener() { // from class: l.x3a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22103a.m2677Pc(user, view);
            }
        });
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: M */
    public boolean mo2651M() {
        if (upa.V1()) {
            return TextUtils.equals(this.f1645t3, "chat_group_anonymity") || TextUtils.equals(this.f1645t3, "chat_group");
        }
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: M0 */
    public View mo2652M0() {
        return this.f1470H;
    }

    /* JADX INFO: renamed from: M8, reason: merged with bridge method [inline-methods] */
    public ArrayList<j760<String, d30>> m2589C4() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.Y("user id", new d30() { // from class: l.n2a0
            public final void call() {
                this.f15795a.m2376Ea();
            }
        }));
        arrayList.add(vwb.Y("用户位置信息", new d30() { // from class: l.o2a0
            public final void call() {
                this.f16339a.m2380Fa();
            }
        }));
        arrayList.add(vwb.Y("mock 共同联系人", new d30() { // from class: l.p2a0
            public final void call() {
                this.f16986a.m2384Ga();
            }
        }));
        arrayList.add(vwb.Y("认证气泡本地数据清理：" + CoreModule.c.e0.r2.get() + " " + CoreModule.c.e0.q2.get(), new d30() { // from class: l.q2a0
            public final void call() {
                ProfileListFrag.m2482d8();
            }
        }));
        arrayList.add(vwb.Y("弹出先发like弹窗", new d30() { // from class: l.r2a0
            public final void call() {
                xdx.A().N(((DbObject) CoreModule.K().me_()).id);
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: M9 */
    public final boolean m2654M9() {
        User user;
        if (TextUtils.isEmpty(this.f1616m3) || (user = this.f1602j2) == null || user.isMe()) {
            return false;
        }
        if (this.f1576c4 == null) {
            this.f1576c4 = CoreModule.N().getUserById(this.f1616m3);
        }
        return CoreModule.N().mn(this.f1602j2) || CoreModule.N().mn(this.f1576c4);
    }

    /* JADX INFO: renamed from: Ma */
    public final /* synthetic */ void m2655Ma(Boolean bool) {
        m2580Ad(true);
    }

    /* JADX INFO: renamed from: Mb */
    public final /* synthetic */ void m2656Mb(boolean z, VListCell vListCell, VListCell.a aVar, int i) {
        if (TextUtils.equals(aVar.a.toString(), "分享给朋友看看")) {
            zvf0.r("e_share_to_third_app", "p_user_profile_more_popup");
            if (f9k0.c(userId())) {
                lsi0.y("此用户不可被分享");
            } else {
                ark.U0(act(), "share_bottom", new d30() { // from class: l.q1a0
                    public final void call() {
                        this.f17755a.m2629Ib();
                    }
                }, new d30() { // from class: l.r1a0
                    public final void call() {
                        this.f18315a.m2636Jb();
                    }
                });
            }
        } else if (TextUtils.equals(aVar.a.toString(), act().getString(R.string.r))) {
            m2631Id(z);
        } else if (TextUtils.equals(aVar.a.toString(), "取消喜欢")) {
            zvf0.u("e_unlike", "p_user_profile_more_popup", new j760[]{vwb.Y("unlike_from", "profile"), vwb.Y("other_user_id", NullChecker.a(this.f1602j2) ? ((DbObject) this.f1602j2).id : "")});
            CoreModule.N().T7(act(), this.f1602j2, this.f1645t3, (e30) null);
        } else if (TextUtils.equals(aVar.a.toString(), "取消关注")) {
            CoreModule.N().Vp(act(), this.f1602j2, this.f1645t3);
        } else if (TextUtils.equals(aVar.a.toString(), act().getString(R.string.h5))) {
            m2700Sd(act(), act().getString(R.string.y2), act().getString(R.string.h5), m2701T8(), new d30() { // from class: l.s1a0
                public final void call() {
                    this.f18755a.m2643Kb();
                }
            });
        } else if (TextUtils.equals(aVar.a.toString(), act().getString(R.string.v2))) {
            m2700Sd(act(), act().getString(R.string.y2), act().getString(R.string.v2), m2819ld(NullChecker.a(this.f1602j2) && this.f1602j2.isFemale()), new d30() { // from class: l.t1a0
                public final void call() {
                    this.f19358a.m2648Lb();
                }
            });
        }
        this.f1557Y1.b();
    }

    /* JADX INFO: renamed from: Mc */
    public final /* synthetic */ void m2657Mc(int i, boolean z) {
        this.f1440B2.m3344J1(i, z);
    }

    /* JADX INFO: renamed from: Md */
    public void m2658Md(boolean z) {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: N2 */
    public boolean mo2659N2() {
        return this.f1612l3;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: N3 */
    public View mo2660N3() {
        return this.f1569b1;
    }

    /* JADX INFO: renamed from: N8 */
    public User m2661N8() {
        if (IntlCountryCodeController.l() && !yij0.J(m9268i2().profile.studies.qualification) && !m9268i2().profile.studies.active) {
            wn90.F().a.profile.studies.school = "";
        }
        if (NullChecker.a(wn90.F().a) && this.f1654v4.m11332V()) {
            wn90.F().a.profile.extensions.momentSwitch.noSyncMoment.clear();
            wn90.F().a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f1654v4.m11331U() ? "false" : "true");
        }
        User userClone = wn90.F().a.clone();
        userClone.settings = null;
        return userClone.subtract(this.f1602j2);
    }

    /* JADX INFO: renamed from: Na */
    public final /* synthetic */ void m2662Na(roj0 roj0Var) {
        this.f1576c4 = CoreModule.N().getUserById(this.f1616m3);
        m2580Ad(false);
    }

    /* JADX INFO: renamed from: Nb */
    public final /* synthetic */ void m2663Nb() {
        ArrayList arrayList = new ArrayList();
        final cwf0 cwf0VarC = i0e.c("p_user_profile_more_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("other_user_id", NullChecker.a(this.f1602j2) ? ((DbObject) this.f1602j2).id : "")});
        if (m2795ha()) {
            arrayList.add("分享给朋友看看");
        }
        if (CoreModule.N().so()) {
            cwf0VarC.p(new j760[]{vwb.Y("share_pop_from_which", "profile")});
            if (m2811ka()) {
                arrayList.add("取消喜欢");
            } else if (m2654M9()) {
                arrayList.add("取消关注");
            }
        }
        arrayList.add(act().getString(R.string.r));
        if (m2674P9(this.f1645t3) || m2682Q9()) {
            if (CoreModule.N().Kk(this.f1602j2)) {
                cwf0VarC.p(new j760[]{vwb.Y("blacklist_management", "remove")});
                arrayList.add(act().getString(R.string.v2));
            } else {
                cwf0VarC.p(new j760[]{vwb.Y("blacklist_management", "add")});
                arrayList.add(act().getString(R.string.h5));
            }
        }
        int iIndexOf = arrayList.indexOf(act().getString(R.string.r));
        i0e.f(cwf0VarC);
        c40.b bVar = new c40.b(getContext());
        final boolean zMo2612G0 = mo2612G0(mo1517K2());
        bVar.T(new DialogInterface.OnDismissListener() { // from class: l.g1a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).I(act().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.h1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11713a.m2622Hb(view);
            }
        }).Q(arrayList).R(new int[]{iIndexOf}, new int[]{w0c0.L}).V(new c40.d() { // from class: l.i1a0
            /* JADX INFO: renamed from: a */
            public final void m14975a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f12392a.m2656Mb(zMo2612G0, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f1557Y1 = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: Nc */
    public final /* synthetic */ void m2664Nc(User user, String str) {
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", ((DbObject) user).id);
        intent.putExtra("heart_confession_content", str);
        m2902y8(SwipeDirection.UP.getValue(), intent);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: O1 */
    public boolean mo2665O1() {
        return m2689R9();
    }

    /* JADX INFO: renamed from: O8 */
    public final User m2666O8() {
        User userClone = this.f1602j2.clone();
        if (this.f1654v4.m11332V()) {
            userClone.profile.extensions.momentSwitch.noSyncMoment.clear();
            userClone.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f1654v4.m11331U() ? "false" : "true");
        }
        return userClone.subtract(this.f1602j2);
    }

    /* JADX INFO: renamed from: O9 */
    public final boolean m2667O9() {
        return TextUtils.equals(this.f1645t3, "from_conversation_search_view");
    }

    /* JADX INFO: renamed from: Oa */
    public final /* synthetic */ void m2668Oa(View view) {
        m2756ae();
    }

    /* JADX INFO: renamed from: Ob */
    public final /* synthetic */ void m2669Ob(d30 d30Var) {
        this.f1440B2.m3347L1(d30Var, null);
    }

    /* JADX INFO: renamed from: Oc */
    public final /* synthetic */ void m2670Oc(final User user, final String str) {
        if (u59.f0()) {
            fap.t(act(), "intl_letter_profile", new d30() { // from class: l.f1a0
                public final void call() {
                    this.f10096a.m2664Nc(user, str);
                }
            });
            return;
        }
        if (!tkp.d()) {
            swh0.s1(act(), "intl_letter_profile");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", ((DbObject) user).id);
        intent.putExtra("heart_confession_content", str);
        m2902y8(SwipeDirection.UP.getValue(), intent);
    }

    /* JADX INFO: renamed from: Od */
    public void m2671Od() {
        String str;
        ((PutongFrag) this).pageHelper.q(pageId());
        f.b().f(this.f1645t3);
        if (this.f1624o3) {
            return;
        }
        String str2 = this.f1616m3;
        String strRelativeTimeForTrack = "";
        if (TextUtils.equals("home_card", this.f1645t3) || TextUtils.equals("from_city_center_conv_banner", this.f1645t3)) {
            str = "home";
        } else {
            str = (TextUtils.equals("home_menu", this.f1645t3) || this.f1624o3) ? "" : LiveMessage.LiveMessageType.OTHER;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f1620n3 ? "true" : "false");
            User userById = CoreModule.K().getUserById(this.f1616m3);
            boolean z = false;
            if (NullChecker.a(userById)) {
                if (!userById.location.isHideUpdateTime() && !userById.isMe() && !CoreModule.c.E0.x3(userById) && (userById.isMe() || User.isMatched(this.f1602j2) || mqi0.o() - userById.location.updatedTime <= 1.728E8d)) {
                    strRelativeTimeForTrack = userById.relativeTimeForTrack();
                }
                Relationship relationship = userById.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    jSONObject.put("is_match", 0);
                } else {
                    jSONObject.put("is_match", 1);
                }
                jSONObject.put("distance", m2427R8(userById));
                jSONObject.put("lastactivity_time", strRelativeTimeForTrack);
            }
            jSONObject.put("refer_source", m2462Z8(this.f1645t3));
            if (TextUtils.equals("from_city_center_conv_banner", this.f1645t3) || (NullChecker.a(this.f1602j2) && this.f1602j2.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            ((PutongFrag) this).pageHelper.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: P */
    public boolean mo2672P(String str) {
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo1523P1() {
        return this.f1620n3;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: P8 */
    public final void m2673P8() {
        if (this.f1624o3) {
            this.f1540V.setFocusableInTouchMode(true);
            this.f1540V.setDescendantFocusability(131072);
            this.f1540V.setFocusable(true);
        }
    }

    /* JADX INFO: renamed from: P9 */
    public final boolean m2674P9(String str) {
        return CoreModule.N().Qm(str);
    }

    /* JADX INFO: renamed from: Pa */
    public final /* synthetic */ void m2675Pa(View view) {
        m2798hd();
    }

    /* JADX INFO: renamed from: Pb */
    public final /* synthetic */ void m2676Pb(User user) {
        m2410Nd(user);
        m2428Rd(user);
        this.f1615m2.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Pc */
    public final /* synthetic */ void m2677Pc(final User user, View view) {
        if (user == null) {
            user = this.f1602j2;
        }
        tkp.g(act(), user, new e30() { // from class: l.m4a0
            public final void call(Object obj) {
                this.f15231a.m2670Oc(user, (String) obj);
            }
        }, "intl_letter_profile");
        zvf0.u("liked_users".equals(this.f1645t3) ? "e_iliked_letter" : "e_letter_bar", pageId(), new j760[]{j760.a("is_privileged", cll0.e(swh0.G()))});
    }

    /* JADX INFO: renamed from: Pd */
    public final void m2678Pd(User user, boolean z) {
        if (user == null) {
            user = this.f1602j2;
        }
        final User user2 = user;
        this.f1573c1.H(user2, z, z ? new e30() { // from class: l.s2a0
            public final void call(Object obj) {
                this.f18764a.m2692Rc(user2, (String) obj);
            }
        } : new e30() { // from class: l.t2a0
            public final void call(Object obj) {
                this.f19401a.m2699Sc(user2, (String) obj);
            }
        }, new u2a0(this), this.f1645t3);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Q */
    public boolean mo2679Q() {
        if ("from_guess_liker_result".equals(this.f1645t3) || m2726W9() || !CoreModule.N().Co()) {
            return false;
        }
        return m2730Wd();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: Q2 */
    public View mo2680Q2() {
        return (View) m2786fd(this.f1440B2.f1885y);
    }

    /* JADX INFO: renamed from: Q8 */
    public final void m2681Q8() {
        xh0 xh0Var = this.f1572b4;
        if (xh0Var == null) {
            return;
        }
        xh0Var.c();
        this.f1572b4 = null;
    }

    /* JADX INFO: renamed from: Q9 */
    public boolean m2682Q9() {
        return TextUtils.equals(this.f1645t3, "from_find_partner");
    }

    /* JADX INFO: renamed from: Qa */
    public final /* synthetic */ void m2683Qa(View view) {
        m2808jd();
    }

    /* JADX INFO: renamed from: Qb */
    public final /* synthetic */ void m2684Qb(roj0 roj0Var) {
        m2428Rd(mo1517K2());
        m2410Nd(CoreModule.K().me_());
        if (this.f1602j2 == null || this.f1607k2 == null) {
            return;
        }
        this.f1615m2.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Qc */
    public final /* synthetic */ void m2685Qc(int i) {
        this.f1450D2.f13755v.setVisibility(i);
    }

    /* JADX INFO: renamed from: Qd */
    public final void m2686Qd() {
        if (IntlCountryCodeController.v()) {
            xdl0.U(this.f1466G0, t100.d(1.0f));
            xdl0.W(this.f1466G0, t100.d(1.0f));
            this.f1466G0.setImageDrawable(act().getResources().getDrawable(x2c0.Lh));
            VImage vImage = this.f1668z1;
            if (vImage != null) {
                xdl0.U(vImage, t100.d(1.0f));
                xdl0.W(this.f1668z1, t100.d(1.0f));
                this.f1668z1.setImageDrawable(act().getResources().getDrawable(x2c0.Lh));
            }
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo1526R() {
        return ((Boolean) CoreModule.c.m0.x0.get()).booleanValue();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo1527R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R1 */
    public void mo2687R1(final int i) {
        this.f1543V2.mo14451a(new d30() { // from class: l.z3a0
            public final void call() {
                this.f23198a.m2610Fc(i);
            }
        });
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: R2 */
    public View mo2688R2() {
        return (View) m2786fd(this.f1440B2.f1843N);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public void m2871tc() {
        LiveService liveService;
        if (mo2899y2() && NullChecker.a(this.f1440B2.f1875g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f1440B2;
            profileImagesItemHolder.m3365V0(profileImagesItemHolder.f1875g1, false);
        }
        if (CoreModule.N().K8()) {
            CoreModule.N().Fm(userId(), m2634J9());
        }
        act().finish();
        if (rlt.c(this.f1645t3) && !this.f1603j3 && (liveService = qib0.b0.c) != null) {
            liveService.Tc(act(), this.f1616m3, true);
        }
        if (m2789ga()) {
            this.f1459F.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1559Y3);
        }
    }

    /* JADX INFO: renamed from: R9 */
    public final boolean m2689R9() {
        return "home_card".equals(this.f1645t3);
    }

    /* JADX INFO: renamed from: Ra */
    public final /* synthetic */ void m2690Ra(View view) {
        if (!this.f1568a4) {
            m2808jd();
        } else {
            zvf0.u("e_likeButton", pageId(), new j760[]{vwb.Y("moments_user_id", this.f1616m3)});
            yz9.m26983A(act(), this.f1602j2, true, null, LikeFrom.get("moment"), null, null, false, null);
        }
    }

    /* JADX INFO: renamed from: Rb */
    public final /* synthetic */ rx.c m2691Rb() {
        return mkd0.r(CoreModule.c.e0.Ka(this.f1616m3), CoreModule.c.e0.o9(), new g5a0());
    }

    /* JADX INFO: renamed from: Rc */
    public final /* synthetic */ void m2692Rc(User user, String str) {
        m2591Ca(str, ((DbObject) user).id);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: S */
    public boolean mo1530S() {
        return false;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: S1 */
    public View mo2693S1() {
        return this.f1454E0;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: S2 */
    public void mo2694S2(boolean z) {
        this.f1537U1 = z;
    }

    /* JADX INFO: renamed from: S8 */
    public void m2695S8(String str, String str2, final boolean z) {
        String str3;
        if (NullChecker.a(this.f1576c4)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iMo2761c0 = mo2761c0();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iMo2761c0;
            swipeExtraScData.picUploads = this.f1576c4.pictures.size();
            if (NullChecker.a(this.f1602j2) && this.f1602j2.pictures.size() != this.f1576c4.pictures.size()) {
                CrashHelper.c(new IllegalStateException(" profilelist picture size diff , user  " + ((DbObject) this.f1602j2).id + " " + this.f1602j2.pictures.size() + " withRelation " + ((DbObject) this.f1576c4).id + " " + this.f1576c4.pictures.size()));
            }
            int size = this.f1576c4.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iMo2761c0 >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = ((Media) this.f1576c4.pictures.get(iMo2761c0)).url;
            }
            Act act = act();
            User user = this.f1576c4;
            if (TextUtils.isEmpty(str)) {
                str3 = z ? "p_profile,superlike" : "p_home,likelimit";
            } else {
                str3 = "p_profile,letter";
            }
            if (qer.o(act, user, true, z, false, str3, m2646L8(str, str2), new e30() { // from class: l.x4a0
                public final void call(Object obj) {
                    this.f22107a.m2621Ha(z, (Relationship) obj);
                }
            }, new e30() { // from class: l.y4a0
                public final void call(Object obj) {
                    this.f22653a.m2628Ia(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, str, str2, new d30() { // from class: l.a5a0
                public final void call() {
                    this.f7405a.m2635Ja(z);
                }
            })) {
                if (z) {
                    this.f1574c2 = true;
                } else {
                    this.f1582e2 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: S9 */
    public boolean m2696S9() {
        return TextUtils.equals(this.f1645t3, "from_intl_meet");
    }

    /* JADX INFO: renamed from: Sa */
    public final /* synthetic */ void m2697Sa() {
        if (this.f1573c1.x() || this.f1506O0 == null) {
            return;
        }
        rxg0.H(this.f1460F0);
        myc0.d0().j.add(userId());
        myc0.d0().l0();
    }

    /* JADX INFO: renamed from: Sb */
    public final /* synthetic */ void m2698Sb(j760 j760Var) {
        if (!"home_card".equals(this.f1645t3) || this.f1644t2 == null) {
            m2428Rd((User) j760Var.a);
            m2410Nd((User) j760Var.b);
            this.f1615m2.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: Sc */
    public final /* synthetic */ void m2699Sc(User user, String str) {
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", ((DbObject) user).id);
        intent.putExtra("heart_confession_content", str);
        if (m2739Y9() || m2746Z9() || m2764ca() || m2771da() || m2758ba() || m2783fa() || m2702T9() || m2696S9()) {
            intent.putExtra("currentUserId", ((DbObject) this.f1602j2).id);
        }
        m2902y8(SwipeDirection.UP.getValue(), intent);
    }

    /* JADX INFO: renamed from: Sd */
    public final void m2700Sd(Act act, String str, String str2, String str3, final d30 d30Var) {
        xh0.a aVar = new xh0.a(act);
        xh0.a aVarJ = aVar.j(str3);
        if (TextUtils.isEmpty(str)) {
            str = act.getString(R.string.T);
        }
        aVarJ.r(str).o(new View.OnClickListener() { // from class: l.u1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20454a.m2705Tc(d30Var, view);
            }
        }).e(R.string.c).m(new DialogInterface.OnDismissListener() { // from class: l.v1a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ProfileListFrag.m2526o5(dialogInterface);
            }
        }).c(new View.OnClickListener() { // from class: l.w1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21410a.m2714Uc(view);
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            aVar.s(str2);
        }
        xh0 xh0VarA = aVar.a();
        this.f1572b4 = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: T8 */
    public String m2701T8() {
        return CoreModule.K().a().F() ? "拉黑后，ta不能对你关注、评论、点赞、打招呼，你可在“设置-隐私和通知-黑名单”内解除拉黑，是否确认要拉黑？" : act().getString(R.string.i5);
    }

    /* JADX INFO: renamed from: T9 */
    public boolean m2702T9() {
        return TextUtils.equals(this.f1645t3, "from_intl_meet_likers");
    }

    /* JADX INFO: renamed from: Ta */
    public final /* synthetic */ void m2703Ta() {
        Act act = act();
        if (act != null) {
            com.p1.mobile.putong.core.ui.match.a.w().T(act, this.f1459F, this.f1434A1, 3000);
        }
    }

    /* JADX INFO: renamed from: Tb */
    public final /* synthetic */ Boolean m2704Tb(j760 j760Var) {
        return Boolean.valueOf(NullChecker.a(j760Var) && TextUtils.equals((CharSequence) j760Var.a, this.f1616m3));
    }

    /* JADX INFO: renamed from: Tc */
    public final /* synthetic */ void m2705Tc(d30 d30Var, View view) {
        m2681Q8();
        d30Var.call();
    }

    /* JADX INFO: renamed from: Td */
    public final void m2706Td() {
        if (NullChecker.a(this.f1457E3) && this.f1457E3.showCountdownSendMsg) {
            this.f1632q2 = ((Long) CoreModule.c.f0.I0.get()).longValue();
            xdl0.M(this.f1546W0, true);
            xdl0.M(this.f1541V0, true);
            xdl0.E0(this.f1556Y0, new View.OnClickListener() { // from class: l.uy90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20878a.m2722Vc(view);
                }
            });
            xdl0.E0(this.f1551X0, new View.OnClickListener() { // from class: l.vy90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21377a.m2729Wc(view);
                }
            });
            duringCreated(CoreModule.c.f0.Ne(this.f1616m3)).subscribe(mkd0.G(new e30() { // from class: l.wy90
                public final void call(Object obj) {
                    this.f22040a.m2736Xc((Conversation) obj);
                }
            }));
            bt0.p(this.f1541V0, "alpha", 0L, 250L, (Interpolator) null, new float[]{0.0f, 1.0f}).start();
            zvf0.x("e_new_profile_message_input", pageId());
            zvf0.A("e_new_profile_message_send", pageId(), new j760[]{j760.a("matched_left_time", m2732X8())});
            xdl0.M(this.f1573c1, false);
            xdl0.M(this.f1577d1, false);
            xdl0.M(this.f1593h1, false);
            xdl0.M(this.f1593h1, false);
            xdl0.M(this.f1516Q0, false);
            xdl0.M(this.f1550X, false);
        }
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U */
    public xdl0.g mo2707U() {
        int childCount = this.f1540V.getChildCount();
        RecyclerView recyclerView = this.f1540V;
        return childCount > 2 ? xdl0.i0(recyclerView.getChildAt(1)) : xdl0.i0(recyclerView);
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U0 */
    public PictureView mo2708U0() {
        return this.f1440B2.m3354P0();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U2 */
    public void mo2709U2() {
        this.f1584e4 = true;
        m2770d9();
        if (this.f1545W.getVisibility() == 0) {
            this.f1545W.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: U8, reason: merged with bridge method [inline-methods] */
    public void m2591Ca(String str, String str2) {
        m2695S8(str, str2, true);
    }

    /* JADX INFO: renamed from: U9 */
    public boolean m2711U9() {
        return TextUtils.equals(this.f1645t3, "from_intl_visitor");
    }

    /* JADX INFO: renamed from: Ua */
    public final /* synthetic */ void m2712Ua() {
        int iM18158K;
        mt90 mt90Var = this.f1599i3;
        if (mt90Var != null && (iM18158K = mt90Var.m18158K()) >= 0) {
            this.f1540V.scrollToPosition(iM18158K);
            if (NullChecker.a(this.f1570b2)) {
                this.f1570b2.scrollToPositionWithOffset(iM18158K, 0);
            }
        }
    }

    /* JADX INFO: renamed from: Ub */
    public final /* synthetic */ void m2713Ub(View view) {
        this.f1454E0.callOnClick();
    }

    /* JADX INFO: renamed from: Uc */
    public final /* synthetic */ void m2714Uc(View view) {
        m2681Q8();
    }

    /* JADX INFO: renamed from: Ud */
    public void m2715Ud(final int i) {
        new xh0.a(act()).s(x4(R.string.Oq)).g(false).i(R.string.Nq).q(R.string.Mq).o(new View.OnClickListener() { // from class: l.b5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7988a.m2742Yc(i, view);
            }
        }).e(R.string.c).a().g();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: V0 */
    public void mo2716V0(boolean z) {
        this.f1547W1 = z;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: V2 */
    public RelationshipStatus mo2717V2() {
        return this.f1441B3;
    }

    /* JADX INFO: renamed from: V8 */
    public MediaReorderCard m2718V8(int i) {
        return this.f1609k4.f8746v.m1257h(i);
    }

    /* JADX INFO: renamed from: V9 */
    public boolean m2719V9() {
        return "liked_users".equals(this.f1645t3);
    }

    /* JADX INFO: renamed from: Va */
    public final /* synthetic */ void m2720Va(View view) {
        zvf0.r("e_user_info_greet_to_city_cover", pageId());
        d.e(act(), this.f1529S3.userId);
    }

    /* JADX INFO: renamed from: Vb */
    public final /* synthetic */ void m2721Vb(RelationshipStatus relationshipStatus) {
        if (TEnum.equals(relationshipStatus, RelationshipStatus.get("matched"))) {
            if (NullChecker.a(this.f1555Y)) {
                xdl0.M(this.f1555Y, false);
            }
            xdl0.M(this.f1536U0, false);
            if (NullChecker.a(this.f1573c1)) {
                xdl0.M(this.f1573c1, false);
            }
            if (CoreModule.N().Wm() && NullChecker.a(this.f1454E0)) {
                xdl0.M(this.f1454E0, false);
            }
            if (NullChecker.a(this.f1550X)) {
                xdl0.M(this.f1550X, false);
                return;
            }
            return;
        }
        if (!TEnum.equals(relationshipStatus, RelationshipStatus.get("liked"))) {
            if (TEnum.equals(relationshipStatus, RelationshipStatus.get("superliked"))) {
                if (this.f1640s2) {
                    xdl0.M(this.f1593h1, false);
                }
                if (NullChecker.a(this.f1506O0)) {
                    xdl0.M(this.f1506O0, false);
                }
                if (NullChecker.a(this.f1560Z)) {
                    xdl0.M(this.f1560Z, false);
                }
                if (NullChecker.a(this.f1454E0)) {
                    xdl0.M(this.f1454E0, false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1598i2 = true;
        if (this.f1640s2 && NullChecker.a(this.f1555Y) && xdl0.O0(this.f1555Y)) {
            xdl0.M(this.f1555Y, false);
            boolean zM2823ma = m2823ma();
            VLinear vLinear = this.f1651v1;
            if (zM2823ma) {
                xdl0.M(vLinear, true);
                m2658Md(true);
            } else {
                if (NullChecker.a(vLinear)) {
                    xdl0.M(this.f1651v1, false);
                }
                xdl0.M(this.f1593h1, true);
                m2658Md(false);
            }
            xdl0.E0(this.f1593h1, new View.OnClickListener() { // from class: l.oy90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16907a.m2713Ub(view);
                }
            });
        }
        if (NullChecker.a(this.f1506O0)) {
            xdl0.M(this.f1506O0, false);
        }
        if (NullChecker.a(this.f1560Z)) {
            xdl0.M(this.f1560Z, false);
        }
    }

    /* JADX INFO: renamed from: Vc */
    public final /* synthetic */ void m2722Vc(View view) {
        m2645Kd();
    }

    /* JADX INFO: renamed from: Vd */
    public void m2723Vd() {
        if (this.f1602j2 == null && !TextUtils.isEmpty(this.f1616m3)) {
            this.f1602j2 = CoreModule.K().getUserById(this.f1616m3);
        }
        User user = this.f1602j2;
        if (user == null || User.isMatched(user) || this.f1602j2.isTeamAccount() || "liked_users".equals(this.f1645t3) || "likers".equals(this.f1645t3) || "from_boost_refactor".equals(this.f1645t3) || this.f1602j2.isMe() || m2829na() || m2726W9() || TextUtils.equals(this.f1645t3, "impress_signal") || TextUtils.equals(this.f1645t3, "from_pin_like") || TextUtils.equals(this.f1645t3, "messages_thumbnail_left") || TextUtils.equals(this.f1645t3, "messages_title") || TextUtils.equals(this.f1645t3, "message_ice_break_dialog") || TextUtils.equals(this.f1645t3, "from_city_center_conv_banner") || TextUtils.equals(this.f1645t3, "conversation_view") || TextUtils.equals(this.f1645t3, "from_city_center_boost_cover") || TextUtils.equals(this.f1645t3, "profile_bubble")) {
            return;
        }
        this.f1573c1.setViewLayoutType(1);
        this.f1573c1.q(act(), this.f1645t3, this.f1602j2, new u2a0(this), m2891wd());
        xdl0.M(this.f1573c1, true);
        m2678Pd(mo1517K2(), false);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: W */
    public RecyclerView mo2724W() {
        return this.f1540V;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: W2 */
    public View mo2725W2() {
        return this.f1491L0;
    }

    /* JADX INFO: renamed from: W9 */
    public final boolean m2726W9() {
        return rlt.b(this.f1645t3);
    }

    /* JADX INFO: renamed from: Wa */
    public final /* synthetic */ void m2727Wa(View view) {
        mo1564j3(SwipeDirection.LEFT.getValue());
    }

    /* JADX INFO: renamed from: Wb */
    public final /* synthetic */ void m2728Wb(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f1652v2 = zBooleanValue;
        if (zBooleanValue) {
            this.f1615m2.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: Wc */
    public final /* synthetic */ void m2729Wc(View view) {
        zvf0.r("e_new_profile_message_input", pageId());
    }

    /* JADX INFO: renamed from: Wd */
    public boolean m2730Wd() {
        boolean zEquals;
        if (NullChecker.a(this.f1469G3)) {
            zEquals = TEnum.equals(this.f1469G3.status, "matched");
        } else {
            zEquals = (NullChecker.a(this.f1602j2) && NullChecker.a(this.f1602j2.localRelationship)) ? TEnum.equals(this.f1602j2.localRelationship.state, "matched") : false;
        }
        return ("likers".equals(this.f1645t3) || m2758ba() || zEquals || "from_boost_refactor".equals(this.f1645t3)) ? false : true;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: X1 */
    public boolean mo2731X1() {
        return this.f1542V1;
    }

    /* JADX INFO: renamed from: X8 */
    public final String m2732X8() {
        long jO = this.f1632q2 - mqi0.o();
        if (jO <= 0) {
            return "00.00.00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH.mm.ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = new Date();
        date.setTime(jO);
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: renamed from: X9 */
    public final boolean m2733X9() {
        return TextUtils.equals(this.f1645t3, "home_card") && getArguments().getBoolean("long_time_no_see");
    }

    /* JADX INFO: renamed from: Xa */
    public final /* synthetic */ void m2734Xa(View view) {
        ttn.a("p_suggest_user_profile_info_view", this.f1602j2);
        CoreModule.Q().startAudienceLive(act(), CoreModule.Q().getUserLiveId(((DbObject) this.f1602j2).id), "suggest-card", (String) null);
        CoreModule.c.m0.d8(((DbObject) this.f1602j2).id);
        mo1564j3(SwipeDirection.RIGHT.getValue());
    }

    /* JADX INFO: renamed from: Xb */
    public final /* synthetic */ void m2735Xb() {
        lsi0.y("对方状态异常");
        act().finish();
    }

    /* JADX INFO: renamed from: Xc */
    public final /* synthetic */ void m2736Xc(Conversation conversation) {
        xdl0.M(this.f1546W0, false);
    }

    /* JADX INFO: renamed from: Xd */
    public final void m2737Xd(boolean z) {
        if (m2674P9(this.f1645t3) || m2667O9()) {
            this.f1576c4 = this.f1602j2;
            if (!CoreModule.N().Wm() || m2851qa()) {
                return;
            }
            if (m2800ia()) {
                this.f1568a4 = false;
                this.f1597i1.setBackground(act().getResources().getDrawable(x2c0.Eh));
                this.f1601j1.setImageDrawable(act().getResources().getDrawable(x2c0.Lh));
                boolean zM2823ma = m2823ma();
                VLinear vLinear = this.f1651v1;
                if (zM2823ma) {
                    xdl0.M(vLinear, true);
                    m2658Md(true);
                    return;
                } else {
                    if (NullChecker.a(vLinear)) {
                        xdl0.M(this.f1651v1, false);
                    }
                    xdl0.M(this.f1593h1, true);
                    m2658Md(false);
                    return;
                }
            }
            this.f1568a4 = true;
            this.f1597i1.setBackground(act().getResources().getDrawable(x2c0.st));
            this.f1601j1.setImageDrawable(act().getResources().getDrawable(x2c0.l));
            boolean zM2823ma2 = m2823ma();
            VLinear vLinear2 = this.f1651v1;
            if (zM2823ma2) {
                xdl0.M(vLinear2, true);
                m2658Md(true);
            } else {
                if (NullChecker.a(vLinear2)) {
                    xdl0.M(this.f1651v1, false);
                }
                xdl0.M(this.f1593h1, true);
                m2658Md(false);
            }
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo1537Y0() {
        return this.f1540V;
    }

    /* JADX INFO: renamed from: Y8 */
    public final void m2738Y8() {
        if (m2829na() || TextUtils.equals(this.f1645t3, "from_portrait_like_list")) {
            return;
        }
        if (!(NullChecker.a(this.f1457E3) && this.f1457E3.showCountdownSendMsg) && CoreModule.N().Co()) {
            duringCreated(CoreModule.c.r0.C5(this.f1616m3)).subscribe(mkd0.H(new e30() { // from class: l.u4a0
                public final void call(Object obj) {
                    this.f20481a.m2642Ka((GreetingPermission) obj);
                }
            }, new e30() { // from class: l.v4a0
                public final void call(Object obj) {
                    ProfileListFrag.m2504j5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y9 */
    public boolean m2739Y9() {
        if (TextUtils.equals(this.f1645t3, "from_meet_feed")) {
            return true;
        }
        return CoreModule.N().Co() && m2746Z9();
    }

    /* JADX INFO: renamed from: Ya */
    public final /* synthetic */ void m2740Ya(View view) {
        if (m2838oa()) {
            zvf0.r("e_push_profile_like", "p_push_profile");
        }
        zvf0.u("e_likeButton", pageId(), new j760[]{vwb.Y("moments_user_id", this.f1616m3)});
        boolean zM2838oa = m2838oa();
        VFrame_Shadow vFrame_Shadow = this.f1506O0;
        if (zM2838oa) {
            vFrame_Shadow.setClickable(true);
        } else {
            vFrame_Shadow.setClickable(false);
        }
        mo1564j3(SwipeDirection.RIGHT.getValue());
    }

    /* JADX INFO: renamed from: Yb */
    public final /* synthetic */ void m2741Yb(roj0 roj0Var) {
        RiskOtherData riskOtherDataNew_ = RiskOtherData.new_();
        riskOtherDataNew_.limited = false;
        riskOtherDataNew_.type = "test";
        riskOtherDataNew_.text = "近期發佈過疑似廣告信息";
        m2624Hd(riskOtherDataNew_);
        ((bq90) this.f1508O2).m10548k0("为了您的社交体验及财产安全，请先互相了解建立信任后再添加其他平台好友");
    }

    /* JADX INFO: renamed from: Yc */
    public final /* synthetic */ void m2742Yc(int i, View view) {
        if (i == m9268i2().pictures.size()) {
            wn90.F().a.pictures = this.f1602j2.pictures;
        } else {
            wn90.F().a.pictures = vwb.n(m9268i2().pictures, new w9j() { // from class: l.d0a0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m2826md();
    }

    /* JADX INFO: renamed from: Yd */
    public final void m2743Yd() {
        String str;
        Boolean boolValueOf = Boolean.valueOf(!n3b0.m18489t());
        String str2 = this.f1645t3;
        str2.getClass();
        switch (str2) {
            case "home_moment_theme_card":
            case "home_card":
                str = "profile";
                break;
            case "photo_album_feed_from_nearby_falls_feed":
                str = "nearby";
                break;
            case "from_meet_picks_card":
            case "from_meet_picks_feed":
            case "from_new_meet_picks_feed":
            case "from_meet_profile":
            case "from_meet_feed":
                str = "meet";
                break;
            case "liked_users":
                boolValueOf = Boolean.valueOf(!xma.e4());
                str = "ilike";
                break;
            case "photo_album_feed_from_like":
                str = "like";
                break;
            case "photo_album_feed_from_emotion":
                str = "emotion";
                break;
            default:
                str = LiveMessage.LiveMessageType.OTHER;
                break;
        }
        o6j0.c("e_superlikeButton", pageId(), new o6j0.a[]{o6j0.a.h("moments_user_id", this.f1616m3), o6j0.a.i("is_privileged", boolValueOf.booleanValue()), o6j0.a.h("showfrom_superlike", str)});
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Z */
    public void mo2744Z(final int i) {
        this.f1450D2.mo14451a(new d30() { // from class: l.y3a0
            public final void call() {
                this.f22641a.m2685Qc(i);
            }
        });
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Z1 */
    public boolean mo2745Z1() {
        if (!this.f1657w3 && (!CoreModule.Q().a().a() || !this.f1653v3)) {
            if (CoreModule.N().Pm()) {
                return false;
            }
            if (!"photo_album_feed_from_nearby_focus".equals(this.f1645t3) && !"photo_album_feed_from_nearby_falls_feed".equals(this.f1645t3) && !"photo_album_feed_from_like".equals(this.f1645t3) && !"from_recommend_like".equals(this.f1645t3) && !"photo_album_feed_from_emotion".equals(this.f1645t3) && !"from_portrait_like_list".equals(this.f1645t3) && !"form_my_pet".equals(this.f1645t3) && !"chat_group".equals(this.f1645t3) && !"chat_group_anonymity".equals(this.f1645t3) && !"group_notification".equals(this.f1645t3) && !"group_notification_anonymity".equals(this.f1645t3) && !"moment_visitor".equals(this.f1645t3) && !"from_mew_tags".equals(this.f1645t3) && !"from_literature_third".equals(this.f1645t3) && !"photo_album_feed_from_discover_discussion".equals(this.f1645t3) && !"photo_album_feed_from_activity".equals(this.f1645t3) && !"photo_album_feed_viewers".equals(this.f1645t3) && !"photo_album_feed_from_discover_dating".equals(this.f1645t3) && !"photo_album_feed_from_activity_tab_one".equals(this.f1645t3) && !"photo_album_feed_from_activity_tab_two".equals(this.f1645t3) && !"photo_album_feed_from_search_result".equals(this.f1645t3) && !"photo_album_feed_from_poi_aggregation".equals(this.f1645t3)) {
                return false;
            }
        }
        return (this.f1620n3 || this.f1624o3) ? false : true;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Z2 */
    public int mo1540Z2() {
        MediaReorderCards mediaReorderCards = this.f1609k4.f8746v;
        if (!NullChecker.a(mediaReorderCards)) {
            return 0;
        }
        if (mediaReorderCards.m1257h(0).m1240n()) {
            CrashHelper.c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !mediaReorderCards.m1257h(i2).m1240n(); i2++) {
            arrayList.add(mediaReorderCards.m1257h(i2).f798N);
            if (!TEnum.equals(mediaReorderCards.m1257h(i2).f798N.status, "normal")) {
                i++;
            }
        }
        int size = arrayList.size();
        if (!NullChecker.a(wn90.F().a)) {
            CrashHelper.c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
            wn90.F().a = CoreModule.c.e0.p9().clone();
        }
        if (size > 0) {
            wn90.F().a.pictures = arrayList;
        } else if (wn90.F().a.pictures.isEmpty()) {
            wn90.F().a.pictures = this.f1602j2.pictures;
        }
        if (size <= 6) {
            m2483de(size, null, mediaReorderCards);
        }
        return i;
    }

    /* JADX INFO: renamed from: Z9 */
    public boolean m2746Z9() {
        return TextUtils.equals(this.f1645t3, "from_meet_picks_feed") || TextUtils.equals(this.f1645t3, "from_meet_picks_card");
    }

    /* JADX INFO: renamed from: Za */
    public final /* synthetic */ void m2747Za(View view) {
        if (m2838oa()) {
            zvf0.r("e_push_profile_dislike", "p_push_profile");
        }
        zvf0.u("e_dislikeButton", pageId(), new j760[]{vwb.Y("moments_user_id", this.f1616m3)});
        mo1564j3(SwipeDirection.LEFT.getValue());
    }

    /* JADX INFO: renamed from: Zb */
    public final /* synthetic */ void m2748Zb(CoreData coreData) {
        if (NullChecker.a(coreData)) {
            if (NullChecker.a(coreData.userRisk)) {
                m2624Hd(coreData.userRisk);
            }
            if (!NullChecker.a(coreData.descriptionRisk) || TextUtils.isEmpty(coreData.descriptionRisk.text)) {
                return;
            }
            zp90 zp90Var = this.f1508O2;
            if (zp90Var instanceof bq90) {
                ((bq90) zp90Var).m10548k0(coreData.descriptionRisk.text);
            }
        }
    }

    /* JADX INFO: renamed from: Zc */
    public final /* synthetic */ void m2749Zc(Media media, int i) {
        if (media instanceof Video) {
            m2718V8(i).m1150z1((Video) media);
        } else {
            m2718V8(i).m1144w1((Picture) media);
        }
        mo1540Z2();
        if (upa.u2()) {
            for (int i2 = 0; i2 < 6; i2++) {
                m2718V8(i2).m1080E1(i2, "p_edit_profile_view");
            }
        }
    }

    /* JADX INFO: renamed from: Zd */
    public final void m2750Zd(int i) {
        if (i > 0) {
            m2715Ud(i);
        } else {
            m2826md();
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: a0 */
    public boolean mo2751a0() {
        return this.f1547W1;
    }

    /* JADX INFO: renamed from: a9 */
    public boolean m2752a9() {
        return (TEnum.equals(this.f1441B3, "unknown_") && !this.f1633q3 && this.f1641s3) || TEnum.equals(this.f1441B3, "matched");
    }

    /* JADX INFO: renamed from: aa */
    public final boolean m2753aa() {
        return TextUtils.equals(this.f1645t3, "from_recommend_like") || TextUtils.equals(this.f1645t3, "conversation_view") || TextUtils.equals(this.f1645t3, "messages_title") || TextUtils.equals(this.f1645t3, "message_ice_break_dialog") || TextUtils.equals(this.f1645t3, "messages_cover") || TextUtils.equals(this.f1645t3, "messages_friend_comment_toast") || TextUtils.equals(this.f1645t3, "messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: ab */
    public final /* synthetic */ void m2754ab(View view) {
        if (u59.T() && "liked_users".equals(this.f1645t3) && NullChecker.a(CoreModule.c.a1.m(this.f1616m3))) {
            nmn.g(act(), new nmn.a(((DbObject) this.f1602j2).id, ""), "");
        } else {
            if (ogl0.Z()) {
                wge0.f().c(((DbObject) this.f1602j2).id, 1, true, "p_suggest_user_profile_info_view");
            }
            m2803id();
        }
    }

    /* JADX INFO: renamed from: ac */
    public final /* synthetic */ void m2755ac(Bundle bundle) {
        if (this.f1620n3) {
            if (this.f1624o3) {
                act().setTitle(x4(R.string.vj));
            } else {
                act().setTitle(x4(R.string.ei));
            }
        }
        CoreModule.c.e0.u0.put(Boolean.FALSE);
    }

    @Override // p002l.bml
    public /* bridge */ /* synthetic */ Activity act() {
        return super/*com.p1.mobile.android.app.Frag*/.act();
    }

    /* JADX INFO: renamed from: ae */
    public void m2756ae() {
        o6j0.e("e_send_message", "p_suggest_user_profile_info_view", new j760[]{j760.a("is_reply", 0), j760.a("is_match", 1), j760.a("owner_id", ((DbObject) this.f1602j2).id)});
        act().startActivity(MessagesAct.i2(act(), ((DbObject) this.f1602j2).id, true, false));
    }

    /* JADX INFO: renamed from: b9 */
    public final void m2757b9() {
        View viewM3337G0 = this.f1440B2.m3337G0(this.f1440B2.m3352O0());
        if (NullChecker.a(viewM3337G0) && !(viewM3337G0 instanceof PictureView)) {
            this.f1440B2.m3355P1();
        }
        if (w9a0.m().o()) {
            w9a0.m().D(false);
            int iM3360S0 = this.f1440B2.m3360S0() - 1;
            if (iM3360S0 <= 0 || !NullChecker.a(this.f1602j2) || this.f1602j2.pictures.size() <= iM3360S0) {
                return;
            }
            w9a0.m().B(((Media) this.f1602j2.pictures.get(iM3360S0)).url);
        }
    }

    /* JADX INFO: renamed from: ba */
    public boolean m2758ba() {
        return TextUtils.equals(this.f1645t3, "from_new_meet_likers");
    }

    /* JADX INFO: renamed from: bb */
    public final /* synthetic */ void m2759bb(Boolean bool) {
        ft4.b().j(bool.booleanValue());
        mo1575o();
    }

    /* JADX INFO: renamed from: bc */
    public final /* synthetic */ void m2760bc(View view) {
        m2756ae();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: c0 */
    public int mo2761c0() {
        return this.f1440B2.m3349N0();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: c3 */
    public boolean mo2762c3(User user) {
        if (!u59.d0() || !NullChecker.a(user)) {
            return false;
        }
        r4w r4wVar = r4w.INSTANCE;
        if (r4wVar.C(((DbObject) user).id)) {
            return true;
        }
        if (!user.isLoveBuzz()) {
            return false;
        }
        Conversation conversationZp = CoreModule.c.f0.zp(((DbObject) user).id);
        if (r4wVar.o(conversationZp)) {
            return r4wVar.C(((DbObject) user).id);
        }
        if (r4wVar.D(conversationZp)) {
            return false;
        }
        return r4wVar.m(conversationZp);
    }

    /* JADX INFO: renamed from: c9 */
    public final void m2763c9(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: ca */
    public boolean m2764ca() {
        return TextUtils.equals(this.f1645t3, "from_new_meet_picks_feed");
    }

    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ void m2765cb(roj0 roj0Var) {
        m2367C8();
    }

    /* JADX INFO: renamed from: cc */
    public final /* synthetic */ void m2766cc(j760 j760Var) {
        User user = (User) j760Var.a;
        this.f1602j2 = user;
        if (User.isMatched(user) && NullChecker.a(this.f1454E0)) {
            xdl0.M(this.f1454E0, false);
            xdl0.M(this.f1573c1, false);
        }
        xdl0.E0(this.f1577d1, new View.OnClickListener() { // from class: l.qz90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18288a.m2760bc(view);
            }
        });
        m2633J8();
        m2580Ad(false);
    }

    /* JADX INFO: renamed from: ce */
    public void m2767ce() {
        lra0.h("android_back");
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: d1 */
    public int mo2768d1() {
        int i = this.f1527S1;
        this.f1527S1 = -1;
        return i;
    }

    /* JADX INFO: renamed from: d4 */
    public void m2769d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        o660 o660VarD = p660.d();
        this.f1600i4 = o660VarD == null ? "" : o660VarD.c();
        duringCreated(this.f1615m2).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.d3a0
            public final void call(Object obj) {
                this.f9052a.m2765cb((roj0) obj);
            }
        }, new e30() { // from class: l.n3a0
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.o3a0
            public final Object call() {
                return this.f16345a.m2772db();
            }
        }).filter(new w9j() { // from class: l.p3a0
            public final Object call(Object obj) {
                return ProfileListFrag.m2416P5((Boolean) obj);
            }
        }).flatMap(new w9j() { // from class: l.q3a0
            public final Object call(Object obj) {
                return rx.c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.r3a0
            public final void call(Object obj) {
                this.f18348a.m2778eb((Long) obj);
            }
        }, new e30() { // from class: l.t3a0
            public final void call(Object obj) {
                ProfileListFrag.m2544s5((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new C0122e()));
        duringCreated(new v9j() { // from class: l.u3a0
            public final Object call() {
                return this.f20476a.m2784fb();
            }
        }).filter(new w9j() { // from class: l.v3a0
            public final Object call(Object obj) {
                return ProfileListFrag.m2556v5((Boolean) obj);
            }
        }).flatMap(new w9j() { // from class: l.w3a0
            public final Object call(Object obj) {
                return rx.c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.e3a0
            public final void call(Object obj) {
                CoreModule.c.B0.p4(CoreModule.H().userId());
            }
        }));
        creates(new e30() { // from class: l.f3a0
            public final void call(Object obj) {
                ProfileListFrag.m2377F5((Bundle) obj);
            }
        }, new d30() { // from class: l.g3a0
            public final void call() {
                ProfileListFrag.m2464a6();
            }
        });
        creates(new e30() { // from class: l.i3a0
            public final void call(Object obj) {
                this.f12421a.m2790gb((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.j3a0
            public final void call(Object obj) {
                this.f13545a.m2801ib((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.k3a0
            public final void call(Object obj) {
                this.f14184a.m2812kb((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.l3a0
            public final void call(Object obj) {
                this.f14664a.m2817lb((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.m3a0
            public final void call(Object obj) {
                this.f15225a.m2830nb((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public final void m2770d9() {
        if (NullChecker.a(this.f1436A3)) {
            this.f1459F.removeView(this.f1436A3);
            this.f1436A3 = null;
        }
    }

    /* JADX INFO: renamed from: da */
    public boolean m2771da() {
        return TextUtils.equals(this.f1645t3, "from_new_meet_see_feed");
    }

    /* JADX INFO: renamed from: db */
    public final /* synthetic */ rx.c m2772db() {
        return rx.c.just(Boolean.valueOf(!this.f1624o3 && m2752a9()));
    }

    /* JADX INFO: renamed from: dc */
    public final /* synthetic */ void m2773dc(roj0 roj0Var) {
        if (m2838oa()) {
            xdl0.M(this.f1577d1, false);
        }
    }

    /* JADX INFO: renamed from: dd */
    public final boolean m2774dd() {
        return u59.U();
    }

    public boolean disableAutoPV() {
        if ((act() instanceof EditProfileAct) || (act() instanceof ProfileAct_CustomTransition)) {
            return false;
        }
        act();
        return false;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: e2 */
    public void mo2775e2() {
        this.f1440B2.mo14451a(new d30() { // from class: l.o1a0
            public final void call() {
                this.f16331a.m2647La();
            }
        });
    }

    /* JADX INFO: renamed from: e9 */
    public final void m2776e9() {
        if ((!m2401L9() && !"liked_users_anchor".equals(this.f1645t3) && !"from_greet_act".equals(this.f1645t3)) || this.f1633q3 || TextUtils.equals(this.f1616m3, CoreModule.H().userId())) {
            return;
        }
        duringCreated(m2792gd()).subscribe(mkd0.G(new e30() { // from class: l.zy90
            public final void call(Object obj) {
                this.f23668a.m2655Ma((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.N().getMomentsPreviousSub()).subscribe(mkd0.G(new e30() { // from class: l.az90
            public final void call(Object obj) {
                this.f7933a.m2662Na((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ea */
    public boolean m2777ea() {
        return TextUtils.equals(this.f1645t3, "from_picks");
    }

    /* JADX INFO: renamed from: eb */
    public final /* synthetic */ void m2778eb(Long l2) {
        if (mo2672P(this.f1616m3)) {
            return;
        }
        CoreModule.c.e0.W9(this.f1616m3).subscribe(mkd0.H(new e30() { // from class: l.rz90
            public final void call(Object obj) {
                ProfileListFrag.m2392J5((roj0) obj);
            }
        }, new C0121d()));
    }

    /* JADX INFO: renamed from: ec */
    public final /* synthetic */ Boolean m2779ec(String str) {
        return Boolean.valueOf(TextUtils.equals("from_city_center_conv_banner", this.f1645t3));
    }

    /* JADX INFO: renamed from: ed */
    public final boolean m2780ed(String str) {
        if (!u59.U() || TextUtils.equals("likers", str) || TextUtils.equals("from_mew_tags", str) || TextUtils.equals("from_portrait_like_list", str) || TextUtils.equals("from_literature_third", str) || CoreModule.c.m0.L6(this.f1616m3) || CoreModule.c.m0.M6(this.f1616m3) || TextUtils.equals("from_boost_refactor", str) || TextUtils.equals("live_user_card", str) || m2726W9() || m2702T9()) {
            return false;
        }
        return !IntlCountryCodeController.o() || nkp.e();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2781f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        creates(new e30() { // from class: l.v2a0
            public final void call(Object obj) {
                this.f20931a.m2755ac((Bundle) obj);
            }
        });
        duringCreated(CoreModule.N().getMomentLikeChangedSub()).subscribe(mkd0.G(new e30() { // from class: l.x2a0
            public final void call(Object obj) {
                this.f22096a.m2766cc((j760) obj);
            }
        }));
        duringCreated(p.f0).subscribe(mkd0.G(new e30() { // from class: l.y2a0
            public final void call(Object obj) {
                ProfileListFrag.m2491f8((roj0) obj);
            }
        }));
        duringCreated(p.g0).subscribe(mkd0.G(new e30() { // from class: l.z2a0
            public final void call(Object obj) {
                this.f23185a.m2773dc((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.d0.j3()).subscribe(mkd0.B());
        m2804j9();
        duringCreated(CoreModule.c.r0.s0).filter(new w9j() { // from class: l.a3a0
            public final Object call(Object obj) {
                return this.f7357a.m2779ec((String) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.b3a0
            public final void call(Object obj) {
                this.f7972a.m2785fc((String) obj);
            }
        }));
        if (u59.U()) {
            CoreModule.c.P1.R.subscribe(mkd0.G(new e30() { // from class: l.c3a0
                public final void call(Object obj) {
                    this.f8474a.m2791gc((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f9 */
    public final void m2782f9() {
        if ((m2401L9() || "liked_users_anchor".equals(this.f1645t3)) && !this.f1633q3 && !TextUtils.equals(this.f1616m3, CoreModule.H().userId())) {
            xdl0.E0(this.f1577d1, new View.OnClickListener() { // from class: l.hz90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12378a.m2668Oa(view);
                }
            });
            if (TextUtils.equals(this.f1645t3, "from_portrait_like_list")) {
                xdl0.E0(this.f1614m1, new View.OnClickListener() { // from class: l.iz90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13507a.m2675Pa(view);
                    }
                });
                xdl0.E0(this.f1610l1, new View.OnClickListener() { // from class: l.kz90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f14600a.m2683Qa(view);
                    }
                });
            }
            xdl0.E0(this.f1593h1, new View.OnClickListener() { // from class: l.lz90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15185a.m2690Ra(view);
                }
            });
        }
        if (ogl0.a0() && (("home_card".equals(this.f1645t3) || "home_moment_theme_card".equals(this.f1645t3)) && !CoreModule.c.e0.c8() && !CoreModule.c.e0.na().isJailed() && swh0.v0() > 0 && !myc0.d0().j.contains(userId()) && myc0.d0().f0())) {
            this.f1471H0.setText(String.valueOf(swh0.v0()));
            e51.H(act(), new Runnable() { // from class: l.mz90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15751a.m2697Sa();
                }
            }, 1000L);
        }
        VLinear vLinear = this.f1434A1;
        if (vLinear != null && xdl0.O0(vLinear) && com.p1.mobile.putong.core.ui.match.a.w().N()) {
            com.p1.mobile.putong.core.ui.match.a.w().a = true;
            this.f1434A1.post(new Runnable() { // from class: l.nz90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16317a.m2703Ta();
                }
            });
        } else if (zzc0.f0()) {
            if (("home_card".equals(this.f1645t3) || "home_moment_theme_card".equals(this.f1645t3)) && rxg0.j().q(this.f1616m3)) {
                rxg0.j().D(this, this.f1602j2, this.f1460F0, 2000);
            }
        }
    }

    /* JADX INFO: renamed from: fa */
    public boolean m2783fa() {
        return TextUtils.equals(this.f1645t3, "push_like");
    }

    /* JADX INFO: renamed from: fb */
    public final /* synthetic */ rx.c m2784fb() {
        return rx.c.just(Boolean.valueOf(this.f1620n3));
    }

    /* JADX INFO: renamed from: fc */
    public final /* synthetic */ void m2785fc(String str) {
        if (TextUtils.equals(str, this.f1616m3)) {
            m2580Ad(false);
        }
    }

    /* JADX INFO: renamed from: fd */
    public <T> T m2786fd(T t) {
        if (t != null) {
            return t;
        }
        ick0.a();
        return null;
    }

    @Override // p002l.a1m
    public String from() {
        return this.f1645t3;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo1556g3() {
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public void m2787g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        m2879ud();
        m2568x9();
        m2467ad();
        if (NullChecker.a(act().getSupportActionBar())) {
            act().getSupportActionBar().m();
        }
        if (mo1570m0()) {
            m2614G9();
        } else {
            m2822m9();
        }
        m2799i9();
        m2782f9();
        m2776e9();
        m2595D9();
        m2882v9();
        m2640K8();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m2706Td();
        m2737Xd(true);
        m2856r9();
        m2564w9();
        if (m2838oa()) {
            m2584B9();
        }
        if (CoreModule.N().K8()) {
            CoreModule.N().Cr(act(), userId(), new e30() { // from class: l.yy90
                public final void call(Object obj) {
                    this.f23144a.m2797hc((Boolean) obj);
                }
            });
        }
        m2837o9();
        m2620H9();
        if (m2726W9()) {
            m2850q9();
        }
        if (r65.m() && TextUtils.equals("from_greet_act", this.f1645t3)) {
            m2580Ad(false);
        }
        m2590C9();
    }

    /* JADX INFO: renamed from: g9 */
    public void m2788g9() {
        this.f1657w3 = getArguments().getBoolean("canShowFollowButton");
        this.f1484J3 = getArguments().getInt("pic_index", -1);
        this.f1616m3 = getArguments().getString(SysnotifListener.KEY_USER_ID);
        this.f1645t3 = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f1616m3)) {
            CrashHelper.d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f1645t3), 1000);
            act().finish();
            return;
        }
        this.f1620n3 = this.f1616m3.equals(CoreModule.H().userId());
        this.f1624o3 = getArguments().getBoolean("is_edit");
        this.f1629p3 = getArguments().getString("input_type");
        this.f1633q3 = getArguments().getBoolean("show_buttons");
        this.f1641s3 = getArguments().getBoolean("no_showbuttons_infofromlocal", true);
        this.f1446C3 = getArguments().getInt("button_flag", 273);
        this.f1451D3 = getArguments().getBoolean("with_superlike", false) && this.f1633q3;
        this.f1441B3 = RelationshipStatus.get(getArguments().getString("relationship_status"));
        this.f1514P3 = getArguments().getString("gift_msg_id");
        this.f1457E3 = (ProfileCreateData) getArguments().getSerializable("profile_create_data");
        this.f1529S3 = getArguments().getSerializable("city_centre_data");
        if ("live_profile_voice_mask_mode".equals(this.f1645t3)) {
            this.f1637r3 = false;
        } else {
            this.f1637r3 = !this.f1624o3;
        }
        if (TextUtils.equals(this.f1645t3, "liked_users") || m2696S9() || m2777ea() || m2739Y9() || m2746Z9()) {
            if (NullChecker.a(CoreModule.c.Z0.C3(this.f1616m3))) {
                this.f1469G3 = CoreModule.c.Z0.C3(this.f1616m3);
                getArguments().putSerializable("liked_user", this.f1469G3);
            } else if (NullChecker.a(getArguments().getSerializable("liked_user"))) {
                this.f1469G3 = getArguments().getSerializable("liked_user");
            }
        }
        if (u59.f0() && fap.p(this.f1616m3)) {
            this.f1446C3 = 257;
        }
        if (NullChecker.a(CoreModule.K().getUserById(this.f1616m3))) {
            this.f1479I3 = CoreModule.K().getUserById(this.f1616m3);
            getArguments().putSerializable("saved_user", this.f1479I3);
        } else if (NullChecker.a(getArguments().getSerializable("saved_user"))) {
            this.f1479I3 = getArguments().getSerializable("saved_user");
        }
        if (mo2665O1()) {
            CoreBusinessModule.g.b().b = this.f1616m3;
        }
        CoreBusinessModule.g.b().c = this.f1479I3;
        CoreBusinessModule.g.b().d = this.f1479I3;
        CoreBusinessModule.g.b().e = this.f1479I3;
        this.f1649u3 = getArguments().getBoolean("open_media_picker");
        this.f1653v3 = getArguments().getBoolean("from_gp_live");
        if (m9270s() && TextUtils.equals(this.f1645t3, "preview_card")) {
            this.f1612l3 = true;
            this.f1512P1 = getArguments().getSerializable("preview_user_info");
        }
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f1636r2 = (HashMap) serializable;
        }
        this.f1661x3 = getArguments().getInt("pushReason");
        this.f1665y3 = getArguments().getString("pushTag");
        if (this.f1620n3 && m2838oa()) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: ga */
    public final boolean m2789ga() {
        return rlt.a(this.f1645t3);
    }

    /* JADX INFO: renamed from: gb */
    public final /* synthetic */ void m2790gb(Bundle bundle) {
        if (this.f1620n3) {
            if (this.f1624o3) {
                act().setTitle(x4(R.string.vj));
            } else {
                act().setTitle(x4(R.string.ei));
            }
        }
        CoreModule.c.e0.u0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: gc */
    public final /* synthetic */ void m2791gc(roj0 roj0Var) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        m1521N6();
    }

    /* JADX INFO: renamed from: gd */
    public final rx.c<Boolean> m2792gd() {
        return CoreModule.c.f0.Ue(this.f1616m3).map(new w9j() { // from class: l.e0a0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: h2 */
    public View mo2793h2() {
        return this.f1626p0;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo1559h3() {
        duringCreated(CoreModule.c.e0.W9(userId()).flatMap(new w9j() { // from class: l.bz90
            public final Object call(Object obj) {
                return CoreModule.c.s1.s3();
            }
        }).map(new w9j() { // from class: l.cz90
            public final Object call(Object obj) {
                return this.f8998a.m2895xc((List) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.dz90
            public final void call(Object obj) {
                this.f9494a.m2906yc((j760) obj);
            }
        }, new e30() { // from class: l.ez90
            public final void call(Object obj) {
                ProfileListFrag.m2560w5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h9 */
    public final void m2794h9() {
        if (TextUtils.equals(this.f1645t3, "from_auto_scroll_to_question")) {
            e51.I(this, new Runnable() { // from class: l.f2a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10107a.m2712Ua();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: ha */
    public final boolean m2795ha() {
        User user;
        if (this.f1616m3 != null && (user = this.f1602j2) != null && !user.isMe() && !this.f1602j2.isTeamAccount()) {
            Conversation conversationXe = CoreModule.c.f0.Xe(this.f1616m3);
            if ((NullChecker.a(conversationXe) && !TEnum.equals(conversationXe.status, "dismissed")) || User.isMatched(mo1517K2())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hb */
    public final /* synthetic */ Boolean m2796hb() {
        if (this.f1624o3 && this.f1649u3) {
            act().m1203X2(0);
            this.f1649u3 = false;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: hc */
    public final /* synthetic */ void m2797hc(Boolean bool) {
        this.f1564Z3 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: hd */
    public void m2798hd() {
        if (this.f1582e2) {
            lsi0.j("网络不给力，稍后再试吧");
        } else {
            m2695S8(null, null, false);
            zvf0.u("e_likeButton", pageId(), new j760[]{vwb.Y("moments_user_id", this.f1616m3)});
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo1562i3() {
        return this.f1592g4;
    }

    /* JADX INFO: renamed from: i9 */
    public final void m2799i9() {
        m2602E9();
        if (TextUtils.equals("from_city_center_boost_cover", this.f1645t3)) {
            xdl0.M(this.f1536U0, false);
            xdl0.M(this.f1561Z0, false);
            return;
        }
        if (TextUtils.equals("from_city_center_conv_banner", this.f1645t3) && !TextUtils.equals(this.f1616m3, CoreModule.H().userId())) {
            xdl0.M(this.f1536U0, false);
            xdl0.M(this.f1561Z0, true);
            zvf0.x("e_user_info_greet_to_city_cover", pageId());
            xdl0.E0(this.f1569b1, new View.OnClickListener() { // from class: l.a4a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7373a.m2720Va(view);
                }
            });
            return;
        }
        if (this.f1633q3) {
            if (NullChecker.a(this.f1602j2) && CoreModule.c.m0.L6(((DbObject) this.f1602j2).id)) {
                xdl0.E0(this.f1526S0, new View.OnClickListener() { // from class: l.b4a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7978a.m2727Wa(view);
                    }
                });
                xdl0.E0(this.f1531T0, new View.OnClickListener() { // from class: l.c4a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f8479a.m2734Xa(view);
                    }
                });
                return;
            }
            if (("home_card".equals(this.f1645t3) || "home_moment_theme_card".equals(this.f1645t3) || "liked_users".equals(this.f1645t3) || "from_guess_liker_result".equals(this.f1645t3) || m2739Y9() || m2777ea() || m2746Z9() || m2771da() || m2764ca() || m2726W9()) && mo2679Q() && NullChecker.a(this.f1555Y)) {
                m2907z8();
            }
            if (fap.y() && "home_card".equals(this.f1645t3) && NullChecker.a(this.f1555Y)) {
                this.f1454E0.setVisibility(4);
                this.f1476I0.setVisibility(0);
                this.f1460F0 = this.f1481J0;
                this.f1466G0 = this.f1486K0;
                if (u59.f0()) {
                    this.f1496M0.setButtonColorStart(Color.parseColor("#ffa067"));
                    this.f1496M0.setButtonColorEnd(Color.parseColor("#ff3f45"));
                }
            }
            this.f1506O0.setOnClickListener(new View.OnClickListener() { // from class: l.e4a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9569a.m2740Ya(view);
                }
            });
            this.f1560Z.setOnClickListener(new View.OnClickListener() { // from class: l.f4a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10118a.m2747Za(view);
                }
            });
            if ((vdj.c() || nkp.e() || !IntlCountryCodeController.o()) && !"from_guess_liker_result".equals(this.f1645t3)) {
                boolean zM2726W9 = m2726W9();
                VFrame_Shadow vFrame_Shadow = this.f1454E0;
                if (zM2726W9) {
                    vFrame_Shadow.setVisibility(4);
                } else {
                    vFrame_Shadow.setVisibility(0);
                    this.f1454E0.setOnClickListener(new View.OnClickListener() { // from class: l.g4a0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f10769a.m2754ab(view);
                        }
                    });
                    if (ogl0.Z() && mo2665O1()) {
                        this.f1454E0.setOnLongPressListener(new C0118a());
                    }
                }
            } else {
                this.f1454E0.setVisibility(4);
            }
            if (this.f1454E0.getVisibility() == 4) {
                this.f1476I0.setVisibility(8);
            }
            m2576A8(this.f1454E0);
            m2576A8(this.f1560Z);
            m2576A8(this.f1506O0);
        }
    }

    /* JADX INFO: renamed from: ia */
    public boolean m2800ia() {
        if (NullChecker.a(this.f1576c4)) {
            return m2516la(this.f1576c4) || m2409N9(this.f1576c4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ib */
    public final /* synthetic */ void m2801ib(Bundle bundle) {
        m2854qd();
        if (this.f1624o3 && NullChecker.a(bundle)) {
            m2428Rd(CoreModule.K().me_());
            if (NullChecker.a(wn90.F().a)) {
                m2599Dd(wn90.F().a);
                mo1515J3();
            }
        }
        xdl0.b0(act().findViewById(android.R.id.content), new v9j() { // from class: l.py90
            public final Object call() {
                return this.f17720a.m2796hb();
            }
        });
    }

    /* JADX INFO: renamed from: ic */
    public final /* synthetic */ void m2802ic(View view) {
        m2756ae();
    }

    /* JADX INFO: renamed from: id */
    public void m2803id() {
        if (m2838oa()) {
            zvf0.r("e_push_profile_superlike", "p_push_profile");
        }
        if (!CoreModule.N().Co() || !this.f1598i2 || !m2689R9()) {
            m2743Yd();
            mo1564j3(SwipeDirection.UP.getValue());
        } else {
            if (!NullChecker.a(this.f1576c4)) {
                this.f1576c4 = this.f1602j2;
            }
            m2808jd();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM2892x8 = m2892x8(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM2892x8;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo1564j3(final int i) {
        SwipeDirection swipeDirection = SwipeDirection.UP;
        if (i == swipeDirection.getValue() && ezc0.m0() && !ezc0.i0().g0() && swh0.w0(CoreModule.c.o3().superLikeLimit.remainToday()) == 0 && !mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
            C0189c.m3978M1(act(), "p_profile,superlike", Privilege.vip_super_like, null, null, false, this.f1602j2);
            return;
        }
        if (mo2899y2() && NullChecker.a(this.f1440B2.f1875g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f1440B2;
            profileImagesItemHolder.m3365V0(profileImagesItemHolder.f1875g1, false);
        }
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", this.f1440B2.m3349N0());
        if (!NullChecker.a(this.f1602j2)) {
            act().finish();
            return;
        }
        int iM3349N0 = this.f1440B2.m3349N0();
        int size = this.f1602j2.pictures.size();
        User user = this.f1602j2;
        if (iM3349N0 < size) {
            intent.putExtra("currentImageUrl", ((Media) user.pictures.get(this.f1440B2.m3349N0())).url);
        } else {
            intent.putExtra("currentImageUrl", user.hasPic() ? ((Media) this.f1602j2.fp()).url : "");
            CrashHelper.c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        if (m2739Y9() || m2746Z9() || m2764ca() || m2771da() || m2758ba() || m2711U9() || m2702T9() || m2696S9()) {
            intent.putExtra("currentUserId", ((DbObject) this.f1602j2).id);
        }
        if (m2838oa()) {
            if (NullChecker.a(this.f1602j2)) {
                qer.n(act(), this.f1602j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "home", (x9j) null, new e30() { // from class: l.q0a0
                    public final void call(Object obj) {
                        this.f17738a.m2857ra(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.b1a0
                    public final void call(Object obj) {
                        this.f7951a.m2863sa(i, intent, (Throwable) obj);
                    }
                }, pageId(), (LikeExtraData) null, (String) null, (String) null);
                return;
            }
            return;
        }
        if (m2726W9()) {
            if (NullChecker.a(this.f1602j2)) {
                qer.n(act(), this.f1602j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, this.f1645t3, (x9j) null, new e30() { // from class: l.m1a0
                    public final void call(Object obj) {
                        this.f15199a.m2869ta(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.x1a0
                    public final void call(Object obj) {
                        this.f22072a.m2876ua(i, intent, (Throwable) obj);
                    }
                }, pageId(), (LikeExtraData) null, (String) null, (String) null);
            }
        } else if (TextUtils.equals(this.f1645t3, "from_boost_refactor")) {
            if (NullChecker.a(this.f1602j2)) {
                qer.r(act(), this.f1602j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new f30() { // from class: l.y1a0
                    public final void call(Object obj, Object obj2) {
                        this.f22604a.m2893xa((User) obj, (Relationship) obj2);
                    }
                });
            }
        } else if (!TextUtils.equals(this.f1645t3, "from_find_partner")) {
            act().setResult(i, intent);
            act().finish();
        } else if (NullChecker.a(this.f1602j2)) {
            qer.n(act(), this.f1602j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "from_find_partner", (x9j) null, new e30() { // from class: l.z1a0
                public final void call(Object obj) {
                    this.f23175a.m2904ya(i, intent, (Relationship) obj);
                }
            }, new e30() { // from class: l.b2a0
                public final void call(Object obj) {
                    this.f7960a.m2909za(i, intent, (Throwable) obj);
                }
            }, pageId(), (LikeExtraData) null, (String) null, (String) null);
        }
    }

    /* JADX INFO: renamed from: j9 */
    public void m2804j9() {
        if (ft4.b().g()) {
            act().duringCreated(CoreModule.c.U1.S).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.h5a0
                public final void call(Object obj) {
                    this.f11883a.m2759bb((Boolean) obj);
                }
            }, new e30() { // from class: l.i5a0
                public final void call(Object obj) {
                    ProfileListFrag.m2443V6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: ja */
    public boolean m2805ja() {
        Relationship relationship = this.f1576c4.localRelationship;
        return relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(this.f1576c4.localRelationship.state, "default") || TEnum.equals(this.f1576c4.localRelationship.state, "disliked");
    }

    /* JADX INFO: renamed from: jb */
    public final /* synthetic */ Boolean m2806jb() {
        if (this.f1624o3 && !TextUtils.isEmpty(this.f1629p3)) {
            m2763c9(this.f1629p3);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: jc */
    public final /* synthetic */ void m2807jc(Relationship relationship) {
        if (CoreModule.K().sg(((DbObject) this.f1602j2).id) || User.isMatched(this.f1602j2)) {
            xdl0.M(this.f1577d1, true);
            xdl0.E0(this.f1577d1, new View.OnClickListener() { // from class: l.j1a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13524a.m2802ic(view);
                }
            });
            return;
        }
        if (TEnum.equals(relationship.state, "liked")) {
            if (NullChecker.a(relationship.relationshipExtensions) && TEnum.equals(relationship.relationshipExtensions.relationType, "SUPERLIKED")) {
                if (this.f1640s2) {
                    xdl0.M(this.f1536U0, true);
                    m2619H8();
                    return;
                }
                return;
            }
            if (!this.f1640s2) {
                xdl0.M(this.f1454E0, true);
                return;
            } else {
                xdl0.M(this.f1536U0, true);
                m2626I8();
                return;
            }
        }
        if (TEnum.equals(relationship.state, "superliked")) {
            if (this.f1640s2) {
                xdl0.M(this.f1536U0, true);
                m2619H8();
                return;
            }
            return;
        }
        if (TEnum.equals(relationship.state, "disliked") || TEnum.equals(relationship.state, "blocked")) {
            return;
        }
        xdl0.M(this.f1536U0, this.f1640s2);
        xdl0.M(this.f1506O0, true);
        xdl0.M(this.f1560Z, true);
        xdl0.M(this.f1454E0, true);
    }

    /* JADX INFO: renamed from: jd */
    public void m2808jd() {
        if (this.f1574c2) {
            lsi0.j("网络不给力，稍后再试吧");
        } else {
            m2591Ca(null, null);
            m2743Yd();
        }
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: k3 */
    public void mo2809k3() {
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "preEnterAnimStart");
        this.f1584e4 = true;
        this.f1440B2.mo14451a(new d30() { // from class: l.e1a0
            public final void call() {
                this.f9536a.m2853qc();
            }
        });
    }

    /* JADX INFO: renamed from: k9 */
    public final void m2810k9() {
        this.f1604j4.add(this.f1609k4);
        this.f1604j4.add(this.f1613l4);
        this.f1604j4.add(this.f1450D2);
        this.f1604j4.add(this.f1625o4);
        this.f1604j4.add(this.f1617m4);
        this.f1604j4.add(this.f1621n4);
        this.f1604j4.add(this.f1630p4);
        this.f1604j4.add(this.f1634q4);
        this.f1604j4.add(this.f1638r4);
        this.f1604j4.add(this.f1642s4);
        this.f1604j4.add(this.f1646t4);
        this.f1604j4.add(this.f1662x4);
    }

    /* JADX INFO: renamed from: ka */
    public final boolean m2811ka() {
        User user;
        if (TextUtils.isEmpty(this.f1616m3) || (user = this.f1602j2) == null || user.isMe()) {
            return false;
        }
        if (this.f1576c4 == null) {
            this.f1576c4 = CoreModule.N().getUserById(this.f1616m3);
        }
        return CoreModule.N().Ek(this.f1602j2) || CoreModule.N().Ek(this.f1576c4);
    }

    /* JADX INFO: renamed from: kb */
    public final /* synthetic */ void m2812kb(Bundle bundle) {
        xdl0.b0(act().findViewById(android.R.id.content), new v9j() { // from class: l.fz90
            public final Object call() {
                return this.f10695a.m2806jb();
            }
        });
    }

    /* JADX INFO: renamed from: kc */
    public final /* synthetic */ void m2813kc(View view) {
        m2756ae();
    }

    /* JADX INFO: renamed from: kd */
    public void m2814kd(boolean z) {
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: l2 */
    public void mo2815l2(boolean z) {
        this.f1542V1 = z;
    }

    /* JADX INFO: renamed from: l9 */
    public final void m2816l9() {
        xdl0.M0(this.f1545W, true);
        int measuredHeight = this.f1440B2.f1881u.getMeasuredHeight() - t100.d(32.0f);
        this.f1594h2 = measuredHeight;
        this.f1545W.setY(measuredHeight);
        xdl0.E0(this.f1545W, new View.OnClickListener() { // from class: l.ny90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16306a.m2839ob(view);
            }
        });
    }

    /* JADX INFO: renamed from: lb */
    public final /* synthetic */ void m2817lb(Bundle bundle) {
        int i = this.f1484J3;
        if (i >= 0) {
            mo2820m2(i, false);
        }
    }

    /* JADX INFO: renamed from: lc */
    public final /* synthetic */ void m2818lc(List list) {
        if (!vwb.J(list)) {
            vwb.z(list, new e30() { // from class: l.r0a0
                public final void call(Object obj) {
                    this.f18309a.m2807jc((Relationship) obj);
                }
            });
            return;
        }
        if (CoreModule.K().sg(((DbObject) this.f1602j2).id) || User.isMatched(this.f1602j2)) {
            xdl0.M(this.f1577d1, true);
            xdl0.E0(this.f1577d1, new View.OnClickListener() { // from class: l.s0a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18746a.m2813kc(view);
                }
            });
        } else {
            xdl0.M(this.f1536U0, this.f1640s2);
            xdl0.M(this.f1506O0, true);
            xdl0.M(this.f1560Z, true);
            xdl0.M(this.f1454E0, true);
        }
    }

    /* JADX INFO: renamed from: ld */
    public String m2819ld(boolean z) {
        return z ? act().getString(R.string.w2) : act().getString(R.string.x2);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo1570m0() {
        return this.f1624o3;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m2 */
    public void mo2820m2(final int i, final boolean z) {
        this.f1440B2.m14452b(new d30() { // from class: l.oz90
            public final void call() {
                this.f16916a.m2649Lc(i, z);
            }
        });
        this.f1440B2.mo14451a(new d30() { // from class: l.pz90
            public final void call() {
                this.f17728a.m2657Mc(i, z);
            }
        });
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m3 */
    public boolean mo2821m3(User user) {
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m2822m9() {
        m2428Rd(CoreModule.K().getUserById(this.f1616m3));
        this.f1540V.addOnScrollListener(new C0119b());
        if (!this.f1633q3) {
            xdl0.p0(this.f1555Y);
            xdl0.p0(this.f1521R0);
            xdl0.M(this.f1550X, false);
            this.f1521R0 = null;
            this.f1555Y = null;
            this.f1506O0 = null;
            this.f1454E0 = null;
            this.f1560Z = null;
            return;
        }
        if ((this.f1446C3 & 1) != 1) {
            xdl0.M0(this.f1506O0, false);
        }
        if ((this.f1446C3 & 256) != 256) {
            xdl0.M0(this.f1560Z, false);
        }
        if ((this.f1446C3 & 16) != 16) {
            xdl0.M0(this.f1454E0, false);
        }
        if (this.f1454E0.getVisibility() == 4) {
            this.f1476I0.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ma */
    public final boolean m2823ma() {
        if (CoreModule.N().so()) {
            return (m2674P9(this.f1645t3) || m2667O9()) && u59.U() && !m2800ia() && this.f1651v1 != null;
        }
        return false;
    }

    /* JADX INFO: renamed from: mb */
    public final /* synthetic */ void m2824mb(c cVar) {
        if (cVar != c.o || this.f1624o3) {
            return;
        }
        m2757b9();
    }

    /* JADX INFO: renamed from: mc */
    public final /* synthetic */ Boolean m2825mc(String str) {
        return Boolean.valueOf(TextUtils.equals(str, userId()));
    }

    /* JADX INFO: renamed from: md */
    public final void m2826md() {
        if (vwb.J(wn90.F().a.pictures)) {
            b4().F("你的个人资料页需要至少一张照片").t0(R.string.Q, new Runnable() { // from class: l.h4a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11868a.m1521N6();
                }
            }).k0(R.string.c).z0();
            return;
        }
        final User userM2661N8 = m2661N8();
        User userM2666O8 = m2666O8();
        boolean z = true;
        if (NullChecker.a(userM2661N8) && NullChecker.a(userM2666O8) && userM2661N8.equals(userM2666O8)) {
            this.f1442B4 = true;
        }
        final User userClone = wn90.F().a.clone();
        final User userClone2 = this.f1602j2.clone();
        if (h7n.c()) {
            ArrayList<String> arrayList = new ArrayList();
            if (NullChecker.a(userM2661N8) && NullChecker.a(userM2661N8.profile) && NullChecker.a(userM2661N8.profile.extensions) && NullChecker.a(userM2661N8.profile.extensions.basic) && !TextUtils.isEmpty(userM2661N8.description)) {
                arrayList.add("about_me");
            }
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str);
                z = false;
            }
            o6j0.c("e_profile_save_button", pageId(), new o6j0.a[]{o6j0.a.h("edit_profile_content_modified", sb.toString())});
        }
        if (!NullChecker.a(userM2661N8)) {
            m1521N6();
            return;
        }
        o4(R.string.J5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userClone;
        if (NullChecker.a(userM2661N8.profile) && NullChecker.a(userM2661N8.profile.extensions)) {
            userM2661N8.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (upa.e2() && NullChecker.a(userM2661N8) && NullChecker.a(userM2661N8.profile) && NullChecker.a(userM2661N8.profile.extensions) && NullChecker.a(userM2661N8.profile.extensions.basic) && !vwb.J(userM2661N8.profile.extensions.basic.friendPurpose)) ? TEnum.equals((Purpose) userM2661N8.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated(CoreModule.c.B0.t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.i4a0
            public final Object call(Object obj) {
                return ProfileListFrag.m2466a8((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.j4a0
            public final Object call(Object obj) {
                return this.f13549a.m2859rc(userM2661N8, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.K(new e30() { // from class: l.k4a0
            public final void call(Object obj) {
                this.f14190a.m2865sc(zEquals, userClone, userClone2, userM2661N8, (roj0) obj);
            }
        }, new e30() { // from class: l.l4a0
            public final void call(Object obj) {
                this.f14668a.m2878uc(userClone2, userM2661N8, (Throwable) obj);
            }
        }, false));
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: me */
    public User mo2827me() {
        if (this.f1607k2 == null) {
            m2410Nd(CoreModule.K().me_());
        }
        return this.f1607k2;
    }

    /* JADX INFO: renamed from: n4 */
    public void m2828n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m2788g9();
        m2525n9();
        m2886vd();
        if ("my_tab_profile_like".equals(this.f1645t3)) {
            ((PutongFrag) this).pageHelper.q(pageId());
        } else {
            m2671Od();
        }
        if (this.f1612l3) {
            if (this.f1512P1 == null) {
                act().finish();
                return;
            } else {
                m2611Fd();
                return;
            }
        }
        if (!mo2672P(this.f1616m3) && qp8.b()) {
            if ("home_card".equals(this.f1645t3) && cp60.INSTANCE.m11260q(CoreModule.K().getUserById(this.f1616m3))) {
                this.f1615m2.onNext(roj0.a);
                return;
            }
            CoreModule.c.e0.W9(this.f1616m3);
        }
        m2359A9();
        p420.t(act());
        m2534p9();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m2794h9();
    }

    /* JADX INFO: renamed from: na */
    public final boolean m2829na() {
        if (!NullChecker.a(this.f1602j2) || this.f1602j2.isMe() || User.isMatched(this.f1602j2)) {
            return false;
        }
        return (!CoreModule.K().sg(((DbObject) this.f1602j2).id) || this.f1633q3) && m2780ed(this.f1645t3);
    }

    /* JADX INFO: renamed from: nb */
    public final /* synthetic */ void m2830nb(Bundle bundle) {
        act().lifecycle().subscribe(mkd0.G(new e30() { // from class: l.r4a0
            public final void call(Object obj) {
                this.f18359a.m2824mb((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nc */
    public final /* synthetic */ void m2831nc(Bundle bundle) {
        if (this.f1620n3 && f1432I4 == null) {
            e51.y(new Runnable() { // from class: l.xy90
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFrag.m2360B5();
                }
            });
        }
        CoreModule.c.d0.R.k().first().subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: nd */
    public void m2832nd() {
        if ("from_see_blind_box".equals(this.f1645t3)) {
            mo1564j3(0);
        }
        m1521N6();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: o */
    public void mo1575o() {
        if (!this.f1624o3) {
            if (m2838oa()) {
                zvf0.r("e_push_profile_quit", "p_push_profile");
            }
            if (NullChecker.a(this.f1562Z1) && this.f1562Z1.f()) {
                this.f1562Z1.d();
                this.f1562Z1 = null;
                return;
            } else if (!NullChecker.a(this.f1566a2) || !this.f1566a2.d()) {
                m1521N6();
                return;
            } else {
                this.f1566a2.c();
                this.f1566a2 = null;
                return;
            }
        }
        if (NullChecker.a(wn90.F().a)) {
            boolean zEquals = TextUtils.equals(m9268i2().description, this.f1607k2.description);
            String str = "about_me_pop_ups";
            if (!TextUtils.equals(this.f1645t3, "about_me_pop_ups")) {
                str = "about_me_banner";
                if (!TextUtils.equals(this.f1645t3, "about_me_banner")) {
                    str = "edit_data_button";
                    if (!TextUtils.equals(this.f1645t3, "edit_data_button")) {
                        str = "edit_home_page";
                        if (!TextUtils.equals(this.f1645t3, "edit_home_page")) {
                            str = LiveMessage.LiveMessageType.OTHER;
                        }
                    }
                }
            }
            o6j0.c("e_edit_personal_profile_finish", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("about_me_is_modified", zEquals ? "no" : "yes"), o6j0.a.h("previous_page", str)});
        }
        if (!NullChecker.a(wn90.F().a) || !NullChecker.a(this.f1602j2)) {
            m1521N6();
            return;
        }
        if (this.f1654v4.m11332V()) {
            m9268i2().profile.extensions.momentSwitch.noSyncMoment.clear();
            m9268i2().profile.extensions.momentSwitch.noSyncMoment.add(0, this.f1654v4.m11331U() ? "false" : "true");
        }
        int iMo1540Z2 = mo1540Z2();
        if (m9268i2().equals(this.f1602j2)) {
            m1521N6();
        } else {
            m2750Zd(iMo1540Z2);
        }
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public View mo2833o0() {
        return this.f1506O0;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: o1 */
    public boolean mo2834o1() {
        return this.f1537U1;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: o2 */
    public void mo2835o2() {
        this.f1584e4 = false;
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "onEnterAnimEnd");
        a<roj0> aVar = this.f1580d4;
        roj0 roj0Var = roj0.a;
        aVar.onNext(roj0Var);
        this.f1440B2.mo14451a(new d30() { // from class: l.k1a0
            public final void call() {
                this.f14166a.m2846pc();
            }
        });
        if (this.f1611l2) {
            this.f1615m2.onNext(roj0Var);
        }
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: o3 */
    public View mo2836o3() {
        return this.f1440B2.f1826E0;
    }

    /* JADX INFO: renamed from: o9 */
    public final void m2837o9() {
        Conversation conversationZp = CoreModule.c.f0.zp(this.f1616m3);
        if (NullChecker.a(conversationZp) && TEnum.equals(conversationZp.status, "default")) {
            if (NullChecker.a(this.f1536U0)) {
                xdl0.M(this.f1536U0, false);
            }
            if (NullChecker.a(this.f1606k1)) {
                xdl0.M(this.f1606k1, false);
            }
        }
        if (m2641K9()) {
            this.f1576c4 = CoreModule.N().getUserById(this.f1616m3);
            if (NullChecker.a(this.f1593h1)) {
                xdl0.M(this.f1593h1, false);
            }
            if (NullChecker.a(this.f1573c1)) {
                xdl0.M(this.f1573c1, false);
            }
            if (m2829na() && m2774dd()) {
                if (NullChecker.a(this.f1536U0)) {
                    xdl0.M(this.f1536U0, true);
                }
                if (NullChecker.a(this.f1605k0)) {
                    xdl0.M(this.f1605k0, false);
                }
                if (NullChecker.a(this.f1651v1)) {
                    xdl0.M(this.f1651v1, true);
                }
                if (NullChecker.a(this.f1434A1)) {
                    xdl0.M(this.f1434A1, false);
                    return;
                }
                return;
            }
            if (NullChecker.a(this.f1555Y)) {
                xdl0.M(this.f1555Y, false);
            }
            if (NullChecker.a(this.f1606k1)) {
                xdl0.M(this.f1606k1, true);
            }
            if (NullChecker.a(this.f1610l1)) {
                xdl0.M(this.f1610l1, true);
                xdl0.E0(this.f1610l1, new View.OnClickListener() { // from class: l.sz90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f19342a.m2845pb(view);
                    }
                });
            }
            if (NullChecker.a(this.f1614m1)) {
                xdl0.M(this.f1614m1, true);
                xdl0.E0(this.f1614m1, new View.OnClickListener() { // from class: l.tz90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f20435a.m2852qb(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: oa */
    public boolean m2838oa() {
        return false;
    }

    /* JADX INFO: renamed from: ob */
    public final /* synthetic */ void m2839ob(View view) {
        lra0.h("button");
        mo1575o();
    }

    /* JADX INFO: renamed from: oc */
    public final /* synthetic */ void m2840oc(MenuItem menuItem, View view) {
        startActivity(ProfileAct.m1176p2(act() == null ? menuItem.getActionView().getContext() : act(), this.f1616m3, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: od */
    public View.OnClickListener m2841od(User user) {
        return new View.OnClickListener() { // from class: l.gz90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11703a.m2885vc(view);
            }
        };
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ark.L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            wn90.F().a.description = vwb.k(stringExtra).trim();
            mo1504E();
            m2385Gd(wn90.F().a);
            return;
        }
        if (2 == i && NullChecker.a(intent)) {
            String stringExtra2 = intent.getStringExtra("intl_friend_purpose");
            ArrayList arrayList = new ArrayList();
            arrayList.add(stringExtra2);
            wn90.F().a.profile.extensions.basic.intlFriendPurpose = arrayList;
            wn90.F().a.profile.extensions.basic.intlFriendPurposeV2 = arrayList;
            mo1504E();
            m2385Gd(wn90.F().a);
            return;
        }
        if (NullChecker.a(intent) && i2 == -1 && LoopFragmentFactory.m1952N(i, wn90.F().a, intent)) {
            mo1504E();
            m2385Gd(wn90.F().a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                this.f1630p4.m23051R0();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.a(intent)) {
            if (NullChecker.a(wn90.F().a)) {
                LoopFragmentFactory.m1971j(act());
                if (upa.u2()) {
                    m2363Bd(wn90.F().a.pictures);
                }
                mo1504E();
                m2385Gd(wn90.F().a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo1504E();
            m2385Gd(wn90.F().a);
        } else if (i == 3003) {
            mo1515J3();
        } else {
            super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (getActivity() instanceof NewUI1ContainerActivity) {
            menuInflater.inflate(h7c0.f, menu);
            final MenuItem menuItemFindItem = menu.findItem(u4c0.i8);
            menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.e2a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9551a.m2840oc(menuItemFindItem, view);
                }
            });
            CoreBusinessModule.m0().e(menuItemFindItem);
            if (this.f1612l3) {
                menuItemFindItem.setVisible(false);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
        Animator animator = this.f1623o2;
        if (animator != null && animator.isRunning()) {
            this.f1623o2.end();
            this.f1623o2 = null;
        }
        com.p1.mobile.putong.core.ui.match.a.w().a = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
        if (NullChecker.a(wn90.F().a)) {
            mo1540Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo1577p() {
        return this.f1459F;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: p1 */
    public void mo2842p1(boolean z) {
        this.f1532T1 = z;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p2 */
    public boolean mo2843p2() {
        return this.f1451D3;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo1578p3(final int i, final Media media) {
        this.f1609k4.mo14451a(new d30() { // from class: l.jz90
            public final void call() {
                this.f14148a.m2749Zc(media, i);
            }
        });
    }

    /* JADX INFO: renamed from: pa */
    public boolean m2844pa(User user) {
        Settings settings;
        List list;
        if (qp8.b() && user != null && (settings = user.settings) != null && (list = settings.settingGroups) != null && !list.isEmpty() && user.settings.settingGroups.get(0) != null && ((SettingGroups) user.settings.settingGroups.get(0)).live != null && !((SettingGroups) user.settings.settingGroups.get(0)).live.hideProfileWealthTag.booleanValue()) {
            UserWealthGradeConfig userWealthGradeConfigGj = CoreModule.Q().Gj(((SettingGroups) user.settings.settingGroups.get(0)).live.wealthGrade, false);
            if (userWealthGradeConfigGj.openNewIcon && !TextUtils.isEmpty(userWealthGradeConfigGj.wealthIconUrl)) {
                return true;
            }
        }
        return false;
    }

    @Override // p002l.a1m
    public String pageId() {
        if ("my_tab_profile_like".equals(this.f1645t3)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f1645t3)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f1645t3)) {
            return "p_christmas_profile";
        }
        if (NullChecker.a(this.f1457E3) && this.f1457E3.showCountdownSendMsg) {
            return "p_new_profile";
        }
        if (TextUtils.isEmpty(this.f1616m3) || !mo2672P(this.f1616m3)) {
            return getArguments().getBoolean("is_edit") ? "p_edit_profile_view" : "p_suggest_user_profile_info_view";
        }
        return "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: pb */
    public final /* synthetic */ void m2845pb(View view) {
        m2808jd();
    }

    /* JADX INFO: renamed from: pc */
    public final /* synthetic */ void m2846pc() {
        this.f1440B2.m3391y1();
    }

    /* JADX INFO: renamed from: pd */
    public void m2847pd(User user) {
        if (this.f1607k2.isPicVerificationVerified()) {
            CoreDlg.r1(act());
            return;
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            CoreDlg.G1(act(), act().string(R.string.yr), act().string(R.string.Tr), x2c0.u8, act().string(R.string.Sr), (d30) null, false, (String) null, (d30) null, (d30) null, (User) null, true, false, (String) null, (d30) null, !this.f1620n3);
            return;
        }
        tvf.n();
        final cwf0 cwf0VarC = i0e.c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        i0e.f(cwf0VarC);
        CoreDlg.G1(act(), act().string(R.string.yr), act().string(R.string.Tr), x2c0.u8, act().string(R.string.Rr), new d30() { // from class: l.n0a0
            public final void call() {
                this.f15766a.m2890wc();
            }
        }, true, act().string(R.string.Qr), new d30() { // from class: l.o0a0
            public final void call() {
                zvf0.r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new d30() { // from class: l.p0a0
            public final void call() {
                i0e.e(cwf0VarC);
            }
        }, (User) null, true, false, (String) null, (d30) null, !this.f1620n3);
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: q2 */
    public View mo2848q2() {
        return this.f1550X;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: q3 */
    public boolean mo2849q3() {
        return this.f1439B1;
    }

    /* JADX INFO: renamed from: q9 */
    public final void m2850q9() {
        if (NullChecker.a(this.f1555Y)) {
            xdl0.M(this.f1555Y, false);
        }
        if (NullChecker.a(this.f1536U0)) {
            xdl0.M(this.f1536U0, false);
        }
        if (NullChecker.a(this.f1506O0)) {
            xdl0.M(this.f1506O0, false);
        }
        if (NullChecker.a(this.f1560Z)) {
            xdl0.M(this.f1560Z, false);
        }
        if (NullChecker.a(this.f1651v1)) {
            xdl0.M(this.f1651v1, false);
        }
        if (NullChecker.a(this.f1593h1)) {
            xdl0.M(this.f1593h1, false);
        }
        if (NullChecker.a(this.f1573c1)) {
            xdl0.M(this.f1573c1, false);
        }
    }

    /* JADX INFO: renamed from: qa */
    public boolean m2851qa() {
        if (this.f1574c2 || this.f1578d2) {
            return true;
        }
        if (!NullChecker.a(this.f1576c4.localRelationship)) {
            return false;
        }
        if (vwb.J(this.f1576c4.localRelationship.status) || !this.f1576c4.localRelationship.status.contains(MatchFrom.get("superLiked"))) {
            return NullChecker.a(this.f1576c4.localRelationship.relationshipExtensions) && TEnum.equals(this.f1576c4.localRelationship.relationshipExtensions.relationType, "SUPERLIKED");
        }
        return true;
    }

    /* JADX INFO: renamed from: qb */
    public final /* synthetic */ void m2852qb(View view) {
        m2798hd();
    }

    /* JADX INFO: renamed from: qc */
    public final /* synthetic */ void m2853qc() {
        this.f1440B2.m3392z1();
    }

    /* JADX INFO: renamed from: qd */
    public final void m2854qd() {
        if (this.f1620n3 || !m2752a9()) {
            return;
        }
        User userById = CoreModule.K().getUserById(this.f1616m3);
        if (!NullChecker.a(userById) || userById.unilateralBlock() || mo2672P(this.f1616m3) || mo2762c3(userById)) {
            return;
        }
        CoreModule.N().coreMomentPrevious(this.f1616m3);
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: r3 */
    public PictureView mo2855r3(int i) {
        PictureView pictureViewM3337G0 = this.f1440B2.m3337G0(i);
        if (pictureViewM3337G0 instanceof PictureView) {
            return pictureViewM3337G0;
        }
        if (this.f1440B2.m3337G0(0) instanceof PictureView) {
            return this.f1440B2.m3337G0(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: r9 */
    public final void m2856r9() {
        if (m2764ca() || m2771da()) {
            xdl0.M(this.f1506O0, false);
            xdl0.M(this.f1560Z, false);
            if (this.f1640s2) {
                m2626I8();
            }
        }
    }

    /* JADX INFO: renamed from: ra */
    public final /* synthetic */ void m2857ra(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: rb */
    public final /* synthetic */ rx.c m2858rb() {
        return mkd0.s(this.f1620n3 ? CoreModule.c.B0.j4().distinctUntilChanged() : rx.c.just((Object) null), CoreModule.c.e0.Ka(this.f1616m3), CoreModule.c.e0.o9(), new f5a0());
    }

    /* JADX INFO: renamed from: rc */
    public final /* synthetic */ rx.c m2859rc(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.c.e0.E9(user);
        }
        wn90.F().a.description = profileEditInfo.user.description;
        wn90.F().a.profile = profileEditInfo.user.profile;
        User user2 = wn90.F().a;
        User user3 = profileEditInfo.user;
        user2.name = user3.name;
        if (TextUtils.isEmpty(((Media) user3.pictures.get(0)).url)) {
            m2605Ed(wn90.F().a, true);
            xdl0.M(this.f1609k4.f8747w, false);
        } else {
            xdl0.M(this.f1609k4.f8747w, true);
            wn90.F().a.pictures = profileEditInfo.user.pictures;
            m2605Ed(wn90.F().a, false);
        }
        throw new ProfileEditInfoException();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: s1 */
    public boolean mo2860s1() {
        return this.f1633q3;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: s2 */
    public LikedUser mo2861s2() {
        return this.f1469G3;
    }

    /* JADX INFO: renamed from: s9 */
    public final void m2862s9() {
        this.f1604j4.add(this.f1440B2);
        if (TextUtils.equals(this.f1616m3, CoreModule.H().userId())) {
            this.f1604j4.add(this.f1445C2);
        }
        if (m2838oa()) {
            this.f1604j4.add(this.f1563Z2);
        }
        this.f1604j4.add(this.f1567a3);
        this.f1604j4.add(this.f1450D2);
        this.f1604j4.add(this.f1591g3);
        this.f1604j4.add(this.f1575c3);
        this.f1604j4.add(this.f1579d3);
        this.f1604j4.add(this.f1583e3);
        this.f1604j4.add(this.f1456E2);
        if (qib0.b0.c.Om()) {
            this.f1604j4.add(this.f1543V2);
        }
        this.f1604j4.add(this.f1587f3);
        if (!m2726W9()) {
            this.f1604j4.add(this.f1462F2);
            this.f1462F2.m9952u0(this.f1645t3);
        }
        this.f1604j4.add(this.f1571b3);
        this.f1604j4.add(this.f1468G2);
        this.f1604j4.add(this.f1595h3);
        this.f1604j4.add(this.f1473H2);
        this.f1604j4.add(this.f1483J2);
        this.f1604j4.add(this.f1478I2);
        this.f1604j4.add(this.f1508O2);
        this.f1604j4.add(this.f1513P2);
        this.f1604j4.add(this.f1518Q2);
        this.f1604j4.add(this.f1523R2);
        this.f1604j4.add(this.f1528S2);
        this.f1604j4.add(this.f1533T2);
        this.f1604j4.add(this.f1538U2);
        if (!TextUtils.isEmpty(this.f1645t3) && (TextUtils.equals("home_card", this.f1645t3) || TextUtils.equals("share_profile", this.f1645t3) || TextUtils.equals("home_moment_theme_card", this.f1645t3))) {
            mo1523P1();
        }
        if (!"-11005".equals(this.f1616m3) && !"from_guess_liker_result".equals(this.f1645t3)) {
            this.f1604j4.add(this.f1553X2);
        }
        if (!mo1523P1()) {
            this.f1604j4.add(new l33(this, this));
        }
        this.f1604j4.add(this.f1662x4);
        this.f1604j4.add(this.f1662x4);
    }

    /* JADX INFO: renamed from: sa */
    public final /* synthetic */ void m2863sa(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: sb */
    public final /* synthetic */ void m2864sb(xaj0 xaj0Var) {
        m2428Rd((User) xaj0Var.b);
        m2410Nd((User) xaj0Var.c);
        m2872td();
        mo1515J3();
    }

    /* JADX INFO: renamed from: sc */
    public final /* synthetic */ void m2865sc(boolean z, User user, User user2, User user3, roj0 roj0Var) {
        if (z) {
            CoreModule.c.e0.g4.onNext("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            zvf0.D("e_upload_photos_success", pageId(), new j760[]{vwb.Y("upload_page_name", "edit_profile_page"), vwb.Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size()))});
        }
        if (this.f1437A4) {
            m2473be();
            this.f1437A4 = false;
        }
        m1521N6();
        if (NullChecker.a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.c.e0.H7();
            HashMap map = new HashMap();
            map.put("Number of photos changed", Integer.valueOf(user3.pictures.size() - user2.pictures.size()));
            w85.INSTANCE.m("Edited Profile", map);
        }
        if (this.f1442B4) {
            return;
        }
        wn90.F().d.onNext(Integer.valueOf((NullChecker.a(this.f1602j2) && this.f1602j2.status.contains(UserStatus.get("audit"))) ? gd70.f11375d : gd70.f11376e));
    }

    /* JADX INFO: renamed from: sd */
    public final void m2866sd(boolean z) {
        if (NullChecker.a(this.f1440B2.f1831H) && NullChecker.a(this.f1440B2.f1837K) && NullChecker.a(this.f1440B2.f1839L) && this.f1440B2.m14463u().isAttachedToWindow()) {
            if (!m2844pa(this.f1602j2) || NullChecker.a(this.f1440B2.f1835J)) {
                this.f1440B2.m3390x1(z);
            }
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: t1 */
    public void mo2867t1() {
        if (mo2745Z1()) {
            this.f1450D2.mo14451a(new d30() { // from class: l.t0a0
                public final void call() {
                    this.f19349a.m2604Ec();
                }
            });
        }
    }

    /* JADX INFO: renamed from: t9 */
    public final void m2868t9() {
        epa0 epa0Var = new epa0();
        int visibility = m2682Q9() & (this.f1633q3 ^ true) ? 8 : this.f1555Y.getVisibility();
        xdl0.p0(this.f1555Y);
        xdl0.p0(this.f1593h1);
        epa0Var.m12649e(this.f1536U0);
        this.f1555Y = epa0Var.f9904c;
        this.f1605k0 = epa0Var.f9908g;
        this.f1560Z = epa0Var.f9907f;
        this.f1506O0 = epa0Var.f9913l;
        this.f1511P0 = epa0Var.f9914m;
        this.f1460F0 = epa0Var.f9910i;
        this.f1454E0 = epa0Var.f9909h;
        this.f1626p0 = epa0Var.f9905d;
        this.f1466G0 = epa0Var.f9911j;
        this.f1471H0 = epa0Var.f9912k;
        this.f1536U0.setVisibility(visibility);
        this.f1555Y.setVisibility(visibility);
        this.f1550X.setVisibility(visibility);
        this.f1593h1 = epa0Var.f9918q;
        this.f1651v1 = epa0Var.f9915n;
        this.f1655w1 = epa0Var.f9916o;
        VLinear vLinear = epa0Var.f9917p;
        this.f1659x1 = vLinear;
        this.f1663y1 = epa0Var.f9919r;
        this.f1668z1 = epa0Var.f9920s;
        this.f1434A1 = epa0Var.f9922u;
        xdl0.E0(vLinear, new View.OnClickListener() { // from class: l.a0a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7329a.m2870tb(view);
            }
        });
        xdl0.E0(this.f1655w1, new View.OnClickListener() { // from class: l.b0a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7940a.m2877ub(view);
            }
        });
        epa0Var.m12650f(act(), this.f1602j2, this.f1645t3, new d30() { // from class: l.c0a0
            public final void call() {
                this.f8435a.m2884vb();
            }
        });
        if (TextUtils.equals("home_card", this.f1645t3) && NullChecker.a(this.f1602j2) && CoreModule.c.m0.L6(((DbObject) this.f1602j2).id)) {
            xdl0.M(this.f1555Y, false);
            xdl0.M(this.f1521R0, true);
        }
        m2686Qd();
    }

    /* JADX INFO: renamed from: ta */
    public final /* synthetic */ void m2869ta(int i, Intent intent, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "liked") && !TEnum.equals(relationship.state, "matched") && !TEnum.equals(relationship.state, "superliked")) {
            act().setResult(i, intent);
            act().finish();
            return;
        }
        if (NullChecker.a(this.f1560Z)) {
            xdl0.M(this.f1560Z, false);
        }
        if (NullChecker.a(this.f1506O0)) {
            xdl0.M(this.f1506O0, false);
        }
        if (!TEnum.equals(relationship.state, "superliked") && !relationship.status.contains(MatchFrom.get("superLiked")) && i != SwipeDirection.UP.getValue()) {
            lsi0.y("喜欢已发送");
        } else if (NullChecker.a(this.f1454E0)) {
            xdl0.M(this.f1454E0, false);
        }
    }

    /* JADX INFO: renamed from: tb */
    public final /* synthetic */ void m2870tb(View view) {
        m2798hd();
    }

    /* JADX INFO: renamed from: td */
    public final void m2872td() {
        m2638Jd();
        if (mo1501D2()) {
            return;
        }
        if (this.f1587f3.mo10392S()) {
            this.f1587f3.m25904V(true);
            return;
        }
        if (this.f1579d3.mo10392S()) {
            this.f1579d3.m25904V(true);
            return;
        }
        if (this.f1575c3.mo10392S()) {
            this.f1575c3.m25904V(true);
        } else if (this.f1591g3.mo10392S()) {
            this.f1591g3.m25904V(true);
        } else if (this.f1583e3.mo10392S()) {
            this.f1583e3.m25904V(true);
        }
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: u2 */
    public VPager_SquaredRefactor mo2873u2() {
        return this.f1440B2.f1884x;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: u3 */
    public void mo2874u3(int i) {
        this.f1522R1 = i;
    }

    /* JADX INFO: renamed from: u9 */
    public final void m2875u9() {
        if (!CoreModule.c.e0.na().status.contains(UserStatus.get("audit")) && !CertificationUtil.l() && jjb0.b()) {
            xdl0.M(this.f1480J, false);
            return;
        }
        PicCertGuideView picCertGuideView = this.f1660x2;
        if (picCertGuideView != null) {
            xdl0.M(picCertGuideView, false);
        }
    }

    /* JADX INFO: renamed from: ua */
    public final /* synthetic */ void m2876ua(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: ub */
    public final /* synthetic */ void m2877ub(View view) {
        m2808jd();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX INFO: renamed from: uc */
    public final /* synthetic */ void m2878uc(User user, User user2, Throwable th) {
        boolean z;
        if (yij0.H(th)) {
            s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            s4();
            osi0.f(R.string.K7);
            return;
        }
        if (NullChecker.a(act())) {
            s4();
            if (th instanceof TantanException.Client.TantanForbidden) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (!tantanForbidden.isCannotModify() || TextUtils.isEmpty(tantanForbidden.message)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            CrashHelper.c(new Throwable("from:" + this.f1645t3 + th.toString()));
            if (z) {
                String string = act().getString(R.string.Fk);
                double dDoubleValue = (NullChecker.a(user.settings) && NullChecker.a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : 0.0d;
                if (NullChecker.a(user2.settings) && NullChecker.a(user2.settings.birthdate)) {
                    dDoubleValue = user2.settings.birthdate.doubleValue();
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis((long) dDoubleValue);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(qib0.H.guessedCurrentServerTime());
                int iT = l9b.T(calendar, calendar2);
                if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iT > 120) {
                    string = act().getString(R.string.T3);
                } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                    string = act().getString(R.string.U3);
                } else if (iT > 120) {
                    string = act().getString(R.string.V3);
                }
                b4().F(string).t0(R.string.Q, new Runnable() { // from class: l.h0a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11710a.m2871tc();
                    }
                }).k0(R.string.c).z0();
            }
        }
    }

    /* JADX INFO: renamed from: ud */
    public final void m2879ud() {
        if (m2789ga()) {
            this.f1459F.getViewTreeObserver().addOnGlobalLayoutListener(this.f1559Y3);
        }
    }

    @Override // p002l.c5m
    public String userId() {
        return this.f1616m3;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: v1 */
    public boolean mo2880v1() {
        return this.f1532T1;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: v2 */
    public boolean mo2881v2() {
        if (upa.V1()) {
            return TextUtils.equals(this.f1645t3, "chat_group_anonymity") || TextUtils.equals(this.f1645t3, "group_notification_anonymity");
        }
        return false;
    }

    /* JADX INFO: renamed from: v9 */
    public final void m2882v9() {
        if (this.f1640s2 && m2777ea() && CoreModule.K().sg(((DbObject) this.f1602j2).id)) {
            m2626I8();
        }
    }

    /* JADX INFO: renamed from: va */
    public final /* synthetic */ void m2883va() {
        act().finish();
    }

    /* JADX INFO: renamed from: vb */
    public final /* synthetic */ void m2884vb() {
        if (u59.U()) {
            if (m2719V9()) {
                act().setResult(SwipeDirection.REMOVE.getValue());
            }
            m1521N6();
        } else if (TextUtils.equals("home_card", this.f1645t3) || m2777ea() || m2682Q9() || TextUtils.equals("home_moment_theme_card", this.f1645t3)) {
            m2626I8();
        }
    }

    /* JADX INFO: renamed from: vc */
    public final /* synthetic */ void m2885vc(View view) {
        m2847pd(this.f1602j2);
    }

    /* JADX INFO: renamed from: vd */
    public final void m2886vd() {
        if ("home_card".equals(this.f1645t3) || "home_moment_theme_card".equals(this.f1645t3)) {
            this.f1439B1 = false;
            this.f1670z3 = "swipe";
            return;
        }
        if ("conversation_view".equals(this.f1645t3)) {
            this.f1670z3 = "conversationlist";
            return;
        }
        if ("messages_thumbnail_right".equals(this.f1645t3) || "messages_thumbnail_left".equals(this.f1645t3) || "messages_title".equals(this.f1645t3) || "message_ice_break_dialog".equals(this.f1645t3) || "messages_friend_comment_toast".equals(this.f1645t3) || "profile_bubble".equals(this.f1645t3)) {
            this.f1670z3 = "conversation";
        } else if ("moments_in_profile".equals(this.f1645t3)) {
            this.f1670z3 = "personal_album";
        } else if ("home_menu".equals(this.f1645t3)) {
            this.f1670z3 = "main_menu";
        }
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: w3 */
    public View mo2887w3() {
        return this.f1440B2.f1823C;
    }

    /* JADX INFO: renamed from: wa */
    public final /* synthetic */ void m2888wa(final User user, Relationship relationship) {
        User userQ9 = CoreModule.c.e0.Q9(((DbObject) user).id);
        if (userQ9 != null) {
            user = userQ9;
        }
        if (NullChecker.a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.c.U.a(new d30() { // from class: l.yz90
                public final void call() {
                    qib0.k0.d.upsert(user);
                }
            });
        }
        e51.H(act(), new Runnable() { // from class: l.zz90
            @Override // java.lang.Runnable
            public final void run() {
                this.f23678a.m2883va();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: wb */
    public final /* synthetic */ void m2889wb() {
        this.f1540V.scrollBy(0, ProfileImagesItemHolder.f1819k1);
    }

    /* JADX INFO: renamed from: wc */
    public final /* synthetic */ void m2890wc() {
        zvf0.r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.c.B0.s4(), "pending")) {
            CoreDlg.G1(act(), act().string(R.string.Jr), act().string(R.string.Ir), x2c0.vj, act().string(R.string.xr), (d30) null, false, (String) null, (d30) null, (d30) null, (User) null, true, false, (String) null, (d30) null, !this.f1620n3);
        } else {
            tvf.h(act(), "dialog");
        }
    }

    /* JADX INFO: renamed from: wd */
    public String m2891wd() {
        return m2838oa() ? grk.b(this.f1661x3) : "";
    }

    /* JADX INFO: renamed from: x8 */
    public View m2892x8(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l9a0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: xa */
    public final /* synthetic */ void m2893xa(final User user, final Relationship relationship) {
        e51.y(new Runnable() { // from class: l.j5a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13582a.m2888wa(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: xb */
    public final /* synthetic */ void m2894xb(String str, List list) {
        if (vwb.J(list)) {
            mo1575o();
        } else {
            ft4.b().k(act(), str);
        }
    }

    /* JADX INFO: renamed from: xc */
    public final /* synthetic */ j760 m2895xc(List list) {
        return vwb.Y(list, BookMoviesDramasHelper.l(userId()));
    }

    /* JADX INFO: renamed from: xd */
    public final void m2896xd() {
        if (NullChecker.a(this.f1573c1) && this.f1573c1.getVisibility() == 0) {
            zvf0.x("e_push_profile_hello", "p_push_profile");
        }
        if (NullChecker.a(this.f1555Y) && this.f1555Y.getVisibility() == 0) {
            if (NullChecker.a(this.f1560Z) && this.f1560Z.getVisibility() == 0) {
                zvf0.x("e_push_profile_dislike", "p_push_profile");
            }
            if (NullChecker.a(this.f1454E0) && this.f1454E0.getVisibility() == 0) {
                zvf0.x("e_push_profile_superlike", "p_push_profile");
            }
            if (NullChecker.a(this.f1506O0) && this.f1506O0.getVisibility() == 0) {
                zvf0.x("e_push_profile_like", "p_push_profile");
            }
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: y0 */
    public String mo2897y0() {
        return m2838oa() ? grk.a(this.f1661x3, this.f1665y3) : "";
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: y1 */
    public View mo2898y1() {
        return (View) m2786fd(this.f1440B2.f1886z);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: y2 */
    public boolean mo2899y2() {
        if (!m9270s() || this.f1624o3) {
            return och0.f() && !this.f1624o3 && TextUtils.equals(this.f1645t3, "home_card");
        }
        return true;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: y3 */
    public void mo2900y3(j760<Integer, Integer> j760Var) {
        this.f1552X1 = j760Var;
    }

    /* JADX INFO: renamed from: y4 */
    public void m2901y4() {
        ValueAnimator valueAnimator = this.f1608k3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super/*com.p1.mobile.android.app.Frag*/.y4();
    }

    /* JADX INFO: renamed from: y8 */
    public void m2902y8(int i, Intent intent) {
        if (NullChecker.a(intent)) {
            intent.putExtra("currentImageIndex", mo2761c0());
            int iMo2761c0 = mo2761c0();
            int size = this.f1602j2.pictures.size();
            User user = this.f1602j2;
            if (iMo2761c0 < size) {
                intent.putExtra("currentImageUrl", ((Media) user.pictures.get(mo2761c0())).url);
            } else {
                intent.putExtra("currentImageUrl", user.hasPic() ? ((Media) this.f1602j2.fp()).url : "");
                CrashHelper.c(new Exception("ProfileListFrag user pictures get index crash on acfFinish"));
            }
        }
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: y9 */
    public final void m2903y9() {
        ih90 ih90Var = new ih90();
        int visibility = this.f1555Y.getVisibility();
        xdl0.p0(this.f1555Y);
        ih90Var.m15149a(this.f1516Q0);
        ih90Var.m15150b();
        RelativeLayout relativeLayout = ih90Var.f13235a;
        this.f1555Y = relativeLayout;
        this.f1605k0 = ih90Var.f13237c;
        this.f1560Z = ih90Var.f13236b;
        this.f1506O0 = ih90Var.f13243i;
        this.f1511P0 = ih90Var.f13244j;
        this.f1460F0 = ih90Var.f13240f;
        this.f1454E0 = ih90Var.f13239e;
        this.f1626p0 = ih90Var.f13238d;
        this.f1466G0 = ih90Var.f13241g;
        this.f1471H0 = ih90Var.f13242h;
        relativeLayout.setVisibility(visibility);
        this.f1550X.setVisibility(visibility);
        if (TextUtils.equals("home_card", this.f1645t3) && NullChecker.a(this.f1602j2) && CoreModule.c.m0.L6(((DbObject) this.f1602j2).id)) {
            xdl0.M(this.f1555Y, false);
            xdl0.M(this.f1521R0, true);
        }
        m2686Qd();
    }

    /* JADX INFO: renamed from: ya */
    public final /* synthetic */ void m2904ya(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            lsi0.y(String.format("喜欢已发送，%s将收到你的喜欢", this.f1602j2.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: yb */
    public final /* synthetic */ void m2905yb(Throwable th) {
        mo1575o();
    }

    /* JADX INFO: renamed from: yc */
    public final /* synthetic */ void m2906yc(j760 j760Var) {
        this.f1619n2 = j760Var;
        mo1515J3();
    }

    /* JADX INFO: renamed from: z8 */
    public final void m2907z8() {
        if (TextUtils.equals(this.f1645t3, "from_portrait_like_list") || TextUtils.equals(this.f1645t3, "from_city_center_conv_banner") || TextUtils.equals(this.f1645t3, "from_city_center_boost_cover") || TextUtils.equals(this.f1645t3, "impress_signal") || TextUtils.equals(this.f1645t3, "from_pin_like") || this.f1640s2) {
            return;
        }
        if (NullChecker.a(this.f1555Y) && (this.f1555Y.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1555Y.getLayoutParams();
            layoutParams.bottomMargin = t100.d(72.0f);
            this.f1555Y.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1593h1.getLayoutParams();
            marginLayoutParams.bottomMargin = t100.d(72.0f);
            this.f1593h1.setLayoutParams(marginLayoutParams);
        }
        boolean zEquals = false;
        this.f1573c1.setVisibility(0);
        if ("liked_users".equals(this.f1645t3) || m2739Y9() || m2746Z9() || m2696S9()) {
            LikedUser likedUserC3 = CoreModule.c.Z0.C3(this.f1616m3);
            if (likedUserC3 == null && NullChecker.a(this.f1469G3)) {
                likedUserC3 = this.f1469G3;
            }
            if (NullChecker.a(likedUserC3)) {
                zEquals = TEnum.equals(likedUserC3.status, "superliked");
            }
        }
        this.f1573c1.I(zEquals);
        if (CoreModule.K().getUserById(this.f1616m3) == null) {
            NullChecker.a(this.f1479I3);
        }
        this.f1573c1.C(act(), this.f1645t3, this.f1616m3, new u2a0(this), m2891wd());
        this.f1662x4.mo14451a(new d30() { // from class: l.d1a0
            public final void call() {
                this.f9019a.m2577Aa();
            }
        });
    }

    /* JADX INFO: renamed from: z9 */
    public final void m2908z9() {
        CoreBusinessModule.m0().h(this.f1631q1);
        xdl0.M(this.f1631q1.f1972d, false);
        final d30 d30Var = new d30() { // from class: l.y0a0
            public final void call() {
                this.f22563a.m2609Fb();
            }
        };
        this.f1631q1.setEditCallBack(d30Var);
        this.f1440B2.mo14451a(new d30() { // from class: l.z0a0
            public final void call() {
                this.f23156a.m2615Gb(d30Var);
            }
        });
        if (this.f1620n3) {
            return;
        }
        final d30 d30Var2 = new d30() { // from class: l.a1a0
            public final void call() {
                this.f7336a.m2663Nb();
            }
        };
        this.f1440B2.mo14451a(new d30() { // from class: l.c1a0
            public final void call() {
                this.f8453a.m2669Ob(d30Var2);
            }
        });
        this.f1631q1.setMoreCallBack(d30Var2);
        mo2867t1();
    }

    /* JADX INFO: renamed from: za */
    public final /* synthetic */ void m2909za(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: zb */
    public final /* synthetic */ void m2910zb(roj0 roj0Var) {
        mo1575o();
    }

    /* JADX INFO: renamed from: zc */
    public final /* synthetic */ void m2911zc(View view) {
        zvf0.r("e_user_info_greet_to_city_cover", pageId());
        d.e(act(), this.f1529S3.userId);
    }

    /* JADX INFO: renamed from: zd */
    public final void m2912zd() {
        this.f1631q1.setVisibility(0);
        if (!this.f1624o3) {
            this.f1631q1.m3511k(this.f1602j2, this.f1645t3, this.f1612l3, mo1527R0());
            return;
        }
        boolean z = this.f1612l3;
        if (z) {
            this.f1631q1.m3511k(this.f1602j2, this.f1645t3, z, mo1527R0());
        }
    }
}
